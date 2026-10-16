/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

public final class d2q$1
implements Predicate {
    public final Predicate azb;

    public d2q$1(Predicate predicate) {
        this.azb = predicate;
    }

    public boolean ow_(d2q d2q2) {
        boolean bl;
        block5: {
            block4: {
                int n = t9d.c();
                try {
                    try {
                        if (d2q2 == null) break block4;
                        bl = this.azb.apply((Object)d2q2.uc6());
                        if (n != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw d2q$1.a(oov2);
                    }
                    if (!bl) break block4;
                }
                catch (oov oov3) {
                    throw d2q$1.a(oov3);
                }
                bl = true;
                break block5;
            }
            bl = false;
        }
        return bl;
    }

    public boolean apply(Object object) {
        return this.ow_((d2q)object);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

