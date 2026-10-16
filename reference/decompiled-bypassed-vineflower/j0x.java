public class j0x implements gnj {
   public j0x(dnm var1) {
      this.ejy = var1;
   }

   public void zen(a_t var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      zfz var9 = var1.ejt();
      if (var9.r_y().p1r() != p3y.cei) {
         qfn var10 = c05.vz1().dwz();
         hzu.ixc();
         hzu.dp2();
         hzu.a4k(0.0F, 0.6875F, -0.75F);
         hzu.a2h(20.0F, 1.0F, 0.0F, 0.0F);
         hzu.a2h(45.0F, 0.0F, 1.0F, 0.0F);
         hzu.a4k(0.25F, 0.1875F, 0.25F);
         float var11 = 0.5F;
         hzu.syc(-var11, -var11, var11);
         int var12 = var1.azk(var4);
         int var13 = var12 % 65536;
         int var14 = var12 / 65536;
         gis.w9e(gis.exn, (float)var13 / 1.0F, (float)var14 / 1.0F);
         hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
         this.ejy.gu4(yu2.nu_);
         var10._qd(var9, 1.0F);
         hzu.x3w();
         hzu.eiq();
      }
   }

   @Override
   public boolean shouldCombineTextures() {
      return false;
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.zen((a_t)var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
