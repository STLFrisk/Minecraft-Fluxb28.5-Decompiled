public class tv9 extends g6r {
   public tf8 _48 = new tf8(this, 0, 0);
   public tf8 qgr;
   public tf8 _bb;
   public tf8 ukf;
   public tf8 rc5;
   public tf8 yt3;
   public float i_x = 8.0F;
   public float obr = 4.0F;

   public tv9(int var1, float var2) {
      this._48.q3x(-4.0F, -4.0F, -8.0F, 8, 8, 8, var2);
      this._48.i50(0.0F, (float)(18 - var1), -6.0F);
      this.qgr = new tf8(this, 28, 8);
      this.qgr.q3x(-5.0F, -10.0F, -7.0F, 10, 16, 8, var2);
      this.qgr.i50(0.0F, (float)(17 - var1), 2.0F);
      this._bb = new tf8(this, 0, 16);
      this._bb.q3x(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this._bb.i50(-3.0F, (float)(24 - var1), 7.0F);
      this.ukf = new tf8(this, 0, 16);
      this.ukf.q3x(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.ukf.i50(3.0F, (float)(24 - var1), 7.0F);
      this.rc5 = new tf8(this, 0, 16);
      this.rc5.q3x(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.rc5.i50(-3.0F, (float)(24 - var1), -5.0F);
      this.yt3 = new tf8(this, 0, 16);
      this.yt3.q3x(-2.0F, 0.0F, -2.0F, 4, var1, 4, var2);
      this.yt3.i50(3.0F, (float)(24 - var1), -5.0F);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = OpaquePredicate.c();

      tv9 var10000;
      label46: {
         label41: {
            try {
               this.ltd(var2, var3, var4, var5, var6, var7, var1);
               var10000 = this;
               if (var8 != 0) {
                  break label46;
               }

               if (!this._a0) {
                  break label41;
               }
            } catch (oov var12) {
               throw a(var12);
            }

            float var9 = 2.0F;

            try {
               hzu.dp2();
               hzu.a4k(0.0F, this.i_x * var7, this.obr * var7);
               this._48.vca(var7);
               hzu.x3w();
               hzu.dp2();
               hzu.syc(1.0F / var9, 1.0F / var9, 1.0F / var9);
               hzu.a4k(0.0F, 24.0F * var7, 0.0F);
               this.qgr.vca(var7);
               this._bb.vca(var7);
               this.ukf.vca(var7);
               this.rc5.vca(var7);
               this.yt3.vca(var7);
               hzu.x3w();
               if (var8 == 0) {
                  return;
               }
            } catch (oov var11) {
               boolean var10001 = false;
               throw a(var11);
            }
         }

         try {
            this._48.vca(var7);
            this.qgr.vca(var7);
            this._bb.vca(var7);
            this.ukf.vca(var7);
            this.rc5.vca(var7);
            var10000 = this;
         } catch (oov var10) {
            boolean var14 = false;
            throw a(var10);
         }
      }

      var10000.yt3.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, EntityLivingBase var7) {
      float var8 = 180.0F / (float)Math.PI;
      this._48.pod = var5 / (180.0F / (float)Math.PI);
      this._48.r80 = var4 / (180.0F / (float)Math.PI);
      this.qgr.pod = (float) (Math.PI / 2);
      this._bb.pod = fe6.ssk(var1 * 0.6662F) * 1.4F * var2;
      this.ukf.pod = fe6.ssk(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.rc5.pod = fe6.ssk(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.yt3.pod = fe6.ssk(var1 * 0.6662F) * 1.4F * var2;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
