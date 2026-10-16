package net.minecraft.network.play.server;

import java.util.List;
import java.util.UUID;

public class S0CPacketSpawnPlayer implements mz2 {
   private int bd9;
   private UUID ghn;
   private int asn;
   private int jyv;
   private int j8a;
   private byte vbj;
   private byte s6b;
   private int fea;
   public wl1 p78;
   private List wh7;

   public S0CPacketSpawnPlayer() {
   }

   public S0CPacketSpawnPlayer(ha9 param1) {
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
      // 08: aload 1
      // 09: invokevirtual ha9.jwu ()I
      // 0c: putfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.bd9 I
      // 0f: aload 0
      // 10: aload 1
      // 11: invokevirtual ha9.x6l ()Lcom/mojang/authlib/GameProfile;
      // 14: invokevirtual com/mojang/authlib/GameProfile.getId ()Ljava/util/UUID;
      // 17: putfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.ghn Ljava/util/UUID;
      // 1a: aload 0
      // 1b: aload 1
      // 1c: getfield ha9.o2v D
      // 1f: ldc2_w 32.0
      // 22: dmul
      // 23: invokestatic fe6.jqf (D)I
      // 26: putfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.asn I
      // 29: astore 2
      // 2a: aload 0
      // 2b: aload 1
      // 2c: getfield ha9.kfp D
      // 2f: ldc2_w 32.0
      // 32: dmul
      // 33: invokestatic fe6.jqf (D)I
      // 36: putfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.jyv I
      // 39: aload 0
      // 3a: aload 1
      // 3b: getfield ha9.vbd D
      // 3e: ldc2_w 32.0
      // 41: dmul
      // 42: invokestatic fe6.jqf (D)I
      // 45: putfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.j8a I
      // 48: aload 0
      // 49: aload 1
      // 4a: getfield ha9.x5k F
      // 4d: ldc 256.0
      // 4f: nop
      // 50: fmul
      // 51: ldc 360.0
      // 53: nop
      // 54: fdiv
      // 55: f2i
      // 56: i2b
      // 57: putfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.vbj B
      // 5a: aload 0
      // 5b: aload 1
      // 5c: getfield ha9.y2i F
      // 5f: ldc 256.0
      // 61: nop
      // 62: fmul
      // 63: ldc 360.0
      // 65: nop
      // 66: fdiv
      // 67: f2i
      // 68: i2b
      // 69: putfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.s6b B
      // 6c: aload 1
      // 6d: getfield ha9.up_ Ljnq;
      // 70: invokevirtual jnq.dxs ()Lerg;
      // 73: astore 3
      // 74: aload 0
      // 75: aload 3
      // 76: aload 2
      // 77: ifnull 8d
      // 7a: ifnonnull 8c
      // 7d: goto 84
      // 80: invokestatic net/minecraft/network/play/server/S0CPacketSpawnPlayer.a (Loov;)Loov;
      // 83: athrow
      // 84: bipush 0
      // 85: goto 93
      // 88: invokestatic net/minecraft/network/play/server/S0CPacketSpawnPlayer.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 3
      // 8d: invokevirtual erg.gn1 ()Lu7m;
      // 90: invokestatic u7m._lo (Lu7m;)I
      // 93: putfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.fea I
      // 96: aload 0
      // 97: aload 1
      // 98: invokevirtual ha9.a0c ()Lwl1;
      // 9b: putfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.p78 Lwl1;
      // 9e: invokestatic EntityLivingBase.b ()[Li2h;
      // a1: ifnull b0
      // a4: ldc "IbOuy"
      // a6: invokestatic net/minecraft/network/play/server/S14PacketEntity.b (Ljava/lang/String;)V
      // a9: goto b0
      // ac: invokestatic net/minecraft/network/play/server/S0CPacketSpawnPlayer.a (Loov;)Loov;
      // af: athrow
      // b0: return
   }

   @Override
   public void ajj(nfj var1) {
      this.bd9 = var1.gux();
      this.ghn = var1.ac2();
      this.asn = var1.readInt();
      this.jyv = var1.readInt();
      this.j8a = var1.readInt();
      this.vbj = var1.readByte();
      this.s6b = var1.readByte();
      this.fea = var1.readShort();
      this.wh7 = wl1.glq(var1);
   }

   @Override
   public void ddd(nfj var1) {
      var1.tao(this.bd9);
      var1.n5q(this.ghn);
      var1.writeInt(this.asn);
      var1.writeInt(this.jyv);
      var1.writeInt(this.j8a);
      var1.writeByte(this.vbj);
      var1.writeByte(this.s6b);
      var1.writeShort(this.fea);
      this.p78.i3t(var1);
   }

   public void b21(jsv var1) {
      var1.rio(this);
   }

   public List io7() {
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
      // 05: getfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.wh7 Ljava/util/List;
      // 08: aload 1
      // 09: ifnull 2c
      // 0c: ifnonnull 28
      // 0f: goto 16
      // 12: invokestatic net/minecraft/network/play/server/S0CPacketSpawnPlayer.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 0
      // 18: getfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.p78 Lwl1;
      // 1b: invokevirtual wl1.bc2 ()Ljava/util/List;
      // 1e: putfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.wh7 Ljava/util/List;
      // 21: goto 28
      // 24: invokestatic net/minecraft/network/play/server/S0CPacketSpawnPlayer.a (Loov;)Loov;
      // 27: athrow
      // 28: aload 0
      // 29: getfield net/minecraft/network/play/server/S0CPacketSpawnPlayer.wh7 Ljava/util/List;
      // 2c: areturn
   }

   public int bog() {
      return this.bd9;
   }

   public UUID j_x() {
      return this.ghn;
   }

   public int dzt() {
      return this.asn;
   }

   public int pxw() {
      return this.jyv;
   }

   public int _bf() {
      return this.j8a;
   }

   public byte gx_() {
      return this.vbj;
   }

   public byte p1r() {
      return this.s6b;
   }

   public int collectTargets() {
      return this.fea;
   }

   @Override
   public void ito(yw3 var1) {
      this.b21((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
