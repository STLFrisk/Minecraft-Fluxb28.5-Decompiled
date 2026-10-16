# 在启动器里跑起被绕过的 Flux

> 本文只讲**怎么装和怎么启动**。补丁原理见 [`report/delivery-report.md`](report/delivery-report.md)，
> 分析过程见 [`analysis/`](analysis/)。

---

## 一、安装

安装脚本**不预设任何路径**，目标由参数给出。`<MC>` 指你的 `.minecraft` 目录。

```powershell
# 最小安装：只替换客户端 jar
powershell -File scripts/install-bypass.ps1 -MinecraftRoot <MC>
```

它会：

| 动作 | 位置 |
|---|---|
| 备份原版 | `<MC>\versions\Flux\Flux.jar.pre-backup` |
| 写入绕过版 | `<MC>\versions\Flux\Flux.jar` |
| 打印新 jar 的 SHA-256 前 16 位 | 用于与 `releases/Flux_login_bypassed.jar` 核对 |

**回滚**（三条都会还原）：

```powershell
powershell -File scripts/install-bypass.ps1 -MinecraftRoot <MC> -Rollback
```

### 可选的 JRE 补丁

只有当客户端**因 `java.awt.Color` 越界而崩溃**时才需要这一步（成因见报告 J1）。
它把一份 JRE 复制到 `<MC>` 的上一级、替换 `rt.jar` 里的 `Color.class`，并把 PCL2 的
Java 指向改过去 —— **系统 JRE 不会被动到**。

```powershell
powershell -File scripts/install-bypass.ps1 -MinecraftRoot <MC> -JreSource <原始 JRE 8u481 目录>
```

不给 `-JreSource` 就跳过这一步。

---

## 二、启动

1. 打开启动器（PCL2 / HMCL / Prism 等），版本列表里选 **Flux**
2. 用「**离线 / 第三方登录**」启动
3. **必须把该版本的 Java 指定为 Java 8**

### 为什么必须 Java 8

Flux 是 Minecraft 1.8。Java 17 / 21 启动 1.8 会因为 LWJGL 2.9.4 与反射限制直接崩溃。

| 启动器 | 设置位置 |
|---|---|
| PCL2 | 设置 → 启动选项 → Java 选择 |
| HMCL | 设置 → Java 管理 → 给该版本单独指定 |
| 官方启动器 | 配置文件 → 更多选项 → Java 可执行文件 |

选择任意 **Java 8** 运行时即可（`jre1.8.0_481` 或启动器自带的 1.8 版本）。

### 内存

客户端内建 OptiFine + ViaVersion 系跨版本库，建议 `-Xmx2G` 或 `-Xmx3G`。

---

## 三、启动后的预期表现

| 现象 | 说明 |
|---|---|
| 不再出现 `USERNAME` / `PASSWORD` / `LOGIN` / `GET HWID` 界面 | 这就是绕过生效 |
| 直接停在 Flux 主菜单（Single Player / Multi Player / Alt Manager / Options / Quit Game） | 正常 |
| 右上角欢迎语只有 `Welcome, ` 而没有名字 | 正常。原版这里是 IRC 登录后的用户名，未登录时为空（见报告 P3） |
| Alt Manager 里的 "NPC Alt Generator" 仍不可用 | 那需要 `killaura.cn` 的 API Key，属于**服务端**校验，与登录绕过无关 |
| 联机时用的是启动器里填的离线 ID | 客户端自带 `sms` 会话接管，会按启动器参数改写 GameProfile |

---

## 四、故障排查

### 启动即崩 / 主菜单空白

先确认用的是 Java 8（见上）。若仍崩溃，看 `logs/latest.log` 的最后一段异常 ——
报告 §8.4 列出了分阶段的现象与对应补丁，比 `crash-reports/` 里的 `-- Head --` 段更可信。

### `UnsatisfiedLinkError` / 找不到 `META-INF/Soter`

客户端启动时会把 jar 里的 `META-INF/Soter`（50 MB 的 `libsoter.dll`）释放到临时目录再
`System.load`。杀软拦截这个释放行为会导致原生部分失败：把客户端的临时目录加白名单。

### 报缺少 `flux:irc:1.3` 之类的库

`releases/bundled-libraries/` 里的几个依赖库没有随仓库分发（属于第三方，见 `NOTICE.md`）。
从你自己的整合包 `libraries/` 目录补齐即可。

### 启动器提示缺少 `assets/indexes/1.8.json`

先用启动器**安装一次官方 1.8 或 1.8.9**，把资源补齐，再启动 Flux。

---

## 五、自己从零重建

```powershell
# 1. 用你手上的原始 Flux.jar 重建整个分析工作区
#    （提取类 → 取公共依赖 → 反编译 → 定位字符串调用点 → 批量解密 → 重生成映射）
powershell -File scripts/bootstrap.ps1 -FluxJar <原始 Flux.jar>

# 2. 应用全部 34 组补丁并组装成品
powershell -File tools/build-jar.ps1

# 3. 装入启动器
powershell -File tools/build-jar.ps1 -Install -MinecraftJar <MC>\versions\Flux\Flux.jar
```

`bootstrap.ps1` 唯一的出站流量是从公共 Maven 仓库拉 Minecraft 依赖 —— **全程不联系任何
Flux 端点**（见 `NOTICE.md` §3）。

> `scripts/build.ps1` 与 `scripts/verify.ps1` 是 **P1–P3 阶段**的流水线与三重验证，
> 保留作为方法记录；当前 34 组补丁的权威构建是 `tools/build-jar.ps1`。

---

## 六、卸载

```
<MC>\versions\Flux\Flux.jar.pre-backup   →  覆盖回 Flux.jar
```

若装过 JRE 补丁，再用 `-Rollback` 或手动删除 `<MC>` 上一级的 `jre8-flux` 目录，
并把 `<MC>\versions\Flux\PCL\config.json.flux-orig` 覆盖回 `config.json`。
**系统 JRE 从未被改动。**
