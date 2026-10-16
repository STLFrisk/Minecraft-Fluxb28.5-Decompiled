import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum g_x$pi5 {
   public static final g_x$pi5 wyb;
   public static final g_x$pi5 r4c;
   public static final g_x$pi5 qvp;
   public static final g_x$pi5 up3;
   public static final g_x$pi5 woi;
   public static final g_x$pi5 e80;
   public static final g_x$pi5 hxa;
   public static final g_x$pi5 wiv;
   public static final g_x$pi5 m8h;
   public static final g_x$pi5 eqf;
   public static final g_x$pi5 tbc;
   public static final g_x$pi5 _g3;
   public final int e9j;
   private static final g_x$pi5[] nqq;

   private g_x$pi5(vt2 var3, boolean var4) {
      this.e9j = var3.c3s() + (var4 ? vt2.values().length : 0);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6151633094877281814L, 5255934134425496748L, MethodHandles.lookup().lookupClass()).a(150520179626095L);
      // $VF: monitorexit
      long var10 = var10000 ^ 121843353859951L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[12];
      int var6 = 0;
      String var5 = "WÊ;\u0011&\u0010\u0094l\b}?|y£,p^\u0010õJù¯H\u009c\u00994ä3-ô½\u001aÝ~\bôÈoõÙ\u0084=è\u0010\u0016©GBáí\u0002Mà\u0003Ô¤°N\u0010e\b¶dd\u008b9X\u009c\u0007\u0010W\u0015YØû~°\rÓþó\u0010A\u0019\u0019Z\b_ß\u0080\nó\u0081¼õ\b(\u009bÈ\u001d*f\u0006p\u0010\u0084Üïn\u000f\u0095#c\u0081\u000e©f\u0012k_²";
      int var7 = "WÊ;\u0011&\u0010\u0094l\b}?|y£,p^\u0010õJù¯H\u009c\u00994ä3-ô½\u001aÝ~\bôÈoõÙ\u0084=è\u0010\u0016©GBáí\u0002Mà\u0003Ô¤°N\u0010e\b¶dd\u008b9X\u009c\u0007\u0010W\u0015YØû~°\rÓþó\u0010A\u0019\u0019Z\b_ß\u0080\nó\u0081¼õ\b(\u009bÈ\u001d*f\u0006p\u0010\u0084Üïn\u000f\u0095#c\u0081\u000e©f\u0012k_²"
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
                     wyb = new g_x$pi5(vt2.m3r, false);
                     r4c = new g_x$pi5(vt2.rf3, false);
                     qvp = new g_x$pi5(vt2.z9q, false);
                     up3 = new g_x$pi5(vt2.mxp, false);
                     woi = new g_x$pi5(vt2.te4, false);
                     e80 = new g_x$pi5(vt2.zk4, false);
                     hxa = new g_x$pi5(vt2.m3r, true);
                     wiv = new g_x$pi5(vt2.rf3, true);
                     m8h = new g_x$pi5(vt2.z9q, true);
                     eqf = new g_x$pi5(vt2.mxp, true);
                     tbc = new g_x$pi5(vt2.te4, true);
                     _g3 = new g_x$pi5(vt2.zk4, true);
                     nqq = new g_x$pi5[]{wyb, r4c, qvp, up3, woi, e80, hxa, wiv, m8h, eqf, tbc, _g3};
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

                  var5 = "ÎU©`@t|Y\u0010Y\u0084+M\u0088lóßÝßäËy\u00036¸";
                  var7 = "ÎU©`@t|Y\u0010Y\u0084+M\u0088lóßÝßäËy\u00036¸".length();
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
