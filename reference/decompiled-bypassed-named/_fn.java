public class _fn extends cjm {
   public _fn(EntityPlayer var1, double var2) {
      this._rj = var1;
      this.qie = var2;
      this.sbi = var1.oay;
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
      // 05: getfield _fn.sbi Lt9d;
      // 08: invokevirtual OpaquePredicate.m40 ()Z
      // 0b: iload 1
      // 0c: ifeq 26
      // 0f: ifne 1f
      // 12: goto 19
      // 15: invokestatic _fn.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 0
      // 1a: ireturn
      // 1b: invokestatic _fn.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield _fn._rj Llaq;
      // 23: invokevirtual EntityPlayer.agj ()Z
      // 26: iload 1
      // 27: ifeq 6b
      // 2a: ifne 3a
      // 2d: goto 34
      // 30: invokestatic _fn.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
      // 36: invokestatic _fn.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: iload 1
      // 3c: ifeq 75
      // 3f: getfield _fn.sbi Lt9d;
      // 42: new mew
      // 45: dup
      // 46: aload 0
      // 47: getfield _fn._rj Llaq;
      // 4a: getfield EntityPlayer.o2v D
      // 4d: aload 0
      // 4e: getfield _fn._rj Llaq;
      // 51: invokevirtual EntityPlayer.aaw ()Lnh4;
      // 54: getfield nh4.bx_ D
      // 57: aload 0
      // 58: getfield _fn._rj Llaq;
      // 5b: getfield EntityPlayer.vbd D
      // 5e: invokespecial mew.<init> (DDD)V
      // 61: invokevirtual OpaquePredicate.cfv (Lmew;)Z
      // 64: goto 6b
      // 67: invokestatic _fn.a (Loov;)Loov;
      // 6a: athrow
      // 6b: ifne 74
      // 6e: bipush 0
      // 6f: ireturn
      // 70: invokestatic _fn.a (Loov;)Loov;
      // 73: athrow
      // 74: aload 0
      // 75: invokespecial _fn.ps3 ()Lfqr;
      // 78: astore 2
      // 79: iload 1
      // 7a: ifeq a6
      // 7d: aload 2
      // 7e: ifnonnull 8e
      // 81: goto 88
      // 84: invokestatic _fn.a (Loov;)Loov;
      // 87: athrow
      // 88: bipush 0
      // 89: ireturn
      // 8a: invokestatic _fn.a (Loov;)Loov;
      // 8d: athrow
      // 8e: aload 0
      // 8f: aload 2
      // 90: getfield fqr.lvi D
      // 93: putfield _fn.o93 D
      // 96: aload 0
      // 97: aload 2
      // 98: getfield fqr.gn5 D
      // 9b: putfield _fn.zkk D
      // 9e: aload 0
      // 9f: aload 2
      // a0: getfield fqr.bn2 D
      // a3: putfield _fn.rtr D
      // a6: bipush 1
      // a7: ireturn
   }

   @Override
   public boolean wh3() {
      int var1 = OpaquePredicate.b();

      try {
         boolean var10000 = this._rj.zq2().j07();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   @Override
   public void mnp() {
      this._rj.zq2().ni_(this.o93, this.zkk, this.rtr, this.qie);
   }

   private fqr ps3() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield _fn._rj Llaq;
      // 04: invokevirtual EntityPlayer.mbr ()Ljava/util/Random;
      // 07: astore 2
      // 08: new mew
      // 0b: dup
      // 0c: aload 0
      // 0d: getfield _fn._rj Llaq;
      // 10: getfield EntityPlayer.o2v D
      // 13: aload 0
      // 14: getfield _fn._rj Llaq;
      // 17: invokevirtual EntityPlayer.aaw ()Lnh4;
      // 1a: getfield nh4.bx_ D
      // 1d: aload 0
      // 1e: getfield _fn._rj Llaq;
      // 21: getfield EntityPlayer.vbd D
      // 24: invokespecial mew.<init> (DDD)V
      // 27: astore 3
      // 28: invokestatic OpaquePredicate.c ()I
      // 2b: bipush 0
      // 2c: istore 4
      // 2e: istore 1
      // 2f: iload 4
      // 31: bipush 10
      // 33: if_icmpge a7
      // 36: aload 3
      // 37: aload 2
      // 38: bipush 20
      // 3a: invokevirtual java/util/Random.nextInt (I)I
      // 3d: bipush 10
      // 3f: isub
      // 40: aload 2
      // 41: bipush 6
      // 43: invokevirtual java/util/Random.nextInt (I)I
      // 46: bipush 3
      // 47: isub
      // 48: aload 2
      // 49: bipush 20
      // 4b: invokevirtual java/util/Random.nextInt (I)I
      // 4e: bipush 10
      // 50: isub
      // 51: invokevirtual mew.ec4 (III)Lmew;
      // 54: astore 5
      // 56: iload 1
      // 57: ifne a3
      // 5a: aload 0
      // 5b: getfield _fn.sbi Lt9d;
      // 5e: aload 5
      // 60: invokevirtual OpaquePredicate.cfv (Lmew;)Z
      // 63: ifne a0
      // 66: goto 6d
      // 69: invokestatic _fn.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield _fn._rj Llaq;
      // 71: aload 5
      // 73: invokevirtual EntityPlayer.ncy (Lmew;)F
      // 76: fconst_0
      // 77: fcmpg
      // 78: ifge a0
      // 7b: goto 82
      // 7e: invokestatic _fn.a (Loov;)Loov;
      // 81: athrow
      // 82: new fqr
      // 85: dup
      // 86: aload 5
      // 88: invokevirtual mew.getX ()I
      // 8b: i2d
      // 8c: aload 5
      // 8e: invokevirtual mew.getY ()I
      // 91: i2d
      // 92: aload 5
      // 94: invokevirtual mew.getZ ()I
      // 97: i2d
      // 98: invokespecial fqr.<init> (DDD)V
      // 9b: areturn
      // 9c: invokestatic _fn.a (Loov;)Loov;
      // 9f: athrow
      // a0: iinc 4 1
      // a3: iload 1
      // a4: ifeq 2f
      // a7: aconst_null
      // a8: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
