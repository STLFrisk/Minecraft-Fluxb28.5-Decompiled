/*
 * Decompiled with CFR 0.152.
 */
public class _7e
extends cjm {
    public t9d cw2;
    public yqv hxc;
    public g_3 mgs;
    public int eej;

    public _7e(yqv yqv2) {
        this.hxc = yqv2;
        this.cw2 = yqv2.oay;
        this.k23(3);
    }

    @Override
    public boolean vle() {
        block4: {
            g_3 g_32;
            block5: {
                int n = t9d.b();
                g_32 = this.hxc.q4v();
                try {
                    try {
                        if (n == 0) break block4;
                        if (g_32 != null) break block5;
                    }
                    catch (oov oov2) {
                        throw _7e.a(oov2);
                    }
                    return false;
                }
                catch (oov oov3) {
                    throw _7e.a(oov3);
                }
            }
            this.mgs = g_32;
        }
        return true;
    }

    @Override
    public boolean wh3() {
        int n;
        block16: {
            block20: {
                block19: {
                    int n2;
                    block17: {
                        block18: {
                            block14: {
                                block15: {
                                    n2 = t9d.b();
                                    try {
                                        try {
                                            n = this.mgs.gzr();
                                            if (n2 == 0) break block14;
                                            if (n != 0) break block15;
                                        }
                                        catch (oov oov2) {
                                            throw _7e.a(oov2);
                                        }
                                        n = 0;
                                        break block16;
                                    }
                                    catch (oov oov3) {
                                        throw _7e.a(oov3);
                                    }
                                }
                                double d = this.hxc.wxg(this.mgs) - 225.0;
                                n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                            }
                            try {
                                try {
                                    if (n2 == 0) break block17;
                                    if (n <= 0) break block18;
                                }
                                catch (oov oov4) {
                                    throw _7e.a(oov4);
                                }
                                n = 0;
                                break block16;
                            }
                            catch (oov oov5) {
                                throw _7e.a(oov5);
                            }
                        }
                        n = this.hxc.zq2().j07() ? 1 : 0;
                    }
                    try {
                        try {
                            try {
                                if (n2 == 0) break block16;
                                if (n == 0) break block19;
                            }
                            catch (oov oov6) {
                                throw _7e.a(oov6);
                            }
                            n = this.vle() ? 1 : 0;
                            if (n2 == 0) break block16;
                        }
                        catch (oov oov7) {
                            throw _7e.a(oov7);
                        }
                        if (n == 0) break block20;
                    }
                    catch (oov oov8) {
                        throw _7e.a(oov8);
                    }
                }
                n = 1;
                break block16;
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public void zly() {
        this.mgs = null;
        this.hxc.zq2().pj2();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void iad() {
        block24: {
            block23: {
                block22: {
                    block21: {
                        block20: {
                            this.hxc.ph8().rz3(this.mgs, 30.0f, 30.0f);
                            var2_1 = this.hxc.uo6 * 2.0f * this.hxc.uo6 * 2.0f;
                            var4_2 = this.hxc.p53(this.mgs.o2v, this.mgs.aaw().bx_, this.mgs.vbd);
                            var6_3 = 0.8;
                            var1_4 = t9d.c();
                            try {
                                try {
                                    try {
                                        v0 = var4_2 == var2_1 ? 0 : (var4_2 > var2_1 ? 1 : -1);
                                        if (var1_4 != 0) break block20;
                                        if (v0 > 0) {
                                        }
                                        ** GOTO lbl32
                                    }
                                    catch (oov v1) {
                                        throw _7e.a(v1);
                                    }
                                    cfr_temp_0 = var4_2 - 16.0;
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                    if (var1_4 != 0) break block20;
                                }
                                catch (oov v2) {
                                    throw _7e.a(v2);
                                }
                                if (v0 < 0) {
                                }
                                ** GOTO lbl32
                            }
                            catch (oov v3) {
                                throw _7e.a(v3);
                            }
                            var6_3 = 1.33;
                            try {
                                if (var1_4 == 0) break block21;
lbl32:
                                // 3 sources

                                v0 = (cfr_temp_1 = var4_2 - 225.0) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                            }
                            catch (oov v4) {
                                throw _7e.a(v4);
                            }
                        }
                        try {
                            if (var1_4 != 0) break block22;
                            if (v0 >= 0) break block21;
                        }
                        catch (oov v5) {
                            throw _7e.a(v5);
                        }
                        var6_3 = 0.6;
                    }
                    this.hxc.zq2().p6m(this.mgs, var6_3);
                    this.eej = Math.max(this.eej - 1, 0);
                    v0 = var4_2 == var2_1 ? 0 : (var4_2 < var2_1 ? -1 : 1);
                }
                try {
                    try {
                        if (var1_4 != 0) break block23;
                        if (v0 > 0) break block24;
                    }
                    catch (oov v6) {
                        throw _7e.a(v6);
                    }
                    v0 = this.eej;
                }
                catch (oov v7) {
                    throw _7e.a(v7);
                }
            }
            try {
                try {
                    if (var1_4 != 0 || v0 > 0) break block24;
                }
                catch (oov v8) {
                    throw _7e.a(v8);
                }
                this.eej = 20;
                v0 = (double)this.hxc._nm(this.mgs);
            }
            catch (oov v9) {
                throw _7e.a(v9);
            }
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

