/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dnm
extends so9 {
    private static final /* synthetic */ gdz lio;
    private /* synthetic */ fzb e8o;
    private /* synthetic */ Random qed;

    public dnm(hr_ hr_2) {
        super(hr_2, new fzb(0.0f), 0.5f);
        this.qed = new Random();
        this.e8o = (fzb)this.m5v;
        this.d4f(new _40(this));
        this.d4f(new j0x(this));
    }

    public void gp_(a_t a_t2, double d, double d2, double d3, float f, float f2) {
        block4: {
            block5: {
                boolean bl;
                int n = t9d.c();
                try {
                    fzb fzb2 = this.e8o;
                    bl = a_t2.ejt().r_y().p1r() != p3y.cei;
                }
                catch (oov oov2) {
                    throw dnm.a(oov2);
                }
                try {
                    fzb2.djg = bl;
                    this.e8o.n7k = a_t2._ah();
                    if (n != 0) break block4;
                    if (!a_t2._ah()) break block5;
                }
                catch (oov oov3) {
                    throw dnm.a(oov3);
                }
                double d4 = 0.02;
                d += this.qed.nextGaussian() * d4;
                d3 += this.qed.nextGaussian() * d4;
            }
            super.w_x(a_t2, d, d2, d3, f, f2);
        }
    }

    public gdz o17(a_t a_t2) {
        return lio;
    }

    @Override
    public void w_x(yqv yqv2, double d, double d2, double d3, float f, float f2) {
        this.gp_((a_t)yqv2, d, d2, d3, f, f2);
    }

    @Override
    public void l1o(g_3 g_32, double d, double d2, double d3, float f, float f2) {
        this.gp_((a_t)g_32, d, d2, d3, f, f2);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.o17((a_t)i2h2);
    }

    @Override
    public void apl(i2h i2h2, double d, double d2, double d3, float f, float f2) {
        this.gp_((a_t)i2h2, d, d2, d3, f, f2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-968071497023022785L, -4972975784574645384L, MethodHandles.lookup().lookupClass()).a(68687581655823L) ^ 0x2754255820B7L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("m<\u0005\u00cdP\u00e7\u009f\b7n\u00f4\u00e3\u00c0Z0\u0019\u00dcr\f\u00eff\u00b7\u0098H\u00db\u00b5\u0088\u00e8\u00e1\u00b9;\u0095\u00dc\u00b2M\u00dc\u00aci=m".getBytes("ISO-8859-1"));
                String string = dnm.c(byArray3).intern();
                lio = new gdz(string);
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

