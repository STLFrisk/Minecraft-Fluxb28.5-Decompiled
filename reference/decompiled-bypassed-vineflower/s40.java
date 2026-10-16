import java.util.Random;

public class s40 extends e9q {
   private static final zfz yes = ox_.uom.l4i().zvi(qv5.yuo, x54$lti.mdr);
   private static final zfz zdb = ox_.rwl.l4i().zvi(uav.nps, x54$lti.mdr).zvi(uav.sdu, false);

   public s40() {
      super(false);
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
      // 000: invokestatic t9d.c ()I
      // 003: istore 4
      // 005: aload 2
      // 006: bipush 4
      // 007: invokevirtual java/util/Random.nextInt (I)I
      // 00a: bipush 5
      // 00b: iadd
      // 00c: istore 5
      // 00e: aload 1
      // 00f: aload 3
      // 010: invokevirtual mew.eve ()Lmew;
      // 013: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 016: invokeinterface zfz.r_y ()Le0x; 1
      // 01b: invokevirtual e0x.p1r ()Lp3y;
      // 01e: getstatic p3y.six Lp3y;
      // 021: if_acmpne 02e
      // 024: aload 3
      // 025: invokevirtual mew.eve ()Lmew;
      // 028: astore 3
      // 029: iload 4
      // 02b: ifeq 00e
      // 02e: bipush 1
      // 02f: istore 6
      // 031: aload 3
      // 032: invokevirtual mew.getY ()I
      // 035: iload 4
      // 037: ifne 60d
      // 03a: bipush 1
      // 03b: if_icmplt 60c
      // 03e: goto 045
      // 041: invokestatic s40.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 3
      // 046: invokevirtual mew.getY ()I
      // 049: iload 5
      // 04b: iadd
      // 04c: bipush 1
      // 04d: iadd
      // 04e: iload 4
      // 050: ifne 60d
      // 053: goto 05a
      // 056: invokestatic s40.a (Loov;)Loov;
      // 059: athrow
      // 05a: sipush 256
      // 05d: if_icmpgt 60c
      // 060: goto 067
      // 063: invokestatic s40.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 3
      // 068: invokevirtual mew.getY ()I
      // 06b: istore 7
      // 06d: iload 7
      // 06f: aload 3
      // 070: invokevirtual mew.getY ()I
      // 073: bipush 1
      // 074: iadd
      // 075: iload 5
      // 077: iadd
      // 078: if_icmpgt 216
      // 07b: bipush 1
      // 07c: istore 8
      // 07e: iload 7
      // 080: iload 4
      // 082: ifne 218
      // 085: aload 3
      // 086: invokevirtual mew.getY ()I
      // 089: iload 4
      // 08b: ifne 0bb
      // 08e: goto 095
      // 091: invokestatic s40.a (Loov;)Loov;
      // 094: athrow
      // 095: if_icmpne 0a2
      // 098: goto 09f
      // 09b: invokestatic s40.a (Loov;)Loov;
      // 09e: athrow
      // 09f: bipush 0
      // 0a0: istore 8
      // 0a2: iload 7
      // 0a4: iload 4
      // 0a6: ifne 0bf
      // 0a9: aload 3
      // 0aa: invokevirtual mew.getY ()I
      // 0ad: bipush 1
      // 0ae: iadd
      // 0af: iload 5
      // 0b1: iadd
      // 0b2: bipush 2
      // 0b3: isub
      // 0b4: goto 0bb
      // 0b7: invokestatic s40.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: if_icmplt 0c1
      // 0be: bipush 3
      // 0bf: istore 8
      // 0c1: new mew$mix
      // 0c4: dup
      // 0c5: invokespecial mew$mix.<init> ()V
      // 0c8: astore 9
      // 0ca: aload 3
      // 0cb: invokevirtual mew.getX ()I
      // 0ce: iload 8
      // 0d0: isub
      // 0d1: istore 10
      // 0d3: iload 10
      // 0d5: aload 3
      // 0d6: invokevirtual mew.getX ()I
      // 0d9: iload 8
      // 0db: iadd
      // 0dc: if_icmpgt 20e
      // 0df: iload 6
      // 0e1: iload 4
      // 0e3: ifne 06f
      // 0e6: iload 4
      // 0e8: ifne 103
      // 0eb: ifeq 20e
      // 0ee: goto 0f5
      // 0f1: invokestatic s40.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 3
      // 0f6: invokevirtual mew.getZ ()I
      // 0f9: iload 8
      // 0fb: isub
      // 0fc: goto 103
      // 0ff: invokestatic s40.a (Loov;)Loov;
      // 102: athrow
      // 103: istore 11
      // 105: iload 11
      // 107: aload 3
      // 108: invokevirtual mew.getZ ()I
      // 10b: iload 8
      // 10d: iadd
      // 10e: if_icmpgt 206
      // 111: iload 6
      // 113: iload 4
      // 115: ifne 0d5
      // 118: iload 4
      // 11a: ifne 129
      // 11d: ifeq 206
      // 120: goto 127
      // 123: invokestatic s40.a (Loov;)Loov;
      // 126: athrow
      // 127: iload 7
      // 129: iload 4
      // 12b: ifne 1fc
      // 12e: iflt 1f4
      // 131: goto 138
      // 134: invokestatic s40.a (Loov;)Loov;
      // 137: athrow
      // 138: iload 7
      // 13a: iload 4
      // 13c: ifne 1fc
      // 13f: goto 146
      // 142: invokestatic s40.a (Loov;)Loov;
      // 145: athrow
      // 146: sipush 256
      // 149: if_icmpge 1f4
      // 14c: goto 153
      // 14f: invokestatic s40.a (Loov;)Loov;
      // 152: athrow
      // 153: aload 1
      // 154: aload 9
      // 156: iload 10
      // 158: iload 7
      // 15a: iload 11
      // 15c: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 15f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 162: invokeinterface zfz.r_y ()Le0x; 1
      // 167: astore 12
      // 169: aload 12
      // 16b: invokevirtual e0x.p1r ()Lp3y;
      // 16e: getstatic p3y.cei Lp3y;
      // 171: iload 4
      // 173: ifne 19b
      // 176: if_acmpeq 1ef
      // 179: goto 180
      // 17c: invokestatic s40.a (Loov;)Loov;
      // 17f: athrow
      // 180: aload 12
      // 182: iload 4
      // 184: ifne 1a0
      // 187: goto 18e
      // 18a: invokestatic s40.a (Loov;)Loov;
      // 18d: athrow
      // 18e: invokevirtual e0x.p1r ()Lp3y;
      // 191: getstatic p3y.hh1 Lp3y;
      // 194: goto 19b
      // 197: invokestatic s40.a (Loov;)Loov;
      // 19a: athrow
      // 19b: if_acmpeq 1ef
      // 19e: aload 12
      // 1a0: iload 4
      // 1a2: ifne 1bb
      // 1a5: getstatic ox_.gdz Les2;
      // 1a8: if_acmpeq 1c9
      // 1ab: goto 1b2
      // 1ae: invokestatic s40.a (Loov;)Loov;
      // 1b1: athrow
      // 1b2: aload 12
      // 1b4: goto 1bb
      // 1b7: invokestatic s40.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: getstatic ox_.whp L_13;
      // 1be: if_acmpeq 1c9
      // 1c1: bipush 0
      // 1c2: istore 6
      // 1c4: iload 4
      // 1c6: ifeq 1ef
      // 1c9: iload 7
      // 1cb: iload 4
      // 1cd: ifne 1ed
      // 1d0: goto 1d7
      // 1d3: invokestatic s40.a (Loov;)Loov;
      // 1d6: athrow
      // 1d7: aload 3
      // 1d8: invokevirtual mew.getY ()I
      // 1db: if_icmple 1ef
      // 1de: goto 1e5
      // 1e1: invokestatic s40.a (Loov;)Loov;
      // 1e4: athrow
      // 1e5: bipush 0
      // 1e6: goto 1ed
      // 1e9: invokestatic s40.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: istore 6
      // 1ef: iload 4
      // 1f1: ifeq 1fe
      // 1f4: bipush 0
      // 1f5: goto 1fc
      // 1f8: invokestatic s40.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: istore 6
      // 1fe: iinc 11 1
      // 201: iload 4
      // 203: ifeq 105
      // 206: iinc 10 1
      // 209: iload 4
      // 20b: ifeq 0d3
      // 20e: iinc 7 1
      // 211: iload 4
      // 213: ifeq 06d
      // 216: iload 6
      // 218: iload 4
      // 21a: ifne 228
      // 21d: ifne 229
      // 220: goto 227
      // 223: invokestatic s40.a (Loov;)Loov;
      // 226: athrow
      // 227: bipush 0
      // 228: ireturn
      // 229: aload 1
      // 22a: aload 3
      // 22b: invokevirtual mew.eve ()Lmew;
      // 22e: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 231: invokeinterface zfz.r_y ()Le0x; 1
      // 236: astore 7
      // 238: aload 7
      // 23a: getstatic ox_.l11 Lx82;
      // 23d: iload 4
      // 23f: ifne 258
      // 242: if_acmpeq 25b
      // 245: goto 24c
      // 248: invokestatic s40.a (Loov;)Loov;
      // 24b: athrow
      // 24c: aload 7
      // 24e: getstatic ox_.kqk Le0x;
      // 251: goto 258
      // 254: invokestatic s40.a (Loov;)Loov;
      // 257: athrow
      // 258: if_acmpne 60a
      // 25b: aload 3
      // 25c: invokevirtual mew.getY ()I
      // 25f: iload 4
      // 261: ifne 60b
      // 264: goto 26b
      // 267: invokestatic s40.a (Loov;)Loov;
      // 26a: athrow
      // 26b: sipush 256
      // 26e: iload 5
      // 270: isub
      // 271: bipush 1
      // 272: isub
      // 273: if_icmpge 60a
      // 276: goto 27d
      // 279: invokestatic s40.a (Loov;)Loov;
      // 27c: athrow
      // 27d: aload 0
      // 27e: aload 1
      // 27f: aload 3
      // 280: invokevirtual mew.eve ()Lmew;
      // 283: invokevirtual s40.g27 (Lt9d;Lmew;)V
      // 286: aload 3
      // 287: invokevirtual mew.getY ()I
      // 28a: bipush 3
      // 28b: isub
      // 28c: iload 5
      // 28e: iadd
      // 28f: istore 8
      // 291: iload 8
      // 293: aload 3
      // 294: invokevirtual mew.getY ()I
      // 297: iload 5
      // 299: iadd
      // 29a: if_icmpgt 3a4
      // 29d: iload 8
      // 29f: aload 3
      // 2a0: invokevirtual mew.getY ()I
      // 2a3: iload 5
      // 2a5: iadd
      // 2a6: isub
      // 2a7: istore 9
      // 2a9: bipush 2
      // 2aa: iload 9
      // 2ac: bipush 2
      // 2ad: idiv
      // 2ae: isub
      // 2af: istore 10
      // 2b1: aload 3
      // 2b2: invokevirtual mew.getX ()I
      // 2b5: iload 10
      // 2b7: isub
      // 2b8: iload 4
      // 2ba: ifne 3a5
      // 2bd: istore 11
      // 2bf: iload 11
      // 2c1: aload 3
      // 2c2: invokevirtual mew.getX ()I
      // 2c5: iload 10
      // 2c7: iadd
      // 2c8: if_icmpgt 39c
      // 2cb: iload 11
      // 2cd: aload 3
      // 2ce: invokevirtual mew.getX ()I
      // 2d1: isub
      // 2d2: istore 12
      // 2d4: aload 3
      // 2d5: invokevirtual mew.getZ ()I
      // 2d8: iload 10
      // 2da: isub
      // 2db: iload 4
      // 2dd: ifne 293
      // 2e0: istore 13
      // 2e2: iload 13
      // 2e4: aload 3
      // 2e5: invokevirtual mew.getZ ()I
      // 2e8: iload 10
      // 2ea: iadd
      // 2eb: if_icmpgt 394
      // 2ee: iload 13
      // 2f0: aload 3
      // 2f1: invokevirtual mew.getZ ()I
      // 2f4: isub
      // 2f5: istore 14
      // 2f7: iload 12
      // 2f9: invokestatic java/lang/Math.abs (I)I
      // 2fc: iload 10
      // 2fe: iload 4
      // 300: ifne 2c8
      // 303: iload 4
      // 305: ifne 32c
      // 308: if_icmpne 34f
      // 30b: goto 312
      // 30e: invokestatic s40.a (Loov;)Loov;
      // 311: athrow
      // 312: iload 14
      // 314: invokestatic java/lang/Math.abs (I)I
      // 317: iload 4
      // 319: ifne 33b
      // 31c: goto 323
      // 31f: invokestatic s40.a (Loov;)Loov;
      // 322: athrow
      // 323: iload 10
      // 325: goto 32c
      // 328: invokestatic s40.a (Loov;)Loov;
      // 32b: athrow
      // 32c: if_icmpne 34f
      // 32f: aload 2
      // 330: bipush 2
      // 331: invokevirtual java/util/Random.nextInt (I)I
      // 334: goto 33b
      // 337: invokestatic s40.a (Loov;)Loov;
      // 33a: athrow
      // 33b: iload 4
      // 33d: ifne 34c
      // 340: ifeq 38c
      // 343: goto 34a
      // 346: invokestatic s40.a (Loov;)Loov;
      // 349: athrow
      // 34a: iload 9
      // 34c: ifeq 38c
      // 34f: new mew
      // 352: dup
      // 353: iload 11
      // 355: iload 8
      // 357: iload 13
      // 359: invokespecial mew.<init> (III)V
      // 35c: astore 15
      // 35e: iload 4
      // 360: ifne 38f
      // 363: aload 1
      // 364: aload 15
      // 366: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 369: invokeinterface zfz.r_y ()Le0x; 1
      // 36e: invokevirtual e0x.z4c ()Z
      // 371: ifne 38c
      // 374: goto 37b
      // 377: invokestatic s40.a (Loov;)Loov;
      // 37a: athrow
      // 37b: aload 0
      // 37c: aload 1
      // 37d: aload 15
      // 37f: getstatic s40.zdb Lzfz;
      // 382: invokevirtual s40.u0f (Lt9d;Lmew;Lzfz;)V
      // 385: goto 38c
      // 388: invokestatic s40.a (Loov;)Loov;
      // 38b: athrow
      // 38c: iinc 13 1
      // 38f: iload 4
      // 391: ifeq 2e2
      // 394: iinc 11 1
      // 397: iload 4
      // 399: ifeq 2bf
      // 39c: iinc 8 1
      // 39f: iload 4
      // 3a1: ifeq 291
      // 3a4: bipush 0
      // 3a5: istore 8
      // 3a7: iload 8
      // 3a9: iload 5
      // 3ab: if_icmpge 440
      // 3ae: aload 1
      // 3af: aload 3
      // 3b0: iload 8
      // 3b2: invokevirtual mew.z89 (I)Lmew;
      // 3b5: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 3b8: invokeinterface zfz.r_y ()Le0x; 1
      // 3bd: astore 9
      // 3bf: iload 4
      // 3c1: ifne 44b
      // 3c4: aload 9
      // 3c6: invokevirtual e0x.p1r ()Lp3y;
      // 3c9: getstatic p3y.cei Lp3y;
      // 3cc: iload 4
      // 3ce: ifne 3fd
      // 3d1: goto 3d8
      // 3d4: invokestatic s40.a (Loov;)Loov;
      // 3d7: athrow
      // 3d8: if_acmpeq 423
      // 3db: goto 3e2
      // 3de: invokestatic s40.a (Loov;)Loov;
      // 3e1: athrow
      // 3e2: aload 9
      // 3e4: iload 4
      // 3e6: ifne 402
      // 3e9: goto 3f0
      // 3ec: invokestatic s40.a (Loov;)Loov;
      // 3ef: athrow
      // 3f0: invokevirtual e0x.p1r ()Lp3y;
      // 3f3: getstatic p3y.hh1 Lp3y;
      // 3f6: goto 3fd
      // 3f9: invokestatic s40.a (Loov;)Loov;
      // 3fc: athrow
      // 3fd: if_acmpeq 423
      // 400: aload 9
      // 402: iload 4
      // 404: ifne 41d
      // 407: getstatic ox_.whp L_13;
      // 40a: if_acmpeq 423
      // 40d: goto 414
      // 410: invokestatic s40.a (Loov;)Loov;
      // 413: athrow
      // 414: aload 9
      // 416: goto 41d
      // 419: invokestatic s40.a (Loov;)Loov;
      // 41c: athrow
      // 41d: getstatic ox_.gdz Les2;
      // 420: if_acmpne 438
      // 423: aload 0
      // 424: aload 1
      // 425: aload 3
      // 426: iload 8
      // 428: invokevirtual mew.z89 (I)Lmew;
      // 42b: getstatic s40.yes Lzfz;
      // 42e: invokevirtual s40.u0f (Lt9d;Lmew;Lzfz;)V
      // 431: goto 438
      // 434: invokestatic s40.a (Loov;)Loov;
      // 437: athrow
      // 438: iinc 8 1
      // 43b: iload 4
      // 43d: ifeq 3a7
      // 440: aload 3
      // 441: invokevirtual mew.getY ()I
      // 444: bipush 3
      // 445: isub
      // 446: iload 5
      // 448: iadd
      // 449: istore 8
      // 44b: iload 8
      // 44d: aload 3
      // 44e: invokevirtual mew.getY ()I
      // 451: iload 5
      // 453: iadd
      // 454: if_icmpgt 608
      // 457: iload 8
      // 459: aload 3
      // 45a: invokevirtual mew.getY ()I
      // 45d: iload 5
      // 45f: iadd
      // 460: isub
      // 461: istore 9
      // 463: bipush 2
      // 464: iload 9
      // 466: bipush 2
      // 467: idiv
      // 468: isub
      // 469: istore 10
      // 46b: new mew$mix
      // 46e: dup
      // 46f: invokespecial mew$mix.<init> ()V
      // 472: astore 11
      // 474: aload 3
      // 475: invokevirtual mew.getX ()I
      // 478: iload 10
      // 47a: isub
      // 47b: iload 4
      // 47d: ifne 609
      // 480: istore 12
      // 482: iload 12
      // 484: aload 3
      // 485: invokevirtual mew.getX ()I
      // 488: iload 10
      // 48a: iadd
      // 48b: if_icmpgt 600
      // 48e: aload 3
      // 48f: invokevirtual mew.getZ ()I
      // 492: iload 10
      // 494: isub
      // 495: iload 4
      // 497: ifne 44d
      // 49a: istore 13
      // 49c: iload 13
      // 49e: aload 3
      // 49f: invokevirtual mew.getZ ()I
      // 4a2: iload 10
      // 4a4: iadd
      // 4a5: if_icmpgt 5f8
      // 4a8: aload 11
      // 4aa: iload 12
      // 4ac: iload 8
      // 4ae: iload 13
      // 4b0: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 4b3: pop
      // 4b4: iload 4
      // 4b6: ifne 5fb
      // 4b9: iload 4
      // 4bb: ifne 5f3
      // 4be: goto 4c5
      // 4c1: invokestatic s40.a (Loov;)Loov;
      // 4c4: athrow
      // 4c5: aload 1
      // 4c6: aload 11
      // 4c8: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 4cb: invokeinterface zfz.r_y ()Le0x; 1
      // 4d0: invokevirtual e0x.p1r ()Lp3y;
      // 4d3: getstatic p3y.hh1 Lp3y;
      // 4d6: if_acmpne 5f0
      // 4d9: goto 4e0
      // 4dc: invokestatic s40.a (Loov;)Loov;
      // 4df: athrow
      // 4e0: aload 11
      // 4e2: invokevirtual mew$mix.y8e ()Lmew;
      // 4e5: astore 14
      // 4e7: aload 11
      // 4e9: invokevirtual mew$mix.o_8 ()Lmew;
      // 4ec: astore 15
      // 4ee: aload 11
      // 4f0: invokevirtual mew$mix.idu ()Lmew;
      // 4f3: astore 16
      // 4f5: aload 11
      // 4f7: invokevirtual mew$mix.z6x ()Lmew;
      // 4fa: astore 17
      // 4fc: aload 2
      // 4fd: bipush 4
      // 4fe: invokevirtual java/util/Random.nextInt (I)I
      // 501: iload 4
      // 503: ifne 541
      // 506: ifne 53c
      // 509: goto 510
      // 50c: invokestatic s40.a (Loov;)Loov;
      // 50f: athrow
      // 510: aload 1
      // 511: aload 14
      // 513: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 516: invokeinterface zfz.r_y ()Le0x; 1
      // 51b: invokevirtual e0x.p1r ()Lp3y;
      // 51e: getstatic p3y.cei Lp3y;
      // 521: if_acmpne 53c
      // 524: goto 52b
      // 527: invokestatic s40.a (Loov;)Loov;
      // 52a: athrow
      // 52b: aload 0
      // 52c: aload 1
      // 52d: aload 14
      // 52f: getstatic pcl.t6u Lh76;
      // 532: invokespecial s40.a2t (Lt9d;Lmew;Lh76;)V
      // 535: goto 53c
      // 538: invokestatic s40.a (Loov;)Loov;
      // 53b: athrow
      // 53c: aload 2
      // 53d: bipush 4
      // 53e: invokevirtual java/util/Random.nextInt (I)I
      // 541: iload 4
      // 543: ifne 581
      // 546: ifne 57c
      // 549: goto 550
      // 54c: invokestatic s40.a (Loov;)Loov;
      // 54f: athrow
      // 550: aload 1
      // 551: aload 15
      // 553: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 556: invokeinterface zfz.r_y ()Le0x; 1
      // 55b: invokevirtual e0x.p1r ()Lp3y;
      // 55e: getstatic p3y.cei Lp3y;
      // 561: if_acmpne 57c
      // 564: goto 56b
      // 567: invokestatic s40.a (Loov;)Loov;
      // 56a: athrow
      // 56b: aload 0
      // 56c: aload 1
      // 56d: aload 15
      // 56f: getstatic pcl.m4e Lh76;
      // 572: invokespecial s40.a2t (Lt9d;Lmew;Lh76;)V
      // 575: goto 57c
      // 578: invokestatic s40.a (Loov;)Loov;
      // 57b: athrow
      // 57c: aload 2
      // 57d: bipush 4
      // 57e: invokevirtual java/util/Random.nextInt (I)I
      // 581: iload 4
      // 583: ifne 5c1
      // 586: ifne 5bc
      // 589: goto 590
      // 58c: invokestatic s40.a (Loov;)Loov;
      // 58f: athrow
      // 590: aload 1
      // 591: aload 16
      // 593: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 596: invokeinterface zfz.r_y ()Le0x; 1
      // 59b: invokevirtual e0x.p1r ()Lp3y;
      // 59e: getstatic p3y.cei Lp3y;
      // 5a1: if_acmpne 5bc
      // 5a4: goto 5ab
      // 5a7: invokestatic s40.a (Loov;)Loov;
      // 5aa: athrow
      // 5ab: aload 0
      // 5ac: aload 1
      // 5ad: aload 16
      // 5af: getstatic pcl.leq Lh76;
      // 5b2: invokespecial s40.a2t (Lt9d;Lmew;Lh76;)V
      // 5b5: goto 5bc
      // 5b8: invokestatic s40.a (Loov;)Loov;
      // 5bb: athrow
      // 5bc: aload 2
      // 5bd: bipush 4
      // 5be: invokevirtual java/util/Random.nextInt (I)I
      // 5c1: ifne 5f0
      // 5c4: aload 1
      // 5c5: aload 17
      // 5c7: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 5ca: invokeinterface zfz.r_y ()Le0x; 1
      // 5cf: invokevirtual e0x.p1r ()Lp3y;
      // 5d2: getstatic p3y.cei Lp3y;
      // 5d5: if_acmpne 5f0
      // 5d8: goto 5df
      // 5db: invokestatic s40.a (Loov;)Loov;
      // 5de: athrow
      // 5df: aload 0
      // 5e0: aload 1
      // 5e1: aload 17
      // 5e3: getstatic pcl.qme Lh76;
      // 5e6: invokespecial s40.a2t (Lt9d;Lmew;Lh76;)V
      // 5e9: goto 5f0
      // 5ec: invokestatic s40.a (Loov;)Loov;
      // 5ef: athrow
      // 5f0: iinc 13 1
      // 5f3: iload 4
      // 5f5: ifeq 49c
      // 5f8: iinc 12 1
      // 5fb: iload 4
      // 5fd: ifeq 482
      // 600: iinc 8 1
      // 603: iload 4
      // 605: ifeq 44b
      // 608: bipush 1
      // 609: ireturn
      // 60a: bipush 0
      // 60b: ireturn
      // 60c: bipush 0
      // 60d: ireturn
   }

   private void a2t(t9d var1, mew var2, h76 var3) {
      zfz var5 = ox_.s25.l4i().zvi(var3, true);
      int var10000 = t9d.c();
      this.u0f(var1, var2, var5);
      int var4 = var10000;
      int var6 = 4;
      var2 = var2.eve();

      while (var1.getBlockState(var2).r_y().p1r() == p3y.cei && var6 > 0) {
         this.u0f(var1, var2, var5);
         var2 = var2.eve();
         var6--;
         if (var4 != 0) {
            break;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }
}
