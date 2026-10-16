import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.shaders.Shaders;

public class fp0 implements gnj {
   public fp0(tt7 var1) {
      this.e65 = var1;
   }

   public void xyl(fcs var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.e65.gu4(ueb);
      hzu.spd();
      hzu.vtj();
      hzu.ru7(1, 1);
      hzu.fpt();
      hzu.d14(514);
      char var10 = '\uf0f0';
      int var11 = var10 % 65536;
      int var10000 = OpaquePredicate.c();
      int var12 = var10 / 65536;
      int var9 = var10000;

      label37: {
         label36: {
            try {
               gis.w9e(gis.exn, (float)var11 / 1.0F, (float)var12 / 1.0F);
               hzu.s7q();
               hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
               var15 = hxt.ly3();
               if (var9 != 0) {
                  break label37;
               }

               if (var15 == 0) {
                  break label36;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            Shaders.beginSpiderEyes();
         }

         hxt.hm6().oun = true;
         this.e65.fy4().s_q(var1, var2, var3, var5, var6, var7, var8);
         hxt.hm6().oun = false;
         var15 = hxt.ly3();
      }

      label28: {
         label27: {
            try {
               if (var9 != 0) {
                  break label28;
               }

               if (var15 == 0) {
                  break label27;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            Shaders.endSpiderEyes();
         }

         this.e65.r22(var1, var4);
         hzu.ux6();
         hzu.if9();
         var15 = 515;
      }

      hzu.d14(var15);
   }

   @Override
   public boolean shouldCombineTextures() {
      return false;
   }

   @Override
   public void doRenderLayer(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.xyl((fcs)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8222886294676623409L, -4970631234628852579L, MethodHandles.lookup().lookupClass()).a(125702449352672L);
      // $VF: monitorexit
      long var4 = var10000 ^ 71017864175675L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "h\u0092izá\u0000\u0089\u000fI\u007f\u0015\u0016Ý<D¡»y¾\u0091q\u0099±+Ô\u008f\u0015 ¯W\u0005\u0099\u0011\u008f\u008a\u009aÉ>º\u0005\u0002\u009eà\u0001OKH·"
            .getBytes("ISO-8859-1")
      );
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      ueb = new gdz(var0);
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
