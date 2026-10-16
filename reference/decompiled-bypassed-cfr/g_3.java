/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Maps
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.network.play.server.S04PacketEntityEquipment;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.network.play.server.S0DPacketCollectItem;

public abstract class g_3
extends i2h {
    private static final UUID dmv;
    private static final xk5 mo6;
    private osd kpa;
    private final w0s sgr = new w0s(this);
    private final Map mwt = Maps.newHashMap();
    private final erg[] wjy = new erg[5];
    public boolean prr;
    public int aw1;
    public int zni;
    public int gx0;
    public int x_3;
    public float rth;
    public int qur;
    public float laq;
    public float sti;
    public float p1w;
    public float zzf;
    public float pcb;
    public int g9w = 20;
    public float vz1;
    public float sep;
    public float aks;
    public float t3c;
    public float ksw;
    public float gsh;
    public float q6c;
    public float h82;
    public float _ge = 0.02f;
    public ha9 mxp;
    public int gig;
    public boolean pv7;
    public int dof;
    public float hdw;
    public float zt3;
    public float z35;
    public float t2t;
    public float zwr;
    public int yv8;
    public float g0x;
    public boolean e1f;
    public float z66;
    public float ooc;
    public float czx;
    public int a1q;
    public double sz4;
    public double _y0;
    public double hb4;
    public double e7t;
    public double bxw;
    private boolean f5u = true;
    private g_3 _7v;
    private int kqj;
    private g_3 ihk;
    private int yru;
    private float poe;
    private int vwx;
    private float a0f;
    public float za0 = -1.0f;
    private static String[] b;
    private static final long e;
    private static final String[] m;
    private static final String[] n;
    private static final Map o;

    @Override
    public void aqu() {
        this.m1t(ofh.r2b, Float.MAX_VALUE);
    }

    public g_3(t9d t9d2) {
        super(t9d2);
        this.nyy();
        this.uh3(this.axb());
        this.gz8 = true;
        this.t3c = (float)((Math.random() + 1.0) * (double)0.01f);
        this.m6_(this.o2v, this.kfp, this.vbd);
        this.aks = (float)Math.random() * 12398.0f;
        this.q6c = this.x5k = (float)(Math.random() * Math.PI * 2.0);
        this.nr7 = 0.6f;
    }

    public boolean z_9(double d) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        bl = c05.vz1().tij.bb4(this, this.aaw().sy_(0.0, -d, 0.0)).isEmpty();
                        if (n != 0) break block4;
                        if (bl) break block5;
                    }
                    catch (oov oov2) {
                        throw g_3.c(oov2);
                    }
                    return true;
                }
                catch (oov oov3) {
                    throw g_3.c(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void tbj() {
        this.oit.kp2(7, 0);
        this.oit.kp2(8, (byte)0);
        this.oit.kp2(9, (byte)0);
        this.oit.kp2(6, Float.valueOf(1.0f));
    }

    public void nyy() {
        this.s_a().ylc(m6d.t9k);
        this.s_a().ylc(m6d.nen);
        this.s_a().ylc(m6d.w7i);
    }

    @Override
    public void ihp(double d, boolean bl, e0x e0x2, mew mew2) {
        block20: {
            g_3 g_32;
            block18: {
                block19: {
                    int n;
                    zfz zfz2;
                    block21: {
                        double d2;
                        block22: {
                            boolean bl2;
                            int n2;
                            block16: {
                                block17: {
                                    n2 = t9d.c();
                                    try {
                                        try {
                                            bl2 = this.mwv();
                                            if (n2 != 0) break block16;
                                            if (bl2) break block17;
                                        }
                                        catch (oov oov2) {
                                            throw g_3.c(oov2);
                                        }
                                        this.r24();
                                    }
                                    catch (oov oov3) {
                                        throw g_3.c(oov3);
                                    }
                                }
                                try {
                                    g_32 = this;
                                    if (n2 != 0) break block18;
                                    bl2 = g_32.oay.v0f;
                                }
                                catch (oov oov4) {
                                    throw g_3.c(oov4);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (bl2) break block19;
                                        g_32 = this;
                                        if (n2 != 0) break block18;
                                    }
                                    catch (oov oov5) {
                                        throw g_3.c(oov5);
                                    }
                                    if (!(g_32.o_8 > 3.0f)) break block19;
                                }
                                catch (oov oov6) {
                                    throw g_3.c(oov6);
                                }
                                if (!bl) break block19;
                            }
                            catch (oov oov7) {
                                throw g_3.c(oov7);
                            }
                            zfz2 = this.oay.getBlockState(mew2);
                            e0x e0x3 = zfz2.r_y();
                            float f = fe6.v1i(this.o_8 - 3.0f);
                            try {
                                if (n2 != 0) break block20;
                                if (e0x3.p1r() == p3y.cei) break block19;
                            }
                            catch (oov oov8) {
                                throw g_3.c(oov8);
                            }
                            d2 = Math.min(0.2f + f / 15.0f, 10.0f);
                            try {
                                double d3 = d2 - 2.5;
                                n = d3 == 0.0 ? (int)0 : (d3 > 0.0 ? (int)1 : -1);
                                if (n2 != 0) break block21;
                                if (n <= 0) break block22;
                            }
                            catch (oov oov9) {
                                throw g_3.c(oov9);
                            }
                            d2 = 2.5;
                        }
                        n = (int)(150.0 * d2);
                    }
                    double d4 = n;
                    ((dug)this.oay).zra(w_0.jxl, this.o2v, this.kfp, this.vbd, (int)d4, 0.0, 0.0, 0.0, 0.15f, new int[]{e0x.r2y(zfz2)});
                }
                g_32 = this;
            }
            super.ihp(d, bl, e0x2, mew2);
        }
    }

    public boolean s53() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void mwr() {
        block155: {
            block156: {
                block157: {
                    block153: {
                        block154: {
                            block152: {
                                block150: {
                                    block148: {
                                        block149: {
                                            block146: {
                                                block147: {
                                                    block144: {
                                                        block145: {
                                                            block142: {
                                                                block143: {
                                                                    block137: {
                                                                        block138: {
                                                                            block139: {
                                                                                block140: {
                                                                                    block141: {
                                                                                        block136: {
                                                                                            block135: {
                                                                                                block134: {
                                                                                                    block132: {
                                                                                                        block133: {
                                                                                                            block130: {
                                                                                                                block131: {
                                                                                                                    block126: {
                                                                                                                        block127: {
                                                                                                                            block128: {
                                                                                                                                var1_1 = g_3.e ^ 99382787530563L;
                                                                                                                                this.laq = this.sti;
                                                                                                                                super.mwr();
                                                                                                                                v0 = t9d.c();
                                                                                                                                this.oay.e8t.qek((String)g_3.b("q", (int)29867, (long)(8879536574349514468L ^ var1_1)));
                                                                                                                                var3_2 = v0;
                                                                                                                                var4_3 = this instanceof ha9;
                                                                                                                                try {
                                                                                                                                    block129: {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        v1 = this.gzr();
                                                                                                                                                        if (var3_2 != 0) break block126;
                                                                                                                                                        if (v1 == 0) break block127;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v2) {
                                                                                                                                                        throw g_3.c(v2);
                                                                                                                                                    }
                                                                                                                                                    v1 = this.sqy();
                                                                                                                                                    if (var3_2 != 0) break block128;
                                                                                                                                                }
                                                                                                                                                catch (oov v3) {
                                                                                                                                                    throw g_3.c(v3);
                                                                                                                                                }
                                                                                                                                                if (v1 == 0) break block129;
                                                                                                                                            }
                                                                                                                                            catch (oov v4) {
                                                                                                                                                throw g_3.c(v4);
                                                                                                                                            }
                                                                                                                                            this.m1t(ofh._st, 1.0f);
                                                                                                                                            if (var3_2 == 0) break block127;
                                                                                                                                        }
                                                                                                                                        catch (oov v5) {
                                                                                                                                            throw g_3.c(v5);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v1 = var4_3;
                                                                                                                                }
                                                                                                                                catch (oov v6) {
                                                                                                                                    throw g_3.c(v6);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        if (var3_2 != 0) break block126;
                                                                                                                                        if (v1 == 0) break block127;
                                                                                                                                    }
                                                                                                                                    catch (oov v7) {
                                                                                                                                        throw g_3.c(v7);
                                                                                                                                    }
                                                                                                                                    v1 = this.oay.fve().aei(this.aaw());
                                                                                                                                    if (var3_2 != 0) break block126;
                                                                                                                                }
                                                                                                                                catch (oov v8) {
                                                                                                                                    throw g_3.c(v8);
                                                                                                                                }
                                                                                                                                if (v1 != 0) break block127;
                                                                                                                            }
                                                                                                                            catch (oov v9) {
                                                                                                                                throw g_3.c(v9);
                                                                                                                            }
                                                                                                                            var5_4 = this.oay.fve().uhq(this) + this.oay.fve().x5x();
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    cfr_temp_0 = var5_4 - 0.0;
                                                                                                                                    v1 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                                                                                    if (var3_2 != 0) break block126;
                                                                                                                                    if (v1 >= 0) break block127;
                                                                                                                                }
                                                                                                                                catch (oov v10) {
                                                                                                                                    throw g_3.c(v10);
                                                                                                                                }
                                                                                                                                this.m1t(ofh._st, Math.max(1, fe6.jqf(-var5_4 * this.oay.fve().k98())));
                                                                                                                            }
                                                                                                                            catch (oov v11) {
                                                                                                                                throw g_3.c(v11);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            v12 = this;
                                                                                                                            if (var3_2 != 0) break block130;
                                                                                                                            v1 = v12.xgj();
                                                                                                                        }
                                                                                                                        catch (oov v13) {
                                                                                                                            throw g_3.c(v13);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (v1 != 0) break block131;
                                                                                                                            v14 = this.oay.v0f;
                                                                                                                            if (var3_2 != 0) break block132;
                                                                                                                        }
                                                                                                                        catch (oov v15) {
                                                                                                                            throw g_3.c(v15);
                                                                                                                        }
                                                                                                                        if (v14 == 0) break block133;
                                                                                                                    }
                                                                                                                    catch (oov v16) {
                                                                                                                        throw g_3.c(v16);
                                                                                                                    }
                                                                                                                }
                                                                                                                v12 = this;
                                                                                                            }
                                                                                                            v12.utb();
                                                                                                        }
                                                                                                        v14 = var4_3;
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var3_2 != 0) break block134;
                                                                                                            if (v14 == 0) break block135;
                                                                                                        }
                                                                                                        catch (oov v17) {
                                                                                                            throw g_3.c(v17);
                                                                                                        }
                                                                                                        v14 = ((ha9)this).lls.lez;
                                                                                                    }
                                                                                                    catch (oov v18) {
                                                                                                        throw g_3.c(v18);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    if (var3_2 != 0) break block136;
                                                                                                    if (v14 == 0) break block135;
                                                                                                }
                                                                                                catch (oov v19) {
                                                                                                    throw g_3.c(v19);
                                                                                                }
                                                                                                v14 = 1;
                                                                                                break block136;
                                                                                            }
                                                                                            v14 = 0;
                                                                                        }
                                                                                        var5_5 = v14;
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    v20 = this.gzr();
                                                                                                                                    if (var3_2 != 0) break block137;
                                                                                                                                    if (v20 == 0) break block138;
                                                                                                                                }
                                                                                                                                catch (oov v21) {
                                                                                                                                    throw g_3.c(v21);
                                                                                                                                }
                                                                                                                                v22 = this;
                                                                                                                                if (var3_2 != 0) break block139;
                                                                                                                            }
                                                                                                                            catch (oov v23) {
                                                                                                                                throw g_3.c(v23);
                                                                                                                            }
                                                                                                                            if (v22.v0c(p3y.six)) {
                                                                                                                            }
                                                                                                                            ** GOTO lbl242
                                                                                                                        }
                                                                                                                        catch (oov v24) {
                                                                                                                            throw g_3.c(v24);
                                                                                                                        }
                                                                                                                        v20 = (int)this.s53();
                                                                                                                        if (var3_2 != 0) break block140;
                                                                                                                    }
                                                                                                                    catch (oov v25) {
                                                                                                                        throw g_3.c(v25);
                                                                                                                    }
                                                                                                                    if (v20 != 0) break block141;
                                                                                                                }
                                                                                                                catch (oov v26) {
                                                                                                                    throw g_3.c(v26);
                                                                                                                }
                                                                                                                v20 = (int)this.vx3(mcs.h8d.zr9);
                                                                                                                if (var3_2 != 0) break block140;
                                                                                                            }
                                                                                                            catch (oov v27) {
                                                                                                                throw g_3.c(v27);
                                                                                                            }
                                                                                                            if (v20 != 0) break block141;
                                                                                                        }
                                                                                                        catch (oov v28) {
                                                                                                            throw g_3.c(v28);
                                                                                                        }
                                                                                                        v20 = var5_5;
                                                                                                        if (var3_2 != 0) break block140;
                                                                                                    }
                                                                                                    catch (oov v29) {
                                                                                                        throw g_3.c(v29);
                                                                                                    }
                                                                                                    if (v20 != 0) break block141;
                                                                                                }
                                                                                                catch (oov v30) {
                                                                                                    throw g_3.c(v30);
                                                                                                }
                                                                                                this.yoc(this.g2u(this.n5m()));
                                                                                                v20 = this.n5m();
                                                                                                if (var3_2 != 0) break block140;
                                                                                            }
                                                                                            catch (oov v31) {
                                                                                                throw g_3.c(v31);
                                                                                            }
                                                                                            if (v20 != -20) break block141;
                                                                                        }
                                                                                        catch (oov v32) {
                                                                                            throw g_3.c(v32);
                                                                                        }
                                                                                        this.yoc(0);
                                                                                        for (var6_6 = 0; var6_6 < 8; ++var6_6) {
                                                                                            var7_7 = this.z2d.nextFloat() - this.z2d.nextFloat();
                                                                                            var8_8 = this.z2d.nextFloat() - this.z2d.nextFloat();
                                                                                            var9_9 = this.z2d.nextFloat() - this.z2d.nextFloat();
                                                                                            try {
                                                                                                this.oay.zvy(w_0.w_h, this.o2v + (double)var7_7, this.kfp + (double)var8_8, this.vbd + (double)var9_9, this.icv, this.mop, this.bw4, new int[0]);
                                                                                                if (var3_2 == 0) {
                                                                                                    if (var3_2 == 0) continue;
                                                                                                    break;
                                                                                                }
                                                                                                break block141;
                                                                                            }
                                                                                            catch (oov v33) {
                                                                                                throw g_3.c(v33);
                                                                                            }
                                                                                        }
                                                                                        this.m1t(ofh.e7v, 2.0f);
                                                                                    }
                                                                                    v20 = (int)this.oay.v0f;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (var3_2 != 0) break block137;
                                                                                                            if (v20 != 0) break block138;
                                                                                                        }
                                                                                                        catch (oov v34) {
                                                                                                            throw g_3.c(v34);
                                                                                                        }
                                                                                                        v20 = (int)this.i0e();
                                                                                                        if (var3_2 != 0) break block137;
                                                                                                    }
                                                                                                    catch (oov v35) {
                                                                                                        throw g_3.c(v35);
                                                                                                    }
                                                                                                    if (v20 == 0) break block138;
                                                                                                }
                                                                                                catch (oov v36) {
                                                                                                    throw g_3.c(v36);
                                                                                                }
                                                                                                v20 = this.hzp instanceof g_3;
                                                                                                if (var3_2 != 0) break block137;
                                                                                            }
                                                                                            catch (oov v37) {
                                                                                                throw g_3.c(v37);
                                                                                            }
                                                                                            if (v20 == 0) break block138;
                                                                                        }
                                                                                        catch (oov v38) {
                                                                                            throw g_3.c(v38);
                                                                                        }
                                                                                        this.nw9(null);
                                                                                        if (var3_2 == 0) break block138;
                                                                                    }
                                                                                    catch (oov v39) {
                                                                                        throw g_3.c(v39);
                                                                                    }
lbl242:
                                                                                    // 2 sources

                                                                                    v22 = this;
                                                                                }
                                                                                catch (oov v40) {
                                                                                    throw g_3.c(v40);
                                                                                }
                                                                            }
                                                                            v22.yoc(300);
                                                                        }
                                                                        v20 = this.gzr();
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    if (var3_2 != 0) break block142;
                                                                                    if (v20 == 0) break block143;
                                                                                }
                                                                                catch (oov v41) {
                                                                                    throw g_3.c(v41);
                                                                                }
                                                                                v20 = this.n08();
                                                                                if (var3_2 != 0) break block142;
                                                                            }
                                                                            catch (oov v42) {
                                                                                throw g_3.c(v42);
                                                                            }
                                                                            if (v20 == 0) break block143;
                                                                        }
                                                                        catch (oov v43) {
                                                                            throw g_3.c(v43);
                                                                        }
                                                                        this.utb();
                                                                    }
                                                                    catch (oov v44) {
                                                                        throw g_3.c(v44);
                                                                    }
                                                                }
                                                                this.vz1 = this.sep;
                                                                v20 = this.gx0;
                                                            }
                                                            try {
                                                                try {
                                                                    if (var3_2 != 0) break block144;
                                                                    if (v20 <= 0) break block145;
                                                                }
                                                                catch (oov v45) {
                                                                    throw g_3.c(v45);
                                                                }
                                                                --this.gx0;
                                                            }
                                                            catch (oov v46) {
                                                                throw g_3.c(v46);
                                                            }
                                                        }
                                                        v20 = this.qqi;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var3_2 != 0) break block146;
                                                                    if (v20 <= 0) break block147;
                                                                }
                                                                catch (oov v47) {
                                                                    throw g_3.c(v47);
                                                                }
                                                                v20 = this instanceof z96;
                                                                if (var3_2 != 0) break block146;
                                                            }
                                                            catch (oov v48) {
                                                                throw g_3.c(v48);
                                                            }
                                                            if (v20 != 0) break block147;
                                                        }
                                                        catch (oov v49) {
                                                            throw g_3.c(v49);
                                                        }
                                                        --this.qqi;
                                                    }
                                                    catch (oov v50) {
                                                        throw g_3.c(v50);
                                                    }
                                                }
                                                v20 = (cfr_temp_1 = this.i55() - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                            }
                                            try {
                                                try {
                                                    if (var3_2 != 0) break block148;
                                                    if (v20 > 0) break block149;
                                                }
                                                catch (oov v51) {
                                                    throw g_3.c(v51);
                                                }
                                                this.xkp();
                                            }
                                            catch (oov v52) {
                                                throw g_3.c(v52);
                                            }
                                        }
                                        try {
                                            v53 = this;
                                            if (var3_2 != 0) break block150;
                                            v20 = v53.gig;
                                        }
                                        catch (oov v54) {
                                            throw g_3.c(v54);
                                        }
                                    }
                                    try {
                                        block151: {
                                            try {
                                                if (v20 <= 0) break block151;
                                                --this.gig;
                                                if (var3_2 == 0) break block152;
                                            }
                                            catch (oov v55) {
                                                throw g_3.c(v55);
                                            }
                                        }
                                        v53 = this;
                                    }
                                    catch (oov v56) {
                                        throw g_3.c(v56);
                                    }
                                }
                                v53.mxp = null;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            v57 = this.ihk;
                                            if (var3_2 != 0) break block153;
                                            if (v57 == null) break block154;
                                        }
                                        catch (oov v58) {
                                            throw g_3.c(v58);
                                        }
                                        v57 = this.ihk;
                                        if (var3_2 != 0) break block153;
                                    }
                                    catch (oov v59) {
                                        throw g_3.c(v59);
                                    }
                                    if (v57.gzr()) break block154;
                                }
                                catch (oov v60) {
                                    throw g_3.c(v60);
                                }
                                this.ihk = null;
                            }
                            catch (oov v61) {
                                throw g_3.c(v61);
                            }
                        }
                        v57 = this._7v;
                    }
                    try {
                        try {
                            block158: {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var3_2 != 0) break block155;
                                                if (v57 == null) break block156;
                                            }
                                            catch (oov v62) {
                                                throw g_3.c(v62);
                                            }
                                            v63 = this._7v.gzr();
                                            if (var3_2 != 0) break block157;
                                        }
                                        catch (oov v64) {
                                            throw g_3.c(v64);
                                        }
                                        if (v63 != 0) break block158;
                                    }
                                    catch (oov v65) {
                                        throw g_3.c(v65);
                                    }
                                    this.iar(null);
                                    if (var3_2 == 0) break block156;
                                }
                                catch (oov v66) {
                                    throw g_3.c(v66);
                                }
                            }
                            v57 = this;
                            if (var3_2 != 0) break block155;
                        }
                        catch (oov v67) {
                            throw g_3.c(v67);
                        }
                        v63 = v57.g25 - this.kqj;
                    }
                    catch (oov v68) {
                        throw g_3.c(v68);
                    }
                }
                try {
                    if (v63 > 100) {
                        this.iar(null);
                    }
                }
                catch (oov v69) {
                    throw g_3.c(v69);
                }
            }
            this.fzd();
            this.t2t = this.z35;
            this.gsh = this.ksw;
            this.h82 = this.q6c;
            this.p3h = this.x5k;
            this.j25 = this.y2i;
            v57 = this;
        }
        v57.oay.e8t.uio();
        mtl.esg(new z6x(this));
    }

    public boolean ejl() {
        return false;
    }

    public void xkp() {
        block28: {
            int n;
            int n2;
            block29: {
                int n3;
                block33: {
                    block30: {
                        int n4;
                        long l;
                        block31: {
                            block27: {
                                l = e ^ 0x78B596D8CF6DL;
                                n2 = t9d.b();
                                try {
                                    try {
                                        n3 = ++this.qur;
                                        if (n2 == 0) break block27;
                                        if (n3 != 20) break block28;
                                    }
                                    catch (oov oov2) {
                                        throw g_3.c(oov2);
                                    }
                                    n3 = this.oay.v0f ? 1 : 0;
                                }
                                catch (oov oov3) {
                                    throw g_3.c(oov3);
                                }
                            }
                            try {
                                block32: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (n2 == 0) break block29;
                                                        if (n3 != 0) break block30;
                                                    }
                                                    catch (oov oov4) {
                                                        throw g_3.c(oov4);
                                                    }
                                                    n3 = this.gig;
                                                    if (n2 == 0) break block31;
                                                }
                                                catch (oov oov5) {
                                                    throw g_3.c(oov5);
                                                }
                                                if (n3 > 0) break block32;
                                            }
                                            catch (oov oov6) {
                                                throw g_3.c(oov6);
                                            }
                                            n3 = this.pwr() ? 1 : 0;
                                            if (n2 == 0) break block29;
                                        }
                                        catch (oov oov7) {
                                            throw g_3.c(oov7);
                                        }
                                        if (n3 == 0) break block30;
                                    }
                                    catch (oov oov8) {
                                        throw g_3.c(oov8);
                                    }
                                }
                                n3 = this.cz_() ? 1 : 0;
                            }
                            catch (oov oov9) {
                                throw g_3.c(oov9);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (n2 == 0) break block29;
                                    if (n3 == 0) break block30;
                                }
                                catch (oov oov10) {
                                    throw g_3.c(oov10);
                                }
                                n3 = this.oay.eir()._s0((String)((Object)g_3.b("q", (int)1197, (long)(0x66BBA0E56A0376C8L ^ l)))) ? 1 : 0;
                                if (n2 == 0) break block29;
                            }
                            catch (oov oov11) {
                                throw g_3.c(oov11);
                            }
                            if (n3 == 0) break block30;
                        }
                        catch (oov oov12) {
                            throw g_3.c(oov12);
                        }
                        for (n = this._96(this.mxp); n > 0; n -= n4) {
                            n4 = uno.di5(n);
                            try {
                                this.oay.xzq(new uno(this.oay, this.o2v, this.kfp, this.vbd, n4));
                                if (n2 != 0) {
                                    if (n2 != 0) continue;
                                    break;
                                }
                                break block33;
                            }
                            catch (oov oov13) {
                                throw g_3.c(oov13);
                            }
                        }
                    }
                    this._kl();
                }
                n3 = n = 0;
            }
            while (n < 20) {
                double d = this.z2d.nextGaussian() * 0.02;
                double d2 = this.z2d.nextGaussian() * 0.02;
                double d3 = this.z2d.nextGaussian() * 0.02;
                this.oay.zvy(w_0.aiv, this.o2v + (double)(this.z2d.nextFloat() * this.uo6 * 2.0f) - (double)this.uo6, this.kfp + (double)(this.z2d.nextFloat() * this.ikl), this.vbd + (double)(this.z2d.nextFloat() * this.uo6 * 2.0f) - (double)this.uo6, d, d2, d3, new int[0]);
                ++n;
                if (n2 != 0) continue;
            }
        }
    }

    public boolean cz_() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.ejl();
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw g_3.c(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public int g2u(int n) {
        int n2;
        block10: {
            int n3;
            block8: {
                block9: {
                    int n4 = t9d.c();
                    int n5 = hc0.v1a(this);
                    try {
                        try {
                            try {
                                try {
                                    n3 = n5;
                                    if (n4 != 0) break block8;
                                    if (n3 <= 0) break block9;
                                }
                                catch (oov oov2) {
                                    throw g_3.c(oov2);
                                }
                                n3 = this.z2d.nextInt(n5 + 1);
                                if (n4 != 0) break block8;
                            }
                            catch (oov oov3) {
                                throw g_3.c(oov3);
                            }
                            if (n3 <= 0) break block9;
                        }
                        catch (oov oov4) {
                            throw g_3.c(oov4);
                        }
                        n2 = n;
                        break block10;
                    }
                    catch (oov oov5) {
                        throw g_3.c(oov5);
                    }
                }
                n3 = n;
            }
            n2 = n3 - 1;
        }
        return n2;
    }

    public int _96(ha9 ha92) {
        return 0;
    }

    public boolean pwr() {
        return false;
    }

    public Random mbr() {
        return this.z2d;
    }

    public g_3 myo() {
        return this._7v;
    }

    public int ii0() {
        return this.kqj;
    }

    public void iar(g_3 g_32) {
        this._7v = g_32;
        this.kqj = this.g25;
    }

    public g_3 vg5() {
        return this.ihk;
    }

    public int xqk() {
        return this.yru;
    }

    public void upe(i2h i2h2) {
        block5: {
            int n = t9d.c();
            try {
                block4: {
                    try {
                        if (!(i2h2 instanceof g_3)) break block4;
                        this.ihk = (g_3)i2h2;
                        if (n == 0) break block5;
                    }
                    catch (oov oov2) {
                        throw g_3.c(oov2);
                    }
                }
                this.ihk = null;
            }
            catch (oov oov3) {
                throw g_3.c(oov3);
            }
        }
        this.yru = this.g25;
    }

    public int c67() {
        return this.dof;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void srs(bdo var1_1) {
        block23: {
            var2_2 = g_3.e ^ 40233520306452L;
            var1_1._i9((String)g_3.b("q", (int)17599, (long)(7081304796019351716L ^ var2_2)), this.i55());
            var1_1.ge7((String)g_3.b("q", (int)25923, (long)(12799366816317769L ^ var2_2)), (short)Math.ceil(this.i55()));
            var1_1.ge7((String)g_3.b("q", (int)29577, (long)(4015636114442934163L ^ var2_2)), (short)this.gx0);
            var1_1.iin((String)g_3.b("q", (int)14206, (long)(4200612588881908590L ^ var2_2)), this.kqj);
            v0 = t9d.b();
            var1_1.ge7((String)g_3.b("q", (int)23852, (long)(3194788904258435386L ^ var2_2)), (short)this.qur);
            var1_1._i9((String)g_3.b("q", (int)24205, (long)(1413175687888992898L ^ var2_2)), this._xk());
            var4_3 = v0;
            var5_4 = this.n7a();
            var6_5 = ((erg[])var5_4).length;
            var7_7 = 0;
            while (var7_7 < var6_5) {
                block21: {
                    block22: {
                        var8_9 = var5_4[var7_7];
                        try {
                            try {
                                try {
                                    if (var4_3 == 0) break block21;
                                    v1 = var8_9;
                                    if (var4_3 != 0) {
                                    }
                                    ** GOTO lbl62
                                }
                                catch (oov v2) {
                                    throw g_3.c(v2);
                                }
                                if (v1 == null) break block22;
                            }
                            catch (oov v3) {
                                throw g_3.c(v3);
                            }
                            this.kpa.l05(var8_9.s15());
                        }
                        catch (oov v4) {
                            throw g_3.c(v4);
                        }
                    }
                    ++var7_7;
                }
                if (var4_3 != 0) continue;
                break;
            }
            var1_1.rzm((String)g_3.b("q", (int)21530, (long)(1817347409392136212L ^ var2_2)), m6d.sng(this.s_a()));
            var5_4 = this.n7a();
            var6_5 = ((erg[])var5_4).length;
            var7_7 = 0;
            while (var7_7 < var6_5) {
                block24: {
                    var8_9 = var5_4[var7_7];
                    try {
                        try {
                            if (var4_3 == 0) break block23;
                            if (var4_3 == 0) break block24;
                        }
                        catch (oov v5) {
                            throw g_3.c(v5);
                        }
                        v1 = var8_9;
                    }
                    catch (oov v6) {
                        throw g_3.c(v6);
                    }
lbl62:
                    // 2 sources

                    try {
                        if (v1 != null) {
                            this.kpa.fdu(var8_9.s15());
                        }
                    }
                    catch (oov v7) {
                        throw g_3.c(v7);
                    }
                    ++var7_7;
                }
                if (var4_3 != 0) continue;
            }
            if (!this.mwt.isEmpty()) {
                var5_4 = new qhg();
                for (sdj var7_8 : this.mwt.values()) {
                    try {
                        var5_4.w2j(var7_8.acr(new bdo()));
                        if (var4_3 != 0) {
                            if (var4_3 != 0) continue;
                            break;
                        }
                        break block23;
                    }
                    catch (oov v8) {
                        throw g_3.c(v8);
                    }
                }
                var1_1.rzm((String)g_3.b("q", (int)23566, (long)(8908681533772232710L ^ var2_2)), (gdw)var5_4);
            }
        }
    }

    @Override
    public void cjb(bdo bdo2) {
        long l;
        block52: {
            int n;
            int n2;
            gdw gdw2;
            block55: {
                gdw gdw3;
                int n3;
                block53: {
                    block47: {
                        CallSite callSite;
                        bdo bdo3;
                        block50: {
                            boolean bl;
                            block45: {
                                block46: {
                                    block42: {
                                        block43: {
                                            t9d t9d2;
                                            block44: {
                                                l = e ^ 0x5239DDF0F5BFL;
                                                n3 = t9d.c();
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                this.pr9(bdo2.blg((String)((Object)g_3.b("q", (int)28913, (long)(0x7846B298CF94385FL ^ l)))));
                                                                bl = bdo2.inh((String)((Object)g_3.b("q", (int)29506, (long)(0x886A8E1C85BBBEDL ^ l))), 9);
                                                                if (n3 != 0) break block42;
                                                                if (!bl) break block43;
                                                            }
                                                            catch (oov oov2) {
                                                                throw g_3.c(oov2);
                                                            }
                                                            t9d2 = this.oay;
                                                            if (n3 != 0) break block44;
                                                        }
                                                        catch (oov oov3) {
                                                            throw g_3.c(oov3);
                                                        }
                                                        if (t9d2 == null) break block43;
                                                    }
                                                    catch (oov oov4) {
                                                        throw g_3.c(oov4);
                                                    }
                                                    t9d2 = this.oay;
                                                }
                                                catch (oov oov5) {
                                                    throw g_3.c(oov5);
                                                }
                                            }
                                            try {
                                                try {
                                                    bl = t9d2.v0f;
                                                    if (n3 != 0) break block42;
                                                    if (bl) break block43;
                                                }
                                                catch (oov oov6) {
                                                    throw g_3.c(oov6);
                                                }
                                                m6d.zig(this.s_a(), bdo2.bzb((String)((Object)g_3.b("q", (int)21530, (long)(0x1938F57957141CBFL ^ l))), 10));
                                            }
                                            catch (oov oov7) {
                                                throw g_3.c(oov7);
                                            }
                                        }
                                        bl = bdo2.inh((String)((Object)g_3.b("q", (int)30545, (long)(0x7C16534D02D8BFE4L ^ l))), 9);
                                    }
                                    try {
                                        if (n3 != 0) break block45;
                                        if (!bl) break block46;
                                    }
                                    catch (oov oov8) {
                                        throw g_3.c(oov8);
                                    }
                                    gdw2 = bdo2.bzb((String)((Object)g_3.b("q", (int)23566, (long)(0x7BA18809D8CC14ADL ^ l))), 10);
                                    int n4 = 0;
                                    while (n4 < ((qhg)gdw2).vek()) {
                                        block48: {
                                            block49: {
                                                bdo bdo4 = ((qhg)gdw2).kd6(n4);
                                                sdj sdj2 = sdj.a1a(bdo4);
                                                try {
                                                    try {
                                                        try {
                                                            if (n3 != 0) break block47;
                                                            if (n3 != 0) break block48;
                                                        }
                                                        catch (oov oov9) {
                                                            throw g_3.c(oov9);
                                                        }
                                                        if (sdj2 == null) break block49;
                                                    }
                                                    catch (oov oov10) {
                                                        throw g_3.c(oov10);
                                                    }
                                                    this.mwt.put(sdj2._na(), sdj2);
                                                }
                                                catch (oov oov11) {
                                                    throw g_3.c(oov11);
                                                }
                                            }
                                            ++n4;
                                        }
                                        if (n3 == 0) continue;
                                    }
                                }
                                try {
                                    bdo3 = bdo2;
                                    callSite = g_3.b("q", (int)24631, (long)(0x4D648A0EF7782891L ^ l));
                                    if (n3 != 0) break block50;
                                    bl = bdo3.inh((String)((Object)callSite), 99);
                                }
                                catch (oov oov12) {
                                    throw g_3.c(oov12);
                                }
                            }
                            try {
                                block51: {
                                    try {
                                        if (!bl) break block51;
                                        this.uh3(bdo2.blg((String)((Object)g_3.b("q", (int)17599, (long)(0x6245AF9FD45F8C0FL ^ l)))));
                                        if (n3 == 0) break block52;
                                    }
                                    catch (oov oov13) {
                                        throw g_3.c(oov13);
                                    }
                                }
                                bdo3 = bdo2;
                                callSite = g_3.b("q", (int)17553, (long)(0x5B4784DAA5608C3CL ^ l));
                            }
                            catch (oov oov14) {
                                throw g_3.c(oov14);
                            }
                        }
                        gdw2 = bdo3.e2o((String)((Object)callSite));
                    }
                    try {
                        block54: {
                            try {
                                try {
                                    gdw3 = gdw2;
                                    if (n3 != 0) break block53;
                                    if (gdw3 != null) break block54;
                                }
                                catch (oov oov15) {
                                    throw g_3.c(oov15);
                                }
                                this.uh3(this.axb());
                                if (n3 == 0) break block52;
                            }
                            catch (oov oov16) {
                                throw g_3.c(oov16);
                            }
                        }
                        gdw3 = gdw2;
                    }
                    catch (oov oov17) {
                        throw g_3.c(oov17);
                    }
                }
                try {
                    block56: {
                        try {
                            try {
                                n2 = gdw3.ky0();
                                n = 5;
                                if (n3 != 0) break block55;
                                if (n2 != n) break block56;
                            }
                            catch (oov oov18) {
                                throw g_3.c(oov18);
                            }
                            this.uh3(((n8i)gdw2).qaj());
                            if (n3 == 0) break block52;
                        }
                        catch (oov oov19) {
                            throw g_3.c(oov19);
                        }
                    }
                    n2 = gdw2.ky0();
                    n = 2;
                }
                catch (oov oov20) {
                    throw g_3.c(oov20);
                }
            }
            try {
                if (n2 == n) {
                    this.uh3(((wmr)gdw2).sgm());
                }
            }
            catch (oov oov21) {
                throw g_3.c(oov21);
            }
        }
        this.gx0 = bdo2.hp9((String)((Object)g_3.b("q", (int)24497, (long)(0x2A404E96C050971BL ^ l))));
        this.qur = bdo2.hp9((String)((Object)g_3.b("q", (int)21462, (long)(0x5510EA99DCFC1B6CL ^ l))));
        this.kqj = bdo2.uz7((String)((Object)g_3.b("q", (int)16786, (long)(0x23B2B0B2BC118932L ^ l))));
    }

    /*
     * Unable to fully structure code
     */
    public void fzd() {
        block61: {
            block71: {
                block70: {
                    block66: {
                        block67: {
                            block68: {
                                block69: {
                                    block63: {
                                        block64: {
                                            block65: {
                                                block62: {
                                                    block60: {
                                                        block58: {
                                                            block59: {
                                                                block54: {
                                                                    block55: {
                                                                        block56: {
                                                                            block57: {
                                                                                block50: {
                                                                                    var1_1 = t9d.b();
                                                                                    var2_2 = this.mwt.keySet().iterator();
                                                                                    while (var2_2.hasNext()) {
                                                                                        block53: {
                                                                                            block51: {
                                                                                                block52: {
                                                                                                    var3_3 = (Integer)var2_2.next();
                                                                                                    var4_5 = (sdj)this.mwt.get(var3_3);
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        v0 = (int)var4_5.g7f(this);
                                                                                                                        if (var1_1 == 0) break block50;
                                                                                                                        if (var1_1 == 0) break block51;
                                                                                                                    }
                                                                                                                    catch (oov v1) {
                                                                                                                        throw g_3.c(v1);
                                                                                                                    }
                                                                                                                    if (v0 == 0) {
                                                                                                                    }
                                                                                                                    ** GOTO lbl40
                                                                                                                }
                                                                                                                catch (oov v2) {
                                                                                                                    throw g_3.c(v2);
                                                                                                                }
                                                                                                                v3 = this;
                                                                                                                if (var1_1 == 0) break block52;
                                                                                                            }
                                                                                                            catch (oov v4) {
                                                                                                                throw g_3.c(v4);
                                                                                                            }
                                                                                                            if (v3.oay.v0f) break block53;
                                                                                                        }
                                                                                                        catch (oov v5) {
                                                                                                            throw g_3.c(v5);
                                                                                                        }
                                                                                                        var2_2.remove();
                                                                                                        v3 = this;
                                                                                                    }
                                                                                                    catch (oov v6) {
                                                                                                        throw g_3.c(v6);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    v3.rua(var4_5);
                                                                                                    if (var1_1 != 0) break block53;
lbl40:
                                                                                                    // 2 sources

                                                                                                    v7 = var4_5.ltp() % 600;
                                                                                                }
                                                                                                catch (oov v8) {
                                                                                                    throw g_3.c(v8);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (v7 == 0) {
                                                                                                    this.lyx(var4_5, false);
                                                                                                }
                                                                                            }
                                                                                            catch (oov v9) {
                                                                                                throw g_3.c(v9);
                                                                                            }
                                                                                        }
                                                                                        if (var1_1 != 0) continue;
                                                                                    }
                                                                                    v0 = this.f5u;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                if (var1_1 == 0) break block54;
                                                                                                if (v0 == 0) break block55;
                                                                                            }
                                                                                            catch (oov v10) {
                                                                                                throw g_3.c(v10);
                                                                                            }
                                                                                            v11 = this;
                                                                                            if (var1_1 == 0) break block56;
                                                                                        }
                                                                                        catch (oov v12) {
                                                                                            throw g_3.c(v12);
                                                                                        }
                                                                                        if (v11.oay.v0f) break block57;
                                                                                    }
                                                                                    catch (oov v13) {
                                                                                        throw g_3.c(v13);
                                                                                    }
                                                                                    this.k0f();
                                                                                }
                                                                                catch (oov v14) {
                                                                                    throw g_3.c(v14);
                                                                                }
                                                                            }
                                                                            v11 = this;
                                                                        }
                                                                        v11.f5u = false;
                                                                    }
                                                                    v0 = this.oit.zwc(7);
                                                                }
                                                                var3_4 = v0;
                                                                try {
                                                                    v15 = this.oit.miz(8);
                                                                    if (var1_1 == 0) break block58;
                                                                    if (v15 <= 0) break block59;
                                                                }
                                                                catch (oov v16) {
                                                                    throw g_3.c(v16);
                                                                }
                                                                v15 = 1;
                                                                break block58;
                                                            }
                                                            v15 = 0;
                                                        }
                                                        var4_6 = v15;
                                                        try {
                                                            v17 = var3_4;
                                                            if (var1_1 == 0) break block60;
                                                            if (v17 <= 0) break block61;
                                                        }
                                                        catch (oov v18) {
                                                            throw g_3.c(v18);
                                                        }
                                                        v17 = 0;
                                                    }
                                                    var5_7 = v17;
                                                    try {
                                                        v19 = this.h5u();
                                                        if (var1_1 == 0) break block62;
                                                        if (v19 == 0) {
                                                        }
                                                        ** GOTO lbl119
                                                    }
                                                    catch (oov v20) {
                                                        throw g_3.c(v20);
                                                    }
                                                    var5_7 = (int)this.z2d.nextBoolean();
                                                    try {
                                                        if (var1_1 != 0) break block63;
lbl119:
                                                        // 2 sources

                                                        v19 = this.z2d.nextInt(15);
                                                    }
                                                    catch (oov v21) {
                                                        throw g_3.c(v21);
                                                    }
                                                }
                                                try {
                                                    if (var1_1 == 0) break block64;
                                                    if (v19 != 0) break block65;
                                                }
                                                catch (oov v22) {
                                                    throw g_3.c(v22);
                                                }
                                                v19 = 1;
                                                break block64;
                                            }
                                            v19 = 0;
                                        }
                                        var5_7 = v19;
                                    }
                                    try {
                                        try {
                                            try {
                                                v23 = var4_6;
                                                if (var1_1 == 0) break block66;
                                                if (v23 == 0) break block67;
                                            }
                                            catch (oov v24) {
                                                throw g_3.c(v24);
                                            }
                                            v25 = var5_7;
                                            v26 = this.z2d.nextInt(5);
                                            if (var1_1 == 0) break block68;
                                        }
                                        catch (oov v27) {
                                            throw g_3.c(v27);
                                        }
                                        if (v26 != 0) break block69;
                                    }
                                    catch (oov v28) {
                                        throw g_3.c(v28);
                                    }
                                    v26 = 1;
                                    break block68;
                                }
                                v26 = 0;
                            }
                            var5_7 = v25 & v26;
                        }
                        v23 = var5_7;
                    }
                    try {
                        if (var1_1 == 0) break block70;
                        if (v23 == 0) break block61;
                    }
                    catch (oov v29) {
                        throw g_3.c(v29);
                    }
                    v23 = var3_4;
                }
                try {
                    try {
                        if (var1_1 == 0) break block71;
                        if (v23 <= 0) break block61;
                    }
                    catch (oov v30) {
                        throw g_3.c(v30);
                    }
                    v23 = var3_4 >> 16 & 255;
                }
                catch (oov v31) {
                    throw g_3.c(v31);
                }
            }
            var6_8 = (double)v23 / 255.0;
            var8_9 = (double)(var3_4 >> 8 & 255) / 255.0;
            var10_10 = (double)(var3_4 >> 0 & 255) / 255.0;
            try {
                v32 = this.oay;
                v33 = var4_6 != 0 ? w_0.s7d : w_0.hg8;
            }
            catch (oov v34) {
                throw g_3.c(v34);
            }
            v32.zvy(v33, this.o2v + (this.z2d.nextDouble() - 0.5) * (double)this.uo6, this.kfp + this.z2d.nextDouble() * (double)this.ikl, this.vbd + (this.z2d.nextDouble() - 0.5) * (double)this.uo6, var6_8, var8_9, var10_10, new int[0]);
        }
    }

    public void k0f() {
        block10: {
            boolean bl;
            int n;
            wl1 wl12;
            int n2;
            block11: {
                block12: {
                    int n3;
                    int n4;
                    block8: {
                        n4 = t9d.c();
                        try {
                            block9: {
                                try {
                                    try {
                                        n3 = this.mwt.isEmpty();
                                        if (n4 != 0) break block8;
                                        if (n3 == 0) break block9;
                                    }
                                    catch (oov oov2) {
                                        throw g_3.c(oov2);
                                    }
                                    this.__q();
                                    this.icv(false);
                                    if (n4 == 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw g_3.c(oov3);
                                }
                            }
                            n3 = ksn.aln(this.mwt.values());
                        }
                        catch (oov oov4) {
                            throw g_3.c(oov4);
                        }
                    }
                    n2 = n3;
                    try {
                        wl12 = this.oit;
                        n = 8;
                        bl = ksn.ze_(this.mwt.values());
                        if (n4 != 0) break block11;
                        if (!bl) break block12;
                    }
                    catch (oov oov5) {
                        throw g_3.c(oov5);
                    }
                    bl = true;
                    break block11;
                }
                bl = false;
            }
            wl12.c66(n, (byte)(bl ? 1 : 0));
            this.oit.c66(7, n2);
            this.icv(this.vx3(mcs.zgt.zr9));
        }
    }

    public void __q() {
        this.oit.c66(8, (byte)0);
        this.oit.c66(7, 0);
    }

    public void ldj() {
        int n = t9d.c();
        Iterator iterator = this.mwt.keySet().iterator();
        while (iterator.hasNext()) {
            block6: {
                g_3 g_32;
                sdj sdj2;
                block5: {
                    Integer n2 = (Integer)iterator.next();
                    sdj2 = (sdj)this.mwt.get(n2);
                    try {
                        try {
                            g_32 = this;
                            if (n != 0) break block5;
                            if (g_32.oay.v0f) break block6;
                        }
                        catch (oov oov2) {
                            throw g_3.c(oov2);
                        }
                        iterator.remove();
                        g_32 = this;
                    }
                    catch (oov oov3) {
                        throw g_3.c(oov3);
                    }
                }
                g_32.rua(sdj2);
            }
            if (n == 0) continue;
        }
    }

    public Collection g5i() {
        return this.mwt.values();
    }

    public boolean vx3(int n) {
        return this.mwt.containsKey(n);
    }

    public boolean cab(mcs mcs2) {
        return this.mwt.containsKey(mcs2.zr9);
    }

    public sdj dhd(mcs mcs2) {
        return (sdj)this.mwt.get(mcs2.zr9);
    }

    public void gmn(sdj sdj2) {
        block11: {
            Integer n;
            Map map;
            block12: {
                boolean bl;
                int n2;
                block10: {
                    n2 = t9d.c();
                    try {
                        try {
                            try {
                                bl = this.xav(sdj2);
                                if (n2 != 0) break block10;
                                if (!bl) break block11;
                            }
                            catch (oov oov2) {
                                throw g_3.c(oov2);
                            }
                            map = this.mwt;
                            n = sdj2._na();
                            if (n2 != 0) break block12;
                        }
                        catch (oov oov3) {
                            throw g_3.c(oov3);
                        }
                        bl = map.containsKey(n);
                    }
                    catch (oov oov4) {
                        throw g_3.c(oov4);
                    }
                }
                try {
                    block13: {
                        try {
                            if (!bl) break block13;
                            ((sdj)this.mwt.get(sdj2._na())).mzf(sdj2);
                            this.lyx((sdj)this.mwt.get(sdj2._na()), true);
                            if (n2 == 0) break block11;
                        }
                        catch (oov oov5) {
                            throw g_3.c(oov5);
                        }
                    }
                    map = this.mwt;
                    n = sdj2._na();
                }
                catch (oov oov6) {
                    throw g_3.c(oov6);
                }
            }
            map.put(n, sdj2);
            this.dft(sdj2);
        }
    }

    public boolean xav(sdj sdj2) {
        int n;
        block11: {
            block12: {
                int n2 = t9d.c();
                if (this.fhc() == n1e.via) {
                    int n3;
                    block9: {
                        int n4 = sdj2._na();
                        try {
                            block10: {
                                try {
                                    try {
                                        try {
                                            n3 = n4;
                                            if (n2 != 0) break block9;
                                            if (n3 == mcs.kkg.zr9) break block10;
                                        }
                                        catch (oov oov2) {
                                            throw g_3.c(oov2);
                                        }
                                        n = n4;
                                        if (n2 != 0) break block11;
                                    }
                                    catch (oov oov3) {
                                        throw g_3.c(oov3);
                                    }
                                    if (n != mcs.veq.zr9) break block12;
                                }
                                catch (oov oov4) {
                                    throw g_3.c(oov4);
                                }
                            }
                            n3 = 0;
                        }
                        catch (oov oov5) {
                            throw g_3.c(oov5);
                        }
                    }
                    return n3 != 0;
                }
            }
            n = 1;
        }
        return n != 0;
    }

    public boolean nor() {
        boolean bl;
        try {
            bl = this.fhc() == n1e.via;
        }
        catch (oov oov2) {
            throw g_3.c(oov2);
        }
        return bl;
    }

    public void zrt(int n) {
        this.mwt.remove(n);
    }

    public void zu8(int n) {
        sdj sdj2 = (sdj)this.mwt.remove(n);
        try {
            if (sdj2 != null) {
                this.rua(sdj2);
            }
        }
        catch (oov oov2) {
            throw g_3.c(oov2);
        }
    }

    public void dft(sdj sdj2) {
        try {
            this.f5u = true;
            if (!this.oay.v0f) {
                mcs.ip9[sdj2._na()].na_(this, this.s_a(), sdj2.tus());
            }
        }
        catch (oov oov2) {
            throw g_3.c(oov2);
        }
    }

    public void lyx(sdj sdj2, boolean bl) {
        block8: {
            boolean bl2;
            block7: {
                int n = t9d.b();
                try {
                    try {
                        this.f5u = true;
                        bl2 = bl;
                        if (n == 0) break block7;
                        if (!bl2) break block8;
                    }
                    catch (oov oov2) {
                        throw g_3.c(oov2);
                    }
                    bl2 = this.oay.v0f;
                }
                catch (oov oov3) {
                    throw g_3.c(oov3);
                }
            }
            try {
                if (!bl2) {
                    mcs.ip9[sdj2._na()].iqt(this, this.s_a(), sdj2.tus());
                    mcs.ip9[sdj2._na()].na_(this, this.s_a(), sdj2.tus());
                }
            }
            catch (oov oov4) {
                throw g_3.c(oov4);
            }
        }
    }

    public void rua(sdj sdj2) {
        try {
            this.f5u = true;
            if (!this.oay.v0f) {
                mcs.ip9[sdj2._na()].iqt(this, this.s_a(), sdj2.tus());
            }
        }
        catch (oov oov2) {
            throw g_3.c(oov2);
        }
    }

    public void rwd(float f) {
        float f2 = this.i55();
        try {
            if (f2 > 0.0f) {
                this.uh3(f2 + f);
            }
        }
        catch (oov oov2) {
            throw g_3.c(oov2);
        }
    }

    public final float i55() {
        float f;
        block10: {
            float f2;
            block11: {
                block8: {
                    int n = t9d.b();
                    f2 = this.oit.ig2(6);
                    try {
                        g_3 g_32;
                        block9: {
                            try {
                                try {
                                    try {
                                        g_32 = this;
                                        if (n == 0) break block8;
                                        if (g_32.gx0 == this.x_3) break block9;
                                    }
                                    catch (oov oov2) {
                                        throw g_3.c(oov2);
                                    }
                                    f = this.za0;
                                    if (n == 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw g_3.c(oov3);
                                }
                                if (f != -1.0f) break block11;
                            }
                            catch (oov oov4) {
                                throw g_3.c(oov4);
                            }
                        }
                        g_32 = this;
                    }
                    catch (oov oov5) {
                        throw g_3.c(oov5);
                    }
                }
                g_32.za0 = f2;
            }
            f = f2;
        }
        return f;
    }

    public void uh3(float f) {
        this.oit.c66(6, Float.valueOf(fe6._f3(f, 0.0f, this.axb())));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean m1t(ofh var1_1, float var2_2) {
        block123: {
            block122: {
                block119: {
                    block120: {
                        block121: {
                            block113: {
                                block114: {
                                    block118: {
                                        block117: {
                                            block115: {
                                                block116: {
                                                    block112: {
                                                        block107: {
                                                            block110: {
                                                                block108: {
                                                                    block109: {
                                                                        block106: {
                                                                            block105: {
                                                                                block102: {
                                                                                    block103: {
                                                                                        block104: {
                                                                                            block101: {
                                                                                                block100: {
                                                                                                    block99: {
                                                                                                        block96: {
                                                                                                            block97: {
                                                                                                                block98: {
                                                                                                                    block94: {
                                                                                                                        block95: {
                                                                                                                            block92: {
                                                                                                                                block93: {
                                                                                                                                    block90: {
                                                                                                                                        block91: {
                                                                                                                                            var3_3 = t9d.b();
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    v0 = this.nss(var1_1);
                                                                                                                                                    if (var3_3 == 0) break block90;
                                                                                                                                                    if (v0 == 0) break block91;
                                                                                                                                                }
                                                                                                                                                catch (oov v1) {
                                                                                                                                                    throw g_3.c(v1);
                                                                                                                                                }
                                                                                                                                                return false;
                                                                                                                                            }
                                                                                                                                            catch (oov v2) {
                                                                                                                                                throw g_3.c(v2);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v0 = this.oay.v0f;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            if (var3_3 == 0) break block92;
                                                                                                                                            if (v0 == 0) break block93;
                                                                                                                                        }
                                                                                                                                        catch (oov v3) {
                                                                                                                                            throw g_3.c(v3);
                                                                                                                                        }
                                                                                                                                        return false;
                                                                                                                                    }
                                                                                                                                    catch (oov v4) {
                                                                                                                                        throw g_3.c(v4);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                this.dof = 0;
                                                                                                                                cfr_temp_0 = this.i55() - 0.0f;
                                                                                                                                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (var3_3 == 0) break block94;
                                                                                                                                    if (v0 > 0) break block95;
                                                                                                                                }
                                                                                                                                catch (oov v5) {
                                                                                                                                    throw g_3.c(v5);
                                                                                                                                }
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            catch (oov v6) {
                                                                                                                                throw g_3.c(v6);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            v7 = var1_1;
                                                                                                                            if (var3_3 == 0) break block96;
                                                                                                                            v0 = (int)v7.i0l();
                                                                                                                        }
                                                                                                                        catch (oov v8) {
                                                                                                                            throw g_3.c(v8);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            if (v0 == 0) break block97;
                                                                                                                            v9 = this.cab(mcs.sw1);
                                                                                                                            if (var3_3 == 0) break block98;
                                                                                                                        }
                                                                                                                        catch (oov v10) {
                                                                                                                            throw g_3.c(v10);
                                                                                                                        }
                                                                                                                        if (!v9) break block97;
                                                                                                                    }
                                                                                                                    catch (oov v11) {
                                                                                                                        throw g_3.c(v11);
                                                                                                                    }
                                                                                                                    v9 = false;
                                                                                                                }
                                                                                                                return v9;
                                                                                                            }
                                                                                                            v7 = var1_1;
                                                                                                        }
                                                                                                        try {
                                                                                                            try {
                                                                                                                v12 = ofh.cw1;
                                                                                                                if (var3_3 == 0) break block99;
                                                                                                                if (v7 != v12) {
                                                                                                                }
                                                                                                                ** GOTO lbl86
                                                                                                            }
                                                                                                            catch (oov v13) {
                                                                                                                throw g_3.c(v13);
                                                                                                            }
                                                                                                            v7 = var1_1;
                                                                                                            v12 = ofh.__h;
                                                                                                        }
                                                                                                        catch (oov v14) {
                                                                                                            throw g_3.c(v14);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (v7 != v12) break block100;
lbl86:
                                                                                                            // 2 sources

                                                                                                            v15 = this;
                                                                                                            if (var3_3 == 0) break block101;
                                                                                                        }
                                                                                                        catch (oov v16) {
                                                                                                            throw g_3.c(v16);
                                                                                                        }
                                                                                                        if (v15.rnq(4) == null) break block100;
                                                                                                    }
                                                                                                    catch (oov v17) {
                                                                                                        throw g_3.c(v17);
                                                                                                    }
                                                                                                    this.rnq(4).ybw((int)(var2_2 * 4.0f + this.z2d.nextFloat() * var2_2 * 2.0f), this);
                                                                                                    var2_2 *= 0.75f;
                                                                                                }
                                                                                                v15 = this;
                                                                                            }
                                                                                            v15.zzf = 1.5f;
                                                                                            var4_4 = true;
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            v18 = this;
                                                                                                            if (var3_3 == 0) break block102;
                                                                                                            if ((float)v18.qqi > (float)this.g9w / 2.0f) {
                                                                                                            }
                                                                                                            ** GOTO lbl136
                                                                                                        }
                                                                                                        catch (oov v19) {
                                                                                                            throw g_3.c(v19);
                                                                                                        }
                                                                                                        cfr_temp_1 = var2_2 - this.g0x;
                                                                                                        v20 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                                                                        if (var3_3 == 0) break block103;
                                                                                                    }
                                                                                                    catch (oov v21) {
                                                                                                        throw g_3.c(v21);
                                                                                                    }
                                                                                                    if (v20 > 0) break block104;
                                                                                                }
                                                                                                catch (oov v22) {
                                                                                                    throw g_3.c(v22);
                                                                                                }
                                                                                                return false;
                                                                                            }
                                                                                            catch (oov v23) {
                                                                                                throw g_3.c(v23);
                                                                                            }
                                                                                        }
                                                                                        this.vza(var1_1, var2_2 - this.g0x);
                                                                                        this.g0x = var2_2;
                                                                                        v20 = (float)false;
                                                                                    }
                                                                                    var4_4 = v20;
                                                                                    try {
                                                                                        if (var3_3 != 0) break block105;
lbl136:
                                                                                        // 2 sources

                                                                                        this.g0x = var2_2;
                                                                                        this.qqi = this.g9w;
                                                                                        this.vza(var1_1, var2_2);
                                                                                        v18 = this;
                                                                                    }
                                                                                    catch (oov v24) {
                                                                                        throw g_3.c(v24);
                                                                                    }
                                                                                }
                                                                                this.x_3 = 10;
                                                                                v18.gx0 = 10;
                                                                            }
                                                                            this.rth = 0.0f;
                                                                            var5_5 = var1_1.nra();
                                                                            try {
                                                                                v25 = var5_5;
                                                                                if (var3_3 == 0) break block106;
                                                                                if (v25 == null) break block107;
                                                                            }
                                                                            catch (oov v26) {
                                                                                throw g_3.c(v26);
                                                                            }
                                                                            v25 = var5_5;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                v27 = v25 instanceof g_3;
                                                                                if (var3_3 == 0) break block108;
                                                                                if (!v27) break block109;
                                                                            }
                                                                            catch (oov v28) {
                                                                                throw g_3.c(v28);
                                                                            }
                                                                            this.iar((g_3)var5_5);
                                                                        }
                                                                        catch (oov v29) {
                                                                            throw g_3.c(v29);
                                                                        }
                                                                    }
                                                                    v27 = var5_5 instanceof ha9;
                                                                }
                                                                try {
                                                                    block111: {
                                                                        try {
                                                                            try {
                                                                                if (var3_3 == 0) break block110;
                                                                                if (!v27) break block111;
                                                                            }
                                                                            catch (oov v30) {
                                                                                throw g_3.c(v30);
                                                                            }
                                                                            this.gig = 100;
                                                                            this.mxp = (ha9)var5_5;
                                                                            if (var3_3 != 0) break block107;
                                                                        }
                                                                        catch (oov v31) {
                                                                            throw g_3.c(v31);
                                                                        }
                                                                    }
                                                                    v27 = var5_5 instanceof gse;
                                                                }
                                                                catch (oov v32) {
                                                                    throw g_3.c(v32);
                                                                }
                                                            }
                                                            try {
                                                                if (var3_3 == 0) break block112;
                                                                if (!v27) break block107;
                                                            }
                                                            catch (oov v33) {
                                                                throw g_3.c(v33);
                                                            }
                                                            var6_6 = (gse)var5_5;
                                                            try {
                                                                try {
                                                                    v27 = var6_6.j1j();
                                                                    if (var3_3 == 0) break block112;
                                                                    if (!v27) break block107;
                                                                }
                                                                catch (oov v34) {
                                                                    throw g_3.c(v34);
                                                                }
                                                                this.gig = 100;
                                                                this.mxp = null;
                                                            }
                                                            catch (oov v35) {
                                                                throw g_3.c(v35);
                                                            }
                                                        }
                                                        v27 = var4_4;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var3_3 == 0) break block113;
                                                                    if (!v27) break block114;
                                                                }
                                                                catch (oov v36) {
                                                                    throw g_3.c(v36);
                                                                }
                                                                v37 /* !! */  = this;
                                                                if (var3_3 == 0) break block115;
                                                            }
                                                            catch (oov v38) {
                                                                throw g_3.c(v38);
                                                            }
                                                            v37 /* !! */ .oay.qyn(this, (byte)2);
                                                            if (var1_1 == ofh.e7v) break block116;
                                                        }
                                                        catch (oov v39) {
                                                            throw g_3.c(v39);
                                                        }
                                                        this.dxm();
                                                    }
                                                    catch (oov v40) {
                                                        throw g_3.c(v40);
                                                    }
                                                }
                                                v37 /* !! */  = var5_5;
                                            }
                                            try {
                                                if (var3_3 == 0) break block117;
                                                if (v37 /* !! */  != null) {
                                                }
                                                ** GOTO lbl268
                                            }
                                            catch (oov v41) {
                                                throw g_3.c(v41);
                                            }
                                            v37 /* !! */  = var5_5;
                                        }
                                        var6_7 = v37 /* !! */ .o2v - this.o2v;
                                        var8_9 = var5_5.vbd - this.vbd;
                                        while (var6_7 * var6_7 + var8_9 * var8_9 < 1.0E-4) {
                                            var6_7 = (Math.random() - Math.random()) * 0.01;
                                            var8_9 = (Math.random() - Math.random()) * 0.01;
                                            try {
                                                if (var3_3 != 0) {
                                                    if (var3_3 != 0) continue;
                                                    break;
                                                }
                                                break block118;
                                            }
                                            catch (oov v42) {
                                                throw g_3.c(v42);
                                            }
                                        }
                                        this.rth = (float)(fe6.yr8(var8_9, var6_7) * 180.0 / 3.141592653589793 - (double)this.x5k);
                                        this.w4h(var5_5, var2_2, var6_7, var8_9);
                                    }
                                    try {
                                        if (var3_3 != 0) break block114;
lbl268:
                                        // 2 sources

                                        this.rth = (int)(Math.random() * 2.0) * 180;
                                    }
                                    catch (oov v43) {
                                        throw g_3.c(v43);
                                    }
                                }
                                try {
                                    v44 = this;
                                    if (var3_3 == 0) break block119;
                                    cfr_temp_2 = v44.i55() - 0.0f;
                                    v27 = (boolean)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1));
                                }
                                catch (oov v45) {
                                    throw g_3.c(v45);
                                }
                            }
                            if (v27 > false) ** GOTO lbl305
                            var6_6 = this.ix6();
                            try {
                                try {
                                    try {
                                        if (var3_3 == 0) break block120;
                                        if (!var4_4) break block121;
                                    }
                                    catch (oov v46) {
                                        throw g_3.c(v46);
                                    }
                                    if (var6_6 == null) break block121;
                                }
                                catch (oov v47) {
                                    throw g_3.c(v47);
                                }
                                this.lhu((String)var6_6, this.o23(), this.b33());
                            }
                            catch (oov v48) {
                                throw g_3.c(v48);
                            }
                        }
                        this.owu(var1_1);
                    }
                    try {
                        if (var3_3 != 0) break block122;
lbl305:
                        // 2 sources

                        v44 = this;
                    }
                    catch (oov v49) {
                        throw g_3.c(v49);
                    }
                }
                var6_8 = v44.wcg();
                try {
                    try {
                        try {
                            v50 = var4_4;
                            if (var3_3 == 0) break block123;
                            if (!v50) break block122;
                        }
                        catch (oov v51) {
                            throw g_3.c(v51);
                        }
                        if (var6_8 == null) break block122;
                    }
                    catch (oov v52) {
                        throw g_3.c(v52);
                    }
                    this.lhu(var6_8, this.o23(), this.b33());
                }
                catch (oov v53) {
                    throw g_3.c(v53);
                }
            }
            v50 = true;
        }
        return v50;
    }

    public void xgx(erg erg2) {
        long l = e ^ 0x2B7685036EDDL;
        this.lhu((String)((Object)g_3.b("q", (int)25566, (long)(0x5E0DBB9024263002L ^ l))), 0.8f, 0.8f + this.oay.fsy.nextFloat() * 0.4f);
        int n = t9d.c();
        for (int i = 0; i < 5; ++i) {
            fqr fqr2 = new fqr(((double)this.z2d.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            fqr2 = fqr2.mx1(-this.y2i * (float)Math.PI / 180.0f);
            fqr2 = fqr2.av2(-this.x5k * (float)Math.PI / 180.0f);
            double d = (double)(-this.z2d.nextFloat()) * 0.6 - 0.3;
            fqr fqr3 = new fqr(((double)this.z2d.nextFloat() - 0.5) * 0.3, d, 0.6);
            fqr3 = fqr3.mx1(-this.y2i * (float)Math.PI / 180.0f);
            fqr3 = fqr3.av2(-this.x5k * (float)Math.PI / 180.0f);
            fqr3 = fqr3.r2x(this.o2v, this.kfp + (double)this.c5y(), this.vbd);
            this.oay.zvy(w_0.ips, fqr3.lvi, fqr3.gn5, fqr3.bn2, fqr2.lvi, fqr2.gn5 + 0.05, fqr2.bn2, new int[]{u7m._lo(erg2.gn1())});
            if (n == 0) continue;
        }
    }

    public void owu(ofh ofh2) {
        t9d t9d2;
        block38: {
            g_3 g_32;
            block42: {
                block39: {
                    boolean bl;
                    g_3 g_33;
                    int n;
                    int n2;
                    block45: {
                        block46: {
                            boolean bl2;
                            g_3 g_34;
                            block43: {
                                block44: {
                                    boolean bl3;
                                    long l;
                                    block40: {
                                        block41: {
                                            i2h i2h2;
                                            block37: {
                                                i2h i2h3;
                                                block36: {
                                                    block34: {
                                                        block35: {
                                                            l = e ^ 0x7B9CB22A0583L;
                                                            i2h2 = ofh2.nra();
                                                            g_3 g_35 = this.gy0();
                                                            n2 = t9d.b();
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            i2h3 = this;
                                                                            if (n2 == 0) break block34;
                                                                            if (((g_3)i2h3).yv8 < 0) break block35;
                                                                        }
                                                                        catch (oov oov2) {
                                                                            throw g_3.c(oov2);
                                                                        }
                                                                        i2h3 = g_35;
                                                                        if (n2 == 0) break block34;
                                                                    }
                                                                    catch (oov oov3) {
                                                                        throw g_3.c(oov3);
                                                                    }
                                                                    if (i2h3 == null) break block35;
                                                                }
                                                                catch (oov oov4) {
                                                                    throw g_3.c(oov4);
                                                                }
                                                                g_35.lfi(this, this.yv8);
                                                            }
                                                            catch (oov oov5) {
                                                                throw g_3.c(oov5);
                                                            }
                                                        }
                                                        i2h3 = i2h2;
                                                    }
                                                    try {
                                                        if (n2 == 0) break block36;
                                                        if (i2h3 == null) break block37;
                                                    }
                                                    catch (oov oov6) {
                                                        throw g_3.c(oov6);
                                                    }
                                                    i2h3 = i2h2;
                                                }
                                                i2h3.s5f(this);
                                            }
                                            try {
                                                this.pv7 = true;
                                                this.ii6().llu();
                                                t9d2 = this.oay;
                                                if (n2 == 0) break block38;
                                                if (t9d2.v0f) break block39;
                                            }
                                            catch (oov oov7) {
                                                throw g_3.c(oov7);
                                            }
                                            n = 0;
                                            try {
                                                bl3 = i2h2 instanceof ha9;
                                                if (n2 == 0) break block40;
                                                if (!bl3) break block41;
                                            }
                                            catch (oov oov8) {
                                                throw g_3.c(oov8);
                                            }
                                            n = hc0.h55((g_3)i2h2);
                                        }
                                        try {
                                            g_32 = this;
                                            if (n2 == 0) break block42;
                                            bl3 = g_32.cz_();
                                        }
                                        catch (oov oov9) {
                                            throw g_3.c(oov9);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (!bl3) break block39;
                                                    t9d2 = this.oay;
                                                    if (n2 == 0) break block38;
                                                }
                                                catch (oov oov10) {
                                                    throw g_3.c(oov10);
                                                }
                                                if (!t9d2.eir()._s0((String)((Object)g_3.b("q", (int)2689, (long)(0xFEFD20B4DE0B215L ^ l))))) break block39;
                                            }
                                            catch (oov oov11) {
                                                throw g_3.c(oov11);
                                            }
                                            g_34 = this;
                                            bl2 = this.gig;
                                            if (n2 == 0) break block43;
                                        }
                                        catch (oov oov12) {
                                            throw g_3.c(oov12);
                                        }
                                        if (bl2 <= false) break block44;
                                    }
                                    catch (oov oov13) {
                                        throw g_3.c(oov13);
                                    }
                                    bl2 = true;
                                    break block43;
                                }
                                bl2 = false;
                            }
                            try {
                                g_34.ir3(bl2, n);
                                g_33 = this;
                                bl = this.gig;
                                if (n2 == 0) break block45;
                                if (bl <= false) break block46;
                            }
                            catch (oov oov14) {
                                throw g_3.c(oov14);
                            }
                            bl = true;
                            break block45;
                        }
                        bl = false;
                    }
                    try {
                        try {
                            try {
                                try {
                                    g_33.ly2(bl, n);
                                    g_32 = this;
                                    if (n2 == 0) break block42;
                                    if (g_32.gig <= 0) break block39;
                                }
                                catch (oov oov15) {
                                    throw g_3.c(oov15);
                                }
                                g_32 = this;
                                if (n2 == 0) break block42;
                            }
                            catch (oov oov16) {
                                throw g_3.c(oov16);
                            }
                            if (!(g_32.z2d.nextFloat() < 0.025f + (float)n * 0.01f)) break block39;
                        }
                        catch (oov oov17) {
                            throw g_3.c(oov17);
                        }
                        this.z3m();
                    }
                    catch (oov oov18) {
                        throw g_3.c(oov18);
                    }
                }
                g_32 = this;
            }
            t9d2 = g_32.oay;
        }
        t9d2.qyn(this, (byte)3);
    }

    public void ly2(boolean bl, int n) {
    }

    public void w4h(i2h i2h2, float f, double d, double d2) {
        block9: {
            block10: {
                double d3;
                double d4;
                int n;
                block8: {
                    n = t9d.b();
                    try {
                        try {
                            d4 = this.z2d.nextDouble();
                            d3 = this.dgt(m6d.nen).nz5();
                            if (n == 0) break block8;
                            if (!(d4 >= d3)) break block9;
                        }
                        catch (oov oov2) {
                            throw g_3.c(oov2);
                        }
                        this.u19 = true;
                        d4 = d * d;
                        d3 = d2 * d2;
                    }
                    catch (oov oov3) {
                        throw g_3.c(oov3);
                    }
                }
                float f2 = fe6.dii(d4 + d3);
                float f3 = 0.4f;
                try {
                    g_3 g_32;
                    try {
                        this.icv /= 2.0;
                        this.mop /= 2.0;
                        this.bw4 /= 2.0;
                        this.icv -= d / (double)f2 * (double)f3;
                        this.mop += (double)f3;
                        this.bw4 -= d2 / (double)f2 * (double)f3;
                        g_32 = this;
                        if (n == 0) break block10;
                        if (!(g_32.mop > (double)0.4f)) break block9;
                    }
                    catch (oov oov4) {
                        throw g_3.c(oov4);
                    }
                    g_32 = this;
                }
                catch (oov oov5) {
                    throw g_3.c(oov5);
                }
            }
            g_32.mop = 0.4f;
        }
    }

    public String wcg() {
        long l = e ^ 0x3F088491AC1AL;
        return g_3.b("q", (int)2960, (long)(0x6FB9A87055ED9A81L ^ l));
    }

    public String ix6() {
        long l = e ^ 0x7E43E01A54L;
        return g_3.b("q", (int)502, (long)(0x1D6573540AB7A6A1L ^ l));
    }

    public void z3m() {
    }

    public void ir3(boolean bl, int n) {
    }

    /*
     * Unable to fully structure code
     */
    public boolean z2m() {
        block15: {
            block14: {
                block16: {
                    block13: {
                        var2_1 = fe6.jqf(this.o2v);
                        var3_2 = fe6.jqf(this.aaw().bx_);
                        var4_3 = fe6.jqf(this.vbd);
                        var5_4 = this.oay.getBlockState(new mew(var2_1, var3_2, var4_3)).r_y();
                        var1_5 = t9d.b();
                        try {
                            try {
                                v0 = var5_4;
                                v1 = ox_.h49;
                                if (var1_5 == 0) break block13;
                                if (v0 != v1) {
                                }
                                ** GOTO lbl27
                            }
                            catch (oov v2) {
                                throw g_3.c(v2);
                            }
                            v0 = var5_4;
                            v1 = ox_.s25;
                        }
                        catch (oov v3) {
                            throw g_3.c(v3);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (v0 != v1) break block14;
lbl27:
                                    // 2 sources

                                    v4 = this instanceof ha9;
                                    if (var1_5 == 0) break block15;
                                }
                                catch (oov v5) {
                                    throw g_3.c(v5);
                                }
                                if (!v4) break block16;
                            }
                            catch (oov v6) {
                                throw g_3.c(v6);
                            }
                            v4 = ((ha9)this).myu();
                            if (var1_5 == 0) break block15;
                        }
                        catch (oov v7) {
                            throw g_3.c(v7);
                        }
                        if (v4) break block14;
                    }
                    catch (oov v8) {
                        throw g_3.c(v8);
                    }
                }
                v4 = true;
                break block15;
            }
            v4 = false;
        }
        return v4;
    }

    @Override
    public boolean gzr() {
        int n;
        block8: {
            block7: {
                int n2;
                block6: {
                    n2 = t9d.c();
                    try {
                        try {
                            n = this.ma9;
                            if (n2 != 0) break block6;
                            if (n != 0) break block7;
                        }
                        catch (oov oov2) {
                            throw g_3.c(oov2);
                        }
                        float f = this.i55() - 0.0f;
                        n = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                    }
                    catch (oov oov3) {
                        throw g_3.c(oov3);
                    }
                }
                try {
                    if (n2 != 0) break block8;
                    if (n <= 0) break block7;
                }
                catch (oov oov4) {
                    throw g_3.c(oov4);
                }
                n = 1;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public void ibc(float f, float f2) {
        block13: {
            e0x e0x2;
            block14: {
                int n;
                int n2;
                block12: {
                    float f3;
                    block15: {
                        block11: {
                            sdj sdj2;
                            block10: {
                                super.ibc(f, f2);
                                sdj sdj3 = this.dhd(mcs.y0p);
                                n2 = t9d.b();
                                try {
                                    sdj2 = sdj3;
                                    if (n2 == 0) break block10;
                                    if (sdj2 == null) break block11;
                                }
                                catch (oov oov2) {
                                    throw g_3.c(oov2);
                                }
                                sdj2 = sdj3;
                            }
                            f3 = sdj2.tus() + 1;
                            break block15;
                        }
                        f3 = 0.0f;
                    }
                    float f4 = f3;
                    int n3 = fe6.v1i((f - 3.0f - f4) * f2);
                    try {
                        try {
                            n = n3;
                            if (n2 == 0) break block12;
                            if (n <= 0) break block13;
                        }
                        catch (oov oov3) {
                            throw g_3.c(oov3);
                        }
                        this.lhu(this.rz6(n3), 1.0f, 1.0f);
                        this.m1t(ofh.m8d, n3);
                        n = fe6.jqf(this.o2v);
                    }
                    catch (oov oov4) {
                        throw g_3.c(oov4);
                    }
                }
                int n4 = n;
                int n5 = fe6.jqf(this.kfp - (double)0.2f);
                int n6 = fe6.jqf(this.vbd);
                e0x e0x3 = this.oay.getBlockState(new mew(n4, n5, n6)).r_y();
                try {
                    try {
                        e0x2 = e0x3;
                        if (n2 == 0) break block14;
                        if (e0x2.p1r() == p3y.cei) break block13;
                    }
                    catch (oov oov5) {
                        throw g_3.c(oov5);
                    }
                    e0x2 = e0x3;
                }
                catch (oov oov6) {
                    throw g_3.c(oov6);
                }
            }
            e0x$zvv e0x$zvv = e0x2.zu6;
            this.lhu(e0x$zvv.i3r(), e0x$zvv.dnt() * 0.5f, e0x$zvv.kjj() * 0.75f);
        }
    }

    public String rz6(int n) {
        CallSite callSite;
        block3: {
            long l;
            block2: {
                l = e ^ 0x2AB0AE16FCBCL;
                try {
                    if (n <= 4) break block2;
                    callSite = g_3.b("q", (int)10258, (long)(0x5B9206C2967E9B8L ^ l));
                    break block3;
                }
                catch (oov oov2) {
                    throw g_3.c(oov2);
                }
            }
            callSite = g_3.b("q", (int)25938, (long)(0x15850E9905D924E9L ^ l));
        }
        return callSite;
    }

    @Override
    public void h38() {
        this.x_3 = 10;
        this.gx0 = 10;
        this.rth = 0.0f;
    }

    public int y5z() {
        int n = 0;
        erg[] ergArray = this.n7a();
        int n2 = t9d.b();
        int n3 = ergArray.length;
        int n4 = 0;
        while (n4 < n3) {
            block9: {
                block10: {
                    int n5;
                    block11: {
                        erg erg2 = ergArray[n4];
                        try {
                            try {
                                try {
                                    try {
                                        if (n2 == 0) break block9;
                                        if (erg2 == null) break block10;
                                    }
                                    catch (oov oov2) {
                                        throw g_3.c(oov2);
                                    }
                                    n5 = erg2.gn1() instanceof jpt;
                                    if (n2 == 0) break block11;
                                }
                                catch (oov oov3) {
                                    throw g_3.c(oov3);
                                }
                                if (n5 == 0) break block10;
                            }
                            catch (oov oov4) {
                                throw g_3.c(oov4);
                            }
                            n5 = ((jpt)erg2.gn1())._wl;
                        }
                        catch (oov oov5) {
                            throw g_3.c(oov5);
                        }
                    }
                    int n6 = n5;
                    n += n6;
                }
                ++n4;
            }
            if (n2 != 0) continue;
        }
        return n;
    }

    public void puw(float f) {
    }

    public float phv(ofh ofh2, float f) {
        block5: {
            int n;
            block4: {
                int n2 = t9d.c();
                try {
                    try {
                        n = ofh2.e8m();
                        if (n2 != 0) break block4;
                        if (n != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw g_3.c(oov2);
                    }
                    n = 25 - this.y5z();
                }
                catch (oov oov3) {
                    throw g_3.c(oov3);
                }
            }
            int n3 = n;
            float f2 = f * (float)n3;
            this.puw(f);
            f = f2 / 25.0f;
        }
        return f;
    }

    public float yef(ofh ofh2, float f) {
        block29: {
            int n;
            int n2;
            float f2;
            int n3;
            block30: {
                int n4;
                int n5;
                block28: {
                    block26: {
                        block27: {
                            int n6;
                            block24: {
                                block25: {
                                    block22: {
                                        float f3;
                                        block23: {
                                            block20: {
                                                block21: {
                                                    n5 = t9d.c();
                                                    try {
                                                        try {
                                                            n6 = ofh2.nk0();
                                                            if (n5 != 0) break block20;
                                                            if (n6 == 0) break block21;
                                                        }
                                                        catch (oov oov2) {
                                                            throw g_3.c(oov2);
                                                        }
                                                        return f;
                                                    }
                                                    catch (oov oov3) {
                                                        throw g_3.c(oov3);
                                                    }
                                                }
                                                n6 = this.cab(mcs.y3z);
                                            }
                                            try {
                                                try {
                                                    if (n5 != 0) break block22;
                                                    if (n6 == 0) break block23;
                                                }
                                                catch (oov oov4) {
                                                    throw g_3.c(oov4);
                                                }
                                                if (ofh2 == ofh.r2b) break block23;
                                            }
                                            catch (oov oov5) {
                                                throw g_3.c(oov5);
                                            }
                                            n4 = (this.dhd(mcs.y3z).tus() + 1) * 5;
                                            n3 = 25 - n4;
                                            f2 = f * (float)n3;
                                            f = f2 / 25.0f;
                                        }
                                        n6 = (f3 = f - 0.0f) == 0.0f ? 0 : (f3 < 0.0f ? -1 : 1);
                                    }
                                    try {
                                        try {
                                            if (n5 != 0) break block24;
                                            if (n6 > 0) break block25;
                                        }
                                        catch (oov oov6) {
                                            throw g_3.c(oov6);
                                        }
                                        return 0.0f;
                                    }
                                    catch (oov oov7) {
                                        throw g_3.c(oov7);
                                    }
                                }
                                n6 = hc0.x2d(this.n7a(), ofh2);
                            }
                            n4 = n6;
                            try {
                                n2 = n4;
                                if (n5 != 0) break block26;
                                if (n2 <= 20) break block27;
                            }
                            catch (oov oov8) {
                                throw g_3.c(oov8);
                            }
                            n4 = 20;
                        }
                        n2 = n4;
                    }
                    try {
                        if (n5 != 0) break block28;
                        if (n2 <= 0) break block29;
                    }
                    catch (oov oov9) {
                        throw g_3.c(oov9);
                    }
                    n2 = n4;
                }
                try {
                    try {
                        n = 20;
                        if (n5 != 0) break block30;
                        if (n2 > n) break block29;
                    }
                    catch (oov oov10) {
                        throw g_3.c(oov10);
                    }
                    int n = 25;
                    n = n4;
                }
                catch (oov oov11) {
                    throw g_3.c(oov11);
                }
            }
            n3 = n2 - n;
            f2 = f * (float)n3;
            f = f2 / 25.0f;
        }
        return f;
    }

    public void vza(ofh ofh2, float f) {
        block7: {
            float f2;
            block8: {
                ofh ofh3;
                g_3 g_32;
                int n;
                block6: {
                    n = t9d.c();
                    try {
                        g_32 = this;
                        ofh3 = ofh2;
                        if (n != 0) break block6;
                        if (g_32.nss(ofh3)) break block7;
                    }
                    catch (oov oov2) {
                        throw g_3.c(oov2);
                    }
                    f = this.phv(ofh2, f);
                    g_32 = this;
                    ofh3 = ofh2;
                }
                float f3 = f = g_32.yef(ofh3, f);
                f = Math.max(f - this._xk(), 0.0f);
                try {
                    try {
                        this.pr9(this._xk() - (f3 - f));
                        f2 = f;
                        if (n != 0) break block8;
                        if (f2 == 0.0f) break block7;
                    }
                    catch (oov oov3) {
                        throw g_3.c(oov3);
                    }
                    f2 = this.i55();
                }
                catch (oov oov4) {
                    throw g_3.c(oov4);
                }
            }
            float f4 = f2;
            this.uh3(f4 - f);
            this.ii6().dp2(ofh2, f4, f);
            this.pr9(this._xk() - f);
        }
    }

    public w0s ii6() {
        return this.sgr;
    }

    public g_3 gy0() {
        g_3 g_32;
        block14: {
            block17: {
                int n;
                block15: {
                    block16: {
                        g_3 g_33;
                        block12: {
                            block13: {
                                n = t9d.c();
                                try {
                                    try {
                                        g_33 = this.sgr.bnc();
                                        if (n != 0) break block12;
                                        if (g_33 == null) break block13;
                                    }
                                    catch (oov oov2) {
                                        throw g_3.c(oov2);
                                    }
                                    g_32 = this.sgr.bnc();
                                    break block14;
                                }
                                catch (oov oov3) {
                                    throw g_3.c(oov3);
                                }
                            }
                            g_33 = this;
                        }
                        try {
                            try {
                                g_32 = g_33.mxp;
                                if (n != 0) break block15;
                                if (g_32 == null) break block16;
                            }
                            catch (oov oov4) {
                                throw g_3.c(oov4);
                            }
                            g_32 = this.mxp;
                            break block14;
                        }
                        catch (oov oov5) {
                            throw g_3.c(oov5);
                        }
                    }
                    g_32 = this._7v;
                }
                try {
                    try {
                        if (n != 0) break block14;
                        if (g_32 == null) break block17;
                    }
                    catch (oov oov6) {
                        throw g_3.c(oov6);
                    }
                    g_32 = this._7v;
                    break block14;
                }
                catch (oov oov7) {
                    throw g_3.c(oov7);
                }
            }
            g_32 = null;
        }
        return g_32;
    }

    public final float axb() {
        return (float)this.dgt(m6d.t9k).nz5();
    }

    public final int jj5() {
        return this.oit.miz(9);
    }

    public final void dk9(int n) {
        this.oit.c66(9, (byte)n);
    }

    private int w8p() {
        int n;
        block10: {
            block11: {
                int n2;
                block8: {
                    block9: {
                        n2 = t9d.b();
                        try {
                            try {
                                n = this.cab(mcs.izk);
                                if (n2 == 0) break block8;
                                if (n == 0) break block9;
                            }
                            catch (oov oov2) {
                                throw g_3.c(oov2);
                            }
                            n = 6 - (1 + this.dhd(mcs.izk).tus()) * 1;
                            break block10;
                        }
                        catch (oov oov3) {
                            throw g_3.c(oov3);
                        }
                    }
                    n = this.cab(mcs._es);
                }
                try {
                    try {
                        if (n2 == 0) break block10;
                        if (n == 0) break block11;
                    }
                    catch (oov oov4) {
                        throw g_3.c(oov4);
                    }
                    n = 6 + (1 + this.dhd(mcs._es).tus()) * 2;
                    break block10;
                }
                catch (oov oov5) {
                    throw g_3.c(oov5);
                }
            }
            n = 6;
        }
        return n;
    }

    public void hgb() {
        block18: {
            t9d t9d2;
            block19: {
                int n;
                block16: {
                    int n2 = t9d.b();
                    try {
                        try {
                            block17: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    n = this.prr;
                                                    if (n2 == 0) break block16;
                                                    if (n == 0) break block17;
                                                }
                                                catch (oov oov2) {
                                                    throw g_3.c(oov2);
                                                }
                                                n = this.aw1;
                                                if (n2 == 0) break block16;
                                            }
                                            catch (oov oov3) {
                                                throw g_3.c(oov3);
                                            }
                                            if (n >= this.w8p() / 2) break block17;
                                        }
                                        catch (oov oov4) {
                                            throw g_3.c(oov4);
                                        }
                                        n = this.aw1;
                                        if (n2 == 0) break block16;
                                    }
                                    catch (oov oov5) {
                                        throw g_3.c(oov5);
                                    }
                                    if (n >= 0) break block18;
                                }
                                catch (oov oov6) {
                                    throw g_3.c(oov6);
                                }
                            }
                            this.aw1 = -1;
                            this.prr = true;
                            t9d2 = this.oay;
                            if (n2 == 0) break block19;
                        }
                        catch (oov oov7) {
                            throw g_3.c(oov7);
                        }
                        n = t9d2 instanceof dug;
                    }
                    catch (oov oov8) {
                        throw g_3.c(oov8);
                    }
                }
                try {
                    if (n == 0) break block18;
                    t9d2 = this.oay;
                }
                catch (oov oov9) {
                    throw g_3.c(oov9);
                }
            }
            ((dug)t9d2).fp4().si9(this, new S0BPacketAnimation(this, 0));
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void ptf(byte var1_1) {
        block19: {
            block20: {
                block21: {
                    block16: {
                        block17: {
                            block18: {
                                var2_2 = t9d.b();
                                try {
                                    v0 = var1_1;
                                    v1 = 2;
                                    if (var2_2 == 0) break block16;
                                    if (v0 == v1) {
                                    }
                                    ** GOTO lbl34
                                }
                                catch (oov v2) {
                                    throw g_3.c(v2);
                                }
                                this.zzf = 1.5f;
                                this.qqi = this.g9w;
                                this.x_3 = 10;
                                this.gx0 = 10;
                                this.rth = 0.0f;
                                var3_3 = this.wcg();
                                try {
                                    try {
                                        if (var2_2 == 0) break block17;
                                        if (var3_3 == null) break block18;
                                    }
                                    catch (oov v3) {
                                        throw g_3.c(v3);
                                    }
                                    this.lhu(this.wcg(), this.o23(), (this.z2d.nextFloat() - this.z2d.nextFloat()) * 0.2f + 1.0f);
                                }
                                catch (oov v4) {
                                    throw g_3.c(v4);
                                }
                            }
                            this.m1t(ofh.f27, 0.0f);
                        }
                        try {
                            if (var2_2 != 0) break block19;
lbl34:
                            // 2 sources

                            v0 = var1_1;
                            v1 = 3;
                        }
                        catch (oov v5) {
                            throw g_3.c(v5);
                        }
                    }
                    if (v0 != v1) ** GOTO lbl59
                    var3_3 = this.ix6();
                    try {
                        try {
                            if (var2_2 == 0) break block20;
                            if (var3_3 == null) break block21;
                        }
                        catch (oov v6) {
                            throw g_3.c(v6);
                        }
                        this.lhu(this.ix6(), this.o23(), (this.z2d.nextFloat() - this.z2d.nextFloat()) * 0.2f + 1.0f);
                    }
                    catch (oov v7) {
                        throw g_3.c(v7);
                    }
                }
                this.uh3(0.0f);
                this.owu(ofh.f27);
            }
            try {
                if (var2_2 != 0) break block19;
lbl59:
                // 2 sources

                super.ptf((byte)var1_1);
            }
            catch (oov v8) {
                throw g_3.c(v8);
            }
        }
    }

    @Override
    public void d0m() {
        this.m1t(ofh.r2b, 4.0f);
    }

    public void inv() {
        int n;
        block12: {
            g_3 g_32;
            block13: {
                block10: {
                    int n2 = t9d.b();
                    n = this.w8p();
                    try {
                        g_3 g_33;
                        block11: {
                            try {
                                try {
                                    try {
                                        try {
                                            g_33 = this;
                                            if (n2 == 0) break block10;
                                            if (!g_33.prr) break block11;
                                        }
                                        catch (oov oov2) {
                                            throw g_3.c(oov2);
                                        }
                                        ++this.aw1;
                                        g_32 = this;
                                        if (n2 == 0) break block12;
                                    }
                                    catch (oov oov3) {
                                        throw g_3.c(oov3);
                                    }
                                    if (g_32.aw1 < n) break block13;
                                }
                                catch (oov oov4) {
                                    throw g_3.c(oov4);
                                }
                                this.aw1 = 0;
                                this.prr = false;
                                if (n2 != 0) break block13;
                            }
                            catch (oov oov5) {
                                throw g_3.c(oov5);
                            }
                        }
                        g_33 = this;
                    }
                    catch (oov oov6) {
                        throw g_3.c(oov6);
                    }
                }
                g_33.aw1 = 0;
            }
            g_32 = this;
        }
        g_32.sti = (float)this.aw1 / (float)n;
    }

    public _4o dgt(w9p w9p2) {
        return this.s_a().d3k(w9p2);
    }

    public osd s_a() {
        osd osd2;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        osd2 = this.kpa;
                        if (n == 0) break block4;
                        if (osd2 != null) break block5;
                    }
                    catch (oov oov2) {
                        throw g_3.c(oov2);
                    }
                    this.kpa = new uya();
                }
                catch (oov oov3) {
                    throw g_3.c(oov3);
                }
            }
            osd2 = this.kpa;
        }
        return osd2;
    }

    public n1e fhc() {
        return n1e.y3x;
    }

    public abstract erg tsc();

    public abstract erg rnq(int var1);

    public abstract erg wfg(int var1);

    @Override
    public abstract void fga(int var1, erg var2);

    @Override
    public void fqc(boolean bl) {
        _4o _4o2;
        block8: {
            _4o _4o3;
            block7: {
                super.fqc(bl);
                _4o2 = this.dgt(m6d.w7i);
                int n = t9d.c();
                try {
                    try {
                        _4o3 = _4o2;
                        if (n != 0) break block7;
                        if (_4o3.aq3(dmv) == null) break block8;
                    }
                    catch (oov oov2) {
                        throw g_3.c(oov2);
                    }
                    _4o3 = _4o2;
                }
                catch (oov oov3) {
                    throw g_3.c(oov3);
                }
            }
            _4o3.se8(mo6);
        }
        try {
            if (bl) {
                _4o2.vcr(mo6);
            }
        }
        catch (oov oov4) {
            throw g_3.c(oov4);
        }
    }

    @Override
    public abstract erg[] n7a();

    public float o23() {
        return 1.0f;
    }

    public float b33() {
        float f;
        block6: {
            g_3 g_32;
            block4: {
                block5: {
                    int n = t9d.c();
                    try {
                        try {
                            g_32 = this;
                            if (n != 0) break block4;
                            if (!g_32.ejl()) break block5;
                        }
                        catch (oov oov2) {
                            throw g_3.c(oov2);
                        }
                        f = (this.z2d.nextFloat() - this.z2d.nextFloat()) * 0.2f + 1.5f;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw g_3.c(oov3);
                    }
                }
                g_32 = this;
            }
            f = (g_32.z2d.nextFloat() - this.z2d.nextFloat()) * 0.2f + 1.0f;
        }
        return f;
    }

    public boolean a81() {
        float f;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    float f2 = this.i55() - 0.0f;
                    f = f2 == 0.0f ? 0 : (f2 < 0.0f ? -1 : 1);
                    if (n != 0) break block2;
                    if (f > 0) break block3;
                }
                catch (oov oov2) {
                    throw g_3.c(oov2);
                }
                f = 1.0f;
                break block2;
            }
            f = 0.0f;
        }
        return (boolean)f;
    }

    /*
     * WARNING - void declaration
     */
    public void vux(i2h i2h2) {
        double d = i2h2.o2v;
        double d2 = i2h2.aaw().bx_ + (double)i2h2.ikl;
        double d3 = i2h2.vbd;
        int n = t9d.b();
        int n2 = 1;
        int n3 = -n2;
        block22: while (true) {
            int n4 = n3;
            block23: while (n4 <= n2) {
                int n5 = -n2;
                while (n5 < n2) {
                    block28: {
                        block27: {
                            g_3 g_32;
                            block31: {
                                block32: {
                                    boolean bl;
                                    int n6;
                                    void var12_9;
                                    block29: {
                                        block30: {
                                            int n7;
                                            block25: {
                                                n4 = n3;
                                                if (n == 0) continue block23;
                                                try {
                                                    block26: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (n == 0) break block25;
                                                                    if (n4 != 0) break block26;
                                                                }
                                                                catch (oov oov2) {
                                                                    throw g_3.c(oov2);
                                                                }
                                                                n7 = n5;
                                                                if (n == 0) break block25;
                                                            }
                                                            catch (oov oov3) {
                                                                throw g_3.c(oov3);
                                                            }
                                                            if (n7 == 0) break block27;
                                                        }
                                                        catch (oov oov4) {
                                                            throw g_3.c(oov4);
                                                        }
                                                    }
                                                    n7 = (int)(this.o2v + (double)n3);
                                                }
                                                catch (oov oov5) {
                                                    throw g_3.c(oov5);
                                                }
                                            }
                                            var12_9 = n7;
                                            n6 = (int)(this.vbd + (double)n5);
                                            nh4 nh42 = this.aaw().sy_(n3, 1.0, n5);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (n == 0) break block28;
                                                            if (!this.oay.d_0(nh42).isEmpty()) break block27;
                                                        }
                                                        catch (oov oov6) {
                                                            throw g_3.c(oov6);
                                                        }
                                                        bl = t9d.r3_(this.oay, new mew((int)var12_9, (int)this.kfp, n6));
                                                        if (n == 0) break block29;
                                                    }
                                                    catch (oov oov7) {
                                                        throw g_3.c(oov7);
                                                    }
                                                    if (!bl) break block30;
                                                }
                                                catch (oov oov8) {
                                                    throw g_3.c(oov8);
                                                }
                                                this.clj(this.o2v + (double)n3, this.kfp + 1.0, this.vbd + (double)n5);
                                                return;
                                            }
                                            catch (oov oov9) {
                                                throw g_3.c(oov9);
                                            }
                                        }
                                        try {
                                            g_32 = this;
                                            if (n == 0) break block31;
                                            bl = t9d.r3_(g_32.oay, new mew((int)var12_9, (int)this.kfp - 1, n6));
                                        }
                                        catch (oov oov10) {
                                            throw g_3.c(oov10);
                                        }
                                    }
                                    try {
                                        try {
                                            if (bl) break block32;
                                            g_32 = this;
                                            if (n == 0) break block31;
                                        }
                                        catch (oov oov11) {
                                            throw g_3.c(oov11);
                                        }
                                        if (g_32.oay.getBlockState(new mew((int)var12_9, (int)this.kfp - 1, n6)).r_y().p1r() != p3y.six) break block27;
                                    }
                                    catch (oov oov12) {
                                        throw g_3.c(oov12);
                                    }
                                }
                                d = this.o2v + (double)n3;
                                d2 = this.kfp + 1.0;
                                g_32 = this;
                            }
                            d3 = g_32.vbd + (double)n5;
                        }
                        ++n5;
                    }
                    if (n != 0) continue;
                }
                ++n3;
                if (n != 0) continue block22;
            }
            break;
        }
        this.clj(d, d2, d3);
    }

    @Override
    public boolean x1t() {
        return false;
    }

    public float rvh() {
        return 0.42f;
    }

    public void xv1() {
        block17: {
            g_3 g_32;
            boolean bl;
            block15: {
                int n;
                block16: {
                    block14: {
                        g_3 g_33;
                        block12: {
                            g_3 g_34;
                            block13: {
                                n = t9d.b();
                                try {
                                    g_34 = this;
                                    g_33 = c05.vz1().vg8;
                                    if (n == 0) break block12;
                                    if (g_34 != g_33) break block13;
                                }
                                catch (oov oov2) {
                                    throw g_3.c(oov2);
                                }
                                yc_ yc_2 = new yc_();
                                try {
                                    mtl.esg(yc_2);
                                    bl = yc_2.elp();
                                    if (n == 0) break block14;
                                    if (!bl) break block13;
                                }
                                catch (oov oov3) {
                                    throw g_3.c(oov3);
                                }
                                return;
                            }
                            g_34 = this;
                            g_33 = this;
                        }
                        g_34.mop = g_33.rvh();
                        bl = this.cab(mcs.y0p);
                    }
                    try {
                        try {
                            if (n == 0) break block15;
                            if (bl) {
                            }
                            break block16;
                        }
                        catch (oov oov4) {
                            throw g_3.c(oov4);
                        }
                        this.mop += (double)((float)(this.dhd(mcs.y0p).tus() + 1) * 0.1f);
                    }
                    catch (oov oov5) {
                        throw g_3.c(oov5);
                    }
                }
                try {
                    g_32 = this;
                    if (n == 0) break block17;
                    bl = g_32.ew1();
                }
                catch (oov oov6) {
                    throw g_3.c(oov6);
                }
            }
            if (bl) {
                float f = this.x5k * ((float)Math.PI / 180);
                this.icv -= (double)(fe6.rtn(f) * 0.2f);
                this.bw4 += (double)(fe6.ssk(f) * 0.2f);
            }
            g_32 = this;
        }
        g_32.u19 = true;
    }

    public void ojw() {
        this.mop += (double)0.04f;
    }

    public void q6x() {
        this.mop += (double)0.04f;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void ge2(float var1_1, float var2_2) {
        block159: {
            block160: {
                block157: {
                    block120: {
                        block158: {
                            block121: {
                                block155: {
                                    block156: {
                                        block153: {
                                            block154: {
                                                block151: {
                                                    block152: {
                                                        block124: {
                                                            block149: {
                                                                block150: {
                                                                    block148: {
                                                                        block127: {
                                                                            block147: {
                                                                                block142: {
                                                                                    block145: {
                                                                                        block143: {
                                                                                            block140: {
                                                                                                block141: {
                                                                                                    block133: {
                                                                                                        block134: {
                                                                                                            block139: {
                                                                                                                block138: {
                                                                                                                    block137: {
                                                                                                                        block135: {
                                                                                                                            block136: {
                                                                                                                                block131: {
                                                                                                                                    block132: {
                                                                                                                                        block130: {
                                                                                                                                            block129: {
                                                                                                                                                block128: {
                                                                                                                                                    block126: {
                                                                                                                                                        block125: {
                                                                                                                                                            block122: {
                                                                                                                                                                var3_3 = t9d.c();
                                                                                                                                                                try {
                                                                                                                                                                    block123: {
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                try {
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                try {
                                                                                                                                                                                                    v0 = this;
                                                                                                                                                                                                    if (var3_3 != 0) break block120;
                                                                                                                                                                                                    if (!v0.de5()) break block121;
                                                                                                                                                                                                }
                                                                                                                                                                                                catch (oov v1) {
                                                                                                                                                                                                    throw g_3.c(v1);
                                                                                                                                                                                                }
                                                                                                                                                                                                v2 = this.mwv();
                                                                                                                                                                                                if (var3_3 != 0) break block122;
                                                                                                                                                                                            }
                                                                                                                                                                                            catch (oov v3) {
                                                                                                                                                                                                throw g_3.c(v3);
                                                                                                                                                                                            }
                                                                                                                                                                                            if (!v2) break block123;
                                                                                                                                                                                        }
                                                                                                                                                                                        catch (oov v4) {
                                                                                                                                                                                            throw g_3.c(v4);
                                                                                                                                                                                        }
                                                                                                                                                                                        v5 = this;
                                                                                                                                                                                        if (var3_3 != 0) break block124;
                                                                                                                                                                                    }
                                                                                                                                                                                    catch (oov v6) {
                                                                                                                                                                                        throw g_3.c(v6);
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v5 instanceof ha9) {
                                                                                                                                                                                    }
                                                                                                                                                                                    ** GOTO lbl356
                                                                                                                                                                                }
                                                                                                                                                                                catch (oov v7) {
                                                                                                                                                                                    throw g_3.c(v7);
                                                                                                                                                                                }
                                                                                                                                                                                v5 = (ha9)this;
                                                                                                                                                                                if (var3_3 != 0) break block124;
                                                                                                                                                                            }
                                                                                                                                                                            catch (oov v8) {
                                                                                                                                                                                throw g_3.c(v8);
                                                                                                                                                                            }
                                                                                                                                                                            if (v5.lls.wzx) {
                                                                                                                                                                            }
                                                                                                                                                                            ** GOTO lbl356
                                                                                                                                                                        }
                                                                                                                                                                        catch (oov v9) {
                                                                                                                                                                            throw g_3.c(v9);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    v2 = this.b2u();
                                                                                                                                                                }
                                                                                                                                                                catch (oov v10) {
                                                                                                                                                                    throw g_3.c(v10);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                try {
                                                                                                                                                                    try {
                                                                                                                                                                        if (var3_3 != 0) break block125;
                                                                                                                                                                        if (!v2) break block126;
                                                                                                                                                                    }
                                                                                                                                                                    catch (oov v11) {
                                                                                                                                                                        throw g_3.c(v11);
                                                                                                                                                                    }
                                                                                                                                                                    v12 = this;
                                                                                                                                                                    if (var3_3 != 0) break block127;
                                                                                                                                                                }
                                                                                                                                                                catch (oov v13) {
                                                                                                                                                                    throw g_3.c(v13);
                                                                                                                                                                }
                                                                                                                                                                v2 = v12 instanceof ha9;
                                                                                                                                                            }
                                                                                                                                                            catch (oov v14) {
                                                                                                                                                                throw g_3.c(v14);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                if (v2) {
                                                                                                                                                                    v12 = (ha9)this;
                                                                                                                                                                    if (var3_3 != 0) break block127;
                                                                                                                                                                }
                                                                                                                                                                ** GOTO lbl311
                                                                                                                                                            }
                                                                                                                                                            catch (oov v15) {
                                                                                                                                                                throw g_3.c(v15);
                                                                                                                                                            }
                                                                                                                                                            if (v12.lls.wzx) {
                                                                                                                                                            }
                                                                                                                                                            ** GOTO lbl311
                                                                                                                                                        }
                                                                                                                                                        catch (oov v16) {
                                                                                                                                                            throw g_3.c(v16);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    var4_4 = 0.91f;
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            v17 = this;
                                                                                                                                                            if (var3_3 != 0) ** GOTO lbl97
                                                                                                                                                            if (!v17.lfk) break block128;
                                                                                                                                                        }
                                                                                                                                                        catch (oov v18) {
                                                                                                                                                            throw g_3.c(v18);
                                                                                                                                                        }
                                                                                                                                                        v17 = this;
                                                                                                                                                    }
                                                                                                                                                    catch (oov v19) {
                                                                                                                                                        throw g_3.c(v19);
                                                                                                                                                    }
lbl97:
                                                                                                                                                    // 2 sources

                                                                                                                                                    var4_4 = v17.oay.getBlockState((mew)new mew((int)fe6.jqf((double)this.o2v), (int)(fe6.jqf((double)this.aaw().bx_) - 1), (int)fe6.jqf((double)this.vbd))).r_y().t50 * 0.91f;
                                                                                                                                                }
                                                                                                                                                var5_6 = 0.16277136f / (var4_4 * var4_4 * var4_4);
                                                                                                                                                try {
                                                                                                                                                    v20 = this;
                                                                                                                                                    if (var3_3 != 0) break block129;
                                                                                                                                                    if (v20.lfk) {
                                                                                                                                                    }
                                                                                                                                                    ** GOTO lbl112
                                                                                                                                                }
                                                                                                                                                catch (oov v21) {
                                                                                                                                                    throw g_3.c(v21);
                                                                                                                                                }
                                                                                                                                                var6_7 = this.ldh() * var5_6;
                                                                                                                                                try {
                                                                                                                                                    if (var3_3 == 0) break block130;
lbl112:
                                                                                                                                                    // 2 sources

                                                                                                                                                    v20 = this;
                                                                                                                                                }
                                                                                                                                                catch (oov v22) {
                                                                                                                                                    throw g_3.c(v22);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            var6_7 = v20._ge;
                                                                                                                                        }
                                                                                                                                        this.r4r(var1_1, var2_2, var6_7);
                                                                                                                                        var4_4 = 0.91f;
                                                                                                                                        try {
                                                                                                                                            v23 = this.lfk;
                                                                                                                                            if (var3_3 != 0) break block131;
                                                                                                                                            if (v23 != 0) {
                                                                                                                                            }
                                                                                                                                            break block132;
                                                                                                                                        }
                                                                                                                                        catch (oov v24) {
                                                                                                                                            throw g_3.c(v24);
                                                                                                                                        }
                                                                                                                                        var4_4 = this.oay.getBlockState((mew)new mew((int)fe6.jqf((double)this.o2v), (int)(fe6.jqf((double)this.aaw().bx_) - 1), (int)fe6.jqf((double)this.vbd))).r_y().t50 * 0.91f;
                                                                                                                                    }
                                                                                                                                    v23 = this.z2m();
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (var3_3 != 0) break block133;
                                                                                                                                    if (v23 == 0) break block134;
                                                                                                                                }
                                                                                                                                catch (oov v25) {
                                                                                                                                    throw g_3.c(v25);
                                                                                                                                }
                                                                                                                                var7_9 = 0.15f;
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        this.icv = fe6.lft(this.icv, -var7_9, var7_9);
                                                                                                                                        this.bw4 = fe6.lft(this.bw4, -var7_9, var7_9);
                                                                                                                                        this.o_8 = 0.0f;
                                                                                                                                        cfr_temp_0 = this.mop - -0.15;
                                                                                                                                        v26 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                                                                                        if (var3_3 != 0) break block135;
                                                                                                                                        if (v26 >= 0) break block136;
                                                                                                                                    }
                                                                                                                                    catch (oov v27) {
                                                                                                                                        throw g_3.c(v27);
                                                                                                                                    }
                                                                                                                                    this.mop = -0.15;
                                                                                                                                }
                                                                                                                                catch (oov v28) {
                                                                                                                                    throw g_3.c(v28);
                                                                                                                                }
                                                                                                                            }
                                                                                                                            v26 = (double)this.hzv();
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (var3_3 != 0) break block137;
                                                                                                                                if (v26 == false) break block138;
                                                                                                                            }
                                                                                                                            catch (oov v29) {
                                                                                                                                throw g_3.c(v29);
                                                                                                                            }
                                                                                                                            v26 = (double)(this instanceof ha9);
                                                                                                                        }
                                                                                                                        catch (oov v30) {
                                                                                                                            throw g_3.c(v30);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (var3_3 != 0) break block139;
                                                                                                                        if (v26 == false) break block138;
                                                                                                                    }
                                                                                                                    catch (oov v31) {
                                                                                                                        throw g_3.c(v31);
                                                                                                                    }
                                                                                                                    v26 = (double)true;
                                                                                                                    break block139;
                                                                                                                }
                                                                                                                v26 = (double)false;
                                                                                                            }
                                                                                                            var8_10 = v26;
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v23 = var8_10;
                                                                                                                            if (var3_3 != 0) break block133;
                                                                                                                            if (v23 == 0) break block134;
                                                                                                                        }
                                                                                                                        catch (oov v32) {
                                                                                                                            throw g_3.c(v32);
                                                                                                                        }
                                                                                                                        cfr_temp_1 = this.mop - 0.0;
                                                                                                                        v23 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                                                                        if (var3_3 != 0) break block133;
                                                                                                                    }
                                                                                                                    catch (oov v33) {
                                                                                                                        throw g_3.c(v33);
                                                                                                                    }
                                                                                                                    if (v23 >= 0) break block134;
                                                                                                                }
                                                                                                                catch (oov v34) {
                                                                                                                    throw g_3.c(v34);
                                                                                                                }
                                                                                                                this.mop = 0.0;
                                                                                                            }
                                                                                                            catch (oov v35) {
                                                                                                                throw g_3.c(v35);
                                                                                                            }
                                                                                                        }
                                                                                                        this.vjj(this.icv, this.mop, this.bw4);
                                                                                                        v23 = this.cbi;
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (var3_3 != 0) break block140;
                                                                                                                    if (v23 == 0) break block141;
                                                                                                                }
                                                                                                                catch (oov v36) {
                                                                                                                    throw g_3.c(v36);
                                                                                                                }
                                                                                                                v23 = this.z2m();
                                                                                                                if (var3_3 != 0) break block140;
                                                                                                            }
                                                                                                            catch (oov v37) {
                                                                                                                throw g_3.c(v37);
                                                                                                            }
                                                                                                            if (v23 == 0) break block141;
                                                                                                        }
                                                                                                        catch (oov v38) {
                                                                                                            throw g_3.c(v38);
                                                                                                        }
                                                                                                        this.mop = 0.2;
                                                                                                    }
                                                                                                    catch (oov v39) {
                                                                                                        throw g_3.c(v39);
                                                                                                    }
                                                                                                }
                                                                                                try {
                                                                                                    v40 = this;
                                                                                                    if (var3_3 != 0) break block142;
                                                                                                    v23 = v40.oay.v0f;
                                                                                                }
                                                                                                catch (oov v41) {
                                                                                                    throw g_3.c(v41);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    block144: {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (v23 != 0) {
                                                                                                                            v42 = this.oay.xjm(new mew((int)this.o2v, 0, (int)this.vbd));
                                                                                                                            if (var3_3 != 0) break block143;
                                                                                                                        }
                                                                                                                        ** GOTO lbl299
                                                                                                                    }
                                                                                                                    catch (oov v43) {
                                                                                                                        throw g_3.c(v43);
                                                                                                                    }
                                                                                                                    if (v42 == 0) break block144;
                                                                                                                }
                                                                                                                catch (oov v44) {
                                                                                                                    throw g_3.c(v44);
                                                                                                                }
                                                                                                                v40 = this;
                                                                                                                if (var3_3 != 0) break block142;
                                                                                                            }
                                                                                                            catch (oov v45) {
                                                                                                                throw g_3.c(v45);
                                                                                                            }
                                                                                                            if (!v40.oay.pxs(new mew((int)this.o2v, 0, (int)this.vbd)).yx3()) {
                                                                                                            }
                                                                                                            ** GOTO lbl299
                                                                                                        }
                                                                                                        catch (oov v46) {
                                                                                                            throw g_3.c(v46);
                                                                                                        }
                                                                                                    }
                                                                                                    v47 = this;
                                                                                                    if (var3_3 != 0) break block145;
                                                                                                }
                                                                                                catch (oov v48) {
                                                                                                    throw g_3.c(v48);
                                                                                                }
                                                                                                cfr_temp_2 = v47.kfp - 0.0;
                                                                                                v42 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                                                            }
                                                                                            catch (oov v49) {
                                                                                                throw g_3.c(v49);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            block146: {
                                                                                                try {
                                                                                                    if (v42 <= 0) break block146;
                                                                                                    this.mop = -0.1;
                                                                                                    if (var3_3 == 0) break block147;
                                                                                                }
                                                                                                catch (oov v50) {
                                                                                                    throw g_3.c(v50);
                                                                                                }
                                                                                            }
                                                                                            v47 = this;
                                                                                        }
                                                                                        catch (oov v51) {
                                                                                            throw g_3.c(v51);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        v47.mop = 0.0;
                                                                                        if (var3_3 == 0) break block147;
lbl299:
                                                                                        // 3 sources

                                                                                        v40 = this;
                                                                                    }
                                                                                    catch (oov v52) {
                                                                                        throw g_3.c(v52);
                                                                                    }
                                                                                }
                                                                                v40.mop -= 0.08;
                                                                            }
                                                                            try {
                                                                                this.mop *= 0.9800000190734863;
                                                                                this.icv *= (double)var4_4;
                                                                                this.bw4 *= (double)var4_4;
                                                                                if (var3_3 == 0) break block121;
lbl311:
                                                                                // 3 sources

                                                                                v12 = this;
                                                                            }
                                                                            catch (oov v53) {
                                                                                throw g_3.c(v53);
                                                                            }
                                                                        }
                                                                        var4_5 = v12.kfp;
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    this.r4r(var1_1, var2_2, 0.02f);
                                                                                    this.vjj(this.icv, this.mop, this.bw4);
                                                                                    this.icv *= 0.5;
                                                                                    this.mop *= 0.5;
                                                                                    this.bw4 *= 0.5;
                                                                                    this.mop -= 0.02;
                                                                                    v54 = this.cbi;
                                                                                    if (var3_3 != 0) break block148;
                                                                                    if (!v54) break block149;
                                                                                }
                                                                                catch (oov v55) {
                                                                                    throw g_3.c(v55);
                                                                                }
                                                                                v56 = this;
                                                                                v57 = this.icv;
                                                                                if (var3_3 != 0) break block150;
                                                                            }
                                                                            catch (oov v58) {
                                                                                throw g_3.c(v58);
                                                                            }
                                                                            v54 = v56.nin(v57, this.mop + 0.6000000238418579 - this.kfp + var4_5, this.bw4);
                                                                        }
                                                                        catch (oov v59) {
                                                                            throw g_3.c(v59);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (!v54) break block149;
                                                                        v56 = this;
                                                                        v57 = 0.30000001192092896;
                                                                    }
                                                                    catch (oov v60) {
                                                                        throw g_3.c(v60);
                                                                    }
                                                                }
                                                                v56.mop = v57;
                                                            }
                                                            try {
                                                                if (var3_3 == 0) break block121;
lbl356:
                                                                // 3 sources

                                                                v5 = this;
                                                            }
                                                            catch (oov v61) {
                                                                throw g_3.c(v61);
                                                            }
                                                        }
                                                        var4_5 = v5.kfp;
                                                        var6_7 = 0.8f;
                                                        var7_9 = 0.02f;
                                                        var8_11 = hc0.uur(this);
                                                        try {
                                                            cfr_temp_3 = var8_11 - 3.0f;
                                                            v62 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                                            if (var3_3 != 0) break block151;
                                                            if (v62 <= 0) break block152;
                                                        }
                                                        catch (oov v63) {
                                                            throw g_3.c(v63);
                                                        }
                                                        var8_11 = 3.0f;
                                                    }
                                                    v62 = (float)this.lfk;
                                                }
                                                try {
                                                    if (var3_3 != 0) break block153;
                                                    if (v62 != false) break block154;
                                                }
                                                catch (oov v64) {
                                                    throw g_3.c(v64);
                                                }
                                                var8_11 *= 0.5f;
                                            }
                                            v62 = (cfr_temp_4 = var8_11 - 0.0f) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                                        }
                                        try {
                                            if (var3_3 != 0) break block155;
                                            if (v62 <= 0) break block156;
                                        }
                                        catch (oov v65) {
                                            throw g_3.c(v65);
                                        }
                                        var6_7 += (0.54600006f - var6_7) * var8_11 / 3.0f;
                                        var7_9 += (this.ldh() * 1.0f - var7_9) * var8_11 / 3.0f;
                                    }
                                    try {
                                        this.r4r(var1_1, var2_2, var7_9);
                                        this.vjj(this.icv, this.mop, this.bw4);
                                        this.icv *= (double)var6_7;
                                        this.mop *= 0.800000011920929;
                                        this.bw4 *= (double)var6_7;
                                        this.mop -= 0.02;
                                        v66 = this;
                                        if (var3_3 != 0) break block157;
                                        v62 = (float)v66.cbi;
                                    }
                                    catch (oov v67) {
                                        throw g_3.c(v67);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (v62 == false) break block121;
                                            v68 = this;
                                            v69 = this;
                                            if (var3_3 != 0) break block158;
                                        }
                                        catch (oov v70) {
                                            throw g_3.c(v70);
                                        }
                                        if (!v68.nin(v69.icv, this.mop + 0.6000000238418579 - this.kfp + var4_5, this.bw4)) break block121;
                                    }
                                    catch (oov v71) {
                                        throw g_3.c(v71);
                                    }
                                    this.mop = 0.30000001192092896;
                                }
                                catch (oov v72) {
                                    throw g_3.c(v72);
                                }
                            }
                            v68 = this;
                            v69 = this;
                        }
                        v68.p1w = v69.zzf;
                        v0 = this;
                    }
                    var4_5 = v0.o2v - this.bc1;
                    v66 = this;
                }
                var6_8 = v66.vbd - this.a4d;
                var8_12 = fe6.dii(var4_5 * var4_5 + var6_8 * var6_8) * 4.0f;
                try {
                    if (var3_3 != 0) break block159;
                    if (!(var8_12 > 1.0f)) break block160;
                }
                catch (oov v73) {
                    throw g_3.c(v73);
                }
                var8_12 = 1.0f;
            }
            this.zzf += (var8_12 - this.zzf) * 0.4f;
            this.pcb += this.zzf;
        }
    }

    public float ldh() {
        return this.poe;
    }

    public void nak(float f) {
        this.poe = f;
    }

    public boolean _nm(i2h i2h2) {
        this.upe(i2h2);
        return false;
    }

    public boolean ofg() {
        return false;
    }

    @Override
    public void xx_() {
        block113: {
            float f;
            int n;
            block112: {
                block111: {
                    block110: {
                        block109: {
                            block108: {
                                block107: {
                                    g_3 g_32;
                                    long l;
                                    block106: {
                                        float f2;
                                        float f3;
                                        float f4;
                                        block104: {
                                            block105: {
                                                block102: {
                                                    float f5;
                                                    block103: {
                                                        g_3 g_33;
                                                        block88: {
                                                            block89: {
                                                                int n2;
                                                                block95: {
                                                                    int n3;
                                                                    block90: {
                                                                        int n4;
                                                                        block91: {
                                                                            int n5;
                                                                            block92: {
                                                                                block93: {
                                                                                    l = e ^ 0x3E303F13B83AL;
                                                                                    n = t9d.c();
                                                                                    try {
                                                                                        super.xx_();
                                                                                        g_33 = this;
                                                                                        if (n != 0) break block88;
                                                                                        if (g_33.oay.v0f) break block89;
                                                                                    }
                                                                                    catch (oov oov2) {
                                                                                        throw g_3.c(oov2);
                                                                                    }
                                                                                    n5 = this.jj5();
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    n4 = n5;
                                                                                                    if (n != 0) break block90;
                                                                                                    if (n4 <= 0) break block91;
                                                                                                }
                                                                                                catch (oov oov3) {
                                                                                                    throw g_3.c(oov3);
                                                                                                }
                                                                                                n4 = this.zni;
                                                                                                if (n != 0) break block92;
                                                                                            }
                                                                                            catch (oov oov4) {
                                                                                                throw g_3.c(oov4);
                                                                                            }
                                                                                            if (n4 > 0) break block93;
                                                                                        }
                                                                                        catch (oov oov5) {
                                                                                            throw g_3.c(oov5);
                                                                                        }
                                                                                        this.zni = 20 * (30 - n5);
                                                                                    }
                                                                                    catch (oov oov6) {
                                                                                        throw g_3.c(oov6);
                                                                                    }
                                                                                }
                                                                                n4 = --this.zni;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (n != 0) break block90;
                                                                                    if (n4 > 0) break block91;
                                                                                }
                                                                                catch (oov oov7) {
                                                                                    throw g_3.c(oov7);
                                                                                }
                                                                                this.dk9(n5 - 1);
                                                                            }
                                                                            catch (oov oov8) {
                                                                                throw g_3.c(oov8);
                                                                            }
                                                                        }
                                                                        n4 = n3 = 0;
                                                                    }
                                                                    while (n3 < 5) {
                                                                        block94: {
                                                                            block96: {
                                                                                erg erg2;
                                                                                block101: {
                                                                                    erg erg3;
                                                                                    block99: {
                                                                                        erg erg4;
                                                                                        block100: {
                                                                                            erg erg5;
                                                                                            block97: {
                                                                                                block98: {
                                                                                                    erg erg6 = this.wjy[n3];
                                                                                                    erg4 = this.rnq(n3);
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (n != 0) break block94;
                                                                                                                        n2 = erg.c6l(erg4, erg6) ? 1 : 0;
                                                                                                                        if (n != 0) break block95;
                                                                                                                    }
                                                                                                                    catch (oov oov9) {
                                                                                                                        throw g_3.c(oov9);
                                                                                                                    }
                                                                                                                    if (n2 != 0) break block96;
                                                                                                                }
                                                                                                                catch (oov oov10) {
                                                                                                                    throw g_3.c(oov10);
                                                                                                                }
                                                                                                                ((dug)this.oay).fp4().si9(this, new S04PacketEntityEquipment(this.jwu(), n3, erg4));
                                                                                                                erg5 = erg6;
                                                                                                                if (n != 0) break block97;
                                                                                                            }
                                                                                                            catch (oov oov11) {
                                                                                                                throw g_3.c(oov11);
                                                                                                            }
                                                                                                            if (erg5 == null) break block98;
                                                                                                        }
                                                                                                        catch (oov oov12) {
                                                                                                            throw g_3.c(oov12);
                                                                                                        }
                                                                                                        this.kpa.l05(erg6.s15());
                                                                                                    }
                                                                                                    catch (oov oov13) {
                                                                                                        throw g_3.c(oov13);
                                                                                                    }
                                                                                                }
                                                                                                erg5 = erg4;
                                                                                            }
                                                                                            try {
                                                                                                if (erg5 != null) {
                                                                                                    this.kpa.fdu(erg4.s15());
                                                                                                }
                                                                                            }
                                                                                            catch (oov oov14) {
                                                                                                throw g_3.c(oov14);
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    erg[] ergArray = this.wjy;
                                                                                                    int n6 = n3;
                                                                                                    erg3 = erg4;
                                                                                                    if (n != 0) break block99;
                                                                                                    if (erg3 != null) break block100;
                                                                                                }
                                                                                                catch (oov oov15) {
                                                                                                    throw g_3.c(oov15);
                                                                                                }
                                                                                                erg2 = null;
                                                                                                break block101;
                                                                                            }
                                                                                            catch (oov oov16) {
                                                                                                throw g_3.c(oov16);
                                                                                            }
                                                                                        }
                                                                                        erg3 = erg4;
                                                                                    }
                                                                                    erg2 = erg3.yaq();
                                                                                }
                                                                                ergArray[n6] = erg2;
                                                                            }
                                                                            ++n3;
                                                                        }
                                                                        if (n == 0) continue;
                                                                    }
                                                                    try {
                                                                        g_33 = this;
                                                                        if (n != 0) break block88;
                                                                        n2 = g_33.g25 % 20;
                                                                    }
                                                                    catch (oov oov17) {
                                                                        throw g_3.c(oov17);
                                                                    }
                                                                }
                                                                try {
                                                                    if (n2 == 0) {
                                                                        this.ii6().llu();
                                                                    }
                                                                }
                                                                catch (oov oov18) {
                                                                    throw g_3.c(oov18);
                                                                }
                                                            }
                                                            this.e_a();
                                                            g_33 = this;
                                                        }
                                                        double d = g_33.o2v - this.bc1;
                                                        double d2 = this.vbd - this.a4d;
                                                        float f6 = (float)(d * d + d2 * d2);
                                                        f4 = this.ksw;
                                                        f = 0.0f;
                                                        this.hdw = this.zt3;
                                                        f3 = 0.0f;
                                                        try {
                                                            float f7 = f6 - 0.0025000002f;
                                                            f2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
                                                            if (n != 0) break block102;
                                                            if (f2 <= 0) break block103;
                                                        }
                                                        catch (oov oov19) {
                                                            throw g_3.c(oov19);
                                                        }
                                                        f3 = 1.0f;
                                                        f = (float)Math.sqrt(f6) * 3.0f;
                                                        f4 = (float)fe6.yr8(d2, d) * 180.0f / (float)Math.PI - 90.0f;
                                                    }
                                                    f2 = (f5 = this.sti - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                                                }
                                                try {
                                                    if (n != 0) break block104;
                                                    if (f2 <= 0) break block105;
                                                }
                                                catch (oov oov20) {
                                                    throw g_3.c(oov20);
                                                }
                                                f4 = this.x5k;
                                            }
                                            try {
                                                g_32 = this;
                                                if (n != 0) break block106;
                                                f2 = (float)g_32.lfk;
                                            }
                                            catch (oov oov21) {
                                                throw g_3.c(oov21);
                                            }
                                        }
                                        if (f2 == false) {
                                            f3 = 0.0f;
                                        }
                                        this.zt3 += (f3 - this.zt3) * 0.3f;
                                        this.oay.e8t.qek((String)((Object)g_3.b("q", (int)16274, (long)(0x7F184ABE2E0C3AA8L ^ l))));
                                        f = this._j7(f4, f);
                                        this.oay.e8t.uio();
                                        g_32 = this;
                                    }
                                    g_32.oay.e8t.qek((String)((Object)g_3.b("q", (int)26206, (long)(0x24C184C79FD8636DL ^ l))));
                                    while (this.x5k - this.p3h < -180.0f) {
                                        try {
                                            this.p3h -= 360.0f;
                                            if (n == 0) {
                                                if (n == 0) continue;
                                                break;
                                            }
                                            break block107;
                                        }
                                        catch (oov oov22) {
                                            throw g_3.c(oov22);
                                        }
                                    }
                                    while (this.x5k - this.p3h >= 180.0f) {
                                        try {
                                            this.p3h += 360.0f;
                                            if (n == 0) {
                                                if (n == 0) continue;
                                                break;
                                            }
                                            break block108;
                                        }
                                        catch (oov oov23) {
                                            throw g_3.c(oov23);
                                        }
                                    }
                                }
                                try {
                                    do {
                                        try {
                                            if (!(this.ksw - this.gsh < -180.0f)) break;
                                            this.gsh -= 360.0f;
                                            if (n == 0) {
                                                continue;
                                            }
                                            break block109;
                                        }
                                        catch (oov oov24) {
                                            throw g_3.c(oov24);
                                        }
                                    } while (n == 0);
                                }
                                catch (oov oov25) {
                                    throw g_3.c(oov25);
                                }
                            }
                            try {
                                do {
                                    try {
                                        if (!(this.ksw - this.gsh >= 180.0f)) break;
                                        this.gsh += 360.0f;
                                        if (n == 0) {
                                            continue;
                                        }
                                        break block110;
                                    }
                                    catch (oov oov26) {
                                        throw g_3.c(oov26);
                                    }
                                } while (n == 0);
                            }
                            catch (oov oov27) {
                                throw g_3.c(oov27);
                            }
                        }
                        try {
                            do {
                                try {
                                    if (!(this.y2i - this.j25 < -180.0f)) break;
                                    this.j25 -= 360.0f;
                                    if (n == 0) {
                                        continue;
                                    }
                                    break block111;
                                }
                                catch (oov oov28) {
                                    throw g_3.c(oov28);
                                }
                            } while (n == 0);
                        }
                        catch (oov oov29) {
                            throw g_3.c(oov29);
                        }
                    }
                    try {
                        do {
                            try {
                                if (!(this.y2i - this.j25 >= 180.0f)) break;
                                this.j25 += 360.0f;
                                if (n == 0) {
                                    continue;
                                }
                                break block112;
                            }
                            catch (oov oov30) {
                                throw g_3.c(oov30);
                            }
                        } while (n == 0);
                    }
                    catch (oov oov31) {
                        throw g_3.c(oov31);
                    }
                }
                try {
                    do {
                        try {
                            if (!(this.q6c - this.h82 < -180.0f)) break;
                            this.h82 -= 360.0f;
                            if (n == 0) {
                                continue;
                            }
                            break block113;
                        }
                        catch (oov oov32) {
                            throw g_3.c(oov32);
                        }
                    } while (n == 0);
                }
                catch (oov oov33) {
                    throw g_3.c(oov33);
                }
            }
            try {
                do {
                    try {
                        if (!(this.q6c - this.h82 >= 180.0f)) break;
                        this.h82 += 360.0f;
                        if (n == 0) {
                            continue;
                        }
                        break block113;
                    }
                    catch (oov oov34) {
                        throw g_3.c(oov34);
                    }
                } while (n == 0);
            }
            catch (oov oov35) {
                throw g_3.c(oov35);
            }
            this.oay.e8t.uio();
            this.z35 += f;
        }
    }

    public float _j7(float f, float f2) {
        float f3;
        block23: {
            float f4;
            block24: {
                int n;
                float f5;
                block21: {
                    block22: {
                        block19: {
                            float f6;
                            block20: {
                                float f7;
                                block16: {
                                    block18: {
                                        block17: {
                                            float f8 = fe6.qsy(f - this.ksw);
                                            this.ksw += f8 * 0.3f;
                                            f5 = fe6.qsy(this.x5k - this.ksw);
                                            n = t9d.b();
                                            try {
                                                try {
                                                    try {
                                                        float f9 = f5 - -90.0f;
                                                        f7 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
                                                        if (n == 0) break block16;
                                                        if (f7 < 0) break block17;
                                                    }
                                                    catch (oov oov2) {
                                                        throw g_3.c(oov2);
                                                    }
                                                    float f10 = f5 - 90.0f;
                                                    f7 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                                                    if (n == 0) break block16;
                                                }
                                                catch (oov oov3) {
                                                    throw g_3.c(oov3);
                                                }
                                                if (f7 < 0) break block18;
                                            }
                                            catch (oov oov4) {
                                                throw g_3.c(oov4);
                                            }
                                        }
                                        f7 = 1.0f;
                                        break block16;
                                    }
                                    f7 = 0.0f;
                                }
                                f4 = f7;
                                try {
                                    float f11 = f5 - -75.0f;
                                    f3 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                    if (n == 0) break block19;
                                    if (f3 >= 0) break block20;
                                }
                                catch (oov oov5) {
                                    throw g_3.c(oov5);
                                }
                                f5 = -75.0f;
                            }
                            f3 = (f6 = f5 - 75.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                        }
                        try {
                            if (n == 0) break block21;
                            if (f3 < 0) break block22;
                        }
                        catch (oov oov6) {
                            throw g_3.c(oov6);
                        }
                        f5 = 75.0f;
                    }
                    this.ksw = this.x5k - f5;
                    float f12 = f5 * f5 - 2500.0f;
                    f3 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                }
                try {
                    try {
                        if (n == 0) break block23;
                        if (f3 > 0) {
                        }
                        break block24;
                    }
                    catch (oov oov7) {
                        throw g_3.c(oov7);
                    }
                    this.ksw += f5 * 0.2f;
                }
                catch (oov oov8) {
                    throw g_3.c(oov8);
                }
            }
            f3 = f4;
        }
        if (f3 != false) {
            f2 *= -1.0f;
        }
        return f2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void e_a() {
        block90: {
            block89: {
                block86: {
                    block83: {
                        block87: {
                            block84: {
                                block82: {
                                    block81: {
                                        block79: {
                                            block77: {
                                                block78: {
                                                    block75: {
                                                        block76: {
                                                            block73: {
                                                                block74: {
                                                                    block72: {
                                                                        block71: {
                                                                            block70: {
                                                                                block68: {
                                                                                    var1_1 = g_3.e ^ 83241636464013L;
                                                                                    var3_2 = t9d.b();
                                                                                    try {
                                                                                        try {
                                                                                            v0 = this.vwx--;
                                                                                            if (var3_2 == 0) break block68;
                                                                                            if (v0 > 0) {
                                                                                                // empty if block
                                                                                            }
                                                                                        }
                                                                                        catch (oov v1) {
                                                                                            throw g_3.c(v1);
                                                                                        }
                                                                                    }
                                                                                    catch (oov v2) {
                                                                                        throw g_3.c(v2);
                                                                                    }
                                                                                    v0 = this.a1q;
                                                                                }
                                                                                try {
                                                                                    if (var3_2 == 0) break block70;
                                                                                    if (v0 > 0) {
                                                                                    }
                                                                                    ** GOTO lbl35
                                                                                }
                                                                                catch (oov v3) {
                                                                                    throw g_3.c(v3);
                                                                                }
                                                                                var4_3 = this.o2v + (this.sz4 - this.o2v) / (double)this.a1q;
                                                                                var6_4 = this.kfp + (this._y0 - this.kfp) / (double)this.a1q;
                                                                                var8_5 = this.vbd + (this.hb4 - this.vbd) / (double)this.a1q;
                                                                                var10_6 = fe6.lrs(this.e7t - (double)this.x5k);
                                                                                try {
                                                                                    this.x5k = (float)((double)this.x5k + var10_6 / (double)this.a1q);
                                                                                    this.y2i = (float)((double)this.y2i + (this.bxw - (double)this.y2i) / (double)this.a1q);
                                                                                    --this.a1q;
                                                                                    this.m6_(var4_3, var6_4, var8_5);
                                                                                    this.iym(this.x5k, this.y2i);
                                                                                    if (var3_2 != 0) break block71;
lbl35:
                                                                                    // 2 sources

                                                                                    v0 = (int)this.de5();
                                                                                }
                                                                                catch (oov v4) {
                                                                                    throw g_3.c(v4);
                                                                                }
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (var3_2 == 0) break block72;
                                                                                    if (v0 != 0) break block71;
                                                                                }
                                                                                catch (oov v5) {
                                                                                    throw g_3.c(v5);
                                                                                }
                                                                                this.icv *= 0.98;
                                                                                this.mop *= 0.98;
                                                                                this.bw4 *= 0.98;
                                                                            }
                                                                            catch (oov v6) {
                                                                                throw g_3.c(v6);
                                                                            }
                                                                        }
                                                                        v0 = (cfr_temp_0 = Math.abs(this.icv) - 0.005) == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (var3_2 == 0) break block73;
                                                                            if (v0 >= 0) break block74;
                                                                        }
                                                                        catch (oov v7) {
                                                                            throw g_3.c(v7);
                                                                        }
                                                                        this.icv = 0.0;
                                                                    }
                                                                    catch (oov v8) {
                                                                        throw g_3.c(v8);
                                                                    }
                                                                }
                                                                v0 = (cfr_temp_1 = Math.abs(this.mop) - 0.005) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                            }
                                                            try {
                                                                try {
                                                                    if (var3_2 == 0) break block75;
                                                                    if (v0 >= 0) break block76;
                                                                }
                                                                catch (oov v9) {
                                                                    throw g_3.c(v9);
                                                                }
                                                                this.mop = 0.0;
                                                            }
                                                            catch (oov v10) {
                                                                throw g_3.c(v10);
                                                            }
                                                        }
                                                        v0 = (cfr_temp_2 = Math.abs(this.bw4) - 0.005) == 0.0 ? 0 : (cfr_temp_2 < 0.0 ? -1 : 1);
                                                    }
                                                    try {
                                                        try {
                                                            if (var3_2 == 0) break block77;
                                                            if (v0 >= 0) break block78;
                                                        }
                                                        catch (oov v11) {
                                                            throw g_3.c(v11);
                                                        }
                                                        this.bw4 = 0.0;
                                                    }
                                                    catch (oov v12) {
                                                        throw g_3.c(v12);
                                                    }
                                                }
                                                this.oay.e8t.qek((String)g_3.b("q", (int)2487, (long)(1929827049715249468L ^ var1_1)));
                                                v0 = (int)this.a81();
                                            }
                                            try {
                                                block80: {
                                                    try {
                                                        try {
                                                            if (var3_2 == 0) break block79;
                                                            if (v0 == 0) break block80;
                                                        }
                                                        catch (oov v13) {
                                                            throw g_3.c(v13);
                                                        }
                                                        this.e1f = false;
                                                        this.z66 = 0.0f;
                                                        this.ooc = 0.0f;
                                                        this.czx = 0.0f;
                                                        if (var3_2 != 0) break block81;
                                                    }
                                                    catch (oov v14) {
                                                        throw g_3.c(v14);
                                                    }
                                                }
                                                v0 = (int)this.de5();
                                            }
                                            catch (oov v15) {
                                                throw g_3.c(v15);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var3_2 == 0) break block82;
                                                if (v0 == 0) break block81;
                                            }
                                            catch (oov v16) {
                                                throw g_3.c(v16);
                                            }
                                            this.oay.e8t.qek((String)g_3.b("q", (int)25078, (long)(7529119150246222182L ^ var1_1)));
                                            this.nd9();
                                            this.oay.e8t.uio();
                                        }
                                        catch (oov v17) {
                                            throw g_3.c(v17);
                                        }
                                    }
                                    try {
                                        this.oay.e8t.uio();
                                        this.oay.e8t.qek((String)g_3.b("q", (int)23481, (long)(916370511895061292L ^ var1_1)));
                                        v18 = this;
                                        if (var3_2 == 0) break block83;
                                        v0 = (int)v18.e1f;
                                    }
                                    catch (oov v19) {
                                        throw g_3.c(v19);
                                    }
                                }
                                try {
                                    block85: {
                                        try {
                                            try {
                                                try {
                                                    if (v0 != 0) {
                                                        v20 = this.mwv();
                                                        if (var3_2 == 0) break block84;
                                                    }
                                                    ** GOTO lbl216
                                                }
                                                catch (oov v21) {
                                                    throw g_3.c(v21);
                                                }
                                                if (v20 == 0) break block85;
                                            }
                                            catch (oov v22) {
                                                throw g_3.c(v22);
                                            }
                                            this.ojw();
                                            if (var3_2 != 0) break block86;
                                        }
                                        catch (oov v23) {
                                            throw g_3.c(v23);
                                        }
                                    }
                                    v20 = this.b2u();
                                }
                                catch (oov v24) {
                                    throw g_3.c(v24);
                                }
                            }
                            try {
                                block88: {
                                    try {
                                        try {
                                            if (var3_2 == 0) break block87;
                                            if (v20 == 0) break block88;
                                        }
                                        catch (oov v25) {
                                            throw g_3.c(v25);
                                        }
                                        this.q6x();
                                        if (var3_2 != 0) break block86;
                                    }
                                    catch (oov v26) {
                                        throw g_3.c(v26);
                                    }
                                }
                                v20 = this.lfk;
                            }
                            catch (oov v27) {
                                throw g_3.c(v27);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var3_2 == 0) break block89;
                                            if (v20 == 0) break block86;
                                        }
                                        catch (oov v28) {
                                            throw g_3.c(v28);
                                        }
                                        v20 = this.vwx;
                                        if (var3_2 == 0) break block89;
                                    }
                                    catch (oov v29) {
                                        throw g_3.c(v29);
                                    }
                                    if (v20 != 0) break block86;
                                }
                                catch (oov v30) {
                                    throw g_3.c(v30);
                                }
                                this.xv1();
                                this.vwx = 10;
                                if (var3_2 != 0) break block86;
                            }
                            catch (oov v31) {
                                throw g_3.c(v31);
                            }
lbl216:
                            // 2 sources

                            v18 = this;
                        }
                        catch (oov v32) {
                            throw g_3.c(v32);
                        }
                    }
                    v18.vwx = 0;
                }
                try {
                    this.oay.e8t.uio();
                    this.oay.e8t.qek((String)g_3.b("q", (int)2998, (long)(1164400051242578742L ^ var1_1)));
                    this.z66 *= 0.98f;
                    this.ooc *= 0.98f;
                    this.czx *= 0.9f;
                    this.ge2(this.z66, this.ooc);
                    this.oay.e8t.uio();
                    this.oay.e8t.qek((String)g_3.b("q", (int)32014, (long)(8211977090883306903L ^ var1_1)));
                    v33 = this.oay;
                    if (var3_2 == 0) break block90;
                    v20 = (int)v33.v0f;
                }
                catch (oov v34) {
                    throw g_3.c(v34);
                }
            }
            try {
                if (v20 == 0) {
                    this._v7();
                }
            }
            catch (oov v35) {
                throw g_3.c(v35);
            }
            v33 = this.oay;
        }
        v33.e8t.uio();
    }

    public void nd9() {
    }

    public void _v7() {
        block4: {
            int n;
            List list;
            int n2;
            block3: {
                int n3;
                n2 = t9d.c();
                list = this.oay.sr2(this, this.aaw().c2h(0.2f, 0.0, 0.2f), Predicates.and((Predicate)k0_.t1f, (Predicate)new g_3$1(this)));
                try {
                    n3 = list.isEmpty();
                    if (n2 != 0) break block3;
                    if (n3 != 0) break block4;
                }
                catch (oov oov2) {
                    throw g_3.c(oov2);
                }
                n3 = n = 0;
            }
            while (n < list.size()) {
                i2h i2h2 = (i2h)list.get(n);
                this.v4n(i2h2);
                ++n;
                if (n2 == 0) continue;
            }
        }
    }

    public void v4n(i2h i2h2) {
        i2h2.u_w(this);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void nw9(i2h var1_1) {
        block23: {
            block19: {
                block22: {
                    block20: {
                        block21: {
                            var2_2 = t9d.c();
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                v0 = this;
                                                if (var2_2 != 0) break block19;
                                                if (v0.hzp != null) {
                                                }
                                                ** GOTO lbl52
                                            }
                                            catch (oov v1) {
                                                throw g_3.c(v1);
                                            }
                                            if (var1_1 == null) {
                                            }
                                            ** GOTO lbl52
                                        }
                                        catch (oov v2) {
                                            throw g_3.c(v2);
                                        }
                                        v3 /* !! */  = this;
                                        if (var2_2 != 0) break block20;
                                    }
                                    catch (oov v4) {
                                        throw g_3.c(v4);
                                    }
                                    if (v3 /* !! */ .oay.v0f) break block21;
                                }
                                catch (oov v5) {
                                    throw g_3.c(v5);
                                }
                                this.vux(this.hzp);
                            }
                            catch (oov v6) {
                                throw g_3.c(v6);
                            }
                        }
                        try {
                            v7 = this;
                            if (var2_2 != 0) break block22;
                            v3 /* !! */  = v7.hzp;
                        }
                        catch (oov v8) {
                            throw g_3.c(v8);
                        }
                    }
                    try {
                        if (v3 /* !! */  != null) {
                            this.hzp.wgv = null;
                        }
                    }
                    catch (oov v9) {
                        throw g_3.c(v9);
                    }
                    v7 = this;
                }
                try {
                    v7.hzp = null;
                    if (var2_2 == 0) break block23;
lbl52:
                    // 3 sources

                    v0 = this;
                }
                catch (oov v10) {
                    throw g_3.c(v10);
                }
            }
            super.nw9(var1_1);
        }
    }

    @Override
    public void dm3() {
        super.dm3();
        this.hdw = this.zt3;
        this.zt3 = 0.0f;
        this.o_8 = 0.0f;
    }

    @Override
    public void ltu(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.sz4 = d;
        this._y0 = d2;
        this.hb4 = d3;
        this.e7t = f;
        this.bxw = f2;
        this.a1q = n;
    }

    public void k5k(boolean bl) {
        this.e1f = bl;
    }

    public void p3n(i2h i2h2, int n) {
        block20: {
            boolean bl;
            qpc qpc2;
            block24: {
                block25: {
                    int n2;
                    block22: {
                        block23: {
                            t9d t9d2;
                            block21: {
                                boolean bl2;
                                block19: {
                                    n2 = t9d.c();
                                    try {
                                        try {
                                            try {
                                                bl2 = i2h2.ma9;
                                                if (n2 != 0) break block19;
                                                if (bl2) break block20;
                                            }
                                            catch (oov oov2) {
                                                throw g_3.c(oov2);
                                            }
                                            t9d2 = this.oay;
                                            if (n2 != 0) break block21;
                                        }
                                        catch (oov oov3) {
                                            throw g_3.c(oov3);
                                        }
                                        bl2 = t9d2.v0f;
                                    }
                                    catch (oov oov4) {
                                        throw g_3.c(oov4);
                                    }
                                }
                                try {
                                    if (bl2) break block20;
                                    t9d2 = this.oay;
                                }
                                catch (oov oov5) {
                                    throw g_3.c(oov5);
                                }
                            }
                            qpc2 = ((dug)t9d2).fp4();
                            try {
                                try {
                                    bl = i2h2 instanceof nvf;
                                    if (n2 != 0) break block22;
                                    if (!bl) break block23;
                                }
                                catch (oov oov6) {
                                    throw g_3.c(oov6);
                                }
                                qpc2.si9(i2h2, new S0DPacketCollectItem(i2h2.jwu(), this.jwu()));
                            }
                            catch (oov oov7) {
                                throw g_3.c(oov7);
                            }
                        }
                        bl = i2h2 instanceof hy9;
                    }
                    try {
                        try {
                            if (n2 != 0) break block24;
                            if (!bl) break block25;
                        }
                        catch (oov oov8) {
                            throw g_3.c(oov8);
                        }
                        qpc2.si9(i2h2, new S0DPacketCollectItem(i2h2.jwu(), this.jwu()));
                    }
                    catch (oov oov9) {
                        throw g_3.c(oov9);
                    }
                }
                bl = i2h2 instanceof uno;
            }
            try {
                if (bl) {
                    qpc2.si9(i2h2, new S0DPacketCollectItem(i2h2.jwu(), this.jwu()));
                }
            }
            catch (oov oov10) {
                throw g_3.c(oov10);
            }
        }
    }

    public boolean gq6(i2h i2h2) {
        boolean bl;
        try {
            bl = this.oay.caq(new fqr(this.o2v, this.kfp + (double)this.c5y(), this.vbd), new fqr(i2h2.o2v, i2h2.kfp + (double)i2h2.c5y(), i2h2.vbd)) == null;
        }
        catch (oov oov2) {
            throw g_3.c(oov2);
        }
        return bl;
    }

    public boolean m3j(mew mew2) {
        boolean bl;
        try {
            bl = this.oay.caq(new fqr(this.o2v, this.kfp + (double)this.c5y(), this.vbd), new fqr(mew2.getX(), mew2.getY(), mew2.getZ())) == null;
        }
        catch (oov oov2) {
            throw g_3.c(oov2);
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean e7y(i2h i2h2) {
        akm akm2;
        block6: {
            int n = t9d.c();
            try {
                try {
                    akm2 = this.oay.caq(new fqr(this.o2v, this.kfp + (double)this.c5y(), this.vbd), new fqr(i2h2.o2v, i2h2.kfp + (double)i2h2.c5y(), i2h2.vbd));
                    if (n != 0) break block6;
                    if (akm2 == null) return true;
                }
                catch (oov oov2) {
                    throw g_3.c(oov2);
                }
                akm2 = this.oay.caq(new fqr(this.o2v, this.kfp + (double)this.c5y(), this.vbd), new fqr(i2h2.o2v, i2h2.kfp, i2h2.vbd));
            }
            catch (oov oov3) {
                throw g_3.c(oov3);
            }
        }
        try {
            if (akm2 != null) return false;
            return true;
        }
        catch (oov oov4) {
            throw g_3.c(oov4);
        }
    }

    @Override
    public fqr m77() {
        return this.wej(1.0f);
    }

    @Override
    public fqr wej(float f) {
        float f2;
        float f3;
        block15: {
            boolean bl;
            block13: {
                int n;
                block14: {
                    n = t9d.c();
                    try {
                        try {
                            try {
                                try {
                                    bl = zwr.cu6.g7m();
                                    if (n != 0) break block13;
                                    if (!bl) break block14;
                                }
                                catch (oov oov2) {
                                    throw g_3.c(oov2);
                                }
                                bl = this instanceof l86;
                                if (n != 0) break block13;
                            }
                            catch (oov oov3) {
                                throw g_3.c(oov3);
                            }
                            if (!bl) break block14;
                        }
                        catch (oov oov4) {
                            throw g_3.c(oov4);
                        }
                        return super.wej(f);
                    }
                    catch (oov oov5) {
                        throw g_3.c(oov5);
                    }
                }
                try {
                    float f2 = f;
                    f2 = 1.0f;
                    if (n != 0) break block15;
                    float f4 = f3 - f2;
                    bl = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                }
                catch (oov oov6) {
                    throw g_3.c(oov6);
                }
            }
            try {
                if (!bl) {
                    return this.kpk(this.y2i, this.q6c);
                }
            }
            catch (oov oov7) {
                throw g_3.c(oov7);
            }
            float f2 = this.j25;
            f2 = (this.y2i - this.j25) * f;
        }
        float f5 = f3 + f2;
        float f6 = this.h82 + (this.q6c - this.h82) * f;
        return this.kpk(f5, f6);
    }

    public float tcg(float f) {
        float f2;
        float f3;
        block2: {
            float f4;
            block3: {
                int n = t9d.c();
                f4 = this.sti - this.laq;
                try {
                    f3 = f4;
                    f2 = 0.0f;
                    if (n != 0) break block2;
                    if (!(f3 < f2)) break block3;
                }
                catch (oov oov2) {
                    throw g_3.c(oov2);
                }
                f4 += 1.0f;
            }
            f3 = this.laq;
            f2 = f4 * f;
        }
        return f3 + f2;
    }

    public boolean de5() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.oay.v0f;
                    if (n == 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw g_3.c(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public boolean mzu() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = this.ma9;
                    if (n != 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw g_3.c(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public boolean tfh() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = this.ma9;
                    if (n != 0) break block2;
                    if (bl) break block3;
                }
                catch (oov oov2) {
                    throw g_3.c(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void dxm() {
        double d;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    g_3 g_32 = this;
                    double d2 = this.z2d.nextDouble() - this.dgt(m6d.nen).nz5();
                    d = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                    if (n != 0) break block2;
                    if (d < 0) break block3;
                }
                catch (oov oov2) {
                    throw g_3.c(oov2);
                }
                d = 1.0;
                break block2;
            }
            d = 0.0;
        }
        g_32.t8d = d;
    }

    @Override
    public float t9t() {
        return this.q6c;
    }

    @Override
    public void jo1(float f) {
        this.q6c = f;
    }

    @Override
    public void w1u(float f) {
        this.ksw = f;
    }

    public float _xk() {
        return this.a0f;
    }

    public void pr9(float f) {
        block5: {
            float f2;
            block4: {
                int n = t9d.c();
                try {
                    try {
                        f2 = f;
                        if (n != 0) break block4;
                        if (!(f2 < 0.0f)) break block5;
                    }
                    catch (oov oov2) {
                        throw g_3.c(oov2);
                    }
                    f2 = 0.0f;
                }
                catch (oov oov3) {
                    throw g_3.c(oov3);
                }
            }
            f = f2;
        }
        this.a0f = f;
    }

    public n_0 ued() {
        return this.oay.fgp().zov(this.b_q().toString());
    }

    public boolean g7h(g_3 g_32) {
        return this.zhc(g_32.ued());
    }

    public boolean zhc(n_0 n_02) {
        boolean bl;
        block6: {
            block5: {
                n_0 n_03;
                block4: {
                    int n = t9d.b();
                    try {
                        try {
                            n_03 = this.ued();
                            if (n == 0) break block4;
                            if (n_03 == null) break block5;
                        }
                        catch (oov oov2) {
                            throw g_3.c(oov2);
                        }
                        n_03 = this.ued();
                    }
                    catch (oov oov3) {
                        throw g_3.c(oov3);
                    }
                }
                bl = n_03.msm(n_02);
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public void hub() {
    }

    public void ypu() {
    }

    public void k04() {
        this.f5u = true;
    }

    public float ek2() {
        return this.za0;
    }

    public void dgi(float f) {
        this.za0 = f;
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

                g_3.e = c.a(-1588744082391618059L, -2735417231007582967L, MethodHandles.lookup().lookupClass()).a(58829995792362L);
                var9 = g_3.e ^ 19974159555908L;
                g_3.o = new HashMap<K, V>(13);
                g_3.b(new String[5]);
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
                var7_3 = new String[33];
                var5_4 = 0;
                var4_5 = "\u000e1\u0095\u00e8Xh\u0000\u00b0a!\u000e%\u00f7\u0093%B'/W\u0092\u00e2\u00fa\u00eb\u009d\u00a7\u00a9\u00c5/\u00bd\u00aa\u008c\b \u00f2Fu$\u0087\u00cb\u00db~\u000f\fp\u00fd\u00d7\u0003?V&GWQ\u0096\u00185}?\u0090\u00d0\u001e\u008e\u0091\u0099'(f\u0095\u00a5\u00c8s\u00eb\u00a8\u00a2\u0086/\u00e2\u00d6g\u00ab\u00b1$}\"it\u00124E\u0003\u00e5\u00a5V\u00b8\u00e1\u0011\u00c7\u009a\u00e3\u00d2\u00d1\u00904-\u0098\u00d7 \u00a1\u00b18%\u00af\nzSfu?\u0094h\u00cc\u008f\u001a\u00a8\ra0\u0004Ld\b\u00e4\u00dc4\u00be>=Po a2\u00f7\u0015\u00bcB~X\u00ef\u00de\u0087>\u00cf\u00d4+\u00e9D_\u00cb\u00fc\u0081\u00ca\u00f6\b\u009dF\u00eaE\u008a\u0096 \u0098 \u00f7\u00f7t\u00fey\u00f8\u00b1\u009b^\u009f\u00f1g(R&\u00fdw}Hl\u00e29\u00d4v\u00f3\u00d2$w\u00b2\u0001\u00cc\u00038`\u00df\u00cf_wU6\u0005M\u00e8'\u0087d\u00a0\u00d4\u008f\u0014\u00f2U\u00c4O\u00d8\u00c8_\u00a8\u00df\u00b4\u00c0d\t-\u00c9\u009b8\u0007\u0003w(\u0094f\fW\f\u00b3\u00d3\u009f\u00b8\u0019\u00ad\u009d\u009f6f\u000edM\u0010\u00e4b0\u00d6\u000e\u00dc\u00b8\\9\u00f3\u00afas\u00bb\u00ec/\u0018\u00cb\u0006\u0095\u00f1\u0082g)\u00df\u00c7o\u00a6|s\u00ca\u0004\u0001\u00c1\u00b7\u00a2\u0011\u00bd\u00c5r\u008a \u00df\u00c8k\u00f1\u00c5I\u00c8\u00c6\u00e7\u00c8\u00fa\u00f7\u00ceb|&\u00f0\u00c4e\u00fdY\u0097\u00d3a/8\u00ac\u00bfi&\u0012\u00bf(\u008b\u008d\u0000\u00e83\u00bd^\u00f8\u0097\u0018Y%~\u00e9\u00d0\u00c6\u0011h\u00f0C\u0084\u00a2\u00a4m\u00ba\u00d7>$+\u00e7M\u00e7g\u00cfz7<\u00cf\u0014p \u00b7\u001e\u009a\u00ff\u00b7v\u00a8\u00d0@\u00e3\u00fezP\u0085\u00f6\\\u00f9\u00e2A\u00b2\u00c0\u00bb\u0018V\u0010\u00914\b\u0017L\u0097\u0084\u0010g@\u00b2;\u0091\u009c}\u0089i`\u00ed\u0001\u00be*\u009a\\(\u00c3\u0016\u0019#\u00c9B\u0001\u00c45\u001cf\u00a1\u0002\u00dd\u00a6\u00f9x\u0097E\u0013\u00bd.\u00bc\u00f6\u001b\u0006\u00a2\u00fa\u00dd\u00d8'\u0090\u001bo\"\u001b8L[\u00ba\u0010\u00164\u00df\u009f\u00c0\u00a8*\u00e7#\u000b #7\u008e\u00ba\u00a1 \u0013L`\u00f8>\u00cfoLh[\u00c8\u00c6\u00b3i\u0004\u00e7*!\u0000\u0004'l\u00f6\u007f!9\u00bc\u00d1\u00d9\u0096\u00bb\u00d0(1\u00afl\u00a3\u00ac'\u00b9\u00e4\u00f2\u009fJ\u00186\u0093_\u0002\u0097\u00ff\u008e\u00c3\u00945\u008e:s5\u0080\u00aa\u00f6\n\u00a9X\u008a\u00a4\u00fe\u0082\u00f7\u00d1i\u00d4\u0018]\u00f3\u0005\u0098\u001a\u00939w\u00d6\u00f49(\u009f\u00f5\u00ee\u00cc\u0095\u00bbY/\u00d9\u00d4l|(=\u0097\u00cd\u00ef\u009cG'\u001a\u00a9\u0096\u0080\u00b0\u00dbF\u001bN\u00c6\u00edm\u00c7xE\u0091L\u00e1\u00a3\u0011\u0018\u00af\u0095\u00cb\u00f2M\u00c0\u00ce'.\u00c27\u00af\u0010n\u001a\u00d1\u0082\u00d4n!\u0004\u00c2H\u00ae\u009d|D\u00eeh \u00a9\u0083xh\u0013\u00daL\u009d,\u00ef\u00e9\u00c2\u00f0\u00d4'\u00fcR\u0096\u00dcx\u0010\u009bi\u00c7\u00a8B\u00e0\u00c9\u00e1\u00a6E-\u0010\u00deY\u0001M)\u00f3\u000b{\u00cf]mQ_h\u008a\u00b2 XUj\u0001l\u0005\u00f6\u00c5\u0099O\u00fb\u0000\u0097\u00e7\u0084g]\u00d8D\u008d\u00e1\u00a2\u00fd\u00f7\u00e8\u008aW\u00ca8\tkC8\u00ad\u0016\u00ae\u00bc\u00b0\"w\u0004\u00eb;f0\u0098\u008f\u00e0\u00f0\u009f\u008a2\u00fc\u00ce\u0086OR\u00c4%\u00c9\u0084!>J\u00d0@\u00af!G\u00f5G\u0088\u00bcr\u00d3\u00fe\u00f2\u00be[\u00ca\u00cf{\u009e\u001b\u00cc\u00e1\u00d0\u00b5\u00cf\u0010\u00e1\u00e3I\u00aea\u0012\u0088:W+\u000f\u00ab\u00feds\u0095\u0010\u0089\u0084\u00c1H\u008aNB\u00b9\u009c\u009b\u00b1\u00ad\r\u00e1\u00b2\u00c00\u0007\u00c4Y\u00886p\u00d7\u00a6:&\u00fb\u001f\u00a5\u00b9\u00e8\u00b5\u00a1\u000b\u00a1\u00f2\u00f9\u00ff\u00cf{\u007f\u00f6z\u00c3\u008b\u00eb+#\u00c7\u00cb\u00b3\u0013=x\u0002\u00c65\u0096\\\u009e\u00c9\u008d\u0095\u00b3 \u00d9:\u00c3\u00dd\u00b6\u00f2\u00b9 A}`\u009c\u00e5\u00b1\u008bk\u009a5\ry\u00b1\u00a7G\u00fe\u0092\u0004\u0098\u008c\u00ea\u00ef%J\u0010 _\u00b6Bz'2\u009a\u00afG\u00d1'\u00caIP\u00a9 \u00a7\u00b2a<\u00ee\u00de%\u00fd\u00f7v\u00d8t\u0080G\u00cbR\u0012\u00ff\u0088P\u0090E\u001dX\u009c%\u00ee0`\u00e7VM 6\u00be\u00f8\u00bb?\u00c3D=7\u00bb\u00c1\u00ed\u000eU\u00f0\u0019\u001e\u0087j\u00c5#\u00bb\\M>\u00a3*\u00cdM\u0018*u";
                var6_6 = "\u000e1\u0095\u00e8Xh\u0000\u00b0a!\u000e%\u00f7\u0093%B'/W\u0092\u00e2\u00fa\u00eb\u009d\u00a7\u00a9\u00c5/\u00bd\u00aa\u008c\b \u00f2Fu$\u0087\u00cb\u00db~\u000f\fp\u00fd\u00d7\u0003?V&GWQ\u0096\u00185}?\u0090\u00d0\u001e\u008e\u0091\u0099'(f\u0095\u00a5\u00c8s\u00eb\u00a8\u00a2\u0086/\u00e2\u00d6g\u00ab\u00b1$}\"it\u00124E\u0003\u00e5\u00a5V\u00b8\u00e1\u0011\u00c7\u009a\u00e3\u00d2\u00d1\u00904-\u0098\u00d7 \u00a1\u00b18%\u00af\nzSfu?\u0094h\u00cc\u008f\u001a\u00a8\ra0\u0004Ld\b\u00e4\u00dc4\u00be>=Po a2\u00f7\u0015\u00bcB~X\u00ef\u00de\u0087>\u00cf\u00d4+\u00e9D_\u00cb\u00fc\u0081\u00ca\u00f6\b\u009dF\u00eaE\u008a\u0096 \u0098 \u00f7\u00f7t\u00fey\u00f8\u00b1\u009b^\u009f\u00f1g(R&\u00fdw}Hl\u00e29\u00d4v\u00f3\u00d2$w\u00b2\u0001\u00cc\u00038`\u00df\u00cf_wU6\u0005M\u00e8'\u0087d\u00a0\u00d4\u008f\u0014\u00f2U\u00c4O\u00d8\u00c8_\u00a8\u00df\u00b4\u00c0d\t-\u00c9\u009b8\u0007\u0003w(\u0094f\fW\f\u00b3\u00d3\u009f\u00b8\u0019\u00ad\u009d\u009f6f\u000edM\u0010\u00e4b0\u00d6\u000e\u00dc\u00b8\\9\u00f3\u00afas\u00bb\u00ec/\u0018\u00cb\u0006\u0095\u00f1\u0082g)\u00df\u00c7o\u00a6|s\u00ca\u0004\u0001\u00c1\u00b7\u00a2\u0011\u00bd\u00c5r\u008a \u00df\u00c8k\u00f1\u00c5I\u00c8\u00c6\u00e7\u00c8\u00fa\u00f7\u00ceb|&\u00f0\u00c4e\u00fdY\u0097\u00d3a/8\u00ac\u00bfi&\u0012\u00bf(\u008b\u008d\u0000\u00e83\u00bd^\u00f8\u0097\u0018Y%~\u00e9\u00d0\u00c6\u0011h\u00f0C\u0084\u00a2\u00a4m\u00ba\u00d7>$+\u00e7M\u00e7g\u00cfz7<\u00cf\u0014p \u00b7\u001e\u009a\u00ff\u00b7v\u00a8\u00d0@\u00e3\u00fezP\u0085\u00f6\\\u00f9\u00e2A\u00b2\u00c0\u00bb\u0018V\u0010\u00914\b\u0017L\u0097\u0084\u0010g@\u00b2;\u0091\u009c}\u0089i`\u00ed\u0001\u00be*\u009a\\(\u00c3\u0016\u0019#\u00c9B\u0001\u00c45\u001cf\u00a1\u0002\u00dd\u00a6\u00f9x\u0097E\u0013\u00bd.\u00bc\u00f6\u001b\u0006\u00a2\u00fa\u00dd\u00d8'\u0090\u001bo\"\u001b8L[\u00ba\u0010\u00164\u00df\u009f\u00c0\u00a8*\u00e7#\u000b #7\u008e\u00ba\u00a1 \u0013L`\u00f8>\u00cfoLh[\u00c8\u00c6\u00b3i\u0004\u00e7*!\u0000\u0004'l\u00f6\u007f!9\u00bc\u00d1\u00d9\u0096\u00bb\u00d0(1\u00afl\u00a3\u00ac'\u00b9\u00e4\u00f2\u009fJ\u00186\u0093_\u0002\u0097\u00ff\u008e\u00c3\u00945\u008e:s5\u0080\u00aa\u00f6\n\u00a9X\u008a\u00a4\u00fe\u0082\u00f7\u00d1i\u00d4\u0018]\u00f3\u0005\u0098\u001a\u00939w\u00d6\u00f49(\u009f\u00f5\u00ee\u00cc\u0095\u00bbY/\u00d9\u00d4l|(=\u0097\u00cd\u00ef\u009cG'\u001a\u00a9\u0096\u0080\u00b0\u00dbF\u001bN\u00c6\u00edm\u00c7xE\u0091L\u00e1\u00a3\u0011\u0018\u00af\u0095\u00cb\u00f2M\u00c0\u00ce'.\u00c27\u00af\u0010n\u001a\u00d1\u0082\u00d4n!\u0004\u00c2H\u00ae\u009d|D\u00eeh \u00a9\u0083xh\u0013\u00daL\u009d,\u00ef\u00e9\u00c2\u00f0\u00d4'\u00fcR\u0096\u00dcx\u0010\u009bi\u00c7\u00a8B\u00e0\u00c9\u00e1\u00a6E-\u0010\u00deY\u0001M)\u00f3\u000b{\u00cf]mQ_h\u008a\u00b2 XUj\u0001l\u0005\u00f6\u00c5\u0099O\u00fb\u0000\u0097\u00e7\u0084g]\u00d8D\u008d\u00e1\u00a2\u00fd\u00f7\u00e8\u008aW\u00ca8\tkC8\u00ad\u0016\u00ae\u00bc\u00b0\"w\u0004\u00eb;f0\u0098\u008f\u00e0\u00f0\u009f\u008a2\u00fc\u00ce\u0086OR\u00c4%\u00c9\u0084!>J\u00d0@\u00af!G\u00f5G\u0088\u00bcr\u00d3\u00fe\u00f2\u00be[\u00ca\u00cf{\u009e\u001b\u00cc\u00e1\u00d0\u00b5\u00cf\u0010\u00e1\u00e3I\u00aea\u0012\u0088:W+\u000f\u00ab\u00feds\u0095\u0010\u0089\u0084\u00c1H\u008aNB\u00b9\u009c\u009b\u00b1\u00ad\r\u00e1\u00b2\u00c00\u0007\u00c4Y\u00886p\u00d7\u00a6:&\u00fb\u001f\u00a5\u00b9\u00e8\u00b5\u00a1\u000b\u00a1\u00f2\u00f9\u00ff\u00cf{\u007f\u00f6z\u00c3\u008b\u00eb+#\u00c7\u00cb\u00b3\u0013=x\u0002\u00c65\u0096\\\u009e\u00c9\u008d\u0095\u00b3 \u00d9:\u00c3\u00dd\u00b6\u00f2\u00b9 A}`\u009c\u00e5\u00b1\u008bk\u009a5\ry\u00b1\u00a7G\u00fe\u0092\u0004\u0098\u008c\u00ea\u00ef%J\u0010 _\u00b6Bz'2\u009a\u00afG\u00d1'\u00caIP\u00a9 \u00a7\u00b2a<\u00ee\u00de%\u00fd\u00f7v\u00d8t\u0080G\u00cbR\u0012\u00ff\u0088P\u0090E\u001dX\u009c%\u00ee0`\u00e7VM 6\u00be\u00f8\u00bb?\u00c3D=7\u00bb\u00c1\u00ed\u000eU\u00f0\u0019\u001e\u0087j\u00c5#\u00bb\\M>\u00a3*\u00cdM\u0018*u".length();
                var3_7 = 32;
                var2_8 = -1;
lbl22:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = g_3.b(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00be\u00cf\"\u00cf\u00f7uu\u0080X\u008d\u00f9\u00c9S\u00b9N\u0080@\u0015;\u0081\u0015\u009e\u00a03\u00f6W\u00e6\u0016D\u00bbLW|Y\u009dT-\u00b7\u00de\u0085\u00da\u0088\u008c\u008f\u00ad\u00a7}}\u0000I\u00ef\u0096r\u008el\u0096\u00bdoT\u00f8\u00b8\u00d1\u00cc\u00b3PF[5\u00bc*\u009b\u009e\u00cd\u00ff\u00cd\u0006\u00b7\u0096\u001ew\u00a6";
                    var6_6 = "\u00be\u00cf\"\u00cf\u00f7uu\u0080X\u008d\u00f9\u00c9S\u00b9N\u0080@\u0015;\u0081\u0015\u009e\u00a03\u00f6W\u00e6\u0016D\u00bbLW|Y\u009dT-\u00b7\u00de\u0085\u00da\u0088\u008c\u008f\u00ad\u00a7}}\u0000I\u00ef\u0096r\u008el\u0096\u00bdoT\u00f8\u00b8\u00d1\u00cc\u00b3PF[5\u00bc*\u009b\u009e\u00cd\u00ff\u00cd\u0006\u00b7\u0096\u001ew\u00a6".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl36:
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
lbl41:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = g_3.b(var8_9).intern();
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
lbl53:
                // 1 sources

                ** continue;
            }
        }
        g_3.m = var7_3;
        g_3.n = new String[33];
        g_3.dmv = UUID.fromString((String)g_3.b("q", (int)21387, (long)(1486887958903370734L ^ var9)));
        g_3.mo6 = new xk5(g_3.dmv, (String)g_3.b("q", (int)17493, (long)(5794276141158245378L ^ var9)), 0.30000001192092896, 2).d2_(false);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] a() {
        return b;
    }

    private static oov c(oov oov2) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1879;
        if (g_3.n[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])o.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    o.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("g_3", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = m[n2].getBytes("ISO-8859-1");
            g_3.n[n2] = g_3.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g_3.n[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = g_3.b(n, l);
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
            throw new RuntimeException("g_3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g_3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

