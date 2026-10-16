/*
 * Decompiled with CFR 0.152.
 */
public class crp$j3h {
    public final kqk xvr;
    public vt2 rkx;
    public int b3g;

    public crp$j3h(kqk kqk2, vt2 vt22, int n) {
        this.xvr = kqk2;
        this.rkx = vt22;
        this.b3g = n;
    }

    public void po_(byte by, vt2 vt22) {
        this.b3g = this.b3g | by | 1 << vt22.ordinal();
    }

    public boolean hxl(vt2 vt22) {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.b3g & 1 << vt22.ordinal();
                    if (n == 0) break block2;
                    if (bl <= false) break block3;
                }
                catch (oov oov2) {
                    throw crp$j3h.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    private void bk9(vt2 vt22, int n) {
        this.rkx = vt22;
        this.b3g = n;
    }

    public static void u1n(crp$j3h crp$j3h, vt2 vt22, int n) {
        crp$j3h.bk9(vt22, n);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

