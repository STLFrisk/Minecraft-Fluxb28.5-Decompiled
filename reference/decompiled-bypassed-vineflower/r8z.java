public class r8z extends flo {
   public r8z(t9d var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4 - 0.125, var6, var8, var10, var12);
      this.aeh = 0.4F;
      this.li4 = 0.4F;
      this.v5a = 0.7F;
      this.f0l(0);
      this.yxc(0.01F, 0.01F);
      this.ysq = this.ysq * (this.z2d.nextFloat() * 0.6F + 0.2F);
      this.icv = var8 * 0.0;
      this.mop = var10 * 0.0;
      this.bw4 = var12 * 0.0;
      this.bx4 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
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
      // 02: getfield r8z.o2v D
      // 05: putfield r8z.bc1 D
      // 08: invokestatic t9d.b ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield r8z.kfp D
      // 10: putfield r8z.o_z D
      // 13: istore 1
      // 14: aload 0
      // 15: aload 0
      // 16: getfield r8z.vbd D
      // 19: putfield r8z.a4d D
      // 1c: aload 0
      // 1d: aload 0
      // 1e: getfield r8z.icv D
      // 21: aload 0
      // 22: getfield r8z.mop D
      // 25: aload 0
      // 26: getfield r8z.bw4 D
      // 29: invokevirtual r8z.vjj (DDD)V
      // 2c: aload 0
      // 2d: iload 1
      // 2e: ifeq 60
      // 31: getfield r8z.oay Lt9d;
      // 34: new mew
      // 37: dup
      // 38: aload 0
      // 39: invokespecial mew.<init> (Li2h;)V
      // 3c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 3f: invokeinterface zfz.r_y ()Le0x; 1
      // 44: invokevirtual e0x.p1r ()Lp3y;
      // 47: getstatic p3y.six Lp3y;
      // 4a: if_acmpeq 5f
      // 4d: goto 54
      // 50: invokestatic r8z.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: invokevirtual r8z._kl ()V
      // 58: goto 5f
      // 5b: invokestatic r8z.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: iload 1
      // 61: ifeq 80
      // 64: dup
      // 65: getfield r8z.bx4 I
      // 68: dup_x1
      // 69: bipush 1
      // 6a: isub
      // 6b: putfield r8z.bx4 I
      // 6e: ifgt 83
      // 71: goto 78
      // 74: invokestatic r8z.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 0
      // 79: goto 80
      // 7c: invokestatic r8z.a (Loov;)Loov;
      // 7f: athrow
      // 80: invokevirtual r8z._kl ()V
      // 83: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
