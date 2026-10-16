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
import java.util.zip.Deflater;

public class fwm
extends MessageToByteEncoder {
    private final /* synthetic */ byte[] ox8;
    private final /* synthetic */ Deflater mm0;
    private /* synthetic */ int ezw;

    public fwm(int n) {
        this.ox8 = new byte[8192];
        this.ezw = n;
        this.mm0 = new Deflater();
    }

    public void xmj(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        block12: {
            int n;
            int n2;
            nfj nfj2;
            int n3;
            block10: {
                n3 = byteBuf.readableBytes();
                nfj2 = new nfj(byteBuf2);
                n2 = t9d.b();
                try {
                    block11: {
                        try {
                            try {
                                n = n3;
                                if (n2 == 0) break block10;
                                if (n >= this.ezw) break block11;
                            }
                            catch (oov oov2) {
                                throw fwm.a(oov2);
                            }
                            nfj2.tao(0);
                            nfj2.writeBytes(byteBuf);
                            if (n2 != 0) break block12;
                        }
                        catch (oov oov3) {
                            throw fwm.a(oov3);
                        }
                    }
                    n = n3;
                }
                catch (oov oov4) {
                    throw fwm.a(oov4);
                }
            }
            byte[] byArray = new byte[n];
            byteBuf.readBytes(byArray);
            nfj2.tao(byArray.length);
            this.mm0.setInput(byArray, 0, n3);
            this.mm0.finish();
            while (!this.mm0.finished()) {
                int n4 = this.mm0.deflate(this.ox8);
                try {
                    nfj2.writeBytes(this.ox8, 0, n4);
                    if (n2 != 0) {
                        if (n2 != 0) continue;
                        break;
                    }
                    break block12;
                }
                catch (oov oov5) {
                    throw fwm.a(oov5);
                }
            }
            this.mm0.reset();
        }
    }

    public void wm6(int n) {
        this.ezw = n;
    }

    public void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.xmj(channelHandlerContext, (ByteBuf)object, byteBuf);
    }

    private static oov a(oov oov2) {
        return oov2;
    }
}

