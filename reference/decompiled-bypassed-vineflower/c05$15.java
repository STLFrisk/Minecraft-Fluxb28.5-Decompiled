import java.util.concurrent.Callable;

public class c05$15 implements Callable {
   public final c05 ciw;

   public c05$15(c05 var1) {
      this.ciw = var1;
   }

   public String call() {
      return gis.lhg();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
