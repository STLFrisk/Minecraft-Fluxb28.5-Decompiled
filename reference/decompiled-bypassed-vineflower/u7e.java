import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class u7e extends so9 {
   public u7e(hr_ var1) {
      super(var1, new iq2(0.0F), 0.5F);
      this.d4f(new mlv(this.fy4().gsh));
   }

   public iq2 fy4() {
      return (iq2)super.fy4();
   }

   public gdz af3(ysf var1) {
      try {
         switch (var1.y6a()) {
            case 0:
               return yxk;
            case 1:
               return u3p;
            case 2:
               return bpu;
            case 3:
               return eu2;
            case 4:
               return p9g;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return ip_;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void raj(ysf var1, float var2) {
      int var3 = t9d.c();
      float var4 = 0.9375F;

      label41: {
         label33: {
            label32: {
               try {
                  if (var3 != 0) {
                     break label32;
                  }

                  if (var1.ktm() >= 0) {
                     break label33;
                  }
               } catch (oov var7) {
                  throw a(var7);
               }

               var4 = (float)((double)var4 * 0.5);
               this.o2u = 0.25F;
            }

            try {
               if (var3 == 0) {
                  break label41;
               }
            } catch (oov var6) {
               boolean var10001 = false;
               throw a(var6);
            }
         }

         try {
            this.o2u = 0.5F;
         } catch (oov var5) {
            boolean var8 = false;
            throw a(var5);
         }
      }

      hzu.syc(var4, var4, var4);
   }

   @Override
   public void e2w(g_3 var1, float var2) {
      this.raj((ysf)var1, var2);
   }

   @Override
   public g6r fy4() {
      return this.fy4();
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.af3((ysf)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5962659168123093938L, 6974091514679886137L, MethodHandles.lookup().lookupClass()).a(86594596221528L);
      // $VF: monitorexit
      long var10 = var10000 ^ 53123093364986L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[6];
      int var6 = 0;
      String var5 = "~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009bõwWÙ\u0088ü¦ÄËÎ\u009ds©åNÝ(~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009b¹\u0007Á[\u0082û²(h&\u0098\u0090?d|\r(~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009b«·Õ\u0006\u0083\u008bFÂ[zïI\u0094\u0000\u008d¶(~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009b|½Ö\u0084\u00adöúf²[¿RÖr>.";
      int var7 = "~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009bõwWÙ\u0088ü¦ÄËÎ\u009ds©åNÝ(~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009b¹\u0007Á[\u0082û²(h&\u0098\u0090?d|\r(~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009b«·Õ\u0006\u0083\u008bFÂ[zïI\u0094\u0000\u008d¶(~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009b|½Ö\u0084\u00adöúf²[¿RÖr>."
         .length();
      char var4 = '(';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = c(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     ip_ = new gdz(var8[1]);
                     yxk = new gdz(var8[0]);
                     u3p = new gdz(var8[4]);
                     bpu = new gdz(var8[2]);
                     eu2 = new gdz(var8[3]);
                     p9g = new gdz(var8[5]);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009bßkä}\u0000Y¥ç«# $},\u0000×(~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009b\u009eýS:Ñ&µ\u0097£ÐAm\u0011\u0006¤ø";
                  var7 = "~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009bßkä}\u0000Y¥ç«# $},\u0000×(~2\u0010\u007fv\u0099í\u000e)ÒÑ\\°ÕÍù:N\u0012ö\bÝ±\u009b\u009eýS:Ñ&µ\u0097£ÐAm\u0011\u0006¤ø"
                     .length();
                  var4 = '(';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
