public class u10$red extends s24 {
   public u10$red(u10 var1, Class var2) {
      super(var1, var2, true);
   }

   @Override
   public boolean vle() {
      int var1 = t9d.b();
      float var2 = this.pf7.xeu(1.0F);

      try {
         float var4;
         int var10000 = (var4 = var2 - 0.5F) == 0.0F ? 0 : (var4 < 0.0F ? -1 : 1);
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 >= 0) {
            return (boolean)0;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return super.vle();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
