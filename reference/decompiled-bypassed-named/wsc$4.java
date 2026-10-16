import java.util.concurrent.Callable;

public final class wsc$4 implements Callable {
   public final zfz s01;

   public wsc$4(zfz var1) {
      this.s01 = var1;
   }

   public String call() {
      return this.s01.toString();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
