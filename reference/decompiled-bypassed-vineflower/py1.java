public class py1 {
   public static void hkj(t9d var0, mew var1, rsi var2) {
      g3g(var0, (double)var1.getX(), (double)var1.getY(), (double)var1.getZ(), var2);
   }

   public static void x5u(t9d var0, i2h var1, rsi var2) {
      g3g(var0, var1.o2v, var1.kfp, var1.vbd, var2);
   }

   private static void g3g(t9d param0, double param1, double param3, double param5, rsi param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 8
      // 05: bipush 0
      // 06: istore 9
      // 08: iload 9
      // 0a: aload 7
      // 0c: invokeinterface rsi.opt ()I 1
      // 11: if_icmpge 49
      // 14: aload 7
      // 16: iload 9
      // 18: invokeinterface rsi.ibn (I)Lerg; 2
      // 1d: astore 10
      // 1f: iload 8
      // 21: ifeq 44
      // 24: aload 10
      // 26: ifnull 41
      // 29: goto 30
      // 2c: invokestatic py1.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: dload 1
      // 32: dload 3
      // 33: dload 5
      // 35: aload 10
      // 37: invokestatic py1.xb1 (Lt9d;DDDLerg;)V
      // 3a: goto 41
      // 3d: invokestatic py1.a (Loov;)Loov;
      // 40: athrow
      // 41: iinc 9 1
      // 44: iload 8
      // 46: ifne 08
      // 49: return
   }

   private static void xb1(t9d param0, double param1, double param3, double param5, erg param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic py1.ubs Ljava/util/Random;
      // 003: invokevirtual java/util/Random.nextFloat ()F
      // 006: ldc 0.8
      // 008: nop
      // 009: fmul
      // 00a: ldc 0.1
      // 00c: nop
      // 00d: fadd
      // 00e: fstore 9
      // 010: invokestatic t9d.c ()I
      // 013: getstatic py1.ubs Ljava/util/Random;
      // 016: invokevirtual java/util/Random.nextFloat ()F
      // 019: ldc 0.8
      // 01b: nop
      // 01c: fmul
      // 01d: ldc 0.1
      // 01f: nop
      // 020: fadd
      // 021: fstore 10
      // 023: istore 8
      // 025: getstatic py1.ubs Ljava/util/Random;
      // 028: invokevirtual java/util/Random.nextFloat ()F
      // 02b: ldc 0.8
      // 02d: nop
      // 02e: fmul
      // 02f: ldc 0.1
      // 031: nop
      // 032: fadd
      // 033: fstore 11
      // 035: aload 7
      // 037: getfield erg.qd2 I
      // 03a: ifle 110
      // 03d: getstatic py1.ubs Ljava/util/Random;
      // 040: bipush 21
      // 042: invokevirtual java/util/Random.nextInt (I)I
      // 045: bipush 10
      // 047: iadd
      // 048: istore 12
      // 04a: iload 8
      // 04c: ifne 073
      // 04f: iload 12
      // 051: aload 7
      // 053: getfield erg.qd2 I
      // 056: if_icmple 067
      // 059: goto 060
      // 05c: invokestatic py1.a (Loov;)Loov;
      // 05f: athrow
      // 060: aload 7
      // 062: getfield erg.qd2 I
      // 065: istore 12
      // 067: aload 7
      // 069: dup
      // 06a: getfield erg.qd2 I
      // 06d: iload 12
      // 06f: isub
      // 070: putfield erg.qd2 I
      // 073: new nvf
      // 076: dup
      // 077: aload 0
      // 078: dload 1
      // 079: fload 9
      // 07b: f2d
      // 07c: dadd
      // 07d: dload 3
      // 07e: fload 10
      // 080: f2d
      // 081: dadd
      // 082: dload 5
      // 084: fload 11
      // 086: f2d
      // 087: dadd
      // 088: new erg
      // 08b: dup
      // 08c: aload 7
      // 08e: invokevirtual erg.gn1 ()Lu7m;
      // 091: iload 12
      // 093: aload 7
      // 095: invokevirtual erg.j6_ ()I
      // 098: invokespecial erg.<init> (Lu7m;II)V
      // 09b: invokespecial nvf.<init> (Lt9d;DDDLerg;)V
      // 09e: astore 13
      // 0a0: aload 7
      // 0a2: iload 8
      // 0a4: ifne 0c0
      // 0a7: invokevirtual erg.w8b ()Z
      // 0aa: ifeq 0ce
      // 0ad: goto 0b4
      // 0b0: invokestatic py1.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: aload 13
      // 0b6: invokevirtual nvf.s7f ()Lerg;
      // 0b9: goto 0c0
      // 0bc: invokestatic py1.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: aload 7
      // 0c2: invokevirtual erg.zso ()Lbdo;
      // 0c5: invokevirtual bdo.h33 ()Lgdw;
      // 0c8: checkcast bdo
      // 0cb: invokevirtual erg.b67 (Lbdo;)V
      // 0ce: ldc 0.05
      // 0d0: nop
      // 0d1: fstore 14
      // 0d3: aload 13
      // 0d5: getstatic py1.ubs Ljava/util/Random;
      // 0d8: invokevirtual java/util/Random.nextGaussian ()D
      // 0db: fload 14
      // 0dd: f2d
      // 0de: dmul
      // 0df: putfield nvf.icv D
      // 0e2: aload 13
      // 0e4: getstatic py1.ubs Ljava/util/Random;
      // 0e7: invokevirtual java/util/Random.nextGaussian ()D
      // 0ea: fload 14
      // 0ec: f2d
      // 0ed: dmul
      // 0ee: ldc2_w 0.20000000298023224
      // 0f1: dadd
      // 0f2: putfield nvf.mop D
      // 0f5: aload 13
      // 0f7: getstatic py1.ubs Ljava/util/Random;
      // 0fa: invokevirtual java/util/Random.nextGaussian ()D
      // 0fd: fload 14
      // 0ff: f2d
      // 100: dmul
      // 101: putfield nvf.bw4 D
      // 104: aload 0
      // 105: aload 13
      // 107: invokevirtual t9d.xzq (Li2h;)Z
      // 10a: pop
      // 10b: iload 8
      // 10d: ifeq 035
      // 110: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
