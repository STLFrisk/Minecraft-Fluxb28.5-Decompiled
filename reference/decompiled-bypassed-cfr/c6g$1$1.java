/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystemLogger
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import paulscode.sound.SoundSystemLogger;

public class c6g$1$1
extends SoundSystemLogger {
    public final c6g.1 thq;
    private static final long a = c.a(5855172866099941664L, -1896669408524360203L, MethodHandles.lookup().lookupClass()).a(269025173336026L);
    private static final String b;

    public c6g$1$1(c6g.1 var1_1) {
        this.thq = var1_1;
    }

    public void message(String string, int n) {
        try {
            if (!string.isEmpty()) {
                c6g.s4b().info(string);
            }
        }
        catch (oov oov2) {
            throw c6g$1$1.a(oov2);
        }
    }

    public void importantMessage(String string, int n) {
        try {
            if (!string.isEmpty()) {
                c6g.s4b().warn(string);
            }
        }
        catch (oov oov2) {
            throw c6g$1$1.a(oov2);
        }
    }

    public void errorMessage(String string, String string2, int n) {
        long l = a ^ 0x5CC66B3739AFL;
        try {
            if (!string2.isEmpty()) {
                c6g.s4b().error(b + string + "'");
                c6g.s4b().error(string2);
            }
        }
        catch (oov oov2) {
            throw c6g$1$1.a(oov2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x371AD387B8E4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00a5\u00a0Jp\u0004z\u00dd \u00e3\u00fb\u00cftWmqL\u008c\u00e5\u00b0\u0090z\u00eax1".getBytes("ISO-8859-1"));
                b = c6g$1$1.a(byArray3).intern();
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

