/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class afi
extends e0x {
    public static final _ku hdd;

    public afi() {
        super(p3y.tyq);
        this.y8l(this._8_.c32().zvi(hdd, Integer.valueOf(0)));
        this._p_(true);
    }

    @Override
    public void c7i(m5n m5n2, mew mew2) {
        float f = 0.0625f;
        float f2 = (float)(1 + (Integer)m5n2.getBlockState(mew2).dil(hdd) * 2) / 16.0f;
        float f3 = 0.5f;
        this.xl4(f2, 0.0f, f, 1.0f - f, f3, 1.0f - f);
    }

    @Override
    public void bf6() {
        float f = 0.0625f;
        float f2 = 0.5f;
        this.xl4(f, 0.0f, f, 1.0f - f, f2, 1.0f - f);
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        float f = 0.0625f;
        float f2 = (float)(1 + (Integer)zfz2.dil(hdd) * 2) / 16.0f;
        float f3 = 0.5f;
        return new nh4((float)mew2.getX() + f2, mew2.getY(), (float)mew2.getZ() + f, (float)(mew2.getX() + 1) - f, (float)mew2.getY() + f3, (float)(mew2.getZ() + 1) - f);
    }

    @Override
    public nh4 j54(t9d t9d2, mew mew2) {
        return this.m__(t9d2, mew2, t9d2.getBlockState(mew2));
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        this.zwd(t9d2, mew2, zfz2, ha92);
        return true;
    }

    @Override
    public void uqb(t9d t9d2, mew mew2, ha9 ha92) {
        this.zwd(t9d2, mew2, t9d2.getBlockState(mew2), ha92);
    }

    private void zwd(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92) {
        block11: {
            int n;
            int n2;
            block10: {
                n2 = t9d.c();
                try {
                    try {
                        n = ha92.ca2(false);
                        if (n2 != 0) break block10;
                        if (n == 0) break block11;
                    }
                    catch (oov oov2) {
                        throw afi.a(oov2);
                    }
                    ha92.aex(l9p.ayi);
                    ha92.wvq().wnm(2, 0.1f);
                    n = (Integer)zfz2.dil(hdd);
                }
                catch (oov oov3) {
                    throw afi.a(oov3);
                }
            }
            int n3 = n;
            try {
                int n4;
                block12: {
                    try {
                        try {
                            n4 = n3;
                            if (n2 != 0) break block11;
                            if (n4 >= 6) break block12;
                        }
                        catch (oov oov4) {
                            throw afi.a(oov4);
                        }
                        t9d2.vct(mew2, zfz2.zvi(hdd, Integer.valueOf(n3 + 1)), 3);
                        if (n2 == 0) break block11;
                    }
                    catch (oov oov5) {
                        throw afi.a(oov5);
                    }
                }
                n4 = t9d2.i6x(mew2) ? 1 : 0;
            }
            catch (oov oov6) {
                throw afi.a(oov6);
            }
        }
    }

    @Override
    public boolean ctq(t9d t9d2, mew mew2) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = super.ctq(t9d2, mew2);
                        if (n == 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw afi.a(oov2);
                    }
                    bl = this.zrr(t9d2, mew2);
                    break block4;
                }
                catch (oov oov3) {
                    throw afi.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        block4: {
            int n = t9d.b();
            try {
                boolean bl;
                try {
                    bl = this.zrr(t9d2, mew2);
                    if (n == 0 || bl) break block4;
                }
                catch (oov oov2) {
                    throw afi.a(oov2);
                }
                bl = t9d2.i6x(mew2);
            }
            catch (oov oov3) {
                throw afi.a(oov3);
            }
        }
    }

    private boolean zrr(t9d t9d2, mew mew2) {
        return t9d2.getBlockState(mew2.eve()).r_y().p1r().gk6();
    }

    @Override
    public int bzr(Random random) {
        return 0;
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        return null;
    }

    @Override
    public u7m su9(t9d t9d2, mew mew2) {
        return xbr.bsd;
    }

    @Override
    public w51 w3x() {
        return w51.gx9;
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(hdd, Integer.valueOf(n));
    }

    @Override
    public int hvp(zfz zfz2) {
        return (Integer)zfz2.dil(hdd);
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{hdd});
    }

    @Override
    public int mya(t9d t9d2, mew mew2) {
        return (7 - (Integer)t9d2.getBlockState(mew2).dil(hdd)) * 2;
    }

    @Override
    public boolean ge5() {
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
        long l = c.a(2710723127628960175L, 1503326656219822945L, MethodHandles.lookup().lookupClass()).a(194558857601740L) ^ 0x6EB5DFEA2B5EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00fe,\u0012h\u00b1\u00fdB[".getBytes("ISO-8859-1"));
                String string = afi.b(byArray3).intern();
                hdd = _ku.wgl(string, 0, 6);
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

