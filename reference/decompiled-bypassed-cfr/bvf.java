/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class bvf {
    private final /* synthetic */ int iym;
    private /* synthetic */ zfz x_w;
    private /* synthetic */ int nrf;
    private /* synthetic */ int r0w;
    private static final long a = c.a(-744137026137023733L, -4816370056865871603L, MethodHandles.lookup().lookupClass()).a(145929199673692L);
    private static final String b;

    public bvf(int n, e0x e0x2) {
        this(3, n, e0x2);
    }

    public bvf(int n, int n2, e0x e0x2) {
        this.nrf = 1;
        this.iym = n;
        this.nrf = n2;
        this.x_w = e0x2.l4i();
    }

    public bvf(int n, int n2, e0x e0x2, int n3) {
        this(n, n2, e0x2);
        this.x_w = e0x2.kig(n3);
    }

    public int pyz() {
        return this.nrf;
    }

    public zfz see() {
        return this.x_w;
    }

    private e0x v_h() {
        return this.x_w.r_y();
    }

    private int g2o() {
        return this.x_w.r_y().hvp(this.x_w);
    }

    public int b_3() {
        return this.r0w;
    }

    public void a7o(int n) {
        this.r0w = n;
    }

    public String toString() {
        String string;
        long l = a ^ 0x101257178010L;
        if (this.iym >= 3) {
            block8: {
                String string2;
                gdz gdz2;
                block7: {
                    gdz2 = (gdz)e0x.db8.csx(this.v_h());
                    try {
                        if (gdz2 != null) break block7;
                        string2 = b;
                        break block8;
                    }
                    catch (oov oov2) {
                        throw bvf.a(oov2);
                    }
                }
                string2 = string = gdz2.toString();
            }
            if (this.nrf > 1) {
                string = this.nrf + "*" + string;
            }
        } else {
            string = Integer.toString(e0x.mxb(this.v_h()));
            if (this.nrf > 1) {
                string = this.nrf + "x" + string;
            }
        }
        int n = this.g2o();
        if (n > 0) {
            string = string + ":" + n;
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x4873F9DAB395L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00dbE\u00ba\u0002\u00cc\u001aD\u00eb".getBytes("ISO-8859-1"));
                b = bvf.a(byArray3).intern();
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

