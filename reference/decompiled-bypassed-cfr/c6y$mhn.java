/*
 * Decompiled with CFR 0.152.
 */
public class c6y$mhn
extends flo {
    public c6y$mhn(t9d t9d2, double d, double d2, double d3) {
        super(t9d2, d, d2, d3);
        this.bx4 = 4;
    }

    @Override
    public void oss(q3g q3g2, i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = 0.25f;
        float f8 = 0.5f;
        float f9 = 0.125f;
        float f10 = 0.375f;
        float f11 = 7.1f * fe6.rtn(((float)this.goc + f - 1.0f) * 0.25f * (float)Math.PI);
        this.xof = 0.6f - ((float)this.goc + f - 1.0f) * 0.25f * 0.5f;
        float f12 = (float)(this.bc1 + (this.o2v - this.bc1) * (double)f - mrd);
        float f13 = (float)(this.o_z + (this.kfp - this.o_z) * (double)f - txo);
        float f14 = (float)(this.a4d + (this.vbd - this.a4d) * (double)f - bta);
        int n = this.azk(f);
        int n2 = n >> 16 & 0xFFFF;
        int n3 = n & 0xFFFF;
        q3g2.g5o(f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11).h0a(0.5, 0.375).gs4(this.aeh, this.li4, this.v5a, this.xof).iu0(n2, n3).pzw();
        q3g2.g5o(f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11).h0a(0.5, 0.125).gs4(this.aeh, this.li4, this.v5a, this.xof).iu0(n2, n3).pzw();
        q3g2.g5o(f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11).h0a(0.25, 0.125).gs4(this.aeh, this.li4, this.v5a, this.xof).iu0(n2, n3).pzw();
        q3g2.g5o(f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11).h0a(0.25, 0.375).gs4(this.aeh, this.li4, this.v5a, this.xof).iu0(n2, n3).pzw();
    }
}

