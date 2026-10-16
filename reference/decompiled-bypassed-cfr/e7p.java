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

public class e7p
extends e0x {
    public static final _ku sxl;

    public e7p() {
        super(p3y.zmv);
        this.y8l(this._8_.c32().zvi(sxl, Integer.valueOf(1)));
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this._p_(true);
        this.i3l(uja.qqf);
        this.bf6();
    }

    @Override
    public boolean iwf(m5n m5n2, mew mew2) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = ((Integer)m5n2.getBlockState(mew2).dil(sxl)).intValue();
                        if (n == 0) break block4;
                        if (bl >= 5 != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw e7p.a(oov2);
                    }
                    bl = true;
                    break block4;
                }
                catch (oov oov3) {
                    throw e7p.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        int n = (Integer)zfz2.dil(sxl) - 1;
        float f = 0.125f;
        return new nh4((double)mew2.getX() + this.d80, (double)mew2.getY() + this.tcq, (double)mew2.getZ() + this.iac, (double)mew2.getX() + this.smy, (float)mew2.getY() + (float)n * f, (double)mew2.getZ() + this.nlu);
    }

    @Override
    public boolean ko5() {
        return false;
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public void bf6() {
        this.crh(0);
    }

    @Override
    public void c7i(m5n m5n2, mew mew2) {
        zfz zfz2 = m5n2.getBlockState(mew2);
        this.crh((Integer)zfz2.dil(sxl));
    }

    public void crh(int n) {
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, (float)n / 8.0f, 1.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ctq(t9d t9d2, mew mew2) {
        int n;
        int n2;
        e0x e0x2;
        block32: {
            e0x e0x3;
            block30: {
                block31: {
                    zfz zfz2;
                    block28: {
                        block29: {
                            block27: {
                                e0x e0x4;
                                block26: {
                                    zfz2 = t9d2.getBlockState(mew2.eve());
                                    e0x2 = zfz2.r_y();
                                    n2 = t9d.b();
                                    try {
                                        try {
                                            try {
                                                e0x e0x4 = e0x2;
                                                e0x4 = ox_.f02;
                                                if (n2 == 0) break block26;
                                                if (e0x3 == e0x4) return 0 != 0;
                                            }
                                            catch (oov oov2) {
                                                throw e7p.a(oov2);
                                            }
                                            e0x3 = e0x2;
                                            if (n2 == 0) break block27;
                                        }
                                        catch (oov oov3) {
                                            throw e7p.a(oov3);
                                        }
                                        e0x4 = ox_.tli;
                                    }
                                    catch (oov oov4) {
                                        throw e7p.a(oov4);
                                    }
                                }
                                if (e0x3 == e0x4) return 0 != 0;
                                e0x3 = e0x2;
                            }
                            try {
                                try {
                                    if (n2 == 0) break block28;
                                    if (e0x3.p1r() != p3y.hh1) break block29;
                                    return 1 != 0;
                                }
                                catch (oov oov5) {
                                    throw e7p.a(oov5);
                                }
                            }
                            catch (oov oov6) {
                                throw e7p.a(oov6);
                            }
                        }
                        e0x3 = e0x2;
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (n2 == 0) break block30;
                                    if (e0x3 != this) break block31;
                                }
                                catch (oov oov7) {
                                    throw e7p.a(oov7);
                                }
                                n = (Integer)zfz2.dil(sxl);
                                if (n2 == 0) break block32;
                            }
                            catch (oov oov8) {
                                throw e7p.a(oov8);
                            }
                            if (n < 7) break block31;
                            return 1 != 0;
                        }
                        catch (oov oov9) {
                            throw e7p.a(oov9);
                        }
                    }
                    catch (oov oov10) {
                        throw e7p.a(oov10);
                    }
                }
                e0x3 = e0x2;
            }
            n = e0x3.ko5();
        }
        try {
            try {
                try {
                    try {
                        if (n2 == 0) return n != 0;
                        if (n == 0) return 0 != 0;
                    }
                    catch (oov oov11) {
                        throw e7p.a(oov11);
                    }
                    n = e0x2.kgd.c3t() ? 1 : 0;
                    if (n2 == 0) return n != 0;
                }
                catch (oov oov12) {
                    throw e7p.a(oov12);
                }
                if (n == 0) return 0 != 0;
                return 1 != 0;
            }
            catch (oov oov13) {
                throw e7p.a(oov13);
            }
        }
        catch (oov oov14) {
            throw e7p.a(oov14);
        }
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        this.qhl(t9d2, mew2, zfz2);
    }

    private boolean qhl(t9d t9d2, mew mew2, zfz zfz2) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = this.ctq(t9d2, mew2);
                        if (n == 0) break block4;
                        if (bl) break block5;
                    }
                    catch (oov oov2) {
                        throw e7p.a(oov2);
                    }
                    this.lf0(t9d2, mew2, zfz2, 0);
                    t9d2.i6x(mew2);
                    return false;
                }
                catch (oov oov3) {
                    throw e7p.a(oov3);
                }
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public void i4u(t9d t9d2, ha9 ha92, mew mew2, zfz zfz2, pyk pyk2) {
        e7p.ymu(t9d2, mew2, new erg(xbr.db4, (Integer)zfz2.dil(sxl) + 1, 0));
        t9d2.i6x(mew2);
        ha92.aex(l9p.hf_[e0x.mxb(this)]);
    }

    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        return xbr.db4;
    }

    @Override
    public int bzr(Random random) {
        return 0;
    }

    @Override
    public void zvy(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        block4: {
            int n = t9d.c();
            try {
                int n2;
                try {
                    n2 = t9d2.qkq(qe5.lm8, mew2);
                    if (n != 0 || n2 <= 11) break block4;
                }
                catch (oov oov2) {
                    throw e7p.a(oov2);
                }
                this.lf0(t9d2, mew2, t9d2.getBlockState(mew2), 0);
                n2 = t9d2.i6x(mew2) ? 1 : 0;
            }
            catch (oov oov3) {
                throw e7p.a(oov3);
            }
        }
    }

    @Override
    public boolean ron(m5n m5n2, mew mew2, vt2 vt22) {
        boolean bl;
        try {
            bl = vt22 == vt2.rf3 ? true : super.ron(m5n2, mew2, vt22);
        }
        catch (oov oov2) {
            throw e7p.a(oov2);
        }
        return bl;
    }

    @Override
    public zfz kig(int n) {
        return this.l4i().zvi(sxl, Integer.valueOf((n & 7) + 1));
    }

    @Override
    public boolean ujd(t9d t9d2, mew mew2) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        bl = ((Integer)t9d2.getBlockState(mew2).dil(sxl)).intValue();
                        if (n != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw e7p.a(oov2);
                    }
                    bl = true;
                    break block4;
                }
                catch (oov oov3) {
                    throw e7p.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public int hvp(zfz zfz2) {
        return (Integer)zfz2.dil(sxl) - 1;
    }

    @Override
    public g92 oz5() {
        return new g92(this, new xny[]{sxl});
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = c.a(7750117865923555660L, 2089680485220226582L, MethodHandles.lookup().lookupClass()).a(241763574544443L) ^ 0x264EF0139240L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00bb?iXm\u00cb\u00cb\u0011".getBytes("ISO-8859-1"));
                String string = e7p.b(byArray3).intern();
                sxl = _ku.wgl(string, 1, 8);
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

