# reference/ — 反编译产物（本地生成，不入库）

这个目录在 `.gitignore` 中。原因见 [`../NOTICE.md`](../NOTICE.md)：
CFR 的反编译输出是目标程序的**衍生作品**，把它提交进仓库等于在分发
Flux 作者与 Mojang 的代码。本工程的价值在分析与方法，不在镜像别人的客户端。

## 自行生成

```powershell
powershell -ExecutionPolicy Bypass -File ..\scripts\bootstrap.ps1 -FluxJar C:\path\to\Flux.jar
```

跑完后这里会出现：

| 目录 | 内容 |
|---|---|
| `decompiled/` | CFR 对 `Flux.jar` 的全量反编译 |
| `decompiled-annotated/` | 同上，但把 ZKM 解密调用**就地替换成明文常量**（推荐阅读这一份） |
| `decompiled-irc/` | `irc-1.3.jar` 的反编译（`today.flux.irc.*` 协议包） |

## 阅读建议

* 优先读 `decompiled-annotated/` —— 明文字面量已经把绝大部分逻辑说明白了。
* 反编译产物里到处是 `oov`（ZKM 异常包装）和 `t9d.b()`（不透明谓词），
  读逻辑时直接跳过它们。
* 想定位某个类的作用，先用 [`../mappings/class-index.tsv`](../mappings/class-index.tsv)
  的 `hint` 列，再去对应文件。

## 单个类快速反编译

不必跑全量。全量约 13 MB 源码、耗时几分钟；单类只需：

```powershell
java -jar ..\tools\cfr.jar `
     --extraclasspath "<workdir>\libs\*" `
     --outputdir <workdir>\src_single `
     <workdir>\FluxClasses\q08.class
```

`--extraclasspath` 需要指向 Minecraft 1.8 的依赖库，
否则 CFR 会大量报 `CannotLoadClassException`（不影响主流程，但输出更难读）。
