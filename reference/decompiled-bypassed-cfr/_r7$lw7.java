/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class _r7$lw7
extends Enum {
    public static final _r7$lw7 hec;
    public static final _r7$lw7 a1d;
    public static final _r7$lw7 g2t;
    public static final _r7$lw7 w4b;
    private static final _r7$lw7[] l7d;

    public static _r7$lw7[] values() {
        return (_r7$lw7[])l7d.clone();
    }

    public static _r7$lw7 valueOf(String string) {
        return Enum.valueOf(_r7$lw7.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _r7$lw7() {
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

                var10 = c.a(-5704387401429521150L, -2234527591090035977L, MethodHandles.lookup().lookupClass()).a(211948201266397L) ^ 73454019220028L;
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
                var5_5 = "6\u00fd\u0094\u00b7\u00d5\\\u001f\u00b8\u0017\u00c5^M\u00b8\u00fc\u00d3q\u0010\u0018\u0094\u0085J\u0081\u00b6\u00e0\u00ac\u00ea\u0082w\u00f6\u00d4\u00d7\u00b8\u00e4";
                var7_6 = "6\u00fd\u0094\u00b7\u00d5\\\u001f\u00b8\u0017\u00c5^M\u00b8\u00fc\u00d3q\u0010\u0018\u0094\u0085J\u0081\u00b6\u00e0\u00ac\u00ea\u0082w\u00f6\u00d4\u00d7\u00b8\u00e4".length();
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
                    var8_3[var6_4++] = _r7$lw7.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u008b\u00eb\u00ecPX\u00b0\u00deN\u0003\u00ba\u001d\u001f\u0081y\u00dc\u00c3\u00106\u00fd\u0094\u00b7\u00d5\\\u001f\u00b8`(\u001f\u00a0\u0011\u001a\u00d8\u00ed";
                    var7_6 = "\u008b\u00eb\u00ecPX\u00b0\u00deN\u0003\u00ba\u001d\u001f\u0081y\u00dc\u00c3\u00106\u00fd\u0094\u00b7\u00d5\\\u001f\u00b8`(\u001f\u00a0\u0011\u001a\u00d8\u00ed".length();
                    var4_7 = 16;
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
                    var8_3[var6_4++] = _r7$lw7.a(var9_9).intern();
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
        _r7$lw7.hec = new _r7$lw7(var0_10[1], 0);
        _r7$lw7.a1d = new _r7$lw7(var0_10[0], 1);
        _r7$lw7.g2t = new _r7$lw7(var0_10[3], 2);
        _r7$lw7.w4b = new _r7$lw7(var0_10[2], 3);
        _r7$lw7.l7d = new _r7$lw7[]{_r7$lw7.hec, _r7$lw7.a1d, _r7$lw7.g2t, _r7$lw7.w4b};
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

