# patches/

> 本目录记录的是**第一阶段（P1–P3）的客户端补丁**与 **J1 的 JDK 补丁**，
> 保留作为方法与字节级证据。**当前 34 组补丁的完整记录在
> [`../docs/report/delivery-report.md`](../docs/report/delivery-report.md) §5 与 §12.3**，
> 权威构建脚本是 [`../tools/build-jar.ps1`](../tools/build-jar.ps1)。

三次字节码改写，共 5 个站点。全部**栈中性**、**不引入不可达代码**。

机器可读的完整记录：[`patch_report.json`](patch_report.json)
（含每个站点的 `code_offset`、`before_hex`、`after_hex`）。

| 编号 | 类 | 方法 | 站点 | 作用 |
|---|---|---|---|---|
| **P1** | `q08` | `drawScreen(IIF)V` | 22, 35 | **登录门禁**：让唯一的 `new qih` 不可达 |
| **P2** | `jiz` | `<init>` | 108 | 拆除 token 过短即 `Unsafe.putAddress(0,0)` 的自毁陷阱 |
| **P3** | `q08` | `drawScreen(IIF)V` | 541, 590 | 未登录会话的空指针保护（`zwr.ooi().qr2().getUserName()`） |

三者的详细说明与验证证据：
[`../docs/analysis/05-login-bypass.md`](../docs/analysis/05-login-bypass.md)。

---

## J1 —— 唯一需要改动客户端之外的东西的补丁

[`java-awt-Color.patched.class`](java-awt-Color.patched.class) 是打过补丁的
`java/awt/Color.class`（7,835 字节），把 `testColorValueRange(IIII)V` 改成裸 `return`。

**仓库不包含 JRE 本身** —— 它是 Oracle 的专有发行版，`LICENSE` 指向
[OTN License Agreement](https://java.com/otnlicense)，禁止再分发；且真正必要的改动
只有这 7,835 字节，已经在这里了。

复现：

```powershell
# 从你自己的 JRE 8u481 lib/rt.jar 取出原始类，然后
python tools/patch_color.py <原始 Color.class> <输出>
# 与仓库里的产物核对（应完全相同）
#   sha256 10756193192322028911676151771596…
```

安装到 JRE 并让启动器使用它：`scripts/install-bypass.ps1 -JreSource <原始 JRE 目录>`。
完整说明见 [`../README.md`](../README.md) 的 J1 章节与报告 J1。

---

## 为什么是三个而不是一个

* **P2 是必需品**：只做 P1 的话，任何"伪造会话"的后续尝试都会撞上自毁陷阱；
  而且它是理解这个客户端防护思路的关键一环。
* **P3 是实测发现的必需品**：P1 之后静态分析显示 `drawScreen` 偏移 541/590
  在主菜单路径上**可达**，而那条链对 `zwr.tgs` 无判空 —— 不补 P3，
  主菜单会每帧 NPE。这是"补丁要验证到能跑"而不是"验证到能加载"的差别。

## 应用顺序

```powershell
python tools/patch_login.py    <workdir>/FluxClasses <workdir>/patch_out
python tools/patch_welcome.py  <workdir>/patch_out/q08.class <workdir>/patch_out2/q08.class
copy <workdir>/patch_out/jiz.class <workdir>/patch_out2/jiz.class
python tools/make_patch_report.py <workdir> patches
```

`patch_welcome.py` 必须在 `patch_login.py` **之后**跑：它往常量池追加条目并把
其后的代码整体后移 6 字节，因此它会重新解析类文件、重新定位站点。

## 两条硬规则

### 1. 栈中性

每个站点改写前后，操作数栈的净效果必须一致。
P1 的两处各消耗 1 个引用；P2 消耗 receiver + 2 个 long；
P3 原本压入 1 个 String，改写后仍压入 1 个。

### 2. 不能制造不可达代码

目标类带 `StackMapTable`。**把 `goto` 放在槽位开头会让尾随的填充字节变成
不可达代码，分裂验证器直接拒绝**：

```
VerifyError: Expecting a stackmap frame at this location.
  Location: q08.drawScreen(IIF)V @39: nop
```

因此 P1 写成 `pop; nop; nop; goto`（`goto` 在末尾），
而不是 `pop; goto; nop; nop`。这条规则坑过我们一次，写在这里免得下一位再踩。

## 不要做的事

* **不要伪造 `LoggedPacket`。** `jiz` 的自毁逻辑专门针对短 token，
  而且伪造的凭证在原生 IRC 通道里也用不了（见 `docs/analysis/03-auth-architecture.md`）。
* **不要"顺手"删掉 `t9d.b()` 的调用。** 它决定分支走向，
  而且**不是常量**（见 `docs/analysis/05-login-bypass.md` §5）。
* **不要在没有跑 `scripts/verify.ps1` 的情况下提交补丁。**
