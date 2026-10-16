import java.util.concurrent.Callable;

public class y1w$1 implements Callable {
   public final erg vi8;
   public final y1w zgf;

   public y1w$1(y1w var1, erg var2) {
      this.zgf = var1;
      this.vi8 = var2;
   }

   public String call() {
      return String.valueOf(this.vi8.gn1());
   }

   @Override
   public Object call() {
      return this.call();
   }
}
