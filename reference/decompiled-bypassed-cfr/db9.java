/*
 * Decompiled with CFR 0.152.
 */
public class db9
extends i2h {
    private /* synthetic */ double ik7;
    private /* synthetic */ double e67;
    private /* synthetic */ double dy6;
    private /* synthetic */ int _9v;
    private /* synthetic */ boolean _mn;

    public db9(t9d t9d2) {
        super(t9d2);
        this.yxc(0.25f, 0.25f);
    }

    @Override
    public void tbj() {
    }

    @Override
    public boolean xvv(double d) {
        boolean bl;
        block6: {
            block7: {
                int n;
                block4: {
                    double d2;
                    double d3;
                    block5: {
                        n = t9d.b();
                        d3 = this.aaw().liq() * 4.0;
                        try {
                            bl = Double.isNaN(d3);
                            if (n == 0) break block4;
                            if (!bl) break block5;
                        }
                        catch (oov oov2) {
                            throw db9.a(oov2);
                        }
                        d3 = 4.0;
                    }
                    bl = (d2 = d - (d3 *= 64.0) * d3) == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
                }
                try {
                    if (n == 0) break block6;
                    if (bl >= false) break block7;
                }
                catch (oov oov3) {
                    throw db9.a(oov3);
                }
                bl = true;
                break block6;
            }
            bl = false;
        }
        return bl;
    }

    public db9(t9d t9d2, double d, double d2, double d3) {
        super(t9d2);
        this._9v = 0;
        this.yxc(0.25f, 0.25f);
        this.m6_(d, d2, d3);
    }

    public void s00(mew mew2) {
        int n;
        block11: {
            block12: {
                int n2;
                block10: {
                    double d;
                    block8: {
                        double d2 = mew2.getX();
                        int n3 = mew2.getY();
                        n2 = t9d.c();
                        d = mew2.getZ();
                        double d3 = d2 - this.o2v;
                        double d4 = d - this.vbd;
                        float f = fe6.dii(d3 * d3 + d4 * d4);
                        try {
                            block9: {
                                try {
                                    try {
                                        if (n2 != 0) break block8;
                                        if (!(f > 12.0f)) break block9;
                                    }
                                    catch (oov oov2) {
                                        throw db9.a(oov2);
                                    }
                                    this.ik7 = this.o2v + d3 / (double)f * 12.0;
                                    this.dy6 = this.vbd + d4 / (double)f * 12.0;
                                    this.e67 = this.kfp + 8.0;
                                    if (n2 == 0) break block10;
                                }
                                catch (oov oov3) {
                                    throw db9.a(oov3);
                                }
                            }
                            this.ik7 = d2;
                            this.e67 = n3;
                        }
                        catch (oov oov4) {
                            throw db9.a(oov4);
                        }
                    }
                    this.dy6 = d;
                }
                try {
                    this._9v = 0;
                    db9 db92 = this;
                    n = this.z2d.nextInt(5);
                    if (n2 != 0) break block11;
                    if (n <= 0) break block12;
                }
                catch (oov oov5) {
                    throw db9.a(oov5);
                }
                n = 1;
                break block11;
            }
            n = 0;
        }
        db92._mn = n;
    }

    @Override
    public void lmm(double d, double d2, double d3) {
        block9: {
            float f;
            block10: {
                float f2;
                block8: {
                    this.icv = d;
                    this.mop = d2;
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                this.bw4 = d3;
                                float f3 = this.j25 - 0.0f;
                                f2 = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                                if (n != 0) break block8;
                                if (f2 != false) break block9;
                            }
                            catch (oov oov2) {
                                throw db9.a(oov2);
                            }
                            f = this.p3h;
                            if (n != 0) break block10;
                        }
                        catch (oov oov3) {
                            throw db9.a(oov3);
                        }
                        float f4 = f - 0.0f;
                        f2 = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                    }
                    catch (oov oov4) {
                        throw db9.a(oov4);
                    }
                }
                try {
                    if (f2 != false) break block9;
                    f = fe6.dii(d * d + d3 * d3);
                }
                catch (oov oov5) {
                    throw db9.a(oov5);
                }
            }
            float f5 = f;
            this.p3h = this.x5k = (float)(fe6.yr8(d, d3) * 180.0 / Math.PI);
            this.j25 = this.y2i = (float)(fe6.yr8(d2, f5) * 180.0 / Math.PI);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void xx_() {
        block72: {
            block75: {
                block74: {
                    block73: {
                        block71: {
                            block70: {
                                block69: {
                                    block64: {
                                        block67: {
                                            block65: {
                                                block66: {
                                                    block63: {
                                                        block61: {
                                                            block60: {
                                                                block59: {
                                                                    this.ivp = this.o2v;
                                                                    this.c54 = this.kfp;
                                                                    this.e2b = this.vbd;
                                                                    super.xx_();
                                                                    this.o2v += this.icv;
                                                                    this.kfp += this.mop;
                                                                    this.vbd += this.bw4;
                                                                    var1_1 = t9d.c();
                                                                    var2_2 = fe6.dii(this.icv * this.icv + this.bw4 * this.bw4);
                                                                    this.x5k = (float)(fe6.yr8(this.icv, this.bw4) * 180.0 / 3.141592653589793);
                                                                    this.y2i = (float)(fe6.yr8(this.mop, var2_2) * 180.0 / 3.141592653589793);
                                                                    while (this.y2i - this.j25 < -180.0f) {
                                                                        try {
                                                                            this.j25 -= 360.0f;
                                                                            if (var1_1 == 0) {
                                                                                if (var1_1 == 0) continue;
                                                                                break;
                                                                            }
                                                                            break block59;
                                                                        }
                                                                        catch (oov v0) {
                                                                            throw db9.a(v0);
                                                                        }
                                                                    }
                                                                    while (this.y2i - this.j25 >= 180.0f) {
                                                                        try {
                                                                            this.j25 += 360.0f;
                                                                            if (var1_1 == 0) {
                                                                                if (var1_1 == 0) continue;
                                                                                break;
                                                                            }
                                                                            break block60;
                                                                        }
                                                                        catch (oov v1) {
                                                                            throw db9.a(v1);
                                                                        }
                                                                    }
                                                                }
                                                                try {
                                                                    do {
                                                                        try {
                                                                            if (!(this.x5k - this.p3h < -180.0f)) break;
                                                                            this.p3h -= 360.0f;
                                                                            if (var1_1 == 0) {
                                                                                continue;
                                                                            }
                                                                            break block61;
                                                                        }
                                                                        catch (oov v2) {
                                                                            throw db9.a(v2);
                                                                        }
                                                                    } while (var1_1 == 0);
                                                                }
                                                                catch (oov v3) {
                                                                    throw db9.a(v3);
                                                                }
                                                            }
                                                            try {
                                                                do {
                                                                    try {
                                                                        if (!(this.x5k - this.p3h >= 180.0f)) break;
                                                                        this.p3h += 360.0f;
                                                                        if (var1_1 == 0) {
                                                                            continue;
                                                                        }
                                                                        break block61;
                                                                    }
                                                                    catch (oov v4) {
                                                                        throw db9.a(v4);
                                                                    }
                                                                } while (var1_1 == 0);
                                                            }
                                                            catch (oov v5) {
                                                                throw db9.a(v5);
                                                            }
                                                            this.y2i = this.j25 + (this.y2i - this.j25) * 0.2f;
                                                            this.x5k = this.p3h + (this.x5k - this.p3h) * 0.2f;
                                                        }
                                                        try {
                                                            try {
                                                                v6 = this;
                                                                if (var1_1 != 0) break block63;
                                                                if (v6.oay.v0f) break block64;
                                                            }
                                                            catch (oov v7) {
                                                                throw db9.a(v7);
                                                            }
                                                            v6 = this;
                                                        }
                                                        catch (oov v8) {
                                                            throw db9.a(v8);
                                                        }
                                                    }
                                                    var3_3 = v6.ik7 - this.o2v;
                                                    var5_5 = this.dy6 - this.vbd;
                                                    var7_6 = (float)Math.sqrt(var3_3 * var3_3 + var5_5 * var5_5);
                                                    var8_7 = (float)fe6.yr8(var5_5, var3_3);
                                                    var9_8 = (double)var2_2 + (double)(var7_6 - var2_2) * 0.0025;
                                                    try {
                                                        cfr_temp_0 = var7_6 - 1.0f;
                                                        v9 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                        if (var1_1 != 0) break block65;
                                                        if (v9 >= 0) break block66;
                                                    }
                                                    catch (oov v10) {
                                                        throw db9.a(v10);
                                                    }
                                                    var9_8 *= 0.8;
                                                    this.mop *= 0.8;
                                                }
                                                try {
                                                    this.icv = Math.cos(var8_7) * var9_8;
                                                    this.bw4 = Math.sin(var8_7) * var9_8;
                                                    v11 = this;
                                                    if (var1_1 != 0) break block67;
                                                    cfr_temp_1 = v11.kfp - this.e67;
                                                    v9 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                }
                                                catch (oov v12) {
                                                    throw db9.a(v12);
                                                }
                                            }
                                            try {
                                                block68: {
                                                    try {
                                                        if (v9 >= 0) break block68;
                                                        this.mop += (1.0 - this.mop) * 0.014999999664723873;
                                                        if (var1_1 == 0) break block64;
                                                    }
                                                    catch (oov v13) {
                                                        throw db9.a(v13);
                                                    }
                                                }
                                                v11 = this;
                                            }
                                            catch (oov v14) {
                                                throw db9.a(v14);
                                            }
                                        }
                                        v11.mop += (-1.0 - this.mop) * 0.014999999664723873;
                                    }
                                    var3_4 = 0.25f;
                                    try {
                                        v15 = this;
                                        if (var1_1 != 0) break block69;
                                        if (v15.mwv()) {
                                        }
                                        ** GOTO lbl149
                                    }
                                    catch (oov v16) {
                                        throw db9.a(v16);
                                    }
                                    for (var4_9 = 0; var4_9 < 4; ++var4_9) {
                                        try {
                                            this.oay.zvy(w_0.w_h, this.o2v - this.icv * (double)var3_4, this.kfp - this.mop * (double)var3_4, this.vbd - this.bw4 * (double)var3_4, this.icv, this.mop, this.bw4, new int[0]);
                                            if (var1_1 == 0) {
                                                if (var1_1 == 0) continue;
                                                break;
                                            }
                                            break block70;
                                        }
                                        catch (oov v17) {
                                            throw db9.a(v17);
                                        }
                                    }
                                    try {
                                        if (var1_1 == 0) break block70;
lbl149:
                                        // 2 sources

                                        v15 = this;
                                    }
                                    catch (oov v18) {
                                        throw db9.a(v18);
                                    }
                                }
                                v15.oay.zvy(w_0.t9k, this.o2v - this.icv * (double)var3_4 + this.z2d.nextDouble() * 0.6 - 0.3, this.kfp - this.mop * (double)var3_4 - 0.5, this.vbd - this.bw4 * (double)var3_4 + this.z2d.nextDouble() * 0.6 - 0.3, this.icv, this.mop, this.bw4, new int[0]);
                            }
                            try {
                                try {
                                    v19 = this.oay.v0f;
                                    if (var1_1 != 0) break block71;
                                    if (v19 != 0) break block72;
                                }
                                catch (oov v20) {
                                    throw db9.a(v20);
                                }
                                this.m6_(this.o2v, this.kfp, this.vbd);
                                v19 = ++this._9v;
                            }
                            catch (oov v21) {
                                throw db9.a(v21);
                            }
                        }
                        try {
                            try {
                                if (var1_1 != 0) break block73;
                                if (v19 <= 80) break block72;
                            }
                            catch (oov v22) {
                                throw db9.a(v22);
                            }
                            v19 = (int)this.oay.v0f;
                        }
                        catch (oov v23) {
                            throw db9.a(v23);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var1_1 != 0) break block74;
                                if (v19 != 0) break block72;
                            }
                            catch (oov v24) {
                                throw db9.a(v24);
                            }
                            this._kl();
                            v25 = this;
                            if (var1_1 != 0) break block75;
                        }
                        catch (oov v26) {
                            throw db9.a(v26);
                        }
                        v19 = (int)v25._mn;
                    }
                    catch (oov v27) {
                        throw db9.a(v27);
                    }
                }
                try {
                    block76: {
                        try {
                            if (v19 == 0) break block76;
                            this.oay.xzq(new nvf(this.oay, this.o2v, this.kfp, this.vbd, new erg(xbr.rr5)));
                            if (var1_1 == 0) break block72;
                        }
                        catch (oov v28) {
                            throw db9.a(v28);
                        }
                    }
                    v25 = this;
                }
                catch (oov v29) {
                    throw db9.a(v29);
                }
            }
            v25.oay.qca(2003, new mew(this), 0);
        }
    }

    @Override
    public void srs(bdo bdo2) {
    }

    @Override
    public void cjb(bdo bdo2) {
    }

    @Override
    public float xeu(float f) {
        return 1.0f;
    }

    @Override
    public int azk(float f) {
        return 0xF000F0;
    }

    @Override
    public boolean qvl() {
        return false;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

