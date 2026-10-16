import java.util.concurrent.Callable;

public final class ttt$1 implements Callable {
   public final gyu qyr;

   public ttt$1(gyu var1) {
      this.qyr = var1;
   }

   public String call() {
      return String.valueOf(this.qyr);
   }

   @Override
   public Object call() {
      return this.call();
   }
}
