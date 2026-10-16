/*
 * Decompiled with CFR 0.152.
 */
import net.optifine.shaders.SVertexFormat;

public class ckj {
    public jt3[] nr9;
    public int fyl;
    private /* synthetic */ boolean g5v;

    public ckj(jt3[] jt3Array) {
        this.nr9 = jt3Array;
        this.fyl = jt3Array.length;
    }

    public ckj(jt3[] jt3Array, int n, int n2, int n3, int n4, float f, float f2) {
        this(jt3Array);
        float f3 = 0.0f / f;
        float f4 = 0.0f / f2;
        jt3Array[0] = jt3Array[0].rmw((float)n3 / f - f3, (float)n2 / f2 + f4);
        jt3Array[1] = jt3Array[1].rmw((float)n / f + f3, (float)n2 / f2 + f4);
        jt3Array[2] = jt3Array[2].rmw((float)n / f + f3, (float)n4 / f2 - f4);
        jt3Array[3] = jt3Array[3].rmw((float)n3 / f - f3, (float)n4 / f2 - f4);
    }

    public void uq0() {
        jt3[] jt3Array = new jt3[this.nr9.length];
        try {
            for (int i = 0; i < this.nr9.length; ++i) {
                jt3Array[i] = this.nr9[this.nr9.length - i - 1];
            }
        }
        catch (oov oov2) {
            throw ckj.a(oov2);
        }
        this.nr9 = jt3Array;
    }

    public void kq3(q3g q3g2, float f) {
        block14: {
            int n;
            float f2;
            float f3;
            float f4;
            block13: {
                boolean bl;
                block10: {
                    block11: {
                        fqr fqr2 = this.nr9[1].ugv.vei(this.nr9[0].ugv);
                        fqr fqr3 = this.nr9[1].ugv.vei(this.nr9[2].ugv);
                        fqr fqr4 = fqr3.ajp(fqr2).kec();
                        f4 = (float)fqr4.lvi;
                        f3 = (float)fqr4.gn5;
                        f2 = (float)fqr4.bn2;
                        n = t9d.c();
                        try {
                            bl = this.g5v;
                            if (n != 0) break block10;
                            if (!bl) break block11;
                        }
                        catch (oov oov2) {
                            throw ckj.a(oov2);
                        }
                        f4 = -f4;
                        f3 = -f3;
                        f2 = -f2;
                    }
                    bl = hxt.ly3();
                }
                try {
                    block12: {
                        try {
                            if (!bl) break block12;
                            q3g2.ezr(7, SVertexFormat.defVertexFormatTextured);
                            if (n == 0) break block13;
                        }
                        catch (oov oov3) {
                            throw ckj.a(oov3);
                        }
                    }
                    q3g2.ezr(7, gnl.q0i);
                }
                catch (oov oov4) {
                    throw ckj.a(oov4);
                }
            }
            for (int i = 0; i < 4; ++i) {
                jt3 jt32 = this.nr9[i];
                try {
                    q3g2.g5o(jt32.ugv.lvi * (double)f, jt32.ugv.gn5 * (double)f, jt32.ugv.bn2 * (double)f).h0a(jt32.td0, jt32.gpa).h3y(f4, f3, f2).pzw();
                    if (n == 0) {
                        if (n == 0) continue;
                        break;
                    }
                    break block14;
                }
                catch (oov oov5) {
                    throw ckj.a(oov5);
                }
            }
            jom.yut().q7g();
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

