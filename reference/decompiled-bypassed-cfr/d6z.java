/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class d6z
extends so9 {
    private static final /* synthetic */ gdz p93;

    public d6z(hr_ hr_2, g6r g6r2, float f) {
        super(hr_2, g6r2, f);
        this.d4f(new sl_(this));
    }

    public void q8o(dge dge2, double d, double d2, double d3, float f, float f2) {
        this.o2u = 0.25f * (float)dge2.qi8();
        super.w_x(dge2, d, d2, d3, f, f2);
    }

    public void iuy(dge dge2, float f) {
        float f2 = dge2.qi8();
        float f3 = (dge2.un8 + (dge2.mhp - dge2.un8) * f) / (f2 * 0.5f + 1.0f);
        float f4 = 1.0f / (f3 + 1.0f);
        hzu.syc(f4 * f2, 1.0f / f4 * f2, f4 * f2);
    }

    public gdz _ww(dge dge2) {
        return p93;
    }

    @Override
    public void w_x(yqv yqv2, double d, double d2, double d3, float f, float f2) {
        this.q8o((dge)yqv2, d, d2, d3, f, f2);
    }

    @Override
    public void e2w(g_3 g_32, float f) {
        this.iuy((dge)g_32, f);
    }

    @Override
    public void l1o(g_3 g_32, double d, double d2, double d3, float f, float f2) {
        this.q8o((dge)g_32, d, d2, d3, f, f2);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this._ww((dge)i2h2);
    }

    @Override
    public void apl(i2h i2h2, double d, double d2, double d3, float f, float f2) {
        this.q8o((dge)i2h2, d, d2, d3, f, f2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(3564783000125031416L, -8678424152532002886L, MethodHandles.lookup().lookupClass()).a(173388245711157L) ^ 0x5833C2B9C12EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u000b\u00e3p\u009c\u0090{-f\u00d1\u00fcj\u00deV\u00cdN XE5\u00dbh>`]\u0086\u008eK<J.0\u0099".getBytes("ISO-8859-1"));
                String string = d6z.c(byArray3).intern();
                p93 = new gdz(string);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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

