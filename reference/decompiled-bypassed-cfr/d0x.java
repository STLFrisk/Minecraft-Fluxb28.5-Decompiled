/*
 * Decompiled with CFR 0.152.
 */
@dr9$x0j(t2u="hclip", io4={"<distance>"}, hjc="Teleport in the horizontal direction")
public class d0x
extends dr9 {
    /*
     * Unable to fully structure code
     */
    @Override
    public void xjl(String[] var1_1) {
        block22: {
            block24: {
                block23: {
                    block20: {
                        var2_2 = t9d.c();
                        try {
                            try {
                                block21: {
                                    try {
                                        try {
                                            v0 = var1_1.length;
                                            v1 = 1;
                                            if (var2_2 != 0) break block20;
                                            if (v0 <= v1) break block21;
                                        }
                                        catch (oov v2) {
                                            throw d0x.a(v2);
                                        }
                                        this.dhs();
                                        if (var2_2 == 0) break block22;
                                    }
                                    catch (oov v3) {
                                        throw d0x.a(v3);
                                    }
                                }
                                v0 = var1_1.length;
                                if (var2_2 != 0) break block23;
                            }
                            catch (oov v4) {
                                throw d0x.a(v4);
                            }
                            v1 = 1;
                        }
                        catch (oov v5) {
                            throw d0x.a(v5);
                        }
                    }
                    try {
                        try {
                            if (v0 == v1) {
                                v6 = var1_1[0];
                                if (var2_2 != 0) break block24;
                            }
                            ** GOTO lbl67
                        }
                        catch (oov v7) {
                            throw d0x.a(v7);
                        }
                        v0 = (int)rak.fye(v6);
                    }
                    catch (oov v8) {
                        throw d0x.a(v8);
                    }
                }
                try {
                    if (v0 != 0) {
                        v6 = var1_1[0];
                    }
                    ** GOTO lbl62
                }
                catch (oov v9) {
                    throw d0x.a(v9);
                }
            }
            var3_3 = Float.parseFloat(v6);
            var4_4 = Math.cos(Math.toRadians(this.rpq.vg8.x5k + 90.0f));
            var6_5 = Math.sin(Math.toRadians(this.rpq.vg8.x5k + 90.0f));
            var8_6 = (double)(1.0f * var3_3) * var4_4 + (double)(0.0f * var3_3) * var6_5;
            var10_7 = (double)(1.0f * var3_3) * var6_5 - (double)(0.0f * var3_3) * var4_4;
            try {
                try {
                    this.rpq.vg8.aaw().z6k(var8_6, 0.0, var10_7);
                    if (var2_2 == 0) break block22;
lbl62:
                    // 2 sources

                    this.dhs();
                    if (var2_2 == 0) break block22;
                }
                catch (oov v10) {
                    throw d0x.a(v10);
                }
lbl67:
                // 2 sources

                this.dhs();
            }
            catch (oov v11) {
                throw d0x.a(v11);
            }
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

