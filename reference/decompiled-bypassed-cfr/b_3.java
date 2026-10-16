/*
 * Decompiled with CFR 0.152.
 */
public class b_3
extends c8g {
    private final /* synthetic */ Object ptp;

    public b_3(Object object) {
        this.ptp = object;
    }

    @Override
    public Object _gz(Object object) {
        Object object2;
        block4: {
            Object object3;
            block5: {
                int n = t9d.b();
                object3 = super._gz(object);
                try {
                    try {
                        object2 = object3;
                        if (n == 0) break block4;
                        if (object2 != null) break block5;
                    }
                    catch (oov oov2) {
                        throw b_3.a(oov2);
                    }
                    object2 = this.ptp;
                    break block4;
                }
                catch (oov oov3) {
                    throw b_3.a(oov3);
                }
            }
            object2 = object3;
        }
        return object2;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

