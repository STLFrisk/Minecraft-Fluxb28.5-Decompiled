/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;

public class d1f$1
implements Predicate {
    public final d1f uew;

    public d1f$1(d1f d1f2) {
        this.uew = d1f2;
    }

    public boolean qsu(r11 r112) {
        boolean bl;
        block8: {
            block7: {
                String string;
                int n;
                block6: {
                    n = t9d.c();
                    try {
                        try {
                            string = r112.tg2();
                            if (n != 0) break block6;
                            if (string == null) break block7;
                        }
                        catch (oov oov2) {
                            throw d1f$1.a(oov2);
                        }
                        string = r112.tg2();
                    }
                    catch (oov oov3) {
                        throw d1f$1.a(oov3);
                    }
                }
                try {
                    bl = string.startsWith("#");
                    if (n != 0) break block8;
                    if (bl) break block7;
                }
                catch (oov oov4) {
                    throw d1f$1.a(oov4);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public boolean apply(Object object) {
        return this.qsu((r11)object);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

