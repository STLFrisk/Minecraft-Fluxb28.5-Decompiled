/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class f35$vyc
extends Enum
implements v4k {
    public static final f35$vyc q6a;
    public static final f35$vyc flm;
    public static final f35$vyc lwa;
    private static final f35$vyc[] bfy;
    private final int _p4;
    private final String and;
    private final String ot5;
    private static final f35$vyc[] k7u;

    public static f35$vyc[] values() {
        return (f35$vyc[])k7u.clone();
    }

    public static f35$vyc valueOf(String string) {
        return Enum.valueOf(f35$vyc.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f35$vyc(String string) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this._p4 = (int)string;
        this.and = var4_2;
        this.ot5 = var5_3;
    }

    public int zks() {
        return this._p4;
    }

    public String toString() {
        return this.and;
    }

    public static f35$vyc vmt(int n) {
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
                                    throw f35$vyc.a(oov2);
                                }
                                n2 = n;
                                if (n3 != 0) break block8;
                            }
                            catch (oov oov3) {
                                throw f35$vyc.a(oov3);
                            }
                            if (n2 < bfy.length) break block10;
                        }
                        catch (oov oov4) {
                            throw f35$vyc.a(oov4);
                        }
                    }
                    n2 = 0;
                }
                catch (oov oov5) {
                    throw f35$vyc.a(oov5);
                }
            }
            n = n2;
        }
        return bfy[n];
    }

    @Override
    public String mo3() {
        return this.and;
    }

    public String bs_() {
        return this.ot5;
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

                var10 = c.a(-591704517963701804L, 3254060541618878312L, MethodHandles.lookup().lookupClass()).a(136480518238265L) ^ 131528215314571L;
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
                var5_5 = "9X&\u00ff\u00fa.k8\u0018\u00c5A\u00c8;\u0016\u0087(s\f\u00e2\u00e5se\u0081\u00dc\u00ce\u000b\u00b0\u00b4\u00ad\u009f\u001f+\u00ee\u0010\u00c5A\u00c8;\u0016\u0087(s\u00b6\u00d7\u00a5\u00c3;|\u009a\u00d4\b\u0087;u;\u00d4\u001c9c\u0018s\u00b9\u00f2\u00cdwk\u00a4Oa\u000f\u009d\u00ea\u00996K]x+@m\u00c4\u0016\u0001>\b\u00f0\u009ft\u00bc\u00a9\u00f0\u00c4\u00c5\u0010.\u00c9\u0089\u00cfm\u001f\u00b1\u00d2\u00e6\u0087\u00ef\u00e6\u00a5\u00840I";
                var7_6 = "9X&\u00ff\u00fa.k8\u0018\u00c5A\u00c8;\u0016\u0087(s\f\u00e2\u00e5se\u0081\u00dc\u00ce\u000b\u00b0\u00b4\u00ad\u009f\u001f+\u00ee\u0010\u00c5A\u00c8;\u0016\u0087(s\u00b6\u00d7\u00a5\u00c3;|\u009a\u00d4\b\u0087;u;\u00d4\u001c9c\u0018s\u00b9\u00f2\u00cdwk\u00a4Oa\u000f\u009d\u00ea\u00996K]x+@m\u00c4\u0016\u0001>\b\u00f0\u009ft\u00bc\u00a9\u00f0\u00c4\u00c5\u0010.\u00c9\u0089\u00cfm\u001f\u00b1\u00d2\u00e6\u0087\u00ef\u00e6\u00a5\u00840I".length();
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
                    var8_3[var6_4++] = f35$vyc.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\"\u00e68>=\u0015\u0084\u00a2\u0010\u0002\u00e7X\u00be\u0089a\u00c0\u000b\u00a0\u0089\u0014\u00e5\u00cfy\u00c4z";
                    var7_6 = "\"\u00e68>=\u0015\u0084\u00a2\u0010\u0002\u00e7X\u00be\u0089a\u00c0\u000b\u00a0\u0089\u0014\u00e5\u00cfy\u00c4z".length();
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
                    var8_3[var6_4++] = f35$vyc.a(var9_9).intern();
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
        f35$vyc.q6a = new f35$vyc(var0_10[0], 0, 0, var0_10[8], var0_10[3]);
        f35$vyc.flm = new f35$vyc(var0_10[6], 1, 1, var0_10[1], var0_10[2]);
        f35$vyc.lwa = new f35$vyc(var0_10[7], 2, 2, var0_10[4], var0_10[5]);
        f35$vyc.k7u = new f35$vyc[]{f35$vyc.q6a, f35$vyc.flm, f35$vyc.lwa};
        f35$vyc.bfy = new f35$vyc[f35$vyc.values().length];
        var12_11 = f35$vyc.values();
        var13_12 = var12_11.length;
        for (var14_13 = 0; var14_13 < var13_12; ++var14_13) {
            f35$vyc.bfy[var15_14.zks()] = var15_14 = var12_11[var14_13];
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

