import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;

public class t7e$2 extends ChannelInitializer {
   public final wat x0k;
   public final r1l azd;
   public final t7e m8u;

   public t7e$2(t7e var1, wat var2, r1l var3) {
      this.m8u = var1;
      this.x0k = var2;
      this.azd = var3;
   }

   public void initChannel(Channel var1) {
      try {
         var1.config().setOption(ChannelOption.TCP_NODELAY, true);
      } catch (ChannelException var3) {
      }

      var1.pipeline().addLast(new ChannelHandler[]{new t7e$2$1(this)});
   }
}
