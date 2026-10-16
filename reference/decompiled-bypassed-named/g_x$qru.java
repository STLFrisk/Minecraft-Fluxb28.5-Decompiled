import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum g_x$qru {
   public static final g_x$qru rda;
   public static final g_x$qru vb5;
   public static final g_x$qru p3a;
   public static final g_x$qru u38;
   public static final g_x$qru kp4;
   public static final g_x$qru axr;
   private final int p5m;
   private final int omx;
   private final int e_f;
   private final int usc;
   private static final g_x$qru[] y73;
   private static final g_x$qru[] q_2;

   private g_x$qru(int var3, int var4, int var5, int var6) {
      this.p5m = var3;
      this.omx = var4;
      this.e_f = var5;
      this.usc = var6;
   }

   public static g_x$qru a6n(vt2 var0) {
      return y73[var0.c3s()];
   }

   public static int z_i(g_x$qru var0) {
      return var0.p5m;
   }

   public static int _0c(g_x$qru var0) {
      return var0.omx;
   }

   public static int ojw(g_x$qru var0) {
      return var0.e_f;
   }

   public static int jim(g_x$qru var0) {
      return var0.usc;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1345243562394632968L, 6386277312951222407L, MethodHandles.lookup().lookupClass()).a(129025894145380L);
      // $VF: monitorexit
      long var10 = var10000 ^ 21915051635028L;
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
      String var5 = "$W^ò_\u0089Ý¹\b\u009aRßØïÆlé\bu1'Qd½\u000eã\b\\£d´\u008d\u0082\u0013F";
      int var7 = "$W^ò_\u0089Ý¹\b\u009aRßØïÆlé\bu1'Qd½\u000eã\b\\£d´\u008d\u0082\u0013F".length();
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
                     rda = new g_x$qru(0, 1, 2, 3);
                     vb5 = new g_x$qru(2, 3, 0, 1);
                     p3a = new g_x$qru(3, 0, 1, 2);
                     u38 = new g_x$qru(0, 1, 2, 3);
                     kp4 = new g_x$qru(3, 0, 1, 2);
                     axr = new g_x$qru(1, 2, 3, 0);
                     q_2 = new g_x$qru[]{rda, vb5, p3a, u38, kp4, axr};
                     y73 = new g_x$qru[6];
                     y73[vt2.m3r.c3s()] = rda;
                     y73[vt2.rf3.c3s()] = vb5;
                     y73[vt2.z9q.c3s()] = p3a;
                     y73[vt2.mxp.c3s()] = u38;
                     y73[vt2.te4.c3s()] = kp4;
                     y73[vt2.zk4.c3s()] = axr;
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

                  var5 = "\u000fìQÍr\u0081\u0083S\bA\u0081Ê\u0083\u0000y!^";
                  var7 = "\u000fìQÍr\u0081\u0083S\bA\u0081Ê\u0083\u0000y!^".length();
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
