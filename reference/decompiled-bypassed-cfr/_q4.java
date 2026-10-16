/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class _q4
extends wgw {
    private static final zfz b1_ = ox_.uom.l4i().zvi(qv5.yuo, (Comparable)((Object)x54$lti.b4p));
    private static final zfz qvc = ox_.rwl.l4i().zvi(uav.nps, (Comparable)((Object)x54$lti.b4p)).zvi(_cv.sdu, Boolean.valueOf(false));
    private static final zfz c0k = ox_.kqk.l4i().zvi(bx0.nln, (Comparable)((Object)bx0$b_z.sos));
    private boolean s40;

    public _q4(boolean bl, boolean bl2) {
        super(bl, 13, 15, b1_, qvc);
        this.s40 = bl2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean v3g(t9d var1_1, Random var2_2, mew var3_3) {
        block39: {
            block40: {
                var4_4 = t9d.b();
                var5_5 = this.wl1(var2_2);
                try {
                    try {
                        v0 = this.ku6(var1_1, var2_2, var3_3, var5_5);
                        if (var4_4 == 0) break block39;
                        if (v0 != 0) break block40;
                    }
                    catch (oov v1) {
                        throw _q4.a(v1);
                    }
                    return false;
                }
                catch (oov v2) {
                    throw _q4.a(v2);
                }
            }
            this._pd(var1_1, var3_3.getX(), var3_3.getZ(), var3_3.getY() + var5_5, 0, var2_2);
            v0 = var6_6 = 0;
        }
        while (var6_6 < var5_5) {
            block50: {
                block49: {
                    block47: {
                        block48: {
                            block46: {
                                block44: {
                                    block45: {
                                        block43: {
                                            block42: {
                                                block41: {
                                                    var7_7 = var1_1.getBlockState(var3_3.z89(var6_6)).r_y();
                                                    try {
                                                        try {
                                                            v3 = var7_7.p1r();
                                                            v4 = p3y.cei;
                                                            if (var4_4 == 0) break block41;
                                                            if (v3 != v4) {
                                                            }
                                                            ** GOTO lbl38
                                                        }
                                                        catch (oov v5) {
                                                            throw _q4.a(v5);
                                                        }
                                                        v3 = var7_7.p1r();
                                                        v4 = p3y.hh1;
                                                    }
                                                    catch (oov v6) {
                                                        throw _q4.a(v6);
                                                    }
                                                }
                                                try {
                                                    if (v3 != v4) break block42;
lbl38:
                                                    // 2 sources

                                                    this.u0f(var1_1, var3_3.z89(var6_6), this._f6);
                                                }
                                                catch (oov v7) {
                                                    throw _q4.a(v7);
                                                }
                                            }
                                            if (var6_6 >= var5_5 - 1) break block50;
                                            var7_7 = var1_1.getBlockState(var3_3.ec4(1, var6_6, 0)).r_y();
                                            try {
                                                try {
                                                    v8 = var7_7.p1r();
                                                    v9 = p3y.cei;
                                                    if (var4_4 == 0) break block43;
                                                    if (v8 != v9) {
                                                    }
                                                    ** GOTO lbl68
                                                }
                                                catch (oov v10) {
                                                    throw _q4.a(v10);
                                                }
                                                v8 = var7_7.p1r();
                                                v9 = p3y.hh1;
                                            }
                                            catch (oov v11) {
                                                throw _q4.a(v11);
                                            }
                                        }
                                        try {
                                            try {
                                                if (var4_4 == 0) break block44;
                                                if (v8 != v9) break block45;
                                            }
                                            catch (oov v12) {
                                                throw _q4.a(v12);
                                            }
lbl68:
                                            // 2 sources

                                            this.u0f(var1_1, var3_3.ec4(1, var6_6, 0), this._f6);
                                        }
                                        catch (oov v13) {
                                            throw _q4.a(v13);
                                        }
                                    }
                                    var7_7 = var1_1.getBlockState(var3_3.ec4(1, var6_6, 1)).r_y();
                                    v8 = var7_7.p1r();
                                    v9 = p3y.cei;
                                }
                                try {
                                    try {
                                        if (var4_4 == 0) break block46;
                                        if (v8 != v9) {
                                        }
                                        ** GOTO lbl98
                                    }
                                    catch (oov v14) {
                                        throw _q4.a(v14);
                                    }
                                    v8 = var7_7.p1r();
                                    v9 = p3y.hh1;
                                }
                                catch (oov v15) {
                                    throw _q4.a(v15);
                                }
                            }
                            try {
                                try {
                                    if (var4_4 == 0) break block47;
                                    if (v8 != v9) break block48;
                                }
                                catch (oov v16) {
                                    throw _q4.a(v16);
                                }
lbl98:
                                // 2 sources

                                this.u0f(var1_1, var3_3.ec4(1, var6_6, 1), this._f6);
                            }
                            catch (oov v17) {
                                throw _q4.a(v17);
                            }
                        }
                        var7_7 = var1_1.getBlockState(var3_3.ec4(0, var6_6, 1)).r_y();
                        v8 = var7_7.p1r();
                        v9 = p3y.cei;
                    }
                    try {
                        try {
                            if (var4_4 == 0) break block49;
                            if (v8 != v9) {
                            }
                            ** GOTO lbl123
                        }
                        catch (oov v18) {
                            throw _q4.a(v18);
                        }
                        v8 = var7_7.p1r();
                        v9 = p3y.hh1;
                    }
                    catch (oov v19) {
                        throw _q4.a(v19);
                    }
                }
                try {
                    if (v8 != v9) break block50;
lbl123:
                    // 2 sources

                    this.u0f(var1_1, var3_3.ec4(0, var6_6, 1), this._f6);
                }
                catch (oov v20) {
                    throw _q4.a(v20);
                }
            }
            ++var6_6;
            if (var4_4 != 0) continue;
        }
        return true;
    }

    private void _pd(t9d t9d2, int n, int n2, int n3, int n4, Random random) {
        int n5;
        int n6;
        int n7;
        block13: {
            block14: {
                n7 = t9d.c();
                try {
                    try {
                        n6 = random.nextInt(5);
                        n5 = this.s40;
                        if (n7 != 0) break block13;
                        if (n5 == 0) break block14;
                    }
                    catch (oov oov2) {
                        throw _q4.a(oov2);
                    }
                    n5 = this.ddh;
                    break block13;
                }
                catch (oov oov3) {
                    throw _q4.a(oov3);
                }
            }
            n5 = 3;
        }
        int n8 = n6 + n5;
        int n9 = 0;
        for (int i = n3 - n8; i <= n3; ++i) {
            int n10;
            int n11;
            mew mew2;
            t9d t9d3;
            _q4 _q42;
            int n12;
            block18: {
                block16: {
                    int n13;
                    int n14;
                    block17: {
                        block15: {
                            int n15 = n3 - i;
                            n12 = n4 + fe6.tpk((float)n15 / (float)n8 * 3.5f);
                            try {
                                _q42 = this;
                                t9d3 = t9d2;
                                mew2 = new mew(n, i, n2);
                                n11 = n12;
                                n14 = n15;
                                if (n7 != 0) break block15;
                                if (n14 <= 0) break block16;
                            }
                            catch (oov oov4) {
                                throw _q4.a(oov4);
                            }
                            n14 = n12;
                        }
                        try {
                            try {
                                n13 = n9;
                                if (n7 != 0) break block17;
                                if (n14 != n13) break block16;
                            }
                            catch (oov oov5) {
                                throw _q4.a(oov5);
                            }
                            n14 = i;
                            n13 = 1;
                        }
                        catch (oov oov6) {
                            throw _q4.a(oov6);
                        }
                    }
                    try {
                        n10 = n14 & n13;
                        if (n7 != 0) break block18;
                        if (n10 != 0) break block16;
                    }
                    catch (oov oov7) {
                        throw _q4.a(oov7);
                    }
                    n10 = 1;
                    break block18;
                }
                n10 = 0;
            }
            _q42.c9n(t9d3, mew2, n11 + n10);
            n9 = n12;
            if (n7 == 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void mpp(t9d var1_1, Random var2_2, mew var3_3) {
        this.ij1(var1_1, var3_3.y8e().idu());
        v0 = t9d.c();
        this.ij1(var1_1, var3_3.b20(2).idu());
        this.ij1(var1_1, var3_3.y8e().wfo(2));
        this.ij1(var1_1, var3_3.b20(2).wfo(2));
        var4_4 = v0;
        for (var5_5 = 0; var5_5 < 5; ++var5_5) {
            block16: {
                block15: {
                    block14: {
                        var6_6 = var2_2.nextInt(64);
                        var7_7 = var6_6 % 8;
                        var8_8 = var6_6 / 8;
                        try {
                            v1 = var7_7;
                            if (var4_4 != 0) break block14;
                            if (v1 != 0) {
                            }
                            ** GOTO lbl45
                        }
                        catch (oov v2) {
                            throw _q4.a(v2);
                        }
                        v1 = var7_7;
                    }
                    try {
                        try {
                            if (var4_4 != 0) break block15;
                            if (v1 != 7) {
                            }
                            ** GOTO lbl45
                        }
                        catch (oov v3) {
                            throw _q4.a(v3);
                        }
                        v1 = var8_8;
                    }
                    catch (oov v4) {
                        throw _q4.a(v4);
                    }
                }
                try {
                    if (var4_4 != 0) break block16;
                    if (v1 != 0) {
                    }
                    ** GOTO lbl45
                }
                catch (oov v5) {
                    throw _q4.a(v5);
                }
                v1 = var8_8;
            }
            try {
                if (v1 != 7) continue;
lbl45:
                // 4 sources

                this.ij1(var1_1, var3_3.ec4(-3 + var7_7, 0, -3 + var8_8));
                continue;
            }
            catch (oov v6) {
                throw _q4.a(v6);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void ij1(t9d var1_1, mew var2_2) {
        var3_3 = t9d.b();
        var4_4 = -2;
        block6: while (true) {
            v0 = var4_4;
            v1 = 2;
            block7: while (v0 <= v1) {
                for (var5_5 = -2; var5_5 <= 2; ++var5_5) {
                    block10: {
                        v0 = Math.abs(var4_4);
                        v1 = 2;
                        if (var3_3 == 0) continue block7;
                        try {
                            try {
                                if (var3_3 == 0) break block10;
                                if (v0 == v1) {
                                }
                                ** GOTO lbl27
                            }
                            catch (oov v2) {
                                throw _q4.a(v2);
                            }
                            v3 = Math.abs(var5_5);
                            v4 = 2;
                        }
                        catch (oov v5) {
                            throw _q4.a(v5);
                        }
                    }
                    try {
                        if (v3 == v4) continue;
lbl27:
                        // 2 sources

                        this.mhi(var1_1, var2_2.ec4(var4_4, 0, var5_5));
                        continue;
                    }
                    catch (oov v6) {
                        throw _q4.a(v6);
                    }
                }
                ++var4_4;
                if (var3_3 != 0) continue block6;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void mhi(t9d var1_1, mew var2_2) {
        var3_3 = t9d.b();
        for (var4_4 = 2; var4_4 >= -3; --var4_4) {
            block18: {
                block16: {
                    var5_5 = var2_2.z89(var4_4);
                    var6_6 = var1_1.getBlockState(var5_5).r_y();
                    try {
                        block17: {
                            try {
                                try {
                                    try {
                                        if (var3_3 == 0) break block16;
                                        if (var6_6 == ox_.l11) break block17;
                                    }
                                    catch (oov v0) {
                                        throw _q4.a(v0);
                                    }
                                    v1 = var6_6;
                                    if (var3_3 == 0) break block18;
                                }
                                catch (oov v2) {
                                    throw _q4.a(v2);
                                }
                                if (v1 == ox_.kqk) {
                                }
                                ** GOTO lbl32
                            }
                            catch (oov v3) {
                                throw _q4.a(v3);
                            }
                        }
                        this.u0f(var1_1, var5_5, _q4.c0k);
                    }
                    catch (oov v4) {
                        throw _q4.a(v4);
                    }
                }
                try {
                    if (var3_3 != 0) break;
lbl32:
                    // 2 sources

                    v1 = var6_6;
                }
                catch (oov v5) {
                    throw _q4.a(v5);
                }
            }
            try {
                try {
                    if (v1.p1r() == p3y.cei || var4_4 >= 0) continue;
                    break;
                }
                catch (oov v6) {
                    throw _q4.a(v6);
                }
            }
            catch (oov v7) {
                throw _q4.a(v7);
            }
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

