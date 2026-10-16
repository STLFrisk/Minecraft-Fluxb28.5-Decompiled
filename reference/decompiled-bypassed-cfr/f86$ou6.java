/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class f86$ou6
extends Enum
implements v4k {
    public static final f86$ou6 am7;
    public static final f86$ou6 g5x;
    private static final f86$ou6[] jli;
    private final int mft;
    private final String l04;
    private String g7n;
    private static final f86$ou6[] o5l;

    public static f86$ou6[] values() {
        return (f86$ou6[])o5l.clone();
    }

    public static f86$ou6 valueOf(String string) {
        return Enum.valueOf(f86$ou6.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private f86$ou6(String string) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.mft = (int)string;
        this.l04 = var4_2;
        this.g7n = var5_3;
    }

    public int irm() {
        return this.mft;
    }

    public String toString() {
        return this.l04;
    }

    public static f86$ou6 yp3(int n) {
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
                                    throw f86$ou6.a(oov2);
                                }
                                n2 = n;
                                if (n3 == 0) break block8;
                            }
                            catch (oov oov3) {
                                throw f86$ou6.a(oov3);
                            }
                            if (n2 < jli.length) break block10;
                        }
                        catch (oov oov4) {
                            throw f86$ou6.a(oov4);
                        }
                    }
                    n2 = 0;
                }
                catch (oov oov5) {
                    throw f86$ou6.a(oov5);
                }
            }
            n = n2;
        }
        return jli[n];
    }

    @Override
    public String mo3() {
        return this.l04;
    }

    public String tvf() {
        return this.g7n;
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

                var10 = c.a(5026256425146074989L, 1834183152267344562L, MethodHandles.lookup().lookupClass()).a(112651477278657L) ^ 17785589088098L;
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
                var5_5 = "\u00e9\u00f1\u00ba\u00d1<\u00b3\u00d1\u008d\b\u00b9L\u00fc\u00cb\u0010x\u008d\u0007\b{\u009a:\u00ca\u00bf\u00eb\u00d1\u00a4\u00184GD\u00e5K\u00d8u\u00ffo\u0088\u009d\u0080\u00a8C\u00f9y\u00b6:\u00bf\u007f%\u00c5\u00ea\b";
                var7_6 = "\u00e9\u00f1\u00ba\u00d1<\u00b3\u00d1\u008d\b\u00b9L\u00fc\u00cb\u0010x\u008d\u0007\b{\u009a:\u00ca\u00bf\u00eb\u00d1\u00a4\u00184GD\u00e5K\u00d8u\u00ffo\u0088\u009d\u0080\u00a8C\u00f9y\u00b6:\u00bf\u007f%\u00c5\u00ea\b".length();
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
                    var8_3[var6_4++] = f86$ou6.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00c3G\u0085\u00fd\u00fdRN\u00fa\u0010\u0084k\u00d9\u009b\u00d1ha;\u00cbV\u00bf\u00e7\u00fc\u008f\u00fd&";
                    var7_6 = "\u00c3G\u0085\u00fd\u00fdRN\u00fa\u0010\u0084k\u00d9\u009b\u00d1ha;\u00cbV\u00bf\u00e7\u00fc\u008f\u00fd&".length();
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
                    var8_3[var6_4++] = f86$ou6.a(var9_9).intern();
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
        f86$ou6.am7 = new f86$ou6(var0_10[2], 0, 0, var0_10[5], var0_10[1]);
        f86$ou6.g5x = new f86$ou6(var0_10[0], 1, 1, var0_10[3], var0_10[4]);
        f86$ou6.o5l = new f86$ou6[]{f86$ou6.am7, f86$ou6.g5x};
        f86$ou6.jli = new f86$ou6[f86$ou6.values().length];
        var12_11 = f86$ou6.values();
        var13_12 = var12_11.length;
        for (var14_13 = 0; var14_13 < var13_12; ++var14_13) {
            f86$ou6.jli[var15_14.irm()] = var15_14 = var12_11[var14_13];
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

