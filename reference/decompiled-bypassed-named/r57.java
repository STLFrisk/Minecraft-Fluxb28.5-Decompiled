public class r57 extends flo {
   public r57(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.icv *= 0.3F;
      this.mop = Math.random() * 0.2F + 0.1F;
      this.bw4 *= 0.3F;
      this.aeh = 1.0F;
      this.li4 = 1.0F;
      this.v5a = 1.0F;
      this.f0l(19);
      this.yxc(0.01F, 0.01F);
      this.bx4 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.xx_ = 0.0F;
      this.icv = var8;
      this.mop = var10;
      this.bw4 = var12;
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
      // 02: getfield r57.o2v D
      // 05: putfield r57.bc1 D
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield r57.kfp D
      // 10: putfield r57.o_z D
      // 13: istore 1
      // 14: aload 0
      // 15: aload 0
      // 16: getfield r57.vbd D
      // 19: putfield r57.a4d D
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield r57.mop D
      // 21: aload 0
      // 22: getfield r57.xx_ F
      // 25: f2d
      // 26: dsub
      // 27: putfield r57.mop D
      // 2a: aload 0
      // 2b: aload 0
      // 2c: getfield r57.icv D
      // 2f: aload 0
      // 30: getfield r57.mop D
      // 33: aload 0
      // 34: getfield r57.bw4 D
      // 37: invokevirtual r57.vjj (DDD)V
      // 3a: aload 0
      // 3b: dup
      // 3c: getfield r57.icv D
      // 3f: ldc2_w 0.9800000190734863
      // 42: dmul
      // 43: putfield r57.icv D
      // 46: aload 0
      // 47: dup
      // 48: getfield r57.mop D
      // 4b: ldc2_w 0.9800000190734863
      // 4e: dmul
      // 4f: putfield r57.mop D
      // 52: aload 0
      // 53: dup
      // 54: getfield r57.bw4 D
      // 57: ldc2_w 0.9800000190734863
      // 5a: dmul
      // 5b: putfield r57.bw4 D
      // 5e: bipush 60
      // 60: aload 0
      // 61: getfield r57.bx4 I
      // 64: isub
      // 65: istore 2
      // 66: iload 2
      // 67: i2f
      // 68: ldc 0.001
      // 6a: nop
      // 6b: fmul
      // 6c: fstore 3
      // 6d: aload 0
      // 6e: fload 3
      // 6f: fload 3
      // 70: invokevirtual r57.yxc (FF)V
      // 73: aload 0
      // 74: bipush 19
      // 76: iload 2
      // 77: bipush 4
      // 78: irem
      // 79: iadd
      // 7a: invokevirtual r57.f0l (I)V
      // 7d: aload 0
      // 7e: iload 1
      // 7f: ifeq 9e
      // 82: dup
      // 83: getfield r57.bx4 I
      // 86: dup_x1
      // 87: bipush 1
      // 88: isub
      // 89: putfield r57.bx4 I
      // 8c: ifgt a1
      // 8f: goto 96
      // 92: invokestatic r57.a (Loov;)Loov;
      // 95: athrow
      // 96: aload 0
      // 97: goto 9e
      // 9a: invokestatic r57.a (Loov;)Loov;
      // 9d: athrow
      // 9e: invokevirtual r57._kl ()V
      // a1: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
