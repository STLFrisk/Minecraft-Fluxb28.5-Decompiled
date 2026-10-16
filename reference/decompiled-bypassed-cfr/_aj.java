/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class _aj
extends Enum {
    public static final _aj p3z;
    public static final _aj _lm;
    public static final _aj sxc;
    public static final _aj i9j;
    public static final _aj y49;
    public static final _aj twm;
    public static final _aj z3a;
    public static final _aj il8;
    public String h2b;
    private static final /* synthetic */ _aj[] f2r;

    public static _aj[] values() {
        return (_aj[])f2r.clone();
    }

    public static _aj valueOf(String string) {
        return Enum.valueOf(_aj.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private /* synthetic */ _aj(String string) {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.h2b = var3_1;
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

                var10 = c.a(-3546045187187480362L, 662270270518948406L, MethodHandles.lookup().lookupClass()).a(17671001734847L) ^ 42326941514264L;
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
                var5_5 = "\u00c6\u00123Tl\u00b9o\u00e6\b\u00aei\u00cd\u00dc\u00c5N\u0007\u00fa\btZ\u0013Tl\u00bd}I\b\u00bc\u0006\u0086Lm\u0015}L\u0010 U\u0083\u00be`\u00deT\u00e2\u008e\u0012\u0081\u00ab\u001aXl\u00fe\b\u00aa\u008b\u00a5g\u00f2\u008e_\u00c4";
                var7_6 = "\u00c6\u00123Tl\u00b9o\u00e6\b\u00aei\u00cd\u00dc\u00c5N\u0007\u00fa\btZ\u0013Tl\u00bd}I\b\u00bc\u0006\u0086Lm\u0015}L\u0010 U\u0083\u00be`\u00deT\u00e2\u008e\u0012\u0081\u00ab\u001aXl\u00fe\b\u00aa\u008b\u00a5g\u00f2\u008e_\u00c4".length();
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
                    var8_3[var6_4++] = _aj.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "!\u0089:\u0093o\u009b\u00b1\u008a\b\u0000\u00c9b\n\u0007PGJ";
                    var7_6 = "!\u0089:\u0093o\u009b\u00b1\u008a\b\u0000\u00c9b\n\u0007PGJ".length();
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
                    var8_3[var6_4++] = _aj.a(var9_9).intern();
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
        _aj.p3z = new _aj(var0_10[0], 0, "a");
        _aj._lm = new _aj(var0_10[4], 1, "b");
        _aj.sxc = new _aj(var0_10[5], 2, "c");
        _aj.i9j = new _aj(var0_10[1], 3, "d");
        _aj.y49 = new _aj(var0_10[3], 4, "e");
        _aj.twm = new _aj(var0_10[7], 5, "f");
        _aj.z3a = new _aj(var0_10[2], 6, "g");
        _aj.il8 = new _aj(var0_10[6], 7, "m");
        _aj.f2r = new _aj[]{_aj.p3z, _aj._lm, _aj.sxc, _aj.i9j, _aj.y49, _aj.twm, _aj.z3a, _aj.il8};
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

