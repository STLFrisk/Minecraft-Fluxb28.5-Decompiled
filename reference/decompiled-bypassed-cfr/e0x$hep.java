/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class e0x$hep
extends Enum {
    public static final e0x$hep j0y;
    public static final e0x$hep xah;
    public static final e0x$hep w9u;
    private static final e0x$hep[] jnf;

    public static e0x$hep[] values() {
        return (e0x$hep[])jnf.clone();
    }

    public static e0x$hep valueOf(String string) {
        return Enum.valueOf(e0x$hep.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private e0x$hep() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(907918694906465833L, 312260488234637307L, MethodHandles.lookup().lookupClass()).a(18098284889507L) ^ 0x400065E25F81L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00edd\u00b3\u00ed\u00a6z\u00a00\bm\u00c2\u00dd\u00ccG\u00ab5\b\b|\u0097[\u00ba\u0083W\u0004c";
        int n2 = "\u00edd\u00b3\u00ed\u00a6z\u00a00\bm\u00c2\u00dd\u00ccG\u00ab5\b\b|\u0097[\u00ba\u0083W\u0004c".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = e0x$hep.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                j0y = new e0x$hep(stringArray2[2], 0);
                xah = new e0x$hep(stringArray2[1], 1);
                w9u = new e0x$hep(stringArray2[0], 2);
                jnf = new e0x$hep[]{j0y, xah, w9u};
                return;
            }
            n3 = string.charAt(n4);
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

