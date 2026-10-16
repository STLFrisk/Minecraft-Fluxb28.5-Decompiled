package net.minecraft.network.play.server;

public class S2EPacketCloseWindow implements mz2 {
   public S2EPacketCloseWindow() {
   }

   public S2EPacketCloseWindow(int var1) {
      this.ho5 = var1;
   }

   public void z4i(jsv param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 2
      // 04: getstatic ClientState.fq3 Lcn7;
      // 07: invokevirtual BooleanSetting.g7m ()Z
      // 0a: aload 2
      // 0b: ifnull 28
      // 0e: ifeq 2c
      // 11: goto 18
      // 14: invokestatic net/minecraft/network/play/server/S2EPacketCloseWindow.a (Loov;)Loov;
      // 17: athrow
      // 18: invokestatic Minecraft.vz1 ()Lc05;
      // 1b: getfield Minecraft.u0y Lgbe;
      // 1e: instanceof _ov
      // 21: goto 28
      // 24: invokestatic net/minecraft/network/play/server/S2EPacketCloseWindow.a (Loov;)Loov;
      // 27: athrow
      // 28: ifeq 2c
      // 2b: return
      // 2c: aload 1
      // 2d: aload 0
      // 2e: invokeinterface jsv.kww (Lnet/minecraft/network/play/server/S2EPacketCloseWindow;)V 2
      // 33: return
   }

   @Override
   public void ajj(nfj var1) {
      this.ho5 = var1.readUnsignedByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeByte(this.ho5);
   }

   @Override
   public void ito(yw3 var1) {
      this.z4i((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
