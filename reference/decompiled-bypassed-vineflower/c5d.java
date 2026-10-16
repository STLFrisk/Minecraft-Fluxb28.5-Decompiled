public class c5d {
   public static void _xi(String param0, int param1, int param2, int param3, int param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 6
      // 005: aload 0
      // 006: invokestatic x0l.to8 (Ljava/lang/String;)Lgdz;
      // 009: aload 0
      // 00a: invokestatic x0l.m1h (Lgdz;Ljava/lang/String;)Lbhs;
      // 00d: invokestatic c05.vz1 ()Lc05;
      // 010: invokevirtual c05.mpf ()Ly99;
      // 013: invokevirtual bhs.loadTexture (Ly99;)V
      // 016: invokestatic c05.vz1 ()Lc05;
      // 019: invokevirtual c05.l22 ()Llc5;
      // 01c: aload 0
      // 01d: invokestatic x0l.to8 (Ljava/lang/String;)Lgdz;
      // 020: invokevirtual lc5.anl (Lgdz;)V
      // 023: invokestatic jom.yut ()Ljom;
      // 026: astore 7
      // 028: aload 7
      // 02a: invokevirtual jom.zuq ()Lq3g;
      // 02d: astore 8
      // 02f: sipush 3042
      // 032: invokestatic org/lwjgl/opengl/GL11.glEnable (I)V
      // 035: iload 6
      // 037: ifeq 054
      // 03a: iload 5
      // 03c: ifeq 059
      // 03f: goto 046
      // 042: invokestatic c5d.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 045: athrow
      // 046: fconst_1
      // 047: fconst_1
      // 048: fconst_1
      // 049: fconst_1
      // 04a: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 04d: goto 054
      // 050: invokestatic c5d.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 053: athrow
      // 054: iload 6
      // 056: ifne 06d
      // 059: ldc 0.9
      // 05b: nop
      // 05c: ldc 0.9
      // 05e: nop
      // 05f: ldc 0.9
      // 061: nop
      // 062: fconst_1
      // 063: invokestatic org/lwjgl/opengl/GL11.glColor4f (FFFF)V
      // 066: goto 06d
      // 069: invokestatic c5d.a (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 06c: athrow
      // 06d: ldc2_w 32.0
      // 070: dstore 9
      // 072: ldc2_w 32.0
      // 075: dstore 11
      // 077: ldc2_w 32.0
      // 07a: dstore 13
      // 07c: ldc2_w 32.0
      // 07f: dstore 15
      // 081: aload 8
      // 083: bipush 7
      // 085: getstatic gnl._r5 Lbe7;
      // 088: invokevirtual q3g.ezr (ILbe7;)V
      // 08b: aload 8
      // 08d: iload 1
      // 08e: i2d
      // 08f: dconst_0
      // 090: dadd
      // 091: iload 2
      // 092: i2d
      // 093: iload 4
      // 095: i2d
      // 096: dadd
      // 097: dconst_0
      // 098: invokevirtual q3g.g5o (DDD)Lq3g;
      // 09b: dload 13
      // 09d: dconst_0
      // 09e: dadd
      // 09f: d2f
      // 0a0: ldc 0.00390625
      // 0a2: nop
      // 0a3: fmul
      // 0a4: f2d
      // 0a5: dload 15
      // 0a7: dload 11
      // 0a9: dadd
      // 0aa: d2f
      // 0ab: ldc 0.00390625
      // 0ad: nop
      // 0ae: fmul
      // 0af: f2d
      // 0b0: invokevirtual q3g.h0a (DD)Lq3g;
      // 0b3: invokevirtual q3g.pzw ()V
      // 0b6: aload 8
      // 0b8: iload 1
      // 0b9: i2d
      // 0ba: iload 3
      // 0bb: i2d
      // 0bc: dadd
      // 0bd: iload 2
      // 0be: i2d
      // 0bf: iload 4
      // 0c1: i2d
      // 0c2: dadd
      // 0c3: dconst_0
      // 0c4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0c7: dload 13
      // 0c9: dload 9
      // 0cb: dadd
      // 0cc: d2f
      // 0cd: ldc 0.00390625
      // 0cf: nop
      // 0d0: fmul
      // 0d1: f2d
      // 0d2: dload 15
      // 0d4: dload 11
      // 0d6: dadd
      // 0d7: d2f
      // 0d8: ldc 0.00390625
      // 0da: nop
      // 0db: fmul
      // 0dc: f2d
      // 0dd: invokevirtual q3g.h0a (DD)Lq3g;
      // 0e0: invokevirtual q3g.pzw ()V
      // 0e3: aload 8
      // 0e5: iload 1
      // 0e6: i2d
      // 0e7: iload 3
      // 0e8: i2d
      // 0e9: dadd
      // 0ea: iload 2
      // 0eb: i2d
      // 0ec: dconst_0
      // 0ed: dadd
      // 0ee: dconst_0
      // 0ef: invokevirtual q3g.g5o (DDD)Lq3g;
      // 0f2: dload 13
      // 0f4: dload 9
      // 0f6: dadd
      // 0f7: d2f
      // 0f8: ldc 0.00390625
      // 0fa: nop
      // 0fb: fmul
      // 0fc: f2d
      // 0fd: dload 15
      // 0ff: dconst_0
      // 100: dadd
      // 101: d2f
      // 102: ldc 0.00390625
      // 104: nop
      // 105: fmul
      // 106: f2d
      // 107: invokevirtual q3g.h0a (DD)Lq3g;
      // 10a: invokevirtual q3g.pzw ()V
      // 10d: aload 8
      // 10f: iload 1
      // 110: i2d
      // 111: dconst_0
      // 112: dadd
      // 113: iload 2
      // 114: i2d
      // 115: dconst_0
      // 116: dadd
      // 117: dconst_0
      // 118: invokevirtual q3g.g5o (DDD)Lq3g;
      // 11b: dload 13
      // 11d: dconst_0
      // 11e: dadd
      // 11f: d2f
      // 120: ldc 0.00390625
      // 122: nop
      // 123: fmul
      // 124: f2d
      // 125: dload 15
      // 127: dconst_0
      // 128: dadd
      // 129: d2f
      // 12a: ldc 0.00390625
      // 12c: nop
      // 12d: fmul
      // 12e: f2d
      // 12f: invokevirtual q3g.h0a (DD)Lq3g;
      // 132: invokevirtual q3g.pzw ()V
      // 135: aload 7
      // 137: invokevirtual jom.q7g ()V
      // 13a: ldc2_w 32.0
      // 13d: dstore 9
      // 13f: ldc2_w 32.0
      // 142: dstore 11
      // 144: ldc2_w 160.0
      // 147: dstore 13
      // 149: ldc2_w 32.0
      // 14c: dstore 15
      // 14e: aload 8
      // 150: bipush 7
      // 152: getstatic gnl._r5 Lbe7;
      // 155: invokevirtual q3g.ezr (ILbe7;)V
      // 158: aload 8
      // 15a: iload 1
      // 15b: i2d
      // 15c: dconst_0
      // 15d: dadd
      // 15e: iload 2
      // 15f: i2d
      // 160: iload 4
      // 162: i2d
      // 163: dadd
      // 164: dconst_0
      // 165: invokevirtual q3g.g5o (DDD)Lq3g;
      // 168: dload 13
      // 16a: dconst_0
      // 16b: dadd
      // 16c: d2f
      // 16d: ldc 0.00390625
      // 16f: nop
      // 170: fmul
      // 171: f2d
      // 172: dload 15
      // 174: dload 11
      // 176: dadd
      // 177: d2f
      // 178: ldc 0.00390625
      // 17a: nop
      // 17b: fmul
      // 17c: f2d
      // 17d: invokevirtual q3g.h0a (DD)Lq3g;
      // 180: invokevirtual q3g.pzw ()V
      // 183: aload 8
      // 185: iload 1
      // 186: i2d
      // 187: iload 3
      // 188: i2d
      // 189: dadd
      // 18a: iload 2
      // 18b: i2d
      // 18c: iload 4
      // 18e: i2d
      // 18f: dadd
      // 190: dconst_0
      // 191: invokevirtual q3g.g5o (DDD)Lq3g;
      // 194: dload 13
      // 196: dload 9
      // 198: dadd
      // 199: d2f
      // 19a: ldc 0.00390625
      // 19c: nop
      // 19d: fmul
      // 19e: f2d
      // 19f: dload 15
      // 1a1: dload 11
      // 1a3: dadd
      // 1a4: d2f
      // 1a5: ldc 0.00390625
      // 1a7: nop
      // 1a8: fmul
      // 1a9: f2d
      // 1aa: invokevirtual q3g.h0a (DD)Lq3g;
      // 1ad: invokevirtual q3g.pzw ()V
      // 1b0: aload 8
      // 1b2: iload 1
      // 1b3: i2d
      // 1b4: iload 3
      // 1b5: i2d
      // 1b6: dadd
      // 1b7: iload 2
      // 1b8: i2d
      // 1b9: dconst_0
      // 1ba: dadd
      // 1bb: dconst_0
      // 1bc: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1bf: dload 13
      // 1c1: dload 9
      // 1c3: dadd
      // 1c4: d2f
      // 1c5: ldc 0.00390625
      // 1c7: nop
      // 1c8: fmul
      // 1c9: f2d
      // 1ca: dload 15
      // 1cc: dconst_0
      // 1cd: dadd
      // 1ce: d2f
      // 1cf: ldc 0.00390625
      // 1d1: nop
      // 1d2: fmul
      // 1d3: f2d
      // 1d4: invokevirtual q3g.h0a (DD)Lq3g;
      // 1d7: invokevirtual q3g.pzw ()V
      // 1da: aload 8
      // 1dc: iload 1
      // 1dd: i2d
      // 1de: dconst_0
      // 1df: dadd
      // 1e0: iload 2
      // 1e1: i2d
      // 1e2: dconst_0
      // 1e3: dadd
      // 1e4: dconst_0
      // 1e5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1e8: dload 13
      // 1ea: dconst_0
      // 1eb: dadd
      // 1ec: d2f
      // 1ed: ldc 0.00390625
      // 1ef: nop
      // 1f0: fmul
      // 1f1: f2d
      // 1f2: dload 15
      // 1f4: dconst_0
      // 1f5: dadd
      // 1f6: d2f
      // 1f7: ldc 0.00390625
      // 1f9: nop
      // 1fa: fmul
      // 1fb: f2d
      // 1fc: invokevirtual q3g.h0a (DD)Lq3g;
      // 1ff: invokevirtual q3g.pzw ()V
      // 202: aload 7
      // 204: invokevirtual jom.q7g ()V
      // 207: sipush 3042
      // 20a: invokestatic org/lwjgl/opengl/GL11.glDisable (I)V
      // 20d: goto 217
      // 210: astore 7
      // 212: aload 7
      // 214: invokevirtual java/lang/Exception.printStackTrace ()V
      // 217: return
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
