/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class f8k
extends sq9 {
    public final boolean d5w;

    public f8k(boolean bl) {
        super(p3y.f20);
        this.d5w = bl;
        this.xl4(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public boolean gck() {
        return false;
    }

    @Override
    public boolean ctq(t9d t9d2, mew mew2) {
        boolean bl;
        block4: {
            block5: {
                int n = t9d.c();
                try {
                    try {
                        bl = t9d.r3_(t9d2, mew2.eve());
                        if (n != 0) break block4;
                        if (!bl) break block5;
                    }
                    catch (oov oov2) {
                        throw f8k.b(oov2);
                    }
                    bl = super.ctq(t9d2, mew2);
                    break block4;
                }
                catch (oov oov3) {
                    throw f8k.b(oov3);
                }
            }
            bl = false;
        }
        return bl;
    }

    public boolean f44(t9d t9d2, mew mew2) {
        return t9d.r3_(t9d2, mew2.eve());
    }

    @Override
    public void ff3(t9d t9d2, mew mew2, zfz zfz2, Random random) {
    }

    @Override
    public void zvy(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        block23: {
            zfz zfz3;
            mew mew3;
            t9d t9d3;
            block27: {
                boolean bl;
                block26: {
                    boolean bl2;
                    int n;
                    block24: {
                        boolean bl3;
                        block22: {
                            n = t9d.c();
                            try {
                                try {
                                    bl3 = this.vfl(t9d2, mew2, zfz2);
                                    if (n != 0) break block22;
                                    if (bl3) break block23;
                                }
                                catch (oov oov2) {
                                    throw f8k.b(oov2);
                                }
                                bl3 = this.qd6(t9d2, mew2, zfz2);
                            }
                            catch (oov oov3) {
                                throw f8k.b(oov3);
                            }
                        }
                        bl2 = bl3;
                        try {
                            block25: {
                                try {
                                    try {
                                        try {
                                            try {
                                                bl = this.d5w;
                                                if (n != 0) break block24;
                                                if (!bl) break block25;
                                            }
                                            catch (oov oov4) {
                                                throw f8k.b(oov4);
                                            }
                                            bl = bl2;
                                            if (n != 0) break block24;
                                        }
                                        catch (oov oov5) {
                                            throw f8k.b(oov5);
                                        }
                                        if (bl) break block25;
                                    }
                                    catch (oov oov6) {
                                        throw f8k.b(oov6);
                                    }
                                    t9d2.vct(mew2, this.woc(zfz2), 2);
                                    if (n == 0) break block23;
                                }
                                catch (oov oov7) {
                                    throw f8k.b(oov7);
                                }
                            }
                            bl = this.d5w;
                        }
                        catch (oov oov8) {
                            throw f8k.b(oov8);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n != 0) break block26;
                                if (bl) break block23;
                            }
                            catch (oov oov9) {
                                throw f8k.b(oov9);
                            }
                            t9d3 = t9d2;
                            mew3 = mew2;
                            zfz3 = this.ip_(zfz2);
                            if (n != 0) break block27;
                        }
                        catch (oov oov10) {
                            throw f8k.b(oov10);
                        }
                        t9d3.vct(mew3, zfz3, 2);
                        bl = bl2;
                    }
                    catch (oov oov11) {
                        throw f8k.b(oov11);
                    }
                }
                try {
                    if (bl) break block23;
                    t9d3 = t9d2;
                    mew3 = mew2;
                    zfz3 = this.ip_(zfz2);
                }
                catch (oov oov12) {
                    throw f8k.b(oov12);
                }
            }
            t9d3.hba(mew3, zfz3.r_y(), this.ixx(zfz2), -1);
        }
    }

    @Override
    public boolean ron(m5n m5n2, mew mew2, vt2 vt22) {
        boolean bl;
        try {
            bl = vt22.e30() != vt2$y0s.abn;
        }
        catch (oov oov2) {
            throw f8k.b(oov2);
        }
        return bl;
    }

    public boolean tt9(zfz zfz2) {
        return this.d5w;
    }

    @Override
    public int sqt(m5n m5n2, mew mew2, zfz zfz2, vt2 vt22) {
        return this.gpi(m5n2, mew2, zfz2, vt22);
    }

    @Override
    public int gpi(m5n m5n2, mew mew2, zfz zfz2, vt2 vt22) {
        int n;
        block4: {
            block5: {
                int n2 = t9d.b();
                try {
                    n = this.tt9(zfz2);
                    if (n2 == 0) break block4;
                    if (n != 0) break block5;
                }
                catch (oov oov2) {
                    throw f8k.b(oov2);
                }
                n = 0;
                break block4;
            }
            try {
                n = zfz2.dil(em9) == vt22 ? this.ft0(m5n2, mew2, zfz2) : 0;
            }
            catch (oov oov3) {
                throw f8k.b(oov3);
            }
        }
        return n;
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        block9: {
            int n;
            block7: {
                n = t9d.b();
                try {
                    boolean bl;
                    block8: {
                        try {
                            try {
                                bl = this.f44(t9d2, mew2);
                                if (n == 0) break block7;
                                if (!bl) break block8;
                            }
                            catch (oov oov2) {
                                throw f8k.b(oov2);
                            }
                            this.rsi(t9d2, mew2, zfz2);
                            if (n != 0) break block9;
                        }
                        catch (oov oov3) {
                            throw f8k.b(oov3);
                        }
                    }
                    this.lf0(t9d2, mew2, zfz2, 0);
                    bl = t9d2.i6x(mew2);
                }
                catch (oov oov4) {
                    throw f8k.b(oov4);
                }
            }
            for (vt2 vt22 : vt2.values()) {
                t9d2._0o(mew2.offset(vt22), this);
                if (n != 0) continue;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void rsi(t9d var1_1, mew var2_2, zfz var3_3) {
        block29: {
            block36: {
                block37: {
                    block35: {
                        block34: {
                            block32: {
                                block33: {
                                    block30: {
                                        block28: {
                                            var4_4 = t9d.c();
                                            try {
                                                try {
                                                    v0 = this.vfl(var1_1, var2_2, var3_3);
                                                    if (var4_4 != 0) break block28;
                                                    if (v0 != 0) break block29;
                                                }
                                                catch (oov v1) {
                                                    throw f8k.b(v1);
                                                }
                                                v0 = this.qd6(var1_1, var2_2, var3_3);
                                            }
                                            catch (oov v2) {
                                                throw f8k.b(v2);
                                            }
                                        }
                                        var5_5 = v0;
                                        try {
                                            block31: {
                                                try {
                                                    try {
                                                        try {
                                                            v3 = this.d5w;
                                                            if (var4_4 != 0) break block30;
                                                            if (v3 == 0) break block31;
                                                        }
                                                        catch (oov v4) {
                                                            throw f8k.b(v4);
                                                        }
                                                        v3 = var5_5;
                                                        if (var4_4 != 0) break block32;
                                                    }
                                                    catch (oov v5) {
                                                        throw f8k.b(v5);
                                                    }
                                                    if (v3 != 0) {
                                                    }
                                                    ** GOTO lbl57
                                                }
                                                catch (oov v6) {
                                                    throw f8k.b(v6);
                                                }
                                            }
                                            v3 = this.d5w;
                                        }
                                        catch (oov v7) {
                                            throw f8k.b(v7);
                                        }
                                    }
                                    try {
                                        if (var4_4 != 0) break block33;
                                        if (v3 != 0) break block29;
                                    }
                                    catch (oov v8) {
                                        throw f8k.b(v8);
                                    }
                                    v3 = var5_5;
                                }
                                try {
                                    try {
                                        if (var4_4 != 0) break block32;
                                        if (v3 == 0) break block29;
                                    }
                                    catch (oov v9) {
                                        throw f8k.b(v9);
                                    }
lbl57:
                                    // 2 sources

                                    v3 = var1_1.h11(var2_2, this);
                                }
                                catch (oov v10) {
                                    throw f8k.b(v10);
                                }
                            }
                            try {
                                if (var4_4 != 0) break block34;
                                if (v3 != 0) break block29;
                            }
                            catch (oov v11) {
                                throw f8k.b(v11);
                            }
                            v3 = -1;
                        }
                        var6_6 = v3;
                        try {
                            v12 = this.l94(var1_1, var2_2, var3_3);
                            if (var4_4 != 0) break block35;
                            if (v12 != 0) {
                            }
                            ** GOTO lbl82
                        }
                        catch (oov v13) {
                            throw f8k.b(v13);
                        }
                        var6_6 = -3;
                        try {
                            if (var4_4 == 0) break block36;
lbl82:
                            // 2 sources

                            v12 = this.d5w;
                        }
                        catch (oov v14) {
                            throw f8k.b(v14);
                        }
                    }
                    try {
                        if (var4_4 != 0) break block37;
                        if (v12 == 0) break block36;
                    }
                    catch (oov v15) {
                        throw f8k.b(v15);
                    }
                    v12 = -2;
                }
                var6_6 = v12;
            }
            var1_1.hba(var2_2, this, this.hqm(var3_3), var6_6);
        }
    }

    public boolean vfl(m5n m5n2, mew mew2, zfz zfz2) {
        return false;
    }

    public boolean qd6(t9d t9d2, mew mew2, zfz zfz2) {
        boolean bl;
        block2: {
            block3: {
                int n = t9d.b();
                try {
                    bl = this.qqr(t9d2, mew2, zfz2);
                    if (n == 0) break block2;
                    if (bl <= false) break block3;
                }
                catch (oov oov2) {
                    throw f8k.b(oov2);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public int qqr(t9d t9d2, mew mew2, zfz zfz2) {
        int n;
        int n2;
        block12: {
            block11: {
                zfz zfz3;
                block10: {
                    int n3;
                    int n4;
                    mew mew3;
                    block9: {
                        int n5;
                        block8: {
                            vt2 vt22 = (vt2)((Object)zfz2.dil(em9));
                            mew3 = mew2.offset(vt22);
                            n4 = t9d.b();
                            n3 = t9d2.r90(mew3, vt22);
                            try {
                                try {
                                    n5 = n3;
                                    if (n4 == 0) break block8;
                                    if (n5 < 15) break block9;
                                }
                                catch (oov oov2) {
                                    throw f8k.b(oov2);
                                }
                                n5 = n3;
                            }
                            catch (oov oov3) {
                                throw f8k.b(oov3);
                            }
                        }
                        return n5;
                    }
                    zfz zfz4 = t9d2.getBlockState(mew3);
                    try {
                        try {
                            n2 = n3;
                            zfz3 = zfz4;
                            if (n4 == 0) break block10;
                            if (zfz3.r_y() != ox_.s0f) break block11;
                        }
                        catch (oov oov4) {
                            throw f8k.b(oov4);
                        }
                        zfz3 = zfz4;
                    }
                    catch (oov oov5) {
                        throw f8k.b(oov5);
                    }
                }
                n = (Integer)zfz3.dil(fcu.crs);
                break block12;
            }
            n = 0;
        }
        return Math.max(n2, n);
    }

    public int snu(m5n m5n2, mew mew2, zfz zfz2) {
        vt2 vt22 = (vt2)((Object)zfz2.dil(em9));
        vt2 vt23 = vt22.drv();
        vt2 vt24 = vt22.tgw();
        return Math.max(this.e9e(m5n2, mew2.offset(vt23), vt23), this.e9e(m5n2, mew2.offset(vt24), vt24));
    }

    public int e9e(m5n m5n2, mew mew2, vt2 vt22) {
        int n;
        block9: {
            block7: {
                block8: {
                    e0x e0x2;
                    zfz zfz2;
                    block6: {
                        zfz2 = m5n2.getBlockState(mew2);
                        e0x e0x3 = zfz2.r_y();
                        int n2 = t9d.b();
                        try {
                            try {
                                e0x2 = this;
                                if (n2 == 0) break block6;
                                if (!e0x2.qi0(e0x3)) break block7;
                            }
                            catch (oov oov2) {
                                throw f8k.b(oov2);
                            }
                            e0x2 = e0x3;
                        }
                        catch (oov oov3) {
                            throw f8k.b(oov3);
                        }
                    }
                    try {
                        if (e0x2 != ox_.s0f) break block8;
                        n = (Integer)zfz2.dil(fcu.crs);
                        break block9;
                    }
                    catch (oov oov4) {
                        throw f8k.b(oov4);
                    }
                }
                n = m5n2.getStrongPower(mew2, vt22);
                break block9;
            }
            n = 0;
        }
        return n;
    }

    @Override
    public boolean scl() {
        return true;
    }

    @Override
    public zfz qk_(t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3, int n, g_3 g_32) {
        return this.l4i().zvi(em9, (Comparable)((Object)g_32.u0f().b4b()));
    }

    @Override
    public void qh0(t9d t9d2, mew mew2, zfz zfz2, g_3 g_32, erg erg2) {
        try {
            if (this.qd6(t9d2, mew2, zfz2)) {
                t9d2.cjk(mew2, this, 1);
            }
        }
        catch (oov oov2) {
            throw f8k.b(oov2);
        }
    }

    @Override
    public void tfc(t9d t9d2, mew mew2, zfz zfz2) {
        this.fow(t9d2, mew2, zfz2);
    }

    public void fow(t9d t9d2, mew mew2, zfz zfz2) {
        vt2 vt22 = (vt2)((Object)zfz2.dil(em9));
        mew mew3 = mew2.offset(vt22.b4b());
        t9d2.hfy(mew3, this);
        t9d2.uy9(mew3, this, vt22);
    }

    @Override
    public void bf0(t9d t9d2, mew mew2, zfz zfz2) {
        block8: {
            f8k f8k2;
            block6: {
                block7: {
                    int n = t9d.b();
                    try {
                        f8k2 = this;
                        if (n == 0) break block6;
                        if (!f8k2.d5w) break block7;
                    }
                    catch (oov oov2) {
                        throw f8k.b(oov2);
                    }
                    for (vt2 vt22 : vt2.values()) {
                        try {
                            t9d2._0o(mew2.offset(vt22), this);
                            if (n != 0) {
                                if (n != 0) continue;
                                break;
                            }
                            break block8;
                        }
                        catch (oov oov3) {
                            throw f8k.b(oov3);
                        }
                    }
                }
                f8k2 = this;
            }
            super.bf0(t9d2, mew2, zfz2);
        }
    }

    @Override
    public boolean ko5() {
        return false;
    }

    public boolean qi0(e0x e0x2) {
        return e0x2.scl();
    }

    public int ft0(m5n m5n2, mew mew2, zfz zfz2) {
        return 15;
    }

    public static boolean r25(e0x e0x2) {
        boolean bl;
        block6: {
            block8: {
                block7: {
                    int n = t9d.b();
                    try {
                        try {
                            try {
                                bl = ox_.r0f.zl0(e0x2);
                                if (n == 0) break block6;
                                if (bl) break block7;
                            }
                            catch (oov oov2) {
                                throw f8k.b(oov2);
                            }
                            bl = ox_.k2w.zl0(e0x2);
                            if (n == 0) break block6;
                        }
                        catch (oov oov3) {
                            throw f8k.b(oov3);
                        }
                        if (!bl) break block8;
                    }
                    catch (oov oov4) {
                        throw f8k.b(oov4);
                    }
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean zl0(e0x e0x2) {
        e0x e0x3;
        e0x e0x4;
        block6: {
            int n = t9d.b();
            try {
                try {
                    e0x4 = e0x2;
                    e0x3 = this.ip_(this.l4i()).r_y();
                    if (n == 0) break block6;
                    if (e0x4 == e0x3) return true;
                }
                catch (oov oov2) {
                    throw f8k.b(oov2);
                }
                e0x4 = e0x2;
                e0x3 = this.woc(this.l4i()).r_y();
            }
            catch (oov oov3) {
                throw f8k.b(oov3);
            }
        }
        try {
            if (e0x4 != e0x3) return false;
            return true;
        }
        catch (oov oov4) {
            throw f8k.b(oov4);
        }
    }

    public boolean l94(t9d t9d2, mew mew2, zfz zfz2) {
        boolean bl;
        block9: {
            block7: {
                block8: {
                    zfz zfz3;
                    vt2 vt22;
                    block6: {
                        vt22 = ((vt2)((Object)zfz2.dil(em9))).b4b();
                        mew mew3 = mew2.offset(vt22);
                        int n = t9d.c();
                        try {
                            try {
                                zfz3 = t9d2.getBlockState(mew3);
                                if (n != 0) break block6;
                                if (!f8k.r25(zfz3.r_y())) break block7;
                            }
                            catch (oov oov2) {
                                throw f8k.b(oov2);
                            }
                            zfz3 = t9d2.getBlockState(mew3);
                        }
                        catch (oov oov3) {
                            throw f8k.b(oov3);
                        }
                    }
                    try {
                        if (zfz3.dil(em9) == vt22) break block8;
                        bl = true;
                        break block9;
                    }
                    catch (oov oov4) {
                        throw f8k.b(oov4);
                    }
                }
                bl = false;
                break block9;
            }
            bl = false;
        }
        return bl;
    }

    public int ixx(zfz zfz2) {
        return this.hqm(zfz2);
    }

    public abstract int hqm(zfz var1);

    public abstract zfz ip_(zfz var1);

    public abstract zfz woc(zfz var1);

    @Override
    public boolean ct_(e0x e0x2) {
        return this.zl0(e0x2);
    }

    @Override
    public w51 w3x() {
        return w51.gx9;
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

