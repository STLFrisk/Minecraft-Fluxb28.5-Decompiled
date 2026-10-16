/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

public class c9p$rw9
implements Predicate {
    private c9p lxt;

    public c9p$rw9(c9p c9p2) {
        this.lxt = c9p2;
    }

    public boolean bfk(g_3 g_32) {
        boolean bl;
        block13: {
            block12: {
                int n;
                block10: {
                    n = t9d.c();
                    try {
                        double d;
                        block11: {
                            try {
                                try {
                                    try {
                                        bl = g_32 instanceof ha9;
                                        if (n != 0) break block10;
                                        if (bl) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw c9p$rw9.a(oov2);
                                    }
                                    bl = g_32 instanceof w8s;
                                    if (n != 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw c9p$rw9.a(oov3);
                                }
                                if (!bl) break block12;
                            }
                            catch (oov oov4) {
                                throw c9p$rw9.a(oov4);
                            }
                        }
                        bl = (d = g_32.wxg(this.lxt) - 9.0) == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                    }
                    catch (oov oov5) {
                        throw c9p$rw9.a(oov5);
                    }
                }
                try {
                    if (n != 0) break block13;
                    if (bl <= false) break block12;
                }
                catch (oov oov6) {
                    throw c9p$rw9.a(oov6);
                }
                bl = true;
                break block13;
            }
            bl = false;
        }
        return bl;
    }

    public boolean apply(Object object) {
        return this.bfk((g_3)object);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

