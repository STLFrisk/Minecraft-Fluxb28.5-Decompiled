public class vtn extends mtg {
   public vtn() {
      super(0, 0, 64, 64);
      this.jqi.q3x(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.25F);
      this.jqi.i50(0.0F, 0.0F, 0.0F);
   }

   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      super.s_q(var1, var2, var3, var4, var5, var6, var7);
      this.jqi.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      super.ltd(var1, var2, var3, var4, var5, var6, var7);
      this.jqi.r80 = this.h18.r80;
      this.jqi.pod = this.h18.pod;
   }
}
