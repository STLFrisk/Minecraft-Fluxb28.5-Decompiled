import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum xq3$e6b {
   public static final xq3$e6b yh_;
   public static final xq3$e6b igw;
   public static final xq3$e6b m2u;
   public static final xq3$e6b p4n;
   private static final Map mjm;
   private final boolean u1b;
   private final String hfu;
   private static final xq3$e6b[] mf7;

   private xq3$e6b(String var3, boolean var4) {
      this.hfu = var3;
      this.u1b = var4;
   }

   public boolean k7m() {
      return this.u1b;
   }

   public String qy2() {
      return this.hfu;
   }

   public static xq3$e6b muc(String var0) {
      return (xq3$e6b)mjm.get(var0);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2264770804513802201L, -525641708786757397L, MethodHandles.lookup().lookupClass()).a(103335048490623L);
      // $VF: monitorexit
      long var10 = var10000 ^ 4099414450568L;
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
      String var5 = "õ5}!#\u0094ü\u0082É©\u0005é\u0082<7\u0089\u00184\u0084Ç\u0010õ\u008c'?tsñ-\u0084öi\u0015\u001b\ruFÆuæ)\u0010\u0085\u0004öVÈ¸ïhm\u000b&ØÙó¿6\u0010\u0089Îð±÷-:]\u008b\u0098x#\u009eª3a\u0018^Â*Ä´T#\u0002f¬]Jj¹´×\u0002.7åLÁGû\u0010ê\u001b:ºº¾G~¦\u008eÚ\u0085\u0080Ôm¦";
      int var7 = "õ5}!#\u0094ü\u0082É©\u0005é\u0082<7\u0089\u00184\u0084Ç\u0010õ\u008c'?tsñ-\u0084öi\u0015\u001b\ruFÆuæ)\u0010\u0085\u0004öVÈ¸ïhm\u000b&ØÙó¿6\u0010\u0089Îð±÷-:]\u008b\u0098x#\u009eª3a\u0018^Â*Ä´T#\u0002f¬]Jj¹´×\u0002.7åLÁGû\u0010ê\u001b:ºº¾G~¦\u008eÚ\u0085\u0080Ôm¦"
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
                     yh_ = new xq3$e6b(var8[5], true);
                     igw = new xq3$e6b(var8[1], true);
                     m2u = new xq3$e6b(var8[2], true);
                     p4n = new xq3$e6b(var8[3], true);
                     mf7 = new xq3$e6b[]{yh_, igw, m2u, p4n};
                     mjm = Maps.newHashMap();

                     for (xq3$e6b var15 : values()) {
                        mjm.put(var15.qy2(), var15);
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

                  var5 = "øµE\u0002ëDÏ\f\u0017\u009fÄ\u0081B\u0097ns\u0010o\u0014ÅfÈ¼G\u0000\u0092\u0097w\u009dx\u000ei©";
                  var7 = "øµE\u0002ëDÏ\f\u0017\u009fÄ\u0081B\u0097ns\u0010o\u0014ÅfÈ¼G\u0000\u0092\u0097w\u009dx\u000ei©".length();
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
