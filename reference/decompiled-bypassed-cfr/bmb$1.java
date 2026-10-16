/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bmb$1
implements e7r {
    public final i2h qjs;
    public final e7r a63;
    public final mew mje;
    public final double s1d;
    public final double r6l;
    public final double uyd;
    public final bmb ign;
    private static final long a = c.a(3842385926211280596L, -6830807711198574974L, MethodHandles.lookup().lookupClass()).a(250284456782047L);
    private static final String b;

    public bmb$1(bmb bmb2, i2h i2h2, e7r e7r2, mew mew2, double d, double d2, double d3) {
        this.ign = bmb2;
        this.qjs = i2h2;
        this.a63 = e7r2;
        this.mje = mew2;
        this.s1d = d;
        this.r6l = d2;
        this.uyd = d3;
    }

    @Override
    public String noc() {
        return this.qjs.noc();
    }

    @Override
    public ekw xyw() {
        return this.qjs.xyw();
    }

    @Override
    public void a0d(ekw ekw2) {
        this.a63.a0d(ekw2);
    }

    @Override
    public boolean ge4(int n, String string) {
        return this.a63.ge4(n, string);
    }

    @Override
    public mew d3d() {
        return this.mje;
    }

    @Override
    public fqr i15() {
        return new fqr(this.s1d, this.r6l, this.uyd);
    }

    @Override
    public t9d qha() {
        return this.qjs.oay;
    }

    @Override
    public i2h zyd() {
        return this.qjs;
    }

    @Override
    public boolean ofq() {
        boolean bl;
        block6: {
            block7: {
                block5: {
                    vr1 vr12;
                    int n;
                    block4: {
                        long l = a ^ 0x2F9427293B88L;
                        n = t9d.c();
                        vr1 vr13 = vr1._0v();
                        try {
                            vr12 = vr13;
                            if (n != 0) break block4;
                            if (vr12 == null) break block5;
                        }
                        catch (oov oov2) {
                            throw bmb$1.a(oov2);
                        }
                        vr12 = vr13;
                    }
                    try {
                        bl = vr12.p_y[0].eir()._s0(b);
                        if (n != 0) break block6;
                        if (!bl) break block7;
                    }
                    catch (oov oov3) {
                        throw bmb$1.a(oov3);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void io9(n_k.pbp pbp2, int n) {
        this.qjs.io9(pbp2, n);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x142A20B4C145L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00e0\u00a5*V\u008f\u00c7_zOx\u00c6\u00ae)UPT1\b\u00bc?\u00b4\u009b\u00d4K".getBytes("ISO-8859-1"));
                b = bmb$1.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
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

