public class tps extends liu {
   public tps(hr_ var1, float var2) {
      super(var1);
      this.qw0 = var2;
   }

   public void rg8(c5x var1, double var2, double var4, double var6, float var8, float var9) {
      hzu.dp2();
      this.sat(var1);
      hzu.a4k((float)var2, (float)var4, (float)var6);
      hzu.ixc();
      hzu.syc(this.qw0, this.qw0, this.qw0);
      sla var10 = Minecraft.vz1().jiu().kwo().a28(xbr.td3);
      jom var11 = jom.yut();
      q3g var12 = var11.zuq();
      float var13 = var10.l3u();
      float var14 = var10.w2b();
      float var15 = var10.bhi();
      float var16 = var10.e8_();
      float var17 = 1.0F;
      float var18 = 0.5F;
      float var19 = 0.25F;
      hzu.a2h(180.0F - this.l0g.s7e, 0.0F, 1.0F, 0.0F);
      hzu.a2h(-this.l0g.fw9, 1.0F, 0.0F, 0.0F);
      var12.ezr(7, gnl.c03);
      var12.g5o(-0.5, -0.25, 0.0).h0a((double)var13, (double)var16).h3y(0.0F, 1.0F, 0.0F).pzw();
      var12.g5o(0.5, -0.25, 0.0).h0a((double)var14, (double)var16).h3y(0.0F, 1.0F, 0.0F).pzw();
      var12.g5o(0.5, 0.75, 0.0).h0a((double)var14, (double)var15).h3y(0.0F, 1.0F, 0.0F).pzw();
      var12.g5o(-0.5, 0.75, 0.0).h0a((double)var13, (double)var15).h3y(0.0F, 1.0F, 0.0F).pzw();
      var11.q7g();
      hzu.eiq();
      hzu.x3w();
      super.apl(var1, var2, var4, var6, var8, var9);
   }

   public gdz ti8(c5x var1) {
      return yu2.nu_;
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.ti8((c5x)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.rg8((c5x)var1, var2, var4, var6, var8, var9);
   }
}
