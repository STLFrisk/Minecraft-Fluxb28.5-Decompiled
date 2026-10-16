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
import net.minecraft.network.play.server.S2BPacketChangeGameState;

public class c9p
extends s0i {
    private float ynm;
    private float n38;
    private float thk;
    private float hrr;
    private float ot1;
    private g_3 z2n;
    private int m0z;
    private boolean p2n;
    private _tb wjn;
    private static final long c;
    private static final String[] g;
    private static final String[] u;
    private static final Map v;

    public c9p(t9d t9d2) {
        super(t9d2);
        this.dlk = 10;
        this.yxc(0.85f, 0.85f);
        this.r1d.tn8(4, new c9p$kdw(this));
        rap rap2 = new rap(this, 1.0);
        this.r1d.tn8(5, rap2);
        this.wjn = new _tb(this, 1.0, 80);
        this.r1d.tn8(7, this.wjn);
        this.r1d.tn8(8, new bdq(this, ha9.class, 8.0f));
        this.r1d.tn8(8, new bdq(this, c9p.class, 12.0f, 0.01f));
        this.r1d.tn8(9, new ov6(this));
        this.wjn.k23(3);
        rap2.k23(3);
        this.g9o.tn8(1, new s24(this, g_3.class, 10, true, false, new c9p$rw9(this)));
        this.i1n = new c9p$tyn(this);
        this.n38 = this.ynm = this.z2d.nextFloat();
    }

    @Override
    public void nyy() {
        super.nyy();
        this.dgt(m6d.y3f).zf7(6.0);
        this.dgt(m6d.w7i).zf7(0.5);
        this.dgt(m6d.wg4).zf7(16.0);
        this.dgt(m6d.t9k).zf7(30.0);
    }

    @Override
    public void cjb(bdo bdo2) {
        long l = c ^ 0x14FCCAD43CC0L;
        super.cjb(bdo2);
        this.pfo(bdo2.dvl((String)((Object)c9p.e("f", (int)17682, (long)(0x7EE0F5A3CCBB3232L ^ l)))));
    }

    @Override
    public void srs(bdo bdo2) {
        long l = c ^ 0x62528F8B506BL;
        super.srs(bdo2);
        bdo2.zyu((String)((Object)c9p.e("f", (int)22838, (long)(0x7FE4A9A044B8C2BEL ^ l))), this.mzk());
    }

    @Override
    public p8a ri_(t9d t9d2) {
        return new hz4(this, t9d2);
    }

    @Override
    public void tbj() {
        super.tbj();
        this.oit.kp2(16, 0);
        this.oit.kp2(17, 0);
    }

    private boolean a4o(int n) {
        boolean bl;
        block2: {
            block3: {
                int n2 = t9d.b();
                try {
                    bl = this.oit.zwc(16) & n;
                    if (n2 == 0) break block2;
                    if (!bl) break block3;
                }
                catch (oov oov2) {
                    throw c9p.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private void bmx(int var1_1, boolean var2_2) {
        block9: {
            block8: {
                var3_3 = t9d.b();
                var4_4 = this.oit.zwc(16);
                try {
                    try {
                        if (var3_3 == 0) break block8;
                        if (var2_2) {
                        }
                        ** GOTO lbl18
                    }
                    catch (oov v0) {
                        throw c9p.a(v0);
                    }
                    this.oit.c66(16, var4_4 | var1_1);
                }
                catch (oov v1) {
                    throw c9p.a(v1);
                }
            }
            try {
                if (var3_3 != 0) break block9;
lbl18:
                // 2 sources

                this.oit.c66(16, var4_4 & ~var1_1);
            }
            catch (oov v2) {
                throw c9p.a(v2);
            }
        }
    }

    public boolean m04() {
        return this.a4o(2);
    }

    private void er9(boolean bl) {
        this.bmx(2, bl);
    }

    public int y3s() {
        int n;
        block2: {
            block3: {
                int n2 = t9d.c();
                try {
                    n = this.mzk();
                    if (n2 != 0) break block2;
                    if (n == 0) break block3;
                }
                catch (oov oov2) {
                    throw c9p.a(oov2);
                }
                n = 60;
                break block2;
            }
            n = 80;
        }
        return n;
    }

    public boolean mzk() {
        return this.a4o(4);
    }

    public void pfo(boolean bl) {
        block5: {
            block4: {
                int n = t9d.b();
                try {
                    try {
                        this.bmx(4, bl);
                        if (n == 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw c9p.a(oov2);
                    }
                    this.yxc(1.9975f, 1.9975f);
                    this.dgt(m6d.w7i).zf7(0.3f);
                    this.dgt(m6d.y3f).zf7(8.0);
                    this.dgt(m6d.t9k).zf7(80.0);
                    this._92();
                }
                catch (oov oov3) {
                    throw c9p.a(oov3);
                }
            }
            this.wjn.kj8(400);
        }
    }

    public void bkk() {
        this.pfo(true);
        this.hrr = 1.0f;
        this.ot1 = 1.0f;
    }

    private void kkf(int n) {
        this.oit.c66(17, n);
    }

    public boolean _sb() {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.c();
                try {
                    bl = this.oit.zwc(17);
                    if (n != 0) break block2;
                    if (!bl) break block3;
                }
                catch (oov oov2) {
                    throw c9p.a(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public g_3 e6m() {
        g_3 g_32;
        block18: {
            block19: {
                block23: {
                    block22: {
                        i2h i2h2;
                        int n;
                        block20: {
                            block21: {
                                boolean bl;
                                block16: {
                                    block17: {
                                        n = t9d.c();
                                        try {
                                            try {
                                                bl = this._sb();
                                                if (n != 0) break block16;
                                                if (bl) break block17;
                                            }
                                            catch (oov oov2) {
                                                throw c9p.a(oov2);
                                            }
                                            return null;
                                        }
                                        catch (oov oov3) {
                                            throw c9p.a(oov3);
                                        }
                                    }
                                    try {
                                        g_32 = this;
                                        if (n != 0) break block18;
                                        bl = g_32.oay.v0f;
                                    }
                                    catch (oov oov4) {
                                        throw c9p.a(oov4);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            if (!bl) break block19;
                                            i2h2 = this.z2n;
                                            if (n != 0) break block20;
                                        }
                                        catch (oov oov5) {
                                            throw c9p.a(oov5);
                                        }
                                        if (i2h2 == null) break block21;
                                    }
                                    catch (oov oov6) {
                                        throw c9p.a(oov6);
                                    }
                                    return this.z2n;
                                }
                                catch (oov oov7) {
                                    throw c9p.a(oov7);
                                }
                            }
                            i2h2 = this.oay.oks(this.oit.zwc(17));
                        }
                        g_3 g_33 = i2h2;
                        try {
                            try {
                                if (n != 0) break block22;
                                if (!(g_33 instanceof g_3)) break block23;
                            }
                            catch (oov oov8) {
                                throw c9p.a(oov8);
                            }
                            this.z2n = g_33;
                        }
                        catch (oov oov9) {
                            throw c9p.a(oov9);
                        }
                    }
                    return this.z2n;
                }
                return null;
            }
            g_32 = this.q4v();
        }
        return g_32;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void jcg(int var1_1) {
        block18: {
            block16: {
                block19: {
                    block17: {
                        var2_2 = t9d.c();
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            super.jcg(var1_1);
                                            v0 = var1_1;
                                            v1 = 16;
                                            if (var2_2 != 0) break block16;
                                            if (v0 == v1) {
                                            }
                                            ** GOTO lbl44
                                        }
                                        catch (oov v2) {
                                            throw c9p.a(v2);
                                        }
                                        v3 = this.mzk();
                                        if (var2_2 != 0) break block17;
                                    }
                                    catch (oov v4) {
                                        throw c9p.a(v4);
                                    }
                                    if (v3 == 0) break block18;
                                }
                                catch (oov v5) {
                                    throw c9p.a(v5);
                                }
                                v6 = this;
                                if (var2_2 != 0) break block19;
                            }
                            catch (oov v7) {
                                throw c9p.a(v7);
                            }
                            cfr_temp_0 = v6.uo6 - 1.0f;
                            v3 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                        }
                        catch (oov v8) {
                            throw c9p.a(v8);
                        }
                    }
                    if (v3 >= 0) break block18;
                    v6 = this;
                }
                try {
                    v6.yxc(1.9975f, 1.9975f);
                    if (var2_2 == 0) break block18;
lbl44:
                    // 2 sources

                    v0 = var1_1;
                    v1 = 17;
                }
                catch (oov v9) {
                    throw c9p.a(v9);
                }
            }
            try {
                if (v0 == v1) {
                    this.m0z = 0;
                    this.z2n = null;
                }
            }
            catch (oov v10) {
                throw c9p.a(v10);
            }
        }
    }

    @Override
    public int u8h() {
        return 160;
    }

    @Override
    public String _n1() {
        CallSite callSite;
        block8: {
            long l;
            block9: {
                boolean bl;
                block6: {
                    block7: {
                        l = c ^ 0x636CD9FC6A1DL;
                        int n = t9d.c();
                        try {
                            try {
                                bl = this.mwv();
                                if (n != 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw c9p.a(oov2);
                            }
                            callSite = c9p.e("f", (int)6893, (long)(0x1B66F206D6C93B16L ^ l));
                            break block8;
                        }
                        catch (oov oov3) {
                            throw c9p.a(oov3);
                        }
                    }
                    bl = this.mzk();
                }
                try {
                    if (!bl) break block9;
                    callSite = c9p.e("f", (int)22307, (long)(0x6D3D90B4326376D4L ^ l));
                    break block8;
                }
                catch (oov oov4) {
                    throw c9p.a(oov4);
                }
            }
            callSite = c9p.e("f", (int)1955, (long)(0x18502EB23424A65FL ^ l));
        }
        return callSite;
    }

    @Override
    public String wcg() {
        CallSite callSite;
        block8: {
            long l;
            block9: {
                boolean bl;
                block6: {
                    block7: {
                        l = c ^ 0x79CD93B56565L;
                        int n = t9d.b();
                        try {
                            try {
                                bl = this.mwv();
                                if (n == 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw c9p.a(oov2);
                            }
                            callSite = c9p.e("f", (int)28420, (long)(0x78993457544E4186L ^ l));
                            break block8;
                        }
                        catch (oov oov3) {
                            throw c9p.a(oov3);
                        }
                    }
                    bl = this.mzk();
                }
                try {
                    if (!bl) break block9;
                    callSite = c9p.e("f", (int)28732, (long)(0x401A1F6FC8B3DEBCL ^ l));
                    break block8;
                }
                catch (oov oov4) {
                    throw c9p.a(oov4);
                }
            }
            callSite = c9p.e("f", (int)3531, (long)(0x387D5ECD0CD5A346L ^ l));
        }
        return callSite;
    }

    @Override
    public String ix6() {
        CallSite callSite;
        block8: {
            long l;
            block9: {
                boolean bl;
                block6: {
                    block7: {
                        l = c ^ 0x46BB54C4D32BL;
                        int n = t9d.b();
                        try {
                            try {
                                bl = this.mwv();
                                if (n == 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw c9p.a(oov2);
                            }
                            callSite = c9p.e("f", (int)15969, (long)(0x45DC9D2212AD26A3L ^ l));
                            break block8;
                        }
                        catch (oov oov3) {
                            throw c9p.a(oov3);
                        }
                    }
                    bl = this.mzk();
                }
                try {
                    if (!bl) break block9;
                    callSite = c9p.e("f", (int)16401, (long)(0x326DADC4AF42D8D8L ^ l));
                    break block8;
                }
                catch (oov oov4) {
                    throw c9p.a(oov4);
                }
            }
            callSite = c9p.e("f", (int)30620, (long)(0x7229CC5D1BD86F53L ^ l));
        }
        return callSite;
    }

    @Override
    public boolean _p9() {
        return false;
    }

    @Override
    public float c5y() {
        return this.ikl * 0.5f;
    }

    @Override
    public float ncy(mew mew2) {
        float f;
        block6: {
            c9p c9p2;
            block4: {
                block5: {
                    int n = t9d.b();
                    try {
                        try {
                            c9p2 = this;
                            if (n == 0) break block4;
                            if (c9p2.oay.getBlockState(mew2).r_y().p1r() != p3y.six) break block5;
                        }
                        catch (oov oov2) {
                            throw c9p.a(oov2);
                        }
                        f = 10.0f + this.oay.rgh(mew2) - 0.5f;
                        break block6;
                    }
                    catch (oov oov3) {
                        throw c9p.a(oov3);
                    }
                }
                c9p2 = this;
            }
            f = super.ncy(mew2);
        }
        return f;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void e_a() {
        block118: {
            block117: {
                block116: {
                    block115: {
                        block114: {
                            block92: {
                                block113: {
                                    block93: {
                                        block111: {
                                            block112: {
                                                block109: {
                                                    block110: {
                                                        block106: {
                                                            block107: {
                                                                block104: {
                                                                    block100: {
                                                                        block101: {
                                                                            block102: {
                                                                                block94: {
                                                                                    block99: {
                                                                                        block98: {
                                                                                            block97: {
                                                                                                block95: {
                                                                                                    block96: {
                                                                                                        var1_1 = c9p.c ^ 14775275277554L;
                                                                                                        var3_2 = t9d.c();
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
                                                                                                                                                v0 = this.oay.v0f;
                                                                                                                                                if (var3_2 != 0) break block92;
                                                                                                                                                if (!v0) break block93;
                                                                                                                                            }
                                                                                                                                            catch (oov v1) {
                                                                                                                                                throw c9p.a(v1);
                                                                                                                                            }
                                                                                                                                            this.n38 = this.ynm;
                                                                                                                                            v2 = this.mwv();
                                                                                                                                            if (var3_2 != 0) break block94;
                                                                                                                                        }
                                                                                                                                        catch (oov v3) {
                                                                                                                                            throw c9p.a(v3);
                                                                                                                                        }
                                                                                                                                        if (!v2) {
                                                                                                                                        }
                                                                                                                                        ** GOTO lbl94
                                                                                                                                    }
                                                                                                                                    catch (oov v4) {
                                                                                                                                        throw c9p.a(v4);
                                                                                                                                    }
                                                                                                                                    this.thk = 2.0f;
                                                                                                                                    v5 = this;
                                                                                                                                    if (var3_2 != 0) break block95;
                                                                                                                                }
                                                                                                                                catch (oov v6) {
                                                                                                                                    throw c9p.a(v6);
                                                                                                                                }
                                                                                                                                if (!(v5.mop > 0.0)) break block96;
                                                                                                                            }
                                                                                                                            catch (oov v7) {
                                                                                                                                throw c9p.a(v7);
                                                                                                                            }
                                                                                                                            v5 = this;
                                                                                                                            if (var3_2 != 0) break block95;
                                                                                                                        }
                                                                                                                        catch (oov v8) {
                                                                                                                            throw c9p.a(v8);
                                                                                                                        }
                                                                                                                        if (!v5.p2n) break block96;
                                                                                                                    }
                                                                                                                    catch (oov v9) {
                                                                                                                        throw c9p.a(v9);
                                                                                                                    }
                                                                                                                    v5 = this;
                                                                                                                    if (var3_2 != 0) break block95;
                                                                                                                }
                                                                                                                catch (oov v10) {
                                                                                                                    throw c9p.a(v10);
                                                                                                                }
                                                                                                                if (v5.o3x()) break block96;
                                                                                                            }
                                                                                                            catch (oov v11) {
                                                                                                                throw c9p.a(v11);
                                                                                                            }
                                                                                                            this.oay.wd_(this.o2v, this.kfp, this.vbd, (String)c9p.e("f", (int)22415, (long)(2402434646085226646L ^ var1_1)), 1.0f, 1.0f, false);
                                                                                                        }
                                                                                                        catch (oov v12) {
                                                                                                            throw c9p.a(v12);
                                                                                                        }
                                                                                                    }
                                                                                                    v5 = this;
                                                                                                }
                                                                                                try {
                                                                                                    try {
                                                                                                        cfr_temp_0 = this.mop - 0.0;
                                                                                                        v13 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                                                                        if (var3_2 != 0) break block97;
                                                                                                        if (v13 >= 0) break block98;
                                                                                                    }
                                                                                                    catch (oov v14) {
                                                                                                        throw c9p.a(v14);
                                                                                                    }
                                                                                                    v13 = (double)this.oay.h9u(new mew(this).eve(), false);
                                                                                                }
                                                                                                catch (oov v15) {
                                                                                                    throw c9p.a(v15);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (var3_2 != 0) break block99;
                                                                                                if (v13 == false) break block98;
                                                                                            }
                                                                                            catch (oov v16) {
                                                                                                throw c9p.a(v16);
                                                                                            }
                                                                                            v13 = (double)true;
                                                                                            break block99;
                                                                                        }
                                                                                        v13 = (double)false;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            v5.p2n = v13;
                                                                                            if (var3_2 == 0) break block100;
lbl94:
                                                                                            // 2 sources

                                                                                            v17 = this;
                                                                                            if (var3_2 != 0) break block101;
                                                                                        }
                                                                                        catch (oov v18) {
                                                                                            throw c9p.a(v18);
                                                                                        }
                                                                                        v2 = v17.m04();
                                                                                    }
                                                                                    catch (oov v19) {
                                                                                        throw c9p.a(v19);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    block103: {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    if (v2) {
                                                                                                        v20 = this;
                                                                                                        if (var3_2 != 0) break block102;
                                                                                                    }
                                                                                                    ** GOTO lbl135
                                                                                                }
                                                                                                catch (oov v21) {
                                                                                                    throw c9p.a(v21);
                                                                                                }
                                                                                                if (!(v20.thk < 0.5f)) break block103;
                                                                                            }
                                                                                            catch (oov v22) {
                                                                                                throw c9p.a(v22);
                                                                                            }
                                                                                            this.thk = 4.0f;
                                                                                            if (var3_2 == 0) break block100;
                                                                                        }
                                                                                        catch (oov v23) {
                                                                                            throw c9p.a(v23);
                                                                                        }
                                                                                    }
                                                                                    v20 = this;
                                                                                }
                                                                                catch (oov v24) {
                                                                                    throw c9p.a(v24);
                                                                                }
                                                                            }
                                                                            try {
                                                                                v20.thk += (0.5f - this.thk) * 0.1f;
                                                                                if (var3_2 == 0) break block100;
lbl135:
                                                                                // 2 sources

                                                                                v17 = this;
                                                                            }
                                                                            catch (oov v25) {
                                                                                throw c9p.a(v25);
                                                                            }
                                                                        }
                                                                        v17.thk += (0.125f - this.thk) * 0.2f;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            block105: {
                                                                                try {
                                                                                    try {
                                                                                        this.ynm += this.thk;
                                                                                        this.ot1 = this.hrr;
                                                                                        v26 = this.mwv();
                                                                                        if (var3_2 != 0) break block104;
                                                                                        if (v26) break block105;
                                                                                    }
                                                                                    catch (oov v27) {
                                                                                        throw c9p.a(v27);
                                                                                    }
                                                                                    this.hrr = this.z2d.nextFloat();
                                                                                    if (var3_2 == 0) break block106;
                                                                                }
                                                                                catch (oov v28) {
                                                                                    throw c9p.a(v28);
                                                                                }
                                                                            }
                                                                            v29 = this;
                                                                            if (var3_2 != 0) break block107;
                                                                        }
                                                                        catch (oov v30) {
                                                                            throw c9p.a(v30);
                                                                        }
                                                                        v26 = v29.m04();
                                                                    }
                                                                    catch (oov v31) {
                                                                        throw c9p.a(v31);
                                                                    }
                                                                }
                                                                try {
                                                                    block108: {
                                                                        try {
                                                                            if (!v26) break block108;
                                                                            this.hrr += (0.0f - this.hrr) * 0.25f;
                                                                            if (var3_2 == 0) break block106;
                                                                        }
                                                                        catch (oov v32) {
                                                                            throw c9p.a(v32);
                                                                        }
                                                                    }
                                                                    v29 = this;
                                                                }
                                                                catch (oov v33) {
                                                                    throw c9p.a(v33);
                                                                }
                                                            }
                                                            v29.hrr += (1.0f - this.hrr) * 0.06f;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    v0 = this.m04();
                                                                    if (var3_2 != 0) break block109;
                                                                    if (!v0) break block110;
                                                                }
                                                                catch (oov v34) {
                                                                    throw c9p.a(v34);
                                                                }
                                                                v0 = this.mwv();
                                                                if (var3_2 != 0) break block109;
                                                            }
                                                            catch (oov v35) {
                                                                throw c9p.a(v35);
                                                            }
                                                            if (!v0) break block110;
                                                        }
                                                        catch (oov v36) {
                                                            throw c9p.a(v36);
                                                        }
                                                        var4_3 = this.wej(0.0f);
                                                        for (var5_4 = 0; var5_4 < 2; ++var5_4) {
                                                            try {
                                                                this.oay.zvy(w_0.w_h, this.o2v + (this.z2d.nextDouble() - 0.5) * (double)this.uo6 - var4_3.lvi * 1.5, this.kfp + this.z2d.nextDouble() * (double)this.ikl - var4_3.gn5 * 1.5, this.vbd + (this.z2d.nextDouble() - 0.5) * (double)this.uo6 - var4_3.bn2 * 1.5, 0.0, 0.0, 0.0, new int[0]);
                                                                if (var3_2 == 0) {
                                                                    if (var3_2 == 0) continue;
                                                                    break;
                                                                }
                                                                break block93;
                                                            }
                                                            catch (oov v37) {
                                                                throw c9p.a(v37);
                                                            }
                                                        }
                                                    }
                                                    v0 = this._sb();
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var3_2 != 0) break block92;
                                                                if (!v0) break block93;
                                                            }
                                                            catch (oov v38) {
                                                                throw c9p.a(v38);
                                                            }
                                                            v39 /* !! */  = this;
                                                            if (var3_2 != 0) break block111;
                                                        }
                                                        catch (oov v40) {
                                                            throw c9p.a(v40);
                                                        }
                                                        if (v39 /* !! */ .m0z >= this.y3s()) break block112;
                                                    }
                                                    catch (oov v41) {
                                                        throw c9p.a(v41);
                                                    }
                                                    ++this.m0z;
                                                }
                                                catch (oov v42) {
                                                    throw c9p.a(v42);
                                                }
                                            }
                                            try {
                                                v43 = this;
                                                if (var3_2 != 0) break block113;
                                                v39 /* !! */  = v43.e6m();
                                            }
                                            catch (oov v44) {
                                                throw c9p.a(v44);
                                            }
                                        }
                                        if ((var4_3 = v39 /* !! */ ) != null) {
                                            this.ph8().rz3((i2h)var4_3, 90.0f, 90.0f);
                                            this.ph8()._9j();
                                            var5_5 = this.z3d(0.0f);
                                            var7_6 = var4_3.o2v - this.o2v;
                                            var9_7 = var4_3.kfp + (double)(var4_3.ikl * 0.5f) - (this.kfp + (double)this.c5y());
                                            var11_8 = var4_3.vbd - this.vbd;
                                            var13_9 = Math.sqrt(var7_6 * var7_6 + var9_7 * var9_7 + var11_8 * var11_8);
                                            var7_6 /= var13_9;
                                            var9_7 /= var13_9;
                                            var11_8 /= var13_9;
                                            for (var15_10 = this.z2d.nextDouble(); var15_10 < var13_9; var15_10 += 1.8 - var5_5 + this.z2d.nextDouble() * (1.7 - var5_5)) {
                                                try {
                                                    this.oay.zvy(w_0.w_h, this.o2v + var7_6 * var15_10, this.kfp + var9_7 * var15_10 + (double)this.c5y(), this.vbd + var11_8 * var15_10, 0.0, 0.0, 0.0, new int[0]);
                                                    if (var3_2 == 0) {
                                                        if (var3_2 == 0) continue;
                                                        break;
                                                    }
                                                    break block114;
                                                }
                                                catch (oov v45) {
                                                    throw c9p.a(v45);
                                                }
                                            }
                                        }
                                    }
                                    v43 = this;
                                }
                                v0 = v43.x7a;
                            }
                            try {
                                try {
                                    if (var3_2 != 0) break block115;
                                    if (!v0) break block114;
                                }
                                catch (oov v46) {
                                    throw c9p.a(v46);
                                }
                                this.yoc(300);
                                if (var3_2 == 0) break block116;
                            }
                            catch (oov v47) {
                                throw c9p.a(v47);
                            }
                        }
                        v0 = this.lfk;
                    }
                    try {
                        try {
                            if (var3_2 != 0) break block117;
                            if (!v0) break block116;
                        }
                        catch (oov v48) {
                            throw c9p.a(v48);
                        }
                        this.mop += 0.5;
                        this.icv += (double)((this.z2d.nextFloat() * 2.0f - 1.0f) * 0.4f);
                        this.bw4 += (double)((this.z2d.nextFloat() * 2.0f - 1.0f) * 0.4f);
                        this.x5k = this.z2d.nextFloat() * 360.0f;
                        this.lfk = false;
                        this.u19 = true;
                    }
                    catch (oov v49) {
                        throw c9p.a(v49);
                    }
                }
                try {
                    v50 = this;
                    if (var3_2 != 0) break block118;
                    v0 = v50._sb();
                }
                catch (oov v51) {
                    throw c9p.a(v51);
                }
            }
            try {
                if (v0) {
                    this.x5k = this.q6c;
                }
            }
            catch (oov v52) {
                throw c9p.a(v52);
            }
            v50 = this;
        }
        super.e_a();
    }

    public float si5(float f) {
        return this.n38 + (this.ynm - this.n38) * f;
    }

    public float sah(float f) {
        return this.ot1 + (this.hrr - this.ot1) * f;
    }

    public float z3d(float f) {
        return ((float)this.m0z + f) / (float)this.y3s();
    }

    @Override
    public void qar() {
        block24: {
            c9p c9p2;
            block30: {
                int n;
                block25: {
                    int n2;
                    block26: {
                        int n3;
                        block23: {
                            n2 = t9d.b();
                            try {
                                super.qar();
                                n3 = this.mzk();
                                if (n2 == 0) break block23;
                                if (n3 == 0) break block24;
                            }
                            catch (oov oov2) {
                                throw c9p.a(oov2);
                            }
                            n3 = 1200;
                        }
                        int n4 = n3;
                        int n5 = 1200;
                        int n6 = 6000;
                        int n7 = 2;
                        try {
                            n = (this.g25 + this.jwu()) % 1200;
                            if (n2 == 0) break block25;
                            if (n != 0) break block26;
                        }
                        catch (oov oov3) {
                            throw c9p.a(oov3);
                        }
                        mcs mcs2 = mcs._es;
                        for (z96 z962 : this.oay.nnw(z96.class, new c9p$1(this))) {
                            block29: {
                                z96 z963;
                                block27: {
                                    try {
                                        block28: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    z963 = z962;
                                                                    if (n2 == 0) break block27;
                                                                    n = z963.cab(mcs2) ? 1 : 0;
                                                                    if (n2 == 0) break block25;
                                                                }
                                                                catch (oov oov4) {
                                                                    throw c9p.a(oov4);
                                                                }
                                                                if (n == 0) break block28;
                                                            }
                                                            catch (oov oov5) {
                                                                throw c9p.a(oov5);
                                                            }
                                                            z963 = z962;
                                                            if (n2 == 0) break block27;
                                                        }
                                                        catch (oov oov6) {
                                                            throw c9p.a(oov6);
                                                        }
                                                        if (z963.dhd(mcs2).tus() < 2) break block28;
                                                    }
                                                    catch (oov oov7) {
                                                        throw c9p.a(oov7);
                                                    }
                                                    z963 = z962;
                                                    if (n2 == 0) break block27;
                                                }
                                                catch (oov oov8) {
                                                    throw c9p.a(oov8);
                                                }
                                                if (z963.dhd(mcs2).ltp() >= 1200) break block29;
                                            }
                                            catch (oov oov9) {
                                                throw c9p.a(oov9);
                                            }
                                        }
                                        z962.rhh.vnf(new S2BPacketChangeGameState(10, 0.0f));
                                        z963 = z962;
                                    }
                                    catch (oov oov10) {
                                        throw c9p.a(oov10);
                                    }
                                }
                                z963.gmn(new sdj(mcs2.zr9, 6000, 2));
                            }
                            if (n2 != 0) continue;
                        }
                    }
                    try {
                        c9p2 = this;
                        if (n2 == 0) break block30;
                        n = c9p2.qg5() ? 1 : 0;
                    }
                    catch (oov oov11) {
                        throw c9p.a(oov11);
                    }
                }
                if (n != 0) break block24;
                c9p2 = this;
            }
            c9p2.muf(new mew(this), 16);
        }
    }

    @Override
    public void ir3(boolean bl, int n) {
        block32: {
            c9p c9p2;
            block33: {
                int n2;
                block31: {
                    int n3;
                    block30: {
                        block29: {
                            int n4;
                            block27: {
                                block25: {
                                    block26: {
                                        n3 = t9d.b();
                                        int n5 = this.z2d.nextInt(3) + this.z2d.nextInt(n + 1);
                                        try {
                                            try {
                                                n2 = n5;
                                                if (n3 == 0) break block25;
                                                if (n2 <= 0) break block26;
                                            }
                                            catch (oov oov2) {
                                                throw c9p.a(oov2);
                                            }
                                            this.qji(new erg(xbr.n46, n5, 0), 1.0f);
                                        }
                                        catch (oov oov3) {
                                            throw c9p.a(oov3);
                                        }
                                    }
                                    n2 = this.z2d.nextInt(3 + n);
                                }
                                try {
                                    try {
                                        block28: {
                                            try {
                                                try {
                                                    n4 = 1;
                                                    if (n3 == 0) break block27;
                                                    if (n2 <= n4) break block28;
                                                }
                                                catch (oov oov4) {
                                                    throw c9p.a(oov4);
                                                }
                                                this.qji(new erg(xbr.h_h, 1, po4$i4c.umn.iho()), 1.0f);
                                                if (n3 != 0) break block29;
                                            }
                                            catch (oov oov5) {
                                                throw c9p.a(oov5);
                                            }
                                        }
                                        n2 = this.z2d.nextInt(3 + n);
                                        if (n3 == 0) break block30;
                                    }
                                    catch (oov oov6) {
                                        throw c9p.a(oov6);
                                    }
                                    n4 = 1;
                                }
                                catch (oov oov7) {
                                    throw c9p.a(oov7);
                                }
                            }
                            try {
                                if (n2 > n4) {
                                    this.qji(new erg(xbr.fi0, 1, 0), 1.0f);
                                }
                            }
                            catch (oov oov8) {
                                throw c9p.a(oov8);
                            }
                        }
                        n2 = bl ? 1 : 0;
                    }
                    try {
                        try {
                            try {
                                if (n3 == 0) break block31;
                                if (n2 == 0) break block32;
                            }
                            catch (oov oov9) {
                                throw c9p.a(oov9);
                            }
                            c9p2 = this;
                            if (n3 == 0) break block33;
                        }
                        catch (oov oov10) {
                            throw c9p.a(oov10);
                        }
                        n2 = c9p2.mzk() ? 1 : 0;
                    }
                    catch (oov oov11) {
                        throw c9p.a(oov11);
                    }
                }
                if (n2 == 0) break block32;
                c9p2 = this;
            }
            c9p2.qji(new erg(ox_.u7i, 1, 1), 1.0f);
        }
    }

    @Override
    public void z3m() {
        erg erg2 = ((_4n)zfj.h82(this.z2d, sj_.bw8())).et4(this.z2d);
        this.qji(erg2, 1.0f);
    }

    @Override
    public boolean vef() {
        return true;
    }

    @Override
    public boolean m63() {
        boolean bl;
        block8: {
            block7: {
                int n;
                block6: {
                    n = t9d.c();
                    try {
                        try {
                            bl = this.oay.g17(this.aaw(), this);
                            if (n != 0) break block6;
                            if (!bl) break block7;
                        }
                        catch (oov oov2) {
                            throw c9p.a(oov2);
                        }
                        bl = this.oay.bb4(this, this.aaw()).isEmpty();
                    }
                    catch (oov oov3) {
                        throw c9p.a(oov3);
                    }
                }
                try {
                    if (n != 0) break block8;
                    if (!bl) break block7;
                }
                catch (oov oov4) {
                    throw c9p.a(oov4);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public boolean iaw() {
        boolean bl;
        block13: {
            block12: {
                int n;
                block10: {
                    n = t9d.b();
                    try {
                        block11: {
                            try {
                                try {
                                    try {
                                        bl = this.z2d.nextInt(20);
                                        if (n == 0) break block10;
                                        if (!bl) break block11;
                                    }
                                    catch (oov oov2) {
                                        throw c9p.a(oov2);
                                    }
                                    bl = this.oay.m8_(new mew(this));
                                    if (n == 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw c9p.a(oov3);
                                }
                                if (bl) break block12;
                            }
                            catch (oov oov4) {
                                throw c9p.a(oov4);
                            }
                        }
                        bl = super.iaw();
                    }
                    catch (oov oov5) {
                        throw c9p.a(oov5);
                    }
                }
                try {
                    if (n == 0) break block13;
                    if (!bl) break block12;
                }
                catch (oov oov6) {
                    throw c9p.a(oov6);
                }
                bl = true;
                break block13;
            }
            bl = false;
        }
        return bl;
    }

    @Override
    public boolean m1t(ofh ofh2, float f) {
        boolean bl;
        block14: {
            block15: {
                long l = c ^ 0x3179CE1C377BL;
                int n = t9d.b();
                try {
                    try {
                        try {
                            try {
                                try {
                                    bl = this.m04();
                                    if (n == 0) break block14;
                                    if (bl) break block15;
                                }
                                catch (oov oov2) {
                                    throw c9p.a(oov2);
                                }
                                bl = ofh2.vmw();
                                if (n == 0) break block14;
                            }
                            catch (oov oov3) {
                                throw c9p.a(oov3);
                            }
                            if (bl) break block15;
                        }
                        catch (oov oov4) {
                            throw c9p.a(oov4);
                        }
                        bl = ofh2.f8d() instanceof g_3;
                        if (n == 0) break block14;
                    }
                    catch (oov oov5) {
                        throw c9p.a(oov5);
                    }
                    if (!bl) break block15;
                }
                catch (oov oov6) {
                    throw c9p.a(oov6);
                }
                g_3 g_32 = (g_3)ofh2.f8d();
                try {
                    try {
                        bl = ofh2.yto();
                        if (n == 0) break block14;
                        if (bl) break block15;
                    }
                    catch (oov oov7) {
                        throw c9p.a(oov7);
                    }
                    g_32.m1t(ofh.i_z(this), 2.0f);
                    g_32.lhu((String)((Object)c9p.e("f", (int)4519, (long)(0x69D268688AA56D31L ^ l))), 0.5f, 1.0f);
                }
                catch (oov oov8) {
                    throw c9p.a(oov8);
                }
            }
            this.wjn.x6d();
            bl = super.m1t(ofh2, f);
        }
        return bl;
    }

    @Override
    public int d1r() {
        return 180;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void ge2(float var1_1, float var2_2) {
        block23: {
            block20: {
                block21: {
                    block24: {
                        block22: {
                            var3_3 = t9d.b();
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v0 = this;
                                                        if (var3_3 == 0) break block20;
                                                        if (v0.de5()) {
                                                        }
                                                        ** GOTO lbl64
                                                    }
                                                    catch (oov v1) {
                                                        throw c9p.a(v1);
                                                    }
                                                    v2 = this;
                                                    if (var3_3 == 0) break block21;
                                                }
                                                catch (oov v3) {
                                                    throw c9p.a(v3);
                                                }
                                                if (v2.mwv()) {
                                                }
                                                ** GOTO lbl56
                                            }
                                            catch (oov v4) {
                                                throw c9p.a(v4);
                                            }
                                            this.r4r(var1_1, var2_2, 0.1f);
                                            this.vjj(this.icv, this.mop, this.bw4);
                                            this.icv *= 0.8999999761581421;
                                            this.mop *= 0.8999999761581421;
                                            this.bw4 *= 0.8999999761581421;
                                            v5 /* !! */  = this;
                                            if (var3_3 == 0) break block22;
                                        }
                                        catch (oov v6) {
                                            throw c9p.a(v6);
                                        }
                                        if (v5 /* !! */ .m04()) break block23;
                                    }
                                    catch (oov v7) {
                                        throw c9p.a(v7);
                                    }
                                    v8 = this;
                                    if (var3_3 == 0) break block24;
                                }
                                catch (oov v9) {
                                    throw c9p.a(v9);
                                }
                                v5 /* !! */  = v8.q4v();
                            }
                            catch (oov v10) {
                                throw c9p.a(v10);
                            }
                        }
                        if (v5 /* !! */  != null) break block23;
                        v8 = this;
                    }
                    try {
                        v8.mop -= 0.005;
                        if (var3_3 != 0) break block23;
lbl56:
                        // 2 sources

                        v2 = this;
                    }
                    catch (oov v11) {
                        throw c9p.a(v11);
                    }
                }
                try {
                    super.ge2(var1_1, var2_2);
                    if (var3_3 != 0) break block23;
lbl64:
                    // 2 sources

                    v0 = this;
                }
                catch (oov v12) {
                    throw c9p.a(v12);
                }
            }
            super.ge2(var1_1, var2_2);
        }
    }

    public static void bf5(c9p c9p2, int n) {
        c9p2.kkf(n);
    }

    public static _tb ggu(c9p c9p2) {
        return c9p2.wjn;
    }

    public static void leu(c9p c9p2, boolean bl) {
        c9p2.er9(bl);
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

                c9p.c = c.a(-3155169707004567946L, -4918976011714439149L, MethodHandles.lookup().lookupClass()).a(190577115957628L);
                c9p.v = new HashMap<K, V>(13);
                var0 = c9p.c ^ 1605962259176L;
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
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "nx\u0013;\u00ab\u0000\u008bVRV\u0091I\u008e\u00e1\u0098=a\u00a7\u008b2;Pe\u000e\u00b1\u00bfd\u00c3u\u0007\u00e5b\u00f20\u00dd\u00dbLu0\u00e8\u0081\u00f0\u007f\u00c7)\u00ea\u00c6h\u0010N\u00abM\u00a1\u00a1\u0093X:<N\u00cc\u00b3\b&\u00efR\u0010\u00e9\u0013\ti\u0016\u0098\u0010c\u0005\u00ce\b\u00b4\u00e5x\u0007\u00970\u008c2J\u00f3%\u00fe\u00ab\u009e!\u0007\u00fcK\u008f4\u00ca\u00de\u001e\u00a5\u00e6YZ\u0018\u00f3\u009dR\u00d7*\u00be\u00fa<[Ckj\u00dc\r\u00b9@\u00b5t\u009bO\u001f\u00a5\u00c4\u00cb\u00b3\u0093(\u00a1\u0087\u009d\u00fc\u00de\u00f37s\u00ed\u00e8\u00b3\u00d9\u00e4\u00c1s\u009bY;B\\{\u0094(\u00ef\u00b1\u00d2\u00fde\u0016\u00d4n\u00ff\u00df\u0082\u00b4\u00b3\u00af|\u00d8\u0093(\u00ba\u00d6e\u0097\u001c\u00d6t\u00ff\u0080\u00beov\u00c95\u00cf\u00a8x,\u00d0J\u00a2\u00c1\u0092\u0086\u001b\u0087\u0090\u00e2\u00150\u00cf\n\u00d0\u00ae\u00f6\u00838\u0092\u008c4(L7\u0006\u00ear\u00d8qU@t\b\u00f4,c5\u001e\bc\u0098*\u001f\u00c92\u0093?\u00c0\u00d9\u00b6\u00bcvH\u00a6\u00bbW\u001b\u00f0O\u00d7p\u00da(\u008a\u0015\u00ae8sj\u000f?\u001dD\u001d\u00c6\u00e8c\u00bb\u00d3\u00a1|\u0090\u00fboU\u00887\u00d1\u00cbI\u000e\u0014\u00d8`\u0007\u00fb\u00d57\u00dc2\u0085uq(\u00c6e\u0089\r\u00e8\u00f9\u0011\u00e0s!\fX\u00c0\u00c8\u00a4\u00e9<\u00b2\"w\u0010\u00fc\u00ce\u00df\u00a2\u0003\u00f1\u00fc|\u00b4d\u00d3\u00b9{c\u00dddpF^(js\u00e0\u0002\u009b\u00c2g\u00b4\u00ef\u00dc\u0003{\u00fd&\u00daY|X:#\u0099r\u0083\u00f8\u0001\u00b8\u00bf\u00b8\u0092!\u00f2~kV\u00fe=\u00a0\u00d0\u0007\u00870\n\u0099\u00bfO\u0098\u00ea\u0002\u00c5:Y\u00dc\u00e2F\u00c1\u000eVWK\u001b\u001f\u00e89\b=:\u0085\u00e6\u00feo\u00db\u00de\u0000S\u001b\u009cX=\u00dd##\u00acK\u00d3Y\u00d6\u00ba\u001e\u00d7";
                var8_6 = "nx\u0013;\u00ab\u0000\u008bVRV\u0091I\u008e\u00e1\u0098=a\u00a7\u008b2;Pe\u000e\u00b1\u00bfd\u00c3u\u0007\u00e5b\u00f20\u00dd\u00dbLu0\u00e8\u0081\u00f0\u007f\u00c7)\u00ea\u00c6h\u0010N\u00abM\u00a1\u00a1\u0093X:<N\u00cc\u00b3\b&\u00efR\u0010\u00e9\u0013\ti\u0016\u0098\u0010c\u0005\u00ce\b\u00b4\u00e5x\u0007\u00970\u008c2J\u00f3%\u00fe\u00ab\u009e!\u0007\u00fcK\u008f4\u00ca\u00de\u001e\u00a5\u00e6YZ\u0018\u00f3\u009dR\u00d7*\u00be\u00fa<[Ckj\u00dc\r\u00b9@\u00b5t\u009bO\u001f\u00a5\u00c4\u00cb\u00b3\u0093(\u00a1\u0087\u009d\u00fc\u00de\u00f37s\u00ed\u00e8\u00b3\u00d9\u00e4\u00c1s\u009bY;B\\{\u0094(\u00ef\u00b1\u00d2\u00fde\u0016\u00d4n\u00ff\u00df\u0082\u00b4\u00b3\u00af|\u00d8\u0093(\u00ba\u00d6e\u0097\u001c\u00d6t\u00ff\u0080\u00beov\u00c95\u00cf\u00a8x,\u00d0J\u00a2\u00c1\u0092\u0086\u001b\u0087\u0090\u00e2\u00150\u00cf\n\u00d0\u00ae\u00f6\u00838\u0092\u008c4(L7\u0006\u00ear\u00d8qU@t\b\u00f4,c5\u001e\bc\u0098*\u001f\u00c92\u0093?\u00c0\u00d9\u00b6\u00bcvH\u00a6\u00bbW\u001b\u00f0O\u00d7p\u00da(\u008a\u0015\u00ae8sj\u000f?\u001dD\u001d\u00c6\u00e8c\u00bb\u00d3\u00a1|\u0090\u00fboU\u00887\u00d1\u00cbI\u000e\u0014\u00d8`\u0007\u00fb\u00d57\u00dc2\u0085uq(\u00c6e\u0089\r\u00e8\u00f9\u0011\u00e0s!\fX\u00c0\u00c8\u00a4\u00e9<\u00b2\"w\u0010\u00fc\u00ce\u00df\u00a2\u0003\u00f1\u00fc|\u00b4d\u00d3\u00b9{c\u00dddpF^(js\u00e0\u0002\u009b\u00c2g\u00b4\u00ef\u00dc\u0003{\u00fd&\u00daY|X:#\u0099r\u0083\u00f8\u0001\u00b8\u00bf\u00b8\u0092!\u00f2~kV\u00fe=\u00a0\u00d0\u0007\u00870\n\u0099\u00bfO\u0098\u00ea\u0002\u00c5:Y\u00dc\u00e2F\u00c1\u000eVWK\u001b\u001f\u00e89\b=:\u0085\u00e6\u00feo\u00db\u00de\u0000S\u001b\u009cX=\u00dd##\u00acK\u00d3Y\u00d6\u00ba\u001e\u00d7".length();
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
                    var9_3[var7_4++] = c9p.f(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "]\u0003\u00e9} `\u008f\u0095\u00be\u00a0\u00a5\u00a8C\u00f5\u009eA\u00e1\n\u00da{\u00c49\u000e\u009e\u0081\u00b95Y\u00e5\u0014\u001897*\u00e6F\u0097\u0006!z +]Fha\u00b5\u00c8\u00dd]\u00b4\u0015s\u00c4\u00c14\u0090\u0018>U\u00a2`\u00c6\u001c\u00f0|\u00bbC%\u00d9\u00db\u00c7:";
                    var8_6 = "]\u0003\u00e9} `\u008f\u0095\u00be\u00a0\u00a5\u00a8C\u00f5\u009eA\u00e1\n\u00da{\u00c49\u000e\u009e\u0081\u00b95Y\u00e5\u0014\u001897*\u00e6F\u0097\u0006!z +]Fha\u00b5\u00c8\u00dd]\u00b4\u0015s\u00c4\u00c14\u0090\u0018>U\u00a2`\u00c6\u001c\u00f0|\u00bbC%\u00d9\u00db\u00c7:".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = c9p.f(var10_9).intern();
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
        c9p.g = var9_3;
        c9p.u = new String[13];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x27E6;
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
                throw new RuntimeException("c9p", exception);
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
            c9p.u[n2] = c9p.f(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return u[n2];
    }

    private static Object e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = c9p.e(n, l);
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
            throw new RuntimeException("c9p" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c9p.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

