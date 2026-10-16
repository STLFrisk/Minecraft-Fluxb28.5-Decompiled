import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public enum _h4$i61 implements v4k {
   public static final _h4$i61 gs0;
   public static final _h4$i61 z89;
   public static final _h4$i61 e6j;
   public static final _h4$i61 ahr;
   private final String hkl;
   private static final _h4$i61[] bcq;

   private _h4$i61(String var3) {
      this.hkl = var3;
   }

   @Override
   public String toString() {
      return this.hkl;
   }

   public static _h4$i61 ckj(vt2$y0s var0) {
      try {
         switch (_h4$1.gw_[var0.ordinal()]) {
            case 1:
               return gs0;
            case 2:
               return z89;
            case 3:
               return e6j;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return ahr;
   }

   @Override
   public String mo3() {
      return this.hkl;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-636015879113126455L, 6356060112034973130L, MethodHandles.lookup().lookupClass()).a(137224188876603L);
      // $VF: monitorexit
      long var10 = var10000 ^ 23758156362447L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "\fËÛs¸´G@\b°6\u0095<â¾ºK";
      int var7 = "\fËÛs¸´G@\b°6\u0095<â¾ºK".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = a(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            gs0 = new _h4$i61("x");
            z89 = new _h4$i61("y");
            e6j = new _h4$i61("z");
            ahr = new _h4$i61(var8[1]);
            bcq = new _h4$i61[]{gs0, z89, e6j, ahr};
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov a(oov var0) {
      return var0;
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
