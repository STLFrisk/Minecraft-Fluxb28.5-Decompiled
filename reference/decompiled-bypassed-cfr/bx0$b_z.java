/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class bx0$b_z
extends Enum
implements v4k {
    public static final bx0$b_z rg3;
    public static final bx0$b_z ryg;
    public static final bx0$b_z sos;
    private static final bx0$b_z[] o3a;
    private final int qii;
    private final String i5w;
    private final String q3b;
    private final _mi ak0;
    private static final bx0$b_z[] swl;

    public static bx0$b_z[] values() {
        return (bx0$b_z[])swl.clone();
    }

    public static bx0$b_z valueOf(String string) {
        return Enum.valueOf(bx0$b_z.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bx0$b_z(_mi _mi2) {
        this((String)var1_-1, (int)var2_-1, (int)_mi2, (String)var4_2, (String)var4_2, (_mi)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bx0$b_z(String string, _mi _mi2) {
        void var6_4;
        void var5_3;
        void var2_-1;
        void var1_-1;
        this.qii = (int)string;
        this.i5w = _mi2;
        this.q3b = var5_3;
        this.ak0 = var6_4;
    }

    public int d74() {
        return this.qii;
    }

    public String w9d() {
        return this.q3b;
    }

    public _mi vf1() {
        return this.ak0;
    }

    public String toString() {
        return this.i5w;
    }

    public static bx0$b_z brn(int n) {
        block10: {
            int n2;
            block8: {
                int n3 = t9d.b();
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    n2 = n;
                                    if (n3 == 0) break block8;
                                    if (n2 < 0) break block9;
                                }
                                catch (oov oov2) {
                                    throw bx0$b_z.a(oov2);
                                }
                                n2 = n;
                                if (n3 == 0) break block8;
                            }
                            catch (oov oov3) {
                                throw bx0$b_z.a(oov3);
                            }
                            if (n2 < o3a.length) break block10;
                        }
                        catch (oov oov4) {
                            throw bx0$b_z.a(oov4);
                        }
                    }
                    n2 = 0;
                }
                catch (oov oov5) {
                    throw bx0$b_z.a(oov5);
                }
            }
            n = n2;
        }
        return o3a[n];
    }

    @Override
    public String mo3() {
        return this.i5w;
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

                var10 = c.a(976418986277356902L, 5029433798927009438L, MethodHandles.lookup().lookupClass()).a(108826239604417L) ^ 12246910488665L;
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
                var5_5 = "c\u0099\u0002\u0092`\u00eb\u001a\u00e6S\u0012\u00b7\u00c8\u0007\u00ae:\u00e1\u0010\u00bd\u001c\u00e7\u00fdP!)v\u009b\u00d3\u009b\u00b3\u00a3\u00d5\u00c6\u00f4\bg3f\u0012\u00a7\u00f1,\u0017\bQJ\u00c9\u00a9\u00bc\u0018\u00aaN\b\u00eb\u00d8'\u00e0oD\u00f1N\b\u00ae\u00cb\u0001\u000f\u00f7\u00ae\u0011\u0018";
                var7_6 = "c\u0099\u0002\u0092`\u00eb\u001a\u00e6S\u0012\u00b7\u00c8\u0007\u00ae:\u00e1\u0010\u00bd\u001c\u00e7\u00fdP!)v\u009b\u00d3\u009b\u00b3\u00a3\u00d5\u00c6\u00f4\bg3f\u0012\u00a7\u00f1,\u0017\bQJ\u00c9\u00a9\u00bc\u0018\u00aaN\b\u00eb\u00d8'\u00e0oD\u00f1N\b\u00ae\u00cb\u0001\u000f\u00f7\u00ae\u0011\u0018".length();
                var4_7 = 16;
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
                    var8_3[var6_4++] = bx0$b_z.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00f0\u009f\u0010\u0097\u00b7N\u0084\u00c9\b[\u0014]\u00b4\u009eO\u000f\u0080";
                    var7_6 = "\u00f0\u009f\u0010\u0097\u00b7N\u0084\u00c9\b[\u0014]\u00b4\u009eO\u000f\u0080".length();
                    var4_7 = 8;
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
                    var8_3[var6_4++] = bx0$b_z.a(var9_9).intern();
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
        bx0$b_z.rg3 = new bx0$b_z(var0_10[3], 0, 0, var0_10[6], var0_10[4], _mi.pzg);
        bx0$b_z.ryg = new bx0$b_z(var0_10[1], 1, 1, var0_10[0], var0_10[7], _mi.pzg);
        bx0$b_z.sos = new bx0$b_z(var0_10[2], 2, 2, var0_10[5], _mi._bd);
        bx0$b_z.swl = new bx0$b_z[]{bx0$b_z.rg3, bx0$b_z.ryg, bx0$b_z.sos};
        bx0$b_z.o3a = new bx0$b_z[bx0$b_z.values().length];
        var12_11 = bx0$b_z.values();
        var13_12 = var12_11.length;
        for (var14_13 = 0; var14_13 < var13_12; ++var14_13) {
            bx0$b_z.o3a[var15_14.d74()] = var15_14 = var12_11[var14_13];
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

