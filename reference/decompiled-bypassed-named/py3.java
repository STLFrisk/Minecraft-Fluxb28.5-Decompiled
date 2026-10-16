import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class py3 extends gyu {
   public gyu ecb;

   public py3(int var1, gyu var2) {
      super(var1);
      this.ecb = var2;
      this.cq8(var2.np2, true);
      this.jcq = var2.jcq + " M";
      this.ke4 = var2.ke4;
      this.kro = var2.kro;
      this.jfn = var2.jfn;
      this.f6x = var2.f6x;
      this.yeh = var2.yeh;
      this.rm7 = var2.rm7;
      this.plx = var2.plx;
      this.e_u = var2.e_u;
      this.b9z = var2.b9z;
      this.nr6 = var2.nr6;
      this.c1d = Lists.newArrayList(var2.c1d);
      this.wq_ = Lists.newArrayList(var2.wq_);
      this._05 = Lists.newArrayList(var2._05);
      this.w60 = Lists.newArrayList(var2.w60);
      this.rm7 = var2.rm7;
      this.plx = var2.plx;
      this.f6x = var2.f6x + 0.1F;
      this.yeh = var2.yeh + 0.2F;
   }

   @Override
   public void u0r(OpaquePredicate var1, Random var2, mew var3) {
      this.ecb.dmv.dvs(var1, var2, this, var3);
   }

   @Override
   public void rci(OpaquePredicate var1, Random var2, lno var3, int var4, int var5, double var6) {
      this.ecb.rci(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public float uii() {
      return this.ecb.uii();
   }

   @Override
   public e9q jk9(Random var1) {
      return this.ecb.jk9(var1);
   }

   @Override
   public int i9_(mew var1) {
      return this.ecb.i9_(var1);
   }

   @Override
   public int bib(mew var1) {
      return this.ecb.bib(var1);
   }

   @Override
   public Class y0m() {
      return this.ecb.y0m();
   }

   @Override
   public boolean yrl(gyu var1) {
      return this.ecb.yrl(var1);
   }

   @Override
   public gyu$ch_ wwa() {
      return this.ecb.wwa();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      c.a(-303813510930301406L, 360660853464515475L, MethodHandles.lookup().lookupClass()).a(40981173598392L);
      // $VF: monitorexit
   }
}
