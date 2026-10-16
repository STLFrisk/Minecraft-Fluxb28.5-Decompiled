import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class _6e extends MessageToByteEncoder {
   public _6e(Cipher var1) {
      this.dlq = new su6(var1);
   }

   public void v85(ChannelHandlerContext var1, ByteBuf var2, ByteBuf var3) {
      this.dlq.uo5(var2, var3);
   }

   public void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.v85(var1, (ByteBuf)var2, var3);
   }
}
