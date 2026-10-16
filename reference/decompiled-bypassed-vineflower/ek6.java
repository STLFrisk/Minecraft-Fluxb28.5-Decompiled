import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum ek6 {
   public static final ek6 ywn;
   public static final ek6 gf1;
   public static final ek6 sr3;
   public static final ek6 jml;

   public Class qjr() {
      return this.zgg;
   }

   public int bm8() {
      return this.k44;
   }

   public boolean ygv() {
      return this.tcx;
   }

   public boolean ooh() {
      return this.q1v;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8026345898118778800L, -2375189816158798419L, MethodHandles.lookup().lookupClass()).a(41193547028982L);
      // $VF: monitorexit
      long var10 = var10000 ^ 77190818985343L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[4];
      int var6 = 0;
      String var5 = "®®\tÛ\u0094\t{ïG\u009bÂÂuD3\u009e\u0010ÓÎö\u000bäÔ°\\Ûu\u0018él\u0087ýl";
      int var7 = "®®\tÛ\u0094\t{ïG\u009bÂÂuD3\u009e\u0010ÓÎö\u000bäÔ°\\Ûu\u0018él\u0087ýl".length();
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
                     ywn = new ek6(uv0.class, 70, p3y.cei, false, false);
                     gf1 = new ek6(j37.class, 10, p3y.cei, true, true);
                     sr3 = new ek6(u_a.class, 15, p3y.cei, true, false);
                     jml = new ek6(jd3.class, 5, p3y.six, true, false);
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

                  var5 = "s\u0011\u0084Î/_×ç\b\u0085j´°\u0092¿í\u001c";
                  var7 = "s\u0011\u0084Î/_×ç\b\u0085j´°\u0092¿í\u001c".length();
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
