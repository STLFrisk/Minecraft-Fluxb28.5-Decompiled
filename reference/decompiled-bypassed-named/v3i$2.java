import java.util.concurrent.Callable;

public class v3i$2 implements Callable {
   public final v3i t8u;

   public v3i$2(v3i var1) {
      this.t8u = var1;
   }

   public String call() {
      return v3i.m3l(this.t8u).u0y.getClass().getCanonicalName();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
