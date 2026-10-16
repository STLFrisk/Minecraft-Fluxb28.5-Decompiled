import java.util.concurrent.Callable;

public class y1w$6 implements Callable {
   public final erg ti3;
   public final y1w yq2;

   public y1w$6(y1w var1, erg var2) {
      this.yq2 = var1;
      this.ti3 = var2;
   }

   public String call() {
      return String.valueOf(this.ti3.j6_());
   }

   @Override
   public Object call() {
      return this.call();
   }
}
