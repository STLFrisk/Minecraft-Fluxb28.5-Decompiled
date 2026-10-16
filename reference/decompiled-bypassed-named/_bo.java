import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _bo extends ByteToMessageDecoder {
   private static final long a;
   private static final String b;

   public void decode(ChannelHandlerContext param1, ByteBuf param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic _bo.a J
      // 03: ldc2_w 65230080601634
      // 06: lxor
      // 07: lstore 4
      // 09: aload 2
      // 0a: invokevirtual io/netty/buffer/ByteBuf.markReaderIndex ()Lio/netty/buffer/ByteBuf;
      // 0d: pop
      // 0e: invokestatic OpaquePredicate.c ()I
      // 11: bipush 3
      // 12: newarray 8
      // 14: astore 7
      // 16: istore 6
      // 18: bipush 0
      // 19: istore 8
      // 1b: iload 8
      // 1d: aload 7
      // 1f: arraylength
      // 20: if_icmpge bd
      // 23: aload 2
      // 24: invokevirtual io/netty/buffer/ByteBuf.isReadable ()Z
      // 27: iload 6
      // 29: ifne 5a
      // 2c: ifne 40
      // 2f: goto 36
      // 32: invokestatic _bo.a (Lio/netty/handler/codec/CorruptedFrameException;)Lio/netty/handler/codec/CorruptedFrameException;
      // 35: athrow
      // 36: aload 2
      // 37: invokevirtual io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
      // 3a: pop
      // 3b: return
      // 3c: invokestatic _bo.a (Lio/netty/handler/codec/CorruptedFrameException;)Lio/netty/handler/codec/CorruptedFrameException;
      // 3f: athrow
      // 40: aload 7
      // 42: iload 8
      // 44: aload 2
      // 45: invokevirtual io/netty/buffer/ByteBuf.readByte ()B
      // 48: bastore
      // 49: iload 6
      // 4b: ifne b8
      // 4e: aload 7
      // 50: iload 8
      // 52: baload
      // 53: goto 5a
      // 56: invokestatic _bo.a (Lio/netty/handler/codec/CorruptedFrameException;)Lio/netty/handler/codec/CorruptedFrameException;
      // 59: athrow
      // 5a: iflt b5
      // 5d: new nfj
      // 60: dup
      // 61: aload 7
      // 63: invokestatic io/netty/buffer/Unpooled.wrappedBuffer ([B)Lio/netty/buffer/ByteBuf;
      // 66: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 69: astore 9
      // 6b: aload 9
      // 6d: invokevirtual nfj.gux ()I
      // 70: istore 10
      // 72: aload 2
      // 73: invokevirtual io/netty/buffer/ByteBuf.readableBytes ()I
      // 76: iload 6
      // 78: ifne a5
      // 7b: iload 10
      // 7d: if_icmplt 9b
      // 80: goto 87
      // 83: invokestatic _bo.a (Lio/netty/handler/codec/CorruptedFrameException;)Lio/netty/handler/codec/CorruptedFrameException;
      // 86: athrow
      // 87: aload 3
      // 88: aload 2
      // 89: iload 10
      // 8b: invokevirtual io/netty/buffer/ByteBuf.readBytes (I)Lio/netty/buffer/ByteBuf;
      // 8e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 93: pop
      // 94: aload 9
      // 96: invokevirtual nfj.release ()Z
      // 99: pop
      // 9a: return
      // 9b: aload 2
      // 9c: invokevirtual io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
      // 9f: pop
      // a0: aload 9
      // a2: invokevirtual nfj.release ()Z
      // a5: pop
      // a6: goto b4
      // a9: astore 11
      // ab: aload 9
      // ad: invokevirtual nfj.release ()Z
      // b0: pop
      // b1: aload 11
      // b3: athrow
      // b4: return
      // b5: iinc 8 1
      // b8: iload 6
      // ba: ifeq 1b
      // bd: new io/netty/handler/codec/CorruptedFrameException
      // c0: dup
      // c1: getstatic _bo.b Ljava/lang/String;
      // c4: nop
      // c5: invokespecial io/netty/handler/codec/CorruptedFrameException.<init> (Ljava/lang/String;)V
      // c8: athrow
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3117689381966938162L, 7791526694043074247L, MethodHandles.lookup().lookupClass()).a(74254634633590L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 104427142896785L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("6,\u0084{¾,ÙjÝÇ\u0017Ñ\u009c\u0082T-Æò\u009e\u008cLìÊ\u0087\u009b\u0081KÐKíãÖ".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
   }

   private static CorruptedFrameException a(CorruptedFrameException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
