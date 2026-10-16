import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class fcs extends yqv implements t6u, qxu, uv0 {
   public double jht;
   public double dv9;
   public double kyz;
   public double[][] _5e;
   public int yth;
   public pq1[] f11;
   public pq1 tpz;
   public pq1 s6p;
   public pq1 d78;
   public pq1 j_b;
   public pq1 cbh;
   public pq1 nqn;
   public pq1 zjj;
   public float z1a;
   public float djj;
   public boolean ut4;
   public boolean xsa;
   public int jkn;
   public edl xs_;
   private static final long c;
   private static final String[] d;
   private static final String[] g;
   private static final Map h = new HashMap(13);

   public fcs(t9d var1) {
      long var2 = c ^ 42273833199220L;
      super(var1);
      this._5e = new double[64][3];
      this.yth = -1;
      this.f11 = new pq1[]{
         this.tpz = new pq1(this, d<"w">(17883, 2675545107310850266L ^ var2), 6.0F, 6.0F),
         this.s6p = new pq1(this, d<"w">(5525, 3846291135530033307L ^ var2), 8.0F, 8.0F),
         this.d78 = new pq1(this, d<"w">(3694, 2925573534154128238L ^ var2), 4.0F, 4.0F),
         this.j_b = new pq1(this, d<"w">(215, 1103903590576354773L ^ var2), 4.0F, 4.0F),
         this.cbh = new pq1(this, d<"w">(215, 1103903590576354773L ^ var2), 4.0F, 4.0F),
         this.nqn = new pq1(this, d<"w">(13047, 1631062996099680242L ^ var2), 4.0F, 4.0F),
         this.zjj = new pq1(this, d<"w">(21349, 3423174310966830698L ^ var2), 4.0F, 4.0F)
      };
      this.uh3(this.axb());
      this.yxc(16.0F, 8.0F);
      this.kvx = true;
      this.cuj = true;
      this.dv9 = 100.0;
      this.k50 = true;
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(200.0);
   }

   @Override
   public void tbj() {
      super.tbj();
   }

   public double[] gv2(int var1, float var2) {
      int var3 = t9d.c();

      int var10000;
      label21: {
         label20: {
            try {
               float var14;
               var10000 = (var14 = this.i55() - 0.0F) == 0.0F ? 0 : (var14 < 0.0F ? -1 : 1);
               if (var3 != 0) {
                  break label21;
               }

               if (var10000 > 0) {
                  break label20;
               }
            } catch (oov var11) {
               throw a(var11);
            }

            var2 = 0.0F;
         }

         var2 = 1.0F - var2;
         var10000 = this.yth - var1 * 1 & 63;
      }

      int var4 = var10000;
      int var5 = this.yth - var1 * 1 - 1 & 63;
      double[] var6 = new double[3];
      double var7 = this._5e[var4][0];
      double var9 = fe6.lrs(this._5e[var5][0] - var7);
      var6[0] = var7 + var9 * (double)var2;
      var7 = this._5e[var4][1];
      var9 = this._5e[var5][1] - var7;
      var6[1] = var7 + var9 * (double)var2;
      var6[2] = this._5e[var4][2] + (this._5e[var5][2] - this._5e[var4][2]) * (double)var2;
      return var6;
   }

   @Override
   public void e_a() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic fcs.c J
      // 003: ldc2_w 100632747335644
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield fcs.oay Lt9d;
      // 010: getfield t9d.v0f Z
      // 013: iload 3
      // 014: ifeq 0db
      // 017: ifeq 0c2
      // 01a: goto 021
      // 01d: invokestatic fcs.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: getfield fcs.djj F
      // 025: ldc 3.1415927
      // 027: nop
      // 028: fmul
      // 029: fconst_2
      // 02a: fmul
      // 02b: invokestatic fe6.ssk (F)F
      // 02e: fstore 4
      // 030: aload 0
      // 031: getfield fcs.z1a F
      // 034: ldc 3.1415927
      // 036: nop
      // 037: fmul
      // 038: fconst_2
      // 039: fmul
      // 03a: invokestatic fe6.ssk (F)F
      // 03d: fstore 5
      // 03f: fload 5
      // 041: ldc -0.3
      // 043: nop
      // 044: fcmpg
      // 045: iload 3
      // 046: ifeq 0db
      // 049: ifgt 0c2
      // 04c: goto 053
      // 04f: invokestatic fcs.a (Loov;)Loov;
      // 052: athrow
      // 053: fload 4
      // 055: ldc -0.3
      // 057: nop
      // 058: fcmpl
      // 059: iload 3
      // 05a: ifeq 0db
      // 05d: goto 064
      // 060: invokestatic fcs.a (Loov;)Loov;
      // 063: athrow
      // 064: iflt 0c2
      // 067: goto 06e
      // 06a: invokestatic fcs.a (Loov;)Loov;
      // 06d: athrow
      // 06e: aload 0
      // 06f: invokevirtual fcs.o3x ()Z
      // 072: iload 3
      // 073: ifeq 0db
      // 076: goto 07d
      // 079: invokestatic fcs.a (Loov;)Loov;
      // 07c: athrow
      // 07d: ifne 0c2
      // 080: goto 087
      // 083: invokestatic fcs.a (Loov;)Loov;
      // 086: athrow
      // 087: aload 0
      // 088: getfield fcs.oay Lt9d;
      // 08b: aload 0
      // 08c: getfield fcs.o2v D
      // 08f: aload 0
      // 090: getfield fcs.kfp D
      // 093: aload 0
      // 094: getfield fcs.vbd D
      // 097: sipush 9651
      // 09a: ldc2_w 5169016638489635094
      // 09d: lload 1
      // 09e: lxor
      // 09f: invokedynamic w (IJ)Ljava/lang/String; bsm=fcs.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: nop
      // 0a5: ldc 5.0
      // 0a7: nop
      // 0a8: ldc 0.8
      // 0aa: nop
      // 0ab: aload 0
      // 0ac: getfield fcs.z2d Ljava/util/Random;
      // 0af: invokevirtual java/util/Random.nextFloat ()F
      // 0b2: ldc 0.3
      // 0b4: nop
      // 0b5: fmul
      // 0b6: fadd
      // 0b7: bipush 0
      // 0b8: invokevirtual t9d.wd_ (DDDLjava/lang/String;FFZ)V
      // 0bb: goto 0c2
      // 0be: invokestatic fcs.a (Loov;)Loov;
      // 0c1: athrow
      // 0c2: aload 0
      // 0c3: aload 0
      // 0c4: getfield fcs.djj F
      // 0c7: putfield fcs.z1a F
      // 0ca: aload 0
      // 0cb: invokevirtual fcs.i55 ()F
      // 0ce: fconst_0
      // 0cf: iload 3
      // 0d0: ifeq 16b
      // 0d3: fcmpg
      // 0d4: goto 0db
      // 0d7: invokestatic fcs.a (Loov;)Loov;
      // 0da: athrow
      // 0db: ifgt 141
      // 0de: aload 0
      // 0df: getfield fcs.z2d Ljava/util/Random;
      // 0e2: invokevirtual java/util/Random.nextFloat ()F
      // 0e5: ldc 0.5
      // 0e7: nop
      // 0e8: fsub
      // 0e9: ldc 8.0
      // 0eb: nop
      // 0ec: fmul
      // 0ed: fstore 4
      // 0ef: aload 0
      // 0f0: getfield fcs.z2d Ljava/util/Random;
      // 0f3: invokevirtual java/util/Random.nextFloat ()F
      // 0f6: ldc 0.5
      // 0f8: nop
      // 0f9: fsub
      // 0fa: ldc 4.0
      // 0fc: nop
      // 0fd: fmul
      // 0fe: fstore 5
      // 100: aload 0
      // 101: getfield fcs.z2d Ljava/util/Random;
      // 104: invokevirtual java/util/Random.nextFloat ()F
      // 107: ldc 0.5
      // 109: nop
      // 10a: fsub
      // 10b: ldc 8.0
      // 10d: nop
      // 10e: fmul
      // 10f: fstore 6
      // 111: aload 0
      // 112: getfield fcs.oay Lt9d;
      // 115: getstatic w_0.tmu Lw_0;
      // 118: aload 0
      // 119: getfield fcs.o2v D
      // 11c: fload 4
      // 11e: f2d
      // 11f: dadd
      // 120: aload 0
      // 121: getfield fcs.kfp D
      // 124: ldc2_w 2.0
      // 127: dadd
      // 128: fload 5
      // 12a: f2d
      // 12b: dadd
      // 12c: aload 0
      // 12d: getfield fcs.vbd D
      // 130: fload 6
      // 132: f2d
      // 133: dadd
      // 134: dconst_0
      // 135: dconst_0
      // 136: dconst_0
      // 137: bipush 0
      // 138: newarray 10
      // 13a: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 13d: iload 3
      // 13e: ifne ada
      // 141: aload 0
      // 142: invokespecial fcs.dwa ()V
      // 145: ldc 0.2
      // 147: nop
      // 148: aload 0
      // 149: getfield fcs.icv D
      // 14c: aload 0
      // 14d: getfield fcs.icv D
      // 150: dmul
      // 151: aload 0
      // 152: getfield fcs.bw4 D
      // 155: aload 0
      // 156: getfield fcs.bw4 D
      // 159: dmul
      // 15a: dadd
      // 15b: invokestatic fe6.dii (D)F
      // 15e: ldc 10.0
      // 160: nop
      // 161: fmul
      // 162: fconst_1
      // 163: fadd
      // 164: goto 16b
      // 167: invokestatic fcs.a (Loov;)Loov;
      // 16a: athrow
      // 16b: fdiv
      // 16c: fstore 4
      // 16e: fload 4
      // 170: ldc2_w 2.0
      // 173: aload 0
      // 174: getfield fcs.mop D
      // 177: invokestatic java/lang/Math.pow (DD)D
      // 17a: d2f
      // 17b: fmul
      // 17c: fstore 4
      // 17e: aload 0
      // 17f: iload 3
      // 180: ifeq 1b2
      // 183: getfield fcs.xsa Z
      // 186: ifeq 1aa
      // 189: goto 190
      // 18c: invokestatic fcs.a (Loov;)Loov;
      // 18f: athrow
      // 190: aload 0
      // 191: dup
      // 192: getfield fcs.djj F
      // 195: fload 4
      // 197: ldc 0.5
      // 199: nop
      // 19a: fmul
      // 19b: fadd
      // 19c: putfield fcs.djj F
      // 19f: iload 3
      // 1a0: ifne 1bc
      // 1a3: goto 1aa
      // 1a6: invokestatic fcs.a (Loov;)Loov;
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: goto 1b2
      // 1ae: invokestatic fcs.a (Loov;)Loov;
      // 1b1: athrow
      // 1b2: dup
      // 1b3: getfield fcs.djj F
      // 1b6: fload 4
      // 1b8: fadd
      // 1b9: putfield fcs.djj F
      // 1bc: aload 0
      // 1bd: aload 0
      // 1be: getfield fcs.x5k F
      // 1c1: invokestatic fe6.qsy (F)F
      // 1c4: putfield fcs.x5k F
      // 1c7: aload 0
      // 1c8: invokevirtual fcs.r1t ()Z
      // 1cb: iload 3
      // 1cc: ifeq 1f6
      // 1cf: ifeq 1eb
      // 1d2: goto 1d9
      // 1d5: invokestatic fcs.a (Loov;)Loov;
      // 1d8: athrow
      // 1d9: aload 0
      // 1da: ldc 0.5
      // 1dc: nop
      // 1dd: putfield fcs.djj F
      // 1e0: iload 3
      // 1e1: ifne ada
      // 1e4: goto 1eb
      // 1e7: invokestatic fcs.a (Loov;)Loov;
      // 1ea: athrow
      // 1eb: aload 0
      // 1ec: getfield fcs.yth I
      // 1ef: goto 1f6
      // 1f2: invokestatic fcs.a (Loov;)Loov;
      // 1f5: athrow
      // 1f6: iload 3
      // 1f7: ifeq 249
      // 1fa: ifge 23e
      // 1fd: goto 204
      // 200: invokestatic fcs.a (Loov;)Loov;
      // 203: athrow
      // 204: bipush 0
      // 205: istore 5
      // 207: iload 5
      // 209: aload 0
      // 20a: getfield fcs._5e [[D
      // 20d: arraylength
      // 20e: if_icmpge 23e
      // 211: aload 0
      // 212: getfield fcs._5e [[D
      // 215: iload 5
      // 217: aaload
      // 218: bipush 0
      // 219: aload 0
      // 21a: getfield fcs.x5k F
      // 21d: f2d
      // 21e: dastore
      // 21f: aload 0
      // 220: getfield fcs._5e [[D
      // 223: iload 5
      // 225: aaload
      // 226: bipush 1
      // 227: aload 0
      // 228: getfield fcs.kfp D
      // 22b: dastore
      // 22c: iinc 5 1
      // 22f: iload 3
      // 230: ifeq 287
      // 233: iload 3
      // 234: ifne 207
      // 237: goto 23e
      // 23a: invokestatic fcs.a (Loov;)Loov;
      // 23d: athrow
      // 23e: aload 0
      // 23f: dup
      // 240: getfield fcs.yth I
      // 243: bipush 1
      // 244: iadd
      // 245: dup_x1
      // 246: putfield fcs.yth I
      // 249: iload 3
      // 24a: ifeq 299
      // 24d: aload 0
      // 24e: getfield fcs._5e [[D
      // 251: arraylength
      // 252: if_icmpne 268
      // 255: goto 25c
      // 258: invokestatic fcs.a (Loov;)Loov;
      // 25b: athrow
      // 25c: aload 0
      // 25d: bipush 0
      // 25e: putfield fcs.yth I
      // 261: goto 268
      // 264: invokestatic fcs.a (Loov;)Loov;
      // 267: athrow
      // 268: aload 0
      // 269: getfield fcs._5e [[D
      // 26c: aload 0
      // 26d: getfield fcs.yth I
      // 270: aaload
      // 271: bipush 0
      // 272: aload 0
      // 273: getfield fcs.x5k F
      // 276: f2d
      // 277: dastore
      // 278: aload 0
      // 279: getfield fcs._5e [[D
      // 27c: aload 0
      // 27d: getfield fcs.yth I
      // 280: aaload
      // 281: bipush 1
      // 282: aload 0
      // 283: getfield fcs.kfp D
      // 286: dastore
      // 287: aload 0
      // 288: iload 3
      // 289: ifeq 360
      // 28c: getfield fcs.oay Lt9d;
      // 28f: getfield t9d.v0f Z
      // 292: goto 299
      // 295: invokestatic fcs.a (Loov;)Loov;
      // 298: athrow
      // 299: ifeq 358
      // 29c: aload 0
      // 29d: iload 3
      // 29e: ifeq 7bf
      // 2a1: goto 2a8
      // 2a4: invokestatic fcs.a (Loov;)Loov;
      // 2a7: athrow
      // 2a8: getfield fcs.a1q I
      // 2ab: ifle 73a
      // 2ae: goto 2b5
      // 2b1: invokestatic fcs.a (Loov;)Loov;
      // 2b4: athrow
      // 2b5: aload 0
      // 2b6: getfield fcs.o2v D
      // 2b9: aload 0
      // 2ba: getfield fcs.sz4 D
      // 2bd: aload 0
      // 2be: getfield fcs.o2v D
      // 2c1: dsub
      // 2c2: aload 0
      // 2c3: getfield fcs.a1q I
      // 2c6: i2d
      // 2c7: ddiv
      // 2c8: dadd
      // 2c9: dstore 5
      // 2cb: aload 0
      // 2cc: getfield fcs.kfp D
      // 2cf: aload 0
      // 2d0: getfield fcs._y0 D
      // 2d3: aload 0
      // 2d4: getfield fcs.kfp D
      // 2d7: dsub
      // 2d8: aload 0
      // 2d9: getfield fcs.a1q I
      // 2dc: i2d
      // 2dd: ddiv
      // 2de: dadd
      // 2df: dstore 7
      // 2e1: aload 0
      // 2e2: getfield fcs.vbd D
      // 2e5: aload 0
      // 2e6: getfield fcs.hb4 D
      // 2e9: aload 0
      // 2ea: getfield fcs.vbd D
      // 2ed: dsub
      // 2ee: aload 0
      // 2ef: getfield fcs.a1q I
      // 2f2: i2d
      // 2f3: ddiv
      // 2f4: dadd
      // 2f5: dstore 9
      // 2f7: aload 0
      // 2f8: getfield fcs.e7t D
      // 2fb: aload 0
      // 2fc: getfield fcs.x5k F
      // 2ff: f2d
      // 300: dsub
      // 301: invokestatic fe6.lrs (D)D
      // 304: dstore 11
      // 306: aload 0
      // 307: aload 0
      // 308: getfield fcs.x5k F
      // 30b: f2d
      // 30c: dload 11
      // 30e: aload 0
      // 30f: getfield fcs.a1q I
      // 312: i2d
      // 313: ddiv
      // 314: dadd
      // 315: d2f
      // 316: putfield fcs.x5k F
      // 319: aload 0
      // 31a: aload 0
      // 31b: getfield fcs.y2i F
      // 31e: f2d
      // 31f: aload 0
      // 320: getfield fcs.bxw D
      // 323: aload 0
      // 324: getfield fcs.y2i F
      // 327: f2d
      // 328: dsub
      // 329: aload 0
      // 32a: getfield fcs.a1q I
      // 32d: i2d
      // 32e: ddiv
      // 32f: dadd
      // 330: d2f
      // 331: putfield fcs.y2i F
      // 334: aload 0
      // 335: dup
      // 336: getfield fcs.a1q I
      // 339: bipush 1
      // 33a: isub
      // 33b: putfield fcs.a1q I
      // 33e: aload 0
      // 33f: dload 5
      // 341: dload 7
      // 343: dload 9
      // 345: invokevirtual fcs.m6_ (DDD)V
      // 348: aload 0
      // 349: aload 0
      // 34a: getfield fcs.x5k F
      // 34d: aload 0
      // 34e: getfield fcs.y2i F
      // 351: invokevirtual fcs.iym (FF)V
      // 354: iload 3
      // 355: ifne 73a
      // 358: aload 0
      // 359: goto 360
      // 35c: invokestatic fcs.a (Loov;)Loov;
      // 35f: athrow
      // 360: getfield fcs.jht D
      // 363: aload 0
      // 364: getfield fcs.o2v D
      // 367: dsub
      // 368: dstore 5
      // 36a: aload 0
      // 36b: getfield fcs.dv9 D
      // 36e: aload 0
      // 36f: getfield fcs.kfp D
      // 372: dsub
      // 373: dstore 7
      // 375: aload 0
      // 376: getfield fcs.kyz D
      // 379: aload 0
      // 37a: getfield fcs.vbd D
      // 37d: dsub
      // 37e: dstore 9
      // 380: dload 5
      // 382: dload 5
      // 384: dmul
      // 385: dload 7
      // 387: dload 7
      // 389: dmul
      // 38a: dadd
      // 38b: dload 9
      // 38d: dload 9
      // 38f: dmul
      // 390: dadd
      // 391: dstore 11
      // 393: aload 0
      // 394: iload 3
      // 395: ifeq 439
      // 398: getfield fcs.hoo Li2h;
      // 39b: ifnull 41d
      // 39e: goto 3a5
      // 3a1: invokestatic fcs.a (Loov;)Loov;
      // 3a4: athrow
      // 3a5: aload 0
      // 3a6: aload 0
      // 3a7: getfield fcs.hoo Li2h;
      // 3aa: getfield i2h.o2v D
      // 3ad: putfield fcs.jht D
      // 3b0: aload 0
      // 3b1: aload 0
      // 3b2: getfield fcs.hoo Li2h;
      // 3b5: getfield i2h.vbd D
      // 3b8: putfield fcs.kyz D
      // 3bb: aload 0
      // 3bc: getfield fcs.jht D
      // 3bf: aload 0
      // 3c0: getfield fcs.o2v D
      // 3c3: dsub
      // 3c4: dstore 13
      // 3c6: aload 0
      // 3c7: getfield fcs.kyz D
      // 3ca: aload 0
      // 3cb: getfield fcs.vbd D
      // 3ce: dsub
      // 3cf: dstore 15
      // 3d1: dload 13
      // 3d3: dload 13
      // 3d5: dmul
      // 3d6: dload 15
      // 3d8: dload 15
      // 3da: dmul
      // 3db: dadd
      // 3dc: invokestatic java/lang/Math.sqrt (D)D
      // 3df: dstore 17
      // 3e1: ldc2_w 0.4000000059604645
      // 3e4: dload 17
      // 3e6: ldc2_w 80.0
      // 3e9: ddiv
      // 3ea: dadd
      // 3eb: dconst_1
      // 3ec: dsub
      // 3ed: dstore 19
      // 3ef: iload 3
      // 3f0: ifeq 419
      // 3f3: dload 19
      // 3f5: ldc2_w 10.0
      // 3f8: dcmpl
      // 3f9: ifle 408
      // 3fc: goto 403
      // 3ff: invokestatic fcs.a (Loov;)Loov;
      // 402: athrow
      // 403: ldc2_w 10.0
      // 406: dstore 19
      // 408: aload 0
      // 409: aload 0
      // 40a: getfield fcs.hoo Li2h;
      // 40d: invokevirtual i2h.aaw ()Lnh4;
      // 410: getfield nh4.bx_ D
      // 413: dload 19
      // 415: dadd
      // 416: putfield fcs.dv9 D
      // 419: iload 3
      // 41a: ifne 44c
      // 41d: aload 0
      // 41e: dup
      // 41f: getfield fcs.jht D
      // 422: aload 0
      // 423: getfield fcs.z2d Ljava/util/Random;
      // 426: invokevirtual java/util/Random.nextGaussian ()D
      // 429: ldc2_w 2.0
      // 42c: dmul
      // 42d: dadd
      // 42e: putfield fcs.jht D
      // 431: aload 0
      // 432: goto 439
      // 435: invokestatic fcs.a (Loov;)Loov;
      // 438: athrow
      // 439: dup
      // 43a: getfield fcs.kyz D
      // 43d: aload 0
      // 43e: getfield fcs.z2d Ljava/util/Random;
      // 441: invokevirtual java/util/Random.nextGaussian ()D
      // 444: ldc2_w 2.0
      // 447: dmul
      // 448: dadd
      // 449: putfield fcs.kyz D
      // 44c: aload 0
      // 44d: iload 3
      // 44e: ifeq 4ce
      // 451: getfield fcs.ut4 Z
      // 454: ifne 4c6
      // 457: goto 45e
      // 45a: invokestatic fcs.a (Loov;)Loov;
      // 45d: athrow
      // 45e: dload 11
      // 460: ldc2_w 100.0
      // 463: dcmpg
      // 464: iload 3
      // 465: ifeq 486
      // 468: goto 46f
      // 46b: invokestatic fcs.a (Loov;)Loov;
      // 46e: athrow
      // 46f: iflt 4c6
      // 472: goto 479
      // 475: invokestatic fcs.a (Loov;)Loov;
      // 478: athrow
      // 479: dload 11
      // 47b: ldc2_w 22500.0
      // 47e: dcmpl
      // 47f: goto 486
      // 482: invokestatic fcs.a (Loov;)Loov;
      // 485: athrow
      // 486: iload 3
      // 487: ifeq 4aa
      // 48a: ifgt 4c6
      // 48d: goto 494
      // 490: invokestatic fcs.a (Loov;)Loov;
      // 493: athrow
      // 494: aload 0
      // 495: iload 3
      // 496: ifeq 4ce
      // 499: goto 4a0
      // 49c: invokestatic fcs.a (Loov;)Loov;
      // 49f: athrow
      // 4a0: getfield fcs.cbi Z
      // 4a3: goto 4aa
      // 4a6: invokestatic fcs.a (Loov;)Loov;
      // 4a9: athrow
      // 4aa: ifne 4c6
      // 4ad: aload 0
      // 4ae: iload 3
      // 4af: ifeq 4ce
      // 4b2: goto 4b9
      // 4b5: invokestatic fcs.a (Loov;)Loov;
      // 4b8: athrow
      // 4b9: getfield fcs.fcv Z
      // 4bc: ifeq 4d1
      // 4bf: goto 4c6
      // 4c2: invokestatic fcs.a (Loov;)Loov;
      // 4c5: athrow
      // 4c6: aload 0
      // 4c7: goto 4ce
      // 4ca: invokestatic fcs.a (Loov;)Loov;
      // 4cd: athrow
      // 4ce: invokespecial fcs.k4d ()V
      // 4d1: dload 7
      // 4d3: dload 5
      // 4d5: dload 5
      // 4d7: dmul
      // 4d8: dload 9
      // 4da: dload 9
      // 4dc: dmul
      // 4dd: dadd
      // 4de: invokestatic fe6.dii (D)F
      // 4e1: f2d
      // 4e2: ddiv
      // 4e3: dstore 7
      // 4e5: ldc 0.6
      // 4e7: nop
      // 4e8: fstore 13
      // 4ea: dload 7
      // 4ec: fload 13
      // 4ee: fneg
      // 4ef: f2d
      // 4f0: fload 13
      // 4f2: f2d
      // 4f3: invokestatic fe6.lft (DDD)D
      // 4f6: dstore 7
      // 4f8: aload 0
      // 4f9: dup
      // 4fa: getfield fcs.mop D
      // 4fd: dload 7
      // 4ff: ldc2_w 0.10000000149011612
      // 502: dmul
      // 503: dadd
      // 504: putfield fcs.mop D
      // 507: aload 0
      // 508: aload 0
      // 509: getfield fcs.x5k F
      // 50c: invokestatic fe6.qsy (F)F
      // 50f: putfield fcs.x5k F
      // 512: ldc2_w 180.0
      // 515: dload 5
      // 517: dload 9
      // 519: invokestatic fe6.yr8 (DD)D
      // 51c: ldc2_w 180.0
      // 51f: dmul
      // 520: ldc2_w 3.141592653589793
      // 523: ddiv
      // 524: dsub
      // 525: dstore 14
      // 527: dload 14
      // 529: aload 0
      // 52a: getfield fcs.x5k F
      // 52d: f2d
      // 52e: dsub
      // 52f: invokestatic fe6.lrs (D)D
      // 532: dstore 16
      // 534: dload 16
      // 536: ldc2_w 50.0
      // 539: dcmpl
      // 53a: iload 3
      // 53b: ifeq 55e
      // 53e: ifle 54d
      // 541: goto 548
      // 544: invokestatic fcs.a (Loov;)Loov;
      // 547: athrow
      // 548: ldc2_w 50.0
      // 54b: dstore 16
      // 54d: dload 16
      // 54f: iload 3
      // 550: ifeq 564
      // 553: ldc2_w -50.0
      // 556: dcmpg
      // 557: goto 55e
      // 55a: invokestatic fcs.a (Loov;)Loov;
      // 55d: athrow
      // 55e: ifge 566
      // 561: ldc2_w -50.0
      // 564: dstore 16
      // 566: new fqr
      // 569: dup
      // 56a: aload 0
      // 56b: getfield fcs.jht D
      // 56e: aload 0
      // 56f: getfield fcs.o2v D
      // 572: dsub
      // 573: aload 0
      // 574: getfield fcs.dv9 D
      // 577: aload 0
      // 578: getfield fcs.kfp D
      // 57b: dsub
      // 57c: aload 0
      // 57d: getfield fcs.kyz D
      // 580: aload 0
      // 581: getfield fcs.vbd D
      // 584: dsub
      // 585: invokespecial fqr.<init> (DDD)V
      // 588: invokevirtual fqr.kec ()Lfqr;
      // 58b: astore 18
      // 58d: aload 0
      // 58e: getfield fcs.x5k F
      // 591: ldc 3.1415927
      // 593: nop
      // 594: fmul
      // 595: ldc 180.0
      // 597: nop
      // 598: fdiv
      // 599: invokestatic fe6.ssk (F)F
      // 59c: fneg
      // 59d: f2d
      // 59e: dstore 19
      // 5a0: new fqr
      // 5a3: dup
      // 5a4: aload 0
      // 5a5: getfield fcs.x5k F
      // 5a8: ldc 3.1415927
      // 5aa: nop
      // 5ab: fmul
      // 5ac: ldc 180.0
      // 5ae: nop
      // 5af: fdiv
      // 5b0: invokestatic fe6.rtn (F)F
      // 5b3: f2d
      // 5b4: aload 0
      // 5b5: getfield fcs.mop D
      // 5b8: dload 19
      // 5ba: invokespecial fqr.<init> (DDD)V
      // 5bd: invokevirtual fqr.kec ()Lfqr;
      // 5c0: astore 21
      // 5c2: aload 21
      // 5c4: aload 18
      // 5c6: invokevirtual fqr.xvl (Lfqr;)D
      // 5c9: d2f
      // 5ca: ldc 0.5
      // 5cc: nop
      // 5cd: fadd
      // 5ce: ldc 1.5
      // 5d0: nop
      // 5d1: fdiv
      // 5d2: fstore 22
      // 5d4: fload 22
      // 5d6: fconst_0
      // 5d7: iload 3
      // 5d8: ifeq 60e
      // 5db: fcmpg
      // 5dc: ifge 5e9
      // 5df: goto 5e6
      // 5e2: invokestatic fcs.a (Loov;)Loov;
      // 5e5: athrow
      // 5e6: fconst_0
      // 5e7: fstore 22
      // 5e9: aload 0
      // 5ea: dup
      // 5eb: getfield fcs.czx F
      // 5ee: ldc 0.8
      // 5f0: nop
      // 5f1: fmul
      // 5f2: putfield fcs.czx F
      // 5f5: aload 0
      // 5f6: getfield fcs.icv D
      // 5f9: aload 0
      // 5fa: getfield fcs.icv D
      // 5fd: dmul
      // 5fe: aload 0
      // 5ff: getfield fcs.bw4 D
      // 602: aload 0
      // 603: getfield fcs.bw4 D
      // 606: dmul
      // 607: dadd
      // 608: invokestatic fe6.dii (D)F
      // 60b: fconst_1
      // 60c: fmul
      // 60d: fconst_1
      // 60e: fadd
      // 60f: fstore 23
      // 611: aload 0
      // 612: getfield fcs.icv D
      // 615: aload 0
      // 616: getfield fcs.icv D
      // 619: dmul
      // 61a: aload 0
      // 61b: getfield fcs.bw4 D
      // 61e: aload 0
      // 61f: getfield fcs.bw4 D
      // 622: dmul
      // 623: dadd
      // 624: invokestatic java/lang/Math.sqrt (D)D
      // 627: dconst_1
      // 628: dmul
      // 629: dconst_1
      // 62a: dadd
      // 62b: dstore 24
      // 62d: dload 24
      // 62f: ldc2_w 40.0
      // 632: iload 3
      // 633: ifeq 676
      // 636: dcmpl
      // 637: ifle 646
      // 63a: goto 641
      // 63d: invokestatic fcs.a (Loov;)Loov;
      // 640: athrow
      // 641: ldc2_w 40.0
      // 644: dstore 24
      // 646: aload 0
      // 647: aload 0
      // 648: getfield fcs.czx F
      // 64b: f2d
      // 64c: dload 16
      // 64e: ldc2_w 0.699999988079071
      // 651: dload 24
      // 653: ddiv
      // 654: fload 23
      // 656: f2d
      // 657: ddiv
      // 658: dmul
      // 659: dadd
      // 65a: d2f
      // 65b: putfield fcs.czx F
      // 65e: aload 0
      // 65f: dup
      // 660: getfield fcs.x5k F
      // 663: aload 0
      // 664: getfield fcs.czx F
      // 667: ldc 0.1
      // 669: nop
      // 66a: fmul
      // 66b: fadd
      // 66c: putfield fcs.x5k F
      // 66f: ldc2_w 2.0
      // 672: dload 24
      // 674: dconst_1
      // 675: dadd
      // 676: ddiv
      // 677: d2f
      // 678: fstore 26
      // 67a: ldc 0.06
      // 67c: nop
      // 67d: fstore 27
      // 67f: aload 0
      // 680: fconst_0
      // 681: ldc -1.0
      // 683: nop
      // 684: fload 27
      // 686: fload 22
      // 688: fload 26
      // 68a: fmul
      // 68b: fconst_1
      // 68c: fload 26
      // 68e: fsub
      // 68f: fadd
      // 690: fmul
      // 691: invokevirtual fcs.r4r (FFF)V
      // 694: aload 0
      // 695: iload 3
      // 696: ifeq 6d5
      // 699: getfield fcs.xsa Z
      // 69c: ifeq 6cd
      // 69f: goto 6a6
      // 6a2: invokestatic fcs.a (Loov;)Loov;
      // 6a5: athrow
      // 6a6: aload 0
      // 6a7: aload 0
      // 6a8: getfield fcs.icv D
      // 6ab: ldc2_w 0.800000011920929
      // 6ae: dmul
      // 6af: aload 0
      // 6b0: getfield fcs.mop D
      // 6b3: ldc2_w 0.800000011920929
      // 6b6: dmul
      // 6b7: aload 0
      // 6b8: getfield fcs.bw4 D
      // 6bb: ldc2_w 0.800000011920929
      // 6be: dmul
      // 6bf: invokevirtual fcs.vjj (DDD)V
      // 6c2: iload 3
      // 6c3: ifne 6e4
      // 6c6: goto 6cd
      // 6c9: invokestatic fcs.a (Loov;)Loov;
      // 6cc: athrow
      // 6cd: aload 0
      // 6ce: goto 6d5
      // 6d1: invokestatic fcs.a (Loov;)Loov;
      // 6d4: athrow
      // 6d5: aload 0
      // 6d6: getfield fcs.icv D
      // 6d9: aload 0
      // 6da: getfield fcs.mop D
      // 6dd: aload 0
      // 6de: getfield fcs.bw4 D
      // 6e1: invokevirtual fcs.vjj (DDD)V
      // 6e4: new fqr
      // 6e7: dup
      // 6e8: aload 0
      // 6e9: getfield fcs.icv D
      // 6ec: aload 0
      // 6ed: getfield fcs.mop D
      // 6f0: aload 0
      // 6f1: getfield fcs.bw4 D
      // 6f4: invokespecial fqr.<init> (DDD)V
      // 6f7: invokevirtual fqr.kec ()Lfqr;
      // 6fa: astore 28
      // 6fc: aload 28
      // 6fe: aload 21
      // 700: invokevirtual fqr.xvl (Lfqr;)D
      // 703: d2f
      // 704: fconst_1
      // 705: fadd
      // 706: fconst_2
      // 707: fdiv
      // 708: fstore 29
      // 70a: ldc 0.8
      // 70c: nop
      // 70d: ldc 0.15
      // 70f: nop
      // 710: fload 29
      // 712: fmul
      // 713: fadd
      // 714: fstore 29
      // 716: aload 0
      // 717: dup
      // 718: getfield fcs.icv D
      // 71b: fload 29
      // 71d: f2d
      // 71e: dmul
      // 71f: putfield fcs.icv D
      // 722: aload 0
      // 723: dup
      // 724: getfield fcs.bw4 D
      // 727: fload 29
      // 729: f2d
      // 72a: dmul
      // 72b: putfield fcs.bw4 D
      // 72e: aload 0
      // 72f: dup
      // 730: getfield fcs.mop D
      // 733: ldc2_w 0.9100000262260437
      // 736: dmul
      // 737: putfield fcs.mop D
      // 73a: aload 0
      // 73b: aload 0
      // 73c: getfield fcs.x5k F
      // 73f: putfield fcs.ksw F
      // 742: aload 0
      // 743: getfield fcs.tpz Lpq1;
      // 746: aload 0
      // 747: getfield fcs.tpz Lpq1;
      // 74a: ldc 3.0
      // 74c: nop
      // 74d: dup_x1
      // 74e: putfield pq1.ikl F
      // 751: putfield pq1.uo6 F
      // 754: aload 0
      // 755: getfield fcs.d78 Lpq1;
      // 758: aload 0
      // 759: getfield fcs.d78 Lpq1;
      // 75c: fconst_2
      // 75d: dup_x1
      // 75e: putfield pq1.ikl F
      // 761: putfield pq1.uo6 F
      // 764: aload 0
      // 765: getfield fcs.j_b Lpq1;
      // 768: aload 0
      // 769: getfield fcs.j_b Lpq1;
      // 76c: fconst_2
      // 76d: dup_x1
      // 76e: putfield pq1.ikl F
      // 771: putfield pq1.uo6 F
      // 774: aload 0
      // 775: getfield fcs.cbh Lpq1;
      // 778: aload 0
      // 779: getfield fcs.cbh Lpq1;
      // 77c: fconst_2
      // 77d: dup_x1
      // 77e: putfield pq1.ikl F
      // 781: putfield pq1.uo6 F
      // 784: aload 0
      // 785: getfield fcs.s6p Lpq1;
      // 788: ldc 3.0
      // 78a: nop
      // 78b: putfield pq1.ikl F
      // 78e: aload 0
      // 78f: getfield fcs.s6p Lpq1;
      // 792: ldc 5.0
      // 794: nop
      // 795: putfield pq1.uo6 F
      // 798: aload 0
      // 799: getfield fcs.nqn Lpq1;
      // 79c: fconst_2
      // 79d: putfield pq1.ikl F
      // 7a0: aload 0
      // 7a1: getfield fcs.nqn Lpq1;
      // 7a4: ldc 4.0
      // 7a6: nop
      // 7a7: putfield pq1.uo6 F
      // 7aa: aload 0
      // 7ab: getfield fcs.zjj Lpq1;
      // 7ae: ldc 3.0
      // 7b0: nop
      // 7b1: putfield pq1.ikl F
      // 7b4: aload 0
      // 7b5: getfield fcs.zjj Lpq1;
      // 7b8: ldc 4.0
      // 7ba: nop
      // 7bb: putfield pq1.uo6 F
      // 7be: aload 0
      // 7bf: bipush 5
      // 7c0: fconst_1
      // 7c1: invokevirtual fcs.gv2 (IF)[D
      // 7c4: bipush 1
      // 7c5: daload
      // 7c6: aload 0
      // 7c7: bipush 10
      // 7c9: fconst_1
      // 7ca: invokevirtual fcs.gv2 (IF)[D
      // 7cd: bipush 1
      // 7ce: daload
      // 7cf: dsub
      // 7d0: d2f
      // 7d1: ldc 10.0
      // 7d3: nop
      // 7d4: fmul
      // 7d5: ldc 180.0
      // 7d7: nop
      // 7d8: fdiv
      // 7d9: ldc 3.1415927
      // 7db: nop
      // 7dc: fmul
      // 7dd: fstore 5
      // 7df: fload 5
      // 7e1: invokestatic fe6.ssk (F)F
      // 7e4: fstore 6
      // 7e6: fload 5
      // 7e8: invokestatic fe6.rtn (F)F
      // 7eb: fneg
      // 7ec: fstore 7
      // 7ee: aload 0
      // 7ef: getfield fcs.x5k F
      // 7f2: ldc 3.1415927
      // 7f4: nop
      // 7f5: fmul
      // 7f6: ldc 180.0
      // 7f8: nop
      // 7f9: fdiv
      // 7fa: fstore 8
      // 7fc: fload 8
      // 7fe: invokestatic fe6.rtn (F)F
      // 801: fstore 9
      // 803: fload 8
      // 805: invokestatic fe6.ssk (F)F
      // 808: fstore 10
      // 80a: aload 0
      // 80b: getfield fcs.s6p Lpq1;
      // 80e: invokevirtual pq1.xx_ ()V
      // 811: aload 0
      // 812: getfield fcs.s6p Lpq1;
      // 815: aload 0
      // 816: getfield fcs.o2v D
      // 819: fload 9
      // 81b: ldc 0.5
      // 81d: nop
      // 81e: fmul
      // 81f: f2d
      // 820: dadd
      // 821: aload 0
      // 822: getfield fcs.kfp D
      // 825: aload 0
      // 826: getfield fcs.vbd D
      // 829: fload 10
      // 82b: ldc 0.5
      // 82d: nop
      // 82e: fmul
      // 82f: f2d
      // 830: dsub
      // 831: fconst_0
      // 832: fconst_0
      // 833: invokevirtual pq1.x24 (DDDFF)V
      // 836: aload 0
      // 837: getfield fcs.nqn Lpq1;
      // 83a: invokevirtual pq1.xx_ ()V
      // 83d: aload 0
      // 83e: getfield fcs.nqn Lpq1;
      // 841: aload 0
      // 842: getfield fcs.o2v D
      // 845: fload 10
      // 847: ldc 4.5
      // 849: nop
      // 84a: fmul
      // 84b: f2d
      // 84c: dadd
      // 84d: aload 0
      // 84e: getfield fcs.kfp D
      // 851: ldc2_w 2.0
      // 854: dadd
      // 855: aload 0
      // 856: getfield fcs.vbd D
      // 859: fload 9
      // 85b: ldc 4.5
      // 85d: nop
      // 85e: fmul
      // 85f: f2d
      // 860: dadd
      // 861: fconst_0
      // 862: fconst_0
      // 863: invokevirtual pq1.x24 (DDDFF)V
      // 866: aload 0
      // 867: getfield fcs.zjj Lpq1;
      // 86a: invokevirtual pq1.xx_ ()V
      // 86d: aload 0
      // 86e: getfield fcs.zjj Lpq1;
      // 871: aload 0
      // 872: getfield fcs.o2v D
      // 875: fload 10
      // 877: ldc 4.5
      // 879: nop
      // 87a: fmul
      // 87b: f2d
      // 87c: dsub
      // 87d: aload 0
      // 87e: getfield fcs.kfp D
      // 881: ldc2_w 2.0
      // 884: dadd
      // 885: aload 0
      // 886: getfield fcs.vbd D
      // 889: fload 9
      // 88b: ldc 4.5
      // 88d: nop
      // 88e: fmul
      // 88f: f2d
      // 890: dsub
      // 891: fconst_0
      // 892: fconst_0
      // 893: invokevirtual pq1.x24 (DDDFF)V
      // 896: aload 0
      // 897: iload 3
      // 898: ifeq 933
      // 89b: getfield fcs.oay Lt9d;
      // 89e: getfield t9d.v0f Z
      // 8a1: ifne 932
      // 8a4: goto 8ab
      // 8a7: invokestatic fcs.a (Loov;)Loov;
      // 8aa: athrow
      // 8ab: aload 0
      // 8ac: iload 3
      // 8ad: ifeq 933
      // 8b0: goto 8b7
      // 8b3: invokestatic fcs.a (Loov;)Loov;
      // 8b6: athrow
      // 8b7: getfield fcs.gx0 I
      // 8ba: ifne 932
      // 8bd: goto 8c4
      // 8c0: invokestatic fcs.a (Loov;)Loov;
      // 8c3: athrow
      // 8c4: aload 0
      // 8c5: aload 0
      // 8c6: getfield fcs.oay Lt9d;
      // 8c9: aload 0
      // 8ca: aload 0
      // 8cb: getfield fcs.nqn Lpq1;
      // 8ce: invokevirtual pq1.aaw ()Lnh4;
      // 8d1: ldc2_w 4.0
      // 8d4: ldc2_w 2.0
      // 8d7: ldc2_w 4.0
      // 8da: invokevirtual nh4.c2h (DDD)Lnh4;
      // 8dd: dconst_0
      // 8de: ldc2_w -2.0
      // 8e1: dconst_0
      // 8e2: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 8e5: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 8e8: invokespecial fcs.kzp (Ljava/util/List;)V
      // 8eb: aload 0
      // 8ec: aload 0
      // 8ed: getfield fcs.oay Lt9d;
      // 8f0: aload 0
      // 8f1: aload 0
      // 8f2: getfield fcs.zjj Lpq1;
      // 8f5: invokevirtual pq1.aaw ()Lnh4;
      // 8f8: ldc2_w 4.0
      // 8fb: ldc2_w 2.0
      // 8fe: ldc2_w 4.0
      // 901: invokevirtual nh4.c2h (DDD)Lnh4;
      // 904: dconst_0
      // 905: ldc2_w -2.0
      // 908: dconst_0
      // 909: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 90c: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 90f: invokespecial fcs.kzp (Ljava/util/List;)V
      // 912: aload 0
      // 913: aload 0
      // 914: getfield fcs.oay Lt9d;
      // 917: aload 0
      // 918: aload 0
      // 919: getfield fcs.tpz Lpq1;
      // 91c: invokevirtual pq1.aaw ()Lnh4;
      // 91f: dconst_1
      // 920: dconst_1
      // 921: dconst_1
      // 922: invokevirtual nh4.c2h (DDD)Lnh4;
      // 925: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 928: invokespecial fcs.uuz (Ljava/util/List;)V
      // 92b: goto 932
      // 92e: invokestatic fcs.a (Loov;)Loov;
      // 931: athrow
      // 932: aload 0
      // 933: bipush 5
      // 934: fconst_1
      // 935: invokevirtual fcs.gv2 (IF)[D
      // 938: astore 11
      // 93a: aload 0
      // 93b: bipush 0
      // 93c: fconst_1
      // 93d: invokevirtual fcs.gv2 (IF)[D
      // 940: astore 12
      // 942: aload 0
      // 943: getfield fcs.x5k F
      // 946: ldc 3.1415927
      // 948: nop
      // 949: fmul
      // 94a: ldc 180.0
      // 94c: nop
      // 94d: fdiv
      // 94e: aload 0
      // 94f: getfield fcs.czx F
      // 952: ldc 0.01
      // 954: nop
      // 955: fmul
      // 956: fsub
      // 957: invokestatic fe6.rtn (F)F
      // 95a: fstore 13
      // 95c: aload 0
      // 95d: getfield fcs.x5k F
      // 960: ldc 3.1415927
      // 962: nop
      // 963: fmul
      // 964: ldc 180.0
      // 966: nop
      // 967: fdiv
      // 968: aload 0
      // 969: getfield fcs.czx F
      // 96c: ldc 0.01
      // 96e: nop
      // 96f: fmul
      // 970: fsub
      // 971: invokestatic fe6.ssk (F)F
      // 974: fstore 14
      // 976: aload 0
      // 977: getfield fcs.tpz Lpq1;
      // 97a: invokevirtual pq1.xx_ ()V
      // 97d: aload 0
      // 97e: getfield fcs.tpz Lpq1;
      // 981: aload 0
      // 982: getfield fcs.o2v D
      // 985: fload 13
      // 987: ldc 5.5
      // 989: nop
      // 98a: fmul
      // 98b: fload 6
      // 98d: fmul
      // 98e: f2d
      // 98f: dadd
      // 990: aload 0
      // 991: getfield fcs.kfp D
      // 994: aload 12
      // 996: bipush 1
      // 997: daload
      // 998: aload 11
      // 99a: bipush 1
      // 99b: daload
      // 99c: dsub
      // 99d: dconst_1
      // 99e: dmul
      // 99f: dadd
      // 9a0: fload 7
      // 9a2: ldc 5.5
      // 9a4: nop
      // 9a5: fmul
      // 9a6: f2d
      // 9a7: dadd
      // 9a8: aload 0
      // 9a9: getfield fcs.vbd D
      // 9ac: fload 14
      // 9ae: ldc 5.5
      // 9b0: nop
      // 9b1: fmul
      // 9b2: fload 6
      // 9b4: fmul
      // 9b5: f2d
      // 9b6: dsub
      // 9b7: fconst_0
      // 9b8: fconst_0
      // 9b9: invokevirtual pq1.x24 (DDDFF)V
      // 9bc: bipush 0
      // 9bd: istore 15
      // 9bf: iload 15
      // 9c1: bipush 3
      // 9c2: if_icmpge aaa
      // 9c5: aconst_null
      // 9c6: astore 16
      // 9c8: iload 15
      // 9ca: iload 3
      // 9cb: ifeq abc
      // 9ce: ifne 9de
      // 9d1: goto 9d8
      // 9d4: invokestatic fcs.a (Loov;)Loov;
      // 9d7: athrow
      // 9d8: aload 0
      // 9d9: getfield fcs.d78 Lpq1;
      // 9dc: astore 16
      // 9de: iload 15
      // 9e0: bipush 1
      // 9e1: iload 3
      // 9e2: ifeq 9f8
      // 9e5: if_icmpne 9f5
      // 9e8: goto 9ef
      // 9eb: invokestatic fcs.a (Loov;)Loov;
      // 9ee: athrow
      // 9ef: aload 0
      // 9f0: getfield fcs.j_b Lpq1;
      // 9f3: astore 16
      // 9f5: iload 15
      // 9f7: bipush 2
      // 9f8: if_icmpne a01
      // 9fb: aload 0
      // 9fc: getfield fcs.cbh Lpq1;
      // 9ff: astore 16
      // a01: aload 0
      // a02: bipush 12
      // a04: iload 15
      // a06: bipush 2
      // a07: imul
      // a08: iadd
      // a09: fconst_1
      // a0a: invokevirtual fcs.gv2 (IF)[D
      // a0d: astore 17
      // a0f: aload 0
      // a10: getfield fcs.x5k F
      // a13: ldc 3.1415927
      // a15: nop
      // a16: fmul
      // a17: ldc 180.0
      // a19: nop
      // a1a: fdiv
      // a1b: aload 0
      // a1c: aload 17
      // a1e: bipush 0
      // a1f: daload
      // a20: aload 11
      // a22: bipush 0
      // a23: daload
      // a24: dsub
      // a25: invokespecial fcs.wui (D)F
      // a28: ldc 3.1415927
      // a2a: nop
      // a2b: fmul
      // a2c: ldc 180.0
      // a2e: nop
      // a2f: fdiv
      // a30: fconst_1
      // a31: fmul
      // a32: fadd
      // a33: fstore 18
      // a35: fload 18
      // a37: invokestatic fe6.rtn (F)F
      // a3a: fstore 19
      // a3c: fload 18
      // a3e: invokestatic fe6.ssk (F)F
      // a41: fstore 20
      // a43: ldc 1.5
      // a45: nop
      // a46: fstore 21
      // a48: iload 15
      // a4a: bipush 1
      // a4b: iadd
      // a4c: i2f
      // a4d: fconst_2
      // a4e: fmul
      // a4f: fstore 22
      // a51: aload 16
      // a53: invokevirtual pq1.xx_ ()V
      // a56: aload 16
      // a58: aload 0
      // a59: getfield fcs.o2v D
      // a5c: fload 9
      // a5e: fload 21
      // a60: fmul
      // a61: fload 19
      // a63: fload 22
      // a65: fmul
      // a66: fadd
      // a67: fload 6
      // a69: fmul
      // a6a: f2d
      // a6b: dsub
      // a6c: aload 0
      // a6d: getfield fcs.kfp D
      // a70: aload 17
      // a72: bipush 1
      // a73: daload
      // a74: aload 11
      // a76: bipush 1
      // a77: daload
      // a78: dsub
      // a79: dconst_1
      // a7a: dmul
      // a7b: dadd
      // a7c: fload 22
      // a7e: fload 21
      // a80: fadd
      // a81: fload 7
      // a83: fmul
      // a84: f2d
      // a85: dsub
      // a86: ldc2_w 1.5
      // a89: dadd
      // a8a: aload 0
      // a8b: getfield fcs.vbd D
      // a8e: fload 10
      // a90: fload 21
      // a92: fmul
      // a93: fload 20
      // a95: fload 22
      // a97: fmul
      // a98: fadd
      // a99: fload 6
      // a9b: fmul
      // a9c: f2d
      // a9d: dadd
      // a9e: fconst_0
      // a9f: fconst_0
      // aa0: invokevirtual pq1.x24 (DDDFF)V
      // aa3: iinc 15 1
      // aa6: iload 3
      // aa7: ifne 9bf
      // aaa: aload 0
      // aab: iload 3
      // aac: ifeq ac0
      // aaf: getfield fcs.oay Lt9d;
      // ab2: getfield t9d.v0f Z
      // ab5: goto abc
      // ab8: invokestatic fcs.a (Loov;)Loov;
      // abb: athrow
      // abc: ifne ada
      // abf: aload 0
      // ac0: aload 0
      // ac1: aload 0
      // ac2: getfield fcs.tpz Lpq1;
      // ac5: invokevirtual pq1.aaw ()Lnh4;
      // ac8: invokespecial fcs.l0x (Lnh4;)Z
      // acb: aload 0
      // acc: aload 0
      // acd: getfield fcs.s6p Lpq1;
      // ad0: invokevirtual pq1.aaw ()Lnh4;
      // ad3: invokespecial fcs.l0x (Lnh4;)Z
      // ad6: ior
      // ad7: putfield fcs.xsa Z
      // ada: return
   }

   private void dwa() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifeq 0bd
      // 009: getfield fcs.xs_ Ledl;
      // 00c: ifnull 0bc
      // 00f: goto 016
      // 012: invokestatic fcs.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: getfield fcs.xs_ Ledl;
      // 01a: getfield edl.ma9 Z
      // 01d: iload 1
      // 01e: ifeq 07f
      // 021: goto 028
      // 024: invokestatic fcs.a (Loov;)Loov;
      // 027: athrow
      // 028: ifeq 071
      // 02b: goto 032
      // 02e: invokestatic fcs.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: iload 1
      // 034: ifeq 069
      // 037: goto 03e
      // 03a: invokestatic fcs.a (Loov;)Loov;
      // 03d: athrow
      // 03e: getfield fcs.oay Lt9d;
      // 041: getfield t9d.v0f Z
      // 044: ifne 068
      // 047: goto 04e
      // 04a: invokestatic fcs.a (Loov;)Loov;
      // 04d: athrow
      // 04e: aload 0
      // 04f: aload 0
      // 050: getfield fcs.tpz Lpq1;
      // 053: aconst_null
      // 054: checkcast vu6
      // 057: invokestatic ofh.siu (Lvu6;)Lofh;
      // 05a: ldc 10.0
      // 05c: nop
      // 05d: invokevirtual fcs.ojr (Lpq1;Lofh;F)Z
      // 060: pop
      // 061: goto 068
      // 064: invokestatic fcs.a (Loov;)Loov;
      // 067: athrow
      // 068: aload 0
      // 069: aconst_null
      // 06a: putfield fcs.xs_ Ledl;
      // 06d: iload 1
      // 06e: ifne 0bc
      // 071: aload 0
      // 072: getfield fcs.g25 I
      // 075: bipush 10
      // 077: irem
      // 078: goto 07f
      // 07b: invokestatic fcs.a (Loov;)Loov;
      // 07e: athrow
      // 07f: iload 1
      // 080: ifeq 0c5
      // 083: ifne 0bc
      // 086: goto 08d
      // 089: invokestatic fcs.a (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 0
      // 08e: invokevirtual fcs.i55 ()F
      // 091: aload 0
      // 092: invokevirtual fcs.axb ()F
      // 095: fcmpg
      // 096: iload 1
      // 097: ifeq 0c5
      // 09a: goto 0a1
      // 09d: invokestatic fcs.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ifge 0bc
      // 0a4: goto 0ab
      // 0a7: invokestatic fcs.a (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 0
      // 0ac: aload 0
      // 0ad: invokevirtual fcs.i55 ()F
      // 0b0: fconst_1
      // 0b1: fadd
      // 0b2: invokevirtual fcs.uh3 (F)V
      // 0b5: goto 0bc
      // 0b8: invokestatic fcs.a (Loov;)Loov;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: getfield fcs.z2d Ljava/util/Random;
      // 0c0: bipush 10
      // 0c2: invokevirtual java/util/Random.nextInt (I)I
      // 0c5: ifne 149
      // 0c8: ldc 32.0
      // 0ca: nop
      // 0cb: fstore 2
      // 0cc: aload 0
      // 0cd: getfield fcs.oay Lt9d;
      // 0d0: ldc edl
      // 0d2: nop
      // 0d3: aload 0
      // 0d4: invokevirtual fcs.aaw ()Lnh4;
      // 0d7: fload 2
      // 0d8: f2d
      // 0d9: fload 2
      // 0da: f2d
      // 0db: fload 2
      // 0dc: f2d
      // 0dd: invokevirtual nh4.c2h (DDD)Lnh4;
      // 0e0: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 0e3: astore 3
      // 0e4: aconst_null
      // 0e5: astore 4
      // 0e7: ldc2_w 1.7976931348623157E308
      // 0ea: dstore 5
      // 0ec: aload 3
      // 0ed: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0f2: astore 7
      // 0f4: aload 7
      // 0f6: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0fb: ifeq 143
      // 0fe: aload 7
      // 100: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 105: checkcast edl
      // 108: astore 8
      // 10a: aload 8
      // 10c: aload 0
      // 10d: invokevirtual edl.wxg (Li2h;)D
      // 110: dstore 9
      // 112: iload 1
      // 113: ifeq 149
      // 116: dload 9
      // 118: iload 1
      // 119: ifeq 139
      // 11c: goto 123
      // 11f: invokestatic fcs.a (Loov;)Loov;
      // 122: athrow
      // 123: dload 5
      // 125: dcmpg
      // 126: ifge 13f
      // 129: goto 130
      // 12c: invokestatic fcs.a (Loov;)Loov;
      // 12f: athrow
      // 130: dload 9
      // 132: goto 139
      // 135: invokestatic fcs.a (Loov;)Loov;
      // 138: athrow
      // 139: dstore 5
      // 13b: aload 8
      // 13d: astore 4
      // 13f: iload 1
      // 140: ifne 0f4
      // 143: aload 0
      // 144: aload 4
      // 146: putfield fcs.xs_ Ledl;
      // 149: return
   }

   private void kzp(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield fcs.s6p Lpq1;
      // 04: invokevirtual pq1.aaw ()Lnh4;
      // 07: getfield nh4.rlc D
      // 0a: aload 0
      // 0b: getfield fcs.s6p Lpq1;
      // 0e: invokevirtual pq1.aaw ()Lnh4;
      // 11: getfield nh4.t_2 D
      // 14: dadd
      // 15: ldc2_w 2.0
      // 18: ddiv
      // 19: dstore 3
      // 1a: invokestatic t9d.b ()I
      // 1d: aload 0
      // 1e: getfield fcs.s6p Lpq1;
      // 21: invokevirtual pq1.aaw ()Lnh4;
      // 24: getfield nh4.t8n D
      // 27: aload 0
      // 28: getfield fcs.s6p Lpq1;
      // 2b: invokevirtual pq1.aaw ()Lnh4;
      // 2e: getfield nh4.oqj D
      // 31: dadd
      // 32: ldc2_w 2.0
      // 35: ddiv
      // 36: dstore 5
      // 38: istore 2
      // 39: aload 1
      // 3a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3f: astore 7
      // 41: aload 7
      // 43: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 48: ifeq af
      // 4b: aload 7
      // 4d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 52: checkcast i2h
      // 55: astore 8
      // 57: aload 8
      // 59: iload 2
      // 5a: ifeq 73
      // 5d: instanceof g_3
      // 60: ifeq ab
      // 63: goto 6a
      // 66: invokestatic fcs.a (Loov;)Loov;
      // 69: athrow
      // 6a: aload 8
      // 6c: goto 73
      // 6f: invokestatic fcs.a (Loov;)Loov;
      // 72: athrow
      // 73: getfield i2h.o2v D
      // 76: dload 3
      // 77: dsub
      // 78: dstore 9
      // 7a: aload 8
      // 7c: getfield i2h.vbd D
      // 7f: dload 5
      // 81: dsub
      // 82: dstore 11
      // 84: dload 9
      // 86: dload 9
      // 88: dmul
      // 89: dload 11
      // 8b: dload 11
      // 8d: dmul
      // 8e: dadd
      // 8f: dstore 13
      // 91: aload 8
      // 93: dload 9
      // 95: dload 13
      // 97: ddiv
      // 98: ldc2_w 4.0
      // 9b: dmul
      // 9c: ldc2_w 0.20000000298023224
      // 9f: dload 11
      // a1: dload 13
      // a3: ddiv
      // a4: ldc2_w 4.0
      // a7: dmul
      // a8: invokevirtual i2h.w7w (DDD)V
      // ab: iload 2
      // ac: ifne 41
      // af: return
   }

   private void uuz(List param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: aload 1
      // 08: invokeinterface java/util/List.size ()I 1
      // 0d: if_icmpge 51
      // 10: aload 1
      // 11: iload 3
      // 12: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 17: checkcast i2h
      // 1a: astore 4
      // 1c: iload 2
      // 1d: ifne 4d
      // 20: aload 4
      // 22: instanceof g_3
      // 25: ifeq 4a
      // 28: goto 2f
      // 2b: invokestatic fcs.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 4
      // 31: aload 0
      // 32: invokestatic ofh.kun (Lg_3;)Lofh;
      // 35: ldc 10.0
      // 37: nop
      // 38: invokevirtual i2h.m1t (Lofh;F)Z
      // 3b: pop
      // 3c: aload 0
      // 3d: aload 0
      // 3e: aload 4
      // 40: invokevirtual fcs.wm5 (Lg_3;Li2h;)V
      // 43: goto 4a
      // 46: invokestatic fcs.a (Loov;)Loov;
      // 49: athrow
      // 4a: iinc 3 1
      // 4d: iload 2
      // 4e: ifeq 06
      // 51: return
   }

   private void k4d() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: bipush 0
      // 002: putfield fcs.ut4 Z
      // 005: invokestatic t9d.c ()I
      // 008: aload 0
      // 009: getfield fcs.oay Lt9d;
      // 00c: getfield t9d.rpk Ljava/util/List;
      // 00f: invokestatic com/google/common/collect/Lists.newArrayList (Ljava/lang/Iterable;)Ljava/util/ArrayList;
      // 012: astore 2
      // 013: istore 1
      // 014: aload 2
      // 015: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 01a: astore 3
      // 01b: aload 3
      // 01c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 021: ifeq 053
      // 024: aload 3
      // 025: iload 1
      // 026: ifne 04a
      // 029: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 02e: checkcast ha9
      // 031: invokevirtual ha9.myu ()Z
      // 034: iload 1
      // 035: ifne 066
      // 038: goto 03f
      // 03b: invokestatic fcs.a (Loov;)Loov;
      // 03e: athrow
      // 03f: ifeq 01b
      // 042: goto 049
      // 045: invokestatic fcs.a (Loov;)Loov;
      // 048: athrow
      // 049: aload 3
      // 04a: invokeinterface java/util/Iterator.remove ()V 1
      // 04f: iload 1
      // 050: ifeq 01b
      // 053: aload 0
      // 054: iload 1
      // 055: ifne 0f6
      // 058: getfield fcs.z2d Ljava/util/Random;
      // 05b: bipush 2
      // 05c: invokevirtual java/util/Random.nextInt (I)I
      // 05f: goto 066
      // 062: invokestatic fcs.a (Loov;)Loov;
      // 065: athrow
      // 066: ifne 09e
      // 069: aload 2
      // 06a: invokeinterface java/util/List.isEmpty ()Z 1
      // 06f: ifne 09e
      // 072: goto 079
      // 075: invokestatic fcs.a (Loov;)Loov;
      // 078: athrow
      // 079: aload 0
      // 07a: aload 2
      // 07b: aload 0
      // 07c: getfield fcs.z2d Ljava/util/Random;
      // 07f: aload 2
      // 080: invokeinterface java/util/List.size ()I 1
      // 085: invokevirtual java/util/Random.nextInt (I)I
      // 088: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 08d: checkcast i2h
      // 090: putfield fcs.hoo Li2h;
      // 093: iload 1
      // 094: ifeq 159
      // 097: goto 09e
      // 09a: invokestatic fcs.a (Loov;)Loov;
      // 09d: athrow
      // 09e: aload 0
      // 09f: dconst_0
      // 0a0: putfield fcs.jht D
      // 0a3: aload 0
      // 0a4: ldc 70.0
      // 0a6: nop
      // 0a7: aload 0
      // 0a8: getfield fcs.z2d Ljava/util/Random;
      // 0ab: invokevirtual java/util/Random.nextFloat ()F
      // 0ae: ldc 50.0
      // 0b0: nop
      // 0b1: fmul
      // 0b2: fadd
      // 0b3: f2d
      // 0b4: putfield fcs.dv9 D
      // 0b7: aload 0
      // 0b8: dconst_0
      // 0b9: putfield fcs.kyz D
      // 0bc: aload 0
      // 0bd: dup
      // 0be: getfield fcs.jht D
      // 0c1: aload 0
      // 0c2: getfield fcs.z2d Ljava/util/Random;
      // 0c5: invokevirtual java/util/Random.nextFloat ()F
      // 0c8: ldc 120.0
      // 0ca: nop
      // 0cb: fmul
      // 0cc: ldc 60.0
      // 0ce: nop
      // 0cf: fsub
      // 0d0: f2d
      // 0d1: dadd
      // 0d2: putfield fcs.jht D
      // 0d5: aload 0
      // 0d6: dup
      // 0d7: getfield fcs.kyz D
      // 0da: aload 0
      // 0db: getfield fcs.z2d Ljava/util/Random;
      // 0de: invokevirtual java/util/Random.nextFloat ()F
      // 0e1: ldc 120.0
      // 0e3: nop
      // 0e4: fmul
      // 0e5: ldc 60.0
      // 0e7: nop
      // 0e8: fsub
      // 0e9: f2d
      // 0ea: dadd
      // 0eb: putfield fcs.kyz D
      // 0ee: aload 0
      // 0ef: goto 0f6
      // 0f2: invokestatic fcs.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: getfield fcs.o2v D
      // 0f9: aload 0
      // 0fa: getfield fcs.jht D
      // 0fd: dsub
      // 0fe: dstore 4
      // 100: aload 0
      // 101: getfield fcs.kfp D
      // 104: aload 0
      // 105: getfield fcs.dv9 D
      // 108: dsub
      // 109: dstore 6
      // 10b: aload 0
      // 10c: getfield fcs.vbd D
      // 10f: aload 0
      // 110: getfield fcs.kyz D
      // 113: dsub
      // 114: dstore 8
      // 116: dload 4
      // 118: dload 4
      // 11a: dmul
      // 11b: dload 6
      // 11d: dload 6
      // 11f: dmul
      // 120: dadd
      // 121: dload 8
      // 123: dload 8
      // 125: dmul
      // 126: dadd
      // 127: ldc2_w 100.0
      // 12a: dcmpl
      // 12b: ifle 141
      // 12e: bipush 1
      // 12f: iload 1
      // 130: ifne 142
      // 133: goto 13a
      // 136: invokestatic fcs.a (Loov;)Loov;
      // 139: athrow
      // 13a: goto 142
      // 13d: invokestatic fcs.a (Loov;)Loov;
      // 140: athrow
      // 141: bipush 0
      // 142: istore 10
      // 144: iload 10
      // 146: ifeq 150
      // 149: goto 154
      // 14c: invokestatic fcs.a (Loov;)Loov;
      // 14f: athrow
      // 150: iload 1
      // 151: ifeq 09e
      // 154: aload 0
      // 155: aconst_null
      // 156: putfield fcs.hoo Li2h;
      // 159: return
   }

   private float wui(double var1) {
      return (float)fe6.lrs(var1);
   }

   private boolean l0x(nh4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic fcs.c J
      // 003: ldc2_w 120454902620767
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: getfield nh4.rlc D
      // 00c: invokestatic fe6.jqf (D)I
      // 00f: istore 5
      // 011: aload 1
      // 012: getfield nh4.bx_ D
      // 015: invokestatic fe6.jqf (D)I
      // 018: istore 6
      // 01a: aload 1
      // 01b: getfield nh4.t8n D
      // 01e: invokestatic fe6.jqf (D)I
      // 021: istore 7
      // 023: aload 1
      // 024: getfield nh4.t_2 D
      // 027: invokestatic fe6.jqf (D)I
      // 02a: istore 8
      // 02c: aload 1
      // 02d: getfield nh4.i2c D
      // 030: invokestatic fe6.jqf (D)I
      // 033: istore 9
      // 035: invokestatic t9d.b ()I
      // 038: aload 1
      // 039: getfield nh4.oqj D
      // 03c: invokestatic fe6.jqf (D)I
      // 03f: istore 10
      // 041: bipush 0
      // 042: istore 11
      // 044: bipush 0
      // 045: istore 12
      // 047: iload 5
      // 049: istore 13
      // 04b: istore 4
      // 04d: iload 13
      // 04f: iload 8
      // 051: if_icmpgt 1c4
      // 054: iload 6
      // 056: iload 4
      // 058: ifeq 1c6
      // 05b: istore 14
      // 05d: iload 14
      // 05f: iload 9
      // 061: if_icmpgt 1bc
      // 064: iload 7
      // 066: iload 4
      // 068: ifeq 04f
      // 06b: istore 15
      // 06d: iload 15
      // 06f: iload 10
      // 071: if_icmpgt 1b4
      // 074: new mew
      // 077: dup
      // 078: iload 13
      // 07a: iload 14
      // 07c: iload 15
      // 07e: invokespecial mew.<init> (III)V
      // 081: astore 16
      // 083: aload 0
      // 084: getfield fcs.oay Lt9d;
      // 087: aload 16
      // 089: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 08c: invokeinterface zfz.r_y ()Le0x; 1
      // 091: astore 17
      // 093: iload 4
      // 095: ifeq 1b7
      // 098: iload 4
      // 09a: ifeq 1af
      // 09d: goto 0a4
      // 0a0: invokestatic fcs.a (Loov;)Loov;
      // 0a3: athrow
      // 0a4: aload 17
      // 0a6: invokevirtual e0x.p1r ()Lp3y;
      // 0a9: getstatic p3y.cei Lp3y;
      // 0ac: if_acmpeq 1ac
      // 0af: goto 0b6
      // 0b2: invokestatic fcs.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 17
      // 0b8: getstatic ox_.c28 Le0x;
      // 0bb: iload 4
      // 0bd: ifeq 0dd
      // 0c0: goto 0c7
      // 0c3: invokestatic fcs.a (Loov;)Loov;
      // 0c6: athrow
      // 0c7: if_acmpeq 1a2
      // 0ca: goto 0d1
      // 0cd: invokestatic fcs.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: aload 17
      // 0d3: getstatic ox_.j4y Le0x;
      // 0d6: goto 0dd
      // 0d9: invokestatic fcs.a (Loov;)Loov;
      // 0dc: athrow
      // 0dd: iload 4
      // 0df: ifeq 0f8
      // 0e2: if_acmpeq 1a2
      // 0e5: goto 0ec
      // 0e8: invokestatic fcs.a (Loov;)Loov;
      // 0eb: athrow
      // 0ec: aload 17
      // 0ee: getstatic ox_.p5a Le0x;
      // 0f1: goto 0f8
      // 0f4: invokestatic fcs.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: iload 4
      // 0fa: ifeq 113
      // 0fd: if_acmpeq 1a2
      // 100: goto 107
      // 103: invokestatic fcs.a (Loov;)Loov;
      // 106: athrow
      // 107: aload 17
      // 109: getstatic ox_.n6z Le0x;
      // 10c: goto 113
      // 10f: invokestatic fcs.a (Loov;)Loov;
      // 112: athrow
      // 113: iload 4
      // 115: ifeq 12e
      // 118: if_acmpeq 1a2
      // 11b: goto 122
      // 11e: invokestatic fcs.a (Loov;)Loov;
      // 121: athrow
      // 122: aload 17
      // 124: getstatic ox_.pol Le0x;
      // 127: goto 12e
      // 12a: invokestatic fcs.a (Loov;)Loov;
      // 12d: athrow
      // 12e: if_acmpeq 1a2
      // 131: aload 0
      // 132: getfield fcs.oay Lt9d;
      // 135: invokevirtual t9d.eir ()Lef9;
      // 138: sipush 9590
      // 13b: ldc2_w 5452536588776690777
      // 13e: lload 2
      // 13f: lxor
      // 140: invokedynamic w (IJ)Ljava/lang/String; bsm=fcs.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 145: nop
      // 146: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 149: iload 4
      // 14b: ifeq 1aa
      // 14e: goto 155
      // 151: invokestatic fcs.a (Loov;)Loov;
      // 154: athrow
      // 155: ifeq 1a2
      // 158: goto 15f
      // 15b: invokestatic fcs.a (Loov;)Loov;
      // 15e: athrow
      // 15f: aload 0
      // 160: getfield fcs.oay Lt9d;
      // 163: aload 16
      // 165: invokevirtual t9d.i6x (Lmew;)Z
      // 168: iload 4
      // 16a: ifeq 197
      // 16d: goto 174
      // 170: invokestatic fcs.a (Loov;)Loov;
      // 173: athrow
      // 174: ifne 196
      // 177: goto 17e
      // 17a: invokestatic fcs.a (Loov;)Loov;
      // 17d: athrow
      // 17e: iload 12
      // 180: iload 4
      // 182: ifeq 197
      // 185: goto 18c
      // 188: invokestatic fcs.a (Loov;)Loov;
      // 18b: athrow
      // 18c: ifeq 19a
      // 18f: goto 196
      // 192: invokestatic fcs.a (Loov;)Loov;
      // 195: athrow
      // 196: bipush 1
      // 197: goto 19b
      // 19a: bipush 0
      // 19b: istore 12
      // 19d: iload 4
      // 19f: ifne 1ac
      // 1a2: bipush 1
      // 1a3: goto 1aa
      // 1a6: invokestatic fcs.a (Loov;)Loov;
      // 1a9: athrow
      // 1aa: istore 11
      // 1ac: iinc 15 1
      // 1af: iload 4
      // 1b1: ifne 06d
      // 1b4: iinc 14 1
      // 1b7: iload 4
      // 1b9: ifne 05d
      // 1bc: iinc 13 1
      // 1bf: iload 4
      // 1c1: ifne 04d
      // 1c4: iload 12
      // 1c6: iload 4
      // 1c8: ifeq 238
      // 1cb: ifeq 236
      // 1ce: goto 1d5
      // 1d1: invokestatic fcs.a (Loov;)Loov;
      // 1d4: athrow
      // 1d5: aload 1
      // 1d6: getfield nh4.rlc D
      // 1d9: aload 1
      // 1da: getfield nh4.t_2 D
      // 1dd: aload 1
      // 1de: getfield nh4.rlc D
      // 1e1: dsub
      // 1e2: aload 0
      // 1e3: getfield fcs.z2d Ljava/util/Random;
      // 1e6: invokevirtual java/util/Random.nextFloat ()F
      // 1e9: f2d
      // 1ea: dmul
      // 1eb: dadd
      // 1ec: dstore 13
      // 1ee: aload 1
      // 1ef: getfield nh4.bx_ D
      // 1f2: aload 1
      // 1f3: getfield nh4.i2c D
      // 1f6: aload 1
      // 1f7: getfield nh4.bx_ D
      // 1fa: dsub
      // 1fb: aload 0
      // 1fc: getfield fcs.z2d Ljava/util/Random;
      // 1ff: invokevirtual java/util/Random.nextFloat ()F
      // 202: f2d
      // 203: dmul
      // 204: dadd
      // 205: dstore 15
      // 207: aload 1
      // 208: getfield nh4.t8n D
      // 20b: aload 1
      // 20c: getfield nh4.oqj D
      // 20f: aload 1
      // 210: getfield nh4.t8n D
      // 213: dsub
      // 214: aload 0
      // 215: getfield fcs.z2d Ljava/util/Random;
      // 218: invokevirtual java/util/Random.nextFloat ()F
      // 21b: f2d
      // 21c: dmul
      // 21d: dadd
      // 21e: dstore 17
      // 220: aload 0
      // 221: getfield fcs.oay Lt9d;
      // 224: getstatic w_0.tmu Lw_0;
      // 227: dload 13
      // 229: dload 15
      // 22b: dload 17
      // 22d: dconst_0
      // 22e: dconst_0
      // 22f: dconst_0
      // 230: bipush 0
      // 231: newarray 10
      // 233: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 236: iload 11
      // 238: ireturn
   }

   @Override
   public boolean ojr(pq1 param1, ofh param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: aload 0
      // 07: getfield fcs.tpz Lpq1;
      // 0a: if_acmpeq 15
      // 0d: fload 3
      // 0e: ldc 4.0
      // 10: nop
      // 11: fdiv
      // 12: fconst_1
      // 13: fadd
      // 14: fstore 3
      // 15: aload 0
      // 16: getfield fcs.x5k F
      // 19: ldc 3.1415927
      // 1b: nop
      // 1c: fmul
      // 1d: ldc 180.0
      // 1f: nop
      // 20: fdiv
      // 21: fstore 5
      // 23: fload 5
      // 25: invokestatic fe6.rtn (F)F
      // 28: fstore 6
      // 2a: fload 5
      // 2c: invokestatic fe6.ssk (F)F
      // 2f: fstore 7
      // 31: aload 0
      // 32: aload 0
      // 33: getfield fcs.o2v D
      // 36: fload 6
      // 38: ldc 5.0
      // 3a: nop
      // 3b: fmul
      // 3c: f2d
      // 3d: dadd
      // 3e: aload 0
      // 3f: getfield fcs.z2d Ljava/util/Random;
      // 42: invokevirtual java/util/Random.nextFloat ()F
      // 45: ldc 0.5
      // 47: nop
      // 48: fsub
      // 49: fconst_2
      // 4a: fmul
      // 4b: f2d
      // 4c: dadd
      // 4d: putfield fcs.jht D
      // 50: aload 0
      // 51: aload 0
      // 52: getfield fcs.kfp D
      // 55: aload 0
      // 56: getfield fcs.z2d Ljava/util/Random;
      // 59: invokevirtual java/util/Random.nextFloat ()F
      // 5c: ldc 3.0
      // 5e: nop
      // 5f: fmul
      // 60: f2d
      // 61: dadd
      // 62: dconst_1
      // 63: dadd
      // 64: putfield fcs.dv9 D
      // 67: aload 0
      // 68: aload 0
      // 69: getfield fcs.vbd D
      // 6c: fload 7
      // 6e: ldc 5.0
      // 70: nop
      // 71: fmul
      // 72: f2d
      // 73: dsub
      // 74: aload 0
      // 75: getfield fcs.z2d Ljava/util/Random;
      // 78: invokevirtual java/util/Random.nextFloat ()F
      // 7b: ldc 0.5
      // 7d: nop
      // 7e: fsub
      // 7f: fconst_2
      // 80: fmul
      // 81: f2d
      // 82: dadd
      // 83: putfield fcs.kyz D
      // 86: aload 0
      // 87: aconst_null
      // 88: putfield fcs.hoo Li2h;
      // 8b: aload 2
      // 8c: invokevirtual ofh.nra ()Li2h;
      // 8f: instanceof ha9
      // 92: iload 4
      // 94: ifne c8
      // 97: ifne bb
      // 9a: goto a1
      // 9d: invokestatic fcs.a (Loov;)Loov;
      // a0: athrow
      // a1: aload 2
      // a2: invokevirtual ofh.yto ()Z
      // a5: iload 4
      // a7: ifne ca
      // aa: goto b1
      // ad: invokestatic fcs.a (Loov;)Loov;
      // b0: athrow
      // b1: ifeq c9
      // b4: goto bb
      // b7: invokestatic fcs.a (Loov;)Loov;
      // ba: athrow
      // bb: aload 0
      // bc: aload 2
      // bd: fload 3
      // be: invokevirtual fcs.h1o (Lofh;F)Z
      // c1: goto c8
      // c4: invokestatic fcs.a (Loov;)Loov;
      // c7: athrow
      // c8: pop
      // c9: bipush 1
      // ca: ireturn
   }

   @Override
   public boolean m1t(ofh param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: instanceof c7o
      // 08: iload 3
      // 09: ifeq 41
      // 0c: ifeq 40
      // 0f: goto 16
      // 12: invokestatic fcs.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast c7o
      // 1a: invokevirtual c7o.tkn ()Z
      // 1d: iload 3
      // 1e: ifeq 41
      // 21: goto 28
      // 24: invokestatic fcs.a (Loov;)Loov;
      // 27: athrow
      // 28: ifeq 40
      // 2b: goto 32
      // 2e: invokestatic fcs.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: aload 1
      // 34: fload 2
      // 35: invokevirtual fcs.h1o (Lofh;F)Z
      // 38: pop
      // 39: goto 40
      // 3c: invokestatic fcs.a (Loov;)Loov;
      // 3f: athrow
      // 40: bipush 0
      // 41: ireturn
   }

   public boolean h1o(ofh var1, float var2) {
      return super.m1t(var1, var2);
   }

   @Override
   public void aqu() {
      this._kl();
   }

   @Override
   public void xkp() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic fcs.c J
      // 003: ldc2_w 114927987365180
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic t9d.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: dup
      // 00e: getfield fcs.jkn I
      // 011: bipush 1
      // 012: iadd
      // 013: putfield fcs.jkn I
      // 016: aload 0
      // 017: getfield fcs.jkn I
      // 01a: iload 3
      // 01b: ifne 0be
      // 01e: sipush 180
      // 021: if_icmplt 0a6
      // 024: goto 02b
      // 027: invokestatic fcs.a (Loov;)Loov;
      // 02a: athrow
      // 02b: aload 0
      // 02c: getfield fcs.jkn I
      // 02f: iload 3
      // 030: ifne 0be
      // 033: goto 03a
      // 036: invokestatic fcs.a (Loov;)Loov;
      // 039: athrow
      // 03a: sipush 200
      // 03d: if_icmpgt 0a6
      // 040: goto 047
      // 043: invokestatic fcs.a (Loov;)Loov;
      // 046: athrow
      // 047: aload 0
      // 048: getfield fcs.z2d Ljava/util/Random;
      // 04b: invokevirtual java/util/Random.nextFloat ()F
      // 04e: ldc 0.5
      // 050: nop
      // 051: fsub
      // 052: ldc 8.0
      // 054: nop
      // 055: fmul
      // 056: fstore 4
      // 058: aload 0
      // 059: getfield fcs.z2d Ljava/util/Random;
      // 05c: invokevirtual java/util/Random.nextFloat ()F
      // 05f: ldc 0.5
      // 061: nop
      // 062: fsub
      // 063: ldc 4.0
      // 065: nop
      // 066: fmul
      // 067: fstore 5
      // 069: aload 0
      // 06a: getfield fcs.z2d Ljava/util/Random;
      // 06d: invokevirtual java/util/Random.nextFloat ()F
      // 070: ldc 0.5
      // 072: nop
      // 073: fsub
      // 074: ldc 8.0
      // 076: nop
      // 077: fmul
      // 078: fstore 6
      // 07a: aload 0
      // 07b: getfield fcs.oay Lt9d;
      // 07e: getstatic w_0.ezk Lw_0;
      // 081: aload 0
      // 082: getfield fcs.o2v D
      // 085: fload 4
      // 087: f2d
      // 088: dadd
      // 089: aload 0
      // 08a: getfield fcs.kfp D
      // 08d: ldc2_w 2.0
      // 090: dadd
      // 091: fload 5
      // 093: f2d
      // 094: dadd
      // 095: aload 0
      // 096: getfield fcs.vbd D
      // 099: fload 6
      // 09b: f2d
      // 09c: dadd
      // 09d: dconst_0
      // 09e: dconst_0
      // 09f: dconst_0
      // 0a0: bipush 0
      // 0a1: newarray 10
      // 0a3: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 0a6: aload 0
      // 0a7: getfield fcs.oay Lt9d;
      // 0aa: invokevirtual t9d.eir ()Lef9;
      // 0ad: sipush 12480
      // 0b0: ldc2_w 1587550041823049355
      // 0b3: lload 1
      // 0b4: lxor
      // 0b5: invokedynamic w (IJ)Ljava/lang/String; bsm=fcs.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: nop
      // 0bb: invokevirtual ef9._s0 (Ljava/lang/String;)Z
      // 0be: istore 4
      // 0c0: aload 0
      // 0c1: getfield fcs.oay Lt9d;
      // 0c4: getfield t9d.v0f Z
      // 0c7: iload 3
      // 0c8: ifne 1b6
      // 0cb: ifne 198
      // 0ce: goto 0d5
      // 0d1: invokestatic fcs.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: aload 0
      // 0d6: getfield fcs.jkn I
      // 0d9: sipush 150
      // 0dc: iload 3
      // 0dd: ifne 170
      // 0e0: goto 0e7
      // 0e3: invokestatic fcs.a (Loov;)Loov;
      // 0e6: athrow
      // 0e7: if_icmple 16b
      // 0ea: goto 0f1
      // 0ed: invokestatic fcs.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: aload 0
      // 0f2: getfield fcs.jkn I
      // 0f5: bipush 5
      // 0f6: irem
      // 0f7: iload 3
      // 0f8: ifne 16f
      // 0fb: goto 102
      // 0fe: invokestatic fcs.a (Loov;)Loov;
      // 101: athrow
      // 102: ifne 16b
      // 105: goto 10c
      // 108: invokestatic fcs.a (Loov;)Loov;
      // 10b: athrow
      // 10c: iload 4
      // 10e: iload 3
      // 10f: ifne 16f
      // 112: goto 119
      // 115: invokestatic fcs.a (Loov;)Loov;
      // 118: athrow
      // 119: ifeq 16b
      // 11c: goto 123
      // 11f: invokestatic fcs.a (Loov;)Loov;
      // 122: athrow
      // 123: sipush 1000
      // 126: istore 5
      // 128: iload 5
      // 12a: ifle 16b
      // 12d: iload 5
      // 12f: invokestatic uno.di5 (I)I
      // 132: istore 6
      // 134: iload 5
      // 136: iload 6
      // 138: isub
      // 139: istore 5
      // 13b: aload 0
      // 13c: getfield fcs.oay Lt9d;
      // 13f: new uno
      // 142: dup
      // 143: aload 0
      // 144: getfield fcs.oay Lt9d;
      // 147: aload 0
      // 148: getfield fcs.o2v D
      // 14b: aload 0
      // 14c: getfield fcs.kfp D
      // 14f: aload 0
      // 150: getfield fcs.vbd D
      // 153: iload 6
      // 155: invokespecial uno.<init> (Lt9d;DDDI)V
      // 158: invokevirtual t9d.xzq (Li2h;)Z
      // 15b: pop
      // 15c: iload 3
      // 15d: ifne 1b2
      // 160: iload 3
      // 161: ifeq 128
      // 164: goto 16b
      // 167: invokestatic fcs.a (Loov;)Loov;
      // 16a: athrow
      // 16b: aload 0
      // 16c: getfield fcs.jkn I
      // 16f: bipush 1
      // 170: iload 3
      // 171: ifne 1c4
      // 174: if_icmpne 198
      // 177: goto 17e
      // 17a: invokestatic fcs.a (Loov;)Loov;
      // 17d: athrow
      // 17e: aload 0
      // 17f: getfield fcs.oay Lt9d;
      // 182: sipush 1018
      // 185: new mew
      // 188: dup
      // 189: aload 0
      // 18a: invokespecial mew.<init> (Li2h;)V
      // 18d: bipush 0
      // 18e: invokevirtual t9d.jpe (ILmew;I)V
      // 191: goto 198
      // 194: invokestatic fcs.a (Loov;)Loov;
      // 197: athrow
      // 198: aload 0
      // 199: dconst_0
      // 19a: ldc2_w 0.10000000149011612
      // 19d: dconst_0
      // 19e: invokevirtual fcs.vjj (DDD)V
      // 1a1: aload 0
      // 1a2: aload 0
      // 1a3: dup
      // 1a4: getfield fcs.x5k F
      // 1a7: ldc 20.0
      // 1a9: nop
      // 1aa: fadd
      // 1ab: dup_x1
      // 1ac: putfield fcs.x5k F
      // 1af: putfield fcs.ksw F
      // 1b2: aload 0
      // 1b3: getfield fcs.jkn I
      // 1b6: iload 3
      // 1b7: ifne 1d5
      // 1ba: sipush 200
      // 1bd: goto 1c4
      // 1c0: invokestatic fcs.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: if_icmpne 255
      // 1c7: aload 0
      // 1c8: getfield fcs.oay Lt9d;
      // 1cb: getfield t9d.v0f Z
      // 1ce: goto 1d5
      // 1d1: invokestatic fcs.a (Loov;)Loov;
      // 1d4: athrow
      // 1d5: iload 3
      // 1d6: ifne 1e5
      // 1d9: ifne 255
      // 1dc: goto 1e3
      // 1df: invokestatic fcs.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: iload 4
      // 1e5: iload 3
      // 1e6: ifne 1f6
      // 1e9: ifeq 23b
      // 1ec: goto 1f3
      // 1ef: invokestatic fcs.a (Loov;)Loov;
      // 1f2: athrow
      // 1f3: sipush 2000
      // 1f6: istore 5
      // 1f8: iload 5
      // 1fa: ifle 23b
      // 1fd: iload 5
      // 1ff: invokestatic uno.di5 (I)I
      // 202: istore 6
      // 204: iload 5
      // 206: iload 6
      // 208: isub
      // 209: istore 5
      // 20b: aload 0
      // 20c: getfield fcs.oay Lt9d;
      // 20f: new uno
      // 212: dup
      // 213: aload 0
      // 214: getfield fcs.oay Lt9d;
      // 217: aload 0
      // 218: getfield fcs.o2v D
      // 21b: aload 0
      // 21c: getfield fcs.kfp D
      // 21f: aload 0
      // 220: getfield fcs.vbd D
      // 223: iload 6
      // 225: invokespecial uno.<init> (Lt9d;DDDI)V
      // 228: invokevirtual t9d.xzq (Li2h;)Z
      // 22b: pop
      // 22c: iload 3
      // 22d: ifne 251
      // 230: iload 3
      // 231: ifeq 1f8
      // 234: goto 23b
      // 237: invokestatic fcs.a (Loov;)Loov;
      // 23a: athrow
      // 23b: aload 0
      // 23c: new mew
      // 23f: dup
      // 240: aload 0
      // 241: getfield fcs.o2v D
      // 244: ldc2_w 64.0
      // 247: aload 0
      // 248: getfield fcs.vbd D
      // 24b: invokespecial mew.<init> (DDD)V
      // 24e: invokespecial fcs.n6m (Lmew;)V
      // 251: aload 0
      // 252: invokevirtual fcs._kl ()V
      // 255: return
   }

   private void n6m(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush 4
      // 001: istore 3
      // 002: ldc2_w 12.25
      // 005: dstore 4
      // 007: ldc2_w 6.25
      // 00a: dstore 6
      // 00c: invokestatic t9d.c ()I
      // 00f: bipush -1
      // 010: istore 8
      // 012: istore 2
      // 013: iload 8
      // 015: bipush 32
      // 017: if_icmpgt 142
      // 01a: bipush -4
      // 01c: iload 2
      // 01d: ifne 162
      // 020: istore 9
      // 022: iload 9
      // 024: bipush 4
      // 025: if_icmpgt 13b
      // 028: bipush -4
      // 02a: iload 2
      // 02b: ifne 015
      // 02e: istore 10
      // 030: iload 10
      // 032: bipush 4
      // 033: if_icmpgt 134
      // 036: iload 9
      // 038: iload 9
      // 03a: imul
      // 03b: iload 10
      // 03d: iload 10
      // 03f: imul
      // 040: iadd
      // 041: i2d
      // 042: dstore 11
      // 044: iload 2
      // 045: ifne 130
      // 048: dload 11
      // 04a: ldc2_w 12.25
      // 04d: dcmpg
      // 04e: iload 2
      // 04f: ifne 024
      // 052: goto 059
      // 055: invokestatic fcs.a (Loov;)Loov;
      // 058: athrow
      // 059: ifgt 12d
      // 05c: aload 1
      // 05d: iload 9
      // 05f: iload 8
      // 061: iload 10
      // 063: invokevirtual mew.ec4 (III)Lmew;
      // 066: astore 13
      // 068: iload 8
      // 06a: iload 2
      // 06b: ifne 0b7
      // 06e: ifge 0ae
      // 071: goto 078
      // 074: invokestatic fcs.a (Loov;)Loov;
      // 077: athrow
      // 078: dload 11
      // 07a: ldc2_w 6.25
      // 07d: dcmpg
      // 07e: iload 2
      // 07f: ifne 0a9
      // 082: goto 089
      // 085: invokestatic fcs.a (Loov;)Loov;
      // 088: athrow
      // 089: ifgt 12d
      // 08c: goto 093
      // 08f: invokestatic fcs.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 0
      // 094: getfield fcs.oay Lt9d;
      // 097: aload 13
      // 099: getstatic ox_.n6z Le0x;
      // 09c: invokevirtual e0x.l4i ()Lzfz;
      // 09f: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 0a2: goto 0a9
      // 0a5: invokestatic fcs.a (Loov;)Loov;
      // 0a8: athrow
      // 0a9: pop
      // 0aa: iload 2
      // 0ab: ifeq 12d
      // 0ae: iload 8
      // 0b0: goto 0b7
      // 0b3: invokestatic fcs.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: iload 2
      // 0b8: ifne 0ed
      // 0bb: ifle 0e0
      // 0be: goto 0c5
      // 0c1: invokestatic fcs.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: getfield fcs.oay Lt9d;
      // 0c9: aload 13
      // 0cb: getstatic ox_.ibw Le0x;
      // 0ce: invokevirtual e0x.l4i ()Lzfz;
      // 0d1: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 0d4: pop
      // 0d5: iload 2
      // 0d6: ifeq 12d
      // 0d9: goto 0e0
      // 0dc: invokestatic fcs.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: dload 11
      // 0e2: ldc2_w 6.25
      // 0e5: dcmpl
      // 0e6: goto 0ed
      // 0e9: invokestatic fcs.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: iload 2
      // 0ee: ifne 12c
      // 0f1: ifle 116
      // 0f4: goto 0fb
      // 0f7: invokestatic fcs.a (Loov;)Loov;
      // 0fa: athrow
      // 0fb: aload 0
      // 0fc: getfield fcs.oay Lt9d;
      // 0ff: aload 13
      // 101: getstatic ox_.n6z Le0x;
      // 104: invokevirtual e0x.l4i ()Lzfz;
      // 107: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 10a: pop
      // 10b: iload 2
      // 10c: ifeq 12d
      // 10f: goto 116
      // 112: invokestatic fcs.a (Loov;)Loov;
      // 115: athrow
      // 116: aload 0
      // 117: getfield fcs.oay Lt9d;
      // 11a: aload 13
      // 11c: getstatic ox_.ce3 Le0x;
      // 11f: invokevirtual e0x.l4i ()Lzfz;
      // 122: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 125: goto 12c
      // 128: invokestatic fcs.a (Loov;)Loov;
      // 12b: athrow
      // 12c: pop
      // 12d: iinc 10 1
      // 130: iload 2
      // 131: ifeq 030
      // 134: iinc 9 1
      // 137: iload 2
      // 138: ifeq 022
      // 13b: iinc 8 1
      // 13e: iload 2
      // 13f: ifeq 013
      // 142: aload 0
      // 143: getfield fcs.oay Lt9d;
      // 146: aload 1
      // 147: getstatic ox_.n6z Le0x;
      // 14a: invokevirtual e0x.l4i ()Lzfz;
      // 14d: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 150: pop
      // 151: aload 0
      // 152: getfield fcs.oay Lt9d;
      // 155: aload 1
      // 156: invokevirtual mew.nuv ()Lmew;
      // 159: getstatic ox_.n6z Le0x;
      // 15c: invokevirtual e0x.l4i ()Lzfz;
      // 15f: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 162: pop
      // 163: aload 1
      // 164: bipush 2
      // 165: invokevirtual mew.z89 (I)Lmew;
      // 168: astore 8
      // 16a: aload 0
      // 16b: getfield fcs.oay Lt9d;
      // 16e: aload 8
      // 170: getstatic ox_.n6z Le0x;
      // 173: invokevirtual e0x.l4i ()Lzfz;
      // 176: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 179: pop
      // 17a: aload 0
      // 17b: getfield fcs.oay Lt9d;
      // 17e: aload 8
      // 180: invokevirtual mew.y8e ()Lmew;
      // 183: getstatic ox_.gt8 Le0x;
      // 186: invokevirtual e0x.l4i ()Lzfz;
      // 189: getstatic um3.go7 Lqx_;
      // 18c: getstatic vt2.zk4 Lvt2;
      // 18f: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 194: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 197: pop
      // 198: aload 0
      // 199: getfield fcs.oay Lt9d;
      // 19c: aload 8
      // 19e: invokevirtual mew.o_8 ()Lmew;
      // 1a1: getstatic ox_.gt8 Le0x;
      // 1a4: invokevirtual e0x.l4i ()Lzfz;
      // 1a7: getstatic um3.go7 Lqx_;
      // 1aa: getstatic vt2.te4 Lvt2;
      // 1ad: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1b2: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 1b5: pop
      // 1b6: aload 0
      // 1b7: getfield fcs.oay Lt9d;
      // 1ba: aload 8
      // 1bc: invokevirtual mew.idu ()Lmew;
      // 1bf: getstatic ox_.gt8 Le0x;
      // 1c2: invokevirtual e0x.l4i ()Lzfz;
      // 1c5: getstatic um3.go7 Lqx_;
      // 1c8: getstatic vt2.mxp Lvt2;
      // 1cb: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1d0: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 1d3: pop
      // 1d4: aload 0
      // 1d5: getfield fcs.oay Lt9d;
      // 1d8: aload 8
      // 1da: invokevirtual mew.z6x ()Lmew;
      // 1dd: getstatic ox_.gt8 Le0x;
      // 1e0: invokevirtual e0x.l4i ()Lzfz;
      // 1e3: getstatic um3.go7 Lqx_;
      // 1e6: getstatic vt2.z9q Lvt2;
      // 1e9: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 1ee: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 1f1: pop
      // 1f2: aload 0
      // 1f3: getfield fcs.oay Lt9d;
      // 1f6: aload 1
      // 1f7: bipush 3
      // 1f8: invokevirtual mew.z89 (I)Lmew;
      // 1fb: getstatic ox_.n6z Le0x;
      // 1fe: invokevirtual e0x.l4i ()Lzfz;
      // 201: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 204: pop
      // 205: aload 0
      // 206: getfield fcs.oay Lt9d;
      // 209: aload 1
      // 20a: bipush 4
      // 20b: invokevirtual mew.z89 (I)Lmew;
      // 20e: getstatic ox_.yoc Le0x;
      // 211: invokevirtual e0x.l4i ()Lzfz;
      // 214: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 217: pop
      // 218: return
   }

   @Override
   public void oqm() {
   }

   @Override
   public i2h[] u_g() {
      return this.f11;
   }

   @Override
   public boolean mzu() {
      return false;
   }

   @Override
   public t9d sz5() {
      return this.oay;
   }

   @Override
   public String _n1() {
      long var1 = c ^ 58938122631475L;
      return d<"w">(12359, 6774230691086539270L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 51933999396427L;
      return d<"w">(30807, 4988098420377476463L ^ var1);
   }

   @Override
   public float o23() {
      return 5.0F;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4300763944594949566L, 7747333745432450937L, MethodHandles.lookup().lookupClass()).a(149847426396207L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 14473041556363L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "o%\u000fÿgØ\u0017eeIh\u0090QÙ\u0014\u0006\u001dÙ¿\u0086Gç\u0005ß=ÓczÃþ=¸æ³#ùÌ\u0092Ý\u00ad(îÙÞ½kñèÔZg\u0013\u0095Å\u000f|ï¢\b#º\u0090\u009f\u0082\u0098v÷\u0005F§0ò\u0092\u0018Ó\u0099(\u0088\u008a]\u0094\u00100GZó\u009fìÐú\u0094}ÞÍ\u0007Ì»&\u0018Î_\u0016\t\u0018 ÜG\u0093@z.«µ(XB®ë}¹\u0016âs\u0018^\u0088\f\u0010ÊzÀ\u0098u\u0012@{Î\u0016ý\u0098\u007f1ÖëÇ>\u008fE\u0010.h[^¥ð4>ÆÁ5sÿºS?\u0010ÜDYp¹Ï\u0088±G\u008azhúÔéí\u0010ÿ_\u000bnkj\u0094±ê\u0085±uþ<|A\u0010ø\u001a\u0017ßïÁ\u009ecÇQv8Ã³EF";
      int var8 = "o%\u000fÿgØ\u0017eeIh\u0090QÙ\u0014\u0006\u001dÙ¿\u0086Gç\u0005ß=ÓczÃþ=¸æ³#ùÌ\u0092Ý\u00ad(îÙÞ½kñèÔZg\u0013\u0095Å\u000f|ï¢\b#º\u0090\u009f\u0082\u0098v÷\u0005F§0ò\u0092\u0018Ó\u0099(\u0088\u008a]\u0094\u00100GZó\u009fìÐú\u0094}ÞÍ\u0007Ì»&\u0018Î_\u0016\t\u0018 ÜG\u0093@z.«µ(XB®ë}¹\u0016âs\u0018^\u0088\f\u0010ÊzÀ\u0098u\u0012@{Î\u0016ý\u0098\u007f1ÖëÇ>\u008fE\u0010.h[^¥ð4>ÆÁ5sÿºS?\u0010ÜDYp¹Ï\u0088±G\u008azhúÔéí\u0010ÿ_\u000bnkj\u0094±ê\u0085±uþ<|A\u0010ø\u001a\u0017ßïÁ\u009ecÇQv8Ã³EF"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = d(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     g = new String[11];
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

                  var6 = "\u007f\u0085b\u0005u\u0089?\u0087(ÅQLì\t\u0095\u0001(JÎê\u001adæ\u009b±Õ\"½³\u0019+ScF\u000eÒ'áQýêÛ?T>B5O\u009c\u001f\u008cý:\u0084j!ÿ";
                  var8 = "\u007f\u0085b\u0005u\u0089?\u0087(ÅQLì\t\u0095\u0001(JÎê\u001adæ\u009b±Õ\"½³\u0019+ScF\u000eÒ'áQýêÛ?T>B5O\u009c\u001f\u008cý:\u0084j!ÿ"
                     .length();
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

   private static String d(byte[] var0) {
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

   private static String d(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11354;
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
            throw new RuntimeException("fcs", var10);
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
         g[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
   }

   private static Object d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("fcs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
