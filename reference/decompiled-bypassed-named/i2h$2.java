import java.util.concurrent.Callable;

public class i2h$2 implements Callable {
   public final EntityLivingBase l9k;

   public i2h$2(EntityLivingBase var1) {
      this.l9k = var1;
   }

   public String call() {
      return this.l9k.noc();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
