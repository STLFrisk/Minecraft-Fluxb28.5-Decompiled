public class eur extends z14 {
   public eur() {
      this(0.0F, false);
   }

   public eur(float var1, float var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public eur(float var1, boolean var2) {
      super(var1, 0.0F, 64, var2 ? 32 : 64);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      super.ltd(var1, var2, var3, var4, var5, var6, var7);
      float var8 = fe6.rtn(this._5e * (float) Math.PI);
      float var9 = fe6.rtn((1.0F - (1.0F - this._5e) * (1.0F - this._5e)) * (float) Math.PI);
      this.xwb.oo7 = 0.0F;
      this.hd2.oo7 = 0.0F;
      this.xwb.r80 = -(0.1F - var8 * 0.6F);
      this.hd2.r80 = 0.1F - var8 * 0.6F;
      this.xwb.pod = (float) (-Math.PI / 2);
      this.hd2.pod = (float) (-Math.PI / 2);
      this.xwb.pod -= var8 * 1.2F - var9 * 0.4F;
      this.hd2.pod -= var8 * 1.2F - var9 * 0.4F;
      this.xwb.oo7 = this.xwb.oo7 + fe6.ssk(var3 * 0.09F) * 0.05F + 0.05F;
      this.hd2.oo7 = this.hd2.oo7 - (fe6.ssk(var3 * 0.09F) * 0.05F + 0.05F);
      this.xwb.pod = this.xwb.pod + fe6.rtn(var3 * 0.067F) * 0.05F;
      this.hd2.pod = this.hd2.pod - fe6.rtn(var3 * 0.067F) * 0.05F;
   }
}
