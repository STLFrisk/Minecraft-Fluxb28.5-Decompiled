/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class d26
extends e0x {
    public static boolean trk;

    public d26() {
        super(p3y.y_4);
        this.i3l(uja.mqu);
    }

    public d26(p3y p3y2) {
        super(p3y2);
    }

    @Override
    public void tfc(t9d t9d2, mew mew2, zfz zfz2) {
        t9d2.cjk(mew2, this, this.odp(t9d2));
    }

    @Override
    public void z3l(t9d t9d2, mew mew2, zfz zfz2, e0x e0x2) {
        t9d2.cjk(mew2, this, this.odp(t9d2));
    }

    @Override
    public void zvy(t9d t9d2, mew mew2, zfz zfz2, Random random) {
        try {
            if (!t9d2.v0f) {
                this.zs1(t9d2, mew2);
            }
        }
        catch (oov oov2) {
            throw d26.a(oov2);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void zs1(t9d var1_1, mew var2_2) {
        block28: {
            block31: {
                block30: {
                    block29: {
                        block27: {
                            var3_3 = t9d.b();
                            try {
                                try {
                                    v0 = d26._j1(var1_1, var2_2.eve());
                                    if (var3_3 == 0) break block27;
                                    if (v0 == 0) break block28;
                                }
                                catch (oov v1) {
                                    throw d26.a(v1);
                                }
                                v0 = var2_2.getY();
                            }
                            catch (oov v2) {
                                throw d26.a(v2);
                            }
                        }
                        try {
                            if (var3_3 == 0) break block29;
                            if (v0 < 0) break block28;
                        }
                        catch (oov v3) {
                            throw d26.a(v3);
                        }
                        v0 = 32;
                    }
                    var4_4 = v0;
                    try {
                        try {
                            try {
                                try {
                                    v4 = d26.trk;
                                    if (var3_3 == 0) break block30;
                                    if (!v4) {
                                    }
                                    ** GOTO lbl55
                                }
                                catch (oov v5) {
                                    throw d26.a(v5);
                                }
                                v4 = var1_1.o2i(var2_2.ec4(-var4_4, -var4_4, -var4_4), var2_2.ec4(var4_4, var4_4, var4_4));
                                if (var3_3 == 0) break block30;
                            }
                            catch (oov v6) {
                                throw d26.a(v6);
                            }
                            if (v4) {
                            }
                            ** GOTO lbl55
                        }
                        catch (oov v7) {
                            throw d26.a(v7);
                        }
                        if (var1_1.v0f) break block28;
                    }
                    catch (oov v8) {
                        throw d26.a(v8);
                    }
                    var5_5 = new vjf(var1_1, (double)var2_2.getX() + 0.5, var2_2.getY(), (double)var2_2.getZ() + 0.5, var1_1.getBlockState(var2_2));
                    try {
                        this.cl9((vjf)var5_5);
                        var1_1.xzq((i2h)var5_5);
                        if (var3_3 != 0) break block28;
lbl55:
                        // 3 sources

                        v4 = var1_1.i6x(var2_2);
                    }
                    catch (oov v9) {
                        throw d26.a(v9);
                    }
                }
                var5_5 = var2_2.eve();
                while (d26._j1(var1_1, (mew)var5_5)) {
                    try {
                        try {
                            v10 = var5_5.getY();
                            if (var3_3 == 0 || var3_3 == 0) break block31;
                        }
                        catch (oov v11) {
                            throw d26.a(v11);
                        }
                        if (v10 <= 0) break;
                    }
                    catch (oov v12) {
                        throw d26.a(v12);
                    }
                    var5_5 = var5_5.eve();
                    if (var3_3 != 0) continue;
                }
                v10 = var5_5.getY();
            }
            try {
                try {
                    if (var3_3 == 0 || v10 <= 0) break block28;
                }
                catch (oov v13) {
                    throw d26.a(v13);
                }
                v10 = (int)var1_1.gfy(var5_5.nuv(), this.l4i());
            }
            catch (oov v14) {
                throw d26.a(v14);
            }
        }
    }

    public void cl9(vjf vjf2) {
    }

    @Override
    public int odp(t9d t9d2) {
        return 2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean _j1(t9d t9d2, mew mew2) {
        p3y p3y2;
        p3y p3y3;
        block13: {
            int n;
            p3y p3y4;
            block12: {
                e0x e0x2 = t9d2.getBlockState(mew2).r_y();
                p3y4 = e0x2.kgd;
                n = t9d.b();
                try {
                    try {
                        try {
                            if (e0x2 == ox_._0u) return true;
                            p3y3 = p3y4;
                            p3y2 = p3y.cei;
                            if (n == 0) break block12;
                        }
                        catch (oov oov2) {
                            throw d26.a(oov2);
                        }
                        if (p3y3 == p3y2) return true;
                    }
                    catch (oov oov3) {
                        throw d26.a(oov3);
                    }
                    p3y3 = p3y4;
                    p3y2 = p3y.six;
                }
                catch (oov oov4) {
                    throw d26.a(oov4);
                }
            }
            try {
                try {
                    if (n == 0) break block13;
                    if (p3y3 == p3y2) return true;
                }
                catch (oov oov5) {
                    throw d26.a(oov5);
                }
                p3y3 = p3y4;
                p3y2 = p3y.e1s;
            }
            catch (oov oov6) {
                throw d26.a(oov6);
            }
        }
        try {
            if (p3y3 != p3y2) return false;
            return true;
        }
        catch (oov oov7) {
            throw d26.a(oov7);
        }
    }

    public void s5p(t9d t9d2, mew mew2) {
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

