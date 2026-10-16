import java.util.Random;

public class h7i extends e9q {
   private static final zfz gkg = ox_.a4y.l4i().zvi(qgq.m_o, x54$lti.y2x);
   private static final zfz ShaderBase = ox_.x_c.l4i().zvi(xer.cq8, x54$lti.y2x).zvi(_cv.sdu, false);

   public h7i(boolean var1) {
      super(var1);
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
      // 000: aload 2
      // 001: bipush 3
      // 002: invokevirtual java/util/Random.nextInt (I)I
      // 005: aload 2
      // 006: bipush 3
      // 007: invokevirtual java/util/Random.nextInt (I)I
      // 00a: iadd
      // 00b: bipush 5
      // 00c: iadd
      // 00d: istore 5
      // 00f: invokestatic OpaquePredicate.c ()I
      // 012: bipush 1
      // 013: istore 6
      // 015: istore 4
      // 017: aload 3
      // 018: invokevirtual mew.getY ()I
      // 01b: iload 4
      // 01d: ifne 5a0
      // 020: bipush 1
      // 021: if_icmplt 59f
      // 024: goto 02b
      // 027: invokestatic h7i.a (Loov;)Loov;
      // 02a: athrow
      // 02b: aload 3
      // 02c: invokevirtual mew.getY ()I
      // 02f: iload 5
      // 031: iadd
      // 032: bipush 1
      // 033: iadd
      // 034: iload 4
      // 036: ifne 5a0
      // 039: goto 040
      // 03c: invokestatic h7i.a (Loov;)Loov;
      // 03f: athrow
      // 040: sipush 256
      // 043: if_icmpgt 59f
      // 046: goto 04d
      // 049: invokestatic h7i.a (Loov;)Loov;
      // 04c: athrow
      // 04d: aload 3
      // 04e: invokevirtual mew.getY ()I
      // 051: istore 7
      // 053: iload 7
      // 055: aload 3
      // 056: invokevirtual mew.getY ()I
      // 059: bipush 1
      // 05a: iadd
      // 05b: iload 5
      // 05d: iadd
      // 05e: if_icmpgt 191
      // 061: bipush 1
      // 062: istore 8
      // 064: iload 7
      // 066: iload 4
      // 068: ifne 193
      // 06b: aload 3
      // 06c: invokevirtual mew.getY ()I
      // 06f: iload 4
      // 071: ifne 0a1
      // 074: goto 07b
      // 077: invokestatic h7i.a (Loov;)Loov;
      // 07a: athrow
      // 07b: if_icmpne 088
      // 07e: goto 085
      // 081: invokestatic h7i.a (Loov;)Loov;
      // 084: athrow
      // 085: bipush 0
      // 086: istore 8
      // 088: iload 7
      // 08a: iload 4
      // 08c: ifne 0a5
      // 08f: aload 3
      // 090: invokevirtual mew.getY ()I
      // 093: bipush 1
      // 094: iadd
      // 095: iload 5
      // 097: iadd
      // 098: bipush 2
      // 099: isub
      // 09a: goto 0a1
      // 09d: invokestatic h7i.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: if_icmplt 0a7
      // 0a4: bipush 2
      // 0a5: istore 8
      // 0a7: new mew$mix
      // 0aa: dup
      // 0ab: invokespecial mew$mix.<init> ()V
      // 0ae: astore 9
      // 0b0: aload 3
      // 0b1: invokevirtual mew.getX ()I
      // 0b4: iload 8
      // 0b6: isub
      // 0b7: istore 10
      // 0b9: iload 10
      // 0bb: aload 3
      // 0bc: invokevirtual mew.getX ()I
      // 0bf: iload 8
      // 0c1: iadd
      // 0c2: if_icmpgt 189
      // 0c5: iload 6
      // 0c7: iload 4
      // 0c9: ifne 055
      // 0cc: iload 4
      // 0ce: ifne 0e9
      // 0d1: ifeq 189
      // 0d4: goto 0db
      // 0d7: invokestatic h7i.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 3
      // 0dc: invokevirtual mew.getZ ()I
      // 0df: iload 8
      // 0e1: isub
      // 0e2: goto 0e9
      // 0e5: invokestatic h7i.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: istore 11
      // 0eb: iload 11
      // 0ed: aload 3
      // 0ee: invokevirtual mew.getZ ()I
      // 0f1: iload 8
      // 0f3: iadd
      // 0f4: if_icmpgt 181
      // 0f7: iload 6
      // 0f9: iload 4
      // 0fb: ifne 0bb
      // 0fe: iload 4
      // 100: ifne 10f
      // 103: ifeq 181
      // 106: goto 10d
      // 109: invokestatic h7i.a (Loov;)Loov;
      // 10c: athrow
      // 10d: iload 7
      // 10f: iload 4
      // 111: ifne 177
      // 114: iflt 16f
      // 117: goto 11e
      // 11a: invokestatic h7i.a (Loov;)Loov;
      // 11d: athrow
      // 11e: iload 7
      // 120: iload 4
      // 122: ifne 177
      // 125: goto 12c
      // 128: invokestatic h7i.a (Loov;)Loov;
      // 12b: athrow
      // 12c: sipush 256
      // 12f: if_icmpge 16f
      // 132: goto 139
      // 135: invokestatic h7i.a (Loov;)Loov;
      // 138: athrow
      // 139: aload 0
      // 13a: aload 1
      // 13b: aload 9
      // 13d: iload 10
      // 13f: iload 7
      // 141: iload 11
      // 143: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 146: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 149: invokeinterface zfz.r_y ()Le0x; 1
      // 14e: invokevirtual h7i.mgy (Le0x;)Z
      // 151: iload 4
      // 153: ifne 168
      // 156: goto 15d
      // 159: invokestatic h7i.a (Loov;)Loov;
      // 15c: athrow
      // 15d: ifne 179
      // 160: goto 167
      // 163: invokestatic h7i.a (Loov;)Loov;
      // 166: athrow
      // 167: bipush 0
      // 168: istore 6
      // 16a: iload 4
      // 16c: ifeq 179
      // 16f: bipush 0
      // 170: goto 177
      // 173: invokestatic h7i.a (Loov;)Loov;
      // 176: athrow
      // 177: istore 6
      // 179: iinc 11 1
      // 17c: iload 4
      // 17e: ifeq 0eb
      // 181: iinc 10 1
      // 184: iload 4
      // 186: ifeq 0b9
      // 189: iinc 7 1
      // 18c: iload 4
      // 18e: ifeq 053
      // 191: iload 6
      // 193: iload 4
      // 195: ifne 1a3
      // 198: ifne 1a4
      // 19b: goto 1a2
      // 19e: invokestatic h7i.a (Loov;)Loov;
      // 1a1: athrow
      // 1a2: bipush 0
      // 1a3: ireturn
      // 1a4: aload 1
      // 1a5: aload 3
      // 1a6: invokevirtual mew.eve ()Lmew;
      // 1a9: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1ac: invokeinterface zfz.r_y ()Le0x; 1
      // 1b1: astore 7
      // 1b3: aload 7
      // 1b5: getstatic ox_.l11 Lx82;
      // 1b8: iload 4
      // 1ba: ifne 1d3
      // 1bd: if_acmpeq 1d6
      // 1c0: goto 1c7
      // 1c3: invokestatic h7i.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: aload 7
      // 1c9: getstatic ox_.kqk Le0x;
      // 1cc: goto 1d3
      // 1cf: invokestatic h7i.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: if_acmpne 59d
      // 1d6: aload 3
      // 1d7: invokevirtual mew.getY ()I
      // 1da: iload 4
      // 1dc: ifne 59e
      // 1df: goto 1e6
      // 1e2: invokestatic h7i.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: sipush 256
      // 1e9: iload 5
      // 1eb: isub
      // 1ec: bipush 1
      // 1ed: isub
      // 1ee: if_icmpge 59d
      // 1f1: goto 1f8
      // 1f4: invokestatic h7i.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: aload 0
      // 1f9: aload 1
      // 1fa: aload 3
      // 1fb: invokevirtual mew.eve ()Lmew;
      // 1fe: invokevirtual h7i.g27 (Lt9d;Lmew;)V
      // 201: getstatic vt2$unz.fzl Lvt2$unz;
      // 204: aload 2
      // 205: invokevirtual vt2$unz.cvs (Ljava/util/Random;)Lvt2;
      // 208: astore 8
      // 20a: iload 5
      // 20c: aload 2
      // 20d: bipush 4
      // 20e: invokevirtual java/util/Random.nextInt (I)I
      // 211: isub
      // 212: bipush 1
      // 213: isub
      // 214: istore 9
      // 216: bipush 3
      // 217: aload 2
      // 218: bipush 3
      // 219: invokevirtual java/util/Random.nextInt (I)I
      // 21c: isub
      // 21d: istore 10
      // 21f: aload 3
      // 220: invokevirtual mew.getX ()I
      // 223: istore 11
      // 225: aload 3
      // 226: invokevirtual mew.getZ ()I
      // 229: istore 12
      // 22b: bipush 0
      // 22c: istore 13
      // 22e: bipush 0
      // 22f: istore 14
      // 231: iload 14
      // 233: iload 5
      // 235: if_icmpge 2e4
      // 238: aload 3
      // 239: iload 4
      // 23b: ifne 2f1
      // 23e: invokevirtual mew.getY ()I
      // 241: iload 14
      // 243: iadd
      // 244: istore 15
      // 246: iload 14
      // 248: iload 4
      // 24a: ifne 262
      // 24d: iload 9
      // 24f: if_icmplt 288
      // 252: goto 259
      // 255: invokestatic h7i.a (Loov;)Loov;
      // 258: athrow
      // 259: iload 10
      // 25b: goto 262
      // 25e: invokestatic h7i.a (Loov;)Loov;
      // 261: athrow
      // 262: iload 4
      // 264: ifne 283
      // 267: ifle 288
      // 26a: goto 271
      // 26d: invokestatic h7i.a (Loov;)Loov;
      // 270: athrow
      // 271: iload 11
      // 273: aload 8
      // 275: invokevirtual vt2.n67 ()I
      // 278: iadd
      // 279: istore 11
      // 27b: iload 12
      // 27d: aload 8
      // 27f: invokevirtual vt2.ozy ()I
      // 282: iadd
      // 283: istore 12
      // 285: iinc 10 -1
      // 288: new mew
      // 28b: dup
      // 28c: iload 11
      // 28e: iload 15
      // 290: iload 12
      // 292: invokespecial mew.<init> (III)V
      // 295: astore 16
      // 297: aload 1
      // 298: aload 16
      // 29a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 29d: invokeinterface zfz.r_y ()Le0x; 1
      // 2a2: invokevirtual e0x.p1r ()Lp3y;
      // 2a5: astore 17
      // 2a7: iload 4
      // 2a9: ifne 2d8
      // 2ac: aload 17
      // 2ae: getstatic p3y.cei Lp3y;
      // 2b1: if_acmpeq 2ca
      // 2b4: goto 2bb
      // 2b7: invokestatic h7i.a (Loov;)Loov;
      // 2ba: athrow
      // 2bb: aload 17
      // 2bd: getstatic p3y.hh1 Lp3y;
      // 2c0: if_acmpne 2dc
      // 2c3: goto 2ca
      // 2c6: invokestatic h7i.a (Loov;)Loov;
      // 2c9: athrow
      // 2ca: aload 0
      // 2cb: aload 1
      // 2cc: aload 16
      // 2ce: invokespecial h7i.ngn (Lt9d;Lmew;)V
      // 2d1: goto 2d8
      // 2d4: invokestatic h7i.a (Loov;)Loov;
      // 2d7: athrow
      // 2d8: iload 15
      // 2da: istore 13
      // 2dc: iinc 14 1
      // 2df: iload 4
      // 2e1: ifeq 231
      // 2e4: new mew
      // 2e7: dup
      // 2e8: iload 11
      // 2ea: iload 13
      // 2ec: iload 12
      // 2ee: invokespecial mew.<init> (III)V
      // 2f1: astore 14
      // 2f3: bipush -3
      // 2f5: istore 15
      // 2f7: iload 15
      // 2f9: bipush 3
      // 2fa: if_icmpgt 35c
      // 2fd: bipush -3
      // 2ff: iload 4
      // 301: ifne 364
      // 304: istore 16
      // 306: iload 16
      // 308: bipush 3
      // 309: if_icmpgt 354
      // 30c: iload 15
      // 30e: invokestatic java/lang/Math.abs (I)I
      // 311: bipush 3
      // 312: iload 4
      // 314: ifne 2fa
      // 317: iload 4
      // 319: ifne 333
      // 31c: if_icmpne 336
      // 31f: goto 326
      // 322: invokestatic h7i.a (Loov;)Loov;
      // 325: athrow
      // 326: iload 16
      // 328: invokestatic java/lang/Math.abs (I)I
      // 32b: bipush 3
      // 32c: goto 333
      // 32f: invokestatic h7i.a (Loov;)Loov;
      // 332: athrow
      // 333: if_icmpeq 34c
      // 336: aload 0
      // 337: aload 1
      // 338: aload 14
      // 33a: iload 15
      // 33c: bipush 0
      // 33d: iload 16
      // 33f: invokevirtual mew.ec4 (III)Lmew;
      // 342: invokespecial h7i.k3t (Lt9d;Lmew;)V
      // 345: goto 34c
      // 348: invokestatic h7i.a (Loov;)Loov;
      // 34b: athrow
      // 34c: iinc 16 1
      // 34f: iload 4
      // 351: ifeq 306
      // 354: iinc 15 1
      // 357: iload 4
      // 359: ifeq 2f7
      // 35c: aload 14
      // 35e: invokevirtual mew.nuv ()Lmew;
      // 361: astore 14
      // 363: bipush -1
      // 364: istore 15
      // 366: iload 15
      // 368: bipush 1
      // 369: if_icmpgt 3a5
      // 36c: bipush -1
      // 36d: iload 4
      // 36f: ifne 3db
      // 372: istore 16
      // 374: iload 16
      // 376: bipush 1
      // 377: if_icmpgt 39d
      // 37a: aload 0
      // 37b: aload 1
      // 37c: aload 14
      // 37e: iload 15
      // 380: bipush 0
      // 381: iload 16
      // 383: invokevirtual mew.ec4 (III)Lmew;
      // 386: invokespecial h7i.k3t (Lt9d;Lmew;)V
      // 389: iinc 16 1
      // 38c: iload 4
      // 38e: ifne 3a0
      // 391: iload 4
      // 393: ifeq 374
      // 396: goto 39d
      // 399: invokestatic h7i.a (Loov;)Loov;
      // 39c: athrow
      // 39d: iinc 15 1
      // 3a0: iload 4
      // 3a2: ifeq 366
      // 3a5: aload 0
      // 3a6: aload 1
      // 3a7: aload 14
      // 3a9: bipush 2
      // 3aa: invokevirtual mew.b20 (I)Lmew;
      // 3ad: invokespecial h7i.k3t (Lt9d;Lmew;)V
      // 3b0: aload 0
      // 3b1: aload 1
      // 3b2: aload 14
      // 3b4: bipush 2
      // 3b5: invokevirtual mew.g52 (I)Lmew;
      // 3b8: invokespecial h7i.k3t (Lt9d;Lmew;)V
      // 3bb: aload 0
      // 3bc: aload 1
      // 3bd: aload 14
      // 3bf: bipush 2
      // 3c0: invokevirtual mew.wfo (I)Lmew;
      // 3c3: invokespecial h7i.k3t (Lt9d;Lmew;)V
      // 3c6: aload 0
      // 3c7: aload 1
      // 3c8: aload 14
      // 3ca: bipush 2
      // 3cb: invokevirtual mew.pzc (I)Lmew;
      // 3ce: invokespecial h7i.k3t (Lt9d;Lmew;)V
      // 3d1: aload 3
      // 3d2: invokevirtual mew.getX ()I
      // 3d5: istore 11
      // 3d7: aload 3
      // 3d8: invokevirtual mew.getZ ()I
      // 3db: istore 12
      // 3dd: getstatic vt2$unz.fzl Lvt2$unz;
      // 3e0: aload 2
      // 3e1: invokevirtual vt2$unz.cvs (Ljava/util/Random;)Lvt2;
      // 3e4: astore 15
      // 3e6: aload 15
      // 3e8: aload 8
      // 3ea: if_acmpeq 59b
      // 3ed: iload 9
      // 3ef: aload 2
      // 3f0: bipush 2
      // 3f1: invokevirtual java/util/Random.nextInt (I)I
      // 3f4: isub
      // 3f5: bipush 1
      // 3f6: isub
      // 3f7: istore 16
      // 3f9: bipush 1
      // 3fa: aload 2
      // 3fb: bipush 3
      // 3fc: invokevirtual java/util/Random.nextInt (I)I
      // 3ff: iadd
      // 400: istore 17
      // 402: bipush 0
      // 403: istore 13
      // 405: iload 16
      // 407: istore 18
      // 409: iload 18
      // 40b: iload 5
      // 40d: if_icmpge 4c9
      // 410: iload 17
      // 412: iload 4
      // 414: ifne 4cb
      // 417: iload 4
      // 419: ifne 4cb
      // 41c: goto 423
      // 41f: invokestatic h7i.a (Loov;)Loov;
      // 422: athrow
      // 423: ifle 4c9
      // 426: goto 42d
      // 429: invokestatic h7i.a (Loov;)Loov;
      // 42c: athrow
      // 42d: iload 18
      // 42f: bipush 1
      // 430: iload 4
      // 432: ifne 453
      // 435: goto 43c
      // 438: invokestatic h7i.a (Loov;)Loov;
      // 43b: athrow
      // 43c: if_icmplt 4be
      // 43f: goto 446
      // 442: invokestatic h7i.a (Loov;)Loov;
      // 445: athrow
      // 446: aload 3
      // 447: invokevirtual mew.getY ()I
      // 44a: iload 18
      // 44c: goto 453
      // 44f: invokestatic h7i.a (Loov;)Loov;
      // 452: athrow
      // 453: iadd
      // 454: istore 19
      // 456: iload 11
      // 458: aload 15
      // 45a: invokevirtual vt2.n67 ()I
      // 45d: iadd
      // 45e: istore 11
      // 460: iload 12
      // 462: aload 15
      // 464: invokevirtual vt2.ozy ()I
      // 467: iadd
      // 468: istore 12
      // 46a: new mew
      // 46d: dup
      // 46e: iload 11
      // 470: iload 19
      // 472: iload 12
      // 474: invokespecial mew.<init> (III)V
      // 477: astore 20
      // 479: aload 1
      // 47a: aload 20
      // 47c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 47f: invokeinterface zfz.r_y ()Le0x; 1
      // 484: invokevirtual e0x.p1r ()Lp3y;
      // 487: astore 21
      // 489: iload 4
      // 48b: ifne 4ba
      // 48e: aload 21
      // 490: getstatic p3y.cei Lp3y;
      // 493: if_acmpeq 4ac
      // 496: goto 49d
      // 499: invokestatic h7i.a (Loov;)Loov;
      // 49c: athrow
      // 49d: aload 21
      // 49f: getstatic p3y.hh1 Lp3y;
      // 4a2: if_acmpne 4be
      // 4a5: goto 4ac
      // 4a8: invokestatic h7i.a (Loov;)Loov;
      // 4ab: athrow
      // 4ac: aload 0
      // 4ad: aload 1
      // 4ae: aload 20
      // 4b0: invokespecial h7i.ngn (Lt9d;Lmew;)V
      // 4b3: goto 4ba
      // 4b6: invokestatic h7i.a (Loov;)Loov;
      // 4b9: athrow
      // 4ba: iload 19
      // 4bc: istore 13
      // 4be: iinc 18 1
      // 4c1: iinc 17 -1
      // 4c4: iload 4
      // 4c6: ifeq 409
      // 4c9: iload 13
      // 4cb: iload 4
      // 4cd: ifne 59c
      // 4d0: ifle 59b
      // 4d3: goto 4da
      // 4d6: invokestatic h7i.a (Loov;)Loov;
      // 4d9: athrow
      // 4da: new mew
      // 4dd: dup
      // 4de: iload 11
      // 4e0: iload 13
      // 4e2: iload 12
      // 4e4: invokespecial mew.<init> (III)V
      // 4e7: astore 18
      // 4e9: bipush -2
      // 4eb: istore 19
      // 4ed: iload 19
      // 4ef: bipush 2
      // 4f0: if_icmpgt 552
      // 4f3: bipush -2
      // 4f5: iload 4
      // 4f7: ifne 55a
      // 4fa: istore 20
      // 4fc: iload 20
      // 4fe: bipush 2
      // 4ff: if_icmpgt 54a
      // 502: iload 19
      // 504: invokestatic java/lang/Math.abs (I)I
      // 507: bipush 2
      // 508: iload 4
      // 50a: ifne 4f0
      // 50d: iload 4
      // 50f: ifne 529
      // 512: if_icmpne 52c
      // 515: goto 51c
      // 518: invokestatic h7i.a (Loov;)Loov;
      // 51b: athrow
      // 51c: iload 20
      // 51e: invokestatic java/lang/Math.abs (I)I
      // 521: bipush 2
      // 522: goto 529
      // 525: invokestatic h7i.a (Loov;)Loov;
      // 528: athrow
      // 529: if_icmpeq 542
      // 52c: aload 0
      // 52d: aload 1
      // 52e: aload 18
      // 530: iload 19
      // 532: bipush 0
      // 533: iload 20
      // 535: invokevirtual mew.ec4 (III)Lmew;
      // 538: invokespecial h7i.k3t (Lt9d;Lmew;)V
      // 53b: goto 542
      // 53e: invokestatic h7i.a (Loov;)Loov;
      // 541: athrow
      // 542: iinc 20 1
      // 545: iload 4
      // 547: ifeq 4fc
      // 54a: iinc 19 1
      // 54d: iload 4
      // 54f: ifeq 4ed
      // 552: aload 18
      // 554: invokevirtual mew.nuv ()Lmew;
      // 557: astore 18
      // 559: bipush -1
      // 55a: istore 19
      // 55c: iload 19
      // 55e: bipush 1
      // 55f: if_icmpgt 59b
      // 562: bipush -1
      // 563: iload 4
      // 565: ifne 59c
      // 568: istore 20
      // 56a: iload 20
      // 56c: bipush 1
      // 56d: if_icmpgt 593
      // 570: aload 0
      // 571: aload 1
      // 572: aload 18
      // 574: iload 19
      // 576: bipush 0
      // 577: iload 20
      // 579: invokevirtual mew.ec4 (III)Lmew;
      // 57c: invokespecial h7i.k3t (Lt9d;Lmew;)V
      // 57f: iinc 20 1
      // 582: iload 4
      // 584: ifne 596
      // 587: iload 4
      // 589: ifeq 56a
      // 58c: goto 593
      // 58f: invokestatic h7i.a (Loov;)Loov;
      // 592: athrow
      // 593: iinc 19 1
      // 596: iload 4
      // 598: ifeq 55c
      // 59b: bipush 1
      // 59c: ireturn
      // 59d: bipush 0
      // 59e: ireturn
      // 59f: bipush 0
      // 5a0: ireturn
   }

   private void ngn(OpaquePredicate var1, mew var2) {
      this.u0f(var1, var2, gkg);
   }

   private void k3t(OpaquePredicate param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 09: invokeinterface zfz.r_y ()Le0x; 1
      // 0e: invokevirtual e0x.p1r ()Lp3y;
      // 11: astore 4
      // 13: aload 4
      // 15: getstatic p3y.cei Lp3y;
      // 18: iload 3
      // 19: ifeq 32
      // 1c: if_acmpeq 35
      // 1f: goto 26
      // 22: invokestatic h7i.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 4
      // 28: getstatic p3y.hh1 Lp3y;
      // 2b: goto 32
      // 2e: invokestatic h7i.a (Loov;)Loov;
      // 31: athrow
      // 32: if_acmpne 45
      // 35: aload 0
      // 36: aload 1
      // 37: aload 2
      // 38: getstatic h7i.ni3 Lzfz;
      // 3b: invokevirtual h7i.u0f (Lt9d;Lmew;Lzfz;)V
      // 3e: goto 45
      // 41: invokestatic h7i.a (Loov;)Loov;
      // 44: athrow
      // 45: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
