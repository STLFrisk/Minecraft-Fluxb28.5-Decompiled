import com.google.common.collect.Maps;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class EntityZombie extends j37 {
   private final z0_ m6h = new z0_(new ia2$1(this), 2, 1);
   private static final Map acj;
   private int an1;
   private o1g u4n = new o1g(this);
   private static final long c;
   private static final String[] h;
   private static final String[] y;
   private static final Map z = new HashMap(13);

   public static float[] kn7(qvg var0) {
      return (float[])acj.get(var0);
   }

   public EntityZombie(OpaquePredicate var1) {
      super(var1);
      this.yxc(0.9F, 1.3F);
      ((zvv)this.zq2()).uuq(true);
      this.r1d.tn8(0, new dnq(this));
      this.r1d.tn8(1, new p1g(this, 1.25));
      this.r1d.tn8(2, new rg_(this, 1.0));
      this.r1d.tn8(3, new ttn(this, 1.1, xbr.iqq, false));
      this.r1d.tn8(4, new bun(this, 1.1));
      this.r1d.tn8(5, this.u4n);
      this.r1d.tn8(6, new _tb(this, 1.0));
      this.r1d.tn8(7, new bdq(this, ha9.class, 6.0F));
      this.r1d.tn8(8, new ov6(this));
      this.m6h.cxl(0, new erg(xbr.nnn, 1, 0));
      this.m6h.cxl(1, new erg(xbr.nnn, 1, 0));
   }

   @Override
   public void qar() {
      this.an1 = this.u4n.x5r();
      super.qar();
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 2f
      // 09: getfield EntityZombie.oay Lt9d;
      // 0c: getfield OpaquePredicate.v0f Z
      // 0f: ifeq 2e
      // 12: goto 19
      // 15: invokestatic EntityZombie.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: bipush 0
      // 1b: aload 0
      // 1c: getfield EntityZombie.an1 I
      // 1f: bipush 1
      // 20: isub
      // 21: invokestatic java/lang/Math.max (II)I
      // 24: putfield EntityZombie.an1 I
      // 27: goto 2e
      // 2a: invokestatic EntityZombie.a (Loov;)Loov;
      // 2d: athrow
      // 2e: aload 0
      // 2f: invokespecial j37.e_a ()V
      // 32: return
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(8.0);
      this.dgt(m6d.w7i).zf7(0.23F);
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, new Byte((byte)0));
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 0
      // 05: invokevirtual EntityZombie.pv5 ()Z
      // 08: iload 3
      // 09: ifeq 4d
      // 0c: ifne 38
      // 0f: goto 16
      // 12: invokestatic EntityZombie.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: new erg
      // 1a: dup
      // 1b: getstatic ox_.lpo Le0x;
      // 1e: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 21: bipush 1
      // 22: aload 0
      // 23: invokevirtual EntityZombie.g2i ()Lqvg;
      // 26: invokevirtual qvg.hoo ()I
      // 29: invokespecial erg.<init> (Lu7m;II)V
      // 2c: fconst_0
      // 2d: invokevirtual EntityZombie.qji (Lerg;F)Lnvf;
      // 30: pop
      // 31: goto 38
      // 34: invokestatic EntityZombie.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield EntityZombie.z2d Ljava/util/Random;
      // 3c: bipush 2
      // 3d: invokevirtual java/util/Random.nextInt (I)I
      // 40: bipush 1
      // 41: iadd
      // 42: aload 0
      // 43: getfield EntityZombie.z2d Ljava/util/Random;
      // 46: bipush 1
      // 47: iload 2
      // 48: iadd
      // 49: invokevirtual java/util/Random.nextInt (I)I
      // 4c: iadd
      // 4d: istore 4
      // 4f: bipush 0
      // 50: istore 5
      // 52: iload 5
      // 54: iload 4
      // 56: if_icmpge 96
      // 59: aload 0
      // 5a: iload 3
      // 5b: ifeq 87
      // 5e: invokevirtual EntityZombie.agj ()Z
      // 61: ifeq 7f
      // 64: goto 6b
      // 67: invokestatic EntityZombie.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 0
      // 6c: getstatic xbr.getName Lu7m;
      // 6f: bipush 1
      // 70: invokevirtual EntityZombie.e70 (Lu7m;I)Lnvf;
      // 73: pop
      // 74: iload 3
      // 75: ifne 8f
      // 78: goto 7f
      // 7b: invokestatic EntityZombie.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 0
      // 80: goto 87
      // 83: invokestatic EntityZombie.a (Loov;)Loov;
      // 86: athrow
      // 87: getstatic xbr.xnv Lu7m;
      // 8a: bipush 1
      // 8b: invokevirtual EntityZombie.e70 (Lu7m;I)Lnvf;
      // 8e: pop
      // 8f: iinc 5 1
      // 92: iload 3
      // 93: ifne 52
      // 96: return
   }

   @Override
   public u7m q4n() {
      return u7m.gfm(ox_.lpo);
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: bipush 10
      // 07: if_icmpne 1b
      // 0a: aload 0
      // 0b: bipush 40
      // 0d: putfield EntityZombie.an1 I
      // 10: iload 2
      // 11: ifeq 27
      // 14: goto 1b
      // 17: invokestatic EntityZombie.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 1
      // 1d: invokespecial j37.ptf (B)V
      // 20: goto 27
      // 23: invokestatic EntityZombie.a (Loov;)Loov;
      // 26: athrow
      // 27: return
   }

   public float o4v(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield EntityZombie.an1 I
      // 08: iload 2
      // 09: ifne 22
      // 0c: ifgt 1e
      // 0f: goto 16
      // 12: invokestatic EntityZombie.a (Loov;)Loov;
      // 15: athrow
      // 16: fconst_0
      // 17: goto 88
      // 1a: invokestatic EntityZombie.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield EntityZombie.an1 I
      // 22: bipush 4
      // 23: iload 2
      // 24: ifne 59
      // 27: if_icmplt 54
      // 2a: goto 31
      // 2d: invokestatic EntityZombie.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: getfield EntityZombie.an1 I
      // 35: bipush 36
      // 37: iload 2
      // 38: ifne 59
      // 3b: goto 42
      // 3e: invokestatic EntityZombie.a (Loov;)Loov;
      // 41: athrow
      // 42: if_icmpgt 54
      // 45: goto 4c
      // 48: invokestatic EntityZombie.a (Loov;)Loov;
      // 4b: athrow
      // 4c: fconst_1
      // 4d: goto 88
      // 50: invokestatic EntityZombie.a (Loov;)Loov;
      // 53: athrow
      // 54: aload 0
      // 55: getfield EntityZombie.an1 I
      // 58: bipush 4
      // 59: iload 2
      // 5a: ifne 7f
      // 5d: if_icmpge 79
      // 60: goto 67
      // 63: invokestatic EntityZombie.a (Loov;)Loov;
      // 66: athrow
      // 67: aload 0
      // 68: getfield EntityZombie.an1 I
      // 6b: i2f
      // 6c: fload 1
      // 6d: fsub
      // 6e: ldc 4.0
      // 70: nop
      // 71: fdiv
      // 72: goto 88
      // 75: invokestatic EntityZombie.a (Loov;)Loov;
      // 78: athrow
      // 79: aload 0
      // 7a: getfield EntityZombie.an1 I
      // 7d: bipush 40
      // 7f: isub
      // 80: i2f
      // 81: fload 1
      // 82: fsub
      // 83: fneg
      // 84: ldc 4.0
      // 86: nop
      // 87: fdiv
      // 88: freturn
   }

   public float kme(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield EntityZombie.an1 I
      // 08: iload 2
      // 09: ifeq 60
      // 0c: bipush 4
      // 0d: if_icmple 51
      // 10: goto 17
      // 13: invokestatic EntityZombie.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield EntityZombie.an1 I
      // 1b: iload 2
      // 1c: ifeq 60
      // 1f: goto 26
      // 22: invokestatic EntityZombie.a (Loov;)Loov;
      // 25: athrow
      // 26: bipush 36
      // 28: if_icmpgt 51
      // 2b: goto 32
      // 2e: invokestatic EntityZombie.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: getfield EntityZombie.an1 I
      // 36: bipush 4
      // 37: isub
      // 38: i2f
      // 39: fload 1
      // 3a: fsub
      // 3b: ldc 32.0
      // 3d: nop
      // 3e: fdiv
      // 3f: fstore 3
      // 40: ldc 0.62831855
      // 42: nop
      // 43: ldc 0.2199115
      // 45: nop
      // 46: fload 3
      // 47: ldc 28.7
      // 49: nop
      // 4a: fmul
      // 4b: invokestatic fe6.rtn (F)F
      // 4e: fmul
      // 4f: fadd
      // 50: freturn
      // 51: aload 0
      // 52: iload 2
      // 53: ifeq 6e
      // 56: getfield EntityZombie.an1 I
      // 59: goto 60
      // 5c: invokestatic EntityZombie.a (Loov;)Loov;
      // 5f: athrow
      // 60: ifle 6d
      // 63: ldc 0.62831855
      // 65: nop
      // 66: goto 75
      // 69: invokestatic EntityZombie.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield EntityZombie.y2i F
      // 71: ldc 57.295776
      // 73: nop
      // 74: fdiv
      // 75: freturn
   }

   @Override
   public boolean hp6(ha9 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic EntityZombie.c J
      // 003: ldc2_w 584873729904
      // 006: lxor
      // 007: lstore 2
      // 008: invokestatic OpaquePredicate.b ()I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: getfield ha9.up_ Ljnq;
      // 011: invokevirtual jnq.dxs ()Lerg;
      // 014: astore 5
      // 016: aload 5
      // 018: iload 4
      // 01a: ifeq 029
      // 01d: ifnull 13b
      // 020: goto 027
      // 023: invokestatic EntityZombie.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 5
      // 029: invokevirtual erg.gn1 ()Lu7m;
      // 02c: getstatic xbr.qsl Lguw;
      // 02f: if_acmpne 13b
      // 032: aload 0
      // 033: invokevirtual EntityZombie.pv5 ()Z
      // 036: iload 4
      // 038: ifeq 140
      // 03b: goto 042
      // 03e: invokestatic EntityZombie.a (Loov;)Loov;
      // 041: athrow
      // 042: ifne 13b
      // 045: goto 04c
      // 048: invokestatic EntityZombie.a (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 0
      // 04d: invokevirtual EntityZombie.ejl ()Z
      // 050: iload 4
      // 052: ifeq 140
      // 055: goto 05c
      // 058: invokestatic EntityZombie.a (Loov;)Loov;
      // 05b: athrow
      // 05c: ifne 13b
      // 05f: goto 066
      // 062: invokestatic EntityZombie.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: iload 4
      // 069: ifeq 128
      // 06c: goto 073
      // 06f: invokestatic EntityZombie.a (Loov;)Loov;
      // 072: athrow
      // 073: getfield EntityZombie.oay Lt9d;
      // 076: getfield OpaquePredicate.v0f Z
      // 079: ifne 120
      // 07c: goto 083
      // 07f: invokestatic EntityZombie.a (Loov;)Loov;
      // 082: athrow
      // 083: aload 0
      // 084: bipush 1
      // 085: invokevirtual EntityZombie.kz0 (Z)V
      // 088: bipush 1
      // 089: aload 0
      // 08a: getfield EntityZombie.z2d Ljava/util/Random;
      // 08d: bipush 3
      // 08e: invokevirtual java/util/Random.nextInt (I)I
      // 091: iadd
      // 092: istore 6
      // 094: bipush 0
      // 095: istore 7
      // 097: iload 7
      // 099: iload 6
      // 09b: if_icmpge 120
      // 09e: aload 0
      // 09f: new erg
      // 0a2: dup
      // 0a3: getstatic ox_.lpo Le0x;
      // 0a6: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 0a9: bipush 1
      // 0aa: aload 0
      // 0ab: invokevirtual EntityZombie.g2i ()Lqvg;
      // 0ae: invokevirtual qvg.hoo ()I
      // 0b1: invokespecial erg.<init> (Lu7m;II)V
      // 0b4: fconst_1
      // 0b5: invokevirtual EntityZombie.qji (Lerg;F)Lnvf;
      // 0b8: astore 8
      // 0ba: aload 8
      // 0bc: dup
      // 0bd: getfield nvf.mop D
      // 0c0: aload 0
      // 0c1: getfield EntityZombie.z2d Ljava/util/Random;
      // 0c4: invokevirtual java/util/Random.nextFloat ()F
      // 0c7: ldc 0.05
      // 0c9: nop
      // 0ca: fmul
      // 0cb: f2d
      // 0cc: dadd
      // 0cd: putfield nvf.mop D
      // 0d0: aload 8
      // 0d2: dup
      // 0d3: getfield nvf.icv D
      // 0d6: aload 0
      // 0d7: getfield EntityZombie.z2d Ljava/util/Random;
      // 0da: invokevirtual java/util/Random.nextFloat ()F
      // 0dd: aload 0
      // 0de: getfield EntityZombie.z2d Ljava/util/Random;
      // 0e1: invokevirtual java/util/Random.nextFloat ()F
      // 0e4: fsub
      // 0e5: ldc 0.1
      // 0e7: nop
      // 0e8: fmul
      // 0e9: f2d
      // 0ea: dadd
      // 0eb: putfield nvf.icv D
      // 0ee: aload 8
      // 0f0: dup
      // 0f1: getfield nvf.bw4 D
      // 0f4: aload 0
      // 0f5: getfield EntityZombie.z2d Ljava/util/Random;
      // 0f8: invokevirtual java/util/Random.nextFloat ()F
      // 0fb: aload 0
      // 0fc: getfield EntityZombie.z2d Ljava/util/Random;
      // 0ff: invokevirtual java/util/Random.nextFloat ()F
      // 102: fsub
      // 103: ldc 0.1
      // 105: nop
      // 106: fmul
      // 107: f2d
      // 108: dadd
      // 109: putfield nvf.bw4 D
      // 10c: iinc 7 1
      // 10f: iload 4
      // 111: ifeq 127
      // 114: iload 4
      // 116: ifne 097
      // 119: goto 120
      // 11c: invokestatic EntityZombie.a (Loov;)Loov;
      // 11f: athrow
      // 120: aload 5
      // 122: bipush 1
      // 123: aload 1
      // 124: invokevirtual erg.ybw (ILg_3;)V
      // 127: aload 0
      // 128: sipush 24435
      // 12b: ldc2_w 2588707227492145078
      // 12e: lload 2
      // 12f: lxor
      // 130: invokedynamic u (IJ)Ljava/lang/String; bsm=EntityZombie.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 135: nop
      // 136: fconst_1
      // 137: fconst_1
      // 138: invokevirtual EntityZombie.lhu (Ljava/lang/String;FF)V
      // 13b: aload 0
      // 13c: aload 1
      // 13d: invokespecial j37.hp6 (Lha9;)Z
      // 140: ireturn
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 63729268034433L;
      super.srs(var1);
      var1.zyu(f<"u">(5395, 3534754214617368865L ^ var2), this.pv5());
      var1.atr(f<"u">(28138, 8508753964337279451L ^ var2), (byte)this.g2i().hoo());
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 87241074239274L;
      super.cjb(var1);
      this.kz0(var1.dvl(f<"u">(4504, 6313655703673970950L ^ var2)));
      this.eex(qvg.hup(var1.r_t(f<"u">(30592, 9154827489212483352L ^ var2))));
   }

   @Override
   public String _n1() {
      long var1 = c ^ 62433625715191L;
      return f<"u">(17605, 4439530745035563653L ^ var1);
   }

   @Override
   public String wcg() {
      long var1 = c ^ 37835379588751L;
      return f<"u">(7452, 7288565584427152418L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = c ^ 32023195257025L;
      return f<"u">(17605, 4439498543706512307L ^ var1);
   }

   @Override
   public void cmh(mew var1, e0x var2) {
      long var3 = c ^ 115884047847821L;
      this.lhu(f<"u">(24360, 7926287154496166163L ^ var3), 0.15F, 1.0F);
   }

   public qvg g2i() {
      return qvg.hup(this.oit.miz(16) & 15);
   }

   public void eex(qvg var1) {
      byte var2 = this.oit.miz(16);
      this.oit.c66(16, (byte)(var2 & 240 | var1.hoo() & 15));
   }

   public boolean pv5() {
      int var1 = OpaquePredicate.b();

      try {
         int var10000 = this.oit.miz(16) & 16;
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public void kz0(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield EntityZombie.oit Lwl1;
      // 08: bipush 16
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: istore 3
      // 0e: iload 2
      // 0f: ifne 35
      // 12: iload 1
      // 13: ifeq 39
      // 16: goto 1d
      // 19: invokestatic EntityZombie.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield EntityZombie.oit Lwl1;
      // 21: bipush 16
      // 23: iload 3
      // 24: bipush 16
      // 26: ior
      // 27: i2b
      // 28: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 2b: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2e: goto 35
      // 31: invokestatic EntityZombie.a (Loov;)Loov;
      // 34: athrow
      // 35: iload 2
      // 36: ifeq 51
      // 39: aload 0
      // 3a: getfield EntityZombie.oit Lwl1;
      // 3d: bipush 16
      // 3f: iload 3
      // 40: bipush -17
      // 42: iand
      // 43: i2b
      // 44: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 47: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 4a: goto 51
      // 4d: invokestatic EntityZombie.a (Loov;)Loov;
      // 50: athrow
      // 51: return
   }

   public static qvg nj0(Random param0) {
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
      // 05: bipush 100
      // 07: invokevirtual java/util/Random.nextInt (I)I
      // 0a: istore 2
      // 0b: iload 2
      // 0c: bipush 5
      // 0d: iload 1
      // 0e: ifeq 28
      // 11: if_icmpge 25
      // 14: goto 1b
      // 17: invokestatic EntityZombie.a (Loov;)Loov;
      // 1a: athrow
      // 1b: getstatic qvg.qn4 Lqvg;
      // 1e: goto 8d
      // 21: invokestatic EntityZombie.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 2
      // 26: bipush 10
      // 28: iload 1
      // 29: ifeq 43
      // 2c: if_icmpge 40
      // 2f: goto 36
      // 32: invokestatic EntityZombie.a (Loov;)Loov;
      // 35: athrow
      // 36: getstatic qvg._p6 Lqvg;
      // 39: goto 8d
      // 3c: invokestatic EntityZombie.a (Loov;)Loov;
      // 3f: athrow
      // 40: iload 2
      // 41: bipush 15
      // 43: iload 1
      // 44: ifeq 69
      // 47: if_icmpge 5b
      // 4a: goto 51
      // 4d: invokestatic EntityZombie.a (Loov;)Loov;
      // 50: athrow
      // 51: getstatic qvg.i_s Lqvg;
      // 54: goto 8d
      // 57: invokestatic EntityZombie.a (Loov;)Loov;
      // 5a: athrow
      // 5b: iload 2
      // 5c: iload 1
      // 5d: ifeq 7d
      // 60: bipush 18
      // 62: goto 69
      // 65: invokestatic EntityZombie.a (Loov;)Loov;
      // 68: athrow
      // 69: if_icmpge 76
      // 6c: getstatic qvg._fk Lqvg;
      // 6f: goto 8d
      // 72: invokestatic EntityZombie.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: sipush 500
      // 7a: invokevirtual java/util/Random.nextInt (I)I
      // 7d: ifne 8a
      // 80: getstatic qvg.uqr Lqvg;
      // 83: goto 8d
      // 86: invokestatic EntityZombie.a (Loov;)Loov;
      // 89: athrow
      // 8a: getstatic qvg.ft3 Lqvg;
      // 8d: areturn
   }

   public EntityZombie kv0(dms var1) {
      EntityZombie var2 = (EntityZombie)var1;
      EntityZombie var3 = new EntityZombie(this.oay);
      var3.eex(this.brr(this, var2));
      return var3;
   }

   @Override
   public void jk2() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: bipush 0
      // 06: invokevirtual EntityZombie.kz0 (Z)V
      // 09: aload 0
      // 0a: iload 1
      // 0b: ifne 23
      // 0e: invokevirtual EntityZombie.ejl ()Z
      // 11: ifeq 28
      // 14: goto 1b
      // 17: invokestatic EntityZombie.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic EntityZombie.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 60
      // 25: invokevirtual EntityZombie.z23 (I)V
      // 28: return
   }

   @Override
   public ps6 hx8(css var1, ps6 var2) {
      var2 = super.hx8(var1, var2);
      this.eex(nj0(this.oay.fsy));
      return var2;
   }

   private qvg brr(j37 param1, j37 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: checkcast EntityZombie
      // 04: invokevirtual EntityZombie.g2i ()Lqvg;
      // 07: invokevirtual qvg.b9d ()I
      // 0a: istore 4
      // 0c: invokestatic OpaquePredicate.b ()I
      // 0f: aload 2
      // 10: checkcast EntityZombie
      // 13: invokevirtual EntityZombie.g2i ()Lqvg;
      // 16: invokevirtual qvg.b9d ()I
      // 19: istore 5
      // 1b: istore 3
      // 1c: aload 0
      // 1d: getfield EntityZombie.m6h Lz0_;
      // 20: bipush 0
      // 21: invokevirtual z0_.ibn (I)Lerg;
      // 24: iload 4
      // 26: invokevirtual erg.awe (I)V
      // 29: aload 0
      // 2a: getfield EntityZombie.m6h Lz0_;
      // 2d: bipush 1
      // 2e: invokevirtual z0_.ibn (I)Lerg;
      // 31: iload 5
      // 33: invokevirtual erg.awe (I)V
      // 36: invokestatic opt.c4k ()Lopt;
      // 39: aload 0
      // 3a: getfield EntityZombie.m6h Lz0_;
      // 3d: aload 1
      // 3e: checkcast EntityZombie
      // 41: getfield EntityZombie.oay Lt9d;
      // 44: invokevirtual opt.bhr (Lz0_;Lt9d;)Lerg;
      // 47: astore 6
      // 49: aload 6
      // 4b: iload 3
      // 4c: ifeq 5b
      // 4f: ifnull 81
      // 52: goto 59
      // 55: invokestatic EntityZombie.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 6
      // 5b: iload 3
      // 5c: ifeq 78
      // 5f: invokevirtual erg.gn1 ()Lu7m;
      // 62: getstatic xbr.nnn Lu7m;
      // 65: if_acmpne 81
      // 68: goto 6f
      // 6b: invokestatic EntityZombie.a (Loov;)Loov;
      // 6e: athrow
      // 6f: aload 6
      // 71: goto 78
      // 74: invokestatic EntityZombie.a (Loov;)Loov;
      // 77: athrow
      // 78: invokevirtual erg.j6_ ()I
      // 7b: istore 7
      // 7d: iload 3
      // 7e: ifne a9
      // 81: aload 0
      // 82: getfield EntityZombie.oay Lt9d;
      // 85: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 88: invokevirtual java/util/Random.nextBoolean ()Z
      // 8b: iload 3
      // 8c: ifeq a2
      // 8f: goto 96
      // 92: invokestatic EntityZombie.a (Loov;)Loov;
      // 95: athrow
      // 96: ifeq a5
      // 99: goto a0
      // 9c: invokestatic EntityZombie.a (Loov;)Loov;
      // 9f: athrow
      // a0: iload 4
      // a2: goto a7
      // a5: iload 5
      // a7: istore 7
      // a9: iload 7
      // ab: invokestatic qvg.b7j (I)Lqvg;
      // ae: areturn
   }

   @Override
   public float c5y() {
      return 0.95F * this.ikl;
   }

   @Override
   public dms kv0(dms var1) {
      return this.kv0(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-1055675967348958662L, -4493121147203410770L, MethodHandles.lookup().lookupClass()).a(231950985769891L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 44196567574169L;
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
      String var6 = "\u001d\u0086RT\u0003ÃqÔ^÷Ô^Z\u0006?? ÅÊÁÇô£Hõ\f\u00adø1¾ZqVD\u0087ð\u0012^¦´%x¯ZÏÙ?\u0096J J±ÖG\u0017RÍ\u0095\u001e§q«M].îïVÄÞ8B\u0001{·)\u00ad&?¯Ä¾ \u001fú\u0092Ì%zò&áÎW]À§\u009a\tùÃéjØBcbyÊ\u0089~ÇaOð\u0010Æá\u0089aÉ³\u0097ï²\u008c\fÂë\u0085\u009a\u0097\u0018Ü\u0085.\u00956ÙMuê2{Õ\u0095vÂ\u0080n¦Ä\u0098\u0006\u008f|£";
      int var8 = "\u001d\u0086RT\u0003ÃqÔ^÷Ô^Z\u0006?? ÅÊÁÇô£Hõ\f\u00adø1¾ZqVD\u0087ð\u0012^¦´%x¯ZÏÙ?\u0096J J±ÖG\u0017RÍ\u0095\u001e§q«M].îïVÄÞ8B\u0001{·)\u00ad&?¯Ä¾ \u001fú\u0092Ì%zò&áÎW]À§\u009a\tùÃéjØBcbyÊ\u0089~ÇaOð\u0010Æá\u0089aÉ³\u0097ï²\u008c\fÂë\u0085\u009a\u0097\u0018Ü\u0085.\u00956ÙMuê2{Õ\u0095vÂ\u0080n¦Ä\u0098\u0006\u008f|£"
         .length();
      char var5 = 16;
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
                     y = new String[8];
                     acj = Maps.newEnumMap(qvg.class);
                     acj.put(qvg.ft3, new float[]{1.0F, 1.0F, 1.0F});
                     acj.put(qvg.y0w, new float[]{0.85F, 0.5F, 0.2F});
                     acj.put(qvg.is_, new float[]{0.7F, 0.3F, 0.85F});
                     acj.put(qvg.pyj, new float[]{0.4F, 0.6F, 0.85F});
                     acj.put(qvg.byr, new float[]{0.9F, 0.9F, 0.2F});
                     acj.put(qvg.w98, new float[]{0.5F, 0.8F, 0.1F});
                     acj.put(qvg.uqr, new float[]{0.95F, 0.5F, 0.65F});
                     acj.put(qvg._p6, new float[]{0.3F, 0.3F, 0.3F});
                     acj.put(qvg.i_s, new float[]{0.6F, 0.6F, 0.6F});
                     acj.put(qvg.wms, new float[]{0.3F, 0.5F, 0.6F});
                     acj.put(qvg.a32, new float[]{0.5F, 0.25F, 0.7F});
                     acj.put(qvg.o71, new float[]{0.2F, 0.3F, 0.7F});
                     acj.put(qvg._fk, new float[]{0.4F, 0.3F, 0.2F});
                     acj.put(qvg.u1l, new float[]{0.4F, 0.5F, 0.2F});
                     acj.put(qvg.y7l, new float[]{0.6F, 0.2F, 0.2F});
                     acj.put(qvg.qn4, new float[]{0.1F, 0.1F, 0.1F});
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

                  var6 = "¸uÉ\u00ad\u0015|\u0018\u001a¥ÌiÖr\tOÿ\u0010\u0093\u0003¤Xw\u001bª\u0004\u008f¡ÄßÈ3Bõ";
                  var8 = "¸uÉ\u00ad\u0015|\u0018\u001a¥ÌiÖr\tOÿ\u0010\u0093\u0003¤Xw\u001bª\u0004\u008f¡ÄßÈ3Bõ".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24665;
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
            throw new RuntimeException("EntityZombie", var10);
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
         throw new RuntimeException("EntityZombie" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
