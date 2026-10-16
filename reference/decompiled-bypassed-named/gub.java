public class gub extends g6r {
   public tf8 p8d;
   public tf8[] _6j;

   public gub() {
      int var10000 = OpaquePredicate.c();
      this._6j = new tf8[8];
      byte var2 = -16;
      int var1 = var10000;
      this.p8d = new tf8(this, 0, 0);
      this.p8d.ge4(-6.0F, -8.0F, -6.0F, 12, 16, 12);
      this.p8d.ca7 += (float)(24 + var2);
      int var3 = 0;

      while (var3 < this._6j.length) {
         this._6j[var3] = new tf8(this, 48, 0);
         double var4 = (double)var3 * Math.PI * 2.0 / (double)this._6j.length;
         float var6 = (float)Math.cos(var4) * 5.0F;
         float var7 = (float)Math.sin(var4) * 5.0F;
         this._6j[var3].ge4(-1.0F, 0.0F, -1.0F, 2, 18, 2);
         this._6j[var3]._ki = var6;
         this._6j[var3].kit = var7;
         this._6j[var3].ca7 = (float)(31 + var2);
         var4 = (double)var3 * Math.PI * -2.0 / (double)this._6j.length + (Math.PI / 2);
         this._6j[var3].r80 = (float)var4;
         var3++;
         if (var1 != 0) {
            break;
         }
      }
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, EntityLivingBase var7) {
      tf8[] var9 = this._6j;
      int var10000 = OpaquePredicate.c();
      int var10 = var9.length;
      int var8 = var10000;
      int var11 = 0;

      while (var11 < var10) {
         tf8 var12 = var9[var11];
         var12.pod = var3;
         var11++;
         if (var8 != 0) {
            break;
         }
      }
   }

   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      int var10000 = OpaquePredicate.b();
      this.p8d.vca(var7);
      int var9 = 0;
      int var8 = var10000;

      while (var9 < this._6j.length) {
         this._6j[var9].vca(var7);
         var9++;
         if (var8 == 0) {
            break;
         }
      }
   }
}
