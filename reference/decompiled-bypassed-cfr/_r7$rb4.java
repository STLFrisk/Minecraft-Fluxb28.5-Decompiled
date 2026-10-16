/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class _r7$rb4
extends Enum {
    public static final _r7$rb4 e2e;
    public static final _r7$rb4 vyb;
    public static final _r7$rb4 k3_;
    public static final _r7$rb4 ii5;
    public static final _r7$rb4 p3k;
    private static final _r7$rb4[] p24;

    public static _r7$rb4[] values() {
        return (_r7$rb4[])p24.clone();
    }

    public static _r7$rb4 valueOf(String string) {
        return Enum.valueOf(_r7$rb4.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _r7$rb4() {
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

                var10 = c.a(1020552610326307279L, -2662465753335271369L, MethodHandles.lookup().lookupClass()).a(34566532564115L) ^ 43084246181877L;
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
                var8_3 = new String[5];
                var6_4 = 0;
                var5_5 = ">\u009b\u009e\u0018\u00d0\u0094s\u00c7\u00ad`~\u00f8?E\u008e@\u00103Y\u00f3\u0099!Z\t\u0017EdQ\u00ac(u\u0019\u00b9\u0010\u00af\u00eaP\u0096\u007f\u0015w\u0088u\u00c5\u00a2\u00e8\u00cf\u008f\u000e\u00e9";
                var7_6 = ">\u009b\u009e\u0018\u00d0\u0094s\u00c7\u00ad`~\u00f8?E\u008e@\u00103Y\u00f3\u0099!Z\t\u0017EdQ\u00ac(u\u0019\u00b9\u0010\u00af\u00eaP\u0096\u007f\u0015w\u0088u\u00c5\u00a2\u00e8\u00cf\u008f\u000e\u00e9".length();
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
                    var8_3[var6_4++] = _r7$rb4.a(var9_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0016P-\u00bd\u00af\u0082\u0013=\u00103Y\u00f3\u0099!Z\t\u0017\u0097i\u008d\u000f1v\u0080X";
                    var7_6 = "\u0016P-\u00bd\u00af\u0082\u0013=\u00103Y\u00f3\u0099!Z\t\u0017\u0097i\u008d\u000f1v\u0080X".length();
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
                    var8_3[var6_4++] = _r7$rb4.a(var9_9).intern();
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
        _r7$rb4.e2e = new _r7$rb4(var0_10[3], 0);
        _r7$rb4.vyb = new _r7$rb4(var0_10[2], 1);
        _r7$rb4.k3_ = new _r7$rb4(var0_10[0], 2);
        _r7$rb4.ii5 = new _r7$rb4(var0_10[1], 3);
        _r7$rb4.p3k = new _r7$rb4(var0_10[4], 4);
        _r7$rb4.p24 = new _r7$rb4[]{_r7$rb4.e2e, _r7$rb4.vyb, _r7$rb4.k3_, _r7$rb4.ii5, _r7$rb4.p3k};
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

