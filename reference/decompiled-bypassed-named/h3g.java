import java.util.Random;

public class h3g extends cdu {
   public h3g(e0x var1) {
      this.opp = var1;
   }

   @Override
   public boolean v3g(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 3
      // 006: bipush -8
      // 008: bipush 0
      // 009: bipush -8
      // 00b: invokevirtual mew.ec4 (III)Lmew;
      // 00e: astore 3
      // 00f: aload 3
      // 010: invokevirtual mew.getY ()I
      // 013: bipush 5
      // 014: if_icmple 041
      // 017: aload 1
      // 018: aload 3
      // 019: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 01c: iload 4
      // 01e: ifne 045
      // 021: iload 4
      // 023: ifne 045
      // 026: goto 02d
      // 029: invokestatic h3g.a (Loov;)Loov;
      // 02c: athrow
      // 02d: ifeq 041
      // 030: goto 037
      // 033: invokestatic h3g.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 3
      // 038: invokevirtual mew.eve ()Lmew;
      // 03b: astore 3
      // 03c: iload 4
      // 03e: ifeq 00f
      // 041: aload 3
      // 042: invokevirtual mew.getY ()I
      // 045: iload 4
      // 047: ifne 064
      // 04a: bipush 4
      // 04b: if_icmpgt 05b
      // 04e: goto 055
      // 051: invokestatic h3g.a (Loov;)Loov;
      // 054: athrow
      // 055: bipush 0
      // 056: ireturn
      // 057: invokestatic h3g.a (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 3
      // 05c: bipush 4
      // 05d: invokevirtual mew.rb6 (I)Lmew;
      // 060: astore 3
      // 061: sipush 2048
      // 064: newarray 4
      // 066: astore 5
      // 068: aload 2
      // 069: bipush 4
      // 06a: invokevirtual java/util/Random.nextInt (I)I
      // 06d: bipush 4
      // 06e: iadd
      // 06f: istore 6
      // 071: bipush 0
      // 072: istore 7
      // 074: iload 7
      // 076: iload 6
      // 078: if_icmpge 1b3
      // 07b: aload 2
      // 07c: invokevirtual java/util/Random.nextDouble ()D
      // 07f: ldc2_w 6.0
      // 082: dmul
      // 083: ldc2_w 3.0
      // 086: dadd
      // 087: dstore 8
      // 089: aload 2
      // 08a: invokevirtual java/util/Random.nextDouble ()D
      // 08d: ldc2_w 4.0
      // 090: dmul
      // 091: ldc2_w 2.0
      // 094: dadd
      // 095: dstore 10
      // 097: aload 2
      // 098: invokevirtual java/util/Random.nextDouble ()D
      // 09b: ldc2_w 6.0
      // 09e: dmul
      // 09f: ldc2_w 3.0
      // 0a2: dadd
      // 0a3: dstore 12
      // 0a5: aload 2
      // 0a6: invokevirtual java/util/Random.nextDouble ()D
      // 0a9: ldc2_w 16.0
      // 0ac: dload 8
      // 0ae: dsub
      // 0af: ldc2_w 2.0
      // 0b2: dsub
      // 0b3: dmul
      // 0b4: dconst_1
      // 0b5: dadd
      // 0b6: dload 8
      // 0b8: ldc2_w 2.0
      // 0bb: ddiv
      // 0bc: dadd
      // 0bd: dstore 14
      // 0bf: aload 2
      // 0c0: invokevirtual java/util/Random.nextDouble ()D
      // 0c3: ldc2_w 8.0
      // 0c6: dload 10
      // 0c8: dsub
      // 0c9: ldc2_w 4.0
      // 0cc: dsub
      // 0cd: dmul
      // 0ce: ldc2_w 2.0
      // 0d1: dadd
      // 0d2: dload 10
      // 0d4: ldc2_w 2.0
      // 0d7: ddiv
      // 0d8: dadd
      // 0d9: dstore 16
      // 0db: aload 2
      // 0dc: invokevirtual java/util/Random.nextDouble ()D
      // 0df: ldc2_w 16.0
      // 0e2: dload 12
      // 0e4: dsub
      // 0e5: ldc2_w 2.0
      // 0e8: dsub
      // 0e9: dmul
      // 0ea: dconst_1
      // 0eb: dadd
      // 0ec: dload 12
      // 0ee: ldc2_w 2.0
      // 0f1: ddiv
      // 0f2: dadd
      // 0f3: dstore 18
      // 0f5: bipush 1
      // 0f6: iload 4
      // 0f8: ifne 1b4
      // 0fb: istore 20
      // 0fd: iload 20
      // 0ff: bipush 15
      // 101: if_icmpge 1ab
      // 104: bipush 1
      // 105: iload 4
      // 107: ifne 076
      // 10a: istore 21
      // 10c: iload 21
      // 10e: bipush 15
      // 110: if_icmpge 1a3
      // 113: bipush 1
      // 114: iload 4
      // 116: ifne 0ff
      // 119: istore 22
      // 11b: iload 22
      // 11d: bipush 7
      // 11f: if_icmpge 19b
      // 122: iload 20
      // 124: i2d
      // 125: dload 14
      // 127: dsub
      // 128: dload 8
      // 12a: ldc2_w 2.0
      // 12d: ddiv
      // 12e: ddiv
      // 12f: dstore 23
      // 131: iload 22
      // 133: i2d
      // 134: dload 16
      // 136: dsub
      // 137: dload 10
      // 139: ldc2_w 2.0
      // 13c: ddiv
      // 13d: ddiv
      // 13e: dstore 25
      // 140: iload 21
      // 142: i2d
      // 143: dload 18
      // 145: dsub
      // 146: dload 12
      // 148: ldc2_w 2.0
      // 14b: ddiv
      // 14c: ddiv
      // 14d: dstore 27
      // 14f: dload 23
      // 151: dload 23
      // 153: dmul
      // 154: dload 25
      // 156: dload 25
      // 158: dmul
      // 159: dadd
      // 15a: dload 27
      // 15c: dload 27
      // 15e: dmul
      // 15f: dadd
      // 160: dstore 29
      // 162: iload 4
      // 164: ifne 196
      // 167: dload 29
      // 169: dconst_1
      // 16a: dcmpg
      // 16b: iload 4
      // 16d: ifne 10e
      // 170: goto 177
      // 173: invokestatic h3g.a (Loov;)Loov;
      // 176: athrow
      // 177: ifge 193
      // 17a: aload 5
      // 17c: iload 20
      // 17e: bipush 16
      // 180: imul
      // 181: iload 21
      // 183: iadd
      // 184: bipush 8
      // 186: imul
      // 187: iload 22
      // 189: iadd
      // 18a: bipush 1
      // 18b: bastore
      // 18c: goto 193
      // 18f: invokestatic h3g.a (Loov;)Loov;
      // 192: athrow
      // 193: iinc 22 1
      // 196: iload 4
      // 198: ifeq 11b
      // 19b: iinc 21 1
      // 19e: iload 4
      // 1a0: ifeq 10c
      // 1a3: iinc 20 1
      // 1a6: iload 4
      // 1a8: ifeq 0fd
      // 1ab: iinc 7 1
      // 1ae: iload 4
      // 1b0: ifeq 074
      // 1b3: bipush 0
      // 1b4: istore 7
      // 1b6: iload 7
      // 1b8: bipush 16
      // 1ba: if_icmpge 425
      // 1bd: bipush 0
      // 1be: iload 4
      // 1c0: ifne 426
      // 1c3: istore 8
      // 1c5: iload 8
      // 1c7: bipush 16
      // 1c9: if_icmpge 41d
      // 1cc: bipush 0
      // 1cd: iload 4
      // 1cf: ifne 1b8
      // 1d2: istore 9
      // 1d4: iload 9
      // 1d6: bipush 8
      // 1d8: if_icmpge 415
      // 1db: aload 5
      // 1dd: iload 7
      // 1df: bipush 16
      // 1e1: imul
      // 1e2: iload 8
      // 1e4: iadd
      // 1e5: bipush 8
      // 1e7: imul
      // 1e8: iload 9
      // 1ea: iadd
      // 1eb: baload
      // 1ec: iload 4
      // 1ee: ifne 1c7
      // 1f1: iload 4
      // 1f3: ifne 202
      // 1f6: ifne 366
      // 1f9: goto 200
      // 1fc: invokestatic h3g.a (Loov;)Loov;
      // 1ff: athrow
      // 200: iload 7
      // 202: iload 4
      // 204: ifne 23e
      // 207: bipush 15
      // 209: if_icmpge 23c
      // 20c: goto 213
      // 20f: invokestatic h3g.a (Loov;)Loov;
      // 212: athrow
      // 213: aload 5
      // 215: iload 7
      // 217: bipush 1
      // 218: iadd
      // 219: bipush 16
      // 21b: imul
      // 21c: iload 8
      // 21e: iadd
      // 21f: bipush 8
      // 221: imul
      // 222: iload 9
      // 224: iadd
      // 225: baload
      // 226: iload 4
      // 228: ifne 363
      // 22b: goto 232
      // 22e: invokestatic h3g.a (Loov;)Loov;
      // 231: athrow
      // 232: ifne 362
      // 235: goto 23c
      // 238: invokestatic h3g.a (Loov;)Loov;
      // 23b: athrow
      // 23c: iload 7
      // 23e: iload 4
      // 240: ifne 278
      // 243: ifle 276
      // 246: goto 24d
      // 249: invokestatic h3g.a (Loov;)Loov;
      // 24c: athrow
      // 24d: aload 5
      // 24f: iload 7
      // 251: bipush 1
      // 252: isub
      // 253: bipush 16
      // 255: imul
      // 256: iload 8
      // 258: iadd
      // 259: bipush 8
      // 25b: imul
      // 25c: iload 9
      // 25e: iadd
      // 25f: baload
      // 260: iload 4
      // 262: ifne 363
      // 265: goto 26c
      // 268: invokestatic h3g.a (Loov;)Loov;
      // 26b: athrow
      // 26c: ifne 362
      // 26f: goto 276
      // 272: invokestatic h3g.a (Loov;)Loov;
      // 275: athrow
      // 276: iload 8
      // 278: iload 4
      // 27a: ifne 2b4
      // 27d: bipush 15
      // 27f: if_icmpge 2b2
      // 282: goto 289
      // 285: invokestatic h3g.a (Loov;)Loov;
      // 288: athrow
      // 289: aload 5
      // 28b: iload 7
      // 28d: bipush 16
      // 28f: imul
      // 290: iload 8
      // 292: iadd
      // 293: bipush 1
      // 294: iadd
      // 295: bipush 8
      // 297: imul
      // 298: iload 9
      // 29a: iadd
      // 29b: baload
      // 29c: iload 4
      // 29e: ifne 363
      // 2a1: goto 2a8
      // 2a4: invokestatic h3g.a (Loov;)Loov;
      // 2a7: athrow
      // 2a8: ifne 362
      // 2ab: goto 2b2
      // 2ae: invokestatic h3g.a (Loov;)Loov;
      // 2b1: athrow
      // 2b2: iload 8
      // 2b4: iload 4
      // 2b6: ifne 2ee
      // 2b9: ifle 2ec
      // 2bc: goto 2c3
      // 2bf: invokestatic h3g.a (Loov;)Loov;
      // 2c2: athrow
      // 2c3: aload 5
      // 2c5: iload 7
      // 2c7: bipush 16
      // 2c9: imul
      // 2ca: iload 8
      // 2cc: bipush 1
      // 2cd: isub
      // 2ce: iadd
      // 2cf: bipush 8
      // 2d1: imul
      // 2d2: iload 9
      // 2d4: iadd
      // 2d5: baload
      // 2d6: iload 4
      // 2d8: ifne 363
      // 2db: goto 2e2
      // 2de: invokestatic h3g.a (Loov;)Loov;
      // 2e1: athrow
      // 2e2: ifne 362
      // 2e5: goto 2ec
      // 2e8: invokestatic h3g.a (Loov;)Loov;
      // 2eb: athrow
      // 2ec: iload 9
      // 2ee: iload 4
      // 2f0: ifne 32a
      // 2f3: bipush 7
      // 2f5: if_icmpge 328
      // 2f8: goto 2ff
      // 2fb: invokestatic h3g.a (Loov;)Loov;
      // 2fe: athrow
      // 2ff: aload 5
      // 301: iload 7
      // 303: bipush 16
      // 305: imul
      // 306: iload 8
      // 308: iadd
      // 309: bipush 8
      // 30b: imul
      // 30c: iload 9
      // 30e: iadd
      // 30f: bipush 1
      // 310: iadd
      // 311: baload
      // 312: iload 4
      // 314: ifne 363
      // 317: goto 31e
      // 31a: invokestatic h3g.a (Loov;)Loov;
      // 31d: athrow
      // 31e: ifne 362
      // 321: goto 328
      // 324: invokestatic h3g.a (Loov;)Loov;
      // 327: athrow
      // 328: iload 9
      // 32a: iload 4
      // 32c: ifne 353
      // 32f: ifle 366
      // 332: goto 339
      // 335: invokestatic h3g.a (Loov;)Loov;
      // 338: athrow
      // 339: aload 5
      // 33b: iload 7
      // 33d: bipush 16
      // 33f: imul
      // 340: iload 8
      // 342: iadd
      // 343: bipush 8
      // 345: imul
      // 346: iload 9
      // 348: bipush 1
      // 349: isub
      // 34a: iadd
      // 34b: baload
      // 34c: goto 353
      // 34f: invokestatic h3g.a (Loov;)Loov;
      // 352: athrow
      // 353: iload 4
      // 355: ifne 363
      // 358: ifeq 366
      // 35b: goto 362
      // 35e: invokestatic h3g.a (Loov;)Loov;
      // 361: athrow
      // 362: bipush 1
      // 363: goto 367
      // 366: bipush 0
      // 367: istore 10
      // 369: iload 4
      // 36b: ifne 410
      // 36e: iload 10
      // 370: ifeq 40d
      // 373: goto 37a
      // 376: invokestatic h3g.a (Loov;)Loov;
      // 379: athrow
      // 37a: aload 1
      // 37b: aload 3
      // 37c: iload 7
      // 37e: iload 9
      // 380: iload 8
      // 382: invokevirtual mew.ec4 (III)Lmew;
      // 385: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 388: invokeinterface zfz.r_y ()Le0x; 1
      // 38d: invokevirtual e0x.p1r ()Lp3y;
      // 390: astore 11
      // 392: iload 9
      // 394: bipush 4
      // 395: iload 4
      // 397: ifne 3d4
      // 39a: if_icmplt 3c5
      // 39d: goto 3a4
      // 3a0: invokestatic h3g.a (Loov;)Loov;
      // 3a3: athrow
      // 3a4: aload 11
      // 3a6: invokevirtual p3y.l7j ()Z
      // 3a9: iload 4
      // 3ab: ifne 3c7
      // 3ae: goto 3b5
      // 3b1: invokestatic h3g.a (Loov;)Loov;
      // 3b4: athrow
      // 3b5: ifeq 3c5
      // 3b8: goto 3bf
      // 3bb: invokestatic h3g.a (Loov;)Loov;
      // 3be: athrow
      // 3bf: bipush 0
      // 3c0: ireturn
      // 3c1: invokestatic h3g.a (Loov;)Loov;
      // 3c4: athrow
      // 3c5: iload 9
      // 3c7: iload 4
      // 3c9: ifne 3e3
      // 3cc: bipush 4
      // 3cd: goto 3d4
      // 3d0: invokestatic h3g.a (Loov;)Loov;
      // 3d3: athrow
      // 3d4: if_icmpge 40d
      // 3d7: aload 11
      // 3d9: invokevirtual p3y.gk6 ()Z
      // 3dc: goto 3e3
      // 3df: invokestatic h3g.a (Loov;)Loov;
      // 3e2: athrow
      // 3e3: ifne 40d
      // 3e6: aload 1
      // 3e7: aload 3
      // 3e8: iload 7
      // 3ea: iload 9
      // 3ec: iload 8
      // 3ee: invokevirtual mew.ec4 (III)Lmew;
      // 3f1: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3f4: invokeinterface zfz.r_y ()Le0x; 1
      // 3f9: aload 0
      // 3fa: getfield h3g.opp Le0x;
      // 3fd: if_acmpeq 40d
      // 400: goto 407
      // 403: invokestatic h3g.a (Loov;)Loov;
      // 406: athrow
      // 407: bipush 0
      // 408: ireturn
      // 409: invokestatic h3g.a (Loov;)Loov;
      // 40c: athrow
      // 40d: iinc 9 1
      // 410: iload 4
      // 412: ifeq 1d4
      // 415: iinc 8 1
      // 418: iload 4
      // 41a: ifeq 1c5
      // 41d: iinc 7 1
      // 420: iload 4
      // 422: ifeq 1b6
      // 425: bipush 0
      // 426: istore 7
      // 428: iload 7
      // 42a: bipush 16
      // 42c: if_icmpge 4af
      // 42f: bipush 0
      // 430: iload 4
      // 432: ifne 4b0
      // 435: istore 8
      // 437: iload 8
      // 439: bipush 16
      // 43b: if_icmpge 4a7
      // 43e: bipush 0
      // 43f: iload 4
      // 441: ifne 42a
      // 444: istore 9
      // 446: iload 9
      // 448: bipush 8
      // 44a: if_icmpge 49f
      // 44d: aload 5
      // 44f: iload 7
      // 451: bipush 16
      // 453: imul
      // 454: iload 8
      // 456: iadd
      // 457: bipush 8
      // 459: imul
      // 45a: iload 9
      // 45c: iadd
      // 45d: baload
      // 45e: iload 4
      // 460: ifne 439
      // 463: ifeq 497
      // 466: aload 1
      // 467: aload 3
      // 468: iload 7
      // 46a: iload 9
      // 46c: iload 8
      // 46e: invokevirtual mew.ec4 (III)Lmew;
      // 471: iload 9
      // 473: bipush 4
      // 474: if_icmplt 48b
      // 477: goto 47e
      // 47a: invokestatic h3g.a (Loov;)Loov;
      // 47d: athrow
      // 47e: getstatic ox_.ibw Le0x;
      // 481: invokevirtual e0x.l4i ()Lzfz;
      // 484: goto 492
      // 487: invokestatic h3g.a (Loov;)Loov;
      // 48a: athrow
      // 48b: aload 0
      // 48c: getfield h3g.opp Le0x;
      // 48f: invokevirtual e0x.l4i ()Lzfz;
      // 492: bipush 2
      // 493: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 496: pop
      // 497: iinc 9 1
      // 49a: iload 4
      // 49c: ifeq 446
      // 49f: iinc 8 1
      // 4a2: iload 4
      // 4a4: ifeq 437
      // 4a7: iinc 7 1
      // 4aa: iload 4
      // 4ac: ifeq 428
      // 4af: bipush 0
      // 4b0: istore 7
      // 4b2: iload 7
      // 4b4: bipush 16
      // 4b6: if_icmpge 5b4
      // 4b9: bipush 0
      // 4ba: iload 4
      // 4bc: ifne 8a5
      // 4bf: istore 8
      // 4c1: iload 8
      // 4c3: bipush 16
      // 4c5: if_icmpge 5ac
      // 4c8: bipush 4
      // 4c9: iload 4
      // 4cb: ifne 4b4
      // 4ce: istore 9
      // 4d0: iload 9
      // 4d2: bipush 8
      // 4d4: if_icmpge 5a4
      // 4d7: aload 5
      // 4d9: iload 7
      // 4db: bipush 16
      // 4dd: imul
      // 4de: iload 8
      // 4e0: iadd
      // 4e1: bipush 8
      // 4e3: imul
      // 4e4: iload 9
      // 4e6: iadd
      // 4e7: baload
      // 4e8: iload 4
      // 4ea: ifne 4c3
      // 4ed: ifeq 59c
      // 4f0: aload 3
      // 4f1: iload 7
      // 4f3: iload 9
      // 4f5: bipush 1
      // 4f6: isub
      // 4f7: iload 8
      // 4f9: invokevirtual mew.ec4 (III)Lmew;
      // 4fc: astore 10
      // 4fe: iload 4
      // 500: ifne 59f
      // 503: aload 1
      // 504: aload 10
      // 506: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 509: invokeinterface zfz.r_y ()Le0x; 1
      // 50e: getstatic ox_.kqk Le0x;
      // 511: if_acmpne 59c
      // 514: goto 51b
      // 517: invokestatic h3g.a (Loov;)Loov;
      // 51a: athrow
      // 51b: aload 1
      // 51c: iload 4
      // 51e: ifne 54a
      // 521: goto 528
      // 524: invokestatic h3g.a (Loov;)Loov;
      // 527: athrow
      // 528: getstatic qe5.sf9 Lqe5;
      // 52b: aload 3
      // 52c: iload 7
      // 52e: iload 9
      // 530: iload 8
      // 532: invokevirtual mew.ec4 (III)Lmew;
      // 535: invokevirtual OpaquePredicate.qkq (Lqe5;Lmew;)I
      // 538: ifle 59c
      // 53b: goto 542
      // 53e: invokestatic h3g.a (Loov;)Loov;
      // 541: athrow
      // 542: aload 1
      // 543: goto 54a
      // 546: invokestatic h3g.a (Loov;)Loov;
      // 549: athrow
      // 54a: aload 10
      // 54c: invokevirtual OpaquePredicate.getBiomeGenForCoords (Lmew;)Lgyu;
      // 54f: astore 11
      // 551: iload 4
      // 553: ifne 582
      // 556: aload 11
      // 558: getfield gyu.ke4 Lzfz;
      // 55b: invokeinterface zfz.r_y ()Le0x; 1
      // 560: getstatic ox_.pl8 Lp48;
      // 563: if_acmpne 587
      // 566: goto 56d
      // 569: invokestatic h3g.a (Loov;)Loov;
      // 56c: athrow
      // 56d: aload 1
      // 56e: aload 10
      // 570: getstatic ox_.pl8 Lp48;
      // 573: invokevirtual p48.l4i ()Lzfz;
      // 576: bipush 2
      // 577: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 57a: pop
      // 57b: goto 582
      // 57e: invokestatic h3g.a (Loov;)Loov;
      // 581: athrow
      // 582: iload 4
      // 584: ifeq 59c
      // 587: aload 1
      // 588: aload 10
      // 58a: getstatic ox_.l11 Lx82;
      // 58d: invokevirtual x82.l4i ()Lzfz;
      // 590: bipush 2
      // 591: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 594: pop
      // 595: goto 59c
      // 598: invokestatic h3g.a (Loov;)Loov;
      // 59b: athrow
      // 59c: iinc 9 1
      // 59f: iload 4
      // 5a1: ifeq 4d0
      // 5a4: iinc 8 1
      // 5a7: iload 4
      // 5a9: ifeq 4c1
      // 5ac: iinc 7 1
      // 5af: iload 4
      // 5b1: ifeq 4b2
      // 5b4: aload 0
      // 5b5: getfield h3g.opp Le0x;
      // 5b8: invokevirtual e0x.p1r ()Lp3y;
      // 5bb: getstatic p3y.e1s Lp3y;
      // 5be: iload 4
      // 5c0: ifne 836
      // 5c3: if_acmpne 82c
      // 5c6: goto 5cd
      // 5c9: invokestatic h3g.a (Loov;)Loov;
      // 5cc: athrow
      // 5cd: bipush 0
      // 5ce: istore 7
      // 5d0: iload 7
      // 5d2: bipush 16
      // 5d4: if_icmpge 82c
      // 5d7: bipush 0
      // 5d8: iload 4
      // 5da: ifne 8a5
      // 5dd: istore 8
      // 5df: iload 8
      // 5e1: bipush 16
      // 5e3: if_icmpge 824
      // 5e6: bipush 0
      // 5e7: iload 4
      // 5e9: ifne 5d2
      // 5ec: istore 9
      // 5ee: iload 9
      // 5f0: bipush 8
      // 5f2: if_icmpge 81c
      // 5f5: aload 5
      // 5f7: iload 7
      // 5f9: bipush 16
      // 5fb: imul
      // 5fc: iload 8
      // 5fe: iadd
      // 5ff: bipush 8
      // 601: imul
      // 602: iload 9
      // 604: iadd
      // 605: baload
      // 606: iload 4
      // 608: ifne 5e1
      // 60b: iload 4
      // 60d: ifne 61c
      // 610: ifne 780
      // 613: goto 61a
      // 616: invokestatic h3g.a (Loov;)Loov;
      // 619: athrow
      // 61a: iload 7
      // 61c: iload 4
      // 61e: ifne 658
      // 621: bipush 15
      // 623: if_icmpge 656
      // 626: goto 62d
      // 629: invokestatic h3g.a (Loov;)Loov;
      // 62c: athrow
      // 62d: aload 5
      // 62f: iload 7
      // 631: bipush 1
      // 632: iadd
      // 633: bipush 16
      // 635: imul
      // 636: iload 8
      // 638: iadd
      // 639: bipush 8
      // 63b: imul
      // 63c: iload 9
      // 63e: iadd
      // 63f: baload
      // 640: iload 4
      // 642: ifne 77d
      // 645: goto 64c
      // 648: invokestatic h3g.a (Loov;)Loov;
      // 64b: athrow
      // 64c: ifne 77c
      // 64f: goto 656
      // 652: invokestatic h3g.a (Loov;)Loov;
      // 655: athrow
      // 656: iload 7
      // 658: iload 4
      // 65a: ifne 692
      // 65d: ifle 690
      // 660: goto 667
      // 663: invokestatic h3g.a (Loov;)Loov;
      // 666: athrow
      // 667: aload 5
      // 669: iload 7
      // 66b: bipush 1
      // 66c: isub
      // 66d: bipush 16
      // 66f: imul
      // 670: iload 8
      // 672: iadd
      // 673: bipush 8
      // 675: imul
      // 676: iload 9
      // 678: iadd
      // 679: baload
      // 67a: iload 4
      // 67c: ifne 77d
      // 67f: goto 686
      // 682: invokestatic h3g.a (Loov;)Loov;
      // 685: athrow
      // 686: ifne 77c
      // 689: goto 690
      // 68c: invokestatic h3g.a (Loov;)Loov;
      // 68f: athrow
      // 690: iload 8
      // 692: iload 4
      // 694: ifne 6ce
      // 697: bipush 15
      // 699: if_icmpge 6cc
      // 69c: goto 6a3
      // 69f: invokestatic h3g.a (Loov;)Loov;
      // 6a2: athrow
      // 6a3: aload 5
      // 6a5: iload 7
      // 6a7: bipush 16
      // 6a9: imul
      // 6aa: iload 8
      // 6ac: iadd
      // 6ad: bipush 1
      // 6ae: iadd
      // 6af: bipush 8
      // 6b1: imul
      // 6b2: iload 9
      // 6b4: iadd
      // 6b5: baload
      // 6b6: iload 4
      // 6b8: ifne 77d
      // 6bb: goto 6c2
      // 6be: invokestatic h3g.a (Loov;)Loov;
      // 6c1: athrow
      // 6c2: ifne 77c
      // 6c5: goto 6cc
      // 6c8: invokestatic h3g.a (Loov;)Loov;
      // 6cb: athrow
      // 6cc: iload 8
      // 6ce: iload 4
      // 6d0: ifne 708
      // 6d3: ifle 706
      // 6d6: goto 6dd
      // 6d9: invokestatic h3g.a (Loov;)Loov;
      // 6dc: athrow
      // 6dd: aload 5
      // 6df: iload 7
      // 6e1: bipush 16
      // 6e3: imul
      // 6e4: iload 8
      // 6e6: bipush 1
      // 6e7: isub
      // 6e8: iadd
      // 6e9: bipush 8
      // 6eb: imul
      // 6ec: iload 9
      // 6ee: iadd
      // 6ef: baload
      // 6f0: iload 4
      // 6f2: ifne 77d
      // 6f5: goto 6fc
      // 6f8: invokestatic h3g.a (Loov;)Loov;
      // 6fb: athrow
      // 6fc: ifne 77c
      // 6ff: goto 706
      // 702: invokestatic h3g.a (Loov;)Loov;
      // 705: athrow
      // 706: iload 9
      // 708: iload 4
      // 70a: ifne 744
      // 70d: bipush 7
      // 70f: if_icmpge 742
      // 712: goto 719
      // 715: invokestatic h3g.a (Loov;)Loov;
      // 718: athrow
      // 719: aload 5
      // 71b: iload 7
      // 71d: bipush 16
      // 71f: imul
      // 720: iload 8
      // 722: iadd
      // 723: bipush 8
      // 725: imul
      // 726: iload 9
      // 728: iadd
      // 729: bipush 1
      // 72a: iadd
      // 72b: baload
      // 72c: iload 4
      // 72e: ifne 77d
      // 731: goto 738
      // 734: invokestatic h3g.a (Loov;)Loov;
      // 737: athrow
      // 738: ifne 77c
      // 73b: goto 742
      // 73e: invokestatic h3g.a (Loov;)Loov;
      // 741: athrow
      // 742: iload 9
      // 744: iload 4
      // 746: ifne 76d
      // 749: ifle 780
      // 74c: goto 753
      // 74f: invokestatic h3g.a (Loov;)Loov;
      // 752: athrow
      // 753: aload 5
      // 755: iload 7
      // 757: bipush 16
      // 759: imul
      // 75a: iload 8
      // 75c: iadd
      // 75d: bipush 8
      // 75f: imul
      // 760: iload 9
      // 762: bipush 1
      // 763: isub
      // 764: iadd
      // 765: baload
      // 766: goto 76d
      // 769: invokestatic h3g.a (Loov;)Loov;
      // 76c: athrow
      // 76d: iload 4
      // 76f: ifne 77d
      // 772: ifeq 780
      // 775: goto 77c
      // 778: invokestatic h3g.a (Loov;)Loov;
      // 77b: athrow
      // 77c: bipush 1
      // 77d: goto 781
      // 780: bipush 0
      // 781: istore 10
      // 783: iload 4
      // 785: ifne 817
      // 788: iload 10
      // 78a: ifeq 814
      // 78d: goto 794
      // 790: invokestatic h3g.a (Loov;)Loov;
      // 793: athrow
      // 794: iload 9
      // 796: iload 4
      // 798: ifne 7e8
      // 79b: goto 7a2
      // 79e: invokestatic h3g.a (Loov;)Loov;
      // 7a1: athrow
      // 7a2: bipush 4
      // 7a3: if_icmplt 7c8
      // 7a6: goto 7ad
      // 7a9: invokestatic h3g.a (Loov;)Loov;
      // 7ac: athrow
      // 7ad: aload 2
      // 7ae: bipush 2
      // 7af: invokevirtual java/util/Random.nextInt (I)I
      // 7b2: iload 4
      // 7b4: ifne 7e8
      // 7b7: goto 7be
      // 7ba: invokestatic h3g.a (Loov;)Loov;
      // 7bd: athrow
      // 7be: ifeq 814
      // 7c1: goto 7c8
      // 7c4: invokestatic h3g.a (Loov;)Loov;
      // 7c7: athrow
      // 7c8: aload 1
      // 7c9: aload 3
      // 7ca: iload 7
      // 7cc: iload 9
      // 7ce: iload 8
      // 7d0: invokevirtual mew.ec4 (III)Lmew;
      // 7d3: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 7d6: invokeinterface zfz.r_y ()Le0x; 1
      // 7db: invokevirtual e0x.p1r ()Lp3y;
      // 7de: invokevirtual p3y.gk6 ()Z
      // 7e1: goto 7e8
      // 7e4: invokestatic h3g.a (Loov;)Loov;
      // 7e7: athrow
      // 7e8: iload 4
      // 7ea: ifne 813
      // 7ed: ifeq 814
      // 7f0: goto 7f7
      // 7f3: invokestatic h3g.a (Loov;)Loov;
      // 7f6: athrow
      // 7f7: aload 1
      // 7f8: aload 3
      // 7f9: iload 7
      // 7fb: iload 9
      // 7fd: iload 8
      // 7ff: invokevirtual mew.ec4 (III)Lmew;
      // 802: getstatic ox_.pu8 Le0x;
      // 805: invokevirtual e0x.l4i ()Lzfz;
      // 808: bipush 2
      // 809: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 80c: goto 813
      // 80f: invokestatic h3g.a (Loov;)Loov;
      // 812: athrow
      // 813: pop
      // 814: iinc 9 1
      // 817: iload 4
      // 819: ifeq 5ee
      // 81c: iinc 8 1
      // 81f: iload 4
      // 821: ifeq 5df
      // 824: iinc 7 1
      // 827: iload 4
      // 829: ifeq 5d0
      // 82c: aload 0
      // 82d: getfield h3g.opp Le0x;
      // 830: invokevirtual e0x.p1r ()Lp3y;
      // 833: getstatic p3y.six Lp3y;
      // 836: if_acmpne 8a4
      // 839: bipush 0
      // 83a: istore 7
      // 83c: iload 7
      // 83e: bipush 16
      // 840: if_icmpge 8a4
      // 843: bipush 0
      // 844: iload 4
      // 846: ifne 8a5
      // 849: istore 8
      // 84b: iload 8
      // 84d: bipush 16
      // 84f: if_icmpge 89c
      // 852: bipush 4
      // 853: istore 9
      // 855: iload 4
      // 857: ifne 897
      // 85a: aload 1
      // 85b: aload 3
      // 85c: iload 7
      // 85e: iload 9
      // 860: iload 8
      // 862: invokevirtual mew.ec4 (III)Lmew;
      // 865: invokevirtual OpaquePredicate.mjf (Lmew;)Z
      // 868: iload 4
      // 86a: ifne 83e
      // 86d: goto 874
      // 870: invokestatic h3g.a (Loov;)Loov;
      // 873: athrow
      // 874: ifeq 894
      // 877: aload 1
      // 878: aload 3
      // 879: iload 7
      // 87b: iload 9
      // 87d: iload 8
      // 87f: invokevirtual mew.ec4 (III)Lmew;
      // 882: getstatic ox_.f02 Le0x;
      // 885: invokevirtual e0x.l4i ()Lzfz;
      // 888: bipush 2
      // 889: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 88c: pop
      // 88d: goto 894
      // 890: invokestatic h3g.a (Loov;)Loov;
      // 893: athrow
      // 894: iinc 8 1
      // 897: iload 4
      // 899: ifeq 84b
      // 89c: iinc 7 1
      // 89f: iload 4
      // 8a1: ifeq 83c
      // 8a4: bipush 1
      // 8a5: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
