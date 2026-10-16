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

public class dge
extends yqv
implements uv0 {
    public float yzk;
    public float mhp;
    public float un8;
    private boolean kz9;
    private static final long d;
    private static final String[] g;
    private static final String[] h;
    private static final Map s;

    public dge(t9d t9d2) {
        super(t9d2);
        this.i1n = new dge$ilj(this);
        this.r1d.tn8(1, new dge$dsq(this));
        this.r1d.tn8(2, new dge$_fz(this));
        this.r1d.tn8(3, new dge$y05(this));
        this.r1d.tn8(5, new dge$g4m(this));
        this.g9o.tn8(1, new zy4(this));
        this.g9o.tn8(3, new _z_(this, osf.class));
    }

    @Override
    public void tbj() {
        super.tbj();
        this.oit.kp2(16, (byte)1);
    }

    public void p1y(int n) {
        this.oit.c66(16, (byte)n);
        this.yxc(0.51000005f * (float)n, 0.51000005f * (float)n);
        this.m6_(this.o2v, this.kfp, this.vbd);
        this.dgt(m6d.t9k).zf7(n * n);
        this.dgt(m6d.w7i).zf7(0.2f + 0.1f * (float)n);
        this.uh3(this.axb());
        this.dlk = n;
    }

    public int qi8() {
        return this.oit.miz(16);
    }

    @Override
    public void srs(bdo bdo2) {
        long l = d ^ 0x163DF1796E5BL;
        super.srs(bdo2);
        bdo2.iin((String)((Object)dge.d("t", (int)12634, (long)(0x1676A623A2B6356DL ^ l))), this.qi8() - 1);
        bdo2.zyu((String)((Object)dge.d("t", (int)7840, (long)(0x23C12558EE799A99L ^ l))), this.kz9);
    }

    @Override
    public void cjb(bdo bdo2) {
        block2: {
            int n;
            long l;
            block3: {
                l = d ^ 0x6093B42602F0L;
                int n2 = t9d.c();
                super.cjb(bdo2);
                n = bdo2.uz7((String)((Object)dge.d("t", (int)4997, (long)(0x7AC50398CC977B15L ^ l))));
                try {
                    if (n2 != 0) break block2;
                    if (n >= 0) break block3;
                }
                catch (oov oov2) {
                    throw dge.b(oov2);
                }
                n = 0;
            }
            this.p1y(n + 1);
            this.kz9 = bdo2.dvl((String)((Object)dge.d("t", (int)6955, (long)(0x5A9F9038B99CF3BCL ^ l))));
        }
    }

    public w_0 mj4() {
        return w_0.wce;
    }

    public String u5x() {
        CallSite callSite;
        StringBuilder stringBuilder;
        block4: {
            long l = d ^ 0x7EDD3765AB53L;
            int n = t9d.b();
            stringBuilder = new StringBuilder();
            callSite = dge.d("t", (int)29402, (long)(0x4903C2D5DF6EB3E6L ^ l));
            if (n != 0) {
                block3: {
                    try {
                        stringBuilder = stringBuilder.append((String)((Object)callSite));
                        if (this.qi8() <= 1) break block3;
                        callSite = dge.d("t", (int)29123, (long)(0x5D9625AB104130F6L ^ l));
                        break block4;
                    }
                    catch (oov oov2) {
                        throw dge.b(oov2);
                    }
                }
                callSite = dge.d("t", (int)31703, (long)(0x31D96CFBE5993AE7L ^ l));
            }
        }
        return stringBuilder.append((String)((Object)callSite)).toString();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void xx_() {
        block45: {
            block44: {
                block40: {
                    block41: {
                        block42: {
                            block43: {
                                block38: {
                                    block39: {
                                        var1_1 = t9d.b();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v0 = this.oay.v0f;
                                                                if (var1_1 == 0) break block38;
                                                                if (v0 != 0) ** GOTO lbl36
                                                            }
                                                            catch (oov v1) {
                                                                throw dge.b(v1);
                                                            }
                                                            v2 = this;
                                                            if (var1_1 == 0) break block39;
                                                        }
                                                        catch (oov v3) {
                                                            throw dge.b(v3);
                                                        }
                                                        if (v2.oay.rbk() != v66.na2) ** GOTO lbl36
                                                    }
                                                    catch (oov v4) {
                                                        throw dge.b(v4);
                                                    }
                                                    v0 = this.qi8();
                                                    if (var1_1 == 0) break block38;
                                                }
                                                catch (oov v5) {
                                                    throw dge.b(v5);
                                                }
                                                if (v0 <= 0) ** GOTO lbl36
                                            }
                                            catch (oov v6) {
                                                throw dge.b(v6);
                                            }
                                            this.ma9 = true;
                                        }
                                        catch (oov v7) {
                                            throw dge.b(v7);
                                        }
lbl36:
                                        // 4 sources

                                        this.mhp += (this.yzk - this.mhp) * 0.5f;
                                        this.un8 = this.mhp;
                                        super.xx_();
                                        v2 = this;
                                    }
                                    v0 = v2.lfk;
                                }
                                try {
                                    try {
                                        try {
                                            if (var1_1 == 0) break block40;
                                            if (v0 != 0) {
                                            }
                                            ** GOTO lbl106
                                        }
                                        catch (oov v8) {
                                            throw dge.b(v8);
                                        }
                                        v0 = this.kz9;
                                        if (var1_1 == 0) break block40;
                                    }
                                    catch (oov v9) {
                                        throw dge.b(v9);
                                    }
                                    if (v0 == 0) {
                                    }
                                    ** GOTO lbl106
                                }
                                catch (oov v10) {
                                    throw dge.b(v10);
                                }
                                var2_2 = this.qi8();
                                for (var3_3 = 0; var3_3 < var2_2 * 8; ++var3_3) {
                                    var4_4 = this.z2d.nextFloat() * 3.1415927f * 2.0f;
                                    var5_5 = this.z2d.nextFloat() * 0.5f + 0.5f;
                                    var6_6 = fe6.rtn(var4_4) * (float)var2_2 * 0.5f * var5_5;
                                    var7_7 = fe6.ssk(var4_4) * (float)var2_2 * 0.5f * var5_5;
                                    var8_8 = this.oay;
                                    var9_9 = this.mj4();
                                    var10_10 = this.o2v + (double)var6_6;
                                    var12_11 = this.vbd + (double)var7_7;
                                    try {
                                        var8_8.zvy(var9_9, var10_10, this.aaw().bx_, var12_11, 0.0, 0.0, 0.0, new int[0]);
                                        if (var1_1 != 0) {
                                            if (var1_1 != 0) continue;
                                            break;
                                        }
                                        break block41;
                                    }
                                    catch (oov v11) {
                                        throw dge.b(v11);
                                    }
                                }
                                try {
                                    try {
                                        v12 = this;
                                        if (var1_1 == 0) break block42;
                                        if (!v12.xak()) break block43;
                                    }
                                    catch (oov v13) {
                                        throw dge.b(v13);
                                    }
                                    this.lhu(this.u5x(), this.o23(), ((this.z2d.nextFloat() - this.z2d.nextFloat()) * 0.2f + 1.0f) / 0.8f);
                                }
                                catch (oov v14) {
                                    throw dge.b(v14);
                                }
                            }
                            v12 = this;
                        }
                        v12.yzk = -0.5f;
                    }
                    try {
                        try {
                            if (var1_1 != 0) break block44;
lbl106:
                            // 3 sources

                            v15 = this;
                            if (var1_1 == 0) break block45;
                        }
                        catch (oov v16) {
                            throw dge.b(v16);
                        }
                        v0 = v15.lfk;
                    }
                    catch (oov v17) {
                        throw dge.b(v17);
                    }
                }
                try {
                    try {
                        try {
                            if (v0 != 0) break block44;
                            v15 = this;
                            if (var1_1 == 0) break block45;
                        }
                        catch (oov v18) {
                            throw dge.b(v18);
                        }
                        if (!v15.kz9) break block44;
                    }
                    catch (oov v19) {
                        throw dge.b(v19);
                    }
                    this.yzk = 1.0f;
                }
                catch (oov v20) {
                    throw dge.b(v20);
                }
            }
            this.kz9 = this.lfk;
            v15 = this;
        }
        v15.mni();
    }

    public void mni() {
        this.yzk *= 0.6f;
    }

    public int usz() {
        return this.z2d.nextInt(20) + 10;
    }

    public dge yx5() {
        return new dge(this.oay);
    }

    @Override
    public void jcg(int n) {
        dge dge2;
        block14: {
            block13: {
                int n2;
                int n3;
                block12: {
                    n3 = t9d.b();
                    try {
                        try {
                            n2 = n;
                            if (n3 == 0) break block12;
                            if (n2 != 16) break block13;
                        }
                        catch (oov oov2) {
                            throw dge.b(oov2);
                        }
                        n2 = this.qi8();
                    }
                    catch (oov oov3) {
                        throw dge.b(oov3);
                    }
                }
                int n4 = n2;
                try {
                    try {
                        try {
                            try {
                                this.yxc(0.51000005f * (float)n4, 0.51000005f * (float)n4);
                                this.x5k = this.q6c;
                                this.ksw = this.q6c;
                                dge2 = this;
                                if (n3 == 0) break block14;
                                if (!dge2.mwv()) break block13;
                            }
                            catch (oov oov4) {
                                throw dge.b(oov4);
                            }
                            dge2 = this;
                            if (n3 == 0) break block14;
                        }
                        catch (oov oov5) {
                            throw dge.b(oov5);
                        }
                        if (dge2.z2d.nextInt(20) != 0) break block13;
                    }
                    catch (oov oov6) {
                        throw dge.b(oov6);
                    }
                    this.qw8();
                }
                catch (oov oov7) {
                    throw dge.b(oov7);
                }
            }
            dge2 = this;
        }
        super.jcg(n);
    }

    @Override
    public void _kl() {
        dge dge2;
        block22: {
            block23: {
                int n;
                int n2;
                int n3;
                block24: {
                    n3 = t9d.b();
                    n2 = this.qi8();
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        dge2 = this;
                                        if (n3 == 0) break block22;
                                        if (dge2.oay.v0f) break block23;
                                    }
                                    catch (oov oov2) {
                                        throw dge.b(oov2);
                                    }
                                    n = n2;
                                    if (n3 == 0) break block24;
                                }
                                catch (oov oov3) {
                                    throw dge.b(oov3);
                                }
                                if (n <= 1) break block23;
                            }
                            catch (oov oov4) {
                                throw dge.b(oov4);
                            }
                            dge2 = this;
                            if (n3 == 0) break block22;
                        }
                        catch (oov oov5) {
                            throw dge.b(oov5);
                        }
                        float f = dge2.i55() - 0.0f;
                        n = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                    }
                    catch (oov oov6) {
                        throw dge.b(oov6);
                    }
                }
                if (n <= 0) {
                    int n4 = 2 + this.z2d.nextInt(3);
                    for (int i = 0; i < n4; ++i) {
                        boolean bl;
                        dge dge3;
                        float f;
                        float f2;
                        block27: {
                            block25: {
                                block26: {
                                    f2 = ((float)(i % 2) - 0.5f) * (float)n2 / 4.0f;
                                    f = ((float)(i / 2) - 0.5f) * (float)n2 / 4.0f;
                                    dge3 = this.yx5();
                                    try {
                                        try {
                                            try {
                                                dge2 = this;
                                                if (n3 == 0) break block22;
                                                bl = dge2.qrh();
                                                if (n3 == 0) break block25;
                                            }
                                            catch (oov oov7) {
                                                throw dge.b(oov7);
                                            }
                                            if (!bl) break block26;
                                        }
                                        catch (oov oov8) {
                                            throw dge.b(oov8);
                                        }
                                        dge3.x84(this.hei());
                                    }
                                    catch (oov oov9) {
                                        throw dge.b(oov9);
                                    }
                                }
                                bl = this.jx9();
                            }
                            try {
                                try {
                                    if (n3 == 0) continue;
                                    if (!bl) break block27;
                                }
                                catch (oov oov10) {
                                    throw dge.b(oov10);
                                }
                                dge3._92();
                            }
                            catch (oov oov11) {
                                throw dge.b(oov11);
                            }
                        }
                        dge3.p1y(n2 / 2);
                        dge3.x24(this.o2v + (double)f2, this.kfp + 0.5, this.vbd + (double)f, this.z2d.nextFloat() * 360.0f, 0.0f);
                        bl = this.oay.xzq(dge3);
                        if (n3 != 0) continue;
                    }
                }
            }
            dge2 = this;
        }
        super._kl();
    }

    @Override
    public void u_w(i2h i2h2) {
        block9: {
            dge dge2;
            block10: {
                boolean bl;
                block8: {
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                super.u_w(i2h2);
                                bl = i2h2 instanceof osf;
                                if (n == 0) break block8;
                                if (!bl) break block9;
                            }
                            catch (oov oov2) {
                                throw dge.b(oov2);
                            }
                            dge2 = this;
                            if (n == 0) break block10;
                        }
                        catch (oov oov3) {
                            throw dge.b(oov3);
                        }
                        bl = dge2.cry();
                    }
                    catch (oov oov4) {
                        throw dge.b(oov4);
                    }
                }
                if (!bl) break block9;
                dge2 = this;
            }
            dge2.w3f((g_3)i2h2);
        }
    }

    @Override
    public void bzm(ha9 ha92) {
        block5: {
            dge dge2;
            block4: {
                int n = t9d.b();
                try {
                    try {
                        dge2 = this;
                        if (n == 0) break block4;
                        if (!dge2.cry()) break block5;
                    }
                    catch (oov oov2) {
                        throw dge.b(oov2);
                    }
                    dge2 = this;
                }
                catch (oov oov3) {
                    throw dge.b(oov3);
                }
            }
            dge2.w3f(ha92);
        }
    }

    public void w3f(g_3 g_32) {
        block12: {
            int n;
            long l;
            block13: {
                int n2;
                block11: {
                    l = d ^ 0x7A842F3D6653L;
                    n2 = t9d.c();
                    int n3 = this.qi8();
                    try {
                        try {
                            n = this.gq6(g_32);
                            if (n2 != 0) break block11;
                            if (n == 0) break block12;
                        }
                        catch (oov oov2) {
                            throw dge.b(oov2);
                        }
                        double d = this.wxg(g_32) - 0.6 * (double)n3 * 0.6 * (double)n3;
                        n = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                    }
                    catch (oov oov3) {
                        throw dge.b(oov3);
                    }
                }
                try {
                    try {
                        if (n2 != 0) break block13;
                        if (n >= 0) break block12;
                    }
                    catch (oov oov4) {
                        throw dge.b(oov4);
                    }
                    n = g_32.m1t(ofh.kun(this), this.t2j()) ? 1 : 0;
                }
                catch (oov oov5) {
                    throw dge.b(oov5);
                }
            }
            try {
                if (n != 0) {
                    this.lhu((String)((Object)dge.d("t", (int)22284, (long)(0x62F6AFA78B69DB3EL ^ l))), 1.0f, (this.z2d.nextFloat() - this.z2d.nextFloat()) * 0.2f + 1.0f);
                    this.wm5(this, g_32);
                }
            }
            catch (oov oov6) {
                throw dge.b(oov6);
            }
        }
    }

    @Override
    public float c5y() {
        return 0.625f * this.ikl;
    }

    public boolean cry() {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = this.qi8();
                        if (n == 0) break block4;
                        if (bl <= true) break block5;
                    }
                    catch (oov oov2) {
                        throw dge.b(oov2);
                    }
                    bl = true;
                    break block4;
                }
                catch (oov oov3) {
                    throw dge.b(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    public int t2j() {
        return this.qi8();
    }

    @Override
    public String wcg() {
        CallSite callSite;
        StringBuilder stringBuilder;
        block4: {
            long l = d ^ 0xDA2ED475B55L;
            int n = t9d.b();
            stringBuilder = new StringBuilder();
            callSite = dge.d("t", (int)29402, (long)(0x4903B1AA054C43E0L ^ l));
            if (n != 0) {
                block3: {
                    try {
                        stringBuilder = stringBuilder.append((String)((Object)callSite));
                        if (this.qi8() <= 1) break block3;
                        callSite = dge.d("t", (int)29123, (long)(0x5D9656D4CA63C0F0L ^ l));
                        break block4;
                    }
                    catch (oov oov2) {
                        throw dge.b(oov2);
                    }
                }
                callSite = dge.d("t", (int)31703, (long)(0x31D91F843FBBCAE1L ^ l));
            }
        }
        return stringBuilder.append((String)((Object)callSite)).toString();
    }

    @Override
    public String ix6() {
        CallSite callSite;
        StringBuilder stringBuilder;
        block4: {
            long l = d ^ 0x32D42A36ED1BL;
            int n = t9d.b();
            stringBuilder = new StringBuilder();
            callSite = dge.d("t", (int)13998, (long)(0x3ECC9BDAA20DB1D1L ^ l));
            if (n != 0) {
                block3: {
                    try {
                        stringBuilder = stringBuilder.append((String)((Object)callSite));
                        if (this.qi8() <= 1) break block3;
                        callSite = dge.d("t", (int)31384, (long)(0x1476CEE12EE97DE6L ^ l));
                        break block4;
                    }
                    catch (oov oov2) {
                        throw dge.b(oov2);
                    }
                }
                callSite = dge.d("t", (int)25349, (long)(0x61703B85F4E46470L ^ l));
            }
        }
        return stringBuilder.append((String)((Object)callSite)).toString();
    }

    @Override
    public u7m q4n() {
        u7m u7m2;
        try {
            u7m2 = this.qi8() == 1 ? xbr.g77 : null;
        }
        catch (oov oov2) {
            throw dge.b(oov2);
        }
        return u7m2;
    }

    @Override
    public boolean iaw() {
        int n;
        block53: {
            block50: {
                int n2;
                tts tts2;
                block52: {
                    block51: {
                        t9d t9d2;
                        mew mew2;
                        block49: {
                            block46: {
                                dge dge2;
                                block48: {
                                    block47: {
                                        mew2 = new mew(fe6.jqf(this.o2v), 0, fe6.jqf(this.vbd));
                                        tts2 = this.oay.pxs(mew2);
                                        n2 = t9d.b();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        t9d2 = this.oay;
                                                        if (n2 == 0) break block46;
                                                        if (t9d2.r7d().z28() != gxq.itf) break block47;
                                                    }
                                                    catch (oov oov2) {
                                                        throw dge.b(oov2);
                                                    }
                                                    dge2 = this;
                                                    if (n2 == 0) break block48;
                                                }
                                                catch (oov oov3) {
                                                    throw dge.b(oov3);
                                                }
                                                if (dge2.z2d.nextInt(4) == 1) break block47;
                                            }
                                            catch (oov oov4) {
                                                throw dge.b(oov4);
                                            }
                                            return false;
                                        }
                                        catch (oov oov5) {
                                            throw dge.b(oov5);
                                        }
                                    }
                                    dge2 = this;
                                }
                                t9d2 = dge2.oay;
                            }
                            try {
                                try {
                                    if (n2 == 0) break block49;
                                    if (t9d2.rbk() == v66.na2) break block50;
                                }
                                catch (oov oov6) {
                                    throw dge.b(oov6);
                                }
                                t9d2 = this.oay;
                            }
                            catch (oov oov7) {
                                throw dge.b(oov7);
                            }
                        }
                        gyu gyu2 = t9d2.getBiomeGenForCoords(mew2);
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
                                                                    if (gyu2 != gyu.bpg) break block51;
                                                                    double d = this.kfp - 50.0;
                                                                    n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                                                                    if (n2 == 0) break block52;
                                                                }
                                                                catch (oov oov8) {
                                                                    throw dge.b(oov8);
                                                                }
                                                                if (n <= 0) break block51;
                                                            }
                                                            catch (oov oov9) {
                                                                throw dge.b(oov9);
                                                            }
                                                            double d = this.kfp - 70.0;
                                                            n = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                                                            if (n2 == 0) break block52;
                                                        }
                                                        catch (oov oov10) {
                                                            throw dge.b(oov10);
                                                        }
                                                        if (n >= 0) break block51;
                                                    }
                                                    catch (oov oov11) {
                                                        throw dge.b(oov11);
                                                    }
                                                    float f = this.z2d.nextFloat() - 0.5f;
                                                    n = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                                                    if (n2 == 0) break block52;
                                                }
                                                catch (oov oov12) {
                                                    throw dge.b(oov12);
                                                }
                                                if (n >= 0) break block51;
                                            }
                                            catch (oov oov13) {
                                                throw dge.b(oov13);
                                            }
                                            float f = this.z2d.nextFloat() - this.oay.w27();
                                            n = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                                            if (n2 == 0) break block52;
                                        }
                                        catch (oov oov14) {
                                            throw dge.b(oov14);
                                        }
                                        if (n >= 0) break block51;
                                    }
                                    catch (oov oov15) {
                                        throw dge.b(oov15);
                                    }
                                    n = this.oay.rts(new mew(this));
                                    if (n2 == 0) break block52;
                                }
                                catch (oov oov16) {
                                    throw dge.b(oov16);
                                }
                                if (n > this.z2d.nextInt(8)) break block51;
                            }
                            catch (oov oov17) {
                                throw dge.b(oov17);
                            }
                            return super.iaw();
                        }
                        catch (oov oov18) {
                            throw dge.b(oov18);
                        }
                    }
                    n = this.z2d.nextInt(10);
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (n2 == 0) break block53;
                                        if (n != 0) break block50;
                                    }
                                    catch (oov oov19) {
                                        throw dge.b(oov19);
                                    }
                                    n = tts2.r3x(987234911L).nextInt(10);
                                    if (n2 == 0) break block53;
                                }
                                catch (oov oov20) {
                                    throw dge.b(oov20);
                                }
                                if (n != 0) break block50;
                            }
                            catch (oov oov21) {
                                throw dge.b(oov21);
                            }
                            double d = this.kfp - 40.0;
                            n = d == 0.0 ? 0 : (d < 0.0 ? -1 : 1);
                            if (n2 == 0) break block53;
                        }
                        catch (oov oov22) {
                            throw dge.b(oov22);
                        }
                        if (n >= 0) break block50;
                    }
                    catch (oov oov23) {
                        throw dge.b(oov23);
                    }
                    return super.iaw();
                }
                catch (oov oov24) {
                    throw dge.b(oov24);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    @Override
    public float o23() {
        return 0.4f * (float)this.qi8();
    }

    @Override
    public int d1r() {
        return 0;
    }

    public boolean nfr() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = this.qi8();
                    if (n != 0) break block2;
                    if (bl <= false) break block3;
                }
                catch (oov oov2) {
                    throw dge.b(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public boolean xak() {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.b();
                try {
                    try {
                        bl = this.qi8();
                        if (n == 0) break block4;
                        if (bl <= 2 != 0) break block5;
                    }
                    catch (oov oov2) {
                        throw dge.b(oov2);
                    }
                    bl = true;
                    break block4;
                }
                catch (oov oov3) {
                    throw dge.b(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public void xv1() {
        this.mop = 0.42f;
        this.u19 = true;
    }

    @Override
    public ps6 hx8(css css2, ps6 ps62) {
        int n;
        block9: {
            int n2;
            int n3;
            block7: {
                int n4;
                block8: {
                    int n5 = t9d.c();
                    n4 = this.z2d.nextInt(3);
                    try {
                        try {
                            try {
                                n3 = n4++;
                                n2 = 2;
                                if (n5 != 0) break block7;
                                if (n3 >= n2) break block8;
                            }
                            catch (oov oov2) {
                                throw dge.b(oov2);
                            }
                            float f = this.z2d.nextFloat() - 0.5f * css2.os2();
                            n = f == 0.0f ? 0 : (f < 0.0f ? -1 : 1);
                            if (n5 != 0) break block9;
                        }
                        catch (oov oov3) {
                            throw dge.b(oov3);
                        }
                        if (n < 0) {
                            // empty if block
                        }
                    }
                    catch (oov oov4) {
                        throw dge.b(oov4);
                    }
                }
                n3 = 1;
                n2 = n4;
            }
            n = n3 << n2;
        }
        int n6 = n;
        this.p1y(n6);
        return super.hx8(css2, ps62);
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

                dge.d = c.a(-3708400124376778097L, 8182229620680525914L, MethodHandles.lookup().lookupClass()).a(71078516092312L);
                dge.s = new HashMap<K, V>(13);
                var0 = dge.d ^ 93295430580889L;
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
                var6_5 = "G\u00b5\u00ea\u00bf\u00a4w\u0093\u0091\u00c2\u00df\u00e5\u00f0?\u0090F\u00a4 `:Jd\u001a)\u00a1h\u00de\u00e3\u00f71w\u00c0m[\"\u00ad\u00c2\u00af\u00c5\u00c3\u00e6\u0086\u0013\u008e\r,!C\u0010\u00b7 \u008e\u00d2\u00b1\u00f2\u008eK\u00f2\u00048\u0007'\u00b5\u00f9<\u0080\u0083\u0005\u00b3\u00d7\u00f5.\u00b1\u00c8G\u00d2+\u00f6<*3Wo\u0010\u00f7\u00c4\u0005\u00d9\u0005\bCN\u00d6.\tD\u00c4P\u00cf? \u00abN\u00cb\u009f}\u00f2\u0018\u00c2\u00b5Nv\u00b0\u00f0\u00ab/w\u00b5\u00ed\u0088\u0091V\u00b5%\u00fc\u00814\u00b7\u0093\n\u00a6\u00e5\u00c5\u0010\u00c9\u008e\u00ba\u00f2\u009b\u00b3\u001c<P&\u00cb\u00f7\"\u0088\u001eq\u0010\u0016\u008f'@\u00fa5A\u00c7\u0083\t\\\u0091\u00d00\u00a8m t\u0010\u00c0\u00cfY\u001b\u00d5\u009a\"\u00d6\u00eaps\u00e9\u0081\u0083\u00ad\u00dd\u00d4B\u00cf\u00ae#/?~\u0003\u00e9o\u0093^\u00fa\u0010\u00b9y~\u00bd&\bM\u00b5\u000e\u00ee\u0085J^\u0081\u00abS";
                var8_6 = "G\u00b5\u00ea\u00bf\u00a4w\u0093\u0091\u00c2\u00df\u00e5\u00f0?\u0090F\u00a4 `:Jd\u001a)\u00a1h\u00de\u00e3\u00f71w\u00c0m[\"\u00ad\u00c2\u00af\u00c5\u00c3\u00e6\u0086\u0013\u008e\r,!C\u0010\u00b7 \u008e\u00d2\u00b1\u00f2\u008eK\u00f2\u00048\u0007'\u00b5\u00f9<\u0080\u0083\u0005\u00b3\u00d7\u00f5.\u00b1\u00c8G\u00d2+\u00f6<*3Wo\u0010\u00f7\u00c4\u0005\u00d9\u0005\bCN\u00d6.\tD\u00c4P\u00cf? \u00abN\u00cb\u009f}\u00f2\u0018\u00c2\u00b5Nv\u00b0\u00f0\u00ab/w\u00b5\u00ed\u0088\u0091V\u00b5%\u00fc\u00814\u00b7\u0093\n\u00a6\u00e5\u00c5\u0010\u00c9\u008e\u00ba\u00f2\u009b\u00b3\u001c<P&\u00cb\u00f7\"\u0088\u001eq\u0010\u0016\u008f'@\u00fa5A\u00c7\u0083\t\\\u0091\u00d00\u00a8m t\u0010\u00c0\u00cfY\u001b\u00d5\u009a\"\u00d6\u00eaps\u00e9\u0081\u0083\u00ad\u00dd\u00d4B\u00cf\u00ae#/?~\u0003\u00e9o\u0093^\u00fa\u0010\u00b9y~\u00bd&\bM\u00b5\u000e\u00ee\u0085J^\u0081\u00abS".length();
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
                    var9_3[var7_4++] = dge.d(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u001c\u00ed\u00bf\u0087{c\u00e00?le\u00f1'c\u0090\u0000\u0004@\u0017\u0014\u00e0-\u001e(\u0010\u0016n\u0094\u0083\u0001\u00a8\u00dc\u00d5\u00d9\u008bz7\u00de\u00c5d\u00cb";
                    var8_6 = "\u001c\u00ed\u00bf\u0087{c\u00e00?le\u00f1'c\u0090\u0000\u0004@\u0017\u0014\u00e0-\u001e(\u0010\u0016n\u0094\u0083\u0001\u00a8\u00dc\u00d5\u00d9\u008bz7\u00de\u00c5d\u00cb".length();
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
                    var9_3[var7_4++] = dge.d(var10_9).intern();
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
        dge.g = var9_3;
        dge.h = new String[11];
    }

    private static oov b(oov oov2) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3851;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])s.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    s.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dge", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            dge.h[n2] = dge.d(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dge.d(n, l);
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
            throw new RuntimeException("dge" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dge.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

