# ZKM 12 字符串解密：可复现配方

这篇是本工程最值得复用的部分。它不依赖 Flux 的任何细节，
对任何 **Zelix KlassMaster 12.x** 混淆的 Java 样本都适用
（8.x / 9.x 的常量表编号方案不同，需要调 `0x23F0` 那个魔数与表布局）。

结论先行：**不要重写密码学，让目标自己去解密。**
你只需要（a）静态提取每个调用点的 `(n, l)`，然后（b）在 JVM 里让那个类
用**自己的**解密函数把表填好，再读出来。重写 DES 只会给你带来字节序和
modified-UTF8 的坑。

---

## 1. 结构

每个类的 `<clinit>` 干三件事（以 `ar7` 为例，反汇编已验证）：

```
  0: c.g()                                  // MethodHandles.lookup()
  3: c.a(L1, L2, ar7.class)                 // 生成调用点
 31: putstatic b:J                          // ← 本类密钥（long）
 56: Cipher.getInstance("DES/CBC/PKCS5Padding")
     Cipher.init(DECRYPT, new SecretKeySpec(keyBytes, "DES"), new IvParameterSpec(new byte[8]))
134: anewarray String                       // 密文表（此处 4 项）
...(逐项填充密文，每项来自 ldc / 字符串拼接)...
284: putstatic c:[Ljava/lang/String;
291: putstatic d:[Ljava/lang/String;        // ← 解密缓存，初始全 null
297: loop { d[i] = a(cipher.doFinal(c[i].getBytes("ISO-8859-1"))).intern(); }
336: v6ma.Ex(13)                            // ← 原生反篡改，在表构建【之后】
```

调用点形态：

```
sipush   <n>                 // 表内下标（已被混淆器做过一次混淆）
ldc2_w   <K>                 // 常量
lload N  (= classKey ^ K0)   // 或者 getstatic b:J
lxor                         // → l = classKey ^ acc
invokedynamic #X, 0          // e:(IJ)Ljava/lang/String;
```

解密函数本身是公开的、可读的：

```java
int  n2 = n ^ (int)(l & 0x7FFF) ^ 0x23F0;      // 表下标还原
byte[] key = 大端(l 的低 8 字节);                 // DES 密钥就是 l
byte[] pt  = DES_CBC_decrypt(table[n2], key, IV = 8 个零字节);
String s   = modifiedUTF8_decode(pt);           // 注意不是标准 UTF-8
```

`modifiedUTF8_decode` 的差别只在：`0xC0 0x80` 表示空字符，以及**补充平面字符
以 CESU-8 形式编码**（两个 3 字节序列，而非标准的 4 字节序列）。

---

## 2. 三个坑（都踩过）

### 坑 1 —— 密钥是进程全局状态，必须每个类一个类加载器

ZKM 把密钥派生放在 `c` 这个共享类里，并用一个**进程级的静态状态**参与运算。
如果你用一个 `URLClassLoader` 连续加载 900 个类，从第二个类开始就会拿到错的密钥，
表现为大面积 `BadPaddingException` / `IllegalBlockSizeException`。

修法：**每个类一个全新的 `URLClassLoader`**：

```java
for (String cls : classes) {
    try (URLClassLoader l = new URLClassLoader(new URL[]{jar.toURI().toURL()}, parent)) {
        Class<?> c = Class.forName(cls, true, l);
        // c 的 <clinit> 已经把它自己的表解密好了
    } catch (Throwable t) { /* 记下来，下一轮重试 */ }
}
```

实测效果（同一份样本）：

| 阶段 | 恢复字符串 | 覆盖类 |
|---|---|---|
| 共享类加载器 | 1,806 | 94 |
| 独立类加载器 | 9,565 | 606 |
| 独立加载器 + 中和原生门禁 | **14,315** | **945** |

### 坑 2 —— 原生门禁在表构建之后，所以可以绕过

`v6ma.Ex(int)` 由 JNI 库实现。缺库时类初始化会在**表已经填好之后**抛
`UnsatisfiedLinkError`，所以静态改写掉这个调用即可让 `<clinit>` 跑完：

```
invokestatic v6ma.Ex(I)V      (3 字节 b8 xx xx)
      ↓
pop; nop; nop                 (3 字节 57 00 00)   ← 栈中性
```

### 坑 3 —— 有些类在走到字符串表之前就会因为别的原因挂掉

Minecraft 的注册表门禁（`Accessed Blocks before Bootstrap!`）会在
`Block.<clinit>` 里抛异常，轮到字符串表时已经太晚。对策：
**多轮重试**，并在每轮把新成功的类记下来；对少数类先注册 MC 的 Bootstrap。
本次有 1,779 个调用点最终仍未能解密，绝大多数属于这一类。

---

## 3. 完整复现步骤

```powershell
# (1) 提取所有加密调用点 → callsites.tsv
python tools/callscan.py <workdir>/FluxClasses <workdir>/index

# (2) 中和原生门禁（否则大量类无法离线初始化）
python tools/patch_native.py <workdir>/FluxClasses <workdir>/FluxClasses_patched v6ma Ex (I)V
# 打出一个只包含被改类的补丁 jar
<重新打包为 Flux_patched.jar>

# (3) 用 JVM 夹具调用目标自己的解密函数，导出全部明文
java -cp "tools/classes;libs/*" DumpStrings `
     index/callsites.tsv plain2 30000 Flux_patched.jar

# (4) 生成映射表
python tools/gen_mappings.py <workdir> <workdir>/FluxClasses mappings

# (5) 把明文写回反编译源码，便于阅读
python tools/annotate.py <workdir>/src <workdir>/src_ann <workdir>/plain2/strings_plain.tsv
```

### `callscan.py` 需要处理的指令细节

静态提取的难点全在**指令长度**上。踩过的坑：

* `ldc`（`0x12`）操作数是 **1 字节**，`ldc_w`（`0x13`）是 2 字节，`ldc2_w`（`0x14`）是 2 字节。
  混淆器三种都会用。
* `newarray`（`0xbc`）操作数是 1 字节（atype）。
* `wide`（`0xc4`）会把它后面的指令长度整体放大，必须特判。
* `tableswitch` / `lookupswitch` 有 0~3 字节的对齐填充。
* **操作数长度通常不含操作码本身**，算下一条指令地址时别忘 `1 + len`。
  这个错误会静默地把指令流解错位，产生看起来合法的假操作码（`0xdd`、`0xd4`…）。

### `DumpStrings.java` 的两条路径

1. **正常路径**：类初始化成功后，反射读静态字段（`c` 密文表 / `d` 缓存表）。
   字段名本身也被混淆了，所以按**类型**找：`static String[]` 且长度与调用点数吻合。
2. **Unsafe 路径**：类初始化失败（原生门禁、注册表门禁）时，用
   `sun.misc.Unsafe.staticFieldBase/staticFieldOffset/getObject` 直接读
   已经填好的密文表，然后**只自己实现内层 DES + modified-UTF8**。
   这条路是"重写密码学"，但范围被压到最小：外层表下标和密钥派生仍然来自目标。

> 注意：`Unsafe` 路径里"没找到已填充的静态 String[]"这类诊断状态**不能用静态字段存**，
> 否则会被后续类的同类诊断覆盖，产生误导性的日志。用 `ThreadLocal` 或每次调用重新计算。

---

## 4. 怎么确认你解对了

* 明文里应该出现成片的、语义连贯的字符串（HTTP 头、i18n key、UI 文案）。
  如果出现大量看起来像随机 ASCII 的东西，密钥大概率是错的。
* 抽查一个 `ldc2_w` 常量：`l` 的低 8 字节应当是一个"看起来随机但固定"的 DES 密钥。
* 交叉验证：同一个字符串常在多个类里出现（比如 `Content-Type`），
  统计重复率能立刻看出解密是否成功。
