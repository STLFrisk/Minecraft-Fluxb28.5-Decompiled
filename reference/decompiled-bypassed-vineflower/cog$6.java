import java.util.concurrent.Callable;

public class cog$6 implements Callable {
   public final cog qxf;

   public cog$6(cog var1) {
      this.qxf = var1;
   }

   public String call() {
      return String.valueOf(cog.o1q(this.qxf));
   }

   @Override
   public Object call() {
      return this.call();
   }
}
