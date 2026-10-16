/*
 * Decompiled with CFR 0.152.
 */
public class etr
extends flo {
    public etr(t9d t9d2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(t9d2, d, d2, d3, d4, d5, d6);
        this.aeh = 1.0f;
        this.li4 = 1.0f;
        this.v5a = 1.0f;
        this.f0l(32);
        this.yxc(0.02f, 0.02f);
        this.ysq *= this.z2d.nextFloat() * 0.6f + 0.2f;
        this.icv = d4 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.mop = d5 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.bw4 = d6 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.bx4 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void xx_() {
        block11: {
            etr etr2;
            block10: {
                int n;
                block8: {
                    block9: {
                        this.bc1 = this.o2v;
                        this.o_z = this.kfp;
                        this.a4d = this.vbd;
                        this.mop += 0.002;
                        int n2 = t9d.b();
                        this.vjj(this.icv, this.mop, this.bw4);
                        this.icv *= (double)0.85f;
                        this.mop *= (double)0.85f;
                        this.bw4 *= (double)0.85f;
                        n = n2;
                        try {
                            try {
                                etr2 = this;
                                if (n == 0) break block8;
                                if (etr2.oay.getBlockState(new mew(this)).r_y().p1r() == p3y.six) break block9;
                            }
                            catch (oov oov2) {
                                throw etr.a(oov2);
                            }
                            this._kl();
                        }
                        catch (oov oov3) {
                            throw etr.a(oov3);
                        }
                    }
                    etr2 = this;
                }
                try {
                    try {
                        if (n == 0) break block10;
                        if (etr2.bx4-- > 0) break block11;
                    }
                    catch (oov oov4) {
                        throw etr.a(oov4);
                    }
                    etr2 = this;
                }
                catch (oov oov5) {
                    throw etr.a(oov5);
                }
            }
            etr2._kl();
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

