/*
 * Decompiled with CFR 0.152.
 */
public class edl
extends i2h {
    public int cjr;
    public int q4l;

    public edl(t9d t9d2) {
        super(t9d2);
        this.gz8 = true;
        this.yxc(2.0f, 2.0f);
        this.q4l = 5;
        this.cjr = this.z2d.nextInt(100000);
    }

    public edl(t9d t9d2, double d, double d2, double d3) {
        this(t9d2);
        this.m6_(d, d2, d3);
    }

    @Override
    public boolean _p9() {
        return false;
    }

    @Override
    public void tbj() {
        this.oit.kp2(8, this.q4l);
    }

    @Override
    public void xx_() {
        block9: {
            mew mew2;
            t9d t9d2;
            block10: {
                int n;
                int n2;
                int n3;
                int n4;
                block8: {
                    this.bc1 = this.o2v;
                    this.o_z = this.kfp;
                    int n5 = t9d.c();
                    this.a4d = this.vbd;
                    ++this.cjr;
                    this.oit.c66(8, this.q4l);
                    n4 = fe6.jqf(this.o2v);
                    n3 = n5;
                    n2 = fe6.jqf(this.kfp);
                    n = fe6.jqf(this.vbd);
                    try {
                        try {
                            t9d2 = this.oay;
                            if (n3 != 0) break block8;
                            if (!(t9d2.vzz instanceof aqg)) break block9;
                        }
                        catch (oov oov2) {
                            throw edl.a(oov2);
                        }
                        t9d2 = this.oay;
                    }
                    catch (oov oov3) {
                        throw edl.a(oov3);
                    }
                }
                try {
                    try {
                        mew2 = new mew(n4, n2, n);
                        if (n3 != 0) break block10;
                        if (t9d2.getBlockState(mew2).r_y() == ox_._0u) break block9;
                    }
                    catch (oov oov4) {
                        throw edl.a(oov4);
                    }
                    t9d2 = this.oay;
                    mew2 = new mew(n4, n2, n);
                }
                catch (oov oov5) {
                    throw edl.a(oov5);
                }
            }
            t9d2.gfy(mew2, ox_._0u.l4i());
        }
    }

    @Override
    public void srs(bdo bdo2) {
    }

    @Override
    public void cjb(bdo bdo2) {
    }

    @Override
    public boolean mzu() {
        return true;
    }

    @Override
    public boolean m1t(ofh ofh2, float f) {
        int n;
        block22: {
            block23: {
                int n2;
                block20: {
                    block21: {
                        n2 = t9d.b();
                        try {
                            try {
                                n = this.nss(ofh2);
                                if (n2 == 0) break block20;
                                if (n == 0) break block21;
                            }
                            catch (oov oov2) {
                                throw edl.a(oov2);
                            }
                            return false;
                        }
                        catch (oov oov3) {
                            throw edl.a(oov3);
                        }
                    }
                    n = this.ma9;
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n2 == 0) break block22;
                                                if (n != 0) break block23;
                                            }
                                            catch (oov oov4) {
                                                throw edl.a(oov4);
                                            }
                                            n = this.oay.v0f;
                                            if (n2 == 0) break block22;
                                        }
                                        catch (oov oov5) {
                                            throw edl.a(oov5);
                                        }
                                        if (n != 0) break block23;
                                    }
                                    catch (oov oov6) {
                                        throw edl.a(oov6);
                                    }
                                    n = this.q4l = 0;
                                    if (n2 == 0) break block22;
                                }
                                catch (oov oov7) {
                                    throw edl.a(oov7);
                                }
                                if (n > 0) break block23;
                            }
                            catch (oov oov8) {
                                throw edl.a(oov8);
                            }
                            this._kl();
                            n = this.oay.v0f ? 1 : 0;
                            if (n2 == 0) break block22;
                        }
                        catch (oov oov9) {
                            throw edl.a(oov9);
                        }
                        if (n != 0) break block23;
                    }
                    catch (oov oov10) {
                        throw edl.a(oov10);
                    }
                    this.oay.s1r(null, this.o2v, this.kfp, this.vbd, 6.0f, true);
                }
                catch (oov oov11) {
                    throw edl.a(oov11);
                }
            }
            n = 1;
        }
        return n != 0;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

