/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class dlv
extends bc_ {
    private static final long a;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;

    @Override
    public String xue() {
        long l = a ^ 0x4A674194A042L;
        return dlv.b("v", (int)20335, (long)(0x1D82D2483381F1EDL ^ l));
    }

    @Override
    public int bag() {
        return 2;
    }

    @Override
    public String fm7(e7r e7r2) {
        long l = a ^ 0x44990203FCC4L;
        return dlv.b("v", (int)13325, (long)(0x786BBC3AEE8ED61DL ^ l));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void l3z(e7r var1_1, String[] var2_2) {
        block187: {
            block186: {
                block159: {
                    block158: {
                        block157: {
                            block155: {
                                block156: {
                                    block154: {
                                        block153: {
                                            var3_3 = dlv.a ^ 86195637671175L;
                                            var5_4 = t9d.c();
                                            try {
                                                if (var2_2.length < 7) {
                                                    throw new w57((String)dlv.b("v", (int)5347, (long)(4340057024498655013L ^ var3_3)), new Object[0]);
                                                }
                                            }
                                            catch (npr v0) {
                                                throw dlv.a(v0);
                                            }
                                            var1_1.io9(n_k$pbp.f1s, 0);
                                            var6_5 = dlv.tiq(var1_1, var2_2, 0, false);
                                            var7_6 = dlv.tiq(var1_1, var2_2, 3, false);
                                            var8_7 = bc_.dde(var1_1, var2_2[6]);
                                            var9_8 = 0;
                                            v1 = var2_2.length;
                                            if (var5_4 != 0) break block153;
                                            try {
                                                block188: {
                                                    if (v1 < 8) break block154;
                                                    break block188;
                                                    catch (npr v2) {
                                                        throw dlv.a(v2);
                                                    }
                                                }
                                                v1 = dlv.fzm(var2_2[7], 0, 15);
                                            }
                                            catch (npr v3) {
                                                throw dlv.a(v3);
                                            }
                                        }
                                        var9_8 = v1;
                                    }
                                    var10_9 = new mew(Math.min(var6_5.getX(), var7_6.getX()), Math.min(var6_5.getY(), var7_6.getY()), Math.min(var6_5.getZ(), var7_6.getZ()));
                                    var11_10 = new mew(Math.max(var6_5.getX(), var7_6.getX()), Math.max(var6_5.getY(), var7_6.getY()), Math.max(var6_5.getZ(), var7_6.getZ()));
                                    var12_11 = (var11_10.getX() - var10_9.getX() + 1) * (var11_10.getY() - var10_9.getY() + 1) * (var11_10.getZ() - var10_9.getZ() + 1);
                                    v4 = var12_11;
                                    if (var5_4 != 0) break block155;
                                    try {
                                        block189: {
                                            if (v4 <= 32768) break block156;
                                            break block189;
                                            catch (npr v5) {
                                                throw dlv.a(v5);
                                            }
                                        }
                                        v6 = new Object[2];
                                        v6[0] = var12_11;
                                        v6[1] = 32768;
                                        throw new uvb((String)dlv.b("v", (int)3979, (long)(9136554224278225992L ^ var3_3)), v6);
                                    }
                                    catch (npr v7) {
                                        throw dlv.a(v7);
                                    }
                                }
                                v4 = var10_9.getY();
                            }
                            if (var5_4 != 0) break block157;
                            try {
                                block190: {
                                    if (v4 < 0) ** GOTO lbl497
                                    break block190;
                                    catch (npr v8) {
                                        throw dlv.a(v8);
                                    }
                                }
                                v4 = var11_10.getY();
                            }
                            catch (npr v9) {
                                throw dlv.a(v9);
                            }
                        }
                        if (v4 >= 256) ** GOTO lbl497
                        var13_12 = var1_1.qha();
                        var14_13 = var10_9.getZ();
                        block122: while (true) {
                            v10 = var14_13;
                            block123: while (v10 < var11_10.getZ() + 16) {
                                for (var15_15 = var10_9.getX(); var15_15 < var11_10.getX() + 16; var15_15 += 16) {
                                    v10 = (int)var13_12.xjm(new mew(var15_15, var11_10.getY() - var10_9.getY(), var14_13));
                                    if (var5_4 != 0) continue block123;
                                    try {
                                        if (v10 != 0) continue;
                                        throw new uvb((String)dlv.b("v", (int)25639, (long)(5679875000896270317L ^ var3_3)), new Object[0]);
                                    }
                                    catch (npr v11) {
                                        throw dlv.a(v11);
                                    }
                                }
                                var14_13 += 16;
                                if (var5_4 == 0) continue block122;
                            }
                            break;
                        }
                        var14_14 = new bdo();
                        var15_15 = 0;
                        v12 = var2_2.length;
                        if (var5_4 != 0) break block158;
                        try {
                            block191: {
                                if (v12 < 10) break block159;
                                break block191;
                                catch (npr v13) {
                                    throw dlv.a(v13);
                                }
                            }
                            v12 = (int)var8_7.caz();
                        }
                        catch (npr v14) {
                            throw dlv.a(v14);
                        }
                    }
                    if (v12 != 0) {
                        var16_16 = dlv.as_(var1_1, var2_2, 9).rnh();
                        try {
                            var14_14 = sza.mft((String)var16_16);
                            var15_15 = 1;
                        }
                        catch (npr var17_17) {
                            throw new uvb((String)dlv.b("v", (int)30747, (long)(7788954757057754074L ^ var3_3)), new Object[]{var17_17.getMessage()});
                        }
                    }
                }
                var16_16 = Lists.newArrayList();
                var12_11 = 0;
                var17_18 = var10_9.getZ();
                block125: while (true) {
                    v15 = var17_18;
                    block126: while (v15 <= var11_10.getZ()) {
                        var18_20 = var10_9.getY();
                        block127: while (true) {
                            v16 = var18_20;
                            v17 = var11_10.getY();
                            block128: while (v16 <= v17) {
                                v15 = var10_9.getX();
                                if (var5_4 != 0) continue block126;
                                var19_23 = v15;
                                while (var19_23 <= var11_10.getX()) {
                                    block185: {
                                        block167: {
                                            block182: {
                                                block184: {
                                                    block183: {
                                                        block181: {
                                                            block166: {
                                                                block180: {
                                                                    block179: {
                                                                        block178: {
                                                                            block177: {
                                                                                block176: {
                                                                                    block175: {
                                                                                        block174: {
                                                                                            block161: {
                                                                                                block173: {
                                                                                                    block172: {
                                                                                                        block170: {
                                                                                                            block171: {
                                                                                                                block169: {
                                                                                                                    block168: {
                                                                                                                        block164: {
                                                                                                                            block165: {
                                                                                                                                block162: {
                                                                                                                                    block160: {
                                                                                                                                        var20_26 = new mew(var19_23, var18_20, var17_18);
                                                                                                                                        try {
                                                                                                                                            v18 = var2_2.length;
                                                                                                                                            if (var5_4 != 0) break block160;
                                                                                                                                            v17 = 9;
                                                                                                                                            if (var5_4 != 0) continue block128;
                                                                                                                                        }
                                                                                                                                        catch (npr v19) {
                                                                                                                                            throw dlv.a(v19);
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (v18 >= v17) {
                                                                                                                                                v18 = (int)var2_2[8].equals(dlv.b("v", (int)18108, (long)(945078589778136433L ^ var3_3)));
                                                                                                                                            }
                                                                                                                                            ** GOTO lbl386
                                                                                                                                        }
                                                                                                                                        catch (npr v20) {
                                                                                                                                            throw dlv.a(v20);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        block163: {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    if (var5_4 != 0) break block161;
                                                                                                                                                                    if (v18 == 0) {
                                                                                                                                                                    }
                                                                                                                                                                    ** GOTO lbl279
                                                                                                                                                                }
                                                                                                                                                                catch (npr v21) {
                                                                                                                                                                    throw dlv.a(v21);
                                                                                                                                                                }
                                                                                                                                                                v18 = (int)var2_2[8].equals(dlv.b("v", (int)19198, (long)(3619888804050960689L ^ var3_3)));
                                                                                                                                                                if (var5_4 != 0) break block161;
                                                                                                                                                            }
                                                                                                                                                            catch (npr v22) {
                                                                                                                                                                throw dlv.a(v22);
                                                                                                                                                            }
                                                                                                                                                            if (v18 == 0) {
                                                                                                                                                            }
                                                                                                                                                            ** GOTO lbl279
                                                                                                                                                        }
                                                                                                                                                        catch (npr v23) {
                                                                                                                                                            throw dlv.a(v23);
                                                                                                                                                        }
                                                                                                                                                        v24 = var2_2[8].equals(dlv.b("v", (int)7449, (long)(6518356685025269461L ^ var3_3)));
                                                                                                                                                        if (var5_4 != 0) break block162;
                                                                                                                                                    }
                                                                                                                                                    catch (npr v25) {
                                                                                                                                                        throw dlv.a(v25);
                                                                                                                                                    }
                                                                                                                                                    if (v24 == 0) break block163;
                                                                                                                                                }
                                                                                                                                                catch (npr v26) {
                                                                                                                                                    throw dlv.a(v26);
                                                                                                                                                }
                                                                                                                                                var13_12.yir(var20_26, true);
                                                                                                                                                if (var5_4 != 0) {
                                                                                                                                                }
                                                                                                                                                ** GOTO lbl386
                                                                                                                                            }
                                                                                                                                            catch (npr v27) {
                                                                                                                                                throw dlv.a(v27);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v24 = var2_2[8].equals(dlv.b("v", (int)28504, (long)(3138075910129689750L ^ var3_3)));
                                                                                                                                    }
                                                                                                                                    catch (npr v28) {
                                                                                                                                        throw dlv.a(v28);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                if (var5_4 != 0) break block164;
                                                                                                                                                if (v24 == 0) break block165;
                                                                                                                                            }
                                                                                                                                            catch (npr v29) {
                                                                                                                                                throw dlv.a(v29);
                                                                                                                                            }
                                                                                                                                            v30 = var13_12;
                                                                                                                                            v31 = var20_26;
                                                                                                                                            if (var5_4 != 0) break block166;
                                                                                                                                        }
                                                                                                                                        catch (npr v32) {
                                                                                                                                            throw dlv.a(v32);
                                                                                                                                        }
                                                                                                                                        if (!v30.isAirBlock(v31)) {
                                                                                                                                            break block167;
                                                                                                                                        }
                                                                                                                                        ** GOTO lbl386
                                                                                                                                    }
                                                                                                                                    catch (npr v33) {
                                                                                                                                        throw dlv.a(v33);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                catch (npr v34) {
                                                                                                                                    throw dlv.a(v34);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v24 = var2_2[8].equals(dlv.b("v", (int)27205, (long)(6460787668169531788L ^ var3_3)));
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (var5_4 != 0) break block168;
                                                                                                                                if (v24 != 0) {
                                                                                                                                }
                                                                                                                                ** GOTO lbl386
                                                                                                                            }
                                                                                                                            catch (npr v35) {
                                                                                                                                throw dlv.a(v35);
                                                                                                                            }
                                                                                                                            v24 = var8_7.caz();
                                                                                                                        }
                                                                                                                        catch (npr v36) {
                                                                                                                            throw dlv.a(v36);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (var5_4 != 0) break block169;
                                                                                                                            if (v24 == 0) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl386
                                                                                                                        }
                                                                                                                        catch (npr v37) {
                                                                                                                            throw dlv.a(v37);
                                                                                                                        }
                                                                                                                        v24 = var2_2.length;
                                                                                                                    }
                                                                                                                    catch (npr v38) {
                                                                                                                        throw dlv.a(v38);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    v39 = 9;
                                                                                                                    if (var5_4 != 0) break block170;
                                                                                                                    if (v24 <= v39) break block171;
                                                                                                                }
                                                                                                                catch (npr v40) {
                                                                                                                    throw dlv.a(v40);
                                                                                                                }
                                                                                                                var21_27 = bc_.dde(var1_1, var2_2[9]);
                                                                                                                try {
                                                                                                                    if (var13_12.getBlockState(var20_26).r_y() == var21_27) break block171;
                                                                                                                    break block167;
                                                                                                                }
                                                                                                                catch (npr v41) {
                                                                                                                    throw dlv.a(v41);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                v24 = var2_2.length;
                                                                                                                if (var5_4 != 0) break block172;
                                                                                                                v39 = 10;
                                                                                                            }
                                                                                                            catch (npr v42) {
                                                                                                                throw dlv.a(v42);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            if (v24 > v39) {
                                                                                                                v24 = bc_.ll_(var2_2[10]);
                                                                                                            }
                                                                                                            ** GOTO lbl386
                                                                                                        }
                                                                                                        catch (npr v43) {
                                                                                                            throw dlv.a(v43);
                                                                                                        }
                                                                                                    }
                                                                                                    var21_28 = v24;
                                                                                                    var22_30 = var13_12.getBlockState(var20_26);
                                                                                                    try {
                                                                                                        if (var22_30.r_y().hvp(var22_30) == var21_28) break block173;
                                                                                                        break block167;
                                                                                                    }
                                                                                                    catch (npr v44) {
                                                                                                        throw dlv.a(v44);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (var5_4 == 0) ** GOTO lbl386
lbl279:
                                                                                                    // 3 sources

                                                                                                    v18 = var19_23;
                                                                                                }
                                                                                                catch (npr v45) {
                                                                                                    throw dlv.a(v45);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    v46 = var10_9.getX();
                                                                                                    if (var5_4 != 0) break block174;
                                                                                                    if (v18 != v46) {
                                                                                                    }
                                                                                                    ** GOTO lbl386
                                                                                                }
                                                                                                catch (npr v47) {
                                                                                                    throw dlv.a(v47);
                                                                                                }
                                                                                                v18 = var19_23;
                                                                                                v46 = var11_10.getX();
                                                                                            }
                                                                                            catch (npr v48) {
                                                                                                throw dlv.a(v48);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                if (var5_4 != 0) break block175;
                                                                                                if (v18 != v46) {
                                                                                                }
                                                                                                ** GOTO lbl386
                                                                                            }
                                                                                            catch (npr v49) {
                                                                                                throw dlv.a(v49);
                                                                                            }
                                                                                            v18 = var18_20;
                                                                                            v46 = var10_9.getY();
                                                                                        }
                                                                                        catch (npr v50) {
                                                                                            throw dlv.a(v50);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (var5_4 != 0) break block176;
                                                                                            if (v18 != v46) {
                                                                                            }
                                                                                            ** GOTO lbl386
                                                                                        }
                                                                                        catch (npr v51) {
                                                                                            throw dlv.a(v51);
                                                                                        }
                                                                                        v18 = var18_20;
                                                                                        v46 = var11_10.getY();
                                                                                    }
                                                                                    catch (npr v52) {
                                                                                        throw dlv.a(v52);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var5_4 != 0) break block177;
                                                                                        if (v18 != v46) {
                                                                                        }
                                                                                        ** GOTO lbl386
                                                                                    }
                                                                                    catch (npr v53) {
                                                                                        throw dlv.a(v53);
                                                                                    }
                                                                                    v18 = var17_18;
                                                                                    v46 = var10_9.getZ();
                                                                                }
                                                                                catch (npr v54) {
                                                                                    throw dlv.a(v54);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var5_4 != 0) break block178;
                                                                                        if (v18 != v46) {
                                                                                        }
                                                                                        ** GOTO lbl386
                                                                                    }
                                                                                    catch (npr v55) {
                                                                                        throw dlv.a(v55);
                                                                                    }
                                                                                    v18 = var17_18;
                                                                                    if (var5_4 != 0) break block179;
                                                                                }
                                                                                catch (npr v56) {
                                                                                    throw dlv.a(v56);
                                                                                }
                                                                                v46 = var11_10.getZ();
                                                                            }
                                                                            catch (npr v57) {
                                                                                throw dlv.a(v57);
                                                                            }
                                                                        }
                                                                        try {
                                                                            if (v18 != v46) {
                                                                                v18 = (int)var2_2[8].equals(dlv.b("v", (int)19198, (long)(3619888804050960689L ^ var3_3)));
                                                                            }
                                                                            ** GOTO lbl386
                                                                        }
                                                                        catch (npr v58) {
                                                                            throw dlv.a(v58);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var5_4 != 0) break block180;
                                                                            if (v18 == 0) break block167;
                                                                        }
                                                                        catch (npr v59) {
                                                                            throw dlv.a(v59);
                                                                        }
                                                                        var13_12.vct(var20_26, ox_.ibw.l4i(), 2);
                                                                        v18 = (int)var16_16.add(var20_26);
                                                                    }
                                                                    catch (npr v60) {
                                                                        throw dlv.a(v60);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var5_4 == 0) break block167;
lbl386:
                                                                    // 14 sources

                                                                    v30 = var13_12;
                                                                    v31 = var20_26;
                                                                }
                                                                catch (npr v61) {
                                                                    throw dlv.a(v61);
                                                                }
                                                            }
                                                            var21_29 = v30.getTileEntity(v31);
                                                            try {
                                                                v62 = var21_29;
                                                                if (var5_4 != 0) break block181;
                                                                if (v62 == null) break block182;
                                                            }
                                                            catch (npr v63) {
                                                                throw dlv.a(v63);
                                                            }
                                                            v62 = var21_29;
                                                        }
                                                        try {
                                                            try {
                                                                if (var5_4 != 0) break block183;
                                                                if (!(v62 instanceof rsi)) break block184;
                                                            }
                                                            catch (npr v64) {
                                                                throw dlv.a(v64);
                                                            }
                                                            v62 = var21_29;
                                                        }
                                                        catch (npr v65) {
                                                            throw dlv.a(v65);
                                                        }
                                                    }
                                                    ((rsi)v62).nec();
                                                }
                                                try {
                                                    v66 = var13_12;
                                                    v67 = var20_26;
                                                    v68 = ox_.c28.l4i();
                                                    v69 = var8_7 == ox_.c28 ? 2 : 4;
                                                }
                                                catch (npr v70) {
                                                    throw dlv.a(v70);
                                                }
                                                v66.vct(v67, v68, v69);
                                            }
                                            var22_30 = var8_7.kig(var9_8);
                                            try {
                                                try {
                                                    try {
                                                        if (var5_4 != 0) break block185;
                                                        if (!var13_12.vct(var20_26, var22_30, 2)) break block167;
                                                    }
                                                    catch (npr v71) {
                                                        throw dlv.a(v71);
                                                    }
                                                    var16_16.add(var20_26);
                                                    ++var12_11;
                                                    if (var5_4 != 0) break block185;
                                                }
                                                catch (npr v72) {
                                                    throw dlv.a(v72);
                                                }
                                                if (var15_15 == 0) break block167;
                                            }
                                            catch (npr v73) {
                                                throw dlv.a(v73);
                                            }
                                            var23_31 = var13_12.getTileEntity(var20_26);
                                            try {
                                                try {
                                                    if (var5_4 != 0) break block185;
                                                    if (var23_31 == null) break block167;
                                                }
                                                catch (npr v74) {
                                                    throw dlv.a(v74);
                                                }
                                                var14_14.iin("x", var20_26.getX());
                                                var14_14.iin("y", var20_26.getY());
                                                var14_14.iin("z", var20_26.getZ());
                                                var23_31.agl(var14_14);
                                            }
                                            catch (npr v75) {
                                                throw dlv.a(v75);
                                            }
                                        }
                                        ++var19_23;
                                    }
                                    if (var5_4 == 0) continue;
                                }
                                ++var18_20;
                                if (var5_4 == 0) continue block127;
                            }
                            break;
                        }
                        ++var17_18;
                        if (var5_4 == 0) continue block125;
                    }
                    break;
                }
                var17_19 = var16_16.iterator();
                while (var17_19.hasNext()) {
                    var18_22 = (mew)var17_19.next();
                    var19_25 = var13_12.getBlockState(var18_22).r_y();
                    try {
                        var13_12.cdo(var18_22, var19_25);
                        if (var5_4 == 0) {
                            if (var5_4 == 0) continue;
                            break;
                        }
                        break block186;
                    }
                    catch (npr v76) {
                        throw dlv.a(v76);
                    }
                }
                try {
                    if (var12_11 <= 0) {
                        throw new uvb((String)dlv.b("v", (int)22654, (long)(1875106154922185662L ^ var3_3)), new Object[0]);
                    }
                }
                catch (npr v77) {
                    throw dlv.a(v77);
                }
                var1_1.io9(n_k$pbp.f1s, var12_11);
                dlv.wxl(var1_1, this, (String)dlv.b("v", (int)13904, (long)(661834664093449621L ^ var3_3)), new Object[]{var12_11});
            }
            try {
                if (var5_4 == 0) break block187;
lbl497:
                // 3 sources

                throw new uvb((String)dlv.b("v", (int)19238, (long)(6645817221973967094L ^ var3_3)), new Object[0]);
            }
            catch (npr v78) {
                throw dlv.a(v78);
            }
        }
    }

    @Override
    public List ggu(e7r e7r2, String[] stringArray, mew mew2) {
        List list;
        block33: {
            block41: {
                int n;
                block40: {
                    int n2;
                    long l;
                    block38: {
                        int n3;
                        block39: {
                            block36: {
                                block37: {
                                    block34: {
                                        block35: {
                                            block32: {
                                                block30: {
                                                    block31: {
                                                        l = a ^ 0x62927E1808F7L;
                                                        n3 = t9d.b();
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        n = stringArray.length;
                                                                        if (n3 == 0) break block30;
                                                                        if (n <= 0) break block31;
                                                                    }
                                                                    catch (oov oov2) {
                                                                        throw dlv.a(oov2);
                                                                    }
                                                                    n = stringArray.length;
                                                                    n2 = 3;
                                                                    if (n3 == 0) break block32;
                                                                }
                                                                catch (oov oov3) {
                                                                    throw dlv.a(oov3);
                                                                }
                                                                if (n > n2) break block31;
                                                            }
                                                            catch (oov oov4) {
                                                                throw dlv.a(oov4);
                                                            }
                                                            list = dlv.aqt(stringArray, 0, mew2);
                                                            break block33;
                                                        }
                                                        catch (oov oov5) {
                                                            throw dlv.a(oov5);
                                                        }
                                                    }
                                                    n = stringArray.length;
                                                }
                                                n2 = 3;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n3 == 0) break block34;
                                                            if (n <= n2) break block35;
                                                        }
                                                        catch (oov oov6) {
                                                            throw dlv.a(oov6);
                                                        }
                                                        n = stringArray.length;
                                                        n2 = 6;
                                                        if (n3 == 0) break block34;
                                                    }
                                                    catch (oov oov7) {
                                                        throw dlv.a(oov7);
                                                    }
                                                    if (n > n2) break block35;
                                                }
                                                catch (oov oov8) {
                                                    throw dlv.a(oov8);
                                                }
                                                list = dlv.aqt(stringArray, 3, mew2);
                                                break block33;
                                            }
                                            catch (oov oov9) {
                                                throw dlv.a(oov9);
                                            }
                                        }
                                        n = stringArray.length;
                                        n2 = 7;
                                    }
                                    try {
                                        try {
                                            if (n3 == 0) break block36;
                                            if (n != n2) break block37;
                                        }
                                        catch (oov oov10) {
                                            throw dlv.a(oov10);
                                        }
                                        list = dlv.d79(stringArray, e0x.db8.kqi());
                                        break block33;
                                    }
                                    catch (oov oov11) {
                                        throw dlv.a(oov11);
                                    }
                                }
                                n = stringArray.length;
                                n2 = 9;
                            }
                            try {
                                try {
                                    if (n3 == 0) break block38;
                                    if (n != n2) break block39;
                                }
                                catch (oov oov12) {
                                    throw dlv.a(oov12);
                                }
                                String[] stringArray2 = new String[5];
                                stringArray2[0] = dlv.b("v", (int)14799, (long)(0x770C29FD663A2FFBL ^ l));
                                stringArray2[1] = dlv.b("v", (int)5275, (long)(0x3304B8F2778A02A0L ^ l));
                                stringArray2[2] = dlv.b("v", (int)5627, (long)(0x67645122FF0303DAL ^ l));
                                stringArray2[3] = dlv.b("v", (int)21886, (long)(0x53212D4AEAA3434CL ^ l));
                                stringArray2[4] = dlv.b("v", (int)15587, (long)(0x55CD944A39BEAADBL ^ l));
                                list = dlv.cqo(stringArray, stringArray2);
                                break block33;
                            }
                            catch (oov oov13) {
                                throw dlv.a(oov13);
                            }
                        }
                        try {
                            n = stringArray.length;
                            if (n3 == 0) break block40;
                            n2 = 10;
                        }
                        catch (oov oov14) {
                            throw dlv.a(oov14);
                        }
                    }
                    try {
                        if (n != n2) break block41;
                        n = ((String)((Object)dlv.b("v", (int)27205, (long)(0x59A978D1C83D7C7CL ^ l)))).equals(stringArray[8]) ? 1 : 0;
                    }
                    catch (oov oov15) {
                        throw dlv.a(oov15);
                    }
                }
                try {
                    if (n == 0) break block41;
                    list = dlv.d79(stringArray, e0x.db8.kqi());
                    break block33;
                }
                catch (oov oov16) {
                    throw dlv.a(oov16);
                }
            }
            list = null;
        }
        return list;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                dlv.a = c.a(3397082923806372047L, 7998528678461003878L, MethodHandles.lookup().lookupClass()).a(253701799916574L);
                dlv.h = new HashMap<K, V>(13);
                var0 = dlv.a ^ 17670805012399L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[19];
                var7_4 = 0;
                var6_5 = "H\u00d1\u00e0\u0007^lJ\u00b3|\u00fd\u00a6\u0010}3#TU55\u0089\u00b7hi\u00e0,\u00a2\u001a\u00f59\u00d5\u00d4\u00ca(\u00aa\u00cc.Z5\u00c6\u00f5(\u0019\u0011\u0099['\u0002\u00afN\u00be\u00c9t\u00fa\u00c0\b\u008b\u00f3\u00bb6F\u00ba\b\"\u00aa\u00cdLF0\u00c5\u00f7\u00a76\u0006\u00b5>\u00a5\u00a2M\u00e0\u008e38\u00952]Ld\u00cf\u00ed\u00b7\u00b5\u00c1?\u00c8\u00b3?\"\u00e4X\u0015\u0085|\u00ac-\u00b4o\u00fex\u00a1\u000el\u00f2{\u000bD\u00cb\u009e\u00c6\u0018}\u00ffS\u00f8c\u00a0\u00cd\b\u001dt\u008dQ\u00cd\u0002\u00a6\u00d8\u0092\u00e8/\u0010[NJ\u0003=\u00cd\u00a4<\u0018\u00b1\u00da\u008c\u0004\u00afs\u00fb(\u00ee\u0096\u0092\u0003x~d\u00ee$\u00ae\u00bbiQ\u00b2\u00b6\u001aL\u00b3\u00f4Nq\u00ce\u00a6\u0086\u0091x'\u00a75\u0083\\h\u00ab1\u00c0\u00ca\u00fc\u00d84\u0080\u0010\u000f\u00ac<\u00cf\u00e5Ss\u0000M\u00cf\u007f\u00ef\u0091\u00e4f}\u0010\u00c6\u0097n\u00b1\u00c7\u0094\u0084\u00b3\u00fb\u00d7\u00f7\u0019;\u00c2\u00a9\u00b7(Cb\u0099@\u0091)\u00ces\u00c5\u00fb\"J\u007f`\u00f0\u00a7{\u0093\u008a\u00bb\u00eb\u0084\u008aG\u00a8+\u00d9\u0010\u00b5\u00beT\n\u00c5\u00c1]\u009dC\u00dd\u001c5\u0010\u00e5<\u00dfb=H\u0097\u0005\u0096|\u00ff\u009e\u00be\u0098\u00d8\u0087\u0010\u0015\u0095\u00ae\u0089#\u00eb\u0002\u00c5\u0099\u00b9>\u00d5O\u009dC\u000b\u0010\u00e2$5\u007f/&\u0014\u00de\u00c2\u00b3\u00ef\u0019\u0012\u00fe\u0092\u00eb8\u00e0\u00156r\u00be\u0095\u00a5A\u00c7r\u00f7\u00fa7\u0082\b\u0019 \u0095\u008df\u0084\u00fbR\u00b5\u00f0k\u00f9\u00ded\u00d5\u008f+\u00dd\u00b3\u00a4\u008a-,\u001d\u0085\u00e2]\u00fe\u000f\u0005[\u00ed\u00e0}\u00fe\u00ea\u00d6\u00e3\u001a!P\u0010D\u00f9\u0097Y\u00ffd\u00abH\t\u00f7A\"\u00d5\u009d;\u00b6\u0010\u00e6\u00ee\u00e0/53\u008b\u00f9c\u000f\u00a20\u008a0\u0019,\u0010\u00c3\u0004\u0013\u0010\u00ef\u00da\u00c2\b\u0002\u00b3l\u0000}\u0081h'\u0010\u00a3\u00ea T(\u001b\u0002\u00a2\u001dl,llOn\u00c2\u0010\u009f\u0004g\u00edB\u00d4\u00f8e}Z\u00ff\u00d5>Q\u00f5>";
                var8_6 = "H\u00d1\u00e0\u0007^lJ\u00b3|\u00fd\u00a6\u0010}3#TU55\u0089\u00b7hi\u00e0,\u00a2\u001a\u00f59\u00d5\u00d4\u00ca(\u00aa\u00cc.Z5\u00c6\u00f5(\u0019\u0011\u0099['\u0002\u00afN\u00be\u00c9t\u00fa\u00c0\b\u008b\u00f3\u00bb6F\u00ba\b\"\u00aa\u00cdLF0\u00c5\u00f7\u00a76\u0006\u00b5>\u00a5\u00a2M\u00e0\u008e38\u00952]Ld\u00cf\u00ed\u00b7\u00b5\u00c1?\u00c8\u00b3?\"\u00e4X\u0015\u0085|\u00ac-\u00b4o\u00fex\u00a1\u000el\u00f2{\u000bD\u00cb\u009e\u00c6\u0018}\u00ffS\u00f8c\u00a0\u00cd\b\u001dt\u008dQ\u00cd\u0002\u00a6\u00d8\u0092\u00e8/\u0010[NJ\u0003=\u00cd\u00a4<\u0018\u00b1\u00da\u008c\u0004\u00afs\u00fb(\u00ee\u0096\u0092\u0003x~d\u00ee$\u00ae\u00bbiQ\u00b2\u00b6\u001aL\u00b3\u00f4Nq\u00ce\u00a6\u0086\u0091x'\u00a75\u0083\\h\u00ab1\u00c0\u00ca\u00fc\u00d84\u0080\u0010\u000f\u00ac<\u00cf\u00e5Ss\u0000M\u00cf\u007f\u00ef\u0091\u00e4f}\u0010\u00c6\u0097n\u00b1\u00c7\u0094\u0084\u00b3\u00fb\u00d7\u00f7\u0019;\u00c2\u00a9\u00b7(Cb\u0099@\u0091)\u00ces\u00c5\u00fb\"J\u007f`\u00f0\u00a7{\u0093\u008a\u00bb\u00eb\u0084\u008aG\u00a8+\u00d9\u0010\u00b5\u00beT\n\u00c5\u00c1]\u009dC\u00dd\u001c5\u0010\u00e5<\u00dfb=H\u0097\u0005\u0096|\u00ff\u009e\u00be\u0098\u00d8\u0087\u0010\u0015\u0095\u00ae\u0089#\u00eb\u0002\u00c5\u0099\u00b9>\u00d5O\u009dC\u000b\u0010\u00e2$5\u007f/&\u0014\u00de\u00c2\u00b3\u00ef\u0019\u0012\u00fe\u0092\u00eb8\u00e0\u00156r\u00be\u0095\u00a5A\u00c7r\u00f7\u00fa7\u0082\b\u0019 \u0095\u008df\u0084\u00fbR\u00b5\u00f0k\u00f9\u00ded\u00d5\u008f+\u00dd\u00b3\u00a4\u008a-,\u001d\u0085\u00e2]\u00fe\u000f\u0005[\u00ed\u00e0}\u00fe\u00ea\u00d6\u00e3\u001a!P\u0010D\u00f9\u0097Y\u00ffd\u00abH\t\u00f7A\"\u00d5\u009d;\u00b6\u0010\u00e6\u00ee\u00e0/53\u008b\u00f9c\u000f\u00a20\u008a0\u0019,\u0010\u00c3\u0004\u0013\u0010\u00ef\u00da\u00c2\b\u0002\u00b3l\u0000}\u0081h'\u0010\u00a3\u00ea T(\u001b\u0002\u00a2\u001dl,llOn\u00c2\u0010\u009f\u0004g\u00edB\u00d4\u00f8e}Z\u00ff\u00d5>Q\u00f5>".length();
                var5_7 = 40;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = dlv.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "0\u000f\u00b7\u000f\u00d7\u0084\u0011\u0084\u00a5\u00aeD\u0004\f]+\u00f7\u00b8V\u009b\u00af\u00b5\u00ae\u0011m\u0005\u0087!\u0002\u0080WM\n\u00ef\u00ba\u00e7\t\u00eb\u00df\u0084\u0016\u00ae\u00c2:\u00f72\u00ab\u00bb\u0006\u00a7\u00ba \u00d2\u001e\u00c9\u00e0\u008f(Y\u008aPp\u00f1\fne\u00a7\u00bdwG\u00ad\u0005\u00f3a\u00dd\u00f4\u00f2\u0080\u00c7\u00da\u00cd\u00adJ\u00ff[\u0019\u008d\u009d\u0098\u0019\u009b\u00a7'>\u00e9\u0006,\t";
                    var8_6 = "0\u000f\u00b7\u000f\u00d7\u0084\u0011\u0084\u00a5\u00aeD\u0004\f]+\u00f7\u00b8V\u009b\u00af\u00b5\u00ae\u0011m\u0005\u0087!\u0002\u0080WM\n\u00ef\u00ba\u00e7\t\u00eb\u00df\u0084\u0016\u00ae\u00c2:\u00f72\u00ab\u00bb\u0006\u00a7\u00ba \u00d2\u001e\u00c9\u00e0\u008f(Y\u008aPp\u00f1\fne\u00a7\u00bdwG\u00ad\u0005\u00f3a\u00dd\u00f4\u00f2\u0080\u00c7\u00da\u00cd\u00adJ\u00ff[\u0019\u008d\u009d\u0098\u0019\u009b\u00a7'>\u00e9\u0006,\t".length();
                    var5_7 = 56;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = dlv.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        dlv.c = var9_3;
        dlv.g = new String[19];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x679F;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dlv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            dlv.g[n2] = dlv.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dlv.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dlv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dlv.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

