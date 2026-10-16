public class fvs extends flo {
   public fvs(t9d var1, double var2, double var4, double var6, u7m var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.nsd(c05.vz1().jiu().kwo().a28(var8));
      this.aeh = this.li4 = this.v5a = 1.0F;
      this.icv = this.mop = this.bw4 = 0.0;
      this.xx_ = 0.0F;
      this.bx4 = 80;
   }

   @Override
   public int ikr() {
      return 1;
   }

   @Override
   public void oss(q3g var1, i2h var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = this.esr.l3u();
      float var10 = this.esr.w2b();
      float var11 = this.esr.bhi();
      float var12 = this.esr.e8_();
      float var13 = 0.5F;
      float var14 = (float)(this.bc1 + (this.o2v - this.bc1) * (double)var3 - mrd);
      float var15 = (float)(this.o_z + (this.kfp - this.o_z) * (double)var3 - txo);
      float var16 = (float)(this.a4d + (this.vbd - this.a4d) * (double)var3 - bta);
      int var17 = this.azk(var3);
      int var18 = var17 >> 16 & 65535;
      int var19 = var17 & 65535;
      var1.g5o((double)(var14 - var4 * 0.5F - var7 * 0.5F), (double)(var15 - var5 * 0.5F), (double)(var16 - var6 * 0.5F - var8 * 0.5F))
         .h0a((double)var10, (double)var12)
         .gs4(this.aeh, this.li4, this.v5a, 1.0F)
         .iu0(var18, var19)
         .pzw();
      var1.g5o((double)(var14 - var4 * 0.5F + var7 * 0.5F), (double)(var15 + var5 * 0.5F), (double)(var16 - var6 * 0.5F + var8 * 0.5F))
         .h0a((double)var10, (double)var11)
         .gs4(this.aeh, this.li4, this.v5a, 1.0F)
         .iu0(var18, var19)
         .pzw();
      var1.g5o((double)(var14 + var4 * 0.5F + var7 * 0.5F), (double)(var15 + var5 * 0.5F), (double)(var16 + var6 * 0.5F + var8 * 0.5F))
         .h0a((double)var9, (double)var11)
         .gs4(this.aeh, this.li4, this.v5a, 1.0F)
         .iu0(var18, var19)
         .pzw();
      var1.g5o((double)(var14 + var4 * 0.5F - var7 * 0.5F), (double)(var15 - var5 * 0.5F), (double)(var16 + var6 * 0.5F - var8 * 0.5F))
         .h0a((double)var9, (double)var12)
         .gs4(this.aeh, this.li4, this.v5a, 1.0F)
         .iu0(var18, var19)
         .pzw();
   }
}
