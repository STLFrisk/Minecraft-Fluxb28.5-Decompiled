/*
 * Decompiled with CFR 0.152.
 */
public class cw9
extends u7m {
    public cw9() {
        this.qfy(uja.qqf);
    }

    @Override
    public boolean ghw(erg erg2, ha9 ha92, t9d t9d2, mew mew2, vt2 vt22, float f, float f2, float f3) {
        boolean bl;
        block45: {
            block46: {
                boolean bl2;
                block53: {
                    block54: {
                        boolean bl3;
                        block55: {
                            block56: {
                                boolean bl4;
                                boolean bl5;
                                mew mew3;
                                vt2 vt23;
                                int n;
                                block50: {
                                    block52: {
                                        block51: {
                                            boolean bl6;
                                            boolean bl7;
                                            block47: {
                                                block49: {
                                                    block48: {
                                                        boolean bl8;
                                                        boolean bl9;
                                                        block43: {
                                                            block44: {
                                                                block42: {
                                                                    boolean bl10;
                                                                    block41: {
                                                                        n = t9d.b();
                                                                        try {
                                                                            bl10 = t9d2.v0f;
                                                                            if (n == 0) break block41;
                                                                            if (!bl10) break block42;
                                                                        }
                                                                        catch (oov oov2) {
                                                                            throw cw9.a(oov2);
                                                                        }
                                                                        bl10 = true;
                                                                    }
                                                                    return bl10;
                                                                }
                                                                try {
                                                                    if (vt22 != vt2.rf3) {
                                                                        return false;
                                                                    }
                                                                }
                                                                catch (oov oov3) {
                                                                    throw cw9.a(oov3);
                                                                }
                                                                zfz zfz2 = t9d2.getBlockState(mew2);
                                                                e0x e0x2 = zfz2.r_y();
                                                                bl9 = e0x2.ujd(t9d2, mew2);
                                                                try {
                                                                    bl8 = bl9;
                                                                    if (n == 0) break block43;
                                                                    if (bl8) break block44;
                                                                }
                                                                catch (oov oov4) {
                                                                    throw cw9.a(oov4);
                                                                }
                                                                mew2 = mew2.nuv();
                                                            }
                                                            bl8 = fe6.jqf((double)(ha92.x5k * 4.0f / 360.0f) + 0.5) & 3;
                                                        }
                                                        boolean bl11 = bl8;
                                                        vt23 = vt2.bm6(bl11 ? 1 : 0);
                                                        mew3 = mew2.offset(vt23);
                                                        try {
                                                            try {
                                                                try {
                                                                    bl = ha92.dzh(mew2, vt22, erg2);
                                                                    if (n == 0) break block45;
                                                                    if (!bl) break block46;
                                                                }
                                                                catch (oov oov5) {
                                                                    throw cw9.a(oov5);
                                                                }
                                                                bl = ha92.dzh(mew3, vt22, erg2);
                                                                if (n == 0) break block45;
                                                            }
                                                            catch (oov oov6) {
                                                                throw cw9.a(oov6);
                                                            }
                                                            if (!bl) break block46;
                                                        }
                                                        catch (oov oov7) {
                                                            throw cw9.a(oov7);
                                                        }
                                                        bl7 = t9d2.getBlockState(mew3).r_y().ujd(t9d2, mew3);
                                                        try {
                                                            try {
                                                                try {
                                                                    bl6 = bl9;
                                                                    if (n == 0) break block47;
                                                                    if (bl6) break block48;
                                                                }
                                                                catch (oov oov8) {
                                                                    throw cw9.a(oov8);
                                                                }
                                                                bl6 = t9d2.isAirBlock(mew2);
                                                                if (n == 0) break block47;
                                                            }
                                                            catch (oov oov9) {
                                                                throw cw9.a(oov9);
                                                            }
                                                            if (!bl6) break block49;
                                                        }
                                                        catch (oov oov10) {
                                                            throw cw9.a(oov10);
                                                        }
                                                    }
                                                    bl6 = true;
                                                    break block47;
                                                }
                                                bl6 = false;
                                            }
                                            bl5 = bl6;
                                            try {
                                                try {
                                                    try {
                                                        bl4 = bl7;
                                                        if (n == 0) break block50;
                                                        if (bl4) break block51;
                                                    }
                                                    catch (oov oov11) {
                                                        throw cw9.a(oov11);
                                                    }
                                                    bl4 = t9d2.isAirBlock(mew3);
                                                    if (n == 0) break block50;
                                                }
                                                catch (oov oov12) {
                                                    throw cw9.a(oov12);
                                                }
                                                if (!bl4) break block52;
                                            }
                                            catch (oov oov13) {
                                                throw cw9.a(oov13);
                                            }
                                        }
                                        bl4 = true;
                                        break block50;
                                    }
                                    bl4 = false;
                                }
                                boolean bl12 = bl4;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            bl2 = bl5;
                                                            if (n == 0) break block53;
                                                            if (!bl2) break block54;
                                                        }
                                                        catch (oov oov14) {
                                                            throw cw9.a(oov14);
                                                        }
                                                        bl2 = bl12;
                                                        if (n == 0) break block53;
                                                    }
                                                    catch (oov oov15) {
                                                        throw cw9.a(oov15);
                                                    }
                                                    if (!bl2) break block54;
                                                }
                                                catch (oov oov16) {
                                                    throw cw9.a(oov16);
                                                }
                                                bl2 = t9d.r3_(t9d2, mew2.eve());
                                                if (n == 0) break block53;
                                            }
                                            catch (oov oov17) {
                                                throw cw9.a(oov17);
                                            }
                                            if (!bl2) break block54;
                                        }
                                        catch (oov oov18) {
                                            throw cw9.a(oov18);
                                        }
                                        bl2 = t9d.r3_(t9d2, mew3.eve());
                                        if (n == 0) break block53;
                                    }
                                    catch (oov oov19) {
                                        throw cw9.a(oov19);
                                    }
                                    if (!bl2) break block54;
                                }
                                catch (oov oov20) {
                                    throw cw9.a(oov20);
                                }
                                zfz zfz3 = ox_.a6l.l4i().zvi(_8w.hyx, Boolean.valueOf(false)).zvi(_8w.em9, (Comparable)((Object)vt23)).zvi(_8w.sqt, (Comparable)((Object)_8w$mc6.jen));
                                try {
                                    bl3 = t9d2.vct(mew2, zfz3, 3);
                                    if (n == 0) break block55;
                                    if (!bl3) break block56;
                                }
                                catch (oov oov21) {
                                    throw cw9.a(oov21);
                                }
                                zfz zfz4 = zfz3.zvi(_8w.sqt, (Comparable)((Object)_8w$mc6.ang));
                                t9d2.vct(mew3, zfz4, 3);
                            }
                            --erg2.qd2;
                            bl3 = true;
                        }
                        return bl3;
                    }
                    bl2 = false;
                }
                return bl2;
            }
            bl = false;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

