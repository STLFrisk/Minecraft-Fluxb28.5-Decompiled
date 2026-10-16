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
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraft.world.gen.structure.StructureOceanMonument;

public class eiu
implements g6k {
    private Random kz7;
    private b_x f1g;
    private b_x vai;
    private b_x cm_;
    private uwf s9t;
    public b_x gem;
    public b_x ikb;
    public b_x gak;
    private t9d b01;
    private final boolean xjr;
    private gxq jl5;
    private final double[] xje;
    private final float[] lg0;
    private y_h wo4;
    private e0x i4t;
    private double[] ego;
    private uk2 yqm;
    private MapGenStronghold a7k;
    private MapGenVillage s9l;
    private xi0 hj_;
    private MapGenScatteredFeature h02;
    private uk2 w8s;
    private StructureOceanMonument lq4;
    private gyu[] y4o;
    public double[] fgk;
    public double[] y9v;
    public double[] fzc;
    public double[] krp;
    private static final long a = c.a(-5327392653738752020L, -4870356516903989931L, MethodHandles.lookup().lookupClass()).a(185771360513203L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public eiu(t9d t9d2, long l, boolean bl, String string) {
        block10: {
            es2 es22;
            block12: {
                block11: {
                    this.i4t = ox_.gdz;
                    this.ego = new double[256];
                    this.yqm = new h9u();
                    this.a7k = new MapGenStronghold();
                    this.s9l = new MapGenVillage();
                    this.hj_ = new xi0();
                    this.h02 = new MapGenScatteredFeature();
                    this.w8s = new cvu();
                    this.lq4 = new StructureOceanMonument();
                    this.b01 = t9d2;
                    this.xjr = bl;
                    this.jl5 = t9d2.r7d().z28();
                    this.kz7 = new Random(l);
                    int n = t9d.c();
                    this.f1g = new b_x(this.kz7, 16);
                    this.vai = new b_x(this.kz7, 16);
                    this.cm_ = new b_x(this.kz7, 8);
                    this.s9t = new uwf(this.kz7, 4);
                    this.gem = new b_x(this.kz7, 10);
                    this.ikb = new b_x(this.kz7, 16);
                    this.gak = new b_x(this.kz7, 8);
                    this.xje = new double[825];
                    this.lg0 = new float[25];
                    int n2 = -2;
                    while (n2 <= 2) {
                        block9: {
                            for (int i = -2; i <= 2; ++i) {
                                float f = 10.0f / fe6.bug((float)(n2 * n2 + i * i) + 0.2f);
                                try {
                                    this.lg0[n2 + 2 + (i + 2) * 5] = f;
                                    if (n == 0) {
                                        if (n == 0) continue;
                                        break;
                                    }
                                    break block9;
                                }
                                catch (oov oov2) {
                                    throw eiu.a(oov2);
                                }
                            }
                            ++n2;
                        }
                        if (n == 0) continue;
                    }
                    try {
                        try {
                            if (string == null) break block10;
                            this.wo4 = y_h$xfc.a2n(string).dnk();
                            eiu eiu2 = this;
                            if (!this.wo4.jr9) break block11;
                        }
                        catch (oov oov3) {
                            throw eiu.a(oov3);
                        }
                        es22 = ox_.ska;
                        break block12;
                    }
                    catch (oov oov4) {
                        throw eiu.a(oov4);
                    }
                }
                es22 = ox_.gdz;
            }
            eiu2.i4t = es22;
            t9d2.g5c(this.wo4.zei);
        }
    }

    public void ju3(int n, int n2, lno lno2) {
        this.y4o = this.b01.ql0().f8i(this.y4o, n * 4 - 2, n2 * 4 - 2, 10, 10);
        int n3 = t9d.c();
        this.hbt(n * 4, 0, n2 * 4);
        int n4 = 0;
        int n5 = n3;
        block8: while (true) {
            int n6 = n4;
            block9: while (n6 < 4) {
                int n7 = n4 * 5;
                int n8 = (n4 + 1) * 5;
                int n9 = 0;
                block10: while (true) {
                    int n10 = n9;
                    block11: while (n10 < 4) {
                        int n11 = (n7 + n9) * 33;
                        int n12 = (n7 + n9 + 1) * 33;
                        int n13 = (n8 + n9) * 33;
                        int n14 = (n8 + n9 + 1) * 33;
                        n6 = 0;
                        if (n5 != 0) continue block9;
                        int n15 = n6;
                        block12: while (true) {
                            int n16 = n15;
                            block13: while (n16 < 32) {
                                double d = 0.125;
                                double d2 = this.xje[n11 + n15];
                                double d3 = this.xje[n12 + n15];
                                double d4 = this.xje[n13 + n15];
                                double d5 = this.xje[n14 + n15];
                                double d6 = (this.xje[n11 + n15 + 1] - d2) * d;
                                double d7 = (this.xje[n12 + n15 + 1] - d3) * d;
                                double d8 = (this.xje[n13 + n15 + 1] - d4) * d;
                                double d9 = (this.xje[n14 + n15 + 1] - d5) * d;
                                n10 = 0;
                                if (n5 != 0) continue block11;
                                int n17 = n10;
                                block14: while (true) {
                                    int n18 = n17;
                                    block15: while (n18 < 8) {
                                        double d10 = 0.25;
                                        double d11 = d2;
                                        double d12 = d3;
                                        double d13 = (d4 - d2) * d10;
                                        double d14 = (d5 - d3) * d10;
                                        n16 = 0;
                                        if (n5 != 0) continue block13;
                                        int n19 = n16;
                                        block16: while (true) {
                                            int n20 = n19;
                                            block17: while (n20 < 4) {
                                                double d15 = 0.25;
                                                double d16 = (d12 - d11) * d15;
                                                double d17 = d11 - d16;
                                                n18 = 0;
                                                if (n5 != 0) continue block15;
                                                for (int i = v1319657; i < 4; ++i) {
                                                    int n21;
                                                    block19: {
                                                        double d18 = (d17 += d16) - 0.0;
                                                        n20 = d18 == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                                                        if (n5 != 0) continue block17;
                                                        try {
                                                            block20: {
                                                                try {
                                                                    try {
                                                                        if (n5 != 0) break block19;
                                                                        if (n20 <= 0) break block20;
                                                                    }
                                                                    catch (oov oov2) {
                                                                        throw eiu.a(oov2);
                                                                    }
                                                                    lno2.x6f(n4 * 4 + n19, n15 * 8 + n17, n9 * 4 + i, ox_.pu8.l4i());
                                                                    if (n5 == 0) continue;
                                                                }
                                                                catch (oov oov3) {
                                                                    throw eiu.a(oov3);
                                                                }
                                                            }
                                                            n21 = n15 * 8 + n17;
                                                        }
                                                        catch (oov oov4) {
                                                            throw eiu.a(oov4);
                                                        }
                                                    }
                                                    try {
                                                        if (n21 >= this.wo4.zei) continue;
                                                        lno2.x6f(n4 * 4 + n19, n15 * 8 + n17, n9 * 4 + i, this.i4t.l4i());
                                                        continue;
                                                    }
                                                    catch (oov oov5) {
                                                        throw eiu.a(oov5);
                                                    }
                                                }
                                                d11 += d13;
                                                d12 += d14;
                                                ++n19;
                                                if (n5 == 0) continue block16;
                                            }
                                            break;
                                        }
                                        d2 += d6;
                                        d3 += d7;
                                        d4 += d8;
                                        d5 += d9;
                                        ++n17;
                                        if (n5 == 0) continue block14;
                                    }
                                    break;
                                }
                                ++n15;
                                if (n5 == 0) continue block12;
                            }
                            break;
                        }
                        ++n9;
                        if (n5 == 0) continue block10;
                    }
                    break;
                }
                ++n4;
                if (n5 == 0) continue block8;
            }
            break;
        }
    }

    public void vgd(int n, int n2, lno lno2, gyu[] gyuArray) {
        double d = 0.03125;
        this.ego = this.s9t.w76(this.ego, n * 16, n2 * 16, 16, 16, d * 2.0, d * 2.0, 1.0);
        int n3 = 0;
        int n4 = t9d.b();
        while (n3 < 16) {
            block5: {
                for (int i = 0; i < 16; ++i) {
                    gyu gyu2 = gyuArray[i + n3 * 16];
                    try {
                        gyu2.rci(this.b01, this.kz7, lno2, n * 16 + n3, n2 * 16 + i, this.ego[i + n3 * 16]);
                        if (n4 != 0) {
                            if (n4 != 0) continue;
                            break;
                        }
                        break block5;
                    }
                    catch (oov oov2) {
                        throw eiu.a(oov2);
                    }
                }
                ++n3;
            }
            if (n4 != 0) continue;
        }
    }

    @Override
    public tts et2(int n, int n2) {
        tts tts2;
        block69: {
            int n3;
            lno lno2;
            block67: {
                eiu eiu2;
                block68: {
                    boolean bl;
                    block66: {
                        block64: {
                            block65: {
                                block62: {
                                    block63: {
                                        block60: {
                                            block61: {
                                                block58: {
                                                    block59: {
                                                        block56: {
                                                            block57: {
                                                                block54: {
                                                                    block55: {
                                                                        this.kz7.setSeed((long)n * 341873128712L + (long)n2 * 132897987541L);
                                                                        lno2 = new lno();
                                                                        n3 = t9d.c();
                                                                        try {
                                                                            try {
                                                                                this.ju3(n, n2, lno2);
                                                                                this.y4o = this.b01.ql0().twf(this.y4o, n * 16, n2 * 16, 16, 16);
                                                                                this.vgd(n, n2, lno2, this.y4o);
                                                                                bl = this.wo4.wgt;
                                                                                if (n3 != 0) break block54;
                                                                                if (!bl) break block55;
                                                                            }
                                                                            catch (oov oov2) {
                                                                                throw eiu.a(oov2);
                                                                            }
                                                                            this.yqm.vyh(this, this.b01, n, n2, lno2);
                                                                        }
                                                                        catch (oov oov3) {
                                                                            throw eiu.a(oov3);
                                                                        }
                                                                    }
                                                                    bl = this.wo4.fji;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (n3 != 0) break block56;
                                                                        if (!bl) break block57;
                                                                    }
                                                                    catch (oov oov4) {
                                                                        throw eiu.a(oov4);
                                                                    }
                                                                    this.w8s.vyh(this, this.b01, n, n2, lno2);
                                                                }
                                                                catch (oov oov5) {
                                                                    throw eiu.a(oov5);
                                                                }
                                                            }
                                                            bl = this.wo4.q1e;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (n3 != 0) break block58;
                                                                        if (!bl) break block59;
                                                                    }
                                                                    catch (oov oov6) {
                                                                        throw eiu.a(oov6);
                                                                    }
                                                                    bl = this.xjr;
                                                                    if (n3 != 0) break block58;
                                                                }
                                                                catch (oov oov7) {
                                                                    throw eiu.a(oov7);
                                                                }
                                                                if (!bl) break block59;
                                                            }
                                                            catch (oov oov8) {
                                                                throw eiu.a(oov8);
                                                            }
                                                            this.hj_.vyh(this, this.b01, n, n2, lno2);
                                                        }
                                                        catch (oov oov9) {
                                                            throw eiu.a(oov9);
                                                        }
                                                    }
                                                    bl = this.wo4.cc4;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n3 != 0) break block60;
                                                                if (!bl) break block61;
                                                            }
                                                            catch (oov oov10) {
                                                                throw eiu.a(oov10);
                                                            }
                                                            bl = this.xjr;
                                                            if (n3 != 0) break block60;
                                                        }
                                                        catch (oov oov11) {
                                                            throw eiu.a(oov11);
                                                        }
                                                        if (!bl) break block61;
                                                    }
                                                    catch (oov oov12) {
                                                        throw eiu.a(oov12);
                                                    }
                                                    this.s9l.vyh(this, this.b01, n, n2, lno2);
                                                }
                                                catch (oov oov13) {
                                                    throw eiu.a(oov13);
                                                }
                                            }
                                            bl = this.wo4.x3e;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n3 != 0) break block62;
                                                        if (!bl) break block63;
                                                    }
                                                    catch (oov oov14) {
                                                        throw eiu.a(oov14);
                                                    }
                                                    bl = this.xjr;
                                                    if (n3 != 0) break block62;
                                                }
                                                catch (oov oov15) {
                                                    throw eiu.a(oov15);
                                                }
                                                if (!bl) break block63;
                                            }
                                            catch (oov oov16) {
                                                throw eiu.a(oov16);
                                            }
                                            this.a7k.vyh(this, this.b01, n, n2, lno2);
                                        }
                                        catch (oov oov17) {
                                            throw eiu.a(oov17);
                                        }
                                    }
                                    bl = this.wo4._27;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n3 != 0) break block64;
                                                if (!bl) break block65;
                                            }
                                            catch (oov oov18) {
                                                throw eiu.a(oov18);
                                            }
                                            bl = this.xjr;
                                            if (n3 != 0) break block64;
                                        }
                                        catch (oov oov19) {
                                            throw eiu.a(oov19);
                                        }
                                        if (!bl) break block65;
                                    }
                                    catch (oov oov20) {
                                        throw eiu.a(oov20);
                                    }
                                    this.h02.vyh(this, this.b01, n, n2, lno2);
                                }
                                catch (oov oov21) {
                                    throw eiu.a(oov21);
                                }
                            }
                            bl = this.wo4.s3x;
                        }
                        try {
                            try {
                                try {
                                    if (n3 != 0) break block66;
                                    if (!bl) break block67;
                                }
                                catch (oov oov22) {
                                    throw eiu.a(oov22);
                                }
                                eiu2 = this;
                                if (n3 != 0) break block68;
                            }
                            catch (oov oov23) {
                                throw eiu.a(oov23);
                            }
                            bl = eiu2.xjr;
                        }
                        catch (oov oov24) {
                            throw eiu.a(oov24);
                        }
                    }
                    if (!bl) break block67;
                    eiu2 = this;
                }
                eiu2.lq4.vyh(this, this.b01, n, n2, lno2);
            }
            tts2 = new tts(this.b01, lno2, n, n2);
            byte[] byArray = tts2.xtk();
            for (int i = 0; i < byArray.length; ++i) {
                try {
                    byArray[i] = (byte)this.y4o[i].mu9;
                    if (n3 == 0) {
                        if (n3 == 0) continue;
                        break;
                    }
                    break block69;
                }
                catch (oov oov25) {
                    throw eiu.a(oov25);
                }
            }
            tts2.vm4();
        }
        return tts2;
    }

    /*
     * Unable to fully structure code
     */
    private void hbt(int var1_1, int var2_2, int var3_3) {
        this.krp = this.ikb.svg(this.krp, var1_1, var3_3, 5, 5, this.wo4.h8s, this.wo4.nef, this.wo4.cvl);
        var5_4 = this.wo4.ls8;
        var6_5 = this.wo4.hxu;
        this.fgk = this.cm_.w4w(this.fgk, var1_1, var2_2, var3_3, 5, 33, 5, var5_4 / this.wo4.pr7, var6_5 / this.wo4.tkz, var5_4 / this.wo4.tzr);
        this.y9v = this.f1g.w4w(this.y9v, var1_1, var2_2, var3_3, 5, 33, 5, var5_4, var6_5, var5_4);
        this.fzc = this.vai.w4w(this.fzc, var1_1, var2_2, var3_3, 5, 33, 5, var5_4, var6_5, var5_4);
        var3_3 = 0;
        var1_1 = 0;
        var7_6 = 0;
        var8_7 = 0;
        var4_8 = t9d.b();
        var9_9 = 0;
        block24: while (true) {
            v0 = var9_9;
            block25: while (v0 < 5) {
                var10_10 = 0;
                block26: while (true) {
                    v1 = var10_10;
                    block27: while (v1 < 5) {
                        block45: {
                            block46: {
                                block42: {
                                    block43: {
                                        block44: {
                                            block40: {
                                                block41: {
                                                    block34: {
                                                        var11_11 = 0.0f;
                                                        var12_12 = 0.0f;
                                                        var13_13 = 0.0f;
                                                        var14_14 = 2;
                                                        var15_15 = this.y4o[var9_9 + 2 + (var10_10 + 2) * 10];
                                                        v0 = -var14_14;
                                                        if (var4_8 == 0) continue block25;
                                                        for (var16_16 = v1320218; var16_16 <= var14_14; ++var16_16) {
                                                            v1 = -var14_14;
                                                            if (var4_8 == 0) continue block27;
                                                            for (var17_18 = v1320221; var17_18 <= var14_14; ++var17_18) {
                                                                block38: {
                                                                    block39: {
                                                                        block37: {
                                                                            block35: {
                                                                                block36: {
                                                                                    var18_19 = this.y4o[var9_9 + var16_16 + 2 + (var10_10 + var17_18 + 2) * 10];
                                                                                    var19_21 = this.wo4.jvi + var18_19.f6x * this.wo4.v3k;
                                                                                    var20_22 = this.wo4.nl1 + var18_19.yeh * this.wo4.ef8;
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    v2 = this;
                                                                                                    if (var4_8 == 0) break block34;
                                                                                                    if (var4_8 == 0) break block35;
                                                                                                }
                                                                                                catch (oov v3) {
                                                                                                    throw eiu.a(v3);
                                                                                                }
                                                                                                if (v2.jl5 != gxq._12) break block36;
                                                                                            }
                                                                                            catch (oov v4) {
                                                                                                throw eiu.a(v4);
                                                                                            }
                                                                                            v5 = var19_21;
                                                                                            v6 = 0.0f;
                                                                                            if (var4_8 == 0) break block37;
                                                                                        }
                                                                                        catch (oov v7) {
                                                                                            throw eiu.a(v7);
                                                                                        }
                                                                                        if (!(v5 > v6)) break block36;
                                                                                    }
                                                                                    catch (oov v8) {
                                                                                        throw eiu.a(v8);
                                                                                    }
                                                                                    var19_21 = 1.0f + var19_21 * 2.0f;
                                                                                    var20_22 = 1.0f + var20_22 * 4.0f;
                                                                                }
                                                                                v9 = this;
                                                                            }
                                                                            v5 = v9.lg0[var16_16 + 2 + (var17_18 + 2) * 5];
                                                                            v6 = var19_21 + 2.0f;
                                                                        }
                                                                        var21_24 = v5 / v6;
                                                                        try {
                                                                            v10 = var18_19.f6x;
                                                                            v11 = var15_15.f6x;
                                                                            if (var4_8 == 0) break block38;
                                                                            if (!(v10 > v11)) break block39;
                                                                        }
                                                                        catch (oov v12) {
                                                                            throw eiu.a(v12);
                                                                        }
                                                                        var21_24 /= 2.0f;
                                                                    }
                                                                    var11_11 += var20_22 * var21_24;
                                                                    var12_12 += var19_21 * var21_24;
                                                                    v10 = var13_13;
                                                                    v11 = var21_24;
                                                                }
                                                                var13_13 = v10 + v11;
                                                                if (var4_8 != 0) continue;
                                                            }
                                                            if (var4_8 != 0) continue;
                                                        }
                                                        var11_11 /= var13_13;
                                                        var12_12 /= var13_13;
                                                        var11_11 = var11_11 * 0.9f + 0.1f;
                                                        var12_12 = (var12_12 * 4.0f - 1.0f) / 8.0f;
                                                        v2 = this;
                                                    }
                                                    var16_17 = v2.krp[var8_7] / 8000.0;
                                                    try {
                                                        cfr_temp_0 = var16_17 - 0.0;
                                                        v13 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                        if (var4_8 == 0) break block40;
                                                        if (v13 >= 0) break block41;
                                                    }
                                                    catch (oov v14) {
                                                        throw eiu.a(v14);
                                                    }
                                                    var16_17 = -var16_17 * 0.3;
                                                }
                                                var16_17 = var16_17 * 3.0 - 2.0;
                                                cfr_temp_1 = var16_17 - 0.0;
                                                v13 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                            }
                                            try {
                                                if (var4_8 == 0) break block42;
                                                if (v13 < 0) {
                                                }
                                                ** GOTO lbl136
                                            }
                                            catch (oov v15) {
                                                throw eiu.a(v15);
                                            }
                                            var16_17 /= 2.0;
                                            try {
                                                v16 = var16_17;
                                                v17 = -1.0;
                                                if (var4_8 == 0) break block43;
                                                if (!(v16 < v17)) break block44;
                                            }
                                            catch (oov v18) {
                                                throw eiu.a(v18);
                                            }
                                            var16_17 = -1.0;
                                        }
                                        v16 = var16_17 /= 1.4;
                                        v17 = 2.0;
                                    }
                                    var16_17 = v16 / v17;
                                    try {
                                        try {
                                            if (var4_8 != 0) break block45;
lbl136:
                                            // 2 sources

                                            v19 = var16_17;
                                            v20 = 1.0;
                                            if (var4_8 == 0) break block46;
                                        }
                                        catch (oov v21) {
                                            throw eiu.a(v21);
                                        }
                                        cfr_temp_2 = v19 - v20;
                                        v13 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                    }
                                    catch (oov v22) {
                                        throw eiu.a(v22);
                                    }
                                }
                                if (v13 > 0) {
                                    var16_17 = 1.0;
                                }
                                v19 = var16_17;
                                v20 = 8.0;
                            }
                            var16_17 = v19 / v20;
                        }
                        ++var8_7;
                        var18_20 = var12_12;
                        var20_23 = var11_11;
                        var18_20 += var16_17 * 0.2;
                        var18_20 = var18_20 * (double)this.wo4.fy6 / 8.0;
                        var22_25 = (double)this.wo4.fy6 + var18_20 * 4.0;
                        var24_26 = 0;
                        while (var24_26 < 33) {
                            block48: {
                                block49: {
                                    block47: {
                                        var25_27 = ((double)var24_26 - var22_25) * (double)this.wo4.gby * 128.0 / 256.0 / var20_23;
                                        try {
                                            v23 = var25_27;
                                            v24 = 0.0;
                                            if (var4_8 == 0) break block47;
                                            cfr_temp_3 = v23 - v24;
                                            v1 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                            if (var4_8 == 0) continue block27;
                                        }
                                        catch (oov v25) {
                                            throw eiu.a(v25);
                                        }
                                        if (v1 < 0) {
                                            var25_27 *= 4.0;
                                        }
                                        v23 = this.y9v[var7_6];
                                        v24 = this.wo4.aiq;
                                    }
                                    var27_28 = v23 / v24;
                                    var29_29 = this.fzc[var7_6] / (double)this.wo4.uz7;
                                    var31_30 = (this.fgk[var7_6] / 10.0 + 1.0) / 2.0;
                                    var33_31 = fe6.ldq(var27_28, var29_29, var31_30) - var25_27;
                                    try {
                                        if (var4_8 == 0) break block48;
                                        if (var24_26 <= 29) break block49;
                                    }
                                    catch (oov v26) {
                                        throw eiu.a(v26);
                                    }
                                    var35_32 = (float)(var24_26 - 29) / 3.0f;
                                    var33_31 = var33_31 * (1.0 - var35_32) + -10.0 * var35_32;
                                }
                                this.xje[var7_6] = var33_31;
                                ++var7_6;
                                ++var24_26;
                            }
                            if (var4_8 != 0) continue;
                        }
                        ++var10_10;
                        if (var4_8 != 0) continue block26;
                    }
                    break;
                }
                ++var9_9;
                if (var4_8 != 0) continue block24;
            }
            break;
        }
    }

    @Override
    public boolean pnt(int n, int n2) {
        return true;
    }

    @Override
    public void fbq(g6k g6k2, int n, int n2) {
        int n3;
        block106: {
            int n4;
            int n5;
            int n6;
            int n7;
            mew mew2;
            block103: {
                block105: {
                    gyu gyu2;
                    int n8;
                    int n9;
                    block104: {
                        int n10;
                        block100: {
                            block101: {
                                block99: {
                                    int n11;
                                    block98: {
                                        gyu gyu3;
                                        gyu gyu4;
                                        block97: {
                                            block96: {
                                                boolean bl;
                                                h2f h2f2;
                                                block95: {
                                                    block93: {
                                                        block94: {
                                                            block91: {
                                                                block92: {
                                                                    block89: {
                                                                        block90: {
                                                                            block87: {
                                                                                block88: {
                                                                                    d26.trk = true;
                                                                                    n9 = n * 16;
                                                                                    int n12 = t9d.b();
                                                                                    n8 = n2 * 16;
                                                                                    mew2 = new mew(n9, 0, n8);
                                                                                    gyu2 = this.b01.getBiomeGenForCoords(mew2.ec4(16, 0, 16));
                                                                                    this.kz7.setSeed(this.b01.x2p());
                                                                                    n7 = n12;
                                                                                    long l = this.kz7.nextLong() / 2L * 2L + 1L;
                                                                                    long l2 = this.kz7.nextLong() / 2L * 2L + 1L;
                                                                                    this.kz7.setSeed((long)n * l + (long)n2 * l2 ^ this.b01.x2p());
                                                                                    n11 = 0;
                                                                                    h2f2 = new h2f(n, n2);
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    bl = this.wo4.q1e;
                                                                                                    if (n7 == 0) break block87;
                                                                                                    if (!bl) break block88;
                                                                                                }
                                                                                                catch (oov oov2) {
                                                                                                    throw eiu.a(oov2);
                                                                                                }
                                                                                                bl = this.xjr;
                                                                                                if (n7 == 0) break block87;
                                                                                            }
                                                                                            catch (oov oov3) {
                                                                                                throw eiu.a(oov3);
                                                                                            }
                                                                                            if (!bl) break block88;
                                                                                        }
                                                                                        catch (oov oov4) {
                                                                                            throw eiu.a(oov4);
                                                                                        }
                                                                                        this.hj_.vd1(this.b01, this.kz7, h2f2);
                                                                                    }
                                                                                    catch (oov oov5) {
                                                                                        throw eiu.a(oov5);
                                                                                    }
                                                                                }
                                                                                bl = this.wo4.cc4;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (n7 == 0) break block89;
                                                                                        if (!bl) break block90;
                                                                                    }
                                                                                    catch (oov oov6) {
                                                                                        throw eiu.a(oov6);
                                                                                    }
                                                                                    bl = this.xjr;
                                                                                    if (n7 == 0) break block89;
                                                                                }
                                                                                catch (oov oov7) {
                                                                                    throw eiu.a(oov7);
                                                                                }
                                                                                if (!bl) break block90;
                                                                            }
                                                                            catch (oov oov8) {
                                                                                throw eiu.a(oov8);
                                                                            }
                                                                            n11 = this.s9l.vd1(this.b01, this.kz7, h2f2);
                                                                        }
                                                                        bl = this.wo4.x3e;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (n7 == 0) break block91;
                                                                                    if (!bl) break block92;
                                                                                }
                                                                                catch (oov oov9) {
                                                                                    throw eiu.a(oov9);
                                                                                }
                                                                                bl = this.xjr;
                                                                                if (n7 == 0) break block91;
                                                                            }
                                                                            catch (oov oov10) {
                                                                                throw eiu.a(oov10);
                                                                            }
                                                                            if (!bl) break block92;
                                                                        }
                                                                        catch (oov oov11) {
                                                                            throw eiu.a(oov11);
                                                                        }
                                                                        this.a7k.vd1(this.b01, this.kz7, h2f2);
                                                                    }
                                                                    catch (oov oov12) {
                                                                        throw eiu.a(oov12);
                                                                    }
                                                                }
                                                                bl = this.wo4._27;
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (n7 == 0) break block93;
                                                                            if (!bl) break block94;
                                                                        }
                                                                        catch (oov oov13) {
                                                                            throw eiu.a(oov13);
                                                                        }
                                                                        bl = this.xjr;
                                                                        if (n7 == 0) break block93;
                                                                    }
                                                                    catch (oov oov14) {
                                                                        throw eiu.a(oov14);
                                                                    }
                                                                    if (!bl) break block94;
                                                                }
                                                                catch (oov oov15) {
                                                                    throw eiu.a(oov15);
                                                                }
                                                                this.h02.vd1(this.b01, this.kz7, h2f2);
                                                            }
                                                            catch (oov oov16) {
                                                                throw eiu.a(oov16);
                                                            }
                                                        }
                                                        bl = this.wo4.s3x;
                                                    }
                                                    try {
                                                        try {
                                                            if (n7 == 0) break block95;
                                                            if (!bl) break block96;
                                                        }
                                                        catch (oov oov17) {
                                                            throw eiu.a(oov17);
                                                        }
                                                        bl = this.xjr;
                                                    }
                                                    catch (oov oov18) {
                                                        throw eiu.a(oov18);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (n7 == 0 || !bl) break block96;
                                                    }
                                                    catch (oov oov19) {
                                                        throw eiu.a(oov19);
                                                    }
                                                    bl = this.lq4.vd1(this.b01, this.kz7, h2f2);
                                                }
                                                catch (oov oov20) {
                                                    throw eiu.a(oov20);
                                                }
                                            }
                                            try {
                                                try {
                                                    gyu gyu3 = gyu2;
                                                    gyu3 = gyu._cz;
                                                    if (n7 == 0) break block97;
                                                    if (gyu4 == gyu3) break block98;
                                                }
                                                catch (oov oov21) {
                                                    throw eiu.a(oov21);
                                                }
                                                gyu gyu3 = gyu2;
                                                gyu3 = gyu.txo;
                                            }
                                            catch (oov oov22) {
                                                throw eiu.a(oov22);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (gyu4 == gyu3) break block98;
                                                                n6 = this.wo4.g5x;
                                                                if (n7 == 0) break block99;
                                                            }
                                                            catch (oov oov23) {
                                                                throw eiu.a(oov23);
                                                            }
                                                            if (n6 == 0) break block98;
                                                        }
                                                        catch (oov oov24) {
                                                            throw eiu.a(oov24);
                                                        }
                                                        n6 = n11;
                                                        if (n7 == 0) break block99;
                                                    }
                                                    catch (oov oov25) {
                                                        throw eiu.a(oov25);
                                                    }
                                                    if (n6 != 0) break block98;
                                                }
                                                catch (oov oov26) {
                                                    throw eiu.a(oov26);
                                                }
                                                n6 = this.kz7.nextInt(this.wo4.gcv);
                                                if (n7 == 0) break block99;
                                            }
                                            catch (oov oov27) {
                                                throw eiu.a(oov27);
                                            }
                                            if (n6 != 0) break block98;
                                        }
                                        catch (oov oov28) {
                                            throw eiu.a(oov28);
                                        }
                                        n5 = this.kz7.nextInt(16) + 8;
                                        n4 = this.kz7.nextInt(256);
                                        n10 = this.kz7.nextInt(16) + 8;
                                        new h3g(ox_.gdz).v3g(this.b01, this.kz7, mew2.ec4(n5, n4, n10));
                                    }
                                    n6 = n11;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n7 == 0) break block100;
                                                    if (n6 != 0) break block101;
                                                }
                                                catch (oov oov29) {
                                                    throw eiu.a(oov29);
                                                }
                                                n6 = this.kz7.nextInt(this.wo4.aqa / 10);
                                                if (n7 == 0) break block100;
                                            }
                                            catch (oov oov30) {
                                                throw eiu.a(oov30);
                                            }
                                            if (n6 != 0) break block101;
                                        }
                                        catch (oov oov31) {
                                            throw eiu.a(oov31);
                                        }
                                        n6 = this.wo4.hwi ? 1 : 0;
                                        if (n7 == 0) break block100;
                                    }
                                    catch (oov oov32) {
                                        throw eiu.a(oov32);
                                    }
                                    if (n6 == 0) break block101;
                                }
                                catch (oov oov33) {
                                    throw eiu.a(oov33);
                                }
                                n5 = this.kz7.nextInt(16) + 8;
                                n4 = this.kz7.nextInt(this.kz7.nextInt(248) + 8);
                                n10 = this.kz7.nextInt(16) + 8;
                                try {
                                    int n13;
                                    block102: {
                                        try {
                                            try {
                                                try {
                                                    n13 = n4;
                                                    if (n7 == 0) break block101;
                                                    if (n13 < this.b01._s3()) break block102;
                                                }
                                                catch (oov oov34) {
                                                    throw eiu.a(oov34);
                                                }
                                                n6 = this.kz7.nextInt(this.wo4.aqa / 8);
                                                if (n7 == 0) break block100;
                                            }
                                            catch (oov oov35) {
                                                throw eiu.a(oov35);
                                            }
                                            if (n6 != 0) break block101;
                                        }
                                        catch (oov oov36) {
                                            throw eiu.a(oov36);
                                        }
                                    }
                                    n13 = new h3g(ox_.ska).v3g(this.b01, this.kz7, mew2.ec4(n5, n4, n10)) ? 1 : 0;
                                }
                                catch (oov oov37) {
                                    throw eiu.a(oov37);
                                }
                            }
                            n6 = this.wo4._ja;
                        }
                        try {
                            if (n7 == 0) break block103;
                            if (n6 == 0) break block104;
                        }
                        catch (oov oov38) {
                            throw eiu.a(oov38);
                        }
                        for (n5 = 0; n5 < this.wo4.mws; ++n5) {
                            n4 = this.kz7.nextInt(16) + 8;
                            n10 = this.kz7.nextInt(256);
                            int n14 = this.kz7.nextInt(16) + 8;
                            new zuh().v3g(this.b01, this.kz7, mew2.ec4(n4, n10, n14));
                            if (n7 != 0) {
                                if (n7 != 0) continue;
                            }
                            break block105;
                        }
                    }
                    gyu2.u0r(this.b01, this.kz7, new mew(n9, 0, n8));
                    v7y.zik(this.b01, gyu2, n9 + 8, n8 + 8, 16, 16, this.kz7);
                    mew2 = mew2.ec4(8, 0, 8);
                }
                n6 = 0;
            }
            n5 = n6;
            block83: while (true) {
                int n14 = n5;
                block84: while (n14 < 16) {
                    n3 = 0;
                    if (n7 == 0) break block106;
                    for (n4 = v1326097; n4 < 16; ++n4) {
                        boolean bl;
                        mew mew3;
                        block107: {
                            block108: {
                                mew3 = this.b01.k62(mew2.ec4(n5, 0, n4));
                                mew mew4 = mew3.eve();
                                n14 = this.b01.mjf(mew4) ? 1 : 0;
                                if (n7 == 0) continue block84;
                                try {
                                    try {
                                        if (n7 == 0) break block107;
                                        if (n14 == 0) break block108;
                                    }
                                    catch (oov oov39) {
                                        throw eiu.a(oov39);
                                    }
                                    this.b01.vct(mew4, ox_.f02.l4i(), 2);
                                }
                                catch (oov oov40) {
                                    throw eiu.a(oov40);
                                }
                            }
                            bl = this.b01.l2a(mew3, true);
                        }
                        try {
                            try {
                                if (n7 == 0 || !bl) continue;
                            }
                            catch (oov oov41) {
                                throw eiu.a(oov41);
                            }
                            bl = this.b01.vct(mew3, ox_.dxo.l4i(), 2);
                            continue;
                        }
                        catch (oov oov42) {
                            throw eiu.a(oov42);
                        }
                    }
                    ++n5;
                    if (n7 != 0) continue block83;
                }
                break;
            }
            n3 = 0;
        }
        d26.trk = n3;
    }

    @Override
    public boolean zzc(g6k g6k2, tts tts2, int n, int n2) {
        int n3;
        block10: {
            int n4;
            block11: {
                int n5 = t9d.b();
                n4 = 0;
                try {
                    try {
                        try {
                            try {
                                try {
                                    n3 = this.wo4.s3x;
                                    if (n5 == 0) break block10;
                                    if (n3 == 0) break block11;
                                }
                                catch (oov oov2) {
                                    throw eiu.a(oov2);
                                }
                                n3 = this.xjr;
                                if (n5 == 0) break block10;
                            }
                            catch (oov oov3) {
                                throw eiu.a(oov3);
                            }
                            if (n3 == 0) break block11;
                        }
                        catch (oov oov4) {
                            throw eiu.a(oov4);
                        }
                        long l = tts2.zuf() - 3600L;
                        n3 = l == 0L ? 0 : (l < 0L ? -1 : 1);
                        if (n5 == 0) break block10;
                    }
                    catch (oov oov5) {
                        throw eiu.a(oov5);
                    }
                    if (n3 >= 0) break block11;
                }
                catch (oov oov6) {
                    throw eiu.a(oov6);
                }
                n4 |= this.lq4.vd1(this.b01, this.kz7, new h2f(n, n2));
            }
            n3 = n4;
        }
        return n3 != 0;
    }

    @Override
    public boolean va4(boolean bl, sw6 sw62) {
        return true;
    }

    @Override
    public void hua() {
    }

    @Override
    public boolean p68() {
        return false;
    }

    @Override
    public boolean pj4() {
        return true;
    }

    @Override
    public String y2l() {
        long l = a ^ 0x330F9C64EF1FL;
        return eiu.a("h", (int)1257, (long)(0x11BDFE0B452085FAL ^ l));
    }

    @Override
    public List sbk(ek6 ek62, mew mew2) {
        gyu gyu2;
        block20: {
            StructureOceanMonument structureOceanMonument;
            block25: {
                boolean bl;
                block24: {
                    ek6 ek63;
                    ek6 ek64;
                    int n;
                    block21: {
                        block22: {
                            MapGenScatteredFeature mapGenScatteredFeature;
                            block23: {
                                n = t9d.b();
                                gyu2 = this.b01.getBiomeGenForCoords(mew2);
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (!this.xjr) break block20;
                                                    ek64 = ek62;
                                                    ek63 = ek6.ywn;
                                                    if (n == 0) break block21;
                                                }
                                                catch (oov oov2) {
                                                    throw eiu.a(oov2);
                                                }
                                                if (ek64 != ek63) break block22;
                                            }
                                            catch (oov oov3) {
                                                throw eiu.a(oov3);
                                            }
                                            mapGenScatteredFeature = this.h02;
                                            if (n == 0) break block23;
                                        }
                                        catch (oov oov4) {
                                            throw eiu.a(oov4);
                                        }
                                        if (!mapGenScatteredFeature.s28(mew2)) break block22;
                                    }
                                    catch (oov oov5) {
                                        throw eiu.a(oov5);
                                    }
                                    mapGenScatteredFeature = this.h02;
                                }
                                catch (oov oov6) {
                                    throw eiu.a(oov6);
                                }
                            }
                            return mapGenScatteredFeature.wyu();
                        }
                        ek64 = ek62;
                        ek63 = ek6.ywn;
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (ek64 != ek63) break block20;
                                    bl = this.wo4.s3x;
                                    if (n == 0) break block24;
                                }
                                catch (oov oov7) {
                                    throw eiu.a(oov7);
                                }
                                if (!bl) break block20;
                            }
                            catch (oov oov8) {
                                throw eiu.a(oov8);
                            }
                            structureOceanMonument = this.lq4;
                            if (n == 0) break block25;
                        }
                        catch (oov oov9) {
                            throw eiu.a(oov9);
                        }
                        bl = structureOceanMonument.g3m(this.b01, mew2);
                    }
                    catch (oov oov10) {
                        throw eiu.a(oov10);
                    }
                }
                try {
                    if (!bl) break block20;
                    structureOceanMonument = this.lq4;
                }
                catch (oov oov11) {
                    throw eiu.a(oov11);
                }
            }
            return structureOceanMonument.f8d();
        }
        return gyu2.gzj(ek62);
    }

    @Override
    public mew epl(t9d t9d2, String string, mew mew2) {
        mew mew3;
        block8: {
            block6: {
                MapGenStronghold mapGenStronghold;
                block7: {
                    long l = a ^ 0x2792B9D7D1C8L;
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                if (!((String)((Object)eiu.a("h", (int)21325, (long)(0x603BA64833B46C88L ^ l)))).equals(string)) break block6;
                                mapGenStronghold = this.a7k;
                                if (n != 0) break block7;
                            }
                            catch (oov oov2) {
                                throw eiu.a(oov2);
                            }
                            if (mapGenStronghold == null) break block6;
                        }
                        catch (oov oov3) {
                            throw eiu.a(oov3);
                        }
                        mapGenStronghold = this.a7k;
                    }
                    catch (oov oov4) {
                        throw eiu.a(oov4);
                    }
                }
                mew3 = mapGenStronghold.p3b(t9d2, mew2);
                break block8;
            }
            mew3 = null;
        }
        return mew3;
    }

    @Override
    public int gkt() {
        return 0;
    }

    @Override
    public void nw5(tts tts2, int n, int n2) {
        block49: {
            eiu eiu2;
            block50: {
                boolean bl;
                block48: {
                    int n3;
                    block46: {
                        block47: {
                            block44: {
                                block45: {
                                    block42: {
                                        block43: {
                                            block40: {
                                                block41: {
                                                    n3 = t9d.c();
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    bl = this.wo4.q1e;
                                                                    if (n3 != 0) break block40;
                                                                    if (!bl) break block41;
                                                                }
                                                                catch (oov oov2) {
                                                                    throw eiu.a(oov2);
                                                                }
                                                                bl = this.xjr;
                                                                if (n3 != 0) break block40;
                                                            }
                                                            catch (oov oov3) {
                                                                throw eiu.a(oov3);
                                                            }
                                                            if (!bl) break block41;
                                                        }
                                                        catch (oov oov4) {
                                                            throw eiu.a(oov4);
                                                        }
                                                        this.hj_.vyh(this, this.b01, n, n2, null);
                                                    }
                                                    catch (oov oov5) {
                                                        throw eiu.a(oov5);
                                                    }
                                                }
                                                bl = this.wo4.cc4;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n3 != 0) break block42;
                                                            if (!bl) break block43;
                                                        }
                                                        catch (oov oov6) {
                                                            throw eiu.a(oov6);
                                                        }
                                                        bl = this.xjr;
                                                        if (n3 != 0) break block42;
                                                    }
                                                    catch (oov oov7) {
                                                        throw eiu.a(oov7);
                                                    }
                                                    if (!bl) break block43;
                                                }
                                                catch (oov oov8) {
                                                    throw eiu.a(oov8);
                                                }
                                                this.s9l.vyh(this, this.b01, n, n2, null);
                                            }
                                            catch (oov oov9) {
                                                throw eiu.a(oov9);
                                            }
                                        }
                                        bl = this.wo4.x3e;
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n3 != 0) break block44;
                                                    if (!bl) break block45;
                                                }
                                                catch (oov oov10) {
                                                    throw eiu.a(oov10);
                                                }
                                                bl = this.xjr;
                                                if (n3 != 0) break block44;
                                            }
                                            catch (oov oov11) {
                                                throw eiu.a(oov11);
                                            }
                                            if (!bl) break block45;
                                        }
                                        catch (oov oov12) {
                                            throw eiu.a(oov12);
                                        }
                                        this.a7k.vyh(this, this.b01, n, n2, null);
                                    }
                                    catch (oov oov13) {
                                        throw eiu.a(oov13);
                                    }
                                }
                                bl = this.wo4._27;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (n3 != 0) break block46;
                                            if (!bl) break block47;
                                        }
                                        catch (oov oov14) {
                                            throw eiu.a(oov14);
                                        }
                                        bl = this.xjr;
                                        if (n3 != 0) break block46;
                                    }
                                    catch (oov oov15) {
                                        throw eiu.a(oov15);
                                    }
                                    if (!bl) break block47;
                                }
                                catch (oov oov16) {
                                    throw eiu.a(oov16);
                                }
                                this.h02.vyh(this, this.b01, n, n2, null);
                            }
                            catch (oov oov17) {
                                throw eiu.a(oov17);
                            }
                        }
                        bl = this.wo4.s3x;
                    }
                    try {
                        try {
                            try {
                                if (n3 != 0) break block48;
                                if (!bl) break block49;
                            }
                            catch (oov oov18) {
                                throw eiu.a(oov18);
                            }
                            eiu2 = this;
                            if (n3 != 0) break block50;
                        }
                        catch (oov oov19) {
                            throw eiu.a(oov19);
                        }
                        bl = eiu2.xjr;
                    }
                    catch (oov oov20) {
                        throw eiu.a(oov20);
                    }
                }
                if (!bl) break block49;
                eiu2 = this;
            }
            eiu2.lq4.vyh(this, this.b01, n, n2, null);
        }
    }

    @Override
    public tts iqa(mew mew2) {
        return this.et2(mew2.getX() >> 4, mew2.getZ() >> 4);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        d = new HashMap(13);
        long l = a ^ 0x35093DBF3AD3L;
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
        String string = "k}~B\u00b3T\u00d5\u00d0\u0085\u008cW\u00b1\u00daK\u001f\u00c6B\u00cb\u00ccO\u00a4\u00b8\u00e0&\u009by\u00d4\u008e(\u001c.\u00bf(X\u00e6/\u0005\u00faZ\u00ccI%\u00da\u0085?\t.\u00a4xA}xAF\u00d3h\u0082\u00fc\u00d7C\u00e2 \u00c5\u00a1\u009a\u001fO\u00cc#%\u001a\u0006}";
        int n2 = "k}~B\u00b3T\u00d5\u00d0\u0085\u008cW\u00b1\u00daK\u001f\u00c6B\u00cb\u00ccO\u00a4\u00b8\u00e0&\u009by\u00d4\u008e(\u001c.\u00bf(X\u00e6/\u0005\u00faZ\u00ccI%\u00da\u0085?\t.\u00a4xA}xAF\u00d3h\u0082\u00fc\u00d7C\u00e2 \u00c5\u00a1\u009a\u001fO\u00cc#%\u001a\u0006}".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = eiu.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x553B;
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
                throw new RuntimeException("eiu", exception);
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
            eiu.c[n2] = eiu.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eiu.a(n, l);
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
            throw new RuntimeException("eiu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eiu.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

