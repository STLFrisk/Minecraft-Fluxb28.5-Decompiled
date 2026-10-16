/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class bun
extends cjm {
    public j37 cgi;
    public j37 cy4;
    public double _er;
    private /* synthetic */ int vim;

    public bun(j37 j372, double d) {
        this.cgi = j372;
        this._er = d;
    }

    @Override
    public boolean vle() {
        double d;
        block28: {
            j37 j372;
            block29: {
                int n;
                block25: {
                    j37 j373;
                    block22: {
                        block23: {
                            n = t9d.c();
                            try {
                                try {
                                    j373 = this.cgi;
                                    if (n != 0) break block22;
                                    if (j373.ktm() < 0) break block23;
                                }
                                catch (oov oov2) {
                                    throw bun.a(oov2);
                                }
                                return false;
                            }
                            catch (oov oov3) {
                                throw bun.a(oov3);
                            }
                        }
                        j373 = this.cgi;
                    }
                    List list = j373.oay.m_z(this.cgi.getClass(), this.cgi.aaw().c2h(8.0, 4.0, 8.0));
                    j372 = null;
                    double d2 = Double.MAX_VALUE;
                    for (j37 j374 : list) {
                        block26: {
                            double d3;
                            block27: {
                                j37 j375;
                                block24: {
                                    try {
                                        try {
                                            try {
                                                j375 = j374;
                                                if (n != 0) break block24;
                                                d = j375.ktm();
                                                if (n != 0) break block25;
                                            }
                                            catch (oov oov4) {
                                                throw bun.a(oov4);
                                            }
                                            if (d < 0) break block26;
                                        }
                                        catch (oov oov5) {
                                            throw bun.a(oov5);
                                        }
                                        j375 = this.cgi;
                                    }
                                    catch (oov oov6) {
                                        throw bun.a(oov6);
                                    }
                                }
                                double d4 = j375.wxg(j374);
                                try {
                                    try {
                                        d3 = d4;
                                        if (n != 0) break block27;
                                        if (!(d3 <= d2)) break block26;
                                    }
                                    catch (oov oov7) {
                                        throw bun.a(oov7);
                                    }
                                    d3 = d4;
                                }
                                catch (oov oov8) {
                                    throw bun.a(oov8);
                                }
                            }
                            d2 = d3;
                            j372 = j374;
                        }
                        if (n == 0) continue;
                    }
                    try {
                        if (j372 == null) {
                            return false;
                        }
                    }
                    catch (oov oov9) {
                        throw bun.a(oov9);
                    }
                    double d5 = d2 - 9.0;
                    d = d5 == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1);
                }
                try {
                    try {
                        if (n != 0) break block28;
                        if (d >= 0) break block29;
                    }
                    catch (oov oov10) {
                        throw bun.a(oov10);
                    }
                    return false;
                }
                catch (oov oov11) {
                    throw bun.a(oov11);
                }
            }
            this.cy4 = j372;
            d = 1.0;
        }
        return (boolean)d;
    }

    @Override
    public boolean wh3() {
        double d;
        block20: {
            block19: {
                int n;
                block18: {
                    j37 j372;
                    block17: {
                        int n2;
                        block15: {
                            block16: {
                                n = t9d.c();
                                try {
                                    try {
                                        n2 = this.cgi.ktm();
                                        if (n != 0) break block15;
                                        if (n2 < 0) break block16;
                                    }
                                    catch (oov oov2) {
                                        throw bun.a(oov2);
                                    }
                                    return false;
                                }
                                catch (oov oov3) {
                                    throw bun.a(oov3);
                                }
                            }
                            try {
                                j372 = this.cy4;
                                if (n != 0) break block17;
                                n2 = j372.gzr() ? 1 : 0;
                            }
                            catch (oov oov4) {
                                throw bun.a(oov4);
                            }
                        }
                        try {
                            if (n2 == 0) {
                                return false;
                            }
                        }
                        catch (oov oov5) {
                            throw bun.a(oov5);
                        }
                        j372 = this.cgi;
                    }
                    double d2 = j372.wxg(this.cy4);
                    try {
                        try {
                            double d3 = d2 - 9.0;
                            d = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                            if (n != 0) break block18;
                            if (d < 0) break block19;
                        }
                        catch (oov oov6) {
                            throw bun.a(oov6);
                        }
                        double d4 = d2 - 256.0;
                        d = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                    }
                    catch (oov oov7) {
                        throw bun.a(oov7);
                    }
                }
                try {
                    if (n != 0) break block20;
                    if (d > 0) break block19;
                }
                catch (oov oov8) {
                    throw bun.a(oov8);
                }
                d = 1.0;
                break block20;
            }
            d = 0.0;
        }
        return (boolean)d;
    }

    @Override
    public void mnp() {
        this.vim = 0;
    }

    @Override
    public void zly() {
        this.cy4 = null;
    }

    @Override
    public void iad() {
        block4: {
            int n = t9d.b();
            try {
                int n2;
                try {
                    n2 = this.vim = this.vim - 1;
                    if (n == 0 || n2 > 0) break block4;
                }
                catch (oov oov2) {
                    throw bun.a(oov2);
                }
                this.vim = 10;
                n2 = this.cgi.zq2().p6m(this.cy4, this._er) ? 1 : 0;
            }
            catch (oov oov3) {
                throw bun.a(oov3);
            }
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

