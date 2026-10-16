/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

public class ccm$1
implements Predicate {
    public final ccm l01;

    public ccm$1(ccm ccm2) {
        this.l01 = ccm2;
    }

    public boolean joq(i2h i2h2) {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = t9d.b();
                    try {
                        try {
                            bl = i2h2.gzr();
                            if (n == 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (oov oov2) {
                            throw ccm$1.a(oov2);
                        }
                        bl = this.l01.m8z.dov().ik5(i2h2);
                    }
                    catch (oov oov3) {
                        throw ccm$1.a(oov3);
                    }
                }
                try {
                    if (n == 0) break block8;
                    if (!bl) break block7;
                }
                catch (oov oov4) {
                    throw ccm$1.a(oov4);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public boolean apply(Object object) {
        return this.joq((i2h)object);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

