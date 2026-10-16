import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.Future;

public class x_b$1 implements ChannelFutureListener {
   public final x_b qdv;

   public x_b$1(x_b var1) {
      this.qdv = var1;
   }

   public void p7b(ChannelFuture var1) {
      this.qdv.l0o.ya5(x_b.k7_(this.qdv).t0j());
   }

   public void operationComplete(Future var1) {
      this.p7b((ChannelFuture)var1);
   }
}
