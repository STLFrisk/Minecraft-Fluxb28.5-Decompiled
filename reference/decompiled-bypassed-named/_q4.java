import java.util.Random;

public class _q4 extends wgw {
   private static final zfz b1_ = ox_.uom.l4i().zvi(qv5.yuo, x54$lti.b4p);
   private static final zfz qvc = ox_.rwl.l4i().zvi(uav.nps, x54$lti.b4p).zvi(_cv.sdu, false);
   private static final zfz c0k = ox_.kqk.l4i().zvi(bx0.nln, bx0$b_z.sos);
   private boolean s40;

   public _q4(boolean var1, boolean var2) {
      super(var1, 13, 15, b1_, qvc);
      this.s40 = var2;
   }

   @Override
   public boolean v3g(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: aload 2
      // 007: invokevirtual _q4.wl1 (Ljava/util/Random;)I
      // 00a: istore 5
      // 00c: aload 0
      // 00d: aload 1
      // 00e: aload 2
      // 00f: aload 3
      // 010: iload 5
      // 012: invokevirtual _q4.ku6 (Lt9d;Ljava/util/Random;Lmew;I)Z
      // 015: iload 4
      // 017: ifeq 041
      // 01a: ifne 02a
      // 01d: goto 024
      // 020: invokestatic _q4.a (Loov;)Loov;
      // 023: athrow
      // 024: bipush 0
      // 025: ireturn
      // 026: invokestatic _q4.a (Loov;)Loov;
      // 029: athrow
      // 02a: aload 0
      // 02b: aload 1
      // 02c: aload 3
      // 02d: invokevirtual mew.getX ()I
      // 030: aload 3
      // 031: invokevirtual mew.getZ ()I
      // 034: aload 3
      // 035: invokevirtual mew.getY ()I
      // 038: iload 5
      // 03a: iadd
      // 03b: bipush 0
      // 03c: aload 2
      // 03d: invokespecial _q4._pd (Lt9d;IIIILjava/util/Random;)V
      // 040: bipush 0
      // 041: istore 6
      // 043: iload 6
      // 045: iload 5
      // 047: if_icmpge 1bf
      // 04a: aload 1
      // 04b: aload 3
      // 04c: iload 6
      // 04e: invokevirtual mew.z89 (I)Lmew;
      // 051: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 054: invokeinterface zfz.r_y ()Le0x; 1
      // 059: astore 7
      // 05b: aload 7
      // 05d: invokevirtual e0x.p1r ()Lp3y;
      // 060: getstatic p3y.cei Lp3y;
      // 063: iload 4
      // 065: ifeq 081
      // 068: if_acmpeq 084
      // 06b: goto 072
      // 06e: invokestatic _q4.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 7
      // 074: invokevirtual e0x.p1r ()Lp3y;
      // 077: getstatic p3y.hh1 Lp3y;
      // 07a: goto 081
      // 07d: invokestatic _q4.a (Loov;)Loov;
      // 080: athrow
      // 081: if_acmpne 09a
      // 084: aload 0
      // 085: aload 1
      // 086: aload 3
      // 087: iload 6
      // 089: invokevirtual mew.z89 (I)Lmew;
      // 08c: aload 0
      // 08d: getfield _q4._f6 Lzfz;
      // 090: invokevirtual _q4.u0f (Lt9d;Lmew;Lzfz;)V
      // 093: goto 09a
      // 096: invokestatic _q4.a (Loov;)Loov;
      // 099: athrow
      // 09a: iload 6
      // 09c: iload 5
      // 09e: bipush 1
      // 09f: isub
      // 0a0: if_icmpge 1b7
      // 0a3: aload 1
      // 0a4: aload 3
      // 0a5: bipush 1
      // 0a6: iload 6
      // 0a8: bipush 0
      // 0a9: invokevirtual mew.ec4 (III)Lmew;
      // 0ac: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0af: invokeinterface zfz.r_y ()Le0x; 1
      // 0b4: astore 7
      // 0b6: aload 7
      // 0b8: invokevirtual e0x.p1r ()Lp3y;
      // 0bb: getstatic p3y.cei Lp3y;
      // 0be: iload 4
      // 0c0: ifeq 0dc
      // 0c3: if_acmpeq 0eb
      // 0c6: goto 0cd
      // 0c9: invokestatic _q4.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 7
      // 0cf: invokevirtual e0x.p1r ()Lp3y;
      // 0d2: getstatic p3y.hh1 Lp3y;
      // 0d5: goto 0dc
      // 0d8: invokestatic _q4.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: iload 4
      // 0de: ifeq 11e
      // 0e1: if_acmpne 103
      // 0e4: goto 0eb
      // 0e7: invokestatic _q4.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: aload 1
      // 0ed: aload 3
      // 0ee: bipush 1
      // 0ef: iload 6
      // 0f1: bipush 0
      // 0f2: invokevirtual mew.ec4 (III)Lmew;
      // 0f5: aload 0
      // 0f6: getfield _q4._f6 Lzfz;
      // 0f9: invokevirtual _q4.u0f (Lt9d;Lmew;Lzfz;)V
      // 0fc: goto 103
      // 0ff: invokestatic _q4.a (Loov;)Loov;
      // 102: athrow
      // 103: aload 1
      // 104: aload 3
      // 105: bipush 1
      // 106: iload 6
      // 108: bipush 1
      // 109: invokevirtual mew.ec4 (III)Lmew;
      // 10c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 10f: invokeinterface zfz.r_y ()Le0x; 1
      // 114: astore 7
      // 116: aload 7
      // 118: invokevirtual e0x.p1r ()Lp3y;
      // 11b: getstatic p3y.cei Lp3y;
      // 11e: iload 4
      // 120: ifeq 13c
      // 123: if_acmpeq 14b
      // 126: goto 12d
      // 129: invokestatic _q4.a (Loov;)Loov;
      // 12c: athrow
      // 12d: aload 7
      // 12f: invokevirtual e0x.p1r ()Lp3y;
      // 132: getstatic p3y.hh1 Lp3y;
      // 135: goto 13c
      // 138: invokestatic _q4.a (Loov;)Loov;
      // 13b: athrow
      // 13c: iload 4
      // 13e: ifeq 17e
      // 141: if_acmpne 163
      // 144: goto 14b
      // 147: invokestatic _q4.a (Loov;)Loov;
      // 14a: athrow
      // 14b: aload 0
      // 14c: aload 1
      // 14d: aload 3
      // 14e: bipush 1
      // 14f: iload 6
      // 151: bipush 1
      // 152: invokevirtual mew.ec4 (III)Lmew;
      // 155: aload 0
      // 156: getfield _q4._f6 Lzfz;
      // 159: invokevirtual _q4.u0f (Lt9d;Lmew;Lzfz;)V
      // 15c: goto 163
      // 15f: invokestatic _q4.a (Loov;)Loov;
      // 162: athrow
      // 163: aload 1
      // 164: aload 3
      // 165: bipush 0
      // 166: iload 6
      // 168: bipush 1
      // 169: invokevirtual mew.ec4 (III)Lmew;
      // 16c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 16f: invokeinterface zfz.r_y ()Le0x; 1
      // 174: astore 7
      // 176: aload 7
      // 178: invokevirtual e0x.p1r ()Lp3y;
      // 17b: getstatic p3y.cei Lp3y;
      // 17e: iload 4
      // 180: ifeq 19c
      // 183: if_acmpeq 19f
      // 186: goto 18d
      // 189: invokestatic _q4.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 7
      // 18f: invokevirtual e0x.p1r ()Lp3y;
      // 192: getstatic p3y.hh1 Lp3y;
      // 195: goto 19c
      // 198: invokestatic _q4.a (Loov;)Loov;
      // 19b: athrow
      // 19c: if_acmpne 1b7
      // 19f: aload 0
      // 1a0: aload 1
      // 1a1: aload 3
      // 1a2: bipush 0
      // 1a3: iload 6
      // 1a5: bipush 1
      // 1a6: invokevirtual mew.ec4 (III)Lmew;
      // 1a9: aload 0
      // 1aa: getfield _q4._f6 Lzfz;
      // 1ad: invokevirtual _q4.u0f (Lt9d;Lmew;Lzfz;)V
      // 1b0: goto 1b7
      // 1b3: invokestatic _q4.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: iinc 6 1
      // 1ba: iload 4
      // 1bc: ifne 043
      // 1bf: bipush 1
      // 1c0: ireturn
   }

   private void _pd(OpaquePredicate param1, int param2, int param3, int param4, int param5, Random param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 7
      // 05: aload 6
      // 07: bipush 5
      // 08: invokevirtual java/util/Random.nextInt (I)I
      // 0b: aload 0
      // 0c: getfield _q4.s40 Z
      // 0f: iload 7
      // 11: ifne 29
      // 14: ifeq 2c
      // 17: goto 1e
      // 1a: invokestatic _q4.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield _q4.ddh I
      // 22: goto 29
      // 25: invokestatic _q4.a (Loov;)Loov;
      // 28: athrow
      // 29: goto 2d
      // 2c: bipush 3
      // 2d: iadd
      // 2e: istore 8
      // 30: bipush 0
      // 31: istore 9
      // 33: iload 4
      // 35: iload 8
      // 37: isub
      // 38: istore 10
      // 3a: iload 10
      // 3c: iload 4
      // 3e: if_icmpgt bd
      // 41: iload 4
      // 43: iload 10
      // 45: isub
      // 46: istore 11
      // 48: iload 5
      // 4a: iload 11
      // 4c: i2f
      // 4d: iload 8
      // 4f: i2f
      // 50: fdiv
      // 51: ldc 3.5
      // 53: nop
      // 54: fmul
      // 55: invokestatic fe6.tpk (F)I
      // 58: iadd
      // 59: istore 12
      // 5b: aload 0
      // 5c: aload 1
      // 5d: new mew
      // 60: dup
      // 61: iload 2
      // 62: iload 10
      // 64: iload 3
      // 65: invokespecial mew.<init> (III)V
      // 68: iload 12
      // 6a: iload 11
      // 6c: iload 7
      // 6e: ifne 7d
      // 71: ifle ac
      // 74: goto 7b
      // 77: invokestatic _q4.a (Loov;)Loov;
      // 7a: athrow
      // 7b: iload 12
      // 7d: iload 9
      // 7f: iload 7
      // 81: ifne 98
      // 84: if_icmpne ac
      // 87: goto 8e
      // 8a: invokestatic _q4.a (Loov;)Loov;
      // 8d: athrow
      // 8e: iload 10
      // 90: bipush 1
      // 91: goto 98
      // 94: invokestatic _q4.a (Loov;)Loov;
      // 97: athrow
      // 98: iand
      // 99: iload 7
      // 9b: ifne a9
      // 9e: ifne ac
      // a1: goto a8
      // a4: invokestatic _q4.a (Loov;)Loov;
      // a7: athrow
      // a8: bipush 1
      // a9: goto ad
      // ac: bipush 0
      // ad: iadd
      // ae: invokevirtual _q4.c9n (Lt9d;Lmew;I)V
      // b1: iload 12
      // b3: istore 9
      // b5: iinc 10 1
      // b8: iload 7
      // ba: ifeq 3a
      // bd: return
   }

   @Override
   public void mpp(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 3
      // 03: invokevirtual mew.y8e ()Lmew;
      // 06: invokevirtual mew.idu ()Lmew;
      // 09: invokespecial _q4.ij1 (Lt9d;Lmew;)V
      // 0c: invokestatic OpaquePredicate.c ()I
      // 0f: aload 0
      // 10: aload 1
      // 11: aload 3
      // 12: bipush 2
      // 13: invokevirtual mew.b20 (I)Lmew;
      // 16: invokevirtual mew.idu ()Lmew;
      // 19: invokespecial _q4.ij1 (Lt9d;Lmew;)V
      // 1c: aload 0
      // 1d: aload 1
      // 1e: aload 3
      // 1f: invokevirtual mew.y8e ()Lmew;
      // 22: bipush 2
      // 23: invokevirtual mew.wfo (I)Lmew;
      // 26: invokespecial _q4.ij1 (Lt9d;Lmew;)V
      // 29: aload 0
      // 2a: aload 1
      // 2b: aload 3
      // 2c: bipush 2
      // 2d: invokevirtual mew.b20 (I)Lmew;
      // 30: bipush 2
      // 31: invokevirtual mew.wfo (I)Lmew;
      // 34: invokespecial _q4.ij1 (Lt9d;Lmew;)V
      // 37: istore 4
      // 39: bipush 0
      // 3a: istore 5
      // 3c: iload 5
      // 3e: bipush 5
      // 3f: if_icmpge be
      // 42: aload 2
      // 43: bipush 64
      // 45: invokevirtual java/util/Random.nextInt (I)I
      // 48: istore 6
      // 4a: iload 6
      // 4c: bipush 8
      // 4e: irem
      // 4f: istore 7
      // 51: iload 6
      // 53: bipush 8
      // 55: idiv
      // 56: istore 8
      // 58: iload 7
      // 5a: iload 4
      // 5c: ifne 6b
      // 5f: ifeq 9b
      // 62: goto 69
      // 65: invokestatic _q4.a (Loov;)Loov;
      // 68: athrow
      // 69: iload 7
      // 6b: iload 4
      // 6d: ifne 85
      // 70: bipush 7
      // 72: if_icmpeq 9b
      // 75: goto 7c
      // 78: invokestatic _q4.a (Loov;)Loov;
      // 7b: athrow
      // 7c: iload 8
      // 7e: goto 85
      // 81: invokestatic _q4.a (Loov;)Loov;
      // 84: athrow
      // 85: iload 4
      // 87: ifne 96
      // 8a: ifeq 9b
      // 8d: goto 94
      // 90: invokestatic _q4.a (Loov;)Loov;
      // 93: athrow
      // 94: iload 8
      // 96: bipush 7
      // 98: if_icmpne b6
      // 9b: aload 0
      // 9c: aload 1
      // 9d: aload 3
      // 9e: bipush -3
      // a0: iload 7
      // a2: iadd
      // a3: bipush 0
      // a4: bipush -3
      // a6: iload 8
      // a8: iadd
      // a9: invokevirtual mew.ec4 (III)Lmew;
      // ac: invokespecial _q4.ij1 (Lt9d;Lmew;)V
      // af: goto b6
      // b2: invokestatic _q4.a (Loov;)Loov;
      // b5: athrow
      // b6: iinc 5 1
      // b9: iload 4
      // bb: ifeq 3c
      // be: return
   }

   private void ij1(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: bipush -2
      // 06: istore 4
      // 08: iload 4
      // 0a: bipush 2
      // 0b: if_icmpgt 63
      // 0e: bipush -2
      // 10: istore 5
      // 12: iload 5
      // 14: bipush 2
      // 15: if_icmpgt 5c
      // 18: iload 4
      // 1a: invokestatic java/lang/Math.abs (I)I
      // 1d: bipush 2
      // 1e: iload 3
      // 1f: ifeq 0b
      // 22: iload 3
      // 23: ifeq 3d
      // 26: if_icmpne 40
      // 29: goto 30
      // 2c: invokestatic _q4.a (Loov;)Loov;
      // 2f: athrow
      // 30: iload 5
      // 32: invokestatic java/lang/Math.abs (I)I
      // 35: bipush 2
      // 36: goto 3d
      // 39: invokestatic _q4.a (Loov;)Loov;
      // 3c: athrow
      // 3d: if_icmpeq 55
      // 40: aload 0
      // 41: aload 1
      // 42: aload 2
      // 43: iload 4
      // 45: bipush 0
      // 46: iload 5
      // 48: invokevirtual mew.ec4 (III)Lmew;
      // 4b: invokespecial _q4.mhi (Lt9d;Lmew;)V
      // 4e: goto 55
      // 51: invokestatic _q4.a (Loov;)Loov;
      // 54: athrow
      // 55: iinc 5 1
      // 58: iload 3
      // 59: ifne 12
      // 5c: iinc 4 1
      // 5f: iload 3
      // 60: ifne 08
      // 63: return
   }

   private void mhi(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: bipush 2
      // 05: istore 4
      // 07: iload 4
      // 09: bipush -3
      // 0b: if_icmplt 91
      // 0e: aload 2
      // 0f: iload 4
      // 11: invokevirtual mew.z89 (I)Lmew;
      // 14: astore 5
      // 16: aload 1
      // 17: aload 5
      // 19: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1c: invokeinterface zfz.r_y ()Le0x; 1
      // 21: astore 6
      // 23: iload 3
      // 24: ifeq 61
      // 27: aload 6
      // 29: getstatic ox_.l11 Lx82;
      // 2c: if_acmpeq 50
      // 2f: goto 36
      // 32: invokestatic _q4.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 6
      // 38: iload 3
      // 39: ifeq 6e
      // 3c: goto 43
      // 3f: invokestatic _q4.a (Loov;)Loov;
      // 42: athrow
      // 43: getstatic ox_.kqk Le0x;
      // 46: if_acmpne 65
      // 49: goto 50
      // 4c: invokestatic _q4.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: aload 1
      // 52: aload 5
      // 54: getstatic _q4.c0k Lzfz;
      // 57: invokevirtual _q4.u0f (Lt9d;Lmew;Lzfz;)V
      // 5a: goto 61
      // 5d: invokestatic _q4.a (Loov;)Loov;
      // 60: athrow
      // 61: iload 3
      // 62: ifne 91
      // 65: aload 6
      // 67: goto 6e
      // 6a: invokestatic _q4.a (Loov;)Loov;
      // 6d: athrow
      // 6e: invokevirtual e0x.p1r ()Lp3y;
      // 71: getstatic p3y.cei Lp3y;
      // 74: if_acmpeq 8a
      // 77: iload 4
      // 79: ifge 8a
      // 7c: goto 83
      // 7f: invokestatic _q4.a (Loov;)Loov;
      // 82: athrow
      // 83: goto 91
      // 86: invokestatic _q4.a (Loov;)Loov;
      // 89: athrow
      // 8a: iinc 4 -1
      // 8d: iload 3
      // 8e: ifne 07
      // 91: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
