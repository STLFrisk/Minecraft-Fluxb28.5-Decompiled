import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelInitializer;
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

public final class hv0$5 extends ChannelInitializer {
   public final hv0 i7u;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public hv0$5(hv0 var1) {
      this.i7u = var1;
   }

   public void initChannel(Channel param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic hv0$5.a J
      // 003: ldc2_w 46911585894142
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: invokeinterface io/netty/channel/Channel.config ()Lio/netty/channel/ChannelConfig; 1
      // 013: getstatic io/netty/channel/ChannelOption.TCP_NODELAY Lio/netty/channel/ChannelOption;
      // 016: bipush 1
      // 017: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 01a: invokeinterface io/netty/channel/ChannelConfig.setOption (Lio/netty/channel/ChannelOption;Ljava/lang/Object;)Z 3
      // 01f: pop
      // 020: goto 025
      // 023: astore 5
      // 025: aload 1
      // 026: iload 4
      // 028: ifne 106
      // 02b: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 030: sipush 10761
      // 033: ldc2_w 620011874277227637
      // 036: lload 2
      // 037: lxor
      // 038: invokedynamic m (IJ)Ljava/lang/String; bsm=hv0$5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 03d: nop
      // 03e: new io/netty/handler/timeout/ReadTimeoutHandler
      // 041: dup
      // 042: bipush 30
      // 044: invokespecial io/netty/handler/timeout/ReadTimeoutHandler.<init> (I)V
      // 047: invokeinterface io/netty/channel/ChannelPipeline.addLast (Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 3
      // 04c: sipush 17748
      // 04f: ldc2_w 5980832287527342889
      // 052: lload 2
      // 053: lxor
      // 054: invokedynamic m (IJ)Ljava/lang/String; bsm=hv0$5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 059: nop
      // 05a: new _bo
      // 05d: dup
      // 05e: invokespecial _bo.<init> ()V
      // 061: invokeinterface io/netty/channel/ChannelPipeline.addLast (Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 3
      // 066: sipush 16281
      // 069: ldc2_w 4473461074725431777
      // 06c: lload 2
      // 06d: lxor
      // 06e: invokedynamic m (IJ)Ljava/lang/String; bsm=hv0$5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 073: nop
      // 074: new lte
      // 077: dup
      // 078: getstatic qat.yu7 Lqat;
      // 07b: invokespecial lte.<init> (Lqat;)V
      // 07e: invokeinterface io/netty/channel/ChannelPipeline.addLast (Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 3
      // 083: sipush 31309
      // 086: ldc2_w 966425411554487347
      // 089: lload 2
      // 08a: lxor
      // 08b: invokedynamic m (IJ)Ljava/lang/String; bsm=hv0$5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 090: nop
      // 091: new ki6
      // 094: dup
      // 095: invokespecial ki6.<init> ()V
      // 098: invokeinterface io/netty/channel/ChannelPipeline.addLast (Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 3
      // 09d: sipush 2532
      // 0a0: ldc2_w 1500656526633328539
      // 0a3: lload 2
      // 0a4: lxor
      // 0a5: invokedynamic m (IJ)Ljava/lang/String; bsm=hv0$5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0aa: nop
      // 0ab: new n5b
      // 0ae: dup
      // 0af: getstatic qat.qv9 Lqat;
      // 0b2: invokespecial n5b.<init> (Lqat;)V
      // 0b5: invokeinterface io/netty/channel/ChannelPipeline.addLast (Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 3
      // 0ba: sipush 8297
      // 0bd: ldc2_w 4798299493819872784
      // 0c0: lload 2
      // 0c1: lxor
      // 0c2: invokedynamic m (IJ)Ljava/lang/String; bsm=hv0$5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: nop
      // 0c8: aload 0
      // 0c9: getfield hv0$5.i7u Lhv0;
      // 0cc: invokeinterface io/netty/channel/ChannelPipeline.addLast (Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 3
      // 0d1: pop
      // 0d2: getstatic isValidTarget.hjm Ljava/net/InetSocketAddress;
      // 0d5: ifnull 105
      // 0d8: goto 0df
      // 0db: invokestatic hv0$5.a (Lio/netty/channel/ChannelException;)Lio/netty/channel/ChannelException;
      // 0de: athrow
      // 0df: aload 1
      // 0e0: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 0e5: bipush 1
      // 0e6: anewarray 98
      // 0e9: dup
      // 0ea: bipush 0
      // 0eb: new io/netty/handler/proxy/Socks5ProxyHandler
      // 0ee: dup
      // 0ef: getstatic isValidTarget.hjm Ljava/net/InetSocketAddress;
      // 0f2: aconst_null
      // 0f3: aconst_null
      // 0f4: invokespecial io/netty/handler/proxy/Socks5ProxyHandler.<init> (Ljava/net/SocketAddress;Ljava/lang/String;Ljava/lang/String;)V
      // 0f7: aastore
      // 0f8: invokeinterface io/netty/channel/ChannelPipeline.addFirst ([Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 2
      // 0fd: pop
      // 0fe: goto 105
      // 101: invokestatic hv0$5.a (Lio/netty/channel/ChannelException;)Lio/netty/channel/ChannelException;
      // 104: athrow
      // 105: aload 1
      // 106: instanceof io/netty/channel/socket/SocketChannel
      // 109: ifeq 180
      // 10c: new j25
      // 10f: dup
      // 110: aload 1
      // 111: invokespecial j25.<init> (Lio/netty/channel/Channel;)V
      // 114: astore 5
      // 116: new us/myles/ViaVersion/api/protocol/ProtocolPipeline
      // 119: dup
      // 11a: aload 5
      // 11c: invokespecial us/myles/ViaVersion/api/protocol/ProtocolPipeline.<init> (Lus/myles/ViaVersion/api/data/UserConnection;)V
      // 11f: getstatic zj4.q95 Lzj4;
      // 122: invokevirtual us/myles/ViaVersion/api/protocol/ProtocolPipeline.add (Lus/myles/ViaVersion/api/protocol/Protocol;)V
      // 125: aload 1
      // 126: invokeinterface io/netty/channel/Channel.pipeline ()Lio/netty/channel/ChannelPipeline; 1
      // 12b: sipush 12724
      // 12e: ldc2_w 7063346289190070212
      // 131: lload 2
      // 132: lxor
      // 133: invokedynamic m (IJ)Ljava/lang/String; bsm=hv0$5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 138: nop
      // 139: sipush 21048
      // 13c: ldc2_w 2177334081039467587
      // 13f: lload 2
      // 140: lxor
      // 141: invokedynamic m (IJ)Ljava/lang/String; bsm=hv0$5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 146: nop
      // 147: new qed
      // 14a: dup
      // 14b: aload 5
      // 14d: invokespecial qed.<init> (Lus/myles/ViaVersion/api/data/UserConnection;)V
      // 150: invokeinterface io/netty/channel/ChannelPipeline.addBefore (Ljava/lang/String;Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 4
      // 155: sipush 3355
      // 158: ldc2_w 4859592196305345377
      // 15b: lload 2
      // 15c: lxor
      // 15d: invokedynamic m (IJ)Ljava/lang/String; bsm=hv0$5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 162: nop
      // 163: sipush 6203
      // 166: ldc2_w 3626165619270766154
      // 169: lload 2
      // 16a: lxor
      // 16b: invokedynamic m (IJ)Ljava/lang/String; bsm=hv0$5.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 170: nop
      // 171: new ilu
      // 174: dup
      // 175: aload 5
      // 177: invokespecial ilu.<init> (Lus/myles/ViaVersion/api/data/UserConnection;)V
      // 17a: invokeinterface io/netty/channel/ChannelPipeline.addBefore (Ljava/lang/String;Ljava/lang/String;Lio/netty/channel/ChannelHandler;)Lio/netty/channel/ChannelPipeline; 4
      // 17f: pop
      // 180: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(402776382510600340L, -9220721972833990390L, MethodHandles.lookup().lookupClass()).a(59776019026222L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 92874670375343L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "§\u001f~Èhû\u008b\u009e\u0003\u0097>×ÞQ\u001fX«n¦¼ÐÒ\b\u001d\u0010Ê-\u0088tJä<4hØï\u0088^S\u0095\b\u0018¯ä²²2\u0087\u000bþq\u00ad+&\u001dVÙ\b²àÀ_LÔkØ\u0010\u0082¥ä6DA#@\u0001i\"\tß\u0083U¸\u0018Ô\u0088\u0081b\u0018x\u0011G÷¦°\u001eëD\u008cØÍ¯\\Â¿Ûl.\u0010\u0097Ð'æ\u0003\u00adÐ\rMOçÏIËÜ\u008c\u0010\u001a\b\u0004#\u000fá^,æ\"£ønÔØj\u0018ñú\u009d4ø,q*ÅY\u0087\"VZÞ\u00887\u0086DÕÓ,\u0098\u0016";
      int var8 = "§\u001f~Èhû\u008b\u009e\u0003\u0097>×ÞQ\u001fX«n¦¼ÐÒ\b\u001d\u0010Ê-\u0088tJä<4hØï\u0088^S\u0095\b\u0018¯ä²²2\u0087\u000bþq\u00ad+&\u001dVÙ\b²àÀ_LÔkØ\u0010\u0082¥ä6DA#@\u0001i\"\tß\u0083U¸\u0018Ô\u0088\u0081b\u0018x\u0011G÷¦°\u001eëD\u008cØÍ¯\\Â¿Ûl.\u0010\u0097Ð'æ\u0003\u00adÐ\rMOçÏIËÜ\u008c\u0010\u001a\b\u0004#\u000fá^,æ\"£ønÔØj\u0018ñú\u009d4ø,q*ÅY\u0087\"VZÞ\u00887\u0086DÕÓ,\u0098\u0016"
         .length();
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
                     c = new String[10];
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

                  var6 = "p\u0091\u0094¦òÎïé§\u0015<ïQÏ:8îc45ØÑ ¯IáÔ\u0096ÿ\u0003d\u0018\u0010j.\u0017å×Ô?\u0017p\u001c $/ÙÑ4";
                  var8 = "p\u0091\u0094¦òÎïé§\u0015<ïQÏ:8îc45ØÑ ¯IáÔ\u0096ÿ\u0003d\u0018\u0010j.\u0017å×Ô?\u0017p\u001c $/ÙÑ4".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static ChannelException a(ChannelException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7707;
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
            throw new RuntimeException("hv0$5", var10);
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
         throw new RuntimeException("hv0$5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
