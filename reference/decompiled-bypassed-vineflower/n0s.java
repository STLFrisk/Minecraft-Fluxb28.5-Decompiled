import java.util.Random;

public class n0s extends e9q {
   private static final zfz huj = ox_.a4y.l4i().zvi(qgq.m_o, x54$lti.jtj);
   private static final zfz wap = ox_.x_c.l4i().zvi(xer.cq8, x54$lti.jtj).zvi(_cv.sdu, false);

   public n0s(boolean var1) {
      super(var1);
   }

   @Override
   public boolean v3g(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 2
      // 001: bipush 3
      // 002: invokevirtual java/util/Random.nextInt (I)I
      // 005: aload 2
      // 006: bipush 2
      // 007: invokevirtual java/util/Random.nextInt (I)I
      // 00a: iadd
      // 00b: bipush 6
      // 00d: iadd
      // 00e: istore 5
      // 010: invokestatic t9d.c ()I
      // 013: aload 3
      // 014: invokevirtual mew.getX ()I
      // 017: istore 6
      // 019: istore 4
      // 01b: aload 3
      // 01c: invokevirtual mew.getY ()I
      // 01f: istore 7
      // 021: aload 3
      // 022: invokevirtual mew.getZ ()I
      // 025: istore 8
      // 027: iload 7
      // 029: iload 4
      // 02b: ifne 66f
      // 02e: bipush 1
      // 02f: if_icmplt 66e
      // 032: goto 039
      // 035: invokestatic n0s.a (Loov;)Loov;
      // 038: athrow
      // 039: iload 7
      // 03b: iload 5
      // 03d: iadd
      // 03e: bipush 1
      // 03f: iadd
      // 040: iload 4
      // 042: ifne 66f
      // 045: goto 04c
      // 048: invokestatic n0s.a (Loov;)Loov;
      // 04b: athrow
      // 04c: sipush 256
      // 04f: if_icmpge 66e
      // 052: goto 059
      // 055: invokestatic n0s.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 3
      // 05a: invokevirtual mew.eve ()Lmew;
      // 05d: astore 9
      // 05f: aload 1
      // 060: aload 9
      // 062: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 065: invokeinterface zfz.r_y ()Le0x; 1
      // 06a: astore 10
      // 06c: aload 10
      // 06e: getstatic ox_.l11 Lx82;
      // 071: iload 4
      // 073: ifne 08c
      // 076: if_acmpeq 095
      // 079: goto 080
      // 07c: invokestatic n0s.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 10
      // 082: getstatic ox_.kqk Le0x;
      // 085: goto 08c
      // 088: invokestatic n0s.a (Loov;)Loov;
      // 08b: athrow
      // 08c: if_acmpeq 095
      // 08f: bipush 0
      // 090: ireturn
      // 091: invokestatic n0s.a (Loov;)Loov;
      // 094: athrow
      // 095: aload 0
      // 096: aload 1
      // 097: aload 3
      // 098: iload 4
      // 09a: ifne 0d7
      // 09d: iload 5
      // 09f: invokespecial n0s.a62 (Lt9d;Lmew;I)Z
      // 0a2: ifne 0b2
      // 0a5: goto 0ac
      // 0a8: invokestatic n0s.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: bipush 0
      // 0ad: ireturn
      // 0ae: invokestatic n0s.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: aload 0
      // 0b3: aload 1
      // 0b4: aload 9
      // 0b6: invokevirtual n0s.g27 (Lt9d;Lmew;)V
      // 0b9: aload 0
      // 0ba: aload 1
      // 0bb: aload 9
      // 0bd: invokevirtual mew.o_8 ()Lmew;
      // 0c0: invokevirtual n0s.g27 (Lt9d;Lmew;)V
      // 0c3: aload 0
      // 0c4: aload 1
      // 0c5: aload 9
      // 0c7: invokevirtual mew.z6x ()Lmew;
      // 0ca: invokevirtual n0s.g27 (Lt9d;Lmew;)V
      // 0cd: aload 0
      // 0ce: aload 1
      // 0cf: aload 9
      // 0d1: invokevirtual mew.z6x ()Lmew;
      // 0d4: invokevirtual mew.o_8 ()Lmew;
      // 0d7: invokevirtual n0s.g27 (Lt9d;Lmew;)V
      // 0da: getstatic vt2$unz.fzl Lvt2$unz;
      // 0dd: aload 2
      // 0de: invokevirtual vt2$unz.cvs (Ljava/util/Random;)Lvt2;
      // 0e1: astore 11
      // 0e3: iload 5
      // 0e5: aload 2
      // 0e6: bipush 4
      // 0e7: invokevirtual java/util/Random.nextInt (I)I
      // 0ea: isub
      // 0eb: istore 12
      // 0ed: bipush 2
      // 0ee: aload 2
      // 0ef: bipush 3
      // 0f0: invokevirtual java/util/Random.nextInt (I)I
      // 0f3: isub
      // 0f4: istore 13
      // 0f6: iload 6
      // 0f8: istore 14
      // 0fa: iload 8
      // 0fc: istore 15
      // 0fe: iload 7
      // 100: iload 5
      // 102: iadd
      // 103: bipush 1
      // 104: isub
      // 105: istore 16
      // 107: bipush 0
      // 108: istore 17
      // 10a: iload 17
      // 10c: iload 5
      // 10e: if_icmpge 1df
      // 111: iload 17
      // 113: iload 12
      // 115: iload 4
      // 117: ifne 38b
      // 11a: iload 4
      // 11c: ifne 163
      // 11f: goto 126
      // 122: invokestatic n0s.a (Loov;)Loov;
      // 125: athrow
      // 126: if_icmplt 15f
      // 129: goto 130
      // 12c: invokestatic n0s.a (Loov;)Loov;
      // 12f: athrow
      // 130: iload 13
      // 132: iload 4
      // 134: ifne 164
      // 137: goto 13e
      // 13a: invokestatic n0s.a (Loov;)Loov;
      // 13d: athrow
      // 13e: ifle 15f
      // 141: goto 148
      // 144: invokestatic n0s.a (Loov;)Loov;
      // 147: athrow
      // 148: iload 14
      // 14a: aload 11
      // 14c: invokevirtual vt2.n67 ()I
      // 14f: iadd
      // 150: istore 14
      // 152: iload 15
      // 154: aload 11
      // 156: invokevirtual vt2.ozy ()I
      // 159: iadd
      // 15a: istore 15
      // 15c: iinc 13 -1
      // 15f: iload 7
      // 161: iload 17
      // 163: iadd
      // 164: istore 18
      // 166: new mew
      // 169: dup
      // 16a: iload 14
      // 16c: iload 18
      // 16e: iload 15
      // 170: invokespecial mew.<init> (III)V
      // 173: astore 19
      // 175: aload 1
      // 176: aload 19
      // 178: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 17b: invokeinterface zfz.r_y ()Le0x; 1
      // 180: invokevirtual e0x.p1r ()Lp3y;
      // 183: astore 20
      // 185: iload 4
      // 187: ifne 1ca
      // 18a: aload 20
      // 18c: getstatic p3y.cei Lp3y;
      // 18f: if_acmpeq 1a8
      // 192: goto 199
      // 195: invokestatic n0s.a (Loov;)Loov;
      // 198: athrow
      // 199: aload 20
      // 19b: getstatic p3y.hh1 Lp3y;
      // 19e: if_acmpne 1d7
      // 1a1: goto 1a8
      // 1a4: invokestatic n0s.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: aload 0
      // 1a9: aload 1
      // 1aa: aload 19
      // 1ac: invokespecial n0s.gt6 (Lt9d;Lmew;)V
      // 1af: aload 0
      // 1b0: aload 1
      // 1b1: aload 19
      // 1b3: invokevirtual mew.o_8 ()Lmew;
      // 1b6: invokespecial n0s.gt6 (Lt9d;Lmew;)V
      // 1b9: aload 0
      // 1ba: aload 1
      // 1bb: aload 19
      // 1bd: invokevirtual mew.z6x ()Lmew;
      // 1c0: invokespecial n0s.gt6 (Lt9d;Lmew;)V
      // 1c3: goto 1ca
      // 1c6: invokestatic n0s.a (Loov;)Loov;
      // 1c9: athrow
      // 1ca: aload 0
      // 1cb: aload 1
      // 1cc: aload 19
      // 1ce: invokevirtual mew.o_8 ()Lmew;
      // 1d1: invokevirtual mew.z6x ()Lmew;
      // 1d4: invokespecial n0s.gt6 (Lt9d;Lmew;)V
      // 1d7: iinc 17 1
      // 1da: iload 4
      // 1dc: ifeq 10a
      // 1df: bipush -2
      // 1e1: istore 17
      // 1e3: iload 17
      // 1e5: ifgt 32e
      // 1e8: bipush -2
      // 1ea: iload 4
      // 1ec: ifne 332
      // 1ef: istore 18
      // 1f1: iload 18
      // 1f3: ifgt 326
      // 1f6: bipush -1
      // 1f7: istore 19
      // 1f9: aload 0
      // 1fa: aload 1
      // 1fb: iload 14
      // 1fd: iload 17
      // 1ff: iadd
      // 200: iload 16
      // 202: iload 19
      // 204: iadd
      // 205: iload 15
      // 207: iload 18
      // 209: iadd
      // 20a: invokespecial n0s.bor (Lt9d;III)V
      // 20d: aload 0
      // 20e: aload 1
      // 20f: bipush 1
      // 210: iload 14
      // 212: iadd
      // 213: iload 17
      // 215: isub
      // 216: iload 16
      // 218: iload 19
      // 21a: iadd
      // 21b: iload 15
      // 21d: iload 18
      // 21f: iadd
      // 220: invokespecial n0s.bor (Lt9d;III)V
      // 223: aload 0
      // 224: aload 1
      // 225: iload 14
      // 227: iload 17
      // 229: iadd
      // 22a: iload 16
      // 22c: iload 19
      // 22e: iadd
      // 22f: bipush 1
      // 230: iload 15
      // 232: iadd
      // 233: iload 18
      // 235: isub
      // 236: invokespecial n0s.bor (Lt9d;III)V
      // 239: aload 0
      // 23a: aload 1
      // 23b: bipush 1
      // 23c: iload 14
      // 23e: iadd
      // 23f: iload 17
      // 241: isub
      // 242: iload 16
      // 244: iload 19
      // 246: iadd
      // 247: bipush 1
      // 248: iload 15
      // 24a: iadd
      // 24b: iload 18
      // 24d: isub
      // 24e: invokespecial n0s.bor (Lt9d;III)V
      // 251: iload 17
      // 253: bipush -2
      // 255: iload 4
      // 257: ifne 38b
      // 25a: iload 4
      // 25c: ifne 29f
      // 25f: goto 266
      // 262: invokestatic n0s.a (Loov;)Loov;
      // 265: athrow
      // 266: if_icmpgt 289
      // 269: goto 270
      // 26c: invokestatic n0s.a (Loov;)Loov;
      // 26f: athrow
      // 270: iload 18
      // 272: bipush -1
      // 273: iload 4
      // 275: ifne 29f
      // 278: goto 27f
      // 27b: invokestatic n0s.a (Loov;)Loov;
      // 27e: athrow
      // 27f: if_icmple 31e
      // 282: goto 289
      // 285: invokestatic n0s.a (Loov;)Loov;
      // 288: athrow
      // 289: iload 17
      // 28b: iload 4
      // 28d: ifne 2c4
      // 290: goto 297
      // 293: invokestatic n0s.a (Loov;)Loov;
      // 296: athrow
      // 297: bipush -1
      // 298: goto 29f
      // 29b: invokestatic n0s.a (Loov;)Loov;
      // 29e: athrow
      // 29f: if_icmpne 2bc
      // 2a2: iload 18
      // 2a4: iload 4
      // 2a6: ifne 2c4
      // 2a9: goto 2b0
      // 2ac: invokestatic n0s.a (Loov;)Loov;
      // 2af: athrow
      // 2b0: bipush -2
      // 2b2: if_icmpeq 31e
      // 2b5: goto 2bc
      // 2b8: invokestatic n0s.a (Loov;)Loov;
      // 2bb: athrow
      // 2bc: bipush 1
      // 2bd: goto 2c4
      // 2c0: invokestatic n0s.a (Loov;)Loov;
      // 2c3: athrow
      // 2c4: istore 19
      // 2c6: aload 0
      // 2c7: aload 1
      // 2c8: iload 14
      // 2ca: iload 17
      // 2cc: iadd
      // 2cd: iload 16
      // 2cf: iload 19
      // 2d1: iadd
      // 2d2: iload 15
      // 2d4: iload 18
      // 2d6: iadd
      // 2d7: invokespecial n0s.bor (Lt9d;III)V
      // 2da: aload 0
      // 2db: aload 1
      // 2dc: bipush 1
      // 2dd: iload 14
      // 2df: iadd
      // 2e0: iload 17
      // 2e2: isub
      // 2e3: iload 16
      // 2e5: iload 19
      // 2e7: iadd
      // 2e8: iload 15
      // 2ea: iload 18
      // 2ec: iadd
      // 2ed: invokespecial n0s.bor (Lt9d;III)V
      // 2f0: aload 0
      // 2f1: aload 1
      // 2f2: iload 14
      // 2f4: iload 17
      // 2f6: iadd
      // 2f7: iload 16
      // 2f9: iload 19
      // 2fb: iadd
      // 2fc: bipush 1
      // 2fd: iload 15
      // 2ff: iadd
      // 300: iload 18
      // 302: isub
      // 303: invokespecial n0s.bor (Lt9d;III)V
      // 306: aload 0
      // 307: aload 1
      // 308: bipush 1
      // 309: iload 14
      // 30b: iadd
      // 30c: iload 17
      // 30e: isub
      // 30f: iload 16
      // 311: iload 19
      // 313: iadd
      // 314: bipush 1
      // 315: iload 15
      // 317: iadd
      // 318: iload 18
      // 31a: isub
      // 31b: invokespecial n0s.bor (Lt9d;III)V
      // 31e: iinc 18 1
      // 321: iload 4
      // 323: ifeq 1f1
      // 326: iinc 17 1
      // 329: iload 4
      // 32b: ifeq 1e3
      // 32e: aload 2
      // 32f: invokevirtual java/util/Random.nextBoolean ()Z
      // 332: iload 4
      // 334: ifne 386
      // 337: ifeq 384
      // 33a: goto 341
      // 33d: invokestatic n0s.a (Loov;)Loov;
      // 340: athrow
      // 341: aload 0
      // 342: aload 1
      // 343: iload 14
      // 345: iload 16
      // 347: bipush 2
      // 348: iadd
      // 349: iload 15
      // 34b: invokespecial n0s.bor (Lt9d;III)V
      // 34e: aload 0
      // 34f: aload 1
      // 350: iload 14
      // 352: bipush 1
      // 353: iadd
      // 354: iload 16
      // 356: bipush 2
      // 357: iadd
      // 358: iload 15
      // 35a: invokespecial n0s.bor (Lt9d;III)V
      // 35d: aload 0
      // 35e: aload 1
      // 35f: iload 14
      // 361: bipush 1
      // 362: iadd
      // 363: iload 16
      // 365: bipush 2
      // 366: iadd
      // 367: iload 15
      // 369: bipush 1
      // 36a: iadd
      // 36b: invokespecial n0s.bor (Lt9d;III)V
      // 36e: aload 0
      // 36f: aload 1
      // 370: iload 14
      // 372: iload 16
      // 374: bipush 2
      // 375: iadd
      // 376: iload 15
      // 378: bipush 1
      // 379: iadd
      // 37a: invokespecial n0s.bor (Lt9d;III)V
      // 37d: goto 384
      // 380: invokestatic n0s.a (Loov;)Loov;
      // 383: athrow
      // 384: bipush -3
      // 386: istore 17
      // 388: iload 17
      // 38a: bipush 4
      // 38b: if_icmpgt 4bb
      // 38e: bipush -3
      // 390: iload 4
      // 392: ifne 4bc
      // 395: istore 18
      // 397: iload 18
      // 399: bipush 4
      // 39a: if_icmpgt 4b3
      // 39d: iload 17
      // 39f: bipush -3
      // 3a1: iload 4
      // 3a3: ifne 38b
      // 3a6: iload 4
      // 3a8: ifne 3da
      // 3ab: if_icmpne 3cf
      // 3ae: goto 3b5
      // 3b1: invokestatic n0s.a (Loov;)Loov;
      // 3b4: athrow
      // 3b5: iload 18
      // 3b7: bipush -3
      // 3b9: iload 4
      // 3bb: ifne 3da
      // 3be: goto 3c5
      // 3c1: invokestatic n0s.a (Loov;)Loov;
      // 3c4: athrow
      // 3c5: if_icmpeq 4ab
      // 3c8: goto 3cf
      // 3cb: invokestatic n0s.a (Loov;)Loov;
      // 3ce: athrow
      // 3cf: iload 17
      // 3d1: bipush -3
      // 3d3: goto 3da
      // 3d6: invokestatic n0s.a (Loov;)Loov;
      // 3d9: athrow
      // 3da: iload 4
      // 3dc: ifne 40c
      // 3df: if_icmpne 402
      // 3e2: goto 3e9
      // 3e5: invokestatic n0s.a (Loov;)Loov;
      // 3e8: athrow
      // 3e9: iload 18
      // 3eb: bipush 4
      // 3ec: iload 4
      // 3ee: ifne 40c
      // 3f1: goto 3f8
      // 3f4: invokestatic n0s.a (Loov;)Loov;
      // 3f7: athrow
      // 3f8: if_icmpeq 4ab
      // 3fb: goto 402
      // 3fe: invokestatic n0s.a (Loov;)Loov;
      // 401: athrow
      // 402: iload 17
      // 404: bipush 4
      // 405: goto 40c
      // 408: invokestatic n0s.a (Loov;)Loov;
      // 40b: athrow
      // 40c: iload 4
      // 40e: ifne 43f
      // 411: if_icmpne 435
      // 414: goto 41b
      // 417: invokestatic n0s.a (Loov;)Loov;
      // 41a: athrow
      // 41b: iload 18
      // 41d: bipush -3
      // 41f: iload 4
      // 421: ifne 43f
      // 424: goto 42b
      // 427: invokestatic n0s.a (Loov;)Loov;
      // 42a: athrow
      // 42b: if_icmpeq 4ab
      // 42e: goto 435
      // 431: invokestatic n0s.a (Loov;)Loov;
      // 434: athrow
      // 435: iload 17
      // 437: bipush 4
      // 438: goto 43f
      // 43b: invokestatic n0s.a (Loov;)Loov;
      // 43e: athrow
      // 43f: iload 4
      // 441: ifne 474
      // 444: if_icmpne 467
      // 447: goto 44e
      // 44a: invokestatic n0s.a (Loov;)Loov;
      // 44d: athrow
      // 44e: iload 18
      // 450: bipush 4
      // 451: iload 4
      // 453: ifne 474
      // 456: goto 45d
      // 459: invokestatic n0s.a (Loov;)Loov;
      // 45c: athrow
      // 45d: if_icmpeq 4ab
      // 460: goto 467
      // 463: invokestatic n0s.a (Loov;)Loov;
      // 466: athrow
      // 467: iload 17
      // 469: invokestatic java/lang/Math.abs (I)I
      // 46c: bipush 3
      // 46d: goto 474
      // 470: invokestatic n0s.a (Loov;)Loov;
      // 473: athrow
      // 474: iload 4
      // 476: ifne 490
      // 479: if_icmplt 493
      // 47c: goto 483
      // 47f: invokestatic n0s.a (Loov;)Loov;
      // 482: athrow
      // 483: iload 18
      // 485: invokestatic java/lang/Math.abs (I)I
      // 488: bipush 3
      // 489: goto 490
      // 48c: invokestatic n0s.a (Loov;)Loov;
      // 48f: athrow
      // 490: if_icmpge 4ab
      // 493: aload 0
      // 494: aload 1
      // 495: iload 14
      // 497: iload 17
      // 499: iadd
      // 49a: iload 16
      // 49c: iload 15
      // 49e: iload 18
      // 4a0: iadd
      // 4a1: invokespecial n0s.bor (Lt9d;III)V
      // 4a4: goto 4ab
      // 4a7: invokestatic n0s.a (Loov;)Loov;
      // 4aa: athrow
      // 4ab: iinc 18 1
      // 4ae: iload 4
      // 4b0: ifeq 397
      // 4b3: iinc 17 1
      // 4b6: iload 4
      // 4b8: ifeq 388
      // 4bb: bipush -1
      // 4bc: istore 17
      // 4be: iload 17
      // 4c0: bipush 2
      // 4c1: if_icmpgt 66c
      // 4c4: bipush -1
      // 4c5: iload 4
      // 4c7: ifne 66d
      // 4ca: istore 18
      // 4cc: iload 18
      // 4ce: bipush 2
      // 4cf: if_icmpgt 664
      // 4d2: iload 17
      // 4d4: iload 4
      // 4d6: ifne 4c0
      // 4d9: iload 4
      // 4db: ifne 53e
      // 4de: iflt 532
      // 4e1: goto 4e8
      // 4e4: invokestatic n0s.a (Loov;)Loov;
      // 4e7: athrow
      // 4e8: iload 17
      // 4ea: iload 4
      // 4ec: ifne 53e
      // 4ef: goto 4f6
      // 4f2: invokestatic n0s.a (Loov;)Loov;
      // 4f5: athrow
      // 4f6: bipush 1
      // 4f7: if_icmpgt 532
      // 4fa: goto 501
      // 4fd: invokestatic n0s.a (Loov;)Loov;
      // 500: athrow
      // 501: iload 18
      // 503: iload 4
      // 505: ifne 53e
      // 508: goto 50f
      // 50b: invokestatic n0s.a (Loov;)Loov;
      // 50e: athrow
      // 50f: iflt 532
      // 512: goto 519
      // 515: invokestatic n0s.a (Loov;)Loov;
      // 518: athrow
      // 519: iload 18
      // 51b: iload 4
      // 51d: ifne 53e
      // 520: goto 527
      // 523: invokestatic n0s.a (Loov;)Loov;
      // 526: athrow
      // 527: bipush 1
      // 528: if_icmple 65c
      // 52b: goto 532
      // 52e: invokestatic n0s.a (Loov;)Loov;
      // 531: athrow
      // 532: aload 2
      // 533: bipush 3
      // 534: invokevirtual java/util/Random.nextInt (I)I
      // 537: goto 53e
      // 53a: invokestatic n0s.a (Loov;)Loov;
      // 53d: athrow
      // 53e: iload 4
      // 540: ifne 55b
      // 543: ifgt 65c
      // 546: goto 54d
      // 549: invokestatic n0s.a (Loov;)Loov;
      // 54c: athrow
      // 54d: aload 2
      // 54e: bipush 3
      // 54f: invokevirtual java/util/Random.nextInt (I)I
      // 552: bipush 2
      // 553: iadd
      // 554: goto 55b
      // 557: invokestatic n0s.a (Loov;)Loov;
      // 55a: athrow
      // 55b: istore 19
      // 55d: bipush 0
      // 55e: istore 20
      // 560: iload 20
      // 562: iload 19
      // 564: if_icmpge 598
      // 567: aload 0
      // 568: aload 1
      // 569: new mew
      // 56c: dup
      // 56d: iload 6
      // 56f: iload 17
      // 571: iadd
      // 572: iload 16
      // 574: iload 20
      // 576: isub
      // 577: bipush 1
      // 578: isub
      // 579: iload 8
      // 57b: iload 18
      // 57d: iadd
      // 57e: invokespecial mew.<init> (III)V
      // 581: invokespecial n0s.gt6 (Lt9d;Lmew;)V
      // 584: iinc 20 1
      // 587: iload 4
      // 589: ifne 59b
      // 58c: iload 4
      // 58e: ifeq 560
      // 591: goto 598
      // 594: invokestatic n0s.a (Loov;)Loov;
      // 597: athrow
      // 598: bipush -1
      // 599: istore 20
      // 59b: iload 20
      // 59d: bipush 1
      // 59e: if_icmpgt 5e9
      // 5a1: bipush -1
      // 5a2: iload 4
      // 5a4: ifne 5eb
      // 5a7: goto 5ae
      // 5aa: invokestatic n0s.a (Loov;)Loov;
      // 5ad: athrow
      // 5ae: istore 21
      // 5b0: iload 21
      // 5b2: bipush 1
      // 5b3: if_icmpgt 5e1
      // 5b6: aload 0
      // 5b7: aload 1
      // 5b8: iload 14
      // 5ba: iload 17
      // 5bc: iadd
      // 5bd: iload 20
      // 5bf: iadd
      // 5c0: iload 16
      // 5c2: iload 15
      // 5c4: iload 18
      // 5c6: iadd
      // 5c7: iload 21
      // 5c9: iadd
      // 5ca: invokespecial n0s.bor (Lt9d;III)V
      // 5cd: iinc 21 1
      // 5d0: iload 4
      // 5d2: ifne 5e4
      // 5d5: iload 4
      // 5d7: ifeq 5b0
      // 5da: goto 5e1
      // 5dd: invokestatic n0s.a (Loov;)Loov;
      // 5e0: athrow
      // 5e1: iinc 20 1
      // 5e4: iload 4
      // 5e6: ifeq 59b
      // 5e9: bipush -2
      // 5eb: istore 20
      // 5ed: iload 20
      // 5ef: bipush 2
      // 5f0: if_icmpgt 65c
      // 5f3: bipush -2
      // 5f5: iload 4
      // 5f7: ifne 4ce
      // 5fa: istore 21
      // 5fc: iload 21
      // 5fe: bipush 2
      // 5ff: if_icmpgt 654
      // 602: iload 20
      // 604: invokestatic java/lang/Math.abs (I)I
      // 607: bipush 2
      // 608: iload 4
      // 60a: ifne 5f0
      // 60d: iload 4
      // 60f: ifne 629
      // 612: if_icmpne 62c
      // 615: goto 61c
      // 618: invokestatic n0s.a (Loov;)Loov;
      // 61b: athrow
      // 61c: iload 21
      // 61e: invokestatic java/lang/Math.abs (I)I
      // 621: bipush 2
      // 622: goto 629
      // 625: invokestatic n0s.a (Loov;)Loov;
      // 628: athrow
      // 629: if_icmpeq 64c
      // 62c: aload 0
      // 62d: aload 1
      // 62e: iload 14
      // 630: iload 17
      // 632: iadd
      // 633: iload 20
      // 635: iadd
      // 636: iload 16
      // 638: bipush 1
      // 639: isub
      // 63a: iload 15
      // 63c: iload 18
      // 63e: iadd
      // 63f: iload 21
      // 641: iadd
      // 642: invokespecial n0s.bor (Lt9d;III)V
      // 645: goto 64c
      // 648: invokestatic n0s.a (Loov;)Loov;
      // 64b: athrow
      // 64c: iinc 21 1
      // 64f: iload 4
      // 651: ifeq 5fc
      // 654: iinc 20 1
      // 657: iload 4
      // 659: ifeq 5ed
      // 65c: iinc 18 1
      // 65f: iload 4
      // 661: ifeq 4cc
      // 664: iinc 17 1
      // 667: iload 4
      // 669: ifeq 4be
      // 66c: bipush 1
      // 66d: ireturn
      // 66e: bipush 0
      // 66f: ireturn
   }

   private boolean a62(t9d param1, mew param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokevirtual mew.getX ()I
      // 04: istore 5
      // 06: invokestatic t9d.c ()I
      // 09: aload 2
      // 0a: invokevirtual mew.getY ()I
      // 0d: istore 6
      // 0f: istore 4
      // 11: aload 2
      // 12: invokevirtual mew.getZ ()I
      // 15: istore 7
      // 17: new mew$mix
      // 1a: dup
      // 1b: invokespecial mew$mix.<init> ()V
      // 1e: astore 8
      // 20: bipush 0
      // 21: istore 9
      // 23: iload 9
      // 25: iload 3
      // 26: bipush 1
      // 27: iadd
      // 28: if_icmpgt d1
      // 2b: bipush 1
      // 2c: istore 10
      // 2e: iload 9
      // 30: iload 4
      // 32: ifne d2
      // 35: iload 4
      // 37: ifne 50
      // 3a: goto 41
      // 3d: invokestatic n0s.a (Loov;)Loov;
      // 40: athrow
      // 41: ifne 4e
      // 44: goto 4b
      // 47: invokestatic n0s.a (Loov;)Loov;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: istore 10
      // 4e: iload 9
      // 50: iload 4
      // 52: ifne 68
      // 55: iload 3
      // 56: bipush 1
      // 57: isub
      // 58: if_icmplt 65
      // 5b: goto 62
      // 5e: invokestatic n0s.a (Loov;)Loov;
      // 61: athrow
      // 62: bipush 2
      // 63: istore 10
      // 65: iload 10
      // 67: ineg
      // 68: istore 11
      // 6a: iload 11
      // 6c: iload 10
      // 6e: if_icmpgt c9
      // 71: iload 10
      // 73: ineg
      // 74: iload 4
      // 76: ifne 25
      // 79: istore 12
      // 7b: iload 12
      // 7d: iload 10
      // 7f: if_icmpgt c1
      // 82: aload 0
      // 83: aload 1
      // 84: aload 8
      // 86: iload 5
      // 88: iload 11
      // 8a: iadd
      // 8b: iload 6
      // 8d: iload 9
      // 8f: iadd
      // 90: iload 7
      // 92: iload 12
      // 94: iadd
      // 95: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 98: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 9b: invokeinterface zfz.r_y ()Le0x; 1
      // a0: invokevirtual n0s.mgy (Le0x;)Z
      // a3: iload 4
      // a5: ifne 6c
      // a8: iload 4
      // aa: ifne b8
      // ad: ifne b9
      // b0: goto b7
      // b3: invokestatic n0s.a (Loov;)Loov;
      // b6: athrow
      // b7: bipush 0
      // b8: ireturn
      // b9: iinc 12 1
      // bc: iload 4
      // be: ifeq 7b
      // c1: iinc 11 1
      // c4: iload 4
      // c6: ifeq 6a
      // c9: iinc 9 1
      // cc: iload 4
      // ce: ifeq 23
      // d1: bipush 1
      // d2: ireturn
   }

   private void gt6(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: iload 3
      // 08: ifeq 2a
      // 0b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0e: invokeinterface zfz.r_y ()Le0x; 1
      // 13: invokevirtual n0s.mgy (Le0x;)Z
      // 16: ifeq 30
      // 19: goto 20
      // 1c: invokestatic n0s.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: aload 2
      // 23: goto 2a
      // 26: invokestatic n0s.a (Loov;)Loov;
      // 29: athrow
      // 2a: getstatic n0s.huj Lzfz;
      // 2d: invokevirtual n0s.u0f (Lt9d;Lmew;Lzfz;)V
      // 30: return
   }

   private void bor(t9d var1, int var2, int var3, int var4) {
      mew var5 = new mew(var2, var3, var4);
      e0x var6 = var1.getBlockState(var5).r_y();

      try {
         if (var6.p1r() == p3y.cei) {
            this.u0f(var1, var5, wap);
         }
      } catch (oov var7) {
         throw a(var7);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
