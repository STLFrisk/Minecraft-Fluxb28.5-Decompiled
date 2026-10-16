import java.lang.invoke.MethodHandles;

public class zvo extends vef {
   public zvo(int var1, gdz var2, int var3) {
      super(var1, var2, var3, bn1.q92);
      this.wr5("digging");
   }

   @Override
   public int qwk(int var1) {
      return 1 + 10 * (var1 - 1);
   }

   @Override
   public int fnu(int var1) {
      return super.qwk(var1) + 50;
   }

   @Override
   public int ehp() {
      return 5;
   }

   @Override
   public boolean ovd(erg var1) {
      try {
         if (var1.gn1() == xbr.qsl) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return super.ovd(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(2526736938283586200L, -1538586506131358713L, MethodHandles.lookup().lookupClass()).a(59375192814085L);
      // $VF: monitorexit
   }

   private static oov a(oov var0) {
      return var0;
   }
}
