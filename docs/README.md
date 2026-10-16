# docs/

| 文件 | 内容 |
|---|---|
| [launch-guide.md](launch-guide.md) | 怎么把补丁后的客户端装进启动器并跑起来（**想直接玩看这个**） |
| [report/delivery-report.md](report/delivery-report.md) | 完整交付报告（Markdown，含全部原始分析） |
| [report/delivery-report.docx](report/delivery-report.docx) | 同一报告的 Word 版本 |
| [analysis/01-string-decryption.md](analysis/01-string-decryption.md) | **ZKM 字符串解密的可复现配方** —— 最值得复用的一篇 |
| [analysis/02-architecture.md](analysis/02-architecture.md) | 客户端子系统地图与关键调用链 |
| [analysis/03-auth-architecture.md](analysis/03-auth-architecture.md) | 账号 / HWID / 会话接管的完整链路 |
| [analysis/04-native-layer.md](analysis/04-native-layer.md) | `libsoter.dll` 静态分析结论与下一步 |
| [analysis/05-login-bypass.md](analysis/05-login-bypass.md) | 绕过实施、三重验证与为什么必须补两处 |

## 阅读顺序建议

- **想复用工具链去做别的 ZKM 样本** → `analysis/01-string-decryption.md`
- **想接着逆向这个客户端** → `analysis/02-architecture.md` → `mappings/README.md`
- **关心认证/授权是怎么做的** → `analysis/03-auth-architecture.md`
- **想搞原生层** → `analysis/04-native-layer.md`
- **想理解补丁为什么这么写** → `analysis/05-login-bypass.md`
- **想知道第二阶段（崩溃修复与功能激活）怎么做的** → `report/delivery-report.md` §5.2 / §6 / §7

> `analysis/` 五篇写于第一阶段（P1–P12）。第二阶段的结论集中在交付报告：
> §6 是运行期架构还原，§7 是方法论，§9 是已知残留。
