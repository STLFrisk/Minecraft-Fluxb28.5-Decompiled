import java.util.concurrent.Callable;

public class y1w$3 implements Callable {
   public final erg cul;
   public final y1w xhx;

   public y1w$3(y1w var1, erg var2) {
      this.xhx = var1;
      this.cul = var2;
   }

   public String call() {
      return String.valueOf(this.cul.zso());
   }

   @Override
   public Object call() {
      return this.call();
   }
}
