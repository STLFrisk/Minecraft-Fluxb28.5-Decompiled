import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class bm4 {
   public static void biq(ha9 var0, boolean var1) {
      hzu.i56(2982, dd2);
      hzu.i56(2983, m23);
      GL11.glGetInteger(2978, qjv);
      float var3 = (float)((qjv.get(0) + qjv.get(2)) / 2);
      int var10000 = OpaquePredicate.b();
      float var4 = (float)((qjv.get(1) + qjv.get(3)) / 2);
      GLU.gluUnProject(var3, var4, 0.0F, dd2, m23, qjv, zhn);
      int var2 = var10000;
      oje = new fqr((double)zhn.get(0), (double)zhn.get(1), (double)zhn.get(2));
      var10000 = var1;
      if (var2 != 0) {
         var10000 = var1 != 0 ? 1 : 0;
      }

      int var5 = var10000;
      float var6 = var0.y2i;
      float var7 = var0.x5k;
      ce8 = fe6.ssk(var7 * (float) Math.PI / 180.0F) * (float)(1 - var5 * 2);
      o7b = fe6.rtn(var7 * (float) Math.PI / 180.0F) * (float)(1 - var5 * 2);
      vdt = -o7b * fe6.rtn(var6 * (float) Math.PI / 180.0F) * (float)(1 - var5 * 2);
      yie = ce8 * fe6.rtn(var6 * (float) Math.PI / 180.0F) * (float)(1 - var5 * 2);
      osy = fe6.ssk(var6 * (float) Math.PI / 180.0F);
   }

   public static fqr fqa(EntityLivingBase var0, double var1) {
      double var3 = var0.bc1 + (var0.o2v - var0.bc1) * var1;
      double var5 = var0.o_z + (var0.kfp - var0.o_z) * var1;
      double var7 = var0.a4d + (var0.vbd - var0.a4d) * var1;
      double var9 = var3 + oje.lvi;
      double var11 = var5 + oje.gn5;
      double var13 = var7 + oje.bn2;
      return new fqr(var9, var11, var13);
   }

   public static e0x te3(OpaquePredicate var0, EntityLivingBase var1, float var2) {
      fqr var4 = fqa(var1, (double)var2);
      mew var5 = new mew(var4);
      int var10000 = OpaquePredicate.b();
      zfz var6 = var0.getBlockState(var5);
      e0x var7 = var6.r_y();
      int var3 = var10000;

      try {
         if (var3 == 0) {
            return var7;
         }

         if (!var7.p1r().l7j()) {
            return var7;
         }
      } catch (oov var11) {
         throw a(var11);
      }

      float var8 = 0.0F;

      label33: {
         label32: {
            try {
               var10000 = var6.r_y() instanceof hmv;
               if (var3 == 0) {
                  break label33;
               }

               if (var10000 == 0) {
                  break label32;
               }
            } catch (oov var10) {
               throw a(var10);
            }

            var8 = hmv.jou((Integer)var6.dil(hmv.nfg)) - 0.11111111F;
         }

         var10000 = var5.getY() + 1;
      }

      float var9 = (float)var10000 - var8;
      if (var4.gn5 >= (double)var9) {
         var7 = var0.getBlockState(var5.nuv()).r_y();
      }

      return var7;
   }

   public static fqr g62() {
      return oje;
   }

   public static float peb() {
      return ce8;
   }

   public static float g8n() {
      return osy;
   }

   public static float _t6() {
      return o7b;
   }

   public static float jcu() {
      return vdt;
   }

   public static float oz4() {
      return yie;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
