import java.util.concurrent.Callable;

public class cog$1 implements Callable {
   public final cog fpl;

   public cog$1(cog var1) {
      this.fpl = var1;
   }

   public String call() {
      return String.valueOf(this.fpl._oa());
   }

   @Override
   public Object call() {
      return this.call();
   }
}
