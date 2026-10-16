/*
 * Decompiled with CFR 0.152.
 */
public class d9m
extends _jc {
    private /* synthetic */ rsi _be;

    public d9m(rsi rsi2, rsi rsi3) {
        int n;
        int n2;
        block13: {
            int n3;
            int n4;
            block11: {
                int n5;
                this._be = rsi3;
                n2 = 0;
                n = t9d.c();
                while (n2 < 3) {
                    block12: {
                        n5 = 0;
                        if (n != 0) break block11;
                        for (n4 = v1045569; n4 < 3; ++n4) {
                            try {
                                this.zmp(new vrx(rsi3, n4 + n2 * 3, 62 + n4 * 18, 17 + n2 * 18));
                                if (n == 0) {
                                    if (n == 0) continue;
                                    break;
                                }
                                break block12;
                            }
                            catch (oov oov2) {
                                throw d9m.a(oov2);
                            }
                        }
                        ++n2;
                    }
                    if (n == 0) continue;
                }
                n5 = n2 = 0;
            }
            while (n2 < 3) {
                block14: {
                    n3 = 0;
                    if (n != 0) break block13;
                    for (n4 = v1045602; n4 < 9; ++n4) {
                        try {
                            this.zmp(new vrx(rsi2, n4 + n2 * 9 + 9, 8 + n4 * 18, 84 + n2 * 18));
                            if (n == 0) {
                                if (n == 0) continue;
                                break;
                            }
                            break block14;
                        }
                        catch (oov oov3) {
                            throw d9m.a(oov3);
                        }
                    }
                    ++n2;
                }
                if (n == 0) continue;
            }
            n3 = n2 = 0;
        }
        while (n2 < 9) {
            this.zmp(new vrx(rsi2, n2, 8 + n2 * 18, 142));
            ++n2;
            if (n == 0) continue;
        }
    }

    @Override
    public boolean spj(ha9 ha92) {
        return this._be.dnv(ha92);
    }

    @Override
    public erg za4(ha9 ha92, int n) {
        erg erg2;
        block26: {
            erg erg3;
            vrx vrx2;
            block33: {
                int n2;
                int n3;
                block30: {
                    block31: {
                        block28: {
                            block29: {
                                vrx vrx3;
                                block27: {
                                    block25: {
                                        erg2 = null;
                                        vrx2 = (vrx)this.wjd.get(n);
                                        n3 = t9d.b();
                                        try {
                                            vrx3 = vrx2;
                                            if (n3 == 0) break block25;
                                            if (vrx3 == null) break block26;
                                        }
                                        catch (oov oov2) {
                                            throw d9m.a(oov2);
                                        }
                                        vrx3 = vrx2;
                                    }
                                    try {
                                        try {
                                            if (n3 == 0) break block27;
                                            if (!vrx3.hf8()) break block26;
                                        }
                                        catch (oov oov3) {
                                            throw d9m.a(oov3);
                                        }
                                        vrx3 = vrx2;
                                    }
                                    catch (oov oov4) {
                                        throw d9m.a(oov4);
                                    }
                                }
                                erg3 = vrx3.x4s();
                                erg2 = erg3.yaq();
                                try {
                                    try {
                                        try {
                                            try {
                                                n2 = n;
                                                if (n3 == 0) break block28;
                                                if (n2 >= 9) break block29;
                                            }
                                            catch (oov oov5) {
                                                throw d9m.a(oov5);
                                            }
                                            n2 = this.ghh(erg3, 9, 45, true) ? 1 : 0;
                                            if (n3 == 0) break block30;
                                        }
                                        catch (oov oov6) {
                                            throw d9m.a(oov6);
                                        }
                                        if (n2 != 0) break block31;
                                    }
                                    catch (oov oov7) {
                                        throw d9m.a(oov7);
                                    }
                                    return null;
                                }
                                catch (oov oov8) {
                                    throw d9m.a(oov8);
                                }
                            }
                            n2 = this.ghh(erg3, 0, 9, false) ? 1 : 0;
                        }
                        try {
                            try {
                                if (n3 == 0) break block30;
                                if (n2 != 0) break block31;
                            }
                            catch (oov oov9) {
                                throw d9m.a(oov9);
                            }
                            return null;
                        }
                        catch (oov oov10) {
                            throw d9m.a(oov10);
                        }
                    }
                    n2 = erg3.qd2;
                }
                try {
                    block32: {
                        try {
                            if (n2 != 0) break block32;
                            vrx2.yn7(null);
                            if (n3 != 0) break block33;
                        }
                        catch (oov oov11) {
                            throw d9m.a(oov11);
                        }
                    }
                    vrx2.vc1();
                }
                catch (oov oov12) {
                    throw d9m.a(oov12);
                }
            }
            try {
                if (erg3.qd2 == erg2.qd2) {
                    return null;
                }
            }
            catch (oov oov13) {
                throw d9m.a(oov13);
            }
            vrx2.g1d(ha92, erg3);
        }
        return erg2;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

