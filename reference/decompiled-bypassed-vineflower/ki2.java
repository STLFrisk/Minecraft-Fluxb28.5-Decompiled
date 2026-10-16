public class ki2 extends flo {
   public ki2(t9d var1, double var2, double var4, double var6, u7m var8) {
      this(var1, var2, var4, var6, var8, 0);
   }

   public ki2(t9d var1, double var2, double var4, double var6, double var8, double var10, double var12, u7m var14, int var15) {
      this(var1, var2, var4, var6, var14, var15);
      this.icv *= 0.1F;
      this.mop *= 0.1F;
      this.bw4 *= 0.1F;
      this.icv += var8;
      this.mop += var10;
      this.bw4 += var12;
   }

   public ki2(t9d var1, double var2, double var4, double var6, u7m var8, int var9) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.nsd(c05.vz1().jiu().kwo().eyp(var8, var9));
      this.aeh = this.li4 = this.v5a = 1.0F;
      this.xx_ = ox_._mc.gia;
      this.ysq /= 2.0F;
   }

   @Override
   public int ikr() {
      return 1;
   }

   @Override
   public void oss(q3g var1, i2h var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var10 = ((float)this._u1 + this.p7w / 4.0F) / 16.0F;
      int var10000 = t9d.c();
      float var11 = var10 + 0.015609375F;
      int var9 = var10000;
      float var12 = ((float)this.p43 + this.omz / 4.0F) / 16.0F;
      float var13 = var12 + 0.015609375F;
      float var14 = 0.1F * this.ysq;

      label21: {
         label20: {
            try {
               var22 = this;
               if (var9 != 0) {
                  break label21;
               }

               if (this.esr == null) {
                  break label20;
               }
            } catch (oov var21) {
               throw a(var21);
            }

            var10 = this.esr.oon((double)(this.p7w / 4.0F * 16.0F));
            var11 = this.esr.oon((double)((this.p7w + 1.0F) / 4.0F * 16.0F));
            var12 = this.esr.h0c((double)(this.omz / 4.0F * 16.0F));
            var13 = this.esr.h0c((double)((this.omz + 1.0F) / 4.0F * 16.0F));
         }

         var22 = this;
      }

      float var15 = (float)(var22.bc1 + (this.o2v - this.bc1) * (double)var3 - mrd);
      float var16 = (float)(this.o_z + (this.kfp - this.o_z) * (double)var3 - txo);
      float var17 = (float)(this.a4d + (this.vbd - this.a4d) * (double)var3 - bta);
      int var18 = this.azk(var3);
      int var19 = var18 >> 16 & 65535;
      int var20 = var18 & 65535;
      var1.g5o((double)(var15 - var4 * var14 - var7 * var14), (double)(var16 - var5 * var14), (double)(var17 - var6 * var14 - var8 * var14))
         .h0a((double)var10, (double)var13)
         .gs4(this.aeh, this.li4, this.v5a, 1.0F)
         .iu0(var19, var20)
         .pzw();
      var1.g5o((double)(var15 - var4 * var14 + var7 * var14), (double)(var16 + var5 * var14), (double)(var17 - var6 * var14 + var8 * var14))
         .h0a((double)var10, (double)var12)
         .gs4(this.aeh, this.li4, this.v5a, 1.0F)
         .iu0(var19, var20)
         .pzw();
      var1.g5o((double)(var15 + var4 * var14 + var7 * var14), (double)(var16 + var5 * var14), (double)(var17 + var6 * var14 + var8 * var14))
         .h0a((double)var11, (double)var12)
         .gs4(this.aeh, this.li4, this.v5a, 1.0F)
         .iu0(var19, var20)
         .pzw();
      var1.g5o((double)(var15 + var4 * var14 - var7 * var14), (double)(var16 - var5 * var14), (double)(var17 + var6 * var14 - var8 * var14))
         .h0a((double)var11, (double)var13)
         .gs4(this.aeh, this.li4, this.v5a, 1.0F)
         .iu0(var19, var20)
         .pzw();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
