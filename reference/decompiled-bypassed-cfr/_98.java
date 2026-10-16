/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.opengl.GL11;

public class _98
extends so9 {
    private static final /* synthetic */ gdz ok0;
    private static final /* synthetic */ gdz fg4;
    private static final /* synthetic */ gdz gzp;
    public int txl;

    public _98(hr_ hr_2) {
        super(hr_2, new nie(), 0.5f);
        this.txl = ((nie)this.m5v).w9t();
    }

    public boolean rs2(c9p c9p2, _aq _aq2, double d, double d2, double d3) {
        boolean bl;
        block13: {
            block14: {
                int n;
                block11: {
                    block12: {
                        n = t9d.b();
                        try {
                            try {
                                bl = super.u8l(c9p2, _aq2, d, d2, d3);
                                if (n == 0) break block11;
                                if (!bl) break block12;
                            }
                            catch (oov oov2) {
                                throw _98.a(oov2);
                            }
                            return true;
                        }
                        catch (oov oov3) {
                            throw _98.a(oov3);
                        }
                    }
                    bl = c9p2._sb();
                }
                try {
                    if (n == 0) break block13;
                    if (!bl) break block14;
                }
                catch (oov oov4) {
                    throw _98.a(oov4);
                }
                g_3 g_32 = c9p2.e6m();
                if (g_32 != null) {
                    fqr fqr2 = this.v_e(g_32, (double)g_32.ikl * 0.5, 1.0f);
                    fqr fqr3 = this.v_e(c9p2, c9p2.c5y(), 1.0f);
                    try {
                        try {
                            bl = _aq2.n2v(nh4.kje(fqr3.lvi, fqr3.gn5, fqr3.bn2, fqr2.lvi, fqr2.gn5, fqr2.bn2));
                            if (n == 0) break block13;
                            if (!bl) break block14;
                        }
                        catch (oov oov5) {
                            throw _98.a(oov5);
                        }
                        return true;
                    }
                    catch (oov oov6) {
                        throw _98.a(oov6);
                    }
                }
            }
            bl = false;
        }
        return bl;
    }

    private fqr v_e(g_3 g_32, double d, float f) {
        double d2 = g_32.ivp + (g_32.o2v - g_32.ivp) * (double)f;
        double d3 = d + g_32.c54 + (g_32.kfp - g_32.c54) * (double)f;
        double d4 = g_32.e2b + (g_32.vbd - g_32.e2b) * (double)f;
        return new fqr(d2, d3, d4);
    }

    public void knk(c9p c9p2, double d, double d2, double d3, float f, float f2) {
        _98 _982;
        int n;
        block7: {
            block8: {
                n = t9d.c();
                try {
                    try {
                        _982 = this;
                        if (n != 0) break block7;
                        if (_982.txl == ((nie)this.m5v).w9t()) break block8;
                    }
                    catch (oov oov2) {
                        throw _98.a(oov2);
                    }
                    this.m5v = new nie();
                    this.txl = ((nie)this.m5v).w9t();
                }
                catch (oov oov3) {
                    throw _98.a(oov3);
                }
            }
            _982 = this;
        }
        super.w_x(c9p2, d, d2, d3, f, f2);
        g_3 g_32 = c9p2.e6m();
        if (g_32 != null) {
            block9: {
                double d4;
                double d5;
                double d6;
                double d7;
                double d8;
                double d9;
                double d10;
                double d11;
                double d12;
                int n2;
                int n3;
                int n4;
                double d13;
                q3g q3g2;
                jom jom2;
                block10: {
                    float f3 = c9p2.z3d(f2);
                    jom2 = jom.yut();
                    q3g2 = jom2.zuq();
                    this.gu4(gzp);
                    GL11.glTexParameterf((int)3553, (int)10242, (float)10497.0f);
                    GL11.glTexParameterf((int)3553, (int)10243, (float)10497.0f);
                    hzu.fpt();
                    hzu.o1b();
                    hzu.ux6();
                    hzu.jun(true);
                    float f4 = 240.0f;
                    gis.w9e(gis.exn, f4, f4);
                    hzu.u39(770, 1, 1, 0);
                    float f5 = (float)c9p2.oay.p2b() + f2;
                    float f6 = f5 * 0.5f % 1.0f;
                    float f7 = c9p2.c5y();
                    hzu.dp2();
                    hzu.a4k((float)d, (float)d2 + f7, (float)d3);
                    fqr fqr2 = this.v_e(g_32, (double)g_32.ikl * 0.5, f2);
                    fqr fqr3 = this.v_e(c9p2, f7, f2);
                    fqr fqr4 = fqr2._kk(fqr3);
                    d13 = fqr4.vtb() + 1.0;
                    fqr4 = fqr4.kec();
                    float f8 = (float)Math.acos(fqr4.gn5);
                    float f9 = (float)Math.atan2(fqr4.bn2, fqr4.lvi);
                    hzu.a2h((1.5707964f + -f9) * 57.295776f, 0.0f, 1.0f, 0.0f);
                    hzu.a2h(f8 * 57.295776f, 1.0f, 0.0f, 0.0f);
                    boolean bl = true;
                    double d14 = (double)f5 * 0.05 * (1.0 - (double)(bl & true) * 2.5);
                    q3g2.ezr(7, gnl.rad);
                    float f10 = f3 * f3;
                    n4 = 64 + (int)(f10 * 240.0f);
                    n3 = 32 + (int)(f10 * 192.0f);
                    n2 = 128 - (int)(f10 * 64.0f);
                    double d15 = (double)bl * 0.2;
                    double d16 = d15 * 1.41;
                    d12 = 0.0 + Math.cos(d14 + 2.356194490192345) * d16;
                    d11 = 0.0 + Math.sin(d14 + 2.356194490192345) * d16;
                    d10 = 0.0 + Math.cos(d14 + 0.7853981633974483) * d16;
                    d9 = 0.0 + Math.sin(d14 + 0.7853981633974483) * d16;
                    d8 = 0.0 + Math.cos(d14 + 3.9269908169872414) * d16;
                    d7 = 0.0 + Math.sin(d14 + 3.9269908169872414) * d16;
                    d6 = 0.0 + Math.cos(d14 + 5.497787143782138) * d16;
                    d5 = 0.0 + Math.sin(d14 + 5.497787143782138) * d16;
                    double d17 = 0.0 + Math.cos(d14 + Math.PI) * d15;
                    double d18 = 0.0 + Math.sin(d14 + Math.PI) * d15;
                    double d19 = 0.0 + Math.cos(d14 + 0.0) * d15;
                    double d20 = 0.0 + Math.sin(d14 + 0.0) * d15;
                    double d21 = 0.0 + Math.cos(d14 + 1.5707963267948966) * d15;
                    double d22 = 0.0 + Math.sin(d14 + 1.5707963267948966) * d15;
                    double d23 = 0.0 + Math.cos(d14 + 4.71238898038469) * d15;
                    double d24 = 0.0 + Math.sin(d14 + 4.71238898038469) * d15;
                    double d25 = 0.0;
                    double d27 = 0.4999;
                    double d28 = -1.0f + f6;
                    double d29 = d13 * (0.5 / d15) + d28;
                    q3g2.g5o(d17, d13, d18).h0a(0.4999, d29).fje(n4, n3, n2, 255).pzw();
                    q3g2.g5o(d17, 0.0, d18).h0a(0.4999, d28).fje(n4, n3, n2, 255).pzw();
                    q3g2.g5o(d19, 0.0, d20).h0a(0.0, d28).fje(n4, n3, n2, 255).pzw();
                    q3g2.g5o(d19, d13, d20).h0a(0.0, d29).fje(n4, n3, n2, 255).pzw();
                    q3g2.g5o(d21, d13, d22).h0a(0.4999, d29).fje(n4, n3, n2, 255).pzw();
                    q3g2.g5o(d21, 0.0, d22).h0a(0.4999, d28).fje(n4, n3, n2, 255).pzw();
                    q3g2.g5o(d23, 0.0, d24).h0a(0.0, d28).fje(n4, n3, n2, 255).pzw();
                    q3g2.g5o(d23, d13, d24).h0a(0.0, d29).fje(n4, n3, n2, 255).pzw();
                    d4 = 0.0;
                    try {
                        if (n != 0) break block9;
                        if (c9p2.g25 % 2 != 0) break block10;
                    }
                    catch (oov oov4) {
                        throw _98.a(oov4);
                    }
                    d4 = 0.5;
                }
                q3g2.g5o(d12, d13, d11).h0a(0.5, d4 + 0.5).fje(n4, n3, n2, 255).pzw();
                q3g2.g5o(d10, d13, d9).h0a(1.0, d4 + 0.5).fje(n4, n3, n2, 255).pzw();
                q3g2.g5o(d6, d13, d5).h0a(1.0, d4).fje(n4, n3, n2, 255).pzw();
                q3g2.g5o(d8, d13, d7).h0a(0.5, d4).fje(n4, n3, n2, 255).pzw();
                jom2.q7g();
            }
            hzu.x3w();
        }
    }

    public void nsy(c9p c9p2, float f) {
        try {
            if (c9p2.mzk()) {
                hzu.syc(2.35f, 2.35f, 2.35f);
            }
        }
        catch (oov oov2) {
            throw _98.a(oov2);
        }
    }

    public gdz kx1(c9p c9p2) {
        gdz gdz2;
        try {
            gdz2 = c9p2.mzk() ? fg4 : ok0;
        }
        catch (oov oov2) {
            throw _98.a(oov2);
        }
        return gdz2;
    }

    @Override
    public void w_x(yqv yqv2, double d, double d2, double d3, float f, float f2) {
        this.knk((c9p)yqv2, d, d2, d3, f, f2);
    }

    @Override
    public boolean u8l(yqv yqv2, _aq _aq2, double d, double d2, double d3) {
        return this.rs2((c9p)yqv2, _aq2, d, d2, d3);
    }

    @Override
    public void e2w(g_3 g_32, float f) {
        this.nsy((c9p)g_32, f);
    }

    @Override
    public void l1o(g_3 g_32, double d, double d2, double d3, float f, float f2) {
        this.knk((c9p)g_32, d, d2, d3, f, f2);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.kx1((c9p)i2h2);
    }

    @Override
    public void apl(i2h i2h2, double d, double d2, double d3, float f, float f2) {
        this.knk((c9p)i2h2, d, d2, d3, f, f2);
    }

    @Override
    public boolean h12(i2h i2h2, _aq _aq2, double d, double d2, double d3) {
        return this.rs2((c9p)i2h2, _aq2, d, d2, d3);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-632299536491244061L, -6100859028267004329L, MethodHandles.lookup().lookupClass()).a(122699570568973L) ^ 0x1661B88BAB84L;
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
        String string = "\u00e3\u008d\u00d9\u00f1\u00de`\u00c0\u00f7\u00db\u00c7\u00baa\u00af\u000e)\u0083_\u00de\rj\u00b0\u0002\u0083\u00b8Z#\u00b3\u00d72\u00e5\u00d7VP\u00dd\u00ed\u0005]m\u00f7\u00f4 \u00e3\u008d\u00d9\u00f1\u00de`\u00c0\u00f7\u00db\u00c7\u00baa\u00af\u000e)\u0083_\u00de\rj\u00b0\u0002\u0083\u00b8\u0019\u00e8\u001d\u001c\u001a\u00d8n\u00ed(\u00e3\u008d\u00d9\u00f1\u00de`\u00c0\u00f7\u00db\u00c7\u00baa\u00af\u000e)\u0083_\u00de\rj\u00b0\u0002\u0083\u00b8\u00bd\u009b\u0098\u0006x\u00e0\u00ab\u008cW\u00a6\u0011\u0018\u00d8e\u00b1\u00b5";
        int n2 = "\u00e3\u008d\u00d9\u00f1\u00de`\u00c0\u00f7\u00db\u00c7\u00baa\u00af\u000e)\u0083_\u00de\rj\u00b0\u0002\u0083\u00b8Z#\u00b3\u00d72\u00e5\u00d7VP\u00dd\u00ed\u0005]m\u00f7\u00f4 \u00e3\u008d\u00d9\u00f1\u00de`\u00c0\u00f7\u00db\u00c7\u00baa\u00af\u000e)\u0083_\u00de\rj\u00b0\u0002\u0083\u00b8\u0019\u00e8\u001d\u001c\u001a\u00d8n\u00ed(\u00e3\u008d\u00d9\u00f1\u00de`\u00c0\u00f7\u00db\u00c7\u00baa\u00af\u000e)\u0083_\u00de\rj\u00b0\u0002\u0083\u00b8\u00bd\u009b\u0098\u0006x\u00e0\u00ab\u008cW\u00a6\u0011\u0018\u00d8e\u00b1\u00b5".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _98.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                ok0 = new gdz(stringArray2[1]);
                fg4 = new gdz(stringArray2[0]);
                gzp = new gdz(stringArray2[2]);
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

