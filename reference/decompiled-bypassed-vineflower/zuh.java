import com.google.common.collect.Lists;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class zuh extends cdu {
   private static final Logger io3;
   private static final String[] qhx;
   private static final List wjx;
   private static final long a;
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Override
   public boolean v3g(t9d param1, Random param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zuh.a J
      // 003: ldc2_w 44263863957023
      // 006: lxor
      // 007: lstore 4
      // 009: bipush 3
      // 00a: istore 7
      // 00c: aload 2
      // 00d: bipush 2
      // 00e: invokevirtual java/util/Random.nextInt (I)I
      // 011: bipush 2
      // 012: iadd
      // 013: istore 8
      // 015: iload 8
      // 017: ineg
      // 018: bipush 1
      // 019: isub
      // 01a: istore 9
      // 01c: iload 8
      // 01e: bipush 1
      // 01f: iadd
      // 020: istore 10
      // 022: invokestatic t9d.c ()I
      // 025: bipush -1
      // 026: istore 11
      // 028: istore 6
      // 02a: bipush 4
      // 02b: istore 12
      // 02d: aload 2
      // 02e: bipush 2
      // 02f: invokevirtual java/util/Random.nextInt (I)I
      // 032: bipush 2
      // 033: iadd
      // 034: istore 13
      // 036: iload 13
      // 038: ineg
      // 039: bipush 1
      // 03a: isub
      // 03b: istore 14
      // 03d: iload 13
      // 03f: bipush 1
      // 040: iadd
      // 041: istore 15
      // 043: bipush 0
      // 044: istore 16
      // 046: iload 9
      // 048: istore 17
      // 04a: iload 17
      // 04c: iload 10
      // 04e: if_icmpgt 1ba
      // 051: bipush -1
      // 052: iload 6
      // 054: ifne 1bc
      // 057: istore 18
      // 059: iload 18
      // 05b: bipush 4
      // 05c: if_icmpgt 1b2
      // 05f: iload 14
      // 061: iload 6
      // 063: ifne 04c
      // 066: istore 19
      // 068: iload 19
      // 06a: iload 15
      // 06c: if_icmpgt 1aa
      // 06f: aload 3
      // 070: iload 17
      // 072: iload 18
      // 074: iload 19
      // 076: invokevirtual mew.ec4 (III)Lmew;
      // 079: astore 20
      // 07b: aload 1
      // 07c: aload 20
      // 07e: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 081: invokeinterface zfz.r_y ()Le0x; 1
      // 086: invokevirtual e0x.p1r ()Lp3y;
      // 089: astore 21
      // 08b: aload 21
      // 08d: invokevirtual p3y.gk6 ()Z
      // 090: istore 22
      // 092: iload 18
      // 094: bipush -1
      // 095: iload 6
      // 097: ifne 05c
      // 09a: iload 6
      // 09c: ifne 0ca
      // 09f: if_icmpne 0c7
      // 0a2: goto 0a9
      // 0a5: invokestatic zuh.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: iload 22
      // 0ab: iload 6
      // 0ad: ifne 0c9
      // 0b0: goto 0b7
      // 0b3: invokestatic zuh.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: ifne 0c7
      // 0ba: goto 0c1
      // 0bd: invokestatic zuh.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: bipush 0
      // 0c2: ireturn
      // 0c3: invokestatic zuh.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: iload 18
      // 0c9: bipush 4
      // 0ca: iload 6
      // 0cc: ifne 107
      // 0cf: if_icmpne 0f7
      // 0d2: goto 0d9
      // 0d5: invokestatic zuh.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: iload 22
      // 0db: iload 6
      // 0dd: ifne 0f9
      // 0e0: goto 0e7
      // 0e3: invokestatic zuh.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: ifne 0f7
      // 0ea: goto 0f1
      // 0ed: invokestatic zuh.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: bipush 0
      // 0f2: ireturn
      // 0f3: invokestatic zuh.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: iload 17
      // 0f9: iload 6
      // 0fb: ifne 161
      // 0fe: iload 9
      // 100: goto 107
      // 103: invokestatic zuh.a (Loov;)Loov;
      // 106: athrow
      // 107: if_icmpeq 158
      // 10a: iload 17
      // 10c: iload 6
      // 10e: ifne 161
      // 111: goto 118
      // 114: invokestatic zuh.a (Loov;)Loov;
      // 117: athrow
      // 118: iload 10
      // 11a: if_icmpeq 158
      // 11d: goto 124
      // 120: invokestatic zuh.a (Loov;)Loov;
      // 123: athrow
      // 124: iload 19
      // 126: iload 6
      // 128: ifne 161
      // 12b: goto 132
      // 12e: invokestatic zuh.a (Loov;)Loov;
      // 131: athrow
      // 132: iload 14
      // 134: if_icmpeq 158
      // 137: goto 13e
      // 13a: invokestatic zuh.a (Loov;)Loov;
      // 13d: athrow
      // 13e: iload 19
      // 140: iload 6
      // 142: ifne 161
      // 145: goto 14c
      // 148: invokestatic zuh.a (Loov;)Loov;
      // 14b: athrow
      // 14c: iload 15
      // 14e: if_icmpne 1a2
      // 151: goto 158
      // 154: invokestatic zuh.a (Loov;)Loov;
      // 157: athrow
      // 158: iload 18
      // 15a: goto 161
      // 15d: invokestatic zuh.a (Loov;)Loov;
      // 160: athrow
      // 161: iload 6
      // 163: ifne 17d
      // 166: ifne 1a2
      // 169: goto 170
      // 16c: invokestatic zuh.a (Loov;)Loov;
      // 16f: athrow
      // 170: aload 1
      // 171: aload 20
      // 173: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 176: goto 17d
      // 179: invokestatic zuh.a (Loov;)Loov;
      // 17c: athrow
      // 17d: iload 6
      // 17f: ifne 19c
      // 182: ifeq 1a2
      // 185: goto 18c
      // 188: invokestatic zuh.a (Loov;)Loov;
      // 18b: athrow
      // 18c: aload 1
      // 18d: aload 20
      // 18f: invokevirtual mew.nuv ()Lmew;
      // 192: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 195: goto 19c
      // 198: invokestatic zuh.a (Loov;)Loov;
      // 19b: athrow
      // 19c: ifeq 1a2
      // 19f: iinc 16 1
      // 1a2: iinc 19 1
      // 1a5: iload 6
      // 1a7: ifeq 068
      // 1aa: iinc 18 1
      // 1ad: iload 6
      // 1af: ifeq 059
      // 1b2: iinc 17 1
      // 1b5: iload 6
      // 1b7: ifeq 04a
      // 1ba: iload 16
      // 1bc: iload 6
      // 1be: ifne 5fa
      // 1c1: bipush 1
      // 1c2: if_icmplt 5f9
      // 1c5: goto 1cc
      // 1c8: invokestatic zuh.a (Loov;)Loov;
      // 1cb: athrow
      // 1cc: iload 16
      // 1ce: iload 6
      // 1d0: ifne 5fa
      // 1d3: goto 1da
      // 1d6: invokestatic zuh.a (Loov;)Loov;
      // 1d9: athrow
      // 1da: bipush 5
      // 1db: if_icmpgt 5f9
      // 1de: goto 1e5
      // 1e1: invokestatic zuh.a (Loov;)Loov;
      // 1e4: athrow
      // 1e5: iload 9
      // 1e7: istore 17
      // 1e9: iload 17
      // 1eb: iload 10
      // 1ed: if_icmpgt 3fb
      // 1f0: bipush 3
      // 1f1: iload 6
      // 1f3: ifne 3fc
      // 1f6: istore 18
      // 1f8: iload 18
      // 1fa: bipush -1
      // 1fb: if_icmplt 3f3
      // 1fe: iload 14
      // 200: iload 6
      // 202: ifne 1eb
      // 205: istore 19
      // 207: iload 19
      // 209: iload 15
      // 20b: if_icmpgt 3eb
      // 20e: aload 3
      // 20f: iload 17
      // 211: iload 18
      // 213: iload 19
      // 215: invokevirtual mew.ec4 (III)Lmew;
      // 218: astore 20
      // 21a: iload 17
      // 21c: iload 6
      // 21e: ifne 2f5
      // 221: iload 9
      // 223: iload 6
      // 225: ifne 1fb
      // 228: goto 22f
      // 22b: invokestatic zuh.a (Loov;)Loov;
      // 22e: athrow
      // 22f: if_icmpeq 2e9
      // 232: iload 18
      // 234: iload 6
      // 236: ifne 2f5
      // 239: goto 240
      // 23c: invokestatic zuh.a (Loov;)Loov;
      // 23f: athrow
      // 240: bipush -1
      // 241: if_icmpeq 2e9
      // 244: goto 24b
      // 247: invokestatic zuh.a (Loov;)Loov;
      // 24a: athrow
      // 24b: iload 19
      // 24d: iload 6
      // 24f: ifne 2f5
      // 252: goto 259
      // 255: invokestatic zuh.a (Loov;)Loov;
      // 258: athrow
      // 259: iload 14
      // 25b: if_icmpeq 2e9
      // 25e: goto 265
      // 261: invokestatic zuh.a (Loov;)Loov;
      // 264: athrow
      // 265: iload 17
      // 267: iload 6
      // 269: ifne 2f5
      // 26c: goto 273
      // 26f: invokestatic zuh.a (Loov;)Loov;
      // 272: athrow
      // 273: iload 10
      // 275: if_icmpeq 2e9
      // 278: goto 27f
      // 27b: invokestatic zuh.a (Loov;)Loov;
      // 27e: athrow
      // 27f: iload 18
      // 281: iload 6
      // 283: ifne 2f5
      // 286: goto 28d
      // 289: invokestatic zuh.a (Loov;)Loov;
      // 28c: athrow
      // 28d: bipush 4
      // 28e: if_icmpeq 2e9
      // 291: goto 298
      // 294: invokestatic zuh.a (Loov;)Loov;
      // 297: athrow
      // 298: iload 19
      // 29a: iload 6
      // 29c: ifne 2f5
      // 29f: goto 2a6
      // 2a2: invokestatic zuh.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: iload 15
      // 2a8: if_icmpeq 2e9
      // 2ab: goto 2b2
      // 2ae: invokestatic zuh.a (Loov;)Loov;
      // 2b1: athrow
      // 2b2: aload 1
      // 2b3: aload 20
      // 2b5: iload 6
      // 2b7: ifne 2e0
      // 2ba: goto 2c1
      // 2bd: invokestatic zuh.a (Loov;)Loov;
      // 2c0: athrow
      // 2c1: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 2c4: invokeinterface zfz.r_y ()Le0x; 1
      // 2c9: getstatic ox_.cug Lhrd;
      // 2cc: if_acmpeq 3e3
      // 2cf: goto 2d6
      // 2d2: invokestatic zuh.a (Loov;)Loov;
      // 2d5: athrow
      // 2d6: aload 1
      // 2d7: aload 20
      // 2d9: goto 2e0
      // 2dc: invokestatic zuh.a (Loov;)Loov;
      // 2df: athrow
      // 2e0: invokevirtual t9d.i6x (Lmew;)Z
      // 2e3: pop
      // 2e4: iload 6
      // 2e6: ifeq 3e3
      // 2e9: aload 20
      // 2eb: invokevirtual mew.getY ()I
      // 2ee: goto 2f5
      // 2f1: invokestatic zuh.a (Loov;)Loov;
      // 2f4: athrow
      // 2f5: iload 6
      // 2f7: ifne 365
      // 2fa: iflt 341
      // 2fd: goto 304
      // 300: invokestatic zuh.a (Loov;)Loov;
      // 303: athrow
      // 304: aload 1
      // 305: aload 20
      // 307: invokevirtual mew.eve ()Lmew;
      // 30a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 30d: invokeinterface zfz.r_y ()Le0x; 1
      // 312: invokevirtual e0x.p1r ()Lp3y;
      // 315: invokevirtual p3y.gk6 ()Z
      // 318: iload 6
      // 31a: ifne 365
      // 31d: goto 324
      // 320: invokestatic zuh.a (Loov;)Loov;
      // 323: athrow
      // 324: ifne 341
      // 327: goto 32e
      // 32a: invokestatic zuh.a (Loov;)Loov;
      // 32d: athrow
      // 32e: aload 1
      // 32f: aload 20
      // 331: invokevirtual t9d.i6x (Lmew;)Z
      // 334: pop
      // 335: iload 6
      // 337: ifeq 3e3
      // 33a: goto 341
      // 33d: invokestatic zuh.a (Loov;)Loov;
      // 340: athrow
      // 341: aload 1
      // 342: aload 20
      // 344: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 347: invokeinterface zfz.r_y ()Le0x; 1
      // 34c: iload 6
      // 34e: ifne 37a
      // 351: goto 358
      // 354: invokestatic zuh.a (Loov;)Loov;
      // 357: athrow
      // 358: invokevirtual e0x.p1r ()Lp3y;
      // 35b: invokevirtual p3y.gk6 ()Z
      // 35e: goto 365
      // 361: invokestatic zuh.a (Loov;)Loov;
      // 364: athrow
      // 365: ifeq 3e3
      // 368: aload 1
      // 369: aload 20
      // 36b: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 36e: invokeinterface zfz.r_y ()Le0x; 1
      // 373: goto 37a
      // 376: invokestatic zuh.a (Loov;)Loov;
      // 379: athrow
      // 37a: getstatic ox_.cug Lhrd;
      // 37d: if_acmpeq 3e3
      // 380: iload 18
      // 382: iload 6
      // 384: ifne 3e2
      // 387: goto 38e
      // 38a: invokestatic zuh.a (Loov;)Loov;
      // 38d: athrow
      // 38e: bipush -1
      // 38f: if_icmpne 3ce
      // 392: goto 399
      // 395: invokestatic zuh.a (Loov;)Loov;
      // 398: athrow
      // 399: aload 2
      // 39a: bipush 4
      // 39b: invokevirtual java/util/Random.nextInt (I)I
      // 39e: iload 6
      // 3a0: ifne 3e2
      // 3a3: goto 3aa
      // 3a6: invokestatic zuh.a (Loov;)Loov;
      // 3a9: athrow
      // 3aa: ifeq 3ce
      // 3ad: goto 3b4
      // 3b0: invokestatic zuh.a (Loov;)Loov;
      // 3b3: athrow
      // 3b4: aload 1
      // 3b5: aload 20
      // 3b7: getstatic ox_.jwk Le0x;
      // 3ba: invokevirtual e0x.l4i ()Lzfz;
      // 3bd: bipush 2
      // 3be: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 3c1: pop
      // 3c2: iload 6
      // 3c4: ifeq 3e3
      // 3c7: goto 3ce
      // 3ca: invokestatic zuh.a (Loov;)Loov;
      // 3cd: athrow
      // 3ce: aload 1
      // 3cf: aload 20
      // 3d1: getstatic ox_.a3_ Le0x;
      // 3d4: invokevirtual e0x.l4i ()Lzfz;
      // 3d7: bipush 2
      // 3d8: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 3db: goto 3e2
      // 3de: invokestatic zuh.a (Loov;)Loov;
      // 3e1: athrow
      // 3e2: pop
      // 3e3: iinc 19 1
      // 3e6: iload 6
      // 3e8: ifeq 207
      // 3eb: iinc 18 -1
      // 3ee: iload 6
      // 3f0: ifeq 1f8
      // 3f3: iinc 17 1
      // 3f6: iload 6
      // 3f8: ifeq 1e9
      // 3fb: bipush 0
      // 3fc: istore 17
      // 3fe: iload 17
      // 400: bipush 2
      // 401: if_icmpge 549
      // 404: bipush 0
      // 405: iload 6
      // 407: ifne 555
      // 40a: istore 18
      // 40c: iload 18
      // 40e: bipush 3
      // 40f: if_icmpge 541
      // 412: aload 3
      // 413: invokevirtual mew.getX ()I
      // 416: aload 2
      // 417: iload 8
      // 419: bipush 2
      // 41a: imul
      // 41b: bipush 1
      // 41c: iadd
      // 41d: invokevirtual java/util/Random.nextInt (I)I
      // 420: iadd
      // 421: iload 8
      // 423: isub
      // 424: istore 19
      // 426: aload 3
      // 427: invokevirtual mew.getY ()I
      // 42a: istore 20
      // 42c: aload 3
      // 42d: invokevirtual mew.getZ ()I
      // 430: aload 2
      // 431: iload 13
      // 433: bipush 2
      // 434: imul
      // 435: bipush 1
      // 436: iadd
      // 437: invokevirtual java/util/Random.nextInt (I)I
      // 43a: iadd
      // 43b: iload 13
      // 43d: isub
      // 43e: istore 21
      // 440: new mew
      // 443: dup
      // 444: iload 19
      // 446: iload 20
      // 448: iload 21
      // 44a: invokespecial mew.<init> (III)V
      // 44d: astore 22
      // 44f: iload 6
      // 451: ifne 53c
      // 454: aload 1
      // 455: aload 22
      // 457: invokevirtual t9d.isAirBlock (Lmew;)Z
      // 45a: iload 6
      // 45c: ifne 400
      // 45f: goto 466
      // 462: invokestatic zuh.a (Loov;)Loov;
      // 465: athrow
      // 466: ifeq 532
      // 469: bipush 0
      // 46a: istore 23
      // 46c: getstatic vt2$unz.fzl Lvt2$unz;
      // 46f: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 472: astore 24
      // 474: aload 24
      // 476: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 47b: ifeq 4b7
      // 47e: aload 24
      // 480: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 485: checkcast vt2
      // 488: astore 25
      // 48a: aload 1
      // 48b: aload 22
      // 48d: aload 25
      // 48f: invokevirtual mew.offset (Lvt2;)Lmew;
      // 492: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 495: invokeinterface zfz.r_y ()Le0x; 1
      // 49a: invokevirtual e0x.p1r ()Lp3y;
      // 49d: invokevirtual p3y.gk6 ()Z
      // 4a0: iload 6
      // 4a2: ifne 4b9
      // 4a5: ifeq 4b2
      // 4a8: goto 4af
      // 4ab: invokestatic zuh.a (Loov;)Loov;
      // 4ae: athrow
      // 4af: iinc 23 1
      // 4b2: iload 6
      // 4b4: ifeq 474
      // 4b7: iload 23
      // 4b9: iload 6
      // 4bb: ifne 4e6
      // 4be: bipush 1
      // 4bf: if_icmpne 532
      // 4c2: goto 4c9
      // 4c5: invokestatic zuh.a (Loov;)Loov;
      // 4c8: athrow
      // 4c9: aload 1
      // 4ca: aload 22
      // 4cc: getstatic ox_.cug Lhrd;
      // 4cf: aload 1
      // 4d0: aload 22
      // 4d2: getstatic ox_.cug Lhrd;
      // 4d5: invokevirtual hrd.l4i ()Lzfz;
      // 4d8: invokevirtual hrd.a1g (Lt9d;Lmew;Lzfz;)Lzfz;
      // 4db: bipush 2
      // 4dc: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 4df: goto 4e6
      // 4e2: invokestatic zuh.a (Loov;)Loov;
      // 4e5: athrow
      // 4e6: pop
      // 4e7: getstatic zuh.wjx Ljava/util/List;
      // 4ea: bipush 1
      // 4eb: anewarray 148
      // 4ee: dup
      // 4ef: bipush 0
      // 4f0: getstatic xbr.frz Lnmo;
      // 4f3: aload 2
      // 4f4: invokevirtual nmo.z0_ (Ljava/util/Random;)Lypi;
      // 4f7: aastore
      // 4f8: invokestatic ypi.voc (Ljava/util/List;[Lypi;)Ljava/util/List;
      // 4fb: astore 24
      // 4fd: aload 1
      // 4fe: aload 22
      // 500: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 503: astore 25
      // 505: iload 6
      // 507: ifne 544
      // 50a: aload 25
      // 50c: instanceof net/minecraft/tileentity/TileEntityChest
      // 50f: ifeq 541
      // 512: goto 519
      // 515: invokestatic zuh.a (Loov;)Loov;
      // 518: athrow
      // 519: aload 2
      // 51a: aload 24
      // 51c: aload 25
      // 51e: checkcast net/minecraft/tileentity/TileEntityChest
      // 521: bipush 8
      // 523: invokestatic ypi.hut (Ljava/util/Random;Ljava/util/List;Lrsi;I)V
      // 526: iload 6
      // 528: ifeq 541
      // 52b: goto 532
      // 52e: invokestatic zuh.a (Loov;)Loov;
      // 531: athrow
      // 532: iinc 18 1
      // 535: goto 53c
      // 538: invokestatic zuh.a (Loov;)Loov;
      // 53b: athrow
      // 53c: iload 6
      // 53e: ifeq 40c
      // 541: iinc 17 1
      // 544: iload 6
      // 546: ifeq 3fe
      // 549: aload 1
      // 54a: aload 3
      // 54b: getstatic ox_.jvm Le0x;
      // 54e: invokevirtual e0x.l4i ()Lzfz;
      // 551: bipush 2
      // 552: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 555: pop
      // 556: aload 1
      // 557: aload 3
      // 558: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 55b: astore 17
      // 55d: aload 17
      // 55f: iload 6
      // 561: ifne 57a
      // 564: instanceof net/minecraft/tileentity/TileEntityMobSpawner
      // 567: ifeq 58d
      // 56a: goto 571
      // 56d: invokestatic zuh.a (Loov;)Loov;
      // 570: athrow
      // 571: aload 17
      // 573: goto 57a
      // 576: invokestatic zuh.a (Loov;)Loov;
      // 579: athrow
      // 57a: checkcast net/minecraft/tileentity/TileEntityMobSpawner
      // 57d: invokevirtual net/minecraft/tileentity/TileEntityMobSpawner.ebe ()Laih;
      // 580: aload 0
      // 581: aload 2
      // 582: invokespecial zuh.frq (Ljava/util/Random;)Ljava/lang/String;
      // 585: invokevirtual aih.ugq (Ljava/lang/String;)V
      // 588: iload 6
      // 58a: ifeq 5f7
      // 58d: getstatic zuh.io3 Lorg/apache/logging/log4j/Logger;
      // 590: new java/lang/StringBuilder
      // 593: dup
      // 594: invokespecial java/lang/StringBuilder.<init> ()V
      // 597: sipush 31109
      // 59a: ldc2_w 4394400070724828362
      // 59d: lload 4
      // 59f: lxor
      // 5a0: invokedynamic p (IJ)Ljava/lang/String; bsm=zuh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a5: nop
      // 5a6: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5a9: aload 3
      // 5aa: invokevirtual mew.getX ()I
      // 5ad: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5b0: sipush 25397
      // 5b3: ldc2_w 803112687532451451
      // 5b6: lload 4
      // 5b8: lxor
      // 5b9: invokedynamic p (IJ)Ljava/lang/String; bsm=zuh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5be: nop
      // 5bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5c2: aload 3
      // 5c3: invokevirtual mew.getY ()I
      // 5c6: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5c9: sipush 21253
      // 5cc: ldc2_w 5993268136899319369
      // 5cf: lload 4
      // 5d1: lxor
      // 5d2: invokedynamic p (IJ)Ljava/lang/String; bsm=zuh.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d7: nop
      // 5d8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5db: aload 3
      // 5dc: invokevirtual mew.getZ ()I
      // 5df: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 5e2: ldc ")"
      // 5e4: nop
      // 5e5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 5e8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 5eb: invokeinterface org/apache/logging/log4j/Logger.error (Ljava/lang/String;)V 2
      // 5f0: goto 5f7
      // 5f3: invokestatic zuh.a (Loov;)Loov;
      // 5f6: athrow
      // 5f7: bipush 1
      // 5f8: ireturn
      // 5f9: bipush 0
      // 5fa: ireturn
   }

   private String frq(Random var1) {
      return qhx[var1.nextInt(qhx.length)];
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-6859677553916943996L, -2162473155010633331L, MethodHandles.lookup().lookupClass()).a(105793133756476L);
      // $VF: monitorexit
      a = var10000;
      long var9 = a ^ 51293410212425L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[7];
      int var5 = 0;
      String var4 = "3W+'\u0095»6{¥/Ï5k\u0085|ì@f»ì'Å*\u001ew)°àI\u008eùZ\u0002\u000f\u00940¥W\u0000\u0018·[\u0011\u00adl\u001b\u008fEÀx\n~\u0094\u0099\u0017ûK\u0098U¥H\u0085\u0002ú \u0092ò`ñÃ\u008elØ'f¨Áú\u0003\u0082R\u0010(@ä\u0091AÏý»ÂjÃh`þGö\u0010ahÝ \u009bÓ0ï\u009f\u0010Úq<á\u009aÞ\u0010{\u0018y\u0015\u009b \fÅ~\u008fGq©\u008c\u001a\u0084";
      int var6 = "3W+'\u0095»6{¥/Ï5k\u0085|ì@f»ì'Å*\u001ew)°àI\u008eùZ\u0002\u000f\u00940¥W\u0000\u0018·[\u0011\u00adl\u001b\u008fEÀx\n~\u0094\u0099\u0017ûK\u0098U¥H\u0085\u0002ú \u0092ò`ñÃ\u008elØ'f¨Áú\u0003\u0082R\u0010(@ä\u0091AÏý»ÂjÃh`þGö\u0010ahÝ \u009bÓ0ï\u009f\u0010Úq<á\u009aÞ\u0010{\u0018y\u0015\u009b \fÅ~\u008fGq©\u008c\u001a\u0084"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     b = var7;
                     c = new String[7];
                     io3 = LogManager.getLogger();
                     qhx = new String[]{
                        a<"p">(8561, 5426833643164690543L ^ var9),
                        a<"p">(25809, 4111857158612692426L ^ var9),
                        a<"p">(19474, 6313370312260158734L ^ var9),
                        a<"p">(19747, 497765412628988990L ^ var9)
                     };
                     wjx = Lists.newArrayList(
                        new ypi[]{
                           new ypi(xbr.fpq, 0, 1, 1, 10),
                           new ypi(xbr.icz, 0, 1, 4, 10),
                           new ypi(xbr.nfb, 0, 1, 1, 10),
                           new ypi(xbr.iqq, 0, 1, 4, 10),
                           new ypi(xbr.hgt, 0, 1, 4, 10),
                           new ypi(xbr.eij, 0, 1, 4, 10),
                           new ypi(xbr.xxz, 0, 1, 1, 10),
                           new ypi(xbr.yyh, 0, 1, 1, 1),
                           new ypi(xbr.deg, 0, 1, 4, 10),
                           new ypi(xbr.o30, 0, 1, 1, 4),
                           new ypi(xbr.b77, 0, 1, 1, 4),
                           new ypi(xbr.uh6, 0, 1, 1, 10),
                           new ypi(xbr.fps, 0, 1, 1, 2),
                           new ypi(xbr.mhm, 0, 1, 1, 5),
                           new ypi(xbr.krl, 0, 1, 1, 1)
                        }
                     );
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u0015Øl6U\u0092µEañ±`\u008a¶Ä§\u0018Oì\u0083ê÷¡[»ö\u0095\u0000ÝË\u0082T\u0087``Ú\"Uä)Ó";
                  var6 = "\u0015Øl6U\u0092µEañ±`\u008a¶Ä§\u0018Oì\u0083ê÷¡[»ö\u0095\u0000ÝË\u0082T\u0087``Ú\"Uä)Ó".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10907;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("zuh", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("zuh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
