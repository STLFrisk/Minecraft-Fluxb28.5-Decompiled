/*
 * Decompiled with CFR 0.152.
 */
public class c9p$kdw
extends cjm {
    private c9p rcl;
    private int oqy;

    public c9p$kdw(c9p c9p2) {
        this.rcl = c9p2;
        this.k23(3);
    }

    @Override
    public boolean vle() {
        boolean bl;
        block6: {
            block5: {
                g_3 g_32;
                int n;
                block4: {
                    n = t9d.b();
                    g_3 g_33 = this.rcl.q4v();
                    try {
                        g_32 = g_33;
                        if (n == 0) break block4;
                        if (g_32 == null) break block5;
                    }
                    catch (oov oov2) {
                        throw c9p$kdw.a(oov2);
                    }
                    g_32 = g_33;
                }
                try {
                    bl = g_32.gzr();
                    if (n == 0) break block6;
                    if (!bl) break block5;
                }
                catch (oov oov3) {
                    throw c9p$kdw.a(oov3);
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public boolean wh3() {
        int n;
        block12: {
            block11: {
                block13: {
                    int n2;
                    block10: {
                        n2 = t9d.b();
                        try {
                            try {
                                n = super.wh3();
                                if (n2 == 0) break block10;
                                if (n == 0) break block11;
                            }
                            catch (oov oov2) {
                                throw c9p$kdw.a(oov2);
                            }
                            n = this.rcl.mzk();
                        }
                        catch (oov oov3) {
                            throw c9p$kdw.a(oov3);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n2 == 0) break block12;
                                if (n != 0) break block13;
                            }
                            catch (oov oov4) {
                                throw c9p$kdw.a(oov4);
                            }
                            double d = this.rcl.wxg(this.rcl.q4v()) - 9.0;
                            n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                            if (n2 == 0) break block12;
                        }
                        catch (oov oov5) {
                            throw c9p$kdw.a(oov5);
                        }
                        if (n <= 0) break block11;
                    }
                    catch (oov oov6) {
                        throw c9p$kdw.a(oov6);
                    }
                }
                n = 1;
                break block12;
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public void mnp() {
        this.oqy = -10;
        this.rcl.zq2().pj2();
        this.rcl.ph8().rz3(this.rcl.q4v(), 90.0f, 90.0f);
        this.rcl.u19 = true;
    }

    @Override
    public void zly() {
        c9p.bf5(this.rcl, 0);
        this.rcl.ux8(null);
        c9p.ggu(this.rcl).x6d();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void iad() {
        block28: {
            block37: {
                block31: {
                    block32: {
                        block35: {
                            block36: {
                                block33: {
                                    block34: {
                                        block29: {
                                            block26: {
                                                var2_1 = this.rcl.q4v();
                                                v0 = t9d.b();
                                                this.rcl.zq2().pj2();
                                                var1_2 = v0;
                                                try {
                                                    block27: {
                                                        try {
                                                            try {
                                                                this.rcl.ph8().rz3(var2_1, 90.0f, 90.0f);
                                                                v1 = this.rcl.gq6(var2_1);
                                                                if (var1_2 == 0) break block26;
                                                                if (v1 != 0) break block27;
                                                            }
                                                            catch (oov v2) {
                                                                throw c9p$kdw.a(v2);
                                                            }
                                                            this.rcl.ux8(null);
                                                            if (var1_2 != 0) break block28;
                                                        }
                                                        catch (oov v3) {
                                                            throw c9p$kdw.a(v3);
                                                        }
                                                    }
                                                    v1 = ++this.oqy;
                                                }
                                                catch (oov v4) {
                                                    throw c9p$kdw.a(v4);
                                                }
                                            }
                                            try {
                                                block30: {
                                                    try {
                                                        try {
                                                            if (var1_2 == 0) break block29;
                                                            if (v1 != 0) break block30;
                                                        }
                                                        catch (oov v5) {
                                                            throw c9p$kdw.a(v5);
                                                        }
                                                        c9p.bf5(this.rcl, this.rcl.q4v().jwu());
                                                        this.rcl.oay.qyn(this.rcl, (byte)21);
                                                        if (var1_2 != 0) break block31;
                                                    }
                                                    catch (oov v6) {
                                                        throw c9p$kdw.a(v6);
                                                    }
                                                }
                                                v1 = this.oqy;
                                            }
                                            catch (oov v7) {
                                                throw c9p$kdw.a(v7);
                                            }
                                        }
                                        try {
                                            v8 = this.rcl.y3s();
                                            if (var1_2 == 0) break block32;
                                            if (v1 >= v8) {
                                            }
                                            ** GOTO lbl85
                                        }
                                        catch (oov v9) {
                                            throw c9p$kdw.a(v9);
                                        }
                                        var3_3 = 1.0f;
                                        try {
                                            v10 = this.rcl;
                                            if (var1_2 == 0) break block33;
                                            if (v10.oay.rbk() != v66.csg) break block34;
                                        }
                                        catch (oov v11) {
                                            throw c9p$kdw.a(v11);
                                        }
                                        var3_3 += 2.0f;
                                    }
                                    v10 = this.rcl;
                                }
                                try {
                                    v12 = v10.mzk();
                                    if (var1_2 == 0) break block35;
                                    if (!v12) break block36;
                                }
                                catch (oov v13) {
                                    throw c9p$kdw.a(v13);
                                }
                                var3_3 += 2.0f;
                            }
                            var2_1.m1t(ofh.zj0(this.rcl, this.rcl), var3_3);
                            v12 = var2_1.m1t(ofh.kun(this.rcl), (float)this.rcl.dgt(m6d.y3f).nz5());
                        }
                        try {
                            try {
                                this.rcl.ux8(null);
                                if (var1_2 != 0) break block31;
lbl85:
                                // 2 sources

                                v14 = this;
                                if (var1_2 == 0) break block37;
                            }
                            catch (oov v15) {
                                throw c9p$kdw.a(v15);
                            }
                            v1 = v14.oqy;
                            v8 = 60;
                        }
                        catch (oov v16) {
                            throw c9p$kdw.a(v16);
                        }
                    }
                    try {
                        if (v1 >= v8 && this.oqy % 20 == 0) {
                            // empty if block
                        }
                    }
                    catch (oov v17) {
                        throw c9p$kdw.a(v17);
                    }
                }
                v14 = this;
            }
            super.iad();
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

