public class c6y$mhn extends flo {
   public c6y$mhn(t9d var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.bx4 = 4;
   }

   @Override
   public void oss(q3g var1, i2h var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = 0.25F;
      float var10 = 0.5F;
      float var11 = 0.125F;
      float var12 = 0.375F;
      float var13 = 7.1F * fe6.rtn(((float)this.goc + var3 - 1.0F) * 0.25F * (float) Math.PI);
      this.xof = 0.6F - ((float)this.goc + var3 - 1.0F) * 0.25F * 0.5F;
      float var14 = (float)(this.bc1 + (this.o2v - this.bc1) * (double)var3 - mrd);
      float var15 = (float)(this.o_z + (this.kfp - this.o_z) * (double)var3 - txo);
      float var16 = (float)(this.a4d + (this.vbd - this.a4d) * (double)var3 - bta);
      int var17 = this.azk(var3);
      int var18 = var17 >> 16 & 65535;
      int var19 = var17 & 65535;
      var1.g5o((double)(var14 - var4 * var13 - var7 * var13), (double)(var15 - var5 * var13), (double)(var16 - var6 * var13 - var8 * var13))
         .h0a(0.5, 0.375)
         .gs4(this.aeh, this.li4, this.v5a, this.xof)
         .iu0(var18, var19)
         .pzw();
      var1.g5o((double)(var14 - var4 * var13 + var7 * var13), (double)(var15 + var5 * var13), (double)(var16 - var6 * var13 + var8 * var13))
         .h0a(0.5, 0.125)
         .gs4(this.aeh, this.li4, this.v5a, this.xof)
         .iu0(var18, var19)
         .pzw();
      var1.g5o((double)(var14 + var4 * var13 + var7 * var13), (double)(var15 + var5 * var13), (double)(var16 + var6 * var13 + var8 * var13))
         .h0a(0.25, 0.125)
         .gs4(this.aeh, this.li4, this.v5a, this.xof)
         .iu0(var18, var19)
         .pzw();
      var1.g5o((double)(var14 + var4 * var13 - var7 * var13), (double)(var15 - var5 * var13), (double)(var16 + var6 * var13 - var8 * var13))
         .h0a(0.25, 0.375)
         .gs4(this.aeh, this.li4, this.v5a, this.xof)
         .iu0(var18, var19)
         .pzw();
   }
}
