import java.util.Random;

public class ts2 extends cdu {
   private e0x u68;

   public ts2(e0x var1) {
      super(true);
      this.u68 = var1;
   }

   public ts2() {
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 4
      // 005: aload 0
      // 006: iload 4
      // 008: ifeq 020
      // 00b: getfield ts2.u68 Le0x;
      // 00e: ifnonnull 037
      // 011: goto 018
      // 014: invokestatic ts2.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: goto 020
      // 01c: invokestatic ts2.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 2
      // 021: invokevirtual java/util/Random.nextBoolean ()Z
      // 024: ifeq 031
      // 027: getstatic ox_.s82 Le0x;
      // 02a: goto 034
      // 02d: invokestatic ts2.a (Loov;)Loov;
      // 030: athrow
      // 031: getstatic ox_.cph Le0x;
      // 034: putfield ts2.u68 Le0x;
      // 037: aload 2
      // 038: bipush 3
      // 039: invokevirtual java/util/Random.nextInt (I)I
      // 03c: bipush 4
      // 03d: iadd
      // 03e: istore 5
      // 040: bipush 1
      // 041: istore 6
      // 043: aload 3
      // 044: invokevirtual mew.getY ()I
      // 047: iload 4
      // 049: ifeq 6be
      // 04c: bipush 1
      // 04d: if_icmplt 6bd
      // 050: goto 057
      // 053: invokestatic ts2.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 3
      // 058: invokevirtual mew.getY ()I
      // 05b: iload 5
      // 05d: iadd
      // 05e: bipush 1
      // 05f: iadd
      // 060: iload 4
      // 062: ifeq 6be
      // 065: goto 06c
      // 068: invokestatic ts2.a (Loov;)Loov;
      // 06b: athrow
      // 06c: sipush 256
      // 06f: if_icmpge 6bd
      // 072: goto 079
      // 075: invokestatic ts2.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 3
      // 07a: invokevirtual mew.getY ()I
      // 07d: istore 7
      // 07f: iload 7
      // 081: aload 3
      // 082: invokevirtual mew.getY ()I
      // 085: bipush 1
      // 086: iadd
      // 087: iload 5
      // 089: iadd
      // 08a: if_icmpgt 1b8
      // 08d: bipush 3
      // 08e: istore 8
      // 090: iload 7
      // 092: iload 4
      // 094: ifeq 1ba
      // 097: iload 4
      // 099: ifeq 0bb
      // 09c: goto 0a3
      // 09f: invokestatic ts2.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: aload 3
      // 0a4: invokevirtual mew.getY ()I
      // 0a7: bipush 3
      // 0a8: iadd
      // 0a9: if_icmpgt 0bd
      // 0ac: goto 0b3
      // 0af: invokestatic ts2.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: bipush 0
      // 0b4: goto 0bb
      // 0b7: invokestatic ts2.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: istore 8
      // 0bd: new mew$mix
      // 0c0: dup
      // 0c1: invokespecial mew$mix.<init> ()V
      // 0c4: astore 9
      // 0c6: aload 3
      // 0c7: invokevirtual mew.getX ()I
      // 0ca: iload 8
      // 0cc: isub
      // 0cd: istore 10
      // 0cf: iload 10
      // 0d1: aload 3
      // 0d2: invokevirtual mew.getX ()I
      // 0d5: iload 8
      // 0d7: iadd
      // 0d8: if_icmpgt 1b0
      // 0db: iload 6
      // 0dd: iload 4
      // 0df: ifeq 081
      // 0e2: iload 4
      // 0e4: ifeq 0ff
      // 0e7: ifeq 1b0
      // 0ea: goto 0f1
      // 0ed: invokestatic ts2.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 3
      // 0f2: invokevirtual mew.getZ ()I
      // 0f5: iload 8
      // 0f7: isub
      // 0f8: goto 0ff
      // 0fb: invokestatic ts2.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: istore 11
      // 101: iload 11
      // 103: aload 3
      // 104: invokevirtual mew.getZ ()I
      // 107: iload 8
      // 109: iadd
      // 10a: if_icmpgt 1a8
      // 10d: iload 6
      // 10f: iload 4
      // 111: ifeq 0d1
      // 114: iload 4
      // 116: ifeq 125
      // 119: ifeq 1a8
      // 11c: goto 123
      // 11f: invokestatic ts2.a (Loov;)Loov;
      // 122: athrow
      // 123: iload 7
      // 125: iload 4
      // 127: ifeq 19e
      // 12a: iflt 196
      // 12d: goto 134
      // 130: invokestatic ts2.a (Loov;)Loov;
      // 133: athrow
      // 134: iload 7
      // 136: iload 4
      // 138: ifeq 19e
      // 13b: goto 142
      // 13e: invokestatic ts2.a (Loov;)Loov;
      // 141: athrow
      // 142: sipush 256
      // 145: if_icmpge 196
      // 148: goto 14f
      // 14b: invokestatic ts2.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 1
      // 150: aload 9
      // 152: iload 10
      // 154: iload 7
      // 156: iload 11
      // 158: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 15b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 15e: invokeinterface zfz.r_y ()Le0x; 1
      // 163: astore 12
      // 165: aload 12
      // 167: invokevirtual e0x.p1r ()Lp3y;
      // 16a: getstatic p3y.cei Lp3y;
      // 16d: iload 4
      // 16f: ifeq 18b
      // 172: if_acmpeq 191
      // 175: goto 17c
      // 178: invokestatic ts2.a (Loov;)Loov;
      // 17b: athrow
      // 17c: aload 12
      // 17e: invokevirtual e0x.p1r ()Lp3y;
      // 181: getstatic p3y.hh1 Lp3y;
      // 184: goto 18b
      // 187: invokestatic ts2.a (Loov;)Loov;
      // 18a: athrow
      // 18b: if_acmpeq 191
      // 18e: bipush 0
      // 18f: istore 6
      // 191: iload 4
      // 193: ifne 1a0
      // 196: bipush 0
      // 197: goto 19e
      // 19a: invokestatic ts2.a (Loov;)Loov;
      // 19d: athrow
      // 19e: istore 6
      // 1a0: iinc 11 1
      // 1a3: iload 4
      // 1a5: ifne 101
      // 1a8: iinc 10 1
      // 1ab: iload 4
      // 1ad: ifne 0cf
      // 1b0: iinc 7 1
      // 1b3: iload 4
      // 1b5: ifne 07f
      // 1b8: iload 6
      // 1ba: iload 4
      // 1bc: ifeq 1ca
      // 1bf: ifne 1cb
      // 1c2: goto 1c9
      // 1c5: invokestatic ts2.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: bipush 0
      // 1ca: ireturn
      // 1cb: aload 1
      // 1cc: aload 3
      // 1cd: invokevirtual mew.eve ()Lmew;
      // 1d0: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1d3: invokeinterface zfz.r_y ()Le0x; 1
      // 1d8: astore 7
      // 1da: aload 7
      // 1dc: iload 4
      // 1de: ifeq 1f7
      // 1e1: getstatic ox_.kqk Le0x;
      // 1e4: if_acmpeq 21e
      // 1e7: goto 1ee
      // 1ea: invokestatic ts2.a (Loov;)Loov;
      // 1ed: athrow
      // 1ee: aload 7
      // 1f0: goto 1f7
      // 1f3: invokestatic ts2.a (Loov;)Loov;
      // 1f6: athrow
      // 1f7: iload 4
      // 1f9: ifeq 212
      // 1fc: getstatic ox_.l11 Lx82;
      // 1ff: if_acmpeq 21e
      // 202: goto 209
      // 205: invokestatic ts2.a (Loov;)Loov;
      // 208: athrow
      // 209: aload 7
      // 20b: goto 212
      // 20e: invokestatic ts2.a (Loov;)Loov;
      // 211: athrow
      // 212: getstatic ox_.pl8 Lp48;
      // 215: if_acmpeq 21e
      // 218: bipush 0
      // 219: ireturn
      // 21a: invokestatic ts2.a (Loov;)Loov;
      // 21d: athrow
      // 21e: aload 3
      // 21f: invokevirtual mew.getY ()I
      // 222: iload 5
      // 224: iadd
      // 225: istore 8
      // 227: aload 0
      // 228: getfield ts2.u68 Le0x;
      // 22b: getstatic ox_.cph Le0x;
      // 22e: if_acmpne 23c
      // 231: aload 3
      // 232: invokevirtual mew.getY ()I
      // 235: iload 5
      // 237: iadd
      // 238: bipush 3
      // 239: isub
      // 23a: istore 8
      // 23c: iload 8
      // 23e: istore 9
      // 240: iload 9
      // 242: aload 3
      // 243: invokevirtual mew.getY ()I
      // 246: iload 5
      // 248: iadd
      // 249: if_icmpgt 654
      // 24c: bipush 1
      // 24d: istore 10
      // 24f: iload 9
      // 251: aload 3
      // 252: invokevirtual mew.getY ()I
      // 255: iload 5
      // 257: iadd
      // 258: iload 4
      // 25a: ifeq 65b
      // 25d: if_icmpge 26a
      // 260: goto 267
      // 263: invokestatic ts2.a (Loov;)Loov;
      // 266: athrow
      // 267: iinc 10 1
      // 26a: aload 0
      // 26b: getfield ts2.u68 Le0x;
      // 26e: getstatic ox_.s82 Le0x;
      // 271: if_acmpne 277
      // 274: bipush 3
      // 275: istore 10
      // 277: aload 3
      // 278: invokevirtual mew.getX ()I
      // 27b: iload 10
      // 27d: isub
      // 27e: istore 11
      // 280: aload 3
      // 281: invokevirtual mew.getX ()I
      // 284: iload 10
      // 286: iadd
      // 287: istore 12
      // 289: aload 3
      // 28a: invokevirtual mew.getZ ()I
      // 28d: iload 10
      // 28f: isub
      // 290: istore 13
      // 292: aload 3
      // 293: invokevirtual mew.getZ ()I
      // 296: iload 10
      // 298: iadd
      // 299: istore 14
      // 29b: iload 11
      // 29d: istore 15
      // 29f: iload 15
      // 2a1: iload 12
      // 2a3: if_icmpgt 64c
      // 2a6: iload 13
      // 2a8: iload 4
      // 2aa: ifeq 242
      // 2ad: istore 16
      // 2af: iload 16
      // 2b1: iload 14
      // 2b3: if_icmpgt 644
      // 2b6: bipush 5
      // 2b7: istore 17
      // 2b9: iload 15
      // 2bb: iload 11
      // 2bd: iload 4
      // 2bf: ifeq 2a3
      // 2c2: iload 4
      // 2c4: ifeq 2eb
      // 2c7: if_icmpne 2e0
      // 2ca: goto 2d1
      // 2cd: invokestatic ts2.a (Loov;)Loov;
      // 2d0: athrow
      // 2d1: iinc 17 -1
      // 2d4: iload 4
      // 2d6: ifne 2fd
      // 2d9: goto 2e0
      // 2dc: invokestatic ts2.a (Loov;)Loov;
      // 2df: athrow
      // 2e0: iload 15
      // 2e2: iload 12
      // 2e4: goto 2eb
      // 2e7: invokestatic ts2.a (Loov;)Loov;
      // 2ea: athrow
      // 2eb: iload 4
      // 2ed: ifeq 301
      // 2f0: if_icmpne 2fd
      // 2f3: goto 2fa
      // 2f6: invokestatic ts2.a (Loov;)Loov;
      // 2f9: athrow
      // 2fa: iinc 17 1
      // 2fd: iload 16
      // 2ff: iload 13
      // 301: iload 4
      // 303: ifeq 336
      // 306: if_icmpne 31f
      // 309: goto 310
      // 30c: invokestatic ts2.a (Loov;)Loov;
      // 30f: athrow
      // 310: iinc 17 -3
      // 313: iload 4
      // 315: ifne 33c
      // 318: goto 31f
      // 31b: invokestatic ts2.a (Loov;)Loov;
      // 31e: athrow
      // 31f: iload 16
      // 321: iload 4
      // 323: ifeq 33e
      // 326: goto 32d
      // 329: invokestatic ts2.a (Loov;)Loov;
      // 32c: athrow
      // 32d: iload 14
      // 32f: goto 336
      // 332: invokestatic ts2.a (Loov;)Loov;
      // 335: athrow
      // 336: if_icmpne 33c
      // 339: iinc 17 3
      // 33c: iload 17
      // 33e: invokestatic jx6$t6o.ycn (I)Ljx6$t6o;
      // 341: astore 18
      // 343: aload 0
      // 344: getfield ts2.u68 Le0x;
      // 347: getstatic ox_.s82 Le0x;
      // 34a: if_acmpeq 36c
      // 34d: iload 9
      // 34f: aload 3
      // 350: invokevirtual mew.getY ()I
      // 353: iload 5
      // 355: iadd
      // 356: iload 4
      // 358: ifeq 377
      // 35b: goto 362
      // 35e: invokestatic ts2.a (Loov;)Loov;
      // 361: athrow
      // 362: if_icmpge 593
      // 365: goto 36c
      // 368: invokestatic ts2.a (Loov;)Loov;
      // 36b: athrow
      // 36c: iload 15
      // 36e: iload 11
      // 370: goto 377
      // 373: invokestatic ts2.a (Loov;)Loov;
      // 376: athrow
      // 377: iload 4
      // 379: ifeq 3ab
      // 37c: if_icmpeq 3a0
      // 37f: goto 386
      // 382: invokestatic ts2.a (Loov;)Loov;
      // 385: athrow
      // 386: iload 15
      // 388: iload 12
      // 38a: iload 4
      // 38c: ifeq 3e2
      // 38f: goto 396
      // 392: invokestatic ts2.a (Loov;)Loov;
      // 395: athrow
      // 396: if_icmpne 3d7
      // 399: goto 3a0
      // 39c: invokestatic ts2.a (Loov;)Loov;
      // 39f: athrow
      // 3a0: iload 16
      // 3a2: iload 13
      // 3a4: goto 3ab
      // 3a7: invokestatic ts2.a (Loov;)Loov;
      // 3aa: athrow
      // 3ab: iload 4
      // 3ad: ifeq 3c5
      // 3b0: if_icmpeq 63c
      // 3b3: goto 3ba
      // 3b6: invokestatic ts2.a (Loov;)Loov;
      // 3b9: athrow
      // 3ba: iload 16
      // 3bc: iload 14
      // 3be: goto 3c5
      // 3c1: invokestatic ts2.a (Loov;)Loov;
      // 3c4: athrow
      // 3c5: iload 4
      // 3c7: ifeq 3e2
      // 3ca: if_icmpne 3d7
      // 3cd: goto 3d4
      // 3d0: invokestatic ts2.a (Loov;)Loov;
      // 3d3: athrow
      // 3d4: goto 63c
      // 3d7: iload 15
      // 3d9: aload 3
      // 3da: invokevirtual mew.getX ()I
      // 3dd: iload 10
      // 3df: bipush 1
      // 3e0: isub
      // 3e1: isub
      // 3e2: iload 4
      // 3e4: ifeq 414
      // 3e7: if_icmpne 410
      // 3ea: goto 3f1
      // 3ed: invokestatic ts2.a (Loov;)Loov;
      // 3f0: athrow
      // 3f1: iload 16
      // 3f3: iload 13
      // 3f5: iload 4
      // 3f7: ifeq 414
      // 3fa: goto 401
      // 3fd: invokestatic ts2.a (Loov;)Loov;
      // 400: athrow
      // 401: if_icmpne 410
      // 404: goto 40b
      // 407: invokestatic ts2.a (Loov;)Loov;
      // 40a: athrow
      // 40b: getstatic jx6$t6o.u3y Ljx6$t6o;
      // 40e: astore 18
      // 410: iload 15
      // 412: iload 11
      // 414: iload 4
      // 416: ifeq 454
      // 419: if_icmpne 449
      // 41c: goto 423
      // 41f: invokestatic ts2.a (Loov;)Loov;
      // 422: athrow
      // 423: iload 16
      // 425: aload 3
      // 426: invokevirtual mew.getZ ()I
      // 429: iload 10
      // 42b: bipush 1
      // 42c: isub
      // 42d: isub
      // 42e: iload 4
      // 430: ifeq 454
      // 433: goto 43a
      // 436: invokestatic ts2.a (Loov;)Loov;
      // 439: athrow
      // 43a: if_icmpne 449
      // 43d: goto 444
      // 440: invokestatic ts2.a (Loov;)Loov;
      // 443: athrow
      // 444: getstatic jx6$t6o.u3y Ljx6$t6o;
      // 447: astore 18
      // 449: iload 15
      // 44b: aload 3
      // 44c: invokevirtual mew.getX ()I
      // 44f: iload 10
      // 451: bipush 1
      // 452: isub
      // 453: iadd
      // 454: iload 4
      // 456: ifeq 486
      // 459: if_icmpne 482
      // 45c: goto 463
      // 45f: invokestatic ts2.a (Loov;)Loov;
      // 462: athrow
      // 463: iload 16
      // 465: iload 13
      // 467: iload 4
      // 469: ifeq 486
      // 46c: goto 473
      // 46f: invokestatic ts2.a (Loov;)Loov;
      // 472: athrow
      // 473: if_icmpne 482
      // 476: goto 47d
      // 479: invokestatic ts2.a (Loov;)Loov;
      // 47c: athrow
      // 47d: getstatic jx6$t6o.hoh Ljx6$t6o;
      // 480: astore 18
      // 482: iload 15
      // 484: iload 12
      // 486: iload 4
      // 488: ifeq 4c6
      // 48b: if_icmpne 4bb
      // 48e: goto 495
      // 491: invokestatic ts2.a (Loov;)Loov;
      // 494: athrow
      // 495: iload 16
      // 497: aload 3
      // 498: invokevirtual mew.getZ ()I
      // 49b: iload 10
      // 49d: bipush 1
      // 49e: isub
      // 49f: isub
      // 4a0: iload 4
      // 4a2: ifeq 4c6
      // 4a5: goto 4ac
      // 4a8: invokestatic ts2.a (Loov;)Loov;
      // 4ab: athrow
      // 4ac: if_icmpne 4bb
      // 4af: goto 4b6
      // 4b2: invokestatic ts2.a (Loov;)Loov;
      // 4b5: athrow
      // 4b6: getstatic jx6$t6o.hoh Ljx6$t6o;
      // 4b9: astore 18
      // 4bb: iload 15
      // 4bd: aload 3
      // 4be: invokevirtual mew.getX ()I
      // 4c1: iload 10
      // 4c3: bipush 1
      // 4c4: isub
      // 4c5: isub
      // 4c6: iload 4
      // 4c8: ifeq 4f8
      // 4cb: if_icmpne 4f4
      // 4ce: goto 4d5
      // 4d1: invokestatic ts2.a (Loov;)Loov;
      // 4d4: athrow
      // 4d5: iload 16
      // 4d7: iload 14
      // 4d9: iload 4
      // 4db: ifeq 4f8
      // 4de: goto 4e5
      // 4e1: invokestatic ts2.a (Loov;)Loov;
      // 4e4: athrow
      // 4e5: if_icmpne 4f4
      // 4e8: goto 4ef
      // 4eb: invokestatic ts2.a (Loov;)Loov;
      // 4ee: athrow
      // 4ef: getstatic jx6$t6o.lib Ljx6$t6o;
      // 4f2: astore 18
      // 4f4: iload 15
      // 4f6: iload 11
      // 4f8: iload 4
      // 4fa: ifeq 538
      // 4fd: if_icmpne 52d
      // 500: goto 507
      // 503: invokestatic ts2.a (Loov;)Loov;
      // 506: athrow
      // 507: iload 16
      // 509: aload 3
      // 50a: invokevirtual mew.getZ ()I
      // 50d: iload 10
      // 50f: bipush 1
      // 510: isub
      // 511: iadd
      // 512: iload 4
      // 514: ifeq 538
      // 517: goto 51e
      // 51a: invokestatic ts2.a (Loov;)Loov;
      // 51d: athrow
      // 51e: if_icmpne 52d
      // 521: goto 528
      // 524: invokestatic ts2.a (Loov;)Loov;
      // 527: athrow
      // 528: getstatic jx6$t6o.lib Ljx6$t6o;
      // 52b: astore 18
      // 52d: iload 15
      // 52f: aload 3
      // 530: invokevirtual mew.getX ()I
      // 533: iload 10
      // 535: bipush 1
      // 536: isub
      // 537: iadd
      // 538: iload 4
      // 53a: ifeq 56a
      // 53d: if_icmpne 566
      // 540: goto 547
      // 543: invokestatic ts2.a (Loov;)Loov;
      // 546: athrow
      // 547: iload 16
      // 549: iload 14
      // 54b: iload 4
      // 54d: ifeq 56a
      // 550: goto 557
      // 553: invokestatic ts2.a (Loov;)Loov;
      // 556: athrow
      // 557: if_icmpne 566
      // 55a: goto 561
      // 55d: invokestatic ts2.a (Loov;)Loov;
      // 560: athrow
      // 561: getstatic jx6$t6o.wia Ljx6$t6o;
      // 564: astore 18
      // 566: iload 15
      // 568: iload 12
      // 56a: iload 4
      // 56c: ifeq 58b
      // 56f: if_icmpne 593
      // 572: goto 579
      // 575: invokestatic ts2.a (Loov;)Loov;
      // 578: athrow
      // 579: iload 16
      // 57b: aload 3
      // 57c: invokevirtual mew.getZ ()I
      // 57f: iload 10
      // 581: bipush 1
      // 582: isub
      // 583: iadd
      // 584: goto 58b
      // 587: invokestatic ts2.a (Loov;)Loov;
      // 58a: athrow
      // 58b: if_icmpne 593
      // 58e: getstatic jx6$t6o.wia Ljx6$t6o;
      // 591: astore 18
      // 593: aload 18
      // 595: getstatic jx6$t6o.f86 Ljx6$t6o;
      // 598: if_acmpne 5bf
      // 59b: iload 9
      // 59d: aload 3
      // 59e: invokevirtual mew.getY ()I
      // 5a1: iload 5
      // 5a3: iadd
      // 5a4: iload 4
      // 5a6: ifeq 5d8
      // 5a9: goto 5b0
      // 5ac: invokestatic ts2.a (Loov;)Loov;
      // 5af: athrow
      // 5b0: if_icmpge 5bf
      // 5b3: goto 5ba
      // 5b6: invokestatic ts2.a (Loov;)Loov;
      // 5b9: athrow
      // 5ba: getstatic jx6$t6o.vo8 Ljx6$t6o;
      // 5bd: astore 18
      // 5bf: aload 3
      // 5c0: iload 4
      // 5c2: ifeq 5fe
      // 5c5: invokevirtual mew.getY ()I
      // 5c8: aload 3
      // 5c9: invokevirtual mew.getY ()I
      // 5cc: iload 5
      // 5ce: iadd
      // 5cf: bipush 1
      // 5d0: isub
      // 5d1: goto 5d8
      // 5d4: invokestatic ts2.a (Loov;)Loov;
      // 5d7: athrow
      // 5d8: if_icmpge 5ea
      // 5db: aload 18
      // 5dd: getstatic jx6$t6o.vo8 Ljx6$t6o;
      // 5e0: if_acmpeq 63c
      // 5e3: goto 5ea
      // 5e6: invokestatic ts2.a (Loov;)Loov;
      // 5e9: athrow
      // 5ea: new mew
      // 5ed: dup
      // 5ee: iload 15
      // 5f0: iload 9
      // 5f2: iload 16
      // 5f4: invokespecial mew.<init> (III)V
      // 5f7: goto 5fe
      // 5fa: invokestatic ts2.a (Loov;)Loov;
      // 5fd: athrow
      // 5fe: astore 19
      // 600: iload 4
      // 602: ifeq 63f
      // 605: aload 1
      // 606: aload 19
      // 608: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 60b: invokeinterface zfz.r_y ()Le0x; 1
      // 610: invokevirtual e0x.z4c ()Z
      // 613: ifne 63c
      // 616: goto 61d
      // 619: invokestatic ts2.a (Loov;)Loov;
      // 61c: athrow
      // 61d: aload 0
      // 61e: aload 1
      // 61f: aload 19
      // 621: aload 0
      // 622: getfield ts2.u68 Le0x;
      // 625: invokevirtual e0x.l4i ()Lzfz;
      // 628: getstatic jx6.w29 Lzb_;
      // 62b: aload 18
      // 62d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 632: invokevirtual ts2.u0f (Lt9d;Lmew;Lzfz;)V
      // 635: goto 63c
      // 638: invokestatic ts2.a (Loov;)Loov;
      // 63b: athrow
      // 63c: iinc 16 1
      // 63f: iload 4
      // 641: ifne 2af
      // 644: iinc 15 1
      // 647: iload 4
      // 649: ifne 29f
      // 64c: iinc 9 1
      // 64f: iload 4
      // 651: ifne 240
      // 654: bipush 0
      // 655: istore 9
      // 657: iload 9
      // 659: iload 5
      // 65b: if_icmpge 6bb
      // 65e: aload 1
      // 65f: aload 3
      // 660: iload 9
      // 662: invokevirtual mew.z89 (I)Lmew;
      // 665: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 668: invokeinterface zfz.r_y ()Le0x; 1
      // 66d: astore 10
      // 66f: iload 4
      // 671: ifeq 6b6
      // 674: aload 10
      // 676: invokevirtual e0x.z4c ()Z
      // 679: iload 4
      // 67b: ifeq 6bc
      // 67e: goto 685
      // 681: invokestatic ts2.a (Loov;)Loov;
      // 684: athrow
      // 685: ifne 6b3
      // 688: goto 68f
      // 68b: invokestatic ts2.a (Loov;)Loov;
      // 68e: athrow
      // 68f: aload 0
      // 690: aload 1
      // 691: aload 3
      // 692: iload 9
      // 694: invokevirtual mew.z89 (I)Lmew;
      // 697: aload 0
      // 698: getfield ts2.u68 Le0x;
      // 69b: invokevirtual e0x.l4i ()Lzfz;
      // 69e: getstatic jx6.w29 Lzb_;
      // 6a1: getstatic jx6$t6o.sm7 Ljx6$t6o;
      // 6a4: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6a9: invokevirtual ts2.u0f (Lt9d;Lmew;Lzfz;)V
      // 6ac: goto 6b3
      // 6af: invokestatic ts2.a (Loov;)Loov;
      // 6b2: athrow
      // 6b3: iinc 9 1
      // 6b6: iload 4
      // 6b8: ifne 657
      // 6bb: bipush 1
      // 6bc: ireturn
      // 6bd: bipush 0
      // 6be: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
