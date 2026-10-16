/*
 * Decompiled with CFR 0.152.
 */
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

public class c6y$p__
extends flo {
    private int wg6;
    private final jux gnj;
    private qhg bwk;
    public boolean zwy;
    private static final long b;
    private static final String[] h;
    private static final String[] i;
    private static final Map m;

    public c6y$p__(t9d t9d2, double d, double d2, double d3, double d4, double d5, double d6, jux jux2, bdo bdo2) {
        block18: {
            int n;
            int n2;
            long l;
            block19: {
                block17: {
                    l = b ^ 0x628506ECC8BDL;
                    super(t9d2, d, d2, d3, 0.0, 0.0, 0.0);
                    this.icv = d4;
                    n2 = t9d.b();
                    try {
                        try {
                            this.mop = d5;
                            this.bw4 = d6;
                            this.gnj = jux2;
                            this.bx4 = 8;
                            if (n2 == 0) break block17;
                            if (bdo2 == null) break block18;
                        }
                        catch (oov oov2) {
                            throw c6y$p__.a(oov2);
                        }
                        this.bwk = bdo2.bzb((String)((Object)c6y$p__.c("n", (int)30411, (long)(0x22E8230863121D64L ^ l))), 10);
                    }
                    catch (oov oov3) {
                        throw c6y$p__.a(oov3);
                    }
                }
                try {
                    block20: {
                        try {
                            try {
                                n = this.bwk.vek();
                                if (n2 == 0) break block19;
                                if (n != 0) break block20;
                            }
                            catch (oov oov4) {
                                throw c6y$p__.a(oov4);
                            }
                            this.bwk = null;
                            if (n2 != 0) break block18;
                        }
                        catch (oov oov5) {
                            throw c6y$p__.a(oov5);
                        }
                    }
                    this.bx4 = this.bwk.vek() * 2 - 1;
                    n = 0;
                }
                catch (oov oov6) {
                    throw c6y$p__.a(oov6);
                }
            }
            int n3 = n;
            while (n3 < this.bwk.vek()) {
                block21: {
                    bdo bdo3 = this.bwk.kd6(n3);
                    try {
                        block22: {
                            try {
                                try {
                                    if (n2 == 0) break block21;
                                    if (!bdo3.dvl((String)((Object)c6y$p__.c("n", (int)1261, (long)(0x3112222A69126F43L ^ l))))) break block22;
                                }
                                catch (oov oov7) {
                                    throw c6y$p__.a(oov7);
                                }
                                this.zwy = true;
                                this.bx4 += 15;
                                if (n2 != 0) break;
                            }
                            catch (oov oov8) {
                                throw c6y$p__.a(oov8);
                            }
                        }
                        ++n3;
                    }
                    catch (oov oov9) {
                        throw c6y$p__.a(oov9);
                    }
                }
                if (n2 != 0) continue;
            }
        }
    }

    @Override
    public void oss(q3g q3g2, i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void xx_() {
        block95: {
            block96: {
                block94: {
                    block83: {
                        block80: {
                            block82: {
                                block81: {
                                    block88: {
                                        block91: {
                                            block89: {
                                                block86: {
                                                    block84: {
                                                        block85: {
                                                            block69: {
                                                                block75: {
                                                                    block71: {
                                                                        block70: {
                                                                            block79: {
                                                                                block78: {
                                                                                    block76: {
                                                                                        block77: {
                                                                                            block73: {
                                                                                                block72: {
                                                                                                    var1_1 = c6y$p__.b ^ 97980815195126L;
                                                                                                    var3_2 = t9d.b();
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                v0 = this.wg6;
                                                                                                                if (var3_2 == 0) break block69;
                                                                                                                if (v0 != 0) break block70;
                                                                                                            }
                                                                                                            catch (oov v1) {
                                                                                                                throw c6y$p__.a(v1);
                                                                                                            }
                                                                                                            v2 = this;
                                                                                                            if (var3_2 == 0) break block71;
                                                                                                        }
                                                                                                        catch (oov v3) {
                                                                                                            throw c6y$p__.a(v3);
                                                                                                        }
                                                                                                        if (v2.bwk == null) break block70;
                                                                                                    }
                                                                                                    catch (oov v4) {
                                                                                                        throw c6y$p__.a(v4);
                                                                                                    }
                                                                                                    var4_3 = this.wwv();
                                                                                                    var5_4 = false;
                                                                                                    try {
                                                                                                        v5 = this.bwk.vek();
                                                                                                        if (var3_2 == 0) break block72;
                                                                                                        if (v5 >= 3) {
                                                                                                        }
                                                                                                        ** GOTO lbl34
                                                                                                    }
                                                                                                    catch (oov v6) {
                                                                                                        throw c6y$p__.a(v6);
                                                                                                    }
                                                                                                    var5_4 = true;
                                                                                                    try {
                                                                                                        if (var3_2 != 0) break block73;
lbl34:
                                                                                                        // 2 sources

                                                                                                        v5 = 0;
                                                                                                    }
                                                                                                    catch (oov v7) {
                                                                                                        throw c6y$p__.a(v7);
                                                                                                    }
                                                                                                }
                                                                                                var6_7 = v5;
                                                                                                while (var6_7 < this.bwk.vek()) {
                                                                                                    block74: {
                                                                                                        var7_10 = this.bwk.kd6(var6_7);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var3_2 == 0) break block74;
                                                                                                                v8 = var7_10.r_t((String)c6y$p__.c("n", (int)5673, (long)(3248529900110581444L ^ var1_1)));
                                                                                                                v9 = 1;
                                                                                                                if (var3_2 == 0) break block75;
                                                                                                            }
                                                                                                            catch (oov v10) {
                                                                                                                throw c6y$p__.a(v10);
                                                                                                            }
                                                                                                            if (v8 == v9) {
                                                                                                            }
                                                                                                            ** GOTO lbl60
                                                                                                        }
                                                                                                        catch (oov v11) {
                                                                                                            throw c6y$p__.a(v11);
                                                                                                        }
                                                                                                        var5_4 = true;
                                                                                                        try {
                                                                                                            if (var3_2 != 0) break;
lbl60:
                                                                                                            // 2 sources

                                                                                                            ++var6_7;
                                                                                                        }
                                                                                                        catch (oov v12) {
                                                                                                            throw c6y$p__.a(v12);
                                                                                                        }
                                                                                                    }
                                                                                                    if (var3_2 != 0) continue;
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    v13 = new StringBuilder();
                                                                                                    v14 = c6y$p__.c("n", (int)16394, (long)(2689749212917487845L ^ var1_1));
                                                                                                    if (var3_2 == 0) break block76;
                                                                                                    v13 = v13.append((String)v14);
                                                                                                    if (!var5_4) break block77;
                                                                                                }
                                                                                                catch (oov v15) {
                                                                                                    throw c6y$p__.a(v15);
                                                                                                }
                                                                                                v14 = c6y$p__.c("n", (int)2555, (long)(2609340900510798097L ^ var1_1));
                                                                                                break block76;
                                                                                            }
                                                                                            catch (oov v16) {
                                                                                                throw c6y$p__.a(v16);
                                                                                            }
                                                                                        }
                                                                                        v14 = c6y$p__.c("n", (int)18653, (long)(9079289084482539581L ^ var1_1));
                                                                                    }
                                                                                    try {
                                                                                        v17 = v13.append((String)v14);
                                                                                        if (var4_3 == 0) break block78;
                                                                                        v18 = c6y$p__.c("n", (int)4536, (long)(5579021919191664982L ^ var1_1));
                                                                                        break block79;
                                                                                    }
                                                                                    catch (oov v19) {
                                                                                        throw c6y$p__.a(v19);
                                                                                    }
                                                                                }
                                                                                v18 = "";
                                                                            }
                                                                            var6_8 = v17.append((String)v18).toString();
                                                                            this.oay.wd_(this.o2v, this.kfp, this.vbd, var6_8, 20.0f, 0.95f + this.z2d.nextFloat() * 0.1f, true);
                                                                        }
                                                                        v2 = this;
                                                                    }
                                                                    v8 = v2.wg6;
                                                                    v9 = 2;
                                                                }
                                                                v0 = v8 % v9;
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (var3_2 == 0) break block80;
                                                                                if (v0 != 0) break block81;
                                                                            }
                                                                            catch (oov v20) {
                                                                                throw c6y$p__.a(v20);
                                                                            }
                                                                            v21 = this;
                                                                            if (var3_2 == 0) break block82;
                                                                        }
                                                                        catch (oov v22) {
                                                                            throw c6y$p__.a(v22);
                                                                        }
                                                                        if (v21.bwk == null) break block81;
                                                                    }
                                                                    catch (oov v23) {
                                                                        throw c6y$p__.a(v23);
                                                                    }
                                                                    v0 = this.wg6 / 2;
                                                                    v24 = this.bwk.vek();
                                                                    if (var3_2 == 0) break block83;
                                                                }
                                                                catch (oov v25) {
                                                                    throw c6y$p__.a(v25);
                                                                }
                                                                if (v0 >= v24) break block81;
                                                            }
                                                            catch (oov v26) {
                                                                throw c6y$p__.a(v26);
                                                            }
                                                            var4_3 = this.wg6 / 2;
                                                            var5_5 = this.bwk.kd6(var4_3);
                                                            var6_9 = var5_5.r_t((String)c6y$p__.c("n", (int)21690, (long)(13005614812613715L ^ var1_1)));
                                                            var7_11 = var5_5.dvl((String)c6y$p__.c("n", (int)21140, (long)(6760494982023203447L ^ var1_1)));
                                                            var8_12 = var5_5.dvl((String)c6y$p__.c("n", (int)11087, (long)(5599465503896089511L ^ var1_1)));
                                                            var9_13 = var5_5.hkr((String)c6y$p__.c("n", (int)8528, (long)(9115364863622625714L ^ var1_1)));
                                                            var10_14 = var5_5.hkr((String)c6y$p__.c("n", (int)20136, (long)(7334457212919633481L ^ var1_1)));
                                                            try {
                                                                v27 = var9_13.length;
                                                                if (var3_2 == 0) break block84;
                                                                if (v27 != 0) break block85;
                                                            }
                                                            catch (oov v28) {
                                                                throw c6y$p__.a(v28);
                                                            }
                                                            var9_13 = new int[]{pis.i2b[0]};
                                                        }
                                                        v27 = var6_9;
                                                    }
                                                    try {
                                                        block87: {
                                                            try {
                                                                try {
                                                                    v29 = 1;
                                                                    if (var3_2 == 0) break block86;
                                                                    if (v27 != v29) break block87;
                                                                }
                                                                catch (oov v30) {
                                                                    throw c6y$p__.a(v30);
                                                                }
                                                                this.cwg(0.5, 4, var9_13, var10_14, var7_11, var8_12);
                                                                if (var3_2 != 0) break block88;
                                                            }
                                                            catch (oov v31) {
                                                                throw c6y$p__.a(v31);
                                                            }
                                                        }
                                                        v27 = var6_9;
                                                        v29 = 2;
                                                    }
                                                    catch (oov v32) {
                                                        throw c6y$p__.a(v32);
                                                    }
                                                }
                                                try {
                                                    block90: {
                                                        try {
                                                            try {
                                                                if (var3_2 == 0) break block89;
                                                                if (v27 != v29) break block90;
                                                            }
                                                            catch (oov v33) {
                                                                throw c6y$p__.a(v33);
                                                            }
                                                            this.sws(0.5, new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}}, var9_13, var10_14, var7_11, var8_12, false);
                                                            if (var3_2 != 0) break block88;
                                                        }
                                                        catch (oov v34) {
                                                            throw c6y$p__.a(v34);
                                                        }
                                                    }
                                                    v27 = var6_9;
                                                    v29 = 3;
                                                }
                                                catch (oov v35) {
                                                    throw c6y$p__.a(v35);
                                                }
                                            }
                                            try {
                                                block92: {
                                                    try {
                                                        try {
                                                            if (var3_2 == 0) break block91;
                                                            if (v27 != v29) break block92;
                                                        }
                                                        catch (oov v36) {
                                                            throw c6y$p__.a(v36);
                                                        }
                                                        this.sws(0.5, new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}}, var9_13, var10_14, var7_11, var8_12, true);
                                                        if (var3_2 != 0) break block88;
                                                    }
                                                    catch (oov v37) {
                                                        throw c6y$p__.a(v37);
                                                    }
                                                }
                                                v27 = var6_9;
                                                v29 = 4;
                                            }
                                            catch (oov v38) {
                                                throw c6y$p__.a(v38);
                                            }
                                        }
                                        try {
                                            block93: {
                                                try {
                                                    if (v27 != v29) break block93;
                                                    this.ei_(var9_13, var10_14, var7_11, var8_12);
                                                    if (var3_2 != 0) break block88;
                                                }
                                                catch (oov v39) {
                                                    throw c6y$p__.a(v39);
                                                }
                                            }
                                            this.cwg(0.25, 2, var9_13, var10_14, var7_11, var8_12);
                                        }
                                        catch (oov v40) {
                                            throw c6y$p__.a(v40);
                                        }
                                    }
                                    var11_15 = var9_13[0];
                                    var12_16 = (float)((var11_15 & 0xFF0000) >> 16) / 255.0f;
                                    var13_17 = (float)((var11_15 & 65280) >> 8) / 255.0f;
                                    var14_18 = (float)((var11_15 & 255) >> 0) / 255.0f;
                                    var15_19 = new c6y$mhn(this.oay, this.o2v, this.kfp, this.vbd);
                                    var15_19.mcd(var12_16, var13_17, var14_18);
                                    this.gnj.o4t(var15_19);
                                }
                                ++this.wg6;
                                v21 = this;
                            }
                            v0 = v21.wg6;
                        }
                        try {
                            if (var3_2 == 0) break block94;
                            v24 = this.bx4;
                        }
                        catch (oov v41) {
                            throw c6y$p__.a(v41);
                        }
                    }
                    try {
                        try {
                            if (v0 <= v24) break block95;
                            v42 = this;
                            if (var3_2 == 0) break block96;
                        }
                        catch (oov v43) {
                            throw c6y$p__.a(v43);
                        }
                        v0 = (int)v42.zwy;
                    }
                    catch (oov v44) {
                        throw c6y$p__.a(v44);
                    }
                }
                if (v0 != 0) {
                    block98: {
                        var4_3 = this.wwv();
                        v45 = new StringBuilder();
                        v46 = c6y$p__.c("n", (int)18047, (long)(1101195221926436505L ^ var1_1));
                        if (var3_2 != 0) {
                            block97: {
                                try {
                                    v45 = v45.append((String)v46);
                                    if (var4_3 == 0) break block97;
                                    v46 = c6y$p__.c("n", (int)22872, (long)(2951501174582854079L ^ var1_1));
                                    break block98;
                                }
                                catch (oov v47) {
                                    throw c6y$p__.a(v47);
                                }
                            }
                            v46 = c6y$p__.c("n", (int)16004, (long)(7498057126303475311L ^ var1_1));
                        }
                    }
                    var5_6 = v45.append((String)v46).toString();
                    this.oay.wd_(this.o2v, this.kfp, this.vbd, var5_6, 20.0f, 0.9f + this.z2d.nextFloat() * 0.15f, true);
                }
                v42 = this;
            }
            v42._kl();
        }
    }

    private boolean wwv() {
        int n;
        block11: {
            block12: {
                block9: {
                    i2h i2h2;
                    int n2;
                    block10: {
                        c05 c052;
                        c05 c053;
                        block8: {
                            n2 = t9d.b();
                            c053 = c05.vz1();
                            try {
                                c052 = c053;
                                if (n2 == 0) break block8;
                                if (c052 == null) break block9;
                            }
                            catch (oov oov2) {
                                throw c6y$p__.a(oov2);
                            }
                            c052 = c053;
                        }
                        try {
                            try {
                                i2h2 = c052.nsd();
                                if (n2 == 0) break block10;
                                if (i2h2 == null) break block9;
                            }
                            catch (oov oov3) {
                                throw c6y$p__.a(oov3);
                            }
                            i2h2 = c053.nsd();
                        }
                        catch (oov oov4) {
                            throw c6y$p__.a(oov4);
                        }
                    }
                    try {
                        double d = i2h2.p53(this.o2v, this.kfp, this.vbd) - 256.0;
                        n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                        if (n2 == 0) break block11;
                        if (n < 0) break block12;
                    }
                    catch (oov oov5) {
                        throw c6y$p__.a(oov5);
                    }
                }
                n = 1;
                break block11;
            }
            n = 0;
        }
        return n != 0;
    }

    private void u6m(double d, double d2, double d3, double d4, double d5, double d6, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        block6: {
            c6y$v68 c6y$v68;
            block7: {
                c6y$v68 = new c6y$v68(this.oay, d, d2, d3, d4, d5, d6, this.gnj);
                c6y$v68.rc6(0.99f);
                int n = t9d.c();
                c6y$v68.kqe(bl);
                int n2 = n;
                c6y$v68.tvt(bl2);
                int n3 = this.z2d.nextInt(nArray.length);
                try {
                    try {
                        try {
                            c6y$v68.fnk(nArray[n3]);
                            if (n2 != 0) break block6;
                            if (nArray2 == null) break block7;
                        }
                        catch (oov oov2) {
                            throw c6y$p__.a(oov2);
                        }
                        if (nArray2.length <= 0) break block7;
                    }
                    catch (oov oov3) {
                        throw c6y$p__.a(oov3);
                    }
                    c6y$v68.nll(nArray2[this.z2d.nextInt(nArray2.length)]);
                }
                catch (oov oov4) {
                    throw c6y$p__.a(oov4);
                }
            }
            this.gnj.o4t(c6y$v68);
        }
    }

    private void cwg(double d, int n, int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        double d2 = this.o2v;
        double d3 = this.kfp;
        double d4 = this.vbd;
        int n2 = -n;
        int n3 = t9d.b();
        block16: while (true) {
            int n4 = n2;
            block17: while (n4 <= n) {
                int n5 = -n;
                block18: while (true) {
                    int n6 = n5;
                    int n7 = n;
                    block19: while (n6 <= n7) {
                        n4 = -n;
                        if (n3 == 0) continue block17;
                        int n8 = n4;
                        while (n8 <= n) {
                            block21: {
                                block22: {
                                    int n9;
                                    int n10;
                                    block25: {
                                        block24: {
                                            block23: {
                                                double d5 = (double)n5 + (this.z2d.nextDouble() - this.z2d.nextDouble()) * 0.5;
                                                double d6 = (double)n2 + (this.z2d.nextDouble() - this.z2d.nextDouble()) * 0.5;
                                                double d7 = (double)n8 + (this.z2d.nextDouble() - this.z2d.nextDouble()) * 0.5;
                                                double d8 = (double)fe6.dii(d5 * d5 + d6 * d6 + d7 * d7) / d + this.z2d.nextGaussian() * 0.05;
                                                try {
                                                    this.u6m(d2, d3, d4, d5 / d8, d6 / d8, d7 / d8, nArray, nArray2, bl, bl2);
                                                    if (n3 == 0) break block21;
                                                    n6 = n2;
                                                    n7 = -n;
                                                    if (n3 == 0) continue block19;
                                                }
                                                catch (oov oov2) {
                                                    throw c6y$p__.a(oov2);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            if (n6 == n7) break block22;
                                                            n10 = n2;
                                                            n9 = n;
                                                            if (n3 == 0) break block23;
                                                        }
                                                        catch (oov oov3) {
                                                            throw c6y$p__.a(oov3);
                                                        }
                                                        if (n10 == n9) break block22;
                                                    }
                                                    catch (oov oov4) {
                                                        throw c6y$p__.a(oov4);
                                                    }
                                                    n10 = n5;
                                                    n9 = -n;
                                                }
                                                catch (oov oov5) {
                                                    throw c6y$p__.a(oov5);
                                                }
                                            }
                                            try {
                                                try {
                                                    if (n3 == 0) break block24;
                                                    if (n10 == n9) break block22;
                                                }
                                                catch (oov oov6) {
                                                    throw c6y$p__.a(oov6);
                                                }
                                                n10 = n5;
                                                n9 = n;
                                            }
                                            catch (oov oov7) {
                                                throw c6y$p__.a(oov7);
                                            }
                                        }
                                        try {
                                            try {
                                                if (n3 == 0) break block25;
                                                if (n10 == n9) break block22;
                                            }
                                            catch (oov oov8) {
                                                throw c6y$p__.a(oov8);
                                            }
                                            n10 = n8;
                                            n9 = n * 2 - 1;
                                        }
                                        catch (oov oov9) {
                                            throw c6y$p__.a(oov9);
                                        }
                                    }
                                    n8 = n10 + n9;
                                }
                                ++n8;
                            }
                            if (n3 != 0) continue;
                        }
                        ++n5;
                        if (n3 != 0) continue block18;
                    }
                    break;
                }
                ++n2;
                if (n3 != 0) continue block16;
            }
            break;
        }
    }

    private void sws(double d, double[][] dArray, int[] nArray, int[] nArray2, boolean bl, boolean bl2, boolean bl3) {
        double d2;
        double d3 = dArray[0][0];
        int n = t9d.b();
        double d4 = dArray[0][1];
        this.u6m(this.o2v, this.kfp, this.vbd, d3 * d, d4 * d, 0.0, nArray, nArray2, bl, bl2);
        int n2 = n;
        float f = this.z2d.nextFloat() * (float)Math.PI;
        try {
            d2 = bl3 ? 0.034 : 0.34;
        }
        catch (oov oov2) {
            throw c6y$p__.a(oov2);
        }
        double d5 = d2;
        for (int i = 0; i < 3; ++i) {
            double d6 = (double)f + (double)((float)i * (float)Math.PI) * d5;
            double d7 = d3;
            double d8 = d4;
            block5: while (true) {
                double d9 = d8;
                for (int j = 1; j < dArray.length; ++j) {
                    double d10;
                    block10: {
                        double d11 = dArray[j][0];
                        double d12 = dArray[j][1];
                        d8 = 0.25;
                        if (n2 == 0) continue block5;
                        double d13 = d8;
                        while (d13 <= 1.0) {
                            block11: {
                                double d14 = (d7 + (d11 - d7) * d13) * d;
                                double d15 = (d9 + (d12 - d9) * d13) * d;
                                double d16 = d14 * Math.sin(d6);
                                d14 *= Math.cos(d6);
                                d10 = -1.0;
                                if (n2 == 0) break block10;
                                for (double d17 = v765362; d17 <= 1.0; d17 += 2.0) {
                                    this.u6m(this.o2v, this.kfp, this.vbd, d14 * d17, d15, d16 * d17, nArray, nArray2, bl, bl2);
                                    try {
                                        if (n2 != 0) {
                                            if (n2 != 0) continue;
                                            break;
                                        }
                                        break block11;
                                    }
                                    catch (oov oov3) {
                                        throw c6y$p__.a(oov3);
                                    }
                                }
                                d13 += 0.25;
                            }
                            if (n2 != 0) continue;
                        }
                        d7 = d11;
                        d10 = d12;
                    }
                    d9 = d10;
                    if (n2 != 0) continue;
                }
                break;
            }
            if (n2 != 0) continue;
        }
    }

    private void ei_(int[] nArray, int[] nArray2, boolean bl, boolean bl2) {
        double d = this.z2d.nextGaussian() * 0.05;
        double d2 = this.z2d.nextGaussian() * 0.05;
        int n = t9d.b();
        for (int i = 0; i < 70; ++i) {
            double d3 = this.icv * 0.5 + this.z2d.nextGaussian() * 0.15 + d;
            double d4 = this.bw4 * 0.5 + this.z2d.nextGaussian() * 0.15 + d2;
            double d5 = this.mop * 0.5 + this.z2d.nextDouble() * 0.5;
            this.u6m(this.o2v, this.kfp, this.vbd, d3, d5, d4, nArray, nArray2, bl, bl2);
            if (n != 0) continue;
        }
    }

    @Override
    public int ikr() {
        return 0;
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

                c6y$p__.b = c.a(-7251864287521210205L, 3517762839078142217L, MethodHandles.lookup().lookupClass()).a(216841839077929L);
                c6y$p__.m = new HashMap<K, V>(13);
                var0 = c6y$p__.b ^ 8249745430696L;
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
                var9_3 = new String[15];
                var7_4 = 0;
                var6_5 = "\u0099\u0094\u0090c\u00f2\u00c5\u001c\u0083L0D\u0001\u00f4\u00b8\u00b3\u00c7\u0010\n\u00fc\u009d.r\u00c8\u008b\u0016\u0089\u00c9\u0081A\u00b6!\u0083\u00a4 6\u001cpU\u00013I5\u00c2Y\u001a\u001bd\u0099\u00e6\u00f3\u00d0\u00d4u\u00c5\u00c2\r!\u00f4)\u00d6\u00d6\u00d6\u00dc\u00b1D\u00a1\u0010\u00fc\u0099\u00c0\u00cc%\u00e23\u0081\u009c\u00d5\u009c,kp\u00c1\u00bd \u001bi\u00c8\u00d1\u00e0\u00c0&<\u00ce\u0097<=\u000e\u00b5\u0007\u0085\u0099 YAiI!\u00des\u00a8`RK\u00b8\u009e\u00bb\u0018&|\u0092yt\u00e8\u00be^\u00c9sr\u0001\u0088\u00e0\u00b7E\"\u00c8\u00ab\u0097\u00fa\u00f7mi\u0010\u007f1$\u00b2\u001c\u00c2\u00cfQ\u00db\u007f\u0096\u00c7'\u001b\u0007\u0096\u0018k_p\u00dc\u0095q\u007f\u000f\u0080g\u00d8DB\u0087'_\u0019M<\u00e1Ry\u0089\u00b2\u0010\u0016\u00de\u00aeA\u00d2\u00da\u00d7\u00cag\u0085]`B\u00c3\u00df\u00b2 \u00ce\u0013\u001a\u0010\u0085\u00b6\u00bdN\u00e9c\u001bS\u0019{\u00cc\r\u007f\u00d0\u008es~\u00cd\u00e2\u00f6\u00c8\u00fd\u0007n\u0092\u00ab{\u0094\u0010\u0006^$\u009d\u00bcF]\u000f9\u00b6\u0018B\u00a8\u00dcv\u0017\u0010S\u00f1F\u0093g\u0000L\u0002h\u0016e\u00a2\u000e\u00fe\u008c% Pm  A\u00cbg\u00d0\u0087\u00aaQ\u00e0\u008e&\u00bfH\u0019\u00b3\u00a0\u00b1\u00caZ&\u0093y%\u00dd\u00cd\u00b1\u00d6\u00c7\u00a0";
                var8_6 = "\u0099\u0094\u0090c\u00f2\u00c5\u001c\u0083L0D\u0001\u00f4\u00b8\u00b3\u00c7\u0010\n\u00fc\u009d.r\u00c8\u008b\u0016\u0089\u00c9\u0081A\u00b6!\u0083\u00a4 6\u001cpU\u00013I5\u00c2Y\u001a\u001bd\u0099\u00e6\u00f3\u00d0\u00d4u\u00c5\u00c2\r!\u00f4)\u00d6\u00d6\u00d6\u00dc\u00b1D\u00a1\u0010\u00fc\u0099\u00c0\u00cc%\u00e23\u0081\u009c\u00d5\u009c,kp\u00c1\u00bd \u001bi\u00c8\u00d1\u00e0\u00c0&<\u00ce\u0097<=\u000e\u00b5\u0007\u0085\u0099 YAiI!\u00des\u00a8`RK\u00b8\u009e\u00bb\u0018&|\u0092yt\u00e8\u00be^\u00c9sr\u0001\u0088\u00e0\u00b7E\"\u00c8\u00ab\u0097\u00fa\u00f7mi\u0010\u007f1$\u00b2\u001c\u00c2\u00cfQ\u00db\u007f\u0096\u00c7'\u001b\u0007\u0096\u0018k_p\u00dc\u0095q\u007f\u000f\u0080g\u00d8DB\u0087'_\u0019M<\u00e1Ry\u0089\u00b2\u0010\u0016\u00de\u00aeA\u00d2\u00da\u00d7\u00cag\u0085]`B\u00c3\u00df\u00b2 \u00ce\u0013\u001a\u0010\u0085\u00b6\u00bdN\u00e9c\u001bS\u0019{\u00cc\r\u007f\u00d0\u008es~\u00cd\u00e2\u00f6\u00c8\u00fd\u0007n\u0092\u00ab{\u0094\u0010\u0006^$\u009d\u00bcF]\u000f9\u00b6\u0018B\u00a8\u00dcv\u0017\u0010S\u00f1F\u0093g\u0000L\u0002h\u0016e\u00a2\u000e\u00fe\u008c% Pm  A\u00cbg\u00d0\u0087\u00aaQ\u00e0\u008e&\u00bfH\u0019\u00b3\u00a0\u00b1\u00caZ&\u0093y%\u00dd\u00cd\u00b1\u00d6\u00c7\u00a0".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = c6y$p__.c(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e2\u00ecq\u0005\u008c\u007f\u0094B\u009fy\u00d3\u0011\u00b6\u00cf9b\u0010\u00fd\u00cd\u00b3\u00af\u00a4\u0088A\u00b0$\u00d3{\u00d4h\u0080\u000fB";
                    var8_6 = "\u00e2\u00ecq\u0005\u008c\u007f\u0094B\u009fy\u00d3\u0011\u00b6\u00cf9b\u0010\u00fd\u00cd\u00b3\u00af\u00a4\u0088A\u00b0$\u00d3{\u00d4h\u0080\u000fB".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = c6y$p__.c(var10_9).intern();
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
        c6y$p__.h = var9_3;
        c6y$p__.i = new String[15];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String c(byte[] byArray) {
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

    private static String c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5A1;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])m.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("c6y$p__", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            c6y$p__.i[n2] = c6y$p__.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c6y$p__.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("c6y$p__" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c6y$p__.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

