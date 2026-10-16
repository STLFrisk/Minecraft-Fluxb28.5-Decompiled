/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ffi
extends cdu {
    private final zfz mqm;

    public ffi(rh2$j7i rh2$j7i) {
        this.mqm = ox_._w6.l4i().zvi(rh2.twm, (Comparable)((Object)rh2$j7i));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean v3g(t9d var1_1, Random var2_2, mew var3_3) {
        block18: {
            block16: {
                var4_4 = t9d.c();
                do {
                    if ((var5_5 = var1_1.getBlockState(var3_3).r_y()).p1r() == p3y.cei) ** GOTO lbl7
                    try {
                        try {
                            if (var5_5.p1r() != p3y.hh1) break;
lbl7:
                            // 2 sources

                            v0 = var3_3.getY();
                            if (var4_4 != 0) break block16;
                        }
                        catch (oov v1) {
                            throw ffi.a(v1);
                        }
                        if (v0 <= 0) break;
                    }
                    catch (oov v2) {
                        throw ffi.a(v2);
                    }
                    var3_3 = var3_3.eve();
                } while (var4_4 == 0);
                v0 = var6_6 = 0;
            }
            while (var6_6 < 128) {
                block17: {
                    block19: {
                        var7_7 = var3_3.ec4(var2_2.nextInt(8) - var2_2.nextInt(8), var2_2.nextInt(4) - var2_2.nextInt(4), var2_2.nextInt(8) - var2_2.nextInt(8));
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var4_4 != 0) break block17;
                                            v3 = var1_1.isAirBlock(var7_7);
                                            if (var4_4 != 0) break block18;
                                        }
                                        catch (oov v4) {
                                            throw ffi.a(v4);
                                        }
                                        if (!v3) break block19;
                                    }
                                    catch (oov v5) {
                                        throw ffi.a(v5);
                                    }
                                    v6 = ox_._w6._h0(var1_1, var7_7, this.mqm);
                                    if (var4_4 != 0) break block19;
                                }
                                catch (oov v7) {
                                    throw ffi.a(v7);
                                }
                                if (!v6) break block19;
                            }
                            catch (oov v8) {
                                throw ffi.a(v8);
                            }
                            v6 = var1_1.vct(var7_7, this.mqm, 2);
                        }
                        catch (oov v9) {
                            throw ffi.a(v9);
                        }
                    }
                    ++var6_6;
                }
                if (var4_4 == 0) continue;
            }
            v3 = true;
        }
        return v3;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

