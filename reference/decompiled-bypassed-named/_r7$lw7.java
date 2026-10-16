import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _r7$lw7 {
   public static final _r7$lw7 hec;
   public static final _r7$lw7 a1d;
   public static final _r7$lw7 g2t;
   public static final _r7$lw7 w4b;
   private static final _r7$lw7[] l7d;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5704387401429521150L, -2234527591090035977L, MethodHandles.lookup().lookupClass()).a(211948201266397L);
      // $VF: monitorexit
      long var10 = var10000 ^ 73454019220028L;
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
      String var5 = "6ý\u0094·Õ\\\u001f¸\u0017Å^M¸üÓq\u0010\u0018\u0094\u0085J\u0081¶à¬ê\u0082wöÔ×¸ä";
      int var7 = "6ý\u0094·Õ\\\u001f¸\u0017Å^M¸üÓq\u0010\u0018\u0094\u0085J\u0081¶à¬ê\u0082wöÔ×¸ä".length();
      char var4 = 16;
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     hec = new _r7$lw7();
                     a1d = new _r7$lw7();
                     g2t = new _r7$lw7();
                     w4b = new _r7$lw7();
                     l7d = new _r7$lw7[]{hec, a1d, g2t, w4b};
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

                  var5 = "\u008bëìPX°ÞN\u0003º\u001d\u001f\u0081yÜÃ\u00106ý\u0094·Õ\\\u001f¸`(\u001f \u0011\u001aØí";
                  var7 = "\u008bëìPX°ÞN\u0003º\u001d\u001f\u0081yÜÃ\u00106ý\u0094·Õ\\\u001f¸`(\u001f \u0011\u001aØí".length();
                  var4 = 16;
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
      }
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
