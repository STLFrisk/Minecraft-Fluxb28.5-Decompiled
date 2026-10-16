package net.minecraft.network.play.server;

public class S2CPacketSpawnGlobalEntity implements mz2 {
   public i2h g1w;

   public S2CPacketSpawnGlobalEntity() {
   }

   public S2CPacketSpawnGlobalEntity(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 07: aload 0
      // 08: aload 1
      // 09: putfield net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.g1w Li2h;
      // 0c: aload 0
      // 0d: aload 1
      // 0e: invokevirtual i2h.jwu ()I
      // 11: putfield net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.f6d I
      // 14: aload 0
      // 15: aload 1
      // 16: getfield i2h.o2v D
      // 19: ldc2_w 32.0
      // 1c: dmul
      // 1d: invokestatic fe6.jqf (D)I
      // 20: putfield net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.rr7 I
      // 23: aload 0
      // 24: aload 1
      // 25: getfield i2h.kfp D
      // 28: ldc2_w 32.0
      // 2b: dmul
      // 2c: invokestatic fe6.jqf (D)I
      // 2f: putfield net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.a0x I
      // 32: astore 2
      // 33: aload 0
      // 34: aload 1
      // 35: getfield i2h.vbd D
      // 38: ldc2_w 32.0
      // 3b: dmul
      // 3c: invokestatic fe6.jqf (D)I
      // 3f: aload 2
      // 40: ifnull 5d
      // 43: putfield net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.fa1 I
      // 46: aload 1
      // 47: instanceof _6b
      // 4a: ifeq 60
      // 4d: goto 54
      // 50: invokestatic net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: bipush 1
      // 56: goto 5d
      // 59: invokestatic net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.a (Loov;)Loov;
      // 5c: athrow
      // 5d: putfield net/minecraft/network/play/server/S2CPacketSpawnGlobalEntity.nj6 I
      // 60: return
   }

   @Override
   public void ajj(nfj var1) {
      this.f6d = var1.gux();
      this.nj6 = var1.readByte();
      this.rr7 = var1.readInt();
      this.a0x = var1.readInt();
      this.fa1 = var1.readInt();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.f6d);
      var1.writeByte(this.nj6);
      var1.writeInt(this.rr7);
      var1.writeInt(this.a0x);
      var1.writeInt(this.fa1);
   }

   public void ud7(jsv var1) {
      var1.hq1(this);
   }

   public int hrc() {
      return this.f6d;
   }

   public int d8n() {
      return this.rr7;
   }

   public int mim() {
      return this.a0x;
   }

   public int w73() {
      return this.fa1;
   }

   public int is0() {
      return this.nj6;
   }

   @Override
   public void ito(yw3 var1) {
      this.ud7((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
