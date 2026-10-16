/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class _fn
extends cjm {
    private /* synthetic */ laq _rj;
    private /* synthetic */ double o93;
    private /* synthetic */ double zkk;
    private /* synthetic */ double rtr;
    private /* synthetic */ double qie;
    private /* synthetic */ t9d sbi;

    public _fn(laq laq2, double d) {
        this._rj = laq2;
        this.qie = d;
        this.sbi = laq2.oay;
        this.k23(1);
    }

    @Override
    public boolean vle() {
        block22: {
            fqr fqr2;
            block23: {
                _fn _fn2;
                int n;
                block21: {
                    boolean bl;
                    block19: {
                        block20: {
                            block17: {
                                block18: {
                                    n = t9d.b();
                                    try {
                                        try {
                                            bl = this.sbi.m40();
                                            if (n == 0) break block17;
                                            if (bl) break block18;
                                        }
                                        catch (oov oov2) {
                                            throw _fn.a(oov2);
                                        }
                                        return false;
                                    }
                                    catch (oov oov3) {
                                        throw _fn.a(oov3);
                                    }
                                }
                                bl = this._rj.agj();
                            }
                            try {
                                try {
                                    if (n == 0) break block19;
                                    if (bl) break block20;
                                }
                                catch (oov oov4) {
                                    throw _fn.a(oov4);
                                }
                                return false;
                            }
                            catch (oov oov5) {
                                throw _fn.a(oov5);
                            }
                        }
                        try {
                            _fn2 = this;
                            if (n == 0) break block21;
                            bl = _fn2.sbi.cfv(new mew(this._rj.o2v, this._rj.aaw().bx_, this._rj.vbd));
                        }
                        catch (oov oov6) {
                            throw _fn.a(oov6);
                        }
                    }
                    try {
                        if (!bl) {
                            return false;
                        }
                    }
                    catch (oov oov7) {
                        throw _fn.a(oov7);
                    }
                    _fn2 = this;
                }
                fqr2 = _fn2.ps3();
                try {
                    try {
                        if (n == 0) break block22;
                        if (fqr2 != null) break block23;
                    }
                    catch (oov oov8) {
                        throw _fn.a(oov8);
                    }
                    return false;
                }
                catch (oov oov9) {
                    throw _fn.a(oov9);
                }
            }
            this.o93 = fqr2.lvi;
            this.zkk = fqr2.gn5;
            this.rtr = fqr2.bn2;
        }
        return true;
    }

    @Override
    public boolean wh3() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this._rj.zq2().j07();
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw _fn.a(oov2);
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
        this._rj.zq2().ni_(this.o93, this.zkk, this.rtr, this.qie);
    }

    private fqr ps3() {
        Random random = this._rj.mbr();
        mew mew2 = new mew(this._rj.o2v, this._rj.aaw().bx_, this._rj.vbd);
        int n = 0;
        int n2 = t9d.c();
        while (n < 10) {
            block7: {
                block8: {
                    mew mew3 = mew2.ec4(random.nextInt(20) - 10, random.nextInt(6) - 3, random.nextInt(20) - 10);
                    try {
                        try {
                            try {
                                if (n2 != 0) break block7;
                                if (this.sbi.cfv(mew3)) break block8;
                            }
                            catch (oov oov2) {
                                throw _fn.a(oov2);
                            }
                            if (!(this._rj.ncy(mew3) < 0.0f)) break block8;
                        }
                        catch (oov oov3) {
                            throw _fn.a(oov3);
                        }
                        return new fqr(mew3.getX(), mew3.getY(), mew3.getZ());
                    }
                    catch (oov oov4) {
                        throw _fn.a(oov4);
                    }
                }
                ++n;
            }
            if (n2 == 0) continue;
        }
        return null;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

