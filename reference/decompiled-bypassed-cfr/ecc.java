/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ecc
extends cdu {
    private /* synthetic */ e0x kl8;
    private /* synthetic */ int fn7;

    public ecc(e0x e0x2, int n) {
        this.kl8 = e0x2;
        this.fn7 = n;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean v3g(t9d var1_1, Random var2_2, mew var3_3) {
        block18: {
            var4_4 = t9d.b();
            try {
                if (var1_1.getBlockState(var3_3).r_y().p1r() != p3y.six) {
                    return false;
                }
            }
            catch (oov v0) {
                throw ecc.a(v0);
            }
            var5_5 = var2_2.nextInt(this.fn7 - 2) + 2;
            var6_6 = 2;
            var7_7 = var3_3.getX() - var5_5;
            block12: while (true) {
                v1 = var7_7;
                v2 = var3_3.getX() + var5_5;
                block13: while (v1 <= v2) {
                    v3 = var3_3.getZ() - var5_5;
                    if (var4_4 == 0) break block18;
                    var8_8 = v3;
                    while (var8_8 <= var3_3.getZ() + var5_5) {
                        block19: {
                            block21: {
                                var9_9 = var7_7 - var3_3.getX();
                                var10_10 = var8_8 - var3_3.getZ();
                                try {
                                    if (var4_4 == 0) break block19;
                                    v1 = var9_9 * var9_9 + var10_10 * var10_10;
                                    v2 = var5_5 * var5_5;
                                    if (var4_4 == 0) continue block13;
                                }
                                catch (oov v4) {
                                    throw ecc.a(v4);
                                }
                                if (v1 > v2) break block21;
                                for (var11_11 = var3_3.getY() - var6_6; var11_11 <= var3_3.getY() + var6_6; ++var11_11) {
                                    block20: {
                                        var12_12 = new mew(var7_7, var11_11, var8_8);
                                        var13_13 = var1_1.getBlockState(var12_12).r_y();
                                        try {
                                            try {
                                                try {
                                                    if (var4_4 == 0) break block19;
                                                    v5 = var13_13;
                                                    if (var4_4 == 0) break block20;
                                                }
                                                catch (oov v6) {
                                                    throw ecc.a(v6);
                                                }
                                                if (v5 != ox_.kqk) {
                                                }
                                                ** GOTO lbl54
                                            }
                                            catch (oov v7) {
                                                throw ecc.a(v7);
                                            }
                                            v5 = var13_13;
                                        }
                                        catch (oov v8) {
                                            throw ecc.a(v8);
                                        }
                                    }
                                    try {
                                        if (v5 != ox_.l11) continue;
lbl54:
                                        // 2 sources

                                        var1_1.vct(var12_12, this.kl8.l4i(), 2);
                                        continue;
                                    }
                                    catch (oov v9) {
                                        throw ecc.a(v9);
                                    }
                                }
                            }
                            ++var8_8;
                        }
                        if (var4_4 != 0) continue;
                    }
                    ++var7_7;
                    if (var4_4 != 0) continue block12;
                }
                break;
            }
            v3 = 1;
        }
        return (boolean)v3;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

