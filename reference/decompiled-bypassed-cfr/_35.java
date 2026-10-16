/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _35
extends so9 {
    private static final /* synthetic */ gdz csz;
    private static final /* synthetic */ gdz ls0;

    public _35(hr_ hr_2) {
        super(hr_2, new rno(0.0f), 1.0f);
        this.d4f(new cu5(this));
    }

    public void gdz(ju8 ju82, double d, double d2, double d3, float f, float f2) {
        pq9.ojo(ju82, true);
        super.w_x(ju82, d, d2, d3, f, f2);
    }

    /*
     * Unable to fully structure code
     */
    public gdz vz_(ju8 var1_1) {
        block12: {
            block10: {
                block11: {
                    block9: {
                        var2_2 = t9d.c();
                        var3_3 = var1_1.vhe();
                        try {
                            v0 = var3_3;
                            if (var2_2 != 0) break block9;
                            if (v0 <= 0) break block10;
                        }
                        catch (oov v1) {
                            throw _35.a(v1);
                        }
                        v0 = var3_3;
                    }
                    try {
                        try {
                            v2 = 80;
                            if (var2_2 != 0) break block11;
                            if (v0 <= v2) {
                            }
                            ** GOTO lbl29
                        }
                        catch (oov v3) {
                            throw _35.a(v3);
                        }
                        v0 = var3_3 / 5 % 2;
                        v2 = 1;
                    }
                    catch (oov v4) {
                        throw _35.a(v4);
                    }
                }
                try {
                    if (v0 == v2) break block10;
lbl29:
                    // 2 sources

                    v5 = _35.csz;
                    break block12;
                }
                catch (oov v6) {
                    throw _35.a(v6);
                }
            }
            v5 = _35.ls0;
        }
        return v5;
    }

    public void t8z(ju8 ju82, float f) {
        block2: {
            float f2;
            block3: {
                int n = t9d.c();
                f2 = 2.0f;
                int n2 = ju82.vhe();
                try {
                    if (n != 0) break block2;
                    if (n2 <= 0) break block3;
                }
                catch (oov oov2) {
                    throw _35.a(oov2);
                }
                f2 -= ((float)n2 - f) / 220.0f * 0.5f;
            }
            hzu.syc(f2, f2, f2);
        }
    }

    @Override
    public void w_x(yqv yqv2, double d, double d2, double d3, float f, float f2) {
        this.gdz((ju8)yqv2, d, d2, d3, f, f2);
    }

    @Override
    public void e2w(g_3 g_32, float f) {
        this.t8z((ju8)g_32, f);
    }

    @Override
    public void l1o(g_3 g_32, double d, double d2, double d3, float f, float f2) {
        this.gdz((ju8)g_32, d, d2, d3, f, f2);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.vz_((ju8)i2h2);
    }

    @Override
    public void apl(i2h i2h2, double d, double d2, double d3, float f, float f2) {
        this.gdz((ju8)i2h2, d, d2, d3, f, f2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-1723577057865921290L, -620217865055267779L, MethodHandles.lookup().lookupClass()).a(196415347790643L) ^ 0x1067605AE74FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u009d}0\u00d2y\u00d0\f\u00f2\u0007\u00f1\u0006\u0094v\u0002\u0006K{\u00e9\b\u0086\u0086\u00c0\u0087\u008es]\u0019\u0019M(\u00f5\u0080\u00ba\u00e4\u00e8\u00b6\u00e7Q[\u00180\u009d}0\u00d2y\u00d0\f\u00f2\u0007\u00f1\u0006\u0094v\u0002\u0006K{\u00e9\b\u0086\u0086\u00c0\u0087\u008e\u00e8\u00f9\u00dc\u00adS\u00c5B\u007fe\u00f2\u000ei\u00a8\f\f\u00ba\u00b9I\u00dd\u0006\u00dc\u00b4<l";
        int n2 = "\u009d}0\u00d2y\u00d0\f\u00f2\u0007\u00f1\u0006\u0094v\u0002\u0006K{\u00e9\b\u0086\u0086\u00c0\u0087\u008es]\u0019\u0019M(\u00f5\u0080\u00ba\u00e4\u00e8\u00b6\u00e7Q[\u00180\u009d}0\u00d2y\u00d0\f\u00f2\u0007\u00f1\u0006\u0094v\u0002\u0006K{\u00e9\b\u0086\u0086\u00c0\u0087\u008e\u00e8\u00f9\u00dc\u00adS\u00c5B\u007fe\u00f2\u000ei\u00a8\f\f\u00ba\u00b9I\u00dd\u0006\u00dc\u00b4<l".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _35.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                csz = new gdz(stringArray2[1]);
                ls0 = new gdz(stringArray2[0]);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String c(byte[] byArray) {
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

