public class ya9 extends g6r {
   public tf8 soh;
   public tf8 lr1;
   public tf8 vy3;
   public tf8 jos;
   public tf8 y4k;

   public ya9() {
      float var1 = 4.0F;
      float var2 = 0.0F;
      this.vy3 = new tf8(this, 0, 0).swi(64, 64);
      this.vy3.q3x(-4.0F, -8.0F, -4.0F, 8, 8, 8, var2 - 0.5F);
      this.vy3.i50(0.0F, 0.0F + var1, 0.0F);
      this.jos = new tf8(this, 32, 0).swi(64, 64);
      this.jos.q3x(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.jos.i50(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.y4k = new tf8(this, 32, 0).swi(64, 64);
      this.y4k.q3x(-1.0F, 0.0F, -1.0F, 12, 2, 2, var2 - 0.5F);
      this.y4k.i50(0.0F, 0.0F + var1 + 9.0F - 7.0F, 0.0F);
      this.soh = new tf8(this, 0, 16).swi(64, 64);
      this.soh.q3x(-5.0F, -10.0F, -5.0F, 10, 10, 10, var2 - 0.5F);
      this.soh.i50(0.0F, 0.0F + var1 + 9.0F, 0.0F);
      this.lr1 = new tf8(this, 0, 36).swi(64, 64);
      this.lr1.q3x(-6.0F, -12.0F, -6.0F, 12, 12, 12, var2 - 0.5F);
      this.lr1.i50(0.0F, 0.0F + var1 + 20.0F, 0.0F);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      super.ltd(var1, var2, var3, var4, var5, var6, var7);
      this.vy3.r80 = var4 / (180.0F / (float)Math.PI);
      this.vy3.pod = var5 / (180.0F / (float)Math.PI);
      this.soh.r80 = var4 / (180.0F / (float)Math.PI) * 0.25F;
      float var8 = fe6.rtn(this.soh.r80);
      float var9 = fe6.ssk(this.soh.r80);
      this.jos.oo7 = 1.0F;
      this.y4k.oo7 = -1.0F;
      this.jos.r80 = 0.0F + this.soh.r80;
      this.y4k.r80 = (float) Math.PI + this.soh.r80;
      this.jos._ki = var9 * 5.0F;
      this.jos.kit = -var8 * 5.0F;
      this.y4k._ki = -var9 * 5.0F;
      this.y4k.kit = var8 * 5.0F;
   }

   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.soh.vca(var7);
      this.lr1.vca(var7);
      this.vy3.vca(var7);
      this.jos.vca(var7);
      this.y4k.vca(var7);
   }
}
