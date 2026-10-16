import java.util.concurrent.Callable;

public class fln$3 implements Callable {
   public final fln k_c;

   public fln$3(fln var1) {
      this.k_c = var1;
   }

   public String call() {
      return this.k_c.getClass().getCanonicalName();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
