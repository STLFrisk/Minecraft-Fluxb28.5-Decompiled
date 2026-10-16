/*
 * Decompiled with CFR 0.152.
 */
public class a2s
extends e0x {
    public a2s() {
        super(p3y.fdu);
        this.i3l(uja.qqf);
    }

    @Override
    public boolean cl2(t9d t9d2, mew mew2, zfz zfz2, ha9 ha92, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = t9d2.v0f;
                        if (n == 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw a2s.a(oov2);
                    }
                    return true;
                }
                catch (oov oov3) {
                    throw a2s.a(oov3);
                }
            }
            ha92.xz_(new a2s$g9w(t9d2, mew2));
            ha92.aex(l9p.jf0);
            bl = true;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

