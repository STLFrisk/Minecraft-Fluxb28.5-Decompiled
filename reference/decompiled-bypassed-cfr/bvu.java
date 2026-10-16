/*
 * Decompiled with CFR 0.152.
 */
public class bvu
extends u7m {
    private static final m1p ko3 = new bvu$1();
    private final _f3$c3d c9z;

    public bvu(_f3$c3d _f3$c3d) {
        this.vgp = 1;
        this.c9z = _f3$c3d;
        this.qfy(uja.qes);
        okn.r4s.emn(this, ko3);
    }

    @Override
    public boolean ghw(erg erg2, ha9 ha92, t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block17: {
            block18: {
                boolean bl2;
                block19: {
                    block20: {
                        boolean bl3;
                        _f3 _f32;
                        block23: {
                            y0y$_zr y0y$_zr;
                            int n;
                            block24: {
                                block22: {
                                    zfz zfz2;
                                    zfz zfz3;
                                    block21: {
                                        n = t9d.b();
                                        zfz3 = t9d2.getBlockState(mew2);
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                bl = y0y.al_(zfz3);
                                                                if (n == 0) break block17;
                                                                if (!bl) break block18;
                                                            }
                                                            catch (oov oov2) {
                                                                throw bvu.a(oov2);
                                                            }
                                                            bl2 = t9d2.v0f;
                                                            if (n == 0) break block19;
                                                        }
                                                        catch (oov oov3) {
                                                            throw bvu.a(oov3);
                                                        }
                                                        if (bl2) break block20;
                                                    }
                                                    catch (oov oov4) {
                                                        throw bvu.a(oov4);
                                                    }
                                                    zfz2 = zfz3;
                                                    if (n == 0) break block21;
                                                }
                                                catch (oov oov5) {
                                                    throw bvu.a(oov5);
                                                }
                                                if (!(zfz2.r_y() instanceof y0y)) break block22;
                                            }
                                            catch (oov oov6) {
                                                throw bvu.a(oov6);
                                            }
                                            zfz2 = zfz3;
                                        }
                                        catch (oov oov7) {
                                            throw bvu.a(oov7);
                                        }
                                    }
                                    y0y$_zr = (y0y$_zr)((Object)zfz2.dil(((y0y)zfz3.r_y()).fvr()));
                                    break block24;
                                }
                                y0y$_zr = y0y$_zr.ipg;
                            }
                            y0y$_zr y0y$_zr2 = y0y$_zr;
                            double d = 0.0;
                            if (y0y$_zr2.t1s()) {
                                d = 0.5;
                            }
                            _f32 = _f3._cl(t9d2, (double)mew2.getX() + 0.5, (double)mew2.getY() + 0.0625 + d, (double)mew2.getZ() + 0.5, this.c9z);
                            try {
                                try {
                                    bl3 = erg2.x4w();
                                    if (n == 0) break block20;
                                    if (!bl3) break block23;
                                }
                                catch (oov oov8) {
                                    throw bvu.a(oov8);
                                }
                                _f32.x84(erg2.zow());
                            }
                            catch (oov oov9) {
                                throw bvu.a(oov9);
                            }
                        }
                        bl3 = t9d2.xzq(_f32);
                    }
                    --erg2.qd2;
                    bl2 = true;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    public static _f3$c3d l02(bvu bvu2) {
        return bvu2.c9z;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

