package net.minecraft.network.play.server;

public class S03PacketTimeUpdate implements mz2 {
   public S03PacketTimeUpdate() {
   }

   public S03PacketTimeUpdate(long param1, long param3, boolean param5) {
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
      // 08: lload 1
      // 09: putfield net/minecraft/network/play/server/S03PacketTimeUpdate.i3q J
      // 0c: astore 6
      // 0e: aload 0
      // 0f: lload 3
      // 10: putfield net/minecraft/network/play/server/S03PacketTimeUpdate.vvn J
      // 13: iload 5
      // 15: aload 6
      // 17: ifnull 46
      // 1a: ifne 50
      // 1d: goto 24
      // 20: invokestatic net/minecraft/network/play/server/S03PacketTimeUpdate.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: aload 0
      // 26: getfield net/minecraft/network/play/server/S03PacketTimeUpdate.vvn J
      // 29: lneg
      // 2a: putfield net/minecraft/network/play/server/S03PacketTimeUpdate.vvn J
      // 2d: aload 0
      // 2e: aload 6
      // 30: ifnull 4a
      // 33: goto 3a
      // 36: invokestatic net/minecraft/network/play/server/S03PacketTimeUpdate.a (Loov;)Loov;
      // 39: athrow
      // 3a: getfield net/minecraft/network/play/server/S03PacketTimeUpdate.vvn J
      // 3d: lconst_0
      // 3e: lcmp
      // 3f: goto 46
      // 42: invokestatic net/minecraft/network/play/server/S03PacketTimeUpdate.a (Loov;)Loov;
      // 45: athrow
      // 46: ifne 50
      // 49: aload 0
      // 4a: ldc2_w -1
      // 4d: putfield net/minecraft/network/play/server/S03PacketTimeUpdate.vvn J
      // 50: return
   }

   @Override
   public void ajj(nfj var1) {
      this.i3q = var1.readLong();
      this.vvn = var1.readLong();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeLong(this.i3q);
      var1.writeLong(this.vvn);
   }

   public void bq5(jsv var1) {
      var1.p02(this);
   }

   public long acv() {
      return this.i3q;
   }

   public long a7c() {
      return this.vvn;
   }

   @Override
   public void ito(yw3 var1) {
      this.bq5((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
