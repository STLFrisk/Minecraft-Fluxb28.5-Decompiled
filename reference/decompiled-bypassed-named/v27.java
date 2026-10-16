public class v27 extends flo {
   public v27(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.icv = var8 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.mop = var10 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.bw4 = var12 + (Math.random() * 2.0 - 1.0) * 0.05F;
      this.aeh = this.li4 = this.v5a = this.z2d.nextFloat() * 0.3F + 0.7F;
      this.ysq = this.z2d.nextFloat() * this.z2d.nextFloat() * 6.0F + 1.0F;
      this.bx4 = (int)(16.0 / ((double)this.z2d.nextFloat() * 0.8 + 0.2)) + 2;
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
      // 02: getfield v27.o2v D
      // 05: putfield v27.bc1 D
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield v27.kfp D
      // 10: putfield v27.o_z D
      // 13: istore 1
      // 14: aload 0
      // 15: aload 0
      // 16: getfield v27.vbd D
      // 19: putfield v27.a4d D
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield v27.goc I
      // 21: dup_x1
      // 22: bipush 1
      // 23: iadd
      // 24: putfield v27.goc I
      // 27: iload 1
      // 28: ifne a6
      // 2b: aload 0
      // 2c: getfield v27.bx4 I
      // 2f: if_icmplt 44
      // 32: goto 39
      // 35: invokestatic v27.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual v27._kl ()V
      // 3d: goto 44
      // 40: invokestatic v27.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: bipush 7
      // 47: aload 0
      // 48: getfield v27.goc I
      // 4b: bipush 8
      // 4d: imul
      // 4e: aload 0
      // 4f: getfield v27.bx4 I
      // 52: idiv
      // 53: isub
      // 54: invokevirtual v27.f0l (I)V
      // 57: aload 0
      // 58: dup
      // 59: getfield v27.mop D
      // 5c: ldc2_w 0.004
      // 5f: dadd
      // 60: putfield v27.mop D
      // 63: aload 0
      // 64: aload 0
      // 65: getfield v27.icv D
      // 68: aload 0
      // 69: getfield v27.mop D
      // 6c: aload 0
      // 6d: getfield v27.bw4 D
      // 70: invokevirtual v27.vjj (DDD)V
      // 73: aload 0
      // 74: dup
      // 75: getfield v27.icv D
      // 78: ldc2_w 0.8999999761581421
      // 7b: dmul
      // 7c: putfield v27.icv D
      // 7f: aload 0
      // 80: dup
      // 81: getfield v27.mop D
      // 84: ldc2_w 0.8999999761581421
      // 87: dmul
      // 88: putfield v27.mop D
      // 8b: aload 0
      // 8c: dup
      // 8d: getfield v27.bw4 D
      // 90: ldc2_w 0.8999999761581421
      // 93: dmul
      // 94: putfield v27.bw4 D
      // 97: aload 0
      // 98: iload 1
      // 99: ifne bd
      // 9c: getfield v27.lfk Z
      // 9f: goto a6
      // a2: invokestatic v27.a (Loov;)Loov;
      // a5: athrow
      // a6: ifeq c8
      // a9: aload 0
      // aa: dup
      // ab: getfield v27.icv D
      // ae: ldc2_w 0.699999988079071
      // b1: dmul
      // b2: putfield v27.icv D
      // b5: aload 0
      // b6: goto bd
      // b9: invokestatic v27.a (Loov;)Loov;
      // bc: athrow
      // bd: dup
      // be: getfield v27.bw4 D
      // c1: ldc2_w 0.699999988079071
      // c4: dmul
      // c5: putfield v27.bw4 D
      // c8: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
