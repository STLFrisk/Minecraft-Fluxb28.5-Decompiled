import java.util.concurrent.Callable;

public class c05$5 implements Callable {
   public final Minecraft yiv;

   public c05$5(Minecraft var1) {
      this.yiv = var1;
   }

   public String call() {
      return Minecraft.ttd(this.yiv);
   }

   @Override
   public Object call() {
      return this.call();
   }
}
