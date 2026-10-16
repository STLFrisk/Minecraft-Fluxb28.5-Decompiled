/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.CustomItems;
import net.optifine.reflect.Reflector;
import net.optifine.reflect.ReflectorForge;
import net.optifine.shaders.Shaders;
import net.optifine.shaders.ShadersRender;

public abstract class g0_
implements gnj {
    public static final gdz wky;
    public g6r f8y;
    public g6r rna;
    private final gmu esu;
    private float jfh = 1.0f;
    private float xvp = 1.0f;
    private float ydz = 1.0f;
    private float rvl = 1.0f;
    private boolean h4_;
    private static final Map ts7;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public g0_(gmu gmu2) {
        this.esu = gmu2;
        this.x8r();
    }

    @Override
    public void doRenderLayer(g_3 g_32, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.b6n(g_32, f, f2, f3, f4, f5, f6, f7, 4);
        this.b6n(g_32, f, f2, f3, f4, f5, f6, f7, 3);
        this.b6n(g_32, f, f2, f3, f4, f5, f6, f7, 2);
        this.b6n(g_32, f, f2, f3, f4, f5, f6, f7, 1);
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void b6n(g_3 var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, int var9_9) {
        block91: {
            block119: {
                block118: {
                    block117: {
                        block116: {
                            block102: {
                                block103: {
                                    block113: {
                                        block115: {
                                            block114: {
                                                block112: {
                                                    block104: {
                                                        block105: {
                                                            block110: {
                                                                block111: {
                                                                    block106: {
                                                                        block107: {
                                                                            block108: {
                                                                                block109: {
                                                                                    block98: {
                                                                                        block99: {
                                                                                            block100: {
                                                                                                block101: {
                                                                                                    block95: {
                                                                                                        block96: {
                                                                                                            block97: {
                                                                                                                block93: {
                                                                                                                    block94: {
                                                                                                                        block92: {
                                                                                                                            block90: {
                                                                                                                                var10_10 = g0_.a ^ 130777369136055L;
                                                                                                                                var12_11 = t9d.b();
                                                                                                                                var13_12 = this.s3c(var1_1, var9_9);
                                                                                                                                try {
                                                                                                                                    v0 = var13_12;
                                                                                                                                    if (var12_11 == 0) break block90;
                                                                                                                                    if (v0 == null) break block91;
                                                                                                                                }
                                                                                                                                catch (oov v1) {
                                                                                                                                    throw g0_.a(v1);
                                                                                                                                }
                                                                                                                                v0 = var13_12;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v2 = v0.gn1();
                                                                                                                                    if (var12_11 == 0) break block92;
                                                                                                                                    if (!(v2 instanceof jpt)) break block91;
                                                                                                                                }
                                                                                                                                catch (oov v3) {
                                                                                                                                    throw g0_.a(v3);
                                                                                                                                }
                                                                                                                                v2 = var13_12.gn1();
                                                                                                                            }
                                                                                                                            catch (oov v4) {
                                                                                                                                throw g0_.a(v4);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var14_13 = (jpt)v2;
                                                                                                                        var15_14 = this.yu8(var9_9);
                                                                                                                        try {
                                                                                                                            var15_14.jxr(this.esu.fy4());
                                                                                                                            var15_14.v3g(var1_1, var2_2, var3_3, var4_4);
                                                                                                                            v5 = Reflector.ForgeHooksClient.exists();
                                                                                                                            if (var12_11 == 0) break block93;
                                                                                                                            if (v5 == 0) break block94;
                                                                                                                        }
                                                                                                                        catch (oov v6) {
                                                                                                                            throw g0_.a(v6);
                                                                                                                        }
                                                                                                                        var15_14 = this.xh5(var1_1, var13_12, var9_9, var15_14);
                                                                                                                    }
                                                                                                                    this.rqn(var15_14, var9_9);
                                                                                                                    v5 = this.nyo(var9_9);
                                                                                                                }
                                                                                                                var16_15 = v5;
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v7 = hxt.bdl();
                                                                                                                            if (var12_11 == 0) break block95;
                                                                                                                            if (v7) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl76
                                                                                                                        }
                                                                                                                        catch (oov v8) {
                                                                                                                            throw g0_.a(v8);
                                                                                                                        }
                                                                                                                        v9 = var13_12;
                                                                                                                        v10 = var16_15;
                                                                                                                        if (var12_11 == 0) break block96;
                                                                                                                    }
                                                                                                                    catch (oov v11) {
                                                                                                                        throw g0_.a(v11);
                                                                                                                    }
                                                                                                                    if (v10 == 0) break block97;
                                                                                                                }
                                                                                                                catch (oov v12) {
                                                                                                                    throw g0_.a(v12);
                                                                                                                }
                                                                                                                v10 = 2;
                                                                                                                break block96;
                                                                                                            }
                                                                                                            v10 = 1;
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                v13 = CustomItems.bindCustomArmorTexture(v9, v10, null);
                                                                                                                if (var12_11 == 0) break block98;
                                                                                                                if (v13 != 0) break block99;
                                                                                                            }
                                                                                                            catch (oov v14) {
                                                                                                                throw g0_.a(v14);
                                                                                                            }
lbl76:
                                                                                                            // 2 sources

                                                                                                            v7 = Reflector.ForgeHooksClient_getArmorTexture.exists();
                                                                                                        }
                                                                                                        catch (oov v15) {
                                                                                                            throw g0_.a(v15);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (v7) {
                                                                                                                v16 = this.esu;
                                                                                                                v17 = this;
                                                                                                                v18 = var1_1;
                                                                                                                v19 = var13_12;
                                                                                                                v20 = var16_15;
                                                                                                                if (var12_11 == 0) break block100;
                                                                                                            }
                                                                                                            ** GOTO lbl106
                                                                                                        }
                                                                                                        catch (oov v21) {
                                                                                                            throw g0_.a(v21);
                                                                                                        }
                                                                                                        if (v20 == 0) break block101;
                                                                                                    }
                                                                                                    catch (oov v22) {
                                                                                                        throw g0_.a(v22);
                                                                                                    }
                                                                                                    v20 = 2;
                                                                                                    break block100;
                                                                                                }
                                                                                                v20 = 1;
                                                                                            }
                                                                                            try {
                                                                                                v16.gu4(v17.ap6(v18, v19, v20, null));
                                                                                                if (var12_11 != 0) break block99;
lbl106:
                                                                                                // 2 sources

                                                                                                this.esu.gu4(this.fy0(var14_13, (boolean)var16_15));
                                                                                            }
                                                                                            catch (oov v23) {
                                                                                                throw g0_.a(v23);
                                                                                            }
                                                                                        }
                                                                                        v13 = Reflector.ForgeHooksClient_getArmorTexture.exists();
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (var12_11 == 0) break block102;
                                                                                                if (v13 == 0) break block103;
                                                                                            }
                                                                                            catch (oov v24) {
                                                                                                throw g0_.a(v24);
                                                                                            }
                                                                                            v25 = ReflectorForge.armorHasOverlay(var14_13, var13_12);
                                                                                            if (var12_11 == 0) break block104;
                                                                                        }
                                                                                        catch (oov v26) {
                                                                                            throw g0_.a(v26);
                                                                                        }
                                                                                        if (!v25) break block105;
                                                                                    }
                                                                                    catch (oov v27) {
                                                                                        throw g0_.a(v27);
                                                                                    }
                                                                                    var17_16 = var14_13.slc(var13_12);
                                                                                    var18_18 = (float)(var17_16 >> 16 & 255) / 255.0f;
                                                                                    var19_20 = (float)(var17_16 >> 8 & 255) / 255.0f;
                                                                                    var20_22 = (float)(var17_16 & 255) / 255.0f;
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                v28 = this;
                                                                                                if (var12_11 == 0) break block106;
                                                                                                hzu.wn0(v28.xvp * var18_18, this.ydz * var19_20, this.rvl * var20_22, this.jfh);
                                                                                                var15_14.s_q(var1_1, var2_2, var3_3, var5_5, var6_6, var7_7, var8_8);
                                                                                                if (!hxt.bdl()) break block107;
                                                                                            }
                                                                                            catch (oov v29) {
                                                                                                throw g0_.a(v29);
                                                                                            }
                                                                                            v30 = var13_12;
                                                                                            v31 = var16_15;
                                                                                            if (var12_11 == 0) break block108;
                                                                                        }
                                                                                        catch (oov v32) {
                                                                                            throw g0_.a(v32);
                                                                                        }
                                                                                        if (v31 == 0) break block109;
                                                                                    }
                                                                                    catch (oov v33) {
                                                                                        throw g0_.a(v33);
                                                                                    }
                                                                                    v31 = 2;
                                                                                    break block108;
                                                                                }
                                                                                v31 = 1;
                                                                            }
                                                                            try {
                                                                                v25 = CustomItems.bindCustomArmorTexture(v30, v31, (String)g0_.a("g", (int)15411, (long)(7231250784701227445L ^ var10_10)));
                                                                                if (var12_11 == 0) break block104;
                                                                                if (v25) break block105;
                                                                            }
                                                                            catch (oov v34) {
                                                                                throw g0_.a(v34);
                                                                            }
                                                                        }
                                                                        v28 = this;
                                                                    }
                                                                    try {
                                                                        v35 = v28.esu;
                                                                        v36 = this;
                                                                        v37 = var1_1;
                                                                        v38 = var13_12;
                                                                        v39 = var16_15;
                                                                        if (var12_11 == 0) break block110;
                                                                        if (v39 == 0) break block111;
                                                                    }
                                                                    catch (oov v40) {
                                                                        throw g0_.a(v40);
                                                                    }
                                                                    v39 = 2;
                                                                    break block110;
                                                                }
                                                                v39 = 1;
                                                            }
                                                            v35.gu4(v36.ap6(v37, v38, v39, (String)g0_.a("g", (int)13060, (long)(1214694334723108487L ^ var10_10))));
                                                        }
                                                        hzu.wn0(this.xvp, this.ydz, this.rvl, this.jfh);
                                                        var15_14.s_q(var1_1, var2_2, var3_3, var5_5, var6_6, var7_7, var8_8);
                                                        v25 = this.h4_;
                                                    }
                                                    try {
                                                        try {
                                                            if (var12_11 == 0) break block112;
                                                            if (v25) break block113;
                                                        }
                                                        catch (oov v41) {
                                                            throw g0_.a(v41);
                                                        }
                                                        v25 = var13_12._xr();
                                                    }
                                                    catch (oov v42) {
                                                        throw g0_.a(v42);
                                                    }
                                                }
                                                try {
                                                    if (var12_11 == 0) break block114;
                                                    if (!v25) break block113;
                                                }
                                                catch (oov v43) {
                                                    throw g0_.a(v43);
                                                }
                                                v25 = hxt.bdl();
                                            }
                                            try {
                                                try {
                                                    if (var12_11 == 0) break block115;
                                                    if (v25) {
                                                    }
                                                    ** GOTO lbl232
                                                }
                                                catch (oov v44) {
                                                    throw g0_.a(v44);
                                                }
                                                v25 = CustomItems.renderCustomArmorEffect(var1_1, var13_12, var15_14, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8);
                                            }
                                            catch (oov v45) {
                                                throw g0_.a(v45);
                                            }
                                        }
                                        try {
                                            if (v25) break block113;
lbl232:
                                            // 2 sources

                                            this.wuq(var1_1, var15_14, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8);
                                        }
                                        catch (oov v46) {
                                            throw g0_.a(v46);
                                        }
                                    }
                                    return;
                                }
                                v13 = g0_$1.i6e[var14_13.jo8().ordinal()];
                            }
                            try {
                                if (var12_11 == 0) break block116;
                            }
                            catch (oov v47) {
                                throw g0_.a(v47);
                            }
                            {
                                ** switch (v13 ? 1 : 0)
                            }
lbl-1000:
                            // 1 sources

                            {
                                case 1: {
                                    var17_17 = var14_13.slc(var13_12);
                                    var18_19 = (float)(var17_17 >> 16 & 255) / 255.0f;
                                    var19_21 = (float)(var17_17 >> 8 & 255) / 255.0f;
                                    var20_23 = (float)(var17_17 & 255) / 255.0f;
                                    try {
                                        try {
                                            try {
                                                v48 = this;
                                                if (var12_11 == 0) ** GOTO lbl290
                                                hzu.wn0(v48.xvp * var18_19, this.ydz * var19_21, this.rvl * var20_23, this.jfh);
                                                var15_14.s_q(var1_1, var2_2, var3_3, var5_5, var6_6, var7_7, var8_8);
                                                if (hxt.bdl()) {
                                                }
                                                ** GOTO lbl285
                                            }
                                            catch (oov v49) {
                                                throw g0_.a(v49);
                                            }
                                            v50 = var13_12;
                                            v51 = var16_15;
                                            if (var12_11 != 0) {
                                            }
                                            ** GOTO lbl282
                                        }
                                        catch (oov v52) {
                                            throw g0_.a(v52);
                                        }
                                        if (v51 != 0) {
                                        }
                                        ** GOTO lbl281
                                    }
                                    catch (oov v53) {
                                        throw g0_.a(v53);
                                    }
                                    v51 = 2;
                                    ** GOTO lbl282
lbl281:
                                    // 1 sources

                                    v51 = 1;
lbl282:
                                    // 3 sources

                                    try {
                                        if (CustomItems.bindCustomArmorTexture(v50, v51, (String)g0_.a("g", (int)13060, (long)(1214694334723108487L ^ var10_10)))) ** GOTO lbl291
lbl285:
                                        // 2 sources

                                        v48 = this;
                                    }
                                    catch (oov v54) {
                                        throw g0_.a(v54);
                                    }
lbl290:
                                    // 2 sources

                                    v48.esu.gu4(this.b_5(var14_13, (boolean)var16_15, (String)g0_.a("g", (int)13060, (long)(1214694334723108487L ^ var10_10))));
                                }
lbl291:
                                // 3 sources

                                case 2: 
                                case 3: 
                                case 4: 
                                case 5: {
                                    hzu.wn0(this.xvp, this.ydz, this.rvl, this.jfh);
                                    var15_14.s_q(var1_1, var2_2, var3_3, var5_5, var6_6, var7_7, var8_8);
                                }
                            }
lbl294:
                            // 2 sources

                            v13 = (int)this.h4_;
                        }
                        try {
                            try {
                                if (var12_11 == 0) break block117;
                                if (v13 != 0) break block91;
                            }
                            catch (oov v55) {
                                throw g0_.a(v55);
                            }
                            v13 = (int)var13_12.px0();
                        }
                        catch (oov v56) {
                            throw g0_.a(v56);
                        }
                    }
                    try {
                        if (var12_11 == 0) break block118;
                        if (v13 == 0) break block91;
                    }
                    catch (oov v57) {
                        throw g0_.a(v57);
                    }
                    v13 = (int)hxt.bdl();
                }
                try {
                    try {
                        if (var12_11 == 0) break block119;
                        if (v13 != 0) {
                        }
                        ** GOTO lbl331
                    }
                    catch (oov v58) {
                        throw g0_.a(v58);
                    }
                    v13 = (int)CustomItems.renderCustomArmorEffect(var1_1, var13_12, var15_14, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8);
                }
                catch (oov v59) {
                    throw g0_.a(v59);
                }
            }
            try {
                if (v13 != 0) break block91;
lbl331:
                // 2 sources

                this.wuq(var1_1, var15_14, var2_2, var3_3, var4_4, var5_5, var6_6, var7_7, var8_8);
            }
            catch (oov v60) {
                throw g0_.a(v60);
            }
        }
    }

    public erg s3c(g_3 g_32, int n) {
        return g_32.wfg(n - 1);
    }

    public g6r yu8(int n) {
        g6r g6r2;
        block6: {
            g0_ g0_2;
            block4: {
                block5: {
                    int n2 = t9d.c();
                    try {
                        try {
                            g0_2 = this;
                            if (n2 != 0) break block4;
                            if (!g0_2.nyo(n)) break block5;
                        }
                        catch (oov oov2) {
                            throw g0_.a(oov2);
                        }
                        g6r2 = this.f8y;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw g0_.a(oov3);
                    }
                }
                g0_2 = this;
            }
            g6r2 = g0_2.rna;
        }
        return g6r2;
    }

    private boolean nyo(int n) {
        boolean bl;
        block4: {
            block5: {
                int n2 = t9d.c();
                try {
                    try {
                        bl = n;
                        if (n2 != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw g0_.a(oov2);
                    }
                    bl = true;
                    break block4;
                }
                catch (oov oov3) {
                    throw g0_.a(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    private void wuq(g_3 g_32, g6r g6r2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        block19: {
            block22: {
                boolean bl;
                float f8;
                int n;
                block20: {
                    block21: {
                        int n2;
                        block17: {
                            n = t9d.b();
                            try {
                                block18: {
                                    try {
                                        try {
                                            try {
                                                n2 = hxt.ly3();
                                                if (n == 0) break block17;
                                                if (n2 == 0) break block18;
                                            }
                                            catch (oov oov2) {
                                                throw g0_.a(oov2);
                                            }
                                            n2 = Shaders.isShadowPass;
                                            if (n == 0) break block17;
                                        }
                                        catch (oov oov3) {
                                            throw g0_.a(oov3);
                                        }
                                        if (n2 != 0) break block19;
                                    }
                                    catch (oov oov4) {
                                        throw g0_.a(oov4);
                                    }
                                }
                                n2 = g_32.g25;
                            }
                            catch (oov oov5) {
                                throw g0_.a(oov5);
                            }
                        }
                        f8 = (float)n2 + f3;
                        try {
                            this.esu.gu4(wky);
                            bl = hxt.ly3();
                            if (n == 0) break block20;
                            if (!bl) break block21;
                        }
                        catch (oov oov6) {
                            throw g0_.a(oov6);
                        }
                        ShadersRender.renderEnchantedGlintBegin();
                    }
                    hzu.spd();
                    hzu.d14(514);
                    bl = false;
                }
                hzu.jun(bl);
                float f9 = 0.5f;
                hzu.wn0(f9, f9, f9, 1.0f);
                for (int i = 0; i < 2; ++i) {
                    hzu.fpt();
                    hzu.ru7(768, 1);
                    float f10 = 0.76f;
                    hzu.wn0(0.5f * f10, 0.25f * f10, 0.8f * f10, 1.0f);
                    hzu.ah8(5890);
                    hzu.zwy();
                    float f11 = 0.33333334f;
                    try {
                        hzu.syc(f11, f11, f11);
                        hzu.a2h(30.0f - (float)i * 60.0f, 0.0f, 0.0f, 1.0f);
                        hzu.a4k(0.0f, f8 * (0.001f + (float)i * 0.003f) * 20.0f, 0.0f);
                        hzu.ah8(5888);
                        g6r2.s_q(g_32, f, f2, f4, f5, f6, f7);
                        if (n != 0) {
                            if (n != 0) continue;
                            break;
                        }
                        break block22;
                    }
                    catch (oov oov7) {
                        throw g0_.a(oov7);
                    }
                }
                hzu.ah8(5890);
                hzu.zwy();
                hzu.ah8(5888);
                hzu.s7q();
                hzu.jun(true);
                hzu.d14(515);
                hzu.ux6();
            }
            try {
                if (hxt.ly3()) {
                    ShadersRender.renderEnchantedGlintEnd();
                }
            }
            catch (oov oov8) {
                throw g0_.a(oov8);
            }
        }
    }

    private gdz fy0(jpt jpt2, boolean bl) {
        return this.b_5(jpt2, bl, null);
    }

    private gdz b_5(jpt jpt2, boolean n, String string) {
        gdz gdz2;
        block13: {
            gdz gdz3;
            block14: {
                String string2;
                Object[] objectArray;
                CallSite callSite;
                int n2;
                block12: {
                    Object object;
                    block10: {
                        long l;
                        block11: {
                            int n3;
                            Object[] objectArray2;
                            block8: {
                                block9: {
                                    l = a ^ 0xB99C8EC99B0L;
                                    n2 = t9d.b();
                                    try {
                                        callSite = g0_.a("g", (int)5830, (long)(0x5A6E9135AE5AD941L ^ l));
                                        Object[] objectArray3 = new Object[3];
                                        objectArray3[0] = jpt2.jo8().oi6();
                                        Object[] objectArray4 = objectArray3;
                                        objectArray2 = objectArray3;
                                        int n4 = 1;
                                        n3 = n;
                                        if (n2 == 0) break block8;
                                        if (n3 == 0) break block9;
                                    }
                                    catch (oov oov2) {
                                        throw g0_.a(oov2);
                                    }
                                    n3 = 2;
                                    break block8;
                                }
                                n3 = 1;
                            }
                            try {
                                try {
                                    objectArray4[n4] = n3;
                                    Object[] objectArray5 = objectArray2;
                                    objectArray = objectArray2;
                                    int n5 = 2;
                                    object = string;
                                    if (n2 == 0) break block10;
                                    if (object != null) break block11;
                                }
                                catch (oov oov3) {
                                    throw g0_.a(oov3);
                                }
                                string2 = "";
                                break block12;
                            }
                            catch (oov oov4) {
                                throw g0_.a(oov4);
                            }
                        }
                        object = g0_.a("g", (int)14599, (long)(0x1BAB241E618E7684L ^ l));
                    }
                    string2 = String.format((String)object, string);
                }
                objectArray5[n5] = string2;
                String string3 = String.format((String)((Object)callSite), objectArray);
                gdz3 = (gdz)ts7.get(string3);
                try {
                    gdz2 = gdz3;
                    if (n2 == 0) break block13;
                    if (gdz2 != null) break block14;
                }
                catch (oov oov5) {
                    throw g0_.a(oov5);
                }
                gdz3 = new gdz(string3);
                ts7.put(string3, gdz3);
            }
            gdz2 = gdz3;
        }
        return gdz2;
    }

    public abstract void x8r();

    public abstract void rqn(g6r var1, int var2);

    public g6r xh5(g_3 g_32, erg erg2, int n, g6r g6r2) {
        return g6r2;
    }

    public gdz ap6(i2h i2h2, erg erg2, int n, String string) {
        gdz gdz2;
        block17: {
            gdz gdz3;
            block18: {
                String string2;
                Object[] objectArray;
                CallSite callSite;
                int n2;
                block16: {
                    Object object;
                    block14: {
                        long l;
                        block15: {
                            int n3;
                            Object[] objectArray2;
                            block12: {
                                block13: {
                                    Object object2;
                                    String string3;
                                    block11: {
                                        int n4;
                                        block10: {
                                            l = a ^ 0x5A4DFC23C820L;
                                            jpt jpt2 = (jpt)erg2.gn1();
                                            string3 = jpt2.jo8().oi6();
                                            object2 = g0_.a("g", (int)6450, (long)(0x65A5553884710722L ^ l));
                                            n2 = t9d.c();
                                            n4 = string3.indexOf(58);
                                            try {
                                                if (n2 != 0) break block10;
                                                if (n4 == -1) break block11;
                                            }
                                            catch (oov oov2) {
                                                throw g0_.a(oov2);
                                            }
                                            object2 = string3.substring(0, n4);
                                        }
                                        string3 = string3.substring(n4 + 1);
                                    }
                                    try {
                                        callSite = g0_.a("g", (int)3114, (long)(0x23736A19DF08923FL ^ l));
                                        Object[] objectArray3 = new Object[4];
                                        objectArray3[0] = object2;
                                        objectArray3[1] = string3;
                                        Object[] objectArray4 = objectArray3;
                                        objectArray2 = objectArray3;
                                        int n5 = 2;
                                        n3 = this.nyo(n);
                                        if (n2 != 0) break block12;
                                        if (n3 == 0) break block13;
                                    }
                                    catch (oov oov3) {
                                        throw g0_.a(oov3);
                                    }
                                    n3 = 2;
                                    break block12;
                                }
                                n3 = 1;
                            }
                            try {
                                try {
                                    objectArray4[n5] = n3;
                                    Object[] objectArray5 = objectArray2;
                                    objectArray = objectArray2;
                                    int n6 = 3;
                                    object = string;
                                    if (n2 != 0) break block14;
                                    if (object != null) break block15;
                                }
                                catch (oov oov4) {
                                    throw g0_.a(oov4);
                                }
                                string2 = "";
                                break block16;
                            }
                            catch (oov oov5) {
                                throw g0_.a(oov5);
                            }
                        }
                        object = g0_.a("g", (int)28305, (long)(0x1BCDFCA70AE97083L ^ l));
                    }
                    string2 = String.format((String)object, string);
                }
                objectArray5[n6] = string2;
                String string4 = String.format((String)((Object)callSite), objectArray);
                string4 = Reflector.callString(Reflector.ForgeHooksClient_getArmorTexture, new Object[]{i2h2, erg2, string4, n, string});
                gdz3 = (gdz)ts7.get(string4);
                try {
                    gdz2 = gdz3;
                    if (n2 != 0) break block17;
                    if (gdz2 != null) break block18;
                }
                catch (oov oov6) {
                    throw g0_.a(oov6);
                }
                gdz3 = new gdz(string4);
                ts7.put(string4, gdz3);
            }
            gdz2 = gdz3;
        }
        return gdz2;
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

                g0_.a = c.a(-1432726500680372515L, -2813251859245181709L, MethodHandles.lookup().lookupClass()).a(117405019915291L);
                var9 = g0_.a ^ 97675418033174L;
                g0_.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[8];
                var5_4 = 0;
                var4_5 = "\u009d\u00c3\u00fe\u00f6\u007f(\u0019\u0091\u0013\u00f8\u0006\u00e2\u00fc\u001b\u0000G\u00b9Tq\u00b4\"t'\u00a4\u00dc\u009a\u001e\u001f\u00d8q!\u001a\u0010\u0084y\u00a0\u0013\u00f5\u009f+\u009a\u00c6Fg\u00a9{\u00ea\u0094o\u0010r\u00a9\u00cd\u00f6\u00d7\u00e0@\u00ee\u00d6/+\u0006\u00c5\u00f2\u009b\u00c8\u0010\u00d3$\u00d9J\u00a07\u001f\u00eaX\u008e\u00cb_Os\u00e0\u0007\u0010\u001eU\u0006y\u00bd\u009c\u00efJv\u00b3\u00fd\u00e3GlL\u00c5P\u00c8\u00e3N>\u00ec~\u00a7\u0085|^\u001d\u00a2\u00e9\u00e9\u008a\u00e2y\u001d\u00efg\u0006/*<\u00ac{H\u00b9\u00a3\u00b2\u00fc\u0080\u00f9\u0080@2\n\u0095\u00ab#.vY\u00d1\u00b7\u00cd\f\u008b\"\u00f3\u00d3\u00bb\u00f7t\u00eb\u00d3RD\u00cb\u0014\u00dc\u00166L\u00f4\u001b\u00b1\u0016\u001a\u0098\u00ec*\u00aaP\u00f3OMG\u00fd\u00d7";
                var6_6 = "\u009d\u00c3\u00fe\u00f6\u007f(\u0019\u0091\u0013\u00f8\u0006\u00e2\u00fc\u001b\u0000G\u00b9Tq\u00b4\"t'\u00a4\u00dc\u009a\u001e\u001f\u00d8q!\u001a\u0010\u0084y\u00a0\u0013\u00f5\u009f+\u009a\u00c6Fg\u00a9{\u00ea\u0094o\u0010r\u00a9\u00cd\u00f6\u00d7\u00e0@\u00ee\u00d6/+\u0006\u00c5\u00f2\u009b\u00c8\u0010\u00d3$\u00d9J\u00a07\u001f\u00eaX\u008e\u00cb_Os\u00e0\u0007\u0010\u001eU\u0006y\u00bd\u009c\u00efJv\u00b3\u00fd\u00e3GlL\u00c5P\u00c8\u00e3N>\u00ec~\u00a7\u0085|^\u001d\u00a2\u00e9\u00e9\u008a\u00e2y\u001d\u00efg\u0006/*<\u00ac{H\u00b9\u00a3\u00b2\u00fc\u0080\u00f9\u0080@2\n\u0095\u00ab#.vY\u00d1\u00b7\u00cd\f\u008b\"\u00f3\u00d3\u00bb\u00f7t\u00eb\u00d3RD\u00cb\u0014\u00dc\u00166L\u00f4\u001b\u00b1\u0016\u001a\u0098\u00ec*\u00aaP\u00f3OMG\u00fd\u00d7".length();
                var3_7 = 32;
                var2_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = g0_.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u0084\u00daU \u00baaf\u0001^\u00caPLi\u0014n\u007fd\u00c7\u00b4 \u00b6\u00da\u00f0R\u00db?|\\\u00d2%\u00d4\u00fe\u00d0~\u00007v\u00b0/\u00a3\u0010\u00e41F=I_Y\u00d3\u0015N\u00e0\u00d7\u00ed\u0004wcR\u00c2\u0002\u00df|'\u00d6m\u0097\u00b0\u0000T\u0086\u007f\u00a0@\u001e\u00d4\u00e3\u000e\u00cd\u00f7:\u0014\f\u0012\u0096\u0018\u0015\u00dd\t\u00bb\u0006Q\u00cd\u00043\u00c5\"Gz\u0006\u00d3\u0019\u009fu7Fo\u00deX<\u00d8\fj\u009aa\u00ec\u00ff\u00e09\u0082\u00c6\t+\u00fa\u00fc\u00ee\u008c\u000e\u00cc\u008cQ\u0005b\u007f\u001b\u00a3\u001d2";
                    var6_6 = "\u0084\u00daU \u00baaf\u0001^\u00caPLi\u0014n\u007fd\u00c7\u00b4 \u00b6\u00da\u00f0R\u00db?|\\\u00d2%\u00d4\u00fe\u00d0~\u00007v\u00b0/\u00a3\u0010\u00e41F=I_Y\u00d3\u0015N\u00e0\u00d7\u00ed\u0004wcR\u00c2\u0002\u00df|'\u00d6m\u0097\u00b0\u0000T\u0086\u007f\u00a0@\u001e\u00d4\u00e3\u000e\u00cd\u00f7:\u0014\f\u0012\u0096\u0018\u0015\u00dd\t\u00bb\u0006Q\u00cd\u00043\u00c5\"Gz\u0006\u00d3\u0019\u009fu7Fo\u00deX<\u00d8\fj\u009aa\u00ec\u00ff\u00e09\u0082\u00c6\t+\u00fa\u00fc\u00ee\u008c\u000e\u00cc\u008cQ\u0005b\u007f\u001b\u00a3\u001d2".length();
                    var3_7 = 72;
                    var2_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = g0_.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        g0_.b = var7_3;
        g0_.c = new String[8];
        g0_.wky = new gdz((String)g0_.a("g", (int)23596, (long)(5648373774310823436L ^ var9)));
        g0_.ts7 = Maps.newHashMap();
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String a(byte[] byArray) {
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1B69;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("g0_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            g0_.c[n2] = g0_.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = g0_.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("g0_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g0_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

