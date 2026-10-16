/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

public class d2q {
    private final t9d _0l;
    private final mew g7n;
    private final boolean ehm;
    private zfz mbv;
    private pyk m7v;
    private boolean cot;

    public d2q(t9d t9d2, mew mew2, boolean bl) {
        this._0l = t9d2;
        this.g7n = mew2;
        this.ehm = bl;
    }

    public zfz uc6() {
        zfz zfz2;
        block12: {
            d2q d2q2;
            block16: {
                block13: {
                    block14: {
                        int n = t9d.c();
                        try {
                            d2q d2q3;
                            block15: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    zfz2 = this.mbv;
                                                    if (n != 0) break block12;
                                                    if (zfz2 != null) break block13;
                                                }
                                                catch (oov oov2) {
                                                    throw d2q.a(oov2);
                                                }
                                                d2q3 = this;
                                                if (n != 0) break block14;
                                            }
                                            catch (oov oov3) {
                                                throw d2q.a(oov3);
                                            }
                                            if (d2q3.ehm) break block15;
                                        }
                                        catch (oov oov4) {
                                            throw d2q.a(oov4);
                                        }
                                        d2q2 = this;
                                        if (n != 0) break block16;
                                    }
                                    catch (oov oov5) {
                                        throw d2q.a(oov5);
                                    }
                                    if (!d2q2._0l.xjm(this.g7n)) break block13;
                                }
                                catch (oov oov6) {
                                    throw d2q.a(oov6);
                                }
                            }
                            d2q3 = this;
                        }
                        catch (oov oov7) {
                            throw d2q.a(oov7);
                        }
                    }
                    d2q3.mbv = this._0l.getBlockState(this.g7n);
                }
                d2q2 = this;
            }
            zfz2 = d2q2.mbv;
        }
        return zfz2;
    }

    public pyk lvq() {
        pyk pyk2;
        block8: {
            d2q d2q2;
            block10: {
                block9: {
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                try {
                                    pyk2 = this.m7v;
                                    if (n == 0) break block8;
                                    if (pyk2 != null) break block9;
                                }
                                catch (oov oov2) {
                                    throw d2q.a(oov2);
                                }
                                d2q2 = this;
                                if (n == 0) break block10;
                            }
                            catch (oov oov3) {
                                throw d2q.a(oov3);
                            }
                            if (d2q2.cot) break block9;
                        }
                        catch (oov oov4) {
                            throw d2q.a(oov4);
                        }
                        this.m7v = this._0l.getTileEntity(this.g7n);
                        this.cot = true;
                    }
                    catch (oov oov5) {
                        throw d2q.a(oov5);
                    }
                }
                d2q2 = this;
            }
            pyk2 = d2q2.m7v;
        }
        return pyk2;
    }

    public mew i4m() {
        return this.g7n;
    }

    public static Predicate k1e(Predicate predicate) {
        return new d2q$1(predicate);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

