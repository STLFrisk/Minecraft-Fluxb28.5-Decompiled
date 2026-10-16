/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class g_x$pi5
extends Enum {
    public static final g_x$pi5 wyb;
    public static final g_x$pi5 r4c;
    public static final g_x$pi5 qvp;
    public static final g_x$pi5 up3;
    public static final g_x$pi5 woi;
    public static final g_x$pi5 e80;
    public static final g_x$pi5 hxa;
    public static final g_x$pi5 wiv;
    public static final g_x$pi5 m8h;
    public static final g_x$pi5 eqf;
    public static final g_x$pi5 tbc;
    public static final g_x$pi5 _g3;
    public final int e9j;
    private static final g_x$pi5[] nqq;

    public static g_x$pi5[] values() {
        return (g_x$pi5[])nqq.clone();
    }

    public static g_x$pi5 valueOf(String string) {
        return Enum.valueOf(g_x$pi5.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private g_x$pi5() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.e9j = var3_1.c3s() + (var4_2 != false ? vt2.values().length : 0);
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

                var10 = c.a(-6151633094877281814L, 5255934134425496748L, MethodHandles.lookup().lookupClass()).a(150520179626095L) ^ 121843353859951L;
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
                var8_3 = new String[12];
                var6_4 = 0;
                var5_5 = "W\u00ca;\u0011&\u0010\u0094l\b}?|y\u00a3,p^\u0010\u00f5J\u00f9\u00afH\u009c\u00994\u00e43-\u00f4\u00bd\u001a\u00dd~\b\u00f4\u00c8o\u00f5\u00d9\u0084=\u00e8\u0010\u0016\u00a9GB\u00e1\u00ed\u0002M\u00e0\u0003\u00d4\u00a4\u00b0N\u0010e\b\u00b6dd\u008b9X\u009c\u0007\u0010W\u0015Y\u00d8\u00fb~\u00b0\r\u00d3\u00fe\u00f3\u0010A\u0019\u0019Z\b_\u00df\u0080\n\u00f3\u0081\u00bc\u00f5\b(\u009b\u00c8\u001d*f\u0006p\u0010\u0084\u00dc\u00efn\u000f\u0095#c\u0081\u000e\u00a9f\u0012k_\u00b2";
                var7_6 = "W\u00ca;\u0011&\u0010\u0094l\b}?|y\u00a3,p^\u0010\u00f5J\u00f9\u00afH\u009c\u00994\u00e43-\u00f4\u00bd\u001a\u00dd~\b\u00f4\u00c8o\u00f5\u00d9\u0084=\u00e8\u0010\u0016\u00a9GB\u00e1\u00ed\u0002M\u00e0\u0003\u00d4\u00a4\u00b0N\u0010e\b\u00b6dd\u008b9X\u009c\u0007\u0010W\u0015Y\u00d8\u00fb~\u00b0\r\u00d3\u00fe\u00f3\u0010A\u0019\u0019Z\b_\u00df\u0080\n\u00f3\u0081\u00bc\u00f5\b(\u009b\u00c8\u001d*f\u0006p\u0010\u0084\u00dc\u00efn\u000f\u0095#c\u0081\u000e\u00a9f\u0012k_\u00b2".length();
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
                    var8_3[var6_4++] = g_x$pi5.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00ceU\u00a9`@t|Y\u0010Y\u0084+M\u0088l\u00f3\u00df\u00dd\u00df\u00e4\u00cby\u00036\u00b8";
                    var7_6 = "\u00ceU\u00a9`@t|Y\u0010Y\u0084+M\u0088l\u00f3\u00df\u00dd\u00df\u00e4\u00cby\u00036\u00b8".length();
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
                    var8_3[var6_4++] = g_x$pi5.a(var9_9).intern();
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
        g_x$pi5.wyb = new g_x$pi5(var0_10[1], 0, vt2.m3r, false);
        g_x$pi5.r4c = new g_x$pi5(var0_10[8], 1, vt2.rf3, false);
        g_x$pi5.qvp = new g_x$pi5(var0_10[0], 2, vt2.z9q, false);
        g_x$pi5.up3 = new g_x$pi5(var0_10[10], 3, vt2.mxp, false);
        g_x$pi5.woi = new g_x$pi5(var0_10[3], 4, vt2.te4, false);
        g_x$pi5.e80 = new g_x$pi5(var0_10[7], 5, vt2.zk4, false);
        g_x$pi5.hxa = new g_x$pi5(var0_10[11], 6, vt2.m3r, true);
        g_x$pi5.wiv = new g_x$pi5(var0_10[5], 7, vt2.rf3, true);
        g_x$pi5.m8h = new g_x$pi5(var0_10[4], 8, vt2.z9q, true);
        g_x$pi5.eqf = new g_x$pi5(var0_10[6], 9, vt2.mxp, true);
        g_x$pi5.tbc = new g_x$pi5(var0_10[9], 10, vt2.te4, true);
        g_x$pi5._g3 = new g_x$pi5(var0_10[2], 11, vt2.zk4, true);
        g_x$pi5.nqq = new g_x$pi5[]{g_x$pi5.wyb, g_x$pi5.r4c, g_x$pi5.qvp, g_x$pi5.up3, g_x$pi5.woi, g_x$pi5.e80, g_x$pi5.hxa, g_x$pi5.wiv, g_x$pi5.m8h, g_x$pi5.eqf, g_x$pi5.tbc, g_x$pi5._g3};
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

