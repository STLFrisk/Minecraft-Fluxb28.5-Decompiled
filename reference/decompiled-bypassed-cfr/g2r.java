/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g2r
extends u7m {
    private static final long a = c.a(-7696821410187279940L, 7706811153961493288L, MethodHandles.lookup().lookupClass()).a(29376771860734L);
    private static final String b;

    public g2r() {
        this.qfy(uja.kdm);
    }

    @Override
    public boolean lsj(erg erg2) {
        return true;
    }

    @Override
    public erg r__(erg erg2, t9d t9d2, ha9 ha92) {
        block11: {
            boolean bl;
            block9: {
                int n;
                block10: {
                    long l = a ^ 0x4568A36C1BA9L;
                    n = t9d.c();
                    try {
                        try {
                            bl = ha92.lls.g40;
                            if (n != 0) break block9;
                            if (bl) break block10;
                        }
                        catch (oov oov2) {
                            throw g2r.a(oov2);
                        }
                        --erg2.qd2;
                    }
                    catch (oov oov3) {
                        throw g2r.a(oov3);
                    }
                }
                try {
                    t9d2.yfq(ha92, b, 0.5f, 0.4f / (pq6.nextFloat() * 0.4f + 0.8f));
                    if (n != 0) break block11;
                    bl = t9d2.v0f;
                }
                catch (oov oov4) {
                    throw g2r.a(oov4);
                }
            }
            try {
                if (!bl) {
                    t9d2.xzq(new vdu(t9d2, ha92));
                }
            }
            catch (oov oov5) {
                throw g2r.a(oov5);
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
        long l = a ^ 0x3BF2F43840BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00f4n\u00b9M\u00147\u008b\u00d6\u0001g\u00e3\u0006\u008f;\u008c\u00f0".getBytes("ISO-8859-1"));
                b = g2r.b(byArray3).intern();
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

