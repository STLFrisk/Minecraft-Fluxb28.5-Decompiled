import java.util.concurrent.Callable;

public class bdo$1 implements Callable {
   public final String xyg;
   public final bdo p9b;

   public bdo$1(bdo var1, String var2) {
      this.p9b = var1;
      this.xyg = var2;
   }

   public String call() {
      return gdw.msg[((gdw)bdo._m3(this.p9b).get(this.xyg)).ky0()];
   }

   @Override
   public Object call() {
      return this.call();
   }
}
