/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C02PacketUseEntity$_y6;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C07PacketPlayerDigging$pl2;
import net.minecraft.network.play.client.C0APacketAnimation;

public class e9p
extends j1s {
    private static g_3 iw2;
    public List oyv;
    private nhs tib;
    private nhs v_r;
    private int j2g;
    private float mbo;
    private float lvb;
    private float ha0;
    private float krz;
    private boolean fuv;
    private float _zh;
    private boolean nrr;
    private int w3_;
    private nhs kb0;
    private int _ea;
    private fz2 oec;
    private boolean s74;
    private int ir7;
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;

    public e9p() {
        long l = a ^ 0x28351438F7C0L;
        super((String)((Object)e9p.a("f", (int)21341, (long)(0x34A0AADC3A6A28E1L ^ l))), (String)((Object)e9p.a("f", (int)19792, (long)(0x53FE7C4E317F36EFL ^ l))));
        this.oyv = new ArrayList();
        this.tib = new nhs();
        this.v_r = new nhs();
        this.kb0 = new nhs();
    }

    @Override
    public void w4v() {
        long l = a ^ 0x4D96B3FD1E7EL;
        super.w4v();
        this.ha0 = this.wyl.vg8.y2i;
        this.lvb = this.wyl.vg8.x5k;
        this.krz = 0.0f;
        this._zh = 0.0f;
        this.nrr = false;
        this.fuv = false;
        this.v6z();
        this.fyu();
        ncl.dob((Object)((Object)syo.aez) + (String)((Object)e9p.a("f", (int)29538, (long)(0x78F85010C5FFE161L ^ l))) + (Object)((Object)syo.rl1) + (String)((Object)e9p.a("f", (int)9696, (long)(0x35F91C8F33B237E4L ^ l))));
    }

    @Override
    public void i__() {
        super.i__();
        iw2 = null;
    }

    @jev
    public void yzl(ccn ccn2) {
        block5: {
            nhs nhs2;
            block4: {
                int n = t9d.c();
                try {
                    try {
                        nhs2 = this.kb0;
                        if (n != 0) break block4;
                        if (!nhs2.yrv(this._ea)) break block5;
                    }
                    catch (oov oov2) {
                        throw e9p.a(oov2);
                    }
                    this.w3_ = 10 + new Random().nextInt(3);
                    this.fyu();
                    nhs2 = this.kb0;
                }
                catch (oov oov3) {
                    throw e9p.a(oov3);
                }
            }
            nhs2.zay();
        }
    }

    @jev
    public void _ut(axn axn2) {
        long l = a ^ 0x7CD0EAB3AC5EL;
        try {
            if (fyk.sy_.d7c().booleanValue()) {
                this.d2z(false);
                zet.gn0((String)((Object)e9p.a("f", (int)24981, (long)(0x6B27C0B8F7BE41B0L ^ l))), this.zkf() + (String)((Object)e9p.a("f", (int)23759, (long)(0x74F3AC880C917CEFL ^ l))), jgv$vro.h_d);
            }
        }
        catch (oov oov2) {
            throw e9p.a(oov2);
        }
    }

    @jev
    public void fv5(fz2 fz22) {
        block72: {
            e9p e9p2;
            block73: {
                float f;
                float f2;
                int n;
                block71: {
                    block70: {
                        float f3;
                        float f4;
                        block69: {
                            block68: {
                                e9p e9p3;
                                block66: {
                                    block67: {
                                        float f5;
                                        block64: {
                                            block65: {
                                                block62: {
                                                    float f6;
                                                    block63: {
                                                        block60: {
                                                            float f7;
                                                            block61: {
                                                                e9p e9p4;
                                                                block58: {
                                                                    block59: {
                                                                        block57: {
                                                                            boolean bl;
                                                                            block55: {
                                                                                block56: {
                                                                                    block53: {
                                                                                        block54: {
                                                                                            this.oec = null;
                                                                                            this.oyv = this.fbs();
                                                                                            n = t9d.b();
                                                                                            try {
                                                                                                bl = fz22.lhw();
                                                                                                if (n == 0) break block53;
                                                                                                if (!bl) break block54;
                                                                                            }
                                                                                            catch (oov oov2) {
                                                                                                throw e9p.a(oov2);
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        bl = this.fje(iw2, false);
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (n == 0) break block55;
                                                                                            if (bl) break block56;
                                                                                        }
                                                                                        catch (oov oov3) {
                                                                                            throw e9p.a(oov3);
                                                                                        }
                                                                                        this.in0(false);
                                                                                    }
                                                                                    catch (oov oov4) {
                                                                                        throw e9p.a(oov4);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    e9p4 = this;
                                                                                    if (n == 0) break block57;
                                                                                    bl = e9p4.fje(iw2, false);
                                                                                }
                                                                                catch (oov oov5) {
                                                                                    throw e9p.a(oov5);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (!bl) {
                                                                                    this.lvb = this.wyl.vg8.x5k;
                                                                                    this.ha0 = this.wyl.vg8.y2i;
                                                                                    return;
                                                                                }
                                                                            }
                                                                            catch (oov oov6) {
                                                                                throw e9p.a(oov6);
                                                                            }
                                                                            e9p4 = this;
                                                                        }
                                                                        try {
                                                                            if (n == 0) break block58;
                                                                            if (e9p4.ecc(false) == iw2) break block59;
                                                                        }
                                                                        catch (oov oov7) {
                                                                            throw e9p.a(oov7);
                                                                        }
                                                                        ncl.zpu(Float.valueOf(this.ea5(this.lvb, iw2)));
                                                                        float[] fArray = this.cwq(iw2, Math.max(10.0f, this.ea5(this.lvb, iw2) * 0.8f), 10 + new Random().nextInt(30), false);
                                                                        this.lvb = fArray[0];
                                                                        this.ha0 = fArray[1];
                                                                    }
                                                                    fz22.h8j(this.lvb);
                                                                    fz22.ni7(this.ha0);
                                                                    e9p4 = this;
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                float f8 = e9p4.krz - 6.0f;
                                                                                f5 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                                                                                if (n == 0) break block60;
                                                                                if (f5 <= 0) break block61;
                                                                            }
                                                                            catch (oov oov8) {
                                                                                throw e9p.a(oov8);
                                                                            }
                                                                            f5 = (float)this.fuv;
                                                                            if (n == 0) break block60;
                                                                        }
                                                                        catch (oov oov9) {
                                                                            throw e9p.a(oov9);
                                                                        }
                                                                        if (f5 == false) break block61;
                                                                    }
                                                                    catch (oov oov10) {
                                                                        throw e9p.a(oov10);
                                                                    }
                                                                    this.fuv = false;
                                                                }
                                                                catch (oov oov11) {
                                                                    throw e9p.a(oov11);
                                                                }
                                                            }
                                                            f5 = (f7 = this.krz - -6.0f) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (n == 0) break block62;
                                                                        if (f5 >= 0) break block63;
                                                                    }
                                                                    catch (oov oov12) {
                                                                        throw e9p.a(oov12);
                                                                    }
                                                                    f5 = (float)this.fuv;
                                                                    if (n == 0) break block62;
                                                                }
                                                                catch (oov oov13) {
                                                                    throw e9p.a(oov13);
                                                                }
                                                                if (f5 != false) break block63;
                                                            }
                                                            catch (oov oov14) {
                                                                throw e9p.a(oov14);
                                                            }
                                                            this.fuv = true;
                                                        }
                                                        catch (oov oov15) {
                                                            throw e9p.a(oov15);
                                                        }
                                                    }
                                                    f5 = (f6 = this._zh - 3.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (n == 0) break block64;
                                                                if (f5 <= 0) break block65;
                                                            }
                                                            catch (oov oov16) {
                                                                throw e9p.a(oov16);
                                                            }
                                                            f5 = (float)this.nrr;
                                                            if (n == 0) break block64;
                                                        }
                                                        catch (oov oov17) {
                                                            throw e9p.a(oov17);
                                                        }
                                                        if (f5 == false) break block65;
                                                    }
                                                    catch (oov oov18) {
                                                        throw e9p.a(oov18);
                                                    }
                                                    this.nrr = false;
                                                }
                                                catch (oov oov19) {
                                                    throw e9p.a(oov19);
                                                }
                                            }
                                            try {
                                                e9p3 = this;
                                                if (n == 0) break block66;
                                                float f9 = e9p3._zh - -3.0f;
                                                f5 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
                                            }
                                            catch (oov oov20) {
                                                throw e9p.a(oov20);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (f5 >= 0) break block67;
                                                    e9p3 = this;
                                                    if (n == 0) break block66;
                                                }
                                                catch (oov oov21) {
                                                    throw e9p.a(oov21);
                                                }
                                                if (e9p3.nrr) break block67;
                                            }
                                            catch (oov oov22) {
                                                throw e9p.a(oov22);
                                            }
                                            this.nrr = true;
                                        }
                                        catch (oov oov23) {
                                            throw e9p.a(oov23);
                                        }
                                    }
                                    e9p3 = this;
                                }
                                try {
                                    e9p e9p5 = e9p3;
                                    f4 = e9p3.krz;
                                    if (!this.fuv) break block68;
                                    f3 = 1.0f;
                                    break block69;
                                }
                                catch (oov oov24) {
                                    throw e9p.a(oov24);
                                }
                            }
                            f3 = -1.0f;
                        }
                        try {
                            e9p5.krz = f4 + f3;
                            e9p e9p6 = this;
                            e9p e9p7 = e9p6;
                            f2 = e9p6._zh;
                            if (!this.nrr) break block70;
                            f = 1.0f;
                            break block71;
                        }
                        catch (oov oov25) {
                            throw e9p.a(oov25);
                        }
                    }
                    f = -1.0f;
                }
                try {
                    try {
                        e9p7._zh = f2 + f;
                        e9p2 = this;
                        if (n == 0) break block72;
                        if (e9p2.ecc(false) != iw2) break block73;
                    }
                    catch (oov oov26) {
                        throw e9p.a(oov26);
                    }
                    fz22.ni7(this.ha0 + this.krz);
                    fz22.h8j(this.lvb + this._zh);
                }
                catch (oov oov27) {
                    throw e9p.a(oov27);
                }
            }
            e9p2 = this;
        }
        e9p2.oec = fz22;
    }

    private float ea5(float f, i2h i2h2) {
        float f2;
        block6: {
            float f3;
            float f4;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            f4 = Math.abs(omb.ndg(i2h2)[0] - f) % 360.0f;
                            f3 = 180.0f;
                            if (n != 0) break block4;
                            if (!(f4 > f3)) break block5;
                        }
                        catch (oov oov2) {
                            throw e9p.a(oov2);
                        }
                        f2 = 360.0f - Math.abs(omb.ndg(i2h2)[0] - f) % 360.0f;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw e9p.a(oov3);
                    }
                }
                f4 = Math.abs(omb.ndg(i2h2)[0] - f);
                f3 = 360.0f;
            }
            f2 = f4 % f3;
        }
        return f2;
    }

    private g_3 ecc(boolean bl) {
        boolean bl2;
        akm akm2;
        double d;
        float f;
        hpk hpk2;
        e9p e9p2;
        block2: {
            block3: {
                hpk hpk3 = new hpk(this.wyl.tij, this.wyl.vg8.x6l());
                float f2 = this.wyl.nsd().x5k;
                float f3 = this.wyl.nsd().y2i;
                this.wyl.nsd().x5k = this.lvb;
                this.wyl.nsd().y2i = this.ha0;
                int n = t9d.c();
                try {
                    hpk3.oyu(this.wyl.nsd());
                    hpk3.nyk(this.wyl.nsd());
                    this.wyl.nsd().y2i = f3;
                    this.wyl.nsd().x5k = f2;
                    e9p2 = this;
                    hpk2 = hpk3;
                    f = 1.0f;
                    d = 4.0;
                    akm2 = hpk3.mcz(4.0, 1.0f);
                    bl2 = bl;
                    if (n != 0) break block2;
                    if (bl2) break block3;
                }
                catch (oov oov2) {
                    throw e9p.a(oov2);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        return e9p2.ci8(hpk2, f, d, akm2, bl2);
    }

    /*
     * Unable to fully structure code
     */
    private g_3 ci8(i2h var1_1, float var2_2, double var3_3, akm var5_4, boolean var6_5) {
        block35: {
            block43: {
                block34: {
                    block33: {
                        var8_6 = null;
                        var9_7 = var1_1.tib(var2_2);
                        var10_8 = var1_1.wej(var2_2);
                        var11_9 = var9_7.r2x(var10_8.lvi * var3_3, var10_8.gn5 * var3_3, var10_8.bn2 * var3_3);
                        var12_10 = 1.0f;
                        var7_11 = t9d.c();
                        var13_12 = this.wyl.tij.sr2(var1_1, var1_1.aaw().z9h(var10_8.lvi * var3_3, var10_8.gn5 * var3_3, var10_8.bn2 * var3_3).c2h(var12_10, var12_10, var12_10), Predicates.and((Predicate)k0_.t1f, (Predicate)new qve(this.wyl.x0p)));
                        try {
                            v0 = var5_4;
                            if (var7_11 != 0) break block33;
                            if (v0 == null) break block34;
                        }
                        catch (oov v1) {
                            throw e9p.a(v1);
                        }
                        v0 = var5_4;
                    }
                    v2 = v0.jhn.b4d(var9_7);
                    break block43;
                }
                v2 = var3_3;
            }
            var14_13 = v2;
            for (var16_14 = 0; var16_14 < var13_12.size(); ++var16_14) {
                block42: {
                    block41: {
                        block40: {
                            block39: {
                                block38: {
                                    block37: {
                                        var17_15 = (i2h)var13_12.get(var16_14);
                                        try {
                                            try {
                                                v3 = var17_15;
                                                if (var7_11 != 0) break block35;
                                                if (v3 == this.wyl.vg8) {
                                                    continue;
                                                }
                                            }
                                            catch (oov v4) {
                                                throw e9p.a(v4);
                                            }
                                        }
                                        catch (oov v5) {
                                            throw e9p.a(v5);
                                        }
                                        try {
                                            if (!var6_5) break block37;
                                            v6 = -0.1f;
                                            break block38;
                                        }
                                        catch (oov v7) {
                                            throw e9p.a(v7);
                                        }
                                    }
                                    v6 = var17_15.npl();
                                }
                                var18_16 = v6;
                                var19_17 = var17_15.aaw().c2h(var18_16, var18_16, var18_16);
                                var20_18 = var19_17.v35(var9_7, var11_9);
                                try {
                                    try {
                                        try {
                                            v8 = var19_17.fd8(var9_7);
                                            if (var7_11 != 0) break block39;
                                            if (v8 != 0) {
                                            }
                                            ** GOTO lbl78
                                        }
                                        catch (oov v9) {
                                            throw e9p.a(v9);
                                        }
                                        v10 = var14_13;
                                        if (var7_11 != 0) break block40;
                                    }
                                    catch (oov v11) {
                                        throw e9p.a(v11);
                                    }
                                    cfr_temp_0 = v10 - 0.0;
                                    v8 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                }
                                catch (oov v12) {
                                    throw e9p.a(v12);
                                }
                            }
                            if (v8 < 0) continue;
                            var8_6 = var17_15;
                            v10 = 0.0;
                        }
                        var14_13 = v10;
                        try {
                            if (var7_11 == 0) continue;
lbl78:
                            // 2 sources

                            if (var20_18 == null) continue;
                        }
                        catch (oov v13) {
                            throw e9p.a(v13);
                        }
                        var21_19 = var9_7.b4d(var20_18.jhn);
                        try {
                            try {
                                v14 = var21_19 == var14_13 ? 0 : (var21_19 < var14_13 ? -1 : 1);
                                if (var7_11 != 0) break block41;
                                if (v14 >= 0) {
                                }
                                ** GOTO lbl102
                            }
                            catch (oov v15) {
                                throw e9p.a(v15);
                            }
                            cfr_temp_1 = var14_13 - 0.0;
                            v14 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                        }
                        catch (oov v16) {
                            throw e9p.a(v16);
                        }
                    }
                    try {
                        try {
                            try {
                                if (v14 != false) continue;
lbl102:
                                // 2 sources

                                v17 = var17_15;
                                if (var7_11 != 0) break block42;
                            }
                            catch (oov v18) {
                                throw e9p.a(v18);
                            }
                            if (v17 == var1_1.hzp) {
                            }
                            ** GOTO lbl119
                        }
                        catch (oov v19) {
                            throw e9p.a(v19);
                        }
                        if (var14_13 != 0.0) continue;
                    }
                    catch (oov v20) {
                        throw e9p.a(v20);
                    }
                    var8_6 = var17_15;
                    try {
                        if (var7_11 == 0) continue;
lbl119:
                        // 2 sources

                        v17 = var17_15;
                    }
                    catch (oov v21) {
                        throw e9p.a(v21);
                    }
                }
                var8_6 = v17;
                var14_13 = var21_19;
                if (var7_11 == 0) continue;
            }
            v3 = var8_6;
        }
        return (g_3)v3;
    }

    /*
     * Unable to fully structure code
     */
    private float[] cwq(i2h var1_1, float var2_2, float var3_3, boolean var4_4) {
        block16: {
            block15: {
                block17: {
                    block14: {
                        block13: {
                            block12: {
                                block11: {
                                    var6_5 = var1_1.o2v - this.wyl.vg8.o2v;
                                    var8_6 = var1_1.vbd - this.wyl.vg8.vbd;
                                    var5_7 = t9d.b();
                                    try {
                                        v0 = var1_1;
                                        if (var5_7 == 0) break block11;
                                        if (v0 instanceof g_3) {
                                        }
                                        ** GOTO lbl16
                                    }
                                    catch (oov v1) {
                                        throw e9p.a(v1);
                                    }
                                    var12_8 = (g_3)var1_1;
                                    var10_9 = var12_8.kfp + (double)var12_8.c5y() - (this.wyl.vg8.kfp + (double)this.wyl.vg8.c5y());
                                    try {
                                        if (var5_7 != 0) break block12;
lbl16:
                                        // 2 sources

                                        v0 = var1_1;
                                    }
                                    catch (oov v2) {
                                        throw e9p.a(v2);
                                    }
                                }
                                var10_9 = (v0.aaw().bx_ + var1_1.aaw().i2c) / 2.0 - (this.wyl.vg8.kfp + (double)this.wyl.vg8.c5y());
                            }
                            var12_8 = new Random();
                            try {
                                try {
                                    v3 = var4_4;
                                    if (var5_7 == 0) break block13;
                                    if (v3 == 0) break block14;
                                }
                                catch (oov v4) {
                                    throw e9p.a(v4);
                                }
                                v3 = var12_8.nextInt(15);
                            }
                            catch (oov v5) {
                                throw e9p.a(v5);
                            }
                        }
                        v6 = (float)v3 * 0.25f + 5.0f;
                        break block17;
                    }
                    v6 = 0.0f;
                }
                var13_10 = v6;
                var14_11 = fe6.dii(var6_5 * var6_5 + var8_6 * var8_6);
                var16_12 = (float)(Math.atan2(var8_6 + (double)var13_10, var6_5) * 180.0 / 3.141592653589793) - 90.0f;
                try {
                    v7 = var10_9;
                    if (!(var1_1 instanceof ha9)) break block15;
                    v8 = 0.5f;
                    break block16;
                }
                catch (oov v9) {
                    throw e9p.a(v9);
                }
            }
            v8 = 0.0f;
        }
        var17_13 = (float)(-(Math.atan2(v7 - (double)v8 + (double)var13_10, var14_11) * 180.0 / 3.141592653589793));
        var18_14 = this.mx1(this.ha0, var17_13, var3_3);
        var19_15 = this.mx1(this.lvb, var16_12, var2_2);
        return new float[]{var19_15, var18_14};
    }

    private float mx1(float f, float f2, float f3) {
        float f4;
        float f5;
        block7: {
            float f6;
            float f7;
            block5: {
                int n;
                block6: {
                    n = t9d.b();
                    f7 = fe6.qsy(f2 - f);
                    try {
                        f6 = f7 == f3 ? 0 : (f7 > f3 ? 1 : -1);
                        if (n == 0) break block5;
                        if (f6 <= 0) break block6;
                    }
                    catch (oov oov2) {
                        throw e9p.a(oov2);
                    }
                    f7 = f3;
                }
                try {
                    f5 = f7;
                    f4 = -f3;
                    if (n == 0) break block7;
                    float f8 = f5 - f4;
                    f6 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                }
                catch (oov oov3) {
                    throw e9p.a(oov3);
                }
            }
            if (f6 < 0) {
                f7 = -f3;
            }
            f5 = f;
            f4 = f7;
        }
        return f5 + f4;
    }

    /*
     * Unable to fully structure code
     */
    private void in0(boolean var1_1) {
        block41: {
            block35: {
                block39: {
                    block40: {
                        block38: {
                            block36: {
                                block34: {
                                    block32: {
                                        block33: {
                                            block31: {
                                                var2_2 = t9d.b();
                                                try {
                                                    try {
                                                        v0 = this.oyv;
                                                        if (var2_2 == 0) break block31;
                                                        if (v0 != null) {
                                                        }
                                                        ** GOTO lbl24
                                                    }
                                                    catch (oov v1) {
                                                        throw e9p.a(v1);
                                                    }
                                                    v0 = this.oyv;
                                                }
                                                catch (oov v2) {
                                                    throw e9p.a(v2);
                                                }
                                            }
                                            try {
                                                try {
                                                    v3 = v0.size();
                                                    if (var2_2 == 0) break block32;
                                                    if (v3 != 0) break block33;
                                                }
                                                catch (oov v4) {
                                                    throw e9p.a(v4);
                                                }
lbl24:
                                                // 2 sources

                                                e9p.iw2 = null;
                                                return;
                                            }
                                            catch (oov v5) {
                                                throw e9p.a(v5);
                                            }
                                        }
                                        v3 = (int)var1_1;
                                    }
                                    try {
                                        try {
                                            try {
                                                if (var2_2 == 0) break block34;
                                                if (v3 != 0) {
                                                }
                                                ** GOTO lbl96
                                            }
                                            catch (oov v6) {
                                                throw e9p.a(v6);
                                            }
                                            v7 = this.oyv;
                                            if (var2_2 == 0) break block35;
                                        }
                                        catch (oov v8) {
                                            throw e9p.a(v8);
                                        }
                                        v3 = v7.size();
                                    }
                                    catch (oov v9) {
                                        throw e9p.a(v9);
                                    }
                                }
                                try {
                                    block37: {
                                        try {
                                            try {
                                                try {
                                                    if (v3 > 1) {
                                                        v10 = this;
                                                        if (var2_2 == 0) break block36;
                                                    }
                                                    ** GOTO lbl96
                                                }
                                                catch (oov v11) {
                                                    throw e9p.a(v11);
                                                }
                                                if (v10.j2g < this.oyv.size() - 1) break block37;
                                            }
                                            catch (oov v12) {
                                                throw e9p.a(v12);
                                            }
                                            this.j2g = 0;
                                            if (var2_2 != 0) break block38;
                                        }
                                        catch (oov v13) {
                                            throw e9p.a(v13);
                                        }
                                    }
                                    v10 = this;
                                }
                                catch (oov v14) {
                                    throw e9p.a(v14);
                                }
                            }
                            ++v10.j2g;
                        }
                        try {
                            try {
                                v15 = this.oyv.get(this.j2g);
                                if (var2_2 == 0) break block39;
                                if (v15 == e9p.iw2) break block40;
                            }
                            catch (oov v16) {
                                throw e9p.a(v16);
                            }
                            this.tib.zay();
                        }
                        catch (oov v17) {
                            throw e9p.a(v17);
                        }
                    }
                    v15 = this.oyv.get(this.j2g);
                }
                try {
                    e9p.iw2 = (g_3)v15;
                    if (var2_2 != 0) break block41;
lbl96:
                    // 3 sources

                    v7 = this.oyv.get(0);
                }
                catch (oov v18) {
                    throw e9p.a(v18);
                }
            }
            e9p.iw2 = (g_3)v7;
        }
    }

    private void v6z() {
        this.mbo = (int)(1000.0 / (double)this.w3_) - new Random().nextInt(20);
    }

    private void fyu() {
        this._ea = 300 + new Random().nextInt(100);
    }

    @jev
    public void npi(b4u b4u2) {
        block22: {
            e9p e9p2;
            block21: {
                int n;
                block23: {
                    block20: {
                        boolean bl;
                        block19: {
                            block17: {
                                block18: {
                                    n = t9d.c();
                                    try {
                                        bl = v3p.eit();
                                        if (n != 0) break block17;
                                        if (!bl) break block18;
                                    }
                                    catch (oov oov2) {
                                        throw e9p.a(oov2);
                                    }
                                    return;
                                }
                                bl = this.fje(iw2, false);
                            }
                            try {
                                try {
                                    if (n != 0) break block19;
                                    if (!bl) break block20;
                                }
                                catch (oov oov3) {
                                    throw e9p.a(oov3);
                                }
                                bl = this.v_r.yrv(this.mbo);
                            }
                            catch (oov oov4) {
                                throw e9p.a(oov4);
                            }
                        }
                        if (bl) break block23;
                    }
                    return;
                }
                try {
                    if (amb.p2w().gn1() == xbr.kru) {
                        return;
                    }
                }
                catch (oov oov5) {
                    throw e9p.a(oov5);
                }
                try {
                    try {
                        this.tpj(this.ecc(true));
                        this.v_r.zay();
                        this.v6z();
                        e9p2 = this;
                        if (n != 0) break block21;
                        if (!e9p2.tib.yrv(5000.0)) break block22;
                    }
                    catch (oov oov6) {
                        throw e9p.a(oov6);
                    }
                    e9p2 = this;
                }
                catch (oov oov7) {
                    throw e9p.a(oov7);
                }
            }
            e9p2.in0(true);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void tpj(g_3 var1_1) {
        block15: {
            block13: {
                block11: {
                    block12: {
                        var2_2 = t9d.c();
                        try {
                            try {
                                v0 = this.wyl.vg8;
                                if (var2_2 != 0) break block11;
                                if (!v0.kqk()) break block12;
                            }
                            catch (oov v1) {
                                throw e9p.a(v1);
                            }
                            this.wyl.vg8.lq7.sxi(new C07PacketPlayerDigging(C07PacketPlayerDigging$pl2.md_, mew._9b, vt2.m3r));
                        }
                        catch (oov v2) {
                            throw e9p.a(v2);
                        }
                    }
                    v0 = var1_1;
                }
                try {
                    if (var2_2 != 0) break block13;
                    if (v0 != null) {
                    }
                    ** GOTO lbl39
                }
                catch (oov v3) {
                    throw e9p.a(v3);
                }
                v0 = var1_1;
            }
            try {
                block14: {
                    try {
                        if (!(v0.tm6(this.wyl.vg8) <= 4.0f)) break block14;
                        this.wyl.vg8.hgb();
                        this.wyl.vg8.lq7.sxi(new C02PacketUseEntity((i2h)var1_1, C02PacketUseEntity$_y6.cb5));
                        this.wyl.vg8.eej(var1_1);
                        this.wyl.vg8.eej(var1_1);
                        this.s74 = true;
                        if (var2_2 == 0) break block15;
                    }
                    catch (oov v4) {
                        throw e9p.a(v4);
                    }
                }
                this.wyl.vg8.lq7.sxi(new C0APacketAnimation());
                this.s74 = false;
            }
            catch (oov v5) {
                throw e9p.a(v5);
            }
        }
    }

    private List fbs() {
        return uj3.kao().stream().filter(this::q7o).collect(Collectors.toList());
    }

    public boolean fje(g_3 g_32, boolean bl) {
        boolean bl2;
        block79: {
            block80: {
                int n;
                block77: {
                    block78: {
                        block75: {
                            block76: {
                                block73: {
                                    block74: {
                                        block71: {
                                            block72: {
                                                block69: {
                                                    block70: {
                                                        block65: {
                                                            float f;
                                                            block66: {
                                                                int n2;
                                                                int n3;
                                                                block67: {
                                                                    block68: {
                                                                        float f2;
                                                                        block64: {
                                                                            block63: {
                                                                                float f3;
                                                                                block61: {
                                                                                    block62: {
                                                                                        boolean bl3;
                                                                                        block60: {
                                                                                            block59: {
                                                                                                g_3 g_33;
                                                                                                block58: {
                                                                                                    n = t9d.b();
                                                                                                    try {
                                                                                                        g_33 = g_32;
                                                                                                        if (n == 0) break block58;
                                                                                                        if (g_33 == null) break block59;
                                                                                                    }
                                                                                                    catch (oov oov2) {
                                                                                                        throw e9p.a(oov2);
                                                                                                    }
                                                                                                    g_33 = g_32;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            bl3 = g_33.ma9;
                                                                                                            if (n == 0) break block60;
                                                                                                            if (bl3) break block59;
                                                                                                        }
                                                                                                        catch (oov oov3) {
                                                                                                            throw e9p.a(oov3);
                                                                                                        }
                                                                                                        float f4 = g_32.i55() - 0.0f;
                                                                                                        f3 = f4 == 0.0f ? 0 : (f4 < 0.0f ? -1 : 1);
                                                                                                        if (n == 0) break block61;
                                                                                                    }
                                                                                                    catch (oov oov4) {
                                                                                                        throw e9p.a(oov4);
                                                                                                    }
                                                                                                    if (f3 > 0) break block62;
                                                                                                }
                                                                                                catch (oov oov5) {
                                                                                                    throw e9p.a(oov5);
                                                                                                }
                                                                                            }
                                                                                            bl3 = false;
                                                                                        }
                                                                                        return bl3;
                                                                                    }
                                                                                    f3 = (float)this.wyl.vg8.e7y(g_32);
                                                                                }
                                                                                try {
                                                                                    if (f3 == false) break block63;
                                                                                    f2 = 4.0f;
                                                                                    break block64;
                                                                                }
                                                                                catch (oov oov6) {
                                                                                    throw e9p.a(oov6);
                                                                                }
                                                                            }
                                                                            f2 = 0.0f;
                                                                        }
                                                                        f = f2;
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        bl2 = bl;
                                                                                        if (n == 0) break block65;
                                                                                        if (bl2) break block66;
                                                                                    }
                                                                                    catch (oov oov7) {
                                                                                        throw e9p.a(oov7);
                                                                                    }
                                                                                    n3 = ++this.ir7;
                                                                                    n2 = 1;
                                                                                    if (n == 0) break block67;
                                                                                }
                                                                                catch (oov oov8) {
                                                                                    throw e9p.a(oov8);
                                                                                }
                                                                                if (n3 <= n2) break block68;
                                                                            }
                                                                            catch (oov oov9) {
                                                                                throw e9p.a(oov9);
                                                                            }
                                                                            this.ir7 = 0;
                                                                        }
                                                                        catch (oov oov10) {
                                                                            throw e9p.a(oov10);
                                                                        }
                                                                    }
                                                                    n3 = 4;
                                                                    n2 = this.ir7;
                                                                }
                                                                f = n3 + n2;
                                                            }
                                                            bl2 = omb.mzr(g_32, f);
                                                        }
                                                        try {
                                                            try {
                                                                if (n == 0) break block69;
                                                                if (bl2) break block70;
                                                            }
                                                            catch (oov oov11) {
                                                                throw e9p.a(oov11);
                                                            }
                                                            return false;
                                                        }
                                                        catch (oov oov12) {
                                                            throw e9p.a(oov12);
                                                        }
                                                    }
                                                    bl2 = g_32 instanceof h67;
                                                }
                                                try {
                                                    try {
                                                        if (n == 0) break block71;
                                                        if (!bl2) break block72;
                                                    }
                                                    catch (oov oov13) {
                                                        throw e9p.a(oov13);
                                                    }
                                                    return false;
                                                }
                                                catch (oov oov14) {
                                                    throw e9p.a(oov14);
                                                }
                                            }
                                            bl2 = g_32.h5u();
                                        }
                                        try {
                                            try {
                                                if (n == 0) break block73;
                                                if (!bl2) break block74;
                                            }
                                            catch (oov oov15) {
                                                throw e9p.a(oov15);
                                            }
                                            return false;
                                        }
                                        catch (oov oov16) {
                                            throw e9p.a(oov16);
                                        }
                                    }
                                    bl2 = g_32 instanceof ha9;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n == 0) break block75;
                                                if (!bl2) break block76;
                                            }
                                            catch (oov oov17) {
                                                throw e9p.a(oov17);
                                            }
                                            bl2 = zwr.qkk.w34().jzk(g_32.noc());
                                            if (n == 0) break block75;
                                        }
                                        catch (oov oov18) {
                                            throw e9p.a(oov18);
                                        }
                                        if (!bl2) break block76;
                                    }
                                    catch (oov oov19) {
                                        throw e9p.a(oov19);
                                    }
                                    return false;
                                }
                                catch (oov oov20) {
                                    throw e9p.a(oov20);
                                }
                            }
                            bl2 = zwr.o1s.d7c();
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n == 0) break block77;
                                                if (!bl2) break block78;
                                            }
                                            catch (oov oov21) {
                                                throw e9p.a(oov21);
                                            }
                                            bl2 = g_32 instanceof ha9;
                                            if (n == 0) break block77;
                                        }
                                        catch (oov oov22) {
                                            throw e9p.a(oov22);
                                        }
                                        if (!bl2) break block78;
                                    }
                                    catch (oov oov23) {
                                        throw e9p.a(oov23);
                                    }
                                    bl2 = f62.a92((ha9)g_32);
                                    if (n == 0) break block77;
                                }
                                catch (oov oov24) {
                                    throw e9p.a(oov24);
                                }
                                if (!bl2) break block78;
                            }
                            catch (oov oov25) {
                                throw e9p.a(oov25);
                            }
                            return false;
                        }
                        catch (oov oov26) {
                            throw e9p.a(oov26);
                        }
                    }
                    bl2 = kgt.p71.klu();
                }
                try {
                    try {
                        try {
                            try {
                                if (n == 0) break block79;
                                if (!bl2) break block80;
                            }
                            catch (oov oov27) {
                                throw e9p.a(oov27);
                            }
                            bl2 = kgt.p71.kh5(g_32);
                            if (n == 0) break block79;
                        }
                        catch (oov oov28) {
                            throw e9p.a(oov28);
                        }
                        if (!bl2) break block80;
                    }
                    catch (oov oov29) {
                        throw e9p.a(oov29);
                    }
                    return false;
                }
                catch (oov oov30) {
                    throw e9p.a(oov30);
                }
            }
            bl2 = true;
        }
        return bl2;
    }

    @jev
    private void fbi(b5k b5k2) {
        e9p e9p2;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        e9p2 = this;
                        if (n != 0) break block4;
                        if (e9p2.oec != null) break block5;
                    }
                    catch (oov oov2) {
                        throw e9p.a(oov2);
                    }
                    return;
                }
                catch (oov oov3) {
                    throw e9p.a(oov3);
                }
            }
            e9p2 = this;
        }
        fqr fqr2 = e9p2.n1w(this.oec.d9n(), this.oec.m1r());
        double d = this.wyl.vg8.ivp + fqr2.lvi * 4.0 + (this.wyl.vg8.o2v + fqr2.lvi * 4.0 - (this.wyl.vg8.ivp + fqr2.lvi * 4.0)) * (double)b5k2._x5() - this.wyl.ibs().yky();
        double d2 = this.wyl.vg8.c54 + (double)this.wyl.vg8.c5y() + fqr2.gn5 * 4.0 + (this.wyl.vg8.kfp + (double)this.wyl.vg8.c5y() + fqr2.gn5 * 4.0 - (this.wyl.vg8.c54 + (double)this.wyl.vg8.c5y() + fqr2.gn5 * 4.0)) * (double)b5k2._x5() - this.wyl.ibs().fxk();
        double d3 = this.wyl.vg8.e2b + fqr2.bn2 * 4.0 + (this.wyl.vg8.vbd + fqr2.bn2 * 4.0 - (this.wyl.vg8.e2b + fqr2.bn2 * 4.0)) * (double)b5k2._x5() - this.wyl.ibs().kux();
    }

    private fqr n1w(float f, float f2) {
        float f3 = fe6.ssk(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f4 = fe6.rtn(-f2 * ((float)Math.PI / 180) - (float)Math.PI);
        float f5 = -fe6.ssk(-f * ((float)Math.PI / 180));
        float f6 = fe6.rtn(-f * ((float)Math.PI / 180));
        return new fqr(f4 * f5, f6, f3 * f5);
    }

    private boolean q7o(g_3 g_32) {
        return this.fje(g_32, false);
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

                e9p.a = c.a(-2750819242135780459L, -4345805190272036969L, MethodHandles.lookup().lookupClass()).a(225604466920753L);
                e9p.f = new HashMap<K, V>(13);
                var0 = e9p.a ^ 94759343843229L;
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
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "\u0085\u00c5\u00c0_wb\u00ff\u00c3&S\u00d8\u0098sUZ\u00af\u00d1W\u0080\u00b0u\u00e2\u00b0\u008f\u0082?4\u00ee\u00d1\u00fa%P\u00db\u00e4\u00c0Cm\u00f5\u00e1\u00f5\u00e4\u00f3c\u00d9\u00d9\u00d1`< \u00e1\u0098\u00ec/\u009d@\u00ae\u00abM\u0015\u00dch \u00ebI\u00f0\u00be\u00e1Nm\u0081h\u0000y\u00c3pql!\u00e4\u00f9~\u0010\u0014m*\u008e\u00d8\u00c3\u0007\u00b5\u00c0&\u009bH\u0096\u00d0\u00dba .\u007f?\u00a4R\u008d\u00fea\u00b4\u000f\u0092r\\73\u009an\u00d3;\u00cec\u00f7\u00fb\u00ba\u008f1n\u007f;.m\u00c5";
                var8_6 = "\u0085\u00c5\u00c0_wb\u00ff\u00c3&S\u00d8\u0098sUZ\u00af\u00d1W\u0080\u00b0u\u00e2\u00b0\u008f\u0082?4\u00ee\u00d1\u00fa%P\u00db\u00e4\u00c0Cm\u00f5\u00e1\u00f5\u00e4\u00f3c\u00d9\u00d9\u00d1`< \u00e1\u0098\u00ec/\u009d@\u00ae\u00abM\u0015\u00dch \u00ebI\u00f0\u00be\u00e1Nm\u0081h\u0000y\u00c3pql!\u00e4\u00f9~\u0010\u0014m*\u008e\u00d8\u00c3\u0007\u00b5\u00c0&\u009bH\u0096\u00d0\u00dba .\u007f?\u00a4R\u008d\u00fea\u00b4\u000f\u0092r\\73\u009an\u00d3;\u00cec\u00f7\u00fb\u00ba\u008f1n\u007f;.m\u00c5".length();
                var5_7 = 48;
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
                    var9_3[var7_4++] = e9p.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ecge\u008b\u00d5s\u00f8cB\u00f7\\x\u00d7\u00be\u00c31\u00f6\u0016s\u00aff\u00bcD\u00d2\u00bc\u00a1\u0084\u00fe\u008cG\u00fcW8x\u008c\u00c0\u00b3\u00dcdR$\u000e\u0005\u0016\u0019^Z\u00df\u0010I\u00f7\u0002\u00e2\u0018\u00e4\u00bb\u00ab\u00da\u00f2O\u00a5\u00c0\u00fdg@";
                    var8_6 = "\u00ecge\u008b\u00d5s\u00f8cB\u00f7\\x\u00d7\u00be\u00c31\u00f6\u0016s\u00aff\u00bcD\u00d2\u00bc\u00a1\u0084\u00fe\u008cG\u00fcW8x\u008c\u00c0\u00b3\u00dcdR$\u000e\u0005\u0016\u0019^Z\u00df\u0010I\u00f7\u0002\u00e2\u0018\u00e4\u00bb\u00ab\u00da\u00f2O\u00a5\u00c0\u00fdg@".length();
                    var5_7 = 48;
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
                    var9_3[var7_4++] = e9p.b(var10_9).intern();
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
        e9p.d = var9_3;
        e9p.e = new String[6];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2CC;
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
                throw new RuntimeException("e9p", exception);
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
            e9p.e[n2] = e9p.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e9p.a(n, l);
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
            throw new RuntimeException("e9p" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e9p.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

