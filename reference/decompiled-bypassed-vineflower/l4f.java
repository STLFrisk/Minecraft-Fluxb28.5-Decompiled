public class l4f extends w66 {
   private boolean iho;
   private boolean rcy;
   private boolean yei;
   private boolean byl;
   private boolean nvz;

   @Override
   public void zrj(m5n var1, i2h var2) {
      super.zrj(var1, var2);
      this.nvz = this.yei;
   }

   @Override
   public void ai9() {
      super.ai9();
      this.yei = this.nvz;
   }

   @Override
   public mux wvu(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield l4f.byl Z
      // 08: iload 2
      // 09: ifeq db
      // 0c: ifeq c6
      // 0f: goto 16
      // 12: invokestatic l4f.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual i2h.mwv ()Z
      // 1a: iload 2
      // 1b: ifeq db
      // 1e: goto 25
      // 21: invokestatic l4f.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq c6
      // 28: goto 2f
      // 2b: invokestatic l4f.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: invokevirtual i2h.aaw ()Lnh4;
      // 33: getfield nh4.bx_ D
      // 36: d2i
      // 37: istore 3
      // 38: new mew$mix
      // 3b: dup
      // 3c: aload 1
      // 3d: getfield i2h.o2v D
      // 40: invokestatic fe6.jqf (D)I
      // 43: iload 3
      // 44: aload 1
      // 45: getfield i2h.vbd D
      // 48: invokestatic fe6.jqf (D)I
      // 4b: invokespecial mew$mix.<init> (III)V
      // 4e: astore 4
      // 50: aload 0
      // 51: getfield l4f.utp Lm5n;
      // 54: aload 4
      // 56: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 5b: invokeinterface zfz.r_y ()Le0x; 1
      // 60: astore 5
      // 62: aload 5
      // 64: getstatic ox_.whp L_13;
      // 67: if_acmpeq 88
      // 6a: aload 5
      // 6c: iload 2
      // 6d: ifeq b7
      // 70: iload 2
      // 71: ifeq b7
      // 74: goto 7b
      // 77: invokestatic l4f.a (Loov;)Loov;
      // 7a: athrow
      // 7b: getstatic ox_.gdz Les2;
      // 7e: if_acmpne bd
      // 81: goto 88
      // 84: invokestatic l4f.a (Loov;)Loov;
      // 87: athrow
      // 88: iinc 3 1
      // 8b: aload 4
      // 8d: aload 1
      // 8e: getfield i2h.o2v D
      // 91: invokestatic fe6.jqf (D)I
      // 94: iload 3
      // 95: aload 1
      // 96: getfield i2h.vbd D
      // 99: invokestatic fe6.jqf (D)I
      // 9c: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 9f: pop
      // a0: aload 0
      // a1: getfield l4f.utp Lm5n;
      // a4: aload 4
      // a6: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // ab: invokeinterface zfz.r_y ()Le0x; 1
      // b0: goto b7
      // b3: invokestatic l4f.a (Loov;)Loov;
      // b6: athrow
      // b7: astore 5
      // b9: iload 2
      // ba: ifne 62
      // bd: aload 0
      // be: bipush 0
      // bf: putfield l4f.yei Z
      // c2: iload 2
      // c3: ifne dc
      // c6: aload 1
      // c7: invokevirtual i2h.aaw ()Lnh4;
      // ca: getfield nh4.bx_ D
      // cd: ldc2_w 0.5
      // d0: dadd
      // d1: invokestatic fe6.jqf (D)I
      // d4: goto db
      // d7: invokestatic l4f.a (Loov;)Loov;
      // da: athrow
      // db: istore 3
      // dc: aload 0
      // dd: aload 1
      // de: invokevirtual i2h.aaw ()Lnh4;
      // e1: getfield nh4.rlc D
      // e4: invokestatic fe6.jqf (D)I
      // e7: iload 3
      // e8: aload 1
      // e9: invokevirtual i2h.aaw ()Lnh4;
      // ec: getfield nh4.t8n D
      // ef: invokestatic fe6.jqf (D)I
      // f2: invokevirtual l4f.r3f (III)Lmux;
      // f5: areturn
   }

   @Override
   public mux r7o(i2h var1, double var2, double var4, double var6) {
      return this.r3f(fe6.jqf(var2 - (double)(var1.uo6 / 2.0F)), fe6.jqf(var4), fe6.jqf(var6 - (double)(var1.uo6 / 2.0F)));
   }

   @Override
   public int t2_(mux[] param1, i2h param2, mux param3, mux param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 7
      // 003: invokestatic t9d.c ()I
      // 006: bipush 0
      // 007: istore 8
      // 009: istore 6
      // 00b: aload 0
      // 00c: aload 2
      // 00d: aload 3
      // 00e: getfield mux.ksp I
      // 011: aload 3
      // 012: getfield mux.ztw I
      // 015: bipush 1
      // 016: iadd
      // 017: aload 3
      // 018: getfield mux.gf3 I
      // 01b: iload 6
      // 01d: ifne 041
      // 020: invokespecial l4f.wlh (Li2h;III)I
      // 023: bipush 1
      // 024: if_icmpne 031
      // 027: goto 02e
      // 02a: invokestatic l4f.a (Loov;)Loov;
      // 02d: athrow
      // 02e: bipush 1
      // 02f: istore 8
      // 031: aload 0
      // 032: aload 2
      // 033: aload 3
      // 034: getfield mux.ksp I
      // 037: aload 3
      // 038: getfield mux.ztw I
      // 03b: aload 3
      // 03c: getfield mux.gf3 I
      // 03f: bipush 1
      // 040: iadd
      // 041: iload 8
      // 043: invokespecial l4f.hs_ (Li2h;IIII)Lmux;
      // 046: astore 9
      // 048: aload 0
      // 049: aload 2
      // 04a: aload 3
      // 04b: getfield mux.ksp I
      // 04e: bipush 1
      // 04f: isub
      // 050: aload 3
      // 051: getfield mux.ztw I
      // 054: aload 3
      // 055: getfield mux.gf3 I
      // 058: iload 8
      // 05a: invokespecial l4f.hs_ (Li2h;IIII)Lmux;
      // 05d: astore 10
      // 05f: aload 0
      // 060: aload 2
      // 061: aload 3
      // 062: getfield mux.ksp I
      // 065: bipush 1
      // 066: iadd
      // 067: aload 3
      // 068: getfield mux.ztw I
      // 06b: aload 3
      // 06c: getfield mux.gf3 I
      // 06f: iload 8
      // 071: invokespecial l4f.hs_ (Li2h;IIII)Lmux;
      // 074: astore 11
      // 076: aload 0
      // 077: aload 2
      // 078: aload 3
      // 079: getfield mux.ksp I
      // 07c: aload 3
      // 07d: getfield mux.ztw I
      // 080: aload 3
      // 081: getfield mux.gf3 I
      // 084: bipush 1
      // 085: isub
      // 086: iload 8
      // 088: invokespecial l4f.hs_ (Li2h;IIII)Lmux;
      // 08b: astore 12
      // 08d: aload 9
      // 08f: iload 6
      // 091: ifne 0eb
      // 094: ifnull 0e9
      // 097: goto 09e
      // 09a: invokestatic l4f.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 9
      // 0a0: iload 6
      // 0a2: ifne 0eb
      // 0a5: goto 0ac
      // 0a8: invokestatic l4f.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: getfield mux.n77 Z
      // 0af: ifne 0e9
      // 0b2: goto 0b9
      // 0b5: invokestatic l4f.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 9
      // 0bb: iload 6
      // 0bd: ifne 0eb
      // 0c0: goto 0c7
      // 0c3: invokestatic l4f.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 4
      // 0c9: invokevirtual mux.l3z (Lmux;)F
      // 0cc: fload 5
      // 0ce: fcmpg
      // 0cf: ifge 0e9
      // 0d2: goto 0d9
      // 0d5: invokestatic l4f.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 1
      // 0da: iload 7
      // 0dc: iinc 7 1
      // 0df: aload 9
      // 0e1: aastore
      // 0e2: goto 0e9
      // 0e5: invokestatic l4f.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: aload 10
      // 0eb: iload 6
      // 0ed: ifne 147
      // 0f0: ifnull 145
      // 0f3: goto 0fa
      // 0f6: invokestatic l4f.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 10
      // 0fc: iload 6
      // 0fe: ifne 147
      // 101: goto 108
      // 104: invokestatic l4f.a (Loov;)Loov;
      // 107: athrow
      // 108: getfield mux.n77 Z
      // 10b: ifne 145
      // 10e: goto 115
      // 111: invokestatic l4f.a (Loov;)Loov;
      // 114: athrow
      // 115: aload 10
      // 117: iload 6
      // 119: ifne 147
      // 11c: goto 123
      // 11f: invokestatic l4f.a (Loov;)Loov;
      // 122: athrow
      // 123: aload 4
      // 125: invokevirtual mux.l3z (Lmux;)F
      // 128: fload 5
      // 12a: fcmpg
      // 12b: ifge 145
      // 12e: goto 135
      // 131: invokestatic l4f.a (Loov;)Loov;
      // 134: athrow
      // 135: aload 1
      // 136: iload 7
      // 138: iinc 7 1
      // 13b: aload 10
      // 13d: aastore
      // 13e: goto 145
      // 141: invokestatic l4f.a (Loov;)Loov;
      // 144: athrow
      // 145: aload 11
      // 147: iload 6
      // 149: ifne 1a3
      // 14c: ifnull 1a1
      // 14f: goto 156
      // 152: invokestatic l4f.a (Loov;)Loov;
      // 155: athrow
      // 156: aload 11
      // 158: iload 6
      // 15a: ifne 1a3
      // 15d: goto 164
      // 160: invokestatic l4f.a (Loov;)Loov;
      // 163: athrow
      // 164: getfield mux.n77 Z
      // 167: ifne 1a1
      // 16a: goto 171
      // 16d: invokestatic l4f.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 11
      // 173: iload 6
      // 175: ifne 1a3
      // 178: goto 17f
      // 17b: invokestatic l4f.a (Loov;)Loov;
      // 17e: athrow
      // 17f: aload 4
      // 181: invokevirtual mux.l3z (Lmux;)F
      // 184: fload 5
      // 186: fcmpg
      // 187: ifge 1a1
      // 18a: goto 191
      // 18d: invokestatic l4f.a (Loov;)Loov;
      // 190: athrow
      // 191: aload 1
      // 192: iload 7
      // 194: iinc 7 1
      // 197: aload 11
      // 199: aastore
      // 19a: goto 1a1
      // 19d: invokestatic l4f.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: aload 12
      // 1a3: iload 6
      // 1a5: ifne 1b4
      // 1a8: ifnull 1f6
      // 1ab: goto 1b2
      // 1ae: invokestatic l4f.a (Loov;)Loov;
      // 1b1: athrow
      // 1b2: aload 12
      // 1b4: getfield mux.n77 Z
      // 1b7: iload 6
      // 1b9: ifne 1f8
      // 1bc: ifne 1f6
      // 1bf: goto 1c6
      // 1c2: invokestatic l4f.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: aload 12
      // 1c8: aload 4
      // 1ca: invokevirtual mux.l3z (Lmux;)F
      // 1cd: fload 5
      // 1cf: fcmpg
      // 1d0: iload 6
      // 1d2: ifne 1f8
      // 1d5: goto 1dc
      // 1d8: invokestatic l4f.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: ifge 1f6
      // 1df: goto 1e6
      // 1e2: invokestatic l4f.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: aload 1
      // 1e7: iload 7
      // 1e9: iinc 7 1
      // 1ec: aload 12
      // 1ee: aastore
      // 1ef: goto 1f6
      // 1f2: invokestatic l4f.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: iload 7
      // 1f8: ireturn
   }

   private mux hs_(i2h param1, int param2, int param3, int param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aconst_null
      // 001: astore 7
      // 003: invokestatic t9d.c ()I
      // 006: aload 0
      // 007: aload 1
      // 008: iload 2
      // 009: iload 3
      // 00a: iload 4
      // 00c: invokespecial l4f.wlh (Li2h;III)I
      // 00f: istore 8
      // 011: istore 6
      // 013: iload 8
      // 015: bipush 2
      // 016: iload 6
      // 018: ifne 035
      // 01b: if_icmpne 032
      // 01e: goto 025
      // 021: invokestatic l4f.a (Loov;)Loov;
      // 024: athrow
      // 025: aload 0
      // 026: iload 2
      // 027: iload 3
      // 028: iload 4
      // 02a: invokevirtual l4f.r3f (III)Lmux;
      // 02d: areturn
      // 02e: invokestatic l4f.a (Loov;)Loov;
      // 031: athrow
      // 032: iload 8
      // 034: bipush 1
      // 035: if_icmpne 042
      // 038: aload 0
      // 039: iload 2
      // 03a: iload 3
      // 03b: iload 4
      // 03d: invokevirtual l4f.r3f (III)Lmux;
      // 040: astore 7
      // 042: aload 7
      // 044: iload 6
      // 046: ifne 0cf
      // 049: ifnonnull 0cd
      // 04c: goto 053
      // 04f: invokestatic l4f.a (Loov;)Loov;
      // 052: athrow
      // 053: iload 5
      // 055: iload 6
      // 057: ifne 06d
      // 05a: goto 061
      // 05d: invokestatic l4f.a (Loov;)Loov;
      // 060: athrow
      // 061: ifle 0cd
      // 064: goto 06b
      // 067: invokestatic l4f.a (Loov;)Loov;
      // 06a: athrow
      // 06b: iload 8
      // 06d: bipush -3
      // 06f: iload 6
      // 071: ifne 089
      // 074: if_icmpeq 0cd
      // 077: goto 07e
      // 07a: invokestatic l4f.a (Loov;)Loov;
      // 07d: athrow
      // 07e: iload 8
      // 080: bipush -4
      // 082: goto 089
      // 085: invokestatic l4f.a (Loov;)Loov;
      // 088: athrow
      // 089: iload 6
      // 08b: ifne 0ac
      // 08e: if_icmpeq 0cd
      // 091: goto 098
      // 094: invokestatic l4f.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 0
      // 099: aload 1
      // 09a: iload 2
      // 09b: iload 3
      // 09c: iload 5
      // 09e: iadd
      // 09f: iload 4
      // 0a1: invokespecial l4f.wlh (Li2h;III)I
      // 0a4: bipush 1
      // 0a5: goto 0ac
      // 0a8: invokestatic l4f.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: iload 6
      // 0ae: ifne 0cb
      // 0b1: if_icmpne 0cd
      // 0b4: goto 0bb
      // 0b7: invokestatic l4f.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: iload 2
      // 0bd: iload 3
      // 0be: iload 5
      // 0c0: iadd
      // 0c1: iload 4
      // 0c3: invokevirtual l4f.r3f (III)Lmux;
      // 0c6: astore 7
      // 0c8: iload 3
      // 0c9: iload 5
      // 0cb: iadd
      // 0cc: istore 3
      // 0cd: aload 7
      // 0cf: iload 6
      // 0d1: ifne 19d
      // 0d4: ifnull 19b
      // 0d7: goto 0de
      // 0da: invokestatic l4f.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: bipush 0
      // 0df: istore 9
      // 0e1: bipush 0
      // 0e2: istore 10
      // 0e4: iload 3
      // 0e5: ifle 18e
      // 0e8: aload 0
      // 0e9: aload 1
      // 0ea: iload 2
      // 0eb: iload 3
      // 0ec: bipush 1
      // 0ed: isub
      // 0ee: iload 4
      // 0f0: invokespecial l4f.wlh (Li2h;III)I
      // 0f3: istore 10
      // 0f5: aload 0
      // 0f6: getfield l4f.yei Z
      // 0f9: iload 6
      // 0fb: ifne 190
      // 0fe: iload 6
      // 100: ifne 135
      // 103: goto 10a
      // 106: invokestatic l4f.a (Loov;)Loov;
      // 109: athrow
      // 10a: ifeq 133
      // 10d: goto 114
      // 110: invokestatic l4f.a (Loov;)Loov;
      // 113: athrow
      // 114: iload 10
      // 116: bipush -1
      // 117: iload 6
      // 119: ifne 136
      // 11c: goto 123
      // 11f: invokestatic l4f.a (Loov;)Loov;
      // 122: athrow
      // 123: if_icmpne 133
      // 126: goto 12d
      // 129: invokestatic l4f.a (Loov;)Loov;
      // 12c: athrow
      // 12d: aconst_null
      // 12e: areturn
      // 12f: invokestatic l4f.a (Loov;)Loov;
      // 132: athrow
      // 133: iload 10
      // 135: bipush 1
      // 136: iload 6
      // 138: ifne 15d
      // 13b: if_icmpeq 148
      // 13e: goto 145
      // 141: invokestatic l4f.a (Loov;)Loov;
      // 144: athrow
      // 145: goto 18e
      // 148: iload 9
      // 14a: iinc 9 1
      // 14d: iload 6
      // 14f: ifne 176
      // 152: aload 1
      // 153: invokevirtual i2h.c4g ()I
      // 156: goto 15d
      // 159: invokestatic l4f.a (Loov;)Loov;
      // 15c: athrow
      // 15d: if_icmplt 166
      // 160: aconst_null
      // 161: areturn
      // 162: invokestatic l4f.a (Loov;)Loov;
      // 165: athrow
      // 166: iinc 3 -1
      // 169: iload 6
      // 16b: ifne 189
      // 16e: iload 3
      // 16f: goto 176
      // 172: invokestatic l4f.a (Loov;)Loov;
      // 175: athrow
      // 176: ifgt 17f
      // 179: aconst_null
      // 17a: areturn
      // 17b: invokestatic l4f.a (Loov;)Loov;
      // 17e: athrow
      // 17f: aload 0
      // 180: iload 2
      // 181: iload 3
      // 182: iload 4
      // 184: invokevirtual l4f.r3f (III)Lmux;
      // 187: astore 7
      // 189: iload 6
      // 18b: ifeq 0e4
      // 18e: iload 10
      // 190: bipush -2
      // 192: if_icmpne 19b
      // 195: aconst_null
      // 196: areturn
      // 197: invokestatic l4f.a (Loov;)Loov;
      // 19a: athrow
      // 19b: aload 7
      // 19d: areturn
   }

   private int wlh(i2h var1, int var2, int var3, int var4) {
      return ccu(this.utp, var1, var2, var3, var4, this.ttk, this.yva, this.r9u, this.yei, this.rcy, this.iho);
   }

   public static int ccu(
      m5n param0, i2h param1, int param2, int param3, int param4, int param5, int param6, int param7, boolean param8, boolean param9, boolean param10
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 0
      // 001: istore 12
      // 003: invokestatic t9d.c ()I
      // 006: new mew
      // 009: dup
      // 00a: aload 1
      // 00b: invokespecial mew.<init> (Li2h;)V
      // 00e: astore 13
      // 010: istore 11
      // 012: new mew$mix
      // 015: dup
      // 016: invokespecial mew$mix.<init> ()V
      // 019: astore 14
      // 01b: iload 2
      // 01c: istore 15
      // 01e: iload 15
      // 020: iload 2
      // 021: iload 5
      // 023: iadd
      // 024: if_icmpge 304
      // 027: iload 3
      // 028: iload 11
      // 02a: ifne 306
      // 02d: istore 16
      // 02f: iload 16
      // 031: iload 3
      // 032: iload 6
      // 034: iadd
      // 035: if_icmpge 2fc
      // 038: iload 4
      // 03a: iload 11
      // 03c: ifne 020
      // 03f: istore 17
      // 041: iload 17
      // 043: iload 4
      // 045: iload 7
      // 047: iadd
      // 048: if_icmpge 2f4
      // 04b: aload 14
      // 04d: iload 15
      // 04f: iload 16
      // 051: iload 17
      // 053: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 056: pop
      // 057: aload 0
      // 058: aload 14
      // 05a: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 05f: invokeinterface zfz.r_y ()Le0x; 1
      // 064: astore 18
      // 066: iload 11
      // 068: ifne 2f7
      // 06b: iload 11
      // 06d: ifne 2ef
      // 070: goto 077
      // 073: invokestatic l4f.a (Loov;)Loov;
      // 076: athrow
      // 077: aload 18
      // 079: invokevirtual e0x.p1r ()Lp3y;
      // 07c: getstatic p3y.cei Lp3y;
      // 07f: if_acmpeq 2ec
      // 082: goto 089
      // 085: invokestatic l4f.a (Loov;)Loov;
      // 088: athrow
      // 089: aload 18
      // 08b: getstatic ox_.bus Le0x;
      // 08e: iload 11
      // 090: ifne 0bc
      // 093: goto 09a
      // 096: invokestatic l4f.a (Loov;)Loov;
      // 099: athrow
      // 09a: if_acmpeq 158
      // 09d: goto 0a4
      // 0a0: invokestatic l4f.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 18
      // 0a6: iload 11
      // 0a8: ifne 0c1
      // 0ab: goto 0b2
      // 0ae: invokestatic l4f.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: getstatic ox_.gs2 Le0x;
      // 0b5: goto 0bc
      // 0b8: invokestatic l4f.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: if_acmpeq 158
      // 0bf: aload 18
      // 0c1: iload 11
      // 0c3: ifne 0dc
      // 0c6: getstatic ox_.whp L_13;
      // 0c9: if_acmpeq 139
      // 0cc: goto 0d3
      // 0cf: invokestatic l4f.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 18
      // 0d5: goto 0dc
      // 0d8: invokestatic l4f.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: getstatic ox_.gdz Les2;
      // 0df: if_acmpeq 139
      // 0e2: iload 10
      // 0e4: iload 11
      // 0e6: ifne 16c
      // 0e9: goto 0f0
      // 0ec: invokestatic l4f.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: ifne 15b
      // 0f3: goto 0fa
      // 0f6: invokestatic l4f.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 18
      // 0fc: instanceof w4e
      // 0ff: iload 11
      // 101: ifne 16c
      // 104: goto 10b
      // 107: invokestatic l4f.a (Loov;)Loov;
      // 10a: athrow
      // 10b: ifeq 15b
      // 10e: goto 115
      // 111: invokestatic l4f.a (Loov;)Loov;
      // 114: athrow
      // 115: aload 18
      // 117: iload 11
      // 119: ifne 169
      // 11c: goto 123
      // 11f: invokestatic l4f.a (Loov;)Loov;
      // 122: athrow
      // 123: invokevirtual e0x.p1r ()Lp3y;
      // 126: getstatic p3y.fdu Lp3y;
      // 129: if_acmpne 15b
      // 12c: goto 133
      // 12f: invokestatic l4f.a (Loov;)Loov;
      // 132: athrow
      // 133: bipush 0
      // 134: ireturn
      // 135: invokestatic l4f.a (Loov;)Loov;
      // 138: athrow
      // 139: iload 8
      // 13b: iload 11
      // 13d: ifne 151
      // 140: ifeq 150
      // 143: goto 14a
      // 146: invokestatic l4f.a (Loov;)Loov;
      // 149: athrow
      // 14a: bipush -1
      // 14b: ireturn
      // 14c: invokestatic l4f.a (Loov;)Loov;
      // 14f: athrow
      // 150: bipush 1
      // 151: istore 12
      // 153: iload 11
      // 155: ifeq 15b
      // 158: bipush 1
      // 159: istore 12
      // 15b: aload 1
      // 15c: getfield i2h.oay Lt9d;
      // 15f: aload 14
      // 161: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 164: invokeinterface zfz.r_y ()Le0x; 1
      // 169: instanceof y0y
      // 16c: iload 11
      // 16e: ifne 1d7
      // 171: ifeq 1cf
      // 174: goto 17b
      // 177: invokestatic l4f.a (Loov;)Loov;
      // 17a: athrow
      // 17b: aload 1
      // 17c: getfield i2h.oay Lt9d;
      // 17f: aload 13
      // 181: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 184: invokeinterface zfz.r_y ()Le0x; 1
      // 189: instanceof y0y
      // 18c: iload 11
      // 18e: ifne 1bd
      // 191: goto 198
      // 194: invokestatic l4f.a (Loov;)Loov;
      // 197: athrow
      // 198: ifne 2ec
      // 19b: goto 1a2
      // 19e: invokestatic l4f.a (Loov;)Loov;
      // 1a1: athrow
      // 1a2: aload 1
      // 1a3: getfield i2h.oay Lt9d;
      // 1a6: aload 13
      // 1a8: invokevirtual mew.eve ()Lmew;
      // 1ab: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1ae: invokeinterface zfz.r_y ()Le0x; 1
      // 1b3: instanceof y0y
      // 1b6: goto 1bd
      // 1b9: invokestatic l4f.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: iload 11
      // 1bf: ifne 1ce
      // 1c2: ifne 2ec
      // 1c5: goto 1cc
      // 1c8: invokestatic l4f.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: bipush -3
      // 1ce: ireturn
      // 1cf: aload 18
      // 1d1: aload 0
      // 1d2: aload 14
      // 1d4: invokevirtual e0x.iwf (Lm5n;Lmew;)Z
      // 1d7: iload 11
      // 1d9: ifne 1e8
      // 1dc: ifne 2ec
      // 1df: goto 1e6
      // 1e2: invokestatic l4f.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: iload 9
      // 1e8: iload 11
      // 1ea: ifne 23c
      // 1ed: ifeq 230
      // 1f0: goto 1f7
      // 1f3: invokestatic l4f.a (Loov;)Loov;
      // 1f6: athrow
      // 1f7: aload 18
      // 1f9: instanceof w4e
      // 1fc: iload 11
      // 1fe: ifne 23c
      // 201: goto 208
      // 204: invokestatic l4f.a (Loov;)Loov;
      // 207: athrow
      // 208: ifeq 230
      // 20b: goto 212
      // 20e: invokestatic l4f.a (Loov;)Loov;
      // 211: athrow
      // 212: aload 18
      // 214: iload 11
      // 216: ifne 239
      // 219: goto 220
      // 21c: invokestatic l4f.a (Loov;)Loov;
      // 21f: athrow
      // 220: invokevirtual e0x.p1r ()Lp3y;
      // 223: getstatic p3y.fdu Lp3y;
      // 226: if_acmpeq 2ec
      // 229: goto 230
      // 22c: invokestatic l4f.a (Loov;)Loov;
      // 22f: athrow
      // 230: aload 18
      // 232: goto 239
      // 235: invokestatic l4f.a (Loov;)Loov;
      // 238: athrow
      // 239: instanceof dqt
      // 23c: iload 11
      // 23e: ifne 28a
      // 241: ifne 281
      // 244: goto 24b
      // 247: invokestatic l4f.a (Loov;)Loov;
      // 24a: athrow
      // 24b: aload 18
      // 24d: instanceof u98
      // 250: iload 11
      // 252: ifne 28a
      // 255: goto 25c
      // 258: invokestatic l4f.a (Loov;)Loov;
      // 25b: athrow
      // 25c: ifne 281
      // 25f: goto 266
      // 262: invokestatic l4f.a (Loov;)Loov;
      // 265: athrow
      // 266: aload 18
      // 268: iload 11
      // 26a: ifne 28d
      // 26d: goto 274
      // 270: invokestatic l4f.a (Loov;)Loov;
      // 273: athrow
      // 274: instanceof f86
      // 277: ifeq 28b
      // 27a: goto 281
      // 27d: invokestatic l4f.a (Loov;)Loov;
      // 280: athrow
      // 281: bipush -3
      // 283: goto 28a
      // 286: invokestatic l4f.a (Loov;)Loov;
      // 289: athrow
      // 28a: ireturn
      // 28b: aload 18
      // 28d: getstatic ox_.bus Le0x;
      // 290: iload 11
      // 292: ifne 2b7
      // 295: if_acmpeq 2ba
      // 298: goto 29f
      // 29b: invokestatic l4f.a (Loov;)Loov;
      // 29e: athrow
      // 29f: aload 18
      // 2a1: iload 11
      // 2a3: ifne 2c3
      // 2a6: goto 2ad
      // 2a9: invokestatic l4f.a (Loov;)Loov;
      // 2ac: athrow
      // 2ad: getstatic ox_.gs2 Le0x;
      // 2b0: goto 2b7
      // 2b3: invokestatic l4f.a (Loov;)Loov;
      // 2b6: athrow
      // 2b7: if_acmpne 2c1
      // 2ba: bipush -4
      // 2bc: ireturn
      // 2bd: invokestatic l4f.a (Loov;)Loov;
      // 2c0: athrow
      // 2c1: aload 18
      // 2c3: invokevirtual e0x.p1r ()Lp3y;
      // 2c6: astore 19
      // 2c8: aload 19
      // 2ca: getstatic p3y.e1s Lp3y;
      // 2cd: if_acmpeq 2d6
      // 2d0: bipush 0
      // 2d1: ireturn
      // 2d2: invokestatic l4f.a (Loov;)Loov;
      // 2d5: athrow
      // 2d6: aload 1
      // 2d7: invokevirtual i2h.b2u ()Z
      // 2da: iload 11
      // 2dc: ifne 2eb
      // 2df: ifne 2ec
      // 2e2: goto 2e9
      // 2e5: invokestatic l4f.a (Loov;)Loov;
      // 2e8: athrow
      // 2e9: bipush -2
      // 2eb: ireturn
      // 2ec: iinc 17 1
      // 2ef: iload 11
      // 2f1: ifeq 041
      // 2f4: iinc 16 1
      // 2f7: iload 11
      // 2f9: ifeq 02f
      // 2fc: iinc 15 1
      // 2ff: iload 11
      // 301: ifeq 01e
      // 304: iload 12
      // 306: iload 11
      // 308: ifne 316
      // 30b: ifeq 319
      // 30e: goto 315
      // 311: invokestatic l4f.a (Loov;)Loov;
      // 314: athrow
      // 315: bipush 2
      // 316: goto 31a
      // 319: bipush 1
      // 31a: ireturn
   }

   public void f8q(boolean var1) {
      this.iho = var1;
   }

   public void hct(boolean var1) {
      this.rcy = var1;
   }

   public void gnn(boolean var1) {
      this.yei = var1;
   }

   public void xwu(boolean var1) {
      this.byl = var1;
   }

   public boolean pw9() {
      return this.iho;
   }

   public boolean jfw() {
      return this.byl;
   }

   public boolean nkn() {
      return this.yei;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
