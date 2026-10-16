/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class g7u$qmc
extends Enum
implements v4k {
    public static final g7u$qmc rn9;
    public static final g7u$qmc qxj;
    public static final g7u$qmc ryv;
    public static final g7u$qmc pfi;
    public static final g7u$qmc xd3;
    private final String iq6;
    private static final g7u$qmc[] lkz;

    public static g7u$qmc[] values() {
        return (g7u$qmc[])lkz.clone();
    }

    public static g7u$qmc valueOf(String string) {
        return Enum.valueOf(g7u$qmc.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g7u$qmc() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.iq6 = var3_1;
    }

    public String toString() {
        return this.iq6;
    }

    @Override
    public String mo3() {
        return this.iq6;
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

                var10 = c.a(-8331177049818762763L, -3650818783733809290L, MethodHandles.lookup().lookupClass()).a(280321789621357L) ^ 106778202552245L;
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
                var8_3 = new String[10];
                var6_4 = 0;
                var5_5 = "\u00be\u00fb\u0080tW y\u009f\u0091\u0001\u00ca\\\u009c! \u0089\u0010\u00bb\u009f\u009e\u009b\u00fd\u008c\u0088=\u00c8-\u0083$\bW\u00f1Y\u0010\u00f2e8\u00cd\u00eaU;k\u0002\u00bd\u00f7\u0090`\u001f\u00c5\u001f\u0010\u0093W1\u00ae\u009cS\u00a3\u008c\u0092\u00e7(u\u00a5u\u00ba\u00a9\u0010U\u00a9\u0005\u0005p!:8l\u00a1\u0007\u00b5\u00d7\u00feC\u00b1\u0010Q\u00f6\u00bf\u00e0g\u0012\u00d6\u009c3\u00c4\u00d0\u00edL\u0006\u00ef\u0082\u0010\u00fc|a\u00a3A@~u\u0081\r\u00ff\u009f0\u00cf\u00bas\u0010\u00bd_\u0081\u00ff\u00dc\u0087u\u00e4\u000f\u00a4\u00be\u00f8\u0004\u007f\u00eb\u00b5";
                var7_6 = "\u00be\u00fb\u0080tW y\u009f\u0091\u0001\u00ca\\\u009c! \u0089\u0010\u00bb\u009f\u009e\u009b\u00fd\u008c\u0088=\u00c8-\u0083$\bW\u00f1Y\u0010\u00f2e8\u00cd\u00eaU;k\u0002\u00bd\u00f7\u0090`\u001f\u00c5\u001f\u0010\u0093W1\u00ae\u009cS\u00a3\u008c\u0092\u00e7(u\u00a5u\u00ba\u00a9\u0010U\u00a9\u0005\u0005p!:8l\u00a1\u0007\u00b5\u00d7\u00feC\u00b1\u0010Q\u00f6\u00bf\u00e0g\u0012\u00d6\u009c3\u00c4\u00d0\u00edL\u0006\u00ef\u0082\u0010\u00fc|a\u00a3A@~u\u0081\r\u00ff\u009f0\u00cf\u00bas\u0010\u00bd_\u0081\u00ff\u00dc\u0087u\u00e4\u000f\u00a4\u00be\u00f8\u0004\u007f\u00eb\u00b5".length();
                var4_7 = 16;
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
                    var8_3[var6_4++] = g7u$qmc.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00b7\u00d1\u0092\u00cc\u00eb\u00ad\u00ad(\u00dfz\u00bb#B\u00dd\u009c\u00d0\u0010\n\u00e4q\u00e5\u0092\u00ccjzg9\u0005\n\u00ce\u00ecR\u00d5";
                    var7_6 = "\u00b7\u00d1\u0092\u00cc\u00eb\u00ad\u00ad(\u00dfz\u00bb#B\u00dd\u009c\u00d0\u0010\n\u00e4q\u00e5\u0092\u00ccjzg9\u0005\n\u00ce\u00ecR\u00d5".length();
                    var4_7 = 16;
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
                    var8_3[var6_4++] = g7u$qmc.a(var9_9).intern();
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
        g7u$qmc.rn9 = new g7u$qmc(var0_10[0], 0, var0_10[7]);
        g7u$qmc.qxj = new g7u$qmc(var0_10[2], 1, var0_10[9]);
        g7u$qmc.ryv = new g7u$qmc(var0_10[8], 2, var0_10[4]);
        g7u$qmc.pfi = new g7u$qmc(var0_10[5], 3, var0_10[6]);
        g7u$qmc.xd3 = new g7u$qmc(var0_10[1], 4, var0_10[3]);
        g7u$qmc.lkz = new g7u$qmc[]{g7u$qmc.rn9, g7u$qmc.qxj, g7u$qmc.ryv, g7u$qmc.pfi, g7u$qmc.xd3};
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

