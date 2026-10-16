/*
 * Decompiled with CFR 0.152.
 */
public class bb_
extends zgs {
    public bb_(Float f, Float f2) {
        super(f, f2);
    }

    public bb_ hem(Float f) {
        this.s6x(f);
        return this;
    }

    public bb_ lhk(Float f) {
        this.j2k(f);
        return this;
    }

    public Float bdo() {
        return Float.valueOf(this.sl2().floatValue());
    }

    public Float jub() {
        return Float.valueOf(this.c3r().floatValue());
    }

    public bb_ o8s() {
        bb_ bb_2;
        block23: {
            block22: {
                int n;
                block21: {
                    block20: {
                        this.hem(Float.valueOf(this.bdo().floatValue() % 360.0f));
                        int n2 = t9d.c();
                        this.lhk(Float.valueOf(this.jub().floatValue() % 360.0f));
                        n = n2;
                        while (this.bdo().floatValue() <= -180.0f) {
                            try {
                                this.hem(Float.valueOf(this.bdo().floatValue() + 360.0f));
                                if (n == 0) {
                                    if (n == 0) continue;
                                    break;
                                }
                                break block20;
                            }
                            catch (oov oov2) {
                                throw bb_.a(oov2);
                            }
                        }
                        while (this.jub().floatValue() <= -180.0f) {
                            try {
                                this.lhk(Float.valueOf(this.jub().floatValue() + 360.0f));
                                if (n == 0) {
                                    if (n == 0) continue;
                                    break;
                                }
                                break block21;
                            }
                            catch (oov oov3) {
                                throw bb_.a(oov3);
                            }
                        }
                    }
                    try {
                        do {
                            try {
                                if (!(this.bdo().floatValue() > 180.0f)) break;
                                this.hem(Float.valueOf(this.bdo().floatValue() - 360.0f));
                                if (n == 0) {
                                    continue;
                                }
                                break block22;
                            }
                            catch (oov oov4) {
                                throw bb_.a(oov4);
                            }
                        } while (n == 0);
                    }
                    catch (oov oov5) {
                        throw bb_.a(oov5);
                    }
                }
                try {
                    do {
                        try {
                            if (!(this.jub().floatValue() > 180.0f)) break;
                            bb_2 = this.lhk(Float.valueOf(this.jub().floatValue() - 360.0f));
                            if (n == 0) {
                                continue;
                            }
                            break block23;
                        }
                        catch (oov oov6) {
                            throw bb_.a(oov6);
                        }
                    } while (n == 0);
                }
                catch (oov oov7) {
                    throw bb_.a(oov7);
                }
            }
            bb_2 = this;
        }
        return bb_2;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

