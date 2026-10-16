public class fzb extends z14 {
   public boolean djg;
   public boolean n7k;

   public fzb(float var1) {
      super(0.0F, -14.0F, 64, 32);
      float var2 = -14.0F;
      this.lxi = new tf8(this, 0, 16);
      this.lxi.q3x(-4.0F, -8.0F, -4.0F, 8, 8, 8, var1 - 0.5F);
      this.lxi.i50(0.0F, 0.0F + var2, 0.0F);
      this.s87 = new tf8(this, 32, 16);
      this.s87.q3x(-4.0F, 0.0F, -2.0F, 8, 12, 4, var1);
      this.s87.i50(0.0F, 0.0F + var2, 0.0F);
      this.xwb = new tf8(this, 56, 0);
      this.xwb.q3x(-1.0F, -2.0F, -1.0F, 2, 30, 2, var1);
      this.xwb.i50(-3.0F, 2.0F + var2, 0.0F);
      this.hd2 = new tf8(this, 56, 0);
      this.hd2.hsi = true;
      this.hd2.q3x(-1.0F, -2.0F, -1.0F, 2, 30, 2, var1);
      this.hd2.i50(5.0F, 2.0F + var2, 0.0F);
      this.v3l = new tf8(this, 56, 0);
      this.v3l.q3x(-1.0F, 0.0F, -1.0F, 2, 30, 2, var1);
      this.v3l.i50(-2.0F, 12.0F + var2, 0.0F);
      this.zv5 = new tf8(this, 56, 0);
      this.zv5.hsi = true;
      this.zv5.q3x(-1.0F, 0.0F, -1.0F, 2, 30, 2, var1);
      this.zv5.i50(2.0F, 12.0F + var2, 0.0F);
   }

   @Override
   public void ltd(float param1, float param2, float param3, float param4, float param5, float param6, EntityLivingBase param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: fload 1
      // 002: fload 2
      // 003: fload 3
      // 004: fload 4
      // 006: fload 5
      // 008: fload 6
      // 00a: aload 7
      // 00c: invokespecial z14.ltd (FFFFFFLi2h;)V
      // 00f: aload 0
      // 010: getfield fzb.wtl Ltf8;
      // 013: bipush 1
      // 014: putfield tf8.b16 Z
      // 017: invokestatic OpaquePredicate.c ()I
      // 01a: ldc -14.0
      // 01c: nop
      // 01d: fstore 9
      // 01f: aload 0
      // 020: getfield fzb.s87 Ltf8;
      // 023: fconst_0
      // 024: putfield tf8.pod F
      // 027: istore 8
      // 029: aload 0
      // 02a: getfield fzb.s87 Ltf8;
      // 02d: fload 9
      // 02f: putfield tf8.ca7 F
      // 032: aload 0
      // 033: getfield fzb.s87 Ltf8;
      // 036: ldc -0.0
      // 038: nop
      // 039: putfield tf8.kit F
      // 03c: aload 0
      // 03d: getfield fzb.v3l Ltf8;
      // 040: dup
      // 041: getfield tf8.pod F
      // 044: fconst_0
      // 045: fsub
      // 046: putfield tf8.pod F
      // 049: aload 0
      // 04a: getfield fzb.zv5 Ltf8;
      // 04d: dup
      // 04e: getfield tf8.pod F
      // 051: fconst_0
      // 052: fsub
      // 053: putfield tf8.pod F
      // 056: aload 0
      // 057: getfield fzb.xwb Ltf8;
      // 05a: aload 0
      // 05b: getfield fzb.xwb Ltf8;
      // 05e: getfield tf8.pod F
      // 061: f2d
      // 062: ldc2_w 0.5
      // 065: dmul
      // 066: d2f
      // 067: putfield tf8.pod F
      // 06a: aload 0
      // 06b: getfield fzb.hd2 Ltf8;
      // 06e: aload 0
      // 06f: getfield fzb.hd2 Ltf8;
      // 072: getfield tf8.pod F
      // 075: f2d
      // 076: ldc2_w 0.5
      // 079: dmul
      // 07a: d2f
      // 07b: putfield tf8.pod F
      // 07e: aload 0
      // 07f: getfield fzb.v3l Ltf8;
      // 082: aload 0
      // 083: getfield fzb.v3l Ltf8;
      // 086: getfield tf8.pod F
      // 089: f2d
      // 08a: ldc2_w 0.5
      // 08d: dmul
      // 08e: d2f
      // 08f: putfield tf8.pod F
      // 092: aload 0
      // 093: getfield fzb.zv5 Ltf8;
      // 096: aload 0
      // 097: getfield fzb.zv5 Ltf8;
      // 09a: getfield tf8.pod F
      // 09d: f2d
      // 09e: ldc2_w 0.5
      // 0a1: dmul
      // 0a2: d2f
      // 0a3: putfield tf8.pod F
      // 0a6: ldc 0.4
      // 0a8: nop
      // 0a9: fstore 10
      // 0ab: aload 0
      // 0ac: getfield fzb.xwb Ltf8;
      // 0af: getfield tf8.pod F
      // 0b2: fload 10
      // 0b4: fcmpl
      // 0b5: iload 8
      // 0b7: ifne 0de
      // 0ba: ifle 0d4
      // 0bd: goto 0c4
      // 0c0: invokestatic fzb.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: getfield fzb.xwb Ltf8;
      // 0c8: fload 10
      // 0ca: putfield tf8.pod F
      // 0cd: goto 0d4
      // 0d0: invokestatic fzb.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield fzb.hd2 Ltf8;
      // 0d8: getfield tf8.pod F
      // 0db: fload 10
      // 0dd: fcmpl
      // 0de: iload 8
      // 0e0: ifne 108
      // 0e3: ifle 0fd
      // 0e6: goto 0ed
      // 0e9: invokestatic fzb.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: getfield fzb.hd2 Ltf8;
      // 0f1: fload 10
      // 0f3: putfield tf8.pod F
      // 0f6: goto 0fd
      // 0f9: invokestatic fzb.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: getfield fzb.xwb Ltf8;
      // 101: getfield tf8.pod F
      // 104: fload 10
      // 106: fneg
      // 107: fcmpg
      // 108: iload 8
      // 10a: ifne 133
      // 10d: ifge 128
      // 110: goto 117
      // 113: invokestatic fzb.a (Loov;)Loov;
      // 116: athrow
      // 117: aload 0
      // 118: getfield fzb.xwb Ltf8;
      // 11b: fload 10
      // 11d: fneg
      // 11e: putfield tf8.pod F
      // 121: goto 128
      // 124: invokestatic fzb.a (Loov;)Loov;
      // 127: athrow
      // 128: aload 0
      // 129: getfield fzb.hd2 Ltf8;
      // 12c: getfield tf8.pod F
      // 12f: fload 10
      // 131: fneg
      // 132: fcmpg
      // 133: iload 8
      // 135: ifne 15d
      // 138: ifge 153
      // 13b: goto 142
      // 13e: invokestatic fzb.a (Loov;)Loov;
      // 141: athrow
      // 142: aload 0
      // 143: getfield fzb.hd2 Ltf8;
      // 146: fload 10
      // 148: fneg
      // 149: putfield tf8.pod F
      // 14c: goto 153
      // 14f: invokestatic fzb.a (Loov;)Loov;
      // 152: athrow
      // 153: aload 0
      // 154: getfield fzb.v3l Ltf8;
      // 157: getfield tf8.pod F
      // 15a: fload 10
      // 15c: fcmpl
      // 15d: iload 8
      // 15f: ifne 186
      // 162: ifle 17c
      // 165: goto 16c
      // 168: invokestatic fzb.a (Loov;)Loov;
      // 16b: athrow
      // 16c: aload 0
      // 16d: getfield fzb.v3l Ltf8;
      // 170: fload 10
      // 172: putfield tf8.pod F
      // 175: goto 17c
      // 178: invokestatic fzb.a (Loov;)Loov;
      // 17b: athrow
      // 17c: aload 0
      // 17d: getfield fzb.zv5 Ltf8;
      // 180: getfield tf8.pod F
      // 183: fload 10
      // 185: fcmpl
      // 186: iload 8
      // 188: ifne 1b0
      // 18b: ifle 1a5
      // 18e: goto 195
      // 191: invokestatic fzb.a (Loov;)Loov;
      // 194: athrow
      // 195: aload 0
      // 196: getfield fzb.zv5 Ltf8;
      // 199: fload 10
      // 19b: putfield tf8.pod F
      // 19e: goto 1a5
      // 1a1: invokestatic fzb.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: getfield fzb.v3l Ltf8;
      // 1a9: getfield tf8.pod F
      // 1ac: fload 10
      // 1ae: fneg
      // 1af: fcmpg
      // 1b0: iload 8
      // 1b2: ifne 1db
      // 1b5: ifge 1d0
      // 1b8: goto 1bf
      // 1bb: invokestatic fzb.a (Loov;)Loov;
      // 1be: athrow
      // 1bf: aload 0
      // 1c0: getfield fzb.v3l Ltf8;
      // 1c3: fload 10
      // 1c5: fneg
      // 1c6: putfield tf8.pod F
      // 1c9: goto 1d0
      // 1cc: invokestatic fzb.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: getfield fzb.zv5 Ltf8;
      // 1d4: getfield tf8.pod F
      // 1d7: fload 10
      // 1d9: fneg
      // 1da: fcmpg
      // 1db: iload 8
      // 1dd: ifne 1ff
      // 1e0: ifge 1fb
      // 1e3: goto 1ea
      // 1e6: invokestatic fzb.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: aload 0
      // 1eb: getfield fzb.zv5 Ltf8;
      // 1ee: fload 10
      // 1f0: fneg
      // 1f1: putfield tf8.pod F
      // 1f4: goto 1fb
      // 1f7: invokestatic fzb.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: aload 0
      // 1fc: getfield fzb.djg Z
      // 1ff: iload 8
      // 201: ifne 2e4
      // 204: ifeq 23d
      // 207: goto 20e
      // 20a: invokestatic fzb.a (Loov;)Loov;
      // 20d: athrow
      // 20e: aload 0
      // 20f: getfield fzb.xwb Ltf8;
      // 212: ldc -0.5
      // 214: nop
      // 215: putfield tf8.pod F
      // 218: aload 0
      // 219: getfield fzb.hd2 Ltf8;
      // 21c: ldc -0.5
      // 21e: nop
      // 21f: putfield tf8.pod F
      // 222: aload 0
      // 223: getfield fzb.xwb Ltf8;
      // 226: ldc 0.05
      // 228: nop
      // 229: putfield tf8.oo7 F
      // 22c: aload 0
      // 22d: getfield fzb.hd2 Ltf8;
      // 230: ldc -0.05
      // 232: nop
      // 233: putfield tf8.oo7 F
      // 236: goto 23d
      // 239: invokestatic fzb.a (Loov;)Loov;
      // 23c: athrow
      // 23d: aload 0
      // 23e: getfield fzb.xwb Ltf8;
      // 241: fconst_0
      // 242: putfield tf8.kit F
      // 245: aload 0
      // 246: getfield fzb.hd2 Ltf8;
      // 249: fconst_0
      // 24a: putfield tf8.kit F
      // 24d: aload 0
      // 24e: getfield fzb.v3l Ltf8;
      // 251: fconst_0
      // 252: putfield tf8.kit F
      // 255: aload 0
      // 256: getfield fzb.zv5 Ltf8;
      // 259: fconst_0
      // 25a: putfield tf8.kit F
      // 25d: aload 0
      // 25e: getfield fzb.v3l Ltf8;
      // 261: ldc 9.0
      // 263: nop
      // 264: fload 9
      // 266: fadd
      // 267: putfield tf8.ca7 F
      // 26a: aload 0
      // 26b: getfield fzb.zv5 Ltf8;
      // 26e: ldc 9.0
      // 270: nop
      // 271: fload 9
      // 273: fadd
      // 274: putfield tf8.ca7 F
      // 277: aload 0
      // 278: getfield fzb.wtl Ltf8;
      // 27b: ldc -0.0
      // 27d: nop
      // 27e: putfield tf8.kit F
      // 281: aload 0
      // 282: getfield fzb.wtl Ltf8;
      // 285: fload 9
      // 287: fconst_1
      // 288: fadd
      // 289: putfield tf8.ca7 F
      // 28c: aload 0
      // 28d: getfield fzb.lxi Ltf8;
      // 290: aload 0
      // 291: getfield fzb.wtl Ltf8;
      // 294: getfield tf8._ki F
      // 297: putfield tf8._ki F
      // 29a: aload 0
      // 29b: getfield fzb.lxi Ltf8;
      // 29e: aload 0
      // 29f: getfield fzb.wtl Ltf8;
      // 2a2: getfield tf8.ca7 F
      // 2a5: putfield tf8.ca7 F
      // 2a8: aload 0
      // 2a9: getfield fzb.lxi Ltf8;
      // 2ac: aload 0
      // 2ad: getfield fzb.wtl Ltf8;
      // 2b0: getfield tf8.kit F
      // 2b3: putfield tf8.kit F
      // 2b6: aload 0
      // 2b7: getfield fzb.lxi Ltf8;
      // 2ba: aload 0
      // 2bb: getfield fzb.wtl Ltf8;
      // 2be: getfield tf8.pod F
      // 2c1: putfield tf8.pod F
      // 2c4: aload 0
      // 2c5: getfield fzb.lxi Ltf8;
      // 2c8: aload 0
      // 2c9: getfield fzb.wtl Ltf8;
      // 2cc: getfield tf8.r80 F
      // 2cf: putfield tf8.r80 F
      // 2d2: aload 0
      // 2d3: getfield fzb.lxi Ltf8;
      // 2d6: aload 0
      // 2d7: getfield fzb.wtl Ltf8;
      // 2da: getfield tf8.oo7 F
      // 2dd: putfield tf8.oo7 F
      // 2e0: aload 0
      // 2e1: getfield fzb.n7k Z
      // 2e4: ifeq 2fc
      // 2e7: fconst_1
      // 2e8: fstore 11
      // 2ea: aload 0
      // 2eb: getfield fzb.wtl Ltf8;
      // 2ee: dup
      // 2ef: getfield tf8.ca7 F
      // 2f2: fload 11
      // 2f4: ldc 5.0
      // 2f6: nop
      // 2f7: fmul
      // 2f8: fsub
      // 2f9: putfield tf8.ca7 F
      // 2fc: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
