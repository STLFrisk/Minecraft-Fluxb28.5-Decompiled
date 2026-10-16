import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class g7u extends e0x {
   public static final qx_ sxt;
   public static final zb_ ru8;
   public static final zb_ vjy;
   private static final int[][] sgn;
   private final e0x yk1;
   private final zfz j61;
   private boolean wdb;
   private int xmj;

   public g7u(zfz var1) {
      super(var1.r_y().kgd);
      this.y8l(this._8_.c32().zvi(sxt, vt2.z9q).zvi(ru8, g7u$lrl.ow0).zvi(vjy, g7u$qmc.rn9));
      this.yk1 = var1.r_y();
      this.j61 = var1;
      this.q6h(this.yk1.knk);
      this.dj8(this.yk1.iep / 3.0F);
      this.t4k(this.yk1.zu6);
      this.opa(255);
      this.i3l(uja.mqu);
   }

   @Override
   public void c7i(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 83
      // 09: getfield g7u.wdb Z
      // 0c: ifeq 7b
      // 0f: goto 16
      // 12: invokestatic g7u.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: ldc 0.5
      // 19: nop
      // 1a: aload 0
      // 1b: getfield g7u.xmj I
      // 1e: bipush 2
      // 1f: irem
      // 20: i2f
      // 21: fmul
      // 22: ldc 0.5
      // 24: nop
      // 25: aload 0
      // 26: getfield g7u.xmj I
      // 29: bipush 4
      // 2a: idiv
      // 2b: bipush 2
      // 2c: irem
      // 2d: i2f
      // 2e: fmul
      // 2f: ldc 0.5
      // 31: nop
      // 32: aload 0
      // 33: getfield g7u.xmj I
      // 36: bipush 2
      // 37: idiv
      // 38: bipush 2
      // 39: irem
      // 3a: i2f
      // 3b: fmul
      // 3c: ldc 0.5
      // 3e: nop
      // 3f: ldc 0.5
      // 41: nop
      // 42: aload 0
      // 43: getfield g7u.xmj I
      // 46: bipush 2
      // 47: irem
      // 48: i2f
      // 49: fmul
      // 4a: fadd
      // 4b: ldc 0.5
      // 4d: nop
      // 4e: ldc 0.5
      // 50: nop
      // 51: aload 0
      // 52: getfield g7u.xmj I
      // 55: bipush 4
      // 56: idiv
      // 57: bipush 2
      // 58: irem
      // 59: i2f
      // 5a: fmul
      // 5b: fadd
      // 5c: ldc 0.5
      // 5e: nop
      // 5f: ldc 0.5
      // 61: nop
      // 62: aload 0
      // 63: getfield g7u.xmj I
      // 66: bipush 2
      // 67: idiv
      // 68: bipush 2
      // 69: irem
      // 6a: i2f
      // 6b: fmul
      // 6c: fadd
      // 6d: invokevirtual g7u.xl4 (FFFFFF)V
      // 70: iload 3
      // 71: ifeq 8c
      // 74: goto 7b
      // 77: invokestatic g7u.a (Loov;)Loov;
      // 7a: athrow
      // 7b: aload 0
      // 7c: goto 83
      // 7f: invokestatic g7u.a (Loov;)Loov;
      // 82: athrow
      // 83: fconst_0
      // 84: fconst_0
      // 85: fconst_0
      // 86: fconst_1
      // 87: fconst_1
      // 88: fconst_1
      // 89: invokevirtual g7u.xl4 (FFFFFF)V
      // 8c: return
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   public void gjc(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0b: getstatic g7u.ru8 Lzb_;
      // 0e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13: getstatic g7u$lrl.vvx Lg7u$lrl;
      // 16: if_acmpne 30
      // 19: aload 0
      // 1a: fconst_0
      // 1b: ldc 0.5
      // 1d: nop
      // 1e: fconst_0
      // 1f: fconst_1
      // 20: fconst_1
      // 21: fconst_1
      // 22: invokevirtual g7u.xl4 (FFFFFF)V
      // 25: iload 3
      // 26: ifeq 43
      // 29: goto 30
      // 2c: invokestatic g7u.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 0
      // 31: fconst_0
      // 32: fconst_0
      // 33: fconst_0
      // 34: fconst_1
      // 35: ldc 0.5
      // 37: nop
      // 38: fconst_1
      // 39: invokevirtual g7u.xl4 (FFFFFF)V
      // 3c: goto 43
      // 3f: invokestatic g7u.a (Loov;)Loov;
      // 42: athrow
      // 43: return
   }

   public static boolean x2k(e0x var0) {
      return var0 instanceof g7u;
   }

   public static boolean xpr(m5n param0, mew param1, zfz param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 07: astore 4
      // 09: invokestatic t9d.c ()I
      // 0c: aload 4
      // 0e: invokeinterface zfz.r_y ()Le0x; 1
      // 13: astore 5
      // 15: istore 3
      // 16: aload 5
      // 18: invokestatic g7u.x2k (Le0x;)Z
      // 1b: ifeq 6b
      // 1e: aload 4
      // 20: getstatic g7u.ru8 Lzb_;
      // 23: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 28: aload 2
      // 29: getstatic g7u.ru8 Lzb_;
      // 2c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 31: iload 3
      // 32: ifne 60
      // 35: goto 3c
      // 38: invokestatic g7u.a (Loov;)Loov;
      // 3b: athrow
      // 3c: if_acmpne 6b
      // 3f: goto 46
      // 42: invokestatic g7u.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 4
      // 48: getstatic g7u.sxt Lqx_;
      // 4b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 50: aload 2
      // 51: getstatic g7u.sxt Lqx_;
      // 54: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 59: goto 60
      // 5c: invokestatic g7u.a (Loov;)Loov;
      // 5f: athrow
      // 60: if_acmpne 6b
      // 63: bipush 1
      // 64: goto 6c
      // 67: invokestatic g7u.a (Loov;)Loov;
      // 6a: athrow
      // 6b: bipush 0
      // 6c: ireturn
   }

   public int r8u(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 2
      // 002: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 007: astore 4
      // 009: invokestatic t9d.c ()I
      // 00c: aload 4
      // 00e: getstatic g7u.sxt Lqx_;
      // 011: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 016: checkcast vt2
      // 019: astore 5
      // 01b: aload 4
      // 01d: getstatic g7u.ru8 Lzb_;
      // 020: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 025: checkcast g7u$lrl
      // 028: astore 6
      // 02a: istore 3
      // 02b: aload 6
      // 02d: getstatic g7u$lrl.vvx Lg7u$lrl;
      // 030: if_acmpne 03b
      // 033: bipush 1
      // 034: goto 03c
      // 037: invokestatic g7u.a (Loov;)Loov;
      // 03a: athrow
      // 03b: bipush 0
      // 03c: istore 7
      // 03e: aload 5
      // 040: getstatic vt2.zk4 Lvt2;
      // 043: iload 3
      // 044: ifne 13a
      // 047: if_acmpne 12e
      // 04a: goto 051
      // 04d: invokestatic g7u.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 1
      // 052: aload 2
      // 053: invokevirtual mew.o_8 ()Lmew;
      // 056: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 05b: astore 8
      // 05d: aload 8
      // 05f: invokeinterface zfz.r_y ()Le0x; 1
      // 064: astore 9
      // 066: aload 9
      // 068: invokestatic g7u.x2k (Le0x;)Z
      // 06b: ifeq 12a
      // 06e: aload 6
      // 070: iload 3
      // 071: ifne 0a0
      // 074: goto 07b
      // 077: invokestatic g7u.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 8
      // 07d: getstatic g7u.ru8 Lzb_;
      // 080: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 085: if_acmpne 12a
      // 088: goto 08f
      // 08b: invokestatic g7u.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 8
      // 091: getstatic g7u.sxt Lqx_;
      // 094: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 099: goto 0a0
      // 09c: invokestatic g7u.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: checkcast vt2
      // 0a3: astore 10
      // 0a5: aload 10
      // 0a7: getstatic vt2.z9q Lvt2;
      // 0aa: iload 3
      // 0ab: ifne 0f2
      // 0ae: if_acmpne 0ed
      // 0b1: goto 0b8
      // 0b4: invokestatic g7u.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 1
      // 0b9: aload 2
      // 0ba: invokevirtual mew.z6x ()Lmew;
      // 0bd: aload 4
      // 0bf: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 0c2: iload 3
      // 0c3: ifne 0d9
      // 0c6: goto 0cd
      // 0c9: invokestatic g7u.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: ifne 0ed
      // 0d0: goto 0d7
      // 0d3: invokestatic g7u.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: iload 7
      // 0d9: iload 3
      // 0da: ifne 0e8
      // 0dd: ifeq 0eb
      // 0e0: goto 0e7
      // 0e3: invokestatic g7u.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: bipush 1
      // 0e8: goto 0ec
      // 0eb: bipush 2
      // 0ec: ireturn
      // 0ed: aload 10
      // 0ef: getstatic vt2.mxp Lvt2;
      // 0f2: if_acmpne 12a
      // 0f5: aload 1
      // 0f6: aload 2
      // 0f7: invokevirtual mew.idu ()Lmew;
      // 0fa: aload 4
      // 0fc: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 0ff: iload 3
      // 100: ifne 116
      // 103: goto 10a
      // 106: invokestatic g7u.a (Loov;)Loov;
      // 109: athrow
      // 10a: ifne 12a
      // 10d: goto 114
      // 110: invokestatic g7u.a (Loov;)Loov;
      // 113: athrow
      // 114: iload 7
      // 116: iload 3
      // 117: ifne 125
      // 11a: ifeq 128
      // 11d: goto 124
      // 120: invokestatic g7u.a (Loov;)Loov;
      // 123: athrow
      // 124: bipush 2
      // 125: goto 129
      // 128: bipush 1
      // 129: ireturn
      // 12a: iload 3
      // 12b: ifeq 416
      // 12e: aload 5
      // 130: getstatic vt2.te4 Lvt2;
      // 133: goto 13a
      // 136: invokestatic g7u.a (Loov;)Loov;
      // 139: athrow
      // 13a: iload 3
      // 13b: ifne 231
      // 13e: if_acmpne 225
      // 141: goto 148
      // 144: invokestatic g7u.a (Loov;)Loov;
      // 147: athrow
      // 148: aload 1
      // 149: aload 2
      // 14a: invokevirtual mew.y8e ()Lmew;
      // 14d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 152: astore 8
      // 154: aload 8
      // 156: invokeinterface zfz.r_y ()Le0x; 1
      // 15b: astore 9
      // 15d: aload 9
      // 15f: invokestatic g7u.x2k (Le0x;)Z
      // 162: ifeq 221
      // 165: aload 6
      // 167: iload 3
      // 168: ifne 197
      // 16b: goto 172
      // 16e: invokestatic g7u.a (Loov;)Loov;
      // 171: athrow
      // 172: aload 8
      // 174: getstatic g7u.ru8 Lzb_;
      // 177: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 17c: if_acmpne 221
      // 17f: goto 186
      // 182: invokestatic g7u.a (Loov;)Loov;
      // 185: athrow
      // 186: aload 8
      // 188: getstatic g7u.sxt Lqx_;
      // 18b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 190: goto 197
      // 193: invokestatic g7u.a (Loov;)Loov;
      // 196: athrow
      // 197: checkcast vt2
      // 19a: astore 10
      // 19c: aload 10
      // 19e: getstatic vt2.z9q Lvt2;
      // 1a1: iload 3
      // 1a2: ifne 1e9
      // 1a5: if_acmpne 1e4
      // 1a8: goto 1af
      // 1ab: invokestatic g7u.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 1
      // 1b0: aload 2
      // 1b1: invokevirtual mew.z6x ()Lmew;
      // 1b4: aload 4
      // 1b6: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 1b9: iload 3
      // 1ba: ifne 1d0
      // 1bd: goto 1c4
      // 1c0: invokestatic g7u.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: ifne 1e4
      // 1c7: goto 1ce
      // 1ca: invokestatic g7u.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: iload 7
      // 1d0: iload 3
      // 1d1: ifne 1df
      // 1d4: ifeq 1e2
      // 1d7: goto 1de
      // 1da: invokestatic g7u.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: bipush 2
      // 1df: goto 1e3
      // 1e2: bipush 1
      // 1e3: ireturn
      // 1e4: aload 10
      // 1e6: getstatic vt2.mxp Lvt2;
      // 1e9: if_acmpne 221
      // 1ec: aload 1
      // 1ed: aload 2
      // 1ee: invokevirtual mew.idu ()Lmew;
      // 1f1: aload 4
      // 1f3: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 1f6: iload 3
      // 1f7: ifne 20d
      // 1fa: goto 201
      // 1fd: invokestatic g7u.a (Loov;)Loov;
      // 200: athrow
      // 201: ifne 221
      // 204: goto 20b
      // 207: invokestatic g7u.a (Loov;)Loov;
      // 20a: athrow
      // 20b: iload 7
      // 20d: iload 3
      // 20e: ifne 21c
      // 211: ifeq 21f
      // 214: goto 21b
      // 217: invokestatic g7u.a (Loov;)Loov;
      // 21a: athrow
      // 21b: bipush 1
      // 21c: goto 220
      // 21f: bipush 2
      // 220: ireturn
      // 221: iload 3
      // 222: ifeq 416
      // 225: aload 5
      // 227: getstatic vt2.mxp Lvt2;
      // 22a: goto 231
      // 22d: invokestatic g7u.a (Loov;)Loov;
      // 230: athrow
      // 231: iload 3
      // 232: ifne 328
      // 235: if_acmpne 31c
      // 238: goto 23f
      // 23b: invokestatic g7u.a (Loov;)Loov;
      // 23e: athrow
      // 23f: aload 1
      // 240: aload 2
      // 241: invokevirtual mew.z6x ()Lmew;
      // 244: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 249: astore 8
      // 24b: aload 8
      // 24d: invokeinterface zfz.r_y ()Le0x; 1
      // 252: astore 9
      // 254: aload 9
      // 256: invokestatic g7u.x2k (Le0x;)Z
      // 259: ifeq 318
      // 25c: aload 6
      // 25e: iload 3
      // 25f: ifne 28e
      // 262: goto 269
      // 265: invokestatic g7u.a (Loov;)Loov;
      // 268: athrow
      // 269: aload 8
      // 26b: getstatic g7u.ru8 Lzb_;
      // 26e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 273: if_acmpne 318
      // 276: goto 27d
      // 279: invokestatic g7u.a (Loov;)Loov;
      // 27c: athrow
      // 27d: aload 8
      // 27f: getstatic g7u.sxt Lqx_;
      // 282: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 287: goto 28e
      // 28a: invokestatic g7u.a (Loov;)Loov;
      // 28d: athrow
      // 28e: checkcast vt2
      // 291: astore 10
      // 293: aload 10
      // 295: getstatic vt2.te4 Lvt2;
      // 298: iload 3
      // 299: ifne 2e0
      // 29c: if_acmpne 2db
      // 29f: goto 2a6
      // 2a2: invokestatic g7u.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: aload 1
      // 2a7: aload 2
      // 2a8: invokevirtual mew.o_8 ()Lmew;
      // 2ab: aload 4
      // 2ad: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 2b0: iload 3
      // 2b1: ifne 2c7
      // 2b4: goto 2bb
      // 2b7: invokestatic g7u.a (Loov;)Loov;
      // 2ba: athrow
      // 2bb: ifne 2db
      // 2be: goto 2c5
      // 2c1: invokestatic g7u.a (Loov;)Loov;
      // 2c4: athrow
      // 2c5: iload 7
      // 2c7: iload 3
      // 2c8: ifne 2d6
      // 2cb: ifeq 2d9
      // 2ce: goto 2d5
      // 2d1: invokestatic g7u.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: bipush 2
      // 2d6: goto 2da
      // 2d9: bipush 1
      // 2da: ireturn
      // 2db: aload 10
      // 2dd: getstatic vt2.zk4 Lvt2;
      // 2e0: if_acmpne 318
      // 2e3: aload 1
      // 2e4: aload 2
      // 2e5: invokevirtual mew.y8e ()Lmew;
      // 2e8: aload 4
      // 2ea: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 2ed: iload 3
      // 2ee: ifne 304
      // 2f1: goto 2f8
      // 2f4: invokestatic g7u.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: ifne 318
      // 2fb: goto 302
      // 2fe: invokestatic g7u.a (Loov;)Loov;
      // 301: athrow
      // 302: iload 7
      // 304: iload 3
      // 305: ifne 313
      // 308: ifeq 316
      // 30b: goto 312
      // 30e: invokestatic g7u.a (Loov;)Loov;
      // 311: athrow
      // 312: bipush 1
      // 313: goto 317
      // 316: bipush 2
      // 317: ireturn
      // 318: iload 3
      // 319: ifeq 416
      // 31c: aload 5
      // 31e: getstatic vt2.z9q Lvt2;
      // 321: goto 328
      // 324: invokestatic g7u.a (Loov;)Loov;
      // 327: athrow
      // 328: if_acmpne 416
      // 32b: aload 1
      // 32c: aload 2
      // 32d: invokevirtual mew.idu ()Lmew;
      // 330: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 335: astore 8
      // 337: aload 8
      // 339: invokeinterface zfz.r_y ()Le0x; 1
      // 33e: astore 9
      // 340: aload 9
      // 342: invokestatic g7u.x2k (Le0x;)Z
      // 345: iload 3
      // 346: ifne 417
      // 349: ifeq 416
      // 34c: goto 353
      // 34f: invokestatic g7u.a (Loov;)Loov;
      // 352: athrow
      // 353: aload 6
      // 355: iload 3
      // 356: ifne 385
      // 359: goto 360
      // 35c: invokestatic g7u.a (Loov;)Loov;
      // 35f: athrow
      // 360: aload 8
      // 362: getstatic g7u.ru8 Lzb_;
      // 365: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 36a: if_acmpne 416
      // 36d: goto 374
      // 370: invokestatic g7u.a (Loov;)Loov;
      // 373: athrow
      // 374: aload 8
      // 376: getstatic g7u.sxt Lqx_;
      // 379: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 37e: goto 385
      // 381: invokestatic g7u.a (Loov;)Loov;
      // 384: athrow
      // 385: checkcast vt2
      // 388: astore 10
      // 38a: aload 10
      // 38c: getstatic vt2.te4 Lvt2;
      // 38f: iload 3
      // 390: ifne 3d7
      // 393: if_acmpne 3d2
      // 396: goto 39d
      // 399: invokestatic g7u.a (Loov;)Loov;
      // 39c: athrow
      // 39d: aload 1
      // 39e: aload 2
      // 39f: invokevirtual mew.o_8 ()Lmew;
      // 3a2: aload 4
      // 3a4: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 3a7: iload 3
      // 3a8: ifne 3be
      // 3ab: goto 3b2
      // 3ae: invokestatic g7u.a (Loov;)Loov;
      // 3b1: athrow
      // 3b2: ifne 3d2
      // 3b5: goto 3bc
      // 3b8: invokestatic g7u.a (Loov;)Loov;
      // 3bb: athrow
      // 3bc: iload 7
      // 3be: iload 3
      // 3bf: ifne 3cd
      // 3c2: ifeq 3d0
      // 3c5: goto 3cc
      // 3c8: invokestatic g7u.a (Loov;)Loov;
      // 3cb: athrow
      // 3cc: bipush 1
      // 3cd: goto 3d1
      // 3d0: bipush 2
      // 3d1: ireturn
      // 3d2: aload 10
      // 3d4: getstatic vt2.zk4 Lvt2;
      // 3d7: if_acmpne 416
      // 3da: aload 1
      // 3db: aload 2
      // 3dc: invokevirtual mew.y8e ()Lmew;
      // 3df: aload 4
      // 3e1: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 3e4: iload 3
      // 3e5: ifne 417
      // 3e8: goto 3ef
      // 3eb: invokestatic g7u.a (Loov;)Loov;
      // 3ee: athrow
      // 3ef: ifne 416
      // 3f2: goto 3f9
      // 3f5: invokestatic g7u.a (Loov;)Loov;
      // 3f8: athrow
      // 3f9: iload 7
      // 3fb: iload 3
      // 3fc: ifne 411
      // 3ff: goto 406
      // 402: invokestatic g7u.a (Loov;)Loov;
      // 405: athrow
      // 406: ifeq 414
      // 409: goto 410
      // 40c: invokestatic g7u.a (Loov;)Loov;
      // 40f: athrow
      // 410: bipush 2
      // 411: goto 415
      // 414: bipush 1
      // 415: ireturn
      // 416: bipush 0
      // 417: ireturn
   }

   public int p9f(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 2
      // 002: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 007: astore 4
      // 009: invokestatic t9d.c ()I
      // 00c: aload 4
      // 00e: getstatic g7u.sxt Lqx_;
      // 011: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 016: checkcast vt2
      // 019: astore 5
      // 01b: istore 3
      // 01c: aload 4
      // 01e: getstatic g7u.ru8 Lzb_;
      // 021: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 026: checkcast g7u$lrl
      // 029: astore 6
      // 02b: aload 6
      // 02d: getstatic g7u$lrl.vvx Lg7u$lrl;
      // 030: if_acmpne 03b
      // 033: bipush 1
      // 034: goto 03c
      // 037: invokestatic g7u.a (Loov;)Loov;
      // 03a: athrow
      // 03b: bipush 0
      // 03c: istore 7
      // 03e: aload 5
      // 040: getstatic vt2.zk4 Lvt2;
      // 043: iload 3
      // 044: ifne 13a
      // 047: if_acmpne 12e
      // 04a: goto 051
      // 04d: invokestatic g7u.a (Loov;)Loov;
      // 050: athrow
      // 051: aload 1
      // 052: aload 2
      // 053: invokevirtual mew.y8e ()Lmew;
      // 056: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 05b: astore 8
      // 05d: aload 8
      // 05f: invokeinterface zfz.r_y ()Le0x; 1
      // 064: astore 9
      // 066: aload 9
      // 068: invokestatic g7u.x2k (Le0x;)Z
      // 06b: ifeq 12a
      // 06e: aload 6
      // 070: iload 3
      // 071: ifne 0a0
      // 074: goto 07b
      // 077: invokestatic g7u.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 8
      // 07d: getstatic g7u.ru8 Lzb_;
      // 080: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 085: if_acmpne 12a
      // 088: goto 08f
      // 08b: invokestatic g7u.a (Loov;)Loov;
      // 08e: athrow
      // 08f: aload 8
      // 091: getstatic g7u.sxt Lqx_;
      // 094: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 099: goto 0a0
      // 09c: invokestatic g7u.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: checkcast vt2
      // 0a3: astore 10
      // 0a5: aload 10
      // 0a7: getstatic vt2.z9q Lvt2;
      // 0aa: iload 3
      // 0ab: ifne 0f2
      // 0ae: if_acmpne 0ed
      // 0b1: goto 0b8
      // 0b4: invokestatic g7u.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 1
      // 0b9: aload 2
      // 0ba: invokevirtual mew.idu ()Lmew;
      // 0bd: aload 4
      // 0bf: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 0c2: iload 3
      // 0c3: ifne 0d9
      // 0c6: goto 0cd
      // 0c9: invokestatic g7u.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: ifne 0ed
      // 0d0: goto 0d7
      // 0d3: invokestatic g7u.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: iload 7
      // 0d9: iload 3
      // 0da: ifne 0e8
      // 0dd: ifeq 0eb
      // 0e0: goto 0e7
      // 0e3: invokestatic g7u.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: bipush 1
      // 0e8: goto 0ec
      // 0eb: bipush 2
      // 0ec: ireturn
      // 0ed: aload 10
      // 0ef: getstatic vt2.mxp Lvt2;
      // 0f2: if_acmpne 12a
      // 0f5: aload 1
      // 0f6: aload 2
      // 0f7: invokevirtual mew.z6x ()Lmew;
      // 0fa: aload 4
      // 0fc: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 0ff: iload 3
      // 100: ifne 116
      // 103: goto 10a
      // 106: invokestatic g7u.a (Loov;)Loov;
      // 109: athrow
      // 10a: ifne 12a
      // 10d: goto 114
      // 110: invokestatic g7u.a (Loov;)Loov;
      // 113: athrow
      // 114: iload 7
      // 116: iload 3
      // 117: ifne 125
      // 11a: ifeq 128
      // 11d: goto 124
      // 120: invokestatic g7u.a (Loov;)Loov;
      // 123: athrow
      // 124: bipush 2
      // 125: goto 129
      // 128: bipush 1
      // 129: ireturn
      // 12a: iload 3
      // 12b: ifeq 416
      // 12e: aload 5
      // 130: getstatic vt2.te4 Lvt2;
      // 133: goto 13a
      // 136: invokestatic g7u.a (Loov;)Loov;
      // 139: athrow
      // 13a: iload 3
      // 13b: ifne 231
      // 13e: if_acmpne 225
      // 141: goto 148
      // 144: invokestatic g7u.a (Loov;)Loov;
      // 147: athrow
      // 148: aload 1
      // 149: aload 2
      // 14a: invokevirtual mew.o_8 ()Lmew;
      // 14d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 152: astore 8
      // 154: aload 8
      // 156: invokeinterface zfz.r_y ()Le0x; 1
      // 15b: astore 9
      // 15d: aload 9
      // 15f: invokestatic g7u.x2k (Le0x;)Z
      // 162: ifeq 221
      // 165: aload 6
      // 167: iload 3
      // 168: ifne 197
      // 16b: goto 172
      // 16e: invokestatic g7u.a (Loov;)Loov;
      // 171: athrow
      // 172: aload 8
      // 174: getstatic g7u.ru8 Lzb_;
      // 177: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 17c: if_acmpne 221
      // 17f: goto 186
      // 182: invokestatic g7u.a (Loov;)Loov;
      // 185: athrow
      // 186: aload 8
      // 188: getstatic g7u.sxt Lqx_;
      // 18b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 190: goto 197
      // 193: invokestatic g7u.a (Loov;)Loov;
      // 196: athrow
      // 197: checkcast vt2
      // 19a: astore 10
      // 19c: aload 10
      // 19e: getstatic vt2.z9q Lvt2;
      // 1a1: iload 3
      // 1a2: ifne 1e9
      // 1a5: if_acmpne 1e4
      // 1a8: goto 1af
      // 1ab: invokestatic g7u.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: aload 1
      // 1b0: aload 2
      // 1b1: invokevirtual mew.idu ()Lmew;
      // 1b4: aload 4
      // 1b6: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 1b9: iload 3
      // 1ba: ifne 1d0
      // 1bd: goto 1c4
      // 1c0: invokestatic g7u.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: ifne 1e4
      // 1c7: goto 1ce
      // 1ca: invokestatic g7u.a (Loov;)Loov;
      // 1cd: athrow
      // 1ce: iload 7
      // 1d0: iload 3
      // 1d1: ifne 1df
      // 1d4: ifeq 1e2
      // 1d7: goto 1de
      // 1da: invokestatic g7u.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: bipush 2
      // 1df: goto 1e3
      // 1e2: bipush 1
      // 1e3: ireturn
      // 1e4: aload 10
      // 1e6: getstatic vt2.mxp Lvt2;
      // 1e9: if_acmpne 221
      // 1ec: aload 1
      // 1ed: aload 2
      // 1ee: invokevirtual mew.z6x ()Lmew;
      // 1f1: aload 4
      // 1f3: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 1f6: iload 3
      // 1f7: ifne 20d
      // 1fa: goto 201
      // 1fd: invokestatic g7u.a (Loov;)Loov;
      // 200: athrow
      // 201: ifne 221
      // 204: goto 20b
      // 207: invokestatic g7u.a (Loov;)Loov;
      // 20a: athrow
      // 20b: iload 7
      // 20d: iload 3
      // 20e: ifne 21c
      // 211: ifeq 21f
      // 214: goto 21b
      // 217: invokestatic g7u.a (Loov;)Loov;
      // 21a: athrow
      // 21b: bipush 1
      // 21c: goto 220
      // 21f: bipush 2
      // 220: ireturn
      // 221: iload 3
      // 222: ifeq 416
      // 225: aload 5
      // 227: getstatic vt2.mxp Lvt2;
      // 22a: goto 231
      // 22d: invokestatic g7u.a (Loov;)Loov;
      // 230: athrow
      // 231: iload 3
      // 232: ifne 328
      // 235: if_acmpne 31c
      // 238: goto 23f
      // 23b: invokestatic g7u.a (Loov;)Loov;
      // 23e: athrow
      // 23f: aload 1
      // 240: aload 2
      // 241: invokevirtual mew.idu ()Lmew;
      // 244: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 249: astore 8
      // 24b: aload 8
      // 24d: invokeinterface zfz.r_y ()Le0x; 1
      // 252: astore 9
      // 254: aload 9
      // 256: invokestatic g7u.x2k (Le0x;)Z
      // 259: ifeq 318
      // 25c: aload 6
      // 25e: iload 3
      // 25f: ifne 28e
      // 262: goto 269
      // 265: invokestatic g7u.a (Loov;)Loov;
      // 268: athrow
      // 269: aload 8
      // 26b: getstatic g7u.ru8 Lzb_;
      // 26e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 273: if_acmpne 318
      // 276: goto 27d
      // 279: invokestatic g7u.a (Loov;)Loov;
      // 27c: athrow
      // 27d: aload 8
      // 27f: getstatic g7u.sxt Lqx_;
      // 282: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 287: goto 28e
      // 28a: invokestatic g7u.a (Loov;)Loov;
      // 28d: athrow
      // 28e: checkcast vt2
      // 291: astore 10
      // 293: aload 10
      // 295: getstatic vt2.te4 Lvt2;
      // 298: iload 3
      // 299: ifne 2e0
      // 29c: if_acmpne 2db
      // 29f: goto 2a6
      // 2a2: invokestatic g7u.a (Loov;)Loov;
      // 2a5: athrow
      // 2a6: aload 1
      // 2a7: aload 2
      // 2a8: invokevirtual mew.y8e ()Lmew;
      // 2ab: aload 4
      // 2ad: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 2b0: iload 3
      // 2b1: ifne 2c7
      // 2b4: goto 2bb
      // 2b7: invokestatic g7u.a (Loov;)Loov;
      // 2ba: athrow
      // 2bb: ifne 2db
      // 2be: goto 2c5
      // 2c1: invokestatic g7u.a (Loov;)Loov;
      // 2c4: athrow
      // 2c5: iload 7
      // 2c7: iload 3
      // 2c8: ifne 2d6
      // 2cb: ifeq 2d9
      // 2ce: goto 2d5
      // 2d1: invokestatic g7u.a (Loov;)Loov;
      // 2d4: athrow
      // 2d5: bipush 2
      // 2d6: goto 2da
      // 2d9: bipush 1
      // 2da: ireturn
      // 2db: aload 10
      // 2dd: getstatic vt2.zk4 Lvt2;
      // 2e0: if_acmpne 318
      // 2e3: aload 1
      // 2e4: aload 2
      // 2e5: invokevirtual mew.o_8 ()Lmew;
      // 2e8: aload 4
      // 2ea: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 2ed: iload 3
      // 2ee: ifne 304
      // 2f1: goto 2f8
      // 2f4: invokestatic g7u.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: ifne 318
      // 2fb: goto 302
      // 2fe: invokestatic g7u.a (Loov;)Loov;
      // 301: athrow
      // 302: iload 7
      // 304: iload 3
      // 305: ifne 313
      // 308: ifeq 316
      // 30b: goto 312
      // 30e: invokestatic g7u.a (Loov;)Loov;
      // 311: athrow
      // 312: bipush 1
      // 313: goto 317
      // 316: bipush 2
      // 317: ireturn
      // 318: iload 3
      // 319: ifeq 416
      // 31c: aload 5
      // 31e: getstatic vt2.z9q Lvt2;
      // 321: goto 328
      // 324: invokestatic g7u.a (Loov;)Loov;
      // 327: athrow
      // 328: if_acmpne 416
      // 32b: aload 1
      // 32c: aload 2
      // 32d: invokevirtual mew.z6x ()Lmew;
      // 330: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 335: astore 8
      // 337: aload 8
      // 339: invokeinterface zfz.r_y ()Le0x; 1
      // 33e: astore 9
      // 340: aload 9
      // 342: invokestatic g7u.x2k (Le0x;)Z
      // 345: iload 3
      // 346: ifne 417
      // 349: ifeq 416
      // 34c: goto 353
      // 34f: invokestatic g7u.a (Loov;)Loov;
      // 352: athrow
      // 353: aload 6
      // 355: iload 3
      // 356: ifne 385
      // 359: goto 360
      // 35c: invokestatic g7u.a (Loov;)Loov;
      // 35f: athrow
      // 360: aload 8
      // 362: getstatic g7u.ru8 Lzb_;
      // 365: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 36a: if_acmpne 416
      // 36d: goto 374
      // 370: invokestatic g7u.a (Loov;)Loov;
      // 373: athrow
      // 374: aload 8
      // 376: getstatic g7u.sxt Lqx_;
      // 379: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 37e: goto 385
      // 381: invokestatic g7u.a (Loov;)Loov;
      // 384: athrow
      // 385: checkcast vt2
      // 388: astore 10
      // 38a: aload 10
      // 38c: getstatic vt2.te4 Lvt2;
      // 38f: iload 3
      // 390: ifne 3d7
      // 393: if_acmpne 3d2
      // 396: goto 39d
      // 399: invokestatic g7u.a (Loov;)Loov;
      // 39c: athrow
      // 39d: aload 1
      // 39e: aload 2
      // 39f: invokevirtual mew.y8e ()Lmew;
      // 3a2: aload 4
      // 3a4: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 3a7: iload 3
      // 3a8: ifne 3be
      // 3ab: goto 3b2
      // 3ae: invokestatic g7u.a (Loov;)Loov;
      // 3b1: athrow
      // 3b2: ifne 3d2
      // 3b5: goto 3bc
      // 3b8: invokestatic g7u.a (Loov;)Loov;
      // 3bb: athrow
      // 3bc: iload 7
      // 3be: iload 3
      // 3bf: ifne 3cd
      // 3c2: ifeq 3d0
      // 3c5: goto 3cc
      // 3c8: invokestatic g7u.a (Loov;)Loov;
      // 3cb: athrow
      // 3cc: bipush 1
      // 3cd: goto 3d1
      // 3d0: bipush 2
      // 3d1: ireturn
      // 3d2: aload 10
      // 3d4: getstatic vt2.zk4 Lvt2;
      // 3d7: if_acmpne 416
      // 3da: aload 1
      // 3db: aload 2
      // 3dc: invokevirtual mew.o_8 ()Lmew;
      // 3df: aload 4
      // 3e1: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 3e4: iload 3
      // 3e5: ifne 417
      // 3e8: goto 3ef
      // 3eb: invokestatic g7u.a (Loov;)Loov;
      // 3ee: athrow
      // 3ef: ifne 416
      // 3f2: goto 3f9
      // 3f5: invokestatic g7u.a (Loov;)Loov;
      // 3f8: athrow
      // 3f9: iload 7
      // 3fb: iload 3
      // 3fc: ifne 411
      // 3ff: goto 406
      // 402: invokestatic g7u.a (Loov;)Loov;
      // 405: athrow
      // 406: ifeq 414
      // 409: goto 410
      // 40c: invokestatic g7u.a (Loov;)Loov;
      // 40f: athrow
      // 410: bipush 2
      // 411: goto 415
      // 414: bipush 1
      // 415: ireturn
      // 416: bipush 0
      // 417: ireturn
   }

   public boolean hl8(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 2
      // 002: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 007: astore 4
      // 009: invokestatic t9d.c ()I
      // 00c: aload 4
      // 00e: getstatic g7u.sxt Lqx_;
      // 011: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 016: checkcast vt2
      // 019: astore 5
      // 01b: aload 4
      // 01d: getstatic g7u.ru8 Lzb_;
      // 020: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 025: checkcast g7u$lrl
      // 028: astore 6
      // 02a: istore 3
      // 02b: aload 6
      // 02d: getstatic g7u$lrl.vvx Lg7u$lrl;
      // 030: if_acmpne 03b
      // 033: bipush 1
      // 034: goto 03c
      // 037: invokestatic g7u.a (Loov;)Loov;
      // 03a: athrow
      // 03b: bipush 0
      // 03c: istore 7
      // 03e: ldc 0.5
      // 040: nop
      // 041: fstore 8
      // 043: fconst_1
      // 044: fstore 9
      // 046: iload 3
      // 047: ifne 059
      // 04a: iload 7
      // 04c: ifeq 05e
      // 04f: goto 056
      // 052: invokestatic g7u.a (Loov;)Loov;
      // 055: athrow
      // 056: fconst_0
      // 057: fstore 8
      // 059: ldc 0.5
      // 05b: nop
      // 05c: fstore 9
      // 05e: fconst_0
      // 05f: fstore 10
      // 061: fconst_1
      // 062: fstore 11
      // 064: fconst_0
      // 065: fstore 12
      // 067: ldc 0.5
      // 069: nop
      // 06a: fstore 13
      // 06c: bipush 1
      // 06d: istore 14
      // 06f: aload 5
      // 071: getstatic vt2.zk4 Lvt2;
      // 074: iload 3
      // 075: ifne 162
      // 078: if_acmpne 156
      // 07b: goto 082
      // 07e: invokestatic g7u.a (Loov;)Loov;
      // 081: athrow
      // 082: ldc 0.5
      // 084: nop
      // 085: fstore 10
      // 087: fconst_1
      // 088: fstore 13
      // 08a: aload 1
      // 08b: aload 2
      // 08c: invokevirtual mew.o_8 ()Lmew;
      // 08f: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 094: astore 15
      // 096: aload 15
      // 098: invokeinterface zfz.r_y ()Le0x; 1
      // 09d: astore 16
      // 09f: aload 16
      // 0a1: invokestatic g7u.x2k (Le0x;)Z
      // 0a4: ifeq 152
      // 0a7: aload 6
      // 0a9: iload 3
      // 0aa: ifne 0d9
      // 0ad: goto 0b4
      // 0b0: invokestatic g7u.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: aload 15
      // 0b6: getstatic g7u.ru8 Lzb_;
      // 0b9: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0be: if_acmpne 152
      // 0c1: goto 0c8
      // 0c4: invokestatic g7u.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 15
      // 0ca: getstatic g7u.sxt Lqx_;
      // 0cd: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0d2: goto 0d9
      // 0d5: invokestatic g7u.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: checkcast vt2
      // 0dc: astore 17
      // 0de: aload 17
      // 0e0: getstatic vt2.z9q Lvt2;
      // 0e3: iload 3
      // 0e4: ifne 128
      // 0e7: if_acmpne 11c
      // 0ea: goto 0f1
      // 0ed: invokestatic g7u.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 1
      // 0f2: aload 2
      // 0f3: invokevirtual mew.z6x ()Lmew;
      // 0f6: aload 4
      // 0f8: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 0fb: iload 3
      // 0fc: ifne 116
      // 0ff: goto 106
      // 102: invokestatic g7u.a (Loov;)Loov;
      // 105: athrow
      // 106: ifne 11c
      // 109: goto 110
      // 10c: invokestatic g7u.a (Loov;)Loov;
      // 10f: athrow
      // 110: ldc 0.5
      // 112: nop
      // 113: fstore 13
      // 115: bipush 0
      // 116: istore 14
      // 118: iload 3
      // 119: ifeq 152
      // 11c: aload 17
      // 11e: getstatic vt2.mxp Lvt2;
      // 121: goto 128
      // 124: invokestatic g7u.a (Loov;)Loov;
      // 127: athrow
      // 128: if_acmpne 152
      // 12b: aload 1
      // 12c: aload 2
      // 12d: invokevirtual mew.idu ()Lmew;
      // 130: aload 4
      // 132: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 135: iload 3
      // 136: ifne 150
      // 139: goto 140
      // 13c: invokestatic g7u.a (Loov;)Loov;
      // 13f: athrow
      // 140: ifne 152
      // 143: goto 14a
      // 146: invokestatic g7u.a (Loov;)Loov;
      // 149: athrow
      // 14a: ldc 0.5
      // 14c: nop
      // 14d: fstore 12
      // 14f: bipush 0
      // 150: istore 14
      // 152: iload 3
      // 153: ifeq 414
      // 156: aload 5
      // 158: getstatic vt2.te4 Lvt2;
      // 15b: goto 162
      // 15e: invokestatic g7u.a (Loov;)Loov;
      // 161: athrow
      // 162: iload 3
      // 163: ifne 250
      // 166: if_acmpne 244
      // 169: goto 170
      // 16c: invokestatic g7u.a (Loov;)Loov;
      // 16f: athrow
      // 170: ldc 0.5
      // 172: nop
      // 173: fstore 11
      // 175: fconst_1
      // 176: fstore 13
      // 178: aload 1
      // 179: aload 2
      // 17a: invokevirtual mew.y8e ()Lmew;
      // 17d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 182: astore 15
      // 184: aload 15
      // 186: invokeinterface zfz.r_y ()Le0x; 1
      // 18b: astore 16
      // 18d: aload 16
      // 18f: invokestatic g7u.x2k (Le0x;)Z
      // 192: ifeq 240
      // 195: aload 6
      // 197: iload 3
      // 198: ifne 1c7
      // 19b: goto 1a2
      // 19e: invokestatic g7u.a (Loov;)Loov;
      // 1a1: athrow
      // 1a2: aload 15
      // 1a4: getstatic g7u.ru8 Lzb_;
      // 1a7: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1ac: if_acmpne 240
      // 1af: goto 1b6
      // 1b2: invokestatic g7u.a (Loov;)Loov;
      // 1b5: athrow
      // 1b6: aload 15
      // 1b8: getstatic g7u.sxt Lqx_;
      // 1bb: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1c0: goto 1c7
      // 1c3: invokestatic g7u.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: checkcast vt2
      // 1ca: astore 17
      // 1cc: aload 17
      // 1ce: getstatic vt2.z9q Lvt2;
      // 1d1: iload 3
      // 1d2: ifne 216
      // 1d5: if_acmpne 20a
      // 1d8: goto 1df
      // 1db: invokestatic g7u.a (Loov;)Loov;
      // 1de: athrow
      // 1df: aload 1
      // 1e0: aload 2
      // 1e1: invokevirtual mew.z6x ()Lmew;
      // 1e4: aload 4
      // 1e6: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 1e9: iload 3
      // 1ea: ifne 204
      // 1ed: goto 1f4
      // 1f0: invokestatic g7u.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: ifne 20a
      // 1f7: goto 1fe
      // 1fa: invokestatic g7u.a (Loov;)Loov;
      // 1fd: athrow
      // 1fe: ldc 0.5
      // 200: nop
      // 201: fstore 13
      // 203: bipush 0
      // 204: istore 14
      // 206: iload 3
      // 207: ifeq 240
      // 20a: aload 17
      // 20c: getstatic vt2.mxp Lvt2;
      // 20f: goto 216
      // 212: invokestatic g7u.a (Loov;)Loov;
      // 215: athrow
      // 216: if_acmpne 240
      // 219: aload 1
      // 21a: aload 2
      // 21b: invokevirtual mew.idu ()Lmew;
      // 21e: aload 4
      // 220: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 223: iload 3
      // 224: ifne 23e
      // 227: goto 22e
      // 22a: invokestatic g7u.a (Loov;)Loov;
      // 22d: athrow
      // 22e: ifne 240
      // 231: goto 238
      // 234: invokestatic g7u.a (Loov;)Loov;
      // 237: athrow
      // 238: ldc 0.5
      // 23a: nop
      // 23b: fstore 12
      // 23d: bipush 0
      // 23e: istore 14
      // 240: iload 3
      // 241: ifeq 414
      // 244: aload 5
      // 246: getstatic vt2.mxp Lvt2;
      // 249: goto 250
      // 24c: invokestatic g7u.a (Loov;)Loov;
      // 24f: athrow
      // 250: iload 3
      // 251: ifne 33e
      // 254: if_acmpne 332
      // 257: goto 25e
      // 25a: invokestatic g7u.a (Loov;)Loov;
      // 25d: athrow
      // 25e: ldc 0.5
      // 260: nop
      // 261: fstore 12
      // 263: fconst_1
      // 264: fstore 13
      // 266: aload 1
      // 267: aload 2
      // 268: invokevirtual mew.z6x ()Lmew;
      // 26b: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 270: astore 15
      // 272: aload 15
      // 274: invokeinterface zfz.r_y ()Le0x; 1
      // 279: astore 16
      // 27b: aload 16
      // 27d: invokestatic g7u.x2k (Le0x;)Z
      // 280: ifeq 32e
      // 283: aload 6
      // 285: iload 3
      // 286: ifne 2b5
      // 289: goto 290
      // 28c: invokestatic g7u.a (Loov;)Loov;
      // 28f: athrow
      // 290: aload 15
      // 292: getstatic g7u.ru8 Lzb_;
      // 295: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 29a: if_acmpne 32e
      // 29d: goto 2a4
      // 2a0: invokestatic g7u.a (Loov;)Loov;
      // 2a3: athrow
      // 2a4: aload 15
      // 2a6: getstatic g7u.sxt Lqx_;
      // 2a9: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2ae: goto 2b5
      // 2b1: invokestatic g7u.a (Loov;)Loov;
      // 2b4: athrow
      // 2b5: checkcast vt2
      // 2b8: astore 17
      // 2ba: aload 17
      // 2bc: getstatic vt2.te4 Lvt2;
      // 2bf: iload 3
      // 2c0: ifne 304
      // 2c3: if_acmpne 2f8
      // 2c6: goto 2cd
      // 2c9: invokestatic g7u.a (Loov;)Loov;
      // 2cc: athrow
      // 2cd: aload 1
      // 2ce: aload 2
      // 2cf: invokevirtual mew.o_8 ()Lmew;
      // 2d2: aload 4
      // 2d4: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 2d7: iload 3
      // 2d8: ifne 2f2
      // 2db: goto 2e2
      // 2de: invokestatic g7u.a (Loov;)Loov;
      // 2e1: athrow
      // 2e2: ifne 2f8
      // 2e5: goto 2ec
      // 2e8: invokestatic g7u.a (Loov;)Loov;
      // 2eb: athrow
      // 2ec: ldc 0.5
      // 2ee: nop
      // 2ef: fstore 11
      // 2f1: bipush 0
      // 2f2: istore 14
      // 2f4: iload 3
      // 2f5: ifeq 32e
      // 2f8: aload 17
      // 2fa: getstatic vt2.zk4 Lvt2;
      // 2fd: goto 304
      // 300: invokestatic g7u.a (Loov;)Loov;
      // 303: athrow
      // 304: if_acmpne 32e
      // 307: aload 1
      // 308: aload 2
      // 309: invokevirtual mew.y8e ()Lmew;
      // 30c: aload 4
      // 30e: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 311: iload 3
      // 312: ifne 32c
      // 315: goto 31c
      // 318: invokestatic g7u.a (Loov;)Loov;
      // 31b: athrow
      // 31c: ifne 32e
      // 31f: goto 326
      // 322: invokestatic g7u.a (Loov;)Loov;
      // 325: athrow
      // 326: ldc 0.5
      // 328: nop
      // 329: fstore 10
      // 32b: bipush 0
      // 32c: istore 14
      // 32e: iload 3
      // 32f: ifeq 414
      // 332: aload 5
      // 334: getstatic vt2.z9q Lvt2;
      // 337: goto 33e
      // 33a: invokestatic g7u.a (Loov;)Loov;
      // 33d: athrow
      // 33e: if_acmpne 414
      // 341: aload 1
      // 342: aload 2
      // 343: invokevirtual mew.idu ()Lmew;
      // 346: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 34b: astore 15
      // 34d: aload 15
      // 34f: invokeinterface zfz.r_y ()Le0x; 1
      // 354: astore 16
      // 356: aload 16
      // 358: invokestatic g7u.x2k (Le0x;)Z
      // 35b: iload 3
      // 35c: ifne 426
      // 35f: ifeq 414
      // 362: goto 369
      // 365: invokestatic g7u.a (Loov;)Loov;
      // 368: athrow
      // 369: aload 6
      // 36b: iload 3
      // 36c: ifne 39b
      // 36f: goto 376
      // 372: invokestatic g7u.a (Loov;)Loov;
      // 375: athrow
      // 376: aload 15
      // 378: getstatic g7u.ru8 Lzb_;
      // 37b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 380: if_acmpne 414
      // 383: goto 38a
      // 386: invokestatic g7u.a (Loov;)Loov;
      // 389: athrow
      // 38a: aload 15
      // 38c: getstatic g7u.sxt Lqx_;
      // 38f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 394: goto 39b
      // 397: invokestatic g7u.a (Loov;)Loov;
      // 39a: athrow
      // 39b: checkcast vt2
      // 39e: astore 17
      // 3a0: aload 17
      // 3a2: getstatic vt2.te4 Lvt2;
      // 3a5: iload 3
      // 3a6: ifne 3ea
      // 3a9: if_acmpne 3de
      // 3ac: goto 3b3
      // 3af: invokestatic g7u.a (Loov;)Loov;
      // 3b2: athrow
      // 3b3: aload 1
      // 3b4: aload 2
      // 3b5: invokevirtual mew.o_8 ()Lmew;
      // 3b8: aload 4
      // 3ba: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 3bd: iload 3
      // 3be: ifne 3d8
      // 3c1: goto 3c8
      // 3c4: invokestatic g7u.a (Loov;)Loov;
      // 3c7: athrow
      // 3c8: ifne 3de
      // 3cb: goto 3d2
      // 3ce: invokestatic g7u.a (Loov;)Loov;
      // 3d1: athrow
      // 3d2: ldc 0.5
      // 3d4: nop
      // 3d5: fstore 11
      // 3d7: bipush 0
      // 3d8: istore 14
      // 3da: iload 3
      // 3db: ifeq 414
      // 3de: aload 17
      // 3e0: getstatic vt2.zk4 Lvt2;
      // 3e3: goto 3ea
      // 3e6: invokestatic g7u.a (Loov;)Loov;
      // 3e9: athrow
      // 3ea: if_acmpne 414
      // 3ed: aload 1
      // 3ee: aload 2
      // 3ef: invokevirtual mew.y8e ()Lmew;
      // 3f2: aload 4
      // 3f4: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 3f7: iload 3
      // 3f8: ifne 426
      // 3fb: goto 402
      // 3fe: invokestatic g7u.a (Loov;)Loov;
      // 401: athrow
      // 402: ifne 414
      // 405: goto 40c
      // 408: invokestatic g7u.a (Loov;)Loov;
      // 40b: athrow
      // 40c: ldc 0.5
      // 40e: nop
      // 40f: fstore 10
      // 411: bipush 0
      // 412: istore 14
      // 414: aload 0
      // 415: fload 10
      // 417: fload 8
      // 419: fload 12
      // 41b: fload 11
      // 41d: fload 9
      // 41f: fload 13
      // 421: invokevirtual g7u.xl4 (FFFFFF)V
      // 424: iload 14
      // 426: ireturn
   }

   public boolean j1h(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 2
      // 002: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 007: astore 4
      // 009: aload 4
      // 00b: getstatic g7u.sxt Lqx_;
      // 00e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 013: checkcast vt2
      // 016: astore 5
      // 018: invokestatic t9d.b ()I
      // 01b: aload 4
      // 01d: getstatic g7u.ru8 Lzb_;
      // 020: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 025: checkcast g7u$lrl
      // 028: astore 6
      // 02a: istore 3
      // 02b: aload 6
      // 02d: getstatic g7u$lrl.vvx Lg7u$lrl;
      // 030: if_acmpne 03b
      // 033: bipush 1
      // 034: goto 03c
      // 037: invokestatic g7u.a (Loov;)Loov;
      // 03a: athrow
      // 03b: bipush 0
      // 03c: istore 7
      // 03e: ldc 0.5
      // 040: nop
      // 041: fstore 8
      // 043: fconst_1
      // 044: fstore 9
      // 046: iload 3
      // 047: ifeq 059
      // 04a: iload 7
      // 04c: ifeq 05e
      // 04f: goto 056
      // 052: invokestatic g7u.a (Loov;)Loov;
      // 055: athrow
      // 056: fconst_0
      // 057: fstore 8
      // 059: ldc 0.5
      // 05b: nop
      // 05c: fstore 9
      // 05e: fconst_0
      // 05f: fstore 10
      // 061: ldc 0.5
      // 063: nop
      // 064: fstore 11
      // 066: ldc 0.5
      // 068: nop
      // 069: fstore 12
      // 06b: fconst_1
      // 06c: fstore 13
      // 06e: bipush 0
      // 06f: istore 14
      // 071: aload 5
      // 073: getstatic vt2.zk4 Lvt2;
      // 076: iload 3
      // 077: ifeq 162
      // 07a: if_acmpne 156
      // 07d: goto 084
      // 080: invokestatic g7u.a (Loov;)Loov;
      // 083: athrow
      // 084: aload 1
      // 085: aload 2
      // 086: invokevirtual mew.y8e ()Lmew;
      // 089: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 08e: astore 15
      // 090: aload 15
      // 092: invokeinterface zfz.r_y ()Le0x; 1
      // 097: astore 16
      // 099: aload 16
      // 09b: invokestatic g7u.x2k (Le0x;)Z
      // 09e: ifeq 152
      // 0a1: aload 6
      // 0a3: iload 3
      // 0a4: ifeq 0d3
      // 0a7: goto 0ae
      // 0aa: invokestatic g7u.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: aload 15
      // 0b0: getstatic g7u.ru8 Lzb_;
      // 0b3: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0b8: if_acmpne 152
      // 0bb: goto 0c2
      // 0be: invokestatic g7u.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 15
      // 0c4: getstatic g7u.sxt Lqx_;
      // 0c7: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0cc: goto 0d3
      // 0cf: invokestatic g7u.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: checkcast vt2
      // 0d6: astore 17
      // 0d8: aload 17
      // 0da: getstatic vt2.z9q Lvt2;
      // 0dd: iload 3
      // 0de: ifeq 125
      // 0e1: if_acmpne 119
      // 0e4: goto 0eb
      // 0e7: invokestatic g7u.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: aload 1
      // 0ec: aload 2
      // 0ed: invokevirtual mew.idu ()Lmew;
      // 0f0: aload 4
      // 0f2: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 0f5: iload 3
      // 0f6: ifeq 113
      // 0f9: goto 100
      // 0fc: invokestatic g7u.a (Loov;)Loov;
      // 0ff: athrow
      // 100: ifne 119
      // 103: goto 10a
      // 106: invokestatic g7u.a (Loov;)Loov;
      // 109: athrow
      // 10a: fconst_0
      // 10b: fstore 12
      // 10d: ldc 0.5
      // 10f: nop
      // 110: fstore 13
      // 112: bipush 1
      // 113: istore 14
      // 115: iload 3
      // 116: ifne 152
      // 119: aload 17
      // 11b: getstatic vt2.mxp Lvt2;
      // 11e: goto 125
      // 121: invokestatic g7u.a (Loov;)Loov;
      // 124: athrow
      // 125: if_acmpne 152
      // 128: aload 1
      // 129: aload 2
      // 12a: invokevirtual mew.z6x ()Lmew;
      // 12d: aload 4
      // 12f: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 132: iload 3
      // 133: ifeq 150
      // 136: goto 13d
      // 139: invokestatic g7u.a (Loov;)Loov;
      // 13c: athrow
      // 13d: ifne 152
      // 140: goto 147
      // 143: invokestatic g7u.a (Loov;)Loov;
      // 146: athrow
      // 147: ldc 0.5
      // 149: nop
      // 14a: fstore 12
      // 14c: fconst_1
      // 14d: fstore 13
      // 14f: bipush 1
      // 150: istore 14
      // 152: iload 3
      // 153: ifne 408
      // 156: aload 5
      // 158: getstatic vt2.te4 Lvt2;
      // 15b: goto 162
      // 15e: invokestatic g7u.a (Loov;)Loov;
      // 161: athrow
      // 162: iload 3
      // 163: ifeq 24f
      // 166: if_acmpne 243
      // 169: goto 170
      // 16c: invokestatic g7u.a (Loov;)Loov;
      // 16f: athrow
      // 170: aload 1
      // 171: aload 2
      // 172: invokevirtual mew.o_8 ()Lmew;
      // 175: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 17a: astore 15
      // 17c: aload 15
      // 17e: invokeinterface zfz.r_y ()Le0x; 1
      // 183: astore 16
      // 185: aload 16
      // 187: invokestatic g7u.x2k (Le0x;)Z
      // 18a: ifeq 23f
      // 18d: aload 6
      // 18f: iload 3
      // 190: ifeq 1c0
      // 193: goto 19a
      // 196: invokestatic g7u.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 15
      // 19c: getstatic g7u.ru8 Lzb_;
      // 19f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1a4: if_acmpne 23f
      // 1a7: goto 1ae
      // 1aa: invokestatic g7u.a (Loov;)Loov;
      // 1ad: athrow
      // 1ae: ldc 0.5
      // 1b0: nop
      // 1b1: fstore 10
      // 1b3: fconst_1
      // 1b4: fstore 11
      // 1b6: aload 15
      // 1b8: getstatic g7u.sxt Lqx_;
      // 1bb: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1c0: checkcast vt2
      // 1c3: astore 17
      // 1c5: aload 17
      // 1c7: getstatic vt2.z9q Lvt2;
      // 1ca: iload 3
      // 1cb: ifeq 212
      // 1ce: if_acmpne 206
      // 1d1: goto 1d8
      // 1d4: invokestatic g7u.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: aload 1
      // 1d9: aload 2
      // 1da: invokevirtual mew.idu ()Lmew;
      // 1dd: aload 4
      // 1df: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 1e2: iload 3
      // 1e3: ifeq 200
      // 1e6: goto 1ed
      // 1e9: invokestatic g7u.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: ifne 206
      // 1f0: goto 1f7
      // 1f3: invokestatic g7u.a (Loov;)Loov;
      // 1f6: athrow
      // 1f7: fconst_0
      // 1f8: fstore 12
      // 1fa: ldc 0.5
      // 1fc: nop
      // 1fd: fstore 13
      // 1ff: bipush 1
      // 200: istore 14
      // 202: iload 3
      // 203: ifne 23f
      // 206: aload 17
      // 208: getstatic vt2.mxp Lvt2;
      // 20b: goto 212
      // 20e: invokestatic g7u.a (Loov;)Loov;
      // 211: athrow
      // 212: if_acmpne 23f
      // 215: aload 1
      // 216: aload 2
      // 217: invokevirtual mew.z6x ()Lmew;
      // 21a: aload 4
      // 21c: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 21f: iload 3
      // 220: ifeq 23d
      // 223: goto 22a
      // 226: invokestatic g7u.a (Loov;)Loov;
      // 229: athrow
      // 22a: ifne 23f
      // 22d: goto 234
      // 230: invokestatic g7u.a (Loov;)Loov;
      // 233: athrow
      // 234: ldc 0.5
      // 236: nop
      // 237: fstore 12
      // 239: fconst_1
      // 23a: fstore 13
      // 23c: bipush 1
      // 23d: istore 14
      // 23f: iload 3
      // 240: ifne 408
      // 243: aload 5
      // 245: getstatic vt2.mxp Lvt2;
      // 248: goto 24f
      // 24b: invokestatic g7u.a (Loov;)Loov;
      // 24e: athrow
      // 24f: iload 3
      // 250: ifeq 334
      // 253: if_acmpne 328
      // 256: goto 25d
      // 259: invokestatic g7u.a (Loov;)Loov;
      // 25c: athrow
      // 25d: aload 1
      // 25e: aload 2
      // 25f: invokevirtual mew.idu ()Lmew;
      // 262: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 267: astore 15
      // 269: aload 15
      // 26b: invokeinterface zfz.r_y ()Le0x; 1
      // 270: astore 16
      // 272: aload 16
      // 274: invokestatic g7u.x2k (Le0x;)Z
      // 277: ifeq 324
      // 27a: aload 6
      // 27c: iload 3
      // 27d: ifeq 2ad
      // 280: goto 287
      // 283: invokestatic g7u.a (Loov;)Loov;
      // 286: athrow
      // 287: aload 15
      // 289: getstatic g7u.ru8 Lzb_;
      // 28c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 291: if_acmpne 324
      // 294: goto 29b
      // 297: invokestatic g7u.a (Loov;)Loov;
      // 29a: athrow
      // 29b: fconst_0
      // 29c: fstore 12
      // 29e: ldc 0.5
      // 2a0: nop
      // 2a1: fstore 13
      // 2a3: aload 15
      // 2a5: getstatic g7u.sxt Lqx_;
      // 2a8: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2ad: checkcast vt2
      // 2b0: astore 17
      // 2b2: aload 17
      // 2b4: getstatic vt2.te4 Lvt2;
      // 2b7: iload 3
      // 2b8: ifeq 2f7
      // 2bb: if_acmpne 2eb
      // 2be: goto 2c5
      // 2c1: invokestatic g7u.a (Loov;)Loov;
      // 2c4: athrow
      // 2c5: aload 1
      // 2c6: aload 2
      // 2c7: invokevirtual mew.y8e ()Lmew;
      // 2ca: aload 4
      // 2cc: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 2cf: iload 3
      // 2d0: ifeq 2e5
      // 2d3: goto 2da
      // 2d6: invokestatic g7u.a (Loov;)Loov;
      // 2d9: athrow
      // 2da: ifne 2eb
      // 2dd: goto 2e4
      // 2e0: invokestatic g7u.a (Loov;)Loov;
      // 2e3: athrow
      // 2e4: bipush 1
      // 2e5: istore 14
      // 2e7: iload 3
      // 2e8: ifne 324
      // 2eb: aload 17
      // 2ed: getstatic vt2.zk4 Lvt2;
      // 2f0: goto 2f7
      // 2f3: invokestatic g7u.a (Loov;)Loov;
      // 2f6: athrow
      // 2f7: if_acmpne 324
      // 2fa: aload 1
      // 2fb: aload 2
      // 2fc: invokevirtual mew.o_8 ()Lmew;
      // 2ff: aload 4
      // 301: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 304: iload 3
      // 305: ifeq 322
      // 308: goto 30f
      // 30b: invokestatic g7u.a (Loov;)Loov;
      // 30e: athrow
      // 30f: ifne 324
      // 312: goto 319
      // 315: invokestatic g7u.a (Loov;)Loov;
      // 318: athrow
      // 319: ldc 0.5
      // 31b: nop
      // 31c: fstore 10
      // 31e: fconst_1
      // 31f: fstore 11
      // 321: bipush 1
      // 322: istore 14
      // 324: iload 3
      // 325: ifne 408
      // 328: aload 5
      // 32a: getstatic vt2.z9q Lvt2;
      // 32d: goto 334
      // 330: invokestatic g7u.a (Loov;)Loov;
      // 333: athrow
      // 334: if_acmpne 408
      // 337: aload 1
      // 338: aload 2
      // 339: invokevirtual mew.z6x ()Lmew;
      // 33c: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 341: astore 15
      // 343: aload 15
      // 345: invokeinterface zfz.r_y ()Le0x; 1
      // 34a: astore 16
      // 34c: aload 16
      // 34e: invokestatic g7u.x2k (Le0x;)Z
      // 351: iload 3
      // 352: ifeq 40a
      // 355: ifeq 408
      // 358: goto 35f
      // 35b: invokestatic g7u.a (Loov;)Loov;
      // 35e: athrow
      // 35f: aload 6
      // 361: iload 3
      // 362: ifeq 391
      // 365: goto 36c
      // 368: invokestatic g7u.a (Loov;)Loov;
      // 36b: athrow
      // 36c: aload 15
      // 36e: getstatic g7u.ru8 Lzb_;
      // 371: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 376: if_acmpne 408
      // 379: goto 380
      // 37c: invokestatic g7u.a (Loov;)Loov;
      // 37f: athrow
      // 380: aload 15
      // 382: getstatic g7u.sxt Lqx_;
      // 385: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 38a: goto 391
      // 38d: invokestatic g7u.a (Loov;)Loov;
      // 390: athrow
      // 391: checkcast vt2
      // 394: astore 17
      // 396: aload 17
      // 398: getstatic vt2.te4 Lvt2;
      // 39b: iload 3
      // 39c: ifeq 3db
      // 39f: if_acmpne 3cf
      // 3a2: goto 3a9
      // 3a5: invokestatic g7u.a (Loov;)Loov;
      // 3a8: athrow
      // 3a9: aload 1
      // 3aa: aload 2
      // 3ab: invokevirtual mew.y8e ()Lmew;
      // 3ae: aload 4
      // 3b0: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 3b3: iload 3
      // 3b4: ifeq 3c9
      // 3b7: goto 3be
      // 3ba: invokestatic g7u.a (Loov;)Loov;
      // 3bd: athrow
      // 3be: ifne 3cf
      // 3c1: goto 3c8
      // 3c4: invokestatic g7u.a (Loov;)Loov;
      // 3c7: athrow
      // 3c8: bipush 1
      // 3c9: istore 14
      // 3cb: iload 3
      // 3cc: ifne 408
      // 3cf: aload 17
      // 3d1: getstatic vt2.zk4 Lvt2;
      // 3d4: goto 3db
      // 3d7: invokestatic g7u.a (Loov;)Loov;
      // 3da: athrow
      // 3db: if_acmpne 408
      // 3de: aload 1
      // 3df: aload 2
      // 3e0: invokevirtual mew.o_8 ()Lmew;
      // 3e3: aload 4
      // 3e5: invokestatic g7u.xpr (Lm5n;Lmew;Lzfz;)Z
      // 3e8: iload 3
      // 3e9: ifeq 40a
      // 3ec: goto 3f3
      // 3ef: invokestatic g7u.a (Loov;)Loov;
      // 3f2: athrow
      // 3f3: ifne 408
      // 3f6: goto 3fd
      // 3f9: invokestatic g7u.a (Loov;)Loov;
      // 3fc: athrow
      // 3fd: ldc 0.5
      // 3ff: nop
      // 400: fstore 10
      // 402: fconst_1
      // 403: fstore 11
      // 405: bipush 1
      // 406: istore 14
      // 408: iload 14
      // 40a: iload 3
      // 40b: ifeq 431
      // 40e: ifeq 42f
      // 411: goto 418
      // 414: invokestatic g7u.a (Loov;)Loov;
      // 417: athrow
      // 418: aload 0
      // 419: fload 10
      // 41b: fload 8
      // 41d: fload 12
      // 41f: fload 11
      // 421: fload 9
      // 423: fload 13
      // 425: invokevirtual g7u.xl4 (FFFFFF)V
      // 428: goto 42f
      // 42b: invokestatic g7u.a (Loov;)Loov;
      // 42e: athrow
      // 42f: iload 14
      // 431: ireturn
   }

   @Override
   public void c76(t9d param1, mew param2, zfz param3, nh4 param4, List param5, i2h param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: invokevirtual g7u.gjc (Lm5n;Lmew;)V
      // 06: invokestatic t9d.b ()I
      // 09: aload 0
      // 0a: aload 1
      // 0b: aload 2
      // 0c: aload 3
      // 0d: aload 4
      // 0f: aload 5
      // 11: aload 6
      // 13: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 16: istore 7
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokevirtual g7u.hl8 (Lm5n;Lmew;)Z
      // 1e: istore 8
      // 20: aload 0
      // 21: aload 1
      // 22: aload 2
      // 23: aload 3
      // 24: aload 4
      // 26: aload 5
      // 28: aload 6
      // 2a: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 2d: iload 7
      // 2f: ifeq 78
      // 32: iload 8
      // 34: ifeq 6e
      // 37: goto 3e
      // 3a: invokestatic g7u.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: iload 7
      // 41: ifeq 6f
      // 44: goto 4b
      // 47: invokestatic g7u.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 1
      // 4c: aload 2
      // 4d: invokevirtual g7u.j1h (Lm5n;Lmew;)Z
      // 50: ifeq 6e
      // 53: goto 5a
      // 56: invokestatic g7u.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 1
      // 5c: aload 2
      // 5d: aload 3
      // 5e: aload 4
      // 60: aload 5
      // 62: aload 6
      // 64: invokespecial e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 67: goto 6e
      // 6a: invokestatic g7u.a (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 0
      // 6f: fconst_0
      // 70: fconst_0
      // 71: fconst_0
      // 72: fconst_1
      // 73: fconst_1
      // 74: fconst_1
      // 75: invokevirtual g7u.xl4 (FFFFFF)V
      // 78: return
   }

   @Override
   public void kyo(t9d var1, mew var2, zfz var3, Random var4) {
      this.yk1.kyo(var1, var2, var3, var4);
   }

   @Override
   public void uqb(t9d var1, mew var2, ha9 var3) {
      this.yk1.uqb(var1, var2, var3);
   }

   @Override
   public void bf0(t9d var1, mew var2, zfz var3) {
      this.yk1.bf0(var1, var2, var3);
   }

   @Override
   public int pil(m5n var1, mew var2) {
      return this.yk1.pil(var1, var2);
   }

   @Override
   public float aok(i2h var1) {
      return this.yk1.aok(var1);
   }

   @Override
   public w51 w3x() {
      return this.yk1.w3x();
   }

   @Override
   public int odp(t9d var1) {
      return this.yk1.odp(var1);
   }

   @Override
   public nh4 j54(t9d var1, mew var2) {
      return this.yk1.j54(var1, var2);
   }

   @Override
   public fqr efx(t9d var1, mew var2, i2h var3, fqr var4) {
      return this.yk1.efx(var1, var2, var3, var4);
   }

   @Override
   public boolean siy() {
      return this.yk1.siy();
   }

   @Override
   public boolean qc_(zfz var1, boolean var2) {
      return this.yk1.qc_(var1, var2);
   }

   @Override
   public boolean ctq(t9d var1, mew var2) {
      return this.yk1.ctq(var1, var2);
   }

   @Override
   public void tfc(t9d var1, mew var2, zfz var3) {
      this.z3l(var1, var2, this.j61, ox_.ibw);
      this.yk1.tfc(var1, var2, this.j61);
   }

   @Override
   public void b8f(t9d var1, mew var2, zfz var3) {
      this.yk1.b8f(var1, var2, this.j61);
   }

   @Override
   public void xqy(t9d var1, mew var2, i2h var3) {
      this.yk1.xqy(var1, var2, var3);
   }

   @Override
   public void zvy(t9d var1, mew var2, zfz var3, Random var4) {
      this.yk1.zvy(var1, var2, var3, var4);
   }

   @Override
   public boolean cl2(t9d var1, mew var2, zfz var3, ha9 var4, vt2 var5, float var6, float var7, float var8) {
      return this.yk1.cl2(var1, var2, this.j61, var4, vt2.m3r, 0.0F, 0.0F, 0.0F);
   }

   @Override
   public void a4c(t9d var1, mew var2, vu6 var3) {
      this.yk1.a4c(var1, var2, var3);
   }

   @Override
   public _mi uoz(zfz var1) {
      return this.yk1.uoz(this.j61);
   }

   @Override
   public zfz qk_(t9d param1, mew param2, vt2 param3, float param4, float param5, float param6, int param7, g_3 param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 9
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: fload 4
      // 0b: fload 5
      // 0d: fload 6
      // 0f: iload 7
      // 11: aload 8
      // 13: invokespecial e0x.qk_ (Lt9d;Lmew;Lvt2;FFFILg_3;)Lzfz;
      // 16: astore 10
      // 18: aload 10
      // 1a: getstatic g7u.sxt Lqx_;
      // 1d: aload 8
      // 1f: invokevirtual g_3.u0f ()Lvt2;
      // 22: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 27: getstatic g7u.vjy Lzb_;
      // 2a: getstatic g7u$qmc.rn9 Lg7u$qmc;
      // 2d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 32: iload 9
      // 34: ifne 75
      // 37: astore 10
      // 39: aload 3
      // 3a: getstatic vt2.m3r Lvt2;
      // 3d: if_acmpeq 73
      // 40: aload 3
      // 41: getstatic vt2.rf3 Lvt2;
      // 44: if_acmpeq 5f
      // 47: goto 4e
      // 4a: invokestatic g7u.a (Loov;)Loov;
      // 4d: athrow
      // 4e: fload 5
      // 50: f2d
      // 51: ldc2_w 0.5
      // 54: dcmpg
      // 55: ifgt 73
      // 58: goto 5f
      // 5b: invokestatic g7u.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 10
      // 61: getstatic g7u.ru8 Lzb_;
      // 64: getstatic g7u$lrl.ow0 Lg7u$lrl;
      // 67: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6c: goto 80
      // 6f: invokestatic g7u.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 10
      // 75: getstatic g7u.ru8 Lzb_;
      // 78: getstatic g7u$lrl.vvx Lg7u$lrl;
      // 7b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 80: areturn
   }

   @Override
   public akm mns(t9d param1, mew param2, fqr param3, fqr param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 8
      // 002: anewarray 301
      // 005: astore 6
      // 007: invokestatic t9d.b ()I
      // 00a: aload 1
      // 00b: aload 2
      // 00c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 00f: astore 7
      // 011: istore 5
      // 013: aload 7
      // 015: getstatic g7u.sxt Lqx_;
      // 018: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 01d: checkcast vt2
      // 020: invokevirtual vt2.tmy ()I
      // 023: istore 8
      // 025: aload 7
      // 027: getstatic g7u.ru8 Lzb_;
      // 02a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 02f: getstatic g7u$lrl.vvx Lg7u$lrl;
      // 032: if_acmpne 03d
      // 035: bipush 1
      // 036: goto 03e
      // 039: invokestatic g7u.a (Loov;)Loov;
      // 03c: athrow
      // 03d: bipush 0
      // 03e: istore 9
      // 040: getstatic g7u.sgn [[I
      // 043: iload 8
      // 045: iload 9
      // 047: iload 5
      // 049: ifeq 057
      // 04c: ifeq 05a
      // 04f: goto 056
      // 052: invokestatic g7u.a (Loov;)Loov;
      // 055: athrow
      // 056: bipush 4
      // 057: goto 05b
      // 05a: bipush 0
      // 05b: iadd
      // 05c: aaload
      // 05d: astore 10
      // 05f: aload 0
      // 060: bipush 1
      // 061: putfield g7u.wdb Z
      // 064: bipush 0
      // 065: istore 11
      // 067: iload 11
      // 069: bipush 8
      // 06b: if_icmpge 0b3
      // 06e: aload 0
      // 06f: iload 11
      // 071: putfield g7u.xmj I
      // 074: iload 5
      // 076: ifeq 0ae
      // 079: aload 10
      // 07b: iload 5
      // 07d: ifeq 0b5
      // 080: goto 087
      // 083: invokestatic g7u.a (Loov;)Loov;
      // 086: athrow
      // 087: iload 11
      // 089: invokestatic java/util/Arrays.binarySearch ([II)I
      // 08c: ifge 0ab
      // 08f: goto 096
      // 092: invokestatic g7u.a (Loov;)Loov;
      // 095: athrow
      // 096: aload 6
      // 098: iload 11
      // 09a: aload 0
      // 09b: aload 1
      // 09c: aload 2
      // 09d: aload 3
      // 09e: aload 4
      // 0a0: invokespecial e0x.mns (Lt9d;Lmew;Lfqr;Lfqr;)Lakm;
      // 0a3: aastore
      // 0a4: goto 0ab
      // 0a7: invokestatic g7u.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: iinc 11 1
      // 0ae: iload 5
      // 0b0: ifne 067
      // 0b3: aload 10
      // 0b5: astore 11
      // 0b7: aload 11
      // 0b9: arraylength
      // 0ba: istore 12
      // 0bc: bipush 0
      // 0bd: istore 13
      // 0bf: iload 13
      // 0c1: iload 12
      // 0c3: if_icmpge 0db
      // 0c6: aload 11
      // 0c8: iload 13
      // 0ca: iaload
      // 0cb: istore 14
      // 0cd: aload 6
      // 0cf: iload 14
      // 0d1: aconst_null
      // 0d2: aastore
      // 0d3: iinc 13 1
      // 0d6: iload 5
      // 0d8: ifne 0bf
      // 0db: aconst_null
      // 0dc: astore 11
      // 0de: dconst_0
      // 0df: dstore 12
      // 0e1: aload 6
      // 0e3: astore 14
      // 0e5: aload 14
      // 0e7: arraylength
      // 0e8: istore 15
      // 0ea: bipush 0
      // 0eb: istore 16
      // 0ed: iload 16
      // 0ef: iload 15
      // 0f1: if_icmpge 148
      // 0f4: aload 14
      // 0f6: iload 16
      // 0f8: aaload
      // 0f9: astore 17
      // 0fb: iload 5
      // 0fd: ifeq 143
      // 100: aload 17
      // 102: iload 5
      // 104: ifeq 14a
      // 107: goto 10e
      // 10a: invokestatic g7u.a (Loov;)Loov;
      // 10d: athrow
      // 10e: ifnull 140
      // 111: goto 118
      // 114: invokestatic g7u.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 17
      // 11a: getfield akm.jhn Lfqr;
      // 11d: aload 4
      // 11f: invokevirtual fqr.y8x (Lfqr;)D
      // 122: dstore 18
      // 124: iload 5
      // 126: ifeq 143
      // 129: dload 18
      // 12b: dload 12
      // 12d: dcmpl
      // 12e: ifle 140
      // 131: goto 138
      // 134: invokestatic g7u.a (Loov;)Loov;
      // 137: athrow
      // 138: aload 17
      // 13a: astore 11
      // 13c: dload 18
      // 13e: dstore 12
      // 140: iinc 16 1
      // 143: iload 5
      // 145: ifne 0ed
      // 148: aload 11
      // 14a: areturn
   }

   @Override
   public zfz kig(int var1) {
      zfz var10000;
      zb_ var10001;
      g7u$lrl var10002;
      label16: {
         try {
            var10000 = this.l4i();
            var10001 = ru8;
            if ((var1 & 4) > 0) {
               var10002 = g7u$lrl.vvx;
               break label16;
            }
         } catch (oov var3) {
            throw a(var3);
         }

         var10002 = g7u$lrl.ow0;
      }

      zfz var2 = var10000.zvi(var10001, var10002);
      return var2.zvi(sxt, vt2.jw6(5 - (var1 & 3)));
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = t9d.b();
      int var3 = 0;

      label20: {
         try {
            if (var2 == 0) {
               return var3;
            }

            if (var1.dil(ru8) != g7u$lrl.vvx) {
               break label20;
            }
         } catch (oov var4) {
            throw a(var4);
         }

         var3 |= 4;
      }

      var3 |= 5 - ((vt2)var1.dil(sxt)).c3s();
      return var3;
   }

   @Override
   public zfz w1b(zfz param1, m5n param2, mew param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 2
      // 07: aload 3
      // 08: invokevirtual g7u.hl8 (Lm5n;Lmew;)Z
      // 0b: iload 4
      // 0d: ifne 83
      // 10: ifeq 76
      // 13: goto 1a
      // 16: invokestatic g7u.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 2
      // 1c: aload 3
      // 1d: invokevirtual g7u.p9f (Lm5n;Lmew;)I
      // 20: tableswitch 81 0 2 32 50 68
      // 3c: invokestatic g7u.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 1
      // 41: getstatic g7u.vjy Lzb_;
      // 44: getstatic g7u$qmc.rn9 Lg7u$qmc;
      // 47: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 4c: astore 1
      // 4d: iload 4
      // 4f: ifeq 71
      // 52: aload 1
      // 53: getstatic g7u.vjy Lzb_;
      // 56: getstatic g7u$qmc.ryv Lg7u$qmc;
      // 59: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 5e: astore 1
      // 5f: iload 4
      // 61: ifeq 71
      // 64: aload 1
      // 65: getstatic g7u.vjy Lzb_;
      // 68: getstatic g7u$qmc.qxj Lg7u$qmc;
      // 6b: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 70: astore 1
      // 71: iload 4
      // 73: ifeq cd
      // 76: aload 0
      // 77: aload 2
      // 78: aload 3
      // 79: invokevirtual g7u.r8u (Lm5n;Lmew;)I
      // 7c: goto 83
      // 7f: invokestatic g7u.a (Loov;)Loov;
      // 82: athrow
      // 83: tableswitch 74 0 2 25 43 61
      // 9c: aload 1
      // 9d: getstatic g7u.vjy Lzb_;
      // a0: getstatic g7u$qmc.rn9 Lg7u$qmc;
      // a3: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // a8: astore 1
      // a9: iload 4
      // ab: ifeq cd
      // ae: aload 1
      // af: getstatic g7u.vjy Lzb_;
      // b2: getstatic g7u$qmc.xd3 Lg7u$qmc;
      // b5: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // ba: astore 1
      // bb: iload 4
      // bd: ifeq cd
      // c0: aload 1
      // c1: getstatic g7u.vjy Lzb_;
      // c4: getstatic g7u$qmc.pfi Lg7u$qmc;
      // c7: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // cc: astore 1
      // cd: aload 1
      // ce: areturn
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{sxt, ru8, vjy});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(2451639808541702898L, -6826012531869619369L, MethodHandles.lookup().lookupClass()).a(195893470525510L);
      // $VF: monitorexit
      long var10 = var10000 ^ 48661025071543L;
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
      String var5 = "X\u0083ù\u0002áagÎ\b@4ÈÆ`zÇ\u0014\bÂaÀ\fÂB\u0011\u0016";
      int var7 = "X\u0083ù\u0002áagÎ\b@4ÈÆ`zÇ\u0014\bÂaÀ\fÂB\u0011\u0016".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            sxt = qx_.q0o(var8[0], vt2$unz.fzl);
            ru8 = zb_.pq4(var8[2], g7u$lrl.class);
            vjy = zb_.pq4(var8[1], g7u$qmc.class);
            sgn = new int[][]{{4, 5}, {5, 7}, {6, 7}, {4, 6}, {0, 1}, {1, 3}, {2, 3}, {0, 2}};
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
