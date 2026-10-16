public class m6t extends g6r {
   public m6t() {
      int var10000 = t9d.b();
      this.s9_ = new tf8[12];
      int var1 = var10000;
      int var2 = 0;

      while (true) {
         if (var2 < this.s9_.length) {
            try {
               this.s9_[var2] = new tf8(this, 0, 16);
               this.s9_[var2].ge4(0.0F, 0.0F, 0.0F, 2, 8, 2);
               var2++;
               if (var1 == 0) {
                  break;
               }

               if (var1 != 0) {
                  continue;
               }
            } catch (oov var3) {
               throw a(var3);
            }
         }

         this.tc3 = new tf8(this, 0, 0);
         this.tc3.ge4(-4.0F, -4.0F, -4.0F, 8, 8, 8);
         break;
      }
   }

   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      this.tc3.vca(var7);
      int var10000 = t9d.c();
      int var9 = 0;
      int var8 = var10000;

      while (var9 < this.s9_.length) {
         this.s9_[var9].vca(var7);
         var9++;
         if (var8 != 0) {
            break;
         }
      }
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      float var9 = var3 * (float) Math.PI * -0.1F;
      int var10000 = t9d.c();
      int var10 = 0;
      int var8 = var10000;

      while (true) {
         if (var10 < 4) {
            this.s9_[var10].ca7 = -2.0F + fe6.ssk(((float)(var10 * 2) + var3) * 0.25F);
            this.s9_[var10]._ki = fe6.ssk(var9) * 9.0F;
            this.s9_[var10].kit = fe6.rtn(var9) * 9.0F;
            var9++;

            try {
               var10++;
               if (var8 != 0) {
                  break;
               }

               if (var8 == 0) {
                  continue;
               }
            } catch (oov var13) {
               throw a(var13);
            }
         }

         var9 = (float) (Math.PI / 4) + var3 * (float) Math.PI * 0.03F;
         break;
      }

      var10 = 4;

      while (true) {
         if (var10 < 8) {
            this.s9_[var10].ca7 = 2.0F + fe6.ssk(((float)(var10 * 2) + var3) * 0.25F);
            this.s9_[var10]._ki = fe6.ssk(var9) * 7.0F;
            this.s9_[var10].kit = fe6.rtn(var9) * 7.0F;
            var9++;

            try {
               var10++;
               if (var8 != 0) {
                  break;
               }

               if (var8 == 0) {
                  continue;
               }
            } catch (oov var12) {
               throw a(var12);
            }
         }

         var9 = 0.47123894F + var3 * (float) Math.PI * -0.05F;
         break;
      }

      var10 = 8;

      while (true) {
         if (var10 < 12) {
            this.s9_[var10].ca7 = 11.0F + fe6.ssk(((float)var10 * 1.5F + var3) * 0.5F);
            this.s9_[var10]._ki = fe6.ssk(var9) * 5.0F;
            this.s9_[var10].kit = fe6.rtn(var9) * 5.0F;
            var9++;

            try {
               var10++;
               if (var8 != 0) {
                  break;
               }

               if (var8 == 0) {
                  continue;
               }
            } catch (oov var11) {
               throw a(var11);
            }
         }

         this.tc3.r80 = var4 / (180.0F / (float)Math.PI);
         this.tc3.pod = var5 / (180.0F / (float)Math.PI);
         break;
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
