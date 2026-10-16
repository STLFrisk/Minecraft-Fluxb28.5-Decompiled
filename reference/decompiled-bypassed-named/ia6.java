public class ia6 extends flo {
   public ia6(OpaquePredicate var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.icv *= 0.3F;
      this.mop = Math.random() * 0.2F + 0.1F;
      this.bw4 *= 0.3F;
      this.aeh = 1.0F;
      this.li4 = 1.0F;
      this.v5a = 1.0F;
      this.f0l(19 + this.z2d.nextInt(4));
      this.yxc(0.01F, 0.01F);
      this.xx_ = 0.06F;
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
      // 000: aload 0
      // 001: aload 0
      // 002: getfield ia6.o2v D
      // 005: putfield ia6.bc1 D
      // 008: aload 0
      // 009: aload 0
      // 00a: getfield ia6.kfp D
      // 00d: putfield ia6.o_z D
      // 010: invokestatic OpaquePredicate.c ()I
      // 013: aload 0
      // 014: aload 0
      // 015: getfield ia6.vbd D
      // 018: putfield ia6.a4d D
      // 01b: aload 0
      // 01c: dup
      // 01d: getfield ia6.mop D
      // 020: aload 0
      // 021: getfield ia6.xx_ F
      // 024: f2d
      // 025: dsub
      // 026: putfield ia6.mop D
      // 029: aload 0
      // 02a: aload 0
      // 02b: getfield ia6.icv D
      // 02e: aload 0
      // 02f: getfield ia6.mop D
      // 032: aload 0
      // 033: getfield ia6.bw4 D
      // 036: invokevirtual ia6.vjj (DDD)V
      // 039: istore 1
      // 03a: aload 0
      // 03b: dup
      // 03c: getfield ia6.icv D
      // 03f: ldc2_w 0.9800000190734863
      // 042: dmul
      // 043: putfield ia6.icv D
      // 046: aload 0
      // 047: dup
      // 048: getfield ia6.mop D
      // 04b: ldc2_w 0.9800000190734863
      // 04e: dmul
      // 04f: putfield ia6.mop D
      // 052: aload 0
      // 053: dup
      // 054: getfield ia6.bw4 D
      // 057: ldc2_w 0.9800000190734863
      // 05a: dmul
      // 05b: putfield ia6.bw4 D
      // 05e: aload 0
      // 05f: dup
      // 060: getfield ia6.bx4 I
      // 063: dup_x1
      // 064: bipush 1
      // 065: isub
      // 066: putfield ia6.bx4 I
      // 069: iload 1
      // 06a: ifne 086
      // 06d: ifgt 082
      // 070: goto 077
      // 073: invokestatic ia6.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 0
      // 078: invokevirtual ia6._kl ()V
      // 07b: goto 082
      // 07e: invokestatic ia6.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: getfield ia6.lfk Z
      // 086: iload 1
      // 087: ifne 0a2
      // 08a: ifeq 0c8
      // 08d: goto 094
      // 090: invokestatic ia6.a (Loov;)Loov;
      // 093: athrow
      // 094: invokestatic java/lang/Math.random ()D
      // 097: ldc2_w 0.5
      // 09a: dcmpg
      // 09b: goto 0a2
      // 09e: invokestatic ia6.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: ifge 0b0
      // 0a5: aload 0
      // 0a6: invokevirtual ia6._kl ()V
      // 0a9: goto 0b0
      // 0ac: invokestatic ia6.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: dup
      // 0b2: getfield ia6.icv D
      // 0b5: ldc2_w 0.699999988079071
      // 0b8: dmul
      // 0b9: putfield ia6.icv D
      // 0bc: aload 0
      // 0bd: dup
      // 0be: getfield ia6.bw4 D
      // 0c1: ldc2_w 0.699999988079071
      // 0c4: dmul
      // 0c5: putfield ia6.bw4 D
      // 0c8: new mew
      // 0cb: dup
      // 0cc: aload 0
      // 0cd: invokespecial mew.<init> (Li2h;)V
      // 0d0: astore 2
      // 0d1: aload 0
      // 0d2: getfield ia6.oay Lt9d;
      // 0d5: aload 2
      // 0d6: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0d9: astore 3
      // 0da: aload 3
      // 0db: invokeinterface zfz.r_y ()Le0x; 1
      // 0e0: astore 4
      // 0e2: aload 4
      // 0e4: aload 0
      // 0e5: getfield ia6.oay Lt9d;
      // 0e8: aload 2
      // 0e9: invokevirtual e0x.c7i (Lm5n;Lmew;)V
      // 0ec: aload 3
      // 0ed: invokeinterface zfz.r_y ()Le0x; 1
      // 0f2: invokevirtual e0x.p1r ()Lp3y;
      // 0f5: astore 5
      // 0f7: aload 5
      // 0f9: invokevirtual p3y.l7j ()Z
      // 0fc: iload 1
      // 0fd: ifne 116
      // 100: ifne 119
      // 103: goto 10a
      // 106: invokestatic ia6.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 5
      // 10c: invokevirtual p3y.gk6 ()Z
      // 10f: goto 116
      // 112: invokestatic ia6.a (Loov;)Loov;
      // 115: athrow
      // 116: ifeq 189
      // 119: dconst_0
      // 11a: dstore 6
      // 11c: aload 3
      // 11d: invokeinterface zfz.r_y ()Le0x; 1
      // 122: iload 1
      // 123: ifne 157
      // 126: instanceof hmv
      // 129: ifeq 14e
      // 12c: goto 133
      // 12f: invokestatic ia6.a (Loov;)Loov;
      // 132: athrow
      // 133: fconst_1
      // 134: aload 3
      // 135: getstatic hmv.nfg L_ku;
      // 138: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13d: checkcast java/lang/Integer
      // 140: invokevirtual java/lang/Integer.intValue ()I
      // 143: invokestatic hmv.jou (I)F
      // 146: fsub
      // 147: f2d
      // 148: dstore 6
      // 14a: iload 1
      // 14b: ifeq 15c
      // 14e: aload 4
      // 150: goto 157
      // 153: invokestatic ia6.a (Loov;)Loov;
      // 156: athrow
      // 157: invokevirtual e0x.vn4 ()D
      // 15a: dstore 6
      // 15c: aload 0
      // 15d: getfield ia6.kfp D
      // 160: invokestatic fe6.jqf (D)I
      // 163: i2d
      // 164: dload 6
      // 166: dadd
      // 167: dstore 8
      // 169: aload 0
      // 16a: iload 1
      // 16b: ifne 186
      // 16e: getfield ia6.kfp D
      // 171: dload 8
      // 173: dcmpg
      // 174: ifge 189
      // 177: goto 17e
      // 17a: invokestatic ia6.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 0
      // 17f: goto 186
      // 182: invokestatic ia6.a (Loov;)Loov;
      // 185: athrow
      // 186: invokevirtual ia6._kl ()V
      // 189: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
