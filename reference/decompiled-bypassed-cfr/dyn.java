/*
 * Decompiled with CFR 0.152.
 */
public class dyn
extends stu {
    public dyn(e0x e0x2) {
        super(e0x2, false);
    }

    @Override
    public erg r__(erg erg2, t9d t9d2, ha9 ha92) {
        block35: {
            ha9 ha93;
            block41: {
                int n;
                block40: {
                    mew mew2;
                    int n2;
                    block39: {
                        zfz zfz2;
                        block38: {
                            boolean bl;
                            mew mew3;
                            block36: {
                                akm akm2;
                                block37: {
                                    akm akm3;
                                    block34: {
                                        block32: {
                                            block33: {
                                                n2 = t9d.b();
                                                akm2 = this.tbt(t9d2, ha92, true);
                                                try {
                                                    try {
                                                        akm3 = akm2;
                                                        if (n2 == 0) break block32;
                                                        if (akm3 != null) break block33;
                                                    }
                                                    catch (oov oov2) {
                                                        throw dyn.a(oov2);
                                                    }
                                                    return erg2;
                                                }
                                                catch (oov oov3) {
                                                    throw dyn.a(oov3);
                                                }
                                            }
                                            akm3 = akm2;
                                        }
                                        try {
                                            try {
                                                if (n2 == 0) break block34;
                                                if (akm3.oyz != akm$qs6.i4l) break block35;
                                            }
                                            catch (oov oov4) {
                                                throw dyn.a(oov4);
                                            }
                                            akm3 = akm2;
                                        }
                                        catch (oov oov5) {
                                            throw dyn.a(oov5);
                                        }
                                    }
                                    mew3 = akm3._uf();
                                    try {
                                        try {
                                            bl = t9d2.q2p(ha92, mew3);
                                            if (n2 == 0) break block36;
                                            if (bl) break block37;
                                        }
                                        catch (oov oov6) {
                                            throw dyn.a(oov6);
                                        }
                                        return erg2;
                                    }
                                    catch (oov oov7) {
                                        throw dyn.a(oov7);
                                    }
                                }
                                bl = ha92.dzh(mew3.offset(akm2.m_f), akm2.m_f, erg2);
                            }
                            try {
                                if (!bl) {
                                    return erg2;
                                }
                            }
                            catch (oov oov8) {
                                throw dyn.a(oov8);
                            }
                            mew2 = mew3.nuv();
                            zfz zfz3 = t9d2.getBlockState(mew3);
                            try {
                                try {
                                    zfz2 = zfz3;
                                    if (n2 == 0) break block38;
                                    if (zfz2.r_y().p1r() != p3y.six) break block35;
                                }
                                catch (oov oov9) {
                                    throw dyn.a(oov9);
                                }
                                zfz2 = zfz3;
                            }
                            catch (oov oov10) {
                                throw dyn.a(oov10);
                            }
                        }
                        try {
                            try {
                                n = (Integer)zfz2.dil(hmv.nfg);
                                if (n2 == 0) break block39;
                                if (n != 0) break block35;
                            }
                            catch (oov oov11) {
                                throw dyn.a(oov11);
                            }
                            n = t9d2.isAirBlock(mew2) ? 1 : 0;
                        }
                        catch (oov oov12) {
                            throw dyn.a(oov12);
                        }
                    }
                    try {
                        try {
                            try {
                                if (n2 == 0) break block40;
                                if (n == 0) break block35;
                            }
                            catch (oov oov13) {
                                throw dyn.a(oov13);
                            }
                            t9d2.gfy(mew2, ox_.r67.l4i());
                            ha93 = ha92;
                            if (n2 == 0) break block41;
                        }
                        catch (oov oov14) {
                            throw dyn.a(oov14);
                        }
                        n = ha93.lls.g40 ? 1 : 0;
                    }
                    catch (oov oov15) {
                        throw dyn.a(oov15);
                    }
                }
                try {
                    if (n == 0) {
                        --erg2.qd2;
                    }
                }
                catch (oov oov16) {
                    throw dyn.a(oov16);
                }
                ha93 = ha92;
            }
            ha93.aex(l9p.foo[u7m._lo(this)]);
        }
        return erg2;
    }

    @Override
    public int bu9(erg erg2, int n) {
        return ox_.r67.ieb(ox_.r67.kig(erg2.j6_()));
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

