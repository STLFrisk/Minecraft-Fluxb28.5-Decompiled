/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import javax.crypto.Cipher;

public class _6e
extends MessageToByteEncoder {
    private final /* synthetic */ su6 dlq;

    public _6e(Cipher cipher) {
        this.dlq = new su6(cipher);
    }

    public void v85(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        this.dlq.uo5(byteBuf, byteBuf2);
    }

    public void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.v85(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}

