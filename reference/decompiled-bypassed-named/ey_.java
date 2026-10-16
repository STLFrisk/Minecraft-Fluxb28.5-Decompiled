import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class ey_ extends ByteToMessageDecoder {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public ey_(int var1) {
      this.vs6 = var1;
      this.ziy = new Inflater();
   }

   public void decode(ChannelHandlerContext param1, ByteBuf param2, List param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ey_.a J
      // 003: ldc2_w 8951850758733
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic OpaquePredicate.b ()I
      // 00c: istore 6
      // 00e: aload 2
      // 00f: invokevirtual io/netty/buffer/ByteBuf.readableBytes ()I
      // 012: ifeq 14c
      // 015: new nfj
      // 018: dup
      // 019: aload 2
      // 01a: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 01d: astore 7
      // 01f: aload 7
      // 021: invokevirtual nfj.gux ()I
      // 024: istore 8
      // 026: iload 8
      // 028: iload 6
      // 02a: ifeq 05d
      // 02d: ifne 054
      // 030: goto 037
      // 033: invokestatic ey_.a (Lio/netty/handler/codec/DecoderException;)Lio/netty/handler/codec/DecoderException;
      // 036: athrow
      // 037: aload 3
      // 038: aload 7
      // 03a: aload 7
      // 03c: invokevirtual nfj.readableBytes ()I
      // 03f: invokevirtual nfj.readBytes (I)Lio/netty/buffer/ByteBuf;
      // 042: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 047: pop
      // 048: iload 6
      // 04a: ifne 14c
      // 04d: goto 054
      // 050: invokestatic ey_.a (Lio/netty/handler/codec/DecoderException;)Lio/netty/handler/codec/DecoderException;
      // 053: athrow
      // 054: iload 8
      // 056: goto 05d
      // 059: invokestatic ey_.a (Lio/netty/handler/codec/DecoderException;)Lio/netty/handler/codec/DecoderException;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getfield ey_.vs6 I
      // 061: iload 6
      // 063: ifeq 0c7
      // 066: if_icmpge 0b6
      // 069: goto 070
      // 06c: invokestatic ey_.a (Lio/netty/handler/codec/DecoderException;)Lio/netty/handler/codec/DecoderException;
      // 06f: athrow
      // 070: new io/netty/handler/codec/DecoderException
      // 073: dup
      // 074: new java/lang/StringBuilder
      // 077: dup
      // 078: invokespecial java/lang/StringBuilder.<init> ()V
      // 07b: sipush 10984
      // 07e: ldc2_w 390881140015867214
      // 081: lload 4
      // 083: lxor
      // 084: invokedynamic y (IJ)Ljava/lang/String; bsm=ey_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 089: nop
      // 08a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 08d: iload 8
      // 08f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 092: sipush 5350
      // 095: ldc2_w 9009249448741575489
      // 098: lload 4
      // 09a: lxor
      // 09b: invokedynamic y (IJ)Ljava/lang/String; bsm=ey_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: nop
      // 0a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a4: aload 0
      // 0a5: getfield ey_.vs6 I
      // 0a8: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0ab: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ae: invokespecial io/netty/handler/codec/DecoderException.<init> (Ljava/lang/String;)V
      // 0b1: athrow
      // 0b2: invokestatic ey_.a (Lio/netty/handler/codec/DecoderException;)Lio/netty/handler/codec/DecoderException;
      // 0b5: athrow
      // 0b6: iload 8
      // 0b8: iload 6
      // 0ba: ifeq 114
      // 0bd: ldc 2097152
      // 0bf: nop
      // 0c0: goto 0c7
      // 0c3: invokestatic ey_.a (Lio/netty/handler/codec/DecoderException;)Lio/netty/handler/codec/DecoderException;
      // 0c6: athrow
      // 0c7: if_icmple 10f
      // 0ca: new io/netty/handler/codec/DecoderException
      // 0cd: dup
      // 0ce: new java/lang/StringBuilder
      // 0d1: dup
      // 0d2: invokespecial java/lang/StringBuilder.<init> ()V
      // 0d5: sipush 17817
      // 0d8: ldc2_w 7390735929748277821
      // 0db: lload 4
      // 0dd: lxor
      // 0de: invokedynamic y (IJ)Ljava/lang/String; bsm=ey_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e3: nop
      // 0e4: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e7: iload 8
      // 0e9: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0ec: sipush 2544
      // 0ef: ldc2_w 8620325524062864981
      // 0f2: lload 4
      // 0f4: lxor
      // 0f5: invokedynamic y (IJ)Ljava/lang/String; bsm=ey_.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: nop
      // 0fb: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0fe: ldc 2097152
      // 100: nop
      // 101: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 104: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 107: invokespecial io/netty/handler/codec/DecoderException.<init> (Ljava/lang/String;)V
      // 10a: athrow
      // 10b: invokestatic ey_.a (Lio/netty/handler/codec/DecoderException;)Lio/netty/handler/codec/DecoderException;
      // 10e: athrow
      // 10f: aload 7
      // 111: invokevirtual nfj.readableBytes ()I
      // 114: newarray 8
      // 116: astore 9
      // 118: aload 7
      // 11a: aload 9
      // 11c: invokevirtual nfj.readBytes ([B)Lio/netty/buffer/ByteBuf;
      // 11f: pop
      // 120: aload 0
      // 121: getfield ey_.ziy Ljava/util/zip/Inflater;
      // 124: aload 9
      // 126: invokevirtual java/util/zip/Inflater.setInput ([B)V
      // 129: iload 8
      // 12b: newarray 8
      // 12d: astore 10
      // 12f: aload 0
      // 130: getfield ey_.ziy Ljava/util/zip/Inflater;
      // 133: aload 10
      // 135: invokevirtual java/util/zip/Inflater.inflate ([B)I
      // 138: pop
      // 139: aload 3
      // 13a: aload 10
      // 13c: invokestatic io/netty/buffer/Unpooled.wrappedBuffer ([B)Lio/netty/buffer/ByteBuf;
      // 13f: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 144: pop
      // 145: aload 0
      // 146: getfield ey_.ziy Ljava/util/zip/Inflater;
      // 149: invokevirtual java/util/zip/Inflater.reset ()V
      // 14c: return
   }

   public void mdk(int var1) {
      this.vs6 = var1;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5628202465511113407L, -6874726239674745264L, MethodHandles.lookup().lookupClass()).a(218970166697291L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 121184945262053L;
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
      String var6 = "¡f»\u001c\u0085R©\u0097¥>\u008d\u008fÈ²¢mã¿¹\u0092\u0000\u0094ÖÓ\u0098w¹y\u0091©q\u0096\u0093YÓ\u0014UP¶o\u001dÞÊ\u0010é¡K\u009b\u0003`þ\u0099\u0017iné\u008a-8Ç{UÈ\u0003@e\u0018Hy;\u0013Jl\nË^w«J³Î\u0001¨\u0085p¯(\u0090tÀ¯×F\u0093\u0085ËS\u001d\u0015\u0017Õ÷\u009c»\u0007Jé¸lg?\r#ð\u001e=HMûÀ\tÑq\u0082Ï'è\u008bg";
      int var8 = "¡f»\u001c\u0085R©\u0097¥>\u008d\u008fÈ²¢mã¿¹\u0092\u0000\u0094ÖÓ\u0098w¹y\u0091©q\u0096\u0093YÓ\u0014UP¶o\u001dÞÊ\u0010é¡K\u009b\u0003`þ\u0099\u0017iné\u008a-8Ç{UÈ\u0003@e\u0018Hy;\u0013Jl\nË^w«J³Î\u0001¨\u0085p¯(\u0090tÀ¯×F\u0093\u0085ËS\u001d\u0015\u0017Õ÷\u009c»\u0007Jé¸lg?\r#ð\u001e=HMûÀ\tÑq\u0082Ï'è\u008bg"
         .length();
      char var5 = '@';
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

                  var6 = "\u008bÄØ\u001dc²Ò¢\u0087²ißÆ\u0010CÏ¤1ßÝ\u0097\u0096\u0082Ó&\u0092y¦½¿øõDô\u0083èù\u0082\u0086¤I¬¼Æ!\u0094B;\u00105´:Ò\u0001Ù\u0082H\u0018ñc¼\u000eíÌ0~1ãH[ËÊ\u008b\u0006S¦~\u001bO5Î\u0093\u009d?HÕä1©\u001d®ëü·h\u0012!§%é=\u00118\u0007\fE^Ñòé\u0091üà";
                  var8 = "\u008bÄØ\u001dc²Ò¢\u0087²ißÆ\u0010CÏ¤1ßÝ\u0097\u0096\u0082Ó&\u0092y¦½¿øõDô\u0083èù\u0082\u0086¤I¬¼Æ!\u0094B;\u00105´:Ò\u0001Ù\u0082H\u0018ñc¼\u000eíÌ0~1ãH[ËÊ\u008b\u0006S¦~\u001bO5Î\u0093\u009d?HÕä1©\u001d®ëü·h\u0012!§%é=\u00118\u0007\fE^Ñòé\u0091üà"
                     .length();
                  var5 = '@';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static DecoderException a(DecoderException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4922;
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
            throw new RuntimeException("ey_", var10);
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
         throw new RuntimeException("ey_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
