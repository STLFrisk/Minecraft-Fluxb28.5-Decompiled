package net.minecraft.network.play.client;

public class C02PacketUseEntity implements mz2 {
   private int k78;
   private C02PacketUseEntity$_y6 _31;
   private fqr s7t;

   public C02PacketUseEntity() {
   }

   public C02PacketUseEntity(EntityLivingBase var1, C02PacketUseEntity$_y6 var2) {
      this.k78 = var1.jwu();
      this._31 = var2;
   }

   public C02PacketUseEntity(EntityLivingBase var1, fqr var2) {
      this(var1, C02PacketUseEntity$_y6.s3w);
      this.s7t = var2;
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
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual nfj.gux ()I
      // 05: putfield net/minecraft/network/play/client/C02PacketUseEntity.k78 I
      // 08: invokestatic net/minecraft/network/play/client/C03PacketPlayer.b ()[Li2h;
      // 0b: aload 0
      // 0c: aload 1
      // 0d: ldc net/minecraft/network/play/client/C02PacketUseEntity$_y6
      // 0f: nop
      // 10: invokevirtual nfj.e0h (Ljava/lang/Class;)Ljava/lang/Enum;
      // 13: checkcast net/minecraft/network/play/client/C02PacketUseEntity$_y6
      // 16: putfield net/minecraft/network/play/client/C02PacketUseEntity._31 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 19: astore 2
      // 1a: aload 0
      // 1b: aload 2
      // 1c: ifnonnull 37
      // 1f: getfield net/minecraft/network/play/client/C02PacketUseEntity._31 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 22: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.s3w Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 25: if_acmpne 50
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/network/play/client/C02PacketUseEntity.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: goto 37
      // 33: invokestatic net/minecraft/network/play/client/C02PacketUseEntity.a (Loov;)Loov;
      // 36: athrow
      // 37: new fqr
      // 3a: dup
      // 3b: aload 1
      // 3c: invokevirtual nfj.readFloat ()F
      // 3f: f2d
      // 40: aload 1
      // 41: invokevirtual nfj.readFloat ()F
      // 44: f2d
      // 45: aload 1
      // 46: invokevirtual nfj.readFloat ()F
      // 49: f2d
      // 4a: invokespecial fqr.<init> (DDD)V
      // 4d: putfield net/minecraft/network/play/client/C02PacketUseEntity.s7t Lfqr;
      // 50: return
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
      // 00: invokestatic net/minecraft/network/play/client/C03PacketPlayer.b ()[Li2h;
      // 03: astore 2
      // 04: aload 1
      // 05: aload 0
      // 06: getfield net/minecraft/network/play/client/C02PacketUseEntity.k78 I
      // 09: invokevirtual nfj.tao (I)Lnfj;
      // 0c: pop
      // 0d: aload 1
      // 0e: aload 0
      // 0f: getfield net/minecraft/network/play/client/C02PacketUseEntity._31 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 12: invokevirtual nfj.p9c (Ljava/lang/Enum;)Lnfj;
      // 15: pop
      // 16: aload 2
      // 17: ifnonnull 4c
      // 1a: aload 0
      // 1b: getfield net/minecraft/network/play/client/C02PacketUseEntity._31 Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 1e: getstatic net/minecraft/network/play/client/C02PacketUseEntity$_y6.s3w Lnet/minecraft/network/play/client/C02PacketUseEntity$_y6;
      // 21: if_acmpne 59
      // 24: goto 2b
      // 27: invokestatic net/minecraft/network/play/client/C02PacketUseEntity.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 1
      // 2c: aload 0
      // 2d: getfield net/minecraft/network/play/client/C02PacketUseEntity.s7t Lfqr;
      // 30: getfield fqr.lvi D
      // 33: d2f
      // 34: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 37: pop
      // 38: aload 1
      // 39: aload 0
      // 3a: getfield net/minecraft/network/play/client/C02PacketUseEntity.s7t Lfqr;
      // 3d: getfield fqr.gn5 D
      // 40: d2f
      // 41: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 44: pop
      // 45: goto 4c
      // 48: invokestatic net/minecraft/network/play/client/C02PacketUseEntity.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 1
      // 4d: aload 0
      // 4e: getfield net/minecraft/network/play/client/C02PacketUseEntity.s7t Lfqr;
      // 51: getfield fqr.bn2 D
      // 54: d2f
      // 55: invokevirtual nfj.writeFloat (F)Lio/netty/buffer/ByteBuf;
      // 58: pop
      // 59: return
   }

   public void vl6(no5 var1) {
      var1.x66(this);
   }

   public EntityLivingBase _nk(OpaquePredicate var1) {
      return var1.oks(this.k78);
   }

   public C02PacketUseEntity$_y6 nf7() {
      return this._31;
   }

   public fqr kvu() {
      return this.s7t;
   }

   @Override
   public void ito(yw3 var1) {
      this.vl6((no5)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
