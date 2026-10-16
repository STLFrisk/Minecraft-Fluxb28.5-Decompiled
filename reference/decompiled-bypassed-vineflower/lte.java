import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.MarkerManager;

public class lte extends ByteToMessageDecoder {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public lte(qat var1) {
      this.va0 = var1;
   }

   public void decode(ChannelHandlerContext param1, ByteBuf param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic lte.a J
      // 003: ldc2_w 78416931588053
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.c ()I
      // 00c: istore 6
      // 00e: aload 2
      // 00f: invokevirtual io/netty/buffer/ByteBuf.readableBytes ()I
      // 012: ifeq 1a6
      // 015: new nfj
      // 018: dup
      // 019: aload 2
      // 01a: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 01d: astore 7
      // 01f: aload 7
      // 021: invokevirtual nfj.gux ()I
      // 024: istore 8
      // 026: aload 1
      // 027: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 02c: getstatic hv0.zix Lio/netty/util/AttributeKey;
      // 02f: invokeinterface io/netty/channel/Channel.attr (Lio/netty/util/AttributeKey;)Lio/netty/util/Attribute; 2
      // 034: invokeinterface io/netty/util/Attribute.get ()Ljava/lang/Object; 1
      // 039: checkcast a0t
      // 03c: aload 0
      // 03d: getfield lte.va0 Lqat;
      // 040: iload 8
      // 042: invokevirtual a0t.pz2 (Lqat;I)Lmz2;
      // 045: astore 9
      // 047: aload 9
      // 049: iload 6
      // 04b: ifne 087
      // 04e: ifnonnull 085
      // 051: goto 058
      // 054: invokestatic lte.a (Loov;)Loov;
      // 057: athrow
      // 058: new java/io/IOException
      // 05b: dup
      // 05c: new java/lang/StringBuilder
      // 05f: dup
      // 060: invokespecial java/lang/StringBuilder.<init> ()V
      // 063: sipush 1770
      // 066: ldc2_w 9007047403666396890
      // 069: lload 4
      // 06b: lxor
      // 06c: invokedynamic e (IJ)Ljava/lang/String; bsm=lte.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 071: nop
      // 072: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 075: iload 8
      // 077: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 07a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07d: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 080: athrow
      // 081: invokestatic lte.a (Loov;)Loov;
      // 084: athrow
      // 085: aload 9
      // 087: aload 7
      // 089: invokeinterface mz2.ajj (Lnfj;)V 2
      // 08e: aload 7
      // 090: invokevirtual nfj.readableBytes ()I
      // 093: iload 6
      // 095: ifne 15c
      // 098: ifle 13f
      // 09b: goto 0a2
      // 09e: invokestatic lte.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: new java/io/IOException
      // 0a5: dup
      // 0a6: new java/lang/StringBuilder
      // 0a9: dup
      // 0aa: invokespecial java/lang/StringBuilder.<init> ()V
      // 0ad: sipush 18960
      // 0b0: ldc2_w 8613816652237183523
      // 0b3: lload 4
      // 0b5: lxor
      // 0b6: invokedynamic e (IJ)Ljava/lang/String; bsm=lte.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: nop
      // 0bc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0bf: aload 1
      // 0c0: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 0c5: getstatic hv0.zix Lio/netty/util/AttributeKey;
      // 0c8: invokeinterface io/netty/channel/Channel.attr (Lio/netty/util/AttributeKey;)Lio/netty/util/Attribute; 2
      // 0cd: invokeinterface io/netty/util/Attribute.get ()Ljava/lang/Object; 1
      // 0d2: checkcast a0t
      // 0d5: invokevirtual a0t.jhj ()I
      // 0d8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0db: ldc "/"
      // 0dd: nop
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e1: iload 8
      // 0e3: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0e6: sipush 7658
      // 0e9: ldc2_w 5999111700021530072
      // 0ec: lload 4
      // 0ee: lxor
      // 0ef: invokedynamic e (IJ)Ljava/lang/String; bsm=lte.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f4: nop
      // 0f5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0f8: aload 9
      // 0fa: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0fd: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 100: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 103: sipush 31622
      // 106: ldc2_w 6375521486413409200
      // 109: lload 4
      // 10b: lxor
      // 10c: invokedynamic e (IJ)Ljava/lang/String; bsm=lte.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: nop
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: aload 7
      // 117: invokevirtual nfj.readableBytes ()I
      // 11a: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 11d: sipush 3520
      // 120: ldc2_w 7067774980728217073
      // 123: lload 4
      // 125: lxor
      // 126: invokedynamic e (IJ)Ljava/lang/String; bsm=lte.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12b: nop
      // 12c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12f: iload 8
      // 131: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 134: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 137: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 13a: athrow
      // 13b: invokestatic lte.a (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 3
      // 140: aload 9
      // 142: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 147: pop
      // 148: getstatic lte.l3b Lorg/apache/logging/log4j/Logger;
      // 14b: iload 6
      // 14d: ifne 162
      // 150: invokeinterface org/apache/logging/log4j/Logger.isDebugEnabled ()Z 1
      // 155: goto 15c
      // 158: invokestatic lte.a (Loov;)Loov;
      // 15b: athrow
      // 15c: ifeq 1a6
      // 15f: getstatic lte.l3b Lorg/apache/logging/log4j/Logger;
      // 162: getstatic lte.a86 Lorg/apache/logging/log4j/Marker;
      // 165: sipush 4832
      // 168: ldc2_w 8354838849595654871
      // 16b: lload 4
      // 16d: lxor
      // 16e: invokedynamic e (IJ)Ljava/lang/String; bsm=lte.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 173: nop
      // 174: bipush 3
      // 175: anewarray 107
      // 178: dup
      // 179: bipush 0
      // 17a: aload 1
      // 17b: invokeinterface io/netty/channel/ChannelHandlerContext.channel ()Lio/netty/channel/Channel; 1
      // 180: getstatic hv0.zix Lio/netty/util/AttributeKey;
      // 183: invokeinterface io/netty/channel/Channel.attr (Lio/netty/util/AttributeKey;)Lio/netty/util/Attribute; 2
      // 188: invokeinterface io/netty/util/Attribute.get ()Ljava/lang/Object; 1
      // 18d: aastore
      // 18e: dup
      // 18f: bipush 1
      // 190: iload 8
      // 192: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 195: aastore
      // 196: dup
      // 197: bipush 2
      // 198: aload 9
      // 19a: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 19d: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 1a0: aastore
      // 1a1: invokeinterface org/apache/logging/log4j/Logger.debug (Lorg/apache/logging/log4j/Marker;Ljava/lang/String;[Ljava/lang/Object;)V 4
      // 1a6: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2169308947792027030L, -6365669998013164975L, MethodHandles.lookup().lookupClass()).a(34585272354961L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 62386536747660L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "\u0006Ã.i\u000fÞ;W\u0087Ò\nÞãùîw\u0010\u0092å9N\u0090<K\u0005\u009cÜû§\u008b}W4@d\u000b\u0014\u0081.º Û\u0086\u0086³~\u0010Ìq\u008f}cî°v=\u0019«©\u0006`#Ï¤\rb~'K\u0018\u008cId\b}\b\u009dW\u0016ë\u00ad¡ì\u0081!û\u008c0þ«®s/\u0099@o9K\u0018\u0003ßîø¶\u0094IG?ÁÇT3\u0090\u0097¿\u0005\u001bE\u009cÅ9ré\u0018aH»yyì¾\u000e\u0000»\u000bBèZÇ\u0003>ØZñEh}1";
      int var6 = "\u0006Ã.i\u000fÞ;W\u0087Ò\nÞãùîw\u0010\u0092å9N\u0090<K\u0005\u009cÜû§\u008b}W4@d\u000b\u0014\u0081.º Û\u0086\u0086³~\u0010Ìq\u008f}cî°v=\u0019«©\u0006`#Ï¤\rb~'K\u0018\u008cId\b}\b\u009dW\u0016ë\u00ad¡ì\u0081!û\u008c0þ«®s/\u0099@o9K\u0018\u0003ßîø¶\u0094IG?ÁÇT3\u0090\u0097¿\u0005\u001bE\u009cÅ9ré\u0018aH»yyì¾\u000e\u0000»\u000bBèZÇ\u0003>ØZñEh}1"
         .length();
      char var3 = 16;
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
                     c = new String[7];
                     l3b = LogManager.getLogger();
                     a86 = MarkerManager.getMarker(a<"e">(24702, 5134350206979351826L ^ var9), hv0.set);
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

                  var4 = "ØÜÌ\u0086nv\u0005\u0012¦\u0003²\u0018Ø\u008d6Iyk\u0085=\u0088ç¢X±Qöêi\u008dSôò\u000f\u000b\u008e(\u0012d<ÓK±\u0013\u0096\u0091ß«\u0019\u009b¸z¨·q*Oº\u0088<{ÓÎÀú\u0099\\°\"höy ï\u000b§ð!ª?\\¿d\u0096e£Ç;4[\u0010>\u0091NÝw}F\u0089Q+\fÜÁ\n";
                  var6 = "ØÜÌ\u0086nv\u0005\u0012¦\u0003²\u0018Ø\u008d6Iyk\u0085=\u0088ç¢X±Qöêi\u008dSôò\u000f\u000b\u008e(\u0012d<ÓK±\u0013\u0096\u0091ß«\u0019\u009b¸z¨·q*Oº\u0088<{ÓÎÀú\u0099\\°\"höy ï\u000b§ð!ª?\\¿d\u0096e£Ç;4[\u0010>\u0091NÝw}F\u0089Q+\fÜÁ\n"
                     .length();
                  var3 = 'H';
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32098;
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
            throw new RuntimeException("lte", var10);
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
         throw new RuntimeException("lte" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
