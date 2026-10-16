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
import org.apache.commons.lang3.Validate;

public abstract class rdv extends i2h {
   private int jhx;
   public mew aie;
   public vt2 vv_;
   private static final long c;
   private static final String[] d;
   private static final String[] e;
   private static final Map g = new HashMap(13);

   public rdv(t9d var1) {
      super(var1);
      this.yxc(0.5F, 0.5F);
   }

   public rdv(t9d var1, mew var2) {
      this(var1);
      this.aie = var2;
   }

   @Override
   public void tbj() {
   }

   public void qht(vt2 var1) {
      Validate.notNull(var1);
      Validate.isTrue(var1.e30().pyt());
      this.vv_ = var1;
      this.p3h = this.x5k = (float)(this.vv_.tmy() * 90);
      this.v_s();
   }

   private void v_s() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: iload 1
      // 006: ifne 01e
      // 009: getfield rdv.vv_ Lvt2;
      // 00c: ifnull 130
      // 00f: goto 016
      // 012: invokestatic rdv.b (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: goto 01e
      // 01a: invokestatic rdv.b (Loov;)Loov;
      // 01d: athrow
      // 01e: getfield rdv.aie Lmew;
      // 021: invokevirtual mew.getX ()I
      // 024: i2d
      // 025: ldc2_w 0.5
      // 028: dadd
      // 029: dstore 2
      // 02a: aload 0
      // 02b: getfield rdv.aie Lmew;
      // 02e: invokevirtual mew.getY ()I
      // 031: i2d
      // 032: ldc2_w 0.5
      // 035: dadd
      // 036: dstore 4
      // 038: aload 0
      // 039: getfield rdv.aie Lmew;
      // 03c: invokevirtual mew.getZ ()I
      // 03f: i2d
      // 040: ldc2_w 0.5
      // 043: dadd
      // 044: dstore 6
      // 046: ldc2_w 0.46875
      // 049: dstore 8
      // 04b: aload 0
      // 04c: aload 0
      // 04d: invokevirtual rdv.bli ()I
      // 050: invokespecial rdv.ibk (I)D
      // 053: dstore 10
      // 055: aload 0
      // 056: aload 0
      // 057: invokevirtual rdv.cgb ()I
      // 05a: invokespecial rdv.ibk (I)D
      // 05d: dstore 12
      // 05f: dload 2
      // 060: aload 0
      // 061: getfield rdv.vv_ Lvt2;
      // 064: invokevirtual vt2.n67 ()I
      // 067: i2d
      // 068: ldc2_w 0.46875
      // 06b: dmul
      // 06c: dsub
      // 06d: dstore 2
      // 06e: dload 6
      // 070: aload 0
      // 071: getfield rdv.vv_ Lvt2;
      // 074: invokevirtual vt2.ozy ()I
      // 077: i2d
      // 078: ldc2_w 0.46875
      // 07b: dmul
      // 07c: dsub
      // 07d: dstore 6
      // 07f: dload 4
      // 081: dload 12
      // 083: dadd
      // 084: dstore 4
      // 086: aload 0
      // 087: getfield rdv.vv_ Lvt2;
      // 08a: invokevirtual vt2.tgw ()Lvt2;
      // 08d: astore 14
      // 08f: dload 2
      // 090: dload 10
      // 092: aload 14
      // 094: invokevirtual vt2.n67 ()I
      // 097: i2d
      // 098: dmul
      // 099: dadd
      // 09a: dstore 2
      // 09b: dload 6
      // 09d: dload 10
      // 09f: aload 14
      // 0a1: invokevirtual vt2.ozy ()I
      // 0a4: i2d
      // 0a5: dmul
      // 0a6: dadd
      // 0a7: dstore 6
      // 0a9: aload 0
      // 0aa: dload 2
      // 0ab: putfield rdv.o2v D
      // 0ae: aload 0
      // 0af: dload 4
      // 0b1: putfield rdv.kfp D
      // 0b4: aload 0
      // 0b5: dload 6
      // 0b7: putfield rdv.vbd D
      // 0ba: aload 0
      // 0bb: invokevirtual rdv.bli ()I
      // 0be: i2d
      // 0bf: dstore 15
      // 0c1: aload 0
      // 0c2: invokevirtual rdv.cgb ()I
      // 0c5: i2d
      // 0c6: dstore 17
      // 0c8: aload 0
      // 0c9: invokevirtual rdv.bli ()I
      // 0cc: i2d
      // 0cd: dstore 19
      // 0cf: iload 1
      // 0d0: ifne 0ea
      // 0d3: aload 0
      // 0d4: getfield rdv.vv_ Lvt2;
      // 0d7: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 0da: getstatic vt2$y0s.zty Lvt2$y0s;
      // 0dd: if_acmpne 0ee
      // 0e0: goto 0e7
      // 0e3: invokestatic rdv.b (Loov;)Loov;
      // 0e6: athrow
      // 0e7: dconst_1
      // 0e8: dstore 19
      // 0ea: iload 1
      // 0eb: ifeq 0f1
      // 0ee: dconst_1
      // 0ef: dstore 15
      // 0f1: dload 15
      // 0f3: ldc2_w 32.0
      // 0f6: ddiv
      // 0f7: dstore 15
      // 0f9: dload 17
      // 0fb: ldc2_w 32.0
      // 0fe: ddiv
      // 0ff: dstore 17
      // 101: dload 19
      // 103: ldc2_w 32.0
      // 106: ddiv
      // 107: dstore 19
      // 109: aload 0
      // 10a: new nh4
      // 10d: dup
      // 10e: dload 2
      // 10f: dload 15
      // 111: dsub
      // 112: dload 4
      // 114: dload 17
      // 116: dsub
      // 117: dload 6
      // 119: dload 19
      // 11b: dsub
      // 11c: dload 2
      // 11d: dload 15
      // 11f: dadd
      // 120: dload 4
      // 122: dload 17
      // 124: dadd
      // 125: dload 6
      // 127: dload 19
      // 129: dadd
      // 12a: invokespecial nh4.<init> (DDDDDD)V
      // 12d: invokevirtual rdv.qq7 (Lnh4;)V
      // 130: return
   }

   private double ibk(int var1) {
      try {
         if (var1 % 32 == 0) {
            return 0.5;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return 0.0;
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
      // 00: aload 0
      // 01: aload 0
      // 02: getfield rdv.o2v D
      // 05: putfield rdv.bc1 D
      // 08: invokestatic t9d.b ()I
      // 0b: aload 0
      // 0c: aload 0
      // 0d: getfield rdv.kfp D
      // 10: putfield rdv.o_z D
      // 13: istore 1
      // 14: aload 0
      // 15: aload 0
      // 16: getfield rdv.vbd D
      // 19: putfield rdv.a4d D
      // 1c: aload 0
      // 1d: dup
      // 1e: getfield rdv.jhx I
      // 21: dup_x1
      // 22: bipush 1
      // 23: iadd
      // 24: putfield rdv.jhx I
      // 27: iload 1
      // 28: ifeq 45
      // 2b: bipush 100
      // 2d: if_icmpne 9d
      // 30: goto 37
      // 33: invokestatic rdv.b (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: getfield rdv.oay Lt9d;
      // 3b: getfield t9d.v0f Z
      // 3e: goto 45
      // 41: invokestatic rdv.b (Loov;)Loov;
      // 44: athrow
      // 45: iload 1
      // 46: ifeq 63
      // 49: ifne 9d
      // 4c: goto 53
      // 4f: invokestatic rdv.b (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: bipush 0
      // 55: putfield rdv.jhx I
      // 58: aload 0
      // 59: getfield rdv.ma9 Z
      // 5c: goto 63
      // 5f: invokestatic rdv.b (Loov;)Loov;
      // 62: athrow
      // 63: iload 1
      // 64: ifeq 87
      // 67: ifne 9d
      // 6a: goto 71
      // 6d: invokestatic rdv.b (Loov;)Loov;
      // 70: athrow
      // 71: aload 0
      // 72: iload 1
      // 73: ifeq 96
      // 76: goto 7d
      // 79: invokestatic rdv.b (Loov;)Loov;
      // 7c: athrow
      // 7d: invokevirtual rdv.lgc ()Z
      // 80: goto 87
      // 83: invokestatic rdv.b (Loov;)Loov;
      // 86: athrow
      // 87: ifne 9d
      // 8a: aload 0
      // 8b: invokevirtual rdv._kl ()V
      // 8e: aload 0
      // 8f: goto 96
      // 92: invokestatic rdv.b (Loov;)Loov;
      // 95: athrow
      // 96: aconst_null
      // 97: checkcast i2h
      // 9a: invokevirtual rdv.r4_ (Li2h;)V
      // 9d: return
   }

   public boolean lgc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield rdv.oay Lt9d;
      // 008: aload 0
      // 009: aload 0
      // 00a: invokevirtual rdv.aaw ()Lnh4;
      // 00d: invokevirtual t9d.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 010: invokeinterface java/util/List.isEmpty ()Z 1
      // 015: iload 1
      // 016: ifne 034
      // 019: ifne 029
      // 01c: goto 023
      // 01f: invokestatic rdv.b (Loov;)Loov;
      // 022: athrow
      // 023: bipush 0
      // 024: ireturn
      // 025: invokestatic rdv.b (Loov;)Loov;
      // 028: athrow
      // 029: bipush 1
      // 02a: aload 0
      // 02b: invokevirtual rdv.bli ()I
      // 02e: bipush 16
      // 030: idiv
      // 031: invokestatic java/lang/Math.max (II)I
      // 034: istore 2
      // 035: bipush 1
      // 036: aload 0
      // 037: invokevirtual rdv.cgb ()I
      // 03a: bipush 16
      // 03c: idiv
      // 03d: invokestatic java/lang/Math.max (II)I
      // 040: istore 3
      // 041: aload 0
      // 042: getfield rdv.aie Lmew;
      // 045: aload 0
      // 046: getfield rdv.vv_ Lvt2;
      // 049: invokevirtual vt2.b4b ()Lvt2;
      // 04c: invokevirtual mew.offset (Lvt2;)Lmew;
      // 04f: astore 4
      // 051: aload 0
      // 052: getfield rdv.vv_ Lvt2;
      // 055: invokevirtual vt2.tgw ()Lvt2;
      // 058: astore 5
      // 05a: bipush 0
      // 05b: istore 6
      // 05d: iload 6
      // 05f: iload 2
      // 060: if_icmpge 0d0
      // 063: bipush 0
      // 064: istore 7
      // 066: iload 7
      // 068: iload 3
      // 069: if_icmpge 0c9
      // 06c: aload 4
      // 06e: aload 5
      // 070: iload 6
      // 072: invokevirtual mew.offset (Lvt2;I)Lmew;
      // 075: iload 7
      // 077: invokevirtual mew.z89 (I)Lmew;
      // 07a: astore 8
      // 07c: aload 0
      // 07d: getfield rdv.oay Lt9d;
      // 080: aload 8
      // 082: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 085: invokeinterface zfz.r_y ()Le0x; 1
      // 08a: astore 9
      // 08c: iload 1
      // 08d: ifne 0c5
      // 090: aload 9
      // 092: invokevirtual e0x.p1r ()Lp3y;
      // 095: invokevirtual p3y.gk6 ()Z
      // 098: iload 1
      // 099: ifne 05f
      // 09c: goto 0a3
      // 09f: invokestatic rdv.b (Loov;)Loov;
      // 0a2: athrow
      // 0a3: ifne 0c2
      // 0a6: aload 9
      // 0a8: invokestatic f8k.r25 (Le0x;)Z
      // 0ab: iload 1
      // 0ac: ifne 0c1
      // 0af: goto 0b6
      // 0b2: invokestatic rdv.b (Loov;)Loov;
      // 0b5: athrow
      // 0b6: ifne 0c2
      // 0b9: goto 0c0
      // 0bc: invokestatic rdv.b (Loov;)Loov;
      // 0bf: athrow
      // 0c0: bipush 0
      // 0c1: ireturn
      // 0c2: iinc 7 1
      // 0c5: iload 1
      // 0c6: ifeq 066
      // 0c9: iinc 6 1
      // 0cc: iload 1
      // 0cd: ifeq 05d
      // 0d0: aload 0
      // 0d1: getfield rdv.oay Lt9d;
      // 0d4: aload 0
      // 0d5: aload 0
      // 0d6: invokevirtual rdv.aaw ()Lnh4;
      // 0d9: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 0dc: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e1: astore 6
      // 0e3: aload 6
      // 0e5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 0ea: ifeq 11d
      // 0ed: aload 6
      // 0ef: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 0f4: checkcast i2h
      // 0f7: astore 7
      // 0f9: aload 7
      // 0fb: instanceof rdv
      // 0fe: iload 1
      // 0ff: ifne 11e
      // 102: iload 1
      // 103: ifne 118
      // 106: goto 10d
      // 109: invokestatic rdv.b (Loov;)Loov;
      // 10c: athrow
      // 10d: ifeq 119
      // 110: goto 117
      // 113: invokestatic rdv.b (Loov;)Loov;
      // 116: athrow
      // 117: bipush 0
      // 118: ireturn
      // 119: iload 1
      // 11a: ifeq 0e3
      // 11d: bipush 1
      // 11e: ireturn
   }

   @Override
   public boolean mzu() {
      return true;
   }

   @Override
   public boolean s_r(i2h param1) {
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
      // 05: instanceof ha9
      // 08: iload 2
      // 09: ifne 29
      // 0c: ifeq 2c
      // 0f: goto 16
      // 12: invokestatic rdv.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: checkcast ha9
      // 1b: invokestatic ofh.c_k (Lha9;)Lofh;
      // 1e: fconst_0
      // 1f: invokevirtual rdv.m1t (Lofh;F)Z
      // 22: goto 29
      // 25: invokestatic rdv.b (Loov;)Loov;
      // 28: athrow
      // 29: goto 2d
      // 2c: bipush 0
      // 2d: ireturn
   }

   @Override
   public vt2 u0f() {
      return this.vv_;
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
      // 05: aload 1
      // 06: invokevirtual rdv.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifne 21
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic rdv.b (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic rdv.b (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield rdv.ma9 Z
      // 21: iload 3
      // 22: ifne 63
      // 25: ifne 62
      // 28: goto 2f
      // 2b: invokestatic rdv.b (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield rdv.oay Lt9d;
      // 33: getfield t9d.v0f Z
      // 36: iload 3
      // 37: ifne 63
      // 3a: goto 41
      // 3d: invokestatic rdv.b (Loov;)Loov;
      // 40: athrow
      // 41: ifne 62
      // 44: goto 4b
      // 47: invokestatic rdv.b (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: invokevirtual rdv._kl ()V
      // 4f: aload 0
      // 50: invokevirtual rdv.dxm ()V
      // 53: aload 0
      // 54: aload 1
      // 55: invokevirtual ofh.nra ()Li2h;
      // 58: invokevirtual rdv.r4_ (Li2h;)V
      // 5b: goto 62
      // 5e: invokestatic rdv.b (Loov;)Loov;
      // 61: athrow
      // 62: bipush 1
      // 63: ireturn
   }

   @Override
   public void vjj(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 7
      // 05: aload 0
      // 06: getfield rdv.oay Lt9d;
      // 09: getfield t9d.v0f Z
      // 0c: iload 7
      // 0e: ifne 26
      // 11: ifne 61
      // 14: goto 1b
      // 17: invokestatic rdv.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield rdv.ma9 Z
      // 1f: goto 26
      // 22: invokestatic rdv.b (Loov;)Loov;
      // 25: athrow
      // 26: iload 7
      // 28: ifne 4b
      // 2b: ifne 61
      // 2e: goto 35
      // 31: invokestatic rdv.b (Loov;)Loov;
      // 34: athrow
      // 35: dload 1
      // 36: dload 1
      // 37: dmul
      // 38: dload 3
      // 39: dload 3
      // 3a: dmul
      // 3b: dadd
      // 3c: dload 5
      // 3e: dload 5
      // 40: dmul
      // 41: dadd
      // 42: dconst_0
      // 43: dcmpl
      // 44: goto 4b
      // 47: invokestatic rdv.b (Loov;)Loov;
      // 4a: athrow
      // 4b: ifle 61
      // 4e: aload 0
      // 4f: invokevirtual rdv._kl ()V
      // 52: aload 0
      // 53: aconst_null
      // 54: checkcast i2h
      // 57: invokevirtual rdv.r4_ (Li2h;)V
      // 5a: goto 61
      // 5d: invokestatic rdv.b (Loov;)Loov;
      // 60: athrow
      // 61: return
   }

   @Override
   public void w7w(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 7
      // 05: aload 0
      // 06: getfield rdv.oay Lt9d;
      // 09: getfield t9d.v0f Z
      // 0c: iload 7
      // 0e: ifeq 26
      // 11: ifne 61
      // 14: goto 1b
      // 17: invokestatic rdv.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield rdv.ma9 Z
      // 1f: goto 26
      // 22: invokestatic rdv.b (Loov;)Loov;
      // 25: athrow
      // 26: iload 7
      // 28: ifeq 4b
      // 2b: ifne 61
      // 2e: goto 35
      // 31: invokestatic rdv.b (Loov;)Loov;
      // 34: athrow
      // 35: dload 1
      // 36: dload 1
      // 37: dmul
      // 38: dload 3
      // 39: dload 3
      // 3a: dmul
      // 3b: dadd
      // 3c: dload 5
      // 3e: dload 5
      // 40: dmul
      // 41: dadd
      // 42: dconst_0
      // 43: dcmpl
      // 44: goto 4b
      // 47: invokestatic rdv.b (Loov;)Loov;
      // 4a: athrow
      // 4b: ifle 61
      // 4e: aload 0
      // 4f: invokevirtual rdv._kl ()V
      // 52: aload 0
      // 53: aconst_null
      // 54: checkcast i2h
      // 57: invokevirtual rdv.r4_ (Li2h;)V
      // 5a: goto 61
      // 5d: invokestatic rdv.b (Loov;)Loov;
      // 60: athrow
      // 61: return
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 107809073039053L;
      var1.atr(b<"g">(16703, 1538949358243401459L ^ var2), (byte)this.vv_.tmy());
      var1.iin(b<"g">(4957, 3550609002045119632L ^ var2), this.liv().getX());
      var1.iin(b<"g">(3111, 4102758908748530660L ^ var2), this.liv().getY());
      var1.iin(b<"g">(7813, 694997817103126859L ^ var2), this.liv().getZ());
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 22690394008166L;
      int var4 = t9d.b();

      vt2 var5;
      label70: {
         byte var10000;
         label77: {
            label71: {
               try {
                  this.aie = new mew(
                     var1.uz7(b<"g">(26519, 4663892131609543926L ^ var2)),
                     var1.uz7(b<"g">(29611, 2238387938342605007L ^ var2)),
                     var1.uz7(b<"g">(17780, 3689145901990815255L ^ var2))
                  );
                  var10000 = var1.inh(b<"g">(8430, 5403966510180615052L ^ var2), 99);
                  if (var4 == 0) {
                     break label77;
                  }

                  if (var10000 == 0) {
                     break label71;
                  }
               } catch (oov var11) {
                  throw b(var11);
               }

               var5 = vt2.bm6(var1.r_t(b<"g">(9830, 550970457286526223L ^ var2)));

               try {
                  this.aie = this.aie.offset(var5);
                  if (var4 != 0) {
                     break label70;
                  }
               } catch (oov var10) {
                  boolean var10001 = false;
                  throw b(var10);
               }
            }

            try {
               var10000 = var1.inh(b<"g">(2607, 4508345480385980741L ^ var2), 99);
            } catch (oov var9) {
               boolean var14 = false;
               throw b(var9);
            }
         }

         label78: {
            label72: {
               try {
                  if (var4 == 0) {
                     break label78;
                  }

                  if (var10000 == 0) {
                     break label72;
                  }
               } catch (oov var8) {
                  throw b(var8);
               }

               var5 = vt2.bm6(var1.r_t(b<"g">(16703, 1538829091689898584L ^ var2)));

               try {
                  if (var4 != 0) {
                     break label70;
                  }
               } catch (oov var7) {
                  boolean var15 = false;
                  throw b(var7);
               }
            }

            try {
               var10000 = var1.r_t(b<"g">(5043, 479291154120929491L ^ var2));
            } catch (oov var6) {
               boolean var16 = false;
               throw b(var6);
            }
         }

         var5 = vt2.bm6(var10000);
      }

      this.qht(var5);
   }

   public abstract int bli();

   public abstract int cgb();

   public abstract void r4_(i2h var1);

   @Override
   public boolean h6z() {
      return false;
   }

   @Override
   public void m6_(double param1, double param3, double param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dload 1
      // 02: putfield rdv.o2v D
      // 05: invokestatic t9d.c ()I
      // 08: aload 0
      // 09: dload 3
      // 0a: putfield rdv.kfp D
      // 0d: istore 7
      // 0f: aload 0
      // 10: dload 5
      // 12: putfield rdv.vbd D
      // 15: aload 0
      // 16: getfield rdv.aie Lmew;
      // 19: astore 8
      // 1b: aload 0
      // 1c: new mew
      // 1f: dup
      // 20: dload 1
      // 21: dload 3
      // 22: dload 5
      // 24: invokespecial mew.<init> (DDD)V
      // 27: putfield rdv.aie Lmew;
      // 2a: aload 0
      // 2b: iload 7
      // 2d: ifne 4e
      // 30: getfield rdv.aie Lmew;
      // 33: aload 8
      // 35: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 38: ifne 52
      // 3b: goto 42
      // 3e: invokestatic rdv.b (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: invokespecial rdv.v_s ()V
      // 46: aload 0
      // 47: goto 4e
      // 4a: invokestatic rdv.b (Loov;)Loov;
      // 4d: athrow
      // 4e: bipush 1
      // 4f: putfield rdv.u19 Z
      // 52: return
   }

   public mew liv() {
      return this.aie;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1481885495914879342L, -5041318679235797044L, MethodHandles.lookup().lookupClass()).a(164318445554293L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 40035528572694L;
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
      String var6 = "1ì\u0098ÈVû©s\u0084«^é\u00192\u0099L\u0010V¸aÕÍ·®síoíc\u0098^÷\u009d\u0018§>\u0000\u0098Äf\u009eË)\t\u0000\u009cc´\u0007\u0085°ÊcxhM¼\u0098\u0010d\u008b\u0012( ýà¥\u0098\u0081\u008dÓS\u000eyk\u0010\n[Ð\u0010wïà¨m\\$\u0001\u008bëÞ»\u0010\u0016\u008c£_\u001ccx®\u0091²\u00933=MÔ\u0013\u0010MÐÆ&b¦\u0098ôB:¹á\bF¶\u0083\u0010l¢]Ý*Öà×\fC»\u008aG\u0084ëa\u0010>G\u0090Û\\ì¿~z\u009eB\u0002h\u0005æN";
      int var8 = "1ì\u0098ÈVû©s\u0084«^é\u00192\u0099L\u0010V¸aÕÍ·®síoíc\u0098^÷\u009d\u0018§>\u0000\u0098Äf\u009eË)\t\u0000\u009cc´\u0007\u0085°ÊcxhM¼\u0098\u0010d\u008b\u0012( ýà¥\u0098\u0081\u008dÓS\u000eyk\u0010\n[Ð\u0010wïà¨m\\$\u0001\u008bëÞ»\u0010\u0016\u008c£_\u001ccx®\u0091²\u00933=MÔ\u0013\u0010MÐÆ&b¦\u0098ôB:¹á\bF¶\u0083\u0010l¢]Ý*Öà×\fC»\u008aG\u0084ëa\u0010>G\u0090Û\\ì¿~z\u009eB\u0002h\u0005æN"
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
                     e = new String[11];
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

                  var6 = "&\u0090Öåe=W^|\u001a\u0014Ú)`#À5.\u0017ÛÂªNN\u0010\u0093 \u0084\u0097\u0094\u009aQl%\u00ad\u009eØf\u000f\u009cÏ";
                  var8 = "&\u0090Öåe=W^|\u001a\u0014Ú)`#À5.\u0017ÛÂªNN\u0010\u0093 \u0084\u0097\u0094\u009aQl%\u00ad\u009eØf\u000f\u009cÏ".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13223;
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
            throw new RuntimeException("rdv", var10);
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
         throw new RuntimeException("rdv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
