package net.minecraft.network.play.server;

public class S3DPacketDisplayScoreboard implements mz2 {
   public S3DPacketDisplayScoreboard() {
   }

   public S3DPacketDisplayScoreboard(int param1, sa6 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 3
      // 04: aload 0
      // 05: invokespecial java/lang/Object.<init> ()V
      // 08: aload 0
      // 09: aload 3
      // 0a: ifnull 2f
      // 0d: iload 1
      // 0e: putfield net/minecraft/network/play/server/S3DPacketDisplayScoreboard.zo5 I
      // 11: aload 2
      // 12: ifnonnull 27
      // 15: aload 0
      // 16: ldc ""
      // 18: nop
      // 19: putfield net/minecraft/network/play/server/S3DPacketDisplayScoreboard.pzh Ljava/lang/String;
      // 1c: aload 3
      // 1d: ifnonnull 36
      // 20: goto 27
      // 23: invokestatic net/minecraft/network/play/server/S3DPacketDisplayScoreboard.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/network/play/server/S3DPacketDisplayScoreboard.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 2
      // 30: invokevirtual sa6.qkn ()Ljava/lang/String;
      // 33: putfield net/minecraft/network/play/server/S3DPacketDisplayScoreboard.pzh Ljava/lang/String;
      // 36: return
   }

   @Override
   public void ajj(nfj var1) {
      this.zo5 = var1.readByte();
      this.pzh = var1.oa5(16);
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.zo5);
      var1.p3z(this.pzh);
   }

   public void yy9(jsv var1) {
      var1.rgi(this);
   }

   public int pb9() {
      return this.zo5;
   }

   public String rjo() {
      return this.pzh;
   }

   @Override
   public void ito(yw3 var1) {
      this.yy9((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
