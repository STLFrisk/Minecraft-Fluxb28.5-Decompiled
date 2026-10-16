public class uw1$e46 {
   private final t9d fnf;
   private final vt2$y0s xet;
   private final vt2 qji;
   private final vt2 rok;
   private int xgg;
   private mew xe7;
   private int s43;
   private int ju7;

   public uw1$e46(t9d param1, mew param2, vt2$y0s param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokespecial java/lang/Object.<init> ()V
      // 004: invokestatic t9d.c ()I
      // 007: aload 0
      // 008: bipush 0
      // 009: putfield uw1$e46.xgg I
      // 00c: aload 0
      // 00d: aload 1
      // 00e: putfield uw1$e46.fnf Lt9d;
      // 011: istore 4
      // 013: aload 0
      // 014: aload 3
      // 015: putfield uw1$e46.xet Lvt2$y0s;
      // 018: iload 4
      // 01a: ifne 053
      // 01d: aload 3
      // 01e: getstatic vt2$y0s.wvd Lvt2$y0s;
      // 021: if_acmpne 045
      // 024: goto 02b
      // 027: invokestatic uw1$e46.a (Loov;)Loov;
      // 02a: athrow
      // 02b: aload 0
      // 02c: getstatic vt2.zk4 Lvt2;
      // 02f: putfield uw1$e46.rok Lvt2;
      // 032: aload 0
      // 033: getstatic vt2.te4 Lvt2;
      // 036: putfield uw1$e46.qji Lvt2;
      // 039: iload 4
      // 03b: ifeq 05a
      // 03e: goto 045
      // 041: invokestatic uw1$e46.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: getstatic vt2.z9q Lvt2;
      // 049: putfield uw1$e46.rok Lvt2;
      // 04c: goto 053
      // 04f: invokestatic uw1$e46.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: getstatic vt2.mxp Lvt2;
      // 057: putfield uw1$e46.qji Lvt2;
      // 05a: aload 2
      // 05b: astore 5
      // 05d: aload 2
      // 05e: invokevirtual mew.getY ()I
      // 061: aload 5
      // 063: invokevirtual mew.getY ()I
      // 066: bipush 21
      // 068: isub
      // 069: if_icmple 0bc
      // 06c: aload 2
      // 06d: invokevirtual mew.getY ()I
      // 070: iload 4
      // 072: ifne 0c7
      // 075: iload 4
      // 077: ifne 0c7
      // 07a: goto 081
      // 07d: invokestatic uw1$e46.a (Loov;)Loov;
      // 080: athrow
      // 081: ifle 0bc
      // 084: goto 08b
      // 087: invokestatic uw1$e46.a (Loov;)Loov;
      // 08a: athrow
      // 08b: aload 0
      // 08c: aload 1
      // 08d: aload 2
      // 08e: invokevirtual mew.eve ()Lmew;
      // 091: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 094: invokeinterface zfz.r_y ()Le0x; 1
      // 099: invokevirtual uw1$e46.jyb (Le0x;)Z
      // 09c: iload 4
      // 09e: ifne 0c7
      // 0a1: goto 0a8
      // 0a4: invokestatic uw1$e46.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: ifeq 0bc
      // 0ab: goto 0b2
      // 0ae: invokestatic uw1$e46.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 2
      // 0b3: invokevirtual mew.eve ()Lmew;
      // 0b6: astore 2
      // 0b7: iload 4
      // 0b9: ifeq 05d
      // 0bc: aload 0
      // 0bd: aload 2
      // 0be: aload 0
      // 0bf: getfield uw1$e46.rok Lvt2;
      // 0c2: invokevirtual uw1$e46.ouz (Lmew;Lvt2;)I
      // 0c5: bipush 1
      // 0c6: isub
      // 0c7: istore 5
      // 0c9: iload 5
      // 0cb: iload 4
      // 0cd: ifne 10f
      // 0d0: iflt 140
      // 0d3: goto 0da
      // 0d6: invokestatic uw1$e46.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: aload 2
      // 0dc: aload 0
      // 0dd: getfield uw1$e46.rok Lvt2;
      // 0e0: iload 5
      // 0e2: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 0e5: putfield uw1$e46.xe7 Lmew;
      // 0e8: aload 0
      // 0e9: aload 0
      // 0ea: aload 0
      // 0eb: getfield uw1$e46.xe7 Lmew;
      // 0ee: aload 0
      // 0ef: getfield uw1$e46.qji Lvt2;
      // 0f2: invokevirtual uw1$e46.ouz (Lmew;Lvt2;)I
      // 0f5: putfield uw1$e46.ju7 I
      // 0f8: aload 0
      // 0f9: iload 4
      // 0fb: ifne 13c
      // 0fe: goto 105
      // 101: invokestatic uw1$e46.a (Loov;)Loov;
      // 104: athrow
      // 105: getfield uw1$e46.ju7 I
      // 108: goto 10f
      // 10b: invokestatic uw1$e46.a (Loov;)Loov;
      // 10e: athrow
      // 10f: bipush 2
      // 110: if_icmplt 12f
      // 113: aload 0
      // 114: iload 4
      // 116: ifne 141
      // 119: goto 120
      // 11c: invokestatic uw1$e46.a (Loov;)Loov;
      // 11f: athrow
      // 120: getfield uw1$e46.ju7 I
      // 123: bipush 21
      // 125: if_icmple 140
      // 128: goto 12f
      // 12b: invokestatic uw1$e46.a (Loov;)Loov;
      // 12e: athrow
      // 12f: aload 0
      // 130: aconst_null
      // 131: putfield uw1$e46.xe7 Lmew;
      // 134: aload 0
      // 135: goto 13c
      // 138: invokestatic uw1$e46.a (Loov;)Loov;
      // 13b: athrow
      // 13c: bipush 0
      // 13d: putfield uw1$e46.ju7 I
      // 140: aload 0
      // 141: iload 4
      // 143: ifne 15b
      // 146: getfield uw1$e46.xe7 Lmew;
      // 149: ifnull 162
      // 14c: goto 153
      // 14f: invokestatic uw1$e46.a (Loov;)Loov;
      // 152: athrow
      // 153: aload 0
      // 154: goto 15b
      // 157: invokestatic uw1$e46.a (Loov;)Loov;
      // 15a: athrow
      // 15b: aload 0
      // 15c: invokevirtual uw1$e46.mtb ()I
      // 15f: putfield uw1$e46.s43 I
      // 162: return
   }

   public int ouz(mew param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: bipush 0
      // 05: istore 4
      // 07: iload 4
      // 09: bipush 22
      // 0b: if_icmpge 6e
      // 0e: aload 1
      // 0f: aload 2
      // 10: iload 4
      // 12: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 15: astore 5
      // 17: aload 0
      // 18: iload 3
      // 19: ifeq 6f
      // 1c: iload 3
      // 1d: ifeq 6f
      // 20: goto 27
      // 23: invokestatic uw1$e46.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: getfield uw1$e46.fnf Lt9d;
      // 2b: aload 5
      // 2d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 30: invokeinterface zfz.r_y ()Le0x; 1
      // 35: invokevirtual uw1$e46.jyb (Le0x;)Z
      // 38: ifeq 6e
      // 3b: goto 42
      // 3e: invokestatic uw1$e46.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: getfield uw1$e46.fnf Lt9d;
      // 46: aload 5
      // 48: invokevirtual mew.eve ()Lmew;
      // 4b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 4e: invokeinterface zfz.r_y ()Le0x; 1
      // 53: getstatic ox_.j4y Le0x;
      // 56: if_acmpeq 67
      // 59: goto 60
      // 5c: invokestatic uw1$e46.a (Loov;)Loov;
      // 5f: athrow
      // 60: goto 6e
      // 63: invokestatic uw1$e46.a (Loov;)Loov;
      // 66: athrow
      // 67: iinc 4 1
      // 6a: iload 3
      // 6b: ifne 07
      // 6e: aload 0
      // 6f: getfield uw1$e46.fnf Lt9d;
      // 72: aload 1
      // 73: aload 2
      // 74: iload 4
      // 76: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 79: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 7c: invokeinterface zfz.r_y ()Le0x; 1
      // 81: astore 5
      // 83: aload 5
      // 85: getstatic ox_.j4y Le0x;
      // 88: if_acmpne 94
      // 8b: iload 4
      // 8d: goto 95
      // 90: invokestatic uw1$e46.a (Loov;)Loov;
      // 93: athrow
      // 94: bipush 0
      // 95: ireturn
   }

   public int fmk() {
      return this.s43;
   }

   public int dee() {
      return this.ju7;
   }

   public int mtb() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: bipush 0
      // 006: putfield uw1$e46.s43 I
      // 009: aload 0
      // 00a: getfield uw1$e46.s43 I
      // 00d: bipush 21
      // 00f: if_icmpge 0fa
      // 012: bipush 0
      // 013: iload 1
      // 014: ifne 0fb
      // 017: istore 2
      // 018: iload 2
      // 019: aload 0
      // 01a: getfield uw1$e46.ju7 I
      // 01d: if_icmpge 0ec
      // 020: aload 0
      // 021: getfield uw1$e46.xe7 Lmew;
      // 024: aload 0
      // 025: getfield uw1$e46.qji Lvt2;
      // 028: iload 2
      // 029: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 02c: aload 0
      // 02d: getfield uw1$e46.s43 I
      // 030: invokevirtual mew.z89 (I)Lmew;
      // 033: astore 3
      // 034: aload 0
      // 035: getfield uw1$e46.fnf Lt9d;
      // 038: aload 3
      // 039: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 03c: invokeinterface zfz.r_y ()Le0x; 1
      // 041: astore 4
      // 043: aload 0
      // 044: aload 4
      // 046: invokevirtual uw1$e46.jyb (Le0x;)Z
      // 049: iload 1
      // 04a: ifne 00d
      // 04d: ifne 053
      // 050: goto 0fa
      // 053: aload 4
      // 055: getstatic ox_.mly Luw1;
      // 058: if_acmpne 06c
      // 05b: aload 0
      // 05c: dup
      // 05d: getfield uw1$e46.xgg I
      // 060: bipush 1
      // 061: iadd
      // 062: putfield uw1$e46.xgg I
      // 065: goto 06c
      // 068: invokestatic uw1$e46.a (Loov;)Loov;
      // 06b: athrow
      // 06c: iload 2
      // 06d: iload 1
      // 06e: ifne 0ac
      // 071: ifne 0ab
      // 074: goto 07b
      // 077: invokestatic uw1$e46.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 0
      // 07c: getfield uw1$e46.fnf Lt9d;
      // 07f: aload 3
      // 080: aload 0
      // 081: getfield uw1$e46.rok Lvt2;
      // 084: invokevirtual mew.offset (Lvt2;)Lmew;
      // 087: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 08a: invokeinterface zfz.r_y ()Le0x; 1
      // 08f: astore 4
      // 091: iload 1
      // 092: ifne 0e8
      // 095: aload 4
      // 097: getstatic ox_.j4y Le0x;
      // 09a: if_acmpeq 0e5
      // 09d: goto 0a4
      // 0a0: invokestatic uw1$e46.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: goto 0fa
      // 0a7: invokestatic uw1$e46.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: iload 2
      // 0ac: aload 0
      // 0ad: getfield uw1$e46.ju7 I
      // 0b0: bipush 1
      // 0b1: isub
      // 0b2: if_icmpne 0e5
      // 0b5: aload 0
      // 0b6: getfield uw1$e46.fnf Lt9d;
      // 0b9: aload 3
      // 0ba: aload 0
      // 0bb: getfield uw1$e46.qji Lvt2;
      // 0be: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0c1: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0c4: invokeinterface zfz.r_y ()Le0x; 1
      // 0c9: astore 4
      // 0cb: iload 1
      // 0cc: ifne 0e8
      // 0cf: aload 4
      // 0d1: getstatic ox_.j4y Le0x;
      // 0d4: if_acmpeq 0e5
      // 0d7: goto 0de
      // 0da: invokestatic uw1$e46.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: goto 0fa
      // 0e1: invokestatic uw1$e46.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: iinc 2 1
      // 0e8: iload 1
      // 0e9: ifeq 018
      // 0ec: aload 0
      // 0ed: dup
      // 0ee: getfield uw1$e46.s43 I
      // 0f1: bipush 1
      // 0f2: iadd
      // 0f3: putfield uw1$e46.s43 I
      // 0f6: iload 1
      // 0f7: ifeq 009
      // 0fa: bipush 0
      // 0fb: istore 2
      // 0fc: iload 2
      // 0fd: aload 0
      // 0fe: getfield uw1$e46.ju7 I
      // 101: if_icmpge 15d
      // 104: aload 0
      // 105: iload 1
      // 106: ifne 15e
      // 109: iload 1
      // 10a: ifne 147
      // 10d: goto 114
      // 110: invokestatic uw1$e46.a (Loov;)Loov;
      // 113: athrow
      // 114: getfield uw1$e46.fnf Lt9d;
      // 117: aload 0
      // 118: getfield uw1$e46.xe7 Lmew;
      // 11b: aload 0
      // 11c: getfield uw1$e46.qji Lvt2;
      // 11f: iload 2
      // 120: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 123: aload 0
      // 124: getfield uw1$e46.s43 I
      // 127: invokevirtual mew.z89 (I)Lmew;
      // 12a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 12d: invokeinterface zfz.r_y ()Le0x; 1
      // 132: getstatic ox_.j4y Le0x;
      // 135: if_acmpeq 14f
      // 138: goto 13f
      // 13b: invokestatic uw1$e46.a (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 0
      // 140: goto 147
      // 143: invokestatic uw1$e46.a (Loov;)Loov;
      // 146: athrow
      // 147: bipush 0
      // 148: putfield uw1$e46.s43 I
      // 14b: iload 1
      // 14c: ifeq 15d
      // 14f: iinc 2 1
      // 152: iload 1
      // 153: ifeq 0fc
      // 156: goto 15d
      // 159: invokestatic uw1$e46.a (Loov;)Loov;
      // 15c: athrow
      // 15d: aload 0
      // 15e: getfield uw1$e46.s43 I
      // 161: iload 1
      // 162: ifne 1a4
      // 165: bipush 21
      // 167: if_icmpgt 194
      // 16a: goto 171
      // 16d: invokestatic uw1$e46.a (Loov;)Loov;
      // 170: athrow
      // 171: aload 0
      // 172: getfield uw1$e46.s43 I
      // 175: iload 1
      // 176: ifne 1a4
      // 179: goto 180
      // 17c: invokestatic uw1$e46.a (Loov;)Loov;
      // 17f: athrow
      // 180: bipush 3
      // 181: if_icmplt 194
      // 184: goto 18b
      // 187: invokestatic uw1$e46.a (Loov;)Loov;
      // 18a: athrow
      // 18b: aload 0
      // 18c: getfield uw1$e46.s43 I
      // 18f: ireturn
      // 190: invokestatic uw1$e46.a (Loov;)Loov;
      // 193: athrow
      // 194: aload 0
      // 195: aconst_null
      // 196: putfield uw1$e46.xe7 Lmew;
      // 199: aload 0
      // 19a: bipush 0
      // 19b: putfield uw1$e46.ju7 I
      // 19e: aload 0
      // 19f: bipush 0
      // 1a0: putfield uw1$e46.s43 I
      // 1a3: bipush 0
      // 1a4: ireturn
   }

   public boolean jyb(e0x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 21
      // 09: getfield e0x.kgd Lp3y;
      // 0c: getstatic p3y.cei Lp3y;
      // 0f: if_acmpeq 40
      // 12: goto 19
      // 15: invokestatic uw1$e46.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: goto 21
      // 1d: invokestatic uw1$e46.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 3a
      // 25: getstatic ox_._0u Lwuo;
      // 28: if_acmpeq 40
      // 2b: goto 32
      // 2e: invokestatic uw1$e46.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: goto 3a
      // 36: invokestatic uw1$e46.a (Loov;)Loov;
      // 39: athrow
      // 3a: getstatic ox_.mly Luw1;
      // 3d: if_acmpne 48
      // 40: bipush 1
      // 41: goto 49
      // 44: invokestatic uw1$e46.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
   }

   public boolean pmy() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 1e
      // 09: getfield uw1$e46.xe7 Lmew;
      // 0c: ifnull 84
      // 0f: goto 16
      // 12: invokestatic uw1$e46.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic uw1$e46.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getfield uw1$e46.ju7 I
      // 21: bipush 2
      // 22: iload 1
      // 23: ifne 3d
      // 26: if_icmplt 84
      // 29: goto 30
      // 2c: invokestatic uw1$e46.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield uw1$e46.ju7 I
      // 34: bipush 21
      // 36: goto 3d
      // 39: invokestatic uw1$e46.a (Loov;)Loov;
      // 3c: athrow
      // 3d: iload 1
      // 3e: ifne 57
      // 41: if_icmpgt 84
      // 44: goto 4b
      // 47: invokestatic uw1$e46.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: getfield uw1$e46.s43 I
      // 4f: bipush 3
      // 50: goto 57
      // 53: invokestatic uw1$e46.a (Loov;)Loov;
      // 56: athrow
      // 57: iload 1
      // 58: ifne 7d
      // 5b: if_icmplt 84
      // 5e: goto 65
      // 61: invokestatic uw1$e46.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: getfield uw1$e46.s43 I
      // 69: iload 1
      // 6a: ifne 81
      // 6d: goto 74
      // 70: invokestatic uw1$e46.a (Loov;)Loov;
      // 73: athrow
      // 74: bipush 21
      // 76: goto 7d
      // 79: invokestatic uw1$e46.a (Loov;)Loov;
      // 7c: athrow
      // 7d: if_icmpgt 84
      // 80: bipush 1
      // 81: goto 85
      // 84: bipush 0
      // 85: ireturn
   }

   public void zub() {
      int var1 = t9d.b();
      int var2 = 0;

      while (var2 < this.ju7) {
         mew var3 = this.xe7.offset(this.qji, var2);
         int var4 = 0;

         while (true) {
            if (var4 < this.s43) {
               try {
                  this.fnf.vct(var3.z89(var4), ox_.mly.l4i().zvi(uw1.p3a, this.xet), 2);
                  var4++;
                  if (var1 == 0) {
                     break;
                  }

                  if (var1 != 0) {
                     continue;
                  }
               } catch (oov var5) {
                  throw a(var5);
               }
            }

            var2++;
            break;
         }

         if (var1 == 0) {
            break;
         }
      }
   }

   public static int r72(uw1$e46 var0) {
      return var0.xgg;
   }

   public static int m3z(uw1$e46 var0) {
      return var0.ju7;
   }

   public static int m2u(uw1$e46 var0) {
      return var0.s43;
   }

   public static vt2 wx0(uw1$e46 var0) {
      return var0.qji;
   }

   public static mew cua(uw1$e46 var0) {
      return var0.xe7;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
