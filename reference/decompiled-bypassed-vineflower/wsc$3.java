import java.util.concurrent.Callable;

public final class wsc$3 implements Callable {
   public final mew o58;

   public wsc$3(mew var1) {
      this.o58 = var1;
   }

   public String call() {
      return wsc.ffw(this.o58);
   }

   @Override
   public Object call() {
      return this.call();
   }
}
