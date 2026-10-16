import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class vu6 {
   private static final long a;
   private static final String b;

   public vu6(t9d var1, i2h var2, double var3, double var5, double var7, float var9, List var10) {
      this(var1, var2, var3, var5, var7, var9, false, true, var10);
   }

   public vu6(t9d var1, i2h var2, double var3, double var5, double var7, float var9, boolean var10, boolean var11, List var12) {
      this(var1, var2, var3, var5, var7, var9, var10, var11);
      this.mw3.addAll(var12);
   }

   public vu6(t9d var1, i2h var2, double var3, double var5, double var7, float var9, boolean var10, boolean var11) {
      this.vr7 = var1;
      this.t5i = var2;
      this.rrx = var9;
      this.we5 = var3;
      this.lbc = var5;
      this.oc8 = var7;
      this.u74 = var10;
      this.kv_ = var11;
   }

   public void zj7() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/google/common/collect/Sets.newHashSet ()Ljava/util/HashSet;
      // 003: astore 2
      // 004: bipush 16
      // 006: istore 3
      // 007: invokestatic t9d.b ()I
      // 00a: bipush 0
      // 00b: istore 4
      // 00d: istore 1
      // 00e: iload 4
      // 010: bipush 16
      // 012: if_icmpge 27c
      // 015: bipush 0
      // 016: iload 1
      // 017: ifeq 286
      // 01a: istore 5
      // 01c: iload 5
      // 01e: bipush 16
      // 020: if_icmpge 275
      // 023: bipush 0
      // 024: iload 1
      // 025: ifeq 010
      // 028: istore 6
      // 02a: iload 6
      // 02c: bipush 16
      // 02e: if_icmpge 26e
      // 031: iload 4
      // 033: iload 1
      // 034: ifeq 01e
      // 037: iload 1
      // 038: ifeq 0c7
      // 03b: ifeq 0be
      // 03e: goto 045
      // 041: invokestatic vu6.a (Loov;)Loov;
      // 044: athrow
      // 045: iload 4
      // 047: iload 1
      // 048: ifeq 0c7
      // 04b: goto 052
      // 04e: invokestatic vu6.a (Loov;)Loov;
      // 051: athrow
      // 052: bipush 15
      // 054: if_icmpeq 0be
      // 057: goto 05e
      // 05a: invokestatic vu6.a (Loov;)Loov;
      // 05d: athrow
      // 05e: iload 5
      // 060: iload 1
      // 061: ifeq 0c7
      // 064: goto 06b
      // 067: invokestatic vu6.a (Loov;)Loov;
      // 06a: athrow
      // 06b: ifeq 0be
      // 06e: goto 075
      // 071: invokestatic vu6.a (Loov;)Loov;
      // 074: athrow
      // 075: iload 5
      // 077: iload 1
      // 078: ifeq 0c7
      // 07b: goto 082
      // 07e: invokestatic vu6.a (Loov;)Loov;
      // 081: athrow
      // 082: bipush 15
      // 084: if_icmpeq 0be
      // 087: goto 08e
      // 08a: invokestatic vu6.a (Loov;)Loov;
      // 08d: athrow
      // 08e: iload 6
      // 090: iload 1
      // 091: ifeq 0c7
      // 094: goto 09b
      // 097: invokestatic vu6.a (Loov;)Loov;
      // 09a: athrow
      // 09b: ifeq 0be
      // 09e: goto 0a5
      // 0a1: invokestatic vu6.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: iload 6
      // 0a7: iload 1
      // 0a8: ifeq 0c7
      // 0ab: goto 0b2
      // 0ae: invokestatic vu6.a (Loov;)Loov;
      // 0b1: athrow
      // 0b2: bipush 15
      // 0b4: if_icmpne 267
      // 0b7: goto 0be
      // 0ba: invokestatic vu6.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: iload 4
      // 0c0: goto 0c7
      // 0c3: invokestatic vu6.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: i2f
      // 0c8: ldc 15.0
      // 0ca: nop
      // 0cb: fdiv
      // 0cc: fconst_2
      // 0cd: fmul
      // 0ce: fconst_1
      // 0cf: fsub
      // 0d0: f2d
      // 0d1: dstore 7
      // 0d3: iload 5
      // 0d5: i2f
      // 0d6: ldc 15.0
      // 0d8: nop
      // 0d9: fdiv
      // 0da: fconst_2
      // 0db: fmul
      // 0dc: fconst_1
      // 0dd: fsub
      // 0de: f2d
      // 0df: dstore 9
      // 0e1: iload 6
      // 0e3: i2f
      // 0e4: ldc 15.0
      // 0e6: nop
      // 0e7: fdiv
      // 0e8: fconst_2
      // 0e9: fmul
      // 0ea: fconst_1
      // 0eb: fsub
      // 0ec: f2d
      // 0ed: dstore 11
      // 0ef: dload 7
      // 0f1: dload 7
      // 0f3: dmul
      // 0f4: dload 9
      // 0f6: dload 9
      // 0f8: dmul
      // 0f9: dadd
      // 0fa: dload 11
      // 0fc: dload 11
      // 0fe: dmul
      // 0ff: dadd
      // 100: invokestatic java/lang/Math.sqrt (D)D
      // 103: dstore 13
      // 105: dload 7
      // 107: dload 13
      // 109: ddiv
      // 10a: dstore 7
      // 10c: dload 9
      // 10e: dload 13
      // 110: ddiv
      // 111: dstore 9
      // 113: dload 11
      // 115: dload 13
      // 117: ddiv
      // 118: dstore 11
      // 11a: aload 0
      // 11b: getfield vu6.rrx F
      // 11e: ldc 0.7
      // 120: nop
      // 121: aload 0
      // 122: getfield vu6.vr7 Lt9d;
      // 125: getfield t9d.fsy Ljava/util/Random;
      // 128: invokevirtual java/util/Random.nextFloat ()F
      // 12b: ldc 0.6
      // 12d: nop
      // 12e: fmul
      // 12f: fadd
      // 130: fmul
      // 131: fstore 15
      // 133: aload 0
      // 134: getfield vu6.we5 D
      // 137: dstore 16
      // 139: aload 0
      // 13a: getfield vu6.lbc D
      // 13d: dstore 18
      // 13f: aload 0
      // 140: getfield vu6.oc8 D
      // 143: dstore 20
      // 145: ldc 0.3
      // 147: nop
      // 148: fstore 22
      // 14a: fload 15
      // 14c: fconst_0
      // 14d: fcmpl
      // 14e: ifle 267
      // 151: new mew
      // 154: dup
      // 155: dload 16
      // 157: dload 18
      // 159: dload 20
      // 15b: invokespecial mew.<init> (DDD)V
      // 15e: astore 23
      // 160: aload 0
      // 161: getfield vu6.vr7 Lt9d;
      // 164: aload 23
      // 166: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 169: astore 24
      // 16b: iload 1
      // 16c: ifeq 26a
      // 16f: aload 24
      // 171: invokeinterface zfz.r_y ()Le0x; 1
      // 176: invokevirtual e0x.p1r ()Lp3y;
      // 179: getstatic p3y.cei Lp3y;
      // 17c: if_acmpeq 1d8
      // 17f: goto 186
      // 182: invokestatic vu6.a (Loov;)Loov;
      // 185: athrow
      // 186: aload 0
      // 187: getfield vu6.t5i Li2h;
      // 18a: iload 1
      // 18b: ifeq 1aa
      // 18e: goto 195
      // 191: invokestatic vu6.a (Loov;)Loov;
      // 194: athrow
      // 195: ifnull 1b9
      // 198: goto 19f
      // 19b: invokestatic vu6.a (Loov;)Loov;
      // 19e: athrow
      // 19f: aload 0
      // 1a0: getfield vu6.t5i Li2h;
      // 1a3: goto 1aa
      // 1a6: invokestatic vu6.a (Loov;)Loov;
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: aload 0
      // 1ac: getfield vu6.vr7 Lt9d;
      // 1af: aload 23
      // 1b1: aload 24
      // 1b3: invokevirtual i2h.sx1 (Lvu6;Lt9d;Lmew;Lzfz;)F
      // 1b6: goto 1c7
      // 1b9: aload 24
      // 1bb: invokeinterface zfz.r_y ()Le0x; 1
      // 1c0: aconst_null
      // 1c1: checkcast i2h
      // 1c4: invokevirtual e0x.aok (Li2h;)F
      // 1c7: fstore 25
      // 1c9: fload 15
      // 1cb: fload 25
      // 1cd: ldc 0.3
      // 1cf: nop
      // 1d0: fadd
      // 1d1: ldc 0.3
      // 1d3: nop
      // 1d4: fmul
      // 1d5: fsub
      // 1d6: fstore 15
      // 1d8: fload 15
      // 1da: fconst_0
      // 1db: iload 1
      // 1dc: ifeq 260
      // 1df: fcmpl
      // 1e0: ifle 23a
      // 1e3: goto 1ea
      // 1e6: invokestatic vu6.a (Loov;)Loov;
      // 1e9: athrow
      // 1ea: aload 0
      // 1eb: getfield vu6.t5i Li2h;
      // 1ee: iload 1
      // 1ef: ifeq 20e
      // 1f2: goto 1f9
      // 1f5: invokestatic vu6.a (Loov;)Loov;
      // 1f8: athrow
      // 1f9: ifnull 22a
      // 1fc: goto 203
      // 1ff: invokestatic vu6.a (Loov;)Loov;
      // 202: athrow
      // 203: aload 0
      // 204: getfield vu6.t5i Li2h;
      // 207: goto 20e
      // 20a: invokestatic vu6.a (Loov;)Loov;
      // 20d: athrow
      // 20e: aload 0
      // 20f: aload 0
      // 210: getfield vu6.vr7 Lt9d;
      // 213: aload 23
      // 215: aload 24
      // 217: fload 15
      // 219: invokevirtual i2h.kli (Lvu6;Lt9d;Lmew;Lzfz;F)Z
      // 21c: iload 1
      // 21d: ifeq 239
      // 220: ifeq 23a
      // 223: goto 22a
      // 226: invokestatic vu6.a (Loov;)Loov;
      // 229: athrow
      // 22a: aload 2
      // 22b: aload 23
      // 22d: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 232: goto 239
      // 235: invokestatic vu6.a (Loov;)Loov;
      // 238: athrow
      // 239: pop
      // 23a: dload 16
      // 23c: dload 7
      // 23e: ldc2_w 0.30000001192092896
      // 241: dmul
      // 242: dadd
      // 243: dstore 16
      // 245: dload 18
      // 247: dload 9
      // 249: ldc2_w 0.30000001192092896
      // 24c: dmul
      // 24d: dadd
      // 24e: dstore 18
      // 250: dload 20
      // 252: dload 11
      // 254: ldc2_w 0.30000001192092896
      // 257: dmul
      // 258: dadd
      // 259: dstore 20
      // 25b: fload 15
      // 25d: ldc 0.22500001
      // 25f: nop
      // 260: fsub
      // 261: fstore 15
      // 263: iload 1
      // 264: ifne 14a
      // 267: iinc 6 1
      // 26a: iload 1
      // 26b: ifne 02a
      // 26e: iinc 5 1
      // 271: iload 1
      // 272: ifne 01c
      // 275: iinc 4 1
      // 278: iload 1
      // 279: ifne 00e
      // 27c: aload 0
      // 27d: getfield vu6.mw3 Ljava/util/List;
      // 280: aload 2
      // 281: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 286: pop
      // 287: aload 0
      // 288: getfield vu6.rrx F
      // 28b: fconst_2
      // 28c: fmul
      // 28d: fstore 4
      // 28f: aload 0
      // 290: getfield vu6.we5 D
      // 293: fload 4
      // 295: f2d
      // 296: dsub
      // 297: dconst_1
      // 298: dsub
      // 299: invokestatic fe6.jqf (D)I
      // 29c: istore 5
      // 29e: aload 0
      // 29f: getfield vu6.we5 D
      // 2a2: fload 4
      // 2a4: f2d
      // 2a5: dadd
      // 2a6: dconst_1
      // 2a7: dadd
      // 2a8: invokestatic fe6.jqf (D)I
      // 2ab: istore 6
      // 2ad: aload 0
      // 2ae: getfield vu6.lbc D
      // 2b1: fload 4
      // 2b3: f2d
      // 2b4: dsub
      // 2b5: dconst_1
      // 2b6: dsub
      // 2b7: invokestatic fe6.jqf (D)I
      // 2ba: istore 7
      // 2bc: aload 0
      // 2bd: getfield vu6.lbc D
      // 2c0: fload 4
      // 2c2: f2d
      // 2c3: dadd
      // 2c4: dconst_1
      // 2c5: dadd
      // 2c6: invokestatic fe6.jqf (D)I
      // 2c9: istore 8
      // 2cb: aload 0
      // 2cc: getfield vu6.oc8 D
      // 2cf: fload 4
      // 2d1: f2d
      // 2d2: dsub
      // 2d3: dconst_1
      // 2d4: dsub
      // 2d5: invokestatic fe6.jqf (D)I
      // 2d8: istore 9
      // 2da: aload 0
      // 2db: getfield vu6.oc8 D
      // 2de: fload 4
      // 2e0: f2d
      // 2e1: dadd
      // 2e2: dconst_1
      // 2e3: dadd
      // 2e4: invokestatic fe6.jqf (D)I
      // 2e7: istore 10
      // 2e9: aload 0
      // 2ea: getfield vu6.vr7 Lt9d;
      // 2ed: aload 0
      // 2ee: getfield vu6.t5i Li2h;
      // 2f1: new nh4
      // 2f4: dup
      // 2f5: iload 5
      // 2f7: i2d
      // 2f8: iload 7
      // 2fa: i2d
      // 2fb: iload 9
      // 2fd: i2d
      // 2fe: iload 6
      // 300: i2d
      // 301: iload 8
      // 303: i2d
      // 304: iload 10
      // 306: i2d
      // 307: invokespecial nh4.<init> (DDDDDD)V
      // 30a: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 30d: astore 11
      // 30f: new fqr
      // 312: dup
      // 313: aload 0
      // 314: getfield vu6.we5 D
      // 317: aload 0
      // 318: getfield vu6.lbc D
      // 31b: aload 0
      // 31c: getfield vu6.oc8 D
      // 31f: invokespecial fqr.<init> (DDD)V
      // 322: astore 12
      // 324: bipush 0
      // 325: istore 13
      // 327: iload 13
      // 329: aload 11
      // 32b: invokeinterface java/util/List.size ()I 1
      // 330: if_icmpge 4be
      // 333: aload 11
      // 335: iload 13
      // 337: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 33c: checkcast i2h
      // 33f: astore 14
      // 341: iload 1
      // 342: ifeq 4ba
      // 345: aload 14
      // 347: invokevirtual i2h.zsp ()Z
      // 34a: ifne 4b7
      // 34d: goto 354
      // 350: invokestatic vu6.a (Loov;)Loov;
      // 353: athrow
      // 354: aload 14
      // 356: aload 0
      // 357: getfield vu6.we5 D
      // 35a: aload 0
      // 35b: getfield vu6.lbc D
      // 35e: aload 0
      // 35f: getfield vu6.oc8 D
      // 362: invokevirtual i2h.qww (DDD)D
      // 365: fload 4
      // 367: f2d
      // 368: ddiv
      // 369: dstore 15
      // 36b: iload 1
      // 36c: ifeq 4ba
      // 36f: dload 15
      // 371: dconst_1
      // 372: dcmpg
      // 373: ifgt 4b7
      // 376: goto 37d
      // 379: invokestatic vu6.a (Loov;)Loov;
      // 37c: athrow
      // 37d: aload 14
      // 37f: getfield i2h.o2v D
      // 382: aload 0
      // 383: getfield vu6.we5 D
      // 386: dsub
      // 387: dstore 17
      // 389: aload 14
      // 38b: getfield i2h.kfp D
      // 38e: aload 14
      // 390: invokevirtual i2h.c5y ()F
      // 393: f2d
      // 394: dadd
      // 395: aload 0
      // 396: getfield vu6.lbc D
      // 399: dsub
      // 39a: dstore 19
      // 39c: aload 14
      // 39e: getfield i2h.vbd D
      // 3a1: aload 0
      // 3a2: getfield vu6.oc8 D
      // 3a5: dsub
      // 3a6: dstore 21
      // 3a8: dload 17
      // 3aa: dload 17
      // 3ac: dmul
      // 3ad: dload 19
      // 3af: dload 19
      // 3b1: dmul
      // 3b2: dadd
      // 3b3: dload 21
      // 3b5: dload 21
      // 3b7: dmul
      // 3b8: dadd
      // 3b9: invokestatic fe6.dii (D)F
      // 3bc: f2d
      // 3bd: dstore 23
      // 3bf: iload 1
      // 3c0: ifeq 4ba
      // 3c3: dload 23
      // 3c5: dconst_0
      // 3c6: dcmpl
      // 3c7: ifeq 4b7
      // 3ca: goto 3d1
      // 3cd: invokestatic vu6.a (Loov;)Loov;
      // 3d0: athrow
      // 3d1: dload 17
      // 3d3: dload 23
      // 3d5: ddiv
      // 3d6: dstore 17
      // 3d8: dload 19
      // 3da: dload 23
      // 3dc: ddiv
      // 3dd: dstore 19
      // 3df: dload 21
      // 3e1: dload 23
      // 3e3: ddiv
      // 3e4: dstore 21
      // 3e6: aload 0
      // 3e7: getfield vu6.vr7 Lt9d;
      // 3ea: aload 12
      // 3ec: aload 14
      // 3ee: invokevirtual i2h.aaw ()Lnh4;
      // 3f1: invokevirtual t9d.ax6 (Lfqr;Lnh4;)F
      // 3f4: f2d
      // 3f5: dstore 25
      // 3f7: dconst_1
      // 3f8: dload 15
      // 3fa: dsub
      // 3fb: dload 25
      // 3fd: dmul
      // 3fe: dstore 27
      // 400: aload 14
      // 402: aload 0
      // 403: invokestatic ofh.siu (Lvu6;)Lofh;
      // 406: dload 27
      // 408: dload 27
      // 40a: dmul
      // 40b: dload 27
      // 40d: dadd
      // 40e: ldc2_w 2.0
      // 411: ddiv
      // 412: ldc2_w 8.0
      // 415: dmul
      // 416: fload 4
      // 418: f2d
      // 419: dmul
      // 41a: dconst_1
      // 41b: dadd
      // 41c: d2i
      // 41d: i2f
      // 41e: invokevirtual i2h.m1t (Lofh;F)Z
      // 421: pop
      // 422: aload 14
      // 424: dload 27
      // 426: invokestatic a1s.dpu (Li2h;D)D
      // 429: dstore 29
      // 42b: aload 14
      // 42d: dup
      // 42e: getfield i2h.icv D
      // 431: dload 17
      // 433: dload 29
      // 435: dmul
      // 436: dadd
      // 437: putfield i2h.icv D
      // 43a: aload 14
      // 43c: dup
      // 43d: getfield i2h.mop D
      // 440: dload 19
      // 442: dload 29
      // 444: dmul
      // 445: dadd
      // 446: putfield i2h.mop D
      // 449: aload 14
      // 44b: dup
      // 44c: getfield i2h.bw4 D
      // 44f: dload 21
      // 451: dload 29
      // 453: dmul
      // 454: dadd
      // 455: putfield i2h.bw4 D
      // 458: iload 1
      // 459: ifeq 4ba
      // 45c: aload 14
      // 45e: instanceof ha9
      // 461: ifeq 4b7
      // 464: goto 46b
      // 467: invokestatic vu6.a (Loov;)Loov;
      // 46a: athrow
      // 46b: aload 14
      // 46d: checkcast ha9
      // 470: getfield ha9.lls Lpj2;
      // 473: iload 1
      // 474: ifeq 4b6
      // 477: goto 47e
      // 47a: invokestatic vu6.a (Loov;)Loov;
      // 47d: athrow
      // 47e: getfield pj2.lez Z
      // 481: ifne 4b7
      // 484: goto 48b
      // 487: invokestatic vu6.a (Loov;)Loov;
      // 48a: athrow
      // 48b: aload 0
      // 48c: getfield vu6.dbk Ljava/util/Map;
      // 48f: aload 14
      // 491: checkcast ha9
      // 494: new fqr
      // 497: dup
      // 498: dload 17
      // 49a: dload 27
      // 49c: dmul
      // 49d: dload 19
      // 49f: dload 27
      // 4a1: dmul
      // 4a2: dload 21
      // 4a4: dload 27
      // 4a6: dmul
      // 4a7: invokespecial fqr.<init> (DDD)V
      // 4aa: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 4af: goto 4b6
      // 4b2: invokestatic vu6.a (Loov;)Loov;
      // 4b5: athrow
      // 4b6: pop
      // 4b7: iinc 13 1
      // 4ba: iload 1
      // 4bb: ifne 327
      // 4be: return
   }

   public void vw3(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic vu6.a J
      // 003: ldc2_w 130978578596403
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic t9d.b ()I
      // 00b: istore 4
      // 00d: aload 0
      // 00e: getfield vu6.vr7 Lt9d;
      // 011: aload 0
      // 012: getfield vu6.we5 D
      // 015: aload 0
      // 016: getfield vu6.lbc D
      // 019: aload 0
      // 01a: getfield vu6.oc8 D
      // 01d: getstatic vu6.b Ljava/lang/String;
      // 020: nop
      // 021: ldc 4.0
      // 023: nop
      // 024: fconst_1
      // 025: aload 0
      // 026: getfield vu6.vr7 Lt9d;
      // 029: getfield t9d.fsy Ljava/util/Random;
      // 02c: invokevirtual java/util/Random.nextFloat ()F
      // 02f: aload 0
      // 030: getfield vu6.vr7 Lt9d;
      // 033: getfield t9d.fsy Ljava/util/Random;
      // 036: invokevirtual java/util/Random.nextFloat ()F
      // 039: fsub
      // 03a: ldc 0.2
      // 03c: nop
      // 03d: fmul
      // 03e: fadd
      // 03f: ldc 0.7
      // 041: nop
      // 042: fmul
      // 043: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 046: aload 0
      // 047: iload 4
      // 049: ifeq 0a5
      // 04c: getfield vu6.rrx F
      // 04f: fconst_2
      // 050: fcmpl
      // 051: iflt 09d
      // 054: goto 05b
      // 057: invokestatic vu6.a (Loov;)Loov;
      // 05a: athrow
      // 05b: aload 0
      // 05c: iload 4
      // 05e: ifeq 0a5
      // 061: goto 068
      // 064: invokestatic vu6.a (Loov;)Loov;
      // 067: athrow
      // 068: getfield vu6.kv_ Z
      // 06b: ifeq 09d
      // 06e: goto 075
      // 071: invokestatic vu6.a (Loov;)Loov;
      // 074: athrow
      // 075: aload 0
      // 076: getfield vu6.vr7 Lt9d;
      // 079: getstatic w_0.ezk Lw_0;
      // 07c: aload 0
      // 07d: getfield vu6.we5 D
      // 080: aload 0
      // 081: getfield vu6.lbc D
      // 084: aload 0
      // 085: getfield vu6.oc8 D
      // 088: dconst_1
      // 089: dconst_0
      // 08a: dconst_0
      // 08b: bipush 0
      // 08c: newarray 10
      // 08e: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 091: iload 4
      // 093: ifne 0c0
      // 096: goto 09d
      // 099: invokestatic vu6.a (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 0
      // 09e: goto 0a5
      // 0a1: invokestatic vu6.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: getfield vu6.vr7 Lt9d;
      // 0a8: getstatic w_0.tmu Lw_0;
      // 0ab: aload 0
      // 0ac: getfield vu6.we5 D
      // 0af: aload 0
      // 0b0: getfield vu6.lbc D
      // 0b3: aload 0
      // 0b4: getfield vu6.oc8 D
      // 0b7: dconst_1
      // 0b8: dconst_0
      // 0b9: dconst_0
      // 0ba: bipush 0
      // 0bb: newarray 10
      // 0bd: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 0c0: aload 0
      // 0c1: getfield vu6.kv_ Z
      // 0c4: iload 4
      // 0c6: ifeq 2ca
      // 0c9: ifeq 2ba
      // 0cc: goto 0d3
      // 0cf: invokestatic vu6.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: getfield vu6.mw3 Ljava/util/List;
      // 0d7: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0dc: astore 5
      // 0de: aload 5
      // 0e0: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0e5: ifeq 2ba
      // 0e8: aload 5
      // 0ea: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0ef: checkcast mew
      // 0f2: astore 6
      // 0f4: aload 0
      // 0f5: getfield vu6.vr7 Lt9d;
      // 0f8: aload 6
      // 0fa: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0fd: invokeinterface zfz.r_y ()Le0x; 1
      // 102: astore 7
      // 104: iload 1
      // 105: iload 4
      // 107: ifeq 2ca
      // 10a: iload 4
      // 10c: ifeq 12c
      // 10f: goto 116
      // 112: invokestatic vu6.a (Loov;)Loov;
      // 115: athrow
      // 116: ifeq 243
      // 119: goto 120
      // 11c: invokestatic vu6.a (Loov;)Loov;
      // 11f: athrow
      // 120: aload 6
      // 122: invokevirtual mew.getX ()I
      // 125: goto 12c
      // 128: invokestatic vu6.a (Loov;)Loov;
      // 12b: athrow
      // 12c: i2f
      // 12d: aload 0
      // 12e: getfield vu6.vr7 Lt9d;
      // 131: getfield t9d.fsy Ljava/util/Random;
      // 134: invokevirtual java/util/Random.nextFloat ()F
      // 137: fadd
      // 138: f2d
      // 139: dstore 8
      // 13b: aload 6
      // 13d: invokevirtual mew.getY ()I
      // 140: i2f
      // 141: aload 0
      // 142: getfield vu6.vr7 Lt9d;
      // 145: getfield t9d.fsy Ljava/util/Random;
      // 148: invokevirtual java/util/Random.nextFloat ()F
      // 14b: fadd
      // 14c: f2d
      // 14d: dstore 10
      // 14f: aload 6
      // 151: invokevirtual mew.getZ ()I
      // 154: i2f
      // 155: aload 0
      // 156: getfield vu6.vr7 Lt9d;
      // 159: getfield t9d.fsy Ljava/util/Random;
      // 15c: invokevirtual java/util/Random.nextFloat ()F
      // 15f: fadd
      // 160: f2d
      // 161: dstore 12
      // 163: dload 8
      // 165: aload 0
      // 166: getfield vu6.we5 D
      // 169: dsub
      // 16a: dstore 14
      // 16c: dload 10
      // 16e: aload 0
      // 16f: getfield vu6.lbc D
      // 172: dsub
      // 173: dstore 16
      // 175: dload 12
      // 177: aload 0
      // 178: getfield vu6.oc8 D
      // 17b: dsub
      // 17c: dstore 18
      // 17e: dload 14
      // 180: dload 14
      // 182: dmul
      // 183: dload 16
      // 185: dload 16
      // 187: dmul
      // 188: dadd
      // 189: dload 18
      // 18b: dload 18
      // 18d: dmul
      // 18e: dadd
      // 18f: invokestatic fe6.dii (D)F
      // 192: f2d
      // 193: dstore 20
      // 195: dload 14
      // 197: dload 20
      // 199: ddiv
      // 19a: dstore 14
      // 19c: dload 16
      // 19e: dload 20
      // 1a0: ddiv
      // 1a1: dstore 16
      // 1a3: dload 18
      // 1a5: dload 20
      // 1a7: ddiv
      // 1a8: dstore 18
      // 1aa: ldc2_w 0.5
      // 1ad: dload 20
      // 1af: aload 0
      // 1b0: getfield vu6.rrx F
      // 1b3: f2d
      // 1b4: ddiv
      // 1b5: ldc2_w 0.1
      // 1b8: dadd
      // 1b9: ddiv
      // 1ba: dstore 22
      // 1bc: dload 22
      // 1be: aload 0
      // 1bf: getfield vu6.vr7 Lt9d;
      // 1c2: getfield t9d.fsy Ljava/util/Random;
      // 1c5: invokevirtual java/util/Random.nextFloat ()F
      // 1c8: aload 0
      // 1c9: getfield vu6.vr7 Lt9d;
      // 1cc: getfield t9d.fsy Ljava/util/Random;
      // 1cf: invokevirtual java/util/Random.nextFloat ()F
      // 1d2: fmul
      // 1d3: ldc 0.3
      // 1d5: nop
      // 1d6: fadd
      // 1d7: f2d
      // 1d8: dmul
      // 1d9: dstore 22
      // 1db: dload 14
      // 1dd: dload 22
      // 1df: dmul
      // 1e0: dstore 14
      // 1e2: dload 16
      // 1e4: dload 22
      // 1e6: dmul
      // 1e7: dstore 16
      // 1e9: dload 18
      // 1eb: dload 22
      // 1ed: dmul
      // 1ee: dstore 18
      // 1f0: aload 0
      // 1f1: getfield vu6.vr7 Lt9d;
      // 1f4: getstatic w_0.aiv Lw_0;
      // 1f7: dload 8
      // 1f9: aload 0
      // 1fa: getfield vu6.we5 D
      // 1fd: dconst_1
      // 1fe: dmul
      // 1ff: dadd
      // 200: ldc2_w 2.0
      // 203: ddiv
      // 204: dload 10
      // 206: aload 0
      // 207: getfield vu6.lbc D
      // 20a: dconst_1
      // 20b: dmul
      // 20c: dadd
      // 20d: ldc2_w 2.0
      // 210: ddiv
      // 211: dload 12
      // 213: aload 0
      // 214: getfield vu6.oc8 D
      // 217: dconst_1
      // 218: dmul
      // 219: dadd
      // 21a: ldc2_w 2.0
      // 21d: ddiv
      // 21e: dload 14
      // 220: dload 16
      // 222: dload 18
      // 224: bipush 0
      // 225: newarray 10
      // 227: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 22a: aload 0
      // 22b: getfield vu6.vr7 Lt9d;
      // 22e: getstatic w_0.bac Lw_0;
      // 231: dload 8
      // 233: dload 10
      // 235: dload 12
      // 237: dload 14
      // 239: dload 16
      // 23b: dload 18
      // 23d: bipush 0
      // 23e: newarray 10
      // 240: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 243: aload 7
      // 245: iload 4
      // 247: ifeq 263
      // 24a: invokevirtual e0x.p1r ()Lp3y;
      // 24d: getstatic p3y.cei Lp3y;
      // 250: if_acmpeq 2b5
      // 253: goto 25a
      // 256: invokestatic vu6.a (Loov;)Loov;
      // 259: athrow
      // 25a: aload 7
      // 25c: goto 263
      // 25f: invokestatic vu6.a (Loov;)Loov;
      // 262: athrow
      // 263: aload 0
      // 264: invokevirtual e0x.xse (Lvu6;)Z
      // 267: iload 4
      // 269: ifeq 2a8
      // 26c: ifeq 298
      // 26f: goto 276
      // 272: invokestatic vu6.a (Loov;)Loov;
      // 275: athrow
      // 276: aload 7
      // 278: aload 0
      // 279: getfield vu6.vr7 Lt9d;
      // 27c: aload 6
      // 27e: aload 0
      // 27f: getfield vu6.vr7 Lt9d;
      // 282: aload 6
      // 284: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 287: fconst_1
      // 288: aload 0
      // 289: getfield vu6.rrx F
      // 28c: fdiv
      // 28d: bipush 0
      // 28e: invokevirtual e0x.ix7 (Lt9d;Lmew;Lzfz;FI)V
      // 291: goto 298
      // 294: invokestatic vu6.a (Loov;)Loov;
      // 297: athrow
      // 298: aload 0
      // 299: getfield vu6.vr7 Lt9d;
      // 29c: aload 6
      // 29e: getstatic ox_.ibw Le0x;
      // 2a1: invokevirtual e0x.l4i ()Lzfz;
      // 2a4: bipush 3
      // 2a5: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 2a8: pop
      // 2a9: aload 7
      // 2ab: aload 0
      // 2ac: getfield vu6.vr7 Lt9d;
      // 2af: aload 6
      // 2b1: aload 0
      // 2b2: invokevirtual e0x.a4c (Lt9d;Lmew;Lvu6;)V
      // 2b5: iload 4
      // 2b7: ifne 0de
      // 2ba: aload 0
      // 2bb: iload 4
      // 2bd: ifeq 2ce
      // 2c0: getfield vu6.u74 Z
      // 2c3: goto 2ca
      // 2c6: invokestatic vu6.a (Loov;)Loov;
      // 2c9: athrow
      // 2ca: ifeq 375
      // 2cd: aload 0
      // 2ce: getfield vu6.mw3 Ljava/util/List;
      // 2d1: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 2d6: astore 5
      // 2d8: aload 5
      // 2da: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 2df: ifeq 375
      // 2e2: aload 5
      // 2e4: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 2e9: checkcast mew
      // 2ec: astore 6
      // 2ee: aload 0
      // 2ef: getfield vu6.vr7 Lt9d;
      // 2f2: aload 6
      // 2f4: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 2f7: invokeinterface zfz.r_y ()Le0x; 1
      // 2fc: iload 4
      // 2fe: ifeq 329
      // 301: invokevirtual e0x.p1r ()Lp3y;
      // 304: getstatic p3y.cei Lp3y;
      // 307: if_acmpne 370
      // 30a: goto 311
      // 30d: invokestatic vu6.a (Loov;)Loov;
      // 310: athrow
      // 311: aload 0
      // 312: getfield vu6.vr7 Lt9d;
      // 315: aload 6
      // 317: invokevirtual mew.eve ()Lmew;
      // 31a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 31d: invokeinterface zfz.r_y ()Le0x; 1
      // 322: goto 329
      // 325: invokestatic vu6.a (Loov;)Loov;
      // 328: athrow
      // 329: invokevirtual e0x.z4c ()Z
      // 32c: iload 4
      // 32e: ifeq 34a
      // 331: ifeq 370
      // 334: goto 33b
      // 337: invokestatic vu6.a (Loov;)Loov;
      // 33a: athrow
      // 33b: aload 0
      // 33c: getfield vu6.kyc Ljava/util/Random;
      // 33f: bipush 3
      // 340: invokevirtual java/util/Random.nextInt (I)I
      // 343: goto 34a
      // 346: invokestatic vu6.a (Loov;)Loov;
      // 349: athrow
      // 34a: iload 4
      // 34c: ifeq 36f
      // 34f: ifne 370
      // 352: goto 359
      // 355: invokestatic vu6.a (Loov;)Loov;
      // 358: athrow
      // 359: aload 0
      // 35a: getfield vu6.vr7 Lt9d;
      // 35d: aload 6
      // 35f: getstatic ox_._0u Lwuo;
      // 362: invokevirtual wuo.l4i ()Lzfz;
      // 365: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 368: goto 36f
      // 36b: invokestatic vu6.a (Loov;)Loov;
      // 36e: athrow
      // 36f: pop
      // 370: iload 4
      // 372: ifne 2d8
      // 375: return
   }

   public Map xpv() {
      return this.dbk;
   }

   public g_3 wbg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield vu6.t5i Li2h;
      // 08: iload 1
      // 09: ifne 22
      // 0c: ifnonnull 1e
      // 0f: goto 16
      // 12: invokestatic vu6.a (Loov;)Loov;
      // 15: athrow
      // 16: aconst_null
      // 17: goto 6b
      // 1a: invokestatic vu6.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield vu6.t5i Li2h;
      // 22: instanceof pix
      // 25: iload 1
      // 26: ifne 56
      // 29: ifeq 44
      // 2c: goto 33
      // 2f: invokestatic vu6.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield vu6.t5i Li2h;
      // 37: checkcast pix
      // 3a: invokevirtual pix.qrq ()Lg_3;
      // 3d: goto 6b
      // 40: invokestatic vu6.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield vu6.t5i Li2h;
      // 48: iload 1
      // 49: ifne 64
      // 4c: instanceof g_3
      // 4f: goto 56
      // 52: invokestatic vu6.a (Loov;)Loov;
      // 55: athrow
      // 56: ifeq 6a
      // 59: aload 0
      // 5a: getfield vu6.t5i Li2h;
      // 5d: goto 64
      // 60: invokestatic vu6.a (Loov;)Loov;
      // 63: athrow
      // 64: checkcast g_3
      // 67: goto 6b
      // 6a: aconst_null
      // 6b: areturn
   }

   public void cvs() {
      this.mw3.clear();
   }

   public List egt() {
      return this.mw3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4601957867232870543L, 3058196596092591650L, MethodHandles.lookup().lookupClass()).a(271853796672023L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 82402975795926L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("$0ìÂ\u0099ùK\u000eP¦\u0004Nð\f\u0002p".getBytes("ISO-8859-1"));
      String var6 = a(var4).intern();
      byte var10001 = -1;
      b = var6;
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
}
