/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class fcu$k9f
extends Enum
implements v4k {
    public static final fcu$k9f ycz;
    public static final fcu$k9f u8j;
    public static final fcu$k9f o8j;
    private final String nej;
    private static final fcu$k9f[] v5_;

    public static fcu$k9f[] values() {
        return (fcu$k9f[])v5_.clone();
    }

    public static fcu$k9f valueOf(String string) {
        return Enum.valueOf(fcu$k9f.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fcu$k9f() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.nej = var3_1;
    }

    public String toString() {
        return this.mo3();
    }

    @Override
    public String mo3() {
        return this.nej;
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

                var10 = c.a(-432164395818604117L, -7889129638732984887L, MethodHandles.lookup().lookupClass()).a(153564426628081L) ^ 1531425833645L;
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
                var5_5 = "\u00dbF\u0007\u0097\u00a2\u00ec3\u0001\b\nY{\u00a6\u0089\u00f91\u00ca\b\u00c6\u00f5\u0087\u008d\\;\u00db\u00d6\bTU\u00bd\u00c2:\u0099\u00dcV";
                var7_6 = "\u00dbF\u0007\u0097\u00a2\u00ec3\u0001\b\nY{\u00a6\u0089\u00f91\u00ca\b\u00c6\u00f5\u0087\u008d\\;\u00db\u00d6\bTU\u00bd\u00c2:\u0099\u00dcV".length();
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
                    var8_3[var6_4++] = fcu$k9f.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u000fK\u0097U\u00e2\u00dc\u0088\u001f\b\u00e66i\u0000\u0080IO\u00df";
                    var7_6 = "\u000fK\u0097U\u00e2\u00dc\u0088\u001f\b\u00e66i\u0000\u0080IO\u00df".length();
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
                    var8_3[var6_4++] = fcu$k9f.a(var9_9).intern();
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
        fcu$k9f.ycz = new fcu$k9f(var0_10[4], 0, var0_10[2]);
        fcu$k9f.u8j = new fcu$k9f(var0_10[5], 1, var0_10[3]);
        fcu$k9f.o8j = new fcu$k9f(var0_10[0], 2, var0_10[1]);
        fcu$k9f.v5_ = new fcu$k9f[]{fcu$k9f.ycz, fcu$k9f.u8j, fcu$k9f.o8j};
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

