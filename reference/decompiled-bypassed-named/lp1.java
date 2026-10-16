public class lp1 extends g6r {
   public lp1() {
      this.dsx = 64;
      this.apc = 64;
      this.y5x = new tf8(this, 0, 0);
      this.y5x.ge4(-3.0F, -3.0F, -3.0F, 6, 6, 6);
      tf8 var1 = new tf8(this, 24, 0);
      var1.ge4(-4.0F, -6.0F, -2.0F, 3, 4, 1);
      this.y5x.i_6(var1);
      tf8 var2 = new tf8(this, 24, 0);
      var2.hsi = true;
      var2.ge4(1.0F, -6.0F, -2.0F, 3, 4, 1);
      this.y5x.i_6(var2);
      this.p9q = new tf8(this, 0, 16);
      this.p9q.ge4(-3.0F, 4.0F, -3.0F, 6, 12, 6);
      this.p9q.fc6(0, 34).ge4(-5.0F, 16.0F, 0.0F, 10, 6, 1);
      this.m4q = new tf8(this, 42, 0);
      this.m4q.ge4(-12.0F, 1.0F, 1.5F, 10, 16, 1);
      this.h3r = new tf8(this, 24, 16);
      this.h3r.i50(-12.0F, 1.0F, 1.5F);
      this.h3r.ge4(-8.0F, 1.0F, 0.0F, 8, 12, 1);
      this.rww = new tf8(this, 42, 0);
      this.rww.hsi = true;
      this.rww.ge4(2.0F, 1.0F, 1.5F, 10, 16, 1);
      this.md8 = new tf8(this, 24, 16);
      this.md8.hsi = true;
      this.md8.i50(12.0F, 1.0F, 1.5F);
      this.md8.ge4(0.0F, 1.0F, 0.0F, 8, 12, 1);
      this.p9q.i_6(this.m4q);
      this.p9q.i_6(this.rww);
      this.m4q.i_6(this.h3r);
      this.rww.i_6(this.md8);
   }

   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.y5x.vca(var7);
      this.p9q.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, EntityLivingBase var7) {
      int var8 = OpaquePredicate.c();
      if (((EntityAnimal)var7).qm1()) {
         float var9 = 180.0F / (float)Math.PI;
         this.y5x.pod = var5 / (180.0F / (float)Math.PI);
         this.y5x.r80 = (float) Math.PI - var4 / (180.0F / (float)Math.PI);
         this.y5x.oo7 = (float) Math.PI;
         this.y5x.i50(0.0F, -2.0F, 0.0F);
         this.m4q.i50(-3.0F, 0.0F, 3.0F);
         this.rww.i50(3.0F, 0.0F, 3.0F);
         this.p9q.pod = (float) Math.PI;
         this.m4q.pod = (float) (-Math.PI / 20);
         this.m4q.r80 = (float) (-Math.PI * 2.0 / 5.0);
         this.h3r.r80 = -1.7278761F;
         this.rww.pod = this.m4q.pod;
         this.rww.r80 = -this.m4q.r80;
         this.md8.r80 = -this.h3r.r80;
         if (var8 == 0) {
            return;
         }
      }

      float var10 = 180.0F / (float)Math.PI;
      this.y5x.pod = var5 / (180.0F / (float)Math.PI);
      this.y5x.r80 = var4 / (180.0F / (float)Math.PI);
      this.y5x.oo7 = 0.0F;
      this.y5x.i50(0.0F, 0.0F, 0.0F);
      this.m4q.i50(0.0F, 0.0F, 0.0F);
      this.rww.i50(0.0F, 0.0F, 0.0F);
      this.p9q.pod = (float) (Math.PI / 4) + fe6.ssk(var3 * 0.1F) * 0.15F;
      this.p9q.r80 = 0.0F;
      this.m4q.r80 = fe6.ssk(var3 * 1.3F) * (float) Math.PI * 0.25F;
      this.rww.r80 = -this.m4q.r80;
      this.h3r.r80 = this.m4q.r80 * 0.5F;
      this.md8.r80 = -this.m4q.r80 * 0.5F;
   }
}
