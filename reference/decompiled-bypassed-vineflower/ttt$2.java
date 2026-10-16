import java.util.concurrent.Callable;

public final class ttt$2 implements Callable {
   public final gyu ue8;

   public ttt$2(gyu var1) {
      this.ue8 = var1;
   }

   public String call() {
      return String.valueOf(this.ue8);
   }

   @Override
   public Object call() {
      return this.call();
   }
}
