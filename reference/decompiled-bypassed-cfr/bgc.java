/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class bgc {
    private /* synthetic */ float r1c;
    private /* synthetic */ float j04;
    private /* synthetic */ float ri6;
    private /* synthetic */ float lxd;
    private /* synthetic */ tt9 b4c;
    private /* synthetic */ bb_ z9j;
    private final /* synthetic */ Random lbu;
    private /* synthetic */ float qwu;

    public bgc(float f, float f2, float f3, float f4) {
        this.qwu = zef.d44(1.1f, 1.8f);
        this.r1c = f;
        this.j04 = f2;
        this.ri6 = f3;
        this.lxd = f4;
        this.lbu = new Random();
        this.b4c = new tt9(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
        this.z9j = new bb_(Float.valueOf(0.0f), Float.valueOf(0.0f));
    }

    public float lrx(float f, float f2) {
        return f + this.lbu.nextFloat() * (f2 - f);
    }

    public bb_ tzp(tt9 tt92, tt9 tt93) {
        bb_ bb_2 = new bb_(Float.valueOf(0.0f), Float.valueOf(0.0f));
        this.b4c.s6x(Float.valueOf(tt92.sl2().floatValue() - tt93.sl2().floatValue())).j2k(Float.valueOf(tt92.c3r().floatValue() + this.qwu - (tt93.c3r().floatValue() + this.qwu))).nfq(Float.valueOf(tt92.cg8().floatValue() - tt93.cg8().floatValue()));
        double d = Math.hypot(this.b4c.sl2().doubleValue(), this.b4c.cg8().doubleValue());
        float f = (float)Math.atan2(this.b4c.cg8().floatValue(), this.b4c.sl2().floatValue());
        float f2 = (float)Math.atan2(this.b4c.c3r().floatValue(), d);
        float f3 = 57.29578f;
        float f4 = f * f3 - 90.0f;
        float f5 = -(f2 * f3);
        return bb_2.hem(Float.valueOf(f4)).lhk(Float.valueOf(f5)).o8s();
    }

    public void g27(float f) {
        this.qwu = f;
    }

    public bb_ sj0(bb_ bb_2, bb_ bb_3, float f, float f2) {
        float f3;
        float f4;
        bb_ bb_4;
        block6: {
            block5: {
                float f5;
                float f6;
                block4: {
                    int n = t9d.b();
                    try {
                        try {
                            bb_4 = this.z9j;
                            f4 = bb_3.bdo().floatValue() - bb_2.bdo().floatValue();
                            f6 = Math.abs(bb_3.bdo().floatValue() - bb_2.bdo().floatValue());
                            f5 = 5.0f;
                            if (n == 0) break block4;
                            if (!(f6 > f5)) break block5;
                        }
                        catch (oov oov2) {
                            throw bgc.a(oov2);
                        }
                        f6 = Math.abs(bb_3.bdo().floatValue() - bb_2.bdo().floatValue()) / Math.abs(bb_3.bdo().floatValue() - bb_2.bdo().floatValue()) * 2.0f;
                        f5 = 2.0f;
                    }
                    catch (oov oov3) {
                        throw bgc.a(oov3);
                    }
                }
                f3 = f6 / f5;
                break block6;
            }
            f3 = 0.0f;
        }
        return bb_4.hem(Float.valueOf(f4 - f3)).lhk(Float.valueOf(bb_3.jub().floatValue() - bb_2.jub().floatValue())).o8s().hem(Float.valueOf(bb_3.bdo().floatValue() - this.z9j.bdo().floatValue() / f2 * this.lrx(this.r1c, this.j04))).o8s().lhk(Float.valueOf(bb_3.jub().floatValue() - this.z9j.jub().floatValue() / f * this.lrx(this.ri6, this.lxd))).o8s();
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

