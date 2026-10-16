import java.util.Random;

public class oqt extends liu {
   private final y1w bso;
   private Random _mj = new Random();
   private Timer _5c = new Timer();

   public oqt(hr_ var1, y1w var2) {
      super(var1);
      this.bso = var2;
      this.o2u = 0.15F;
      this.xeb = 0.75F;
   }

   private int igl(nvf param1, double param2, double param4, double param6, float param8, dbw param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual nvf.s7f ()Lerg;
      // 004: astore 11
      // 006: invokestatic OpaquePredicate.c ()I
      // 009: aload 11
      // 00b: invokevirtual erg.gn1 ()Lu7m;
      // 00e: astore 12
      // 010: istore 10
      // 012: aload 12
      // 014: ifnonnull 01d
      // 017: bipush 0
      // 018: ireturn
      // 019: invokestatic oqt.a (Loov;)Loov;
      // 01c: athrow
      // 01d: getstatic ModuleRegistry.csv L_ur;
      // 020: invokevirtual _ur.klu ()Z
      // 023: iload 10
      // 025: ifne 16a
      // 028: ifeq 163
      // 02b: goto 032
      // 02e: invokestatic oqt.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 9
      // 034: invokeinterface dbw.abn ()Z 1
      // 039: istore 13
      // 03b: aload 0
      // 03c: aload 11
      // 03e: invokespecial oqt.jq9 (Lerg;)I
      // 041: istore 14
      // 043: iload 10
      // 045: ifne 070
      // 048: aload 12
      // 04a: instanceof gun
      // 04d: ifne 075
      // 050: goto 057
      // 053: invokestatic oqt.a (Loov;)Loov;
      // 056: athrow
      // 057: dload 2
      // 058: d2f
      // 059: f2d
      // 05a: dload 4
      // 05c: d2f
      // 05d: f2d
      // 05e: ldc2_w 0.1
      // 061: dadd
      // 062: dload 6
      // 064: d2f
      // 065: f2d
      // 066: invokestatic hzu.hsv (DDD)V
      // 069: goto 070
      // 06c: invokestatic oqt.a (Loov;)Loov;
      // 06f: athrow
      // 070: iload 10
      // 072: ifeq 08e
      // 075: dload 2
      // 076: d2f
      // 077: f2d
      // 078: dload 4
      // 07a: d2f
      // 07b: f2d
      // 07c: ldc2_w 0.2
      // 07f: dadd
      // 080: dload 6
      // 082: d2f
      // 083: f2d
      // 084: invokestatic hzu.hsv (DDD)V
      // 087: goto 08e
      // 08a: invokestatic oqt.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 1
      // 08f: iload 10
      // 091: ifne 0ac
      // 094: getfield nvf.lfk Z
      // 097: ifeq 0ab
      // 09a: goto 0a1
      // 09d: invokestatic oqt.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ldc 90.0
      // 0a3: nop
      // 0a4: goto 0af
      // 0a7: invokestatic oqt.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 1
      // 0ac: getfield nvf.y2i F
      // 0af: fstore 16
      // 0b1: aload 0
      // 0b2: getfield oqt._5c Lnhs;
      // 0b5: ldc2_w 5.0
      // 0b8: invokevirtual Timer.yrv (D)Z
      // 0bb: iload 10
      // 0bd: ifne 0e3
      // 0c0: ifeq 0db
      // 0c3: goto 0ca
      // 0c6: invokestatic oqt.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: aload 1
      // 0cb: dup
      // 0cc: getfield nvf.y2i F
      // 0cf: fconst_1
      // 0d0: fadd
      // 0d1: putfield nvf.y2i F
      // 0d4: goto 0db
      // 0d7: invokestatic oqt.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 1
      // 0dc: getfield nvf.y2i F
      // 0df: ldc 180.0
      // 0e1: nop
      // 0e2: fcmpl
      // 0e3: iload 10
      // 0e5: ifne 114
      // 0e8: ifle 100
      // 0eb: goto 0f2
      // 0ee: invokestatic oqt.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 1
      // 0f3: ldc -180.0
      // 0f5: nop
      // 0f6: putfield nvf.y2i F
      // 0f9: goto 100
      // 0fc: invokestatic oqt.a (Loov;)Loov;
      // 0ff: athrow
      // 100: fload 16
      // 102: fconst_1
      // 103: fconst_0
      // 104: fconst_0
      // 105: invokestatic hzu.a2h (FFFF)V
      // 108: aload 1
      // 109: getfield nvf.x5k F
      // 10c: fconst_0
      // 10d: fconst_0
      // 10e: fconst_1
      // 10f: invokestatic hzu.a2h (FFFF)V
      // 112: iload 13
      // 114: iload 10
      // 116: ifne 162
      // 119: ifne 159
      // 11c: goto 123
      // 11f: invokestatic oqt.a (Loov;)Loov;
      // 122: athrow
      // 123: ldc -0.0
      // 125: nop
      // 126: iload 14
      // 128: bipush 1
      // 129: isub
      // 12a: i2f
      // 12b: fmul
      // 12c: ldc 0.5
      // 12e: nop
      // 12f: fmul
      // 130: fstore 15
      // 132: ldc -0.0
      // 134: nop
      // 135: iload 14
      // 137: bipush 1
      // 138: isub
      // 139: i2f
      // 13a: fmul
      // 13b: ldc 0.5
      // 13d: nop
      // 13e: fmul
      // 13f: fstore 17
      // 141: ldc -0.046875
      // 143: nop
      // 144: iload 14
      // 146: bipush 1
      // 147: isub
      // 148: i2f
      // 149: fmul
      // 14a: ldc 0.5
      // 14c: nop
      // 14d: fmul
      // 14e: fstore 18
      // 150: fload 15
      // 152: fload 17
      // 154: fload 18
      // 156: invokestatic hzu.a4k (FFF)V
      // 159: fconst_1
      // 15a: fconst_1
      // 15b: fconst_1
      // 15c: fconst_1
      // 15d: invokestatic hzu.wn0 (FFFF)V
      // 160: iload 14
      // 162: ireturn
      // 163: aload 9
      // 165: invokeinterface dbw.egt ()Z 1
      // 16a: istore 13
      // 16c: aload 0
      // 16d: aload 11
      // 16f: invokespecial oqt.jq9 (Lerg;)I
      // 172: istore 14
      // 174: ldc 0.25
      // 176: nop
      // 177: fstore 15
      // 179: aload 1
      // 17a: invokevirtual nvf.q83 ()I
      // 17d: i2f
      // 17e: fload 8
      // 180: fadd
      // 181: ldc 10.0
      // 183: nop
      // 184: fdiv
      // 185: aload 1
      // 186: getfield nvf._19 F
      // 189: fadd
      // 18a: invokestatic fe6.rtn (F)F
      // 18d: ldc 0.1
      // 18f: nop
      // 190: fmul
      // 191: ldc 0.1
      // 193: nop
      // 194: fadd
      // 195: fstore 16
      // 197: aload 9
      // 199: invokeinterface dbw.jzp ()Lflk; 1
      // 19e: getstatic flk$gbm.fru Lflk$gbm;
      // 1a1: invokevirtual flk.zem (Lflk$gbm;)Lhej;
      // 1a4: getfield hej.vsl Lorg/lwjgl/util/vector/Vector3f;
      // 1a7: getfield org/lwjgl/util/vector/Vector3f.y F
      // 1aa: fstore 17
      // 1ac: dload 2
      // 1ad: d2f
      // 1ae: dload 4
      // 1b0: d2f
      // 1b1: fload 16
      // 1b3: fadd
      // 1b4: ldc 0.25
      // 1b6: nop
      // 1b7: fload 17
      // 1b9: fmul
      // 1ba: fadd
      // 1bb: dload 6
      // 1bd: d2f
      // 1be: invokestatic hzu.a4k (FFF)V
      // 1c1: iload 13
      // 1c3: iload 10
      // 1c5: ifne 1ee
      // 1c8: ifne 1e3
      // 1cb: goto 1d2
      // 1ce: invokestatic oqt.a (Loov;)Loov;
      // 1d1: athrow
      // 1d2: aload 0
      // 1d3: getfield oqt.l0g Lhr_;
      // 1d6: getfield hr_.p52 Lmoh;
      // 1d9: ifnull 209
      // 1dc: goto 1e3
      // 1df: invokestatic oqt.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: aload 1
      // 1e4: invokevirtual nvf.q83 ()I
      // 1e7: goto 1ee
      // 1ea: invokestatic oqt.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: i2f
      // 1ef: fload 8
      // 1f1: fadd
      // 1f2: ldc 20.0
      // 1f4: nop
      // 1f5: fdiv
      // 1f6: aload 1
      // 1f7: getfield nvf._19 F
      // 1fa: fadd
      // 1fb: ldc 57.295776
      // 1fd: nop
      // 1fe: fmul
      // 1ff: fstore 18
      // 201: fload 18
      // 203: fconst_0
      // 204: fconst_1
      // 205: fconst_0
      // 206: invokestatic hzu.a2h (FFFF)V
      // 209: iload 13
      // 20b: iload 10
      // 20d: ifne 259
      // 210: ifne 250
      // 213: goto 21a
      // 216: invokestatic oqt.a (Loov;)Loov;
      // 219: athrow
      // 21a: ldc -0.0
      // 21c: nop
      // 21d: iload 14
      // 21f: bipush 1
      // 220: isub
      // 221: i2f
      // 222: fmul
      // 223: ldc 0.5
      // 225: nop
      // 226: fmul
      // 227: fstore 18
      // 229: ldc -0.0
      // 22b: nop
      // 22c: iload 14
      // 22e: bipush 1
      // 22f: isub
      // 230: i2f
      // 231: fmul
      // 232: ldc 0.5
      // 234: nop
      // 235: fmul
      // 236: fstore 19
      // 238: ldc -0.046875
      // 23a: nop
      // 23b: iload 14
      // 23d: bipush 1
      // 23e: isub
      // 23f: i2f
      // 240: fmul
      // 241: ldc 0.5
      // 243: nop
      // 244: fmul
      // 245: fstore 20
      // 247: fload 18
      // 249: fload 19
      // 24b: fload 20
      // 24d: invokestatic hzu.a4k (FFF)V
      // 250: fconst_1
      // 251: fconst_1
      // 252: fconst_1
      // 253: fconst_1
      // 254: invokestatic hzu.wn0 (FFFF)V
      // 257: iload 14
      // 259: ireturn
   }

   private int jq9(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: bipush 1
      // 05: istore 3
      // 06: aload 1
      // 07: getfield erg.qd2 I
      // 0a: bipush 48
      // 0c: iload 2
      // 0d: ifne 2d
      // 10: if_icmple 20
      // 13: goto 1a
      // 16: invokestatic oqt.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 5
      // 1b: istore 3
      // 1c: iload 2
      // 1d: ifeq 7e
      // 20: aload 1
      // 21: getfield erg.qd2 I
      // 24: bipush 32
      // 26: goto 2d
      // 29: invokestatic oqt.a (Loov;)Loov;
      // 2c: athrow
      // 2d: iload 2
      // 2e: ifne 4e
      // 31: if_icmple 41
      // 34: goto 3b
      // 37: invokestatic oqt.a (Loov;)Loov;
      // 3a: athrow
      // 3b: bipush 4
      // 3c: istore 3
      // 3d: iload 2
      // 3e: ifeq 7e
      // 41: aload 1
      // 42: getfield erg.qd2 I
      // 45: bipush 16
      // 47: goto 4e
      // 4a: invokestatic oqt.a (Loov;)Loov;
      // 4d: athrow
      // 4e: iload 2
      // 4f: ifne 79
      // 52: if_icmple 62
      // 55: goto 5c
      // 58: invokestatic oqt.a (Loov;)Loov;
      // 5b: athrow
      // 5c: bipush 3
      // 5d: istore 3
      // 5e: iload 2
      // 5f: ifeq 7e
      // 62: aload 1
      // 63: getfield erg.qd2 I
      // 66: iload 2
      // 67: ifne 7f
      // 6a: goto 71
      // 6d: invokestatic oqt.a (Loov;)Loov;
      // 70: athrow
      // 71: bipush 1
      // 72: goto 79
      // 75: invokestatic oqt.a (Loov;)Loov;
      // 78: athrow
      // 79: if_icmple 7e
      // 7c: bipush 2
      // 7d: istore 3
      // 7e: iload 3
      // 7f: ireturn
   }

   public void e7j(nvf param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokevirtual nvf.s7f ()Lerg;
      // 004: astore 11
      // 006: invokestatic OpaquePredicate.c ()I
      // 009: aload 0
      // 00a: getfield oqt._mj Ljava/util/Random;
      // 00d: ldc2_w 187
      // 010: invokevirtual java/util/Random.setSeed (J)V
      // 013: istore 10
      // 015: bipush 0
      // 016: istore 12
      // 018: aload 0
      // 019: aload 1
      // 01a: invokevirtual oqt.sat (Li2h;)Z
      // 01d: iload 10
      // 01f: ifne 057
      // 022: ifeq 045
      // 025: goto 02c
      // 028: invokestatic oqt.a (Loov;)Loov;
      // 02b: athrow
      // 02c: aload 0
      // 02d: getfield oqt.l0g Lhr_;
      // 030: getfield hr_.ewh Llc5;
      // 033: aload 0
      // 034: aload 1
      // 035: invokevirtual oqt.j2i (Lnvf;)Lgdz;
      // 038: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 03b: bipush 0
      // 03c: bipush 0
      // 03d: invokeinterface sm5.setBlurMipmap (ZZ)V 3
      // 042: bipush 1
      // 043: istore 12
      // 045: invokestatic hzu.ixc ()V
      // 048: sipush 516
      // 04b: ldc 0.1
      // 04d: nop
      // 04e: invokestatic hzu.fak (IF)V
      // 051: invokestatic hzu.spd ()V
      // 054: sipush 770
      // 057: sipush 771
      // 05a: bipush 1
      // 05b: bipush 0
      // 05c: invokestatic hzu.u39 (IIII)V
      // 05f: invokestatic hzu.dp2 ()V
      // 062: aload 0
      // 063: getfield oqt.bso Ly1w;
      // 066: invokevirtual y1w.kwo ()La6o;
      // 069: aload 11
      // 06b: invokevirtual a6o._1p (Lerg;)Ldbw;
      // 06e: astore 13
      // 070: aload 0
      // 071: aload 1
      // 072: dload 2
      // 073: dload 4
      // 075: dload 6
      // 077: fload 9
      // 079: aload 13
      // 07b: invokespecial oqt.igl (Lnvf;DDDFLdbw;)I
      // 07e: istore 14
      // 080: bipush 0
      // 081: istore 15
      // 083: iload 15
      // 085: iload 14
      // 087: if_icmpge 1a3
      // 08a: aload 13
      // 08c: iload 10
      // 08e: ifne 156
      // 091: invokeinterface dbw.egt ()Z 1
      // 096: iload 10
      // 098: ifne 1c0
      // 09b: goto 0a2
      // 09e: invokestatic oqt.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: ifeq 12f
      // 0a5: goto 0ac
      // 0a8: invokestatic oqt.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: invokestatic hzu.dp2 ()V
      // 0af: iload 10
      // 0b1: ifne 12a
      // 0b4: goto 0bb
      // 0b7: invokestatic oqt.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: iload 15
      // 0bd: ifle 103
      // 0c0: goto 0c7
      // 0c3: invokestatic oqt.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: aload 0
      // 0c8: getfield oqt._mj Ljava/util/Random;
      // 0cb: invokevirtual java/util/Random.nextFloat ()F
      // 0ce: fconst_2
      // 0cf: fmul
      // 0d0: fconst_1
      // 0d1: fsub
      // 0d2: ldc 0.15
      // 0d4: nop
      // 0d5: fmul
      // 0d6: fstore 16
      // 0d8: aload 0
      // 0d9: getfield oqt._mj Ljava/util/Random;
      // 0dc: invokevirtual java/util/Random.nextFloat ()F
      // 0df: fconst_2
      // 0e0: fmul
      // 0e1: fconst_1
      // 0e2: fsub
      // 0e3: ldc 0.15
      // 0e5: nop
      // 0e6: fmul
      // 0e7: fstore 17
      // 0e9: aload 0
      // 0ea: getfield oqt._mj Ljava/util/Random;
      // 0ed: invokevirtual java/util/Random.nextFloat ()F
      // 0f0: fconst_2
      // 0f1: fmul
      // 0f2: fconst_1
      // 0f3: fsub
      // 0f4: ldc 0.15
      // 0f6: nop
      // 0f7: fmul
      // 0f8: fstore 18
      // 0fa: fload 16
      // 0fc: fload 17
      // 0fe: fload 18
      // 100: invokestatic hzu.a4k (FFF)V
      // 103: ldc 0.5
      // 105: nop
      // 106: ldc 0.5
      // 108: nop
      // 109: ldc 0.5
      // 10b: nop
      // 10c: invokestatic hzu.syc (FFF)V
      // 10f: aload 13
      // 111: invokeinterface dbw.jzp ()Lflk; 1
      // 116: getstatic flk$gbm.fru Lflk$gbm;
      // 119: invokevirtual flk.vqs (Lflk$gbm;)V
      // 11c: aload 0
      // 11d: getfield oqt.bso Ly1w;
      // 120: aload 11
      // 122: aload 13
      // 124: invokevirtual y1w.qpl (Lerg;Ldbw;)V
      // 127: invokestatic hzu.x3w ()V
      // 12a: iload 10
      // 12c: ifeq 19b
      // 12f: invokestatic hzu.dp2 ()V
      // 132: aload 13
      // 134: invokeinterface dbw.jzp ()Lflk; 1
      // 139: getstatic flk$gbm.fru Lflk$gbm;
      // 13c: invokevirtual flk.vqs (Lflk$gbm;)V
      // 13f: aload 0
      // 140: getfield oqt.bso Ly1w;
      // 143: aload 11
      // 145: aload 13
      // 147: invokevirtual y1w.qpl (Lerg;Ldbw;)V
      // 14a: invokestatic hzu.x3w ()V
      // 14d: aload 13
      // 14f: goto 156
      // 152: invokestatic oqt.a (Loov;)Loov;
      // 155: athrow
      // 156: invokeinterface dbw.jzp ()Lflk; 1
      // 15b: getfield flk.pj2 Lhej;
      // 15e: getfield hej.vsl Lorg/lwjgl/util/vector/Vector3f;
      // 161: getfield org/lwjgl/util/vector/Vector3f.x F
      // 164: fstore 16
      // 166: aload 13
      // 168: invokeinterface dbw.jzp ()Lflk; 1
      // 16d: getfield flk.pj2 Lhej;
      // 170: getfield hej.vsl Lorg/lwjgl/util/vector/Vector3f;
      // 173: getfield org/lwjgl/util/vector/Vector3f.y F
      // 176: fstore 17
      // 178: aload 13
      // 17a: invokeinterface dbw.jzp ()Lflk; 1
      // 17f: getfield flk.pj2 Lhej;
      // 182: getfield hej.vsl Lorg/lwjgl/util/vector/Vector3f;
      // 185: getfield org/lwjgl/util/vector/Vector3f.z F
      // 188: fstore 18
      // 18a: fconst_0
      // 18b: fload 16
      // 18d: fmul
      // 18e: fconst_0
      // 18f: fload 17
      // 191: fmul
      // 192: ldc 0.046875
      // 194: nop
      // 195: fload 18
      // 197: fmul
      // 198: invokestatic hzu.a4k (FFF)V
      // 19b: iinc 15 1
      // 19e: iload 10
      // 1a0: ifeq 083
      // 1a3: invokestatic hzu.x3w ()V
      // 1a6: invokestatic hzu.eiq ()V
      // 1a9: invokestatic hzu.ux6 ()V
      // 1ac: aload 0
      // 1ad: aload 1
      // 1ae: invokevirtual oqt.sat (Li2h;)Z
      // 1b1: pop
      // 1b2: iload 10
      // 1b4: ifne 1ec
      // 1b7: iload 12
      // 1b9: goto 1c0
      // 1bc: invokestatic oqt.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: ifeq 1de
      // 1c3: aload 0
      // 1c4: getfield oqt.l0g Lhr_;
      // 1c7: getfield hr_.ewh Llc5;
      // 1ca: aload 0
      // 1cb: aload 1
      // 1cc: invokevirtual oqt.j2i (Lnvf;)Lgdz;
      // 1cf: invokevirtual lc5.dry (Lgdz;)Lsm5;
      // 1d2: invokeinterface sm5.restoreLastBlurMipmap ()V 1
      // 1d7: goto 1de
      // 1da: invokestatic oqt.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: aload 0
      // 1df: aload 1
      // 1e0: dload 2
      // 1e1: dload 4
      // 1e3: dload 6
      // 1e5: fload 8
      // 1e7: fload 9
      // 1e9: invokespecial liu.apl (Li2h;DDDFF)V
      // 1ec: return
   }

   public gdz j2i(nvf var1) {
      return yu2.nu_;
   }

   @Override
   public gdz dzd(EntityLivingBase var1) {
      return this.j2i((nvf)var1);
   }

   @Override
   public void apl(EntityLivingBase var1, double var2, double var4, double var6, float var8, float var9) {
      this.e7j((nvf)var1, var2, var4, var6, var8, var9);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
