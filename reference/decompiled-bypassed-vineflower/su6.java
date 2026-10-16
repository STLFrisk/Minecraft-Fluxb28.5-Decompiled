import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;

public class su6 {
   public su6(Cipher var1) {
      this.rkg = var1;
   }

   private byte[] tc8(ByteBuf param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual io/netty/buffer/ByteBuf.readableBytes ()I
      // 08: istore 3
      // 09: aload 0
      // 0a: getfield su6.wqu [B
      // 0d: iload 2
      // 0e: ifeq 3d
      // 11: arraylength
      // 12: iload 3
      // 13: if_icmpge 2b
      // 16: goto 1d
      // 19: invokestatic su6.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: iload 3
      // 1f: newarray 8
      // 21: putfield su6.wqu [B
      // 24: goto 2b
      // 27: invokestatic su6.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 1
      // 2c: aload 0
      // 2d: getfield su6.wqu [B
      // 30: checkcast [B
      // 33: bipush 0
      // 34: iload 3
      // 35: invokevirtual io/netty/buffer/ByteBuf.readBytes ([BII)Lio/netty/buffer/ByteBuf;
      // 38: pop
      // 39: aload 0
      // 3a: getfield su6.wqu [B
      // 3d: areturn
   }

   public ByteBuf n__(ChannelHandlerContext var1, ByteBuf var2) {
      int var3 = var2.readableBytes();
      byte[] var4 = this.tc8(var2);
      ByteBuf var5 = var1.alloc().heapBuffer(this.rkg.getOutputSize(var3));
      var5.writerIndex(this.rkg.update(var4, 0, var3, var5.array(), var5.arrayOffset()));
      return var5;
   }

   public void uo5(ByteBuf param1, ByteBuf param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual io/netty/buffer/ByteBuf.readableBytes ()I
      // 04: istore 4
      // 06: invokestatic t9d.b ()I
      // 09: aload 0
      // 0a: aload 1
      // 0b: invokespecial su6.tc8 (Lio/netty/buffer/ByteBuf;)[B
      // 0e: astore 5
      // 10: istore 3
      // 11: aload 0
      // 12: getfield su6.rkg Ljavax/crypto/Cipher;
      // 15: iload 4
      // 17: invokevirtual javax/crypto/Cipher.getOutputSize (I)I
      // 1a: istore 6
      // 1c: iload 3
      // 1d: ifeq 5d
      // 20: aload 0
      // 21: getfield su6.q7f [B
      // 24: arraylength
      // 25: iload 6
      // 27: if_icmpge 40
      // 2a: goto 31
      // 2d: invokestatic su6.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: iload 6
      // 34: newarray 8
      // 36: putfield su6.q7f [B
      // 39: goto 40
      // 3c: invokestatic su6.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 2
      // 41: aload 0
      // 42: getfield su6.q7f [B
      // 45: checkcast [B
      // 48: bipush 0
      // 49: aload 0
      // 4a: getfield su6.rkg Ljavax/crypto/Cipher;
      // 4d: aload 5
      // 4f: bipush 0
      // 50: iload 4
      // 52: aload 0
      // 53: getfield su6.q7f [B
      // 56: invokevirtual javax/crypto/Cipher.update ([BII[B)I
      // 59: invokevirtual io/netty/buffer/ByteBuf.writeBytes ([BII)Lio/netty/buffer/ByteBuf;
      // 5c: pop
      // 5d: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
