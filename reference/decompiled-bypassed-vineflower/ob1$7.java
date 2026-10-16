import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

public class ob1$7 implements GenericFutureListener {
   public final hv0 fqt;
   public final tao hw4;
   public final ob1 ga9;

   public ob1$7(ob1 var1, hv0 var2, tao var3) {
      this.ga9 = var1;
      this.fqt = var2;
      this.hw4 = var3;
   }

   public void operationComplete(Future var1) {
      this.fqt.g8c(this.hw4);
   }
}
