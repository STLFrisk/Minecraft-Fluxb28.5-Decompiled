import java.util.concurrent.Callable;

public class i2h$4 implements Callable {
   public final i2h ehh;

   public i2h$4(i2h var1) {
      this.ehh = var1;
   }

   public String call() {
      return this.ehh.hzp.toString();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
