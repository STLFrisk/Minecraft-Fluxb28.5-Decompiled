/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ffn
extends e9q {
    private static final zfz g0v = ox_.uom.l4i().zvi(qv5.yuo, (Comparable)((Object)x54$lti.mdr));
    private static final zfz xuc = ox_.rwl.l4i().zvi(uav.nps, (Comparable)((Object)x54$lti.mdr)).zvi(_cv.sdu, Boolean.valueOf(false));
    private final int git;
    private final boolean prq;
    private final zfz scb;
    private final zfz hux;

    public ffn(boolean bl) {
        this(bl, 4, g0v, xuc, false);
    }

    public ffn(boolean bl, int n, zfz zfz2, zfz zfz3, boolean bl2) {
        super(bl);
        this.git = n;
        this.scb = zfz2;
        this.hux = zfz3;
        this.prq = bl2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean v3g(t9d var1_1, Random var2_2, mew var3_3) {
        block182: {
            block183: {
                block197: {
                    block196: {
                        block218: {
                            block205: {
                                block219: {
                                    block198: {
                                        block195: {
                                            block194: {
                                                block193: {
                                                    block192: {
                                                        block184: {
                                                            var5_4 = var2_2.nextInt(3) + this.git;
                                                            var6_5 = 1;
                                                            var4_6 = t9d.c();
                                                            try {
                                                                try {
                                                                    try {
                                                                        v0 = var3_3.getY();
                                                                        if (var4_6 != 0) break block182;
                                                                        if (v0 < 1) break block183;
                                                                    }
                                                                    catch (oov v1) {
                                                                        throw ffn.d(v1);
                                                                    }
                                                                    v0 = var3_3.getY() + var5_4 + 1;
                                                                    if (var4_6 != 0) break block182;
                                                                }
                                                                catch (oov v2) {
                                                                    throw ffn.d(v2);
                                                                }
                                                                if (v0 > 256) break block183;
                                                            }
                                                            catch (oov v3) {
                                                                throw ffn.d(v3);
                                                            }
                                                            var7_7 = var3_3.getY();
                                                            block148: while (true) {
                                                                v4 = var7_7;
                                                                block149: while (v4 <= var3_3.getY() + 1 + var5_4) {
                                                                    block229: {
                                                                        block187: {
                                                                            block185: {
                                                                                block186: {
                                                                                    var8_9 = 1;
                                                                                    try {
                                                                                        try {
                                                                                            v5 = var7_7;
                                                                                            if (var4_6 != 0) break block184;
                                                                                            v6 = var3_3.getY();
                                                                                            if (var4_6 != 0) break block185;
                                                                                        }
                                                                                        catch (oov v7) {
                                                                                            throw ffn.d(v7);
                                                                                        }
                                                                                        if (v5 != v6) break block186;
                                                                                    }
                                                                                    catch (oov v8) {
                                                                                        throw ffn.d(v8);
                                                                                    }
                                                                                    var8_9 = 0;
                                                                                }
                                                                                try {
                                                                                    v9 = var7_7;
                                                                                    if (var4_6 != 0) break block187;
                                                                                    v6 = var3_3.getY() + 1 + var5_4 - 2;
                                                                                }
                                                                                catch (oov v10) {
                                                                                    throw ffn.d(v10);
                                                                                }
                                                                            }
                                                                            if (v9 < v6) break block229;
                                                                            v9 = 2;
                                                                        }
                                                                        var8_9 = v9;
                                                                    }
                                                                    var9_10 = new mew$mix();
                                                                    var10_12 = var3_3.getX() - var8_9;
                                                                    block150: while (true) {
                                                                        v11 = var10_12;
                                                                        block151: while (v11 <= var3_3.getX() + var8_9) {
                                                                            block188: {
                                                                                v4 = var6_5;
                                                                                if (var4_6 != 0) continue block149;
                                                                                try {
                                                                                    try {
                                                                                        if (var4_6 != 0) break block188;
                                                                                        if (v4 == 0) break block150;
                                                                                    }
                                                                                    catch (oov v12) {
                                                                                        throw ffn.d(v12);
                                                                                    }
                                                                                    v13 = var3_3.getZ() - var8_9;
                                                                                }
                                                                                catch (oov v14) {
                                                                                    throw ffn.d(v14);
                                                                                }
                                                                            }
                                                                            for (var11_13 = v1523121; var11_13 <= var3_3.getZ() + var8_9; ++var11_13) {
                                                                                block190: {
                                                                                    block191: {
                                                                                        block189: {
                                                                                            v11 = var6_5;
                                                                                            if (var4_6 != 0) continue block151;
                                                                                            try {
                                                                                                if (var4_6 != 0) break block189;
                                                                                                if (v11 == 0) break;
                                                                                            }
                                                                                            catch (oov v15) {
                                                                                                throw ffn.d(v15);
                                                                                            }
                                                                                            v16 = var7_7;
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var4_6 != 0) break block190;
                                                                                                            if (v16 >= 0) {
                                                                                                            }
                                                                                                            ** GOTO lbl120
                                                                                                        }
                                                                                                        catch (oov v17) {
                                                                                                            throw ffn.d(v17);
                                                                                                        }
                                                                                                        v16 = var7_7;
                                                                                                        if (var4_6 != 0) break block190;
                                                                                                    }
                                                                                                    catch (oov v18) {
                                                                                                        throw ffn.d(v18);
                                                                                                    }
                                                                                                    if (v16 < 256) {
                                                                                                    }
                                                                                                    ** GOTO lbl120
                                                                                                }
                                                                                                catch (oov v19) {
                                                                                                    throw ffn.d(v19);
                                                                                                }
                                                                                                v20 = this.mgy(var1_1.getBlockState(var9_10.bj0(var10_12, var7_7, var11_13)).r_y());
                                                                                                if (var4_6 != 0) break block191;
                                                                                            }
                                                                                            catch (oov v21) {
                                                                                                throw ffn.d(v21);
                                                                                            }
                                                                                            if (v20) continue;
                                                                                        }
                                                                                        catch (oov v22) {
                                                                                            throw ffn.d(v22);
                                                                                        }
                                                                                        v20 = false;
                                                                                    }
                                                                                    var6_5 = (int)v20;
                                                                                    try {
                                                                                        if (var4_6 == 0) continue;
lbl120:
                                                                                        // 3 sources

                                                                                        v16 = 0;
                                                                                    }
                                                                                    catch (oov v23) {
                                                                                        throw ffn.d(v23);
                                                                                    }
                                                                                }
                                                                                var6_5 = v16;
                                                                                if (var4_6 == 0) continue;
                                                                            }
                                                                            ++var10_12;
                                                                            if (var4_6 == 0) continue block150;
                                                                        }
                                                                        break;
                                                                    }
                                                                    ++var7_7;
                                                                    if (var4_6 == 0) continue block148;
                                                                }
                                                                break;
                                                            }
                                                            v5 = var6_5;
                                                        }
                                                        try {
                                                            if (var4_6 != 0) break block192;
                                                            if (v5 != 0) break block193;
                                                        }
                                                        catch (oov v24) {
                                                            throw ffn.d(v24);
                                                        }
                                                        v5 = 0;
                                                    }
                                                    return (boolean)v5;
                                                }
                                                var7_8 = var1_1.getBlockState(var3_3.eve()).r_y();
                                                try {
                                                    try {
                                                        v25 = var7_8;
                                                        v26 /* !! */  = ox_.l11;
                                                        if (var4_6 != 0) break block194;
                                                        if (v25 != v26 /* !! */ ) {
                                                        }
                                                        ** GOTO lbl177
                                                    }
                                                    catch (oov v27) {
                                                        throw ffn.d(v27);
                                                    }
                                                    v25 = var7_8;
                                                    v26 /* !! */  = ox_.kqk;
                                                }
                                                catch (oov v28) {
                                                    throw ffn.d(v28);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (var4_6 != 0) break block195;
                                                    if (v25 != v26 /* !! */ ) {
                                                    }
                                                    ** GOTO lbl177
                                                }
                                                catch (oov v29) {
                                                    throw ffn.d(v29);
                                                }
                                                v25 = var7_8;
                                                v26 /* !! */  = ox_._5i;
                                            }
                                            catch (oov v30) {
                                                throw ffn.d(v30);
                                            }
                                        }
                                        try {
                                            try {
                                                if (v25 != v26 /* !! */ ) break block196;
lbl177:
                                                // 3 sources

                                                v31 = var3_3.getY();
                                                if (var4_6 != 0) break block197;
                                            }
                                            catch (oov v32) {
                                                throw ffn.d(v32);
                                            }
                                            if (v31 >= 256 - var5_4 - 1) break block196;
                                        }
                                        catch (oov v33) {
                                            throw ffn.d(v33);
                                        }
                                        this.g27(var1_1, var3_3.eve());
                                        var8_9 = 3;
                                        var9_11 = 0;
                                        var10_12 = var3_3.getY() - var8_9 + var5_4;
                                        block153: while (true) {
                                            v34 = var10_12;
                                            block154: while (v34 <= var3_3.getY() + var5_4) {
                                                var11_13 = var10_12 - (var3_3.getY() + var5_4);
                                                var12_18 = var9_11 + 1 - var11_13 / 2;
                                                v35 = var3_3.getX() - var12_18;
                                                if (var4_6 != 0) break block198;
                                                var13_20 = v35;
                                                block155: while (true) {
                                                    v36 = var13_20;
                                                    v37 = var3_3.getX() + var12_18;
                                                    block156: while (v36 <= v37) {
                                                        var14_24 = var13_20 - var3_3.getX();
                                                        v34 = var3_3.getZ() - var12_18;
                                                        if (var4_6 != 0) continue block154;
                                                        for (var15_25 = v1523188; var15_25 <= var3_3.getZ() + var12_18; ++var15_25) {
                                                            block204: {
                                                                block203: {
                                                                    block200: {
                                                                        block202: {
                                                                            block201: {
                                                                                block199: {
                                                                                    var16_26 = var15_25 - var3_3.getZ();
                                                                                    v36 = Math.abs(var14_24);
                                                                                    v37 = var12_18;
                                                                                    if (var4_6 != 0) continue block156;
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (var4_6 != 0) break block199;
                                                                                                if (v36 != v37) break block200;
                                                                                            }
                                                                                            catch (oov v38) {
                                                                                                throw ffn.d(v38);
                                                                                            }
                                                                                            v39 = Math.abs(var16_26);
                                                                                            if (var4_6 != 0) break block201;
                                                                                        }
                                                                                        catch (oov v40) {
                                                                                            throw ffn.d(v40);
                                                                                        }
                                                                                        v41 = var12_18;
                                                                                    }
                                                                                    catch (oov v42) {
                                                                                        throw ffn.d(v42);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (v39 != v41) break block200;
                                                                                    v39 = var2_2.nextInt(2);
                                                                                }
                                                                                catch (oov v43) {
                                                                                    throw ffn.d(v43);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (var4_6 != 0) break block202;
                                                                                if (v39 == 0) continue;
                                                                            }
                                                                            catch (oov v44) {
                                                                                throw ffn.d(v44);
                                                                            }
                                                                            v39 = var11_13;
                                                                        }
                                                                        if (v39 == 0) continue;
                                                                    }
                                                                    var17_28 = new mew(var13_20, var10_12, var15_25);
                                                                    var18_29 = var1_1.getBlockState(var17_28).r_y();
                                                                    try {
                                                                        try {
                                                                            v45 = var18_29.p1r();
                                                                            v46 = p3y.cei;
                                                                            if (var4_6 != 0) break block203;
                                                                            if (v45 != v46) {
                                                                            }
                                                                            ** GOTO lbl279
                                                                        }
                                                                        catch (oov v47) {
                                                                            throw ffn.d(v47);
                                                                        }
                                                                        v45 = var18_29.p1r();
                                                                        v46 = p3y.hh1;
                                                                    }
                                                                    catch (oov v48) {
                                                                        throw ffn.d(v48);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        if (var4_6 != 0) break block204;
                                                                        if (v45 != v46) {
                                                                        }
                                                                        ** GOTO lbl279
                                                                    }
                                                                    catch (oov v49) {
                                                                        throw ffn.d(v49);
                                                                    }
                                                                    v45 = var18_29.p1r();
                                                                    v46 = p3y.wui;
                                                                }
                                                                catch (oov v50) {
                                                                    throw ffn.d(v50);
                                                                }
                                                            }
                                                            try {
                                                                if (v45 != v46) continue;
lbl279:
                                                                // 3 sources

                                                                this.u0f(var1_1, var17_28, this.hux);
                                                                continue;
                                                            }
                                                            catch (oov v51) {
                                                                throw ffn.d(v51);
                                                            }
                                                        }
                                                        ++var13_20;
                                                        if (var4_6 == 0) continue block155;
                                                    }
                                                    break;
                                                }
                                                ++var10_12;
                                                if (var4_6 == 0) continue block153;
                                            }
                                            break;
                                        }
                                        v35 = var10_12 = 0;
                                    }
                                    while (var10_12 < var5_4) {
                                        block209: {
                                            block208: {
                                                block217: {
                                                    block215: {
                                                        block216: {
                                                            block213: {
                                                                block214: {
                                                                    block211: {
                                                                        block212: {
                                                                            block210: {
                                                                                block206: {
                                                                                    block207: {
                                                                                        var11_15 = var1_1.getBlockState(var3_3.z89(var10_12)).r_y();
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var4_6 != 0) break block205;
                                                                                                            if (var4_6 != 0) break block206;
                                                                                                        }
                                                                                                        catch (oov v52) {
                                                                                                            throw ffn.d(v52);
                                                                                                        }
                                                                                                        if (var11_15.p1r() != p3y.cei) {
                                                                                                        }
                                                                                                        ** GOTO lbl325
                                                                                                    }
                                                                                                    catch (oov v53) {
                                                                                                        throw ffn.d(v53);
                                                                                                    }
                                                                                                    v54 = var11_15.p1r();
                                                                                                    v55 = p3y.hh1;
                                                                                                    if (var4_6 != 0) break block207;
                                                                                                }
                                                                                                catch (oov v56) {
                                                                                                    throw ffn.d(v56);
                                                                                                }
                                                                                                if (v54 != v55) {
                                                                                                }
                                                                                                ** GOTO lbl325
                                                                                            }
                                                                                            catch (oov v57) {
                                                                                                throw ffn.d(v57);
                                                                                            }
                                                                                            v54 = var11_15.p1r();
                                                                                            v55 = p3y.wui;
                                                                                        }
                                                                                        catch (oov v58) {
                                                                                            throw ffn.d(v58);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (v54 != v55) break block208;
lbl325:
                                                                                        // 3 sources

                                                                                        this.u0f(var1_1, var3_3.z89(var10_12), this.scb);
                                                                                    }
                                                                                    catch (oov v59) {
                                                                                        throw ffn.d(v59);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (var4_6 != 0) break block209;
                                                                                                if (!this.prq) break block208;
                                                                                            }
                                                                                            catch (oov v60) {
                                                                                                throw ffn.d(v60);
                                                                                            }
                                                                                            v61 = var10_12;
                                                                                            if (var4_6 != 0) break block210;
                                                                                        }
                                                                                        catch (oov v62) {
                                                                                            throw ffn.d(v62);
                                                                                        }
                                                                                        if (v61 <= 0) break block208;
                                                                                    }
                                                                                    catch (oov v63) {
                                                                                        throw ffn.d(v63);
                                                                                    }
                                                                                    v61 = var2_2.nextInt(3);
                                                                                }
                                                                                catch (oov v64) {
                                                                                    throw ffn.d(v64);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (var4_6 != 0) break block211;
                                                                                            if (v61 <= 0) break block212;
                                                                                        }
                                                                                        catch (oov v65) {
                                                                                            throw ffn.d(v65);
                                                                                        }
                                                                                        v61 = (int)var1_1.isAirBlock(var3_3.ec4(-1, var10_12, 0));
                                                                                        if (var4_6 != 0) break block211;
                                                                                    }
                                                                                    catch (oov v66) {
                                                                                        throw ffn.d(v66);
                                                                                    }
                                                                                    if (v61 == 0) break block212;
                                                                                }
                                                                                catch (oov v67) {
                                                                                    throw ffn.d(v67);
                                                                                }
                                                                                this.wgd(var1_1, var3_3.ec4(-1, var10_12, 0), pcl.t6u);
                                                                            }
                                                                            catch (oov v68) {
                                                                                throw ffn.d(v68);
                                                                            }
                                                                        }
                                                                        v61 = var2_2.nextInt(3);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var4_6 != 0) break block213;
                                                                                    if (v61 <= 0) break block214;
                                                                                }
                                                                                catch (oov v69) {
                                                                                    throw ffn.d(v69);
                                                                                }
                                                                                v61 = (int)var1_1.isAirBlock(var3_3.ec4(1, var10_12, 0));
                                                                                if (var4_6 != 0) break block213;
                                                                            }
                                                                            catch (oov v70) {
                                                                                throw ffn.d(v70);
                                                                            }
                                                                            if (v61 == 0) break block214;
                                                                        }
                                                                        catch (oov v71) {
                                                                            throw ffn.d(v71);
                                                                        }
                                                                        this.wgd(var1_1, var3_3.ec4(1, var10_12, 0), pcl.m4e);
                                                                    }
                                                                    catch (oov v72) {
                                                                        throw ffn.d(v72);
                                                                    }
                                                                }
                                                                v61 = var2_2.nextInt(3);
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var4_6 != 0) break block215;
                                                                            if (v61 <= 0) break block216;
                                                                        }
                                                                        catch (oov v73) {
                                                                            throw ffn.d(v73);
                                                                        }
                                                                        v61 = (int)var1_1.isAirBlock(var3_3.ec4(0, var10_12, -1));
                                                                        if (var4_6 != 0) break block215;
                                                                    }
                                                                    catch (oov v74) {
                                                                        throw ffn.d(v74);
                                                                    }
                                                                    if (v61 == 0) break block216;
                                                                }
                                                                catch (oov v75) {
                                                                    throw ffn.d(v75);
                                                                }
                                                                this.wgd(var1_1, var3_3.ec4(0, var10_12, -1), pcl.leq);
                                                            }
                                                            catch (oov v76) {
                                                                throw ffn.d(v76);
                                                            }
                                                        }
                                                        v61 = var2_2.nextInt(3);
                                                    }
                                                    try {
                                                        try {
                                                            if (var4_6 != 0) break block217;
                                                            if (v61 <= 0) break block208;
                                                        }
                                                        catch (oov v77) {
                                                            throw ffn.d(v77);
                                                        }
                                                        v61 = (int)var1_1.isAirBlock(var3_3.ec4(0, var10_12, 1));
                                                    }
                                                    catch (oov v78) {
                                                        throw ffn.d(v78);
                                                    }
                                                }
                                                try {
                                                    if (v61 != 0) {
                                                        this.wgd(var1_1, var3_3.ec4(0, var10_12, 1), pcl.qme);
                                                    }
                                                }
                                                catch (oov v79) {
                                                    throw ffn.d(v79);
                                                }
                                            }
                                            ++var10_12;
                                        }
                                        if (var4_6 == 0) continue;
                                    }
                                    try {
                                        v80 = this.prq;
                                        if (var4_6 != 0) break block218;
                                        if (v80 == 0) break block205;
                                    }
                                    catch (oov v81) {
                                        throw ffn.d(v81);
                                    }
                                    var10_12 = var3_3.getY() - 3 + var5_4;
                                    block159: while (true) {
                                        v82 = var10_12;
                                        block160: while (v82 <= var3_3.getY() + var5_4) {
                                            var11_16 = var10_12 - (var3_3.getY() + var5_4);
                                            var12_18 = 2 - var11_16 / 2;
                                            var13_22 = new mew$mix();
                                            v80 = var3_3.getX() - var12_18;
                                            if (var4_6 != 0) break block219;
                                            var14_24 = v80;
                                            while (var14_24 <= var3_3.getX() + var12_18) {
                                                block220: {
                                                    v82 = var3_3.getZ() - var12_18;
                                                    if (var4_6 != 0) continue block160;
                                                    var15_25 = v82;
                                                    while (var15_25 <= var3_3.getZ() + var12_18) {
                                                        block221: {
                                                            block222: {
                                                                block227: {
                                                                    block228: {
                                                                        block225: {
                                                                            block226: {
                                                                                block223: {
                                                                                    block224: {
                                                                                        try {
                                                                                            try {
                                                                                                var13_22.bj0(var14_24, var10_12, var15_25);
                                                                                                if (var4_6 != 0) break block220;
                                                                                                if (var4_6 != 0) break block221;
                                                                                            }
                                                                                            catch (oov v83) {
                                                                                                throw ffn.d(v83);
                                                                                            }
                                                                                            if (var1_1.getBlockState(var13_22).r_y().p1r() != p3y.hh1) break block222;
                                                                                        }
                                                                                        catch (oov v84) {
                                                                                            throw ffn.d(v84);
                                                                                        }
                                                                                        var16_27 = var13_22.y8e();
                                                                                        var17_28 = var13_22.o_8();
                                                                                        var18_29 = var13_22.idu();
                                                                                        var19_30 = var13_22.z6x();
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v85 = var2_2.nextInt(4);
                                                                                                    if (var4_6 != 0) break block223;
                                                                                                    if (v85 != 0) break block224;
                                                                                                }
                                                                                                catch (oov v86) {
                                                                                                    throw ffn.d(v86);
                                                                                                }
                                                                                                if (var1_1.getBlockState(var16_27).r_y().p1r() != p3y.cei) break block224;
                                                                                            }
                                                                                            catch (oov v87) {
                                                                                                throw ffn.d(v87);
                                                                                            }
                                                                                            this.o4l(var1_1, var16_27, pcl.t6u);
                                                                                        }
                                                                                        catch (oov v88) {
                                                                                            throw ffn.d(v88);
                                                                                        }
                                                                                    }
                                                                                    v85 = var2_2.nextInt(4);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (var4_6 != 0) break block225;
                                                                                            if (v85 != 0) break block226;
                                                                                        }
                                                                                        catch (oov v89) {
                                                                                            throw ffn.d(v89);
                                                                                        }
                                                                                        if (var1_1.getBlockState(var17_28).r_y().p1r() != p3y.cei) break block226;
                                                                                    }
                                                                                    catch (oov v90) {
                                                                                        throw ffn.d(v90);
                                                                                    }
                                                                                    this.o4l(var1_1, var17_28, pcl.m4e);
                                                                                }
                                                                                catch (oov v91) {
                                                                                    throw ffn.d(v91);
                                                                                }
                                                                            }
                                                                            v85 = var2_2.nextInt(4);
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var4_6 != 0) break block227;
                                                                                    if (v85 != 0) break block228;
                                                                                }
                                                                                catch (oov v92) {
                                                                                    throw ffn.d(v92);
                                                                                }
                                                                                if (var1_1.getBlockState((mew)var18_29).r_y().p1r() != p3y.cei) break block228;
                                                                            }
                                                                            catch (oov v93) {
                                                                                throw ffn.d(v93);
                                                                            }
                                                                            this.o4l(var1_1, (mew)var18_29, pcl.leq);
                                                                        }
                                                                        catch (oov v94) {
                                                                            throw ffn.d(v94);
                                                                        }
                                                                    }
                                                                    v85 = var2_2.nextInt(4);
                                                                }
                                                                try {
                                                                    try {
                                                                        if (v85 != 0 || var1_1.getBlockState(var19_30).r_y().p1r() != p3y.cei) break block222;
                                                                    }
                                                                    catch (oov v95) {
                                                                        throw ffn.d(v95);
                                                                    }
                                                                    this.o4l(var1_1, var19_30, pcl.qme);
                                                                }
                                                                catch (oov v96) {
                                                                    throw ffn.d(v96);
                                                                }
                                                            }
                                                            ++var15_25;
                                                        }
                                                        if (var4_6 == 0) continue;
                                                    }
                                                    ++var14_24;
                                                }
                                                if (var4_6 == 0) continue;
                                            }
                                            ++var10_12;
                                            if (var4_6 == 0) continue block159;
                                        }
                                        break;
                                    }
                                    v80 = var2_2.nextInt(5);
                                }
                                try {
                                    try {
                                        try {
                                            if (var4_6 != 0) break block218;
                                            if (v80 != 0) break block205;
                                        }
                                        catch (oov v97) {
                                            throw ffn.d(v97);
                                        }
                                        v80 = var5_4;
                                        if (var4_6 != 0) break block218;
                                    }
                                    catch (oov v98) {
                                        throw ffn.d(v98);
                                    }
                                    if (v80 <= 5) break block205;
                                }
                                catch (oov v99) {
                                    throw ffn.d(v99);
                                }
                                var10_12 = 0;
                                block163: while (true) {
                                    v100 = var10_12;
                                    block164: while (v100 < 2) {
                                        for (vt2 var12_19 : vt2$unz.fzl) {
                                            v100 = var2_2.nextInt(4 - var10_12);
                                            if (var4_6 != 0) continue block164;
                                            if (v100 == 0) {
                                                var13_23 = var12_19.b4b();
                                                this.a4p(var1_1, var2_2.nextInt(3), var3_3.ec4(var13_23.n67(), var5_4 - 5 + var10_12, var13_23.ozy()), var12_19);
                                            }
                                            if (var4_6 == 0) continue;
                                        }
                                        ++var10_12;
                                        if (var4_6 == 0) continue block163;
                                    }
                                    break;
                                }
                            }
                            v80 = 1;
                        }
                        return (boolean)v80;
                    }
                    v31 = 0;
                }
                return (boolean)v31;
            }
            v0 = 0;
        }
        return (boolean)v0;
    }

    private void a4p(t9d t9d2, int n, mew mew2, vt2 vt22) {
        this.u0f(t9d2, mew2, ox_.ox_.l4i().zvi(kre.q7v, Integer.valueOf(n)).zvi(kre.em9, (Comparable)((Object)vt22)));
    }

    private void wgd(t9d t9d2, mew mew2, h76 h762) {
        this.u0f(t9d2, mew2, ox_.s25.l4i().zvi(h762, Boolean.valueOf(true)));
    }

    private void o4l(t9d t9d2, mew mew2, h76 h762) {
        this.wgd(t9d2, mew2, h762);
        int n = t9d.b();
        mew2 = mew2.eve();
        for (int i = 4; t9d2.getBlockState(mew2).r_y().p1r() == p3y.cei && i > 0; --i) {
            this.wgd(t9d2, mew2, h762);
            mew2 = mew2.eve();
            if (n != 0) continue;
        }
    }

    private static oov d(oov oov2) {
        return oov2;
    }
}

