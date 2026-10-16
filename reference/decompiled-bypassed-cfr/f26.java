/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class f26
extends d26 {
    @Override
    public u7m j39(zfz zfz2, Random random, int n) {
        u7m u7m2;
        int n2;
        block4: {
            block5: {
                int n3 = t9d.b();
                try {
                    n2 = n;
                    if (n3 == 0) break block4;
                    if (n2 <= 3) break block5;
                }
                catch (oov oov2) {
                    throw f26.b(oov2);
                }
                n = 3;
            }
            n2 = random.nextInt(10 - n * 3);
        }
        try {
            u7m2 = n2 == 0 ? xbr.hgw : u7m.gfm(this);
        }
        catch (oov oov3) {
            throw f26.b(oov3);
        }
        return u7m2;
    }

    @Override
    public _mi uoz(zfz zfz2) {
        return _mi.eo9;
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

