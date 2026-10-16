/*
 * Decompiled with CFR 0.152.
 */
public class bmn {
    private final /* synthetic */ ofh _y6;
    private final /* synthetic */ int d2u;
    private final /* synthetic */ float m33;
    private final /* synthetic */ float f76;
    private final /* synthetic */ String qyt;
    private final /* synthetic */ float j_n;

    public bmn(ofh ofh2, int n, float f, float f2, String string, float f3) {
        this._y6 = ofh2;
        this.d2u = n;
        this.m33 = f2;
        this.f76 = f;
        this.qyt = string;
        this.j_n = f3;
    }

    public ofh o8c() {
        return this._y6;
    }

    public float e75() {
        return this.m33;
    }

    public boolean hwi() {
        return this._y6.nra() instanceof g_3;
    }

    public String s9y() {
        return this.qyt;
    }

    public ekw qn1() {
        ekw ekw2;
        block6: {
            i2h i2h2;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            i2h2 = this.o8c().nra();
                            if (n != 0) break block4;
                            if (i2h2 != null) break block5;
                        }
                        catch (oov oov2) {
                            throw bmn.a(oov2);
                        }
                        ekw2 = null;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw bmn.a(oov3);
                    }
                }
                i2h2 = this.o8c().nra();
            }
            ekw2 = i2h2.xyw();
        }
        return ekw2;
    }

    public float m1y() {
        float f;
        block6: {
            bmn bmn2;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            bmn2 = this;
                            if (n != 0) break block4;
                            if (bmn2._y6 != ofh.r2b) break block5;
                        }
                        catch (oov oov2) {
                            throw bmn.a(oov2);
                        }
                        f = Float.MAX_VALUE;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw bmn.a(oov3);
                    }
                }
                bmn2 = this;
            }
            f = bmn2.j_n;
        }
        return f;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

