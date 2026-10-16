import java.util.concurrent.Callable;

public class k6s$1 implements Callable {
   public final k6s e0n;

   public k6s$1(k6s var1) {
      this.e0n = var1;
   }

   public String call() {
      return this.e0n.c4d();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
