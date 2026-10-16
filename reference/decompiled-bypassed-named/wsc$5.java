import java.util.concurrent.Callable;

public final class wsc$5 implements Callable {
   public final mew nvu;

   public wsc$5(mew var1) {
      this.nvu = var1;
   }

   public String call() {
      return wsc.ffw(this.nvu);
   }

   @Override
   public Object call() {
      return this.call();
   }
}
