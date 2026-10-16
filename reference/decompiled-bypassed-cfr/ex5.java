/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ex5
implements he6 {
    private static final long a = c.a(4437651807093318856L, 4522010711408103866L, MethodHandles.lookup().lookupClass()).a(275502274223070L);
    private static final String b;

    @Override
    public cog jhs() {
        return null;
    }

    @Override
    public void o17() {
    }

    @Override
    public oza kmb(upn upn2) {
        return null;
    }

    @Override
    public void oh5(cog cog2, bdo bdo2) {
    }

    @Override
    public void yd8(cog cog2) {
    }

    @Override
    public bwg l64() {
        return null;
    }

    @Override
    public void vpx() {
    }

    @Override
    public File tmg(String string) {
        return null;
    }

    @Override
    public String s1q() {
        long l = a ^ 0x4D6D4033AE98L;
        return b;
    }

    @Override
    public File w62() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x3D67EF92C08BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("U\u00cb\u0013\u00871%\u00cf\u00e5".getBytes("ISO-8859-1"));
                b = ex5.a(byArray3).intern();
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

