import java.util.concurrent.Callable;

public class y1w$5 implements Callable {
   public final erg k30;
   public final y1w j94;

   public y1w$5(y1w var1, erg var2) {
      this.j94 = var1;
      this.k30 = var2;
   }

   public String call() {
      return String.valueOf(this.k30.gn1());
   }

   @Override
   public Object call() {
      return this.call();
   }
}
