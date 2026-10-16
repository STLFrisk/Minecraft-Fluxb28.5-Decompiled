package net.minecraft.network.play.server;

public class S04PacketEntityEquipment implements mz2 {
   public S04PacketEntityEquipment() {
   }

   public S04PacketEntityEquipment(int param1, int param2, erg param3) {
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
      // 09: putfield net/minecraft/network/play/server/S04PacketEntityEquipment.d70 I
      // 0c: astore 4
      // 0e: aload 0
      // 0f: iload 2
      // 10: putfield net/minecraft/network/play/server/S04PacketEntityEquipment.fpo I
      // 13: aload 0
      // 14: aload 3
      // 15: aload 4
      // 17: ifnull 2d
      // 1a: ifnonnull 2c
      // 1d: goto 24
      // 20: invokestatic net/minecraft/network/play/server/S04PacketEntityEquipment.a (Loov;)Loov;
      // 23: athrow
      // 24: aconst_null
      // 25: goto 30
      // 28: invokestatic net/minecraft/network/play/server/S04PacketEntityEquipment.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 3
      // 2d: invokevirtual erg.yaq ()Lerg;
      // 30: putfield net/minecraft/network/play/server/S04PacketEntityEquipment.q1h Lerg;
      // 33: return
   }

   @Override
   public void ajj(nfj var1) {
      this.d70 = var1.gux();
      this.fpo = var1.readShort();
      this.q1h = var1.x4d();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.d70);
      var1.writeShort(this.fpo);
      var1.a6a(this.q1h);
   }

   public void r6b(jsv var1) {
      var1.j2v(this);
   }

   public erg ywl() {
      return this.q1h;
   }

   public int z63() {
      return this.d70;
   }

   public int uu8() {
      return this.fpo;
   }

   @Override
   public void ito(yw3 var1) {
      this.r6b((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
