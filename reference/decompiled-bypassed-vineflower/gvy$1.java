import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import javax.crypto.SecretKey;

public class gvy$1 implements GenericFutureListener {
   public final SecretKey wqi;
   public final gvy j70;

   public gvy$1(gvy var1, SecretKey var2) {
      this.j70 = var1;
      this.wqi = var2;
   }

   public void operationComplete(Future var1) {
      gvy.fcv(this.j70).n62(this.wqi);
   }
}
