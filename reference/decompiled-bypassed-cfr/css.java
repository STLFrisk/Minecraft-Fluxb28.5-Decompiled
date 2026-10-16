/*
 * Decompiled with CFR 0.152.
 */
public class css {
    private final /* synthetic */ v66 fpf;
    private final /* synthetic */ float lq_;

    public css(v66 v662, long l, long l2, float f) {
        this.fpf = v662;
        this.lq_ = this.cgl(v662, l, l2, f);
    }

    public float ege() {
        return this.lq_;
    }

    public float os2() {
        float f;
        block10: {
            float f2;
            float f3;
            block11: {
                block12: {
                    float f4;
                    block8: {
                        int n;
                        block9: {
                            n = t9d.c();
                            try {
                                try {
                                    float f5 = this.lq_ - 2.0f;
                                    f4 = f5 == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1);
                                    if (n != 0) break block8;
                                    if (f4 >= 0) break block9;
                                }
                                catch (oov oov2) {
                                    throw css.a(oov2);
                                }
                                f = 0.0f;
                                break block10;
                            }
                            catch (oov oov3) {
                                throw css.a(oov3);
                            }
                        }
                        try {
                            f3 = this.lq_;
                            f2 = 4.0f;
                            if (n != 0) break block11;
                            float f6 = f3 - f2;
                            f4 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                        }
                        catch (oov oov4) {
                            throw css.a(oov4);
                        }
                    }
                    try {
                        if (f4 <= 0) break block12;
                        f = 1.0f;
                        break block10;
                    }
                    catch (oov oov5) {
                        throw css.a(oov5);
                    }
                }
                f3 = this.lq_ - 2.0f;
                f2 = 2.0f;
            }
            f = f3 / f2;
        }
        return f;
    }

    private float cgl(v66 v662, long l, long l2, float f) {
        v66 v663;
        float f2;
        block16: {
            float f3;
            block17: {
                float f4;
                float f5;
                float f6;
                float f7;
                int n;
                block14: {
                    block15: {
                        boolean bl;
                        v66 v664;
                        v66 v665;
                        block12: {
                            block13: {
                                n = t9d.c();
                                try {
                                    try {
                                        v665 = v662;
                                        v664 = v66.na2;
                                        if (n != 0) break block12;
                                        if (v665 != v664) break block13;
                                    }
                                    catch (oov oov2) {
                                        throw css.a(oov2);
                                    }
                                    return 0.0f;
                                }
                                catch (oov oov3) {
                                    throw css.a(oov3);
                                }
                            }
                            v665 = v662;
                            v664 = v66.csg;
                        }
                        try {
                            bl = v665 == v664;
                        }
                        catch (oov oov4) {
                            throw css.a(oov4);
                        }
                        boolean bl2 = bl;
                        f2 = 0.75f;
                        f7 = fe6._f3(((float)l + -72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
                        f2 += f7;
                        f3 = 0.0f;
                        try {
                            try {
                                f6 = f3;
                                f5 = (float)l2 / 3600000.0f;
                                f4 = 0.0f;
                                if (n != 0) break block14;
                                f5 = fe6._f3(f5, f4, 1.0f);
                                if (!bl2) break block15;
                            }
                            catch (oov oov5) {
                                throw css.a(oov5);
                            }
                            f4 = 1.0f;
                            break block14;
                        }
                        catch (oov oov6) {
                            throw css.a(oov6);
                        }
                    }
                    f4 = 0.75f;
                }
                f3 = f6 + f5 * f4;
                f3 += fe6._f3(f * 0.25f, 0.0f, f7);
                try {
                    v663 = v662;
                    if (n != 0) break block16;
                    if (v663 != v66.g4t) break block17;
                }
                catch (oov oov7) {
                    throw css.a(oov7);
                }
                f3 *= 0.5f;
            }
            f2 += f3;
            v663 = v662;
        }
        return (float)v663.dzc() * f2;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

