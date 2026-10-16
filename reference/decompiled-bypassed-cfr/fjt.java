/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fjt
extends so9 {
    private static final /* synthetic */ gdz gyz;

    public fjt(hr_ hr_2) {
        super(hr_2, new s04(), 1.0f);
        this.d4f(new vm8(this));
    }

    public float yyw(u10 u102) {
        return 180.0f;
    }

    public gdz eq9(u10 u102) {
        return gyz;
    }

    @Override
    public float hz_(g_3 g_32) {
        return this.yyw((u10)g_32);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.eq9((u10)i2h2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-2371992180931638425L, 4956741050178712712L, MethodHandles.lookup().lookupClass()).a(44317723060003L) ^ 0x43231103110AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00bd\\\u00e7/w=N\u008d1y\u0019'\u0007\u00c8vvw\u000fG\r\u001ae/\u00b21\u00c8\u00ac\u0019\u0095\u00db+\u0005AS\u0084T.7\u00f5\u00dd".getBytes("ISO-8859-1"));
                String string = fjt.c(byArray3).intern();
                gyz = new gdz(string);
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

