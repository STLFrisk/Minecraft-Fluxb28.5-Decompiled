import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum n0i$p_w {
   public static final n0i$p_w hz0;
   public static final n0i$p_w _pa;
   public static final n0i$p_w hih;
   public static final n0i$p_w i4t;
   public static final n0i$p_w buq;
   public static final n0i$p_w imf;
   public static final n0i$p_w kxg;
   private final int a45;
   private final String efj;
   private final int n02;
   private static final n0i$p_w[] xlg;

   private n0i$p_w(int var3, String var4, int var5) {
      this.a45 = var3;
      this.efj = var4;
      this.n02 = var5;
   }

   public int sme() {
      return this.a45;
   }

   public String mc6() {
      return this.efj;
   }

   public int j60() {
      return this.n02;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6401978307777747977L, -2291919201984591396L, MethodHandles.lookup().lookupClass()).a(273420218553121L);
      // $VF: monitorexit
      long var10 = var10000 ^ 4680491925669L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[14];
      int var6 = 0;
      String var5 = "\u0017\u008e¦Jh\u0001<,\u0010E¥áF8ÿ8¥\u0014$c9\u007f·×³\bÃ\u00ad\u0092Ó(®Và\bÐôH\u00adGÔôW\u0010E¥áF8ÿ8¥¾PBÔ6\\ \u009e\bcm4À®½\u0087R\bbô\u0018Æâ\u0096mÁ\b\t\u0012éhØìlì\bÎe)*\u008e~m\u0019\bÍmLvP¢îô\u0010E¥áF8ÿ8¥¦)Ã\u008b1\u001a3Q\b\u0086Ô0öQ\"ÿt";
      int var7 = "\u0017\u008e¦Jh\u0001<,\u0010E¥áF8ÿ8¥\u0014$c9\u007f·×³\bÃ\u00ad\u0092Ó(®Và\bÐôH\u00adGÔôW\u0010E¥áF8ÿ8¥¾PBÔ6\\ \u009e\bcm4À®½\u0087R\bbô\u0018Æâ\u0096mÁ\b\t\u0012éhØìlì\bÎe)*\u008e~m\u0019\bÍmLvP¢îô\u0010E¥áF8ÿ8¥¦)Ã\u008b1\u001a3Q\b\u0086Ô0öQ\"ÿt"
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
                     hz0 = new n0i$p_w(4, var8[7], 5126);
                     _pa = new n0i$p_w(1, var8[10], 5121);
                     hih = new n0i$p_w(1, var8[0], 5120);
                     i4t = new n0i$p_w(2, var8[1], 5123);
                     buq = new n0i$p_w(2, var8[2], 5122);
                     imf = new n0i$p_w(4, var8[4], 5125);
                     kxg = new n0i$p_w(4, var8[11], 5124);
                     xlg = new n0i$p_w[]{hz0, _pa, hih, i4t, buq, imf, kxg};
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

                  var5 = "¶j{Dcê³(\b\u0099\u0091¯¼\u001c:ÅÐ";
                  var7 = "¶j{Dcê³(\b\u0099\u0091¯¼\u001c:ÅÐ".length();
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
