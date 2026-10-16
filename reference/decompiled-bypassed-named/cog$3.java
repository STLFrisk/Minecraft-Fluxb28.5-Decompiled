import java.util.concurrent.Callable;

public class cog$3 implements Callable {
   public final cog k42;

   public cog$3(cog var1) {
      this.k42 = var1;
   }

   public String call() {
      return cog.vfl(this.k42);
   }

   @Override
   public Object call() {
      return this.call();
   }
}
