/*
 * Decompiled with CFR 0.152.
 */
/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class crk
extends dzm {
    public lva pf0 = new lva(1.0f);
    private /* synthetic */ float vwq;
    private /* synthetic */ float exx;
    private /* synthetic */ float o2l;
    private /* synthetic */ String xab;
    public boolean lw6;

    public crk(String string, String string2, float f, float f2, float f3, float f4) {
        this.rn2 = string;
        this.h4c = string2;
        this.ktv = Float.valueOf(f);
        this.vwq = f2;
        this.exx = f3;
        this.o2l = f4;
        this.lw6 = false;
        _x3.wig.add(this);
    }

    public crk(String string, String string2, float f, float f2, float f3, float f4, boolean bl) {
        this(string, string2, f, f2, f3, f4);
        this.lw6 = bl;
    }

    public crk(String string, String string2, float f, float f2, float f3, float f4, String string3) {
        this(string, string2, f, f2, f3, f4);
        this.xab = string3;
    }

    @Override
    public Float d7c() {
        return (Float)this.ktv;
    }

    public void ms1(float f) {
        block12: {
            float f2;
            block11: {
                float f3;
                block9: {
                    int n;
                    block10: {
                        n = t9d.b();
                        try {
                            float f4 = f - this.vwq;
                            f3 = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
                            if (n == 0) break block9;
                            if (f3 >= 0) break block10;
                        }
                        catch (oov oov2) {
                            throw crk.a(oov2);
                        }
                        f = this.vwq;
                    }
                    try {
                        f2 = f;
                        if (n == 0) break block11;
                        float f5 = f2 - this.exx;
                        f3 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                    }
                    catch (oov oov3) {
                        throw crk.a(oov3);
                    }
                }
                try {
                    if (f3 <= 0) break block12;
                    f2 = this.exx;
                }
                catch (oov oov4) {
                    throw crk.a(oov4);
                }
            }
            f = f2;
        }
        try {
            this.ktv = Float.valueOf(f);
            if (this == zwr.o04) {
                n_l.wvk((int)f, false);
            }
        }
        catch (oov oov5) {
            throw crk.a(oov5);
        }
    }

    public double u7t() {
        return this.d7c().floatValue();
    }

    public lva rpv() {
        return this.pf0;
    }

    public float q9v() {
        return this.vwq;
    }

    public float uof() {
        return this.exx;
    }

    public float t99() {
        return this.o2l;
    }

    public String fht() {
        return this.xab;
    }

    @Override
    public Object d7c() {
        return this.d7c();
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

