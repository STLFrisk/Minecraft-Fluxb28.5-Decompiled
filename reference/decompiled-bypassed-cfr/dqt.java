/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dqt
extends e0x {
    public static final h76 q8i;
    public static final h76 f8w;
    public static final h76 zre;
    public static final h76 hvw;

    public dqt(p3y p3y2) {
        this(p3y2, p3y2.up9());
    }

    public dqt(p3y p3y2, _mi _mi2) {
        super(p3y2, _mi2);
        this.y8l(this._8_.c32().zvi(q8i, Boolean.valueOf(false)).zvi(f8w, Boolean.valueOf(false)).zvi(zre, Boolean.valueOf(false)).zvi(hvw, Boolean.valueOf(false)));
        this.i3l(uja.qqf);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void c76(t9d var1_1, mew var2_2, zfz var3_3, nh4 var4_4, List var5_5, i2h var6_6) {
        block47: {
            block48: {
                block45: {
                    block46: {
                        block44: {
                            block43: {
                                block41: {
                                    block42: {
                                        block39: {
                                            block40: {
                                                block37: {
                                                    block38: {
                                                        block36: {
                                                            block34: {
                                                                block35: {
                                                                    block32: {
                                                                        block33: {
                                                                            var8_7 = this.pj8(var1_1, var2_2.idu());
                                                                            var9_8 = this.pj8(var1_1, var2_2.z6x());
                                                                            var10_9 = this.pj8(var1_1, var2_2.y8e());
                                                                            var11_10 = this.pj8(var1_1, var2_2.o_8());
                                                                            var7_11 = t9d.c();
                                                                            var12_12 = 0.375f;
                                                                            var13_13 = 0.625f;
                                                                            var14_14 = 0.375f;
                                                                            var15_15 = 0.625f;
                                                                            try {
                                                                                v0 = var8_7;
                                                                                if (var7_11 != 0) break block32;
                                                                                if (!v0) break block33;
                                                                            }
                                                                            catch (oov v1) {
                                                                                throw dqt.a(v1);
                                                                            }
                                                                            var14_14 = 0.0f;
                                                                        }
                                                                        v0 = var9_8;
                                                                    }
                                                                    try {
                                                                        if (var7_11 != 0) break block34;
                                                                        if (!v0) break block35;
                                                                    }
                                                                    catch (oov v2) {
                                                                        throw dqt.a(v2);
                                                                    }
                                                                    var15_15 = 1.0f;
                                                                }
                                                                v0 = var8_7;
                                                            }
                                                            try {
                                                                if (var7_11 != 0) break block36;
                                                                if (!v0) {
                                                                }
                                                                ** GOTO lbl51
                                                            }
                                                            catch (oov v3) {
                                                                throw dqt.a(v3);
                                                            }
                                                            v0 = var9_8;
                                                        }
                                                        try {
                                                            try {
                                                                if (var7_11 != 0) break block37;
                                                                if (!v0) break block38;
                                                            }
                                                            catch (oov v4) {
                                                                throw dqt.a(v4);
                                                            }
lbl51:
                                                            // 2 sources

                                                            this.xl4(var12_12, 0.0f, var14_14, var13_13, 1.5f, var15_15);
                                                            super.c76(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
                                                        }
                                                        catch (oov v5) {
                                                            throw dqt.a(v5);
                                                        }
                                                    }
                                                    var14_14 = 0.375f;
                                                    var15_15 = 0.625f;
                                                    v0 = var10_9;
                                                }
                                                try {
                                                    if (var7_11 != 0) break block39;
                                                    if (!v0) break block40;
                                                }
                                                catch (oov v6) {
                                                    throw dqt.a(v6);
                                                }
                                                var12_12 = 0.0f;
                                            }
                                            v0 = var11_10;
                                        }
                                        try {
                                            if (var7_11 != 0) break block41;
                                            if (!v0) break block42;
                                        }
                                        catch (oov v7) {
                                            throw dqt.a(v7);
                                        }
                                        var13_13 = 1.0f;
                                    }
                                    v0 = var10_9;
                                }
                                try {
                                    if (var7_11 != 0) break block43;
                                    if (!v0) {
                                    }
                                    ** GOTO lbl118
                                }
                                catch (oov v8) {
                                    throw dqt.a(v8);
                                }
                                v0 = var11_10;
                            }
                            try {
                                if (var7_11 != 0) break block44;
                                if (!v0) {
                                }
                                ** GOTO lbl118
                            }
                            catch (oov v9) {
                                throw dqt.a(v9);
                            }
                            v0 = var8_7;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (var7_11 != 0) break block45;
                                        if (v0) break block46;
                                    }
                                    catch (oov v10) {
                                        throw dqt.a(v10);
                                    }
                                    v0 = var9_8;
                                    if (var7_11 != 0) break block45;
                                }
                                catch (oov v11) {
                                    throw dqt.a(v11);
                                }
                                if (v0) break block46;
                            }
                            catch (oov v12) {
                                throw dqt.a(v12);
                            }
lbl118:
                            // 3 sources

                            this.xl4(var12_12, 0.0f, var14_14, var13_13, 1.5f, var15_15);
                            super.c76(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
                        }
                        catch (oov v13) {
                            throw dqt.a(v13);
                        }
                    }
                    v0 = var8_7;
                }
                try {
                    if (var7_11 != 0) break block47;
                    if (!v0) break block48;
                }
                catch (oov v14) {
                    throw dqt.a(v14);
                }
                var14_14 = 0.0f;
            }
            v0 = var9_8;
        }
        if (v0) {
            var15_15 = 1.0f;
        }
        this.xl4(var12_12, 0.0f, var14_14, var13_13, 1.0f, var15_15);
    }

    @Override
    public void c7i(m5n m5n2, mew mew2) {
        boolean bl;
        float f;
        float f2;
        float f3;
        float f4;
        block11: {
            boolean bl2;
            block12: {
                int n;
                block9: {
                    boolean bl3;
                    block10: {
                        block7: {
                            boolean bl4;
                            block8: {
                                boolean bl5 = this.pj8(m5n2, mew2.idu());
                                bl4 = this.pj8(m5n2, mew2.z6x());
                                bl3 = this.pj8(m5n2, mew2.y8e());
                                bl2 = this.pj8(m5n2, mew2.o_8());
                                f4 = 0.375f;
                                n = t9d.b();
                                f3 = 0.625f;
                                f2 = 0.375f;
                                f = 0.625f;
                                try {
                                    bl = bl5;
                                    if (n == 0) break block7;
                                    if (!bl) break block8;
                                }
                                catch (oov oov2) {
                                    throw dqt.a(oov2);
                                }
                                f2 = 0.0f;
                            }
                            bl = bl4;
                        }
                        try {
                            if (n == 0) break block9;
                            if (!bl) break block10;
                        }
                        catch (oov oov3) {
                            throw dqt.a(oov3);
                        }
                        f = 1.0f;
                    }
                    bl = bl3;
                }
                try {
                    if (n == 0) break block11;
                    if (!bl) break block12;
                }
                catch (oov oov4) {
                    throw dqt.a(oov4);
                }
                f4 = 0.0f;
            }
            bl = bl2;
        }
        if (bl) {
            f3 = 1.0f;
        }
        this.xl4(f4, 0.0f, f2, f3, 1.0f, f);
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
        return false;
    }

    public boolean pj8(m5n m5n2, mew mew2) {
        boolean bl;
        block28: {
            block32: {
                block34: {
                    block35: {
                        e0x e0x2;
                        int n;
                        block33: {
                            block29: {
                                e0x e0x3;
                                block31: {
                                    e0x e0x4;
                                    block26: {
                                        block27: {
                                            n = t9d.b();
                                            e0x2 = m5n2.getBlockState(mew2).r_y();
                                            try {
                                                try {
                                                    e0x4 = e0x2;
                                                    if (n == 0) break block26;
                                                    if (e0x4 != ox_.c28) break block27;
                                                }
                                                catch (oov oov2) {
                                                    throw dqt.a(oov2);
                                                }
                                                bl = false;
                                                break block28;
                                            }
                                            catch (oov oov3) {
                                                throw dqt.a(oov3);
                                            }
                                        }
                                        e0x4 = e0x2;
                                    }
                                    try {
                                        block30: {
                                            try {
                                                try {
                                                    try {
                                                        bl = e0x4 instanceof dqt;
                                                        if (n == 0) break block29;
                                                        if (!bl) break block30;
                                                    }
                                                    catch (oov oov4) {
                                                        throw dqt.a(oov4);
                                                    }
                                                    e0x3 = e0x2;
                                                    if (n == 0) break block31;
                                                }
                                                catch (oov oov5) {
                                                    throw dqt.a(oov5);
                                                }
                                                if (e0x3.kgd == this.kgd) break block32;
                                            }
                                            catch (oov oov6) {
                                                throw dqt.a(oov6);
                                            }
                                        }
                                        e0x3 = e0x2;
                                    }
                                    catch (oov oov7) {
                                        throw dqt.a(oov7);
                                    }
                                }
                                bl = e0x3 instanceof u98;
                            }
                            try {
                                try {
                                    if (n == 0) break block33;
                                    if (bl) break block32;
                                }
                                catch (oov oov8) {
                                    throw dqt.a(oov8);
                                }
                                bl = e0x2.kgd.u4h();
                            }
                            catch (oov oov9) {
                                throw dqt.a(oov9);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (n == 0) break block28;
                                            if (!bl) break block34;
                                        }
                                        catch (oov oov10) {
                                            throw dqt.a(oov10);
                                        }
                                        bl = e0x2.gck();
                                        if (n == 0) break block28;
                                    }
                                    catch (oov oov11) {
                                        throw dqt.a(oov11);
                                    }
                                    if (!bl) break block34;
                                }
                                catch (oov oov12) {
                                    throw dqt.a(oov12);
                                }
                                if (e0x2.kgd == p3y.clf) break block35;
                            }
                            catch (oov oov13) {
                                throw dqt.a(oov13);
                            }
                            bl = true;
                            break block28;
                        }
                        catch (oov oov14) {
                            throw dqt.a(oov14);
                        }
                    }
                    bl = false;
                    break block28;
                }
                bl = false;
                break block28;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean ron(m5n m5n2, mew mew2, vt2 vt22) {
        return true;
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = t9d2.v0f;
                    if (n == 0) break block2;
                    if (!bl) break block3;
                }
                catch (oov oov2) {
                    throw dqt.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = vba.f_s(ha92, t9d2, mew2);
        }
        return bl;
    }

    @Override
    public int hvp(zfz zfz2) {
        return 0;
    }

    @Override
    public zfz w1b(zfz zfz2, m5n m5n2, mew mew2) {
        return zfz2.zvi(q8i, Boolean.valueOf(this.pj8(m5n2, mew2.idu()))).zvi(f8w, Boolean.valueOf(this.pj8(m5n2, mew2.o_8()))).zvi(zre, Boolean.valueOf(this.pj8(m5n2, mew2.z6x()))).zvi(hvw, Boolean.valueOf(this.pj8(m5n2, mew2.y8e())));
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{q8i, f8w, hvw, zre});
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

                var10 = c.a(-8691823666073045858L, -6366690480812290531L, MethodHandles.lookup().lookupClass()).a(64153112026668L) ^ 83070444721405L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var10 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var10 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new String[4];
                var6_4 = 0;
                var5_5 = "\u00cb\u0089\\\u00ef9\u001b\u00ce\u00d4\b\u008b\u007f]xp\u0000\u001f\u00cd";
                var7_6 = "\u00cb\u0089\\\u00ef9\u001b\u00ce\u00d4\b\u008b\u007f]xp\u0000\u001f\u00cd".length();
                var4_7 = 8;
                var3_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = dqt.b(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u000e\u00c7\u0098$\u0016\u00a1Db\b\u00cf\u00b4\u00bc\u00fd$\u00e2\u00d23";
                    var7_6 = "\u000e\u00c7\u0098$\u0016\u00a1Db\b\u00cf\u00b4\u00bc\u00fd$\u00e2\u00d23".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = dqt.b(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var9_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl50:
                // 1 sources

                ** continue;
            }
        }
        var0_10 = var8_3;
        dqt.q8i = h76.d_1(var0_10[1]);
        dqt.f8w = h76.d_1(var0_10[2]);
        dqt.zre = h76.d_1(var0_10[0]);
        dqt.hvw = h76.d_1(var0_10[3]);
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

