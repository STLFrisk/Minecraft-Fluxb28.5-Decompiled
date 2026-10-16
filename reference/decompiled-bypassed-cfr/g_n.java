/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g_n
extends ak9 {
    private static final long a = c.a(2457090645631203079L, -220514657064197803L, MethodHandles.lookup().lookupClass()).a(254762766733433L);
    private static final String c;

    public g_n(nm6 nm62, int n, int n2) {
        long l = a ^ 0x6EE07CE8E016L;
        super(nm62, n, n2, "");
        this.vms = jvy.ypj;
        this.c1c = 1;
        this.bqh = c;
    }

    @Override
    public void g1p(int n, int n2) {
        int n3;
        int n4;
        float f;
        float f2;
        block6: {
            block7: {
                int n5;
                int n6;
                float f3;
                float f4;
                int n7;
                block4: {
                    block5: {
                        n7 = t9d.c();
                        try {
                            float f3 = this.koa;
                            f3 = this.mff;
                            int n5 = this.vms;
                            n5 = this.loa.yg5;
                            if (n7 != 0) break block4;
                            if (n5 == 0) break block5;
                        }
                        catch (oov oov2) {
                            throw g_n.a(oov2);
                        }
                        n5 = jvy.ynu;
                        break block4;
                    }
                    n5 = 0;
                }
                try {
                    mkt.uk7(f4, f3, n6 - n5, 1.0f, jvy.ogc);
                    float f = this.koa + 2;
                    f = this.mff;
                    int n3 = this.vms;
                    n3 = this.loa.yg5;
                    if (n7 != 0) break block6;
                    if (n3 == 0) break block7;
                }
                catch (oov oov3) {
                    throw g_n.a(oov3);
                }
                n3 = jvy.ynu;
                break block6;
            }
            n3 = 0;
        }
        mkt.uk7(f2, f, n4 - n3 - 4, 1.0f, jvy.cnm);
    }

    @Override
    public void x6o(int n, int n2, boolean bl) {
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x54A2DA6F5565L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00f3#\u00ffg\u00a6\u00d3\u00b5\u0018\u0094\u00b62\u00a5\u0011l7\u00b4".getBytes("ISO-8859-1"));
                c = g_n.b(byArray3).intern();
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

