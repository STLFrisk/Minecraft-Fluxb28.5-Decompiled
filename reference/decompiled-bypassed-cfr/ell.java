/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ell
extends e0x {
    public static final qx_ qlr;
    public static final h76 _gw;
    public static final zb_ xoa;

    public ell(p3y p3y2) {
        super(p3y2);
        this.y8l(this._8_.c32().zvi(qlr, (Comparable)((Object)vt2.z9q)).zvi(_gw, Boolean.valueOf(false)).zvi(xoa, (Comparable)((Object)ell$bu8.m2p)));
        float f = 0.5f;
        float f2 = 1.0f;
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.i3l(uja.yj_);
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public boolean iwf(m5n m5n2, mew mew2) {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = (Boolean)m5n2.getBlockState(mew2).dil(_gw);
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw ell.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public nh4 j54(t9d t9d2, mew mew2) {
        this.c7i(t9d2, mew2);
        return super.j54(t9d2, mew2);
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        this.c7i(t9d2, mew2);
        return super.m__(t9d2, mew2, zfz2);
    }

    @Override
    public void c7i(m5n m5n2, mew mew2) {
        this.kdc(m5n2.getBlockState(mew2));
    }

    @Override
    public void bf6() {
        float f = 0.1875f;
        this.xl4(0.0f, 0.40625f, 0.0f, 1.0f, 0.59375f, 1.0f);
    }

    /*
     * Unable to fully structure code
     */
    public void kdc(zfz var1_1) {
        block32: {
            block39: {
                block40: {
                    block37: {
                        block38: {
                            block35: {
                                block36: {
                                    block34: {
                                        block33: {
                                            block31: {
                                                var2_2 = t9d.c();
                                                try {
                                                    try {
                                                        v0 = var1_1;
                                                        if (var2_2 != 0) break block31;
                                                        if (v0.r_y() != this) break block32;
                                                    }
                                                    catch (oov v1) {
                                                        throw ell.a(v1);
                                                    }
                                                    v0 = var1_1;
                                                }
                                                catch (oov v2) {
                                                    throw ell.a(v2);
                                                }
                                            }
                                            try {
                                                v3 = v0.dil(ell.xoa) == ell$bu8.f9s;
                                            }
                                            catch (oov v4) {
                                                throw ell.a(v4);
                                            }
                                            var3_3 = v3;
                                            var4_4 = (Boolean)var1_1.dil(ell._gw);
                                            var5_5 = (vt2)var1_1.dil(ell.qlr);
                                            var6_6 = 0.1875f;
                                            try {
                                                try {
                                                    if (var2_2 != 0) break block33;
                                                    if (var3_3) {
                                                    }
                                                    ** GOTO lbl40
                                                }
                                                catch (oov v5) {
                                                    throw ell.a(v5);
                                                }
                                                this.xl4(0.0f, 0.8125f, 0.0f, 1.0f, 1.0f, 1.0f);
                                            }
                                            catch (oov v6) {
                                                throw ell.a(v6);
                                            }
                                        }
                                        try {
                                            if (var2_2 == 0) break block34;
lbl40:
                                            // 2 sources

                                            this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.1875f, 1.0f);
                                        }
                                        catch (oov v7) {
                                            throw ell.a(v7);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                if (!var4_4.booleanValue()) break block32;
                                                v8 = var5_5;
                                                v9 = vt2.z9q;
                                                if (var2_2 != 0) break block35;
                                            }
                                            catch (oov v10) {
                                                throw ell.a(v10);
                                            }
                                            if (v8 != v9) break block36;
                                        }
                                        catch (oov v11) {
                                            throw ell.a(v11);
                                        }
                                        this.xl4(0.0f, 0.0f, 0.8125f, 1.0f, 1.0f, 1.0f);
                                    }
                                    catch (oov v12) {
                                        throw ell.a(v12);
                                    }
                                }
                                v8 = var5_5;
                                v9 = vt2.mxp;
                            }
                            try {
                                try {
                                    if (var2_2 != 0) break block37;
                                    if (v8 != v9) break block38;
                                }
                                catch (oov v13) {
                                    throw ell.a(v13);
                                }
                                this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.1875f);
                            }
                            catch (oov v14) {
                                throw ell.a(v14);
                            }
                        }
                        v8 = var5_5;
                        v9 = vt2.te4;
                    }
                    try {
                        try {
                            if (var2_2 != 0) break block39;
                            if (v8 != v9) break block40;
                        }
                        catch (oov v15) {
                            throw ell.a(v15);
                        }
                        this.xl4(0.8125f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    }
                    catch (oov v16) {
                        throw ell.a(v16);
                    }
                }
                v8 = var5_5;
                v9 = vt2.zk4;
            }
            try {
                if (v8 == v9) {
                    this.xl4(0.0f, 0.0f, 0.0f, 0.1875f, 1.0f, 1.0f);
                }
            }
            catch (oov v17) {
                throw ell.a(v17);
            }
        }
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        int n;
        ha9 ha93;
        t9d t9d3;
        block5: {
            block6: {
                int n2 = t9d.c();
                try {
                    if (this.kgd == p3y.e21) {
                        return true;
                    }
                }
                catch (oov oov2) {
                    throw ell.a(oov2);
                }
                zfz2 = zfz2.dm4(_gw);
                try {
                    t9d2.vct(mew2, zfz2, 2);
                    t9d3 = t9d2;
                    ha93 = ha92;
                    n = ((Boolean)zfz2.dil(_gw)).booleanValue();
                    if (n2 != 0) break block5;
                    if (n == 0) break block6;
                }
                catch (oov oov3) {
                    throw ell.a(oov3);
                }
                n = 1003;
                break block5;
            }
            n = 1006;
        }
        t9d3.pbs(ha93, n, mew2, 0);
        return true;
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        block22: {
            int n;
            ha9 ha92;
            t9d t9d3;
            block26: {
                block27: {
                    int n2;
                    int n3;
                    block25: {
                        int n4;
                        block23: {
                            int n5;
                            block20: {
                                n3 = t9d.c();
                                if (t9d2.v0f) break block22;
                                mew mew3 = mew2.offset(((vt2)((Object)zfz2.dil(qlr))).b4b());
                                try {
                                    block21: {
                                        try {
                                            try {
                                                n5 = ell.ov4(t9d2.getBlockState(mew3).r_y());
                                                if (n3 != 0) break block20;
                                                if (n5 != 0) break block21;
                                            }
                                            catch (oov oov2) {
                                                throw ell.a(oov2);
                                            }
                                            t9d2.i6x(mew2);
                                            this.lf0(t9d2, mew2, zfz2, 0);
                                            if (n3 == 0) break block22;
                                        }
                                        catch (oov oov3) {
                                            throw ell.a(oov3);
                                        }
                                    }
                                    n5 = t9d2.gxo(mew2);
                                }
                                catch (oov oov4) {
                                    throw ell.a(oov4);
                                }
                            }
                            n2 = n5;
                            try {
                                block24: {
                                    try {
                                        try {
                                            try {
                                                n4 = n2;
                                                if (n3 != 0) break block23;
                                                if (n4 != 0) break block24;
                                            }
                                            catch (oov oov5) {
                                                throw ell.a(oov5);
                                            }
                                            n4 = e0x2.scl();
                                            if (n3 != 0) break block23;
                                        }
                                        catch (oov oov6) {
                                            throw ell.a(oov6);
                                        }
                                        if (n4 == 0) break block22;
                                    }
                                    catch (oov oov7) {
                                        throw ell.a(oov7);
                                    }
                                }
                                n4 = ((Boolean)zfz2.dil(_gw)).booleanValue();
                            }
                            catch (oov oov8) {
                                throw ell.a(oov8);
                            }
                        }
                        int n6 = n4;
                        try {
                            int n7;
                            try {
                                n7 = n6;
                                if (n3 != 0) break block25;
                                if (n7 == n2) break block22;
                            }
                            catch (oov oov9) {
                                throw ell.a(oov9);
                            }
                            n7 = t9d2.vct(mew2, zfz2.zvi(_gw, Boolean.valueOf(n2 != 0)), 2) ? 1 : 0;
                        }
                        catch (oov oov10) {
                            throw ell.a(oov10);
                        }
                    }
                    try {
                        t9d3 = t9d2;
                        ha92 = null;
                        n = n2;
                        if (n3 != 0) break block26;
                        if (n == 0) break block27;
                    }
                    catch (oov oov11) {
                        throw ell.a(oov11);
                    }
                    n = 1003;
                    break block26;
                }
                n = 1006;
            }
            t9d3.pbs(ha92, n, mew2, 0);
        }
    }

    @Override
    public akm mns(t9d t9d2, mew mew2, fqr fqr2, fqr fqr3) {
        this.c7i(t9d2, mew2);
        return super.mns(t9d2, mew2, fqr2, fqr3);
    }

    @Override
    public zfz qk_(t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3, int n, g_3 g_32) {
        zfz zfz2;
        block5: {
            ell$bu8 ell$bu8;
            zb_ zb_2;
            zfz zfz3;
            block4: {
                int n2 = t9d.c();
                zfz2 = this.l4i();
                try {
                    if (n2 != 0) break block4;
                    if (!vt22.e30().pyt()) break block5;
                }
                catch (oov oov2) {
                    throw ell.a(oov2);
                }
                zfz2 = zfz2.zvi(qlr, (Comparable)((Object)vt22)).zvi(_gw, Boolean.valueOf(false));
            }
            try {
                zfz3 = zfz2;
                zb_2 = xoa;
                ell$bu8 = f2 > 0.5f ? ell$bu8.f9s : ell$bu8.m2p;
            }
            catch (oov oov3) {
                throw ell.a(oov3);
            }
            zfz2 = zfz3.zvi(zb_2, (Comparable)((Object)ell$bu8));
        }
        return zfz2;
    }

    @Override
    public boolean d9o(t9d t9d2, mew mew2, vt2 vt22) {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = t9d.b();
                    try {
                        try {
                            bl = vt22.e30().juw();
                            if (n == 0) break block6;
                            if (bl) break block7;
                        }
                        catch (oov oov2) {
                            throw ell.a(oov2);
                        }
                        bl = ell.ov4(t9d2.getBlockState(mew2.offset(vt22.b4b())).r_y());
                    }
                    catch (oov oov3) {
                        throw ell.a(oov3);
                    }
                }
                try {
                    if (n == 0) break block8;
                    if (!bl) break block7;
                }
                catch (oov oov4) {
                    throw ell.a(oov4);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Exception decompiling
     */
    public static vt2 heo(int var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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
     * Exception decompiling
     */
    public static int k_8(vt2 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
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

    private static boolean ov4(e0x e0x2) {
        boolean bl;
        block18: {
            block21: {
                block19: {
                    e0x e0x3;
                    int n;
                    block20: {
                        block16: {
                            block17: {
                                n = t9d.c();
                                try {
                                    try {
                                        try {
                                            e0x3 = e0x2;
                                            if (n != 0) break block16;
                                            if (!e0x3.kgd.u4h()) break block17;
                                        }
                                        catch (oov oov2) {
                                            throw ell.a(oov2);
                                        }
                                        bl = e0x2.gck();
                                        if (n != 0) break block18;
                                    }
                                    catch (oov oov3) {
                                        throw ell.a(oov3);
                                    }
                                    if (bl) break block19;
                                }
                                catch (oov oov4) {
                                    throw ell.a(oov4);
                                }
                            }
                            e0x3 = e0x2;
                        }
                        try {
                            try {
                                if (n != 0) break block20;
                                if (e0x3 == ox_.t7q) break block19;
                            }
                            catch (oov oov5) {
                                throw ell.a(oov5);
                            }
                            e0x3 = e0x2;
                        }
                        catch (oov oov6) {
                            throw ell.a(oov6);
                        }
                    }
                    try {
                        try {
                            try {
                                bl = e0x3 instanceof izd;
                                if (n != 0) break block18;
                                if (bl) break block19;
                            }
                            catch (oov oov7) {
                                throw ell.a(oov7);
                            }
                            bl = e0x2 instanceof g7u;
                            if (n != 0) break block18;
                        }
                        catch (oov oov8) {
                            throw ell.a(oov8);
                        }
                        if (!bl) break block21;
                    }
                    catch (oov oov9) {
                        throw ell.a(oov9);
                    }
                }
                bl = true;
                break block18;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public w51 w3x() {
        return w51.gx9;
    }

    @Override
    public zfz kig(int n) {
        ell$bu8 ell$bu8;
        zb_ zb_2;
        zfz zfz2;
        boolean bl;
        h76 h762;
        zfz zfz3;
        block4: {
            block5: {
                int n2 = t9d.c();
                try {
                    zfz3 = this.l4i().zvi(qlr, (Comparable)((Object)ell.heo(n)));
                    h762 = _gw;
                    bl = n & 4;
                    if (n2 != 0) break block4;
                    if (!bl) break block5;
                }
                catch (oov oov2) {
                    throw ell.a(oov2);
                }
                bl = true;
                break block4;
            }
            bl = false;
        }
        try {
            zfz2 = zfz3.zvi(h762, Boolean.valueOf(bl));
            zb_2 = xoa;
            ell$bu8 = (n & 8) == 0 ? ell$bu8.m2p : ell$bu8.f9s;
        }
        catch (oov oov3) {
            throw ell.a(oov3);
        }
        return zfz2.zvi(zb_2, (Comparable)((Object)ell$bu8));
    }

    @Override
    public int hvp(zfz zfz2) {
        Comparable<Boolean> comparable;
        int n;
        block3: {
            block4: {
                n = 0;
                n |= ell.k_8((vt2)((Object)zfz2.dil(qlr)));
                int n2 = t9d.c();
                try {
                    comparable = (Boolean)zfz2.dil(_gw);
                    if (n2 != 0) break block3;
                    if (!comparable.booleanValue()) break block4;
                }
                catch (oov oov2) {
                    throw ell.a(oov2);
                }
                n |= 4;
            }
            comparable = zfz2.dil(xoa);
        }
        if (comparable == ell$bu8.f9s) {
            n |= 8;
        }
        return n;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{qlr, _gw, xoa});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(2662145421722095219L, -2818753051332473705L, MethodHandles.lookup().lookupClass()).a(199302710589341L) ^ 0x19EAF83B177CL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u009auS\u0014\u00bd\u00c0\u00de\u008a\b\u00fa\u001d\u0091\u0095]\u00db\u00d8\u00c2\b\u00f4\u00b2\n\u00cc\u00e2X\u001fP";
        int n2 = "\u009auS\u0014\u00bd\u00c0\u00de\u008a\b\u00fa\u001d\u0091\u0095]\u00db\u00d8\u00c2\b\u00f4\u00b2\n\u00cc\u00e2X\u001fP".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ell.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                qlr = qx_.q0o(stringArray2[2], vt2$unz.fzl);
                _gw = h76.d_1(stringArray2[1]);
                xoa = zb_.pq4(stringArray2[0], ell$bu8.class);
                return;
            }
            n3 = string.charAt(n4);
        }
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
}

