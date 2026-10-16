import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class pxe extends MessageToMessageDecoder {
   public pxe(Cipher var1) {
      this.ste = new su6(var1);
   }

   public void ss_(ChannelHandlerContext var1, ByteBuf var2, List var3) {
      var3.add(this.ste.n__(var1, var2));
   }

   public void decode(ChannelHandlerContext var1, Object var2, List var3) {
      this.ss_(var1, (ByteBuf)var2, var3);
   }
}
