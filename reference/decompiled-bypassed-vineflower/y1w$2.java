import java.util.concurrent.Callable;

public class y1w$2 implements Callable {
   public final erg _93;
   public final y1w j5y;

   public y1w$2(y1w var1, erg var2) {
      this.j5y = var1;
      this._93 = var2;
   }

   public String call() {
      return String.valueOf(this._93.j6_());
   }

   @Override
   public Object call() {
      return this.call();
   }
}
