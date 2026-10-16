import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum w51 {
   public static final w51 exw;
   public static final w51 oja;
   public static final w51 gx9;
   public static final w51 mem;

   @Override
   public String toString() {
      return this.zzq;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7684752310257026395L, 5346924891982080953L, MethodHandles.lookup().lookupClass()).a(106718142018738L);
      // $VF: monitorexit
      long var10 = var10000 ^ 91621129403092L;
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
      String var5 = "&\u009dz\u0086Äú\u0095W\b¶|ätºÓ\\d\u0010&râ\u008a;K®\u0080\u009bÀ4É÷4Æ¨\bu?ÉÅÍ\u001csÎ\u0010_¬¯\u000bQ«D\u0080> Ôz\u009f\u008asÚ\u0010\u0089¤\u001bKÛ\u008ae[\u001a\u0018\u0083\u0097\u0080·@ò";
      int var7 = "&\u009dz\u0086Äú\u0095W\b¶|ätºÓ\\d\u0010&râ\u008a;K®\u0080\u009bÀ4É÷4Æ¨\bu?ÉÅÍ\u001csÎ\u0010_¬¯\u000bQ«D\u0080> Ôz\u009f\u008asÚ\u0010\u0089¤\u001bKÛ\u008ae[\u001a\u0018\u0083\u0097\u0080·@ò"
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
                     exw = new w51(var8[0]);
                     oja = new w51(var8[5]);
                     gx9 = new w51(var8[3]);
                     mem = new w51(var8[2]);
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

                  var5 = "(ïY¿äZ5\u0003\u0010m\u001eè\u0083>\rù2ß(æ.\u0095\u0081\u0001y";
                  var7 = "(ïY¿äZ5\u0003\u0010m\u001eè\u0083>\rù2ß(æ.\u0095\u0081\u0001y".length();
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
