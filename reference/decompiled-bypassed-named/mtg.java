public class mtg extends g6r {
   public tf8 h18;

   public mtg() {
      this(0, 35, 64, 64);
   }

   public mtg(int var1, int var2, int var3, int var4) {
      this.dsx = var3;
      this.apc = var4;
      this.h18 = new tf8(this, var1, var2);
      this.h18.q3x(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
      this.h18.i50(0.0F, 0.0F, 0.0F);
   }

   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.h18.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, EntityLivingBase var7) {
      super.ltd(var1, var2, var3, var4, var5, var6, var7);
      this.h18.r80 = var4 / (180.0F / (float)Math.PI);
      this.h18.pod = var5 / (180.0F / (float)Math.PI);
   }
}
