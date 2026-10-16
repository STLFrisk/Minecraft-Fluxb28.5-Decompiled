/*
 * Decompiled with CFR 0.152.
 */
public class eep
extends mcs {
    public eep(int n, gdz gdz2, boolean bl, int n2) {
        super(n, gdz2, bl, n2);
    }

    @Override
    public void iqt(g_3 g_32, osd osd2, int n) {
        block5: {
            g_3 g_33;
            block4: {
                int n2 = t9d.b();
                try {
                    try {
                        super.iqt(g_32, osd2, n);
                        g_33 = g_32;
                        if (n2 == 0) break block4;
                        if (!(g_33.i55() > g_32.axb())) break block5;
                    }
                    catch (oov oov2) {
                        throw eep.a(oov2);
                    }
                    g_33 = g_32;
                }
                catch (oov oov3) {
                    throw eep.a(oov3);
                }
            }
            g_33.uh3(g_32.axb());
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

