/*
 * Decompiled with CFR 0.152.
 */
public class c9p$tyn
extends bww {
    private c9p spi;

    public c9p$tyn(c9p c9p2) {
        super(c9p2);
        this.spi = c9p2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void nju() {
        block16: {
            block13: {
                block12: {
                    block14: {
                        block15: {
                            var1_1 = t9d.c();
                            try {
                                try {
                                    try {
                                        v0 = this;
                                        if (var1_1 != 0) break block12;
                                        if (v0.ilc) {
                                        }
                                        ** GOTO lbl73
                                    }
                                    catch (oov v1) {
                                        throw c9p$tyn.b(v1);
                                    }
                                    v2 = this.spi;
                                    if (var1_1 != 0) break block13;
                                }
                                catch (oov v3) {
                                    throw c9p$tyn.b(v3);
                                }
                                if (!v2.zq2().j07()) {
                                }
                                ** GOTO lbl73
                            }
                            catch (oov v4) {
                                throw c9p$tyn.b(v4);
                            }
                            var2_2 = this.c8c - this.spi.o2v;
                            var4_3 = this.ki4 - this.spi.kfp;
                            var6_4 = this.mkj - this.spi.vbd;
                            var8_5 = var2_2 * var2_2 + var4_3 * var4_3 + var6_4 * var6_4;
                            var8_5 = fe6.dii(var8_5);
                            var4_3 /= var8_5;
                            var10_6 = (float)(fe6.yr8(var6_4, var2_2) * 180.0 / 3.141592653589793) - 90.0f;
                            this.spi.ksw = this.spi.x5k = this._58(this.spi.x5k, var10_6, 30.0f);
                            var11_7 = (float)(this.v1h * this.spi.dgt(m6d.w7i).nz5());
                            this.spi.nak(this.spi.ldh() + (var11_7 - this.spi.ldh()) * 0.125f);
                            var12_8 = Math.sin((double)(this.spi.g25 + this.spi.jwu()) * 0.5) * 0.05;
                            var14_9 = Math.cos(this.spi.x5k * 3.1415927f / 180.0f);
                            var16_10 = Math.sin(this.spi.x5k * 3.1415927f / 180.0f);
                            this.spi.icv += var12_8 * var14_9;
                            this.spi.bw4 += var12_8 * var16_10;
                            var12_8 = Math.sin((double)(this.spi.g25 + this.spi.jwu()) * 0.75) * 0.05;
                            this.spi.mop += var12_8 * (var16_10 + var14_9) * 0.25;
                            this.spi.mop += (double)this.spi.ldh() * var4_3 * 0.1;
                            var18_11 = this.spi.ph8();
                            var19_12 = this.spi.o2v + var2_2 / var8_5 * 2.0;
                            var21_13 = (double)this.spi.c5y() + this.spi.kfp + var4_3 / var8_5 * 1.0;
                            var23_14 = this.spi.vbd + var6_4 / var8_5 * 2.0;
                            var25_15 = var18_11.msd();
                            var27_16 = var18_11.kyo();
                            var29_17 = var18_11.bgx();
                            try {
                                v5 = var18_11;
                                if (var1_1 != 0) break block14;
                                if (v5.hsq()) break block15;
                            }
                            catch (oov v6) {
                                throw c9p$tyn.b(v6);
                            }
                            var25_15 = var19_12;
                            var27_16 = var21_13;
                            var29_17 = var23_14;
                        }
                        v5 = this.spi.ph8();
                    }
                    try {
                        v5.c2i(var25_15 + (var19_12 - var25_15) * 0.125, var27_16 + (var21_13 - var27_16) * 0.125, var29_17 + (var23_14 - var29_17) * 0.125, 10.0f, 40.0f);
                        c9p.leu(this.spi, true);
                        if (var1_1 == 0) break block16;
lbl73:
                        // 3 sources

                        this.spi.nak(0.0f);
                        v0 = this;
                    }
                    catch (oov v7) {
                        throw c9p$tyn.b(v7);
                    }
                }
                v2 = v0.spi;
            }
            c9p.leu(v2, false);
        }
    }

    private static oov b(oov oov2) {
        return oov2;
    }
}

