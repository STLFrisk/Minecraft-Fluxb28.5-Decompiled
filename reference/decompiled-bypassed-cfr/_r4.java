/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;

public class _r4
extends ry6
implements Serializable {
    public static final long serialVersionUID = -8689337816398030143L;

    public _r4(float f, float f2, float f3) {
        super(f, f2, f3);
    }

    public _r4(float[] fArray) {
        super(fArray);
    }

    public _r4(_r4 _r42) {
        super(_r42);
    }

    public _r4(fna fna2) {
        super(fna2);
    }

    public _r4(ry6 ry62) {
        super(ry62);
    }

    public _r4(g5s g5s2) {
        super(g5s2);
    }

    public _r4() {
    }

    public final float w3j(_r4 _r42) {
        float f = this.yiu - _r42.yiu;
        float f2 = this.q6o - _r42.q6o;
        float f3 = this.n_d - _r42.n_d;
        return f * f + f2 * f2 + f3 * f3;
    }

    public final float xv0(_r4 _r42) {
        float f = this.yiu - _r42.yiu;
        float f2 = this.q6o - _r42.q6o;
        float f3 = this.n_d - _r42.n_d;
        return (float)Math.sqrt(f * f + f2 * f2 + f3 * f3);
    }

    public final float _3t(_r4 _r42) {
        return Math.abs(this.yiu - _r42.yiu) + Math.abs(this.q6o - _r42.q6o) + Math.abs(this.n_d - _r42.n_d);
    }

    public final float kl3(_r4 _r42) {
        float f = Math.max(Math.abs(this.yiu - _r42.yiu), Math.abs(this.q6o - _r42.q6o));
        return Math.max(f, Math.abs(this.n_d - _r42.n_d));
    }

    public final void s8n(hj4 hj42) {
        float f = 1.0f / hj42.ck3;
        this.yiu = hj42.hp2 * f;
        this.q6o = hj42.nc_ * f;
        this.n_d = hj42.ax5 * f;
    }
}

