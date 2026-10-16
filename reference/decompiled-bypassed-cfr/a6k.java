/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;

@dr9$x0j(t2u="tp", io4={"<Pos>"}, hjc="Teleport.")
public class a6k
extends dr9 {
    private ArrayList sli = new ArrayList();
    public boolean tyb;
    public mew ous;
    public i2h khn;
    public q6h kmy = new q6h();
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    /*
     * Exception decompiling
     */
    @Override
    public void xjl(String[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [58[DOLOOP]], but top level block is 15[TRYBLOCK]
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

    @jev
    public void v17(ihr ihr2) {
        block7: {
            boolean bl;
            ihr ihr3;
            block8: {
                block9: {
                    int n;
                    block6: {
                        n = t9d.b();
                        try {
                            try {
                                ihr3 = ihr2;
                                if (n == 0) break block6;
                                if (!(ihr3.bbi() instanceof C03PacketPlayer)) break block7;
                            }
                            catch (oov oov2) {
                                throw a6k.a(oov2);
                            }
                            ihr3 = ihr2;
                        }
                        catch (oov oov3) {
                            throw a6k.a(oov3);
                        }
                    }
                    try {
                        bl = this.tyb;
                        if (n == 0) break block8;
                        if (bl) break block9;
                    }
                    catch (oov oov4) {
                        throw a6k.a(oov4);
                    }
                    bl = true;
                    break block8;
                }
                bl = false;
            }
            ihr3.wxi(bl);
        }
    }

    @jev
    public void q4w(wbh wbh2) {
        block9: {
            block10: {
                a6k a6k2;
                boolean bl;
                long l;
                block8: {
                    l = a ^ 0x675C20B5A769L;
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                bl = wbh2.nlg() instanceof S08PacketPlayerPosLook;
                                if (n != 0) break block8;
                                if (!bl) break block9;
                            }
                            catch (oov oov2) {
                                throw a6k.a(oov2);
                            }
                            a6k2 = this;
                            if (n != 0) break block10;
                        }
                        catch (oov oov3) {
                            throw a6k.a(oov3);
                        }
                        bl = a6k2.tyb;
                    }
                    catch (oov oov4) {
                        throw a6k.a(oov4);
                    }
                }
                try {
                    if (bl) break block9;
                    ncl.zpu(a6k.a("n", (int)18400, (long)(0x6AF86A693FF9122EL ^ l)));
                    a6k2 = this;
                }
                catch (oov oov5) {
                    throw a6k.a(oov5);
                }
            }
            a6k2.tyb = true;
            wbh2.wxi(true);
        }
    }

    @jev
    public void z3c(fz2 fz22) {
        block16: {
            ue5 ue52;
            long l;
            block15: {
                block14: {
                    int n;
                    block13: {
                        a6k a6k2;
                        boolean bl;
                        block11: {
                            block12: {
                                l = a ^ 0x12DF3E5FDDD3L;
                                n = t9d.c();
                                try {
                                    try {
                                        bl = this.kmy.hqu(8500.0);
                                        if (n != 0) break block11;
                                        if (!bl) break block12;
                                    }
                                    catch (oov oov2) {
                                        throw a6k.a(oov2);
                                    }
                                    q0r.tq3((String)((Object)a6k.a("n", (int)3950, (long)(0x4296B55E2193A011L ^ l))));
                                    mtl.mn9(this);
                                }
                                catch (oov oov3) {
                                    throw a6k.a(oov3);
                                }
                            }
                            try {
                                a6k2 = this;
                                if (n != 0) break block13;
                                bl = a6k2.tyb;
                            }
                            catch (oov oov4) {
                                throw a6k.a(oov4);
                            }
                        }
                        if (!bl) break block16;
                        a6k2 = this;
                    }
                    a6k2.tyb = false;
                    ue52 = new ue5(this.rpq.vg8.o2v, this.rpq.vg8.kfp, this.rpq.vg8.vbd);
                    try {
                        a6k a6k3;
                        try {
                            a6k3 = this;
                            if (n != 0) break block14;
                            if (a6k3.ous != null) break block15;
                        }
                        catch (oov oov5) {
                            throw a6k.a(oov5);
                        }
                        a6k3 = this;
                    }
                    catch (oov oov6) {
                        throw a6k.a(oov6);
                    }
                }
                a6k3.ous = new mew(this.khn.o2v, this.khn.kfp + 1.0, this.khn.vbd);
            }
            ue5 ue53 = new ue5(this.ous.getX(), this.ous.getY(), this.ous.getZ());
            this.sli = this.ta5(ue52, ue53);
            q0r.tq3((String)((Object)a6k.a("n", (int)21225, (long)(0x66861A8FE3547D90L ^ l))) + this.ous.getX() + (String)((Object)a6k.a("n", (int)30243, (long)(0x76DCCD6FCA1CD958L ^ l))) + this.ous.getY() + (String)((Object)a6k.a("n", (int)30089, (long)(0x49B0BA37ACE55AF1L ^ l))) + this.ous.getZ());
            mtl.mn9(this);
            new a6k$1(this).start();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private ArrayList ta5(ue5 var1_1, ue5 var2_2) {
        var3_3 = t9d.b();
        if (!this.vz_(new mew(var1_1.ptb()))) {
            var1_1 = var1_1.cdr(0.0, 1.0, 0.0);
        }
        var4_4 = new qbw(var1_1, var2_2);
        var4_4.pvm();
        var5_5 = 0;
        var6_6 = null;
        var7_7 = null;
        var8_8 = new ArrayList<ue5>();
        var9_9 = var4_4.cl7();
        for (ue5 var11_11 : var9_9) {
            block39: {
                block44: {
                    block42: {
                        block41: {
                            block40: {
                                block36: {
                                    block37: {
                                        block38: {
                                            block35: {
                                                try {
                                                    v0 = var5_5;
                                                    if (var3_3 == 0) break block35;
                                                    if (v0 != 0) {
                                                    }
                                                    ** GOTO lbl32
                                                }
                                                catch (oov v1) {
                                                    throw a6k.a(v1);
                                                }
                                                v0 = var5_5;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var3_3 == 0) break block36;
                                                            if (v0 == var9_9.size() - 1) {
                                                            }
                                                            ** GOTO lbl54
                                                        }
                                                        catch (oov v2) {
                                                            throw a6k.a(v2);
                                                        }
lbl32:
                                                        // 2 sources

                                                        v3 = var6_6;
                                                        if (var3_3 == 0) break block37;
                                                    }
                                                    catch (oov v4) {
                                                        throw a6k.a(v4);
                                                    }
                                                    if (v3 == null) break block38;
                                                }
                                                catch (oov v5) {
                                                    throw a6k.a(v5);
                                                }
                                                var8_8.add(var6_6.cdr(0.5, 0.0, 0.5));
                                            }
                                            catch (oov v6) {
                                                throw a6k.a(v6);
                                            }
                                        }
                                        var8_8.add(var11_11.cdr(0.5, 0.0, 0.5));
                                        v3 = var11_11;
                                    }
                                    var7_7 = v3;
                                    try {
                                        if (var3_3 != 0) break block39;
lbl54:
                                        // 2 sources

                                        v0 = 1;
                                    }
                                    catch (oov v7) {
                                        throw a6k.a(v7);
                                    }
                                }
                                var12_12 = v0;
                                try {
                                    v8 = var11_11.glf(var7_7);
                                    v9 = 25.0;
                                    if (var3_3 == 0) break block40;
                                    if (v8 > v9) {
                                    }
                                    ** GOTO lbl72
                                }
                                catch (oov v10) {
                                    throw a6k.a(v10);
                                }
                                var12_12 = 0;
                                try {
                                    if (var3_3 != 0) break block41;
lbl72:
                                    // 2 sources

                                    v8 = var7_7.h25();
                                    v9 = var11_11.h25();
                                }
                                catch (oov v11) {
                                    throw a6k.a(v11);
                                }
                            }
                            var13_13 = Math.min(v8, v9);
                            var15_14 = Math.min(var7_7.mji(), var11_11.mji());
                            var17_15 = Math.min(var7_7.va0(), var11_11.va0());
                            var19_16 = Math.max(var7_7.h25(), var11_11.h25());
                            var21_17 = Math.max(var7_7.mji(), var11_11.mji());
                            var23_18 = Math.max(var7_7.va0(), var11_11.va0());
                            var25_19 = (int)var13_13;
                            block25: while (true) {
                                v12 = (cfr_temp_0 = (double)var25_19 - var19_16) == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                block26: while (v12 <= 0) {
                                    v13 = (int)var15_14;
                                    if (var3_3 == 0) break block42;
                                    var26_20 = v13;
                                    block27: while (true) {
                                        v14 = (cfr_temp_1 = (double)var26_20 - var21_17) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                        block28: while (v14 <= 0) {
                                            v12 = (int)var17_15;
                                            if (var3_3 == 0) continue block26;
                                            var27_21 = v12;
                                            while ((double)var27_21 <= var23_18) {
                                                block43: {
                                                    v14 = (double)qbw.sif(var25_19, var26_20, var27_21, false);
                                                    if (var3_3 == 0) continue block28;
                                                    try {
                                                        if (var3_3 == 0) break block43;
                                                        if (v14 == false) {
                                                        }
                                                        ** GOTO lbl112
                                                    }
                                                    catch (oov v15) {
                                                        throw a6k.a(v15);
                                                    }
                                                    v16 = false;
                                                }
                                                var12_12 = v16;
                                                try {
                                                    if (var3_3 != 0) break block25;
lbl112:
                                                    // 2 sources

                                                    ++var27_21;
                                                    if (var3_3 != 0) continue;
                                                    break;
                                                }
                                                catch (oov v17) {
                                                    throw a6k.a(v17);
                                                }
                                            }
                                            ++var26_20;
                                            if (var3_3 != 0) continue block27;
                                        }
                                        break;
                                    }
                                    ++var25_19;
                                    if (var3_3 != 0) continue block25;
                                }
                                break;
                            }
                        }
                        v13 = var12_12;
                    }
                    try {
                        try {
                            if (var3_3 == 0) break block44;
                            if (v13 != 0) break block39;
                        }
                        catch (oov v18) {
                            throw a6k.a(v18);
                        }
                        v13 = (int)var8_8.add(var6_6.cdr(0.5, 0.0, 0.5));
                    }
                    catch (oov v19) {
                        throw a6k.a(v19);
                    }
                }
                var7_7 = var6_6;
            }
            var6_6 = var11_11;
            ++var5_5;
            if (var3_3 != 0) continue;
        }
        return var8_8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean vz_(mew mew2) {
        e0x e0x2;
        e0x e0x3;
        block34: {
            e0x e0x4;
            int n;
            block33: {
                block32: {
                    block31: {
                        block30: {
                            p3y p3y2;
                            p3y p3y3;
                            block29: {
                                block28: {
                                    n = t9d.c();
                                    e0x4 = c05.vz1().tij.getBlockState(new mew(mew2.getX(), mew2.getY(), mew2.getZ())).r_y();
                                    try {
                                        try {
                                            p3y p3y2 = e0x4.p1r();
                                            p3y2 = p3y.cei;
                                            if (n != 0) break block28;
                                            if (p3y3 == p3y2) return true;
                                        }
                                        catch (oov oov2) {
                                            throw a6k.a(oov2);
                                        }
                                        p3y p3y2 = e0x4.p1r();
                                        p3y2 = p3y.nc7;
                                    }
                                    catch (oov oov3) {
                                        throw a6k.a(oov3);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (n != 0) break block29;
                                            if (p3y3 == p3y2) return true;
                                        }
                                        catch (oov oov4) {
                                            throw a6k.a(oov4);
                                        }
                                        e0x3 = e0x4;
                                        if (n != 0) break block30;
                                    }
                                    catch (oov oov5) {
                                        throw a6k.a(oov5);
                                    }
                                    p3y p3y2 = e0x3.p1r();
                                    p3y2 = p3y.wui;
                                }
                                catch (oov oov6) {
                                    throw a6k.a(oov6);
                                }
                            }
                            if (p3y3 == p3y2) return true;
                            e0x3 = e0x4;
                        }
                        try {
                            try {
                                if (n != 0) break block31;
                                if (e0x3 == ox_.h49) return true;
                            }
                            catch (oov oov7) {
                                throw a6k.a(oov7);
                            }
                            e0x3 = e0x4;
                        }
                        catch (oov oov8) {
                            throw a6k.a(oov8);
                        }
                    }
                    try {
                        try {
                            if (n != 0) break block32;
                            if (e0x3 == ox_.gdz) return true;
                        }
                        catch (oov oov9) {
                            throw a6k.a(oov9);
                        }
                        e0x3 = e0x4;
                    }
                    catch (oov oov10) {
                        throw a6k.a(oov10);
                    }
                }
                try {
                    try {
                        e0x2 = ox_.whp;
                        if (n != 0) break block33;
                        if (e0x3 == e0x2) return true;
                    }
                    catch (oov oov11) {
                        throw a6k.a(oov11);
                    }
                    e0x e0x2 = e0x4;
                    e0x2 = ox_.kng;
                }
                catch (oov oov12) {
                    throw a6k.a(oov12);
                }
            }
            try {
                try {
                    if (n != 0) break block34;
                    if (e0x3 == e0x2) return true;
                }
                catch (oov oov13) {
                    throw a6k.a(oov13);
                }
                e0x e0x2 = e0x4;
                e0x2 = ox_.w0z;
            }
            catch (oov oov14) {
                throw a6k.a(oov14);
            }
        }
        try {
            if (e0x3 != e0x2) return false;
            return true;
        }
        catch (oov oov15) {
            throw a6k.a(oov15);
        }
    }

    public static ArrayList jmd(a6k a6k2) {
        return a6k2.sli;
    }

    public static c05 jnd(a6k a6k2) {
        return a6k2.rpq;
    }

    public static c05 ljj(a6k a6k2) {
        return a6k2.rpq;
    }

    public static c05 dm5(a6k a6k2) {
        return a6k2.rpq;
    }

    public static c05 gnk(a6k a6k2) {
        return a6k2.rpq;
    }

    public static c05 thp(a6k a6k2) {
        return a6k2.rpq;
    }

    public static c05 _9h(a6k a6k2) {
        return a6k2.rpq;
    }

    public static c05 t6e(a6k a6k2) {
        return a6k2.rpq;
    }

    public static c05 svl(a6k a6k2) {
        return a6k2.rpq;
    }

    public static c05 clw(a6k a6k2) {
        return a6k2.rpq;
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

                a6k.a = c.a(1835744061930157521L, 1560760488739116434L, MethodHandles.lookup().lookupClass()).a(21111251341704L);
                a6k.f = new HashMap<K, V>(13);
                var0 = a6k.a ^ 107463210831966L;
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
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = "\u00cd\u00ff\u0093\u0019\u00f4\u00e6 \u00b7\u00fd~h\u0005`\u00a5;\u00bf\u000e\u0017 \u009f\u00e3\u0018\u00cf\u009c\u00b2\u009f\u00b2Q/I$\u00bf0}8v(i\u00bc\u00ddD\u00ce\u00e9\u008a^8\u00b3G8s\u00fc\u00f0\u0014\u00b6ZPU\u00d1Y3\u0010\u00fa9\u0004\u00e1\u00fb\n!>H\u00db\u00e1&\u00a3\u00c68-\u009b\u00b7\u00d2\u007f fX\u00fd\u00ec\u00bb\u0013\u0082\u0018\u0083\u00daC\u00d0\u00ca~e\u00b4\u00e2x[\t\u00ff\u00daN\u0016\u009bb7>]P[\u00dfh\u00c7Iy\u00c4/\u00a3\u009a\u00b5G\nx\u00afO\u00c8\u008f\u0087\u00b6b\u00cc97\u0007\u00b1\u0019\u00c1|d\u0094\u0006\u00c0\u00ec\u00a3\u00d6<t\u009e\u0019\u001a\u008f\u00df{\u00c0\u0002\u00f81\u0010\u00efJ\"\u0019u\u0080_\u00a8\u00f5\u008d\u0019\t\b\u00ba\u00ae\u0000\u00bb7\u00e2\u00ec`\u0007E8\u00da\u00a3\u0015\u00e4\u00fa$o\u008f&N\\\u0000sM\u0093\u0084\u00bdQ\u00a6\u0016\u00ee\u00bc\u009a\u00bf7\u0002\u00a3\u009d\u00d4\u00f5\u00c9\u00c6L\u00d6\u0010x\u0011\u008d\u00e8\u0098\u0012J\u0093\u00c197/\u00a1\u008d\u00d3h(<\u00c3E{\u00f6Ra\u00a1\u001e\u007f\u00bf\u00e3\u00fe\f\u00cd\u00cbm\u00da\u00eas#\u00cc\u00d5r\u0090\u00d8X2\u00de}*\u00eb\u00c1+2\u00c11\u00df\u00dc\u001a0\u00cb\u00a0\u00ac~\u00d0\u0090\u00ca's\u00e8\u0084\u0083\u00beu\u00c6\u00f7\u00f3\u00f79S\u0085\u00fe\u001d\u00c44l\u00b90\u00b7E?\u008eYj\u00ee\u00ab\u00e9R \u0096D\u0094\u00f6H\u0018\u009e\u001b\u00cb\u0010\u0088\u00d1p|\u00bb\u00f2\u000f\u00df\u00fd\u00c7\u0019Zx\u00cdkn\u0018\u0089\u00ee\u00ad\u009a\nF\u009d\u00b7\u001e\u0097\u00a6[\u00db\u00be\u00fc\u0097\u00de\u00b5{'\u00db\u00a7\u00b4\u00eep\u00f2\u0003\u00b7\u0089\u0015U|\u00ab[eE\u00be\u00fe\u00b8\u00ef\u00ad\u00a0\u008a\u0080\u00ebq\u0004\u00de\u009d3\u00b9\u00bf\u00bdkm\u00f3\u00d3\u00ed.c$-\u00ef\u0006\u00fe6\u00e0\u0004\u00af\u00a7\u00f6\u00c2\u007f\u008a+\u00d4\u00da\u00a2\u00e6\u00fa\":B\u0015p\u0001\u0014\u00adTs\u00b2\u001d\u0087{{ \u00ae`Mp\u00bew\u0084|U\u00de\u00cb\u0000\u001e\u00ed\u000f\u00edj}\u008df\u00f8J\u0000I,&LJ\u00a2Ata\u00a4OW\u0017\u00da(\u0093\u0087\u009b";
                var8_6 = "\u00cd\u00ff\u0093\u0019\u00f4\u00e6 \u00b7\u00fd~h\u0005`\u00a5;\u00bf\u000e\u0017 \u009f\u00e3\u0018\u00cf\u009c\u00b2\u009f\u00b2Q/I$\u00bf0}8v(i\u00bc\u00ddD\u00ce\u00e9\u008a^8\u00b3G8s\u00fc\u00f0\u0014\u00b6ZPU\u00d1Y3\u0010\u00fa9\u0004\u00e1\u00fb\n!>H\u00db\u00e1&\u00a3\u00c68-\u009b\u00b7\u00d2\u007f fX\u00fd\u00ec\u00bb\u0013\u0082\u0018\u0083\u00daC\u00d0\u00ca~e\u00b4\u00e2x[\t\u00ff\u00daN\u0016\u009bb7>]P[\u00dfh\u00c7Iy\u00c4/\u00a3\u009a\u00b5G\nx\u00afO\u00c8\u008f\u0087\u00b6b\u00cc97\u0007\u00b1\u0019\u00c1|d\u0094\u0006\u00c0\u00ec\u00a3\u00d6<t\u009e\u0019\u001a\u008f\u00df{\u00c0\u0002\u00f81\u0010\u00efJ\"\u0019u\u0080_\u00a8\u00f5\u008d\u0019\t\b\u00ba\u00ae\u0000\u00bb7\u00e2\u00ec`\u0007E8\u00da\u00a3\u0015\u00e4\u00fa$o\u008f&N\\\u0000sM\u0093\u0084\u00bdQ\u00a6\u0016\u00ee\u00bc\u009a\u00bf7\u0002\u00a3\u009d\u00d4\u00f5\u00c9\u00c6L\u00d6\u0010x\u0011\u008d\u00e8\u0098\u0012J\u0093\u00c197/\u00a1\u008d\u00d3h(<\u00c3E{\u00f6Ra\u00a1\u001e\u007f\u00bf\u00e3\u00fe\f\u00cd\u00cbm\u00da\u00eas#\u00cc\u00d5r\u0090\u00d8X2\u00de}*\u00eb\u00c1+2\u00c11\u00df\u00dc\u001a0\u00cb\u00a0\u00ac~\u00d0\u0090\u00ca's\u00e8\u0084\u0083\u00beu\u00c6\u00f7\u00f3\u00f79S\u0085\u00fe\u001d\u00c44l\u00b90\u00b7E?\u008eYj\u00ee\u00ab\u00e9R \u0096D\u0094\u00f6H\u0018\u009e\u001b\u00cb\u0010\u0088\u00d1p|\u00bb\u00f2\u000f\u00df\u00fd\u00c7\u0019Zx\u00cdkn\u0018\u0089\u00ee\u00ad\u009a\nF\u009d\u00b7\u001e\u0097\u00a6[\u00db\u00be\u00fc\u0097\u00de\u00b5{'\u00db\u00a7\u00b4\u00eep\u00f2\u0003\u00b7\u0089\u0015U|\u00ab[eE\u00be\u00fe\u00b8\u00ef\u00ad\u00a0\u008a\u0080\u00ebq\u0004\u00de\u009d3\u00b9\u00bf\u00bdkm\u00f3\u00d3\u00ed.c$-\u00ef\u0006\u00fe6\u00e0\u0004\u00af\u00a7\u00f6\u00c2\u007f\u008a+\u00d4\u00da\u00a2\u00e6\u00fa\":B\u0015p\u0001\u0014\u00adTs\u00b2\u001d\u0087{{ \u00ae`Mp\u00bew\u0084|U\u00de\u00cb\u0000\u001e\u00ed\u000f\u00edj}\u008df\u00f8J\u0000I,&LJ\u00a2Ata\u00a4OW\u0017\u00da(\u0093\u0087\u009b".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = a6k.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = ":\u009e']\u00b2\u00c9\u00baW\u00c3\u0007b\u0092[jk,\u0015\u00c2?\u0084~\u00d8|/\u0018\u00d4\u00cc>V\u00e0u\u00c56<\u00da\u001fb:\u000f\u00d5\u00b9\u00a3Q\u00b4\u0081\u00ca\u007f\u00a8\u00e4";
                    var8_6 = ":\u009e']\u00b2\u00c9\u00baW\u00c3\u0007b\u0092[jk,\u0015\u00c2?\u0084~\u00d8|/\u0018\u00d4\u00cc>V\u00e0u\u00c56<\u00da\u001fb:\u000f\u00d5\u00b9\u00a3Q\u00b4\u0081\u00ca\u007f\u00a8\u00e4".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = a6k.b(var10_9).intern();
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
        a6k.d = var9_3;
        a6k.e = new String[12];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String b(byte[] byArray) {
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2DEC;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("a6k", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            a6k.e[n2] = a6k.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a6k.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a6k" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a6k.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

