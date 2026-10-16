import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.optifine.shaders.Shaders;

public class _40 implements gnj {
   public _40(dnm var1) {
      this.vby = var1;
   }

   public void med(a_t var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.vby.gu4(usb);
      int var10000 = OpaquePredicate.b();
      hzu.spd();
      hzu.vtj();
      hzu.ru7(1, 1);
      int var9 = var10000;

      label56: {
         label55: {
            try {
               hzu.fpt();
               var16 = var1.h5u();
               if (var9 == 0) {
                  break label56;
               }

               if (!var16) {
                  break label55;
               }
            } catch (oov var15) {
               throw a(var15);
            }

            var16 = false;
            break label56;
         }

         var16 = true;
      }

      hzu.jun(var16);
      char var10 = '\uf0f0';
      int var11 = var10 % 65536;
      int var12 = var10 / 65536;

      label46: {
         label45: {
            try {
               gis.w9e(gis.exn, (float)var11 / 1.0F, (float)var12 / 1.0F);
               hzu.s7q();
               hzu.wn0(1.0F, 1.0F, 1.0F, 1.0F);
               var17 = hxt.ly3();
               if (var9 == 0) {
                  break label46;
               }

               if (!var17) {
                  break label45;
               }
            } catch (oov var14) {
               throw a(var14);
            }

            Shaders.beginSpiderEyes();
         }

         hxt.hm6().oun = true;
         this.vby.fy4().s_q(var1, var2, var3, var5, var6, var7, var8);
         hxt.hm6().oun = false;
         var17 = hxt.ly3();
      }

      label37: {
         label36: {
            try {
               if (var9 == 0) {
                  break label37;
               }

               if (!var17) {
                  break label36;
               }
            } catch (oov var13) {
               throw a(var13);
            }

            Shaders.endSpiderEyes();
         }

         this.vby.r22(var1, var4);
         var17 = true;
      }

      hzu.jun(var17);
      hzu.ux6();
      hzu.if9();
   }

   @Override
   public boolean shouldCombineTextures() {
      return false;
   }

   @Override
   public void doRenderLayer(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.med((a_t)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8841015070081241456L, 858092904595631694L, MethodHandles.lookup().lookupClass()).a(174906474930190L);
      // $VF: monitorexit
      long var4 = var10000 ^ 110052882974283L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0013*ì_ËÆl%n\u0084$(\u00885Oíêf]Ób:CbÂP»\u0017à$\b\u0005\u0011*%Ô\u0016{S\u0093\u0095)ÒeÞ¹÷W".getBytes("ISO-8859-1"));
      String var7 = a(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      usb = new gdz(var0);
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
