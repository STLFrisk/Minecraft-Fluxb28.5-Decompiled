/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class c_0
implements gnj {
    private final /* synthetic */ gmu po0;

    public c_0(gmu gmu2) {
        this.po0 = gmu2;
    }

    @Override
    public void doRenderLayer(g_3 g_32, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        block5: {
            int n = t9d.b();
            int n2 = g_32.jj5();
            if (n2 > 0) {
                hy9 hy92 = new hy9(g_32.oay, g_32.o2v, g_32.kfp, g_32.vbd);
                Random random = new Random(g_32.jwu());
                qpm.cng();
                for (int i = 0; i < n2; ++i) {
                    hzu.dp2();
                    tf8 tf82 = this.po0.fy4().bm8(random);
                    upl upl2 = (upl)tf82.mv0.get(random.nextInt(tf82.mv0.size()));
                    tf82.f2u(0.0625f);
                    float f8 = random.nextFloat();
                    float f9 = random.nextFloat();
                    float f10 = random.nextFloat();
                    float f11 = (upl2.zwq + (upl2.bo7 - upl2.zwq) * f8) / 16.0f;
                    float f12 = (upl2.oul + (upl2.k74 - upl2.oul) * f9) / 16.0f;
                    float f13 = (upl2.ygu + (upl2.ji9 - upl2.ygu) * f10) / 16.0f;
                    hzu.a4k(f11, f12, f13);
                    f8 = f8 * 2.0f - 1.0f;
                    f9 = f9 * 2.0f - 1.0f;
                    f10 = f10 * 2.0f - 1.0f;
                    float f14 = fe6.bug((f8 *= -1.0f) * f8 + (f10 *= -1.0f) * f10);
                    hy92.p3h = hy92.x5k = (float)(Math.atan2(f8, f10) * 180.0 / Math.PI);
                    hy92.j25 = hy92.y2i = (float)(Math.atan2(f9 *= -1.0f, f14) * 180.0 / Math.PI);
                    double d = 0.0;
                    double d2 = 0.0;
                    double d3 = 0.0;
                    try {
                        this.po0.g5a().ajg(hy92, d, d2, d3, 0.0f, f3);
                        hzu.x3w();
                        if (n != 0) {
                            if (n != 0) continue;
                            break;
                        }
                        break block5;
                    }
                    catch (oov oov2) {
                        throw c_0.a(oov2);
                    }
                }
                qpm.ne_();
            }
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

