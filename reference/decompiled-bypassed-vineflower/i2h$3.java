import java.util.concurrent.Callable;

public class i2h$3 implements Callable {
   public final i2h tbh;

   public i2h$3(i2h var1) {
      this.tbh = var1;
   }

   public String call() {
      return this.tbh.wgv.toString();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
