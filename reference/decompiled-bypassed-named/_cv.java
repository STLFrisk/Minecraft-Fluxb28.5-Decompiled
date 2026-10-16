import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class _cv extends eel {
   public static final h76 g07;
   public static final h76 sdu;
   public int[] ai2;
   public int sqi;
   public boolean b6a;

   public _cv() {
      super(p3y.hh1, false);
      this._p_(true);
      this.i3l(uja.qqf);
      this.q6h(0.2F);
      this.opa(1);
      this.t4k(_0p);
   }

   @Override
   public int ldy() {
      return h7z.yf5(0.5, 1.0);
   }

   @Override
   public int ieb(zfz var1) {
      return h7z.c6v();
   }

   @Override
   public int j24(m5n var1, mew var2, int var3) {
      return s4i.uqp(var1, var2);
   }

   @Override
   public void b8f(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 1
      // 001: istore 5
      // 003: iload 5
      // 005: bipush 1
      // 006: iadd
      // 007: istore 6
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: aload 2
      // 00d: invokevirtual mew.getX ()I
      // 010: istore 7
      // 012: istore 4
      // 014: aload 2
      // 015: invokevirtual mew.getY ()I
      // 018: istore 8
      // 01a: aload 2
      // 01b: invokevirtual mew.getZ ()I
      // 01e: istore 9
      // 020: aload 1
      // 021: new mew
      // 024: dup
      // 025: iload 7
      // 027: iload 6
      // 029: isub
      // 02a: iload 8
      // 02c: iload 6
      // 02e: isub
      // 02f: iload 9
      // 031: iload 6
      // 033: isub
      // 034: invokespecial mew.<init> (III)V
      // 037: new mew
      // 03a: dup
      // 03b: iload 7
      // 03d: iload 6
      // 03f: iadd
      // 040: iload 8
      // 042: iload 6
      // 044: iadd
      // 045: iload 9
      // 047: iload 6
      // 049: iadd
      // 04a: invokespecial mew.<init> (III)V
      // 04d: invokevirtual OpaquePredicate.o2i (Lmew;Lmew;)Z
      // 050: iload 4
      // 052: ifne 069
      // 055: ifeq 126
      // 058: goto 05f
      // 05b: invokestatic _cv.a (Loov;)Loov;
      // 05e: athrow
      // 05f: iload 5
      // 061: ineg
      // 062: goto 069
      // 065: invokestatic _cv.a (Loov;)Loov;
      // 068: athrow
      // 069: istore 10
      // 06b: iload 10
      // 06d: iload 5
      // 06f: if_icmpgt 126
      // 072: iload 5
      // 074: ineg
      // 075: istore 11
      // 077: iload 11
      // 079: iload 5
      // 07b: if_icmpgt 11e
      // 07e: iload 5
      // 080: ineg
      // 081: iload 4
      // 083: ifne 06d
      // 086: istore 12
      // 088: iload 12
      // 08a: iload 5
      // 08c: if_icmpgt 116
      // 08f: aload 2
      // 090: iload 10
      // 092: iload 11
      // 094: iload 12
      // 096: invokevirtual mew.ec4 (III)Lmew;
      // 099: astore 13
      // 09b: aload 1
      // 09c: aload 13
      // 09e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0a1: astore 14
      // 0a3: iload 4
      // 0a5: ifne 119
      // 0a8: iload 4
      // 0aa: ifne 111
      // 0ad: goto 0b4
      // 0b0: invokestatic _cv.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: aload 14
      // 0b6: invokeinterface zfz.r_y ()Le0x; 1
      // 0bb: invokevirtual e0x.p1r ()Lp3y;
      // 0be: getstatic p3y.hh1 Lp3y;
      // 0c1: if_acmpne 10e
      // 0c4: goto 0cb
      // 0c7: invokestatic _cv.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: aload 14
      // 0cd: getstatic _cv.sdu Lh76;
      // 0d0: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0d5: checkcast java/lang/Boolean
      // 0d8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0db: iload 4
      // 0dd: ifne 10d
      // 0e0: goto 0e7
      // 0e3: invokestatic _cv.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: ifne 10e
      // 0ea: goto 0f1
      // 0ed: invokestatic _cv.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 1
      // 0f2: aload 13
      // 0f4: aload 14
      // 0f6: getstatic _cv.sdu Lh76;
      // 0f9: bipush 1
      // 0fa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0fd: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 102: bipush 4
      // 103: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 106: goto 10d
      // 109: invokestatic _cv.a (Loov;)Loov;
      // 10c: athrow
      // 10d: pop
      // 10e: iinc 12 1
      // 111: iload 4
      // 113: ifeq 088
      // 116: iinc 11 1
      // 119: iload 4
      // 11b: ifeq 077
      // 11e: iinc 10 1
      // 121: iload 4
      // 123: ifeq 06b
      // 126: return
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 5
      // 005: aload 1
      // 006: getfield OpaquePredicate.v0f Z
      // 009: iload 5
      // 00b: ifne 02e
      // 00e: ifne 50e
      // 011: goto 018
      // 014: invokestatic _cv.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 3
      // 019: getstatic _cv.sdu Lh76;
      // 01c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 021: checkcast java/lang/Boolean
      // 024: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 027: goto 02e
      // 02a: invokestatic _cv.a (Loov;)Loov;
      // 02d: athrow
      // 02e: iload 5
      // 030: ifne 053
      // 033: ifeq 50e
      // 036: goto 03d
      // 039: invokestatic _cv.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 3
      // 03e: getstatic _cv.g07 Lh76;
      // 041: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 046: checkcast java/lang/Boolean
      // 049: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 04c: goto 053
      // 04f: invokestatic _cv.a (Loov;)Loov;
      // 052: athrow
      // 053: iload 5
      // 055: ifne 063
      // 058: ifeq 50e
      // 05b: goto 062
      // 05e: invokestatic _cv.a (Loov;)Loov;
      // 061: athrow
      // 062: bipush 4
      // 063: istore 6
      // 065: iload 6
      // 067: bipush 1
      // 068: iadd
      // 069: istore 7
      // 06b: aload 2
      // 06c: invokevirtual mew.getX ()I
      // 06f: istore 8
      // 071: aload 2
      // 072: invokevirtual mew.getY ()I
      // 075: istore 9
      // 077: aload 2
      // 078: invokevirtual mew.getZ ()I
      // 07b: istore 10
      // 07d: bipush 32
      // 07f: istore 11
      // 081: iload 11
      // 083: iload 11
      // 085: imul
      // 086: istore 12
      // 088: iload 11
      // 08a: bipush 2
      // 08b: idiv
      // 08c: istore 13
      // 08e: aload 0
      // 08f: iload 5
      // 091: ifne 0a9
      // 094: getfield _cv.ai2 [I
      // 097: ifnonnull 0b6
      // 09a: goto 0a1
      // 09d: invokestatic _cv.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: aload 0
      // 0a2: goto 0a9
      // 0a5: invokestatic _cv.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: iload 11
      // 0ab: iload 11
      // 0ad: imul
      // 0ae: iload 11
      // 0b0: imul
      // 0b1: newarray 10
      // 0b3: putfield _cv.ai2 [I
      // 0b6: aload 1
      // 0b7: new mew
      // 0ba: dup
      // 0bb: iload 8
      // 0bd: iload 7
      // 0bf: isub
      // 0c0: iload 9
      // 0c2: iload 7
      // 0c4: isub
      // 0c5: iload 10
      // 0c7: iload 7
      // 0c9: isub
      // 0ca: invokespecial mew.<init> (III)V
      // 0cd: new mew
      // 0d0: dup
      // 0d1: iload 8
      // 0d3: iload 7
      // 0d5: iadd
      // 0d6: iload 9
      // 0d8: iload 7
      // 0da: iadd
      // 0db: iload 10
      // 0dd: iload 7
      // 0df: iadd
      // 0e0: invokespecial mew.<init> (III)V
      // 0e3: invokevirtual OpaquePredicate.o2i (Lmew;Lmew;)Z
      // 0e6: iload 5
      // 0e8: ifne 4ce
      // 0eb: ifeq 4bb
      // 0ee: goto 0f5
      // 0f1: invokestatic _cv.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: new mew$mix
      // 0f8: dup
      // 0f9: invokespecial mew$mix.<init> ()V
      // 0fc: astore 14
      // 0fe: iload 6
      // 100: ineg
      // 101: istore 15
      // 103: iload 15
      // 105: iload 6
      // 107: if_icmpgt 220
      // 10a: iload 6
      // 10c: ineg
      // 10d: iload 5
      // 10f: ifne 221
      // 112: istore 16
      // 114: iload 16
      // 116: iload 6
      // 118: if_icmpgt 218
      // 11b: iload 6
      // 11d: ineg
      // 11e: iload 5
      // 120: ifne 105
      // 123: istore 17
      // 125: iload 17
      // 127: iload 6
      // 129: if_icmpgt 210
      // 12c: aload 1
      // 12d: aload 14
      // 12f: iload 8
      // 131: iload 15
      // 133: iadd
      // 134: iload 9
      // 136: iload 16
      // 138: iadd
      // 139: iload 10
      // 13b: iload 17
      // 13d: iadd
      // 13e: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 141: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 144: invokeinterface zfz.r_y ()Le0x; 1
      // 149: astore 18
      // 14b: iload 5
      // 14d: ifne 213
      // 150: aload 18
      // 152: getstatic ox_.uom Le0x;
      // 155: iload 5
      // 157: ifne 183
      // 15a: goto 161
      // 15d: invokestatic _cv.a (Loov;)Loov;
      // 160: athrow
      // 161: if_acmpeq 1e4
      // 164: goto 16b
      // 167: invokestatic _cv.a (Loov;)Loov;
      // 16a: athrow
      // 16b: aload 18
      // 16d: iload 5
      // 16f: ifne 188
      // 172: goto 179
      // 175: invokestatic _cv.a (Loov;)Loov;
      // 178: athrow
      // 179: getstatic ox_.a4y Le0x;
      // 17c: goto 183
      // 17f: invokestatic _cv.a (Loov;)Loov;
      // 182: athrow
      // 183: if_acmpeq 1e4
      // 186: aload 18
      // 188: invokevirtual e0x.p1r ()Lp3y;
      // 18b: getstatic p3y.hh1 Lp3y;
      // 18e: if_acmpne 1bb
      // 191: aload 0
      // 192: getfield _cv.ai2 [I
      // 195: iload 15
      // 197: iload 13
      // 199: iadd
      // 19a: iload 12
      // 19c: imul
      // 19d: iload 16
      // 19f: iload 13
      // 1a1: iadd
      // 1a2: iload 11
      // 1a4: imul
      // 1a5: iadd
      // 1a6: iload 17
      // 1a8: iadd
      // 1a9: iload 13
      // 1ab: iadd
      // 1ac: bipush -2
      // 1ae: iastore
      // 1af: iload 5
      // 1b1: ifeq 208
      // 1b4: goto 1bb
      // 1b7: invokestatic _cv.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: aload 0
      // 1bc: getfield _cv.ai2 [I
      // 1bf: iload 15
      // 1c1: iload 13
      // 1c3: iadd
      // 1c4: iload 12
      // 1c6: imul
      // 1c7: iload 16
      // 1c9: iload 13
      // 1cb: iadd
      // 1cc: iload 11
      // 1ce: imul
      // 1cf: iadd
      // 1d0: iload 17
      // 1d2: iadd
      // 1d3: iload 13
      // 1d5: iadd
      // 1d6: bipush -1
      // 1d7: iastore
      // 1d8: iload 5
      // 1da: ifeq 208
      // 1dd: goto 1e4
      // 1e0: invokestatic _cv.a (Loov;)Loov;
      // 1e3: athrow
      // 1e4: aload 0
      // 1e5: getfield _cv.ai2 [I
      // 1e8: iload 15
      // 1ea: iload 13
      // 1ec: iadd
      // 1ed: iload 12
      // 1ef: imul
      // 1f0: iload 16
      // 1f2: iload 13
      // 1f4: iadd
      // 1f5: iload 11
      // 1f7: imul
      // 1f8: iadd
      // 1f9: iload 17
      // 1fb: iadd
      // 1fc: iload 13
      // 1fe: iadd
      // 1ff: bipush 0
      // 200: iastore
      // 201: goto 208
      // 204: invokestatic _cv.a (Loov;)Loov;
      // 207: athrow
      // 208: iinc 17 1
      // 20b: iload 5
      // 20d: ifeq 125
      // 210: iinc 16 1
      // 213: iload 5
      // 215: ifeq 114
      // 218: iinc 15 1
      // 21b: iload 5
      // 21d: ifeq 103
      // 220: bipush 1
      // 221: istore 15
      // 223: iload 15
      // 225: bipush 4
      // 226: if_icmpgt 4bb
      // 229: iload 6
      // 22b: ineg
      // 22c: iload 5
      // 22e: ifne 4ce
      // 231: istore 16
      // 233: iload 16
      // 235: iload 6
      // 237: if_icmpgt 4b3
      // 23a: iload 6
      // 23c: ineg
      // 23d: iload 5
      // 23f: ifne 225
      // 242: istore 17
      // 244: iload 17
      // 246: iload 6
      // 248: if_icmpgt 4ab
      // 24b: iload 6
      // 24d: ineg
      // 24e: iload 5
      // 250: ifne 235
      // 253: istore 18
      // 255: iload 18
      // 257: iload 6
      // 259: if_icmpgt 4a3
      // 25c: aload 0
      // 25d: getfield _cv.ai2 [I
      // 260: iload 16
      // 262: iload 13
      // 264: iadd
      // 265: iload 12
      // 267: imul
      // 268: iload 17
      // 26a: iload 13
      // 26c: iadd
      // 26d: iload 11
      // 26f: imul
      // 270: iadd
      // 271: iload 18
      // 273: iadd
      // 274: iload 13
      // 276: iadd
      // 277: iaload
      // 278: iload 15
      // 27a: bipush 1
      // 27b: isub
      // 27c: iload 5
      // 27e: ifne 248
      // 281: iload 5
      // 283: ifne 2b7
      // 286: if_icmpne 49b
      // 289: goto 290
      // 28c: invokestatic _cv.a (Loov;)Loov;
      // 28f: athrow
      // 290: aload 0
      // 291: getfield _cv.ai2 [I
      // 294: iload 16
      // 296: iload 13
      // 298: iadd
      // 299: bipush 1
      // 29a: isub
      // 29b: iload 12
      // 29d: imul
      // 29e: iload 17
      // 2a0: iload 13
      // 2a2: iadd
      // 2a3: iload 11
      // 2a5: imul
      // 2a6: iadd
      // 2a7: iload 18
      // 2a9: iadd
      // 2aa: iload 13
      // 2ac: iadd
      // 2ad: iaload
      // 2ae: bipush -2
      // 2b0: goto 2b7
      // 2b3: invokestatic _cv.a (Loov;)Loov;
      // 2b6: athrow
      // 2b7: iload 5
      // 2b9: ifne 30d
      // 2bc: if_icmpne 2ed
      // 2bf: goto 2c6
      // 2c2: invokestatic _cv.a (Loov;)Loov;
      // 2c5: athrow
      // 2c6: aload 0
      // 2c7: getfield _cv.ai2 [I
      // 2ca: iload 16
      // 2cc: iload 13
      // 2ce: iadd
      // 2cf: bipush 1
      // 2d0: isub
      // 2d1: iload 12
      // 2d3: imul
      // 2d4: iload 17
      // 2d6: iload 13
      // 2d8: iadd
      // 2d9: iload 11
      // 2db: imul
      // 2dc: iadd
      // 2dd: iload 18
      // 2df: iadd
      // 2e0: iload 13
      // 2e2: iadd
      // 2e3: iload 15
      // 2e5: iastore
      // 2e6: goto 2ed
      // 2e9: invokestatic _cv.a (Loov;)Loov;
      // 2ec: athrow
      // 2ed: aload 0
      // 2ee: getfield _cv.ai2 [I
      // 2f1: iload 16
      // 2f3: iload 13
      // 2f5: iadd
      // 2f6: bipush 1
      // 2f7: iadd
      // 2f8: iload 12
      // 2fa: imul
      // 2fb: iload 17
      // 2fd: iload 13
      // 2ff: iadd
      // 300: iload 11
      // 302: imul
      // 303: iadd
      // 304: iload 18
      // 306: iadd
      // 307: iload 13
      // 309: iadd
      // 30a: iaload
      // 30b: bipush -2
      // 30d: iload 5
      // 30f: ifne 363
      // 312: if_icmpne 343
      // 315: goto 31c
      // 318: invokestatic _cv.a (Loov;)Loov;
      // 31b: athrow
      // 31c: aload 0
      // 31d: getfield _cv.ai2 [I
      // 320: iload 16
      // 322: iload 13
      // 324: iadd
      // 325: bipush 1
      // 326: iadd
      // 327: iload 12
      // 329: imul
      // 32a: iload 17
      // 32c: iload 13
      // 32e: iadd
      // 32f: iload 11
      // 331: imul
      // 332: iadd
      // 333: iload 18
      // 335: iadd
      // 336: iload 13
      // 338: iadd
      // 339: iload 15
      // 33b: iastore
      // 33c: goto 343
      // 33f: invokestatic _cv.a (Loov;)Loov;
      // 342: athrow
      // 343: aload 0
      // 344: getfield _cv.ai2 [I
      // 347: iload 16
      // 349: iload 13
      // 34b: iadd
      // 34c: iload 12
      // 34e: imul
      // 34f: iload 17
      // 351: iload 13
      // 353: iadd
      // 354: bipush 1
      // 355: isub
      // 356: iload 11
      // 358: imul
      // 359: iadd
      // 35a: iload 18
      // 35c: iadd
      // 35d: iload 13
      // 35f: iadd
      // 360: iaload
      // 361: bipush -2
      // 363: iload 5
      // 365: ifne 3b9
      // 368: if_icmpne 399
      // 36b: goto 372
      // 36e: invokestatic _cv.a (Loov;)Loov;
      // 371: athrow
      // 372: aload 0
      // 373: getfield _cv.ai2 [I
      // 376: iload 16
      // 378: iload 13
      // 37a: iadd
      // 37b: iload 12
      // 37d: imul
      // 37e: iload 17
      // 380: iload 13
      // 382: iadd
      // 383: bipush 1
      // 384: isub
      // 385: iload 11
      // 387: imul
      // 388: iadd
      // 389: iload 18
      // 38b: iadd
      // 38c: iload 13
      // 38e: iadd
      // 38f: iload 15
      // 391: iastore
      // 392: goto 399
      // 395: invokestatic _cv.a (Loov;)Loov;
      // 398: athrow
      // 399: aload 0
      // 39a: getfield _cv.ai2 [I
      // 39d: iload 16
      // 39f: iload 13
      // 3a1: iadd
      // 3a2: iload 12
      // 3a4: imul
      // 3a5: iload 17
      // 3a7: iload 13
      // 3a9: iadd
      // 3aa: bipush 1
      // 3ab: iadd
      // 3ac: iload 11
      // 3ae: imul
      // 3af: iadd
      // 3b0: iload 18
      // 3b2: iadd
      // 3b3: iload 13
      // 3b5: iadd
      // 3b6: iaload
      // 3b7: bipush -2
      // 3b9: iload 5
      // 3bb: ifne 40f
      // 3be: if_icmpne 3ef
      // 3c1: goto 3c8
      // 3c4: invokestatic _cv.a (Loov;)Loov;
      // 3c7: athrow
      // 3c8: aload 0
      // 3c9: getfield _cv.ai2 [I
      // 3cc: iload 16
      // 3ce: iload 13
      // 3d0: iadd
      // 3d1: iload 12
      // 3d3: imul
      // 3d4: iload 17
      // 3d6: iload 13
      // 3d8: iadd
      // 3d9: bipush 1
      // 3da: iadd
      // 3db: iload 11
      // 3dd: imul
      // 3de: iadd
      // 3df: iload 18
      // 3e1: iadd
      // 3e2: iload 13
      // 3e4: iadd
      // 3e5: iload 15
      // 3e7: iastore
      // 3e8: goto 3ef
      // 3eb: invokestatic _cv.a (Loov;)Loov;
      // 3ee: athrow
      // 3ef: aload 0
      // 3f0: getfield _cv.ai2 [I
      // 3f3: iload 16
      // 3f5: iload 13
      // 3f7: iadd
      // 3f8: iload 12
      // 3fa: imul
      // 3fb: iload 17
      // 3fd: iload 13
      // 3ff: iadd
      // 400: iload 11
      // 402: imul
      // 403: iadd
      // 404: iload 18
      // 406: iload 13
      // 408: iadd
      // 409: bipush 1
      // 40a: isub
      // 40b: iadd
      // 40c: iaload
      // 40d: bipush -2
      // 40f: iload 5
      // 411: ifne 471
      // 414: if_icmpne 445
      // 417: goto 41e
      // 41a: invokestatic _cv.a (Loov;)Loov;
      // 41d: athrow
      // 41e: aload 0
      // 41f: getfield _cv.ai2 [I
      // 422: iload 16
      // 424: iload 13
      // 426: iadd
      // 427: iload 12
      // 429: imul
      // 42a: iload 17
      // 42c: iload 13
      // 42e: iadd
      // 42f: iload 11
      // 431: imul
      // 432: iadd
      // 433: iload 18
      // 435: iload 13
      // 437: iadd
      // 438: bipush 1
      // 439: isub
      // 43a: iadd
      // 43b: iload 15
      // 43d: iastore
      // 43e: goto 445
      // 441: invokestatic _cv.a (Loov;)Loov;
      // 444: athrow
      // 445: aload 0
      // 446: getfield _cv.ai2 [I
      // 449: iload 16
      // 44b: iload 13
      // 44d: iadd
      // 44e: iload 12
      // 450: imul
      // 451: iload 17
      // 453: iload 13
      // 455: iadd
      // 456: iload 11
      // 458: imul
      // 459: iadd
      // 45a: iload 18
      // 45c: iadd
      // 45d: iload 13
      // 45f: iadd
      // 460: bipush 1
      // 461: iadd
      // 462: iload 5
      // 464: ifne 498
      // 467: iaload
      // 468: bipush -2
      // 46a: goto 471
      // 46d: invokestatic _cv.a (Loov;)Loov;
      // 470: athrow
      // 471: if_icmpne 49b
      // 474: aload 0
      // 475: getfield _cv.ai2 [I
      // 478: iload 16
      // 47a: iload 13
      // 47c: iadd
      // 47d: iload 12
      // 47f: imul
      // 480: iload 17
      // 482: iload 13
      // 484: iadd
      // 485: iload 11
      // 487: imul
      // 488: iadd
      // 489: iload 18
      // 48b: iadd
      // 48c: iload 13
      // 48e: iadd
      // 48f: bipush 1
      // 490: iadd
      // 491: goto 498
      // 494: invokestatic _cv.a (Loov;)Loov;
      // 497: athrow
      // 498: iload 15
      // 49a: iastore
      // 49b: iinc 18 1
      // 49e: iload 5
      // 4a0: ifeq 255
      // 4a3: iinc 17 1
      // 4a6: iload 5
      // 4a8: ifeq 244
      // 4ab: iinc 16 1
      // 4ae: iload 5
      // 4b0: ifeq 233
      // 4b3: iinc 15 1
      // 4b6: iload 5
      // 4b8: ifeq 223
      // 4bb: aload 0
      // 4bc: getfield _cv.ai2 [I
      // 4bf: iload 13
      // 4c1: iload 12
      // 4c3: imul
      // 4c4: iload 13
      // 4c6: iload 11
      // 4c8: imul
      // 4c9: iadd
      // 4ca: iload 13
      // 4cc: iadd
      // 4cd: iaload
      // 4ce: istore 14
      // 4d0: iload 14
      // 4d2: iload 5
      // 4d4: ifne 4fb
      // 4d7: iflt 501
      // 4da: goto 4e1
      // 4dd: invokestatic _cv.a (Loov;)Loov;
      // 4e0: athrow
      // 4e1: aload 1
      // 4e2: aload 2
      // 4e3: aload 3
      // 4e4: getstatic _cv.sdu Lh76;
      // 4e7: bipush 0
      // 4e8: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4eb: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 4f0: bipush 4
      // 4f1: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 4f4: goto 4fb
      // 4f7: invokestatic _cv.a (Loov;)Loov;
      // 4fa: athrow
      // 4fb: pop
      // 4fc: iload 5
      // 4fe: ifeq 50e
      // 501: aload 0
      // 502: aload 1
      // 503: aload 2
      // 504: invokespecial _cv.g6u (Lt9d;Lmew;)V
      // 507: goto 50e
      // 50a: invokestatic _cv.a (Loov;)Loov;
      // 50d: athrow
      // 50e: return
   }

   @Override
   public void kyo(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: aload 2
      // 07: invokevirtual mew.nuv ()Lmew;
      // 0a: invokevirtual OpaquePredicate.eyz (Lmew;)Z
      // 0d: iload 5
      // 0f: ifeq 2b
      // 12: ifeq 99
      // 15: goto 1c
      // 18: invokestatic _cv.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: aload 2
      // 1e: invokevirtual mew.eve ()Lmew;
      // 21: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 24: goto 2b
      // 27: invokestatic _cv.a (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 5
      // 2d: ifeq 48
      // 30: ifne 99
      // 33: goto 3a
      // 36: invokestatic _cv.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 4
      // 3c: bipush 15
      // 3e: invokevirtual java/util/Random.nextInt (I)I
      // 41: goto 48
      // 44: invokestatic _cv.a (Loov;)Loov;
      // 47: athrow
      // 48: iload 5
      // 4a: ifeq 63
      // 4d: bipush 1
      // 4e: if_icmpne 99
      // 51: goto 58
      // 54: invokestatic _cv.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 2
      // 59: invokevirtual mew.getX ()I
      // 5c: goto 63
      // 5f: invokestatic _cv.a (Loov;)Loov;
      // 62: athrow
      // 63: i2f
      // 64: aload 4
      // 66: invokevirtual java/util/Random.nextFloat ()F
      // 69: fadd
      // 6a: f2d
      // 6b: dstore 6
      // 6d: aload 2
      // 6e: invokevirtual mew.getY ()I
      // 71: i2d
      // 72: ldc2_w 0.05
      // 75: dsub
      // 76: dstore 8
      // 78: aload 2
      // 79: invokevirtual mew.getZ ()I
      // 7c: i2f
      // 7d: aload 4
      // 7f: invokevirtual java/util/Random.nextFloat ()F
      // 82: fadd
      // 83: f2d
      // 84: dstore 10
      // 86: aload 1
      // 87: getstatic w_0.cde Lw_0;
      // 8a: dload 6
      // 8c: dload 8
      // 8e: dload 10
      // 90: dconst_0
      // 91: dconst_0
      // 92: dconst_0
      // 93: bipush 0
      // 94: newarray 10
      // 96: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 99: return
   }

   private void g6u(OpaquePredicate var1, mew var2) {
      this.lf0(var1, var2, var1.getBlockState(var2), 0);
      var1.i6x(var2);
   }

   @Override
   public int bzr(Random var1) {
      int var2 = OpaquePredicate.b();

      try {
         int var10000 = var1.nextInt(20);
         if (var2 == 0) {
            return var10000;
         }

         if (var10000 == 0) {
            return 1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return 0;
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return u7m.gfm(ox_.t_k);
   }

   @Override
   public void ix7(OpaquePredicate param1, mew param2, zfz param3, float param4, int param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 6
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 6
      // 0b: ifeq 24
      // 0e: ifne d7
      // 11: goto 18
      // 14: invokestatic _cv.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: aload 3
      // 1a: invokevirtual _cv.b9m (Lzfz;)I
      // 1d: goto 24
      // 20: invokestatic _cv.a (Loov;)Loov;
      // 23: athrow
      // 24: istore 7
      // 26: iload 5
      // 28: iload 6
      // 2a: ifeq 60
      // 2d: ifle 57
      // 30: goto 37
      // 33: invokestatic _cv.a (Loov;)Loov;
      // 36: athrow
      // 37: iload 7
      // 39: bipush 2
      // 3a: iload 5
      // 3c: ishl
      // 3d: isub
      // 3e: istore 7
      // 40: iload 7
      // 42: iload 6
      // 44: ifeq 60
      // 47: bipush 10
      // 49: if_icmpge 57
      // 4c: goto 53
      // 4f: invokestatic _cv.a (Loov;)Loov;
      // 52: athrow
      // 53: bipush 10
      // 55: istore 7
      // 57: aload 1
      // 58: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 5b: iload 7
      // 5d: invokevirtual java/util/Random.nextInt (I)I
      // 60: iload 6
      // 62: ifeq 97
      // 65: ifne 90
      // 68: goto 6f
      // 6b: invokestatic _cv.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 0
      // 70: aload 3
      // 71: aload 1
      // 72: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 75: iload 5
      // 77: invokevirtual _cv.j39 (Lzfz;Ljava/util/Random;I)Lu7m;
      // 7a: astore 8
      // 7c: aload 1
      // 7d: aload 2
      // 7e: new erg
      // 81: dup
      // 82: aload 8
      // 84: bipush 1
      // 85: aload 0
      // 86: aload 3
      // 87: invokevirtual _cv.crg (Lzfz;)I
      // 8a: invokespecial erg.<init> (Lu7m;II)V
      // 8d: invokestatic _cv.ymu (Lt9d;Lmew;Lerg;)V
      // 90: sipush 200
      // 93: istore 7
      // 95: iload 5
      // 97: iload 6
      // 99: ifeq b2
      // 9c: ifle ce
      // 9f: goto a6
      // a2: invokestatic _cv.a (Loov;)Loov;
      // a5: athrow
      // a6: iload 7
      // a8: bipush 10
      // aa: iload 5
      // ac: ishl
      // ad: isub
      // ae: istore 7
      // b0: iload 7
      // b2: iload 6
      // b4: ifeq cc
      // b7: bipush 40
      // b9: if_icmpge ce
      // bc: goto c3
      // bf: invokestatic _cv.a (Loov;)Loov;
      // c2: athrow
      // c3: bipush 40
      // c5: goto cc
      // c8: invokestatic _cv.a (Loov;)Loov;
      // cb: athrow
      // cc: istore 7
      // ce: aload 0
      // cf: aload 1
      // d0: aload 2
      // d1: aload 3
      // d2: iload 7
      // d4: invokevirtual _cv.j00 (Lt9d;Lmew;Lzfz;I)V
      // d7: return
   }

   public void j00(OpaquePredicate var1, mew var2, zfz var3, int var4) {
   }

   public int b9m(zfz var1) {
      return 20;
   }

   @Override
   public boolean ko5() {
      int var1 = OpaquePredicate.c();

      try {
         if (var1 != 0) {
            return this.d0y;
         }

         if (!this.d0y) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public void gku(boolean var1) {
      this.b6a = (boolean)var1;
      int var10000 = OpaquePredicate.b();
      this.d0y = (boolean)var1;
      int var2 = var10000;

      byte var10001;
      label22: {
         label21: {
            try {
               var4 = this;
               var10001 = var1;
               if (var2 == 0) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10001 = 1;
            break label22;
         }

         var10001 = 0;
      }

      var4.sqi = var10001;
   }

   @Override
   public w51 w3x() {
      try {
         if (this.b6a) {
            return w51.oja;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return w51.exw;
   }

   @Override
   public boolean zrr() {
      return false;
   }

   public abstract x54$lti d14(int var1);

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5314318927755335668L, -1024058960903675849L, MethodHandles.lookup().lookupClass()).a(162678159981601L);
      // $VF: monitorexit
      long var10 = var10000 ^ 122486163722437L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[2];
      int var6 = 0;
      String var5 = "\u0011\u0097Õ¿wèy\u000b\u0099¦ýRùK\\n\u0010\u008c¥¬V\u001fU.´2{\f\rõôãÂ";
      int var7 = "\u0011\u0097Õ¿wèy\u000b\u0099¦ýRùK\\n\u0010\u008c¥¬V\u001fU.´2{\f\rõôãÂ".length();
      char var4 = 16;
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            g07 = h76.d_1(var8[1]);
            sdu = h76.d_1(var8[0]);
            return;
         }

         var4 = var5.charAt(var3);
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String b(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }
}
