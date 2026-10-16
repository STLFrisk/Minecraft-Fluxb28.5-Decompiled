import java.util.concurrent.Callable;

public class bdo$2 implements Callable {
   public final int wo2;
   public final bdo xur;

   public bdo$2(bdo var1, int var2) {
      this.xur = var1;
      this.wo2 = var2;
   }

   public String call() {
      return gdw.msg[this.wo2];
   }

   @Override
   public Object call() {
      return this.call();
   }
}
