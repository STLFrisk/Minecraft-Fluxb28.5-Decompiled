public class rno extends g6r {
   public rno(float var1) {
      this.dsx = 64;
      this.apc = 64;
      this.tjf = new tf8[3];
      this.tjf[0] = new tf8(this, 0, 16);
      this.tjf[0].q3x(-10.0F, 3.9F, -0.5F, 20, 3, 3, var1);
      this.tjf[1] = new tf8(this).swi(this.dsx, this.apc);
      this.tjf[1].i50(-2.0F, 6.9F, -0.5F);
      this.tjf[1].fc6(0, 22).q3x(0.0F, 0.0F, 0.0F, 3, 10, 3, var1);
      this.tjf[1].fc6(24, 22).q3x(-4.0F, 1.5F, 0.5F, 11, 2, 2, var1);
      this.tjf[1].fc6(24, 22).q3x(-4.0F, 4.0F, 0.5F, 11, 2, 2, var1);
      this.tjf[1].fc6(24, 22).q3x(-4.0F, 6.5F, 0.5F, 11, 2, 2, var1);
      this.tjf[2] = new tf8(this, 12, 22);
      this.tjf[2].q3x(0.0F, 0.0F, 0.0F, 3, 6, 3, var1);
      this.yxt = new tf8[3];
      this.yxt[0] = new tf8(this, 0, 0);
      this.yxt[0].q3x(-4.0F, -4.0F, -4.0F, 8, 8, 8, var1);
      this.yxt[1] = new tf8(this, 32, 0);
      this.yxt[1].q3x(-4.0F, -4.0F, -4.0F, 6, 6, 6, var1);
      this.yxt[1]._ki = -8.0F;
      this.yxt[1].ca7 = 4.0F;
      this.yxt[2] = new tf8(this, 32, 0);
      this.yxt[2].q3x(-4.0F, -4.0F, -4.0F, 6, 6, 6, var1);
      this.yxt[2]._ki = 10.0F;
      this.yxt[2].ca7 = 4.0F;
   }

   @Override
   public void s_q(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      tf8[] var9 = this.yxt;
      int var10000 = OpaquePredicate.c();
      int var10 = var9.length;
      int var8 = var10000;
      int var11 = 0;

      while (true) {
         if (var11 < var10) {
            tf8 var12 = var9[var11];

            try {
               var12.vca(var7);
               var11++;
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

         var9 = this.tjf;
         var10 = var9.length;
         break;
      }

      var11 = 0;

      while (var11 < var10) {
         tf8 var15 = var9[var11];
         var15.vca(var7);
         var11++;
         if (var8 != 0) {
            break;
         }
      }
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, EntityLivingBase var7) {
      float var8 = fe6.ssk(var3 * 0.1F);
      this.tjf[1].pod = (0.065F + 0.05F * var8) * (float) Math.PI;
      this.tjf[2].i50(-2.0F, 6.9F + fe6.ssk(this.tjf[1].pod) * 10.0F, -0.5F + fe6.rtn(this.tjf[1].pod) * 10.0F);
      this.tjf[2].pod = (0.265F + 0.1F * var8) * (float) Math.PI;
      this.yxt[0].r80 = var4 / (180.0F / (float)Math.PI);
      this.yxt[0].pod = var5 / (180.0F / (float)Math.PI);
   }

   @Override
   public void v3g(Entity var1, float var2, float var3, float var4) {
      ju8 var6 = (ju8)var1;
      int var10000 = OpaquePredicate.c();
      int var7 = 1;
      int var5 = var10000;

      while (var7 < 3) {
         this.yxt[var7].r80 = (var6.qpw(var7 - 1) - var1.ksw) / (180.0F / (float)Math.PI);
         this.yxt[var7].pod = var6.mu2(var7 - 1) / (180.0F / (float)Math.PI);
         var7++;
         if (var5 != 0) {
            break;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
