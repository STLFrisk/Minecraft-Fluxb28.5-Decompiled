/*
 * Decompiled with CFR 0.152.
 */
public class c82
extends g6r {
    public tf8[] tgl;
    public tf8 u_5;

    /*
     * Unable to fully structure code
     */
    public c82() {
        block14: {
            super();
            this.tgl = new tf8[8];
            var1_1 = t9d.c();
            for (var2_2 = 0; var2_2 < this.tgl.length; ++var2_2) {
                block16: {
                    block17: {
                        block15: {
                            var3_3 = 0;
                            var4_4 = var2_2;
                            try {
                                try {
                                    if (var1_1 != 0) break block14;
                                    v0 = var2_2;
                                    v1 = 2;
                                    if (var1_1 != 0) break block15;
                                }
                                catch (oov v2) {
                                    throw c82.a(v2);
                                }
                                if (v0 == v1) {
                                }
                                ** GOTO lbl26
                            }
                            catch (oov v3) {
                                throw c82.a(v3);
                            }
                            var3_3 = 24;
                            var4_4 = 10;
                            try {
                                try {
                                    if (var1_1 == 0) break block16;
lbl26:
                                    // 2 sources

                                    v0 = var2_2;
                                    if (var1_1 != 0) break block17;
                                }
                                catch (oov v4) {
                                    throw c82.a(v4);
                                }
                                v1 = 3;
                            }
                            catch (oov v5) {
                                throw c82.a(v5);
                            }
                        }
                        if (v0 != v1) break block16;
                        var3_3 = 24;
                        v0 = 19;
                    }
                    var4_4 = v0;
                }
                this.tgl[var2_2] = new tf8(this, var3_3, var4_4);
                this.tgl[var2_2].ge4(-4.0f, 16 + var2_2, -4.0f, 8, 1, 8);
                if (var1_1 == 0) continue;
            }
            this.u_5 = new tf8(this, 0, 16);
            this.u_5.ge4(-2.0f, 18.0f, -2.0f, 4, 4, 4);
        }
    }

    @Override
    public void v3g(g_3 g_32, float f, float f2, float f3) {
        float f4;
        int n;
        float f5;
        block3: {
            float f6;
            block4: {
                b41 b412 = (b41)g_32;
                f5 = b412.un8 + (b412.mhp - b412.un8) * f3;
                n = t9d.c();
                try {
                    float f7 = f5 - 0.0f;
                    f6 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                    if (n != 0) break block3;
                    if (f6 >= 0) break block4;
                }
                catch (oov oov2) {
                    throw c82.a(oov2);
                }
                f5 = 0.0f;
            }
            f6 = f4 = 0.0f;
        }
        while (f4 < this.tgl.length) {
            this.tgl[f4].ca7 = (float)(-(4 - f4)) * f5 * 1.7f;
            ++f4;
            if (n == 0) continue;
        }
    }

    @Override
    public void s_q(i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.ltd(f, f2, f3, f4, f5, f6, i2h2);
        int n = t9d.b();
        this.u_5.vca(f6);
        int n2 = n;
        for (int i = 0; i < this.tgl.length; ++i) {
            this.tgl[i].vca(f6);
            if (n2 != 0) continue;
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

