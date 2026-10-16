# 客户端架构地图

给接手者的第一张图。类名一律用**混淆名**（`mappings/classes.yaml` 里有已确认的对应关系）。

---

## 1. 启动链

```
启动器
  └─ net.minecraft.client.main.Main.main(String[])
       ├─ v6ma.UI()                       ← 释放并 System.load /META-INF/Soter
       ├─ 创建 Minecraft（= c05）         ← c05.vz1() 单例
       └─ 进入主循环 → GuiScreen = q08     ← 本工程的重点
```

`Start` 是一个**独立的备用入口**：它解密 14 个字面量拼出标准启动参数

```
--version mcp  --accessToken 0  --assetsDir assets  --assetIndex 1.8
--userProperties {}  --width 1280  --height 720
```

再把这些与真实 `argv` 拼接后调用 `Main.main`。也就是说 `Start` 是给
"没有正规启动器/离线自启"场景准备的入口；`Flux.json` 里配置的 `mainClass`
仍然是 `net.minecraft.client.main.Main`。

---

## 2. 子系统

### 2.1 客户端核心

| 混淆名 | 角色 | 关键成员 |
|---|---|---|
| `c05` | `Minecraft` 等价物，单例 | `c05.vz1()` 取单例；`c05.z2i(GuiScreen)` 切换界面；`tx1` 字体渲染器；`oxn` 游戏设置；`ee0()` 取会话对象（其 `s41` 字段被 `sms` 改写） |
| `zwr` | 全局状态容器 | `static prq tgs`（IRC 会话）、`static zwr qkk`（自身单例）、配置引用 |
| `moh` | `GameSettings` | `key.forward` / `key.jump` / `options.stream.*` |
| `t9d` | ZKM 不透明谓词 | `t9d.b()` / `t9d.c()`；**被引用 1,753 次** |
| `oov` | ZKM 异常包装 | 每个类的 `private static oov a(oov)`；**被引用 1,911 次** |

`t9d` 和 `oov` 是纯混淆产物，读逻辑时直接忽略；但**不要**在补丁里随手删掉
`t9d.b()` 的调用，它决定分支走向（见 `05-login-bypass.md`）。

### 2.2 界面层

```
gbe (GuiScreen)
 ├─ q08  GuiFluxMainMenu     "Single Player / Multi Player / Alt Manager / Options / Quit Game"
 │    └─ q08$_r5  菜单条目  new q08$_r5(this, <screen>, <label>)
 │         ├─ iun  Single Player
 │         ├─ s9r  Multi Player
 │         ├─ nn2  Alt Manager
 │         └─ qkp  Options
 ├─ qih  GuiFluxLogin        "USERNAME / PASSWORD / LOGIN / GET HWID"
 └─ ib7  GuiAltGenerator     "NPC Alt Generator - APIKey"
```

配套：`eka`（`ScaledResolution`，`x05()`/`lrx()` 给宽高）、`gt4`（`GuiButton`，
按 `_me` 字段分发 id）、`hxt`（标题渲染相关，**尚未命名**）。

### 2.3 认证与会话

```
ghq (启动流程)
  └─ new sms(authService, "MLv5_Netease.der")   ← extends YggdrasilMinecraftSessionService
       ├─ joinServer()/hasJoined() 被覆写
       ├─ 反射改写 GameProfile.name / id
       └─ 改写 c05.vz1().s41
```

| 混淆名 | 角色 |
|---|---|
| `sms` | 会话服务子类；网易 / TheAltening / Mojang 三通道接管 |
| `m1c` | Yggdrasil 会话客户端（`.minecraft.net` / `.mojang.com` / `.thealtening.com`） |
| `grn` | TheAltening 认证服务 |
| `zfs` | `YggdrasilUserAuthentication`（authlib 二次混淆） |
| `hy1` | Alt 生成 API 客户端（`killaura.cn/gc.php`） |
| `x1l` / `qd_` | 登录结果值对象 / Alt 账号列表 |

细节见 `03-auth-architecture.md`。

### 2.4 传输层

| 混淆名 | 角色 |
|---|---|
| `cfu` | **HTTP 本身是原生的**：`native String p6w(java.net.URL)` |
| `crb` | HTTP 请求构造（GET/POST/form-urlencoded） |
| `prq` | Flux IRC 客户端包装；6 个 native 回调 |
| `jej` | `IRCListener` 实现 |
| `o3s` / `gqi` | 第三方 API 客户端（xinchen.space / Hypixel watchdog） |

IRC 协议本体的包类在 `irc-1.3.jar` 的 `today.flux.irc.protocol.packet.*`，
关键是 `LoginPacket{user, userPassword, **hwid**}` 与 `LoggedPacket{token, verifySign, i}`。

### 2.5 配置与工具

| 混淆名 | 角色 |
|---|---|
| `szk` | 配置管理：`Flux/conf_default.txt`、`Flux/alt.txt`、`Flux/bind.txt`、`Flux/friends.txt` |
| `q6h` | 秒表/计时器（`u1k()` 重置，`bgq(ms)` 计时） |
| `gis` | OptiFine Shaders（改名后仍保留 GL20/ARB 调用） |
| `vb2` / `pjd` | 中文文案库 / 生成器 |

---

## 3. 认证相关的关键调用链

### 3.1 手动登录（`qih`）

```
用户点击 LOGIN
  → qih.mouseClicked(III)   [native]        ← 按钮命中判定在原生层
  → qih.mjy()               [native]        ← 登录动作整体在原生层
        ↓（推测，未证实）
  → 原生层创建 prq 实例 → 写 zwr.tgs
  → 原生层发起 IRC 握手 → 发 LoginPacket{user, userPassword, hwid}
  → 服务端回 LoggedPacket{token, verifySign, i}
  → 原生层回调 prq.onLoggedEvent(LoggedPacket) → 写 prq.dbd
```

Java 侧**看不到**中间过程：`zwr.tgs` 和 `prq.dbd` 在全 JAR 中都没有
`putstatic` / `putfield`，只能由 JNI 写入。

### 3.2 Alt 生成（`ib7` → `hy1`）

```
ib7 的按钮 → hy1.rbv(ps7.kt1 | ps7.jov | ps7.mrf)
  → cfu.q4z(new URL("https://killaura.cn/gc.php?key=" + key + "&type=" + mode))
  → 解析回复 "code,msg,acc"
  → code == "1" 时 acc.split(":") → zfs.eoj(user, pass) → new x1l(...)
  → qd_.oyx.add(0, x1l)
```

### 3.3 会话接管（`sms`）

```
sms.joinServer(profile, serverId, ...)
  ├─ 若此证书为 MLv5_Netease.der → 走网易通道
  │    → 连 127.0.0.1 的 NeteaseLauncher IPC
  │    → "Connected To NeteaseLauncher - ipaddr:"
  ├─ JOptionPane "Choose your username" (title "NEL")
  ├─ sms.jbn(chosen) 得到 UUID
  └─ 反射写入 profile.name / profile.id，并改写 c05.vz1().s41
```

---

## 4. 反篡改面

| 位置 | 机制 |
|---|---|
| `v6ma.Ex(int)` | 被 14 个类的 `<clinit>` 调用；JNI 实现；字符串表构建**之后**执行 |
| `jiz.<init>` | token 长度不足时 `Unsafe.putAddress(0L, 0L)`，硬崩 JVM |
| `libsoter.dll` | 50 MB 加壳镜像；`.boot` 段 49.5 MB 载有真实代码；Ghidra 600 秒只识别出 4 个函数 |
| 证书固定 | `MLv5_Netease.der` / `MLv5_Yggdrasil.der` 作为 X.509 公钥加载 |

---

## 5. 还没读懂的地方

* `q08.drawScreen` 除了门禁以外的整屏绘制逻辑（含其余不透明谓词）。
* `hxt`（被 202 个类引用，含 OptiFine 的 `CapeUtils`）到底做什么。
* `prq` 的 6 个 native 回调与 IRC 事件的具体对应关系。
* `zwr` 里 64 个字面量对应的配置/模块注册表结构。
* 全部 41 个 native 方法中，除 `Ex` / `p6w` / `mjy` / `mouseClicked` 之外的行为。

`mappings/class-index.tsv` 按被引用次数排序，是挑下一个目标最快的方式。
