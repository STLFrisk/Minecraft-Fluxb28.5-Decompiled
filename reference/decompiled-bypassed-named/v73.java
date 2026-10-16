import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class v73 extends liu {
   public g6r sdt = new nku();

   public v73(hr_ var1) {
      super(var1);
      this.o2u = 0.5F;
   }

   public void ckq(w54 var1, double var2, double var4, double var6, float var8, float var9) {
      hzu.dp2();
      int var10000 = OpaquePredicate.c();
      hzu.a4k((float)var2, (float)var4 + 0.25F, (float)var6);
      hzu.a2h(180.0F - var8, 0.0F, 1.0F, 0.0F);
      float var11 = (float)var1.pbj() - var9;
      int var10 = var10000;
      float var12 = var1.r9s() - var9;

      label45: {
         label40: {
            label39: {
               try {
                  float var19;
                  var10000 = (var19 = var12 - 0.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
                  if (var10 != 0) {
                     break label40;
                  }

                  if (var10000 >= 0) {
                     break label39;
                  }
               } catch (oov var16) {
                  throw a(var16);
               }

               var12 = 0.0F;
            }

            try {
               var18 = var11;
               if (var10 != 0) {
                  break label45;
               }

               float var20;
               var10000 = (var20 = var11 - 0.0F) == 0.0F ? 0 : (var20 < 0.0F ? -1 : 1);
            } catch (oov var15) {
               throw a(var15);
            }
         }

         try {
            if (var10000 > 0) {
               hzu.a2h(fe6.rtn(var11) * var11 * var12 / 10.0F * (float)var1.epc(), 1.0F, 0.0F, 0.0F);
            }
         } catch (oov var14) {
            throw a(var14);
         }

         var18 = 0.75F;
      }

      float var13 = var18;
      hzu.syc(var13, var13, var13);
      hzu.syc(1.0F / var13, 1.0F / var13, 1.0F / var13);
      this.sat(var1);
      hzu.syc(-1.0F, -1.0F, 1.0F);
      this.sdt.s_q(var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
      hzu.x3w();
      super.apl(var1, var2, var4, var6, var8, var9);
   }

   public gdz zlx(w54 var1) {
      return _y0;
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.zlx((w54)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.ckq((w54)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6982444694315352628L, -7383243356437127492L, MethodHandles.lookup().lookupClass()).a(7329512457534L);
      // $VF: monitorexit
      long var4 = var10000 ^ 88935811515078L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("\u0003zùìI [OëÎ\t^væoüÓ\u009e7þ\u009có*Ý\u00019¯Þ\u009d«\u0010\u0007".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      _y0 = new gdz(var0);
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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
