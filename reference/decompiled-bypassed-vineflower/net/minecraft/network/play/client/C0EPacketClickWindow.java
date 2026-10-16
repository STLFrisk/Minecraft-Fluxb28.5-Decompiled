package net.minecraft.network.play.client;

public class C0EPacketClickWindow implements mz2 {
   public C0EPacketClickWindow() {
   }

   public C0EPacketClickWindow(int param1, int param2, int param3, int param4, erg param5, short param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial java/lang/Object.<init> ()V
      // 04: aload 0
      // 05: iload 1
      // 06: putfield net/minecraft/network/play/client/C0EPacketClickWindow.kku I
      // 09: invokestatic net/minecraft/network/play/client/C03PacketPlayer.b ()[Li2h;
      // 0c: aload 0
      // 0d: iload 2
      // 0e: putfield net/minecraft/network/play/client/C0EPacketClickWindow.k44 I
      // 11: astore 7
      // 13: aload 0
      // 14: iload 3
      // 15: putfield net/minecraft/network/play/client/C0EPacketClickWindow.dd5 I
      // 18: aload 0
      // 19: aload 5
      // 1b: aload 7
      // 1d: ifnonnull 36
      // 20: ifnull 39
      // 23: goto 2a
      // 26: invokestatic net/minecraft/network/play/client/C0EPacketClickWindow.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 5
      // 2c: invokevirtual erg.yaq ()Lerg;
      // 2f: goto 36
      // 32: invokestatic net/minecraft/network/play/client/C0EPacketClickWindow.a (Loov;)Loov;
      // 35: athrow
      // 36: goto 3a
      // 39: aconst_null
      // 3a: putfield net/minecraft/network/play/client/C0EPacketClickWindow.oot Lerg;
      // 3d: aload 0
      // 3e: iload 6
      // 40: putfield net/minecraft/network/play/client/C0EPacketClickWindow._ws S
      // 43: aload 0
      // 44: iload 4
      // 46: putfield net/minecraft/network/play/client/C0EPacketClickWindow.shb I
      // 49: return
   }

   public void a25(no5 var1) {
      var1.u0n(this);
   }

   @Override
   public void ajj(nfj var1) {
      this.kku = var1.readByte();
      this.k44 = var1.readShort();
      this.dd5 = var1.readByte();
      this._ws = var1.readShort();
      this.shb = var1.readByte();
      this.oot = var1.x4d();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.kku);
      var1.writeShort(this.k44);
      var1.writeByte(this.dd5);
      var1.writeShort(this._ws);
      var1.writeByte(this.shb);
      var1.a6a(this.oot);
   }

   public int okj() {
      return this.kku;
   }

   public int ig4() {
      return this.k44;
   }

   public int sq6() {
      return this.dd5;
   }

   public short lhq() {
      return this._ws;
   }

   public erg zo5() {
      return this.oot;
   }

   public int bzn() {
      return this.shb;
   }

   @Override
   public void ito(yw3 var1) {
      this.a25((no5)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
