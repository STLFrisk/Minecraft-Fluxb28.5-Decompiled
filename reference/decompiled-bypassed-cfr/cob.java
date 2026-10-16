/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class cob
extends g6r {
    public tf8 _h1;
    public tf8[] bgp = new tf8[9];

    public cob() {
        int n = -16;
        int n2 = t9d.c();
        this._h1 = new tf8(this, 0, 0);
        this._h1.ge4(-8.0f, -8.0f, -8.0f, 16, 16, 16);
        this._h1.ca7 += (float)(24 + n);
        Random random = new Random(1660L);
        for (int i = 0; i < this.bgp.length; ++i) {
            this.bgp[i] = new tf8(this, 0, 0);
            float f = (((float)(i % 3) - (float)(i / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float f2 = ((float)(i / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int n3 = random.nextInt(7) + 8;
            this.bgp[i].ge4(-1.0f, 0.0f, -1.0f, 2, n3, 2);
            this.bgp[i]._ki = f;
            this.bgp[i].kit = f2;
            this.bgp[i].ca7 = 31 + n;
            if (n2 == 0) continue;
        }
    }

    @Override
    public void ltd(float f, float f2, float f3, float f4, float f5, float f6, i2h i2h2) {
        int n = t9d.c();
        for (int i = 0; i < this.bgp.length; ++i) {
            this.bgp[i].pod = 0.2f * fe6.rtn(f3 * 0.3f + (float)i) + 0.4f;
            if (n == 0) continue;
        }
    }

    @Override
    public void s_q(i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        block4: {
            this.ltd(f, f2, f3, f4, f5, f6, i2h2);
            hzu.dp2();
            hzu.a4k(0.0f, 0.6f, 0.0f);
            this._h1.vca(f6);
            tf8[] tf8Array = this.bgp;
            int n = tf8Array.length;
            int n2 = t9d.b();
            for (int i = 0; i < n; ++i) {
                tf8 tf82 = tf8Array[i];
                try {
                    tf82.vca(f6);
                    if (n2 != 0) {
                        if (n2 != 0) continue;
                        break;
                    }
                    break block4;
                }
                catch (oov oov2) {
                    throw cob.a(oov2);
                }
            }
            hzu.x3w();
        }
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

