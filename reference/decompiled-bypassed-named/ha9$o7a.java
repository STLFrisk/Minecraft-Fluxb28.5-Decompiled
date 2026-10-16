import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum ha9$o7a {
   public static final ha9$o7a xdw;
   public static final ha9$o7a ne8;
   public static final ha9$o7a ar_;
   public static final ha9$o7a or9;
   public static final ha9$o7a jlk;
   public static final ha9$o7a cl6;
   private static final ha9$o7a[] afs;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7641953857586635190L, 6814043504122337762L, MethodHandles.lookup().lookupClass()).a(225604586480164L);
      // $VF: monitorexit
      long var10 = var10000 ^ 115565167870269L;
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
      String var5 = "þw{á\u0006f§-ÚÉ©ögð\u0080Å\u0018\u0013E\"Êðx\b \u0011f\u0082\u00ad®\u0000-C} T\u0014a²\u0017\u009b\u0010)îªTF\u000bs\u0096Uª\u0096úÇâ\u009dO\b\u0017\u0087WÊ F#Í";
      int var7 = "þw{á\u0006f§-ÚÉ©ögð\u0080Å\u0018\u0013E\"Êðx\b \u0011f\u0082\u00ad®\u0000-C} T\u0014a²\u0017\u009b\u0010)îªTF\u000bs\u0096Uª\u0096úÇâ\u009dO\b\u0017\u0087WÊ F#Í"
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
                     xdw = new ha9$o7a();
                     ne8 = new ha9$o7a();
                     ar_ = new ha9$o7a();
                     or9 = new ha9$o7a();
                     jlk = new ha9$o7a();
                     cl6 = new ha9$o7a();
                     afs = new ha9$o7a[]{xdw, ne8, ar_, or9, jlk, cl6};
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

                  var5 = "\u0013E\"Êðx\b 1Ì#yËß\u007f\u008b\u009a\u001b\b+\u001dÔ¦§\u0010H\u009b!Üw»ÓÓÖ¼\u0089AÝ¡#0";
                  var7 = "\u0013E\"Êðx\b 1Ì#yËß\u007f\u008b\u009a\u001b\b+\u001dÔ¦§\u0010H\u009b!Üw»ÓÓÖ¼\u0089AÝ¡#0".length();
                  var4 = 24;
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
