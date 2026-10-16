public class et2 extends g6r {
   public tf8 bgk;

   public et2() {
      this(0, 0, 32, 32);
   }

   public et2(int var1, int var2, int var3, int var4) {
      this.dsx = var3;
      this.apc = var4;
      this.bgk = new tf8(this, var1, var2);
      this.bgk.q3x(-3.0F, -6.0F, -3.0F, 6, 8, 6, 0.0F);
      this.bgk.i50(0.0F, 0.0F, 0.0F);
   }

   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.bgk.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, EntityLivingBase var7) {
      super.ltd(var1, var2, var3, var4, var5, var6, var7);
      this.bgk.r80 = var4 / (180.0F / (float)Math.PI);
      this.bgk.pod = var5 / (180.0F / (float)Math.PI);
   }
}
