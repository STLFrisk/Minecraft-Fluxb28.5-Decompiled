/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fcl
extends so9 {
    private static final /* synthetic */ gdz a9w;

    public fcl(hr_ hr_2) {
        super(hr_2, new lp1(), 0.25f);
    }

    public gdz i6n(l5f l5f2) {
        return a9w;
    }

    public void yaw(l5f l5f2, float f) {
        hzu.syc(0.35f, 0.35f, 0.35f);
    }

    public void _bw(l5f l5f2, float f, float f2, float f3) {
        block5: {
            int n = t9d.b();
            try {
                block4: {
                    try {
                        if (l5f2.qm1()) break block4;
                        hzu.a4k(0.0f, fe6.ssk(f * 0.3f) * 0.1f, 0.0f);
                        if (n != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw fcl.a(oov2);
                    }
                }
                hzu.a4k(0.0f, -0.1f, 0.0f);
            }
            catch (oov oov3) {
                throw fcl.a(oov3);
            }
        }
        super.ur9(l5f2, f, f2, f3);
    }

    @Override
    public void e2w(g_3 g_32, float f) {
        this.yaw((l5f)g_32, f);
    }

    @Override
    public void ur9(g_3 g_32, float f, float f2, float f3) {
        this._bw((l5f)g_32, f, f2, f3);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.i6n((l5f)i2h2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(5326064001481920098L, -5381550314998903278L, MethodHandles.lookup().lookupClass()).a(45208109079638L) ^ 0x648466710B2AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00d1n\u001c0\u00fb`\u00b9m\u007f\u00a3W\u0082\u00fd\u001a\u00cb\u000e\u00f8\td\u00c0\u00a2\u0015\u00ce\u00a5".getBytes("ISO-8859-1"));
                String string = fcl.c(byArray3).intern();
                a9w = new gdz(string);
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

