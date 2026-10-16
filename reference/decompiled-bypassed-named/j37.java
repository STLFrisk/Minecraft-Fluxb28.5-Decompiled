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

public abstract class j37 extends dms implements w55 {
   public e0x n17 = ox_.l11;
   private static final long g;
   private static final String[] v;
   private static final String[] w;
   private static final Map x = new HashMap(13);

   public j37(OpaquePredicate var1) {
      super(var1);
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 23
      // 09: invokevirtual j37.ktm ()I
      // 0c: ifeq 22
      // 0f: goto 16
      // 12: invokestatic j37.d (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: bipush 0
      // 18: putfield j37.tmq I
      // 1b: goto 22
      // 1e: invokestatic j37.d (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: invokespecial dms.qar ()V
      // 26: return
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokespecial dms.e_a ()V
      // 08: aload 0
      // 09: invokevirtual j37.ktm ()I
      // 0c: iload 1
      // 0d: ifne 2a
      // 10: ifeq 26
      // 13: goto 1a
      // 16: invokestatic j37.d (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: bipush 0
      // 1c: putfield j37.tmq I
      // 1f: goto 26
      // 22: invokestatic j37.d (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: getfield j37.tmq I
      // 2a: iload 1
      // 2b: ifne 5b
      // 2e: ifle e0
      // 31: goto 38
      // 34: invokestatic j37.d (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: dup
      // 3a: getfield j37.tmq I
      // 3d: bipush 1
      // 3e: isub
      // 3f: putfield j37.tmq I
      // 42: aload 0
      // 43: iload 1
      // 44: ifne 5f
      // 47: goto 4e
      // 4a: invokestatic j37.d (Loov;)Loov;
      // 4d: athrow
      // 4e: getfield j37.tmq I
      // 51: bipush 10
      // 53: irem
      // 54: goto 5b
      // 57: invokestatic j37.d (Loov;)Loov;
      // 5a: athrow
      // 5b: ifne e0
      // 5e: aload 0
      // 5f: getfield j37.z2d Ljava/util/Random;
      // 62: invokevirtual java/util/Random.nextGaussian ()D
      // 65: ldc2_w 0.02
      // 68: dmul
      // 69: dstore 2
      // 6a: aload 0
      // 6b: getfield j37.z2d Ljava/util/Random;
      // 6e: invokevirtual java/util/Random.nextGaussian ()D
      // 71: ldc2_w 0.02
      // 74: dmul
      // 75: dstore 4
      // 77: aload 0
      // 78: getfield j37.z2d Ljava/util/Random;
      // 7b: invokevirtual java/util/Random.nextGaussian ()D
      // 7e: ldc2_w 0.02
      // 81: dmul
      // 82: dstore 6
      // 84: aload 0
      // 85: getfield j37.oay Lt9d;
      // 88: getstatic w_0.mwm Lw_0;
      // 8b: aload 0
      // 8c: getfield j37.o2v D
      // 8f: aload 0
      // 90: getfield j37.z2d Ljava/util/Random;
      // 93: invokevirtual java/util/Random.nextFloat ()F
      // 96: aload 0
      // 97: getfield j37.uo6 F
      // 9a: fmul
      // 9b: fconst_2
      // 9c: fmul
      // 9d: f2d
      // 9e: dadd
      // 9f: aload 0
      // a0: getfield j37.uo6 F
      // a3: f2d
      // a4: dsub
      // a5: aload 0
      // a6: getfield j37.kfp D
      // a9: ldc2_w 0.5
      // ac: dadd
      // ad: aload 0
      // ae: getfield j37.z2d Ljava/util/Random;
      // b1: invokevirtual java/util/Random.nextFloat ()F
      // b4: aload 0
      // b5: getfield j37.ikl F
      // b8: fmul
      // b9: f2d
      // ba: dadd
      // bb: aload 0
      // bc: getfield j37.vbd D
      // bf: aload 0
      // c0: getfield j37.z2d Ljava/util/Random;
      // c3: invokevirtual java/util/Random.nextFloat ()F
      // c6: aload 0
      // c7: getfield j37.uo6 F
      // ca: fmul
      // cb: fconst_2
      // cc: fmul
      // cd: f2d
      // ce: dadd
      // cf: aload 0
      // d0: getfield j37.uo6 F
      // d3: f2d
      // d4: dsub
      // d5: dload 2
      // d6: dload 4
      // d8: dload 6
      // da: bipush 0
      // db: newarray 10
      // dd: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // e0: return
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
      // 06: invokevirtual j37.nss (Lofh;)Z
      // 09: iload 3
      // 0a: ifeq 28
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic j37.d (Loov;)Loov;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic j37.d (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: bipush 0
      // 1f: putfield j37.tmq I
      // 22: aload 0
      // 23: aload 1
      // 24: fload 2
      // 25: invokespecial dms.m1t (Lofh;F)Z
      // 28: ireturn
   }

   @Override
   public float ncy(mew param1) {
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
      // 05: getfield j37.oay Lt9d;
      // 08: aload 1
      // 09: invokevirtual mew.eve ()Lmew;
      // 0c: iload 2
      // 0d: ifne 34
      // 10: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 13: invokeinterface zfz.r_y ()Le0x; 1
      // 18: getstatic ox_.l11 Lx82;
      // 1b: if_acmpne 2f
      // 1e: goto 25
      // 21: invokestatic j37.d (Loov;)Loov;
      // 24: athrow
      // 25: ldc 10.0
      // 27: nop
      // 28: goto 3b
      // 2b: invokestatic j37.d (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield j37.oay Lt9d;
      // 33: aload 1
      // 34: invokevirtual OpaquePredicate.rgh (Lmew;)F
      // 37: ldc 0.5
      // 39: nop
      // 3a: fsub
      // 3b: freturn
   }

   @Override
   public void srs(bdo var1) {
      long var2 = g ^ 25601726845794L;
      super.srs(var1);
      var1.iin(e<"a">(31728, 8434961781997868805L ^ var2), this.tmq);
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = g ^ 107643029618633L;
      super.cjb(var1);
      this.tmq = var1.uz7(e<"a">(31412, 5308959061861464811L ^ var2));
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
      // 00: aload 0
      // 01: getfield j37.o2v D
      // 04: invokestatic fe6.jqf (D)I
      // 07: istore 2
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: aload 0
      // 0c: invokevirtual j37.aaw ()Lnh4;
      // 0f: getfield nh4.bx_ D
      // 12: invokestatic fe6.jqf (D)I
      // 15: istore 3
      // 16: aload 0
      // 17: getfield j37.vbd D
      // 1a: invokestatic fe6.jqf (D)I
      // 1d: istore 4
      // 1f: new mew
      // 22: dup
      // 23: iload 2
      // 24: iload 3
      // 25: iload 4
      // 27: invokespecial mew.<init> (III)V
      // 2a: astore 5
      // 2c: istore 1
      // 2d: aload 0
      // 2e: getfield j37.oay Lt9d;
      // 31: aload 5
      // 33: invokevirtual mew.eve ()Lmew;
      // 36: iload 1
      // 37: ifne 5d
      // 3a: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 3d: invokeinterface zfz.r_y ()Le0x; 1
      // 42: aload 0
      // 43: getfield j37.n17 Le0x;
      // 46: if_acmpne 8d
      // 49: goto 50
      // 4c: invokestatic j37.d (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: getfield j37.oay Lt9d;
      // 54: aload 5
      // 56: goto 5d
      // 59: invokestatic j37.d (Loov;)Loov;
      // 5c: athrow
      // 5d: invokevirtual OpaquePredicate.a2f (Lmew;)I
      // 60: iload 1
      // 61: ifne 7b
      // 64: bipush 8
      // 66: if_icmple 8d
      // 69: goto 70
      // 6c: invokestatic j37.d (Loov;)Loov;
      // 6f: athrow
      // 70: aload 0
      // 71: invokespecial dms.iaw ()Z
      // 74: goto 7b
      // 77: invokestatic j37.d (Loov;)Loov;
      // 7a: athrow
      // 7b: iload 1
      // 7c: ifne 8a
      // 7f: ifeq 8d
      // 82: goto 89
      // 85: invokestatic j37.d (Loov;)Loov;
      // 88: athrow
      // 89: bipush 1
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: ireturn
   }

   @Override
   public int u8h() {
      return 120;
   }

   @Override
   public boolean kz3() {
      return false;
   }

   @Override
   public int _96(ha9 var1) {
      return 1 + this.oay.fsy.nextInt(3);
   }

   public boolean _cv(erg param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic j37.d (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 2e
      // 17: invokestatic j37.d (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual erg.gn1 ()Lu7m;
      // 1f: getstatic xbr.iqq Lu7m;
      // 22: if_acmpne 2d
      // 25: bipush 1
      // 26: goto 2e
      // 29: invokestatic j37.d (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getfield ha9.up_ Ljnq;
      // 08: invokevirtual jnq.dxs ()Lerg;
      // 0b: astore 3
      // 0c: aload 3
      // 0d: ifnull b8
      // 10: aload 0
      // 11: aload 3
      // 12: invokevirtual j37._cv (Lerg;)Z
      // 15: iload 2
      // 16: ifeq 71
      // 19: goto 20
      // 1c: invokestatic j37.d (Loov;)Loov;
      // 1f: athrow
      // 20: ifeq 6d
      // 23: goto 2a
      // 26: invokestatic j37.d (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: invokevirtual j37.ktm ()I
      // 2e: iload 2
      // 2f: ifeq 71
      // 32: goto 39
      // 35: invokestatic j37.d (Loov;)Loov;
      // 38: athrow
      // 39: ifne 6d
      // 3c: goto 43
      // 3f: invokestatic j37.d (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: getfield j37.tmq I
      // 47: iload 2
      // 48: ifeq 71
      // 4b: goto 52
      // 4e: invokestatic j37.d (Loov;)Loov;
      // 51: athrow
      // 52: ifgt 6d
      // 55: goto 5c
      // 58: invokestatic j37.d (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 0
      // 5d: aload 1
      // 5e: aload 3
      // 5f: invokevirtual j37.tuc (Lha9;Lerg;)V
      // 62: aload 0
      // 63: aload 1
      // 64: invokevirtual j37.ukj (Lha9;)V
      // 67: bipush 1
      // 68: ireturn
      // 69: invokestatic j37.d (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: invokevirtual j37.ejl ()Z
      // 71: iload 2
      // 72: ifeq bd
      // 75: ifeq b8
      // 78: goto 7f
      // 7b: invokestatic j37.d (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 0
      // 80: aload 3
      // 81: invokevirtual j37._cv (Lerg;)Z
      // 84: iload 2
      // 85: ifeq bd
      // 88: goto 8f
      // 8b: invokestatic j37.d (Loov;)Loov;
      // 8e: athrow
      // 8f: ifeq b8
      // 92: goto 99
      // 95: invokestatic j37.d (Loov;)Loov;
      // 98: athrow
      // 99: aload 0
      // 9a: aload 1
      // 9b: aload 3
      // 9c: invokevirtual j37.tuc (Lha9;Lerg;)V
      // 9f: aload 0
      // a0: aload 0
      // a1: invokevirtual j37.ktm ()I
      // a4: ineg
      // a5: bipush 20
      // a7: idiv
      // a8: i2f
      // a9: ldc 0.1
      // ab: nop
      // ac: fmul
      // ad: f2i
      // ae: bipush 1
      // af: invokevirtual j37.uj6 (IZ)V
      // b2: bipush 1
      // b3: ireturn
      // b4: invokestatic j37.d (Loov;)Loov;
      // b7: athrow
      // b8: aload 0
      // b9: aload 1
      // ba: invokespecial dms.hp6 (Lha9;)Z
      // bd: ireturn
   }

   public void tuc(ha9 param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 1
      // 05: getfield ha9.lls Lpj2;
      // 08: getfield pj2.g40 Z
      // 0b: iload 3
      // 0c: ifeq 2e
      // 0f: ifne 4a
      // 12: goto 19
      // 15: invokestatic j37.d (Loov;)Loov;
      // 18: athrow
      // 19: aload 2
      // 1a: dup
      // 1b: getfield erg.qd2 I
      // 1e: bipush 1
      // 1f: isub
      // 20: putfield erg.qd2 I
      // 23: aload 2
      // 24: getfield erg.qd2 I
      // 27: goto 2e
      // 2a: invokestatic j37.d (Loov;)Loov;
      // 2d: athrow
      // 2e: ifgt 4a
      // 31: aload 1
      // 32: getfield ha9.up_ Ljnq;
      // 35: aload 1
      // 36: getfield ha9.up_ Ljnq;
      // 39: getfield jnq.nb5 I
      // 3c: aconst_null
      // 3d: checkcast erg
      // 40: invokevirtual jnq.cxl (ILerg;)V
      // 43: goto 4a
      // 46: invokestatic j37.d (Loov;)Loov;
      // 49: athrow
      // 4a: return
   }

   public void ukj(ha9 var1) {
      this.tmq = 600;
      this.tg6 = var1;
      this.oay.qyn(this, (byte)18);
   }

   public ha9 eu1() {
      return this.tg6;
   }

   public boolean j34() {
      int var1 = OpaquePredicate.b();

      try {
         if (var1 == 0) {
            return (boolean)this.tmq;
         }

         if (this.tmq > 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw d(var2);
      }

      return (boolean)0;
   }

   public void udq() {
      this.tmq = 0;
   }

   public boolean qj8(j37 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1d
      // 09: aload 0
      // 0a: if_acmpne 1c
      // 0d: goto 14
      // 10: invokestatic j37.d (Loov;)Loov;
      // 13: athrow
      // 14: bipush 0
      // 15: goto 6a
      // 18: invokestatic j37.d (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: iload 2
      // 1e: ifne 3b
      // 21: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 24: aload 0
      // 25: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 28: if_acmpeq 3a
      // 2b: goto 32
      // 2e: invokestatic j37.d (Loov;)Loov;
      // 31: athrow
      // 32: bipush 0
      // 33: goto 6a
      // 36: invokestatic j37.d (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: invokevirtual j37.j34 ()Z
      // 3e: iload 2
      // 3f: ifne 57
      // 42: ifeq 69
      // 45: goto 4c
      // 48: invokestatic j37.d (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 1
      // 4d: invokevirtual j37.j34 ()Z
      // 50: goto 57
      // 53: invokestatic j37.d (Loov;)Loov;
      // 56: athrow
      // 57: iload 2
      // 58: ifne 66
      // 5b: ifeq 69
      // 5e: goto 65
      // 61: invokestatic j37.d (Loov;)Loov;
      // 64: athrow
      // 65: bipush 1
      // 66: goto 6a
      // 69: bipush 0
      // 6a: ireturn
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
      // 05: iload 2
      // 06: ifne 1d
      // 09: bipush 18
      // 0b: if_icmpne be
      // 0e: goto 15
      // 11: invokestatic j37.d (Loov;)Loov;
      // 14: athrow
      // 15: bipush 0
      // 16: goto 1d
      // 19: invokestatic j37.d (Loov;)Loov;
      // 1c: athrow
      // 1d: istore 3
      // 1e: iload 3
      // 1f: bipush 7
      // 21: if_icmpge ba
      // 24: aload 0
      // 25: getfield j37.z2d Ljava/util/Random;
      // 28: invokevirtual java/util/Random.nextGaussian ()D
      // 2b: ldc2_w 0.02
      // 2e: dmul
      // 2f: dstore 4
      // 31: aload 0
      // 32: getfield j37.z2d Ljava/util/Random;
      // 35: invokevirtual java/util/Random.nextGaussian ()D
      // 38: ldc2_w 0.02
      // 3b: dmul
      // 3c: dstore 6
      // 3e: aload 0
      // 3f: getfield j37.z2d Ljava/util/Random;
      // 42: invokevirtual java/util/Random.nextGaussian ()D
      // 45: ldc2_w 0.02
      // 48: dmul
      // 49: dstore 8
      // 4b: aload 0
      // 4c: getfield j37.oay Lt9d;
      // 4f: getstatic w_0.mwm Lw_0;
      // 52: aload 0
      // 53: getfield j37.o2v D
      // 56: aload 0
      // 57: getfield j37.z2d Ljava/util/Random;
      // 5a: invokevirtual java/util/Random.nextFloat ()F
      // 5d: aload 0
      // 5e: getfield j37.uo6 F
      // 61: fmul
      // 62: fconst_2
      // 63: fmul
      // 64: f2d
      // 65: dadd
      // 66: aload 0
      // 67: getfield j37.uo6 F
      // 6a: f2d
      // 6b: dsub
      // 6c: aload 0
      // 6d: getfield j37.kfp D
      // 70: ldc2_w 0.5
      // 73: dadd
      // 74: aload 0
      // 75: getfield j37.z2d Ljava/util/Random;
      // 78: invokevirtual java/util/Random.nextFloat ()F
      // 7b: aload 0
      // 7c: getfield j37.ikl F
      // 7f: fmul
      // 80: f2d
      // 81: dadd
      // 82: aload 0
      // 83: getfield j37.vbd D
      // 86: aload 0
      // 87: getfield j37.z2d Ljava/util/Random;
      // 8a: invokevirtual java/util/Random.nextFloat ()F
      // 8d: aload 0
      // 8e: getfield j37.uo6 F
      // 91: fmul
      // 92: fconst_2
      // 93: fmul
      // 94: f2d
      // 95: dadd
      // 96: aload 0
      // 97: getfield j37.uo6 F
      // 9a: f2d
      // 9b: dsub
      // 9c: dload 4
      // 9e: dload 6
      // a0: dload 8
      // a2: bipush 0
      // a3: newarray 10
      // a5: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // a8: iinc 3 1
      // ab: iload 2
      // ac: ifne ca
      // af: iload 2
      // b0: ifeq 1e
      // b3: goto ba
      // b6: invokestatic j37.d (Loov;)Loov;
      // b9: athrow
      // ba: iload 2
      // bb: ifeq ca
      // be: aload 0
      // bf: iload 1
      // c0: invokespecial dms.ptf (B)V
      // c3: goto ca
      // c6: invokestatic j37.d (Loov;)Loov;
      // c9: athrow
      // ca: return
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8010143775492757189L, -5327527586015837999L, MethodHandles.lookup().lookupClass()).a(277644271808135L);
      // $VF: monitorexit
      g = var10000;
      long var0 = g ^ 68589819260602L;
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "Xû02\u0084\u0090¢¹¼íÎÌ%\u0002ú\u0003\u0010Q\u001eé§]=sùø£\u000bý\u0081s\u008c\"";
      int var8 = "Xû02\u0084\u0090¢¹¼íÎÌ%\u0002ú\u0003\u0010Q\u001eé§]=sùø£\u000bý\u0081s\u008c\"".length();
      char var5 = 16;
      int var4 = -1;

      while (true) {
         byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
         String var14 = f(var10).intern();
         byte var10001 = -1;
         var9[var7++] = var14;
         if ((var4 += var5) >= var8) {
            v = var9;
            w = new String[2];
            return;
         }

         var5 = var6.charAt(var4);
      }
   }

   private static oov d(oov var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20633;
      if (w[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])x.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               x.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("j37", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = v[var5].getBytes("ISO-8859-1");
         w[var5] = f(((Cipher)var4[0]).doFinal(var9));
      }

      return w[var5];
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
         throw new RuntimeException("j37" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
