import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum iw2 {
   public static final iw2 ot_;
   public static final iw2 ltn;

   public String agt() {
      return this.llu;
   }

   public String u07() {
      return this.s5z;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8090000446422153642L, -777753028119863736L, MethodHandles.lookup().lookupClass()).a(72595380124468L);
      // $VF: monitorexit
      long var10 = var10000 ^ 41349455207118L;
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
      String var5 = "\u0007ê\u0017\u001bàRø\u0014°\nîX5ªøpÕ>&áÁÀ<\u0012ìDt«\\L9ð\u0090¾´þ.{¾\u0090(Èïõ/åáGB´¾{3\f%b>N\u008e\u001fsK[¼bÿÈøè\u0003Õ¶/\u009f®üQæv@f\b¸âkù\u0082wOz\u0010Å\u001a´Ø\u0015bGÍw\u0000\u001f¤\u0087\u0083õ\\";
      int var7 = "\u0007ê\u0017\u001bàRø\u0014°\nîX5ªøpÕ>&áÁÀ<\u0012ìDt«\\L9ð\u0090¾´þ.{¾\u0090(Èïõ/åáGB´¾{3\f%b>N\u008e\u001fsK[¼bÿÈøè\u0003Õ¶/\u009f®üQæv@f\b¸âkù\u0082wOz\u0010Å\u001a´Ø\u0015bGÍw\u0000\u001f¤\u0087\u0083õ\\"
         .length();
      char var4 = '(';
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
                     ot_ = new iw2(var8[5], var8[1]);
                     ltn = new iw2(var8[4], var8[0]);
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

                  var5 = "\u0082·\u0093´£x=«\u0094\u0019\u009b*\u001b\u0006ÙÜbR>Ä(ö\u0098}!êÏ§\u0097'aí\u0016¼\u0085TÅ\u001b/\u001e Èïõ/åáGB\u008cL\u008bX\u0092\u008fïô~¶ýÒ3s´\\1[s\u008a1Ëj;";
                  var7 = "\u0082·\u0093´£x=«\u0094\u0019\u009b*\u001b\u0006ÙÜbR>Ä(ö\u0098}!êÏ§\u0097'aí\u0016¼\u0085TÅ\u001b/\u001e Èïõ/åáGB\u008cL\u008bX\u0092\u008fïô~¶ýÒ3s´\\1[s\u008a1Ëj;"
                     .length();
                  var4 = '(';
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
