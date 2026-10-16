public class iq2 extends g6r {
   public tf8 gsh;
   public tf8 s9x;
   public tf8 syt;
   public tf8 qmf;
   public tf8 ky5;
   public tf8 ict;

   public iq2(float var1) {
      this(var1, 0.0F, 64, 64);
   }

   public iq2(float var1, float var2, int var3, int var4) {
      this.gsh = new tf8(this).swi(var3, var4);
      this.gsh.i50(0.0F, 0.0F + var2, 0.0F);
      this.gsh.fc6(0, 0).q3x(-4.0F, -10.0F, -4.0F, 8, 10, 8, var1);
      this.ict = new tf8(this).swi(var3, var4);
      this.ict.i50(0.0F, var2 - 2.0F, 0.0F);
      this.ict.fc6(24, 0).q3x(-1.0F, -1.0F, -6.0F, 2, 4, 2, var1);
      this.gsh.i_6(this.ict);
      this.s9x = new tf8(this).swi(var3, var4);
      this.s9x.i50(0.0F, 0.0F + var2, 0.0F);
      this.s9x.fc6(16, 20).q3x(-4.0F, 0.0F, -3.0F, 8, 12, 6, var1);
      this.s9x.fc6(0, 38).q3x(-4.0F, 0.0F, -3.0F, 8, 18, 6, var1 + 0.5F);
      this.syt = new tf8(this).swi(var3, var4);
      this.syt.i50(0.0F, 0.0F + var2 + 2.0F, 0.0F);
      this.syt.fc6(44, 22).q3x(-8.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.syt.fc6(44, 22).q3x(4.0F, -2.0F, -2.0F, 4, 8, 4, var1);
      this.syt.fc6(40, 38).q3x(-4.0F, 2.0F, -2.0F, 8, 4, 4, var1);
      this.qmf = new tf8(this, 0, 22).swi(var3, var4);
      this.qmf.i50(-2.0F, 12.0F + var2, 0.0F);
      this.qmf.q3x(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
      this.ky5 = new tf8(this, 0, 22).swi(var3, var4);
      this.ky5.hsi = true;
      this.ky5.i50(2.0F, 12.0F + var2, 0.0F);
      this.ky5.q3x(-2.0F, 0.0F, -2.0F, 4, 12, 4, var1);
   }

   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.gsh.vca(var7);
      this.s9x.vca(var7);
      this.qmf.vca(var7);
      this.ky5.vca(var7);
      this.syt.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      this.gsh.r80 = var4 / (180.0F / (float)Math.PI);
      this.gsh.pod = var5 / (180.0F / (float)Math.PI);
      this.syt.ca7 = 3.0F;
      this.syt.kit = -1.0F;
      this.syt.pod = -0.75F;
      this.qmf.pod = fe6.ssk(var1 * 0.6662F) * 1.4F * var2 * 0.5F;
      this.ky5.pod = fe6.ssk(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2 * 0.5F;
      this.qmf.r80 = 0.0F;
      this.ky5.r80 = 0.0F;
   }
}
