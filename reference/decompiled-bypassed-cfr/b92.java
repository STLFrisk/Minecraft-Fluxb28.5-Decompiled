/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URI;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class b92
extends gbe {
    private static final Logger r9o;
    private final ekw b7i;
    private final gbe q3q;
    private final b92$pwe nz3;
    private final List bo1;
    private final List kf5;
    private static final long a;
    private static final String[] b;
    private static final String[] g;
    private static final Map h;

    public b92(gbe gbe2, b92$pwe b92$pwe) {
        this(gbe2, b92$pwe, null);
    }

    public b92(gbe gbe2, b92$pwe b92$pwe, List list) {
        long l = a ^ 0x7F21494107C6L;
        this.b7i = new hsu((String)((Object)b92.b("b", (int)29729, (long)(0x21B372B057214BE6L ^ l))), new Object[0]);
        this.kf5 = Lists.newArrayList();
        this.q3q = gbe2;
        this.nz3 = b92$pwe;
        this.bo1 = list;
    }

    @Override
    public void initGui() {
        block19: {
            b92 b922;
            long l;
            block18: {
                block17: {
                    int n;
                    block15: {
                        block16: {
                            l = a ^ 0x26BB3EDD9D27L;
                            n = t9d.c();
                            try {
                                try {
                                    try {
                                        b922 = this;
                                        if (n != 0) break block15;
                                        if (!b922.kf5.isEmpty()) break block16;
                                    }
                                    catch (oov oov2) {
                                        throw b92.a(oov2);
                                    }
                                    this.kf5.addAll(this.fex.g8u(this.nz3.yfb()._2o(), (int)((float)this.dt7 * 0.75f)));
                                    b922 = this;
                                    if (n != 0) break block15;
                                }
                                catch (oov oov3) {
                                    throw b92.a(oov3);
                                }
                                if (b922.bo1 == null) break block16;
                            }
                            catch (oov oov4) {
                                throw b92.a(oov4);
                            }
                            this.kf5.add("");
                            for (hsu hsu2 : this.bo1) {
                                try {
                                    this.kf5.add(hsu2.cpz());
                                    if (n == 0) {
                                        if (n == 0) continue;
                                        break;
                                    }
                                    break block17;
                                }
                                catch (oov oov5) {
                                    throw b92.a(oov5);
                                }
                            }
                        }
                        b922 = this;
                    }
                    try {
                        try {
                            if (n != 0) break block18;
                            if (b922.nz3.vw2() != null) {
                            }
                            break block17;
                        }
                        catch (oov oov6) {
                            throw b92.a(oov6);
                        }
                        this.khf.add(new gt4(0, this.dt7 / 2 - 155, this.o1e - 50, 150, 20, fc1.gx1((String)((Object)b92.b("b", (int)26746, (long)(0xEA3C73EC6C64D59L ^ l))), new Object[0])));
                        this.khf.add(new gt4(1, this.dt7 / 2 - 155 + 160, this.o1e - 50, 150, 20, fc1.gx1(this.nz3.vw2()._2o(), new Object[0])));
                        if (n == 0) break block19;
                    }
                    catch (oov oov7) {
                        throw b92.a(oov7);
                    }
                }
                b922 = this;
            }
            b922.khf.add(new gt4(0, this.dt7 / 2 - 75, this.o1e - 50, 150, 20, fc1.gx1((String)((Object)b92.b("b", (int)22920, (long)(0x102B70D46A05FCA5L ^ l))), new Object[0])));
        }
    }

    @Override
    public void onGuiClosed() {
    }

    @Override
    public void drawScreen(int n, int n2, float f) {
        block4: {
            this.xmz();
            int n3 = Math.max((int)((double)this.o1e * 0.85 / 2.0 - (double)((float)(this.kf5.size() * this.fex.rr7) / 2.0f)), 50);
            int n4 = t9d.c();
            this.poi(this.fex, this.b7i._2o(), this.dt7 / 2, n3 - this.fex.rr7 * 2, 0xFFFFFF);
            int n5 = n4;
            for (String string : this.kf5) {
                this.poi(this.fex, string, this.dt7 / 2, n3, 0xA0A0A0);
                n3 += this.fex.rr7;
                try {
                    if (n5 == 0) {
                        if (n5 == 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw b92.a(oov2);
                }
            }
            super.drawScreen(n, n2, f);
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void actionPerformed(gt4 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private void kg4(String string) {
        long l = a ^ 0x6E71A57682E5L;
        try {
            Class<?> clazz = Class.forName((String)((Object)b92.b("b", (int)29620, (long)(0x6AE0D8282CB5494CL ^ l))));
            Object object = clazz.getMethod((String)((Object)b92.b("b", (int)9915, (long)(0x85F621BE5161C51L ^ l))), new Class[0]).invoke(null, new Object[0]);
            Class[] classArray = new Class[1];
            classArray[0] = URI.class;
            clazz.getMethod((String)((Object)b92.b("b", (int)10450, (long)(0x24AA9A56F1951237L ^ l))), classArray).invoke(object, new URI(string));
        }
        catch (Throwable throwable) {
            r9o.error((String)((Object)b92.b("b", (int)16543, (long)(0x4C7F1A57C0C4FA73L ^ l))), throwable);
        }
    }

    /*
     * Exception decompiling
     */
    public static void c1n(gbe var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[TRYBLOCK]], but top level block is 26[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                b92.a = c.a(7974962758789007766L, 4952111529128424076L, MethodHandles.lookup().lookupClass()).a(28371917841495L);
                b92.h = new HashMap<K, V>(13);
                var0 = b92.a ^ 100856793868704L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[18];
                var7_4 = 0;
                var6_5 = "\u00c2)S\u00f9\u00f1\u0019a:\u0011\u00c8\u008f\u00e5\u0003\u0091\u00d6\u00c5y$D\u00a7\u0098\u0014ol\u0003\u0006\u00c5\u00f3[\u00f2\u00d0,\u0099\u0088\u001f\u00ac\u0085\u00a0QM\u0099m@&\t\u00ca\f\u00f4\u00b3;\u0093\u00a0d^o\u00dd@HKj\u00b7\f\u00c2\u0087\u00b3\u00bd\u0092\u00f3\u00be\u00fa\u00be\u001b_\u00f0\u00dc\u000b\u0016M\u001c^\u0017\u00ce\u0005\u00a1S\u008eT\u0083\u00c5c}*\u00ed\u0085\u00c0\u0005#\u00d4\\*\u00a2\u00f7\u0006\u00b0d\u0098\u00ce\u00cd\u009a\u00d9|\u001d\u00e7J@\u00e5:\u0083\u00e6\u00e7\u000b\u0018\u00de\u0080\u008f\u00bdi\u0090\u00ff\u000f\u00c2b\u00f9\u00c4\u00f1\u0091\u00b9]\n\u00052\u0002D'z\u00bf@2\u00a0\u009f\u0097\u00b9@\u000ex\u0013<b\u0001\u00fa\u00f0'<\u00c0F\u00a4!\u00db?ly\u0095XL\u00feF\u00ee\u00a6\u00e8\u0015GrQF\u0002+i7u\u00c9\u00b2\u00ddxr\u00db\u00c3[\u00e2\u00e4\u00e5U\u000b\u00abF\u00ed\u0093\u00e1~K\u00cc\u001a(\u0015\u001a\u00f4e\u0012\r\u00b6\u001c\u00a9:x\u00b8\u001dM\u0017g)\u00cfCo\u00dd\u0097\u00c0n\u00d5\u00ad\u00a6\u0017\u00fe)\u00afv}\u0019x\u00f9d\u00bcM\u008d@2\u0015\u000bkl\u00b4\u0089\u00e1\u00b9\u00c0\u00d7\u0006\u0017\u00b1\u00e4\u008e)}hm\u00b4$\u0083K\u00ca\u0080\u00cd\u00da\u00af\u0010G\u00d4\u0084\u0019\u00ed\u00ff\u001e\u00849d\u000f\u00ef\u008d\u00d3\u00bc\u00ef\u009dv\u00cd\u00cfN\u00c2\u00bb\u00b9kF\u009b\u001b\u0006\u00a9#3\u009b3(\u00c7\u00c0\u008cS\u001b\u00d2\u00e3\u00cf\u0000\t\u0015\u00e0\u0006\u00a7H\u0000/\u009a\u0004*T\u000f^\u0086\u00fc2\n\u00dcr\u00a7#\u00d7\u0003\u0018\rL\u00ad\u0013T\u00a9 \u001e\u00f7\u0014PhuX\u00d0\u00a5\u0002\u001bD\u00f5\u009b\u00dcG|\u008e'\u00c3\u007f\u00b3\u0014\u000b(\f\u00fd)\u0016\u0097\u00c8\u000fH;\u0099a\u009d\u00db\u0007\u0093\u00d5z|\u0013\u008a\u00cd\u008b>o;g[@\u00f6\u0016}\u0007`\u00b2\u00a3\u0082'@\u0083\u00a4\u009cG\u00a6\u00f7Zz\u001c\u00e1l\u001e\u00b1\u000e\u001f Wi\u00d28\u0012\u00ee\u0019\u00a0\u00e2\u00ed#\u0014\u001f\u009d\u00fb:\u00fe\u001a\u0088>~COM\u0084\u00ea\u0018\u00a5)\u00cd9\u0086\u00b5%F\u0093\u0014|\u00fb\u00d4\u00fak\u0010\u00c0\u00bf\u00a1\u0010\u00ae\u00bd\u00c55P\u00a5\u00bd\u00e5\u0013\u00c8\u008e\b\u0019\f\u00a9\u00ac\u009bL\u00ce_JI\u0019\u00daH\u00d0$E\u00ab|\u009e\u00fd\u0002;L\u00e3\u00f6\u0093\u00e2\u00a7+P8k\u00bcn\u0092\u00c2\u00e3\\\u00de\u00c3Y\u00db\u00c8\u00b0\u0081\u009f/:\u009d~I\u00ce\u00d4\u00b6\u0003\u0011[\u00d4\u00db!\u00cd\u00c8\u00e8h\u0080\u00d093O\u00127SQ8\u00c9V\u00e0\u000f\u00cbq\u00f1\u00d9\u00fb\u00ad\u0006\u00c5\u00814\u00a4}\u00cc\u00f8~\u0097z\u001c\u000bG\u00aa\u00f6\u00fcK\u00fc\u00f2\u00cf\u0086\u00d6x\u00b8\u009f\u009dEJ r\u0017 \u00afO\u00dc9\u000b6\u00d3\u000f\u00c4\u00b3w\u009b\u000b0\u0080<=#\u0099\u009d{\u00ff\u00bc\u00ad\u00acr\u00af\u0015\u0083\u00b2$\u00e4\u00e2n\u0002(\u00912VmO\u0093L\u00d0r\u0094\u00d6h\u00cb\u008d\u00ce\"`\u0004\u00a0\u009b\u00d4\u00c1g\u009a\u009c\u00ca\u0010\u00e5AtI# xe\u008ex\u0012m8\u00e1\u0013\u00d68q\u001cU\u00fc\u0091\u00b8\u0016\u00d1\u00d6r\u0093\u00da\u0090\u00ecB\u007f\u00eeO\u001cz\u00daxT\u00a1\u001b\u00d5t\u0006q\u00adQ\u00aa,\u00a8\u008d\u0084O05\u00d9\u00db<\u008d?\u00e79\u00f5U*\u00a4\u0087Y\u00b6\u00b0\u0091dH\u00be\u00aew\u008f\u00b1M\u00f7Lq\u00b2\u00edAvO\u00de\u0006\u0088\u0005\u0016ig%\u001fkQ\u00ab\u00a8\u0092\u0098\u009d3.\u00d3;J\u0013Dm\u00e4\u00e4\u00a1\u00c7\u0093\u0095\u00c6\u00e0`\u00b6\u00d8\u00dd^\u00ce{N\u00a6\u00bd\u00b0\u00da\u0011\u00ed\u00c2\u00e5f\u00d0\u0003\u0084\u00ca\u0011\u008be\u00f4Q";
                var8_6 = "\u00c2)S\u00f9\u00f1\u0019a:\u0011\u00c8\u008f\u00e5\u0003\u0091\u00d6\u00c5y$D\u00a7\u0098\u0014ol\u0003\u0006\u00c5\u00f3[\u00f2\u00d0,\u0099\u0088\u001f\u00ac\u0085\u00a0QM\u0099m@&\t\u00ca\f\u00f4\u00b3;\u0093\u00a0d^o\u00dd@HKj\u00b7\f\u00c2\u0087\u00b3\u00bd\u0092\u00f3\u00be\u00fa\u00be\u001b_\u00f0\u00dc\u000b\u0016M\u001c^\u0017\u00ce\u0005\u00a1S\u008eT\u0083\u00c5c}*\u00ed\u0085\u00c0\u0005#\u00d4\\*\u00a2\u00f7\u0006\u00b0d\u0098\u00ce\u00cd\u009a\u00d9|\u001d\u00e7J@\u00e5:\u0083\u00e6\u00e7\u000b\u0018\u00de\u0080\u008f\u00bdi\u0090\u00ff\u000f\u00c2b\u00f9\u00c4\u00f1\u0091\u00b9]\n\u00052\u0002D'z\u00bf@2\u00a0\u009f\u0097\u00b9@\u000ex\u0013<b\u0001\u00fa\u00f0'<\u00c0F\u00a4!\u00db?ly\u0095XL\u00feF\u00ee\u00a6\u00e8\u0015GrQF\u0002+i7u\u00c9\u00b2\u00ddxr\u00db\u00c3[\u00e2\u00e4\u00e5U\u000b\u00abF\u00ed\u0093\u00e1~K\u00cc\u001a(\u0015\u001a\u00f4e\u0012\r\u00b6\u001c\u00a9:x\u00b8\u001dM\u0017g)\u00cfCo\u00dd\u0097\u00c0n\u00d5\u00ad\u00a6\u0017\u00fe)\u00afv}\u0019x\u00f9d\u00bcM\u008d@2\u0015\u000bkl\u00b4\u0089\u00e1\u00b9\u00c0\u00d7\u0006\u0017\u00b1\u00e4\u008e)}hm\u00b4$\u0083K\u00ca\u0080\u00cd\u00da\u00af\u0010G\u00d4\u0084\u0019\u00ed\u00ff\u001e\u00849d\u000f\u00ef\u008d\u00d3\u00bc\u00ef\u009dv\u00cd\u00cfN\u00c2\u00bb\u00b9kF\u009b\u001b\u0006\u00a9#3\u009b3(\u00c7\u00c0\u008cS\u001b\u00d2\u00e3\u00cf\u0000\t\u0015\u00e0\u0006\u00a7H\u0000/\u009a\u0004*T\u000f^\u0086\u00fc2\n\u00dcr\u00a7#\u00d7\u0003\u0018\rL\u00ad\u0013T\u00a9 \u001e\u00f7\u0014PhuX\u00d0\u00a5\u0002\u001bD\u00f5\u009b\u00dcG|\u008e'\u00c3\u007f\u00b3\u0014\u000b(\f\u00fd)\u0016\u0097\u00c8\u000fH;\u0099a\u009d\u00db\u0007\u0093\u00d5z|\u0013\u008a\u00cd\u008b>o;g[@\u00f6\u0016}\u0007`\u00b2\u00a3\u0082'@\u0083\u00a4\u009cG\u00a6\u00f7Zz\u001c\u00e1l\u001e\u00b1\u000e\u001f Wi\u00d28\u0012\u00ee\u0019\u00a0\u00e2\u00ed#\u0014\u001f\u009d\u00fb:\u00fe\u001a\u0088>~COM\u0084\u00ea\u0018\u00a5)\u00cd9\u0086\u00b5%F\u0093\u0014|\u00fb\u00d4\u00fak\u0010\u00c0\u00bf\u00a1\u0010\u00ae\u00bd\u00c55P\u00a5\u00bd\u00e5\u0013\u00c8\u008e\b\u0019\f\u00a9\u00ac\u009bL\u00ce_JI\u0019\u00daH\u00d0$E\u00ab|\u009e\u00fd\u0002;L\u00e3\u00f6\u0093\u00e2\u00a7+P8k\u00bcn\u0092\u00c2\u00e3\\\u00de\u00c3Y\u00db\u00c8\u00b0\u0081\u009f/:\u009d~I\u00ce\u00d4\u00b6\u0003\u0011[\u00d4\u00db!\u00cd\u00c8\u00e8h\u0080\u00d093O\u00127SQ8\u00c9V\u00e0\u000f\u00cbq\u00f1\u00d9\u00fb\u00ad\u0006\u00c5\u00814\u00a4}\u00cc\u00f8~\u0097z\u001c\u000bG\u00aa\u00f6\u00fcK\u00fc\u00f2\u00cf\u0086\u00d6x\u00b8\u009f\u009dEJ r\u0017 \u00afO\u00dc9\u000b6\u00d3\u000f\u00c4\u00b3w\u009b\u000b0\u0080<=#\u0099\u009d{\u00ff\u00bc\u00ad\u00acr\u00af\u0015\u0083\u00b2$\u00e4\u00e2n\u0002(\u00912VmO\u0093L\u00d0r\u0094\u00d6h\u00cb\u008d\u00ce\"`\u0004\u00a0\u009b\u00d4\u00c1g\u009a\u009c\u00ca\u0010\u00e5AtI# xe\u008ex\u0012m8\u00e1\u0013\u00d68q\u001cU\u00fc\u0091\u00b8\u0016\u00d1\u00d6r\u0093\u00da\u0090\u00ecB\u007f\u00eeO\u001cz\u00daxT\u00a1\u001b\u00d5t\u0006q\u00adQ\u00aa,\u00a8\u008d\u0084O05\u00d9\u00db<\u008d?\u00e79\u00f5U*\u00a4\u0087Y\u00b6\u00b0\u0091dH\u00be\u00aew\u008f\u00b1M\u00f7Lq\u00b2\u00edAvO\u00de\u0006\u0088\u0005\u0016ig%\u001fkQ\u00ab\u00a8\u0092\u0098\u009d3.\u00d3;J\u0013Dm\u00e4\u00e4\u00a1\u00c7\u0093\u0095\u00c6\u00e0`\u00b6\u00d8\u00dd^\u00ce{N\u00a6\u00bd\u00b0\u00da\u0011\u00ed\u00c2\u00e5f\u00d0\u0003\u0084\u00ca\u0011\u008be\u00f4Q".length();
                var5_7 = 56;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = b92.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0087s6\u00b9\u001d-Z\u00d7\u00e4zw\u00c3\u0097f\u0095\u0091x\u00d1V\u00ed\u00ed\u00bc\u00cd!<o\u0012\u0080.\u00bf\u00d4\u008b\r\u0093\u0085,\u0005x\f]0u\u00fe\u00d1\u00af\u00be\u00beSO\u000eE\u0007\u009c\u00f5\u00f3!\u0089\u00d2\u00b6<sco\u0006w\u0098\u0018\u00e4W\u00e3`w\u0004\u00ae\u00f5M\u0087J\u00ac\u001a\u008f\u00be\u009ay(\u00e1\u00e6\u0095\u0086";
                    var8_6 = "\u0087s6\u00b9\u001d-Z\u00d7\u00e4zw\u00c3\u0097f\u0095\u0091x\u00d1V\u00ed\u00ed\u00bc\u00cd!<o\u0012\u0080.\u00bf\u00d4\u008b\r\u0093\u0085,\u0005x\f]0u\u00fe\u00d1\u00af\u00be\u00beSO\u000eE\u0007\u009c\u00f5\u00f3!\u0089\u00d2\u00b6<sco\u0006w\u0098\u0018\u00e4W\u00e3`w\u0004\u00ae\u00f5M\u0087J\u00ac\u001a\u008f\u00be\u009ay(\u00e1\u00e6\u0095\u0086".length();
                    var5_7 = 40;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = b92.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        b92.b = var9_3;
        b92.g = new String[18];
        b92.r9o = LogManager.getLogger();
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5E27;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("b92", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            b92.g[n2] = b92.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b92.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("b92" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b92.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

