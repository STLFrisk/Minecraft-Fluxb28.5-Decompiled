public class gem$s7_ extends vrx {
   public final gem y37;

   public gem$s7_(gem var1, rsi var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.y37 = var1;
   }

   @Override
   public boolean xvl(erg var1) {
      int var2 = OpaquePredicate.b();

      try {
         if (var2 == 0) {
            return var1.gn1().shg(var1);
         }

         if (var1 == null) {
            return false;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var1.gn1().shg(var1);
   }

   @Override
   public int c1r() {
      return 64;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
