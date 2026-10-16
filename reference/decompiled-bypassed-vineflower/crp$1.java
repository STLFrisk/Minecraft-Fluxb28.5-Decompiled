import java.util.concurrent.Callable;

public class crp$1 implements Callable {
   public final double n85;
   public final double jdi;
   public final double v9p;
   public final crp vgb;

   public crp$1(crp var1, double var2, double var4, double var6) {
      this.vgb = var1;
      this.n85 = var2;
      this.jdi = var4;
      this.v9p = var6;
   }

   public String call() {
      return wsc.elx(this.n85, this.jdi, this.v9p);
   }

   @Override
   public Object call() {
      return this.call();
   }
}
