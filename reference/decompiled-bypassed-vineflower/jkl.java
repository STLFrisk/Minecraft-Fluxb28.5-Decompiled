public class jkl extends flo {
   private float n4m;

   public jkl(t9d var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.icv = this.icv * 0.01F + var8;
      this.mop = this.mop * 0.01F + var10;
      this.bw4 = this.bw4 * 0.01F + var12;
      this.o2v = this.o2v + (double)((this.z2d.nextFloat() - this.z2d.nextFloat()) * 0.05F);
      this.kfp = this.kfp + (double)((this.z2d.nextFloat() - this.z2d.nextFloat()) * 0.05F);
      this.vbd = this.vbd + (double)((this.z2d.nextFloat() - this.z2d.nextFloat()) * 0.05F);
      this.n4m = this.ysq;
      this.aeh = this.li4 = this.v5a = 1.0F;
      this.bx4 = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
      this.kvx = true;
      this.f0l(48);
   }

   @Override
   public void oss(q3g var1, i2h var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4;
      this.ysq = this.n4m * (1.0F - var9 * var9 * 0.5F);
      super.oss(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public int azk(float var1) {
      float var3 = ((float)this.goc + var1) / (float)this.bx4;
      var3 = fe6._f3(var3, 0.0F, 1.0F);
      int var4 = super.azk(var1);
      int var5 = var4 & 0xFF;
      int var6 = var4 >> 16 & 0xFF;
      int var10000 = t9d.c();
      var5 += (int)(var3 * 15.0F * 16.0F);
      int var2 = var10000;

      try {
         if (var2 != 0) {
            return var5 | 240;
         }

         if (var5 <= 240) {
            return var5 | var6 << 16;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      short var11 = 240;
      return var11 | var6 << 16;
   }

   @Override
   public float xeu(float var1) {
      float var2 = ((float)this.goc + var1) / (float)this.bx4;
      var2 = fe6._f3(var2, 0.0F, 1.0F);
      float var3 = super.xeu(var1);
      return var3 * var2 + (1.0F - var2);
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
      // 02: getfield jkl.o2v D
      // 05: putfield jkl.bc1 D
      // 08: aload 0
      // 09: aload 0
      // 0a: getfield jkl.kfp D
      // 0d: putfield jkl.o_z D
      // 10: invokestatic t9d.b ()I
      // 13: aload 0
      // 14: aload 0
      // 15: getfield jkl.vbd D
      // 18: putfield jkl.a4d D
      // 1b: istore 1
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield jkl.goc I
      // 21: dup_x1
      // 22: bipush 1
      // 23: iadd
      // 24: putfield jkl.goc I
      // 27: iload 1
      // 28: ifeq 87
      // 2b: aload 0
      // 2c: getfield jkl.bx4 I
      // 2f: if_icmplt 44
      // 32: goto 39
      // 35: invokestatic jkl.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual jkl._kl ()V
      // 3d: goto 44
      // 40: invokestatic jkl.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: aload 0
      // 46: getfield jkl.icv D
      // 49: aload 0
      // 4a: getfield jkl.mop D
      // 4d: aload 0
      // 4e: getfield jkl.bw4 D
      // 51: invokevirtual jkl.vjj (DDD)V
      // 54: aload 0
      // 55: dup
      // 56: getfield jkl.icv D
      // 59: ldc2_w 0.9599999785423279
      // 5c: dmul
      // 5d: putfield jkl.icv D
      // 60: aload 0
      // 61: dup
      // 62: getfield jkl.mop D
      // 65: ldc2_w 0.9599999785423279
      // 68: dmul
      // 69: putfield jkl.mop D
      // 6c: aload 0
      // 6d: dup
      // 6e: getfield jkl.bw4 D
      // 71: ldc2_w 0.9599999785423279
      // 74: dmul
      // 75: putfield jkl.bw4 D
      // 78: aload 0
      // 79: iload 1
      // 7a: ifeq 9e
      // 7d: getfield jkl.lfk Z
      // 80: goto 87
      // 83: invokestatic jkl.a (Loov;)Loov;
      // 86: athrow
      // 87: ifeq a9
      // 8a: aload 0
      // 8b: dup
      // 8c: getfield jkl.icv D
      // 8f: ldc2_w 0.699999988079071
      // 92: dmul
      // 93: putfield jkl.icv D
      // 96: aload 0
      // 97: goto 9e
      // 9a: invokestatic jkl.a (Loov;)Loov;
      // 9d: athrow
      // 9e: dup
      // 9f: getfield jkl.bw4 D
      // a2: ldc2_w 0.699999988079071
      // a5: dmul
      // a6: putfield jkl.bw4 D
      // a9: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
