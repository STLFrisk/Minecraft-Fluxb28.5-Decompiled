/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class b64
extends Enum {
    public static final b64 fd0;
    public static final b64 m67;
    public static final b64 t6i;
    public static final b64 sfj;
    public final syo j0k;
    public final String agi;
    private static final /* synthetic */ b64[] tsl;

    public static b64[] values() {
        return (b64[])tsl.clone();
    }

    public static b64 valueOf(String string) {
        return Enum.valueOf(b64.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ b64(syo syo22, String syo22) {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.j0k = var3_1;
        this.agi = var4_2;
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

                var10 = c.a(614122866999991032L, 5083902369615837114L, MethodHandles.lookup().lookupClass()).a(249589902327067L) ^ 39218466808421L;
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
                var8_3 = new String[8];
                var6_4 = 0;
                var5_5 = "\u00c8l\u00ab\u00fdo\u00feu\u00f0\bY\u00cbA\u0096\u000e\u00c1\u00b2\\\u0010qe8E\u000b\u00c9\u001aU?n\"\u00bffr<\u0094\u00103)\u009d\u00ba\u00bd\u00a7\u009e\"\u00a1C\u0004Rn.\u0017l\b\u0088\u00af}\u0012\u00e0\u00b7|\u00cf\b\u0083\u00fa\u00f3-\u00b4\u000b\u0095j";
                var7_6 = "\u00c8l\u00ab\u00fdo\u00feu\u00f0\bY\u00cbA\u0096\u000e\u00c1\u00b2\\\u0010qe8E\u000b\u00c9\u001aU?n\"\u00bffr<\u0094\u00103)\u009d\u00ba\u00bd\u00a7\u009e\"\u00a1C\u0004Rn.\u0017l\b\u0088\u00af}\u0012\u00e0\u00b7|\u00cf\b\u0083\u00fa\u00f3-\u00b4\u000b\u0095j".length();
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
                    var8_3[var6_4++] = b64.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0082t\u00c4+\u007f\u00dcd\u0091\b\u00f26 n\u00138\"\u0000";
                    var7_6 = "\u0082t\u00c4+\u007f\u00dcd\u0091\b\u00f26 n\u00138\"\u0000".length();
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
                    var8_3[var6_4++] = b64.a(var9_9).intern();
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
        b64.fd0 = new b64(var0_10[4], 0, syo.rl1, var0_10[6]);
        b64.m67 = new b64(var0_10[3], 1, syo.iyk, var0_10[2]);
        b64.t6i = new b64(var0_10[5], 2, syo.c8f, var0_10[0]);
        b64.sfj = new b64(var0_10[1], 3, syo.niw, var0_10[7]);
        b64.tsl = new b64[]{b64.fd0, b64.m67, b64.t6i, b64.sfj};
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

