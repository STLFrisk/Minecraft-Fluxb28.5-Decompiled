/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.DecoderException
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ey_
extends ByteToMessageDecoder {
    private final /* synthetic */ Inflater ziy;
    private /* synthetic */ int vs6;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public ey_(int n) {
        this.vs6 = n;
        this.ziy = new Inflater();
    }

    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) {
        block19: {
            long l = a ^ 0x82443E2724DL;
            int n = t9d.b();
            if (byteBuf.readableBytes() != 0) {
                int n2;
                int n3;
                nfj nfj2;
                block22: {
                    int n4;
                    block20: {
                        block21: {
                            block17: {
                                nfj2 = new nfj(byteBuf);
                                n3 = nfj2.gux();
                                try {
                                    block18: {
                                        try {
                                            try {
                                                n2 = n3;
                                                if (n == 0) break block17;
                                                if (n2 != 0) break block18;
                                            }
                                            catch (DecoderException decoderException) {
                                                throw ey_.a(decoderException);
                                            }
                                            list.add(nfj2.readBytes(nfj2.readableBytes()));
                                            if (n != 0) break block19;
                                        }
                                        catch (DecoderException decoderException) {
                                            throw ey_.a(decoderException);
                                        }
                                    }
                                    n2 = n3;
                                }
                                catch (DecoderException decoderException) {
                                    throw ey_.a(decoderException);
                                }
                            }
                            try {
                                try {
                                    n4 = this.vs6;
                                    if (n == 0) break block20;
                                    if (n2 < n4) {
                                    }
                                    break block21;
                                }
                                catch (DecoderException decoderException) {
                                    throw ey_.a(decoderException);
                                }
                                throw new DecoderException((String)((Object)ey_.a("y", (int)10984, (long)(0x56CB0536C0BA54EL ^ l))) + n3 + (String)((Object)ey_.a("y", (int)5350, (long)(0x7D0748A3FD201B41L ^ l))) + this.vs6);
                            }
                            catch (DecoderException decoderException) {
                                throw ey_.a(decoderException);
                            }
                        }
                        try {
                            n2 = n3;
                            if (n == 0) break block22;
                            n4 = 0x200000;
                        }
                        catch (DecoderException decoderException) {
                            throw ey_.a(decoderException);
                        }
                    }
                    try {
                        if (n2 > n4) {
                            throw new DecoderException((String)((Object)ey_.a("y", (int)17817, (long)(0x66912B2B995CCA3DL ^ l))) + n3 + (String)((Object)ey_.a("y", (int)2544, (long)(0x77A18C6446000655L ^ l))) + 0x200000);
                        }
                    }
                    catch (DecoderException decoderException) {
                        throw ey_.a(decoderException);
                    }
                    n2 = nfj2.readableBytes();
                }
                byte[] byArray = new byte[n2];
                nfj2.readBytes(byArray);
                this.ziy.setInput(byArray);
                byte[] byArray2 = new byte[n3];
                this.ziy.inflate(byArray2);
                list.add(Unpooled.wrappedBuffer((byte[])byArray2));
                this.ziy.reset();
            }
        }
    }

    public void mdk(int n) {
        this.vs6 = n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                ** synchronized (c.g())
lbl2:
                // 1 sources

                ey_.a = c.a(-5628202465511113407L, -6874726239674745264L, MethodHandles.lookup().lookupClass()).a(218970166697291L);
                ey_.d = new HashMap<K, V>(13);
                var0 = ey_.a ^ 121184945262053L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u00a1f\u00bb\u001c\u0085R\u00a9\u0097\u00a5>\u008d\u008f\u00c8\u00b2\u00a2m\u00e3\u00bf\u00b9\u0092\u0000\u0094\u00d6\u00d3\u0098w\u00b9y\u0091\u00a9q\u0096\u0093Y\u00d3\u0014UP\u00b6o\u001d\u00de\u00ca\u0010\u00e9\u00a1K\u009b\u0003`\u00fe\u0099\u0017in\u00e9\u008a-8\u00c7{U\u00c8\u0003@e\u0018Hy;\u0013Jl\n\u00cb^w\u00abJ\u00b3\u00ce\u0001\u00a8\u0085p\u00af(\u0090t\u00c0\u00af\u00d7F\u0093\u0085\u00cbS\u001d\u0015\u0017\u00d5\u00f7\u009c\u00bb\u0007J\u00e9\u00b8lg?\r#\u00f0\u001e=HM\u00fb\u00c0\t\u00d1q\u0082\u00cf'\u00e8\u008bg";
                var8_6 = "\u00a1f\u00bb\u001c\u0085R\u00a9\u0097\u00a5>\u008d\u008f\u00c8\u00b2\u00a2m\u00e3\u00bf\u00b9\u0092\u0000\u0094\u00d6\u00d3\u0098w\u00b9y\u0091\u00a9q\u0096\u0093Y\u00d3\u0014UP\u00b6o\u001d\u00de\u00ca\u0010\u00e9\u00a1K\u009b\u0003`\u00fe\u0099\u0017in\u00e9\u008a-8\u00c7{U\u00c8\u0003@e\u0018Hy;\u0013Jl\n\u00cb^w\u00abJ\u00b3\u00ce\u0001\u00a8\u0085p\u00af(\u0090t\u00c0\u00af\u00d7F\u0093\u0085\u00cbS\u001d\u0015\u0017\u00d5\u00f7\u009c\u00bb\u0007J\u00e9\u00b8lg?\r#\u00f0\u001e=HM\u00fb\u00c0\t\u00d1q\u0082\u00cf'\u00e8\u008bg".length();
                var5_7 = 64;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = ey_.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008b\u00c4\u00d8\u001dc\u00b2\u00d2\u00a2\u0087\u00b2i\u00df\u00c6\u0010C\u00cf\u00a41\u00df\u00dd\u0097\u0096\u0082\u00d3&\u0092y\u00a6\u00bd\u00bf\u00f8\u00f5D\u00f4\u0083\u00e8\u00f9\u0082\u0086\u00a4I\u00ac\u00bc\u00c6!\u0094B;\u00105\u00b4:\u00d2\u0001\u00d9\u0082H\u0018\u00f1c\u00bc\u000e\u00ed\u00cc0~1\u00e3H[\u00cb\u00ca\u008b\u0006S\u00a6~\u001bO5\u00ce\u0093\u009d?H\u00d5\u00e41\u00a9\u001d\u00ae\u00eb\u00fc\u00b7h\u0012!\u00a7%\u00e9=\u00118\u0007\fE^\u00d1\u00f2\u00e9\u0091\u00fc\u00e0";
                    var8_6 = "\u008b\u00c4\u00d8\u001dc\u00b2\u00d2\u00a2\u0087\u00b2i\u00df\u00c6\u0010C\u00cf\u00a41\u00df\u00dd\u0097\u0096\u0082\u00d3&\u0092y\u00a6\u00bd\u00bf\u00f8\u00f5D\u00f4\u0083\u00e8\u00f9\u0082\u0086\u00a4I\u00ac\u00bc\u00c6!\u0094B;\u00105\u00b4:\u00d2\u0001\u00d9\u0082H\u0018\u00f1c\u00bc\u000e\u00ed\u00cc0~1\u00e3H[\u00cb\u00ca\u008b\u0006S\u00a6~\u001bO5\u00ce\u0093\u009d?H\u00d5\u00e41\u00a9\u001d\u00ae\u00eb\u00fc\u00b7h\u0012!\u00a7%\u00e9=\u00118\u0007\fE^\u00d1\u00f2\u00e9\u0091\u00fc\u00e0".length();
                    var5_7 = 64;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = ey_.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        ey_.b = var9_3;
        ey_.c = new String[4];
    }

    private static DecoderException a(DecoderException decoderException) {
        return decoderException;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x133A;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("ey_", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            ey_.c[n2] = ey_.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ey_.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("ey_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ey_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

