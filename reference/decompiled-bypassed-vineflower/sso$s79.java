import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum sso$s79 {
   public static final sso$s79 un4;
   public static final sso$s79 dp_;
   public static final sso$s79 khy;
   public static final sso$s79 wwr;
   public static final sso$s79 hgo;
   public static final sso$s79 wih;
   public static final sso$s79 bmv;
   public static final sso$s79 xpo;
   public static final sso$s79 xuy;
   private static final sso$s79[] cz2;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8552318268816508894L, -19843441634413593L, MethodHandles.lookup().lookupClass()).a(181601029128015L);
      // $VF: monitorexit
      long var10 = var10000 ^ 130664797132381L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[9];
      int var6 = 0;
      String var5 = "eø,\u0014øñMÅ%ÀUí7a\u0092º2IÂ\u0099L}\u0017\u000b\u0010ý\u0011ô\t\u0005¹ò \u0011\u0096l\u0099åÄß9\u0010Fk\u0085\nd\u0002\r4.þ?\u0085\u0083$ðu\u0010èÛÏ\u0002-Ç\u009f\f}E\u0015Ö\u001b*\u0016\u0088\bPÉÜÆ;èQ+\u0010Ôn¦^\u009b\u0082Óeæ:\u000eaR×K$\u0010\u0094¬Íº®\u0089â\u0095B Ô(K]g`";
      int var7 = "eø,\u0014øñMÅ%ÀUí7a\u0092º2IÂ\u0099L}\u0017\u000b\u0010ý\u0011ô\t\u0005¹ò \u0011\u0096l\u0099åÄß9\u0010Fk\u0085\nd\u0002\r4.þ?\u0085\u0083$ðu\u0010èÛÏ\u0002-Ç\u009f\f}E\u0015Ö\u001b*\u0016\u0088\bPÉÜÆ;èQ+\u0010Ôn¦^\u009b\u0082Óeæ:\u000eaR×K$\u0010\u0094¬Íº®\u0089â\u0095B Ô(K]g`"
         .length();
      char var4 = 24;
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
                     un4 = new sso$s79();
                     dp_ = new sso$s79();
                     khy = new sso$s79();
                     wwr = new sso$s79();
                     hgo = new sso$s79();
                     wih = new sso$s79();
                     bmv = new sso$s79();
                     xpo = new sso$s79();
                     xuy = new sso$s79();
                     cz2 = new sso$s79[]{un4, dp_, khy, wwr, hgo, wih, bmv, xpo, xuy};
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

                  var5 = "\u001dA\u0004ãä^Áô/~\"Ã.í_¤\u009e\u00ad\u0089ÃKIv\u0095\u0010\u0086*´y8od\u008fËÜÀø½&½\u009c";
                  var7 = "\u001dA\u0004ãä^Áô/~\"Ã.í_¤\u009e\u00ad\u0089ÃKIv\u0095\u0010\u0086*´y8od\u008fËÜÀø½&½\u009c".length();
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
