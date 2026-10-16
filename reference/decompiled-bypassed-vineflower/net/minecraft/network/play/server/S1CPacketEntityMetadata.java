package net.minecraft.network.play.server;

import java.util.List;

public class S1CPacketEntityMetadata implements mz2 {
   private int s_f;
   private List odd;

   public S1CPacketEntityMetadata() {
   }

   public S1CPacketEntityMetadata(int param1, wl1 param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 4
      // 05: aload 0
      // 06: invokespecial java/lang/Object.<init> ()V
      // 09: aload 0
      // 0a: aload 4
      // 0c: ifnull 33
      // 0f: iload 1
      // 10: putfield net/minecraft/network/play/server/S1CPacketEntityMetadata.s_f I
      // 13: iload 3
      // 14: ifeq 2b
      // 17: aload 0
      // 18: aload 2
      // 19: invokevirtual wl1.bc2 ()Ljava/util/List;
      // 1c: putfield net/minecraft/network/play/server/S1CPacketEntityMetadata.odd Ljava/util/List;
      // 1f: aload 4
      // 21: ifnonnull 3a
      // 24: goto 2b
      // 27: invokestatic net/minecraft/network/play/server/S1CPacketEntityMetadata.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic net/minecraft/network/play/server/S1CPacketEntityMetadata.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 2
      // 34: invokevirtual wl1.cs_ ()Ljava/util/List;
      // 37: putfield net/minecraft/network/play/server/S1CPacketEntityMetadata.odd Ljava/util/List;
      // 3a: return
   }

   @Override
   public void ajj(nfj var1) {
      this.s_f = var1.gux();
      this.odd = wl1.glq(var1);
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.s_f);
      wl1.q_y(this.odd, var1);
   }

   public void iba(jsv var1) {
      var1.dgq(this);
   }

   public List cnt() {
      return this.odd;
   }

   public int n38() {
      return this.s_f;
   }

   @Override
   public void ito(yw3 var1) {
      this.iba((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
