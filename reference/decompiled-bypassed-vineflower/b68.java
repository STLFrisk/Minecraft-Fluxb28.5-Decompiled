public class b68 extends g6r {
   public b68() {
      int var10000 = t9d.c();
      float var2 = -3.5F;
      int var1 = var10000;
      int var3 = 0;

      while (var3 < this.pyx.length) {
         label26: {
            label25: {
               try {
                  this.pyx[var3] = new tf8(this, w6t[var3][0], w6t[var3][1]);
                  this.pyx[var3].ge4((float)rdk[var3][0] * -0.5F, 0.0F, (float)rdk[var3][2] * -0.5F, rdk[var3][0], rdk[var3][1], rdk[var3][2]);
                  this.pyx[var3].i50(0.0F, (float)(24 - rdk[var3][1]), var2);
                  if (var1 != 0) {
                     break label26;
                  }

                  if (var3 >= this.pyx.length - 1) {
                     break label25;
                  }
               } catch (oov var4) {
                  throw a(var4);
               }

               var2 += (float)(rdk[var3][2] + rdk[var3 + 1][2]) * 0.5F;
            }

            var3++;
         }

         if (var1 != 0) {
            break;
         }
      }
   }

   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      int var10000 = t9d.c();
      int var9 = 0;
      int var8 = var10000;

      while (var9 < this.pyx.length) {
         this.pyx[var9].vca(var7);
         var9++;
         if (var8 != 0) {
            break;
         }
      }
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      int var8 = t9d.b();
      int var9 = 0;

      while (var9 < this.pyx.length) {
         this.pyx[var9].r80 = fe6.ssk(var3 * 0.9F + (float)var9 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (float)(1 + Math.abs(var9 - 2));
         this.pyx[var9]._ki = fe6.rtn(var3 * 0.9F + (float)var9 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * (float)Math.abs(var9 - 2);
         var9++;
         if (var8 == 0) {
            break;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
