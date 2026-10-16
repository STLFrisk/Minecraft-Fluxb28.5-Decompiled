/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class f3x$_t2$1
implements Comparator {
    public final f3x m65;
    public final f3x$_t2 sja;

    public f3x$_t2$1(f3x$_t2 _t22, f3x f3x2) {
        this.sja = _t22;
        this.m65 = f3x2;
    }

    public int wh_(rlk rlk2, rlk rlk3) {
        int n;
        int n2;
        block31: {
            int n3;
            int n4;
            block28: {
                _ss _ss2;
                _ss _ss3;
                int n5;
                _ss _ss4;
                block29: {
                    block30: {
                        block26: {
                            block27: {
                                block32: {
                                    int n6;
                                    int n7;
                                    block24: {
                                        block25: {
                                            block22: {
                                                block23: {
                                                    n4 = u7m._lo(rlk2.u3i());
                                                    n3 = u7m._lo(rlk3.u3i());
                                                    _ss4 = null;
                                                    n5 = t9d.c();
                                                    _ss3 = null;
                                                    try {
                                                        n7 = this.sja.c9s;
                                                        if (n5 != 0) break block22;
                                                        if (n7 != 0) break block23;
                                                    }
                                                    catch (oov oov2) {
                                                        throw f3x$_t2$1.a(oov2);
                                                    }
                                                    _ss4 = l9p.ysy[n4];
                                                    _ss3 = l9p.ysy[n3];
                                                    break block32;
                                                }
                                                n7 = this.sja.c9s;
                                            }
                                            try {
                                                n6 = 1;
                                                if (n5 != 0) break block24;
                                                if (n7 != n6) break block25;
                                            }
                                            catch (oov oov3) {
                                                throw f3x$_t2$1.a(oov3);
                                            }
                                            _ss4 = l9p._ee[n4];
                                            _ss3 = l9p._ee[n3];
                                            break block32;
                                        }
                                        n7 = this.sja.c9s;
                                        n6 = 2;
                                    }
                                    if (n7 == n6) {
                                        _ss4 = l9p.foo[n4];
                                        _ss3 = l9p.foo[n3];
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            _ss2 = _ss4;
                                            if (n5 != 0) break block26;
                                            if (_ss2 != null) break block27;
                                        }
                                        catch (oov oov4) {
                                            throw f3x$_t2$1.a(oov4);
                                        }
                                        _ss2 = _ss3;
                                        if (n5 != 0) break block26;
                                    }
                                    catch (oov oov5) {
                                        throw f3x$_t2$1.a(oov5);
                                    }
                                    if (_ss2 == null) break block28;
                                }
                                catch (oov oov6) {
                                    throw f3x$_t2$1.a(oov6);
                                }
                            }
                            _ss2 = _ss4;
                        }
                        try {
                            try {
                                if (n5 != 0) break block29;
                                if (_ss2 != null) break block30;
                            }
                            catch (oov oov7) {
                                throw f3x$_t2$1.a(oov7);
                            }
                            return 1;
                        }
                        catch (oov oov8) {
                            throw f3x$_t2$1.a(oov8);
                        }
                    }
                    _ss2 = _ss3;
                }
                try {
                    if (_ss2 == null) {
                        return -1;
                    }
                }
                catch (oov oov9) {
                    throw f3x$_t2$1.a(oov9);
                }
                int n8 = f3x.h5z(this.sja.o75).zgq(_ss4);
                int n9 = f3x.h5z(this.sja.o75).zgq(_ss3);
                try {
                    try {
                        n2 = n8;
                        n = n9;
                        if (n5 != 0) break block31;
                        if (n2 == n) break block28;
                    }
                    catch (oov oov10) {
                        throw f3x$_t2$1.a(oov10);
                    }
                    return (n8 - n9) * this.sja.uh5;
                }
                catch (oov oov11) {
                    throw f3x$_t2$1.a(oov11);
                }
            }
            n2 = n4;
            n = n3;
        }
        return n2 - n;
    }

    public int compare(Object object, Object object2) {
        return this.wh_((rlk)object, (rlk)object2);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

