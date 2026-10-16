/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class g_x$lo3
extends Enum {
    public static final g_x$lo3 lbk;
    public static final g_x$lo3 t86;
    public static final g_x$lo3 yql;
    public static final g_x$lo3 ivg;
    public static final g_x$lo3 em2;
    public static final g_x$lo3 k4o;
    public final vt2[] uy6;
    public final float _8f;
    public final boolean kxr;
    public final g_x$pi5[] x6f;
    public final g_x$pi5[] jpu;
    public final g_x$pi5[] iot;
    public final g_x$pi5[] shb;
    private static final g_x$lo3[] zqu;
    private static final g_x$lo3[] oqf;

    public static g_x$lo3[] values() {
        return (g_x$lo3[])oqf.clone();
    }

    public static g_x$lo3 valueOf(String string) {
        return Enum.valueOf(g_x$lo3.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g_x$lo3(boolean bl, g_x$pi5[] pi5Array, g_x$pi5[] pi5Array2, g_x$pi5[] pi5Array3, g_x$pi5[] pi5Array4) {
        void var9_7;
        void var8_6;
        void var2_-1;
        void var1_-1;
        this.uy6 = (vt2[])bl;
        this._8f = (float)pi5Array;
        this.kxr = pi5Array2;
        this.x6f = pi5Array3;
        this.jpu = pi5Array4;
        this.iot = var8_6;
        this.shb = var9_7;
    }

    public static g_x$lo3 cnv(vt2 vt22) {
        return zqu[vt22.c3s()];
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

                var10 = c.a(7391845622703677259L, -4106930306843922825L, MethodHandles.lookup().lookupClass()).a(199215380582696L) ^ 50170214618931L;
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
                var8_3 = new String[6];
                var6_4 = 0;
                var5_5 = "\u009bB\u00fa\u00b0\u0017\u00f5I\u009d\b\u0086\u00d6\u0087x\u00c7\u00c5\u0098%\b\rg\u00ed\u00af\u00db\u00b6\u00f7\u0093\bx\u00a4\u009cC\u00ee\u00feo\u00b2";
                var7_6 = "\u009bB\u00fa\u00b0\u0017\u00f5I\u009d\b\u0086\u00d6\u0087x\u00c7\u00c5\u0098%\b\rg\u00ed\u00af\u00db\u00b6\u00f7\u0093\bx\u00a4\u009cC\u00ee\u00feo\u00b2".length();
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
                    var8_3[var6_4++] = g_x$lo3.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00d1\u00ec3,\u00ae\u00d7-\u00e6\b\u00c1\u00804N\u00a2\u00ce\\s";
                    var7_6 = "\u00d1\u00ec3,\u00ae\u00d7-\u00e6\b\u00c1\u00804N\u00a2\u00ce\\s".length();
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
                    var8_3[var6_4++] = g_x$lo3.a(var9_9).intern();
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
        g_x$lo3.lbk = new g_x$lo3(var0_10[1], 0, new vt2[]{vt2.te4, vt2.zk4, vt2.z9q, vt2.mxp}, 0.5f, false, new g_x$pi5[0], new g_x$pi5[0], new g_x$pi5[0], new g_x$pi5[0]);
        g_x$lo3.t86 = new g_x$lo3(var0_10[0], 1, new vt2[]{vt2.zk4, vt2.te4, vt2.z9q, vt2.mxp}, 1.0f, false, new g_x$pi5[0], new g_x$pi5[0], new g_x$pi5[0], new g_x$pi5[0]);
        g_x$lo3.yql = new g_x$lo3(var0_10[5], 2, new vt2[]{vt2.rf3, vt2.m3r, vt2.zk4, vt2.te4}, 0.8f, true, new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5.tbc, g_x$pi5.r4c, g_x$pi5.woi, g_x$pi5.wiv, g_x$pi5.woi, g_x$pi5.wiv, g_x$pi5.tbc}, new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5._g3, g_x$pi5.r4c, g_x$pi5.e80, g_x$pi5.wiv, g_x$pi5.e80, g_x$pi5.wiv, g_x$pi5._g3}, new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5._g3, g_x$pi5.wyb, g_x$pi5.e80, g_x$pi5.hxa, g_x$pi5.e80, g_x$pi5.hxa, g_x$pi5._g3}, new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5.tbc, g_x$pi5.wyb, g_x$pi5.woi, g_x$pi5.hxa, g_x$pi5.woi, g_x$pi5.hxa, g_x$pi5.tbc});
        g_x$lo3.ivg = new g_x$lo3(var0_10[4], 3, new vt2[]{vt2.te4, vt2.zk4, vt2.m3r, vt2.rf3}, 0.8f, true, new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5.tbc, g_x$pi5.wiv, g_x$pi5.tbc, g_x$pi5.wiv, g_x$pi5.woi, g_x$pi5.r4c, g_x$pi5.woi}, new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5.tbc, g_x$pi5.hxa, g_x$pi5.tbc, g_x$pi5.hxa, g_x$pi5.woi, g_x$pi5.wyb, g_x$pi5.woi}, new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5._g3, g_x$pi5.hxa, g_x$pi5._g3, g_x$pi5.hxa, g_x$pi5.e80, g_x$pi5.wyb, g_x$pi5.e80}, new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5._g3, g_x$pi5.wiv, g_x$pi5._g3, g_x$pi5.wiv, g_x$pi5.e80, g_x$pi5.r4c, g_x$pi5.e80});
        g_x$lo3.em2 = new g_x$lo3(var0_10[2], 4, new vt2[]{vt2.rf3, vt2.m3r, vt2.z9q, vt2.mxp}, 0.6f, true, new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5.up3, g_x$pi5.r4c, g_x$pi5.eqf, g_x$pi5.wiv, g_x$pi5.eqf, g_x$pi5.wiv, g_x$pi5.up3}, new g_x$pi5[]{g_x$pi5.r4c, g_x$pi5.qvp, g_x$pi5.r4c, g_x$pi5.m8h, g_x$pi5.wiv, g_x$pi5.m8h, g_x$pi5.wiv, g_x$pi5.qvp}, new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5.qvp, g_x$pi5.wyb, g_x$pi5.m8h, g_x$pi5.hxa, g_x$pi5.m8h, g_x$pi5.hxa, g_x$pi5.qvp}, new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5.up3, g_x$pi5.wyb, g_x$pi5.eqf, g_x$pi5.hxa, g_x$pi5.eqf, g_x$pi5.hxa, g_x$pi5.up3});
        g_x$lo3.k4o = new g_x$lo3(var0_10[3], 5, new vt2[]{vt2.m3r, vt2.rf3, vt2.z9q, vt2.mxp}, 0.6f, true, new g_x$pi5[]{g_x$pi5.hxa, g_x$pi5.up3, g_x$pi5.hxa, g_x$pi5.eqf, g_x$pi5.wyb, g_x$pi5.eqf, g_x$pi5.wyb, g_x$pi5.up3}, new g_x$pi5[]{g_x$pi5.hxa, g_x$pi5.qvp, g_x$pi5.hxa, g_x$pi5.m8h, g_x$pi5.wyb, g_x$pi5.m8h, g_x$pi5.wyb, g_x$pi5.qvp}, new g_x$pi5[]{g_x$pi5.wiv, g_x$pi5.qvp, g_x$pi5.wiv, g_x$pi5.m8h, g_x$pi5.r4c, g_x$pi5.m8h, g_x$pi5.r4c, g_x$pi5.qvp}, new g_x$pi5[]{g_x$pi5.wiv, g_x$pi5.up3, g_x$pi5.wiv, g_x$pi5.eqf, g_x$pi5.r4c, g_x$pi5.eqf, g_x$pi5.r4c, g_x$pi5.up3});
        g_x$lo3.oqf = new g_x$lo3[]{g_x$lo3.lbk, g_x$lo3.t86, g_x$lo3.yql, g_x$lo3.ivg, g_x$lo3.em2, g_x$lo3.k4o};
        g_x$lo3.zqu = new g_x$lo3[6];
        g_x$lo3.zqu[vt2.m3r.c3s()] = g_x$lo3.lbk;
        g_x$lo3.zqu[vt2.rf3.c3s()] = g_x$lo3.t86;
        g_x$lo3.zqu[vt2.z9q.c3s()] = g_x$lo3.yql;
        g_x$lo3.zqu[vt2.mxp.c3s()] = g_x$lo3.ivg;
        g_x$lo3.zqu[vt2.te4.c3s()] = g_x$lo3.em2;
        g_x$lo3.zqu[vt2.zk4.c3s()] = g_x$lo3.k4o;
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
}

