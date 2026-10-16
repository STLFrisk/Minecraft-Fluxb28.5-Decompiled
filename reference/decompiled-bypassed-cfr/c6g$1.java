/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemLogger
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemLogger;

public class c6g$1
implements Runnable {
    public final c6g ar_;
    private static final long a = c.a(-7260452323112138114L, -1436229404910456863L, MethodHandles.lookup().lookupClass()).a(215856700934956L);
    private static final String b;

    public c6g$1(c6g c6g2) {
        this.ar_ = c6g2;
    }

    @Override
    public void run() {
        long l = a ^ 0x438D9F3AA975L;
        SoundSystemConfig.setLogger((SoundSystemLogger)new c6g$1$1(this));
        c6g c6g2 = this.ar_;
        c6g2.getClass();
        c6g.xys(this.ar_, new c6g$p0f(c6g2, null));
        c6g.oic(this.ar_, true);
        c6g.b7d(this.ar_).setMasterVolume(c6g.yo_(this.ar_).a8l(xdt.adu));
        c6g.s4b().info(c6g.n1u(), b);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x706A77EC7781L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("-\u00e3\u0089\u00b1)|\u001f;,\u00b9>\u009f\u00a2fk\u00a9H\u00df\u00b0\u001d\u000b\u00a0!\n".getBytes("ISO-8859-1"));
                b = c6g$1.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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

