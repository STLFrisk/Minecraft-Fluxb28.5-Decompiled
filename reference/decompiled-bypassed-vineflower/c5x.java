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

public abstract class c5x extends i2h {
   public g_3 gen;
   public double ax4;
   public double mjx;
   public double ehh;
   private static final long b;
   private static final String[] d;
   private static final String[] e;
   private static final Map g = new HashMap(13);

   public c5x(t9d var1) {
      super(var1);
      this.yxc(1.0F, 1.0F);
   }

   @Override
   public void tbj() {
   }

   @Override
   public boolean xvv(double var1) {
      int var3 = t9d.c();
      double var4 = this.aaw().liq() * 4.0;

      int var10000;
      label38: {
         label37: {
            try {
               var10000 = Double.isNaN(var4);
               if (var3 != 0) {
                  break label38;
               }

               if (var10000 == 0) {
                  break label37;
               }
            } catch (oov var7) {
               throw a(var7);
            }

            var4 = 4.0;
         }

         var4 *= 64.0;
         double var9;
         var10000 = (var9 = var1 - var4 * var4) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
      }

      try {
         if (var3 != 0) {
            return (boolean)var10000;
         }

         if (var10000 < 0) {
            return (boolean)1;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return (boolean)0;
   }

   public c5x(t9d var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1);
      this.yxc(1.0F, 1.0F);
      this.x24(var2, var4, var6, this.x5k, this.y2i);
      this.m6_(var2, var4, var6);
      double var14 = (double)fe6.dii(var8 * var8 + var10 * var10 + var12 * var12);
      this.ax4 = var8 / var14 * 0.1;
      this.mjx = var10 / var14 * 0.1;
      this.ehh = var12 / var14 * 0.1;
   }

   public c5x(t9d var1, g_3 var2, double var3, double var5, double var7) {
      super(var1);
      this.gen = var2;
      this.yxc(1.0F, 1.0F);
      this.x24(var2.o2v, var2.kfp, var2.vbd, var2.x5k, var2.y2i);
      this.m6_(this.o2v, this.kfp, this.vbd);
      this.icv = this.mop = this.bw4 = 0.0;
      var3 += this.z2d.nextGaussian() * 0.4;
      var5 += this.z2d.nextGaussian() * 0.4;
      var7 += this.z2d.nextGaussian() * 0.4;
      double var9 = (double)fe6.dii(var3 * var3 + var5 * var5 + var7 * var7);
      this.ax4 = var3 / var9 * 0.1;
      this.mjx = var5 / var9 * 0.1;
      this.ehh = var7 / var9 * 0.1;
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield c5x.oay Lt9d;
      // 008: getfield t9d.v0f Z
      // 00b: iload 1
      // 00c: ifeq 091
      // 00f: ifne 072
      // 012: goto 019
      // 015: invokestatic c5x.a (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: iload 1
      // 01b: ifeq 056
      // 01e: goto 025
      // 021: invokestatic c5x.a (Loov;)Loov;
      // 024: athrow
      // 025: getfield c5x.gen Lg_3;
      // 028: ifnull 04e
      // 02b: goto 032
      // 02e: invokestatic c5x.a (Loov;)Loov;
      // 031: athrow
      // 032: aload 0
      // 033: iload 1
      // 034: ifeq 595
      // 037: goto 03e
      // 03a: invokestatic c5x.a (Loov;)Loov;
      // 03d: athrow
      // 03e: getfield c5x.gen Lg_3;
      // 041: getfield g_3.ma9 Z
      // 044: ifne 58d
      // 047: goto 04e
      // 04a: invokestatic c5x.a (Loov;)Loov;
      // 04d: athrow
      // 04e: aload 0
      // 04f: goto 056
      // 052: invokestatic c5x.a (Loov;)Loov;
      // 055: athrow
      // 056: iload 1
      // 057: ifeq 595
      // 05a: getfield c5x.oay Lt9d;
      // 05d: new mew
      // 060: dup
      // 061: aload 0
      // 062: invokespecial mew.<init> (Li2h;)V
      // 065: invokevirtual t9d.xjm (Lmew;)Z
      // 068: ifeq 58d
      // 06b: goto 072
      // 06e: invokestatic c5x.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 0
      // 073: invokespecial i2h.xx_ ()V
      // 076: aload 0
      // 077: bipush 1
      // 078: invokevirtual c5x.k03 (I)V
      // 07b: aload 0
      // 07c: iload 1
      // 07d: ifeq 158
      // 080: goto 087
      // 083: invokestatic c5x.a (Loov;)Loov;
      // 086: athrow
      // 087: getfield c5x.o_s Z
      // 08a: goto 091
      // 08d: invokestatic c5x.a (Loov;)Loov;
      // 090: athrow
      // 091: ifeq 150
      // 094: aload 0
      // 095: iload 1
      // 096: ifeq 148
      // 099: goto 0a0
      // 09c: invokestatic c5x.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: getfield c5x.oay Lt9d;
      // 0a3: new mew
      // 0a6: dup
      // 0a7: aload 0
      // 0a8: getfield c5x.ucg I
      // 0ab: aload 0
      // 0ac: getfield c5x.enf I
      // 0af: aload 0
      // 0b0: getfield c5x.yt8 I
      // 0b3: invokespecial mew.<init> (III)V
      // 0b6: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0b9: invokeinterface zfz.r_y ()Le0x; 1
      // 0be: aload 0
      // 0bf: getfield c5x.lpk Le0x;
      // 0c2: if_acmpne 0fe
      // 0c5: goto 0cc
      // 0c8: invokestatic c5x.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: dup
      // 0ce: getfield c5x.fjc I
      // 0d1: bipush 1
      // 0d2: iadd
      // 0d3: putfield c5x.fjc I
      // 0d6: aload 0
      // 0d7: iload 1
      // 0d8: ifeq 0fa
      // 0db: goto 0e2
      // 0de: invokestatic c5x.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: getfield c5x.fjc I
      // 0e5: sipush 600
      // 0e8: if_icmpne 0fd
      // 0eb: goto 0f2
      // 0ee: invokestatic c5x.a (Loov;)Loov;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: goto 0fa
      // 0f6: invokestatic c5x.a (Loov;)Loov;
      // 0f9: athrow
      // 0fa: invokevirtual c5x._kl ()V
      // 0fd: return
      // 0fe: aload 0
      // 0ff: bipush 0
      // 100: putfield c5x.o_s Z
      // 103: aload 0
      // 104: dup
      // 105: getfield c5x.icv D
      // 108: aload 0
      // 109: getfield c5x.z2d Ljava/util/Random;
      // 10c: invokevirtual java/util/Random.nextFloat ()F
      // 10f: ldc 0.2
      // 111: nop
      // 112: fmul
      // 113: f2d
      // 114: dmul
      // 115: putfield c5x.icv D
      // 118: aload 0
      // 119: dup
      // 11a: getfield c5x.mop D
      // 11d: aload 0
      // 11e: getfield c5x.z2d Ljava/util/Random;
      // 121: invokevirtual java/util/Random.nextFloat ()F
      // 124: ldc 0.2
      // 126: nop
      // 127: fmul
      // 128: f2d
      // 129: dmul
      // 12a: putfield c5x.mop D
      // 12d: aload 0
      // 12e: dup
      // 12f: getfield c5x.bw4 D
      // 132: aload 0
      // 133: getfield c5x.z2d Ljava/util/Random;
      // 136: invokevirtual java/util/Random.nextFloat ()F
      // 139: ldc 0.2
      // 13b: nop
      // 13c: fmul
      // 13d: f2d
      // 13e: dmul
      // 13f: putfield c5x.bw4 D
      // 142: aload 0
      // 143: bipush 0
      // 144: putfield c5x.fjc I
      // 147: aload 0
      // 148: bipush 0
      // 149: putfield c5x.sby I
      // 14c: iload 1
      // 14d: ifne 161
      // 150: aload 0
      // 151: goto 158
      // 154: invokestatic c5x.a (Loov;)Loov;
      // 157: athrow
      // 158: dup
      // 159: getfield c5x.sby I
      // 15c: bipush 1
      // 15d: iadd
      // 15e: putfield c5x.sby I
      // 161: new fqr
      // 164: dup
      // 165: aload 0
      // 166: getfield c5x.o2v D
      // 169: aload 0
      // 16a: getfield c5x.kfp D
      // 16d: aload 0
      // 16e: getfield c5x.vbd D
      // 171: invokespecial fqr.<init> (DDD)V
      // 174: astore 2
      // 175: new fqr
      // 178: dup
      // 179: aload 0
      // 17a: getfield c5x.o2v D
      // 17d: aload 0
      // 17e: getfield c5x.icv D
      // 181: dadd
      // 182: aload 0
      // 183: getfield c5x.kfp D
      // 186: aload 0
      // 187: getfield c5x.mop D
      // 18a: dadd
      // 18b: aload 0
      // 18c: getfield c5x.vbd D
      // 18f: aload 0
      // 190: getfield c5x.bw4 D
      // 193: dadd
      // 194: invokespecial fqr.<init> (DDD)V
      // 197: astore 3
      // 198: aload 0
      // 199: getfield c5x.oay Lt9d;
      // 19c: aload 2
      // 19d: aload 3
      // 19e: invokevirtual t9d.caq (Lfqr;Lfqr;)Lakm;
      // 1a1: astore 4
      // 1a3: new fqr
      // 1a6: dup
      // 1a7: aload 0
      // 1a8: getfield c5x.o2v D
      // 1ab: aload 0
      // 1ac: getfield c5x.kfp D
      // 1af: aload 0
      // 1b0: getfield c5x.vbd D
      // 1b3: invokespecial fqr.<init> (DDD)V
      // 1b6: astore 2
      // 1b7: new fqr
      // 1ba: dup
      // 1bb: aload 0
      // 1bc: getfield c5x.o2v D
      // 1bf: aload 0
      // 1c0: getfield c5x.icv D
      // 1c3: dadd
      // 1c4: aload 0
      // 1c5: getfield c5x.kfp D
      // 1c8: aload 0
      // 1c9: getfield c5x.mop D
      // 1cc: dadd
      // 1cd: aload 0
      // 1ce: getfield c5x.vbd D
      // 1d1: aload 0
      // 1d2: getfield c5x.bw4 D
      // 1d5: dadd
      // 1d6: invokespecial fqr.<init> (DDD)V
      // 1d9: iload 1
      // 1da: ifeq 209
      // 1dd: astore 3
      // 1de: aload 4
      // 1e0: ifnull 20a
      // 1e3: new fqr
      // 1e6: dup
      // 1e7: aload 4
      // 1e9: getfield akm.jhn Lfqr;
      // 1ec: getfield fqr.lvi D
      // 1ef: aload 4
      // 1f1: getfield akm.jhn Lfqr;
      // 1f4: getfield fqr.gn5 D
      // 1f7: aload 4
      // 1f9: getfield akm.jhn Lfqr;
      // 1fc: getfield fqr.bn2 D
      // 1ff: invokespecial fqr.<init> (DDD)V
      // 202: goto 209
      // 205: invokestatic c5x.a (Loov;)Loov;
      // 208: athrow
      // 209: astore 3
      // 20a: aconst_null
      // 20b: astore 5
      // 20d: aload 0
      // 20e: getfield c5x.oay Lt9d;
      // 211: aload 0
      // 212: aload 0
      // 213: invokevirtual c5x.aaw ()Lnh4;
      // 216: aload 0
      // 217: getfield c5x.icv D
      // 21a: aload 0
      // 21b: getfield c5x.mop D
      // 21e: aload 0
      // 21f: getfield c5x.bw4 D
      // 222: invokevirtual nh4.z9h (DDD)Lnh4;
      // 225: dconst_1
      // 226: dconst_1
      // 227: dconst_1
      // 228: invokevirtual nh4.c2h (DDD)Lnh4;
      // 22b: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 22e: astore 6
      // 230: dconst_0
      // 231: dstore 7
      // 233: bipush 0
      // 234: istore 9
      // 236: iload 9
      // 238: aload 6
      // 23a: invokeinterface java/util/List.size ()I 1
      // 23f: if_icmpge 313
      // 242: aload 6
      // 244: iload 9
      // 246: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 24b: checkcast i2h
      // 24e: astore 10
      // 250: iload 1
      // 251: ifeq 30f
      // 254: aload 10
      // 256: iload 1
      // 257: ifeq 315
      // 25a: goto 261
      // 25d: invokestatic c5x.a (Loov;)Loov;
      // 260: athrow
      // 261: invokevirtual i2h.mzu ()Z
      // 264: ifeq 30c
      // 267: goto 26e
      // 26a: invokestatic c5x.a (Loov;)Loov;
      // 26d: athrow
      // 26e: aload 10
      // 270: aload 0
      // 271: getfield c5x.gen Lg_3;
      // 274: invokevirtual i2h.ipr (Li2h;)Z
      // 277: iload 1
      // 278: ifeq 297
      // 27b: goto 282
      // 27e: invokestatic c5x.a (Loov;)Loov;
      // 281: athrow
      // 282: ifeq 29c
      // 285: goto 28c
      // 288: invokestatic c5x.a (Loov;)Loov;
      // 28b: athrow
      // 28c: aload 0
      // 28d: getfield c5x.sby I
      // 290: goto 297
      // 293: invokestatic c5x.a (Loov;)Loov;
      // 296: athrow
      // 297: bipush 25
      // 299: if_icmplt 30c
      // 29c: ldc 0.3
      // 29e: nop
      // 29f: fstore 11
      // 2a1: aload 10
      // 2a3: invokevirtual i2h.aaw ()Lnh4;
      // 2a6: fload 11
      // 2a8: f2d
      // 2a9: fload 11
      // 2ab: f2d
      // 2ac: fload 11
      // 2ae: f2d
      // 2af: invokevirtual nh4.c2h (DDD)Lnh4;
      // 2b2: astore 12
      // 2b4: aload 12
      // 2b6: aload 2
      // 2b7: aload 3
      // 2b8: invokevirtual nh4.v35 (Lfqr;Lfqr;)Lakm;
      // 2bb: astore 13
      // 2bd: iload 1
      // 2be: ifeq 30f
      // 2c1: aload 13
      // 2c3: ifnull 30c
      // 2c6: goto 2cd
      // 2c9: invokestatic c5x.a (Loov;)Loov;
      // 2cc: athrow
      // 2cd: aload 2
      // 2ce: aload 13
      // 2d0: getfield akm.jhn Lfqr;
      // 2d3: invokevirtual fqr.y8x (Lfqr;)D
      // 2d6: dstore 14
      // 2d8: dload 14
      // 2da: iload 1
      // 2db: ifeq 30a
      // 2de: dload 7
      // 2e0: dcmpg
      // 2e1: iflt 304
      // 2e4: goto 2eb
      // 2e7: invokestatic c5x.a (Loov;)Loov;
      // 2ea: athrow
      // 2eb: dload 7
      // 2ed: iload 1
      // 2ee: ifeq 30a
      // 2f1: goto 2f8
      // 2f4: invokestatic c5x.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: dconst_0
      // 2f9: dcmpl
      // 2fa: ifne 30c
      // 2fd: goto 304
      // 300: invokestatic c5x.a (Loov;)Loov;
      // 303: athrow
      // 304: aload 10
      // 306: astore 5
      // 308: dload 14
      // 30a: dstore 7
      // 30c: iinc 9 1
      // 30f: iload 1
      // 310: ifne 236
      // 313: aload 5
      // 315: ifnull 323
      // 318: new akm
      // 31b: dup
      // 31c: aload 5
      // 31e: invokespecial akm.<init> (Li2h;)V
      // 321: astore 4
      // 323: aload 4
      // 325: ifnull 335
      // 328: aload 0
      // 329: aload 4
      // 32b: invokevirtual c5x.f7x (Lakm;)V
      // 32e: goto 335
      // 331: invokestatic c5x.a (Loov;)Loov;
      // 334: athrow
      // 335: aload 0
      // 336: dup
      // 337: getfield c5x.o2v D
      // 33a: aload 0
      // 33b: getfield c5x.icv D
      // 33e: dadd
      // 33f: putfield c5x.o2v D
      // 342: aload 0
      // 343: dup
      // 344: getfield c5x.kfp D
      // 347: aload 0
      // 348: getfield c5x.mop D
      // 34b: dadd
      // 34c: putfield c5x.kfp D
      // 34f: aload 0
      // 350: dup
      // 351: getfield c5x.vbd D
      // 354: aload 0
      // 355: getfield c5x.bw4 D
      // 358: dadd
      // 359: putfield c5x.vbd D
      // 35c: aload 0
      // 35d: getfield c5x.icv D
      // 360: aload 0
      // 361: getfield c5x.icv D
      // 364: dmul
      // 365: aload 0
      // 366: getfield c5x.bw4 D
      // 369: aload 0
      // 36a: getfield c5x.bw4 D
      // 36d: dmul
      // 36e: dadd
      // 36f: invokestatic fe6.dii (D)F
      // 372: fstore 9
      // 374: aload 0
      // 375: aload 0
      // 376: getfield c5x.bw4 D
      // 379: aload 0
      // 37a: getfield c5x.icv D
      // 37d: invokestatic fe6.yr8 (DD)D
      // 380: ldc2_w 180.0
      // 383: dmul
      // 384: ldc2_w 3.141592653589793
      // 387: ddiv
      // 388: d2f
      // 389: ldc 90.0
      // 38b: nop
      // 38c: fadd
      // 38d: putfield c5x.x5k F
      // 390: aload 0
      // 391: fload 9
      // 393: f2d
      // 394: aload 0
      // 395: getfield c5x.mop D
      // 398: invokestatic fe6.yr8 (DD)D
      // 39b: ldc2_w 180.0
      // 39e: dmul
      // 39f: ldc2_w 3.141592653589793
      // 3a2: ddiv
      // 3a3: d2f
      // 3a4: ldc 90.0
      // 3a6: nop
      // 3a7: fsub
      // 3a8: putfield c5x.y2i F
      // 3ab: aload 0
      // 3ac: getfield c5x.y2i F
      // 3af: aload 0
      // 3b0: getfield c5x.j25 F
      // 3b3: fsub
      // 3b4: ldc -180.0
      // 3b6: nop
      // 3b7: fcmpg
      // 3b8: ifge 3d6
      // 3bb: aload 0
      // 3bc: dup
      // 3bd: getfield c5x.j25 F
      // 3c0: ldc 360.0
      // 3c2: nop
      // 3c3: fsub
      // 3c4: putfield c5x.j25 F
      // 3c7: iload 1
      // 3c8: ifeq 401
      // 3cb: iload 1
      // 3cc: ifne 3ab
      // 3cf: goto 3d6
      // 3d2: invokestatic c5x.a (Loov;)Loov;
      // 3d5: athrow
      // 3d6: aload 0
      // 3d7: getfield c5x.y2i F
      // 3da: aload 0
      // 3db: getfield c5x.j25 F
      // 3de: fsub
      // 3df: ldc 180.0
      // 3e1: nop
      // 3e2: fcmpl
      // 3e3: iflt 401
      // 3e6: aload 0
      // 3e7: dup
      // 3e8: getfield c5x.j25 F
      // 3eb: ldc 360.0
      // 3ed: nop
      // 3ee: fadd
      // 3ef: putfield c5x.j25 F
      // 3f2: iload 1
      // 3f3: ifeq 433
      // 3f6: iload 1
      // 3f7: ifne 3d6
      // 3fa: goto 401
      // 3fd: invokestatic c5x.a (Loov;)Loov;
      // 400: athrow
      // 401: aload 0
      // 402: getfield c5x.x5k F
      // 405: aload 0
      // 406: getfield c5x.p3h F
      // 409: fsub
      // 40a: ldc -180.0
      // 40c: nop
      // 40d: fcmpg
      // 40e: ifge 433
      // 411: aload 0
      // 412: dup
      // 413: getfield c5x.p3h F
      // 416: ldc 360.0
      // 418: nop
      // 419: fsub
      // 41a: putfield c5x.p3h F
      // 41d: iload 1
      // 41e: ifeq 491
      // 421: goto 428
      // 424: invokestatic c5x.a (Loov;)Loov;
      // 427: athrow
      // 428: iload 1
      // 429: ifne 401
      // 42c: goto 433
      // 42f: invokestatic c5x.a (Loov;)Loov;
      // 432: athrow
      // 433: aload 0
      // 434: getfield c5x.x5k F
      // 437: aload 0
      // 438: getfield c5x.p3h F
      // 43b: fsub
      // 43c: ldc 180.0
      // 43e: nop
      // 43f: fcmpl
      // 440: iflt 465
      // 443: aload 0
      // 444: dup
      // 445: getfield c5x.p3h F
      // 448: ldc 360.0
      // 44a: nop
      // 44b: fadd
      // 44c: putfield c5x.p3h F
      // 44f: iload 1
      // 450: ifeq 491
      // 453: goto 45a
      // 456: invokestatic c5x.a (Loov;)Loov;
      // 459: athrow
      // 45a: iload 1
      // 45b: ifne 433
      // 45e: goto 465
      // 461: invokestatic c5x.a (Loov;)Loov;
      // 464: athrow
      // 465: aload 0
      // 466: aload 0
      // 467: getfield c5x.j25 F
      // 46a: aload 0
      // 46b: getfield c5x.y2i F
      // 46e: aload 0
      // 46f: getfield c5x.j25 F
      // 472: fsub
      // 473: ldc 0.2
      // 475: nop
      // 476: fmul
      // 477: fadd
      // 478: putfield c5x.y2i F
      // 47b: aload 0
      // 47c: aload 0
      // 47d: getfield c5x.p3h F
      // 480: aload 0
      // 481: getfield c5x.x5k F
      // 484: aload 0
      // 485: getfield c5x.p3h F
      // 488: fsub
      // 489: ldc 0.2
      // 48b: nop
      // 48c: fmul
      // 48d: fadd
      // 48e: putfield c5x.x5k F
      // 491: aload 0
      // 492: invokevirtual c5x.ew9 ()F
      // 495: fstore 10
      // 497: aload 0
      // 498: iload 1
      // 499: ifeq 57a
      // 49c: invokevirtual c5x.mwv ()Z
      // 49f: ifeq 50e
      // 4a2: goto 4a9
      // 4a5: invokestatic c5x.a (Loov;)Loov;
      // 4a8: athrow
      // 4a9: bipush 0
      // 4aa: istore 11
      // 4ac: iload 11
      // 4ae: bipush 4
      // 4af: if_icmpge 509
      // 4b2: ldc 0.25
      // 4b4: nop
      // 4b5: fstore 12
      // 4b7: aload 0
      // 4b8: getfield c5x.oay Lt9d;
      // 4bb: getstatic w_0.w_h Lw_0;
      // 4be: aload 0
      // 4bf: getfield c5x.o2v D
      // 4c2: aload 0
      // 4c3: getfield c5x.icv D
      // 4c6: fload 12
      // 4c8: f2d
      // 4c9: dmul
      // 4ca: dsub
      // 4cb: aload 0
      // 4cc: getfield c5x.kfp D
      // 4cf: aload 0
      // 4d0: getfield c5x.mop D
      // 4d3: fload 12
      // 4d5: f2d
      // 4d6: dmul
      // 4d7: dsub
      // 4d8: aload 0
      // 4d9: getfield c5x.vbd D
      // 4dc: aload 0
      // 4dd: getfield c5x.bw4 D
      // 4e0: fload 12
      // 4e2: f2d
      // 4e3: dmul
      // 4e4: dsub
      // 4e5: aload 0
      // 4e6: getfield c5x.icv D
      // 4e9: aload 0
      // 4ea: getfield c5x.mop D
      // 4ed: aload 0
      // 4ee: getfield c5x.bw4 D
      // 4f1: bipush 0
      // 4f2: newarray 10
      // 4f4: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 4f7: iinc 11 1
      // 4fa: iload 1
      // 4fb: ifeq 589
      // 4fe: iload 1
      // 4ff: ifne 4ac
      // 502: goto 509
      // 505: invokestatic c5x.a (Loov;)Loov;
      // 508: athrow
      // 509: ldc 0.8
      // 50b: nop
      // 50c: fstore 10
      // 50e: aload 0
      // 50f: dup
      // 510: getfield c5x.icv D
      // 513: aload 0
      // 514: getfield c5x.ax4 D
      // 517: dadd
      // 518: putfield c5x.icv D
      // 51b: aload 0
      // 51c: dup
      // 51d: getfield c5x.mop D
      // 520: aload 0
      // 521: getfield c5x.mjx D
      // 524: dadd
      // 525: putfield c5x.mop D
      // 528: aload 0
      // 529: dup
      // 52a: getfield c5x.bw4 D
      // 52d: aload 0
      // 52e: getfield c5x.ehh D
      // 531: dadd
      // 532: putfield c5x.bw4 D
      // 535: aload 0
      // 536: dup
      // 537: getfield c5x.icv D
      // 53a: fload 10
      // 53c: f2d
      // 53d: dmul
      // 53e: putfield c5x.icv D
      // 541: aload 0
      // 542: dup
      // 543: getfield c5x.mop D
      // 546: fload 10
      // 548: f2d
      // 549: dmul
      // 54a: putfield c5x.mop D
      // 54d: aload 0
      // 54e: dup
      // 54f: getfield c5x.bw4 D
      // 552: fload 10
      // 554: f2d
      // 555: dmul
      // 556: putfield c5x.bw4 D
      // 559: aload 0
      // 55a: getfield c5x.oay Lt9d;
      // 55d: getstatic w_0.bac Lw_0;
      // 560: aload 0
      // 561: getfield c5x.o2v D
      // 564: aload 0
      // 565: getfield c5x.kfp D
      // 568: ldc2_w 0.5
      // 56b: dadd
      // 56c: aload 0
      // 56d: getfield c5x.vbd D
      // 570: dconst_0
      // 571: dconst_0
      // 572: dconst_0
      // 573: bipush 0
      // 574: newarray 10
      // 576: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 579: aload 0
      // 57a: aload 0
      // 57b: getfield c5x.o2v D
      // 57e: aload 0
      // 57f: getfield c5x.kfp D
      // 582: aload 0
      // 583: getfield c5x.vbd D
      // 586: invokevirtual c5x.m6_ (DDD)V
      // 589: iload 1
      // 58a: ifne 598
      // 58d: aload 0
      // 58e: goto 595
      // 591: invokestatic c5x.a (Loov;)Loov;
      // 594: athrow
      // 595: invokevirtual c5x._kl ()V
      // 598: return
   }

   public float ew9() {
      return 0.95F;
   }

   public abstract void f7x(akm var1);

   @Override
   public void srs(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic c5x.b J
      // 03: ldc2_w 121582147660407
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: sipush 4452
      // 0c: ldc2_w 6254053323675079588
      // 0f: lload 2
      // 10: lxor
      // 11: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16: nop
      // 17: aload 0
      // 18: getfield c5x.ucg I
      // 1b: i2s
      // 1c: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 1f: invokestatic t9d.c ()I
      // 22: aload 1
      // 23: sipush 22956
      // 26: ldc2_w 6078096980116462433
      // 29: lload 2
      // 2a: lxor
      // 2b: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: nop
      // 31: aload 0
      // 32: getfield c5x.enf I
      // 35: i2s
      // 36: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 39: aload 1
      // 3a: sipush 32222
      // 3d: ldc2_w 1076600223655493404
      // 40: lload 2
      // 41: lxor
      // 42: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: aload 0
      // 49: getfield c5x.yt8 I
      // 4c: i2s
      // 4d: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 50: getstatic e0x.db8 Ljnv;
      // 53: aload 0
      // 54: getfield c5x.lpk Le0x;
      // 57: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 5a: checkcast gdz
      // 5d: astore 5
      // 5f: istore 4
      // 61: aload 1
      // 62: sipush 27332
      // 65: ldc2_w 3463501397181130762
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: nop
      // 70: aload 5
      // 72: iload 4
      // 74: ifne 8d
      // 77: ifnonnull 8b
      // 7a: goto 81
      // 7d: invokestatic c5x.a (Loov;)Loov;
      // 80: athrow
      // 81: ldc ""
      // 83: nop
      // 84: goto 90
      // 87: invokestatic c5x.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 5
      // 8d: invokevirtual gdz.toString ()Ljava/lang/String;
      // 90: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 93: aload 1
      // 94: sipush 17240
      // 97: ldc2_w 2006448530793185689
      // 9a: lload 2
      // 9b: lxor
      // 9c: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: nop
      // a2: aload 0
      // a3: getfield c5x.o_s Z
      // a6: iload 4
      // a8: ifne b6
      // ab: ifeq b9
      // ae: goto b5
      // b1: invokestatic c5x.a (Loov;)Loov;
      // b4: athrow
      // b5: bipush 1
      // b6: goto ba
      // b9: bipush 0
      // ba: i2b
      // bb: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // be: aload 1
      // bf: sipush 5519
      // c2: ldc2_w 5126173298381821764
      // c5: lload 2
      // c6: lxor
      // c7: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // cc: nop
      // cd: aload 0
      // ce: bipush 3
      // cf: newarray 7
      // d1: dup
      // d2: bipush 0
      // d3: aload 0
      // d4: getfield c5x.icv D
      // d7: dastore
      // d8: dup
      // d9: bipush 1
      // da: aload 0
      // db: getfield c5x.mop D
      // de: dastore
      // df: dup
      // e0: bipush 2
      // e1: aload 0
      // e2: getfield c5x.bw4 D
      // e5: dastore
      // e6: invokevirtual c5x.r0b ([D)Lqhg;
      // e9: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // ec: return
   }

   @Override
   public void cjb(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic c5x.b J
      // 003: ldc2_w 26638627079900
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: sipush 22383
      // 00d: ldc2_w 4196198813113760014
      // 010: lload 2
      // 011: lxor
      // 012: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: nop
      // 018: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 01b: putfield c5x.ucg I
      // 01e: invokestatic t9d.b ()I
      // 021: aload 0
      // 022: aload 1
      // 023: sipush 8700
      // 026: ldc2_w 2540349897617756062
      // 029: lload 2
      // 02a: lxor
      // 02b: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 034: putfield c5x.enf I
      // 037: istore 4
      // 039: aload 0
      // 03a: aload 1
      // 03b: sipush 9438
      // 03e: ldc2_w 7122964361655405242
      // 041: lload 2
      // 042: lxor
      // 043: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: nop
      // 049: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 04c: iload 4
      // 04e: ifeq 0b5
      // 051: putfield c5x.yt8 I
      // 054: aload 1
      // 055: sipush 14857
      // 058: ldc2_w 1646843734233732206
      // 05b: lload 2
      // 05c: lxor
      // 05d: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: nop
      // 063: bipush 8
      // 065: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 068: ifeq 097
      // 06b: goto 072
      // 06e: invokestatic c5x.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 0
      // 073: aload 1
      // 074: sipush 27332
      // 077: ldc2_w 3463446809309054113
      // 07a: lload 2
      // 07b: lxor
      // 07c: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: nop
      // 082: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 085: invokestatic e0x.mdd (Ljava/lang/String;)Le0x;
      // 088: putfield c5x.lpk Le0x;
      // 08b: iload 4
      // 08d: ifne 0bb
      // 090: goto 097
      // 093: invokestatic c5x.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 0
      // 098: aload 1
      // 099: sipush 27332
      // 09c: ldc2_w 3463446809309054113
      // 09f: lload 2
      // 0a0: lxor
      // 0a1: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: nop
      // 0a7: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0aa: sipush 255
      // 0ad: iand
      // 0ae: goto 0b5
      // 0b1: invokestatic c5x.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: invokestatic e0x.csc (I)Le0x;
      // 0b8: putfield c5x.lpk Le0x;
      // 0bb: aload 0
      // 0bc: aload 1
      // 0bd: sipush 13992
      // 0c0: ldc2_w 8698899598331402443
      // 0c3: lload 2
      // 0c4: lxor
      // 0c5: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: nop
      // 0cb: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0ce: iload 4
      // 0d0: ifeq 0e6
      // 0d3: bipush 1
      // 0d4: if_icmpne 0e9
      // 0d7: goto 0de
      // 0da: invokestatic c5x.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: bipush 1
      // 0df: goto 0e6
      // 0e2: invokestatic c5x.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: goto 0ea
      // 0e9: bipush 0
      // 0ea: putfield c5x.o_s Z
      // 0ed: aload 1
      // 0ee: sipush 2932
      // 0f1: ldc2_w 4317401547121124636
      // 0f4: lload 2
      // 0f5: lxor
      // 0f6: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fb: nop
      // 0fc: bipush 9
      // 0fe: iload 4
      // 100: ifeq 128
      // 103: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 106: ifeq 150
      // 109: goto 110
      // 10c: invokestatic c5x.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 1
      // 111: sipush 5519
      // 114: ldc2_w 5126123160063409135
      // 117: lload 2
      // 118: lxor
      // 119: invokedynamic s (IJ)Ljava/lang/String; bsm=c5x.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11e: nop
      // 11f: bipush 6
      // 121: goto 128
      // 124: invokestatic c5x.a (Loov;)Loov;
      // 127: athrow
      // 128: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 12b: astore 5
      // 12d: aload 0
      // 12e: aload 5
      // 130: bipush 0
      // 131: invokevirtual qhg.ho9 (I)D
      // 134: putfield c5x.icv D
      // 137: aload 0
      // 138: aload 5
      // 13a: bipush 1
      // 13b: invokevirtual qhg.ho9 (I)D
      // 13e: putfield c5x.mop D
      // 141: aload 0
      // 142: aload 5
      // 144: bipush 2
      // 145: invokevirtual qhg.ho9 (I)D
      // 148: putfield c5x.bw4 D
      // 14b: iload 4
      // 14d: ifne 15b
      // 150: aload 0
      // 151: invokevirtual c5x._kl ()V
      // 154: goto 15b
      // 157: invokestatic c5x.a (Loov;)Loov;
      // 15a: athrow
      // 15b: return
   }

   @Override
   public boolean mzu() {
      return true;
   }

   @Override
   public float npl() {
      return 1.0F;
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 25
      // 09: aload 1
      // 0a: invokevirtual c5x.nss (Lofh;)Z
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic c5x.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic c5x.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: invokevirtual c5x.dxm ()V
      // 21: aload 1
      // 22: invokevirtual ofh.nra ()Li2h;
      // 25: iload 3
      // 26: ifne 3e
      // 29: ifnull c2
      // 2c: goto 33
      // 2f: invokestatic c5x.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 1
      // 34: invokevirtual ofh.nra ()Li2h;
      // 37: goto 3e
      // 3a: invokestatic c5x.a (Loov;)Loov;
      // 3d: athrow
      // 3e: invokevirtual i2h.m77 ()Lfqr;
      // 41: astore 4
      // 43: iload 3
      // 44: ifne 8d
      // 47: aload 4
      // 49: ifnull 99
      // 4c: goto 53
      // 4f: invokestatic c5x.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: aload 4
      // 56: getfield fqr.lvi D
      // 59: putfield c5x.icv D
      // 5c: aload 0
      // 5d: aload 4
      // 5f: getfield fqr.gn5 D
      // 62: putfield c5x.mop D
      // 65: aload 0
      // 66: aload 4
      // 68: getfield fqr.bn2 D
      // 6b: putfield c5x.bw4 D
      // 6e: aload 0
      // 6f: aload 0
      // 70: getfield c5x.icv D
      // 73: ldc2_w 0.1
      // 76: dmul
      // 77: putfield c5x.ax4 D
      // 7a: aload 0
      // 7b: aload 0
      // 7c: getfield c5x.mop D
      // 7f: ldc2_w 0.1
      // 82: dmul
      // 83: putfield c5x.mjx D
      // 86: goto 8d
      // 89: invokestatic c5x.a (Loov;)Loov;
      // 8c: athrow
      // 8d: aload 0
      // 8e: aload 0
      // 8f: getfield c5x.bw4 D
      // 92: ldc2_w 0.1
      // 95: dmul
      // 96: putfield c5x.ehh D
      // 99: aload 1
      // 9a: invokevirtual ofh.nra ()Li2h;
      // 9d: instanceof g_3
      // a0: iload 3
      // a1: ifne c1
      // a4: ifeq c0
      // a7: goto ae
      // aa: invokestatic c5x.a (Loov;)Loov;
      // ad: athrow
      // ae: aload 0
      // af: aload 1
      // b0: invokevirtual ofh.nra ()Li2h;
      // b3: checkcast g_3
      // b6: putfield c5x.gen Lg_3;
      // b9: goto c0
      // bc: invokestatic c5x.a (Loov;)Loov;
      // bf: athrow
      // c0: bipush 1
      // c1: ireturn
      // c2: bipush 0
      // c3: ireturn
   }

   @Override
   public float xeu(float var1) {
      return 1.0F;
   }

   @Override
   public int azk(float var1) {
      return 15728880;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-9024854058376066209L, -4184930225308370652L, MethodHandles.lookup().lookupClass()).a(162949050867813L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 79872169498502L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[12];
      int var7 = 0;
      String var6 = "½\u0092\u0083\u0019\u0003W\u0093\\\u0097F|RM¡\u009eü \u009c\"2¹V\u0085üèºÿ.*\u000eÙ\u0014«êty%qó¦`¥\u0006×ø\u0093»ÔP ~å½e´ó Ò¶bMN9§?èT*\u001a«ì$hL\u0010bg§]zz\\\u0010\u0088á\u0003 \u0011\u009a¿\u009eÄ_*î\u0013Þ\u0005Õ\u0010v\u000fímí\n\b\u0087÷ü\u008aÆÞÝdK\u00108ý\u0005©\u0005Ë[A\u0015Ë1Q\u008a\u008aXö\u0010|ñW£Í\u0005CÑ\u001d¥\\JcÉ^\u000e\u0010[\u0019Ç)°\u00145qÇXã1´®É¨ Íz\u0081]\u0082ýê¬\u0099\u0005\u009f\u0085eÏß\u0015î©\u0015%û¾\u0087\u0000\u0006þ>À£iÞ\u0095\u0010j\u0091M¶HKô»3«]Ï>DÃß";
      int var8 = "½\u0092\u0083\u0019\u0003W\u0093\\\u0097F|RM¡\u009eü \u009c\"2¹V\u0085üèºÿ.*\u000eÙ\u0014«êty%qó¦`¥\u0006×ø\u0093»ÔP ~å½e´ó Ò¶bMN9§?èT*\u001a«ì$hL\u0010bg§]zz\\\u0010\u0088á\u0003 \u0011\u009a¿\u009eÄ_*î\u0013Þ\u0005Õ\u0010v\u000fímí\n\b\u0087÷ü\u008aÆÞÝdK\u00108ý\u0005©\u0005Ë[A\u0015Ë1Q\u008a\u008aXö\u0010|ñW£Í\u0005CÑ\u001d¥\\JcÉ^\u000e\u0010[\u0019Ç)°\u00145qÇXã1´®É¨ Íz\u0081]\u0082ýê¬\u0099\u0005\u009f\u0085eÏß\u0015î©\u0015%û¾\u0087\u0000\u0006þ>À£iÞ\u0095\u0010j\u0091M¶HKô»3«]Ï>DÃß"
         .length();
      char var5 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[12];
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

                  var6 = "r\u001có\u0007âÖÂ\u008cÚ9\u0091±Ü\u008b)le[`°\\\u009b}\u008b\u0010¡+½õ<ânAWÜÓþIç%×";
                  var8 = "r\u001có\u0007âÖÂ\u008cÚ9\u0091±Ü\u008b)le[`°\\\u009b}\u008b\u0010¡+½õ<ânAWÜÓþIç%×".length();
                  var5 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16037;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("c5x", var10);
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
         throw new RuntimeException("c5x" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
