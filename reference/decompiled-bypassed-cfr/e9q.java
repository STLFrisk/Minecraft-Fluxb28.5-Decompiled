/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class e9q
extends cdu {
    public e9q(boolean bl) {
        super(bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean mgy(e0x e0x2) {
        e0x e0x3;
        e0x e0x4;
        block33: {
            int n;
            block32: {
                block31: {
                    block30: {
                        block29: {
                            p3y p3y2;
                            p3y p3y3;
                            block28: {
                                n = t9d.b();
                                p3y p3y4 = e0x2.p1r();
                                try {
                                    try {
                                        p3y p3y2 = p3y4;
                                        p3y2 = p3y.cei;
                                        if (n == 0) break block28;
                                        if (p3y3 == p3y2) return true;
                                    }
                                    catch (oov oov2) {
                                        throw e9q.c(oov2);
                                    }
                                    p3y p3y2 = p3y4;
                                    p3y2 = p3y.hh1;
                                }
                                catch (oov oov3) {
                                    throw e9q.c(oov3);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (p3y3 == p3y2) return true;
                                        e0x e0x3 = e0x2;
                                        e0x3 = ox_.l11;
                                        if (n == 0) break block29;
                                    }
                                    catch (oov oov4) {
                                        throw e9q.c(oov4);
                                    }
                                    if (e0x4 == e0x3) return true;
                                }
                                catch (oov oov5) {
                                    throw e9q.c(oov5);
                                }
                                e0x e0x3 = e0x2;
                                e0x3 = ox_.kqk;
                            }
                            catch (oov oov6) {
                                throw e9q.c(oov6);
                            }
                        }
                        try {
                            try {
                                if (n == 0) break block30;
                                if (e0x4 == e0x3) return true;
                            }
                            catch (oov oov7) {
                                throw e9q.c(oov7);
                            }
                            e0x e0x3 = e0x2;
                            e0x3 = ox_.uom;
                        }
                        catch (oov oov8) {
                            throw e9q.c(oov8);
                        }
                    }
                    try {
                        try {
                            if (n == 0) break block31;
                            if (e0x4 == e0x3) return true;
                        }
                        catch (oov oov9) {
                            throw e9q.c(oov9);
                        }
                        e0x e0x3 = e0x2;
                        e0x3 = ox_.a4y;
                    }
                    catch (oov oov10) {
                        throw e9q.c(oov10);
                    }
                }
                try {
                    try {
                        if (n == 0) break block32;
                        if (e0x4 == e0x3) return true;
                    }
                    catch (oov oov11) {
                        throw e9q.c(oov11);
                    }
                    e0x e0x3 = e0x2;
                    e0x3 = ox_.t_k;
                }
                catch (oov oov12) {
                    throw e9q.c(oov12);
                }
            }
            try {
                try {
                    if (n == 0) break block33;
                    if (e0x4 == e0x3) return true;
                }
                catch (oov oov13) {
                    throw e9q.c(oov13);
                }
                e0x e0x3 = e0x2;
                e0x3 = ox_.s25;
            }
            catch (oov oov14) {
                throw e9q.c(oov14);
            }
        }
        try {
            if (e0x4 != e0x3) return false;
            return true;
        }
        catch (oov oov15) {
            throw e9q.c(oov15);
        }
    }

    public void mpp(t9d t9d2, Random random, mew mew2) {
    }

    public void g27(t9d t9d2, mew mew2) {
        try {
            if (t9d2.getBlockState(mew2).r_y() != ox_.kqk) {
                this.u0f(t9d2, mew2, ox_.kqk.l4i());
            }
        }
        catch (oov oov2) {
            throw e9q.c(oov2);
        }
    }

    private static oov c(oov oov2) {
        return oov2;
    }
}

