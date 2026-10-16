import java.util.concurrent.Callable;

public class t9d$1 implements Callable {
   public final mew mdk;
   public final t9d afy;

   public t9d$1(t9d var1, mew var2) {
      this.afy = var1;
      this.mdk = var2;
   }

   public String call() {
      return wsc.ffw(this.mdk);
   }

   @Override
   public Object call() {
      return this.call();
   }
}
