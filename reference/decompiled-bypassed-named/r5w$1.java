import com.google.common.util.concurrent.ListenableFuture;

public class r5w$1 implements Runnable {
   public final ListenableFuture ta7;
   public final r5w lhk;

   public r5w$1(r5w var1, ListenableFuture var2) {
      this.lhk = var1;
      this.ta7 = var2;
   }

   @Override
   public void run() {
      this.ta7.cancel(false);
   }
}
