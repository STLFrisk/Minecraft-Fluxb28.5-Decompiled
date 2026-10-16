/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

public class c9p$1
implements Predicate {
    public final c9p x2z;

    public c9p$1(c9p c9p2) {
        this.x2z = c9p2;
    }

    public boolean mb1(z96 z962) {
        double d;
        block8: {
            block7: {
                int n;
                block6: {
                    n = t9d.c();
                    try {
                        try {
                            double d2 = this.x2z.wxg(z962) - 2500.0;
                            d = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                            if (n != 0) break block6;
                            if (d >= 0) break block7;
                        }
                        catch (oov oov2) {
                            throw c9p$1.a(oov2);
                        }
                        d = (double)z962._am.pcm();
                    }
                    catch (oov oov3) {
                        throw c9p$1.a(oov3);
                    }
                }
                try {
                    if (n != 0) break block8;
                    if (d == false) break block7;
                }
                catch (oov oov4) {
                    throw c9p$1.a(oov4);
                }
                d = 1.0;
                break block8;
            }
            d = 0.0;
        }
        return (boolean)d;
    }

    public boolean apply(Object object) {
        return this.mb1((z96)object);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

