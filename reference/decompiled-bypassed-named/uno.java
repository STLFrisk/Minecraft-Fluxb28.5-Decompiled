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

public class uno extends EntityLivingBase {
   public int bkh;
   public int xqy;
   public int u9x;
   private static final long b;
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);

   public uno(OpaquePredicate var1, double var2, double var4, double var6, int var8) {
      super(var1);
      this.yxc(0.5F, 0.5F);
      this.m6_(var2, var4, var6);
      this.x5k = (float)(Math.random() * 360.0);
      this.icv = (double)((float)(Math.random() * 0.2F - 0.1F) * 2.0F);
      this.mop = (double)((float)(Math.random() * 0.2) * 2.0F);
      this.bw4 = (double)((float)(Math.random() * 0.2F - 0.1F) * 2.0F);
      this.loadConfig = var8;
   }

   @Override
   public boolean _p9() {
      return false;
   }

   public uno(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.25F, 0.25F);
   }

   @Override
   public void tbj() {
   }

   @Override
   public int azk(float var1) {
      float var3 = 0.5F;
      var3 = fe6._f3(var3, 0.0F, 1.0F);
      int var10000 = OpaquePredicate.c();
      int var4 = super.azk(var1);
      int var2 = var10000;
      int var5 = var4 & 0xFF;
      int var6 = var4 >> 16 & 0xFF;
      var5 += (int)(var3 * 15.0F * 16.0F);

      try {
         if (var2 != 0) {
            return var5 | 240;
         }

         if (var5 <= 240) {
            return var5 | var6 << 16;
         }
      } catch (oov var7) {
         throw a(var7);
      }

      short var11 = 240;
      return var11 | var6 << 16;
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
      // 000: getstatic uno.b J
      // 003: ldc2_w 121639255828881
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: invokespecial EntityLivingBase.xx_ ()V
      // 010: aload 0
      // 011: iload 3
      // 012: ifeq 058
      // 015: getfield uno.u9x I
      // 018: ifle 033
      // 01b: goto 022
      // 01e: invokestatic uno.a (Loov;)Loov;
      // 021: athrow
      // 022: aload 0
      // 023: dup
      // 024: getfield uno.u9x I
      // 027: bipush 1
      // 028: isub
      // 029: putfield uno.u9x I
      // 02c: goto 033
      // 02f: invokestatic uno.a (Loov;)Loov;
      // 032: athrow
      // 033: aload 0
      // 034: aload 0
      // 035: getfield uno.o2v D
      // 038: putfield uno.bc1 D
      // 03b: aload 0
      // 03c: aload 0
      // 03d: getfield uno.kfp D
      // 040: putfield uno.o_z D
      // 043: aload 0
      // 044: aload 0
      // 045: getfield uno.vbd D
      // 048: putfield uno.a4d D
      // 04b: aload 0
      // 04c: dup
      // 04d: getfield uno.mop D
      // 050: ldc2_w 0.029999999329447746
      // 053: dsub
      // 054: putfield uno.mop D
      // 057: aload 0
      // 058: iload 3
      // 059: ifeq 0e0
      // 05c: getfield uno.oay Lt9d;
      // 05f: new mew
      // 062: dup
      // 063: aload 0
      // 064: invokespecial mew.<init> (Li2h;)V
      // 067: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 06a: invokeinterface zfz.r_y ()Le0x; 1
      // 06f: invokevirtual e0x.p1r ()Lp3y;
      // 072: getstatic p3y.e1s Lp3y;
      // 075: if_acmpne 0df
      // 078: goto 07f
      // 07b: invokestatic uno.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 0
      // 080: ldc2_w 0.20000000298023224
      // 083: putfield uno.mop D
      // 086: aload 0
      // 087: aload 0
      // 088: getfield uno.z2d Ljava/util/Random;
      // 08b: invokevirtual java/util/Random.nextFloat ()F
      // 08e: aload 0
      // 08f: getfield uno.z2d Ljava/util/Random;
      // 092: invokevirtual java/util/Random.nextFloat ()F
      // 095: fsub
      // 096: ldc 0.2
      // 098: nop
      // 099: fmul
      // 09a: f2d
      // 09b: putfield uno.icv D
      // 09e: aload 0
      // 09f: aload 0
      // 0a0: getfield uno.z2d Ljava/util/Random;
      // 0a3: invokevirtual java/util/Random.nextFloat ()F
      // 0a6: aload 0
      // 0a7: getfield uno.z2d Ljava/util/Random;
      // 0aa: invokevirtual java/util/Random.nextFloat ()F
      // 0ad: fsub
      // 0ae: ldc 0.2
      // 0b0: nop
      // 0b1: fmul
      // 0b2: f2d
      // 0b3: putfield uno.bw4 D
      // 0b6: aload 0
      // 0b7: sipush 29672
      // 0ba: ldc2_w 8447411276968393204
      // 0bd: lload 1
      // 0be: lxor
      // 0bf: invokedynamic h (IJ)Ljava/lang/String; bsm=uno.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c4: nop
      // 0c5: ldc 0.4
      // 0c7: nop
      // 0c8: fconst_2
      // 0c9: aload 0
      // 0ca: getfield uno.z2d Ljava/util/Random;
      // 0cd: invokevirtual java/util/Random.nextFloat ()F
      // 0d0: ldc 0.4
      // 0d2: nop
      // 0d3: fmul
      // 0d4: fadd
      // 0d5: invokevirtual uno.lhu (Ljava/lang/String;FF)V
      // 0d8: goto 0df
      // 0db: invokestatic uno.a (Loov;)Loov;
      // 0de: athrow
      // 0df: aload 0
      // 0e0: aload 0
      // 0e1: getfield uno.o2v D
      // 0e4: aload 0
      // 0e5: invokevirtual uno.aaw ()Lnh4;
      // 0e8: getfield nh4.bx_ D
      // 0eb: aload 0
      // 0ec: invokevirtual uno.aaw ()Lnh4;
      // 0ef: getfield nh4.i2c D
      // 0f2: dadd
      // 0f3: ldc2_w 2.0
      // 0f6: ddiv
      // 0f7: aload 0
      // 0f8: getfield uno.vbd D
      // 0fb: invokevirtual uno.vwl (DDD)Z
      // 0fe: pop
      // 0ff: ldc2_w 8.0
      // 102: dstore 4
      // 104: aload 0
      // 105: iload 3
      // 106: ifeq 17f
      // 109: getfield uno.cu7 I
      // 10c: aload 0
      // 10d: getfield uno.bkh I
      // 110: bipush 20
      // 112: isub
      // 113: aload 0
      // 114: invokevirtual uno.jwu ()I
      // 117: bipush 100
      // 119: irem
      // 11a: iadd
      // 11b: if_icmpge 17e
      // 11e: goto 125
      // 121: invokestatic uno.a (Loov;)Loov;
      // 124: athrow
      // 125: aload 0
      // 126: iload 3
      // 127: ifeq 169
      // 12a: goto 131
      // 12d: invokestatic uno.a (Loov;)Loov;
      // 130: athrow
      // 131: getfield uno.jcj Lha9;
      // 134: ifnull 161
      // 137: goto 13e
      // 13a: invokestatic uno.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: iload 3
      // 140: ifeq 177
      // 143: goto 14a
      // 146: invokestatic uno.a (Loov;)Loov;
      // 149: athrow
      // 14a: getfield uno.jcj Lha9;
      // 14d: aload 0
      // 14e: invokevirtual ha9.wxg (Li2h;)D
      // 151: dload 4
      // 153: dload 4
      // 155: dmul
      // 156: dcmpl
      // 157: ifle 176
      // 15a: goto 161
      // 15d: invokestatic uno.a (Loov;)Loov;
      // 160: athrow
      // 161: aload 0
      // 162: goto 169
      // 165: invokestatic uno.a (Loov;)Loov;
      // 168: athrow
      // 169: aload 0
      // 16a: getfield uno.oay Lt9d;
      // 16d: aload 0
      // 16e: dload 4
      // 170: invokevirtual OpaquePredicate.a_q (Li2h;D)Lha9;
      // 173: putfield uno.jcj Lha9;
      // 176: aload 0
      // 177: aload 0
      // 178: getfield uno.bkh I
      // 17b: putfield uno.cu7 I
      // 17e: aload 0
      // 17f: getfield uno.jcj Lha9;
      // 182: iload 3
      // 183: ifeq 1c7
      // 186: ifnull 1b8
      // 189: goto 190
      // 18c: invokestatic uno.a (Loov;)Loov;
      // 18f: athrow
      // 190: aload 0
      // 191: getfield uno.jcj Lha9;
      // 194: iload 3
      // 195: ifeq 1c7
      // 198: goto 19f
      // 19b: invokestatic uno.a (Loov;)Loov;
      // 19e: athrow
      // 19f: invokevirtual ha9.myu ()Z
      // 1a2: ifeq 1b8
      // 1a5: goto 1ac
      // 1a8: invokestatic uno.a (Loov;)Loov;
      // 1ab: athrow
      // 1ac: aload 0
      // 1ad: aconst_null
      // 1ae: putfield uno.jcj Lha9;
      // 1b1: goto 1b8
      // 1b4: invokestatic uno.a (Loov;)Loov;
      // 1b7: athrow
      // 1b8: aload 0
      // 1b9: iload 3
      // 1ba: ifeq 27b
      // 1bd: getfield uno.jcj Lha9;
      // 1c0: goto 1c7
      // 1c3: invokestatic uno.a (Loov;)Loov;
      // 1c6: athrow
      // 1c7: ifnull 27a
      // 1ca: aload 0
      // 1cb: getfield uno.jcj Lha9;
      // 1ce: getfield ha9.o2v D
      // 1d1: aload 0
      // 1d2: getfield uno.o2v D
      // 1d5: dsub
      // 1d6: dload 4
      // 1d8: ddiv
      // 1d9: dstore 6
      // 1db: aload 0
      // 1dc: getfield uno.jcj Lha9;
      // 1df: getfield ha9.kfp D
      // 1e2: aload 0
      // 1e3: getfield uno.jcj Lha9;
      // 1e6: invokevirtual ha9.c5y ()F
      // 1e9: f2d
      // 1ea: dadd
      // 1eb: aload 0
      // 1ec: getfield uno.kfp D
      // 1ef: dsub
      // 1f0: dload 4
      // 1f2: ddiv
      // 1f3: dstore 8
      // 1f5: aload 0
      // 1f6: getfield uno.jcj Lha9;
      // 1f9: getfield ha9.vbd D
      // 1fc: aload 0
      // 1fd: getfield uno.vbd D
      // 200: dsub
      // 201: dload 4
      // 203: ddiv
      // 204: dstore 10
      // 206: dload 6
      // 208: dload 6
      // 20a: dmul
      // 20b: dload 8
      // 20d: dload 8
      // 20f: dmul
      // 210: dadd
      // 211: dload 10
      // 213: dload 10
      // 215: dmul
      // 216: dadd
      // 217: invokestatic java/lang/Math.sqrt (D)D
      // 21a: dstore 12
      // 21c: dconst_1
      // 21d: dload 12
      // 21f: dsub
      // 220: dstore 14
      // 222: iload 3
      // 223: ifeq 28a
      // 226: dload 14
      // 228: dconst_0
      // 229: dcmpl
      // 22a: ifle 27a
      // 22d: goto 234
      // 230: invokestatic uno.a (Loov;)Loov;
      // 233: athrow
      // 234: dload 14
      // 236: dload 14
      // 238: dmul
      // 239: dstore 14
      // 23b: aload 0
      // 23c: dup
      // 23d: getfield uno.icv D
      // 240: dload 6
      // 242: dload 12
      // 244: ddiv
      // 245: dload 14
      // 247: dmul
      // 248: ldc2_w 0.1
      // 24b: dmul
      // 24c: dadd
      // 24d: putfield uno.icv D
      // 250: aload 0
      // 251: dup
      // 252: getfield uno.mop D
      // 255: dload 8
      // 257: dload 12
      // 259: ddiv
      // 25a: dload 14
      // 25c: dmul
      // 25d: ldc2_w 0.1
      // 260: dmul
      // 261: dadd
      // 262: putfield uno.mop D
      // 265: aload 0
      // 266: dup
      // 267: getfield uno.bw4 D
      // 26a: dload 10
      // 26c: dload 12
      // 26e: ddiv
      // 26f: dload 14
      // 271: dmul
      // 272: ldc2_w 0.1
      // 275: dmul
      // 276: dadd
      // 277: putfield uno.bw4 D
      // 27a: aload 0
      // 27b: aload 0
      // 27c: getfield uno.icv D
      // 27f: aload 0
      // 280: getfield uno.mop D
      // 283: aload 0
      // 284: getfield uno.bw4 D
      // 287: invokevirtual uno.vjj (DDD)V
      // 28a: ldc 0.98
      // 28c: nop
      // 28d: fstore 6
      // 28f: aload 0
      // 290: getfield uno.lfk Z
      // 293: iload 3
      // 294: ifeq 2ff
      // 297: ifeq 2d7
      // 29a: goto 2a1
      // 29d: invokestatic uno.a (Loov;)Loov;
      // 2a0: athrow
      // 2a1: aload 0
      // 2a2: getfield uno.oay Lt9d;
      // 2a5: new mew
      // 2a8: dup
      // 2a9: aload 0
      // 2aa: getfield uno.o2v D
      // 2ad: invokestatic fe6.jqf (D)I
      // 2b0: aload 0
      // 2b1: invokevirtual uno.aaw ()Lnh4;
      // 2b4: getfield nh4.bx_ D
      // 2b7: invokestatic fe6.jqf (D)I
      // 2ba: bipush 1
      // 2bb: isub
      // 2bc: aload 0
      // 2bd: getfield uno.vbd D
      // 2c0: invokestatic fe6.jqf (D)I
      // 2c3: invokespecial mew.<init> (III)V
      // 2c6: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 2c9: invokeinterface zfz.r_y ()Le0x; 1
      // 2ce: getfield e0x.t50 F
      // 2d1: ldc 0.98
      // 2d3: nop
      // 2d4: fmul
      // 2d5: fstore 6
      // 2d7: aload 0
      // 2d8: dup
      // 2d9: getfield uno.icv D
      // 2dc: fload 6
      // 2de: f2d
      // 2df: dmul
      // 2e0: putfield uno.icv D
      // 2e3: aload 0
      // 2e4: dup
      // 2e5: getfield uno.mop D
      // 2e8: ldc2_w 0.9800000190734863
      // 2eb: dmul
      // 2ec: putfield uno.mop D
      // 2ef: aload 0
      // 2f0: dup
      // 2f1: getfield uno.bw4 D
      // 2f4: fload 6
      // 2f6: f2d
      // 2f7: dmul
      // 2f8: putfield uno.bw4 D
      // 2fb: aload 0
      // 2fc: getfield uno.lfk Z
      // 2ff: iload 3
      // 300: ifeq 343
      // 303: ifeq 320
      // 306: goto 30d
      // 309: invokestatic uno.a (Loov;)Loov;
      // 30c: athrow
      // 30d: aload 0
      // 30e: dup
      // 30f: getfield uno.mop D
      // 312: ldc2_w -0.8999999761581421
      // 315: dmul
      // 316: putfield uno.mop D
      // 319: goto 320
      // 31c: invokestatic uno.a (Loov;)Loov;
      // 31f: athrow
      // 320: aload 0
      // 321: dup
      // 322: getfield uno.bkh I
      // 325: bipush 1
      // 326: iadd
      // 327: putfield uno.bkh I
      // 32a: aload 0
      // 32b: dup
      // 32c: getfield uno.xqy I
      // 32f: bipush 1
      // 330: iadd
      // 331: putfield uno.xqy I
      // 334: aload 0
      // 335: iload 3
      // 336: ifeq 351
      // 339: getfield uno.xqy I
      // 33c: goto 343
      // 33f: invokestatic uno.a (Loov;)Loov;
      // 342: athrow
      // 343: sipush 6000
      // 346: if_icmplt 354
      // 349: aload 0
      // 34a: goto 351
      // 34d: invokestatic uno.a (Loov;)Loov;
      // 350: athrow
      // 351: invokevirtual uno._kl ()V
      // 354: return
   }

   @Override
   public boolean r24() {
      return this.oay.jqj(this.aaw(), p3y.six, this);
   }

   @Override
   public void esk(int var1) {
      this.m1t(ofh.pho, (float)var1);
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual uno.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifeq 31
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic uno.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic uno.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: invokevirtual uno.dxm ()V
      // 21: aload 0
      // 22: aload 0
      // 23: getfield uno.gkf I
      // 26: i2f
      // 27: fload 2
      // 28: fsub
      // 29: f2i
      // 2a: putfield uno.gkf I
      // 2d: aload 0
      // 2e: getfield uno.gkf I
      // 31: iload 3
      // 32: ifeq 4b
      // 35: ifgt 4a
      // 38: goto 3f
      // 3b: invokestatic uno.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: invokevirtual uno._kl ()V
      // 43: goto 4a
      // 46: invokestatic uno.a (Loov;)Loov;
      // 49: athrow
      // 4a: bipush 0
      // 4b: ireturn
   }

   @Override
   public void srs(bdo var1) {
      long var2 = b ^ 127573398800575L;
      var1.ge7(b<"h">(8838, 9001486395610073520L ^ var2), (short)((byte)this.gkf));
      var1.ge7(b<"h">(14621, 4550420144264286762L ^ var2), (short)this.xqy);
      var1.ge7(b<"h">(3678, 1154694558790198634L ^ var2), (short)this.loadConfig);
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = b ^ 2923702592532L;
      this.gkf = var1.hp9(b<"h">(6122, 6753889136918548596L ^ var2)) & 255;
      this.xqy = var1.hp9(b<"h">(7321, 7232315807602858753L ^ var2));
      this.loadConfig = var1.hp9(b<"h">(27677, 6213847949407660935L ^ var2));
   }

   @Override
   public void bzm(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic uno.b J
      // 03: ldc2_w 63771028610709
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: getfield uno.oay Lt9d;
      // 11: getfield OpaquePredicate.v0f Z
      // 14: iload 4
      // 16: ifeq 2e
      // 19: ifne a9
      // 1c: goto 23
      // 1f: invokestatic uno.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield uno.u9x I
      // 27: goto 2e
      // 2a: invokestatic uno.a (Loov;)Loov;
      // 2d: athrow
      // 2e: iload 4
      // 30: ifeq 54
      // 33: ifne a9
      // 36: goto 3d
      // 39: invokestatic uno.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 1
      // 3e: iload 4
      // 40: ifeq 9e
      // 43: goto 4a
      // 46: invokestatic uno.a (Loov;)Loov;
      // 49: athrow
      // 4a: getfield ha9.o8x I
      // 4d: goto 54
      // 50: invokestatic uno.a (Loov;)Loov;
      // 53: athrow
      // 54: ifne a9
      // 57: aload 1
      // 58: bipush 2
      // 59: putfield ha9.o8x I
      // 5c: aload 0
      // 5d: getfield uno.oay Lt9d;
      // 60: aload 1
      // 61: sipush 21747
      // 64: ldc2_w 1968775796862085609
      // 67: lload 2
      // 68: lxor
      // 69: invokedynamic h (IJ)Ljava/lang/String; bsm=uno.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6e: nop
      // 6f: ldc 0.1
      // 71: nop
      // 72: ldc 0.5
      // 74: nop
      // 75: aload 0
      // 76: getfield uno.z2d Ljava/util/Random;
      // 79: invokevirtual java/util/Random.nextFloat ()F
      // 7c: aload 0
      // 7d: getfield uno.z2d Ljava/util/Random;
      // 80: invokevirtual java/util/Random.nextFloat ()F
      // 83: fsub
      // 84: ldc 0.7
      // 86: nop
      // 87: fmul
      // 88: ldc 1.8
      // 8a: nop
      // 8b: fadd
      // 8c: fmul
      // 8d: invokevirtual OpaquePredicate.yfq (Li2h;Ljava/lang/String;FF)V
      // 90: aload 1
      // 91: aload 0
      // 92: bipush 1
      // 93: invokevirtual ha9.p3n (Li2h;I)V
      // 96: aload 1
      // 97: goto 9e
      // 9a: invokestatic uno.a (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 0
      // 9f: getfield uno.loadConfig I
      // a2: invokevirtual ha9.nli (I)V
      // a5: aload 0
      // a6: invokevirtual uno._kl ()V
      // a9: return
   }

   public int _pa() {
      return this.loadConfig;
   }

   public int pan() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield uno.loadConfig I
      // 008: sipush 2477
      // 00b: iload 1
      // 00c: ifeq 029
      // 00f: if_icmplt 022
      // 012: goto 019
      // 015: invokestatic uno.a (Loov;)Loov;
      // 018: athrow
      // 019: bipush 10
      // 01b: goto 122
      // 01e: invokestatic uno.a (Loov;)Loov;
      // 021: athrow
      // 022: aload 0
      // 023: getfield uno.loadConfig I
      // 026: sipush 1237
      // 029: iload 1
      // 02a: ifeq 047
      // 02d: if_icmplt 040
      // 030: goto 037
      // 033: invokestatic uno.a (Loov;)Loov;
      // 036: athrow
      // 037: bipush 9
      // 039: goto 122
      // 03c: invokestatic uno.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield uno.loadConfig I
      // 044: sipush 617
      // 047: iload 1
      // 048: ifeq 065
      // 04b: if_icmplt 05e
      // 04e: goto 055
      // 051: invokestatic uno.a (Loov;)Loov;
      // 054: athrow
      // 055: bipush 8
      // 057: goto 122
      // 05a: invokestatic uno.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 0
      // 05f: getfield uno.loadConfig I
      // 062: sipush 307
      // 065: iload 1
      // 066: ifeq 083
      // 069: if_icmplt 07c
      // 06c: goto 073
      // 06f: invokestatic uno.a (Loov;)Loov;
      // 072: athrow
      // 073: bipush 7
      // 075: goto 122
      // 078: invokestatic uno.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 0
      // 07d: getfield uno.loadConfig I
      // 080: sipush 149
      // 083: iload 1
      // 084: ifeq 0a0
      // 087: if_icmplt 09a
      // 08a: goto 091
      // 08d: invokestatic uno.a (Loov;)Loov;
      // 090: athrow
      // 091: bipush 6
      // 093: goto 122
      // 096: invokestatic uno.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 0
      // 09b: getfield uno.loadConfig I
      // 09e: bipush 73
      // 0a0: iload 1
      // 0a1: ifeq 0bc
      // 0a4: if_icmplt 0b6
      // 0a7: goto 0ae
      // 0aa: invokestatic uno.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: bipush 5
      // 0af: goto 122
      // 0b2: invokestatic uno.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: getfield uno.loadConfig I
      // 0ba: bipush 37
      // 0bc: iload 1
      // 0bd: ifeq 0d8
      // 0c0: if_icmplt 0d2
      // 0c3: goto 0ca
      // 0c6: invokestatic uno.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: bipush 4
      // 0cb: goto 122
      // 0ce: invokestatic uno.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: getfield uno.loadConfig I
      // 0d6: bipush 17
      // 0d8: iload 1
      // 0d9: ifeq 0f4
      // 0dc: if_icmplt 0ee
      // 0df: goto 0e6
      // 0e2: invokestatic uno.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: bipush 3
      // 0e7: goto 122
      // 0ea: invokestatic uno.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: getfield uno.loadConfig I
      // 0f2: bipush 7
      // 0f4: iload 1
      // 0f5: ifeq 11a
      // 0f8: if_icmplt 10a
      // 0fb: goto 102
      // 0fe: invokestatic uno.a (Loov;)Loov;
      // 101: athrow
      // 102: bipush 2
      // 103: goto 122
      // 106: invokestatic uno.a (Loov;)Loov;
      // 109: athrow
      // 10a: aload 0
      // 10b: getfield uno.loadConfig I
      // 10e: iload 1
      // 10f: ifeq 11e
      // 112: bipush 3
      // 113: goto 11a
      // 116: invokestatic uno.a (Loov;)Loov;
      // 119: athrow
      // 11a: if_icmplt 121
      // 11d: bipush 1
      // 11e: goto 122
      // 121: bipush 0
      // 122: ireturn
   }

   public static int di5(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: iload 0
      // 005: sipush 2477
      // 008: iload 1
      // 009: ifeq 024
      // 00c: if_icmplt 020
      // 00f: goto 016
      // 012: invokestatic uno.a (Loov;)Loov;
      // 015: athrow
      // 016: sipush 2477
      // 019: goto 10d
      // 01c: invokestatic uno.a (Loov;)Loov;
      // 01f: athrow
      // 020: iload 0
      // 021: sipush 1237
      // 024: iload 1
      // 025: ifeq 040
      // 028: if_icmplt 03c
      // 02b: goto 032
      // 02e: invokestatic uno.a (Loov;)Loov;
      // 031: athrow
      // 032: sipush 1237
      // 035: goto 10d
      // 038: invokestatic uno.a (Loov;)Loov;
      // 03b: athrow
      // 03c: iload 0
      // 03d: sipush 617
      // 040: iload 1
      // 041: ifeq 05c
      // 044: if_icmplt 058
      // 047: goto 04e
      // 04a: invokestatic uno.a (Loov;)Loov;
      // 04d: athrow
      // 04e: sipush 617
      // 051: goto 10d
      // 054: invokestatic uno.a (Loov;)Loov;
      // 057: athrow
      // 058: iload 0
      // 059: sipush 307
      // 05c: iload 1
      // 05d: ifeq 078
      // 060: if_icmplt 074
      // 063: goto 06a
      // 066: invokestatic uno.a (Loov;)Loov;
      // 069: athrow
      // 06a: sipush 307
      // 06d: goto 10d
      // 070: invokestatic uno.a (Loov;)Loov;
      // 073: athrow
      // 074: iload 0
      // 075: sipush 149
      // 078: iload 1
      // 079: ifeq 093
      // 07c: if_icmplt 090
      // 07f: goto 086
      // 082: invokestatic uno.a (Loov;)Loov;
      // 085: athrow
      // 086: sipush 149
      // 089: goto 10d
      // 08c: invokestatic uno.a (Loov;)Loov;
      // 08f: athrow
      // 090: iload 0
      // 091: bipush 73
      // 093: iload 1
      // 094: ifeq 0ad
      // 097: if_icmplt 0aa
      // 09a: goto 0a1
      // 09d: invokestatic uno.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: bipush 73
      // 0a3: goto 10d
      // 0a6: invokestatic uno.a (Loov;)Loov;
      // 0a9: athrow
      // 0aa: iload 0
      // 0ab: bipush 37
      // 0ad: iload 1
      // 0ae: ifeq 0c7
      // 0b1: if_icmplt 0c4
      // 0b4: goto 0bb
      // 0b7: invokestatic uno.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: bipush 37
      // 0bd: goto 10d
      // 0c0: invokestatic uno.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: iload 0
      // 0c5: bipush 17
      // 0c7: iload 1
      // 0c8: ifeq 0e1
      // 0cb: if_icmplt 0de
      // 0ce: goto 0d5
      // 0d1: invokestatic uno.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: bipush 17
      // 0d7: goto 10d
      // 0da: invokestatic uno.a (Loov;)Loov;
      // 0dd: athrow
      // 0de: iload 0
      // 0df: bipush 7
      // 0e1: iload 1
      // 0e2: ifeq 105
      // 0e5: if_icmplt 0f8
      // 0e8: goto 0ef
      // 0eb: invokestatic uno.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: bipush 7
      // 0f1: goto 10d
      // 0f4: invokestatic uno.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: iload 0
      // 0f9: iload 1
      // 0fa: ifeq 109
      // 0fd: bipush 3
      // 0fe: goto 105
      // 101: invokestatic uno.a (Loov;)Loov;
      // 104: athrow
      // 105: if_icmplt 10c
      // 108: bipush 3
      // 109: goto 10d
      // 10c: bipush 1
      // 10d: ireturn
   }

   @Override
   public boolean qvl() {
      return false;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(5196532783853129481L, -983997547418270935L, MethodHandles.lookup().lookupClass()).a(218782370581524L);
      // $VF: monitorexit
      b = var10000;
      long var0 = b ^ 110843238229870L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "J\u007fñ8W\u0093L\u001dgÑ¥arµÆ\u0081\u0018{jÜ¿IPwI5\fß\u008dSÒ<&x\u001bAùé0\u0081\u0002\u0010qÄl¼®³ÔÇBXÈ2\u0086\u000e:3\u0018Kyü\u009dMz¨{2\u00933\u0081'å(\u009e\u0089öpì\u000eÁûÂ\u00105\u000eù\u0087\u0090eZ³=:&ÿoü{m\u0010\u001bk{Søá\u009dï\u001f\u008e£\u0081\nPkú";
      int var8 = "J\u007fñ8W\u0093L\u001dgÑ¥arµÆ\u0081\u0018{jÜ¿IPwI5\fß\u008dSÒ<&x\u001bAùé0\u0081\u0002\u0010qÄl¼®³ÔÇBXÈ2\u0086\u000e:3\u0018Kyü\u009dMz¨{2\u00933\u0081'å(\u009e\u0089öpì\u000eÁûÂ\u00105\u000eù\u0087\u0090eZ³=:&ÿoü{m\u0010\u001bk{Søá\u009dï\u001f\u008e£\u0081\nPkú"
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
                     c = var9;
                     d = new String[8];
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

                  var6 = "÷øYT^m¢\u0084ø{\u0001½õÖùï\u0010¶»\u0002ðÞÝSC\u0013t\u0001\u008c;eß\b";
                  var8 = "÷øYT^m¢\u0084ø{\u0001½õÖùï\u0010¶»\u0002ðÞÝSC\u0013t\u0001\u008c;eß\b".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5981;
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
            throw new RuntimeException("uno", var10);
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
         throw new RuntimeException("uno" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
