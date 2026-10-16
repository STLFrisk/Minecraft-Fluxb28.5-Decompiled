# 账号与 HWID 认证架构

**一句话结论**：Flux 的"账号校验 + HWID 校验"**不在 Java 层**。
Java 只保留了登录界面、一个门禁判断和若干数据载体；
真正的校验逻辑在 `libsoter.dll`（加壳 JNI 模块）里，最终由服务端裁定。

---

## 1. Java 侧有什么

### 1.1 登录界面 `qih`

```java
public class qih extends gbe {                    // gbe = GuiScreen
    private omn rk7;                              // 用户名输入框
    private s51 dll;                              // 密码输入框
    private q6h j50;                              // 冷却计时器
    static String[] lyu;                          // 由 Main 预填（--username/--password）

    static final URI zqq = https://flux.today/admin/register.php
    static final URI b1b = https://flux.today/index.php/forgot

    public native void mouseClicked(int, int, int);   // ← 点击处理是原生的
    public native void mjy();                         // ← 登录动作是原生的
}
```

已恢复的界面字面量：`USERNAME` / `PASSWORD` / `LOGIN` / `GET HWID` /
`No Account?` / `Password Reset` / `Welcome to Flux Client!` /
`Ready for authentication` / `Please wait...` / `flux/loginbackground.png`。

**注意 `GET HWID`**：界面上有一个按钮专门用来显示 HWID，
说明 HWID 是账号体系的一等公民（用于换机限制），而不是附属信息。

### 1.2 会话状态载体

```java
public class zwr {
    public static prq tgs;                        // IRC 会话根对象
    public static prq ooi() { return tgs; }        // 全部 Java 侧访问入口
}

public class prq {
    public LoggedPacket dbd;                       // ← 登录成功凭证；未登录 = null
    public ClientNetwork yjm;
    public Channel cuv;

    public native void lz_();
    public native void onCommandEvent(String);
    public native void onLoggedEvent(LoggedPacket);              // ← 写入 dbd
    public native void onReceivedMessage(String, String, String);
    public native void onSuccessfulSendMessageEvent();
    public native void d7q(String);
}
```

**取证要点**：对整个 JAR 做 `putstatic zwr.tgs` / `putfield prq.dbd` 的全量扫描，
**零命中**。这两处状态只能由 JNI 写入 —— 这就是"校验在原生层"的字节码级证据。

### 1.3 数据载体（反射驱动）

`LoggedPacket` 被 `jiz` 和 `q08` 使用；但 `LoginPacket` / `HandshakePacket` /
`EncryptPacket` **在 Java 侧零引用**。它们的实现里塞满了

```java
Class   f(long);
Field   c(Class, String, Class);
Method  c(Class, String, Class, Class[]);
MethodHandle b(Lookup, MutableCallSite, String, MethodType, long);
```

这类访问器 —— 这是**专为"被原生代码反射驱动"而设计**的数据载体。
换句话说，这五个包类构成了 Java ↔ native 之间的 ABI 层。

### 1.4 IRC 协议包（`irc-1.3.jar`）

| 包 | 字段 | 作用 |
|---|---|---|
| `HandshakePacket` | `key`, `sign`, `i` | 握手 |
| `RespondHandshakePacket` | `key` | 服务端应答 |
| `EncryptPacket` | `payload:byte[]`, `gzip:boolean`, `packetSign` | 加密载荷 |
| `LoginPacket` | `user`, `userPassword`, **`hwid`** | **账号 + 密码 + HWID 上报** |
| `LoggedPacket` | `token`, `verifySign`, `i` | 成功凭证 |

握手用了签名（`sign` / `verifySign` / `packetSign`），配合原生加解密
（`an9.jrp` / `an9.otn`）与原生哈希（`kgt.vyp(String,String)J`），
构成一个 Java 侧无法伪造的通道。

---

## 2. Java 侧**没有**什么

这一点比"有什么"更重要，它划定了绕过的边界：

| 不存在的东西 | 检查方式 |
|---|---|
| HWID 采集逻辑 | 全 JAR 无 `ManagementFactory` / `NetworkInterface.getHardwareAddress` / `wmic` / 注册表 MachineGuid 相关字符串 |
| 密码哈希/校验 | 无任何"本地比对"逻辑；密码只被装箱送进 native |
| 登录态写入 | 无 `putstatic zwr.tgs` / `putfield prq.dbd` |
| 校验结果分支 | `qih` 里没有 "if 校验通过 then 放行"，只有 `mjy()` 一个 native 调用 |

Java 侧唯一与"授权"有关的分支，就是主菜单那个门禁（下一个文件详述）。

---

## 3. `sms`：三条身份通道的接管

```java
public class sms extends com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService {

    public sms(YggdrasilAuthenticationService svc, String certName) {
        // certName == "MLv5_Netease.der" 或 "MLv5_Yggdrasil.der"
        // 用 X509EncodedKeySpec 载入公钥；失败则抛
        //   "Missing/invalid yggdrasil public key!"
    }

    @Override public void joinServer(GameProfile profile, String serverId, String accessToken) {
        if (网易通道) {
            // 连 127.0.0.1 的 NeteaseLauncher IPC
            // 文案："Connected To NeteaseLauncher - ipaddr:"
            //       "Authentication Failed. Check your NeteaseLauncher!"
        }
        String chosen = JOptionPane.showInputDialog(null, "Choose your username", "NEL", ...);
        String uuid   = sms.jbn(chosen);
        // 反射写入 profile.name / profile.id
        // 改写 c05.vz1().s41 = new rh0(chosen, uuid, "", "mojang")
    }
}
```

配套字面量：`Authentication Failed. Wrong UUID!` / `Wrong UserName!` /
`Choose your username` / `NEL` / `Missing/invalid yggdrasil public key!`。

也就是说这个客户端**同时**接管了 Mojang（authlib）、TheAltening 和网易启动器
三条身份通道，并把结果直接写进客户端自己的会话对象 —— 这正是"第三方登录 /
小号"类客户端的典型做法。

内嵌的两张 TLS 固定证书：

| 文件 | SHA-256 |
|---|---|
| `MLv5_Netease.der` | `40F34E3E1785893CABB961821B4E4E82B5E2488262ACFBC6170FDB89ED9E91F9` |
| `MLv5_Yggdrasil.der` | `4A3F31581C5B9BCE0E53DD79A98D2DA53FA5E116C3A16C3C36DB991F152B2554` |

---

## 4. 附带发现：Alt 生成通道

`qih` 的登录是"用 Flux 账号"；而 `ib7` 是"用 API Key 换别人的 MC 账号"：

```
https://killaura.cn/gc.php?key=<KEY>&type=<1|10|20>
    type=1  → "Get Hypixel 1+"
    type=10 → "Get Hypixel 10+"
    type=20 → "Get Hypixel 20+"
回复：code,msg,acc      其中 acc = "user:pass"
code == "1" → zfs.eoj(user, pass) → new x1l(...) → qd_.oyx.add(0, x1l)
```

这条通道**不需要 Flux 账号**，因此登录绕过对它没有影响；
但它同样依赖 `cfu.q4z` 这个原生 HTTP 实现。

`nn2`（Alt Manager）里另有 `mcbaozi.com`、`http://www.enalts.org`、
`Premium: `、`Hypixel 1+ 仅0.2元`、`高质量黑卡` 等购买入口。

---

## 5. 未解

* HWID 具体怎么算、包含哪些硬件特征 —— 在加壳模块里；
  静态候选是 `dr9.if3()Ljava/lang/String;`（无参 native 返回 String），**未证实**。
* `LoginPacket.hwid` 从哪个 native 调用被填充 —— 需要脱壳后看注册点。
* 服务端在收到 `LoginPacket` 后如何比对 HWID —— 纯黑盒，
  且本工程不对其发起任何请求。
* `mjy()` 内部是否先做本地预校验 —— 未脱壳无法判断。
