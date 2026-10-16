import java.lang.invoke.MethodHandles;
import java.math.BigDecimal;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class x1h extends ak9 {
   public float znr;
   public float l_8;
   public float mhh;
   public float hc2;
   public boolean ei6;
   public crk jyx;
   public String gpr;
   private static final long c;
   private static final String g;

   public x1h(nm6 var1, crk var2, int var3, int var4, String var5, float var6, float var7, float var8) {
      long var9 = c ^ 45966338740860L;
      super(var1, var3, var4, var5);
      this.jyx = var2;
      this.znr = var6;
      this.l_8 = var7;
      this.hc2 = var8;
      this.vms = jvy.ypj;
      this.c1c = 19;
      this.bqh = g;
   }

   @Override
   public void g1p(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield x1h.jyx Lcrk;
      // 008: getfield crk.lw6 Z
      // 00b: iload 3
      // 00c: ifne 26e
      // 00f: ifeq 260
      // 012: goto 019
      // 015: invokestatic x1h.c (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield x1h.vms I
      // 01d: bipush 10
      // 01f: isub
      // 020: i2f
      // 021: fstore 4
      // 023: aload 0
      // 024: getfield x1h.mhh F
      // 027: aload 0
      // 028: getfield x1h.znr F
      // 02b: fsub
      // 02c: aload 0
      // 02d: getfield x1h.l_8 F
      // 030: aload 0
      // 031: getfield x1h.znr F
      // 034: fsub
      // 035: fdiv
      // 036: fstore 5
      // 038: getstatic jsr.erx Lcyb;
      // 03b: aload 0
      // 03c: getfield x1h.vy4 Ljava/lang/String;
      // 03f: aload 0
      // 040: getfield x1h.koa I
      // 043: bipush 9
      // 045: iadd
      // 046: i2f
      // 047: aload 0
      // 048: getfield x1h.mff I
      // 04b: bipush 2
      // 04c: iadd
      // 04d: i2f
      // 04e: getstatic jvy.ck5 Z
      // 051: iload 3
      // 052: ifne 06c
      // 055: ifeq 06f
      // 058: goto 05f
      // 05b: invokestatic x1h.c (Loov;)Loov;
      // 05e: athrow
      // 05f: getstatic z7e.kks Lz7e;
      // 062: getfield z7e.k0y I
      // 065: goto 06c
      // 068: invokestatic x1h.c (Loov;)Loov;
      // 06b: athrow
      // 06c: goto 07c
      // 06f: new java/awt/Color
      // 072: dup
      // 073: ldc 14013909
      // 075: nop
      // 076: invokespecial java/awt/Color.<init> (I)V
      // 079: invokevirtual java/awt/Color.getRGB ()I
      // 07c: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 07f: pop
      // 080: aload 0
      // 081: getfield x1h.koa I
      // 084: bipush 10
      // 086: iadd
      // 087: i2d
      // 088: aload 0
      // 089: getfield x1h.mff I
      // 08c: bipush 14
      // 08e: iadd
      // 08f: i2d
      // 090: aload 0
      // 091: getfield x1h.koa I
      // 094: aload 0
      // 095: getfield x1h.vms I
      // 098: iadd
      // 099: i2d
      // 09a: aload 0
      // 09b: getfield x1h.mff I
      // 09e: bipush 14
      // 0a0: iadd
      // 0a1: i2d
      // 0a2: fconst_2
      // 0a3: getstatic jvy.ck5 Z
      // 0a6: iload 3
      // 0a7: ifne 0cb
      // 0aa: ifeq 0ce
      // 0ad: goto 0b4
      // 0b0: invokestatic x1h.c (Loov;)Loov;
      // 0b3: athrow
      // 0b4: new java/awt/Color
      // 0b7: dup
      // 0b8: ldc -1710875
      // 0ba: nop
      // 0bb: invokespecial java/awt/Color.<init> (I)V
      // 0be: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
      // 0c1: invokevirtual java/awt/Color.getRGB ()I
      // 0c4: goto 0cb
      // 0c7: invokestatic x1h.c (Loov;)Loov;
      // 0ca: athrow
      // 0cb: goto 0db
      // 0ce: new java/awt/Color
      // 0d1: dup
      // 0d2: ldc 12566463
      // 0d4: nop
      // 0d5: invokespecial java/awt/Color.<init> (I)V
      // 0d8: invokevirtual java/awt/Color.getRGB ()I
      // 0db: invokestatic mkt.dit (DDDDFI)V
      // 0de: aload 0
      // 0df: getfield x1h.koa I
      // 0e2: bipush 10
      // 0e4: iadd
      // 0e5: i2d
      // 0e6: aload 0
      // 0e7: getfield x1h.mff I
      // 0ea: bipush 14
      // 0ec: iadd
      // 0ed: i2d
      // 0ee: aload 0
      // 0ef: getfield x1h.koa I
      // 0f2: bipush 10
      // 0f4: iadd
      // 0f5: i2f
      // 0f6: fload 4
      // 0f8: fload 5
      // 0fa: fmul
      // 0fb: fadd
      // 0fc: f2d
      // 0fd: aload 0
      // 0fe: getfield x1h.mff I
      // 101: bipush 14
      // 103: iadd
      // 104: i2d
      // 105: fconst_2
      // 106: getstatic jvy.ck5 Z
      // 109: iload 3
      // 10a: ifne 11a
      // 10d: ifeq 11d
      // 110: goto 117
      // 113: invokestatic x1h.c (Loov;)Loov;
      // 116: athrow
      // 117: getstatic jvy.ts6 I
      // 11a: goto 120
      // 11d: getstatic jvy.cnm I
      // 120: invokestatic mkt.dit (DDDDFI)V
      // 123: aload 0
      // 124: getfield x1h.mhh F
      // 127: fconst_1
      // 128: frem
      // 129: fconst_0
      // 12a: fcmpl
      // 12b: ifeq 148
      // 12e: new java/math/BigDecimal
      // 131: dup
      // 132: aload 0
      // 133: getfield x1h.mhh F
      // 136: f2d
      // 137: invokespecial java/math/BigDecimal.<init> (D)V
      // 13a: bipush 1
      // 13b: bipush 4
      // 13c: invokevirtual java/math/BigDecimal.setScale (II)Ljava/math/BigDecimal;
      // 13f: invokevirtual java/math/BigDecimal.toString ()Ljava/lang/String;
      // 142: astore 6
      // 144: iload 3
      // 145: ifeq 15e
      // 148: new java/math/BigDecimal
      // 14b: dup
      // 14c: aload 0
      // 14d: getfield x1h.mhh F
      // 150: f2d
      // 151: invokespecial java/math/BigDecimal.<init> (D)V
      // 154: bipush 0
      // 155: bipush 4
      // 156: invokevirtual java/math/BigDecimal.setScale (II)Ljava/math/BigDecimal;
      // 159: invokevirtual java/math/BigDecimal.toString ()Ljava/lang/String;
      // 15c: astore 6
      // 15e: aload 0
      // 15f: getfield x1h.gpr Ljava/lang/String;
      // 162: iload 3
      // 163: ifne 18d
      // 166: ifnull 18f
      // 169: goto 170
      // 16c: invokestatic x1h.c (Loov;)Loov;
      // 16f: athrow
      // 170: new java/lang/StringBuilder
      // 173: dup
      // 174: invokespecial java/lang/StringBuilder.<init> ()V
      // 177: aload 6
      // 179: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17c: aload 0
      // 17d: getfield x1h.gpr Ljava/lang/String;
      // 180: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 183: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 186: goto 18d
      // 189: invokestatic x1h.c (Loov;)Loov;
      // 18c: athrow
      // 18d: astore 6
      // 18f: getstatic jsr.erx Lcyb;
      // 192: aload 6
      // 194: aload 0
      // 195: getfield x1h.koa I
      // 198: aload 0
      // 199: getfield x1h.vms I
      // 19c: iadd
      // 19d: i2f
      // 19e: getstatic jsr.erx Lcyb;
      // 1a1: aload 6
      // 1a3: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 1a6: fsub
      // 1a7: fconst_1
      // 1a8: fadd
      // 1a9: aload 0
      // 1aa: getfield x1h.mff I
      // 1ad: bipush 2
      // 1ae: iadd
      // 1af: i2f
      // 1b0: getstatic jvy.ck5 Z
      // 1b3: iload 3
      // 1b4: ifne 1ce
      // 1b7: ifeq 1d1
      // 1ba: goto 1c1
      // 1bd: invokestatic x1h.c (Loov;)Loov;
      // 1c0: athrow
      // 1c1: getstatic z7e.kks Lz7e;
      // 1c4: getfield z7e.k0y I
      // 1c7: goto 1ce
      // 1ca: invokestatic x1h.c (Loov;)Loov;
      // 1cd: athrow
      // 1ce: goto 1de
      // 1d1: new java/awt/Color
      // 1d4: dup
      // 1d5: ldc 14013909
      // 1d7: nop
      // 1d8: invokespecial java/awt/Color.<init> (I)V
      // 1db: invokevirtual java/awt/Color.getRGB ()I
      // 1de: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 1e1: pop
      // 1e2: aload 0
      // 1e3: getfield x1h.koa I
      // 1e6: bipush 8
      // 1e8: iadd
      // 1e9: i2f
      // 1ea: fload 4
      // 1ec: fload 5
      // 1ee: fmul
      // 1ef: fadd
      // 1f0: aload 0
      // 1f1: getfield x1h.mff I
      // 1f4: i2f
      // 1f5: ldc 11.5
      // 1f7: nop
      // 1f8: fadd
      // 1f9: ldc 5.0
      // 1fb: nop
      // 1fc: ldc 5.0
      // 1fe: nop
      // 1ff: ldc 10.0
      // 201: nop
      // 202: getstatic jvy.ck5 Z
      // 205: iload 3
      // 206: ifne 21d
      // 209: ifeq 220
      // 20c: goto 213
      // 20f: invokestatic x1h.c (Loov;)Loov;
      // 212: athrow
      // 213: ldc -14835457
      // 215: nop
      // 216: goto 21d
      // 219: invokestatic x1h.c (Loov;)Loov;
      // 21c: athrow
      // 21d: goto 22d
      // 220: new java/awt/Color
      // 223: dup
      // 224: ldc 14013909
      // 226: nop
      // 227: invokespecial java/awt/Color.<init> (I)V
      // 22a: invokevirtual java/awt/Color.getRGB ()I
      // 22d: fconst_1
      // 22e: getstatic jvy.ck5 Z
      // 231: iload 3
      // 232: ifne 249
      // 235: ifeq 24c
      // 238: goto 23f
      // 23b: invokestatic x1h.c (Loov;)Loov;
      // 23e: athrow
      // 23f: ldc -14835457
      // 241: nop
      // 242: goto 249
      // 245: invokestatic x1h.c (Loov;)Loov;
      // 248: athrow
      // 249: goto 259
      // 24c: new java/awt/Color
      // 24f: dup
      // 250: ldc 14013909
      // 252: nop
      // 253: invokespecial java/awt/Color.<init> (I)V
      // 256: invokevirtual java/awt/Color.getRGB ()I
      // 259: invokestatic mkt.o8m (FFFFFIFI)V
      // 25c: iload 3
      // 25d: ifeq 4af
      // 260: aload 0
      // 261: getfield x1h.vms I
      // 264: bipush 22
      // 266: isub
      // 267: goto 26e
      // 26a: invokestatic x1h.c (Loov;)Loov;
      // 26d: athrow
      // 26e: i2f
      // 26f: fstore 4
      // 271: aload 0
      // 272: getfield x1h.mhh F
      // 275: aload 0
      // 276: getfield x1h.znr F
      // 279: fsub
      // 27a: aload 0
      // 27b: getfield x1h.l_8 F
      // 27e: aload 0
      // 27f: getfield x1h.znr F
      // 282: fsub
      // 283: fdiv
      // 284: fstore 5
      // 286: getstatic jsr.erx Lcyb;
      // 289: aload 0
      // 28a: getfield x1h.vy4 Ljava/lang/String;
      // 28d: aload 0
      // 28e: getfield x1h.koa I
      // 291: bipush 9
      // 293: iadd
      // 294: i2f
      // 295: aload 0
      // 296: getfield x1h.mff I
      // 299: bipush 3
      // 29a: iadd
      // 29b: i2f
      // 29c: getstatic jvy.ck5 Z
      // 29f: iload 3
      // 2a0: ifne 2ba
      // 2a3: ifeq 2bd
      // 2a6: goto 2ad
      // 2a9: invokestatic x1h.c (Loov;)Loov;
      // 2ac: athrow
      // 2ad: getstatic z7e.kks Lz7e;
      // 2b0: getfield z7e.k0y I
      // 2b3: goto 2ba
      // 2b6: invokestatic x1h.c (Loov;)Loov;
      // 2b9: athrow
      // 2ba: goto 2ca
      // 2bd: new java/awt/Color
      // 2c0: dup
      // 2c1: ldc 14013909
      // 2c3: nop
      // 2c4: invokespecial java/awt/Color.<init> (I)V
      // 2c7: invokevirtual java/awt/Color.getRGB ()I
      // 2ca: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 2cd: pop
      // 2ce: aload 0
      // 2cf: getfield x1h.koa I
      // 2d2: bipush 10
      // 2d4: iadd
      // 2d5: i2d
      // 2d6: aload 0
      // 2d7: getfield x1h.mff I
      // 2da: bipush 16
      // 2dc: iadd
      // 2dd: i2d
      // 2de: aload 0
      // 2df: getfield x1h.koa I
      // 2e2: aload 0
      // 2e3: getfield x1h.vms I
      // 2e6: iadd
      // 2e7: bipush 10
      // 2e9: isub
      // 2ea: i2d
      // 2eb: aload 0
      // 2ec: getfield x1h.mff I
      // 2ef: bipush 16
      // 2f1: iadd
      // 2f2: i2d
      // 2f3: fconst_2
      // 2f4: getstatic jvy.ck5 Z
      // 2f7: iload 3
      // 2f8: ifne 31c
      // 2fb: ifeq 31f
      // 2fe: goto 305
      // 301: invokestatic x1h.c (Loov;)Loov;
      // 304: athrow
      // 305: new java/awt/Color
      // 308: dup
      // 309: ldc -1710875
      // 30b: nop
      // 30c: invokespecial java/awt/Color.<init> (I)V
      // 30f: invokevirtual java/awt/Color.darker ()Ljava/awt/Color;
      // 312: invokevirtual java/awt/Color.getRGB ()I
      // 315: goto 31c
      // 318: invokestatic x1h.c (Loov;)Loov;
      // 31b: athrow
      // 31c: goto 32c
      // 31f: new java/awt/Color
      // 322: dup
      // 323: ldc 12566463
      // 325: nop
      // 326: invokespecial java/awt/Color.<init> (I)V
      // 329: invokevirtual java/awt/Color.getRGB ()I
      // 32c: invokestatic mkt.dit (DDDDFI)V
      // 32f: aload 0
      // 330: getfield x1h.koa I
      // 333: bipush 10
      // 335: iadd
      // 336: i2d
      // 337: aload 0
      // 338: getfield x1h.mff I
      // 33b: bipush 16
      // 33d: iadd
      // 33e: i2d
      // 33f: aload 0
      // 340: getfield x1h.koa I
      // 343: bipush 10
      // 345: iadd
      // 346: i2f
      // 347: fload 4
      // 349: fload 5
      // 34b: fmul
      // 34c: fadd
      // 34d: f2d
      // 34e: aload 0
      // 34f: getfield x1h.mff I
      // 352: bipush 16
      // 354: iadd
      // 355: i2d
      // 356: fconst_2
      // 357: getstatic jvy.ck5 Z
      // 35a: iload 3
      // 35b: ifne 36b
      // 35e: ifeq 36e
      // 361: goto 368
      // 364: invokestatic x1h.c (Loov;)Loov;
      // 367: athrow
      // 368: getstatic jvy.ts6 I
      // 36b: goto 371
      // 36e: getstatic jvy.cnm I
      // 371: invokestatic mkt.dit (DDDDFI)V
      // 374: aload 0
      // 375: getfield x1h.mhh F
      // 378: fconst_1
      // 379: frem
      // 37a: fconst_0
      // 37b: fcmpl
      // 37c: ifeq 399
      // 37f: new java/math/BigDecimal
      // 382: dup
      // 383: aload 0
      // 384: getfield x1h.mhh F
      // 387: f2d
      // 388: invokespecial java/math/BigDecimal.<init> (D)V
      // 38b: bipush 1
      // 38c: bipush 4
      // 38d: invokevirtual java/math/BigDecimal.setScale (II)Ljava/math/BigDecimal;
      // 390: invokevirtual java/math/BigDecimal.toString ()Ljava/lang/String;
      // 393: astore 6
      // 395: iload 3
      // 396: ifeq 3af
      // 399: new java/math/BigDecimal
      // 39c: dup
      // 39d: aload 0
      // 39e: getfield x1h.mhh F
      // 3a1: f2d
      // 3a2: invokespecial java/math/BigDecimal.<init> (D)V
      // 3a5: bipush 0
      // 3a6: bipush 4
      // 3a7: invokevirtual java/math/BigDecimal.setScale (II)Ljava/math/BigDecimal;
      // 3aa: invokevirtual java/math/BigDecimal.toString ()Ljava/lang/String;
      // 3ad: astore 6
      // 3af: aload 0
      // 3b0: getfield x1h.gpr Ljava/lang/String;
      // 3b3: iload 3
      // 3b4: ifne 3de
      // 3b7: ifnull 3e0
      // 3ba: goto 3c1
      // 3bd: invokestatic x1h.c (Loov;)Loov;
      // 3c0: athrow
      // 3c1: new java/lang/StringBuilder
      // 3c4: dup
      // 3c5: invokespecial java/lang/StringBuilder.<init> ()V
      // 3c8: aload 6
      // 3ca: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3cd: aload 0
      // 3ce: getfield x1h.gpr Ljava/lang/String;
      // 3d1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 3d4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 3d7: goto 3de
      // 3da: invokestatic x1h.c (Loov;)Loov;
      // 3dd: athrow
      // 3de: astore 6
      // 3e0: getstatic jsr.erx Lcyb;
      // 3e3: aload 6
      // 3e5: aload 0
      // 3e6: getfield x1h.koa I
      // 3e9: aload 0
      // 3ea: getfield x1h.vms I
      // 3ed: iadd
      // 3ee: i2f
      // 3ef: getstatic jsr.erx Lcyb;
      // 3f2: aload 6
      // 3f4: invokevirtual cyb.ax2 (Ljava/lang/String;)F
      // 3f7: fsub
      // 3f8: ldc 9.0
      // 3fa: nop
      // 3fb: fsub
      // 3fc: aload 0
      // 3fd: getfield x1h.mff I
      // 400: bipush 3
      // 401: iadd
      // 402: i2f
      // 403: getstatic jvy.ck5 Z
      // 406: iload 3
      // 407: ifne 421
      // 40a: ifeq 424
      // 40d: goto 414
      // 410: invokestatic x1h.c (Loov;)Loov;
      // 413: athrow
      // 414: getstatic z7e.kks Lz7e;
      // 417: getfield z7e.k0y I
      // 41a: goto 421
      // 41d: invokestatic x1h.c (Loov;)Loov;
      // 420: athrow
      // 421: goto 431
      // 424: new java/awt/Color
      // 427: dup
      // 428: ldc 14013909
      // 42a: nop
      // 42b: invokespecial java/awt/Color.<init> (I)V
      // 42e: invokevirtual java/awt/Color.getRGB ()I
      // 431: invokevirtual cyb.fzf (Ljava/lang/String;FFI)I
      // 434: pop
      // 435: aload 0
      // 436: getfield x1h.koa I
      // 439: bipush 8
      // 43b: iadd
      // 43c: i2f
      // 43d: fload 4
      // 43f: fload 5
      // 441: fmul
      // 442: fadd
      // 443: aload 0
      // 444: getfield x1h.mff I
      // 447: i2f
      // 448: ldc 13.5
      // 44a: nop
      // 44b: fadd
      // 44c: ldc 5.0
      // 44e: nop
      // 44f: ldc 5.0
      // 451: nop
      // 452: ldc 10.0
      // 454: nop
      // 455: getstatic jvy.ck5 Z
      // 458: iload 3
      // 459: ifne 470
      // 45c: ifeq 473
      // 45f: goto 466
      // 462: invokestatic x1h.c (Loov;)Loov;
      // 465: athrow
      // 466: ldc -14835457
      // 468: nop
      // 469: goto 470
      // 46c: invokestatic x1h.c (Loov;)Loov;
      // 46f: athrow
      // 470: goto 480
      // 473: new java/awt/Color
      // 476: dup
      // 477: ldc 14013909
      // 479: nop
      // 47a: invokespecial java/awt/Color.<init> (I)V
      // 47d: invokevirtual java/awt/Color.getRGB ()I
      // 480: fconst_1
      // 481: getstatic jvy.ck5 Z
      // 484: iload 3
      // 485: ifne 49c
      // 488: ifeq 49f
      // 48b: goto 492
      // 48e: invokestatic x1h.c (Loov;)Loov;
      // 491: athrow
      // 492: ldc -14835457
      // 494: nop
      // 495: goto 49c
      // 498: invokestatic x1h.c (Loov;)Loov;
      // 49b: athrow
      // 49c: goto 4ac
      // 49f: new java/awt/Color
      // 4a2: dup
      // 4a3: ldc 14013909
      // 4a5: nop
      // 4a6: invokespecial java/awt/Color.<init> (I)V
      // 4a9: invokevirtual java/awt/Color.getRGB ()I
      // 4ac: invokestatic mkt.o8m (FFFFFIFI)V
      // 4af: return
   }

   public static BigDecimal s1y(float var0, int var1) {
      BigDecimal var2 = new BigDecimal(Float.toString(var0));
      return var2.setScale(var1, 4);
   }

   @Override
   public void c2n(int param1, int param2) {
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
      // 05: iload 1
      // 06: iload 2
      // 07: invokespecial ak9.c2n (II)V
      // 0a: aload 0
      // 0b: iload 3
      // 0c: ifne 24
      // 0f: getfield x1h.ei6 Z
      // 12: ifeq b6
      // 15: goto 1c
      // 18: invokestatic x1h.c (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: goto 24
      // 20: invokestatic x1h.c (Loov;)Loov;
      // 23: athrow
      // 24: iload 1
      // 25: aload 0
      // 26: getfield x1h.koa I
      // 29: bipush 10
      // 2b: iadd
      // 2c: isub
      // 2d: i2f
      // 2e: fconst_0
      // 2f: aload 0
      // 30: getfield x1h.vms I
      // 33: aload 0
      // 34: getfield x1h.jyx Lcrk;
      // 37: getfield crk.lw6 Z
      // 3a: iload 3
      // 3b: ifne 4a
      // 3e: ifeq 4d
      // 41: goto 48
      // 44: invokestatic x1h.c (Loov;)Loov;
      // 47: athrow
      // 48: bipush 10
      // 4a: goto 4f
      // 4d: bipush 22
      // 4f: isub
      // 50: i2f
      // 51: aload 0
      // 52: getfield x1h.znr F
      // 55: aload 0
      // 56: getfield x1h.l_8 F
      // 59: invokestatic rak.u1m (FFFFF)F
      // 5c: putfield x1h.mhh F
      // 5f: aload 0
      // 60: dup
      // 61: getfield x1h.mhh F
      // 64: aload 0
      // 65: getfield x1h.mhh F
      // 68: aload 0
      // 69: getfield x1h.hc2 F
      // 6c: frem
      // 6d: fsub
      // 6e: putfield x1h.mhh F
      // 71: aload 0
      // 72: getfield x1h.mhh F
      // 75: aload 0
      // 76: getfield x1h.l_8 F
      // 79: fcmpl
      // 7a: iload 3
      // 7b: ifne ab
      // 7e: ifle 97
      // 81: goto 88
      // 84: invokestatic x1h.c (Loov;)Loov;
      // 87: athrow
      // 88: aload 0
      // 89: aload 0
      // 8a: getfield x1h.l_8 F
      // 8d: putfield x1h.mhh F
      // 90: goto 97
      // 93: invokestatic x1h.c (Loov;)Loov;
      // 96: athrow
      // 97: aload 0
      // 98: iload 3
      // 99: ifne af
      // 9c: getfield x1h.mhh F
      // 9f: aload 0
      // a0: getfield x1h.znr F
      // a3: fcmpg
      // a4: goto ab
      // a7: invokestatic x1h.c (Loov;)Loov;
      // aa: athrow
      // ab: ifge b6
      // ae: aload 0
      // af: aload 0
      // b0: getfield x1h.znr F
      // b3: putfield x1h.mhh F
      // b6: return
   }

   @Override
   public void x6o(int param1, int param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 0
      // 07: iload 1
      // 08: iload 2
      // 09: invokevirtual x1h.nxv (II)Z
      // 0c: iload 4
      // 0e: ifeq 2b
      // 11: ifeq 3e
      // 14: goto 1b
      // 17: invokestatic x1h.c (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield x1h.loa Lnm6;
      // 1f: iload 1
      // 20: iload 2
      // 21: invokevirtual nm6.au1 (II)Z
      // 24: goto 2b
      // 27: invokestatic x1h.c (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 4
      // 2d: ifeq 3b
      // 30: ifeq 3e
      // 33: goto 3a
      // 36: invokestatic x1h.c (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: putfield x1h.yu6 Z
      // 42: iload 3
      // 43: iload 4
      // 45: ifeq 93
      // 48: ifeq 92
      // 4b: goto 52
      // 4e: invokestatic x1h.c (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: getfield x1h.u_u Z
      // 56: iload 4
      // 58: ifeq 93
      // 5b: goto 62
      // 5e: invokestatic x1h.c (Loov;)Loov;
      // 61: athrow
      // 62: ifne 92
      // 65: goto 6c
      // 68: invokestatic x1h.c (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield x1h.yu6 Z
      // 70: iload 4
      // 72: ifeq 93
      // 75: goto 7c
      // 78: invokestatic x1h.c (Loov;)Loov;
      // 7b: athrow
      // 7c: ifeq 92
      // 7f: goto 86
      // 82: invokestatic x1h.c (Loov;)Loov;
      // 85: athrow
      // 86: aload 0
      // 87: bipush 1
      // 88: putfield x1h.ei6 Z
      // 8b: goto 92
      // 8e: invokestatic x1h.c (Loov;)Loov;
      // 91: athrow
      // 92: iload 3
      // 93: ifne a2
      // 96: aload 0
      // 97: bipush 0
      // 98: putfield x1h.ei6 Z
      // 9b: goto a2
      // 9e: invokestatic x1h.c (Loov;)Loov;
      // a1: athrow
      // a2: aload 0
      // a3: iload 3
      // a4: putfield x1h.u_u Z
      // a7: return
   }

   @Override
   public void vx9() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 22
      // 09: invokespecial ak9.vx9 ()V
      // 0c: bipush 0
      // 0d: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 10: ifne 26
      // 13: goto 1a
      // 16: invokestatic x1h.c (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: goto 22
      // 1e: invokestatic x1h.c (Loov;)Loov;
      // 21: athrow
      // 22: bipush 0
      // 23: putfield x1h.ei6 Z
      // 26: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(6718745796676005066L, 4024357083515425493L, MethodHandles.lookup().lookupClass()).a(92526494781192L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 97368902151198L;
      Cipher var2;
      Cipher var5 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var5.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("sc®Á-\u009bsS\u001dcD¦\u0010Ó\u001ba".getBytes("ISO-8859-1"));
      String var6 = b(var4).intern();
      byte var10001 = -1;
      g = var6;
   }

   private static oov c(oov var0) {
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
