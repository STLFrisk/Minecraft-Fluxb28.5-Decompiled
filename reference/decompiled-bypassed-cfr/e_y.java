/*
 * Decompiled with CFR 0.152.
 */
public class e_y
extends g6r {
    public tf8 k83;
    public tf8 phy;
    public tf8 se6;
    public tf8 odi;
    public tf8 qm3;
    public tf8 tc_;

    public e_y() {
        this(0.0f);
    }

    public e_y(float f) {
        this(f, -7.0f);
    }

    public e_y(float f, float f2) {
        int n = 128;
        int n2 = 128;
        this.k83 = new tf8(this).swi(n, n2);
        this.k83.i50(0.0f, 0.0f + f2, -2.0f);
        this.k83.fc6(0, 0).q3x(-4.0f, -12.0f, -5.5f, 8, 10, 8, f);
        this.k83.fc6(24, 0).q3x(-1.0f, -5.0f, -7.5f, 2, 4, 2, f);
        this.phy = new tf8(this).swi(n, n2);
        this.phy.i50(0.0f, 0.0f + f2, 0.0f);
        this.phy.fc6(0, 40).q3x(-9.0f, -2.0f, -6.0f, 18, 12, 11, f);
        this.phy.fc6(0, 70).q3x(-4.5f, 10.0f, -3.0f, 9, 5, 6, f + 0.5f);
        this.se6 = new tf8(this).swi(n, n2);
        this.se6.i50(0.0f, -7.0f, 0.0f);
        this.se6.fc6(60, 21).q3x(-13.0f, -2.5f, -3.0f, 4, 30, 6, f);
        this.odi = new tf8(this).swi(n, n2);
        this.odi.i50(0.0f, -7.0f, 0.0f);
        this.odi.fc6(60, 58).q3x(9.0f, -2.5f, -3.0f, 4, 30, 6, f);
        this.qm3 = new tf8(this, 0, 22).swi(n, n2);
        this.qm3.i50(-4.0f, 18.0f + f2, 0.0f);
        this.qm3.fc6(37, 0).q3x(-3.5f, -3.0f, -3.0f, 6, 16, 5, f);
        this.tc_ = new tf8(this, 0, 22).swi(n, n2);
        this.tc_.hsi = true;
        this.tc_.fc6(60, 0).i50(5.0f, 18.0f + f2, 0.0f);
        this.tc_.q3x(-3.5f, -3.0f, -3.0f, 6, 16, 5, f);
    }

    @Override
    public void s_q(i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.ltd(f, f2, f3, f4, f5, f6, i2h2);
        this.k83.vca(f6);
        this.phy.vca(f6);
        this.qm3.vca(f6);
        this.tc_.vca(f6);
        this.se6.vca(f6);
        this.odi.vca(f6);
    }

    @Override
    public void ltd(float f, float f2, float f3, float f4, float f5, float f6, i2h i2h2) {
        this.k83.r80 = f4 / 57.295776f;
        this.k83.pod = f5 / 57.295776f;
        this.qm3.pod = -1.5f * this.bgl(f, 13.0f) * f2;
        this.tc_.pod = 1.5f * this.bgl(f, 13.0f) * f2;
        this.qm3.r80 = 0.0f;
        this.tc_.r80 = 0.0f;
    }

    @Override
    public void v3g(g_3 g_32, float f, float f2, float f3) {
        block14: {
            block15: {
                int n;
                int n2;
                block12: {
                    osf osf2 = (osf)g_32;
                    int n3 = osf2.x1h();
                    n2 = t9d.c();
                    try {
                        block13: {
                            try {
                                try {
                                    n = n3;
                                    if (n2 != 0) break block12;
                                    if (n <= 0) break block13;
                                }
                                catch (oov oov2) {
                                    throw e_y.a(oov2);
                                }
                                this.se6.pod = -2.0f + 1.5f * this.bgl((float)n3 - f3, 10.0f);
                                this.odi.pod = -2.0f + 1.5f * this.bgl((float)n3 - f3, 10.0f);
                                if (n2 == 0) break block14;
                            }
                            catch (oov oov3) {
                                throw e_y.a(oov3);
                            }
                        }
                        n = osf2.gn_();
                    }
                    catch (oov oov4) {
                        throw e_y.a(oov4);
                    }
                }
                int n4 = n;
                try {
                    block16: {
                        try {
                            try {
                                if (n2 != 0) break block15;
                                if (n4 <= 0) break block16;
                            }
                            catch (oov oov5) {
                                throw e_y.a(oov5);
                            }
                            this.se6.pod = -0.8f + 0.025f * this.bgl(n4, 70.0f);
                            this.odi.pod = 0.0f;
                            if (n2 == 0) break block14;
                        }
                        catch (oov oov6) {
                            throw e_y.a(oov6);
                        }
                    }
                    this.se6.pod = (-0.2f + 1.5f * this.bgl(f, 13.0f)) * f2;
                }
                catch (oov oov7) {
                    throw e_y.a(oov7);
                }
            }
            this.odi.pod = (-0.2f - 1.5f * this.bgl(f, 13.0f)) * f2;
        }
    }

    private float bgl(float f, float f2) {
        return (Math.abs(f % f2 - f2 * 0.5f) - f2 * 0.25f) / (f2 * 0.25f);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

