import java.util.concurrent.Callable;

public class c05$4 implements Callable {
   public final Minecraft brs;

   public c05$4(Minecraft var1) {
      this.brs = var1;
   }

   public String call() {
      return this.brs.u0y.getClass().getCanonicalName();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
