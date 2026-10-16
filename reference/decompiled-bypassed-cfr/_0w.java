/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _0w
extends so9 {
    private static final /* synthetic */ gdz avm;
    private static final /* synthetic */ gdz fwf;
    private static final /* synthetic */ gdz o0z;

    public _0w(hr_ hr_2, g6r g6r2, float f) {
        super(hr_2, g6r2, f);
        this.d4f(new bpv(this));
    }

    public float ljg(gse gse2, float f) {
        return gse2.qbh();
    }

    public void i3i(gse gse2, double d, double d2, double d3, float f, float f2) {
        block5: {
            gse gse3;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        gse3 = gse2;
                        if (n == 0) break block4;
                        if (!gse3.n8j()) break block5;
                    }
                    catch (oov oov2) {
                        throw _0w.a(oov2);
                    }
                    gse3 = gse2;
                }
                catch (oov oov3) {
                    throw _0w.a(oov3);
                }
            }
            float f3 = gse3.xeu(f2) * gse2.rnc(f2);
            hzu.oxa(f3, f3, f3);
        }
        super.w_x(gse2, d, d2, d3, f, f2);
    }

    public gdz uuq(gse gse2) {
        gdz gdz2;
        block8: {
            boolean bl;
            block6: {
                block7: {
                    int n = t9d.c();
                    try {
                        try {
                            bl = gse2.j1j();
                            if (n != 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (oov oov2) {
                            throw _0w.a(oov2);
                        }
                        gdz2 = fwf;
                        break block8;
                    }
                    catch (oov oov3) {
                        throw _0w.a(oov3);
                    }
                }
                bl = gse2.iki();
            }
            try {
                gdz2 = bl ? o0z : avm;
            }
            catch (oov oov4) {
                throw _0w.a(oov4);
            }
        }
        return gdz2;
    }

    @Override
    public void w_x(yqv yqv2, double d, double d2, double d3, float f, float f2) {
        this.i3i((gse)yqv2, d, d2, d3, f, f2);
    }

    @Override
    public float xwp(g_3 g_32, float f) {
        return this.ljg((gse)g_32, f);
    }

    @Override
    public void l1o(g_3 g_32, double d, double d2, double d3, float f, float f2) {
        this.i3i((gse)g_32, d, d2, d3, f, f2);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.uuq((gse)i2h2);
    }

    @Override
    public void apl(i2h i2h2, double d, double d2, double d3, float f, float f2) {
        this.i3i((gse)i2h2, d, d2, d3, f, f2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(1803998316088600710L, -3903479901558287818L, MethodHandles.lookup().lookupClass()).a(265776470443822L) ^ 0x13125916F2E5L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "3KZL\u0093\u00ec\u008b\u00ae\u00ec\u0096+\u0089f\r\u00cd.\u008d|_0\u0090\u00b3\u001db\u0003K\u00e4\u00de\u0007c\u001fo\u00d7\u00fa\u00cds\u008eo\u008d\u009f 3KZL\u0093\u00ec\u008b\u00ae\u00ec\u0096+\u0089f\r\u00cd.\u008d|_0\u0090\u00b3\u001db\u0093\u000e\u0015\u001f\u0011Rm0(3KZL\u0093\u00ec\u008b\u00ae\u00ec\u0096+\u0089f\r\u00cd.\u008d|_0\u0090\u00b3\u001db\u000f\u008c\u00d3|\u0092\u00a6\u00b0?\u00b2+\u00c8g\f\u00d5E\u00d7";
        int n2 = "3KZL\u0093\u00ec\u008b\u00ae\u00ec\u0096+\u0089f\r\u00cd.\u008d|_0\u0090\u00b3\u001db\u0003K\u00e4\u00de\u0007c\u001fo\u00d7\u00fa\u00cds\u008eo\u008d\u009f 3KZL\u0093\u00ec\u008b\u00ae\u00ec\u0096+\u0089f\r\u00cd.\u008d|_0\u0090\u00b3\u001db\u0093\u000e\u0015\u001f\u0011Rm0(3KZL\u0093\u00ec\u008b\u00ae\u00ec\u0096+\u0089f\r\u00cd.\u008d|_0\u0090\u00b3\u001db\u000f\u008c\u00d3|\u0092\u00a6\u00b0?\u00b2+\u00c8g\f\u00d5E\u00d7".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _0w.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                avm = new gdz(stringArray2[1]);
                fwf = new gdz(stringArray2[2]);
                o0z = new gdz(stringArray2[0]);
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

