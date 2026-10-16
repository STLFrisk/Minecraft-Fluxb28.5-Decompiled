import java.util.concurrent.Callable;
import org.lwjgl.Sys;

public class c05$6 implements Callable {
   public final c05 euy;

   public c05$6(c05 var1) {
      this.euy = var1;
   }

   public String call() {
      return Sys.getVersion();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
