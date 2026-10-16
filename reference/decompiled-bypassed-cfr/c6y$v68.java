/*
 * Decompiled with CFR 0.152.
 */
public class c6y$v68
extends flo {
    private int yls = 160;
    private boolean gih;
    private boolean e16;
    private final jux aqh;
    private float k7v;
    private float m3p;
    private float fbc;
    private boolean yzw;

    public c6y$v68(t9d t9d2, double d, double d2, double d3, double d4, double d5, double d6, jux jux2) {
        super(t9d2, d, d2, d3);
        this.icv = d4;
        this.mop = d5;
        this.bw4 = d6;
        this.aqh = jux2;
        this.ysq *= 0.75f;
        this.bx4 = 48 + this.z2d.nextInt(12);
        this.kvx = false;
    }

    public void kqe(boolean bl) {
        this.gih = bl;
    }

    public void tvt(boolean bl) {
        this.e16 = bl;
    }

    public void fnk(int n) {
        float f = (float)((n & 0xFF0000) >> 16) / 255.0f;
        float f2 = (float)((n & 0xFF00) >> 8) / 255.0f;
        float f3 = (float)((n & 0xFF) >> 0) / 255.0f;
        float f4 = 1.0f;
        this.mcd(f * f4, f2 * f4, f3 * f4);
    }

    public void nll(int n) {
        this.k7v = (float)((n & 0xFF0000) >> 16) / 255.0f;
        this.m3p = (float)((n & 0xFF00) >> 8) / 255.0f;
        this.fbc = (float)((n & 0xFF) >> 0) / 255.0f;
        this.yzw = true;
    }

    @Override
    public nh4 q3r() {
        return null;
    }

    @Override
    public boolean tfh() {
        return false;
    }

    @Override
    public void oss(q3g q3g2, i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        block14: {
            c6y$v68 c6y$v68;
            block12: {
                int n = t9d.b();
                try {
                    block13: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            c6y$v68 = this;
                                            if (n == 0) break block12;
                                            if (!c6y$v68.e16) break block13;
                                        }
                                        catch (oov oov2) {
                                            throw c6y$v68.a(oov2);
                                        }
                                        c6y$v68 = this;
                                        if (n == 0) break block12;
                                    }
                                    catch (oov oov3) {
                                        throw c6y$v68.a(oov3);
                                    }
                                    if (c6y$v68.goc < this.bx4 / 3) break block13;
                                }
                                catch (oov oov4) {
                                    throw c6y$v68.a(oov4);
                                }
                                c6y$v68 = this;
                                if (n == 0) break block12;
                            }
                            catch (oov oov5) {
                                throw c6y$v68.a(oov5);
                            }
                            if ((c6y$v68.goc + this.bx4) / 3 % 2 != 0) break block14;
                        }
                        catch (oov oov6) {
                            throw c6y$v68.a(oov6);
                        }
                    }
                    c6y$v68 = this;
                }
                catch (oov oov7) {
                    throw c6y$v68.a(oov7);
                }
            }
            super.oss(q3g2, i2h2, f, f2, f3, f4, f5, f6);
        }
    }

    @Override
    public void xx_() {
        block40: {
            c6y$v68 c6y$v68;
            c6y$v68 c6y$v682;
            block43: {
                block44: {
                    c6y$v68 c6y$v683;
                    int n;
                    block42: {
                        int n2;
                        int n3;
                        block41: {
                            block39: {
                                block37: {
                                    block38: {
                                        block35: {
                                            block36: {
                                                int n4;
                                                block33: {
                                                    block34: {
                                                        this.bc1 = this.o2v;
                                                        this.o_z = this.kfp;
                                                        n = t9d.b();
                                                        try {
                                                            try {
                                                                this.a4d = this.vbd;
                                                                int n5 = this.goc;
                                                                n3 = n5;
                                                                this.goc = n5 + 1;
                                                                n4 = this.bx4;
                                                                if (n == 0) break block33;
                                                                if (n3 < n4) break block34;
                                                            }
                                                            catch (oov oov2) {
                                                                throw c6y$v68.a(oov2);
                                                            }
                                                            this._kl();
                                                        }
                                                        catch (oov oov3) {
                                                            throw c6y$v68.a(oov3);
                                                        }
                                                    }
                                                    try {
                                                        n3 = this.goc;
                                                        if (n == 0) break block35;
                                                        n4 = this.bx4 / 2;
                                                    }
                                                    catch (oov oov4) {
                                                        throw c6y$v68.a(oov4);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (n3 <= n4) break block36;
                                                            this.rc6(1.0f - ((float)this.goc - (float)(this.bx4 / 2)) / (float)this.bx4);
                                                            n3 = this.yzw ? 1 : 0;
                                                            if (n == 0) break block35;
                                                        }
                                                        catch (oov oov5) {
                                                            throw c6y$v68.a(oov5);
                                                        }
                                                        if (n3 != 0) {
                                                        }
                                                        break block36;
                                                    }
                                                    catch (oov oov6) {
                                                        throw c6y$v68.a(oov6);
                                                    }
                                                    this.aeh += (this.k7v - this.aeh) * 0.2f;
                                                    this.li4 += (this.m3p - this.li4) * 0.2f;
                                                    this.v5a += (this.fbc - this.v5a) * 0.2f;
                                                }
                                                catch (oov oov7) {
                                                    throw c6y$v68.a(oov7);
                                                }
                                            }
                                            this.f0l(this.yls + (7 - this.goc * 8 / this.bx4));
                                            this.mop -= 0.004;
                                            this.vjj(this.icv, this.mop, this.bw4);
                                            this.icv *= (double)0.91f;
                                            this.mop *= (double)0.91f;
                                            this.bw4 *= (double)0.91f;
                                            n3 = this.lfk ? 1 : 0;
                                        }
                                        try {
                                            try {
                                                if (n == 0) break block37;
                                                if (n3 == 0) break block38;
                                            }
                                            catch (oov oov8) {
                                                throw c6y$v68.a(oov8);
                                            }
                                            this.icv *= (double)0.7f;
                                            this.bw4 *= (double)0.7f;
                                        }
                                        catch (oov oov9) {
                                            throw c6y$v68.a(oov9);
                                        }
                                    }
                                    n3 = this.gih ? 1 : 0;
                                }
                                try {
                                    try {
                                        if (n == 0) break block39;
                                        if (n3 == 0) break block40;
                                    }
                                    catch (oov oov10) {
                                        throw c6y$v68.a(oov10);
                                    }
                                    n3 = this.goc;
                                }
                                catch (oov oov11) {
                                    throw c6y$v68.a(oov11);
                                }
                            }
                            try {
                                try {
                                    try {
                                        n2 = this.bx4 / 2;
                                        if (n == 0) break block41;
                                        if (n3 >= n2) break block40;
                                    }
                                    catch (oov oov12) {
                                        throw c6y$v68.a(oov12);
                                    }
                                    c6y$v683 = this;
                                    if (n == 0) break block42;
                                }
                                catch (oov oov13) {
                                    throw c6y$v68.a(oov13);
                                }
                                n3 = c6y$v683.goc + this.bx4;
                                n2 = 2;
                            }
                            catch (oov oov14) {
                                throw c6y$v68.a(oov14);
                            }
                        }
                        try {
                            if (n3 % n2 != 0) break block40;
                            c6y$v683 = new c6y$v68(this.oay, this.o2v, this.kfp, this.vbd, 0.0, 0.0, 0.0, this.aqh);
                        }
                        catch (oov oov15) {
                            throw c6y$v68.a(oov15);
                        }
                    }
                    c6y$v682 = c6y$v683;
                    try {
                        try {
                            c6y$v682.rc6(0.99f);
                            c6y$v682.mcd(this.aeh, this.li4, this.v5a);
                            c6y$v682.goc = c6y$v682.bx4 / 2;
                            c6y$v68 = this;
                            if (n == 0) break block43;
                            if (!c6y$v68.yzw) break block44;
                        }
                        catch (oov oov16) {
                            throw c6y$v68.a(oov16);
                        }
                        c6y$v682.yzw = true;
                        c6y$v682.k7v = this.k7v;
                        c6y$v682.m3p = this.m3p;
                        c6y$v682.fbc = this.fbc;
                    }
                    catch (oov oov17) {
                        throw c6y$v68.a(oov17);
                    }
                }
                c6y$v682.e16 = this.e16;
                c6y$v68 = this;
            }
            c6y$v68.aqh.o4t(c6y$v682);
        }
    }

    @Override
    public int azk(float f) {
        return 0xF000F0;
    }

    @Override
    public float xeu(float f) {
        return 1.0f;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

