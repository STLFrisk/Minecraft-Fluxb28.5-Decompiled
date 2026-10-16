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

public abstract class c5x
extends i2h {
    private /* synthetic */ int ucg;
    private /* synthetic */ int enf;
    private /* synthetic */ int yt8;
    private /* synthetic */ e0x lpk;
    private /* synthetic */ boolean o_s;
    public g_3 gen;
    private /* synthetic */ int fjc;
    private /* synthetic */ int sby;
    public double ax4;
    public double mjx;
    public double ehh;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map g;

    public c5x(t9d t9d2) {
        super(t9d2);
        this.ucg = -1;
        this.enf = -1;
        this.yt8 = -1;
        this.yxc(1.0f, 1.0f);
    }

    @Override
    public void tbj() {
    }

    @Override
    public boolean xvv(double d) {
        boolean bl;
        block6: {
            block7: {
                int n;
                block4: {
                    double d2;
                    double d3;
                    block5: {
                        n = t9d.c();
                        d3 = this.aaw().liq() * 4.0;
                        try {
                            bl = Double.isNaN(d3);
                            if (n != 0) break block4;
                            if (!bl) break block5;
                        }
                        catch (oov oov2) {
                            throw c5x.a(oov2);
                        }
                        d3 = 4.0;
                    }
                    bl = (d2 = d - (d3 *= 64.0) * d3) == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                }
                try {
                    if (n != 0) break block6;
                    if (bl >= false) break block7;
                }
                catch (oov oov3) {
                    throw c5x.a(oov3);
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public c5x(t9d t9d2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(t9d2);
        this.ucg = -1;
        this.enf = -1;
        this.yt8 = -1;
        this.yxc(1.0f, 1.0f);
        this.x24(d, d2, d3, this.x5k, this.y2i);
        this.m6_(d, d2, d3);
        double d7 = fe6.dii(d4 * d4 + d5 * d5 + d6 * d6);
        this.ax4 = d4 / d7 * 0.1;
        this.mjx = d5 / d7 * 0.1;
        this.ehh = d6 / d7 * 0.1;
    }

    public c5x(t9d t9d2, g_3 g_32, double d, double d2, double d3) {
        super(t9d2);
        this.ucg = -1;
        this.enf = -1;
        this.yt8 = -1;
        this.gen = g_32;
        this.yxc(1.0f, 1.0f);
        this.x24(g_32.o2v, g_32.kfp, g_32.vbd, g_32.x5k, g_32.y2i);
        this.m6_(this.o2v, this.kfp, this.vbd);
        this.bw4 = 0.0;
        this.mop = 0.0;
        this.icv = 0.0;
        double d4 = fe6.dii((d += this.z2d.nextGaussian() * 0.4) * d + (d2 += this.z2d.nextGaussian() * 0.4) * d2 + (d3 += this.z2d.nextGaussian() * 0.4) * d3);
        this.ax4 = d / d4 * 0.1;
        this.mjx = d2 / d4 * 0.1;
        this.ehh = d3 / d4 * 0.1;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void xx_() {
        block116: {
            block94: {
                block115: {
                    block113: {
                        block114: {
                            block111: {
                                block110: {
                                    block109: {
                                        block103: {
                                            block101: {
                                                block100: {
                                                    block95: {
                                                        block96: {
                                                            block97: {
                                                                block99: {
                                                                    block98: {
                                                                        block91: {
                                                                            block92: {
                                                                                var1_1 = t9d.b();
                                                                                try {
                                                                                    block93: {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v0 = this.oay.v0f;
                                                                                                            if (var1_1 == 0) break block91;
                                                                                                            if (!v0) {
                                                                                                            }
                                                                                                            ** GOTO lbl49
                                                                                                        }
                                                                                                        catch (oov v1) {
                                                                                                            throw c5x.a(v1);
                                                                                                        }
                                                                                                        v2 = this;
                                                                                                        if (var1_1 == 0) break block92;
                                                                                                    }
                                                                                                    catch (oov v3) {
                                                                                                        throw c5x.a(v3);
                                                                                                    }
                                                                                                    if (v2.gen == null) break block93;
                                                                                                }
                                                                                                catch (oov v4) {
                                                                                                    throw c5x.a(v4);
                                                                                                }
                                                                                                v2 = this;
                                                                                                if (var1_1 == 0) break block94;
                                                                                            }
                                                                                            catch (oov v5) {
                                                                                                throw c5x.a(v5);
                                                                                            }
                                                                                            if (!v2.gen.ma9) {
                                                                                            }
                                                                                            ** GOTO lbl318
                                                                                        }
                                                                                        catch (oov v6) {
                                                                                            throw c5x.a(v6);
                                                                                        }
                                                                                    }
                                                                                    v2 = this;
                                                                                }
                                                                                catch (oov v7) {
                                                                                    throw c5x.a(v7);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var1_1 == 0) break block94;
                                                                                        if (v2.oay.xjm(new mew(this))) {
                                                                                        }
                                                                                        ** GOTO lbl318
                                                                                    }
                                                                                    catch (oov v8) {
                                                                                        throw c5x.a(v8);
                                                                                    }
lbl49:
                                                                                    // 2 sources

                                                                                    super.xx_();
                                                                                    this.k03(1);
                                                                                    v9 = this;
                                                                                    if (var1_1 == 0) break block95;
                                                                                }
                                                                                catch (oov v10) {
                                                                                    throw c5x.a(v10);
                                                                                }
                                                                                v0 = v9.o_s;
                                                                            }
                                                                            catch (oov v11) {
                                                                                throw c5x.a(v11);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (v0) {
                                                                                                v12 = this;
                                                                                                if (var1_1 == 0) break block96;
                                                                                            }
                                                                                            ** GOTO lbl109
                                                                                        }
                                                                                        catch (oov v13) {
                                                                                            throw c5x.a(v13);
                                                                                        }
                                                                                        if (v12.oay.getBlockState(new mew(this.ucg, this.enf, this.yt8)).r_y() != this.lpk) break block97;
                                                                                    }
                                                                                    catch (oov v14) {
                                                                                        throw c5x.a(v14);
                                                                                    }
                                                                                    ++this.fjc;
                                                                                    v15 = this;
                                                                                    if (var1_1 == 0) break block98;
                                                                                }
                                                                                catch (oov v16) {
                                                                                    throw c5x.a(v16);
                                                                                }
                                                                                if (v15.fjc != 600) break block99;
                                                                            }
                                                                            catch (oov v17) {
                                                                                throw c5x.a(v17);
                                                                            }
                                                                            v15 = this;
                                                                        }
                                                                        catch (oov v18) {
                                                                            throw c5x.a(v18);
                                                                        }
                                                                    }
                                                                    v15._kl();
                                                                }
                                                                return;
                                                            }
                                                            this.o_s = false;
                                                            this.icv *= (double)(this.z2d.nextFloat() * 0.2f);
                                                            this.mop *= (double)(this.z2d.nextFloat() * 0.2f);
                                                            this.bw4 *= (double)(this.z2d.nextFloat() * 0.2f);
                                                            this.fjc = 0;
                                                            v12 = this;
                                                        }
                                                        try {
                                                            v12.sby = 0;
                                                            if (var1_1 != 0) break block100;
lbl109:
                                                            // 2 sources

                                                            v9 = this;
                                                        }
                                                        catch (oov v19) {
                                                            throw c5x.a(v19);
                                                        }
                                                    }
                                                    ++v9.sby;
                                                }
                                                var2_2 = new fqr(this.o2v, this.kfp, this.vbd);
                                                var3_3 = new fqr(this.o2v + this.icv, this.kfp + this.mop, this.vbd + this.bw4);
                                                var4_4 = this.oay.caq(var2_2, var3_3);
                                                var2_2 = new fqr(this.o2v, this.kfp, this.vbd);
                                                v20 = new fqr(this.o2v + this.icv, this.kfp + this.mop, this.vbd + this.bw4);
                                                if (var1_1 != 0) {
                                                    var3_3 = v20;
                                                    try {
                                                        if (var4_4 == null) break block101;
                                                        v20 = new fqr(var4_4.jhn.lvi, var4_4.jhn.gn5, var4_4.jhn.bn2);
                                                    }
                                                    catch (oov v21) {
                                                        throw c5x.a(v21);
                                                    }
                                                }
                                                var3_3 = v20;
                                            }
                                            var5_5 = null;
                                            var6_6 = this.oay.p05(this, this.aaw().z9h(this.icv, this.mop, this.bw4).c2h(1.0, 1.0, 1.0));
                                            var7_7 = 0.0;
                                            var9_8 = 0;
                                            while (var9_8 < var6_6.size()) {
                                                block102: {
                                                    block104: {
                                                        block107: {
                                                            block108: {
                                                                block106: {
                                                                    block105: {
                                                                        var10_10 = (i2h)var6_6.get(var9_8);
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (var1_1 == 0) break block102;
                                                                                            v22 = var10_10;
                                                                                            if (var1_1 == 0) break block103;
                                                                                        }
                                                                                        catch (oov v23) {
                                                                                            throw c5x.a(v23);
                                                                                        }
                                                                                        if (!v22.mzu()) break block104;
                                                                                    }
                                                                                    catch (oov v24) {
                                                                                        throw c5x.a(v24);
                                                                                    }
                                                                                    v25 = var10_10.ipr(this.gen);
                                                                                    if (var1_1 == 0) break block105;
                                                                                }
                                                                                catch (oov v26) {
                                                                                    throw c5x.a(v26);
                                                                                }
                                                                                if (v25 == 0) break block106;
                                                                            }
                                                                            catch (oov v27) {
                                                                                throw c5x.a(v27);
                                                                            }
                                                                            v25 = this.sby;
                                                                        }
                                                                        catch (oov v28) {
                                                                            throw c5x.a(v28);
                                                                        }
                                                                    }
                                                                    if (v25 < 25) break block104;
                                                                }
                                                                var11_12 = 0.3f;
                                                                var12_14 = var10_10.aaw().c2h(var11_12, var11_12, var11_12);
                                                                var13_16 = var12_14.v35(var2_2, var3_3);
                                                                try {
                                                                    if (var1_1 == 0) break block102;
                                                                    if (var13_16 == null) break block104;
                                                                }
                                                                catch (oov v29) {
                                                                    throw c5x.a(v29);
                                                                }
                                                                var14_17 = var2_2.y8x(var13_16.jhn);
                                                                try {
                                                                    try {
                                                                        try {
                                                                            v30 = var14_17;
                                                                            if (var1_1 == 0) break block107;
                                                                            if (v30 < var7_7) break block108;
                                                                        }
                                                                        catch (oov v31) {
                                                                            throw c5x.a(v31);
                                                                        }
                                                                        v30 = var7_7;
                                                                        if (var1_1 == 0) break block107;
                                                                    }
                                                                    catch (oov v32) {
                                                                        throw c5x.a(v32);
                                                                    }
                                                                    if (v30 != 0.0) break block104;
                                                                }
                                                                catch (oov v33) {
                                                                    throw c5x.a(v33);
                                                                }
                                                            }
                                                            var5_5 = var10_10;
                                                            v30 = var14_17;
                                                        }
                                                        var7_7 = v30;
                                                    }
                                                    ++var9_8;
                                                }
                                                if (var1_1 != 0) continue;
                                            }
                                            v22 = var5_5;
                                        }
                                        if (v22 != null) {
                                            var4_4 = new akm(var5_5);
                                        }
                                        try {
                                            if (var4_4 != null) {
                                                this.f7x(var4_4);
                                            }
                                        }
                                        catch (oov v34) {
                                            throw c5x.a(v34);
                                        }
                                        this.o2v += this.icv;
                                        this.kfp += this.mop;
                                        this.vbd += this.bw4;
                                        var9_9 = fe6.dii(this.icv * this.icv + this.bw4 * this.bw4);
                                        this.x5k = (float)(fe6.yr8(this.bw4, this.icv) * 180.0 / 3.141592653589793) + 90.0f;
                                        this.y2i = (float)(fe6.yr8(var9_9, this.mop) * 180.0 / 3.141592653589793) - 90.0f;
                                        while (this.y2i - this.j25 < -180.0f) {
                                            try {
                                                this.j25 -= 360.0f;
                                                if (var1_1 != 0) {
                                                    if (var1_1 != 0) continue;
                                                    break;
                                                }
                                                break block109;
                                            }
                                            catch (oov v35) {
                                                throw c5x.a(v35);
                                            }
                                        }
                                        while (this.y2i - this.j25 >= 180.0f) {
                                            try {
                                                this.j25 += 360.0f;
                                                if (var1_1 != 0) {
                                                    if (var1_1 != 0) continue;
                                                    break;
                                                }
                                                break block110;
                                            }
                                            catch (oov v36) {
                                                throw c5x.a(v36);
                                            }
                                        }
                                    }
                                    try {
                                        do {
                                            try {
                                                if (!(this.x5k - this.p3h < -180.0f)) break;
                                                this.p3h -= 360.0f;
                                                if (var1_1 != 0) {
                                                    continue;
                                                }
                                                break block111;
                                            }
                                            catch (oov v37) {
                                                throw c5x.a(v37);
                                            }
                                        } while (var1_1 != 0);
                                    }
                                    catch (oov v38) {
                                        throw c5x.a(v38);
                                    }
                                }
                                try {
                                    do {
                                        try {
                                            if (!(this.x5k - this.p3h >= 180.0f)) break;
                                            this.p3h += 360.0f;
                                            if (var1_1 != 0) {
                                                continue;
                                            }
                                            break block111;
                                        }
                                        catch (oov v39) {
                                            throw c5x.a(v39);
                                        }
                                    } while (var1_1 != 0);
                                }
                                catch (oov v40) {
                                    throw c5x.a(v40);
                                }
                                this.y2i = this.j25 + (this.y2i - this.j25) * 0.2f;
                                this.x5k = this.p3h + (this.x5k - this.p3h) * 0.2f;
                            }
                            var10_11 = this.ew9();
                            try {
                                v41 = this;
                                if (var1_1 == 0) break block113;
                                if (!v41.mwv()) break block114;
                            }
                            catch (oov v42) {
                                throw c5x.a(v42);
                            }
                            for (var11_13 = 0; var11_13 < 4; ++var11_13) {
                                var12_15 = 0.25f;
                                try {
                                    this.oay.zvy(w_0.w_h, this.o2v - this.icv * (double)var12_15, this.kfp - this.mop * (double)var12_15, this.vbd - this.bw4 * (double)var12_15, this.icv, this.mop, this.bw4, new int[0]);
                                    if (var1_1 != 0) {
                                        if (var1_1 != 0) continue;
                                        break;
                                    }
                                    break block115;
                                }
                                catch (oov v43) {
                                    throw c5x.a(v43);
                                }
                            }
                            var10_11 = 0.8f;
                        }
                        this.icv += this.ax4;
                        this.mop += this.mjx;
                        this.bw4 += this.ehh;
                        this.icv *= (double)var10_11;
                        this.mop *= (double)var10_11;
                        this.bw4 *= (double)var10_11;
                        this.oay.zvy(w_0.bac, this.o2v, this.kfp + 0.5, this.vbd, 0.0, 0.0, 0.0, new int[0]);
                        v41 = this;
                    }
                    v41.m6_(this.o2v, this.kfp, this.vbd);
                }
                try {
                    if (var1_1 != 0) break block116;
lbl318:
                    // 3 sources

                    v2 = this;
                }
                catch (oov v44) {
                    throw c5x.a(v44);
                }
            }
            v2._kl();
        }
    }

    public float ew9() {
        return 0.95f;
    }

    public abstract void f7x(akm var1);

    @Override
    public void srs(bdo bdo2) {
        boolean bl;
        CallSite callSite;
        bdo bdo3;
        long l;
        block9: {
            block10: {
                String string;
                CallSite callSite2;
                bdo bdo4;
                int n;
                block8: {
                    gdz gdz2;
                    block6: {
                        gdz gdz3;
                        block7: {
                            l = b ^ 0x6E940CB8EA77L;
                            bdo2.ge7((String)((Object)c5x.b("s", (int)4452, (long)(0x56CADC5CCC0113A4L ^ l))), (short)this.ucg);
                            int n2 = t9d.c();
                            bdo2.ge7((String)((Object)c5x.b("s", (int)22956, (long)(0x5459BD0012375B61L ^ l))), (short)this.enf);
                            bdo2.ge7((String)((Object)c5x.b("s", (int)32222, (long)(0xEF0DA3308177F1CL ^ l))), (short)this.yt8);
                            gdz3 = (gdz)e0x.db8.csx(this.lpk);
                            n = n2;
                            try {
                                try {
                                    bdo4 = bdo2;
                                    callSite2 = c5x.b("s", (int)27332, (long)(0x3010D42B9A0CE80AL ^ l));
                                    gdz2 = gdz3;
                                    if (n != 0) break block6;
                                    if (gdz2 != null) break block7;
                                }
                                catch (oov oov2) {
                                    throw c5x.a(oov2);
                                }
                                string = "";
                                break block8;
                            }
                            catch (oov oov3) {
                                throw c5x.a(oov3);
                            }
                        }
                        gdz2 = gdz3;
                    }
                    string = gdz2.toString();
                }
                try {
                    bdo4.rjq((String)((Object)callSite2), string);
                    bdo3 = bdo2;
                    callSite = c5x.b("s", (int)17240, (long)(0x1BD8564EE2084199L ^ l));
                    bl = this.o_s;
                    if (n != 0) break block9;
                    if (!bl) break block10;
                }
                catch (oov oov4) {
                    throw c5x.a(oov4);
                }
                bl = true;
                break block9;
            }
            bl = false;
        }
        bdo3.atr((String)((Object)callSite), (byte)(bl ? 1 : 0));
        bdo2.rzm((String)((Object)c5x.b("s", (int)5519, (long)(0x4723D3748B241744L ^ l))), this.r0b(new double[]{this.icv, this.mop, this.bw4}));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void cjb(bdo var1_1) {
        block24: {
            block23: {
                block21: {
                    block22: {
                        block20: {
                            block18: {
                                var2_2 = c5x.b ^ 26638627079900L;
                                this.ucg = var1_1.hp9((String)c5x.b("s", (int)22383, (long)(4196198813113760014L ^ var2_2)));
                                this.enf = var1_1.hp9((String)c5x.b("s", (int)8700, (long)(2540349897617756062L ^ var2_2)));
                                var4_3 = t9d.b();
                                try {
                                    block19: {
                                        try {
                                            try {
                                                v0 = this;
                                                v1 = var1_1.hp9((String)c5x.b("s", (int)9438, (long)(7122964361655405242L ^ var2_2)));
                                                if (var4_3 == 0) break block18;
                                                v0.yt8 = v1;
                                                if (!var1_1.inh((String)c5x.b("s", (int)14857, (long)(1646843734233732206L ^ var2_2)), 8)) break block19;
                                            }
                                            catch (oov v2) {
                                                throw c5x.a(v2);
                                            }
                                            this.lpk = e0x.mdd(var1_1.u14((String)c5x.b("s", (int)27332, (long)(3463446809309054113L ^ var2_2))));
                                            if (var4_3 != 0) break block20;
                                        }
                                        catch (oov v3) {
                                            throw c5x.a(v3);
                                        }
                                    }
                                    v0 = this;
                                    v1 = var1_1.r_t((String)c5x.b("s", (int)27332, (long)(3463446809309054113L ^ var2_2))) & 255;
                                }
                                catch (oov v4) {
                                    throw c5x.a(v4);
                                }
                            }
                            v0.lpk = e0x.csc(v1);
                        }
                        try {
                            try {
                                v5 = this;
                                v6 = var1_1.r_t((String)c5x.b("s", (int)13992, (long)(8698899598331402443L ^ var2_2)));
                                if (var4_3 == 0) break block21;
                                if (v6 != 1) break block22;
                            }
                            catch (oov v7) {
                                throw c5x.a(v7);
                            }
                            v6 = 1;
                            break block21;
                        }
                        catch (oov v8) {
                            throw c5x.a(v8);
                        }
                    }
                    v6 = 0;
                }
                try {
                    try {
                        v5.o_s = v6;
                        v9 = var1_1;
                        v10 = c5x.b("s", (int)2932, (long)(4317401547121124636L ^ var2_2));
                        v11 = 9;
                        if (var4_3 == 0) break block23;
                        if (v9.inh((String)v10, v11)) {
                        }
                        ** GOTO lbl79
                    }
                    catch (oov v12) {
                        throw c5x.a(v12);
                    }
                    v9 = var1_1;
                    v10 = c5x.b("s", (int)5519, (long)(5126123160063409135L ^ var2_2));
                    v11 = 6;
                }
                catch (oov v13) {
                    throw c5x.a(v13);
                }
            }
            var5_4 = v9.bzb((String)v10, v11);
            try {
                this.icv = var5_4.ho9(0);
                this.mop = var5_4.ho9(1);
                this.bw4 = var5_4.ho9(2);
                if (var4_3 != 0) break block24;
lbl79:
                // 2 sources

                this._kl();
            }
            catch (oov v14) {
                throw c5x.a(v14);
            }
        }
    }

    @Override
    public boolean mzu() {
        return true;
    }

    @Override
    public float npl() {
        return 1.0f;
    }

    @Override
    public boolean m1t(ofh ofh2, float f) {
        block19: {
            boolean bl;
            block22: {
                block23: {
                    int n;
                    block21: {
                        block20: {
                            i2h i2h2;
                            block18: {
                                block16: {
                                    block17: {
                                        n = t9d.c();
                                        try {
                                            try {
                                                i2h2 = this;
                                                if (n != 0) break block16;
                                                if (!i2h2.nss(ofh2)) break block17;
                                            }
                                            catch (oov oov2) {
                                                throw c5x.a(oov2);
                                            }
                                            return false;
                                        }
                                        catch (oov oov3) {
                                            throw c5x.a(oov3);
                                        }
                                    }
                                    this.dxm();
                                    i2h2 = ofh2.nra();
                                }
                                try {
                                    try {
                                        if (n != 0) break block18;
                                        if (i2h2 == null) break block19;
                                    }
                                    catch (oov oov4) {
                                        throw c5x.a(oov4);
                                    }
                                    i2h2 = ofh2.nra();
                                }
                                catch (oov oov5) {
                                    throw c5x.a(oov5);
                                }
                            }
                            fqr fqr2 = i2h2.m77();
                            try {
                                try {
                                    if (n != 0) break block20;
                                    if (fqr2 == null) break block21;
                                }
                                catch (oov oov6) {
                                    throw c5x.a(oov6);
                                }
                                this.icv = fqr2.lvi;
                                this.mop = fqr2.gn5;
                                this.bw4 = fqr2.bn2;
                                this.ax4 = this.icv * 0.1;
                                this.mjx = this.mop * 0.1;
                            }
                            catch (oov oov7) {
                                throw c5x.a(oov7);
                            }
                        }
                        this.ehh = this.bw4 * 0.1;
                    }
                    try {
                        try {
                            bl = ofh2.nra() instanceof g_3;
                            if (n != 0) break block22;
                            if (!bl) break block23;
                        }
                        catch (oov oov8) {
                            throw c5x.a(oov8);
                        }
                        this.gen = (g_3)ofh2.nra();
                    }
                    catch (oov oov9) {
                        throw c5x.a(oov9);
                    }
                }
                bl = true;
            }
            return bl;
        }
        return false;
    }

    @Override
    public float xeu(float f) {
        return 1.0f;
    }

    @Override
    public int azk(float f) {
        return 0xF000F0;
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

                c5x.b = c.a(-9024854058376066209L, -4184930225308370652L, MethodHandles.lookup().lookupClass()).a(162949050867813L);
                c5x.g = new HashMap<K, V>(13);
                var0 = c5x.b ^ 79872169498502L;
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
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = "\u00bd\u0092\u0083\u0019\u0003W\u0093\\\u0097F|RM\u00a1\u009e\u00fc \u009c\"2\u00b9V\u0085\u00fc\u00e8\u00ba\u00ff.*\u000e\u00d9\u0014\u00ab\u00eaty%q\u00f3\u00a6`\u00a5\u0006\u00d7\u00f8\u0093\u00bb\u00d4P ~\u00e5\u00bde\u00b4\u00f3\u00a0\u00d2\u00b6bMN9\u00a7?\u00e8T*\u001a\u00ab\u00ec$hL\u0010bg\u00a7]zz\\\u0010\u0088\u00e1\u0003\u00a0\u0011\u009a\u00bf\u009e\u00c4_*\u00ee\u0013\u00de\u0005\u00d5\u0010v\u000f\u00edm\u00ed\n\b\u0087\u00f7\u00fc\u008a\u00c6\u00de\u00dddK\u00108\u00fd\u0005\u00a9\u0005\u00cb[A\u0015\u00cb1Q\u008a\u008aX\u00f6\u0010|\u00f1W\u00a3\u00cd\u0005C\u00d1\u001d\u00a5\\Jc\u00c9^\u000e\u0010[\u0019\u00c7)\u00b0\u00145q\u00c7X\u00e31\u00b4\u00ae\u00c9\u00a8 \u00cdz\u0081]\u0082\u00fd\u00ea\u00ac\u0099\u0005\u009f\u0085e\u00cf\u00df\u0015\u00ee\u00a9\u0015%\u00fb\u00be\u0087\u0000\u0006\u00fe>\u00c0\u00a3i\u00de\u0095\u0010j\u0091M\u00b6HK\u00f4\u00bb3\u00ab]\u00cf>D\u00c3\u00df";
                var8_6 = "\u00bd\u0092\u0083\u0019\u0003W\u0093\\\u0097F|RM\u00a1\u009e\u00fc \u009c\"2\u00b9V\u0085\u00fc\u00e8\u00ba\u00ff.*\u000e\u00d9\u0014\u00ab\u00eaty%q\u00f3\u00a6`\u00a5\u0006\u00d7\u00f8\u0093\u00bb\u00d4P ~\u00e5\u00bde\u00b4\u00f3\u00a0\u00d2\u00b6bMN9\u00a7?\u00e8T*\u001a\u00ab\u00ec$hL\u0010bg\u00a7]zz\\\u0010\u0088\u00e1\u0003\u00a0\u0011\u009a\u00bf\u009e\u00c4_*\u00ee\u0013\u00de\u0005\u00d5\u0010v\u000f\u00edm\u00ed\n\b\u0087\u00f7\u00fc\u008a\u00c6\u00de\u00dddK\u00108\u00fd\u0005\u00a9\u0005\u00cb[A\u0015\u00cb1Q\u008a\u008aX\u00f6\u0010|\u00f1W\u00a3\u00cd\u0005C\u00d1\u001d\u00a5\\Jc\u00c9^\u000e\u0010[\u0019\u00c7)\u00b0\u00145q\u00c7X\u00e31\u00b4\u00ae\u00c9\u00a8 \u00cdz\u0081]\u0082\u00fd\u00ea\u00ac\u0099\u0005\u009f\u0085e\u00cf\u00df\u0015\u00ee\u00a9\u0015%\u00fb\u00be\u0087\u0000\u0006\u00fe>\u00c0\u00a3i\u00de\u0095\u0010j\u0091M\u00b6HK\u00f4\u00bb3\u00ab]\u00cf>D\u00c3\u00df".length();
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
                    var9_3[var7_4++] = c5x.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "r\u001c\u00f3\u0007\u00e2\u00d6\u00c2\u008c\u00da9\u0091\u00b1\u00dc\u008b)le[`\u00b0\\\u009b}\u008b\u0010\u00a1+\u00bd\u00f5<\u00e2nAW\u00dc\u00d3\u00feI\u00e7%\u00d7";
                    var8_6 = "r\u001c\u00f3\u0007\u00e2\u00d6\u00c2\u008c\u00da9\u0091\u00b1\u00dc\u008b)le[`\u00b0\\\u009b}\u008b\u0010\u00a1+\u00bd\u00f5<\u00e2nAW\u00dc\u00d3\u00feI\u00e7%\u00d7".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = c5x.b(var10_9).intern();
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
        c5x.d = var9_3;
        c5x.e = new String[12];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3EA5;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("c5x", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            c5x.e[n2] = c5x.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c5x.b(n, l);
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
            throw new RuntimeException("c5x" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c5x.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

