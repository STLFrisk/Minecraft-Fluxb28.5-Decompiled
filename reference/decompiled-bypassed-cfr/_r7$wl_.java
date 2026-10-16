/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class _r7$wl_
extends Enum {
    public static final _r7$wl_ ora;
    public static final _r7$wl_ z0m;
    public static final _r7$wl_ c39;
    private static final _r7$wl_[] u8n;

    public static _r7$wl_[] values() {
        return (_r7$wl_[])u8n.clone();
    }

    public static _r7$wl_ valueOf(String string) {
        return Enum.valueOf(_r7$wl_.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private _r7$wl_() {
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
        long l = c.a(-2845035241412283930L, 4944301937303088182L, MethodHandles.lookup().lookupClass()).a(198357128916476L) ^ 0x70E2DB924F8BL;
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
        String string = "\u00ba6i\u0081Ka;\u0091\u0010\u00f1\u00e73k\u0098\u00edb\u0097\u00c08H|\u00af\u00df\u00be\u00b3\b#\u0091\u00a4\buzH@";
        int n2 = "\u00ba6i\u0081Ka;\u0091\u0010\u00f1\u00e73k\u0098\u00edb\u0097\u00c08H|\u00af\u00df\u00be\u00b3\b#\u0091\u00a4\buzH@".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _r7$wl_.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                ora = new _r7$wl_(stringArray2[2], 0);
                z0m = new _r7$wl_(stringArray2[0], 1);
                c39 = new _r7$wl_(stringArray2[1], 2);
                u8n = new _r7$wl_[]{ora, z0m, c39};
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

