/*
 * Decompiled with CFR 0.152.
 */
public class ceu
extends ttt {
    public ceu(long l, ttt ttt2) {
        super(l);
        this.ty5 = ttt2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int[] ub9(int var1_1, int var2_2, int var3_3, int var4_4) {
        var6_5 = var1_1 - 1;
        var7_6 = var2_2 - 1;
        var8_7 = var3_3 + 2;
        var9_8 = var4_4 + 2;
        var5_9 = t9d.b();
        var10_10 = this.ty5.ub9(var6_5, var7_6, var8_7, var9_8);
        var11_11 = z97.web(var3_3 * var4_4);
        var12_12 = 0;
        block16: while (true) {
            v0 = var12_12;
            v1 = var4_4;
            block17: while (v0 < v1) {
                for (var13_13 = 0; var13_13 < var3_3; ++var13_13) {
                    block25: {
                        block24: {
                            block23: {
                                var14_14 = this.j20(var10_10[var13_13 + 0 + (var12_12 + 1) * var8_7]);
                                var15_15 = this.j20(var10_10[var13_13 + 2 + (var12_12 + 1) * var8_7]);
                                var16_16 = this.j20(var10_10[var13_13 + 1 + (var12_12 + 0) * var8_7]);
                                var17_17 = this.j20(var10_10[var13_13 + 1 + (var12_12 + 2) * var8_7]);
                                v0 = var18_18 = this.j20(var10_10[var13_13 + 1 + (var12_12 + 1) * var8_7]);
                                v1 = var14_14;
                                if (var5_9 == 0) continue block17;
                                try {
                                    try {
                                        if (var5_9 == 0) break block23;
                                        if (v0 == v1) {
                                        }
                                        ** GOTO lbl71
                                    }
                                    catch (oov v2) {
                                        throw ceu.a(v2);
                                    }
                                    v3 = var18_18;
                                    v4 = var16_16;
                                }
                                catch (oov v5) {
                                    throw ceu.a(v5);
                                }
                            }
                            try {
                                try {
                                    if (var5_9 == 0) break block24;
                                    if (v3 == v4) {
                                    }
                                    ** GOTO lbl71
                                }
                                catch (oov v6) {
                                    throw ceu.a(v6);
                                }
                                v3 = var18_18;
                                v4 = var15_15;
                            }
                            catch (oov v7) {
                                throw ceu.a(v7);
                            }
                        }
                        try {
                            try {
                                if (var5_9 == 0) break block25;
                                if (v3 == v4) {
                                }
                                ** GOTO lbl71
                            }
                            catch (oov v8) {
                                throw ceu.a(v8);
                            }
                            v3 = var18_18;
                            v4 = var17_17;
                        }
                        catch (oov v9) {
                            throw ceu.a(v9);
                        }
                    }
                    try {
                        try {
                            if (v3 == v4) {
                                var11_11[var13_13 + var12_12 * var3_3] = -1;
                                if (var5_9 != 0) continue;
                            }
                        }
                        catch (oov v10) {
                            throw ceu.a(v10);
                        }
lbl71:
                        // 4 sources

                        var11_11[var13_13 + var12_12 * var3_3] = gyu.sgl.mu9;
                        continue;
                    }
                    catch (oov v11) {
                        throw ceu.a(v11);
                    }
                }
                ++var12_12;
                if (var5_9 != 0) continue block16;
            }
            break;
        }
        return var11_11;
    }

    private int j20(int n) {
        int n2;
        block6: {
            block5: {
                int n3;
                int n4;
                block4: {
                    int n5 = t9d.c();
                    try {
                        try {
                            n4 = n;
                            n3 = 2;
                            if (n5 != 0) break block4;
                            if (n4 < n3) break block5;
                        }
                        catch (oov oov2) {
                            throw ceu.a(oov2);
                        }
                        n4 = 2;
                        n3 = n & 1;
                    }
                    catch (oov oov3) {
                        throw ceu.a(oov3);
                    }
                }
                n2 = n4 + n3;
                break block6;
            }
            n2 = n;
        }
        return n2;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

