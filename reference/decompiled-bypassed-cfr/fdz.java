/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class fdz
extends znt {
    public fdz() {
        super(p3y.b8s, false);
        this.t50 = 0.98f;
        this._p_(true);
        this.i3l(uja.mqu);
    }

    @Override
    public w51 w3x() {
        return w51.mem;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void i4u(t9d var1_1, ha9 var2_2, mew var3_3, zfz var4_4, pyk var5_5) {
        block26: {
            block27: {
                block28: {
                    block25: {
                        var2_2.aex(l9p.hf_[e0x.mxb(this)]);
                        v0 = t9d.b();
                        var2_2.i8a(0.025f);
                        var6_6 = v0;
                        try {
                            try {
                                try {
                                    v1 = this.row();
                                    if (var6_6 == 0) break block25;
                                    if (v1 != 0) {
                                    }
                                    ** GOTO lbl35
                                }
                                catch (oov v2) {
                                    throw fdz.a(v2);
                                }
                                v1 = hc0.ejq(var2_2);
                                if (var6_6 == 0) break block25;
                            }
                            catch (oov v3) {
                                throw fdz.a(v3);
                            }
                            if (v1 != 0) {
                            }
                            ** GOTO lbl35
                        }
                        catch (oov v4) {
                            throw fdz.a(v4);
                        }
                        var7_7 = this.b4a(var4_4);
                        try {
                            if (var7_7 != null) {
                                fdz.ymu(var1_1, var3_3, var7_7);
                            }
                        }
                        catch (oov v5) {
                            throw fdz.a(v5);
                        }
                        try {
                            if (var6_6 != 0) break block26;
lbl35:
                            // 3 sources

                            v1 = var1_1.vzz.yz2();
                        }
                        catch (oov v6) {
                            throw fdz.a(v6);
                        }
                    }
                    try {
                        try {
                            if (var6_6 == 0) break block27;
                            if (v1 == 0) break block28;
                        }
                        catch (oov v7) {
                            throw fdz.a(v7);
                        }
                        var1_1.i6x(var3_3);
                        return;
                    }
                    catch (oov v8) {
                        throw fdz.a(v8);
                    }
                }
                v1 = hc0.ajj(var2_2);
            }
            var7_8 = v1;
            this.lf0(var1_1, var3_3, var4_4, var7_8);
            var8_9 = var1_1.getBlockState(var3_3.eve()).r_y().p1r();
            try {
                block29: {
                    try {
                        try {
                            try {
                                v9 = var8_9.c3t();
                                if (var6_6 == 0) break block26;
                                if (v9) break block29;
                            }
                            catch (oov v10) {
                                throw fdz.a(v10);
                            }
                            v9 = var8_9.l7j();
                            if (var6_6 == 0) break block26;
                        }
                        catch (oov v11) {
                            throw fdz.a(v11);
                        }
                        if (!v9) break block26;
                    }
                    catch (oov v12) {
                        throw fdz.a(v12);
                    }
                }
                v9 = var1_1.gfy(var3_3, ox_.whp.l4i());
            }
            catch (oov v13) {
                throw fdz.a(v13);
            }
        }
    }

    @Override
    public int bzr(Random random) {
        return 0;
    }

    @Override
    public void zvy(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        block11: {
            int n;
            int n2;
            block10: {
                n2 = t9d.c();
                try {
                    try {
                        n = t9d2.qkq(qe5.lm8, mew2);
                        if (n2 != 0) break block10;
                        if (n <= 11 - this.uhw()) break block11;
                    }
                    catch (oov oov2) {
                        throw fdz.a(oov2);
                    }
                    n = t9d2.vzz.yz2() ? 1 : 0;
                }
                catch (oov oov3) {
                    throw fdz.a(oov3);
                }
            }
            try {
                block12: {
                    try {
                        try {
                            if (n2 != 0) break block11;
                            if (n == 0) break block12;
                        }
                        catch (oov oov4) {
                            throw fdz.a(oov4);
                        }
                        t9d2.i6x(mew2);
                        if (n2 == 0) break block11;
                    }
                    catch (oov oov5) {
                        throw fdz.a(oov5);
                    }
                }
                this.lf0(t9d2, mew2, t9d2.getBlockState(mew2), 0);
                n = t9d2.gfy(mew2, ox_.gdz.l4i()) ? 1 : 0;
            }
            catch (oov oov6) {
                throw fdz.a(oov6);
            }
        }
    }

    @Override
    public int quv() {
        return 0;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

