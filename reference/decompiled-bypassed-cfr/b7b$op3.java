/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class b7b$op3
extends Enum
implements v4k {
    public static final b7b$op3 sm3;
    private static final b7b$op3[] ptc;
    private final int k32;
    private final String xyc;
    private final _mi o1z;
    private static final b7b$op3[] xkp;

    public static b7b$op3[] values() {
        return (b7b$op3[])xkp.clone();
    }

    public static b7b$op3 valueOf(String string) {
        return Enum.valueOf(b7b$op3.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private b7b$op3(_mi _mi2) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.k32 = (int)_mi2;
        this.xyc = var4_2;
        this.o1z = var5_3;
    }

    public int tn1() {
        return this.k32;
    }

    public _mi lk1() {
        return this.o1z;
    }

    public String toString() {
        return this.xyc;
    }

    public static b7b$op3 wc8(int n) {
        block10: {
            int n2;
            block8: {
                int n3 = t9d.b();
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    n2 = n;
                                    if (n3 == 0) break block8;
                                    if (n2 < 0) break block9;
                                }
                                catch (oov oov2) {
                                    throw b7b$op3.a(oov2);
                                }
                                n2 = n;
                                if (n3 == 0) break block8;
                            }
                            catch (oov oov3) {
                                throw b7b$op3.a(oov3);
                            }
                            if (n2 < ptc.length) break block10;
                        }
                        catch (oov oov4) {
                            throw b7b$op3.a(oov4);
                        }
                    }
                    n2 = 0;
                }
                catch (oov oov5) {
                    throw b7b$op3.a(oov5);
                }
            }
            n = n2;
        }
        return ptc[n];
    }

    @Override
    public String mo3() {
        return this.xyc;
    }

    public String usc() {
        return this.xyc;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(-4435492745797380156L, -535761407662743910L, MethodHandles.lookup().lookupClass()).a(214145936691329L) ^ 0x31979C7A90E1L;
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
        String string = "\u00b5\u0005\u001dwT\u00e5\u0096k{\u008e\u008e\u0002r\u00a8\u00d1\u00cd\u0010\u009b\u00fc\u00f4\u00df#/\"\u00c1\u00e5\u00196f9\u00bd\u00e4\u0081";
        int n2 = "\u00b5\u0005\u001dwT\u00e5\u0096k{\u008e\u008e\u0002r\u00a8\u00d1\u00cd\u0010\u009b\u00fc\u00f4\u00df#/\"\u00c1\u00e5\u00196f9\u00bd\u00e4\u0081".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = b7b$op3.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        String[] stringArray2 = stringArray;
        sm3 = new b7b$op3(stringArray2[1], 0, 0, stringArray2[0], pmc$s6y.tms.fds());
        xkp = new b7b$op3[]{sm3};
        ptc = new b7b$op3[b7b$op3.values().length];
        b7b$op3[] b7b$op3Array = b7b$op3.values();
        int n6 = b7b$op3Array.length;
        int n7 = 0;
        while (n7 < n6) {
            b7b$op3 b7b$op3;
            b7b$op3.ptc[b7b$op3.tn1()] = b7b$op3 = b7b$op3Array[n7];
            ++n7;
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

