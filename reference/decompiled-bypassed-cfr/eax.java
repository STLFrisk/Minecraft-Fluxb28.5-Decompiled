/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class eax
extends ar7 {
    public float yzo;
    public float o5q;
    public float sen;
    public float b9b;
    private static final long a = c.a(1224058711872270046L, 3398186259538459678L, MethodHandles.lookup().lookupClass()).a(28360197180413L);
    private static final String f;

    public eax() {
        long l = a ^ 0x51A2484294CL;
        super(f, _aj.sxc, false, new j1s[0]);
    }

    @jev(jn1=4)
    public void gvu(q8e q8e2) {
        this.yzo = q8e2.uto;
        this.o5q = q8e2._jg;
    }

    @jev
    public void tri(ccn ccn2) {
        this.sen = this.yzo;
        this.b9b = this.o5q;
    }

    @jev
    public void pz_(oc6 oc62) {
        block9: {
            oc6 oc63;
            block8: {
                int n = t9d.b();
                try {
                    try {
                        oc63 = oc62;
                        if (n == 0) break block8;
                        if (oc63.nwx() != eax.ek1.vg8) break block9;
                    }
                    catch (oov oov2) {
                        throw eax.a(oov2);
                    }
                    oc63 = oc62;
                }
                catch (oov oov3) {
                    throw eax.a(oov3);
                }
            }
            try {
                try {
                    if (oc63.kjn() == 1.0f || eax.ek1.vg8.hzp != null) break block9;
                }
                catch (oov oov4) {
                    throw eax.a(oov4);
                }
                oc62.tdl(eax.r6w(oc62.kjn(), this.sen, this.yzo));
                oc62.eni(eax.r6w(oc62.kjn(), this.sen, this.yzo) - oc62.zl3());
                oc62.n5r(eax.m0l(oc62.kjn(), this.b9b, this.o5q));
            }
            catch (oov oov5) {
                throw eax.a(oov5);
            }
        }
    }

    public static float r6w(float f, float f2, float f3) {
        return f2 + f * fe6.qsy(f3 - f2);
    }

    public static float m0l(float f, float f2, float f3) {
        return f2 + f * (f3 - f2);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x14919667DC2AL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("s\u00c7\u00e3h\u00d0\u0083\u0014 \u0018f\u00bbFRfs\u00a2\u0017\u00b0{E#\u0019\u00c9\u008d".getBytes("ISO-8859-1"));
                f = eax.b(byArray3).intern();
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

    private static String b(byte[] byArray) {
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

