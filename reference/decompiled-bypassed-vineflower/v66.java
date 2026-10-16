import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum v66 {
   public static final v66 na2;
   public static final v66 g4t;
   public static final v66 b_4;
   public static final v66 csg;

   public int dzc() {
      return this.y_r;
   }

   public static v66 n4n(int var0) {
      return gbf[var0 % gbf.length];
   }

   public String ltp() {
      return this.og8;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6421313345287100123L, -562873764981062524L, MethodHandles.lookup().lookupClass()).a(5475133730138L);
      // $VF: monitorexit
      long var10 = var10000 ^ 58811126883722L;
      Cipher var1;
      Cipher var18 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var18.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[8];
      int var6 = 0;
      String var5 = "\u0004J\u0003w\u0099G\u0094Í\b\u0085Öà1¬\u0006RV Mºò§Ôû\u0003{0@/\u0093q¬\u00875uèÝ\u0006bcû3A\u008aÊCÊÁ&$\bzAÏþZ*\n\u008d Mºò§Ôû\u0003{0@/\u0093q¬\u00875\u009a\u0089*Ç\u0018¾,¦r\u0096§\u009e ý¿\r\u0018Mºò§Ôû\u0003{0@/\u0093q¬\u00875l\u0007hH\u009a\nA\u009f";
      int var7 = "\u0004J\u0003w\u0099G\u0094Í\b\u0085Öà1¬\u0006RV Mºò§Ôû\u0003{0@/\u0093q¬\u00875uèÝ\u0006bcû3A\u008aÊCÊÁ&$\bzAÏþZ*\n\u008d Mºò§Ôû\u0003{0@/\u0093q¬\u00875\u009a\u0089*Ç\u0018¾,¦r\u0096§\u009e ý¿\r\u0018Mºò§Ôû\u0003{0@/\u0093q¬\u00875l\u0007hH\u009a\nA\u009f"
         .length();
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
                     na2 = new v66(0, var8[2]);
                     g4t = new v66(1, var8[5]);
                     b_4 = new v66(2, var8[4]);
                     csg = new v66(3, var8[7]);

                     for (v66 var15 : values()) {
                        gbf[var15.y_r] = var15;
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

                  var5 = "'ý$\u0083\\c\u001fr¯)Þ\u001e\u0080±8¼\u0018Mºò§Ôû\u0003{0@/\u0093q¬\u00875I\u0007\u0018\u000f)p-Z";
                  var7 = "'ý$\u0083\\c\u001fr¯)Þ\u001e\u0080±8¼\u0018Mºò§Ôû\u0003{0@/\u0093q¬\u00875I\u0007\u0018\u000f)p-Z".length();
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
