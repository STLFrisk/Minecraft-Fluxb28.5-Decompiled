/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class _um
extends cdu {
    @Override
    public boolean v3g(t9d t9d2, Random random, mew mew2) {
        boolean bl;
        block12: {
            int n = t9d.b();
            int n2 = 0;
            while (n2 < 10) {
                block11: {
                    block13: {
                        int n3 = mew2.getX() + random.nextInt(8) - random.nextInt(8);
                        int n4 = mew2.getY() + random.nextInt(4) - random.nextInt(4);
                        int n5 = mew2.getZ() + random.nextInt(8) - random.nextInt(8);
                        try {
                            boolean bl2;
                            try {
                                try {
                                    try {
                                        try {
                                            if (n == 0) break block11;
                                            bl = t9d2.isAirBlock(new mew(n3, n4, n5));
                                            if (n == 0) break block12;
                                        }
                                        catch (oov oov2) {
                                            throw _um.a(oov2);
                                        }
                                        if (!bl) break block13;
                                    }
                                    catch (oov oov3) {
                                        throw _um.a(oov3);
                                    }
                                    bl2 = ox_.r67.ctq(t9d2, new mew(n3, n4, n5));
                                    if (n == 0) break block13;
                                }
                                catch (oov oov4) {
                                    throw _um.a(oov4);
                                }
                                if (!bl2) break block13;
                            }
                            catch (oov oov5) {
                                throw _um.a(oov5);
                            }
                            bl2 = t9d2.vct(new mew(n3, n4, n5), ox_.r67.l4i(), 2);
                        }
                        catch (oov oov6) {
                            throw _um.a(oov6);
                        }
                    }
                    ++n2;
                }
                if (n != 0) continue;
            }
            bl = true;
        }
        return bl;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

