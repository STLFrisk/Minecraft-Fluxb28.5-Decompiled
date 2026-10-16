/*
 * Decompiled with CFR 0.152.
 */
public class dur
extends xg0 {
    public dur(t9d t9d2) {
        super(t9d2);
    }

    public dur(t9d t9d2, g_3 g_32) {
        super(t9d2, g_32);
    }

    public dur(t9d t9d2, double d, double d2, double d3) {
        super(t9d2, d, d2, d3);
    }

    @Override
    public void _7u(akm akm2) {
        block28: {
            dur dur2;
            block29: {
                int n;
                block24: {
                    int n2;
                    int n3;
                    block26: {
                        int n4;
                        block27: {
                            int n5;
                            block25: {
                                block23: {
                                    block22: {
                                        i2h i2h2;
                                        block21: {
                                            n = t9d.b();
                                            try {
                                                try {
                                                    i2h2 = akm2.sc8;
                                                    if (n == 0) break block21;
                                                    if (i2h2 == null) break block22;
                                                }
                                                catch (oov oov2) {
                                                    throw dur.a(oov2);
                                                }
                                                i2h2 = akm2.sc8;
                                            }
                                            catch (oov oov3) {
                                                throw dur.a(oov3);
                                            }
                                        }
                                        i2h2.m1t(ofh.lr9(this, this.lmd()), 0.0f);
                                    }
                                    try {
                                        try {
                                            n5 = this.oay.v0f;
                                            if (n == 0) break block23;
                                            if (n5 != 0) break block24;
                                        }
                                        catch (oov oov4) {
                                            throw dur.a(oov4);
                                        }
                                        n5 = this.z2d.nextInt(8);
                                    }
                                    catch (oov oov5) {
                                        throw dur.a(oov5);
                                    }
                                }
                                try {
                                    if (n == 0) break block25;
                                    if (n5 != 0) break block24;
                                }
                                catch (oov oov6) {
                                    throw dur.a(oov6);
                                }
                                n5 = 1;
                            }
                            n3 = n5;
                            try {
                                n4 = this.z2d.nextInt(32);
                                if (n == 0) break block26;
                                if (n4 != 0) break block27;
                            }
                            catch (oov oov7) {
                                throw dur.a(oov7);
                            }
                            n3 = 4;
                        }
                        n4 = n2 = 0;
                    }
                    while (n2 < n3) {
                        n78 n782 = new n78(this.oay);
                        n782.mr2(-24000);
                        n782.x24(this.o2v, this.kfp, this.vbd, this.x5k, 0.0f);
                        this.oay.xzq(n782);
                        ++n2;
                        if (n != 0) continue;
                    }
                }
                double d = 0.08;
                for (int i = 0; i < 8; ++i) {
                    try {
                        this.oay.zvy(w_0.ips, this.o2v, this.kfp, this.vbd, ((double)this.z2d.nextFloat() - 0.5) * 0.08, ((double)this.z2d.nextFloat() - 0.5) * 0.08, ((double)this.z2d.nextFloat() - 0.5) * 0.08, new int[]{u7m._lo(xbr.ipl)});
                        if (n != 0) {
                            if (n != 0) continue;
                            break;
                        }
                        break block28;
                    }
                    catch (oov oov8) {
                        throw dur.a(oov8);
                    }
                }
                try {
                    try {
                        dur2 = this;
                        if (n == 0) break block29;
                        if (dur2.oay.v0f) break block28;
                    }
                    catch (oov oov9) {
                        throw dur.a(oov9);
                    }
                    dur2 = this;
                }
                catch (oov oov10) {
                    throw dur.a(oov10);
                }
            }
            dur2._kl();
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

