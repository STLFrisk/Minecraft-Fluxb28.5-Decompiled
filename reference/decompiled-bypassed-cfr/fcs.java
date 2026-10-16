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

public class fcs
extends yqv
implements t6u,
qxu,
uv0 {
    public double jht;
    public double dv9;
    public double kyz;
    public double[][] _5e;
    public int yth;
    public pq1[] f11;
    public pq1 tpz;
    public pq1 s6p;
    public pq1 d78;
    public pq1 j_b;
    public pq1 cbh;
    public pq1 nqn;
    public pq1 zjj;
    public float z1a;
    public float djj;
    public boolean ut4;
    public boolean xsa;
    private /* synthetic */ i2h hoo;
    public int jkn;
    public edl xs_;
    private static final long c;
    private static final String[] d;
    private static final String[] g;
    private static final Map h;

    public fcs(t9d t9d2) {
        long l = c ^ 0x2672A4CFA674L;
        super(t9d2);
        this._5e = new double[64][3];
        this.yth = -1;
        pq1[] pq1Array = new pq1[7];
        pq1Array[0] = this.tpz = new pq1(this, (String)((Object)fcs.d("w", (int)17883, (long)(0x2521721975CC30DAL ^ l))), 6.0f, 6.0f);
        pq1Array[1] = this.s6p = new pq1(this, (String)((Object)fcs.d("w", (int)5525, (long)(0x3560C568C400609BL ^ l))), 8.0f, 8.0f);
        pq1Array[2] = this.d78 = new pq1(this, (String)((Object)fcs.d("w", (int)3694, (long)(0x2899B9A1038A7B6EL ^ l))), 4.0f, 4.0f);
        pq1Array[3] = this.j_b = new pq1(this, (String)((Object)fcs.d("w", (int)215, (long)(0xF51DA778694F5D5L ^ l))), 4.0f, 4.0f);
        pq1Array[4] = this.cbh = new pq1(this, (String)((Object)fcs.d("w", (int)215, (long)(0xF51DA778694F5D5L ^ l))), 4.0f, 4.0f);
        pq1Array[5] = this.nqn = new pq1(this, (String)((Object)fcs.d("w", (int)13047, (long)(0x16A2B32738CE47F2L ^ l))), 4.0f, 4.0f);
        pq1Array[6] = this.zjj = new pq1(this, (String)((Object)fcs.d("w", (int)21349, (long)(0x2F818EE6296BA66AL ^ l))), 4.0f, 4.0f);
        this.f11 = pq1Array;
        this.uh3(this.axb());
        this.yxc(16.0f, 8.0f);
        this.kvx = true;
        this.cuj = true;
        this.dv9 = 100.0;
        this.k50 = true;
    }

    @Override
    public void nyy() {
        super.nyy();
        this.dgt(m6d.t9k).zf7(200.0);
    }

    @Override
    public void tbj() {
        super.tbj();
    }

    public double[] gv2(int n, float f) {
        float f2;
        block2: {
            block3: {
                int n2 = t9d.c();
                try {
                    float f3 = this.i55() - 0.0f;
                    f2 = f3 == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
                    if (n2 != 0) break block2;
                    if (f2 > 0) break block3;
                }
                catch (oov oov2) {
                    throw fcs.a(oov2);
                }
                f = 0.0f;
            }
            f = 1.0f - f;
            f2 = this.yth - n * 1 & 0x3F;
        }
        float f4 = f2;
        int n3 = this.yth - n * 1 - 1 & 0x3F;
        double[] dArray = new double[3];
        double d = this._5e[f4][0];
        double d2 = fe6.lrs(this._5e[n3][0] - d);
        dArray[0] = d + d2 * (double)f;
        d = this._5e[f4][1];
        d2 = this._5e[n3][1] - d;
        dArray[1] = d + d2 * (double)f;
        dArray[2] = this._5e[f4][2] + (this._5e[n3][2] - this._5e[f4][2]) * (double)f;
        return dArray;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void e_a() {
        block125: {
            block164: {
                block160: {
                    block158: {
                        block159: {
                            block137: {
                                block138: {
                                    block157: {
                                        block155: {
                                            block153: {
                                                block154: {
                                                    block151: {
                                                        block152: {
                                                            block165: {
                                                                block150: {
                                                                    block148: {
                                                                        block149: {
                                                                            block147: {
                                                                                block143: {
                                                                                    block145: {
                                                                                        block144: {
                                                                                            block142: {
                                                                                                block139: {
                                                                                                    block140: {
                                                                                                        block141: {
                                                                                                            block136: {
                                                                                                                block134: {
                                                                                                                    block133: {
                                                                                                                        block135: {
                                                                                                                            block131: {
                                                                                                                                block132: {
                                                                                                                                    block129: {
                                                                                                                                        block128: {
                                                                                                                                            block126: {
                                                                                                                                                block124: {
                                                                                                                                                    block122: {
                                                                                                                                                        block123: {
                                                                                                                                                            var1_1 = fcs.c ^ 100632747335644L;
                                                                                                                                                            var3_2 = t9d.b();
                                                                                                                                                            try {
                                                                                                                                                                v0 = this.oay.v0f;
                                                                                                                                                                if (var3_2 == 0) break block122;
                                                                                                                                                                if (v0 == 0) break block123;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v1) {
                                                                                                                                                                throw fcs.a(v1);
                                                                                                                                                            }
                                                                                                                                                            var4_3 = fe6.ssk(this.djj * 3.1415927f * 2.0f);
                                                                                                                                                            var5_4 = fe6.ssk(this.z1a * 3.1415927f * 2.0f);
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    cfr_temp_0 = var5_4 - -0.3f;
                                                                                                                                                                                    v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                                                                                                                                    if (var3_2 == 0) break block122;
                                                                                                                                                                                    if (v0 > 0) break block123;
                                                                                                                                                                                }
                                                                                                                                                                                catch (oov v2) {
                                                                                                                                                                                    throw fcs.a(v2);
                                                                                                                                                                                }
                                                                                                                                                                                cfr_temp_1 = var4_3 - -0.3f;
                                                                                                                                                                                v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                                                                                                                                                                if (var3_2 == 0) break block122;
                                                                                                                                                                            }
                                                                                                                                                                            catch (oov v3) {
                                                                                                                                                                                throw fcs.a(v3);
                                                                                                                                                                            }
                                                                                                                                                                            if (v0 < 0) break block123;
                                                                                                                                                                        }
                                                                                                                                                                        catch (oov v4) {
                                                                                                                                                                            throw fcs.a(v4);
                                                                                                                                                                        }
                                                                                                                                                                        v0 = (int)this.o3x();
                                                                                                                                                                        if (var3_2 == 0) break block122;
                                                                                                                                                                    }
                                                                                                                                                                    catch (oov v5) {
                                                                                                                                                                        throw fcs.a(v5);
                                                                                                                                                                    }
                                                                                                                                                                    if (v0 != 0) break block123;
                                                                                                                                                                }
                                                                                                                                                                catch (oov v6) {
                                                                                                                                                                    throw fcs.a(v6);
                                                                                                                                                                }
                                                                                                                                                                this.oay.wd_(this.o2v, this.kfp, this.vbd, (String)fcs.d("w", (int)9651, (long)(5169016638489635094L ^ var1_1)), 5.0f, 0.8f + this.z2d.nextFloat() * 0.3f, false);
                                                                                                                                                            }
                                                                                                                                                            catch (oov v7) {
                                                                                                                                                                throw fcs.a(v7);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            this.z1a = this.djj;
                                                                                                                                                            v8 = this.i55();
                                                                                                                                                            v9 = 0.0f;
                                                                                                                                                            if (var3_2 == 0) break block124;
                                                                                                                                                            cfr_temp_2 = v8 - v9;
                                                                                                                                                            v0 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1);
                                                                                                                                                        }
                                                                                                                                                        catch (oov v10) {
                                                                                                                                                            throw fcs.a(v10);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (v0 > 0) ** GOTO lbl75
                                                                                                                                                    var4_3 = (this.z2d.nextFloat() - 0.5f) * 8.0f;
                                                                                                                                                    var5_4 = (this.z2d.nextFloat() - 0.5f) * 4.0f;
                                                                                                                                                    var6_9 = (this.z2d.nextFloat() - 0.5f) * 8.0f;
                                                                                                                                                    try {
                                                                                                                                                        this.oay.zvy(w_0.tmu, this.o2v + (double)var4_3, this.kfp + 2.0 + (double)var5_4, this.vbd + (double)var6_9, 0.0, 0.0, 0.0, new int[0]);
                                                                                                                                                        if (var3_2 != 0) break block125;
lbl75:
                                                                                                                                                        // 2 sources

                                                                                                                                                        this.dwa();
                                                                                                                                                        v8 = 0.2f;
                                                                                                                                                        v9 = fe6.dii(this.icv * this.icv + this.bw4 * this.bw4) * 10.0f + 1.0f;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v11) {
                                                                                                                                                        throw fcs.a(v11);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var4_3 = v8 / v9;
                                                                                                                                                var4_3 *= (float)Math.pow(2.0, this.mop);
                                                                                                                                                try {
                                                                                                                                                    block127: {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                v12 = this;
                                                                                                                                                                if (var3_2 == 0) break block126;
                                                                                                                                                                if (v12.xsa) {
                                                                                                                                                                }
                                                                                                                                                                break block127;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v13) {
                                                                                                                                                                throw fcs.a(v13);
                                                                                                                                                            }
                                                                                                                                                            this.djj += var4_3 * 0.5f;
                                                                                                                                                            if (var3_2 != 0) break block128;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v14) {
                                                                                                                                                            throw fcs.a(v14);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v12 = this;
                                                                                                                                                }
                                                                                                                                                catch (oov v15) {
                                                                                                                                                    throw fcs.a(v15);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v12.djj += var4_3;
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            block130: {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        this.x5k = fe6.qsy(this.x5k);
                                                                                                                                                        v16 = this.r1t();
                                                                                                                                                        if (var3_2 == 0) break block129;
                                                                                                                                                        if (v16 == 0) break block130;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v17) {
                                                                                                                                                        throw fcs.a(v17);
                                                                                                                                                    }
                                                                                                                                                    this.djj = 0.5f;
                                                                                                                                                    if (var3_2 != 0) break block125;
                                                                                                                                                }
                                                                                                                                                catch (oov v18) {
                                                                                                                                                    throw fcs.a(v18);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v16 = this.yth;
                                                                                                                                        }
                                                                                                                                        catch (oov v19) {
                                                                                                                                            throw fcs.a(v19);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        if (var3_2 == 0) break block131;
                                                                                                                                        if (v16 >= 0) break block132;
                                                                                                                                    }
                                                                                                                                    catch (oov v20) {
                                                                                                                                        throw fcs.a(v20);
                                                                                                                                    }
                                                                                                                                    for (var5_5 = 0; var5_5 < this._5e.length; ++var5_5) {
                                                                                                                                        try {
                                                                                                                                            this._5e[var5_5][0] = this.x5k;
                                                                                                                                            this._5e[var5_5][1] = this.kfp;
                                                                                                                                            if (var3_2 != 0) {
                                                                                                                                                if (var3_2 != 0) continue;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            break block133;
                                                                                                                                        }
                                                                                                                                        catch (oov v21) {
                                                                                                                                            throw fcs.a(v21);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v16 = this.yth = this.yth + 1;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (var3_2 == 0) break block134;
                                                                                                                                    if (v16 != this._5e.length) break block135;
                                                                                                                                }
                                                                                                                                catch (oov v22) {
                                                                                                                                    throw fcs.a(v22);
                                                                                                                                }
                                                                                                                                this.yth = 0;
                                                                                                                            }
                                                                                                                            catch (oov v23) {
                                                                                                                                throw fcs.a(v23);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        this._5e[this.yth][0] = this.x5k;
                                                                                                                        this._5e[this.yth][1] = this.kfp;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        v24 = this;
                                                                                                                        if (var3_2 == 0) break block136;
                                                                                                                        v16 = (int)v24.oay.v0f;
                                                                                                                    }
                                                                                                                    catch (oov v25) {
                                                                                                                        throw fcs.a(v25);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (v16 != 0) {
                                                                                                                            v26 = this;
                                                                                                                            if (var3_2 == 0) break block137;
                                                                                                                        }
                                                                                                                        ** GOTO lbl196
                                                                                                                    }
                                                                                                                    catch (oov v27) {
                                                                                                                        throw fcs.a(v27);
                                                                                                                    }
                                                                                                                    if (v26.a1q <= 0) break block138;
                                                                                                                }
                                                                                                                catch (oov v28) {
                                                                                                                    throw fcs.a(v28);
                                                                                                                }
                                                                                                                var5_6 = this.o2v + (this.sz4 - this.o2v) / (double)this.a1q;
                                                                                                                var7_10 = this.kfp + (this._y0 - this.kfp) / (double)this.a1q;
                                                                                                                var9_12 = this.vbd + (this.hb4 - this.vbd) / (double)this.a1q;
                                                                                                                var11_14 = fe6.lrs(this.e7t - (double)this.x5k);
                                                                                                                try {
                                                                                                                    this.x5k = (float)((double)this.x5k + var11_14 / (double)this.a1q);
                                                                                                                    this.y2i = (float)((double)this.y2i + (this.bxw - (double)this.y2i) / (double)this.a1q);
                                                                                                                    --this.a1q;
                                                                                                                    this.m6_(var5_6, var7_10, var9_12);
                                                                                                                    this.iym(this.x5k, this.y2i);
                                                                                                                    if (var3_2 != 0) break block138;
lbl196:
                                                                                                                    // 2 sources

                                                                                                                    v24 = this;
                                                                                                                }
                                                                                                                catch (oov v29) {
                                                                                                                    throw fcs.a(v29);
                                                                                                                }
                                                                                                            }
                                                                                                            var5_7 = v24.jht - this.o2v;
                                                                                                            var7_10 = this.dv9 - this.kfp;
                                                                                                            var9_12 = this.kyz - this.vbd;
                                                                                                            var11_14 = var5_7 * var5_7 + var7_10 * var7_10 + var9_12 * var9_12;
                                                                                                            try {
                                                                                                                v30 = this;
                                                                                                                if (var3_2 == 0) break block139;
                                                                                                                if (v30.hoo != null) {
                                                                                                                }
                                                                                                                ** GOTO lbl231
                                                                                                            }
                                                                                                            catch (oov v31) {
                                                                                                                throw fcs.a(v31);
                                                                                                            }
                                                                                                            this.jht = this.hoo.o2v;
                                                                                                            this.kyz = this.hoo.vbd;
                                                                                                            var13_16 = this.jht - this.o2v;
                                                                                                            var15_18 = this.kyz - this.vbd;
                                                                                                            var17_20 = Math.sqrt(var13_16 * var13_16 + var15_18 * var15_18);
                                                                                                            var19_22 = 0.4000000059604645 + var17_20 / 80.0 - 1.0;
                                                                                                            try {
                                                                                                                if (var3_2 == 0) break block140;
                                                                                                                if (!(var19_22 > 10.0)) break block141;
                                                                                                            }
                                                                                                            catch (oov v32) {
                                                                                                                throw fcs.a(v32);
                                                                                                            }
                                                                                                            var19_22 = 10.0;
                                                                                                        }
                                                                                                        this.dv9 = this.hoo.aaw().bx_ + var19_22;
                                                                                                    }
                                                                                                    try {
                                                                                                        if (var3_2 != 0) break block142;
lbl231:
                                                                                                        // 2 sources

                                                                                                        this.jht += this.z2d.nextGaussian() * 2.0;
                                                                                                        v30 = this;
                                                                                                    }
                                                                                                    catch (oov v33) {
                                                                                                        throw fcs.a(v33);
                                                                                                    }
                                                                                                }
                                                                                                v30.kyz += this.z2d.nextGaussian() * 2.0;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v34 = this;
                                                                                                            if (var3_2 == 0) break block143;
                                                                                                            if (!v34.ut4) {
                                                                                                            }
                                                                                                            ** GOTO lbl299
                                                                                                        }
                                                                                                        catch (oov v35) {
                                                                                                            throw fcs.a(v35);
                                                                                                        }
                                                                                                        cfr_temp_3 = var11_14 - 100.0;
                                                                                                        v36 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                                                                                        if (var3_2 == 0) break block144;
                                                                                                    }
                                                                                                    catch (oov v37) {
                                                                                                        throw fcs.a(v37);
                                                                                                    }
                                                                                                    if (v36 >= 0) {
                                                                                                    }
                                                                                                    ** GOTO lbl299
                                                                                                }
                                                                                                catch (oov v38) {
                                                                                                    throw fcs.a(v38);
                                                                                                }
                                                                                                cfr_temp_4 = var11_14 - 22500.0;
                                                                                                v36 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                                                                                            }
                                                                                            catch (oov v39) {
                                                                                                throw fcs.a(v39);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (var3_2 == 0) break block145;
                                                                                                    if (v36 <= 0) {
                                                                                                    }
                                                                                                    ** GOTO lbl299
                                                                                                }
                                                                                                catch (oov v40) {
                                                                                                    throw fcs.a(v40);
                                                                                                }
                                                                                                v34 = this;
                                                                                                if (var3_2 == 0) break block143;
                                                                                            }
                                                                                            catch (oov v41) {
                                                                                                throw fcs.a(v41);
                                                                                            }
                                                                                            v36 = (double)v34.cbi;
                                                                                        }
                                                                                        catch (oov v42) {
                                                                                            throw fcs.a(v42);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        block146: {
                                                                                            try {
                                                                                                try {
                                                                                                    if (v36 != false) break block146;
                                                                                                    v34 = this;
                                                                                                    if (var3_2 == 0) break block143;
                                                                                                }
                                                                                                catch (oov v43) {
                                                                                                    throw fcs.a(v43);
                                                                                                }
                                                                                                if (!v34.fcv) break block147;
                                                                                            }
                                                                                            catch (oov v44) {
                                                                                                throw fcs.a(v44);
                                                                                            }
                                                                                        }
                                                                                        v34 = this;
                                                                                    }
                                                                                    catch (oov v45) {
                                                                                        throw fcs.a(v45);
                                                                                    }
                                                                                }
                                                                                v34.k4d();
                                                                            }
                                                                            var7_10 /= (double)fe6.dii(var5_7 * var5_7 + var9_12 * var9_12);
                                                                            var13_17 = 0.6f;
                                                                            var7_10 = fe6.lft(var7_10, -var13_17, var13_17);
                                                                            this.mop += var7_10 * 0.10000000149011612;
                                                                            this.x5k = fe6.qsy(this.x5k);
                                                                            var14_24 = 180.0 - fe6.yr8(var5_7, var9_12) * 180.0 / 3.141592653589793;
                                                                            var16_26 = fe6.lrs(var14_24 - (double)this.x5k);
                                                                            try {
                                                                                cfr_temp_5 = var16_26 - 50.0;
                                                                                v46 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                                                                                if (var3_2 == 0) break block148;
                                                                                if (v46 <= 0) break block149;
                                                                            }
                                                                            catch (oov v47) {
                                                                                throw fcs.a(v47);
                                                                            }
                                                                            var16_26 = 50.0;
                                                                        }
                                                                        try {
                                                                            v48 = var16_26;
                                                                            if (var3_2 == 0) break block150;
                                                                            cfr_temp_6 = v48 - -50.0;
                                                                            v46 = cfr_temp_6 == 0.0 ? 0 : (cfr_temp_6 < 0.0 ? -1 : 1);
                                                                        }
                                                                        catch (oov v49) {
                                                                            throw fcs.a(v49);
                                                                        }
                                                                    }
                                                                    if (v46 >= 0) break block165;
                                                                    v48 = -50.0;
                                                                }
                                                                var16_26 = v48;
                                                            }
                                                            var18_28 = new fqr(this.jht - this.o2v, this.dv9 - this.kfp, this.kyz - this.vbd).kec();
                                                            var19_22 = -fe6.ssk(this.x5k * 3.1415927f / 180.0f);
                                                            var21_30 = new fqr(fe6.rtn(this.x5k * 3.1415927f / 180.0f), this.mop, var19_22).kec();
                                                            var22_32 = ((float)var21_30.xvl(var18_28) + 0.5f) / 1.5f;
                                                            try {
                                                                v50 = var22_32;
                                                                v51 = 0.0f;
                                                                if (var3_2 == 0) break block151;
                                                                if (!(v50 < v51)) break block152;
                                                            }
                                                            catch (oov v52) {
                                                                throw fcs.a(v52);
                                                            }
                                                            var22_32 = 0.0f;
                                                        }
                                                        this.czx *= 0.8f;
                                                        v50 = fe6.dii(this.icv * this.icv + this.bw4 * this.bw4) * 1.0f;
                                                        v51 = 1.0f;
                                                    }
                                                    var23_33 = v50 + v51;
                                                    var24_34 = Math.sqrt(this.icv * this.icv + this.bw4 * this.bw4) * 1.0 + 1.0;
                                                    try {
                                                        v53 = var24_34;
                                                        v54 = 40.0;
                                                        if (var3_2 == 0) break block153;
                                                        if (!(v53 > v54)) break block154;
                                                    }
                                                    catch (oov v55) {
                                                        throw fcs.a(v55);
                                                    }
                                                    var24_34 = 40.0;
                                                }
                                                this.czx = (float)((double)this.czx + var16_26 * (0.699999988079071 / var24_34 / (double)var23_33));
                                                this.x5k += this.czx * 0.1f;
                                                v53 = 2.0;
                                                v54 = var24_34 + 1.0;
                                            }
                                            var26_35 = (float)(v53 / v54);
                                            var27_36 = 0.06f;
                                            try {
                                                block156: {
                                                    try {
                                                        try {
                                                            this.r4r(0.0f, -1.0f, var27_36 * (var22_32 * var26_35 + (1.0f - var26_35)));
                                                            v56 = this;
                                                            if (var3_2 == 0) break block155;
                                                            if (!v56.xsa) break block156;
                                                        }
                                                        catch (oov v57) {
                                                            throw fcs.a(v57);
                                                        }
                                                        this.vjj(this.icv * 0.800000011920929, this.mop * 0.800000011920929, this.bw4 * 0.800000011920929);
                                                        if (var3_2 != 0) break block157;
                                                    }
                                                    catch (oov v58) {
                                                        throw fcs.a(v58);
                                                    }
                                                }
                                                v56 = this;
                                            }
                                            catch (oov v59) {
                                                throw fcs.a(v59);
                                            }
                                        }
                                        v56.vjj(this.icv, this.mop, this.bw4);
                                    }
                                    var28_37 = new fqr(this.icv, this.mop, this.bw4).kec();
                                    var29_38 = ((float)var28_37.xvl(var21_30) + 1.0f) / 2.0f;
                                    var29_38 = 0.8f + 0.15f * var29_38;
                                    this.icv *= (double)var29_38;
                                    this.bw4 *= (double)var29_38;
                                    this.mop *= 0.9100000262260437;
                                }
                                this.ksw = this.x5k;
                                this.tpz.ikl = 3.0f;
                                this.tpz.uo6 = 3.0f;
                                this.d78.ikl = 2.0f;
                                this.d78.uo6 = 2.0f;
                                this.j_b.ikl = 2.0f;
                                this.j_b.uo6 = 2.0f;
                                this.cbh.ikl = 2.0f;
                                this.cbh.uo6 = 2.0f;
                                this.s6p.ikl = 3.0f;
                                this.s6p.uo6 = 5.0f;
                                this.nqn.ikl = 2.0f;
                                this.nqn.uo6 = 4.0f;
                                this.zjj.ikl = 3.0f;
                                this.zjj.uo6 = 4.0f;
                                v26 = this;
                            }
                            var5_8 = (float)(v26.gv2(5, 1.0f)[1] - this.gv2(10, 1.0f)[1]) * 10.0f / 180.0f * 3.1415927f;
                            var6_9 = fe6.ssk(var5_8);
                            var7_11 = -fe6.rtn(var5_8);
                            var8_39 = this.x5k * 3.1415927f / 180.0f;
                            var9_13 = fe6.rtn(var8_39);
                            var10_40 = fe6.ssk(var8_39);
                            try {
                                try {
                                    try {
                                        try {
                                            this.s6p.xx_();
                                            this.s6p.x24(this.o2v + (double)(var9_13 * 0.5f), this.kfp, this.vbd - (double)(var10_40 * 0.5f), 0.0f, 0.0f);
                                            this.nqn.xx_();
                                            this.nqn.x24(this.o2v + (double)(var10_40 * 4.5f), this.kfp + 2.0, this.vbd + (double)(var9_13 * 4.5f), 0.0f, 0.0f);
                                            this.zjj.xx_();
                                            this.zjj.x24(this.o2v - (double)(var10_40 * 4.5f), this.kfp + 2.0, this.vbd - (double)(var9_13 * 4.5f), 0.0f, 0.0f);
                                            v60 = this;
                                            if (var3_2 == 0) break block158;
                                            if (v60.oay.v0f) break block159;
                                        }
                                        catch (oov v61) {
                                            throw fcs.a(v61);
                                        }
                                        v60 = this;
                                        if (var3_2 == 0) break block158;
                                    }
                                    catch (oov v62) {
                                        throw fcs.a(v62);
                                    }
                                    if (v60.gx0 != 0) break block159;
                                }
                                catch (oov v63) {
                                    throw fcs.a(v63);
                                }
                                this.kzp(this.oay.p05(this, this.nqn.aaw().c2h(4.0, 2.0, 4.0).sy_(0.0, -2.0, 0.0)));
                                this.kzp(this.oay.p05(this, this.zjj.aaw().c2h(4.0, 2.0, 4.0).sy_(0.0, -2.0, 0.0)));
                                this.uuz(this.oay.p05(this, this.tpz.aaw().c2h(1.0, 1.0, 1.0)));
                            }
                            catch (oov v64) {
                                throw fcs.a(v64);
                            }
                        }
                        v60 = this;
                    }
                    var11_15 = v60.gv2(5, 1.0f);
                    var12_41 = this.gv2(0, 1.0f);
                    var13_17 = fe6.rtn(this.x5k * 3.1415927f / 180.0f - this.czx * 0.01f);
                    var14_25 = fe6.ssk(this.x5k * 3.1415927f / 180.0f - this.czx * 0.01f);
                    this.tpz.xx_();
                    this.tpz.x24(this.o2v + (double)(var13_17 * 5.5f * var6_9), this.kfp + (var12_41[1] - var11_15[1]) * 1.0 + (double)(var7_11 * 5.5f), this.vbd - (double)(var14_25 * 5.5f * var6_9), 0.0f, 0.0f);
                    for (var15_19 = 0; var15_19 < 3; ++var15_19) {
                        block162: {
                            block163: {
                                block161: {
                                    var16_27 = null;
                                    try {
                                        v65 = var15_19;
                                        if (var3_2 == 0) break block160;
                                        if (v65 != 0) break block161;
                                    }
                                    catch (oov v66) {
                                        throw fcs.a(v66);
                                    }
                                    var16_27 = this.d78;
                                }
                                try {
                                    v67 = var15_19;
                                    v68 = 1;
                                    if (var3_2 == 0) break block162;
                                    if (v67 != v68) break block163;
                                }
                                catch (oov v69) {
                                    throw fcs.a(v69);
                                }
                                var16_27 = this.j_b;
                            }
                            v67 = var15_19;
                            v68 = 2;
                        }
                        if (v67 == v68) {
                            var16_27 = this.cbh;
                        }
                        var17_21 = this.gv2(12 + var15_19 * 2, 1.0f);
                        var18_29 = this.x5k * 3.1415927f / 180.0f + this.wui(var17_21[0] - var11_15[0]) * 3.1415927f / 180.0f * 1.0f;
                        var19_23 = fe6.rtn(var18_29);
                        var20_42 = fe6.ssk(var18_29);
                        var21_31 = 1.5f;
                        var22_32 = (float)(var15_19 + 1) * 2.0f;
                        var16_27.xx_();
                        var16_27.x24(this.o2v - (double)((var9_13 * var21_31 + var19_23 * var22_32) * var6_9), this.kfp + (var17_21[1] - var11_15[1]) * 1.0 - (double)((var22_32 + var21_31) * var7_11) + 1.5, this.vbd + (double)((var10_40 * var21_31 + var20_42 * var22_32) * var6_9), 0.0f, 0.0f);
                        if (var3_2 != 0) continue;
                    }
                    try {
                        v70 = this;
                        if (var3_2 == 0) break block164;
                        v65 = (int)v70.oay.v0f;
                    }
                    catch (oov v71) {
                        throw fcs.a(v71);
                    }
                }
                if (v65 != 0) break block125;
                v70 = this;
            }
            v70.xsa = this.l0x(this.tpz.aaw()) | this.l0x(this.s6p.aaw());
        }
    }

    /*
     * Unable to fully structure code
     */
    private void dwa() {
        block37: {
            block36: {
                block31: {
                    block32: {
                        block33: {
                            block34: {
                                block35: {
                                    var1_1 = t9d.b();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v0 = this;
                                                            if (var1_1 == 0) break block31;
                                                            if (v0.xs_ == null) break block32;
                                                        }
                                                        catch (oov v1) {
                                                            throw fcs.a(v1);
                                                        }
                                                        v2 = (int)this.xs_.ma9;
                                                        if (var1_1 == 0) break block33;
                                                    }
                                                    catch (oov v3) {
                                                        throw fcs.a(v3);
                                                    }
                                                    if (v2 != 0) {
                                                    }
                                                    ** GOTO lbl44
                                                }
                                                catch (oov v4) {
                                                    throw fcs.a(v4);
                                                }
                                                v5 = this;
                                                if (var1_1 == 0) break block34;
                                            }
                                            catch (oov v6) {
                                                throw fcs.a(v6);
                                            }
                                            if (v5.oay.v0f) break block35;
                                        }
                                        catch (oov v7) {
                                            throw fcs.a(v7);
                                        }
                                        this.ojr(this.tpz, ofh.siu(null), 10.0f);
                                    }
                                    catch (oov v8) {
                                        throw fcs.a(v8);
                                    }
                                }
                                v5 = this;
                            }
                            try {
                                v5.xs_ = null;
                                if (var1_1 != 0) break block32;
lbl44:
                                // 2 sources

                                v2 = this.g25 % 10;
                            }
                            catch (oov v9) {
                                throw fcs.a(v9);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (var1_1 == 0) break block36;
                                        if (v2 != 0) break block32;
                                    }
                                    catch (oov v10) {
                                        throw fcs.a(v10);
                                    }
                                    cfr_temp_0 = this.i55() - this.axb();
                                    v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                    if (var1_1 == 0) break block36;
                                }
                                catch (oov v11) {
                                    throw fcs.a(v11);
                                }
                                if (v2 >= 0) break block32;
                            }
                            catch (oov v12) {
                                throw fcs.a(v12);
                            }
                            this.uh3(this.i55() + 1.0f);
                        }
                        catch (oov v13) {
                            throw fcs.a(v13);
                        }
                    }
                    v0 = this;
                }
                v2 = v0.z2d.nextInt(10);
            }
            if (v2 == 0) {
                var2_2 = 32.0f;
                var3_3 = this.oay.m_z(edl.class, this.aaw().c2h(var2_2, var2_2, var2_2));
                var4_4 = null;
                var5_5 = 1.7976931348623157E308;
                for (edl var8_7 : var3_3) {
                    block39: {
                        block38: {
                            var9_8 = var8_7.wxg(this);
                            try {
                                try {
                                    try {
                                        if (var1_1 == 0) break block37;
                                        v14 = var9_8;
                                        if (var1_1 == 0) break block38;
                                    }
                                    catch (oov v15) {
                                        throw fcs.a(v15);
                                    }
                                    if (!(v14 < var5_5)) break block39;
                                }
                                catch (oov v16) {
                                    throw fcs.a(v16);
                                }
                                v14 = var9_8;
                            }
                            catch (oov v17) {
                                throw fcs.a(v17);
                            }
                        }
                        var5_5 = v14;
                        var4_4 = var8_7;
                    }
                    if (var1_1 != 0) continue;
                }
                this.xs_ = var4_4;
            }
        }
    }

    private void kzp(List list) {
        double d = (this.s6p.aaw().rlc + this.s6p.aaw().t_2) / 2.0;
        double d2 = (this.s6p.aaw().t8n + this.s6p.aaw().oqj) / 2.0;
        int n = t9d.b();
        for (i2h i2h2 : list) {
            block6: {
                i2h i2h3;
                block5: {
                    try {
                        try {
                            i2h3 = i2h2;
                            if (n == 0) break block5;
                            if (!(i2h3 instanceof g_3)) break block6;
                        }
                        catch (oov oov2) {
                            throw fcs.a(oov2);
                        }
                        i2h3 = i2h2;
                    }
                    catch (oov oov3) {
                        throw fcs.a(oov3);
                    }
                }
                double d3 = i2h3.o2v - d;
                double d4 = i2h2.vbd - d2;
                double d5 = d3 * d3 + d4 * d4;
                i2h2.w7w(d3 / d5 * 4.0, 0.2f, d4 / d5 * 4.0);
            }
            if (n != 0) continue;
        }
    }

    private void uuz(List list) {
        int n = t9d.c();
        int n2 = 0;
        while (n2 < list.size()) {
            block5: {
                block6: {
                    i2h i2h2 = (i2h)list.get(n2);
                    try {
                        try {
                            if (n != 0) break block5;
                            if (!(i2h2 instanceof g_3)) break block6;
                        }
                        catch (oov oov2) {
                            throw fcs.a(oov2);
                        }
                        i2h2.m1t(ofh.kun(this), 10.0f);
                        this.wm5(this, i2h2);
                    }
                    catch (oov oov3) {
                        throw fcs.a(oov3);
                    }
                }
                ++n2;
            }
            if (n == 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void k4d() {
        block25: {
            block29: {
                block28: {
                    block27: {
                        block26: {
                            block23: {
                                block22: {
                                    this.ut4 = false;
                                    var2_1 = Lists.newArrayList((Iterable)this.oay.rpk);
                                    var1_2 = t9d.c();
                                    var3_3 = var2_1.iterator();
                                    while (var3_3.hasNext()) {
                                        block21: {
                                            try {
                                                try {
                                                    v0 = var3_3;
                                                    if (var1_2 != 0) break block21;
                                                    v1 = (int)((ha9)v0.next()).myu();
                                                    if (var1_2 != 0) break block22;
                                                }
                                                catch (oov v2) {
                                                    throw fcs.a(v2);
                                                }
                                                if (v1 == 0) continue;
                                            }
                                            catch (oov v3) {
                                                throw fcs.a(v3);
                                            }
                                            v0 = var3_3;
                                        }
                                        v0.remove();
                                        if (var1_2 == 0) continue;
                                    }
                                    try {
                                        v4 = this;
                                        if (var1_2 != 0) break block23;
                                        v1 = v4.z2d.nextInt(2);
                                    }
                                    catch (oov v5) {
                                        throw fcs.a(v5);
                                    }
                                }
                                try {
                                    block24: {
                                        try {
                                            try {
                                                if (v1 != 0 || var2_1.isEmpty()) break block24;
                                            }
                                            catch (oov v6) {
                                                throw fcs.a(v6);
                                            }
                                            this.hoo = (i2h)var2_1.get(this.z2d.nextInt(var2_1.size()));
                                            if (var1_2 == 0) break block25;
                                        }
                                        catch (oov v7) {
                                            throw fcs.a(v7);
                                        }
                                    }
lbl44:
                                    // 2 sources

                                    while (true) {
                                        this.jht = 0.0;
                                        this.dv9 = 70.0f + this.z2d.nextFloat() * 50.0f;
                                        this.kyz = 0.0;
                                        this.jht += (double)(this.z2d.nextFloat() * 120.0f - 60.0f);
                                        this.kyz += (double)(this.z2d.nextFloat() * 120.0f - 60.0f);
                                        v4 = this;
                                        break;
                                    }
                                }
                                catch (oov v8) {
                                    throw fcs.a(v8);
                                }
                            }
                            var4_4 = v4.o2v - this.jht;
                            var6_5 = this.kfp - this.dv9;
                            var8_6 = this.vbd - this.kyz;
                            try {
                                try {
                                    if (!(var4_4 * var4_4 + var6_5 * var6_5 + var8_6 * var8_6 > 100.0)) break block26;
                                    v9 = true;
                                    if (var1_2 == 0) {
                                        // empty if block
                                    }
                                    break block27;
                                }
                                catch (oov v10) {
                                    throw fcs.a(v10);
                                }
                            }
                            catch (oov v11) {
                                throw fcs.a(v11);
                            }
                        }
                        v9 = false;
                    }
                    var10_7 = v9;
                    try {
                        if (!var10_7) break block28;
                        break block29;
                    }
                    catch (oov v12) {
                        throw fcs.a(v12);
                    }
                }
                ** while (var1_2 == 0)
            }
            this.hoo = null;
        }
    }

    private float wui(double d) {
        return (float)fe6.lrs(d);
    }

    /*
     * Unable to fully structure code
     */
    private boolean l0x(nh4 var1_1) {
        block60: {
            block61: {
                block48: {
                    var2_2 = fcs.c ^ 120454902620767L;
                    var5_3 = fe6.jqf(var1_1.rlc);
                    var6_4 = fe6.jqf(var1_1.bx_);
                    var7_5 = fe6.jqf(var1_1.t8n);
                    var8_6 = fe6.jqf(var1_1.t_2);
                    var9_7 = fe6.jqf(var1_1.i2c);
                    var10_8 = fe6.jqf(var1_1.oqj);
                    var11_9 = 0;
                    var12_10 = 0;
                    var13_11 = var5_3;
                    var4_13 = t9d.b();
                    block38: while (true) {
                        v0 = var13_11;
                        block39: while (v0 <= var8_6) {
                            v1 = var6_4;
                            if (var4_13 == 0) break block48;
                            var14_14 = v1;
                            while (var14_14 <= var9_7) {
                                block49: {
                                    v0 = var7_5;
                                    if (var4_13 == 0) continue block39;
                                    var15_15 = v0;
                                    while (var15_15 <= var10_8) {
                                        block50: {
                                            block51: {
                                                block56: {
                                                    block57: {
                                                        block59: {
                                                            block58: {
                                                                block55: {
                                                                    block54: {
                                                                        block53: {
                                                                            block52: {
                                                                                var16_17 = new mew(var13_11, var14_14, var15_15);
                                                                                var17_18 = this.oay.getBlockState(var16_17).r_y();
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (var4_13 == 0) break block49;
                                                                                                    if (var4_13 == 0) break block50;
                                                                                                }
                                                                                                catch (oov v2) {
                                                                                                    throw fcs.a(v2);
                                                                                                }
                                                                                                if (var17_18.p1r() == p3y.cei) break block51;
                                                                                            }
                                                                                            catch (oov v3) {
                                                                                                throw fcs.a(v3);
                                                                                            }
                                                                                            v4 = var17_18;
                                                                                            v5 = ox_.c28;
                                                                                            if (var4_13 == 0) break block52;
                                                                                        }
                                                                                        catch (oov v6) {
                                                                                            throw fcs.a(v6);
                                                                                        }
                                                                                        if (v4 != v5) {
                                                                                        }
                                                                                        ** GOTO lbl144
                                                                                    }
                                                                                    catch (oov v7) {
                                                                                        throw fcs.a(v7);
                                                                                    }
                                                                                    v4 = var17_18;
                                                                                    v5 = ox_.j4y;
                                                                                }
                                                                                catch (oov v8) {
                                                                                    throw fcs.a(v8);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var4_13 == 0) break block53;
                                                                                    if (v4 != v5) {
                                                                                    }
                                                                                    ** GOTO lbl144
                                                                                }
                                                                                catch (oov v9) {
                                                                                    throw fcs.a(v9);
                                                                                }
                                                                                v4 = var17_18;
                                                                                v5 = ox_.p5a;
                                                                            }
                                                                            catch (oov v10) {
                                                                                throw fcs.a(v10);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (var4_13 == 0) break block54;
                                                                                if (v4 != v5) {
                                                                                }
                                                                                ** GOTO lbl144
                                                                            }
                                                                            catch (oov v11) {
                                                                                throw fcs.a(v11);
                                                                            }
                                                                            v4 = var17_18;
                                                                            v5 = ox_.n6z;
                                                                        }
                                                                        catch (oov v12) {
                                                                            throw fcs.a(v12);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var4_13 == 0) break block55;
                                                                            if (v4 != v5) {
                                                                            }
                                                                            ** GOTO lbl144
                                                                        }
                                                                        catch (oov v13) {
                                                                            throw fcs.a(v13);
                                                                        }
                                                                        v4 = var17_18;
                                                                        v5 = ox_.pol;
                                                                    }
                                                                    catch (oov v14) {
                                                                        throw fcs.a(v14);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (v4 != v5) {
                                                                                            v15 = (int)this.oay.eir()._s0((String)fcs.d("w", (int)9590, (long)(5452536588776690777L ^ var2_2)));
                                                                                            if (var4_13 == 0) break block56;
                                                                                        }
                                                                                        ** GOTO lbl144
                                                                                    }
                                                                                    catch (oov v16) {
                                                                                        throw fcs.a(v16);
                                                                                    }
                                                                                    if (v15 != 0) {
                                                                                    }
                                                                                    ** GOTO lbl144
                                                                                }
                                                                                catch (oov v17) {
                                                                                    throw fcs.a(v17);
                                                                                }
                                                                                v18 = this.oay.i6x(var16_17);
                                                                                if (var4_13 == 0) break block57;
                                                                            }
                                                                            catch (oov v19) {
                                                                                throw fcs.a(v19);
                                                                            }
                                                                            if (v18 != 0) break block58;
                                                                        }
                                                                        catch (oov v20) {
                                                                            throw fcs.a(v20);
                                                                        }
                                                                        v18 = var12_10;
                                                                        if (var4_13 == 0) break block57;
                                                                    }
                                                                    catch (oov v21) {
                                                                        throw fcs.a(v21);
                                                                    }
                                                                    if (v18 == 0) break block59;
                                                                }
                                                                catch (oov v22) {
                                                                    throw fcs.a(v22);
                                                                }
                                                            }
                                                            v18 = 1;
                                                            break block57;
                                                        }
                                                        v18 = 0;
                                                    }
                                                    var12_10 = v18;
                                                    try {
                                                        if (var4_13 != 0) break block51;
lbl144:
                                                        // 7 sources

                                                        v15 = 1;
                                                    }
                                                    catch (oov v23) {
                                                        throw fcs.a(v23);
                                                    }
                                                }
                                                var11_9 = v15;
                                            }
                                            ++var15_15;
                                        }
                                        if (var4_13 != 0) continue;
                                    }
                                    ++var14_14;
                                }
                                if (var4_13 != 0) continue;
                            }
                            ++var13_11;
                            if (var4_13 != 0) continue block38;
                        }
                        break;
                    }
                    v1 = var12_10;
                }
                try {
                    if (var4_13 == 0) break block60;
                    if (v1 == 0) break block61;
                }
                catch (oov v24) {
                    throw fcs.a(v24);
                }
                var13_12 = var1_1.rlc + (var1_1.t_2 - var1_1.rlc) * (double)this.z2d.nextFloat();
                var15_16 = var1_1.bx_ + (var1_1.i2c - var1_1.bx_) * (double)this.z2d.nextFloat();
                var17_19 = var1_1.t8n + (var1_1.oqj - var1_1.t8n) * (double)this.z2d.nextFloat();
                this.oay.zvy(w_0.tmu, var13_12, var15_16, var17_19, 0.0, 0.0, 0.0, new int[0]);
            }
            v1 = var11_9;
        }
        return (boolean)v1;
    }

    @Override
    public boolean ojr(pq1 pq12, ofh ofh2, float f) {
        boolean bl;
        block11: {
            block9: {
                int n = t9d.c();
                if (pq12 != this.tpz) {
                    f = f / 4.0f + 1.0f;
                }
                float f2 = this.x5k * (float)Math.PI / 180.0f;
                float f3 = fe6.rtn(f2);
                float f4 = fe6.ssk(f2);
                try {
                    boolean bl2;
                    block10: {
                        try {
                            try {
                                try {
                                    this.jht = this.o2v + (double)(f3 * 5.0f) + (double)((this.z2d.nextFloat() - 0.5f) * 2.0f);
                                    this.dv9 = this.kfp + (double)(this.z2d.nextFloat() * 3.0f) + 1.0;
                                    this.kyz = this.vbd - (double)(f4 * 5.0f) + (double)((this.z2d.nextFloat() - 0.5f) * 2.0f);
                                    this.hoo = null;
                                    bl2 = ofh2.nra() instanceof ha9;
                                    if (n != 0) break block9;
                                    if (bl2) break block10;
                                }
                                catch (oov oov2) {
                                    throw fcs.a(oov2);
                                }
                                bl = ofh2.yto();
                                if (n != 0) break block11;
                            }
                            catch (oov oov3) {
                                throw fcs.a(oov3);
                            }
                            if (!bl) break block9;
                        }
                        catch (oov oov4) {
                            throw fcs.a(oov4);
                        }
                    }
                    bl2 = this.h1o(ofh2, f);
                }
                catch (oov oov5) {
                    throw fcs.a(oov5);
                }
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean m1t(ofh ofh2, float f) {
        boolean bl;
        block8: {
            block9: {
                int n = t9d.b();
                try {
                    try {
                        try {
                            try {
                                bl = ofh2 instanceof c7o;
                                if (n == 0) break block8;
                                if (!bl) break block9;
                            }
                            catch (oov oov2) {
                                throw fcs.a(oov2);
                            }
                            bl = ((c7o)ofh2).tkn();
                            if (n == 0) break block8;
                        }
                        catch (oov oov3) {
                            throw fcs.a(oov3);
                        }
                        if (!bl) break block9;
                    }
                    catch (oov oov4) {
                        throw fcs.a(oov4);
                    }
                    this.h1o(ofh2, f);
                }
                catch (oov oov5) {
                    throw fcs.a(oov5);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean h1o(ofh ofh2, float f) {
        return super.m1t(ofh2, f);
    }

    @Override
    public void aqu() {
        this._kl();
    }

    @Override
    public void xkp() {
        block50: {
            block54: {
                block53: {
                    int n;
                    int n2;
                    block52: {
                        int n3;
                        block51: {
                            int n4;
                            block49: {
                                int n5;
                                block48: {
                                    block42: {
                                        block47: {
                                            block43: {
                                                block44: {
                                                    block46: {
                                                        block45: {
                                                            int n6;
                                                            int n7;
                                                            block40: {
                                                                long l;
                                                                block41: {
                                                                    l = c ^ 0x6886C1DC953CL;
                                                                    n2 = t9d.c();
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                n7 = ++this.jkn;
                                                                                if (n2 != 0) break block40;
                                                                                if (n7 < 180) break block41;
                                                                            }
                                                                            catch (oov oov2) {
                                                                                throw fcs.a(oov2);
                                                                            }
                                                                            n7 = this.jkn;
                                                                            if (n2 != 0) break block40;
                                                                        }
                                                                        catch (oov oov3) {
                                                                            throw fcs.a(oov3);
                                                                        }
                                                                        if (n7 > 200) break block41;
                                                                    }
                                                                    catch (oov oov4) {
                                                                        throw fcs.a(oov4);
                                                                    }
                                                                    float f = (this.z2d.nextFloat() - 0.5f) * 8.0f;
                                                                    float f2 = (this.z2d.nextFloat() - 0.5f) * 4.0f;
                                                                    float f3 = (this.z2d.nextFloat() - 0.5f) * 8.0f;
                                                                    this.oay.zvy(w_0.ezk, this.o2v + (double)f, this.kfp + 2.0 + (double)f2, this.vbd + (double)f3, 0.0, 0.0, 0.0, new int[0]);
                                                                }
                                                                n7 = this.oay.eir()._s0((String)((Object)fcs.d("w", (int)12480, (long)(0x16081C5A1204F68BL ^ l)))) ? 1 : 0;
                                                            }
                                                            n4 = n7;
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        n3 = this.oay.v0f;
                                                                                        if (n2 != 0) break block42;
                                                                                        if (n3 != 0) break block43;
                                                                                    }
                                                                                    catch (oov oov5) {
                                                                                        throw fcs.a(oov5);
                                                                                    }
                                                                                    n3 = this.jkn;
                                                                                    n5 = 150;
                                                                                    if (n2 != 0) break block44;
                                                                                }
                                                                                catch (oov oov6) {
                                                                                    throw fcs.a(oov6);
                                                                                }
                                                                                if (n3 <= n5) break block45;
                                                                            }
                                                                            catch (oov oov7) {
                                                                                throw fcs.a(oov7);
                                                                            }
                                                                            n3 = this.jkn % 5;
                                                                            if (n2 != 0) break block46;
                                                                        }
                                                                        catch (oov oov8) {
                                                                            throw fcs.a(oov8);
                                                                        }
                                                                        if (n3 != 0) break block45;
                                                                    }
                                                                    catch (oov oov9) {
                                                                        throw fcs.a(oov9);
                                                                    }
                                                                    n3 = n4;
                                                                    if (n2 != 0) break block46;
                                                                }
                                                                catch (oov oov10) {
                                                                    throw fcs.a(oov10);
                                                                }
                                                                if (n3 == 0) break block45;
                                                            }
                                                            catch (oov oov11) {
                                                                throw fcs.a(oov11);
                                                            }
                                                            for (int i = 1000; i > 0; i -= n6) {
                                                                n6 = uno.di5(i);
                                                                try {
                                                                    this.oay.xzq(new uno(this.oay, this.o2v, this.kfp, this.vbd, n6));
                                                                    if (n2 == 0) {
                                                                        if (n2 == 0) continue;
                                                                        break;
                                                                    }
                                                                    break block47;
                                                                }
                                                                catch (oov oov12) {
                                                                    throw fcs.a(oov12);
                                                                }
                                                            }
                                                        }
                                                        n3 = this.jkn;
                                                    }
                                                    n5 = 1;
                                                }
                                                try {
                                                    try {
                                                        if (n2 != 0) break block48;
                                                        if (n3 != n5) break block43;
                                                    }
                                                    catch (oov oov13) {
                                                        throw fcs.a(oov13);
                                                    }
                                                    this.oay.jpe(1018, new mew(this), 0);
                                                }
                                                catch (oov oov14) {
                                                    throw fcs.a(oov14);
                                                }
                                            }
                                            this.vjj(0.0, 0.1f, 0.0);
                                            this.ksw = this.x5k += 20.0f;
                                        }
                                        n3 = this.jkn;
                                    }
                                    try {
                                        if (n2 != 0) break block49;
                                        n5 = 200;
                                    }
                                    catch (oov oov15) {
                                        throw fcs.a(oov15);
                                    }
                                }
                                try {
                                    if (n3 != n5) break block50;
                                    n3 = this.oay.v0f ? 1 : 0;
                                }
                                catch (oov oov16) {
                                    throw fcs.a(oov16);
                                }
                            }
                            try {
                                if (n2 != 0) break block51;
                                if (n3 != 0) break block50;
                            }
                            catch (oov oov17) {
                                throw fcs.a(oov17);
                            }
                            n3 = n4;
                        }
                        try {
                            if (n2 != 0) break block52;
                            if (n3 == 0) break block53;
                        }
                        catch (oov oov18) {
                            throw fcs.a(oov18);
                        }
                        n3 = n = 2000;
                    }
                    while (n > 0) {
                        int n8 = uno.di5(n);
                        n -= n8;
                        try {
                            this.oay.xzq(new uno(this.oay, this.o2v, this.kfp, this.vbd, n8));
                            if (n2 == 0) {
                                if (n2 == 0) continue;
                                break;
                            }
                            break block54;
                        }
                        catch (oov oov19) {
                            throw fcs.a(oov19);
                        }
                    }
                }
                this.n6m(new mew(this.o2v, 64.0, this.vbd));
            }
            this._kl();
        }
    }

    /*
     * Unable to fully structure code
     */
    private void n6m(mew var1_1) {
        block30: {
            var3_2 = 4;
            var4_3 = 12.25;
            var6_4 = 6.25;
            var8_5 = -1;
            var2_7 = t9d.c();
            block24: while (true) {
                v0 = var8_5;
                block25: while (v0 <= 32) {
                    v1 = -4;
                    if (var2_7 != 0) break block30;
                    var9_8 = v1;
                    block26: while (true) {
                        v2 = var9_8;
                        block27: while (v2 <= 4) {
                            v0 = -4;
                            if (var2_7 != 0) continue block25;
                            var10_9 = v0;
                            while (var10_9 <= 4) {
                                block31: {
                                    block34: {
                                        block35: {
                                            block32: {
                                                block33: {
                                                    var11_10 = var9_8 * var9_8 + var10_9 * var10_9;
                                                    try {
                                                        if (var2_7 != 0) break block31;
                                                        cfr_temp_0 = var11_10 - 12.25;
                                                        v2 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                        if (var2_7 != 0) continue block27;
                                                    }
                                                    catch (oov v3) {
                                                        throw fcs.a(v3);
                                                    }
                                                    if (v2 > 0) break block34;
                                                    var13_11 = var1_1.ec4(var9_8, var8_5, var10_9);
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v4 = var8_5;
                                                                    if (var2_7 != 0) break block32;
                                                                    if (v4 < 0) {
                                                                    }
                                                                    ** GOTO lbl58
                                                                }
                                                                catch (oov v5) {
                                                                    throw fcs.a(v5);
                                                                }
                                                                cfr_temp_1 = var11_10 - 6.25;
                                                                v6 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                if (var2_7 != 0) break block33;
                                                            }
                                                            catch (oov v7) {
                                                                throw fcs.a(v7);
                                                            }
                                                            if (v6 > 0) break block34;
                                                        }
                                                        catch (oov v8) {
                                                            throw fcs.a(v8);
                                                        }
                                                        v6 = (double)this.oay.gfy(var13_11, ox_.n6z.l4i());
                                                    }
                                                    catch (oov v9) {
                                                        throw fcs.a(v9);
                                                    }
                                                }
                                                try {
                                                    if (var2_7 == 0) break block34;
lbl58:
                                                    // 2 sources

                                                    v4 = var8_5;
                                                }
                                                catch (oov v10) {
                                                    throw fcs.a(v10);
                                                }
                                            }
                                            try {
                                                block36: {
                                                    try {
                                                        try {
                                                            if (var2_7 != 0) break block35;
                                                            if (v4 <= 0) break block36;
                                                        }
                                                        catch (oov v11) {
                                                            throw fcs.a(v11);
                                                        }
                                                        this.oay.gfy(var13_11, ox_.ibw.l4i());
                                                        if (var2_7 == 0) break block34;
                                                    }
                                                    catch (oov v12) {
                                                        throw fcs.a(v12);
                                                    }
                                                }
                                                v4 = (cfr_temp_2 = var11_10 - 6.25) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                            }
                                            catch (oov v13) {
                                                throw fcs.a(v13);
                                            }
                                        }
                                        try {
                                            block37: {
                                                try {
                                                    try {
                                                        if (var2_7 != 0) break block34;
                                                        if (v4 <= 0) break block37;
                                                    }
                                                    catch (oov v14) {
                                                        throw fcs.a(v14);
                                                    }
                                                    this.oay.gfy(var13_11, ox_.n6z.l4i());
                                                    if (var2_7 == 0) break block34;
                                                }
                                                catch (oov v15) {
                                                    throw fcs.a(v15);
                                                }
                                            }
                                            v4 = (int)this.oay.gfy(var13_11, ox_.ce3.l4i());
                                        }
                                        catch (oov v16) {
                                            throw fcs.a(v16);
                                        }
                                    }
                                    ++var10_9;
                                }
                                if (var2_7 == 0) continue;
                            }
                            ++var9_8;
                            if (var2_7 == 0) continue block26;
                        }
                        break;
                    }
                    ++var8_5;
                    if (var2_7 == 0) continue block24;
                }
                break;
            }
            this.oay.gfy(var1_1, ox_.n6z.l4i());
            v1 = (int)this.oay.gfy(var1_1.nuv(), ox_.n6z.l4i());
        }
        var8_6 = var1_1.z89(2);
        this.oay.gfy(var8_6, ox_.n6z.l4i());
        this.oay.gfy(var8_6.y8e(), ox_.gt8.l4i().zvi(um3.go7, (Comparable)vt2.zk4));
        this.oay.gfy(var8_6.o_8(), ox_.gt8.l4i().zvi(um3.go7, (Comparable)vt2.te4));
        this.oay.gfy(var8_6.idu(), ox_.gt8.l4i().zvi(um3.go7, (Comparable)vt2.mxp));
        this.oay.gfy(var8_6.z6x(), ox_.gt8.l4i().zvi(um3.go7, (Comparable)vt2.z9q));
        this.oay.gfy(var1_1.z89(3), ox_.n6z.l4i());
        this.oay.gfy(var1_1.z89(4), ox_.yoc.l4i());
    }

    @Override
    public void oqm() {
    }

    @Override
    public i2h[] u_g() {
        return this.f11;
    }

    @Override
    public boolean mzu() {
        return false;
    }

    @Override
    public t9d sz5() {
        return this.oay;
    }

    @Override
    public String _n1() {
        long l = c ^ 0x359A99DCF933L;
        return fcs.d("w", (int)12359, (long)(0x5E02E6EC10C31A06L ^ l));
    }

    @Override
    public String wcg() {
        long l = c ^ 0x2F3BD395F64BL;
        return fcs.d("w", (int)30807, (long)(0x45394915D3495D6FL ^ l));
    }

    @Override
    public float o23() {
        return 5.0f;
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

                fcs.c = c.a(4300763944594949566L, 7747333745432450937L, MethodHandles.lookup().lookupClass()).a(149847426396207L);
                fcs.h = new HashMap<K, V>(13);
                var0 = fcs.c ^ 14473041556363L;
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
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "o%\u000f\u00ffg\u00d8\u0017eeIh\u0090Q\u00d9\u0014\u0006\u001d\u00d9\u00bf\u0086G\u00e7\u0005\u00df=\u00d3cz\u00c3\u00fe=\u00b8\u00e6\u00b3#\u00f9\u00cc\u0092\u00dd\u00ad(\u00ee\u00d9\u00de\u00bdk\u00f1\u00e8\u00d4Zg\u0013\u0095\u00c5\u000f|\u00ef\u00a2\b#\u00ba\u0090\u009f\u0082\u0098v\u00f7\u0005F\u00a70\u00f2\u0092\u0018\u00d3\u0099(\u0088\u008a]\u0094\u00100GZ\u00f3\u009f\u00ec\u00d0\u00fa\u0094}\u00de\u00cd\u0007\u00cc\u00bb&\u0018\u00ce_\u0016\t\u0018\u00a0\u00dcG\u0093@z.\u00ab\u00b5(XB\u00ae\u00eb}\u00b9\u0016\u00e2s\u0018^\u0088\f\u0010\u00caz\u00c0\u0098u\u0012@{\u00ce\u0016\u00fd\u0098\u007f1\u00d6\u00eb\u00c7>\u008fE\u0010.h[^\u00a5\u00f04>\u00c6\u00c15s\u00ff\u00baS?\u0010\u00dcDYp\u00b9\u00cf\u0088\u00b1G\u008azh\u00fa\u00d4\u00e9\u00ed\u0010\u00ff_\u000bnkj\u0094\u00b1\u00ea\u0085\u00b1u\u00fe<|A\u0010\u00f8\u001a\u0017\u00df\u00ef\u00c1\u009ec\u00c7Qv8\u00c3\u00b3EF";
                var8_6 = "o%\u000f\u00ffg\u00d8\u0017eeIh\u0090Q\u00d9\u0014\u0006\u001d\u00d9\u00bf\u0086G\u00e7\u0005\u00df=\u00d3cz\u00c3\u00fe=\u00b8\u00e6\u00b3#\u00f9\u00cc\u0092\u00dd\u00ad(\u00ee\u00d9\u00de\u00bdk\u00f1\u00e8\u00d4Zg\u0013\u0095\u00c5\u000f|\u00ef\u00a2\b#\u00ba\u0090\u009f\u0082\u0098v\u00f7\u0005F\u00a70\u00f2\u0092\u0018\u00d3\u0099(\u0088\u008a]\u0094\u00100GZ\u00f3\u009f\u00ec\u00d0\u00fa\u0094}\u00de\u00cd\u0007\u00cc\u00bb&\u0018\u00ce_\u0016\t\u0018\u00a0\u00dcG\u0093@z.\u00ab\u00b5(XB\u00ae\u00eb}\u00b9\u0016\u00e2s\u0018^\u0088\f\u0010\u00caz\u00c0\u0098u\u0012@{\u00ce\u0016\u00fd\u0098\u007f1\u00d6\u00eb\u00c7>\u008fE\u0010.h[^\u00a5\u00f04>\u00c6\u00c15s\u00ff\u00baS?\u0010\u00dcDYp\u00b9\u00cf\u0088\u00b1G\u008azh\u00fa\u00d4\u00e9\u00ed\u0010\u00ff_\u000bnkj\u0094\u00b1\u00ea\u0085\u00b1u\u00fe<|A\u0010\u00f8\u001a\u0017\u00df\u00ef\u00c1\u009ec\u00c7Qv8\u00c3\u00b3EF".length();
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
                    var9_3[var7_4++] = fcs.d(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u007f\u0085b\u0005u\u0089?\u0087(\u00c5QL\u00ec\t\u0095\u0001(J\u00ce\u00ea\u001ad\u00e6\u009b\u00b1\u00d5\"\u00bd\u00b3\u0019+ScF\u000e\u00d2'\u00e1Q\u00fd\u00ea\u00db?T>B5O\u009c\u001f\u008c\u00fd:\u0084j!\u00ff";
                    var8_6 = "\u007f\u0085b\u0005u\u0089?\u0087(\u00c5QL\u00ec\t\u0095\u0001(J\u00ce\u00ea\u001ad\u00e6\u009b\u00b1\u00d5\"\u00bd\u00b3\u0019+ScF\u000e\u00d2'\u00e1Q\u00fd\u00ea\u00db?T>B5O\u009c\u001f\u008c\u00fd:\u0084j!\u00ff".length();
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
                    var9_3[var7_4++] = fcs.d(var10_9).intern();
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
        fcs.d = var9_3;
        fcs.g = new String[11];
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String d(byte[] byArray) {
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

    private static String d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2C5A;
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
                throw new RuntimeException("fcs", exception);
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
            fcs.g[n2] = fcs.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fcs.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("fcs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fcs.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

