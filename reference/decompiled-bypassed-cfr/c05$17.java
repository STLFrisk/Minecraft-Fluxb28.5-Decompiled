/*
 * Decompiled with CFR 0.152.
 */
public class c05$17
implements ha_ {
    public final c05 h5b;

    public c05$17(c05 c052) {
        this.h5b = c052;
    }

    @Override
    public void confirmClicked(boolean bl, int n) {
        try {
            if (bl) {
                this.h5b.vnk().ywg();
            }
        }
        catch (oov oov2) {
            throw c05$17.a(oov2);
        }
        this.h5b.z2i(null);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

