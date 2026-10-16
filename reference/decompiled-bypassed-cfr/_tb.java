/*
 * Decompiled with CFR 0.152.
 */
public class _tb
extends cjm {
    private /* synthetic */ laq qgq;
    private /* synthetic */ double ei1;
    private /* synthetic */ double y52;
    private /* synthetic */ double p4f;
    private /* synthetic */ double k8k;
    private /* synthetic */ int xwc;
    private /* synthetic */ boolean xfm;

    public _tb(laq laq2, double d) {
        this(laq2, d, 120);
    }

    public _tb(laq laq2, double d, int n) {
        this.qgq = laq2;
        this.k8k = d;
        this.xwc = n;
        this.k23(1);
    }

    @Override
    public boolean vle() {
        block22: {
            fqr fqr2;
            block23: {
                laq laq2;
                int n;
                block21: {
                    _tb _tb2;
                    block17: {
                        block18: {
                            int n2;
                            block19: {
                                block20: {
                                    n = t9d.c();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    _tb2 = this;
                                                    if (n != 0) break block17;
                                                    if (_tb2.xfm) break block18;
                                                }
                                                catch (oov oov2) {
                                                    throw _tb.a(oov2);
                                                }
                                                n2 = this.qgq.c67();
                                                if (n != 0) break block19;
                                            }
                                            catch (oov oov3) {
                                                throw _tb.a(oov3);
                                            }
                                            if (n2 < 100) break block20;
                                        }
                                        catch (oov oov4) {
                                            throw _tb.a(oov4);
                                        }
                                        return false;
                                    }
                                    catch (oov oov5) {
                                        throw _tb.a(oov5);
                                    }
                                }
                                try {
                                    laq2 = this.qgq;
                                    if (n != 0) break block21;
                                    n2 = laq2.mbr().nextInt(this.xwc);
                                }
                                catch (oov oov6) {
                                    throw _tb.a(oov6);
                                }
                            }
                            try {
                                if (n2 != 0) {
                                    return false;
                                }
                            }
                            catch (oov oov7) {
                                throw _tb.a(oov7);
                            }
                        }
                        _tb2 = this;
                    }
                    laq2 = _tb2.qgq;
                }
                fqr2 = zim.jb8(laq2, 10, 7);
                try {
                    try {
                        if (n != 0) break block22;
                        if (fqr2 != null) break block23;
                    }
                    catch (oov oov8) {
                        throw _tb.a(oov8);
                    }
                    return false;
                }
                catch (oov oov9) {
                    throw _tb.a(oov9);
                }
            }
            this.ei1 = fqr2.lvi;
            this.y52 = fqr2.gn5;
            this.p4f = fqr2.bn2;
            this.xfm = false;
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
                    bl = this.qgq.zq2().j07();
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw _tb.a(oov2);
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
        this.qgq.zq2().ni_(this.ei1, this.y52, this.p4f, this.k8k);
    }

    public void x6d() {
        this.xfm = true;
    }

    public void kj8(int n) {
        this.xwc = n;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

