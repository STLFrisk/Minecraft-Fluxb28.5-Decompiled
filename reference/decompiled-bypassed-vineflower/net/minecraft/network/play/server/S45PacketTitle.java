package net.minecraft.network.play.server;

public class S45PacketTitle implements mz2 {
   private S45PacketTitle$_f9 giu;
   private ekw p15;
   private int s34;
   private int y0b;
   private int h55;

   public S45PacketTitle() {
   }

   public S45PacketTitle(S45PacketTitle$_f9 var1, ekw var2) {
      this(var1, var2, -1, -1, -1);
   }

   public S45PacketTitle(int var1, int var2, int var3) {
      this(S45PacketTitle$_f9.oi9, (ekw)null, var1, var2, var3);
   }

   public S45PacketTitle(S45PacketTitle$_f9 var1, ekw var2, int var3, int var4, int var5) {
      this.giu = var1;
      this.p15 = var2;
      this.s34 = var3;
      this.y0b = var4;
      this.h55 = var5;
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
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 1
      // 06: ldc net/minecraft/network/play/server/S45PacketTitle$_f9
      // 08: nop
      // 09: invokevirtual nfj.e0h (Ljava/lang/Class;)Ljava/lang/Enum;
      // 0c: checkcast net/minecraft/network/play/server/S45PacketTitle$_f9
      // 0f: putfield net/minecraft/network/play/server/S45PacketTitle.giu Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 12: aload 0
      // 13: aload 2
      // 14: ifnull 44
      // 17: getfield net/minecraft/network/play/server/S45PacketTitle.giu Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 1a: getstatic net/minecraft/network/play/server/S45PacketTitle$_f9.r62 Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 1d: if_acmpeq 43
      // 20: goto 27
      // 23: invokestatic net/minecraft/network/play/server/S45PacketTitle.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield net/minecraft/network/play/server/S45PacketTitle.giu Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 2b: getstatic net/minecraft/network/play/server/S45PacketTitle$_f9.syq Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 2e: aload 2
      // 2f: ifnull 5d
      // 32: goto 39
      // 35: invokestatic net/minecraft/network/play/server/S45PacketTitle.a (Loov;)Loov;
      // 38: athrow
      // 39: if_acmpne 4b
      // 3c: goto 43
      // 3f: invokestatic net/minecraft/network/play/server/S45PacketTitle.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: aload 1
      // 45: invokevirtual nfj.wdz ()Lekw;
      // 48: putfield net/minecraft/network/play/server/S45PacketTitle.p15 Lekw;
      // 4b: aload 0
      // 4c: aload 2
      // 4d: ifnull 78
      // 50: getfield net/minecraft/network/play/server/S45PacketTitle.giu Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 53: getstatic net/minecraft/network/play/server/S45PacketTitle$_f9.oi9 Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 56: goto 5d
      // 59: invokestatic net/minecraft/network/play/server/S45PacketTitle.a (Loov;)Loov;
      // 5c: athrow
      // 5d: if_acmpne 7f
      // 60: aload 0
      // 61: aload 1
      // 62: invokevirtual nfj.readInt ()I
      // 65: putfield net/minecraft/network/play/server/S45PacketTitle.s34 I
      // 68: aload 0
      // 69: aload 1
      // 6a: invokevirtual nfj.readInt ()I
      // 6d: putfield net/minecraft/network/play/server/S45PacketTitle.y0b I
      // 70: aload 0
      // 71: goto 78
      // 74: invokestatic net/minecraft/network/play/server/S45PacketTitle.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 1
      // 79: invokevirtual nfj.readInt ()I
      // 7c: putfield net/minecraft/network/play/server/S45PacketTitle.h55 I
      // 7f: return
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
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 0
      // 06: getfield net/minecraft/network/play/server/S45PacketTitle.giu Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 09: invokevirtual nfj.p9c (Ljava/lang/Enum;)Lnfj;
      // 0c: aload 2
      // 0d: ifnull 3f
      // 10: pop
      // 11: aload 0
      // 12: getfield net/minecraft/network/play/server/S45PacketTitle.giu Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 15: getstatic net/minecraft/network/play/server/S45PacketTitle$_f9.r62 Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 18: if_acmpeq 3e
      // 1b: goto 22
      // 1e: invokestatic net/minecraft/network/play/server/S45PacketTitle.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: getfield net/minecraft/network/play/server/S45PacketTitle.giu Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 26: getstatic net/minecraft/network/play/server/S45PacketTitle$_f9.syq Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 29: aload 2
      // 2a: ifnull 4d
      // 2d: goto 34
      // 30: invokestatic net/minecraft/network/play/server/S45PacketTitle.a (Loov;)Loov;
      // 33: athrow
      // 34: if_acmpne 46
      // 37: goto 3e
      // 3a: invokestatic net/minecraft/network/play/server/S45PacketTitle.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 1
      // 3f: aload 0
      // 40: getfield net/minecraft/network/play/server/S45PacketTitle.p15 Lekw;
      // 43: invokevirtual nfj.v7d (Lekw;)V
      // 46: aload 0
      // 47: getfield net/minecraft/network/play/server/S45PacketTitle.giu Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 4a: getstatic net/minecraft/network/play/server/S45PacketTitle$_f9.oi9 Lnet/minecraft/network/play/server/S45PacketTitle$_f9;
      // 4d: if_acmpne 72
      // 50: aload 1
      // 51: aload 0
      // 52: getfield net/minecraft/network/play/server/S45PacketTitle.s34 I
      // 55: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 58: pop
      // 59: aload 1
      // 5a: aload 0
      // 5b: getfield net/minecraft/network/play/server/S45PacketTitle.y0b I
      // 5e: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 61: pop
      // 62: aload 1
      // 63: aload 0
      // 64: getfield net/minecraft/network/play/server/S45PacketTitle.h55 I
      // 67: invokevirtual nfj.writeInt (I)Lio/netty/buffer/ByteBuf;
      // 6a: pop
      // 6b: goto 72
      // 6e: invokestatic net/minecraft/network/play/server/S45PacketTitle.a (Loov;)Loov;
      // 71: athrow
      // 72: return
   }

   public void nvk(jsv var1) {
      var1.bob(this);
   }

   public S45PacketTitle$_f9 j8z() {
      return this.giu;
   }

   public ekw uwr() {
      return this.p15;
   }

   public int owk() {
      return this.s34;
   }

   public int y8o() {
      return this.y0b;
   }

   public int t6u() {
      return this.h55;
   }

   @Override
   public void ito(yw3 var1) {
      this.nvk((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
