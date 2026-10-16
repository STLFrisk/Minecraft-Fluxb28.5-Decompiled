/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.CorruptedFrameException
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _bo
extends ByteToMessageDecoder {
    private static final long a = c.a(3117689381966938162L, 7791526694043074247L, MethodHandles.lookup().lookupClass()).a(74254634633590L);
    private static final String b;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) {
        long l = a ^ 0x3B538FC86E22L;
        byteBuf.markReaderIndex();
        byte[] byArray = new byte[3];
        int n = t9d.c();
        int n2 = 0;
        while (n2 < byArray.length) {
            block14: {
                block18: {
                    block15: {
                        int n3;
                        nfj nfj2;
                        block16: {
                            int n4;
                            block12: {
                                block13: {
                                    n4 = byteBuf.isReadable();
                                    if (n != 0) break block12;
                                    try {
                                        block17: {
                                            if (n4 != 0) break block13;
                                            break block17;
                                            catch (CorruptedFrameException corruptedFrameException) {
                                                throw _bo.a(corruptedFrameException);
                                            }
                                        }
                                        byteBuf.resetReaderIndex();
                                        return;
                                    }
                                    catch (CorruptedFrameException corruptedFrameException) {
                                        throw _bo.a(corruptedFrameException);
                                    }
                                }
                                try {
                                    byArray[n2] = byteBuf.readByte();
                                    if (n != 0) break block14;
                                    n4 = byArray[n2];
                                }
                                catch (CorruptedFrameException corruptedFrameException) {
                                    throw _bo.a(corruptedFrameException);
                                }
                            }
                            if (n4 < 0) break block18;
                            nfj2 = new nfj(Unpooled.wrappedBuffer((byte[])byArray));
                            try {
                                int n5 = nfj2.gux();
                                try {
                                    n3 = byteBuf.readableBytes();
                                    if (n != 0) break block15;
                                    if (n3 < n5) break block16;
                                }
                                catch (CorruptedFrameException corruptedFrameException) {
                                    throw _bo.a(corruptedFrameException);
                                }
                                list.add(byteBuf.readBytes(n5));
                                nfj2.release();
                            }
                            catch (Throwable throwable) {
                                nfj2.release();
                                throw throwable;
                            }
                            return;
                        }
                        byteBuf.resetReaderIndex();
                        n3 = nfj2.release() ? 1 : 0;
                    }
                    return;
                }
                ++n2;
            }
            if (n == 0) continue;
        }
        throw new CorruptedFrameException(b);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    static {
        // MONITORENTER : c.g()
        // MONITOREXIT : c.g()
        long l = a ^ 0x5EF9D6C1DC91L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("6,\u0084{\u00be,\u00d9j\u00dd\u00c7\u0017\u00d1\u009c\u0082T-\u00c6\u00f2\u009e\u008cL\u00ec\u00ca\u0087\u009b\u0081K\u00d0K\u00ed\u00e3\u00d6".getBytes("ISO-8859-1"));
                b = _bo.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CorruptedFrameException a(CorruptedFrameException corruptedFrameException) {
        return corruptedFrameException;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c2;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (i >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }
}

