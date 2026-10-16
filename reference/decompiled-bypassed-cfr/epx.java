/*
 * Decompiled with CFR 0.152.
 */
public class epx
extends zvv {
    private /* synthetic */ mew one;

    public epx(yqv yqv2, t9d t9d2) {
        super(yqv2, t9d2);
    }

    @Override
    public t_2 ty_(mew mew2) {
        this.one = mew2;
        return super.ty_(mew2);
    }

    @Override
    public t_2 n4j(i2h i2h2) {
        this.one = new mew(i2h2);
        return super.n4j(i2h2);
    }

    @Override
    public boolean p6m(i2h i2h2, double d) {
        block4: {
            block5: {
                int n = t9d.b();
                t_2 t_22 = this.n4j(i2h2);
                try {
                    try {
                        if (n == 0) break block4;
                        if (t_22 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw epx.a(oov2);
                    }
                    return this.sh7(t_22, d);
                }
                catch (oov oov3) {
                    throw epx.a(oov3);
                }
            }
            this.one = new mew(i2h2);
            this.mlw = d;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void vr1() {
        block28: {
            block30: {
                block31: {
                    block29: {
                        block26: {
                            var1_1 = t9d.c();
                            try {
                                block27: {
                                    try {
                                        try {
                                            v0 = this;
                                            if (var1_1 != 0) break block26;
                                            if (v0.j07()) break block27;
                                        }
                                        catch (oov v1) {
                                            throw epx.a(v1);
                                        }
                                        super.vr1();
                                        if (var1_1 == 0) break block28;
                                    }
                                    catch (oov v2) {
                                        throw epx.a(v2);
                                    }
                                }
                                v0 = this;
                            }
                            catch (oov v3) {
                                throw epx.a(v3);
                            }
                        }
                        try {
                            try {
                                if (var1_1 != 0) break block29;
                                if (v0.one == null) break block28;
                            }
                            catch (oov v4) {
                                throw epx.a(v4);
                            }
                            v0 = this;
                        }
                        catch (oov v5) {
                            throw epx.a(v5);
                        }
                    }
                    var2_2 = v0.wxo.uo6 * this.wxo.uo6;
                    try {
                        block32: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                v6 = this;
                                                if (var1_1 != 0) break block30;
                                                if (v6.wxo.x4g(this.one) >= var2_2) {
                                                }
                                                ** GOTO lbl77
                                            }
                                            catch (oov v7) {
                                                throw epx.a(v7);
                                            }
                                            v8 = this.wxo;
                                            if (var1_1 != 0) break block31;
                                        }
                                        catch (oov v9) {
                                            throw epx.a(v9);
                                        }
                                        if (v8.kfp <= (double)this.one.getY()) break block32;
                                    }
                                    catch (oov v10) {
                                        throw epx.a(v10);
                                    }
                                    v6 = this;
                                    if (var1_1 != 0) break block30;
                                }
                                catch (oov v11) {
                                    throw epx.a(v11);
                                }
                                v12 = new mew(this.one.getX(), fe6.jqf(this.wxo.kfp), this.one.getZ());
                                if (v6.wxo.x4g(v12) >= var2_2) {
                                }
                                ** GOTO lbl77
                            }
                            catch (oov v13) {
                                throw epx.a(v13);
                            }
                        }
                        v8 = this.wxo;
                    }
                    catch (oov v14) {
                        throw epx.a(v14);
                    }
                }
                try {
                    v8.gvh().n5p(this.one.getX(), this.one.getY(), this.one.getZ(), this.mlw);
                    if (var1_1 == 0) break block28;
lbl77:
                    // 3 sources

                    v6 = this;
                }
                catch (oov v15) {
                    throw epx.a(v15);
                }
            }
            v6.one = null;
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

