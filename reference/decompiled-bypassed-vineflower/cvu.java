public class cvu extends uk2 {
   private float[] mi1 = new float[1024];

   public void ljs(
      long param1,
      int param3,
      int param4,
      lno param5,
      double param6,
      double param8,
      double param10,
      float param12,
      float param13,
      float param14,
      int param15,
      int param16,
      double param17
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/Random
      // 003: dup
      // 004: lload 1
      // 005: invokespecial java/util/Random.<init> (J)V
      // 008: astore 20
      // 00a: iload 3
      // 00b: bipush 16
      // 00d: imul
      // 00e: bipush 8
      // 010: iadd
      // 011: i2d
      // 012: dstore 21
      // 014: invokestatic t9d.c ()I
      // 017: iload 4
      // 019: bipush 16
      // 01b: imul
      // 01c: bipush 8
      // 01e: iadd
      // 01f: i2d
      // 020: dstore 23
      // 022: istore 19
      // 024: fconst_0
      // 025: fstore 25
      // 027: fconst_0
      // 028: fstore 26
      // 02a: iload 16
      // 02c: iload 19
      // 02e: ifne 056
      // 031: ifgt 055
      // 034: goto 03b
      // 037: invokestatic cvu.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield cvu.oa6 I
      // 03f: bipush 16
      // 041: imul
      // 042: bipush 16
      // 044: isub
      // 045: istore 27
      // 047: iload 27
      // 049: aload 20
      // 04b: iload 27
      // 04d: bipush 4
      // 04e: idiv
      // 04f: invokevirtual java/util/Random.nextInt (I)I
      // 052: isub
      // 053: istore 16
      // 055: bipush 0
      // 056: istore 27
      // 058: iload 15
      // 05a: bipush -1
      // 05b: iload 19
      // 05d: ifne 074
      // 060: if_icmpne 07a
      // 063: goto 06a
      // 066: invokestatic cvu.a (Loov;)Loov;
      // 069: athrow
      // 06a: iload 16
      // 06c: bipush 2
      // 06d: goto 074
      // 070: invokestatic cvu.a (Loov;)Loov;
      // 073: athrow
      // 074: idiv
      // 075: istore 15
      // 077: bipush 1
      // 078: istore 27
      // 07a: fconst_1
      // 07b: fstore 28
      // 07d: bipush 0
      // 07e: istore 29
      // 080: iload 29
      // 082: sipush 256
      // 085: if_icmpge 0da
      // 088: iload 29
      // 08a: iload 19
      // 08c: ifne 0dc
      // 08f: iload 19
      // 091: ifne 0b2
      // 094: goto 09b
      // 097: invokestatic cvu.a (Loov;)Loov;
      // 09a: athrow
      // 09b: ifeq 0b5
      // 09e: goto 0a5
      // 0a1: invokestatic cvu.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: aload 20
      // 0a7: bipush 3
      // 0a8: invokevirtual java/util/Random.nextInt (I)I
      // 0ab: goto 0b2
      // 0ae: invokestatic cvu.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: ifne 0c6
      // 0b5: fconst_1
      // 0b6: aload 20
      // 0b8: invokevirtual java/util/Random.nextFloat ()F
      // 0bb: aload 20
      // 0bd: invokevirtual java/util/Random.nextFloat ()F
      // 0c0: fmul
      // 0c1: fconst_1
      // 0c2: fmul
      // 0c3: fadd
      // 0c4: fstore 28
      // 0c6: aload 0
      // 0c7: getfield cvu.mi1 [F
      // 0ca: iload 29
      // 0cc: fload 28
      // 0ce: fload 28
      // 0d0: fmul
      // 0d1: fastore
      // 0d2: iinc 29 1
      // 0d5: iload 19
      // 0d7: ifeq 080
      // 0da: iload 15
      // 0dc: iload 16
      // 0de: if_icmpge 72a
      // 0e1: ldc2_w 1.5
      // 0e4: iload 15
      // 0e6: i2f
      // 0e7: ldc 3.1415927
      // 0e9: nop
      // 0ea: fmul
      // 0eb: iload 16
      // 0ed: i2f
      // 0ee: fdiv
      // 0ef: invokestatic fe6.rtn (F)F
      // 0f2: fload 12
      // 0f4: fmul
      // 0f5: fconst_1
      // 0f6: fmul
      // 0f7: f2d
      // 0f8: dadd
      // 0f9: dstore 29
      // 0fb: dload 29
      // 0fd: dload 17
      // 0ff: dmul
      // 100: dstore 31
      // 102: dload 29
      // 104: aload 20
      // 106: invokevirtual java/util/Random.nextFloat ()F
      // 109: f2d
      // 10a: ldc2_w 0.25
      // 10d: dmul
      // 10e: ldc2_w 0.75
      // 111: dadd
      // 112: dmul
      // 113: dstore 29
      // 115: dload 31
      // 117: aload 20
      // 119: invokevirtual java/util/Random.nextFloat ()F
      // 11c: f2d
      // 11d: ldc2_w 0.25
      // 120: dmul
      // 121: ldc2_w 0.75
      // 124: dadd
      // 125: dmul
      // 126: dstore 31
      // 128: fload 14
      // 12a: invokestatic fe6.ssk (F)F
      // 12d: fstore 33
      // 12f: fload 14
      // 131: invokestatic fe6.rtn (F)F
      // 134: fstore 34
      // 136: dload 6
      // 138: fload 13
      // 13a: invokestatic fe6.ssk (F)F
      // 13d: fload 33
      // 13f: fmul
      // 140: f2d
      // 141: dadd
      // 142: dstore 6
      // 144: dload 8
      // 146: fload 34
      // 148: f2d
      // 149: dadd
      // 14a: dstore 8
      // 14c: dload 10
      // 14e: fload 13
      // 150: invokestatic fe6.rtn (F)F
      // 153: fload 33
      // 155: fmul
      // 156: f2d
      // 157: dadd
      // 158: iload 19
      // 15a: ifne 1e0
      // 15d: dstore 10
      // 15f: fload 14
      // 161: ldc 0.7
      // 163: nop
      // 164: fmul
      // 165: fstore 14
      // 167: fload 14
      // 169: fload 26
      // 16b: ldc 0.05
      // 16d: nop
      // 16e: fmul
      // 16f: fadd
      // 170: fstore 14
      // 172: fload 13
      // 174: fload 25
      // 176: ldc 0.05
      // 178: nop
      // 179: fmul
      // 17a: fadd
      // 17b: fstore 13
      // 17d: fload 26
      // 17f: ldc 0.8
      // 181: nop
      // 182: fmul
      // 183: fstore 26
      // 185: fload 25
      // 187: ldc 0.5
      // 189: nop
      // 18a: fmul
      // 18b: fstore 25
      // 18d: fload 26
      // 18f: aload 20
      // 191: invokevirtual java/util/Random.nextFloat ()F
      // 194: aload 20
      // 196: invokevirtual java/util/Random.nextFloat ()F
      // 199: fsub
      // 19a: aload 20
      // 19c: invokevirtual java/util/Random.nextFloat ()F
      // 19f: fmul
      // 1a0: fconst_2
      // 1a1: fmul
      // 1a2: fadd
      // 1a3: fstore 26
      // 1a5: fload 25
      // 1a7: aload 20
      // 1a9: invokevirtual java/util/Random.nextFloat ()F
      // 1ac: aload 20
      // 1ae: invokevirtual java/util/Random.nextFloat ()F
      // 1b1: fsub
      // 1b2: aload 20
      // 1b4: invokevirtual java/util/Random.nextFloat ()F
      // 1b7: fmul
      // 1b8: ldc 4.0
      // 1ba: nop
      // 1bb: fmul
      // 1bc: fadd
      // 1bd: fstore 25
      // 1bf: iload 27
      // 1c1: ifne 1d4
      // 1c4: aload 20
      // 1c6: bipush 4
      // 1c7: invokevirtual java/util/Random.nextInt (I)I
      // 1ca: ifeq 722
      // 1cd: goto 1d4
      // 1d0: invokestatic cvu.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: dload 6
      // 1d6: dload 21
      // 1d8: dsub
      // 1d9: goto 1e0
      // 1dc: invokestatic cvu.a (Loov;)Loov;
      // 1df: athrow
      // 1e0: dstore 35
      // 1e2: dload 10
      // 1e4: dload 23
      // 1e6: dsub
      // 1e7: dstore 37
      // 1e9: iload 16
      // 1eb: iload 15
      // 1ed: isub
      // 1ee: i2d
      // 1ef: dstore 39
      // 1f1: fload 12
      // 1f3: fconst_2
      // 1f4: fadd
      // 1f5: ldc 16.0
      // 1f7: nop
      // 1f8: fadd
      // 1f9: f2d
      // 1fa: dstore 41
      // 1fc: dload 35
      // 1fe: dload 35
      // 200: dmul
      // 201: dload 37
      // 203: dload 37
      // 205: dmul
      // 206: dadd
      // 207: dload 39
      // 209: dload 39
      // 20b: dmul
      // 20c: dsub
      // 20d: dload 41
      // 20f: dload 41
      // 211: dmul
      // 212: dcmpl
      // 213: iload 19
      // 215: ifne 233
      // 218: ifle 223
      // 21b: goto 222
      // 21e: invokestatic cvu.a (Loov;)Loov;
      // 221: athrow
      // 222: return
      // 223: dload 6
      // 225: dload 21
      // 227: ldc2_w 16.0
      // 22a: dsub
      // 22b: dload 29
      // 22d: ldc2_w 2.0
      // 230: dmul
      // 231: dsub
      // 232: dcmpl
      // 233: iload 19
      // 235: ifne 259
      // 238: iflt 722
      // 23b: goto 242
      // 23e: invokestatic cvu.a (Loov;)Loov;
      // 241: athrow
      // 242: dload 10
      // 244: dload 23
      // 246: ldc2_w 16.0
      // 249: dsub
      // 24a: dload 29
      // 24c: ldc2_w 2.0
      // 24f: dmul
      // 250: dsub
      // 251: dcmpl
      // 252: goto 259
      // 255: invokestatic cvu.a (Loov;)Loov;
      // 258: athrow
      // 259: iload 19
      // 25b: ifne 27f
      // 25e: iflt 722
      // 261: goto 268
      // 264: invokestatic cvu.a (Loov;)Loov;
      // 267: athrow
      // 268: dload 6
      // 26a: dload 21
      // 26c: ldc2_w 16.0
      // 26f: dadd
      // 270: dload 29
      // 272: ldc2_w 2.0
      // 275: dmul
      // 276: dadd
      // 277: dcmpg
      // 278: goto 27f
      // 27b: invokestatic cvu.a (Loov;)Loov;
      // 27e: athrow
      // 27f: iload 19
      // 281: ifne 2a5
      // 284: ifgt 722
      // 287: goto 28e
      // 28a: invokestatic cvu.a (Loov;)Loov;
      // 28d: athrow
      // 28e: dload 10
      // 290: dload 23
      // 292: ldc2_w 16.0
      // 295: dadd
      // 296: dload 29
      // 298: ldc2_w 2.0
      // 29b: dmul
      // 29c: dadd
      // 29d: dcmpg
      // 29e: goto 2a5
      // 2a1: invokestatic cvu.a (Loov;)Loov;
      // 2a4: athrow
      // 2a5: iload 19
      // 2a7: ifne 2ca
      // 2aa: ifgt 722
      // 2ad: goto 2b4
      // 2b0: invokestatic cvu.a (Loov;)Loov;
      // 2b3: athrow
      // 2b4: dload 6
      // 2b6: dload 29
      // 2b8: dsub
      // 2b9: invokestatic fe6.jqf (D)I
      // 2bc: iload 3
      // 2bd: bipush 16
      // 2bf: imul
      // 2c0: isub
      // 2c1: bipush 1
      // 2c2: isub
      // 2c3: goto 2ca
      // 2c6: invokestatic cvu.a (Loov;)Loov;
      // 2c9: athrow
      // 2ca: istore 43
      // 2cc: dload 6
      // 2ce: dload 29
      // 2d0: dadd
      // 2d1: invokestatic fe6.jqf (D)I
      // 2d4: iload 3
      // 2d5: bipush 16
      // 2d7: imul
      // 2d8: isub
      // 2d9: bipush 1
      // 2da: iadd
      // 2db: istore 44
      // 2dd: dload 8
      // 2df: dload 31
      // 2e1: dsub
      // 2e2: invokestatic fe6.jqf (D)I
      // 2e5: bipush 1
      // 2e6: isub
      // 2e7: istore 45
      // 2e9: dload 8
      // 2eb: dload 31
      // 2ed: dadd
      // 2ee: invokestatic fe6.jqf (D)I
      // 2f1: bipush 1
      // 2f2: iadd
      // 2f3: istore 46
      // 2f5: dload 10
      // 2f7: dload 29
      // 2f9: dsub
      // 2fa: invokestatic fe6.jqf (D)I
      // 2fd: iload 4
      // 2ff: bipush 16
      // 301: imul
      // 302: isub
      // 303: bipush 1
      // 304: isub
      // 305: istore 47
      // 307: dload 10
      // 309: dload 29
      // 30b: dadd
      // 30c: invokestatic fe6.jqf (D)I
      // 30f: iload 4
      // 311: bipush 16
      // 313: imul
      // 314: isub
      // 315: bipush 1
      // 316: iadd
      // 317: istore 48
      // 319: iload 43
      // 31b: iload 19
      // 31d: ifne 32f
      // 320: ifge 32d
      // 323: goto 32a
      // 326: invokestatic cvu.a (Loov;)Loov;
      // 329: athrow
      // 32a: bipush 0
      // 32b: istore 43
      // 32d: iload 44
      // 32f: bipush 16
      // 331: iload 19
      // 333: ifne 347
      // 336: if_icmple 344
      // 339: goto 340
      // 33c: invokestatic cvu.a (Loov;)Loov;
      // 33f: athrow
      // 340: bipush 16
      // 342: istore 44
      // 344: iload 45
      // 346: bipush 1
      // 347: iload 19
      // 349: ifne 36a
      // 34c: if_icmpge 359
      // 34f: goto 356
      // 352: invokestatic cvu.a (Loov;)Loov;
      // 355: athrow
      // 356: bipush 1
      // 357: istore 45
      // 359: iload 46
      // 35b: iload 19
      // 35d: ifne 374
      // 360: sipush 248
      // 363: goto 36a
      // 366: invokestatic cvu.a (Loov;)Loov;
      // 369: athrow
      // 36a: if_icmple 372
      // 36d: sipush 248
      // 370: istore 46
      // 372: iload 47
      // 374: iload 19
      // 376: ifne 388
      // 379: ifge 386
      // 37c: goto 383
      // 37f: invokestatic cvu.a (Loov;)Loov;
      // 382: athrow
      // 383: bipush 0
      // 384: istore 47
      // 386: iload 48
      // 388: iload 19
      // 38a: ifne 39e
      // 38d: bipush 16
      // 38f: if_icmple 39d
      // 392: goto 399
      // 395: invokestatic cvu.a (Loov;)Loov;
      // 398: athrow
      // 399: bipush 16
      // 39b: istore 48
      // 39d: bipush 0
      // 39e: istore 49
      // 3a0: iload 43
      // 3a2: istore 50
      // 3a4: iload 49
      // 3a6: ifne 501
      // 3a9: iload 50
      // 3ab: iload 19
      // 3ad: ifne 503
      // 3b0: iload 44
      // 3b2: iload 19
      // 3b4: ifne 0de
      // 3b7: goto 3be
      // 3ba: invokestatic cvu.a (Loov;)Loov;
      // 3bd: athrow
      // 3be: if_icmpge 501
      // 3c1: iload 47
      // 3c3: istore 51
      // 3c5: iload 49
      // 3c7: ifne 4f9
      // 3ca: iload 51
      // 3cc: iload 48
      // 3ce: iload 19
      // 3d0: ifne 0de
      // 3d3: iload 19
      // 3d5: ifne 3ec
      // 3d8: if_icmpge 4f9
      // 3db: goto 3e2
      // 3de: invokestatic cvu.a (Loov;)Loov;
      // 3e1: athrow
      // 3e2: iload 46
      // 3e4: bipush 1
      // 3e5: goto 3ec
      // 3e8: invokestatic cvu.a (Loov;)Loov;
      // 3eb: athrow
      // 3ec: iadd
      // 3ed: istore 52
      // 3ef: iload 49
      // 3f1: ifne 4f1
      // 3f4: iload 52
      // 3f6: iload 19
      // 3f8: ifne 410
      // 3fb: iload 45
      // 3fd: bipush 1
      // 3fe: isub
      // 3ff: iload 19
      // 401: ifne 0de
      // 404: goto 40b
      // 407: invokestatic cvu.a (Loov;)Loov;
      // 40a: athrow
      // 40b: if_icmplt 4f1
      // 40e: iload 52
      // 410: iload 19
      // 412: ifne 421
      // 415: iflt 4e9
      // 418: goto 41f
      // 41b: invokestatic cvu.a (Loov;)Loov;
      // 41e: athrow
      // 41f: iload 52
      // 421: sipush 256
      // 424: if_icmpge 4e9
      // 427: aload 5
      // 429: iload 50
      // 42b: iload 52
      // 42d: iload 51
      // 42f: invokevirtual lno.ql9 (III)Lzfz;
      // 432: astore 53
      // 434: aload 53
      // 436: invokeinterface zfz.r_y ()Le0x; 1
      // 43b: iload 19
      // 43d: ifne 45b
      // 440: getstatic ox_.whp L_13;
      // 443: if_acmpeq 461
      // 446: goto 44d
      // 449: invokestatic cvu.a (Loov;)Loov;
      // 44c: athrow
      // 44d: aload 53
      // 44f: invokeinterface zfz.r_y ()Le0x; 1
      // 454: goto 45b
      // 457: invokestatic cvu.a (Loov;)Loov;
      // 45a: athrow
      // 45b: getstatic ox_.gdz Les2;
      // 45e: if_acmpne 464
      // 461: bipush 1
      // 462: istore 49
      // 464: iload 52
      // 466: iload 45
      // 468: bipush 1
      // 469: isub
      // 46a: iload 19
      // 46c: ifne 484
      // 46f: if_icmpeq 4e9
      // 472: goto 479
      // 475: invokestatic cvu.a (Loov;)Loov;
      // 478: athrow
      // 479: iload 50
      // 47b: iload 43
      // 47d: goto 484
      // 480: invokestatic cvu.a (Loov;)Loov;
      // 483: athrow
      // 484: iload 19
      // 486: ifne 4a0
      // 489: if_icmpeq 4e9
      // 48c: goto 493
      // 48f: invokestatic cvu.a (Loov;)Loov;
      // 492: athrow
      // 493: iload 50
      // 495: iload 44
      // 497: bipush 1
      // 498: isub
      // 499: goto 4a0
      // 49c: invokestatic cvu.a (Loov;)Loov;
      // 49f: athrow
      // 4a0: iload 19
      // 4a2: ifne 4ba
      // 4a5: if_icmpeq 4e9
      // 4a8: goto 4af
      // 4ab: invokestatic cvu.a (Loov;)Loov;
      // 4ae: athrow
      // 4af: iload 51
      // 4b1: iload 47
      // 4b3: goto 4ba
      // 4b6: invokestatic cvu.a (Loov;)Loov;
      // 4b9: athrow
      // 4ba: iload 19
      // 4bc: ifne 4e2
      // 4bf: if_icmpeq 4e9
      // 4c2: goto 4c9
      // 4c5: invokestatic cvu.a (Loov;)Loov;
      // 4c8: athrow
      // 4c9: iload 51
      // 4cb: iload 19
      // 4cd: ifne 4e7
      // 4d0: goto 4d7
      // 4d3: invokestatic cvu.a (Loov;)Loov;
      // 4d6: athrow
      // 4d7: iload 48
      // 4d9: bipush 1
      // 4da: isub
      // 4db: goto 4e2
      // 4de: invokestatic cvu.a (Loov;)Loov;
      // 4e1: athrow
      // 4e2: if_icmpeq 4e9
      // 4e5: iload 45
      // 4e7: istore 52
      // 4e9: iinc 52 -1
      // 4ec: iload 19
      // 4ee: ifeq 3ef
      // 4f1: iinc 51 1
      // 4f4: iload 19
      // 4f6: ifeq 3c5
      // 4f9: iinc 50 1
      // 4fc: iload 19
      // 4fe: ifeq 3a4
      // 501: iload 49
      // 503: ifne 722
      // 506: new mew$mix
      // 509: dup
      // 50a: invokespecial mew$mix.<init> ()V
      // 50d: astore 50
      // 50f: iload 43
      // 511: istore 51
      // 513: iload 51
      // 515: iload 44
      // 517: if_icmpge 71a
      // 51a: iload 51
      // 51c: iload 3
      // 51d: bipush 16
      // 51f: imul
      // 520: iadd
      // 521: i2d
      // 522: ldc2_w 0.5
      // 525: dadd
      // 526: dload 6
      // 528: dsub
      // 529: dload 29
      // 52b: ddiv
      // 52c: dstore 52
      // 52e: iload 47
      // 530: iload 19
      // 532: ifne 71c
      // 535: istore 54
      // 537: iload 54
      // 539: iload 48
      // 53b: if_icmpge 712
      // 53e: iload 54
      // 540: iload 4
      // 542: bipush 16
      // 544: imul
      // 545: iadd
      // 546: i2d
      // 547: ldc2_w 0.5
      // 54a: dadd
      // 54b: dload 10
      // 54d: dsub
      // 54e: dload 29
      // 550: ddiv
      // 551: dstore 55
      // 553: bipush 0
      // 554: istore 57
      // 556: iload 19
      // 558: ifne 70d
      // 55b: dload 52
      // 55d: dload 52
      // 55f: dmul
      // 560: dload 55
      // 562: dload 55
      // 564: dmul
      // 565: dadd
      // 566: dconst_1
      // 567: dcmpg
      // 568: iload 19
      // 56a: ifne 515
      // 56d: goto 574
      // 570: invokestatic cvu.a (Loov;)Loov;
      // 573: athrow
      // 574: ifge 70a
      // 577: iload 46
      // 579: istore 58
      // 57b: iload 58
      // 57d: iload 45
      // 57f: if_icmple 70a
      // 582: iload 58
      // 584: bipush 1
      // 585: isub
      // 586: i2d
      // 587: ldc2_w 0.5
      // 58a: dadd
      // 58b: dload 8
      // 58d: dsub
      // 58e: dload 31
      // 590: ddiv
      // 591: dstore 59
      // 593: iload 19
      // 595: ifne 705
      // 598: dload 52
      // 59a: dload 52
      // 59c: dmul
      // 59d: dload 55
      // 59f: dload 55
      // 5a1: dmul
      // 5a2: dadd
      // 5a3: aload 0
      // 5a4: getfield cvu.mi1 [F
      // 5a7: iload 58
      // 5a9: bipush 1
      // 5aa: isub
      // 5ab: faload
      // 5ac: f2d
      // 5ad: dmul
      // 5ae: dload 59
      // 5b0: dload 59
      // 5b2: dmul
      // 5b3: ldc2_w 6.0
      // 5b6: ddiv
      // 5b7: dadd
      // 5b8: dconst_1
      // 5b9: dcmpg
      // 5ba: iload 19
      // 5bc: ifne 539
      // 5bf: goto 5c6
      // 5c2: invokestatic cvu.a (Loov;)Loov;
      // 5c5: athrow
      // 5c6: ifge 702
      // 5c9: aload 5
      // 5cb: iload 51
      // 5cd: iload 58
      // 5cf: iload 54
      // 5d1: invokevirtual lno.ql9 (III)Lzfz;
      // 5d4: astore 61
      // 5d6: aload 61
      // 5d8: invokeinterface zfz.r_y ()Le0x; 1
      // 5dd: getstatic ox_.l11 Lx82;
      // 5e0: iload 19
      // 5e2: ifne 5fc
      // 5e5: if_acmpne 5f2
      // 5e8: goto 5ef
      // 5eb: invokestatic cvu.a (Loov;)Loov;
      // 5ee: athrow
      // 5ef: bipush 1
      // 5f0: istore 57
      // 5f2: aload 61
      // 5f4: invokeinterface zfz.r_y ()Le0x; 1
      // 5f9: getstatic ox_.pu8 Le0x;
      // 5fc: iload 19
      // 5fe: ifne 628
      // 601: if_acmpeq 63f
      // 604: goto 60b
      // 607: invokestatic cvu.a (Loov;)Loov;
      // 60a: athrow
      // 60b: aload 61
      // 60d: invokeinterface zfz.r_y ()Le0x; 1
      // 612: iload 19
      // 614: ifne 639
      // 617: goto 61e
      // 61a: invokestatic cvu.a (Loov;)Loov;
      // 61d: athrow
      // 61e: getstatic ox_.kqk Le0x;
      // 621: goto 628
      // 624: invokestatic cvu.a (Loov;)Loov;
      // 627: athrow
      // 628: if_acmpeq 63f
      // 62b: aload 61
      // 62d: invokeinterface zfz.r_y ()Le0x; 1
      // 632: goto 639
      // 635: invokestatic cvu.a (Loov;)Loov;
      // 638: athrow
      // 639: getstatic ox_.l11 Lx82;
      // 63c: if_acmpne 702
      // 63f: iload 58
      // 641: bipush 1
      // 642: isub
      // 643: iload 19
      // 645: ifne 69e
      // 648: goto 64f
      // 64b: invokestatic cvu.a (Loov;)Loov;
      // 64e: athrow
      // 64f: bipush 10
      // 651: if_icmpge 678
      // 654: goto 65b
      // 657: invokestatic cvu.a (Loov;)Loov;
      // 65a: athrow
      // 65b: aload 5
      // 65d: iload 51
      // 65f: iload 58
      // 661: iload 54
      // 663: getstatic ox_.dr2 L_13;
      // 666: invokevirtual _13.l4i ()Lzfz;
      // 669: invokevirtual lno.x6f (IIILzfz;)V
      // 66c: iload 19
      // 66e: ifeq 702
      // 671: goto 678
      // 674: invokestatic cvu.a (Loov;)Loov;
      // 677: athrow
      // 678: aload 5
      // 67a: iload 51
      // 67c: iload 58
      // 67e: iload 54
      // 680: getstatic ox_.ibw Le0x;
      // 683: invokevirtual e0x.l4i ()Lzfz;
      // 686: invokevirtual lno.x6f (IIILzfz;)V
      // 689: iload 19
      // 68b: ifne 705
      // 68e: goto 695
      // 691: invokestatic cvu.a (Loov;)Loov;
      // 694: athrow
      // 695: iload 57
      // 697: goto 69e
      // 69a: invokestatic cvu.a (Loov;)Loov;
      // 69d: athrow
      // 69e: ifeq 702
      // 6a1: aload 5
      // 6a3: iload 51
      // 6a5: iload 58
      // 6a7: bipush 1
      // 6a8: isub
      // 6a9: iload 54
      // 6ab: iload 19
      // 6ad: ifne 6f3
      // 6b0: goto 6b7
      // 6b3: invokestatic cvu.a (Loov;)Loov;
      // 6b6: athrow
      // 6b7: invokevirtual lno.ql9 (III)Lzfz;
      // 6ba: invokeinterface zfz.r_y ()Le0x; 1
      // 6bf: getstatic ox_.kqk Le0x;
      // 6c2: if_acmpne 702
      // 6c5: goto 6cc
      // 6c8: invokestatic cvu.a (Loov;)Loov;
      // 6cb: athrow
      // 6cc: aload 50
      // 6ce: iload 51
      // 6d0: iload 3
      // 6d1: bipush 16
      // 6d3: imul
      // 6d4: iadd
      // 6d5: bipush 0
      // 6d6: iload 54
      // 6d8: iload 4
      // 6da: bipush 16
      // 6dc: imul
      // 6dd: iadd
      // 6de: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 6e1: pop
      // 6e2: aload 5
      // 6e4: iload 51
      // 6e6: iload 58
      // 6e8: bipush 1
      // 6e9: isub
      // 6ea: iload 54
      // 6ec: goto 6f3
      // 6ef: invokestatic cvu.a (Loov;)Loov;
      // 6f2: athrow
      // 6f3: aload 0
      // 6f4: getfield cvu.pr9 Lt9d;
      // 6f7: aload 50
      // 6f9: invokevirtual t9d.getBiomeGenForCoords (Lmew;)Lgyu;
      // 6fc: getfield gyu.ke4 Lzfz;
      // 6ff: invokevirtual lno.x6f (IIILzfz;)V
      // 702: iinc 58 -1
      // 705: iload 19
      // 707: ifeq 57b
      // 70a: iinc 54 1
      // 70d: iload 19
      // 70f: ifeq 537
      // 712: iinc 51 1
      // 715: iload 19
      // 717: ifeq 513
      // 71a: iload 27
      // 71c: ifeq 722
      // 71f: goto 72a
      // 722: iinc 15 1
      // 725: iload 19
      // 727: ifeq 0da
      // 72a: return
   }

   @Override
   public void bjr(t9d param1, int param2, int param3, int param4, int param5, lno param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 7
      // 05: aload 0
      // 06: getfield cvu.a0f Ljava/util/Random;
      // 09: bipush 50
      // 0b: invokevirtual java/util/Random.nextInt (I)I
      // 0e: iload 7
      // 10: ifne 32
      // 13: ifne cd
      // 16: goto 1d
      // 19: invokestatic cvu.a (Loov;)Loov;
      // 1c: athrow
      // 1d: iload 2
      // 1e: bipush 16
      // 20: imul
      // 21: aload 0
      // 22: getfield cvu.a0f Ljava/util/Random;
      // 25: bipush 16
      // 27: invokevirtual java/util/Random.nextInt (I)I
      // 2a: iadd
      // 2b: goto 32
      // 2e: invokestatic cvu.a (Loov;)Loov;
      // 31: athrow
      // 32: i2d
      // 33: dstore 8
      // 35: aload 0
      // 36: getfield cvu.a0f Ljava/util/Random;
      // 39: aload 0
      // 3a: getfield cvu.a0f Ljava/util/Random;
      // 3d: bipush 40
      // 3f: invokevirtual java/util/Random.nextInt (I)I
      // 42: bipush 8
      // 44: iadd
      // 45: invokevirtual java/util/Random.nextInt (I)I
      // 48: bipush 20
      // 4a: iadd
      // 4b: i2d
      // 4c: dstore 10
      // 4e: iload 3
      // 4f: bipush 16
      // 51: imul
      // 52: aload 0
      // 53: getfield cvu.a0f Ljava/util/Random;
      // 56: bipush 16
      // 58: invokevirtual java/util/Random.nextInt (I)I
      // 5b: iadd
      // 5c: i2d
      // 5d: dstore 12
      // 5f: bipush 1
      // 60: istore 14
      // 62: bipush 0
      // 63: istore 15
      // 65: iload 15
      // 67: iload 14
      // 69: if_icmpge cd
      // 6c: aload 0
      // 6d: getfield cvu.a0f Ljava/util/Random;
      // 70: invokevirtual java/util/Random.nextFloat ()F
      // 73: ldc 3.1415927
      // 75: nop
      // 76: fmul
      // 77: fconst_2
      // 78: fmul
      // 79: fstore 16
      // 7b: aload 0
      // 7c: getfield cvu.a0f Ljava/util/Random;
      // 7f: invokevirtual java/util/Random.nextFloat ()F
      // 82: ldc 0.5
      // 84: nop
      // 85: fsub
      // 86: fconst_2
      // 87: fmul
      // 88: ldc 8.0
      // 8a: nop
      // 8b: fdiv
      // 8c: fstore 17
      // 8e: aload 0
      // 8f: getfield cvu.a0f Ljava/util/Random;
      // 92: invokevirtual java/util/Random.nextFloat ()F
      // 95: fconst_2
      // 96: fmul
      // 97: aload 0
      // 98: getfield cvu.a0f Ljava/util/Random;
      // 9b: invokevirtual java/util/Random.nextFloat ()F
      // 9e: fadd
      // 9f: fconst_2
      // a0: fmul
      // a1: fstore 18
      // a3: aload 0
      // a4: aload 0
      // a5: getfield cvu.a0f Ljava/util/Random;
      // a8: invokevirtual java/util/Random.nextLong ()J
      // ab: iload 4
      // ad: iload 5
      // af: aload 6
      // b1: dload 8
      // b3: dload 10
      // b5: dload 12
      // b7: fload 18
      // b9: fload 16
      // bb: fload 17
      // bd: bipush 0
      // be: bipush 0
      // bf: ldc2_w 3.0
      // c2: invokevirtual cvu.ljs (JIILlno;DDDFFFIID)V
      // c5: iinc 15 1
      // c8: iload 7
      // ca: ifeq 65
      // cd: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
