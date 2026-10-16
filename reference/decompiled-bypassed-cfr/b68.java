/*
 * Decompiled with CFR 0.152.
 */
public class b68
extends g6r {
    private static final /* synthetic */ int[][] rdk;
    private static final /* synthetic */ int[][] w6t;
    private static final /* synthetic */ int y48;
    private final /* synthetic */ tf8[] pyx;

    public b68() {
        this.pyx = new tf8[y48];
        float f = -3.5f;
        int n = t9d.c();
        int n2 = 0;
        while (n2 < this.pyx.length) {
            block3: {
                block4: {
                    try {
                        this.pyx[n2] = new tf8(this, w6t[n2][0], w6t[n2][1]);
                        this.pyx[n2].ge4((float)rdk[n2][0] * -0.5f, 0.0f, (float)rdk[n2][2] * -0.5f, rdk[n2][0], rdk[n2][1], rdk[n2][2]);
                        this.pyx[n2].i50(0.0f, 24 - rdk[n2][1], f);
                        if (n != 0) break block3;
                        if (n2 >= this.pyx.length - 1) break block4;
                    }
                    catch (oov oov2) {
                        throw b68.a(oov2);
                    }
                    f += (float)(rdk[n2][2] + rdk[n2 + 1][2]) * 0.5f;
                }
                ++n2;
            }
            if (n == 0) continue;
        }
    }

    @Override
    public void s_q(i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        this.ltd(f, f2, f3, f4, f5, f6, i2h2);
        int n = t9d.c();
        for (int i = 0; i < this.pyx.length; ++i) {
            this.pyx[i].vca(f6);
            if (n == 0) continue;
        }
    }

    @Override
    public void ltd(float f, float f2, float f3, float f4, float f5, float f6, i2h i2h2) {
        int n = t9d.b();
        for (int i = 0; i < this.pyx.length; ++i) {
            this.pyx[i].r80 = fe6.ssk(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.01f * (float)(1 + Math.abs(i - 2));
            this.pyx[i]._ki = fe6.rtn(f3 * 0.9f + (float)i * 0.15f * (float)Math.PI) * (float)Math.PI * 0.1f * (float)Math.abs(i - 2);
            if (n != 0) continue;
        }
    }

    static {
        rdk = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
        w6t = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
        y48 = rdk.length;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

