/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bbe
extends so9 {
    private static final /* synthetic */ gdz hz_;

    public bbe(hr_ hr_2) {
        super(hr_2, new t4e(), 0.5f);
        this.d4f(new j61(this));
    }

    public void yoo(gze gze2, float f) {
        float f2 = gze2.x9h(f);
        float f3 = 1.0f + fe6.rtn(f2 * 100.0f) * f2 * 0.01f;
        f2 = fe6._f3(f2, 0.0f, 1.0f);
        f2 *= f2;
        f2 *= f2;
        float f4 = (1.0f + f2 * 0.4f) * f3;
        float f5 = (1.0f + f2 * 0.1f) / f3;
        hzu.syc(f4, f5, f4);
    }

    public int i25(gze gze2, float f, float f2) {
        int n;
        block4: {
            float f3;
            block5: {
                int n2 = t9d.c();
                f3 = gze2.x9h(f2);
                try {
                    try {
                        n = (int)(f3 * 10.0f) % 2;
                        if (n2 != 0) break block4;
                        if (n != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw bbe.a(oov2);
                    }
                    return 0;
                }
                catch (oov oov3) {
                    throw bbe.a(oov3);
                }
            }
            n = (int)(f3 * 0.2f * 255.0f);
        }
        int n3 = n;
        n3 = fe6.faa(n3, 0, 255);
        return n3 << 24 | 0xFFFFFF;
    }

    public gdz xzx(gze gze2) {
        return hz_;
    }

    @Override
    public void e2w(g_3 g_32, float f) {
        this.yoo((gze)g_32, f);
    }

    @Override
    public int mq9(g_3 g_32, float f, float f2) {
        return this.i25((gze)g_32, f, f2);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.xzx((gze)i2h2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(1266905151986182583L, 823592883533893463L, MethodHandles.lookup().lookupClass()).a(180368134530989L) ^ 0x41622FB6880BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d9\u001a\u00dbJ#\u00aab6\u001f\u00a6\u00bd\u00ef\u00f3#\u001a \u0000\u0019\u009e`\u00d2\u00e4\u0019\u00ceD.\u0010X\u00a4\u00e0\u0080'\u007f}\u001a\u001f\u00a0\u0018\u00bez".getBytes("ISO-8859-1"));
                String string = bbe.c(byArray3).intern();
                hz_ = new gdz(string);
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

