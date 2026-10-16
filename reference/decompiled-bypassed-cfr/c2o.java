/*
 * Decompiled with CFR 0.152.
 */
import net.optifine.CustomLoadingScreens;
import net.optifine.reflect.Reflector;

public class c2o
implements sw6 {
    private /* synthetic */ String dn3;
    private /* synthetic */ c05 rkc;
    private /* synthetic */ String pmt;
    private /* synthetic */ long zma;
    private /* synthetic */ boolean u4m;
    private /* synthetic */ eka c_2;
    private /* synthetic */ oru l40;

    public c2o(c05 c052) {
        this.dn3 = "";
        this.pmt = "";
        this.zma = c05.qgs();
        this.rkc = c052;
        this.c_2 = new eka(c052);
        this.l40 = new oru(c052.pfr, c052.ry7, false);
        this.l40.adf(9728);
    }

    @Override
    public void qph(String string) {
        this.u4m = false;
        this.apg(string);
    }

    @Override
    public void pg4(String string) {
        this.u4m = true;
        this.apg(string);
    }

    private void apg(String string) {
        block14: {
            block17: {
                block16: {
                    int n;
                    int n2;
                    block15: {
                        block12: {
                            block13: {
                                n2 = t9d.c();
                                try {
                                    try {
                                        try {
                                            this.pmt = string;
                                            n = this.rkc.yq1;
                                            if (n2 != 0) break block12;
                                            if (n != 0) break block13;
                                        }
                                        catch (oov oov2) {
                                            throw c2o.a(oov2);
                                        }
                                        if (this.u4m) break block14;
                                    }
                                    catch (oov oov3) {
                                        throw c2o.a(oov3);
                                    }
                                    throw new pkl();
                                }
                                catch (oov oov4) {
                                    throw c2o.a(oov4);
                                }
                            }
                            hzu.yg5(256);
                            hzu.ah8(5889);
                            hzu.zwy();
                            n = gis.gu5();
                        }
                        try {
                            try {
                                if (n2 != 0) break block15;
                                if (n == 0) break block16;
                            }
                            catch (oov oov5) {
                                throw c2o.a(oov5);
                            }
                            n = this.c_2._0s();
                        }
                        catch (oov oov6) {
                            throw c2o.a(oov6);
                        }
                    }
                    int n3 = n;
                    hzu.bj8(0.0, this.c_2.x05() * n3, this.c_2.lrx() * n3, 0.0, 100.0, 300.0);
                    if (n2 == 0) break block17;
                }
                eka eka2 = new eka(this.rkc);
                hzu.bj8(0.0, eka2.z6w(), eka2.tql(), 0.0, 100.0, 300.0);
            }
            hzu.ah8(5888);
            hzu.zwy();
            hzu.a4k(0.0f, 0.0f, -200.0f);
        }
    }

    @Override
    public void an6(String string) {
        block8: {
            block6: {
                c2o c2o2;
                block7: {
                    int n = t9d.c();
                    try {
                        try {
                            try {
                                c2o2 = this;
                                if (n != 0) break block6;
                                if (c2o2.rkc.yq1) break block7;
                            }
                            catch (oov oov2) {
                                throw c2o.a(oov2);
                            }
                            if (this.u4m) break block8;
                        }
                        catch (oov oov3) {
                            throw c2o.a(oov3);
                        }
                        throw new pkl();
                    }
                    catch (oov oov4) {
                        throw c2o.a(oov4);
                    }
                }
                this.zma = 0L;
                this.dn3 = string;
                this.e2w(-1);
                c2o2 = this;
            }
            c2o2.zma = 0L;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void e2w(int var1_1) {
        block46: {
            block56: {
                block57: {
                    block59: {
                        block58: {
                            block66: {
                                block67: {
                                    block51: {
                                        block52: {
                                            block54: {
                                                block55: {
                                                    block53: {
                                                        block49: {
                                                            block50: {
                                                                block48: {
                                                                    block47: {
                                                                        block63: {
                                                                            block61: {
                                                                                block45: {
                                                                                    block44: {
                                                                                        var2_2 = t9d.b();
                                                                                        v0 = this.rkc.yq1;
                                                                                        if (var2_2 == 0) break block44;
                                                                                        try {
                                                                                            block60: {
                                                                                                if (v0) break block45;
                                                                                                break block60;
                                                                                                catch (Exception v1) {
                                                                                                    throw c2o.a(v1);
                                                                                                }
                                                                                            }
                                                                                            v0 = this.u4m;
                                                                                        }
                                                                                        catch (Exception v2) {
                                                                                            throw c2o.a(v2);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        if (!v0) {
                                                                                            throw new pkl();
                                                                                        }
                                                                                        break block46;
                                                                                    }
                                                                                    catch (Exception v3) {
                                                                                        throw c2o.a(v3);
                                                                                    }
                                                                                }
                                                                                var3_3 = c05.qgs();
                                                                                if (var2_2 == 0) break block61;
                                                                                try {
                                                                                    block62: {
                                                                                        if (var3_3 - this.zma < 100L) break block46;
                                                                                        break block62;
                                                                                        catch (Exception v4) {
                                                                                            throw c2o.a(v4);
                                                                                        }
                                                                                    }
                                                                                    this.zma = var3_3;
                                                                                }
                                                                                catch (Exception v5) {
                                                                                    throw c2o.a(v5);
                                                                                }
                                                                            }
                                                                            var5_4 = new eka(this.rkc);
                                                                            var6_5 = var5_4._0s();
                                                                            var7_6 = var5_4.x05();
                                                                            var8_7 = var5_4.lrx();
                                                                            v6 = gis.gu5();
                                                                            if (var2_2 == 0) break block47;
                                                                            if (v6 == 0) ** GOTO lbl56
                                                                            break block63;
                                                                            catch (Exception v7) {
                                                                                throw c2o.a(v7);
                                                                            }
                                                                        }
                                                                        try {
                                                                            block64: {
                                                                                this.l40.xix();
                                                                                if (var2_2 != 0) break block48;
                                                                                break block64;
                                                                                catch (Exception v8) {
                                                                                    throw c2o.a(v8);
                                                                                }
                                                                            }
                                                                            v6 = 256;
                                                                        }
                                                                        catch (Exception v9) {
                                                                            throw c2o.a(v9);
                                                                        }
                                                                    }
                                                                    hzu.yg5(v6);
                                                                }
                                                                this.l40.mou(false);
                                                                hzu.ah8(5889);
                                                                hzu.zwy();
                                                                hzu.bj8(0.0, var5_4.z6w(), var5_4.tql(), 0.0, 100.0, 300.0);
                                                                hzu.ah8(5888);
                                                                hzu.zwy();
                                                                hzu.a4k(0.0f, 0.0f, -200.0f);
                                                                v10 = gis.gu5();
                                                                if (var2_2 == 0) break block49;
                                                                try {
                                                                    block65: {
                                                                        if (v10) break block50;
                                                                        break block65;
                                                                        catch (Exception v11) {
                                                                            throw c2o.a(v11);
                                                                        }
                                                                    }
                                                                    hzu.yg5(16640);
                                                                }
                                                                catch (Exception v12) {
                                                                    throw c2o.a(v12);
                                                                }
                                                            }
                                                            v10 = true;
                                                        }
                                                        var9_8 = v10;
                                                        try {
                                                            v13 = Reflector.FMLClientHandler_handleLoadingScreen.exists();
                                                            if (var2_2 == 0) break block51;
                                                            if (!v13) break block52;
                                                        }
                                                        catch (Exception v14) {
                                                            throw c2o.a(v14);
                                                        }
                                                        var10_9 = Reflector.call(Reflector.FMLClientHandler_instance, new Object[0]);
                                                        try {
                                                            v15 = var10_9;
                                                            if (var2_2 == 0) break block53;
                                                            if (v15 == null) break block52;
                                                        }
                                                        catch (Exception v16) {
                                                            throw c2o.a(v16);
                                                        }
                                                        v15 = var10_9;
                                                    }
                                                    try {
                                                        v17 = Reflector.callBoolean(v15, Reflector.FMLClientHandler_handleLoadingScreen, new Object[]{var5_4});
                                                        if (var2_2 == 0) break block54;
                                                        if (v17) break block55;
                                                    }
                                                    catch (Exception v18) {
                                                        throw c2o.a(v18);
                                                    }
                                                    v17 = true;
                                                    break block54;
                                                }
                                                v17 = false;
                                            }
                                            var9_8 = v17;
                                        }
                                        v13 = var9_8;
                                    }
                                    try {
                                        if (var2_2 == 0) break block56;
                                        if (!v13) break block57;
                                    }
                                    catch (Exception v19) {
                                        throw c2o.a(v19);
                                    }
                                    var10_9 = jom.yut();
                                    var11_11 = var10_9.zuq();
                                    var12_12 = CustomLoadingScreens.getCustomLoadingScreen();
                                    if (var2_2 == 0) break block66;
                                    if (var12_12 == null) ** GOTO lbl145
                                    break block67;
                                    catch (Exception v20) {
                                        throw c2o.a(v20);
                                    }
                                }
                                try {
                                    block68: {
                                        var12_12.drawBackground(var5_4.x05(), var5_4.lrx());
                                        if (var2_2 != 0) break block58;
                                        break block68;
                                        catch (Exception v21) {
                                            throw c2o.a(v21);
                                        }
                                    }
                                    this.rkc.l22().anl(b0t.yby);
                                }
                                catch (Exception v22) {
                                    throw c2o.a(v22);
                                }
                            }
                            var13_13 = 32.0f;
                            var11_11.ezr(7, gnl.rad);
                            var11_11.g5o(0.0, var8_7, 0.0).h0a(0.0, (float)var8_7 / var13_13).fje(64, 64, 64, 255).pzw();
                            var11_11.g5o(var7_6, var8_7, 0.0).h0a((float)var7_6 / var13_13, (float)var8_7 / var13_13).fje(64, 64, 64, 255).pzw();
                            var11_11.g5o(var7_6, 0.0, 0.0).h0a((float)var7_6 / var13_13, 0.0).fje(64, 64, 64, 255).pzw();
                            var11_11.g5o(0.0, 0.0, 0.0).h0a(0.0, 0.0).fje(64, 64, 64, 255).pzw();
                            var10_9.q7g();
                        }
                        try {
                            v23 = var1_1;
                            if (var2_2 == 0) break block57;
                            if (v23 < 0) break block59;
                        }
                        catch (Exception v24) {
                            throw c2o.a(v24);
                        }
                        var13_14 = 100;
                        var14_15 = 2;
                        var15_16 = var7_6 / 2 - var13_14 / 2;
                        var16_17 = var8_7 / 2 + 16;
                        hzu.m_1();
                        var11_11.ezr(7, gnl.gec);
                        var11_11.g5o(var15_16, var16_17, 0.0).fje(128, 128, 128, 255).pzw();
                        var11_11.g5o(var15_16, var16_17 + var14_15, 0.0).fje(128, 128, 128, 255).pzw();
                        var11_11.g5o(var15_16 + var13_14, var16_17 + var14_15, 0.0).fje(128, 128, 128, 255).pzw();
                        var11_11.g5o(var15_16 + var13_14, var16_17, 0.0).fje(128, 128, 128, 255).pzw();
                        var11_11.g5o(var15_16, var16_17, 0.0).fje(128, 255, 128, 255).pzw();
                        var11_11.g5o(var15_16, var16_17 + var14_15, 0.0).fje(128, 255, 128, 255).pzw();
                        var11_11.g5o(var15_16 + var1_1, var16_17 + var14_15, 0.0).fje(128, 255, 128, 255).pzw();
                        var11_11.g5o(var15_16 + var1_1, var16_17, 0.0).fje(128, 255, 128, 255).pzw();
                        var10_9.q7g();
                        hzu.rqj();
                    }
                    hzu.spd();
                    hzu.u39(770, 771, 1, 0);
                    this.rkc.tx1.km1(this.pmt, (var7_6 - this.rkc.tx1.ezt(this.pmt)) / 2, var8_7 / 2 - 4 - 16, 0xFFFFFF);
                    v23 = this.rkc.tx1.km1(this.dn3, (var7_6 - this.rkc.tx1.ezt(this.dn3)) / 2, var8_7 / 2 - 4 + 8, 0xFFFFFF);
                }
                try {
                    this.l40._zc();
                    if (var2_2 == 0) break block46;
                    v13 = gis.gu5();
                }
                catch (Exception v25) {
                    throw c2o.a(v25);
                }
            }
            try {
                if (v13) {
                    this.l40.ytj(var7_6 * var6_5, var8_7 * var6_5);
                }
            }
            catch (Exception v26) {
                throw c2o.a(v26);
            }
            this.rkc.i0a();
            try {
                Thread.yield();
            }
            catch (Exception var10_10) {
                // empty catch block
            }
        }
    }

    @Override
    public void ij4() {
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

