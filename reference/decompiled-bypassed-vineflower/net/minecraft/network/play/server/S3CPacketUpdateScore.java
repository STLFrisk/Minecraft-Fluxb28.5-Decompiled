package net.minecraft.network.play.server;

public class S3CPacketUpdateScore implements mz2 {
   private String iex = "";
   private String dd8 = "";
   private int z56;
   private S3CPacketUpdateScore$f8u k16;

   public S3CPacketUpdateScore() {
   }

   public S3CPacketUpdateScore(r11 var1) {
      this.iex = var1.tg2();
      this.dd8 = var1.i3t().qkn();
      this.z56 = var1.fge();
      this.k16 = S3CPacketUpdateScore$f8u.tkq;
   }

   public S3CPacketUpdateScore(String var1) {
      this.iex = var1;
      this.dd8 = "";
      this.z56 = 0;
      this.k16 = S3CPacketUpdateScore$f8u.yqa;
   }

   public S3CPacketUpdateScore(String var1, sa6 var2) {
      this.iex = var1;
      this.dd8 = var2.qkn();
      this.z56 = 0;
      this.k16 = S3CPacketUpdateScore$f8u.yqa;
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
      // 02: bipush 40
      // 04: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 07: putfield net/minecraft/network/play/server/S3CPacketUpdateScore.iex Ljava/lang/String;
      // 0a: aload 0
      // 0b: aload 1
      // 0c: ldc net/minecraft/network/play/server/S3CPacketUpdateScore$f8u
      // 0e: nop
      // 0f: invokevirtual nfj.e0h (Ljava/lang/Class;)Ljava/lang/Enum;
      // 12: checkcast net/minecraft/network/play/server/S3CPacketUpdateScore$f8u
      // 15: putfield net/minecraft/network/play/server/S3CPacketUpdateScore.k16 Lnet/minecraft/network/play/server/S3CPacketUpdateScore$f8u;
      // 18: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 1b: aload 0
      // 1c: aload 1
      // 1d: bipush 16
      // 1f: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 22: putfield net/minecraft/network/play/server/S3CPacketUpdateScore.dd8 Ljava/lang/String;
      // 25: astore 2
      // 26: aload 0
      // 27: aload 2
      // 28: ifnull 43
      // 2b: getfield net/minecraft/network/play/server/S3CPacketUpdateScore.k16 Lnet/minecraft/network/play/server/S3CPacketUpdateScore$f8u;
      // 2e: getstatic net/minecraft/network/play/server/S3CPacketUpdateScore$f8u.yqa Lnet/minecraft/network/play/server/S3CPacketUpdateScore$f8u;
      // 31: if_acmpeq 4a
      // 34: goto 3b
      // 37: invokestatic net/minecraft/network/play/server/S3CPacketUpdateScore.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: goto 43
      // 3f: invokestatic net/minecraft/network/play/server/S3CPacketUpdateScore.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 1
      // 44: invokevirtual nfj.gux ()I
      // 47: putfield net/minecraft/network/play/server/S3CPacketUpdateScore.z56 I
      // 4a: return
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
      // 00: aload 1
      // 01: aload 0
      // 02: getfield net/minecraft/network/play/server/S3CPacketUpdateScore.iex Ljava/lang/String;
      // 05: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 08: pop
      // 09: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0c: aload 1
      // 0d: aload 0
      // 0e: getfield net/minecraft/network/play/server/S3CPacketUpdateScore.k16 Lnet/minecraft/network/play/server/S3CPacketUpdateScore$f8u;
      // 11: invokevirtual nfj.p9c (Ljava/lang/Enum;)Lnfj;
      // 14: pop
      // 15: astore 2
      // 16: aload 1
      // 17: aload 0
      // 18: getfield net/minecraft/network/play/server/S3CPacketUpdateScore.dd8 Ljava/lang/String;
      // 1b: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 1e: aload 2
      // 1f: ifnull 43
      // 22: pop
      // 23: aload 0
      // 24: getfield net/minecraft/network/play/server/S3CPacketUpdateScore.k16 Lnet/minecraft/network/play/server/S3CPacketUpdateScore$f8u;
      // 27: getstatic net/minecraft/network/play/server/S3CPacketUpdateScore$f8u.yqa Lnet/minecraft/network/play/server/S3CPacketUpdateScore$f8u;
      // 2a: if_acmpeq 44
      // 2d: goto 34
      // 30: invokestatic net/minecraft/network/play/server/S3CPacketUpdateScore.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: aload 0
      // 36: getfield net/minecraft/network/play/server/S3CPacketUpdateScore.z56 I
      // 39: invokevirtual nfj.tao (I)Lnfj;
      // 3c: goto 43
      // 3f: invokestatic net/minecraft/network/play/server/S3CPacketUpdateScore.a (Loov;)Loov;
      // 42: athrow
      // 43: pop
      // 44: return
   }

   public void y6b(jsv var1) {
      var1.zk9(this);
   }

   public String op2() {
      return this.iex;
   }

   public String cqn() {
      return this.dd8;
   }

   public int uk9() {
      return this.z56;
   }

   public S3CPacketUpdateScore$f8u yga() {
      return this.k16;
   }

   @Override
   public void ito(yw3 var1) {
      this.y6b((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
