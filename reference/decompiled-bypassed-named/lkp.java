import java.util.Random;

public class lkp extends e9q {
   private static final zfz nc0 = ox_.uom.l4i().zvi(qv5.yuo, x54$lti.b4p);
   private static final zfz pf1 = ox_.rwl.l4i().zvi(uav.nps, x54$lti.b4p).zvi(_cv.sdu, false);

   public lkp(boolean var1) {
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
      // 001: bipush 4
      // 002: invokevirtual java/util/Random.nextInt (I)I
      // 005: bipush 6
      // 007: iadd
      // 008: istore 5
      // 00a: bipush 1
      // 00b: aload 2
      // 00c: bipush 2
      // 00d: invokevirtual java/util/Random.nextInt (I)I
      // 010: iadd
      // 011: istore 6
      // 013: invokestatic OpaquePredicate.b ()I
      // 016: iload 5
      // 018: iload 6
      // 01a: isub
      // 01b: istore 7
      // 01d: bipush 2
      // 01e: aload 2
      // 01f: bipush 2
      // 020: invokevirtual java/util/Random.nextInt (I)I
      // 023: iadd
      // 024: istore 8
      // 026: istore 4
      // 028: bipush 1
      // 029: istore 9
      // 02b: aload 3
      // 02c: invokevirtual mew.getY ()I
      // 02f: iload 4
      // 031: ifeq 3f4
      // 034: bipush 1
      // 035: if_icmplt 3f3
      // 038: goto 03f
      // 03b: invokestatic lkp.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 3
      // 040: invokevirtual mew.getY ()I
      // 043: iload 5
      // 045: iadd
      // 046: bipush 1
      // 047: iadd
      // 048: iload 4
      // 04a: ifeq 3f4
      // 04d: goto 054
      // 050: invokestatic lkp.a (Loov;)Loov;
      // 053: athrow
      // 054: sipush 256
      // 057: if_icmpgt 3f3
      // 05a: goto 061
      // 05d: invokestatic lkp.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 3
      // 062: invokevirtual mew.getY ()I
      // 065: istore 10
      // 067: iload 10
      // 069: aload 3
      // 06a: invokevirtual mew.getY ()I
      // 06d: bipush 1
      // 06e: iadd
      // 06f: iload 5
      // 071: iadd
      // 072: if_icmpgt 1bb
      // 075: iload 9
      // 077: iload 4
      // 079: ifeq 1bd
      // 07c: iload 4
      // 07e: ifeq 1bd
      // 081: goto 088
      // 084: invokestatic lkp.a (Loov;)Loov;
      // 087: athrow
      // 088: ifeq 1bb
      // 08b: goto 092
      // 08e: invokestatic lkp.a (Loov;)Loov;
      // 091: athrow
      // 092: bipush 1
      // 093: istore 11
      // 095: iload 10
      // 097: aload 3
      // 098: invokevirtual mew.getY ()I
      // 09b: isub
      // 09c: iload 4
      // 09e: ifeq 0be
      // 0a1: iload 6
      // 0a3: if_icmpge 0b5
      // 0a6: goto 0ad
      // 0a9: invokestatic lkp.a (Loov;)Loov;
      // 0ac: athrow
      // 0ad: bipush 0
      // 0ae: istore 11
      // 0b0: iload 4
      // 0b2: ifne 0c0
      // 0b5: iload 8
      // 0b7: goto 0be
      // 0ba: invokestatic lkp.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: istore 11
      // 0c0: new mew$mix
      // 0c3: dup
      // 0c4: invokespecial mew$mix.<init> ()V
      // 0c7: astore 12
      // 0c9: aload 3
      // 0ca: invokevirtual mew.getX ()I
      // 0cd: iload 11
      // 0cf: isub
      // 0d0: istore 13
      // 0d2: iload 13
      // 0d4: aload 3
      // 0d5: invokevirtual mew.getX ()I
      // 0d8: iload 11
      // 0da: iadd
      // 0db: if_icmpgt 1b3
      // 0de: iload 9
      // 0e0: iload 4
      // 0e2: ifeq 069
      // 0e5: iload 4
      // 0e7: ifeq 102
      // 0ea: ifeq 1b3
      // 0ed: goto 0f4
      // 0f0: invokestatic lkp.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: aload 3
      // 0f5: invokevirtual mew.getZ ()I
      // 0f8: iload 11
      // 0fa: isub
      // 0fb: goto 102
      // 0fe: invokestatic lkp.a (Loov;)Loov;
      // 101: athrow
      // 102: istore 14
      // 104: iload 14
      // 106: aload 3
      // 107: invokevirtual mew.getZ ()I
      // 10a: iload 11
      // 10c: iadd
      // 10d: if_icmpgt 1ab
      // 110: iload 9
      // 112: iload 4
      // 114: ifeq 0d4
      // 117: iload 4
      // 119: ifeq 128
      // 11c: ifeq 1ab
      // 11f: goto 126
      // 122: invokestatic lkp.a (Loov;)Loov;
      // 125: athrow
      // 126: iload 10
      // 128: iload 4
      // 12a: ifeq 1a1
      // 12d: iflt 199
      // 130: goto 137
      // 133: invokestatic lkp.a (Loov;)Loov;
      // 136: athrow
      // 137: iload 10
      // 139: iload 4
      // 13b: ifeq 1a1
      // 13e: goto 145
      // 141: invokestatic lkp.a (Loov;)Loov;
      // 144: athrow
      // 145: sipush 256
      // 148: if_icmpge 199
      // 14b: goto 152
      // 14e: invokestatic lkp.a (Loov;)Loov;
      // 151: athrow
      // 152: aload 1
      // 153: aload 12
      // 155: iload 13
      // 157: iload 10
      // 159: iload 14
      // 15b: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 15e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 161: invokeinterface zfz.r_y ()Le0x; 1
      // 166: astore 15
      // 168: aload 15
      // 16a: invokevirtual e0x.p1r ()Lp3y;
      // 16d: getstatic p3y.cei Lp3y;
      // 170: iload 4
      // 172: ifeq 18e
      // 175: if_acmpeq 194
      // 178: goto 17f
      // 17b: invokestatic lkp.a (Loov;)Loov;
      // 17e: athrow
      // 17f: aload 15
      // 181: invokevirtual e0x.p1r ()Lp3y;
      // 184: getstatic p3y.hh1 Lp3y;
      // 187: goto 18e
      // 18a: invokestatic lkp.a (Loov;)Loov;
      // 18d: athrow
      // 18e: if_acmpeq 194
      // 191: bipush 0
      // 192: istore 9
      // 194: iload 4
      // 196: ifne 1a3
      // 199: bipush 0
      // 19a: goto 1a1
      // 19d: invokestatic lkp.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: istore 9
      // 1a3: iinc 14 1
      // 1a6: iload 4
      // 1a8: ifne 104
      // 1ab: iinc 13 1
      // 1ae: iload 4
      // 1b0: ifne 0d2
      // 1b3: iinc 10 1
      // 1b6: iload 4
      // 1b8: ifne 067
      // 1bb: iload 9
      // 1bd: iload 4
      // 1bf: ifeq 1cd
      // 1c2: ifne 1ce
      // 1c5: goto 1cc
      // 1c8: invokestatic lkp.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: bipush 0
      // 1cd: ireturn
      // 1ce: aload 1
      // 1cf: aload 3
      // 1d0: invokevirtual mew.eve ()Lmew;
      // 1d3: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1d6: invokeinterface zfz.r_y ()Le0x; 1
      // 1db: astore 10
      // 1dd: aload 10
      // 1df: getstatic ox_.l11 Lx82;
      // 1e2: iload 4
      // 1e4: ifeq 1fd
      // 1e7: if_acmpeq 21b
      // 1ea: goto 1f1
      // 1ed: invokestatic lkp.a (Loov;)Loov;
      // 1f0: athrow
      // 1f1: aload 10
      // 1f3: getstatic ox_.kqk Le0x;
      // 1f6: goto 1fd
      // 1f9: invokestatic lkp.a (Loov;)Loov;
      // 1fc: athrow
      // 1fd: iload 4
      // 1ff: ifeq 218
      // 202: if_acmpeq 21b
      // 205: goto 20c
      // 208: invokestatic lkp.a (Loov;)Loov;
      // 20b: athrow
      // 20c: aload 10
      // 20e: getstatic ox_._5i Le0x;
      // 211: goto 218
      // 214: invokestatic lkp.a (Loov;)Loov;
      // 217: athrow
      // 218: if_acmpne 3f1
      // 21b: aload 3
      // 21c: invokevirtual mew.getY ()I
      // 21f: iload 4
      // 221: ifeq 3f2
      // 224: goto 22b
      // 227: invokestatic lkp.a (Loov;)Loov;
      // 22a: athrow
      // 22b: sipush 256
      // 22e: iload 5
      // 230: isub
      // 231: bipush 1
      // 232: isub
      // 233: if_icmpge 3f1
      // 236: goto 23d
      // 239: invokestatic lkp.a (Loov;)Loov;
      // 23c: athrow
      // 23d: aload 0
      // 23e: aload 1
      // 23f: aload 3
      // 240: invokevirtual mew.eve ()Lmew;
      // 243: invokevirtual lkp.g27 (Lt9d;Lmew;)V
      // 246: aload 2
      // 247: bipush 2
      // 248: invokevirtual java/util/Random.nextInt (I)I
      // 24b: istore 11
      // 24d: bipush 1
      // 24e: istore 12
      // 250: bipush 0
      // 251: istore 13
      // 253: bipush 0
      // 254: istore 14
      // 256: iload 14
      // 258: iload 7
      // 25a: if_icmpgt 384
      // 25d: aload 3
      // 25e: invokevirtual mew.getY ()I
      // 261: iload 5
      // 263: iadd
      // 264: iload 14
      // 266: isub
      // 267: istore 15
      // 269: aload 3
      // 26a: invokevirtual mew.getX ()I
      // 26d: iload 11
      // 26f: isub
      // 270: iload 4
      // 272: ifeq 38c
      // 275: istore 16
      // 277: iload 16
      // 279: aload 3
      // 27a: invokevirtual mew.getX ()I
      // 27d: iload 11
      // 27f: iadd
      // 280: if_icmpgt 339
      // 283: iload 16
      // 285: aload 3
      // 286: invokevirtual mew.getX ()I
      // 289: isub
      // 28a: istore 17
      // 28c: aload 3
      // 28d: invokevirtual mew.getZ ()I
      // 290: iload 11
      // 292: isub
      // 293: iload 4
      // 295: ifeq 33b
      // 298: istore 18
      // 29a: iload 18
      // 29c: aload 3
      // 29d: invokevirtual mew.getZ ()I
      // 2a0: iload 11
      // 2a2: iadd
      // 2a3: if_icmpgt 331
      // 2a6: iload 18
      // 2a8: aload 3
      // 2a9: invokevirtual mew.getZ ()I
      // 2ac: isub
      // 2ad: istore 19
      // 2af: iload 17
      // 2b1: invokestatic java/lang/Math.abs (I)I
      // 2b4: iload 11
      // 2b6: iload 4
      // 2b8: ifeq 280
      // 2bb: iload 4
      // 2bd: ifeq 2e4
      // 2c0: if_icmpne 2ec
      // 2c3: goto 2ca
      // 2c6: invokestatic lkp.a (Loov;)Loov;
      // 2c9: athrow
      // 2ca: iload 19
      // 2cc: invokestatic java/lang/Math.abs (I)I
      // 2cf: iload 4
      // 2d1: ifeq 2e9
      // 2d4: goto 2db
      // 2d7: invokestatic lkp.a (Loov;)Loov;
      // 2da: athrow
      // 2db: iload 11
      // 2dd: goto 2e4
      // 2e0: invokestatic lkp.a (Loov;)Loov;
      // 2e3: athrow
      // 2e4: if_icmpne 2ec
      // 2e7: iload 11
      // 2e9: ifgt 329
      // 2ec: new mew
      // 2ef: dup
      // 2f0: iload 16
      // 2f2: iload 15
      // 2f4: iload 18
      // 2f6: invokespecial mew.<init> (III)V
      // 2f9: astore 20
      // 2fb: iload 4
      // 2fd: ifeq 32c
      // 300: aload 1
      // 301: aload 20
      // 303: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 306: invokeinterface zfz.r_y ()Le0x; 1
      // 30b: invokevirtual e0x.z4c ()Z
      // 30e: ifne 329
      // 311: goto 318
      // 314: invokestatic lkp.a (Loov;)Loov;
      // 317: athrow
      // 318: aload 0
      // 319: aload 1
      // 31a: aload 20
      // 31c: getstatic lkp.pf1 Lzfz;
      // 31f: invokevirtual lkp.u0f (Lt9d;Lmew;Lzfz;)V
      // 322: goto 329
      // 325: invokestatic lkp.a (Loov;)Loov;
      // 328: athrow
      // 329: iinc 18 1
      // 32c: iload 4
      // 32e: ifne 29a
      // 331: iinc 16 1
      // 334: iload 4
      // 336: ifne 277
      // 339: iload 11
      // 33b: iload 12
      // 33d: iload 4
      // 33f: ifeq 366
      // 342: if_icmplt 372
      // 345: goto 34c
      // 348: invokestatic lkp.a (Loov;)Loov;
      // 34b: athrow
      // 34c: iload 13
      // 34e: istore 11
      // 350: bipush 1
      // 351: istore 13
      // 353: iinc 12 1
      // 356: iload 4
      // 358: ifeq 37f
      // 35b: iload 12
      // 35d: iload 8
      // 35f: goto 366
      // 362: invokestatic lkp.a (Loov;)Loov;
      // 365: athrow
      // 366: if_icmple 37c
      // 369: iload 8
      // 36b: istore 12
      // 36d: iload 4
      // 36f: ifne 37c
      // 372: iinc 11 1
      // 375: goto 37c
      // 378: invokestatic lkp.a (Loov;)Loov;
      // 37b: athrow
      // 37c: iinc 14 1
      // 37f: iload 4
      // 381: ifne 256
      // 384: aload 2
      // 385: bipush 3
      // 386: invokevirtual java/util/Random.nextInt (I)I
      // 389: istore 14
      // 38b: bipush 0
      // 38c: istore 15
      // 38e: iload 15
      // 390: iload 5
      // 392: iload 14
      // 394: isub
      // 395: if_icmpge 3ef
      // 398: aload 1
      // 399: aload 3
      // 39a: iload 15
      // 39c: invokevirtual mew.z89 (I)Lmew;
      // 39f: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3a2: invokeinterface zfz.r_y ()Le0x; 1
      // 3a7: astore 16
      // 3a9: aload 16
      // 3ab: invokevirtual e0x.p1r ()Lp3y;
      // 3ae: getstatic p3y.cei Lp3y;
      // 3b1: iload 4
      // 3b3: ifeq 3cf
      // 3b6: if_acmpeq 3d2
      // 3b9: goto 3c0
      // 3bc: invokestatic lkp.a (Loov;)Loov;
      // 3bf: athrow
      // 3c0: aload 16
      // 3c2: invokevirtual e0x.p1r ()Lp3y;
      // 3c5: getstatic p3y.hh1 Lp3y;
      // 3c8: goto 3cf
      // 3cb: invokestatic lkp.a (Loov;)Loov;
      // 3ce: athrow
      // 3cf: if_acmpne 3e7
      // 3d2: aload 0
      // 3d3: aload 1
      // 3d4: aload 3
      // 3d5: iload 15
      // 3d7: invokevirtual mew.z89 (I)Lmew;
      // 3da: getstatic lkp.nc0 Lzfz;
      // 3dd: invokevirtual lkp.u0f (Lt9d;Lmew;Lzfz;)V
      // 3e0: goto 3e7
      // 3e3: invokestatic lkp.a (Loov;)Loov;
      // 3e6: athrow
      // 3e7: iinc 15 1
      // 3ea: iload 4
      // 3ec: ifne 38e
      // 3ef: bipush 1
      // 3f0: ireturn
      // 3f1: bipush 0
      // 3f2: ireturn
      // 3f3: bipush 0
      // 3f4: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
