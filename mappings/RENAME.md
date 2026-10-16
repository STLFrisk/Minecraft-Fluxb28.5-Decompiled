# 符号重命名说明（ZKM 混淆名 → 可读标识符）

本文件记录把 ZKM 短标识还原为可读名字的**依据与范围**，以及产物位置。

| 文件 | 内容 |
|---|---|
| `rename-map.tsv` | `tier / original / renamed / hits` —— 实际执行的全部替换及命中次数 |

---

## 产物

| 目录 | 说明 |
|---|---|
| `reference/decompiled-bypassed-vineflower/` | **原始混淆名版本**，7,421 个文件 / 117.4 MB —— 未经改写，是重命名可核对的基准 |
| `reference/decompiled-bypassed-named/` | **命名版本**，7,421 个文件 / 117.7 MB —— 类名、方法名、字段名已还原 |

**两棵都保留。** 命名版便于阅读，原始版便于与字节码逐字对照（例如核对某条 `invokevirtual` 在常量池里的真实名字）。

重命名对象是**当前 34 补丁版本的成品 jar**，因此命名版里也能看到补丁痕迹（`Module.forEach`、`FluxBus.sync`、`ConfigManager.zj2` 前置调用等）。

---

## 为什么不能一次性全局替换

ZKM 的名字是 3 字符短标识，**同名不代表同义**。用 `tools/check_rename_safety.py` 从字节码枚举"每个名字由哪些类声明"，结论是：

| 名字 | 声明类数 | 能否全局重命名 |
|---|---|---|
| `tp_` `z5z` `kkj` `tb8` | 1（`ar7`） | ✅ |
| `zkf` `qza` `d2z` `ixy` | 1（`j1s`） | ✅ |
| `__x` `mn9` `vpm` `a65` | 1（`mtl`） | ✅ |
| `_k4` `a2k` `t8a` `gqz` `bxh` | 1（`szk`） | ✅ |
| `b6k` `k27` `ohn` | 1（`fyk`） | ✅ |
| `nf1` | **2**（`xbs`、`ayg`） | ❌ |
| `ron` | **34** | ❌ |
| `w4v` | **26** | ❌ |
| `i__` | **27** | ❌ |
| `b` | **708** | ❌ |
| `d7c` | 4（`cn7`/`crk`/`c_3`/`dzm`） | ✅ **验明同义**（都是"取值"） |
| `aze` | 2（`cn7`/`dzm`） | ✅ **验明同义**（都是"写值"） |

因此分三层执行。

### Tier A —— 类名（全局）

类名是唯一 token，替换使用 `(?<![\w$.])名字(?![\w$])` 边界，**拒绝匹配 `.` 之后的位置** —— 与类同名的字段（`obj.ar7`）不会被误伤。覆盖 60 余个类：

```
c05→Minecraft      kh3→WorldClient     l86→EntityPlayerSP   g_3→Entity
ar7→Module         j1s→SubEngine       kgt→ModuleRegistry   zwr→ClientState
mtl→EventBus       vlc→Event           szk→ConfigManager    _x3→SettingRegistry
dzm→Setting        cn7→BooleanSetting  crk→NumberSetting    c_3→ModeSetting
fyk→KillAura       xbs→AuraEngine      e9p→AuraEngineAAC    bb5→RotationHelper
q08→MainMenuScreen qih→LoginScreen     prq→Session          jiz→TokenGuard
fkf→ClickGui       ers→GuiPanel        ib3→GuiHandler       jej→HudRenderer
v6ma→NativeLoader  t9d→OpaquePredicate nhs→Timer            yn6→ConfigName
```

### Tier B —— 单声明类的成员（全局）

只对**声明类唯一**（或验明同义）的名字全局替换：

```
d7c→getValue      n1j→setValue     zkf→getName          qza→prepare
d2z→setActive     w4v→onUpdate     i__→onRender         zj2→getModuleRegistry
up0→getConfigManager  _k4→loadConfig  a2k→loadBinds     j02→saveBinds
__x→register      mn9→unregister   vpm→invokeHandler    a65→dispatchTo
b6k→isValidTarget k27→onRenderTargets  o_a→onMotionEvent
x9y→attack        a3o→computeRotation   y6j→collectTargets
```

### Tier C —— 模块生命周期（限定作用域）

`ron`/`ne2`/`asw`/`dv9`/`yse`/`klu` 有 34 个类各自声明，**全局替换会把无关方法合并**。因此仅在两类文件内替换：

1. `Module.java` 自身；
2. 任何 `extends Module` 的类型（98 个功能模块）。

在这些文件里 `.ron()` 就是模块启用钩子：

```
ron→onEnable   ne2→onDisable   asw→setSubEnginesEnabled
dv9→setEnabled yse→onEnabledChanged  klu→isEnabled
iio→enabled    vlm→registrationEnabled  _w6→subEngines  isg→modeSetting
```

**其余 33 个声明 `ron` 的类保持原名** —— 这是有意的取舍：宁可局部不一致，也不制造错误的语义合并。

---

## 效果抽样

```java
// AuraEngine.java（原 xbs.java）
public void attack() { ... }
private java.util.List collectTargets(boolean playersOnly) { ... }
private static boolean passesFilter(Entity e) { ... }
public native float[] computeRotation(EntityLivingBase e);
public void onPlayerUpdate(PlayerUpdateEvent event) { ... }

// KillAura.java（原 fyk.java）
public void onEnable()  { ... }
public void onDisable() { ... }
public void onRenderTargets(RenderEvent event) { ... }
public static boolean isValidTarget(Entity entity, double range) { ... }
    // 函数体内：
    return isValidTarget(var0, (double) w1a.getValue().floatValue());
```

反编译注释里的引用同步更新（`// 221: invokevirtual AuraEngine.computeRotation`），文件也按类名改名（`ar7.java` → `Module.java`）。资源文件（1,991 个 json、1,884 个 png、着色器、语言文件、两张 `.der` 固定证书）已完整复制。

---

## 复现

```powershell
# 1. 对成品 jar 反编译（原始混淆名树）
java -Xmx6G -jar work/tools/vineflower.jar -jrt=1 -dgs=1 `
     releases/Flux_login_bypassed.jar `
     reference/decompiled-bypassed-vineflower

# 2. 校验这棵树确实来自 34 补丁版本（而不是只看时间戳）
python tools/verify_decompiled_tree.py reference/decompiled-bypassed-vineflower

# 3. 重命名 -> 独立命名树（不原地改写）
python tools/rename_decompiled.py `
       reference/decompiled-bypassed-vineflower `
       reference/decompiled-bypassed-named `
       mappings/rename-map.tsv

# 4. 文件按类名改名 + 复制资源
python tools/finalize_named_tree.py `
       reference/decompiled-bypassed-vineflower `
       reference/decompiled-bypassed-named

# 审计重命名是否安全（枚举每个名字的声明类）
python tools/check_rename_safety.py work/pristine work/diag
```

---

## 已知局限

| 项 | 说明 |
|---|---|
| 命名覆盖率 | 类 60+ / 成员 100+，相对 2,703 个类、27,633 个方法仍是少数 —— 覆盖的是**分析中有确证的部分**，其余保持原名 |
| Tier C 的局部不一致 | 上文所述取舍 |
| 1,778 条未解密字符串 | 主要为 OptiFine 类，依赖 GL 上下文初始化，因此部分常量仍是数字 |
| 41 个 native 方法 | 只有签名，实现位于 WinLicense 虚拟化层（`.text` 在活动进程里熵值仍 7.94） |
| 重命名后不可编译 | 这是**阅读导向**的源码树，不是可构建工程：原始类本身混淆，语义映射不完整 |
