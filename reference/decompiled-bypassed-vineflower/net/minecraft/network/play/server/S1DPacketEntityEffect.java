package net.minecraft.network.play.server;

public class S1DPacketEntityEffect implements mz2 {
   public S1DPacketEntityEffect() {
   }

   public S1DPacketEntityEffect(int param1, sdj param2) {
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
      // 09: putfield net/minecraft/network/play/server/S1DPacketEntityEffect.zcg I
      // 0c: astore 3
      // 0d: aload 0
      // 0e: aload 2
      // 0f: invokevirtual sdj._na ()I
      // 12: sipush 255
      // 15: iand
      // 16: i2b
      // 17: putfield net/minecraft/network/play/server/S1DPacketEntityEffect.oi1 B
      // 1a: aload 0
      // 1b: aload 2
      // 1c: invokevirtual sdj.tus ()I
      // 1f: sipush 255
      // 22: iand
      // 23: i2b
      // 24: aload 3
      // 25: ifnull 5a
      // 28: putfield net/minecraft/network/play/server/S1DPacketEntityEffect.djx B
      // 2b: aload 2
      // 2c: invokevirtual sdj.ltp ()I
      // 2f: sipush 32767
      // 32: if_icmple 4e
      // 35: goto 3c
      // 38: invokestatic net/minecraft/network/play/server/S1DPacketEntityEffect.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: sipush 32767
      // 40: putfield net/minecraft/network/play/server/S1DPacketEntityEffect.ndx I
      // 43: aload 3
      // 44: ifnonnull 5d
      // 47: goto 4e
      // 4a: invokestatic net/minecraft/network/play/server/S1DPacketEntityEffect.a (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 2
      // 50: invokevirtual sdj.ltp ()I
      // 53: goto 5a
      // 56: invokestatic net/minecraft/network/play/server/S1DPacketEntityEffect.a (Loov;)Loov;
      // 59: athrow
      // 5a: putfield net/minecraft/network/play/server/S1DPacketEntityEffect.ndx I
      // 5d: aload 0
      // 5e: aload 2
      // 5f: invokevirtual sdj.ixu ()Z
      // 62: aload 3
      // 63: ifnull 71
      // 66: ifeq 74
      // 69: goto 70
      // 6c: invokestatic net/minecraft/network/play/server/S1DPacketEntityEffect.a (Loov;)Loov;
      // 6f: athrow
      // 70: bipush 1
      // 71: goto 75
      // 74: bipush 0
      // 75: i2b
      // 76: putfield net/minecraft/network/play/server/S1DPacketEntityEffect.j15 B
      // 79: return
   }

   @Override
   public void ajj(nfj var1) {
      this.zcg = var1.gux();
      this.oi1 = var1.readByte();
      this.djx = var1.readByte();
      this.ndx = var1.gux();
      this.j15 = var1.readByte();
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.zcg);
      var1.writeByte(this.oi1);
      var1.writeByte(this.djx);
      var1.tao(this.ndx);
      var1.writeByte(this.j15);
   }

   public boolean vh4() {
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
      // 05: getfield net/minecraft/network/play/server/S1DPacketEntityEffect.ndx I
      // 08: aload 1
      // 09: ifnull 21
      // 0c: sipush 32767
      // 0f: if_icmpne 24
      // 12: goto 19
      // 15: invokestatic net/minecraft/network/play/server/S1DPacketEntityEffect.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 1
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/network/play/server/S1DPacketEntityEffect.a (Loov;)Loov;
      // 20: athrow
      // 21: goto 25
      // 24: bipush 0
      // 25: ireturn
   }

   public void cza(jsv var1) {
      var1.ntc(this);
   }

   public int _6l() {
      return this.zcg;
   }

   public byte tmj() {
      return this.oi1;
   }

   public byte zex() {
      return this.djx;
   }

   public int bh9() {
      return this.ndx;
   }

   public boolean fww() {
      String var1 = S14PacketEntity.b();

      try {
         if (var1 == null) {
            return (boolean)this.j15;
         }

         if (this.j15 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   @Override
   public void ito(yw3 var1) {
      this.cza((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
