import java.lang.invoke.MethodHandles;

public class nh0 extends vef {
   public nh0(int var1, gdz var2, int var3) {
      super(var1, var2, var3, bn1.u0b);
      this.wr5("waterWorker");
   }

   @Override
   public int qwk(int var1) {
      return 1;
   }

   @Override
   public int fnu(int var1) {
      return this.qwk(var1) + 40;
   }

   @Override
   public int ehp() {
      return 1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(-4089856048236653480L, -5697625004197319047L, MethodHandles.lookup().lookupClass()).a(63602239973954L);
      // $VF: monitorexit
   }
}
