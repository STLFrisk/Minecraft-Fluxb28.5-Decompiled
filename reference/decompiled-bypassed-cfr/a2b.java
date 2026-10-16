/*
 * Decompiled with CFR 0.152.
 */
public class a2b
extends eur {
    public a2b() {
        this(0.0f, false);
    }

    public a2b(float f, boolean bl) {
        block3: {
            int n = t9d.c();
            super(f, 0.0f, 64, 32);
            if (n == 0) {
                try {
                    if (bl) break block3;
                    this.xwb = new tf8(this, 40, 16);
                    this.xwb.q3x(-1.0f, -2.0f, -1.0f, 2, 12, 2, f);
                    this.xwb.i50(-5.0f, 2.0f, 0.0f);
                    this.hd2 = new tf8(this, 40, 16);
                    this.hd2.hsi = true;
                    this.hd2.q3x(-1.0f, -2.0f, -1.0f, 2, 12, 2, f);
                    this.hd2.i50(5.0f, 2.0f, 0.0f);
                    this.v3l = new tf8(this, 0, 16);
                    this.v3l.q3x(-1.0f, 0.0f, -1.0f, 2, 12, 2, f);
                    this.v3l.i50(-2.0f, 12.0f, 0.0f);
                    this.zv5 = new tf8(this, 0, 16);
                    this.zv5.hsi = true;
                    this.zv5.q3x(-1.0f, 0.0f, -1.0f, 2, 12, 2, f);
                }
                catch (oov oov2) {
                    throw a2b.a(oov2);
                }
            }
            this.zv5.i50(2.0f, 12.0f, 0.0f);
        }
    }

    @Override
    public void v3g(g_3 g_32, float f, float f2, float f3) {
        int n;
        block4: {
            block5: {
                int n2 = t9d.c();
                try {
                    try {
                        a2b a2b2 = this;
                        n = ((jzg)g_32).su3();
                        if (n2 != 0) break block4;
                        if (n != 1) break block5;
                    }
                    catch (oov oov2) {
                        throw a2b.a(oov2);
                    }
                    n = 1;
                    break block4;
                }
                catch (oov oov3) {
                    throw a2b.a(oov3);
                }
            }
            n = 0;
        }
        a2b2.bxg = n;
        super.v3g(g_32, f, f2, f3);
    }

    @Override
    public void ltd(float f, float f2, float f3, float f4, float f5, float f6, i2h i2h2) {
        super.ltd(f, f2, f3, f4, f5, f6, i2h2);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

