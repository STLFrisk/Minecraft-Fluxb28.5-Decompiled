public class etr extends flo {
   public etr(OpaquePredicate var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.aeh = 1.0F;
      this.li4 = 1.0F;
      this.v5a = 1.0F;
      this.f0l(32);
      this.yxc(0.02F, 0.02F);
      this.ysq = this.ysq * (this.z2d.nextFloat() * 0.6F + 0.2F);
      this.icv = var8 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.mop = var10 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.bw4 = var12 * 0.2F + (Math.random() * 2.0 - 1.0) * 0.02F;
      this.bx4 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
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
      // 02: getfield etr.o2v D
      // 05: putfield etr.bc1 D
      // 08: aload 0
      // 09: aload 0
      // 0a: getfield etr.kfp D
      // 0d: putfield etr.o_z D
      // 10: aload 0
      // 11: aload 0
      // 12: getfield etr.vbd D
      // 15: putfield etr.a4d D
      // 18: aload 0
      // 19: dup
      // 1a: getfield etr.mop D
      // 1d: ldc2_w 0.002
      // 20: dadd
      // 21: putfield etr.mop D
      // 24: invokestatic OpaquePredicate.b ()I
      // 27: aload 0
      // 28: aload 0
      // 29: getfield etr.icv D
      // 2c: aload 0
      // 2d: getfield etr.mop D
      // 30: aload 0
      // 31: getfield etr.bw4 D
      // 34: invokevirtual etr.vjj (DDD)V
      // 37: aload 0
      // 38: dup
      // 39: getfield etr.icv D
      // 3c: ldc2_w 0.8500000238418579
      // 3f: dmul
      // 40: putfield etr.icv D
      // 43: aload 0
      // 44: dup
      // 45: getfield etr.mop D
      // 48: ldc2_w 0.8500000238418579
      // 4b: dmul
      // 4c: putfield etr.mop D
      // 4f: aload 0
      // 50: dup
      // 51: getfield etr.bw4 D
      // 54: ldc2_w 0.8500000238418579
      // 57: dmul
      // 58: putfield etr.bw4 D
      // 5b: istore 1
      // 5c: aload 0
      // 5d: iload 1
      // 5e: ifeq 90
      // 61: getfield etr.oay Lt9d;
      // 64: new mew
      // 67: dup
      // 68: aload 0
      // 69: invokespecial mew.<init> (Li2h;)V
      // 6c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 6f: invokeinterface zfz.r_y ()Le0x; 1
      // 74: invokevirtual e0x.p1r ()Lp3y;
      // 77: getstatic p3y.six Lp3y;
      // 7a: if_acmpeq 8f
      // 7d: goto 84
      // 80: invokestatic etr.a (Loov;)Loov;
      // 83: athrow
      // 84: aload 0
      // 85: invokevirtual etr._kl ()V
      // 88: goto 8f
      // 8b: invokestatic etr.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 0
      // 90: iload 1
      // 91: ifeq b0
      // 94: dup
      // 95: getfield etr.bx4 I
      // 98: dup_x1
      // 99: bipush 1
      // 9a: isub
      // 9b: putfield etr.bx4 I
      // 9e: ifgt b3
      // a1: goto a8
      // a4: invokestatic etr.a (Loov;)Loov;
      // a7: athrow
      // a8: aload 0
      // a9: goto b0
      // ac: invokestatic etr.a (Loov;)Loov;
      // af: athrow
      // b0: invokevirtual etr._kl ()V
      // b3: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
