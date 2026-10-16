/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class d55
extends e9q {
    private static final zfz p2y = ox_.uom.l4i().zvi(qv5.yuo, (Comparable)((Object)x54$lti.yk5));
    private static final zfz k9h = ox_.rwl.l4i().zvi(uav.nps, (Comparable)((Object)x54$lti.yk5)).zvi(uav.sdu, Boolean.valueOf(false));
    private boolean eon;

    public d55(boolean bl, boolean bl2) {
        super(bl);
        this.eon = bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean v3g(t9d var1_1, Random var2_2, mew var3_3) {
        block93: {
            block94: {
                block108: {
                    block107: {
                        block109: {
                            block106: {
                                block105: {
                                    block104: {
                                        block103: {
                                            block95: {
                                                block91: {
                                                    block92: {
                                                        var4_4 = t9d.b();
                                                        var5_5 = var2_2.nextInt(3) + 5;
                                                        try {
                                                            v0 = this.eon;
                                                            if (var4_4 == 0) break block91;
                                                            if (v0 == 0) break block92;
                                                        }
                                                        catch (oov v1) {
                                                            throw d55.a(v1);
                                                        }
                                                        var5_5 += var2_2.nextInt(7);
                                                    }
                                                    v0 = 1;
                                                }
                                                var6_6 = v0;
                                                try {
                                                    try {
                                                        try {
                                                            v2 = var3_3.getY();
                                                            if (var4_4 == 0) break block93;
                                                            if (v2 < 1) break block94;
                                                        }
                                                        catch (oov v3) {
                                                            throw d55.a(v3);
                                                        }
                                                        v2 = var3_3.getY() + var5_5 + 1;
                                                        if (var4_4 == 0) break block93;
                                                    }
                                                    catch (oov v4) {
                                                        throw d55.a(v4);
                                                    }
                                                    if (v2 > 256) break block94;
                                                }
                                                catch (oov v5) {
                                                    throw d55.a(v5);
                                                }
                                                var7_7 = var3_3.getY();
                                                block68: while (true) {
                                                    v6 = var7_7;
                                                    block69: while (v6 <= var3_3.getY() + 1 + var5_5) {
                                                        block117: {
                                                            block98: {
                                                                block96: {
                                                                    block97: {
                                                                        var8_9 = 1;
                                                                        try {
                                                                            try {
                                                                                v7 = var7_7;
                                                                                if (var4_4 == 0) break block95;
                                                                                v8 = var3_3.getY();
                                                                                if (var4_4 == 0) break block96;
                                                                            }
                                                                            catch (oov v9) {
                                                                                throw d55.a(v9);
                                                                            }
                                                                            if (v7 != v8) break block97;
                                                                        }
                                                                        catch (oov v10) {
                                                                            throw d55.a(v10);
                                                                        }
                                                                        var8_9 = 0;
                                                                    }
                                                                    try {
                                                                        v11 = var7_7;
                                                                        if (var4_4 == 0) break block98;
                                                                        v8 = var3_3.getY() + 1 + var5_5 - 2;
                                                                    }
                                                                    catch (oov v12) {
                                                                        throw d55.a(v12);
                                                                    }
                                                                }
                                                                if (v11 < v8) break block117;
                                                                v11 = 2;
                                                            }
                                                            var8_9 = v11;
                                                        }
                                                        var9_10 = new mew$mix();
                                                        var10_13 = var3_3.getX() - var8_9;
                                                        block70: while (true) {
                                                            v13 = var10_13;
                                                            block71: while (v13 <= var3_3.getX() + var8_9) {
                                                                block99: {
                                                                    v6 = var6_6;
                                                                    if (var4_4 == 0) continue block69;
                                                                    try {
                                                                        try {
                                                                            if (var4_4 == 0) break block99;
                                                                            if (v6 == 0) break block70;
                                                                        }
                                                                        catch (oov v14) {
                                                                            throw d55.a(v14);
                                                                        }
                                                                        v15 = var3_3.getZ() - var8_9;
                                                                    }
                                                                    catch (oov v16) {
                                                                        throw d55.a(v16);
                                                                    }
                                                                }
                                                                for (var11_14 = v1040111; var11_14 <= var3_3.getZ() + var8_9; ++var11_14) {
                                                                    block101: {
                                                                        block102: {
                                                                            block100: {
                                                                                v13 = var6_6;
                                                                                if (var4_4 == 0) continue block71;
                                                                                try {
                                                                                    if (var4_4 == 0) break block100;
                                                                                    if (v13 == 0) break;
                                                                                }
                                                                                catch (oov v17) {
                                                                                    throw d55.a(v17);
                                                                                }
                                                                                v18 = var7_7;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (var4_4 == 0) break block101;
                                                                                                if (v18 >= 0) {
                                                                                                }
                                                                                                ** GOTO lbl131
                                                                                            }
                                                                                            catch (oov v19) {
                                                                                                throw d55.a(v19);
                                                                                            }
                                                                                            v18 = var7_7;
                                                                                            if (var4_4 == 0) break block101;
                                                                                        }
                                                                                        catch (oov v20) {
                                                                                            throw d55.a(v20);
                                                                                        }
                                                                                        if (v18 < 256) {
                                                                                        }
                                                                                        ** GOTO lbl131
                                                                                    }
                                                                                    catch (oov v21) {
                                                                                        throw d55.a(v21);
                                                                                    }
                                                                                    v22 = this.mgy(var1_1.getBlockState(var9_10.bj0(var10_13, var7_7, var11_14)).r_y());
                                                                                    if (var4_4 == 0) break block102;
                                                                                }
                                                                                catch (oov v23) {
                                                                                    throw d55.a(v23);
                                                                                }
                                                                                if (v22) continue;
                                                                            }
                                                                            catch (oov v24) {
                                                                                throw d55.a(v24);
                                                                            }
                                                                            v22 = false;
                                                                        }
                                                                        var6_6 = (int)v22;
                                                                        try {
                                                                            if (var4_4 != 0) continue;
lbl131:
                                                                            // 3 sources

                                                                            v18 = 0;
                                                                        }
                                                                        catch (oov v25) {
                                                                            throw d55.a(v25);
                                                                        }
                                                                    }
                                                                    var6_6 = v18;
                                                                    if (var4_4 != 0) continue;
                                                                }
                                                                ++var10_13;
                                                                if (var4_4 != 0) continue block70;
                                                            }
                                                            break;
                                                        }
                                                        ++var7_7;
                                                        if (var4_4 != 0) continue block68;
                                                    }
                                                    break;
                                                }
                                                v7 = var6_6;
                                            }
                                            try {
                                                if (var4_4 == 0) break block103;
                                                if (v7 != 0) break block104;
                                            }
                                            catch (oov v26) {
                                                throw d55.a(v26);
                                            }
                                            v7 = 0;
                                        }
                                        return (boolean)v7;
                                    }
                                    var7_8 = var1_1.getBlockState(var3_3.eve()).r_y();
                                    try {
                                        try {
                                            v27 = var7_8;
                                            v28 /* !! */  = ox_.l11;
                                            if (var4_4 == 0) break block105;
                                            if (v27 != v28 /* !! */ ) {
                                            }
                                            ** GOTO lbl188
                                        }
                                        catch (oov v29) {
                                            throw d55.a(v29);
                                        }
                                        v27 = var7_8;
                                        v28 /* !! */  = ox_.kqk;
                                    }
                                    catch (oov v30) {
                                        throw d55.a(v30);
                                    }
                                }
                                try {
                                    try {
                                        if (var4_4 == 0) break block106;
                                        if (v27 != v28 /* !! */ ) {
                                        }
                                        ** GOTO lbl188
                                    }
                                    catch (oov v31) {
                                        throw d55.a(v31);
                                    }
                                    v27 = var7_8;
                                    v28 /* !! */  = ox_._5i;
                                }
                                catch (oov v32) {
                                    throw d55.a(v32);
                                }
                            }
                            try {
                                try {
                                    if (v27 != v28 /* !! */ ) break block107;
lbl188:
                                    // 3 sources

                                    v33 = var3_3.getY();
                                    if (var4_4 == 0) break block108;
                                }
                                catch (oov v34) {
                                    throw d55.a(v34);
                                }
                                if (v33 >= 256 - var5_5 - 1) break block107;
                            }
                            catch (oov v35) {
                                throw d55.a(v35);
                            }
                            this.g27(var1_1, var3_3.eve());
                            var8_9 = var3_3.getY() - 3 + var5_5;
                            block73: while (true) {
                                v36 = var8_9;
                                block74: while (v36 <= var3_3.getY() + var5_5) {
                                    var9_11 = var8_9 - (var3_3.getY() + var5_5);
                                    var10_13 = 1 - var9_11 / 2;
                                    v37 = var3_3.getX() - var10_13;
                                    if (var4_4 == 0) break block109;
                                    var11_14 = v37;
                                    block75: while (true) {
                                        v38 = var11_14;
                                        v39 = var3_3.getX() + var10_13;
                                        block76: while (v38 <= v39) {
                                            var12_15 = var11_14 - var3_3.getX();
                                            v36 = var3_3.getZ() - var10_13;
                                            if (var4_4 == 0) continue block74;
                                            for (var13_16 = v1040176; var13_16 <= var3_3.getZ() + var10_13; ++var13_16) {
                                                block114: {
                                                    block111: {
                                                        block113: {
                                                            block112: {
                                                                block110: {
                                                                    var14_17 = var13_16 - var3_3.getZ();
                                                                    v38 = Math.abs(var12_15);
                                                                    v39 = var10_13;
                                                                    if (var4_4 == 0) continue block76;
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var4_4 == 0) break block110;
                                                                                if (v38 != v39) break block111;
                                                                            }
                                                                            catch (oov v40) {
                                                                                throw d55.a(v40);
                                                                            }
                                                                            v41 = Math.abs(var14_17);
                                                                            if (var4_4 == 0) break block112;
                                                                        }
                                                                        catch (oov v42) {
                                                                            throw d55.a(v42);
                                                                        }
                                                                        v43 = var10_13;
                                                                    }
                                                                    catch (oov v44) {
                                                                        throw d55.a(v44);
                                                                    }
                                                                }
                                                                try {
                                                                    if (v41 != v43) break block111;
                                                                    v41 = var2_2.nextInt(2);
                                                                }
                                                                catch (oov v45) {
                                                                    throw d55.a(v45);
                                                                }
                                                            }
                                                            try {
                                                                if (var4_4 == 0) break block113;
                                                                if (v41 == 0) continue;
                                                            }
                                                            catch (oov v46) {
                                                                throw d55.a(v46);
                                                            }
                                                            v41 = var9_11;
                                                        }
                                                        if (v41 == 0) continue;
                                                    }
                                                    var15_18 = new mew(var11_14, var8_9, var13_16);
                                                    var16_19 = var1_1.getBlockState(var15_18).r_y();
                                                    try {
                                                        try {
                                                            v47 = var16_19.p1r();
                                                            v48 = p3y.cei;
                                                            if (var4_4 == 0) break block114;
                                                            if (v47 != v48) {
                                                            }
                                                            ** GOTO lbl274
                                                        }
                                                        catch (oov v49) {
                                                            throw d55.a(v49);
                                                        }
                                                        v47 = var16_19.p1r();
                                                        v48 = p3y.hh1;
                                                    }
                                                    catch (oov v50) {
                                                        throw d55.a(v50);
                                                    }
                                                }
                                                try {
                                                    if (v47 != v48) continue;
lbl274:
                                                    // 2 sources

                                                    this.u0f(var1_1, var15_18, d55.k9h);
                                                    continue;
                                                }
                                                catch (oov v51) {
                                                    throw d55.a(v51);
                                                }
                                            }
                                            ++var11_14;
                                            if (var4_4 != 0) continue block75;
                                        }
                                        break;
                                    }
                                    ++var8_9;
                                    if (var4_4 != 0) continue block73;
                                }
                                break;
                            }
                            v37 = var8_9 = 0;
                        }
                        while (var8_9 < var5_5) {
                            block116: {
                                block115: {
                                    var9_12 = var1_1.getBlockState(var3_3.z89(var8_9)).r_y();
                                    try {
                                        try {
                                            v52 = var9_12.p1r();
                                            v53 = p3y.cei;
                                            if (var4_4 == 0) break block115;
                                            if (v52 != v53) {
                                            }
                                            ** GOTO lbl304
                                        }
                                        catch (oov v54) {
                                            throw d55.a(v54);
                                        }
                                        v52 = var9_12.p1r();
                                        v53 = p3y.hh1;
                                    }
                                    catch (oov v55) {
                                        throw d55.a(v55);
                                    }
                                }
                                try {
                                    if (v52 != v53) break block116;
lbl304:
                                    // 2 sources

                                    this.u0f(var1_1, var3_3.z89(var8_9), d55.p2y);
                                }
                                catch (oov v56) {
                                    throw d55.a(v56);
                                }
                            }
                            ++var8_9;
                            if (var4_4 != 0) continue;
                        }
                        return true;
                    }
                    v33 = 0;
                }
                return (boolean)v33;
            }
            v2 = 0;
        }
        return (boolean)v2;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

