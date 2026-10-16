package net.minecraft.network.play.server;

public class S2FPacketSetSlot implements mz2 {
   public S2FPacketSetSlot() {
   }

   public S2FPacketSetSlot(int param1, int param2, erg param3) {
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
      // 08: iload 1
      // 09: putfield net/minecraft/network/play/server/S2FPacketSetSlot.n8a I
      // 0c: astore 4
      // 0e: aload 0
      // 0f: iload 2
      // 10: putfield net/minecraft/network/play/server/S2FPacketSetSlot.q_7 I
      // 13: aload 0
      // 14: aload 3
      // 15: aload 4
      // 17: ifnull 2d
      // 1a: ifnonnull 2c
      // 1d: goto 24
      // 20: invokestatic net/minecraft/network/play/server/S2FPacketSetSlot.a (Loov;)Loov;
      // 23: athrow
      // 24: aconst_null
      // 25: goto 30
      // 28: invokestatic net/minecraft/network/play/server/S2FPacketSetSlot.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 3
      // 2d: invokevirtual erg.yaq ()Lerg;
      // 30: putfield net/minecraft/network/play/server/S2FPacketSetSlot.llb Lerg;
      // 33: return
   }

   public void cf7(jsv var1) {
      var1.a0d(this);
   }

   @Override
   public void ajj(nfj var1) {
      this.n8a = var1.readByte();
      this.q_7 = var1.readShort();
      this.llb = var1.x4d();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.n8a);
      var1.writeShort(this.q_7);
      var1.a6a(this.llb);
   }

   public int s_u() {
      return this.n8a;
   }

   public int yo5() {
      return this.q_7;
   }

   public erg zia() {
      return this.llb;
   }

   @Override
   public void ito(yw3 var1) {
      this.cf7((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
