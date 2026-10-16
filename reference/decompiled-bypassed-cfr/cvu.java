/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class cvu
extends uk2 {
    private float[] mi1 = new float[1024];

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void ljs(long var1_1, int var3_2, int var4_3, lno var5_4, double var6_5, double var8_6, double var10_7, float var12_8, float var13_9, float var14_10, int var15_11, int var16_12, double var17_13) {
        block142: {
            block141: {
                block139: {
                    block140: {
                        var20_14 = new Random(var1_1);
                        var21_15 = var3_2 * 16 + 8;
                        var23_16 = var4_3 * 16 + 8;
                        var19_17 = t9d.c();
                        var25_18 = 0.0f;
                        var26_19 = 0.0f;
                        try {
                            v0 = var16_12;
                            if (var19_17 != 0) break block139;
                            if (v0 > 0) break block140;
                        }
                        catch (oov v1) {
                            throw cvu.a(v1);
                        }
                        var27_20 = this.oa6 * 16 - 16;
                        var16_12 = var27_20 - var20_14.nextInt(var27_20 / 4);
                    }
                    v0 = 0;
                }
                var27_20 = v0;
                try {
                    try {
                        v2 = var15_11;
                        v3 = -1;
                        if (var19_17 != 0) break block141;
                        if (v2 != v3) break block142;
                    }
                    catch (oov v4) {
                        throw cvu.a(v4);
                    }
                    v2 = var16_12;
                    v3 = 2;
                }
                catch (oov v5) {
                    throw cvu.a(v5);
                }
            }
            var15_11 = v2 / v3;
            var27_20 = 1;
        }
        var28_21 = 1.0f;
        for (var29_22 = 0; var29_22 < 256; ++var29_22) {
            block185: {
                block144: {
                    block143: {
                        try {
                            try {
                                try {
                                    v6 = var29_22;
                                    if (var19_17 == 0) {
                                        if (var19_17 != 0) break block143;
                                    }
                                    ** GOTO lbl67
                                }
                                catch (oov v7) {
                                    throw cvu.a(v7);
                                }
                                if (v6 == 0) break block144;
                            }
                            catch (oov v8) {
                                throw cvu.a(v8);
                            }
                            v9 = var20_14.nextInt(3);
                        }
                        catch (oov v10) {
                            throw cvu.a(v10);
                        }
                    }
                    if (v9 != false) break block185;
                }
                var28_21 = 1.0f + var20_14.nextFloat() * var20_14.nextFloat() * 1.0f;
            }
            this.mi1[var29_22] = var28_21 * var28_21;
            if (var19_17 == 0) continue;
        }
        block109: while (true) {
            v6 = var15_11;
lbl67:
            // 2 sources

            v11 = var16_12;
            block110: while (v6 < v11) {
                block145: {
                    block175: {
                        block163: {
                            block161: {
                                block162: {
                                    block159: {
                                        block160: {
                                            block158: {
                                                block156: {
                                                    block157: {
                                                        block154: {
                                                            block155: {
                                                                block152: {
                                                                    block153: {
                                                                        block151: {
                                                                            block150: {
                                                                                block149: {
                                                                                    block148: {
                                                                                        block146: {
                                                                                            block147: {
                                                                                                var29_23 = 1.5 + (double)(fe6.rtn((float)var15_11 * 3.1415927f / (float)var16_12) * var12_8 * 1.0f);
                                                                                                var31_24 = var29_23 * var17_13;
                                                                                                var29_23 *= (double)var20_14.nextFloat() * 0.25 + 0.75;
                                                                                                var31_24 *= (double)var20_14.nextFloat() * 0.25 + 0.75;
                                                                                                var33_25 = fe6.ssk(var14_10);
                                                                                                var34_26 = fe6.rtn(var14_10);
                                                                                                var6_5 += (double)(fe6.ssk(var13_9) * var33_25);
                                                                                                var8_6 += (double)var34_26;
                                                                                                v12 = var10_7 + (double)(fe6.rtn(var13_9) * var33_25);
                                                                                                if (var19_17 == 0) {
                                                                                                    var10_7 = v12;
                                                                                                    var14_10 *= 0.7f;
                                                                                                    var14_10 += var26_19 * 0.05f;
                                                                                                    var13_9 += var25_18 * 0.05f;
                                                                                                    var26_19 *= 0.8f;
                                                                                                    var25_18 *= 0.5f;
                                                                                                    var26_19 += (var20_14.nextFloat() - var20_14.nextFloat()) * var20_14.nextFloat() * 2.0f;
                                                                                                    var25_18 += (var20_14.nextFloat() - var20_14.nextFloat()) * var20_14.nextFloat() * 4.0f;
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var27_20 == 0 && var20_14.nextInt(4) == 0) break block145;
                                                                                                        }
                                                                                                        catch (oov v13) {
                                                                                                            throw cvu.a(v13);
                                                                                                        }
                                                                                                        v12 = var6_5 - var21_15;
                                                                                                    }
                                                                                                    catch (oov v14) {
                                                                                                        throw cvu.a(v14);
                                                                                                    }
                                                                                                }
                                                                                                var35_27 = v12;
                                                                                                var37_28 = var10_7 - var23_16;
                                                                                                var39_29 = var16_12 - var15_11;
                                                                                                var41_30 = var12_8 + 2.0f + 16.0f;
                                                                                                try {
                                                                                                    cfr_temp_0 = var35_27 * var35_27 + var37_28 * var37_28 - var39_29 * var39_29 - var41_30 * var41_30;
                                                                                                    v15 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                                    if (var19_17 != 0) break block146;
                                                                                                    if (v15 <= 0) break block147;
                                                                                                }
                                                                                                catch (oov v16) {
                                                                                                    throw cvu.a(v16);
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            cfr_temp_1 = var6_5 - (var21_15 - 16.0 - var29_23 * 2.0);
                                                                                            v15 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (var19_17 != 0) break block148;
                                                                                                if (v15 < 0) break block145;
                                                                                            }
                                                                                            catch (oov v17) {
                                                                                                throw cvu.a(v17);
                                                                                            }
                                                                                            cfr_temp_2 = var10_7 - (var23_16 - 16.0 - var29_23 * 2.0);
                                                                                            v15 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                                        }
                                                                                        catch (oov v18) {
                                                                                            throw cvu.a(v18);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var19_17 != 0) break block149;
                                                                                            if (v15 < 0) break block145;
                                                                                        }
                                                                                        catch (oov v19) {
                                                                                            throw cvu.a(v19);
                                                                                        }
                                                                                        cfr_temp_3 = var6_5 - (var21_15 + 16.0 + var29_23 * 2.0);
                                                                                        v15 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                                                    }
                                                                                    catch (oov v20) {
                                                                                        throw cvu.a(v20);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var19_17 != 0) break block150;
                                                                                        if (v15 > 0) break block145;
                                                                                    }
                                                                                    catch (oov v21) {
                                                                                        throw cvu.a(v21);
                                                                                    }
                                                                                    cfr_temp_4 = var10_7 - (var23_16 + 16.0 + var29_23 * 2.0);
                                                                                    v15 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 < 0.0 ? -1 : 1);
                                                                                }
                                                                                catch (oov v22) {
                                                                                    throw cvu.a(v22);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var19_17 != 0) break block151;
                                                                                    if (v15 > 0) break block145;
                                                                                }
                                                                                catch (oov v23) {
                                                                                    throw cvu.a(v23);
                                                                                }
                                                                                v15 = fe6.jqf(var6_5 - var29_23) - var3_2 * 16 - 1;
                                                                            }
                                                                            catch (oov v24) {
                                                                                throw cvu.a(v24);
                                                                            }
                                                                        }
                                                                        var43_31 = v15;
                                                                        var44_32 = fe6.jqf(var6_5 + var29_23) - var3_2 * 16 + 1;
                                                                        var45_33 = fe6.jqf(var8_6 - var31_24) - 1;
                                                                        var46_34 = fe6.jqf(var8_6 + var31_24) + 1;
                                                                        var47_35 = fe6.jqf(var10_7 - var29_23) - var4_3 * 16 - 1;
                                                                        var48_36 = fe6.jqf(var10_7 + var29_23) - var4_3 * 16 + 1;
                                                                        try {
                                                                            v25 = var43_31;
                                                                            if (var19_17 != 0) break block152;
                                                                            if (v25 >= 0) break block153;
                                                                        }
                                                                        catch (oov v26) {
                                                                            throw cvu.a(v26);
                                                                        }
                                                                        var43_31 = (double)false;
                                                                    }
                                                                    v25 = var44_32;
                                                                }
                                                                try {
                                                                    v27 = 16;
                                                                    if (var19_17 != 0) break block154;
                                                                    if (v25 <= v27) break block155;
                                                                }
                                                                catch (oov v28) {
                                                                    throw cvu.a(v28);
                                                                }
                                                                var44_32 = 16;
                                                            }
                                                            v25 = var45_33;
                                                            v27 = 1;
                                                        }
                                                        try {
                                                            if (var19_17 != 0) break block156;
                                                            if (v25 >= v27) break block157;
                                                        }
                                                        catch (oov v29) {
                                                            throw cvu.a(v29);
                                                        }
                                                        var45_33 = 1;
                                                    }
                                                    try {
                                                        v25 = var46_34;
                                                        if (var19_17 != 0) break block158;
                                                        v27 = 248;
                                                    }
                                                    catch (oov v30) {
                                                        throw cvu.a(v30);
                                                    }
                                                }
                                                if (v25 > v27) {
                                                    var46_34 = 248;
                                                }
                                                v25 = var47_35;
                                            }
                                            try {
                                                if (var19_17 != 0) break block159;
                                                if (v25 >= 0) break block160;
                                            }
                                            catch (oov v31) {
                                                throw cvu.a(v31);
                                            }
                                            var47_35 = 0;
                                        }
                                        v25 = var48_36;
                                    }
                                    try {
                                        if (var19_17 != 0) break block161;
                                        if (v25 <= 16) break block162;
                                    }
                                    catch (oov v32) {
                                        throw cvu.a(v32);
                                    }
                                    var48_36 = 16;
                                }
                                v25 = (double)false;
                            }
                            var49_37 = v25;
                            var50_38 = var43_31;
                            while (var49_37 == false) {
                                try {
                                    v33 = var50_38;
                                    if (var19_17 != 0) break block163;
                                    v11 = var44_32;
                                    if (var19_17 != 0) continue block110;
                                }
                                catch (oov v34) {
                                    throw cvu.a(v34);
                                }
                                if (v33 >= v11) break;
                                var51_40 = var47_35;
                                while (var49_37 == false) {
                                    block164: {
                                        v6 = (int)var51_40;
                                        v11 = var48_36;
                                        if (var19_17 != 0) continue block110;
                                        try {
                                            try {
                                                if (var19_17 != 0) break block164;
                                                if (v6 >= v11) break;
                                            }
                                            catch (oov v35) {
                                                throw cvu.a(v35);
                                            }
                                            v36 = var46_34;
                                            v37 = true;
                                        }
                                        catch (oov v38) {
                                            throw cvu.a(v38);
                                        }
                                    }
                                    var52_41 = v36 + v37;
                                    while (var49_37 == false) {
                                        block167: {
                                            block174: {
                                                block173: {
                                                    block172: {
                                                        block171: {
                                                            block170: {
                                                                block186: {
                                                                    block169: {
                                                                        block168: {
                                                                            block166: {
                                                                                block165: {
                                                                                    try {
                                                                                        v39 = var52_41;
                                                                                        if (var19_17 != 0) break block165;
                                                                                        v11 = var45_33 - 1;
                                                                                        if (var19_17 != 0) continue block110;
                                                                                    }
                                                                                    catch (oov v40) {
                                                                                        throw cvu.a(v40);
                                                                                    }
                                                                                    if (v39 < v11) break;
                                                                                    v39 = var52_41;
                                                                                }
                                                                                try {
                                                                                    if (var19_17 != 0) break block166;
                                                                                    if (v39 < 0) break block167;
                                                                                }
                                                                                catch (oov v41) {
                                                                                    throw cvu.a(v41);
                                                                                }
                                                                                v39 = var52_41;
                                                                            }
                                                                            if (v39 >= 256) break block167;
                                                                            var53_43 = var5_4.ql9((int)var50_38, (int)var52_41, (int)var51_40);
                                                                            try {
                                                                                try {
                                                                                    v42 = var53_43.r_y();
                                                                                    if (var19_17 != 0) break block168;
                                                                                    if (v42 == ox_.whp) break block169;
                                                                                }
                                                                                catch (oov v43) {
                                                                                    throw cvu.a(v43);
                                                                                }
                                                                                v42 = var53_43.r_y();
                                                                            }
                                                                            catch (oov v44) {
                                                                                throw cvu.a(v44);
                                                                            }
                                                                        }
                                                                        if (v42 != ox_.gdz) break block186;
                                                                    }
                                                                    var49_37 = (double)true;
                                                                }
                                                                try {
                                                                    try {
                                                                        v45 = var52_41;
                                                                        v46 = var45_33 - 1;
                                                                        if (var19_17 != 0) break block170;
                                                                        if (v45 == v46) break block167;
                                                                    }
                                                                    catch (oov v47) {
                                                                        throw cvu.a(v47);
                                                                    }
                                                                    v45 = var50_38;
                                                                    v46 = (int)var43_31;
                                                                }
                                                                catch (oov v48) {
                                                                    throw cvu.a(v48);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (var19_17 != 0) break block171;
                                                                    if (v45 == v46) break block167;
                                                                }
                                                                catch (oov v49) {
                                                                    throw cvu.a(v49);
                                                                }
                                                                v45 = var50_38;
                                                                v46 = var44_32 - 1;
                                                            }
                                                            catch (oov v50) {
                                                                throw cvu.a(v50);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (var19_17 != 0) break block172;
                                                                if (v45 == v46) break block167;
                                                            }
                                                            catch (oov v51) {
                                                                throw cvu.a(v51);
                                                            }
                                                            v45 = var51_40;
                                                            v46 = var47_35;
                                                        }
                                                        catch (oov v52) {
                                                            throw cvu.a(v52);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (var19_17 != 0) break block173;
                                                                if (v45 == v46) break block167;
                                                            }
                                                            catch (oov v53) {
                                                                throw cvu.a(v53);
                                                            }
                                                            v45 = var51_40;
                                                            if (var19_17 != 0) break block174;
                                                        }
                                                        catch (oov v54) {
                                                            throw cvu.a(v54);
                                                        }
                                                        v46 = var48_36 - 1;
                                                    }
                                                    catch (oov v55) {
                                                        throw cvu.a(v55);
                                                    }
                                                }
                                                if (v45 == v46) break block167;
                                                v45 = var45_33;
                                            }
                                            var52_41 = v45;
                                        }
                                        --var52_41;
                                        if (var19_17 == 0) continue;
                                    }
                                    ++var51_40;
                                    if (var19_17 == 0) continue;
                                }
                                ++var50_38;
                                if (var19_17 == 0) continue;
                            }
                            v33 = var49_37;
                        }
                        if (v33 != false) break block145;
                        var50_39 = new mew$mix();
                        var51_40 = var43_31;
                        block114: while (true) {
                            v56 = var51_40;
                            block115: while (v56 < var44_32) {
                                var52_42 = ((double)(var51_40 + var3_2 * 16) + 0.5 - var6_5) / var29_23;
                                v57 = var47_35;
                                if (var19_17 != 0) break block175;
                                var54_44 = v57;
                                block116: while (true) {
                                    v58 = var54_44;
                                    block117: while (v58 < var48_36) {
                                        block187: {
                                            var55_45 = ((double)(var54_44 + var4_3 * 16) + 0.5 - var10_7) / var29_23;
                                            var57_46 = 0;
                                            try {
                                                if (var19_17 != 0) continue block116;
                                                cfr_temp_5 = var52_42 * var52_42 + var55_45 * var55_45 - 1.0;
                                                v56 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 < 0.0 ? -1 : 1);
                                                if (var19_17 != 0) continue block115;
                                            }
                                            catch (oov v59) {
                                                throw cvu.a(v59);
                                            }
                                            if (v56 >= 0) break block187;
                                            var58_47 = var46_34;
                                            while (var58_47 > var45_33) {
                                                block176: {
                                                    block181: {
                                                        block184: {
                                                            block182: {
                                                                block180: {
                                                                    block179: {
                                                                        block177: {
                                                                            block178: {
                                                                                var59_48 = ((double)(var58_47 - 1) + 0.5 - var8_6) / var31_24;
                                                                                try {
                                                                                    if (var19_17 != 0) break block176;
                                                                                    cfr_temp_6 = (var52_42 * var52_42 + var55_45 * var55_45) * (double)this.mi1[var58_47 - 1] + var59_48 * var59_48 / 6.0 - 1.0;
                                                                                    v58 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1);
                                                                                    if (var19_17 != 0) continue block117;
                                                                                }
                                                                                catch (oov v60) {
                                                                                    throw cvu.a(v60);
                                                                                }
                                                                                if (v58 >= 0) break block181;
                                                                                var61_49 = var5_4.ql9((int)var51_40, var58_47, var54_44);
                                                                                try {
                                                                                    v61 = var61_49.r_y();
                                                                                    v62 /* !! */  = ox_.l11;
                                                                                    if (var19_17 != 0) break block177;
                                                                                    if (v61 != v62 /* !! */ ) break block178;
                                                                                }
                                                                                catch (oov v63) {
                                                                                    throw cvu.a(v63);
                                                                                }
                                                                                var57_46 = 1;
                                                                            }
                                                                            v61 = var61_49.r_y();
                                                                            v62 /* !! */  = ox_.pu8;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var19_17 != 0) break block179;
                                                                                    if (v61 != v62 /* !! */ ) {
                                                                                    }
                                                                                    ** GOTO lbl467
                                                                                }
                                                                                catch (oov v64) {
                                                                                    throw cvu.a(v64);
                                                                                }
                                                                                v61 = var61_49.r_y();
                                                                                if (var19_17 != 0) break block180;
                                                                            }
                                                                            catch (oov v65) {
                                                                                throw cvu.a(v65);
                                                                            }
                                                                            v62 /* !! */  = ox_.kqk;
                                                                        }
                                                                        catch (oov v66) {
                                                                            throw cvu.a(v66);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v61 != v62 /* !! */ ) {
                                                                            v61 = var61_49.r_y();
                                                                        }
                                                                        ** GOTO lbl467
                                                                    }
                                                                    catch (oov v67) {
                                                                        throw cvu.a(v67);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        block183: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (v61 != ox_.l11) break block181;
lbl467:
                                                                                        // 3 sources

                                                                                        v68 = var58_47 - 1;
                                                                                        if (var19_17 != 0) break block182;
                                                                                    }
                                                                                    catch (oov v69) {
                                                                                        throw cvu.a(v69);
                                                                                    }
                                                                                    if (v68 >= 10) break block183;
                                                                                }
                                                                                catch (oov v70) {
                                                                                    throw cvu.a(v70);
                                                                                }
                                                                                var5_4.x6f((int)var51_40, var58_47, var54_44, ox_.dr2.l4i());
                                                                                if (var19_17 == 0) break block181;
                                                                            }
                                                                            catch (oov v71) {
                                                                                throw cvu.a(v71);
                                                                            }
                                                                        }
                                                                        var5_4.x6f((int)var51_40, var58_47, var54_44, ox_.ibw.l4i());
                                                                        if (var19_17 != 0) break block176;
                                                                    }
                                                                    catch (oov v72) {
                                                                        throw cvu.a(v72);
                                                                    }
                                                                    v68 = var57_46;
                                                                }
                                                                catch (oov v73) {
                                                                    throw cvu.a(v73);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (v68 == 0) break block181;
                                                                        v74 = var5_4;
                                                                        v75 = var51_40;
                                                                        v76 = var58_47 - 1;
                                                                        v77 = var54_44;
                                                                        if (var19_17 != 0) break block184;
                                                                    }
                                                                    catch (oov v78) {
                                                                        throw cvu.a(v78);
                                                                    }
                                                                    if (v74.ql9((int)v75, v76, v77).r_y() != ox_.kqk) break block181;
                                                                }
                                                                catch (oov v79) {
                                                                    throw cvu.a(v79);
                                                                }
                                                                var50_39.bj0((int)(var51_40 + var3_2 * 16), 0, var54_44 + var4_3 * 16);
                                                                v74 = var5_4;
                                                                v75 = var51_40;
                                                                v76 = var58_47 - 1;
                                                                v77 = var54_44;
                                                            }
                                                            catch (oov v80) {
                                                                throw cvu.a(v80);
                                                            }
                                                        }
                                                        v74.x6f((int)v75, v76, v77, this.pr9.getBiomeGenForCoords((mew)var50_39).ke4);
                                                    }
                                                    --var58_47;
                                                }
                                                if (var19_17 == 0) continue;
                                            }
                                        }
                                        ++var54_44;
                                        if (var19_17 == 0) continue block116;
                                    }
                                    break;
                                }
                                ++var51_40;
                                if (var19_17 == 0) continue block114;
                            }
                            break;
                        }
                        v57 = var27_20;
                    }
                    if (v57 != 0) break block109;
                }
                ++var15_11;
                if (var19_17 == 0) continue block109;
            }
            break;
        }
    }

    @Override
    public void bjr(t9d t9d2, int n, int n2, int n3, int n4, lno lno2) {
        block6: {
            int n5;
            int n6;
            block5: {
                n6 = t9d.c();
                try {
                    try {
                        n5 = this.a0f.nextInt(50);
                        if (n6 != 0) break block5;
                        if (n5 != 0) break block6;
                    }
                    catch (oov oov2) {
                        throw cvu.a(oov2);
                    }
                    n5 = n * 16 + this.a0f.nextInt(16);
                }
                catch (oov oov3) {
                    throw cvu.a(oov3);
                }
            }
            double d = n5;
            double d2 = this.a0f.nextInt(this.a0f.nextInt(40) + 8) + 20;
            double d3 = n2 * 16 + this.a0f.nextInt(16);
            int n7 = 1;
            for (int i = 0; i < n7; ++i) {
                float f = this.a0f.nextFloat() * (float)Math.PI * 2.0f;
                float f2 = (this.a0f.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float f3 = (this.a0f.nextFloat() * 2.0f + this.a0f.nextFloat()) * 2.0f;
                this.ljs(this.a0f.nextLong(), n3, n4, lno2, d, d2, d3, f3, f, f2, 0, 0, 3.0);
                if (n6 == 0) continue;
            }
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

