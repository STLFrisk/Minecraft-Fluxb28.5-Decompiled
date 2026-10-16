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

public class kxi extends j37 {
   private kxi$pn4 kbe;
   private int mqi = 0;
   private int b_z = 0;
   private boolean skp = false;
   private boolean x2s = false;
   private int d0b = 0;
   private kxi$vxo gp3 = kxi$vxo.e_w;
   private int jp6 = 0;
   private ha9 z7f = null;
   private static final long c;
   private static final String[] h;
   private static final String[] y;
   private static final Map z = new HashMap(13);

   public kxi(t9d var1) {
      super(var1);
      this.yxc(0.6F, 0.7F);
      this.w6o = new kxi$x9z(this, this);
      this.i1n = new kxi$m6s(this);
      ((zvv)this.zq2()).uuq(true);
      this.f35.yos(2.5F);
      this.r1d.tn8(1, new dnq(this));
      this.r1d.tn8(1, new kxi$xkd(this, 1.33));
      this.r1d.tn8(2, new ttn(this, 1.0, xbr.aar, false));
      this.r1d.tn8(2, new ttn(this, 1.0, xbr.jph, false));
      this.r1d.tn8(2, new ttn(this, 1.0, u7m.gfm(ox_.qmk), false));
      this.r1d.tn8(3, new rg_(this, 0.8));
      this.r1d.tn8(5, new kxi$qhn(this));
      this.r1d.tn8(5, new _tb(this, 0.6));
      this.r1d.tn8(11, new bdq(this, ha9.class, 10.0F));
      this.kbe = new kxi$pn4(this, gse.class, 16.0F, 1.33, 1.33);
      this.r1d.tn8(4, this.kbe);
      this.uf3(0.0);
   }

   @Override
   public float rvh() {
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
      // 06: ifeq 49
      // 09: getfield kxi.i1n Lbww;
      // 0c: invokevirtual bww.c68 ()Z
      // 0f: ifeq 48
      // 12: goto 19
      // 15: invokestatic kxi.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifeq 49
      // 1e: goto 25
      // 21: invokestatic kxi.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield kxi.i1n Lbww;
      // 28: invokevirtual bww.wbk ()D
      // 2b: aload 0
      // 2c: getfield kxi.kfp D
      // 2f: ldc2_w 0.5
      // 32: dadd
      // 33: dcmpl
      // 34: ifle 48
      // 37: goto 3e
      // 3a: invokestatic kxi.a (Loov;)Loov;
      // 3d: athrow
      // 3e: ldc 0.5
      // 40: nop
      // 41: goto 4f
      // 44: invokestatic kxi.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: getfield kxi.gp3 Lkxi$vxo;
      // 4c: invokevirtual kxi$vxo.pta ()F
      // 4f: freturn
   }

   public void zc7(kxi$vxo var1) {
      this.gp3 = var1;
   }

   public float wz4(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield kxi.b_z I
      // 08: iload 2
      // 09: ifne 22
      // 0c: ifne 1e
      // 0f: goto 16
      // 12: invokestatic kxi.a (Loov;)Loov;
      // 15: athrow
      // 16: fconst_0
      // 17: goto 2b
      // 1a: invokestatic kxi.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield kxi.mqi I
      // 22: i2f
      // 23: fload 1
      // 24: fadd
      // 25: aload 0
      // 26: getfield kxi.b_z I
      // 29: i2f
      // 2a: fdiv
      // 2b: freturn
   }

   public void uf3(double var1) {
      this.zq2().rbp(var1);
      this.i1n.n5p(this.i1n.bgt(), this.i1n.wbk(), this.i1n.hda(), var1);
   }

   public void eu5(boolean param1, kxi$vxo param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 1
      // 06: invokespecial j37.k5k (Z)V
      // 09: iload 3
      // 0a: ifeq 5a
      // 0d: iload 1
      // 0e: ifne 46
      // 11: goto 18
      // 14: invokestatic kxi.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: iload 3
      // 1a: ifeq 80
      // 1d: goto 24
      // 20: invokestatic kxi.a (Loov;)Loov;
      // 23: athrow
      // 24: getfield kxi.gp3 Lkxi$vxo;
      // 27: getstatic kxi$vxo.hzb Lkxi$vxo;
      // 2a: if_acmpne 7f
      // 2d: goto 34
      // 30: invokestatic kxi.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: getstatic kxi$vxo.e_w Lkxi$vxo;
      // 38: putfield kxi.gp3 Lkxi$vxo;
      // 3b: iload 3
      // 3c: ifne 7f
      // 3f: goto 46
      // 42: invokestatic kxi.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: ldc2_w 1.5
      // 4a: aload 2
      // 4b: invokevirtual kxi$vxo._io ()F
      // 4e: f2d
      // 4f: dmul
      // 50: invokevirtual kxi.uf3 (D)V
      // 53: goto 5a
      // 56: invokestatic kxi.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 0
      // 5c: invokevirtual kxi.av3 ()Ljava/lang/String;
      // 5f: aload 0
      // 60: invokevirtual kxi.o23 ()F
      // 63: aload 0
      // 64: getfield kxi.z2d Ljava/util/Random;
      // 67: invokevirtual java/util/Random.nextFloat ()F
      // 6a: aload 0
      // 6b: getfield kxi.z2d Ljava/util/Random;
      // 6e: invokevirtual java/util/Random.nextFloat ()F
      // 71: fsub
      // 72: ldc 0.2
      // 74: nop
      // 75: fmul
      // 76: fconst_1
      // 77: fadd
      // 78: ldc 0.8
      // 7a: nop
      // 7b: fmul
      // 7c: invokevirtual kxi.lhu (Ljava/lang/String;FF)V
      // 7f: aload 0
      // 80: iload 1
      // 81: putfield kxi.skp Z
      // 84: return
   }

   public void l7k(kxi$vxo var1) {
      this.eu5(true, var1);
      this.b_z = var1.oxv();
      this.mqi = 0;
   }

   public boolean lm5() {
      return this.skp;
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(18, (byte)0);
   }

   @Override
   public void qar() {
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
      // 006: ifeq 037
      // 009: getfield kxi.i1n Lbww;
      // 00c: invokevirtual bww.r1p ()D
      // 00f: ldc2_w 0.8
      // 012: dcmpl
      // 013: ifle 02f
      // 016: goto 01d
      // 019: invokestatic kxi.a (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 0
      // 01e: getstatic kxi$vxo.te9 Lkxi$vxo;
      // 021: invokevirtual kxi.zc7 (Lkxi$vxo;)V
      // 024: iload 1
      // 025: ifne 059
      // 028: goto 02f
      // 02b: invokestatic kxi.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: goto 037
      // 033: invokestatic kxi.a (Loov;)Loov;
      // 036: athrow
      // 037: iload 1
      // 038: ifeq 05a
      // 03b: getfield kxi.gp3 Lkxi$vxo;
      // 03e: getstatic kxi$vxo.hzb Lkxi$vxo;
      // 041: if_acmpeq 059
      // 044: goto 04b
      // 047: invokestatic kxi.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getstatic kxi$vxo.e_w Lkxi$vxo;
      // 04f: invokevirtual kxi.zc7 (Lkxi$vxo;)V
      // 052: goto 059
      // 055: invokestatic kxi.a (Loov;)Loov;
      // 058: athrow
      // 059: aload 0
      // 05a: getfield kxi.d0b I
      // 05d: iload 1
      // 05e: ifeq 080
      // 061: ifle 07c
      // 064: goto 06b
      // 067: invokestatic kxi.a (Loov;)Loov;
      // 06a: athrow
      // 06b: aload 0
      // 06c: dup
      // 06d: getfield kxi.d0b I
      // 070: bipush 1
      // 071: isub
      // 072: putfield kxi.d0b I
      // 075: goto 07c
      // 078: invokestatic kxi.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 0
      // 07d: getfield kxi.jp6 I
      // 080: iload 1
      // 081: ifeq 0d3
      // 084: ifle 0c4
      // 087: goto 08e
      // 08a: invokestatic kxi.a (Loov;)Loov;
      // 08d: athrow
      // 08e: aload 0
      // 08f: dup
      // 090: getfield kxi.jp6 I
      // 093: aload 0
      // 094: getfield kxi.z2d Ljava/util/Random;
      // 097: bipush 3
      // 098: invokevirtual java/util/Random.nextInt (I)I
      // 09b: isub
      // 09c: putfield kxi.jp6 I
      // 09f: aload 0
      // 0a0: getfield kxi.jp6 I
      // 0a3: iload 1
      // 0a4: ifeq 0d3
      // 0a7: goto 0ae
      // 0aa: invokestatic kxi.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: ifge 0c4
      // 0b1: goto 0b8
      // 0b4: invokestatic kxi.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: bipush 0
      // 0ba: putfield kxi.jp6 I
      // 0bd: goto 0c4
      // 0c0: invokestatic kxi.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: iload 1
      // 0c6: ifeq 27d
      // 0c9: getfield kxi.lfk Z
      // 0cc: goto 0d3
      // 0cf: invokestatic kxi.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: ifeq 27c
      // 0d6: aload 0
      // 0d7: getfield kxi.x2s Z
      // 0da: iload 1
      // 0db: ifeq 111
      // 0de: goto 0e5
      // 0e1: invokestatic kxi.a (Loov;)Loov;
      // 0e4: athrow
      // 0e5: ifne 102
      // 0e8: goto 0ef
      // 0eb: invokestatic kxi.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: bipush 0
      // 0f1: getstatic kxi$vxo.mih Lkxi$vxo;
      // 0f4: invokevirtual kxi.eu5 (ZLkxi$vxo;)V
      // 0f7: aload 0
      // 0f8: invokespecial kxi.o36 ()V
      // 0fb: goto 102
      // 0fe: invokestatic kxi.a (Loov;)Loov;
      // 101: athrow
      // 102: aload 0
      // 103: iload 1
      // 104: ifeq 19b
      // 107: invokevirtual kxi.f0c ()I
      // 10a: goto 111
      // 10d: invokestatic kxi.a (Loov;)Loov;
      // 110: athrow
      // 111: bipush 99
      // 113: if_icmpne 19a
      // 116: aload 0
      // 117: iload 1
      // 118: ifeq 19b
      // 11b: goto 122
      // 11e: invokestatic kxi.a (Loov;)Loov;
      // 121: athrow
      // 122: getfield kxi.d0b I
      // 125: ifne 19a
      // 128: goto 12f
      // 12b: invokestatic kxi.a (Loov;)Loov;
      // 12e: athrow
      // 12f: aload 0
      // 130: iload 1
      // 131: ifeq 19b
      // 134: goto 13b
      // 137: invokestatic kxi.a (Loov;)Loov;
      // 13a: athrow
      // 13b: invokevirtual kxi.q4v ()Lg_3;
      // 13e: astore 2
      // 13f: aload 2
      // 140: ifnull 19a
      // 143: aload 0
      // 144: iload 1
      // 145: ifeq 19b
      // 148: goto 14f
      // 14b: invokestatic kxi.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 2
      // 150: invokevirtual kxi.wxg (Li2h;)D
      // 153: ldc2_w 16.0
      // 156: dcmpg
      // 157: ifge 19a
      // 15a: goto 161
      // 15d: invokestatic kxi.a (Loov;)Loov;
      // 160: athrow
      // 161: aload 0
      // 162: aload 2
      // 163: getfield g_3.o2v D
      // 166: aload 2
      // 167: getfield g_3.vbd D
      // 16a: invokespecial kxi.w0w (DD)V
      // 16d: aload 0
      // 16e: getfield kxi.i1n Lbww;
      // 171: aload 2
      // 172: getfield g_3.o2v D
      // 175: aload 2
      // 176: getfield g_3.kfp D
      // 179: aload 2
      // 17a: getfield g_3.vbd D
      // 17d: aload 0
      // 17e: getfield kxi.i1n Lbww;
      // 181: invokevirtual bww.r1p ()D
      // 184: invokevirtual bww.n5p (DDDD)V
      // 187: aload 0
      // 188: getstatic kxi$vxo.hzb Lkxi$vxo;
      // 18b: invokevirtual kxi.l7k (Lkxi$vxo;)V
      // 18e: aload 0
      // 18f: bipush 1
      // 190: putfield kxi.x2s Z
      // 193: goto 19a
      // 196: invokestatic kxi.a (Loov;)Loov;
      // 199: athrow
      // 19a: aload 0
      // 19b: getfield kxi.w6o Lrr0;
      // 19e: checkcast kxi$x9z
      // 1a1: astore 2
      // 1a2: aload 2
      // 1a3: invokevirtual kxi$x9z.pt9 ()Z
      // 1a6: iload 1
      // 1a7: ifeq 26e
      // 1aa: ifne 263
      // 1ad: goto 1b4
      // 1b0: invokestatic kxi.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: aload 0
      // 1b5: iload 1
      // 1b6: ifeq 27d
      // 1b9: goto 1c0
      // 1bc: invokestatic kxi.a (Loov;)Loov;
      // 1bf: athrow
      // 1c0: getfield kxi.i1n Lbww;
      // 1c3: invokevirtual bww.c68 ()Z
      // 1c6: ifeq 27c
      // 1c9: goto 1d0
      // 1cc: invokestatic kxi.a (Loov;)Loov;
      // 1cf: athrow
      // 1d0: aload 0
      // 1d1: iload 1
      // 1d2: ifeq 27d
      // 1d5: goto 1dc
      // 1d8: invokestatic kxi.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: getfield kxi.d0b I
      // 1df: ifne 27c
      // 1e2: goto 1e9
      // 1e5: invokestatic kxi.a (Loov;)Loov;
      // 1e8: athrow
      // 1e9: aload 0
      // 1ea: getfield kxi.f35 Lp8a;
      // 1ed: invokevirtual p8a.v_4 ()Lt_2;
      // 1f0: astore 3
      // 1f1: new fqr
      // 1f4: dup
      // 1f5: aload 0
      // 1f6: getfield kxi.i1n Lbww;
      // 1f9: invokevirtual bww.bgt ()D
      // 1fc: aload 0
      // 1fd: getfield kxi.i1n Lbww;
      // 200: invokevirtual bww.wbk ()D
      // 203: aload 0
      // 204: getfield kxi.i1n Lbww;
      // 207: invokevirtual bww.hda ()D
      // 20a: invokespecial fqr.<init> (DDD)V
      // 20d: astore 4
      // 20f: iload 1
      // 210: ifeq 25f
      // 213: aload 3
      // 214: ifnull 249
      // 217: goto 21e
      // 21a: invokestatic kxi.a (Loov;)Loov;
      // 21d: athrow
      // 21e: aload 3
      // 21f: iload 1
      // 220: ifeq 243
      // 223: goto 22a
      // 226: invokestatic kxi.a (Loov;)Loov;
      // 229: athrow
      // 22a: invokevirtual t_2.x03 ()I
      // 22d: aload 3
      // 22e: invokevirtual t_2.ov7 ()I
      // 231: if_icmpge 249
      // 234: goto 23b
      // 237: invokestatic kxi.a (Loov;)Loov;
      // 23a: athrow
      // 23b: aload 3
      // 23c: goto 243
      // 23f: invokestatic kxi.a (Loov;)Loov;
      // 242: athrow
      // 243: aload 0
      // 244: invokevirtual t_2.qq_ (Li2h;)Lfqr;
      // 247: astore 4
      // 249: aload 0
      // 24a: aload 4
      // 24c: getfield fqr.lvi D
      // 24f: aload 4
      // 251: getfield fqr.bn2 D
      // 254: invokespecial kxi.w0w (DD)V
      // 257: aload 0
      // 258: aload 0
      // 259: getfield kxi.gp3 Lkxi$vxo;
      // 25c: invokevirtual kxi.l7k (Lkxi$vxo;)V
      // 25f: iload 1
      // 260: ifne 27c
      // 263: aload 2
      // 264: invokevirtual kxi$x9z.a5h ()Z
      // 267: goto 26e
      // 26a: invokestatic kxi.a (Loov;)Loov;
      // 26d: athrow
      // 26e: ifne 27c
      // 271: aload 0
      // 272: invokespecial kxi.u8l ()V
      // 275: goto 27c
      // 278: invokestatic kxi.a (Loov;)Loov;
      // 27b: athrow
      // 27c: aload 0
      // 27d: aload 0
      // 27e: getfield kxi.lfk Z
      // 281: putfield kxi.x2s Z
      // 284: return
   }

   @Override
   public void i6m() {
   }

   private void w0w(double var1, double var3) {
      this.x5k = (float)(fe6.yr8(var3 - this.vbd, var1 - this.o2v) * 180.0 / Math.PI) - 90.0F;
   }

   private void u8l() {
      ((kxi$x9z)this.w6o).gzd(true);
   }

   private void y38() {
      ((kxi$x9z)this.w6o).gzd(false);
   }

   private void i21() {
      this.d0b = this.czo();
   }

   private void o36() {
      this.i21();
      this.y38();
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial j37.e_a ()V
      // 08: aload 0
      // 09: getfield kxi.mqi I
      // 0c: iload 1
      // 0d: ifeq 87
      // 10: aload 0
      // 11: getfield kxi.b_z I
      // 14: if_icmpeq 71
      // 17: goto 1e
      // 1a: invokestatic kxi.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: iload 1
      // 20: ifeq 64
      // 23: goto 2a
      // 26: invokestatic kxi.a (Loov;)Loov;
      // 29: athrow
      // 2a: getfield kxi.mqi I
      // 2d: ifne 63
      // 30: goto 37
      // 33: invokestatic kxi.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: iload 1
      // 39: ifeq 64
      // 3c: goto 43
      // 3f: invokestatic kxi.a (Loov;)Loov;
      // 42: athrow
      // 43: getfield kxi.oay Lt9d;
      // 46: getfield t9d.v0f Z
      // 49: ifne 63
      // 4c: goto 53
      // 4f: invokestatic kxi.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: getfield kxi.oay Lt9d;
      // 57: aload 0
      // 58: bipush 1
      // 59: invokevirtual t9d.qyn (Li2h;B)V
      // 5c: goto 63
      // 5f: invokestatic kxi.a (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: dup
      // 65: getfield kxi.mqi I
      // 68: bipush 1
      // 69: iadd
      // 6a: putfield kxi.mqi I
      // 6d: iload 1
      // 6e: ifne 9b
      // 71: aload 0
      // 72: iload 1
      // 73: ifeq 97
      // 76: goto 7d
      // 79: invokestatic kxi.a (Loov;)Loov;
      // 7c: athrow
      // 7d: getfield kxi.b_z I
      // 80: goto 87
      // 83: invokestatic kxi.a (Loov;)Loov;
      // 86: athrow
      // 87: ifeq 9b
      // 8a: aload 0
      // 8b: bipush 0
      // 8c: putfield kxi.mqi I
      // 8f: aload 0
      // 90: goto 97
      // 93: invokestatic kxi.a (Loov;)Loov;
      // 96: athrow
      // 97: bipush 0
      // 98: putfield kxi.b_z I
      // 9b: return
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(10.0);
      this.dgt(m6d.w7i).zf7(0.3F);
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 79699155490223L;
      super.srs(var1);
      var1.iin(f<"m">(27246, 8807461491767219395L ^ var2), this.f0c());
      var1.iin(f<"m">(18673, 1601055013299172959L ^ var2), this.jp6);
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 69072243226884L;
      super.cjb(var1);
      this.iqn(var1.uz7(f<"m">(17824, 1260576068571682734L ^ var2)));
      this.jp6 = var1.uz7(f<"m">(1166, 1867782459724273294L ^ var2));
   }

   public String av3() {
      long var1 = c ^ 67267022306141L;
      return f<"m">(6447, 2099961130082945401L ^ var1);
   }

   @Override
   public String _n1() {
      long var1 = c ^ 80548650102745L;
      return f<"m">(399, 4053668808445543760L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 92236501229729L;
      return f<"m">(26483, 8668838477261417682L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 119390369847023L;
      return f<"m">(19296, 5046194160980604556L ^ var1);
   }

   @Override
   public boolean _nm(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic kxi.c J
      // 03: ldc2_w 119155931506572
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: invokevirtual kxi.f0c ()I
      // 11: iload 4
      // 13: ifne 65
      // 16: bipush 99
      // 18: if_icmpne 5a
      // 1b: goto 22
      // 1e: invokestatic kxi.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: sipush 28484
      // 26: ldc2_w 5029303296513500109
      // 29: lload 2
      // 2a: lxor
      // 2b: invokedynamic m (IJ)Ljava/lang/String; bsm=kxi.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 30: nop
      // 31: fconst_1
      // 32: aload 0
      // 33: getfield kxi.z2d Ljava/util/Random;
      // 36: invokevirtual java/util/Random.nextFloat ()F
      // 39: aload 0
      // 3a: getfield kxi.z2d Ljava/util/Random;
      // 3d: invokevirtual java/util/Random.nextFloat ()F
      // 40: fsub
      // 41: ldc 0.2
      // 43: nop
      // 44: fmul
      // 45: fconst_1
      // 46: fadd
      // 47: invokevirtual kxi.lhu (Ljava/lang/String;FF)V
      // 4a: aload 1
      // 4b: aload 0
      // 4c: invokestatic ofh.kun (Lg_3;)Lofh;
      // 4f: ldc 8.0
      // 51: nop
      // 52: invokevirtual i2h.m1t (Lofh;F)Z
      // 55: ireturn
      // 56: invokestatic kxi.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 1
      // 5b: aload 0
      // 5c: invokestatic ofh.kun (Lg_3;)Lofh;
      // 5f: ldc 3.0
      // 61: nop
      // 62: invokevirtual i2h.m1t (Lofh;F)Z
      // 65: ireturn
   }

   @Override
   public int y5z() {
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
      // 05: iload 1
      // 06: ifne 22
      // 09: invokevirtual kxi.f0c ()I
      // 0c: bipush 99
      // 0e: if_icmpne 21
      // 11: goto 18
      // 14: invokestatic kxi.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 8
      // 1a: goto 25
      // 1d: invokestatic kxi.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: invokespecial j37.y5z ()I
      // 25: ireturn
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
      // 04: aload 0
      // 05: aload 1
      // 06: iload 3
      // 07: ifeq 21
      // 0a: invokevirtual kxi.nss (Lofh;)Z
      // 0d: ifeq 1f
      // 10: goto 17
      // 13: invokestatic kxi.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: goto 25
      // 1b: invokestatic kxi.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 1
      // 21: fload 2
      // 22: invokespecial j37.m1t (Lofh;F)Z
      // 25: ireturn
   }

   @Override
   public void z3m() {
      this.qji(new erg(xbr.qiq, 1), 0.0F);
   }

   @Override
   public void ir3(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield kxi.z2d Ljava/util/Random;
      // 04: bipush 2
      // 05: invokevirtual java/util/Random.nextInt (I)I
      // 08: aload 0
      // 09: getfield kxi.z2d Ljava/util/Random;
      // 0c: bipush 1
      // 0d: iload 2
      // 0e: iadd
      // 0f: invokevirtual java/util/Random.nextInt (I)I
      // 12: iadd
      // 13: istore 4
      // 15: invokestatic t9d.c ()I
      // 18: bipush 0
      // 19: istore 5
      // 1b: istore 3
      // 1c: iload 5
      // 1e: iload 4
      // 20: if_icmpge 3e
      // 23: aload 0
      // 24: getstatic xbr.vtw Lu7m;
      // 27: bipush 1
      // 28: invokevirtual kxi.e70 (Lu7m;I)Lnvf;
      // 2b: pop
      // 2c: iinc 5 1
      // 2f: iload 3
      // 30: ifne 48
      // 33: iload 3
      // 34: ifeq 1c
      // 37: goto 3e
      // 3a: invokestatic kxi.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield kxi.z2d Ljava/util/Random;
      // 42: bipush 2
      // 43: invokevirtual java/util/Random.nextInt (I)I
      // 46: istore 4
      // 48: bipush 0
      // 49: istore 5
      // 4b: iload 5
      // 4d: iload 4
      // 4f: if_icmpge 8f
      // 52: aload 0
      // 53: iload 3
      // 54: ifne 80
      // 57: invokevirtual kxi.agj ()Z
      // 5a: ifeq 78
      // 5d: goto 64
      // 60: invokestatic kxi.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: getstatic xbr.sng Lu7m;
      // 68: bipush 1
      // 69: invokevirtual kxi.e70 (Lu7m;I)Lnvf;
      // 6c: pop
      // 6d: iload 3
      // 6e: ifeq 88
      // 71: goto 78
      // 74: invokestatic kxi.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 0
      // 79: goto 80
      // 7c: invokestatic kxi.a (Loov;)Loov;
      // 7f: athrow
      // 80: getstatic xbr.yt3 Lu7m;
      // 83: bipush 1
      // 84: invokevirtual kxi.e70 (Lu7m;I)Lnvf;
      // 87: pop
      // 88: iinc 5 1
      // 8b: iload 3
      // 8c: ifeq 4b
      // 8f: return
   }

   private boolean qsg(u7m param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic xbr.aar Lu7m;
      // 08: iload 2
      // 09: ifne 21
      // 0c: if_acmpeq 40
      // 0f: goto 16
      // 12: invokestatic kxi.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getstatic xbr.jph Lu7m;
      // 1a: goto 21
      // 1d: invokestatic kxi.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 3d
      // 25: if_acmpeq 40
      // 28: goto 2f
      // 2b: invokestatic kxi.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: getstatic ox_.qmk Lu5m;
      // 33: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 36: goto 3d
      // 39: invokestatic kxi.a (Loov;)Loov;
      // 3c: athrow
      // 3d: if_acmpne 48
      // 40: bipush 1
      // 41: goto 49
      // 44: invokestatic kxi.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
   }

   public kxi kv0(dms param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: new kxi
      // 07: dup
      // 08: aload 0
      // 09: getfield kxi.oay Lt9d;
      // 0c: invokespecial kxi.<init> (Lt9d;)V
      // 0f: astore 3
      // 10: aload 1
      // 11: instanceof kxi
      // 14: ifeq 49
      // 17: aload 3
      // 18: aload 0
      // 19: iload 2
      // 1a: ifne 43
      // 1d: goto 24
      // 20: invokestatic kxi.a (Loov;)Loov;
      // 23: athrow
      // 24: getfield kxi.z2d Ljava/util/Random;
      // 27: invokevirtual java/util/Random.nextBoolean ()Z
      // 2a: ifeq 3f
      // 2d: goto 34
      // 30: invokestatic kxi.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 0
      // 35: invokevirtual kxi.f0c ()I
      // 38: goto 46
      // 3b: invokestatic kxi.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 1
      // 40: checkcast kxi
      // 43: invokevirtual kxi.f0c ()I
      // 46: invokevirtual kxi.iqn (I)V
      // 49: aload 3
      // 4a: areturn
   }

   @Override
   public boolean _cv(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: ifnull 29
      // 08: aload 0
      // 09: aload 1
      // 0a: invokevirtual erg.gn1 ()Lu7m;
      // 0d: invokespecial kxi.qsg (Lu7m;)Z
      // 10: iload 2
      // 11: ifeq 26
      // 14: goto 1b
      // 17: invokestatic kxi.a (Loov;)Loov;
      // 1a: athrow
      // 1b: ifeq 29
      // 1e: goto 25
      // 21: invokestatic kxi.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2a
      // 29: bipush 0
      // 2a: ireturn
   }

   public int f0c() {
      return this.oit.miz(18);
   }

   public void iqn(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic kxi.c J
      // 03: ldc2_w 34305751523577
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: iload 1
      // 0e: iload 4
      // 10: ifne 8e
      // 13: bipush 99
      // 15: if_icmpne ad
      // 18: goto 1f
      // 1b: invokestatic kxi.a (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield kxi.r1d Ldak;
      // 23: aload 0
      // 24: getfield kxi.kbe Lkxi$pn4;
      // 27: invokevirtual dak.hmq (Lcjm;)V
      // 2a: aload 0
      // 2b: getfield kxi.r1d Ldak;
      // 2e: bipush 4
      // 2f: new kxi$ac3
      // 32: dup
      // 33: aload 0
      // 34: invokespecial kxi$ac3.<init> (Lkxi;)V
      // 37: invokevirtual dak.tn8 (ILcjm;)V
      // 3a: aload 0
      // 3b: getfield kxi.g9o Ldak;
      // 3e: bipush 1
      // 3f: new z7z
      // 42: dup
      // 43: aload 0
      // 44: bipush 0
      // 45: bipush 0
      // 46: anewarray 562
      // 49: invokespecial z7z.<init> (Llaq;Z[Ljava/lang/Class;)V
      // 4c: invokevirtual dak.tn8 (ILcjm;)V
      // 4f: aload 0
      // 50: getfield kxi.g9o Ldak;
      // 53: bipush 2
      // 54: new s24
      // 57: dup
      // 58: aload 0
      // 59: ldc ha9
      // 5b: nop
      // 5c: bipush 1
      // 5d: invokespecial s24.<init> (Llaq;Ljava/lang/Class;Z)V
      // 60: invokevirtual dak.tn8 (ILcjm;)V
      // 63: aload 0
      // 64: getfield kxi.g9o Ldak;
      // 67: bipush 2
      // 68: new s24
      // 6b: dup
      // 6c: aload 0
      // 6d: ldc gse
      // 6f: nop
      // 70: bipush 1
      // 71: invokespecial s24.<init> (Llaq;Ljava/lang/Class;Z)V
      // 74: invokevirtual dak.tn8 (ILcjm;)V
      // 77: aload 0
      // 78: iload 4
      // 7a: ifne ae
      // 7d: goto 84
      // 80: invokestatic kxi.a (Loov;)Loov;
      // 83: athrow
      // 84: invokevirtual kxi.qrh ()Z
      // 87: goto 8e
      // 8a: invokestatic kxi.a (Loov;)Loov;
      // 8d: athrow
      // 8e: ifne ad
      // 91: aload 0
      // 92: sipush 297
      // 95: ldc2_w 7097304466998479575
      // 98: lload 2
      // 99: lxor
      // 9a: invokedynamic m (IJ)Ljava/lang/String; bsm=kxi.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 9f: nop
      // a0: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // a3: invokevirtual kxi.x84 (Ljava/lang/String;)V
      // a6: goto ad
      // a9: invokestatic kxi.a (Loov;)Loov;
      // ac: athrow
      // ad: aload 0
      // ae: getfield kxi.oit Lwl1;
      // b1: bipush 18
      // b3: iload 1
      // b4: i2b
      // b5: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // b8: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // bb: return
   }

   @Override
   public ps6 hx8(css param1, ps6 param2) {
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
      // 03: invokespecial j37.hx8 (Lcss;Lps6;)Lps6;
      // 06: astore 2
      // 07: invokestatic t9d.c ()I
      // 0a: aload 0
      // 0b: getfield kxi.z2d Ljava/util/Random;
      // 0e: bipush 6
      // 10: invokevirtual java/util/Random.nextInt (I)I
      // 13: istore 4
      // 15: istore 3
      // 16: bipush 0
      // 17: istore 5
      // 19: aload 2
      // 1a: instanceof kxi$lvy
      // 1d: iload 3
      // 1e: ifne 35
      // 21: ifeq 3b
      // 24: goto 2b
      // 27: invokestatic kxi.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 2
      // 2c: checkcast kxi$lvy
      // 2f: getfield kxi$lvy.wwf I
      // 32: istore 4
      // 34: bipush 1
      // 35: istore 5
      // 37: iload 3
      // 38: ifeq 45
      // 3b: new kxi$lvy
      // 3e: dup
      // 3f: iload 4
      // 41: invokespecial kxi$lvy.<init> (I)V
      // 44: astore 2
      // 45: aload 0
      // 46: iload 4
      // 48: iload 3
      // 49: ifne 66
      // 4c: invokevirtual kxi.iqn (I)V
      // 4f: iload 5
      // 51: ifeq 69
      // 54: goto 5b
      // 57: invokestatic kxi.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: sipush -24000
      // 5f: goto 66
      // 62: invokestatic kxi.a (Loov;)Loov;
      // 65: athrow
      // 66: invokevirtual kxi.mr2 (I)V
      // 69: aload 2
      // 6a: areturn
   }

   private boolean s_y() {
      int var1 = t9d.b();

      try {
         if (var1 == 0) {
            return (boolean)this.jp6;
         }

         if (this.jp6 == 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public int czo() {
      return this.gp3.zo3();
   }

   public void uj9() {
      this.oay
         .zvy(
            w_0.jxl,
            this.o2v + (double)(this.z2d.nextFloat() * this.uo6 * 2.0F) - (double)this.uo6,
            this.kfp + 0.5 + (double)(this.z2d.nextFloat() * this.ikl),
            this.vbd + (double)(this.z2d.nextFloat() * this.uo6 * 2.0F) - (double)this.uo6,
            0.0,
            0.0,
            0.0,
            new int[]{e0x.r2y(ox_.r9b.kig(7))}
         );
      this.jp6 = 100;
   }

   @Override
   public void ptf(byte param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: bipush 1
      // 06: if_icmpne 23
      // 09: aload 0
      // 0a: invokevirtual kxi.ghx ()V
      // 0d: aload 0
      // 0e: bipush 10
      // 10: putfield kxi.b_z I
      // 13: aload 0
      // 14: bipush 0
      // 15: putfield kxi.mqi I
      // 18: iload 2
      // 19: ifne 2f
      // 1c: goto 23
      // 1f: invokestatic kxi.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: iload 1
      // 25: invokespecial j37.ptf (B)V
      // 28: goto 2f
      // 2b: invokestatic kxi.a (Loov;)Loov;
      // 2e: athrow
      // 2f: return
   }

   @Override
   public dms kv0(dms var1) {
      return this.kv0(var1);
   }

   public static boolean l_2(kxi var0) {
      return var0.s_y();
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(4696054833661024395L, -7526248807447587305L, MethodHandles.lookup().lookupClass()).a(170399026523486L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 77362292116486L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "êE\f}\u0086ti\u00ad\u0097O¥-Öl\u0013ú)\u0096x£\u001d¦Ë\u0010\u001a\u0098}%\u008av«¸é´\u0007];8çõ\u0018v$!ª¢\u000e\u001ezJ`¿¢\rHz:¿\u0080\u0016>ì\u0002\u0088\u0089 mè© \\(\u0004ñgN\u009aÔm\u0010q\u001c\\\bÆ\u0097\u000e\u0090\\ª\u0088ß\u0019\u008dfU@ë póâòUÄfÑ\u009a\u0087H\u0098\u0086pb\u009aá0µQ÷À\u001b¡ñ~\u0084ß\u0090#@D(\u008b67±ù\u009eÅÆËÇØñ\u0082Å°\n~\n¸ç¨&\u0092e+$Ê Óªì\u0014>üÕ\u0087\u0081êÊ´\u0018C|¯\u0013/\u000es\u000fr\u0083ÂcJ¸ÀÀ8ê½Ç \u0004`C {ük\u0005©\u0089U\u00adð\u0010Ø±Ú\u0094ûBS»óà,Âàÿ£l\u001fbå;g\u007f\u00187EwÕ7ë\u0017iíË\u0083\u0092T\u0089ª\u0001\u001a\u00104XQÐ|Ò";
      int var8 = "êE\f}\u0086ti\u00ad\u0097O¥-Öl\u0013ú)\u0096x£\u001d¦Ë\u0010\u001a\u0098}%\u008av«¸é´\u0007];8çõ\u0018v$!ª¢\u000e\u001ezJ`¿¢\rHz:¿\u0080\u0016>ì\u0002\u0088\u0089 mè© \\(\u0004ñgN\u009aÔm\u0010q\u001c\\\bÆ\u0097\u000e\u0090\\ª\u0088ß\u0019\u008dfU@ë póâòUÄfÑ\u009a\u0087H\u0098\u0086pb\u009aá0µQ÷À\u001b¡ñ~\u0084ß\u0090#@D(\u008b67±ù\u009eÅÆËÇØñ\u0082Å°\n~\n¸ç¨&\u0092e+$Ê Óªì\u0014>üÕ\u0087\u0081êÊ´\u0018C|¯\u0013/\u000es\u000fr\u0083ÂcJ¸ÀÀ8ê½Ç \u0004`C {ük\u0005©\u0089U\u00adð\u0010Ø±Ú\u0094ûBS»óà,Âàÿ£l\u001fbå;g\u007f\u00187EwÕ7ë\u0017iíË\u0083\u0092T\u0089ª\u0001\u001a\u00104XQÐ|Ò"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = g(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     h = var9;
                     y = new String[10];
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

                  var6 = "Y³`°PrèrOÓRCç\u00adQ\u0097È\u0011º\u000bÖi·Î °\u008b\u0015Ô?}ÒúS\u0085\u0084å\u009c¾ã\u001cß\u0015C÷aÖü¶©ò\u0093\u008b%ôB(";
                  var8 = "Y³`°PrèrOÓRCç\u00adQ\u0097È\u0011º\u000bÖi·Î °\u008b\u0015Ô?}ÒúS\u0085\u0084å\u009c¾ã\u001cß\u0015C÷aÖü¶©ò\u0093\u008b%ôB(".length();
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

   private static String g(byte[] var0) {
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

   private static String f(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17088;
      if (y[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])z.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               z.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("kxi", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         y[var5] = g(((Cipher)var4[0]).doFinal(var9));
      }

      return y[var5];
   }

   private static Object f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("kxi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
