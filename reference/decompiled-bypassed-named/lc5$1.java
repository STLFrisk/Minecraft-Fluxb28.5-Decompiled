import java.util.concurrent.Callable;

public class lc5$1 implements Callable {
   public final sm5 t8v;
   public final lc5 lvw;

   public lc5$1(lc5 var1, sm5 var2) {
      this.lvw = var1;
      this.t8v = var2;
   }

   public String call() {
      return this.t8v.getClass().getName();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
