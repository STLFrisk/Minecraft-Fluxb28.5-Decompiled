import java.util.concurrent.Callable;

public class k6s$2 implements Callable {
   public final k6s uy4;

   public k6s$2(k6s var1) {
      this.uy4 = var1;
   }

   public String call() {
      return this.uy4.noc();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
