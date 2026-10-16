import java.util.concurrent.Callable;

public class y1w$7 implements Callable {
   public final erg jtm;
   public final y1w m4x;

   public y1w$7(y1w var1, erg var2) {
      this.m4x = var1;
      this.jtm = var2;
   }

   public String call() {
      return String.valueOf(this.jtm.zso());
   }

   @Override
   public Object call() {
      return this.call();
   }
}
