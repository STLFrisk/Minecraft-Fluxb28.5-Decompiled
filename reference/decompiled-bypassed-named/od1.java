import java.lang.invoke.MethodHandles;

public class od1 extends vef {
   public od1(int var1, gdz var2, int var3, bn1 var4) {
      super(var1, var2, var3, var4);
      this.wr5("fishingSpeed");
   }

   @Override
   public int qwk(int var1) {
      return 15 + (var1 - 1) * 9;
   }

   @Override
   public int fnu(int var1) {
      return super.qwk(var1) + 50;
   }

   @Override
   public int ehp() {
      return 3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(846912675818495414L, -7056806142010478656L, MethodHandles.lookup().lookupClass()).a(30800500649183L);
      // $VF: monitorexit
   }
}
