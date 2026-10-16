public class r8t implements gnj {
   public r8t(stt var1) {
      this.mtz = var1;
   }

   public void yo8(osf var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (var1.gn_() != 0) {
         qfn var9 = c05.vz1().dwz();
         hzu.ixc();
         hzu.dp2();
         hzu.a2h(5.0F + 180.0F * ((e_y)this.mtz.fy4()).se6.pod / (float) Math.PI, 1.0F, 0.0F, 0.0F);
         hzu.a2h(90.0F, 1.0F, 0.0F, 0.0F);
         hzu.a4k(-0.9375F, -0.625F, -0.9375F);
         float var10 = 0.5F;
         hzu.syc(var10, -var10, var10);
         int var11 = var1.azk(var4);
         int var12 = var11 % 65536;
         int var13 = var11 / 65536;
         gis.w9e(gis.exn, (float)var12 / 1.0F, (float)var13 / 1.0F);
         hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
         this.mtz.gu4(yu2.nu_);
         var9._qd(ox_.xq2.l4i(), 1.0F);
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
      this.yo8((osf)var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
