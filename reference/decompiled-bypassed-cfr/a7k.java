/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a7k
extends liu {
    private static final /* synthetic */ gdz gli;
    private /* synthetic */ g6r ih3;

    public a7k(hr_ hr_2) {
        super(hr_2);
        this.ih3 = new k47(0.0f, true);
        this.o2u = 0.5f;
    }

    public void ao9(edl edl2, double d, double d2, double d3, float f, float f2) {
        float f3 = (float)edl2.cjr + f2;
        hzu.dp2();
        hzu.a4k((float)d, (float)d2, (float)d3);
        this.gu4(gli);
        float f4 = fe6.rtn(f3 * 0.2f) / 2.0f + 0.5f;
        f4 = f4 * f4 + f4;
        this.ih3.s_q(edl2, 0.0f, f3 * 3.0f, f4 * 0.2f, 0.0f, 0.0f, 0.0625f);
        hzu.x3w();
        super.apl(edl2, d, d2, d3, f, f2);
    }

    public gdz _03(edl edl2) {
        return gli;
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this._03((edl)i2h2);
    }

    @Override
    public void apl(i2h i2h2, double d, double d2, double d3, float f, float f2) {
        this.ao9((edl)i2h2, d, d2, d3, f, f2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(3820801556987660911L, 4187238171268929668L, MethodHandles.lookup().lookupClass()).a(155468408701239L) ^ 0x2DE4F1F25322L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d0\u00cb1\u0086\u00fb:\u00b8\u00d1\u00ff\u00a7\u0088\u008f'\u009d\u00f1#0\u00eb\t7I\u00f5\u000e\u00d6^\u00a2\u00ee\u0087aze\u00ea\u00b6\u0088!\u0016r\u0014\u008a\u00ab\u0088i\u00be\u0094\u0001\u0087<t".getBytes("ISO-8859-1"));
                String string = a7k.b(byArray3).intern();
                gli = new gdz(string);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static String b(byte[] byArray) {
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

