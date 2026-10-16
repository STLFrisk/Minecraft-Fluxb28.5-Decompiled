/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ckl
extends u7m {
    private static final long a = c.a(6074511300949812385L, -2811326867175564982L, MethodHandles.lookup().lookupClass()).a(1534314639545L);
    private static final String b;

    public ckl() {
        this.vgp = 16;
        this.qfy(uja.zlu);
    }

    @Override
    public erg r__(erg erg2, t9d t9d2, ha9 ha92) {
        block11: {
            boolean bl;
            block9: {
                int n;
                block10: {
                    long l = a ^ 0x1E42D3F28FA4L;
                    n = t9d.c();
                    try {
                        try {
                            bl = ha92.lls.g40;
                            if (n != 0) break block9;
                            if (bl) break block10;
                        }
                        catch (oov oov2) {
                            throw ckl.a(oov2);
                        }
                        --erg2.qd2;
                    }
                    catch (oov oov3) {
                        throw ckl.a(oov3);
                    }
                }
                try {
                    t9d2.yfq(ha92, b, 0.5f, 0.4f / (pq6.nextFloat() * 0.4f + 0.8f));
                    if (n != 0) break block11;
                    bl = t9d2.v0f;
                }
                catch (oov oov4) {
                    throw ckl.a(oov4);
                }
            }
            try {
                if (!bl) {
                    t9d2.xzq(new dur(t9d2, ha92));
                }
            }
            catch (oov oov5) {
                throw ckl.a(oov5);
            }
            ha92.aex(l9p.foo[u7m._lo(this)]);
        }
        return erg2;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x73B5FCA5772EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00adN\u00a0<F\u000e\u00f1:\u00b4PPw\u00e5xK\u00e6".getBytes("ISO-8859-1"));
                b = ckl.b(byArray3).intern();
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

