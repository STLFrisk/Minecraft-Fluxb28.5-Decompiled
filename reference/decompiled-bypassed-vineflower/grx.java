public class grx implements _aq {
   public grx() {
      this(g2u.n16());
   }

   public grx(uka var1) {
      this.qkv = var1;
   }

   @Override
   public void _wl(double var1, double var3, double var5) {
      this.h30 = var1;
      this.hhe = var3;
      this.g45 = var5;
   }

   public boolean zru(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.qkv.isBoxInFrustum(var1 - this.h30, var3 - this.hhe, var5 - this.g45, var7 - this.h30, var9 - this.hhe, var11 - this.g45);
   }

   @Override
   public boolean n2v(nh4 var1) {
      return this.zru(var1.rlc, var1.bx_, var1.t8n, var1.t_2, var1.i2c, var1.oqj);
   }

   public boolean p5n(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.qkv.y4t(var1 - this.h30, var3 - this.hhe, var5 - this.g45, var7 - this.h30, var9 - this.hhe, var11 - this.g45);
   }
}
