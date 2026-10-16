/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

public final class a4v$1
implements Predicate {
    public boolean lh4(vt2 vt22) {
        boolean bl;
        try {
            bl = vt22 != vt2.rf3;
        }
        catch (oov oov2) {
            throw a4v$1.a(oov2);
        }
        return bl;
    }

    public boolean apply(Object object) {
        return this.lh4((vt2)object);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

