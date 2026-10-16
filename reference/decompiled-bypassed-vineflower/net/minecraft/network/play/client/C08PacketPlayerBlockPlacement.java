package net.minecraft.network.play.client;

public class C08PacketPlayerBlockPlacement implements mz2 {
   public C08PacketPlayerBlockPlacement() {
   }

   public C08PacketPlayerBlockPlacement(erg var1) {
      this(i_a, 255, var1, 0.0F, 0.0F, 0.0F);
   }

   public C08PacketPlayerBlockPlacement(mew param1, int param2, erg param3, float param4, float param5, float param6) {
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
      // 08: aload 1
      // 09: putfield net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.u3_ Lmew;
      // 0c: aload 0
      // 0d: iload 2
      // 0e: putfield net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.t2a I
      // 11: astore 7
      // 13: aload 0
      // 14: aload 3
      // 15: aload 7
      // 17: ifnonnull 2f
      // 1a: ifnull 32
      // 1d: goto 24
      // 20: invokestatic net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.a (Loov;)Loov;
      // 23: athrow
      // 24: aload 3
      // 25: invokevirtual erg.yaq ()Lerg;
      // 28: goto 2f
      // 2b: invokestatic net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.a (Loov;)Loov;
      // 2e: athrow
      // 2f: goto 33
      // 32: aconst_null
      // 33: putfield net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.tg1 Lerg;
      // 36: aload 0
      // 37: fload 4
      // 39: putfield net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.vgc F
      // 3c: aload 0
      // 3d: fload 5
      // 3f: putfield net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.ueg F
      // 42: aload 0
      // 43: fload 6
      // 45: putfield net/minecraft/network/play/client/C08PacketPlayerBlockPlacement.iua F
      // 48: return
   }

   @Override
   public void ajj(nfj var1) {
      this.u3_ = var1.jh0();
      this.t2a = var1.readUnsignedByte();
      this.tg1 = var1.x4d();
      this.vgc = (float)var1.readUnsignedByte() / 16.0F;
      this.ueg = (float)var1.readUnsignedByte() / 16.0F;
      this.iua = (float)var1.readUnsignedByte() / 16.0F;
   }

   @Override
   public void ddd(nfj var1) {
      var1.l3a(this.u3_);
      var1.writeByte(this.t2a);
      var1.a6a(this.tg1);
      C03PacketPlayer.b();
      var1.writeByte((int)(this.vgc * 16.0F));
      var1.writeByte((int)(this.ueg * 16.0F));

      try {
         var1.writeByte((int)(this.iua * 16.0F));
         if (i2h.b() != null) {
            C03PacketPlayer.b(new i2h[1]);
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   public void tcp(no5 var1) {
      var1.k4i(this);
   }

   public mew uky() {
      return this.u3_;
   }

   public int mnb() {
      return this.t2a;
   }

   public erg c7n() {
      return this.tg1;
   }

   public float jpw() {
      return this.vgc;
   }

   public float zxm() {
      return this.ueg;
   }

   public float vx2() {
      return this.iua;
   }

   @Override
   public void ito(yw3 var1) {
      this.tcp((no5)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
