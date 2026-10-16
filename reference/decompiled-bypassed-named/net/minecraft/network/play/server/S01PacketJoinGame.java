package net.minecraft.network.play.server;

public class S01PacketJoinGame implements mz2 {
   private int okd;
   private boolean pet;
   private h50$f05 h7p;
   private int q1w;
   private v66 c5n;
   private int oe5;
   private gxq pu8;
   private boolean x8p;

   public S01PacketJoinGame() {
   }

   public S01PacketJoinGame(int var1, h50$f05 var2, boolean var3, int var4, v66 var5, int var6, gxq var7, boolean var8) {
      this.okd = var1;
      this.q1w = var4;
      this.c5n = var5;
      this.h7p = var2;
      this.oe5 = var6;
      this.pet = var3;
      this.pu8 = var7;
      this.x8p = var8;
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
      // 05: putfield net/minecraft/network/play/server/S01PacketJoinGame.okd I
      // 08: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 0b: aload 1
      // 0c: invokevirtual nfj.readUnsignedByte ()S
      // 0f: istore 3
      // 10: astore 2
      // 11: aload 0
      // 12: iload 3
      // 13: bipush 8
      // 15: iand
      // 16: aload 2
      // 17: ifnull 2e
      // 1a: bipush 8
      // 1c: if_icmpne 31
      // 1f: goto 26
      // 22: invokestatic net/minecraft/network/play/server/S01PacketJoinGame.a (Loov;)Loov;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2e
      // 2a: invokestatic net/minecraft/network/play/server/S01PacketJoinGame.a (Loov;)Loov;
      // 2d: athrow
      // 2e: goto 32
      // 31: bipush 0
      // 32: putfield net/minecraft/network/play/server/S01PacketJoinGame.pet Z
      // 35: iload 3
      // 36: bipush -9
      // 38: iand
      // 39: istore 3
      // 3a: aload 0
      // 3b: iload 3
      // 3c: invokestatic h50$f05.e9x (I)Lh50$f05;
      // 3f: putfield net/minecraft/network/play/server/S01PacketJoinGame.h7p Lh50$f05;
      // 42: aload 0
      // 43: aload 1
      // 44: invokevirtual nfj.readByte ()B
      // 47: putfield net/minecraft/network/play/server/S01PacketJoinGame.q1w I
      // 4a: aload 0
      // 4b: aload 1
      // 4c: invokevirtual nfj.readUnsignedByte ()S
      // 4f: invokestatic v66.n4n (I)Lv66;
      // 52: putfield net/minecraft/network/play/server/S01PacketJoinGame.c5n Lv66;
      // 55: aload 0
      // 56: aload 1
      // 57: invokevirtual nfj.readUnsignedByte ()S
      // 5a: putfield net/minecraft/network/play/server/S01PacketJoinGame.oe5 I
      // 5d: aload 0
      // 5e: aload 1
      // 5f: bipush 16
      // 61: invokevirtual nfj.oa5 (I)Ljava/lang/String;
      // 64: invokestatic gxq.s8v (Ljava/lang/String;)Lgxq;
      // 67: putfield net/minecraft/network/play/server/S01PacketJoinGame.pu8 Lgxq;
      // 6a: aload 0
      // 6b: aload 2
      // 6c: ifnull 8b
      // 6f: getfield net/minecraft/network/play/server/S01PacketJoinGame.pu8 Lgxq;
      // 72: ifnonnull 8a
      // 75: goto 7c
      // 78: invokestatic net/minecraft/network/play/server/S01PacketJoinGame.a (Loov;)Loov;
      // 7b: athrow
      // 7c: aload 0
      // 7d: getstatic gxq.qg6 Lgxq;
      // 80: putfield net/minecraft/network/play/server/S01PacketJoinGame.pu8 Lgxq;
      // 83: goto 8a
      // 86: invokestatic net/minecraft/network/play/server/S01PacketJoinGame.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 0
      // 8b: aload 1
      // 8c: invokevirtual nfj.readBoolean ()Z
      // 8f: putfield net/minecraft/network/play/server/S01PacketJoinGame.x8p Z
      // 92: return
   }

   @Override
   public void ddd(nfj var1) {
      String var2 = S14PacketEntity.b();
      var1.writeInt(this.okd);
      int var3 = this.h7p.xzh();

      label20: {
         try {
            if (var2 == null) {
               return;
            }

            if (!this.pet) {
               break label20;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var3 |= 8;
      }

      var1.writeByte(var3);
      var1.writeByte(this.q1w);
      var1.writeByte(this.c5n.dzc());
      var1.writeByte(this.oe5);
      var1.p3z(this.pu8.j45());
      var1.writeBoolean(this.x8p);
   }

   public void zrr(jsv var1) {
      var1.yuf(this);
   }

   public int ey8() {
      return this.okd;
   }

   public boolean alc() {
      return this.pet;
   }

   public h50$f05 xoj() {
      return this.h7p;
   }

   public int z6k() {
      return this.q1w;
   }

   public v66 dn2() {
      return this.c5n;
   }

   public int zb2() {
      return this.oe5;
   }

   public gxq v8i() {
      return this.pu8;
   }

   public boolean zbl() {
      return this.x8p;
   }

   @Override
   public void ito(yw3 var1) {
      this.zrr((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
