/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;

public class ccm
extends cjm {
    private final Predicate cyn = new ccm$1(this);
    public laq m8z;
    private double b37;
    private double _mp;
    public i2h xds;
    private float wx8;
    private t_2 o6c;
    private p8a h6d;
    private Class agm;
    private Predicate f48;

    public ccm(laq laq2, Class clazz, float f, double d, double d2) {
        this(laq2, clazz, Predicates.alwaysTrue(), f, d, d2);
    }

    public ccm(laq laq2, Class clazz, Predicate predicate, float f, double d, double d2) {
        this.m8z = laq2;
        this.agm = clazz;
        this.f48 = predicate;
        this.wx8 = f;
        this.b37 = d;
        this._mp = d2;
        this.h6d = laq2.zq2();
        this.k23(1);
    }

    @Override
    public boolean vle() {
        boolean bl;
        block21: {
            t_2 t_22;
            fqr fqr2;
            block19: {
                block20: {
                    ccm ccm2;
                    int n;
                    block17: {
                        block18: {
                            block15: {
                                List list;
                                block16: {
                                    n = t9d.c();
                                    list = this.m8z.oay.vie(this.agm, this.m8z.aaw().c2h(this.wx8, 3.0, this.wx8), Predicates.and((Predicate[])new Predicate[]{k0_.t1f, this.cyn, this.f48}));
                                    try {
                                        try {
                                            if (n != 0) break block15;
                                            if (!list.isEmpty()) break block16;
                                        }
                                        catch (oov oov2) {
                                            throw ccm.a(oov2);
                                        }
                                        return false;
                                    }
                                    catch (oov oov3) {
                                        throw ccm.a(oov3);
                                    }
                                }
                                this.xds = (i2h)list.get(0);
                            }
                            fqr2 = zim.sxc(this.m8z, 16, 7, new fqr(this.xds.o2v, this.xds.kfp, this.xds.vbd));
                            try {
                                if (fqr2 == null) {
                                    return false;
                                }
                            }
                            catch (oov oov4) {
                                throw ccm.a(oov4);
                            }
                            try {
                                try {
                                    ccm2 = this;
                                    if (n != 0) break block17;
                                    if (!(ccm2.xds.p53(fqr2.lvi, fqr2.gn5, fqr2.bn2) < this.xds.wxg(this.m8z))) break block18;
                                }
                                catch (oov oov5) {
                                    throw ccm.a(oov5);
                                }
                                return false;
                            }
                            catch (oov oov6) {
                                throw ccm.a(oov6);
                            }
                        }
                        this.o6c = this.h6d.yex(fqr2.lvi, fqr2.gn5, fqr2.bn2);
                        ccm2 = this;
                    }
                    try {
                        try {
                            t_22 = ccm2.o6c;
                            if (n != 0) break block19;
                            if (t_22 != null) break block20;
                        }
                        catch (oov oov7) {
                            throw ccm.a(oov7);
                        }
                        bl = false;
                        break block21;
                    }
                    catch (oov oov8) {
                        throw ccm.a(oov8);
                    }
                }
                t_22 = this.o6c;
            }
            bl = t_22.gt8(fqr2);
        }
        return bl;
    }

    @Override
    public boolean wh3() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.h6d.j07();
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw ccm.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void mnp() {
        this.h6d.sh7(this.o6c, this.b37);
    }

    @Override
    public void zly() {
        this.xds = null;
    }

    @Override
    public void iad() {
        block8: {
            laq laq2;
            block6: {
                int n = t9d.b();
                try {
                    block7: {
                        try {
                            try {
                                laq2 = this.m8z;
                                if (n == 0) break block6;
                                if (!(laq2.wxg(this.xds) < 49.0)) break block7;
                            }
                            catch (oov oov2) {
                                throw ccm.a(oov2);
                            }
                            this.m8z.zq2().rbp(this._mp);
                            if (n != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw ccm.a(oov3);
                        }
                    }
                    laq2 = this.m8z;
                }
                catch (oov oov4) {
                    throw ccm.a(oov4);
                }
            }
            laq2.zq2().rbp(this.b37);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

