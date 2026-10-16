/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ahp
extends ffn {
    private final /* synthetic */ zfz c6z;
    private final /* synthetic */ zfz es3;

    public ahp(zfz zfz2, zfz zfz3) {
        super(false);
        this.es3 = zfz2;
        this.c6z = zfz3;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean v3g(t9d var1_1, Random var2_2, mew var3_3) {
        block38: {
            block37: {
                block35: {
                    block36: {
                        block33: {
                            var4_4 = t9d.c();
                            do {
                                block34: {
                                    if ((var5_5 = var1_1.getBlockState(var3_3).r_y()).p1r() == p3y.cei) ** GOTO lbl18
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v0 = var5_5;
                                                        if (var4_4 != 0 || var4_4 != 0) break block33;
                                                    }
                                                    catch (oov v1) {
                                                        throw ahp.a(v1);
                                                    }
                                                    if (v0.p1r() != p3y.hh1) break;
                                                }
                                                catch (oov v2) {
                                                    throw ahp.a(v2);
                                                }
lbl18:
                                                // 2 sources

                                                v3 = var3_3;
                                                if (var4_4 != 0) break block34;
                                            }
                                            catch (oov v4) {
                                                throw ahp.a(v4);
                                            }
                                            if (v3.getY() <= 0) break;
                                        }
                                        catch (oov v5) {
                                            throw ahp.a(v5);
                                        }
                                        v3 = var3_3.eve();
                                    }
                                    catch (oov v6) {
                                        throw ahp.a(v6);
                                    }
                                }
                                var3_3 = v3;
                            } while (var4_4 == 0);
                            v0 = var1_1.getBlockState(var3_3).r_y();
                        }
                        var6_6 = v0;
                        try {
                            try {
                                if (var4_4 != 0) break block35;
                                if (var6_6 == ox_.kqk) break block36;
                            }
                            catch (oov v7) {
                                throw ahp.a(v7);
                            }
                            if (var6_6 != ox_.l11) break block37;
                        }
                        catch (oov v8) {
                            throw ahp.a(v8);
                        }
                    }
                    var3_3 = var3_3.nuv();
                    this.u0f(var1_1, var3_3, this.es3);
                }
                var7_7 = var3_3.getY();
                block27: while (true) {
                    v9 = var7_7;
                    block28: while (v9 <= var3_3.getY() + 2) {
                        var8_8 = var7_7 - var3_3.getY();
                        var9_9 = 2 - var8_8;
                        v10 = var3_3.getX() - var9_9;
                        if (var4_4 != 0) break block38;
                        var10_10 = v10;
                        block29: while (true) {
                            v11 = var10_10;
                            v12 = var3_3.getX() + var9_9;
                            block30: while (v11 <= v12) {
                                var11_11 = var10_10 - var3_3.getX();
                                v9 = var3_3.getZ() - var9_9;
                                if (var4_4 != 0) continue block28;
                                var12_12 = v9;
                                while (var12_12 <= var3_3.getZ() + var9_9) {
                                    block42: {
                                        block43: {
                                            block40: {
                                                block41: {
                                                    block39: {
                                                        var13_13 = var12_12 - var3_3.getZ();
                                                        v11 = Math.abs(var11_11);
                                                        v12 = var9_9;
                                                        if (var4_4 != 0) continue block30;
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var4_4 != 0) break block39;
                                                                    if (v11 != v12) break block40;
                                                                }
                                                                catch (oov v13) {
                                                                    throw ahp.a(v13);
                                                                }
                                                                v14 = Math.abs(var13_13);
                                                                if (var4_4 != 0) break block41;
                                                            }
                                                            catch (oov v15) {
                                                                throw ahp.a(v15);
                                                            }
                                                            v16 = var9_9;
                                                        }
                                                        catch (oov v17) {
                                                            throw ahp.a(v17);
                                                        }
                                                    }
                                                    try {
                                                        if (v14 != v16) break block40;
                                                        v14 = var2_2.nextInt(2);
                                                    }
                                                    catch (oov v18) {
                                                        throw ahp.a(v18);
                                                    }
                                                }
                                                if (v14 == 0) break block43;
                                            }
                                            var14_14 = new mew(var10_10, var7_7, var12_12);
                                            try {
                                                try {
                                                    if (var4_4 != 0) break block42;
                                                    if (var1_1.getBlockState(var14_14).r_y().z4c()) break block43;
                                                }
                                                catch (oov v19) {
                                                    throw ahp.a(v19);
                                                }
                                                this.u0f(var1_1, var14_14, this.c6z);
                                            }
                                            catch (oov v20) {
                                                throw ahp.a(v20);
                                            }
                                        }
                                        ++var12_12;
                                    }
                                    if (var4_4 == 0) continue;
                                }
                                ++var10_10;
                                if (var4_4 == 0) continue block29;
                            }
                            break;
                        }
                        ++var7_7;
                        if (var4_4 == 0) continue block27;
                    }
                    break;
                }
            }
            v10 = 1;
        }
        return (boolean)v10;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

