import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import us.myles.ViaVersion.api.data.UserConnection;

public class ilu extends MessageToMessageDecoder {
   private final UserConnection djc;

   public ilu(UserConnection var1) {
      this.djc = var1;
   }

   public void v7x(ChannelHandlerContext param1, ByteBuf param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: getfield ilu.djc Lus/myles/ViaVersion/api/data/UserConnection;
      // 09: invokevirtual us/myles/ViaVersion/api/data/UserConnection.checkOutgoingPacket ()Z
      // 0c: pop
      // 0d: aload 0
      // 0e: getfield ilu.djc Lus/myles/ViaVersion/api/data/UserConnection;
      // 11: invokevirtual us/myles/ViaVersion/api/data/UserConnection.shouldTransformPacket ()Z
      // 14: iload 4
      // 16: ifne 34
      // 19: ifne 36
      // 1c: goto 23
      // 1f: invokestatic ilu.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: aload 3
      // 24: aload 2
      // 25: invokevirtual io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
      // 28: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 2d: goto 34
      // 30: invokestatic ilu.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33: athrow
      // 34: pop
      // 35: return
      // 36: aload 1
      // 37: invokeinterface io/netty/channel/ChannelHandlerContext.alloc ()Lio/netty/buffer/ByteBufAllocator; 1
      // 3c: invokeinterface io/netty/buffer/ByteBufAllocator.buffer ()Lio/netty/buffer/ByteBuf; 1
      // 41: aload 2
      // 42: invokevirtual io/netty/buffer/ByteBuf.writeBytes (Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;
      // 45: astore 5
      // 47: aload 0
      // 48: getfield ilu.djc Lus/myles/ViaVersion/api/data/UserConnection;
      // 4b: aload 5
      // 4d: invokedynamic apply ()Ljava/util/function/Function; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Ljava/lang/Object;, us/myles/ViaVersion/exception/CancelDecoderException.generate (Ljava/lang/Throwable;)Lus/myles/ViaVersion/exception/CancelDecoderException;, (Ljava/lang/Throwable;)Ljava/lang/Exception; ]
      // 52: invokevirtual us/myles/ViaVersion/api/data/UserConnection.transformOutgoing (Lio/netty/buffer/ByteBuf;Ljava/util/function/Function;)V
      // 55: aload 3
      // 56: aload 5
      // 58: invokevirtual io/netty/buffer/ByteBuf.retain ()Lio/netty/buffer/ByteBuf;
      // 5b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 60: pop
      // 61: aload 5
      // 63: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 66: pop
      // 67: goto 75
      // 6a: astore 6
      // 6c: aload 5
      // 6e: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 71: pop
      // 72: aload 6
      // 74: athrow
      // 75: goto 7a
      // 78: astore 5
      // 7a: return
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
   }

   public UserConnection i2e() {
      return this.djc;
   }

   public void decode(ChannelHandlerContext var1, Object var2, List var3) {
      this.v7x(var1, (ByteBuf)var2, var3);
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
