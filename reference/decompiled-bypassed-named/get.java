public class get {
   public static final long bbh(long var0, long var2) {
      var0 *= 31L;
      return var0 + var2;
   }

   public static final long g_p(long var0, float var2) {
      int var3 = OpaquePredicate.b();
      long var10000 = var0 * 31L;
      if (var3 != 0) {
         var0 = var10000;

         try {
            if (var2 == 0.0F) {
               return var0;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var10000 = var0 + (long)Float.floatToIntBits(var2);
      }

      return var10000;
   }

   public static final long mql(long var0, double var2) {
      int var4 = OpaquePredicate.b();
      long var10000 = var0 * 31L;
      if (var4 != 0) {
         var0 = var10000;

         try {
            if (var2 == 0.0) {
               return var0;
            }
         } catch (oov var5) {
            throw a(var5);
         }

         var10000 = var0 + Double.doubleToLongBits(var2);
      }

      return var10000;
   }

   public static final int p05(long var0) {
      return (int)(var0 ^ var0 >> 32);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
