import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _aj {
   public static final _aj p3z;
   public static final _aj _lm;
   public static final _aj sxc;
   public static final _aj i9j;
   public static final _aj y49;
   public static final _aj twm;
   public static final _aj z3a;
   public static final _aj il8;
   public String h2b;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3546045187187480362L, 662270270518948406L, MethodHandles.lookup().lookupClass()).a(17671001734847L);
      // $VF: monitorexit
      long var10 = var10000 ^ 42326941514264L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[8];
      int var6 = 0;
      String var5 = "Æ\u00123Tl¹oæ\b®iÍÜÅN\u0007ú\btZ\u0013Tl½}I\b¼\u0006\u0086Lm\u0015}L\u0010 U\u0083¾`ÞTâ\u008e\u0012\u0081«\u001aXlþ\bª\u008b¥gò\u008e_Ä";
      int var7 = "Æ\u00123Tl¹oæ\b®iÍÜÅN\u0007ú\btZ\u0013Tl½}I\b¼\u0006\u0086Lm\u0015}L\u0010 U\u0083¾`ÞTâ\u008e\u0012\u0081«\u001aXlþ\bª\u008b¥gò\u008e_Ä"
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
                     p3z = new _aj("a");
                     _lm = new _aj("b");
                     sxc = new _aj("c");
                     i9j = new _aj("d");
                     y49 = new _aj("e");
                     twm = new _aj("f");
                     z3a = new _aj("g");
                     il8 = new _aj("m");
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

                  var5 = "!\u0089:\u0093o\u009b±\u008a\b\u0000Éb\n\u0007PGJ";
                  var7 = "!\u0089:\u0093o\u009b±\u008a\b\u0000Éb\n\u0007PGJ".length();
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
