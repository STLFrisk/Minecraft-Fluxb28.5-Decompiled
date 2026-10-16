/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class ce2
extends Enum {
    public static final ce2 rrm;
    public static final ce2 b46;
    public static final ce2 wtv;
    public static final ce2 b7w;
    public static final ce2 rie;
    private static final /* synthetic */ ce2[] mqu;

    public static ce2[] values() {
        return (ce2[])mqu.clone();
    }

    public static ce2 valueOf(String string) {
        return Enum.valueOf(ce2.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ ce2() {
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

                var10 = c.a(9034270312283221375L, 4442148359629898661L, MethodHandles.lookup().lookupClass()).a(54845729740025L) ^ 18889059411582L;
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
                var8_3 = new String[5];
                var6_4 = 0;
                var5_5 = "\u00be9\u001a\u0002\u00cf\u00c5\u00ec\u0090\b\u00d5!\u0096}\u00ae=\u0086\u00de\b\u000f\u00d78c\u00bd@:\u00f9";
                var7_6 = "\u00be9\u001a\u0002\u00cf\u00c5\u00ec\u0090\b\u00d5!\u0096}\u00ae=\u0086\u00de\b\u000f\u00d78c\u00bd@:\u00f9".length();
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
                    var8_3[var6_4++] = ce2.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00ecB\u00f2QfB\u00c8h\b\u00db\u00c2SDV4\u0086\u0088";
                    var7_6 = "\u00ecB\u00f2QfB\u00c8h\b\u00db\u00c2SDV4\u0086\u0088".length();
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
                    var8_3[var6_4++] = ce2.a(var9_9).intern();
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
        ce2.rrm = new ce2(var0_10[4], 0);
        ce2.b46 = new ce2(var0_10[0], 1);
        ce2.wtv = new ce2(var0_10[2], 2);
        ce2.b7w = new ce2(var0_10[3], 3);
        ce2.rie = new ce2(var0_10[1], 4);
        ce2.mqu = new ce2[]{ce2.rrm, ce2.b46, ce2.wtv, ce2.b7w, ce2.rie};
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

