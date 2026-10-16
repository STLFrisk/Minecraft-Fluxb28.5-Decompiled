import com.google.common.collect.Queues;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.GenericFutureListener;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class hv0 extends SimpleChannelInboundHandler {
   private static final Logger pk7;
   public static final Marker q5k;
   public static final Marker set;
   public static final AttributeKey zix;
   public static final zrl tnd;
   public static final zrl ggr;
   public static final zrl nji;
   private final qat la5;
   private final Queue zor = Queues.newConcurrentLinkedQueue();
   private final ReentrantReadWriteLock mtu = new ReentrantReadWriteLock();
   private Channel uqg;
   private SocketAddress oj8;
   private yw3 s09;
   private ekw a5o;
   private boolean dtp;
   private boolean sva;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public hv0(qat var1) {
      this.la5 = var1;
   }

   public void channelActive(ChannelHandlerContext var1) {
      super.channelActive(var1);
      this.uqg = var1.channel();
      this.oj8 = this.uqg.remoteAddress();

      try {
         this.hlc(a0t.z8v);
      } catch (Throwable var3) {
         pk7.fatal(var3);
      }
   }

   public void hlc(a0t var1) {
      long var2 = a ^ 5157575731302L;
      this.uqg.attr(zix).set(var1);
      this.uqg.config().setAutoRead(true);
      pk7.debug(a<"u">(5933, 6059287889956119121L ^ var2));
   }

   public void channelInactive(ChannelHandlerContext var1) {
      long var2 = a ^ 127412584219922L;
      this.g8c(new hsu(a<"u">(16449, 7504720775606949963L ^ var2), new Object[0]));
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      hsu var6;
      label11: {
         long var3 = a ^ 112034572467142L;
         int var5 = t9d.b();
         if (var2 instanceof TimeoutException) {
            var6 = new hsu(a<"u">(6728, 2225119443416743066L ^ var3), new Object[0]);
            if (var5 != 0) {
               break label11;
            }
         }

         var6 = new hsu(a<"u">(31395, 8236343851686632566L ^ var3), new Object[]{a<"u">(1017, 2828244240159532330L ^ var3) + var2});
      }

      this.g8c(var6);
   }

   public void i63(ChannelHandlerContext param1, mz2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield hv0.uqg Lio/netty/channel/Channel;
      // 08: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 0d: ifeq 4b
      // 10: new wbh
      // 13: dup
      // 14: aload 2
      // 15: invokespecial wbh.<init> (Lmz2;)V
      // 18: astore 4
      // 1a: aload 4
      // 1c: invokestatic mtl.esg (Lvlc;)Lvlc;
      // 1f: pop
      // 20: aload 4
      // 22: iload 3
      // 23: ifne 3a
      // 26: invokevirtual wbh.elp ()Z
      // 29: ifeq 38
      // 2c: goto 33
      // 2f: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: return
      // 34: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37: athrow
      // 38: aload 4
      // 3a: invokevirtual wbh.nlg ()Lmz2;
      // 3d: aload 0
      // 3e: getfield hv0.s09 Lyw3;
      // 41: invokeinterface mz2.ito (Lyw3;)V 2
      // 46: goto 4b
      // 49: astore 5
      // 4b: return
   }

   public void kbj(yw3 var1) {
      long var2 = a ^ 53643902069958L;
      Validate.notNull(var1, a<"u">(11261, 88750817631312418L ^ var2), new Object[0]);
      pk7.debug(a<"u">(7515, 7123151289047428235L ^ var2), new Object[]{this, var1});
      this.s09 = var1;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   // $VF: Could not inline inconsistent finally blocks
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void k7f(mz2 var1) {
      int var2 = t9d.c();

      label110: {
         Throwable var17;
         label109: {
            label115: {
               label116: {
                  try {
                     boolean var10000 = this.jy3();
                     if (var2 != 0) {
                        break label115;
                     }

                     if (!var10000) {
                        break label116;
                     }
                  } catch (TimeoutException var16) {
                     throw a(var16);
                  }

                  this.o0e();
                  ihr var3 = new ihr(var1);

                  try {
                     mtl.esg(var3);
                     if (!var3.elp()) {
                        this._bo(var1, (GenericFutureListener[])null);
                     }
                  } catch (TimeoutException var13) {
                     throw a(var13);
                  }

                  if (var2 == 0) {
                     return;
                  }
               }

               this.mtu.writeLock().lock();

               try {
                  this.zor.add(new hv0$t04(var1, (GenericFutureListener[])null));
               } catch (Throwable var15) {
                  var17 = var15;
                  boolean var10001 = false;
                  break label109;
               }
            }

            label97:
            try {
               break label110;
            } catch (Throwable var14) {
               var17 = var14;
               boolean var18 = false;
               break label97;
            }
         }

         Throwable var4 = var17;
         this.mtu.writeLock().unlock();
         throw var4;
      }

      this.mtu.writeLock().unlock();
   }

   public void r92(mz2 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 51
      // 09: getfield hv0.uqg Lio/netty/channel/Channel;
      // 0c: ifnull 49
      // 0f: goto 16
      // 12: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield hv0.uqg Lio/netty/channel/Channel;
      // 1a: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 1f: iload 2
      // 20: ifeq 65
      // 23: goto 2a
      // 26: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29: athrow
      // 2a: ifeq 49
      // 2d: goto 34
      // 30: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 33: athrow
      // 34: aload 0
      // 35: invokespecial hv0.o0e ()V
      // 38: aload 0
      // 39: aload 1
      // 3a: aconst_null
      // 3b: invokespecial hv0._bo (Lmz2;[Lio/netty/util/concurrent/GenericFutureListener;)V
      // 3e: iload 2
      // 3f: ifne 66
      // 42: goto 49
      // 45: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: aload 0
      // 4a: goto 51
      // 4d: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 50: athrow
      // 51: getfield hv0.zor Ljava/util/Queue;
      // 54: new hv0$t04
      // 57: dup
      // 58: aload 1
      // 59: aconst_null
      // 5a: checkcast [Lio/netty/util/concurrent/GenericFutureListener;
      // 5d: invokespecial hv0$t04.<init> (Lmz2;[Lio/netty/util/concurrent/GenericFutureListener;)V
      // 60: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
      // 65: pop
      // 66: return
   }

   public void pl0(mz2 param1, GenericFutureListener param2, GenericFutureListener[] param3) {
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
      // 06: invokevirtual hv0.jy3 ()Z
      // 09: iload 4
      // 0b: ifeq 60
      // 0e: ifeq 39
      // 11: goto 18
      // 14: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: invokespecial hv0.o0e ()V
      // 1c: aload 0
      // 1d: aload 1
      // 1e: aload 3
      // 1f: bipush 0
      // 20: aload 2
      // 21: invokestatic org/apache/commons/lang3/ArrayUtils.add ([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;
      // 24: checkcast [Lio/netty/util/concurrent/GenericFutureListener;
      // 27: checkcast [Lio/netty/util/concurrent/GenericFutureListener;
      // 2a: invokespecial hv0._bo (Lmz2;[Lio/netty/util/concurrent/GenericFutureListener;)V
      // 2d: iload 4
      // 2f: ifne 7d
      // 32: goto 39
      // 35: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield hv0.mtu Ljava/util/concurrent/locks/ReentrantReadWriteLock;
      // 3d: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock.writeLock ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
      // 40: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.lock ()V
      // 43: aload 0
      // 44: getfield hv0.zor Ljava/util/Queue;
      // 47: new hv0$t04
      // 4a: dup
      // 4b: aload 1
      // 4c: aload 3
      // 4d: bipush 0
      // 4e: aload 2
      // 4f: invokestatic org/apache/commons/lang3/ArrayUtils.add ([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;
      // 52: checkcast [Lio/netty/util/concurrent/GenericFutureListener;
      // 55: checkcast [Lio/netty/util/concurrent/GenericFutureListener;
      // 58: invokespecial hv0$t04.<init> (Lmz2;[Lio/netty/util/concurrent/GenericFutureListener;)V
      // 5b: invokeinterface java/util/Queue.add (Ljava/lang/Object;)Z 2
      // 60: pop
      // 61: aload 0
      // 62: getfield hv0.mtu Ljava/util/concurrent/locks/ReentrantReadWriteLock;
      // 65: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock.writeLock ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
      // 68: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.unlock ()V
      // 6b: goto 7d
      // 6e: astore 5
      // 70: aload 0
      // 71: getfield hv0.mtu Ljava/util/concurrent/locks/ReentrantReadWriteLock;
      // 74: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock.writeLock ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;
      // 77: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock$WriteLock.unlock ()V
      // 7a: aload 5
      // 7c: athrow
      // 7d: return
   }

   private void _bo(mz2 param1, GenericFutureListener[] param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hv0.a J
      // 003: ldc2_w 26232369066486
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.c ()I
      // 00b: istore 5
      // 00d: aload 1
      // 00e: invokestatic a0t.c5_ (Lmz2;)La0t;
      // 011: astore 6
      // 013: aload 0
      // 014: getfield hv0.uqg Lio/netty/channel/Channel;
      // 017: getstatic hv0.zix Lio/netty/util/AttributeKey;
      // 01a: invokeinterface io/netty/channel/Channel.attr (Lio/netty/util/AttributeKey;)Lio/netty/util/Attribute; 2
      // 01f: invokeinterface io/netty/util/Attribute.get ()Ljava/lang/Object; 1
      // 024: checkcast a0t
      // 027: astore 7
      // 029: iload 5
      // 02b: ifne 059
      // 02e: aload 7
      // 030: aload 6
      // 032: if_acmpeq 069
      // 035: goto 03c
      // 038: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03b: athrow
      // 03c: getstatic hv0.pk7 Lorg/apache/logging/log4j/Logger;
      // 03f: sipush 31747
      // 042: ldc2_w 5775651908647997687
      // 045: lload 3
      // 046: lxor
      // 047: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04c: nop
      // 04d: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;)V 2
      // 052: goto 059
      // 055: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 058: athrow
      // 059: aload 0
      // 05a: getfield hv0.uqg Lio/netty/channel/Channel;
      // 05d: invokeinterface io/netty/channel/Channel.config ()Lio/netty/channel/ChannelConfig; 1
      // 062: bipush 0
      // 063: invokeinterface io/netty/channel/ChannelConfig.setAutoRead (Z)Lio/netty/channel/ChannelConfig; 2
      // 068: pop
      // 069: aload 0
      // 06a: getfield hv0.uqg Lio/netty/channel/Channel;
      // 06d: invokeinterface io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; 1
      // 072: iload 5
      // 074: ifne 0ed
      // 077: invokeinterface io/netty/channel/EventLoop.inEventLoop ()Z 1
      // 07c: ifeq 0dd
      // 07f: goto 086
      // 082: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 085: athrow
      // 086: aload 6
      // 088: aload 7
      // 08a: if_acmpeq 0a1
      // 08d: goto 094
      // 090: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 093: athrow
      // 094: aload 0
      // 095: aload 6
      // 097: invokevirtual hv0.hlc (La0t;)V
      // 09a: goto 0a1
      // 09d: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: getfield hv0.uqg Lio/netty/channel/Channel;
      // 0a5: aload 1
      // 0a6: invokeinterface io/netty/channel/Channel.writeAndFlush (Ljava/lang/Object;)Lio/netty/channel/ChannelFuture; 2
      // 0ab: astore 8
      // 0ad: iload 5
      // 0af: ifne 0d8
      // 0b2: aload 2
      // 0b3: ifnull 0cd
      // 0b6: goto 0bd
      // 0b9: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0bc: athrow
      // 0bd: aload 8
      // 0bf: aload 2
      // 0c0: invokeinterface io/netty/channel/ChannelFuture.addListeners ([Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelFuture; 2
      // 0c5: pop
      // 0c6: goto 0cd
      // 0c9: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cc: athrow
      // 0cd: aload 8
      // 0cf: getstatic io/netty/channel/ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE Lio/netty/channel/ChannelFutureListener;
      // 0d2: invokeinterface io/netty/channel/ChannelFuture.addListener (Lio/netty/util/concurrent/GenericFutureListener;)Lio/netty/channel/ChannelFuture; 2
      // 0d7: pop
      // 0d8: iload 5
      // 0da: ifeq 100
      // 0dd: aload 0
      // 0de: getfield hv0.uqg Lio/netty/channel/Channel;
      // 0e1: invokeinterface io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; 1
      // 0e6: goto 0ed
      // 0e9: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ec: athrow
      // 0ed: new hv0$4
      // 0f0: dup
      // 0f1: aload 0
      // 0f2: aload 6
      // 0f4: aload 7
      // 0f6: aload 1
      // 0f7: aload 2
      // 0f8: invokespecial hv0$4.<init> (Lhv0;La0t;La0t;Lmz2;[Lio/netty/util/concurrent/GenericFutureListener;)V
      // 0fb: invokeinterface io/netty/channel/EventLoop.execute (Ljava/lang/Runnable;)V 2
      // 100: return
   }

   private void o0e() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hv0.uqg Lio/netty/channel/Channel;
      // 08: iload 1
      // 09: ifne 2c
      // 0c: ifnull 93
      // 0f: goto 16
      // 12: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 3c
      // 1b: goto 22
      // 1e: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 21: athrow
      // 22: getfield hv0.uqg Lio/netty/channel/Channel;
      // 25: goto 2c
      // 28: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 31: ifeq 93
      // 34: aload 0
      // 35: goto 3c
      // 38: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3b: athrow
      // 3c: getfield hv0.mtu Ljava/util/concurrent/locks/ReentrantReadWriteLock;
      // 3f: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock.readLock ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
      // 42: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.lock ()V
      // 45: aload 0
      // 46: getfield hv0.zor Ljava/util/Queue;
      // 49: invokeinterface java/util/Queue.isEmpty ()Z 1
      // 4e: ifne 79
      // 51: aload 0
      // 52: getfield hv0.zor Ljava/util/Queue;
      // 55: invokeinterface java/util/Queue.poll ()Ljava/lang/Object; 1
      // 5a: checkcast hv0$t04
      // 5d: astore 2
      // 5e: aload 0
      // 5f: aload 2
      // 60: invokestatic hv0$t04.wp8 (Lhv0$t04;)Lmz2;
      // 63: aload 2
      // 64: invokestatic hv0$t04.avq (Lhv0$t04;)[Lio/netty/util/concurrent/GenericFutureListener;
      // 67: invokespecial hv0._bo (Lmz2;[Lio/netty/util/concurrent/GenericFutureListener;)V
      // 6a: iload 1
      // 6b: ifne 83
      // 6e: iload 1
      // 6f: ifeq 45
      // 72: goto 79
      // 75: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 78: athrow
      // 79: aload 0
      // 7a: getfield hv0.mtu Ljava/util/concurrent/locks/ReentrantReadWriteLock;
      // 7d: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock.readLock ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
      // 80: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock ()V
      // 83: goto 93
      // 86: astore 3
      // 87: aload 0
      // 88: getfield hv0.mtu Ljava/util/concurrent/locks/ReentrantReadWriteLock;
      // 8b: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock.readLock ()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;
      // 8e: invokevirtual java/util/concurrent/locks/ReentrantReadWriteLock$ReadLock.unlock ()V
      // 91: aload 3
      // 92: athrow
      // 93: return
   }

   public void v2s() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial hv0.o0e ()V
      // 08: aload 0
      // 09: iload 1
      // 0a: ifeq 31
      // 0d: getfield hv0.s09 Lyw3;
      // 10: instanceof xcy
      // 13: ifeq 30
      // 16: goto 1d
      // 19: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield hv0.s09 Lyw3;
      // 21: checkcast xcy
      // 24: invokeinterface xcy._21 ()V 1
      // 29: goto 30
      // 2c: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield hv0.uqg Lio/netty/channel/Channel;
      // 34: invokeinterface io/netty/channel/Channel.flush ()Lio/netty/channel/Channel; 1
      // 39: pop
      // 3a: return
   }

   public SocketAddress pz4() {
      return this.oj8;
   }

   public void g8c(ekw param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield hv0.uqg Lio/netty/channel/Channel;
      // 08: iload 2
      // 09: ifeq 26
      // 0c: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 11: ifeq 36
      // 14: goto 1b
      // 17: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield hv0.uqg Lio/netty/channel/Channel;
      // 1f: goto 26
      // 22: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: invokeinterface io/netty/channel/Channel.close ()Lio/netty/channel/ChannelFuture; 1
      // 2b: invokeinterface io/netty/channel/ChannelFuture.awaitUninterruptibly ()Lio/netty/channel/ChannelFuture; 1
      // 30: pop
      // 31: aload 0
      // 32: aload 1
      // 33: putfield hv0.a5o Lekw;
      // 36: return
   }

   public boolean mwg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hv0.uqg Lio/netty/channel/Channel;
      // 08: instanceof io/netty/channel/local/LocalChannel
      // 0b: iload 1
      // 0c: ifne 36
      // 0f: ifne 35
      // 12: goto 19
      // 15: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield hv0.uqg Lio/netty/channel/Channel;
      // 1d: instanceof io/netty/channel/local/LocalServerChannel
      // 20: iload 1
      // 21: ifne 36
      // 24: goto 2b
      // 27: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: ifeq 39
      // 2e: goto 35
      // 31: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   public static hv0 wkr(InetAddress var0, int var1, boolean var2) {
      int var3 = t9d.b();
      hv0 var4 = new hv0(qat.yu7);

      Class<EpollSocketChannel> var5;
      zrl var6;
      label27: {
         label26: {
            boolean var10000;
            label25: {
               try {
                  var10000 = Epoll.isAvailable();
                  if (var3 == 0) {
                     break label25;
                  }

                  if (!var10000) {
                     break label26;
                  }
               } catch (TimeoutException var7) {
                  throw a(var7);
               }

               var10000 = var2;
            }

            if (var10000) {
               var5 = EpollSocketChannel.class;
               var6 = ggr;
               if (var3 != 0) {
                  break label27;
               }
            }
         }

         var5 = NioSocketChannel.class;
         var6 = tnd;
      }

      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)var6.qyc())).handler(new hv0$5(var4))).channel(var5))
         .connect(var0, var1)
         .syncUninterruptibly();
      return var4;
   }

   public static hv0 mob(SocketAddress var0) {
      hv0 var1 = new hv0(qat.yu7);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)nji.qyc())).handler(new hv0$6(var1))).channel(LocalChannel.class))
         .connect(var0)
         .syncUninterruptibly();
      return var1;
   }

   public void n62(SecretKey var1) {
      long var2 = a ^ 30149329631853L;
      this.dtp = true;
      this.uqg.pipeline().addBefore(a<"u">(24573, 5956084833177761927L ^ var2), a<"u">(15128, 6902487147543469166L ^ var2), new pxe(vk8.xw6(2, var1)));
      this.uqg.pipeline().addBefore(a<"u">(10866, 8538212885343112479L ^ var2), a<"u">(17681, 1620569236291215992L ^ var2), new _6e(vk8.xw6(1, var1)));
   }

   public boolean rvo() {
      return this.dtp;
   }

   public boolean jy3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hv0.uqg Lio/netty/channel/Channel;
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifnull 38
      // 0f: goto 16
      // 12: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: getfield hv0.uqg Lio/netty/channel/Channel;
      // 1a: goto 21
      // 1d: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 26: iload 1
      // 27: ifne 35
      // 2a: ifeq 38
      // 2d: goto 34
      // 30: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 33: athrow
      // 34: bipush 1
      // 35: goto 39
      // 38: bipush 0
      // 39: ireturn
   }

   public boolean qka() {
      try {
         if (this.uqg == null) {
            return true;
         }
      } catch (TimeoutException var1) {
         throw a(var1);
      }

      return false;
   }

   public yw3 xcu() {
      return this.s09;
   }

   public ekw zhi() {
      return this.a5o;
   }

   public void mzp() {
      this.uqg.config().setAutoRead(false);
   }

   public void ya5(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hv0.a J
      // 003: ldc2_w 5421992429674
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.c ()I
      // 00b: istore 4
      // 00d: iload 1
      // 00e: iload 4
      // 010: ifne 17d
      // 013: iflt 157
      // 016: goto 01d
      // 019: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01c: athrow
      // 01d: aload 0
      // 01e: getfield hv0.uqg Lio/netty/channel/Channel;
      // 021: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 026: sipush 16952
      // 029: ldc2_w 7829122442700527445
      // 02c: lload 2
      // 02d: lxor
      // 02e: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 033: nop
      // 034: iload 4
      // 036: ifne 09f
      // 039: goto 040
      // 03c: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03f: athrow
      // 040: invokeinterface io/netty/channel/ChannelPipeline.get (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 045: instanceof ey_
      // 048: ifeq 081
      // 04b: goto 052
      // 04e: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 051: athrow
      // 052: aload 0
      // 053: getfield hv0.uqg Lio/netty/channel/Channel;
      // 056: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 05b: sipush 12443
      // 05e: ldc2_w 4669159023597774307
      // 061: lload 2
      // 062: lxor
      // 063: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 068: nop
      // 069: invokeinterface io/netty/channel/ChannelPipeline.get (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 06e: checkcast ey_
      // 071: iload 1
      // 072: invokevirtual ey_.mdk (I)V
      // 075: iload 4
      // 077: ifeq 0bb
      // 07a: goto 081
      // 07d: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 080: athrow
      // 081: aload 0
      // 082: getfield hv0.uqg Lio/netty/channel/Channel;
      // 085: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 08a: sipush 28564
      // 08d: ldc2_w 5464434142366317307
      // 090: lload 2
      // 091: lxor
      // 092: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 097: nop
      // 098: goto 09f
      // 09b: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09e: athrow
      // 09f: sipush 12443
      // 0a2: ldc2_w 4669159023597774307
      // 0a5: lload 2
      // 0a6: lxor
      // 0a7: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ac: nop
      // 0ad: new ey_
      // 0b0: dup
      // 0b1: iload 1
      // 0b2: invokespecial ey_.<init> (I)V
      // 0b5: invokeinterface io/netty/channel/ChannelPipeline.addBefore (Ljava/lang/String;Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 4
      // 0ba: pop
      // 0bb: aload 0
      // 0bc: getfield hv0.uqg Lio/netty/channel/Channel;
      // 0bf: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 0c4: sipush 3171
      // 0c7: ldc2_w 4834449800707528985
      // 0ca: lload 2
      // 0cb: lxor
      // 0cc: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d1: nop
      // 0d2: iload 4
      // 0d4: ifne 136
      // 0d7: invokeinterface io/netty/channel/ChannelPipeline.get (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 0dc: instanceof fwm
      // 0df: ifeq 118
      // 0e2: goto 0e9
      // 0e5: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e8: athrow
      // 0e9: aload 0
      // 0ea: getfield hv0.uqg Lio/netty/channel/Channel;
      // 0ed: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 0f2: sipush 12443
      // 0f5: ldc2_w 4669159023597774307
      // 0f8: lload 2
      // 0f9: lxor
      // 0fa: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ff: nop
      // 100: invokeinterface io/netty/channel/ChannelPipeline.get (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 105: checkcast fwm
      // 108: iload 1
      // 109: invokevirtual fwm.wm6 (I)V
      // 10c: iload 4
      // 10e: ifeq 202
      // 111: goto 118
      // 114: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 117: athrow
      // 118: aload 0
      // 119: getfield hv0.uqg Lio/netty/channel/Channel;
      // 11c: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 121: sipush 30639
      // 124: ldc2_w 5297146910647100123
      // 127: lload 2
      // 128: lxor
      // 129: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12e: nop
      // 12f: goto 136
      // 132: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 135: athrow
      // 136: sipush 16140
      // 139: ldc2_w 3636930906288613989
      // 13c: lload 2
      // 13d: lxor
      // 13e: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: nop
      // 144: new fwm
      // 147: dup
      // 148: iload 1
      // 149: invokespecial fwm.<init> (I)V
      // 14c: invokeinterface io/netty/channel/ChannelPipeline.addBefore (Ljava/lang/String;Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 4
      // 151: pop
      // 152: iload 4
      // 154: ifeq 202
      // 157: aload 0
      // 158: getfield hv0.uqg Lio/netty/channel/Channel;
      // 15b: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 160: sipush 12443
      // 163: ldc2_w 4669159023597774307
      // 166: lload 2
      // 167: lxor
      // 168: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16d: nop
      // 16e: invokeinterface io/netty/channel/ChannelPipeline.get (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 173: instanceof ey_
      // 176: goto 17d
      // 179: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17c: athrow
      // 17d: iload 4
      // 17f: ifne 1db
      // 182: ifeq 1b0
      // 185: goto 18c
      // 188: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 18b: athrow
      // 18c: aload 0
      // 18d: getfield hv0.uqg Lio/netty/channel/Channel;
      // 190: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 195: sipush 12443
      // 198: ldc2_w 4669159023597774307
      // 19b: lload 2
      // 19c: lxor
      // 19d: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a2: nop
      // 1a3: invokeinterface io/netty/channel/ChannelPipeline.remove (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 1a8: pop
      // 1a9: goto 1b0
      // 1ac: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: getfield hv0.uqg Lio/netty/channel/Channel;
      // 1b4: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 1b9: sipush 16140
      // 1bc: ldc2_w 3636930906288613989
      // 1bf: lload 2
      // 1c0: lxor
      // 1c1: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1c6: nop
      // 1c7: invokeinterface io/netty/channel/ChannelPipeline.get (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 1cc: iload 4
      // 1ce: ifne 201
      // 1d1: instanceof fwm
      // 1d4: goto 1db
      // 1d7: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1da: athrow
      // 1db: ifeq 202
      // 1de: aload 0
      // 1df: getfield hv0.uqg Lio/netty/channel/Channel;
      // 1e2: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 1e7: sipush 16140
      // 1ea: ldc2_w 3636930906288613989
      // 1ed: lload 2
      // 1ee: lxor
      // 1ef: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f4: nop
      // 1f5: invokeinterface io/netty/channel/ChannelPipeline.remove (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 1fa: goto 201
      // 1fd: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 200: athrow
      // 201: pop
      // 202: return
   }

   public void kh8() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic hv0.a J
      // 03: ldc2_w 65507680563923
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic t9d.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: getfield hv0.uqg Lio/netty/channel/Channel;
      // 10: iload 3
      // 11: ifne 29
      // 14: ifnull ea
      // 17: goto 1e
      // 1a: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield hv0.uqg Lio/netty/channel/Channel;
      // 22: goto 29
      // 25: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 28: athrow
      // 29: invokeinterface io/netty/channel/Channel.isOpen ()Z 1
      // 2e: iload 3
      // 2f: ifne 52
      // 32: ifne ea
      // 35: goto 3c
      // 38: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3b: athrow
      // 3c: aload 0
      // 3d: iload 3
      // 3e: ifne 62
      // 41: goto 48
      // 44: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 47: athrow
      // 48: getfield hv0.sva Z
      // 4b: goto 52
      // 4e: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 51: athrow
      // 52: ifne cd
      // 55: aload 0
      // 56: bipush 1
      // 57: putfield hv0.sva Z
      // 5a: aload 0
      // 5b: goto 62
      // 5e: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 61: athrow
      // 62: iload 3
      // 63: ifne 93
      // 66: invokevirtual hv0.zhi ()Lekw;
      // 69: ifnull 8b
      // 6c: goto 73
      // 6f: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 72: athrow
      // 73: aload 0
      // 74: invokevirtual hv0.xcu ()Lyw3;
      // 77: aload 0
      // 78: invokevirtual hv0.zhi ()Lekw;
      // 7b: invokeinterface yw3.az3 (Lekw;)V 2
      // 80: iload 3
      // 81: ifeq ea
      // 84: goto 8b
      // 87: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8a: athrow
      // 8b: aload 0
      // 8c: goto 93
      // 8f: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 92: athrow
      // 93: invokevirtual hv0.xcu ()Lyw3;
      // 96: iload 3
      // 97: ifne af
      // 9a: ifnull ea
      // 9d: goto a4
      // a0: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a3: athrow
      // a4: aload 0
      // a5: invokevirtual hv0.xcu ()Lyw3;
      // a8: goto af
      // ab: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ae: athrow
      // af: new tao
      // b2: dup
      // b3: sipush 4369
      // b6: ldc2_w 7717534045082730180
      // b9: lload 1
      // ba: lxor
      // bb: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c0: nop
      // c1: invokespecial tao.<init> (Ljava/lang/String;)V
      // c4: invokeinterface yw3.az3 (Lekw;)V 2
      // c9: iload 3
      // ca: ifeq ea
      // cd: getstatic hv0.pk7 Lorg/apache/logging/log4j/Logger;
      // d0: sipush 11631
      // d3: ldc2_w 3520708970332488355
      // d6: lload 1
      // d7: lxor
      // d8: invokedynamic u (IJ)Ljava/lang/String; bsm=hv0.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: nop
      // de: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;)V 2
      // e3: goto ea
      // e6: invokestatic hv0.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // e9: athrow
      // ea: return
   }

   public void channelRead0(ChannelHandlerContext var1, Object var2) {
      this.i63(var1, (mz2)var2);
   }

   public static Channel j5s(hv0 var0) {
      return var0.uqg;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6513309806149921367L, 5997993620502130379L, MethodHandles.lookup().lookupClass()).a(155574567081788L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 48047598800255L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[23];
      int var5 = 0;
      String var4 = "$o¨\u009eç{K\u0090òxyº\nC\n¡\u0011áàÜ»!\u0006Ñj\u000f\u0093p³½\n\u0011\f\u0098¿ Û\u007f\u001aÉ4\u0016eý{xºý ±\u0089}i\u0095S ¿>ý¥OÏ\u009e\u008a¥\u0011ÊîÀyÃ&\u0015qSõ\u000e`~:à0Ð\n¯\u0088\u0095\u0092\u009c\u00881K¢-W¸\u000frY¥+\u0091Zâ\u0005C\u009d\u000e\"-DFugAðm¡QF\u008efææ¼\u001aM9\u000eR0n«í\u0096÷Û\u0006å(\u0093¸`\u0001LaúÞ\"ÛÉ\u000b\\ØÊ\u0090Ó<(\näN\u0011\b¿g\u008er>s\u0082L\u008d\u000bù\"×AG\u0018rÑ\u0098Ø7cav§\u0010`ôÐ6Ãtgæ>E\u008f½Cy0¤\u0080\\\rÞTçTÆØÕ\u009b#zè\u007f^½Èv\u0096,ö³yá÷\u0007\u0093µGQ¤u²mÏx°©\u0007²Ób\fu\u0081<\u0018/øeÿÊ\u0093\u000b¿{Êp\u009d\u0091?®a\u001dÂ'\u007f`æ\u0085N\u0010`&Sf\u0012Ü\u0088\u0087\u0086\u007fò\f\rÌ¡\u0091 \u0080»Ag<3Â\u0094PÚ\u0081]¥M\"ç\u009fOn¦Â\u0001¼\u0014Ï¾1îY\u0010\\\u0093@ï±³OUâ¸ÚùéÞ¡x¬¤<çT²Aä5Ë¥æ±ïR\u0012p\u0080Sn\f\u0005®e\u001a|bì å\u0086Û\u00892c,çT\u009fXûº\u009a¼\u0086Ýr\u008f¦\u007fÜ R<OâT¿1<t%\u0099}\"ÇUú\u001bÛKÜ§ÀÜ5$(±\u009e\u008aù5ø 6)\u0098ñcÊ\u001fæ>ÉyKá\u0007ípg\u001a\u0084Ê¸Å\u001e4á\u0099&ÄæÚ¤\u0092(ï\u0004\f¨ñåb\u0005{\"a\u0007*\u0005å\u00ad$y\u0097â\u008bNS¼Z\u0005/O\u0089\u0091#\u009a£Ëy'Sç\u001cÅ\u0010\u0011Sîgwòæ\u0091¢Aë\u000e\u0001\u0082à~(S\u0091¡(~\u0099ªÓÉAîÄò@\u008c\u0011¨6Ì?\u008c\u009c\u00163Íd} n\u001f\u0017\u001cèL0ÚpëiV !V\u001eÙxÔ³\u001fP9B\u0019\u000f\u0006\u0083\\¼\u007fâ¶Ë\u0093 Î,q\u001bPóvA\u0003\u0018ÍG2x\u0097ü,\u0085MbtÔv!1\fù\u0000_üÊ²\u0096\u0091 µ¿\u0091·\u00adÍw&è3\u0015;|\u0092\tZ\u0086å¢\u008cÝùf\u0001/Û\u0000\u0097Kq6ø\u0010\u009aeUå\u009f9+õ:¹Ú\u0004ª:×Ç Û\u0010\u0014aÔè\u001aè\u0006§dpù-CÂ¿vP}tÙä¥Ë_¡K\u008c@ú\u0090(©,\u009føeh%\"ï`\"E;\fÁ\u008cSP¯¶\u008e:`s»s(>¸¯\t\u008d¢³ÅZ®e##";
      int var6 = "$o¨\u009eç{K\u0090òxyº\nC\n¡\u0011áàÜ»!\u0006Ñj\u000f\u0093p³½\n\u0011\f\u0098¿ Û\u007f\u001aÉ4\u0016eý{xºý ±\u0089}i\u0095S ¿>ý¥OÏ\u009e\u008a¥\u0011ÊîÀyÃ&\u0015qSõ\u000e`~:à0Ð\n¯\u0088\u0095\u0092\u009c\u00881K¢-W¸\u000frY¥+\u0091Zâ\u0005C\u009d\u000e\"-DFugAðm¡QF\u008efææ¼\u001aM9\u000eR0n«í\u0096÷Û\u0006å(\u0093¸`\u0001LaúÞ\"ÛÉ\u000b\\ØÊ\u0090Ó<(\näN\u0011\b¿g\u008er>s\u0082L\u008d\u000bù\"×AG\u0018rÑ\u0098Ø7cav§\u0010`ôÐ6Ãtgæ>E\u008f½Cy0¤\u0080\\\rÞTçTÆØÕ\u009b#zè\u007f^½Èv\u0096,ö³yá÷\u0007\u0093µGQ¤u²mÏx°©\u0007²Ób\fu\u0081<\u0018/øeÿÊ\u0093\u000b¿{Êp\u009d\u0091?®a\u001dÂ'\u007f`æ\u0085N\u0010`&Sf\u0012Ü\u0088\u0087\u0086\u007fò\f\rÌ¡\u0091 \u0080»Ag<3Â\u0094PÚ\u0081]¥M\"ç\u009fOn¦Â\u0001¼\u0014Ï¾1îY\u0010\\\u0093@ï±³OUâ¸ÚùéÞ¡x¬¤<çT²Aä5Ë¥æ±ïR\u0012p\u0080Sn\f\u0005®e\u001a|bì å\u0086Û\u00892c,çT\u009fXûº\u009a¼\u0086Ýr\u008f¦\u007fÜ R<OâT¿1<t%\u0099}\"ÇUú\u001bÛKÜ§ÀÜ5$(±\u009e\u008aù5ø 6)\u0098ñcÊ\u001fæ>ÉyKá\u0007ípg\u001a\u0084Ê¸Å\u001e4á\u0099&ÄæÚ¤\u0092(ï\u0004\f¨ñåb\u0005{\"a\u0007*\u0005å\u00ad$y\u0097â\u008bNS¼Z\u0005/O\u0089\u0091#\u009a£Ëy'Sç\u001cÅ\u0010\u0011Sîgwòæ\u0091¢Aë\u000e\u0001\u0082à~(S\u0091¡(~\u0099ªÓÉAîÄò@\u008c\u0011¨6Ì?\u008c\u009c\u00163Íd} n\u001f\u0017\u001cèL0ÚpëiV !V\u001eÙxÔ³\u001fP9B\u0019\u000f\u0006\u0083\\¼\u007fâ¶Ë\u0093 Î,q\u001bPóvA\u0003\u0018ÍG2x\u0097ü,\u0085MbtÔv!1\fù\u0000_üÊ²\u0096\u0091 µ¿\u0091·\u00adÍw&è3\u0015;|\u0092\tZ\u0086å¢\u008cÝùf\u0001/Û\u0000\u0097Kq6ø\u0010\u009aeUå\u009f9+õ:¹Ú\u0004ª:×Ç Û\u0010\u0014aÔè\u001aè\u0006§dpù-CÂ¿vP}tÙä¥Ë_¡K\u008c@ú\u0090(©,\u009føeh%\"ï`\"E;\fÁ\u008cSP¯¶\u008e:`s»s(>¸¯\t\u008d¢³ÅZ®e##"
         .length();
      char var3 = '0';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[23];
                     pk7 = LogManager.getLogger();
                     q5k = MarkerManager.getMarker(a<"u">(14518, 4906457270473599192L ^ var9));
                     set = MarkerManager.getMarker(a<"u">(25621, 2570161324494681207L ^ var9), q5k);
                     zix = AttributeKey.valueOf(a<"u">(21200, 1019891967349015219L ^ var9));
                     tnd = new hv0$1();
                     ggr = new hv0$2();
                     nji = new hv0$3();
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u0013 Ä\u0089\u000b4ý\u0086¶1.\u0094`D\u0019êµm{ò\u00169Qp\u0018·º\u009a\u0084\u0091®1pú\u001fy÷+.ëY×T\u0006\u0019)\u0012¿H";
                  var6 = "\u0013 Ä\u0089\u000b4ý\u0086¶1.\u0094`D\u0019êµm{ò\u00169Qp\u0018·º\u009a\u0084\u0091®1pú\u001fy÷+.ëY×T\u0006\u0019)\u0012¿H"
                     .length();
                  var3 = 24;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static RuntimeException a(RuntimeException var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18838;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("hv0", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("hv0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
