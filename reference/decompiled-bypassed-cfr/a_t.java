/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class a_t
extends s0i {
    private static final UUID ud4;
    private static final xk5 uab;
    private static final Set nqi;
    private boolean dt5;
    private static final long c;
    private static final String[] g;
    private static final String[] u;
    private static final Map v;

    public a_t(t9d t9d2) {
        super(t9d2);
        this.yxc(0.6f, 2.9f);
        this.nr7 = 1.0f;
        this.r1d.tn8(0, new dnq(this));
        this.r1d.tn8(2, new h2d(this, 1.0, false));
        this.r1d.tn8(7, new _tb(this, 1.0));
        this.r1d.tn8(8, new bdq(this, ha9.class, 8.0f));
        this.r1d.tn8(8, new ov6(this));
        this.r1d.tn8(10, new a_t$vbq(this));
        this.r1d.tn8(11, new a_t$vef(this));
        this.g9o.tn8(1, new z7z((laq)this, false, new Class[0]));
        this.g9o.tn8(2, new a_t$f0b(this));
        this.g9o.tn8(3, new s24(this, tl9.class, 10, true, false, new a_t$1(this)));
    }

    @Override
    public void nyy() {
        super.nyy();
        this.dgt(m6d.t9k).zf7(40.0);
        this.dgt(m6d.w7i).zf7(0.3f);
        this.dgt(m6d.y3f).zf7(7.0);
        this.dgt(m6d.wg4).zf7(64.0);
    }

    @Override
    public void tbj() {
        super.tbj();
        this.oit.kp2(16, new Short(0));
        this.oit.kp2(17, new Byte(0));
        this.oit.kp2(18, new Byte(0));
    }

    @Override
    public void srs(bdo bdo2) {
        long l = c ^ 0x265926C240CFL;
        super.srs(bdo2);
        zfz zfz2 = this.ejt();
        bdo2.ge7((String)((Object)a_t.e("x", (int)16411, (long)(0x4654D095025C53ABL ^ l))), (short)e0x.mxb(zfz2.r_y()));
        bdo2.ge7((String)((Object)a_t.e("x", (int)7798, (long)(0x391F0FF5B4588DC7L ^ l))), (short)zfz2.r_y().hvp(zfz2));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void cjb(bdo var1_1) {
        block6: {
            block5: {
                var2_2 = a_t.c ^ 89023458389092L;
                var4_3 = t9d.b();
                try {
                    super.cjb(var1_1);
                    v0 = var1_1.inh((String)a_t.e("x", (int)18602, (long)(4542445074798950322L ^ var2_2)), 8);
                    if (var4_3 == 0) break block5;
                    if (v0 != 0) {
                    }
                    ** GOTO lbl17
                }
                catch (oov v1) {
                    throw a_t.a(v1);
                }
                var5_4 = e0x.mdd(var1_1.u14((String)a_t.e("x", (int)16411, (long)(5067858254223326976L ^ var2_2)))).kig(var1_1.hp9((String)a_t.e("x", (int)10002, (long)(31162487792883715L ^ var2_2))) & 65535);
                try {
                    if (var4_3 != 0) break block6;
lbl17:
                    // 2 sources

                    v0 = var1_1.hp9((String)a_t.e("x", (int)16411, (long)(5067858254223326976L ^ var2_2)));
                }
                catch (oov v2) {
                    throw a_t.a(v2);
                }
            }
            var5_4 = e0x.csc(v0).kig(var1_1.hp9((String)a_t.e("x", (int)7798, (long)(4116142020232733036L ^ var2_2))) & 65535);
        }
        this.y4i(var5_4);
    }

    private boolean y5t(ha9 ha92) {
        double d;
        block11: {
            block12: {
                int n;
                block10: {
                    erg erg2;
                    block9: {
                        n = t9d.c();
                        erg erg3 = ha92.up_._dn[3];
                        try {
                            erg2 = erg3;
                            if (n != 0) break block9;
                            if (erg2 == null) break block10;
                        }
                        catch (oov oov2) {
                            throw a_t.a(oov2);
                        }
                        erg2 = erg3;
                    }
                    try {
                        if (erg2.gn1() == u7m.gfm(ox_.jzx)) {
                            return false;
                        }
                    }
                    catch (oov oov3) {
                        throw a_t.a(oov3);
                    }
                }
                fqr fqr2 = ha92.wej(1.0f).kec();
                fqr fqr3 = new fqr(this.o2v - ha92.o2v, this.aaw().bx_ + (double)(this.ikl / 2.0f) - (ha92.kfp + (double)ha92.c5y()), this.vbd - ha92.vbd);
                double d2 = fqr3.vtb();
                fqr3 = fqr3.kec();
                double d3 = fqr2.xvl(fqr3);
                try {
                    try {
                        double d4 = d3 - (1.0 - 0.025 / d2);
                        d = d4 == 0.0 ? 0 : (d4 > 0.0 ? 1 : -1);
                        if (n != 0) break block11;
                        if (d <= 0) break block12;
                    }
                    catch (oov oov4) {
                        throw a_t.a(oov4);
                    }
                    d = (double)ha92.gq6(this);
                    break block11;
                }
                catch (oov oov5) {
                    throw a_t.a(oov5);
                }
            }
            d = 0.0;
        }
        return (boolean)d;
    }

    @Override
    public float c5y() {
        return 2.55f;
    }

    @Override
    public void e_a() {
        block8: {
            a_t a_t2;
            block6: {
                block7: {
                    int n = t9d.c();
                    try {
                        a_t2 = this;
                        if (n != 0) break block6;
                        if (!a_t2.oay.v0f) break block7;
                    }
                    catch (oov oov2) {
                        throw a_t.a(oov2);
                    }
                    for (int i = 0; i < 2; ++i) {
                        try {
                            this.oay.zvy(w_0.t9k, this.o2v + (this.z2d.nextDouble() - 0.5) * (double)this.uo6, this.kfp + this.z2d.nextDouble() * (double)this.ikl - 0.25, this.vbd + (this.z2d.nextDouble() - 0.5) * (double)this.uo6, (this.z2d.nextDouble() - 0.5) * 2.0, -this.z2d.nextDouble(), (this.z2d.nextDouble() - 0.5) * 2.0, new int[0]);
                            if (n == 0) {
                                if (n == 0) continue;
                                break;
                            }
                            break block8;
                        }
                        catch (oov oov3) {
                            throw a_t.a(oov3);
                        }
                    }
                }
                this.e1f = false;
                a_t2 = this;
            }
            super.e_a();
        }
    }

    @Override
    public void qar() {
        block36: {
            a_t a_t2;
            block35: {
                block37: {
                    int n;
                    int n2;
                    block33: {
                        block34: {
                            block31: {
                                block32: {
                                    n2 = t9d.b();
                                    try {
                                        try {
                                            n = this.n08();
                                            if (n2 == 0) break block31;
                                            if (n == 0) break block32;
                                        }
                                        catch (oov oov2) {
                                            throw a_t.a(oov2);
                                        }
                                        this.m1t(ofh.e7v, 1.0f);
                                    }
                                    catch (oov oov3) {
                                        throw a_t.a(oov3);
                                    }
                                }
                                n = this._ah();
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (n2 == 0) break block33;
                                                    if (n == 0) break block34;
                                                }
                                                catch (oov oov4) {
                                                    throw a_t.a(oov4);
                                                }
                                                n = this.dt5;
                                                if (n2 == 0) break block33;
                                            }
                                            catch (oov oov5) {
                                                throw a_t.a(oov5);
                                            }
                                            if (n != 0) break block34;
                                        }
                                        catch (oov oov6) {
                                            throw a_t.a(oov6);
                                        }
                                        n = this.z2d.nextInt(100);
                                        if (n2 == 0) break block33;
                                    }
                                    catch (oov oov7) {
                                        throw a_t.a(oov7);
                                    }
                                    if (n != 0) break block34;
                                }
                                catch (oov oov8) {
                                    throw a_t.a(oov8);
                                }
                                this.tjx(false);
                            }
                            catch (oov oov9) {
                                throw a_t.a(oov9);
                            }
                        }
                        try {
                            a_t2 = this;
                            if (n2 == 0) break block35;
                            n = a_t2.oay.m40();
                        }
                        catch (oov oov10) {
                            throw a_t.a(oov10);
                        }
                    }
                    if (n != 0) {
                        float f = this.xeu(1.0f);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (n2 == 0) break block36;
                                                if (!(f > 0.5f)) break block37;
                                            }
                                            catch (oov oov11) {
                                                throw a_t.a(oov11);
                                            }
                                            a_t2 = this;
                                            if (n2 == 0) break block35;
                                        }
                                        catch (oov oov12) {
                                            throw a_t.a(oov12);
                                        }
                                        if (!a_t2.oay.cfv(new mew(this))) break block37;
                                    }
                                    catch (oov oov13) {
                                        throw a_t.a(oov13);
                                    }
                                    a_t2 = this;
                                    if (n2 == 0) break block35;
                                }
                                catch (oov oov14) {
                                    throw a_t.a(oov14);
                                }
                                if (!(a_t2.z2d.nextFloat() * 30.0f < (f - 0.4f) * 2.0f)) break block37;
                            }
                            catch (oov oov15) {
                                throw a_t.a(oov15);
                            }
                            this.ux8(null);
                            this.tjx(false);
                            this.dt5 = false;
                            this.plc();
                        }
                        catch (oov oov16) {
                            throw a_t.a(oov16);
                        }
                    }
                }
                a_t2 = this;
            }
            super.qar();
        }
    }

    public boolean plc() {
        double d = this.o2v + (this.z2d.nextDouble() - 0.5) * 64.0;
        double d2 = this.kfp + (double)(this.z2d.nextInt(64) - 32);
        double d3 = this.vbd + (this.z2d.nextDouble() - 0.5) * 64.0;
        return this.u5q(d, d2, d3);
    }

    public boolean i2r(i2h i2h2) {
        fqr fqr2 = new fqr(this.o2v - i2h2.o2v, this.aaw().bx_ + (double)(this.ikl / 2.0f) - i2h2.kfp + (double)i2h2.c5y(), this.vbd - i2h2.vbd);
        fqr2 = fqr2.kec();
        double d = 16.0;
        double d2 = this.o2v + (this.z2d.nextDouble() - 0.5) * 8.0 - fqr2.lvi * d;
        double d3 = this.kfp + (double)(this.z2d.nextInt(16) - 8) - fqr2.gn5 * d;
        double d4 = this.vbd + (this.z2d.nextDouble() - 0.5) * 8.0 - fqr2.bn2 * d;
        return this.u5q(d2, d3, d4);
    }

    /*
     * Unable to fully structure code
     */
    public boolean u5q(double var1_1, double var3_2, double var5_3) {
        block37: {
            block35: {
                block36: {
                    block30: {
                        block31: {
                            block32: {
                                var7_4 = a_t.c ^ 95469159937886L;
                                var10_5 = this.o2v;
                                var12_6 = this.kfp;
                                var14_7 = this.vbd;
                                this.o2v = var1_1;
                                this.kfp = var3_2;
                                this.vbd = var5_3;
                                var16_8 = 0;
                                var9_9 = t9d.c();
                                var17_10 = new mew(this.o2v, this.kfp, this.vbd);
                                try {
                                    v0 = this.oay.xjm(var17_10);
                                    if (var9_9 != 0) break block30;
                                    if (v0 == 0) break block31;
                                }
                                catch (oov v1) {
                                    throw a_t.a(v1);
                                }
                                var18_11 = 0;
                                while (var18_11 == 0) {
                                    block34: {
                                        block33: {
                                            try {
                                                try {
                                                    v0 = var17_10.getY();
                                                    if (var9_9 != 0 || var9_9 != 0) break block32;
                                                }
                                                catch (oov v2) {
                                                    throw a_t.a(v2);
                                                }
                                                if (v0 <= 0) break;
                                            }
                                            catch (oov v3) {
                                                throw a_t.a(v3);
                                            }
                                            var19_12 = var17_10.eve();
                                            var20_14 = this.oay.getBlockState(var19_12).r_y();
                                            try {
                                                if (var9_9 != 0) break block33;
                                                if (var20_14.p1r().c3t()) {
                                                }
                                                ** GOTO lbl43
                                            }
                                            catch (oov v4) {
                                                throw a_t.a(v4);
                                            }
                                            var18_11 = 1;
                                            try {
                                                if (var9_9 == 0) break block34;
lbl43:
                                                // 2 sources

                                                this.kfp -= 1.0;
                                            }
                                            catch (oov v5) {
                                                throw a_t.a(v5);
                                            }
                                        }
                                        var17_10 = var19_12;
                                    }
                                    if (var9_9 == 0) continue;
                                }
                                v0 = var18_11;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var9_9 != 0) break block30;
                                                if (v0 == 0) break block31;
                                            }
                                            catch (oov v6) {
                                                throw a_t.a(v6);
                                            }
                                            super.clj(this.o2v, this.kfp, this.vbd);
                                            v0 = (int)this.oay.bb4(this, this.aaw()).isEmpty();
                                            if (var9_9 != 0) break block30;
                                        }
                                        catch (oov v7) {
                                            throw a_t.a(v7);
                                        }
                                        if (v0 == 0) break block31;
                                    }
                                    catch (oov v8) {
                                        throw a_t.a(v8);
                                    }
                                    v0 = (int)this.oay.hhd(this.aaw());
                                    if (var9_9 != 0) break block30;
                                }
                                catch (oov v9) {
                                    throw a_t.a(v9);
                                }
                                if (v0 != 0) break block31;
                            }
                            catch (oov v10) {
                                throw a_t.a(v10);
                            }
                            var16_8 = 1;
                        }
                        v0 = var16_8;
                    }
                    try {
                        try {
                            if (var9_9 != 0) break block35;
                            if (v0 != 0) break block36;
                        }
                        catch (oov v11) {
                            throw a_t.a(v11);
                        }
                        this.m6_(var10_5, var12_6, var14_7);
                        return false;
                    }
                    catch (oov v12) {
                        throw a_t.a(v12);
                    }
                }
                v0 = 128;
            }
            var18_11 = v0;
            for (var19_13 = 0; var19_13 < var18_11; ++var19_13) {
                var20_15 = (double)var19_13 / ((double)var18_11 - 1.0);
                var22_16 = (this.z2d.nextFloat() - 0.5f) * 0.2f;
                var23_17 = (this.z2d.nextFloat() - 0.5f) * 0.2f;
                var24_18 = (this.z2d.nextFloat() - 0.5f) * 0.2f;
                var25_19 = var10_5 + (this.o2v - var10_5) * var20_15 + (this.z2d.nextDouble() - 0.5) * (double)this.uo6 * 2.0;
                var27_20 = var12_6 + (this.kfp - var12_6) * var20_15 + this.z2d.nextDouble() * (double)this.ikl;
                var29_21 = var14_7 + (this.vbd - var14_7) * var20_15 + (this.z2d.nextDouble() - 0.5) * (double)this.uo6 * 2.0;
                try {
                    this.oay.zvy(w_0.t9k, var25_19, var27_20, var29_21, var22_16, var23_17, var24_18, new int[0]);
                    if (var9_9 == 0) {
                        if (var9_9 == 0) continue;
                        break;
                    }
                    break block37;
                }
                catch (oov v13) {
                    throw a_t.a(v13);
                }
            }
            this.oay.amg(var10_5, var12_6, var14_7, (String)a_t.e("x", (int)12917, (long)(5091762762583479900L ^ var7_4)), 1.0f, 1.0f);
            this.lhu((String)a_t.e("x", (int)13611, (long)(3333386507668001039L ^ var7_4)), 1.0f, 1.0f);
        }
        return true;
    }

    @Override
    public String _n1() {
        CallSite callSite;
        block3: {
            long l;
            block2: {
                l = c ^ 0x276770B57AB9L;
                try {
                    if (!this._ah()) break block2;
                    callSite = a_t.e("x", (int)18456, (long)(0x29DC681A436E61D9L ^ l));
                    break block3;
                }
                catch (oov oov2) {
                    throw a_t.a(oov2);
                }
            }
            callSite = a_t.e("x", (int)7813, (long)(0x6897EBB947B2B748L ^ l));
        }
        return callSite;
    }

    @Override
    public String wcg() {
        long l = c ^ 0x3DC63AFC75C1L;
        return a_t.e("x", (int)29994, (long)(0x1936566566ECD392L ^ l));
    }

    @Override
    public String ix6() {
        long l = c ^ 0x2B0FD8DC38FL;
        return a_t.e("x", (int)24731, (long)(0xDAE4A55CDC5706FL ^ l));
    }

    @Override
    public u7m q4n() {
        return xbr.odc;
    }

    @Override
    public void ir3(boolean bl, int n) {
        int n2 = t9d.b();
        u7m u7m2 = this.q4n();
        if (u7m2 != null) {
            int n3 = this.z2d.nextInt(2 + n);
            for (int i = 0; i < n3; ++i) {
                this.e70(u7m2, 1);
                if (n2 != 0) continue;
            }
        }
    }

    public void y4i(zfz zfz2) {
        this.oit.c66(16, (short)(e0x.r2y(zfz2) & 0xFFFF));
    }

    public zfz ejt() {
        return e0x.v1b(this.oit.vxp(16) & 0xFFFF);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public boolean m1t(ofh var1_1, float var2_2) {
        block62: {
            block63: {
                block52: {
                    block53: {
                        block60: {
                            block56: {
                                block57: {
                                    block58: {
                                        block54: {
                                            block55: {
                                                block51: {
                                                    block49: {
                                                        block50: {
                                                            var3_3 = t9d.c();
                                                            try {
                                                                try {
                                                                    v0 /* !! */  = this;
                                                                    if (var3_3 != 0) break block49;
                                                                    if (!v0 /* !! */ .nss(var1_1)) break block50;
                                                                }
                                                                catch (oov v1) {
                                                                    throw a_t.a(v1);
                                                                }
                                                                return false;
                                                            }
                                                            catch (oov v2) {
                                                                throw a_t.a(v2);
                                                            }
                                                        }
                                                        v0 /* !! */  = var1_1.nra();
                                                    }
                                                    try {
                                                        try {
                                                            if (var3_3 != 0) break block51;
                                                            if (v0 /* !! */  != null) {
                                                            }
                                                            ** GOTO lbl39
                                                        }
                                                        catch (oov v3) {
                                                            throw a_t.a(v3);
                                                        }
                                                        v0 /* !! */  = var1_1.nra();
                                                    }
                                                    catch (oov v4) {
                                                        throw a_t.a(v4);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v5 = v0 /* !! */  instanceof tl9;
                                                                if (var3_3 != 0) break block52;
                                                                if (v5 != 0) break block53;
                                                            }
                                                            catch (oov v6) {
                                                                throw a_t.a(v6);
                                                            }
lbl39:
                                                            // 2 sources

                                                            v5 = this.oay.v0f;
                                                            if (var3_3 != 0) break block54;
                                                        }
                                                        catch (oov v7) {
                                                            throw a_t.a(v7);
                                                        }
                                                        if (v5 != 0) break block55;
                                                    }
                                                    catch (oov v8) {
                                                        throw a_t.a(v8);
                                                    }
                                                    this.tjx(true);
                                                }
                                                catch (oov v9) {
                                                    throw a_t.a(v9);
                                                }
                                            }
                                            v5 = var1_1 instanceof c7o;
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var3_3 != 0) break block56;
                                                                if (v5 == 0) break block57;
                                                            }
                                                            catch (oov v10) {
                                                                throw a_t.a(v10);
                                                            }
                                                            v5 = var1_1.nra() instanceof ha9;
                                                            if (var3_3 != 0) break block56;
                                                        }
                                                        catch (oov v11) {
                                                            throw a_t.a(v11);
                                                        }
                                                        if (v5 == 0) break block57;
                                                    }
                                                    catch (oov v12) {
                                                        throw a_t.a(v12);
                                                    }
                                                    v13 = var1_1.nra() instanceof z96;
                                                    if (var3_3 != 0) break block58;
                                                }
                                                catch (oov v14) {
                                                    throw a_t.a(v14);
                                                }
                                                if (v13) {
                                                }
                                                ** GOTO lbl98
                                            }
                                            catch (oov v15) {
                                                throw a_t.a(v15);
                                            }
                                            v13 = ((z96)var1_1.nra())._am.u7c();
                                        }
                                        catch (oov v16) {
                                            throw a_t.a(v16);
                                        }
                                    }
                                    try {
                                        block59: {
                                            try {
                                                if (!v13) break block59;
                                                this.tjx(false);
                                                if (var3_3 == 0) break block57;
                                            }
                                            catch (oov v17) {
                                                throw a_t.a(v17);
                                            }
                                        }
                                        this.dt5 = true;
                                    }
                                    catch (oov v18) {
                                        throw a_t.a(v18);
                                    }
                                }
                                v5 = var1_1 instanceof nhv;
                            }
                            try {
                                if (var3_3 != 0) break block52;
                                if (v5 == 0) break block53;
                            }
                            catch (oov v19) {
                                throw a_t.a(v19);
                            }
                            this.dt5 = false;
                            for (var4_4 = 0; var4_4 < 64; ++var4_4) {
                                block61: {
                                    try {
                                        try {
                                            v20 = this.plc();
                                            if (var3_3 != 0) break block60;
                                            if (var3_3 != 0) break block61;
                                        }
                                        catch (oov v21) {
                                            throw a_t.a(v21);
                                        }
                                        if (!v20) continue;
                                    }
                                    catch (oov v22) {
                                        throw a_t.a(v22);
                                    }
                                    v23 = true;
                                }
                                return v23;
                            }
                            v20 = false;
                        }
                        return v20;
                    }
                    v5 = super.m1t(var1_1, var2_2);
                }
                var4_5 = v5;
                try {
                    try {
                        try {
                            try {
                                v24 = var1_1.e8m();
                                if (var3_3 != 0) break block62;
                                if (v24 == 0) break block63;
                            }
                            catch (oov v25) {
                                throw a_t.a(v25);
                            }
                            v24 = this.z2d.nextInt(10);
                            if (var3_3 != 0) break block62;
                        }
                        catch (oov v26) {
                            throw a_t.a(v26);
                        }
                        if (v24 == 0) break block63;
                    }
                    catch (oov v27) {
                        throw a_t.a(v27);
                    }
                    this.plc();
                }
                catch (oov v28) {
                    throw a_t.a(v28);
                }
            }
            v24 = var4_5;
        }
        return (boolean)v24;
    }

    public boolean _ah() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = this.oit.miz(18);
                    if (n != 0) break block2;
                    if (bl <= false) break block3;
                }
                catch (oov oov2) {
                    throw a_t.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public void tjx(boolean bl) {
        boolean bl2;
        int n;
        wl1 wl12;
        block2: {
            block3: {
                int n2 = t9d.b();
                try {
                    wl12 = this.oit;
                    n = 18;
                    bl2 = bl;
                    if (n2 == 0) break block2;
                    if (!bl2) break block3;
                }
                catch (oov oov2) {
                    throw a_t.a(oov2);
                }
                bl2 = true;
                break block2;
            }
            bl2 = false;
        }
        wl12.c66(n, (byte)(bl2 ? 1 : 0));
    }

    public static xk5 s6z() {
        return uab;
    }

    public static boolean hm1(a_t a_t2, ha9 ha92) {
        return a_t2.y5t(ha92);
    }

    public static boolean vwt(a_t a_t2, boolean bl) {
        a_t2.dt5 = bl;
        return a_t2.dt5;
    }

    public static Set mek() {
        return nqi;
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

                a_t.c = c.a(-929405094003269918L, 5578958289356791447L, MethodHandles.lookup().lookupClass()).a(241755260457447L);
                var9 = a_t.c ^ 107284018579442L;
                a_t.v = new HashMap<K, V>(13);
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
                var7_3 = new String[12];
                var5_4 = 0;
                var4_5 = "\u00d83\b&\u009c\u001a\t\u00d2J\u00942\u008c!14\to\u00bd8\u001c\u00b8&\u0002\u00ee\u00ae=\u0092A-\u0000\u0092H\u00f2;\u009ex\u00d5\u00e1\u000ep\u0010\u00bcN~Z:@\u0085\u00c1\u000eN\u00b1\u0096\u00f4\u00a5\u00f1\u009c\u0010%7\u00dc\u00de_\u00e6\u0007W\u0090\u0092\u0088\u00f6_\u000b\u00c8) .\u0089\u00eaEh\u00e4\u009d\u00cf\u007f@\u00edO\u00f8\u0001\u00a0*\u00c9C\u00062[;\u00b3!NJ\u00f1^\u001d\u00bb\u00bf}(\u0096[\u00d86\u000e\u00ceP\u001c\u00a1\u00b35j\u00de=9d\b\u00fa\u00f7\u00ec\u00b4W\u001a\u00e0\u00dd6-\u00c0\u00c8\u00ff\u00a8\u00b9\u00b0\u00eb\u00ad\u00e1\u007fOfm0\u00ccM\u00cc<8\u0005\"\u00ed5!\u00a1*k\u008b\u0085)F\u009dP\u0097\u00f4\u0099U\u00b0\u008c\u001es\u00d2e\u0084\u0014t\u00b2\u00b1\u00e0\u009f!\u001b\u0088\u00f0\u0086\u001a\u00db\u0089\u0086#\u007f\u00db(\u008c\u00f5\u00e6\u0086\u009chfv\u0082e\u0088\u00d2\"P\u001a\u00b8\u00e1b\u00ac|M\u0007\u008c\u0004\u00d0\u009d\u00fb\u0006\u00eb\u00fa\u00aa\u00d6\u00aeq\u008b7\u00b8p\u00ca$(>r\u00feT\u00ff*m\u0005\u0019/p\u0010\u0090Le&\u0017\u0006{\u00fak0uggM$\n\u00e4\u00c1d\u0089TSSN\u008eE\u00b9\u00a4 \u0098r\u00f2\u00db/#j\u009du\u0092\u00b1.TV\u0013\u00ae\u001b\u0002\u00ea\u0000\u00fb\u0090}\u008d\u00a0\u00bdoM\u0005\u001b\u008e\u00c5(\u00e4\u00bcFE\u0018nEy\u00efd\u00d8\u0092\u0098c\u00b3\u001aL*\u0095\u0001\u00dc\u0084\u00f5\u00f5zR\u00176\u0098S\u00c3\u00c7\u00e0\u001aDv\u00a4\u0084\u00ec\u00ab";
                var6_6 = "\u00d83\b&\u009c\u001a\t\u00d2J\u00942\u008c!14\to\u00bd8\u001c\u00b8&\u0002\u00ee\u00ae=\u0092A-\u0000\u0092H\u00f2;\u009ex\u00d5\u00e1\u000ep\u0010\u00bcN~Z:@\u0085\u00c1\u000eN\u00b1\u0096\u00f4\u00a5\u00f1\u009c\u0010%7\u00dc\u00de_\u00e6\u0007W\u0090\u0092\u0088\u00f6_\u000b\u00c8) .\u0089\u00eaEh\u00e4\u009d\u00cf\u007f@\u00edO\u00f8\u0001\u00a0*\u00c9C\u00062[;\u00b3!NJ\u00f1^\u001d\u00bb\u00bf}(\u0096[\u00d86\u000e\u00ceP\u001c\u00a1\u00b35j\u00de=9d\b\u00fa\u00f7\u00ec\u00b4W\u001a\u00e0\u00dd6-\u00c0\u00c8\u00ff\u00a8\u00b9\u00b0\u00eb\u00ad\u00e1\u007fOfm0\u00ccM\u00cc<8\u0005\"\u00ed5!\u00a1*k\u008b\u0085)F\u009dP\u0097\u00f4\u0099U\u00b0\u008c\u001es\u00d2e\u0084\u0014t\u00b2\u00b1\u00e0\u009f!\u001b\u0088\u00f0\u0086\u001a\u00db\u0089\u0086#\u007f\u00db(\u008c\u00f5\u00e6\u0086\u009chfv\u0082e\u0088\u00d2\"P\u001a\u00b8\u00e1b\u00ac|M\u0007\u008c\u0004\u00d0\u009d\u00fb\u0006\u00eb\u00fa\u00aa\u00d6\u00aeq\u008b7\u00b8p\u00ca$(>r\u00feT\u00ff*m\u0005\u0019/p\u0010\u0090Le&\u0017\u0006{\u00fak0uggM$\n\u00e4\u00c1d\u0089TSSN\u008eE\u00b9\u00a4 \u0098r\u00f2\u00db/#j\u009du\u0092\u00b1.TV\u0013\u00ae\u001b\u0002\u00ea\u0000\u00fb\u0090}\u008d\u00a0\u00bdoM\u0005\u001b\u008e\u00c5(\u00e4\u00bcFE\u0018nEy\u00efd\u00d8\u0092\u0098c\u00b3\u001aL*\u0095\u0001\u00dc\u0084\u00f5\u00f5zR\u00176\u0098S\u00c3\u00c7\u00e0\u001aDv\u00a4\u0084\u00ec\u00ab".length();
                var3_7 = 40;
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
                    var7_3[var5_4++] = a_t.f(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u0013\u00a6\u001c\u0017\u00b0\u00de-\u00d56\u00ad\u00dd\u00d2WF\u00d3\u0014\u00bf0\u0011\u008aS\u00d3\u0005x-zm\n\r\u00f6\u009b^C\u0091*\u00fa\u00c4e\u00ae6Hs_X\u00f0e\u00eb\u00b7\u00c8 m,K&\u00b9a\u0019S\u00f2\u00bb\u008c\u00ea\u00fe\u009eGta\u001d\u00f1k\u00d2\u001d\u00f5R\nx\u00009\u00a2\u0016\f\u00a5\u00d4\u0018.\u00d0\u007f\u00d4-O \u009c\u00b8\u00c8P\u0090\u0093\u00ad\u00ebDX\u0099\u0011\u009a\u00d3urR\u0083\u00cbf\u00ab\u0086";
                    var6_6 = "\u0013\u00a6\u001c\u0017\u00b0\u00de-\u00d56\u00ad\u00dd\u00d2WF\u00d3\u0014\u00bf0\u0011\u008aS\u00d3\u0005x-zm\n\r\u00f6\u009b^C\u0091*\u00fa\u00c4e\u00ae6Hs_X\u00f0e\u00eb\u00b7\u00c8 m,K&\u00b9a\u0019S\u00f2\u00bb\u008c\u00ea\u00fe\u009eGta\u001d\u00f1k\u00d2\u001d\u00f5R\nx\u00009\u00a2\u0016\f\u00a5\u00d4\u0018.\u00d0\u007f\u00d4-O \u009c\u00b8\u00c8P\u0090\u0093\u00ad\u00ebDX\u0099\u0011\u009a\u00d3urR\u0083\u00cbf\u00ab\u0086".length();
                    var3_7 = 40;
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
                    var7_3[var5_4++] = a_t.f(var8_9).intern();
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
        a_t.g = var7_3;
        a_t.u = new String[12];
        a_t.ud4 = UUID.fromString((String)a_t.e("x", (int)16694, (long)(3738081958135158194L ^ var9)));
        a_t.uab = new xk5(a_t.ud4, (String)a_t.e("x", (int)23295, (long)(1347685601549602416L ^ var9)), 0.15000000596046448, 0).d2_(false);
        a_t.nqi = Sets.newIdentityHashSet();
        a_t.nqi.add(ox_.l11);
        a_t.nqi.add(ox_.kqk);
        a_t.nqi.add(ox_.vd0);
        a_t.nqi.add(ox_.bqn);
        a_t.nqi.add(ox_.qmk);
        a_t.nqi.add(ox_.xq2);
        a_t.nqi.add(ox_.zml);
        a_t.nqi.add(ox_.ae9);
        a_t.nqi.add(ox_.od1);
        a_t.nqi.add(ox_.hio);
        a_t.nqi.add(ox_.rs4);
        a_t.nqi.add(ox_.jzx);
        a_t.nqi.add(ox_.gdb);
        a_t.nqi.add(ox_.pl8);
    }

    private static oov a(oov oov2) {
        return oov2;
    }

    private static String f(byte[] byArray) {
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

    private static String e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2FDE;
        if (u[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])v.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    v.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("a_t", exception);
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
            a_t.u[n2] = a_t.f(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return u[n2];
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = a_t.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("a_t" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(a_t.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

