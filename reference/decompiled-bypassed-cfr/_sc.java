/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class _sc
extends rrw {
    public _sc() {
        float f = 0.5f;
        float f2 = 0.015625f;
        this.xl4(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f2, 0.5f + f);
        this.i3l(uja.qqf);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void c76(t9d var1_1, mew var2_2, zfz var3_3, nh4 var4_4, List var5_5, i2h var6_6) {
        block7: {
            block6: {
                var7_7 = t9d.c();
                try {
                    v0 = var6_6;
                    if (var7_7 != 0) break block6;
                    if (v0 != null) {
                    }
                    ** GOTO lbl14
                }
                catch (oov v1) {
                    throw _sc.a(v1);
                }
                v0 = var6_6;
            }
            try {
                if (v0 instanceof w54) break block7;
lbl14:
                // 2 sources

                super.c76(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
            }
            catch (oov v2) {
                throw _sc.a(v2);
            }
        }
    }

    @Override
    public nh4 m__(t9d t9d2, mew mew2, zfz zfz2) {
        return new nh4((double)mew2.getX() + this.d80, (double)mew2.getY() + this.tcq, (double)mew2.getZ() + this.iac, (double)mew2.getX() + this.smy, (double)mew2.getY() + this.lpg, (double)mew2.getZ() + this.nlu);
    }

    @Override
    public int ldy() {
        return 7455580;
    }

    @Override
    public int ieb(zfz zfz2) {
        return 7455580;
    }

    @Override
    public int j24(m5n m5n2, mew mew2, int n) {
        return 2129968;
    }

    @Override
    public boolean ib4(e0x e0x2) {
        boolean bl;
        try {
            bl = e0x2 == ox_.gdz;
        }
        catch (oov oov2) {
            throw _sc.a(oov2);
        }
        return bl;
    }

    @Override
    public boolean _h0(t9d t9d2, mew mew2, zfz zfz2) {
        int n;
        block12: {
            block13: {
                int n2;
                block16: {
                    block15: {
                        zfz zfz3;
                        int n3;
                        block14: {
                            n3 = t9d.b();
                            try {
                                try {
                                    try {
                                        n = mew2.getY();
                                        if (n3 == 0) break block12;
                                        if (n < 0) break block13;
                                    }
                                    catch (oov oov2) {
                                        throw _sc.a(oov2);
                                    }
                                    n = mew2.getY();
                                    if (n3 == 0) break block12;
                                }
                                catch (oov oov3) {
                                    throw _sc.a(oov3);
                                }
                                if (n >= 256) break block13;
                            }
                            catch (oov oov4) {
                                throw _sc.a(oov4);
                            }
                            zfz zfz4 = t9d2.getBlockState(mew2.eve());
                            try {
                                try {
                                    zfz3 = zfz4;
                                    if (n3 == 0) break block14;
                                    if (zfz3.r_y().p1r() != p3y.six) break block15;
                                }
                                catch (oov oov5) {
                                    throw _sc.a(oov5);
                                }
                                zfz3 = zfz4;
                            }
                            catch (oov oov6) {
                                throw _sc.a(oov6);
                            }
                        }
                        try {
                            n2 = (Integer)zfz3.dil(hmv.nfg);
                            if (n3 == 0) break block16;
                            if (n2 != 0) break block15;
                        }
                        catch (oov oov7) {
                            throw _sc.a(oov7);
                        }
                        n2 = 1;
                        break block16;
                    }
                    n2 = 0;
                }
                return n2 != 0;
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public int hvp(zfz zfz2) {
        return 0;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

