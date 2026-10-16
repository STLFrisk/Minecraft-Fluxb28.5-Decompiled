/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class ek6
extends Enum {
    public static final ek6 ywn;
    public static final ek6 gf1;
    public static final ek6 sr3;
    public static final ek6 jml;
    private final /* synthetic */ Class zgg;
    private final /* synthetic */ int k44;
    private final /* synthetic */ p3y gag;
    private final /* synthetic */ boolean tcx;
    private final /* synthetic */ boolean q1v;
    private static final /* synthetic */ ek6[] fzf;

    public static ek6[] values() {
        return (ek6[])fzf.clone();
    }

    public static ek6 valueOf(String string) {
        return Enum.valueOf(ek6.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ ek6(Class clazz2, int clazz2, p3y p3y2, boolean bl, boolean bl2) {
        void var7_5;
        void var6_4;
        void var2_-1;
        void var1_-1;
        this.zgg = p3y2;
        this.k44 = bl ? 1 : 0;
        this.gag = (p3y)bl2;
        this.tcx = var6_4;
        this.q1v = var7_5;
    }

    public Class qjr() {
        return this.zgg;
    }

    public int bm8() {
        return this.k44;
    }

    public boolean ygv() {
        return this.tcx;
    }

    public boolean ooh() {
        return this.q1v;
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

                var10 = c.a(-8026345898118778800L, -2375189816158798419L, MethodHandles.lookup().lookupClass()).a(41193547028982L) ^ 77190818985343L;
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
                var5_5 = "\u00ae\u00ae\t\u00db\u0094\t{\u00efG\u009b\u00c2\u00c2uD3\u009e\u0010\u00d3\u00ce\u00f6\u000b\u00e4\u00d4\u00b0\\\u00dbu\u0018\u00e9l\u0087\u00fdl";
                var7_6 = "\u00ae\u00ae\t\u00db\u0094\t{\u00efG\u009b\u00c2\u00c2uD3\u009e\u0010\u00d3\u00ce\u00f6\u000b\u00e4\u00d4\u00b0\\\u00dbu\u0018\u00e9l\u0087\u00fdl".length();
                var4_7 = 16;
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
                    var8_3[var6_4++] = ek6.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "s\u0011\u0084\u00ce/_\u00d7\u00e7\b\u0085j\u00b4\u00b0\u0092\u00bf\u00ed\u001c";
                    var7_6 = "s\u0011\u0084\u00ce/_\u00d7\u00e7\b\u0085j\u00b4\u00b0\u0092\u00bf\u00ed\u001c".length();
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
                    var8_3[var6_4++] = ek6.a(var9_9).intern();
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
        ek6.ywn = new ek6(var0_10[2], 0, uv0.class, 70, p3y.cei, false, false);
        ek6.gf1 = new ek6(var0_10[1], 1, j37.class, 10, p3y.cei, true, true);
        ek6.sr3 = new ek6(var0_10[3], 2, u_a.class, 15, p3y.cei, true, false);
        ek6.jml = new ek6(var0_10[0], 3, jd3.class, 5, p3y.six, true, false);
        ek6.fzf = new ek6[]{ek6.ywn, ek6.gf1, ek6.sr3, ek6.jml};
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

