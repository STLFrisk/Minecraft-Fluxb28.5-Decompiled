import java.util.concurrent.Callable;

public class c05$5 implements Callable {
   public final c05 yiv;

   public c05$5(c05 var1) {
      this.yiv = var1;
   }

   public String call() {
      return c05.ttd(this.yiv);
   }

   @Override
   public Object call() {
      return this.call();
   }
}
