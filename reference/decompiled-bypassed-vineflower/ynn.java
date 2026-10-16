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

public class ynn extends j1s {
   private static final long a;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public ynn() {
      long var1 = a ^ 39458092083526L;
      super(a<"h">(16193, 7210397447114168133L ^ var1), a<"h">(28610, 4343424099478259655L ^ var1));
      this.ehs = 4.0;
      this.ymx = 1;
      this.d9m = 0.1873;
   }

   private double yc6() {
      return 0.1873;
   }

   @Override
   public void w4v() {
      super.w4v();
   }

   @Override
   public void i__() {
      this.wyl.gze.qeu = 1.0F;
      this.d9m = this.yc6();
      this.nd9 = 0.0;
      this.ymx = 4;
      this.z35 = false;
      super.i__();
   }

   @jev
   public void zk5(_qa param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: getfield ynn.wyl Lc05;
      // 008: getfield c05.vg8 Ll86;
      // 00b: getfield l86.kfp D
      // 00e: aload 0
      // 00f: getfield ynn.wyl Lc05;
      // 012: getfield c05.vg8 Ll86;
      // 015: getfield l86.kfp D
      // 018: d2i
      // 019: i2d
      // 01a: dsub
      // 01b: bipush 3
      // 01c: invokestatic rak.meb (DI)D
      // 01f: ldc2_w 0.41
      // 022: bipush 3
      // 023: invokestatic rak.meb (DI)D
      // 026: dcmpl
      // 027: iload 2
      // 028: ifeq 053
      // 02b: ifne 047
      // 02e: goto 035
      // 031: invokestatic ynn.a (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: getfield ynn.wyl Lc05;
      // 039: getfield c05.vg8 Ll86;
      // 03c: dconst_0
      // 03d: putfield l86.mop D
      // 040: goto 047
      // 043: invokestatic ynn.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: getfield ynn.wyl Lc05;
      // 04b: getfield c05.vg8 Ll86;
      // 04e: getfield l86.z66 F
      // 051: fconst_0
      // 052: fcmpg
      // 053: iload 2
      // 054: ifeq 0b1
      // 057: ifge 08e
      // 05a: goto 061
      // 05d: invokestatic ynn.a (Loov;)Loov;
      // 060: athrow
      // 061: aload 0
      // 062: getfield ynn.wyl Lc05;
      // 065: getfield c05.vg8 Ll86;
      // 068: getfield l86.ooc F
      // 06b: fconst_0
      // 06c: fcmpg
      // 06d: iload 2
      // 06e: ifeq 0b1
      // 071: goto 078
      // 074: invokestatic ynn.a (Loov;)Loov;
      // 077: athrow
      // 078: ifge 08e
      // 07b: goto 082
      // 07e: invokestatic ynn.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: bipush 1
      // 084: putfield ynn.ymx I
      // 087: goto 08e
      // 08a: invokestatic ynn.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: getfield ynn.wyl Lc05;
      // 092: getfield c05.vg8 Ll86;
      // 095: getfield l86.kfp D
      // 098: aload 0
      // 099: getfield ynn.wyl Lc05;
      // 09c: getfield c05.vg8 Ll86;
      // 09f: getfield l86.kfp D
      // 0a2: d2i
      // 0a3: i2d
      // 0a4: dsub
      // 0a5: bipush 3
      // 0a6: invokestatic rak.b5b (DI)D
      // 0a9: ldc2_w 0.943
      // 0ac: bipush 3
      // 0ad: invokestatic rak.b5b (DI)D
      // 0b0: dcmpl
      // 0b1: iload 2
      // 0b2: ifeq 0d5
      // 0b5: ifne 0d1
      // 0b8: goto 0bf
      // 0bb: invokestatic ynn.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield ynn.wyl Lc05;
      // 0c3: getfield c05.vg8 Ll86;
      // 0c6: dconst_0
      // 0c7: putfield l86.mop D
      // 0ca: goto 0d1
      // 0cd: invokestatic ynn.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: getfield ynn.ymx I
      // 0d5: bipush 1
      // 0d6: iload 2
      // 0d7: ifeq 172
      // 0da: if_icmpne 166
      // 0dd: goto 0e4
      // 0e0: invokestatic ynn.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: getfield ynn.wyl Lc05;
      // 0e8: getfield c05.vg8 Ll86;
      // 0eb: getfield l86.ooc F
      // 0ee: fconst_0
      // 0ef: fcmpl
      // 0f0: iload 2
      // 0f1: ifeq 137
      // 0f4: goto 0fb
      // 0f7: invokestatic ynn.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: ifne 126
      // 0fe: goto 105
      // 101: invokestatic ynn.a (Loov;)Loov;
      // 104: athrow
      // 105: aload 0
      // 106: getfield ynn.wyl Lc05;
      // 109: getfield c05.vg8 Ll86;
      // 10c: getfield l86.z66 F
      // 10f: fconst_0
      // 110: fcmpl
      // 111: iload 2
      // 112: ifeq 171
      // 115: goto 11c
      // 118: invokestatic ynn.a (Loov;)Loov;
      // 11b: athrow
      // 11c: ifeq 166
      // 11f: goto 126
      // 122: invokestatic ynn.a (Loov;)Loov;
      // 125: athrow
      // 126: aload 0
      // 127: getfield ynn.wyl Lc05;
      // 12a: getfield c05.vg8 Ll86;
      // 12d: getfield l86.fcv Z
      // 130: goto 137
      // 133: invokestatic ynn.a (Loov;)Loov;
      // 136: athrow
      // 137: iload 2
      // 138: ifeq 171
      // 13b: ifeq 166
      // 13e: goto 145
      // 141: invokestatic ynn.a (Loov;)Loov;
      // 144: athrow
      // 145: aload 0
      // 146: bipush 2
      // 147: putfield ynn.ymx I
      // 14a: aload 0
      // 14b: aload 0
      // 14c: getfield ynn.ehs D
      // 14f: aload 0
      // 150: invokespecial ynn.yc6 ()D
      // 153: dmul
      // 154: ldc2_w 0.01
      // 157: dsub
      // 158: putfield ynn.d9m D
      // 15b: iload 2
      // 15c: ifne 2e7
      // 15f: goto 166
      // 162: invokestatic ynn.a (Loov;)Loov;
      // 165: athrow
      // 166: aload 0
      // 167: getfield ynn.ymx I
      // 16a: goto 171
      // 16d: invokestatic ynn.a (Loov;)Loov;
      // 170: athrow
      // 171: bipush 2
      // 172: iload 2
      // 173: ifeq 1c1
      // 176: if_icmpne 1b5
      // 179: goto 180
      // 17c: invokestatic ynn.a (Loov;)Loov;
      // 17f: athrow
      // 180: aload 0
      // 181: bipush 3
      // 182: putfield ynn.ymx I
      // 185: aload 0
      // 186: getfield ynn.wyl Lc05;
      // 189: getfield c05.vg8 Ll86;
      // 18c: ldc2_w 0.399
      // 18f: putfield l86.mop D
      // 192: aload 1
      // 193: ldc2_w 0.399
      // 196: putfield _qa.wam D
      // 199: aload 0
      // 19a: dup
      // 19b: getfield ynn.d9m D
      // 19e: ldc2_w 2.149802
      // 1a1: dmul
      // 1a2: putfield ynn.d9m D
      // 1a5: aload 0
      // 1a6: bipush 1
      // 1a7: putfield ynn.z35 Z
      // 1aa: iload 2
      // 1ab: ifne 2e7
      // 1ae: goto 1b5
      // 1b1: invokestatic ynn.a (Loov;)Loov;
      // 1b4: athrow
      // 1b5: aload 0
      // 1b6: getfield ynn.ymx I
      // 1b9: bipush 3
      // 1ba: goto 1c1
      // 1bd: invokestatic ynn.a (Loov;)Loov;
      // 1c0: athrow
      // 1c1: iload 2
      // 1c2: ifeq 207
      // 1c5: if_icmpne 1f0
      // 1c8: goto 1cf
      // 1cb: invokestatic ynn.a (Loov;)Loov;
      // 1ce: athrow
      // 1cf: aload 0
      // 1d0: bipush 4
      // 1d1: putfield ynn.ymx I
      // 1d4: ldc2_w 0.66
      // 1d7: aload 0
      // 1d8: getfield ynn.nd9 D
      // 1db: aload 0
      // 1dc: invokespecial ynn.yc6 ()D
      // 1df: dsub
      // 1e0: dmul
      // 1e1: dstore 3
      // 1e2: aload 0
      // 1e3: aload 0
      // 1e4: getfield ynn.nd9 D
      // 1e7: dload 3
      // 1e8: dsub
      // 1e9: putfield ynn.d9m D
      // 1ec: iload 2
      // 1ed: ifne 2e7
      // 1f0: aload 0
      // 1f1: iload 2
      // 1f2: ifeq 2f7
      // 1f5: goto 1fc
      // 1f8: invokestatic ynn.a (Loov;)Loov;
      // 1fb: athrow
      // 1fc: getfield ynn.ymx I
      // 1ff: bipush 4
      // 200: goto 207
      // 203: invokestatic ynn.a (Loov;)Loov;
      // 206: athrow
      // 207: if_icmpne 2e7
      // 20a: aload 0
      // 20b: aload 0
      // 20c: getfield ynn.nd9 D
      // 20f: aload 0
      // 210: getfield ynn.nd9 D
      // 213: ldc2_w 159.0
      // 216: ddiv
      // 217: dsub
      // 218: putfield ynn.d9m D
      // 21b: aload 0
      // 21c: getfield ynn.wyl Lc05;
      // 21f: getfield c05.tij Lkh3;
      // 222: aload 0
      // 223: getfield ynn.wyl Lc05;
      // 226: getfield c05.vg8 Ll86;
      // 229: aload 0
      // 22a: getfield ynn.wyl Lc05;
      // 22d: getfield c05.vg8 Ll86;
      // 230: invokevirtual l86.aaw ()Lnh4;
      // 233: dconst_0
      // 234: aload 0
      // 235: getfield ynn.wyl Lc05;
      // 238: getfield c05.vg8 Ll86;
      // 23b: getfield l86.mop D
      // 23e: dconst_0
      // 23f: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 242: invokevirtual kh3.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 245: invokeinterface java/util/List.size ()I 1
      // 24a: iload 2
      // 24b: ifeq 293
      // 24e: goto 255
      // 251: invokestatic ynn.a (Loov;)Loov;
      // 254: athrow
      // 255: ifgt 27e
      // 258: goto 25f
      // 25b: invokestatic ynn.a (Loov;)Loov;
      // 25e: athrow
      // 25f: aload 0
      // 260: getfield ynn.wyl Lc05;
      // 263: getfield c05.vg8 Ll86;
      // 266: getfield l86.fcv Z
      // 269: iload 2
      // 26a: ifeq 2d8
      // 26d: goto 274
      // 270: invokestatic ynn.a (Loov;)Loov;
      // 273: athrow
      // 274: ifeq 2c7
      // 277: goto 27e
      // 27a: invokestatic ynn.a (Loov;)Loov;
      // 27d: athrow
      // 27e: aload 0
      // 27f: bipush 1
      // 280: putfield ynn.ymx I
      // 283: getstatic iri.o89 Lcn7;
      // 286: invokevirtual cn7.d7c ()Ljava/lang/Boolean;
      // 289: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 28c: goto 293
      // 28f: invokestatic ynn.a (Loov;)Loov;
      // 292: athrow
      // 293: iload 2
      // 294: ifeq 2d8
      // 297: ifeq 2c7
      // 29a: goto 2a1
      // 29d: invokestatic ynn.a (Loov;)Loov;
      // 2a0: athrow
      // 2a1: aload 0
      // 2a2: getfield ynn.z35 Z
      // 2a5: iload 2
      // 2a6: ifeq 2d8
      // 2a9: goto 2b0
      // 2ac: invokestatic ynn.a (Loov;)Loov;
      // 2af: athrow
      // 2b0: ifeq 2c7
      // 2b3: goto 2ba
      // 2b6: invokestatic ynn.a (Loov;)Loov;
      // 2b9: athrow
      // 2ba: getstatic kgt.ce6 Liri;
      // 2bd: invokevirtual iri.tp_ ()V
      // 2c0: goto 2c7
      // 2c3: invokestatic ynn.a (Loov;)Loov;
      // 2c6: athrow
      // 2c7: aload 1
      // 2c8: iload 2
      // 2c9: ifeq 2dc
      // 2cc: getfield _qa.wam D
      // 2cf: dconst_0
      // 2d0: dcmpg
      // 2d1: goto 2d8
      // 2d4: invokestatic ynn.a (Loov;)Loov;
      // 2d7: athrow
      // 2d8: ifge 2e7
      // 2db: aload 1
      // 2dc: dup
      // 2dd: getfield _qa.wam D
      // 2e0: ldc2_w 0.5
      // 2e3: dmul
      // 2e4: putfield _qa.wam D
      // 2e7: aload 0
      // 2e8: aload 0
      // 2e9: getfield ynn.d9m D
      // 2ec: aload 0
      // 2ed: invokespecial ynn.yc6 ()D
      // 2f0: invokestatic java/lang/Math.max (DD)D
      // 2f3: putfield ynn.d9m D
      // 2f6: aload 0
      // 2f7: getfield ynn.wyl Lc05;
      // 2fa: getfield c05.vg8 Ll86;
      // 2fd: getfield l86.g9g Lboa;
      // 300: getfield boa._mw F
      // 303: fstore 3
      // 304: aload 0
      // 305: getfield ynn.wyl Lc05;
      // 308: getfield c05.vg8 Ll86;
      // 30b: getfield l86.g9g Lboa;
      // 30e: getfield boa.lrp F
      // 311: fstore 4
      // 313: aload 0
      // 314: getfield ynn.wyl Lc05;
      // 317: getfield c05.vg8 Ll86;
      // 31a: getfield l86.x5k F
      // 31d: fstore 5
      // 31f: fload 3
      // 320: fconst_0
      // 321: fcmpl
      // 322: iload 2
      // 323: ifeq 373
      // 326: ifne 35e
      // 329: goto 330
      // 32c: invokestatic ynn.a (Loov;)Loov;
      // 32f: athrow
      // 330: fload 4
      // 332: fconst_0
      // 333: fcmpl
      // 334: iload 2
      // 335: ifeq 373
      // 338: goto 33f
      // 33b: invokestatic ynn.a (Loov;)Loov;
      // 33e: athrow
      // 33f: ifne 35e
      // 342: goto 349
      // 345: invokestatic ynn.a (Loov;)Loov;
      // 348: athrow
      // 349: aload 1
      // 34a: dconst_0
      // 34b: putfield _qa.c6l D
      // 34e: aload 1
      // 34f: dconst_0
      // 350: putfield _qa.faq D
      // 353: iload 2
      // 354: ifne 431
      // 357: goto 35e
      // 35a: invokestatic ynn.a (Loov;)Loov;
      // 35d: athrow
      // 35e: fload 3
      // 35f: fconst_0
      // 360: iload 2
      // 361: ifeq 436
      // 364: goto 36b
      // 367: invokestatic ynn.a (Loov;)Loov;
      // 36a: athrow
      // 36b: fcmpl
      // 36c: goto 373
      // 36f: invokestatic ynn.a (Loov;)Loov;
      // 372: athrow
      // 373: ifeq 431
      // 376: fload 4
      // 378: fconst_1
      // 379: fcmpl
      // 37a: iload 2
      // 37b: ifeq 3c8
      // 37e: goto 385
      // 381: invokestatic ynn.a (Loov;)Loov;
      // 384: athrow
      // 385: iflt 3bb
      // 388: goto 38f
      // 38b: invokestatic ynn.a (Loov;)Loov;
      // 38e: athrow
      // 38f: fload 5
      // 391: fload 3
      // 392: fconst_0
      // 393: fcmpl
      // 394: iload 2
      // 395: ifeq 3ab
      // 398: goto 39f
      // 39b: invokestatic ynn.a (Loov;)Loov;
      // 39e: athrow
      // 39f: ifle 3ae
      // 3a2: goto 3a9
      // 3a5: invokestatic ynn.a (Loov;)Loov;
      // 3a8: athrow
      // 3a9: bipush -45
      // 3ab: goto 3b0
      // 3ae: bipush 45
      // 3b0: i2f
      // 3b1: fadd
      // 3b2: fstore 5
      // 3b4: fconst_0
      // 3b5: fstore 4
      // 3b7: iload 2
      // 3b8: ifne 3fe
      // 3bb: fload 4
      // 3bd: ldc -1.0
      // 3bf: nop
      // 3c0: fcmpg
      // 3c1: goto 3c8
      // 3c4: invokestatic ynn.a (Loov;)Loov;
      // 3c7: athrow
      // 3c8: iload 2
      // 3c9: ifeq 401
      // 3cc: ifgt 3fe
      // 3cf: goto 3d6
      // 3d2: invokestatic ynn.a (Loov;)Loov;
      // 3d5: athrow
      // 3d6: fload 5
      // 3d8: fload 3
      // 3d9: fconst_0
      // 3da: fcmpl
      // 3db: iload 2
      // 3dc: ifeq 3f2
      // 3df: goto 3e6
      // 3e2: invokestatic ynn.a (Loov;)Loov;
      // 3e5: athrow
      // 3e6: ifle 3f5
      // 3e9: goto 3f0
      // 3ec: invokestatic ynn.a (Loov;)Loov;
      // 3ef: athrow
      // 3f0: bipush 45
      // 3f2: goto 3f7
      // 3f5: bipush -45
      // 3f7: i2f
      // 3f8: fadd
      // 3f9: fstore 5
      // 3fb: fconst_0
      // 3fc: fstore 4
      // 3fe: fload 3
      // 3ff: fconst_0
      // 400: fcmpl
      // 401: iload 2
      // 402: ifeq 42a
      // 405: ifle 415
      // 408: goto 40f
      // 40b: invokestatic ynn.a (Loov;)Loov;
      // 40e: athrow
      // 40f: fconst_1
      // 410: fstore 3
      // 411: iload 2
      // 412: ifne 431
      // 415: fload 3
      // 416: fconst_0
      // 417: iload 2
      // 418: ifeq 436
      // 41b: goto 422
      // 41e: invokestatic ynn.a (Loov;)Loov;
      // 421: athrow
      // 422: fcmpg
      // 423: goto 42a
      // 426: invokestatic ynn.a (Loov;)Loov;
      // 429: athrow
      // 42a: ifge 431
      // 42d: ldc -1.0
      // 42f: nop
      // 430: fstore 3
      // 431: fload 5
      // 433: ldc 90.0
      // 435: nop
      // 436: fadd
      // 437: f2d
      // 438: invokestatic java/lang/Math.toRadians (D)D
      // 43b: invokestatic java/lang/Math.cos (D)D
      // 43e: dstore 6
      // 440: fload 5
      // 442: ldc 90.0
      // 444: nop
      // 445: fadd
      // 446: f2d
      // 447: invokestatic java/lang/Math.toRadians (D)D
      // 44a: invokestatic java/lang/Math.sin (D)D
      // 44d: dstore 8
      // 44f: aload 1
      // 450: fload 3
      // 451: f2d
      // 452: aload 0
      // 453: getfield ynn.d9m D
      // 456: dmul
      // 457: dload 6
      // 459: dmul
      // 45a: fload 4
      // 45c: f2d
      // 45d: aload 0
      // 45e: getfield ynn.d9m D
      // 461: dmul
      // 462: dload 8
      // 464: dmul
      // 465: dadd
      // 466: putfield _qa.c6l D
      // 469: aload 1
      // 46a: fload 3
      // 46b: f2d
      // 46c: aload 0
      // 46d: getfield ynn.d9m D
      // 470: dmul
      // 471: dload 8
      // 473: dmul
      // 474: fload 4
      // 476: f2d
      // 477: aload 0
      // 478: getfield ynn.d9m D
      // 47b: dmul
      // 47c: dload 6
      // 47e: dmul
      // 47f: dsub
      // 480: putfield _qa.faq D
      // 483: fload 3
      // 484: fconst_0
      // 485: fcmpl
      // 486: iload 2
      // 487: ifeq 49f
      // 48a: ifne 4b3
      // 48d: goto 494
      // 490: invokestatic ynn.a (Loov;)Loov;
      // 493: athrow
      // 494: fload 4
      // 496: fconst_0
      // 497: fcmpl
      // 498: goto 49f
      // 49b: invokestatic ynn.a (Loov;)Loov;
      // 49e: athrow
      // 49f: ifne 4b3
      // 4a2: aload 1
      // 4a3: dconst_0
      // 4a4: putfield _qa.c6l D
      // 4a7: aload 1
      // 4a8: dconst_0
      // 4a9: putfield _qa.faq D
      // 4ac: goto 4b3
      // 4af: invokestatic ynn.a (Loov;)Loov;
      // 4b2: athrow
      // 4b3: return
   }

   @jev
   public void k1r(q8e var1) {
      double var2 = this.wyl.vg8.o2v - this.wyl.vg8.bc1;
      double var4 = this.wyl.vg8.vbd - this.wyl.vg8.a4d;
      this.nd9 = Math.sqrt(var2 * var2 + var4 * var4);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1353874590132641600L, 4859606867023492746L, MethodHandles.lookup().lookupClass()).a(42618176158729L);
      // $VF: monitorexit
      a = var10000;
      long var0 = a ^ 94294947084325L;
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
      String var6 = "\u0016îãê\f¨'\u00951<\u0081¶\\9ìÓ ±+P\n\tÖ=7\u000f¢ \u0092\u0099K \u009a*ëQB\u0081nÏø«t\u008dQ%\\[j";
      int var8 = "\u0016îãê\f¨'\u00951<\u0081¶\\9ìÓ ±+P\n\tÖ=7\u000f¢ \u0092\u0099K \u009a*ëQB\u0081nÏø«t\u008dQ%\\[j".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = b(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            d = var9;
            e = new String[2];
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12467;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("ynn", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("ynn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
