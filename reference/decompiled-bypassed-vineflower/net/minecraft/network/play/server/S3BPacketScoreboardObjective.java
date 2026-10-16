package net.minecraft.network.play.server;

public class S3BPacketScoreboardObjective implements mz2 {
   private String l3y;
   private String zq_;
   private z0w$enz cjf;
   private int s8q;

   public S3BPacketScoreboardObjective() {
   }

   public S3BPacketScoreboardObjective(sa6 var1, int var2) {
      this.l3y = var1.qkn();
      this.zq_ = var1.rqc();
      this.cjf = var1.do2().yqn();
      this.s8q = var2;
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
      // 02: bipush 16
      // 04: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 07: putfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.l3y Ljava/lang/String;
      // 0a: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0d: aload 0
      // 0e: aload 1
      // 0f: invokevirtual nfj.readByte ()B
      // 12: putfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.s8q I
      // 15: astore 2
      // 16: aload 0
      // 17: aload 2
      // 18: ifnull 54
      // 1b: getfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.s8q I
      // 1e: ifeq 42
      // 21: goto 28
      // 24: invokestatic net/minecraft/network/play/server/S3BPacketScoreboardObjective.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: aload 2
      // 2a: ifnull 54
      // 2d: goto 34
      // 30: invokestatic net/minecraft/network/play/server/S3BPacketScoreboardObjective.a (Loov;)Loov;
      // 33: athrow
      // 34: getfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.s8q I
      // 37: bipush 2
      // 38: if_icmpne 60
      // 3b: goto 42
      // 3e: invokestatic net/minecraft/network/play/server/S3BPacketScoreboardObjective.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: aload 1
      // 44: bipush 32
      // 46: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 49: putfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.zq_ Ljava/lang/String;
      // 4c: aload 0
      // 4d: goto 54
      // 50: invokestatic net/minecraft/network/play/server/S3BPacketScoreboardObjective.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 1
      // 55: bipush 16
      // 57: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 5a: invokestatic z0w$enz.q_i (Ljava/lang/String;)Lz0w$enz;
      // 5d: putfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.cjf Lz0w$enz;
      // 60: return
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
      // 06: getfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.l3y Ljava/lang/String;
      // 09: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 0c: pop
      // 0d: aload 1
      // 0e: aload 0
      // 0f: getfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.s8q I
      // 12: invokevirtual nfj.writeByte (I)Lio/netty/buffer/ByteBuf;
      // 15: pop
      // 16: aload 2
      // 17: ifnull 47
      // 1a: aload 0
      // 1b: getfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.s8q I
      // 1e: ifeq 37
      // 21: goto 28
      // 24: invokestatic net/minecraft/network/play/server/S3BPacketScoreboardObjective.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.s8q I
      // 2c: bipush 2
      // 2d: if_icmpne 53
      // 30: goto 37
      // 33: invokestatic net/minecraft/network/play/server/S3BPacketScoreboardObjective.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 1
      // 38: aload 0
      // 39: getfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.zq_ Ljava/lang/String;
      // 3c: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 3f: pop
      // 40: goto 47
      // 43: invokestatic net/minecraft/network/play/server/S3BPacketScoreboardObjective.a (Loov;)Loov;
      // 46: athrow
      // 47: aload 1
      // 48: aload 0
      // 49: getfield net/minecraft/network/play/server/S3BPacketScoreboardObjective.cjf Lz0w$enz;
      // 4c: invokevirtual z0w$enz.g9z ()Ljava/lang/String;
      // 4f: invokevirtual nfj.p3z (Ljava/lang/String;)Lnfj;
      // 52: pop
      // 53: return
   }

   public void l_1(jsv var1) {
      var1.ett(this);
   }

   public String ylr() {
      return this.l3y;
   }

   public String m93() {
      return this.zq_;
   }

   public int sl2() {
      return this.s8q;
   }

   public z0w$enz xfv() {
      return this.cjf;
   }

   @Override
   public void ito(yw3 var1) {
      this.l_1((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
