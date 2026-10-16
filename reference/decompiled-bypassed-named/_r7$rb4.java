import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _r7$rb4 {
   public static final _r7$rb4 e2e;
   public static final _r7$rb4 vyb;
   public static final _r7$rb4 k3_;
   public static final _r7$rb4 ii5;
   public static final _r7$rb4 p3k;
   private static final _r7$rb4[] p24;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1020552610326307279L, -2662465753335271369L, MethodHandles.lookup().lookupClass()).a(34566532564115L);
      // $VF: monitorexit
      long var10 = var10000 ^ 43084246181877L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[5];
      int var6 = 0;
      String var5 = ">\u009b\u009e\u0018Ð\u0094sÇ\u00ad`~ø?E\u008e@\u00103Yó\u0099!Z\t\u0017EdQ¬(u\u0019¹\u0010¯êP\u0096\u007f\u0015w\u0088uÅ¢èÏ\u008f\u000eé";
      int var7 = ">\u009b\u009e\u0018Ð\u0094sÇ\u00ad`~ø?E\u008e@\u00103Yó\u0099!Z\t\u0017EdQ¬(u\u0019¹\u0010¯êP\u0096\u007f\u0015w\u0088uÅ¢èÏ\u008f\u000eé"
         .length();
      char var4 = 16;
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
                     e2e = new _r7$rb4();
                     vyb = new _r7$rb4();
                     k3_ = new _r7$rb4();
                     ii5 = new _r7$rb4();
                     p3k = new _r7$rb4();
                     p24 = new _r7$rb4[]{e2e, vyb, k3_, ii5, p3k};
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

                  var5 = "\u0016P-½¯\u0082\u0013=\u00103Yó\u0099!Z\t\u0017\u0097i\u008d\u000f1v\u0080X";
                  var7 = "\u0016P-½¯\u0082\u0013=\u00103Yó\u0099!Z\t\u0017\u0097i\u008d\u000f1v\u0080X".length();
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
