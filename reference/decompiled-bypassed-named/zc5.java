public class zc5 extends gun {
   private final izd xnn;
   private final izd l8u;

   public zc5(e0x var1, izd var2, izd var3) {
      super(var1);
      this.xnn = var2;
      this.l8u = var3;
      this.rlr(0);
      this.oml(true);
   }

   @Override
   public int v05(int var1) {
      return var1;
   }

   @Override
   public String g56(erg var1) {
      return this.xnn.uud(var1.j6_());
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, OpaquePredicate param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 9
      // 005: aload 1
      // 006: getfield erg.qd2 I
      // 009: iload 9
      // 00b: ifne 038
      // 00e: ifne 01e
      // 011: goto 018
      // 014: invokestatic zc5.a (Loov;)Loov;
      // 017: athrow
      // 018: bipush 0
      // 019: ireturn
      // 01a: invokestatic zc5.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 2
      // 01f: iload 9
      // 021: ifne 049
      // 024: aload 4
      // 026: aload 5
      // 028: invokevirtual mew.offset (Lvt2;)Lmew;
      // 02b: aload 5
      // 02d: aload 1
      // 02e: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 031: goto 038
      // 034: invokestatic zc5.a (Loov;)Loov;
      // 037: athrow
      // 038: ifne 041
      // 03b: bipush 0
      // 03c: ireturn
      // 03d: invokestatic zc5.a (Loov;)Loov;
      // 040: athrow
      // 041: aload 0
      // 042: getfield zc5.xnn Lizd;
      // 045: aload 1
      // 046: invokevirtual izd.ulk (Lerg;)Ljava/lang/Object;
      // 049: astore 10
      // 04b: aload 3
      // 04c: aload 4
      // 04e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 051: astore 11
      // 053: aload 11
      // 055: invokeinterface zfz.r_y ()Le0x; 1
      // 05a: aload 0
      // 05b: getfield zc5.xnn Lizd;
      // 05e: if_acmpne 199
      // 061: aload 0
      // 062: getfield zc5.xnn Lizd;
      // 065: invokevirtual izd.ptp ()Lxny;
      // 068: astore 12
      // 06a: aload 11
      // 06c: aload 12
      // 06e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 073: astore 13
      // 075: aload 11
      // 077: getstatic izd._9x Lzb_;
      // 07a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 07f: checkcast izd$jc0
      // 082: astore 14
      // 084: aload 5
      // 086: getstatic vt2.rf3 Lvt2;
      // 089: iload 9
      // 08b: ifne 0bf
      // 08e: if_acmpne 0b3
      // 091: goto 098
      // 094: invokestatic zc5.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 14
      // 09a: getstatic izd$jc0.ct4 Lizd$jc0;
      // 09d: iload 9
      // 09f: ifne 0e8
      // 0a2: goto 0a9
      // 0a5: invokestatic zc5.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: if_acmpeq 0dd
      // 0ac: goto 0b3
      // 0af: invokestatic zc5.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 5
      // 0b5: getstatic vt2.m3r Lvt2;
      // 0b8: goto 0bf
      // 0bb: invokestatic zc5.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: if_acmpne 199
      // 0c2: aload 14
      // 0c4: getstatic izd$jc0.l7i Lizd$jc0;
      // 0c7: iload 9
      // 0c9: ifne 0e8
      // 0cc: goto 0d3
      // 0cf: invokestatic zc5.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: if_acmpne 199
      // 0d6: goto 0dd
      // 0d9: invokestatic zc5.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 13
      // 0df: aload 10
      // 0e1: goto 0e8
      // 0e4: invokestatic zc5.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: if_acmpne 199
      // 0eb: aload 0
      // 0ec: getfield zc5.l8u Lizd;
      // 0ef: invokevirtual izd.l4i ()Lzfz;
      // 0f2: aload 12
      // 0f4: aload 13
      // 0f6: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0fb: astore 15
      // 0fd: aload 3
      // 0fe: aload 0
      // 0ff: getfield zc5.l8u Lizd;
      // 102: aload 3
      // 103: aload 4
      // 105: aload 15
      // 107: invokevirtual izd.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 10a: invokevirtual OpaquePredicate.z09 (Lnh4;)Z
      // 10d: iload 9
      // 10f: ifne 198
      // 112: ifeq 197
      // 115: goto 11c
      // 118: invokestatic zc5.a (Loov;)Loov;
      // 11b: athrow
      // 11c: aload 3
      // 11d: aload 4
      // 11f: aload 15
      // 121: bipush 3
      // 122: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 125: iload 9
      // 127: ifne 198
      // 12a: goto 131
      // 12d: invokestatic zc5.a (Loov;)Loov;
      // 130: athrow
      // 131: ifeq 197
      // 134: goto 13b
      // 137: invokestatic zc5.a (Loov;)Loov;
      // 13a: athrow
      // 13b: aload 3
      // 13c: aload 4
      // 13e: invokevirtual mew.getX ()I
      // 141: i2f
      // 142: ldc 0.5
      // 144: nop
      // 145: fadd
      // 146: f2d
      // 147: aload 4
      // 149: invokevirtual mew.getY ()I
      // 14c: i2f
      // 14d: ldc 0.5
      // 14f: nop
      // 150: fadd
      // 151: f2d
      // 152: aload 4
      // 154: invokevirtual mew.getZ ()I
      // 157: i2f
      // 158: ldc 0.5
      // 15a: nop
      // 15b: fadd
      // 15c: f2d
      // 15d: aload 0
      // 15e: getfield zc5.l8u Lizd;
      // 161: getfield izd.zu6 Le0x$zvv;
      // 164: invokevirtual e0x$zvv.jfo ()Ljava/lang/String;
      // 167: aload 0
      // 168: getfield zc5.l8u Lizd;
      // 16b: getfield izd.zu6 Le0x$zvv;
      // 16e: invokevirtual e0x$zvv.dnt ()F
      // 171: fconst_1
      // 172: fadd
      // 173: fconst_2
      // 174: fdiv
      // 175: aload 0
      // 176: getfield zc5.l8u Lizd;
      // 179: getfield izd.zu6 Le0x$zvv;
      // 17c: invokevirtual e0x$zvv.kjj ()F
      // 17f: ldc 0.8
      // 181: nop
      // 182: fmul
      // 183: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // 186: aload 1
      // 187: dup
      // 188: getfield erg.qd2 I
      // 18b: bipush 1
      // 18c: isub
      // 18d: putfield erg.qd2 I
      // 190: goto 197
      // 193: invokestatic zc5.a (Loov;)Loov;
      // 196: athrow
      // 197: bipush 1
      // 198: ireturn
      // 199: aload 0
      // 19a: aload 1
      // 19b: iload 9
      // 19d: ifne 1c1
      // 1a0: aload 3
      // 1a1: aload 4
      // 1a3: aload 5
      // 1a5: invokevirtual mew.offset (Lvt2;)Lmew;
      // 1a8: aload 10
      // 1aa: invokespecial zc5.phc (Lerg;Lt9d;Lmew;Ljava/lang/Object;)Z
      // 1ad: ifeq 1bf
      // 1b0: goto 1b7
      // 1b3: invokestatic zc5.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: bipush 1
      // 1b8: goto 1d0
      // 1bb: invokestatic zc5.a (Loov;)Loov;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: aload 1
      // 1c1: aload 2
      // 1c2: aload 3
      // 1c3: aload 4
      // 1c5: aload 5
      // 1c7: fload 6
      // 1c9: fload 7
      // 1cb: fload 8
      // 1cd: invokespecial gun.ghw (Lerg;Lha9;Lt9d;Lmew;Lvt2;FFF)Z
      // 1d0: ireturn
   }

   @Override
   public boolean hty(OpaquePredicate param1, mew param2, vt2 param3, ha9 param4, erg param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: astore 7
      // 003: aload 0
      // 004: getfield zc5.xnn Lizd;
      // 007: invokevirtual izd.ptp ()Lxny;
      // 00a: astore 8
      // 00c: aload 0
      // 00d: getfield zc5.xnn Lizd;
      // 010: aload 5
      // 012: invokevirtual izd.ulk (Lerg;)Ljava/lang/Object;
      // 015: astore 9
      // 017: invokestatic OpaquePredicate.b ()I
      // 01a: aload 1
      // 01b: aload 2
      // 01c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 01f: astore 10
      // 021: istore 6
      // 023: aload 10
      // 025: iload 6
      // 027: ifeq 0be
      // 02a: invokeinterface zfz.r_y ()Le0x; 1
      // 02f: aload 0
      // 030: getfield zc5.xnn Lizd;
      // 033: if_acmpne 0b3
      // 036: goto 03d
      // 039: invokestatic zc5.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 10
      // 03f: getstatic izd._9x Lzb_;
      // 042: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 047: getstatic izd$jc0.l7i Lizd$jc0;
      // 04a: if_acmpne 05c
      // 04d: goto 054
      // 050: invokestatic zc5.a (Loov;)Loov;
      // 053: athrow
      // 054: bipush 1
      // 055: goto 05d
      // 058: invokestatic zc5.a (Loov;)Loov;
      // 05b: athrow
      // 05c: bipush 0
      // 05d: istore 11
      // 05f: aload 3
      // 060: getstatic vt2.rf3 Lvt2;
      // 063: iload 6
      // 065: ifeq 089
      // 068: if_acmpne 07e
      // 06b: goto 072
      // 06e: invokestatic zc5.a (Loov;)Loov;
      // 071: athrow
      // 072: iload 11
      // 074: ifeq 098
      // 077: goto 07e
      // 07a: invokestatic zc5.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 3
      // 07f: getstatic vt2.m3r Lvt2;
      // 082: goto 089
      // 085: invokestatic zc5.a (Loov;)Loov;
      // 088: athrow
      // 089: if_acmpne 0b3
      // 08c: iload 11
      // 08e: ifeq 0b3
      // 091: goto 098
      // 094: invokestatic zc5.a (Loov;)Loov;
      // 097: athrow
      // 098: aload 9
      // 09a: aload 10
      // 09c: aload 8
      // 09e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0a3: if_acmpne 0b3
      // 0a6: goto 0ad
      // 0a9: invokestatic zc5.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: bipush 1
      // 0ae: ireturn
      // 0af: invokestatic zc5.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: aload 2
      // 0b4: aload 3
      // 0b5: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0b8: astore 2
      // 0b9: aload 1
      // 0ba: aload 2
      // 0bb: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0be: astore 11
      // 0c0: aload 11
      // 0c2: invokeinterface zfz.r_y ()Le0x; 1
      // 0c7: iload 6
      // 0c9: ifeq 0e3
      // 0cc: aload 0
      // 0cd: getfield zc5.xnn Lizd;
      // 0d0: if_acmpne 0f7
      // 0d3: goto 0da
      // 0d6: invokestatic zc5.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: aload 9
      // 0dc: goto 0e3
      // 0df: invokestatic zc5.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 11
      // 0e5: aload 8
      // 0e7: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0ec: if_acmpne 0f7
      // 0ef: bipush 1
      // 0f0: goto 103
      // 0f3: invokestatic zc5.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: aload 1
      // 0f9: aload 7
      // 0fb: aload 3
      // 0fc: aload 4
      // 0fe: aload 5
      // 100: invokespecial gun.hty (Lt9d;Lmew;Lvt2;Lha9;Lerg;)Z
      // 103: ireturn
   }

   private boolean phc(erg param1, OpaquePredicate param2, mew param3, Object param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 5
      // 05: aload 2
      // 06: aload 3
      // 07: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0a: astore 6
      // 0c: aload 6
      // 0e: iload 5
      // 10: ifne 2f
      // 13: invokeinterface zfz.r_y ()Le0x; 1
      // 18: aload 0
      // 19: getfield zc5.xnn Lizd;
      // 1c: if_acmpne f2
      // 1f: goto 26
      // 22: invokestatic zc5.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 6
      // 28: goto 2f
      // 2b: invokestatic zc5.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield zc5.xnn Lizd;
      // 33: invokevirtual izd.ptp ()Lxny;
      // 36: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 3b: astore 7
      // 3d: aload 7
      // 3f: aload 4
      // 41: if_acmpne f2
      // 44: aload 0
      // 45: getfield zc5.l8u Lizd;
      // 48: invokevirtual izd.l4i ()Lzfz;
      // 4b: aload 0
      // 4c: getfield zc5.xnn Lizd;
      // 4f: invokevirtual izd.ptp ()Lxny;
      // 52: aload 7
      // 54: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 59: astore 8
      // 5b: aload 2
      // 5c: aload 0
      // 5d: getfield zc5.l8u Lizd;
      // 60: aload 2
      // 61: aload 3
      // 62: aload 8
      // 64: invokevirtual izd.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 67: invokevirtual OpaquePredicate.z09 (Lnh4;)Z
      // 6a: iload 5
      // 6c: ifne f1
      // 6f: ifeq f0
      // 72: goto 79
      // 75: invokestatic zc5.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 2
      // 7a: aload 3
      // 7b: aload 8
      // 7d: bipush 3
      // 7e: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 81: iload 5
      // 83: ifne f1
      // 86: goto 8d
      // 89: invokestatic zc5.a (Loov;)Loov;
      // 8c: athrow
      // 8d: ifeq f0
      // 90: goto 97
      // 93: invokestatic zc5.a (Loov;)Loov;
      // 96: athrow
      // 97: aload 2
      // 98: aload 3
      // 99: invokevirtual mew.getX ()I
      // 9c: i2f
      // 9d: ldc 0.5
      // 9f: nop
      // a0: fadd
      // a1: f2d
      // a2: aload 3
      // a3: invokevirtual mew.getY ()I
      // a6: i2f
      // a7: ldc 0.5
      // a9: nop
      // aa: fadd
      // ab: f2d
      // ac: aload 3
      // ad: invokevirtual mew.getZ ()I
      // b0: i2f
      // b1: ldc 0.5
      // b3: nop
      // b4: fadd
      // b5: f2d
      // b6: aload 0
      // b7: getfield zc5.l8u Lizd;
      // ba: getfield izd.zu6 Le0x$zvv;
      // bd: invokevirtual e0x$zvv.jfo ()Ljava/lang/String;
      // c0: aload 0
      // c1: getfield zc5.l8u Lizd;
      // c4: getfield izd.zu6 Le0x$zvv;
      // c7: invokevirtual e0x$zvv.dnt ()F
      // ca: fconst_1
      // cb: fadd
      // cc: fconst_2
      // cd: fdiv
      // ce: aload 0
      // cf: getfield zc5.l8u Lizd;
      // d2: getfield izd.zu6 Le0x$zvv;
      // d5: invokevirtual e0x$zvv.kjj ()F
      // d8: ldc 0.8
      // da: nop
      // db: fmul
      // dc: invokevirtual OpaquePredicate.amg (DDDLjava/lang/String;FF)V
      // df: aload 1
      // e0: dup
      // e1: getfield erg.qd2 I
      // e4: bipush 1
      // e5: isub
      // e6: putfield erg.qd2 I
      // e9: goto f0
      // ec: invokestatic zc5.a (Loov;)Loov;
      // ef: athrow
      // f0: bipush 1
      // f1: ireturn
      // f2: bipush 0
      // f3: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
