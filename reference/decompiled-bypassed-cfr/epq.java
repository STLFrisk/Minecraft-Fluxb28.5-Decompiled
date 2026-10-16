/*
 * Decompiled with CFR 0.152.
 */
public class epq
extends cjm {
    public yqv y2h;
    public g_3 sca;
    public float l8r;

    public epq(yqv yqv2, float f) {
        this.y2h = yqv2;
        this.l8r = f;
        this.k23(5);
    }

    @Override
    public boolean vle() {
        double d;
        block27: {
            block23: {
                block28: {
                    int n;
                    block25: {
                        block26: {
                            block24: {
                                block22: {
                                    epq epq2;
                                    block20: {
                                        block21: {
                                            n = t9d.c();
                                            try {
                                                try {
                                                    this.sca = this.y2h.q4v();
                                                    epq2 = this;
                                                    if (n != 0) break block20;
                                                    if (epq2.sca != null) break block21;
                                                }
                                                catch (oov oov2) {
                                                    throw epq.a(oov2);
                                                }
                                                return false;
                                            }
                                            catch (oov oov3) {
                                                throw epq.a(oov3);
                                            }
                                        }
                                        epq2 = this;
                                    }
                                    double d2 = epq2.y2h.wxg(this.sca);
                                    try {
                                        try {
                                            double d3 = d2 - 4.0;
                                            d = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                                            if (n != 0) break block22;
                                            if (d < 0) break block23;
                                        }
                                        catch (oov oov4) {
                                            throw epq.a(oov4);
                                        }
                                        double d4 = d2 - 16.0;
                                        d = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                                    }
                                    catch (oov oov5) {
                                        throw epq.a(oov5);
                                    }
                                }
                                try {
                                    try {
                                        if (n != 0) break block24;
                                        if (d > 0) break block23;
                                    }
                                    catch (oov oov6) {
                                        throw epq.a(oov6);
                                    }
                                    d = (double)this.y2h.lfk;
                                }
                                catch (oov oov7) {
                                    throw epq.a(oov7);
                                }
                            }
                            try {
                                try {
                                    if (n != 0) break block25;
                                    if (d != false) break block26;
                                }
                                catch (oov oov8) {
                                    throw epq.a(oov8);
                                }
                                d = 0.0;
                                break block27;
                            }
                            catch (oov oov9) {
                                throw epq.a(oov9);
                            }
                        }
                        d = this.y2h.mbr().nextInt(5);
                    }
                    try {
                        try {
                            if (n != 0) break block27;
                            if (d != false) break block28;
                        }
                        catch (oov oov10) {
                            throw epq.a(oov10);
                        }
                        d = 1.0;
                        break block27;
                    }
                    catch (oov oov11) {
                        throw epq.a(oov11);
                    }
                }
                d = 0.0;
                break block27;
            }
            d = 0.0;
        }
        return (boolean)d;
    }

    @Override
    public boolean wh3() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = this.y2h.lfk;
                    if (n != 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw epq.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void mnp() {
        double d = this.sca.o2v - this.y2h.o2v;
        double d2 = this.sca.vbd - this.y2h.vbd;
        float f = fe6.dii(d * d + d2 * d2);
        this.y2h.icv += d / (double)f * 0.5 * (double)0.8f + this.y2h.icv * (double)0.2f;
        this.y2h.bw4 += d2 / (double)f * 0.5 * (double)0.8f + this.y2h.bw4 * (double)0.2f;
        this.y2h.mop = this.l8r;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

