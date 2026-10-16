import java.util.Random;

public class cob extends g6r {
   public tf8 _h1;
   public tf8[] bgp = new tf8[9];

   public cob() {
      int var10000 = t9d.c();
      byte var2 = -16;
      int var1 = var10000;
      this._h1 = new tf8(this, 0, 0);
      this._h1.ge4(-8.0F, -8.0F, -8.0F, 16, 16, 16);
      this._h1.ca7 += (float)(24 + var2);
      Random var3 = new Random(1660L);
      int var4 = 0;

      while (var4 < this.bgp.length) {
         this.bgp[var4] = new tf8(this, 0, 0);
         float var5 = (((float)(var4 % 3) - (float)(var4 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float var6 = ((float)(var4 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int var7 = var3.nextInt(7) + 8;
         this.bgp[var4].ge4(-1.0F, 0.0F, -1.0F, 2, var7, 2);
         this.bgp[var4]._ki = var5;
         this.bgp[var4].kit = var6;
         this.bgp[var4].ca7 = (float)(31 + var2);
         var4++;
         if (var1 != 0) {
            break;
         }
      }
   }

   @Override
   public void ltd(float var1, float var2, float var3, float var4, float var5, float var6, i2h var7) {
      int var8 = t9d.c();
      int var9 = 0;

      while (var9 < this.bgp.length) {
         this.bgp[var9].pod = 0.2F * fe6.rtn(var3 * 0.3F + (float)var9) + 0.4F;
         var9++;
         if (var8 != 0) {
            break;
         }
      }
   }

   @Override
   public void s_q(i2h var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.ltd(var2, var3, var4, var5, var6, var7, var1);
      hzu.dp2();
      hzu.a4k(0.0F, 0.6F, 0.0F);
      this._h1.vca(var7);
      int var10000 = t9d.b();
      tf8[] var9 = this.bgp;
      int var10 = var9.length;
      int var8 = var10000;
      int var11 = 0;

      while (true) {
         if (var11 < var10) {
            tf8 var12 = var9[var11];

            try {
               var12.vca(var7);
               var11++;
               if (var8 == 0) {
                  break;
               }

               if (var8 != 0) {
                  continue;
               }
            } catch (oov var13) {
               throw a(var13);
            }
         }

         hzu.x3w();
         break;
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
