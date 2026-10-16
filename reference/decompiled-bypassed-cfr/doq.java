/*
 * Decompiled with CFR 0.152.
 */
public class doq
extends cjm {
    private /* synthetic */ laq e7t;
    private /* synthetic */ g_3 ele;
    private /* synthetic */ double zxz;
    private /* synthetic */ double iha;
    private /* synthetic */ double eld;
    private /* synthetic */ double a80;
    private /* synthetic */ float rf2;

    public doq(laq laq2, double d, float f) {
        this.e7t = laq2;
        this.a80 = d;
        this.rf2 = f;
        this.k23(1);
    }

    @Override
    public boolean vle() {
        block16: {
            fqr fqr2;
            block17: {
                doq doq2;
                int n;
                block15: {
                    g_3 g_32;
                    block13: {
                        block14: {
                            n = t9d.b();
                            try {
                                try {
                                    g_32 = this.ele = this.e7t.q4v();
                                    if (n == 0) break block13;
                                    if (g_32 != null) break block14;
                                }
                                catch (oov oov2) {
                                    throw doq.a(oov2);
                                }
                                return false;
                            }
                            catch (oov oov3) {
                                throw doq.a(oov3);
                            }
                        }
                        try {
                            doq2 = this;
                            if (n == 0) break block15;
                            g_32 = doq2.ele;
                        }
                        catch (oov oov4) {
                            throw doq.a(oov4);
                        }
                    }
                    try {
                        if (g_32.wxg(this.e7t) > (double)(this.rf2 * this.rf2)) {
                            return false;
                        }
                    }
                    catch (oov oov5) {
                        throw doq.a(oov5);
                    }
                    doq2 = this;
                }
                fqr2 = zim.ity(doq2.e7t, 16, 7, new fqr(this.ele.o2v, this.ele.kfp, this.ele.vbd));
                try {
                    try {
                        if (n == 0) break block16;
                        if (fqr2 != null) break block17;
                    }
                    catch (oov oov6) {
                        throw doq.a(oov6);
                    }
                    return false;
                }
                catch (oov oov7) {
                    throw doq.a(oov7);
                }
            }
            this.zxz = fqr2.lvi;
            this.iha = fqr2.gn5;
            this.eld = fqr2.bn2;
        }
        return true;
    }

    @Override
    public boolean wh3() {
        int n;
        block13: {
            block11: {
                int n2;
                block12: {
                    block10: {
                        n2 = t9d.b();
                        try {
                            try {
                                n = this.e7t.zq2().j07();
                                if (n2 == 0) break block10;
                                if (n != 0) break block11;
                            }
                            catch (oov oov2) {
                                throw doq.a(oov2);
                            }
                            n = this.ele.gzr();
                        }
                        catch (oov oov3) {
                            throw doq.a(oov3);
                        }
                    }
                    try {
                        try {
                            if (n2 == 0) break block12;
                            if (n == 0) break block11;
                        }
                        catch (oov oov4) {
                            throw doq.a(oov4);
                        }
                        double d = this.ele.wxg(this.e7t) - (double)(this.rf2 * this.rf2);
                        n = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                    }
                    catch (oov oov5) {
                        throw doq.a(oov5);
                    }
                }
                try {
                    if (n2 == 0) break block13;
                    if (n >= 0) break block11;
                }
                catch (oov oov6) {
                    throw doq.a(oov6);
                }
                n = 1;
                break block13;
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public void zly() {
        this.ele = null;
    }

    @Override
    public void mnp() {
        this.e7t.zq2().ni_(this.zxz, this.iha, this.eld, this.a80);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

