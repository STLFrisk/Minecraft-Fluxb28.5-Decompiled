public class e3x extends znt {
   public e3x() {
      super(p3y.s8e, false, _mi.g21);
      this.i3l(uja.qqf);
      this.t50 = 0.8F;
   }

   @Override
   public w51 w3x() {
      return w51.mem;
   }

   @Override
   public void b2c(OpaquePredicate param1, mew param2, EntityLivingBase param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 3
      // 06: iload 5
      // 08: ifne 35
      // 0b: invokevirtual EntityLivingBase.hzv ()Z
      // 0e: ifeq 2d
      // 11: goto 18
      // 14: invokestatic e3x.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: aload 3
      // 1c: fload 4
      // 1e: invokespecial znt.b2c (Lt9d;Lmew;Li2h;F)V
      // 21: iload 5
      // 23: ifeq 3b
      // 26: goto 2d
      // 29: invokestatic e3x.a (Loov;)Loov;
      // 2c: athrow
      // 2d: aload 3
      // 2e: goto 35
      // 31: invokestatic e3x.a (Loov;)Loov;
      // 34: athrow
      // 35: fload 4
      // 37: fconst_0
      // 38: invokevirtual EntityLivingBase.ibc (FF)V
      // 3b: return
   }

   @Override
   public void r2j(OpaquePredicate param1, EntityLivingBase param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: invokevirtual EntityLivingBase.hzv ()Z
      // 08: iload 3
      // 09: ifne 3f
      // 0c: ifeq 27
      // 0f: goto 16
      // 12: invokestatic e3x.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: aload 2
      // 19: invokespecial znt.r2j (Lt9d;Li2h;)V
      // 1c: iload 3
      // 1d: ifeq 4b
      // 20: goto 27
      // 23: invokestatic e3x.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 2
      // 28: iload 3
      // 29: ifne 43
      // 2c: goto 33
      // 2f: invokestatic e3x.a (Loov;)Loov;
      // 32: athrow
      // 33: getfield EntityLivingBase.mop D
      // 36: dconst_0
      // 37: dcmpg
      // 38: goto 3f
      // 3b: invokestatic e3x.a (Loov;)Loov;
      // 3e: athrow
      // 3f: ifge 4b
      // 42: aload 2
      // 43: aload 2
      // 44: getfield EntityLivingBase.mop D
      // 47: dneg
      // 48: putfield EntityLivingBase.mop D
      // 4b: return
   }

   @Override
   public void xqy(OpaquePredicate param1, mew param2, EntityLivingBase param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 3
      // 06: getfield EntityLivingBase.mop D
      // 09: invokestatic java/lang/Math.abs (D)D
      // 0c: ldc2_w 0.1
      // 0f: dcmpg
      // 10: iload 4
      // 12: ifeq 2a
      // 15: ifge 54
      // 18: goto 1f
      // 1b: invokestatic e3x.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 3
      // 20: invokevirtual EntityLivingBase.hzv ()Z
      // 23: goto 2a
      // 26: invokestatic e3x.a (Loov;)Loov;
      // 29: athrow
      // 2a: ifne 54
      // 2d: ldc2_w 0.4
      // 30: aload 3
      // 31: getfield EntityLivingBase.mop D
      // 34: invokestatic java/lang/Math.abs (D)D
      // 37: ldc2_w 0.2
      // 3a: dmul
      // 3b: dadd
      // 3c: dstore 5
      // 3e: aload 3
      // 3f: dup
      // 40: getfield EntityLivingBase.icv D
      // 43: dload 5
      // 45: dmul
      // 46: putfield EntityLivingBase.icv D
      // 49: aload 3
      // 4a: dup
      // 4b: getfield EntityLivingBase.bw4 D
      // 4e: dload 5
      // 50: dmul
      // 51: putfield EntityLivingBase.bw4 D
      // 54: aload 0
      // 55: aload 1
      // 56: aload 2
      // 57: aload 3
      // 58: invokespecial znt.xqy (Lt9d;Lmew;Li2h;)V
      // 5b: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
