# 原生层：`libsoter.dll`

这是本工程**最大的未解项**，也是最需要接力者投入的地方。

---

## 1. 已确认的静态事实

| 项 | 值 |
|---|---|
| 容器位置 | `Flux.jar!/META-INF/Soter`（另有 `META-INF/Soter32` 供 32 位 JVM） |
| 大小 | 50,531,856 字节 |
| SHA-256 | `7BF3B5A135152A6ECBA93D275AA817E7070217E855D15DE543E27222364F1404` |
| 类型 | PE32+ x86-64 DLL |
| ImageBase | `0x62180000` |
| EntryPoint RVA | `0x4F9C058` → `0x6711C058`（落在 `.boot`） |
| 导出表 | **仅 `JNI_OnLoad`**（`0x6225A750`） |
| 导入表 | **仅 2 个**：`kernel32!GetModuleHandleA`、`msvcrt!__iob_func` |
| 载入者 | `v6ma`（JAR 内唯一调用 `System.load` 的类） |

### 段表

| 段 | 虚拟大小 | 磁盘大小 | 判断 |
|---|---|---|---|
| `.boot` | 49,501,184 | 49,501,184 | **真实代码在这里** |
| `.winlice` | 82,329,600 | **0** | 运行时才展开 |
| 其余 | 常规 | 常规 | — |

### 加壳证据

* 导入表只有 2 个函数 —— 正常 DLL 不会这样，说明真实导入表在运行期由 stub 重建。
* `.winlice` 虚拟大小 82 MB / 磁盘 0 字节 —— 典型的运行期解压目标段。
* 自动分析结论：**Ghidra 分析 600 秒，只识别出 4 个函数**（`JNI_OnLoad`、`entry` 等）。
  正常的 50 MB 原生模块会有数万个函数。

**结论：静态反编译这条路在当前形态下不可行。**

---

## 2. 这个模块承担了什么

由 Java 侧交叉定位：

| 职责 | Java 侧证据 |
|---|---|
| 全部 HTTP | `cfu.p6w(java.net.URL)Ljava/lang/String;` 是唯一的 HTTP 入口 |
| 全部加解密 | `an9.jrp([B)String` / `an9.otn(String)[B` / `an9.hsw([BI)B` |
| 摘要 / 签名 | `kgt.vyp(String,String)J`（两串入、一 long 出）；`j1s.ixy(String,String)I`（疑似比对） |
| 登录动作 | `qih.mjy()`、`qih.mouseClicked(int,int,int)` |
| IRC 回调 | `prq` 的 6 个 native 方法，含 `onLoggedEvent(LoggedPacket)` |
| 反篡改门禁 | `v6ma.Ex(int)`，被 14 个类的 `<clinit>` 调用 |
| 疑似机器指纹 | `dr9.if3()Ljava/lang/String;`（无参 → String） |
| 其余 | 41 个 native 方法分布在 17 个类，完整清单见 `mappings/native.yaml` |

**一个 JNI 模块服务全部 native 方法**这一点由两件事证实：
（a）`System.load` 在 Flux.jar 内只被 `v6ma` 调用；
（b）`v6ma.UI()` 由 `Main` 调用，负责释放并加载。

---

## 3. 为什么静态分析停在这里

真实逻辑在 `.boot` 段里，但它不是"明文代码" —— 入口 stub 会：

1. 解密/展开 `.winlice`（82 MB 的虚拟段）；
2. 重建导入表；
3. 把控制权交给 `.boot` 中解压后的真实代码。

在没跑起来之前，`.boot` 里的字节对反汇编器来说就是数据。
改 `.winlice` 的虚拟大小为 0 也不能让静态分析看到真实代码 —— 需要**运行期 dump**。

---

## 4. 下一步的具体做法（给接力者）

按投入产出比排序：

### 方案 A：运行期内存 dump（推荐）

```
1. 让 v6ma 在同一路径释放 DLL，但不要 System.load 它；
   或者让 System.load 成功后在 JNI_OnLoad 之后立即 break。
2. 在 unpacker stub 完成后、真实代码开始执行时，把整个模块的内存镜像
   dump 成文件（ImageBase 到 ImageBase+SizeOfImage）。
3. 把 dump 重新按 PE 加载：修复节表（把 .boot/.winlice 的实际大小写回）
   并重建导入表，然后喂给 Ghidra。
```

关键点：**必须在 stub 完成后、且代码段已被解密后**取快照。
取早了拿到的是密文，取晚了可能被二次加密回去。

### 方案 B：还原 unpacker stub

`JNI_OnLoad → 0x6225A750` 和 `entry → 0x6711C058` 是仅有的两个可读入口。
把这两个函数逐指令读完（它们没被混淆），可以逆出解压算法，
然后在本地离线展开 `.boot`。成本比 A 高，但产出的镜像更干净。

### 方案 C：动态观察

不还原代码，只在运行时观察行为（JNI 注册表、被调用的 Java 方法、
网络报文的明文形态）。这能回答"HWID 从哪来、怎么上报"，
但回答不了"算法是什么"。

### 需要先答的小问题

* `v6ma.Ex(int)` 的参数（各个类传的值不同：`13`、以及其它）是什么语义？
  是一个"检查点编号"表吗？
* `JNI_OnLoad` 里 `RegisterNatives` 注册了哪些方法名？
  （这能立刻把 41 个 Java native 声明与原生函数对上号，
  是**性价比最高的一次 dump**，只需要读注册表，不需要完整脱壳。）

---

## 5. 不要做的事

* **不要 `System.load` 这个模块去做"看看会发生什么"** ——
  它是反篡改 + 反作弊组件，行为不可预期。
* **不要在贡献流程里启动完整客户端** —— 见 `NOTICE.md`。
* **不要对它联网** —— 模块里包含全部 HTTP 实现，
  一旦加载就可能主动外连到分析中列出的端点。
