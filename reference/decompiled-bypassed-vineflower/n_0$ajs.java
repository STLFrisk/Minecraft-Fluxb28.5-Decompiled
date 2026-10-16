import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum n_0$ajs {
   public static final n_0$ajs yyy;
   public static final n_0$ajs wbg;
   public static final n_0$ajs koh;
   public static final n_0$ajs jpm;
   private static Map qbo;
   public final String fq2;
   public final int v_d;
   private static final n_0$ajs[] rrb;

   public static String[] vgq() {
      return qbo.keySet().toArray(new String[qbo.size()]);
   }

   public static n_0$ajs qnh(String var0) {
      return (n_0$ajs)qbo.get(var0);
   }

   private n_0$ajs(String var3, int var4) {
      this.fq2 = var3;
      this.v_d = var4;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2187479212781266438L, 9081562872393630111L, MethodHandles.lookup().lookupClass()).a(123647200625966L);
      // $VF: monitorexit
      long var10 = var10000 ^ 2127372630492L;
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
      String var5 = "MNr\u0086\u00ad7À\u000b\b4\\ìkh)\u000fÿ\u0018{ü\u00973\u0089\u008d\f\u0081,®\u0010Á×¤Ï¶UÅ\u008e]=\u009f<¦\bX\u0007q\\\u00adÜ\nö\b=kfÛ|uDq\u0010P3ÏoG^Q§Z4Üê\u008f\u009e`\u0082";
      int var7 = "MNr\u0086\u00ad7À\u000b\b4\\ìkh)\u000fÿ\u0018{ü\u00973\u0089\u008d\f\u0081,®\u0010Á×¤Ï¶UÅ\u008e]=\u009f<¦\bX\u0007q\\\u00adÜ\nö\b=kfÛ|uDq\u0010P3ÏoG^Q§Z4Üê\u008f\u009e`\u0082"
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
                     yyy = new n_0$ajs(var8[1], 0);
                     wbg = new n_0$ajs(var8[3], 1);
                     koh = new n_0$ajs(var8[6], 2);
                     jpm = new n_0$ajs(var8[5], 3);
                     rrb = new n_0$ajs[]{yyy, wbg, koh, jpm};
                     qbo = Maps.newHashMap();

                     for (n_0$ajs var15 : values()) {
                        qbo.put(var15.fq2, var15);
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

                  var5 = "P3ÏoG^Q§\u0091°¦o\u0090\t\u008b\u0013ñ¨e¶ô/\u0081#\u0018{ü\u00973\u0089\u008d\f\u0081\u0087þ6[\u0097ó\u0093è\u008c\b,4\u0088÷Á\u0011";
                  var7 = "P3ÏoG^Q§\u0091°¦o\u0090\t\u008b\u0013ñ¨e¶ô/\u0081#\u0018{ü\u00973\u0089\u008d\f\u0081\u0087þ6[\u0097ó\u0093è\u008c\b,4\u0088÷Á\u0011"
                     .length();
                  var4 = 24;
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
