import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum jw8 {
   public static final jw8 nqk;
   public static final jw8 h02;
   public static final jw8 big;
   public static final jw8 van;
   public static final jw8 _ld;
   public static final jw8 phf;
   private static final jw8[] xm3;
   private final jw8$uh0[] e5m;
   private static final jw8[] u2s;

   public static jw8 hbs(vt2 var0) {
      return xm3[var0.c3s()];
   }

   private jw8(jw8$uh0[] var3) {
      this.e5m = var3;
   }

   public jw8$uh0 y3x(int var1) {
      return this.e5m[var1];
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1477616540370347966L, 5551998528565661455L, MethodHandles.lookup().lookupClass()).a(242035400361961L);
      // $VF: monitorexit
      long var10 = var10000 ^ 92968909643627L;
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
      String var5 = "\u0015¨)\u009f®\u001eHñ\bÐí%×\u0084¿\u0011X\b\u0098E\u009c\u008aâ\u0013\u0018ê\b®\u0089\r\"\u0011Y-¶";
      int var7 = "\u0015¨)\u009f®\u001eHñ\bÐí%×\u0084¿\u0011X\b\u0098E\u009c\u008aâ\u0013\u0018ê\b®\u0089\r\"\u0011Y-¶".length();
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
                     nqk = new jw8(
                        new jw8$uh0[]{
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.qnb, jw8$bre.mxd, null),
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.qnb, jw8$bre.ul3, null),
                           new jw8$uh0(jw8$bre.uky, jw8$bre.qnb, jw8$bre.ul3, null),
                           new jw8$uh0(jw8$bre.uky, jw8$bre.qnb, jw8$bre.mxd, null)
                        }
                     );
                     h02 = new jw8(
                        new jw8$uh0[]{
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.ip2, jw8$bre.ul3, null),
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.ip2, jw8$bre.mxd, null),
                           new jw8$uh0(jw8$bre.uky, jw8$bre.ip2, jw8$bre.mxd, null),
                           new jw8$uh0(jw8$bre.uky, jw8$bre.ip2, jw8$bre.ul3, null)
                        }
                     );
                     big = new jw8(
                        new jw8$uh0[]{
                           new jw8$uh0(jw8$bre.uky, jw8$bre.ip2, jw8$bre.ul3, null),
                           new jw8$uh0(jw8$bre.uky, jw8$bre.qnb, jw8$bre.ul3, null),
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.qnb, jw8$bre.ul3, null),
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.ip2, jw8$bre.ul3, null)
                        }
                     );
                     van = new jw8(
                        new jw8$uh0[]{
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.ip2, jw8$bre.mxd, null),
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.qnb, jw8$bre.mxd, null),
                           new jw8$uh0(jw8$bre.uky, jw8$bre.qnb, jw8$bre.mxd, null),
                           new jw8$uh0(jw8$bre.uky, jw8$bre.ip2, jw8$bre.mxd, null)
                        }
                     );
                     _ld = new jw8(
                        new jw8$uh0[]{
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.ip2, jw8$bre.ul3, null),
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.qnb, jw8$bre.ul3, null),
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.qnb, jw8$bre.mxd, null),
                           new jw8$uh0(jw8$bre.hw2, jw8$bre.ip2, jw8$bre.mxd, null)
                        }
                     );
                     phf = new jw8(
                        new jw8$uh0[]{
                           new jw8$uh0(jw8$bre.uky, jw8$bre.ip2, jw8$bre.mxd, null),
                           new jw8$uh0(jw8$bre.uky, jw8$bre.qnb, jw8$bre.mxd, null),
                           new jw8$uh0(jw8$bre.uky, jw8$bre.qnb, jw8$bre.ul3, null),
                           new jw8$uh0(jw8$bre.uky, jw8$bre.ip2, jw8$bre.ul3, null)
                        }
                     );
                     u2s = new jw8[]{nqk, h02, big, van, _ld, phf};
                     xm3 = new jw8[6];
                     xm3[jw8$bre.qnb] = nqk;
                     xm3[jw8$bre.ip2] = h02;
                     xm3[jw8$bre.ul3] = big;
                     xm3[jw8$bre.mxd] = van;
                     xm3[jw8$bre.hw2] = _ld;
                     xm3[jw8$bre.uky] = phf;
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

                  var5 = "ág\nl¤¿\u008b÷\b\u009eCó{wv\u009aU";
                  var7 = "ág\nl¤¿\u008b÷\b\u009eCó{wv\u009aU".length();
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
