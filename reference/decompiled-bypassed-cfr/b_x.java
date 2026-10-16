/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class b_x
extends r45 {
    private /* synthetic */ g_p[] epp;
    private /* synthetic */ int gph;

    public b_x(Random random, int n) {
        this.gph = n;
        int n2 = t9d.b();
        this.epp = new g_p[n];
        for (int i = 0; i < n; ++i) {
            this.epp[i] = new g_p(random);
            if (n2 != 0) continue;
        }
    }

    public double[] w4w(double[] dArray, int n, int n2, int n3, int n4, int n5, int n6, double d, double d2, double d3) {
        int n7;
        block10: {
            block9: {
                double[] dArray2;
                block8: {
                    n7 = t9d.b();
                    try {
                        try {
                            dArray2 = dArray;
                            if (n7 == 0) break block8;
                            if (dArray2 != null) break block9;
                        }
                        catch (oov oov2) {
                            throw b_x.a(oov2);
                        }
                        dArray2 = new double[n4 * n5 * n6];
                    }
                    catch (oov oov3) {
                        throw b_x.a(oov3);
                    }
                }
                dArray = dArray2;
                if (n7 != 0) break block10;
            }
            for (int i = 0; i < dArray.length; ++i) {
                dArray[i] = 0.0;
                if (n7 != 0) continue;
            }
        }
        double d4 = 1.0;
        for (int i = 0; i < this.gph; ++i) {
            double d5 = (double)n * d4 * d;
            double d6 = (double)n2 * d4 * d2;
            double d7 = (double)n3 * d4 * d3;
            long l = fe6.lfr(d5);
            long l2 = fe6.lfr(d7);
            d5 -= (double)l;
            d7 -= (double)l2;
            this.epp[i].t7b(dArray, d5 += (double)(l %= 0x1000000L), d6, d7 += (double)(l2 %= 0x1000000L), n4, n5, n6, d * d4, d2 * d4, d3 * d4, d4);
            d4 /= 2.0;
            if (n7 != 0) continue;
        }
        return dArray;
    }

    public double[] svg(double[] dArray, int n, int n2, int n3, int n4, double d, double d2, double d3) {
        return this.w4w(dArray, n, 10, n2, n3, 1, n4, d, 1.0, d2);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

