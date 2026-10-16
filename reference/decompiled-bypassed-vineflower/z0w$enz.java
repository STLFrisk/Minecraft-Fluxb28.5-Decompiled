import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum z0w$enz {
   public static final z0w$enz ov1;
   public static final z0w$enz kr2;
   private static final Map k04;
   private final String yay;
   private static final z0w$enz[] _um;

   private z0w$enz(String var3) {
      this.yay = var3;
   }

   public String g9z() {
      return this.yay;
   }

   public static z0w$enz q_i(String var0) {
      int var1 = t9d.c();
      z0w$enz var2 = (z0w$enz)k04.get(var0);

      try {
         if (var1 != 0) {
            return var2;
         }

         if (var2 == null) {
            return ov1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5199514247239787897L, -6531975570715724853L, MethodHandles.lookup().lookupClass()).a(210751327799981L);
      // $VF: monitorexit
      long var10 = var10000 ^ 131619468075169L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[4];
      int var6 = 0;
      String var5 = "~J\u0000øw\u009feZ\b°.½\u0091|Få¤";
      int var7 = "~J\u0000øw\u009feZ\b°.½\u0091|Få¤".length();
      char var4 = '\b';
      int var17 = -1;

      label37:
      while (true) {
         String var19 = var5.substring(++var17, var17 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = a(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var25;
                  if ((var17 += var4) >= var7) {
                     ov1 = new z0w$enz(var8[1]);
                     kr2 = new z0w$enz(var8[0]);
                     _um = new z0w$enz[]{ov1, kr2};
                     k04 = Maps.newHashMap();

                     for (z0w$enz var15 : values()) {
                        k04.put(var15.g9z(), var15);
                     }

                     return;
                  }

                  var4 = var5.charAt(var17);
                  break;
               default:
                  var8[var6++] = var25;
                  if ((var17 += var4) < var7) {
                     var4 = var5.charAt(var17);
                     continue label37;
                  }

                  var5 = "yP¢¼A³õº\b\u000f\u0015\u009aÙ&¶©ð";
                  var7 = "yP¢¼A³õº\b\u000f\u0015\u009aÙ&¶©ð".length();
                  var4 = '\b';
                  var17 = -1;
            }

            var19 = var5.substring(++var17, var17 + var4);
            var10001 = 0;
         }
      }
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
