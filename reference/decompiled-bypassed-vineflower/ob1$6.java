import java.util.concurrent.Callable;

public class ob1$6 implements Callable {
   public final hv0 zv7;
   public final ob1 s7v;

   public ob1$6(ob1 var1, hv0 var2) {
      this.s7v = var1;
      this.zv7 = var2;
   }

   public String call() {
      return this.zv7.toString();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
