public class epi extends flo {
   public epi(OpaquePredicate var1, EntityLivingBase var2, w_0 var3) {
      super(var1, var2.o2v, var2.aaw().bx_ + (double)(var2.ikl / 2.0F), var2.vbd, var2.icv, var2.mop, var2.bw4);
      this.bsh = var2;
      this.cw3 = 3;
      this.b_8 = var3;
      this.xx_();
   }

   @Override
   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: bipush 0
      // 005: istore 2
      // 006: iload 2
      // 007: bipush 16
      // 009: if_icmpge 0dc
      // 00c: aload 0
      // 00d: getfield epi.z2d Ljava/util/Random;
      // 010: invokevirtual java/util/Random.nextFloat ()F
      // 013: fconst_2
      // 014: fmul
      // 015: fconst_1
      // 016: fsub
      // 017: f2d
      // 018: dstore 3
      // 019: aload 0
      // 01a: getfield epi.z2d Ljava/util/Random;
      // 01d: invokevirtual java/util/Random.nextFloat ()F
      // 020: fconst_2
      // 021: fmul
      // 022: fconst_1
      // 023: fsub
      // 024: f2d
      // 025: dstore 5
      // 027: aload 0
      // 028: getfield epi.z2d Ljava/util/Random;
      // 02b: invokevirtual java/util/Random.nextFloat ()F
      // 02e: fconst_2
      // 02f: fmul
      // 030: fconst_1
      // 031: fsub
      // 032: f2d
      // 033: dstore 7
      // 035: iload 1
      // 036: ifne 0d8
      // 039: dload 3
      // 03a: dload 3
      // 03b: dmul
      // 03c: dload 5
      // 03e: dload 5
      // 040: dmul
      // 041: dadd
      // 042: dload 7
      // 044: dload 7
      // 046: dmul
      // 047: dadd
      // 048: dconst_1
      // 049: dcmpg
      // 04a: iload 1
      // 04b: ifne 0f5
      // 04e: goto 055
      // 051: invokestatic epi.a (Loov;)Loov;
      // 054: athrow
      // 055: ifgt 0d5
      // 058: goto 05f
      // 05b: invokestatic epi.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield epi.bsh Li2h;
      // 063: getfield EntityLivingBase.o2v D
      // 066: dload 3
      // 067: aload 0
      // 068: getfield epi.bsh Li2h;
      // 06b: getfield EntityLivingBase.uo6 F
      // 06e: f2d
      // 06f: dmul
      // 070: ldc2_w 4.0
      // 073: ddiv
      // 074: dadd
      // 075: dstore 9
      // 077: aload 0
      // 078: getfield epi.bsh Li2h;
      // 07b: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 07e: getfield nh4.bx_ D
      // 081: aload 0
      // 082: getfield epi.bsh Li2h;
      // 085: getfield EntityLivingBase.ikl F
      // 088: fconst_2
      // 089: fdiv
      // 08a: f2d
      // 08b: dadd
      // 08c: dload 5
      // 08e: aload 0
      // 08f: getfield epi.bsh Li2h;
      // 092: getfield EntityLivingBase.ikl F
      // 095: f2d
      // 096: dmul
      // 097: ldc2_w 4.0
      // 09a: ddiv
      // 09b: dadd
      // 09c: dstore 11
      // 09e: aload 0
      // 09f: getfield epi.bsh Li2h;
      // 0a2: getfield EntityLivingBase.vbd D
      // 0a5: dload 7
      // 0a7: aload 0
      // 0a8: getfield epi.bsh Li2h;
      // 0ab: getfield EntityLivingBase.uo6 F
      // 0ae: f2d
      // 0af: dmul
      // 0b0: ldc2_w 4.0
      // 0b3: ddiv
      // 0b4: dadd
      // 0b5: dstore 13
      // 0b7: aload 0
      // 0b8: getfield epi.oay Lt9d;
      // 0bb: aload 0
      // 0bc: getfield epi.b_8 Lw_0;
      // 0bf: bipush 0
      // 0c0: dload 9
      // 0c2: dload 11
      // 0c4: dload 13
      // 0c6: dload 3
      // 0c7: dload 5
      // 0c9: ldc2_w 0.2
      // 0cc: dadd
      // 0cd: dload 7
      // 0cf: bipush 0
      // 0d0: newarray 10
      // 0d2: invokevirtual OpaquePredicate.h2r (Lw_0;ZDDDDDD[I)V
      // 0d5: iinc 2 1
      // 0d8: iload 1
      // 0d9: ifeq 006
      // 0dc: aload 0
      // 0dd: dup
      // 0de: getfield epi.hhd I
      // 0e1: bipush 1
      // 0e2: iadd
      // 0e3: putfield epi.hhd I
      // 0e6: aload 0
      // 0e7: iload 1
      // 0e8: ifne 104
      // 0eb: getfield epi.hhd I
      // 0ee: goto 0f5
      // 0f1: invokestatic epi.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: getfield epi.cw3 I
      // 0f9: if_icmplt 107
      // 0fc: aload 0
      // 0fd: goto 104
      // 100: invokestatic epi.a (Loov;)Loov;
      // 103: athrow
      // 104: invokevirtual epi._kl ()V
      // 107: return
   }

   @Override
   public int ikr() {
      return 3;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
