public class p3k implements gnj {
   private final wsr r9h;

   public p3k(wsr var1) {
      this.r9h = var1;
   }

   public void gqp(qpg var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (!var1.h5u()) {
         hzu.dp2();
         this.r9h.fy4().vy3.f2u(0.0625F);
         float var9 = 0.625F;
         hzu.a4k(0.0F, -0.34375F, 0.0F);
         hzu.a2h(180.0F, 0.0F, 1.0F, 0.0F);
         hzu.syc(var9, -var9, -var9);
         c05.vz1().xoy().xwn(var1, new erg(ox_.jzx, 1), flk$gbm.h9h);
         hzu.x3w();
      }
   }

   @Override
   public boolean shouldCombineTextures() {
      return true;
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.gqp((qpg)var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
