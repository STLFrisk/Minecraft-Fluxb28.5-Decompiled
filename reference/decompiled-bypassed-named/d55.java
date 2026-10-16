import java.util.Random;

public class d55 extends e9q {
   private static final zfz p2y = ox_.uom.l4i().zvi(qv5.yuo, x54$lti.yk5);
   private static final zfz k9h = ox_.rwl.l4i().zvi(uav.nps, x54$lti.yk5).zvi(uav.sdu, false);
   private boolean eon;

   public d55(boolean var1, boolean var2) {
      super(var1);
      this.eon = var2;
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 4
      // 005: aload 2
      // 006: bipush 3
      // 007: invokevirtual java/util/Random.nextInt (I)I
      // 00a: bipush 5
      // 00b: iadd
      // 00c: istore 5
      // 00e: aload 0
      // 00f: getfield d55.eon Z
      // 012: iload 4
      // 014: ifeq 02d
      // 017: ifeq 02c
      // 01a: goto 021
      // 01d: invokestatic d55.a (Loov;)Loov;
      // 020: athrow
      // 021: iload 5
      // 023: aload 2
      // 024: bipush 7
      // 026: invokevirtual java/util/Random.nextInt (I)I
      // 029: iadd
      // 02a: istore 5
      // 02c: bipush 1
      // 02d: istore 6
      // 02f: aload 3
      // 030: invokevirtual mew.getY ()I
      // 033: iload 4
      // 035: ifeq 3d1
      // 038: bipush 1
      // 039: if_icmplt 3d0
      // 03c: goto 043
      // 03f: invokestatic d55.a (Loov;)Loov;
      // 042: athrow
      // 043: aload 3
      // 044: invokevirtual mew.getY ()I
      // 047: iload 5
      // 049: iadd
      // 04a: bipush 1
      // 04b: iadd
      // 04c: iload 4
      // 04e: ifeq 3d1
      // 051: goto 058
      // 054: invokestatic d55.a (Loov;)Loov;
      // 057: athrow
      // 058: sipush 256
      // 05b: if_icmpgt 3d0
      // 05e: goto 065
      // 061: invokestatic d55.a (Loov;)Loov;
      // 064: athrow
      // 065: aload 3
      // 066: invokevirtual mew.getY ()I
      // 069: istore 7
      // 06b: iload 7
      // 06d: aload 3
      // 06e: invokevirtual mew.getY ()I
      // 071: bipush 1
      // 072: iadd
      // 073: iload 5
      // 075: iadd
      // 076: if_icmpgt 1a9
      // 079: bipush 1
      // 07a: istore 8
      // 07c: iload 7
      // 07e: iload 4
      // 080: ifeq 1ab
      // 083: aload 3
      // 084: invokevirtual mew.getY ()I
      // 087: iload 4
      // 089: ifeq 0b9
      // 08c: goto 093
      // 08f: invokestatic d55.a (Loov;)Loov;
      // 092: athrow
      // 093: if_icmpne 0a0
      // 096: goto 09d
      // 099: invokestatic d55.a (Loov;)Loov;
      // 09c: athrow
      // 09d: bipush 0
      // 09e: istore 8
      // 0a0: iload 7
      // 0a2: iload 4
      // 0a4: ifeq 0bd
      // 0a7: aload 3
      // 0a8: invokevirtual mew.getY ()I
      // 0ab: bipush 1
      // 0ac: iadd
      // 0ad: iload 5
      // 0af: iadd
      // 0b0: bipush 2
      // 0b1: isub
      // 0b2: goto 0b9
      // 0b5: invokestatic d55.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: if_icmplt 0bf
      // 0bc: bipush 2
      // 0bd: istore 8
      // 0bf: new mew$mix
      // 0c2: dup
      // 0c3: invokespecial mew$mix.<init> ()V
      // 0c6: astore 9
      // 0c8: aload 3
      // 0c9: invokevirtual mew.getX ()I
      // 0cc: iload 8
      // 0ce: isub
      // 0cf: istore 10
      // 0d1: iload 10
      // 0d3: aload 3
      // 0d4: invokevirtual mew.getX ()I
      // 0d7: iload 8
      // 0d9: iadd
      // 0da: if_icmpgt 1a1
      // 0dd: iload 6
      // 0df: iload 4
      // 0e1: ifeq 06d
      // 0e4: iload 4
      // 0e6: ifeq 101
      // 0e9: ifeq 1a1
      // 0ec: goto 0f3
      // 0ef: invokestatic d55.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: aload 3
      // 0f4: invokevirtual mew.getZ ()I
      // 0f7: iload 8
      // 0f9: isub
      // 0fa: goto 101
      // 0fd: invokestatic d55.a (Loov;)Loov;
      // 100: athrow
      // 101: istore 11
      // 103: iload 11
      // 105: aload 3
      // 106: invokevirtual mew.getZ ()I
      // 109: iload 8
      // 10b: iadd
      // 10c: if_icmpgt 199
      // 10f: iload 6
      // 111: iload 4
      // 113: ifeq 0d3
      // 116: iload 4
      // 118: ifeq 127
      // 11b: ifeq 199
      // 11e: goto 125
      // 121: invokestatic d55.a (Loov;)Loov;
      // 124: athrow
      // 125: iload 7
      // 127: iload 4
      // 129: ifeq 18f
      // 12c: iflt 187
      // 12f: goto 136
      // 132: invokestatic d55.a (Loov;)Loov;
      // 135: athrow
      // 136: iload 7
      // 138: iload 4
      // 13a: ifeq 18f
      // 13d: goto 144
      // 140: invokestatic d55.a (Loov;)Loov;
      // 143: athrow
      // 144: sipush 256
      // 147: if_icmpge 187
      // 14a: goto 151
      // 14d: invokestatic d55.a (Loov;)Loov;
      // 150: athrow
      // 151: aload 0
      // 152: aload 1
      // 153: aload 9
      // 155: iload 10
      // 157: iload 7
      // 159: iload 11
      // 15b: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 15e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 161: invokeinterface zfz.r_y ()Le0x; 1
      // 166: invokevirtual d55.mgy (Le0x;)Z
      // 169: iload 4
      // 16b: ifeq 180
      // 16e: goto 175
      // 171: invokestatic d55.a (Loov;)Loov;
      // 174: athrow
      // 175: ifne 191
      // 178: goto 17f
      // 17b: invokestatic d55.a (Loov;)Loov;
      // 17e: athrow
      // 17f: bipush 0
      // 180: istore 6
      // 182: iload 4
      // 184: ifne 191
      // 187: bipush 0
      // 188: goto 18f
      // 18b: invokestatic d55.a (Loov;)Loov;
      // 18e: athrow
      // 18f: istore 6
      // 191: iinc 11 1
      // 194: iload 4
      // 196: ifne 103
      // 199: iinc 10 1
      // 19c: iload 4
      // 19e: ifne 0d1
      // 1a1: iinc 7 1
      // 1a4: iload 4
      // 1a6: ifne 06b
      // 1a9: iload 6
      // 1ab: iload 4
      // 1ad: ifeq 1bb
      // 1b0: ifne 1bc
      // 1b3: goto 1ba
      // 1b6: invokestatic d55.a (Loov;)Loov;
      // 1b9: athrow
      // 1ba: bipush 0
      // 1bb: ireturn
      // 1bc: aload 1
      // 1bd: aload 3
      // 1be: invokevirtual mew.eve ()Lmew;
      // 1c1: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1c4: invokeinterface zfz.r_y ()Le0x; 1
      // 1c9: astore 7
      // 1cb: aload 7
      // 1cd: getstatic ox_.l11 Lx82;
      // 1d0: iload 4
      // 1d2: ifeq 1eb
      // 1d5: if_acmpeq 209
      // 1d8: goto 1df
      // 1db: invokestatic d55.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 7
      // 1e1: getstatic ox_.kqk Le0x;
      // 1e4: goto 1eb
      // 1e7: invokestatic d55.a (Loov;)Loov;
      // 1ea: athrow
      // 1eb: iload 4
      // 1ed: ifeq 206
      // 1f0: if_acmpeq 209
      // 1f3: goto 1fa
      // 1f6: invokestatic d55.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: aload 7
      // 1fc: getstatic ox_._5i Le0x;
      // 1ff: goto 206
      // 202: invokestatic d55.a (Loov;)Loov;
      // 205: athrow
      // 206: if_acmpne 3ce
      // 209: aload 3
      // 20a: invokevirtual mew.getY ()I
      // 20d: iload 4
      // 20f: ifeq 3cf
      // 212: goto 219
      // 215: invokestatic d55.a (Loov;)Loov;
      // 218: athrow
      // 219: sipush 256
      // 21c: iload 5
      // 21e: isub
      // 21f: bipush 1
      // 220: isub
      // 221: if_icmpge 3ce
      // 224: goto 22b
      // 227: invokestatic d55.a (Loov;)Loov;
      // 22a: athrow
      // 22b: aload 0
      // 22c: aload 1
      // 22d: aload 3
      // 22e: invokevirtual mew.eve ()Lmew;
      // 231: invokevirtual d55.g27 (Lt9d;Lmew;)V
      // 234: aload 3
      // 235: invokevirtual mew.getY ()I
      // 238: bipush 3
      // 239: isub
      // 23a: iload 5
      // 23c: iadd
      // 23d: istore 8
      // 23f: iload 8
      // 241: aload 3
      // 242: invokevirtual mew.getY ()I
      // 245: iload 5
      // 247: iadd
      // 248: if_icmpgt 36b
      // 24b: iload 8
      // 24d: aload 3
      // 24e: invokevirtual mew.getY ()I
      // 251: iload 5
      // 253: iadd
      // 254: isub
      // 255: istore 9
      // 257: bipush 1
      // 258: iload 9
      // 25a: bipush 2
      // 25b: idiv
      // 25c: isub
      // 25d: istore 10
      // 25f: aload 3
      // 260: invokevirtual mew.getX ()I
      // 263: iload 10
      // 265: isub
      // 266: iload 4
      // 268: ifeq 36c
      // 26b: istore 11
      // 26d: iload 11
      // 26f: aload 3
      // 270: invokevirtual mew.getX ()I
      // 273: iload 10
      // 275: iadd
      // 276: if_icmpgt 363
      // 279: iload 11
      // 27b: aload 3
      // 27c: invokevirtual mew.getX ()I
      // 27f: isub
      // 280: istore 12
      // 282: aload 3
      // 283: invokevirtual mew.getZ ()I
      // 286: iload 10
      // 288: isub
      // 289: iload 4
      // 28b: ifeq 241
      // 28e: istore 13
      // 290: iload 13
      // 292: aload 3
      // 293: invokevirtual mew.getZ ()I
      // 296: iload 10
      // 298: iadd
      // 299: if_icmpgt 35b
      // 29c: iload 13
      // 29e: aload 3
      // 29f: invokevirtual mew.getZ ()I
      // 2a2: isub
      // 2a3: istore 14
      // 2a5: iload 12
      // 2a7: invokestatic java/lang/Math.abs (I)I
      // 2aa: iload 10
      // 2ac: iload 4
      // 2ae: ifeq 276
      // 2b1: iload 4
      // 2b3: ifeq 2da
      // 2b6: if_icmpne 2fd
      // 2b9: goto 2c0
      // 2bc: invokestatic d55.a (Loov;)Loov;
      // 2bf: athrow
      // 2c0: iload 14
      // 2c2: invokestatic java/lang/Math.abs (I)I
      // 2c5: iload 4
      // 2c7: ifeq 2e9
      // 2ca: goto 2d1
      // 2cd: invokestatic d55.a (Loov;)Loov;
      // 2d0: athrow
      // 2d1: iload 10
      // 2d3: goto 2da
      // 2d6: invokestatic d55.a (Loov;)Loov;
      // 2d9: athrow
      // 2da: if_icmpne 2fd
      // 2dd: aload 2
      // 2de: bipush 2
      // 2df: invokevirtual java/util/Random.nextInt (I)I
      // 2e2: goto 2e9
      // 2e5: invokestatic d55.a (Loov;)Loov;
      // 2e8: athrow
      // 2e9: iload 4
      // 2eb: ifeq 2fa
      // 2ee: ifeq 353
      // 2f1: goto 2f8
      // 2f4: invokestatic d55.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: iload 9
      // 2fa: ifeq 353
      // 2fd: new mew
      // 300: dup
      // 301: iload 11
      // 303: iload 8
      // 305: iload 13
      // 307: invokespecial mew.<init> (III)V
      // 30a: astore 15
      // 30c: aload 1
      // 30d: aload 15
      // 30f: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 312: invokeinterface zfz.r_y ()Le0x; 1
      // 317: astore 16
      // 319: aload 16
      // 31b: invokevirtual e0x.p1r ()Lp3y;
      // 31e: getstatic p3y.cei Lp3y;
      // 321: iload 4
      // 323: ifeq 33f
      // 326: if_acmpeq 342
      // 329: goto 330
      // 32c: invokestatic d55.a (Loov;)Loov;
      // 32f: athrow
      // 330: aload 16
      // 332: invokevirtual e0x.p1r ()Lp3y;
      // 335: getstatic p3y.hh1 Lp3y;
      // 338: goto 33f
      // 33b: invokestatic d55.a (Loov;)Loov;
      // 33e: athrow
      // 33f: if_acmpne 353
      // 342: aload 0
      // 343: aload 1
      // 344: aload 15
      // 346: getstatic d55.k9h Lzfz;
      // 349: invokevirtual d55.u0f (Lt9d;Lmew;Lzfz;)V
      // 34c: goto 353
      // 34f: invokestatic d55.a (Loov;)Loov;
      // 352: athrow
      // 353: iinc 13 1
      // 356: iload 4
      // 358: ifne 290
      // 35b: iinc 11 1
      // 35e: iload 4
      // 360: ifne 26d
      // 363: iinc 8 1
      // 366: iload 4
      // 368: ifne 23f
      // 36b: bipush 0
      // 36c: istore 8
      // 36e: iload 8
      // 370: iload 5
      // 372: if_icmpge 3cc
      // 375: aload 1
      // 376: aload 3
      // 377: iload 8
      // 379: invokevirtual mew.z89 (I)Lmew;
      // 37c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 37f: invokeinterface zfz.r_y ()Le0x; 1
      // 384: astore 9
      // 386: aload 9
      // 388: invokevirtual e0x.p1r ()Lp3y;
      // 38b: getstatic p3y.cei Lp3y;
      // 38e: iload 4
      // 390: ifeq 3ac
      // 393: if_acmpeq 3af
      // 396: goto 39d
      // 399: invokestatic d55.a (Loov;)Loov;
      // 39c: athrow
      // 39d: aload 9
      // 39f: invokevirtual e0x.p1r ()Lp3y;
      // 3a2: getstatic p3y.hh1 Lp3y;
      // 3a5: goto 3ac
      // 3a8: invokestatic d55.a (Loov;)Loov;
      // 3ab: athrow
      // 3ac: if_acmpne 3c4
      // 3af: aload 0
      // 3b0: aload 1
      // 3b1: aload 3
      // 3b2: iload 8
      // 3b4: invokevirtual mew.z89 (I)Lmew;
      // 3b7: getstatic d55.p2y Lzfz;
      // 3ba: invokevirtual d55.u0f (Lt9d;Lmew;Lzfz;)V
      // 3bd: goto 3c4
      // 3c0: invokestatic d55.a (Loov;)Loov;
      // 3c3: athrow
      // 3c4: iinc 8 1
      // 3c7: iload 4
      // 3c9: ifne 36e
      // 3cc: bipush 1
      // 3cd: ireturn
      // 3ce: bipush 0
      // 3cf: ireturn
      // 3d0: bipush 0
      // 3d1: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
