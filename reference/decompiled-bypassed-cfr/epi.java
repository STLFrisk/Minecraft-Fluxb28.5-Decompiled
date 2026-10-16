/*
 * Decompiled with CFR 0.152.
 */
public class epi
extends flo {
    private /* synthetic */ i2h bsh;
    private /* synthetic */ int hhd;
    private /* synthetic */ int cw3;
    private /* synthetic */ w_0 b_8;

    public epi(t9d t9d2, i2h i2h2, w_0 w_02) {
        super(t9d2, i2h2.o2v, i2h2.aaw().bx_ + (double)(i2h2.ikl / 2.0f), i2h2.vbd, i2h2.icv, i2h2.mop, i2h2.bw4);
        this.bsh = i2h2;
        this.cw3 = 3;
        this.b_8 = w_02;
        this.xx_();
    }

    @Override
    public void oss(q3g q3g2, i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    @Override
    public void xx_() {
        block13: {
            epi epi2;
            block12: {
                int n;
                block10: {
                    int n2 = t9d.c();
                    int n3 = 0;
                    while (n3 < 16) {
                        block9: {
                            block11: {
                                double d = this.z2d.nextFloat() * 2.0f - 1.0f;
                                double d2 = this.z2d.nextFloat() * 2.0f - 1.0f;
                                double d3 = this.z2d.nextFloat() * 2.0f - 1.0f;
                                try {
                                    try {
                                        if (n2 != 0) break block9;
                                        double d4 = d * d + d2 * d2 + d3 * d3 - 1.0;
                                        n = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                                        if (n2 != 0) break block10;
                                    }
                                    catch (oov oov2) {
                                        throw epi.a(oov2);
                                    }
                                    if (n > 0) break block11;
                                }
                                catch (oov oov3) {
                                    throw epi.a(oov3);
                                }
                                double d5 = this.bsh.o2v + d * (double)this.bsh.uo6 / 4.0;
                                double d6 = this.bsh.aaw().bx_ + (double)(this.bsh.ikl / 2.0f) + d2 * (double)this.bsh.ikl / 4.0;
                                double d7 = this.bsh.vbd + d3 * (double)this.bsh.uo6 / 4.0;
                                this.oay.h2r(this.b_8, false, d5, d6, d7, d, d2 + 0.2, d3, new int[0]);
                            }
                            ++n3;
                        }
                        if (n2 == 0) continue;
                    }
                    try {
                        ++this.hhd;
                        epi2 = this;
                        if (n2 != 0) break block12;
                        n = epi2.hhd;
                    }
                    catch (oov oov4) {
                        throw epi.a(oov4);
                    }
                }
                try {
                    if (n < this.cw3) break block13;
                    epi2 = this;
                }
                catch (oov oov5) {
                    throw epi.a(oov5);
                }
            }
            epi2._kl();
        }
    }

    @Override
    public int ikr() {
        return 3;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

