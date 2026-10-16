/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public class dyx
extends xv0
implements Serializable {
    public static final long serialVersionUID = 1733471895962736949L;

    public dyx(double d, double d2, double d3, double d4) {
        super(d, d2, d3, d4);
    }

    public dyx(double[] dArray) {
        super(dArray);
    }

    public dyx(dyx dyx2) {
        super(dyx2);
    }

    public dyx(hj4 hj42) {
        super(hj42);
    }

    public dyx(rkj rkj2) {
        super(rkj2);
    }

    public dyx(xv0 xv02) {
        super(xv02);
    }

    public dyx(g5s g5s2) {
        super(g5s2.v54, g5s2.g0w, g5s2.mu9, 1.0);
    }

    public dyx() {
    }

    public final void j06(g5s g5s2) {
        this.yme = g5s2.v54;
        this.pf8 = g5s2.g0w;
        this.jfe = g5s2.mu9;
        this.ggc = 1.0;
    }

    public final double jou(dyx dyx2) {
        double d = this.yme - dyx2.yme;
        double d2 = this.pf8 - dyx2.pf8;
        double d3 = this.jfe - dyx2.jfe;
        double d4 = this.ggc - dyx2.ggc;
        return d * d + d2 * d2 + d3 * d3 + d4 * d4;
    }

    public final double oh1(dyx dyx2) {
        double d = this.yme - dyx2.yme;
        double d2 = this.pf8 - dyx2.pf8;
        double d3 = this.jfe - dyx2.jfe;
        double d4 = this.ggc - dyx2.ggc;
        return Math.sqrt(d * d + d2 * d2 + d3 * d3 + d4 * d4);
    }

    public final double m_p(dyx dyx2) {
        return Math.abs(this.yme - dyx2.yme) + Math.abs(this.pf8 - dyx2.pf8) + Math.abs(this.jfe - dyx2.jfe) + Math.abs(this.ggc - dyx2.ggc);
    }

    public final double w_v(dyx dyx2) {
        double d = Math.max(Math.abs(this.yme - dyx2.yme), Math.abs(this.pf8 - dyx2.pf8));
        double d2 = Math.max(Math.abs(this.jfe - dyx2.jfe), Math.abs(this.ggc - dyx2.ggc));
        return Math.max(d, d2);
    }

    public final void aph(dyx dyx2) {
        double d = 1.0 / dyx2.ggc;
        this.yme = dyx2.yme * d;
        this.pf8 = dyx2.pf8 * d;
        this.jfe = dyx2.jfe * d;
        this.ggc = 1.0;
    }
}

