import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum j83$ip8 {
   public static final j83$ip8 z2b;
   public static final j83$ip8 rvs;
   public static final j83$ip8 f_r;
   public static final j83$ip8 zpr;
   public static final j83$ip8 rk0;
   public static final j83$ip8 syh;
   private static final j83$ip8[] ug_;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7628905631836890165L, 4519396544837935729L, MethodHandles.lookup().lookupClass()).a(247025932395842L);
      // $VF: monitorexit
      long var10 = var10000 ^ 65088818709072L;
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
      String var5 = "©è«5É6¸â\u000epôs,)ËÐ\u0010Ù½Öd?\u001b²p\u008c:Ò+H%á\u008d\u0010*ô\u0004\u0095\u0096í#¢v\u009e¶ñu@\u008e\u007f\bõ\u0006X\u0002k¹Æ\u000b";
      int var7 = "©è«5É6¸â\u000epôs,)ËÐ\u0010Ù½Öd?\u001b²p\u008c:Ò+H%á\u008d\u0010*ô\u0004\u0095\u0096í#¢v\u009e¶ñu@\u008e\u007f\bõ\u0006X\u0002k¹Æ\u000b"
         .length();
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
                     z2b = new j83$ip8();
                     rvs = new j83$ip8();
                     f_r = new j83$ip8();
                     zpr = new j83$ip8();
                     rk0 = new j83$ip8();
                     syh = new j83$ip8();
                     ug_ = new j83$ip8[]{z2b, rvs, f_r, zpr, rk0, syh};
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

                  var5 = "!²A\n\r9¤ä\u0010\u0092Æk}\u0007\\bñ\u0002º}APç\u000bÄ";
                  var7 = "!²A\n\r9¤ä\u0010\u0092Æk}\u0007\\bñ\u0002º}APç\u000bÄ".length();
                  var4 = '\b';
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
