import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum tgr$a3_ {
   public static final tgr$a3_ nk6;
   public static final tgr$a3_ r71;
   public static final tgr$a3_ qms;
   public static final tgr$a3_ m_f;
   public static final tgr$a3_ y5i;
   public static final tgr$a3_ obh;
   private static final Map s9z;
   private final boolean fkr;
   private final String jah;
   private static final tgr$a3_[] r7s;

   private tgr$a3_(String var3, boolean var4) {
      this.jah = var3;
      this.fkr = var4;
   }

   public boolean w4r() {
      return this.fkr;
   }

   public String fcc() {
      return this.jah;
   }

   public static tgr$a3_ v7x(String var0) {
      return (tgr$a3_)s9z.get(var0);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1209888272428447181L, 3881101548034011758L, MethodHandles.lookup().lookupClass()).a(246390908059011L);
      // $VF: monitorexit
      long var10 = var10000 ^ 62194497499784L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[12];
      int var6 = 0;
      String var5 = "ïÒ\u0081Û\u0091\u0000¶ü;\u0017å,\u001awÛù\u0010\"i\u008dtMð{´ýE7¤ªZT\r\u0010ç¼`\u0081¢Ä\nù\u0092/\u008aÕsð`4\u00104C %¹qëB\u0097¿s\u000e7t¹!\u0010ÕZÆ£ä\u00121¯\u0092ä.µ0pUc\u0010ê²\u0010\u0092ZQR\u000b\u0094mj\r(øÞB\u0018¯\u0017\u009d\u0082,?\u0088è]ô9Û\u009a×¯ÉÂÌ´\u0007ãó&?\u0010\u008dÛ|L\u0091Ë\u0003\u009b²£è\u001c\u0016\u0001¶,\u0010diæ\u009c\u001eR\u0087©Ó\bú¢T\u0004T\u0080\u0010-àÑ\u0083?9d<à&ÐGõþyþ";
      int var7 = "ïÒ\u0081Û\u0091\u0000¶ü;\u0017å,\u001awÛù\u0010\"i\u008dtMð{´ýE7¤ªZT\r\u0010ç¼`\u0081¢Ä\nù\u0092/\u008aÕsð`4\u00104C %¹qëB\u0097¿s\u000e7t¹!\u0010ÕZÆ£ä\u00121¯\u0092ä.µ0pUc\u0010ê²\u0010\u0092ZQR\u000b\u0094mj\r(øÞB\u0018¯\u0017\u009d\u0082,?\u0088è]ô9Û\u009a×¯ÉÂÌ´\u0007ãó&?\u0010\u008dÛ|L\u0091Ë\u0003\u009b²£è\u001c\u0016\u0001¶,\u0010diæ\u009c\u001eR\u0087©Ó\bú¢T\u0004T\u0080\u0010-àÑ\u0083?9d<à&ÐGõþyþ"
         .length();
      char var4 = 16;
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
                     nk6 = new tgr$a3_(var8[0], true);
                     r71 = new tgr$a3_(var8[7], false);
                     qms = new tgr$a3_(var8[1], true);
                     m_f = new tgr$a3_(var8[11], false);
                     y5i = new tgr$a3_(var8[5], true);
                     obh = new tgr$a3_(var8[4], true);
                     r7s = new tgr$a3_[]{nk6, r71, qms, m_f, y5i, obh};
                     s9z = Maps.newHashMap();

                     for (tgr$a3_ var15 : values()) {
                        s9z.put(var15.fcc(), var15);
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

                  var5 = "\u001a|¿ï«\u007f\fß\u009f³Á®\bã\u0087\f\u0018P\u009cn\u008dÙêÇòM Õu\n«\u0099½ët\u008evh;å\u009e";
                  var7 = "\u001a|¿ï«\u007f\fß\u009f³Á®\bã\u0087\f\u0018P\u009cn\u008dÙêÇòM Õu\n«\u0099½ët\u008evh;å\u009e".length();
                  var4 = 16;
                  var17 = -1;
            }

            var19 = var5.substring(++var17, var17 + var4);
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
