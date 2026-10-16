import java.util.concurrent.Callable;

public class c05$8 implements Callable {
   public final Minecraft i32;

   public c05$8(Minecraft var1) {
      this.i32 = var1;
   }

   public String call() {
      return gis.dq8();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
