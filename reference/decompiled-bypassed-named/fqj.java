import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fqj extends gyu {
   private zfz[] j08;
   private long _gp;
   private uwf mgg;
   private uwf zp8;
   private uwf dwt;
   private boolean vdr;
   private boolean my2;
   private static final long a;
   private static final String[] f;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public fqj(int var1, boolean var2, boolean var3) {
      super(var1);
      this.vdr = var2;
      this.my2 = var3;
      this.wip();
      this.j10(2.0F, 0.0F);
      this.c1d.clear();
      this.ke4 = ox_.vd0.l4i().zvi(pmc.xum, pmc$s6y.tms);
      this.kro = ox_.f6z.l4i();
      this.dmv.c10 = -999;
      this.dmv.pcg = 20;
      this.dmv.oui = 3;
      this.dmv.yf6 = 5;
      this.dmv.k9k = 0;
      this.c1d.clear();
      if (var3) {
         this.dmv.c10 = 5;
      }
   }

   @Override
   public e9q jk9(Random var1) {
      return this.zqo;
   }

   @Override
   public int i9_(mew var1) {
      return 10387789;
   }

   @Override
   public int bib(mew var1) {
      return 9470285;
   }

   @Override
   public void u0r(OpaquePredicate var1, Random var2, mew var3) {
      super.u0r(var1, var2, var3);
   }

   @Override
   public void rci(OpaquePredicate param1, Random param2, lno param3, int param4, int param5, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 8
      // 005: aload 0
      // 006: iload 8
      // 008: ifne 03f
      // 00b: getfield fqj.j08 [Lzfz;
      // 00e: ifnull 037
      // 011: goto 018
      // 014: invokestatic fqj.a (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: iload 8
      // 01b: ifne 047
      // 01e: goto 025
      // 021: invokestatic fqj.a (Loov;)Loov;
      // 024: athrow
      // 025: getfield fqj._gp J
      // 028: aload 1
      // 029: invokevirtual OpaquePredicate.x2p ()J
      // 02c: lcmp
      // 02d: ifeq 046
      // 030: goto 037
      // 033: invokestatic fqj.a (Loov;)Loov;
      // 036: athrow
      // 037: aload 0
      // 038: goto 03f
      // 03b: invokestatic fqj.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 1
      // 040: invokevirtual OpaquePredicate.x2p ()J
      // 043: invokespecial fqj.ryr (J)V
      // 046: aload 0
      // 047: getfield fqj.mgg Luwf;
      // 04a: iload 8
      // 04c: ifne 070
      // 04f: ifnull 08b
      // 052: goto 059
      // 055: invokestatic fqj.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 0
      // 05a: iload 8
      // 05c: ifne 074
      // 05f: goto 066
      // 062: invokestatic fqj.a (Loov;)Loov;
      // 065: athrow
      // 066: getfield fqj.zp8 Luwf;
      // 069: goto 070
      // 06c: invokestatic fqj.a (Loov;)Loov;
      // 06f: athrow
      // 070: ifnull 08b
      // 073: aload 0
      // 074: iload 8
      // 076: ifne 0b5
      // 079: getfield fqj._gp J
      // 07c: aload 1
      // 07d: invokevirtual OpaquePredicate.x2p ()J
      // 080: lcmp
      // 081: ifeq 0b4
      // 084: goto 08b
      // 087: invokestatic fqj.a (Loov;)Loov;
      // 08a: athrow
      // 08b: new java/util/Random
      // 08e: dup
      // 08f: aload 0
      // 090: getfield fqj._gp J
      // 093: invokespecial java/util/Random.<init> (J)V
      // 096: astore 9
      // 098: aload 0
      // 099: new uwf
      // 09c: dup
      // 09d: aload 9
      // 09f: bipush 4
      // 0a0: invokespecial uwf.<init> (Ljava/util/Random;I)V
      // 0a3: putfield fqj.mgg Luwf;
      // 0a6: aload 0
      // 0a7: new uwf
      // 0aa: dup
      // 0ab: aload 9
      // 0ad: bipush 1
      // 0ae: invokespecial uwf.<init> (Ljava/util/Random;I)V
      // 0b1: putfield fqj.zp8 Luwf;
      // 0b4: aload 0
      // 0b5: aload 1
      // 0b6: invokevirtual OpaquePredicate.x2p ()J
      // 0b9: putfield fqj._gp J
      // 0bc: dconst_0
      // 0bd: dstore 9
      // 0bf: aload 0
      // 0c0: getfield fqj.vdr Z
      // 0c3: iload 8
      // 0c5: ifne 17a
      // 0c8: ifeq 175
      // 0cb: goto 0d2
      // 0ce: invokestatic fqj.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: iload 4
      // 0d4: bipush -16
      // 0d6: iand
      // 0d7: iload 5
      // 0d9: bipush 15
      // 0db: iand
      // 0dc: iadd
      // 0dd: istore 11
      // 0df: iload 5
      // 0e1: bipush -16
      // 0e3: iand
      // 0e4: iload 4
      // 0e6: bipush 15
      // 0e8: iand
      // 0e9: iadd
      // 0ea: istore 12
      // 0ec: dload 6
      // 0ee: invokestatic java/lang/Math.abs (D)D
      // 0f1: aload 0
      // 0f2: getfield fqj.mgg Luwf;
      // 0f5: iload 11
      // 0f7: i2d
      // 0f8: ldc2_w 0.25
      // 0fb: dmul
      // 0fc: iload 12
      // 0fe: i2d
      // 0ff: ldc2_w 0.25
      // 102: dmul
      // 103: invokevirtual uwf.oj4 (DD)D
      // 106: invokestatic java/lang/Math.min (DD)D
      // 109: dstore 13
      // 10b: dload 13
      // 10d: dconst_0
      // 10e: dcmpl
      // 10f: iload 8
      // 111: ifne 187
      // 114: ifle 175
      // 117: goto 11e
      // 11a: invokestatic fqj.a (Loov;)Loov;
      // 11d: athrow
      // 11e: ldc2_w 0.001953125
      // 121: dstore 15
      // 123: aload 0
      // 124: getfield fqj.zp8 Luwf;
      // 127: iload 11
      // 129: i2d
      // 12a: dload 15
      // 12c: dmul
      // 12d: iload 12
      // 12f: i2d
      // 130: dload 15
      // 132: dmul
      // 133: invokevirtual uwf.oj4 (DD)D
      // 136: invokestatic java/lang/Math.abs (D)D
      // 139: dstore 17
      // 13b: dload 13
      // 13d: dload 13
      // 13f: dmul
      // 140: ldc2_w 2.5
      // 143: dmul
      // 144: dstore 9
      // 146: dload 17
      // 148: ldc2_w 50.0
      // 14b: dmul
      // 14c: invokestatic java/lang/Math.ceil (D)D
      // 14f: ldc2_w 14.0
      // 152: dadd
      // 153: dstore 19
      // 155: dload 9
      // 157: dload 19
      // 159: iload 8
      // 15b: ifne 172
      // 15e: dcmpl
      // 15f: ifle 16d
      // 162: goto 169
      // 165: invokestatic fqj.a (Loov;)Loov;
      // 168: athrow
      // 169: dload 19
      // 16b: dstore 9
      // 16d: dload 9
      // 16f: ldc2_w 64.0
      // 172: dadd
      // 173: dstore 9
      // 175: iload 4
      // 177: bipush 15
      // 179: iand
      // 17a: istore 11
      // 17c: iload 5
      // 17e: bipush 15
      // 180: iand
      // 181: istore 12
      // 183: aload 1
      // 184: invokevirtual OpaquePredicate._s3 ()I
      // 187: istore 13
      // 189: getstatic ox_.f6z Le0x;
      // 18c: invokevirtual e0x.l4i ()Lzfz;
      // 18f: astore 14
      // 191: aload 0
      // 192: getfield fqj.kro Lzfz;
      // 195: astore 15
      // 197: dload 6
      // 199: ldc2_w 3.0
      // 19c: ddiv
      // 19d: ldc2_w 3.0
      // 1a0: dadd
      // 1a1: aload 2
      // 1a2: invokevirtual java/util/Random.nextDouble ()D
      // 1a5: ldc2_w 0.25
      // 1a8: dmul
      // 1a9: dadd
      // 1aa: d2i
      // 1ab: istore 16
      // 1ad: dload 6
      // 1af: ldc2_w 3.0
      // 1b2: ddiv
      // 1b3: ldc2_w 3.141592653589793
      // 1b6: dmul
      // 1b7: invokestatic java/lang/Math.cos (D)D
      // 1ba: dconst_0
      // 1bb: dcmpl
      // 1bc: iload 8
      // 1be: ifne 1cc
      // 1c1: ifle 1cf
      // 1c4: goto 1cb
      // 1c7: invokestatic fqj.a (Loov;)Loov;
      // 1ca: athrow
      // 1cb: bipush 1
      // 1cc: goto 1d0
      // 1cf: bipush 0
      // 1d0: istore 17
      // 1d2: bipush -1
      // 1d3: istore 18
      // 1d5: bipush 0
      // 1d6: istore 19
      // 1d8: sipush 255
      // 1db: istore 20
      // 1dd: iload 20
      // 1df: iflt 599
      // 1e2: aload 3
      // 1e3: iload 12
      // 1e5: iload 20
      // 1e7: iload 11
      // 1e9: invokevirtual lno.ql9 (III)Lzfz;
      // 1ec: invokeinterface zfz.r_y ()Le0x; 1
      // 1f1: invokevirtual e0x.p1r ()Lp3y;
      // 1f4: getstatic p3y.cei Lp3y;
      // 1f7: if_acmpne 22c
      // 1fa: iload 20
      // 1fc: dload 9
      // 1fe: d2i
      // 1ff: iload 8
      // 201: ifne 233
      // 204: goto 20b
      // 207: invokestatic fqj.a (Loov;)Loov;
      // 20a: athrow
      // 20b: if_icmpge 22c
      // 20e: goto 215
      // 211: invokestatic fqj.a (Loov;)Loov;
      // 214: athrow
      // 215: aload 3
      // 216: iload 12
      // 218: iload 20
      // 21a: iload 11
      // 21c: getstatic ox_.pu8 Le0x;
      // 21f: invokevirtual e0x.l4i ()Lzfz;
      // 222: invokevirtual lno.x6f (IIILzfz;)V
      // 225: goto 22c
      // 228: invokestatic fqj.a (Loov;)Loov;
      // 22b: athrow
      // 22c: iload 20
      // 22e: aload 2
      // 22f: bipush 5
      // 230: invokevirtual java/util/Random.nextInt (I)I
      // 233: if_icmpgt 252
      // 236: aload 3
      // 237: iload 12
      // 239: iload 20
      // 23b: iload 11
      // 23d: getstatic ox_.n6z Le0x;
      // 240: invokevirtual e0x.l4i ()Lzfz;
      // 243: invokevirtual lno.x6f (IIILzfz;)V
      // 246: iload 8
      // 248: ifeq 591
      // 24b: goto 252
      // 24e: invokestatic fqj.a (Loov;)Loov;
      // 251: athrow
      // 252: aload 3
      // 253: iload 12
      // 255: iload 20
      // 257: iload 11
      // 259: invokevirtual lno.ql9 (III)Lzfz;
      // 25c: astore 21
      // 25e: aload 21
      // 260: invokeinterface zfz.r_y ()Le0x; 1
      // 265: iload 8
      // 267: ifne 290
      // 26a: invokevirtual e0x.p1r ()Lp3y;
      // 26d: getstatic p3y.cei Lp3y;
      // 270: if_acmpne 282
      // 273: goto 27a
      // 276: invokestatic fqj.a (Loov;)Loov;
      // 279: athrow
      // 27a: bipush -1
      // 27b: istore 18
      // 27d: iload 8
      // 27f: ifeq 591
      // 282: aload 21
      // 284: invokeinterface zfz.r_y ()Le0x; 1
      // 289: goto 290
      // 28c: invokestatic fqj.a (Loov;)Loov;
      // 28f: athrow
      // 290: getstatic ox_.pu8 Le0x;
      // 293: if_acmpne 591
      // 296: iload 18
      // 298: iload 8
      // 29a: ifne 528
      // 29d: goto 2a4
      // 2a0: invokestatic fqj.a (Loov;)Loov;
      // 2a3: athrow
      // 2a4: bipush -1
      // 2a5: if_icmpne 51f
      // 2a8: goto 2af
      // 2ab: invokestatic fqj.a (Loov;)Loov;
      // 2ae: athrow
      // 2af: bipush 0
      // 2b0: istore 19
      // 2b2: iload 16
      // 2b4: iload 8
      // 2b6: ifne 2d3
      // 2b9: ifgt 2d1
      // 2bc: goto 2c3
      // 2bf: invokestatic fqj.a (Loov;)Loov;
      // 2c2: athrow
      // 2c3: aconst_null
      // 2c4: astore 14
      // 2c6: getstatic ox_.pu8 Le0x;
      // 2c9: invokevirtual e0x.l4i ()Lzfz;
      // 2cc: astore 15
      // 2ce: goto 310
      // 2d1: iload 20
      // 2d3: iload 13
      // 2d5: bipush 4
      // 2d6: isub
      // 2d7: iload 8
      // 2d9: ifne 314
      // 2dc: if_icmplt 310
      // 2df: goto 2e6
      // 2e2: invokestatic fqj.a (Loov;)Loov;
      // 2e5: athrow
      // 2e6: iload 20
      // 2e8: iload 13
      // 2ea: bipush 1
      // 2eb: iadd
      // 2ec: iload 8
      // 2ee: ifne 314
      // 2f1: goto 2f8
      // 2f4: invokestatic fqj.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: if_icmpgt 310
      // 2fb: goto 302
      // 2fe: invokestatic fqj.a (Loov;)Loov;
      // 301: athrow
      // 302: getstatic ox_.f6z Le0x;
      // 305: invokevirtual e0x.l4i ()Lzfz;
      // 308: astore 14
      // 30a: aload 0
      // 30b: getfield fqj.kro Lzfz;
      // 30e: astore 15
      // 310: iload 20
      // 312: iload 13
      // 314: iload 8
      // 316: ifne 38d
      // 319: if_icmpge 36d
      // 31c: goto 323
      // 31f: invokestatic fqj.a (Loov;)Loov;
      // 322: athrow
      // 323: aload 14
      // 325: iload 8
      // 327: ifne 36b
      // 32a: goto 331
      // 32d: invokestatic fqj.a (Loov;)Loov;
      // 330: athrow
      // 331: ifnull 35e
      // 334: goto 33b
      // 337: invokestatic fqj.a (Loov;)Loov;
      // 33a: athrow
      // 33b: aload 14
      // 33d: iload 8
      // 33f: ifne 36b
      // 342: goto 349
      // 345: invokestatic fqj.a (Loov;)Loov;
      // 348: athrow
      // 349: invokeinterface zfz.r_y ()Le0x; 1
      // 34e: invokevirtual e0x.p1r ()Lp3y;
      // 351: getstatic p3y.cei Lp3y;
      // 354: if_acmpne 36d
      // 357: goto 35e
      // 35a: invokestatic fqj.a (Loov;)Loov;
      // 35d: athrow
      // 35e: getstatic ox_.gdz Les2;
      // 361: invokevirtual es2.l4i ()Lzfz;
      // 364: goto 36b
      // 367: invokestatic fqj.a (Loov;)Loov;
      // 36a: athrow
      // 36b: astore 14
      // 36d: iload 16
      // 36f: bipush 0
      // 370: iload 20
      // 372: iload 13
      // 374: isub
      // 375: invokestatic java/lang/Math.max (II)I
      // 378: iadd
      // 379: istore 18
      // 37b: iload 20
      // 37d: iload 8
      // 37f: ifne 3f2
      // 382: iload 13
      // 384: bipush 1
      // 385: isub
      // 386: goto 38d
      // 389: invokestatic fqj.a (Loov;)Loov;
      // 38c: athrow
      // 38d: if_icmpge 3e7
      // 390: aload 3
      // 391: iload 12
      // 393: iload 20
      // 395: iload 11
      // 397: aload 15
      // 399: invokevirtual lno.x6f (IIILzfz;)V
      // 39c: iload 8
      // 39e: ifne 594
      // 3a1: goto 3a8
      // 3a4: invokestatic fqj.a (Loov;)Loov;
      // 3a7: athrow
      // 3a8: aload 15
      // 3aa: invokeinterface zfz.r_y ()Le0x; 1
      // 3af: getstatic ox_.f6z Le0x;
      // 3b2: if_acmpne 591
      // 3b5: goto 3bc
      // 3b8: invokestatic fqj.a (Loov;)Loov;
      // 3bb: athrow
      // 3bc: aload 3
      // 3bd: iload 12
      // 3bf: iload 20
      // 3c1: iload 11
      // 3c3: aload 15
      // 3c5: invokeinterface zfz.r_y ()Le0x; 1
      // 3ca: invokevirtual e0x.l4i ()Lzfz;
      // 3cd: getstatic pe9.ch6 Lzb_;
      // 3d0: getstatic qvg.y0w Lqvg;
      // 3d3: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3d8: invokevirtual lno.x6f (IIILzfz;)V
      // 3db: iload 8
      // 3dd: ifeq 591
      // 3e0: goto 3e7
      // 3e3: invokestatic fqj.a (Loov;)Loov;
      // 3e6: athrow
      // 3e7: aload 0
      // 3e8: getfield fqj.my2 Z
      // 3eb: goto 3f2
      // 3ee: invokestatic fqj.a (Loov;)Loov;
      // 3f1: athrow
      // 3f2: iload 8
      // 3f4: ifne 478
      // 3f7: ifeq 46f
      // 3fa: goto 401
      // 3fd: invokestatic fqj.a (Loov;)Loov;
      // 400: athrow
      // 401: iload 20
      // 403: bipush 86
      // 405: iload 16
      // 407: bipush 2
      // 408: imul
      // 409: iadd
      // 40a: iload 8
      // 40c: ifne 47f
      // 40f: goto 416
      // 412: invokestatic fqj.a (Loov;)Loov;
      // 415: athrow
      // 416: if_icmple 46f
      // 419: goto 420
      // 41c: invokestatic fqj.a (Loov;)Loov;
      // 41f: athrow
      // 420: iload 17
      // 422: ifeq 453
      // 425: goto 42c
      // 428: invokestatic fqj.a (Loov;)Loov;
      // 42b: athrow
      // 42c: aload 3
      // 42d: iload 12
      // 42f: iload 20
      // 431: iload 11
      // 433: getstatic ox_.kqk Le0x;
      // 436: invokevirtual e0x.l4i ()Lzfz;
      // 439: getstatic bx0.nln Lzb_;
      // 43c: getstatic bx0$b_z.ryg Lbx0$b_z;
      // 43f: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 444: invokevirtual lno.x6f (IIILzfz;)V
      // 447: iload 8
      // 449: ifeq 591
      // 44c: goto 453
      // 44f: invokestatic fqj.a (Loov;)Loov;
      // 452: athrow
      // 453: aload 3
      // 454: iload 12
      // 456: iload 20
      // 458: iload 11
      // 45a: getstatic ox_.l11 Lx82;
      // 45d: invokevirtual x82.l4i ()Lzfz;
      // 460: invokevirtual lno.x6f (IIILzfz;)V
      // 463: iload 8
      // 465: ifeq 591
      // 468: goto 46f
      // 46b: invokestatic fqj.a (Loov;)Loov;
      // 46e: athrow
      // 46f: iload 20
      // 471: goto 478
      // 474: invokestatic fqj.a (Loov;)Loov;
      // 477: athrow
      // 478: iload 13
      // 47a: bipush 3
      // 47b: iadd
      // 47c: iload 16
      // 47e: iadd
      // 47f: iload 8
      // 481: ifne 4af
      // 484: if_icmpgt 4a4
      // 487: goto 48e
      // 48a: invokestatic fqj.a (Loov;)Loov;
      // 48d: athrow
      // 48e: aload 3
      // 48f: iload 12
      // 491: iload 20
      // 493: iload 11
      // 495: aload 0
      // 496: getfield fqj.ke4 Lzfz;
      // 499: invokevirtual lno.x6f (IIILzfz;)V
      // 49c: bipush 1
      // 49d: istore 19
      // 49f: iload 8
      // 4a1: ifeq 591
      // 4a4: iload 20
      // 4a6: bipush 64
      // 4a8: goto 4af
      // 4ab: invokestatic fqj.a (Loov;)Loov;
      // 4ae: athrow
      // 4af: iload 8
      // 4b1: ifne 4d5
      // 4b4: if_icmplt 4fb
      // 4b7: goto 4be
      // 4ba: invokestatic fqj.a (Loov;)Loov;
      // 4bd: athrow
      // 4be: iload 20
      // 4c0: iload 8
      // 4c2: ifne 4da
      // 4c5: goto 4cc
      // 4c8: invokestatic fqj.a (Loov;)Loov;
      // 4cb: athrow
      // 4cc: bipush 127
      // 4ce: goto 4d5
      // 4d1: invokestatic fqj.a (Loov;)Loov;
      // 4d4: athrow
      // 4d5: if_icmpgt 4fb
      // 4d8: iload 17
      // 4da: ifeq 4ea
      // 4dd: getstatic ox_.o45 Le0x;
      // 4e0: invokevirtual e0x.l4i ()Lzfz;
      // 4e3: astore 22
      // 4e5: iload 8
      // 4e7: ifeq 50e
      // 4ea: aload 0
      // 4eb: iload 4
      // 4ed: iload 20
      // 4ef: iload 5
      // 4f1: invokespecial fqj.a5j (III)Lzfz;
      // 4f4: astore 22
      // 4f6: iload 8
      // 4f8: ifeq 50e
      // 4fb: getstatic ox_.f6z Le0x;
      // 4fe: invokevirtual e0x.l4i ()Lzfz;
      // 501: getstatic pe9.ch6 Lzb_;
      // 504: getstatic qvg.y0w Lqvg;
      // 507: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 50c: astore 22
      // 50e: aload 3
      // 50f: iload 12
      // 511: iload 20
      // 513: iload 11
      // 515: aload 22
      // 517: invokevirtual lno.x6f (IIILzfz;)V
      // 51a: iload 8
      // 51c: ifeq 591
      // 51f: iload 18
      // 521: goto 528
      // 524: invokestatic fqj.a (Loov;)Loov;
      // 527: athrow
      // 528: iload 8
      // 52a: ifne 54f
      // 52d: ifle 591
      // 530: goto 537
      // 533: invokestatic fqj.a (Loov;)Loov;
      // 536: athrow
      // 537: iinc 18 -1
      // 53a: iload 8
      // 53c: ifne 574
      // 53f: goto 546
      // 542: invokestatic fqj.a (Loov;)Loov;
      // 545: athrow
      // 546: iload 19
      // 548: goto 54f
      // 54b: invokestatic fqj.a (Loov;)Loov;
      // 54e: athrow
      // 54f: ifeq 579
      // 552: aload 3
      // 553: iload 12
      // 555: iload 20
      // 557: iload 11
      // 559: getstatic ox_.f6z Le0x;
      // 55c: invokevirtual e0x.l4i ()Lzfz;
      // 55f: getstatic pe9.ch6 Lzb_;
      // 562: getstatic qvg.y0w Lqvg;
      // 565: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 56a: invokevirtual lno.x6f (IIILzfz;)V
      // 56d: goto 574
      // 570: invokestatic fqj.a (Loov;)Loov;
      // 573: athrow
      // 574: iload 8
      // 576: ifeq 591
      // 579: aload 0
      // 57a: iload 4
      // 57c: iload 20
      // 57e: iload 5
      // 580: invokespecial fqj.a5j (III)Lzfz;
      // 583: astore 22
      // 585: aload 3
      // 586: iload 12
      // 588: iload 20
      // 58a: iload 11
      // 58c: aload 22
      // 58e: invokevirtual lno.x6f (IIILzfz;)V
      // 591: iinc 20 -1
      // 594: iload 8
      // 596: ifeq 1dd
      // 599: return
   }

   private void ryr(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 64
      // 003: anewarray 82
      // 006: putfield fqj.j08 [Lzfz;
      // 009: invokestatic OpaquePredicate.c ()I
      // 00c: aload 0
      // 00d: getfield fqj.j08 [Lzfz;
      // 010: getstatic ox_.o45 Le0x;
      // 013: invokevirtual e0x.l4i ()Lzfz;
      // 016: invokestatic java/util/Arrays.fill ([Ljava/lang/Object;Ljava/lang/Object;)V
      // 019: new java/util/Random
      // 01c: dup
      // 01d: lload 1
      // 01e: invokespecial java/util/Random.<init> (J)V
      // 021: astore 4
      // 023: aload 0
      // 024: new uwf
      // 027: dup
      // 028: aload 4
      // 02a: bipush 1
      // 02b: invokespecial uwf.<init> (Ljava/util/Random;I)V
      // 02e: putfield fqj.dwt Luwf;
      // 031: istore 3
      // 032: bipush 0
      // 033: istore 5
      // 035: iload 5
      // 037: bipush 64
      // 039: if_icmpge 08c
      // 03c: iload 5
      // 03e: aload 4
      // 040: bipush 5
      // 041: invokevirtual java/util/Random.nextInt (I)I
      // 044: bipush 1
      // 045: iadd
      // 046: iadd
      // 047: istore 5
      // 049: iload 3
      // 04a: ifne 088
      // 04d: iload 5
      // 04f: bipush 64
      // 051: iload 3
      // 052: ifne 093
      // 055: goto 05c
      // 058: invokestatic fqj.a (Loov;)Loov;
      // 05b: athrow
      // 05c: if_icmpge 085
      // 05f: goto 066
      // 062: invokestatic fqj.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: getfield fqj.j08 [Lzfz;
      // 06a: iload 5
      // 06c: getstatic ox_.f6z Le0x;
      // 06f: invokevirtual e0x.l4i ()Lzfz;
      // 072: getstatic pe9.ch6 Lzb_;
      // 075: getstatic qvg.y0w Lqvg;
      // 078: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 07d: aastore
      // 07e: goto 085
      // 081: invokestatic fqj.a (Loov;)Loov;
      // 084: athrow
      // 085: iinc 5 1
      // 088: iload 3
      // 089: ifeq 035
      // 08c: aload 4
      // 08e: bipush 4
      // 08f: invokevirtual java/util/Random.nextInt (I)I
      // 092: bipush 2
      // 093: iadd
      // 094: istore 5
      // 096: bipush 0
      // 097: istore 6
      // 099: iload 6
      // 09b: iload 5
      // 09d: if_icmpge 0ff
      // 0a0: aload 4
      // 0a2: bipush 3
      // 0a3: invokevirtual java/util/Random.nextInt (I)I
      // 0a6: bipush 1
      // 0a7: iadd
      // 0a8: istore 7
      // 0aa: aload 4
      // 0ac: bipush 64
      // 0ae: invokevirtual java/util/Random.nextInt (I)I
      // 0b1: istore 8
      // 0b3: bipush 0
      // 0b4: iload 3
      // 0b5: ifne 10a
      // 0b8: istore 9
      // 0ba: iload 8
      // 0bc: iload 9
      // 0be: iadd
      // 0bf: bipush 64
      // 0c1: if_icmpge 0f8
      // 0c4: iload 9
      // 0c6: iload 7
      // 0c8: iload 3
      // 0c9: ifne 09d
      // 0cc: if_icmpge 0f8
      // 0cf: aload 0
      // 0d0: getfield fqj.j08 [Lzfz;
      // 0d3: iload 8
      // 0d5: iload 9
      // 0d7: iadd
      // 0d8: getstatic ox_.f6z Le0x;
      // 0db: invokevirtual e0x.l4i ()Lzfz;
      // 0de: getstatic pe9.ch6 Lzb_;
      // 0e1: getstatic qvg.byr Lqvg;
      // 0e4: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0e9: aastore
      // 0ea: iinc 9 1
      // 0ed: iload 3
      // 0ee: ifeq 0ba
      // 0f1: goto 0f8
      // 0f4: invokestatic fqj.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: iinc 6 1
      // 0fb: iload 3
      // 0fc: ifeq 099
      // 0ff: aload 4
      // 101: bipush 4
      // 102: invokevirtual java/util/Random.nextInt (I)I
      // 105: bipush 2
      // 106: iadd
      // 107: istore 6
      // 109: bipush 0
      // 10a: istore 7
      // 10c: iload 7
      // 10e: iload 6
      // 110: if_icmpge 172
      // 113: aload 4
      // 115: bipush 3
      // 116: invokevirtual java/util/Random.nextInt (I)I
      // 119: bipush 2
      // 11a: iadd
      // 11b: istore 8
      // 11d: aload 4
      // 11f: bipush 64
      // 121: invokevirtual java/util/Random.nextInt (I)I
      // 124: istore 9
      // 126: bipush 0
      // 127: iload 3
      // 128: ifne 17d
      // 12b: istore 10
      // 12d: iload 9
      // 12f: iload 10
      // 131: iadd
      // 132: bipush 64
      // 134: if_icmpge 16b
      // 137: iload 10
      // 139: iload 8
      // 13b: iload 3
      // 13c: ifne 110
      // 13f: if_icmpge 16b
      // 142: aload 0
      // 143: getfield fqj.j08 [Lzfz;
      // 146: iload 9
      // 148: iload 10
      // 14a: iadd
      // 14b: getstatic ox_.f6z Le0x;
      // 14e: invokevirtual e0x.l4i ()Lzfz;
      // 151: getstatic pe9.ch6 Lzb_;
      // 154: getstatic qvg._fk Lqvg;
      // 157: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 15c: aastore
      // 15d: iinc 10 1
      // 160: iload 3
      // 161: ifeq 12d
      // 164: goto 16b
      // 167: invokestatic fqj.a (Loov;)Loov;
      // 16a: athrow
      // 16b: iinc 7 1
      // 16e: iload 3
      // 16f: ifeq 10c
      // 172: aload 4
      // 174: bipush 4
      // 175: invokevirtual java/util/Random.nextInt (I)I
      // 178: bipush 2
      // 179: iadd
      // 17a: istore 7
      // 17c: bipush 0
      // 17d: istore 8
      // 17f: iload 8
      // 181: iload 7
      // 183: if_icmpge 1e5
      // 186: aload 4
      // 188: bipush 3
      // 189: invokevirtual java/util/Random.nextInt (I)I
      // 18c: bipush 1
      // 18d: iadd
      // 18e: istore 9
      // 190: aload 4
      // 192: bipush 64
      // 194: invokevirtual java/util/Random.nextInt (I)I
      // 197: istore 10
      // 199: bipush 0
      // 19a: iload 3
      // 19b: ifne 1f3
      // 19e: istore 11
      // 1a0: iload 10
      // 1a2: iload 11
      // 1a4: iadd
      // 1a5: bipush 64
      // 1a7: if_icmpge 1de
      // 1aa: iload 11
      // 1ac: iload 9
      // 1ae: iload 3
      // 1af: ifne 183
      // 1b2: if_icmpge 1de
      // 1b5: aload 0
      // 1b6: getfield fqj.j08 [Lzfz;
      // 1b9: iload 10
      // 1bb: iload 11
      // 1bd: iadd
      // 1be: getstatic ox_.f6z Le0x;
      // 1c1: invokevirtual e0x.l4i ()Lzfz;
      // 1c4: getstatic pe9.ch6 Lzb_;
      // 1c7: getstatic qvg.y7l Lqvg;
      // 1ca: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1cf: aastore
      // 1d0: iinc 11 1
      // 1d3: iload 3
      // 1d4: ifeq 1a0
      // 1d7: goto 1de
      // 1da: invokestatic fqj.a (Loov;)Loov;
      // 1dd: athrow
      // 1de: iinc 8 1
      // 1e1: iload 3
      // 1e2: ifeq 17f
      // 1e5: aload 4
      // 1e7: bipush 3
      // 1e8: invokevirtual java/util/Random.nextInt (I)I
      // 1eb: bipush 3
      // 1ec: iadd
      // 1ed: istore 8
      // 1ef: bipush 0
      // 1f0: istore 9
      // 1f2: bipush 0
      // 1f3: istore 10
      // 1f5: iload 10
      // 1f7: iload 8
      // 1f9: if_icmpge 2fa
      // 1fc: bipush 1
      // 1fd: istore 11
      // 1ff: iload 9
      // 201: aload 4
      // 203: bipush 16
      // 205: invokevirtual java/util/Random.nextInt (I)I
      // 208: bipush 4
      // 209: iadd
      // 20a: iadd
      // 20b: istore 9
      // 20d: bipush 0
      // 20e: istore 12
      // 210: iload 9
      // 212: iload 12
      // 214: iadd
      // 215: bipush 64
      // 217: if_icmpge 2f3
      // 21a: iload 12
      // 21c: iload 11
      // 21e: iload 3
      // 21f: ifne 1f9
      // 222: iload 3
      // 223: ifne 258
      // 226: if_icmpge 2f3
      // 229: goto 230
      // 22c: invokestatic fqj.a (Loov;)Loov;
      // 22f: athrow
      // 230: aload 0
      // 231: getfield fqj.j08 [Lzfz;
      // 234: iload 9
      // 236: iload 12
      // 238: iadd
      // 239: getstatic ox_.f6z Le0x;
      // 23c: invokevirtual e0x.l4i ()Lzfz;
      // 23f: getstatic pe9.ch6 Lzb_;
      // 242: getstatic qvg.ft3 Lqvg;
      // 245: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 24a: aastore
      // 24b: iload 9
      // 24d: iload 12
      // 24f: iadd
      // 250: bipush 1
      // 251: goto 258
      // 254: invokestatic fqj.a (Loov;)Loov;
      // 257: athrow
      // 258: iload 3
      // 259: ifne 2b6
      // 25c: if_icmple 2a4
      // 25f: goto 266
      // 262: invokestatic fqj.a (Loov;)Loov;
      // 265: athrow
      // 266: aload 4
      // 268: invokevirtual java/util/Random.nextBoolean ()Z
      // 26b: iload 3
      // 26c: ifne 2a9
      // 26f: goto 276
      // 272: invokestatic fqj.a (Loov;)Loov;
      // 275: athrow
      // 276: ifeq 2a4
      // 279: goto 280
      // 27c: invokestatic fqj.a (Loov;)Loov;
      // 27f: athrow
      // 280: aload 0
      // 281: getfield fqj.j08 [Lzfz;
      // 284: iload 9
      // 286: iload 12
      // 288: iadd
      // 289: bipush 1
      // 28a: isub
      // 28b: getstatic ox_.f6z Le0x;
      // 28e: invokevirtual e0x.l4i ()Lzfz;
      // 291: getstatic pe9.ch6 Lzb_;
      // 294: getstatic qvg.i_s Lqvg;
      // 297: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 29c: aastore
      // 29d: goto 2a4
      // 2a0: invokestatic fqj.a (Loov;)Loov;
      // 2a3: athrow
      // 2a4: iload 9
      // 2a6: iload 12
      // 2a8: iadd
      // 2a9: iload 3
      // 2aa: ifne 2c5
      // 2ad: bipush 63
      // 2af: goto 2b6
      // 2b2: invokestatic fqj.a (Loov;)Loov;
      // 2b5: athrow
      // 2b6: if_icmpge 2ec
      // 2b9: aload 4
      // 2bb: invokevirtual java/util/Random.nextBoolean ()Z
      // 2be: goto 2c5
      // 2c1: invokestatic fqj.a (Loov;)Loov;
      // 2c4: athrow
      // 2c5: ifeq 2ec
      // 2c8: aload 0
      // 2c9: getfield fqj.j08 [Lzfz;
      // 2cc: iload 9
      // 2ce: iload 12
      // 2d0: iadd
      // 2d1: bipush 1
      // 2d2: iadd
      // 2d3: getstatic ox_.f6z Le0x;
      // 2d6: invokevirtual e0x.l4i ()Lzfz;
      // 2d9: getstatic pe9.ch6 Lzb_;
      // 2dc: getstatic qvg.i_s Lqvg;
      // 2df: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 2e4: aastore
      // 2e5: goto 2ec
      // 2e8: invokestatic fqj.a (Loov;)Loov;
      // 2eb: athrow
      // 2ec: iinc 12 1
      // 2ef: iload 3
      // 2f0: ifeq 210
      // 2f3: iinc 10 1
      // 2f6: iload 3
      // 2f7: ifeq 1f5
      // 2fa: return
   }

   private zfz a5j(int var1, int var2, int var3) {
      int var4 = (int)Math.round(this.dwt.oj4((double)var1 * 1.0 / 512.0, (double)var1 * 1.0 / 512.0) * 2.0);
      return this.j08[(var2 + var4 + 64) % 64];
   }

   @Override
   public gyu hiq(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic fqj.a J
      // 03: ldc2_w 23495681676871
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield fqj.mu9 I
      // 11: iload 4
      // 13: ifne 2e
      // 16: getstatic gyu.cro Lgyu;
      // 19: getfield gyu.mu9 I
      // 1c: if_icmpne 31
      // 1f: goto 26
      // 22: invokestatic fqj.a (Loov;)Loov;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2e
      // 2a: invokestatic fqj.a (Loov;)Loov;
      // 2d: athrow
      // 2e: goto 32
      // 31: bipush 0
      // 32: istore 5
      // 34: new fqj
      // 37: dup
      // 38: iload 1
      // 39: iload 5
      // 3b: aload 0
      // 3c: getfield fqj.my2 Z
      // 3f: invokespecial fqj.<init> (IZZ)V
      // 42: astore 6
      // 44: iload 4
      // 46: ifne 8d
      // 49: iload 5
      // 4b: ifne 92
      // 4e: goto 55
      // 51: invokestatic fqj.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 6
      // 57: getstatic fqj.vvn Lgyu$ekk;
      // 5a: invokevirtual fqj.wzy (Lgyu$ekk;)Lgyu;
      // 5d: pop
      // 5e: aload 6
      // 60: new java/lang/StringBuilder
      // 63: dup
      // 64: invokespecial java/lang/StringBuilder.<init> ()V
      // 67: aload 0
      // 68: getfield fqj.jcq Ljava/lang/String;
      // 6b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 6e: sipush 5162
      // 71: ldc2_w 6836581255005347313
      // 74: lload 2
      // 75: lxor
      // 76: invokedynamic u (IJ)Ljava/lang/String; bsm=fqj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: nop
      // 7c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 7f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 82: invokevirtual fqj.cb4 (Ljava/lang/String;)Lgyu;
      // 85: pop
      // 86: goto 8d
      // 89: invokestatic fqj.a (Loov;)Loov;
      // 8c: athrow
      // 8d: iload 4
      // 8f: ifeq c1
      // 92: aload 6
      // 94: new java/lang/StringBuilder
      // 97: dup
      // 98: invokespecial java/lang/StringBuilder.<init> ()V
      // 9b: aload 0
      // 9c: getfield fqj.jcq Ljava/lang/String;
      // 9f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // a2: sipush 16965
      // a5: ldc2_w 7507015009826458527
      // a8: lload 2
      // a9: lxor
      // aa: invokedynamic u (IJ)Ljava/lang/String; bsm=fqj.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // af: nop
      // b0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // b3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // b6: invokevirtual fqj.cb4 (Ljava/lang/String;)Lgyu;
      // b9: pop
      // ba: goto c1
      // bd: invokestatic fqj.a (Loov;)Loov;
      // c0: athrow
      // c1: aload 6
      // c3: aload 0
      // c4: getfield fqj.np2 I
      // c7: bipush 1
      // c8: invokevirtual fqj.cq8 (IZ)Lgyu;
      // cb: pop
      // cc: aload 6
      // ce: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8777809898797263679L, -7063468732310296305L, MethodHandles.lookup().lookupClass()).a(148403169327999L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 68511568949403L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "\u009d\u0014Hc\u0094g\u001b}@]Du£\u0083_ó^Á6\b£\u0084\u00adæ¡Éé.\u008e[Ü`\u0010õ\u0085VB7\u0000vÆLõÃÑ`í[\u0096";
      int var8 = "\u009d\u0014Hc\u0094g\u001b}@]Du£\u0083_ó^Á6\b£\u0084\u00adæ¡Éé.\u008e[Ü`\u0010õ\u0085VB7\u0000vÆLõÃÑ`í[\u0096".length();
      char var5 = ' ';
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            f = var9;
            g = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 884;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("fqj", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = f[var5].getBytes("ISO-8859-1");
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("fqj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
