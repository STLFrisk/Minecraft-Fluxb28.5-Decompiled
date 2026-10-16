/*
 * Decompiled with CFR 0.152.
 */
public class aud
extends ttt {
    private /* synthetic */ ttt b0j;
    private /* synthetic */ ttt c68;

    public aud(long l, ttt ttt2, ttt ttt3) {
        super(l);
        this.b0j = ttt2;
        this.c68 = ttt3;
    }

    @Override
    public void uz5(long l) {
        this.b0j.uz5(l);
        this.c68.uz5(l);
        super.uz5(l);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int[] ub9(int var1_1, int var2_2, int var3_3, int var4_4) {
        block38: {
            var6_5 = this.b0j.ub9(var1_1, var2_2, var3_3, var4_4);
            var7_6 = this.c68.ub9(var1_1, var2_2, var3_3, var4_4);
            var8_7 = z97.web(var3_3 * var4_4);
            var5_8 = t9d.b();
            for (var9_9 = 0; var9_9 < var3_3 * var4_4; ++var9_9) {
                block39: {
                    block40: {
                        block43: {
                            block41: {
                                try {
                                    try {
                                        block42: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v0 = var6_5;
                                                                                if (var5_8 == 0) break block38;
                                                                                v1 = var9_9;
                                                                                if (var5_8 == 0) break block39;
                                                                            }
                                                                            catch (oov v2) {
                                                                                throw aud.a(v2);
                                                                            }
                                                                            if (v0[v1] != gyu.jzy.mu9) {
                                                                            }
                                                                            ** GOTO lbl118
                                                                        }
                                                                        catch (oov v3) {
                                                                            throw aud.a(v3);
                                                                        }
                                                                        v4 = var6_5;
                                                                        v1 = var9_9;
                                                                        if (var5_8 == 0) break block39;
                                                                    }
                                                                    catch (oov v5) {
                                                                        throw aud.a(v5);
                                                                    }
                                                                    if (v4[v1] != gyu.knf.mu9) {
                                                                    }
                                                                    ** GOTO lbl118
                                                                }
                                                                catch (oov v6) {
                                                                    throw aud.a(v6);
                                                                }
                                                                v7 = var7_6;
                                                                v8 = var9_9;
                                                                if (var5_8 == 0) break block40;
                                                            }
                                                            catch (oov v9) {
                                                                throw aud.a(v9);
                                                            }
                                                            if (v7[v8] == gyu.sgl.mu9) {
                                                            }
                                                            ** GOTO lbl109
                                                        }
                                                        catch (oov v10) {
                                                            throw aud.a(v10);
                                                        }
                                                        v11 = var6_5[var9_9];
                                                        v12 = gyu.rv2.mu9;
                                                        if (var5_8 == 0) break block41;
                                                    }
                                                    catch (oov v13) {
                                                        throw aud.a(v13);
                                                    }
                                                    if (v11 != v12) break block42;
                                                }
                                                catch (oov v14) {
                                                    throw aud.a(v14);
                                                }
                                                var8_7[var9_9] = gyu.wrz.mu9;
                                                if (var5_8 != 0) continue;
                                            }
                                            catch (oov v15) {
                                                throw aud.a(v15);
                                            }
                                        }
                                        v16 = var6_5;
                                        v17 = var9_9;
                                        if (var5_8 == 0) break block43;
                                    }
                                    catch (oov v18) {
                                        throw aud.a(v18);
                                    }
                                    v11 = v16[v17];
                                    v12 = gyu._2p.mu9;
                                }
                                catch (oov v19) {
                                    throw aud.a(v19);
                                }
                            }
                            try {
                                block44: {
                                    try {
                                        try {
                                            try {
                                                if (v11 == v12) break block44;
                                                v16 = var6_5;
                                                v17 = var9_9;
                                                if (var5_8 == 0) break block43;
                                            }
                                            catch (oov v20) {
                                                throw aud.a(v20);
                                            }
                                            if (v16[v17] == gyu.mcb.mu9) break block44;
                                        }
                                        catch (oov v21) {
                                            throw aud.a(v21);
                                        }
                                        var8_7[var9_9] = var7_6[var9_9] & 255;
                                        if (var5_8 != 0) continue;
                                    }
                                    catch (oov v22) {
                                        throw aud.a(v22);
                                    }
                                }
                                v16 = var8_7;
                                v17 = var9_9;
                            }
                            catch (oov v23) {
                                throw aud.a(v23);
                            }
                        }
                        try {
                            v16[v17] = gyu.mcb.mu9;
                            if (var5_8 != 0) continue;
lbl109:
                            // 2 sources

                            v7 = var8_7;
                            v8 = var9_9;
                        }
                        catch (oov v24) {
                            throw aud.a(v24);
                        }
                    }
                    try {
                        v7[v8] = var6_5[var9_9];
                        if (var5_8 != 0) continue;
lbl118:
                        // 3 sources

                        v4 = var8_7;
                        v1 = var9_9;
                    }
                    catch (oov v25) {
                        throw aud.a(v25);
                    }
                }
                v4[v1] = var6_5[var9_9];
                if (var5_8 != 0) continue;
            }
            v0 = var8_7;
        }
        return v0;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

