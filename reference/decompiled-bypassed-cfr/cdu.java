/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class cdu {
    private final /* synthetic */ boolean h7t;

    public cdu() {
        this(false);
    }

    public cdu(boolean bl) {
        this.h7t = bl;
    }

    public abstract boolean v3g(t9d var1, Random var2, mew var3);

    public void n3m() {
    }

    public void u0f(t9d t9d2, mew mew2, zfz zfz2) {
        block6: {
            int n = t9d.b();
            try {
                boolean bl;
                block7: {
                    try {
                        try {
                            bl = this.h7t;
                            if (n == 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (oov oov2) {
                            throw cdu.b(oov2);
                        }
                        t9d2.vct(mew2, zfz2, 3);
                        if (n != 0) break block6;
                    }
                    catch (oov oov3) {
                        throw cdu.b(oov3);
                    }
                }
                bl = t9d2.vct(mew2, zfz2, 2);
            }
            catch (oov oov4) {
                throw cdu.b(oov4);
            }
        }
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

