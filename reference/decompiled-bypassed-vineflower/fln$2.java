import java.util.concurrent.Callable;

public class fln$2 implements Callable {
   public final int hob;
   public final int oxx;
   public final fln wb_;

   public fln$2(fln var1, int var2, int var3) {
      this.wb_ = var1;
      this.hob = var2;
      this.oxx = var3;
   }

   public String call() {
      return String.valueOf(h2f.fcz(this.hob, this.oxx));
   }

   @Override
   public Object call() {
      return this.call();
   }
}
