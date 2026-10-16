/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class c8u
extends oa4 {
    private final sla s1l;

    public c8u(oa4 oa42, sla sla2) {
        super(Arrays.copyOf(oa42.fnb(), oa42.fnb().length), oa42.hvb, atg.g9d(oa42.fnb()));
        this.s1l = sla2;
        this.kw_();
        this.hmg();
    }

    private void kw_() {
        int n = t9d.b();
        for (int i = 0; i < 4; ++i) {
            this.bcj(i);
            if (n != 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void bcj(int var1_1) {
        block10: {
            var3_2 = this.osu.length / 4;
            var4_3 = var3_2 * var1_1;
            var5_4 = Float.intBitsToFloat(this.osu[var4_3]);
            var6_5 = Float.intBitsToFloat(this.osu[var4_3 + 1]);
            var7_6 = Float.intBitsToFloat(this.osu[var4_3 + 2]);
            var8_7 = 0.0f;
            var2_8 = t9d.b();
            var9_9 = 0.0f;
            try {
                v0 = c8u$1.t_v;
                v1 = this.iqa.ordinal();
                if (var2_8 == 0) break block10;
            }
            catch (oov v2) {
                throw c8u.a(v2);
            }
            {
                ** switch (v0[v1])
            }
lbl-1000:
            // 1 sources

            {
                case 1: {
                    var8_7 = var5_4 * 16.0f;
                    var9_9 = (1.0f - var7_6) * 16.0f;
                    if (var2_8 != 0) break;
                }
lbl23:
                // 2 sources

                case 2: {
                    var8_7 = var5_4 * 16.0f;
                    var9_9 = var7_6 * 16.0f;
                    if (var2_8 != 0) break;
                }
lbl29:
                // 2 sources

                case 3: {
                    var8_7 = (1.0f - var5_4) * 16.0f;
                    var9_9 = (1.0f - var6_5) * 16.0f;
                    if (var2_8 != 0) break;
                }
lbl35:
                // 2 sources

                case 4: {
                    var8_7 = var5_4 * 16.0f;
                    var9_9 = (1.0f - var6_5) * 16.0f;
                    if (var2_8 != 0) break;
                }
lbl41:
                // 2 sources

                case 5: {
                    var8_7 = var7_6 * 16.0f;
                    var9_9 = (1.0f - var6_5) * 16.0f;
                    if (var2_8 != 0) break;
                }
lbl47:
                // 2 sources

                case 6: {
                    var8_7 = (1.0f - var7_6) * 16.0f;
                    var9_9 = (1.0f - var6_5) * 16.0f;
                }
            }
lbl52:
            // 7 sources

            this.osu[var4_3 + 4] = Float.floatToRawIntBits(this.s1l.oon(var8_7));
            v0 = this.osu;
            v1 = var4_3 + 4 + 1;
        }
        v0[v1] = Float.floatToRawIntBits(this.s1l.h0c(var9_9));
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

