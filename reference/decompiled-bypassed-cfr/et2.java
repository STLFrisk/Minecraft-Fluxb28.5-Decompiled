/*
 * Decompiled with CFR 0.152.
 */
public class et2
extends g6r {
    public tf8 bgk;

    public et2() {
        this(0, 0, 32, 32);
    }

    public et2(int n, int n2, int n3, int n4) {
        this.dsx = n3;
        this.apc = n4;
        this.bgk = new tf8(this, n, n2);
        this.bgk.q3x(-3.0f, -6.0f, -3.0f, 6, 8, 6, 0.0f);
        this.bgk.i50(0.0f, 0.0f, 0.0f);
    }

    @Override
    public void s_q(i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.ltd(f, f2, f3, f4, f5, f6, i2h2);
        this.bgk.vca(f6);
    }

    @Override
    public void ltd(float f, float f2, float f3, float f4, float f5, float f6, i2h i2h2) {
        super.ltd(f, f2, f3, f4, f5, f6, i2h2);
        this.bgk.r80 = f4 / 57.295776f;
        this.bgk.pod = f5 / 57.295776f;
    }
}

