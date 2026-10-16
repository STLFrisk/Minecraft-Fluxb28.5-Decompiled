/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class _8w$mc6
extends Enum
implements v4k {
    public static final _8w$mc6 ang;
    public static final _8w$mc6 jen;
    private final String w8n;
    private static final _8w$mc6[] lub;

    public static _8w$mc6[] values() {
        return (_8w$mc6[])lub.clone();
    }

    public static _8w$mc6 valueOf(String string) {
        return Enum.valueOf(_8w$mc6.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _8w$mc6() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.w8n = var3_1;
    }

    public String toString() {
        return this.w8n;
    }

    @Override
    public String mo3() {
        return this.w8n;
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

                var10 = c.a(3051672029016653571L, 7187819202950748958L, MethodHandles.lookup().lookupClass()).a(130019432744312L) ^ 122379484813113L;
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
                var5_5 = "g1\u00e2d\u00d8m\u00cc@\b\b\u007f\u001d\u00cb'\u00ef\u00a9\u00c3";
                var7_6 = "g1\u00e2d\u00d8m\u00cc@\b\b\u007f\u001d\u00cb'\u00ef\u00a9\u00c3".length();
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
                    var8_3[var6_4++] = _8w$mc6.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00ee\u00b2\u00b6&\u00f4\u00cd\u00ee\u0083\b\u00b6_L\u001au\u00f6\u00cdC";
                    var7_6 = "\u00ee\u00b2\u00b6&\u00f4\u00cd\u00ee\u0083\b\u00b6_L\u001au\u00f6\u00cdC".length();
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
                    var8_3[var6_4++] = _8w$mc6.a(var9_9).intern();
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
        _8w$mc6.ang = new _8w$mc6(var0_10[1], 0, var0_10[2]);
        _8w$mc6.jen = new _8w$mc6(var0_10[3], 1, var0_10[0]);
        _8w$mc6.lub = new _8w$mc6[]{_8w$mc6.ang, _8w$mc6.jen};
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

