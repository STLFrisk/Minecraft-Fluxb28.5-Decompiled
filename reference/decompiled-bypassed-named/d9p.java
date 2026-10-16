import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class d9p extends so9 {
   public d9p(hr_ var1, g6r var2, float var3) {
      super(var1, var2, var3);
   }

   public gdz e3r(hu3 var1) {
      try {
         switch (var1.z1l()) {
            case 0:
            default:
               return rfa;
            case 1:
               return rqz;
            case 2:
               return rj3;
            case 3:
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return cox;
   }

   public void Module(hu3 var1, float var2) {
      try {
         super.e2w(var1, var2);
         if (var1.j1j()) {
            hzu.syc(0.8F, 0.8F, 0.8F);
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   @Override
   public void e2w(Entity var1, float var2) {
      this.ar7((hu3)var1, var2);
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.e3r((hu3)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7371618715140482491L, -8827833080422906290L, MethodHandles.lookup().lookupClass()).a(183021915639512L);
      // $VF: monitorexit
      long var10 = var10000 ^ 56485867579201L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[4];
      int var6 = 0;
      String var5 = "P°\u0095ù\u009f\u009d\u0011bmE\u008e\u008a\u0096Ã\u0004G\u008c.4Õõ¬Û\u0011.¬ÂÐõ¤8\u0018 P°\u0095ù\u009f\u009d\u0011bmE\u008e\u008a\u0096Ã\u0004G\u0019ÆÕ\u0095t.\n\u0096ÀR\u009d\u001b3{2þ";
      int var7 = "P°\u0095ù\u009f\u009d\u0011bmE\u008e\u008a\u0096Ã\u0004G\u008c.4Õõ¬Û\u0011.¬ÂÐõ¤8\u0018 P°\u0095ù\u009f\u009d\u0011bmE\u008e\u008a\u0096Ã\u0004G\u0019ÆÕ\u0095t.\n\u0096ÀR\u009d\u001b3{2þ"
         .length();
      char var4 = ' ';
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
                     rqz = new gdz(var8[1]);
                     rfa = new gdz(var8[3]);
                     rj3 = new gdz(var8[2]);
                     cox = new gdz(var8[0]);
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

                  var5 = "P°\u0095ù\u009f\u009d\u0011bmE\u008e\u008a\u0096Ã\u0004G\u0084:I\u0017k\u0097,ò1ütÙ\fLdç P°\u0095ù\u009f\u009d\u0011bmE\u008e\u008a\u0096Ã\u0004Gm×â\u0016\u0086\u000eÌ\u001cè\u0088Ìì\rñ9M";
                  var7 = "P°\u0095ù\u009f\u009d\u0011bmE\u008e\u008a\u0096Ã\u0004G\u0084:I\u0017k\u0097,ò1ütÙ\fLdç P°\u0095ù\u009f\u009d\u0011bmE\u008e\u008a\u0096Ã\u0004Gm×â\u0016\u0086\u000eÌ\u001cè\u0088Ìì\rñ9M"
                     .length();
                  var4 = ' ';
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
