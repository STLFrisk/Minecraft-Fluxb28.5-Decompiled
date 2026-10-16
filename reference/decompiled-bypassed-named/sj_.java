import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class sj_ extends EntityLivingBase {
   private static final List ta9;
   private static final List hk2;
   private static final List xud;
   private int xy1 = -1;
   private int u8k = -1;
   private int _c7 = -1;
   private e0x tgj;
   private boolean z65;
   public int nfd;
   public ha9 iqf;
   private int _w2;
   private int l4a;
   private int vfx;
   private int hpb;
   private int ko_;
   private float jul;
   public EntityLivingBase pai;
   private int ecu;
   private double kaa;
   private double s6i;
   private double euq;
   private double h28;
   private double gj0;
   private double cxf;
   private double j2f;
   private double vzo;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public static List bw8() {
      return xud;
   }

   public sj_(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.25F, 0.25F);
      this.k50 = true;
   }

   public sj_(OpaquePredicate var1, double var2, double var4, double var6, ha9 var8) {
      this(var1);
      this.m6_(var2, var4, var6);
      this.k50 = true;
      this.iqf = var8;
      var8.r44 = this;
   }

   public sj_(OpaquePredicate var1, ha9 var2) {
      super(var1);
      this.k50 = true;
      this.iqf = var2;
      this.iqf.r44 = this;
      this.yxc(0.25F, 0.25F);
      this.x24(var2.o2v, var2.kfp + (double)var2.c5y(), var2.vbd, var2.x5k, var2.y2i);
      this.o2v = this.o2v - (double)(fe6.ssk(this.x5k / 180.0F * (float) Math.PI) * 0.16F);
      this.kfp -= 0.1F;
      this.vbd = this.vbd - (double)(fe6.rtn(this.x5k / 180.0F * (float) Math.PI) * 0.16F);
      this.m6_(this.o2v, this.kfp, this.vbd);
      float var3 = 0.4F;
      this.icv = (double)(-fe6.rtn(this.x5k / 180.0F * (float) Math.PI) * fe6.ssk(this.y2i / 180.0F * (float) Math.PI) * var3);
      this.bw4 = (double)(fe6.ssk(this.x5k / 180.0F * (float) Math.PI) * fe6.ssk(this.y2i / 180.0F * (float) Math.PI) * var3);
      this.mop = (double)(-fe6.rtn(this.y2i / 180.0F * (float) Math.PI) * var3);
      this.snp(this.icv, this.mop, this.bw4, 1.5F, 1.0F);
   }

   @Override
   public void tbj() {
   }

   @Override
   public boolean xvv(double var1) {
      int var3 = OpaquePredicate.b();
      double var4 = this.aaw().liq() * 4.0;

      int var10000;
      label38: {
         label37: {
            try {
               var10000 = Double.isNaN(var4);
               if (var3 == 0) {
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
         if (var3 == 0) {
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

   public void snp(double var1, double var3, double var5, float var7, float var8) {
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
      this._w2 = 0;
   }

   @Override
   public void ltu(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.kaa = var1;
      this.s6i = var3;
      this.euq = var5;
      this.h28 = (double)var7;
      this.gj0 = (double)var8;
      this.ecu = var9;
      this.icv = this.cxf;
      this.mop = this.j2f;
      this.bw4 = this.vzo;
   }

   @Override
   public void lmm(double var1, double var3, double var5) {
      this.cxf = this.icv = var1;
      this.j2f = this.mop = var3;
      this.vzo = this.bw4 = var5;
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
      // 000: getstatic sj_.b J
      // 003: ldc2_w 80854338498224
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokespecial EntityLivingBase.xx_ ()V
      // 010: aload 0
      // 011: getfield sj_.ecu I
      // 014: iload 3
      // 015: ifne 0d3
      // 018: ifle 0c5
      // 01b: goto 022
      // 01e: invokestatic sj_.a (Loov;)Loov;
      // 021: athrow
      // 022: aload 0
      // 023: getfield sj_.o2v D
      // 026: aload 0
      // 027: getfield sj_.kaa D
      // 02a: aload 0
      // 02b: getfield sj_.o2v D
      // 02e: dsub
      // 02f: aload 0
      // 030: getfield sj_.ecu I
      // 033: i2d
      // 034: ddiv
      // 035: dadd
      // 036: dstore 4
      // 038: aload 0
      // 039: getfield sj_.kfp D
      // 03c: aload 0
      // 03d: getfield sj_.s6i D
      // 040: aload 0
      // 041: getfield sj_.kfp D
      // 044: dsub
      // 045: aload 0
      // 046: getfield sj_.ecu I
      // 049: i2d
      // 04a: ddiv
      // 04b: dadd
      // 04c: dstore 6
      // 04e: aload 0
      // 04f: getfield sj_.vbd D
      // 052: aload 0
      // 053: getfield sj_.euq D
      // 056: aload 0
      // 057: getfield sj_.vbd D
      // 05a: dsub
      // 05b: aload 0
      // 05c: getfield sj_.ecu I
      // 05f: i2d
      // 060: ddiv
      // 061: dadd
      // 062: dstore 8
      // 064: aload 0
      // 065: getfield sj_.h28 D
      // 068: aload 0
      // 069: getfield sj_.x5k F
      // 06c: f2d
      // 06d: dsub
      // 06e: invokestatic fe6.lrs (D)D
      // 071: dstore 10
      // 073: aload 0
      // 074: aload 0
      // 075: getfield sj_.x5k F
      // 078: f2d
      // 079: dload 10
      // 07b: aload 0
      // 07c: getfield sj_.ecu I
      // 07f: i2d
      // 080: ddiv
      // 081: dadd
      // 082: d2f
      // 083: putfield sj_.x5k F
      // 086: aload 0
      // 087: aload 0
      // 088: getfield sj_.y2i F
      // 08b: f2d
      // 08c: aload 0
      // 08d: getfield sj_.gj0 D
      // 090: aload 0
      // 091: getfield sj_.y2i F
      // 094: f2d
      // 095: dsub
      // 096: aload 0
      // 097: getfield sj_.ecu I
      // 09a: i2d
      // 09b: ddiv
      // 09c: dadd
      // 09d: d2f
      // 09e: putfield sj_.y2i F
      // 0a1: aload 0
      // 0a2: dup
      // 0a3: getfield sj_.ecu I
      // 0a6: bipush 1
      // 0a7: isub
      // 0a8: putfield sj_.ecu I
      // 0ab: aload 0
      // 0ac: dload 4
      // 0ae: dload 6
      // 0b0: dload 8
      // 0b2: invokevirtual sj_.m6_ (DDD)V
      // 0b5: aload 0
      // 0b6: aload 0
      // 0b7: getfield sj_.x5k F
      // 0ba: aload 0
      // 0bb: getfield sj_.y2i F
      // 0be: invokevirtual sj_.iym (FF)V
      // 0c1: iload 3
      // 0c2: ifeq d0b
      // 0c5: aload 0
      // 0c6: getfield sj_.oay Lt9d;
      // 0c9: getfield OpaquePredicate.v0f Z
      // 0cc: goto 0d3
      // 0cf: invokestatic sj_.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: iload 3
      // 0d4: ifne 1df
      // 0d7: ifne 1db
      // 0da: goto 0e1
      // 0dd: invokestatic sj_.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: getfield sj_.iqf Lha9;
      // 0e5: invokevirtual ha9.b5z ()Lerg;
      // 0e8: astore 4
      // 0ea: aload 0
      // 0eb: getfield sj_.iqf Lha9;
      // 0ee: iload 3
      // 0ef: ifne 16d
      // 0f2: getfield ha9.ma9 Z
      // 0f5: ifne 15e
      // 0f8: goto 0ff
      // 0fb: invokestatic sj_.a (Loov;)Loov;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getfield sj_.iqf Lha9;
      // 103: iload 3
      // 104: ifne 16d
      // 107: goto 10e
      // 10a: invokestatic sj_.a (Loov;)Loov;
      // 10d: athrow
      // 10e: invokevirtual ha9.gzr ()Z
      // 111: ifeq 15e
      // 114: goto 11b
      // 117: invokestatic sj_.a (Loov;)Loov;
      // 11a: athrow
      // 11b: aload 4
      // 11d: iload 3
      // 11e: ifne 134
      // 121: goto 128
      // 124: invokestatic sj_.a (Loov;)Loov;
      // 127: athrow
      // 128: ifnull 15e
      // 12b: goto 132
      // 12e: invokestatic sj_.a (Loov;)Loov;
      // 131: athrow
      // 132: aload 4
      // 134: invokevirtual erg.gn1 ()Lu7m;
      // 137: getstatic xbr.kru Lyab;
      // 13a: if_acmpne 15e
      // 13d: aload 0
      // 13e: iload 3
      // 13f: ifne 181
      // 142: goto 149
      // 145: invokestatic sj_.a (Loov;)Loov;
      // 148: athrow
      // 149: aload 0
      // 14a: getfield sj_.iqf Lha9;
      // 14d: invokevirtual sj_.wxg (Li2h;)D
      // 150: ldc2_w 1024.0
      // 153: dcmpl
      // 154: ifle 172
      // 157: goto 15e
      // 15a: invokestatic sj_.a (Loov;)Loov;
      // 15d: athrow
      // 15e: aload 0
      // 15f: invokevirtual sj_._kl ()V
      // 162: aload 0
      // 163: getfield sj_.iqf Lha9;
      // 166: goto 16d
      // 169: invokestatic sj_.a (Loov;)Loov;
      // 16c: athrow
      // 16d: aconst_null
      // 16e: putfield ha9.r44 Lsj_;
      // 171: return
      // 172: aload 0
      // 173: iload 3
      // 174: ifne 1dc
      // 177: getfield sj_.pai Li2h;
      // 17a: goto 181
      // 17d: invokestatic sj_.a (Loov;)Loov;
      // 180: athrow
      // 181: ifnull 1db
      // 184: aload 0
      // 185: iload 3
      // 186: ifne 1d7
      // 189: goto 190
      // 18c: invokestatic sj_.a (Loov;)Loov;
      // 18f: athrow
      // 190: getfield sj_.pai Li2h;
      // 193: getfield EntityLivingBase.ma9 Z
      // 196: ifne 1d6
      // 199: goto 1a0
      // 19c: invokestatic sj_.a (Loov;)Loov;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: aload 0
      // 1a2: getfield sj_.pai Li2h;
      // 1a5: getfield EntityLivingBase.o2v D
      // 1a8: putfield sj_.o2v D
      // 1ab: aload 0
      // 1ac: getfield sj_.pai Li2h;
      // 1af: getfield EntityLivingBase.ikl F
      // 1b2: f2d
      // 1b3: dstore 5
      // 1b5: aload 0
      // 1b6: aload 0
      // 1b7: getfield sj_.pai Li2h;
      // 1ba: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 1bd: getfield nh4.bx_ D
      // 1c0: dload 5
      // 1c2: ldc2_w 0.8
      // 1c5: dmul
      // 1c6: dadd
      // 1c7: putfield sj_.kfp D
      // 1ca: aload 0
      // 1cb: aload 0
      // 1cc: getfield sj_.pai Li2h;
      // 1cf: getfield EntityLivingBase.vbd D
      // 1d2: putfield sj_.vbd D
      // 1d5: return
      // 1d6: aload 0
      // 1d7: aconst_null
      // 1d8: putfield sj_.pai Li2h;
      // 1db: aload 0
      // 1dc: getfield sj_.nfd I
      // 1df: iload 3
      // 1e0: ifne 20d
      // 1e3: ifle 1fe
      // 1e6: goto 1ed
      // 1e9: invokestatic sj_.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: dup
      // 1ef: getfield sj_.nfd I
      // 1f2: bipush 1
      // 1f3: isub
      // 1f4: putfield sj_.nfd I
      // 1f7: goto 1fe
      // 1fa: invokestatic sj_.a (Loov;)Loov;
      // 1fd: athrow
      // 1fe: aload 0
      // 1ff: iload 3
      // 200: ifne 2d4
      // 203: getfield sj_.z65 Z
      // 206: goto 20d
      // 209: invokestatic sj_.a (Loov;)Loov;
      // 20c: athrow
      // 20d: ifeq 2cc
      // 210: aload 0
      // 211: iload 3
      // 212: ifne 2c4
      // 215: goto 21c
      // 218: invokestatic sj_.a (Loov;)Loov;
      // 21b: athrow
      // 21c: getfield sj_.oay Lt9d;
      // 21f: new mew
      // 222: dup
      // 223: aload 0
      // 224: getfield sj_.xy1 I
      // 227: aload 0
      // 228: getfield sj_.u8k I
      // 22b: aload 0
      // 22c: getfield sj_._c7 I
      // 22f: invokespecial mew.<init> (III)V
      // 232: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 235: invokeinterface zfz.r_y ()Le0x; 1
      // 23a: aload 0
      // 23b: getfield sj_.tgj Le0x;
      // 23e: if_acmpne 27a
      // 241: goto 248
      // 244: invokestatic sj_.a (Loov;)Loov;
      // 247: athrow
      // 248: aload 0
      // 249: dup
      // 24a: getfield sj_._w2 I
      // 24d: bipush 1
      // 24e: iadd
      // 24f: putfield sj_._w2 I
      // 252: aload 0
      // 253: iload 3
      // 254: ifne 276
      // 257: goto 25e
      // 25a: invokestatic sj_.a (Loov;)Loov;
      // 25d: athrow
      // 25e: getfield sj_._w2 I
      // 261: sipush 1200
      // 264: if_icmpne 279
      // 267: goto 26e
      // 26a: invokestatic sj_.a (Loov;)Loov;
      // 26d: athrow
      // 26e: aload 0
      // 26f: goto 276
      // 272: invokestatic sj_.a (Loov;)Loov;
      // 275: athrow
      // 276: invokevirtual sj_._kl ()V
      // 279: return
      // 27a: aload 0
      // 27b: bipush 0
      // 27c: putfield sj_.z65 Z
      // 27f: aload 0
      // 280: dup
      // 281: getfield sj_.icv D
      // 284: aload 0
      // 285: getfield sj_.z2d Ljava/util/Random;
      // 288: invokevirtual java/util/Random.nextFloat ()F
      // 28b: ldc 0.2
      // 28d: nop
      // 28e: fmul
      // 28f: f2d
      // 290: dmul
      // 291: putfield sj_.icv D
      // 294: aload 0
      // 295: dup
      // 296: getfield sj_.mop D
      // 299: aload 0
      // 29a: getfield sj_.z2d Ljava/util/Random;
      // 29d: invokevirtual java/util/Random.nextFloat ()F
      // 2a0: ldc 0.2
      // 2a2: nop
      // 2a3: fmul
      // 2a4: f2d
      // 2a5: dmul
      // 2a6: putfield sj_.mop D
      // 2a9: aload 0
      // 2aa: dup
      // 2ab: getfield sj_.bw4 D
      // 2ae: aload 0
      // 2af: getfield sj_.z2d Ljava/util/Random;
      // 2b2: invokevirtual java/util/Random.nextFloat ()F
      // 2b5: ldc 0.2
      // 2b7: nop
      // 2b8: fmul
      // 2b9: f2d
      // 2ba: dmul
      // 2bb: putfield sj_.bw4 D
      // 2be: aload 0
      // 2bf: bipush 0
      // 2c0: putfield sj_._w2 I
      // 2c3: aload 0
      // 2c4: bipush 0
      // 2c5: putfield sj_.l4a I
      // 2c8: iload 3
      // 2c9: ifeq 2dd
      // 2cc: aload 0
      // 2cd: goto 2d4
      // 2d0: invokestatic sj_.a (Loov;)Loov;
      // 2d3: athrow
      // 2d4: dup
      // 2d5: getfield sj_.l4a I
      // 2d8: bipush 1
      // 2d9: iadd
      // 2da: putfield sj_.l4a I
      // 2dd: new fqr
      // 2e0: dup
      // 2e1: aload 0
      // 2e2: getfield sj_.o2v D
      // 2e5: aload 0
      // 2e6: getfield sj_.kfp D
      // 2e9: aload 0
      // 2ea: getfield sj_.vbd D
      // 2ed: invokespecial fqr.<init> (DDD)V
      // 2f0: astore 4
      // 2f2: new fqr
      // 2f5: dup
      // 2f6: aload 0
      // 2f7: getfield sj_.o2v D
      // 2fa: aload 0
      // 2fb: getfield sj_.icv D
      // 2fe: dadd
      // 2ff: aload 0
      // 300: getfield sj_.kfp D
      // 303: aload 0
      // 304: getfield sj_.mop D
      // 307: dadd
      // 308: aload 0
      // 309: getfield sj_.vbd D
      // 30c: aload 0
      // 30d: getfield sj_.bw4 D
      // 310: dadd
      // 311: invokespecial fqr.<init> (DDD)V
      // 314: astore 5
      // 316: aload 0
      // 317: getfield sj_.oay Lt9d;
      // 31a: aload 4
      // 31c: aload 5
      // 31e: invokevirtual OpaquePredicate.caq (Lfqr;Lfqr;)Lakm;
      // 321: astore 6
      // 323: new fqr
      // 326: dup
      // 327: aload 0
      // 328: getfield sj_.o2v D
      // 32b: aload 0
      // 32c: getfield sj_.kfp D
      // 32f: aload 0
      // 330: getfield sj_.vbd D
      // 333: invokespecial fqr.<init> (DDD)V
      // 336: astore 4
      // 338: new fqr
      // 33b: dup
      // 33c: aload 0
      // 33d: getfield sj_.o2v D
      // 340: aload 0
      // 341: getfield sj_.icv D
      // 344: dadd
      // 345: aload 0
      // 346: getfield sj_.kfp D
      // 349: aload 0
      // 34a: getfield sj_.mop D
      // 34d: dadd
      // 34e: aload 0
      // 34f: getfield sj_.vbd D
      // 352: aload 0
      // 353: getfield sj_.bw4 D
      // 356: dadd
      // 357: invokespecial fqr.<init> (DDD)V
      // 35a: iload 3
      // 35b: ifne 38b
      // 35e: astore 5
      // 360: aload 6
      // 362: ifnull 38d
      // 365: new fqr
      // 368: dup
      // 369: aload 6
      // 36b: getfield akm.jhn Lfqr;
      // 36e: getfield fqr.lvi D
      // 371: aload 6
      // 373: getfield akm.jhn Lfqr;
      // 376: getfield fqr.gn5 D
      // 379: aload 6
      // 37b: getfield akm.jhn Lfqr;
      // 37e: getfield fqr.bn2 D
      // 381: invokespecial fqr.<init> (DDD)V
      // 384: goto 38b
      // 387: invokestatic sj_.a (Loov;)Loov;
      // 38a: athrow
      // 38b: astore 5
      // 38d: aconst_null
      // 38e: astore 7
      // 390: aload 0
      // 391: getfield sj_.oay Lt9d;
      // 394: aload 0
      // 395: aload 0
      // 396: invokevirtual sj_.aaw ()Lnh4;
      // 399: aload 0
      // 39a: getfield sj_.icv D
      // 39d: aload 0
      // 39e: getfield sj_.mop D
      // 3a1: aload 0
      // 3a2: getfield sj_.bw4 D
      // 3a5: invokevirtual nh4.z9h (DDD)Lnh4;
      // 3a8: dconst_1
      // 3a9: dconst_1
      // 3aa: dconst_1
      // 3ab: invokevirtual nh4.c2h (DDD)Lnh4;
      // 3ae: invokevirtual OpaquePredicate.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 3b1: astore 8
      // 3b3: dconst_0
      // 3b4: dstore 9
      // 3b6: bipush 0
      // 3b7: istore 11
      // 3b9: iload 11
      // 3bb: aload 8
      // 3bd: invokeinterface java/util/List.size ()I 1
      // 3c2: if_icmpge 48a
      // 3c5: aload 8
      // 3c7: iload 11
      // 3c9: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 3ce: checkcast EntityLivingBase
      // 3d1: astore 12
      // 3d3: iload 3
      // 3d4: ifne 486
      // 3d7: aload 12
      // 3d9: invokevirtual EntityLivingBase.mzu ()Z
      // 3dc: iload 3
      // 3dd: ifne 512
      // 3e0: goto 3e7
      // 3e3: invokestatic sj_.a (Loov;)Loov;
      // 3e6: athrow
      // 3e7: ifeq 483
      // 3ea: goto 3f1
      // 3ed: invokestatic sj_.a (Loov;)Loov;
      // 3f0: athrow
      // 3f1: aload 12
      // 3f3: aload 0
      // 3f4: getfield sj_.iqf Lha9;
      // 3f7: if_acmpne 410
      // 3fa: goto 401
      // 3fd: invokestatic sj_.a (Loov;)Loov;
      // 400: athrow
      // 401: aload 0
      // 402: getfield sj_.l4a I
      // 405: bipush 5
      // 406: if_icmplt 483
      // 409: goto 410
      // 40c: invokestatic sj_.a (Loov;)Loov;
      // 40f: athrow
      // 410: ldc 0.3
      // 412: nop
      // 413: fstore 13
      // 415: aload 12
      // 417: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 41a: fload 13
      // 41c: f2d
      // 41d: fload 13
      // 41f: f2d
      // 420: fload 13
      // 422: f2d
      // 423: invokevirtual nh4.c2h (DDD)Lnh4;
      // 426: astore 14
      // 428: aload 14
      // 42a: aload 4
      // 42c: aload 5
      // 42e: invokevirtual nh4.v35 (Lfqr;Lfqr;)Lakm;
      // 431: astore 15
      // 433: iload 3
      // 434: ifne 486
      // 437: aload 15
      // 439: ifnull 483
      // 43c: goto 443
      // 43f: invokestatic sj_.a (Loov;)Loov;
      // 442: athrow
      // 443: aload 4
      // 445: aload 15
      // 447: getfield akm.jhn Lfqr;
      // 44a: invokevirtual fqr.y8x (Lfqr;)D
      // 44d: dstore 16
      // 44f: dload 16
      // 451: iload 3
      // 452: ifne 481
      // 455: dload 9
      // 457: dcmpg
      // 458: iflt 47b
      // 45b: goto 462
      // 45e: invokestatic sj_.a (Loov;)Loov;
      // 461: athrow
      // 462: dload 9
      // 464: iload 3
      // 465: ifne 481
      // 468: goto 46f
      // 46b: invokestatic sj_.a (Loov;)Loov;
      // 46e: athrow
      // 46f: dconst_0
      // 470: dcmpl
      // 471: ifne 483
      // 474: goto 47b
      // 477: invokestatic sj_.a (Loov;)Loov;
      // 47a: athrow
      // 47b: aload 12
      // 47d: astore 7
      // 47f: dload 16
      // 481: dstore 9
      // 483: iinc 11 1
      // 486: iload 3
      // 487: ifeq 3b9
      // 48a: aload 7
      // 48c: ifnull 49a
      // 48f: new akm
      // 492: dup
      // 493: aload 7
      // 495: invokespecial akm.<init> (Li2h;)V
      // 498: astore 6
      // 49a: aload 6
      // 49c: iload 3
      // 49d: ifne 4ac
      // 4a0: ifnull 503
      // 4a3: goto 4aa
      // 4a6: invokestatic sj_.a (Loov;)Loov;
      // 4a9: athrow
      // 4aa: aload 6
      // 4ac: getfield akm.sc8 Li2h;
      // 4af: iload 3
      // 4b0: ifne 4c9
      // 4b3: ifnull 4f7
      // 4b6: goto 4bd
      // 4b9: invokestatic sj_.a (Loov;)Loov;
      // 4bc: athrow
      // 4bd: aload 6
      // 4bf: getfield akm.sc8 Li2h;
      // 4c2: goto 4c9
      // 4c5: invokestatic sj_.a (Loov;)Loov;
      // 4c8: athrow
      // 4c9: aload 0
      // 4ca: aload 0
      // 4cb: getfield sj_.iqf Lha9;
      // 4ce: invokestatic ofh.lr9 (Li2h;Li2h;)Lofh;
      // 4d1: fconst_0
      // 4d2: invokevirtual EntityLivingBase.m1t (Lofh;F)Z
      // 4d5: iload 3
      // 4d6: ifne 512
      // 4d9: ifeq 503
      // 4dc: goto 4e3
      // 4df: invokestatic sj_.a (Loov;)Loov;
      // 4e2: athrow
      // 4e3: aload 0
      // 4e4: aload 6
      // 4e6: getfield akm.sc8 Li2h;
      // 4e9: putfield sj_.pai Li2h;
      // 4ec: iload 3
      // 4ed: ifeq 503
      // 4f0: goto 4f7
      // 4f3: invokestatic sj_.a (Loov;)Loov;
      // 4f6: athrow
      // 4f7: aload 0
      // 4f8: bipush 1
      // 4f9: putfield sj_.z65 Z
      // 4fc: goto 503
      // 4ff: invokestatic sj_.a (Loov;)Loov;
      // 502: athrow
      // 503: aload 0
      // 504: iload 3
      // 505: ifne 52d
      // 508: getfield sj_.z65 Z
      // 50b: goto 512
      // 50e: invokestatic sj_.a (Loov;)Loov;
      // 511: athrow
      // 512: ifne d0b
      // 515: aload 0
      // 516: aload 0
      // 517: getfield sj_.icv D
      // 51a: aload 0
      // 51b: getfield sj_.mop D
      // 51e: aload 0
      // 51f: getfield sj_.bw4 D
      // 522: invokevirtual sj_.vjj (DDD)V
      // 525: aload 0
      // 526: goto 52d
      // 529: invokestatic sj_.a (Loov;)Loov;
      // 52c: athrow
      // 52d: getfield sj_.icv D
      // 530: aload 0
      // 531: getfield sj_.icv D
      // 534: dmul
      // 535: aload 0
      // 536: getfield sj_.bw4 D
      // 539: aload 0
      // 53a: getfield sj_.bw4 D
      // 53d: dmul
      // 53e: dadd
      // 53f: invokestatic fe6.dii (D)F
      // 542: fstore 11
      // 544: aload 0
      // 545: aload 0
      // 546: getfield sj_.icv D
      // 549: aload 0
      // 54a: getfield sj_.bw4 D
      // 54d: invokestatic fe6.yr8 (DD)D
      // 550: ldc2_w 180.0
      // 553: dmul
      // 554: ldc2_w 3.141592653589793
      // 557: ddiv
      // 558: d2f
      // 559: putfield sj_.x5k F
      // 55c: aload 0
      // 55d: aload 0
      // 55e: getfield sj_.mop D
      // 561: fload 11
      // 563: f2d
      // 564: invokestatic fe6.yr8 (DD)D
      // 567: ldc2_w 180.0
      // 56a: dmul
      // 56b: ldc2_w 3.141592653589793
      // 56e: ddiv
      // 56f: d2f
      // 570: putfield sj_.y2i F
      // 573: aload 0
      // 574: getfield sj_.y2i F
      // 577: aload 0
      // 578: getfield sj_.j25 F
      // 57b: fsub
      // 57c: ldc -180.0
      // 57e: nop
      // 57f: fcmpg
      // 580: ifge 59e
      // 583: aload 0
      // 584: dup
      // 585: getfield sj_.j25 F
      // 588: ldc 360.0
      // 58a: nop
      // 58b: fsub
      // 58c: putfield sj_.j25 F
      // 58f: iload 3
      // 590: ifne 5c9
      // 593: iload 3
      // 594: ifeq 573
      // 597: goto 59e
      // 59a: invokestatic sj_.a (Loov;)Loov;
      // 59d: athrow
      // 59e: aload 0
      // 59f: getfield sj_.y2i F
      // 5a2: aload 0
      // 5a3: getfield sj_.j25 F
      // 5a6: fsub
      // 5a7: ldc 180.0
      // 5a9: nop
      // 5aa: fcmpl
      // 5ab: iflt 5c9
      // 5ae: aload 0
      // 5af: dup
      // 5b0: getfield sj_.j25 F
      // 5b3: ldc 360.0
      // 5b5: nop
      // 5b6: fadd
      // 5b7: putfield sj_.j25 F
      // 5ba: iload 3
      // 5bb: ifne 5fb
      // 5be: iload 3
      // 5bf: ifeq 59e
      // 5c2: goto 5c9
      // 5c5: invokestatic sj_.a (Loov;)Loov;
      // 5c8: athrow
      // 5c9: aload 0
      // 5ca: getfield sj_.x5k F
      // 5cd: aload 0
      // 5ce: getfield sj_.p3h F
      // 5d1: fsub
      // 5d2: ldc -180.0
      // 5d4: nop
      // 5d5: fcmpg
      // 5d6: ifge 5fb
      // 5d9: aload 0
      // 5da: dup
      // 5db: getfield sj_.p3h F
      // 5de: ldc 360.0
      // 5e0: nop
      // 5e1: fsub
      // 5e2: putfield sj_.p3h F
      // 5e5: iload 3
      // 5e6: ifne 659
      // 5e9: goto 5f0
      // 5ec: invokestatic sj_.a (Loov;)Loov;
      // 5ef: athrow
      // 5f0: iload 3
      // 5f1: ifeq 5c9
      // 5f4: goto 5fb
      // 5f7: invokestatic sj_.a (Loov;)Loov;
      // 5fa: athrow
      // 5fb: aload 0
      // 5fc: getfield sj_.x5k F
      // 5ff: aload 0
      // 600: getfield sj_.p3h F
      // 603: fsub
      // 604: ldc 180.0
      // 606: nop
      // 607: fcmpl
      // 608: iflt 62d
      // 60b: aload 0
      // 60c: dup
      // 60d: getfield sj_.p3h F
      // 610: ldc 360.0
      // 612: nop
      // 613: fadd
      // 614: putfield sj_.p3h F
      // 617: iload 3
      // 618: ifne 659
      // 61b: goto 622
      // 61e: invokestatic sj_.a (Loov;)Loov;
      // 621: athrow
      // 622: iload 3
      // 623: ifeq 5fb
      // 626: goto 62d
      // 629: invokestatic sj_.a (Loov;)Loov;
      // 62c: athrow
      // 62d: aload 0
      // 62e: aload 0
      // 62f: getfield sj_.j25 F
      // 632: aload 0
      // 633: getfield sj_.y2i F
      // 636: aload 0
      // 637: getfield sj_.j25 F
      // 63a: fsub
      // 63b: ldc 0.2
      // 63d: nop
      // 63e: fmul
      // 63f: fadd
      // 640: putfield sj_.y2i F
      // 643: aload 0
      // 644: aload 0
      // 645: getfield sj_.p3h F
      // 648: aload 0
      // 649: getfield sj_.x5k F
      // 64c: aload 0
      // 64d: getfield sj_.p3h F
      // 650: fsub
      // 651: ldc 0.2
      // 653: nop
      // 654: fmul
      // 655: fadd
      // 656: putfield sj_.x5k F
      // 659: ldc 0.92
      // 65b: nop
      // 65c: fstore 12
      // 65e: aload 0
      // 65f: getfield sj_.lfk Z
      // 662: iload 3
      // 663: ifne 67b
      // 666: ifne 689
      // 669: goto 670
      // 66c: invokestatic sj_.a (Loov;)Loov;
      // 66f: athrow
      // 670: aload 0
      // 671: getfield sj_.cbi Z
      // 674: goto 67b
      // 677: invokestatic sj_.a (Loov;)Loov;
      // 67a: athrow
      // 67b: iload 3
      // 67c: ifne 68f
      // 67f: ifeq 68e
      // 682: goto 689
      // 685: invokestatic sj_.a (Loov;)Loov;
      // 688: athrow
      // 689: ldc 0.5
      // 68b: nop
      // 68c: fstore 12
      // 68e: bipush 5
      // 68f: istore 13
      // 691: dconst_0
      // 692: dstore 14
      // 694: bipush 0
      // 695: istore 16
      // 697: iload 16
      // 699: iload 13
      // 69b: if_icmpge 72e
      // 69e: aload 0
      // 69f: invokevirtual sj_.aaw ()Lnh4;
      // 6a2: astore 17
      // 6a4: aload 17
      // 6a6: getfield nh4.i2c D
      // 6a9: aload 17
      // 6ab: getfield nh4.bx_ D
      // 6ae: dsub
      // 6af: dstore 18
      // 6b1: aload 17
      // 6b3: getfield nh4.bx_ D
      // 6b6: dload 18
      // 6b8: iload 16
      // 6ba: i2d
      // 6bb: dmul
      // 6bc: iload 13
      // 6be: i2d
      // 6bf: ddiv
      // 6c0: dadd
      // 6c1: dstore 20
      // 6c3: aload 17
      // 6c5: getfield nh4.bx_ D
      // 6c8: dload 18
      // 6ca: iload 16
      // 6cc: bipush 1
      // 6cd: iadd
      // 6ce: i2d
      // 6cf: dmul
      // 6d0: iload 13
      // 6d2: i2d
      // 6d3: ddiv
      // 6d4: dadd
      // 6d5: dstore 22
      // 6d7: new nh4
      // 6da: dup
      // 6db: aload 17
      // 6dd: getfield nh4.rlc D
      // 6e0: dload 20
      // 6e2: aload 17
      // 6e4: getfield nh4.t8n D
      // 6e7: aload 17
      // 6e9: getfield nh4.t_2 D
      // 6ec: dload 22
      // 6ee: aload 17
      // 6f0: getfield nh4.oqj D
      // 6f3: invokespecial nh4.<init> (DDDDDD)V
      // 6f6: astore 24
      // 6f8: iload 3
      // 6f9: ifne 72a
      // 6fc: aload 0
      // 6fd: getfield sj_.oay Lt9d;
      // 700: aload 24
      // 702: getstatic p3y.six Lp3y;
      // 705: invokevirtual OpaquePredicate.b8h (Lnh4;Lp3y;)Z
      // 708: iload 3
      // 709: ifne 735
      // 70c: goto 713
      // 70f: invokestatic sj_.a (Loov;)Loov;
      // 712: athrow
      // 713: ifeq 727
      // 716: goto 71d
      // 719: invokestatic sj_.a (Loov;)Loov;
      // 71c: athrow
      // 71d: dload 14
      // 71f: dconst_1
      // 720: iload 13
      // 722: i2d
      // 723: ddiv
      // 724: dadd
      // 725: dstore 14
      // 727: iinc 16 1
      // 72a: iload 3
      // 72b: ifeq 697
      // 72e: aload 0
      // 72f: getfield sj_.oay Lt9d;
      // 732: getfield OpaquePredicate.v0f Z
      // 735: iload 3
      // 736: ifne 759
      // 739: ifne c96
      // 73c: goto 743
      // 73f: invokestatic sj_.a (Loov;)Loov;
      // 742: athrow
      // 743: dload 14
      // 745: dconst_0
      // 746: iload 3
      // 747: ifne c9d
      // 74a: goto 751
      // 74d: invokestatic sj_.a (Loov;)Loov;
      // 750: athrow
      // 751: dcmpl
      // 752: goto 759
      // 755: invokestatic sj_.a (Loov;)Loov;
      // 758: athrow
      // 759: ifle c96
      // 75c: aload 0
      // 75d: getfield sj_.oay Lt9d;
      // 760: checkcast dug
      // 763: astore 16
      // 765: bipush 1
      // 766: istore 17
      // 768: new mew
      // 76b: dup
      // 76c: aload 0
      // 76d: invokespecial mew.<init> (Li2h;)V
      // 770: invokevirtual mew.nuv ()Lmew;
      // 773: astore 18
      // 775: aload 0
      // 776: getfield sj_.z2d Ljava/util/Random;
      // 779: invokevirtual java/util/Random.nextFloat ()F
      // 77c: ldc 0.25
      // 77e: nop
      // 77f: fcmpg
      // 780: iload 3
      // 781: ifne 7ba
      // 784: ifge 7af
      // 787: goto 78e
      // 78a: invokestatic sj_.a (Loov;)Loov;
      // 78d: athrow
      // 78e: aload 0
      // 78f: getfield sj_.oay Lt9d;
      // 792: aload 18
      // 794: invokevirtual OpaquePredicate.eyz (Lmew;)Z
      // 797: iload 3
      // 798: ifne 7ba
      // 79b: goto 7a2
      // 79e: invokestatic sj_.a (Loov;)Loov;
      // 7a1: athrow
      // 7a2: ifeq 7af
      // 7a5: goto 7ac
      // 7a8: invokestatic sj_.a (Loov;)Loov;
      // 7ab: athrow
      // 7ac: bipush 2
      // 7ad: istore 17
      // 7af: aload 0
      // 7b0: getfield sj_.z2d Ljava/util/Random;
      // 7b3: invokevirtual java/util/Random.nextFloat ()F
      // 7b6: ldc 0.5
      // 7b8: nop
      // 7b9: fcmpg
      // 7ba: iload 3
      // 7bb: ifne 7ed
      // 7be: ifge 7e9
      // 7c1: goto 7c8
      // 7c4: invokestatic sj_.a (Loov;)Loov;
      // 7c7: athrow
      // 7c8: aload 0
      // 7c9: getfield sj_.oay Lt9d;
      // 7cc: aload 18
      // 7ce: invokevirtual OpaquePredicate.cfv (Lmew;)Z
      // 7d1: iload 3
      // 7d2: ifne 7ed
      // 7d5: goto 7dc
      // 7d8: invokestatic sj_.a (Loov;)Loov;
      // 7db: athrow
      // 7dc: ifne 7e9
      // 7df: goto 7e6
      // 7e2: invokestatic sj_.a (Loov;)Loov;
      // 7e5: athrow
      // 7e6: iinc 17 -1
      // 7e9: aload 0
      // 7ea: getfield sj_.vfx I
      // 7ed: iload 3
      // 7ee: ifne 83e
      // 7f1: ifle 833
      // 7f4: goto 7fb
      // 7f7: invokestatic sj_.a (Loov;)Loov;
      // 7fa: athrow
      // 7fb: aload 0
      // 7fc: dup
      // 7fd: getfield sj_.vfx I
      // 800: bipush 1
      // 801: isub
      // 802: putfield sj_.vfx I
      // 805: aload 0
      // 806: getfield sj_.vfx I
      // 809: iload 3
      // 80a: ifne c6e
      // 80d: goto 814
      // 810: invokestatic sj_.a (Loov;)Loov;
      // 813: athrow
      // 814: ifgt c5f
      // 817: goto 81e
      // 81a: invokestatic sj_.a (Loov;)Loov;
      // 81d: athrow
      // 81e: aload 0
      // 81f: bipush 0
      // 820: putfield sj_.hpb I
      // 823: aload 0
      // 824: bipush 0
      // 825: putfield sj_.ko_ I
      // 828: iload 3
      // 829: ifeq c5f
      // 82c: goto 833
      // 82f: invokestatic sj_.a (Loov;)Loov;
      // 832: athrow
      // 833: aload 0
      // 834: getfield sj_.ko_ I
      // 837: goto 83e
      // 83a: invokestatic sj_.a (Loov;)Loov;
      // 83d: athrow
      // 83e: iload 3
      // 83f: ifne a80
      // 842: ifle a6a
      // 845: goto 84c
      // 848: invokestatic sj_.a (Loov;)Loov;
      // 84b: athrow
      // 84c: aload 0
      // 84d: dup
      // 84e: getfield sj_.ko_ I
      // 851: iload 17
      // 853: isub
      // 854: putfield sj_.ko_ I
      // 857: aload 0
      // 858: iload 3
      // 859: ifne 946
      // 85c: goto 863
      // 85f: invokestatic sj_.a (Loov;)Loov;
      // 862: athrow
      // 863: getfield sj_.ko_ I
      // 866: ifgt 928
      // 869: goto 870
      // 86c: invokestatic sj_.a (Loov;)Loov;
      // 86f: athrow
      // 870: aload 0
      // 871: dup
      // 872: getfield sj_.mop D
      // 875: ldc2_w 0.20000000298023224
      // 878: dsub
      // 879: putfield sj_.mop D
      // 87c: aload 0
      // 87d: sipush 1372
      // 880: ldc2_w 5438768996634737044
      // 883: lload 1
      // 884: lxor
      // 885: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 88a: nop
      // 88b: ldc 0.25
      // 88d: nop
      // 88e: fconst_1
      // 88f: aload 0
      // 890: getfield sj_.z2d Ljava/util/Random;
      // 893: invokevirtual java/util/Random.nextFloat ()F
      // 896: aload 0
      // 897: getfield sj_.z2d Ljava/util/Random;
      // 89a: invokevirtual java/util/Random.nextFloat ()F
      // 89d: fsub
      // 89e: ldc 0.4
      // 8a0: nop
      // 8a1: fmul
      // 8a2: fadd
      // 8a3: invokevirtual sj_.lhu (Ljava/lang/String;FF)V
      // 8a6: aload 0
      // 8a7: invokevirtual sj_.aaw ()Lnh4;
      // 8aa: getfield nh4.bx_ D
      // 8ad: invokestatic fe6.jqf (D)I
      // 8b0: i2f
      // 8b1: fstore 19
      // 8b3: aload 16
      // 8b5: getstatic w_0.w_h Lw_0;
      // 8b8: aload 0
      // 8b9: getfield sj_.o2v D
      // 8bc: fload 19
      // 8be: fconst_1
      // 8bf: fadd
      // 8c0: f2d
      // 8c1: aload 0
      // 8c2: getfield sj_.vbd D
      // 8c5: fconst_1
      // 8c6: aload 0
      // 8c7: getfield sj_.uo6 F
      // 8ca: ldc 20.0
      // 8cc: nop
      // 8cd: fmul
      // 8ce: fadd
      // 8cf: f2i
      // 8d0: aload 0
      // 8d1: getfield sj_.uo6 F
      // 8d4: f2d
      // 8d5: dconst_0
      // 8d6: aload 0
      // 8d7: getfield sj_.uo6 F
      // 8da: f2d
      // 8db: ldc2_w 0.20000000298023224
      // 8de: bipush 0
      // 8df: newarray 10
      // 8e1: invokevirtual dug.zra (Lw_0;DDDIDDDD[I)V
      // 8e4: aload 16
      // 8e6: getstatic w_0.pzr Lw_0;
      // 8e9: aload 0
      // 8ea: getfield sj_.o2v D
      // 8ed: fload 19
      // 8ef: fconst_1
      // 8f0: fadd
      // 8f1: f2d
      // 8f2: aload 0
      // 8f3: getfield sj_.vbd D
      // 8f6: fconst_1
      // 8f7: aload 0
      // 8f8: getfield sj_.uo6 F
      // 8fb: ldc 20.0
      // 8fd: nop
      // 8fe: fmul
      // 8ff: fadd
      // 900: f2i
      // 901: aload 0
      // 902: getfield sj_.uo6 F
      // 905: f2d
      // 906: dconst_0
      // 907: aload 0
      // 908: getfield sj_.uo6 F
      // 90b: f2d
      // 90c: ldc2_w 0.20000000298023224
      // 90f: bipush 0
      // 910: newarray 10
      // 912: invokevirtual dug.zra (Lw_0;DDDIDDDD[I)V
      // 915: aload 0
      // 916: aload 0
      // 917: getfield sj_.z2d Ljava/util/Random;
      // 91a: bipush 10
      // 91c: bipush 30
      // 91e: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // 921: putfield sj_.vfx I
      // 924: iload 3
      // 925: ifeq c5f
      // 928: aload 0
      // 929: aload 0
      // 92a: getfield sj_.jul F
      // 92d: f2d
      // 92e: aload 0
      // 92f: getfield sj_.z2d Ljava/util/Random;
      // 932: invokevirtual java/util/Random.nextGaussian ()D
      // 935: ldc2_w 4.0
      // 938: dmul
      // 939: dadd
      // 93a: d2f
      // 93b: putfield sj_.jul F
      // 93e: aload 0
      // 93f: goto 946
      // 942: invokestatic sj_.a (Loov;)Loov;
      // 945: athrow
      // 946: getfield sj_.jul F
      // 949: ldc 0.017453292
      // 94b: nop
      // 94c: fmul
      // 94d: fstore 19
      // 94f: fload 19
      // 951: invokestatic fe6.rtn (F)F
      // 954: fstore 20
      // 956: fload 19
      // 958: invokestatic fe6.ssk (F)F
      // 95b: fstore 21
      // 95d: aload 0
      // 95e: getfield sj_.o2v D
      // 961: fload 20
      // 963: aload 0
      // 964: getfield sj_.ko_ I
      // 967: i2f
      // 968: fmul
      // 969: ldc 0.1
      // 96b: nop
      // 96c: fmul
      // 96d: f2d
      // 96e: dadd
      // 96f: dstore 22
      // 971: aload 0
      // 972: invokevirtual sj_.aaw ()Lnh4;
      // 975: getfield nh4.bx_ D
      // 978: invokestatic fe6.jqf (D)I
      // 97b: i2f
      // 97c: fconst_1
      // 97d: fadd
      // 97e: f2d
      // 97f: dstore 24
      // 981: aload 0
      // 982: getfield sj_.vbd D
      // 985: fload 21
      // 987: aload 0
      // 988: getfield sj_.ko_ I
      // 98b: i2f
      // 98c: fmul
      // 98d: ldc 0.1
      // 98f: nop
      // 990: fmul
      // 991: f2d
      // 992: dadd
      // 993: dstore 26
      // 995: aload 16
      // 997: new mew
      // 99a: dup
      // 99b: dload 22
      // 99d: d2i
      // 99e: dload 24
      // 9a0: d2i
      // 9a1: bipush 1
      // 9a2: isub
      // 9a3: dload 26
      // 9a5: d2i
      // 9a6: invokespecial mew.<init> (III)V
      // 9a9: invokevirtual dug.getBlockState (Lmew;)Lzfz;
      // 9ac: invokeinterface zfz.r_y ()Le0x; 1
      // 9b1: astore 28
      // 9b3: aload 28
      // 9b5: iload 3
      // 9b6: ifne 9cf
      // 9b9: getstatic ox_.gdz Les2;
      // 9bc: if_acmpeq 9d5
      // 9bf: goto 9c6
      // 9c2: invokestatic sj_.a (Loov;)Loov;
      // 9c5: athrow
      // 9c6: aload 28
      // 9c8: goto 9cf
      // 9cb: invokestatic sj_.a (Loov;)Loov;
      // 9ce: athrow
      // 9cf: getstatic ox_.whp L_13;
      // 9d2: if_acmpne a66
      // 9d5: aload 0
      // 9d6: getfield sj_.z2d Ljava/util/Random;
      // 9d9: invokevirtual java/util/Random.nextFloat ()F
      // 9dc: ldc 0.15
      // 9de: nop
      // 9df: iload 3
      // 9e0: ifne a21
      // 9e3: goto 9ea
      // 9e6: invokestatic sj_.a (Loov;)Loov;
      // 9e9: athrow
      // 9ea: fcmpg
      // 9eb: ifge a1c
      // 9ee: goto 9f5
      // 9f1: invokestatic sj_.a (Loov;)Loov;
      // 9f4: athrow
      // 9f5: aload 16
      // 9f7: getstatic w_0.w_h Lw_0;
      // 9fa: dload 22
      // 9fc: dload 24
      // 9fe: ldc2_w 0.10000000149011612
      // a01: dsub
      // a02: dload 26
      // a04: bipush 1
      // a05: fload 20
      // a07: f2d
      // a08: ldc2_w 0.1
      // a0b: fload 21
      // a0d: f2d
      // a0e: dconst_0
      // a0f: bipush 0
      // a10: newarray 10
      // a12: invokevirtual dug.zra (Lw_0;DDDIDDDD[I)V
      // a15: goto a1c
      // a18: invokestatic sj_.a (Loov;)Loov;
      // a1b: athrow
      // a1c: fload 20
      // a1e: ldc 0.04
      // a20: nop
      // a21: fmul
      // a22: fstore 29
      // a24: fload 21
      // a26: ldc 0.04
      // a28: nop
      // a29: fmul
      // a2a: fstore 30
      // a2c: aload 16
      // a2e: getstatic w_0.pzr Lw_0;
      // a31: dload 22
      // a33: dload 24
      // a35: dload 26
      // a37: bipush 0
      // a38: fload 30
      // a3a: f2d
      // a3b: ldc2_w 0.01
      // a3e: fload 29
      // a40: fneg
      // a41: f2d
      // a42: dconst_1
      // a43: bipush 0
      // a44: newarray 10
      // a46: invokevirtual dug.zra (Lw_0;DDDIDDDD[I)V
      // a49: aload 16
      // a4b: getstatic w_0.pzr Lw_0;
      // a4e: dload 22
      // a50: dload 24
      // a52: dload 26
      // a54: bipush 0
      // a55: fload 30
      // a57: fneg
      // a58: f2d
      // a59: ldc2_w 0.01
      // a5c: fload 29
      // a5e: f2d
      // a5f: dconst_1
      // a60: bipush 0
      // a61: newarray 10
      // a63: invokevirtual dug.zra (Lw_0;DDDIDDDD[I)V
      // a66: iload 3
      // a67: ifeq c5f
      // a6a: aload 0
      // a6b: iload 3
      // a6c: ifne c4b
      // a6f: goto a76
      // a72: invokestatic sj_.a (Loov;)Loov;
      // a75: athrow
      // a76: getfield sj_.hpb I
      // a79: goto a80
      // a7c: invokestatic sj_.a (Loov;)Loov;
      // a7f: athrow
      // a80: ifle c33
      // a83: aload 0
      // a84: dup
      // a85: getfield sj_.hpb I
      // a88: iload 17
      // a8a: isub
      // a8b: putfield sj_.hpb I
      // a8e: ldc 0.15
      // a90: nop
      // a91: fstore 19
      // a93: aload 0
      // a94: getfield sj_.hpb I
      // a97: bipush 20
      // a99: iload 3
      // a9a: ifne acb
      // a9d: if_icmpge abe
      // aa0: goto aa7
      // aa3: invokestatic sj_.a (Loov;)Loov;
      // aa6: athrow
      // aa7: fload 19
      // aa9: f2d
      // aaa: bipush 20
      // aac: aload 0
      // aad: getfield sj_.hpb I
      // ab0: isub
      // ab1: i2d
      // ab2: ldc2_w 0.05
      // ab5: dmul
      // ab6: dadd
      // ab7: d2f
      // ab8: fstore 19
      // aba: iload 3
      // abb: ifeq b1e
      // abe: aload 0
      // abf: getfield sj_.hpb I
      // ac2: bipush 40
      // ac4: goto acb
      // ac7: invokestatic sj_.a (Loov;)Loov;
      // aca: athrow
      // acb: iload 3
      // acc: ifne b08
      // acf: if_icmpge af0
      // ad2: goto ad9
      // ad5: invokestatic sj_.a (Loov;)Loov;
      // ad8: athrow
      // ad9: fload 19
      // adb: f2d
      // adc: bipush 40
      // ade: aload 0
      // adf: getfield sj_.hpb I
      // ae2: isub
      // ae3: i2d
      // ae4: ldc2_w 0.02
      // ae7: dmul
      // ae8: dadd
      // ae9: d2f
      // aea: fstore 19
      // aec: iload 3
      // aed: ifeq b1e
      // af0: aload 0
      // af1: getfield sj_.hpb I
      // af4: iload 3
      // af5: ifne b28
      // af8: goto aff
      // afb: invokestatic sj_.a (Loov;)Loov;
      // afe: athrow
      // aff: bipush 60
      // b01: goto b08
      // b04: invokestatic sj_.a (Loov;)Loov;
      // b07: athrow
      // b08: if_icmpge b1e
      // b0b: fload 19
      // b0d: f2d
      // b0e: bipush 60
      // b10: aload 0
      // b11: getfield sj_.hpb I
      // b14: isub
      // b15: i2d
      // b16: ldc2_w 0.01
      // b19: dmul
      // b1a: dadd
      // b1b: d2f
      // b1c: fstore 19
      // b1e: aload 0
      // b1f: getfield sj_.z2d Ljava/util/Random;
      // b22: invokevirtual java/util/Random.nextFloat ()F
      // b25: fload 19
      // b27: fcmpg
      // b28: iload 3
      // b29: ifne c07
      // b2c: ifge bf8
      // b2f: goto b36
      // b32: invokestatic sj_.a (Loov;)Loov;
      // b35: athrow
      // b36: aload 0
      // b37: getfield sj_.z2d Ljava/util/Random;
      // b3a: fconst_0
      // b3b: ldc 360.0
      // b3d: nop
      // b3e: invokestatic fe6.m_l (Ljava/util/Random;FF)F
      // b41: ldc 0.017453292
      // b43: nop
      // b44: fmul
      // b45: fstore 20
      // b47: aload 0
      // b48: getfield sj_.z2d Ljava/util/Random;
      // b4b: ldc 25.0
      // b4d: nop
      // b4e: ldc 60.0
      // b50: nop
      // b51: invokestatic fe6.m_l (Ljava/util/Random;FF)F
      // b54: fstore 21
      // b56: aload 0
      // b57: getfield sj_.o2v D
      // b5a: fload 20
      // b5c: invokestatic fe6.rtn (F)F
      // b5f: fload 21
      // b61: fmul
      // b62: ldc 0.1
      // b64: nop
      // b65: fmul
      // b66: f2d
      // b67: dadd
      // b68: dstore 22
      // b6a: aload 0
      // b6b: invokevirtual sj_.aaw ()Lnh4;
      // b6e: getfield nh4.bx_ D
      // b71: invokestatic fe6.jqf (D)I
      // b74: i2f
      // b75: fconst_1
      // b76: fadd
      // b77: f2d
      // b78: dstore 24
      // b7a: aload 0
      // b7b: getfield sj_.vbd D
      // b7e: fload 20
      // b80: invokestatic fe6.ssk (F)F
      // b83: fload 21
      // b85: fmul
      // b86: ldc 0.1
      // b88: nop
      // b89: fmul
      // b8a: f2d
      // b8b: dadd
      // b8c: dstore 26
      // b8e: aload 16
      // b90: new mew
      // b93: dup
      // b94: dload 22
      // b96: d2i
      // b97: dload 24
      // b99: d2i
      // b9a: bipush 1
      // b9b: isub
      // b9c: dload 26
      // b9e: d2i
      // b9f: invokespecial mew.<init> (III)V
      // ba2: invokevirtual dug.getBlockState (Lmew;)Lzfz;
      // ba5: invokeinterface zfz.r_y ()Le0x; 1
      // baa: astore 28
      // bac: aload 28
      // bae: iload 3
      // baf: ifne bc8
      // bb2: getstatic ox_.gdz Les2;
      // RotationHelper: if_acmpeq bce
      // bb8: goto bbf
      // bbb: invokestatic sj_.a (Loov;)Loov;
      // bbe: athrow
      // bbf: aload 28
      // bc1: goto bc8
      // bc4: invokestatic sj_.a (Loov;)Loov;
      // bc7: athrow
      // bc8: getstatic ox_.whp L_13;
      // bcb: if_acmpne bf8
      // bce: aload 16
      // bd0: getstatic w_0.eiu Lw_0;
      // bd3: dload 22
      // bd5: dload 24
      // bd7: dload 26
      // bd9: bipush 2
      // bda: aload 0
      // bdb: getfield sj_.z2d Ljava/util/Random;
      // bde: bipush 2
      // bdf: invokevirtual java/util/Random.nextInt (I)I
      // be2: iadd
      // be3: ldc2_w 0.10000000149011612
      // be6: dconst_0
      // be7: ldc2_w 0.10000000149011612
      // bea: dconst_0
      // beb: bipush 0
      // bec: newarray 10
      // bee: invokevirtual dug.zra (Lw_0;DDDIDDDD[I)V
      // bf1: goto bf8
      // bf4: invokestatic sj_.a (Loov;)Loov;
      // bf7: athrow
      // bf8: aload 0
      // bf9: iload 3
      // bfa: ifne c21
      // bfd: getfield sj_.hpb I
      // c00: goto c07
      // c03: invokestatic sj_.a (Loov;)Loov;
      // c06: athrow
      // c07: ifgt c2f
      // c0a: aload 0
      // c0b: aload 0
      // c0c: getfield sj_.z2d Ljava/util/Random;
      // c0f: fconst_0
      // c10: ldc 360.0
      // c12: nop
      // c13: invokestatic fe6.m_l (Ljava/util/Random;FF)F
      // c16: putfield sj_.jul F
      // c19: aload 0
      // c1a: goto c21
      // c1d: invokestatic sj_.a (Loov;)Loov;
      // c20: athrow
      // c21: aload 0
      // c22: getfield sj_.z2d Ljava/util/Random;
      // c25: bipush 20
      // c27: bipush 80
      // c29: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // c2c: putfield sj_.ko_ I
      // c2f: iload 3
      // c30: ifeq c5f
      // c33: aload 0
      // c34: aload 0
      // c35: getfield sj_.z2d Ljava/util/Random;
      // c38: bipush 100
      // c3a: sipush 900
      // c3d: invokestatic fe6.pzp (Ljava/util/Random;II)I
      // c40: putfield sj_.hpb I
      // c43: aload 0
      // c44: goto c4b
      // c47: invokestatic sj_.a (Loov;)Loov;
      // c4a: athrow
      // c4b: dup
      // c4c: getfield sj_.hpb I
      // c4f: aload 0
      // c50: getfield sj_.iqf Lha9;
      // c53: invokestatic hc0.fjn (Lg_3;)I
      // c56: bipush 20
      // c58: imul
      // c59: bipush 5
      // c5a: imul
      // c5b: isub
      // c5c: putfield sj_.hpb I
      // c5f: aload 0
      // c60: iload 3
      // c61: ifne c72
      // c64: getfield sj_.vfx I
      // c67: goto c6e
      // c6a: invokestatic sj_.a (Loov;)Loov;
      // c6d: athrow
      // c6e: ifle c96
      // c71: aload 0
      // c72: dup
      // c73: getfield sj_.mop D
      // c76: aload 0
      // c77: getfield sj_.z2d Ljava/util/Random;
      // c7a: invokevirtual java/util/Random.nextFloat ()F
      // c7d: aload 0
      // c7e: getfield sj_.z2d Ljava/util/Random;
      // c81: invokevirtual java/util/Random.nextFloat ()F
      // c84: fmul
      // c85: aload 0
      // c86: getfield sj_.z2d Ljava/util/Random;
      // c89: invokevirtual java/util/Random.nextFloat ()F
      // c8c: fmul
      // c8d: f2d
      // c8e: ldc2_w 0.2
      // c91: dmul
      // c92: dsub
      // c93: putfield sj_.mop D
      // c96: dload 14
      // c98: ldc2_w 2.0
      // c9b: dmul
      // c9c: dconst_1
      // c9d: dsub
      // c9e: dstore 16
      // ca0: aload 0
      // ca1: dup
      // ca2: getfield sj_.mop D
      // ca5: ldc2_w 0.03999999910593033
      // ca8: dload 16
      // caa: dmul
      // cab: dadd
      // cac: putfield sj_.mop D
      // caf: iload 3
      // cb0: ifne cfb
      // cb3: dload 14
      // cb5: dconst_0
      // cb6: dcmpl
      // cb7: ifle cd7
      // cba: goto cc1
      // cbd: invokestatic sj_.a (Loov;)Loov;
      // cc0: athrow
      // cc1: fload 12
      // cc3: f2d
      // cc4: ldc2_w 0.9
      // cc7: dmul
      // cc8: d2f
      // cc9: fstore 12
      // ccb: aload 0
      // ccc: dup
      // ccd: getfield sj_.mop D
      // cd0: ldc2_w 0.8
      // cd3: dmul
      // cd4: putfield sj_.mop D
      // cd7: aload 0
      // cd8: dup
      // cd9: getfield sj_.icv D
      // cdc: fload 12
      // cde: f2d
      // cdf: dmul
      // ce0: putfield sj_.icv D
      // ce3: aload 0
      // ce4: dup
      // ce5: getfield sj_.mop D
      // ce8: fload 12
      // cea: f2d
      // ceb: dmul
      // cec: putfield sj_.mop D
      // cef: aload 0
      // cf0: dup
      // cf1: getfield sj_.bw4 D
      // cf4: fload 12
      // cf6: f2d
      // cf7: dmul
      // cf8: putfield sj_.bw4 D
      // cfb: aload 0
      // cfc: aload 0
      // cfd: getfield sj_.o2v D
      // d00: aload 0
      // d01: getfield sj_.kfp D
      // d04: aload 0
      // d05: getfield sj_.vbd D
      // d08: invokevirtual sj_.m6_ (DDD)V
      // d0b: return
   }

   @Override
   public void srs(bdo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic sj_.b J
      // 03: ldc2_w 91461221863326
      // 06: lxor
      // 07: lstore 2
      // 08: aload 1
      // 09: sipush 18244
      // 0c: ldc2_w 4811878371651148454
      // 0f: lload 2
      // 10: lxor
      // 11: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16: nop
      // 17: aload 0
      // 18: getfield sj_.xy1 I
      // 1b: i2s
      // 1c: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 1f: invokestatic OpaquePredicate.b ()I
      // 22: aload 1
      // 23: sipush 20668
      // 26: ldc2_w 8314972050038639964
      // 29: lload 2
      // 2a: lxor
      // 2b: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: nop
      // 31: aload 0
      // 32: getfield sj_.u8k I
      // 35: i2s
      // 36: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 39: aload 1
      // 3a: sipush 11068
      // 3d: ldc2_w 320051529381623515
      // 40: lload 2
      // 41: lxor
      // 42: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: aload 0
      // 49: getfield sj_._c7 I
      // 4c: i2s
      // 4d: invokevirtual bdo.ge7 (Ljava/lang/String;S)V
      // 50: getstatic e0x.db8 Ljnv;
      // 53: aload 0
      // 54: getfield sj_.tgj Le0x;
      // 57: invokevirtual jnv.csx (Ljava/lang/Object;)Ljava/lang/Object;
      // 5a: checkcast gdz
      // 5d: astore 5
      // 5f: istore 4
      // 61: aload 1
      // 62: sipush 17386
      // 65: ldc2_w 3416926866921414153
      // 68: lload 2
      // 69: lxor
      // 6a: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: nop
      // 70: aload 5
      // 72: iload 4
      // 74: ifeq 8d
      // 77: ifnonnull 8b
      // 7a: goto 81
      // 7d: invokestatic sj_.a (Loov;)Loov;
      // 80: athrow
      // 81: ldc ""
      // 83: nop
      // 84: goto 90
      // 87: invokestatic sj_.a (Loov;)Loov;
      // 8a: athrow
      // 8b: aload 5
      // 8d: invokevirtual gdz.toString ()Ljava/lang/String;
      // 90: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 93: aload 1
      // 94: sipush 17336
      // 97: ldc2_w 8371079463009476181
      // 9a: lload 2
      // 9b: lxor
      // 9c: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a1: nop
      // a2: aload 0
      // a3: getfield sj_.nfd I
      // a6: i2b
      // a7: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // aa: aload 1
      // ab: sipush 9126
      // ae: ldc2_w 3506158807605952071
      // b1: lload 2
      // b2: lxor
      // b3: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b8: nop
      // b9: aload 0
      // ba: getfield sj_.z65 Z
      // bd: iload 4
      // bf: ifeq cd
      // c2: ifeq d0
      // c5: goto cc
      // c8: invokestatic sj_.a (Loov;)Loov;
      // cb: athrow
      // cc: bipush 1
      // cd: goto d1
      // d0: bipush 0
      // d1: i2b
      // d2: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // d5: return
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
      // 000: getstatic sj_.b J
      // 003: ldc2_w 41234856715061
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: sipush 13693
      // 00d: ldc2_w 3706326512159015986
      // 010: lload 2
      // 011: lxor
      // 012: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 017: nop
      // 018: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 01b: putfield sj_.xy1 I
      // 01e: invokestatic OpaquePredicate.b ()I
      // 021: aload 0
      // 022: aload 1
      // 023: sipush 12585
      // 026: ldc2_w 1988702158270447723
      // 029: lload 2
      // 02a: lxor
      // 02b: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 030: nop
      // 031: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 034: putfield sj_.u8k I
      // 037: istore 4
      // 039: aload 0
      // 03a: aload 1
      // 03b: sipush 17913
      // 03e: ldc2_w 4947082131424163002
      // 041: lload 2
      // 042: lxor
      // 043: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 048: nop
      // 049: invokevirtual bdo.hp9 (Ljava/lang/String;)S
      // 04c: iload 4
      // 04e: ifeq 0b5
      // 051: putfield sj_._c7 I
      // 054: aload 1
      // 055: sipush 15840
      // 058: ldc2_w 6857969110676229280
      // 05b: lload 2
      // 05c: lxor
      // 05d: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: nop
      // 063: bipush 8
      // 065: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 068: ifeq 097
      // 06b: goto 072
      // 06e: invokestatic sj_.a (Loov;)Loov;
      // 071: athrow
      // 072: aload 0
      // 073: aload 1
      // 074: sipush 17386
      // 077: ldc2_w 3416871265293152930
      // 07a: lload 2
      // 07b: lxor
      // 07c: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 081: nop
      // 082: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 085: invokestatic e0x.mdd (Ljava/lang/String;)Le0x;
      // 088: putfield sj_.tgj Le0x;
      // 08b: iload 4
      // 08d: ifne 0bb
      // 090: goto 097
      // 093: invokestatic sj_.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 0
      // 098: aload 1
      // 099: sipush 17386
      // 09c: ldc2_w 3416871265293152930
      // 09f: lload 2
      // 0a0: lxor
      // 0a1: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a6: nop
      // 0a7: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0aa: sipush 255
      // 0ad: iand
      // 0ae: goto 0b5
      // 0b1: invokestatic sj_.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: invokestatic e0x.csc (I)Le0x;
      // 0b8: putfield sj_.tgj Le0x;
      // 0bb: aload 0
      // 0bc: aload 1
      // 0bd: sipush 6476
      // 0c0: ldc2_w 950997551249451010
      // 0c3: lload 2
      // 0c4: lxor
      // 0c5: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ca: nop
      // 0cb: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0ce: sipush 255
      // 0d1: iand
      // 0d2: putfield sj_.nfd I
      // 0d5: aload 0
      // 0d6: aload 1
      // 0d7: sipush 3998
      // 0da: ldc2_w 3300435125147303647
      // 0dd: lload 2
      // 0de: lxor
      // 0df: invokedynamic w (IJ)Ljava/lang/String; bsm=sj_.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: nop
      // 0e5: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 0e8: iload 4
      // 0ea: ifeq 100
      // 0ed: bipush 1
      // 0ee: if_icmpne 103
      // 0f1: goto 0f8
      // 0f4: invokestatic sj_.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: bipush 1
      // 0f9: goto 100
      // 0fc: invokestatic sj_.a (Loov;)Loov;
      // 0ff: athrow
      // 100: goto 104
      // 103: bipush 0
      // 104: putfield sj_.z65 Z
      // 107: return
   }

   public int vpv() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield sj_.oay Lt9d;
      // 008: getfield OpaquePredicate.v0f Z
      // 00b: iload 1
      // 00c: ifne 020
      // 00f: ifeq 01f
      // 012: goto 019
      // 015: invokestatic sj_.a (Loov;)Loov;
      // 018: athrow
      // 019: bipush 0
      // 01a: ireturn
      // 01b: invokestatic sj_.a (Loov;)Loov;
      // 01e: athrow
      // 01f: bipush 0
      // 020: istore 2
      // 021: aload 0
      // 022: iload 1
      // 023: ifne 0c1
      // 026: getfield sj_.pai Li2h;
      // 029: ifnull 0b9
      // 02c: goto 033
      // 02f: invokestatic sj_.a (Loov;)Loov;
      // 032: athrow
      // 033: aload 0
      // 034: getfield sj_.iqf Lha9;
      // 037: getfield ha9.o2v D
      // 03a: aload 0
      // 03b: getfield sj_.o2v D
      // 03e: dsub
      // 03f: dstore 3
      // 040: aload 0
      // 041: getfield sj_.iqf Lha9;
      // 044: getfield ha9.kfp D
      // 047: aload 0
      // 048: getfield sj_.kfp D
      // 04b: dsub
      // 04c: dstore 5
      // 04e: aload 0
      // 04f: getfield sj_.iqf Lha9;
      // 052: getfield ha9.vbd D
      // 055: aload 0
      // 056: getfield sj_.vbd D
      // 059: dsub
      // 05a: dstore 7
      // 05c: dload 3
      // 05d: dload 3
      // 05e: dmul
      // 05f: dload 5
      // 061: dload 5
      // 063: dmul
      // 064: dadd
      // 065: dload 7
      // 067: dload 7
      // 069: dmul
      // 06a: dadd
      // 06b: invokestatic fe6.dii (D)F
      // 06e: f2d
      // 06f: dstore 9
      // 071: ldc2_w 0.1
      // 074: dstore 11
      // 076: aload 0
      // 077: getfield sj_.pai Li2h;
      // 07a: dup
      // 07b: getfield EntityLivingBase.icv D
      // 07e: dload 3
      // 07f: dload 11
      // 081: dmul
      // 082: dadd
      // 083: putfield EntityLivingBase.icv D
      // 086: aload 0
      // 087: getfield sj_.pai Li2h;
      // 08a: dup
      // 08b: getfield EntityLivingBase.mop D
      // 08e: dload 5
      // 090: dload 11
      // 092: dmul
      // 093: dload 9
      // 095: invokestatic fe6.dii (D)F
      // 098: f2d
      // 099: ldc2_w 0.08
      // 09c: dmul
      // 09d: dadd
      // 09e: dadd
      // 09f: putfield EntityLivingBase.mop D
      // 0a2: aload 0
      // 0a3: getfield sj_.pai Li2h;
      // 0a6: dup
      // 0a7: getfield EntityLivingBase.bw4 D
      // 0aa: dload 7
      // 0ac: dload 11
      // 0ae: dmul
      // 0af: dadd
      // 0b0: putfield EntityLivingBase.bw4 D
      // 0b3: bipush 3
      // 0b4: istore 2
      // 0b5: iload 1
      // 0b6: ifeq 1a6
      // 0b9: aload 0
      // 0ba: goto 0c1
      // 0bd: invokestatic sj_.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: getfield sj_.vfx I
      // 0c4: iload 1
      // 0c5: ifne 1aa
      // 0c8: ifle 1a6
      // 0cb: goto 0d2
      // 0ce: invokestatic sj_.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: new nvf
      // 0d5: dup
      // 0d6: aload 0
      // 0d7: getfield sj_.oay Lt9d;
      // 0da: aload 0
      // 0db: getfield sj_.o2v D
      // 0de: aload 0
      // 0df: getfield sj_.kfp D
      // 0e2: aload 0
      // 0e3: getfield sj_.vbd D
      // 0e6: aload 0
      // 0e7: invokespecial sj_.iui ()Lerg;
      // 0ea: invokespecial nvf.<init> (Lt9d;DDDLerg;)V
      // 0ed: astore 3
      // 0ee: aload 0
      // 0ef: getfield sj_.iqf Lha9;
      // 0f2: getfield ha9.o2v D
      // 0f5: aload 0
      // 0f6: getfield sj_.o2v D
      // 0f9: dsub
      // 0fa: dstore 4
      // 0fc: aload 0
      // 0fd: getfield sj_.iqf Lha9;
      // 100: getfield ha9.kfp D
      // 103: aload 0
      // 104: getfield sj_.kfp D
      // 107: dsub
      // 108: dstore 6
      // 10a: aload 0
      // 10b: getfield sj_.iqf Lha9;
      // 10e: getfield ha9.vbd D
      // 111: aload 0
      // 112: getfield sj_.vbd D
      // 115: dsub
      // 116: dstore 8
      // 118: dload 4
      // 11a: dload 4
      // 11c: dmul
      // 11d: dload 6
      // 11f: dload 6
      // 121: dmul
      // 122: dadd
      // 123: dload 8
      // 125: dload 8
      // 127: dmul
      // 128: dadd
      // 129: invokestatic fe6.dii (D)F
      // 12c: f2d
      // 12d: dstore 10
      // 12f: ldc2_w 0.1
      // 132: dstore 12
      // 134: aload 3
      // 135: dload 4
      // 137: dload 12
      // 139: dmul
      // 13a: putfield nvf.icv D
      // 13d: aload 3
      // 13e: dload 6
      // 140: dload 12
      // 142: dmul
      // 143: dload 10
      // 145: invokestatic fe6.dii (D)F
      // 148: f2d
      // 149: ldc2_w 0.08
      // 14c: dmul
      // 14d: dadd
      // 14e: putfield nvf.mop D
      // 151: aload 3
      // 152: dload 8
      // 154: dload 12
      // 156: dmul
      // 157: putfield nvf.bw4 D
      // 15a: aload 0
      // 15b: getfield sj_.oay Lt9d;
      // 15e: aload 3
      // 15f: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 162: pop
      // 163: aload 0
      // 164: getfield sj_.iqf Lha9;
      // 167: getfield ha9.oay Lt9d;
      // 16a: new uno
      // 16d: dup
      // 16e: aload 0
      // 16f: getfield sj_.iqf Lha9;
      // 172: getfield ha9.oay Lt9d;
      // 175: aload 0
      // 176: getfield sj_.iqf Lha9;
      // 179: getfield ha9.o2v D
      // 17c: aload 0
      // 17d: getfield sj_.iqf Lha9;
      // 180: getfield ha9.kfp D
      // 183: ldc2_w 0.5
      // 186: dadd
      // 187: aload 0
      // 188: getfield sj_.iqf Lha9;
      // 18b: getfield ha9.vbd D
      // 18e: ldc2_w 0.5
      // 191: dadd
      // 192: aload 0
      // 193: getfield sj_.z2d Ljava/util/Random;
      // 196: bipush 6
      // 198: invokevirtual java/util/Random.nextInt (I)I
      // 19b: bipush 1
      // 19c: iadd
      // 19d: invokespecial uno.<init> (Lt9d;DDDI)V
      // 1a0: invokevirtual OpaquePredicate.xzq (Li2h;)Z
      // 1a3: pop
      // 1a4: bipush 1
      // 1a5: istore 2
      // 1a6: aload 0
      // 1a7: getfield sj_.z65 Z
      // 1aa: iload 1
      // 1ab: ifne 1c7
      // 1ae: ifeq 1ba
      // 1b1: goto 1b8
      // 1b4: invokestatic sj_.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: bipush 2
      // 1b9: istore 2
      // 1ba: aload 0
      // 1bb: invokevirtual sj_._kl ()V
      // 1be: aload 0
      // 1bf: getfield sj_.iqf Lha9;
      // 1c2: aconst_null
      // 1c3: putfield ha9.r44 Lsj_;
      // 1c6: iload 2
      // 1c7: ireturn
   }

   private erg iui() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield sj_.oay Lt9d;
      // 04: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 07: invokevirtual java/util/Random.nextFloat ()F
      // 0a: fstore 2
      // 0b: invokestatic OpaquePredicate.b ()I
      // 0e: aload 0
      // 0f: getfield sj_.iqf Lha9;
      // 12: invokestatic hc0.nsr (Lg_3;)I
      // 15: istore 3
      // 16: aload 0
      // 17: getfield sj_.iqf Lha9;
      // 1a: invokestatic hc0.fjn (Lg_3;)I
      // 1d: istore 4
      // 1f: ldc 0.1
      // 21: nop
      // 22: iload 3
      // 23: i2f
      // 24: ldc 0.025
      // 26: nop
      // 27: fmul
      // 28: fsub
      // 29: iload 4
      // 2b: i2f
      // 2c: ldc 0.01
      // 2e: nop
      // 2f: fmul
      // 30: fsub
      // 31: fstore 5
      // 33: ldc 0.05
      // 35: nop
      // 36: iload 3
      // 37: i2f
      // 38: ldc 0.01
      // 3a: nop
      // 3b: fmul
      // 3c: fadd
      // 3d: iload 4
      // 3f: i2f
      // 40: ldc 0.01
      // 42: nop
      // 43: fmul
      // 44: fsub
      // 45: fstore 6
      // 47: istore 1
      // 48: fload 5
      // 4a: fconst_0
      // 4b: fconst_1
      // 4c: invokestatic fe6._f3 (FFF)F
      // 4f: fstore 5
      // 51: fload 6
      // 53: fconst_0
      // 54: fconst_1
      // 55: invokestatic fe6._f3 (FFF)F
      // 58: fstore 6
      // 5a: fload 2
      // 5b: fload 5
      // 5d: fcmpg
      // 5e: iload 1
      // 5f: ifeq a3
      // 62: ifge 8f
      // 65: goto 6c
      // 68: invokestatic sj_.a (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield sj_.iqf Lha9;
      // 70: getstatic l9p.yhz L_ss;
      // 73: invokevirtual ha9.aex (L_ss;)V
      // 76: aload 0
      // 77: getfield sj_.z2d Ljava/util/Random;
      // 7a: getstatic sj_.ta9 Ljava/util/List;
      // 7d: invokestatic zfj.h82 (Ljava/util/Random;Ljava/util/Collection;)Lzfj$yuc;
      // 80: checkcast _4n
      // 83: aload 0
      // 84: getfield sj_.z2d Ljava/util/Random;
      // 87: invokevirtual _4n.et4 (Ljava/util/Random;)Lerg;
      // 8a: areturn
      // 8b: invokestatic sj_.a (Loov;)Loov;
      // 8e: athrow
      // 8f: fload 2
      // 90: fload 5
      // 92: fsub
      // 93: fstore 2
      // 94: fload 2
      // 95: fload 6
      // 97: iload 1
      // 98: ifeq cc
      // 9b: fcmpg
      // 9c: goto a3
      // 9f: invokestatic sj_.a (Loov;)Loov;
      // a2: athrow
      // a3: ifge c9
      // a6: aload 0
      // a7: getfield sj_.iqf Lha9;
      // aa: getstatic l9p.g0k L_ss;
      // ad: invokevirtual ha9.aex (L_ss;)V
      // b0: aload 0
      // b1: getfield sj_.z2d Ljava/util/Random;
      // b4: getstatic sj_.hk2 Ljava/util/List;
      // b7: invokestatic zfj.h82 (Ljava/util/Random;Ljava/util/Collection;)Lzfj$yuc;
      // ba: checkcast _4n
      // bd: aload 0
      // be: getfield sj_.z2d Ljava/util/Random;
      // c1: invokevirtual _4n.et4 (Ljava/util/Random;)Lerg;
      // c4: areturn
      // c5: invokestatic sj_.a (Loov;)Loov;
      // c8: athrow
      // c9: fload 2
      // ca: fload 6
      // cc: fsub
      // cd: fstore 7
      // cf: aload 0
      // d0: getfield sj_.iqf Lha9;
      // d3: getstatic l9p.ovo L_ss;
      // d6: invokevirtual ha9.aex (L_ss;)V
      // d9: aload 0
      // da: getfield sj_.z2d Ljava/util/Random;
      // dd: getstatic sj_.xud Ljava/util/List;
      // e0: invokestatic zfj.h82 (Ljava/util/Random;Ljava/util/Collection;)Lzfj$yuc;
      // e3: checkcast _4n
      // e6: aload 0
      // e7: getfield sj_.z2d Ljava/util/Random;
      // ea: invokevirtual _4n.et4 (Ljava/util/Random;)Lerg;
      // ed: areturn
   }

   @Override
   public void _kl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial EntityLivingBase._kl ()V
      // 08: aload 0
      // 09: getfield sj_.iqf Lha9;
      // 0c: iload 1
      // 0d: ifeq 25
      // 10: ifnull 29
      // 13: goto 1a
      // 16: invokestatic sj_.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield sj_.iqf Lha9;
      // 1e: goto 25
      // 21: invokestatic sj_.a (Loov;)Loov;
      // 24: athrow
      // 25: aconst_null
      // 26: putfield ha9.r44 Lsj_;
      // 29: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-765669456266505562L, 9105557463104550413L, MethodHandles.lookup().lookupClass()).a(212115257496907L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 23584303411169L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "\u0096±÷ÂH]MÜ¦ÕÕ\u0095\rµAuòqú\u009cý\u0090ý`íX\u000f!ó wï\u0010ßN¸å¡\u0016\u0004¨MHa,\u0007\u000bºÛ\u0010ß\u009c\u0016\u0018>\u008bcÂ\u0096`éÃo³\u008f\u0088\u0010kË\täÄY»\u0010\u0096 )\u0083ì\u0090l[\u0010Ù\u001a±®QºJv&\u0019Å'\u0092r?\u008c\u0010\u0095©\rãÓ.\u008bi\u009c®g©*-¤.\u0010é*P\u001c²®\u0006ªG\u000e_È\thÛ5 Ôè*È¹\u008b\u001d\u0091F´I\u0088×·C^.àWbæk\u000ezã`\u008ec|Ý¶$\u0010¦]*ïý\u0089.Pó¶NPÀ\u0081\u0082þ\u0010æí\u008fÊ%OEå1.è\u0096È3u\u0017\u0010ñ\u0002c'è\u009b¸FÇ¾ûxõ¨Êï";
      int var8 = "\u0096±÷ÂH]MÜ¦ÕÕ\u0095\rµAuòqú\u009cý\u0090ý`íX\u000f!ó wï\u0010ßN¸å¡\u0016\u0004¨MHa,\u0007\u000bºÛ\u0010ß\u009c\u0016\u0018>\u008bcÂ\u0096`éÃo³\u008f\u0088\u0010kË\täÄY»\u0010\u0096 )\u0083ì\u0090l[\u0010Ù\u001a±®QºJv&\u0019Å'\u0092r?\u008c\u0010\u0095©\rãÓ.\u008bi\u009c®g©*-¤.\u0010é*P\u001c²®\u0006ªG\u000e_È\thÛ5 Ôè*È¹\u008b\u001d\u0091F´I\u0088×·C^.àWbæk\u000ezã`\u008ec|Ý¶$\u0010¦]*ïý\u0089.Pó¶NPÀ\u0081\u0082þ\u0010æí\u008fÊ%OEå1.è\u0096È3u\u0017\u0010ñ\u0002c'è\u009b¸FÇ¾ûxõ¨Êï"
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
                     c = var9;
                     d = new String[13];
                     ta9 = Arrays.asList(
                        new _4n(new erg(xbr._qk), 10).s1t(0.9F),
                        new _4n(new erg(xbr.i8v), 10),
                        new _4n(new erg(xbr.pl_), 10),
                        new _4n(new erg(xbr.ik6), 10),
                        new _4n(new erg(xbr.eij), 5),
                        new _4n(new erg(xbr.kru), 2).s1t(0.9F),
                        new _4n(new erg(xbr.xz5), 10),
                        new _4n(new erg(xbr.t1j), 5),
                        new _4n(new erg(xbr.nnn, 10, qvg.qn4.b9d()), 1),
                        new _4n(new erg(ox_.r11), 10),
                        new _4n(new erg(xbr.ii5), 10)
                     );
                     hk2 = Arrays.asList(
                        new _4n(new erg(ox_.r67), 1),
                        new _4n(new erg(xbr.uh6), 1),
                        new _4n(new erg(xbr.fpq), 1),
                        new _4n(new erg(xbr.okb), 1).s1t(0.25F).jkg(),
                        new _4n(new erg(xbr.kru), 1).s1t(0.25F).jkg(),
                        new _4n(new erg(xbr.rm0), 1).jkg()
                     );
                     xud = Arrays.asList(
                        new _4n(new erg(xbr.h_h, 1, po4$i4c.umn.iho()), 60),
                        new _4n(new erg(xbr.h_h, 1, po4$i4c.y9x.iho()), 25),
                        new _4n(new erg(xbr.h_h, 1, po4$i4c.gei.iho()), 2),
                        new _4n(new erg(xbr.h_h, 1, po4$i4c.dv9.iho()), 13)
                     );
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

                  var6 = "úwç\b\fÐôe9_\u0089Òÿ\rÚ;\u000bÔD\u0007s\u000ete>\u0094û')#\u0013@\u0010\u0093#ÍüÅOw¨\u0001Xîøç%PQ";
                  var8 = "úwç\b\fÐôe9_\u0089Òÿ\rÚ;\u000bÔD\u0007s\u000ete>\u0094û')#\u0013@\u0010\u0093#ÍüÅOw¨\u0001Xîøç%PQ".length();
                  var5 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8589;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("sj_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("sj_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
