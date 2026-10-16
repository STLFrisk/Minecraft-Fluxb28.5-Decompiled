public class a30 extends uk2 {
   public void h97(long var1, int var3, int var4, lno var5, double var6, double var8, double var10) {
      this.vzm(var1, var3, var4, var5, var6, var8, var10, 1.0F + this.a0f.nextFloat() * 6.0F, 0.0F, 0.0F, -1, -1, 0.5);
   }

   public void vzm(
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
      // 00a: invokestatic OpaquePredicate.b ()I
      // 00d: iload 4
      // 00f: bipush 16
      // 011: imul
      // 012: bipush 8
      // 014: iadd
      // 015: i2d
      // 016: dstore 22
      // 018: fconst_0
      // 019: fstore 24
      // 01b: fconst_0
      // 01c: fstore 25
      // 01e: istore 19
      // 020: new java/util/Random
      // 023: dup
      // 024: lload 1
      // 025: invokespecial java/util/Random.<init> (J)V
      // 028: astore 26
      // 02a: iload 16
      // 02c: iload 19
      // 02e: ifeq 056
      // 031: ifgt 055
      // 034: goto 03b
      // 037: invokestatic a30.a (Loov;)Loov;
      // 03a: athrow
      // 03b: aload 0
      // 03c: getfield a30.oa6 I
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
      // 05d: ifeq 080
      // 060: if_icmpne 073
      // 063: goto 06a
      // 066: invokestatic a30.a (Loov;)Loov;
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
      // 08c: ifeq 09a
      // 08f: ifne 09d
      // 092: goto 099
      // 095: invokestatic a30.a (Loov;)Loov;
      // 098: athrow
      // 099: bipush 1
      // 09a: goto 09e
      // 09d: bipush 0
      // 09e: istore 29
      // 0a0: iload 15
      // 0a2: iload 16
      // 0a4: if_icmpge 6b2
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
      // 0fc: ifeq 113
      // 0ff: iload 29
      // 101: ifeq 118
      // 104: goto 10b
      // 107: invokestatic a30.a (Loov;)Loov;
      // 10a: athrow
      // 10b: fload 14
      // 10d: ldc 0.92
      // 10f: nop
      // 110: fmul
      // 111: fstore 14
      // 113: iload 19
      // 115: ifne 120
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
      // 17c: ifeq 228
      // 17f: ifne 226
      // 182: goto 189
      // 185: invokestatic a30.a (Loov;)Loov;
      // 188: athrow
      // 189: iload 15
      // 18b: iload 19
      // 18d: ifeq 228
      // 190: goto 197
      // 193: invokestatic a30.a (Loov;)Loov;
      // 196: athrow
      // 197: iload 28
      // 199: if_icmpne 226
      // 19c: goto 1a3
      // 19f: invokestatic a30.a (Loov;)Loov;
      // 1a2: athrow
      // 1a3: fload 12
      // 1a5: fconst_1
      // 1a6: fcmpl
      // 1a7: iload 19
      // 1a9: ifeq 228
      // 1ac: goto 1b3
      // 1af: invokestatic a30.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: ifle 226
      // 1b6: goto 1bd
      // 1b9: invokestatic a30.a (Loov;)Loov;
      // 1bc: athrow
      // 1bd: aload 0
      // 1be: aload 26
      // 1c0: invokevirtual java/util/Random.nextLong ()J
      // 1c3: iload 3
      // 1c4: iload 4
      // 1c6: aload 5
      // 1c8: dload 6
      // 1ca: dload 8
      // 1cc: dload 10
      // 1ce: aload 26
      // 1d0: invokevirtual java/util/Random.nextFloat ()F
      // 1d3: ldc 0.5
      // 1d5: nop
      // 1d6: fmul
      // 1d7: ldc 0.5
      // 1d9: nop
      // 1da: fadd
      // 1db: fload 13
      // 1dd: ldc 1.5707964
      // 1df: nop
      // 1e0: fsub
      // 1e1: fload 14
      // 1e3: ldc 3.0
      // 1e5: nop
      // 1e6: fdiv
      // 1e7: iload 15
      // 1e9: iload 16
      // 1eb: dconst_1
      // 1ec: invokevirtual a30.vzm (JIILlno;DDDFFFIID)V
      // 1ef: aload 0
      // 1f0: aload 26
      // 1f2: invokevirtual java/util/Random.nextLong ()J
      // 1f5: iload 3
      // 1f6: iload 4
      // 1f8: aload 5
      // 1fa: dload 6
      // 1fc: dload 8
      // 1fe: dload 10
      // 200: aload 26
      // 202: invokevirtual java/util/Random.nextFloat ()F
      // 205: ldc 0.5
      // 207: nop
      // 208: fmul
      // 209: ldc 0.5
      // 20b: nop
      // 20c: fadd
      // 20d: fload 13
      // 20f: ldc 1.5707964
      // 211: nop
      // 212: fadd
      // 213: fload 14
      // 215: ldc 3.0
      // 217: nop
      // 218: fdiv
      // 219: iload 15
      // 21b: iload 16
      // 21d: dconst_1
      // 21e: invokevirtual a30.vzm (JIILlno;DDDFFFIID)V
      // 221: return
      // 222: invokestatic a30.a (Loov;)Loov;
      // 225: athrow
      // 226: iload 27
      // 228: iload 19
      // 22a: ifeq 244
      // 22d: ifne 247
      // 230: goto 237
      // 233: invokestatic a30.a (Loov;)Loov;
      // 236: athrow
      // 237: aload 26
      // 239: bipush 4
      // 23a: invokevirtual java/util/Random.nextInt (I)I
      // 23d: goto 244
      // 240: invokestatic a30.a (Loov;)Loov;
      // 243: athrow
      // 244: ifeq 6aa
      // 247: dload 6
      // 249: dload 20
      // 24b: dsub
      // 24c: dstore 36
      // 24e: dload 10
      // 250: dload 22
      // 252: dsub
      // 253: dstore 38
      // 255: iload 16
      // 257: iload 15
      // 259: isub
      // 25a: i2d
      // 25b: dstore 40
      // 25d: fload 12
      // 25f: fconst_2
      // 260: fadd
      // 261: ldc 16.0
      // 263: nop
      // 264: fadd
      // 265: f2d
      // 266: dstore 42
      // 268: dload 36
      // 26a: dload 36
      // 26c: dmul
      // 26d: dload 38
      // 26f: dload 38
      // 271: dmul
      // 272: dadd
      // 273: dload 40
      // 275: dload 40
      // 277: dmul
      // 278: dsub
      // 279: dload 42
      // 27b: dload 42
      // 27d: dmul
      // 27e: dcmpl
      // 27f: iload 19
      // 281: ifeq 29f
      // 284: ifle 28f
      // 287: goto 28e
      // 28a: invokestatic a30.a (Loov;)Loov;
      // 28d: athrow
      // 28e: return
      // 28f: dload 6
      // 291: dload 20
      // 293: ldc2_w 16.0
      // 296: dsub
      // 297: dload 30
      // 299: ldc2_w 2.0
      // 29c: dmul
      // 29d: dsub
      // 29e: dcmpl
      // 29f: iload 19
      // 2a1: ifeq 2c5
      // 2a4: iflt 6aa
      // 2a7: goto 2ae
      // 2aa: invokestatic a30.a (Loov;)Loov;
      // 2ad: athrow
      // 2ae: dload 10
      // 2b0: dload 22
      // 2b2: ldc2_w 16.0
      // 2b5: dsub
      // 2b6: dload 30
      // 2b8: ldc2_w 2.0
      // 2bb: dmul
      // 2bc: dsub
      // 2bd: dcmpl
      // 2be: goto 2c5
      // 2c1: invokestatic a30.a (Loov;)Loov;
      // 2c4: athrow
      // 2c5: iload 19
      // 2c7: ifeq 2eb
      // 2ca: iflt 6aa
      // 2cd: goto 2d4
      // 2d0: invokestatic a30.a (Loov;)Loov;
      // 2d3: athrow
      // 2d4: dload 6
      // 2d6: dload 20
      // 2d8: ldc2_w 16.0
      // 2db: dadd
      // 2dc: dload 30
      // 2de: ldc2_w 2.0
      // 2e1: dmul
      // 2e2: dadd
      // 2e3: dcmpg
      // 2e4: goto 2eb
      // 2e7: invokestatic a30.a (Loov;)Loov;
      // 2ea: athrow
      // 2eb: iload 19
      // 2ed: ifeq 311
      // 2f0: ifgt 6aa
      // 2f3: goto 2fa
      // 2f6: invokestatic a30.a (Loov;)Loov;
      // 2f9: athrow
      // 2fa: dload 10
      // 2fc: dload 22
      // 2fe: ldc2_w 16.0
      // 301: dadd
      // 302: dload 30
      // 304: ldc2_w 2.0
      // 307: dmul
      // 308: dadd
      // 309: dcmpg
      // 30a: goto 311
      // 30d: invokestatic a30.a (Loov;)Loov;
      // 310: athrow
      // 311: iload 19
      // 313: ifeq 336
      // 316: ifgt 6aa
      // 319: goto 320
      // 31c: invokestatic a30.a (Loov;)Loov;
      // 31f: athrow
      // 320: dload 6
      // 322: dload 30
      // 324: dsub
      // 325: invokestatic fe6.jqf (D)I
      // 328: iload 3
      // 329: bipush 16
      // 32b: imul
      // 32c: isub
      // 32d: bipush 1
      // 32e: isub
      // 32f: goto 336
      // 332: invokestatic a30.a (Loov;)Loov;
      // 335: athrow
      // 336: istore 44
      // 338: dload 6
      // 33a: dload 30
      // 33c: dadd
      // 33d: invokestatic fe6.jqf (D)I
      // 340: iload 3
      // 341: bipush 16
      // 343: imul
      // 344: isub
      // 345: bipush 1
      // 346: iadd
      // 347: istore 45
      // 349: dload 8
      // 34b: dload 32
      // 34d: dsub
      // 34e: invokestatic fe6.jqf (D)I
      // 351: bipush 1
      // 352: isub
      // 353: istore 46
      // 355: dload 8
      // 357: dload 32
      // 359: dadd
      // 35a: invokestatic fe6.jqf (D)I
      // 35d: bipush 1
      // 35e: iadd
      // 35f: istore 47
      // 361: dload 10
      // 363: dload 30
      // 365: dsub
      // 366: invokestatic fe6.jqf (D)I
      // 369: iload 4
      // 36b: bipush 16
      // 36d: imul
      // 36e: isub
      // 36f: bipush 1
      // 370: isub
      // 371: istore 48
      // 373: dload 10
      // 375: dload 30
      // 377: dadd
      // 378: invokestatic fe6.jqf (D)I
      // 37b: iload 4
      // 37d: bipush 16
      // 37f: imul
      // 380: isub
      // 381: bipush 1
      // 382: iadd
      // 383: istore 49
      // 385: iload 44
      // 387: iload 19
      // 389: ifeq 39b
      // 38c: ifge 399
      // 38f: goto 396
      // 392: invokestatic a30.a (Loov;)Loov;
      // 395: athrow
      // 396: bipush 0
      // 397: istore 44
      // 399: iload 45
      // 39b: bipush 16
      // 39d: iload 19
      // 39f: ifeq 3b3
      // 3a2: if_icmple 3b0
      // 3a5: goto 3ac
      // 3a8: invokestatic a30.a (Loov;)Loov;
      // 3ab: athrow
      // 3ac: bipush 16
      // 3ae: istore 45
      // 3b0: iload 46
      // 3b2: bipush 1
      // 3b3: iload 19
      // 3b5: ifeq 3d5
      // 3b8: if_icmpge 3c5
      // 3bb: goto 3c2
      // 3be: invokestatic a30.a (Loov;)Loov;
      // 3c1: athrow
      // 3c2: bipush 1
      // 3c3: istore 46
      // 3c5: iload 47
      // 3c7: iload 19
      // 3c9: ifeq 3de
      // 3cc: bipush 120
      // 3ce: goto 3d5
      // 3d1: invokestatic a30.a (Loov;)Loov;
      // 3d4: athrow
      // 3d5: if_icmple 3dc
      // 3d8: bipush 120
      // 3da: istore 47
      // 3dc: iload 48
      // 3de: iload 19
      // 3e0: ifeq 3f2
      // 3e3: ifge 3f0
      // 3e6: goto 3ed
      // 3e9: invokestatic a30.a (Loov;)Loov;
      // 3ec: athrow
      // 3ed: bipush 0
      // 3ee: istore 48
      // 3f0: iload 49
      // 3f2: iload 19
      // 3f4: ifeq 408
      // 3f7: bipush 16
      // 3f9: if_icmple 407
      // 3fc: goto 403
      // 3ff: invokestatic a30.a (Loov;)Loov;
      // 402: athrow
      // 403: bipush 16
      // 405: istore 49
      // 407: bipush 0
      // 408: istore 50
      // 40a: iload 44
      // 40c: istore 51
      // 40e: iload 50
      // 410: ifne 56b
      // 413: iload 51
      // 415: iload 19
      // 417: ifeq 56d
      // 41a: iload 45
      // 41c: iload 19
      // 41e: ifeq 0a4
      // 421: goto 428
      // 424: invokestatic a30.a (Loov;)Loov;
      // 427: athrow
      // 428: if_icmpge 56b
      // 42b: iload 48
      // 42d: istore 52
      // 42f: iload 50
      // 431: ifne 563
      // 434: iload 52
      // 436: iload 49
      // 438: iload 19
      // 43a: ifeq 0a4
      // 43d: iload 19
      // 43f: ifeq 456
      // 442: if_icmpge 563
      // 445: goto 44c
      // 448: invokestatic a30.a (Loov;)Loov;
      // 44b: athrow
      // 44c: iload 47
      // 44e: bipush 1
      // 44f: goto 456
      // 452: invokestatic a30.a (Loov;)Loov;
      // 455: athrow
      // 456: iadd
      // 457: istore 53
      // 459: iload 50
      // 45b: ifne 55b
      // 45e: iload 53
      // 460: iload 19
      // 462: ifeq 47a
      // 465: iload 46
      // 467: bipush 1
      // 468: isub
      // 469: iload 19
      // 46b: ifeq 0a4
      // 46e: goto 475
      // 471: invokestatic a30.a (Loov;)Loov;
      // 474: athrow
      // 475: if_icmplt 55b
      // 478: iload 53
      // 47a: iload 19
      // 47c: ifeq 48b
      // 47f: iflt 553
      // 482: goto 489
      // 485: invokestatic a30.a (Loov;)Loov;
      // 488: athrow
      // 489: iload 53
      // 48b: sipush 128
      // 48e: if_icmpge 553
      // 491: aload 5
      // 493: iload 51
      // 495: iload 53
      // 497: iload 52
      // 499: invokevirtual lno.ql9 (III)Lzfz;
      // 49c: astore 54
      // 49e: aload 54
      // 4a0: invokeinterface zfz.r_y ()Le0x; 1
      // 4a5: iload 19
      // 4a7: ifeq 4c5
      // 4aa: getstatic ox_.dr2 L_13;
      // 4ad: if_acmpeq 4cb
      // 4b0: goto 4b7
      // 4b3: invokestatic a30.a (Loov;)Loov;
      // 4b6: athrow
      // 4b7: aload 54
      // 4b9: invokeinterface zfz.r_y ()Le0x; 1
      // 4be: goto 4c5
      // 4c1: invokestatic a30.a (Loov;)Loov;
      // 4c4: athrow
      // 4c5: getstatic ox_.ska Les2;
      // 4c8: if_acmpne 4ce
      // 4cb: bipush 1
      // 4cc: istore 50
      // 4ce: iload 53
      // 4d0: iload 46
      // 4d2: bipush 1
      // 4d3: isub
      // 4d4: iload 19
      // 4d6: ifeq 4ee
      // 4d9: if_icmpeq 553
      // 4dc: goto 4e3
      // 4df: invokestatic a30.a (Loov;)Loov;
      // 4e2: athrow
      // 4e3: iload 51
      // 4e5: iload 44
      // 4e7: goto 4ee
      // 4ea: invokestatic a30.a (Loov;)Loov;
      // 4ed: athrow
      // 4ee: iload 19
      // 4f0: ifeq 50a
      // 4f3: if_icmpeq 553
      // 4f6: goto 4fd
      // 4f9: invokestatic a30.a (Loov;)Loov;
      // 4fc: athrow
      // 4fd: iload 51
      // 4ff: iload 45
      // 501: bipush 1
      // 502: isub
      // 503: goto 50a
      // 506: invokestatic a30.a (Loov;)Loov;
      // 509: athrow
      // 50a: iload 19
      // 50c: ifeq 524
      // 50f: if_icmpeq 553
      // 512: goto 519
      // 515: invokestatic a30.a (Loov;)Loov;
      // 518: athrow
      // 519: iload 52
      // 51b: iload 48
      // 51d: goto 524
      // 520: invokestatic a30.a (Loov;)Loov;
      // 523: athrow
      // 524: iload 19
      // 526: ifeq 54c
      // 529: if_icmpeq 553
      // 52c: goto 533
      // 52f: invokestatic a30.a (Loov;)Loov;
      // 532: athrow
      // 533: iload 52
      // 535: iload 19
      // 537: ifeq 551
      // 53a: goto 541
      // 53d: invokestatic a30.a (Loov;)Loov;
      // 540: athrow
      // 541: iload 49
      // 543: bipush 1
      // 544: isub
      // 545: goto 54c
      // 548: invokestatic a30.a (Loov;)Loov;
      // 54b: athrow
      // 54c: if_icmpeq 553
      // 54f: iload 46
      // 551: istore 53
      // 553: iinc 53 -1
      // 556: iload 19
      // 558: ifne 459
      // 55b: iinc 52 1
      // 55e: iload 19
      // 560: ifne 42f
      // 563: iinc 51 1
      // 566: iload 19
      // 568: ifne 40e
      // 56b: iload 50
      // 56d: iload 19
      // 56f: ifeq 57e
      // 572: ifne 6aa
      // 575: goto 57c
      // 578: invokestatic a30.a (Loov;)Loov;
      // 57b: athrow
      // 57c: iload 44
      // 57e: istore 51
      // 580: iload 51
      // 582: iload 45
      // 584: if_icmpge 6a2
      // 587: iload 51
      // 589: iload 3
      // 58a: bipush 16
      // 58c: imul
      // 58d: iadd
      // 58e: i2d
      // 58f: ldc2_w 0.5
      // 592: dadd
      // 593: dload 6
      // 595: dsub
      // 596: dload 30
      // 598: ddiv
      // 599: dstore 52
      // 59b: iload 48
      // 59d: iload 19
      // 59f: ifeq 6a4
      // 5a2: istore 54
      // 5a4: iload 54
      // 5a6: iload 49
      // 5a8: if_icmpge 69a
      // 5ab: iload 54
      // 5ad: iload 4
      // 5af: bipush 16
      // 5b1: imul
      // 5b2: iadd
      // 5b3: i2d
      // 5b4: ldc2_w 0.5
      // 5b7: dadd
      // 5b8: dload 10
      // 5ba: dsub
      // 5bb: dload 30
      // 5bd: ddiv
      // 5be: dstore 55
      // 5c0: iload 47
      // 5c2: iload 19
      // 5c4: ifeq 582
      // 5c7: istore 57
      // 5c9: iload 57
      // 5cb: iload 46
      // 5cd: if_icmple 692
      // 5d0: iload 57
      // 5d2: bipush 1
      // 5d3: isub
      // 5d4: i2d
      // 5d5: ldc2_w 0.5
      // 5d8: dadd
      // 5d9: dload 8
      // 5db: dsub
      // 5dc: dload 32
      // 5de: ddiv
      // 5df: dstore 58
      // 5e1: iload 19
      // 5e3: ifeq 68d
      // 5e6: dload 58
      // 5e8: ldc2_w -0.7
      // 5eb: dcmpl
      // 5ec: iload 19
      // 5ee: ifeq 5a6
      // 5f1: goto 5f8
      // 5f4: invokestatic a30.a (Loov;)Loov;
      // 5f7: athrow
      // 5f8: ifle 68a
      // 5fb: dload 52
      // 5fd: dload 52
      // 5ff: dmul
      // 600: dload 58
      // 602: dload 58
      // 604: dmul
      // 605: dadd
      // 606: dload 55
      // 608: dload 55
      // 60a: dmul
      // 60b: dadd
      // 60c: dconst_1
      // 60d: dcmpg
      // 60e: ifge 68a
      // 611: goto 618
      // 614: invokestatic a30.a (Loov;)Loov;
      // 617: athrow
      // 618: aload 5
      // 61a: iload 51
      // 61c: iload 57
      // 61e: iload 54
      // 620: invokevirtual lno.ql9 (III)Lzfz;
      // 623: astore 60
      // 625: aload 60
      // 627: invokeinterface zfz.r_y ()Le0x; 1
      // 62c: getstatic ox_.pzt Le0x;
      // 62f: iload 19
      // 631: ifeq 65b
      // 634: if_acmpeq 672
      // 637: goto 63e
      // 63a: invokestatic a30.a (Loov;)Loov;
      // 63d: athrow
      // 63e: aload 60
      // 640: invokeinterface zfz.r_y ()Le0x; 1
      // 645: iload 19
      // 647: ifeq 66c
      // 64a: goto 651
      // 64d: invokestatic a30.a (Loov;)Loov;
      // 650: athrow
      // 651: getstatic ox_.kqk Le0x;
      // 654: goto 65b
      // 657: invokestatic a30.a (Loov;)Loov;
      // 65a: athrow
      // 65b: if_acmpeq 672
      // 65e: aload 60
      // 660: invokeinterface zfz.r_y ()Le0x; 1
      // 665: goto 66c
      // 668: invokestatic a30.a (Loov;)Loov;
      // 66b: athrow
      // 66c: getstatic ox_.l11 Lx82;
      // 66f: if_acmpne 68a
      // 672: aload 5
      // 674: iload 51
      // 676: iload 57
      // 678: iload 54
      // 67a: getstatic ox_.ibw Le0x;
      // 67d: invokevirtual e0x.l4i ()Lzfz;
      // 680: invokevirtual lno.x6f (IIILzfz;)V
      // 683: goto 68a
      // 686: invokestatic a30.a (Loov;)Loov;
      // 689: athrow
      // 68a: iinc 57 -1
      // 68d: iload 19
      // 68f: ifne 5c9
      // 692: iinc 54 1
      // 695: iload 19
      // 697: ifne 5a4
      // 69a: iinc 51 1
      // 69d: iload 19
      // 69f: ifne 580
      // 6a2: iload 27
      // 6a4: ifeq 6aa
      // 6a7: goto 6b2
      // 6aa: iinc 15 1
      // 6ad: iload 19
      // 6af: ifne 0a0
      // 6b2: return
   }

   @Override
   public void bjr(OpaquePredicate var1, int var2, int var3, int var4, int var5, lno var6) {
      int var7 = OpaquePredicate.b();
      int var8 = this.a0f.nextInt(this.a0f.nextInt(this.a0f.nextInt(10) + 1) + 1);

      int var10000;
      label70: {
         label69: {
            try {
               var10000 = this.a0f.nextInt(5);
               if (var7 == 0) {
                  break label70;
               }

               if (var10000 == 0) {
                  break label69;
               }
            } catch (oov var23) {
               throw a(var23);
            }

            var8 = 0;
         }

         var10000 = 0;
      }

      int var9 = var10000;

      while (var9 < var8) {
         double var10 = (double)(var2 * 16 + this.a0f.nextInt(16));
         double var12 = (double)this.a0f.nextInt(128);
         double var14 = (double)(var3 * 16 + this.a0f.nextInt(16));
         int var16 = 1;

         label57: {
            label56: {
               try {
                  var10000 = this.a0f.nextInt(4);
                  if (var7 == 0) {
                     break label57;
                  }

                  if (var10000 != 0) {
                     break label56;
                  }
               } catch (oov var22) {
                  throw a(var22);
               }

               this.h97(this.a0f.nextLong(), var4, var5, var6, var10, var12, var14);
               var16 += this.a0f.nextInt(4);
            }

            var10000 = 0;
         }

         int var17 = var10000;

         while (true) {
            if (var17 < var16) {
               float var18 = this.a0f.nextFloat() * (float) Math.PI * 2.0F;
               float var19 = (this.a0f.nextFloat() - 0.5F) * 2.0F / 8.0F;
               float var20 = this.a0f.nextFloat() * 2.0F + this.a0f.nextFloat();

               try {
                  this.vzm(this.a0f.nextLong(), var4, var5, var6, var10, var12, var14, var20 * 2.0F, var18, var19, 0, 0, 0.5);
                  var17++;
                  if (var7 == 0) {
                     break;
                  }

                  if (var7 != 0) {
                     continue;
                  }
               } catch (oov var21) {
                  throw a(var21);
               }
            }

            var9++;
            break;
         }

         if (var7 == 0) {
            break;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
