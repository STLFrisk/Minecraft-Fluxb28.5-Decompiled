/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public class _e6
extends rkj
implements Serializable {
    public static final long serialVersionUID = 8749319902347760659L;

    public _e6(float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
    }

    public _e6(float[] fArray) {
        super(fArray);
    }

    public _e6(_e6 _e62) {
        super(_e62);
    }

    public _e6(v71 v712) {
        super(v712);
    }

    public _e6(rkj rkj2) {
        super(rkj2);
    }

    public _e6(xv0 xv02) {
        super(xv02);
    }

    public _e6(ry6 ry62) {
        super(ry62.yiu, ry62.q6o, ry62.n_d, 0.0f);
    }

    public _e6() {
    }

    public final void hsi(ry6 ry62) {
        this.hp2 = ry62.yiu;
        this.nc_ = ry62.q6o;
        this.ax5 = ry62.n_d;
        this.ck3 = 0.0f;
    }

    public final float ts6() {
        return (float)Math.sqrt(this.hp2 * this.hp2 + this.nc_ * this.nc_ + this.ax5 * this.ax5 + this.ck3 * this.ck3);
    }

    public final float kf3() {
        return this.hp2 * this.hp2 + this.nc_ * this.nc_ + this.ax5 * this.ax5 + this.ck3 * this.ck3;
    }

    public final float g5m(_e6 _e62) {
        return this.hp2 * _e62.hp2 + this.nc_ * _e62.nc_ + this.ax5 * _e62.ax5 + this.ck3 * _e62.ck3;
    }

    public final void vzj(_e6 _e62) {
        float f = (float)(1.0 / Math.sqrt(_e62.hp2 * _e62.hp2 + _e62.nc_ * _e62.nc_ + _e62.ax5 * _e62.ax5 + _e62.ck3 * _e62.ck3));
        this.hp2 = _e62.hp2 * f;
        this.nc_ = _e62.nc_ * f;
        this.ax5 = _e62.ax5 * f;
        this.ck3 = _e62.ck3 * f;
    }

    public final void g2i() {
        float f = (float)(1.0 / Math.sqrt(this.hp2 * this.hp2 + this.nc_ * this.nc_ + this.ax5 * this.ax5 + this.ck3 * this.ck3));
        this.hp2 *= f;
        this.nc_ *= f;
        this.ax5 *= f;
        this.ck3 *= f;
    }

    public final float _cj(_e6 _e62) {
        double d;
        block7: {
            double d2;
            double d3;
            block5: {
                int n;
                block6: {
                    n = t9d.c();
                    d3 = this.g5m(_e62) / (this.ts6() * _e62.ts6());
                    try {
                        double d4 = d3 - -1.0;
                        d2 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                        if (n != 0) break block5;
                        if (d2 >= 0) break block6;
                    }
                    catch (oov oov2) {
                        throw _e6.a(oov2);
                    }
                    d3 = -1.0;
                }
                try {
                    d = d3;
                    if (n != 0) break block7;
                    double d5 = d - 1.0;
                    d2 = d5 == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1);
                }
                catch (oov oov3) {
                    throw _e6.a(oov3);
                }
            }
            if (d2 > 0) {
                d3 = 1.0;
            }
            d = Math.acos(d3);
        }
        return (float)d;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

