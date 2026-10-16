public class z5t extends g6r {
   public tf8 ayr = new tf8(this).fc6(0, 0).ge4(-6.0F, -5.0F, 0.0F, 6, 10, 0);
   public tf8 sue = new tf8(this).fc6(16, 0).ge4(0.0F, -5.0F, 0.0F, 6, 10, 0);
   public tf8 g2l = new tf8(this).fc6(0, 10).ge4(0.0F, -4.0F, -0.99F, 5, 8, 1);
   public tf8 lf4 = new tf8(this).fc6(12, 10).ge4(0.0F, -4.0F, -0.01F, 5, 8, 1);
   public tf8 c5u = new tf8(this).fc6(24, 10).ge4(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public tf8 kf_ = new tf8(this).fc6(24, 10).ge4(0.0F, -4.0F, 0.0F, 5, 8, 0);
   public tf8 it8 = new tf8(this).fc6(12, 0).ge4(-1.0F, -5.0F, 0.0F, 2, 10, 0);

   public z5t() {
      this.ayr.i50(0.0F, 0.0F, -1.0F);
      this.sue.i50(0.0F, 0.0F, 1.0F);
      this.it8.r80 = (float) (Math.PI / 2);
   }

   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.ayr.vca(var7);
      this.sue.vca(var7);
      this.it8.vca(var7);
      this.g2l.vca(var7);
      this.lf4.vca(var7);
      this.c5u.vca(var7);
      this.kf_.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, EntityLivingBase var7) {
      float var8 = (fe6.rtn(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.ayr.r80 = (float) Math.PI + var8;
      this.sue.r80 = -var8;
      this.g2l.r80 = var8;
      this.lf4.r80 = -var8;
      this.c5u.r80 = var8 - var8 * 2.0F * var2;
      this.kf_.r80 = var8 - var8 * 2.0F * var3;
      this.g2l._ki = fe6.rtn(var8);
      this.lf4._ki = fe6.rtn(var8);
      this.c5u._ki = fe6.rtn(var8);
      this.kf_._ki = fe6.rtn(var8);
   }
}
