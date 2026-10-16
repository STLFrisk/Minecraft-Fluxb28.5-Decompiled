import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
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
import us.myles.ViaVersion.api.data.UserConnection;

public class j25 extends UserConnection {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public j25(Channel var1) {
      super(var1);
   }

   public void sendRawPacket(ByteBuf param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: invokedynamic run (Lj25;Lio/netty/buffer/ByteBuf;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, j25.lambda$sendRawPacket$0 (Lio/netty/buffer/ByteBuf;)V, ()V ]
      // 0b: astore 4
      // 0d: iload 3
      // 0e: ifeq 2a
      // 11: iload 2
      // 12: ifeq 2e
      // 15: goto 1c
      // 18: invokestatic j25.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 4
      // 1e: invokeinterface java/lang/Runnable.run ()V 1
      // 23: goto 2a
      // 26: invokestatic j25.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 3
      // 2b: ifne 45
      // 2e: aload 0
      // 2f: invokevirtual j25.getChannel ()Lio/netty/channel/Channel;
      // 32: invokeinterface io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; 1
      // 37: aload 4
      // 39: invokeinterface io/netty/channel/EventLoop.execute (Ljava/lang/Runnable;)V 2
      // 3e: goto 45
      // 41: invokestatic j25.a (Loov;)Loov;
      // 44: athrow
      // 45: return
   }

   public ChannelFuture sendRawPacketFuture(ByteBuf var1) {
      long var2 = a ^ 90678293726200L;
      this.getChannel().pipeline().context(a<"n">(28268, 2253404564717510666L ^ var2)).fireChannelRead(var1);
      return this.getChannel().newSucceededFuture();
   }

   public void sendRawPacketToServer(ByteBuf param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic j25.a J
      // 03: ldc2_w 7526703659257
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: iload 2
      // 0e: ifeq 40
      // 11: aload 0
      // 12: invokevirtual j25.getChannel ()Lio/netty/channel/Channel;
      // 15: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 1a: sipush 5960
      // 1d: ldc2_w 255001468817056301
      // 20: lload 3
      // 21: lxor
      // 22: invokedynamic n (IJ)Ljava/lang/String; bsm=j25.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 27: nop
      // 28: invokeinterface io/netty/channel/ChannelPipeline.context (Ljava/lang/String;)Lio/netty/channel/ChannelHandlerContext; 2
      // 2d: aload 1
      // 2e: invokeinterface io/netty/channel/ChannelHandlerContext.writeAndFlush (Ljava/lang/Object;)Lio/netty/channel/ChannelFuture; 2
      // 33: pop
      // 34: iload 5
      // 36: ifeq 5d
      // 39: goto 40
      // 3c: invokestatic j25.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: invokevirtual j25.getChannel ()Lio/netty/channel/Channel;
      // 44: invokeinterface io/netty/channel/Channel.eventLoop ()Lio/netty/channel/EventLoop; 1
      // 49: aload 0
      // 4a: aload 1
      // 4b: invokedynamic run (Lj25;Lio/netty/buffer/ByteBuf;)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, j25.fh7 (Lio/netty/buffer/ByteBuf;)V, ()V ]
      // 50: invokeinterface io/netty/channel/EventLoop.submit (Ljava/lang/Runnable;)Lio/netty/util/concurrent/Future; 2
      // 55: pop
      // 56: goto 5d
      // 59: invokestatic j25.a (Loov;)Loov;
      // 5c: athrow
      // 5d: return
   }

   private void fh7(ByteBuf var1) {
      long var2 = a ^ 73674805850837L;
      this.getChannel().pipeline().context(a<"n">(14487, 7639109419453695965L ^ var2)).writeAndFlush(var1);
   }

   private void lambda$sendRawPacket$0(ByteBuf var1) {
      long var2 = a ^ 76732971838343L;
      this.getChannel().pipeline().context(a<"n">(4812, 5589385623672960214L ^ var2)).fireChannelRead(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2102809591698606049L, -5087822343644400336L, MethodHandles.lookup().lookupClass()).a(178147376490409L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 134699996280345L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "S$ùÓÐÞìöß²Ë]É¶ÇIö¤Ä±\u007fÅh\u0099\u0018éÒ\u008d\u0098iÏ_m\u0083\u0085\u0096\u009eãy\u008b{g\u0092c\u009a\u001bûiú";
      int var8 = "S$ùÓÐÞìöß²Ë]É¶ÇIö¤Ä±\u007fÅh\u0099\u0018éÒ\u008d\u0098iÏ_m\u0083\u0085\u0096\u009eãy\u008b{g\u0092c\u009a\u001bûiú".length();
      char var5 = 24;
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
                     c = new String[4];
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

                  var6 = "qúÑ·oî\u008fµÎ\u009e1\u001eáºyï\u001f\u001bóÿ3\u0018ÒX6Ôvhå¥öÂ äj\u0096w'\u0007`æ\u000fÑïýT\u0014O\u0019\u001fîÎãnôÝ\u008e\u0086ëþ,\u009a+h\u008e";
                  var8 = "qúÑ·oî\u008fµÎ\u009e1\u001eáºyï\u001f\u001bóÿ3\u0018ÒX6Ôvhå¥öÂ äj\u0096w'\u0007`æ\u000fÑïýT\u0014O\u0019\u001fîÎãnôÝ\u008e\u0086ëþ,\u009a+h\u008e"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23138;
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
            throw new RuntimeException("j25", var10);
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
         throw new RuntimeException("j25" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
