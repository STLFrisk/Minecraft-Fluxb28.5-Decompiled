import java.util.Random;

public class vg1 extends cdu {
   @Override
   public boolean v3g(OpaquePredicate param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 1
      // 006: aload 3
      // 007: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 00a: ifeq 03e
      // 00d: aload 3
      // 00e: iload 4
      // 010: ifeq 038
      // 013: invokevirtual mew.getY ()I
      // 016: bipush 2
      // 017: iload 4
      // 019: ifeq 065
      // 01c: goto 023
      // 01f: invokestatic vg1.a (Loov;)Loov;
      // 022: athrow
      // 023: if_icmple 03e
      // 026: goto 02d
      // 029: invokestatic vg1.a (Loov;)Loov;
      // 02c: athrow
      // 02d: aload 3
      // 02e: invokevirtual mew.eve ()Lmew;
      // 031: goto 038
      // 034: invokestatic vg1.a (Loov;)Loov;
      // 037: athrow
      // 038: astore 3
      // 039: iload 4
      // 03b: ifne 005
      // 03e: aload 1
      // 03f: aload 3
      // 040: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 043: invokeinterface zfz.r_y ()Le0x; 1
      // 048: getstatic ox_._mc Le0x;
      // 04b: if_acmpeq 054
      // 04e: bipush 0
      // 04f: ireturn
      // 050: invokestatic vg1.a (Loov;)Loov;
      // 053: athrow
      // 054: aload 3
      // 055: aload 2
      // 056: bipush 4
      // 057: invokevirtual java/util/Random.nextInt (I)I
      // 05a: invokevirtual mew.z89 (I)Lmew;
      // 05d: astore 3
      // 05e: aload 2
      // 05f: bipush 4
      // 060: invokevirtual java/util/Random.nextInt (I)I
      // 063: bipush 7
      // 065: iadd
      // 066: istore 5
      // 068: iload 5
      // 06a: bipush 4
      // 06b: idiv
      // 06c: aload 2
      // 06d: bipush 2
      // 06e: invokevirtual java/util/Random.nextInt (I)I
      // 071: iadd
      // 072: istore 6
      // 074: iload 6
      // 076: iload 4
      // 078: ifeq 0b1
      // 07b: bipush 1
      // 07c: if_icmple 0b0
      // 07f: goto 086
      // 082: invokestatic vg1.a (Loov;)Loov;
      // 085: athrow
      // 086: aload 2
      // 087: bipush 60
      // 089: invokevirtual java/util/Random.nextInt (I)I
      // 08c: iload 4
      // 08e: ifeq 0b1
      // 091: goto 098
      // 094: invokestatic vg1.a (Loov;)Loov;
      // 097: athrow
      // 098: ifne 0b0
      // 09b: goto 0a2
      // 09e: invokestatic vg1.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: aload 3
      // 0a3: bipush 10
      // 0a5: aload 2
      // 0a6: bipush 30
      // 0a8: invokevirtual java/util/Random.nextInt (I)I
      // 0ab: iadd
      // 0ac: invokevirtual mew.z89 (I)Lmew;
      // 0af: astore 3
      // 0b0: bipush 0
      // 0b1: istore 7
      // 0b3: iload 7
      // 0b5: iload 5
      // 0b7: if_icmpge 31f
      // 0ba: fconst_1
      // 0bb: iload 7
      // 0bd: i2f
      // 0be: iload 5
      // 0c0: i2f
      // 0c1: fdiv
      // 0c2: fsub
      // 0c3: iload 6
      // 0c5: i2f
      // 0c6: fmul
      // 0c7: fstore 8
      // 0c9: fload 8
      // 0cb: invokestatic fe6.v1i (F)I
      // 0ce: istore 9
      // 0d0: iload 9
      // 0d2: ineg
      // 0d3: iload 4
      // 0d5: ifeq 327
      // 0d8: istore 10
      // 0da: iload 10
      // 0dc: iload 9
      // 0de: if_icmpgt 317
      // 0e1: iload 10
      // 0e3: invokestatic fe6.z1m (I)I
      // 0e6: i2f
      // 0e7: ldc 0.25
      // 0e9: nop
      // 0ea: fsub
      // 0eb: fstore 11
      // 0ed: iload 9
      // 0ef: ineg
      // 0f0: iload 4
      // 0f2: ifeq 0b5
      // 0f5: istore 12
      // 0f7: iload 12
      // 0f9: iload 9
      // 0fb: if_icmpgt 30f
      // 0fe: iload 12
      // 100: invokestatic fe6.z1m (I)I
      // 103: i2f
      // 104: ldc 0.25
      // 106: nop
      // 107: fsub
      // 108: fstore 13
      // 10a: iload 10
      // 10c: iload 4
      // 10e: ifeq 0dc
      // 111: iload 4
      // 113: ifeq 150
      // 116: ifne 138
      // 119: goto 120
      // 11c: invokestatic vg1.a (Loov;)Loov;
      // 11f: athrow
      // 120: iload 12
      // 122: iload 4
      // 124: ifeq 161
      // 127: goto 12e
      // 12a: invokestatic vg1.a (Loov;)Loov;
      // 12d: athrow
      // 12e: ifeq 15f
      // 131: goto 138
      // 134: invokestatic vg1.a (Loov;)Loov;
      // 137: athrow
      // 138: fload 11
      // 13a: fload 11
      // 13c: fmul
      // 13d: fload 13
      // 13f: fload 13
      // 141: fmul
      // 142: fadd
      // 143: fload 8
      // 145: fload 8
      // 147: fmul
      // 148: fcmpg
      // 149: goto 150
      // 14c: invokestatic vg1.a (Loov;)Loov;
      // 14f: athrow
      // 150: iload 4
      // 152: ifeq 161
      // 155: ifgt 307
      // 158: goto 15f
      // 15b: invokestatic vg1.a (Loov;)Loov;
      // 15e: athrow
      // 15f: iload 10
      // 161: iload 4
      // 163: ifeq 1d1
      // 166: iload 9
      // 168: ineg
      // 169: if_icmpeq 1c2
      // 16c: goto 173
      // 16f: invokestatic vg1.a (Loov;)Loov;
      // 172: athrow
      // 173: iload 10
      // 175: iload 4
      // 177: ifeq 1d1
      // 17a: goto 181
      // 17d: invokestatic vg1.a (Loov;)Loov;
      // 180: athrow
      // 181: iload 9
      // 183: if_icmpeq 1c2
      // 186: goto 18d
      // 189: invokestatic vg1.a (Loov;)Loov;
      // 18c: athrow
      // 18d: iload 12
      // 18f: iload 4
      // 191: ifeq 1d1
      // 194: goto 19b
      // 197: invokestatic vg1.a (Loov;)Loov;
      // 19a: athrow
      // 19b: iload 9
      // 19d: ineg
      // 19e: if_icmpeq 1c2
      // 1a1: goto 1a8
      // 1a4: invokestatic vg1.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: iload 12
      // 1aa: iload 4
      // 1ac: ifeq 1d1
      // 1af: goto 1b6
      // 1b2: invokestatic vg1.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: iload 9
      // 1b8: if_icmpne 1d4
      // 1bb: goto 1c2
      // 1be: invokestatic vg1.a (Loov;)Loov;
      // 1c1: athrow
      // 1c2: aload 2
      // 1c3: invokevirtual java/util/Random.nextFloat ()F
      // 1c6: ldc 0.75
      // 1c8: nop
      // 1c9: fcmpg
      // 1ca: goto 1d1
      // 1cd: invokestatic vg1.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: ifgt 307
      // 1d4: aload 1
      // 1d5: aload 3
      // 1d6: iload 10
      // 1d8: iload 7
      // 1da: iload 12
      // 1dc: invokevirtual mew.ec4 (III)Lmew;
      // 1df: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1e2: invokeinterface zfz.r_y ()Le0x; 1
      // 1e7: astore 14
      // 1e9: aload 14
      // 1eb: iload 4
      // 1ed: ifeq 209
      // 1f0: invokevirtual e0x.p1r ()Lp3y;
      // 1f3: getstatic p3y.cei Lp3y;
      // 1f6: if_acmpeq 245
      // 1f9: goto 200
      // 1fc: invokestatic vg1.a (Loov;)Loov;
      // 1ff: athrow
      // 200: aload 14
      // 202: goto 209
      // 205: invokestatic vg1.a (Loov;)Loov;
      // 208: athrow
      // 209: getstatic ox_.kqk Le0x;
      // 20c: iload 4
      // 20e: ifeq 227
      // 211: if_acmpeq 245
      // 214: goto 21b
      // 217: invokestatic vg1.a (Loov;)Loov;
      // 21a: athrow
      // 21b: aload 14
      // 21d: getstatic ox_._mc Le0x;
      // 220: goto 227
      // 223: invokestatic vg1.a (Loov;)Loov;
      // 226: athrow
      // 227: iload 4
      // 229: ifeq 242
      // 22c: if_acmpeq 245
      // 22f: goto 236
      // 232: invokestatic vg1.a (Loov;)Loov;
      // 235: athrow
      // 236: aload 14
      // 238: getstatic ox_.f02 Le0x;
      // 23b: goto 242
      // 23e: invokestatic vg1.a (Loov;)Loov;
      // 241: athrow
      // 242: if_acmpne 261
      // 245: aload 0
      // 246: aload 1
      // 247: aload 3
      // 248: iload 10
      // 24a: iload 7
      // 24c: iload 12
      // 24e: invokevirtual mew.ec4 (III)Lmew;
      // 251: getstatic ox_.tli Le0x;
      // 254: invokevirtual e0x.l4i ()Lzfz;
      // 257: invokevirtual vg1.u0f (Lt9d;Lmew;Lzfz;)V
      // 25a: goto 261
      // 25d: invokestatic vg1.a (Loov;)Loov;
      // 260: athrow
      // 261: iload 7
      // 263: iload 4
      // 265: ifeq 274
      // 268: ifeq 307
      // 26b: goto 272
      // 26e: invokestatic vg1.a (Loov;)Loov;
      // 271: athrow
      // 272: iload 9
      // 274: bipush 1
      // 275: if_icmple 307
      // 278: aload 1
      // 279: aload 3
      // 27a: iload 10
      // 27c: iload 7
      // 27e: ineg
      // 27f: iload 12
      // 281: invokevirtual mew.ec4 (III)Lmew;
      // 284: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 287: invokeinterface zfz.r_y ()Le0x; 1
      // 28c: astore 14
      // 28e: aload 14
      // 290: iload 4
      // 292: ifeq 2ae
      // 295: invokevirtual e0x.p1r ()Lp3y;
      // 298: getstatic p3y.cei Lp3y;
      // 29b: if_acmpeq 2ea
      // 29e: goto 2a5
      // 2a1: invokestatic vg1.a (Loov;)Loov;
      // 2a4: athrow
      // 2a5: aload 14
      // 2a7: goto 2ae
      // 2aa: invokestatic vg1.a (Loov;)Loov;
      // 2ad: athrow
      // 2ae: getstatic ox_.kqk Le0x;
      // 2b1: iload 4
      // 2b3: ifeq 2cc
      // 2b6: if_acmpeq 2ea
      // 2b9: goto 2c0
      // 2bc: invokestatic vg1.a (Loov;)Loov;
      // 2bf: athrow
      // 2c0: aload 14
      // 2c2: getstatic ox_._mc Le0x;
      // 2c5: goto 2cc
      // 2c8: invokestatic vg1.a (Loov;)Loov;
      // 2cb: athrow
      // 2cc: iload 4
      // 2ce: ifeq 2e7
      // 2d1: if_acmpeq 2ea
      // 2d4: goto 2db
      // 2d7: invokestatic vg1.a (Loov;)Loov;
      // 2da: athrow
      // 2db: aload 14
      // 2dd: getstatic ox_.f02 Le0x;
      // 2e0: goto 2e7
      // 2e3: invokestatic vg1.a (Loov;)Loov;
      // 2e6: athrow
      // 2e7: if_acmpne 307
      // 2ea: aload 0
      // 2eb: aload 1
      // 2ec: aload 3
      // 2ed: iload 10
      // 2ef: iload 7
      // 2f1: ineg
      // 2f2: iload 12
      // 2f4: invokevirtual mew.ec4 (III)Lmew;
      // 2f7: getstatic ox_.tli Le0x;
      // 2fa: invokevirtual e0x.l4i ()Lzfz;
      // 2fd: invokevirtual vg1.u0f (Lt9d;Lmew;Lzfz;)V
      // 300: goto 307
      // 303: invokestatic vg1.a (Loov;)Loov;
      // 306: athrow
      // 307: iinc 12 1
      // 30a: iload 4
      // 30c: ifne 0f7
      // 30f: iinc 10 1
      // 312: iload 4
      // 314: ifne 0da
      // 317: iinc 7 1
      // 31a: iload 4
      // 31c: ifne 0b3
      // 31f: iload 6
      // 321: bipush 1
      // 322: isub
      // 323: istore 7
      // 325: iload 7
      // 327: iload 4
      // 329: ifeq 347
      // 32c: ifge 33e
      // 32f: goto 336
      // 332: invokestatic vg1.a (Loov;)Loov;
      // 335: athrow
      // 336: bipush 0
      // 337: istore 7
      // 339: iload 4
      // 33b: ifne 35a
      // 33e: iload 7
      // 340: goto 347
      // 343: invokestatic vg1.a (Loov;)Loov;
      // 346: athrow
      // 347: iload 4
      // 349: ifeq 35d
      // 34c: bipush 1
      // 34d: if_icmple 35a
      // 350: goto 357
      // 353: invokestatic vg1.a (Loov;)Loov;
      // 356: athrow
      // 357: bipush 1
      // 358: istore 7
      // 35a: iload 7
      // 35c: ineg
      // 35d: istore 8
      // 35f: iload 8
      // 361: iload 7
      // 363: if_icmpgt 4b2
      // 366: iload 7
      // 368: ineg
      // 369: iload 4
      // 36b: ifeq 4b3
      // 36e: istore 9
      // 370: iload 9
      // 372: iload 7
      // 374: if_icmpgt 4aa
      // 377: aload 3
      // 378: iload 8
      // 37a: bipush -1
      // 37b: iload 9
      // 37d: invokevirtual mew.ec4 (III)Lmew;
      // 380: astore 10
      // 382: bipush 50
      // 384: istore 11
      // 386: iload 8
      // 388: invokestatic java/lang/Math.abs (I)I
      // 38b: bipush 1
      // 38c: iload 4
      // 38e: ifeq 363
      // 391: iload 4
      // 393: ifeq 3ca
      // 396: if_icmpne 3c3
      // 399: goto 3a0
      // 39c: invokestatic vg1.a (Loov;)Loov;
      // 39f: athrow
      // 3a0: iload 9
      // 3a2: invokestatic java/lang/Math.abs (I)I
      // 3a5: bipush 1
      // 3a6: iload 4
      // 3a8: ifeq 3ca
      // 3ab: goto 3b2
      // 3ae: invokestatic vg1.a (Loov;)Loov;
      // 3b1: athrow
      // 3b2: if_icmpne 3c3
      // 3b5: goto 3bc
      // 3b8: invokestatic vg1.a (Loov;)Loov;
      // 3bb: athrow
      // 3bc: aload 2
      // 3bd: bipush 5
      // 3be: invokevirtual java/util/Random.nextInt (I)I
      // 3c1: istore 11
      // 3c3: aload 10
      // 3c5: invokevirtual mew.getY ()I
      // 3c8: bipush 50
      // 3ca: if_icmple 4a2
      // 3cd: aload 1
      // 3ce: aload 10
      // 3d0: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3d3: invokeinterface zfz.r_y ()Le0x; 1
      // 3d8: astore 12
      // 3da: iload 4
      // 3dc: ifeq 4a5
      // 3df: iload 4
      // 3e1: ifeq 477
      // 3e4: goto 3eb
      // 3e7: invokestatic vg1.a (Loov;)Loov;
      // 3ea: athrow
      // 3eb: aload 12
      // 3ed: invokevirtual e0x.p1r ()Lp3y;
      // 3f0: getstatic p3y.cei Lp3y;
      // 3f3: if_acmpeq 460
      // 3f6: goto 3fd
      // 3f9: invokestatic vg1.a (Loov;)Loov;
      // 3fc: athrow
      // 3fd: aload 12
      // 3ff: getstatic ox_.kqk Le0x;
      // 402: iload 4
      // 404: ifeq 424
      // 407: goto 40e
      // 40a: invokestatic vg1.a (Loov;)Loov;
      // 40d: athrow
      // 40e: if_acmpeq 460
      // 411: goto 418
      // 414: invokestatic vg1.a (Loov;)Loov;
      // 417: athrow
      // 418: aload 12
      // 41a: getstatic ox_._mc Le0x;
      // 41d: goto 424
      // 420: invokestatic vg1.a (Loov;)Loov;
      // 423: athrow
      // 424: iload 4
      // 426: ifeq 43f
      // 429: if_acmpeq 460
      // 42c: goto 433
      // 42f: invokestatic vg1.a (Loov;)Loov;
      // 432: athrow
      // 433: aload 12
      // 435: getstatic ox_.f02 Le0x;
      // 438: goto 43f
      // 43b: invokestatic vg1.a (Loov;)Loov;
      // 43e: athrow
      // 43f: iload 4
      // 441: ifeq 45a
      // 444: if_acmpeq 460
      // 447: goto 44e
      // 44a: invokestatic vg1.a (Loov;)Loov;
      // 44d: athrow
      // 44e: aload 12
      // 450: getstatic ox_.tli Le0x;
      // 453: goto 45a
      // 456: invokestatic vg1.a (Loov;)Loov;
      // 459: athrow
      // 45a: if_acmpeq 460
      // 45d: goto 4a2
      // 460: aload 0
      // 461: aload 1
      // 462: aload 10
      // 464: getstatic ox_.tli Le0x;
      // 467: invokevirtual e0x.l4i ()Lzfz;
      // 46a: invokevirtual vg1.u0f (Lt9d;Lmew;Lzfz;)V
      // 46d: aload 10
      // 46f: invokevirtual mew.eve ()Lmew;
      // 472: astore 10
      // 474: iinc 11 -1
      // 477: iload 11
      // 479: iload 4
      // 47b: ifeq 49b
      // 47e: ifgt 49d
      // 481: goto 488
      // 484: invokestatic vg1.a (Loov;)Loov;
      // 487: athrow
      // 488: aload 10
      // 48a: aload 2
      // 48b: bipush 5
      // 48c: invokevirtual java/util/Random.nextInt (I)I
      // 48f: bipush 1
      // 490: iadd
      // 491: invokevirtual mew.rb6 (I)Lmew;
      // 494: astore 10
      // 496: aload 2
      // 497: bipush 5
      // 498: invokevirtual java/util/Random.nextInt (I)I
      // 49b: istore 11
      // 49d: iload 4
      // 49f: ifne 3c3
      // 4a2: iinc 9 1
      // 4a5: iload 4
      // 4a7: ifne 370
      // 4aa: iinc 8 1
      // 4ad: iload 4
      // 4af: ifne 35f
      // 4b2: bipush 1
      // 4b3: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
