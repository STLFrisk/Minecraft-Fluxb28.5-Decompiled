/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class eza
extends so9 {
    private static final /* synthetic */ gdz qa4;
    private static final /* synthetic */ gdz gzr;

    public eza(hr_ hr_2) {
        super(hr_2, new cob(), 0.5f);
    }

    public gdz pyc(h_s h_s2) {
        gdz gdz2;
        try {
            gdz2 = h_s2.osy() ? gzr : qa4;
        }
        catch (oov oov2) {
            throw eza.a(oov2);
        }
        return gdz2;
    }

    public void xn4(h_s h_s2, float f) {
        float f2 = 1.0f;
        float f3 = (8.0f + f2) / 2.0f;
        float f4 = (8.0f + 1.0f / f2) / 2.0f;
        hzu.syc(f4, f3, f4);
        hzu.wn0(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void e2w(g_3 g_32, float f) {
        this.xn4((h_s)g_32, f);
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this.pyc((h_s)i2h2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-1679810555601612609L, 7589066484185001929L, MethodHandles.lookup().lookupClass()).a(247787031986280L) ^ 0x1537AFE348E3L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00bc\u00ca\u00f9LP\u00fd\u009f\u00fd\u00b6\u001f\f\u001c\bA\u0097t{\u0084\u0016\u00fdit\u00fd\u00da\u00ac\u00b7qN\u00c2<\u0083\u00e20\u00bc\u00ca\u00f9LP\u00fd\u009f\u00fd\u00b6\u001f\f\u001c\bA\u0097t{\u0084\u0016\u00fdit\u00fd\u00da\u00ab\u00ac\u00c7\u009e\u001a\b\u00e4\u00e6GE\u001bx=<9\u00adn\u00b1;4\u00dfy.s";
        int n2 = "\u00bc\u00ca\u00f9LP\u00fd\u009f\u00fd\u00b6\u001f\f\u001c\bA\u0097t{\u0084\u0016\u00fdit\u00fd\u00da\u00ac\u00b7qN\u00c2<\u0083\u00e20\u00bc\u00ca\u00f9LP\u00fd\u009f\u00fd\u00b6\u001f\f\u001c\bA\u0097t{\u0084\u0016\u00fdit\u00fd\u00da\u00ab\u00ac\u00c7\u009e\u001a\b\u00e4\u00e6GE\u001bx=<9\u00adn\u00b1;4\u00dfy.s".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = eza.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                qa4 = new gdz(stringArray2[0]);
                gzr = new gdz(stringArray2[1]);
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

