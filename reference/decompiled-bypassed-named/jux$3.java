import java.util.concurrent.Callable;

public class jux$3 implements Callable {
   public final flo rze;
   public final jux dc7;

   public jux$3(jux var1, flo var2) {
      this.dc7 = var1;
      this.rze = var2;
   }

   public String call() {
      return this.rze.toString();
   }

   @Override
   public Object call() {
      return this.call();
   }
}
