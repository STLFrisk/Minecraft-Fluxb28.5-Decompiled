package net.minecraft.network.handshake.client;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class C00Handshake implements mz2 {
   private static EntityLivingBase[] a;
   private static final long b;
   private static final String c;

   public C00Handshake() {
   }

   public C00Handshake(int var1, String var2, int var3, a0t var4) {
      this.b__ = var1;
      this.orq = var2;
      this.m3c = var3;
      this.jzq = var4;
   }

   @Override
   public void ajj(nfj var1) {
      this.b__ = var1.gux();
      b();
      this.orq = var1.oa5(255);

      try {
         this.m3c = var1.readUnsignedShort();
         this.jzq = a0t.abp(var1.gux());
         if (EntityLivingBase.b() != null) {
            b(new EntityLivingBase[5]);
         }
      } catch (oov var3) {
         throw a(var3);
      }
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
      // 00: getstatic net/minecraft/network/handshake/client/C00Handshake.b J
      // 03: ldc2_w 10808801743750
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic net/minecraft/network/handshake/client/C00Handshake.b ()[Li2h;
      // 0b: astore 4
      // 0d: aload 1
      // 0e: aload 0
      // 0f: getfield net/minecraft/network/handshake/client/C00Handshake.b__ I
      // 12: invokevirtual nfj.tao (I)Lnfj;
      // 15: pop
      // 16: aload 4
      // 18: ifnull 5f
      // 1b: getstatic ClientState.qkk Lzwr;
      // 1e: getfield ClientState._ii Z
      // 21: ifeq 56
      // 24: goto 2b
      // 27: invokestatic net/minecraft/network/handshake/client/C00Handshake.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 1
      // 2c: getstatic net/minecraft/network/handshake/client/C00Handshake.c Ljava/lang/String;
      // 2f: nop
      // 30: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 33: pop
      // 34: aload 1
      // 35: sipush 25565
      // 38: invokevirtual nfj.writeShort (I)Lio/netty/buffer/ByteBuf;
      // 3b: pop
      // 3c: aload 4
      // 3e: ifnonnull 68
      // 41: goto 48
      // 44: invokestatic net/minecraft/network/handshake/client/C00Handshake.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 4
      // 49: anewarray 106
      // 4c: invokestatic EntityLivingBase.b ([Li2h;)V
      // 4f: goto 56
      // 52: invokestatic net/minecraft/network/handshake/client/C00Handshake.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 1
      // 57: aload 0
      // 58: getfield net/minecraft/network/handshake/client/C00Handshake.orq Ljava/lang/String;
      // 5b: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 5e: pop
      // 5f: aload 1
      // 60: aload 0
      // 61: getfield net/minecraft/network/handshake/client/C00Handshake.m3c I
      // 64: invokevirtual nfj.writeShort (I)Lio/netty/buffer/ByteBuf;
      // 67: pop
      // 68: aload 1
      // 69: aload 0
      // 6a: getfield net/minecraft/network/handshake/client/C00Handshake.jzq La0t;
      // 6d: invokevirtual a0t.jhj ()I
      // 70: invokevirtual nfj.tao (I)Lnfj;
      // 73: pop
      // 74: return
   }

   public void n05(hp4 var1) {
      var1.cpq(this);
   }

   public a0t l4u() {
      return this.jzq;
   }

   public int o3k() {
      return this.b__;
   }

   @Override
   public void ito(yw3 var1) {
      this.n05((hp4)var1);
   }

   public static void b(EntityLivingBase[] var0) {
      a = var0;
   }

   public static EntityLivingBase[] b() {
      return a;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3261342921145038536L, 4447734469480754273L, MethodHandles.lookup().lookupClass()).a(267555844255863L);
      // $VF: monitorexit
      b = var10000;
      EntityLivingBase[] var5 = new EntityLivingBase[4];
      long var0 = b ^ 16521362966696L;
      b(var5);
      Cipher var2;
      Cipher var6 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\"\u0095F¨#^ë\re\u0018§%\u0012³\u0099\u0003".getBytes("ISO-8859-1"));
      String var7 = a(var4).intern();
      byte var10001 = -1;
      c = var7;
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
}
