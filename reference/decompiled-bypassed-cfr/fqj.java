/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fqj
extends gyu {
    private zfz[] j08;
    private long _gp;
    private uwf mgg;
    private uwf zp8;
    private uwf dwt;
    private boolean vdr;
    private boolean my2;
    private static final long a = c.a(8777809898797263679L, -7063468732310296305L, MethodHandles.lookup().lookupClass()).a(148403169327999L);
    private static final String[] f;
    private static final String[] g;
    private static final Map h;

    public fqj(int n, boolean bl, boolean bl2) {
        super(n);
        this.vdr = bl;
        this.my2 = bl2;
        this.wip();
        this.j10(2.0f, 0.0f);
        this.c1d.clear();
        this.ke4 = ox_.vd0.l4i().zvi(pmc.xum, (Comparable)((Object)pmc$s6y.tms));
        this.kro = ox_.f6z.l4i();
        this.dmv.c10 = -999;
        this.dmv.pcg = 20;
        this.dmv.oui = 3;
        this.dmv.yf6 = 5;
        this.dmv.k9k = 0;
        this.c1d.clear();
        if (bl2) {
            this.dmv.c10 = 5;
        }
    }

    @Override
    public e9q jk9(Random random) {
        return this.zqo;
    }

    @Override
    public int i9_(mew mew2) {
        return 10387789;
    }

    @Override
    public int bib(mew mew2) {
        return 9470285;
    }

    @Override
    public void u0r(t9d t9d2, Random random, mew mew2) {
        super.u0r(t9d2, random, mew2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void rci(t9d var1_1, Random var2_2, lno var3_3, int var4_4, int var5_5, double var6_6) {
        block133: {
            block134: {
                block130: {
                    block128: {
                        block129: {
                            block131: {
                                block132: {
                                    block126: {
                                        block127: {
                                            block124: {
                                                block125: {
                                                    block123: {
                                                        block121: {
                                                            block122: {
                                                                block119: {
                                                                    var8_7 = t9d.c();
                                                                    try {
                                                                        block120: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        v0 = this;
                                                                                        if (var8_7 != 0) break block119;
                                                                                        if (v0.j08 == null) break block120;
                                                                                    }
                                                                                    catch (oov v1) {
                                                                                        throw fqj.a(v1);
                                                                                    }
                                                                                    v2 = this;
                                                                                    if (var8_7 != 0) break block121;
                                                                                }
                                                                                catch (oov v3) {
                                                                                    throw fqj.a(v3);
                                                                                }
                                                                                if (v2._gp == var1_1.x2p()) break block122;
                                                                            }
                                                                            catch (oov v4) {
                                                                                throw fqj.a(v4);
                                                                            }
                                                                        }
                                                                        v0 = this;
                                                                    }
                                                                    catch (oov v5) {
                                                                        throw fqj.a(v5);
                                                                    }
                                                                }
                                                                v0.ryr(var1_1.x2p());
                                                            }
                                                            v2 = this;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    v6 = v2.mgg;
                                                                    if (var8_7 != 0) break block123;
                                                                    if (v6 == null) break block124;
                                                                }
                                                                catch (oov v7) {
                                                                    throw fqj.a(v7);
                                                                }
                                                                v8 = this;
                                                                if (var8_7 != 0) break block125;
                                                            }
                                                            catch (oov v9) {
                                                                throw fqj.a(v9);
                                                            }
                                                            v6 = v8.zp8;
                                                        }
                                                        catch (oov v10) {
                                                            throw fqj.a(v10);
                                                        }
                                                    }
                                                    if (v6 == null) break block124;
                                                    v8 = this;
                                                }
                                                try {
                                                    if (var8_7 != 0) break block126;
                                                    if (v8._gp == var1_1.x2p()) break block127;
                                                }
                                                catch (oov v11) {
                                                    throw fqj.a(v11);
                                                }
                                            }
                                            var9_8 = new Random(this._gp);
                                            this.mgg = new uwf(var9_8, 4);
                                            this.zp8 = new uwf(var9_8, 1);
                                        }
                                        v8 = this;
                                    }
                                    v8._gp = var1_1.x2p();
                                    var9_9 = 0.0;
                                    try {
                                        v12 = this.vdr;
                                        if (var8_7 != 0) break block128;
                                        if (v12 == 0) break block129;
                                    }
                                    catch (oov v13) {
                                        throw fqj.a(v13);
                                    }
                                    var11_10 = (var4_4 & -16) + (var5_5 & 15);
                                    var12_11 = (var5_5 & -16) + (var4_4 & 15);
                                    var13_12 = Math.min(Math.abs(var6_6), this.mgg.oj4((double)var11_10 * 0.25, (double)var12_11 * 0.25));
                                    try {
                                        cfr_temp_0 = var13_12 - 0.0;
                                        v14 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                        if (var8_7 != 0) break block130;
                                        if (v14 <= 0) break block129;
                                    }
                                    catch (oov v15) {
                                        throw fqj.a(v15);
                                    }
                                    var15_14 = 0.001953125;
                                    var17_16 = Math.abs(this.zp8.oj4((double)var11_10 * var15_14, (double)var12_11 * var15_14));
                                    var9_9 = var13_12 * var13_12 * 2.5;
                                    var19_18 = Math.ceil(var17_16 * 50.0) + 14.0;
                                    try {
                                        v16 = var9_9;
                                        v17 = var19_18;
                                        if (var8_7 != 0) break block131;
                                        if (!(v16 > v17)) break block132;
                                    }
                                    catch (oov v18) {
                                        throw fqj.a(v18);
                                    }
                                    var9_9 = var19_18;
                                }
                                v16 = var9_9;
                                v17 = 64.0;
                            }
                            var9_9 = v16 + v17;
                        }
                        v12 = var4_4 & 15;
                    }
                    var11_10 = v12;
                    var12_11 = var5_5 & 15;
                    v14 = var1_1._s3();
                }
                var13_13 = v14;
                var14_20 = ox_.f6z.l4i();
                var15_15 = this.kro;
                var16_21 = (int)(var6_6 / 3.0 + 3.0 + var2_2.nextDouble() * 0.25);
                try {
                    cfr_temp_1 = Math.cos(var6_6 / 3.0 * 3.141592653589793) - 0.0;
                    v19 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                    if (var8_7 != 0) break block133;
                    if (v19 <= 0) break block134;
                }
                catch (oov v20) {
                    throw fqj.a(v20);
                }
                v19 = (double)true;
                break block133;
            }
            v19 = (double)false;
        }
        var17_17 = v19;
        var18_22 = -1;
        var19_19 = 0;
        var20_23 = 255;
        while (var20_23 >= 0) {
            block151: {
                block138: {
                    block162: {
                        block161: {
                            block160: {
                                block140: {
                                    block164: {
                                        block158: {
                                            block163: {
                                                block159: {
                                                    block157: {
                                                        block156: {
                                                            block154: {
                                                                block152: {
                                                                    block149: {
                                                                        block145: {
                                                                            block146: {
                                                                                block147: {
                                                                                    block143: {
                                                                                        block144: {
                                                                                            block141: {
                                                                                                block142: {
                                                                                                    block139: {
                                                                                                        block137: {
                                                                                                            block136: {
                                                                                                                block135: {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (var3_3.ql9(var12_11, var20_23, var11_10).r_y().p1r() != p3y.cei) break block135;
                                                                                                                                v21 = var20_23;
                                                                                                                                v22 = (int)var9_9;
                                                                                                                                if (var8_7 != 0) break block136;
                                                                                                                            }
                                                                                                                            catch (oov v23) {
                                                                                                                                throw fqj.a(v23);
                                                                                                                            }
                                                                                                                            if (v21 >= v22) break block135;
                                                                                                                        }
                                                                                                                        catch (oov v24) {
                                                                                                                            throw fqj.a(v24);
                                                                                                                        }
                                                                                                                        var3_3.x6f(var12_11, var20_23, var11_10, ox_.pu8.l4i());
                                                                                                                    }
                                                                                                                    catch (oov v25) {
                                                                                                                        throw fqj.a(v25);
                                                                                                                    }
                                                                                                                }
                                                                                                                v21 = var20_23;
                                                                                                                v22 = var2_2.nextInt(5);
                                                                                                            }
                                                                                                            try {
                                                                                                                if (v21 > v22) break block137;
                                                                                                                var3_3.x6f(var12_11, var20_23, var11_10, ox_.n6z.l4i());
                                                                                                                if (var8_7 == 0) break block138;
                                                                                                            }
                                                                                                            catch (oov v26) {
                                                                                                                throw fqj.a(v26);
                                                                                                            }
                                                                                                        }
                                                                                                        var21_24 = var3_3.ql9(var12_11, var20_23, var11_10);
                                                                                                        try {
                                                                                                            v27 = var21_24.r_y();
                                                                                                            if (var8_7 != 0) break block139;
                                                                                                            if (v27.p1r() == p3y.cei) {
                                                                                                            }
                                                                                                            ** GOTO lbl175
                                                                                                        }
                                                                                                        catch (oov v28) {
                                                                                                            throw fqj.a(v28);
                                                                                                        }
                                                                                                        var18_22 = -1;
                                                                                                        try {
                                                                                                            if (var8_7 == 0) break block138;
lbl175:
                                                                                                            // 2 sources

                                                                                                            v27 = var21_24.r_y();
                                                                                                        }
                                                                                                        catch (oov v29) {
                                                                                                            throw fqj.a(v29);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (v27 != ox_.pu8) break block138;
                                                                                                            v30 = var18_22;
                                                                                                            if (var8_7 != 0) break block140;
                                                                                                        }
                                                                                                        catch (oov v31) {
                                                                                                            throw fqj.a(v31);
                                                                                                        }
                                                                                                        if (v30 == -1) {
                                                                                                        }
                                                                                                        ** GOTO lbl398
                                                                                                    }
                                                                                                    catch (oov v32) {
                                                                                                        throw fqj.a(v32);
                                                                                                    }
                                                                                                    var19_19 = 0;
                                                                                                    try {
                                                                                                        v33 = var16_21;
                                                                                                        if (var8_7 != 0) break block141;
                                                                                                        if (v33 > 0) break block142;
                                                                                                    }
                                                                                                    catch (oov v34) {
                                                                                                        throw fqj.a(v34);
                                                                                                    }
                                                                                                    var14_20 = null;
                                                                                                    var15_15 = ox_.pu8.l4i();
                                                                                                    break block144;
                                                                                                }
                                                                                                v33 = var20_23;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        v35 = var13_13 - 4;
                                                                                                        if (var8_7 != 0) break block143;
                                                                                                        if (v33 < v35) break block144;
                                                                                                    }
                                                                                                    catch (oov v36) {
                                                                                                        throw fqj.a(v36);
                                                                                                    }
                                                                                                    v33 = var20_23;
                                                                                                    v35 = var13_13 + 1;
                                                                                                    if (var8_7 != 0) break block143;
                                                                                                }
                                                                                                catch (oov v37) {
                                                                                                    throw fqj.a(v37);
                                                                                                }
                                                                                                if (v33 > v35) break block144;
                                                                                            }
                                                                                            catch (oov v38) {
                                                                                                throw fqj.a(v38);
                                                                                            }
                                                                                            var14_20 = ox_.f6z.l4i();
                                                                                            var15_15 = this.kro;
                                                                                        }
                                                                                        v33 = var20_23;
                                                                                        v35 = var13_13;
                                                                                    }
                                                                                    try {
                                                                                        block148: {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var8_7 != 0) break block145;
                                                                                                                if (v33 >= v35) break block146;
                                                                                                            }
                                                                                                            catch (oov v39) {
                                                                                                                throw fqj.a(v39);
                                                                                                            }
                                                                                                            v40 = var14_20;
                                                                                                            if (var8_7 != 0) break block147;
                                                                                                        }
                                                                                                        catch (oov v41) {
                                                                                                            throw fqj.a(v41);
                                                                                                        }
                                                                                                        if (v40 == null) break block148;
                                                                                                    }
                                                                                                    catch (oov v42) {
                                                                                                        throw fqj.a(v42);
                                                                                                    }
                                                                                                    v40 = var14_20;
                                                                                                    if (var8_7 != 0) break block147;
                                                                                                }
                                                                                                catch (oov v43) {
                                                                                                    throw fqj.a(v43);
                                                                                                }
                                                                                                if (v40.r_y().p1r() != p3y.cei) break block146;
                                                                                            }
                                                                                            catch (oov v44) {
                                                                                                throw fqj.a(v44);
                                                                                            }
                                                                                        }
                                                                                        v40 = ox_.gdz.l4i();
                                                                                    }
                                                                                    catch (oov v45) {
                                                                                        throw fqj.a(v45);
                                                                                    }
                                                                                }
                                                                                var14_20 = v40;
                                                                            }
                                                                            var18_22 = var16_21 + Math.max(0, var20_23 - var13_13);
                                                                            try {
                                                                                v33 = var20_23;
                                                                                if (var8_7 != 0) break block149;
                                                                                v35 = var13_13 - 1;
                                                                            }
                                                                            catch (oov v46) {
                                                                                throw fqj.a(v46);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block150: {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (v33 >= v35) break block150;
                                                                                            var3_3.x6f(var12_11, var20_23, var11_10, var15_15);
                                                                                            if (var8_7 != 0) break block151;
                                                                                        }
                                                                                        catch (oov v47) {
                                                                                            throw fqj.a(v47);
                                                                                        }
                                                                                        if (var15_15.r_y() != ox_.f6z) break block138;
                                                                                    }
                                                                                    catch (oov v48) {
                                                                                        throw fqj.a(v48);
                                                                                    }
                                                                                    var3_3.x6f(var12_11, var20_23, var11_10, var15_15.r_y().l4i().zvi(pe9.ch6, (Comparable)qvg.y0w));
                                                                                    if (var8_7 == 0) break block138;
                                                                                }
                                                                                catch (oov v49) {
                                                                                    throw fqj.a(v49);
                                                                                }
                                                                            }
                                                                            v33 = (int)this.my2;
                                                                        }
                                                                        catch (oov v50) {
                                                                            throw fqj.a(v50);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block153: {
                                                                            try {
                                                                                block155: {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        if (var8_7 != 0) break block152;
                                                                                                        if (v33 == 0) break block153;
                                                                                                    }
                                                                                                    catch (oov v51) {
                                                                                                        throw fqj.a(v51);
                                                                                                    }
                                                                                                    v33 = var20_23;
                                                                                                    v52 = 86 + var16_21 * 2;
                                                                                                    if (var8_7 != 0) break block154;
                                                                                                }
                                                                                                catch (oov v53) {
                                                                                                    throw fqj.a(v53);
                                                                                                }
                                                                                                if (v33 <= v52) break block153;
                                                                                            }
                                                                                            catch (oov v54) {
                                                                                                throw fqj.a(v54);
                                                                                            }
                                                                                            if (var17_17 == false) break block155;
                                                                                        }
                                                                                        catch (oov v55) {
                                                                                            throw fqj.a(v55);
                                                                                        }
                                                                                        var3_3.x6f(var12_11, var20_23, var11_10, ox_.kqk.l4i().zvi(bx0.nln, (Comparable)bx0$b_z.ryg));
                                                                                        if (var8_7 == 0) break block138;
                                                                                    }
                                                                                    catch (oov v56) {
                                                                                        throw fqj.a(v56);
                                                                                    }
                                                                                }
                                                                                var3_3.x6f(var12_11, var20_23, var11_10, ox_.l11.l4i());
                                                                                if (var8_7 == 0) break block138;
                                                                            }
                                                                            catch (oov v57) {
                                                                                throw fqj.a(v57);
                                                                            }
                                                                        }
                                                                        v33 = var20_23;
                                                                    }
                                                                    catch (oov v58) {
                                                                        throw fqj.a(v58);
                                                                    }
                                                                }
                                                                v52 = var13_13 + 3 + var16_21;
                                                            }
                                                            try {
                                                                if (var8_7 != 0) break block156;
                                                                if (v33 <= v52) {
                                                                }
                                                                ** GOTO lbl359
                                                            }
                                                            catch (oov v59) {
                                                                throw fqj.a(v59);
                                                            }
                                                            var3_3.x6f(var12_11, var20_23, var11_10, this.ke4);
                                                            var19_19 = 1;
                                                            try {
                                                                if (var8_7 == 0) break block138;
lbl359:
                                                                // 2 sources

                                                                v33 = var20_23;
                                                                v52 = 64;
                                                            }
                                                            catch (oov v60) {
                                                                throw fqj.a(v60);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var8_7 != 0) break block157;
                                                                    if (v33 < v52) break block158;
                                                                }
                                                                catch (oov v61) {
                                                                    throw fqj.a(v61);
                                                                }
                                                                v33 = var20_23;
                                                                if (var8_7 != 0) break block159;
                                                            }
                                                            catch (oov v62) {
                                                                throw fqj.a(v62);
                                                            }
                                                            v52 = 127;
                                                        }
                                                        catch (oov v63) {
                                                            throw fqj.a(v63);
                                                        }
                                                    }
                                                    if (v33 > v52) break block158;
                                                    v33 = (int)var17_17;
                                                }
                                                if (v33 == 0) break block163;
                                                var22_25 = ox_.o45.l4i();
                                                if (var8_7 == 0) break block164;
                                            }
                                            var22_25 = this.a5j(var4_4, var20_23, var5_5);
                                            if (var8_7 == 0) break block164;
                                        }
                                        var22_25 = ox_.f6z.l4i().zvi(pe9.ch6, (Comparable)qvg.y0w);
                                    }
                                    try {
                                        var3_3.x6f(var12_11, var20_23, var11_10, var22_25);
                                        if (var8_7 == 0) break block138;
lbl398:
                                        // 2 sources

                                        v30 = var18_22;
                                    }
                                    catch (oov v64) {
                                        throw fqj.a(v64);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (var8_7 != 0) break block160;
                                            if (v30 <= 0) break block138;
                                        }
                                        catch (oov v65) {
                                            throw fqj.a(v65);
                                        }
                                        --var18_22;
                                        if (var8_7 != 0) break block161;
                                    }
                                    catch (oov v66) {
                                        throw fqj.a(v66);
                                    }
                                    v30 = var19_19;
                                }
                                catch (oov v67) {
                                    throw fqj.a(v67);
                                }
                            }
                            try {
                                if (v30 == 0) break block162;
                                var3_3.x6f(var12_11, var20_23, var11_10, ox_.f6z.l4i().zvi(pe9.ch6, (Comparable)qvg.y0w));
                            }
                            catch (oov v68) {
                                throw fqj.a(v68);
                            }
                        }
                        if (var8_7 == 0) break block138;
                    }
                    var22_25 = this.a5j(var4_4, var20_23, var5_5);
                    var3_3.x6f(var12_11, var20_23, var11_10, var22_25);
                }
                --var20_23;
            }
            if (var8_7 == 0) continue;
        }
    }

    private void ryr(long l) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        Random random;
        block49: {
            int n7;
            int n8;
            block48: {
                int n9;
                int n10;
                block47: {
                    int n11;
                    int n12;
                    int n13;
                    block45: {
                        this.j08 = new zfz[64];
                        int n14 = t9d.c();
                        Arrays.fill(this.j08, ox_.o45.l4i());
                        random = new Random(l);
                        this.dwt = new uwf(random, 1);
                        n6 = n14;
                        n13 = 0;
                        while (n13 < 64) {
                            block44: {
                                block46: {
                                    n13 += random.nextInt(5) + 1;
                                    try {
                                        try {
                                            try {
                                                if (n6 != 0) break block44;
                                                n12 = n13;
                                                n11 = 64;
                                                if (n6 != 0) break block45;
                                            }
                                            catch (oov oov2) {
                                                throw fqj.a(oov2);
                                            }
                                            if (n12 >= n11) break block46;
                                        }
                                        catch (oov oov3) {
                                            throw fqj.a(oov3);
                                        }
                                        this.j08[n13] = ox_.f6z.l4i().zvi(pe9.ch6, (Comparable)((Object)qvg.y0w));
                                    }
                                    catch (oov oov4) {
                                        throw fqj.a(oov4);
                                    }
                                }
                                ++n13;
                            }
                            if (n6 == 0) continue;
                        }
                        n12 = random.nextInt(4);
                        n11 = 2;
                    }
                    n13 = n12 + n11;
                    n10 = 0;
                    block31: while (true) {
                        int n15 = n10;
                        int n16 = n13;
                        block32: while (n15 < n16) {
                            n8 = random.nextInt(3) + 1;
                            n5 = random.nextInt(64);
                            n9 = 0;
                            if (n6 != 0) break block47;
                            n4 = n9;
                            while (n5 + n4 < 64) {
                                n15 = n4;
                                n16 = n8;
                                if (n6 != 0) continue block32;
                                try {
                                    if (n15 >= n16) break;
                                    this.j08[n5 + n4] = ox_.f6z.l4i().zvi(pe9.ch6, (Comparable)((Object)qvg.byr));
                                    ++n4;
                                    if (n6 == 0) continue;
                                    break;
                                }
                                catch (oov oov5) {
                                    throw fqj.a(oov5);
                                }
                            }
                            ++n10;
                            if (n6 == 0) continue block31;
                        }
                        break;
                    }
                    n10 = random.nextInt(4) + 2;
                    n9 = 0;
                }
                n8 = n9;
                block34: while (true) {
                    int n17 = n8;
                    int n18 = n10;
                    block35: while (n17 < n18) {
                        n5 = random.nextInt(3) + 2;
                        n4 = random.nextInt(64);
                        n7 = 0;
                        if (n6 != 0) break block48;
                        n3 = n7;
                        while (n4 + n3 < 64) {
                            n17 = n3;
                            n18 = n5;
                            if (n6 != 0) continue block35;
                            try {
                                if (n17 >= n18) break;
                                this.j08[n4 + n3] = ox_.f6z.l4i().zvi(pe9.ch6, (Comparable)((Object)qvg._fk));
                                ++n3;
                                if (n6 == 0) continue;
                                break;
                            }
                            catch (oov oov6) {
                                throw fqj.a(oov6);
                            }
                        }
                        ++n8;
                        if (n6 == 0) continue block34;
                    }
                    break;
                }
                n8 = random.nextInt(4) + 2;
                n7 = 0;
            }
            n5 = n7;
            block37: while (true) {
                int n19 = n5;
                int n20 = n8;
                block38: while (n19 < n20) {
                    n4 = random.nextInt(3) + 1;
                    n3 = random.nextInt(64);
                    n2 = 0;
                    if (n6 != 0) break block49;
                    n = n2;
                    while (n3 + n < 64) {
                        n19 = n;
                        n20 = n4;
                        if (n6 != 0) continue block38;
                        try {
                            if (n19 >= n20) break;
                            this.j08[n3 + n] = ox_.f6z.l4i().zvi(pe9.ch6, (Comparable)((Object)qvg.y7l));
                            ++n;
                            if (n6 == 0) continue;
                            break;
                        }
                        catch (oov oov7) {
                            throw fqj.a(oov7);
                        }
                    }
                    ++n5;
                    if (n6 == 0) continue block37;
                }
                break;
            }
            n5 = random.nextInt(3) + 3;
            n4 = 0;
            n2 = 0;
        }
        n3 = n2;
        block40: while (true) {
            int n21 = n3;
            int n22 = n5;
            block41: while (n21 < n22) {
                n = 1;
                n4 += random.nextInt(16) + 4;
                int n23 = 0;
                while (n4 + n23 < 64) {
                    block55: {
                        int n24;
                        block54: {
                            int n25;
                            block51: {
                                block53: {
                                    block52: {
                                        block50: {
                                            n21 = n23;
                                            n22 = n;
                                            if (n6 != 0) continue block41;
                                            try {
                                                try {
                                                    if (n6 != 0) break block50;
                                                    if (n21 >= n22) break;
                                                }
                                                catch (oov oov8) {
                                                    throw fqj.a(oov8);
                                                }
                                                this.j08[n4 + n23] = ox_.f6z.l4i().zvi(pe9.ch6, (Comparable)((Object)qvg.ft3));
                                                n24 = n4 + n23;
                                                n25 = 1;
                                            }
                                            catch (oov oov9) {
                                                throw fqj.a(oov9);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n6 != 0) break block51;
                                                        if (n24 <= n25) break block52;
                                                    }
                                                    catch (oov oov10) {
                                                        throw fqj.a(oov10);
                                                    }
                                                    n24 = random.nextBoolean();
                                                    if (n6 != 0) break block53;
                                                }
                                                catch (oov oov11) {
                                                    throw fqj.a(oov11);
                                                }
                                                if (n24 == 0) break block52;
                                            }
                                            catch (oov oov12) {
                                                throw fqj.a(oov12);
                                            }
                                            this.j08[n4 + n23 - 1] = ox_.f6z.l4i().zvi(pe9.ch6, (Comparable)((Object)qvg.i_s));
                                        }
                                        catch (oov oov13) {
                                            throw fqj.a(oov13);
                                        }
                                    }
                                    n24 = n4 + n23;
                                }
                                try {
                                    if (n6 != 0) break block54;
                                    n25 = 63;
                                }
                                catch (oov oov14) {
                                    throw fqj.a(oov14);
                                }
                            }
                            try {
                                if (n24 >= n25) break block55;
                                n24 = random.nextBoolean() ? 1 : 0;
                            }
                            catch (oov oov15) {
                                throw fqj.a(oov15);
                            }
                        }
                        try {
                            if (n24 != 0) {
                                this.j08[n4 + n23 + 1] = ox_.f6z.l4i().zvi(pe9.ch6, (Comparable)((Object)qvg.i_s));
                            }
                        }
                        catch (oov oov16) {
                            throw fqj.a(oov16);
                        }
                    }
                    ++n23;
                    if (n6 == 0) continue;
                }
                ++n3;
                if (n6 == 0) continue block40;
            }
            break;
        }
    }

    private zfz a5j(int n, int n2, int n3) {
        int n4 = (int)Math.round(this.dwt.oj4((double)n * 1.0 / 512.0, (double)n * 1.0 / 512.0) * 2.0);
        return this.j08[(n2 + n4 + 64) % 64];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public gyu hiq(int var1_1) {
        block15: {
            block14: {
                block12: {
                    block13: {
                        var2_2 = fqj.a ^ 23495681676871L;
                        var4_3 = t9d.c();
                        try {
                            try {
                                v0 = this.mu9;
                                if (var4_3 != 0) break block12;
                                if (v0 != gyu.cro.mu9) break block13;
                            }
                            catch (oov v1) {
                                throw fqj.a(v1);
                            }
                            v0 = true;
                            break block12;
                        }
                        catch (oov v2) {
                            throw fqj.a(v2);
                        }
                    }
                    v0 = false;
                }
                var5_4 = v0;
                var6_5 = new fqj(var1_1, var5_4, this.my2);
                try {
                    try {
                        if (var4_3 != 0) break block14;
                        if (!var5_4) {
                        }
                        ** GOTO lbl40
                    }
                    catch (oov v3) {
                        throw fqj.a(v3);
                    }
                    var6_5.wzy(fqj.vvn);
                    var6_5.cb4(this.jcq + (String)fqj.b("u", (int)5162, (long)(6836581255005347313L ^ var2_2)));
                }
                catch (oov v4) {
                    throw fqj.a(v4);
                }
            }
            try {
                if (var4_3 == 0) break block15;
lbl40:
                // 2 sources

                var6_5.cb4(this.jcq + (String)fqj.b("u", (int)16965, (long)(7507015009826458527L ^ var2_2)));
            }
            catch (oov v5) {
                throw fqj.a(v5);
            }
        }
        var6_5.cq8(this.np2, true);
        return var6_5;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        h = new HashMap(13);
        long l = a ^ 0x3E4F97BAF09BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u009d\u0014Hc\u0094g\u001b}@]Du\u00a3\u0083_\u00f3^\u00c16\b\u00a3\u0084\u00ad\u00e6\u00a1\u00c9\u00e9.\u008e[\u00dc`\u0010\u00f5\u0085VB7\u0000v\u00c6L\u00f5\u00c3\u00d1`\u00ed[\u0096";
        int n2 = "\u009d\u0014Hc\u0094g\u001b}@]Du\u00a3\u0083_\u00f3^\u00c16\b\u00a3\u0084\u00ad\u00e6\u00a1\u00c9\u00e9.\u008e[\u00dc`\u0010\u00f5\u0085VB7\u0000v\u00c6L\u00f5\u00c3\u00d1`\u00ed[\u0096".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fqj.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                f = stringArray;
                g = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static oov a(oov oov2) {
        return oov2;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x374;
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
                throw new RuntimeException("fqj", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            fqj.g[n2] = fqj.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fqj.b(n, l);
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
            throw new RuntimeException("fqj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fqj.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

