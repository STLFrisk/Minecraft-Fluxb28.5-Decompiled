public class doq extends cjm {
   public doq(EntityPlayer var1, double var2, float var4) {
      this.e7t = var1;
      this.a80 = var2;
      this.rf2 = var4;
      this.k23(1);
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: aload 0
      // 06: getfield doq.e7t Llaq;
      // 09: invokevirtual EntityPlayer.q4v ()Lg_3;
      // 0c: putfield doq.ele Lg_3;
      // 0f: aload 0
      // 10: getfield doq.ele Lg_3;
      // 13: iload 1
      // 14: ifeq 36
      // 17: ifnonnull 27
      // 1a: goto 21
      // 1d: invokestatic doq.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic doq.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: iload 1
      // 29: ifeq 52
      // 2c: getfield doq.ele Lg_3;
      // 2f: goto 36
      // 32: invokestatic doq.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 0
      // 37: getfield doq.e7t Llaq;
      // 3a: invokevirtual Entity.wxg (Li2h;)D
      // 3d: aload 0
      // 3e: getfield doq.rf2 F
      // 41: aload 0
      // 42: getfield doq.rf2 F
      // 45: fmul
      // 46: f2d
      // 47: dcmpl
      // 48: ifle 51
      // 4b: bipush 0
      // 4c: ireturn
      // 4d: invokestatic doq.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: getfield doq.e7t Llaq;
      // 55: bipush 16
      // 57: bipush 7
      // 59: new fqr
      // 5c: dup
      // 5d: aload 0
      // 5e: getfield doq.ele Lg_3;
      // 61: getfield Entity.o2v D
      // 64: aload 0
      // 65: getfield doq.ele Lg_3;
      // 68: getfield Entity.kfp D
      // 6b: aload 0
      // 6c: getfield doq.ele Lg_3;
      // 6f: getfield Entity.vbd D
      // 72: invokespecial fqr.<init> (DDD)V
      // 75: invokestatic zim.ity (Llaq;IILfqr;)Lfqr;
      // 78: astore 2
      // 79: iload 1
      // 7a: ifeq a6
      // 7d: aload 2
      // 7e: ifnonnull 8e
      // 81: goto 88
      // 84: invokestatic doq.a (Loov;)Loov;
      // 87: athrow
      // 88: bipush 0
      // 89: ireturn
      // 8a: invokestatic doq.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 0
      // 8f: aload 2
      // 90: getfield fqr.lvi D
      // 93: putfield doq.zxz D
      // 96: aload 0
      // 97: aload 2
      // 98: getfield fqr.gn5 D
      // 9b: putfield doq.iha D
      // 9e: aload 0
      // 9f: aload 2
      // a0: getfield fqr.bn2 D
      // a3: putfield doq.eld D
      // a6: bipush 1
      // a7: ireturn
   }

   @Override
   public boolean wh3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield doq.e7t Llaq;
      // 08: invokevirtual EntityPlayer.zq2 ()Lp8a;
      // 0b: invokevirtual p8a.j07 ()Z
      // 0e: iload 1
      // 0f: ifeq 2a
      // 12: ifne 67
      // 15: goto 1c
      // 18: invokestatic doq.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield doq.ele Lg_3;
      // 20: invokevirtual Entity.gzr ()Z
      // 23: goto 2a
      // 26: invokestatic doq.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 1
      // 2b: ifeq 55
      // 2e: ifeq 67
      // 31: goto 38
      // 34: invokestatic doq.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield doq.ele Lg_3;
      // 3c: aload 0
      // 3d: getfield doq.e7t Llaq;
      // 40: invokevirtual Entity.wxg (Li2h;)D
      // 43: aload 0
      // 44: getfield doq.rf2 F
      // 47: aload 0
      // 48: getfield doq.rf2 F
      // 4b: fmul
      // 4c: f2d
      // 4d: dcmpg
      // 4e: goto 55
      // 51: invokestatic doq.a (Loov;)Loov;
      // 54: athrow
      // 55: iload 1
      // 56: ifeq 64
      // 59: ifge 67
      // 5c: goto 63
      // 5f: invokestatic doq.a (Loov;)Loov;
      // 62: athrow
      // 63: bipush 1
      // 64: goto 68
      // 67: bipush 0
      // 68: ireturn
   }

   @Override
   public void zly() {
      this.ele = null;
   }

   @Override
   public void mnp() {
      this.e7t.zq2().ni_(this.zxz, this.iha, this.eld, this.a80);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
