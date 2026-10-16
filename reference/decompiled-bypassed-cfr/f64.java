/*
 * Decompiled with CFR 0.152.
 */
public class f64
extends flo {
    private float pxk;
    private double ty6;
    private double h18;
    private double byc;

    public f64(t9d t9d2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(t9d2, d, d2, d3, d4, d5, d6);
        this.icv = d4;
        this.mop = d5;
        this.bw4 = d6;
        this.ty6 = this.o2v = d;
        this.h18 = this.kfp = d2;
        this.byc = this.vbd = d3;
        float f = this.z2d.nextFloat() * 0.6f + 0.4f;
        this.pxk = this.ysq = this.z2d.nextFloat() * 0.2f + 0.5f;
        this.li4 = this.v5a = 1.0f * f;
        this.aeh = this.v5a;
        this.li4 *= 0.3f;
        this.aeh *= 0.9f;
        this.bx4 = (int)(Math.random() * 10.0) + 40;
        this.kvx = true;
        this.f0l((int)(Math.random() * 8.0));
    }

    @Override
    public void oss(q3g q3g2, i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = ((float)this.goc + f) / (float)this.bx4;
        f7 = 1.0f - f7;
        f7 *= f7;
        f7 = 1.0f - f7;
        this.ysq = this.pxk * f7;
        super.oss(q3g2, i2h2, f, f2, f3, f4, f5, f6);
    }

    @Override
    public int azk(float f) {
        int n;
        int n2;
        block2: {
            int n3;
            int n4;
            block3: {
                int n5 = super.azk(f);
                float f2 = (float)this.goc / (float)this.bx4;
                f2 *= f2;
                f2 *= f2;
                n4 = n5 & 0xFF;
                int n6 = t9d.c();
                n3 = n5 >> 16 & 0xFF;
                n3 += (int)(f2 * 15.0f * 16.0f);
                try {
                    n2 = n3;
                    n = 240;
                    if (n6 != 0) break block2;
                    if (n2 <= n) break block3;
                }
                catch (oov oov2) {
                    throw f64.a(oov2);
                }
                n3 = 240;
            }
            n2 = n4;
            n = n3 << 16;
        }
        return n2 | n;
    }

    @Override
    public float xeu(float f) {
        float f2 = super.xeu(f);
        float f3 = (float)this.goc / (float)this.bx4;
        f3 = f3 * f3 * f3 * f3;
        return f2 * (1.0f - f3) + f3;
    }

    @Override
    public void xx_() {
        block5: {
            f64 f642;
            block4: {
                this.bc1 = this.o2v;
                this.o_z = this.kfp;
                this.a4d = this.vbd;
                float f = (float)this.goc / (float)this.bx4;
                f = -f + f * f * 2.0f;
                f = 1.0f - f;
                int n = t9d.c();
                try {
                    try {
                        this.o2v = this.ty6 + this.icv * (double)f;
                        this.kfp = this.h18 + this.mop * (double)f + (double)(1.0f - f);
                        this.vbd = this.byc + this.bw4 * (double)f;
                        f642 = this;
                        if (n != 0) break block4;
                        if (f642.goc++ < this.bx4) break block5;
                    }
                    catch (oov oov2) {
                        throw f64.a(oov2);
                    }
                    f642 = this;
                }
                catch (oov oov3) {
                    throw f64.a(oov3);
                }
            }
            f642._kl();
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

