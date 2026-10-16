import java.util.concurrent.Callable;

public class c05$13 implements Callable {
   public final Minecraft _9g;

   public c05$13(Minecraft var1) {
      this._9g = var1;
   }

   public String call() {
      return Minecraft.lql(this._9g).o0m().toString();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
