/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public class ck4
extends jwg
implements Serializable {
    public static final long serialVersionUID = 8572646365302599857L;

    public ck4(double d, double d2) {
        super(d, d2);
    }

    public ck4(double[] dArray) {
        super(dArray);
    }

    public ck4(ck4 ck42) {
        super(ck42);
    }

    public ck4(dvx dvx2) {
        super(dvx2);
    }

    public ck4(jwg jwg2) {
        super(jwg2);
    }

    public ck4(mdx mdx2) {
        super(mdx2);
    }

    public ck4() {
    }

    public final double su_(ck4 ck42) {
        return this.q8a * ck42.q8a + this.pfp * ck42.pfp;
    }

    public final double jj6() {
        return Math.sqrt(this.q8a * this.q8a + this.pfp * this.pfp);
    }

    public final double w16() {
        return this.q8a * this.q8a + this.pfp * this.pfp;
    }

    public final void jq6(ck4 ck42) {
        double d = 1.0 / Math.sqrt(ck42.q8a * ck42.q8a + ck42.pfp * ck42.pfp);
        this.q8a = ck42.q8a * d;
        this.pfp = ck42.pfp * d;
    }

    public final void bvc() {
        double d = 1.0 / Math.sqrt(this.q8a * this.q8a + this.pfp * this.pfp);
        this.q8a *= d;
        this.pfp *= d;
    }

    public final double k7x(ck4 ck42) {
        double d;
        block7: {
            double d2;
            double d3;
            block5: {
                int n;
                block6: {
                    n = t9d.c();
                    d3 = this.su_(ck42) / (this.jj6() * ck42.jj6());
                    try {
                        double d4 = d3 - -1.0;
                        d2 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                        if (n != 0) break block5;
                        if (d2 >= 0) break block6;
                    }
                    catch (oov oov2) {
                        throw ck4.a(oov2);
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
                    throw ck4.a(oov3);
                }
            }
            if (d2 > 0) {
                d3 = 1.0;
            }
            d = Math.acos(d3);
        }
        return d;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

