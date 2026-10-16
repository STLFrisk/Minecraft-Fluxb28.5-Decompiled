/*
 * Decompiled with CFR 0.152.
 */
public class dge$ilj
extends bww {
    private float xqc;
    private int hi4;
    private dge _i6;
    private boolean qqx;

    public dge$ilj(dge dge2) {
        super(dge2);
        this._i6 = dge2;
    }

    public void c1a(float f, boolean bl) {
        this.xqc = f;
        this.qqx = bl;
    }

    public void eww(double d) {
        this.v1h = d;
        this.ilc = true;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nju() {
        block30: {
            block31: {
                block32: {
                    block35: {
                        block33: {
                            block34: {
                                block28: {
                                    this.o3a.q6c = this.o3a.x5k = this._58(this.o3a.x5k, this.xqc, 30.0f);
                                    this.o3a.ksw = this.o3a.x5k;
                                    var1_1 = t9d.b();
                                    try {
                                        try {
                                            block29: {
                                                try {
                                                    try {
                                                        v0 = this.ilc;
                                                        if (var1_1 == 0) break block28;
                                                        if (v0) break block29;
                                                    }
                                                    catch (oov v1) {
                                                        throw dge$ilj.b(v1);
                                                    }
                                                    this.o3a.x50(0.0f);
                                                    if (var1_1 != 0) break block30;
                                                }
                                                catch (oov v2) {
                                                    throw dge$ilj.b(v2);
                                                }
                                            }
                                            this.ilc = false;
                                            v3 = this.o3a;
                                            if (var1_1 == 0) break block31;
                                        }
                                        catch (oov v4) {
                                            throw dge$ilj.b(v4);
                                        }
                                        v0 = v3.lfk;
                                    }
                                    catch (oov v5) {
                                        throw dge$ilj.b(v5);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (v0) {
                                                        this.o3a.nak((float)(this.v1h * this.o3a.dgt(m6d.w7i).nz5()));
                                                        v6 = this;
                                                        if (var1_1 == 0) break block32;
                                                    }
                                                    ** GOTO lbl96
                                                }
                                                catch (oov v7) {
                                                    throw dge$ilj.b(v7);
                                                }
                                                if (v6.hi4-- <= 0) {
                                                }
                                                ** GOTO lbl86
                                            }
                                            catch (oov v8) {
                                                throw dge$ilj.b(v8);
                                            }
                                            this.hi4 = this._i6.usz();
                                            v9 = this.qqx;
                                            if (var1_1 == 0) break block33;
                                        }
                                        catch (oov v10) {
                                            throw dge$ilj.b(v10);
                                        }
                                        if (!v9) break block34;
                                    }
                                    catch (oov v11) {
                                        throw dge$ilj.b(v11);
                                    }
                                    this.hi4 /= 3;
                                }
                                catch (oov v12) {
                                    throw dge$ilj.b(v12);
                                }
                            }
                            try {
                                this._i6.wzk().nqf();
                                v13 = this._i6;
                                if (var1_1 == 0) break block35;
                                v9 = v13.nfr();
                            }
                            catch (oov v14) {
                                throw dge$ilj.b(v14);
                            }
                        }
                        try {
                            if (!v9) break block30;
                            v13 = this._i6;
                        }
                        catch (oov v15) {
                            throw dge$ilj.b(v15);
                        }
                    }
                    try {
                        v13.lhu(this._i6.u5x(), this._i6.o23(), ((this._i6.mbr().nextFloat() - this._i6.mbr().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                        if (var1_1 != 0) break block30;
lbl86:
                        // 2 sources

                        this._i6.ooc = 0.0f;
                        this._i6.z66 = 0.0f;
                        v6 = this;
                    }
                    catch (oov v16) {
                        throw dge$ilj.b(v16);
                    }
                }
                try {
                    v6.o3a.nak(0.0f);
                    if (var1_1 != 0) break block30;
lbl96:
                    // 2 sources

                    v3 = this.o3a;
                }
                catch (oov v17) {
                    throw dge$ilj.b(v17);
                }
            }
            v3.nak((float)(this.v1h * this.o3a.dgt(m6d.w7i).nz5()));
        }
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

