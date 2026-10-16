/*
 * Decompiled with CFR 0.152.
 */
public class fvs
extends flo {
    public fvs(t9d t9d2, double d, double d2, double d3, u7m u7m2) {
        super(t9d2, d, d2, d3, 0.0, 0.0, 0.0);
        this.nsd(c05.vz1().jiu().kwo().a28(u7m2));
        this.v5a = 1.0f;
        this.li4 = 1.0f;
        this.aeh = 1.0f;
        this.bw4 = 0.0;
        this.mop = 0.0;
        this.icv = 0.0;
        this.xx_ = 0.0f;
        this.bx4 = 80;
    }

    @Override
    public int ikr() {
        return 1;
    }

    @Override
    public void oss(q3g q3g2, i2h i2h2, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = this.esr.l3u();
        float f8 = this.esr.w2b();
        float f9 = this.esr.bhi();
        float f10 = this.esr.e8_();
        float f11 = 0.5f;
        float f12 = (float)(this.bc1 + (this.o2v - this.bc1) * (double)f - mrd);
        float f13 = (float)(this.o_z + (this.kfp - this.o_z) * (double)f - txo);
        float f14 = (float)(this.a4d + (this.vbd - this.a4d) * (double)f - bta);
        int n = this.azk(f);
        int n2 = n >> 16 & 0xFFFF;
        int n3 = n & 0xFFFF;
        q3g2.g5o(f12 - f2 * 0.5f - f5 * 0.5f, f13 - f3 * 0.5f, f14 - f4 * 0.5f - f6 * 0.5f).h0a(f8, f10).gs4(this.aeh, this.li4, this.v5a, 1.0f).iu0(n2, n3).pzw();
        q3g2.g5o(f12 - f2 * 0.5f + f5 * 0.5f, f13 + f3 * 0.5f, f14 - f4 * 0.5f + f6 * 0.5f).h0a(f8, f9).gs4(this.aeh, this.li4, this.v5a, 1.0f).iu0(n2, n3).pzw();
        q3g2.g5o(f12 + f2 * 0.5f + f5 * 0.5f, f13 + f3 * 0.5f, f14 + f4 * 0.5f + f6 * 0.5f).h0a(f7, f9).gs4(this.aeh, this.li4, this.v5a, 1.0f).iu0(n2, n3).pzw();
        q3g2.g5o(f12 + f2 * 0.5f - f5 * 0.5f, f13 - f3 * 0.5f, f14 + f4 * 0.5f - f6 * 0.5f).h0a(f7, f10).gs4(this.aeh, this.li4, this.v5a, 1.0f).iu0(n2, n3).pzw();
    }
}

