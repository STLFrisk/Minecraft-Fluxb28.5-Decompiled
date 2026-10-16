/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class _4n
extends zfj$yuc {
    private final erg c0t;
    private float us0;
    private boolean q2w;

    public _4n(erg erg2, int n) {
        super(n);
        this.c0t = erg2;
    }

    public erg et4(Random random) {
        float f;
        erg erg2;
        block13: {
            block14: {
                int n;
                block18: {
                    int n2;
                    block17: {
                        int n3;
                        block15: {
                            int n4;
                            block16: {
                                n4 = t9d.c();
                                erg2 = this.c0t.yaq();
                                try {
                                    float f2 = this.us0 - 0.0f;
                                    f = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
                                    if (n4 != 0) break block13;
                                    if (f <= 0) break block14;
                                }
                                catch (oov oov2) {
                                    throw _4n.a(oov2);
                                }
                                int n5 = (int)(this.us0 * (float)this.c0t.mg5());
                                n = erg2.mg5() - random.nextInt(random.nextInt(n5) + 1);
                                try {
                                    n2 = n;
                                    n3 = n5;
                                    if (n4 != 0) break block15;
                                    if (n2 <= n3) break block16;
                                }
                                catch (oov oov3) {
                                    throw _4n.a(oov3);
                                }
                                n = n5;
                            }
                            try {
                                n2 = n;
                                if (n4 != 0) break block17;
                                n3 = 1;
                            }
                            catch (oov oov4) {
                                throw _4n.a(oov4);
                            }
                        }
                        if (n2 >= n3) break block18;
                        n2 = 1;
                    }
                    n = n2;
                }
                erg2.awe(n);
            }
            f = (float)this.q2w;
        }
        try {
            if (f != false) {
                hc0.xm8(random, erg2, 30);
            }
        }
        catch (oov oov5) {
            throw _4n.a(oov5);
        }
        return erg2;
    }

    public _4n s1t(float f) {
        this.us0 = f;
        return this;
    }

    public _4n jkg() {
        this.q2w = true;
        return this;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

