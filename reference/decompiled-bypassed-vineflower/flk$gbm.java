import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum flk$gbm {
   public static final flk$gbm yw8;
   public static final flk$gbm grk;
   public static final flk$gbm t9v;
   public static final flk$gbm h9h;
   public static final flk$gbm g03;
   public static final flk$gbm fru;
   public static final flk$gbm e3w;
   private static final flk$gbm[] lhx;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2009181270454431898L, -5992735770734320271L, MethodHandles.lookup().lookupClass()).a(187375170077191L);
      // $VF: monitorexit
      long var10 = var10000 ^ 19233725886106L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[7];
      int var6 = 0;
      String var5 = "K\u001a\u0016\u009cø\u0001\u001e1\bï\u008a}\u0004§Pô¡\u0010@\u001e\u0087\b¢\u0092\u0000\u001cû\u001b»ìêòBe\b\u0017ãúlôOu\u0087\u0010aæ\u0014\u0085þ#W\u0000SÐÝÊ÷¶VÆ";
      int var7 = "K\u001a\u0016\u009cø\u0001\u001e1\bï\u008a}\u0004§Pô¡\u0010@\u001e\u0087\b¢\u0092\u0000\u001cû\u001b»ìêòBe\b\u0017ãúlôOu\u0087\u0010aæ\u0014\u0085þ#W\u0000SÐÝÊ÷¶VÆ"
         .length();
      char var4 = '\b';
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
                     yw8 = new flk$gbm();
                     grk = new flk$gbm();
                     t9v = new flk$gbm();
                     h9h = new flk$gbm();
                     g03 = new flk$gbm();
                     fru = new flk$gbm();
                     e3w = new flk$gbm();
                     lhx = new flk$gbm[]{yw8, grk, t9v, h9h, g03, fru, e3w};
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

                  var5 = "\u0004Ì§mKÈñê\bP\u001d\u0097\u0002KÎnÚ";
                  var7 = "\u0004Ì§mKÈñê\bP\u001d\u0097\u0002KÎnÚ".length();
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
