import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum fcu$k9f implements v4k {
   public static final fcu$k9f ycz;
   public static final fcu$k9f u8j;
   public static final fcu$k9f o8j;
   private final String nej;
   private static final fcu$k9f[] v5_;

   private fcu$k9f(String var3) {
      this.nej = var3;
   }

   @Override
   public String toString() {
      return this.mo3();
   }

   @Override
   public String mo3() {
      return this.nej;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-432164395818604117L, -7889129638732984887L, MethodHandles.lookup().lookupClass()).a(153564426628081L);
      // $VF: monitorexit
      long var10 = var10000 ^ 1531425833645L;
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
      String var5 = "ÛF\u0007\u0097¢ì3\u0001\b\nY{¦\u0089ù1Ê\bÆõ\u0087\u008d\\;ÛÖ\bTU½Â:\u0099ÜV";
      int var7 = "ÛF\u0007\u0097¢ì3\u0001\b\nY{¦\u0089ù1Ê\bÆõ\u0087\u008d\\;ÛÖ\bTU½Â:\u0099ÜV".length();
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
                     ycz = new fcu$k9f(var8[2]);
                     u8j = new fcu$k9f(var8[3]);
                     o8j = new fcu$k9f(var8[1]);
                     v5_ = new fcu$k9f[]{ycz, u8j, o8j};
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

                  var5 = "\u000fK\u0097UâÜ\u0088\u001f\bæ6i\u0000\u0080IOß";
                  var7 = "\u000fK\u0097UâÜ\u0088\u001f\bæ6i\u0000\u0080IOß".length();
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
