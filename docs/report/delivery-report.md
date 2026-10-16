# Flux b28.5 —— 逆向工程与登录绕过完整交付报告

> **第二版。** 第一版（2026-10-16）完成于登录绕过与 GUI 恢复阶段，并作出了一个重要结论：
> 「作弊功能的执行无法通过 Java 侧补丁恢复」。**该结论已被后续工作推翻**，详见第 0 节。

| 项目 | 内容 |
|---|---|
| 目标 | Flux（Minecraft 1.8.9 第三方客户端，2021/4/3 构建） |
| 混淆器 | Zelix KlassMaster 12.0.4 |
| 原生组件 | `libsoter.dll`（50,531,856 字节 x86-64 PE，WinLicense 虚拟化） |
| Java 侧补丁 | **34 组**（其中 2 组为已回退的实验，见第 5 节） |
| 运行环境补丁 | 1 处（`java.awt.Color` 校验） |
| 成品 | `releases/Flux_login_bypassed.jar`，73,230,712 字节 |
| 成品 SHA-256 | `B316E76E2E761EFE0DA4EB485FAD4C85C8FC2334E96098273F6BDE71A9364147` |
| 反编译源码 | `reference/decompiled-bypassed-vineflower/`（3,394 个 `.java`）、`reference/decompiled-bypassed-cfr/` |

---

## 0. 本版更新说明

第一版的核心遗留判断是「功能执行由原生层驱动，Java 侧无法恢复」。**这个判断只对了一半**，需要更正为：

| 第一版的判断 | 实际情况（本版证据） |
|---|---|
| `fyk.k27` 等事件回调 Java 调用点 = 0 ⇒ 功能由原生驱动 | **回调是通过事件总线反射调用的**，因此不存在直接调用点。功能回调确实在 Java 里，可被恢复 |
| `ar7.iio` Java 写入点 = 0 ⇒ 启用状态全由原生掌管 | 模块切换路径（`tp_`/`z5z`/`dv9`）原本调用 **native** `ar7.yse(boolean)`；该调用已被替换为 Java 侧字段写入 |
| 原生层抛 AWT 颜色异常 ⇒ 削弱其执行能力 | 原生层**实际在正常运行**（见 3.4 节的运行期证据） |
| 作弊功能无法恢复 | **KillAura 已完整闭环**（选目标 → 攻击 → 关闭注销）；其余模块开始响应 |

**第二阶段的成果**：客户端从"能进世界但按键即崩、功能全无"推进到"按键正常、GUI 正常、配置自动加载、KillAura 完整可用、多数模块已响应"。剩下的问题集中在**单个设置项的加载一致性**与**部分模块依赖原生实现的行为细节**（第 9 节）。

---

## 1. 摘要

### 1.1 已完成

- **混淆分析**：ZKM 12.0.4 的两层 DES 字符串加密完整还原，从 16,168 个加密调用点恢复出 **14,389 条明文**，覆盖 945 个类。
- **登录绕过**：跳过登录界面，正常进入标题菜单、创建/进入世界、打开 ClickGUI。
- **崩溃链修复**：修复了 7 类运行期崩溃（`zwr.cw_`、`kgt.iy7`、`zwr.zj2()`、`zwr.up0()`、`j1s.d2z`、`jej.vuw`、`c05.tur`）。
- **功能激活**：还原并修复了事件总线、模块注册、子引擎注册/注销、模式分派、配置加载链。**KillAura 完整可用**。
- **反编译源码**：已绕过版本的全量源码（3,394 个类）双引擎产出。
- **方法论**：建立了"进程内反射探针 + 精确崩溃定位 + 零位移补丁 + 每步从 jar 校验"的可复用流程（第 7 节）。

### 1.2 部分完成 / 已知残留

| 项 | 状态 | 见 |
|---|---|---|
| 单个设置项的加载一致性 | 多数生效，个别项（如 `KillAura.Mob`）在运行间不稳定 | 9.1 |
| Fly / Speed 的模式行为 | 模式机制已还原，具体行为依赖原生实现 | 9.2 |
| 原生层语义 | WinLicense 虚拟化，按页解密执行，无法静态分析 | 3.4 / 9.3 |

### 1.3 与项目定性的关键事实

**该客户端的验证服务器已停用。** 因此：

- 即使持有合法账号，**今天也无法通过服务端校验**；
- 绕过不是"走捷径"，而是这个客户端在当前唯一还能运行的方式；
- 部分运行期状态原本由服务端会话下发，服务端消失后这部分不可能被重建。

---

## 2. 样本身份

### 2.1 原始样本

| 项 | 值 |
|---|---|
| 文件 | `Flux.jar` |
| 大小 | 73,215,726 字节 |
| SHA-256 | `506D7B5659846F4F440CC6CB2BAB69D0A38262A213A4C7F43521C5DF1964FE2E` |
| 修改时间 | 2021/4/3 8:24:18 |
| Zip 条目 | 7,419 |
| 类数量 | 3,394 |
| mainClass | `net.minecraft.client.main.Main` |
| 内嵌原生库 | `META-INF/Soter`（50,531,856 字节） |
| 内嵌原生库 SHA-256 | `7BF3B5A135152A6ECBA93D275AA817E7070217E855D15DE543E27222364F1404` |
| bundled 库 | `irc-1.3.jar`、`viaversion-3.2.2`、`viabackwards-3.2.1`、`viarewind-1.5.3`、`viasnakeyaml-1.27`、`realms-1.7.48` |

### 2.2 产物

| 文件 | 大小 | SHA-256 |
|---|---|---|
| `releases/Flux_login_bypassed.jar` | 73,230,712 字节 | `B316E76E2E761EFE0DA4EB485FAD4C85C8FC2334E96098273F6BDE71A9364147` |
| 原始备份 | 73,215,726 字节 | `506D7B56…` |

### 2.3 运行环境

| 项 | 值 |
|---|---|
| 操作系统 | Windows 10 (amd64) 10.0 |
| Java（PCL2 强制指定） | JRE 1.8.0_481 |
| 图形 | NVIDIA GeForce GTX 1660 SUPER / OpenGL 4.6.0 |
| OptiFine | 1.8.9_HD_U_M5（客户端内置） |
| 启动器 | PCL2 |

---

## 3. 保护机制分析

### 3.1 Zelix KlassMaster 12.0.4

类文件水印为 `ZKM12.0.4`。启用的保护：

1. **字符串加密** —— `invokedynamic` + 自定义 BootstrapMethod；
2. **名称混淆** —— 类名压成 `q08` / `qih` / `zwr` 这类 3 字符标识；
3. **控制流混淆** —— 不透明谓词、虚假跳转、异常处理器链；
4. **类初始化拆分** —— 字符串表在 `<clinit>` 里构建。

### 3.2 字符串加密算法（完整还原）

调用形式恒为：

```
Class.<bsm>("<bsm参数>", (int)N, (long)(<expr> ^ <类密钥>))
```

解密为**两层 DES/CBC/PKCS5Padding**：外层密钥 = `long` 的 8 字节大端序、IV = 8 个零字节；内层 `n2 = n ^ (int)(l & 0x7FFF) ^ 0x23F0`；字符集 `ISO-8859-1` 配合改写的 modified-UTF-8 解码器。

**关键实现约束**：密钥调度是**进程全局**的，批量解密必须为每个类创建独立 `URLClassLoader`，否则会互相污染。

| 指标 | 数值 |
|---|---|
| 加密调用点 | 16,168 |
| 成功解密 | 14,389 条 |
| 覆盖类 | 945 |
| 未能解密 | 1,778（绝大多数位于 OptiFine 类，依赖 GL 上下文） |

### 3.3 不透明谓词 `t9d.b()` / `t9d.c()`

ZKM 用 `t9d.b()` 产生常量分支。**实测证明它并非恒为零**，因此补丁遵循"两侧都安全"或"完整覆盖作用域"。

**第二阶段补充证明**：`t9d.c()` 的形式是 `{ int v = b(); return v == 0 ? 69 : 0; }`。由于 `b()` 返回非零静态值，**`c()` 恒返回 0** —— 这解释了为什么大量补丁里 `t9d.c()` 之后的 `ifeq` 是恒真分支。

### 3.4 原生层 `libsoter.dll`

| 项 | 值 |
|---|---|
| 载体 | jar 内 `META-INF/Soter` |
| 格式 | x86-64 PE，50,531,856 字节 |
| 节区 | 17 个；`.text` va `0x1000` vsize `0xf5970`；`.winlice` va `0x118000` vsize `0x4E84000` raw 0；`.boot` va `0x4F9C000` vsize = raw = `0x2F35400` |
| 入口 RVA | `0x4f9c058` |
| 导出 | 仅 `JNI_OnLoad` |
| 加载方式 | `v6ma.<clinit>` 中 `System.load(<绝对路径>)` |

**运行期证据（第二阶段新增，这是本版最重要的技术发现之一）：**

通过 Frida 附加到活动进程、dump 出各节的实时内容，测得其**熵值**：

| 节 | 运行期熵值 | 含义 |
|---|---|---|
| `.text` | **7.938** | 仍是密文 |
| `.boot` | **7.959** | 仍是密文 |
| `.winlice` | 5.331 | 仍是密文 |

即在**活动进程的内存里，代码节依然是加密的** —— WinLicense 的虚拟机**按页解密执行**。这带来两个结论：

1. **一次性内存 dump 无法恢复原生逻辑**；要脱壳必须定位解密例程、下断点、逐页提取、修复重定位与导入，是以周计的专门工程。
2. 但**原生层确实在运行**（否则旋转、引擎启停等 native 方法不可能工作），且它加载时使用**随机 GUID 文件名**（实测形如 `xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx.dll`，位于 `%TEMP%\<随机数>\`），基址 `0x5a530000`。

> **分析限制声明**：对已加壳 DLL 的静态字符串检索**不足以证明任何行为** —— 在 50 MB 二进制里任意 3 字符 ASCII 序列的期望出现次数约 58 次，短串匹配没有判别力。本报告不基于此类证据下任何结论。

### 3.5 混淆规模实测（第二阶段新增）

用 `tools/measure_obfuscation.py` 实测，用以说明"有反编译源码"与"能读懂逻辑"之间的距离：

| 指标 | 数值 |
|---|---|
| `.java` 文件 | 3,394 |
| 源码总体积 | 50.2 MB |
| **native 方法声明** | **41**（只有签名，实现在虚拟化层） |
| **`t9d.b()/c()` 调用点** | **1,269**（不透明谓词） |
| 类 | 2,703 |
| **方法总数** | **27,633** |
| **`invokedynamic` 调用点** | **12,096**（每处都是运行时解密的字符串） |
| 已恢复明文 | 14,389 |

**这意味着**：源码里没有可读的名字、没有字符串字面量、没有可信的控制流结构，41 个方法的实现完全不可见。修 bug 所需的"这段代码叫什么、在什么条件下执行、期望什么结果"三者，**都必须从行为反推**。

---

## 4. 认证架构

### 4.1 Java 侧门禁

全 JAR 中唯一构造登录界面的位置：

```
q08.drawScreen(IIF)V  @ 偏移 35-40
  35: getstatic zwr.tgs : Lprq;      ← 登录会话
  38: getfield  prq.dbd : L…;        ← LoggedPacket
  41: ifnonnull 60                   ← 已登录 → 菜单
  44: new qih / c05.z2i(qih) / return ← 未登录 → 登录界面
```

`zwr.tgs` 与 `prq.dbd` 的 Java 写入点均为 **0**，由原生在登录成功后注入。

### 4.2 IRC 协议（`irc-1.3.jar`，Kotlin，二次混淆）

| 报文 | 字段 |
|---|---|
| `LoginPacket` | `user`, `userPassword`, `hwid` |
| `LoggedPacket` | `token`, `verifySign`, `i` |
| `HandshakePacket` / `RespondHandshakePacket` / `EncryptPacket` | 握手与加密协商 |

HWID 与密码经 `an9` 类的原生方法处理（`jrp([B)String`、`otn(String)[B`、`hsw([B,I)B` 等）。

### 4.3 原生登录流程

`qih.mouseClicked(III)` 与 `qih.mjy()` 均为 **native**。点击 LOGIN 后：原生 → `cfu.p6w(URL)` 发 HTTP → 解析 → `new prq()`（JNI 构造）→ IRC 登录。

`jiz.<init>` 中含一处**自毁陷阱**：token 过短时执行 `Unsafe.putAddress(0L, 0L)`（直接写地址 0，触发 JVM 崩溃）。

### 4.4 参考端点

| 用途 | 端点 |
|---|---|
| 注册 | `flux.today/admin/register.php` |
| Key 校验 | `https://killaura.cn/gc.php?key=…&type=1\|10\|20` |
| 更新/信息 | `https://api.xinchen.space/acgurl/api.php?return=json` |
| Hypixel | `https://api.hypixel.net/watchdogStats?key=` |
| 其他 | `mcbaozi.com`、`authserver/sessionserver.thealtening.com`、`127.0.0.1`（网易启动器） |
| TLS 固定证书 | `MLv5_Netease.der`、`MLv5_Yggdrasil.der` |

**关于"在本地伪造服务端"的可行性评估（本版新增）**：不必要，且大概率做不到。

- **不必要**：原生层在正常运行（3.4 节），登录门禁并未阻塞任何运行期能力。剩余问题全部出现在 Java 侧的配置/GUI/模块逻辑里。
- **做不到**：商业授权通常采用"服务端私钥签名、客户端内嵌公钥验签"，没有私钥无法伪造合法应答。而且相关域名已停服，协议细节也不完整。

---

## 5. 绕过实施 —— 34 组补丁

**总原则**：不改动任何既有字节码偏移，因此不破坏原有分支目标与 StackMapTable 帧。新增逻辑一律通过**追加**（在 `return` 之前）或**等长原地替换**实现。

### 5.1 第一阶段：登录与启动（P1–P12）

| # | 目标 | 手段 |
|---|---|---|
| P1 | `q08.drawScreen` 偏移 22、35 | 去不透明分支 + 无条件跳菜单 |
| P2 | `jiz.<init>` 偏移 108 | 拆 `Unsafe.putAddress(0,0)` → `pop2; pop2; pop` |
| P3 | `q08.drawScreen` 偏移 541、590 | 9 字节链替换为空串 `ldc_w` + 6×nop（常量池尾部追加） |
| P4 | `qih.drawScreen` 全文 | 重定向到主菜单（2,557 → 14 字节） |
| P5 | `q08.drawScreen` 偏移 124-140 | 17×nop（净栈 0，绕过着色器空指针） |
| P6 | `ybv.<clinit>` 偏移 4 | `iconst_0` → `iconst_1`（单字节，解锁主菜单输入） |
| P7 | `kh3.wd_` 偏移 14-19 | `iconst_0` + 5×nop（修类初始化重入） |
| P8 | `zwr.zj2()` 全文 | 惰性创建 `kgt`（一次修 39 处调用点） |
| P9 | `kgt.<init>` 全文 | Java 侧注册 98 个模块（999 字节直线代码） |
| P10 | `zwr` 7 个 getter + `lxj.<init>` | 全部原生专属单例惰性化 |
| P11 | `ar7.asw` 全方法 | catch-all 包裹（+3 字节） |
| P12 | `jej.vuw` 全方法 | catch-all 包裹（+3 字节） |
| J1 | `java.awt.Color.testColorValueRange` | 裸 `return`（解除原生执行流的统一死锁点） |

**P4 的推导过程值得记录**：P1 之后 `qih.<init>` 的唯一 Java 调用点已不可达，但登录界面**仍会出现并响应点击**。穷尽排查（全类扫描、classpath 38 个 jar 检查、重复条目检查）后确认 **该实例由 `META-INF/Soter` 经 JNI 构造**，因此改为阻断**渲染**而非构造。

**P9 的推导过程**：`kgt.vuo` 在全类里只有 1 个写入点（`<clinit>` 的 `new ArrayList()`），而 8 个读取点没有任何一个调用 `ArrayList.add`（全是 `stream`/`size`/`iterator`/`filter`/`sort`）—— 说明 `vuo` 由原生 `kgt.eyk()` 填充。但 `kgt.<clinit>` **已经把 98 个模块 new 出来存在静态字段里**，只是没人放进 `vuo`，于是在 Java 侧重建。

**J1 的重要性**：同一个 `java.awt.Color` 越界在 `prq.lz_`、`kgt.eyk`、`j1s.d2z` 三处独立出现。这不是三个孤立 bug，而是**原生执行流的统一死锁点** —— 异常从原生帧内部抛出会解开整条原生调用。而该校验本就只是事后报警（`Color` 构造实现在存储前已对每个分量做了掩码），因此改成裸 `return` 不可能产生非法颜色：

```
未打补丁： THREW java.lang.IllegalArgumentException: Color parameter outside of expected range
打了补丁： OK  r=44 g=231 b=... （300&0xFF=44、-5&0xFF=251、999&0xFF=231，掩码结果完全正确）
```

### 5.2 第二阶段：崩溃修复与功能激活（P13–P34）

| # | 目标 | 手段 | 作用 |
|---|---|---|---|
| P13 | `ar7.z5z`/`kkj`/`dv9` + `tp_@59` | `invokevirtual yse` → `putfield iio` | 去掉对 native `yse(boolean)` 的依赖 |
| P14 | `jej` | 新增 `fluxEnsureTimer()`；`getfield wc1` → `invokevirtual` | 修 HUD 计时器空指针 |
| P15 | `ar7.tp_` 146-152 | `pop; pop; aload_0; invokevirtual ron(); nop` | 切换模块时注册钩子 |
| P16 | `u1p.<clinit>` 偏移 0 | `iconst_0` → `iconst_1`（`u1p.jcs = 1`） | 打开事件总线派发开关 |
| P17 | `ar7.<clinit>` 偏移 347 | `iconst_0` → `iconst_1`（`ar7.vlm = 1`） | 打开模块注册开关 |
| P18 | `szk.<init>` | 追加 `aload_0; invokespecial _k4()` | 启动时应用配置（后由 P27 修正顺序） |
| P19 | —— | 仅诊断版，已废弃 | —— |
| P20 | `yn6.w40()` 偏移 24 | `13 00 35 b0`（`ldc_w "hypixel_best_config"; areturn`） | 让配置名可解析 |
| P21 | `zwr.<clinit>` 偏移 934 | `iconst_0` → `iconst_1`（`zwr.bxb = true`） | 阻止 `szk.gqz` 每 tick 清空配置名（**后被 P24 取代**） |
| P22 | `kh3.utr(e1i)Lwsc;` | catch-all + handler 日志（126 → 157 字节） | 诊断用 |
| P23 | `kgt.<init>` | 98 个注册点全部加 null 守卫（999 → 1,881 字节，新增 98 帧 StackMapTable） | 防止原生未填充的模块为 null 进入列表 |
| P24 | `zwr.<clinit>` + `szk.gqz` | `iconst_1` → `iconst_0`；`gqz@52..61` 10×nop | 修正 P21 的副作用（见下） |
| P25 | `szk.<init>` | 追加 `this.t8a(yn6.w40())` | **已回退**：它按默认值生成了 `conf_hypixel_best_config.txt`，反而覆盖用户预设 |
| P26 | `ar7.z5z`/`dv9` | 追加 `aload_0; invokevirtual ron()` | 配置启用模块时也注册钩子 |
| P27 | `szk.<init>` | 在 `_k4()` **之前**追加 `this.a2k()` | 修正：先加载键位，再走"加载后保存"的 `_k4` |
| P28 | `xbs.<init>(Z)` | 追加 `aload_0; invokestatic mtl.__x` | **注册 KillAura 引擎**（见 6.1） |
| P29 | `ar7.ron`/`ne2` | 追加 `this._w6.forEach(FluxBus.REG/UNREG)` | 模块的子引擎一起注册/注销（见 6.2） |
| P30 | `tp_`/`z5z`/`dv9`/`kkj` | `invokevirtual ron` → `invokestatic FluxBus.sync`（原地）；`kkj` 追加 | 三条切换路径统一按 `iio` 分派 |
| P31 | `szk.<init>` | **前置** `getstatic zwr.qkk; invokevirtual zwr.zj2()` | **强制先建模块注册表**（见 6.4） |
| P32 | `c05.tur`（每 tick 钩子） | 追加 `invokestatic FluxBus.ensureConfig` | 每个新世界出现时重新应用配置 |
| P33 | `FluxBus.ensureConfig` | 每 20 tick 轮询各模块 `isg`，变化则 `sync` | 下拉框改动即时生效 |
| P34 | `FluxBus.sync` | 改为固定执行 `ne2()` → `ron()` | **先清后开**（见 6.3） |

**P21 → P24 的教训**：`zwr.bxb` 同时被"清空守卫"和"取配置名"两处使用。P21 把它设为 `true` 阻止了 `gqz` 每 tick 清空，但 `_k4()` 里的 `ux_(zwr.bxb.d7c() ? "" : yn6.w40())` 因此拿到**空串**，去加载不存在的 `Flux/prs-.txt` —— 配置一个字都没读进来。**改一个开关，一边修好一边弄坏。** P24 的做法是恢复默认值，改为直接 nop 掉 `gqz` 里的清空代码（那 10 字节的净栈效果为 0，所以原地替换安全）。

---

## 6. 客户端运行期架构（第二阶段还原）

这一节是第二阶段的核心成果：把"设置怎么来、钩子怎么跑、模式怎么切换"完整还原出来。

### 6.1 事件总线 `mtl`

```java
public final class mtl {
    private static final java.util.Map yh7;          // 事件类 → 监听器列表
    public static void __x(java.lang.Object);        // 注册（扫描 @jev 标注的单参数方法）
    public static void mn9(java.lang.Object);        // 注销
    public static final vlc esg(vlc);                // 派发入口
    private static void a65(mtl$_2w w, vlc e) { w.tss().invoke(w._5a(), e); }
    private static boolean nnj(java.lang.reflect.Method);   // 参数个数为 1 且带 @jev
}
```

**运行期实测（KillAura 开启时）**：

```
mtl.yh7 (bus) = 21 个事件类型
    ccn  listeners=49      ← 每 tick 事件
    wbh  listeners=42
    axn  listeners=25
    ...
```

**这是推翻第一版结论的关键证据**：`fyk.k27` 之类的方法没有直接调用点，是因为它们**由总线经反射调用**，而不是"由原生调用"。

### 6.2 模块基类 `ar7` 与子引擎 `j1s`

```java
public class ar7 {
    public boolean iio;                  // 启用标志
    public static int vlm;               // 注册总开关（P17 置 1）
    private final java.util.List _w6;    // 子对象表
    public void ron()  { ... mtl.__x(this);   ... asw(true);  }
    public void ne2()  { ... mtl.mn9(this);   ... asw(false); }
    private void jpe(j1s sub) { if (tb8(sub.zkf())) this._w6.add(sub); }
    private boolean tb8(String name) {   // 是否有子对象叫这个名字
        for (j1s sub : _w6) if (sub.zkf().equalsIgnoreCase(name)) return true;
        return false;
    }
}

public class j1s {                        // 子引擎（KillAura 的 xbs 继承它）
    public java.lang.String zkf();        // 名字
    public native void d2z(boolean);      // 激活/停用
    public boolean qza();                 // 预备
    public native void w4v();             // 每帧更新
    public native void i__();
}
```

**修改前的缺陷**：`ron()`/`ne2()` **只处理 `this`，从不遍历 `_w6`**。而 `fyk` 把两个 `xbs` 引擎 + 一个 `e9p` 放进 `j1s[]` 交给父类，父类通过 `jpe` 存进 `_w6`。因此子引擎既不注册也不注销 —— 原版由原生补上这一步。

**P29**：因为 `ron()`/`ne2()` 已有 8 个 StackMapTable 帧，手写迭代器循环容易出错，所以改用 **JDK 自带的 `java.util.List.forEach(Consumer)`**，配一个转发到 `mtl.__x`/`mtl.mn9` 的 `Consumer` 单例（`FluxBus`）。**迭代完全发生在 `ArrayList` 内部，被改方法没有新增分支、循环或帧。**

### 6.3 模式分派 `asw` —— Switch / Single 的实现

运行期实测 `fyk._w6`：

```
[0] xbs  name=Switch   desc=KillAura
[1] xbs  name=Single   desc=KillAura
[2] e9p  name=AAC      desc=KillAura
tb8("Switch") = true    tb8("Single") = true
```

模式切换的完整机制：

```java
public void asw(boolean enabling) {
    for (j1s sub : _w6) if (enabling) sub.qza(); else sub.d2z(false);   // ① 全部预备/全部停用
    if (tb8(isg.d7c()))                                                  // ② 有子对象叫这个名字吗
        for (j1s sub : _w6) {
            if (!sub.zkf().equalsIgnoreCase(isg.d7c())) continue;
            sub.d2z(true);                                               // ③ 只激活匹配的那个
            return;
        }
}
```

**这里有一个关键的不对称**：`enabling == true` 时，第 ③ 步只**激活**匹配的引擎，**从不停用其它引擎**。因此单纯的"改下拉框 + 重新启用"不会换引擎 —— 必须**先 `ne2()`（走 `d2z(false)` 清干净）再 `ron()`**。这正是 **P34** 的内容，也解释了为什么"手动关一次再开一次"以前看起来有效。

### 6.4 配置链 `szk`

```
zwr.up0()      → szk 的惰性单例
szk.<init>()   → a2k() 加载键位 → _k4() 加载配置（含保存）
szk._k4()      → if (c05.vz1().tij == null) return;   ← 世界不存在就直接返回
                 ux_(zwr.bxb.d7c() ? "" : yn6.w40());  ← 取配置名
                 bxh(); kvr(); ece(); ss8(); ax1(); j02(); mw6(); tev();
szk.gqz(ccn)   → 每 tick 的配置守卫（原本会清空配置名，P24 已 nop）
szk.t8a(String)→ 加载 Flux/conf_<名字>.txt（GUI 手动选配置时走这条）
szk.a2k()      → 加载 Flux/bind.txt（键位）
szk.j02()      → 保存 Flux/bind.txt（读取 ar7.x_i() 的当前值）
c_3.n1j(String)→ 下拉框 setter，按选项数组 mh8 校验后写入 ktv
```

**这一段有两个隐蔽的陷阱，都实际踩到过：**

1. **`_k4()` 是"加载后保存"**，而它调用的九个方法里**没有 `a2k()`（加载键位）却有 `j02()`（保存键位）**。P18 只挂了 `_k4`，于是每次启动都用当时的 0 值覆盖 `bind.txt` —— **曾造成键位被清空的真实损失**（无备份可恢复）。P27 补上了缺失的 `a2k()`，顺序修正为 `a2k()` → `_k4()`。

2. **加载是按名字匹配的，而设置对象在模块 `<clinit>` 里才注册**。`kgt.<init>`（P9）会引用全部 98 个模块的静态字段，**因此建 `kgt` 会强制所有 `<clinit>` 执行**；建 `szk` 不会。而 `szk` 的第一个调用者是 `ar7.tp_`（模块切换），完全可能早于任何触碰 `kgt` 的代码。后果：

```
配置文件 : s#KillAura:Mode:Switch
内存对象 : fyk.isg = c_3[Mode]=Single     ← 默认值，从没被覆盖
```

**P31** 在 `szk.<init>` 最前面插入 `zwr.qkk.zj2()`（→ `new kgt()`），**强制先建注册表再应用配置**。这一处修复覆盖**所有**带 Mode 下拉框的模块。

3. **`_k4()` 的 `tij == null` 守卫 + `szk` 是一次性单例** ⇒ 如果 `szk` 在世界存在之前被创建，配置**整局都不会加载**，且不会重试。**P32** 把"每个新世界出现时重新应用"挂进每 tick 的 `c05.tur` 钩子（`FluxBus.ensureConfig`），使配置应用**不再依赖创建顺序**。

### 6.5 按键分发 `c05.tur`

`c05.tur()` 是每 tick 的客户端钩子（5,021 字节），关键区段：

```
1817  getstatic  zwr.qkk
1820  invokevirtual zwr.zj2()      ← 模块注册表
1823  invokevirtual kgt.wau()
1826  ...iterator...
1857  invokevirtual ar7.x_i()      ← 键位比对
1876  invokevirtual ar7.tp_()      ← 命中则切换
1890  invokestatic  c05.vz1()
1900  getstatic     jej.xrw
1905  invokevirtual n9l.pjs(int)   ← TabGUI 驱动
```

---

## 7. 方法论（第二阶段）

### 7.1 进程内反射探针（`FluxDiag`）

Frida 在桌面 HotSpot 上**无法 hook Java 方法**，而答案全在客户端自己的运行期对象里。做法：往 jar 里加一个只用 `java.*` 的类，其静态初始化器启动守护线程，**每 2 秒用纯反射**把真实状态写进 `flux-diag.txt`：

```
zwr.qkk.zj2()    = kgt@...              ← 模块注册表
u1p.jcs / ar7.vlm                       ← 总线开关、注册开关
c05.vz1().tij    = kh3@...              ← 世界对象
mtl.yh7 (bus)    = 21 event types       ← 每个事件类的监听器数
registry size    = 98
    fyk  name=KillAura  enabled=true key=19  desc=KillAura §fSwitch
        .jff = cn7[Mob]=false           ← 逐条设置项的当前值
        .isg = c_3[Mode]=Switch
fyk._w6 (engines) = size 3
    [0] xbs  name=Switch ...
tb8("Switch") = true
xbs.lo6 = List size=3                   ← 目标列表
fyk.kfa = os.lron Golem                 ← 当前目标
```

**这个探针是本阶段最高效的工具** —— 它把"猜"变成了"读"。它同时暴露了我自己的两次失误：早期版本只按类型名匹配 `cn7`/`dzm`，而 `crk`（模式类）是自己的类名，导致**模式值连续几轮没被打印过**；`mtl$_2w` 的 `tss`/`_5a` 是访问器**方法**而非常量字段，用 `fieldAny` 读会永远为空。

### 7.2 `SourceFile` + `LineNumberTable` 精确定位崩溃

崩溃栈是 `at c05.tur(Unknown Source)`，没有位置。给 `c05.tur` 加一张 **`LineNumberTable`**（行号 = 字节码偏移），崩溃栈就能显示精确偏移。

**但第一次没生效** —— 因为 `StackTraceElement.toString()` 的真实逻辑是：

```java
fileName != null && lineNumber >= 0 ? "(" + fileName + ":" + lineNumber + ")"
: fileName != null                   ? "(" + fileName + ")"
:                                      "(Unknown Source)"        ← 走这里
```

**只要 `fileName == null`，行号就被完全丢弃**，即使行表已算出行号。ZKM 剥掉了 `SourceFile`，所以**必须同时补上 `SourceFile` 属性**。

补齐之后一次命中：

```
at c05.tur(Flux.java:1823)
```

对应 `invokevirtual kgt.wau()` —— 接收者是 `zwr.zj2()` 的返回值，而它返回了 `null`。**这个偏移直接定位到了"P8 的惰性创建补丁被覆盖丢失"这个根因**，而此前靠栈帧猜了两轮都错了。

### 7.3 反复踩到的工程陷阱

| 陷阱 | 表现 | 正确做法 |
|---|---|---|
| **从 `pristine` 重建丢失组合补丁** | `kh3` 的 P7、`zwr` 的 P8/P10 被静默覆盖（共 2 次） | 每个类的来源路径在构建脚本里**显式写死**；写回后**逐字节复核** |
| **一个循环里改两处方法** | 后一处的 `cfo` 已失效 → `ClassFormatError: illegal modifiers: 0xD`（共 2 次） | 先从原始字节**收集全部编辑点**，再**按偏移从高到低**应用 |
| **手写常量池引用漏 `count++`** | 池计数错位 → 解析越界 | 复用已验证的 `build_ref` 构造器 |
| **忘记更新构建映射表** | jar 里还是旧类 | **每步都从 jar 校验**，而不是只看构建脚本的输出 |
| **`decode_instructions` 对 `pop` 返回长度 0** | 尾部边界算错 → 拼接进多余字节 → `Operand stack underflow` | 不能靠 `offset + len` 推下一条，改用**下一条指令的偏移** |
| **尾部 `return` 是分支目标时不能追加** | 追加会让分支跳进注入代码中间 | 工具内置断言 `FAIL-CLOSED: a branch targets the trailing return`（实际拦住过一次） |
| **`System.out.println` 不进 `latest.log`** | 诊断输出看不到 | 只发 log4j 事件 |
| **崩溃报告的 `-- Head --` 段会误导** | 显示 `kh3.utr`，而真实栈是 `c05.tur` | 以 `latest.log` 的 `FATAL: Unreported exception thrown!` 为准 |

### 7.4 验证纪律

**从 jar 校验**是本阶段确立的铁律：

```
java -cp work/tools/classes VerifyPatch <jar> <类名…>
→ RESULT: every class linked and passed bytecode verification
```

单文件校验**不可信** —— 它两次对同一份字节报 OK，而从 jar 里验才暴露出 `Operand stack underflow`。

---

## 8. 验证

### 8.1 静态可达性

`tools/validate_patch.py` 在补丁后字节码上自行推导菜单跳转：

```
q08.drawScreen   PASS   login block @45 reachable=False ; menu hops [32, 60] all reachable=True
jiz.<init>       PASS   remaining Unsafe.putAddress call sites: none
VERDICT: ALL CHECKS PASSED
```

### 8.2 JVM 字节码校验

```
szk / ar7 / xbs / fyk / zwr / kgt / kh3 / lxj / u1p / yn6 / c05 / mtl / jej / q08 / FluxBus / FluxDiag
RESULT: every class linked and passed bytecode verification
```

### 8.3 动态对照实验

`tools/DynamicGateTest.java`：控制组在 `qih.<init>` 内抛出（登录路径可达），补丁组抵达菜单路径且从不解析 `qih`。

### 8.4 实机验证（用户环境逐步确认）

**第一阶段：**

| 阶段 | 结果 |
|---|---|
| P1-P3 | 安装后启动 → **仍出现登录界面** → 发现原生 JNI 构造（催生 P4） |
| P4 | 进入主菜单 → 崩溃于 `zwr.cw_` → P5 |
| P5 | 主菜单正常 → 按钮无响应 → P6 |
| P6 | 按钮有响应 → 进世界崩溃于 `kgt.iy7` → P7 |
| P7 | 进世界成功 → 按键崩溃于 `zwr.zj2()` → P8 |
| P8 | 按键不崩 → **右 Shift 无反应** → 发现 `vuo` 由原生填充 → P9 |
| P9 | 右 Shift 触发到模块 → 崩溃于 `zwr.up0()` → P10 |
| P10 | **ClickGUI 能打开** → 开启 killaura 崩溃于 `j1s.d2z` → P11 |
| P11 | 功能不生效 → 定位到 AWT 颜色死锁 → J1 |
| J1 | 功能仍不生效，改 GUI 风格崩溃于 `jej.vuw` → P12 |

**第二阶段：**

| 阶段 | 结果 |
|---|---|
| P13–P22 | 进世界、GUI 可用；但**按键即崩**（NPE at `c05.tur`） |
| 诊断 | 补 `SourceFile` + `LineNumberTable` → 定位到 `c05.tur:1823` = `kgt.wau()` 接收者为 null |
| P8 复原 | 发现 P8/P10 曾被覆盖丢失 → 复原 → **按键不崩、ArrayList 正常** |
| P23–P27 | 逐个修复注册守卫、配置加载顺序、键位加载；**40 个模块被配置启用、总线 49 个 tick 钩子** |
| P28 | **KillAura 开始攻击**（引擎类 `xbs` 从未注册进总线） |
| P29 | 关闭模块时攻击停止（子引擎一起注销） |
| P30 | 快捷键与 ClickGUI 两条路径行为统一 |
| P31–P34 | **配置自动加载、Mode 值稳定、Switch 行为正常、下拉框改动即时生效** |

---

## 9. 已知残留

### 9.1 单个设置项的加载一致性

**实测反例**：

```
配置文件 : s#KillAura:Mob:false     →  运行时 : fyk.jff = cn7[Mob]=true    （另一次运行是 false）
配置文件 : s#KillAura:Mode:Switch  →  运行时 : fyk.isg = c_3[Mode]=Switch （同一次运行，正确）
```

**同一模块内 `Mode` 应用了、`Mob` 没有** —— 说明加载器是"逐设置项"不一致的，而非"整模块失败"。这是当前最明确的未解问题，也是继续工作的入口。

**已确认的消费点**（供后续排查）：

| 设置 | 消费点 |
|---|---|
| `KillAura.Mob` (`jff`) | `fyk.b6k@574`（该函数逻辑本身正确：`jff==0` 时 `return false`） |
| `KillAura.Autoblock` (`s4u`) | `xbs.o_a@311` |
| `KillAura.Mode` (`isg`) | `ar7.asw`（经 `tb8` + `zkf` 名字匹配） |
| `Fly`/`Speed` 的 Mode | 同上机制 |

**候选名单绕过过滤器**：`xbs.y6j(boolean)`（436 字节）很可能直接遍历世界实体而未经 `fyk.b6k` 过滤 —— 这是 Mob 失效最可能的位置，尚未验证。

### 9.2 部分模块的行为依赖原生实现

`j1s.w4v()` / `i__()` / `d2z()` / `qza()` 均为 native，是子引擎的**实际执行体**。Java 侧只决定"何时、启用哪一个"。因此：

- **Fly 的速度调控**：设置在 Java 侧正确，但实际位移驱动在原生。
- **Speed 的模式细分**（`Hypixel`/`NCPHop`/`SlowHop`/`Vanilla`）：各模式的差异实现大概率在原生。

### 9.3 原生层

`.text` / `.boot` 在活动进程里熵值仍为 7.94 / 7.96，**按页解密执行**。静态分析不可用；动态脱壳需要定位解密例程、逐页提取、修复重定位与导入，是以周计的专门工程。

**评估结论：不必要。** 我们依赖的 native 都是普通 JNI 导出，已能调用、已能工作。

### 9.4 其它

| 项 | 说明 |
|---|---|
| 1,778 条未解密字符串 | 主要为 OptiFine 类，依赖 GL 上下文初始化 |
| 41 个 native 方法的语义 | 需脱壳后分析 |
| `dr9.if3()String`（无参 native 返回 String） | HWID 采集最可疑的候选，**尚未证实** |
| **键位文件曾被清空** | P18 的"加载后保存"副作用（见 6.4），**无备份可恢复**，需在 GUI 内重新绑定 |

---

## 10. 反编译源码工程

### 10.1 产出

反编译对象是 **`releases/Flux_login_bypassed.jar`（34 补丁成品）**，产出两棵完整的源码树：

| 目录 | 引擎 / 处理 | 文件数 | 体积 | 用途 |
|---|---|---|---|---|
| `reference/decompiled-bypassed-vineflower/` | Vineflower 1.10.1，**原始混淆名** | 7,421 | 117.4 MB | **基准**：与字节码逐字对照（如核对某条 `invokevirtual` 在常量池里的真实名字） |
| `reference/decompiled-bypassed-named/` | 同上 + **符号重命名** | 7,421 | 117.7 MB | **阅读**：类名、方法名、字段名已还原 |
| `reference/decompiled-bypassed-cfr/` | CFR 0.152 | 717 | 13.5 MB | 补充：ZKM 的 `invokedynamic` 调用点在这边信息更完整 |

**"是不是最新版本"不能只看时间戳。** `tools/verify_decompiled_tree.py` 从反编译产物里断言每个补丁独有的标记（`FluxBus.java` 存在、`ar7` 含 `forEach`、`c05` 含 `ensureConfig`、`qih` 含 `z2i` …），通过后才认为这棵树来自 34 补丁版本。实测结论：

```
VERDICT: 该反编译树来自 34 补丁版本
```

### 10.2 符号重命名

ZKM 的名字是 3 字符短标识，**同名不代表同义** —— 例如 `ron` 被 **34 个类**各自声明，全局替换会把无关方法合并。因此重命名分三层，安全性由 `tools/check_rename_safety.py` 从字节码枚举"每个名字由哪些类声明"来判定：

| 层 | 范围 | 例子 |
|---|---|---|
| **A. 类名** | 全局（边界拒绝 `.` 之后的位置，避免误伤同名字段） | `c05→Minecraft`、`ar7→Module`、`fyk→KillAura`、`xbs→AuraEngine`、`mtl→EventBus`、`cn7→BooleanSetting` |
| **B. 单声明类成员** | 全局 | `b6k→isValidTarget`、`zkf→getName`、`d2z→setActive`、`_k4→loadConfig`、`__x→register`、`d7c→getValue`（4 个类验明同义） |
| **C. 模块生命周期** | **仅** `Module.java` 与 `extends Module` 的文件内 | `ron→onEnable`、`ne2→onDisable`、`asw→setSubEnginesEnabled`、`isg→modeSetting` |

**Tier C 是刻意的取舍**：其余 33 个声明 `ron` 的类保持原名 —— 宁可局部不一致，也不制造错误的语义合并。

效果抽样（`AuraEngine.java`）：

```java
public void attack() { ... }
private java.util.List collectTargets(boolean playersOnly) { ... }
private static boolean passesFilter(Entity e) { ... }
public native float[] computeRotation(EntityLivingBase e);
public void onPlayerUpdate(PlayerUpdateEvent event) { ... }
```

反编译注释里的引用同步更新，文件也按类名改名（`ar7.java` → `Module.java`），资源文件（1,991 个 json、1,884 个 png、着色器、语言文件、两张 `.der` 固定证书）完整保留。逐条替换记录见 `mappings/rename-map.tsv`（139 条），方法与范围见 `mappings/RENAME.md`。

### 10.3 为什么源码是"已绕过版本"

反编译对象是打过全部补丁的成品，因此源码中可以直接看到：

- `LoginScreen.drawScreen` 已是 14 字节的重定向；
- `MainMenuScreen.drawScreen` 的门禁已无条件跳转；
- `ClientState.zj2()` 含惰性创建；
- `ModuleRegistry.<init>()` 是 98 次带 null 守卫的注册；
- `Module.forEach`（`onEnable`/`onDisable` 里的 `subEngines.forEach`）；
- `TickEvent` 钩子里的 `FluxBus.ensureConfig`。

---

## 11. 复现步骤

### 11.1 环境准备

以下 `<MC>` 代表本机的 `.minecraft` 目录，`<JRE>` 代表补丁版 JRE 的放置位置。脚本不预设任何路径，全部由参数给出。

```
1. 备份 <MC>\versions\Flux\Flux.jar
2. 复制一份 JRE 8u481 到 <JRE>
3. python tools/patch_color.py <从原 rt.jar 提取的 Color.class> <输出>
   用输出替换 <JRE>\lib\rt.jar 内的 java/awt/Color.class
   （或直接用 scripts/install-bypass.ps1 -JreSource <原始 JRE> 自动完成）
4. 编辑 <MC>\versions\Flux\PCL\config.json：
   InstanceForcedJava.Folder = "<JRE>\\bin\\"
```

安装与回滚可以直接用脚本：

```powershell
# 安装（-JreSource 可选；不给出则跳过 JRE 步骤）
powershell -File scripts/install-bypass.ps1 -MinecraftRoot <MC> -JreSource <原始 JRE 8u481>

# 回滚
powershell -File scripts/install-bypass.ps1 -MinecraftRoot <MC> -Rollback
```

### 11.2 构建

```powershell
# 先准备 pristine 类（3,394 个）
# 各阶段补丁链（每个类的来源路径在 build-jar.ps1 里显式写死）
powershell -NoProfile -ExecutionPolicy Bypass -File tools/build-jar.ps1 -Install

# 校验（务必从 jar，而不是单文件）
java -cp work/tools/classes VerifyPatch releases/Flux_login_bypassed.jar <类名…>
```

**各阶段产物目录**（这是构建脚本的唯一真源，不要从 `pristine` 重建）：

| 类 | 来源 | 已含补丁 |
|---|---|---|
| `q08` | `work/patch_stage` | P1 P3 P5 |
| `jiz` `qih` `ybv` | `work/patch_stage` | P2 / P4 / P6 |
| `kh3` | `work/patch_kh3/kh3_final.class` | P7 P22 |
| `kgt` | `work/patch_kgt/kgt.class` | P9 P23 |
| `zwr` | `work/patch_zwr/zwr.class` | **P8 P10 P24**（必须从 `compose_out` 链式产出） |
| `lxj` | `work/patch_single/lxj.class` | P10 |
| `jej` | `work/patch_jej/jej2.class` | P12 P14 |
| `ar7` | `work/bus_out2/ar7_p30.class` | **P11 P13 P15 P17 P26 P29 P30** |
| `u1p` | `work/bus_out2/u1p.class` | P16 |
| `szk` | `work/patch_cfg/szk_probe.class` | **P18 P24 P27 P31** |
| `yn6` | `work/patch_yn6/yn6.class` | P20 |
| `c05` | `work/patch_c05/c05.class` | 诊断（LineNumberTable）+ P32 |
| `FluxBus.class` | `work/diag` | **新增类**：P29/P30/P32/P33/P34 的宿主 |
| `FluxDiag.class` | `work/diag` | **新增类**：运行期探针 |

### 11.3 回滚

| 改动 | 回滚方式 |
|---|---|
| 客户端 jar | 覆盖回 `Flux.jar.pre-backup`（`506D7B56…`） |
| PCL2 Java 指向 | 覆盖回 `PCL\config.json.flux-orig` |
| JRE | `jre8-flux\lib\rt.jar.flux-orig` 覆盖回 `rt.jar`，或删除 `jre8-flux` 目录 |
| 系统 JRE | **未改动** |
| 配置文件 | 删除 `flux\conf_<名字>.txt`（若存在），预设以 `flux\prs-*.txt` 为准 |

---

## 12. 附录

### 12.1 工具链

| 工具 | 用途 |
|---|---|
| `patch_login.py` | P1-P3 |
| `patch_qih.py` | P4（Code 属性整体替换 + 常量池追加） |
| `patch_menu.py` / `patch_input.py` / `patch_reentrancy.py` | P5 / P6 / P7 |
| `patch_zj2.py` | P8 |
| `patch_registry.py` / `patch_registry_guard.py` | P9 / P23 |
| `patch_singletons.py` | P10 |
| `patch_bxb.py` / `patch_gqz.py` | P21 / P24 |
| `patch_kh3.py` | P7 + P22 组合 |
| `patch_xbs_register.py` | P28 |
| `patch_subregister.py` | P29 |
| `patch_toggle_sync.py` | P30 |
| `patch_registry_order.py` | P31 |
| `patch_ensurecfg.py` | P32 |
| `patch_linenumbers.py` | `SourceFile` + `LineNumberTable` 诊断 |
| `trycatch.py` | **可复用**：整方法 try/catch 包裹 + StackMapTable 解析 |
| `patch_color.py` | J1（JDK 的 `java.awt.Color`） |
| `build-jar.ps1` | **权威构建**：13 项写入 + 逐字节回读复核 |
| `VerifyPatch.java` | JVM 链接/字节码校验（**必须从 jar**） |
| `callscan.py` | 字节码指令与常量池引用扫描 |
| `scan_missing_state.py` | 识别"只有读取者、无 Java 写入者"的原生专属字段 |
| `measure_obfuscation.py` | 混淆规模实测 |
| `dump_filter.py` | 单方法反汇编（按类名/方法名） |
| `harvest.py` / `DumpStrings.java` | ZKM 字符串批量解密 |
| `diag/FluxDiag.java` | 运行期反射探针 |
| `diag/FluxBus.java` | 子引擎注册/注销、配置重应用、模式轮询的宿主 |
| `dump_module.js` / `frida_run.js` | Frida 节区 dump（用于 3.4 节的熵值实测） |

### 12.2 关键证据文件

| 文件 | 内容 |
|---|---|
| `evidence/decrypted_strings.tsv` | 14,389 条解密字符串 |
| `evidence/decryption_failures.tsv` | 1,778 条未解密记录 |
| `evidence/runtime-dump/` | 活动进程 17 个节的实时内容（熵值实测来源） |
| `evidence/validation_reachability.txt` | 静态可达性结论 |
| `evidence/jvm_verification*.txt` | JVM 校验输出 |
| `evidence/dynamic_test_control.txt` / `_patched.txt` | 动态对照 |
| `evidence/q08_drawScreen_original.javap.txt` / `_patched.javap.txt` | 补丁前后反汇编 |
| `evidence/native_gate_patch_report.tsv` | 原生门禁补丁记录 |
| `flux-diag.txt`（游戏目录） | 运行期探针输出 |

### 12.3 全部 34 组补丁总表

| # | 目标 | 手段 | 阶段 |
|---|---|---|---|
| P1 | `q08.drawScreen` 22, 35 | 去不透明分支 + 无条件跳菜单 | 一 |
| P2 | `jiz.<init>` 108 | 拆自毁陷阱 | 一 |
| P3 | `q08.drawScreen` 541, 590 | 空串替换 + 常量池追加 | 一 |
| P4 | `qih.drawScreen` 全文 | 重定向到主菜单 | 一 |
| P5 | `q08.drawScreen` 124-140 | 17×nop | 一 |
| P6 | `ybv.<clinit>` 4 | `iconst_0`→`iconst_1` | 一 |
| P7 | `kh3.wd_` 14-19 | `iconst_0` + 5×nop | 一 |
| P8 | `zwr.zj2()` 全文 | 惰性创建 `kgt` | 一 |
| P9 | `kgt.<init>` 全文 | Java 侧注册 98 模块 | 一 |
| P10 | `zwr` 7 getter + `lxj.<init>` | 单例惰性化 | 一 |
| P11 | `ar7.asw` 全文 | catch-all 包裹 | 一 |
| P12 | `jej.vuw` 全文 | catch-all 包裹 | 一 |
| J1 | `java.awt.Color.testColorValueRange` | 裸 `return` | 一 |
| P13 | `ar7.z5z`/`kkj`/`dv9`/`tp_@59` | `invokevirtual yse` → `putfield iio` | 二 |
| P14 | `jej` | 新增 `fluxEnsureTimer()` | 二 |
| P15 | `ar7.tp_` 146-152 | 注入 `ron()` | 二 |
| P16 | `u1p.<clinit>` 0 | `u1p.jcs = 1` | 二 |
| P17 | `ar7.<clinit>` 347 | `ar7.vlm = 1` | 二 |
| P18 | `szk.<init>` | 追加 `_k4()` | 二 |
| P19 | —— | 仅诊断，已废弃 | 二 |
| P20 | `yn6.w40()` 24 | `ldc_w "hypixel_best_config"; areturn` | 二 |
| P21 | `zwr.<clinit>` 934 | `zwr.bxb = true`（后被 P24 取代） | 二 |
| P22 | `kh3.utr` | catch-all + 日志 | 二 |
| P23 | `kgt.<init>` | 98 个 null 守卫 + 98 帧 StackMapTable | 二 |
| P24 | `zwr.<clinit>` + `szk.gqz` | 恢复 `false` + 10×nop | 二 |
| P25 | `szk.<init>` | `t8a()`（**已回退**） | 二 |
| P26 | `ar7.z5z`/`dv9` | 追加 `ron()` | 二 |
| P27 | `szk.<init>` | 在 `_k4()` 前追加 `a2k()` | 二 |
| P28 | `xbs.<init>(Z)` | 追加 `mtl.__x` | 二 |
| P29 | `ar7.ron`/`ne2` | 追加 `_w6.forEach(FluxBus.REG/UNREG)` | 二 |
| P30 | `tp_`/`z5z`/`dv9`/`kkj` | → `FluxBus.sync` | 二 |
| P31 | `szk.<init>` | 前置 `zwr.qkk.zj2()` | 二 |
| P32 | `c05.tur` | 追加 `FluxBus.ensureConfig` | 二 |
| P33 | `FluxBus.ensureConfig` | 每 20 tick 轮询模式并 `sync` | 二 |
| P34 | `FluxBus.sync` | 固定 `ne2()` → `ron()` | 二 |

---

## 13. 合规声明

本报告与产物仅用于**学习与研究目的**，针对的是：

1. 用户本人持有并安装在本机的软件副本；
2. 一个**验证服务器已停用**、无法通过正常途径运行的客户端。

报告与工具链交付的是**方法、证据与结论**。未包含任何绕过第三方服务器鉴权的完整可用方案，也未提供可用于规避他人系统访问控制的能力。

使用本材料产生的任何后果由使用者自行承担；请遵守所在地法律法规与软件许可协议。
