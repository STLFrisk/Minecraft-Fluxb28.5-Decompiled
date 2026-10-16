import java.util.Random;

public class ffn extends e9q {
   private static final zfz g0v = ox_.uom.l4i().zvi(qv5.yuo, x54$lti.mdr);
   private static final zfz xuc = ox_.rwl.l4i().zvi(uav.nps, x54$lti.mdr).zvi(_cv.sdu, false);
   private final int git;
   private final boolean prq;
   private final zfz scb;
   private final zfz hux;

   public ffn(boolean var1) {
      this(var1, 4, g0v, xuc, false);
   }

   public ffn(boolean var1, int var2, zfz var3, zfz var4, boolean var5) {
      super(var1);
      this.git = var2;
      this.scb = var3;
      this.hux = var4;
      this.prq = var5;
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
      // 005: aload 0
      // 006: getfield ffn.git I
      // 009: iadd
      // 00a: istore 5
      // 00c: invokestatic t9d.c ()I
      // 00f: bipush 1
      // 010: istore 6
      // 012: istore 4
      // 014: aload 3
      // 015: invokevirtual mew.getY ()I
      // 018: iload 4
      // 01a: ifne 7d8
      // 01d: bipush 1
      // 01e: if_icmplt 7d7
      // 021: goto 028
      // 024: invokestatic ffn.d (Loov;)Loov;
      // 027: athrow
      // 028: aload 3
      // 029: invokevirtual mew.getY ()I
      // 02c: iload 5
      // 02e: iadd
      // 02f: bipush 1
      // 030: iadd
      // 031: iload 4
      // 033: ifne 7d8
      // 036: goto 03d
      // 039: invokestatic ffn.d (Loov;)Loov;
      // 03c: athrow
      // 03d: sipush 256
      // 040: if_icmpgt 7d7
      // 043: goto 04a
      // 046: invokestatic ffn.d (Loov;)Loov;
      // 049: athrow
      // 04a: aload 3
      // 04b: invokevirtual mew.getY ()I
      // 04e: istore 7
      // 050: iload 7
      // 052: aload 3
      // 053: invokevirtual mew.getY ()I
      // 056: bipush 1
      // 057: iadd
      // 058: iload 5
      // 05a: iadd
      // 05b: if_icmpgt 18e
      // 05e: bipush 1
      // 05f: istore 8
      // 061: iload 7
      // 063: iload 4
      // 065: ifne 190
      // 068: aload 3
      // 069: invokevirtual mew.getY ()I
      // 06c: iload 4
      // 06e: ifne 09e
      // 071: goto 078
      // 074: invokestatic ffn.d (Loov;)Loov;
      // 077: athrow
      // 078: if_icmpne 085
      // 07b: goto 082
      // 07e: invokestatic ffn.d (Loov;)Loov;
      // 081: athrow
      // 082: bipush 0
      // 083: istore 8
      // 085: iload 7
      // 087: iload 4
      // 089: ifne 0a2
      // 08c: aload 3
      // 08d: invokevirtual mew.getY ()I
      // 090: bipush 1
      // 091: iadd
      // 092: iload 5
      // 094: iadd
      // 095: bipush 2
      // 096: isub
      // 097: goto 09e
      // 09a: invokestatic ffn.d (Loov;)Loov;
      // 09d: athrow
      // 09e: if_icmplt 0a4
      // 0a1: bipush 2
      // 0a2: istore 8
      // 0a4: new mew$mix
      // 0a7: dup
      // 0a8: invokespecial mew$mix.<init> ()V
      // 0ab: astore 9
      // 0ad: aload 3
      // 0ae: invokevirtual mew.getX ()I
      // 0b1: iload 8
      // 0b3: isub
      // 0b4: istore 10
      // 0b6: iload 10
      // 0b8: aload 3
      // 0b9: invokevirtual mew.getX ()I
      // 0bc: iload 8
      // 0be: iadd
      // 0bf: if_icmpgt 186
      // 0c2: iload 6
      // 0c4: iload 4
      // 0c6: ifne 052
      // 0c9: iload 4
      // 0cb: ifne 0e6
      // 0ce: ifeq 186
      // 0d1: goto 0d8
      // 0d4: invokestatic ffn.d (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 3
      // 0d9: invokevirtual mew.getZ ()I
      // 0dc: iload 8
      // 0de: isub
      // 0df: goto 0e6
      // 0e2: invokestatic ffn.d (Loov;)Loov;
      // 0e5: athrow
      // 0e6: istore 11
      // 0e8: iload 11
      // 0ea: aload 3
      // 0eb: invokevirtual mew.getZ ()I
      // 0ee: iload 8
      // 0f0: iadd
      // 0f1: if_icmpgt 17e
      // 0f4: iload 6
      // 0f6: iload 4
      // 0f8: ifne 0b8
      // 0fb: iload 4
      // 0fd: ifne 10c
      // 100: ifeq 17e
      // 103: goto 10a
      // 106: invokestatic ffn.d (Loov;)Loov;
      // 109: athrow
      // 10a: iload 7
      // 10c: iload 4
      // 10e: ifne 174
      // 111: iflt 16c
      // 114: goto 11b
      // 117: invokestatic ffn.d (Loov;)Loov;
      // 11a: athrow
      // 11b: iload 7
      // 11d: iload 4
      // 11f: ifne 174
      // 122: goto 129
      // 125: invokestatic ffn.d (Loov;)Loov;
      // 128: athrow
      // 129: sipush 256
      // 12c: if_icmpge 16c
      // 12f: goto 136
      // 132: invokestatic ffn.d (Loov;)Loov;
      // 135: athrow
      // 136: aload 0
      // 137: aload 1
      // 138: aload 9
      // 13a: iload 10
      // 13c: iload 7
      // 13e: iload 11
      // 140: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 143: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 146: invokeinterface zfz.r_y ()Le0x; 1
      // 14b: invokevirtual ffn.mgy (Le0x;)Z
      // 14e: iload 4
      // 150: ifne 165
      // 153: goto 15a
      // 156: invokestatic ffn.d (Loov;)Loov;
      // 159: athrow
      // 15a: ifne 176
      // 15d: goto 164
      // 160: invokestatic ffn.d (Loov;)Loov;
      // 163: athrow
      // 164: bipush 0
      // 165: istore 6
      // 167: iload 4
      // 169: ifeq 176
      // 16c: bipush 0
      // 16d: goto 174
      // 170: invokestatic ffn.d (Loov;)Loov;
      // 173: athrow
      // 174: istore 6
      // 176: iinc 11 1
      // 179: iload 4
      // 17b: ifeq 0e8
      // 17e: iinc 10 1
      // 181: iload 4
      // 183: ifeq 0b6
      // 186: iinc 7 1
      // 189: iload 4
      // 18b: ifeq 050
      // 18e: iload 6
      // 190: iload 4
      // 192: ifne 1a0
      // 195: ifne 1a1
      // 198: goto 19f
      // 19b: invokestatic ffn.d (Loov;)Loov;
      // 19e: athrow
      // 19f: bipush 0
      // 1a0: ireturn
      // 1a1: aload 1
      // 1a2: aload 3
      // 1a3: invokevirtual mew.eve ()Lmew;
      // 1a6: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1a9: invokeinterface zfz.r_y ()Le0x; 1
      // 1ae: astore 7
      // 1b0: aload 7
      // 1b2: getstatic ox_.l11 Lx82;
      // 1b5: iload 4
      // 1b7: ifne 1d0
      // 1ba: if_acmpeq 1ee
      // 1bd: goto 1c4
      // 1c0: invokestatic ffn.d (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 7
      // 1c6: getstatic ox_.kqk Le0x;
      // 1c9: goto 1d0
      // 1cc: invokestatic ffn.d (Loov;)Loov;
      // 1cf: athrow
      // 1d0: iload 4
      // 1d2: ifne 1eb
      // 1d5: if_acmpeq 1ee
      // 1d8: goto 1df
      // 1db: invokestatic ffn.d (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 7
      // 1e1: getstatic ox_._5i Le0x;
      // 1e4: goto 1eb
      // 1e7: invokestatic ffn.d (Loov;)Loov;
      // 1ea: athrow
      // 1eb: if_acmpne 7d5
      // 1ee: aload 3
      // 1ef: invokevirtual mew.getY ()I
      // 1f2: iload 4
      // 1f4: ifne 7d6
      // 1f7: goto 1fe
      // 1fa: invokestatic ffn.d (Loov;)Loov;
      // 1fd: athrow
      // 1fe: sipush 256
      // 201: iload 5
      // 203: isub
      // 204: bipush 1
      // 205: isub
      // 206: if_icmpge 7d5
      // 209: goto 210
      // 20c: invokestatic ffn.d (Loov;)Loov;
      // 20f: athrow
      // 210: aload 0
      // 211: aload 1
      // 212: aload 3
      // 213: invokevirtual mew.eve ()Lmew;
      // 216: invokevirtual ffn.g27 (Lt9d;Lmew;)V
      // 219: bipush 3
      // 21a: istore 8
      // 21c: bipush 0
      // 21d: istore 9
      // 21f: aload 3
      // 220: invokevirtual mew.getY ()I
      // 223: iload 8
      // 225: isub
      // 226: iload 5
      // 228: iadd
      // 229: istore 10
      // 22b: iload 10
      // 22d: aload 3
      // 22e: invokevirtual mew.getY ()I
      // 231: iload 5
      // 233: iadd
      // 234: if_icmpgt 379
      // 237: iload 10
      // 239: aload 3
      // 23a: invokevirtual mew.getY ()I
      // 23d: iload 5
      // 23f: iadd
      // 240: isub
      // 241: istore 11
      // 243: iload 9
      // 245: bipush 1
      // 246: iadd
      // 247: iload 11
      // 249: bipush 2
      // 24a: idiv
      // 24b: isub
      // 24c: istore 12
      // 24e: aload 3
      // 24f: invokevirtual mew.getX ()I
      // 252: iload 12
      // 254: isub
      // 255: iload 4
      // 257: ifne 37a
      // 25a: istore 13
      // 25c: iload 13
      // 25e: aload 3
      // 25f: invokevirtual mew.getX ()I
      // 262: iload 12
      // 264: iadd
      // 265: if_icmpgt 371
      // 268: iload 13
      // 26a: aload 3
      // 26b: invokevirtual mew.getX ()I
      // 26e: isub
      // 26f: istore 14
      // 271: aload 3
      // 272: invokevirtual mew.getZ ()I
      // 275: iload 12
      // 277: isub
      // 278: iload 4
      // 27a: ifne 22d
      // 27d: istore 15
      // 27f: iload 15
      // 281: aload 3
      // 282: invokevirtual mew.getZ ()I
      // 285: iload 12
      // 287: iadd
      // 288: if_icmpgt 369
      // 28b: iload 15
      // 28d: aload 3
      // 28e: invokevirtual mew.getZ ()I
      // 291: isub
      // 292: istore 16
      // 294: iload 14
      // 296: invokestatic java/lang/Math.abs (I)I
      // 299: iload 12
      // 29b: iload 4
      // 29d: ifne 265
      // 2a0: iload 4
      // 2a2: ifne 2c9
      // 2a5: if_icmpne 2ec
      // 2a8: goto 2af
      // 2ab: invokestatic ffn.d (Loov;)Loov;
      // 2ae: athrow
      // 2af: iload 16
      // 2b1: invokestatic java/lang/Math.abs (I)I
      // 2b4: iload 4
      // 2b6: ifne 2d8
      // 2b9: goto 2c0
      // 2bc: invokestatic ffn.d (Loov;)Loov;
      // 2bf: athrow
      // 2c0: iload 12
      // 2c2: goto 2c9
      // 2c5: invokestatic ffn.d (Loov;)Loov;
      // 2c8: athrow
      // 2c9: if_icmpne 2ec
      // 2cc: aload 2
      // 2cd: bipush 2
      // 2ce: invokevirtual java/util/Random.nextInt (I)I
      // 2d1: goto 2d8
      // 2d4: invokestatic ffn.d (Loov;)Loov;
      // 2d7: athrow
      // 2d8: iload 4
      // 2da: ifne 2e9
      // 2dd: ifeq 361
      // 2e0: goto 2e7
      // 2e3: invokestatic ffn.d (Loov;)Loov;
      // 2e6: athrow
      // 2e7: iload 11
      // 2e9: ifeq 361
      // 2ec: new mew
      // 2ef: dup
      // 2f0: iload 13
      // 2f2: iload 10
      // 2f4: iload 15
      // 2f6: invokespecial mew.<init> (III)V
      // 2f9: astore 17
      // 2fb: aload 1
      // 2fc: aload 17
      // 2fe: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 301: invokeinterface zfz.r_y ()Le0x; 1
      // 306: astore 18
      // 308: aload 18
      // 30a: invokevirtual e0x.p1r ()Lp3y;
      // 30d: getstatic p3y.cei Lp3y;
      // 310: iload 4
      // 312: ifne 32e
      // 315: if_acmpeq 34f
      // 318: goto 31f
      // 31b: invokestatic ffn.d (Loov;)Loov;
      // 31e: athrow
      // 31f: aload 18
      // 321: invokevirtual e0x.p1r ()Lp3y;
      // 324: getstatic p3y.hh1 Lp3y;
      // 327: goto 32e
      // 32a: invokestatic ffn.d (Loov;)Loov;
      // 32d: athrow
      // 32e: iload 4
      // 330: ifne 34c
      // 333: if_acmpeq 34f
      // 336: goto 33d
      // 339: invokestatic ffn.d (Loov;)Loov;
      // 33c: athrow
      // 33d: aload 18
      // 33f: invokevirtual e0x.p1r ()Lp3y;
      // 342: getstatic p3y.wui Lp3y;
      // 345: goto 34c
      // 348: invokestatic ffn.d (Loov;)Loov;
      // 34b: athrow
      // 34c: if_acmpne 361
      // 34f: aload 0
      // 350: aload 1
      // 351: aload 17
      // 353: aload 0
      // 354: getfield ffn.hux Lzfz;
      // 357: invokevirtual ffn.u0f (Lt9d;Lmew;Lzfz;)V
      // 35a: goto 361
      // 35d: invokestatic ffn.d (Loov;)Loov;
      // 360: athrow
      // 361: iinc 15 1
      // 364: iload 4
      // 366: ifeq 27f
      // 369: iinc 13 1
      // 36c: iload 4
      // 36e: ifeq 25c
      // 371: iinc 10 1
      // 374: iload 4
      // 376: ifeq 22b
      // 379: bipush 0
      // 37a: istore 10
      // 37c: iload 10
      // 37e: iload 5
      // 380: if_icmpge 55f
      // 383: aload 1
      // 384: aload 3
      // 385: iload 10
      // 387: invokevirtual mew.z89 (I)Lmew;
      // 38a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 38d: invokeinterface zfz.r_y ()Le0x; 1
      // 392: astore 11
      // 394: iload 4
      // 396: ifne 7d3
      // 399: iload 4
      // 39b: ifne 3fd
      // 39e: goto 3a5
      // 3a1: invokestatic ffn.d (Loov;)Loov;
      // 3a4: athrow
      // 3a5: aload 11
      // 3a7: invokevirtual e0x.p1r ()Lp3y;
      // 3aa: getstatic p3y.cei Lp3y;
      // 3ad: if_acmpeq 3e7
      // 3b0: goto 3b7
      // 3b3: invokestatic ffn.d (Loov;)Loov;
      // 3b6: athrow
      // 3b7: aload 11
      // 3b9: invokevirtual e0x.p1r ()Lp3y;
      // 3bc: getstatic p3y.hh1 Lp3y;
      // 3bf: iload 4
      // 3c1: ifne 3e4
      // 3c4: goto 3cb
      // 3c7: invokestatic ffn.d (Loov;)Loov;
      // 3ca: athrow
      // 3cb: if_acmpeq 3e7
      // 3ce: goto 3d5
      // 3d1: invokestatic ffn.d (Loov;)Loov;
      // 3d4: athrow
      // 3d5: aload 11
      // 3d7: invokevirtual e0x.p1r ()Lp3y;
      // 3da: getstatic p3y.wui Lp3y;
      // 3dd: goto 3e4
      // 3e0: invokestatic ffn.d (Loov;)Loov;
      // 3e3: athrow
      // 3e4: if_acmpne 557
      // 3e7: aload 0
      // 3e8: aload 1
      // 3e9: aload 3
      // 3ea: iload 10
      // 3ec: invokevirtual mew.z89 (I)Lmew;
      // 3ef: aload 0
      // 3f0: getfield ffn.scb Lzfz;
      // 3f3: invokevirtual ffn.u0f (Lt9d;Lmew;Lzfz;)V
      // 3f6: goto 3fd
      // 3f9: invokestatic ffn.d (Loov;)Loov;
      // 3fc: athrow
      // 3fd: iload 4
      // 3ff: ifne 55a
      // 402: aload 0
      // 403: getfield ffn.prq Z
      // 406: ifeq 557
      // 409: goto 410
      // 40c: invokestatic ffn.d (Loov;)Loov;
      // 40f: athrow
      // 410: iload 10
      // 412: iload 4
      // 414: ifne 434
      // 417: goto 41e
      // 41a: invokestatic ffn.d (Loov;)Loov;
      // 41d: athrow
      // 41e: ifle 557
      // 421: goto 428
      // 424: invokestatic ffn.d (Loov;)Loov;
      // 427: athrow
      // 428: aload 2
      // 429: bipush 3
      // 42a: invokevirtual java/util/Random.nextInt (I)I
      // 42d: goto 434
      // 430: invokestatic ffn.d (Loov;)Loov;
      // 433: athrow
      // 434: iload 4
      // 436: ifne 481
      // 439: ifle 47c
      // 43c: goto 443
      // 43f: invokestatic ffn.d (Loov;)Loov;
      // 442: athrow
      // 443: aload 1
      // 444: aload 3
      // 445: bipush -1
      // 446: iload 10
      // 448: bipush 0
      // 449: invokevirtual mew.ec4 (III)Lmew;
      // 44c: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 44f: iload 4
      // 451: ifne 481
      // 454: goto 45b
      // 457: invokestatic ffn.d (Loov;)Loov;
      // 45a: athrow
      // 45b: ifeq 47c
      // 45e: goto 465
      // 461: invokestatic ffn.d (Loov;)Loov;
      // 464: athrow
      // 465: aload 0
      // 466: aload 1
      // 467: aload 3
      // 468: bipush -1
      // 469: iload 10
      // 46b: bipush 0
      // 46c: invokevirtual mew.ec4 (III)Lmew;
      // 46f: getstatic pcl.t6u Lh76;
      // 472: invokespecial ffn.wgd (Lt9d;Lmew;Lh76;)V
      // 475: goto 47c
      // 478: invokestatic ffn.d (Loov;)Loov;
      // 47b: athrow
      // 47c: aload 2
      // 47d: bipush 3
      // 47e: invokevirtual java/util/Random.nextInt (I)I
      // 481: iload 4
      // 483: ifne 4ce
      // 486: ifle 4c9
      // 489: goto 490
      // 48c: invokestatic ffn.d (Loov;)Loov;
      // 48f: athrow
      // 490: aload 1
      // 491: aload 3
      // 492: bipush 1
      // 493: iload 10
      // 495: bipush 0
      // 496: invokevirtual mew.ec4 (III)Lmew;
      // 499: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 49c: iload 4
      // 49e: ifne 4ce
      // 4a1: goto 4a8
      // 4a4: invokestatic ffn.d (Loov;)Loov;
      // 4a7: athrow
      // 4a8: ifeq 4c9
      // 4ab: goto 4b2
      // 4ae: invokestatic ffn.d (Loov;)Loov;
      // 4b1: athrow
      // 4b2: aload 0
      // 4b3: aload 1
      // 4b4: aload 3
      // 4b5: bipush 1
      // 4b6: iload 10
      // 4b8: bipush 0
      // 4b9: invokevirtual mew.ec4 (III)Lmew;
      // 4bc: getstatic pcl.m4e Lh76;
      // 4bf: invokespecial ffn.wgd (Lt9d;Lmew;Lh76;)V
      // 4c2: goto 4c9
      // 4c5: invokestatic ffn.d (Loov;)Loov;
      // 4c8: athrow
      // 4c9: aload 2
      // 4ca: bipush 3
      // 4cb: invokevirtual java/util/Random.nextInt (I)I
      // 4ce: iload 4
      // 4d0: ifne 51b
      // 4d3: ifle 516
      // 4d6: goto 4dd
      // 4d9: invokestatic ffn.d (Loov;)Loov;
      // 4dc: athrow
      // 4dd: aload 1
      // 4de: aload 3
      // 4df: bipush 0
      // 4e0: iload 10
      // 4e2: bipush -1
      // 4e3: invokevirtual mew.ec4 (III)Lmew;
      // 4e6: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 4e9: iload 4
      // 4eb: ifne 51b
      // 4ee: goto 4f5
      // 4f1: invokestatic ffn.d (Loov;)Loov;
      // 4f4: athrow
      // 4f5: ifeq 516
      // 4f8: goto 4ff
      // 4fb: invokestatic ffn.d (Loov;)Loov;
      // 4fe: athrow
      // 4ff: aload 0
      // 500: aload 1
      // 501: aload 3
      // 502: bipush 0
      // 503: iload 10
      // 505: bipush -1
      // 506: invokevirtual mew.ec4 (III)Lmew;
      // 509: getstatic pcl.leq Lh76;
      // 50c: invokespecial ffn.wgd (Lt9d;Lmew;Lh76;)V
      // 50f: goto 516
      // 512: invokestatic ffn.d (Loov;)Loov;
      // 515: athrow
      // 516: aload 2
      // 517: bipush 3
      // 518: invokevirtual java/util/Random.nextInt (I)I
      // 51b: iload 4
      // 51d: ifne 53d
      // 520: ifle 557
      // 523: goto 52a
      // 526: invokestatic ffn.d (Loov;)Loov;
      // 529: athrow
      // 52a: aload 1
      // 52b: aload 3
      // 52c: bipush 0
      // 52d: iload 10
      // 52f: bipush 1
      // 530: invokevirtual mew.ec4 (III)Lmew;
      // 533: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 536: goto 53d
      // 539: invokestatic ffn.d (Loov;)Loov;
      // 53c: athrow
      // 53d: ifeq 557
      // 540: aload 0
      // 541: aload 1
      // 542: aload 3
      // 543: bipush 0
      // 544: iload 10
      // 546: bipush 1
      // 547: invokevirtual mew.ec4 (III)Lmew;
      // 54a: getstatic pcl.qme Lh76;
      // 54d: invokespecial ffn.wgd (Lt9d;Lmew;Lh76;)V
      // 550: goto 557
      // 553: invokestatic ffn.d (Loov;)Loov;
      // 556: athrow
      // 557: iinc 10 1
      // 55a: iload 4
      // 55c: ifeq 37c
      // 55f: aload 0
      // 560: getfield ffn.prq Z
      // 563: iload 4
      // 565: ifne 7d4
      // 568: ifeq 7d3
      // 56b: goto 572
      // 56e: invokestatic ffn.d (Loov;)Loov;
      // 571: athrow
      // 572: aload 3
      // 573: invokevirtual mew.getY ()I
      // 576: bipush 3
      // 577: isub
      // 578: iload 5
      // 57a: iadd
      // 57b: istore 10
      // 57d: iload 10
      // 57f: aload 3
      // 580: invokevirtual mew.getY ()I
      // 583: iload 5
      // 585: iadd
      // 586: if_icmpgt 73a
      // 589: iload 10
      // 58b: aload 3
      // 58c: invokevirtual mew.getY ()I
      // 58f: iload 5
      // 591: iadd
      // 592: isub
      // 593: istore 11
      // 595: bipush 2
      // 596: iload 11
      // 598: bipush 2
      // 599: idiv
      // 59a: isub
      // 59b: istore 12
      // 59d: new mew$mix
      // 5a0: dup
      // 5a1: invokespecial mew$mix.<init> ()V
      // 5a4: astore 13
      // 5a6: aload 3
      // 5a7: invokevirtual mew.getX ()I
      // 5aa: iload 12
      // 5ac: isub
      // 5ad: iload 4
      // 5af: ifne 73f
      // 5b2: istore 14
      // 5b4: iload 14
      // 5b6: aload 3
      // 5b7: invokevirtual mew.getX ()I
      // 5ba: iload 12
      // 5bc: iadd
      // 5bd: if_icmpgt 732
      // 5c0: aload 3
      // 5c1: invokevirtual mew.getZ ()I
      // 5c4: iload 12
      // 5c6: isub
      // 5c7: iload 4
      // 5c9: ifne 57f
      // 5cc: istore 15
      // 5ce: iload 15
      // 5d0: aload 3
      // 5d1: invokevirtual mew.getZ ()I
      // 5d4: iload 12
      // 5d6: iadd
      // 5d7: if_icmpgt 72a
      // 5da: aload 13
      // 5dc: iload 14
      // 5de: iload 10
      // 5e0: iload 15
      // 5e2: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 5e5: pop
      // 5e6: iload 4
      // 5e8: ifne 72d
      // 5eb: iload 4
      // 5ed: ifne 725
      // 5f0: goto 5f7
      // 5f3: invokestatic ffn.d (Loov;)Loov;
      // 5f6: athrow
      // 5f7: aload 1
      // 5f8: aload 13
      // 5fa: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 5fd: invokeinterface zfz.r_y ()Le0x; 1
      // 602: invokevirtual e0x.p1r ()Lp3y;
      // 605: getstatic p3y.hh1 Lp3y;
      // 608: if_acmpne 722
      // 60b: goto 612
      // 60e: invokestatic ffn.d (Loov;)Loov;
      // 611: athrow
      // 612: aload 13
      // 614: invokevirtual mew$mix.y8e ()Lmew;
      // 617: astore 16
      // 619: aload 13
      // 61b: invokevirtual mew$mix.o_8 ()Lmew;
      // 61e: astore 17
      // 620: aload 13
      // 622: invokevirtual mew$mix.idu ()Lmew;
      // 625: astore 18
      // 627: aload 13
      // 629: invokevirtual mew$mix.z6x ()Lmew;
      // 62c: astore 19
      // 62e: aload 2
      // 62f: bipush 4
      // 630: invokevirtual java/util/Random.nextInt (I)I
      // 633: iload 4
      // 635: ifne 673
      // 638: ifne 66e
      // 63b: goto 642
      // 63e: invokestatic ffn.d (Loov;)Loov;
      // 641: athrow
      // 642: aload 1
      // 643: aload 16
      // 645: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 648: invokeinterface zfz.r_y ()Le0x; 1
      // 64d: invokevirtual e0x.p1r ()Lp3y;
      // 650: getstatic p3y.cei Lp3y;
      // 653: if_acmpne 66e
      // 656: goto 65d
      // 659: invokestatic ffn.d (Loov;)Loov;
      // 65c: athrow
      // 65d: aload 0
      // 65e: aload 1
      // 65f: aload 16
      // 661: getstatic pcl.t6u Lh76;
      // 664: invokespecial ffn.o4l (Lt9d;Lmew;Lh76;)V
      // 667: goto 66e
      // 66a: invokestatic ffn.d (Loov;)Loov;
      // 66d: athrow
      // 66e: aload 2
      // 66f: bipush 4
      // 670: invokevirtual java/util/Random.nextInt (I)I
      // 673: iload 4
      // 675: ifne 6b3
      // 678: ifne 6ae
      // 67b: goto 682
      // 67e: invokestatic ffn.d (Loov;)Loov;
      // 681: athrow
      // 682: aload 1
      // 683: aload 17
      // 685: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 688: invokeinterface zfz.r_y ()Le0x; 1
      // 68d: invokevirtual e0x.p1r ()Lp3y;
      // 690: getstatic p3y.cei Lp3y;
      // 693: if_acmpne 6ae
      // 696: goto 69d
      // 699: invokestatic ffn.d (Loov;)Loov;
      // 69c: athrow
      // 69d: aload 0
      // 69e: aload 1
      // 69f: aload 17
      // 6a1: getstatic pcl.m4e Lh76;
      // 6a4: invokespecial ffn.o4l (Lt9d;Lmew;Lh76;)V
      // 6a7: goto 6ae
      // 6aa: invokestatic ffn.d (Loov;)Loov;
      // 6ad: athrow
      // 6ae: aload 2
      // 6af: bipush 4
      // 6b0: invokevirtual java/util/Random.nextInt (I)I
      // 6b3: iload 4
      // 6b5: ifne 6f3
      // 6b8: ifne 6ee
      // 6bb: goto 6c2
      // 6be: invokestatic ffn.d (Loov;)Loov;
      // 6c1: athrow
      // 6c2: aload 1
      // 6c3: aload 18
      // 6c5: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 6c8: invokeinterface zfz.r_y ()Le0x; 1
      // 6cd: invokevirtual e0x.p1r ()Lp3y;
      // 6d0: getstatic p3y.cei Lp3y;
      // 6d3: if_acmpne 6ee
      // 6d6: goto 6dd
      // 6d9: invokestatic ffn.d (Loov;)Loov;
      // 6dc: athrow
      // 6dd: aload 0
      // 6de: aload 1
      // 6df: aload 18
      // 6e1: getstatic pcl.leq Lh76;
      // 6e4: invokespecial ffn.o4l (Lt9d;Lmew;Lh76;)V
      // 6e7: goto 6ee
      // 6ea: invokestatic ffn.d (Loov;)Loov;
      // 6ed: athrow
      // 6ee: aload 2
      // 6ef: bipush 4
      // 6f0: invokevirtual java/util/Random.nextInt (I)I
      // 6f3: ifne 722
      // 6f6: aload 1
      // 6f7: aload 19
      // 6f9: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 6fc: invokeinterface zfz.r_y ()Le0x; 1
      // 701: invokevirtual e0x.p1r ()Lp3y;
      // 704: getstatic p3y.cei Lp3y;
      // 707: if_acmpne 722
      // 70a: goto 711
      // 70d: invokestatic ffn.d (Loov;)Loov;
      // 710: athrow
      // 711: aload 0
      // 712: aload 1
      // 713: aload 19
      // 715: getstatic pcl.qme Lh76;
      // 718: invokespecial ffn.o4l (Lt9d;Lmew;Lh76;)V
      // 71b: goto 722
      // 71e: invokestatic ffn.d (Loov;)Loov;
      // 721: athrow
      // 722: iinc 15 1
      // 725: iload 4
      // 727: ifeq 5ce
      // 72a: iinc 14 1
      // 72d: iload 4
      // 72f: ifeq 5b4
      // 732: iinc 10 1
      // 735: iload 4
      // 737: ifeq 57d
      // 73a: aload 2
      // 73b: bipush 5
      // 73c: invokevirtual java/util/Random.nextInt (I)I
      // 73f: iload 4
      // 741: ifne 7d4
      // 744: ifne 7d3
      // 747: goto 74e
      // 74a: invokestatic ffn.d (Loov;)Loov;
      // 74d: athrow
      // 74e: iload 5
      // 750: iload 4
      // 752: ifne 7d4
      // 755: goto 75c
      // 758: invokestatic ffn.d (Loov;)Loov;
      // 75b: athrow
      // 75c: bipush 5
      // 75d: if_icmple 7d3
      // 760: goto 767
      // 763: invokestatic ffn.d (Loov;)Loov;
      // 766: athrow
      // 767: bipush 0
      // 768: istore 10
      // 76a: iload 10
      // 76c: bipush 2
      // 76d: if_icmpge 7d3
      // 770: getstatic vt2$unz.fzl Lvt2$unz;
      // 773: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 776: astore 11
      // 778: aload 11
      // 77a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 77f: ifeq 7cb
      // 782: aload 11
      // 784: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 789: checkcast vt2
      // 78c: astore 12
      // 78e: aload 2
      // 78f: bipush 4
      // 790: iload 10
      // 792: isub
      // 793: invokevirtual java/util/Random.nextInt (I)I
      // 796: iload 4
      // 798: ifne 76c
      // 79b: ifne 7c6
      // 79e: aload 12
      // 7a0: invokevirtual vt2.b4b ()Lvt2;
      // 7a3: astore 13
      // 7a5: aload 0
      // 7a6: aload 1
      // 7a7: aload 2
      // 7a8: bipush 3
      // 7a9: invokevirtual java/util/Random.nextInt (I)I
      // 7ac: aload 3
      // 7ad: aload 13
      // 7af: invokevirtual vt2.n67 ()I
      // 7b2: iload 5
      // 7b4: bipush 5
      // 7b5: isub
      // 7b6: iload 10
      // 7b8: iadd
      // 7b9: aload 13
      // 7bb: invokevirtual vt2.ozy ()I
      // 7be: invokevirtual mew.ec4 (III)Lmew;
      // 7c1: aload 12
      // 7c3: invokespecial ffn.a4p (Lt9d;ILmew;Lvt2;)V
      // 7c6: iload 4
      // 7c8: ifeq 778
      // 7cb: iinc 10 1
      // 7ce: iload 4
      // 7d0: ifeq 76a
      // 7d3: bipush 1
      // 7d4: ireturn
      // 7d5: bipush 0
      // 7d6: ireturn
      // 7d7: bipush 0
      // 7d8: ireturn
   }

   private void a4p(t9d var1, int var2, mew var3, vt2 var4) {
      this.u0f(var1, var3, ox_.ox_.l4i().zvi(kre.q7v, var2).zvi(kre.em9, var4));
   }

   private void wgd(t9d var1, mew var2, h76 var3) {
      this.u0f(var1, var2, ox_.s25.l4i().zvi(var3, true));
   }

   private void o4l(t9d var1, mew var2, h76 var3) {
      this.wgd(var1, var2, var3);
      int var10000 = t9d.b();
      int var5 = 4;
      int var4 = var10000;
      var2 = var2.eve();

      while (var1.getBlockState(var2).r_y().p1r() == p3y.cei && var5 > 0) {
         this.wgd(var1, var2, var3);
         var2 = var2.eve();
         var5--;
         if (var4 == 0) {
            break;
         }
      }
   }

   private static oov d(oov var0) {
      return var0;
   }
}
