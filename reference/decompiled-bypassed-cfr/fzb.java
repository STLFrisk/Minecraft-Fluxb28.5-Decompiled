/*
 * Decompiled with CFR 0.152.
 */
public class fzb
extends z14 {
    public boolean djg;
    public boolean n7k;

    public fzb(float f) {
        super(0.0f, -14.0f, 64, 32);
        float f2 = -14.0f;
        this.lxi = new tf8(this, 0, 16);
        this.lxi.q3x(-4.0f, -8.0f, -4.0f, 8, 8, 8, f - 0.5f);
        this.lxi.i50(0.0f, 0.0f + f2, 0.0f);
        this.s87 = new tf8(this, 32, 16);
        this.s87.q3x(-4.0f, 0.0f, -2.0f, 8, 12, 4, f);
        this.s87.i50(0.0f, 0.0f + f2, 0.0f);
        this.xwb = new tf8(this, 56, 0);
        this.xwb.q3x(-1.0f, -2.0f, -1.0f, 2, 30, 2, f);
        this.xwb.i50(-3.0f, 2.0f + f2, 0.0f);
        this.hd2 = new tf8(this, 56, 0);
        this.hd2.hsi = true;
        this.hd2.q3x(-1.0f, -2.0f, -1.0f, 2, 30, 2, f);
        this.hd2.i50(5.0f, 2.0f + f2, 0.0f);
        this.v3l = new tf8(this, 56, 0);
        this.v3l.q3x(-1.0f, 0.0f, -1.0f, 2, 30, 2, f);
        this.v3l.i50(-2.0f, 12.0f + f2, 0.0f);
        this.zv5 = new tf8(this, 56, 0);
        this.zv5.hsi = true;
        this.zv5.q3x(-1.0f, 0.0f, -1.0f, 2, 30, 2, f);
        this.zv5.i50(2.0f, 12.0f + f2, 0.0f);
    }

    @Override
    public void ltd(float f, float f2, float f3, float f4, float f5, float f6, i2h i2h2) {
        float f7;
        block53: {
            float f8;
            block54: {
                int n;
                block51: {
                    block52: {
                        float f9;
                        block49: {
                            float f10;
                            block50: {
                                block47: {
                                    float f11;
                                    block48: {
                                        block45: {
                                            float f12;
                                            block46: {
                                                block43: {
                                                    float f13;
                                                    block44: {
                                                        block41: {
                                                            float f14;
                                                            block42: {
                                                                block39: {
                                                                    float f15;
                                                                    block40: {
                                                                        block37: {
                                                                            float f16;
                                                                            block38: {
                                                                                super.ltd(f, f2, f3, f4, f5, f6, i2h2);
                                                                                this.wtl.b16 = true;
                                                                                f8 = -14.0f;
                                                                                this.s87.pod = 0.0f;
                                                                                n = t9d.c();
                                                                                this.s87.ca7 = f8;
                                                                                this.s87.kit = -0.0f;
                                                                                this.v3l.pod -= 0.0f;
                                                                                this.zv5.pod -= 0.0f;
                                                                                this.xwb.pod = (float)((double)this.xwb.pod * 0.5);
                                                                                this.hd2.pod = (float)((double)this.hd2.pod * 0.5);
                                                                                this.v3l.pod = (float)((double)this.v3l.pod * 0.5);
                                                                                this.zv5.pod = (float)((double)this.zv5.pod * 0.5);
                                                                                f9 = 0.4f;
                                                                                try {
                                                                                    try {
                                                                                        float f17 = this.xwb.pod - f9;
                                                                                        f7 = f17 == 0.0f ? (byte)0 : (f17 > 0.0f ? (byte)1 : -1);
                                                                                        if (n != 0) break block37;
                                                                                        if (f7 <= 0) break block38;
                                                                                    }
                                                                                    catch (oov oov2) {
                                                                                        throw fzb.a(oov2);
                                                                                    }
                                                                                    this.xwb.pod = f9;
                                                                                }
                                                                                catch (oov oov3) {
                                                                                    throw fzb.a(oov3);
                                                                                }
                                                                            }
                                                                            f7 = (f16 = this.hd2.pod - f9) == 0.0f ? (byte)0 : (f16 > 0.0f ? (byte)1 : -1);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (n != 0) break block39;
                                                                                if (f7 <= 0) break block40;
                                                                            }
                                                                            catch (oov oov4) {
                                                                                throw fzb.a(oov4);
                                                                            }
                                                                            this.hd2.pod = f9;
                                                                        }
                                                                        catch (oov oov5) {
                                                                            throw fzb.a(oov5);
                                                                        }
                                                                    }
                                                                    f7 = (f15 = this.xwb.pod - -f9) == 0.0f ? (byte)0 : (f15 < 0.0f ? (byte)-1 : 1);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (n != 0) break block41;
                                                                        if (f7 >= 0) break block42;
                                                                    }
                                                                    catch (oov oov6) {
                                                                        throw fzb.a(oov6);
                                                                    }
                                                                    this.xwb.pod = -f9;
                                                                }
                                                                catch (oov oov7) {
                                                                    throw fzb.a(oov7);
                                                                }
                                                            }
                                                            f7 = (f14 = this.hd2.pod - -f9) == 0.0f ? (byte)0 : (f14 < 0.0f ? (byte)-1 : 1);
                                                        }
                                                        try {
                                                            try {
                                                                if (n != 0) break block43;
                                                                if (f7 >= 0) break block44;
                                                            }
                                                            catch (oov oov8) {
                                                                throw fzb.a(oov8);
                                                            }
                                                            this.hd2.pod = -f9;
                                                        }
                                                        catch (oov oov9) {
                                                            throw fzb.a(oov9);
                                                        }
                                                    }
                                                    f7 = (f13 = this.v3l.pod - f9) == 0.0f ? (byte)0 : (f13 > 0.0f ? (byte)1 : -1);
                                                }
                                                try {
                                                    try {
                                                        if (n != 0) break block45;
                                                        if (f7 <= 0) break block46;
                                                    }
                                                    catch (oov oov10) {
                                                        throw fzb.a(oov10);
                                                    }
                                                    this.v3l.pod = f9;
                                                }
                                                catch (oov oov11) {
                                                    throw fzb.a(oov11);
                                                }
                                            }
                                            f7 = (f12 = this.zv5.pod - f9) == 0.0f ? (byte)0 : (f12 > 0.0f ? (byte)1 : -1);
                                        }
                                        try {
                                            try {
                                                if (n != 0) break block47;
                                                if (f7 <= 0) break block48;
                                            }
                                            catch (oov oov12) {
                                                throw fzb.a(oov12);
                                            }
                                            this.zv5.pod = f9;
                                        }
                                        catch (oov oov13) {
                                            throw fzb.a(oov13);
                                        }
                                    }
                                    f7 = (f11 = this.v3l.pod - -f9) == 0.0f ? (byte)0 : (f11 < 0.0f ? (byte)-1 : 1);
                                }
                                try {
                                    try {
                                        if (n != 0) break block49;
                                        if (f7 >= 0) break block50;
                                    }
                                    catch (oov oov14) {
                                        throw fzb.a(oov14);
                                    }
                                    this.v3l.pod = -f9;
                                }
                                catch (oov oov15) {
                                    throw fzb.a(oov15);
                                }
                            }
                            f7 = (f10 = this.zv5.pod - -f9) == 0.0f ? (byte)0 : (f10 < 0.0f ? (byte)-1 : 1);
                        }
                        try {
                            try {
                                if (n != 0) break block51;
                                if (f7 >= 0) break block52;
                            }
                            catch (oov oov16) {
                                throw fzb.a(oov16);
                            }
                            this.zv5.pod = -f9;
                        }
                        catch (oov oov17) {
                            throw fzb.a(oov17);
                        }
                    }
                    f7 = (float)this.djg;
                }
                try {
                    try {
                        if (n != 0) break block53;
                        if (f7 == false) break block54;
                    }
                    catch (oov oov18) {
                        throw fzb.a(oov18);
                    }
                    this.xwb.pod = -0.5f;
                    this.hd2.pod = -0.5f;
                    this.xwb.oo7 = 0.05f;
                    this.hd2.oo7 = -0.05f;
                }
                catch (oov oov19) {
                    throw fzb.a(oov19);
                }
            }
            this.xwb.kit = 0.0f;
            this.hd2.kit = 0.0f;
            this.v3l.kit = 0.0f;
            this.zv5.kit = 0.0f;
            this.v3l.ca7 = 9.0f + f8;
            this.zv5.ca7 = 9.0f + f8;
            this.wtl.kit = -0.0f;
            this.wtl.ca7 = f8 + 1.0f;
            this.lxi._ki = this.wtl._ki;
            this.lxi.ca7 = this.wtl.ca7;
            this.lxi.kit = this.wtl.kit;
            this.lxi.pod = this.wtl.pod;
            this.lxi.r80 = this.wtl.r80;
            this.lxi.oo7 = this.wtl.oo7;
            f7 = (float)this.n7k;
        }
        if (f7 != false) {
            float f18 = 1.0f;
            this.wtl.ca7 -= f18 * 5.0f;
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

