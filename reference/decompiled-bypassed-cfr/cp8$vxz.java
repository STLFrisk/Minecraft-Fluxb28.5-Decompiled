/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class cp8$vxz
extends Enum
implements v4k {
    public static final cp8$vxz bpt;
    public static final cp8$vxz jxy;
    public static final cp8$vxz i7j;
    private static final cp8$vxz[] e5h;
    private final int qw5;
    private final String v2d;
    private final String tth;
    private static final cp8$vxz[] ith;

    public static cp8$vxz[] values() {
        return (cp8$vxz[])ith.clone();
    }

    public static cp8$vxz valueOf(String string) {
        return Enum.valueOf(cp8$vxz.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cp8$vxz(String string) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.qw5 = (int)string;
        this.v2d = var4_2;
        this.tth = var5_3;
    }

    public int a1g() {
        return this.qw5;
    }

    public String toString() {
        return this.v2d;
    }

    public static cp8$vxz ydq(int n) {
        block10: {
            int n2;
            block8: {
                int n3 = t9d.c();
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    n2 = n;
                                    if (n3 != 0) break block8;
                                    if (n2 < 0) break block9;
                                }
                                catch (oov oov2) {
                                    throw cp8$vxz.a(oov2);
                                }
                                n2 = n;
                                if (n3 != 0) break block8;
                            }
                            catch (oov oov3) {
                                throw cp8$vxz.a(oov3);
                            }
                            if (n2 < e5h.length) break block10;
                        }
                        catch (oov oov4) {
                            throw cp8$vxz.a(oov4);
                        }
                    }
                    n2 = 0;
                }
                catch (oov oov5) {
                    throw cp8$vxz.a(oov5);
                }
            }
            n = n2;
        }
        return e5h[n];
    }

    @Override
    public String mo3() {
        return this.v2d;
    }

    public String _u_() {
        return this.tth;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block12: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                var10 = c.a(268119113421030557L, -6776665536027759074L, MethodHandles.lookup().lookupClass()).a(74393998231556L) ^ 29952659655714L;
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
                var8_3 = new String[9];
                var6_4 = 0;
                var5_5 = "\u00d9\u00a6\u0097\u00fdCm\u00bd\u00ec\u0018\u00a2\u0006\u00f7?!\u00f4]\u00f1\u00bb\u008b\u00b9\u000e\u00deF}f\u00bb\u0098jq\u00c0\u0083{\u00e4\b\u00bd\u00a2\u0018z\u0007~\u00ceq\b;\u00ec\bm\u0099`\t\u000e\u0018-\u00db|M\u0003\u00c4\u00b0\u0085\u001b\u00ab\u00dcG\u0006\u00f6\u00d9\u001a\u00edO\u0087\u00bd\u00df\u00a1\u0092\u00c1\u0010\u00a5\u00cf-6\u00b0\u00de:\u00e8\u00edU\u00d2\u008e\u00ff\u009c\u00179\u0010-\u00db|M\u0003\u00c4\u00b0\u0085\u00d2|D\u00c1\u00d0JOs";
                var7_6 = "\u00d9\u00a6\u0097\u00fdCm\u00bd\u00ec\u0018\u00a2\u0006\u00f7?!\u00f4]\u00f1\u00bb\u008b\u00b9\u000e\u00deF}f\u00bb\u0098jq\u00c0\u0083{\u00e4\b\u00bd\u00a2\u0018z\u0007~\u00ceq\b;\u00ec\bm\u0099`\t\u000e\u0018-\u00db|M\u0003\u00c4\u00b0\u0085\u001b\u00ab\u00dcG\u0006\u00f6\u00d9\u001a\u00edO\u0087\u00bd\u00df\u00a1\u0092\u00c1\u0010\u00a5\u00cf-6\u00b0\u00de:\u00e8\u00edU\u00d2\u008e\u00ff\u009c\u00179\u0010-\u00db|M\u0003\u00c4\u00b0\u0085\u00d2|D\u00c1\u00d0JOs".length();
                var4_7 = 8;
                var3_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block12;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = cp8$vxz.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "b\u00f0*\u00c64N\u00f1q6\u0089+1\u00e2\"\u00ae\u00d3\b\u0084\u00f98P(T\u00d8\u00b0";
                    var7_6 = "b\u00f0*\u00c64N\u00f1q6\u0089+1\u00e2\"\u00ae\u00d3\b\u0084\u00f98P(T\u00d8\u00b0".length();
                    var4_7 = 16;
                    var3_8 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block12;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var8_3[var6_4++] = cp8$vxz.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block13;
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
        cp8$vxz.bpt = new cp8$vxz(var0_10[0], 0, 0, var0_10[5], var0_10[3]);
        cp8$vxz.jxy = new cp8$vxz(var0_10[7], 1, 1, var0_10[4], var0_10[6]);
        cp8$vxz.i7j = new cp8$vxz(var0_10[2], 2, 2, var0_10[1], var0_10[8]);
        cp8$vxz.ith = new cp8$vxz[]{cp8$vxz.bpt, cp8$vxz.jxy, cp8$vxz.i7j};
        cp8$vxz.e5h = new cp8$vxz[cp8$vxz.values().length];
        var12_11 = cp8$vxz.values();
        var13_12 = var12_11.length;
        for (var14_13 = 0; var14_13 < var13_12; ++var14_13) {
            cp8$vxz.e5h[var15_14.a1g()] = var15_14 = var12_11[var14_13];
        }
    }

    private static oov a(oov oov2) {
        return oov2;
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

