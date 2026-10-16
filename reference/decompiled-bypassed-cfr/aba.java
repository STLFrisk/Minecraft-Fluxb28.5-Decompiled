/*
 * Decompiled with CFR 0.152.
 */
public class aba {
    public float oc2;
    private /* synthetic */ double nkw;
    public int vx9;
    public float au3;
    public float qeu = 1.0f;
    public float ffk;
    private /* synthetic */ long an2;
    private /* synthetic */ long rw4;
    private /* synthetic */ long fap;
    private /* synthetic */ double yd_;

    public aba(float f) {
        this.yd_ = 1.0;
        this.oc2 = f;
        this.an2 = c05.qgs();
        this.rw4 = System.nanoTime() / 1000000L;
    }

    /*
     * Unable to fully structure code
     */
    public void g6r() {
        block28: {
            block29: {
                block26: {
                    block27: {
                        block24: {
                            block25: {
                                block23: {
                                    block22: {
                                        var2_1 = c05.qgs();
                                        var4_2 = var2_1 - this.an2;
                                        var6_3 = System.nanoTime() / 1000000L;
                                        var1_4 = t9d.b();
                                        var8_5 = (double)var6_3 / 1000.0;
                                        try {
                                            try {
                                                cfr_temp_0 = var4_2 - 1000L;
                                                v0 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                                                if (var1_4 == 0) break block22;
                                                if (v0 <= 0) {
                                                }
                                                ** GOTO lbl66
                                            }
                                            catch (oov v1) {
                                                throw aba.a(v1);
                                            }
                                            cfr_temp_1 = var4_2 - 0L;
                                            v0 = cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
                                        }
                                        catch (oov v2) {
                                            throw aba.a(v2);
                                        }
                                    }
                                    try {
                                        try {
                                            if (var1_4 == 0) break block23;
                                            if (v0 >= 0) {
                                            }
                                            ** GOTO lbl66
                                        }
                                        catch (oov v3) {
                                            throw aba.a(v3);
                                        }
                                        this.fap += var4_2;
                                        cfr_temp_2 = this.fap - 1000L;
                                        v0 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                                    }
                                    catch (oov v4) {
                                        throw aba.a(v4);
                                    }
                                }
                                try {
                                    if (var1_4 == 0) break block24;
                                    if (v0 <= 0) break block25;
                                }
                                catch (oov v5) {
                                    throw aba.a(v5);
                                }
                                var10_6 = var6_3 - this.rw4;
                                var12_8 = (double)this.fap / (double)var10_6;
                                this.yd_ += (var12_8 - this.yd_) * 0.20000000298023224;
                                this.rw4 = var6_3;
                                this.fap = 0L;
                            }
                            try {
                                v6 = this;
                                if (var1_4 == 0) break block26;
                                cfr_temp_3 = v6.fap - 0L;
                                v0 = cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1);
                            }
                            catch (oov v7) {
                                throw aba.a(v7);
                            }
                        }
                        try {
                            try {
                                if (v0 >= 0) break block27;
                                this.rw4 = var6_3;
                                if (var1_4 != 0) break block27;
                            }
                            catch (oov v8) {
                                throw aba.a(v8);
                            }
lbl66:
                            // 3 sources

                            this.nkw = var8_5;
                        }
                        catch (oov v9) {
                            throw aba.a(v9);
                        }
                    }
                    v6 = this;
                }
                v6.an2 = var2_1;
                var10_7 = (var8_5 - this.nkw) * this.yd_;
                this.nkw = var8_5;
                var10_7 = fe6.lft(var10_7, 0.0, 1.0);
                try {
                    try {
                        this.ffk = (float)((double)this.ffk + var10_7 * (double)this.qeu * (double)this.oc2);
                        this.vx9 = (int)this.ffk;
                        this.ffk -= (float)this.vx9;
                        v10 = this;
                        if (var1_4 == 0) break block28;
                        if (v10.vx9 <= 10) break block29;
                    }
                    catch (oov v11) {
                        throw aba.a(v11);
                    }
                    this.vx9 = 10;
                }
                catch (oov v12) {
                    throw aba.a(v12);
                }
            }
            v10 = this;
        }
        v10.au3 = this.ffk;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

