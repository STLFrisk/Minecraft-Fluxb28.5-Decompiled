# patched-classes/ — 补丁后的 .class 文件

这个目录在仓库中是空的：`*.class` 已被 `.gitignore` 排除。

原因见 [`../../NOTICE.md`](../../NOTICE.md) —— 补丁后的类文件是**目标程序的衍生作品**，
把它们提交进仓库等于在分发 Flux 作者的代码。本仓库交付的是补丁的**描述与工具**，
产物在你自己的机器上生成。

## 生成

```powershell
powershell -ExecutionPolicy Bypass -File ..\..\scripts\bootstrap.ps1 -FluxJar <path\to\Flux.jar>
powershell -ExecutionPolicy Bypass -File ..\..\scripts\build.ps1
```

跑完后这里会出现：

| 文件 | 来源 | 说明 |
|---|---|---|
| `q08.class` | `work/patch_out2/q08.class` | P1（偏移 22/35）+ P3（偏移 541/590），常量池追加 2 项 |
| `jiz.class` | `work/patch_out2/jiz.class` | P2（偏移 108） |

## 核对

字节级期望值在 [`../patch_report.json`](../patch_report.json)。
反汇编对照在 [`../../evidence/q08_drawScreen_patched.javap.txt`](../../evidence/q08_drawScreen_patched.javap.txt)。

要看补丁是否真的生效，跑：

```powershell
powershell -ExecutionPolicy Bypass -File ..\..\scripts\verify.ps1
```

它会做可达性证明、JVM 字节码校验（含畸形补丁对照）、动态双组对照实验。
