/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class dr9 {
    private String njx;
    private String ahx;
    private String[] mc0;
    public c05 rpq = c05.vz1();
    private static final long b = c.a(-2354868411404917480L, 4159089223148394755L, MethodHandles.lookup().lookupClass()).a(59627916757250L);
    private static final String c;

    public dr9() {
        this.njx = this.getClass().getAnnotation(dr9$x0j.class).t2u();
        this.ahx = this.getClass().getAnnotation(dr9$x0j.class).hjc();
        this.mc0 = this.getClass().getAnnotation(dr9$x0j.class).io4();
    }

    public final String k1_() {
        return this.njx;
    }

    public final String clg() {
        return this.ahx;
    }

    public final String[] ndm() {
        return this.mc0;
    }

    public final void dhs() {
        long l = b ^ 0x6FFFCA3BBEBAL;
        ncl.dob((Object)((Object)syo.aez) + c + (Object)((Object)syo.w29) + this.if3());
    }

    public native String if3();

    public abstract void xjl(String[] var1);

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = b ^ 0x3F847FD1C25BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("v\u00f6bb\u00f2w\u00bf\u0013\u0088\u00e7\u00edf#\u00ce\u0087@m\u00fdce\"\u00df\u00d0\u00e0".getBytes("ISO-8859-1"));
                c = dr9.a(byArray3).intern();
                v6ma.Ex(4);
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

