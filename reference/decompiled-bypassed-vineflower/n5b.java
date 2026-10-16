import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
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
import org.apache.logging.log4j.MarkerManager;

public class n5b extends MessageToByteEncoder {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public n5b(qat var1) {
      this.c5v = var1;
   }

   public void f8k(ChannelHandlerContext param1, mz2 param2, ByteBuf param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic n5b.a J
      // 03: ldc2_w 125141335245784
      // 06: lxor
      // 07: lstore 4
      // 09: invokestatic t9d.b ()I
      // 0c: istore 6
      // 0e: aload 1
      // 0f: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 14: getstatic hv0.zix Lio/netty/util/AttributeKey;
      // 17: invokeinterface io/netty/channel/Channel.attr (Lio/netty/util/AttributeKey;)Lio/netty/util/Attribute; 2
      // 1c: invokeinterface io/netty/util/Attribute.get ()Ljava/lang/Object; 1
      // 21: checkcast a0t
      // 24: aload 0
      // 25: getfield n5b.c5v Lqat;
      // 28: aload 2
      // 29: invokevirtual a0t.dhy (Lqat;Lmz2;)Ljava/lang/Integer;
      // 2c: astore 7
      // 2e: getstatic n5b.a91 Lorg/apache/logging/log4j/Logger;
      // 31: iload 6
      // 33: ifeq 4f
      // 36: invokeinterface org/apache/logging/log4j/Logger.isDebugEnabled ()Z 1
      // 3b: ifeq 8f
      // 3e: goto 45
      // 41: invokestatic n5b.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: getstatic n5b.a91 Lorg/apache/logging/log4j/Logger;
      // 48: goto 4f
      // 4b: invokestatic n5b.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e: athrow
      // 4f: getstatic n5b.ygg Lorg/apache/logging/log4j/Marker;
      // 52: sipush 17960
      // 55: ldc2_w 7814388357087103924
      // 58: lload 4
      // 5a: lxor
      // 5b: invokedynamic m (IJ)Ljava/lang/String; bsm=n5b.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 60: nop
      // 61: bipush 3
      // 62: anewarray 73
      // 65: dup
      // 66: bipush 0
      // 67: aload 1
      // 68: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 6d: getstatic hv0.zix Lio/netty/util/AttributeKey;
      // 70: invokeinterface io/netty/channel/Channel.attr (Lio/netty/util/AttributeKey;)Lio/netty/util/Attribute; 2
      // 75: invokeinterface io/netty/util/Attribute.get ()Ljava/lang/Object; 1
      // 7a: aastore
      // 7b: dup
      // 7c: bipush 1
      // 7d: aload 7
      // 7f: aastore
      // 80: dup
      // 81: bipush 2
      // 82: aload 2
      // 83: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 86: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 89: aastore
      // 8a: invokeinterface org/apache/logging/log4j/Logger.debug (Lorg/apache/logging/log4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V 4
      // 8f: aload 7
      // 91: ifnonnull af
      // 94: new java/io/IOException
      // 97: dup
      // 98: sipush 11084
      // 9b: ldc2_w 4500328215127713490
      // 9e: lload 4
      // a0: lxor
      // a1: invokedynamic m (IJ)Ljava/lang/String; bsm=n5b.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a6: nop
      // a7: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // aa: athrow
      // ab: invokestatic n5b.a (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: new nfj
      // b2: dup
      // b3: aload 3
      // b4: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // b7: astore 8
      // b9: aload 8
      // bb: aload 7
      // bd: invokevirtual java/lang/Integer.intValue ()I
      // c0: invokevirtual nfj.tao (I)Lnfj;
      // c3: pop
      // c4: aload 2
      // c5: aload 8
      // c7: invokeinterface mz2.ddd (Lnfj;)V 2
      // cc: goto db
      // cf: astore 9
      // d1: getstatic n5b.a91 Lorg/apache/logging/log4j/Logger;
      // d4: aload 9
      // d6: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/Object;)V 2
      // db: return
   }

   public void encode(ChannelHandlerContext var1, Object var2, ByteBuf var3) {
      this.f8k(var1, (mz2)var2, var3);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3545471961112445379L, -6319373548444961232L, MethodHandles.lookup().lookupClass()).a(202415362665243L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 19565104976430L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "¦ª\\\u0005#?ë!;p4\u0089\u0090\u0006\u0003N\u0004¾¦ÿÿ\u001aú2éf\bh\u000fÐS\u0004Ní\u000bLûhsÉÏ»á\u0006\u0082?\u0097ú\u0018)\u00ad½Úá\u0014WK\u0083\u0015Õå(\u0083ø =.,´\u0017üÖ\fùúlèÄAx\u009f-R\u0089«\n\u001d2I\b\u001bH\u009fP\u0080ª\u001d\u0018°ç®Õµ\u0006A\u001aæ_Âv-\u0096\u0010\u0090Qxe\u0013À3Û\u0099";
      int var6 = "¦ª\\\u0005#?ë!;p4\u0089\u0090\u0006\u0003N\u0004¾¦ÿÿ\u001aú2éf\bh\u000fÐS\u0004Ní\u000bLûhsÉÏ»á\u0006\u0082?\u0097ú\u0018)\u00ad½Úá\u0014WK\u0083\u0015Õå(\u0083ø =.,´\u0017üÖ\fùúlèÄAx\u009f-R\u0089«\n\u001d2I\b\u001bH\u009fP\u0080ª\u001d\u0018°ç®Õµ\u0006A\u001aæ_Âv-\u0096\u0010\u0090Qxe\u0013À3Û\u0099"
         .length();
      char var3 = '@';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = a(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            b = var7;
            c = new String[3];
            a91 = LogManager.getLogger();
            ygg = MarkerManager.getMarker(a<"m">(9924, 8067880503596432045L ^ var9), hv0.set);
            return;
         }

         var3 = var4.charAt(var2);
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28612;
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
            throw new RuntimeException("n5b", var10);
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
         throw new RuntimeException("n5b" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
