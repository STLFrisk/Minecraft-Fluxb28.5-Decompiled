import java.util.concurrent.Callable;

public class jux$1 implements Callable {
   public final flo fwy;
   public final jux w1r;

   public jux$1(jux var1, flo var2) {
      this.w1r = var1;
      this.fwy = var2;
   }

   public String call() {
      return this.fwy.toString();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
