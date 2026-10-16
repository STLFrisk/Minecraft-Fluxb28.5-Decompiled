public class bdv extends cjm {
   public bdv(yqv var1, float var2) {
      this.hxk = var1;
      this.o5o = var2;
      this.k23(7);
   }

   @Override
   public void mnp() {
      this.m6f = 0.0F;
   }

   @Override
   public void zly() {
      this.tv2 = false;
      this.m6f = 0.0F;
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield bdv.hxk Lyqv;
      // 08: iload 1
      // 09: ifeq 27
      // 0c: invokevirtual yqv.gzr ()Z
      // 0f: ifeq 8d
      // 12: goto 19
      // 15: invokestatic bdv.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield bdv.hxk Lyqv;
      // 1d: getfield yqv.wgv Li2h;
      // 20: goto 27
      // 23: invokestatic bdv.a (Loov;)Loov;
      // 26: athrow
      // 27: iload 1
      // 28: ifeq 43
      // 2b: ifnull 8d
      // 2e: goto 35
      // 31: invokestatic bdv.a (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield bdv.hxk Lyqv;
      // 39: getfield yqv.wgv Li2h;
      // 3c: goto 43
      // 3f: invokestatic bdv.a (Loov;)Loov;
      // 42: athrow
      // 43: instanceof ha9
      // 46: iload 1
      // 47: ifeq 5f
      // 4a: ifeq 8d
      // 4d: goto 54
      // 50: invokestatic bdv.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: getfield bdv.tv2 Z
      // 58: goto 5f
      // 5b: invokestatic bdv.a (Loov;)Loov;
      // 5e: athrow
      // 5f: iload 1
      // 60: ifeq 8a
      // 63: ifne 89
      // 66: goto 6d
      // 69: invokestatic bdv.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield bdv.hxk Lyqv;
      // 71: invokevirtual yqv.t1g ()Z
      // 74: iload 1
      // 75: ifeq 8a
      // 78: goto 7f
      // 7b: invokestatic bdv.a (Loov;)Loov;
      // 7e: athrow
      // 7f: ifeq 8d
      // 82: goto 89
      // 85: invokestatic bdv.a (Loov;)Loov;
      // 88: athrow
      // 89: bipush 1
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: ireturn
   }

   @Override
   public void iad() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield bdv.hxk Lyqv;
      // 004: getfield yqv.wgv Li2h;
      // 007: checkcast ha9
      // 00a: astore 2
      // 00b: invokestatic OpaquePredicate.b ()I
      // 00e: aload 0
      // 00f: getfield bdv.hxk Lyqv;
      // 012: checkcast EntityPlayer
      // 015: astore 3
      // 016: istore 1
      // 017: aload 2
      // 018: getfield ha9.x5k F
      // 01b: aload 0
      // 01c: getfield bdv.hxk Lyqv;
      // 01f: getfield yqv.x5k F
      // 022: fsub
      // 023: invokestatic fe6.qsy (F)F
      // 026: ldc 0.5
      // 028: nop
      // 029: fmul
      // 02a: fstore 4
      // 02c: fload 4
      // 02e: ldc 5.0
      // 030: nop
      // 031: fcmpl
      // 032: iload 1
      // 033: ifeq 04b
      // 036: ifle 045
      // 039: goto 040
      // 03c: invokestatic bdv.a (Loov;)Loov;
      // 03f: athrow
      // 040: ldc 5.0
      // 042: nop
      // 043: fstore 4
      // 045: fload 4
      // 047: ldc -5.0
      // 049: nop
      // 04a: fcmpg
      // 04b: iload 1
      // 04c: ifeq 07b
      // 04f: ifge 05e
      // 052: goto 059
      // 055: invokestatic bdv.a (Loov;)Loov;
      // 058: athrow
      // 059: ldc -5.0
      // 05b: nop
      // 05c: fstore 4
      // 05e: aload 0
      // 05f: getfield bdv.hxk Lyqv;
      // 062: aload 0
      // 063: getfield bdv.hxk Lyqv;
      // 066: getfield yqv.x5k F
      // 069: fload 4
      // 06b: fadd
      // 06c: invokestatic fe6.qsy (F)F
      // 06f: putfield yqv.x5k F
      // 072: aload 0
      // 073: getfield bdv.m6f F
      // 076: aload 0
      // 077: getfield bdv.o5o F
      // 07a: fcmpg
      // 07b: iload 1
      // 07c: ifeq 0af
      // 07f: ifge 0a6
      // 082: goto 089
      // 085: invokestatic bdv.a (Loov;)Loov;
      // 088: athrow
      // 089: aload 0
      // 08a: dup
      // 08b: getfield bdv.m6f F
      // 08e: aload 0
      // 08f: getfield bdv.o5o F
      // 092: aload 0
      // 093: getfield bdv.m6f F
      // 096: fsub
      // 097: ldc 0.01
      // 099: nop
      // 09a: fmul
      // 09b: fadd
      // 09c: putfield bdv.m6f F
      // 09f: goto 0a6
      // 0a2: invokestatic bdv.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: getfield bdv.m6f F
      // 0aa: aload 0
      // 0ab: getfield bdv.o5o F
      // 0ae: fcmpl
      // 0af: iload 1
      // 0b0: ifeq 0d6
      // 0b3: ifle 0cc
      // 0b6: goto 0bd
      // 0b9: invokestatic bdv.a (Loov;)Loov;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: aload 0
      // 0bf: getfield bdv.o5o F
      // 0c2: putfield bdv.m6f F
      // 0c5: goto 0cc
      // 0c8: invokestatic bdv.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: getfield bdv.hxk Lyqv;
      // 0d0: getfield yqv.o2v D
      // 0d3: invokestatic fe6.jqf (D)I
      // 0d6: istore 5
      // 0d8: aload 0
      // 0d9: getfield bdv.hxk Lyqv;
      // 0dc: getfield yqv.kfp D
      // 0df: invokestatic fe6.jqf (D)I
      // 0e2: istore 6
      // 0e4: aload 0
      // 0e5: getfield bdv.hxk Lyqv;
      // 0e8: getfield yqv.vbd D
      // 0eb: invokestatic fe6.jqf (D)I
      // 0ee: istore 7
      // 0f0: aload 0
      // 0f1: getfield bdv.m6f F
      // 0f4: fstore 8
      // 0f6: aload 0
      // 0f7: getfield bdv.tv2 Z
      // 0fa: iload 1
      // 0fb: ifeq 125
      // 0fe: ifeq 156
      // 101: goto 108
      // 104: invokestatic bdv.a (Loov;)Loov;
      // 107: athrow
      // 108: aload 0
      // 109: dup
      // 10a: getfield bdv.qbq I
      // 10d: iload 1
      // 10e: ifeq 135
      // 111: goto 118
      // 114: invokestatic bdv.a (Loov;)Loov;
      // 117: athrow
      // 118: dup_x1
      // 119: bipush 1
      // 11a: iadd
      // 11b: putfield bdv.qbq I
      // 11e: goto 125
      // 121: invokestatic bdv.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 0
      // 126: getfield bdv.vxv I
      // 129: if_icmple 138
      // 12c: aload 0
      // 12d: bipush 0
      // 12e: goto 135
      // 131: invokestatic bdv.a (Loov;)Loov;
      // 134: athrow
      // 135: putfield bdv.tv2 Z
      // 138: fload 8
      // 13a: fload 8
      // 13c: ldc 1.15
      // 13e: nop
      // 13f: fmul
      // 140: aload 0
      // 141: getfield bdv.qbq I
      // 144: i2f
      // 145: aload 0
      // 146: getfield bdv.vxv I
      // 149: i2f
      // 14a: fdiv
      // 14b: ldc 3.1415927
      // 14d: nop
      // 14e: fmul
      // 14f: invokestatic fe6.rtn (F)F
      // 152: fmul
      // 153: fadd
      // 154: fstore 8
      // 156: ldc 0.91
      // 158: nop
      // 159: fstore 9
      // 15b: aload 0
      // 15c: getfield bdv.hxk Lyqv;
      // 15f: iload 1
      // 160: ifeq 17b
      // 163: getfield yqv.lfk Z
      // 166: ifeq 1aa
      // 169: goto 170
      // 16c: invokestatic bdv.a (Loov;)Loov;
      // 16f: athrow
      // 170: aload 0
      // 171: getfield bdv.hxk Lyqv;
      // 174: goto 17b
      // 177: invokestatic bdv.a (Loov;)Loov;
      // 17a: athrow
      // 17b: getfield yqv.oay Lt9d;
      // 17e: new mew
      // 181: dup
      // 182: iload 5
      // 184: i2f
      // 185: invokestatic fe6.tpk (F)I
      // 188: iload 6
      // 18a: i2f
      // 18b: invokestatic fe6.tpk (F)I
      // 18e: bipush 1
      // 18f: isub
      // 190: iload 7
      // 192: i2f
      // 193: invokestatic fe6.tpk (F)I
      // 196: invokespecial mew.<init> (III)V
      // 199: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 19c: invokeinterface zfz.r_y ()Le0x; 1
      // 1a1: getfield e0x.t50 F
      // 1a4: ldc 0.91
      // 1a6: nop
      // 1a7: fmul
      // 1a8: fstore 9
      // 1aa: ldc 0.16277136
      // 1ac: nop
      // 1ad: fload 9
      // 1af: fload 9
      // 1b1: fmul
      // 1b2: fload 9
      // 1b4: fmul
      // 1b5: fdiv
      // 1b6: fstore 10
      // 1b8: aload 3
      // 1b9: getfield EntityPlayer.x5k F
      // 1bc: ldc 3.1415927
      // 1be: nop
      // 1bf: fmul
      // 1c0: ldc 180.0
      // 1c2: nop
      // 1c3: fdiv
      // 1c4: invokestatic fe6.rtn (F)F
      // 1c7: fstore 11
      // 1c9: aload 3
      // 1ca: getfield EntityPlayer.x5k F
      // 1cd: ldc 3.1415927
      // 1cf: nop
      // 1d0: fmul
      // 1d1: ldc 180.0
      // 1d3: nop
      // 1d4: fdiv
      // 1d5: invokestatic fe6.ssk (F)F
      // 1d8: fstore 12
      // 1da: aload 3
      // 1db: invokevirtual EntityPlayer.ldh ()F
      // 1de: fload 10
      // 1e0: fmul
      // 1e1: fstore 13
      // 1e3: fload 8
      // 1e5: fconst_1
      // 1e6: invokestatic java/lang/Math.max (FF)F
      // 1e9: fstore 14
      // 1eb: fload 13
      // 1ed: fload 14
      // 1ef: fdiv
      // 1f0: fstore 14
      // 1f2: fload 8
      // 1f4: fload 14
      // 1f6: fmul
      // 1f7: fstore 15
      // 1f9: fload 15
      // 1fb: fload 11
      // 1fd: fmul
      // 1fe: fneg
      // 1ff: fstore 16
      // 201: fload 15
      // 203: fload 12
      // 205: fmul
      // 206: fstore 17
      // 208: fload 16
      // 20a: invokestatic fe6.sqg (F)F
      // 20d: fload 17
      // 20f: invokestatic fe6.sqg (F)F
      // 212: fcmpl
      // 213: iload 1
      // 214: ifeq 276
      // 217: ifle 26f
      // 21a: goto 221
      // 21d: invokestatic bdv.a (Loov;)Loov;
      // 220: athrow
      // 221: fload 16
      // 223: fconst_0
      // 224: fcmpg
      // 225: iload 1
      // 226: ifeq 257
      // 229: goto 230
      // 22c: invokestatic bdv.a (Loov;)Loov;
      // 22f: athrow
      // 230: ifge 248
      // 233: goto 23a
      // 236: invokestatic bdv.a (Loov;)Loov;
      // 239: athrow
      // 23a: fload 16
      // 23c: aload 0
      // 23d: getfield bdv.hxk Lyqv;
      // 240: getfield yqv.uo6 F
      // 243: fconst_2
      // 244: fdiv
      // 245: fsub
      // 246: fstore 16
      // 248: fload 16
      // 24a: iload 1
      // 24b: ifeq 269
      // 24e: fconst_0
      // 24f: fcmpl
      // 250: goto 257
      // 253: invokestatic bdv.a (Loov;)Loov;
      // 256: athrow
      // 257: ifle 268
      // 25a: fload 16
      // 25c: aload 0
      // 25d: getfield bdv.hxk Lyqv;
      // 260: getfield yqv.uo6 F
      // 263: fconst_2
      // 264: fdiv
      // 265: fadd
      // 266: fstore 16
      // 268: fconst_0
      // 269: fstore 17
      // 26b: iload 1
      // 26c: ifne 2b2
      // 26f: fconst_0
      // 270: fstore 16
      // 272: fload 17
      // 274: fconst_0
      // 275: fcmpg
      // 276: iload 1
      // 277: ifeq 296
      // 27a: ifge 292
      // 27d: goto 284
      // 280: invokestatic bdv.a (Loov;)Loov;
      // 283: athrow
      // 284: fload 17
      // 286: aload 0
      // 287: getfield bdv.hxk Lyqv;
      // 28a: getfield yqv.uo6 F
      // 28d: fconst_2
      // 28e: fdiv
      // 28f: fsub
      // 290: fstore 17
      // 292: fload 17
      // 294: fconst_0
      // 295: fcmpl
      // 296: iload 1
      // 297: ifeq 2c0
      // 29a: ifle 2b2
      // 29d: goto 2a4
      // 2a0: invokestatic bdv.a (Loov;)Loov;
      // 2a3: athrow
      // 2a4: fload 17
      // 2a6: aload 0
      // 2a7: getfield bdv.hxk Lyqv;
      // 2aa: getfield yqv.uo6 F
      // 2ad: fconst_2
      // 2ae: fdiv
      // 2af: fadd
      // 2b0: fstore 17
      // 2b2: aload 0
      // 2b3: getfield bdv.hxk Lyqv;
      // 2b6: getfield yqv.o2v D
      // 2b9: fload 16
      // 2bb: f2d
      // 2bc: dadd
      // 2bd: invokestatic fe6.jqf (D)I
      // 2c0: istore 18
      // 2c2: aload 0
      // 2c3: getfield bdv.hxk Lyqv;
      // 2c6: getfield yqv.vbd D
      // 2c9: fload 17
      // 2cb: f2d
      // 2cc: dadd
      // 2cd: invokestatic fe6.jqf (D)I
      // 2d0: istore 19
      // 2d2: aload 0
      // 2d3: getfield bdv.hxk Lyqv;
      // 2d6: getfield yqv.uo6 F
      // 2d9: fconst_1
      // 2da: fadd
      // 2db: invokestatic fe6.tpk (F)I
      // 2de: istore 20
      // 2e0: aload 0
      // 2e1: getfield bdv.hxk Lyqv;
      // 2e4: getfield yqv.ikl F
      // 2e7: aload 2
      // 2e8: getfield ha9.ikl F
      // 2eb: fadd
      // 2ec: fconst_1
      // 2ed: fadd
      // 2ee: invokestatic fe6.tpk (F)I
      // 2f1: istore 21
      // 2f3: aload 0
      // 2f4: getfield bdv.hxk Lyqv;
      // 2f7: getfield yqv.uo6 F
      // 2fa: fconst_1
      // 2fb: fadd
      // 2fc: invokestatic fe6.tpk (F)I
      // 2ff: istore 22
      // 301: iload 5
      // 303: iload 18
      // 305: iload 1
      // 306: ifeq 329
      // 309: if_icmpne 32c
      // 30c: goto 313
      // 30f: invokestatic bdv.a (Loov;)Loov;
      // 312: athrow
      // 313: iload 7
      // 315: iload 1
      // 316: ifeq 465
      // 319: goto 320
      // 31c: invokestatic bdv.a (Loov;)Loov;
      // 31f: athrow
      // 320: iload 19
      // 322: goto 329
      // 325: invokestatic bdv.a (Loov;)Loov;
      // 328: athrow
      // 329: if_icmpeq 45e
      // 32c: aload 0
      // 32d: getfield bdv.hxk Lyqv;
      // 330: getfield yqv.oay Lt9d;
      // 333: new mew
      // 336: dup
      // 337: iload 5
      // 339: iload 6
      // 33b: iload 7
      // 33d: invokespecial mew.<init> (III)V
      // 340: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 343: invokeinterface zfz.r_y ()Le0x; 1
      // 348: astore 23
      // 34a: aload 0
      // 34b: aload 23
      // 34d: invokespecial bdv.mjm (Le0x;)Z
      // 350: ifne 3a0
      // 353: aload 23
      // 355: invokevirtual e0x.p1r ()Lp3y;
      // 358: getstatic p3y.cei Lp3y;
      // 35b: if_acmpne 39c
      // 35e: goto 365
      // 361: invokestatic bdv.a (Loov;)Loov;
      // 364: athrow
      // 365: aload 0
      // 366: aload 0
      // 367: getfield bdv.hxk Lyqv;
      // 36a: getfield yqv.oay Lt9d;
      // 36d: new mew
      // 370: dup
      // 371: iload 5
      // 373: iload 6
      // 375: bipush 1
      // 376: isub
      // 377: iload 7
      // 379: invokespecial mew.<init> (III)V
      // 37c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 37f: invokeinterface zfz.r_y ()Le0x; 1
      // 384: invokespecial bdv.mjm (Le0x;)Z
      // 387: iload 1
      // 388: ifeq 39d
      // 38b: goto 392
      // 38e: invokestatic bdv.a (Loov;)Loov;
      // 391: athrow
      // 392: ifne 3a0
      // 395: goto 39c
      // 398: invokestatic bdv.a (Loov;)Loov;
      // 39b: athrow
      // 39c: bipush 1
      // 39d: goto 3a1
      // 3a0: bipush 0
      // 3a1: istore 24
      // 3a3: iload 24
      // 3a5: iload 1
      // 3a6: ifeq 465
      // 3a9: ifeq 45e
      // 3ac: goto 3b3
      // 3af: invokestatic bdv.a (Loov;)Loov;
      // 3b2: athrow
      // 3b3: bipush 0
      // 3b4: iload 1
      // 3b5: ifeq 465
      // 3b8: goto 3bf
      // 3bb: invokestatic bdv.a (Loov;)Loov;
      // 3be: athrow
      // 3bf: aload 0
      // 3c0: getfield bdv.hxk Lyqv;
      // 3c3: getfield yqv.oay Lt9d;
      // 3c6: aload 0
      // 3c7: getfield bdv.hxk Lyqv;
      // 3ca: iload 18
      // 3cc: iload 6
      // 3ce: iload 19
      // 3d0: iload 20
      // 3d2: iload 21
      // 3d4: iload 22
      // 3d6: bipush 0
      // 3d7: bipush 0
      // 3d8: bipush 1
      // 3d9: invokestatic l4f.ccu (Lm5n;Li2h;IIIIIIZZZ)I
      // 3dc: if_icmpne 45e
      // 3df: goto 3e6
      // 3e2: invokestatic bdv.a (Loov;)Loov;
      // 3e5: athrow
      // 3e6: bipush 1
      // 3e7: iload 1
      // 3e8: ifeq 465
      // 3eb: goto 3f2
      // 3ee: invokestatic bdv.a (Loov;)Loov;
      // 3f1: athrow
      // 3f2: aload 0
      // 3f3: getfield bdv.hxk Lyqv;
      // 3f6: getfield yqv.oay Lt9d;
      // 3f9: aload 0
      // 3fa: getfield bdv.hxk Lyqv;
      // 3fd: iload 5
      // 3ff: iload 6
      // 401: bipush 1
      // 402: iadd
      // 403: iload 7
      // 405: iload 20
      // 407: iload 21
      // 409: iload 22
      // 40b: bipush 0
      // 40c: bipush 0
      // 40d: bipush 1
      // 40e: invokestatic l4f.ccu (Lm5n;Li2h;IIIIIIZZZ)I
      // 411: if_icmpne 45e
      // 414: goto 41b
      // 417: invokestatic bdv.a (Loov;)Loov;
      // 41a: athrow
      // 41b: bipush 1
      // 41c: iload 1
      // 41d: ifeq 465
      // 420: goto 427
      // 423: invokestatic bdv.a (Loov;)Loov;
      // 426: athrow
      // 427: aload 0
      // 428: getfield bdv.hxk Lyqv;
      // 42b: getfield yqv.oay Lt9d;
      // 42e: aload 0
      // 42f: getfield bdv.hxk Lyqv;
      // 432: iload 18
      // 434: iload 6
      // 436: bipush 1
      // 437: iadd
      // 438: iload 19
      // 43a: iload 20
      // 43c: iload 21
      // 43e: iload 22
      // 440: bipush 0
      // 441: bipush 0
      // 442: bipush 1
      // 443: invokestatic l4f.ccu (Lm5n;Li2h;IIIIIIZZZ)I
      // 446: if_icmpne 45e
      // 449: goto 450
      // 44c: invokestatic bdv.a (Loov;)Loov;
      // 44f: athrow
      // 450: aload 3
      // 451: invokevirtual EntityPlayer.wzk ()Lrr0;
      // 454: invokevirtual rr0.nqf ()V
      // 457: goto 45e
      // 45a: invokestatic bdv.a (Loov;)Loov;
      // 45d: athrow
      // 45e: aload 2
      // 45f: getfield ha9.lls Lpj2;
      // 462: getfield pj2.g40 Z
      // 465: iload 1
      // 466: ifeq 492
      // 469: ifne 54c
      // 46c: goto 473
      // 46f: invokestatic bdv.a (Loov;)Loov;
      // 472: athrow
      // 473: aload 0
      // 474: iload 1
      // 475: ifeq 54d
      // 478: goto 47f
      // 47b: invokestatic bdv.a (Loov;)Loov;
      // 47e: athrow
      // 47f: getfield bdv.m6f F
      // 482: aload 0
      // 483: getfield bdv.o5o F
      // 486: ldc 0.5
      // 488: nop
      // 489: fmul
      // 48a: fcmpl
      // 48b: goto 492
      // 48e: invokestatic bdv.a (Loov;)Loov;
      // 491: athrow
      // 492: iflt 54c
      // 495: aload 0
      // 496: getfield bdv.hxk Lyqv;
      // 499: iload 1
      // 49a: ifeq 550
      // 49d: goto 4a4
      // 4a0: invokestatic bdv.a (Loov;)Loov;
      // 4a3: athrow
      // 4a4: invokevirtual yqv.mbr ()Ljava/util/Random;
      // 4a7: invokevirtual java/util/Random.nextFloat ()F
      // 4aa: ldc 0.006
      // 4ac: nop
      // 4ad: fcmpg
      // 4ae: ifge 54c
      // 4b1: goto 4b8
      // 4b4: invokestatic bdv.a (Loov;)Loov;
      // 4b7: athrow
      // 4b8: aload 0
      // 4b9: iload 1
      // 4ba: ifeq 54d
      // 4bd: goto 4c4
      // 4c0: invokestatic bdv.a (Loov;)Loov;
      // 4c3: athrow
      // 4c4: getfield bdv.tv2 Z
      // 4c7: ifne 54c
      // 4ca: goto 4d1
      // 4cd: invokestatic bdv.a (Loov;)Loov;
      // 4d0: athrow
      // 4d1: aload 2
      // 4d2: invokevirtual ha9.tsc ()Lerg;
      // 4d5: astore 23
      // 4d7: iload 1
      // 4d8: ifeq 556
      // 4db: aload 23
      // 4dd: ifnull 54c
      // 4e0: goto 4e7
      // 4e3: invokestatic bdv.a (Loov;)Loov;
      // 4e6: athrow
      // 4e7: aload 23
      // 4e9: iload 1
      // 4ea: ifeq 51f
      // 4ed: goto 4f4
      // 4f0: invokestatic bdv.a (Loov;)Loov;
      // 4f3: athrow
      // 4f4: invokevirtual erg.gn1 ()Lu7m;
      // 4f7: getstatic xbr.nz4 Lu7m;
      // 4fa: if_acmpne 54c
      // 4fd: goto 504
      // 500: invokestatic bdv.a (Loov;)Loov;
      // 503: athrow
      // 504: aload 23
      // 506: bipush 1
      // 507: aload 2
      // 508: invokevirtual erg.ybw (ILg_3;)V
      // 50b: iload 1
      // 50c: ifeq 556
      // 50f: goto 516
      // 512: invokestatic bdv.a (Loov;)Loov;
      // 515: athrow
      // 516: aload 23
      // 518: goto 51f
      // 51b: invokestatic bdv.a (Loov;)Loov;
      // 51e: athrow
      // 51f: getfield erg.qd2 I
      // 522: ifne 54c
      // 525: new erg
      // 528: dup
      // 529: getstatic xbr.kru Lyab;
      // 52c: invokespecial erg.<init> (Lu7m;)V
      // 52f: astore 24
      // 531: aload 24
      // 533: aload 23
      // 535: invokevirtual erg.zso ()Lbdo;
      // 538: invokevirtual erg.b67 (Lbdo;)V
      // 53b: aload 2
      // 53c: getfield ha9.up_ Ljnq;
      // 53f: getfield jnq.c41 [Lerg;
      // 542: aload 2
      // 543: getfield ha9.up_ Ljnq;
      // 546: getfield jnq.nb5 I
      // 549: aload 24
      // 54b: aastore
      // 54c: aload 0
      // 54d: getfield bdv.hxk Lyqv;
      // 550: fconst_0
      // 551: fload 8
      // 553: invokevirtual yqv.ge2 (FF)V
      // 556: return
   }

   private boolean mjm(e0x param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: instanceof g7u
      // 08: iload 2
      // 09: ifne 30
      // 0c: ifne 2f
      // 0f: goto 16
      // 12: invokestatic bdv.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: instanceof izd
      // 1a: iload 2
      // 1b: ifne 30
      // 1e: goto 25
      // 21: invokestatic bdv.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic bdv.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public boolean xl7() {
      return this.tv2;
   }

   public void ri3() {
      this.tv2 = true;
      this.qbq = 0;
      this.vxv = this.hxk.mbr().nextInt(841) + 140;
   }

   public boolean k3c() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual bdv.xl7 ()Z
      // 08: iload 1
      // 09: ifne 2a
      // 0c: ifne 3c
      // 0f: goto 16
      // 12: invokestatic bdv.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield bdv.m6f F
      // 1a: aload 0
      // 1b: getfield bdv.o5o F
      // 1e: ldc 0.3
      // 20: nop
      // 21: fmul
      // 22: fcmpl
      // 23: goto 2a
      // 26: invokestatic bdv.a (Loov;)Loov;
      // 29: athrow
      // 2a: iload 1
      // 2b: ifne 39
      // 2e: ifle 3c
      // 31: goto 38
      // 34: invokestatic bdv.a (Loov;)Loov;
      // 37: athrow
      // 38: bipush 1
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
