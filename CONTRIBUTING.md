# 贡献指南

## 这个工程最需要什么

按价值排序：

1. **类名映射**（`mappings/classes.yaml`）——把 `a07` 变成有意义的名字。这是所有其他工作的地基。
2. **原生层脱壳**（`docs/analysis/04-native-layer.md`）——最大的未知，需要运行期 dump。
3. **未解密字符串**（1,779 个调用点）——主要是 OptiFine 类，卡在 GL 上下文初始化。
4. **工具链改进**——尤其是一个输出 `.srgn`/Enigma/ProGuard map 的导出器，
   让映射能直接被 Recaf / Enigma 使用。

## 硬性要求

### 不要提交厂商代码

`reference/` 与 `archive/` 已在 `.gitignore` 中。CFR 反编译产物、提取出的 `.class`、
`Flux.jar`、`libsoter.dll` 都**不要**入库。原因见 [NOTICE.md](NOTICE.md)。

文档里引用少量反汇编片段来说明某个发现是没问题的，但请控制在"证明这一点所必需"的范围内。

### 每个结论都要带证据

`classes.yaml` 的 `evidence` 字段不是装饰。写清楚你是**怎么知道的**：

```yaml
# 好
evidence: >-
  q08.initGui adds new q08$_r5(this, new iun(this), "Single Player"),
  which fixes the meaning of iun without ambiguity.

# 坏
evidence: "looks like the singleplayer screen"
```

### 置信度要诚实

`confirmed` / `strong` / `inferred` 三档的定义见 [mappings/README.md](mappings/README.md)。
**一个带 `inferred` 的猜测比没有条目更糟**，因为下一个人要花时间去证伪它。

宁可写"未解"并把它放进 `mappings/README.md` 的未映射队列，也不要塞一个听起来合理的名字。

### 不要联系目标的服务

`flux.today`、`killaura.cn`、`xinchen.space`、`api.hypixel.net` 等端点一律**只做静态分析**。
不要为了"验证协议"去发请求。需要真实报文的话，用于复现的 fixture 必须来自
你**自己搭建的**本地服务端或回环抓包。

### 不要跑原生组件

`libsoter.dll` 是加壳的反篡改 + 反作弊模块。静态解析 PE 头/段表可以；
`System.load` 它、或启动完整客户端，都不要在贡献流程里做。

## 提交流程

```
git checkout -b map/<class>            # 例如 map/gui-multiplayer
# ... 修改 mappings/classes.yaml 或 docs/ ...
git commit -m "map: identify s9r as GuiMultiplayer"
```

提交信息用 `map:` / `docs:` / `tools:` / `fix:` 前缀。

如果你的改动影响到生成文件（`mappings/class-index.tsv` 等），请一并重新生成：

```powershell
python tools/gen_mappings.py <workdir> <workdir>/FluxClasses mappings
```

## 工具链约定

* **Python**：仅标准库。不要引入第三方依赖——分析脚本要在只装了 Python 的机器上跑得起来。
* **Java**：JDK 17+ 编译，但产物要能在 JVM 8 上运行（目标客户端是 1.8）。
* **Node.js**：只在下载依赖库时用，别把 Node 变成运行时依赖。
* 脚本一律**失败即停**（fail-closed）。补丁类工具在字节不匹配时必须报错退出，
  绝不能"尽力而为"地写坏一个 class。

## 补丁类改动

`patches/` 下的任何改动必须同时给出：

1. 修改前后的十六进制字节；
2. 为什么这样改是**栈中性**的（或说明它为什么不需要是）；
3. `scripts/verify.ps1` 的三项验证全部通过。

如果引入了新的分支目标，记得检查 `StackMapTable`：
带栈映射表的类**不允许存在不可达代码**，分裂验证器会直接报
`VerifyError: Expecting a stackmap frame at this location`。
（这一点在 `patch_login.py` 里有注释说明，是踩过的坑。）
