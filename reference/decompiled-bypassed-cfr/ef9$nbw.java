/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class ef9$nbw
extends Enum {
    public static final ef9$nbw u8y;
    public static final ef9$nbw blk;
    public static final ef9$nbw rt_;
    private static final ef9$nbw[] dtx;

    public static ef9$nbw[] values() {
        return (ef9$nbw[])dtx.clone();
    }

    public static ef9$nbw valueOf(String string) {
        return Enum.valueOf(ef9$nbw.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ef9$nbw() {
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
        long l = c.a(7220901729465063815L, 3701392870641082043L, MethodHandles.lookup().lookupClass()).a(93132672568878L) ^ 0x45B37EB21325L;
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
        String string = "/\u00aa\u00d8\u00e2j\u008a\u00ff\u00ae\u00a2\u00ea\u0005\u00d9di{\u00d8\u0010i\u0090\u000b \u00f3tGA\u00e2\u00d1\u00e9\u00a2\f(\u0001\u001b\u0010\u00c2\u00a0|e\u008d\u0019\u00c6\u00e5\u00be\u00d9\u001d\u00cd\u00b0\u00cd\u0085\u00e6";
        int n2 = "/\u00aa\u00d8\u00e2j\u008a\u00ff\u00ae\u00a2\u00ea\u0005\u00d9di{\u00d8\u0010i\u0090\u000b \u00f3tGA\u00e2\u00d1\u00e9\u00a2\f(\u0001\u001b\u0010\u00c2\u00a0|e\u008d\u0019\u00c6\u00e5\u00be\u00d9\u001d\u00cd\u00b0\u00cd\u0085\u00e6".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ef9$nbw.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                u8y = new ef9$nbw(stringArray2[0], 0);
                blk = new ef9$nbw(stringArray2[1], 1);
                rt_ = new ef9$nbw(stringArray2[2], 2);
                dtx = new ef9$nbw[]{u8y, blk, rt_};
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

