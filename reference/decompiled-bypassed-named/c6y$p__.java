import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class c6y$p__ extends flo {
   private int wg6;
   private final jux gnj;
   private qhg bwk;
   public boolean zwy;
   private static final long b;
   private static final String[] h;
   private static final String[] i;
   private static final Map m = new HashMap(13);

   public c6y$p__(OpaquePredicate param1, double param2, double param4, double param6, double param8, double param10, double param12, jux param14, bdo param15) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic c6y$p__.b J
      // 003: ldc2_w 108323486353597
      // 006: lxor
      // 007: lstore 16
      // 009: aload 0
      // 00a: aload 1
      // 00b: dload 2
      // 00c: dload 4
      // 00e: dload 6
      // 010: dconst_0
      // 011: dconst_0
      // 012: dconst_0
      // 013: invokespecial flo.<init> (Lt9d;DDDDDD)V
      // 016: invokestatic OpaquePredicate.b ()I
      // 019: aload 0
      // 01a: dload 8
      // 01c: putfield c6y$p__.icv D
      // 01f: istore 18
      // 021: aload 0
      // 022: dload 10
      // 024: putfield c6y$p__.mop D
      // 027: aload 0
      // 028: dload 12
      // 02a: putfield c6y$p__.bw4 D
      // 02d: aload 0
      // 02e: aload 14
      // 030: putfield c6y$p__.gnj Ljux;
      // 033: aload 0
      // 034: bipush 8
      // 036: putfield c6y$p__.bx4 I
      // 039: iload 18
      // 03b: ifeq 06b
      // 03e: aload 15
      // 040: ifnull 110
      // 043: goto 04a
      // 046: invokestatic c6y$p__.a (Loov;)Loov;
      // 049: athrow
      // 04a: aload 0
      // 04b: aload 15
      // 04d: sipush 30411
      // 050: ldc2_w 2515298910815264100
      // 053: lload 16
      // 055: lxor
      // 056: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 05b: nop
      // 05c: bipush 10
      // 05e: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 061: putfield c6y$p__.bwk Lqhg;
      // 064: goto 06b
      // 067: invokestatic c6y$p__.a (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield c6y$p__.bwk Lqhg;
      // 06f: invokevirtual qhg.vek ()I
      // 072: iload 18
      // 074: ifeq 0a9
      // 077: ifne 092
      // 07a: goto 081
      // 07d: invokestatic c6y$p__.a (Loov;)Loov;
      // 080: athrow
      // 081: aload 0
      // 082: aconst_null
      // 083: putfield c6y$p__.bwk Lqhg;
      // 086: iload 18
      // 088: ifne 110
      // 08b: goto 092
      // 08e: invokestatic c6y$p__.a (Loov;)Loov;
      // 091: athrow
      // 092: aload 0
      // 093: aload 0
      // 094: getfield c6y$p__.bwk Lqhg;
      // 097: invokevirtual qhg.vek ()I
      // 09a: bipush 2
      // 09b: imul
      // 09c: bipush 1
      // 09d: isub
      // 09e: putfield c6y$p__.bx4 I
      // 0a1: bipush 0
      // 0a2: goto 0a9
      // 0a5: invokestatic c6y$p__.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: istore 19
      // 0ab: iload 19
      // 0ad: aload 0
      // 0ae: getfield c6y$p__.bwk Lqhg;
      // 0b1: invokevirtual qhg.vek ()I
      // 0b4: if_icmpge 110
      // 0b7: aload 0
      // 0b8: getfield c6y$p__.bwk Lqhg;
      // 0bb: iload 19
      // 0bd: invokevirtual qhg.kd6 (I)Lbdo;
      // 0c0: astore 20
      // 0c2: iload 18
      // 0c4: ifeq 10b
      // 0c7: aload 20
      // 0c9: sipush 1261
      // 0cc: ldc2_w 3535926222986047299
      // 0cf: lload 16
      // 0d1: lxor
      // 0d2: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d7: nop
      // 0d8: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 0db: ifeq 101
      // 0de: goto 0e5
      // 0e1: invokestatic c6y$p__.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: aload 0
      // 0e6: bipush 1
      // 0e7: putfield c6y$p__.zwy Z
      // 0ea: aload 0
      // 0eb: dup
      // 0ec: getfield c6y$p__.bx4 I
      // 0ef: bipush 15
      // 0f1: iadd
      // 0f2: putfield c6y$p__.bx4 I
      // 0f5: iload 18
      // 0f7: ifne 110
      // 0fa: goto 101
      // 0fd: invokestatic c6y$p__.a (Loov;)Loov;
      // 100: athrow
      // 101: iinc 19 1
      // 104: goto 10b
      // 107: invokestatic c6y$p__.a (Loov;)Loov;
      // 10a: athrow
      // 10b: iload 18
      // 10d: ifne 0ab
      // 110: return
   }

   @Override
   public void oss(q3g var1, EntityLivingBase var2, float var3, float var4, float var5, float var6, float var7, float var8) {
   }

   @Override
   public void xx_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic c6y$p__.b J
      // 003: ldc2_w 97980815195126
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield c6y$p__.wg6 I
      // 010: iload 3
      // 011: ifeq 161
      // 014: ifne 15b
      // 017: goto 01e
      // 01a: invokestatic c6y$p__.a (Loov;)Loov;
      // 01d: athrow
      // 01e: aload 0
      // 01f: iload 3
      // 020: ifeq 15c
      // 023: goto 02a
      // 026: invokestatic c6y$p__.a (Loov;)Loov;
      // 029: athrow
      // 02a: getfield c6y$p__.bwk Lqhg;
      // 02d: ifnull 15b
      // 030: goto 037
      // 033: invokestatic c6y$p__.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 0
      // 038: invokespecial c6y$p__.wwv ()Z
      // 03b: istore 4
      // 03d: bipush 0
      // 03e: istore 5
      // 040: aload 0
      // 041: getfield c6y$p__.bwk Lqhg;
      // 044: invokevirtual qhg.vek ()I
      // 047: iload 3
      // 048: ifeq 065
      // 04b: bipush 3
      // 04c: if_icmplt 05d
      // 04f: goto 056
      // 052: invokestatic c6y$p__.a (Loov;)Loov;
      // 055: athrow
      // 056: bipush 1
      // 057: istore 5
      // 059: iload 3
      // 05a: ifne 0c0
      // 05d: bipush 0
      // 05e: goto 065
      // 061: invokestatic c6y$p__.a (Loov;)Loov;
      // 064: athrow
      // 065: istore 6
      // 067: iload 6
      // 069: aload 0
      // 06a: getfield c6y$p__.bwk Lqhg;
      // 06d: invokevirtual qhg.vek ()I
      // 070: if_icmpge 0c0
      // 073: aload 0
      // 074: getfield c6y$p__.bwk Lqhg;
      // 077: iload 6
      // 079: invokevirtual qhg.kd6 (I)Lbdo;
      // 07c: astore 7
      // 07e: iload 3
      // 07f: ifeq 0bc
      // 082: aload 7
      // 084: sipush 5673
      // 087: ldc2_w 3248529900110581444
      // 08a: lload 1
      // 08b: lxor
      // 08c: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 091: nop
      // 092: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 095: bipush 1
      // 096: iload 3
      // 097: ifeq 160
      // 09a: goto 0a1
      // 09d: invokestatic c6y$p__.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: if_icmpne 0b2
      // 0a4: goto 0ab
      // 0a7: invokestatic c6y$p__.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: bipush 1
      // 0ac: istore 5
      // 0ae: iload 3
      // 0af: ifne 0c0
      // 0b2: iinc 6 1
      // 0b5: goto 0bc
      // 0b8: invokestatic c6y$p__.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: iload 3
      // 0bd: ifne 067
      // 0c0: new java/lang/StringBuilder
      // 0c3: dup
      // 0c4: invokespecial java/lang/StringBuilder.<init> ()V
      // 0c7: sipush 16394
      // 0ca: ldc2_w 2689749212917487845
      // 0cd: lload 1
      // 0ce: lxor
      // 0cf: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d4: nop
      // 0d5: iload 3
      // 0d6: ifeq 10a
      // 0d9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0dc: iload 5
      // 0de: ifeq 0fd
      // 0e1: goto 0e8
      // 0e4: invokestatic c6y$p__.a (Loov;)Loov;
      // 0e7: athrow
      // 0e8: sipush 2555
      // 0eb: ldc2_w 2609340900510798097
      // 0ee: lload 1
      // 0ef: lxor
      // 0f0: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f5: nop
      // 0f6: goto 10b
      // 0f9: invokestatic c6y$p__.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: sipush 18653
      // 100: ldc2_w 9079289084482539581
      // 103: lload 1
      // 104: lxor
      // 105: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10a: nop
      // 10b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 10e: iload 4
      // 110: ifeq 128
      // 113: sipush 4536
      // 116: ldc2_w 5579021919191664982
      // 119: lload 1
      // 11a: lxor
      // 11b: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 120: nop
      // 121: goto 12b
      // 124: invokestatic c6y$p__.a (Loov;)Loov;
      // 127: athrow
      // 128: ldc ""
      // 12a: nop
      // 12b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 12e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 131: astore 6
      // 133: aload 0
      // 134: getfield c6y$p__.oay Lt9d;
      // 137: aload 0
      // 138: getfield c6y$p__.o2v D
      // 13b: aload 0
      // 13c: getfield c6y$p__.kfp D
      // 13f: aload 0
      // 140: getfield c6y$p__.vbd D
      // 143: aload 6
      // 145: ldc 20.0
      // 147: nop
      // 148: ldc 0.95
      // 14a: nop
      // 14b: aload 0
      // 14c: getfield c6y$p__.z2d Ljava/util/Random;
      // 14f: invokevirtual java/util/Random.nextFloat ()F
      // 152: ldc 0.1
      // 154: nop
      // 155: fmul
      // 156: fadd
      // 157: bipush 1
      // 158: invokevirtual OpaquePredicate.wd_ (DDDLjava/lang/String;FFZ)V
      // 15b: aload 0
      // 15c: getfield c6y$p__.wg6 I
      // 15f: bipush 2
      // 160: irem
      // 161: iload 3
      // 162: ifeq 4c7
      // 165: ifne 4b9
      // 168: goto 16f
      // 16b: invokestatic c6y$p__.a (Loov;)Loov;
      // 16e: athrow
      // 16f: aload 0
      // 170: iload 3
      // 171: ifeq 4c4
      // 174: goto 17b
      // 177: invokestatic c6y$p__.a (Loov;)Loov;
      // 17a: athrow
      // 17b: getfield c6y$p__.bwk Lqhg;
      // 17e: ifnull 4b9
      // 181: goto 188
      // 184: invokestatic c6y$p__.a (Loov;)Loov;
      // 187: athrow
      // 188: aload 0
      // 189: getfield c6y$p__.wg6 I
      // 18c: bipush 2
      // 18d: idiv
      // 18e: aload 0
      // 18f: getfield c6y$p__.bwk Lqhg;
      // 192: invokevirtual qhg.vek ()I
      // 195: iload 3
      // 196: ifeq 4d6
      // 199: goto 1a0
      // 19c: invokestatic c6y$p__.a (Loov;)Loov;
      // 19f: athrow
      // 1a0: if_icmpge 4b9
      // 1a3: goto 1aa
      // 1a6: invokestatic c6y$p__.a (Loov;)Loov;
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: getfield c6y$p__.wg6 I
      // 1ae: bipush 2
      // 1af: idiv
      // 1b0: istore 4
      // 1b2: aload 0
      // 1b3: getfield c6y$p__.bwk Lqhg;
      // 1b6: iload 4
      // 1b8: invokevirtual qhg.kd6 (I)Lbdo;
      // 1bb: astore 5
      // 1bd: aload 5
      // 1bf: sipush 21690
      // 1c2: ldc2_w 13005614812613715
      // 1c5: lload 1
      // 1c6: lxor
      // 1c7: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1cc: nop
      // 1cd: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 1d0: istore 6
      // 1d2: aload 5
      // 1d4: sipush 21140
      // 1d7: ldc2_w 6760494982023203447
      // 1da: lload 1
      // 1db: lxor
      // 1dc: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1e1: nop
      // 1e2: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 1e5: istore 7
      // 1e7: aload 5
      // 1e9: sipush 11087
      // 1ec: ldc2_w 5599465503896089511
      // 1ef: lload 1
      // 1f0: lxor
      // 1f1: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1f6: nop
      // 1f7: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 1fa: istore 8
      // 1fc: aload 5
      // 1fe: sipush 8528
      // 201: ldc2_w 9115364863622625714
      // 204: lload 1
      // 205: lxor
      // 206: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 20b: nop
      // 20c: invokevirtual bdo.hkr (Ljava/lang/String;)[I
      // 20f: astore 9
      // 211: aload 5
      // 213: sipush 20136
      // 216: ldc2_w 7334457212919633481
      // 219: lload 1
      // 21a: lxor
      // 21b: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 220: nop
      // 221: invokevirtual bdo.hkr (Ljava/lang/String;)[I
      // 224: astore 10
      // 226: aload 9
      // 228: arraylength
      // 229: iload 3
      // 22a: ifeq 246
      // 22d: ifne 244
      // 230: goto 237
      // 233: invokestatic c6y$p__.a (Loov;)Loov;
      // 236: athrow
      // 237: bipush 1
      // 238: newarray 10
      // 23a: dup
      // 23b: bipush 0
      // 23c: getstatic pis.i2b [I
      // 23f: bipush 0
      // 240: iaload
      // 241: iastore
      // 242: astore 9
      // 244: iload 6
      // 246: bipush 1
      // 247: iload 3
      // 248: ifeq 27a
      // 24b: if_icmpne 270
      // 24e: goto 255
      // 251: invokestatic c6y$p__.a (Loov;)Loov;
      // 254: athrow
      // 255: aload 0
      // 256: ldc2_w 0.5
      // 259: bipush 4
      // 25a: aload 9
      // 25c: aload 10
      // 25e: iload 7
      // 260: iload 8
      // 262: invokespecial c6y$p__.cwg (DI[I[IZZ)V
      // 265: iload 3
      // 266: ifne 457
      // 269: goto 270
      // 26c: invokestatic c6y$p__.a (Loov;)Loov;
      // 26f: athrow
      // 270: iload 6
      // 272: bipush 2
      // 273: goto 27a
      // 276: invokestatic c6y$p__.a (Loov;)Loov;
      // 279: athrow
      // 27a: iload 3
      // 27b: ifeq 318
      // 27e: if_icmpne 30e
      // 281: goto 288
      // 284: invokestatic c6y$p__.a (Loov;)Loov;
      // 287: athrow
      // 288: aload 0
      // 289: ldc2_w 0.5
      // 28c: bipush 6
      // 28e: anewarray 160
      // 291: dup
      // 292: bipush 0
      // 293: bipush 2
      // 294: newarray 7
      // 296: dup
      // 297: bipush 0
      // 298: dconst_0
      // 299: dastore
      // 29a: dup
      // 29b: bipush 1
      // 29c: dconst_1
      // 29d: dastore
      // 29e: aastore
      // 29f: dup
      // 2a0: bipush 1
      // 2a1: bipush 2
      // 2a2: newarray 7
      // 2a4: dup
      // 2a5: bipush 0
      // 2a6: ldc2_w 0.3455
      // 2a9: dastore
      // 2aa: dup
      // 2ab: bipush 1
      // 2ac: ldc2_w 0.309
      // 2af: dastore
      // 2b0: aastore
      // 2b1: dup
      // 2b2: bipush 2
      // 2b3: bipush 2
      // 2b4: newarray 7
      // 2b6: dup
      // 2b7: bipush 0
      // 2b8: ldc2_w 0.9511
      // 2bb: dastore
      // 2bc: dup
      // 2bd: bipush 1
      // 2be: ldc2_w 0.309
      // 2c1: dastore
      // 2c2: aastore
      // 2c3: dup
      // 2c4: bipush 3
      // 2c5: bipush 2
      // 2c6: newarray 7
      // 2c8: dup
      // 2c9: bipush 0
      // 2ca: ldc2_w 0.3795918367346939
      // 2cd: dastore
      // 2ce: dup
      // 2cf: bipush 1
      // 2d0: ldc2_w -0.12653061224489795
      // 2d3: dastore
      // 2d4: aastore
      // 2d5: dup
      // 2d6: bipush 4
      // 2d7: bipush 2
      // 2d8: newarray 7
      // 2da: dup
      // 2db: bipush 0
      // 2dc: ldc2_w 0.6122448979591837
      // 2df: dastore
      // 2e0: dup
      // 2e1: bipush 1
      // 2e2: ldc2_w -0.8040816326530612
      // 2e5: dastore
      // 2e6: aastore
      // 2e7: dup
      // 2e8: bipush 5
      // 2e9: bipush 2
      // 2ea: newarray 7
      // 2ec: dup
      // 2ed: bipush 0
      // 2ee: dconst_0
      // 2ef: dastore
      // 2f0: dup
      // 2f1: bipush 1
      // 2f2: ldc2_w -0.35918367346938773
      // 2f5: dastore
      // 2f6: aastore
      // 2f7: aload 9
      // 2f9: aload 10
      // 2fb: iload 7
      // 2fd: iload 8
      // 2ff: bipush 0
      // 300: invokespecial c6y$p__.sws (D[[D[I[IZZZ)V
      // 303: iload 3
      // 304: ifne 457
      // 307: goto 30e
      // 30a: invokestatic c6y$p__.a (Loov;)Loov;
      // 30d: athrow
      // 30e: iload 6
      // 310: bipush 3
      // 311: goto 318
      // 314: invokestatic c6y$p__.a (Loov;)Loov;
      // 317: athrow
      // 318: iload 3
      // 319: ifeq 426
      // 31c: if_icmpne 41c
      // 31f: goto 326
      // 322: invokestatic c6y$p__.a (Loov;)Loov;
      // 325: athrow
      // 326: aload 0
      // 327: ldc2_w 0.5
      // 32a: bipush 12
      // 32c: anewarray 160
      // 32f: dup
      // 330: bipush 0
      // 331: bipush 2
      // 332: newarray 7
      // 334: dup
      // 335: bipush 0
      // 336: dconst_0
      // 337: dastore
      // 338: dup
      // 339: bipush 1
      // 33a: ldc2_w 0.2
      // 33d: dastore
      // 33e: aastore
      // 33f: dup
      // 340: bipush 1
      // 341: bipush 2
      // 342: newarray 7
      // 344: dup
      // 345: bipush 0
      // 346: ldc2_w 0.2
      // 349: dastore
      // 34a: dup
      // 34b: bipush 1
      // 34c: ldc2_w 0.2
      // 34f: dastore
      // 350: aastore
      // 351: dup
      // 352: bipush 2
      // 353: bipush 2
      // 354: newarray 7
      // 356: dup
      // 357: bipush 0
      // 358: ldc2_w 0.2
      // 35b: dastore
      // 35c: dup
      // 35d: bipush 1
      // 35e: ldc2_w 0.6
      // 361: dastore
      // 362: aastore
      // 363: dup
      // 364: bipush 3
      // 365: bipush 2
      // 366: newarray 7
      // 368: dup
      // 369: bipush 0
      // 36a: ldc2_w 0.6
      // 36d: dastore
      // 36e: dup
      // 36f: bipush 1
      // 370: ldc2_w 0.6
      // 373: dastore
      // 374: aastore
      // 375: dup
      // 376: bipush 4
      // 377: bipush 2
      // 378: newarray 7
      // 37a: dup
      // 37b: bipush 0
      // 37c: ldc2_w 0.6
      // 37f: dastore
      // 380: dup
      // 381: bipush 1
      // 382: ldc2_w 0.2
      // 385: dastore
      // 386: aastore
      // 387: dup
      // 388: bipush 5
      // 389: bipush 2
      // 38a: newarray 7
      // 38c: dup
      // 38d: bipush 0
      // 38e: ldc2_w 0.2
      // 391: dastore
      // 392: dup
      // 393: bipush 1
      // 394: ldc2_w 0.2
      // 397: dastore
      // 398: aastore
      // 399: dup
      // 39a: bipush 6
      // 39c: bipush 2
      // 39d: newarray 7
      // 39f: dup
      // 3a0: bipush 0
      // 3a1: ldc2_w 0.2
      // 3a4: dastore
      // 3a5: dup
      // 3a6: bipush 1
      // 3a7: dconst_0
      // 3a8: dastore
      // 3a9: aastore
      // 3aa: dup
      // 3ab: bipush 7
      // 3ad: bipush 2
      // 3ae: newarray 7
      // 3b0: dup
      // 3b1: bipush 0
      // 3b2: ldc2_w 0.4
      // 3b5: dastore
      // 3b6: dup
      // 3b7: bipush 1
      // 3b8: dconst_0
      // 3b9: dastore
      // 3ba: aastore
      // 3bb: dup
      // 3bc: bipush 8
      // 3be: bipush 2
      // 3bf: newarray 7
      // 3c1: dup
      // 3c2: bipush 0
      // 3c3: ldc2_w 0.4
      // 3c6: dastore
      // 3c7: dup
      // 3c8: bipush 1
      // 3c9: ldc2_w -0.6
      // 3cc: dastore
      // 3cd: aastore
      // 3ce: dup
      // 3cf: bipush 9
      // 3d1: bipush 2
      // 3d2: newarray 7
      // 3d4: dup
      // 3d5: bipush 0
      // 3d6: ldc2_w 0.2
      // 3d9: dastore
      // 3da: dup
      // 3db: bipush 1
      // 3dc: ldc2_w -0.6
      // 3df: dastore
      // 3e0: aastore
      // 3e1: dup
      // 3e2: bipush 10
      // 3e4: bipush 2
      // 3e5: newarray 7
      // 3e7: dup
      // 3e8: bipush 0
      // 3e9: ldc2_w 0.2
      // 3ec: dastore
      // 3ed: dup
      // 3ee: bipush 1
      // 3ef: ldc2_w -0.4
      // 3f2: dastore
      // 3f3: aastore
      // 3f4: dup
      // 3f5: bipush 11
      // 3f7: bipush 2
      // 3f8: newarray 7
      // 3fa: dup
      // 3fb: bipush 0
      // 3fc: dconst_0
      // 3fd: dastore
      // 3fe: dup
      // 3ff: bipush 1
      // 400: ldc2_w -0.4
      // 403: dastore
      // 404: aastore
      // 405: aload 9
      // 407: aload 10
      // 409: iload 7
      // 40b: iload 8
      // 40d: bipush 1
      // 40e: invokespecial c6y$p__.sws (D[[D[I[IZZZ)V
      // 411: iload 3
      // 412: ifne 457
      // 415: goto 41c
      // 418: invokestatic c6y$p__.a (Loov;)Loov;
      // 41b: athrow
      // 41c: iload 6
      // 41e: bipush 4
      // 41f: goto 426
      // 422: invokestatic c6y$p__.a (Loov;)Loov;
      // 425: athrow
      // 426: if_icmpne 440
      // 429: aload 0
      // 42a: aload 9
      // 42c: aload 10
      // 42e: iload 7
      // 430: iload 8
      // 432: invokespecial c6y$p__.ei_ ([I[IZZ)V
      // 435: iload 3
      // 436: ifne 457
      // 439: goto 440
      // 43c: invokestatic c6y$p__.a (Loov;)Loov;
      // 43f: athrow
      // 440: aload 0
      // 441: ldc2_w 0.25
      // 444: bipush 2
      // 445: aload 9
      // 447: aload 10
      // 449: iload 7
      // 44b: iload 8
      // 44d: invokespecial c6y$p__.cwg (DI[I[IZZ)V
      // 450: goto 457
      // 453: invokestatic c6y$p__.a (Loov;)Loov;
      // 456: athrow
      // 457: aload 9
      // 459: bipush 0
      // 45a: iaload
      // 45b: istore 11
      // 45d: iload 11
      // 45f: ldc 16711680
      // 461: nop
      // 462: iand
      // 463: bipush 16
      // 465: ishr
      // 466: i2f
      // 467: ldc 255.0
      // 469: nop
      // 46a: fdiv
      // 46b: fstore 12
      // 46d: iload 11
      // 46f: ldc 65280
      // 471: nop
      // 472: iand
      // 473: bipush 8
      // 475: ishr
      // 476: i2f
      // 477: ldc 255.0
      // 479: nop
      // 47a: fdiv
      // 47b: fstore 13
      // 47d: iload 11
      // 47f: sipush 255
      // 482: iand
      // 483: bipush 0
      // 484: ishr
      // 485: i2f
      // 486: ldc 255.0
      // 488: nop
      // 489: fdiv
      // 48a: fstore 14
      // 48c: new c6y$mhn
      // 48f: dup
      // 490: aload 0
      // 491: getfield c6y$p__.oay Lt9d;
      // 494: aload 0
      // 495: getfield c6y$p__.o2v D
      // 498: aload 0
      // 499: getfield c6y$p__.kfp D
      // 49c: aload 0
      // 49d: getfield c6y$p__.vbd D
      // 4a0: invokespecial c6y$mhn.<init> (Lt9d;DDD)V
      // 4a3: astore 15
      // 4a5: aload 15
      // 4a7: fload 12
      // 4a9: fload 13
      // 4ab: fload 14
      // 4ad: invokevirtual c6y$mhn.mcd (FFF)V
      // 4b0: aload 0
      // 4b1: getfield c6y$p__.gnj Ljux;
      // 4b4: aload 15
      // 4b6: invokevirtual jux.o4t (Lflo;)V
      // 4b9: aload 0
      // 4ba: dup
      // 4bb: getfield c6y$p__.wg6 I
      // 4be: bipush 1
      // 4bf: iadd
      // 4c0: putfield c6y$p__.wg6 I
      // 4c3: aload 0
      // 4c4: getfield c6y$p__.wg6 I
      // 4c7: iload 3
      // 4c8: ifeq 4ef
      // 4cb: aload 0
      // 4cc: getfield c6y$p__.bx4 I
      // 4cf: goto 4d6
      // 4d2: invokestatic c6y$p__.a (Loov;)Loov;
      // 4d5: athrow
      // 4d6: if_icmple 570
      // 4d9: aload 0
      // 4da: iload 3
      // 4db: ifeq 56d
      // 4de: goto 4e5
      // 4e1: invokestatic c6y$p__.a (Loov;)Loov;
      // 4e4: athrow
      // 4e5: getfield c6y$p__.zwy Z
      // 4e8: goto 4ef
      // 4eb: invokestatic c6y$p__.a (Loov;)Loov;
      // 4ee: athrow
      // 4ef: ifeq 56c
      // 4f2: aload 0
      // 4f3: invokespecial c6y$p__.wwv ()Z
      // 4f6: istore 4
      // 4f8: new java/lang/StringBuilder
      // 4fb: dup
      // 4fc: invokespecial java/lang/StringBuilder.<init> ()V
      // 4ff: sipush 18047
      // 502: ldc2_w 1101195221926436505
      // 505: lload 1
      // 506: lxor
      // 507: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 50c: nop
      // 50d: iload 3
      // 50e: ifeq 53b
      // 511: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 514: iload 4
      // 516: ifeq 52e
      // 519: sipush 22872
      // 51c: ldc2_w 2951501174582854079
      // 51f: lload 1
      // 520: lxor
      // 521: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 526: nop
      // 527: goto 53c
      // 52a: invokestatic c6y$p__.a (Loov;)Loov;
      // 52d: athrow
      // 52e: sipush 16004
      // 531: ldc2_w 7498057126303475311
      // 534: lload 1
      // 535: lxor
      // 536: invokedynamic n (IJ)Ljava/lang/String; bsm=c6y$p__.c (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 53b: nop
      // 53c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 53f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 542: astore 5
      // 544: aload 0
      // 545: getfield c6y$p__.oay Lt9d;
      // 548: aload 0
      // 549: getfield c6y$p__.o2v D
      // 54c: aload 0
      // 54d: getfield c6y$p__.kfp D
      // 550: aload 0
      // 551: getfield c6y$p__.vbd D
      // 554: aload 5
      // 556: ldc 20.0
      // 558: nop
      // 559: ldc 0.9
      // 55b: nop
      // 55c: aload 0
      // 55d: getfield c6y$p__.z2d Ljava/util/Random;
      // 560: invokevirtual java/util/Random.nextFloat ()F
      // 563: ldc 0.15
      // 565: nop
      // 566: fmul
      // 567: fadd
      // 568: bipush 1
      // 569: invokevirtual OpaquePredicate.wd_ (DDDLjava/lang/String;FFZ)V
      // 56c: aload 0
      // 56d: invokevirtual c6y$p__._kl ()V
      // 570: return
   }

   private boolean wwv() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: invokestatic Minecraft.vz1 ()Lc05;
      // 07: astore 2
      // 08: aload 2
      // 09: iload 1
      // 0a: ifeq 18
      // 0d: ifnull 55
      // 10: goto 17
      // 13: invokestatic c6y$p__.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 2
      // 18: invokevirtual Minecraft.nsd ()Li2h;
      // 1b: iload 1
      // 1c: ifeq 34
      // 1f: ifnull 55
      // 22: goto 29
      // 25: invokestatic c6y$p__.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 2
      // 2a: invokevirtual Minecraft.nsd ()Li2h;
      // 2d: goto 34
      // 30: invokestatic c6y$p__.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: getfield c6y$p__.o2v D
      // 38: aload 0
      // 39: getfield c6y$p__.kfp D
      // 3c: aload 0
      // 3d: getfield c6y$p__.vbd D
      // 40: invokevirtual EntityLivingBase.p53 (DDD)D
      // 43: ldc2_w 256.0
      // 46: dcmpl
      // 47: iload 1
      // 48: ifeq 56
      // 4b: iflt 59
      // 4e: goto 55
      // 51: invokestatic c6y$p__.a (Loov;)Loov;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5a
      // 59: bipush 0
      // 5a: ireturn
   }

   private void u6m(
      double param1, double param3, double param5, double param7, double param9, double param11, int[] param13, int[] param14, boolean param15, boolean param16
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new c6y$v68
      // 03: dup
      // 04: aload 0
      // 05: getfield c6y$p__.oay Lt9d;
      // 08: dload 1
      // 09: dload 3
      // 0a: dload 5
      // 0c: dload 7
      // 0e: dload 9
      // 10: dload 11
      // 12: aload 0
      // 13: getfield c6y$p__.gnj Ljux;
      // 16: invokespecial c6y$v68.<init> (Lt9d;DDDDDDLjux;)V
      // 19: astore 18
      // 1b: aload 18
      // 1d: ldc 0.99
      // 1f: nop
      // 20: invokevirtual c6y$v68.rc6 (F)V
      // 23: invokestatic OpaquePredicate.c ()I
      // 26: aload 18
      // 28: iload 15
      // 2a: invokevirtual c6y$v68.kqe (Z)V
      // 2d: istore 17
      // 2f: aload 18
      // 31: iload 16
      // 33: invokevirtual c6y$v68.tvt (Z)V
      // 36: aload 0
      // 37: getfield c6y$p__.z2d Ljava/util/Random;
      // 3a: aload 13
      // 3c: arraylength
      // 3d: invokevirtual java/util/Random.nextInt (I)I
      // 40: istore 19
      // 42: aload 18
      // 44: aload 13
      // 46: iload 19
      // 48: iaload
      // 49: invokevirtual c6y$v68.fnk (I)V
      // 4c: iload 17
      // 4e: ifne 8c
      // 51: aload 14
      // 53: ifnull 83
      // 56: goto 5d
      // 59: invokestatic c6y$p__.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 14
      // 5f: arraylength
      // 60: ifle 83
      // 63: goto 6a
      // 66: invokestatic c6y$p__.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 18
      // 6c: aload 14
      // 6e: aload 0
      // 6f: getfield c6y$p__.z2d Ljava/util/Random;
      // 72: aload 14
      // 74: arraylength
      // 75: invokevirtual java/util/Random.nextInt (I)I
      // 78: iaload
      // 79: invokevirtual c6y$v68.nll (I)V
      // 7c: goto 83
      // 7f: invokestatic c6y$p__.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 0
      // 84: getfield c6y$p__.gnj Ljux;
      // 87: aload 18
      // 89: invokevirtual jux.o4t (Lflo;)V
      // 8c: return
   }

   private void cwg(double param1, int param3, int[] param4, int[] param5, boolean param6, boolean param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield c6y$p__.o2v D
      // 004: dstore 9
      // 006: aload 0
      // 007: getfield c6y$p__.kfp D
      // 00a: dstore 11
      // 00c: aload 0
      // 00d: getfield c6y$p__.vbd D
      // 010: dstore 13
      // 012: invokestatic OpaquePredicate.b ()I
      // 015: iload 3
      // 016: ineg
      // 017: istore 15
      // 019: istore 8
      // 01b: iload 15
      // 01d: iload 3
      // 01e: if_icmpgt 158
      // 021: iload 3
      // 022: ineg
      // 023: istore 16
      // 025: iload 16
      // 027: iload 3
      // 028: if_icmpgt 150
      // 02b: iload 3
      // 02c: ineg
      // 02d: iload 8
      // 02f: ifeq 01d
      // 032: istore 17
      // 034: iload 17
      // 036: iload 3
      // 037: if_icmpgt 148
      // 03a: iload 16
      // 03c: i2d
      // 03d: aload 0
      // 03e: getfield c6y$p__.z2d Ljava/util/Random;
      // 041: invokevirtual java/util/Random.nextDouble ()D
      // 044: aload 0
      // 045: getfield c6y$p__.z2d Ljava/util/Random;
      // 048: invokevirtual java/util/Random.nextDouble ()D
      // 04b: dsub
      // 04c: ldc2_w 0.5
      // 04f: dmul
      // 050: dadd
      // 051: dstore 18
      // 053: iload 15
      // 055: i2d
      // 056: aload 0
      // 057: getfield c6y$p__.z2d Ljava/util/Random;
      // 05a: invokevirtual java/util/Random.nextDouble ()D
      // 05d: aload 0
      // 05e: getfield c6y$p__.z2d Ljava/util/Random;
      // 061: invokevirtual java/util/Random.nextDouble ()D
      // 064: dsub
      // 065: ldc2_w 0.5
      // 068: dmul
      // 069: dadd
      // 06a: dstore 20
      // 06c: iload 17
      // 06e: i2d
      // 06f: aload 0
      // 070: getfield c6y$p__.z2d Ljava/util/Random;
      // 073: invokevirtual java/util/Random.nextDouble ()D
      // 076: aload 0
      // 077: getfield c6y$p__.z2d Ljava/util/Random;
      // 07a: invokevirtual java/util/Random.nextDouble ()D
      // 07d: dsub
      // 07e: ldc2_w 0.5
      // 081: dmul
      // 082: dadd
      // 083: dstore 22
      // 085: dload 18
      // 087: dload 18
      // 089: dmul
      // 08a: dload 20
      // 08c: dload 20
      // 08e: dmul
      // 08f: dadd
      // 090: dload 22
      // 092: dload 22
      // 094: dmul
      // 095: dadd
      // 096: invokestatic fe6.dii (D)F
      // 099: f2d
      // 09a: dload 1
      // 09b: ddiv
      // 09c: aload 0
      // 09d: getfield c6y$p__.z2d Ljava/util/Random;
      // 0a0: invokevirtual java/util/Random.nextGaussian ()D
      // 0a3: ldc2_w 0.05
      // 0a6: dmul
      // 0a7: dadd
      // 0a8: dstore 24
      // 0aa: aload 0
      // 0ab: dload 9
      // 0ad: dload 11
      // 0af: dload 13
      // 0b1: dload 18
      // 0b3: dload 24
      // 0b5: ddiv
      // 0b6: dload 20
      // 0b8: dload 24
      // 0ba: ddiv
      // 0bb: dload 22
      // 0bd: dload 24
      // 0bf: ddiv
      // 0c0: aload 4
      // 0c2: aload 5
      // 0c4: iload 6
      // 0c6: iload 7
      // 0c8: invokespecial c6y$p__.u6m (DDDDDD[I[IZZ)V
      // 0cb: iload 8
      // 0cd: ifeq 143
      // 0d0: iload 15
      // 0d2: iload 3
      // 0d3: ineg
      // 0d4: iload 8
      // 0d6: ifeq 028
      // 0d9: goto 0e0
      // 0dc: invokestatic c6y$p__.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: if_icmpeq 140
      // 0e3: iload 15
      // 0e5: iload 3
      // 0e6: iload 8
      // 0e8: ifeq 107
      // 0eb: goto 0f2
      // 0ee: invokestatic c6y$p__.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: if_icmpeq 140
      // 0f5: goto 0fc
      // 0f8: invokestatic c6y$p__.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: iload 16
      // 0fe: iload 3
      // 0ff: ineg
      // 100: goto 107
      // 103: invokestatic c6y$p__.a (Loov;)Loov;
      // 106: athrow
      // 107: iload 8
      // 109: ifeq 120
      // 10c: if_icmpeq 140
      // 10f: goto 116
      // 112: invokestatic c6y$p__.a (Loov;)Loov;
      // 115: athrow
      // 116: iload 16
      // 118: iload 3
      // 119: goto 120
      // 11c: invokestatic c6y$p__.a (Loov;)Loov;
      // 11f: athrow
      // 120: iload 8
      // 122: ifeq 13d
      // 125: if_icmpeq 140
      // 128: goto 12f
      // 12b: invokestatic c6y$p__.a (Loov;)Loov;
      // 12e: athrow
      // 12f: iload 17
      // 131: iload 3
      // 132: bipush 2
      // 133: imul
      // 134: bipush 1
      // 135: isub
      // 136: goto 13d
      // 139: invokestatic c6y$p__.a (Loov;)Loov;
      // 13c: athrow
      // 13d: iadd
      // 13e: istore 17
      // 140: iinc 17 1
      // 143: iload 8
      // 145: ifne 034
      // 148: iinc 16 1
      // 14b: iload 8
      // 14d: ifne 025
      // 150: iinc 15 1
      // 153: iload 8
      // 155: ifne 01b
      // 158: return
   }

   private void sws(double var1, double[][] var3, int[] var4, int[] var5, boolean var6, boolean var7, boolean var8) {
      double var10 = var3[0][0];
      int var10000 = OpaquePredicate.b();
      double var12 = var3[0][1];
      this.u6m(this.o2v, this.kfp, this.vbd, var10 * var1, var12 * var1, 0.0, var4, var5, var6, var7);
      int var9 = var10000;
      float var14 = this.z2d.nextFloat() * (float) Math.PI;

      label81: {
         try {
            if (var8) {
               var42 = 0.034;
               break label81;
            }
         } catch (oov var40) {
            throw a(var40);
         }

         var42 = 0.34;
      }

      double var15 = var42;
      int var17 = 0;

      while (var17 < 3) {
         double var18 = (double)var14 + (double)((float)var17 * (float) Math.PI) * var15;
         double var20 = var10;
         double var43 = var12;

         label71:
         while (true) {
            double var22 = var43;
            int var24 = 1;

            while (var24 < var3.length) {
               double var25 = var3[var24][0];
               double var27 = var3[var24][1];
               var43 = 0.25;
               if (var9 == 0) {
                  continue label71;
               }

               double var29 = 0.25;

               while (true) {
                  if (var29 <= 1.0) {
                     double var31 = (var20 + (var25 - var20) * var29) * var1;
                     double var33 = (var22 + (var27 - var22) * var29) * var1;
                     double var35 = var31 * Math.sin(var18);
                     var31 *= Math.cos(var18);
                     var44 = -1.0;
                     if (var9 == 0) {
                        break;
                     }

                     double var37 = -1.0;

                     label60: {
                        while (var37 <= 1.0) {
                           this.u6m(this.o2v, this.kfp, this.vbd, var31 * var37, var33, var35 * var37, var4, var5, var6, var7);
                           var37 += 2.0;

                           try {
                              if (var9 == 0) {
                                 break label60;
                              }

                              if (var9 == 0) {
                                 break;
                              }
                           } catch (oov var39) {
                              throw a(var39);
                           }
                        }

                        var29 += 0.25;
                     }

                     if (var9 != 0) {
                        continue;
                     }
                  }

                  var20 = var25;
                  var44 = var27;
                  break;
               }

               var22 = var44;
               var24++;
               if (var9 == 0) {
                  break;
               }
            }

            var17++;
            if (var9 == 0) {
               return;
            }
            break;
         }
      }
   }

   private void ei_(int[] var1, int[] var2, boolean var3, boolean var4) {
      double var6 = this.z2d.nextGaussian() * 0.05;
      double var8 = this.z2d.nextGaussian() * 0.05;
      int var10000 = OpaquePredicate.b();
      int var10 = 0;
      int var5 = var10000;

      while (var10 < 70) {
         double var11 = this.icv * 0.5 + this.z2d.nextGaussian() * 0.15 + var6;
         double var13 = this.bw4 * 0.5 + this.z2d.nextGaussian() * 0.15 + var8;
         double var15 = this.mop * 0.5 + this.z2d.nextDouble() * 0.5;
         this.u6m(this.o2v, this.kfp, this.vbd, var11, var15, var13, var1, var2, var3, var4);
         var10++;
         if (var5 == 0) {
            break;
         }
      }
   }

   @Override
   public int ikr() {
      return 0;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-7251864287521210205L, 3517762839078142217L, MethodHandles.lookup().lookupClass()).a(216841839077929L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 8249745430696L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[15];
      int var7 = 0;
      String var6 = "\u0099\u0094\u0090còÅ\u001c\u0083L0D\u0001ô¸³Ç\u0010\nü\u009d.rÈ\u008b\u0016\u0089É\u0081A¶!\u0083¤ 6\u001cpU\u00013I5ÂY\u001a\u001bd\u0099æóÐÔuÅÂ\r!ô)ÖÖÖÜ±D¡\u0010ü\u0099ÀÌ%â3\u0081\u009cÕ\u009c,kpÁ½ \u001biÈÑàÀ&<Î\u0097<=\u000eµ\u0007\u0085\u0099 YAiI!Þs¨`RK¸\u009e»\u0018&|\u0092ytè¾^Ésr\u0001\u0088à·E\"È«\u0097ú÷mi\u0010\u007f1$²\u001cÂÏQÛ\u007f\u0096Ç'\u001b\u0007\u0096\u0018k_pÜ\u0095q\u007f\u000f\u0080gØDB\u0087'_\u0019M<áRy\u0089²\u0010\u0016Þ®AÒÚ×Êg\u0085]`BÃß² Î\u0013\u001a\u0010\u0085¶½Néc\u001bS\u0019{Ì\r\u007fÐ\u008es~ÍâöÈý\u0007n\u0092«{\u0094\u0010\u0006^$\u009d¼F]\u000f9¶\u0018B¨Üv\u0017\u0010SñF\u0093g\u0000L\u0002h\u0016e¢\u000eþ\u008c% Pm  AËgÐ\u0087ªQà\u008e&¿H\u0019³ ±ÊZ&\u0093y%ÝÍ±ÖÇ ";
      int var8 = "\u0099\u0094\u0090còÅ\u001c\u0083L0D\u0001ô¸³Ç\u0010\nü\u009d.rÈ\u008b\u0016\u0089É\u0081A¶!\u0083¤ 6\u001cpU\u00013I5ÂY\u001a\u001bd\u0099æóÐÔuÅÂ\r!ô)ÖÖÖÜ±D¡\u0010ü\u0099ÀÌ%â3\u0081\u009cÕ\u009c,kpÁ½ \u001biÈÑàÀ&<Î\u0097<=\u000eµ\u0007\u0085\u0099 YAiI!Þs¨`RK¸\u009e»\u0018&|\u0092ytè¾^Ésr\u0001\u0088à·E\"È«\u0097ú÷mi\u0010\u007f1$²\u001cÂÏQÛ\u007f\u0096Ç'\u001b\u0007\u0096\u0018k_pÜ\u0095q\u007f\u000f\u0080gØDB\u0087'_\u0019M<áRy\u0089²\u0010\u0016Þ®AÒÚ×Êg\u0085]`BÃß² Î\u0013\u001a\u0010\u0085¶½Néc\u001bS\u0019{Ì\r\u007fÐ\u008es~ÍâöÈý\u0007n\u0092«{\u0094\u0010\u0006^$\u009d¼F]\u000f9¶\u0018B¨Üv\u0017\u0010SñF\u0093g\u0000L\u0002h\u0016e¢\u000eþ\u008c% Pm  AËgÐ\u0087ªQà\u008e&¿H\u0019³ ±ÊZ&\u0093y%ÝÍ±ÖÇ "
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = c(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     h = var9;
                     i = new String[15];
                     return;
                  }

                  var5 = var6.charAt(var12);
                  break;
               default:
                  var9[var7++] = var20;
                  if ((var12 += var5) < var8) {
                     var5 = var6.charAt(var12);
                     continue label27;
                  }

                  var6 = "âìq\u0005\u008c\u007f\u0094B\u009fyÓ\u0011¶Ï9b\u0010ýÍ³¯¤\u0088A°$Ó{Ôh\u0080\u000fB";
                  var8 = "âìq\u0005\u008c\u007f\u0094B\u009fyÓ\u0011¶Ï9b\u0010ýÍ³¯¤\u0088A°$Ó{Ôh\u0080\u000fB".length();
                  var5 = 16;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov a(oov var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1441;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])m.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("c6y$p__", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("c6y$p__" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
