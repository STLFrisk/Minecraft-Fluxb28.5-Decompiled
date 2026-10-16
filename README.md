# Flux-RE

针对一个 Minecraft 1.8.9 第三方客户端 **Flux**（Zelix KlassMaster 12.0.4 混淆）的逆向工程与登录绕过工程。以及对其主要模块的尝试性修复（放弃了）。

该仓库主要文件是VibeCoding产生，包括完整反编译源码，可使用的绕过登录版本的Jar,etc.

交付的是**方法、证据与结论** —— 工具链、映射表、可复现脚本、字节级补丁记录、分析文档 —— 以及**已绕过版本的完整反编译源码**。

> **状态**：登录绕过已完成并实机验证（跳过登录界面 → 主菜单 → 世界 → ClickGUI）。
> 第二阶段又修复了崩溃链并激活了功能调度 —— **KillAura 已完整闭环**（选目标 → 攻击 → 关闭注销），
> 配置可自动加载、模式切换即时生效、多数模块已响应。详见[交付报告](docs/report/delivery-report.md)。
>
> **注意**：本 README 早期版本曾断言「作弊功能无法通过 Java 侧补丁恢复」。**该结论已被推翻**
> —— 功能回调是通过事件总线**反射**调用的，因此不存在直接调用点，而非由原生驱动。见报告 §0。

---

## 目标样本

| 项 | 值 |
|---|---|
| 客户端 | `Flux.jar`，73,215,726 字节，7,419 条目，3,394 个类，Minecraft 1.8.9 |
| SHA-256 | `506D7B5659846F4F440CC6CB2BAB69D0A38262A213A4C7F43521C5DF1964FE2E` |
| 混淆器 | Zelix KlassMaster 12.0.4（字符串加密 / 名称混淆 / 控制流混淆） |
| 原生组件 | `META-INF/Soter` → `libsoter.dll`，50,531,856 字节加壳 PE32+，导出仅 `JNI_OnLoad` |
| 协议库 | `irc-1.3.jar`（Kotlin，二次混淆，`today.flux.irc.*`） |
| 原始样本存档 | `archive/sample/Flux-b28.5-original.jar` |

样本不在公共仓库内；`archive/sample/` 保留了一份校验过的副本用于复现。

---

## 快速导航

| 我想… | 看这里 |
|---|---|
| 读完整交付报告 | [docs/report/delivery-report.md](docs/report/delivery-report.md) · [.docx](docs/report/delivery-report.docx) |
| 看已绕过版本的反编译源码 | [`reference/decompiled-bypassed-named/`](reference/decompiled-bypassed-named/)（**小部分函数命名**） · [`reference/decompiled-bypassed-vineflower/`](reference/decompiled-bypassed-vineflower/)（原始混淆名，用于与字节码对照） · [`reference/decompiled-bypassed-cfr/`](reference/decompiled-bypassed-cfr/) |
| 查符号重命名的依据与范围 | [`mappings/RENAME.md`](mappings/RENAME.md) · `mappings/rename-map.tsv` |
| 看 34 组补丁的字节级记录 | [patches/](patches/) · [交付报告 §5](docs/report/delivery-report.md) |
| 复现构建 | [交付报告 §9](docs/report/delivery-report.md) · `scripts/` |
| 用工具链 | [tools/](tools/) |
| 查解密出的字符串 | `evidence/decrypted_strings.tsv`（14,389 条）· `mappings/strings.tsv` |
| 查类名映射 | [mappings/classes.yaml](mappings/classes.yaml) · `mappings/class-index.tsv` |
| 查原生方法清单 | `mappings/native.yaml`（41 个 native 方法） |
| 拿可直接用的成品 | [releases/Flux_login_bypassed.jar](releases/Flux_login_bypassed.jar) |
| 复现 JRE 补丁（仓库不含 JRE） | 见下方 [J1 章节](#j1可选的-jre-补丁仓库不含-jre请自行复现) |

---

## 成果概要

### 已完成

- **字符串解密**：从 16,168 个 ZKM 加密调用点恢复 **14,389 条明文**，覆盖 **945 个类**。
  算法为两层 DES/CBC/PKCS5Padding，密钥为类的 `static final long a`。方法见报告 §3.2。
- **登录绕过**：12 组 Java 字节码补丁 + 1 处 JDK 修复，全部遵循「不改动任何既有字节码偏移」原则。
- **崩溃链修复**：7 类运行期崩溃（`zwr.cw_`、`kgt.iy7`、`zwr.zj2()`、`zwr.up0()`、`j1s.d2z`、`jej.vuw`、`c05.tur`）。
- **功能激活**：还原并修复事件总线、模块注册、子引擎注册/注销、模式分派、配置加载链。
- **反编译源码**：对**当前 34 补丁成品 jar** 重新反编译，产出两棵完整树 ——
  `decompiled-bypassed-named/`（**符号已重命名**，7,421 个文件 / 117.7 MB）与
  `decompiled-bypassed-vineflower/`（原始混淆名基准，7,421 个文件 / 117.4 MB）。
  重命名分三层执行（类名全局 / 单声明类成员全局 / 模块生命周期限定作用域），
  安全性由字节码枚举"每个名字由哪些类声明"判定 —— 见 [mappings/RENAME.md](mappings/RENAME.md)。

### 第二阶段还原出的运行期架构

| 组件 | 作用 |
|---|---|
| `mtl` | 事件总线（`__x` 注册 / `mn9` 注销 / `esg` 派发，`@jev` 标注单参数方法） |
| `ar7` | 模块基类（`ron`/`ne2` 注册/注销，`asw` 按名字分派子引擎） |
| `j1s` | 子引擎基类（`zkf` 名字、`qza`/`d2z` 启停、`w4v` 每帧更新 —— 启停与更新为 native） |
| `szk` | 配置链（`a2k` 键位、`_k4` 设置、`gqz` 守卫、`t8a` 手动载入） |
| `c05.tur` | 每 tick 钩子（模块键位分发、TabGUI 驱动） |

### 已知残留

| 项 | 状态 | 报告 |
|---|---|---|
| 单个设置项的加载一致性 | 多数生效，个别项（如 `KillAura.Mob`）运行间不稳定 | §9.1 |
| Fly / Speed 的模式行为 | 模式机制已还原，具体行为依赖原生实现 | §9.2 |
| 原生层 | `.text` 在活动进程里熵值仍 7.94，按页解密执行，静态分析不可用 | §3.4 / §9.3 |

**未采用的两条路线**（附评估）：本地伪造验证服务端（不必要且签名不可伪造）、WinLicense 动态脱壳
（需要以周计的专门工程，且我们依赖的 native 已能正常工作）。见报告 §4.4 / §9.3。

---

## J1：可选的 JRE 补丁（**仓库不含 JRE，请自行复现**）

这是唯一一处需要改动**客户端之外**的东西的补丁。三处独立的 `java.awt.Color` 构造越界
（`prq.lz_`、`kgt.eyk`、`j1s.d2z`）会让异常从**原生帧内部**抛出，解开整条原生调用链；
把 `Color.testColorValueRange` 改成裸 `return` 即可解除这个死锁点。原理见报告 J1。

### 为什么不随仓库分发 JRE

`jre8-flux` 是 **Oracle 的专有发行版**（`Java(TM) SE Runtime Environment`，其 `LICENSE`
指向 [OTN License Agreement](https://java.com/otnlicense)，**明确禁止再分发**），
和仓库里刻意排除的 OptiFine 属于同一性质。而且**真正必要的修改只有 7,835 字节**，
已经在仓库里，字节与打补丁后的 JRE 完全一致。

### 复现方法（三步）

```powershell
# 1. 从你自己的 JRE 8u481 的 lib/rt.jar 中取出原始类
#    （任何解压工具，或：jar xf rt.jar java/awt/Color.class）

# 2. 生成打过补丁的 Color.class
python tools/patch_color.py <原始 Color.class> patches/java-awt-Color.patched.class

#    仓库里已有一份可用的产物，可用它核对你的输出：
#      patches/java-awt-Color.patched.class   7,835 字节
#      sha256 10756193192322028911676151771596…
#    两者字节一致即说明复现正确。改动只有一处：
#      java/awt/Color.testColorValueRange(IIII)V  ->  裸 return
#    （该方法是纯校验、不影响取值：构造实现存储前已对每个分量做了 & 0xFF 掩码，
#      所以这不会产生非法颜色，只是让越界输入不再致命）

# 3. 复制一份 JRE 并把补丁类装进去，同时把启动器的 Java 指向改过去
powershell -File scripts/install-bypass.ps1 -MinecraftRoot <MC> -JreSource <原始 JRE 8u481 目录>
#    脚本会：复制到 <MC> 上一级的 jre8-flux\ → 备份 rt.jar 为 rt.jar.flux-orig
#            → 替换 java/awt/Color.class → 改写 PCL2 的 InstanceForcedJava.Folder
#    系统 JRE 永不改动；-Rollback 可完整还原。
```

**这一步是可选的。** 不装它也能跑 —— 只有当客户端因 `java.awt.Color` 越界而崩溃时才需要。

---

## 目录结构

```
docs/
  report/           完整交付报告（Markdown + Word）
  analysis/         专题分析文档
mappings/           去混淆知识库：类名映射、字符串表、原生方法清单
reference/
  decompiled-bypassed-vineflower/   已绕过版本源码（Vineflower，3,394 个类）
  decompiled-bypassed-cfr/          已绕过版本源码（CFR）
evidence/           证据：解密字符串、可达性、JVM 校验、动态对照、补丁前后反汇编
patches/            补丁说明 + 字节级报告
releases/           可直接使用的成品 jar
scripts/            bootstrap / build / verify
tools/              分析工具链（Python / Java / Node）
archive/            原始样本存档 + 原生库 + 会话工作区
```

---

## 补丁总表

| # | 目标 | 手段 |
|---|---|---|
| P1 | `q08.drawScreen` 22/35 | 登录门禁：去不透明分支 + 无条件跳菜单 |
| P2 | `jiz.<init>` 108 | 拆 `Unsafe.putAddress(0,0)` 自毁陷阱 |
| P3 | `q08.drawScreen` 541/590 | 未登录会话空指针保护 |
| P4 | `qih.drawScreen` 全文 | 登录界面重定向（对付原生 JNI 构造） |
| P5 | `q08.drawScreen` 124–140 | 菜单着色器空指针（17×nop） |
| P6 | `ybv.<clinit>` 4 | 启用主菜单输入（单字节） |
| P7 | `kh3.wd_` 14–19 | 类初始化重入空指针 |
| P8 | `zwr.zj2()` 全文 | 惰性创建 `kgt`（一次修 39 处） |
| P9 | `kgt.<init>` 全文 | Java 侧注册 98 个功能模块 |
| P10 | `zwr` 7 getter + `lxj.<init>` | 全部原生专属单例惰性化 |
| P11 | `ar7.asw` 全文 | catch-all 兜底 |
| P12 | `jej.vuw` 全文 | catch-all 兜底 |
| J1 | `java.awt.Color.testColorValueRange` | 裸 `return`，解除原生执行流死锁 |

---

## 运行环境

实测环境：Windows 10 / JRE 1.8.0_481 / PCL2 启动器 / OptiFine 1.8.9_HD_U_M5。

绕过需要**两处**安装：

1. `releases/Flux_login_bypassed.jar` → 替换 `versions\Flux\Flux.jar`（先备份原文件）；
2. 一份打过 `java.awt.Color` 补丁的 JRE，并把 PCL2 的该版本 Java 指向它（见报告 §5 J1 与 §9）。

---

## 合规声明

本工程仅用于**学习与研究目的**，针对的是用户本人持有、且**验证服务器已停用**的软件副本。
交付的是方法与证据，不含任何绕过第三方服务器鉴权的完整可用方案。
