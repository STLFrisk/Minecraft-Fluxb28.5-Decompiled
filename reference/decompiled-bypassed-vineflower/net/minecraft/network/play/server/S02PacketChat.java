package net.minecraft.network.play.server;

public class S02PacketChat implements mz2 {
   public ekw yiu;

   public S02PacketChat() {
   }

   public S02PacketChat(ekw var1) {
      this(var1, (byte)1);
   }

   public S02PacketChat(ekw var1, byte var2) {
      this.yiu = var1;
      this.lzs = var2;
   }

   @Override
   public void ajj(nfj var1) {
      this.yiu = var1.wdz();
      this.lzs = var1.readByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.v7d(this.yiu);
      var1.writeByte(this.lzs);
   }

   public void ls2(jsv var1) {
      var1.y36(this);
   }

   public ekw m4c() {
      return this.yiu;
   }

   public boolean h7z() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 1
      // 04: aload 0
      // 05: getfield net/minecraft/network/play/server/S02PacketChat.lzs B
      // 08: aload 1
      // 09: ifnull 39
      // 0c: bipush 1
      // 0d: if_icmpeq 31
      // 10: goto 17
      // 13: invokestatic net/minecraft/network/play/server/S02PacketChat.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield net/minecraft/network/play/server/S02PacketChat.lzs B
      // 1b: aload 1
      // 1c: ifnull 39
      // 1f: goto 26
      // 22: invokestatic net/minecraft/network/play/server/S02PacketChat.a (Loov;)Loov;
      // 25: athrow
      // 26: bipush 2
      // 27: if_icmpne 3c
      // 2a: goto 31
      // 2d: invokestatic net/minecraft/network/play/server/S02PacketChat.a (Loov;)Loov;
      // 30: athrow
      // 31: bipush 1
      // 32: goto 39
      // 35: invokestatic net/minecraft/network/play/server/S02PacketChat.a (Loov;)Loov;
      // 38: athrow
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
   }

   public byte i53() {
      return this.lzs;
   }

   @Override
   public void ito(yw3 var1) {
      this.ls2((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
