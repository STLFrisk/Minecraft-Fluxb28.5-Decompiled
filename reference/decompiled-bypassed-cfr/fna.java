/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public class fna
extends g5s
implements Serializable {
    public static final long serialVersionUID = 5718062286069042927L;

    public fna(double d, double d2, double d3) {
        super(d, d2, d3);
    }

    public fna(double[] dArray) {
        super(dArray);
    }

    public fna(fna fna2) {
        super(fna2);
    }

    public fna(_r4 _r42) {
        super(_r42);
    }

    public fna(ry6 ry62) {
        super(ry62);
    }

    public fna(g5s g5s2) {
        super(g5s2);
    }

    public fna() {
    }

    public final double c46(fna fna2) {
        double d = this.v54 - fna2.v54;
        double d2 = this.g0w - fna2.g0w;
        double d3 = this.mu9 - fna2.mu9;
        return d * d + d2 * d2 + d3 * d3;
    }

    public final double gbk(fna fna2) {
        double d = this.v54 - fna2.v54;
        double d2 = this.g0w - fna2.g0w;
        double d3 = this.mu9 - fna2.mu9;
        return Math.sqrt(d * d + d2 * d2 + d3 * d3);
    }

    public final double flv(fna fna2) {
        return Math.abs(this.v54 - fna2.v54) + Math.abs(this.g0w - fna2.g0w) + Math.abs(this.mu9 - fna2.mu9);
    }

    public final double zpr(fna fna2) {
        double d = Math.max(Math.abs(this.v54 - fna2.v54), Math.abs(this.g0w - fna2.g0w));
        return Math.max(d, Math.abs(this.mu9 - fna2.mu9));
    }

    public final void _z9(dyx dyx2) {
        double d = 1.0 / dyx2.ggc;
        this.v54 = dyx2.yme * d;
        this.g0w = dyx2.pf8 * d;
        this.mu9 = dyx2.jfe * d;
    }
}

