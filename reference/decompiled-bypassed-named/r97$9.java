public final class r97$9 extends kea {
   private final kea gy9 = new kea();

   @Override
   public erg lno(sdf param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokeinterface sdf.lcq ()I 1
      // 006: invokestatic okn.dwc (I)Lvt2;
      // 009: astore 4
      // 00b: aload 1
      // 00c: invokeinterface sdf.acz ()Lt9d; 1
      // 011: astore 5
      // 013: aload 1
      // 014: invokeinterface sdf.tai ()D 1
      // 019: aload 4
      // 01b: invokevirtual vt2.n67 ()I
      // 01e: i2f
      // 01f: ldc 1.125
      // 021: nop
      // 022: fmul
      // 023: f2d
      // 024: dadd
      // 025: dstore 6
      // 027: invokestatic OpaquePredicate.c ()I
      // 02a: aload 1
      // 02b: invokeinterface sdf.q_1 ()D 1
      // 030: aload 4
      // 032: invokevirtual vt2.g5t ()I
      // 035: i2f
      // 036: ldc 1.125
      // 038: nop
      // 039: fmul
      // 03a: f2d
      // 03b: dadd
      // 03c: dstore 8
      // 03e: aload 1
      // 03f: invokeinterface sdf.wgy ()D 1
      // 044: aload 4
      // 046: invokevirtual vt2.ozy ()I
      // 049: i2f
      // 04a: ldc 1.125
      // 04c: nop
      // 04d: fmul
      // 04e: f2d
      // 04f: dadd
      // 050: dstore 10
      // 052: istore 3
      // 053: aload 1
      // 054: invokeinterface sdf.taq ()Lmew; 1
      // 059: aload 4
      // 05b: invokevirtual mew.offset (Lvt2;)Lmew;
      // 05e: astore 12
      // 060: aload 5
      // 062: aload 12
      // 064: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 067: invokeinterface zfz.r_y ()Le0x; 1
      // 06c: invokevirtual e0x.p1r ()Lp3y;
      // 06f: astore 13
      // 071: getstatic p3y.six Lp3y;
      // 074: aload 13
      // 076: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 079: iload 3
      // 07a: ifne 09d
      // 07d: ifeq 08e
      // 080: goto 087
      // 083: invokestatic r97$9.a (Loov;)Loov;
      // 086: athrow
      // 087: dconst_1
      // 088: dstore 14
      // 08a: iload 3
      // 08b: ifeq 0de
      // 08e: getstatic p3y.cei Lp3y;
      // 091: aload 13
      // 093: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 096: goto 09d
      // 099: invokestatic r97$9.a (Loov;)Loov;
      // 09c: athrow
      // 09d: iload 3
      // 09e: ifne 0ca
      // 0a1: ifeq 0cd
      // 0a4: goto 0ab
      // 0a7: invokestatic r97$9.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: getstatic p3y.six Lp3y;
      // 0ae: aload 5
      // 0b0: aload 12
      // 0b2: invokevirtual mew.eve ()Lmew;
      // 0b5: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0b8: invokeinterface zfz.r_y ()Le0x; 1
      // 0bd: invokevirtual e0x.p1r ()Lp3y;
      // 0c0: invokevirtual java/lang/Object.equals (Ljava/lang/Object;)Z
      // 0c3: goto 0ca
      // 0c6: invokestatic r97$9.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: ifne 0db
      // 0cd: aload 0
      // 0ce: getfield r97$9.gy9 Lkea;
      // 0d1: aload 1
      // 0d2: aload 2
      // 0d3: invokevirtual kea.r0k (Lsdf;Lerg;)Lerg;
      // 0d6: areturn
      // 0d7: invokestatic r97$9.a (Loov;)Loov;
      // 0da: athrow
      // 0db: dconst_0
      // 0dc: dstore 14
      // 0de: new w54
      // 0e1: dup
      // 0e2: aload 5
      // 0e4: dload 6
      // 0e6: dload 8
      // 0e8: dload 14
      // 0ea: dadd
      // 0eb: dload 10
      // 0ed: invokespecial w54.<init> (Lt9d;DDD)V
      // 0f0: astore 16
      // 0f2: aload 5
      // 0f4: aload 16
      // 0f6: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 0f9: pop
      // 0fa: aload 2
      // 0fb: bipush 1
      // 0fc: invokevirtual erg.amj (I)Lerg;
      // 0ff: pop
      // 100: aload 2
      // 101: areturn
   }

   @Override
   public void d_l(sdf var1) {
      var1.acz().qca(1000, var1.taq(), 0);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
