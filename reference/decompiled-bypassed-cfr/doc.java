/*
 * Decompiled with CFR 0.152.
 */
public class doc
extends u10 {
    public doc(t9d t9d2) {
        super(t9d2);
        this.yxc(0.7f, 0.5f);
    }

    @Override
    public void nyy() {
        super.nyy();
        this.dgt(m6d.t9k).zf7(12.0);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean _nm(i2h var1_1) {
        block16: {
            block17: {
                block18: {
                    block19: {
                        block21: {
                            block20: {
                                var2_2 = t9d.b();
                                try {
                                    try {
                                        try {
                                            v0 = super._nm(var1_1);
                                            if (var2_2 == 0) break block16;
                                            if (!v0) break block17;
                                        }
                                        catch (oov v1) {
                                            throw doc.a(v1);
                                        }
                                        v2 = var1_1 instanceof g_3;
                                        if (var2_2 == 0) break block18;
                                    }
                                    catch (oov v3) {
                                        throw doc.a(v3);
                                    }
                                    if (v2 == 0) break block19;
                                }
                                catch (oov v4) {
                                    throw doc.a(v4);
                                }
                                var3_3 = 0;
                                try {
                                    v5 = this.oay.rbk();
                                    v6 = v66.b_4;
                                    if (var2_2 == 0) break block20;
                                    if (v5 == v6) {
                                    }
                                    ** GOTO lbl33
                                }
                                catch (oov v7) {
                                    throw doc.a(v7);
                                }
                                var3_3 = 7;
                                try {
                                    if (var2_2 != 0) break block21;
lbl33:
                                    // 2 sources

                                    v5 = this.oay.rbk();
                                    v6 = v66.csg;
                                }
                                catch (oov v8) {
                                    throw doc.a(v8);
                                }
                            }
                            if (v5 == v6) {
                                var3_3 = 15;
                            }
                        }
                        try {
                            try {
                                v2 = var3_3;
                                if (var2_2 == 0) break block18;
                                if (v2 <= 0) break block19;
                            }
                            catch (oov v9) {
                                throw doc.a(v9);
                            }
                            ((g_3)var1_1).gmn(new sdj(mcs.veq.zr9, var3_3 * 20, 0));
                        }
                        catch (oov v10) {
                            throw doc.a(v10);
                        }
                    }
                    v2 = 1;
                }
                return (boolean)v2;
            }
            v0 = false;
        }
        return v0;
    }

    @Override
    public ps6 hx8(css css2, ps6 ps62) {
        return ps62;
    }

    @Override
    public float c5y() {
        return 0.45f;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

