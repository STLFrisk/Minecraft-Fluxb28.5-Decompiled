/*
 * Decompiled with CFR 0.152.
 */
public class dnq
extends cjm {
    private /* synthetic */ yqv px5;

    public dnq(yqv yqv2) {
        this.px5 = yqv2;
        this.k23(4);
        ((zvv)yqv2.zq2()).wxx(true);
    }

    @Override
    public boolean vle() {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                bl = this.px5.mwv();
                                if (n != 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw dnq.a(oov2);
                            }
                            bl = this.px5.b2u();
                            if (n != 0) break block6;
                        }
                        catch (oov oov3) {
                            throw dnq.a(oov3);
                        }
                        if (!bl) break block8;
                    }
                    catch (oov oov4) {
                        throw dnq.a(oov4);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void iad() {
        block5: {
            yqv yqv2;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        yqv2 = this.px5;
                        if (n == 0) break block4;
                        if (!(yqv2.mbr().nextFloat() < 0.8f)) break block5;
                    }
                    catch (oov oov2) {
                        throw dnq.a(oov2);
                    }
                    yqv2 = this.px5;
                }
                catch (oov oov3) {
                    throw dnq.a(oov3);
                }
            }
            yqv2.wzk().nqf();
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

