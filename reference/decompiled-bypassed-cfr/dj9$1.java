/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.primitives.Floats
 */
import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;

public class dj9$1
implements Predicate {
    public final dj9 yeg;

    public dj9$1(dj9 dj92) {
        this.yeg = dj92;
    }

    public boolean cjg(String string) {
        int n;
        block12: {
            block15: {
                block13: {
                    int n2;
                    block16: {
                        Float f;
                        Float f2;
                        block14: {
                            n2 = t9d.b();
                            f2 = Floats.tryParse((String)string);
                            try {
                                try {
                                    try {
                                        n = string.length();
                                        if (n2 == 0) break block12;
                                        if (n == 0) break block13;
                                    }
                                    catch (oov oov2) {
                                        throw dj9$1.a(oov2);
                                    }
                                    f = f2;
                                    if (n2 == 0) break block14;
                                }
                                catch (oov oov3) {
                                    throw dj9$1.a(oov3);
                                }
                                if (f == null) break block15;
                            }
                            catch (oov oov4) {
                                throw dj9$1.a(oov4);
                            }
                            f = f2;
                        }
                        try {
                            try {
                                n = Floats.isFinite((float)f.floatValue());
                                if (n2 == 0) break block16;
                                if (n == 0) break block15;
                            }
                            catch (oov oov5) {
                                throw dj9$1.a(oov5);
                            }
                            float f3 = f2.floatValue() - 0.0f;
                            n = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                        }
                        catch (oov oov6) {
                            throw dj9$1.a(oov6);
                        }
                    }
                    try {
                        if (n2 == 0) break block12;
                        if (n < 0) break block15;
                    }
                    catch (oov oov7) {
                        throw dj9$1.a(oov7);
                    }
                }
                n = 1;
                break block12;
            }
            n = 0;
        }
        return n != 0;
    }

    public boolean apply(Object object) {
        return this.cjg((String)object);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

