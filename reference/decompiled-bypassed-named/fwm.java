import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;

public class fwm extends MessageToByteEncoder {
   public fwm(int var1) {
      this.ezw = var1;
      this.mm0 = new Deflater();
   }

   public void xmj(ChannelHandlerContext param1, ByteBuf param2, ByteBuf param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokevirtual io/netty/buffer/ByteBuf.readableBytes ()I
      // 04: istore 5
      // 06: invokestatic OpaquePredicate.b ()I
      // 09: new nfj
      // 0c: dup
      // 0d: aload 3
      // 0e: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 11: astore 6
      // 13: istore 4
      // 15: iload 5
      // 17: iload 4
      // 19: ifeq 4d
      // 1c: aload 0
      // 1d: getfield fwm.ezw I
      // 20: if_icmpge 44
      // 23: goto 2a
      // 26: invokestatic fwm.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 6
      // 2c: bipush 0
      // 2d: invokevirtual nfj.tao (I)Lnfj;
      // 30: pop
      // 31: aload 6
      // 33: aload 2
      // 34: invokevirtual nfj.writeBytes (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
      // 37: pop
      // 38: iload 4
      // 3a: ifne b3
      // 3d: goto 44
      // 40: invokestatic fwm.a (Loov;)Loov;
      // 43: athrow
      // 44: iload 5
      // 46: goto 4d
      // 49: invokestatic fwm.a (Loov;)Loov;
      // 4c: athrow
      // 4d: newarray 8
      // 4f: astore 7
      // 51: aload 2
      // 52: aload 7
      // 54: invokevirtual io/netty/buffer/ByteBuf.readBytes ([B)Lio/netty/buffer/ByteBuf;
      // 57: pop
      // 58: aload 6
      // 5a: aload 7
      // 5c: arraylength
      // 5d: invokevirtual nfj.tao (I)Lnfj;
      // 60: pop
      // 61: aload 0
      // 62: getfield fwm.mm0 Ljava/util/zip/Deflater;
      // 65: aload 7
      // 67: bipush 0
      // 68: iload 5
      // 6a: invokevirtual java/util/zip/Deflater.setInput ([BII)V
      // 6d: aload 0
      // 6e: getfield fwm.mm0 Ljava/util/zip/Deflater;
      // 71: invokevirtual java/util/zip/Deflater.finish ()V
      // 74: aload 0
      // 75: getfield fwm.mm0 Ljava/util/zip/Deflater;
      // 78: invokevirtual java/util/zip/Deflater.finished ()Z
      // 7b: ifne ac
      // 7e: aload 0
      // 7f: getfield fwm.mm0 Ljava/util/zip/Deflater;
      // 82: aload 0
      // 83: getfield fwm.ox8 [B
      // 86: invokevirtual java/util/zip/Deflater.deflate ([B)I
      // 89: istore 8
      // 8b: aload 6
      // 8d: aload 0
      // 8e: getfield fwm.ox8 [B
      // 91: checkcast [B
      // 94: bipush 0
      // 95: iload 8
      // 97: invokevirtual nfj.writeBytes ([BII)Lio/netty/buffer/ByteBuf;
      // 9a: pop
      // 9b: iload 4
      // 9d: ifeq b3
      // a0: iload 4
      // a2: ifne 74
      // a5: goto ac
      // a8: invokestatic fwm.a (Loov;)Loov;
      // ab: athrow
      // ac: aload 0
      // ad: getfield fwm.mm0 Ljava/util/zip/Deflater;
      // b0: invokevirtual java/util/zip/Deflater.reset ()V
      // b3: return
   }

   public void wm6(int var1) {
      this.ezw = var1;
   }

   public void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.xmj(var1, (ByteBuf)var2, var3);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
