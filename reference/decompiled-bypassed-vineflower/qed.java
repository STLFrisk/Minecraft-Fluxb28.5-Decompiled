import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;
import us.myles.ViaVersion.api.data.UserConnection;

public class qed extends MessageToMessageEncoder {
   private final UserConnection axm;

   public qed(UserConnection var1) {
      this.axm = var1;
   }

   public void un8(ChannelHandlerContext param1, ByteBuf param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield qed.axm Lus/myles/ViaVersion/api/data/UserConnection;
      // 09: invokevirtual us/myles/ViaVersion/api/data/UserConnection.checkIncomingPacket ()Z
      // 0c: iload 4
      // 0e: ifeq 2b
      // 11: ifne 24
      // 14: goto 1b
      // 17: invokestatic qed.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a: athrow
      // 1b: aconst_null
      // 1c: invokestatic us/myles/ViaVersion/exception/CancelEncoderException.generate (Ljava/lang/Throwable;)Lus/myles/ViaVersion/exception/CancelEncoderException;
      // 1f: athrow
      // 20: invokestatic qed.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 0
      // 25: getfield qed.axm Lus/myles/ViaVersion/api/data/UserConnection;
      // 28: invokevirtual us/myles/ViaVersion/api/data/UserConnection.shouldTransformPacket ()Z
      // 2b: iload 4
      // 2d: ifeq 4b
      // 30: ifne 4d
      // 33: goto 3a
      // 36: invokestatic qed.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 3
      // 3b: aload 2
      // 3c: invokevirtual io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
      // 3f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 44: goto 4b
      // 47: invokestatic qed.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: pop
      // 4c: return
      // 4d: aload 1
      // 4e: invokeinterface io/netty/channel/ChannelHandlerContext.alloc ()Lio/netty/buffer/ByteBufAllocator; 1
      // 53: invokeinterface io/netty/buffer/ByteBufAllocator.buffer ()Lio/netty/buffer/ByteBuf; 1
      // 58: aload 2
      // 59: invokevirtual io/netty/buffer/ByteBuf.writeBytes (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
      // 5c: astore 5
      // 5e: aload 0
      // 5f: getfield qed.axm Lus/myles/ViaVersion/api/data/UserConnection;
      // 62: aload 5
      // 64: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, us/myles/ViaVersion/exception/CancelEncoderException.generate (Ljava/lang/Throwable;)Lus/myles/ViaVersion/exception/CancelEncoderException;, (Ljava/lang/Throwable;)Ljava/lang/Exception; ]
      // 69: invokevirtual us/myles/ViaVersion/api/data/UserConnection.transformIncoming (Lio/netty/buffer/ByteBuf;Ljava/util/function/Function;)V
      // 6c: aload 3
      // 6d: aload 5
      // 6f: invokevirtual io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
      // 72: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 77: pop
      // 78: aload 5
      // 7a: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 7d: pop
      // 7e: goto 8c
      // 81: astore 6
      // 83: aload 5
      // 85: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 88: pop
      // 89: aload 6
      // 8b: athrow
      // 8c: goto 91
      // 8f: astore 5
      // 91: return
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
   }

   public void encode(ChannelHandlerContext var1, Object var2, List var3) {
      this.un8(var1, (ByteBuf)var2, var3);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
