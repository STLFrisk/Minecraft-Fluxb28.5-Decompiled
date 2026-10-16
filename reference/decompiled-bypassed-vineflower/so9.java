public abstract class so9 extends gmu {
   public so9(hr_ var1, g6r var2, float var3) {
      super(var1, var2, var3);
   }

   public boolean sam(yqv param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial gmu.ia5 (Lg_3;)Z
      // 09: iload 2
      // 0a: ifne 22
      // 0d: ifeq 66
      // 10: goto 17
      // 13: invokestatic so9.c (Loov;)Loov;
      // 16: athrow
      // 17: aload 1
      // 18: invokevirtual yqv.x1t ()Z
      // 1b: goto 22
      // 1e: invokestatic so9.c (Loov;)Loov;
      // 21: athrow
      // 22: iload 2
      // 23: ifne 63
      // 26: ifne 5b
      // 29: goto 30
      // 2c: invokestatic so9.c (Loov;)Loov;
      // 2f: athrow
      // 30: aload 1
      // 31: iload 2
      // 32: ifne 51
      // 35: goto 3c
      // 38: invokestatic so9.c (Loov;)Loov;
      // 3b: athrow
      // 3c: invokevirtual yqv.qrh ()Z
      // 3f: ifeq 66
      // 42: goto 49
      // 45: invokestatic so9.c (Loov;)Loov;
      // 48: athrow
      // 49: aload 1
      // 4a: goto 51
      // 4d: invokestatic so9.c (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: getfield so9.l0g Lhr_;
      // 55: getfield hr_.k7u Li2h;
      // 58: if_acmpne 66
      // 5b: bipush 1
      // 5c: goto 63
      // 5f: invokestatic so9.c (Loov;)Loov;
      // 62: athrow
      // 63: goto 67
      // 66: bipush 0
      // 67: ireturn
   }

   public boolean u8l(yqv param1, _aq param2, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 9
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: dload 3
      // 09: dload 5
      // 0b: dload 7
      // 0d: invokespecial gmu.h12 (Li2h;L_aq;DDD)Z
      // 10: iload 9
      // 12: ifne 29
      // 15: ifeq 25
      // 18: goto 1f
      // 1b: invokestatic so9.c (Loov;)Loov;
      // 1e: athrow
      // 1f: bipush 1
      // 20: ireturn
      // 21: invokestatic so9.c (Loov;)Loov;
      // 24: athrow
      // 25: aload 1
      // 26: invokevirtual yqv.hk3 ()Z
      // 29: iload 9
      // 2b: ifne 6c
      // 2e: ifeq 6b
      // 31: goto 38
      // 34: invokestatic so9.c (Loov;)Loov;
      // 37: athrow
      // 38: aload 1
      // 39: invokevirtual yqv.ohg ()Li2h;
      // 3c: iload 9
      // 3e: ifne 5d
      // 41: goto 48
      // 44: invokestatic so9.c (Loov;)Loov;
      // 47: athrow
      // 48: ifnull 6b
      // 4b: goto 52
      // 4e: invokestatic so9.c (Loov;)Loov;
      // 51: athrow
      // 52: aload 1
      // 53: invokevirtual yqv.ohg ()Li2h;
      // 56: goto 5d
      // 59: invokestatic so9.c (Loov;)Loov;
      // 5c: athrow
      // 5d: astore 10
      // 5f: aload 2
      // 60: aload 10
      // 62: invokevirtual i2h.aaw ()Lnh4;
      // 65: invokeinterface _aq.n2v (Lnh4;)Z 2
      // 6a: ireturn
      // 6b: bipush 0
      // 6c: ireturn
   }

   public void w_x(yqv var1, double var2, double var4, double var6, float var8, float var9) {
      super.l1o(var1, var2, var4, var6, var8, var9);
      this.bhw(var1, var2, var4, var6, var8, var9);
   }

   public void r22(yqv var1, float var2) {
      int var3 = var1.azk(var2);
      int var4 = var3 % 65536;
      int var5 = var3 / 65536;
      gis.w9e(gis.exn, (float)var4 / 1.0F, (float)var5 / 1.0F);
   }

   private double j_o(double var1, double var3, double var5) {
      return var1 + (var3 - var1) * var5;
   }

   public void bhw(yqv param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 10
      // 005: invokestatic hxt.ly3 ()Z
      // 008: iload 10
      // 00a: ifne 01a
      // 00d: ifeq 01d
      // 010: goto 017
      // 013: invokestatic so9.c (Loov;)Loov;
      // 016: athrow
      // 017: getstatic net/optifine/shaders/Shaders.isShadowPass Z
      // 01a: ifne 437
      // 01d: aload 1
      // 01e: invokevirtual yqv.ohg ()Li2h;
      // 021: astore 11
      // 023: iload 10
      // 025: ifne 046
      // 028: aload 11
      // 02a: ifnull 437
      // 02d: goto 034
      // 030: invokestatic so9.c (Loov;)Loov;
      // 033: athrow
      // 034: dload 4
      // 036: ldc2_w 1.6
      // 039: aload 1
      // 03a: getfield yqv.ikl F
      // 03d: f2d
      // 03e: dsub
      // 03f: ldc2_w 0.5
      // 042: dmul
      // 043: dsub
      // 044: dstore 4
      // 046: invokestatic jom.yut ()Ljom;
      // 049: astore 12
      // 04b: aload 12
      // 04d: invokevirtual jom.zuq ()Lq3g;
      // 050: astore 13
      // 052: aload 0
      // 053: aload 11
      // 055: getfield i2h.p3h F
      // 058: f2d
      // 059: aload 11
      // 05b: getfield i2h.x5k F
      // 05e: f2d
      // 05f: fload 9
      // 061: ldc 0.5
      // 063: nop
      // 064: fmul
      // 065: f2d
      // 066: invokespecial so9.j_o (DDD)D
      // 069: ldc2_w 0.01745329238474369
      // 06c: dmul
      // 06d: dstore 14
      // 06f: aload 0
      // 070: aload 11
      // 072: getfield i2h.j25 F
      // 075: f2d
      // 076: aload 11
      // 078: getfield i2h.y2i F
      // 07b: f2d
      // 07c: fload 9
      // 07e: ldc 0.5
      // 080: nop
      // 081: fmul
      // 082: f2d
      // 083: invokespecial so9.j_o (DDD)D
      // 086: ldc2_w 0.01745329238474369
      // 089: dmul
      // 08a: dstore 16
      // 08c: dload 14
      // 08e: invokestatic java/lang/Math.cos (D)D
      // 091: dstore 18
      // 093: dload 14
      // 095: invokestatic java/lang/Math.sin (D)D
      // 098: dstore 20
      // 09a: dload 16
      // 09c: invokestatic java/lang/Math.sin (D)D
      // 09f: dstore 22
      // 0a1: iload 10
      // 0a3: ifne 0bb
      // 0a6: aload 11
      // 0a8: instanceof rdv
      // 0ab: ifeq 0c0
      // 0ae: goto 0b5
      // 0b1: invokestatic so9.c (Loov;)Loov;
      // 0b4: athrow
      // 0b5: dconst_0
      // 0b6: dstore 18
      // 0b8: dconst_0
      // 0b9: dstore 20
      // 0bb: ldc2_w -1.0
      // 0be: dstore 22
      // 0c0: dload 16
      // 0c2: invokestatic java/lang/Math.cos (D)D
      // 0c5: dstore 24
      // 0c7: aload 0
      // 0c8: aload 11
      // 0ca: getfield i2h.bc1 D
      // 0cd: aload 11
      // 0cf: getfield i2h.o2v D
      // 0d2: fload 9
      // 0d4: f2d
      // 0d5: invokespecial so9.j_o (DDD)D
      // 0d8: dload 18
      // 0da: ldc2_w 0.7
      // 0dd: dmul
      // 0de: dsub
      // 0df: dload 20
      // 0e1: ldc2_w 0.5
      // 0e4: dmul
      // 0e5: dload 24
      // 0e7: dmul
      // 0e8: dsub
      // 0e9: dstore 26
      // 0eb: aload 0
      // 0ec: aload 11
      // 0ee: getfield i2h.o_z D
      // 0f1: aload 11
      // 0f3: invokevirtual i2h.c5y ()F
      // 0f6: f2d
      // 0f7: ldc2_w 0.7
      // 0fa: dmul
      // 0fb: dadd
      // 0fc: aload 11
      // 0fe: getfield i2h.kfp D
      // 101: aload 11
      // 103: invokevirtual i2h.c5y ()F
      // 106: f2d
      // 107: ldc2_w 0.7
      // 10a: dmul
      // 10b: dadd
      // 10c: fload 9
      // 10e: f2d
      // 10f: invokespecial so9.j_o (DDD)D
      // 112: dload 22
      // 114: ldc2_w 0.5
      // 117: dmul
      // 118: dsub
      // 119: ldc2_w 0.25
      // 11c: dsub
      // 11d: dstore 28
      // 11f: aload 0
      // 120: aload 11
      // 122: getfield i2h.a4d D
      // 125: aload 11
      // 127: getfield i2h.vbd D
      // 12a: fload 9
      // 12c: f2d
      // 12d: invokespecial so9.j_o (DDD)D
      // 130: dload 20
      // 132: ldc2_w 0.7
      // 135: dmul
      // 136: dsub
      // 137: dload 18
      // 139: ldc2_w 0.5
      // 13c: dmul
      // 13d: dload 24
      // 13f: dmul
      // 140: dadd
      // 141: dstore 30
      // 143: aload 0
      // 144: aload 1
      // 145: getfield yqv.gsh F
      // 148: f2d
      // 149: aload 1
      // 14a: getfield yqv.ksw F
      // 14d: f2d
      // 14e: fload 9
      // 150: f2d
      // 151: invokespecial so9.j_o (DDD)D
      // 154: ldc2_w 0.01745329238474369
      // 157: dmul
      // 158: ldc2_w 1.5707963267948966
      // 15b: dadd
      // 15c: dstore 32
      // 15e: dload 32
      // 160: invokestatic java/lang/Math.cos (D)D
      // 163: aload 1
      // 164: getfield yqv.uo6 F
      // 167: f2d
      // 168: dmul
      // 169: ldc2_w 0.4
      // 16c: dmul
      // 16d: dstore 18
      // 16f: dload 32
      // 171: invokestatic java/lang/Math.sin (D)D
      // 174: aload 1
      // 175: getfield yqv.uo6 F
      // 178: f2d
      // 179: dmul
      // 17a: ldc2_w 0.4
      // 17d: dmul
      // 17e: dstore 20
      // 180: aload 0
      // 181: aload 1
      // 182: getfield yqv.bc1 D
      // 185: aload 1
      // 186: getfield yqv.o2v D
      // 189: fload 9
      // 18b: f2d
      // 18c: invokespecial so9.j_o (DDD)D
      // 18f: dload 18
      // 191: dadd
      // 192: dstore 34
      // 194: aload 0
      // 195: aload 1
      // 196: getfield yqv.o_z D
      // 199: aload 1
      // 19a: getfield yqv.kfp D
      // 19d: fload 9
      // 19f: f2d
      // 1a0: invokespecial so9.j_o (DDD)D
      // 1a3: dstore 36
      // 1a5: aload 0
      // 1a6: aload 1
      // 1a7: getfield yqv.a4d D
      // 1aa: aload 1
      // 1ab: getfield yqv.vbd D
      // 1ae: fload 9
      // 1b0: f2d
      // 1b1: invokespecial so9.j_o (DDD)D
      // 1b4: dload 20
      // 1b6: dadd
      // 1b7: dstore 38
      // 1b9: dload 2
      // 1ba: dload 18
      // 1bc: dadd
      // 1bd: dstore 2
      // 1be: dload 6
      // 1c0: dload 20
      // 1c2: dadd
      // 1c3: dstore 6
      // 1c5: dload 26
      // 1c7: dload 34
      // 1c9: dsub
      // 1ca: d2f
      // 1cb: f2d
      // 1cc: dstore 40
      // 1ce: dload 28
      // 1d0: dload 36
      // 1d2: dsub
      // 1d3: d2f
      // 1d4: f2d
      // 1d5: dstore 42
      // 1d7: dload 30
      // 1d9: dload 38
      // 1db: dsub
      // 1dc: d2f
      // 1dd: f2d
      // 1de: dstore 44
      // 1e0: invokestatic hzu.m_1 ()V
      // 1e3: invokestatic hzu.fpt ()V
      // 1e6: invokestatic hzu.o1b ()V
      // 1e9: invokestatic hxt.ly3 ()Z
      // 1ec: iload 10
      // 1ee: ifne 200
      // 1f1: ifeq 1fe
      // 1f4: goto 1fb
      // 1f7: invokestatic so9.c (Loov;)Loov;
      // 1fa: athrow
      // 1fb: invokestatic net/optifine/shaders/Shaders.beginLeash ()V
      // 1fe: bipush 24
      // 200: istore 46
      // 202: ldc2_w 0.025
      // 205: dstore 47
      // 207: aload 13
      // 209: bipush 5
      // 20a: getstatic gnl.gec Lbe7;
      // 20d: invokevirtual q3g.ezr (ILbe7;)V
      // 210: bipush 0
      // 211: istore 49
      // 213: iload 49
      // 215: bipush 24
      // 217: if_icmpgt 309
      // 21a: ldc 0.5
      // 21c: nop
      // 21d: fstore 50
      // 21f: ldc 0.4
      // 221: nop
      // 222: fstore 51
      // 224: ldc 0.3
      // 226: nop
      // 227: fstore 52
      // 229: iload 49
      // 22b: bipush 2
      // 22c: irem
      // 22d: iload 10
      // 22f: ifne 318
      // 232: iload 10
      // 234: ifne 262
      // 237: goto 23e
      // 23a: invokestatic so9.c (Loov;)Loov;
      // 23d: athrow
      // 23e: ifne 260
      // 241: goto 248
      // 244: invokestatic so9.c (Loov;)Loov;
      // 247: athrow
      // 248: fload 50
      // 24a: ldc 0.7
      // 24c: nop
      // 24d: fmul
      // 24e: fstore 50
      // 250: fload 51
      // 252: ldc 0.7
      // 254: nop
      // 255: fmul
      // 256: fstore 51
      // 258: fload 52
      // 25a: ldc 0.7
      // 25c: nop
      // 25d: fmul
      // 25e: fstore 52
      // 260: iload 49
      // 262: i2f
      // 263: ldc 24.0
      // 265: nop
      // 266: fdiv
      // 267: fstore 53
      // 269: aload 13
      // 26b: dload 2
      // 26c: dload 40
      // 26e: fload 53
      // 270: f2d
      // 271: dmul
      // 272: dadd
      // 273: dconst_0
      // 274: dadd
      // 275: dload 4
      // 277: dload 42
      // 279: fload 53
      // 27b: fload 53
      // 27d: fmul
      // 27e: fload 53
      // 280: fadd
      // 281: f2d
      // 282: dmul
      // 283: ldc2_w 0.5
      // 286: dmul
      // 287: dadd
      // 288: ldc 24.0
      // 28a: nop
      // 28b: iload 49
      // 28d: i2f
      // 28e: fsub
      // 28f: ldc 18.0
      // 291: nop
      // 292: fdiv
      // 293: ldc 0.125
      // 295: nop
      // 296: fadd
      // 297: f2d
      // 298: dadd
      // 299: dload 6
      // 29b: dload 44
      // 29d: fload 53
      // 29f: f2d
      // 2a0: dmul
      // 2a1: dadd
      // 2a2: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2a5: fload 50
      // 2a7: fload 51
      // 2a9: fload 52
      // 2ab: fconst_1
      // 2ac: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 2af: invokevirtual q3g.pzw ()V
      // 2b2: aload 13
      // 2b4: dload 2
      // 2b5: dload 40
      // 2b7: fload 53
      // 2b9: f2d
      // 2ba: dmul
      // 2bb: dadd
      // 2bc: ldc2_w 0.025
      // 2bf: dadd
      // 2c0: dload 4
      // 2c2: dload 42
      // 2c4: fload 53
      // 2c6: fload 53
      // 2c8: fmul
      // 2c9: fload 53
      // 2cb: fadd
      // 2cc: f2d
      // 2cd: dmul
      // 2ce: ldc2_w 0.5
      // 2d1: dmul
      // 2d2: dadd
      // 2d3: ldc 24.0
      // 2d5: nop
      // 2d6: iload 49
      // 2d8: i2f
      // 2d9: fsub
      // 2da: ldc 18.0
      // 2dc: nop
      // 2dd: fdiv
      // 2de: ldc 0.125
      // 2e0: nop
      // 2e1: fadd
      // 2e2: f2d
      // 2e3: dadd
      // 2e4: ldc2_w 0.025
      // 2e7: dadd
      // 2e8: dload 6
      // 2ea: dload 44
      // 2ec: fload 53
      // 2ee: f2d
      // 2ef: dmul
      // 2f0: dadd
      // 2f1: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2f4: fload 50
      // 2f6: fload 51
      // 2f8: fload 52
      // 2fa: fconst_1
      // 2fb: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 2fe: invokevirtual q3g.pzw ()V
      // 301: iinc 49 1
      // 304: iload 10
      // 306: ifeq 213
      // 309: aload 12
      // 30b: invokevirtual jom.q7g ()V
      // 30e: aload 13
      // 310: bipush 5
      // 311: getstatic gnl.gec Lbe7;
      // 314: invokevirtual q3g.ezr (ILbe7;)V
      // 317: bipush 0
      // 318: istore 49
      // 31a: iload 49
      // 31c: bipush 24
      // 31e: if_icmpgt 414
      // 321: ldc 0.5
      // 323: nop
      // 324: fstore 50
      // 326: ldc 0.4
      // 328: nop
      // 329: fstore 51
      // 32b: ldc 0.3
      // 32d: nop
      // 32e: fstore 52
      // 330: iload 49
      // 332: bipush 2
      // 333: irem
      // 334: iload 10
      // 336: ifne 428
      // 339: iload 10
      // 33b: ifne 369
      // 33e: goto 345
      // 341: invokestatic so9.c (Loov;)Loov;
      // 344: athrow
      // 345: ifne 367
      // 348: goto 34f
      // 34b: invokestatic so9.c (Loov;)Loov;
      // 34e: athrow
      // 34f: fload 50
      // 351: ldc 0.7
      // 353: nop
      // 354: fmul
      // 355: fstore 50
      // 357: fload 51
      // 359: ldc 0.7
      // 35b: nop
      // 35c: fmul
      // 35d: fstore 51
      // 35f: fload 52
      // 361: ldc 0.7
      // 363: nop
      // 364: fmul
      // 365: fstore 52
      // 367: iload 49
      // 369: i2f
      // 36a: ldc 24.0
      // 36c: nop
      // 36d: fdiv
      // 36e: fstore 53
      // 370: aload 13
      // 372: dload 2
      // 373: dload 40
      // 375: fload 53
      // 377: f2d
      // 378: dmul
      // 379: dadd
      // 37a: dconst_0
      // 37b: dadd
      // 37c: dload 4
      // 37e: dload 42
      // 380: fload 53
      // 382: fload 53
      // 384: fmul
      // 385: fload 53
      // 387: fadd
      // 388: f2d
      // 389: dmul
      // 38a: ldc2_w 0.5
      // 38d: dmul
      // 38e: dadd
      // 38f: ldc 24.0
      // 391: nop
      // 392: iload 49
      // 394: i2f
      // 395: fsub
      // 396: ldc 18.0
      // 398: nop
      // 399: fdiv
      // 39a: ldc 0.125
      // 39c: nop
      // 39d: fadd
      // 39e: f2d
      // 39f: dadd
      // 3a0: ldc2_w 0.025
      // 3a3: dadd
      // 3a4: dload 6
      // 3a6: dload 44
      // 3a8: fload 53
      // 3aa: f2d
      // 3ab: dmul
      // 3ac: dadd
      // 3ad: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3b0: fload 50
      // 3b2: fload 51
      // 3b4: fload 52
      // 3b6: fconst_1
      // 3b7: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 3ba: invokevirtual q3g.pzw ()V
      // 3bd: aload 13
      // 3bf: dload 2
      // 3c0: dload 40
      // 3c2: fload 53
      // 3c4: f2d
      // 3c5: dmul
      // 3c6: dadd
      // 3c7: ldc2_w 0.025
      // 3ca: dadd
      // 3cb: dload 4
      // 3cd: dload 42
      // 3cf: fload 53
      // 3d1: fload 53
      // 3d3: fmul
      // 3d4: fload 53
      // 3d6: fadd
      // 3d7: f2d
      // 3d8: dmul
      // 3d9: ldc2_w 0.5
      // 3dc: dmul
      // 3dd: dadd
      // 3de: ldc 24.0
      // 3e0: nop
      // 3e1: iload 49
      // 3e3: i2f
      // 3e4: fsub
      // 3e5: ldc 18.0
      // 3e7: nop
      // 3e8: fdiv
      // 3e9: ldc 0.125
      // 3eb: nop
      // 3ec: fadd
      // 3ed: f2d
      // 3ee: dadd
      // 3ef: dload 6
      // 3f1: dload 44
      // 3f3: fload 53
      // 3f5: f2d
      // 3f6: dmul
      // 3f7: dadd
      // 3f8: ldc2_w 0.025
      // 3fb: dadd
      // 3fc: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3ff: fload 50
      // 401: fload 51
      // 403: fload 52
      // 405: fconst_1
      // 406: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 409: invokevirtual q3g.pzw ()V
      // 40c: iinc 49 1
      // 40f: iload 10
      // 411: ifeq 31a
      // 414: aload 12
      // 416: invokevirtual jom.q7g ()V
      // 419: iload 10
      // 41b: ifne 434
      // 41e: invokestatic hxt.ly3 ()Z
      // 421: goto 428
      // 424: invokestatic so9.c (Loov;)Loov;
      // 427: athrow
      // 428: ifeq 42e
      // 42b: invokestatic net/optifine/shaders/Shaders.endLeash ()V
      // 42e: invokestatic hzu.s7q ()V
      // 431: invokestatic hzu.rqj ()V
      // 434: invokestatic hzu.gp4 ()V
      // 437: return
   }

   @Override
   public boolean ia5(g_3 var1) {
      return this.sam((yqv)var1);
   }

   @Override
   public void l1o(g_3 var1, double var2, double var4, double var6, float var8, float var9) {
      this.w_x((yqv)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public boolean daa(i2h var1) {
      return this.sam((yqv)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.w_x((yqv)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public boolean h12(i2h var1, _aq var2, double var3, double var5, double var7) {
      return this.u8l((yqv)var1, var2, var3, var5, var7);
   }

   private static oov c(oov var0) {
      return var0;
   }
}
