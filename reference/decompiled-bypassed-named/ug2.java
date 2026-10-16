public class ug2 extends ttt {
   public ug2(long var1, ttt var3) {
      super(var1);
      this.ty5 = var3;
   }

   @Override
   public int[] ub9(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield ug2.ty5 Lttt;
      // 004: iload 1
      // 005: bipush 1
      // 006: isub
      // 007: iload 2
      // 008: bipush 1
      // 009: isub
      // 00a: iload 3
      // 00b: bipush 2
      // 00c: iadd
      // 00d: iload 4
      // 00f: bipush 2
      // 010: iadd
      // 011: invokevirtual ttt.ub9 (IIII)[I
      // 014: astore 6
      // 016: invokestatic OpaquePredicate.c ()I
      // 019: iload 3
      // 01a: iload 4
      // 01c: imul
      // 01d: invokestatic z97.web (I)[I
      // 020: astore 7
      // 022: istore 5
      // 024: bipush 0
      // 025: istore 8
      // 027: iload 8
      // 029: iload 4
      // 02b: if_icmpge 6d9
      // 02e: bipush 0
      // 02f: istore 9
      // 031: iload 9
      // 033: iload 3
      // 034: if_icmpge 6d1
      // 037: aload 0
      // 038: iload 9
      // 03a: iload 1
      // 03b: iadd
      // 03c: i2l
      // 03d: iload 8
      // 03f: iload 2
      // 040: iadd
      // 041: i2l
      // 042: invokevirtual ug2.drx (JJ)V
      // 045: aload 6
      // 047: iload 9
      // 049: bipush 1
      // 04a: iadd
      // 04b: iload 8
      // 04d: bipush 1
      // 04e: iadd
      // 04f: iload 3
      // 050: bipush 2
      // 051: iadd
      // 052: imul
      // 053: iadd
      // 054: iaload
      // 055: istore 10
      // 057: iload 10
      // 059: invokestatic gyu.lxy (I)Lgyu;
      // 05c: astore 11
      // 05e: iload 10
      // 060: iload 5
      // 062: ifne 093
      // 065: getstatic gyu._2p Lgyu;
      // 068: getfield gyu.mu9 I
      // 06b: iload 5
      // 06d: ifne 02b
      // 070: goto 077
      // 073: invokestatic ug2.a (Loov;)Loov;
      // 076: athrow
      // 077: if_icmpne 16a
      // 07a: aload 6
      // 07c: iload 9
      // 07e: bipush 1
      // 07f: iadd
      // 080: iload 8
      // 082: bipush 1
      // 083: iadd
      // 084: bipush 1
      // 085: isub
      // 086: iload 3
      // 087: bipush 2
      // 088: iadd
      // 089: imul
      // 08a: iadd
      // 08b: iaload
      // 08c: goto 093
      // 08f: invokestatic ug2.a (Loov;)Loov;
      // 092: athrow
      // 093: istore 12
      // 095: aload 6
      // 097: iload 9
      // 099: bipush 1
      // 09a: iadd
      // 09b: bipush 1
      // 09c: iadd
      // 09d: iload 8
      // 09f: bipush 1
      // 0a0: iadd
      // 0a1: iload 3
      // 0a2: bipush 2
      // 0a3: iadd
      // 0a4: imul
      // 0a5: iadd
      // 0a6: iaload
      // 0a7: istore 13
      // 0a9: aload 6
      // 0ab: iload 9
      // 0ad: bipush 1
      // 0ae: iadd
      // 0af: bipush 1
      // 0b0: isub
      // 0b1: iload 8
      // 0b3: bipush 1
      // 0b4: iadd
      // 0b5: iload 3
      // 0b6: bipush 2
      // 0b7: iadd
      // 0b8: imul
      // 0b9: iadd
      // 0ba: iaload
      // 0bb: istore 14
      // 0bd: aload 6
      // 0bf: iload 9
      // 0c1: bipush 1
      // 0c2: iadd
      // 0c3: iload 8
      // 0c5: bipush 1
      // 0c6: iadd
      // 0c7: bipush 1
      // 0c8: iadd
      // 0c9: iload 3
      // 0ca: bipush 2
      // 0cb: iadd
      // 0cc: imul
      // 0cd: iadd
      // 0ce: iaload
      // 0cf: istore 15
      // 0d1: iload 12
      // 0d3: getstatic gyu.jzy Lgyu;
      // 0d6: getfield gyu.mu9 I
      // 0d9: iload 5
      // 0db: ifne 0f7
      // 0de: if_icmpeq 14e
      // 0e1: goto 0e8
      // 0e4: invokestatic ug2.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: iload 13
      // 0ea: getstatic gyu.jzy Lgyu;
      // 0ed: getfield gyu.mu9 I
      // 0f0: goto 0f7
      // 0f3: invokestatic ug2.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: iload 5
      // 0f9: ifne 115
      // 0fc: if_icmpeq 14e
      // 0ff: goto 106
      // 102: invokestatic ug2.a (Loov;)Loov;
      // 105: athrow
      // 106: iload 14
      // 108: getstatic gyu.jzy Lgyu;
      // 10b: getfield gyu.mu9 I
      // 10e: goto 115
      // 111: invokestatic ug2.a (Loov;)Loov;
      // 114: athrow
      // 115: iload 5
      // 117: ifne 133
      // 11a: if_icmpeq 14e
      // 11d: goto 124
      // 120: invokestatic ug2.a (Loov;)Loov;
      // 123: athrow
      // 124: iload 15
      // 126: getstatic gyu.jzy Lgyu;
      // 129: getfield gyu.mu9 I
      // 12c: goto 133
      // 12f: invokestatic ug2.a (Loov;)Loov;
      // 132: athrow
      // 133: if_icmpeq 14e
      // 136: aload 7
      // 138: iload 9
      // 13a: iload 8
      // 13c: iload 3
      // 13d: imul
      // 13e: iadd
      // 13f: iload 10
      // 141: iastore
      // 142: iload 5
      // 144: ifeq 165
      // 147: goto 14e
      // 14a: invokestatic ug2.a (Loov;)Loov;
      // 14d: athrow
      // 14e: aload 7
      // 150: iload 9
      // 152: iload 8
      // 154: iload 3
      // 155: imul
      // 156: iadd
      // 157: getstatic gyu.mcb Lgyu;
      // 15a: getfield gyu.mu9 I
      // 15d: iastore
      // 15e: goto 165
      // 161: invokestatic ug2.a (Loov;)Loov;
      // 164: athrow
      // 165: iload 5
      // 167: ifeq 6c9
      // 16a: aload 11
      // 16c: iload 5
      // 16e: ifne 184
      // 171: goto 178
      // 174: invokestatic ug2.a (Loov;)Loov;
      // 177: athrow
      // 178: ifnull 2f6
      // 17b: goto 182
      // 17e: invokestatic ug2.a (Loov;)Loov;
      // 181: athrow
      // 182: aload 11
      // 184: invokevirtual gyu.y0m ()Ljava/lang/Class;
      // 187: ldc q41
      // 189: nop
      // 18a: if_acmpne 2f6
      // 18d: aload 6
      // 18f: iload 9
      // 191: bipush 1
      // 192: iadd
      // 193: iload 8
      // 195: bipush 1
      // 196: iadd
      // 197: bipush 1
      // 198: isub
      // 199: iload 3
      // 19a: bipush 2
      // 19b: iadd
      // 19c: imul
      // 19d: iadd
      // 19e: iaload
      // 19f: istore 12
      // 1a1: aload 6
      // 1a3: iload 9
      // 1a5: bipush 1
      // 1a6: iadd
      // 1a7: bipush 1
      // 1a8: iadd
      // 1a9: iload 8
      // 1ab: bipush 1
      // 1ac: iadd
      // 1ad: iload 3
      // 1ae: bipush 2
      // 1af: iadd
      // 1b0: imul
      // 1b1: iadd
      // 1b2: iaload
      // 1b3: istore 13
      // 1b5: aload 6
      // 1b7: iload 9
      // 1b9: bipush 1
      // 1ba: iadd
      // 1bb: bipush 1
      // 1bc: isub
      // 1bd: iload 8
      // 1bf: bipush 1
      // 1c0: iadd
      // 1c1: iload 3
      // 1c2: bipush 2
      // 1c3: iadd
      // 1c4: imul
      // 1c5: iadd
      // 1c6: iaload
      // 1c7: istore 14
      // 1c9: aload 6
      // 1cb: iload 9
      // 1cd: bipush 1
      // 1ce: iadd
      // 1cf: iload 8
      // 1d1: bipush 1
      // 1d2: iadd
      // 1d3: bipush 1
      // 1d4: iadd
      // 1d5: iload 3
      // 1d6: bipush 2
      // 1d7: iadd
      // 1d8: imul
      // 1d9: iadd
      // 1da: iaload
      // 1db: istore 15
      // 1dd: aload 0
      // 1de: iload 12
      // 1e0: invokespecial ug2.x7q (I)Z
      // 1e3: iload 5
      // 1e5: ifne 1ff
      // 1e8: ifeq 2da
      // 1eb: goto 1f2
      // 1ee: invokestatic ug2.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: aload 0
      // 1f3: iload 13
      // 1f5: invokespecial ug2.x7q (I)Z
      // 1f8: goto 1ff
      // 1fb: invokestatic ug2.a (Loov;)Loov;
      // 1fe: athrow
      // 1ff: iload 5
      // 201: ifne 21b
      // 204: ifeq 2da
      // 207: goto 20e
      // 20a: invokestatic ug2.a (Loov;)Loov;
      // 20d: athrow
      // 20e: aload 0
      // 20f: iload 14
      // 211: invokespecial ug2.x7q (I)Z
      // 214: goto 21b
      // 217: invokestatic ug2.a (Loov;)Loov;
      // 21a: athrow
      // 21b: iload 5
      // 21d: ifne 237
      // 220: ifeq 2da
      // 223: goto 22a
      // 226: invokestatic ug2.a (Loov;)Loov;
      // 229: athrow
      // 22a: aload 0
      // 22b: iload 15
      // 22d: invokespecial ug2.x7q (I)Z
      // 230: goto 237
      // 233: invokestatic ug2.a (Loov;)Loov;
      // 236: athrow
      // 237: iload 5
      // 239: ifne 252
      // 23c: ifeq 2da
      // 23f: goto 246
      // 242: invokestatic ug2.a (Loov;)Loov;
      // 245: athrow
      // 246: iload 12
      // 248: invokestatic ug2.bj_ (I)Z
      // 24b: goto 252
      // 24e: invokestatic ug2.a (Loov;)Loov;
      // 251: athrow
      // 252: iload 5
      // 254: ifne 26d
      // 257: ifne 2be
      // 25a: goto 261
      // 25d: invokestatic ug2.a (Loov;)Loov;
      // 260: athrow
      // 261: iload 13
      // 263: invokestatic ug2.bj_ (I)Z
      // 266: goto 26d
      // 269: invokestatic ug2.a (Loov;)Loov;
      // 26c: athrow
      // 26d: iload 5
      // 26f: ifne 288
      // 272: ifne 2be
      // 275: goto 27c
      // 278: invokestatic ug2.a (Loov;)Loov;
      // 27b: athrow
      // 27c: iload 14
      // 27e: invokestatic ug2.bj_ (I)Z
      // 281: goto 288
      // 284: invokestatic ug2.a (Loov;)Loov;
      // 287: athrow
      // 288: iload 5
      // 28a: ifne 2a3
      // 28d: ifne 2be
      // 290: goto 297
      // 293: invokestatic ug2.a (Loov;)Loov;
      // 296: athrow
      // 297: iload 15
      // 299: invokestatic ug2.bj_ (I)Z
      // 29c: goto 2a3
      // 29f: invokestatic ug2.a (Loov;)Loov;
      // 2a2: athrow
      // 2a3: ifne 2be
      // 2a6: aload 7
      // 2a8: iload 9
      // 2aa: iload 8
      // 2ac: iload 3
      // 2ad: imul
      // 2ae: iadd
      // 2af: iload 10
      // 2b1: iastore
      // 2b2: iload 5
      // 2b4: ifeq 2f1
      // 2b7: goto 2be
      // 2ba: invokestatic ug2.a (Loov;)Loov;
      // 2bd: athrow
      // 2be: aload 7
      // 2c0: iload 9
      // 2c2: iload 8
      // 2c4: iload 3
      // 2c5: imul
      // 2c6: iadd
      // 2c7: getstatic gyu.uu8 Lgyu;
      // 2ca: getfield gyu.mu9 I
      // 2cd: iastore
      // 2ce: iload 5
      // 2d0: ifeq 2f1
      // 2d3: goto 2da
      // 2d6: invokestatic ug2.a (Loov;)Loov;
      // 2d9: athrow
      // 2da: aload 7
      // 2dc: iload 9
      // 2de: iload 8
      // 2e0: iload 3
      // 2e1: imul
      // 2e2: iadd
      // 2e3: getstatic gyu.cwq Lgyu;
      // 2e6: getfield gyu.mu9 I
      // 2e9: iastore
      // 2ea: goto 2f1
      // 2ed: invokestatic ug2.a (Loov;)Loov;
      // 2f0: athrow
      // 2f1: iload 5
      // 2f3: ifeq 6c9
      // 2f6: iload 10
      // 2f8: getstatic gyu.uuo Lgyu;
      // 2fb: getfield gyu.mu9 I
      // 2fe: iload 5
      // 300: ifne 323
      // 303: goto 30a
      // 306: invokestatic ug2.a (Loov;)Loov;
      // 309: athrow
      // 30a: if_icmpeq 6ad
      // 30d: goto 314
      // 310: invokestatic ug2.a (Loov;)Loov;
      // 313: athrow
      // 314: iload 10
      // 316: getstatic gyu.ske Lgyu;
      // 319: getfield gyu.mu9 I
      // 31c: goto 323
      // 31f: invokestatic ug2.a (Loov;)Loov;
      // 322: athrow
      // 323: iload 5
      // 325: ifne 341
      // 328: if_icmpeq 6ad
      // 32b: goto 332
      // 32e: invokestatic ug2.a (Loov;)Loov;
      // 331: athrow
      // 332: iload 10
      // 334: getstatic gyu.ew9 Lgyu;
      // 337: getfield gyu.mu9 I
      // 33a: goto 341
      // 33d: invokestatic ug2.a (Loov;)Loov;
      // 340: athrow
      // 341: if_icmpeq 6ad
      // 344: aload 11
      // 346: iload 5
      // 348: ifne 35e
      // 34b: goto 352
      // 34e: invokestatic ug2.a (Loov;)Loov;
      // 351: athrow
      // 352: ifnull 391
      // 355: goto 35c
      // 358: invokestatic ug2.a (Loov;)Loov;
      // 35b: athrow
      // 35c: aload 11
      // 35e: invokevirtual gyu.qht ()Z
      // 361: iload 5
      // 363: ifne 39a
      // 366: ifeq 391
      // 369: goto 370
      // 36c: invokestatic ug2.a (Loov;)Loov;
      // 36f: athrow
      // 370: aload 0
      // 371: aload 6
      // 373: aload 7
      // 375: iload 9
      // 377: iload 8
      // 379: iload 3
      // 37a: iload 10
      // 37c: getstatic gyu.edc Lgyu;
      // 37f: getfield gyu.mu9 I
      // 382: invokespecial ug2.nmx ([I[IIIIII)V
      // 385: iload 5
      // 387: ifeq 6c9
      // 38a: goto 391
      // 38d: invokestatic ug2.a (Loov;)Loov;
      // 390: athrow
      // 391: iload 10
      // 393: goto 39a
      // 396: invokestatic ug2.a (Loov;)Loov;
      // 399: athrow
      // 39a: iload 5
      // 39c: ifne 55a
      // 39f: getstatic gyu.cro Lgyu;
      // 3a2: getfield gyu.mu9 I
      // 3a5: if_icmpeq 541
      // 3a8: goto 3af
      // 3ab: invokestatic ug2.a (Loov;)Loov;
      // 3ae: athrow
      // 3af: iload 10
      // 3b1: iload 5
      // 3b3: ifne 55a
      // 3b6: goto 3bd
      // 3b9: invokestatic ug2.a (Loov;)Loov;
      // 3bc: athrow
      // 3bd: getstatic gyu.q2z Lgyu;
      // 3c0: getfield gyu.mu9 I
      // 3c3: if_icmpeq 541
      // 3c6: goto 3cd
      // 3c9: invokestatic ug2.a (Loov;)Loov;
      // 3cc: athrow
      // 3cd: iload 10
      // 3cf: getstatic gyu.jzy Lgyu;
      // 3d2: getfield gyu.mu9 I
      // 3d5: iload 5
      // 3d7: ifne 3fa
      // 3da: goto 3e1
      // 3dd: invokestatic ug2.a (Loov;)Loov;
      // 3e0: athrow
      // 3e1: if_icmpeq 529
      // 3e4: goto 3eb
      // 3e7: invokestatic ug2.a (Loov;)Loov;
      // 3ea: athrow
      // 3eb: iload 10
      // 3ed: getstatic gyu.knf Lgyu;
      // 3f0: getfield gyu.mu9 I
      // 3f3: goto 3fa
      // 3f6: invokestatic ug2.a (Loov;)Loov;
      // 3f9: athrow
      // 3fa: iload 5
      // 3fc: ifne 418
      // 3ff: if_icmpeq 529
      // 402: goto 409
      // 405: invokestatic ug2.a (Loov;)Loov;
      // 408: athrow
      // 409: iload 10
      // 40b: getstatic gyu.sgl Lgyu;
      // 40e: getfield gyu.mu9 I
      // 411: goto 418
      // 414: invokestatic ug2.a (Loov;)Loov;
      // 417: athrow
      // 418: iload 5
      // 41a: ifne 442
      // 41d: if_icmpeq 529
      // 420: goto 427
      // 423: invokestatic ug2.a (Loov;)Loov;
      // 426: athrow
      // 427: iload 10
      // 429: iload 5
      // 42b: ifne 45e
      // 42e: goto 435
      // 431: invokestatic ug2.a (Loov;)Loov;
      // 434: athrow
      // 435: getstatic gyu.bpg Lgyu;
      // 438: getfield gyu.mu9 I
      // 43b: goto 442
      // 43e: invokestatic ug2.a (Loov;)Loov;
      // 441: athrow
      // 442: if_icmpeq 529
      // 445: aload 6
      // 447: iload 9
      // 449: bipush 1
      // 44a: iadd
      // 44b: iload 8
      // 44d: bipush 1
      // 44e: iadd
      // 44f: bipush 1
      // 450: isub
      // 451: iload 3
      // 452: bipush 2
      // 453: iadd
      // 454: imul
      // 455: iadd
      // 456: iaload
      // 457: goto 45e
      // 45a: invokestatic ug2.a (Loov;)Loov;
      // 45d: athrow
      // 45e: istore 12
      // 460: aload 6
      // 462: iload 9
      // 464: bipush 1
      // 465: iadd
      // 466: bipush 1
      // 467: iadd
      // 468: iload 8
      // 46a: bipush 1
      // 46b: iadd
      // 46c: iload 3
      // 46d: bipush 2
      // 46e: iadd
      // 46f: imul
      // 470: iadd
      // 471: iaload
      // 472: istore 13
      // 474: aload 6
      // 476: iload 9
      // 478: bipush 1
      // 479: iadd
      // 47a: bipush 1
      // 47b: isub
      // 47c: iload 8
      // 47e: bipush 1
      // 47f: iadd
      // 480: iload 3
      // 481: bipush 2
      // 482: iadd
      // 483: imul
      // 484: iadd
      // 485: iaload
      // 486: istore 14
      // 488: aload 6
      // 48a: iload 9
      // 48c: bipush 1
      // 48d: iadd
      // 48e: iload 8
      // 490: bipush 1
      // 491: iadd
      // 492: bipush 1
      // 493: iadd
      // 494: iload 3
      // 495: bipush 2
      // 496: iadd
      // 497: imul
      // 498: iadd
      // 499: iaload
      // 49a: istore 15
      // 49c: iload 12
      // 49e: invokestatic ug2.bj_ (I)Z
      // 4a1: iload 5
      // 4a3: ifne 4bc
      // 4a6: ifne 50d
      // 4a9: goto 4b0
      // 4ac: invokestatic ug2.a (Loov;)Loov;
      // 4af: athrow
      // 4b0: iload 13
      // 4b2: invokestatic ug2.bj_ (I)Z
      // 4b5: goto 4bc
      // 4b8: invokestatic ug2.a (Loov;)Loov;
      // 4bb: athrow
      // 4bc: iload 5
      // 4be: ifne 4d7
      // 4c1: ifne 50d
      // 4c4: goto 4cb
      // 4c7: invokestatic ug2.a (Loov;)Loov;
      // 4ca: athrow
      // 4cb: iload 14
      // 4cd: invokestatic ug2.bj_ (I)Z
      // 4d0: goto 4d7
      // 4d3: invokestatic ug2.a (Loov;)Loov;
      // 4d6: athrow
      // 4d7: iload 5
      // 4d9: ifne 4f2
      // 4dc: ifne 50d
      // 4df: goto 4e6
      // 4e2: invokestatic ug2.a (Loov;)Loov;
      // 4e5: athrow
      // 4e6: iload 15
      // 4e8: invokestatic ug2.bj_ (I)Z
      // 4eb: goto 4f2
      // 4ee: invokestatic ug2.a (Loov;)Loov;
      // 4f1: athrow
      // 4f2: ifne 50d
      // 4f5: aload 7
      // 4f7: iload 9
      // 4f9: iload 8
      // 4fb: iload 3
      // 4fc: imul
      // 4fd: iadd
      // 4fe: iload 10
      // 500: iastore
      // 501: iload 5
      // 503: ifeq 524
      // 506: goto 50d
      // 509: invokestatic ug2.a (Loov;)Loov;
      // 50c: athrow
      // 50d: aload 7
      // 50f: iload 9
      // 511: iload 8
      // 513: iload 3
      // 514: imul
      // 515: iadd
      // 516: getstatic gyu.uu8 Lgyu;
      // 519: getfield gyu.mu9 I
      // 51c: iastore
      // 51d: goto 524
      // 520: invokestatic ug2.a (Loov;)Loov;
      // 523: athrow
      // 524: iload 5
      // 526: ifeq 6c9
      // 529: aload 7
      // 52b: iload 9
      // 52d: iload 8
      // 52f: iload 3
      // 530: imul
      // 531: iadd
      // 532: iload 10
      // 534: iastore
      // 535: iload 5
      // 537: ifeq 6c9
      // 53a: goto 541
      // 53d: invokestatic ug2.a (Loov;)Loov;
      // 540: athrow
      // 541: aload 6
      // 543: iload 9
      // 545: bipush 1
      // 546: iadd
      // 547: iload 8
      // 549: bipush 1
      // 54a: iadd
      // 54b: bipush 1
      // 54c: isub
      // 54d: iload 3
      // 54e: bipush 2
      // 54f: iadd
      // 550: imul
      // 551: iadd
      // 552: iaload
      // 553: goto 55a
      // 556: invokestatic ug2.a (Loov;)Loov;
      // 559: athrow
      // 55a: istore 12
      // 55c: aload 6
      // 55e: iload 9
      // 560: bipush 1
      // 561: iadd
      // 562: bipush 1
      // 563: iadd
      // 564: iload 8
      // 566: bipush 1
      // 567: iadd
      // 568: iload 3
      // 569: bipush 2
      // 56a: iadd
      // 56b: imul
      // 56c: iadd
      // 56d: iaload
      // 56e: istore 13
      // 570: aload 6
      // 572: iload 9
      // 574: bipush 1
      // 575: iadd
      // 576: bipush 1
      // 577: isub
      // 578: iload 8
      // 57a: bipush 1
      // 57b: iadd
      // 57c: iload 3
      // 57d: bipush 2
      // 57e: iadd
      // 57f: imul
      // 580: iadd
      // 581: iaload
      // 582: istore 14
      // 584: aload 6
      // 586: iload 9
      // 588: bipush 1
      // 589: iadd
      // 58a: iload 8
      // 58c: bipush 1
      // 58d: iadd
      // 58e: bipush 1
      // 58f: iadd
      // 590: iload 3
      // 591: bipush 2
      // 592: iadd
      // 593: imul
      // 594: iadd
      // 595: iaload
      // 596: istore 15
      // 598: iload 12
      // 59a: invokestatic ug2.bj_ (I)Z
      // 59d: iload 5
      // 59f: ifne 5b8
      // 5a2: ifne 695
      // 5a5: goto 5ac
      // 5a8: invokestatic ug2.a (Loov;)Loov;
      // 5ab: athrow
      // 5ac: iload 13
      // 5ae: invokestatic ug2.bj_ (I)Z
      // 5b1: goto 5b8
      // 5b4: invokestatic ug2.a (Loov;)Loov;
      // 5b7: athrow
      // 5b8: iload 5
      // 5ba: ifne 5d3
      // 5bd: ifne 695
      // 5c0: goto 5c7
      // 5c3: invokestatic ug2.a (Loov;)Loov;
      // 5c6: athrow
      // 5c7: iload 14
      // 5c9: invokestatic ug2.bj_ (I)Z
      // 5cc: goto 5d3
      // 5cf: invokestatic ug2.a (Loov;)Loov;
      // 5d2: athrow
      // 5d3: iload 5
      // 5d5: ifne 5ee
      // 5d8: ifne 695
      // 5db: goto 5e2
      // 5de: invokestatic ug2.a (Loov;)Loov;
      // 5e1: athrow
      // 5e2: iload 15
      // 5e4: invokestatic ug2.bj_ (I)Z
      // 5e7: goto 5ee
      // 5ea: invokestatic ug2.a (Loov;)Loov;
      // 5ed: athrow
      // 5ee: iload 5
      // 5f0: ifne 60a
      // 5f3: ifne 695
      // 5f6: goto 5fd
      // 5f9: invokestatic ug2.a (Loov;)Loov;
      // 5fc: athrow
      // 5fd: aload 0
      // 5fe: iload 12
      // 600: invokespecial ug2._ci (I)Z
      // 603: goto 60a
      // 606: invokestatic ug2.a (Loov;)Loov;
      // 609: athrow
      // 60a: iload 5
      // 60c: ifne 626
      // 60f: ifeq 679
      // 612: goto 619
      // 615: invokestatic ug2.a (Loov;)Loov;
      // 618: athrow
      // 619: aload 0
      // 61a: iload 13
      // 61c: invokespecial ug2._ci (I)Z
      // 61f: goto 626
      // 622: invokestatic ug2.a (Loov;)Loov;
      // 625: athrow
      // 626: iload 5
      // 628: ifne 642
      // 62b: ifeq 679
      // 62e: goto 635
      // 631: invokestatic ug2.a (Loov;)Loov;
      // 634: athrow
      // 635: aload 0
      // 636: iload 14
      // 638: invokespecial ug2._ci (I)Z
      // 63b: goto 642
      // 63e: invokestatic ug2.a (Loov;)Loov;
      // 641: athrow
      // 642: iload 5
      // 644: ifne 65e
      // 647: ifeq 679
      // 64a: goto 651
      // 64d: invokestatic ug2.a (Loov;)Loov;
      // 650: athrow
      // 651: aload 0
      // 652: iload 15
      // 654: invokespecial ug2._ci (I)Z
      // 657: goto 65e
      // 65a: invokestatic ug2.a (Loov;)Loov;
      // 65d: athrow
      // 65e: ifeq 679
      // 661: aload 7
      // 663: iload 9
      // 665: iload 8
      // 667: iload 3
      // 668: imul
      // 669: iadd
      // 66a: iload 10
      // 66c: iastore
      // 66d: iload 5
      // 66f: ifeq 6a8
      // 672: goto 679
      // 675: invokestatic ug2.a (Loov;)Loov;
      // 678: athrow
      // 679: aload 7
      // 67b: iload 9
      // 67d: iload 8
      // 67f: iload 3
      // 680: imul
      // 681: iadd
      // 682: getstatic gyu._cz Lgyu;
      // 685: getfield gyu.mu9 I
      // 688: iastore
      // 689: iload 5
      // 68b: ifeq 6a8
      // 68e: goto 695
      // 691: invokestatic ug2.a (Loov;)Loov;
      // 694: athrow
      // 695: aload 7
      // 697: iload 9
      // 699: iload 8
      // 69b: iload 3
      // 69c: imul
      // 69d: iadd
      // 69e: iload 10
      // 6a0: iastore
      // 6a1: goto 6a8
      // 6a4: invokestatic ug2.a (Loov;)Loov;
      // 6a7: athrow
      // 6a8: iload 5
      // 6aa: ifeq 6c9
      // 6ad: aload 0
      // 6ae: aload 6
      // 6b0: aload 7
      // 6b2: iload 9
      // 6b4: iload 8
      // 6b6: iload 3
      // 6b7: iload 10
      // 6b9: getstatic gyu.b15 Lgyu;
      // 6bc: getfield gyu.mu9 I
      // 6bf: invokespecial ug2.nmx ([I[IIIIII)V
      // 6c2: goto 6c9
      // 6c5: invokestatic ug2.a (Loov;)Loov;
      // 6c8: athrow
      // 6c9: iinc 9 1
      // 6cc: iload 5
      // 6ce: ifeq 031
      // 6d1: iinc 8 1
      // 6d4: iload 5
      // 6d6: ifeq 027
      // 6d9: aload 7
      // 6db: areturn
   }

   private void nmx(int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 8
      // 005: iload 6
      // 007: invokestatic ug2.bj_ (I)Z
      // 00a: iload 8
      // 00c: ifne 048
      // 00f: ifeq 030
      // 012: goto 019
      // 015: invokestatic ug2.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 2
      // 01a: iload 3
      // 01b: iload 4
      // 01d: iload 5
      // 01f: imul
      // 020: iadd
      // 021: iload 6
      // 023: iastore
      // 024: iload 8
      // 026: ifeq 105
      // 029: goto 030
      // 02c: invokestatic ug2.a (Loov;)Loov;
      // 02f: athrow
      // 030: aload 1
      // 031: iload 3
      // 032: bipush 1
      // 033: iadd
      // 034: iload 4
      // 036: bipush 1
      // 037: iadd
      // 038: bipush 1
      // 039: isub
      // 03a: iload 5
      // 03c: bipush 2
      // 03d: iadd
      // 03e: imul
      // 03f: iadd
      // 040: iaload
      // 041: goto 048
      // 044: invokestatic ug2.a (Loov;)Loov;
      // 047: athrow
      // 048: istore 9
      // 04a: aload 1
      // 04b: iload 3
      // 04c: bipush 1
      // 04d: iadd
      // 04e: bipush 1
      // 04f: iadd
      // 050: iload 4
      // 052: bipush 1
      // 053: iadd
      // 054: iload 5
      // 056: bipush 2
      // 057: iadd
      // 058: imul
      // 059: iadd
      // 05a: iaload
      // 05b: istore 10
      // 05d: aload 1
      // 05e: iload 3
      // 05f: bipush 1
      // 060: iadd
      // 061: bipush 1
      // 062: isub
      // 063: iload 4
      // 065: bipush 1
      // 066: iadd
      // 067: iload 5
      // 069: bipush 2
      // 06a: iadd
      // 06b: imul
      // 06c: iadd
      // 06d: iaload
      // 06e: istore 11
      // 070: aload 1
      // 071: iload 3
      // 072: bipush 1
      // 073: iadd
      // 074: iload 4
      // 076: bipush 1
      // 077: iadd
      // 078: bipush 1
      // 079: iadd
      // 07a: iload 5
      // 07c: bipush 2
      // 07d: iadd
      // 07e: imul
      // 07f: iadd
      // 080: iaload
      // 081: istore 12
      // 083: iload 9
      // 085: invokestatic ug2.bj_ (I)Z
      // 088: iload 8
      // 08a: ifne 0a3
      // 08d: ifne 0f3
      // 090: goto 097
      // 093: invokestatic ug2.a (Loov;)Loov;
      // 096: athrow
      // 097: iload 10
      // 099: invokestatic ug2.bj_ (I)Z
      // 09c: goto 0a3
      // 09f: invokestatic ug2.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: iload 8
      // 0a5: ifne 0be
      // 0a8: ifne 0f3
      // 0ab: goto 0b2
      // 0ae: invokestatic ug2.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: iload 11
      // 0b4: invokestatic ug2.bj_ (I)Z
      // 0b7: goto 0be
      // 0ba: invokestatic ug2.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: iload 8
      // 0c0: ifne 0d9
      // 0c3: ifne 0f3
      // 0c6: goto 0cd
      // 0c9: invokestatic ug2.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: iload 12
      // 0cf: invokestatic ug2.bj_ (I)Z
      // 0d2: goto 0d9
      // 0d5: invokestatic ug2.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: ifne 0f3
      // 0dc: aload 2
      // 0dd: iload 3
      // 0de: iload 4
      // 0e0: iload 5
      // 0e2: imul
      // 0e3: iadd
      // 0e4: iload 6
      // 0e6: iastore
      // 0e7: iload 8
      // 0e9: ifeq 105
      // 0ec: goto 0f3
      // 0ef: invokestatic ug2.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 2
      // 0f4: iload 3
      // 0f5: iload 4
      // 0f7: iload 5
      // 0f9: imul
      // 0fa: iadd
      // 0fb: iload 7
      // 0fd: iastore
      // 0fe: goto 105
      // 101: invokestatic ug2.a (Loov;)Loov;
      // 104: athrow
      // 105: return
   }

   private boolean x7q(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: iload 2
      // 06: ifeq 3e
      // 09: invokestatic gyu.lxy (I)Lgyu;
      // 0c: ifnull 3d
      // 0f: goto 16
      // 12: invokestatic ug2.a (Loov;)Loov;
      // 15: athrow
      // 16: iload 1
      // 17: iload 2
      // 18: ifeq 3e
      // 1b: goto 22
      // 1e: invokestatic ug2.a (Loov;)Loov;
      // 21: athrow
      // 22: invokestatic gyu.lxy (I)Lgyu;
      // 25: invokevirtual gyu.y0m ()Ljava/lang/Class;
      // 28: ldc q41
      // 2a: nop
      // 2b: if_acmpne 3d
      // 2e: goto 35
      // 31: invokestatic ug2.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 1
      // 36: goto e0
      // 39: invokestatic ug2.a (Loov;)Loov;
      // 3c: athrow
      // 3d: iload 1
      // 3e: iload 2
      // 3f: ifeq dc
      // 42: getstatic gyu.cwq Lgyu;
      // 45: getfield gyu.mu9 I
      // 48: if_icmpeq db
      // 4b: goto 52
      // 4e: invokestatic ug2.a (Loov;)Loov;
      // 51: athrow
      // 52: iload 1
      // 53: iload 2
      // 54: ifeq dc
      // 57: goto 5e
      // 5a: invokestatic ug2.a (Loov;)Loov;
      // 5d: athrow
      // 5e: getstatic gyu.bli Lgyu;
      // 61: getfield gyu.mu9 I
      // 64: if_icmpeq db
      // 67: goto 6e
      // 6a: invokestatic ug2.a (Loov;)Loov;
      // 6d: athrow
      // 6e: iload 1
      // 6f: iload 2
      // 70: ifeq dc
      // 73: goto 7a
      // 76: invokestatic ug2.a (Loov;)Loov;
      // 79: athrow
      // 7a: getstatic gyu.tlt Lgyu;
      // 7d: getfield gyu.mu9 I
      // 80: if_icmpeq db
      // 83: goto 8a
      // 86: invokestatic ug2.a (Loov;)Loov;
      // 89: athrow
      // 8a: iload 1
      // 8b: iload 2
      // 8c: ifeq dc
      // 8f: goto 96
      // 92: invokestatic ug2.a (Loov;)Loov;
      // 95: athrow
      // 96: getstatic gyu.yo0 Lgyu;
      // 99: getfield gyu.mu9 I
      // 9c: if_icmpeq db
      // 9f: goto a6
      // a2: invokestatic ug2.a (Loov;)Loov;
      // a5: athrow
      // a6: iload 1
      // a7: iload 2
      // a8: ifeq dc
      // ab: goto b2
      // ae: invokestatic ug2.a (Loov;)Loov;
      // b1: athrow
      // b2: getstatic gyu.u3o Lgyu;
      // b5: getfield gyu.mu9 I
      // b8: if_icmpeq db
      // bb: goto c2
      // be: invokestatic ug2.a (Loov;)Loov;
      // c1: athrow
      // c2: iload 1
      // c3: invokestatic ug2.bj_ (I)Z
      // c6: iload 2
      // c7: ifeq dc
      // ca: goto d1
      // cd: invokestatic ug2.a (Loov;)Loov;
      // d0: athrow
      // d1: ifeq df
      // d4: goto db
      // d7: invokestatic ug2.a (Loov;)Loov;
      // da: athrow
      // db: bipush 1
      // dc: goto e0
      // df: bipush 0
      // e0: ireturn
   }

   private boolean _ci(int var1) {
      return gyu.lxy(var1) instanceof fqj;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
