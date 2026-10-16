/*
 * Decompiled with CFR 0.152.
 */
public class dxp
extends u1p {
    private /* synthetic */ g_3 xvp;
    private /* synthetic */ o3g cyx;
    private /* synthetic */ float s6h;
    private /* synthetic */ float hxj;
    private /* synthetic */ float xlo;
    private /* synthetic */ float c2q;
    private /* synthetic */ float q0k;
    private /* synthetic */ float vey;
    private /* synthetic */ float k7x;

    public dxp(g_3 g_32, o3g o3g2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.xvp = g_32;
        this.cyx = o3g2;
        this.s6h = f;
        this.hxj = f2;
        this.xlo = f3;
        this.c2q = f4;
        this.q0k = f5;
        this.vey = f6;
        this.k7x = f7;
    }

    public dxp(g_3 g_32, o3g o3g2) {
        this.xvp = g_32;
        this.cyx = o3g2;
        this.s6h = 0.0f;
        this.hxj = 0.0f;
        this.xlo = 0.0f;
        this.c2q = 0.0f;
        this.q0k = 0.0f;
        this.vey = 0.0f;
        this.k7x = 0.0f;
    }

    public g_3 oxg() {
        return this.xvp;
    }

    public boolean ike() {
        boolean bl;
        try {
            bl = this.cyx == o3g.hac;
        }
        catch (oov oov2) {
            throw dxp.a(oov2);
        }
        return bl;
    }

    public boolean ypz() {
        boolean bl;
        try {
            bl = this.cyx == o3g.ga7;
        }
        catch (oov oov2) {
            throw dxp.a(oov2);
        }
        return bl;
    }

    public float bnh() {
        return this.s6h;
    }

    public void e70(float f) {
        this.s6h = f;
    }

    public float h94() {
        return this.hxj;
    }

    public void ptm(float f) {
        this.hxj = f;
    }

    public float o_d() {
        return this.xlo;
    }

    public void c5r(float f) {
        this.xlo = f;
    }

    public float vqe() {
        return this.c2q;
    }

    public void mmx(float f) {
        this.c2q = f;
    }

    public float uva() {
        return this.q0k;
    }

    public void aeb(float f) {
        this.q0k = f;
    }

    public float nch() {
        return this.k7x;
    }

    public void gjr(float f) {
        this.k7x = f;
    }

    public float p9l() {
        return this.vey;
    }

    public void _ya(float f) {
        this.vey = f;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

