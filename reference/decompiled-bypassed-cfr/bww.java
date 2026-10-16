/*
 * Decompiled with CFR 0.152.
 */
public class bww {
    public yqv o3a;
    public double c8c;
    public double ki4;
    public double mkj;
    public double v1h;
    public boolean ilc;

    public bww(yqv yqv2) {
        this.o3a = yqv2;
        this.c8c = yqv2.o2v;
        this.ki4 = yqv2.kfp;
        this.mkj = yqv2.vbd;
    }

    public boolean c68() {
        return this.ilc;
    }

    public double r1p() {
        return this.v1h;
    }

    public void n5p(double d, double d2, double d3, double d4) {
        this.c8c = d;
        this.ki4 = d2;
        this.mkj = d3;
        this.v1h = d4;
        this.ilc = true;
    }

    public void nju() {
        block16: {
            double d;
            block18: {
                double d2;
                double d3;
                double d4;
                double d5;
                double d6;
                int n;
                block17: {
                    int n2;
                    block15: {
                        n = t9d.c();
                        try {
                            try {
                                this.o3a.x50(0.0f);
                                n2 = this.ilc;
                                if (n != 0) break block15;
                                if (n2 == 0) break block16;
                            }
                            catch (oov oov2) {
                                throw bww.a(oov2);
                            }
                            this.ilc = false;
                            n2 = fe6.jqf(this.o3a.aaw().bx_ + 0.5);
                        }
                        catch (oov oov3) {
                            throw bww.a(oov3);
                        }
                    }
                    int n3 = n2;
                    d6 = this.c8c - this.o3a.o2v;
                    d5 = this.mkj - this.o3a.vbd;
                    d4 = this.ki4 - (double)n3;
                    double d7 = d6 * d6 + d4 * d4 + d5 * d5;
                    try {
                        try {
                            d3 = d7;
                            d2 = 2.500000277905201E-7;
                            if (n != 0) break block17;
                            if (!(d3 >= d2)) break block16;
                        }
                        catch (oov oov4) {
                            throw bww.a(oov4);
                        }
                        d3 = fe6.yr8(d5, d6) * 180.0;
                        d2 = Math.PI;
                    }
                    catch (oov oov5) {
                        throw bww.a(oov5);
                    }
                }
                float f = (float)(d3 / d2) - 90.0f;
                try {
                    try {
                        this.o3a.x5k = this._58(this.o3a.x5k, f, 30.0f);
                        this.o3a.nak((float)(this.v1h * this.o3a.dgt(m6d.w7i).nz5()));
                        double d8 = d4 - 0.0;
                        d = d8 == 0.0 ? 0 : (d8 > 0.0 ? 1 : -1);
                        if (n != 0) break block18;
                        if (d <= 0) break block16;
                    }
                    catch (oov oov6) {
                        throw bww.a(oov6);
                    }
                    double d9 = d6 * d6 + d5 * d5 - 1.0;
                    d = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
                }
                catch (oov oov7) {
                    throw bww.a(oov7);
                }
            }
            try {
                if (d < 0) {
                    this.o3a.wzk().nqf();
                }
            }
            catch (oov oov8) {
                throw bww.a(oov8);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public float _58(float var1_1, float var2_2, float var3_3) {
        block18: {
            block17: {
                block16: {
                    block15: {
                        block13: {
                            block14: {
                                var4_4 = t9d.c();
                                var5_5 = fe6.qsy(var2_2 - var1_1);
                                try {
                                    v0 = var5_5 == var3_3 ? 0 : (var5_5 > var3_3 ? 1 : -1);
                                    if (var4_4 != 0) break block13;
                                    if (v0 <= 0) break block14;
                                }
                                catch (oov v1) {
                                    throw bww.a(v1);
                                }
                                var5_5 = var3_3;
                            }
                            try {
                                v2 = var5_5;
                                v3 = -var3_3;
                                if (var4_4 != 0) break block15;
                                cfr_temp_0 = v2 - v3;
                                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                            }
                            catch (oov v4) {
                                throw bww.a(v4);
                            }
                        }
                        if (v0 < 0) {
                            var5_5 = -var3_3;
                        }
                        v2 = var1_1;
                        v3 = var5_5;
                    }
                    var6_6 = v2 + v3;
                    try {
                        cfr_temp_1 = var6_6 - 0.0f;
                        v5 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                        if (var4_4 != 0) break block16;
                        if (v5 < 0) {
                        }
                        ** GOTO lbl41
                    }
                    catch (oov v6) {
                        throw bww.a(v6);
                    }
                    var6_6 += 360.0f;
                    try {
                        try {
                            if (var4_4 == 0) break block17;
lbl41:
                            // 2 sources

                            v7 = var6_6;
                            if (var4_4 != 0) break block18;
                        }
                        catch (oov v8) {
                            throw bww.a(v8);
                        }
                        cfr_temp_2 = v7 - 360.0f;
                        v5 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                    }
                    catch (oov v9) {
                        throw bww.a(v9);
                    }
                }
                if (v5 > 0) {
                    var6_6 -= 360.0f;
                }
            }
            v7 = var6_6;
        }
        return v7;
    }

    public double bgt() {
        return this.c8c;
    }

    public double wbk() {
        return this.ki4;
    }

    public double hda() {
        return this.mkj;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

