/*
 * Decompiled with CFR 0.152.
 */
public class ax_ {
    private final /* synthetic */ int y40;
    private final /* synthetic */ mew num;
    private /* synthetic */ int p7v;
    private /* synthetic */ int y82;

    public ax_(int n, mew mew2) {
        this.y40 = n;
        this.num = mew2;
    }

    public mew q6p() {
        return this.num;
    }

    public void fhs(int n) {
        block5: {
            int n2;
            block4: {
                int n3 = t9d.b();
                try {
                    try {
                        n2 = n;
                        if (n3 == 0) break block4;
                        if (n2 <= 10) break block5;
                    }
                    catch (oov oov2) {
                        throw ax_.a(oov2);
                    }
                    n2 = 10;
                }
                catch (oov oov3) {
                    throw ax_.a(oov3);
                }
            }
            n = n2;
        }
        this.p7v = n;
    }

    public int fll() {
        return this.p7v;
    }

    public void p8t(int n) {
        this.y82 = n;
    }

    public int y69() {
        return this.y82;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

