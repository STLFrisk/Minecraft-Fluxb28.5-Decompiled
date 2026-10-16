public class wm8 extends g6r {
   public tf8 p1z;
   public tf8 f9c;
   public tf8 j75;
   public tf8 san;
   public tf8 wsm;
   public tf8 ula;
   public tf8 z9r;
   public tf8 _tr;

   public wm8() {
      byte var1 = 16;
      this.p1z = new tf8(this, 0, 0);
      this.p1z.q3x(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
      this.p1z.i50(0.0F, (float)(-1 + var1), -4.0F);
      this.z9r = new tf8(this, 14, 0);
      this.z9r.q3x(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
      this.z9r.i50(0.0F, (float)(-1 + var1), -4.0F);
      this._tr = new tf8(this, 14, 4);
      this._tr.q3x(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
      this._tr.i50(0.0F, (float)(-1 + var1), -4.0F);
      this.f9c = new tf8(this, 0, 9);
      this.f9c.q3x(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
      this.f9c.i50(0.0F, (float)var1, 0.0F);
      this.j75 = new tf8(this, 26, 0);
      this.j75.ge4(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.j75.i50(-2.0F, (float)(3 + var1), 1.0F);
      this.san = new tf8(this, 26, 0);
      this.san.ge4(-1.0F, 0.0F, -3.0F, 3, 5, 3);
      this.san.i50(1.0F, (float)(3 + var1), 1.0F);
      this.wsm = new tf8(this, 24, 13);
      this.wsm.ge4(0.0F, 0.0F, -3.0F, 1, 4, 6);
      this.wsm.i50(-4.0F, (float)(-3 + var1), 0.0F);
      this.ula = new tf8(this, 24, 13);
      this.ula.ge4(-1.0F, 0.0F, -3.0F, 1, 4, 6);
      this.ula.i50(4.0F, (float)(-3 + var1), 0.0F);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      int var8 = t9d.b();

      wm8 var10000;
      label46: {
         label41: {
            try {
               this.ltd(var2, var3, var4, var5, var6, var7, var1);
               var10000 = this;
               if (var8 == 0) {
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
               hzu.a4k(0.0F, 5.0F * var7, 2.0F * var7);
               this.p1z.vca(var7);
               this.z9r.vca(var7);
               this._tr.vca(var7);
               hzu.x3w();
               hzu.dp2();
               hzu.syc(1.0F / var9, 1.0F / var9, 1.0F / var9);
               hzu.a4k(0.0F, 24.0F * var7, 0.0F);
               this.f9c.vca(var7);
               this.j75.vca(var7);
               this.san.vca(var7);
               this.wsm.vca(var7);
               this.ula.vca(var7);
               hzu.x3w();
               if (var8 != 0) {
                  return;
               }
            } catch (oov var11) {
               boolean var10001 = false;
               throw a(var11);
            }
         }

         try {
            this.p1z.vca(var7);
            this.z9r.vca(var7);
            this._tr.vca(var7);
            this.f9c.vca(var7);
            this.j75.vca(var7);
            this.san.vca(var7);
            this.wsm.vca(var7);
            var10000 = this;
         } catch (oov var10) {
            boolean var14 = false;
            throw a(var10);
         }
      }

      var10000.ula.vca(var7);
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      this.p1z.pod = var5 / (180.0F / (float)Math.PI);
      this.p1z.r80 = var4 / (180.0F / (float)Math.PI);
      this.z9r.pod = this.p1z.pod;
      this.z9r.r80 = this.p1z.r80;
      this._tr.pod = this.p1z.pod;
      this._tr.r80 = this.p1z.r80;
      this.f9c.pod = (float) (Math.PI / 2);
      this.j75.pod = fe6.ssk(var1 * 0.6662F) * 1.4F * var2;
      this.san.pod = fe6.ssk(var1 * 0.6662F + (float) Math.PI) * 1.4F * var2;
      this.wsm.oo7 = var3;
      this.ula.oo7 = -var3;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
