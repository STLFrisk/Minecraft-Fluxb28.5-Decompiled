/*
 * Decompiled with CFR 0.152.
 */
@dr9$x0j(t2u="vclip", io4={"<height>"}, hjc="Teleport in the horizontal direction")
public class btn
extends dr9 {
    /*
     * Unable to fully structure code
     */
    @Override
    public void xjl(String[] var1_1) {
        block19: {
            block20: {
                block17: {
                    var2_2 = t9d.b();
                    try {
                        try {
                            block18: {
                                try {
                                    try {
                                        v0 = var1_1.length;
                                        v1 = 1;
                                        if (var2_2 == 0) break block17;
                                        if (v0 <= v1) break block18;
                                    }
                                    catch (oov v2) {
                                        throw btn.a(v2);
                                    }
                                    this.dhs();
                                    if (var2_2 != 0) break block19;
                                }
                                catch (oov v3) {
                                    throw btn.a(v3);
                                }
                            }
                            v0 = var1_1.length;
                            if (var2_2 == 0) break block20;
                        }
                        catch (oov v4) {
                            throw btn.a(v4);
                        }
                        v1 = 1;
                    }
                    catch (oov v5) {
                        throw btn.a(v5);
                    }
                }
                try {
                    if (v0 == v1) {
                        v0 = (int)rak.fye(var1_1[0]);
                    }
                    ** GOTO lbl52
                }
                catch (oov v6) {
                    throw btn.a(v6);
                }
            }
            try {
                try {
                    block21: {
                        try {
                            if (v0 == 0) break block21;
                            this.rpq.vg8.m6_(this.rpq.vg8.o2v, this.rpq.vg8.kfp + Double.parseDouble(var1_1[0]), this.rpq.vg8.vbd);
                            if (var2_2 != 0) break block19;
                        }
                        catch (oov v7) {
                            throw btn.a(v7);
                        }
                    }
                    this.dhs();
                    if (var2_2 != 0) break block19;
                }
                catch (oov v8) {
                    throw btn.a(v8);
                }
lbl52:
                // 2 sources

                this.dhs();
            }
            catch (oov v9) {
                throw btn.a(v9);
            }
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

