/*
 * Decompiled with CFR 0.152.
 */
public class eur
extends z14 {
    public eur() {
        this(0.0f, false);
    }

    public eur(float f, float f2, int n, int n2) {
        super(f, f2, n, n2);
    }

    public eur(float f, boolean bl) {
        super(f, 0.0f, 64, bl ? 32 : 64);
    }

    @Override
    public void ltd(float f, float f2, float f3, float f4, float f5, float f6, i2h i2h2) {
        super.ltd(f, f2, f3, f4, f5, f6, i2h2);
        float f7 = fe6.rtn(this._5e * (float)Math.PI);
        float f8 = fe6.rtn((1.0f - (1.0f - this._5e) * (1.0f - this._5e)) * (float)Math.PI);
        this.xwb.oo7 = 0.0f;
        this.hd2.oo7 = 0.0f;
        this.xwb.r80 = -(0.1f - f7 * 0.6f);
        this.hd2.r80 = 0.1f - f7 * 0.6f;
        this.xwb.pod = -1.5707964f;
        this.hd2.pod = -1.5707964f;
        this.xwb.pod -= f7 * 1.2f - f8 * 0.4f;
        this.hd2.pod -= f7 * 1.2f - f8 * 0.4f;
        this.xwb.oo7 += fe6.ssk(f3 * 0.09f) * 0.05f + 0.05f;
        this.hd2.oo7 -= fe6.ssk(f3 * 0.09f) * 0.05f + 0.05f;
        this.xwb.pod += fe6.rtn(f3 * 0.067f) * 0.05f;
        this.hd2.pod -= fe6.rtn(f3 * 0.067f) * 0.05f;
    }
}

