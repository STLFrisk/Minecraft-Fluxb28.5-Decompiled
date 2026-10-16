public class xx_ extends tv9 {
   public xx_() {
      super(12, 0.0F);
      this._48 = new tf8(this, 0, 0);
      this._48.q3x(-3.0F, -4.0F, -4.0F, 6, 6, 6, 0.6F);
      this._48.i50(0.0F, 6.0F, -8.0F);
      this.qgr = new tf8(this, 28, 8);
      this.qgr.q3x(-4.0F, -10.0F, -7.0F, 8, 16, 6, 1.75F);
      this.qgr.i50(0.0F, 5.0F, 2.0F);
      float var1 = 0.5F;
      this._bb = new tf8(this, 0, 16);
      this._bb.q3x(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this._bb.i50(-3.0F, 12.0F, 7.0F);
      this.ukf = new tf8(this, 0, 16);
      this.ukf.q3x(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.ukf.i50(3.0F, 12.0F, 7.0F);
      this.rc5 = new tf8(this, 0, 16);
      this.rc5.q3x(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.rc5.i50(-3.0F, 12.0F, -5.0F);
      this.yt3 = new tf8(this, 0, 16);
      this.yt3.q3x(-2.0F, 0.0F, -2.0F, 4, 6, 4, var1);
      this.yt3.i50(3.0F, 12.0F, -5.0F);
   }

   @Override
   public void v3g(g_3 var1, float var2, float var3, float var4) {
      super.v3g(var1, var2, var3, var4);
      this._48.ca7 = 6.0F + ((ia2)var1).o4v(var4) * 9.0F;
      this.cs0 = ((ia2)var1).kme(var4);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      super.ltd(var1, var2, var3, var4, var5, var6, var7);
      this._48.pod = this.cs0;
   }
}
