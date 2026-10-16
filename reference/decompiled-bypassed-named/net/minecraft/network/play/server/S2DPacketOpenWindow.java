package net.minecraft.network.play.server;

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

public class S2DPacketOpenWindow implements mz2 {
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public S2DPacketOpenWindow() {
   }

   public S2DPacketOpenWindow(int var1, String var2, ekw var3) {
      this(var1, var2, var3, 0);
   }

   public S2DPacketOpenWindow(int var1, String var2, ekw var3, int var4) {
      this.pku = var1;
      this.n4l = var2;
      this.st2 = var3;
      this.ba8 = var4;
   }

   public S2DPacketOpenWindow(int var1, String var2, ekw var3, int var4, int var5) {
      this(var1, var2, var3, var4);
      this.s_m = var5;
   }

   public void ucy(jsv var1) {
      var1.twv(this);
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
      // 00: getstatic net/minecraft/network/play/server/S2DPacketOpenWindow.a J
      // 03: ldc2_w 87856378818399
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: aload 1
      // 0a: invokevirtual nfj.readUnsignedByte ()S
      // 0d: putfield net/minecraft/network/play/server/S2DPacketOpenWindow.pku I
      // 10: aload 0
      // 11: aload 1
      // 12: bipush 32
      // 14: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 17: putfield net/minecraft/network/play/server/S2DPacketOpenWindow.n4l Ljava/lang/String;
      // 1a: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 1d: aload 0
      // 1e: aload 1
      // 1f: invokevirtual nfj.wdz ()Lekw;
      // 22: putfield net/minecraft/network/play/server/S2DPacketOpenWindow.st2 Lekw;
      // 25: aload 0
      // 26: aload 1
      // 27: invokevirtual nfj.readUnsignedByte ()S
      // 2a: putfield net/minecraft/network/play/server/S2DPacketOpenWindow.ba8 I
      // 2d: astore 4
      // 2f: aload 0
      // 30: aload 4
      // 32: ifnull 5b
      // 35: getfield net/minecraft/network/play/server/S2DPacketOpenWindow.n4l Ljava/lang/String;
      // 38: sipush 17254
      // 3b: ldc2_w 8560777850799307382
      // 3e: lload 2
      // 3f: lxor
      // 40: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/network/play/server/S2DPacketOpenWindow.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 45: nop
      // 46: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 49: ifeq 62
      // 4c: goto 53
      // 4f: invokestatic net/minecraft/network/play/server/S2DPacketOpenWindow.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: goto 5b
      // 57: invokestatic net/minecraft/network/play/server/S2DPacketOpenWindow.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 1
      // 5c: invokevirtual nfj.readInt ()I
      // 5f: putfield net/minecraft/network/play/server/S2DPacketOpenWindow.s_m I
      // 62: return
   }

   @Override
   public void ddd(nfj param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic net/minecraft/network/play/server/S2DPacketOpenWindow.a J
      // 03: ldc2_w 38367185347505
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: aload 0
      // 0a: getfield net/minecraft/network/play/server/S2DPacketOpenWindow.pku I
      // 0d: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 10: pop
      // 11: aload 1
      // 12: aload 0
      // 13: getfield net/minecraft/network/play/server/S2DPacketOpenWindow.n4l Ljava/lang/String;
      // 16: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 19: pop
      // 1a: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 1d: aload 1
      // 1e: aload 0
      // 1f: getfield net/minecraft/network/play/server/S2DPacketOpenWindow.st2 Lekw;
      // 22: invokevirtual nfj.v7d (Lekw;)V
      // 25: astore 4
      // 27: aload 1
      // 28: aload 0
      // 29: getfield net/minecraft/network/play/server/S2DPacketOpenWindow.ba8 I
      // 2c: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 2f: aload 4
      // 31: ifnull 63
      // 34: pop
      // 35: aload 0
      // 36: getfield net/minecraft/network/play/server/S2DPacketOpenWindow.n4l Ljava/lang/String;
      // 39: sipush 32117
      // 3c: ldc2_w 1637769163969923210
      // 3f: lload 2
      // 40: lxor
      // 41: invokedynamic r (IJ)Ljava/lang/String; bsm=net/minecraft/network/play/server/S2DPacketOpenWindow.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 46: nop
      // 47: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 4a: ifeq 64
      // 4d: goto 54
      // 50: invokestatic net/minecraft/network/play/server/S2DPacketOpenWindow.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 1
      // 55: aload 0
      // 56: getfield net/minecraft/network/play/server/S2DPacketOpenWindow.s_m I
      // 59: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 5c: goto 63
      // 5f: invokestatic net/minecraft/network/play/server/S2DPacketOpenWindow.a (Loov;)Loov;
      // 62: athrow
      // 63: pop
      // 64: return
   }

   public int cru() {
      return this.pku;
   }

   public String _p9() {
      return this.n4l;
   }

   public ekw ot8() {
      return this.st2;
   }

   public int dz1() {
      return this.ba8;
   }

   public int qyz() {
      return this.s_m;
   }

   public boolean jir() {
      String var1 = S14PacketEntity.b();

      try {
         if (var1 == null) {
            return (boolean)this.ba8;
         }

         if (this.ba8 > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   @Override
   public void ito(yw3 var1) {
      this.ucy((jsv)var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5444944770636283872L, 7849930592332252865L, MethodHandles.lookup().lookupClass()).a(134763853190805L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 16352077457739L;
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
      String var6 = "î»\u0012Íø\u009bã\u000bé|SdF\u009e\u0011\u008c°\u0011\u009bê\u008dS³6 CÇÜ\u0088\u001c\u0090Å^å\b\u00ad\u0004L¸\u0018N¾ø¹4èNæl[V\u0018[Ðb\"ï";
      int var8 = "î»\u0012Íø\u009bã\u000bé|SdF\u009e\u0011\u008c°\u0011\u009bê\u008dS³6 CÇÜ\u0088\u001c\u0090Å^å\b\u00ad\u0004L¸\u0018N¾ø¹4èNæl[V\u0018[Ðb\"ï"
         .length();
      char var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29444;
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
            throw new RuntimeException("net/minecraft/network/play/server/S2DPacketOpenWindow", var10);
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
         throw new RuntimeException("net/minecraft/network/play/server/S2DPacketOpenWindow" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
