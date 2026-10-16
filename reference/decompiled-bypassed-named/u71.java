import java.lang.invoke.MethodHandles;

public class u71 extends vef {
   public u71(int var1, gdz var2, int var3) {
      super(var1, var2, var3, bn1.phf);
      this.wr5("knockback");
   }

   @Override
   public int qwk(int var1) {
      return 5 + 20 * (var1 - 1);
   }

   @Override
   public int fnu(int var1) {
      return super.qwk(var1) + 50;
   }

   @Override
   public int ehp() {
      return 2;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(-8725362532830039167L, -3004856015536416470L, MethodHandles.lookup().lookupClass()).a(43303331542469L);
      // $VF: monitorexit
   }
}
