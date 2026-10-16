/*
 * Decompiled with CFR 0.152.
 */
public class ewt
extends _f3 {
    public ewt(t9d t9d2) {
        super(t9d2);
    }

    public ewt(t9d t9d2, double d, double d2, double d3) {
        super(t9d2, d, d2, d3);
    }

    @Override
    public boolean k25(ha9 ha92) {
        boolean bl;
        block28: {
            block29: {
                ewt ewt2;
                int n;
                block26: {
                    block27: {
                        i2h i2h2;
                        block24: {
                            block25: {
                                n = t9d.c();
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        i2h2 = this.wgv;
                                                        if (n != 0) break block24;
                                                        if (i2h2 == null) break block25;
                                                    }
                                                    catch (oov oov2) {
                                                        throw ewt.b(oov2);
                                                    }
                                                    i2h2 = this.wgv;
                                                    if (n != 0) break block24;
                                                }
                                                catch (oov oov3) {
                                                    throw ewt.b(oov3);
                                                }
                                                if (!(i2h2 instanceof ha9)) break block25;
                                            }
                                            catch (oov oov4) {
                                                throw ewt.b(oov4);
                                            }
                                            i2h2 = this.wgv;
                                            if (n != 0) break block24;
                                        }
                                        catch (oov oov5) {
                                            throw ewt.b(oov5);
                                        }
                                        if (i2h2 == ha92) break block25;
                                    }
                                    catch (oov oov6) {
                                        throw ewt.b(oov6);
                                    }
                                    return true;
                                }
                                catch (oov oov7) {
                                    throw ewt.b(oov7);
                                }
                            }
                            try {
                                ewt2 = this;
                                if (n != 0) break block26;
                                i2h2 = ewt2.wgv;
                            }
                            catch (oov oov8) {
                                throw ewt.b(oov8);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (i2h2 == null) break block27;
                                    ewt2 = this;
                                    if (n != 0) break block26;
                                }
                                catch (oov oov9) {
                                    throw ewt.b(oov9);
                                }
                                if (ewt2.wgv == ha92) break block27;
                            }
                            catch (oov oov10) {
                                throw ewt.b(oov10);
                            }
                            return false;
                        }
                        catch (oov oov11) {
                            throw ewt.b(oov11);
                        }
                    }
                    ewt2 = this;
                }
                try {
                    try {
                        bl = ewt2.oay.v0f;
                        if (n != 0) break block28;
                        if (bl) break block29;
                    }
                    catch (oov oov12) {
                        throw ewt.b(oov12);
                    }
                    ha92.nw9(this);
                }
                catch (oov oov13) {
                    throw ewt.b(oov13);
                }
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public void xr9(int n, int n2, int n3, boolean bl) {
        block10: {
            ewt ewt2;
            block13: {
                int n4;
                block11: {
                    block12: {
                        n4 = t9d.b();
                        try {
                            try {
                                try {
                                    if (!bl) break block10;
                                    ewt2 = this;
                                    if (n4 == 0) break block11;
                                }
                                catch (oov oov2) {
                                    throw ewt.b(oov2);
                                }
                                if (ewt2.wgv == null) break block12;
                            }
                            catch (oov oov3) {
                                throw ewt.b(oov3);
                            }
                            this.wgv.nw9(null);
                        }
                        catch (oov oov4) {
                            throw ewt.b(oov4);
                        }
                    }
                    ewt2 = this;
                }
                try {
                    try {
                        if (n4 == 0) break block13;
                        if (ewt2.hg2() != 0) break block10;
                    }
                    catch (oov oov5) {
                        throw ewt.b(oov5);
                    }
                    this.leq(-this.ov7());
                    this.iux(10);
                    this.xbf(50.0f);
                    ewt2 = this;
                }
                catch (oov oov6) {
                    throw ewt.b(oov6);
                }
            }
            ewt2.dxm();
        }
    }

    @Override
    public _f3$c3d x38() {
        return _f3$c3d.g3j;
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

