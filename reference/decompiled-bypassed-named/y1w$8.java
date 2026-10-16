import java.util.concurrent.Callable;

public class y1w$8 implements Callable {
   public final erg xgo;
   public final y1w k5e;

   public y1w$8(y1w var1, erg var2) {
      this.k5e = var1;
      this.xgo = var2;
   }

   public String call() {
      return String.valueOf(this.xgo._xr());
   }

   @Override
   public Object call() {
      return this.call();
   }
}
