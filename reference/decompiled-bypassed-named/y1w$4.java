import java.util.concurrent.Callable;

public class y1w$4 implements Callable {
   public final erg npa;
   public final y1w rur;

   public y1w$4(y1w var1, erg var2) {
      this.rur = var1;
      this.npa = var2;
   }

   public String call() {
      return String.valueOf(this.npa._xr());
   }

   @Override
   public Object call() {
      return this.call();
   }
}
