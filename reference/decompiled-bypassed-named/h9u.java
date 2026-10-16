public class h9u extends uk2 {
   public void l6c(long var1, int var3, int var4, lno var5, double var6, double var8, double var10) {
      this.jt0(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.a0f.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5);
   }

   public void jt0(
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
      // 000: iload 3
      // 001: bipush 16
      // 003: imul
      // 004: bipush 8
      // 006: iadd
      // 007: i2d
      // 008: dstore 20
      // 00a: iload 4
      // 00c: bipush 16
      // 00e: imul
      // 00f: bipush 8
      // 011: iadd
      // 012: i2d
      // 013: dstore 22
      // 015: fconst_0
      // 016: fstore 24
      // 018: invokestatic OpaquePredicate.c ()I
      // 01b: fconst_0
      // 01c: fstore 25
      // 01e: new java/util/Random
      // 021: dup
      // 022: lload 1
      // 023: invokespecial java/util/Random.<init> (J)V
      // 026: astore 26
      // 028: istore 19
      // 02a: iload 16
      // 02c: iload 19
      // 02e: ifne 056
      // 031: ifgt 055
      // 034: goto 03b
      // 037: invokestatic h9u.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield h9u.oa6 I
      // 03f: bipush 16
      // 041: imul
      // 042: bipush 16
      // 044: isub
      // 045: istore 27
      // 047: iload 27
      // 049: aload 26
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
      // 05d: ifne 080
      // 060: if_icmpne 073
      // 063: goto 06a
      // 066: invokestatic h9u.a (Loov;)Loov;
      // 069: athrow
      // 06a: iload 16
      // 06c: bipush 2
      // 06d: idiv
      // 06e: istore 15
      // 070: bipush 1
      // 071: istore 27
      // 073: aload 26
      // 075: iload 16
      // 077: bipush 2
      // 078: idiv
      // 079: invokevirtual java/util/Random.nextInt (I)I
      // 07c: iload 16
      // 07e: bipush 4
      // 07f: idiv
      // 080: iadd
      // 081: istore 28
      // 083: aload 26
      // 085: bipush 6
      // 087: invokevirtual java/util/Random.nextInt (I)I
      // 08a: iload 19
      // 08c: ifne 09a
      // 08f: ifne 09d
      // 092: goto 099
      // 095: invokestatic h9u.a (Loov;)Loov;
      // 098: athrow
      // 099: bipush 1
      // 09a: goto 09e
      // 09d: bipush 0
      // 09e: istore 29
      // 0a0: iload 15
      // 0a2: iload 16
      // 0a4: if_icmpge 7f7
      // 0a7: ldc2_w 1.5
      // 0aa: iload 15
      // 0ac: i2f
      // 0ad: ldc 3.1415927
      // 0af: nop
      // 0b0: fmul
      // 0b1: iload 16
      // 0b3: i2f
      // 0b4: fdiv
      // 0b5: invokestatic fe6.rtn (F)F
      // 0b8: fload 12
      // 0ba: fmul
      // 0bb: fconst_1
      // 0bc: fmul
      // 0bd: f2d
      // 0be: dadd
      // 0bf: dstore 30
      // 0c1: dload 30
      // 0c3: dload 17
      // 0c5: dmul
      // 0c6: dstore 32
      // 0c8: fload 14
      // 0ca: invokestatic fe6.ssk (F)F
      // 0cd: fstore 34
      // 0cf: fload 14
      // 0d1: invokestatic fe6.rtn (F)F
      // 0d4: fstore 35
      // 0d6: dload 6
      // 0d8: fload 13
      // 0da: invokestatic fe6.ssk (F)F
      // 0dd: fload 34
      // 0df: fmul
      // 0e0: f2d
      // 0e1: dadd
      // 0e2: dstore 6
      // 0e4: dload 8
      // 0e6: fload 35
      // 0e8: f2d
      // 0e9: dadd
      // 0ea: dstore 8
      // 0ec: dload 10
      // 0ee: fload 13
      // 0f0: invokestatic fe6.rtn (F)F
      // 0f3: fload 34
      // 0f5: fmul
      // 0f6: f2d
      // 0f7: dadd
      // 0f8: dstore 10
      // 0fa: iload 19
      // 0fc: ifne 113
      // 0ff: iload 29
      // 101: ifeq 118
      // 104: goto 10b
      // 107: invokestatic h9u.a (Loov;)Loov;
      // 10a: athrow
      // 10b: fload 14
      // 10d: ldc 0.92
      // 10f: nop
      // 110: fmul
      // 111: fstore 14
      // 113: iload 19
      // 115: ifeq 120
      // 118: fload 14
      // 11a: ldc 0.7
      // 11c: nop
      // 11d: fmul
      // 11e: fstore 14
      // 120: fload 14
      // 122: fload 25
      // 124: ldc 0.1
      // 126: nop
      // 127: fmul
      // 128: fadd
      // 129: fstore 14
      // 12b: fload 13
      // 12d: fload 24
      // 12f: ldc 0.1
      // 131: nop
      // 132: fmul
      // 133: fadd
      // 134: fstore 13
      // 136: fload 25
      // 138: ldc 0.9
      // 13a: nop
      // 13b: fmul
      // 13c: fstore 25
      // 13e: fload 24
      // 140: ldc 0.75
      // 142: nop
      // 143: fmul
      // 144: fstore 24
      // 146: fload 25
      // 148: aload 26
      // 14a: invokevirtual java/util/Random.nextFloat ()F
      // 14d: aload 26
      // 14f: invokevirtual java/util/Random.nextFloat ()F
      // 152: fsub
      // 153: aload 26
      // 155: invokevirtual java/util/Random.nextFloat ()F
      // 158: fmul
      // 159: fconst_2
      // 15a: fmul
      // 15b: fadd
      // 15c: fstore 25
      // 15e: fload 24
      // 160: aload 26
      // 162: invokevirtual java/util/Random.nextFloat ()F
      // 165: aload 26
      // 167: invokevirtual java/util/Random.nextFloat ()F
      // 16a: fsub
      // 16b: aload 26
      // 16d: invokevirtual java/util/Random.nextFloat ()F
      // 170: fmul
      // 171: ldc 4.0
      // 173: nop
      // 174: fmul
      // 175: fadd
      // 176: fstore 24
      // 178: iload 27
      // 17a: iload 19
      // 17c: ifne 240
      // 17f: ifne 23e
      // 182: goto 189
      // 185: invokestatic h9u.a (Loov;)Loov;
      // 188: athrow
      // 189: iload 15
      // 18b: iload 19
      // 18d: ifne 240
      // 190: goto 197
      // 193: invokestatic h9u.a (Loov;)Loov;
      // 196: athrow
      // 197: iload 28
      // 199: if_icmpne 23e
      // 19c: goto 1a3
      // 19f: invokestatic h9u.a (Loov;)Loov;
      // 1a2: athrow
      // 1a3: fload 12
      // 1a5: fconst_1
      // 1a6: fcmpl
      // 1a7: iload 19
      // 1a9: ifne 240
      // 1ac: goto 1b3
      // 1af: invokestatic h9u.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: ifle 23e
      // 1b6: goto 1bd
      // 1b9: invokestatic h9u.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: iload 16
      // 1bf: iload 19
      // 1c1: ifne 240
      // 1c4: goto 1cb
      // 1c7: invokestatic h9u.a (Loov;)Loov;
      // 1ca: athrow
      // 1cb: ifle 23e
      // 1ce: goto 1d5
      // 1d1: invokestatic h9u.a (Loov;)Loov;
      // 1d4: athrow
      // 1d5: aload 0
      // 1d6: aload 26
      // 1d8: invokevirtual java/util/Random.nextLong ()J
      // 1db: iload 3
      // 1dc: iload 4
      // 1de: aload 5
      // 1e0: dload 6
      // 1e2: dload 8
      // 1e4: dload 10
      // 1e6: aload 26
      // 1e8: invokevirtual java/util/Random.nextFloat ()F
      // 1eb: ldc 0.5
      // 1ed: nop
      // 1ee: fmul
      // 1ef: ldc 0.5
      // 1f1: nop
      // 1f2: fadd
      // 1f3: fload 13
      // 1f5: ldc 1.5707964
      // 1f7: nop
      // 1f8: fsub
      // 1f9: fload 14
      // 1fb: ldc 3.0
      // 1fd: nop
      // 1fe: fdiv
      // 1ff: iload 15
      // 201: iload 16
      // 203: dconst_1
      // 204: invokevirtual h9u.jt0 (JIILlno;DDDFFFIID)V
      // 207: aload 0
      // 208: aload 26
      // 20a: invokevirtual java/util/Random.nextLong ()J
      // 20d: iload 3
      // 20e: iload 4
      // 210: aload 5
      // 212: dload 6
      // 214: dload 8
      // 216: dload 10
      // 218: aload 26
      // 21a: invokevirtual java/util/Random.nextFloat ()F
      // 21d: ldc 0.5
      // 21f: nop
      // 220: fmul
      // 221: ldc 0.5
      // 223: nop
      // 224: fadd
      // 225: fload 13
      // 227: ldc 1.5707964
      // 229: nop
      // 22a: fadd
      // 22b: fload 14
      // 22d: ldc 3.0
      // 22f: nop
      // 230: fdiv
      // 231: iload 15
      // 233: iload 16
      // 235: dconst_1
      // 236: invokevirtual h9u.jt0 (JIILlno;DDDFFFIID)V
      // 239: return
      // 23a: invokestatic h9u.a (Loov;)Loov;
      // 23d: athrow
      // 23e: iload 27
      // 240: iload 19
      // 242: ifne 25c
      // 245: ifne 25f
      // 248: goto 24f
      // 24b: invokestatic h9u.a (Loov;)Loov;
      // 24e: athrow
      // 24f: aload 26
      // 251: bipush 4
      // 252: invokevirtual java/util/Random.nextInt (I)I
      // 255: goto 25c
      // 258: invokestatic h9u.a (Loov;)Loov;
      // 25b: athrow
      // 25c: ifeq 7ef
      // 25f: dload 6
      // 261: dload 20
      // 263: dsub
      // 264: dstore 36
      // 266: dload 10
      // 268: dload 22
      // 26a: dsub
      // 26b: dstore 38
      // 26d: iload 16
      // 26f: iload 15
      // 271: isub
      // 272: i2d
      // 273: dstore 40
      // 275: fload 12
      // 277: fconst_2
      // 278: fadd
      // 279: ldc 16.0
      // 27b: nop
      // 27c: fadd
      // 27d: f2d
      // 27e: dstore 42
      // 280: dload 36
      // 282: dload 36
      // 284: dmul
      // 285: dload 38
      // 287: dload 38
      // 289: dmul
      // 28a: dadd
      // 28b: dload 40
      // 28d: dload 40
      // 28f: dmul
      // 290: dsub
      // 291: dload 42
      // 293: dload 42
      // 295: dmul
      // 296: dcmpl
      // 297: iload 19
      // 299: ifne 2b7
      // 29c: ifle 2a7
      // 29f: goto 2a6
      // 2a2: invokestatic h9u.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: return
      // 2a7: dload 6
      // 2a9: dload 20
      // 2ab: ldc2_w 16.0
      // 2ae: dsub
      // 2af: dload 30
      // 2b1: ldc2_w 2.0
      // 2b4: dmul
      // 2b5: dsub
      // 2b6: dcmpl
      // 2b7: iload 19
      // 2b9: ifne 2dd
      // 2bc: iflt 7ef
      // 2bf: goto 2c6
      // 2c2: invokestatic h9u.a (Loov;)Loov;
      // 2c5: athrow
      // 2c6: dload 10
      // 2c8: dload 22
      // 2ca: ldc2_w 16.0
      // 2cd: dsub
      // 2ce: dload 30
      // 2d0: ldc2_w 2.0
      // 2d3: dmul
      // 2d4: dsub
      // 2d5: dcmpl
      // 2d6: goto 2dd
      // 2d9: invokestatic h9u.a (Loov;)Loov;
      // 2dc: athrow
      // 2dd: iload 19
      // 2df: ifne 303
      // 2e2: iflt 7ef
      // 2e5: goto 2ec
      // 2e8: invokestatic h9u.a (Loov;)Loov;
      // 2eb: athrow
      // 2ec: dload 6
      // 2ee: dload 20
      // 2f0: ldc2_w 16.0
      // 2f3: dadd
      // 2f4: dload 30
      // 2f6: ldc2_w 2.0
      // 2f9: dmul
      // 2fa: dadd
      // 2fb: dcmpg
      // 2fc: goto 303
      // 2ff: invokestatic h9u.a (Loov;)Loov;
      // 302: athrow
      // 303: iload 19
      // 305: ifne 329
      // 308: ifgt 7ef
      // 30b: goto 312
      // 30e: invokestatic h9u.a (Loov;)Loov;
      // 311: athrow
      // 312: dload 10
      // 314: dload 22
      // 316: ldc2_w 16.0
      // 319: dadd
      // 31a: dload 30
      // 31c: ldc2_w 2.0
      // 31f: dmul
      // 320: dadd
      // 321: dcmpg
      // 322: goto 329
      // 325: invokestatic h9u.a (Loov;)Loov;
      // 328: athrow
      // 329: iload 19
      // 32b: ifne 34e
      // 32e: ifgt 7ef
      // 331: goto 338
      // 334: invokestatic h9u.a (Loov;)Loov;
      // 337: athrow
      // 338: dload 6
      // 33a: dload 30
      // 33c: dsub
      // 33d: invokestatic fe6.jqf (D)I
      // 340: iload 3
      // 341: bipush 16
      // 343: imul
      // 344: isub
      // 345: bipush 1
      // 346: isub
      // 347: goto 34e
      // 34a: invokestatic h9u.a (Loov;)Loov;
      // 34d: athrow
      // 34e: istore 44
      // 350: dload 6
      // 352: dload 30
      // 354: dadd
      // 355: invokestatic fe6.jqf (D)I
      // 358: iload 3
      // 359: bipush 16
      // 35b: imul
      // 35c: isub
      // 35d: bipush 1
      // 35e: iadd
      // 35f: istore 45
      // 361: dload 8
      // 363: dload 32
      // 365: dsub
      // 366: invokestatic fe6.jqf (D)I
      // 369: bipush 1
      // 36a: isub
      // 36b: istore 46
      // 36d: dload 8
      // 36f: dload 32
      // 371: dadd
      // 372: invokestatic fe6.jqf (D)I
      // 375: bipush 1
      // 376: iadd
      // 377: istore 47
      // 379: dload 10
      // 37b: dload 30
      // 37d: dsub
      // 37e: invokestatic fe6.jqf (D)I
      // 381: iload 4
      // 383: bipush 16
      // 385: imul
      // 386: isub
      // 387: bipush 1
      // 388: isub
      // 389: istore 48
      // 38b: dload 10
      // 38d: dload 30
      // 38f: dadd
      // 390: invokestatic fe6.jqf (D)I
      // 393: iload 4
      // 395: bipush 16
      // 397: imul
      // 398: isub
      // 399: bipush 1
      // 39a: iadd
      // 39b: istore 49
      // 39d: iload 44
      // 39f: iload 19
      // 3a1: ifne 3b3
      // 3a4: ifge 3b1
      // 3a7: goto 3ae
      // 3aa: invokestatic h9u.a (Loov;)Loov;
      // 3ad: athrow
      // 3ae: bipush 0
      // 3af: istore 44
      // 3b1: iload 45
      // 3b3: bipush 16
      // 3b5: iload 19
      // 3b7: ifne 3cb
      // 3ba: if_icmple 3c8
      // 3bd: goto 3c4
      // 3c0: invokestatic h9u.a (Loov;)Loov;
      // 3c3: athrow
      // 3c4: bipush 16
      // 3c6: istore 45
      // 3c8: iload 46
      // 3ca: bipush 1
      // 3cb: iload 19
      // 3cd: ifne 3ee
      // 3d0: if_icmpge 3dd
      // 3d3: goto 3da
      // 3d6: invokestatic h9u.a (Loov;)Loov;
      // 3d9: athrow
      // 3da: bipush 1
      // 3db: istore 46
      // 3dd: iload 47
      // 3df: iload 19
      // 3e1: ifne 3f8
      // 3e4: sipush 248
      // 3e7: goto 3ee
      // 3ea: invokestatic h9u.a (Loov;)Loov;
      // 3ed: athrow
      // 3ee: if_icmple 3f6
      // 3f1: sipush 248
      // 3f4: istore 47
      // 3f6: iload 48
      // 3f8: iload 19
      // 3fa: ifne 40c
      // 3fd: ifge 40a
      // 400: goto 407
      // 403: invokestatic h9u.a (Loov;)Loov;
      // 406: athrow
      // 407: bipush 0
      // 408: istore 48
      // 40a: iload 49
      // 40c: iload 19
      // 40e: ifne 422
      // 411: bipush 16
      // 413: if_icmple 421
      // 416: goto 41d
      // 419: invokestatic h9u.a (Loov;)Loov;
      // 41c: athrow
      // 41d: bipush 16
      // 41f: istore 49
      // 421: bipush 0
      // 422: istore 50
      // 424: iload 44
      // 426: istore 51
      // 428: iload 50
      // 42a: ifne 585
      // 42d: iload 51
      // 42f: iload 19
      // 431: ifne 587
      // 434: iload 45
      // 436: iload 19
      // 438: ifne 0a4
      // 43b: goto 442
      // 43e: invokestatic h9u.a (Loov;)Loov;
      // 441: athrow
      // 442: if_icmpge 585
      // 445: iload 48
      // 447: istore 52
      // 449: iload 50
      // 44b: ifne 57d
      // 44e: iload 52
      // 450: iload 49
      // 452: iload 19
      // 454: ifne 0a4
      // 457: iload 19
      // 459: ifne 470
      // 45c: if_icmpge 57d
      // 45f: goto 466
      // 462: invokestatic h9u.a (Loov;)Loov;
      // 465: athrow
      // 466: iload 47
      // 468: bipush 1
      // 469: goto 470
      // 46c: invokestatic h9u.a (Loov;)Loov;
      // 46f: athrow
      // 470: iadd
      // 471: istore 53
      // 473: iload 50
      // 475: ifne 575
      // 478: iload 53
      // 47a: iload 19
      // 47c: ifne 494
      // 47f: iload 46
      // 481: bipush 1
      // 482: isub
      // 483: iload 19
      // 485: ifne 0a4
      // 488: goto 48f
      // 48b: invokestatic h9u.a (Loov;)Loov;
      // 48e: athrow
      // 48f: if_icmplt 575
      // 492: iload 53
      // 494: iload 19
      // 496: ifne 4a5
      // 499: iflt 56d
      // 49c: goto 4a3
      // 49f: invokestatic h9u.a (Loov;)Loov;
      // 4a2: athrow
      // 4a3: iload 53
      // 4a5: sipush 256
      // 4a8: if_icmpge 56d
      // 4ab: aload 5
      // 4ad: iload 51
      // 4af: iload 53
      // 4b1: iload 52
      // 4b3: invokevirtual lno.ql9 (III)Lzfz;
      // 4b6: astore 54
      // 4b8: aload 54
      // 4ba: invokeinterface zfz.r_y ()Le0x; 1
      // 4bf: iload 19
      // 4c1: ifne 4df
      // 4c4: getstatic ox_.whp L_13;
      // 4c7: if_acmpeq 4e5
      // 4ca: goto 4d1
      // 4cd: invokestatic h9u.a (Loov;)Loov;
      // 4d0: athrow
      // 4d1: aload 54
      // 4d3: invokeinterface zfz.r_y ()Le0x; 1
      // 4d8: goto 4df
      // 4db: invokestatic h9u.a (Loov;)Loov;
      // 4de: athrow
      // 4df: getstatic ox_.gdz Les2;
      // 4e2: if_acmpne 4e8
      // 4e5: bipush 1
      // 4e6: istore 50
      // 4e8: iload 53
      // 4ea: iload 46
      // 4ec: bipush 1
      // 4ed: isub
      // 4ee: iload 19
      // 4f0: ifne 508
      // 4f3: if_icmpeq 56d
      // 4f6: goto 4fd
      // 4f9: invokestatic h9u.a (Loov;)Loov;
      // 4fc: athrow
      // 4fd: iload 51
      // 4ff: iload 44
      // 501: goto 508
      // 504: invokestatic h9u.a (Loov;)Loov;
      // 507: athrow
      // 508: iload 19
      // 50a: ifne 524
      // 50d: if_icmpeq 56d
      // 510: goto 517
      // 513: invokestatic h9u.a (Loov;)Loov;
      // 516: athrow
      // 517: iload 51
      // 519: iload 45
      // 51b: bipush 1
      // 51c: isub
      // 51d: goto 524
      // 520: invokestatic h9u.a (Loov;)Loov;
      // 523: athrow
      // 524: iload 19
      // 526: ifne 53e
      // 529: if_icmpeq 56d
      // 52c: goto 533
      // 52f: invokestatic h9u.a (Loov;)Loov;
      // 532: athrow
      // 533: iload 52
      // 535: iload 48
      // 537: goto 53e
      // 53a: invokestatic h9u.a (Loov;)Loov;
      // 53d: athrow
      // 53e: iload 19
      // 540: ifne 566
      // 543: if_icmpeq 56d
      // 546: goto 54d
      // 549: invokestatic h9u.a (Loov;)Loov;
      // 54c: athrow
      // 54d: iload 52
      // 54f: iload 19
      // 551: ifne 56b
      // 554: goto 55b
      // 557: invokestatic h9u.a (Loov;)Loov;
      // 55a: athrow
      // 55b: iload 49
      // 55d: bipush 1
      // 55e: isub
      // 55f: goto 566
      // 562: invokestatic h9u.a (Loov;)Loov;
      // 565: athrow
      // 566: if_icmpeq 56d
      // 569: iload 46
      // 56b: istore 53
      // 56d: iinc 53 -1
      // 570: iload 19
      // 572: ifeq 473
      // 575: iinc 52 1
      // 578: iload 19
      // 57a: ifeq 449
      // 57d: iinc 51 1
      // 580: iload 19
      // 582: ifeq 428
      // 585: iload 50
      // 587: ifne 7ef
      // 58a: new mew$mix
      // 58d: dup
      // 58e: invokespecial mew$mix.<init> ()V
      // 591: astore 51
      // 593: iload 44
      // 595: istore 52
      // 597: iload 52
      // 599: iload 45
      // 59b: if_icmpge 7e7
      // 59e: iload 52
      // 5a0: iload 3
      // 5a1: bipush 16
      // 5a3: imul
      // 5a4: iadd
      // 5a5: i2d
      // 5a6: ldc2_w 0.5
      // 5a9: dadd
      // 5aa: dload 6
      // 5ac: dsub
      // 5ad: dload 30
      // 5af: ddiv
      // 5b0: dstore 53
      // 5b2: iload 48
      // 5b4: iload 19
      // 5b6: ifne 7e9
      // 5b9: istore 55
      // 5bb: iload 55
      // 5bd: iload 49
      // 5bf: if_icmpge 7df
      // 5c2: iload 55
      // 5c4: iload 4
      // 5c6: bipush 16
      // 5c8: imul
      // 5c9: iadd
      // 5ca: i2d
      // 5cb: ldc2_w 0.5
      // 5ce: dadd
      // 5cf: dload 10
      // 5d1: dsub
      // 5d2: dload 30
      // 5d4: ddiv
      // 5d5: dstore 56
      // 5d7: bipush 0
      // 5d8: istore 58
      // 5da: iload 19
      // 5dc: ifne 7da
      // 5df: dload 53
      // 5e1: dload 53
      // 5e3: dmul
      // 5e4: dload 56
      // 5e6: dload 56
      // 5e8: dmul
      // 5e9: dadd
      // 5ea: dconst_1
      // 5eb: dcmpg
      // 5ec: iload 19
      // 5ee: ifne 599
      // 5f1: goto 5f8
      // 5f4: invokestatic h9u.a (Loov;)Loov;
      // 5f7: athrow
      // 5f8: ifge 7d7
      // 5fb: iload 47
      // 5fd: istore 59
      // 5ff: iload 59
      // 601: iload 46
      // 603: if_icmple 7d7
      // 606: iload 59
      // 608: bipush 1
      // 609: isub
      // 60a: i2d
      // 60b: ldc2_w 0.5
      // 60e: dadd
      // 60f: dload 8
      // 611: dsub
      // 612: dload 32
      // 614: ddiv
      // 615: dstore 60
      // 617: iload 19
      // 619: ifne 7d2
      // 61c: dload 60
      // 61e: ldc2_w -0.7
      // 621: dcmpl
      // 622: iload 19
      // 624: ifne 5bd
      // 627: goto 62e
      // 62a: invokestatic h9u.a (Loov;)Loov;
      // 62d: athrow
      // 62e: ifle 7cf
      // 631: dload 53
      // 633: dload 53
      // 635: dmul
      // 636: dload 60
      // 638: dload 60
      // 63a: dmul
      // 63b: dadd
      // 63c: dload 56
      // 63e: dload 56
      // 640: dmul
      // 641: dadd
      // 642: dconst_1
      // 643: dcmpg
      // 644: ifge 7cf
      // 647: goto 64e
      // 64a: invokestatic h9u.a (Loov;)Loov;
      // 64d: athrow
      // 64e: aload 5
      // 650: iload 52
      // 652: iload 59
      // 654: iload 55
      // 656: invokevirtual lno.ql9 (III)Lzfz;
      // 659: astore 62
      // 65b: aload 5
      // 65d: iload 52
      // 65f: iload 59
      // 661: bipush 1
      // 662: iadd
      // 663: iload 55
      // 665: invokevirtual lno.ql9 (III)Lzfz;
      // 668: getstatic ox_.ibw Le0x;
      // 66b: invokevirtual e0x.l4i ()Lzfz;
      // 66e: invokestatic com/google/common/base/Objects.firstNonNull (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      // 671: checkcast zfz
      // 674: astore 63
      // 676: aload 62
      // 678: invokeinterface zfz.r_y ()Le0x; 1
      // 67d: iload 19
      // 67f: ifne 69d
      // 682: getstatic ox_.l11 Lx82;
      // 685: if_acmpeq 6a3
      // 688: goto 68f
      // 68b: invokestatic h9u.a (Loov;)Loov;
      // 68e: athrow
      // 68f: aload 62
      // 691: invokeinterface zfz.r_y ()Le0x; 1
      // 696: goto 69d
      // 699: invokestatic h9u.a (Loov;)Loov;
      // 69c: athrow
      // 69d: getstatic ox_.pl8 Lp48;
      // 6a0: if_acmpne 6a6
      // 6a3: bipush 1
      // 6a4: istore 58
      // 6a6: aload 0
      // 6a7: aload 62
      // 6a9: aload 63
      // 6ab: invokevirtual h9u.wo1 (Lzfz;Lzfz;)Z
      // 6ae: iload 19
      // 6b0: ifne 6c8
      // 6b3: ifeq 7cf
      // 6b6: goto 6bd
      // 6b9: invokestatic h9u.a (Loov;)Loov;
      // 6bc: athrow
      // 6bd: iload 59
      // 6bf: bipush 1
      // 6c0: isub
      // 6c1: goto 6c8
      // 6c4: invokestatic h9u.a (Loov;)Loov;
      // 6c7: athrow
      // 6c8: bipush 10
      // 6ca: if_icmpge 6ea
      // 6cd: aload 5
      // 6cf: iload 52
      // 6d1: iload 59
      // 6d3: iload 55
      // 6d5: getstatic ox_.ska Les2;
      // 6d8: invokevirtual es2.l4i ()Lzfz;
      // 6db: invokevirtual lno.x6f (IIILzfz;)V
      // 6de: iload 19
      // 6e0: ifeq 7cf
      // 6e3: goto 6ea
      // 6e6: invokestatic h9u.a (Loov;)Loov;
      // 6e9: athrow
      // 6ea: aload 5
      // 6ec: iload 52
      // 6ee: iload 59
      // 6f0: iload 55
      // 6f2: getstatic ox_.ibw Le0x;
      // 6f5: invokevirtual e0x.l4i ()Lzfz;
      // 6f8: iload 19
      // 6fa: ifne 72e
      // 6fd: goto 704
      // 700: invokestatic h9u.a (Loov;)Loov;
      // 703: athrow
      // 704: invokevirtual lno.x6f (IIILzfz;)V
      // 707: aload 63
      // 709: invokeinterface zfz.r_y ()Le0x; 1
      // 70e: getstatic ox_.vd0 Lpmc;
      // 711: if_acmpne 761
      // 714: goto 71b
      // 717: invokestatic h9u.a (Loov;)Loov;
      // 71a: athrow
      // 71b: aload 5
      // 71d: iload 52
      // 71f: iload 59
      // 721: bipush 1
      // 722: iadd
      // 723: iload 55
      // 725: aload 63
      // 727: goto 72e
      // 72a: invokestatic h9u.a (Loov;)Loov;
      // 72d: athrow
      // 72e: iload 19
      // 730: ifne 755
      // 733: getstatic pmc.xum Lzb_;
      // 736: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 73b: getstatic pmc$s6y.tms Lpmc$s6y;
      // 73e: if_acmpne 758
      // 741: goto 748
      // 744: invokestatic h9u.a (Loov;)Loov;
      // 747: athrow
      // 748: getstatic ox_.t2v Le0x;
      // 74b: invokevirtual e0x.l4i ()Lzfz;
      // 74e: goto 755
      // 751: invokestatic h9u.a (Loov;)Loov;
      // 754: athrow
      // 755: goto 75e
      // 758: getstatic ox_.umb Le0x;
      // 75b: invokevirtual e0x.l4i ()Lzfz;
      // 75e: invokevirtual lno.x6f (IIILzfz;)V
      // 761: iload 58
      // 763: ifeq 7cf
      // 766: aload 5
      // 768: iload 52
      // 76a: iload 59
      // 76c: bipush 1
      // 76d: isub
      // 76e: iload 55
      // 770: iload 19
      // 772: ifne 7b8
      // 775: goto 77c
      // 778: invokestatic h9u.a (Loov;)Loov;
      // 77b: athrow
      // 77c: invokevirtual lno.ql9 (III)Lzfz;
      // 77f: invokeinterface zfz.r_y ()Le0x; 1
      // 784: getstatic ox_.kqk Le0x;
      // 787: if_acmpne 7cf
      // 78a: goto 791
      // 78d: invokestatic h9u.a (Loov;)Loov;
      // 790: athrow
      // 791: aload 51
      // 793: iload 52
      // 795: iload 3
      // 796: bipush 16
      // 798: imul
      // 799: iadd
      // 79a: bipush 0
      // 79b: iload 55
      // 79d: iload 4
      // 79f: bipush 16
      // 7a1: imul
      // 7a2: iadd
      // 7a3: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 7a6: pop
      // 7a7: aload 5
      // 7a9: iload 52
      // 7ab: iload 59
      // 7ad: bipush 1
      // 7ae: isub
      // 7af: iload 55
      // 7b1: goto 7b8
      // 7b4: invokestatic h9u.a (Loov;)Loov;
      // 7b7: athrow
      // 7b8: aload 0
      // 7b9: getfield h9u.pr9 Lt9d;
      // 7bc: aload 51
      // 7be: invokevirtual OpaquePredicate.getBiomeGenForCoords (Lmew;)Lgyu;
      // 7c1: getfield gyu.ke4 Lzfz;
      // 7c4: invokeinterface zfz.r_y ()Le0x; 1
      // 7c9: invokevirtual e0x.l4i ()Lzfz;
      // 7cc: invokevirtual lno.x6f (IIILzfz;)V
      // 7cf: iinc 59 -1
      // 7d2: iload 19
      // 7d4: ifeq 5ff
      // 7d7: iinc 55 1
      // 7da: iload 19
      // 7dc: ifeq 5bb
      // 7df: iinc 52 1
      // 7e2: iload 19
      // 7e4: ifeq 597
      // 7e7: iload 27
      // 7e9: ifeq 7ef
      // 7ec: goto 7f7
      // 7ef: iinc 15 1
      // 7f2: iload 19
      // 7f4: ifeq 0a0
      // 7f7: return
   }

   public boolean wo1(zfz param1, zfz param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 3
      // 004: aload 1
      // 005: invokeinterface zfz.r_y ()Le0x; 1
      // 00a: getstatic ox_.pu8 Le0x;
      // 00d: iload 3
      // 00e: ifne 037
      // 011: if_acmpne 023
      // 014: goto 01b
      // 017: invokestatic h9u.a (Loov;)Loov;
      // 01a: athrow
      // 01b: bipush 1
      // 01c: goto 16f
      // 01f: invokestatic h9u.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 1
      // 024: invokeinterface zfz.r_y ()Le0x; 1
      // 029: iload 3
      // 02a: ifne 048
      // 02d: getstatic ox_.kqk Le0x;
      // 030: goto 037
      // 033: invokestatic h9u.a (Loov;)Loov;
      // 036: athrow
      // 037: if_acmpne 042
      // 03a: bipush 1
      // 03b: goto 16f
      // 03e: invokestatic h9u.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 1
      // 043: invokeinterface zfz.r_y ()Le0x; 1
      // 048: getstatic ox_.l11 Lx82;
      // 04b: iload 3
      // 04c: ifne 06a
      // 04f: if_acmpne 061
      // 052: goto 059
      // 055: invokestatic h9u.a (Loov;)Loov;
      // 058: athrow
      // 059: bipush 1
      // 05a: goto 16f
      // 05d: invokestatic h9u.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 1
      // 062: invokeinterface zfz.r_y ()Le0x; 1
      // 067: getstatic ox_.o45 Le0x;
      // 06a: iload 3
      // 06b: ifne 089
      // 06e: if_acmpne 080
      // 071: goto 078
      // 074: invokestatic h9u.a (Loov;)Loov;
      // 077: athrow
      // 078: bipush 1
      // 079: goto 16f
      // 07c: invokestatic h9u.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 1
      // 081: invokeinterface zfz.r_y ()Le0x; 1
      // 086: getstatic ox_.f6z Le0x;
      // 089: iload 3
      // 08a: ifne 0a8
      // 08d: if_acmpne 09f
      // 090: goto 097
      // 093: invokestatic h9u.a (Loov;)Loov;
      // 096: athrow
      // 097: bipush 1
      // 098: goto 16f
      // 09b: invokestatic h9u.a (Loov;)Loov;
      // 09e: athrow
      // 09f: aload 1
      // 0a0: invokeinterface zfz.r_y ()Le0x; 1
      // 0a5: getstatic ox_.umb Le0x;
      // 0a8: iload 3
      // 0a9: ifne 0d2
      // 0ac: if_acmpne 0be
      // 0af: goto 0b6
      // 0b2: invokestatic h9u.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: bipush 1
      // 0b7: goto 16f
      // 0ba: invokestatic h9u.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 1
      // 0bf: invokeinterface zfz.r_y ()Le0x; 1
      // 0c4: iload 3
      // 0c5: ifne 0e3
      // 0c8: getstatic ox_.t2v Le0x;
      // 0cb: goto 0d2
      // 0ce: invokestatic h9u.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: if_acmpne 0dd
      // 0d5: bipush 1
      // 0d6: goto 16f
      // 0d9: invokestatic h9u.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 1
      // 0de: invokeinterface zfz.r_y ()Le0x; 1
      // 0e3: getstatic ox_.pl8 Lp48;
      // 0e6: iload 3
      // 0e7: ifne 110
      // 0ea: if_acmpne 0fc
      // 0ed: goto 0f4
      // 0f0: invokestatic h9u.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: bipush 1
      // 0f5: goto 16f
      // 0f8: invokestatic h9u.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: aload 1
      // 0fd: invokeinterface zfz.r_y ()Le0x; 1
      // 102: iload 3
      // 103: ifne 121
      // 106: getstatic ox_.dxo Le0x;
      // 109: goto 110
      // 10c: invokestatic h9u.a (Loov;)Loov;
      // 10f: athrow
      // 110: if_acmpne 11b
      // 113: bipush 1
      // 114: goto 16f
      // 117: invokestatic h9u.a (Loov;)Loov;
      // 11a: athrow
      // 11b: aload 1
      // 11c: invokeinterface zfz.r_y ()Le0x; 1
      // 121: iload 3
      // 122: ifne 15d
      // 125: getstatic ox_.vd0 Lpmc;
      // 128: if_acmpeq 150
      // 12b: goto 132
      // 12e: invokestatic h9u.a (Loov;)Loov;
      // 131: athrow
      // 132: aload 1
      // 133: invokeinterface zfz.r_y ()Le0x; 1
      // 138: iload 3
      // 139: ifne 15d
      // 13c: goto 143
      // 13f: invokestatic h9u.a (Loov;)Loov;
      // 142: athrow
      // 143: getstatic ox_.bqn Le0x;
      // 146: if_acmpne 16e
      // 149: goto 150
      // 14c: invokestatic h9u.a (Loov;)Loov;
      // 14f: athrow
      // 150: aload 2
      // 151: invokeinterface zfz.r_y ()Le0x; 1
      // 156: goto 15d
      // 159: invokestatic h9u.a (Loov;)Loov;
      // 15c: athrow
      // 15d: invokevirtual e0x.p1r ()Lp3y;
      // 160: getstatic p3y.six Lp3y;
      // 163: if_acmpeq 16e
      // 166: bipush 1
      // 167: goto 16f
      // 16a: invokestatic h9u.a (Loov;)Loov;
      // 16d: athrow
      // 16e: bipush 0
      // 16f: ireturn
   }

   @Override
   public void bjr(OpaquePredicate var1, int var2, int var3, int var4, int var5, lno var6) {
      int var7 = OpaquePredicate.b();
      int var8 = this.a0f.nextInt(this.a0f.nextInt(this.a0f.nextInt(15) + 1) + 1);

      int var10000;
      label82: {
         label81: {
            try {
               var10000 = this.a0f.nextInt(7);
               if (var7 == 0) {
                  break label82;
               }

               if (var10000 == 0) {
                  break label81;
               }
            } catch (oov var23) {
               throw a(var23);
            }

            var8 = 0;
         }

         var10000 = 0;
      }

      int var9 = var10000;

      label72:
      while (true) {
         var10000 = var9;

         label70:
         while (var10000 < var8) {
            double var10 = (double)(var2 * 16 + this.a0f.nextInt(16));
            double var12 = (double)this.a0f.nextInt(this.a0f.nextInt(120) + 8);
            double var14 = (double)(var3 * 16 + this.a0f.nextInt(16));
            int var16 = 1;

            label67: {
               label66: {
                  try {
                     var10000 = this.a0f.nextInt(4);
                     if (var7 == 0) {
                        break label67;
                     }

                     if (var10000 != 0) {
                        break label66;
                     }
                  } catch (oov var22) {
                     throw a(var22);
                  }

                  this.l6c(this.a0f.nextLong(), var4, var5, var6, var10, var12, var14);
                  var16 += this.a0f.nextInt(4);
               }

               var10000 = 0;
            }

            int var17 = var10000;

            while (var17 < var16) {
               float var18 = this.a0f.nextFloat() * (float) Math.PI * 2.0F;
               float var19 = (this.a0f.nextFloat() - 0.5F) * 2.0F / 8.0F;
               float var20 = this.a0f.nextFloat() * 2.0F + this.a0f.nextFloat();

               label88: {
                  try {
                     var26 = this;
                     if (var7 == 0) {
                        break label88;
                     }

                     var10000 = this.a0f.nextInt(10);
                     if (var7 == 0) {
                        continue label70;
                     }
                  } catch (oov var21) {
                     throw a(var21);
                  }

                  if (var10000 == 0) {
                     var20 *= this.a0f.nextFloat() * this.a0f.nextFloat() * 3.0F + 1.0F;
                  }

                  var26 = this;
               }

               var26.jt0(this.a0f.nextLong(), var4, var5, var6, var10, var12, var14, var20, var18, var19, 0, 0, 1.0);
               var17++;
               if (var7 == 0) {
                  break;
               }
            }

            var9++;
            if (var7 == 0) {
               return;
            }
            continue label72;
         }

         return;
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
