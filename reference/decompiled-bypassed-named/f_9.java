public class f_9 extends vrx {
   public f_9(ha9 var1, rsi var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.mq7 = var1;
   }

   @Override
   public boolean xvl(erg var1) {
      return false;
   }

   @Override
   public erg xtx(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 32
      // 09: invokevirtual f_9.hf8 ()Z
      // 0c: ifeq 31
      // 0f: goto 16
      // 12: invokestatic f_9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: dup
      // 18: getfield f_9.ode I
      // 1b: iload 1
      // 1c: aload 0
      // 1d: invokevirtual f_9.x4s ()Lerg;
      // 20: getfield erg.qd2 I
      // 23: invokestatic java/lang/Math.min (II)I
      // 26: iadd
      // 27: putfield f_9.ode I
      // 2a: goto 31
      // 2d: invokestatic f_9.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: iload 1
      // 33: invokespecial vrx.xtx (I)Lerg;
      // 36: areturn
   }

   @Override
   public void g1d(ha9 var1, erg var2) {
      this.erq(var2);
      super.g1d(var1, var2);
   }

   @Override
   public void f2o(erg var1, int var2) {
      this.ode += var2;
      this.erq(var1);
   }

   @Override
   public void erq(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: aload 1
      // 005: aload 0
      // 006: getfield f_9.mq7 Lha9;
      // 009: getfield ha9.oay Lt9d;
      // 00c: aload 0
      // 00d: getfield f_9.mq7 Lha9;
      // 010: aload 0
      // 011: getfield f_9.ode I
      // 014: invokevirtual erg.fie (Lt9d;Lha9;I)V
      // 017: aload 0
      // 018: iload 2
      // 019: ifne 110
      // 01c: getfield f_9.mq7 Lha9;
      // 01f: getfield ha9.oay Lt9d;
      // 022: getfield OpaquePredicate.v0f Z
      // 025: ifne 10f
      // 028: goto 02f
      // 02b: invokestatic f_9.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: getfield f_9.ode I
      // 033: istore 3
      // 034: invokestatic x65.eor ()Lx65;
      // 037: aload 1
      // 038: invokevirtual x65.vlt (Lerg;)F
      // 03b: fstore 4
      // 03d: fload 4
      // 03f: fconst_0
      // 040: fcmpl
      // 041: iload 2
      // 042: ifne 060
      // 045: ifne 055
      // 048: goto 04f
      // 04b: invokestatic f_9.a (Loov;)Loov;
      // 04e: athrow
      // 04f: bipush 0
      // 050: istore 3
      // 051: iload 2
      // 052: ifeq 0b9
      // 055: fload 4
      // 057: fconst_1
      // 058: fcmpg
      // 059: goto 060
      // 05c: invokestatic f_9.a (Loov;)Loov;
      // 05f: athrow
      // 060: iload 2
      // 061: ifne 0ba
      // 064: ifge 0b9
      // 067: goto 06e
      // 06a: invokestatic f_9.a (Loov;)Loov;
      // 06d: athrow
      // 06e: iload 3
      // 06f: i2f
      // 070: fload 4
      // 072: fmul
      // 073: invokestatic fe6.tpk (F)I
      // 076: istore 5
      // 078: iload 5
      // 07a: iload 2
      // 07b: ifne 0b8
      // 07e: iload 3
      // 07f: i2f
      // 080: fload 4
      // 082: fmul
      // 083: invokestatic fe6.v1i (F)I
      // 086: if_icmpge 0b6
      // 089: goto 090
      // 08c: invokestatic f_9.a (Loov;)Loov;
      // 08f: athrow
      // 090: invokestatic java/lang/Math.random ()D
      // 093: iload 3
      // 094: i2f
      // 095: fload 4
      // 097: fmul
      // 098: iload 5
      // 09a: i2f
      // 09b: fsub
      // 09c: f2d
      // 09d: dcmpg
      // 09e: iload 2
      // 09f: ifne 0b8
      // 0a2: goto 0a9
      // 0a5: invokestatic f_9.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: ifge 0b6
      // 0ac: goto 0b3
      // 0af: invokestatic f_9.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: iinc 5 1
      // 0b6: iload 5
      // 0b8: istore 3
      // 0b9: iload 3
      // 0ba: ifle 10f
      // 0bd: iload 3
      // 0be: invokestatic uno.di5 (I)I
      // 0c1: istore 5
      // 0c3: iload 3
      // 0c4: iload 5
      // 0c6: isub
      // 0c7: istore 3
      // 0c8: aload 0
      // 0c9: getfield f_9.mq7 Lha9;
      // 0cc: getfield ha9.oay Lt9d;
      // 0cf: new uno
      // 0d2: dup
      // 0d3: aload 0
      // 0d4: getfield f_9.mq7 Lha9;
      // 0d7: getfield ha9.oay Lt9d;
      // 0da: aload 0
      // 0db: getfield f_9.mq7 Lha9;
      // 0de: getfield ha9.o2v D
      // 0e1: aload 0
      // 0e2: getfield f_9.mq7 Lha9;
      // 0e5: getfield ha9.kfp D
      // 0e8: ldc2_w 0.5
      // 0eb: dadd
      // 0ec: aload 0
      // 0ed: getfield f_9.mq7 Lha9;
      // 0f0: getfield ha9.vbd D
      // 0f3: ldc2_w 0.5
      // 0f6: dadd
      // 0f7: iload 5
      // 0f9: invokespecial uno.<init> (Lt9d;DDDI)V
      // 0fc: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 0ff: pop
      // 100: iload 2
      // 101: ifne 114
      // 104: iload 2
      // 105: ifeq 0b9
      // 108: goto 10f
      // 10b: invokestatic f_9.a (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 0
      // 110: bipush 0
      // 111: putfield f_9.ode I
      // 114: aload 1
      // 115: invokevirtual erg.gn1 ()Lu7m;
      // 118: getstatic xbr.icz Lu7m;
      // 11b: iload 2
      // 11c: ifne 141
      // 11f: if_acmpne 13a
      // 122: goto 129
      // 125: invokestatic f_9.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 0
      // 12a: getfield f_9.mq7 Lha9;
      // 12d: getstatic y8d.rbq Ll7l;
      // 130: invokevirtual ha9.aex (L_ss;)V
      // 133: goto 13a
      // 136: invokestatic f_9.a (Loov;)Loov;
      // 139: athrow
      // 13a: aload 1
      // 13b: invokevirtual erg.gn1 ()Lu7m;
      // 13e: getstatic xbr.lh3 Lu7m;
      // 141: if_acmpne 155
      // 144: aload 0
      // 145: getfield f_9.mq7 Lha9;
      // 148: getstatic y8d.rj8 Ll7l;
      // 14b: invokevirtual ha9.aex (L_ss;)V
      // 14e: goto 155
      // 151: invokestatic f_9.a (Loov;)Loov;
      // 154: athrow
      // 155: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
