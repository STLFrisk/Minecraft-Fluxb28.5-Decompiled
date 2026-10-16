import java.util.concurrent.Callable;

public class kh3$3 implements Callable {
   public final kh3 ji9;

   public kh3$3(kh3 var1) {
      this.ji9 = var1;
   }

   public String call() {
      return kh3.gja(this.ji9).vg8.v6e();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
