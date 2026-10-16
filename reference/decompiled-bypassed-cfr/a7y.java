/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a7y
extends u7m {
    private static final long a = c.a(2723446982723913124L, 6951524850359568736L, MethodHandles.lookup().lookupClass()).a(215627785743634L);
    private static final String b;

    public a7y() {
        this.vgp = 1;
        this.rlr(64);
        this.qfy(uja.zip);
    }

    @Override
    public boolean ghw(erg erg2, ha9 ha92, t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3) {
        block9: {
            mew mew3;
            t9d t9d3;
            block8: {
                int n;
                block7: {
                    boolean bl;
                    block6: {
                        long l = a ^ 0x2A1843BC66DDL;
                        n = t9d.b();
                        mew2 = mew2.offset(vt22);
                        try {
                            bl = ha92.dzh(mew2, vt22, erg2);
                            if (n == 0) break block6;
                            if (bl) break block7;
                        }
                        catch (oov oov2) {
                            throw a7y.a(oov2);
                        }
                        bl = false;
                    }
                    return bl;
                }
                try {
                    try {
                        t9d3 = t9d2;
                        mew3 = mew2;
                        if (n == 0) break block8;
                        if (t9d3.getBlockState(mew3).r_y().p1r() != p3y.cei) break block9;
                    }
                    catch (oov oov3) {
                        throw a7y.a(oov3);
                    }
                    t9d2.amg((double)mew2.getX() + 0.5, (double)mew2.getY() + 0.5, (double)mew2.getZ() + 0.5, b, 1.0f, pq6.nextFloat() * 0.4f + 0.8f);
                    t9d3 = t9d2;
                    mew3 = mew2;
                }
                catch (oov oov4) {
                    throw a7y.a(oov4);
                }
            }
            t9d3.gfy(mew3, ox_._0u.l4i());
        }
        erg2.ybw(1, ha92);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x5BCB681EAAD9L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u0007Id\u0085\u0015-\u00e5\u0083)\u00b6}I:\u00d7\u0018\u0093".getBytes("ISO-8859-1"));
                b = a7y.b(byArray3).intern();
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

