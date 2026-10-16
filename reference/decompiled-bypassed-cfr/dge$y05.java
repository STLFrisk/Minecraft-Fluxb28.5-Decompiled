/*
 * Decompiled with CFR 0.152.
 */
public class dge$y05
extends cjm {
    private dge i72;
    private float hr2;
    private int e5m;

    public dge$y05(dge dge2) {
        this.i72 = dge2;
        this.k23(2);
    }

    @Override
    public boolean vle() {
        boolean bl;
        block16: {
            block15: {
                block17: {
                    dge dge2;
                    int n;
                    block14: {
                        n = t9d.b();
                        try {
                            try {
                                dge2 = this.i72;
                                if (n == 0) break block14;
                                if (dge2.q4v() != null) break block15;
                            }
                            catch (oov oov2) {
                                throw dge$y05.a(oov2);
                            }
                            dge2 = this.i72;
                        }
                        catch (oov oov3) {
                            throw dge$y05.a(oov3);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        bl = dge2.lfk;
                                        if (n == 0) break block16;
                                        if (bl) break block17;
                                    }
                                    catch (oov oov4) {
                                        throw dge$y05.a(oov4);
                                    }
                                    bl = this.i72.mwv();
                                    if (n == 0) break block16;
                                }
                                catch (oov oov5) {
                                    throw dge$y05.a(oov5);
                                }
                                if (bl) break block17;
                            }
                            catch (oov oov6) {
                                throw dge$y05.a(oov6);
                            }
                            bl = this.i72.b2u();
                            if (n == 0) break block16;
                        }
                        catch (oov oov7) {
                            throw dge$y05.a(oov7);
                        }
                        if (!bl) break block15;
                    }
                    catch (oov oov8) {
                        throw dge$y05.a(oov8);
                    }
                }
                bl = true;
                break block16;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void iad() {
        dge$y05 dge$y05;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        dge$y05 = this;
                        if (n != 0) break block4;
                        if (--dge$y05.e5m > 0) break block5;
                    }
                    catch (oov oov2) {
                        throw dge$y05.a(oov2);
                    }
                    this.e5m = 40 + this.i72.mbr().nextInt(60);
                    this.hr2 = this.i72.mbr().nextInt(360);
                }
                catch (oov oov3) {
                    throw dge$y05.a(oov3);
                }
            }
            dge$y05 = this;
        }
        ((dge$ilj)dge$y05.i72.gvh()).c1a(this.hr2, false);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

