import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.logging.log4j.LogManager;

public class ebo extends ttt {
   private static final long a;
   private static final String f;

   public ebo(long var1, ttt var3, ttt var4) {
      super(var1);
      this.ty5 = var3;
      this.jo_ = var4;
   }

   @Override
   public int[] ub9(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic ebo.a J
      // 003: ldc2_w 127792073542285
      // 006: lxor
      // 007: lstore 5
      // 009: aload 0
      // 00a: getfield ebo.ty5 Lttt;
      // 00d: iload 1
      // 00e: bipush 1
      // 00f: isub
      // 010: iload 2
      // 011: bipush 1
      // 012: isub
      // 013: iload 3
      // 014: bipush 2
      // 015: iadd
      // 016: iload 4
      // 018: bipush 2
      // 019: iadd
      // 01a: invokevirtual ttt.ub9 (IIII)[I
      // 01d: astore 8
      // 01f: invokestatic t9d.c ()I
      // 022: aload 0
      // 023: getfield ebo.jo_ Lttt;
      // 026: iload 1
      // 027: bipush 1
      // 028: isub
      // 029: iload 2
      // 02a: bipush 1
      // 02b: isub
      // 02c: iload 3
      // 02d: bipush 2
      // 02e: iadd
      // 02f: iload 4
      // 031: bipush 2
      // 032: iadd
      // 033: invokevirtual ttt.ub9 (IIII)[I
      // 036: astore 9
      // 038: istore 7
      // 03a: iload 3
      // 03b: iload 4
      // 03d: imul
      // 03e: invokestatic z97.web (I)[I
      // 041: astore 10
      // 043: bipush 0
      // 044: istore 11
      // 046: iload 11
      // 048: iload 4
      // 04a: if_icmpge 666
      // 04d: bipush 0
      // 04e: istore 12
      // 050: iload 12
      // 052: iload 3
      // 053: if_icmpge 65e
      // 056: aload 0
      // 057: iload 12
      // 059: iload 1
      // 05a: iadd
      // 05b: i2l
      // 05c: iload 11
      // 05e: iload 2
      // 05f: iadd
      // 060: i2l
      // 061: invokevirtual ebo.drx (JJ)V
      // 064: aload 8
      // 066: iload 12
      // 068: bipush 1
      // 069: iadd
      // 06a: iload 11
      // 06c: bipush 1
      // 06d: iadd
      // 06e: iload 3
      // 06f: bipush 2
      // 070: iadd
      // 071: imul
      // 072: iadd
      // 073: iaload
      // 074: istore 13
      // 076: aload 9
      // 078: iload 12
      // 07a: bipush 1
      // 07b: iadd
      // 07c: iload 11
      // 07e: bipush 1
      // 07f: iadd
      // 080: iload 3
      // 081: bipush 2
      // 082: iadd
      // 083: imul
      // 084: iadd
      // 085: iaload
      // 086: istore 14
      // 088: iload 14
      // 08a: bipush 2
      // 08b: isub
      // 08c: bipush 29
      // 08e: irem
      // 08f: iload 7
      // 091: ifne 048
      // 094: iload 7
      // 096: ifne 0a4
      // 099: ifne 0a7
      // 09c: goto 0a3
      // 09f: invokestatic ebo.a (Loov;)Loov;
      // 0a2: athrow
      // 0a3: bipush 1
      // 0a4: goto 0a8
      // 0a7: bipush 0
      // 0a8: istore 15
      // 0aa: iload 13
      // 0ac: iload 7
      // 0ae: ifne 0e5
      // 0b1: sipush 255
      // 0b4: if_icmple 0e3
      // 0b7: goto 0be
      // 0ba: invokestatic ebo.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: getstatic ebo.ry7 Lorg/apache/logging/log4j/Logger;
      // 0c1: new java/lang/StringBuilder
      // 0c4: dup
      // 0c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c8: getstatic ebo.f Ljava/lang/String;
      // 0cb: nop
      // 0cc: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0cf: iload 13
      // 0d1: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0d7: invokeinterface org/apache/logging/log4j/Logger.debug (Ljava/lang/String;)V 2
      // 0dc: goto 0e3
      // 0df: invokestatic ebo.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: iload 13
      // 0e5: iload 7
      // 0e7: ifne 199
      // 0ea: ifeq 18d
      // 0ed: goto 0f4
      // 0f0: invokestatic ebo.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: iload 14
      // 0f6: iload 7
      // 0f8: ifne 199
      // 0fb: goto 102
      // 0fe: invokestatic ebo.a (Loov;)Loov;
      // 101: athrow
      // 102: bipush 2
      // 103: if_icmplt 18d
      // 106: goto 10d
      // 109: invokestatic ebo.a (Loov;)Loov;
      // 10c: athrow
      // 10d: iload 14
      // 10f: bipush 2
      // 110: isub
      // 111: bipush 29
      // 113: irem
      // 114: iload 7
      // 116: ifne 199
      // 119: goto 120
      // 11c: invokestatic ebo.a (Loov;)Loov;
      // 11f: athrow
      // 120: bipush 1
      // 121: if_icmpne 18d
      // 124: goto 12b
      // 127: invokestatic ebo.a (Loov;)Loov;
      // 12a: athrow
      // 12b: iload 13
      // 12d: iload 7
      // 12f: ifne 199
      // 132: goto 139
      // 135: invokestatic ebo.a (Loov;)Loov;
      // 138: athrow
      // 139: sipush 128
      // 13c: if_icmpge 18d
      // 13f: goto 146
      // 142: invokestatic ebo.a (Loov;)Loov;
      // 145: athrow
      // 146: iload 13
      // 148: sipush 128
      // 14b: iadd
      // 14c: invokestatic gyu.lxy (I)Lgyu;
      // 14f: ifnull 175
      // 152: goto 159
      // 155: invokestatic ebo.a (Loov;)Loov;
      // 158: athrow
      // 159: aload 10
      // 15b: iload 12
      // 15d: iload 11
      // 15f: iload 3
      // 160: imul
      // 161: iadd
      // 162: iload 13
      // 164: sipush 128
      // 167: iadd
      // 168: iastore
      // 169: iload 7
      // 16b: ifeq 656
      // 16e: goto 175
      // 171: invokestatic ebo.a (Loov;)Loov;
      // 174: athrow
      // 175: aload 10
      // 177: iload 12
      // 179: iload 11
      // 17b: iload 3
      // 17c: imul
      // 17d: iadd
      // 17e: iload 13
      // 180: iastore
      // 181: iload 7
      // 183: ifeq 656
      // 186: goto 18d
      // 189: invokestatic ebo.a (Loov;)Loov;
      // 18c: athrow
      // 18d: aload 0
      // 18e: bipush 3
      // 18f: invokevirtual ebo.nbt (I)I
      // 192: goto 199
      // 195: invokestatic ebo.a (Loov;)Loov;
      // 198: athrow
      // 199: iload 7
      // 19b: ifne 1e1
      // 19e: ifeq 1d8
      // 1a1: goto 1a8
      // 1a4: invokestatic ebo.a (Loov;)Loov;
      // 1a7: athrow
      // 1a8: iload 15
      // 1aa: iload 7
      // 1ac: ifne 1e1
      // 1af: goto 1b6
      // 1b2: invokestatic ebo.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: ifne 1d8
      // 1b9: goto 1c0
      // 1bc: invokestatic ebo.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: aload 10
      // 1c2: iload 12
      // 1c4: iload 11
      // 1c6: iload 3
      // 1c7: imul
      // 1c8: iadd
      // 1c9: iload 13
      // 1cb: iastore
      // 1cc: iload 7
      // 1ce: ifeq 656
      // 1d1: goto 1d8
      // 1d4: invokestatic ebo.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: iload 13
      // 1da: goto 1e1
      // 1dd: invokestatic ebo.a (Loov;)Loov;
      // 1e0: athrow
      // 1e1: istore 16
      // 1e3: iload 13
      // 1e5: getstatic gyu._cz Lgyu;
      // 1e8: getfield gyu.mu9 I
      // 1eb: iload 7
      // 1ed: ifne 216
      // 1f0: if_icmpne 207
      // 1f3: goto 1fa
      // 1f6: invokestatic ebo.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: getstatic gyu.txo Lgyu;
      // 1fd: getfield gyu.mu9 I
      // 200: istore 16
      // 202: iload 7
      // 204: ifeq 4d5
      // 207: iload 13
      // 209: getstatic gyu.yo0 Lgyu;
      // 20c: getfield gyu.mu9 I
      // 20f: goto 216
      // 212: invokestatic ebo.a (Loov;)Loov;
      // 215: athrow
      // 216: iload 7
      // 218: ifne 241
      // 21b: if_icmpne 232
      // 21e: goto 225
      // 221: invokestatic ebo.a (Loov;)Loov;
      // 224: athrow
      // 225: getstatic gyu.v8p Lgyu;
      // 228: getfield gyu.mu9 I
      // 22b: istore 16
      // 22d: iload 7
      // 22f: ifeq 4d5
      // 232: iload 13
      // 234: getstatic gyu.hwi Lgyu;
      // 237: getfield gyu.mu9 I
      // 23a: goto 241
      // 23d: invokestatic ebo.a (Loov;)Loov;
      // 240: athrow
      // 241: iload 7
      // 243: ifne 26c
      // 246: if_icmpne 25d
      // 249: goto 250
      // 24c: invokestatic ebo.a (Loov;)Loov;
      // 24f: athrow
      // 250: getstatic gyu.i11 Lgyu;
      // 253: getfield gyu.mu9 I
      // 256: istore 16
      // 258: iload 7
      // 25a: ifeq 4d5
      // 25d: iload 13
      // 25f: getstatic gyu.edi Lgyu;
      // 262: getfield gyu.mu9 I
      // 265: goto 26c
      // 268: invokestatic ebo.a (Loov;)Loov;
      // 26b: athrow
      // 26c: iload 7
      // 26e: ifne 297
      // 271: if_icmpne 288
      // 274: goto 27b
      // 277: invokestatic ebo.a (Loov;)Loov;
      // 27a: athrow
      // 27b: getstatic gyu.wqh Lgyu;
      // 27e: getfield gyu.mu9 I
      // 281: istore 16
      // 283: iload 7
      // 285: ifeq 4d5
      // 288: iload 13
      // 28a: getstatic gyu.u3o Lgyu;
      // 28d: getfield gyu.mu9 I
      // 290: goto 297
      // 293: invokestatic ebo.a (Loov;)Loov;
      // 296: athrow
      // 297: iload 7
      // 299: ifne 2c2
      // 29c: if_icmpne 2b3
      // 29f: goto 2a6
      // 2a2: invokestatic ebo.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: getstatic gyu.hqg Lgyu;
      // 2a9: getfield gyu.mu9 I
      // 2ac: istore 16
      // 2ae: iload 7
      // 2b0: ifeq 4d5
      // 2b3: iload 13
      // 2b5: getstatic gyu.rdu Lgyu;
      // 2b8: getfield gyu.mu9 I
      // 2bb: goto 2c2
      // 2be: invokestatic ebo.a (Loov;)Loov;
      // 2c1: athrow
      // 2c2: iload 7
      // 2c4: ifne 2ed
      // 2c7: if_icmpne 2de
      // 2ca: goto 2d1
      // 2cd: invokestatic ebo.a (Loov;)Loov;
      // 2d0: athrow
      // 2d1: getstatic gyu._c8 Lgyu;
      // 2d4: getfield gyu.mu9 I
      // 2d7: istore 16
      // 2d9: iload 7
      // 2db: ifeq 4d5
      // 2de: iload 13
      // 2e0: getstatic gyu.ki3 Lgyu;
      // 2e3: getfield gyu.mu9 I
      // 2e6: goto 2ed
      // 2e9: invokestatic ebo.a (Loov;)Loov;
      // 2ec: athrow
      // 2ed: iload 7
      // 2ef: ifne 318
      // 2f2: if_icmpne 309
      // 2f5: goto 2fc
      // 2f8: invokestatic ebo.a (Loov;)Loov;
      // 2fb: athrow
      // 2fc: getstatic gyu.gdy Lgyu;
      // 2ff: getfield gyu.mu9 I
      // 302: istore 16
      // 304: iload 7
      // 306: ifeq 4d5
      // 309: iload 13
      // 30b: getstatic gyu.wqh Lgyu;
      // 30e: getfield gyu.mu9 I
      // 311: goto 318
      // 314: invokestatic ebo.a (Loov;)Loov;
      // 317: athrow
      // 318: iload 7
      // 31a: ifne 372
      // 31d: if_icmpne 363
      // 320: goto 327
      // 323: invokestatic ebo.a (Loov;)Loov;
      // 326: athrow
      // 327: aload 0
      // 328: bipush 3
      // 329: invokevirtual ebo.nbt (I)I
      // 32c: iload 7
      // 32e: ifne 35c
      // 331: goto 338
      // 334: invokestatic ebo.a (Loov;)Loov;
      // 337: athrow
      // 338: ifne 34f
      // 33b: goto 342
      // 33e: invokestatic ebo.a (Loov;)Loov;
      // 341: athrow
      // 342: getstatic gyu.v8p Lgyu;
      // 345: getfield gyu.mu9 I
      // 348: istore 16
      // 34a: iload 7
      // 34c: ifeq 4d5
      // 34f: getstatic gyu.yo0 Lgyu;
      // 352: getfield gyu.mu9 I
      // 355: goto 35c
      // 358: invokestatic ebo.a (Loov;)Loov;
      // 35b: athrow
      // 35c: istore 16
      // 35e: iload 7
      // 360: ifeq 4d5
      // 363: iload 13
      // 365: getstatic gyu.rv2 Lgyu;
      // 368: getfield gyu.mu9 I
      // 36b: goto 372
      // 36e: invokestatic ebo.a (Loov;)Loov;
      // 371: athrow
      // 372: iload 7
      // 374: ifne 39d
      // 377: if_icmpne 38e
      // 37a: goto 381
      // 37d: invokestatic ebo.a (Loov;)Loov;
      // 380: athrow
      // 381: getstatic gyu.b41 Lgyu;
      // 384: getfield gyu.mu9 I
      // 387: istore 16
      // 389: iload 7
      // 38b: ifeq 4d5
      // 38e: iload 13
      // 390: getstatic gyu.bli Lgyu;
      // 393: getfield gyu.mu9 I
      // 396: goto 39d
      // 399: invokestatic ebo.a (Loov;)Loov;
      // 39c: athrow
      // 39d: iload 7
      // 39f: ifne 3c8
      // 3a2: if_icmpne 3b9
      // 3a5: goto 3ac
      // 3a8: invokestatic ebo.a (Loov;)Loov;
      // 3ab: athrow
      // 3ac: getstatic gyu.tlt Lgyu;
      // 3af: getfield gyu.mu9 I
      // 3b2: istore 16
      // 3b4: iload 7
      // 3b6: ifeq 4d5
      // 3b9: iload 13
      // 3bb: getstatic gyu.jzy Lgyu;
      // 3be: getfield gyu.mu9 I
      // 3c1: goto 3c8
      // 3c4: invokestatic ebo.a (Loov;)Loov;
      // 3c7: athrow
      // 3c8: iload 7
      // 3ca: ifne 3f3
      // 3cd: if_icmpne 3e4
      // 3d0: goto 3d7
      // 3d3: invokestatic ebo.a (Loov;)Loov;
      // 3d6: athrow
      // 3d7: getstatic gyu.knf Lgyu;
      // 3da: getfield gyu.mu9 I
      // 3dd: istore 16
      // 3df: iload 7
      // 3e1: ifeq 4d5
      // 3e4: iload 13
      // 3e6: getstatic gyu.uuo Lgyu;
      // 3e9: getfield gyu.mu9 I
      // 3ec: goto 3f3
      // 3ef: invokestatic ebo.a (Loov;)Loov;
      // 3f2: athrow
      // 3f3: iload 7
      // 3f5: ifne 41e
      // 3f8: if_icmpne 40f
      // 3fb: goto 402
      // 3fe: invokestatic ebo.a (Loov;)Loov;
      // 401: athrow
      // 402: getstatic gyu.ske Lgyu;
      // 405: getfield gyu.mu9 I
      // 408: istore 16
      // 40a: iload 7
      // 40c: ifeq 4d5
      // 40f: iload 13
      // 411: getstatic gyu.qgg Lgyu;
      // 414: getfield gyu.mu9 I
      // 417: goto 41e
      // 41a: invokestatic ebo.a (Loov;)Loov;
      // 41d: athrow
      // 41e: iload 7
      // 420: ifne 449
      // 423: if_icmpne 43a
      // 426: goto 42d
      // 429: invokestatic ebo.a (Loov;)Loov;
      // 42c: athrow
      // 42d: getstatic gyu._3h Lgyu;
      // 430: getfield gyu.mu9 I
      // 433: istore 16
      // 435: iload 7
      // 437: ifeq 4d5
      // 43a: iload 13
      // 43c: getstatic gyu.q2z Lgyu;
      // 43f: getfield gyu.mu9 I
      // 442: goto 449
      // 445: invokestatic ebo.a (Loov;)Loov;
      // 448: athrow
      // 449: invokestatic ebo.c_r (II)Z
      // 44c: iload 7
      // 44e: ifne 471
      // 451: ifeq 468
      // 454: goto 45b
      // 457: invokestatic ebo.a (Loov;)Loov;
      // 45a: athrow
      // 45b: getstatic gyu.cro Lgyu;
      // 45e: getfield gyu.mu9 I
      // 461: istore 16
      // 463: iload 7
      // 465: ifeq 4d5
      // 468: iload 13
      // 46a: goto 471
      // 46d: invokestatic ebo.a (Loov;)Loov;
      // 470: athrow
      // 471: iload 7
      // 473: ifne 4d7
      // 476: getstatic gyu.knf Lgyu;
      // 479: getfield gyu.mu9 I
      // 47c: if_icmpne 4d5
      // 47f: goto 486
      // 482: invokestatic ebo.a (Loov;)Loov;
      // 485: athrow
      // 486: aload 0
      // 487: bipush 3
      // 488: invokevirtual ebo.nbt (I)I
      // 48b: iload 7
      // 48d: ifne 4d7
      // 490: goto 497
      // 493: invokestatic ebo.a (Loov;)Loov;
      // 496: athrow
      // 497: ifne 4d5
      // 49a: goto 4a1
      // 49d: invokestatic ebo.a (Loov;)Loov;
      // 4a0: athrow
      // 4a1: aload 0
      // 4a2: bipush 2
      // 4a3: invokevirtual ebo.nbt (I)I
      // 4a6: istore 17
      // 4a8: iload 17
      // 4aa: iload 7
      // 4ac: ifne 4d3
      // 4af: ifne 4c6
      // 4b2: goto 4b9
      // 4b5: invokestatic ebo.a (Loov;)Loov;
      // 4b8: athrow
      // 4b9: getstatic gyu.wqh Lgyu;
      // 4bc: getfield gyu.mu9 I
      // 4bf: istore 16
      // 4c1: iload 7
      // 4c3: ifeq 4d5
      // 4c6: getstatic gyu.yo0 Lgyu;
      // 4c9: getfield gyu.mu9 I
      // 4cc: goto 4d3
      // 4cf: invokestatic ebo.a (Loov;)Loov;
      // 4d2: athrow
      // 4d3: istore 16
      // 4d5: iload 15
      // 4d7: iload 7
      // 4d9: ifne 53e
      // 4dc: ifeq 53c
      // 4df: goto 4e6
      // 4e2: invokestatic ebo.a (Loov;)Loov;
      // 4e5: athrow
      // 4e6: iload 16
      // 4e8: iload 13
      // 4ea: iload 7
      // 4ec: ifne 54c
      // 4ef: goto 4f6
      // 4f2: invokestatic ebo.a (Loov;)Loov;
      // 4f5: athrow
      // 4f6: if_icmpeq 53c
      // 4f9: goto 500
      // 4fc: invokestatic ebo.a (Loov;)Loov;
      // 4ff: athrow
      // 500: iload 16
      // 502: sipush 128
      // 505: iadd
      // 506: iload 7
      // 508: ifne 53a
      // 50b: goto 512
      // 50e: invokestatic ebo.a (Loov;)Loov;
      // 511: athrow
      // 512: invokestatic gyu.lxy (I)Lgyu;
      // 515: ifnull 531
      // 518: goto 51f
      // 51b: invokestatic ebo.a (Loov;)Loov;
      // 51e: athrow
      // 51f: wide iinc 16 128
      // 525: iload 7
      // 527: ifeq 53c
      // 52a: goto 531
      // 52d: invokestatic ebo.a (Loov;)Loov;
      // 530: athrow
      // 531: iload 13
      // 533: goto 53a
      // 536: invokestatic ebo.a (Loov;)Loov;
      // 539: athrow
      // 53a: istore 16
      // 53c: iload 16
      // 53e: iload 7
      // 540: ifne 580
      // 543: iload 13
      // 545: goto 54c
      // 548: invokestatic ebo.a (Loov;)Loov;
      // 54b: athrow
      // 54c: if_icmpne 567
      // 54f: aload 10
      // 551: iload 12
      // 553: iload 11
      // 555: iload 3
      // 556: imul
      // 557: iadd
      // 558: iload 13
      // 55a: iastore
      // 55b: iload 7
      // 55d: ifeq 656
      // 560: goto 567
      // 563: invokestatic ebo.a (Loov;)Loov;
      // 566: athrow
      // 567: aload 8
      // 569: iload 12
      // 56b: bipush 1
      // 56c: iadd
      // 56d: iload 11
      // 56f: bipush 1
      // 570: iadd
      // 571: bipush 1
      // 572: isub
      // 573: iload 3
      // 574: bipush 2
      // 575: iadd
      // 576: imul
      // 577: iadd
      // 578: iaload
      // 579: goto 580
      // 57c: invokestatic ebo.a (Loov;)Loov;
      // 57f: athrow
      // 580: istore 17
      // 582: aload 8
      // 584: iload 12
      // 586: bipush 1
      // 587: iadd
      // 588: bipush 1
      // 589: iadd
      // 58a: iload 11
      // 58c: bipush 1
      // 58d: iadd
      // 58e: iload 3
      // 58f: bipush 2
      // 590: iadd
      // 591: imul
      // 592: iadd
      // 593: iaload
      // 594: istore 18
      // 596: aload 8
      // 598: iload 12
      // 59a: bipush 1
      // 59b: iadd
      // 59c: bipush 1
      // 59d: isub
      // 59e: iload 11
      // 5a0: bipush 1
      // 5a1: iadd
      // 5a2: iload 3
      // 5a3: bipush 2
      // 5a4: iadd
      // 5a5: imul
      // 5a6: iadd
      // 5a7: iaload
      // 5a8: istore 19
      // 5aa: aload 8
      // 5ac: iload 12
      // 5ae: bipush 1
      // 5af: iadd
      // 5b0: iload 11
      // 5b2: bipush 1
      // 5b3: iadd
      // 5b4: bipush 1
      // 5b5: iadd
      // 5b6: iload 3
      // 5b7: bipush 2
      // 5b8: iadd
      // 5b9: imul
      // 5ba: iadd
      // 5bb: iaload
      // 5bc: istore 20
      // 5be: bipush 0
      // 5bf: istore 21
      // 5c1: iload 17
      // 5c3: iload 13
      // 5c5: invokestatic ebo.c_r (II)Z
      // 5c8: iload 7
      // 5ca: ifne 5e1
      // 5cd: ifeq 5da
      // 5d0: goto 5d7
      // 5d3: invokestatic ebo.a (Loov;)Loov;
      // 5d6: athrow
      // 5d7: iinc 21 1
      // 5da: iload 18
      // 5dc: iload 13
      // 5de: invokestatic ebo.c_r (II)Z
      // 5e1: iload 7
      // 5e3: ifne 5fa
      // 5e6: ifeq 5f3
      // 5e9: goto 5f0
      // 5ec: invokestatic ebo.a (Loov;)Loov;
      // 5ef: athrow
      // 5f0: iinc 21 1
      // 5f3: iload 19
      // 5f5: iload 13
      // 5f7: invokestatic ebo.c_r (II)Z
      // 5fa: iload 7
      // 5fc: ifne 613
      // 5ff: ifeq 60c
      // 602: goto 609
      // 605: invokestatic ebo.a (Loov;)Loov;
      // 608: athrow
      // 609: iinc 21 1
      // 60c: iload 20
      // 60e: iload 13
      // 610: invokestatic ebo.c_r (II)Z
      // 613: iload 7
      // 615: ifne 627
      // 618: ifeq 625
      // 61b: goto 622
      // 61e: invokestatic ebo.a (Loov;)Loov;
      // 621: athrow
      // 622: iinc 21 1
      // 625: iload 21
      // 627: bipush 3
      // 628: if_icmplt 643
      // 62b: aload 10
      // 62d: iload 12
      // 62f: iload 11
      // 631: iload 3
      // 632: imul
      // 633: iadd
      // 634: iload 16
      // 636: iastore
      // 637: iload 7
      // 639: ifeq 656
      // 63c: goto 643
      // 63f: invokestatic ebo.a (Loov;)Loov;
      // 642: athrow
      // 643: aload 10
      // 645: iload 12
      // 647: iload 11
      // 649: iload 3
      // 64a: imul
      // 64b: iadd
      // 64c: iload 13
      // 64e: iastore
      // 64f: goto 656
      // 652: invokestatic ebo.a (Loov;)Loov;
      // 655: athrow
      // 656: iinc 12 1
      // 659: iload 7
      // 65b: ifeq 050
      // 65e: iinc 11 1
      // 661: iload 7
      // 663: ifeq 046
      // 666: aload 10
      // 668: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1410933647872903833L, -299039607009063454L, MethodHandles.lookup().lookupClass()).a(148498410706939L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 21110843681863L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u008fój¯ÑÁT¨".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      f = var6;
      ry7 = LogManager.getLogger();
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
