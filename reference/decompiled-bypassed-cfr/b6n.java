/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import java.io.Serializable;

public class b6n
extends rkj
implements Serializable {
    public static final long serialVersionUID = 8577680141580006740L;

    public b6n(float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
    }

    public b6n(float[] fArray) {
        super(fArray);
    }

    public b6n(b6n b6n2) {
        super(b6n2);
    }

    public b6n(rkj rkj2) {
        super(rkj2);
    }

    public b6n(xv0 xv02) {
        super(xv02);
    }

    public b6n(Color color) {
        super((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
    }

    public b6n() {
    }

    public final void t0a(Color color) {
        this.hp2 = (float)color.getRed() / 255.0f;
        this.nc_ = (float)color.getGreen() / 255.0f;
        this.ax5 = (float)color.getBlue() / 255.0f;
        this.ck3 = (float)color.getAlpha() / 255.0f;
    }

    public final Color p8q() {
        int n = Math.round(this.hp2 * 255.0f);
        int n2 = Math.round(this.nc_ * 255.0f);
        int n3 = Math.round(this.ax5 * 255.0f);
        int n4 = Math.round(this.ck3 * 255.0f);
        return new Color(n, n2, n3, n4);
    }
}

