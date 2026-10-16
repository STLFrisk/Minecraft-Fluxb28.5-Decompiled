import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityEnchantmentTable;

public class hf2 extends q9h {
   public void clo(TileEntityEnchantmentTable var1, double var2, double var4, double var6, float var8, int var9) {
      hzu.dp2();
      hzu.a4k((float)var2 + 0.5F, (float)var4 + 0.75F, (float)var6 + 0.5F);
      float var11 = (float)var1.tk5 + var8;
      int var10000 = t9d.c();
      hzu.a4k(0.0F, 0.1F + fe6.rtn(var11 * 0.1F) * 0.01F, 0.0F);
      int var10 = var10000;
      float var12 = var1.xzl - var1.fzf;

      label98: {
         label97:
         while (true) {
            if (var12 >= (float) Math.PI) {
               var12 -= (float) (Math.PI * 2);

               try {
                  if (var10 != 0) {
                     break;
                  }

                  if (var10 == 0) {
                     continue;
                  }
               } catch (oov var21) {
                  throw a(var21);
               }
            }

            while (true) {
               if (!(var12 < (float) -Math.PI)) {
                  break label97;
               }

               var24 = var12 + (float) (Math.PI * 2);
               if (var10 != 0) {
                  break label98;
               }

               var12 = var24;
               if (var10 != 0) {
                  break label97;
               }
            }
         }

         var24 = var1.fzf + var12 * var8;
      }

      float var13 = var24;
      hzu.a2h(-var13 * 180.0F / (float) Math.PI, 0.0F, 1.0F, 0.0F);
      hzu.a2h(80.0F, 0.0F, 0.0F, 1.0F);
      this.g3j(mwz);
      float var14 = var1.jbl + (var1.r17 - var1.jbl) * var8 + 0.25F;
      float var15 = var1.jbl + (var1.r17 - var1.jbl) * var8 + 0.75F;
      var14 = (var14 - (float)fe6.n61((double)var14)) * 1.6F - 0.3F;
      var15 = (var15 - (float)fe6.n61((double)var15)) * 1.6F - 0.3F;

      label79: {
         label78: {
            try {
               float var27;
               var10000 = (var27 = var14 - 0.0F) == 0.0F ? 0 : (var27 < 0.0F ? -1 : 1);
               if (var10 != 0) {
                  break label79;
               }

               if (var10000 >= 0) {
                  break label78;
               }
            } catch (oov var20) {
               throw a(var20);
            }

            var14 = 0.0F;
         }

         float var28;
         var10000 = (var28 = var15 - 0.0F) == 0.0F ? 0 : (var28 < 0.0F ? -1 : 1);
      }

      label70: {
         label69: {
            try {
               if (var10 != 0) {
                  break label70;
               }

               if (var10000 >= 0) {
                  break label69;
               }
            } catch (oov var19) {
               throw a(var19);
            }

            var15 = 0.0F;
         }

         float var29;
         var10000 = (var29 = var14 - 1.0F) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
      }

      float var10001;
      label103: {
         label60: {
            label59: {
               try {
                  if (var10 != 0) {
                     break label60;
                  }

                  if (var10000 <= 0) {
                     break label59;
                  }
               } catch (oov var18) {
                  throw a(var18);
               }

               var14 = 1.0F;
            }

            try {
               var26 = var15;
               var10001 = 1.0F;
               if (var10 != 0) {
                  break label103;
               }

               float var30;
               var10000 = (var30 = var15 - 1.0F) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
            } catch (oov var17) {
               throw a(var17);
            }
         }

         if (var10000 > 0) {
            var15 = 1.0F;
         }

         var26 = var1.i1_;
         var10001 = (var1.mvq - var1.i1_) * var8;
      }

      float var16 = var26 + var10001;
      hzu.gp4();
      this.i2_.s_q((i2h)null, var11, var14, var15, var16, 0.0F, 0.0625F);
      hzu.x3w();
   }

   @Override
   public void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9) {
      this.clo((TileEntityEnchantmentTable)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8434157172933017435L, -5163144938272893279L, MethodHandles.lookup().lookupClass()).a(62564393235379L);
      // $VF: monitorexit
      long var4 = var10000 ^ 31226365911171L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal(
         "Ââ\u0010líÿÍ¯/\n\u0083ß\u009b*ñ\u00ad\u008b@Æ\u009f[Á@ª\u001aA[JÀL°\u009d\u0018\u008b´Á@\u0004Õ¼ÜÁ\u0082Jj¿hw".getBytes("ISO-8859-1")
      );
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      mwz = new gdz(var0);
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
