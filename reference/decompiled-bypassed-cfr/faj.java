/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class faj
extends fjt {
    private static final /* synthetic */ gdz n1h;

    public faj(hr_ hr_2) {
        super(hr_2);
        this.o2u *= 0.7f;
    }

    public void _1p(doc doc2, float f) {
        hzu.syc(0.7f, 0.7f, 0.7f);
    }

    public gdz ihr(doc doc2) {
        return n1h;
    }

    @Override
    public gdz eq9(u10 u102) {
        return this.ihr((doc)u102);
    }

    @Override
    public void e2w(g_3 g_32, float f) {
        this._1p((doc)g_32, f);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.ihr((doc)i2h2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(6387951340678906935L, -6033240813488258413L, MethodHandles.lookup().lookupClass()).a(170991703019960L) ^ 0x786166D01C3EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("8\u009a\u000b\u0094Eo\u00b6\u00d2T\u0085~C\u00a7}.F\u0018@\u00936\u00f8\u00c2#\u00f0\u00da\u00ab6\u0097\u00a5m\u00b6\u00c3j[\u00c0)\u00b3+d7".getBytes("ISO-8859-1"));
                String string = faj.d(byArray3).intern();
                n1h = new gdz(string);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String d(byte[] byArray) {
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

