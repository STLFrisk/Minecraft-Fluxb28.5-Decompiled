public class q6h {
   public long o4f = 0L;

   public void u1k() {
      this.o4f = System.currentTimeMillis();
   }

   public boolean bgq(long var1) {
      int var3 = OpaquePredicate.c();

      try {
         long var5;
         int var10000 = (var5 = System.currentTimeMillis() - this.o4f - var1) == 0L ? 0 : (var5 < 0L ? -1 : 1);
         if (var3 != 0) {
            return (boolean)var10000;
         }

         if (var10000 >= 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   public boolean hqu(double var1) {
      int var3 = OpaquePredicate.c();

      try {
         double var5;
         int var10000 = (var5 = (double)(System.currentTimeMillis() - this.o4f) - var1) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
         if (var3 != 0) {
            return (boolean)var10000;
         }

         if (var10000 >= 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return (boolean)0;
   }

   public long r2f() {
      return this.o4f;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
