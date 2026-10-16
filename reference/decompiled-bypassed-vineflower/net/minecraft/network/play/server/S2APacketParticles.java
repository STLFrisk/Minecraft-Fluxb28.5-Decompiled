package net.minecraft.network.play.server;

public class S2APacketParticles implements mz2 {
   public S2APacketParticles() {
   }

   public S2APacketParticles(w_0 var1, boolean var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, int[] var11) {
      this.qh7 = var1;
      this.qs1 = var2;
      this.hw0 = var3;
      this.apb = var4;
      this.wig = var5;
      this.itz = var6;
      this.ts7 = var7;
      this.bq7 = var8;
      this.inn = var9;
      this.il6 = var10;
      this._y3 = var11;
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
      // 00: invokestatic net/minecraft/network/play/server/S14PacketEntity.b ()Ljava/lang/String;
      // 03: astore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual nfj.readInt ()I
      // 09: invokestatic w_0.zb1 (I)Lw_0;
      // 0c: putfield net/minecraft/network/play/server/S2APacketParticles.qh7 Lw_0;
      // 0f: aload 0
      // 10: getfield net/minecraft/network/play/server/S2APacketParticles.qh7 Lw_0;
      // 13: aload 2
      // 14: ifnull 7b
      // 17: ifnonnull 2f
      // 1a: goto 21
      // 1d: invokestatic net/minecraft/network/play/server/S2APacketParticles.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getstatic w_0.o7n Lw_0;
      // 25: putfield net/minecraft/network/play/server/S2APacketParticles.qh7 Lw_0;
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/network/play/server/S2APacketParticles.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: aload 1
      // 31: invokevirtual nfj.readBoolean ()Z
      // 34: putfield net/minecraft/network/play/server/S2APacketParticles.qs1 Z
      // 37: aload 0
      // 38: aload 1
      // 39: invokevirtual nfj.readFloat ()F
      // 3c: putfield net/minecraft/network/play/server/S2APacketParticles.hw0 F
      // 3f: aload 0
      // 40: aload 1
      // 41: invokevirtual nfj.readFloat ()F
      // 44: putfield net/minecraft/network/play/server/S2APacketParticles.apb F
      // 47: aload 0
      // 48: aload 1
      // 49: invokevirtual nfj.readFloat ()F
      // 4c: putfield net/minecraft/network/play/server/S2APacketParticles.wig F
      // 4f: aload 0
      // 50: aload 1
      // 51: invokevirtual nfj.readFloat ()F
      // 54: putfield net/minecraft/network/play/server/S2APacketParticles.itz F
      // 57: aload 0
      // 58: aload 1
      // 59: invokevirtual nfj.readFloat ()F
      // 5c: putfield net/minecraft/network/play/server/S2APacketParticles.ts7 F
      // 5f: aload 0
      // 60: aload 1
      // 61: invokevirtual nfj.readFloat ()F
      // 64: putfield net/minecraft/network/play/server/S2APacketParticles.bq7 F
      // 67: aload 0
      // 68: aload 1
      // 69: invokevirtual nfj.readFloat ()F
      // 6c: putfield net/minecraft/network/play/server/S2APacketParticles.inn F
      // 6f: aload 0
      // 70: aload 1
      // 71: invokevirtual nfj.readInt ()I
      // 74: putfield net/minecraft/network/play/server/S2APacketParticles.il6 I
      // 77: aload 0
      // 78: getfield net/minecraft/network/play/server/S2APacketParticles.qh7 Lw_0;
      // 7b: invokevirtual w_0.f5r ()I
      // 7e: istore 3
      // 7f: aload 0
      // 80: iload 3
      // 81: newarray 10
      // 83: putfield net/minecraft/network/play/server/S2APacketParticles._y3 [I
      // 86: bipush 0
      // 87: istore 4
      // 89: iload 4
      // 8b: iload 3
      // 8c: if_icmpge a1
      // 8f: aload 0
      // 90: getfield net/minecraft/network/play/server/S2APacketParticles._y3 [I
      // 93: iload 4
      // 95: aload 1
      // 96: invokevirtual nfj.gux ()I
      // 99: iastore
      // 9a: iinc 4 1
      // 9d: aload 2
      // 9e: ifnonnull 89
      // a1: return
   }

   @Override
   public void ddd(nfj var1) {
      var1.writeInt(this.qh7.ewe());
      var1.writeBoolean(this.qs1);
      var1.writeFloat(this.hw0);
      String var10000 = S14PacketEntity.b();
      var1.writeFloat(this.apb);
      var1.writeFloat(this.wig);
      var1.writeFloat(this.itz);
      String var2 = var10000;
      var1.writeFloat(this.ts7);
      var1.writeFloat(this.bq7);
      var1.writeFloat(this.inn);
      var1.writeInt(this.il6);
      int var3 = this.qh7.f5r();
      int var4 = 0;

      while (var4 < var3) {
         var1.tao(this._y3[var4]);
         var4++;
         if (var2 == null) {
            break;
         }
      }
   }

   public w_0 gl6() {
      return this.qh7;
   }

   public boolean ci5() {
      return this.qs1;
   }

   public double _ns() {
      return (double)this.hw0;
   }

   public double e8b() {
      return (double)this.apb;
   }

   public double i0a() {
      return (double)this.wig;
   }

   public float rr_() {
      return this.itz;
   }

   public float u35() {
      return this.ts7;
   }

   public float xjs() {
      return this.bq7;
   }

   public float gzr() {
      return this.inn;
   }

   public int eea() {
      return this.il6;
   }

   public int[] xd8() {
      return this._y3;
   }

   public void cb3(jsv var1) {
      var1.anq(this);
   }

   @Override
   public void ito(yw3 var1) {
      this.cb3((jsv)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
