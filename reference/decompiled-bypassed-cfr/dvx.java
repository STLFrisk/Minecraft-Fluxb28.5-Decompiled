/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public class dvx
extends mdx
implements Serializable {
    public static final long serialVersionUID = -2168194326883512320L;

    public dvx(float f, float f2) {
        super(f, f2);
    }

    public dvx(float[] fArray) {
        super(fArray);
    }

    public dvx(dvx dvx2) {
        super(dvx2);
    }

    public dvx(ck4 ck42) {
        super(ck42);
    }

    public dvx(mdx mdx2) {
        super(mdx2);
    }

    public dvx(jwg jwg2) {
        super(jwg2);
    }

    public dvx() {
    }

    public final float nv7(dvx dvx2) {
        return this.n7d * dvx2.n7d + this.wfr * dvx2.wfr;
    }

    public final float lv4() {
        return (float)Math.sqrt(this.n7d * this.n7d + this.wfr * this.wfr);
    }

    public final float sba() {
        return this.n7d * this.n7d + this.wfr * this.wfr;
    }

    public final void ntp(dvx dvx2) {
        float f = (float)(1.0 / Math.sqrt(dvx2.n7d * dvx2.n7d + dvx2.wfr * dvx2.wfr));
        this.n7d = dvx2.n7d * f;
        this.wfr = dvx2.wfr * f;
    }

    public final void x6k() {
        float f = (float)(1.0 / Math.sqrt(this.n7d * this.n7d + this.wfr * this.wfr));
        this.n7d *= f;
        this.wfr *= f;
    }

    public final float _4f(dvx dvx2) {
        double d;
        block7: {
            double d2;
            double d3;
            block5: {
                int n;
                block6: {
                    n = t9d.c();
                    d3 = this.nv7(dvx2) / (this.lv4() * dvx2.lv4());
                    try {
                        double d4 = d3 - -1.0;
                        d2 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                        if (n != 0) break block5;
                        if (d2 >= 0) break block6;
                    }
                    catch (oov oov2) {
                        throw dvx.a(oov2);
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
                    throw dvx.a(oov3);
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

