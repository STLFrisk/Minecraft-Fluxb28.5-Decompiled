# 登录门禁绕过：实施、验证，以及为什么必须补两处

完整字节级记录见 [`../patches/patch_report.json`](../patches/patch_report.json)，
原始证据见 [`../evidence/`](../evidence/)。

---

## 1. 门禁长什么样

全 JAR 中 `new qih`（登录界面）**只出现一次**，在 `q08.drawScreen` 里：

```
 14: getstatic     zwr.tgs              <- 取会话根对象
 17: iload         6                    <- t9d.b() 的结果
 19: ifeq          35                   <- 不透明谓词分支
 22: ifnull        41                   <- 【路线 B】tgs == null → 登录界面
 25: goto          32
 28: invokestatic  oov.a(Throwable) ; athrow     <- ZKM 异常包装
 32: getstatic     zwr.tgs
 35: getfield      prq.dbd              <- 取登录凭证
 38: ifnonnull     60                   <- 【路线 A】已登录 → 正常菜单
 41: aload_0
 42: getfield      mnd:Lc05;            <- Minecraft 实例
 45: new           qih                  <- ★ 全 JAR 唯一的登录界面构造
 48: dup
 49: invokespecial qih.<init>()V
 52: invokevirtual c05.z2i:(Lgbe;)V     <- displayGuiScreen(qih)
 55: return
 56: invokestatic  oov.a(Throwable) ; athrow
 60: <正常菜单绘制>
```

两条通往 `41` 的路线：

| 路线 | 条件 | 现实中的取值 |
|---|---|---|
| B（偏移 22） | `t9d.b() != 0` 且 `zwr.tgs == null` | 未登录且原生层还没建会话对象 |
| A 的 fall-through（偏移 38） | `zwr.tgs != null` 且 `prq.dbd == null` | 原生层建了会话对象但尚未登录 |

---

## 2. 补丁

### P1 —— 门禁（`q08.drawScreen`，2 个站点）

| 偏移 | 原始 | 补丁后 | 语义 |
|---|---|---|---|
| 35–40 | `b4 00 84 c7 00 16` | `57 00 00 a7 00 16` | `pop; nop; nop; goto 60` —— 无条件走菜单 |
| 22–24 | `c6 00 13` | `57 00 00` | `pop; nop; nop` —— 路线 B 不再跳登录 |

### P2 —— 拆除自毁陷阱（`jiz.<init>`）

```java
if ((double) zwr.tgs.dbd.getToken().length() < fyk.mmr(1.0, 9.0)) {
    Unsafe u = ...;  u.putAddress(0L, 0L);   // 硬崩 JVM
}
```

| 偏移 | 原始 | 补丁后 |
|---|---|---|
| 108 | `b6 00 67`（`invokevirtual Unsafe.putAddress(JJ)V`） | `58 58 57`（`pop2; pop2; pop`） |

这是**针对绕过的反制**：如果有人把 `prq.dbd` 塞成一个 token 很短的假 `LoggedPacket`，
客户端会在截图任务创建时被主动崩溃。这就是"为什么不要伪造 `LoggedPacket`"的原因。

### P3 —— 未登录会话的空指针保护（`q08.drawScreen`，2 个站点）

```java
"Welcome, " + zwr.ooi().qr2().getUserName()
```

这条链**没有任何判空**，而 `zwr.tgs` 只有在原生层登录成功后才被写入。
绕过登录后它一直是 `null`，主菜单会**每帧**抛 `NullPointerException`，界面根本画不出来。

| 偏移 | 原始 | 补丁后 |
|---|---|---|
| 541 | `b8 01 18 b6 01 1c b6 01 21`（ooi → qr2 → getUserName） | `ldc_w <空串> + nop ×6` |
| 590 | 同上 | 同上 |

空字符串常量**追加到常量池末尾**，因此不重编号任何既有索引，
只需 `constant_pool_count += 2` 并把其后的代码整体后移 6 字节。

---

## 3. 三条必须遵守的字节码改写规则

### 规则 1：栈中性

三个站点原先各弹出 1 个引用（`getfield` 后 `ifnonnull` 消耗 1 个；
`ifnull` 消耗 1 个；三段调用链最终压入 1 个 String），
改写后仍各消耗/产出相同的栈型。这样 35 / 41 / 60 三个合并点的栈高与原版一致。

### 规则 2：不要制造不可达代码

类带 `StackMapTable`（Java 7+ 分裂验证器）。**第一版补丁就栽在这里**：
把 `goto` 放在 6 字节槽位的开头，后面 2 个填充字节变成不可达代码，JVM 直接拒绝：

```
java.lang.VerifyError: Expecting a stackmap frame
  Location: q08.drawScreen(IIF)V @39: nop
  Reason: Expected stackmap frame at this location.
```

正确做法：`goto` 放**槽位末尾** —— `pop; nop; nop; goto`（偏移 35/36/37/38）。

### 规则 3：`goto` 的偏移基准是 `goto` 自己的地址

不是下一条指令的地址。第一版还在这里差了一次：
`rel = target - (site + 1)` 算成 21，正确值是 `target - goto_offset`。

---

## 4. 三重验证

### 4.1 静态可达性（`tools/validate_patch.py`）

对指令图做 BFS，**根集合 = 方法入口 + 全部 10 个异常处理器起始 PC**
（`{0, 28, 56, 120, 149, 165, 183, 193, 222, 341}`），
刻意让异常边也无法"绕回"登录块：

| 对象 | 登录块（偏移 45）可达？ | 菜单跳转 `[32, 60]` 可达？ |
|---|---|---|
| 原版 `q08.class`（对照） | **是** | 是 |
| 补丁版 `q08.class` | **否** | 是 |

### 4.2 JVM 字节码校验（`tools/VerifyPatch.java`）

`Class.forName(name, true, loader)` 会先链接再初始化，因此畸形补丁会抛
`VerifyError` / `ClassFormatError`：

```
q08   LINKED OK (initialisation stopped later: NoClassDefFoundError: commons-lang3)
jiz   LINK+INIT OK
RESULT: every class linked and passed bytecode verification
```

**对照组**（故意把 `goto` 偏移改错）：

```
q08   *** VERIFICATION FAILURE: java.lang.VerifyError:
        Expecting a stackmap frame at branch target 32572
```

这条对照很重要 —— 它证明校验有检出能力，而不是"永远通过"。

### 4.3 动态执行（`tools/DynamicGateTest.java`）

用记录型 `URLClassLoader` 载入 `q08`，以 `Unsafe.allocateInstance` 绕过构造器
创建半成品实例，在**未认证状态**下调用 `drawScreen` 一次：

| 构建 | 异常 | 异常栈 | 判定 |
|---|---|---|---|
| 对照（门禁完好） | `ExceptionInInitializerError` | `gbe.<init>` ← **`qih.<init>`** ← `q08.drawScreen` | 登录界面被到达 |
| 补丁版 | `NullPointerException: eka.x05()` | 仅 `q08.drawScreen` | 登录界面从未被到达（直接进入菜单路径 60+） |

两个构建的认证状态相同（`zwr` 初始化失败 → `zwr.tgs == null`，即最坏情况），
唯一变量就是补丁本身。

---

## 5. 一个反直觉的发现，值得单独记下来

**不要假设 ZKM 的不透明谓词恒为 0。**

偏移 22 的 `ifnull 41` 一开始被判断为死代码（"`t9d.b()` 在 ZKM 里恒返回 0"），
所以第一版只补了偏移 35。动态对照实验**推翻了这个假设**：
在 `zwr.tgs == null` 的控制组里，执行实际进入了 `qih.<init>`，
说明当时 `t9d.b()` 返回了非 0、走的就是偏移 22 那条路。

`t9d.b()` / `t9d.c()` 是一对**有状态的**谓词，不是常量折叠。
任何基于"这个分支不会走"的判断，都必须用动态实验验证。

保留原版对照实验，是这次能发现该问题的唯一原因。

---

## 6. 这套绕过**没有**做的事

- 没有绕过 IRC 登录（在原生层 + 服务端）。
- 没有绕过 HWID 校验（在原生层 + 服务端）。
- 没有伪造 `LoggedPacket`。这是刻意的选择：`jiz` 的自毁逻辑专门针对这种做法，
  而且伪造的 token 在原生 IRC 通道里也用不了。
- 没有让客户端获得任何服务端权限。

**绕过的是"本地界面门禁"**：客户端不再强制你先登录才能看到主菜单。
需要真实账号的功能（IRC、联机鉴权）依然不可用。
