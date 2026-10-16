import io.netty.util.concurrent.GenericFutureListener;

public class hv0$4 implements Runnable {
   public final a0t vtx;
   public final a0t _bc;
   public final mz2 wjx;
   public final GenericFutureListener[] qo5;
   public final hv0 e9v;

   public hv0$4(hv0 var1, a0t var2, a0t var3, mz2 var4, GenericFutureListener[] var5) {
      this.e9v = var1;
      this.vtx = var2;
      this._bc = var3;
      this.wjx = var4;
      this.qo5 = var5;
   }

   @Override
   public void run() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 2d
      // 09: getfield hv0$4.vtx La0t;
      // 0c: aload 0
      // 0d: getfield hv0$4._bc La0t;
      // 10: if_acmpeq 2c
      // 13: goto 1a
      // 16: invokestatic hv0$4.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield hv0$4.e9v Lhv0;
      // 1e: aload 0
      // 1f: getfield hv0$4.vtx La0t;
      // 22: invokevirtual hv0.hlc (La0t;)V
      // 25: goto 2c
      // 28: invokestatic hv0$4.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield hv0$4.e9v Lhv0;
      // 30: invokestatic hv0.j5s (Lhv0;)Lio/netty/channel/Channel;
      // 33: aload 0
      // 34: getfield hv0$4.wjx Lmz2;
      // 37: invokeinterface io/netty/channel/Channel.writeAndFlush (Ljava/lang/Object;)Lio/netty/channel/ChannelFuture; 2
      // 3c: astore 2
      // 3d: iload 1
      // 3e: ifne 6b
      // 41: aload 0
      // 42: getfield hv0$4.qo5 [Lio/netty/util/concurrent/GenericFutureListener;
      // 45: ifnull 61
      // 48: goto 4f
      // 4b: invokestatic hv0$4.a (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 2
      // 50: aload 0
      // 51: getfield hv0$4.qo5 [Lio/netty/util/concurrent/GenericFutureListener;
      // 54: invokeinterface io/netty/channel/ChannelFuture.addListeners ([Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelFuture; 2
      // 59: pop
      // 5a: goto 61
      // 5d: invokestatic hv0$4.a (Loov;)Loov;
      // 60: athrow
      // 61: aload 2
      // 62: getstatic io/netty/channel/ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE Lio/netty/channel/ChannelFutureListener;
      // 65: invokeinterface io/netty/channel/ChannelFuture.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelFuture; 2
      // 6a: pop
      // 6b: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
