/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fz2
extends u1p {
    public double mno;
    public double w2f;
    public double lvt;
    public float hoc;
    public float iq9;
    public boolean p3t;
    private /* synthetic */ boolean rcp;
    private static final long a = c.a(3883467106386835383L, -2145556054299798744L, MethodHandles.lookup().lookupClass()).a(185636636421298L);
    private static final String b;

    public fz2(double d, double d2, double d3, float f, float f2, boolean bl) {
        this.w2f = d2;
        this.lvt = d3;
        this.mno = d;
        this.hoc = f;
        this.iq9 = f2;
        this.p3t = bl;
    }

    public void h8j(float f) {
        this.hoc = f;
        this.rcp = true;
    }

    /*
     * Loose catch block
     */
    public void ni7(float f) {
        block9: {
            block8: {
                float f2;
                block7: {
                    long l = a ^ 0x29732E20B582L;
                    int n = t9d.c();
                    float f3 = Math.abs(f) - 90.0f;
                    f2 = f3 == 0.0f ? (byte)0 : (f3 > 0.0f ? (byte)1 : -1);
                    if (n != 0) break block7;
                    try {
                        block10: {
                            if (f2 < 0) break block8;
                            break block10;
                            catch (Exception exception) {
                                throw fz2.a(exception);
                            }
                        }
                        ncl.zpu(b + f);
                        if (n != 0) break block9;
                    }
                    catch (Exception exception) {
                        throw fz2.a(exception);
                    }
                    f2 = (float)zwr.jut;
                }
                if (f2 != false) {
                    try {
                        throw new Exception();
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
            this.iq9 = f;
            this.rcp = true;
        }
    }

    public void cqr(float[] fArray) {
        this.h8j(fArray[0]);
        this.ni7(fArray[1]);
        this.rcp = true;
    }

    public float m1r() {
        return this.hoc;
    }

    public float d9n() {
        return this.iq9;
    }

    public boolean lhw() {
        return this.rcp;
    }

    public void nxl(double d) {
        this.mno = d;
    }

    public void o4n(double d) {
        this.w2f = d;
    }

    public void idi(double d) {
        this.lvt = d;
    }

    public double e8j() {
        return this.mno;
    }

    public double fk0() {
        return this.w2f;
    }

    public double ean() {
        return this.lvt;
    }

    public void eff(boolean bl) {
        this.p3t = bl;
    }

    public boolean upz() {
        return this.p3t;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x2AEE409122F9L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00cds\u00e1m3)\u00c2\u00b8Ou\u00ca\u0015\u0097\u00b4L&\u00f5,\u0005\u00114hR\u0088".getBytes("ISO-8859-1"));
                b = fz2.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
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

