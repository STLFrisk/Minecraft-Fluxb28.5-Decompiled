/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class c5z {
    public static g_3 mi2(float f, float f2, float f3) {
        hpk hpk2 = new hpk(c05.vz1().tij, c05.vz1().vg8.x6l());
        float f4 = c05.vz1().nsd().x5k;
        float f5 = c05.vz1().nsd().y2i;
        c05.vz1().nsd().x5k = f;
        c05.vz1().nsd().y2i = f2;
        hpk2.oyu(c05.vz1().nsd());
        hpk2.nyk(c05.vz1().nsd());
        c05.vz1().nsd().y2i = f5;
        c05.vz1().nsd().x5k = f4;
        return c5z.vc6(hpk2, 1.0f, f3);
    }

    /*
     * Unable to fully structure code
     */
    private static g_3 vc6(i2h var0, float var1_1, double var2_2) {
        block31: {
            var5_3 = null;
            var6_4 = var0.tib(var1_1);
            var7_5 = var0.wej(var1_1);
            var4_6 = t9d.b();
            var8_7 = var6_4.r2x(var7_5.lvi * var2_2, var7_5.gn5 * var2_2, var7_5.bn2 * var2_2);
            var9_8 = 1.0f;
            var10_9 = c05.vz1().tij.sr2(var0, var0.aaw().z9h(var7_5.lvi * var2_2, var7_5.gn5 * var2_2, var7_5.bn2 * var2_2).c2h(var9_8, var9_8, var9_8), Predicates.and((Predicate)k0_.t1f, (Predicate)new c5z$1()));
            var11_10 = var2_2;
            for (var13_11 = 0; var13_11 < var10_9.size(); ++var13_11) {
                block37: {
                    block36: {
                        block35: {
                            block34: {
                                block32: {
                                    var14_12 = (i2h)var10_9.get(var13_11);
                                    try {
                                        try {
                                            try {
                                                v0 = var14_12;
                                                if (var4_6 == 0) break block31;
                                                if (var4_6 == 0) break block32;
                                            }
                                            catch (oov v1) {
                                                throw c5z.a(v1);
                                            }
                                            if (v0 == c05.vz1().vg8) {
                                                continue;
                                            }
                                        }
                                        catch (oov v2) {
                                            throw c5z.a(v2);
                                        }
                                    }
                                    catch (oov v3) {
                                        throw c5z.a(v3);
                                    }
                                    v4 = var14_12;
                                }
                                var15_13 = v4.npl();
                                var16_14 = var14_12.aaw().c2h(var15_13, var15_13, var15_13);
                                var17_15 = var16_14.v35(var6_4, var8_7);
                                try {
                                    try {
                                        try {
                                            v5 = var16_14.fd8(var6_4);
                                            if (var4_6 == 0) break block34;
                                            if (v5 != 0) {
                                            }
                                            ** GOTO lbl61
                                        }
                                        catch (oov v6) {
                                            throw c5z.a(v6);
                                        }
                                        v7 = var11_10;
                                        if (var4_6 == 0) break block35;
                                    }
                                    catch (oov v8) {
                                        throw c5z.a(v8);
                                    }
                                    cfr_temp_0 = v7 - 0.0;
                                    v5 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                }
                                catch (oov v9) {
                                    throw c5z.a(v9);
                                }
                            }
                            if (v5 < 0) continue;
                            var5_3 = var14_12;
                            v7 = 0.0;
                        }
                        var11_10 = v7;
                        try {
                            if (var4_6 != 0) continue;
lbl61:
                            // 2 sources

                            if (var17_15 == null) continue;
                        }
                        catch (oov v10) {
                            throw c5z.a(v10);
                        }
                        var18_16 = var6_4.b4d(var17_15.jhn);
                        try {
                            try {
                                v11 = var18_16 == var11_10 ? 0 : (var18_16 < var11_10 ? -1 : 1);
                                if (var4_6 == 0) break block36;
                                if (v11 >= 0) {
                                }
                                ** GOTO lbl85
                            }
                            catch (oov v12) {
                                throw c5z.a(v12);
                            }
                            cfr_temp_1 = var11_10 - 0.0;
                            v11 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                        }
                        catch (oov v13) {
                            throw c5z.a(v13);
                        }
                    }
                    try {
                        try {
                            try {
                                if (v11 != false) continue;
lbl85:
                                // 2 sources

                                v14 = var14_12;
                                if (var4_6 == 0) break block37;
                            }
                            catch (oov v15) {
                                throw c5z.a(v15);
                            }
                            if (v14 == var0.hzp) {
                            }
                            ** GOTO lbl102
                        }
                        catch (oov v16) {
                            throw c5z.a(v16);
                        }
                        if (var11_10 != 0.0) continue;
                    }
                    catch (oov v17) {
                        throw c5z.a(v17);
                    }
                    var5_3 = var14_12;
                    try {
                        if (var4_6 != 0) continue;
lbl102:
                        // 2 sources

                        v14 = var14_12;
                    }
                    catch (oov v18) {
                        throw c5z.a(v18);
                    }
                }
                var5_3 = v14;
                var11_10 = var18_16;
                if (var4_6 != 0) continue;
            }
            v0 = var5_3;
        }
        return (g_3)v0;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

