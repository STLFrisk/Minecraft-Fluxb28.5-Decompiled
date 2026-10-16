import java.util.Random;

public class jun extends e9q {
   private static final zfz zmf = ox_.uom.l4i().zvi(qv5.yuo, x54$lti.b4p);
   private static final zfz he4 = ox_.rwl.l4i().zvi(uav.nps, x54$lti.b4p).zvi(_cv.sdu, false);

   public jun() {
      super(false);
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
      // 001: bipush 5
      // 002: invokevirtual java/util/Random.nextInt (I)I
      // 005: bipush 7
      // 007: iadd
      // 008: istore 5
      // 00a: iload 5
      // 00c: aload 2
      // 00d: bipush 2
      // 00e: invokevirtual java/util/Random.nextInt (I)I
      // 011: isub
      // 012: bipush 3
      // 013: isub
      // 014: istore 6
      // 016: invokestatic OpaquePredicate.c ()I
      // 019: iload 5
      // 01b: iload 6
      // 01d: isub
      // 01e: istore 7
      // 020: istore 4
      // 022: bipush 1
      // 023: aload 2
      // 024: iload 7
      // 026: bipush 1
      // 027: iadd
      // 028: invokevirtual java/util/Random.nextInt (I)I
      // 02b: iadd
      // 02c: istore 8
      // 02e: bipush 1
      // 02f: istore 9
      // 031: aload 3
      // 032: invokevirtual mew.getY ()I
      // 035: iload 4
      // 037: ifne 3cb
      // 03a: bipush 1
      // 03b: if_icmplt 3ca
      // 03e: goto 045
      // 041: invokestatic jun.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 3
      // 046: invokevirtual mew.getY ()I
      // 049: iload 5
      // 04b: iadd
      // 04c: bipush 1
      // 04d: iadd
      // 04e: iload 4
      // 050: ifne 3cb
      // 053: goto 05a
      // 056: invokestatic jun.a (Loov;)Loov;
      // 059: athrow
      // 05a: sipush 256
      // 05d: if_icmpgt 3ca
      // 060: goto 067
      // 063: invokestatic jun.a (Loov;)Loov;
      // 066: athrow
      // 067: aload 3
      // 068: invokevirtual mew.getY ()I
      // 06b: istore 10
      // 06d: iload 10
      // 06f: aload 3
      // 070: invokevirtual mew.getY ()I
      // 073: bipush 1
      // 074: iadd
      // 075: iload 5
      // 077: iadd
      // 078: if_icmpgt 1b0
      // 07b: iload 9
      // 07d: iload 4
      // 07f: ifne 1b2
      // 082: iload 4
      // 084: ifne 1b2
      // 087: goto 08e
      // 08a: invokestatic jun.a (Loov;)Loov;
      // 08d: athrow
      // 08e: ifeq 1b0
      // 091: goto 098
      // 094: invokestatic jun.a (Loov;)Loov;
      // 097: athrow
      // 098: bipush 1
      // 099: istore 11
      // 09b: iload 10
      // 09d: aload 3
      // 09e: invokevirtual mew.getY ()I
      // 0a1: isub
      // 0a2: iload 4
      // 0a4: ifne 0c4
      // 0a7: iload 6
      // 0a9: if_icmpge 0bb
      // 0ac: goto 0b3
      // 0af: invokestatic jun.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: bipush 0
      // 0b4: istore 11
      // 0b6: iload 4
      // 0b8: ifeq 0c6
      // 0bb: iload 8
      // 0bd: goto 0c4
      // 0c0: invokestatic jun.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: istore 11
      // 0c6: new mew$mix
      // 0c9: dup
      // 0ca: invokespecial mew$mix.<init> ()V
      // 0cd: astore 12
      // 0cf: aload 3
      // 0d0: invokevirtual mew.getX ()I
      // 0d3: iload 11
      // 0d5: isub
      // 0d6: istore 13
      // 0d8: iload 13
      // 0da: aload 3
      // 0db: invokevirtual mew.getX ()I
      // 0de: iload 11
      // 0e0: iadd
      // 0e1: if_icmpgt 1a8
      // 0e4: iload 9
      // 0e6: iload 4
      // 0e8: ifne 06f
      // 0eb: iload 4
      // 0ed: ifne 108
      // 0f0: ifeq 1a8
      // 0f3: goto 0fa
      // 0f6: invokestatic jun.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: aload 3
      // 0fb: invokevirtual mew.getZ ()I
      // 0fe: iload 11
      // 100: isub
      // 101: goto 108
      // 104: invokestatic jun.a (Loov;)Loov;
      // 107: athrow
      // 108: istore 14
      // 10a: iload 14
      // 10c: aload 3
      // 10d: invokevirtual mew.getZ ()I
      // 110: iload 11
      // 112: iadd
      // 113: if_icmpgt 1a0
      // 116: iload 9
      // 118: iload 4
      // 11a: ifne 0da
      // 11d: iload 4
      // 11f: ifne 12e
      // 122: ifeq 1a0
      // 125: goto 12c
      // 128: invokestatic jun.a (Loov;)Loov;
      // 12b: athrow
      // 12c: iload 10
      // 12e: iload 4
      // 130: ifne 196
      // 133: iflt 18e
      // 136: goto 13d
      // 139: invokestatic jun.a (Loov;)Loov;
      // 13c: athrow
      // 13d: iload 10
      // 13f: iload 4
      // 141: ifne 196
      // 144: goto 14b
      // 147: invokestatic jun.a (Loov;)Loov;
      // 14a: athrow
      // 14b: sipush 256
      // 14e: if_icmpge 18e
      // 151: goto 158
      // 154: invokestatic jun.a (Loov;)Loov;
      // 157: athrow
      // 158: aload 0
      // 159: aload 1
      // 15a: aload 12
      // 15c: iload 13
      // 15e: iload 10
      // 160: iload 14
      // 162: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 165: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 168: invokeinterface zfz.r_y ()Le0x; 1
      // 16d: invokevirtual jun.mgy (Le0x;)Z
      // 170: iload 4
      // 172: ifne 187
      // 175: goto 17c
      // 178: invokestatic jun.a (Loov;)Loov;
      // 17b: athrow
      // 17c: ifne 198
      // 17f: goto 186
      // 182: invokestatic jun.a (Loov;)Loov;
      // 185: athrow
      // 186: bipush 0
      // 187: istore 9
      // 189: iload 4
      // 18b: ifeq 198
      // 18e: bipush 0
      // 18f: goto 196
      // 192: invokestatic jun.a (Loov;)Loov;
      // 195: athrow
      // 196: istore 9
      // 198: iinc 14 1
      // 19b: iload 4
      // 19d: ifeq 10a
      // 1a0: iinc 13 1
      // 1a3: iload 4
      // 1a5: ifeq 0d8
      // 1a8: iinc 10 1
      // 1ab: iload 4
      // 1ad: ifeq 06d
      // 1b0: iload 9
      // 1b2: iload 4
      // 1b4: ifne 1c2
      // 1b7: ifne 1c3
      // 1ba: goto 1c1
      // 1bd: invokestatic jun.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: bipush 0
      // 1c2: ireturn
      // 1c3: aload 1
      // 1c4: aload 3
      // 1c5: invokevirtual mew.eve ()Lmew;
      // 1c8: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 1cb: invokeinterface zfz.r_y ()Le0x; 1
      // 1d0: astore 10
      // 1d2: aload 10
      // 1d4: getstatic ox_.l11 Lx82;
      // 1d7: iload 4
      // 1d9: ifne 1f2
      // 1dc: if_acmpeq 1f5
      // 1df: goto 1e6
      // 1e2: invokestatic jun.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: aload 10
      // 1e8: getstatic ox_.kqk Le0x;
      // 1eb: goto 1f2
      // 1ee: invokestatic jun.a (Loov;)Loov;
      // 1f1: athrow
      // 1f2: if_acmpne 3c8
      // 1f5: aload 3
      // 1f6: invokevirtual mew.getY ()I
      // 1f9: iload 4
      // 1fb: ifne 3c9
      // 1fe: goto 205
      // 201: invokestatic jun.a (Loov;)Loov;
      // 204: athrow
      // 205: sipush 256
      // 208: iload 5
      // 20a: isub
      // 20b: bipush 1
      // 20c: isub
      // 20d: if_icmpge 3c8
      // 210: goto 217
      // 213: invokestatic jun.a (Loov;)Loov;
      // 216: athrow
      // 217: aload 0
      // 218: aload 1
      // 219: aload 3
      // 21a: invokevirtual mew.eve ()Lmew;
      // 21d: invokevirtual jun.g27 (Lt9d;Lmew;)V
      // 220: bipush 0
      // 221: istore 11
      // 223: aload 3
      // 224: invokevirtual mew.getY ()I
      // 227: iload 5
      // 229: iadd
      // 22a: istore 12
      // 22c: iload 12
      // 22e: aload 3
      // 22f: invokevirtual mew.getY ()I
      // 232: iload 6
      // 234: iadd
      // 235: if_icmplt 363
      // 238: aload 3
      // 239: invokevirtual mew.getX ()I
      // 23c: iload 11
      // 23e: isub
      // 23f: iload 4
      // 241: ifne 364
      // 244: istore 13
      // 246: iload 13
      // 248: aload 3
      // 249: invokevirtual mew.getX ()I
      // 24c: iload 11
      // 24e: iadd
      // 24f: if_icmpgt 308
      // 252: iload 13
      // 254: aload 3
      // 255: invokevirtual mew.getX ()I
      // 258: isub
      // 259: istore 14
      // 25b: aload 3
      // 25c: invokevirtual mew.getZ ()I
      // 25f: iload 11
      // 261: isub
      // 262: iload 4
      // 264: ifne 30a
      // 267: istore 15
      // 269: iload 15
      // 26b: aload 3
      // 26c: invokevirtual mew.getZ ()I
      // 26f: iload 11
      // 271: iadd
      // 272: if_icmpgt 300
      // 275: iload 15
      // 277: aload 3
      // 278: invokevirtual mew.getZ ()I
      // 27b: isub
      // 27c: istore 16
      // 27e: iload 14
      // 280: invokestatic java/lang/Math.abs (I)I
      // 283: iload 11
      // 285: iload 4
      // 287: ifne 24f
      // 28a: iload 4
      // 28c: ifne 2b3
      // 28f: if_icmpne 2bb
      // 292: goto 299
      // 295: invokestatic jun.a (Loov;)Loov;
      // 298: athrow
      // 299: iload 16
      // 29b: invokestatic java/lang/Math.abs (I)I
      // 29e: iload 4
      // 2a0: ifne 2b8
      // 2a3: goto 2aa
      // 2a6: invokestatic jun.a (Loov;)Loov;
      // 2a9: athrow
      // 2aa: iload 11
      // 2ac: goto 2b3
      // 2af: invokestatic jun.a (Loov;)Loov;
      // 2b2: athrow
      // 2b3: if_icmpne 2bb
      // 2b6: iload 11
      // 2b8: ifgt 2f8
      // 2bb: new mew
      // 2be: dup
      // 2bf: iload 13
      // 2c1: iload 12
      // 2c3: iload 15
      // 2c5: invokespecial mew.<init> (III)V
      // 2c8: astore 17
      // 2ca: iload 4
      // 2cc: ifne 2fb
      // 2cf: aload 1
      // 2d0: aload 17
      // 2d2: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 2d5: invokeinterface zfz.r_y ()Le0x; 1
      // 2da: invokevirtual e0x.z4c ()Z
      // 2dd: ifne 2f8
      // 2e0: goto 2e7
      // 2e3: invokestatic jun.a (Loov;)Loov;
      // 2e6: athrow
      // 2e7: aload 0
      // 2e8: aload 1
      // 2e9: aload 17
      // 2eb: getstatic jun.he4 Lzfz;
      // 2ee: invokevirtual jun.u0f (Lt9d;Lmew;Lzfz;)V
      // 2f1: goto 2f8
      // 2f4: invokestatic jun.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: iinc 15 1
      // 2fb: iload 4
      // 2fd: ifeq 269
      // 300: iinc 13 1
      // 303: iload 4
      // 305: ifeq 246
      // 308: iload 11
      // 30a: bipush 1
      // 30b: iload 4
      // 30d: ifne 355
      // 310: if_icmplt 34a
      // 313: goto 31a
      // 316: invokestatic jun.a (Loov;)Loov;
      // 319: athrow
      // 31a: iload 12
      // 31c: aload 3
      // 31d: invokevirtual mew.getY ()I
      // 320: iload 6
      // 322: iadd
      // 323: bipush 1
      // 324: iadd
      // 325: iload 4
      // 327: ifne 355
      // 32a: goto 331
      // 32d: invokestatic jun.a (Loov;)Loov;
      // 330: athrow
      // 331: if_icmpne 34a
      // 334: goto 33b
      // 337: invokestatic jun.a (Loov;)Loov;
      // 33a: athrow
      // 33b: iinc 11 -1
      // 33e: iload 4
      // 340: ifeq 35b
      // 343: goto 34a
      // 346: invokestatic jun.a (Loov;)Loov;
      // 349: athrow
      // 34a: iload 11
      // 34c: iload 8
      // 34e: goto 355
      // 351: invokestatic jun.a (Loov;)Loov;
      // 354: athrow
      // 355: if_icmpge 35b
      // 358: iinc 11 1
      // 35b: iinc 12 -1
      // 35e: iload 4
      // 360: ifeq 22c
      // 363: bipush 0
      // 364: istore 12
      // 366: iload 12
      // 368: iload 5
      // 36a: bipush 1
      // 36b: isub
      // 36c: if_icmpge 3c6
      // 36f: aload 1
      // 370: aload 3
      // 371: iload 12
      // 373: invokevirtual mew.z89 (I)Lmew;
      // 376: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 379: invokeinterface zfz.r_y ()Le0x; 1
      // 37e: astore 13
      // 380: aload 13
      // 382: invokevirtual e0x.p1r ()Lp3y;
      // 385: getstatic p3y.cei Lp3y;
      // 388: iload 4
      // 38a: ifne 3a6
      // 38d: if_acmpeq 3a9
      // 390: goto 397
      // 393: invokestatic jun.a (Loov;)Loov;
      // 396: athrow
      // 397: aload 13
      // 399: invokevirtual e0x.p1r ()Lp3y;
      // 39c: getstatic p3y.hh1 Lp3y;
      // 39f: goto 3a6
      // 3a2: invokestatic jun.a (Loov;)Loov;
      // 3a5: athrow
      // 3a6: if_acmpne 3be
      // 3a9: aload 0
      // 3aa: aload 1
      // 3ab: aload 3
      // 3ac: iload 12
      // 3ae: invokevirtual mew.z89 (I)Lmew;
      // 3b1: getstatic jun.zmf Lzfz;
      // 3b4: invokevirtual jun.u0f (Lt9d;Lmew;Lzfz;)V
      // 3b7: goto 3be
      // 3ba: invokestatic jun.a (Loov;)Loov;
      // 3bd: athrow
      // 3be: iinc 12 1
      // 3c1: iload 4
      // 3c3: ifeq 366
      // 3c6: bipush 1
      // 3c7: ireturn
      // 3c8: bipush 0
      // 3c9: ireturn
      // 3ca: bipush 0
      // 3cb: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
