public class pm1 extends flo {
   private float qk_;
   private double qnz;
   private double jqn;
   private double jfg;

   public pm1(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.icv = var8;
      this.mop = var10;
      this.bw4 = var12;
      this.qnz = var2;
      this.jqn = var4;
      this.jfg = var6;
      this.o2v = this.bc1 = var2 + var8;
      this.kfp = this.o_z = var4 + var10;
      this.vbd = this.a4d = var6 + var12;
      float var14 = this.z2d.nextFloat() * 0.6F + 0.4F;
      this.qk_ = this.ysq = this.z2d.nextFloat() * 0.5F + 0.2F;
      this.aeh = this.li4 = this.v5a = 1.0F * var14;
      this.li4 *= 0.9F;
      this.aeh *= 0.9F;
      this.bx4 = (int)(Math.random() * 10.0) + 30;
      this.kvx = true;
      this.f0l((int)(Math.random() * 26.0 + 1.0 + 224.0));
   }

   @Override
   public int azk(float var1) {
      int var3 = super.azk(var1);
      float var4 = (float)this.goc / (float)this.bx4;
      var4 *= var4;
      int var10000 = OpaquePredicate.b();
      var4 *= var4;
      int var2 = var10000;
      int var5 = var3 & 0xFF;
      int var6 = var3 >> 16 & 0xFF;
      var6 += (int)(var4 * 15.0F * 16.0F);

      try {
         if (var2 == 0) {
            return var6 | 240;
         }

         if (var6 <= 240) {
            return var5 | var6 << 16;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      short var12 = 240;
      return var5 | var12 << 16;
   }

   @Override
   public float xeu(float var1) {
      float var2 = super.xeu(var1);
      float var3 = (float)this.goc / (float)this.bx4;
      var3 *= var3;
      var3 *= var3;
      return var2 * (1.0F - var3) + var3;
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 0
      // 02: getfield pm1.o2v D
      // 05: putfield pm1.bc1 D
      // 08: aload 0
      // 09: aload 0
      // 0a: getfield pm1.kfp D
      // 0d: putfield pm1.o_z D
      // 10: aload 0
      // 11: aload 0
      // 12: getfield pm1.vbd D
      // 15: putfield pm1.a4d D
      // 18: aload 0
      // 19: getfield pm1.goc I
      // 1c: i2f
      // 1d: aload 0
      // 1e: getfield pm1.bx4 I
      // 21: i2f
      // 22: fdiv
      // 23: fstore 2
      // 24: fconst_1
      // 25: fload 2
      // 26: fsub
      // 27: fstore 2
      // 28: invokestatic OpaquePredicate.c ()I
      // 2b: fconst_1
      // 2c: fload 2
      // 2d: fsub
      // 2e: fstore 3
      // 2f: istore 1
      // 30: fload 3
      // 31: fload 3
      // 32: fmul
      // 33: fstore 3
      // 34: fload 3
      // 35: fload 3
      // 36: fmul
      // 37: fstore 3
      // 38: aload 0
      // 39: aload 0
      // 3a: getfield pm1.qnz D
      // 3d: aload 0
      // 3e: getfield pm1.icv D
      // 41: fload 2
      // 42: f2d
      // 43: dmul
      // 44: dadd
      // 45: putfield pm1.o2v D
      // 48: aload 0
      // 49: aload 0
      // 4a: getfield pm1.jqn D
      // 4d: aload 0
      // 4e: getfield pm1.mop D
      // 51: fload 2
      // 52: f2d
      // 53: dmul
      // 54: dadd
      // 55: fload 3
      // 56: ldc 1.2
      // 58: nop
      // 59: fmul
      // 5a: f2d
      // 5b: dsub
      // 5c: putfield pm1.kfp D
      // 5f: aload 0
      // 60: aload 0
      // 61: getfield pm1.jfg D
      // 64: aload 0
      // 65: getfield pm1.bw4 D
      // 68: fload 2
      // 69: f2d
      // 6a: dmul
      // 6b: dadd
      // 6c: putfield pm1.vbd D
      // 6f: aload 0
      // 70: iload 1
      // 71: ifne 94
      // 74: dup
      // 75: getfield pm1.goc I
      // 78: dup_x1
      // 79: bipush 1
      // 7a: iadd
      // 7b: putfield pm1.goc I
      // 7e: aload 0
      // 7f: getfield pm1.bx4 I
      // 82: if_icmplt 97
      // 85: goto 8c
      // 88: invokestatic pm1.a (Loov;)Loov;
      // 8b: athrow
      // 8c: aload 0
      // 8d: goto 94
      // 90: invokestatic pm1.a (Loov;)Loov;
      // 93: athrow
      // 94: invokevirtual pm1._kl ()V
      // 97: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
