import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum x_b$rbt {
   public static final x_b$rbt g1e;
   public static final x_b$rbt q1z;
   public static final x_b$rbt l3z;
   public static final x_b$rbt m75;
   public static final x_b$rbt bap;
   public static final x_b$rbt a5g;
   private static final x_b$rbt[] azd;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1455540006879010068L, 3725039028657516012L, MethodHandles.lookup().lookupClass()).a(276161986441426L);
      // $VF: monitorexit
      long var10 = var10000 ^ 118848372360051L;
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
      String var5 = ":¢\u0094±\u0096ÚO6\u0010ìä\u0002¬ÁnæV¹b\f\u008fW\u008e\u001dC\u0010\u001fs(_ÛJÅX\u0015qLÇê;[Ð\u0010mýâm \u0086Î/NÁ;Ê¡rüv";
      int var7 = ":¢\u0094±\u0096ÚO6\u0010ìä\u0002¬ÁnæV¹b\f\u008fW\u008e\u001dC\u0010\u001fs(_ÛJÅX\u0015qLÇê;[Ð\u0010mýâm \u0086Î/NÁ;Ê¡rüv".length();
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
                     g1e = new x_b$rbt();
                     q1z = new x_b$rbt();
                     l3z = new x_b$rbt();
                     m75 = new x_b$rbt();
                     bap = new x_b$rbt();
                     a5g = new x_b$rbt();
                     azd = new x_b$rbt[]{g1e, q1z, l3z, m75, bap, a5g};
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

                  var5 = "\u0013ä\u009e\u009e\u0007=4Ä\u0010PÜhðê¨Ê\u001a\u0003tª±\u001ccm´";
                  var7 = "\u0013ä\u009e\u009e\u0007=4Ä\u0010PÜhðê¨Ê\u001a\u0003tª±\u001ccm´".length();
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
