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

public class osf extends __a {
   private int c4_;
   public j7z uwx;
   private int r5z;
   private int izc;
   private static final long d;
   private static final String[] t;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public osf(t9d var1) {
      super(var1);
      this.yxc(1.4F, 2.9F);
      ((zvv)this.zq2()).uuq(true);
      this.r1d.tn8(1, new h2d(this, 1.0, true));
      this.r1d.tn8(2, new doq(this, 0.9, 32.0F));
      this.r1d.tn8(3, new zvn(this, 0.6, true));
      this.r1d.tn8(4, new rap(this, 1.0));
      this.r1d.tn8(5, new idu(this));
      this.r1d.tn8(6, new _tb(this, 0.6));
      this.r1d.tn8(7, new bdq(this, ha9.class, 6.0F));
      this.r1d.tn8(8, new ov6(this));
      this.g9o.tn8(1, new zhh(this));
      this.g9o.tn8(2, new z7z(this, false, new Class[0]));
      this.g9o.tn8(3, new osf$etd(this, yqv.class, 10, false, true, uv0.v4d));
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, (byte)0);
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 8f
      // 09: dup
      // 0a: getfield osf.c4_ I
      // 0d: bipush 1
      // 0e: isub
      // 0f: dup_x1
      // 10: putfield osf.c4_ I
      // 13: ifgt 8e
      // 16: goto 1d
      // 19: invokestatic osf.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: bipush 70
      // 20: aload 0
      // 21: getfield osf.z2d Ljava/util/Random;
      // 24: bipush 50
      // 26: invokevirtual java/util/Random.nextInt (I)I
      // 29: iadd
      // 2a: putfield osf.c4_ I
      // 2d: aload 0
      // 2e: aload 0
      // 2f: getfield osf.oay Lt9d;
      // 32: invokevirtual t9d.hd9 ()Lbg8;
      // 35: new mew
      // 38: dup
      // 39: aload 0
      // 3a: invokespecial mew.<init> (Li2h;)V
      // 3d: bipush 32
      // 3f: invokevirtual bg8.pom (Lmew;I)Lj7z;
      // 42: putfield osf.uwx Lj7z;
      // 45: aload 0
      // 46: getfield osf.uwx Lj7z;
      // 49: iload 1
      // 4a: ifne 78
      // 4d: goto 54
      // 50: invokestatic osf.a (Loov;)Loov;
      // 53: athrow
      // 54: ifnonnull 6d
      // 57: goto 5e
      // 5a: invokestatic osf.a (Loov;)Loov;
      // 5d: athrow
      // 5e: aload 0
      // 5f: invokevirtual osf.u_7 ()V
      // 62: iload 1
      // 63: ifeq 8e
      // 66: goto 6d
      // 69: invokestatic osf.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield osf.uwx Lj7z;
      // 71: goto 78
      // 74: invokestatic osf.a (Loov;)Loov;
      // 77: athrow
      // 78: invokevirtual j7z.n0h ()Lmew;
      // 7b: astore 2
      // 7c: aload 0
      // 7d: aload 2
      // 7e: aload 0
      // 7f: getfield osf.uwx Lj7z;
      // 82: invokevirtual j7z.hk4 ()I
      // 85: i2f
      // 86: ldc 0.6
      // 88: nop
      // 89: fmul
      // 8a: f2i
      // 8b: invokevirtual osf.muf (Lmew;I)V
      // 8e: aload 0
      // 8f: invokespecial __a.qar ()V
      // 92: return
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.t9k).zf7(100.0);
      this.dgt(m6d.w7i).zf7(0.25);
   }

   @Override
   public int g2u(int var1) {
      return var1;
   }

   @Override
   public void v4n(i2h param1) {
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
      // 05: instanceof uv0
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq 5c
      // 0f: goto 16
      // 12: invokestatic osf.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: instanceof gze
      // 1a: goto 21
      // 1d: invokestatic osf.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 4a
      // 25: ifne 5c
      // 28: goto 2f
      // 2b: invokestatic osf.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 2
      // 31: ifne 5d
      // 34: goto 3b
      // 37: invokestatic osf.a (Loov;)Loov;
      // 3a: athrow
      // 3b: invokevirtual osf.mbr ()Ljava/util/Random;
      // 3e: bipush 20
      // 40: invokevirtual java/util/Random.nextInt (I)I
      // 43: goto 4a
      // 46: invokestatic osf.a (Loov;)Loov;
      // 49: athrow
      // 4a: ifne 5c
      // 4d: aload 0
      // 4e: aload 1
      // 4f: checkcast g_3
      // 52: invokevirtual osf.ux8 (Lg_3;)V
      // 55: goto 5c
      // 58: invokestatic osf.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 0
      // 5d: aload 1
      // 5e: invokespecial __a.v4n (Li2h;)V
      // 61: return
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
      // 000: invokestatic t9d.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokespecial __a.e_a ()V
      // 008: aload 0
      // 009: getfield osf.r5z I
      // 00c: iload 1
      // 00d: ifne 02f
      // 010: ifle 02b
      // 013: goto 01a
      // 016: invokestatic osf.a (Loov;)Loov;
      // 019: athrow
      // 01a: aload 0
      // 01b: dup
      // 01c: getfield osf.r5z I
      // 01f: bipush 1
      // 020: isub
      // 021: putfield osf.r5z I
      // 024: goto 02b
      // 027: invokestatic osf.a (Loov;)Loov;
      // 02a: athrow
      // 02b: aload 0
      // 02c: getfield osf.izc I
      // 02f: iload 1
      // 030: ifne 065
      // 033: ifle 04e
      // 036: goto 03d
      // 039: invokestatic osf.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: dup
      // 03f: getfield osf.izc I
      // 042: bipush 1
      // 043: isub
      // 044: putfield osf.izc I
      // 047: goto 04e
      // 04a: invokestatic osf.a (Loov;)Loov;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield osf.icv D
      // 052: aload 0
      // 053: getfield osf.icv D
      // 056: dmul
      // 057: aload 0
      // 058: getfield osf.bw4 D
      // 05b: aload 0
      // 05c: getfield osf.bw4 D
      // 05f: dmul
      // 060: dadd
      // 061: ldc2_w 2.500000277905201E-7
      // 064: dcmpl
      // 065: iload 1
      // 066: ifne 082
      // 069: ifle 154
      // 06c: goto 073
      // 06f: invokestatic osf.a (Loov;)Loov;
      // 072: athrow
      // 073: aload 0
      // 074: getfield osf.z2d Ljava/util/Random;
      // 077: bipush 5
      // 078: invokevirtual java/util/Random.nextInt (I)I
      // 07b: goto 082
      // 07e: invokestatic osf.a (Loov;)Loov;
      // 081: athrow
      // 082: iload 1
      // 083: ifne 09e
      // 086: ifne 154
      // 089: goto 090
      // 08c: invokestatic osf.a (Loov;)Loov;
      // 08f: athrow
      // 090: aload 0
      // 091: getfield osf.o2v D
      // 094: invokestatic fe6.jqf (D)I
      // 097: goto 09e
      // 09a: invokestatic osf.a (Loov;)Loov;
      // 09d: athrow
      // 09e: istore 2
      // 09f: aload 0
      // 0a0: getfield osf.kfp D
      // 0a3: ldc2_w 0.20000000298023224
      // 0a6: dsub
      // 0a7: invokestatic fe6.jqf (D)I
      // 0aa: istore 3
      // 0ab: aload 0
      // 0ac: getfield osf.vbd D
      // 0af: invokestatic fe6.jqf (D)I
      // 0b2: istore 4
      // 0b4: aload 0
      // 0b5: getfield osf.oay Lt9d;
      // 0b8: new mew
      // 0bb: dup
      // 0bc: iload 2
      // 0bd: iload 3
      // 0be: iload 4
      // 0c0: invokespecial mew.<init> (III)V
      // 0c3: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0c6: astore 5
      // 0c8: aload 5
      // 0ca: invokeinterface zfz.r_y ()Le0x; 1
      // 0cf: astore 6
      // 0d1: aload 6
      // 0d3: invokevirtual e0x.p1r ()Lp3y;
      // 0d6: getstatic p3y.cei Lp3y;
      // 0d9: if_acmpeq 154
      // 0dc: aload 0
      // 0dd: getfield osf.oay Lt9d;
      // 0e0: getstatic w_0.uuz Lw_0;
      // 0e3: aload 0
      // 0e4: getfield osf.o2v D
      // 0e7: aload 0
      // 0e8: getfield osf.z2d Ljava/util/Random;
      // 0eb: invokevirtual java/util/Random.nextFloat ()F
      // 0ee: f2d
      // 0ef: ldc2_w 0.5
      // 0f2: dsub
      // 0f3: aload 0
      // 0f4: getfield osf.uo6 F
      // 0f7: f2d
      // 0f8: dmul
      // 0f9: dadd
      // 0fa: aload 0
      // 0fb: invokevirtual osf.aaw ()Lnh4;
      // 0fe: getfield nh4.bx_ D
      // 101: ldc2_w 0.1
      // 104: dadd
      // 105: aload 0
      // 106: getfield osf.vbd D
      // 109: aload 0
      // 10a: getfield osf.z2d Ljava/util/Random;
      // 10d: invokevirtual java/util/Random.nextFloat ()F
      // 110: f2d
      // 111: ldc2_w 0.5
      // 114: dsub
      // 115: aload 0
      // 116: getfield osf.uo6 F
      // 119: f2d
      // 11a: dmul
      // 11b: dadd
      // 11c: ldc2_w 4.0
      // 11f: aload 0
      // 120: getfield osf.z2d Ljava/util/Random;
      // 123: invokevirtual java/util/Random.nextFloat ()F
      // 126: f2d
      // 127: ldc2_w 0.5
      // 12a: dsub
      // 12b: dmul
      // 12c: ldc2_w 0.5
      // 12f: aload 0
      // 130: getfield osf.z2d Ljava/util/Random;
      // 133: invokevirtual java/util/Random.nextFloat ()F
      // 136: f2d
      // 137: ldc2_w 0.5
      // 13a: dsub
      // 13b: ldc2_w 4.0
      // 13e: dmul
      // 13f: bipush 1
      // 140: newarray 10
      // 142: dup
      // 143: bipush 0
      // 144: aload 5
      // 146: invokestatic e0x.r2y (Lzfz;)I
      // 149: iastore
      // 14a: invokevirtual t9d.zvy (Lw_0;DDDDDD[I)V
      // 14d: goto 154
      // 150: invokestatic osf.a (Loov;)Loov;
      // 153: athrow
      // 154: return
   }

   @Override
   public boolean toj(Class param1) {
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
      // 05: invokevirtual osf.px1 ()Z
      // 08: iload 2
      // 09: ifne 2f
      // 0c: ifeq 3a
      // 0f: goto 16
      // 12: invokestatic osf.a (Loov;)Loov;
      // 15: athrow
      // 16: ldc ha9
      // 18: nop
      // 19: aload 1
      // 1a: iload 2
      // 1b: ifne 3e
      // 1e: goto 25
      // 21: invokestatic osf.a (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 28: goto 2f
      // 2b: invokestatic osf.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifeq 3a
      // 32: bipush 0
      // 33: goto 4e
      // 36: invokestatic osf.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 1
      // 3b: ldc gze
      // 3d: nop
      // 3e: if_acmpne 49
      // 41: bipush 0
      // 42: goto 4e
      // 45: invokestatic osf.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 1
      // 4b: invokespecial __a.toj (Ljava/lang/Class;)Z
      // 4e: ireturn
   }

   @Override
   public void srs(bdo var1) {
      long var2 = d ^ 78388630283007L;
      super.srs(var1);
      var1.zyu(e<"r">(2908, 8285472359454704803L ^ var2), this.px1());
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = d ^ 54859670294100L;
      super.cjb(var1);
      this.hq8(var1.dvl(e<"r">(5955, 466612784201004049L ^ var2)));
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
      // 00: getstatic osf.d J
      // 03: ldc2_w 109298450698460
      // 06: lxor
      // 07: lstore 2
      // 08: aload 0
      // 09: bipush 10
      // 0b: putfield osf.r5z I
      // 0e: aload 0
      // 0f: getfield osf.oay Lt9d;
      // 12: aload 0
      // 13: bipush 4
      // 14: invokevirtual t9d.qyn (Li2h;B)V
      // 17: invokestatic t9d.c ()I
      // 1a: aload 1
      // 1b: aload 0
      // 1c: invokestatic ofh.kun (Lg_3;)Lofh;
      // 1f: bipush 7
      // 21: aload 0
      // 22: getfield osf.z2d Ljava/util/Random;
      // 25: bipush 15
      // 27: invokevirtual java/util/Random.nextInt (I)I
      // 2a: iadd
      // 2b: i2f
      // 2c: invokevirtual i2h.m1t (Lofh;F)Z
      // 2f: istore 5
      // 31: istore 4
      // 33: iload 5
      // 35: iload 4
      // 37: ifne 73
      // 3a: ifeq 5d
      // 3d: goto 44
      // 40: invokestatic osf.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 1
      // 45: dup
      // 46: getfield i2h.mop D
      // 49: ldc2_w 0.4000000059604645
      // 4c: dadd
      // 4d: putfield i2h.mop D
      // 50: aload 0
      // 51: aload 0
      // 52: aload 1
      // 53: invokevirtual osf.wm5 (Lg_3;Li2h;)V
      // 56: goto 5d
      // 59: invokestatic osf.a (Loov;)Loov;
      // 5c: athrow
      // 5d: aload 0
      // 5e: sipush 8728
      // 61: ldc2_w 8359388509800685510
      // 64: lload 2
      // 65: lxor
      // 66: invokedynamic r (IJ)Ljava/lang/String; bsm=osf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6b: nop
      // 6c: fconst_1
      // 6d: fconst_1
      // 6e: invokevirtual osf.lhu (Ljava/lang/String;FF)V
      // 71: iload 5
      // 73: ireturn
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
      // 00: getstatic osf.d J
      // 03: ldc2_w 86194839691515
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: iload 1
      // 0e: bipush 4
      // 0f: iload 4
      // 11: ifne 4e
      // 14: if_icmpne 44
      // 17: goto 1e
      // 1a: invokestatic osf.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: bipush 10
      // 21: putfield osf.r5z I
      // 24: aload 0
      // 25: sipush 20840
      // 28: ldc2_w 6513998648528936080
      // 2b: lload 2
      // 2c: lxor
      // 2d: invokedynamic r (IJ)Ljava/lang/String; bsm=osf.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 32: nop
      // 33: fconst_1
      // 34: fconst_1
      // 35: invokevirtual osf.lhu (Ljava/lang/String;FF)V
      // 38: iload 4
      // 3a: ifeq 70
      // 3d: goto 44
      // 40: invokestatic osf.a (Loov;)Loov;
      // 43: athrow
      // 44: iload 1
      // 45: bipush 11
      // 47: goto 4e
      // 4a: invokestatic osf.a (Loov;)Loov;
      // 4d: athrow
      // 4e: if_icmpne 64
      // 51: aload 0
      // 52: sipush 400
      // 55: putfield osf.izc I
      // 58: iload 4
      // 5a: ifeq 70
      // 5d: goto 64
      // 60: invokestatic osf.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 0
      // 65: iload 1
      // 66: invokespecial __a.ptf (B)V
      // 69: goto 70
      // 6c: invokestatic osf.a (Loov;)Loov;
      // 6f: athrow
      // 70: return
   }

   public j7z vda() {
      return this.uwx;
   }

   public int x1h() {
      return this.r5z;
   }

   public void p30(boolean var1) {
      int var2 = t9d.c();

      osf var10000;
      short var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = var1;
               if (var2 != 0) {
                  break label22;
               }

               if (var1 != 0) {
                  break label21;
               }
            } catch (oov var3) {
               throw a(var3);
            }

            var10001 = 0;
            break label22;
         }

         var10001 = 400;
      }

      var10000.izc = var10001;
      this.oay.qyn(this, (byte)11);
   }

   @Override
   public String wcg() {
      long var1 = d ^ 102067117512689L;
      return e<"r">(21343, 8791471659792427434L ^ var1);
   }

   @Override
   public String ix6() {
      long var1 = d ^ 109550073668031L;
      return e<"r">(5766, 2329181084098501176L ^ var1);
   }

   @Override
   public void cmh(mew var1, e0x var2) {
      long var3 = d ^ 26217513597171L;
      this.lhu(e<"r">(2996, 5099195880895897152L ^ var3), 1.0F, 1.0F);
   }

   @Override
   public void ir3(boolean var1, int var2) {
      int var4 = this.z2d.nextInt(3);
      int var10000 = t9d.c();
      int var5 = 0;
      int var3 = var10000;

      while (true) {
         if (var5 < var4) {
            try {
               this.bhk(u7m.gfm(ox_.xq2), 1, (float)u5m$cco.gye.uzp());
               var5++;
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            } catch (oov var7) {
               throw a(var7);
            }
         }

         var5 = 3 + this.z2d.nextInt(3);
         break;
      }

      int var6 = 0;

      while (var6 < var5) {
         this.e70(xbr.icz, 1);
         var6++;
         if (var3 != 0) {
            break;
         }
      }
   }

   public int gn_() {
      return this.izc;
   }

   public boolean px1() {
      int var1 = t9d.c();

      try {
         int var10000 = this.oit.miz(16) & 1;
         if (var1 != 0) {
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

   public void hq8(boolean param1) {
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
      // 05: getfield osf.oit Lwl1;
      // 08: bipush 16
      // 0a: invokevirtual wl1.miz (I)B
      // 0d: istore 3
      // 0e: iload 2
      // 0f: ifeq 34
      // 12: iload 1
      // 13: ifeq 38
      // 16: goto 1d
      // 19: invokestatic osf.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield osf.oit Lwl1;
      // 21: bipush 16
      // 23: iload 3
      // 24: bipush 1
      // 25: ior
      // 26: i2b
      // 27: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 2a: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2d: goto 34
      // 30: invokestatic osf.a (Loov;)Loov;
      // 33: athrow
      // 34: iload 2
      // 35: ifne 50
      // 38: aload 0
      // 39: getfield osf.oit Lwl1;
      // 3c: bipush 16
      // 3e: iload 3
      // 3f: bipush -2
      // 41: iand
      // 42: i2b
      // 43: invokestatic java/lang/Byte.valueOf (B)Ljava/lang/Byte;
      // 46: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 49: goto 50
      // 4c: invokestatic osf.a (Loov;)Loov;
      // 4f: athrow
      // 50: return
   }

   @Override
   public void owu(ofh param1) {
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
      // 05: iload 2
      // 06: ifne 61
      // 09: invokevirtual osf.px1 ()Z
      // 0c: ifne 60
      // 0f: goto 16
      // 12: invokestatic osf.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 2
      // 18: ifne 61
      // 1b: goto 22
      // 1e: invokestatic osf.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield osf.mxp Lha9;
      // 25: ifnull 60
      // 28: goto 2f
      // 2b: invokestatic osf.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 2
      // 31: ifne 61
      // 34: goto 3b
      // 37: invokestatic osf.a (Loov;)Loov;
      // 3a: athrow
      // 3b: getfield osf.uwx Lj7z;
      // 3e: ifnull 60
      // 41: goto 48
      // 44: invokestatic osf.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: getfield osf.uwx Lj7z;
      // 4c: aload 0
      // 4d: getfield osf.mxp Lha9;
      // 50: invokevirtual ha9.noc ()Ljava/lang/String;
      // 53: bipush -5
      // 55: invokevirtual j7z.ec4 (Ljava/lang/String;I)I
      // 58: pop
      // 59: goto 60
      // 5c: invokestatic osf.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: aload 1
      // 62: invokespecial __a.owu (Lofh;)V
      // 65: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8802625952016420415L, -7459056293123531584L, MethodHandles.lookup().lookupClass()).a(163893437076312L);
      // $VF: monitorexit
      d = var10000;
      long var0 = d ^ 31752878618860L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "\u0017Ë·ø\u001eA\rHÈ\u0011dÚ%æ1\u001a[\u0005\bÛ\u009eUÂÌ`[ò\u00adB2Îc«}\u000fÆ\u0095»i\u008b(\u008a\u0000]\u009c'\u0097FK«â\\\u0010æu{\u009am<\u0081\u0098LÅ\u0085\"\u0095êØ4 æj\u0091\u001fë¬E&dPï +Å\u0084\u0011wï·Ó\\\u0081þ\u0090\u0013\u000f\u001fXæ´x\u0005 Í?\u0087Î( vñÙÐ\\(\u0012Úôt\u0096Ì¯Ô\u008dÑ\fÁVçð&;æº²¬þ´Þ\u0007\b¦3\u0083×}\tº\"g\u008bE(\u009b» \u0017Y\bTC\u009d=c\u008eÝë9üç +\u000b¥Ð\u0088Ôü\u0083ygzÕ9g¹!P";
      int var8 = "\u0017Ë·ø\u001eA\rHÈ\u0011dÚ%æ1\u001a[\u0005\bÛ\u009eUÂÌ`[ò\u00adB2Îc«}\u000fÆ\u0095»i\u008b(\u008a\u0000]\u009c'\u0097FK«â\\\u0010æu{\u009am<\u0081\u0098LÅ\u0085\"\u0095êØ4 æj\u0091\u001fë¬E&dPï +Å\u0084\u0011wï·Ó\\\u0081þ\u0090\u0013\u000f\u001fXæ´x\u0005 Í?\u0087Î( vñÙÐ\\(\u0012Úôt\u0096Ì¯Ô\u008dÑ\fÁVçð&;æº²¬þ´Þ\u0007\b¦3\u0083×}\tº\"g\u008bE(\u009b» \u0017Y\bTC\u009d=c\u008eÝë9üç +\u000b¥Ð\u0088Ôü\u0083ygzÕ9g¹!P"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = f(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     t = var9;
                     u = new String[7];
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

                  var6 = "Õÿ\u000b=UgL\u0080M_\u009d\f¹Þ\u001eK\u00872¯\u0013Ðå§ûÀL®c»Ì4PE\u008c?ªªx\u0001\u008e(Ã\u0090·jIçyHíæëuAìX¢üj'%x$X¬¹\u0006bÃå\fMO\u0086k\u0014*\rÇ\u000fË";
                  var8 = "Õÿ\u000b=UgL\u0080M_\u009d\f¹Þ\u001eK\u00872¯\u0013Ðå§ûÀL®c»Ì4PE\u008c?ªªx\u0001\u008e(Ã\u0090·jIçyHíæëuAìX¢üj'%x$X¬¹\u0006bÃå\fMO\u0086k\u0014*\rÇ\u000fË"
                     .length();
                  var5 = '(';
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

   private static String f(byte[] var0) {
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

   private static String e(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13201;
      if (u[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])v.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("osf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = t[var5].getBytes("ISO-8859-1");
         u[var5] = f(((Cipher)var4[0]).doFinal(var9));
      }

      return u[var5];
   }

   private static Object e(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite e(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("e".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("osf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
