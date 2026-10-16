import java.util.concurrent.Callable;

public class t9d$4 implements Callable {
   public final OpaquePredicate h0i;

   public t9d$4(OpaquePredicate var1) {
      this.h0i = var1;
   }

   public String call() {
      return this.h0i.jro.y2l();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
