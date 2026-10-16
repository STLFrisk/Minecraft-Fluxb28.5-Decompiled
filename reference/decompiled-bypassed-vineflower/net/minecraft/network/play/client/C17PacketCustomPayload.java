package net.minecraft.network.play.client;

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

public class C17PacketCustomPayload implements mz2 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public C17PacketCustomPayload() {
   }

   public C17PacketCustomPayload(String var1, nfj var2) {
      long var3 = a ^ 69135785185454L;
      super();
      this.yv6 = var1;
      this.xlk = var2;
      if (var2.writerIndex() > 32767) {
         throw new IllegalArgumentException(a<"p">(27149, 3465744704568014798L ^ var3));
      }
   }

   @Override
   public void ajj(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/network/play/client/C17PacketCustomPayload.a J
      // 03: ldc2_w 6001819161725
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: bipush 20
      // 0c: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 0f: putfield net/minecraft/network/play/client/C17PacketCustomPayload.yv6 Ljava/lang/String;
      // 12: invokestatic net/minecraft/network/play/client/C03PacketPlayer.b ()[Li2h;
      // 15: aload 1
      // 16: invokevirtual nfj.readableBytes ()I
      // 19: istore 5
      // 1b: astore 4
      // 1d: iload 5
      // 1f: aload 4
      // 21: ifnonnull 30
      // 24: iflt 53
      // 27: goto 2e
      // 2a: invokestatic net/minecraft/network/play/client/C17PacketCustomPayload.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2d: athrow
      // 2e: iload 5
      // 30: sipush 32767
      // 33: if_icmpgt 53
      // 36: aload 0
      // 37: new nfj
      // 3a: dup
      // 3b: aload 1
      // 3c: iload 5
      // 3e: invokevirtual nfj.readBytes (I)Lio/netty/buffer/ByteBuf;
      // 41: invokespecial nfj.<init> (Lio/netty/buffer/ByteBuf;)V
      // 44: putfield net/minecraft/network/play/client/C17PacketCustomPayload.xlk Lnfj;
      // 47: aload 4
      // 49: ifnull 6d
      // 4c: goto 53
      // 4f: invokestatic net/minecraft/network/play/client/C17PacketCustomPayload.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52: athrow
      // 53: new java/io/IOException
      // 56: dup
      // 57: sipush 2442
      // 5a: ldc2_w 2612788415490035867
      // 5d: lload 2
      // 5e: lxor
      // 5f: invokedynamic p (IJ)Ljava/lang/String; bsm=net/minecraft/network/play/client/C17PacketCustomPayload.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 64: nop
      // 65: invokespecial java/io/IOException.<init> (Ljava/lang/String;)V
      // 68: athrow
      // 69: invokestatic net/minecraft/network/play/client/C17PacketCustomPayload.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6c: athrow
      // 6d: return
   }

   @Override
   public void ddd(nfj var1) {
      var1.p3z(this.yv6);
      var1.writeBytes(this.xlk);
   }

   public void ah0(no5 var1) {
      var1.e0i(this);
   }

   public String r_b() {
      return this.yv6;
   }

   public nfj del() {
      return this.xlk;
   }

   @Override
   public void ito(yw3 var1) {
      this.ah0((no5)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-5706664387537353313L, -3854921926922383340L, MethodHandles.lookup().lookupClass()).a(250848386308541L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 124070427501550L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u0088\u0095<¸\u00adn¥ò¨\u0099Á\u0000\u0087\u0099\r\u0090®îÂ\u007f\u0019nAìàã¸\u001eëg{Mì\u0011oÛEV\u0004®\u000f¼m\u00ad«\u008b©\u0018ú_ëØH\u0091_Dõ±\u007fÀù\u0018\u009fC)ú`s\u008b4Z\u0092H\u009d2\u0001Ãs\u0091\u0096xÊp´\u0088\u0013Ç¾\u0010îJ®Û§í©gµ°æìú¿\u0019ÃÈ\u0015EU79Ü\u0084¯\u001dÃ\u0005m&R@ã\u0000Y»4X^±ZÕ\fóû\u008dp\u001cT\f\u001a\u0095Ñÿ©G";
      int var8 = "\u0088\u0095<¸\u00adn¥ò¨\u0099Á\u0000\u0087\u0099\r\u0090®îÂ\u007f\u0019nAìàã¸\u001eëg{Mì\u0011oÛEV\u0004®\u000f¼m\u00ad«\u008b©\u0018ú_ëØH\u0091_Dõ±\u007fÀù\u0018\u009fC)ú`s\u008b4Z\u0092H\u009d2\u0001Ãs\u0091\u0096xÊp´\u0088\u0013Ç¾\u0010îJ®Û§í©gµ°æìú¿\u0019ÃÈ\u0015EU79Ü\u0084¯\u001dÃ\u0005m&R@ã\u0000Y»4X^±ZÕ\fóû\u008dp\u001cT\f\u001a\u0095Ñÿ©G"
         .length();
      char var5 = 'H';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = a(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4869;
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
            throw new RuntimeException("net/minecraft/network/play/client/C17PacketCustomPayload", var10);
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
         throw new RuntimeException("net/minecraft/network/play/client/C17PacketCustomPayload" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
