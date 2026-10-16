/*
 * Decompiled with CFR 0.152.
 */
public class cjz
extends flo {
    public float vv5;

    public cjz(t9d t9d2, double d, double d2, double d3, double d4, double d5, double d6) {
        this(t9d2, d, d2, d3, d4, d5, d6, 2.0f);
    }

    public cjz(t9d t9d2, double d, double d2, double d3, double d4, double d5, double d6, float f) {
        super(t9d2, d, d2, d3, 0.0, 0.0, 0.0);
        this.icv *= (double)0.01f;
        this.mop *= (double)0.01f;
        this.bw4 *= (double)0.01f;
        this.mop += 0.1;
        this.ysq *= 0.75f;
        this.ysq *= f;
        this.vv5 = this.ysq;
        this.bx4 = 16;
        this.kvx = false;
        this.f0l(80);
    }

    @Override
    public void oss(q3g q3g2, i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.goc + f) / (float)this.bx4 * 32.0f;
        f7 = fe6._f3(f7, 0.0f, 1.0f);
        this.ysq = this.vv5 * f7;
        super.oss(q3g2, i2h2, f, f2, f3, f4, f5, f6);
    }

    @Override
    public void xx_() {
        block17: {
            block16: {
                cjz cjz2;
                int n;
                block14: {
                    int n2;
                    block15: {
                        block12: {
                            block13: {
                                this.bc1 = this.o2v;
                                this.o_z = this.kfp;
                                n2 = t9d.c();
                                try {
                                    try {
                                        this.a4d = this.vbd;
                                        int n3 = this.goc;
                                        n = n3;
                                        this.goc = n3 + 1;
                                        if (n2 != 0) break block12;
                                        if (n < this.bx4) break block13;
                                    }
                                    catch (oov oov2) {
                                        throw cjz.a(oov2);
                                    }
                                    this._kl();
                                }
                                catch (oov oov3) {
                                    throw cjz.a(oov3);
                                }
                            }
                            this.vjj(this.icv, this.mop, this.bw4);
                            double d = this.kfp - this.o_z;
                            n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                        }
                        try {
                            try {
                                if (n2 != 0) break block14;
                                if (n != 0) break block15;
                            }
                            catch (oov oov4) {
                                throw cjz.a(oov4);
                            }
                            this.icv *= 1.1;
                            this.bw4 *= 1.1;
                        }
                        catch (oov oov5) {
                            throw cjz.a(oov5);
                        }
                    }
                    try {
                        this.icv *= (double)0.86f;
                        this.mop *= (double)0.86f;
                        this.bw4 *= (double)0.86f;
                        cjz2 = this;
                        if (n2 != 0) break block16;
                        n = cjz2.lfk ? 1 : 0;
                    }
                    catch (oov oov6) {
                        throw cjz.a(oov6);
                    }
                }
                try {
                    if (n == 0) break block17;
                    this.icv *= (double)0.7f;
                    cjz2 = this;
                }
                catch (oov oov7) {
                    throw cjz.a(oov7);
                }
            }
            cjz2.bw4 *= (double)0.7f;
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

