/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class fhq
extends cdu {
    @Override
    public boolean v3g(t9d t9d2, Random random, mew mew2) {
        mew mew3;
        t9d t9d3;
        int n;
        block24: {
            block25: {
                block22: {
                    block23: {
                        n = t9d.b();
                        try {
                            try {
                                t9d3 = t9d2;
                                mew3 = mew2;
                                if (n == 0) break block22;
                                if (t9d3.isAirBlock(mew3)) break block23;
                            }
                            catch (oov oov2) {
                                throw fhq.a(oov2);
                            }
                            return false;
                        }
                        catch (oov oov3) {
                            throw fhq.a(oov3);
                        }
                    }
                    t9d3 = t9d2;
                    mew3 = mew2.nuv();
                }
                try {
                    try {
                        if (n == 0) break block24;
                        if (t9d3.getBlockState(mew3).r_y() == ox_.pzt) break block25;
                    }
                    catch (oov oov4) {
                        throw fhq.a(oov4);
                    }
                    return false;
                }
                catch (oov oov5) {
                    throw fhq.a(oov5);
                }
            }
            t9d3 = t9d2;
            mew3 = mew2;
        }
        t9d3.vct(mew3, ox_.t7q.l4i(), 2);
        int n2 = 0;
        while (n2 < 1500) {
            block26: {
                e0x e0x2;
                mew mew4 = mew2.ec4(random.nextInt(8) - random.nextInt(8), -random.nextInt(12), random.nextInt(8) - random.nextInt(8));
                try {
                    if (n == 0) break block26;
                    e0x2 = t9d2.getBlockState(mew4).r_y();
                }
                catch (oov oov6) {
                    throw fhq.a(oov6);
                }
                block19: while (e0x2.p1r() == p3y.cei) {
                    int n3 = 0;
                    for (vt2 vt22 : vt2.values()) {
                        e0x2 = t9d2.getBlockState(mew4.offset(vt22)).r_y();
                        if (n == 0) continue block19;
                        try {
                            if (e0x2 == ox_.t7q) {
                                ++n3;
                            }
                        }
                        catch (oov oov7) {
                            throw fhq.a(oov7);
                        }
                        try {
                            if (n3 <= 1) continue;
                            break;
                        }
                        catch (oov oov8) {
                            throw fhq.a(oov8);
                        }
                    }
                    try {
                        int n4;
                        try {
                            n4 = n3;
                            if (n == 0 || n4 != true) break;
                        }
                        catch (oov oov9) {
                            throw fhq.a(oov9);
                        }
                        n4 = t9d2.vct(mew4, ox_.t7q.l4i(), 2);
                        break;
                    }
                    catch (oov oov10) {
                        throw fhq.a(oov10);
                    }
                }
                ++n2;
            }
            if (n != 0) continue;
        }
        return true;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

