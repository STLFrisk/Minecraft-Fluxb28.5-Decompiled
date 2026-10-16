/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

public class _z_$1
implements Predicate {
    public final _z_ h3t;

    public _z_$1(_z_ _z_2) {
        this.h3t = _z_2;
    }

    public boolean q7h(g_3 g_32) {
        boolean bl;
        block12: {
            block13: {
                int n;
                block10: {
                    double d;
                    block11: {
                        block8: {
                            block9: {
                                n = t9d.c();
                                d = this.h3t.f_m();
                                try {
                                    bl = g_32.hzv();
                                    if (n != 0) break block8;
                                    if (!bl) break block9;
                                }
                                catch (oov oov2) {
                                    throw _z_$1.a(oov2);
                                }
                                d *= (double)0.8f;
                            }
                            bl = g_32.h5u();
                        }
                        try {
                            try {
                                if (n != 0) break block10;
                                if (!bl) break block11;
                            }
                            catch (oov oov3) {
                                throw _z_$1.a(oov3);
                            }
                            bl = false;
                            break block12;
                        }
                        catch (oov oov4) {
                            throw _z_$1.a(oov4);
                        }
                    }
                    double d2 = (double)g_32.tm6(_z_.g3s(this.h3t)) - d;
                    bl = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                }
                try {
                    if (n != 0) break block12;
                    if (bl <= false) break block13;
                }
                catch (oov oov5) {
                    throw _z_$1.a(oov5);
                }
                bl = false;
                break block12;
            }
            bl = wel.u2d(_z_.g3s(this.h3t), g_32, false, true);
        }
        return bl;
    }

    public boolean apply(Object object) {
        return this.q7h((g_3)object);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

