/*
 * Decompiled with CFR 0.152.
 */
public class et8
extends z14 {
    public tf8 gl1;
    public tf8 b6i;
    public tf8 qne;
    public tf8 w8n;
    public tf8 g37;
    private /* synthetic */ tf8 nzi;
    private /* synthetic */ tf8 ziu;
    private /* synthetic */ boolean h9r;

    public et8(float f, boolean bl) {
        block8: {
            block6: {
                super(f, 0.0f, 64, 64);
                this.h9r = bl;
                this.ziu = new tf8(this, 24, 0);
                this.ziu.q3x(-3.0f, -6.0f, -1.0f, 6, 6, 1, f);
                this.nzi = new tf8(this, 0, 0);
                int n = t9d.c();
                this.nzi.swi(64, 32);
                int n2 = n;
                try {
                    block7: {
                        try {
                            try {
                                this.nzi.q3x(-5.0f, 0.0f, -1.0f, 10, 16, 1, f);
                                if (n2 != 0) break block6;
                                if (!bl) break block7;
                            }
                            catch (oov oov2) {
                                throw et8.a(oov2);
                            }
                            this.hd2 = new tf8(this, 32, 48);
                            this.hd2.q3x(-1.0f, -2.0f, -2.0f, 3, 12, 4, f);
                            this.hd2.i50(5.0f, 2.5f, 0.0f);
                            this.xwb = new tf8(this, 40, 16);
                            this.xwb.q3x(-2.0f, -2.0f, -2.0f, 3, 12, 4, f);
                            this.xwb.i50(-5.0f, 2.5f, 0.0f);
                            this.gl1 = new tf8(this, 48, 48);
                            this.gl1.q3x(-1.0f, -2.0f, -2.0f, 3, 12, 4, f + 0.25f);
                            this.gl1.i50(5.0f, 2.5f, 0.0f);
                            this.b6i = new tf8(this, 40, 32);
                            this.b6i.q3x(-2.0f, -2.0f, -2.0f, 3, 12, 4, f + 0.25f);
                            this.b6i.i50(-5.0f, 2.5f, 10.0f);
                            if (n2 == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw et8.a(oov3);
                        }
                    }
                    this.hd2 = new tf8(this, 32, 48);
                    this.hd2.q3x(-1.0f, -2.0f, -2.0f, 4, 12, 4, f);
                    this.hd2.i50(5.0f, 2.0f, 0.0f);
                    this.gl1 = new tf8(this, 48, 48);
                    this.gl1.q3x(-1.0f, -2.0f, -2.0f, 4, 12, 4, f + 0.25f);
                    this.gl1.i50(5.0f, 2.0f, 0.0f);
                    this.b6i = new tf8(this, 40, 32);
                    this.b6i.q3x(-3.0f, -2.0f, -2.0f, 4, 12, 4, f + 0.25f);
                }
                catch (oov oov4) {
                    throw et8.a(oov4);
                }
            }
            this.b6i.i50(-5.0f, 2.0f, 10.0f);
        }
        this.zv5 = new tf8(this, 16, 48);
        this.zv5.q3x(-2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        this.zv5.i50(1.9f, 12.0f, 0.0f);
        this.qne = new tf8(this, 0, 48);
        this.qne.q3x(-2.0f, 0.0f, -2.0f, 4, 12, 4, f + 0.25f);
        this.qne.i50(1.9f, 12.0f, 0.0f);
        this.w8n = new tf8(this, 0, 32);
        this.w8n.q3x(-2.0f, 0.0f, -2.0f, 4, 12, 4, f + 0.25f);
        this.w8n.i50(-1.9f, 12.0f, 0.0f);
        this.g37 = new tf8(this, 16, 32);
        this.g37.q3x(-4.0f, 0.0f, -2.0f, 8, 12, 4, f + 0.25f);
        this.g37.i50(0.0f, 0.0f, 0.0f);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void s_q(i2h var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7) {
        block9: {
            block8: {
                var8_8 = t9d.c();
                try {
                    super.s_q(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7);
                    hzu.dp2();
                    v0 = this._a0;
                    if (var8_8 != 0) break block8;
                    if (v0) {
                    }
                    ** GOTO lbl23
                }
                catch (oov v1) {
                    throw et8.a(v1);
                }
                var9_9 = 2.0f;
                try {
                    hzu.syc(1.0f / var9_9, 1.0f / var9_9, 1.0f / var9_9);
                    hzu.a4k(0.0f, 24.0f * var7_7, 0.0f);
                    this.qne.vca(var7_7);
                    this.w8n.vca(var7_7);
                    this.gl1.vca(var7_7);
                    this.b6i.vca(var7_7);
                    this.g37.vca(var7_7);
                    if (var8_8 == 0) break block9;
lbl23:
                    // 2 sources

                    v0 = var1_1.hzv();
                }
                catch (oov v2) {
                    throw et8.a(v2);
                }
            }
            try {
                if (v0) {
                    hzu.a4k(0.0f, 0.2f, 0.0f);
                }
            }
            catch (oov v3) {
                throw et8.a(v3);
            }
            this.qne.vca(var7_7);
            this.w8n.vca(var7_7);
            this.gl1.vca(var7_7);
            this.b6i.vca(var7_7);
            this.g37.vca(var7_7);
        }
        hzu.x3w();
    }

    public void unp(float f) {
        et8.ibo(this.wtl, this.ziu);
        this.ziu._ki = 0.0f;
        this.ziu.ca7 = 0.0f;
        this.ziu.vca(f);
    }

    public void iq0(float f) {
        this.nzi.vca(f);
    }

    @Override
    public void ltd(float f, float f2, float f3, float f4, float f5, float f6, i2h i2h2) {
        super.ltd(f, f2, f3, f4, f5, f6, i2h2);
        et8.ibo(this.zv5, this.qne);
        et8.ibo(this.v3l, this.w8n);
        et8.ibo(this.hd2, this.gl1);
        et8.ibo(this.xwb, this.b6i);
        et8.ibo(this.s87, this.g37);
    }

    public void zz8() {
        this.xwb.vca(0.0625f);
        this.b6i.vca(0.0625f);
    }

    public void ofd() {
        this.hd2.vca(0.0625f);
        this.gl1.vca(0.0625f);
    }

    @Override
    public void sy2(boolean bl) {
        super.sy2(bl);
        this.gl1.b16 = bl;
        this.b6i.b16 = bl;
        this.qne.b16 = bl;
        this.w8n.b16 = bl;
        this.g37.b16 = bl;
        this.nzi.b16 = bl;
        this.ziu.b16 = bl;
    }

    @Override
    public void zn0(float f) {
        block8: {
            et8 et82;
            block6: {
                int n = t9d.c();
                try {
                    block7: {
                        try {
                            try {
                                et82 = this;
                                if (n != 0) break block6;
                                if (!et82.h9r) break block7;
                            }
                            catch (oov oov2) {
                                throw et8.a(oov2);
                            }
                            this.xwb._ki += 1.0f;
                            this.xwb.f2u(f);
                            this.xwb._ki -= 1.0f;
                            if (n == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw et8.a(oov3);
                        }
                    }
                    et82 = this;
                }
                catch (oov oov4) {
                    throw et8.a(oov4);
                }
            }
            et82.xwb.f2u(f);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

