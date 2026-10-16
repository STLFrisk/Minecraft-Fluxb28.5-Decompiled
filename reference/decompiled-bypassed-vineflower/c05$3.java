import java.util.concurrent.Callable;

public class c05$3 implements Callable {
   public final c05 dsl;

   public c05$3(c05 var1) {
      this.dsl = var1;
   }

   public String call() {
      return this.dsl.u0y.getClass().getCanonicalName();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
