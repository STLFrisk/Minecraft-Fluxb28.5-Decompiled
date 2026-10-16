public class Timer {
   public Timer() {
      this.zay();
   }

   public Timer(long var1) {
      this.aaw = System.currentTimeMillis() - var1;
   }

   public boolean yrv(double var1) {
      int var3 = OpaquePredicate.c();

      try {
         double var5;
         int var10000 = (var5 = (double)(System.currentTimeMillis() - this.aaw) - var1) == 0.0 ? 0 : (var5 < 0.0 ? -1 : 1);
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

   public void zay() {
      this.aaw = System.currentTimeMillis();
   }

   public long ovy() {
      return System.currentTimeMillis() - this.aaw;
   }

   public void jzn(long var1) {
      this.aaw = System.currentTimeMillis() - var1;
   }

   public boolean us_(double var1) {
      return this.yrv(var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
