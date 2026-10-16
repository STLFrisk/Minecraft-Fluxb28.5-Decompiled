/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C03PacketPlayer$C04PacketPlayerPosition;
import net.minecraft.network.play.client.C13PacketPlayerAbilities;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S27PacketExplosion;

public class bb5
extends j1s {
    public static cn7 r02;
    public static c_3 s2e;
    public static crk wpc;
    public static cn7 cwj;
    public static cn7 __u;
    public static crk u_q;
    public static crk duw;
    public static crk m7n;
    private ArrayList jbr;
    public q6h yli;
    public q6h vkn;
    public boolean o86;
    public boolean cbq;
    public boolean k45;
    public double vxv;
    public double[] h80;
    public double io_;
    public double czg;
    public int u4g;
    public int dvc;
    public int d3a;
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public bb5() {
        long l = a ^ 0x5E24A100017L;
        super((String)((Object)bb5.a("b", (int)23823, (long)(0x1CAA080EE2916D0EL ^ l))), (String)((Object)bb5.a("b", (int)20019, (long)(0xD1BD2C3B0D4FE27L ^ l))));
        this.jbr = new ArrayList();
        this.yli = new q6h();
        this.vkn = new q6h();
    }

    @jev
    public void wvy(wbh wbh2) {
        block10: {
            wbh wbh3;
            block8: {
                int n = t9d.c();
                try {
                    block9: {
                        try {
                            try {
                                try {
                                    wbh3 = wbh2;
                                    if (n != 0) break block8;
                                    if (wbh3.nlg() instanceof S12PacketEntityVelocity) break block9;
                                }
                                catch (oov oov2) {
                                    throw bb5.a(oov2);
                                }
                                wbh3 = wbh2;
                                if (n != 0) break block8;
                            }
                            catch (oov oov3) {
                                throw bb5.a(oov3);
                            }
                            if (!(wbh3.nlg() instanceof S27PacketExplosion)) break block10;
                        }
                        catch (oov oov4) {
                            throw bb5.a(oov4);
                        }
                    }
                    wbh3 = wbh2;
                }
                catch (oov oov5) {
                    throw bb5.a(oov5);
                }
            }
            wbh3.wxi(true);
        }
    }

    @jev
    public void djx(ihr ihr2) {
        block22: {
            block24: {
                boolean bl;
                mz2 mz22;
                int n;
                block23: {
                    block20: {
                        n = t9d.b();
                        mz22 = ihr2.bbi();
                        try {
                            block21: {
                                try {
                                    try {
                                        try {
                                            bl = __u.g7m();
                                            if (n == 0) break block20;
                                            if (bl) break block21;
                                        }
                                        catch (oov oov2) {
                                            throw bb5.a(oov2);
                                        }
                                        bl = this.cbq;
                                        if (n == 0) break block20;
                                    }
                                    catch (oov oov3) {
                                        throw bb5.a(oov3);
                                    }
                                    if (bl) break block22;
                                }
                                catch (oov oov4) {
                                    throw bb5.a(oov4);
                                }
                            }
                            bl = j83.ef8.gln();
                        }
                        catch (oov oov5) {
                            throw bb5.a(oov5);
                        }
                    }
                    try {
                        try {
                            if (n == 0) break block23;
                            if (!bl) break block22;
                        }
                        catch (oov oov6) {
                            throw bb5.a(oov6);
                        }
                        bl = mz22 instanceof C03PacketPlayer;
                    }
                    catch (oov oov7) {
                        throw bb5.a(oov7);
                    }
                }
                try {
                    block25: {
                        try {
                            try {
                                try {
                                    if (n == 0) break block24;
                                    if (bl) break block25;
                                }
                                catch (oov oov8) {
                                    throw bb5.a(oov8);
                                }
                                bl = mz22 instanceof C13PacketPlayerAbilities;
                                if (n == 0) break block24;
                            }
                            catch (oov oov9) {
                                throw bb5.a(oov9);
                            }
                            if (!bl) break block22;
                        }
                        catch (oov oov10) {
                            throw bb5.a(oov10);
                        }
                    }
                    bl = this.jbr.add(mz22);
                }
                catch (oov oov11) {
                    throw bb5.a(oov11);
                }
            }
            ihr2.wxi(true);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void w4v() {
        block25: {
            block24: {
                block22: {
                    block23: {
                        block21: {
                            block19: {
                                block20: {
                                    var1_1 = bb5.a ^ 10018734069561L;
                                    var3_2 = t9d.b();
                                    try {
                                        v0 = this;
                                        cfr_temp_0 = this.wyl.vg8.o_8 - 3.0f;
                                        v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                        if (var3_2 == 0) break block19;
                                        if (v1 < 0) break block20;
                                    }
                                    catch (oov v2) {
                                        throw bb5.a(v2);
                                    }
                                    v1 = (float)true;
                                    break block19;
                                }
                                v1 = (float)false;
                            }
                            try {
                                try {
                                    v0.k45 = v1;
                                    v3 = this.k45;
                                    if (var3_2 == 0) break block21;
                                    if (!v3) {
                                    }
                                    ** GOTO lbl84
                                }
                                catch (oov v4) {
                                    throw bb5.a(v4);
                                }
                                v3 = p_c.xec(0.01);
                            }
                            catch (oov v5) {
                                throw bb5.a(v5);
                            }
                        }
                        try {
                            try {
                                if (var3_2 == 0) break block22;
                                if (v3) break block23;
                            }
                            catch (oov v6) {
                                throw bb5.a(v6);
                            }
                            kgt.obu.yse(false);
                            zet.gn0((String)bb5.a("b", (int)365, (long)(847243749811775051L ^ var1_1)), (String)bb5.a("b", (int)24861, (long)(9082039252046415420L ^ var1_1)), jgv$vro.ak0);
                            p_c.u7g(0.0);
                            return;
                        }
                        catch (oov v7) {
                            throw bb5.a(v7);
                        }
                    }
                    try {
                        v8 = this.vkn;
                        if (var3_2 == 0) break block24;
                        v3 = v8.hqu(1000.0);
                    }
                    catch (oov v9) {
                        throw bb5.a(v9);
                    }
                }
                try {
                    if (!v3) {
                        kgt.obu.yse(false);
                        zet.gn0((String)bb5.a("b", (int)31538, (long)(4826001133267393545L ^ var1_1)), (String)bb5.a("b", (int)16943, (long)(9197636307039298839L ^ var1_1)), jgv$vro.ak0);
                        p_c.u7g(0.0);
                        return;
                    }
                }
                catch (oov v10) {
                    throw bb5.a(v10);
                }
                this.io_ = 0.0;
                this.vkn.u1k();
                this.jbr.clear();
                v8 = this.yli;
            }
            try {
                v8.u1k();
                this.vxv = 0.005;
                this.d3a = 0;
                this.u4g = 0;
                this.dvc = 0;
                this.cbq = false;
                this.o86 = false;
                if (var3_2 != 0) break block25;
lbl84:
                // 2 sources

                zet.gn0((String)bb5.a("b", (int)31538, (long)(4826001133267393545L ^ var1_1)), (String)bb5.a("b", (int)25062, (long)(5358621106702157514L ^ var1_1)), jgv$vro.h_d);
            }
            catch (oov v11) {
                throw bb5.a(v11);
            }
        }
        super.w4v();
    }

    @Override
    public void i__() {
        bb5 bb52;
        block8: {
            block9: {
                int n = t9d.c();
                try {
                    try {
                        try {
                            try {
                                bb52 = this;
                                if (n != 0) break block8;
                                if (bb52.k45) break block9;
                            }
                            catch (oov oov2) {
                                throw bb5.a(oov2);
                            }
                            this.wyl.z8v().qeu = 1.0f;
                            bb52 = this;
                            if (n != 0) break block8;
                        }
                        catch (oov oov3) {
                            throw bb5.a(oov3);
                        }
                        if (bb52.jbr.isEmpty()) break block9;
                    }
                    catch (oov oov4) {
                        throw bb5.a(oov4);
                    }
                    this.qup();
                }
                catch (oov oov5) {
                    throw bb5.a(oov5);
                }
            }
            p_c.u7g(0.2);
            bb52 = this;
        }
        super.i__();
    }

    public void qup() {
        block5: {
            long l = a ^ 0xBCFDDFB4B73L;
            int n = t9d.c();
            if (j83.ef8.gln()) {
                ncl.zpu(bb5.a("b", (int)5389, (long)(0x6EE9354DC0616E62L ^ l)));
                for (mz2 mz22 : this.jbr) {
                    try {
                        this.wyl.c02()._m3().r92(mz22);
                        if (n == 0) {
                            if (n == 0) continue;
                            break;
                        }
                        break block5;
                    }
                    catch (oov oov2) {
                        throw bb5.a(oov2);
                    }
                }
                this.jbr.clear();
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @jev
    public void da6(fz2 var1_1) {
        block94: {
            block90: {
                block116: {
                    block123: {
                        block121: {
                            block119: {
                                block117: {
                                    block114: {
                                        block113: {
                                            block112: {
                                                block111: {
                                                    block110: {
                                                        block108: {
                                                            block105: {
                                                                block107: {
                                                                    block106: {
                                                                        block104: {
                                                                            block99: {
                                                                                block102: {
                                                                                    block103: {
                                                                                        block100: {
                                                                                            block101: {
                                                                                                block133: {
                                                                                                    block95: {
                                                                                                        block96: {
                                                                                                            block97: {
                                                                                                                block98: {
                                                                                                                    block131: {
                                                                                                                        block130: {
                                                                                                                            block93: {
                                                                                                                                block91: {
                                                                                                                                    block92: {
                                                                                                                                        block127: {
                                                                                                                                            block126: {
                                                                                                                                                block125: {
                                                                                                                                                    block124: {
                                                                                                                                                        var2_2 = bb5.a ^ 100266995455807L;
                                                                                                                                                        var4_3 = t9d.c();
                                                                                                                                                        v0 = this;
                                                                                                                                                        if (var4_3 != 0) break block90;
                                                                                                                                                        if (v0.k45) ** GOTO lbl338
                                                                                                                                                        break block124;
                                                                                                                                                        catch (Throwable v1) {
                                                                                                                                                            throw bb5.a(v1);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v2 = bb5.__u.g7m();
                                                                                                                                                    if (var4_3 != 0) break block91;
                                                                                                                                                    break block125;
                                                                                                                                                    catch (Throwable v3) {
                                                                                                                                                        throw bb5.a(v3);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (v2 == 0) break block92;
                                                                                                                                                break block126;
                                                                                                                                                catch (Throwable v4) {
                                                                                                                                                    throw bb5.a(v4);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            kgt.nd5.kl3.zay();
                                                                                                                                            v2 = (int)this.yli.hqu(2300.0);
                                                                                                                                            if (var4_3 != 0) break block91;
                                                                                                                                            break block127;
                                                                                                                                            catch (Throwable v5) {
                                                                                                                                                throw bb5.a(v5);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            block128: {
                                                                                                                                                if (v2 == 0) break block92;
                                                                                                                                                break block128;
                                                                                                                                                catch (Throwable v6) {
                                                                                                                                                    throw bb5.a(v6);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            this.qup();
                                                                                                                                            this.yli.u1k();
                                                                                                                                        }
                                                                                                                                        catch (Throwable v7) {
                                                                                                                                            throw bb5.a(v7);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    this.wyl.vg8.fqc(true);
                                                                                                                                    v2 = (int)this.vkn.hqu(bb5.u_q.u7t());
                                                                                                                                }
                                                                                                                                if (var4_3 != 0) break block93;
                                                                                                                                try {
                                                                                                                                    block129: {
                                                                                                                                        if (v2 == 0) break block94;
                                                                                                                                        break block129;
                                                                                                                                        catch (Throwable v8) {
                                                                                                                                            throw bb5.a(v8);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v2 = this.o86;
                                                                                                                                }
                                                                                                                                catch (Throwable v9) {
                                                                                                                                    throw bb5.a(v9);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (var4_3 != 0) break block95;
                                                                                                                            if (v2 != 0) break block96;
                                                                                                                            break block130;
                                                                                                                            catch (Throwable v10) {
                                                                                                                                throw bb5.a(v10);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        this.o86 = true;
                                                                                                                        this.czg = p_c.tz6();
                                                                                                                        if (var4_3 != 0) break block97;
                                                                                                                        break block131;
                                                                                                                        catch (Throwable v11) {
                                                                                                                            throw bb5.a(v11);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        block132: {
                                                                                                                            if (!bb5.cwj.g7m()) break block98;
                                                                                                                            break block132;
                                                                                                                            catch (Throwable v12) {
                                                                                                                                throw bb5.a(v12);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        this._ap(false, (int)bb5.duw.u7t() + p_c.vmu());
                                                                                                                    }
                                                                                                                    catch (Throwable v13) {
                                                                                                                        throw bb5.a(v13);
                                                                                                                    }
                                                                                                                }
                                                                                                                this.wyl.vg8.xv1();
                                                                                                                this.h80 = new double[]{this.wyl.vg8.o2v, this.wyl.vg8.kfp, this.wyl.vg8.vbd};
                                                                                                            }
                                                                                                            return;
                                                                                                        }
                                                                                                        try {
                                                                                                            ++this.d3a;
                                                                                                            v14 = this;
                                                                                                            if (var4_3 != 0) break block99;
                                                                                                            cfr_temp_0 = (float)v14.d3a - bb5.wpc.d7c().floatValue();
                                                                                                            v2 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                                                        }
                                                                                                        catch (Throwable v15) {
                                                                                                            throw bb5.a(v15);
                                                                                                        }
                                                                                                    }
                                                                                                    if (v2 >= 0) ** GOTO lbl141
                                                                                                    v16 = this.wyl.gze;
                                                                                                    v17 = bb5.s2e.wyk((String)bb5.a("b", (int)32336, (long)(7134159983542262139L ^ var2_2)));
                                                                                                    if (var4_3 != 0) break block100;
                                                                                                    break block133;
                                                                                                    catch (Throwable v18) {
                                                                                                        throw bb5.a(v18);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    block134: {
                                                                                                        if (!v17) break block101;
                                                                                                        break block134;
                                                                                                        catch (Throwable v19) {
                                                                                                            throw bb5.a(v19);
                                                                                                        }
                                                                                                    }
                                                                                                    v20 = 100.0f;
                                                                                                    break block102;
                                                                                                }
                                                                                                catch (Throwable v21) {
                                                                                                    throw bb5.a(v21);
                                                                                                }
                                                                                            }
                                                                                            v17 = bb5.s2e.wyk((String)bb5.a("b", (int)6072, (long)(5722017306907226268L ^ var2_2)));
                                                                                        }
                                                                                        try {
                                                                                            if (!v17) break block103;
                                                                                            v20 = 5.0f;
                                                                                            break block102;
                                                                                        }
                                                                                        catch (Throwable v22) {
                                                                                            throw bb5.a(v22);
                                                                                        }
                                                                                    }
                                                                                    v20 = 1.0f;
                                                                                }
                                                                                try {
                                                                                    v16.qeu = v20;
                                                                                    if (var4_3 == 0) break block104;
lbl141:
                                                                                    // 2 sources

                                                                                    v14 = this;
                                                                                }
                                                                                catch (Throwable v23) {
                                                                                    throw bb5.a(v23);
                                                                                }
                                                                            }
                                                                            v14.wyl.gze.qeu = 1.0f;
                                                                        }
                                                                        if (!bb5.s2e.wyk((String)bb5.a("b", (int)12071, (long)(6842211398448810012L ^ var2_2)))) break block105;
                                                                        try {
                                                                            block135: {
                                                                                v24 = this.wyl.gze;
                                                                                if (this.d3a % 2 != 0) break block106;
                                                                                break block135;
                                                                                catch (Throwable v25) {
                                                                                    throw bb5.a(v25);
                                                                                }
                                                                            }
                                                                            v26 = 5.0f;
                                                                            break block107;
                                                                        }
                                                                        catch (Throwable v27) {
                                                                            throw bb5.a(v27);
                                                                        }
                                                                    }
                                                                    v26 = 0.5f;
                                                                }
                                                                v24.qeu = v26;
                                                            }
                                                            try {
                                                                String.class.getMethods()[76].getName();
                                                            }
                                                            catch (Throwable var5_4) {
                                                                this.wyl.vg8.mop = 0.0;
                                                                this.wyl.vg8.b_6 = 0.0;
                                                                this.wyl.vg8._ge = 0.0f;
                                                            }
                                                            try {
                                                                block109: {
                                                                    try {
                                                                        try {
                                                                            v28 = this.dvc;
                                                                            if (var4_3 != 0) break block108;
                                                                            if (v28 >= 1) break block109;
                                                                        }
                                                                        catch (Throwable v29) {
                                                                            throw bb5.a(v29);
                                                                        }
                                                                        kgt.nd5.kl3.zay();
                                                                        if (var4_3 == 0) break block110;
                                                                    }
                                                                    catch (Throwable v30) {
                                                                        throw bb5.a(v30);
                                                                    }
                                                                }
                                                                v28 = (int)this.cbq;
                                                            }
                                                            catch (Throwable v31) {
                                                                throw bb5.a(v31);
                                                            }
                                                        }
                                                        try {
                                                            try {
                                                                if (var4_3 != 0) break block111;
                                                                if (v28 != 0) break block110;
                                                            }
                                                            catch (Throwable v32) {
                                                                throw bb5.a(v32);
                                                            }
                                                            this.cbq = true;
                                                            this.qup();
                                                        }
                                                        catch (Throwable v33) {
                                                            throw bb5.a(v33);
                                                        }
                                                    }
                                                    v28 = (int)j83.ef8.gln();
                                                }
                                                try {
                                                    try {
                                                        if (var4_3 != 0) break block112;
                                                        if (v28 == 0) break block94;
                                                    }
                                                    catch (Throwable v34) {
                                                        throw bb5.a(v34);
                                                    }
                                                    v28 = this.dvc;
                                                }
                                                catch (Throwable v35) {
                                                    throw bb5.a(v35);
                                                }
                                            }
                                            try {
                                                try {
                                                    v36 = 1;
                                                    if (var4_3 != 0) break block113;
                                                    if (v28 <= v36) break block94;
                                                }
                                                catch (Throwable v37) {
                                                    throw bb5.a(v37);
                                                }
                                                v28 = ++this.u4g;
                                                v36 = 1;
                                            }
                                            catch (Throwable v38) {
                                                throw bb5.a(v38);
                                            }
                                        }
                                        try {
                                            block115: {
                                                try {
                                                    try {
                                                        if (var4_3 != 0) break block114;
                                                        if (v28 != v36) break block115;
                                                    }
                                                    catch (Throwable v39) {
                                                        throw bb5.a(v39);
                                                    }
                                                    this.vxv *= -0.9466666579246521;
                                                    if (var4_3 == 0) break block116;
                                                }
                                                catch (Throwable v40) {
                                                    throw bb5.a(v40);
                                                }
                                            }
                                            v28 = this.u4g;
                                            v36 = 2;
                                        }
                                        catch (Throwable v41) {
                                            throw bb5.a(v41);
                                        }
                                    }
                                    try {
                                        block118: {
                                            try {
                                                try {
                                                    if (var4_3 != 0) break block117;
                                                    if (v28 != v36) break block118;
                                                }
                                                catch (Throwable v42) {
                                                    throw bb5.a(v42);
                                                }
                                                this.vxv += 0.001449999981559813;
                                                if (var4_3 == 0) break block116;
                                            }
                                            catch (Throwable v43) {
                                                throw bb5.a(v43);
                                            }
                                        }
                                        v28 = this.u4g;
                                        v36 = 3;
                                    }
                                    catch (Throwable v44) {
                                        throw bb5.a(v44);
                                    }
                                }
                                try {
                                    block120: {
                                        try {
                                            try {
                                                if (var4_3 != 0) break block119;
                                                if (v28 != v36) break block120;
                                            }
                                            catch (Throwable v45) {
                                                throw bb5.a(v45);
                                            }
                                            this.vxv += 0.001449999981559813;
                                            if (var4_3 == 0) break block116;
                                        }
                                        catch (Throwable v46) {
                                            throw bb5.a(v46);
                                        }
                                    }
                                    v28 = this.u4g;
                                    v36 = 4;
                                }
                                catch (Throwable v47) {
                                    throw bb5.a(v47);
                                }
                            }
                            try {
                                try {
                                    block122: {
                                        try {
                                            try {
                                                if (var4_3 != 0) break block121;
                                                if (v28 != v36) break block122;
                                            }
                                            catch (Throwable v48) {
                                                throw bb5.a(v48);
                                            }
                                            this.vxv += 0.001449999981559813;
                                            if (var4_3 == 0) break block116;
                                        }
                                        catch (Throwable v49) {
                                            throw bb5.a(v49);
                                        }
                                    }
                                    v50 = this;
                                    if (var4_3 != 0) break block123;
                                }
                                catch (Throwable v51) {
                                    throw bb5.a(v51);
                                }
                                v28 = v50.u4g;
                                v36 = 5;
                            }
                            catch (Throwable v52) {
                                throw bb5.a(v52);
                            }
                        }
                        try {
                            if (v28 != v36) break block116;
                            this.vxv += 0.0010000000474974513;
                            v50 = this;
                        }
                        catch (Throwable v53) {
                            throw bb5.a(v53);
                        }
                    }
                    v50.u4g = 0;
                }
                try {
                    var1_1.o4n(this.wyl.vg8.kfp + this.vxv);
                    if (var4_3 == 0) break block94;
lbl338:
                    // 2 sources

                    this.wyl.vg8.mop = 0.0;
                    this.wyl.vg8.b_6 = 0.0;
                    v0 = this;
                }
                catch (Throwable v54) {
                    throw bb5.a(v54);
                }
            }
            v0.wyl.vg8._ge = 0.0f;
            p_c.u7g(i4o.ewf.d7c().floatValue());
        }
    }

    public double zo_(double d) {
        return d * (double)(0.2f * (float)p_c.vvc());
    }

    @jev
    public void ly5(q8e q8e2) {
        double d = this.wyl.vg8.o2v - this.wyl.vg8.bc1;
        double d2 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
        this.io_ = Math.sqrt(d * d + d2 * d2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @jev
    public void gvq(_qa var1_1) {
        block47: {
            block52: {
                block49: {
                    block54: {
                        block55: {
                            block53: {
                                block50: {
                                    block48: {
                                        block45: {
                                            var2_2 = t9d.b();
                                            try {
                                                block46: {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v0 = this.vkn.hqu(bb5.u_q.u7t());
                                                                    if (var2_2 == 0) break block45;
                                                                    if (v0 != 0) break block46;
                                                                }
                                                                catch (oov v1) {
                                                                    throw bb5.a(v1);
                                                                }
                                                                v0 = this.k45;
                                                                if (var2_2 == 0) break block45;
                                                            }
                                                            catch (oov v2) {
                                                                throw bb5.a(v2);
                                                            }
                                                            if (v0 != 0) break block46;
                                                        }
                                                        catch (oov v3) {
                                                            throw bb5.a(v3);
                                                        }
                                                        var1_1.oz6(0.0);
                                                        var1_1.sqi(0.0);
                                                        if (var2_2 != 0) break block47;
                                                    }
                                                    catch (oov v4) {
                                                        throw bb5.a(v4);
                                                    }
                                                }
                                                v0 = this.k45;
                                            }
                                            catch (oov v5) {
                                                throw bb5.a(v5);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (var2_2 == 0) break block48;
                                                    if (v0 != 0) break block47;
                                                }
                                                catch (oov v6) {
                                                    throw bb5.a(v6);
                                                }
                                                v7 = this;
                                                if (var2_2 == 0) break block49;
                                            }
                                            catch (oov v8) {
                                                throw bb5.a(v8);
                                            }
                                            v0 = v7.dvc;
                                        }
                                        catch (oov v9) {
                                            throw bb5.a(v9);
                                        }
                                    }
                                    try {
                                        block51: {
                                            try {
                                                try {
                                                    try {
                                                        if (v0 != 1) {
                                                            v10 = this;
                                                            if (var2_2 == 0) break block50;
                                                        }
                                                        ** GOTO lbl112
                                                    }
                                                    catch (oov v11) {
                                                        throw bb5.a(v11);
                                                    }
                                                    if (v10.dvc != 2) break block51;
                                                }
                                                catch (oov v12) {
                                                    throw bb5.a(v12);
                                                }
                                                this.dvc = 3;
                                                this.czg *= 2.149999;
                                                if (var2_2 != 0) break block52;
                                            }
                                            catch (oov v13) {
                                                throw bb5.a(v13);
                                            }
                                        }
                                        v10 = this;
                                    }
                                    catch (oov v14) {
                                        throw bb5.a(v14);
                                    }
                                }
                                var3_3 = v10.wyl.tij.bb4(this.wyl.vg8, this.wyl.vg8.rhs().sy_(0.0, this.wyl.vg8.mop, 0.0));
                                try {
                                    try {
                                        try {
                                            v15 = var3_3.size();
                                            if (var2_2 == 0) break block53;
                                            if (v15 <= 0) {
                                            }
                                            ** GOTO lbl102
                                        }
                                        catch (oov v16) {
                                            throw bb5.a(v16);
                                        }
                                        v17 = this;
                                        if (var2_2 == 0) break block54;
                                    }
                                    catch (oov v18) {
                                        throw bb5.a(v18);
                                    }
                                    v15 = (int)v17.wyl.vg8.fcv;
                                }
                                catch (oov v19) {
                                    throw bb5.a(v19);
                                }
                            }
                            try {
                                if (v15 == 0) break block55;
lbl102:
                                // 2 sources

                                this.dvc = 1;
                            }
                            catch (oov v20) {
                                throw bb5.a(v20);
                            }
                        }
                        v17 = this;
                    }
                    try {
                        v17.czg = this.io_ - this.io_ / 159.0;
                        if (var2_2 != 0) break block52;
lbl112:
                        // 2 sources

                        this.dvc = 2;
                        v7 = this;
                    }
                    catch (oov v21) {
                        throw bb5.a(v21);
                    }
                }
                v7.czg = (double)bb5.m7n.d7c().floatValue() * 3.3 / 2.249999 * 0.2873 + this.zo_(0.2873) / 2.149999;
            }
            try {
                v22 = this;
                v23 = bb5.cwj.d7c() != false ? this.czg : p_c.tz6();
            }
            catch (oov v24) {
                throw bb5.a(v24);
            }
            try {
                block56: {
                    try {
                        try {
                            v22.czg = Math.max(v23, p_c.tz6());
                            if (!bb5.r02.g7m() || fyk.kfa == null) break block56;
                        }
                        catch (oov v25) {
                            throw bb5.a(v25);
                        }
                        this.wyl.gze.qeu = 1.0f;
                        vxv.kax(var1_1, this.czg, fyk.kfa);
                        if (var2_2 != 0) break block47;
                    }
                    catch (oov v26) {
                        throw bb5.a(v26);
                    }
                }
                ohv.o0x(var1_1, this.czg);
            }
            catch (oov v27) {
                throw bb5.a(v27);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void _ap(boolean var1_1, int var2_2) {
        block29: {
            block37: {
                block31: {
                    block33: {
                        block34: {
                            block32: {
                                block30: {
                                    block28: {
                                        var3_3 = t9d.c();
                                        var4_4 = c05.vz1();
                                        try {
                                            v0 = var4_4.vg8.lfk;
                                            if (var3_3 != 0) break block28;
                                            if (v0 == 0) break block29;
                                        }
                                        catch (oov v1) {
                                            throw bb5.a(v1);
                                        }
                                        v0 = var2_2;
                                    }
                                    try {
                                        if (var3_3 != 0) break block30;
                                        if (v0 <= 0) break block29;
                                    }
                                    catch (oov v2) {
                                        throw bb5.a(v2);
                                    }
                                    v0 = (int)var1_1;
                                }
                                try {
                                    if (var3_3 != 0) break block31;
                                    if (v0 != 0) {
                                    }
                                    ** GOTO lbl79
                                }
                                catch (oov v3) {
                                    throw bb5.a(v3);
                                }
                                var5_5 = 0.0625;
                                try {
                                    try {
                                        v4 = var4_4;
                                        if (var3_3 != 0) break block32;
                                        if (v4.c02() == null) break block33;
                                    }
                                    catch (oov v5) {
                                        throw bb5.a(v5);
                                    }
                                    v4 = var4_4;
                                }
                                catch (oov v6) {
                                    throw bb5.a(v6);
                                }
                            }
                            try {
                                v7 = v4.vg8.lfk;
                                if (var3_3 != 0) break block34;
                                if (v7 == 0) break block33;
                            }
                            catch (oov v8) {
                                throw bb5.a(v8);
                            }
                            v7 = var7_7 = 0;
                        }
                        while ((double)var7_7 <= (double)(3 + var2_2) / var5_5) {
                            block36: {
                                block35: {
                                    try {
                                        try {
                                            var4_4.c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(var4_4.vg8.o2v, var4_4.vg8.kfp + var5_5, var4_4.vg8.vbd, false));
                                            if (var3_3 != 0) break block29;
                                            v9 = var4_4.c02()._m3();
                                            v10 = v11;
                                            v12 = v11;
                                            v13 = var4_4.vg8.o2v;
                                            v14 = var4_4.vg8.kfp;
                                            v15 = var4_4.vg8.vbd;
                                            if ((double)var7_7 != (double)(3 + var2_2) / var5_5) break block35;
                                        }
                                        catch (oov v16) {
                                            throw bb5.a(v16);
                                        }
                                        v17 = true;
                                        break block36;
                                    }
                                    catch (oov v18) {
                                        throw bb5.a(v18);
                                    }
                                }
                                v17 = false;
                            }
                            v10(v13, v14, v15, v17);
                            v9.r92(v12);
                            ++var7_7;
                            if (var3_3 == 0) continue;
                        }
                    }
                    try {
                        if (var3_3 == 0) break block29;
lbl79:
                        // 2 sources

                        v0 = (int)var4_4.vg8.lfk;
                    }
                    catch (oov v19) {
                        throw bb5.a(v19);
                    }
                }
                try {
                    try {
                        if (var3_3 != 0) break block37;
                        if (v0 == 0) break block29;
                    }
                    catch (oov v20) {
                        throw bb5.a(v20);
                    }
                    v0 = p_c.vmu() + (bb5.duw.d7c().intValue() - 1);
                }
                catch (oov v21) {
                    throw bb5.a(v21);
                }
            }
            var5_6 = v0;
            for (var6_8 = 0; var6_8 < 49 + var5_6 * 17; ++var6_8) {
                try {
                    var4_4.c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(var4_4.vg8.o2v, var4_4.vg8.kfp + 0.06248, var4_4.vg8.vbd, false));
                    var4_4.c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(var4_4.vg8.o2v, var4_4.vg8.kfp + 1.0E-4, var4_4.vg8.vbd, false));
                    var4_4.c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(var4_4.vg8.o2v, var4_4.vg8.kfp + 1.0E-14, var4_4.vg8.vbd, false));
                    if (var3_3 == 0) {
                        if (var3_3 == 0) continue;
                        break;
                    }
                    break block29;
                }
                catch (oov v22) {
                    throw bb5.a(v22);
                }
            }
            var4_4.c02()._m3().r92(new C03PacketPlayer$C04PacketPlayerPosition(var4_4.vg8.o2v, var4_4.vg8.kfp, var4_4.vg8.vbd, true));
        }
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

                bb5.a = c.a(-7703915087702342942L, 315566200542301488L, MethodHandles.lookup().lookupClass()).a(71826883439905L);
                var9 = bb5.a ^ 72949123373761L;
                bb5.f = new HashMap<K, V>(13);
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
                var7_3 = new String[25];
                var5_4 = 0;
                var4_5 = "`\u00ca\u00a3\u0014\u00a8\u00c7\u00a7c\u001bm\u009eh\u0097\u00ed\u00d5\u0091\u00a8\u0005\u00a3\b\u00b2\tmU\u00a6\u00b5$\u00c2\u00d2\u008a\u00a4G\u0018Q\u001f\u00c9\u00ba]BQ\u00eb\u0000R\u009b\u00ef\u00ec8^@'\u00f6\u00f1\u00e7\u00c8\u0086\u00ac\u0091\u0010YJ\u00c4\u00e3\u00f9\u00c3\u00a4\u00ce\u00c7\u00878\u00fd\u00bf\u0013\u00cb\u0092\u0010\u00020\u00ab\u00c4\u0099\u00ec[\u00af\u00c9\u0005\u00d3\u0082\u00ae\u00832O\u0010\u00a0\u0096\u00c8\u00171uM\u000f\u001ei`\u009d\u0006\u00bd\u00fe\u0081 \u00a9\u0097N\u00da<6\u00aa\u0099\u00bc\u00f3)\u00c8L)V\u00b0P\u00a1\u0090\u009d:\u000b\u008b?\u00d9zPZ\u00d5\u0097\u00a2=(\u008e\u00c2w>\u00a5j\u0003\u00c7\u00e9e\u00af.3\u00ed\u009e\u00ea\u00bc\u00a4\u00ffW@^m\u00f8\u00ba\u00f8\u00118J\u00a0\u001a\u009c\u00bf\u00dd'\u00ef\u0005o\u0087\u00b6\u0010\u00bb'\u008aT\u00a1K@\u00f7\u00f9\u00a8\u00c1\u0082\"9}b\u0018\u007ft>jo\u001eR\u00c19\u00cfM\n\u00fd\u00b7\u0081\u0080?\u00f6\u008ak\u00fd\u0096\u009b?\u0010%\u0012p\u0014?9\"\u0080\u0087\u001d\u00a8\u00e7d\u00e7\u0094\" \u00d1Q\u00f1\u0005f\u009d6\u0088)\u0081\u00c9\u009e\u00ee\u00dd\u00c2\u00b2\u00e4`\u00d8\u00a1(~\u00e9ZE\u00e8\u009e\u0000S\u00bc0\u009f(\u00e2<\u00e5\\\u0007\u0015\u0018I\u00af\u00a4\u00a2\u00f3\u00e98l\u001c\u00cb\u00b2Y\u00a1u\u00ff\u0082\u00c5\u0091\u00a8u\u00052\u00a6\u0084.\u001c\u00b7\u00d5O\u0082\u009b\u00b5\u00cd \u00e1B\u0097A\u00ff\u00b3\u0007&\u009c\f\u001bf\u00c2d\u00cdl\u00fe\u00e8\u00a9\u00ef\u000bk9A\u0091\u00da\u00a9a\u00db<Z\u00e6(U\u001d\u00be{\u00e7%#\u00ce2\u00f4\u00e8&\u009e\u00e8\u00166\u00d0\tA\u0002\u00af~\u000fX\rQ\u00eae]\u00e9\u00fe\u00d4!g\u00bbzS\u0012N\u00a2\u0010N\u009ei\u0098N\u0097\u00d3\u0082\u00a7H\u00ddH\u00f9\u0004\u00e0\u00a5\u0010\u00a4\u00b5\u0095\u00e2\u0094>x\u00e2I\u0005\rT\u00f5\u00ae=\u00a0\u0018\u00c3\u00e2\u00e8!\u000b[\u00df\u001e\u00c6r\\p!6q$\u00f7\u00d7\u00e3\u0019\u0015\u0015'\u008b G9^\u0002n\u0015\u009e\u00d6\\\u0016!\u00a8\u009b\u0080\u009f\u0085\u00d5\u00fe#\u008e-H\u00ceU\u00d8\u00d8pV\u008c\u00f2\u00e7v \u00ac\u0098a%\u00c6k\u00fen\u00d0\u000f\u0014(\u0099\u00b3tG\u00df\u00f4!\u0097k\u00d3\u00c7\u0093_\u008dwb!\u00dd\u001da(\u000b\u00b0\u0092\u0082\u00bb\u00d0\u00c4m\u0084_\u00990\u00e3\u00ba\u00b3Fb\u0006\u00b3\u00f3\u0011\u00fb\u009b\u00d7\u00c4\u00f0\u00fd\u0088\u00d2s!\u00b4\u00a2\u0005i\u00d7\u008dO\u0093\u00a2(\b\u00f0%\u009f\u00fe\u00c1\u008d7\u0092\u00ab\u00ef\u00b2C\u0096\u00b1\u00d2\u00f7\u001f\u0094\u009c\t\u00d0S\u00ea!\u0082\u008a\u00a2\u00c5\u0084\u00a2\u00fd\u00f9g\u00eb\u00c3\u00ccMO\u000e(\u00f7'\u00f2Nv\u00cd@\u00b6\u00d4q\u00c4\u00bd\r\u001a;M\u0001\u00c6\u00efN\u00e2{\f\u008eY\u00c9 i\u00f8\u000fD\u00cd\u00a6\u00f2a\u0092\u00a2\u00e5\u008b\u00e1\u0010\u00f0)\u0090M\u00c0\u00a1\u009e\u00b8gI\u00aeM\u00c5\u00c5\u00a5\\";
                var6_6 = "`\u00ca\u00a3\u0014\u00a8\u00c7\u00a7c\u001bm\u009eh\u0097\u00ed\u00d5\u0091\u00a8\u0005\u00a3\b\u00b2\tmU\u00a6\u00b5$\u00c2\u00d2\u008a\u00a4G\u0018Q\u001f\u00c9\u00ba]BQ\u00eb\u0000R\u009b\u00ef\u00ec8^@'\u00f6\u00f1\u00e7\u00c8\u0086\u00ac\u0091\u0010YJ\u00c4\u00e3\u00f9\u00c3\u00a4\u00ce\u00c7\u00878\u00fd\u00bf\u0013\u00cb\u0092\u0010\u00020\u00ab\u00c4\u0099\u00ec[\u00af\u00c9\u0005\u00d3\u0082\u00ae\u00832O\u0010\u00a0\u0096\u00c8\u00171uM\u000f\u001ei`\u009d\u0006\u00bd\u00fe\u0081 \u00a9\u0097N\u00da<6\u00aa\u0099\u00bc\u00f3)\u00c8L)V\u00b0P\u00a1\u0090\u009d:\u000b\u008b?\u00d9zPZ\u00d5\u0097\u00a2=(\u008e\u00c2w>\u00a5j\u0003\u00c7\u00e9e\u00af.3\u00ed\u009e\u00ea\u00bc\u00a4\u00ffW@^m\u00f8\u00ba\u00f8\u00118J\u00a0\u001a\u009c\u00bf\u00dd'\u00ef\u0005o\u0087\u00b6\u0010\u00bb'\u008aT\u00a1K@\u00f7\u00f9\u00a8\u00c1\u0082\"9}b\u0018\u007ft>jo\u001eR\u00c19\u00cfM\n\u00fd\u00b7\u0081\u0080?\u00f6\u008ak\u00fd\u0096\u009b?\u0010%\u0012p\u0014?9\"\u0080\u0087\u001d\u00a8\u00e7d\u00e7\u0094\" \u00d1Q\u00f1\u0005f\u009d6\u0088)\u0081\u00c9\u009e\u00ee\u00dd\u00c2\u00b2\u00e4`\u00d8\u00a1(~\u00e9ZE\u00e8\u009e\u0000S\u00bc0\u009f(\u00e2<\u00e5\\\u0007\u0015\u0018I\u00af\u00a4\u00a2\u00f3\u00e98l\u001c\u00cb\u00b2Y\u00a1u\u00ff\u0082\u00c5\u0091\u00a8u\u00052\u00a6\u0084.\u001c\u00b7\u00d5O\u0082\u009b\u00b5\u00cd \u00e1B\u0097A\u00ff\u00b3\u0007&\u009c\f\u001bf\u00c2d\u00cdl\u00fe\u00e8\u00a9\u00ef\u000bk9A\u0091\u00da\u00a9a\u00db<Z\u00e6(U\u001d\u00be{\u00e7%#\u00ce2\u00f4\u00e8&\u009e\u00e8\u00166\u00d0\tA\u0002\u00af~\u000fX\rQ\u00eae]\u00e9\u00fe\u00d4!g\u00bbzS\u0012N\u00a2\u0010N\u009ei\u0098N\u0097\u00d3\u0082\u00a7H\u00ddH\u00f9\u0004\u00e0\u00a5\u0010\u00a4\u00b5\u0095\u00e2\u0094>x\u00e2I\u0005\rT\u00f5\u00ae=\u00a0\u0018\u00c3\u00e2\u00e8!\u000b[\u00df\u001e\u00c6r\\p!6q$\u00f7\u00d7\u00e3\u0019\u0015\u0015'\u008b G9^\u0002n\u0015\u009e\u00d6\\\u0016!\u00a8\u009b\u0080\u009f\u0085\u00d5\u00fe#\u008e-H\u00ceU\u00d8\u00d8pV\u008c\u00f2\u00e7v \u00ac\u0098a%\u00c6k\u00fen\u00d0\u000f\u0014(\u0099\u00b3tG\u00df\u00f4!\u0097k\u00d3\u00c7\u0093_\u008dwb!\u00dd\u001da(\u000b\u00b0\u0092\u0082\u00bb\u00d0\u00c4m\u0084_\u00990\u00e3\u00ba\u00b3Fb\u0006\u00b3\u00f3\u0011\u00fb\u009b\u00d7\u00c4\u00f0\u00fd\u0088\u00d2s!\u00b4\u00a2\u0005i\u00d7\u008dO\u0093\u00a2(\b\u00f0%\u009f\u00fe\u00c1\u008d7\u0092\u00ab\u00ef\u00b2C\u0096\u00b1\u00d2\u00f7\u001f\u0094\u009c\t\u00d0S\u00ea!\u0082\u008a\u00a2\u00c5\u0084\u00a2\u00fd\u00f9g\u00eb\u00c3\u00ccMO\u000e(\u00f7'\u00f2Nv\u00cd@\u00b6\u00d4q\u00c4\u00bd\r\u001a;M\u0001\u00c6\u00efN\u00e2{\f\u008eY\u00c9 i\u00f8\u000fD\u00cd\u00a6\u00f2a\u0092\u00a2\u00e5\u008b\u00e1\u0010\u00f0)\u0090M\u00c0\u00a1\u009e\u00b8gI\u00aeM\u00c5\u00c5\u00a5\\".length();
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
                    var7_3[var5_4++] = bb5.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u0086\u0013\u00efxz\u0093\u000f\u00f7sx\u00966\\\u00ab\u00c1\u00ea\u00fb+\u00e9r5\u00bc\u00dc\u001d \u00cdA\u00f5P\u0091\u0015:\u008a\u00e5\u00ab\u00b4\u00f42\u00c4\u00a0\u007fj@\u0016\u0084\u00d1W\u0094L&i\u00e0_\u00975\u00cd\u00e6";
                    var6_6 = "\u0086\u0013\u00efxz\u0093\u000f\u00f7sx\u00966\\\u00ab\u00c1\u00ea\u00fb+\u00e9r5\u00bc\u00dc\u001d \u00cdA\u00f5P\u0091\u0015:\u008a\u00e5\u00ab\u00b4\u00f42\u00c4\u00a0\u007fj@\u0016\u0084\u00d1W\u0094L&i\u00e0_\u00975\u00cd\u00e6".length();
                    var3_7 = 24;
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
                    var7_3[var5_4++] = bb5.b(var8_9).intern();
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
        bb5.d = var7_3;
        bb5.e = new String[25];
        bb5.r02 = new cn7((String)bb5.a("b", (int)20022, (long)(1745571392616178912L ^ var9)), (String)bb5.a("b", (int)19910, (long)(1891874553586689793L ^ var9)), false);
        v7 = new String[4];
        v7[0] = bb5.a("b", (int)3753, (long)(3625847817799328889L ^ var9));
        v7[1] = bb5.a("b", (int)4604, (long)(7617400847497919279L ^ var9));
        v7[2] = bb5.a("b", (int)18333, (long)(7854161765491977561L ^ var9));
        v7[3] = bb5.a("b", (int)23585, (long)(4159642179248436989L ^ var9));
        bb5.s2e = new c_3((String)bb5.a("b", (int)20019, (long)(944512894598456561L ^ var9)), (String)bb5.a("b", (int)1033, (long)(4707079667399651032L ^ var9)), (String)bb5.a("b", (int)30655, (long)(7241005924306099556L ^ var9)), v7);
        bb5.wpc = new crk((String)bb5.a("b", (int)20019, (long)(944512894598456561L ^ var9)), (String)bb5.a("b", (int)16797, (long)(4103798579624815452L ^ var9)), 10.0f, 1.0f, 18.0f, 1.0f);
        bb5.cwj = new cn7((String)bb5.a("b", (int)20019, (long)(944512894598456561L ^ var9)), (String)bb5.a("b", (int)207, (long)(8496720482005543427L ^ var9)), true);
        bb5.__u = new cn7((String)bb5.a("b", (int)20019, (long)(944512894598456561L ^ var9)), (String)bb5.a("b", (int)2122, (long)(7041291387307319954L ^ var9)), false);
        bb5.u_q = new crk((String)bb5.a("b", (int)20019, (long)(944512894598456561L ^ var9)), (String)bb5.a("b", (int)30285, (long)(4689923803276647563L ^ var9)), 200.0f, 0.0f, 1000.0f, 10.0f);
        bb5.duw = new crk((String)bb5.a("b", (int)20019, (long)(944512894598456561L ^ var9)), (String)bb5.a("b", (int)14485, (long)(1054773114575835719L ^ var9)), 1.0f, 0.0f, 4.0f, 1.0f);
        bb5.m7n = new crk((String)bb5.a("b", (int)20019, (long)(944512894598456561L ^ var9)), (String)bb5.a("b", (int)16762, (long)(209948680842062757L ^ var9)), 1.0f, 0.5f, 1.5f, 0.01f);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x77E0;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("bb5", exception);
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
            bb5.e[n2] = bb5.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = bb5.a(n, l);
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
            throw new RuntimeException("bb5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bb5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

