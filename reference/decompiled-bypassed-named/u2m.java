import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.tileentity.TileEntityChest;

public class u2m extends q9h {
   public u2m() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokespecial q9h.<init> ()V
      // 04: aload 0
      // 05: new vu3
      // 08: dup
      // 09: invokespecial vu3.<init> ()V
      // 0c: putfield u2m.zqk Lvu3;
      // 0f: aload 0
      // 10: new uec
      // 13: dup
      // 14: invokespecial uec.<init> ()V
      // 17: putfield u2m.hws Lvu3;
      // 1a: invokestatic java/util/Calendar.getInstance ()Ljava/util/Calendar;
      // 1d: astore 1
      // 1e: aload 1
      // 1f: bipush 2
      // 20: invokevirtual java/util/Calendar.get (I)I
      // 23: bipush 1
      // 24: iadd
      // 25: bipush 12
      // 27: if_icmpne 58
      // 2a: aload 1
      // 2b: bipush 5
      // 2c: invokevirtual java/util/Calendar.get (I)I
      // 2f: bipush 24
      // 31: if_icmplt 58
      // 34: goto 3b
      // 37: invokestatic u2m.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 1
      // 3c: bipush 5
      // 3d: invokevirtual java/util/Calendar.get (I)I
      // 40: bipush 26
      // 42: if_icmpgt 58
      // 45: goto 4c
      // 48: invokestatic u2m.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: bipush 1
      // 4e: putfield u2m.o4r Z
      // 51: goto 58
      // 54: invokestatic u2m.a (Loov;)Loov;
      // 57: athrow
      // 58: return
   }

   public void sgj(TileEntityChest param1, double param2, double param4, double param6, float param8, int param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic hzu.m45 ()V
      // 003: invokestatic OpaquePredicate.b ()I
      // 006: sipush 515
      // 009: invokestatic hzu.d14 (I)V
      // 00c: bipush 1
      // 00d: invokestatic hzu.jun (Z)V
      // 010: istore 10
      // 012: aconst_null
      // 013: astore 12
      // 015: aload 1
      // 016: iload 10
      // 018: ifeq 038
      // 01b: invokevirtual net/minecraft/tileentity/TileEntityChest.g8i ()Z
      // 01e: ifne 030
      // 021: goto 028
      // 024: invokestatic u2m.a (Loov;)Loov;
      // 027: athrow
      // 028: bipush 0
      // 029: istore 11
      // 02b: iload 10
      // 02d: ifne 095
      // 030: aload 1
      // 031: goto 038
      // 034: invokestatic u2m.a (Loov;)Loov;
      // 037: athrow
      // 038: invokevirtual net/minecraft/tileentity/TileEntityChest.qwl ()Le0x;
      // 03b: astore 12
      // 03d: aload 1
      // 03e: invokevirtual net/minecraft/tileentity/TileEntityChest.hvh ()I
      // 041: istore 11
      // 043: aload 12
      // 045: instanceof hrd
      // 048: iload 10
      // 04a: ifeq 059
      // 04d: ifeq 091
      // 050: goto 057
      // 053: invokestatic u2m.a (Loov;)Loov;
      // 056: athrow
      // 057: iload 11
      // 059: iload 10
      // 05b: ifeq 08f
      // 05e: ifne 091
      // 061: goto 068
      // 064: invokestatic u2m.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 12
      // 06a: checkcast hrd
      // 06d: aload 1
      // 06e: invokevirtual net/minecraft/tileentity/TileEntityChest.yi7 ()Lt9d;
      // 071: aload 1
      // 072: invokevirtual net/minecraft/tileentity/TileEntityChest.y8_ ()Lmew;
      // 075: aload 1
      // 076: invokevirtual net/minecraft/tileentity/TileEntityChest.yi7 ()Lt9d;
      // 079: aload 1
      // 07a: invokevirtual net/minecraft/tileentity/TileEntityChest.y8_ ()Lmew;
      // 07d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 080: invokevirtual hrd.fro (Lt9d;Lmew;Lzfz;)Lzfz;
      // 083: pop
      // 084: aload 1
      // 085: invokevirtual net/minecraft/tileentity/TileEntityChest.hvh ()I
      // 088: goto 08f
      // 08b: invokestatic u2m.a (Loov;)Loov;
      // 08e: athrow
      // 08f: istore 11
      // 091: aload 1
      // 092: invokevirtual net/minecraft/tileentity/TileEntityChest.hc1 ()V
      // 095: aload 1
      // 096: getfield net/minecraft/tileentity/TileEntityChest.sgw Lnet/minecraft/tileentity/TileEntityChest;
      // 099: iload 10
      // 09b: ifeq 0b3
      // 09e: ifnonnull 51b
      // 0a1: goto 0a8
      // 0a4: invokestatic u2m.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 1
      // 0a9: getfield net/minecraft/tileentity/TileEntityChest.af8 Lnet/minecraft/tileentity/TileEntityChest;
      // 0ac: goto 0b3
      // 0af: invokestatic u2m.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: iload 10
      // 0b5: ifeq 0cd
      // 0b8: ifnonnull 51b
      // 0bb: goto 0c2
      // 0be: invokestatic u2m.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 1
      // 0c3: getfield net/minecraft/tileentity/TileEntityChest.xdt Lnet/minecraft/tileentity/TileEntityChest;
      // 0c6: goto 0cd
      // 0c9: invokestatic u2m.a (Loov;)Loov;
      // 0cc: athrow
      // 0cd: iload 10
      // 0cf: ifeq 0e7
      // 0d2: ifnonnull 19e
      // 0d5: goto 0dc
      // 0d8: invokestatic u2m.a (Loov;)Loov;
      // 0db: athrow
      // 0dc: aload 1
      // 0dd: getfield net/minecraft/tileentity/TileEntityChest.bbu Lnet/minecraft/tileentity/TileEntityChest;
      // 0e0: goto 0e7
      // 0e3: invokestatic u2m.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: ifnonnull 19e
      // 0ea: aload 0
      // 0eb: getfield u2m.zqk Lvu3;
      // 0ee: astore 13
      // 0f0: iload 9
      // 0f2: iload 10
      // 0f4: ifeq 147
      // 0f7: iflt 13c
      // 0fa: goto 101
      // 0fd: invokestatic u2m.a (Loov;)Loov;
      // 100: athrow
      // 101: aload 0
      // 102: getstatic u2m._oj [Lgdz;
      // 105: iload 9
      // 107: aaload
      // 108: invokevirtual u2m.g3j (Lgdz;)V
      // 10b: sipush 5890
      // 10e: invokestatic hzu.ah8 (I)V
      // 111: invokestatic hzu.dp2 ()V
      // 114: ldc 4.0
      // 116: nop
      // 117: ldc 4.0
      // 119: nop
      // 11a: fconst_1
      // 11b: invokestatic hzu.syc (FFF)V
      // 11e: ldc 0.0625
      // 120: nop
      // 121: ldc 0.0625
      // 123: nop
      // 124: ldc 0.0625
      // 126: nop
      // 127: invokestatic hzu.a4k (FFF)V
      // 12a: sipush 5888
      // 12d: invokestatic hzu.ah8 (I)V
      // 130: iload 10
      // 132: ifne 24d
      // 135: goto 13c
      // 138: invokestatic u2m.a (Loov;)Loov;
      // 13b: athrow
      // 13c: aload 0
      // 13d: getfield u2m.o4r Z
      // 140: goto 147
      // 143: invokestatic u2m.a (Loov;)Loov;
      // 146: athrow
      // 147: iload 10
      // 149: ifeq 174
      // 14c: ifeq 169
      // 14f: goto 156
      // 152: invokestatic u2m.a (Loov;)Loov;
      // 155: athrow
      // 156: aload 0
      // 157: getstatic u2m.tsz Lgdz;
      // 15a: invokevirtual u2m.g3j (Lgdz;)V
      // 15d: iload 10
      // 15f: ifne 24d
      // 162: goto 169
      // 165: invokestatic u2m.a (Loov;)Loov;
      // 168: athrow
      // 169: aload 1
      // 16a: invokevirtual net/minecraft/tileentity/TileEntityChest.cen ()I
      // 16d: goto 174
      // 170: invokestatic u2m.a (Loov;)Loov;
      // 173: athrow
      // 174: bipush 1
      // 175: if_icmpne 18b
      // 178: aload 0
      // 179: getstatic u2m.njk Lgdz;
      // 17c: invokevirtual u2m.g3j (Lgdz;)V
      // 17f: iload 10
      // 181: ifne 24d
      // 184: goto 18b
      // 187: invokestatic u2m.a (Loov;)Loov;
      // 18a: athrow
      // 18b: aload 0
      // 18c: getstatic u2m.uoc Lgdz;
      // 18f: invokevirtual u2m.g3j (Lgdz;)V
      // 192: iload 10
      // 194: ifne 24d
      // 197: goto 19e
      // 19a: invokestatic u2m.a (Loov;)Loov;
      // 19d: athrow
      // 19e: aload 0
      // 19f: getfield u2m.hws Lvu3;
      // 1a2: astore 13
      // 1a4: iload 9
      // 1a6: iload 10
      // 1a8: ifeq 1fb
      // 1ab: iflt 1f0
      // 1ae: goto 1b5
      // 1b1: invokestatic u2m.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: aload 0
      // 1b6: getstatic u2m._oj [Lgdz;
      // 1b9: iload 9
      // 1bb: aaload
      // 1bc: invokevirtual u2m.g3j (Lgdz;)V
      // 1bf: sipush 5890
      // 1c2: invokestatic hzu.ah8 (I)V
      // 1c5: invokestatic hzu.dp2 ()V
      // 1c8: ldc 8.0
      // 1ca: nop
      // 1cb: ldc 4.0
      // 1cd: nop
      // 1ce: fconst_1
      // 1cf: invokestatic hzu.syc (FFF)V
      // 1d2: ldc 0.0625
      // 1d4: nop
      // 1d5: ldc 0.0625
      // 1d7: nop
      // 1d8: ldc 0.0625
      // 1da: nop
      // 1db: invokestatic hzu.a4k (FFF)V
      // 1de: sipush 5888
      // 1e1: invokestatic hzu.ah8 (I)V
      // 1e4: iload 10
      // 1e6: ifne 24d
      // 1e9: goto 1f0
      // 1ec: invokestatic u2m.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: aload 0
      // 1f1: getfield u2m.o4r Z
      // 1f4: goto 1fb
      // 1f7: invokestatic u2m.a (Loov;)Loov;
      // 1fa: athrow
      // 1fb: iload 10
      // 1fd: ifeq 228
      // 200: ifeq 21d
      // 203: goto 20a
      // 206: invokestatic u2m.a (Loov;)Loov;
      // 209: athrow
      // 20a: aload 0
      // 20b: getstatic u2m._3o Lgdz;
      // 20e: invokevirtual u2m.g3j (Lgdz;)V
      // 211: iload 10
      // 213: ifne 24d
      // 216: goto 21d
      // 219: invokestatic u2m.a (Loov;)Loov;
      // 21c: athrow
      // 21d: aload 1
      // 21e: invokevirtual net/minecraft/tileentity/TileEntityChest.cen ()I
      // 221: goto 228
      // 224: invokestatic u2m.a (Loov;)Loov;
      // 227: athrow
      // 228: bipush 1
      // 229: if_icmpne 23f
      // 22c: aload 0
      // 22d: getstatic u2m.k94 Lgdz;
      // 230: invokevirtual u2m.g3j (Lgdz;)V
      // 233: iload 10
      // 235: ifne 24d
      // 238: goto 23f
      // 23b: invokestatic u2m.a (Loov;)Loov;
      // 23e: athrow
      // 23f: aload 0
      // 240: getstatic u2m.v5w Lgdz;
      // 243: invokevirtual u2m.g3j (Lgdz;)V
      // 246: goto 24d
      // 249: invokestatic u2m.a (Loov;)Loov;
      // 24c: athrow
      // 24d: invokestatic hzu.dp2 ()V
      // 250: invokestatic hzu.ixc ()V
      // 253: iload 9
      // 255: iload 10
      // 257: ifeq 298
      // 25a: ifge 272
      // 25d: goto 264
      // 260: invokestatic u2m.a (Loov;)Loov;
      // 263: athrow
      // 264: fconst_1
      // 265: fconst_1
      // 266: fconst_1
      // 267: fconst_1
      // 268: invokestatic hzu.wn0 (FFFF)V
      // 26b: goto 272
      // 26e: invokestatic u2m.a (Loov;)Loov;
      // 271: athrow
      // 272: dload 2
      // 273: d2f
      // 274: dload 4
      // 276: d2f
      // 277: fconst_1
      // 278: fadd
      // 279: dload 6
      // 27b: d2f
      // 27c: fconst_1
      // 27d: fadd
      // 27e: invokestatic hzu.a4k (FFF)V
      // 281: fconst_1
      // 282: ldc -1.0
      // 284: nop
      // 285: ldc -1.0
      // 287: nop
      // 288: invokestatic hzu.syc (FFF)V
      // 28b: ldc 0.5
      // 28d: nop
      // 28e: ldc 0.5
      // 290: nop
      // 291: ldc 0.5
      // 293: nop
      // 294: invokestatic hzu.a4k (FFF)V
      // 297: bipush 0
      // 298: istore 14
      // 29a: iload 11
      // 29c: bipush 2
      // 29d: iload 10
      // 29f: ifeq 2b4
      // 2a2: if_icmpne 2b1
      // 2a5: goto 2ac
      // 2a8: invokestatic u2m.a (Loov;)Loov;
      // 2ab: athrow
      // 2ac: sipush 180
      // 2af: istore 14
      // 2b1: iload 11
      // 2b3: bipush 3
      // 2b4: iload 10
      // 2b6: ifeq 2c9
      // 2b9: if_icmpne 2c6
      // 2bc: goto 2c3
      // 2bf: invokestatic u2m.a (Loov;)Loov;
      // 2c2: athrow
      // 2c3: bipush 0
      // 2c4: istore 14
      // 2c6: iload 11
      // 2c8: bipush 4
      // 2c9: iload 10
      // 2cb: ifeq 2df
      // 2ce: if_icmpne 2dc
      // 2d1: goto 2d8
      // 2d4: invokestatic u2m.a (Loov;)Loov;
      // 2d7: athrow
      // 2d8: bipush 90
      // 2da: istore 14
      // 2dc: iload 11
      // 2de: bipush 5
      // 2df: iload 10
      // 2e1: ifeq 2f5
      // 2e4: if_icmpne 2f2
      // 2e7: goto 2ee
      // 2ea: invokestatic u2m.a (Loov;)Loov;
      // 2ed: athrow
      // 2ee: bipush -90
      // 2f0: istore 14
      // 2f2: iload 11
      // 2f4: bipush 2
      // 2f5: iload 10
      // 2f7: ifeq 32e
      // 2fa: if_icmpne 31f
      // 2fd: goto 304
      // 300: invokestatic u2m.a (Loov;)Loov;
      // 303: athrow
      // 304: aload 1
      // 305: getfield net/minecraft/tileentity/TileEntityChest.xdt Lnet/minecraft/tileentity/TileEntityChest;
      // 308: ifnull 31f
      // 30b: goto 312
      // 30e: invokestatic u2m.a (Loov;)Loov;
      // 311: athrow
      // 312: fconst_1
      // 313: fconst_0
      // 314: fconst_0
      // 315: invokestatic hzu.a4k (FFF)V
      // 318: goto 31f
      // 31b: invokestatic u2m.a (Loov;)Loov;
      // 31e: athrow
      // 31f: iload 11
      // 321: iload 10
      // 323: ifeq 35c
      // 326: bipush 5
      // 327: goto 32e
      // 32a: invokestatic u2m.a (Loov;)Loov;
      // 32d: athrow
      // 32e: if_icmpne 35a
      // 331: aload 1
      // 332: getfield net/minecraft/tileentity/TileEntityChest.bbu Lnet/minecraft/tileentity/TileEntityChest;
      // 335: iload 10
      // 337: ifeq 370
      // 33a: goto 341
      // 33d: invokestatic u2m.a (Loov;)Loov;
      // 340: athrow
      // 341: ifnull 35a
      // 344: goto 34b
      // 347: invokestatic u2m.a (Loov;)Loov;
      // 34a: athrow
      // 34b: fconst_0
      // 34c: fconst_0
      // 34d: ldc -1.0
      // 34f: nop
      // 350: invokestatic hzu.a4k (FFF)V
      // 353: goto 35a
      // 356: invokestatic u2m.a (Loov;)Loov;
      // 359: athrow
      // 35a: iload 14
      // 35c: i2f
      // 35d: fconst_0
      // 35e: fconst_1
      // 35f: fconst_0
      // 360: invokestatic hzu.a2h (FFFF)V
      // 363: ldc -0.5
      // 365: nop
      // 366: ldc -0.5
      // 368: nop
      // 369: ldc -0.5
      // 36b: nop
      // 36c: invokestatic hzu.a4k (FFF)V
      // 36f: aload 1
      // 370: getfield net/minecraft/tileentity/TileEntityChest.mac F
      // 373: aload 1
      // 374: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 377: aload 1
      // 378: getfield net/minecraft/tileentity/TileEntityChest.mac F
      // 37b: fsub
      // 37c: fload 8
      // 37e: fmul
      // 37f: fadd
      // 380: fstore 15
      // 382: aload 1
      // 383: getfield net/minecraft/tileentity/TileEntityChest.sgw Lnet/minecraft/tileentity/TileEntityChest;
      // 386: iload 10
      // 388: ifeq 3cd
      // 38b: ifnull 3c9
      // 38e: goto 395
      // 391: invokestatic u2m.a (Loov;)Loov;
      // 394: athrow
      // 395: aload 1
      // 396: getfield net/minecraft/tileentity/TileEntityChest.sgw Lnet/minecraft/tileentity/TileEntityChest;
      // 399: iload 10
      // 39b: ifeq 3cd
      // 39e: goto 3a5
      // 3a1: invokestatic u2m.a (Loov;)Loov;
      // 3a4: athrow
      // 3a5: getfield net/minecraft/tileentity/TileEntityChest.mac F
      // 3a8: aload 1
      // 3a9: getfield net/minecraft/tileentity/TileEntityChest.sgw Lnet/minecraft/tileentity/TileEntityChest;
      // 3ac: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 3af: aload 1
      // 3b0: getfield net/minecraft/tileentity/TileEntityChest.sgw Lnet/minecraft/tileentity/TileEntityChest;
      // 3b3: getfield net/minecraft/tileentity/TileEntityChest.mac F
      // 3b6: fsub
      // 3b7: fload 8
      // 3b9: fmul
      // 3ba: fadd
      // 3bb: fstore 16
      // 3bd: fload 16
      // 3bf: fload 15
      // 3c1: fcmpl
      // 3c2: ifle 3c9
      // 3c5: fload 16
      // 3c7: fstore 15
      // 3c9: aload 1
      // 3ca: getfield net/minecraft/tileentity/TileEntityChest.af8 Lnet/minecraft/tileentity/TileEntityChest;
      // 3cd: iload 10
      // 3cf: ifeq 3e7
      // 3d2: ifnull 417
      // 3d5: goto 3dc
      // 3d8: invokestatic u2m.a (Loov;)Loov;
      // 3db: athrow
      // 3dc: aload 1
      // 3dd: getfield net/minecraft/tileentity/TileEntityChest.af8 Lnet/minecraft/tileentity/TileEntityChest;
      // 3e0: goto 3e7
      // 3e3: invokestatic u2m.a (Loov;)Loov;
      // 3e6: athrow
      // 3e7: getfield net/minecraft/tileentity/TileEntityChest.mac F
      // 3ea: aload 1
      // 3eb: getfield net/minecraft/tileentity/TileEntityChest.af8 Lnet/minecraft/tileentity/TileEntityChest;
      // 3ee: getfield net/minecraft/tileentity/TileEntityChest.g2m F
      // 3f1: aload 1
      // 3f2: getfield net/minecraft/tileentity/TileEntityChest.af8 Lnet/minecraft/tileentity/TileEntityChest;
      // 3f5: getfield net/minecraft/tileentity/TileEntityChest.mac F
      // 3f8: fsub
      // 3f9: fload 8
      // 3fb: fmul
      // 3fc: fadd
      // 3fd: fstore 16
      // 3ff: fload 16
      // 401: fload 15
      // 403: fcmpl
      // 404: iload 10
      // 406: ifeq 44c
      // 409: ifle 417
      // 40c: goto 413
      // 40f: invokestatic u2m.a (Loov;)Loov;
      // 412: athrow
      // 413: fload 16
      // 415: fstore 15
      // 417: fconst_1
      // 418: fload 15
      // 41a: fsub
      // 41b: fstore 15
      // 41d: fconst_1
      // 41e: fload 15
      // 420: fload 15
      // 422: fmul
      // 423: fload 15
      // 425: fmul
      // 426: fsub
      // 427: fstore 15
      // 429: aload 13
      // 42b: iload 10
      // 42d: ifeq 4e4
      // 430: getfield vu3.e0v Ltf8;
      // 433: fload 15
      // 435: ldc 3.1415927
      // 437: nop
      // 438: fmul
      // 439: fconst_2
      // 43a: fdiv
      // 43b: fneg
      // 43c: putfield tf8.pod F
      // 43f: getstatic ModuleRegistry.qt1 Lvvu;
      // 442: invokevirtual vvu.klu ()Z
      // 445: goto 44c
      // 448: invokestatic u2m.a (Loov;)Loov;
      // 44b: athrow
      // 44c: ifeq 4db
      // 44f: getstatic vvu.mh3 Lcn7;
      // 452: invokevirtual BooleanSetting.getValue ()Ljava/lang/Boolean;
      // 455: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 458: iload 10
      // 45a: ifeq 479
      // 45d: goto 464
      // 460: invokestatic u2m.a (Loov;)Loov;
      // 463: athrow
      // 464: ifeq 4db
      // 467: goto 46e
      // 46a: invokestatic u2m.a (Loov;)Loov;
      // 46d: athrow
      // 46e: aload 1
      // 46f: invokevirtual net/minecraft/tileentity/TileEntityChest.g8i ()Z
      // 472: goto 479
      // 475: invokestatic u2m.a (Loov;)Loov;
      // 478: athrow
      // 479: ifeq 4db
      // 47c: aload 13
      // 47e: invokevirtual vu3.znj ()V
      // 481: invokestatic iyr.itn ()V
      // 484: aload 13
      // 486: invokevirtual vu3.znj ()V
      // 489: invokestatic iyr.e3_ ()V
      // 48c: aload 13
      // 48e: invokevirtual vu3.znj ()V
      // 491: invokestatic iyr.xby ()V
      // 494: aload 12
      // 496: getstatic ox_.wpv Le0x;
      // 499: if_acmpne 4b9
      // 49c: goto 4a3
      // 49f: invokestatic u2m.a (Loov;)Loov;
      // 4a2: athrow
      // 4a3: new java/awt/Color
      // 4a6: dup
      // 4a7: sipush 255
      // 4aa: bipush 0
      // 4ab: bipush 0
      // 4ac: invokespecial java/awt/Color.<init> (III)V
      // 4af: invokevirtual java/awt/Color.getRGB ()I
      // 4b2: goto 4cb
      // 4b5: invokestatic u2m.a (Loov;)Loov;
      // 4b8: athrow
      // 4b9: new java/awt/Color
      // 4bc: dup
      // 4bd: sipush 255
      // 4c0: sipush 161
      // 4c3: bipush 27
      // 4c5: invokespecial java/awt/Color.<init> (III)V
      // 4c8: invokevirtual java/awt/Color.getRGB ()I
      // 4cb: invokestatic iyr.zt6 (I)V
      // 4ce: aload 13
      // 4d0: invokevirtual vu3.znj ()V
      // 4d3: invokestatic iyr._nz ()V
      // 4d6: iload 10
      // 4d8: ifne 4e7
      // 4db: aload 13
      // 4dd: goto 4e4
      // 4e0: invokestatic u2m.a (Loov;)Loov;
      // 4e3: athrow
      // 4e4: invokevirtual vu3.znj ()V
      // 4e7: invokestatic hzu.eiq ()V
      // 4ea: invokestatic hzu.x3w ()V
      // 4ed: fconst_1
      // 4ee: fconst_1
      // 4ef: fconst_1
      // 4f0: fconst_1
      // 4f1: invokestatic hzu.wn0 (FFFF)V
      // 4f4: iload 9
      // 4f6: iload 10
      // 4f8: ifeq 518
      // 4fb: iflt 51b
      // 4fe: goto 505
      // 501: invokestatic u2m.a (Loov;)Loov;
      // 504: athrow
      // 505: sipush 5890
      // 508: invokestatic hzu.ah8 (I)V
      // 50b: invokestatic hzu.x3w ()V
      // 50e: sipush 5888
      // 511: goto 518
      // 514: invokestatic u2m.a (Loov;)Loov;
      // 517: athrow
      // 518: invokestatic hzu.ah8 (I)V
      // 51b: return
   }

   @Override
   public void _ny(pyk var1, double var2, double var4, double var6, float var8, int var9) {
      this.sgj((TileEntityChest)var1, var2, var4, var6, var8, var9);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1999587115254423388L, 4772833083250473436L, MethodHandles.lookup().lookupClass()).a(249858602188343L);
      // $VF: monitorexit
      long var10 = var10000 ^ 40651525628500L;
      Cipher var1;
      Cipher var14 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var14.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[6];
      int var6 = 0;
      String var5 = "ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|¾*A{?\u0080\u009eì\u008dycÛ\u0000í3Ï¸\u0017É\u0019\u000e\u0088û\u0086(ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|º|ñ)À\u000e\u0015ýqó|\u009b»ÊáTÿ8´T!¡\u000eò(ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|¾*A{?\u0080\u009eìhÓ\u007fÑBÔ\u009cô²©\r\u008a\nú\u009cX(ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|ÞÔ%£\u001bSÛÓ%\u00176ÿ¿ßÛ\u0003úò\u0091\u0007½\u0017Ï¼";
      int var7 = "ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|¾*A{?\u0080\u009eì\u008dycÛ\u0000í3Ï¸\u0017É\u0019\u000e\u0088û\u0086(ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|º|ñ)À\u000e\u0015ýqó|\u009b»ÊáTÿ8´T!¡\u000eò(ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|¾*A{?\u0080\u009eìhÓ\u007fÑBÔ\u009cô²©\r\u008a\nú\u009cX(ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|ÞÔ%£\u001bSÛÓ%\u00176ÿ¿ßÛ\u0003úò\u0091\u0007½\u0017Ï¼"
         .length();
      char var4 = '(';
      int var13 = -1;

      label27:
      while (true) {
         String var15 = var5.substring(++var13, var13 + var4);
         byte var10001 = -1;

         while (true) {
            byte[] var9 = var1.doFinal(var15.getBytes("ISO-8859-1"));
            String var21 = b(var9).intern();
            switch (var10001) {
               case 0:
                  var8[var6++] = var21;
                  if ((var13 += var4) >= var7) {
                     k94 = new gdz(var8[4]);
                     _3o = new gdz(var8[5]);
                     v5w = new gdz(var8[2]);
                     njk = new gdz(var8[3]);
                     tsz = new gdz(var8[1]);
                     uoc = new gdz(var8[0]);
                     return;
                  }

                  var4 = var5.charAt(var13);
                  break;
               default:
                  var8[var6++] = var21;
                  if ((var13 += var4) < var7) {
                     var4 = var5.charAt(var13);
                     continue label27;
                  }

                  var5 = "ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|ÞÔ%£\u001bSÛÓ-\u009f\u0087\u008dAß H\u009b¬éÙ,Õ\r\u008e\u0093sÆ\u0001\\'zn0ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|º|ñ)À\u000e\u0015ý\f¿OÞ\"M``!§Öø#\nï\u001e¢Wð\u009f\u009e'f0";
                  var7 = "ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|ÞÔ%£\u001bSÛÓ-\u009f\u0087\u008dAß H\u009b¬éÙ,Õ\r\u008e\u0093sÆ\u0001\\'zn0ç\u0011¶\u001e>¯c\u008c¾\u008bP\u0016øl3|º|ñ)À\u000e\u0015ý\f¿OÞ\"M``!§Öø#\nï\u001e¢Wð\u009f\u009e'f0"
                     .length();
                  var4 = '0';
                  var13 = -1;
            }

            var15 = var5.substring(++var13, var13 + var4);
            var10001 = 0;
         }
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
