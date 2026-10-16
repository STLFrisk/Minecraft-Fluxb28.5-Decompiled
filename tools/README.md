# tools/

分析工具链。**只用标准库**（Python）/ **只用 JDK**（Java），
不引入第三方依赖 —— 这些脚本要在只装了 Python 或只装了 JDK 的机器上跑得起来。

## 流水线

```
Flux.jar
  │
  ├─[1] harvest.py ────────────► index/classes.json, member_index.json, class_index.json
  │        解析全部 .class 的常量池，抽取字面量、成员引用、类引用
  │
  ├─[2] callscan.py ───────────► index/callsites.tsv
  │        定位每个 ZKM invokedynamic 字符串调用点，反解出 (n, l)
  │
  ├─[3] patch_native.py ───────► FluxClasses_patched/ + 补丁 jar
  │        把 invokestatic v6ma.Ex(I)V 改成 pop;nop;nop（栈中性）
  │        —— 否则约 440 个类无法离线完成初始化
  │
  ├─[4] DumpStrings.java ──────► plain2/strings_plain.tsv, strings_errors.tsv
  │        JVM 夹具：每类独立 URLClassLoader，调用目标自己的解密函数
  │
  ├─[5] annotate.py ───────────► src_ann/
  │        把明文写回反编译源码，产出可读代码
  │
  └─[6] gen_mappings.py ───────► mappings/class-index.tsv, native.yaml, strings.tsv
```

补丁流水线（独立于上面）：

```
patch_login.py    → patch_out/    P1 + P2
patch_welcome.py  → patch_out2/   P3（在 P1 之后跑，因为要追加常量池）
make_patch_report.py → patches/patch_report.json
validate_patch.py → 可达性证明
VerifyPatch.java  → JVM 字节码校验
DynamicGateTest.java → 动态对照实验
```

## 文件说明

| 文件 | 语言 | 作用 |
|---|---|---|
| `harvest.py` | Python | 类文件常量池解析；产出全类索引 |
| `callscan.py` | Python | **核心库**。完整指令长度表、`wide`/`switch` 支持、ZKM 调用点反解、`key ^ const` 符号化。被其它脚本 import |
| `annotate.py` | Python | 把解密字符串写回反编译源码 |
| `patch_native.py` | Python | 中和 `v6ma.Ex` 原生门禁 |
| `patch_login.py` | Python | P1 + P2；fail-closed（字节不符即退出） |
| `patch_welcome.py` | Python | P3；含常量池追加 |
| `validate_patch.py` | Python | 控制流可达性证明（根含异常处理器） |
| `make_patch_report.py` | Python | 汇总字节级补丁报告 |
| `gen_mappings.py` | Python | 生成 `mappings/` 的自动部分 |
| `find_new.py` | Python | 定位 `new <cls>` 调用点 |
| `find_field_writes.py` | Python | 定位 `putstatic` / `putfield`（用于证明"某字段 Java 侧从不写"） |
| `search_strings.py` | Python | 在解密字符串表里按正则检索 |
| `pe_triage.py` | Python | PE 头/段表/导入导出静态解析（用于 `libsoter.dll`） |
| `filter_calls.py` | Python | `callsites.tsv` 过滤 |
| `DumpStrings.java` | Java | **核心夹具**。正常路径 + `Unsafe` 回退路径 |
| `VerifyPatch.java` | Java | 强制链接 + 初始化，检出 `VerifyError` |
| `DynamicGateTest.java` | Java | 记录型类加载器 + `allocateInstance`，动态验证门禁 |
| `make_report_docx.py` | Python | 生成 Word 版交付报告（需 python-docx） |
| `fetchlibs.js` / `fetchmore.js` / `dl.js` | Node | 从 Maven 下载 MC 1.8 依赖库 |

## `callscan.py` 的指令长度处理

这是整个工具链最容易出错的地方。踩过的坑都写在
[`../docs/analysis/01-string-decryption.md`](../docs/analysis/01-string-decryption.md) §3。
简单说：**操作数长度不含操作码本身**，算下一条指令地址时要 `1 + len`；
算错了会静默解错位，产生看起来合法的假操作码。

## 第三方工具

| 工具 | 版本 | 来源 | 用途 |
|---|---|---|---|
| CFR | 0.152 | `https://www.benf.org/other/cfr/` | Java 反编译 |
| javap | JDK 17.0.19 | Oracle JDK | 反汇编对照 |

CFR 不在本仓库中（体积 + 许可）。`scripts/bootstrap.ps1` 会提示你自备。
`tools/cfr.jar` 的 SHA-256：`F686E8F3DED377D7BC87D216A90E9E9512DF4156E75B06C655A16648AE8765B2`。

## 约定

* 补丁类脚本一律 **fail-closed**：字节不匹配、偏移不符预期、跨度不对，
  都必须 `raise SystemExit` 退出，绝不"尽力而为"地写坏一个 class。
* 任何需要判断"某分支不会走"的地方，都要用 `DynamicGateTest` 做对照实验，
  **不要**依赖对混淆器的假设（见 `docs/analysis/05-login-bypass.md` §5）。
