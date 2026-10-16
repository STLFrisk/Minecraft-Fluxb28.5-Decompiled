/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class g_p
extends r45 {
    private /* synthetic */ int[] qvk;
    public double wqt;
    public double vqh;
    public double p5n;
    private static final /* synthetic */ double[] dax;
    private static final /* synthetic */ double[] xbb;
    private static final /* synthetic */ double[] asw;
    private static final /* synthetic */ double[] tyu;
    private static final /* synthetic */ double[] egg;

    public g_p() {
        this(new Random());
    }

    public g_p(Random random) {
        int n;
        int n2;
        block5: {
            this.qvk = new int[512];
            this.wqt = random.nextDouble() * 256.0;
            n2 = t9d.b();
            this.vqh = random.nextDouble() * 256.0;
            this.p5n = random.nextDouble() * 256.0;
            n = 0;
            while (n < 256) {
                try {
                    this.qvk[n] = n++;
                    if (n2 != 0) {
                        if (n2 != 0) continue;
                        break;
                    }
                    break block5;
                }
                catch (oov oov2) {
                    throw g_p.a(oov2);
                }
            }
            n = 0;
        }
        while (n < 256) {
            int n3 = random.nextInt(256 - n) + n;
            int n4 = this.qvk[n];
            this.qvk[n] = this.qvk[n3];
            this.qvk[n3] = n4;
            this.qvk[n + 256] = this.qvk[n];
            ++n;
            if (n2 != 0) continue;
        }
    }

    public final double whn(double d, double d2, double d3) {
        return d2 + d * (d3 - d2);
    }

    public final double ns3(int n, double d, double d2) {
        int n2 = n & 0xF;
        return tyu[n2] * d + egg[n2] * d2;
    }

    public final double wms(int n, double d, double d2, double d3) {
        int n2 = n & 0xF;
        return dax[n2] * d + xbb[n2] * d2 + asw[n2] * d3;
    }

    /*
     * Unable to fully structure code
     */
    public void t7b(double[] var1_1, double var2_2, double var4_3, double var6_4, int var8_5, int var9_6, int var10_7, double var11_8, double var13_9, double var15_10, double var17_11) {
        block32: {
            block31: {
                var19_12 = t9d.b();
                try {
                    v0 = var9_6;
                    if (var19_12 == 0) break block31;
                    if (v0 == 1) {
                    }
                    ** GOTO lbl75
                }
                catch (oov v1) {
                    throw g_p.a(v1);
                }
                var20_13 = 0;
                var21_14 = 0;
                var22_16 = 0;
                var23_17 = 0;
                var24_18 = 0.0;
                var26_20 = 0.0;
                var28_22 = 0;
                var29_23 = 1.0 / var17_11;
                var31_25 = 0;
                block22: while (true) {
                    v2 = var31_25;
                    block23: while (v2 < var8_5) {
                        block33: {
                            block34: {
                                var32_26 = var2_2 + (double)var31_25 * var11_8 + this.wqt;
                                var34_27 = (int)var32_26;
                                try {
                                    try {
                                        if (var19_12 == 0) break block32;
                                        cfr_temp_0 = var32_26 - (double)var34_27;
                                        v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                        if (var19_12 == 0) break block33;
                                    }
                                    catch (oov v4) {
                                        throw g_p.a(v4);
                                    }
                                    if (v3 >= 0) break block34;
                                }
                                catch (oov v5) {
                                    throw g_p.a(v5);
                                }
                                --var34_27;
                            }
                            v3 = var34_27 & 255;
                        }
                        var35_29 = v3;
                        var36_30 = (var32_26 -= (double)var34_27) * var32_26 * var32_26 * (var32_26 * (var32_26 * 6.0 - 15.0) + 10.0);
                        for (var38_31 = 0; var38_31 < var10_7; ++var38_31) {
                            block35: {
                                block36: {
                                    var39_32 = var6_4 + (double)var38_31 * var15_10 + this.p5n;
                                    var41_33 = (int)var39_32;
                                    cfr_temp_1 = var39_32 - (double)var41_33;
                                    v2 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                    if (var19_12 == 0) continue block23;
                                    try {
                                        if (var19_12 == 0) break block35;
                                        if (v2 >= 0) break block36;
                                    }
                                    catch (oov v6) {
                                        throw g_p.a(v6);
                                    }
                                    --var41_33;
                                }
                                v7 = var41_33 & 255;
                            }
                            var42_34 = v7;
                            var43_35 = (var39_32 -= (double)var41_33) * var39_32 * var39_32 * (var39_32 * (var39_32 * 6.0 - 15.0) + 10.0);
                            var20_13 = this.qvk[var35_29] + 0;
                            var21_14 = this.qvk[var20_13] + var42_34;
                            var22_16 = this.qvk[var35_29 + true] + 0;
                            var23_17 = this.qvk[var22_16] + var42_34;
                            var24_18 = this.whn(var36_30, this.ns3(this.qvk[var21_14], var32_26, var39_32), this.wms(this.qvk[var23_17], var32_26 - 1.0, 0.0, var39_32));
                            var26_20 = this.whn(var36_30, this.wms(this.qvk[var21_14 + 1], var32_26, 0.0, var39_32 - 1.0), this.wms(this.qvk[var23_17 + 1], var32_26 - 1.0, 0.0, var39_32 - 1.0));
                            var45_36 = this.whn(var43_35, var24_18, var26_20);
                            v8 = var47_38 = var28_22++;
                            var1_1[v8] = var1_1[v8] + var45_36 * var29_23;
                            if (var19_12 != 0) continue;
                        }
                        ++var31_25;
                        if (var19_12 != 0) continue block22;
                    }
                    break;
                }
                try {
                    if (var19_12 != 0) break block32;
lbl75:
                    // 2 sources

                    v0 = 0;
                }
                catch (oov v9) {
                    throw g_p.a(v9);
                }
            }
            var20_13 = v0;
            var21_15 = 1.0 / var17_11;
            var23_17 = -1;
            var24_19 = 0;
            var25_39 = 0;
            var26_21 = 0;
            var27_40 = 0;
            var28_22 = 0;
            var29_24 = 0;
            var30_41 = 0.0;
            var32_26 = 0.0;
            var34_28 = 0.0;
            var36_30 = 0.0;
            var38_31 = 0;
            block25: while (true) {
                v10 = var38_31;
                block26: while (v10 < var8_5) {
                    block37: {
                        block38: {
                            var39_32 = var2_2 + (double)var38_31 * var11_8 + this.wqt;
                            var41_33 = (int)var39_32;
                            try {
                                cfr_temp_2 = var39_32 - (double)var41_33;
                                v11 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                if (var19_12 == 0) break block37;
                                if (v11 >= 0) break block38;
                            }
                            catch (oov v12) {
                                throw g_p.a(v12);
                            }
                            --var41_33;
                        }
                        v11 = var41_33 & 255;
                    }
                    var42_34 = v11;
                    var43_35 = (var39_32 -= (double)var41_33) * var39_32 * var39_32 * (var39_32 * (var39_32 * 6.0 - 15.0) + 10.0);
                    var45_37 = 0;
                    block27: while (true) {
                        v13 = var45_37;
                        block28: while (v13 < var10_7) {
                            block39: {
                                block40: {
                                    var46_42 = var6_4 + (double)var45_37 * var15_10 + this.p5n;
                                    var48_43 = (int)var46_42;
                                    cfr_temp_3 = var46_42 - (double)var48_43;
                                    v10 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                    if (var19_12 == 0) continue block26;
                                    try {
                                        if (var19_12 == 0) break block39;
                                        if (v10 >= 0) break block40;
                                    }
                                    catch (oov v14) {
                                        throw g_p.a(v14);
                                    }
                                    --var48_43;
                                }
                                v15 = var48_43 & 255;
                            }
                            var49_44 = v15;
                            var50_45 = (var46_42 -= (double)var48_43) * var46_42 * var46_42 * (var46_42 * (var46_42 * 6.0 - 15.0) + 10.0);
                            for (var52_46 = 0; var52_46 < var9_6; ++var52_46) {
                                block46: {
                                    block43: {
                                        block45: {
                                            block44: {
                                                block41: {
                                                    block42: {
                                                        var53_47 = var4_3 + (double)var52_46 * var13_9 + this.vqh;
                                                        var55_48 = (int)var53_47;
                                                        cfr_temp_4 = var53_47 - (double)var55_48;
                                                        v13 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1);
                                                        if (var19_12 == 0) continue block28;
                                                        try {
                                                            if (var19_12 == 0) break block41;
                                                            if (v13 >= 0) break block42;
                                                        }
                                                        catch (oov v16) {
                                                            throw g_p.a(v16);
                                                        }
                                                        --var55_48;
                                                    }
                                                    v17 = var55_48 & 255;
                                                }
                                                var56_49 = v17;
                                                var57_50 = (var53_47 -= (double)var55_48) * var53_47 * var53_47 * (var53_47 * (var53_47 * 6.0 - 15.0) + 10.0);
                                                try {
                                                    try {
                                                        try {
                                                            v18 = var52_46;
                                                            if (var19_12 == 0) break block43;
                                                            if (v18 == 0) break block44;
                                                        }
                                                        catch (oov v19) {
                                                            throw g_p.a(v19);
                                                        }
                                                        v20 = var56_49;
                                                        v21 = var23_17;
                                                        if (var19_12 == 0) break block45;
                                                    }
                                                    catch (oov v22) {
                                                        throw g_p.a(v22);
                                                    }
                                                    if (v20 == v21) break block46;
                                                }
                                                catch (oov v23) {
                                                    throw g_p.a(v23);
                                                }
                                            }
                                            var23_17 = var56_49;
                                            var24_19 = this.qvk[var42_34] + var56_49;
                                            var25_39 = this.qvk[var24_19] + var49_44;
                                            var26_21 = this.qvk[var24_19 + 1] + var49_44;
                                            var27_40 = this.qvk[var42_34 + true] + var56_49;
                                            var28_22 = this.qvk[var27_40] + var49_44;
                                            v20 = this.qvk[var27_40 + 1];
                                            v21 = var49_44;
                                        }
                                        v18 = v20 + v21;
                                    }
                                    var29_24 = v18;
                                    var30_41 = this.whn(var43_35, this.wms(this.qvk[var25_39], var39_32, var53_47, var46_42), this.wms(this.qvk[var28_22], var39_32 - 1.0, var53_47, var46_42));
                                    var32_26 = this.whn(var43_35, this.wms(this.qvk[var26_21], var39_32, var53_47 - 1.0, var46_42), this.wms(this.qvk[var29_24], var39_32 - 1.0, var53_47 - 1.0, var46_42));
                                    var34_28 = this.whn(var43_35, this.wms(this.qvk[var25_39 + 1], var39_32, var53_47, var46_42 - 1.0), this.wms(this.qvk[var28_22 + 1], var39_32 - 1.0, var53_47, var46_42 - 1.0));
                                    var36_30 = this.whn(var43_35, this.wms(this.qvk[var26_21 + 1], var39_32, var53_47 - 1.0, var46_42 - 1.0), this.wms(this.qvk[var29_24 + 1], var39_32 - 1.0, var53_47 - 1.0, var46_42 - 1.0));
                                }
                                var59_51 = this.whn(var57_50, var30_41, var32_26);
                                var61_52 = this.whn(var57_50, var34_28, var36_30);
                                var63_53 = this.whn(var50_45, var59_51, var61_52);
                                v24 = var65_54 = var20_13++;
                                var1_1[v24] = var1_1[v24] + var63_53 * var21_15;
                                if (var19_12 != 0) continue;
                            }
                            ++var45_37;
                            if (var19_12 != 0) continue block27;
                        }
                        break;
                    }
                    ++var38_31;
                    if (var19_12 != 0) continue block25;
                }
                break;
            }
        }
    }

    static {
        dax = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
        xbb = new double[]{1.0, 1.0, -1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0};
        asw = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
        tyu = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
        egg = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

