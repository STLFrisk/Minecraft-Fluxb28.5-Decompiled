import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;

public class wty extends ChannelInboundHandlerAdapter {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public wty(ob1 var1) {
      this.nef = var1;
   }

   public void channelRead(ChannelHandlerContext param1, Object param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wty.a J
      // 003: ldc2_w 30359115505410
      // 006: lxor
      // 007: lstore 3
      // 008: aload 2
      // 009: checkcast io/netty/buffer/ByteBuf
      // 00c: astore 6
      // 00e: invokestatic t9d.c ()I
      // 011: aload 6
      // 013: invokevirtual io/netty/buffer/ByteBuf.markReaderIndex ()Lio/netty/buffer/ByteBuf;
      // 016: pop
      // 017: istore 5
      // 019: bipush 1
      // 01a: istore 7
      // 01c: aload 6
      // 01e: invokevirtual io/netty/buffer/ByteBuf.readUnsignedByte ()S
      // 021: iload 5
      // 023: ifne 41e
      // 026: sipush 254
      // 029: if_icmpne 41c
      // 02c: goto 033
      // 02f: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 032: athrow
      // 033: aload 1
      // 034: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 039: invokeinterface io/netty/channel/Channel.remoteAddress ()Ljava/net/SocketAddress; 1
      // 03e: checkcast java/net/InetSocketAddress
      // 041: astore 8
      // 043: aload 0
      // 044: getfield wty.nef Lob1;
      // 047: invokevirtual ob1.q65 ()Lvr1;
      // 04a: astore 9
      // 04c: aload 6
      // 04e: invokevirtual io/netty/buffer/ByteBuf.readableBytes ()I
      // 051: istore 10
      // 053: iload 10
      // 055: iload 5
      // 057: ifne 1ce
      // 05a: lookupswitch 360 2 0 30 1 144
      // 074: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 077: athrow
      // 078: getstatic wty.f9z Lorg/apache/logging/log4j/Logger;
      // 07b: sipush 15946
      // 07e: ldc2_w 2956396128312419905
      // 081: lload 3
      // 082: lxor
      // 083: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 088: nop
      // 089: bipush 2
      // 08a: anewarray 66
      // 08d: dup
      // 08e: bipush 0
      // 08f: aload 8
      // 091: invokevirtual java/net/InetSocketAddress.getAddress ()Ljava/net/InetAddress;
      // 094: aastore
      // 095: dup
      // 096: bipush 1
      // 097: aload 8
      // 099: invokevirtual java/net/InetSocketAddress.getPort ()I
      // 09c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 09f: aastore
      // 0a0: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 0a5: sipush 1203
      // 0a8: ldc2_w 756868379471535289
      // 0ab: lload 3
      // 0ac: lxor
      // 0ad: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: nop
      // 0b3: bipush 3
      // 0b4: anewarray 66
      // 0b7: dup
      // 0b8: bipush 0
      // 0b9: aload 9
      // 0bb: invokevirtual vr1._gp ()Ljava/lang/String;
      // 0be: aastore
      // 0bf: dup
      // 0c0: bipush 1
      // 0c1: aload 9
      // 0c3: invokevirtual vr1.mij ()I
      // 0c6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c9: aastore
      // 0ca: dup
      // 0cb: bipush 2
      // 0cc: aload 9
      // 0ce: invokevirtual vr1.ao7 ()I
      // 0d1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0d4: aastore
      // 0d5: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 0d8: astore 11
      // 0da: aload 0
      // 0db: aload 1
      // 0dc: aload 0
      // 0dd: aload 11
      // 0df: invokespecial wty._lh (Ljava/lang/String;)Lio/netty/buffer/ByteBuf;
      // 0e2: invokespecial wty.nwy (Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;)V
      // 0e5: iload 5
      // 0e7: ifeq 3cd
      // 0ea: aload 6
      // 0ec: invokevirtual io/netty/buffer/ByteBuf.readUnsignedByte ()S
      // 0ef: iload 5
      // 0f1: ifne 108
      // 0f4: goto 0fb
      // 0f7: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0fa: athrow
      // 0fb: bipush 1
      // 0fc: if_icmpeq 140
      // 0ff: goto 106
      // 102: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 105: athrow
      // 106: iload 7
      // 108: ifeq 13f
      // 10b: aload 6
      // 10d: invokevirtual io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
      // 110: pop
      // 111: aload 1
      // 112: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 117: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 11c: sipush 17040
      // 11f: ldc2_w 2217065452963207829
      // 122: lload 3
      // 123: lxor
      // 124: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 129: nop
      // 12a: invokeinterface io/netty/channel/ChannelPipeline.remove (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 12f: pop
      // 130: aload 1
      // 131: aload 2
      // 132: invokeinterface io/netty/channel/ChannelHandlerContext.fireChannelRead (Ljava/lang/Object;)Lio/netty/channel/ChannelHandlerContext; 2
      // 137: pop
      // 138: goto 13f
      // 13b: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13e: athrow
      // 13f: return
      // 140: getstatic wty.f9z Lorg/apache/logging/log4j/Logger;
      // 143: sipush 5072
      // 146: ldc2_w 3260561517192203228
      // 149: lload 3
      // 14a: lxor
      // 14b: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 150: nop
      // 151: bipush 2
      // 152: anewarray 66
      // 155: dup
      // 156: bipush 0
      // 157: aload 8
      // 159: invokevirtual java/net/InetSocketAddress.getAddress ()Ljava/net/InetAddress;
      // 15c: aastore
      // 15d: dup
      // 15e: bipush 1
      // 15f: aload 8
      // 161: invokevirtual java/net/InetSocketAddress.getPort ()I
      // 164: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 167: aastore
      // 168: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 16d: sipush 7147
      // 170: ldc2_w 6765637562239632355
      // 173: lload 3
      // 174: lxor
      // 175: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17a: nop
      // 17b: bipush 5
      // 17c: anewarray 66
      // 17f: dup
      // 180: bipush 0
      // 181: bipush 127
      // 183: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 186: aastore
      // 187: dup
      // 188: bipush 1
      // 189: aload 9
      // 18b: invokevirtual vr1.of4 ()Ljava/lang/String;
      // 18e: aastore
      // 18f: dup
      // 190: bipush 2
      // 191: aload 9
      // 193: invokevirtual vr1._gp ()Ljava/lang/String;
      // 196: aastore
      // 197: dup
      // 198: bipush 3
      // 199: aload 9
      // 19b: invokevirtual vr1.mij ()I
      // 19e: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1a1: aastore
      // 1a2: dup
      // 1a3: bipush 4
      // 1a4: aload 9
      // 1a6: invokevirtual vr1.ao7 ()I
      // 1a9: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 1ac: aastore
      // 1ad: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 1b0: astore 12
      // 1b2: aload 0
      // 1b3: aload 1
      // 1b4: aload 0
      // 1b5: aload 12
      // 1b7: invokespecial wty._lh (Ljava/lang/String;)Lio/netty/buffer/ByteBuf;
      // 1ba: invokespecial wty.nwy (Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;)V
      // 1bd: iload 5
      // 1bf: ifeq 3cd
      // 1c2: aload 6
      // 1c4: invokevirtual io/netty/buffer/ByteBuf.readUnsignedByte ()S
      // 1c7: goto 1ce
      // 1ca: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1cd: athrow
      // 1ce: iload 5
      // 1d0: ifne 1e6
      // 1d3: bipush 1
      // 1d4: if_icmpne 1e9
      // 1d7: goto 1de
      // 1da: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1dd: athrow
      // 1de: bipush 1
      // 1df: goto 1e6
      // 1e2: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e5: athrow
      // 1e6: goto 1ea
      // 1e9: bipush 0
      // 1ea: istore 13
      // 1ec: iload 13
      // 1ee: aload 6
      // 1f0: invokevirtual io/netty/buffer/ByteBuf.readUnsignedByte ()S
      // 1f3: iload 5
      // 1f5: ifne 20d
      // 1f8: sipush 250
      // 1fb: if_icmpne 210
      // 1fe: goto 205
      // 201: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 204: athrow
      // 205: bipush 1
      // 206: goto 20d
      // 209: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20c: athrow
      // 20d: goto 211
      // 210: bipush 0
      // 211: iand
      // 212: istore 13
      // 214: iload 13
      // 216: sipush 6808
      // 219: ldc2_w 210279222450504337
      // 21c: lload 3
      // 21d: lxor
      // 21e: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 223: nop
      // 224: new java/lang/String
      // 227: dup
      // 228: aload 6
      // 22a: aload 6
      // 22c: invokevirtual io/netty/buffer/ByteBuf.readShort ()S
      // 22f: bipush 2
      // 230: imul
      // 231: invokevirtual io/netty/buffer/ByteBuf.readBytes (I)Lio/netty/buffer/ByteBuf;
      // 234: invokevirtual io/netty/buffer/ByteBuf.array ()[B
      // 237: getstatic com/google/common/base/Charsets.UTF_16BE Ljava/nio/charset/Charset;
      // 23a: invokespecial java/lang/String.<init> ([BLjava/nio/charset/Charset;)V
      // 23d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 240: iand
      // 241: istore 13
      // 243: aload 6
      // 245: invokevirtual io/netty/buffer/ByteBuf.readUnsignedShort ()I
      // 248: istore 14
      // 24a: iload 13
      // 24c: aload 6
      // 24e: invokevirtual io/netty/buffer/ByteBuf.readUnsignedByte ()S
      // 251: iload 5
      // 253: ifne 26a
      // 256: bipush 73
      // 258: if_icmplt 26d
      // 25b: goto 262
      // 25e: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 261: athrow
      // 262: bipush 1
      // 263: goto 26a
      // 266: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 269: athrow
      // 26a: goto 26e
      // 26d: bipush 0
      // 26e: iand
      // 26f: istore 13
      // 271: iload 13
      // 273: bipush 3
      // 274: aload 6
      // 276: aload 6
      // 278: invokevirtual io/netty/buffer/ByteBuf.readShort ()S
      // 27b: bipush 2
      // 27c: imul
      // 27d: invokevirtual io/netty/buffer/ByteBuf.readBytes (I)Lio/netty/buffer/ByteBuf;
      // 280: invokevirtual io/netty/buffer/ByteBuf.array ()[B
      // 283: arraylength
      // 284: iadd
      // 285: bipush 4
      // 286: iadd
      // 287: iload 5
      // 289: ifne 2a0
      // 28c: iload 14
      // 28e: if_icmpne 2a3
      // 291: goto 298
      // 294: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 297: athrow
      // 298: bipush 1
      // 299: goto 2a0
      // 29c: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29f: athrow
      // 2a0: goto 2a4
      // 2a3: bipush 0
      // 2a4: iand
      // 2a5: istore 13
      // 2a7: iload 13
      // 2a9: aload 6
      // 2ab: invokevirtual io/netty/buffer/ByteBuf.readInt ()I
      // 2ae: iload 5
      // 2b0: ifne 2c8
      // 2b3: ldc 65535
      // 2b5: nop
      // 2b6: if_icmpgt 2cb
      // 2b9: goto 2c0
      // 2bc: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2bf: athrow
      // 2c0: bipush 1
      // 2c1: goto 2c8
      // 2c4: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2c7: athrow
      // 2c8: goto 2cc
      // 2cb: bipush 0
      // 2cc: iand
      // 2cd: istore 13
      // 2cf: iload 13
      // 2d1: aload 6
      // 2d3: invokevirtual io/netty/buffer/ByteBuf.readableBytes ()I
      // 2d6: iload 5
      // 2d8: ifne 2e6
      // 2db: ifne 2e9
      // 2de: goto 2e5
      // 2e1: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e4: athrow
      // 2e5: bipush 1
      // 2e6: goto 2ea
      // 2e9: bipush 0
      // 2ea: iand
      // 2eb: istore 13
      // 2ed: iload 5
      // 2ef: ifne 365
      // 2f2: iload 13
      // 2f4: ifne 338
      // 2f7: goto 2fe
      // 2fa: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2fd: athrow
      // 2fe: iload 7
      // 300: ifeq 337
      // 303: aload 6
      // 305: invokevirtual io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
      // 308: pop
      // 309: aload 1
      // 30a: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 30f: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 314: sipush 13317
      // 317: ldc2_w 1016812933966392330
      // 31a: lload 3
      // 31b: lxor
      // 31c: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 321: nop
      // 322: invokeinterface io/netty/channel/ChannelPipeline.remove (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 327: pop
      // 328: aload 1
      // 329: aload 2
      // 32a: invokeinterface io/netty/channel/ChannelHandlerContext.fireChannelRead (Ljava/lang/Object;)Lio/netty/channel/ChannelHandlerContext; 2
      // 32f: pop
      // 330: goto 337
      // 333: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 336: athrow
      // 337: return
      // 338: getstatic wty.f9z Lorg/apache/logging/log4j/Logger;
      // 33b: sipush 6510
      // 33e: ldc2_w 6241039505357881696
      // 341: lload 3
      // 342: lxor
      // 343: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 348: nop
      // 349: bipush 2
      // 34a: anewarray 66
      // 34d: dup
      // 34e: bipush 0
      // 34f: aload 8
      // 351: invokevirtual java/net/InetSocketAddress.getAddress ()Ljava/net/InetAddress;
      // 354: aastore
      // 355: dup
      // 356: bipush 1
      // 357: aload 8
      // 359: invokevirtual java/net/InetSocketAddress.getPort ()I
      // 35c: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 35f: aastore
      // 360: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;[Ljava/lang/Object;)V 3
      // 365: sipush 24027
      // 368: ldc2_w 8868673611450582486
      // 36b: lload 3
      // 36c: lxor
      // 36d: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 372: nop
      // 373: bipush 5
      // 374: anewarray 66
      // 377: dup
      // 378: bipush 0
      // 379: bipush 127
      // 37b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 37e: aastore
      // 37f: dup
      // 380: bipush 1
      // 381: aload 9
      // 383: invokevirtual vr1.of4 ()Ljava/lang/String;
      // 386: aastore
      // 387: dup
      // 388: bipush 2
      // 389: aload 9
      // 38b: invokevirtual vr1._gp ()Ljava/lang/String;
      // 38e: aastore
      // 38f: dup
      // 390: bipush 3
      // 391: aload 9
      // 393: invokevirtual vr1.mij ()I
      // 396: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 399: aastore
      // 39a: dup
      // 39b: bipush 4
      // 39c: aload 9
      // 39e: invokevirtual vr1.ao7 ()I
      // 3a1: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 3a4: aastore
      // 3a5: invokestatic java/lang/String.format (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      // 3a8: astore 15
      // 3aa: aload 0
      // 3ab: aload 15
      // 3ad: invokespecial wty._lh (Ljava/lang/String;)Lio/netty/buffer/ByteBuf;
      // 3b0: astore 16
      // 3b2: aload 0
      // 3b3: aload 1
      // 3b4: aload 16
      // 3b6: invokespecial wty.nwy (Lio/netty/channel/ChannelHandlerContext;Lio/netty/buffer/ByteBuf;)V
      // 3b9: aload 16
      // 3bb: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 3be: pop
      // 3bf: goto 3cd
      // 3c2: astore 17
      // 3c4: aload 16
      // 3c6: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 3c9: pop
      // 3ca: aload 17
      // 3cc: athrow
      // 3cd: aload 6
      // 3cf: invokevirtual io/netty/buffer/ByteBuf.release ()Z
      // 3d2: pop
      // 3d3: bipush 0
      // 3d4: istore 7
      // 3d6: iload 5
      // 3d8: ifne 413
      // 3db: iload 7
      // 3dd: ifeq 41b
      // 3e0: goto 3e7
      // 3e3: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3e6: athrow
      // 3e7: aload 6
      // 3e9: invokevirtual io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
      // 3ec: pop
      // 3ed: aload 1
      // 3ee: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 3f3: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 3f8: sipush 13317
      // 3fb: ldc2_w 1016812933966392330
      // 3fe: lload 3
      // 3ff: lxor
      // 400: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 405: nop
      // 406: invokeinterface io/netty/channel/ChannelPipeline.remove (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 40b: pop
      // 40c: goto 413
      // 40f: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 412: athrow
      // 413: aload 1
      // 414: aload 2
      // 415: invokeinterface io/netty/channel/ChannelHandlerContext.fireChannelRead (Ljava/lang/Object;)Lio/netty/channel/ChannelHandlerContext; 2
      // 41a: pop
      // 41b: return
      // 41c: iload 7
      // 41e: ifeq 4e7
      // 421: aload 6
      // 423: invokevirtual io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
      // 426: pop
      // 427: aload 1
      // 428: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 42d: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 432: sipush 13317
      // 435: ldc2_w 1016812933966392330
      // 438: lload 3
      // 439: lxor
      // 43a: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 43f: nop
      // 440: invokeinterface io/netty/channel/ChannelPipeline.remove (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 445: pop
      // 446: aload 1
      // 447: aload 2
      // 448: invokeinterface io/netty/channel/ChannelHandlerContext.fireChannelRead (Ljava/lang/Object;)Lio/netty/channel/ChannelHandlerContext; 2
      // 44d: pop
      // 44e: goto 4e7
      // 451: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 454: athrow
      // 455: astore 8
      // 457: iload 5
      // 459: ifne 494
      // 45c: iload 7
      // 45e: ifeq 49c
      // 461: goto 468
      // 464: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 467: athrow
      // 468: aload 6
      // 46a: invokevirtual io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
      // 46d: pop
      // 46e: aload 1
      // 46f: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 474: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 479: sipush 13317
      // 47c: ldc2_w 1016812933966392330
      // 47f: lload 3
      // 480: lxor
      // 481: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 486: nop
      // 487: invokeinterface io/netty/channel/ChannelPipeline.remove (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 48c: pop
      // 48d: goto 494
      // 490: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 493: athrow
      // 494: aload 1
      // 495: aload 2
      // 496: invokeinterface io/netty/channel/ChannelHandlerContext.fireChannelRead (Ljava/lang/Object;)Lio/netty/channel/ChannelHandlerContext; 2
      // 49b: pop
      // 49c: return
      // 49d: astore 18
      // 49f: iload 5
      // 4a1: ifne 4dc
      // 4a4: iload 7
      // 4a6: ifeq 4e4
      // 4a9: goto 4b0
      // 4ac: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4af: athrow
      // 4b0: aload 6
      // 4b2: invokevirtual io/netty/buffer/ByteBuf.resetReaderIndex ()Lio/netty/buffer/ByteBuf;
      // 4b5: pop
      // 4b6: aload 1
      // 4b7: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 4bc: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 4c1: sipush 13317
      // 4c4: ldc2_w 1016812933966392330
      // 4c7: lload 3
      // 4c8: lxor
      // 4c9: invokedynamic d (IJ)Ljava/lang/String; bsm=wty.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 4ce: nop
      // 4cf: invokeinterface io/netty/channel/ChannelPipeline.remove (Ljava/lang/String;)Lio/netty/channel/ChannelHandler; 2
      // 4d4: pop
      // 4d5: goto 4dc
      // 4d8: invokestatic wty.a (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4db: athrow
      // 4dc: aload 1
      // 4dd: aload 2
      // 4de: invokeinterface io/netty/channel/ChannelHandlerContext.fireChannelRead (Ljava/lang/Object;)Lio/netty/channel/ChannelHandlerContext; 2
      // 4e3: pop
      // 4e4: aload 18
      // 4e6: athrow
      // 4e7: return
   }

   private void nwy(ChannelHandlerContext var1, ByteBuf var2) {
      var1.pipeline().firstContext().writeAndFlush(var2).addListener(ChannelFutureListener.CLOSE);
   }

   private ByteBuf _lh(String var1) {
      ByteBuf var3 = Unpooled.buffer();
      int var10000 = t9d.b();
      var3.writeByte(255);
      int var2 = var10000;
      char[] var4 = var1.toCharArray();
      var3.writeShort(var4.length);
      char[] var5 = var4;
      int var6 = var4.length;
      int var7 = 0;

      while (true) {
         if (var7 < var6) {
            char var8 = var5[var7];

            try {
               var10 = var3.writeChar(var8);
               if (var2 == 0) {
                  break;
               }

               var7++;
               if (var2 != 0) {
                  continue;
               }
            } catch (RuntimeException var9) {
               throw a(var9);
            }
         }

         var10 = var3;
         break;
      }

      return var10;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(7726047622551499485L, 1269123070771216484L, MethodHandles.lookup().lookupClass()).a(52660487885787L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 83396152850841L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\u0012%s\u0098Zð\u0017F´#©lç\u0081Øc\b+ð\u0080°Êö\u0005Ù0\u0096årÎ\u009a\u0092ÐÍS\u0095ùUË³0[£TÚÁ3\b\u0001°>\u0084\u0015 Q\u008c·¥«n\u0092\u0006W»Ø[Ú(BQ\u0006T\r\u007f÷\u0089¦cn¦÷\u0085C~\u001f.³ë\u009f\u0018WÊÝdÓ'\u0005\u008f,\u0083Ùõ\u001cS$ÆRê}\u0096\u0088êÅ\u0002(¦\u0016\u0099i¹\u008fµ@5\u000b\u0086\u0080E ÈÆyt&oÁ]T\u0084ª\u0013ô´Âtåó)ó@×#}dÂ õºÉ2¦\u009fb]\u0003Äl\u0088È[ó\u00159Ãfl«. ?\u008b¢Çd\u001føå|(\u0097W*\u0004Ä%\u009fÅKÓ\u008aÀñ\u0016Íõkäbl_FúbP½àq\u0096\u0000\u001aß\u008aî\u001fº\u001b\u0083Ó\u00878¢~ýß\u009c\u000eðIHû\u0093Uë'µós\u0089cÝ»ã\u00146\u0084kÿ4\u009bª\u0018\u0000Tõ6·øì¥^\u0010á4qéðñR6¤Åì@\u0011\u0086½";
      int var8 = "\u0012%s\u0098Zð\u0017F´#©lç\u0081Øc\b+ð\u0080°Êö\u0005Ù0\u0096årÎ\u009a\u0092ÐÍS\u0095ùUË³0[£TÚÁ3\b\u0001°>\u0084\u0015 Q\u008c·¥«n\u0092\u0006W»Ø[Ú(BQ\u0006T\r\u007f÷\u0089¦cn¦÷\u0085C~\u001f.³ë\u009f\u0018WÊÝdÓ'\u0005\u008f,\u0083Ùõ\u001cS$ÆRê}\u0096\u0088êÅ\u0002(¦\u0016\u0099i¹\u008fµ@5\u000b\u0086\u0080E ÈÆyt&oÁ]T\u0084ª\u0013ô´Âtåó)ó@×#}dÂ õºÉ2¦\u009fb]\u0003Äl\u0088È[ó\u00159Ãfl«. ?\u008b¢Çd\u001føå|(\u0097W*\u0004Ä%\u009fÅKÓ\u008aÀñ\u0016Íõkäbl_FúbP½àq\u0096\u0000\u001aß\u008aî\u001fº\u001b\u0083Ó\u00878¢~ýß\u009c\u000eðIHû\u0093Uë'µós\u0089cÝ»ã\u00146\u0084kÿ4\u009bª\u0018\u0000Tõ6·øì¥^\u0010á4qéðñR6¤Åì@\u0011\u0086½"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     b = var9;
                     c = new String[9];
                     f9z = LogManager.getLogger();
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "xÙ\u009dÙÐÇK!LÖ[È\u0001ô½Ã×¢ÁÝ\u009fî\u000e®A\u000fÞêqÓ Â \u0092p\u0010¡N>p\u008aW)\u0013~Fâ\u009aµõÍ\u0012¢4\u0006\b\u0088ûÔ\u0017x\u0081vÍÚ";
                  var8 = "xÙ\u009dÙÐÇK!LÖ[È\u0001ô½Ã×¢ÁÝ\u009fî\u000e®A\u000fÞêqÓ Â \u0092p\u0010¡N>p\u008aW)\u0013~Fâ\u009aµõÍ\u0012¢4\u0006\b\u0088ûÔ\u0017x\u0081vÍÚ"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2644;
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
            throw new RuntimeException("wty", var10);
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
         throw new RuntimeException("wty" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
