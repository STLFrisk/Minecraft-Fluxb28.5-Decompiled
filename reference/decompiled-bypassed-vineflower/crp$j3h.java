public class crp$j3h {
   public final kqk xvr;
   public vt2 rkx;
   public int b3g;

   public crp$j3h(kqk var1, vt2 var2, int var3) {
      this.xvr = var1;
      this.rkx = var2;
      this.b3g = var3;
   }

   public void po_(byte var1, vt2 var2) {
      this.b3g = this.b3g | var1 | 1 << var2.ordinal();
   }

   public boolean hxl(vt2 var1) {
      int var2 = t9d.b();

      try {
         int var10000 = this.b3g & 1 << var1.ordinal();
         if (var2 == 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   private void bk9(vt2 var1, int var2) {
      this.rkx = var1;
      this.b3g = var2;
   }

   public static void u1n(crp$j3h var0, vt2 var1, int var2) {
      var0.bk9(var1, var2);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
