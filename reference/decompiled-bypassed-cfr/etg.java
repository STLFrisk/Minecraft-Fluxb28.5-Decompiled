/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class etg
extends liu {
    public etg(hr_ hr_2) {
        super(hr_2);
    }

    public void r02(_6b _6b2, double d, double d2, double d3, float f, float f2) {
        block55: {
            int n;
            double d4;
            double d5;
            double[] dArray;
            double[] dArray2;
            int n2;
            q3g q3g2;
            jom jom2;
            block54: {
                jom2 = jom.yut();
                q3g2 = jom2.zuq();
                n2 = t9d.b();
                hzu.m_1();
                hzu.fpt();
                hzu.spd();
                hzu.ru7(770, 1);
                dArray2 = new double[8];
                dArray = new double[8];
                d5 = 0.0;
                d4 = 0.0;
                Random random = new Random(_6b2._ud);
                for (n = 7; n >= 0; --n) {
                    dArray2[n] = d5;
                    dArray[n] = d4;
                    d5 += (double)(random.nextInt(11) - 5);
                    d4 += (double)(random.nextInt(11) - 5);
                    try {
                        if (n2 != 0) {
                            if (n2 != 0) continue;
                            break;
                        }
                        break block54;
                    }
                    catch (oov oov2) {
                        throw etg.a(oov2);
                    }
                }
                n = 0;
            }
            block33: while (true) {
                int n3 = n;
                block34: while (n3 < 4) {
                    Random random = new Random(_6b2._ud);
                    if (n2 == 0) break block55;
                    int n4 = 0;
                    block35: while (true) {
                        int n5 = n4;
                        block36: while (n5 < 3) {
                            int n6;
                            int n7;
                            block59: {
                                int n8;
                                block58: {
                                    block56: {
                                        block57: {
                                            n7 = 7;
                                            n6 = 0;
                                            n3 = n4;
                                            if (n2 == 0) continue block34;
                                            try {
                                                if (n2 == 0) break block56;
                                                if (n3 <= 0) break block57;
                                            }
                                            catch (oov oov3) {
                                                throw etg.a(oov3);
                                            }
                                            n7 = 7 - n4;
                                        }
                                        n8 = n4;
                                    }
                                    try {
                                        try {
                                            if (n2 == 0) break block58;
                                            if (n8 <= 0) break block59;
                                        }
                                        catch (oov oov4) {
                                            throw etg.a(oov4);
                                        }
                                        n8 = n7 - 2;
                                    }
                                    catch (oov oov5) {
                                        throw etg.a(oov5);
                                    }
                                }
                                n6 = n8;
                            }
                            double d6 = dArray2[n7] - d5;
                            double d7 = dArray[n7] - d4;
                            int n9 = n7;
                            block37: while (true) {
                                int n10 = n9;
                                int n11 = n6;
                                block38: while (n10 >= n11) {
                                    int n12;
                                    double d8;
                                    double d9;
                                    double d10;
                                    double d11;
                                    block61: {
                                        int n13;
                                        block62: {
                                            block76: {
                                                block60: {
                                                    block75: {
                                                        d11 = d6;
                                                        d10 = d7;
                                                        try {
                                                            if (n2 == 0) break block60;
                                                            n5 = n4;
                                                            if (n2 == 0) continue block36;
                                                        }
                                                        catch (oov oov6) {
                                                            throw etg.a(oov6);
                                                        }
                                                        if (n5 != 0) break block75;
                                                        d6 += (double)(random.nextInt(11) - 5);
                                                        d7 += (double)(random.nextInt(11) - 5);
                                                        if (n2 != 0) break block76;
                                                    }
                                                    d6 += (double)(random.nextInt(31) - 15);
                                                }
                                                d7 += (double)(random.nextInt(31) - 15);
                                            }
                                            q3g2.ezr(5, gnl.gec);
                                            float f3 = 0.5f;
                                            float f4 = 0.45f;
                                            float f5 = 0.45f;
                                            float f6 = 0.5f;
                                            d9 = 0.1 + (double)n * 0.2;
                                            if (n4 == 0) {
                                                d9 *= (double)n9 * 0.1 + 1.0;
                                            }
                                            d8 = 0.1 + (double)n * 0.2;
                                            try {
                                                n13 = n4;
                                                if (n2 == 0) break block61;
                                                if (n13 != 0) break block62;
                                            }
                                            catch (oov oov7) {
                                                throw etg.a(oov7);
                                            }
                                            d8 *= (double)(n9 - 1) * 0.1 + 1.0;
                                        }
                                        n13 = n12 = 0;
                                    }
                                    while (n12 < 5) {
                                        double d12;
                                        double d13;
                                        double d14;
                                        double d15;
                                        block78: {
                                            block74: {
                                                int n14;
                                                int n15;
                                                block73: {
                                                    block71: {
                                                        block72: {
                                                            block70: {
                                                                block69: {
                                                                    block77: {
                                                                        block68: {
                                                                            int n16;
                                                                            int n17;
                                                                            block67: {
                                                                                block65: {
                                                                                    block66: {
                                                                                        block64: {
                                                                                            block63: {
                                                                                                d15 = d + 0.5 - d9;
                                                                                                d14 = d3 + 0.5 - d9;
                                                                                                n10 = n12;
                                                                                                n11 = 1;
                                                                                                if (n2 == 0) continue block38;
                                                                                                try {
                                                                                                    try {
                                                                                                        if (n2 == 0) break block63;
                                                                                                        if (n10 == n11) break block64;
                                                                                                    }
                                                                                                    catch (oov oov8) {
                                                                                                        throw etg.a(oov8);
                                                                                                    }
                                                                                                    n17 = n12;
                                                                                                    n16 = 2;
                                                                                                }
                                                                                                catch (oov oov9) {
                                                                                                    throw etg.a(oov9);
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                if (n2 == 0) break block65;
                                                                                                if (n17 != n16) break block66;
                                                                                            }
                                                                                            catch (oov oov10) {
                                                                                                throw etg.a(oov10);
                                                                                            }
                                                                                        }
                                                                                        d15 += d9 * 2.0;
                                                                                    }
                                                                                    n17 = n12;
                                                                                    n16 = 2;
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (n2 == 0) break block67;
                                                                                        if (n17 == n16) break block68;
                                                                                    }
                                                                                    catch (oov oov11) {
                                                                                        throw etg.a(oov11);
                                                                                    }
                                                                                    n17 = n12;
                                                                                    n16 = 3;
                                                                                }
                                                                                catch (oov oov12) {
                                                                                    throw etg.a(oov12);
                                                                                }
                                                                            }
                                                                            if (n17 != n16) break block77;
                                                                        }
                                                                        d14 += d9 * 2.0;
                                                                    }
                                                                    d13 = d + 0.5 - d8;
                                                                    d12 = d3 + 0.5 - d8;
                                                                    try {
                                                                        try {
                                                                            n15 = n12;
                                                                            n14 = 1;
                                                                            if (n2 == 0) break block69;
                                                                            if (n15 == n14) break block70;
                                                                        }
                                                                        catch (oov oov13) {
                                                                            throw etg.a(oov13);
                                                                        }
                                                                        n15 = n12;
                                                                        n14 = 2;
                                                                    }
                                                                    catch (oov oov14) {
                                                                        throw etg.a(oov14);
                                                                    }
                                                                }
                                                                try {
                                                                    if (n2 == 0) break block71;
                                                                    if (n15 != n14) break block72;
                                                                }
                                                                catch (oov oov15) {
                                                                    throw etg.a(oov15);
                                                                }
                                                            }
                                                            d13 += d8 * 2.0;
                                                        }
                                                        n15 = n12;
                                                        n14 = 2;
                                                    }
                                                    try {
                                                        try {
                                                            if (n2 == 0) break block73;
                                                            if (n15 == n14) break block74;
                                                        }
                                                        catch (oov oov16) {
                                                            throw etg.a(oov16);
                                                        }
                                                        n15 = n12;
                                                        n14 = 3;
                                                    }
                                                    catch (oov oov17) {
                                                        throw etg.a(oov17);
                                                    }
                                                }
                                                if (n15 != n14) break block78;
                                            }
                                            d12 += d8 * 2.0;
                                        }
                                        q3g2.g5o(d13 + d6, d2 + (double)(n9 * 16), d12 + d7).gs4(0.45f, 0.45f, 0.5f, 0.3f).pzw();
                                        q3g2.g5o(d15 + d11, d2 + (double)((n9 + 1) * 16), d14 + d10).gs4(0.45f, 0.45f, 0.5f, 0.3f).pzw();
                                        ++n12;
                                        if (n2 != 0) continue;
                                    }
                                    jom2.q7g();
                                    --n9;
                                    if (n2 != 0) continue block37;
                                }
                                break;
                            }
                            ++n4;
                            if (n2 != 0) continue block35;
                        }
                        break;
                    }
                    ++n;
                    if (n2 != 0) continue block33;
                }
                break;
            }
            hzu.ux6();
            hzu.s7q();
            hzu.rqj();
        }
    }

    public gdz _s6(_6b _6b2) {
        return null;
    }

    @Override
    public gdz dzd(i2h i2h2) {
        return this._s6((_6b)i2h2);
    }

    @Override
    public void apl(i2h i2h2, double d, double d2, double d3, float f, float f2) {
        this.r02((_6b)i2h2, d, d2, d3, f, f2);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

