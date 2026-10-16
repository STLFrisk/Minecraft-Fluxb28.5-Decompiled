public class t4e extends g6r {
   public tf8 qu5;
   public tf8 fay;
   public tf8 ywh;
   public tf8 f2n;
   public tf8 kb5;
   public tf8 gtb;
   public tf8 gte;

   public t4e() {
      this(0.0F);
   }

   public t4e(float var1) {
      byte var2 = 6;
      this.qu5 = new tf8(this, 0, 0);
      this.qu5.q3x(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1);
      this.qu5.i50(0.0F, (float)var2, 0.0F);
      this.fay = new tf8(this, 32, 0);
      this.fay.q3x(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 + 0.5F);
      this.fay.i50(0.0F, (float)var2, 0.0F);
      this.ywh = new tf8(this, 16, 16);
      this.ywh.q3x(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.ywh.i50(0.0F, (float)var2, 0.0F);
      this.f2n = new tf8(this, 0, 16);
      this.f2n.q3x(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.f2n.i50(-2.0F, (float)(12 + var2), 4.0F);
      this.kb5 = new tf8(this, 0, 16);
      this.kb5.q3x(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.kb5.i50(2.0F, (float)(12 + var2), 4.0F);
      this.gtb = new tf8(this, 0, 16);
      this.gtb.q3x(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.gtb.i50(-2.0F, (float)(12 + var2), -4.0F);
      this.gte = new tf8(this, 0, 16);
      this.gte.q3x(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.gte.i50(2.0F, (float)(12 + var2), -4.0F);
   }

   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.qu5.vca(var7);
      this.ywh.vca(var7);
      this.f2n.vca(var7);
      this.kb5.vca(var7);
      this.gtb.vca(var7);
      this.gte.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, EntityLivingBase var7) {
      this.qu5.r80 = var4 / (180.0F / (float)Math.PI);
      this.qu5.pod = var5 / (180.0F / (float)Math.PI);
      this.f2n.pod = fe6.ssk(var1 * 0.6662F) * 1.4F * var2;
      this.kb5.pod = fe6.ssk(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.gtb.pod = fe6.ssk(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.gte.pod = fe6.ssk(var1 * 0.6662F) * 1.4F * var2;
   }
}
