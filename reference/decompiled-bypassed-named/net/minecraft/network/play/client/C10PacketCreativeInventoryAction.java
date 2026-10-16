package net.minecraft.network.play.client;

public class C10PacketCreativeInventoryAction implements mz2 {
   public C10PacketCreativeInventoryAction() {
   }

   public C10PacketCreativeInventoryAction(int param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: invokestatic net/minecraft/network/play/client/C03PacketPlayer.b ()[Li2h;
      // 07: aload 0
      // 08: iload 1
      // 09: putfield net/minecraft/network/play/client/C10PacketCreativeInventoryAction.zik I
      // 0c: astore 3
      // 0d: aload 0
      // 0e: aload 2
      // 0f: aload 3
      // 10: ifnonnull 28
      // 13: ifnull 2b
      // 16: goto 1d
      // 19: invokestatic net/minecraft/network/play/client/C10PacketCreativeInventoryAction.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 2
      // 1e: invokevirtual erg.yaq ()Lerg;
      // 21: goto 28
      // 24: invokestatic net/minecraft/network/play/client/C10PacketCreativeInventoryAction.a (Loov;)Loov;
      // 27: athrow
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: putfield net/minecraft/network/play/client/C10PacketCreativeInventoryAction.l51 Lerg;
      // 2f: return
   }

   public void p96(no5 var1) {
      var1.ppm(this);
   }

   @Override
   public void ajj(nfj var1) {
      this.zik = var1.readShort();
      this.l51 = var1.x4d();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeShort(this.zik);
      var1.a6a(this.l51);
   }

   public int xas() {
      return this.zik;
   }

   public erg dbs() {
      return this.l51;
   }

   @Override
   public void ito(yw3 var1) {
      this.p96((no5)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
