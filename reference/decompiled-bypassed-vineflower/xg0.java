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

public abstract class xg0 extends i2h implements wdc {
   private int dcj = -1;
   private int c0y = -1;
   private int uvy = -1;
   private e0x i1h;
   public boolean bjj;
   public int ald;
   private g_3 r2b;
   private String i3h;
   private int t_i;
   private int xhv;
   private static final long c;
   private static final String[] d;
   private static final String[] e;
   private static final Map g = new HashMap(13);

   public xg0(t9d var1) {
      super(var1);
      this.yxc(0.25F, 0.25F);
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
               throw b(var7);
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
         throw b(var6);
      }

      return (boolean)0;
   }

   public xg0(t9d var1, g_3 var2) {
      super(var1);
      this.r2b = var2;
      this.yxc(0.25F, 0.25F);
      this.x24(var2.o2v, var2.kfp + (double)var2.c5y(), var2.vbd, var2.x5k, var2.y2i);
      this.o2v = this.o2v - (double)(fe6.ssk(this.x5k / 180.0F * (float) Math.PI) * 0.16F);
      this.kfp -= 0.1F;
      this.vbd = this.vbd - (double)(fe6.rtn(this.x5k / 180.0F * (float) Math.PI) * 0.16F);
      this.m6_(this.o2v, this.kfp, this.vbd);
      float var3 = 0.4F;
      this.icv = (double)(-fe6.rtn(this.x5k / 180.0F * (float) Math.PI) * fe6.ssk(this.y2i / 180.0F * (float) Math.PI) * var3);
      this.bw4 = (double)(fe6.ssk(this.x5k / 180.0F * (float) Math.PI) * fe6.ssk(this.y2i / 180.0F * (float) Math.PI) * var3);
      this.mop = (double)(-fe6.rtn((this.y2i + this.ch3()) / 180.0F * (float) Math.PI) * var3);
      this.bob(this.icv, this.mop, this.bw4, this.t9b(), 1.0F);
   }

   public xg0(t9d var1, double var2, double var4, double var6) {
      super(var1);
      this.t_i = 0;
      this.yxc(0.25F, 0.25F);
      this.m6_(var2, var4, var6);
   }

   public float t9b() {
      return 1.5F;
   }

   public float ch3() {
      return 0.0F;
   }

   @Override
   public void bob(double var1, double var3, double var5, float var7, float var8) {
      float var9 = fe6.dii(var1 * var1 + var3 * var3 + var5 * var5);
      var1 /= (double)var9;
      var3 /= (double)var9;
      var5 /= (double)var9;
      var1 += this.z2d.nextGaussian() * 0.0075F * (double)var8;
      var3 += this.z2d.nextGaussian() * 0.0075F * (double)var8;
      var5 += this.z2d.nextGaussian() * 0.0075F * (double)var8;
      var1 *= (double)var7;
      var3 *= (double)var7;
      var5 *= (double)var7;
      this.icv = var1;
      this.mop = var3;
      this.bw4 = var5;
      float var10 = fe6.dii(var1 * var1 + var5 * var5);
      this.p3h = this.x5k = (float)(fe6.yr8(var1, var5) * 180.0 / Math.PI);
      this.j25 = this.y2i = (float)(fe6.yr8(var3, (double)var10) * 180.0 / Math.PI);
      this.t_i = 0;
   }

   @Override
   public void lmm(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dload 1
      // 02: putfield xg0.icv D
      // 05: aload 0
      // 06: dload 3
      // 07: putfield xg0.mop D
      // 0a: invokestatic t9d.b ()I
      // 0d: aload 0
      // 0e: dload 5
      // 10: putfield xg0.bw4 D
      // 13: istore 7
      // 15: aload 0
      // 16: getfield xg0.j25 F
      // 19: fconst_0
      // 1a: fcmpl
      // 1b: iload 7
      // 1d: ifeq 43
      // 20: ifne 8c
      // 23: goto 2a
      // 26: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield xg0.p3h F
      // 2e: iload 7
      // 30: ifeq 59
      // 33: goto 3a
      // 36: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: fconst_0
      // 3b: fcmpl
      // 3c: goto 43
      // 3f: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: ifne 8c
      // 46: dload 1
      // 47: dload 1
      // 48: dmul
      // 49: dload 5
      // 4b: dload 5
      // 4d: dmul
      // 4e: dadd
      // 4f: invokestatic fe6.dii (D)F
      // 52: goto 59
      // 55: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: fstore 8
      // 5b: aload 0
      // 5c: aload 0
      // 5d: dload 1
      // 5e: dload 5
      // 60: invokestatic fe6.yr8 (DD)D
      // 63: ldc2_w 180.0
      // 66: dmul
      // 67: ldc2_w 3.141592653589793
      // 6a: ddiv
      // 6b: d2f
      // 6c: dup_x1
      // 6d: putfield xg0.x5k F
      // 70: putfield xg0.p3h F
      // 73: aload 0
      // 74: aload 0
      // 75: dload 3
      // 76: fload 8
      // 78: f2d
      // 79: invokestatic fe6.yr8 (DD)D
      // 7c: ldc2_w 180.0
      // 7f: dmul
      // 80: ldc2_w 3.141592653589793
      // 83: ddiv
      // 84: d2f
      // 85: dup_x1
      // 86: putfield xg0.y2i F
      // 89: putfield xg0.j25 F
      // 8c: return
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
      // 000: aload 0
      // 001: aload 0
      // 002: getfield xg0.o2v D
      // 005: putfield xg0.ivp D
      // 008: aload 0
      // 009: aload 0
      // 00a: getfield xg0.kfp D
      // 00d: putfield xg0.c54 D
      // 010: invokestatic t9d.b ()I
      // 013: aload 0
      // 014: aload 0
      // 015: getfield xg0.vbd D
      // 018: putfield xg0.e2b D
      // 01b: istore 1
      // 01c: aload 0
      // 01d: invokespecial i2h.xx_ ()V
      // 020: aload 0
      // 021: getfield xg0.ald I
      // 024: iload 1
      // 025: ifeq 052
      // 028: ifle 043
      // 02b: goto 032
      // 02e: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: aload 0
      // 033: dup
      // 034: getfield xg0.ald I
      // 037: bipush 1
      // 038: isub
      // 039: putfield xg0.ald I
      // 03c: goto 043
      // 03f: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 042: athrow
      // 043: aload 0
      // 044: iload 1
      // 045: ifeq 119
      // 048: getfield xg0.bjj Z
      // 04b: goto 052
      // 04e: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: ifeq 111
      // 055: aload 0
      // 056: iload 1
      // 057: ifeq 109
      // 05a: goto 061
      // 05d: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: getfield xg0.oay Lt9d;
      // 064: new mew
      // 067: dup
      // 068: aload 0
      // 069: getfield xg0.dcj I
      // 06c: aload 0
      // 06d: getfield xg0.c0y I
      // 070: aload 0
      // 071: getfield xg0.uvy I
      // 074: invokespecial mew.<init> (III)V
      // 077: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 07a: invokeinterface zfz.r_y ()Le0x; 1
      // 07f: aload 0
      // 080: getfield xg0.i1h Le0x;
      // 083: if_acmpne 0bf
      // 086: goto 08d
      // 089: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08c: athrow
      // 08d: aload 0
      // 08e: dup
      // 08f: getfield xg0.t_i I
      // 092: bipush 1
      // 093: iadd
      // 094: putfield xg0.t_i I
      // 097: aload 0
      // 098: iload 1
      // 099: ifeq 0bb
      // 09c: goto 0a3
      // 09f: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: getfield xg0.t_i I
      // 0a6: sipush 1200
      // 0a9: if_icmpne 0be
      // 0ac: goto 0b3
      // 0af: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: goto 0bb
      // 0b7: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: invokevirtual xg0._kl ()V
      // 0be: return
      // 0bf: aload 0
      // 0c0: bipush 0
      // 0c1: putfield xg0.bjj Z
      // 0c4: aload 0
      // 0c5: dup
      // 0c6: getfield xg0.icv D
      // 0c9: aload 0
      // 0ca: getfield xg0.z2d Ljava/util/Random;
      // 0cd: invokevirtual java/util/Random.nextFloat ()F
      // 0d0: ldc 0.2
      // 0d2: nop
      // 0d3: fmul
      // 0d4: f2d
      // 0d5: dmul
      // 0d6: putfield xg0.icv D
      // 0d9: aload 0
      // 0da: dup
      // 0db: getfield xg0.mop D
      // 0de: aload 0
      // 0df: getfield xg0.z2d Ljava/util/Random;
      // 0e2: invokevirtual java/util/Random.nextFloat ()F
      // 0e5: ldc 0.2
      // 0e7: nop
      // 0e8: fmul
      // 0e9: f2d
      // 0ea: dmul
      // 0eb: putfield xg0.mop D
      // 0ee: aload 0
      // 0ef: dup
      // 0f0: getfield xg0.bw4 D
      // 0f3: aload 0
      // 0f4: getfield xg0.z2d Ljava/util/Random;
      // 0f7: invokevirtual java/util/Random.nextFloat ()F
      // 0fa: ldc 0.2
      // 0fc: nop
      // 0fd: fmul
      // 0fe: f2d
      // 0ff: dmul
      // 100: putfield xg0.bw4 D
      // 103: aload 0
      // 104: bipush 0
      // 105: putfield xg0.t_i I
      // 108: aload 0
      // 109: bipush 0
      // 10a: putfield xg0.xhv I
      // 10d: iload 1
      // 10e: ifne 122
      // 111: aload 0
      // 112: goto 119
      // 115: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 118: athrow
      // 119: dup
      // 11a: getfield xg0.xhv I
      // 11d: bipush 1
      // 11e: iadd
      // 11f: putfield xg0.xhv I
      // 122: new fqr
      // 125: dup
      // 126: aload 0
      // 127: getfield xg0.o2v D
      // 12a: aload 0
      // 12b: getfield xg0.kfp D
      // 12e: aload 0
      // 12f: getfield xg0.vbd D
      // 132: invokespecial fqr.<init> (DDD)V
      // 135: astore 2
      // 136: new fqr
      // 139: dup
      // 13a: aload 0
      // 13b: getfield xg0.o2v D
      // 13e: aload 0
      // 13f: getfield xg0.icv D
      // 142: dadd
      // 143: aload 0
      // 144: getfield xg0.kfp D
      // 147: aload 0
      // 148: getfield xg0.mop D
      // 14b: dadd
      // 14c: aload 0
      // 14d: getfield xg0.vbd D
      // 150: aload 0
      // 151: getfield xg0.bw4 D
      // 154: dadd
      // 155: invokespecial fqr.<init> (DDD)V
      // 158: astore 3
      // 159: aload 0
      // 15a: getfield xg0.oay Lt9d;
      // 15d: aload 2
      // 15e: aload 3
      // 15f: invokevirtual t9d.caq (Lfqr;Lfqr;)Lakm;
      // 162: astore 4
      // 164: new fqr
      // 167: dup
      // 168: aload 0
      // 169: getfield xg0.o2v D
      // 16c: aload 0
      // 16d: getfield xg0.kfp D
      // 170: aload 0
      // 171: getfield xg0.vbd D
      // 174: invokespecial fqr.<init> (DDD)V
      // 177: astore 2
      // 178: new fqr
      // 17b: dup
      // 17c: aload 0
      // 17d: getfield xg0.o2v D
      // 180: aload 0
      // 181: getfield xg0.icv D
      // 184: dadd
      // 185: aload 0
      // 186: getfield xg0.kfp D
      // 189: aload 0
      // 18a: getfield xg0.mop D
      // 18d: dadd
      // 18e: aload 0
      // 18f: getfield xg0.vbd D
      // 192: aload 0
      // 193: getfield xg0.bw4 D
      // 196: dadd
      // 197: invokespecial fqr.<init> (DDD)V
      // 19a: iload 1
      // 19b: ifeq 1ca
      // 19e: astore 3
      // 19f: aload 4
      // 1a1: ifnull 1cb
      // 1a4: new fqr
      // 1a7: dup
      // 1a8: aload 4
      // 1aa: getfield akm.jhn Lfqr;
      // 1ad: getfield fqr.lvi D
      // 1b0: aload 4
      // 1b2: getfield akm.jhn Lfqr;
      // 1b5: getfield fqr.gn5 D
      // 1b8: aload 4
      // 1ba: getfield akm.jhn Lfqr;
      // 1bd: getfield fqr.bn2 D
      // 1c0: invokespecial fqr.<init> (DDD)V
      // 1c3: goto 1ca
      // 1c6: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c9: athrow
      // 1ca: astore 3
      // 1cb: aload 0
      // 1cc: getfield xg0.oay Lt9d;
      // 1cf: getfield t9d.v0f Z
      // 1d2: ifne 2e3
      // 1d5: aconst_null
      // 1d6: astore 5
      // 1d8: aload 0
      // 1d9: getfield xg0.oay Lt9d;
      // 1dc: aload 0
      // 1dd: aload 0
      // 1de: invokevirtual xg0.aaw ()Lnh4;
      // 1e1: aload 0
      // 1e2: getfield xg0.icv D
      // 1e5: aload 0
      // 1e6: getfield xg0.mop D
      // 1e9: aload 0
      // 1ea: getfield xg0.bw4 D
      // 1ed: invokevirtual nh4.z9h (DDD)Lnh4;
      // 1f0: dconst_1
      // 1f1: dconst_1
      // 1f2: dconst_1
      // 1f3: invokevirtual nh4.c2h (DDD)Lnh4;
      // 1f6: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 1f9: astore 6
      // 1fb: dconst_0
      // 1fc: dstore 7
      // 1fe: aload 0
      // 1ff: invokevirtual xg0.lmd ()Lg_3;
      // 202: astore 9
      // 204: bipush 0
      // 205: istore 10
      // 207: iload 10
      // 209: aload 6
      // 20b: invokeinterface java/util/List.size ()I 1
      // 210: if_icmpge 2d3
      // 213: aload 6
      // 215: iload 10
      // 217: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 21c: checkcast i2h
      // 21f: astore 11
      // 221: iload 1
      // 222: ifeq 2cf
      // 225: aload 11
      // 227: iload 1
      // 228: ifeq 2d5
      // 22b: goto 232
      // 22e: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 231: athrow
      // 232: invokevirtual i2h.mzu ()Z
      // 235: ifeq 2cc
      // 238: goto 23f
      // 23b: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23e: athrow
      // 23f: aload 11
      // 241: aload 9
      // 243: if_acmpne 25c
      // 246: goto 24d
      // 249: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24c: athrow
      // 24d: aload 0
      // 24e: getfield xg0.xhv I
      // 251: bipush 5
      // 252: if_icmplt 2cc
      // 255: goto 25c
      // 258: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25b: athrow
      // 25c: ldc 0.3
      // 25e: nop
      // 25f: fstore 12
      // 261: aload 11
      // 263: invokevirtual i2h.aaw ()Lnh4;
      // 266: fload 12
      // 268: f2d
      // 269: fload 12
      // 26b: f2d
      // 26c: fload 12
      // 26e: f2d
      // 26f: invokevirtual nh4.c2h (DDD)Lnh4;
      // 272: astore 13
      // 274: aload 13
      // 276: aload 2
      // 277: aload 3
      // 278: invokevirtual nh4.v35 (Lfqr;Lfqr;)Lakm;
      // 27b: astore 14
      // 27d: iload 1
      // 27e: ifeq 2cf
      // 281: aload 14
      // 283: ifnull 2cc
      // 286: goto 28d
      // 289: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28c: athrow
      // 28d: aload 2
      // 28e: aload 14
      // 290: getfield akm.jhn Lfqr;
      // 293: invokevirtual fqr.y8x (Lfqr;)D
      // 296: dstore 15
      // 298: dload 15
      // 29a: iload 1
      // 29b: ifeq 2ca
      // 29e: dload 7
      // 2a0: dcmpg
      // 2a1: iflt 2c4
      // 2a4: goto 2ab
      // 2a7: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2aa: athrow
      // 2ab: dload 7
      // 2ad: iload 1
      // 2ae: ifeq 2ca
      // 2b1: goto 2b8
      // 2b4: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b7: athrow
      // 2b8: dconst_0
      // 2b9: dcmpl
      // 2ba: ifne 2cc
      // 2bd: goto 2c4
      // 2c0: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c3: athrow
      // 2c4: aload 11
      // 2c6: astore 5
      // 2c8: dload 15
      // 2ca: dstore 7
      // 2cc: iinc 10 1
      // 2cf: iload 1
      // 2d0: ifne 207
      // 2d3: aload 5
      // 2d5: ifnull 2e3
      // 2d8: new akm
      // 2db: dup
      // 2dc: aload 5
      // 2de: invokespecial akm.<init> (Li2h;)V
      // 2e1: astore 4
      // 2e3: aload 4
      // 2e5: iload 1
      // 2e6: ifeq 2f5
      // 2e9: ifnull 348
      // 2ec: goto 2f3
      // 2ef: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f2: athrow
      // 2f3: aload 4
      // 2f5: getfield akm.oyz Lakm$qs6;
      // 2f8: getstatic akm$qs6.i4l Lakm$qs6;
      // 2fb: if_acmpne 33b
      // 2fe: aload 0
      // 2ff: iload 1
      // 300: ifeq 343
      // 303: goto 30a
      // 306: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 309: athrow
      // 30a: getfield xg0.oay Lt9d;
      // 30d: aload 4
      // 30f: invokevirtual akm._uf ()Lmew;
      // 312: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 315: invokeinterface zfz.r_y ()Le0x; 1
      // 31a: getstatic ox_.mly Luw1;
      // 31d: if_acmpne 33b
      // 320: goto 327
      // 323: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 326: athrow
      // 327: aload 0
      // 328: aload 4
      // 32a: invokevirtual akm._uf ()Lmew;
      // 32d: invokevirtual xg0.oie (Lmew;)V
      // 330: iload 1
      // 331: ifne 348
      // 334: goto 33b
      // 337: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 33a: athrow
      // 33b: aload 0
      // 33c: goto 343
      // 33f: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 342: athrow
      // 343: aload 4
      // 345: invokevirtual xg0._7u (Lakm;)V
      // 348: aload 0
      // 349: dup
      // 34a: getfield xg0.o2v D
      // 34d: aload 0
      // 34e: getfield xg0.icv D
      // 351: dadd
      // 352: putfield xg0.o2v D
      // 355: aload 0
      // 356: dup
      // 357: getfield xg0.kfp D
      // 35a: aload 0
      // 35b: getfield xg0.mop D
      // 35e: dadd
      // 35f: putfield xg0.kfp D
      // 362: aload 0
      // 363: dup
      // 364: getfield xg0.vbd D
      // 367: aload 0
      // 368: getfield xg0.bw4 D
      // 36b: dadd
      // 36c: putfield xg0.vbd D
      // 36f: aload 0
      // 370: getfield xg0.icv D
      // 373: aload 0
      // 374: getfield xg0.icv D
      // 377: dmul
      // 378: aload 0
      // 379: getfield xg0.bw4 D
      // 37c: aload 0
      // 37d: getfield xg0.bw4 D
      // 380: dmul
      // 381: dadd
      // 382: invokestatic fe6.dii (D)F
      // 385: fstore 5
      // 387: aload 0
      // 388: aload 0
      // 389: getfield xg0.icv D
      // 38c: aload 0
      // 38d: getfield xg0.bw4 D
      // 390: invokestatic fe6.yr8 (DD)D
      // 393: ldc2_w 180.0
      // 396: dmul
      // 397: ldc2_w 3.141592653589793
      // 39a: ddiv
      // 39b: d2f
      // 39c: putfield xg0.x5k F
      // 39f: aload 0
      // 3a0: aload 0
      // 3a1: getfield xg0.mop D
      // 3a4: fload 5
      // 3a6: f2d
      // 3a7: invokestatic fe6.yr8 (DD)D
      // 3aa: ldc2_w 180.0
      // 3ad: dmul
      // 3ae: ldc2_w 3.141592653589793
      // 3b1: ddiv
      // 3b2: d2f
      // 3b3: putfield xg0.y2i F
      // 3b6: aload 0
      // 3b7: getfield xg0.y2i F
      // 3ba: aload 0
      // 3bb: getfield xg0.j25 F
      // 3be: fsub
      // 3bf: ldc -180.0
      // 3c1: nop
      // 3c2: fcmpg
      // 3c3: ifge 3e1
      // 3c6: aload 0
      // 3c7: dup
      // 3c8: getfield xg0.j25 F
      // 3cb: ldc 360.0
      // 3cd: nop
      // 3ce: fsub
      // 3cf: putfield xg0.j25 F
      // 3d2: iload 1
      // 3d3: ifeq 40c
      // 3d6: iload 1
      // 3d7: ifne 3b6
      // 3da: goto 3e1
      // 3dd: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e0: athrow
      // 3e1: aload 0
      // 3e2: getfield xg0.y2i F
      // 3e5: aload 0
      // 3e6: getfield xg0.j25 F
      // 3e9: fsub
      // 3ea: ldc 180.0
      // 3ec: nop
      // 3ed: fcmpl
      // 3ee: iflt 40c
      // 3f1: aload 0
      // 3f2: dup
      // 3f3: getfield xg0.j25 F
      // 3f6: ldc 360.0
      // 3f8: nop
      // 3f9: fadd
      // 3fa: putfield xg0.j25 F
      // 3fd: iload 1
      // 3fe: ifeq 43e
      // 401: iload 1
      // 402: ifne 3e1
      // 405: goto 40c
      // 408: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40b: athrow
      // 40c: aload 0
      // 40d: getfield xg0.x5k F
      // 410: aload 0
      // 411: getfield xg0.p3h F
      // 414: fsub
      // 415: ldc -180.0
      // 417: nop
      // 418: fcmpg
      // 419: ifge 43e
      // 41c: aload 0
      // 41d: dup
      // 41e: getfield xg0.p3h F
      // 421: ldc 360.0
      // 423: nop
      // 424: fsub
      // 425: putfield xg0.p3h F
      // 428: iload 1
      // 429: ifeq 49c
      // 42c: goto 433
      // 42f: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 432: athrow
      // 433: iload 1
      // 434: ifne 40c
      // 437: goto 43e
      // 43a: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43d: athrow
      // 43e: aload 0
      // 43f: getfield xg0.x5k F
      // 442: aload 0
      // 443: getfield xg0.p3h F
      // 446: fsub
      // 447: ldc 180.0
      // 449: nop
      // 44a: fcmpl
      // 44b: iflt 470
      // 44e: aload 0
      // 44f: dup
      // 450: getfield xg0.p3h F
      // 453: ldc 360.0
      // 455: nop
      // 456: fadd
      // 457: putfield xg0.p3h F
      // 45a: iload 1
      // 45b: ifeq 49c
      // 45e: goto 465
      // 461: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 464: athrow
      // 465: iload 1
      // 466: ifne 43e
      // 469: goto 470
      // 46c: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46f: athrow
      // 470: aload 0
      // 471: aload 0
      // 472: getfield xg0.j25 F
      // 475: aload 0
      // 476: getfield xg0.y2i F
      // 479: aload 0
      // 47a: getfield xg0.j25 F
      // 47d: fsub
      // 47e: ldc 0.2
      // 480: nop
      // 481: fmul
      // 482: fadd
      // 483: putfield xg0.y2i F
      // 486: aload 0
      // 487: aload 0
      // 488: getfield xg0.p3h F
      // 48b: aload 0
      // 48c: getfield xg0.x5k F
      // 48f: aload 0
      // 490: getfield xg0.p3h F
      // 493: fsub
      // 494: ldc 0.2
      // 496: nop
      // 497: fmul
      // 498: fadd
      // 499: putfield xg0.x5k F
      // 49c: ldc 0.99
      // 49e: nop
      // 49f: fstore 6
      // 4a1: aload 0
      // 4a2: invokevirtual xg0._qq ()F
      // 4a5: fstore 7
      // 4a7: aload 0
      // 4a8: iload 1
      // 4a9: ifeq 54f
      // 4ac: invokevirtual xg0.mwv ()Z
      // 4af: ifeq 51e
      // 4b2: goto 4b9
      // 4b5: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b8: athrow
      // 4b9: bipush 0
      // 4ba: istore 8
      // 4bc: iload 8
      // 4be: bipush 4
      // 4bf: if_icmpge 519
      // 4c2: ldc 0.25
      // 4c4: nop
      // 4c5: fstore 9
      // 4c7: aload 0
      // 4c8: getfield xg0.oay Lt9d;
      // 4cb: getstatic w_0.w_h Lw_0;
      // 4ce: aload 0
      // 4cf: getfield xg0.o2v D
      // 4d2: aload 0
      // 4d3: getfield xg0.icv D
      // 4d6: fload 9
      // 4d8: f2d
      // 4d9: dmul
      // 4da: dsub
      // 4db: aload 0
      // 4dc: getfield xg0.kfp D
      // 4df: aload 0
      // 4e0: getfield xg0.mop D
      // 4e3: fload 9
      // 4e5: f2d
      // 4e6: dmul
      // 4e7: dsub
      // 4e8: aload 0
      // 4e9: getfield xg0.vbd D
      // 4ec: aload 0
      // 4ed: getfield xg0.bw4 D
      // 4f0: fload 9
      // 4f2: f2d
      // 4f3: dmul
      // 4f4: dsub
      // 4f5: aload 0
      // 4f6: getfield xg0.icv D
      // 4f9: aload 0
      // 4fa: getfield xg0.mop D
      // 4fd: aload 0
      // 4fe: getfield xg0.bw4 D
      // 501: bipush 0
      // 502: newarray 10
      // 504: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 507: iinc 8 1
      // 50a: iload 1
      // 50b: ifeq 55e
      // 50e: iload 1
      // 50f: ifne 4bc
      // 512: goto 519
      // 515: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 518: athrow
      // 519: ldc 0.8
      // 51b: nop
      // 51c: fstore 6
      // 51e: aload 0
      // 51f: dup
      // 520: getfield xg0.icv D
      // 523: fload 6
      // 525: f2d
      // 526: dmul
      // 527: putfield xg0.icv D
      // 52a: aload 0
      // 52b: dup
      // 52c: getfield xg0.mop D
      // 52f: fload 6
      // 531: f2d
      // 532: dmul
      // 533: putfield xg0.mop D
      // 536: aload 0
      // 537: dup
      // 538: getfield xg0.bw4 D
      // 53b: fload 6
      // 53d: f2d
      // 53e: dmul
      // 53f: putfield xg0.bw4 D
      // 542: aload 0
      // 543: dup
      // 544: getfield xg0.mop D
      // 547: fload 7
      // 549: f2d
      // 54a: dsub
      // 54b: putfield xg0.mop D
      // 54e: aload 0
      // 54f: aload 0
      // 550: getfield xg0.o2v D
      // 553: aload 0
      // 554: getfield xg0.kfp D
      // 557: aload 0
      // 558: getfield xg0.vbd D
      // 55b: invokevirtual xg0.m6_ (DDD)V
      // 55e: return
   }

   public float _qq() {
      return 0.03F;
   }

   public abstract void _7u(akm var1);

   @Override
   public void srs(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic xg0.c J
      // 003: ldc2_w 28002415423348
      // 006: lxor
      // 007: lstore 2
      // 008: aload 1
      // 009: sipush 1345
      // 00c: ldc2_w 2108152835858774765
      // 00f: lload 2
      // 010: lxor
      // 011: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016: nop
      // 017: aload 0
      // 018: getfield xg0.dcj I
      // 01b: i2s
      // 01c: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 01f: aload 1
      // 020: sipush 32520
      // 023: ldc2_w 2036167555843014828
      // 026: lload 2
      // 027: lxor
      // 028: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: nop
      // 02e: aload 0
      // 02f: getfield xg0.c0y I
      // 032: i2s
      // 033: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 036: invokestatic t9d.b ()I
      // 039: aload 1
      // 03a: sipush 15230
      // 03d: ldc2_w 5163364239127971025
      // 040: lload 2
      // 041: lxor
      // 042: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 047: nop
      // 048: aload 0
      // 049: getfield xg0.uvy I
      // 04c: i2s
      // 04d: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 050: istore 4
      // 052: getstatic e0x.db8 Ljnv;
      // 055: aload 0
      // 056: getfield xg0.i1h Le0x;
      // 059: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 05c: checkcast gdz
      // 05f: astore 5
      // 061: aload 1
      // 062: sipush 7180
      // 065: ldc2_w 8007659473289257895
      // 068: lload 2
      // 069: lxor
      // 06a: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 06f: nop
      // 070: aload 5
      // 072: iload 4
      // 074: ifeq 08d
      // 077: ifnonnull 08b
      // 07a: goto 081
      // 07d: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: ldc ""
      // 083: nop
      // 084: goto 090
      // 087: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08a: athrow
      // 08b: aload 5
      // 08d: invokevirtual gdz.toString ()Ljava/lang/String;
      // 090: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 093: aload 1
      // 094: bipush 46
      // 096: ldc2_w 8023571043939663756
      // 099: lload 2
      // 09a: lxor
      // 09b: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a0: nop
      // 0a1: aload 0
      // 0a2: getfield xg0.ald I
      // 0a5: i2b
      // 0a6: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 0a9: aload 1
      // 0aa: sipush 2179
      // 0ad: ldc2_w 8314483594932959008
      // 0b0: lload 2
      // 0b1: lxor
      // 0b2: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b7: nop
      // 0b8: aload 0
      // 0b9: getfield xg0.bjj Z
      // 0bc: iload 4
      // 0be: ifeq 0cc
      // 0c1: ifeq 0cf
      // 0c4: goto 0cb
      // 0c7: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: bipush 1
      // 0cc: goto 0d0
      // 0cf: bipush 0
      // 0d0: i2b
      // 0d1: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 0d4: aload 0
      // 0d5: iload 4
      // 0d7: ifeq 105
      // 0da: getfield xg0.i3h Ljava/lang/String;
      // 0dd: ifnull 104
      // 0e0: goto 0e7
      // 0e3: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: aload 0
      // 0e8: getfield xg0.i3h Ljava/lang/String;
      // 0eb: invokevirtual java/lang/String.length ()I
      // 0ee: iload 4
      // 0f0: ifeq 117
      // 0f3: goto 0fa
      // 0f6: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: ifne 125
      // 0fd: goto 104
      // 100: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: aload 0
      // 105: iload 4
      // 107: ifeq 11b
      // 10a: getfield xg0.r2b Lg_3;
      // 10d: instanceof ha9
      // 110: goto 117
      // 113: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 116: athrow
      // 117: ifeq 125
      // 11a: aload 0
      // 11b: aload 0
      // 11c: getfield xg0.r2b Lg_3;
      // 11f: invokevirtual g_3.noc ()Ljava/lang/String;
      // 122: putfield xg0.i3h Ljava/lang/String;
      // 125: aload 1
      // 126: sipush 5530
      // 129: ldc2_w 2348985295101962807
      // 12c: lload 2
      // 12d: lxor
      // 12e: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 133: nop
      // 134: aload 0
      // 135: iload 4
      // 137: ifeq 152
      // 13a: getfield xg0.i3h Ljava/lang/String;
      // 13d: ifnonnull 151
      // 140: goto 147
      // 143: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 146: athrow
      // 147: ldc ""
      // 149: nop
      // 14a: goto 155
      // 14d: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 150: athrow
      // 151: aload 0
      // 152: getfield xg0.i3h Ljava/lang/String;
      // 155: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 158: return
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
      // 000: getstatic xg0.c J
      // 003: ldc2_w 122980337796063
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: sipush 16823
      // 00d: ldc2_w 3259217062250681019
      // 010: lload 2
      // 011: lxor
      // 012: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: nop
      // 018: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 01b: putfield xg0.dcj I
      // 01e: invokestatic t9d.c ()I
      // 021: aload 0
      // 022: aload 1
      // 023: sipush 31472
      // 026: ldc2_w 5114189486499932661
      // 029: lload 2
      // 02a: lxor
      // 02b: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 034: putfield xg0.c0y I
      // 037: istore 4
      // 039: aload 0
      // 03a: aload 1
      // 03b: sipush 15985
      // 03e: ldc2_w 9047100625385942399
      // 041: lload 2
      // 042: lxor
      // 043: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: nop
      // 049: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 04c: iload 4
      // 04e: ifne 0b5
      // 051: putfield xg0.uvy I
      // 054: aload 1
      // 055: sipush 28119
      // 058: ldc2_w 3806870517164293853
      // 05b: lload 2
      // 05c: lxor
      // 05d: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: nop
      // 063: bipush 8
      // 065: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 068: ifeq 097
      // 06b: goto 072
      // 06e: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: aload 0
      // 073: aload 1
      // 074: sipush 7180
      // 077: ldc2_w 8007573255096225548
      // 07a: lload 2
      // 07b: lxor
      // 07c: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: nop
      // 082: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 085: invokestatic e0x.mdd (Ljava/lang/String;)Le0x;
      // 088: putfield xg0.i1h Le0x;
      // 08b: iload 4
      // 08d: ifeq 0bb
      // 090: goto 097
      // 093: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: aload 0
      // 098: aload 1
      // 099: sipush 7180
      // 09c: ldc2_w 8007573255096225548
      // 09f: lload 2
      // 0a0: lxor
      // 0a1: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: nop
      // 0a7: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0aa: sipush 255
      // 0ad: iand
      // 0ae: goto 0b5
      // 0b1: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: invokestatic e0x.csc (I)Le0x;
      // 0b8: putfield xg0.i1h Le0x;
      // 0bb: aload 0
      // 0bc: aload 1
      // 0bd: sipush 16546
      // 0c0: ldc2_w 1181437711872627625
      // 0c3: lload 2
      // 0c4: lxor
      // 0c5: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: nop
      // 0cb: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0ce: sipush 255
      // 0d1: iand
      // 0d2: putfield xg0.ald I
      // 0d5: aload 0
      // 0d6: aload 1
      // 0d7: sipush 11877
      // 0da: ldc2_w 5604680987447623016
      // 0dd: lload 2
      // 0de: lxor
      // 0df: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: nop
      // 0e5: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0e8: iload 4
      // 0ea: ifne 100
      // 0ed: bipush 1
      // 0ee: if_icmpne 103
      // 0f1: goto 0f8
      // 0f4: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f7: athrow
      // 0f8: bipush 1
      // 0f9: goto 100
      // 0fc: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ff: athrow
      // 100: goto 104
      // 103: bipush 0
      // 104: putfield xg0.bjj Z
      // 107: aload 0
      // 108: aconst_null
      // 109: putfield xg0.r2b Lg_3;
      // 10c: aload 0
      // 10d: aload 1
      // 10e: sipush 30140
      // 111: ldc2_w 6469306110258980541
      // 114: lload 2
      // 115: lxor
      // 116: invokedynamic f (IJ)Ljava/lang/String; bsm=xg0.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 11b: nop
      // 11c: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 11f: putfield xg0.i3h Ljava/lang/String;
      // 122: aload 0
      // 123: iload 4
      // 125: ifne 15f
      // 128: getfield xg0.i3h Ljava/lang/String;
      // 12b: ifnull 15e
      // 12e: goto 135
      // 131: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 134: athrow
      // 135: aload 0
      // 136: iload 4
      // 138: ifne 15f
      // 13b: goto 142
      // 13e: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 141: athrow
      // 142: getfield xg0.i3h Ljava/lang/String;
      // 145: invokevirtual java/lang/String.length ()I
      // 148: ifne 15e
      // 14b: goto 152
      // 14e: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 151: athrow
      // 152: aload 0
      // 153: aconst_null
      // 154: putfield xg0.i3h Ljava/lang/String;
      // 157: goto 15e
      // 15a: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: aload 0
      // 15f: aload 0
      // 160: invokevirtual xg0.lmd ()Lg_3;
      // 163: putfield xg0.r2b Lg_3;
      // 166: return
   }

   public g_3 lmd() {
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
      // 05: getfield xg0.r2b Lg_3;
      // 08: iload 1
      // 09: ifne c4
      // 0c: ifnonnull c0
      // 0f: goto 16
      // 12: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne c1
      // 1b: goto 22
      // 1e: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: getfield xg0.i3h Ljava/lang/String;
      // 25: ifnull c0
      // 28: goto 2f
      // 2b: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 1
      // 31: ifne c1
      // 34: goto 3b
      // 37: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: getfield xg0.i3h Ljava/lang/String;
      // 3e: invokevirtual java/lang/String.length ()I
      // 41: ifle c0
      // 44: goto 4b
      // 47: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 0
      // 4c: aload 0
      // 4d: getfield xg0.oay Lt9d;
      // 50: aload 0
      // 51: getfield xg0.i3h Ljava/lang/String;
      // 54: invokevirtual t9d.aev (Ljava/lang/String;)Lha9;
      // 57: putfield xg0.r2b Lg_3;
      // 5a: aload 0
      // 5b: getfield xg0.r2b Lg_3;
      // 5e: iload 1
      // 5f: ifne c4
      // 62: goto 69
      // 65: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: ifnonnull c0
      // 6c: goto 73
      // 6f: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: aload 0
      // 74: iload 1
      // 75: ifne c1
      // 78: goto 7f
      // 7b: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: getfield xg0.oay Lt9d;
      // 82: instanceof dug
      // 85: ifeq c0
      // 88: goto 8f
      // 8b: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: aload 0
      // 90: getfield xg0.oay Lt9d;
      // 93: checkcast dug
      // 96: aload 0
      // 97: getfield xg0.i3h Ljava/lang/String;
      // 9a: invokestatic java/util/UUID.fromString (Ljava/lang/String;)Ljava/util/UUID;
      // 9d: invokevirtual dug.yzl (Ljava/util/UUID;)Li2h;
      // a0: astore 2
      // a1: aload 2
      // a2: instanceof g_3
      // a5: ifeq b7
      // a8: aload 0
      // a9: aload 2
      // aa: checkcast g_3
      // ad: putfield xg0.r2b Lg_3;
      // b0: goto b7
      // b3: invokestatic xg0.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b6: athrow
      // b7: goto c0
      // ba: astore 2
      // bb: aload 0
      // bc: aconst_null
      // bd: putfield xg0.r2b Lg_3;
      // c0: aload 0
      // c1: getfield xg0.r2b Lg_3;
      // c4: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4231188484080858944L, -5056036147314187260L, MethodHandles.lookup().lookupClass()).a(129974367927015L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 52131627180198L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "n8\u009bAM*\n \u0094\u001cA\u001ajã3§dÇëè\u008dïi`J\u0099\"jSvkP\u0010©#òì)\u008b\u008f\u008c)üÒ!5m\u0007²\u0010\u001b\u001b¡`d1^VÁ\u0019\u0086=¹\u0010Á;\u0010³\u009b\u0011ë$d}-bÛX¤ó\u0087°õ\u0010?h.5Óþ·\u0012\u009a±\u0017¹\u0000\u0097Öµ ç\u009aáäÁ.¿à\u0005\u0017Ìt0d?g[\u0007\u008c\u0015«`+ènÜÜ\f[Q¶Í\u0010\u001fBã±·äuÿà(£ýmGáÃ\u0010J\u0016\u0003%XO\u0083X¿\u007fAÇ´û\u0002n\u0010\u0096\"QM ÿ\u0003×c\u000fî-1\u0018bQ\u0010©\u0080°ûE\u0010õäÝö\u001dµMÁpÆ\u0010Ï`§²\u0091%Ã®ßËVµ\u0015ÎÁî ç\u0010\u008d\u001f¸¬þ\u009f\u009eªAùFNÆ'ÔhÓ\u001b\u008a.?mG}M`Ú¢Óf";
      int var8 = "n8\u009bAM*\n \u0094\u001cA\u001ajã3§dÇëè\u008dïi`J\u0099\"jSvkP\u0010©#òì)\u008b\u008f\u008c)üÒ!5m\u0007²\u0010\u001b\u001b¡`d1^VÁ\u0019\u0086=¹\u0010Á;\u0010³\u009b\u0011ë$d}-bÛX¤ó\u0087°õ\u0010?h.5Óþ·\u0012\u009a±\u0017¹\u0000\u0097Öµ ç\u009aáäÁ.¿à\u0005\u0017Ìt0d?g[\u0007\u008c\u0015«`+ènÜÜ\f[Q¶Í\u0010\u001fBã±·äuÿà(£ýmGáÃ\u0010J\u0016\u0003%XO\u0083X¿\u007fAÇ´û\u0002n\u0010\u0096\"QM ÿ\u0003×c\u000fî-1\u0018bQ\u0010©\u0080°ûE\u0010õäÝö\u001dµMÁpÆ\u0010Ï`§²\u0091%Ã®ßËVµ\u0015ÎÁî ç\u0010\u008d\u001f¸¬þ\u009f\u009eªAùFNÆ'ÔhÓ\u001b\u008a.?mG}M`Ú¢Óf"
         .length();
      char var5 = ' ';
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
                     e = new String[14];
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

                  var6 = "bæS-s\u0016á|ÏÄ+ \u0089ÄUãóø\u0090¥\u0086\u0096Ðù\tØb\u009c¯«þÛ\u0010ÚÍªk#»\u000f/\u0007;\u0096\u0019\\\u001fDÄ";
                  var8 = "bæS-s\u0016á|ÏÄ+ \u0089ÄUãóø\u0090¥\u0086\u0096Ðù\tØb\u009c¯«þÛ\u0010ÚÍªk#»\u000f/\u0007;\u0096\u0019\\\u001fDÄ".length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable b(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 970;
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
            throw new RuntimeException("xg0", var10);
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
         throw new RuntimeException("xg0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
