/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _ez
implements gnj {
    private static final /* synthetic */ gdz og8;
    private final /* synthetic */ f1j jmb;
    private final /* synthetic */ luh hcd;

    public _ez(f1j f1j2) {
        this.hcd = new luh(0.5f);
        this.jmb = f1j2;
    }

    public void qmy(_gj _gj2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        try {
            if (_gj2.vlb()) {
                this.jmb.gu4(og8);
                this.hcd.jxr(this.jmb.fy4());
                this.hcd.s_q(_gj2, f, f2, f4, f5, f6, f7);
            }
        }
        catch (oov oov2) {
            throw _ez.a(oov2);
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

    @Override
    public void doRenderLayer(g_3 g_32, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.qmy((_gj)g_32, f, f2, f3, f4, f5, f6, f7);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(2878082215776838710L, 2800277407831742041L, MethodHandles.lookup().lookupClass()).a(275912376228029L) ^ 0x6A0E0E2ABFAL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("p\u00b9\u00f1\u00f9Qt\n\u0097l\u00c2\u0082X\u00bf\u00cd&~\u00a7\u00ac\u007f\u00ca:^#\u0015\u0087*\u00ce\u0015)\u00fa?\u00d1@1\u008a\u00c8\u0097\r4\u00c1".getBytes("ISO-8859-1"));
                String string = _ez.a(byArray3).intern();
                og8 = new gdz(string);
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

