import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum g7u$qmc implements v4k {
   public static final g7u$qmc rn9;
   public static final g7u$qmc qxj;
   public static final g7u$qmc ryv;
   public static final g7u$qmc pfi;
   public static final g7u$qmc xd3;
   private final String iq6;
   private static final g7u$qmc[] lkz;

   private g7u$qmc(String var3) {
      this.iq6 = var3;
   }

   @Override
   public String toString() {
      return this.iq6;
   }

   @Override
   public String mo3() {
      return this.iq6;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8331177049818762763L, -3650818783733809290L, MethodHandles.lookup().lookupClass()).a(280321789621357L);
      // $VF: monitorexit
      long var10 = var10000 ^ 106778202552245L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[10];
      int var6 = 0;
      String var5 = "¾û\u0080tW y\u009f\u0091\u0001Ê\\\u009c! \u0089\u0010»\u009f\u009e\u009bý\u008c\u0088=È-\u0083$\bWñY\u0010òe8ÍêU;k\u0002½÷\u0090`\u001fÅ\u001f\u0010\u0093W1®\u009cS£\u008c\u0092ç(u¥uº©\u0010U©\u0005\u0005p!:8l¡\u0007µ×þC±\u0010Qö¿àg\u0012Ö\u009c3ÄÐíL\u0006ï\u0082\u0010ü|a£A@~u\u0081\rÿ\u009f0Ïºs\u0010½_\u0081ÿÜ\u0087uä\u000f¤¾ø\u0004\u007fëµ";
      int var7 = "¾û\u0080tW y\u009f\u0091\u0001Ê\\\u009c! \u0089\u0010»\u009f\u009e\u009bý\u008c\u0088=È-\u0083$\bWñY\u0010òe8ÍêU;k\u0002½÷\u0090`\u001fÅ\u001f\u0010\u0093W1®\u009cS£\u008c\u0092ç(u¥uº©\u0010U©\u0005\u0005p!:8l¡\u0007µ×þC±\u0010Qö¿àg\u0012Ö\u009c3ÄÐíL\u0006ï\u0082\u0010ü|a£A@~u\u0081\rÿ\u009f0Ïºs\u0010½_\u0081ÿÜ\u0087uä\u000f¤¾ø\u0004\u007fëµ"
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
                     rn9 = new g7u$qmc(var8[7]);
                     qxj = new g7u$qmc(var8[9]);
                     ryv = new g7u$qmc(var8[4]);
                     pfi = new g7u$qmc(var8[6]);
                     xd3 = new g7u$qmc(var8[3]);
                     lkz = new g7u$qmc[]{rn9, qxj, ryv, pfi, xd3};
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

                  var5 = "·Ñ\u0092Ìë\u00ad\u00ad(ßz»#BÝ\u009cÐ\u0010\näqå\u0092Ìjzg9\u0005\nÎìRÕ";
                  var7 = "·Ñ\u0092Ìë\u00ad\u00ad(ßz»#BÝ\u009cÐ\u0010\näqå\u0092Ìjzg9\u0005\nÎìRÕ".length();
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
