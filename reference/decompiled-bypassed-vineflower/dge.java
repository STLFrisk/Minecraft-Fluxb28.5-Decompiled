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

public class dge extends yqv implements uv0 {
   public float yzk;
   public float mhp;
   public float un8;
   private boolean kz9;
   private static final long d;
   private static final String[] g;
   private static final String[] h;
   private static final Map s = new HashMap(13);

   public dge(t9d var1) {
      super(var1);
      this.i1n = new dge$ilj(this);
      this.r1d.tn8(1, new dge$dsq(this));
      this.r1d.tn8(2, new dge$_fz(this));
      this.r1d.tn8(3, new dge$y05(this));
      this.r1d.tn8(5, new dge$g4m(this));
      this.g9o.tn8(1, new zy4(this));
      this.g9o.tn8(3, new _z_(this, osf.class));
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, (byte)1);
   }

   public void p1y(int var1) {
      this.oit.c66(16, (byte)var1);
      this.yxc(0.51000005F * (float)var1, 0.51000005F * (float)var1);
      this.m6_(this.o2v, this.kfp, this.vbd);
      this.dgt(m6d.t9k).zf7((double)(var1 * var1));
      this.dgt(m6d.w7i).zf7((double)(0.2F + 0.1F * (float)var1));
      this.uh3(this.axb());
      this.dlk = var1;
   }

   public int qi8() {
      return this.oit.miz(16);
   }

   @Override
   public void srs(bdo var1) {
      long var2 = d ^ 24455300083291L;
      super.srs(var1);
      var1.iin(d<"t">(12634, 1618663788070188397L ^ var2), this.qi8() - 1);
      var1.zyu(d<"t">(7840, 2576381525720930969L ^ var2), this.kz9);
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = d ^ 106187498849008L;
      int var4 = t9d.c();
      super.cjb(var1);
      int var5 = var1.uz7(d<"t">(4997, 8846480997841599253L ^ var2));

      label20: {
         try {
            if (var4 != 0) {
               return;
            }

            if (var5 >= 0) {
               break label20;
            }
         } catch (oov var6) {
            throw b(var6);
         }

         var5 = 0;
      }

      this.p1y(var5 + 1);
      this.kz9 = var1.dvl(d<"t">(6955, 6530096558017147836L ^ var2));
   }

   public w_0 mj4() {
      return w_0.wce;
   }

   public String u5x() {
      long var1 = d ^ 139488582282067L;
      int var3 = t9d.b();
      StringBuilder var10000 = new StringBuilder();
      String var10001 = d<"t">(29402, 5261263013531268070L ^ var1);
      if (var3 != 0) {
         try {
            var10000 = var10000.append(var10001);
            if (this.qi8() > 1) {
               return var10000.append(d<"t">(29123, 6743618908676239606L ^ var1)).toString();
            }
         } catch (oov var4) {
            throw b(var4);
         }

         var10001 = d<"t">(31703, 3592022006949296871L ^ var1);
      }

      return var10000.append(var10001).toString();
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
      // 005: getfield dge.oay Lt9d;
      // 008: getfield t9d.v0f Z
      // 00b: iload 1
      // 00c: ifeq 083
      // 00f: ifne 05d
      // 012: goto 019
      // 015: invokestatic dge.b (Loov;)Loov;
      // 018: athrow
      // 019: aload 0
      // 01a: iload 1
      // 01b: ifeq 080
      // 01e: goto 025
      // 021: invokestatic dge.b (Loov;)Loov;
      // 024: athrow
      // 025: getfield dge.oay Lt9d;
      // 028: invokevirtual t9d.rbk ()Lv66;
      // 02b: getstatic v66.na2 Lv66;
      // 02e: if_acmpne 05d
      // 031: goto 038
      // 034: invokestatic dge.b (Loov;)Loov;
      // 037: athrow
      // 038: aload 0
      // 039: invokevirtual dge.qi8 ()I
      // 03c: iload 1
      // 03d: ifeq 083
      // 040: goto 047
      // 043: invokestatic dge.b (Loov;)Loov;
      // 046: athrow
      // 047: ifle 05d
      // 04a: goto 051
      // 04d: invokestatic dge.b (Loov;)Loov;
      // 050: athrow
      // 051: aload 0
      // 052: bipush 1
      // 053: putfield dge.ma9 Z
      // 056: goto 05d
      // 059: invokestatic dge.b (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: dup
      // 05f: getfield dge.mhp F
      // 062: aload 0
      // 063: getfield dge.yzk F
      // 066: aload 0
      // 067: getfield dge.mhp F
      // 06a: fsub
      // 06b: ldc 0.5
      // 06d: nop
      // 06e: fmul
      // 06f: fadd
      // 070: putfield dge.mhp F
      // 073: aload 0
      // 074: aload 0
      // 075: getfield dge.mhp F
      // 078: putfield dge.un8 F
      // 07b: aload 0
      // 07c: invokespecial yqv.xx_ ()V
      // 07f: aload 0
      // 080: getfield dge.lfk Z
      // 083: iload 1
      // 084: ifeq 1a4
      // 087: ifeq 18e
      // 08a: goto 091
      // 08d: invokestatic dge.b (Loov;)Loov;
      // 090: athrow
      // 091: aload 0
      // 092: getfield dge.kz9 Z
      // 095: iload 1
      // 096: ifeq 1a4
      // 099: goto 0a0
      // 09c: invokestatic dge.b (Loov;)Loov;
      // 09f: athrow
      // 0a0: ifne 18e
      // 0a3: goto 0aa
      // 0a6: invokestatic dge.b (Loov;)Loov;
      // 0a9: athrow
      // 0aa: aload 0
      // 0ab: invokevirtual dge.qi8 ()I
      // 0ae: istore 2
      // 0af: bipush 0
      // 0b0: istore 3
      // 0b1: iload 3
      // 0b2: iload 2
      // 0b3: bipush 8
      // 0b5: imul
      // 0b6: if_icmpge 145
      // 0b9: aload 0
      // 0ba: getfield dge.z2d Ljava/util/Random;
      // 0bd: invokevirtual java/util/Random.nextFloat ()F
      // 0c0: ldc 3.1415927
      // 0c2: nop
      // 0c3: fmul
      // 0c4: fconst_2
      // 0c5: fmul
      // 0c6: fstore 4
      // 0c8: aload 0
      // 0c9: getfield dge.z2d Ljava/util/Random;
      // 0cc: invokevirtual java/util/Random.nextFloat ()F
      // 0cf: ldc 0.5
      // 0d1: nop
      // 0d2: fmul
      // 0d3: ldc 0.5
      // 0d5: nop
      // 0d6: fadd
      // 0d7: fstore 5
      // 0d9: fload 4
      // 0db: invokestatic fe6.rtn (F)F
      // 0de: iload 2
      // 0df: i2f
      // 0e0: fmul
      // 0e1: ldc 0.5
      // 0e3: nop
      // 0e4: fmul
      // 0e5: fload 5
      // 0e7: fmul
      // 0e8: fstore 6
      // 0ea: fload 4
      // 0ec: invokestatic fe6.ssk (F)F
      // 0ef: iload 2
      // 0f0: i2f
      // 0f1: fmul
      // 0f2: ldc 0.5
      // 0f4: nop
      // 0f5: fmul
      // 0f6: fload 5
      // 0f8: fmul
      // 0f9: fstore 7
      // 0fb: aload 0
      // 0fc: getfield dge.oay Lt9d;
      // 0ff: astore 8
      // 101: aload 0
      // 102: invokevirtual dge.mj4 ()Lw_0;
      // 105: astore 9
      // 107: aload 0
      // 108: getfield dge.o2v D
      // 10b: fload 6
      // 10d: f2d
      // 10e: dadd
      // 10f: dstore 10
      // 111: aload 0
      // 112: getfield dge.vbd D
      // 115: fload 7
      // 117: f2d
      // 118: dadd
      // 119: dstore 12
      // 11b: aload 8
      // 11d: aload 9
      // 11f: dload 10
      // 121: aload 0
      // 122: invokevirtual dge.aaw ()Lnh4;
      // 125: getfield nh4.bx_ D
      // 128: dload 12
      // 12a: dconst_0
      // 12b: dconst_0
      // 12c: dconst_0
      // 12d: bipush 0
      // 12e: newarray 10
      // 130: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 133: iinc 3 1
      // 136: iload 1
      // 137: ifeq 18a
      // 13a: iload 1
      // 13b: ifne 0b1
      // 13e: goto 145
      // 141: invokestatic dge.b (Loov;)Loov;
      // 144: athrow
      // 145: aload 0
      // 146: iload 1
      // 147: ifeq 184
      // 14a: invokevirtual dge.xak ()Z
      // 14d: ifeq 183
      // 150: goto 157
      // 153: invokestatic dge.b (Loov;)Loov;
      // 156: athrow
      // 157: aload 0
      // 158: aload 0
      // 159: invokevirtual dge.u5x ()Ljava/lang/String;
      // 15c: aload 0
      // 15d: invokevirtual dge.o23 ()F
      // 160: aload 0
      // 161: getfield dge.z2d Ljava/util/Random;
      // 164: invokevirtual java/util/Random.nextFloat ()F
      // 167: aload 0
      // 168: getfield dge.z2d Ljava/util/Random;
      // 16b: invokevirtual java/util/Random.nextFloat ()F
      // 16e: fsub
      // 16f: ldc 0.2
      // 171: nop
      // 172: fmul
      // 173: fconst_1
      // 174: fadd
      // 175: ldc 0.8
      // 177: nop
      // 178: fdiv
      // 179: invokevirtual dge.lhu (Ljava/lang/String;FF)V
      // 17c: goto 183
      // 17f: invokestatic dge.b (Loov;)Loov;
      // 182: athrow
      // 183: aload 0
      // 184: ldc -0.5
      // 186: nop
      // 187: putfield dge.yzk F
      // 18a: iload 1
      // 18b: ifne 1cc
      // 18e: aload 0
      // 18f: iload 1
      // 190: ifeq 1d5
      // 193: goto 19a
      // 196: invokestatic dge.b (Loov;)Loov;
      // 199: athrow
      // 19a: getfield dge.lfk Z
      // 19d: goto 1a4
      // 1a0: invokestatic dge.b (Loov;)Loov;
      // 1a3: athrow
      // 1a4: ifne 1cc
      // 1a7: aload 0
      // 1a8: iload 1
      // 1a9: ifeq 1d5
      // 1ac: goto 1b3
      // 1af: invokestatic dge.b (Loov;)Loov;
      // 1b2: athrow
      // 1b3: getfield dge.kz9 Z
      // 1b6: ifeq 1cc
      // 1b9: goto 1c0
      // 1bc: invokestatic dge.b (Loov;)Loov;
      // 1bf: athrow
      // 1c0: aload 0
      // 1c1: fconst_1
      // 1c2: putfield dge.yzk F
      // 1c5: goto 1cc
      // 1c8: invokestatic dge.b (Loov;)Loov;
      // 1cb: athrow
      // 1cc: aload 0
      // 1cd: aload 0
      // 1ce: getfield dge.lfk Z
      // 1d1: putfield dge.kz9 Z
      // 1d4: aload 0
      // 1d5: invokevirtual dge.mni ()V
      // 1d8: return
   }

   public void mni() {
      this.yzk *= 0.6F;
   }

   public int usz() {
      return this.z2d.nextInt(20) + 10;
   }

   public dge yx5() {
      return new dge(this.oay);
   }

   @Override
   public void jcg(int param1) {
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
      // 05: iload 2
      // 06: ifeq 20
      // 09: bipush 16
      // 0b: if_icmpne 7c
      // 0e: goto 15
      // 11: invokestatic dge.b (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual dge.qi8 ()I
      // 19: goto 20
      // 1c: invokestatic dge.b (Loov;)Loov;
      // 1f: athrow
      // 20: istore 3
      // 21: aload 0
      // 22: ldc 0.51000005
      // 24: nop
      // 25: iload 3
      // 26: i2f
      // 27: fmul
      // 28: ldc 0.51000005
      // 2a: nop
      // 2b: iload 3
      // 2c: i2f
      // 2d: fmul
      // 2e: invokevirtual dge.yxc (FF)V
      // 31: aload 0
      // 32: aload 0
      // 33: getfield dge.q6c F
      // 36: putfield dge.x5k F
      // 39: aload 0
      // 3a: aload 0
      // 3b: getfield dge.q6c F
      // 3e: putfield dge.ksw F
      // 41: aload 0
      // 42: iload 2
      // 43: ifeq 7d
      // 46: invokevirtual dge.mwv ()Z
      // 49: ifeq 7c
      // 4c: goto 53
      // 4f: invokestatic dge.b (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: iload 2
      // 55: ifeq 7d
      // 58: goto 5f
      // 5b: invokestatic dge.b (Loov;)Loov;
      // 5e: athrow
      // 5f: getfield dge.z2d Ljava/util/Random;
      // 62: bipush 20
      // 64: invokevirtual java/util/Random.nextInt (I)I
      // 67: ifne 7c
      // 6a: goto 71
      // 6d: invokestatic dge.b (Loov;)Loov;
      // 70: athrow
      // 71: aload 0
      // 72: invokevirtual dge.qw8 ()V
      // 75: goto 7c
      // 78: invokestatic dge.b (Loov;)Loov;
      // 7b: athrow
      // 7c: aload 0
      // 7d: iload 1
      // 7e: invokespecial yqv.jcg (I)V
      // 81: return
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokevirtual dge.qi8 ()I
      // 008: istore 2
      // 009: aload 0
      // 00a: iload 1
      // 00b: ifeq 11c
      // 00e: getfield dge.oay Lt9d;
      // 011: getfield t9d.v0f Z
      // 014: ifne 11b
      // 017: goto 01e
      // 01a: invokestatic dge.b (Loov;)Loov;
      // 01d: athrow
      // 01e: iload 2
      // 01f: iload 1
      // 020: ifeq 04d
      // 023: goto 02a
      // 026: invokestatic dge.b (Loov;)Loov;
      // 029: athrow
      // 02a: bipush 1
      // 02b: if_icmple 11b
      // 02e: goto 035
      // 031: invokestatic dge.b (Loov;)Loov;
      // 034: athrow
      // 035: aload 0
      // 036: iload 1
      // 037: ifeq 11c
      // 03a: goto 041
      // 03d: invokestatic dge.b (Loov;)Loov;
      // 040: athrow
      // 041: invokevirtual dge.i55 ()F
      // 044: fconst_0
      // 045: fcmpg
      // 046: goto 04d
      // 049: invokestatic dge.b (Loov;)Loov;
      // 04c: athrow
      // 04d: ifgt 11b
      // 050: bipush 2
      // 051: aload 0
      // 052: getfield dge.z2d Ljava/util/Random;
      // 055: bipush 3
      // 056: invokevirtual java/util/Random.nextInt (I)I
      // 059: iadd
      // 05a: istore 3
      // 05b: bipush 0
      // 05c: istore 4
      // 05e: iload 4
      // 060: iload 3
      // 061: if_icmpge 11b
      // 064: iload 4
      // 066: bipush 2
      // 067: irem
      // 068: i2f
      // 069: ldc 0.5
      // 06b: nop
      // 06c: fsub
      // 06d: iload 2
      // 06e: i2f
      // 06f: fmul
      // 070: ldc 4.0
      // 072: nop
      // 073: fdiv
      // 074: fstore 5
      // 076: iload 4
      // 078: bipush 2
      // 079: idiv
      // 07a: i2f
      // 07b: ldc 0.5
      // 07d: nop
      // 07e: fsub
      // 07f: iload 2
      // 080: i2f
      // 081: fmul
      // 082: ldc 4.0
      // 084: nop
      // 085: fdiv
      // 086: fstore 6
      // 088: aload 0
      // 089: invokevirtual dge.yx5 ()Ldge;
      // 08c: astore 7
      // 08e: aload 0
      // 08f: iload 1
      // 090: ifeq 11c
      // 093: invokevirtual dge.qrh ()Z
      // 096: iload 1
      // 097: ifeq 0bf
      // 09a: goto 0a1
      // 09d: invokestatic dge.b (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ifeq 0bb
      // 0a4: goto 0ab
      // 0a7: invokestatic dge.b (Loov;)Loov;
      // 0aa: athrow
      // 0ab: aload 7
      // 0ad: aload 0
      // 0ae: invokevirtual dge.hei ()Ljava/lang/String;
      // 0b1: invokevirtual dge.x84 (Ljava/lang/String;)V
      // 0b4: goto 0bb
      // 0b7: invokestatic dge.b (Loov;)Loov;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: invokevirtual dge.jx9 ()Z
      // 0bf: iload 1
      // 0c0: ifeq 113
      // 0c3: ifeq 0d9
      // 0c6: goto 0cd
      // 0c9: invokestatic dge.b (Loov;)Loov;
      // 0cc: athrow
      // 0cd: aload 7
      // 0cf: invokevirtual dge._92 ()V
      // 0d2: goto 0d9
      // 0d5: invokestatic dge.b (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 7
      // 0db: iload 2
      // 0dc: bipush 2
      // 0dd: idiv
      // 0de: invokevirtual dge.p1y (I)V
      // 0e1: aload 7
      // 0e3: aload 0
      // 0e4: getfield dge.o2v D
      // 0e7: fload 5
      // 0e9: f2d
      // 0ea: dadd
      // 0eb: aload 0
      // 0ec: getfield dge.kfp D
      // 0ef: ldc2_w 0.5
      // 0f2: dadd
      // 0f3: aload 0
      // 0f4: getfield dge.vbd D
      // 0f7: fload 6
      // 0f9: f2d
      // 0fa: dadd
      // 0fb: aload 0
      // 0fc: getfield dge.z2d Ljava/util/Random;
      // 0ff: invokevirtual java/util/Random.nextFloat ()F
      // 102: ldc 360.0
      // 104: nop
      // 105: fmul
      // 106: fconst_0
      // 107: invokevirtual dge.x24 (DDDFF)V
      // 10a: aload 0
      // 10b: getfield dge.oay Lt9d;
      // 10e: aload 7
      // 110: invokevirtual t9d.xzq (Li2h;)Z
      // 113: pop
      // 114: iinc 4 1
      // 117: iload 1
      // 118: ifne 05e
      // 11b: aload 0
      // 11c: invokespecial yqv._kl ()V
      // 11f: return
   }

   @Override
   public void u_w(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial yqv.u_w (Li2h;)V
      // 09: aload 1
      // 0a: instanceof osf
      // 0d: iload 2
      // 0e: ifeq 31
      // 11: ifeq 3c
      // 14: goto 1b
      // 17: invokestatic dge.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 2
      // 1d: ifeq 35
      // 20: goto 27
      // 23: invokestatic dge.b (Loov;)Loov;
      // 26: athrow
      // 27: invokevirtual dge.cry ()Z
      // 2a: goto 31
      // 2d: invokestatic dge.b (Loov;)Loov;
      // 30: athrow
      // 31: ifeq 3c
      // 34: aload 0
      // 35: aload 1
      // 36: checkcast g_3
      // 39: invokevirtual dge.w3f (Lg_3;)V
      // 3c: return
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 1e
      // 09: invokevirtual dge.cry ()Z
      // 0c: ifeq 22
      // 0f: goto 16
      // 12: invokestatic dge.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic dge.b (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: invokevirtual dge.w3f (Lg_3;)V
      // 22: return
   }

   public void w3f(g_3 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic dge.d J
      // 03: ldc2_w 134708146824787
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 0
      // 0e: invokevirtual dge.qi8 ()I
      // 11: istore 5
      // 13: aload 0
      // 14: aload 1
      // 15: invokevirtual dge.gq6 (Li2h;)Z
      // 18: iload 4
      // 1a: ifne 43
      // 1d: ifeq 9e
      // 20: goto 27
      // 23: invokestatic dge.b (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: invokevirtual dge.wxg (Li2h;)D
      // 2c: ldc2_w 0.6
      // 2f: iload 5
      // 31: i2d
      // 32: dmul
      // 33: ldc2_w 0.6
      // 36: dmul
      // 37: iload 5
      // 39: i2d
      // 3a: dmul
      // 3b: dcmpg
      // 3c: goto 43
      // 3f: invokestatic dge.b (Loov;)Loov;
      // 42: athrow
      // 43: iload 4
      // 45: ifne 66
      // 48: ifge 9e
      // 4b: goto 52
      // 4e: invokestatic dge.b (Loov;)Loov;
      // 51: athrow
      // 52: aload 1
      // 53: aload 0
      // 54: invokestatic ofh.kun (Lg_3;)Lofh;
      // 57: aload 0
      // 58: invokevirtual dge.t2j ()I
      // 5b: i2f
      // 5c: invokevirtual g_3.m1t (Lofh;F)Z
      // 5f: goto 66
      // 62: invokestatic dge.b (Loov;)Loov;
      // 65: athrow
      // 66: ifeq 9e
      // 69: aload 0
      // 6a: sipush 22284
      // 6d: ldc2_w 7131080194121128766
      // 70: lload 2
      // 71: lxor
      // 72: invokedynamic t (IJ)Ljava/lang/String; bsm=dge.d (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 77: nop
      // 78: fconst_1
      // 79: aload 0
      // 7a: getfield dge.z2d Ljava/util/Random;
      // 7d: invokevirtual java/util/Random.nextFloat ()F
      // 80: aload 0
      // 81: getfield dge.z2d Ljava/util/Random;
      // 84: invokevirtual java/util/Random.nextFloat ()F
      // 87: fsub
      // 88: ldc 0.2
      // 8a: nop
      // 8b: fmul
      // 8c: fconst_1
      // 8d: fadd
      // 8e: invokevirtual dge.lhu (Ljava/lang/String;FF)V
      // 91: aload 0
      // 92: aload 0
      // 93: aload 1
      // 94: invokevirtual dge.wm5 (Lg_3;Li2h;)V
      // 97: goto 9e
      // 9a: invokestatic dge.b (Loov;)Loov;
      // 9d: athrow
      // 9e: return
   }

   @Override
   public float c5y() {
      return 0.625F * this.ikl;
   }

   public boolean cry() {
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
      // 05: invokevirtual dge.qi8 ()I
      // 08: iload 1
      // 09: ifeq 1f
      // 0c: bipush 1
      // 0d: if_icmple 22
      // 10: goto 17
      // 13: invokestatic dge.b (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic dge.b (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   public int t2j() {
      return this.qi8();
   }

   @Override
   public String wcg() {
      long var1 = d ^ 14993416739669L;
      int var3 = t9d.b();
      StringBuilder var10000 = new StringBuilder();
      String var10001 = d<"t">(29402, 5261244133490312160L ^ var1);
      if (var3 != 0) {
         try {
            var10000 = var10000.append(var10001);
            if (this.qi8() > 1) {
               return var10000.append(d<"t">(29123, 6743672963962487024L ^ var1)).toString();
            }
         } catch (oov var4) {
            throw b(var4);
         }

         var10001 = d<"t">(31703, 3591936830670097121L ^ var1);
      }

      return var10000.append(var10001).toString();
   }

   @Override
   public String ix6() {
      long var1 = d ^ 55886822698267L;
      int var3 = t9d.b();
      StringBuilder var10000 = new StringBuilder();
      String var10001 = d<"t">(13998, 4525163088924488145L ^ var1);
      if (var3 != 0) {
         try {
            var10000 = var10000.append(var10001);
            if (this.qi8() > 1) {
               return var10000.append(d<"t">(31384, 1474593394560433638L ^ var1)).toString();
            }
         } catch (oov var4) {
            throw b(var4);
         }

         var10001 = d<"t">(25349, 7021177265595901040L ^ var1);
      }

      return var10000.append(var10001).toString();
   }

   @Override
   public u7m q4n() {
      try {
         if (this.qi8() == 1) {
            return xbr.g77;
         }
      } catch (oov var1) {
         throw b(var1);
      }

      return null;
   }

   @Override
   public boolean iaw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new mew
      // 003: dup
      // 004: aload 0
      // 005: getfield dge.o2v D
      // 008: invokestatic fe6.jqf (D)I
      // 00b: bipush 0
      // 00c: aload 0
      // 00d: getfield dge.vbd D
      // 010: invokestatic fe6.jqf (D)I
      // 013: invokespecial mew.<init> (III)V
      // 016: astore 2
      // 017: invokestatic t9d.b ()I
      // 01a: aload 0
      // 01b: getfield dge.oay Lt9d;
      // 01e: aload 2
      // 01f: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 022: astore 3
      // 023: istore 1
      // 024: aload 0
      // 025: getfield dge.oay Lt9d;
      // 028: iload 1
      // 029: ifeq 067
      // 02c: invokevirtual t9d.r7d ()Lcog;
      // 02f: invokevirtual cog.z28 ()Lgxq;
      // 032: getstatic gxq.itf Lgxq;
      // 035: if_acmpne 063
      // 038: goto 03f
      // 03b: invokestatic dge.b (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 0
      // 040: iload 1
      // 041: ifeq 064
      // 044: goto 04b
      // 047: invokestatic dge.b (Loov;)Loov;
      // 04a: athrow
      // 04b: getfield dge.z2d Ljava/util/Random;
      // 04e: bipush 4
      // 04f: invokevirtual java/util/Random.nextInt (I)I
      // 052: bipush 1
      // 053: if_icmpeq 063
      // 056: goto 05d
      // 059: invokestatic dge.b (Loov;)Loov;
      // 05c: athrow
      // 05d: bipush 0
      // 05e: ireturn
      // 05f: invokestatic dge.b (Loov;)Loov;
      // 062: athrow
      // 063: aload 0
      // 064: getfield dge.oay Lt9d;
      // 067: iload 1
      // 068: ifeq 086
      // 06b: invokevirtual t9d.rbk ()Lv66;
      // 06e: getstatic v66.na2 Lv66;
      // 071: if_acmpeq 1a6
      // 074: goto 07b
      // 077: invokestatic dge.b (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 0
      // 07c: getfield dge.oay Lt9d;
      // 07f: goto 086
      // 082: invokestatic dge.b (Loov;)Loov;
      // 085: athrow
      // 086: aload 2
      // 087: invokevirtual t9d.getBiomeGenForCoords (Lmew;)Lgyu;
      // 08a: astore 4
      // 08c: aload 4
      // 08e: getstatic gyu.bpg Lgyu;
      // 091: if_acmpne 148
      // 094: aload 0
      // 095: getfield dge.kfp D
      // 098: ldc2_w 50.0
      // 09b: dcmpl
      // 09c: iload 1
      // 09d: ifeq 151
      // 0a0: goto 0a7
      // 0a3: invokestatic dge.b (Loov;)Loov;
      // 0a6: athrow
      // 0a7: ifle 148
      // 0aa: goto 0b1
      // 0ad: invokestatic dge.b (Loov;)Loov;
      // 0b0: athrow
      // 0b1: aload 0
      // 0b2: getfield dge.kfp D
      // 0b5: ldc2_w 70.0
      // 0b8: dcmpg
      // 0b9: iload 1
      // 0ba: ifeq 151
      // 0bd: goto 0c4
      // 0c0: invokestatic dge.b (Loov;)Loov;
      // 0c3: athrow
      // 0c4: ifge 148
      // 0c7: goto 0ce
      // 0ca: invokestatic dge.b (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: getfield dge.z2d Ljava/util/Random;
      // 0d2: invokevirtual java/util/Random.nextFloat ()F
      // 0d5: ldc 0.5
      // 0d7: nop
      // 0d8: fcmpg
      // 0d9: iload 1
      // 0da: ifeq 151
      // 0dd: goto 0e4
      // 0e0: invokestatic dge.b (Loov;)Loov;
      // 0e3: athrow
      // 0e4: ifge 148
      // 0e7: goto 0ee
      // 0ea: invokestatic dge.b (Loov;)Loov;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: getfield dge.z2d Ljava/util/Random;
      // 0f2: invokevirtual java/util/Random.nextFloat ()F
      // 0f5: aload 0
      // 0f6: getfield dge.oay Lt9d;
      // 0f9: invokevirtual t9d.w27 ()F
      // 0fc: fcmpg
      // 0fd: iload 1
      // 0fe: ifeq 151
      // 101: goto 108
      // 104: invokestatic dge.b (Loov;)Loov;
      // 107: athrow
      // 108: ifge 148
      // 10b: goto 112
      // 10e: invokestatic dge.b (Loov;)Loov;
      // 111: athrow
      // 112: aload 0
      // 113: getfield dge.oay Lt9d;
      // 116: new mew
      // 119: dup
      // 11a: aload 0
      // 11b: invokespecial mew.<init> (Li2h;)V
      // 11e: invokevirtual t9d.rts (Lmew;)I
      // 121: iload 1
      // 122: ifeq 151
      // 125: goto 12c
      // 128: invokestatic dge.b (Loov;)Loov;
      // 12b: athrow
      // 12c: aload 0
      // 12d: getfield dge.z2d Ljava/util/Random;
      // 130: bipush 8
      // 132: invokevirtual java/util/Random.nextInt (I)I
      // 135: if_icmpgt 148
      // 138: goto 13f
      // 13b: invokestatic dge.b (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 0
      // 140: invokespecial yqv.iaw ()Z
      // 143: ireturn
      // 144: invokestatic dge.b (Loov;)Loov;
      // 147: athrow
      // 148: aload 0
      // 149: getfield dge.z2d Ljava/util/Random;
      // 14c: bipush 10
      // 14e: invokevirtual java/util/Random.nextInt (I)I
      // 151: iload 1
      // 152: ifeq 1a7
      // 155: ifne 1a6
      // 158: goto 15f
      // 15b: invokestatic dge.b (Loov;)Loov;
      // 15e: athrow
      // 15f: aload 3
      // 160: ldc2_w 987234911
      // 163: invokevirtual tts.r3x (J)Ljava/util/Random;
      // 166: bipush 10
      // 168: invokevirtual java/util/Random.nextInt (I)I
      // 16b: iload 1
      // 16c: ifeq 1a7
      // 16f: goto 176
      // 172: invokestatic dge.b (Loov;)Loov;
      // 175: athrow
      // 176: ifne 1a6
      // 179: goto 180
      // 17c: invokestatic dge.b (Loov;)Loov;
      // 17f: athrow
      // 180: aload 0
      // 181: getfield dge.kfp D
      // 184: ldc2_w 40.0
      // 187: dcmpg
      // 188: iload 1
      // 189: ifeq 1a7
      // 18c: goto 193
      // 18f: invokestatic dge.b (Loov;)Loov;
      // 192: athrow
      // 193: ifge 1a6
      // 196: goto 19d
      // 199: invokestatic dge.b (Loov;)Loov;
      // 19c: athrow
      // 19d: aload 0
      // 19e: invokespecial yqv.iaw ()Z
      // 1a1: ireturn
      // 1a2: invokestatic dge.b (Loov;)Loov;
      // 1a5: athrow
      // 1a6: bipush 0
      // 1a7: ireturn
   }

   @Override
   public float o23() {
      return 0.4F * (float)this.qi8();
   }

   @Override
   public int d1r() {
      return 0;
   }

   public boolean nfr() {
      int var1 = t9d.c();

      try {
         int var10000 = this.qi8();
         if (var1 != 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return (boolean)0;
   }

   public boolean xak() {
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
      // 05: invokevirtual dge.qi8 ()I
      // 08: iload 1
      // 09: ifeq 1f
      // 0c: bipush 2
      // 0d: if_icmple 22
      // 10: goto 17
      // 13: invokestatic dge.b (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic dge.b (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   @Override
   public void xv1() {
      this.mop = 0.42F;
      this.u19 = true;
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield dge.z2d Ljava/util/Random;
      // 08: bipush 3
      // 09: invokevirtual java/util/Random.nextInt (I)I
      // 0c: istore 4
      // 0e: iload 4
      // 10: bipush 2
      // 11: iload 3
      // 12: ifne 4a
      // 15: if_icmpge 47
      // 18: goto 1f
      // 1b: invokestatic dge.b (Loov;)Loov;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield dge.z2d Ljava/util/Random;
      // 23: invokevirtual java/util/Random.nextFloat ()F
      // 26: ldc 0.5
      // 28: nop
      // 29: aload 1
      // 2a: invokevirtual css.os2 ()F
      // 2d: fmul
      // 2e: fcmpg
      // 2f: iload 3
      // 30: ifne 4b
      // 33: goto 3a
      // 36: invokestatic dge.b (Loov;)Loov;
      // 39: athrow
      // 3a: ifge 47
      // 3d: goto 44
      // 40: invokestatic dge.b (Loov;)Loov;
      // 43: athrow
      // 44: iinc 4 1
      // 47: bipush 1
      // 48: iload 4
      // 4a: ishl
      // 4b: istore 5
      // 4d: aload 0
      // 4e: iload 5
      // 50: invokevirtual dge.p1y (I)V
      // 53: aload 0
      // 54: aload 1
      // 55: aload 2
      // 56: invokespecial yqv.hx8 (Lcss;Lps6;)Lps6;
      // 59: areturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3708400124376778097L, 8182229620680525914L, MethodHandles.lookup().lookupClass()).a(71078516092312L);
      // $VF: monitorexit
      d = var10000;
      long var0 = d ^ 93295430580889L;
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
      String var6 = "Gµê¿¤w\u0093\u0091Âßåð?\u0090F¤ `:Jd\u001a)¡hÞã÷1wÀm[\"\u00adÂ¯ÅÃæ\u0086\u0013\u008e\r,!C\u0010· \u008eÒ±ò\u008eKò\u00048\u0007'µù<\u0080\u0083\u0005³×õ.±ÈGÒ+ö<*3Wo\u0010÷Ä\u0005Ù\u0005\bCNÖ.\tDÄPÏ? «NË\u009f}ò\u0018ÂµNv°ð«/wµí\u0088\u0091Vµ%ü\u00814·\u0093\n¦åÅ\u0010É\u008eºò\u009b³\u001c<P&Ë÷\"\u0088\u001eq\u0010\u0016\u008f'@ú5AÇ\u0083\t\\\u0091Ð0¨m t\u0010ÀÏY\u001bÕ\u009a\"Öêpsé\u0081\u0083\u00adÝÔBÏ®#/?~\u0003éo\u0093^ú\u0010¹y~½&\bMµ\u000eî\u0085J^\u0081«S";
      int var8 = "Gµê¿¤w\u0093\u0091Âßåð?\u0090F¤ `:Jd\u001a)¡hÞã÷1wÀm[\"\u00adÂ¯ÅÃæ\u0086\u0013\u008e\r,!C\u0010· \u008eÒ±ò\u008eKò\u00048\u0007'µù<\u0080\u0083\u0005³×õ.±ÈGÒ+ö<*3Wo\u0010÷Ä\u0005Ù\u0005\bCNÖ.\tDÄPÏ? «NË\u009f}ò\u0018ÂµNv°ð«/wµí\u0088\u0091Vµ%ü\u00814·\u0093\n¦åÅ\u0010É\u008eºò\u009b³\u001c<P&Ë÷\"\u0088\u001eq\u0010\u0016\u008f'@ú5AÇ\u0083\t\\\u0091Ð0¨m t\u0010ÀÏY\u001bÕ\u009a\"Öêpsé\u0081\u0083\u00adÝÔBÏ®#/?~\u0003éo\u0093^ú\u0010¹y~½&\bMµ\u000eî\u0085J^\u0081«S"
         .length();
      char var5 = 16;
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
                     g = var9;
                     h = new String[11];
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

                  var6 = "\u001cí¿\u0087{cà0?leñ'c\u0090\u0000\u0004@\u0017\u0014à-\u001e(\u0010\u0016n\u0094\u0083\u0001¨ÜÕÙ\u008bz7ÞÅdË";
                  var8 = "\u001cí¿\u0087{cà0?leñ'c\u0090\u0000\u0004@\u0017\u0014à-\u001e(\u0010\u0016n\u0094\u0083\u0001¨ÜÕÙ\u008bz7ÞÅdË".length();
                  var5 = 24;
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static oov b(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14417;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])s.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("dge", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = d(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("dge" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
