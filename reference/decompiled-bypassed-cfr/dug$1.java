/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

public class dug$1
implements Predicate {
    public final dug y_l;

    public dug$1(dug dug2) {
        this.y_l = dug2;
    }

    public boolean h60(g_3 g_32) {
        boolean bl;
        block11: {
            block9: {
                int n;
                block10: {
                    g_3 g_33;
                    block8: {
                        n = t9d.b();
                        try {
                            g_33 = g_32;
                            if (n == 0) break block8;
                            if (g_33 == null) break block9;
                        }
                        catch (oov oov2) {
                            throw dug$1.a(oov2);
                        }
                        g_33 = g_32;
                    }
                    try {
                        try {
                            bl = g_33.gzr();
                            if (n == 0) break block10;
                            if (!bl) break block9;
                        }
                        catch (oov oov3) {
                            throw dug$1.a(oov3);
                        }
                        bl = this.y_l.cfv(g_32.d3d());
                    }
                    catch (oov oov4) {
                        throw dug$1.a(oov4);
                    }
                }
                try {
                    if (n == 0) break block11;
                    if (!bl) break block9;
                }
                catch (oov oov5) {
                    throw dug$1.a(oov5);
                }
                bl = true;
                break block11;
            }
            bl = false;
        }
        return bl;
    }

    public boolean apply(Object object) {
        return this.h60((g_3)object);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

