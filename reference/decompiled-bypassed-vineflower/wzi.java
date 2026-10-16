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

public abstract class wzi extends e0x {
   public static final qx_ d61;
   public static final h76 ear;
   private final boolean jl7;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public wzi(boolean var1) {
      super(p3y.f20);
      this.y8l(this._8_.c32().zvi(d61, vt2.z9q).zvi(ear, false));
      this._p_(true);
      this.i3l(uja.yj_);
      this.jl7 = var1;
   }

   @Override
   public nh4 m__(t9d var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public int odp(t9d var1) {
      int var2 = t9d.b();

      try {
         if (var2 == 0) {
            return this.jl7;
         }

         if (this.jl7) {
            return 30;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return 20;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean d9o(t9d var1, mew var2, vt2 var3) {
      return bnn(var1, var2, var3.b4b());
   }

   @Override
   public boolean ctq(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic vt2.values ()[Lvt2;
      // 03: astore 4
      // 05: invokestatic t9d.b ()I
      // 08: aload 4
      // 0a: arraylength
      // 0b: istore 5
      // 0d: istore 3
      // 0e: bipush 0
      // 0f: istore 6
      // 11: iload 6
      // 13: iload 5
      // 15: if_icmpge 4c
      // 18: aload 4
      // 1a: iload 6
      // 1c: aaload
      // 1d: astore 7
      // 1f: iload 3
      // 20: ifeq 48
      // 23: aload 1
      // 24: aload 2
      // 25: aload 7
      // 27: invokestatic wzi.bnn (Lt9d;Lmew;Lvt2;)Z
      // 2a: iload 3
      // 2b: ifeq 4d
      // 2e: goto 35
      // 31: invokestatic wzi.a (Loov;)Loov;
      // 34: athrow
      // 35: ifeq 45
      // 38: goto 3f
      // 3b: invokestatic wzi.a (Loov;)Loov;
      // 3e: athrow
      // 3f: bipush 1
      // 40: ireturn
      // 41: invokestatic wzi.a (Loov;)Loov;
      // 44: athrow
      // 45: iinc 6 1
      // 48: iload 3
      // 49: ifne 11
      // 4c: bipush 0
      // 4d: ireturn
   }

   public static boolean bnn(t9d var0, mew var1, vt2 var2) {
      mew var3 = var1.offset(var2);

      try {
         if (var2 == vt2.m3r) {
            return t9d.r3_(var0, var3);
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var0.getBlockState(var3).r_y().y0n();
   }

   @Override
   public zfz qk_(t9d var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, g_3 var8) {
      try {
         if (bnn(var1, var2, var3.b4b())) {
            return this.l4i().zvi(d61, var3).zvi(ear, false);
         }
      } catch (oov var9) {
         throw a(var9);
      }

      return this.l4i().zvi(d61, vt2.m3r).zvi(ear, false);
   }

   @Override
   public void z3l(t9d param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: invokespecial wzi.lhf (Lt9d;Lmew;Lzfz;)Z
      // 0c: iload 5
      // 0e: ifeq 36
      // 11: ifeq 5a
      // 14: goto 1b
      // 17: invokestatic wzi.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: aload 2
      // 1d: aload 3
      // 1e: getstatic wzi.d61 Lqx_;
      // 21: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 26: checkcast vt2
      // 29: invokevirtual vt2.b4b ()Lvt2;
      // 2c: invokestatic wzi.bnn (Lt9d;Lmew;Lvt2;)Z
      // 2f: goto 36
      // 32: invokestatic wzi.a (Loov;)Loov;
      // 35: athrow
      // 36: iload 5
      // 38: ifeq 59
      // 3b: ifne 5a
      // 3e: goto 45
      // 41: invokestatic wzi.a (Loov;)Loov;
      // 44: athrow
      // 45: aload 0
      // 46: aload 1
      // 47: aload 2
      // 48: aload 3
      // 49: bipush 0
      // 4a: invokevirtual wzi.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 4d: aload 1
      // 4e: aload 2
      // 4f: invokevirtual t9d.i6x (Lmew;)Z
      // 52: goto 59
      // 55: invokestatic wzi.a (Loov;)Loov;
      // 58: athrow
      // 59: pop
      // 5a: return
   }

   private boolean lhf(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual wzi.ctq (Lt9d;Lmew;)Z
      // 0b: iload 4
      // 0d: ifne 2f
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic wzi.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: ireturn
      // 1c: invokestatic wzi.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: aload 2
      // 23: aload 3
      // 24: bipush 0
      // 25: invokevirtual wzi.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 28: aload 1
      // 29: aload 2
      // 2a: invokevirtual t9d.i6x (Lmew;)Z
      // 2d: pop
      // 2e: bipush 0
      // 2f: ireturn
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.ucd(var1.getBlockState(var2));
   }

   private void ucd(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getstatic wzi.d61 Lqx_;
      // 004: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 009: checkcast vt2
      // 00c: astore 3
      // 00d: invokestatic t9d.c ()I
      // 010: aload 1
      // 011: getstatic wzi.ear Lh76;
      // 014: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 019: checkcast java/lang/Boolean
      // 01c: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 01f: istore 4
      // 021: ldc 0.25
      // 023: nop
      // 024: fstore 5
      // 026: istore 2
      // 027: ldc 0.375
      // 029: nop
      // 02a: fstore 6
      // 02c: iload 4
      // 02e: iload 2
      // 02f: ifne 03d
      // 032: ifeq 040
      // 035: goto 03c
      // 038: invokestatic wzi.a (Loov;)Loov;
      // 03b: athrow
      // 03c: bipush 1
      // 03d: goto 041
      // 040: bipush 2
      // 041: i2f
      // 042: ldc 16.0
      // 044: nop
      // 045: fdiv
      // 046: fstore 7
      // 048: ldc 0.125
      // 04a: nop
      // 04b: fstore 8
      // 04d: ldc 0.1875
      // 04f: nop
      // 050: fstore 9
      // 052: iload 2
      // 053: ifne 0a2
      // 056: getstatic wzi$1.g3d [I
      // 059: aload 3
      // 05a: invokevirtual vt2.ordinal ()I
      // 05d: iaload
      // 05e: tableswitch 226 1 6 42 72 104 134 166 198
      // 084: invokestatic wzi.a (Loov;)Loov;
      // 087: athrow
      // 088: aload 0
      // 089: fconst_0
      // 08a: ldc 0.375
      // 08c: nop
      // 08d: ldc 0.3125
      // 08f: nop
      // 090: fload 7
      // 092: ldc 0.625
      // 094: nop
      // 095: ldc 0.6875
      // 097: nop
      // 098: invokevirtual wzi.xl4 (FFFFFF)V
      // 09b: goto 0a2
      // 09e: invokestatic wzi.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: iload 2
      // 0a3: ifeq 140
      // 0a6: aload 0
      // 0a7: fconst_1
      // 0a8: fload 7
      // 0aa: fsub
      // 0ab: ldc 0.375
      // 0ad: nop
      // 0ae: ldc 0.3125
      // 0b0: nop
      // 0b1: fconst_1
      // 0b2: ldc 0.625
      // 0b4: nop
      // 0b5: ldc 0.6875
      // 0b7: nop
      // 0b8: invokevirtual wzi.xl4 (FFFFFF)V
      // 0bb: iload 2
      // 0bc: ifeq 140
      // 0bf: goto 0c6
      // 0c2: invokestatic wzi.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: ldc 0.3125
      // 0c9: nop
      // 0ca: ldc 0.375
      // 0cc: nop
      // 0cd: fconst_0
      // 0ce: ldc 0.6875
      // 0d0: nop
      // 0d1: ldc 0.625
      // 0d3: nop
      // 0d4: fload 7
      // 0d6: invokevirtual wzi.xl4 (FFFFFF)V
      // 0d9: iload 2
      // 0da: ifeq 140
      // 0dd: goto 0e4
      // 0e0: invokestatic wzi.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: aload 0
      // 0e5: ldc 0.3125
      // 0e7: nop
      // 0e8: ldc 0.375
      // 0ea: nop
      // 0eb: fconst_1
      // 0ec: fload 7
      // 0ee: fsub
      // 0ef: ldc 0.6875
      // 0f1: nop
      // 0f2: ldc 0.625
      // 0f4: nop
      // 0f5: fconst_1
      // 0f6: invokevirtual wzi.xl4 (FFFFFF)V
      // 0f9: iload 2
      // 0fa: ifeq 140
      // 0fd: goto 104
      // 100: invokestatic wzi.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 0
      // 105: ldc 0.3125
      // 107: nop
      // 108: fconst_0
      // 109: ldc 0.375
      // 10b: nop
      // 10c: ldc 0.6875
      // 10e: nop
      // 10f: fconst_0
      // 110: fload 7
      // 112: fadd
      // 113: ldc 0.625
      // 115: nop
      // 116: invokevirtual wzi.xl4 (FFFFFF)V
      // 119: iload 2
      // 11a: ifeq 140
      // 11d: goto 124
      // 120: invokestatic wzi.a (Loov;)Loov;
      // 123: athrow
      // 124: aload 0
      // 125: ldc 0.3125
      // 127: nop
      // 128: fconst_1
      // 129: fload 7
      // 12b: fsub
      // 12c: ldc 0.375
      // 12e: nop
      // 12f: ldc 0.6875
      // 131: nop
      // 132: fconst_1
      // 133: ldc 0.625
      // 135: nop
      // 136: invokevirtual wzi.xl4 (FFFFFF)V
      // 139: goto 140
      // 13c: invokestatic wzi.a (Loov;)Loov;
      // 13f: athrow
      // 140: return
   }

   @Override
   public boolean cl2(t9d param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic wzi.b J
      // 03: ldc2_w 72734762440262
      // 06: lxor
      // 07: lstore 9
      // 09: invokestatic t9d.c ()I
      // 0c: istore 11
      // 0e: aload 3
      // 0f: getstatic wzi.ear Lh76;
      // 12: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 17: checkcast java/lang/Boolean
      // 1a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1d: iload 11
      // 1f: ifne 9e
      // 22: ifeq 32
      // 25: goto 2c
      // 28: invokestatic wzi.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: ireturn
      // 2e: invokestatic wzi.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: aload 2
      // 34: aload 3
      // 35: getstatic wzi.ear Lh76;
      // 38: bipush 1
      // 39: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3c: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 41: bipush 3
      // 42: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 45: pop
      // 46: aload 1
      // 47: aload 2
      // 48: aload 2
      // 49: invokevirtual t9d.bi9 (Lmew;Lmew;)V
      // 4c: aload 1
      // 4d: aload 2
      // 4e: invokevirtual mew.getX ()I
      // 51: i2d
      // 52: ldc2_w 0.5
      // 55: dadd
      // 56: aload 2
      // 57: invokevirtual mew.getY ()I
      // 5a: i2d
      // 5b: ldc2_w 0.5
      // 5e: dadd
      // 5f: aload 2
      // 60: invokevirtual mew.getZ ()I
      // 63: i2d
      // 64: ldc2_w 0.5
      // 67: dadd
      // 68: sipush 23722
      // 6b: ldc2_w 8011990868935687546
      // 6e: lload 9
      // 70: lxor
      // 71: invokedynamic y (IJ)Ljava/lang/String; bsm=wzi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 76: nop
      // 77: ldc 0.3
      // 79: nop
      // 7a: ldc 0.6
      // 7c: nop
      // 7d: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 80: aload 0
      // 81: aload 1
      // 82: aload 2
      // 83: aload 3
      // 84: getstatic wzi.d61 Lqx_;
      // 87: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 8c: checkcast vt2
      // 8f: invokespecial wzi._p0 (Lt9d;Lmew;Lvt2;)V
      // 92: aload 1
      // 93: aload 2
      // 94: aload 0
      // 95: aload 0
      // 96: aload 1
      // 97: invokevirtual wzi.odp (Lt9d;)I
      // 9a: invokevirtual t9d.cjk (Lmew;Le0x;I)V
      // 9d: bipush 1
      // 9e: ireturn
   }

   @Override
   public void b8f(t9d var1, mew var2, zfz var3) {
      try {
         if ((Boolean)var3.dil(ear)) {
            this._p0(var1, var2, (vt2)var3.dil(d61));
         }
      } catch (oov var4) {
         throw a(var4);
      }

      super.b8f(var1, var2, var3);
   }

   @Override
   public int gpi(m5n var1, mew var2, zfz var3, vt2 var4) {
      int var5 = t9d.b();

      try {
         byte var10000 = (Boolean)var3.dil(ear);
         if (var5 == 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 15;
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return 0;
   }

   @Override
   public int sqt(m5n param1, mew param2, zfz param3, vt2 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 3
      // 06: getstatic wzi.ear Lh76;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Boolean
      // 11: iload 5
      // 13: ifne 34
      // 16: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19: ifne 2b
      // 1c: goto 23
      // 1f: invokestatic wzi.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 0
      // 24: goto 43
      // 27: invokestatic wzi.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 3
      // 2c: getstatic wzi.d61 Lqx_;
      // 2f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 34: aload 4
      // 36: if_acmpne 42
      // 39: bipush 15
      // 3b: goto 43
      // 3e: invokestatic wzi.a (Loov;)Loov;
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
   }

   @Override
   public boolean scl() {
      return true;
   }

   @Override
   public void ff3(t9d var1, mew var2, zfz var3, Random var4) {
   }

   @Override
   public void zvy(t9d param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic wzi.b J
      // 03: ldc2_w 73222038415494
      // 06: lxor
      // 07: lstore 5
      // 09: invokestatic t9d.c ()I
      // 0c: istore 7
      // 0e: aload 1
      // 0f: getfield t9d.v0f Z
      // 12: iload 7
      // 14: ifne 37
      // 17: ifne d9
      // 1a: goto 21
      // 1d: invokestatic wzi.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 3
      // 22: getstatic wzi.ear Lh76;
      // 25: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2a: checkcast java/lang/Boolean
      // 2d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 30: goto 37
      // 33: invokestatic wzi.a (Loov;)Loov;
      // 36: athrow
      // 37: iload 7
      // 39: ifne 51
      // 3c: ifeq d9
      // 3f: goto 46
      // 42: invokestatic wzi.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 0
      // 47: getfield wzi.jl7 Z
      // 4a: goto 51
      // 4d: invokestatic wzi.a (Loov;)Loov;
      // 50: athrow
      // 51: iload 7
      // 53: ifne 8c
      // 56: ifeq 73
      // 59: goto 60
      // 5c: invokestatic wzi.a (Loov;)Loov;
      // 5f: athrow
      // 60: aload 0
      // 61: aload 1
      // 62: aload 2
      // 63: aload 3
      // 64: invokespecial wzi.xp_ (Lt9d;Lmew;Lzfz;)V
      // 67: iload 7
      // 69: ifeq d9
      // 6c: goto 73
      // 6f: invokestatic wzi.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 1
      // 74: aload 2
      // 75: aload 3
      // 76: getstatic wzi.ear Lh76;
      // 79: bipush 0
      // 7a: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 7d: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 82: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 85: goto 8c
      // 88: invokestatic wzi.a (Loov;)Loov;
      // 8b: athrow
      // 8c: pop
      // 8d: aload 0
      // 8e: aload 1
      // 8f: aload 2
      // 90: aload 3
      // 91: getstatic wzi.d61 Lqx_;
      // 94: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 99: checkcast vt2
      // 9c: invokespecial wzi._p0 (Lt9d;Lmew;Lvt2;)V
      // 9f: aload 1
      // a0: aload 2
      // a1: invokevirtual mew.getX ()I
      // a4: i2d
      // a5: ldc2_w 0.5
      // a8: dadd
      // a9: aload 2
      // aa: invokevirtual mew.getY ()I
      // ad: i2d
      // ae: ldc2_w 0.5
      // b1: dadd
      // b2: aload 2
      // b3: invokevirtual mew.getZ ()I
      // b6: i2d
      // b7: ldc2_w 0.5
      // ba: dadd
      // bb: sipush 16501
      // be: ldc2_w 1379993554315140964
      // c1: lload 5
      // c3: lxor
      // c4: invokedynamic y (IJ)Ljava/lang/String; bsm=wzi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c9: nop
      // ca: ldc 0.3
      // cc: nop
      // cd: ldc 0.5
      // cf: nop
      // d0: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // d3: aload 1
      // d4: aload 2
      // d5: aload 2
      // d6: invokevirtual t9d.bi9 (Lmew;Lmew;)V
      // d9: return
   }

   @Override
   public void bf6() {
      float var1 = 0.1875F;
      float var2 = 0.125F;
      float var3 = 0.125F;
      this.xl4(0.5F - var1, 0.5F - var2, 0.5F - var3, 0.5F + var1, 0.5F + var2, 0.5F + var3);
   }

   @Override
   public void n9e(t9d param1, mew param2, zfz param3, i2h param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield t9d.v0f Z
      // 09: iload 5
      // 0b: ifeq 23
      // 0e: ifne 59
      // 11: goto 18
      // 14: invokestatic wzi.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 0
      // 19: getfield wzi.jl7 Z
      // 1c: goto 23
      // 1f: invokestatic wzi.a (Loov;)Loov;
      // 22: athrow
      // 23: iload 5
      // 25: ifeq 48
      // 28: ifeq 59
      // 2b: goto 32
      // 2e: invokestatic wzi.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 3
      // 33: getstatic wzi.ear Lh76;
      // 36: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 3b: checkcast java/lang/Boolean
      // 3e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 41: goto 48
      // 44: invokestatic wzi.a (Loov;)Loov;
      // 47: athrow
      // 48: ifne 59
      // 4b: aload 0
      // 4c: aload 1
      // 4d: aload 2
      // 4e: aload 3
      // 4f: invokespecial wzi.xp_ (Lt9d;Lmew;Lzfz;)V
      // 52: goto 59
      // 55: invokestatic wzi.a (Loov;)Loov;
      // 58: athrow
      // 59: return
   }

   private void xp_(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic wzi.b J
      // 003: ldc2_w 75930231822464
      // 006: lxor
      // 007: lstore 4
      // 009: aload 0
      // 00a: aload 3
      // 00b: invokespecial wzi.ucd (Lzfz;)V
      // 00e: invokestatic t9d.b ()I
      // 011: aload 1
      // 012: ldc hy9
      // 014: nop
      // 015: new nh4
      // 018: dup
      // 019: aload 2
      // 01a: invokevirtual mew.getX ()I
      // 01d: i2d
      // 01e: aload 0
      // 01f: getfield wzi.d80 D
      // 022: dadd
      // 023: aload 2
      // 024: invokevirtual mew.getY ()I
      // 027: i2d
      // 028: aload 0
      // 029: getfield wzi.tcq D
      // 02c: dadd
      // 02d: aload 2
      // 02e: invokevirtual mew.getZ ()I
      // 031: i2d
      // 032: aload 0
      // 033: getfield wzi.iac D
      // 036: dadd
      // 037: aload 2
      // 038: invokevirtual mew.getX ()I
      // 03b: i2d
      // 03c: aload 0
      // 03d: getfield wzi.smy D
      // 040: dadd
      // 041: aload 2
      // 042: invokevirtual mew.getY ()I
      // 045: i2d
      // 046: aload 0
      // 047: getfield wzi.lpg D
      // 04a: dadd
      // 04b: aload 2
      // 04c: invokevirtual mew.getZ ()I
      // 04f: i2d
      // 050: aload 0
      // 051: getfield wzi.nlu D
      // 054: dadd
      // 055: invokespecial nh4.<init> (DDDDDD)V
      // 058: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 05b: astore 7
      // 05d: istore 6
      // 05f: aload 7
      // 061: invokeinterface java/util/List.isEmpty ()Z 1
      // 066: iload 6
      // 068: ifeq 076
      // 06b: ifne 079
      // 06e: goto 075
      // 071: invokestatic wzi.a (Loov;)Loov;
      // 074: athrow
      // 075: bipush 1
      // 076: goto 07a
      // 079: bipush 0
      // 07a: istore 8
      // 07c: aload 3
      // 07d: getstatic wzi.ear Lh76;
      // 080: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 085: checkcast java/lang/Boolean
      // 088: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 08b: istore 9
      // 08d: iload 8
      // 08f: iload 6
      // 091: ifeq 11e
      // 094: ifeq 11c
      // 097: goto 09e
      // 09a: invokestatic wzi.a (Loov;)Loov;
      // 09d: athrow
      // 09e: iload 9
      // 0a0: iload 6
      // 0a2: ifeq 11e
      // 0a5: goto 0ac
      // 0a8: invokestatic wzi.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: ifne 11c
      // 0af: goto 0b6
      // 0b2: invokestatic wzi.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 1
      // 0b7: aload 2
      // 0b8: aload 3
      // 0b9: getstatic wzi.ear Lh76;
      // 0bc: bipush 1
      // 0bd: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c0: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0c5: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 0c8: pop
      // 0c9: aload 0
      // 0ca: aload 1
      // 0cb: aload 2
      // 0cc: aload 3
      // 0cd: getstatic wzi.d61 Lqx_;
      // 0d0: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0d5: checkcast vt2
      // 0d8: invokespecial wzi._p0 (Lt9d;Lmew;Lvt2;)V
      // 0db: aload 1
      // 0dc: aload 2
      // 0dd: aload 2
      // 0de: invokevirtual t9d.bi9 (Lmew;Lmew;)V
      // 0e1: aload 1
      // 0e2: aload 2
      // 0e3: invokevirtual mew.getX ()I
      // 0e6: i2d
      // 0e7: ldc2_w 0.5
      // 0ea: dadd
      // 0eb: aload 2
      // 0ec: invokevirtual mew.getY ()I
      // 0ef: i2d
      // 0f0: ldc2_w 0.5
      // 0f3: dadd
      // 0f4: aload 2
      // 0f5: invokevirtual mew.getZ ()I
      // 0f8: i2d
      // 0f9: ldc2_w 0.5
      // 0fc: dadd
      // 0fd: sipush 23722
      // 100: ldc2_w 8011983000533660604
      // 103: lload 4
      // 105: lxor
      // 106: invokedynamic y (IJ)Ljava/lang/String; bsm=wzi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10b: nop
      // 10c: ldc 0.3
      // 10e: nop
      // 10f: ldc 0.6
      // 111: nop
      // 112: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 115: goto 11c
      // 118: invokestatic wzi.a (Loov;)Loov;
      // 11b: athrow
      // 11c: iload 8
      // 11e: iload 6
      // 120: ifeq 1ad
      // 123: ifne 1ab
      // 126: goto 12d
      // 129: invokestatic wzi.a (Loov;)Loov;
      // 12c: athrow
      // 12d: iload 9
      // 12f: iload 6
      // 131: ifeq 1ad
      // 134: goto 13b
      // 137: invokestatic wzi.a (Loov;)Loov;
      // 13a: athrow
      // 13b: ifeq 1ab
      // 13e: goto 145
      // 141: invokestatic wzi.a (Loov;)Loov;
      // 144: athrow
      // 145: aload 1
      // 146: aload 2
      // 147: aload 3
      // 148: getstatic wzi.ear Lh76;
      // 14b: bipush 0
      // 14c: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 14f: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 154: invokevirtual t9d.gfy (Lmew;Lzfz;)Z
      // 157: pop
      // 158: aload 0
      // 159: aload 1
      // 15a: aload 2
      // 15b: aload 3
      // 15c: getstatic wzi.d61 Lqx_;
      // 15f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 164: checkcast vt2
      // 167: invokespecial wzi._p0 (Lt9d;Lmew;Lvt2;)V
      // 16a: aload 1
      // 16b: aload 2
      // 16c: aload 2
      // 16d: invokevirtual t9d.bi9 (Lmew;Lmew;)V
      // 170: aload 1
      // 171: aload 2
      // 172: invokevirtual mew.getX ()I
      // 175: i2d
      // 176: ldc2_w 0.5
      // 179: dadd
      // 17a: aload 2
      // 17b: invokevirtual mew.getY ()I
      // 17e: i2d
      // 17f: ldc2_w 0.5
      // 182: dadd
      // 183: aload 2
      // 184: invokevirtual mew.getZ ()I
      // 187: i2d
      // 188: ldc2_w 0.5
      // 18b: dadd
      // 18c: sipush 23722
      // 18f: ldc2_w 8011983000533660604
      // 192: lload 4
      // 194: lxor
      // 195: invokedynamic y (IJ)Ljava/lang/String; bsm=wzi.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: nop
      // 19b: ldc 0.3
      // 19d: nop
      // 19e: ldc 0.5
      // 1a0: nop
      // 1a1: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 1a4: goto 1ab
      // 1a7: invokestatic wzi.a (Loov;)Loov;
      // 1aa: athrow
      // 1ab: iload 8
      // 1ad: ifeq 1c2
      // 1b0: aload 1
      // 1b1: aload 2
      // 1b2: aload 0
      // 1b3: aload 0
      // 1b4: aload 1
      // 1b5: invokevirtual wzi.odp (Lt9d;)I
      // 1b8: invokevirtual t9d.cjk (Lmew;Le0x;I)V
      // 1bb: goto 1c2
      // 1be: invokestatic wzi.a (Loov;)Loov;
      // 1c1: athrow
      // 1c2: return
   }

   private void _p0(t9d var1, mew var2, vt2 var3) {
      var1._0o(var2, this);
      var1._0o(var2.offset(var3.b4b()), this);
   }

   @Override
   public zfz kig(int var1) {
      int var2 = t9d.b();
      vt2 var3;
      switch (var1 & 7) {
         case 0:
            var3 = vt2.m3r;
            if (var2 != 0) {
               break;
            }
         case 1:
            var3 = vt2.zk4;
            if (var2 != 0) {
               break;
            }
         case 2:
            var3 = vt2.te4;
            if (var2 != 0) {
               break;
            }
         case 3:
            var3 = vt2.mxp;
            if (var2 != 0) {
               break;
            }
         case 4:
            var3 = vt2.z9q;
            if (var2 != 0) {
               break;
            }
         case 5:
         default:
            var3 = vt2.rf3;
      }

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i().zvi(d61, var3);
         var10001 = ear;
         int var10002 = var1 & 8;
         if (var2 == 0) {
            return var10000.zvi(ear, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(ear, true);
         }
      } catch (oov var4) {
         throw a(var4);
      }

      return var10000.zvi(var10001, false);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public int hvp(zfz var1) {
      int var2 = t9d.b();

      int var3;
      label75: {
         int var10000;
         label84: {
            label79: {
               label71: {
                  label70: {
                     label69: {
                        label68: {
                           try {
                              var10000 = wzi$1.g3d[((vt2)var1.dil(d61)).ordinal()];
                              if (var2 == 0) {
                                 break label84;
                              }

                              switch (var10000) {
                                 case 1:
                                    break;
                                 case 2:
                                    break label68;
                                 case 3:
                                    break label69;
                                 case 4:
                                    break label70;
                                 case 5:
                                 default:
                                    break label71;
                                 case 6:
                                    break label79;
                              }
                           } catch (oov var7) {
                              throw a(var7);
                           }

                           var3 = 1;
                           if (var2 != 0) {
                              break label75;
                           }
                        }

                        var3 = 2;
                        if (var2 != 0) {
                           break label75;
                        }
                     }

                     var3 = 3;
                     if (var2 != 0) {
                        break label75;
                     }
                  }

                  var3 = 4;
                  if (var2 != 0) {
                     break label75;
                  }
               }

               var3 = 5;

               try {
                  if (var2 != 0) {
                     break label75;
                  }
               } catch (oov var6) {
                  boolean var10001 = false;
                  throw a(var6);
               }
            }

            try {
               var10000 = 0;
            } catch (oov var5) {
               boolean var10 = false;
               throw a(var5);
            }
         }

         var3 = var10000;
      }

      try {
         byte var9 = (Boolean)var1.dil(ear);
         if (var2 == 0) {
            return var9;
         }

         if (var9 == 0) {
            return var3;
         }
      } catch (oov var4) {
         throw a(var4);
      }

      var3 |= 8;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{d61, ear});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-8178219102400403000L, -5620368080199412855L, MethodHandles.lookup().lookupClass()).a(73344240751679L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 10740986877106L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[4];
      int var5 = 0;
      String var4 = "z1*\u001658;âT\r\u0099\u000e«\tÆøý\u0007Îµ§qåc\u008aúF]ZQã\u0096 mX\u0010%\\2aÔÀè\u0010~\u000b¼ü\u0097B@z5.¬\u0007\u0006¢pzäDc\u009dO";
      int var6 = "z1*\u001658;âT\r\u0099\u000e«\tÆøý\u0007Îµ§qåc\u008aúF]ZQã\u0096 mX\u0010%\\2aÔÀè\u0010~\u000b¼ü\u0097B@z5.¬\u0007\u0006¢pzäDc\u009dO"
         .length();
      char var3 = ' ';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = b(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     d = var7;
                     h = new String[4];
                     d61 = qx_.jap(b<"y">(23108, 6187913497977764195L ^ var9));
                     ear = h76.d_1(b<"y">(18074, 5589127608832927164L ^ var9));
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "«UÌ%ýdm\u009b¤\u0010\u0018b\u00ad\u001d4\u000e\u0010¤C¤É\u0090ÑâIìþ~Û\u0016_ÄÃ";
                  var6 = "«UÌ%ýdm\u009b¤\u0010\u0018b\u00ad\u001d4\u000e\u0010¤C¤É\u0090ÑâIìþ~Û\u0016_ÄÃ".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18789;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("wzi", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("wzi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
