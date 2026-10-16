/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class g7u$lrl
extends Enum
implements v4k {
    public static final g7u$lrl vvx;
    public static final g7u$lrl ow0;
    private final String yit;
    private static final g7u$lrl[] th8;

    public static g7u$lrl[] values() {
        return (g7u$lrl[])th8.clone();
    }

    public static g7u$lrl valueOf(String string) {
        return Enum.valueOf(g7u$lrl.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g7u$lrl() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.yit = var3_1;
    }

    public String toString() {
        return this.yit;
    }

    @Override
    public String mo3() {
        return this.yit;
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

                var10 = c.a(8494262053248804605L, 2813889340986690343L, MethodHandles.lookup().lookupClass()).a(129906566627065L) ^ 89864679767984L;
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
                var5_5 = "\u00c9\u00ad\u00c5_$\u00cf\u00c2\u0092\b\u00a2z\u00b9.S\u00dal\u0018";
                var7_6 = "\u00c9\u00ad\u00c5_$\u00cf\u00c2\u0092\b\u00a2z\u00b9.S\u00dal\u0018".length();
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
                    var8_3[var6_4++] = g7u$lrl.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00a3\u00a9v\u00e4\u0080\u00a1p\u00e0\b\u00834T4\u008c2`\u00fd";
                    var7_6 = "\u00a3\u00a9v\u00e4\u0080\u00a1p\u00e0\b\u00834T4\u008c2`\u00fd".length();
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
                    var8_3[var6_4++] = g7u$lrl.a(var9_9).intern();
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
        g7u$lrl.vvx = new g7u$lrl(var0_10[1], 0, var0_10[3]);
        g7u$lrl.ow0 = new g7u$lrl(var0_10[0], 1, var0_10[2]);
        g7u$lrl.th8 = new g7u$lrl[]{g7u$lrl.vvx, g7u$lrl.ow0};
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

