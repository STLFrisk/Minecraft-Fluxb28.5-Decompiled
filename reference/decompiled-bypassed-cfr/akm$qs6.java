/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class akm$qs6
extends Enum {
    public static final akm$qs6 du5;
    public static final akm$qs6 i4l;
    public static final akm$qs6 xvy;
    private static final akm$qs6[] l21;

    public static akm$qs6[] values() {
        return (akm$qs6[])l21.clone();
    }

    public static akm$qs6 valueOf(String string) {
        return Enum.valueOf(akm$qs6.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private akm$qs6() {
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
        long l = c.a(9174040490046511249L, -7495716313140207579L, MethodHandles.lookup().lookupClass()).a(30956517672369L) ^ 0x2C8E51F6FD06L;
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
        String string = "b\u009d\u009f\u00bd\u0017\u00d0\u00e9L\b\u001dpP<D\u00e8\u0095i\b\u00d8T\u00b1\u009f{\u00f3ai";
        int n2 = "b\u009d\u009f\u00bd\u0017\u00d0\u00e9L\b\u001dpP<D\u00e8\u0095i\b\u00d8T\u00b1\u009f{\u00f3ai".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = akm$qs6.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                du5 = new akm$qs6(stringArray2[2], 0);
                i4l = new akm$qs6(stringArray2[0], 1);
                xvy = new akm$qs6(stringArray2[1], 2);
                l21 = new akm$qs6[]{du5, i4l, xvy};
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

