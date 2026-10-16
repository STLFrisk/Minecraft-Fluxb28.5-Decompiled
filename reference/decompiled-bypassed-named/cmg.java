import java.lang.invoke.MethodHandles;

public class cmg extends vef {
   public cmg(int var1, gdz var2, int var3) {
      super(var1, var2, var3, bn1.j3b);
      this.wr5("arrowKnockback");
   }

   @Override
   public int qwk(int var1) {
      return 12 + (var1 - 1) * 20;
   }

   @Override
   public int fnu(int var1) {
      return this.qwk(var1) + 25;
   }

   @Override
   public int ehp() {
      return 2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(-8222345147321962354L, -8529309960991900993L, MethodHandles.lookup().lookupClass()).a(221298574284166L);
      // $VF: monitorexit
   }
}
