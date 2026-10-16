public class cjz extends flo {
   public float vv5;

   public cjz(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(var1, var2, var4, var6, var8, var10, var12, 2.0F);
   }

   public cjz(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12, float var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.icv *= 0.01F;
      this.mop *= 0.01F;
      this.bw4 *= 0.01F;
      this.mop += 0.1;
      this.ysq *= 0.75F;
      this.ysq *= var14;
      this.vv5 = this.ysq;
      this.bx4 = 16;
      this.kvx = false;
      this.f0l(80);
   }

   @Override
   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = ((float)this.goc + var3) / (float)this.bx4 * 32.0F;
      var9 = fe6._f3(var9, 0.0F, 1.0F);
      this.ysq = this.vv5 * var9;
      super.oss(var1, var2, var3, var4, var5, var6, var7, var8);
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
      // 02: getfield cjz.o2v D
      // 05: putfield cjz.bc1 D
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield cjz.kfp D
      // 10: putfield cjz.o_z D
      // 13: istore 1
      // 14: aload 0
      // 15: aload 0
      // 16: getfield cjz.vbd D
      // 19: putfield cjz.a4d D
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield cjz.goc I
      // 21: dup_x1
      // 22: bipush 1
      // 23: iadd
      // 24: putfield cjz.goc I
      // 27: iload 1
      // 28: ifne 5d
      // 2b: aload 0
      // 2c: getfield cjz.bx4 I
      // 2f: if_icmplt 44
      // 32: goto 39
      // 35: invokestatic cjz.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual cjz._kl ()V
      // 3d: goto 44
      // 40: invokestatic cjz.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: aload 0
      // 46: getfield cjz.icv D
      // 49: aload 0
      // 4a: getfield cjz.mop D
      // 4d: aload 0
      // 4e: getfield cjz.bw4 D
      // 51: invokevirtual cjz.vjj (DDD)V
      // 54: aload 0
      // 55: getfield cjz.kfp D
      // 58: aload 0
      // 59: getfield cjz.o_z D
      // 5c: dcmpl
      // 5d: iload 1
      // 5e: ifne bd
      // 61: ifne 8a
      // 64: goto 6b
      // 67: invokestatic cjz.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 0
      // 6c: dup
      // 6d: getfield cjz.icv D
      // 70: ldc2_w 1.1
      // 73: dmul
      // 74: putfield cjz.icv D
      // 77: aload 0
      // 78: dup
      // 79: getfield cjz.bw4 D
      // 7c: ldc2_w 1.1
      // 7f: dmul
      // 80: putfield cjz.bw4 D
      // 83: goto 8a
      // 86: invokestatic cjz.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 0
      // 8b: dup
      // 8c: getfield cjz.icv D
      // 8f: ldc2_w 0.8600000143051147
      // 92: dmul
      // 93: putfield cjz.icv D
      // 96: aload 0
      // 97: dup
      // 98: getfield cjz.mop D
      // 9b: ldc2_w 0.8600000143051147
      // 9e: dmul
      // 9f: putfield cjz.mop D
      // a2: aload 0
      // a3: dup
      // a4: getfield cjz.bw4 D
      // a7: ldc2_w 0.8600000143051147
      // aa: dmul
      // ab: putfield cjz.bw4 D
      // ae: aload 0
      // af: iload 1
      // b0: ifne d4
      // b3: getfield cjz.lfk Z
      // b6: goto bd
      // b9: invokestatic cjz.a (Loov;)Loov;
      // bc: athrow
      // bd: ifeq df
      // c0: aload 0
      // c1: dup
      // c2: getfield cjz.icv D
      // c5: ldc2_w 0.699999988079071
      // c8: dmul
      // c9: putfield cjz.icv D
      // cc: aload 0
      // cd: goto d4
      // d0: invokestatic cjz.a (Loov;)Loov;
      // d3: athrow
      // d4: dup
      // d5: getfield cjz.bw4 D
      // d8: ldc2_w 0.699999988079071
      // db: dmul
      // dc: putfield cjz.bw4 D
      // df: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
