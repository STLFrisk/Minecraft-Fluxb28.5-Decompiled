public class epx extends zvv {
   public epx(yqv var1, OpaquePredicate var2) {
      super(var1, var2);
   }

   @Override
   public t_2 ty_(mew var1) {
      this.one = var1;
      return super.ty_(var1);
   }

   @Override
   public t_2 n4j(EntityLivingBase var1) {
      this.one = new mew(var1);
      return super.n4j(var1);
   }

   @Override
   public boolean p6m(EntityLivingBase param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: invokevirtual epx.n4j (Li2h;)Lt_2;
      // 0a: astore 5
      // 0c: iload 4
      // 0e: ifeq 3a
      // 11: aload 5
      // 13: ifnull 29
      // 16: goto 1d
      // 19: invokestatic epx.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 5
      // 20: dload 2
      // 21: invokevirtual epx.sh7 (Lt_2;D)Z
      // 24: ireturn
      // 25: invokestatic epx.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: new mew
      // 2d: dup
      // 2e: aload 1
      // 2f: invokespecial mew.<init> (Li2h;)V
      // 32: putfield epx.one Lmew;
      // 35: aload 0
      // 36: dload 2
      // 37: putfield epx.mlw D
      // 3a: bipush 1
      // 3b: ireturn
   }

   @Override
   public void vr1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 02d
      // 009: invokevirtual epx.j07 ()Z
      // 00c: ifne 025
      // 00f: goto 016
      // 012: invokestatic epx.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: invokespecial zvv.vr1 ()V
      // 01a: iload 1
      // 01b: ifeq 110
      // 01e: goto 025
      // 021: invokestatic epx.a (Loov;)Loov;
      // 024: athrow
      // 025: aload 0
      // 026: goto 02d
      // 029: invokestatic epx.a (Loov;)Loov;
      // 02c: athrow
      // 02d: iload 1
      // 02e: ifne 046
      // 031: getfield epx.one Lmew;
      // 034: ifnull 110
      // 037: goto 03e
      // 03a: invokestatic epx.a (Loov;)Loov;
      // 03d: athrow
      // 03e: aload 0
      // 03f: goto 046
      // 042: invokestatic epx.a (Loov;)Loov;
      // 045: athrow
      // 046: getfield epx.wxo Lyqv;
      // 049: getfield yqv.uo6 F
      // 04c: aload 0
      // 04d: getfield epx.wxo Lyqv;
      // 050: getfield yqv.uo6 F
      // 053: fmul
      // 054: f2d
      // 055: dstore 2
      // 056: aload 0
      // 057: iload 1
      // 058: ifne 10c
      // 05b: getfield epx.wxo Lyqv;
      // 05e: aload 0
      // 05f: getfield epx.one Lmew;
      // 062: invokevirtual yqv.x4g (Lmew;)D
      // 065: dload 2
      // 066: dcmpl
      // 067: iflt 104
      // 06a: goto 071
      // 06d: invokestatic epx.a (Loov;)Loov;
      // 070: athrow
      // 071: aload 0
      // 072: getfield epx.wxo Lyqv;
      // 075: iload 1
      // 076: ifne 0de
      // 079: goto 080
      // 07c: invokestatic epx.a (Loov;)Loov;
      // 07f: athrow
      // 080: getfield yqv.kfp D
      // 083: aload 0
      // 084: getfield epx.one Lmew;
      // 087: invokevirtual mew.getY ()I
      // 08a: i2d
      // 08b: dcmpg
      // 08c: ifle 0d3
      // 08f: goto 096
      // 092: invokestatic epx.a (Loov;)Loov;
      // 095: athrow
      // 096: aload 0
      // 097: iload 1
      // 098: ifne 10c
      // 09b: goto 0a2
      // 09e: invokestatic epx.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: getfield epx.wxo Lyqv;
      // 0a5: new mew
      // 0a8: dup
      // 0a9: aload 0
      // 0aa: getfield epx.one Lmew;
      // 0ad: invokevirtual mew.getX ()I
      // 0b0: aload 0
      // 0b1: getfield epx.wxo Lyqv;
      // 0b4: getfield yqv.kfp D
      // 0b7: invokestatic fe6.jqf (D)I
      // 0ba: aload 0
      // 0bb: getfield epx.one Lmew;
      // 0be: invokevirtual mew.getZ ()I
      // 0c1: invokespecial mew.<init> (III)V
      // 0c4: invokevirtual yqv.x4g (Lmew;)D
      // 0c7: dload 2
      // 0c8: dcmpl
      // 0c9: iflt 104
      // 0cc: goto 0d3
      // 0cf: invokestatic epx.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getfield epx.wxo Lyqv;
      // 0d7: goto 0de
      // 0da: invokestatic epx.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: invokevirtual yqv.gvh ()Lbww;
      // 0e1: aload 0
      // 0e2: getfield epx.one Lmew;
      // 0e5: invokevirtual mew.getX ()I
      // 0e8: i2d
      // 0e9: aload 0
      // 0ea: getfield epx.one Lmew;
      // 0ed: invokevirtual mew.getY ()I
      // 0f0: i2d
      // 0f1: aload 0
      // 0f2: getfield epx.one Lmew;
      // 0f5: invokevirtual mew.getZ ()I
      // 0f8: i2d
      // 0f9: aload 0
      // 0fa: getfield epx.mlw D
      // 0fd: invokevirtual bww.n5p (DDDD)V
      // 100: iload 1
      // 101: ifeq 110
      // 104: aload 0
      // 105: goto 10c
      // 108: invokestatic epx.a (Loov;)Loov;
      // 10b: athrow
      // 10c: aconst_null
      // 10d: putfield epx.one Lmew;
      // 110: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
