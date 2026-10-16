import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class _98 extends so9 {
   public int txl = ((nie)this.m5v).w9t();

   public _98(hr_ var1) {
      super(var1, new nie(), 0.5F);
   }

   public boolean rs2(c9p param1, _aq param2, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: dload 3
      // 09: dload 5
      // 0b: dload 7
      // 0d: invokespecial so9.u8l (Lyqv;L_aq;DDD)Z
      // 10: iload 9
      // 12: ifeq 29
      // 15: ifeq 25
      // 18: goto 1f
      // 1b: invokestatic _98.a (Loov;)Loov;
      // 1e: athrow
      // 1f: bipush 1
      // 20: ireturn
      // 21: invokestatic _98.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 1
      // 26: invokevirtual c9p._sb ()Z
      // 29: iload 9
      // 2b: ifeq a0
      // 2e: ifeq 9f
      // 31: goto 38
      // 34: invokestatic _98.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 1
      // 39: invokevirtual c9p.e6m ()Lg_3;
      // 3c: astore 10
      // 3e: aload 10
      // 40: ifnull 9f
      // 43: aload 0
      // 44: aload 10
      // 46: aload 10
      // 48: getfield g_3.ikl F
      // 4b: f2d
      // 4c: ldc2_w 0.5
      // 4f: dmul
      // 50: fconst_1
      // 51: invokespecial _98.v_e (Lg_3;DF)Lfqr;
      // 54: astore 11
      // 56: aload 0
      // 57: aload 1
      // 58: aload 1
      // 59: invokevirtual c9p.c5y ()F
      // 5c: f2d
      // 5d: fconst_1
      // 5e: invokespecial _98.v_e (Lg_3;DF)Lfqr;
      // 61: astore 12
      // 63: aload 2
      // 64: aload 12
      // 66: getfield fqr.lvi D
      // 69: aload 12
      // 6b: getfield fqr.gn5 D
      // 6e: aload 12
      // 70: getfield fqr.bn2 D
      // 73: aload 11
      // 75: getfield fqr.lvi D
      // 78: aload 11
      // 7a: getfield fqr.gn5 D
      // 7d: aload 11
      // 7f: getfield fqr.bn2 D
      // 82: invokestatic nh4.kje (DDDDDD)Lnh4;
      // 85: invokeinterface _aq.n2v (Lnh4;)Z 2
      // 8a: iload 9
      // 8c: ifeq a0
      // 8f: ifeq 9f
      // 92: goto 99
      // 95: invokestatic _98.a (Loov;)Loov;
      // 98: athrow
      // 99: bipush 1
      // 9a: ireturn
      // 9b: invokestatic _98.a (Loov;)Loov;
      // 9e: athrow
      // 9f: bipush 0
      // a0: ireturn
   }

   private fqr v_e(g_3 var1, double var2, float var4) {
      double var5 = var1.ivp + (var1.o2v - var1.ivp) * (double)var4;
      double var7 = var2 + var1.c54 + (var1.kfp - var1.c54) * (double)var4;
      double var9 = var1.e2b + (var1.vbd - var1.e2b) * (double)var4;
      return new fqr(var5, var7, var9);
   }

   public void knk(c9p param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 10
      // 005: aload 0
      // 006: iload 10
      // 008: ifne 043
      // 00b: getfield _98.txl I
      // 00e: aload 0
      // 00f: getfield _98.m5v Lg6r;
      // 012: checkcast nie
      // 015: invokevirtual nie.w9t ()I
      // 018: if_icmpeq 042
      // 01b: goto 022
      // 01e: invokestatic _98.a (Loov;)Loov;
      // 021: athrow
      // 022: aload 0
      // 023: new nie
      // 026: dup
      // 027: invokespecial nie.<init> ()V
      // 02a: putfield _98.m5v Lg6r;
      // 02d: aload 0
      // 02e: aload 0
      // 02f: getfield _98.m5v Lg6r;
      // 032: checkcast nie
      // 035: invokevirtual nie.w9t ()I
      // 038: putfield _98.txl I
      // 03b: goto 042
      // 03e: invokestatic _98.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: aload 1
      // 044: dload 2
      // 045: dload 4
      // 047: dload 6
      // 049: fload 8
      // 04b: fload 9
      // 04d: invokespecial so9.w_x (Lyqv;DDDFF)V
      // 050: aload 1
      // 051: invokevirtual c9p.e6m ()Lg_3;
      // 054: astore 11
      // 056: aload 11
      // 058: ifnull 481
      // 05b: aload 1
      // 05c: fload 9
      // 05e: invokevirtual c9p.z3d (F)F
      // 061: fstore 12
      // 063: invokestatic jom.yut ()Ljom;
      // 066: astore 13
      // 068: aload 13
      // 06a: invokevirtual jom.zuq ()Lq3g;
      // 06d: astore 14
      // 06f: aload 0
      // 070: getstatic _98.gzp Lgdz;
      // 073: invokevirtual _98.gu4 (Lgdz;)V
      // 076: sipush 3553
      // 079: sipush 10242
      // 07c: ldc 10497.0
      // 07e: nop
      // 07f: invokestatic org/lwjgl/opengl/GL11.glTexParameterf (IIF)V
      // 082: sipush 3553
      // 085: sipush 10243
      // 088: ldc 10497.0
      // 08a: nop
      // 08b: invokestatic org/lwjgl/opengl/GL11.glTexParameterf (IIF)V
      // 08e: invokestatic hzu.fpt ()V
      // 091: invokestatic hzu.o1b ()V
      // 094: invokestatic hzu.ux6 ()V
      // 097: bipush 1
      // 098: invokestatic hzu.jun (Z)V
      // 09b: ldc 240.0
      // 09d: nop
      // 09e: fstore 15
      // 0a0: getstatic gis.exn I
      // 0a3: fload 15
      // 0a5: fload 15
      // 0a7: invokestatic gis.w9e (IFF)V
      // 0aa: sipush 770
      // 0ad: bipush 1
      // 0ae: bipush 1
      // 0af: bipush 0
      // 0b0: invokestatic hzu.u39 (IIII)V
      // 0b3: aload 1
      // 0b4: getfield c9p.oay Lt9d;
      // 0b7: invokevirtual t9d.p2b ()J
      // 0ba: l2f
      // 0bb: fload 9
      // 0bd: fadd
      // 0be: fstore 16
      // 0c0: fload 16
      // 0c2: ldc 0.5
      // 0c4: nop
      // 0c5: fmul
      // 0c6: fconst_1
      // 0c7: frem
      // 0c8: fstore 17
      // 0ca: aload 1
      // 0cb: invokevirtual c9p.c5y ()F
      // 0ce: fstore 18
      // 0d0: invokestatic hzu.dp2 ()V
      // 0d3: dload 2
      // 0d4: d2f
      // 0d5: dload 4
      // 0d7: d2f
      // 0d8: fload 18
      // 0da: fadd
      // 0db: dload 6
      // 0dd: d2f
      // 0de: invokestatic hzu.a4k (FFF)V
      // 0e1: aload 0
      // 0e2: aload 11
      // 0e4: aload 11
      // 0e6: getfield g_3.ikl F
      // 0e9: f2d
      // 0ea: ldc2_w 0.5
      // 0ed: dmul
      // 0ee: fload 9
      // 0f0: invokespecial _98.v_e (Lg_3;DF)Lfqr;
      // 0f3: astore 19
      // 0f5: aload 0
      // 0f6: aload 1
      // 0f7: fload 18
      // 0f9: f2d
      // 0fa: fload 9
      // 0fc: invokespecial _98.v_e (Lg_3;DF)Lfqr;
      // 0ff: astore 20
      // 101: aload 19
      // 103: aload 20
      // 105: invokevirtual fqr._kk (Lfqr;)Lfqr;
      // 108: astore 21
      // 10a: aload 21
      // 10c: invokevirtual fqr.vtb ()D
      // 10f: dconst_1
      // 110: dadd
      // 111: dstore 22
      // 113: aload 21
      // 115: invokevirtual fqr.kec ()Lfqr;
      // 118: astore 21
      // 11a: aload 21
      // 11c: getfield fqr.gn5 D
      // 11f: invokestatic java/lang/Math.acos (D)D
      // 122: d2f
      // 123: fstore 24
      // 125: aload 21
      // 127: getfield fqr.bn2 D
      // 12a: aload 21
      // 12c: getfield fqr.lvi D
      // 12f: invokestatic java/lang/Math.atan2 (DD)D
      // 132: d2f
      // 133: fstore 25
      // 135: ldc 1.5707964
      // 137: nop
      // 138: fload 25
      // 13a: fneg
      // 13b: fadd
      // 13c: ldc 57.295776
      // 13e: nop
      // 13f: fmul
      // 140: fconst_0
      // 141: fconst_1
      // 142: fconst_0
      // 143: invokestatic hzu.a2h (FFFF)V
      // 146: fload 24
      // 148: ldc 57.295776
      // 14a: nop
      // 14b: fmul
      // 14c: fconst_1
      // 14d: fconst_0
      // 14e: fconst_0
      // 14f: invokestatic hzu.a2h (FFFF)V
      // 152: bipush 1
      // 153: istore 26
      // 155: fload 16
      // 157: f2d
      // 158: ldc2_w 0.05
      // 15b: dmul
      // 15c: dconst_1
      // 15d: iload 26
      // 15f: bipush 1
      // 160: iand
      // 161: i2d
      // 162: ldc2_w 2.5
      // 165: dmul
      // 166: dsub
      // 167: dmul
      // 168: dstore 27
      // 16a: aload 14
      // 16c: bipush 7
      // 16e: getstatic gnl.rad Lbe7;
      // 171: invokevirtual q3g.ezr (ILbe7;)V
      // 174: fload 12
      // 176: fload 12
      // 178: fmul
      // 179: fstore 29
      // 17b: bipush 64
      // 17d: fload 29
      // 17f: ldc 240.0
      // 181: nop
      // 182: fmul
      // 183: f2i
      // 184: iadd
      // 185: istore 30
      // 187: bipush 32
      // 189: fload 29
      // 18b: ldc 192.0
      // 18d: nop
      // 18e: fmul
      // 18f: f2i
      // 190: iadd
      // 191: istore 31
      // 193: sipush 128
      // 196: fload 29
      // 198: ldc 64.0
      // 19a: nop
      // 19b: fmul
      // 19c: f2i
      // 19d: isub
      // 19e: istore 32
      // 1a0: iload 26
      // 1a2: i2d
      // 1a3: ldc2_w 0.2
      // 1a6: dmul
      // 1a7: dstore 33
      // 1a9: dload 33
      // 1ab: ldc2_w 1.41
      // 1ae: dmul
      // 1af: dstore 35
      // 1b1: dconst_0
      // 1b2: dload 27
      // 1b4: ldc2_w 2.356194490192345
      // 1b7: dadd
      // 1b8: invokestatic java/lang/Math.cos (D)D
      // 1bb: dload 35
      // 1bd: dmul
      // 1be: dadd
      // 1bf: dstore 37
      // 1c1: dconst_0
      // 1c2: dload 27
      // 1c4: ldc2_w 2.356194490192345
      // 1c7: dadd
      // 1c8: invokestatic java/lang/Math.sin (D)D
      // 1cb: dload 35
      // 1cd: dmul
      // 1ce: dadd
      // 1cf: dstore 39
      // 1d1: dconst_0
      // 1d2: dload 27
      // 1d4: ldc2_w 0.7853981633974483
      // 1d7: dadd
      // 1d8: invokestatic java/lang/Math.cos (D)D
      // 1db: dload 35
      // 1dd: dmul
      // 1de: dadd
      // 1df: dstore 41
      // 1e1: dconst_0
      // 1e2: dload 27
      // 1e4: ldc2_w 0.7853981633974483
      // 1e7: dadd
      // 1e8: invokestatic java/lang/Math.sin (D)D
      // 1eb: dload 35
      // 1ed: dmul
      // 1ee: dadd
      // 1ef: dstore 43
      // 1f1: dconst_0
      // 1f2: dload 27
      // 1f4: ldc2_w 3.9269908169872414
      // 1f7: dadd
      // 1f8: invokestatic java/lang/Math.cos (D)D
      // 1fb: dload 35
      // 1fd: dmul
      // 1fe: dadd
      // 1ff: dstore 45
      // 201: dconst_0
      // 202: dload 27
      // 204: ldc2_w 3.9269908169872414
      // 207: dadd
      // 208: invokestatic java/lang/Math.sin (D)D
      // 20b: dload 35
      // 20d: dmul
      // 20e: dadd
      // 20f: dstore 47
      // 211: dconst_0
      // 212: dload 27
      // 214: ldc2_w 5.497787143782138
      // 217: dadd
      // 218: invokestatic java/lang/Math.cos (D)D
      // 21b: dload 35
      // 21d: dmul
      // 21e: dadd
      // 21f: dstore 49
      // 221: dconst_0
      // 222: dload 27
      // 224: ldc2_w 5.497787143782138
      // 227: dadd
      // 228: invokestatic java/lang/Math.sin (D)D
      // 22b: dload 35
      // 22d: dmul
      // 22e: dadd
      // 22f: dstore 51
      // 231: dconst_0
      // 232: dload 27
      // 234: ldc2_w 3.141592653589793
      // 237: dadd
      // 238: invokestatic java/lang/Math.cos (D)D
      // 23b: dload 33
      // 23d: dmul
      // 23e: dadd
      // 23f: dstore 53
      // 241: dconst_0
      // 242: dload 27
      // 244: ldc2_w 3.141592653589793
      // 247: dadd
      // 248: invokestatic java/lang/Math.sin (D)D
      // 24b: dload 33
      // 24d: dmul
      // 24e: dadd
      // 24f: dstore 55
      // 251: dconst_0
      // 252: dload 27
      // 254: dconst_0
      // 255: dadd
      // 256: invokestatic java/lang/Math.cos (D)D
      // 259: dload 33
      // 25b: dmul
      // 25c: dadd
      // 25d: dstore 57
      // 25f: dconst_0
      // 260: dload 27
      // 262: dconst_0
      // 263: dadd
      // 264: invokestatic java/lang/Math.sin (D)D
      // 267: dload 33
      // 269: dmul
      // 26a: dadd
      // 26b: dstore 59
      // 26d: dconst_0
      // 26e: dload 27
      // 270: ldc2_w 1.5707963267948966
      // 273: dadd
      // 274: invokestatic java/lang/Math.cos (D)D
      // 277: dload 33
      // 279: dmul
      // 27a: dadd
      // 27b: dstore 61
      // 27d: dconst_0
      // 27e: dload 27
      // 280: ldc2_w 1.5707963267948966
      // 283: dadd
      // 284: invokestatic java/lang/Math.sin (D)D
      // 287: dload 33
      // 289: dmul
      // 28a: dadd
      // 28b: dstore 63
      // 28d: dconst_0
      // 28e: dload 27
      // 290: ldc2_w 4.71238898038469
      // 293: dadd
      // 294: invokestatic java/lang/Math.cos (D)D
      // 297: dload 33
      // 299: dmul
      // 29a: dadd
      // 29b: dstore 65
      // 29d: dconst_0
      // 29e: dload 27
      // 2a0: ldc2_w 4.71238898038469
      // 2a3: dadd
      // 2a4: invokestatic java/lang/Math.sin (D)D
      // 2a7: dload 33
      // 2a9: dmul
      // 2aa: dadd
      // 2ab: dstore 67
      // 2ad: dconst_0
      // 2ae: dstore 69
      // 2b0: ldc2_w 0.4999
      // 2b3: dstore 71
      // 2b5: ldc -1.0
      // 2b7: nop
      // 2b8: fload 17
      // 2ba: fadd
      // 2bb: f2d
      // 2bc: dstore 73
      // 2be: dload 22
      // 2c0: ldc2_w 0.5
      // 2c3: dload 33
      // 2c5: ddiv
      // 2c6: dmul
      // 2c7: dload 73
      // 2c9: dadd
      // 2ca: dstore 75
      // 2cc: aload 14
      // 2ce: dload 53
      // 2d0: dload 22
      // 2d2: dload 55
      // 2d4: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2d7: ldc2_w 0.4999
      // 2da: dload 75
      // 2dc: invokevirtual q3g.h0a (DD)Lq3g;
      // 2df: iload 30
      // 2e1: iload 31
      // 2e3: iload 32
      // 2e5: sipush 255
      // 2e8: invokevirtual q3g.fje (IIII)Lq3g;
      // 2eb: invokevirtual q3g.pzw ()V
      // 2ee: aload 14
      // 2f0: dload 53
      // 2f2: dconst_0
      // 2f3: dload 55
      // 2f5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2f8: ldc2_w 0.4999
      // 2fb: dload 73
      // 2fd: invokevirtual q3g.h0a (DD)Lq3g;
      // 300: iload 30
      // 302: iload 31
      // 304: iload 32
      // 306: sipush 255
      // 309: invokevirtual q3g.fje (IIII)Lq3g;
      // 30c: invokevirtual q3g.pzw ()V
      // 30f: aload 14
      // 311: dload 57
      // 313: dconst_0
      // 314: dload 59
      // 316: invokevirtual q3g.g5o (DDD)Lq3g;
      // 319: dconst_0
      // 31a: dload 73
      // 31c: invokevirtual q3g.h0a (DD)Lq3g;
      // 31f: iload 30
      // 321: iload 31
      // 323: iload 32
      // 325: sipush 255
      // 328: invokevirtual q3g.fje (IIII)Lq3g;
      // 32b: invokevirtual q3g.pzw ()V
      // 32e: aload 14
      // 330: dload 57
      // 332: dload 22
      // 334: dload 59
      // 336: invokevirtual q3g.g5o (DDD)Lq3g;
      // 339: dconst_0
      // 33a: dload 75
      // 33c: invokevirtual q3g.h0a (DD)Lq3g;
      // 33f: iload 30
      // 341: iload 31
      // 343: iload 32
      // 345: sipush 255
      // 348: invokevirtual q3g.fje (IIII)Lq3g;
      // 34b: invokevirtual q3g.pzw ()V
      // 34e: aload 14
      // 350: dload 61
      // 352: dload 22
      // 354: dload 63
      // 356: invokevirtual q3g.g5o (DDD)Lq3g;
      // 359: ldc2_w 0.4999
      // 35c: dload 75
      // 35e: invokevirtual q3g.h0a (DD)Lq3g;
      // 361: iload 30
      // 363: iload 31
      // 365: iload 32
      // 367: sipush 255
      // 36a: invokevirtual q3g.fje (IIII)Lq3g;
      // 36d: invokevirtual q3g.pzw ()V
      // 370: aload 14
      // 372: dload 61
      // 374: dconst_0
      // 375: dload 63
      // 377: invokevirtual q3g.g5o (DDD)Lq3g;
      // 37a: ldc2_w 0.4999
      // 37d: dload 73
      // 37f: invokevirtual q3g.h0a (DD)Lq3g;
      // 382: iload 30
      // 384: iload 31
      // 386: iload 32
      // 388: sipush 255
      // 38b: invokevirtual q3g.fje (IIII)Lq3g;
      // 38e: invokevirtual q3g.pzw ()V
      // 391: aload 14
      // 393: dload 65
      // 395: dconst_0
      // 396: dload 67
      // 398: invokevirtual q3g.g5o (DDD)Lq3g;
      // 39b: dconst_0
      // 39c: dload 73
      // 39e: invokevirtual q3g.h0a (DD)Lq3g;
      // 3a1: iload 30
      // 3a3: iload 31
      // 3a5: iload 32
      // 3a7: sipush 255
      // 3aa: invokevirtual q3g.fje (IIII)Lq3g;
      // 3ad: invokevirtual q3g.pzw ()V
      // 3b0: aload 14
      // 3b2: dload 65
      // 3b4: dload 22
      // 3b6: dload 67
      // 3b8: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3bb: dconst_0
      // 3bc: dload 75
      // 3be: invokevirtual q3g.h0a (DD)Lq3g;
      // 3c1: iload 30
      // 3c3: iload 31
      // 3c5: iload 32
      // 3c7: sipush 255
      // 3ca: invokevirtual q3g.fje (IIII)Lq3g;
      // 3cd: invokevirtual q3g.pzw ()V
      // 3d0: dconst_0
      // 3d1: dstore 77
      // 3d3: iload 10
      // 3d5: ifne 47e
      // 3d8: aload 1
      // 3d9: getfield c9p.g25 I
      // 3dc: bipush 2
      // 3dd: irem
      // 3de: ifne 3ed
      // 3e1: goto 3e8
      // 3e4: invokestatic _98.a (Loov;)Loov;
      // 3e7: athrow
      // 3e8: ldc2_w 0.5
      // 3eb: dstore 77
      // 3ed: aload 14
      // 3ef: dload 37
      // 3f1: dload 22
      // 3f3: dload 39
      // 3f5: invokevirtual q3g.g5o (DDD)Lq3g;
      // 3f8: ldc2_w 0.5
      // 3fb: dload 77
      // 3fd: ldc2_w 0.5
      // 400: dadd
      // 401: invokevirtual q3g.h0a (DD)Lq3g;
      // 404: iload 30
      // 406: iload 31
      // 408: iload 32
      // 40a: sipush 255
      // 40d: invokevirtual q3g.fje (IIII)Lq3g;
      // 410: invokevirtual q3g.pzw ()V
      // 413: aload 14
      // 415: dload 41
      // 417: dload 22
      // 419: dload 43
      // 41b: invokevirtual q3g.g5o (DDD)Lq3g;
      // 41e: dconst_1
      // 41f: dload 77
      // 421: ldc2_w 0.5
      // 424: dadd
      // 425: invokevirtual q3g.h0a (DD)Lq3g;
      // 428: iload 30
      // 42a: iload 31
      // 42c: iload 32
      // 42e: sipush 255
      // 431: invokevirtual q3g.fje (IIII)Lq3g;
      // 434: invokevirtual q3g.pzw ()V
      // 437: aload 14
      // 439: dload 49
      // 43b: dload 22
      // 43d: dload 51
      // 43f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 442: dconst_1
      // 443: dload 77
      // 445: invokevirtual q3g.h0a (DD)Lq3g;
      // 448: iload 30
      // 44a: iload 31
      // 44c: iload 32
      // 44e: sipush 255
      // 451: invokevirtual q3g.fje (IIII)Lq3g;
      // 454: invokevirtual q3g.pzw ()V
      // 457: aload 14
      // 459: dload 45
      // 45b: dload 22
      // 45d: dload 47
      // 45f: invokevirtual q3g.g5o (DDD)Lq3g;
      // 462: ldc2_w 0.5
      // 465: dload 77
      // 467: invokevirtual q3g.h0a (DD)Lq3g;
      // 46a: iload 30
      // 46c: iload 31
      // 46e: iload 32
      // 470: sipush 255
      // 473: invokevirtual q3g.fje (IIII)Lq3g;
      // 476: invokevirtual q3g.pzw ()V
      // 479: aload 13
      // 47b: invokevirtual jom.q7g ()V
      // 47e: invokestatic hzu.x3w ()V
      // 481: return
   }

   public void nsy(c9p var1, float var2) {
      try {
         if (var1.mzk()) {
            hzu.syc(2.35F, 2.35F, 2.35F);
         }
      } catch (oov var3) {
         throw a(var3);
      }
   }

   public gdz kx1(c9p var1) {
      try {
         if (var1.mzk()) {
            return fg4;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return ok0;
   }

   @Override
   public void w_x(yqv var1, double var2, double var4, double var6, float var8, float var9) {
      this.knk((c9p)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public boolean u8l(yqv var1, _aq var2, double var3, double var5, double var7) {
      return this.rs2((c9p)var1, var2, var3, var5, var7);
   }

   @Override
   public void e2w(g_3 var1, float var2) {
      this.nsy((c9p)var1, var2);
   }

   @Override
   public void l1o(g_3 var1, double var2, double var4, double var6, float var8, float var9) {
      this.knk((c9p)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.kx1((c9p)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.knk((c9p)var1, var2, var4, var6, var8, var9);
   }

   @Override
   public boolean h12(i2h var1, _aq var2, double var3, double var5, double var7) {
      return this.rs2((c9p)var1, var2, var3, var5, var7);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-632299536491244061L, -6100859028267004329L, MethodHandles.lookup().lookupClass()).a(122699570568973L);
      // $VF: monitorexit
      long var10 = var10000 ^ 24608963799940L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[3];
      int var6 = 0;
      String var5 = "ã\u008dÙñÞ`À÷ÛÇºa¯\u000e)\u0083_Þ\rj°\u0002\u0083¸Z#³×2å×VPÝí\u0005]m÷ô ã\u008dÙñÞ`À÷ÛÇºa¯\u000e)\u0083_Þ\rj°\u0002\u0083¸\u0019è\u001d\u001c\u001aØní(ã\u008dÙñÞ`À÷ÛÇºa¯\u000e)\u0083_Þ\rj°\u0002\u0083¸½\u009b\u0098\u0006xà«\u008cW¦\u0011\u0018Øe±µ";
      int var7 = "ã\u008dÙñÞ`À÷ÛÇºa¯\u000e)\u0083_Þ\rj°\u0002\u0083¸Z#³×2å×VPÝí\u0005]m÷ô ã\u008dÙñÞ`À÷ÛÇºa¯\u000e)\u0083_Þ\rj°\u0002\u0083¸\u0019è\u001d\u001c\u001aØní(ã\u008dÙñÞ`À÷ÛÇºa¯\u000e)\u0083_Þ\rj°\u0002\u0083¸½\u009b\u0098\u0006xà«\u008cW¦\u0011\u0018Øe±µ"
         .length();
      char var4 = '(';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = c(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            ok0 = new gdz(var8[1]);
            fg4 = new gdz(var8[0]);
            gzp = new gdz(var8[2]);
            return;
         }

         var4 = var5.charAt(var3);
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
}
