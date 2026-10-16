/*
 * Decompiled with CFR 0.152.
 */
public class e3x
extends znt {
    public e3x() {
        super(p3y.s8e, false, _mi.g21);
        this.i3l(uja.qqf);
        this.t50 = 0.8f;
    }

    @Override
    public w51 w3x() {
        return w51.mem;
    }

    @Override
    public void b2c(t9d t9d2, mew mew2, i2h i2h2, float f) {
        block8: {
            i2h i2h3;
            block6: {
                int n = t9d.c();
                try {
                    block7: {
                        try {
                            try {
                                i2h3 = i2h2;
                                if (n != 0) break block6;
                                if (!i2h3.hzv()) break block7;
                            }
                            catch (oov oov2) {
                                throw e3x.a(oov2);
                            }
                            super.b2c(t9d2, mew2, i2h2, f);
                            if (n == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw e3x.a(oov3);
                        }
                    }
                    i2h3 = i2h2;
                }
                catch (oov oov4) {
                    throw e3x.a(oov4);
                }
            }
            i2h3.ibc(f, 0.0f);
        }
    }

    @Override
    public void r2j(t9d t9d2, i2h i2h2) {
        block12: {
            block13: {
                i2h i2h3;
                int n;
                block10: {
                    int n2 = t9d.c();
                    try {
                        try {
                            block11: {
                                try {
                                    try {
                                        n = i2h2.hzv();
                                        if (n2 != 0) break block10;
                                        if (n == 0) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw e3x.a(oov2);
                                    }
                                    super.r2j(t9d2, i2h2);
                                    if (n2 == 0) break block12;
                                }
                                catch (oov oov3) {
                                    throw e3x.a(oov3);
                                }
                            }
                            i2h3 = i2h2;
                            if (n2 != 0) break block13;
                        }
                        catch (oov oov4) {
                            throw e3x.a(oov4);
                        }
                        double d = i2h3.mop - 0.0;
                        n = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                    }
                    catch (oov oov5) {
                        throw e3x.a(oov5);
                    }
                }
                if (n >= 0) break block12;
                i2h3 = i2h2;
            }
            i2h3.mop = -i2h2.mop;
        }
    }

    @Override
    public void xqy(t9d t9d2, mew mew2, i2h i2h2) {
        block6: {
            double d;
            block5: {
                int n = t9d.b();
                try {
                    try {
                        double d2 = Math.abs(i2h2.mop) - 0.1;
                        d = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                        if (n == 0) break block5;
                        if (d >= 0) break block6;
                    }
                    catch (oov oov2) {
                        throw e3x.a(oov2);
                    }
                    d = (double)i2h2.hzv();
                }
                catch (oov oov3) {
                    throw e3x.a(oov3);
                }
            }
            if (d == false) {
                double d3 = 0.4 + Math.abs(i2h2.mop) * 0.2;
                i2h2.icv *= d3;
                i2h2.bw4 *= d3;
            }
        }
        super.xqy(t9d2, mew2, i2h2);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

