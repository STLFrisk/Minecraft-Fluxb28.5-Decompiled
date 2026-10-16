/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class fup
extends cdu {
    @Override
    public boolean v3g(t9d t9d2, Random random, mew mew2) {
        boolean bl;
        block24: {
            int n = t9d.b();
            int n2 = 0;
            block20: while (true) {
                int n3 = n2;
                block21: while (n3 < 20) {
                    block25: {
                        mew mew3;
                        block27: {
                            p3y p3y2;
                            p3y p3y3;
                            block29: {
                                mew mew4;
                                block28: {
                                    block26: {
                                        mew3 = mew2.ec4(random.nextInt(4) - random.nextInt(4), 0, random.nextInt(4) - random.nextInt(4));
                                        try {
                                            try {
                                                if (n == 0) continue block20;
                                                bl = t9d2.isAirBlock(mew3);
                                                if (n == 0) break block24;
                                            }
                                            catch (oov oov2) {
                                                throw fup.a(oov2);
                                            }
                                            if (!bl) break block25;
                                        }
                                        catch (oov oov3) {
                                            throw fup.a(oov3);
                                        }
                                        mew4 = mew3.eve();
                                        try {
                                            try {
                                                p3y3 = t9d2.getBlockState(mew4.y8e()).r_y().p1r();
                                                p3y2 = p3y.six;
                                                if (n == 0) break block26;
                                                if (p3y3 == p3y2) break block27;
                                            }
                                            catch (oov oov4) {
                                                throw fup.a(oov4);
                                            }
                                            p3y3 = t9d2.getBlockState(mew4.o_8()).r_y().p1r();
                                            p3y2 = p3y.six;
                                        }
                                        catch (oov oov5) {
                                            throw fup.a(oov5);
                                        }
                                    }
                                    try {
                                        try {
                                            if (n == 0) break block28;
                                            if (p3y3 == p3y2) break block27;
                                        }
                                        catch (oov oov6) {
                                            throw fup.a(oov6);
                                        }
                                        p3y3 = t9d2.getBlockState(mew4.idu()).r_y().p1r();
                                        p3y2 = p3y.six;
                                    }
                                    catch (oov oov7) {
                                        throw fup.a(oov7);
                                    }
                                }
                                try {
                                    try {
                                        if (n == 0) break block29;
                                        if (p3y3 == p3y2) break block27;
                                    }
                                    catch (oov oov8) {
                                        throw fup.a(oov8);
                                    }
                                    p3y3 = t9d2.getBlockState(mew4.z6x()).r_y().p1r();
                                    p3y2 = p3y.six;
                                }
                                catch (oov oov9) {
                                    throw fup.a(oov9);
                                }
                            }
                            if (p3y3 != p3y2) break block25;
                        }
                        int n4 = 2 + random.nextInt(random.nextInt(3) + 1);
                        for (int i = 0; i < n4; ++i) {
                            n3 = ox_.x65.rbp(t9d2, mew3) ? 1 : 0;
                            if (n == 0) continue block21;
                            try {
                                try {
                                    if (n == 0 || n3 == 0) continue;
                                }
                                catch (oov oov10) {
                                    throw fup.a(oov10);
                                }
                                t9d2.vct(mew3.z89(i), ox_.x65.l4i(), 2);
                                continue;
                            }
                            catch (oov oov11) {
                                throw fup.a(oov11);
                            }
                        }
                    }
                    ++n2;
                    if (n != 0) continue block20;
                }
                break;
            }
            bl = true;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

