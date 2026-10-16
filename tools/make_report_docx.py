#!/usr/bin/env python3
"""Build the Flux login-bypass delivery report as a DOCX.

Content is authored here (rather than converted from Markdown) so tables, code
blocks and CJK typography are all under explicit control.
"""
import os
import sys

from docx import Document
from docx.enum.table import WD_TABLE_ALIGNMENT
from docx.enum.text import WD_ALIGN_PARAGRAPH
from docx.oxml.ns import qn
from docx.shared import Pt, RGBColor, Cm

BODY_FONT = 'Microsoft YaHei'
MONO_FONT = 'Consolas'


def set_cjk(run, font=BODY_FONT):
    run.font.name = font
    rpr = run._element.get_or_add_rPr()
    rfonts = rpr.find(qn('w:rFonts'))
    if rfonts is None:
        rfonts = rpr.makeelement(qn('w:rFonts'), {})
        rpr.append(rfonts)
    rfonts.set(qn('w:ascii'), font)
    rfonts.set(qn('w:hAnsi'), font)
    rfonts.set(qn('w:eastAsia'), font)


def init_styles(doc):
    normal = doc.styles['Normal']
    normal.font.name = BODY_FONT
    normal.font.size = Pt(10.5)
    normal.element.rPr.rFonts.set(qn('w:eastAsia'), BODY_FONT)
    normal.paragraph_format.space_after = Pt(6)
    normal.paragraph_format.line_spacing = 1.15
    for name in ('Heading 1', 'Heading 2', 'Heading 3', 'Title'):
        st = doc.styles[name]
        st.font.name = BODY_FONT
        st.element.rPr.rFonts.set(qn('w:eastAsia'), BODY_FONT)
        st.font.color.rgb = RGBColor(0x1F, 0x38, 0x64)


def para(doc, text, bold=False, size=10.5, align=None, space_after=6):
    p = doc.add_paragraph()
    if align is not None:
        p.alignment = align
    p.paragraph_format.space_after = Pt(space_after)
    r = p.add_run(text)
    r.bold = bold
    r.font.size = Pt(size)
    set_cjk(r)
    return p


def bullets(doc, items, style='List Bullet'):
    for it in items:
        p = doc.add_paragraph(style=style)
        p.paragraph_format.space_after = Pt(2)
        r = p.add_run(it)
        set_cjk(r)


def code(doc, lines):
    p = doc.add_paragraph()
    p.paragraph_format.space_after = Pt(8)
    p.paragraph_format.left_indent = Cm(0.4)
    for i, ln in enumerate(lines):
        r = p.add_run(ln)
        r.font.name = MONO_FONT
        r.font.size = Pt(8.5)
        rpr = r._element.get_or_add_rPr()
        rf = rpr.makeelement(qn('w:rFonts'), {})
        rf.set(qn('w:ascii'), MONO_FONT)
        rf.set(qn('w:hAnsi'), MONO_FONT)
        rf.set(qn('w:eastAsia'), MONO_FONT)
        rpr.append(rf)
        if i != len(lines) - 1:
            r.add_break()
    return p


def table(doc, header, rows, widths=None):
    t = doc.add_table(rows=1, cols=len(header))
    t.style = 'Light Grid Accent 1'
    t.alignment = WD_TABLE_ALIGNMENT.CENTER
    hdr = t.rows[0].cells
    for i, h in enumerate(header):
        hdr[i].text = ''
        p = hdr[i].paragraphs[0]
        r = p.add_run(h)
        r.bold = True
        r.font.size = Pt(9.5)
        set_cjk(r)
    for row in rows:
        cells = t.add_row().cells
        for i, v in enumerate(row):
            cells[i].text = ''
            p = cells[i].paragraphs[0]
            r = p.add_run(str(v))
            r.font.size = Pt(9)
            set_cjk(r)
    if widths:
        for r_ in t.rows:
            for i, w in enumerate(widths):
                r_.cells[i].width = Cm(w)
    doc.add_paragraph().paragraph_format.space_after = Pt(4)
    return t


def build(out_path):
    doc = Document()
    init_styles(doc)

    doc.add_heading('Flux 客户端 — 登录验证绕过', level=0)
    para(doc, '逆向分析与完整交付报告', bold=True, size=13,
         align=WD_ALIGN_PARAGRAPH.CENTER)

    doc.add_heading('0. 摘要', level=1)
    para(doc, 'Flux.jar 是一个被 Zelix KlassMaster 12.0.4 深度混淆的 Minecraft 1.8 客户端。'
              '其“账号校验 + HWID 校验”并非由 Java 代码实现，而是由 META-INF/Soter 中一个 '
              '50 MB 的加壳 JNI 动态库 libsoter.dll 承担；Java 侧只保留 UI、状态与一个门禁判断。')
    bullets(doc, [
        '攻破 ZKM 字符串加密：从 16,168 个加密调用点恢复 14,389 条明文常量（945 个类），'
        '包含全部登录界面文案、API 地址、协议字段名与错误消息。',
        '定位唯一登录门禁 q08.drawScreen（Flux 主菜单）：全 JAR 中 new qih 只出现 1 次。',
        '定位账号与 HWID 校验的真实位置：17 个类声明 native 方法（登录 qih.mjy()、HTTP cfu.p6w(URL)、'
        '加解密 an9.*），全部由 libsoter.dll 经 RegisterNatives 提供。',
        '实施绕过并三重验证：静态可达性证明 + JVM 字节码校验 + 动态执行，全部通过。',
    ])

    doc.add_heading('1. 样本与保护机制', level=1)
    table(doc, ['条目', '大小', '说明'], [
        ['.minecraft/versions/Flux/Flux.jar', '69.8 MB', '主客户端：3,394 个 class + 4,014 个 assets'],
        ['.minecraft/versions/Flux/Flux.json', '5 KB', 'mainClass = net.minecraft.client.main.Main，assets 1.8'],
        ['.minecraft/libraries/flux/irc/1.3/irc-1.3.jar', '14.2 MB', 'Flux 自有 IRC 协议库（Kotlin，二次混淆）'],
        ['.minecraft/libraries/flux/viaversion/3.2.2/…', '5.5 MB', 'ViaVersion 跨版本库'],
    ], widths=[7.0, 2.2, 6.8])

    para(doc, 'Flux.jar SHA-256：506D7B5659846F4F440CC6CB2BAB69D0A38262A213A4C7F43521C5DF1964FE2E',
         bold=True)

    table(doc, ['保护层', '机制', '证据'], [
        ['名称混淆', '全部用户类改名，仅 Start 保留原名', '3,394 个类中仅 1 个人类可读类名'],
        ['字符串加密', 'DES/CBC/PKCS5Padding + invokedynamic 惰性解密，双层', '常量池水印 ZKM12.0.4'],
        ['流程混淆', '不透明谓词 t9d.b() / t9d.c() 撕裂控制流', 'q08.drawScreen 的 ifeq/ifnull/goto 组合'],
        ['常量隐藏', 'c.a(long,long,Object).a(long) 的 TEA 变体', 'c.java 中 new long[64] 密钥表'],
        ['原生反篡改', 'v6ma.Ex(int) 由原生库实现', '14 个类调用；缺 DLL 时 UnsatisfiedLinkError'],
        ['掉落原生库', 'META-INF/Soter 实为 50 MB x86-64 PE', '导出表仅 JNI_OnLoad，仅导入 2 个函数'],
        ['自毁保护', 'token 过短则 Unsafe.putAddress(0,0) 崩 JVM', 'jiz.<init>'],
        ['证书固定', 'MLv5_Netease.der / MLv5_Yggdrasil.der', 'sha256WithRSA X.509'],
    ], widths=[2.6, 7.0, 6.4])

    doc.add_heading('2. 方法论：恢复 ZKM 加密字符串', level=1)
    para(doc, 'ZKM 12 在每类 <clinit> 中的结构（以 ar7 为例，反汇编已验证）：')
    code(doc, [
        '  0: c.g() / MethodHandles.lookup() / c.a(L1,L2,cls)',
        ' 31: putstatic b:J                     <- 本类密钥 (long)',
        ' 56: Cipher.getInstance("DES/CBC/PKCS5Padding") + init(DECRYPT,key,IV=0)',
        '134: anewarray String                  <- 密文表',
        '284: putstatic c:[Ljava/lang/String;',
        '291: putstatic d:[Ljava/lang/String;   <- 解密缓存',
        '297: loop { doFinal(...); a([B)String; intern }',
        '336: v6ma.Ex(13)                       <- 原生反篡改（在字符串表构建之后！）',
    ])
    para(doc, '调用点形态：')
    code(doc, [
        'sipush   <n>',
        'ldc2_w   <K>',
        'lload N  (= 类密钥 ^ K0)  /  getstatic b:J',
        'lxor                       ->  l = 类密钥 ^ acc',
        'invokedynamic #X, 0        // e:(IJ)Ljava/lang/String;',
        '',
        'int n2 = n ^ (int)(l & 0x7FFF) ^ 0x23F0;',
        'key    = l 的 8 个大端字节;',
        '明文    = modifiedUTF8( DES_CBC_decrypt( table[n2], key, IV=0 ) );',
    ])

    table(doc, ['工具', '作用'], [
        ['harvest.py', '纯 Python JVM 常量池解析器（UTF8/String/Class/Methodref）'],
        ['callscan.py', '全类扫描 invokedynamic 字符串调用点，反向解 (n, lConst)，符号化化简 key^const'],
        ['DumpStrings.java', 'JVM 夹具：加载类 → 读类密钥 → 调用目标自身的解密函数'],
        ['annotate.py', '把反编译源码中的解密调用就地替换为明文常量'],
        ['patch_native.py', '将 invokestatic v6ma.Ex(I)V 就地改为 pop;nop;nop（栈中性）'],
    ], widths=[3.6, 12.4])

    para(doc, '三个关键工程发现：', bold=True)
    bullets(doc, [
        'ZKM 密钥派生是进程全局状态：共享类加载器会让后加载的类拿到错误密钥，'
        '表现为 BadPaddingException。改为每类独立 URLClassLoader 后，恢复量 1,806 → 9,565。',
        'Minecraft 注册表门禁：Block 的 <clinit> 抛 “Accessed Blocks before Bootstrap!”，'
        '需要多轮重试并先注册 Bootstrap。',
        '原生门禁位于字符串表构建之后，因此可中和 v6ma.Ex，或直接用 Unsafe 读取密文表自行解密内层。',
    ])

    table(doc, ['阶段', '恢复字符串', '覆盖类', '失败调用点'], [
        ['初次（共享加载器）', '1,806', '94', '14,362'],
        ['独立类加载器', '9,565', '606', '6,603'],
        ['+ 中和原生门禁', '14,389', '945', '1,779'],
    ], widths=[5.0, 3.5, 3.0, 3.5])

    doc.add_heading('3. 认证架构（账号 + HWID）', level=1)

    doc.add_heading('3.1 Flux 自有账号体系（flux.today）', level=2)
    table(doc, ['项目', '值'], [
        ['登录界面类', 'qih extends gbe (GuiScreen)'],
        ['输入框', 'omn rk7（用户名）/ s51 dll（密码）'],
        ['注册链接', 'https://flux.today/admin/register.php'],
        ['找回密码', 'https://flux.today/index.php/forgot'],
        ['按钮文案', 'USERNAME / PASSWORD / LOGIN / GET HWID / No Account? / Password Reset'],
        ['状态文案', 'Welcome to Flux Client! / Ready for authentication / Please wait...'],
    ], widths=[3.6, 12.4])
    para(doc, '关键点：qih 声明了两个 native 方法 —— mouseClicked(int,int,int)（登录按钮点击）'
              '与 mjy()（登录动作）。即点击 LOGIN 之后的全部逻辑（HTTP 请求、密码校验、'
              'HWID 采集与上报）都在原生库中。', bold=True)

    doc.add_heading('3.2 通信层：Flux IRC 协议', level=2)
    table(doc, ['协议包', '字段', '含义'], [
        ['LoginPacket', 'user, userPassword, hwid', '账号密码 + HWID 上报'],
        ['HandshakePacket', 'key, sign, i', '握手（签名 + 计数）'],
        ['RespondHandshakePacket', 'key', '服务端握手应答'],
        ['EncryptPacket', 'payload:byte[], gzip:boolean, packetSign', '加密载荷（gzip 标记 + 包签名）'],
        ['LoggedPacket', 'token, verifySign, i', '登录成功凭证（token + 验签）'],
    ], widths=[4.2, 5.6, 6.2])
    para(doc, 'LoginPacket / HandshakePacket / EncryptPacket 在 Java 侧零引用，'
              '包类内塞满 Class f(long) / Field c(...) / Method c(...) 等反射访问器，'
              '证明它们是“被原生代码反射驱动”的数据载体。')

    doc.add_heading('3.3 会话状态与唯一门禁', level=2)
    code(doc, [
        'public class zwr {  public static prq tgs; }        // 登录态根对象',
        'public class prq {  public LoggedPacket dbd; }      // 未登录 = null',
        '',
        'q08.drawScreen:',
        '  14: getstatic zwr.tgs',
        '  19: ifeq 35            // 不透明谓词 t9d.b()',
        '  22: ifnull 41          // 未登录 -> 登录界面',
        '  32: getstatic zwr.tgs',
        '  35: getfield prq.dbd',
        '  38: ifnonnull 60       // 已登录 -> 正常菜单',
        '  41: aload_0 ... new qih ; c05.z2i(GuiScreen) ; return   <- 全 JAR 唯一登录入口',
        '  60: <正常菜单绘制>',
    ])
    para(doc, '全 JAR 范围内不存在任何 putstatic zwr.tgs / putfield prq.dbd，'
              '两者只能由原生代码经 JNI 写入 —— 从字节码层面证实登录态由原生库决定。')

    doc.add_heading('3.4 旁路发现', level=2)
    table(doc, ['类', '端点 / 行为', '说明'], [
        ['hy1', 'https://killaura.cn/gc.php?key=…&type=1|10|20', '“NPC Alt Generator”：API Key 换 Minecraft 账号（code/msg/acc）'],
        ['o3s', 'https://api.xinchen.space/acgurl/api.php?return=json', '第三方 JSON 接口'],
        ['gqi', 'https://api.hypixel.net/watchdogStats?key=', 'Hypixel 封禁统计'],
        ['nn2', 'mcbaozi.com、enalts.org、Premium: 、“Hypixel 1+ 仅0.2元”', 'Alt Manager 中的购买/黑卡广告'],
        ['sms', '127.0.0.1、NeteaseLauncher、MLv5_Netease.der', '网易启动器会话接管（本地 IPC + 证书固定）'],
        ['grn', 'authserver/sessionserver.thealtening.com', 'TheAltening 小号服务'],
        ['cfu', 'public native String p6w(URL)', 'HTTP 客户端本身是原生实现'],
        ['an9', 'jrp/otn/hsw/m3n', '加解密全部原生'],
    ], widths=[1.8, 6.0, 8.2])

    doc.add_heading('4. 绕过实施', level=1)
    doc.add_heading('4.1 补丁 1 — 登录门禁 q08.drawScreen', level=2)
    table(doc, ['站点', '原始字节', '补丁后', '语义'], [
        ['偏移 35–40 (getfield prq.dbd + ifnonnull 60)', 'b4 00 84 c7 00 16', '57 00 00 a7 00 16', 'pop;nop;nop;goto 60 → 无条件走菜单'],
        ['偏移 22–24 (ifnull 41)', 'c6 00 13', '57 00 00', 'pop;nop;nop → 不再跳登录'],
    ], widths=[5.4, 3.6, 3.6, 4.4])
    para(doc, '设计要点：')
    bullets(doc, [
        '栈中性：两站点原先各弹 1 个引用，改写后仍各弹 1 个，35/41/60 三个合并点栈高一致。',
        '不能产生死代码：类带 StackMapTable，若把 goto 放在槽位开头，尾随填充字节成为不可达代码，'
        '分裂验证器会直接拒绝（VerifyError: Expected stackmap frame at this location）。因此 goto 必须放槽位末尾。',
        '偏移基准：goto 的分支偏移相对于 goto 自身地址，而非下一条指令。',
    ])

    doc.add_heading('4.2 为什么必须同时补丁偏移 22（实测反证）', level=2)
    para(doc, '原以为 ifnull 41 在不透明谓词恒为 0 时是死代码。动态实验推翻了该假设：'
              '控制组中 zwr.tgs == null 且执行实际进入了 qih.<init>，说明 t9d.b() 返回非 0，'
              '走的是偏移 22 那条路径。只补丁 38 号站点是不够的。')

    doc.add_heading('4.3 补丁 2 — 拆除故意自毁 jiz.<init>', level=2)
    code(doc, [
        'if ((double) zwr.tgs.dbd.getToken().length() < fyk.mmr(1.0, 9.0)) {',
        '    Unsafe u = ...;  u.putAddress(0L, 0L);   // 直接写地址 0，硬崩 JVM',
        '}',
        '',
        'jiz.<init> 偏移 108:  b6 00 67  ->  58 58 57   (pop2; pop2; pop)',
    ])
    para(doc, '这是针对“伪造短 token 绕过登录”的反制陷阱；若绕过方式是把 prq.dbd 塞成 token '
              '很短的假 LoggedPacket，客户端会在截图任务创建时被主动崩溃。')

    doc.add_heading('4.4 补丁 3 — 未登录会话的空指针保护', level=2)
    para(doc, 'q08.drawScreen 里渲染欢迎语时是“无判空”调用链：')
    code(doc, [
        '537: getstatic zwr.qkk ; pop',
        '541: invokestatic  zwr.ooi()                    -> prq',
        '544: invokevirtual prq.qr2()                     -> ClientNetwork',
        '547: invokevirtual ClientNetwork.getUserName()   -> String',
        '550: invokevirtual StringBuilder.append(String)',
    ])
    para(doc, '而 zwr.tgs（以及 prq.yjm）只有在原生层登录成功之后才会被写入。'
              '绕过登录后 zwr.tgs 保持 null，这条链会在主菜单上每帧抛 NullPointerException，'
              '标题界面根本画不出来。')
    para(doc, '补丁方式：把 9 字节的三段调用改写成 ldc_w <空字符串> + 6 个 nop，'
              '操作数栈上仍然恰好留下一个 String，因此各合并点栈型不变。'
              '空字符串常量追加到常量池末尾（不重编号任何既有索引），只增加常量池计数并把'
              '其后的代码整体后移 6 字节。')
    table(doc, ['站点', '原始字节', '补丁后'], [
        ['偏移 541', 'b8 01 18 b6 01 1c b6 01 21', 'ldc_w <空 String> + nop x6'],
        ['偏移 590', 'b8 01 18 b6 01 1c b6 01 21', 'ldc_w <空 String> + nop x6'],
    ], widths=[3.0, 7.0, 6.0])

    doc.add_heading('4.5 原生层的处理', level=2)
    para(doc, 'libsoter.dll 是加壳镜像：.boot 段 49.5 MB 承载真实代码，'
              '.winlice 段 82.3 MB 虚拟大小但磁盘大小为 0，导入表仅 2 个函数。'
              '用 REA（Ghidra 引擎）自动分析 600 秒后仅识别出 4 个函数，'
              '入口 0x6711C058（.boot）与导出 JNI_OnLoad（0x6225A750）。'
              '结论：原生登录/HWID 逻辑处于加壳态，静态反编译不可行，需运行期脱壳才能继续。')

    doc.add_heading('5. 验证证据', level=1)
    doc.add_heading('5.1 静态可达性证明', level=2)
    para(doc, '对指令图做 BFS，根集合 = 方法入口 + 全部 10 个异常处理器起始 PC '
              '（{0,28,56,120,149,165,183,193,222,341}），刻意让异常边也无法绕回登录块：')
    table(doc, ['对象', 'new qih（偏移 45）可达？', '菜单路径（偏移 60）可达？', '判定'], [
        ['原版 q08.class', '是', '是', '对照组：门禁有效'],
        ['补丁版 q08.class', '否', '是', '绕过成立'],
        ['jiz 残留 Unsafe.putAddress', '0 处', '—', '通过'],
    ], widths=[4.4, 4.4, 4.4, 3.8])

    doc.add_heading('5.2 JVM 字节码校验', level=2)
    code(doc, [
        'Flux_login_bypassed.jar',
        '  q08   LINKED OK (initialisation stopped later: NoClassDefFoundError: org/apache/commons/lang3/StringUtils)',
        '  jiz   LINK+INIT OK',
        '  RESULT: every class linked and passed bytecode verification',
        '',
        '对照组（故意把 goto 偏移改错）:',
        '  q08   *** VERIFICATION FAILURE: java.lang.VerifyError:',
        '          Expecting a stackmap frame at branch target 32572',
        '          Location: q08.drawScreen(IIF)V @36: goto',
    ])

    doc.add_heading('5.3 动态执行验证', level=2)
    para(doc, '用记录型 URLClassLoader 载入 q08，以 Unsafe.allocateInstance 绕过构造器创建半成品实例，'
              '在未认证状态下调用 drawScreen 一次：')
    table(doc, ['构建', '异常', '异常栈', '判定'], [
        ['对照组（门禁完好）', 'ExceptionInInitializerError', 'gbe.<init> ← qih.<init> ← q08.drawScreen', '登录界面被到达'],
        ['补丁版', 'NullPointerException: eka.x05()', '仅 q08.drawScreen', '登录界面从未被到达（直接进入菜单路径 60+）'],
    ], widths=[3.4, 4.4, 5.6, 3.6])
    para(doc, '两个构建的认证状态相同（zwr 初始化失败 → zwr.tgs == null，即“最坏情况”），'
              '唯一变量就是补丁本身。')

    doc.add_heading('6. 局限与未解事项', level=1)
    table(doc, ['项', '状态', '说明'], [
        ['原生登录协议细节（HTTP/IRC 报文、HWID 算法）', '未解', 'libsoter.dll 加壳，需运行期脱壳'],
        ['HWID 采集方式', '未解', 'Java 侧无相关逻辑；仅确认经 LoginPacket.hwid 上报'],
        ['端到端实机运行', '未执行', '需 LWJGL 原生库 + GL 上下文 + 真实 DLL；主动运行反作弊组件有风险'],
        ['1,779 个 ZKM 调用点', '未解密', '主要为 OptiFine 类（依赖 GL 上下文初始化）'],
        ['112 个调用点', '静态未解出', '操作数形态非标准，已记录于 unresolved.tsv'],
        ['crp.class', '解析失败 1 例', '指令流边界异常（wide/switch 组合）'],
    ], widths=[5.4, 2.4, 8.2])

    doc.add_heading('7. 交付物与复现', level=1)
    table(doc, ['文件', '说明'], [
        ['Flux_login_bypassed.jar', '主交付物：登录门禁绕过（q08 + jiz）。配合真实 libsoter.dll 使用'],
        ['Flux_login_bypassed_offline.jar', '追加中和 v6ma.Ex 原生反篡改门禁，可在无 DLL 环境下初始化'],
        ['REPORT.md / 本报告', '完整分析与验证记录'],
        ['out/strings_plain.tsv', '14,389 条解密后字符串'],
        ['out/patch_report.json', '补丁前后字节、偏移、语义记录'],
        ['tools/*.py, tools/*.java', '完整工具链'],
        ['src_ann/*.java', '带明文常量的反编译源码（认证相关核心类）'],
    ], widths=[6.0, 10.0])

    doc.add_heading('8. 如何启动被绕过的客户端', level=1)
    para(doc, '交付包附带 Flux-Bypassed.json（版本清单）与一键安装脚本。安装后启动器里会多出'
              '一个版本 Flux-Bypassed。')
    code(doc, [
        '# 1) 安装（默认装进 %APPDATA%\\.minecraft）',
        'powershell -ExecutionPolicy Bypass -File .\\安装Flux-Bypassed.ps1',
        '',
        '# 若主菜单空白或崩溃，改用离线变体（额外中和 v6ma.Ex 原生门禁）',
        'powershell -ExecutionPolicy Bypass -File .\\安装Flux-Bypassed.ps1 -Variant offline',
        '',
        '# 2) 启动器里选版本 Flux-Bypassed',
        '# 3) 用「离线 / 第三方登录」启动，并把该版本的 Java 指定为 Java 8',
    ])
    para(doc, '安装脚本会同时补齐启动器下载不到的 6 个依赖库：', bold=True)
    bullets(doc, [
        'flux:irc:1.3 / viaversion:3.2.2 / viabackwards:3.2.1 / viarewind:1.5.3 / viasnakeyaml:1.27 '
        '—— 这 5 个只存在于原始压缩包里，任何公共 Maven 仓库都没有。',
        'com.mojang:realms:1.7.48 —— 本机 1.8.9 带的是 1.7.59，版本号不匹配。',
        '其余缺失项（jinput-platform / twitch-platform / twitch-external-platform / macOS 专用 LWJGL 2.9.2）'
        '是 natives-only 或带 os 规则的条目，启动器会按 natives 规则处理，不是真实缺口。',
    ])
    para(doc, '注意：Flux 是 Minecraft 1.8，必须使用 Java 8 启动；'
              '用 Java 17/21 会因 LWJGL 2.9.4 与反射限制直接崩溃。', bold=True)

    doc.add_heading('合规说明', level=2)
    bullets(doc, [
        '分析在样本所有者本地完成，未对 flux.today、killaura.cn、xinchen.space 等任何服务发起请求；'
        '所有端点均为静态逆向所得。',
        '为让被混淆类完成链接，从 Maven Central 与 libraries.minecraft.net 下载了 29 个公开依赖 JAR'
        '（Guava/Gson/log4j/LWJGL/authlib 等），这是本次唯一的出站网络行为。',
        '未加载、未执行 libsoter.dll；也未启动完整客户端。原生组件的加壳镜像仅做静态头部/段表解析。',
        'Flux_login_bypassed_offline.jar 中的 v6ma.Ex 中和补丁会削弱原生反篡改检查，'
        '仅建议在隔离、离线、自有的分析环境中使用。',
    ])

    doc.save(out_path)
    print('saved', out_path, os.path.getsize(out_path), 'bytes')


if __name__ == '__main__':
    build(sys.argv[1])
