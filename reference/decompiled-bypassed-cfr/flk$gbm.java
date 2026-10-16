/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class flk$gbm
extends Enum {
    public static final flk$gbm yw8;
    public static final flk$gbm grk;
    public static final flk$gbm t9v;
    public static final flk$gbm h9h;
    public static final flk$gbm g03;
    public static final flk$gbm fru;
    public static final flk$gbm e3w;
    private static final flk$gbm[] lhx;

    public static flk$gbm[] values() {
        return (flk$gbm[])lhx.clone();
    }

    public static flk$gbm valueOf(String string) {
        return Enum.valueOf(flk$gbm.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private flk$gbm() {
        void var2_-1;
        void var1_-1;
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

                var10 = c.a(-2009181270454431898L, -5992735770734320271L, MethodHandles.lookup().lookupClass()).a(187375170077191L) ^ 19233725886106L;
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
                var8_3 = new String[7];
                var6_4 = 0;
                var5_5 = "K\u001a\u0016\u009c\u00f8\u0001\u001e1\b\u00ef\u008a}\u0004\u00a7P\u00f4\u00a1\u0010@\u001e\u0087\b\u00a2\u0092\u0000\u001c\u00fb\u001b\u00bb\u00ec\u00ea\u00f2Be\b\u0017\u00e3\u00fal\u00f4Ou\u0087\u0010a\u00e6\u0014\u0085\u00fe#W\u0000S\u00d0\u00dd\u00ca\u00f7\u00b6V\u00c6";
                var7_6 = "K\u001a\u0016\u009c\u00f8\u0001\u001e1\b\u00ef\u008a}\u0004\u00a7P\u00f4\u00a1\u0010@\u001e\u0087\b\u00a2\u0092\u0000\u001c\u00fb\u001b\u00bb\u00ec\u00ea\u00f2Be\b\u0017\u00e3\u00fal\u00f4Ou\u0087\u0010a\u00e6\u0014\u0085\u00fe#W\u0000S\u00d0\u00dd\u00ca\u00f7\u00b6V\u00c6".length();
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
                    var8_3[var6_4++] = flk$gbm.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0004\u00cc\u00a7mK\u00c8\u00f1\u00ea\bP\u001d\u0097\u0002K\u00cen\u00da";
                    var7_6 = "\u0004\u00cc\u00a7mK\u00c8\u00f1\u00ea\bP\u001d\u0097\u0002K\u00cen\u00da".length();
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
                    var8_3[var6_4++] = flk$gbm.a(var9_9).intern();
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
        flk$gbm.yw8 = new flk$gbm(var0_10[6], 0);
        flk$gbm.grk = new flk$gbm(var0_10[4], 1);
        flk$gbm.t9v = new flk$gbm(var0_10[2], 2);
        flk$gbm.h9h = new flk$gbm(var0_10[5], 3);
        flk$gbm.g03 = new flk$gbm(var0_10[0], 4);
        flk$gbm.fru = new flk$gbm(var0_10[1], 5);
        flk$gbm.e3w = new flk$gbm(var0_10[3], 6);
        flk$gbm.lhx = new flk$gbm[]{flk$gbm.yw8, flk$gbm.grk, flk$gbm.t9v, flk$gbm.h9h, flk$gbm.g03, flk$gbm.fru, flk$gbm.e3w};
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

