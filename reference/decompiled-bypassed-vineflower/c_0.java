import java.util.Random;

public class c_0 implements gnj {
   public c_0(gmu var1) {
      this.po0 = var1;
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      int var9 = t9d.b();
      int var10 = var1.jj5();
      if (var10 > 0) {
         hy9 var11 = new hy9(var1.oay, var1.o2v, var1.kfp, var1.vbd);
         Random var12 = new Random((long)var1.jwu());
         qpm.cng();
         int var13 = 0;

         while (var13 < var10) {
            hzu.dp2();
            tf8 var14 = this.po0.fy4().bm8(var12);
            upl var15 = (upl)var14.mv0.get(var12.nextInt(var14.mv0.size()));
            var14.f2u(0.0625F);
            float var16 = var12.nextFloat();
            float var17 = var12.nextFloat();
            float var18 = var12.nextFloat();
            float var19 = (var15.zwq + (var15.bo7 - var15.zwq) * var16) / 16.0F;
            float var20 = (var15.oul + (var15.k74 - var15.oul) * var17) / 16.0F;
            float var21 = (var15.ygu + (var15.ji9 - var15.ygu) * var18) / 16.0F;
            hzu.a4k(var19, var20, var21);
            var16 = var16 * 2.0F - 1.0F;
            var17 = var17 * 2.0F - 1.0F;
            var18 = var18 * 2.0F - 1.0F;
            var16 *= -1.0F;
            var17 *= -1.0F;
            var18 *= -1.0F;
            float var22 = fe6.bug(var16 * var16 + var18 * var18);
            var11.p3h = var11.x5k = (float)(Math.atan2((double)var16, (double)var18) * 180.0 / Math.PI);
            var11.j25 = var11.y2i = (float)(Math.atan2((double)var17, (double)var22) * 180.0 / Math.PI);
            double var23 = 0.0;
            double var25 = 0.0;
            double var27 = 0.0;

            try {
               this.po0.g5a().ajg(var11, var23, var25, var27, 0.0F, var4);
               hzu.x3w();
               var13++;
               if (var9 == 0) {
                  return;
               }

               if (var9 == 0) {
                  break;
               }
            } catch (oov var29) {
               throw a(var29);
            }
         }

         qpm.ne_();
      }
   }

   @Override
   public boolean shouldCombineTextures() {
      return false;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
