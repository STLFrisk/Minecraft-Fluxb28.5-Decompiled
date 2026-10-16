/*
 * Decompiled with CFR 0.152.
 */
public class cbo
extends kqk {
    private final /* synthetic */ int gby;

    public cbo(t9d t9d2, crp crp2, mew mew2, int n) {
        super(t9d2, crp2, mew2, n);
        this.gby = nkx.ux1(w51.values().length);
    }

    public int _yp(w51 w512, cbc cbc2) {
        int n;
        block4: {
            block5: {
                int n2 = t9d.b();
                try {
                    try {
                        n = cbc2.jo2(w512);
                        if (n2 == 0) break block4;
                        if (n != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw cbo.a(oov2);
                    }
                    n = this.gby + w512.ordinal();
                    break block4;
                }
                catch (oov oov3) {
                    throw cbo.a(oov3);
                }
            }
            n = -1;
        }
        return n;
    }

    @Override
    public void qv0() {
        super.qv0();
        nkx.xz4(this.gby, w51.values().length);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

