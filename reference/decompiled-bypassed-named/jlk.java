public class jlk extends liu {
   public final u7m wv0;
   private final y1w kof;

   public jlk(hr_ var1, u7m var2, y1w var3) {
      super(var1);
      this.wv0 = var2;
      this.kof = var3;
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      hzu.dp2();
      hzu.a4k((float)var2, (float)var4, (float)var6);
      hzu.ixc();
      hzu.syc(0.5F, 0.5F, 0.5F);
      hzu.a2h(-this.l0g.s7e, 0.0F, 1.0F, 0.0F);
      hzu.a2h(this.l0g.fw9, 1.0F, 0.0F, 0.0F);
      this.gu4(yu2.nu_);
      this.kof.ag9(this.v4s(var1), flk$gbm.fru);
      hzu.eiq();
      hzu.x3w();
      super.apl(var1, var2, var4, var6, var8, var9);
   }

   public erg v4s(EntityLivingBase var1) {
      return new erg(this.wv0, 1, 0);
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return yu2.nu_;
   }
}
