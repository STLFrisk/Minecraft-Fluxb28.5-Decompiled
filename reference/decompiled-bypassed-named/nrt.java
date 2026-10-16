import java.lang.invoke.MethodHandles;

public class nrt extends vef {
   public nrt(int var1, gdz var2, int var3) {
      super(var1, var2, var3, bn1.u0b);
      this.wr5("oxygen");
   }

   @Override
   public int qwk(int var1) {
      return 10 * var1;
   }

   @Override
   public int fnu(int var1) {
      return this.qwk(var1) + 30;
   }

   @Override
   public int ehp() {
      return 3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(5743594438923741023L, -4448105295666130835L, MethodHandles.lookup().lookupClass()).a(41195809744031L);
      // $VF: monitorexit
   }
}
