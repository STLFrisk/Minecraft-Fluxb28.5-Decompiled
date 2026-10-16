/*
 * Decompiled with CFR 0.152.
 */
public class a_k
extends u7m {
    private e0x euj;

    public a_k(e0x e0x2) {
        this.euj = e0x2;
        this.qfy(uja.yj_);
    }

    @Override
    public boolean ghw(erg erg2, ha9 ha92, t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block17: {
            block18: {
                int n;
                block15: {
                    block16: {
                        block13: {
                            block14: {
                                n = t9d.b();
                                try {
                                    if (vt22 != vt2.rf3) {
                                        return false;
                                    }
                                }
                                catch (oov oov2) {
                                    throw a_k.a(oov2);
                                }
                                zfz zfz2 = t9d2.getBlockState(mew2);
                                e0x e0x2 = zfz2.r_y();
                                try {
                                    bl = e0x2.ujd(t9d2, mew2);
                                    if (n == 0) break block13;
                                    if (bl) break block14;
                                }
                                catch (oov oov3) {
                                    throw a_k.a(oov3);
                                }
                                mew2 = mew2.offset(vt22);
                            }
                            bl = ha92.dzh(mew2, vt22, erg2);
                        }
                        try {
                            try {
                                if (n == 0) break block15;
                                if (bl) break block16;
                            }
                            catch (oov oov4) {
                                throw a_k.a(oov4);
                            }
                            return false;
                        }
                        catch (oov oov5) {
                            throw a_k.a(oov5);
                        }
                    }
                    bl = this.euj.ctq(t9d2, mew2);
                }
                try {
                    try {
                        if (n == 0) break block17;
                        if (bl) break block18;
                    }
                    catch (oov oov6) {
                        throw a_k.a(oov6);
                    }
                    return false;
                }
                catch (oov oov7) {
                    throw a_k.a(oov7);
                }
            }
            a_k.o08(t9d2, mew2, vt2.ni1(ha92.x5k), this.euj);
            --erg2.qd2;
            bl = true;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void o08(t9d var0, mew var1_1, vt2 var2_2, e0x var3_3) {
        block52: {
            block51: {
                block49: {
                    block50: {
                        block48: {
                            block47: {
                                block46: {
                                    block45: {
                                        block44: {
                                            block43: {
                                                block41: {
                                                    block42: {
                                                        block39: {
                                                            block40: {
                                                                block37: {
                                                                    block38: {
                                                                        block35: {
                                                                            block36: {
                                                                                var5_4 = var1_1.offset(var2_2.drv());
                                                                                var6_5 = var1_1.offset(var2_2.tgw());
                                                                                var4_6 = t9d.b();
                                                                                try {
                                                                                    v0 = var0.getBlockState(var6_5).r_y().y0n();
                                                                                    if (var4_6 == 0) break block35;
                                                                                    if (v0 == 0) break block36;
                                                                                }
                                                                                catch (oov v1) {
                                                                                    throw a_k.a(v1);
                                                                                }
                                                                                v0 = 1;
                                                                                break block35;
                                                                            }
                                                                            v0 = 0;
                                                                        }
                                                                        try {
                                                                            v2 = var0.getBlockState(var6_5.nuv()).r_y().y0n();
                                                                            if (var4_6 == 0) break block37;
                                                                            if (v2 == 0) break block38;
                                                                        }
                                                                        catch (oov v3) {
                                                                            throw a_k.a(v3);
                                                                        }
                                                                        v2 = 1;
                                                                        break block37;
                                                                    }
                                                                    v2 = 0;
                                                                }
                                                                var7_7 = v0 + v2;
                                                                try {
                                                                    v4 = var0.getBlockState(var5_4).r_y().y0n();
                                                                    if (var4_6 == 0) break block39;
                                                                    if (v4 == 0) break block40;
                                                                }
                                                                catch (oov v5) {
                                                                    throw a_k.a(v5);
                                                                }
                                                                v4 = 1;
                                                                break block39;
                                                            }
                                                            v4 = 0;
                                                        }
                                                        try {
                                                            v6 = var0.getBlockState(var5_4.nuv()).r_y().y0n();
                                                            if (var4_6 == 0) break block41;
                                                            if (v6 == 0) break block42;
                                                        }
                                                        catch (oov v7) {
                                                            throw a_k.a(v7);
                                                        }
                                                        v6 = 1;
                                                        break block41;
                                                    }
                                                    v6 = 0;
                                                }
                                                var8_8 = v4 + v6;
                                                try {
                                                    try {
                                                        v8 = var0.getBlockState(var6_5).r_y();
                                                        v9 = var3_3;
                                                        if (var4_6 == 0) break block43;
                                                        if (v8 != v9) {
                                                        }
                                                        ** GOTO lbl72
                                                    }
                                                    catch (oov v10) {
                                                        throw a_k.a(v10);
                                                    }
                                                    v8 = var0.getBlockState(var6_5.nuv()).r_y();
                                                    v9 = var3_3;
                                                }
                                                catch (oov v11) {
                                                    throw a_k.a(v11);
                                                }
                                            }
                                            try {
                                                if (v8 != v9) break block44;
lbl72:
                                                // 2 sources

                                                v12 = 1;
                                                break block45;
                                            }
                                            catch (oov v13) {
                                                throw a_k.a(v13);
                                            }
                                        }
                                        v12 = 0;
                                    }
                                    var9_9 = v12;
                                    try {
                                        try {
                                            v14 = var0.getBlockState(var5_4).r_y();
                                            v15 = var3_3;
                                            if (var4_6 == 0) break block46;
                                            if (v14 != v15) {
                                            }
                                            ** GOTO lbl98
                                        }
                                        catch (oov v16) {
                                            throw a_k.a(v16);
                                        }
                                        v14 = var0.getBlockState(var5_4.nuv()).r_y();
                                        v15 = var3_3;
                                    }
                                    catch (oov v17) {
                                        throw a_k.a(v17);
                                    }
                                }
                                try {
                                    if (v14 != v15) break block47;
lbl98:
                                    // 2 sources

                                    v18 = 1;
                                    break block48;
                                }
                                catch (oov v19) {
                                    throw a_k.a(v19);
                                }
                            }
                            v18 = 0;
                        }
                        var10_10 = v18;
                        var11_11 = 0;
                        try {
                            try {
                                try {
                                    v20 = var9_9;
                                    if (var4_6 == 0) break block49;
                                    if (v20 == 0) break block50;
                                }
                                catch (oov v21) {
                                    throw a_k.a(v21);
                                }
                                v20 = var10_10;
                                if (var4_6 == 0) break block51;
                            }
                            catch (oov v22) {
                                throw a_k.a(v22);
                            }
                            if (v20 != 0) {
                            }
                            ** GOTO lbl136
                        }
                        catch (oov v23) {
                            throw a_k.a(v23);
                        }
                    }
                    v20 = var8_8;
                }
                try {
                    try {
                        if (var4_6 == 0) break block51;
                        if (v20 <= var7_7) break block52;
                    }
                    catch (oov v24) {
                        throw a_k.a(v24);
                    }
lbl136:
                    // 2 sources

                    v20 = 1;
                }
                catch (oov v25) {
                    throw a_k.a(v25);
                }
            }
            var11_11 = v20;
        }
        var12_12 = var1_1.nuv();
        try {
            v26 = var3_3.l4i().zvi(w4e.kyp, (Comparable)var2_2);
            v27 = w4e.m_q;
            v28 = var11_11 != 0 ? w4e$d2r.plj : w4e$d2r.cd4;
        }
        catch (oov v29) {
            throw a_k.a(v29);
        }
        var13_13 = v26.zvi(v27, (Comparable)v28);
        var0.vct(var1_1, var13_13.zvi(w4e.raj, (Comparable)w4e$w0e.lf4), 2);
        var0.vct(var12_12, var13_13.zvi(w4e.raj, (Comparable)w4e$w0e._bw), 2);
        var0._0o(var1_1, var3_3);
        var0._0o(var12_12, var3_3);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

