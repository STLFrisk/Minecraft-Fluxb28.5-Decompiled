public class q_s extends flo {
   private Entity wpq;

   public q_s(OpaquePredicate var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.aeh = this.li4 = this.v5a = 1.0F;
      this.icv = this.mop = this.bw4 = 0.0;
      this.xx_ = 0.0F;
      this.bx4 = 30;
   }

   @Override
   public int ikr() {
      return 3;
   }

   @Override
   public void xx_() {
      super.xx_();
      if (this.wpq == null) {
         c9p var1 = new c9p(this.oay);
         var1.bkk();
         this.wpq = var1;
      }
   }

   @Override
   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (this.wpq != null) {
         hr_ var9 = Minecraft.vz1().ibs();
         var9.ojk(flo.mrd, flo.txo, flo.bta);
         float var10 = 0.42553192F;
         float var11 = ((float)this.goc + var3) / (float)this.bx4;
         hzu.jun(true);
         hzu.spd();
         hzu.m45();
         hzu.ru7(770, 771);
         float var12 = 240.0F;
         gis.w9e(gis.exn, var12, var12);
         hzu.dp2();
         float var13 = 0.05F + 0.5F * fe6.rtn(var11 * (float) Math.PI);
         hzu.wn0(1.0F, 1.0F, 1.0F, var13);
         hzu.a4k(0.0F, 1.8F, 0.0F);
         hzu.a2h(180.0F - var2.x5k, 0.0F, 1.0F, 0.0F);
         hzu.a2h(60.0F - 150.0F * var11 - var2.y2i, 1.0F, 0.0F, 0.0F);
         hzu.a4k(0.0F, -0.4F, -1.5F);
         hzu.syc(var10, var10, var10);
         this.wpq.x5k = this.wpq.p3h = 0.0F;
         this.wpq.q6c = this.wpq.h82 = 0.0F;
         var9.ajg(this.wpq, 0.0, 0.0, 0.0, 0.0F, var3);
         hzu.x3w();
         hzu.m45();
      }
   }
}
