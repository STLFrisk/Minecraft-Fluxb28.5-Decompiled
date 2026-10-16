/*
 * Decompiled with CFR 0.152.
 */
public class dge$dsq
extends cjm {
    private dge fe0;

    public dge$dsq(dge dge2) {
        this.fe0 = dge2;
        this.k23(5);
        ((zvv)dge2.zq2()).wxx(true);
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
                                bl = this.fe0.mwv();
                                if (n != 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw dge$dsq.a(oov2);
                            }
                            bl = this.fe0.b2u();
                            if (n != 0) break block6;
                        }
                        catch (oov oov3) {
                            throw dge$dsq.a(oov3);
                        }
                        if (!bl) break block8;
                    }
                    catch (oov oov4) {
                        throw dge$dsq.a(oov4);
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
        dge dge2;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        dge2 = this.fe0;
                        if (n == 0) break block4;
                        if (!(dge2.mbr().nextFloat() < 0.8f)) break block5;
                    }
                    catch (oov oov2) {
                        throw dge$dsq.a(oov2);
                    }
                    this.fe0.wzk().nqf();
                }
                catch (oov oov3) {
                    throw dge$dsq.a(oov3);
                }
            }
            dge2 = this.fe0;
        }
        ((dge$ilj)dge2.gvh()).eww(1.2);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

