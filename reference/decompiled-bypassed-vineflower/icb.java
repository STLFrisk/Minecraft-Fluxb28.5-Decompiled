public class icb extends mcs {
   public icb(int var1, gdz var2, boolean var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public double mgu(int var1, xk5 var2) {
      try {
         if (this.zr9 == mcs.fhc.zr9) {
            return (double)(-0.5F * (float)(var1 + 1));
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return 1.3 * (double)(var1 + 1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
