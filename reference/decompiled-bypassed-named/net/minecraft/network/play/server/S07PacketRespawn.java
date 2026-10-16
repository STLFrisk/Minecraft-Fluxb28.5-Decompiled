package net.minecraft.network.play.server;

public class S07PacketRespawn implements mz2 {
   private int oqk;
   private v66 swb;
   private h50$f05 foy;
   private gxq p6_;

   public S07PacketRespawn() {
   }

   public S07PacketRespawn(int var1, v66 var2, gxq var3, h50$f05 var4) {
      this.oqk = var1;
      this.swb = var2;
      this.foy = var4;
      this.p6_ = var3;
   }

   public void zf8(jsv var1) {
      var1.fdc(this);
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
      // 02: invokevirtual nfj.readInt ()I
      // 05: putfield net/minecraft/network/play/server/S07PacketRespawn.oqk I
      // 08: aload 0
      // 09: aload 1
      // 0a: invokevirtual nfj.readUnsignedByte ()S
      // 0d: invokestatic v66.n4n (I)Lv66;
      // 10: putfield net/minecraft/network/play/server/S07PacketRespawn.swb Lv66;
      // 13: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 16: aload 0
      // 17: aload 1
      // 18: invokevirtual nfj.readUnsignedByte ()S
      // 1b: invokestatic h50$f05.e9x (I)Lh50$f05;
      // 1e: putfield net/minecraft/network/play/server/S07PacketRespawn.foy Lh50$f05;
      // 21: astore 2
      // 22: aload 0
      // 23: aload 1
      // 24: bipush 16
      // 26: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 29: invokestatic gxq.s8v (Ljava/lang/String;)Lgxq;
      // 2c: putfield net/minecraft/network/play/server/S07PacketRespawn.p6_ Lgxq;
      // 2f: aload 0
      // 30: aload 2
      // 31: ifnull 49
      // 34: getfield net/minecraft/network/play/server/S07PacketRespawn.p6_ Lgxq;
      // 37: ifnonnull 4f
      // 3a: goto 41
      // 3d: invokestatic net/minecraft/network/play/server/S07PacketRespawn.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: goto 49
      // 45: invokestatic net/minecraft/network/play/server/S07PacketRespawn.a (Loov;)Loov;
      // 48: athrow
      // 49: getstatic gxq.qg6 Lgxq;
      // 4c: putfield net/minecraft/network/play/server/S07PacketRespawn.p6_ Lgxq;
      // 4f: return
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeInt(this.oqk);
      var1.writeByte(this.swb.dzc());
      var1.writeByte(this.foy.xzh());
      var1.p3z(this.p6_.j45());
   }

   public int qti() {
      return this.oqk;
   }

   public v66 cno() {
      return this.swb;
   }

   public h50$f05 e15() {
      return this.foy;
   }

   public gxq vl4() {
      return this.p6_;
   }

   @Override
   public void ito(yw3 var1) {
      this.zf8((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
