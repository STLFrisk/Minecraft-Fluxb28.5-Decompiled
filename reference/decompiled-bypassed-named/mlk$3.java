import java.util.concurrent.Callable;

public class mlk$3 implements Callable {
   public final mz2 _zo;
   public final mlk sms;

   public mlk$3(mlk var1, mz2 var2) {
      this.sms = var1;
      this._zo = var2;
   }

   public String call() {
      return this._zo.getClass().getCanonicalName();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
