public class rlk extends _ss {
   public rlk(String var1, String var2, ekw var3, u7m var4) {
      super(var1 + var2, var3);
      this.ub3 = var4;
      int var5 = u7m._lo(var4);

      try {
         if (var5 != 0) {
            z0w.wwc.put(var1 + var5, this.ihd());
         }
      } catch (oov var6) {
         throw a(var6);
      }
   }

   public u7m u3i() {
      return this.ub3;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
