/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class ell$bu8
extends Enum
implements v4k {
    public static final ell$bu8 f9s;
    public static final ell$bu8 m2p;
    private final String crr;
    private static final ell$bu8[] qz8;

    public static ell$bu8[] values() {
        return (ell$bu8[])qz8.clone();
    }

    public static ell$bu8 valueOf(String string) {
        return Enum.valueOf(ell$bu8.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ell$bu8() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.crr = var3_1;
    }

    public String toString() {
        return this.crr;
    }

    @Override
    public String mo3() {
        return this.crr;
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

                var10 = c.a(-4771412904811684146L, 3620197880272687670L, MethodHandles.lookup().lookupClass()).a(47351080869153L) ^ 45405185944418L;
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
                var5_5 = "\u00b9R\u00e4\u0090|\u00c6\u00e7\u008a\b'\u0093h\u00a0\u008f\u00b4\u00f7\u000b";
                var7_6 = "\u00b9R\u00e4\u0090|\u00c6\u00e7\u008a\b'\u0093h\u00a0\u008f\u00b4\u00f7\u000b".length();
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
                    var8_3[var6_4++] = ell$bu8.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "7\u0016C\u0017\u0006\u0094\u0083\u0005\b\u00c8L\b\u0000=\u00cb\u00ebN";
                    var7_6 = "7\u0016C\u0017\u0006\u0094\u0083\u0005\b\u00c8L\b\u0000=\u00cb\u00ebN".length();
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
                    var8_3[var6_4++] = ell$bu8.a(var9_9).intern();
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
        ell$bu8.f9s = new ell$bu8(var0_10[0], 0, var0_10[2]);
        ell$bu8.m2p = new ell$bu8(var0_10[3], 1, var0_10[1]);
        ell$bu8.qz8 = new ell$bu8[]{ell$bu8.f9s, ell$bu8.m2p};
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

