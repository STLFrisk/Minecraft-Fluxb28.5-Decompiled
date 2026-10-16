# 路线图

状态：`done` / `active` / `todo` / `blocked`

## M0 — 地基（已完成）

| 项 | 状态 | 产出 |
|---|---|---|
| 样本清点与保护机制识别 | done | `docs/report/delivery-report.md` §1 |
| ZKM 字符串解密方法 | done | `docs/analysis/01-string-decryption.md` |
| 工具链（常量池解析 / 调用点提取 / JVM 解密夹具 / 源码标注） | done | `tools/` |
| 14,315 条明文恢复（945 个类） | done | `mappings/strings.tsv` |
| native 方法全量清点（17 个类 / 41 个方法） | done | `mappings/native.yaml` |
| 全类统计索引（3,394 个类） | done | `mappings/class-index.tsv` |
| 认证架构还原 | done | `docs/analysis/03-auth-architecture.md` |
| 登录门禁绕过 + 三重验证 | done | `patches/`, `evidence/` |
| 可启动产物与一键安装 | done | `releases/` |

## M1 — 映射规模化（下一个里程碑）

| 项 | 状态 | 说明 |
|---|---|---|
| 导出器：`classes.yaml` → Enigma / ProGuard / SRGN | todo | 让映射能被 Recaf、Enigma、vineflower 直接消费。**最高性价比的单项工作。** |
| 映射队列前 20 个高频类 | todo | 见 `mappings/README.md` 的未映射队列 |
| `q08` 完整控制流还原（含不透明谓词） | todo | 目前只还原到门禁附近；整屏绘制逻辑仍未读 |
| IRC 协议包与 native 回调的对应关系 | todo | `prq` 的 6 个 native 回调 ↔ `irc-1.3.jar` 的事件 |

验收：`mappings/classes.yaml` 覆盖 `class-index.tsv` 中 `referenced_by >= 100` 的
所有类，且其中至少一半是 `confirmed`。

## M2 — 原生层

| 项 | 状态 | 说明 |
|---|---|---|
| `libsoter.dll` 段表与入口静态解析 | done | `docs/analysis/04-native-layer.md`；只识别出 4 个函数 |
| 脱壳方案选型 | todo | 运行期 dump `.boot` 解密后的内存 vs. 还原 unpacker stub |
| HWID 采集来源取证 | blocked | 依赖脱壳；静态候选是 `dr9.if3()` |
| IRC `LoginPacket.hwid` 的生成链 | blocked | 同上 |
| 反篡改 `v6ma.Ex(int)` 的检查内容 | todo | 有 41 个 native 方法，`Ex` 只是入口之一 |

## M3 — 剩余字符串

| 项 | 状态 | 说明 |
|---|---|---|
| 1,779 个未解密调用点归因 | active | 绝大多数属于 OptiFine 系，卡在 `Accessed Blocks before Bootstrap!` |
| 在无 GL 环境下预注册 MC 注册表 | todo | 需要先定位被改名的 `net.minecraft.init.Bootstrap` |

## M4 — 工程质量

| 项 | 状态 |
|---|---|
| `scripts/bootstrap.ps1` 端到端复现 | done |
| `scripts/verify.ps1` 三重验证自动化 | done |
| CI（GitHub Actions：在自备样本上跑 verify） | todo |
| `tools/` 单元测试（指令长度表、常量池解析） | todo |

## 明确不做

* 不实现、不改进、不文档化任何**作弊功能**（killaura、alt 生成、反反作弊等）。
  本项目只分析**认证与授权机制**。
* 不联系目标的任何服务端。
* 不在 `git` 仓库中镜像厂商代码或反编译产物。
* 不提供"能用的 Flux 账号"——绕过的是**客户端本地门禁**，
  IRC 登录与 HWID 校验在加壳原生模块与服务端，均未被绕过。
