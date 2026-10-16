import java.lang.invoke.MethodHandles;

public class vnt extends vef {
   public vnt(int var1, gdz var2, int var3) {
      super(var1, var2, var3, bn1.t6y);
      this.wr5("waterWalker");
   }

   @Override
   public int qwk(int var1) {
      return var1 * 10;
   }

   @Override
   public int fnu(int var1) {
      return this.qwk(var1) + 15;
   }

   @Override
   public int ehp() {
      return 3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(8824929604181083841L, -6811352311531173394L, MethodHandles.lookup().lookupClass()).a(194574477382454L);
      // $VF: monitorexit
   }
}
