public class f64 extends flo {
   private float pxk;
   private double ty6;
   private double h18;
   private double byc;

   public f64(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.icv = var8;
      this.mop = var10;
      this.bw4 = var12;
      this.ty6 = this.o2v = var2;
      this.h18 = this.kfp = var4;
      this.byc = this.vbd = var6;
      float var14 = this.z2d.nextFloat() * 0.6F + 0.4F;
      this.pxk = this.ysq = this.z2d.nextFloat() * 0.2F + 0.5F;
      this.aeh = this.li4 = this.v5a = 1.0F * var14;
      this.li4 *= 0.3F;
      this.aeh *= 0.9F;
      this.bx4 = (int)(Math.random() * 10.0) + 40;
      this.kvx = true;
      this.f0l((int)(Math.random() * 8.0));
   }

   @Override
   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4;
      var9 = 1.0F - var9;
      var9 *= var9;
      var9 = 1.0F - var9;
      this.ysq = this.pxk * var9;
      super.oss(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public int azk(float var1) {
      int var3 = super.azk(var1);
      float var4 = (float)this.goc / (float)this.bx4;
      var4 *= var4;
      int var10000 = OpaquePredicate.c();
      var4 *= var4;
      int var5 = var3 & 0xFF;
      int var2 = var10000;
      int var6 = var3 >> 16 & 0xFF;
      var6 += (int)(var4 * 15.0F * 16.0F);

      try {
         if (var2 != 0) {
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
      var3 = var3 * var3 * var3 * var3;
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
      // 02: getfield f64.o2v D
      // 05: putfield f64.bc1 D
      // 08: aload 0
      // 09: aload 0
      // 0a: getfield f64.kfp D
      // 0d: putfield f64.o_z D
      // 10: aload 0
      // 11: aload 0
      // 12: getfield f64.vbd D
      // 15: putfield f64.a4d D
      // 18: aload 0
      // 19: getfield f64.goc I
      // 1c: i2f
      // 1d: aload 0
      // 1e: getfield f64.bx4 I
      // 21: i2f
      // 22: fdiv
      // 23: fstore 2
      // 24: fload 2
      // 25: fneg
      // 26: fload 2
      // 27: fload 2
      // 28: fmul
      // 29: fconst_2
      // 2a: fmul
      // 2b: fadd
      // 2c: fstore 2
      // 2d: invokestatic OpaquePredicate.c ()I
      // 30: fconst_1
      // 31: fload 2
      // 32: fsub
      // 33: fstore 2
      // 34: istore 1
      // 35: aload 0
      // 36: aload 0
      // 37: getfield f64.ty6 D
      // 3a: aload 0
      // 3b: getfield f64.icv D
      // 3e: fload 2
      // 3f: f2d
      // 40: dmul
      // 41: dadd
      // 42: putfield f64.o2v D
      // 45: aload 0
      // 46: aload 0
      // 47: getfield f64.h18 D
      // 4a: aload 0
      // 4b: getfield f64.mop D
      // 4e: fload 2
      // 4f: f2d
      // 50: dmul
      // 51: dadd
      // 52: fconst_1
      // 53: fload 2
      // 54: fsub
      // 55: f2d
      // 56: dadd
      // 57: putfield f64.kfp D
      // 5a: aload 0
      // 5b: aload 0
      // 5c: getfield f64.byc D
      // 5f: aload 0
      // 60: getfield f64.bw4 D
      // 63: fload 2
      // 64: f2d
      // 65: dmul
      // 66: dadd
      // 67: putfield f64.vbd D
      // 6a: aload 0
      // 6b: iload 1
      // 6c: ifne 8f
      // 6f: dup
      // 70: getfield f64.goc I
      // 73: dup_x1
      // 74: bipush 1
      // 75: iadd
      // 76: putfield f64.goc I
      // 79: aload 0
      // 7a: getfield f64.bx4 I
      // 7d: if_icmplt 92
      // 80: goto 87
      // 83: invokestatic f64.a (Loov;)Loov;
      // 86: athrow
      // 87: aload 0
      // 88: goto 8f
      // 8b: invokestatic f64.a (Loov;)Loov;
      // 8e: athrow
      // 8f: invokevirtual f64._kl ()V
      // 92: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
