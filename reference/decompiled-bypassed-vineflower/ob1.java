import com.google.common.collect.Lists;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ob1 {
   private static final Logger w65;
   public static final zrl _hg;
   public static final zrl xnf;
   public static final zrl jaz;
   private final vr1 fhb;
   public volatile boolean wnw;
   private final List p3e = Collections.synchronizedList(Lists.newArrayList());
   private final List yt_ = Collections.synchronizedList(Lists.newArrayList());
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ob1(vr1 var1) {
      this.fhb = var1;
      this.wnw = true;
   }

   public void vzp(InetAddress var1, int var2) {
      long var3 = a ^ 36306141159520L;
      int var5 = t9d.c();
      synchronized (this.p3e) {
         Class<EpollServerSocketChannel> var7;
         zrl var8;
         label30: {
            label29: {
               boolean var10000 = Epoll.isAvailable();
               if (var5 == 0) {
                  try {
                     if (!var10000) {
                        break label29;
                     }

                     var10000 = this.fhb.qbx();
                  } catch (oov var10) {
                     throw a(var10);
                  }
               }

               if (var10000) {
                  var7 = EpollServerSocketChannel.class;
                  var8 = xnf;
                  w65.info(a<"d">(2898, 6264216596193603190L ^ var3));
                  if (var5 == 0) {
                     break label30;
                  }
               }
            }

            var7 = NioServerSocketChannel.class;
            var8 = _hg;
            w65.info(a<"d">(28353, 7033393452128996324L ^ var3));
         }

         this.p3e
            .add(
               ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(var7))
                     .childHandler(new ob1$4(this))
                     .group((EventLoopGroup)var8.qyc())
                     .localAddress(var1, var2))
                  .bind()
                  .syncUninterruptibly()
            );
      }
   }

   public SocketAddress fc5() {
      ChannelFuture var1;
      synchronized (this.p3e) {
         var1 = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class))
               .childHandler(new ob1$5(this))
               .group((EventLoopGroup)_hg.qyc())
               .localAddress(LocalAddress.ANY))
            .bind()
            .syncUninterruptibly();
         this.p3e.add(var1);
      }

      return var1.channel().localAddress();
   }

   public void vxg() {
      long var1 = a ^ 108167910445297L;
      this.wnw = false;
      int var10000 = t9d.c();
      Iterator var4 = this.p3e.iterator();
      int var3 = var10000;

      while (var4.hasNext()) {
         ChannelFuture var5 = (ChannelFuture)var4.next();

         try {
            var5.channel().close().sync();
         } catch (InterruptedException var7) {
            w65.error(a<"d">(13378, 5242393249854169588L ^ var1));
         }

         if (var3 != 0) {
            break;
         }
      }
   }

   public void vsw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ob1.a J
      // 003: ldc2_w 126989150560423
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield ob1.yt_ Ljava/util/List;
      // 010: dup
      // 011: astore 4
      // 013: monitorenter
      // 014: aload 0
      // 015: getfield ob1.yt_ Ljava/util/List;
      // 018: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 01d: astore 5
      // 01f: aload 5
      // 021: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 026: ifeq 15d
      // 029: aload 5
      // 02b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 030: checkcast hv0
      // 033: astore 6
      // 035: iload 3
      // 036: ifne 160
      // 039: aload 6
      // 03b: invokevirtual hv0.qka ()Z
      // 03e: iload 3
      // 03f: ifne 06a
      // 042: goto 049
      // 045: invokestatic ob1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 048: athrow
      // 049: ifne 159
      // 04c: goto 053
      // 04f: invokestatic ob1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 052: athrow
      // 053: aload 6
      // 055: iload 3
      // 056: ifne 086
      // 059: goto 060
      // 05c: invokestatic ob1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 05f: athrow
      // 060: invokevirtual hv0.jy3 ()Z
      // 063: goto 06a
      // 066: invokestatic ob1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 069: athrow
      // 06a: ifne 084
      // 06d: aload 5
      // 06f: invokeinterface java/util/Iterator.remove ()V 1
      // 074: aload 6
      // 076: invokevirtual hv0.kh8 ()V
      // 079: iload 3
      // 07a: ifeq 159
      // 07d: goto 084
      // 080: invokestatic ob1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 083: athrow
      // 084: aload 6
      // 086: invokevirtual hv0.v2s ()V
      // 089: goto 159
      // 08c: astore 7
      // 08e: iload 3
      // 08f: ifne 11f
      // 092: aload 6
      // 094: invokevirtual hv0.mwg ()Z
      // 097: ifeq 0f2
      // 09a: goto 0a1
      // 09d: invokestatic ob1.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0a0: athrow
      // 0a1: aload 7
      // 0a3: sipush 28182
      // 0a6: ldc2_w 1161247647010589680
      // 0a9: lload 1
      // 0aa: lxor
      // 0ab: invokedynamic d (IJ)Ljava/lang/String; bsm=ob1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b0: nop
      // 0b1: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 0b4: astore 8
      // 0b6: aload 8
      // 0b8: sipush 25648
      // 0bb: ldc2_w 9222708302680588759
      // 0be: lload 1
      // 0bf: lxor
      // 0c0: invokedynamic d (IJ)Ljava/lang/String; bsm=ob1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c5: nop
      // 0c6: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 0c9: astore 9
      // 0cb: aload 9
      // 0cd: sipush 21312
      // 0d0: ldc2_w 7086573397806528161
      // 0d3: lload 1
      // 0d4: lxor
      // 0d5: invokedynamic d (IJ)Ljava/lang/String; bsm=ob1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0da: nop
      // 0db: new ob1$6
      // 0de: dup
      // 0df: aload 0
      // 0e0: aload 6
      // 0e2: invokespecial ob1$6.<init> (Lob1;Lhv0;)V
      // 0e5: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 0e8: new oov
      // 0eb: dup
      // 0ec: aload 8
      // 0ee: invokespecial oov.<init> (Le1i;)V
      // 0f1: athrow
      // 0f2: getstatic ob1.w65 Lorg/apache/logging/log4j/Logger;
      // 0f5: new java/lang/StringBuilder
      // 0f8: dup
      // 0f9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0fc: sipush 13355
      // 0ff: ldc2_w 169321713956606414
      // 102: lload 1
      // 103: lxor
      // 104: invokedynamic d (IJ)Ljava/lang/String; bsm=ob1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 109: nop
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10d: aload 6
      // 10f: invokevirtual hv0.pz4 ()Ljava/net/SocketAddress;
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 115: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 118: aload 7
      // 11a: invokeinterface org/apache/logging/log4j/Logger.warn (Ljava/lang/String;Ljava/lang/Throwable;)V 3
      // 11f: new tao
      // 122: dup
      // 123: sipush 31763
      // 126: ldc2_w 4247196158512568823
      // 129: lload 1
      // 12a: lxor
      // 12b: invokedynamic d (IJ)Ljava/lang/String; bsm=ob1.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 130: nop
      // 131: invokespecial tao.<init> (Ljava/lang/String;)V
      // 134: astore 8
      // 136: aload 6
      // 138: new net/minecraft/network/play/server/S40PacketDisconnect
      // 13b: dup
      // 13c: aload 8
      // 13e: invokespecial net/minecraft/network/play/server/S40PacketDisconnect.<init> (Lekw;)V
      // 141: new ob1$7
      // 144: dup
      // 145: aload 0
      // 146: aload 6
      // 148: aload 8
      // 14a: invokespecial ob1$7.<init> (Lob1;Lhv0;Ltao;)V
      // 14d: bipush 0
      // 14e: anewarray 274
      // 151: invokevirtual hv0.pl0 (Lmz2;Lio/netty/util/concurrent/GenericFutureListener;[Lio/netty/util/concurrent/GenericFutureListener;)V
      // 154: aload 6
      // 156: invokevirtual hv0.mzp ()V
      // 159: iload 3
      // 15a: ifeq 01f
      // 15d: aload 4
      // 15f: monitorexit
      // 160: goto 16b
      // 163: astore 10
      // 165: aload 4
      // 167: monitorexit
      // 168: aload 10
      // 16a: athrow
      // 16b: return
   }

   public vr1 q65() {
      return this.fhb;
   }

   public static List jyp(ob1 var0) {
      return var0.yt_;
   }

   public static vr1 rpd(ob1 var0) {
      return var0.fhb;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1474772657690015231L, -904083693616915693L, MethodHandles.lookup().lookupClass()).a(160828293994059L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 33784949228586L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "xý(%ú\u0095\u0097\u0018Ù«ÍùK5t\u008c\u009e´ëZOÿ\u0019\u0007J[Ov½]Ö\u0098«ú\u0081ÌpÞ\u001cQ,O|;À\u0016ªL~æ\u008eô\u008d\u0019e\u00970>~ÁvËHé¨äöÃC\rå~°\u0014_SmßIÅ\u0089J7<i·O$ùæ²k\u008ckSRùÛ\u0019Ù:ò½\u0004ì(o\u0089z1Ô231D\u0090\u0007\u000b\u0011Ð\u0084P\u0092ÉëÝÇ38¦ãR`¬I[a&?g¬ä$´!X8!¯ÿ\u0014\u0085U(\u009dä\t\u0086LÚ§ü ¨Ð¨ïå£\u0016Æ\u0093\u0000\u0091Ã>V9\u0089\u0096\u008a\u0083èjÓ¢ª¸r\u0091\u0003ë'x¿ÄüG\u0014\u0012©\u007fë\u0018\u0007Õ:+¶âÓ\u0012½\u007f\u007fö~\u0000ÓT?[\u008exTdß5@\u0080\u009ev5\u001b;!¬IÅ>eaE¼\u0012¥\u0006\u0010£\u0096`*\u0001¸E\u0089 ·×D\u008e»Ù¡rÌ\rpÊ2ô7×\u0098\fÎ\u0088lj;\u007f/\u008cI\u0098KÙ\u0006#Ï;öW";
      int var8 = "xý(%ú\u0095\u0097\u0018Ù«ÍùK5t\u008c\u009e´ëZOÿ\u0019\u0007J[Ov½]Ö\u0098«ú\u0081ÌpÞ\u001cQ,O|;À\u0016ªL~æ\u008eô\u008d\u0019e\u00970>~ÁvËHé¨äöÃC\rå~°\u0014_SmßIÅ\u0089J7<i·O$ùæ²k\u008ckSRùÛ\u0019Ù:ò½\u0004ì(o\u0089z1Ô231D\u0090\u0007\u000b\u0011Ð\u0084P\u0092ÉëÝÇ38¦ãR`¬I[a&?g¬ä$´!X8!¯ÿ\u0014\u0085U(\u009dä\t\u0086LÚ§ü ¨Ð¨ïå£\u0016Æ\u0093\u0000\u0091Ã>V9\u0089\u0096\u008a\u0083èjÓ¢ª¸r\u0091\u0003ë'x¿ÄüG\u0014\u0012©\u007fë\u0018\u0007Õ:+¶âÓ\u0012½\u007f\u007fö~\u0000ÓT?[\u008exTdß5@\u0080\u009ev5\u001b;!¬IÅ>eaE¼\u0012¥\u0006\u0010£\u0096`*\u0001¸E\u0089 ·×D\u008e»Ù¡rÌ\rpÊ2ô7×\u0098\fÎ\u0088lj;\u007f/\u008cI\u0098KÙ\u0006#Ï;öW"
         .length();
      char var5 = '8';
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
                     c = new String[8];
                     w65 = LogManager.getLogger();
                     _hg = new ob1$1();
                     xnf = new ob1$2();
                     jaz = new ob1$3();
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

                  var6 = "\u0092}¢Ãª38\u0002\u0093Rj\\ùÍ×üçø\u009cYxPÛã¢Üì\u0085\u0084Ã\u0018¾!\u0013\u0004÷0Û¬´~O\u0002À-Ä\u0003\u00940û-¾\u008e1Ãô\u009cWý8¶o#KéÊGÍÑÎuÊÙ\u008d+Ó«ÒÁc¥\u009c<Gãqõ\u000f{5\bNÕYvD\u000e";
                  var8 = "\u0092}¢Ãª38\u0002\u0093Rj\\ùÍ×üçø\u009cYxPÛã¢Üì\u0085\u0084Ã\u0018¾!\u0013\u0004÷0Û¬´~O\u0002À-Ä\u0003\u00940û-¾\u008e1Ãô\u009cWý8¶o#KéÊGÍÑÎuÊÙ\u008d+Ó«ÒÁc¥\u009c<Gãqõ\u000f{5\bNÕYvD\u000e"
                     .length();
                  var5 = '0';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5704;
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
            throw new RuntimeException("ob1", var10);
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
         throw new RuntimeException("ob1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
