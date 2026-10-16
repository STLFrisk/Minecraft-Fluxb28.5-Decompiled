public class p0z {
   public static Integer cng(int var0) {
      int var1 = OpaquePredicate.b();

      int var10000;
      label27: {
         try {
            var10000 = var0;
            if (var1 == 0) {
               break label27;
            }

            if (var0 < 0) {
               return new Integer(var0);
            }
         } catch (oov var3) {
            throw a(var3);
         }

         var10000 = var0;
      }

      try {
         if (var10000 < ax4.length) {
            return ax4[var0];
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return new Integer(var0);
   }

   static {
      int var0 = 0;
      int var1 = ax4.length;

      try {
         while (var0 < var1) {
            ax4[var0] = var0;
            var0++;
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
