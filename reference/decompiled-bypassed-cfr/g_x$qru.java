/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class g_x$qru
extends Enum {
    public static final g_x$qru rda;
    public static final g_x$qru vb5;
    public static final g_x$qru p3a;
    public static final g_x$qru u38;
    public static final g_x$qru kp4;
    public static final g_x$qru axr;
    private final int p5m;
    private final int omx;
    private final int e_f;
    private final int usc;
    private static final g_x$qru[] y73;
    private static final g_x$qru[] q_2;

    public static g_x$qru[] values() {
        return (g_x$qru[])q_2.clone();
    }

    public static g_x$qru valueOf(String string) {
        return Enum.valueOf(g_x$qru.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private g_x$qru(int n3, int n4) {
        void var6_4;
        void var5_3;
        void var2_-1;
        void var1_-1;
        this.p5m = n3;
        this.omx = n4;
        this.e_f = var5_3;
        this.usc = var6_4;
    }

    public static g_x$qru a6n(vt2 vt22) {
        return y73[vt22.c3s()];
    }

    public static int z_i(g_x$qru g_x$qru) {
        return g_x$qru.p5m;
    }

    public static int _0c(g_x$qru g_x$qru) {
        return g_x$qru.omx;
    }

    public static int ojw(g_x$qru g_x$qru) {
        return g_x$qru.e_f;
    }

    public static int jim(g_x$qru g_x$qru) {
        return g_x$qru.usc;
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

                var10 = c.a(-1345243562394632968L, 6386277312951222407L, MethodHandles.lookup().lookupClass()).a(129025894145380L) ^ 21915051635028L;
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
                var5_5 = "$W^\u00f2_\u0089\u00dd\u00b9\b\u009aR\u00df\u00d8\u00ef\u00c6l\u00e9\bu1'Qd\u00bd\u000e\u00e3\b\\\u00a3d\u00b4\u008d\u0082\u0013F";
                var7_6 = "$W^\u00f2_\u0089\u00dd\u00b9\b\u009aR\u00df\u00d8\u00ef\u00c6l\u00e9\bu1'Qd\u00bd\u000e\u00e3\b\\\u00a3d\u00b4\u008d\u0082\u0013F".length();
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
                    var8_3[var6_4++] = g_x$qru.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u000f\u00ecQ\u00cdr\u0081\u0083S\bA\u0081\u00ca\u0083\u0000y!^";
                    var7_6 = "\u000f\u00ecQ\u00cdr\u0081\u0083S\bA\u0081\u00ca\u0083\u0000y!^".length();
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
                    var8_3[var6_4++] = g_x$qru.a(var9_9).intern();
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
        g_x$qru.rda = new g_x$qru(var0_10[0], 0, 0, 1, 2, 3);
        g_x$qru.vb5 = new g_x$qru(var0_10[1], 1, 2, 3, 0, 1);
        g_x$qru.p3a = new g_x$qru(var0_10[4], 2, 3, 0, 1, 2);
        g_x$qru.u38 = new g_x$qru(var0_10[2], 3, 0, 1, 2, 3);
        g_x$qru.kp4 = new g_x$qru(var0_10[5], 4, 3, 0, 1, 2);
        g_x$qru.axr = new g_x$qru(var0_10[3], 5, 1, 2, 3, 0);
        g_x$qru.q_2 = new g_x$qru[]{g_x$qru.rda, g_x$qru.vb5, g_x$qru.p3a, g_x$qru.u38, g_x$qru.kp4, g_x$qru.axr};
        g_x$qru.y73 = new g_x$qru[6];
        g_x$qru.y73[vt2.m3r.c3s()] = g_x$qru.rda;
        g_x$qru.y73[vt2.rf3.c3s()] = g_x$qru.vb5;
        g_x$qru.y73[vt2.z9q.c3s()] = g_x$qru.p3a;
        g_x$qru.y73[vt2.mxp.c3s()] = g_x$qru.u38;
        g_x$qru.y73[vt2.te4.c3s()] = g_x$qru.kp4;
        g_x$qru.y73[vt2.zk4.c3s()] = g_x$qru.axr;
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

