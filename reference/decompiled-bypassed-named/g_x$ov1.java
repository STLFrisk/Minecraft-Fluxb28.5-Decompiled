import java.util.BitSet;

public class g_x$ov1 {
   private final float[] _qj = new float[4];
   private final int[] wfj = new int[4];

   public g_x$ov1() {
      this((g_x)null);
   }

   public g_x$ov1(g_x var1) {
   }

   public void j6m() {
      short var1 = 240;
      this.wfj[0] = this.wfj[0] | var1;
      this.wfj[1] = this.wfj[1] | var1;
      this.wfj[2] = this.wfj[2] | var1;
      this.wfj[3] = this.wfj[3] | var1;
      this._qj[0] = 1.0F;
      this._qj[1] = 1.0F;
      this._qj[2] = 1.0F;
      this._qj[3] = 1.0F;
   }

   public void bc6(m5n param1, e0x param2, mew param3, vt2 param4, float[] param5, BitSet param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 7
      // 005: aload 6
      // 007: bipush 0
      // 008: invokevirtual java/util/BitSet.get (I)Z
      // 00b: ifeq 01b
      // 00e: aload 3
      // 00f: aload 4
      // 011: invokevirtual mew.offset (Lvt2;)Lmew;
      // 014: goto 01c
      // 017: invokestatic g_x$ov1.a (Loov;)Loov;
      // 01a: athrow
      // 01b: aload 3
      // 01c: astore 8
      // 01e: aload 4
      // 020: invokestatic g_x$lo3.cnv (Lvt2;)Lg_x$lo3;
      // 023: astore 9
      // 025: aload 8
      // 027: aload 9
      // 029: getfield g_x$lo3.uy6 [Lvt2;
      // 02c: bipush 0
      // 02d: aaload
      // 02e: invokevirtual mew.offset (Lvt2;)Lmew;
      // 031: astore 10
      // 033: aload 8
      // 035: aload 9
      // 037: getfield g_x$lo3.uy6 [Lvt2;
      // 03a: bipush 1
      // 03b: aaload
      // 03c: invokevirtual mew.offset (Lvt2;)Lmew;
      // 03f: astore 11
      // 041: aload 8
      // 043: aload 9
      // 045: getfield g_x$lo3.uy6 [Lvt2;
      // 048: bipush 2
      // 049: aaload
      // 04a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 04d: astore 12
      // 04f: aload 8
      // 051: aload 9
      // 053: getfield g_x$lo3.uy6 [Lvt2;
      // 056: bipush 3
      // 057: aaload
      // 058: invokevirtual mew.offset (Lvt2;)Lmew;
      // 05b: astore 13
      // 05d: aload 2
      // 05e: aload 1
      // 05f: aload 10
      // 061: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 064: istore 14
      // 066: aload 2
      // 067: aload 1
      // 068: aload 11
      // 06a: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 06d: istore 15
      // 06f: aload 2
      // 070: aload 1
      // 071: aload 12
      // 073: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 076: istore 16
      // 078: aload 2
      // 079: aload 1
      // 07a: aload 13
      // 07c: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 07f: istore 17
      // 081: aload 1
      // 082: aload 10
      // 084: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 089: invokeinterface zfz.r_y ()Le0x; 1
      // 08e: invokevirtual e0x.fpv ()F
      // 091: invokestatic g_x.irr (F)F
      // 094: fstore 18
      // 096: aload 1
      // 097: aload 11
      // 099: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 09e: invokeinterface zfz.r_y ()Le0x; 1
      // 0a3: invokevirtual e0x.fpv ()F
      // 0a6: invokestatic g_x.irr (F)F
      // 0a9: fstore 19
      // 0ab: aload 1
      // 0ac: aload 12
      // 0ae: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0b3: invokeinterface zfz.r_y ()Le0x; 1
      // 0b8: invokevirtual e0x.fpv ()F
      // 0bb: invokestatic g_x.irr (F)F
      // 0be: fstore 20
      // 0c0: aload 1
      // 0c1: aload 13
      // 0c3: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0c8: invokeinterface zfz.r_y ()Le0x; 1
      // 0cd: invokevirtual e0x.fpv ()F
      // 0d0: invokestatic g_x.irr (F)F
      // 0d3: fstore 21
      // 0d5: aload 1
      // 0d6: aload 10
      // 0d8: aload 4
      // 0da: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0dd: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0e2: invokeinterface zfz.r_y ()Le0x; 1
      // 0e7: invokevirtual e0x.c25 ()Z
      // 0ea: istore 22
      // 0ec: aload 1
      // 0ed: aload 11
      // 0ef: aload 4
      // 0f1: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0f4: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0f9: invokeinterface zfz.r_y ()Le0x; 1
      // 0fe: invokevirtual e0x.c25 ()Z
      // 101: istore 23
      // 103: aload 1
      // 104: aload 12
      // 106: aload 4
      // 108: invokevirtual mew.offset (Lvt2;)Lmew;
      // 10b: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 110: invokeinterface zfz.r_y ()Le0x; 1
      // 115: invokevirtual e0x.c25 ()Z
      // 118: istore 24
      // 11a: aload 1
      // 11b: aload 13
      // 11d: aload 4
      // 11f: invokevirtual mew.offset (Lvt2;)Lmew;
      // 122: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 127: invokeinterface zfz.r_y ()Le0x; 1
      // 12c: invokevirtual e0x.c25 ()Z
      // 12f: istore 25
      // 131: iload 24
      // 133: iload 7
      // 135: ifne 144
      // 138: ifne 154
      // 13b: goto 142
      // 13e: invokestatic g_x$ov1.a (Loov;)Loov;
      // 141: athrow
      // 142: iload 22
      // 144: ifne 154
      // 147: fload 18
      // 149: fstore 26
      // 14b: iload 14
      // 14d: istore 27
      // 14f: iload 7
      // 151: ifeq 180
      // 154: aload 10
      // 156: aload 9
      // 158: getfield g_x$lo3.uy6 [Lvt2;
      // 15b: bipush 2
      // 15c: aaload
      // 15d: invokevirtual mew.offset (Lvt2;)Lmew;
      // 160: astore 28
      // 162: aload 1
      // 163: aload 28
      // 165: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 16a: invokeinterface zfz.r_y ()Le0x; 1
      // 16f: invokevirtual e0x.fpv ()F
      // 172: invokestatic g_x.irr (F)F
      // 175: fstore 26
      // 177: aload 2
      // 178: aload 1
      // 179: aload 28
      // 17b: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 17e: istore 27
      // 180: iload 25
      // 182: iload 7
      // 184: ifne 193
      // 187: ifne 1a3
      // 18a: goto 191
      // 18d: invokestatic g_x$ov1.a (Loov;)Loov;
      // 190: athrow
      // 191: iload 22
      // 193: ifne 1a3
      // 196: fload 18
      // 198: fstore 29
      // 19a: iload 14
      // 19c: istore 28
      // 19e: iload 7
      // 1a0: ifeq 1cf
      // 1a3: aload 10
      // 1a5: aload 9
      // 1a7: getfield g_x$lo3.uy6 [Lvt2;
      // 1aa: bipush 3
      // 1ab: aaload
      // 1ac: invokevirtual mew.offset (Lvt2;)Lmew;
      // 1af: astore 30
      // 1b1: aload 1
      // 1b2: aload 30
      // 1b4: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 1b9: invokeinterface zfz.r_y ()Le0x; 1
      // 1be: invokevirtual e0x.fpv ()F
      // 1c1: invokestatic g_x.irr (F)F
      // 1c4: fstore 29
      // 1c6: aload 2
      // 1c7: aload 1
      // 1c8: aload 30
      // 1ca: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 1cd: istore 28
      // 1cf: iload 24
      // 1d1: iload 7
      // 1d3: ifne 1e2
      // 1d6: ifne 1f2
      // 1d9: goto 1e0
      // 1dc: invokestatic g_x$ov1.a (Loov;)Loov;
      // 1df: athrow
      // 1e0: iload 23
      // 1e2: ifne 1f2
      // 1e5: fload 19
      // 1e7: fstore 31
      // 1e9: iload 15
      // 1eb: istore 30
      // 1ed: iload 7
      // 1ef: ifeq 21e
      // 1f2: aload 11
      // 1f4: aload 9
      // 1f6: getfield g_x$lo3.uy6 [Lvt2;
      // 1f9: bipush 2
      // 1fa: aaload
      // 1fb: invokevirtual mew.offset (Lvt2;)Lmew;
      // 1fe: astore 32
      // 200: aload 1
      // 201: aload 32
      // 203: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 208: invokeinterface zfz.r_y ()Le0x; 1
      // 20d: invokevirtual e0x.fpv ()F
      // 210: invokestatic g_x.irr (F)F
      // 213: fstore 31
      // 215: aload 2
      // 216: aload 1
      // 217: aload 32
      // 219: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 21c: istore 30
      // 21e: iload 25
      // 220: iload 7
      // 222: ifne 231
      // 225: ifne 241
      // 228: goto 22f
      // 22b: invokestatic g_x$ov1.a (Loov;)Loov;
      // 22e: athrow
      // 22f: iload 23
      // 231: ifne 241
      // 234: fload 19
      // 236: fstore 33
      // 238: iload 15
      // 23a: istore 32
      // 23c: iload 7
      // 23e: ifeq 26d
      // 241: aload 11
      // 243: aload 9
      // 245: getfield g_x$lo3.uy6 [Lvt2;
      // 248: bipush 3
      // 249: aaload
      // 24a: invokevirtual mew.offset (Lvt2;)Lmew;
      // 24d: astore 34
      // 24f: aload 1
      // 250: aload 34
      // 252: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 257: invokeinterface zfz.r_y ()Le0x; 1
      // 25c: invokevirtual e0x.fpv ()F
      // 25f: invokestatic g_x.irr (F)F
      // 262: fstore 33
      // 264: aload 2
      // 265: aload 1
      // 266: aload 34
      // 268: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 26b: istore 32
      // 26d: aload 2
      // 26e: aload 1
      // 26f: aload 3
      // 270: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 273: istore 34
      // 275: aload 6
      // 277: bipush 0
      // 278: invokevirtual java/util/BitSet.get (I)Z
      // 27b: iload 7
      // 27d: ifne 2c6
      // 280: ifne 2b4
      // 283: goto 28a
      // 286: invokestatic g_x$ov1.a (Loov;)Loov;
      // 289: athrow
      // 28a: aload 1
      // 28b: aload 3
      // 28c: aload 4
      // 28e: invokevirtual mew.offset (Lvt2;)Lmew;
      // 291: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 296: invokeinterface zfz.r_y ()Le0x; 1
      // 29b: invokevirtual e0x.ko5 ()Z
      // 29e: iload 7
      // 2a0: ifne 2ce
      // 2a3: goto 2aa
      // 2a6: invokestatic g_x$ov1.a (Loov;)Loov;
      // 2a9: athrow
      // 2aa: ifne 2c8
      // 2ad: goto 2b4
      // 2b0: invokestatic g_x$ov1.a (Loov;)Loov;
      // 2b3: athrow
      // 2b4: aload 2
      // 2b5: aload 1
      // 2b6: aload 3
      // 2b7: aload 4
      // 2b9: invokevirtual mew.offset (Lvt2;)Lmew;
      // 2bc: invokevirtual e0x.pil (Lm5n;Lmew;)I
      // 2bf: goto 2c6
      // 2c2: invokestatic g_x$ov1.a (Loov;)Loov;
      // 2c5: athrow
      // 2c6: istore 34
      // 2c8: aload 6
      // 2ca: bipush 0
      // 2cb: invokevirtual java/util/BitSet.get (I)Z
      // 2ce: ifeq 2e8
      // 2d1: aload 1
      // 2d2: aload 8
      // 2d4: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 2d9: invokeinterface zfz.r_y ()Le0x; 1
      // 2de: invokevirtual e0x.fpv ()F
      // 2e1: goto 2f7
      // 2e4: invokestatic g_x$ov1.a (Loov;)Loov;
      // 2e7: athrow
      // 2e8: aload 1
      // 2e9: aload 3
      // 2ea: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 2ef: invokeinterface zfz.r_y ()Le0x; 1
      // 2f4: invokevirtual e0x.fpv ()F
      // 2f7: fstore 35
      // 2f9: fload 35
      // 2fb: invokestatic g_x.irr (F)F
      // 2fe: fstore 35
      // 300: aload 4
      // 302: invokestatic g_x$qru.a6n (Lvt2;)Lg_x$qru;
      // 305: astore 36
      // 307: aload 6
      // 309: bipush 1
      // 30a: invokevirtual java/util/BitSet.get (I)Z
      // 30d: iload 7
      // 30f: ifne 328
      // 312: ifeq 680
      // 315: goto 31c
      // 318: invokestatic g_x$ov1.a (Loov;)Loov;
      // 31b: athrow
      // 31c: aload 9
      // 31e: getfield g_x$lo3.kxr Z
      // 321: goto 328
      // 324: invokestatic g_x$ov1.a (Loov;)Loov;
      // 327: athrow
      // 328: ifeq 680
      // 32b: fload 21
      // 32d: fload 18
      // 32f: fadd
      // 330: fload 29
      // 332: fadd
      // 333: fload 35
      // 335: fadd
      // 336: ldc 0.25
      // 338: nop
      // 339: fmul
      // 33a: fstore 37
      // 33c: fload 20
      // 33e: fload 18
      // 340: fadd
      // 341: fload 26
      // 343: fadd
      // 344: fload 35
      // 346: fadd
      // 347: ldc 0.25
      // 349: nop
      // 34a: fmul
      // 34b: fstore 38
      // 34d: fload 20
      // 34f: fload 19
      // 351: fadd
      // 352: fload 31
      // 354: fadd
      // 355: fload 35
      // 357: fadd
      // 358: ldc 0.25
      // 35a: nop
      // 35b: fmul
      // 35c: fstore 39
      // 35e: fload 21
      // 360: fload 19
      // 362: fadd
      // 363: fload 33
      // 365: fadd
      // 366: fload 35
      // 368: fadd
      // 369: ldc 0.25
      // 36b: nop
      // 36c: fmul
      // 36d: fstore 40
      // 36f: aload 5
      // 371: aload 9
      // 373: getfield g_x$lo3.x6f [Lg_x$pi5;
      // 376: bipush 0
      // 377: aaload
      // 378: getfield g_x$pi5.e9j I
      // 37b: faload
      // 37c: aload 5
      // 37e: aload 9
      // 380: getfield g_x$lo3.x6f [Lg_x$pi5;
      // 383: bipush 1
      // 384: aaload
      // 385: getfield g_x$pi5.e9j I
      // 388: faload
      // 389: fmul
      // 38a: fstore 41
      // 38c: aload 5
      // 38e: aload 9
      // 390: getfield g_x$lo3.x6f [Lg_x$pi5;
      // 393: bipush 2
      // 394: aaload
      // 395: getfield g_x$pi5.e9j I
      // 398: faload
      // 399: aload 5
      // 39b: aload 9
      // 39d: getfield g_x$lo3.x6f [Lg_x$pi5;
      // 3a0: bipush 3
      // 3a1: aaload
      // 3a2: getfield g_x$pi5.e9j I
      // 3a5: faload
      // 3a6: fmul
      // 3a7: fstore 42
      // 3a9: aload 5
      // 3ab: aload 9
      // 3ad: getfield g_x$lo3.x6f [Lg_x$pi5;
      // 3b0: bipush 4
      // 3b1: aaload
      // 3b2: getfield g_x$pi5.e9j I
      // 3b5: faload
      // 3b6: aload 5
      // 3b8: aload 9
      // 3ba: getfield g_x$lo3.x6f [Lg_x$pi5;
      // 3bd: bipush 5
      // 3be: aaload
      // 3bf: getfield g_x$pi5.e9j I
      // 3c2: faload
      // 3c3: fmul
      // 3c4: fstore 43
      // 3c6: aload 5
      // 3c8: aload 9
      // 3ca: getfield g_x$lo3.x6f [Lg_x$pi5;
      // 3cd: bipush 6
      // 3cf: aaload
      // 3d0: getfield g_x$pi5.e9j I
      // 3d3: faload
      // 3d4: aload 5
      // 3d6: aload 9
      // 3d8: getfield g_x$lo3.x6f [Lg_x$pi5;
      // 3db: bipush 7
      // 3dd: aaload
      // 3de: getfield g_x$pi5.e9j I
      // 3e1: faload
      // 3e2: fmul
      // 3e3: fstore 44
      // 3e5: aload 5
      // 3e7: aload 9
      // 3e9: getfield g_x$lo3.jpu [Lg_x$pi5;
      // 3ec: bipush 0
      // 3ed: aaload
      // 3ee: getfield g_x$pi5.e9j I
      // 3f1: faload
      // 3f2: aload 5
      // 3f4: aload 9
      // 3f6: getfield g_x$lo3.jpu [Lg_x$pi5;
      // 3f9: bipush 1
      // 3fa: aaload
      // 3fb: getfield g_x$pi5.e9j I
      // 3fe: faload
      // 3ff: fmul
      // 400: fstore 45
      // 402: aload 5
      // 404: aload 9
      // 406: getfield g_x$lo3.jpu [Lg_x$pi5;
      // 409: bipush 2
      // 40a: aaload
      // 40b: getfield g_x$pi5.e9j I
      // 40e: faload
      // 40f: aload 5
      // 411: aload 9
      // 413: getfield g_x$lo3.jpu [Lg_x$pi5;
      // 416: bipush 3
      // 417: aaload
      // 418: getfield g_x$pi5.e9j I
      // 41b: faload
      // 41c: fmul
      // 41d: fstore 46
      // 41f: aload 5
      // 421: aload 9
      // 423: getfield g_x$lo3.jpu [Lg_x$pi5;
      // 426: bipush 4
      // 427: aaload
      // 428: getfield g_x$pi5.e9j I
      // 42b: faload
      // 42c: aload 5
      // 42e: aload 9
      // 430: getfield g_x$lo3.jpu [Lg_x$pi5;
      // 433: bipush 5
      // 434: aaload
      // 435: getfield g_x$pi5.e9j I
      // 438: faload
      // 439: fmul
      // 43a: fstore 47
      // 43c: aload 5
      // 43e: aload 9
      // 440: getfield g_x$lo3.jpu [Lg_x$pi5;
      // 443: bipush 6
      // 445: aaload
      // 446: getfield g_x$pi5.e9j I
      // 449: faload
      // 44a: aload 5
      // 44c: aload 9
      // 44e: getfield g_x$lo3.jpu [Lg_x$pi5;
      // 451: bipush 7
      // 453: aaload
      // 454: getfield g_x$pi5.e9j I
      // 457: faload
      // 458: fmul
      // 459: fstore 48
      // 45b: aload 5
      // 45d: aload 9
      // 45f: getfield g_x$lo3.iot [Lg_x$pi5;
      // 462: bipush 0
      // 463: aaload
      // 464: getfield g_x$pi5.e9j I
      // 467: faload
      // 468: aload 5
      // 46a: aload 9
      // 46c: getfield g_x$lo3.iot [Lg_x$pi5;
      // 46f: bipush 1
      // 470: aaload
      // 471: getfield g_x$pi5.e9j I
      // 474: faload
      // 475: fmul
      // 476: fstore 49
      // 478: aload 5
      // 47a: aload 9
      // 47c: getfield g_x$lo3.iot [Lg_x$pi5;
      // 47f: bipush 2
      // 480: aaload
      // 481: getfield g_x$pi5.e9j I
      // 484: faload
      // 485: aload 5
      // 487: aload 9
      // 489: getfield g_x$lo3.iot [Lg_x$pi5;
      // 48c: bipush 3
      // 48d: aaload
      // 48e: getfield g_x$pi5.e9j I
      // 491: faload
      // 492: fmul
      // 493: fstore 50
      // 495: aload 5
      // 497: aload 9
      // 499: getfield g_x$lo3.iot [Lg_x$pi5;
      // 49c: bipush 4
      // 49d: aaload
      // 49e: getfield g_x$pi5.e9j I
      // 4a1: faload
      // 4a2: aload 5
      // 4a4: aload 9
      // 4a6: getfield g_x$lo3.iot [Lg_x$pi5;
      // 4a9: bipush 5
      // 4aa: aaload
      // 4ab: getfield g_x$pi5.e9j I
      // 4ae: faload
      // 4af: fmul
      // 4b0: fstore 51
      // 4b2: aload 5
      // 4b4: aload 9
      // 4b6: getfield g_x$lo3.iot [Lg_x$pi5;
      // 4b9: bipush 6
      // 4bb: aaload
      // 4bc: getfield g_x$pi5.e9j I
      // 4bf: faload
      // 4c0: aload 5
      // 4c2: aload 9
      // 4c4: getfield g_x$lo3.iot [Lg_x$pi5;
      // 4c7: bipush 7
      // 4c9: aaload
      // 4ca: getfield g_x$pi5.e9j I
      // 4cd: faload
      // 4ce: fmul
      // 4cf: fstore 52
      // 4d1: aload 5
      // 4d3: aload 9
      // 4d5: getfield g_x$lo3.shb [Lg_x$pi5;
      // 4d8: bipush 0
      // 4d9: aaload
      // 4da: getfield g_x$pi5.e9j I
      // 4dd: faload
      // 4de: aload 5
      // 4e0: aload 9
      // 4e2: getfield g_x$lo3.shb [Lg_x$pi5;
      // 4e5: bipush 1
      // 4e6: aaload
      // 4e7: getfield g_x$pi5.e9j I
      // 4ea: faload
      // 4eb: fmul
      // 4ec: fstore 53
      // 4ee: aload 5
      // 4f0: aload 9
      // 4f2: getfield g_x$lo3.shb [Lg_x$pi5;
      // 4f5: bipush 2
      // 4f6: aaload
      // 4f7: getfield g_x$pi5.e9j I
      // 4fa: faload
      // 4fb: aload 5
      // 4fd: aload 9
      // 4ff: getfield g_x$lo3.shb [Lg_x$pi5;
      // 502: bipush 3
      // 503: aaload
      // 504: getfield g_x$pi5.e9j I
      // 507: faload
      // 508: fmul
      // 509: fstore 54
      // 50b: aload 5
      // 50d: aload 9
      // 50f: getfield g_x$lo3.shb [Lg_x$pi5;
      // 512: bipush 4
      // 513: aaload
      // 514: getfield g_x$pi5.e9j I
      // 517: faload
      // 518: aload 5
      // 51a: aload 9
      // 51c: getfield g_x$lo3.shb [Lg_x$pi5;
      // 51f: bipush 5
      // 520: aaload
      // 521: getfield g_x$pi5.e9j I
      // 524: faload
      // 525: fmul
      // 526: fstore 55
      // 528: aload 5
      // 52a: aload 9
      // 52c: getfield g_x$lo3.shb [Lg_x$pi5;
      // 52f: bipush 6
      // 531: aaload
      // 532: getfield g_x$pi5.e9j I
      // 535: faload
      // 536: aload 5
      // 538: aload 9
      // 53a: getfield g_x$lo3.shb [Lg_x$pi5;
      // 53d: bipush 7
      // 53f: aaload
      // 540: getfield g_x$pi5.e9j I
      // 543: faload
      // 544: fmul
      // 545: fstore 56
      // 547: aload 0
      // 548: getfield g_x$ov1._qj [F
      // 54b: aload 36
      // 54d: invokestatic g_x$qru.z_i (Lg_x$qru;)I
      // 550: fload 37
      // 552: fload 41
      // 554: fmul
      // 555: fload 38
      // 557: fload 42
      // 559: fmul
      // 55a: fadd
      // 55b: fload 39
      // 55d: fload 43
      // 55f: fmul
      // 560: fadd
      // 561: fload 40
      // 563: fload 44
      // 565: fmul
      // 566: fadd
      // 567: fastore
      // 568: aload 0
      // 569: getfield g_x$ov1._qj [F
      // 56c: aload 36
      // 56e: invokestatic g_x$qru._0c (Lg_x$qru;)I
      // 571: fload 37
      // 573: fload 45
      // 575: fmul
      // 576: fload 38
      // 578: fload 46
      // 57a: fmul
      // 57b: fadd
      // 57c: fload 39
      // 57e: fload 47
      // 580: fmul
      // 581: fadd
      // 582: fload 40
      // 584: fload 48
      // 586: fmul
      // 587: fadd
      // 588: fastore
      // 589: aload 0
      // 58a: getfield g_x$ov1._qj [F
      // 58d: aload 36
      // 58f: invokestatic g_x$qru.ojw (Lg_x$qru;)I
      // 592: fload 37
      // 594: fload 49
      // 596: fmul
      // 597: fload 38
      // 599: fload 50
      // 59b: fmul
      // 59c: fadd
      // 59d: fload 39
      // 59f: fload 51
      // 5a1: fmul
      // 5a2: fadd
      // 5a3: fload 40
      // 5a5: fload 52
      // 5a7: fmul
      // 5a8: fadd
      // 5a9: fastore
      // 5aa: aload 0
      // 5ab: getfield g_x$ov1._qj [F
      // 5ae: aload 36
      // 5b0: invokestatic g_x$qru.jim (Lg_x$qru;)I
      // 5b3: fload 37
      // 5b5: fload 53
      // 5b7: fmul
      // 5b8: fload 38
      // 5ba: fload 54
      // 5bc: fmul
      // 5bd: fadd
      // 5be: fload 39
      // 5c0: fload 55
      // 5c2: fmul
      // 5c3: fadd
      // 5c4: fload 40
      // 5c6: fload 56
      // 5c8: fmul
      // 5c9: fadd
      // 5ca: fastore
      // 5cb: aload 0
      // 5cc: iload 17
      // 5ce: iload 14
      // 5d0: iload 28
      // 5d2: iload 34
      // 5d4: invokespecial g_x$ov1.k6d (IIII)I
      // 5d7: istore 57
      // 5d9: aload 0
      // 5da: iload 16
      // 5dc: iload 14
      // 5de: iload 27
      // 5e0: iload 34
      // 5e2: invokespecial g_x$ov1.k6d (IIII)I
      // 5e5: istore 58
      // 5e7: aload 0
      // 5e8: iload 16
      // 5ea: iload 15
      // 5ec: iload 30
      // 5ee: iload 34
      // 5f0: invokespecial g_x$ov1.k6d (IIII)I
      // 5f3: istore 59
      // 5f5: aload 0
      // 5f6: iload 17
      // 5f8: iload 15
      // 5fa: iload 32
      // 5fc: iload 34
      // 5fe: invokespecial g_x$ov1.k6d (IIII)I
      // 601: istore 60
      // 603: aload 0
      // 604: getfield g_x$ov1.wfj [I
      // 607: aload 36
      // 609: invokestatic g_x$qru.z_i (Lg_x$qru;)I
      // 60c: aload 0
      // 60d: iload 57
      // 60f: iload 58
      // 611: iload 59
      // 613: iload 60
      // 615: fload 41
      // 617: fload 42
      // 619: fload 43
      // 61b: fload 44
      // 61d: invokespecial g_x$ov1.llk (IIIIFFFF)I
      // 620: iastore
      // 621: aload 0
      // 622: getfield g_x$ov1.wfj [I
      // 625: aload 36
      // 627: invokestatic g_x$qru._0c (Lg_x$qru;)I
      // 62a: aload 0
      // 62b: iload 57
      // 62d: iload 58
      // 62f: iload 59
      // 631: iload 60
      // 633: fload 45
      // 635: fload 46
      // 637: fload 47
      // 639: fload 48
      // 63b: invokespecial g_x$ov1.llk (IIIIFFFF)I
      // 63e: iastore
      // 63f: aload 0
      // 640: getfield g_x$ov1.wfj [I
      // 643: aload 36
      // 645: invokestatic g_x$qru.ojw (Lg_x$qru;)I
      // 648: aload 0
      // 649: iload 57
      // 64b: iload 58
      // 64d: iload 59
      // 64f: iload 60
      // 651: fload 49
      // 653: fload 50
      // 655: fload 51
      // 657: fload 52
      // 659: invokespecial g_x$ov1.llk (IIIIFFFF)I
      // 65c: iastore
      // 65d: aload 0
      // 65e: getfield g_x$ov1.wfj [I
      // 661: aload 36
      // 663: invokestatic g_x$qru.jim (Lg_x$qru;)I
      // 666: aload 0
      // 667: iload 57
      // 669: iload 58
      // 66b: iload 59
      // 66d: iload 60
      // 66f: fload 53
      // 671: fload 54
      // 673: fload 55
      // 675: fload 56
      // 677: invokespecial g_x$ov1.llk (IIIIFFFF)I
      // 67a: iastore
      // 67b: iload 7
      // 67d: ifeq 74c
      // 680: fload 21
      // 682: fload 18
      // 684: fadd
      // 685: fload 29
      // 687: fadd
      // 688: fload 35
      // 68a: fadd
      // 68b: ldc 0.25
      // 68d: nop
      // 68e: fmul
      // 68f: fstore 37
      // 691: fload 20
      // 693: fload 18
      // 695: fadd
      // 696: fload 26
      // 698: fadd
      // 699: fload 35
      // 69b: fadd
      // 69c: ldc 0.25
      // 69e: nop
      // 69f: fmul
      // 6a0: fstore 38
      // 6a2: fload 20
      // 6a4: fload 19
      // 6a6: fadd
      // 6a7: fload 31
      // 6a9: fadd
      // 6aa: fload 35
      // 6ac: fadd
      // 6ad: ldc 0.25
      // 6af: nop
      // 6b0: fmul
      // 6b1: fstore 39
      // 6b3: fload 21
      // 6b5: fload 19
      // 6b7: fadd
      // 6b8: fload 33
      // 6ba: fadd
      // 6bb: fload 35
      // 6bd: fadd
      // 6be: ldc 0.25
      // 6c0: nop
      // 6c1: fmul
      // 6c2: fstore 40
      // 6c4: aload 0
      // 6c5: getfield g_x$ov1.wfj [I
      // 6c8: aload 36
      // 6ca: invokestatic g_x$qru.z_i (Lg_x$qru;)I
      // 6cd: aload 0
      // 6ce: iload 17
      // 6d0: iload 14
      // 6d2: iload 28
      // 6d4: iload 34
      // 6d6: invokespecial g_x$ov1.k6d (IIII)I
      // 6d9: iastore
      // 6da: aload 0
      // 6db: getfield g_x$ov1.wfj [I
      // 6de: aload 36
      // 6e0: invokestatic g_x$qru._0c (Lg_x$qru;)I
      // 6e3: aload 0
      // 6e4: iload 16
      // 6e6: iload 14
      // 6e8: iload 27
      // 6ea: iload 34
      // 6ec: invokespecial g_x$ov1.k6d (IIII)I
      // 6ef: iastore
      // 6f0: aload 0
      // 6f1: getfield g_x$ov1.wfj [I
      // 6f4: aload 36
      // 6f6: invokestatic g_x$qru.ojw (Lg_x$qru;)I
      // 6f9: aload 0
      // 6fa: iload 16
      // 6fc: iload 15
      // 6fe: iload 30
      // 700: iload 34
      // 702: invokespecial g_x$ov1.k6d (IIII)I
      // 705: iastore
      // 706: aload 0
      // 707: getfield g_x$ov1.wfj [I
      // 70a: aload 36
      // 70c: invokestatic g_x$qru.jim (Lg_x$qru;)I
      // 70f: aload 0
      // 710: iload 17
      // 712: iload 15
      // 714: iload 32
      // 716: iload 34
      // 718: invokespecial g_x$ov1.k6d (IIII)I
      // 71b: iastore
      // 71c: aload 0
      // 71d: getfield g_x$ov1._qj [F
      // 720: aload 36
      // 722: invokestatic g_x$qru.z_i (Lg_x$qru;)I
      // 725: fload 37
      // 727: fastore
      // 728: aload 0
      // 729: getfield g_x$ov1._qj [F
      // 72c: aload 36
      // 72e: invokestatic g_x$qru._0c (Lg_x$qru;)I
      // 731: fload 38
      // 733: fastore
      // 734: aload 0
      // 735: getfield g_x$ov1._qj [F
      // 738: aload 36
      // 73a: invokestatic g_x$qru.ojw (Lg_x$qru;)I
      // 73d: fload 39
      // 73f: fastore
      // 740: aload 0
      // 741: getfield g_x$ov1._qj [F
      // 744: aload 36
      // 746: invokestatic g_x$qru.jim (Lg_x$qru;)I
      // 749: fload 40
      // 74b: fastore
      // 74c: return
   }

   private int k6d(int var1, int var2, int var3, int var4) {
      int var5 = OpaquePredicate.b();

      int var10000;
      label53: {
         label52: {
            try {
               var10000 = var1;
               if (var5 == 0) {
                  break label53;
               }

               if (var1 != 0) {
                  break label52;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            var1 = var4;
         }

         var10000 = var2;
      }

      label44: {
         label43: {
            try {
               if (var5 == 0) {
                  break label44;
               }

               if (var10000 != 0) {
                  break label43;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var2 = var4;
         }

         var10000 = var3;
      }

      try {
         if (var5 == 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return var1 + var2 + var3 + var4 >> 2 & 16711935;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return var1 + var2 + var4 + var4 >> 2 & 16711935;
   }

   private int llk(int var1, int var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      int var9 = (int)(
            (float)(var1 >> 16 & 0xFF) * var5 + (float)(var2 >> 16 & 0xFF) * var6 + (float)(var3 >> 16 & 0xFF) * var7 + (float)(var4 >> 16 & 0xFF) * var8
         )
         & 0xFF;
      int var10 = (int)((float)(var1 & 0xFF) * var5 + (float)(var2 & 0xFF) * var6 + (float)(var3 & 0xFF) * var7 + (float)(var4 & 0xFF) * var8) & 0xFF;
      return var9 << 16 | var10;
   }

   public static int[] l46(g_x$ov1 var0) {
      return var0.wfj;
   }

   public static float[] n8x(g_x$ov1 var0) {
      return var0._qj;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
