/*
 * Decompiled with CFR 0.152.
 */
public class ele {
    private /* synthetic */ g_3 gcm;
    private /* synthetic */ int ryt;
    private /* synthetic */ float mla;

    public ele(g_3 g_32) {
        this.gcm = g_32;
    }

    public void sui() {
        block19: {
            float f;
            block18: {
                ele ele2;
                block17: {
                    float f2;
                    int n;
                    block15: {
                        block14: {
                            block13: {
                                n = t9d.b();
                                double d = this.gcm.o2v - this.gcm.bc1;
                                double d2 = this.gcm.vbd - this.gcm.a4d;
                                try {
                                    try {
                                        if (n == 0) break block13;
                                        if (!(d * d + d2 * d2 > 2.500000277905201E-7)) break block14;
                                    }
                                    catch (oov oov2) {
                                        throw ele.a(oov2);
                                    }
                                    this.gcm.ksw = this.gcm.x5k;
                                    this.mla = this.gcm.q6c = this.i1m(this.gcm.ksw, this.gcm.q6c, 75.0f);
                                    this.ryt = 0;
                                }
                                catch (oov oov3) {
                                    throw ele.a(oov3);
                                }
                            }
                            if (n != 0) break block19;
                        }
                        f = 75.0f;
                        try {
                            block16: {
                                try {
                                    try {
                                        float f3 = Math.abs(this.gcm.q6c - this.mla) - 15.0f;
                                        f2 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                                        if (n == 0) break block15;
                                        if (f2 <= 0) break block16;
                                    }
                                    catch (oov oov4) {
                                        throw ele.a(oov4);
                                    }
                                    this.ryt = 0;
                                    this.mla = this.gcm.q6c;
                                    if (n != 0) break block17;
                                }
                                catch (oov oov5) {
                                    throw ele.a(oov5);
                                }
                            }
                            ++this.ryt;
                            f2 = 10;
                        }
                        catch (oov oov6) {
                            throw ele.a(oov6);
                        }
                    }
                    float f4 = f2;
                    try {
                        ele2 = this;
                        if (n == 0) break block18;
                        if (ele2.ryt <= 10) break block17;
                    }
                    catch (oov oov7) {
                        throw ele.a(oov7);
                    }
                    f = Math.max(1.0f - (float)(this.ryt - 10) / 10.0f, 0.0f) * 75.0f;
                }
                ele2 = this;
            }
            ele2.gcm.ksw = this.i1m(this.gcm.q6c, this.gcm.ksw, f);
        }
    }

    private float i1m(float f, float f2, float f3) {
        float f4;
        float f5;
        block7: {
            float f6;
            float f7;
            block5: {
                int n;
                block6: {
                    n = t9d.c();
                    f7 = fe6.qsy(f - f2);
                    try {
                        float f8 = f7 - -f3;
                        f6 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                        if (n != 0) break block5;
                        if (f6 >= 0) break block6;
                    }
                    catch (oov oov2) {
                        throw ele.a(oov2);
                    }
                    f7 = -f3;
                }
                try {
                    f5 = f7;
                    f4 = f3;
                    if (n != 0) break block7;
                    float f9 = f5 - f4;
                    f6 = f9 == 0.0f ? 0 : (f9 > 0.0f ? 1 : -1);
                }
                catch (oov oov3) {
                    throw ele.a(oov3);
                }
            }
            if (f6 >= 0) {
                f7 = f3;
            }
            f5 = f;
            f4 = f7;
        }
        return f5 - f4;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

