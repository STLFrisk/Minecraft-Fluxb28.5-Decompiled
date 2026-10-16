import java.lang.invoke.MethodHandles;

public class c5k extends vef {
   public c5k(int var1, gdz var2, int var3) {
      super(var1, var2, var3, bn1.j3b);
      this.wr5("arrowDamage");
   }

   @Override
   public int qwk(int var1) {
      return 1 + (var1 - 1) * 10;
   }

   @Override
   public int fnu(int var1) {
      return this.qwk(var1) + 15;
   }

   @Override
   public int ehp() {
      return 5;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(-1385734761906095662L, -6946408819196970823L, MethodHandles.lookup().lookupClass()).a(94467861212749L);
      // $VF: monitorexit
   }
}
