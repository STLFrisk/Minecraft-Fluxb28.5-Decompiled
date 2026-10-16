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

public class c9p extends s0i {
   private float ynm;
   private float n38;
   private float thk;
   private float hrr;
   private float ot1;
   private Entity z2n;
   private int m0z;
   private boolean p2n;
   private _tb wjn;
   private static final long c;
   private static final String[] g;
   private static final String[] u;
   private static final Map v = new HashMap(13);

   public c9p(OpaquePredicate var1) {
      super(var1);
      this.dlk = 10;
      this.yxc(0.85F, 0.85F);
      this.r1d.tn8(4, new c9p$kdw(this));
      rap var2;
      this.r1d.tn8(5, var2 = new rap(this, 1.0));
      this.r1d.tn8(7, this.wjn = new _tb(this, 1.0, 80));
      this.r1d.tn8(8, new bdq(this, ha9.class, 8.0F));
      this.r1d.tn8(8, new bdq(this, c9p.class, 12.0F, 0.01F));
      this.r1d.tn8(9, new ov6(this));
      this.wjn.k23(3);
      var2.k23(3);
      this.g9o.tn8(1, new s24(this, Entity.class, 10, true, false, new c9p$rw9(this)));
      this.i1n = new c9p$tyn(this);
      this.n38 = this.ynm = this.z2d.nextFloat();
   }

   @Override
   public void nyy() {
      super.nyy();
      this.dgt(m6d.y3f).zf7(6.0);
      this.dgt(m6d.w7i).zf7(0.5);
      this.dgt(m6d.wg4).zf7(16.0);
      this.dgt(m6d.t9k).zf7(30.0);
   }

   @Override
   public void cjb(bdo var1) {
      long var2 = c ^ 23075967220928L;
      super.cjb(var1);
      this.pfo(var1.dvl(e<"f">(17682, 9142577327425401394L ^ var2)));
   }

   @Override
   public void srs(bdo var1) {
      long var2 = c ^ 108106735112299L;
      super.srs(var1);
      var1.zyu(e<"f">(22838, 9215677243319698110L ^ var2), this.mzk());
   }

   @Override
   public p8a ri_(OpaquePredicate var1) {
      return new hz4(this, var1);
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, 0);
      this.oit.kp2(17, 0);
   }

   private boolean a4o(int var1) {
      int var2 = OpaquePredicate.b();

      try {
         int var10000 = this.oit.zwc(16) & var1;
         if (var2 == 0) {
            return (boolean)var10000;
         }

         if (var10000 != 0) {
            return (boolean)1;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return (boolean)0;
   }

   private void bmx(int param1, boolean param2) {
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
      // 05: getfield c9p.oit Lwl1;
      // 08: bipush 16
      // 0a: invokevirtual wl1.zwc (I)I
      // 0d: istore 4
      // 0f: iload 3
      // 10: ifeq 35
      // 13: iload 2
      // 14: ifeq 39
      // 17: goto 1e
      // 1a: invokestatic c9p.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield c9p.oit Lwl1;
      // 22: bipush 16
      // 24: iload 4
      // 26: iload 1
      // 27: ior
      // 28: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2b: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2e: goto 35
      // 31: invokestatic c9p.a (Loov;)Loov;
      // 34: athrow
      // 35: iload 3
      // 36: ifne 52
      // 39: aload 0
      // 3a: getfield c9p.oit Lwl1;
      // 3d: bipush 16
      // 3f: iload 4
      // 41: iload 1
      // 42: bipush -1
      // 43: ixor
      // 44: iand
      // 45: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 48: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 4b: goto 52
      // 4e: invokestatic c9p.a (Loov;)Loov;
      // 51: athrow
      // 52: return
   }

   public boolean m04() {
      return this.a4o(2);
   }

   private void er9(boolean var1) {
      this.bmx(2, var1);
   }

   public int y3s() {
      int var1 = OpaquePredicate.c();

      try {
         byte var10000 = this.mzk();
         if (var1 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 60;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return 80;
   }

   public boolean mzk() {
      return this.a4o(4);
   }

   public void pfo(boolean param1) {
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
      // 05: bipush 4
      // 06: iload 1
      // 07: invokespecial c9p.bmx (IZ)V
      // 0a: iload 2
      // 0b: ifeq 5b
      // 0e: iload 1
      // 0f: ifeq 65
      // 12: goto 19
      // 15: invokestatic c9p.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: ldc 1.9975
      // 1c: nop
      // 1d: ldc 1.9975
      // 1f: nop
      // 20: invokevirtual c9p.yxc (FF)V
      // 23: aload 0
      // 24: getstatic m6d.w7i Lw9p;
      // 27: invokevirtual c9p.dgt (Lw9p;)L_4o;
      // 2a: ldc2_w 0.30000001192092896
      // 2d: invokeinterface _4o.zf7 (D)V 3
      // 32: aload 0
      // 33: getstatic m6d.y3f Lw9p;
      // 36: invokevirtual c9p.dgt (Lw9p;)L_4o;
      // 39: ldc2_w 8.0
      // 3c: invokeinterface _4o.zf7 (D)V 3
      // 41: aload 0
      // 42: getstatic m6d.t9k Lw9p;
      // 45: invokevirtual c9p.dgt (Lw9p;)L_4o;
      // 48: ldc2_w 80.0
      // 4b: invokeinterface _4o.zf7 (D)V 3
      // 50: aload 0
      // 51: invokevirtual c9p._92 ()V
      // 54: goto 5b
      // 57: invokestatic c9p.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 0
      // 5c: getfield c9p.wjn L_tb;
      // 5f: sipush 400
      // 62: invokevirtual _tb.kj8 (I)V
      // 65: return
   }

   public void bkk() {
      this.pfo(true);
      this.ot1 = this.hrr = 1.0F;
   }

   private void kkf(int var1) {
      this.oit.c66(17, var1);
   }

   public boolean _sb() {
      int var1 = OpaquePredicate.c();

      try {
         int var10000 = this.oit.zwc(17);
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

   public Entity e6m() {
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
      // 05: invokevirtual c9p._sb ()Z
      // 08: iload 1
      // 09: ifne 2e
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic c9p.a (Loov;)Loov;
      // 15: athrow
      // 16: aconst_null
      // 17: areturn
      // 18: invokestatic c9p.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 1
      // 1e: ifne 90
      // 21: getfield c9p.oay Lt9d;
      // 24: getfield OpaquePredicate.v0f Z
      // 27: goto 2e
      // 2a: invokestatic c9p.a (Loov;)Loov;
      // 2d: athrow
      // 2e: ifeq 8c
      // 31: aload 0
      // 32: getfield c9p.z2n Lg_3;
      // 35: iload 1
      // 36: ifne 63
      // 39: goto 40
      // 3c: invokestatic c9p.a (Loov;)Loov;
      // 3f: athrow
      // 40: ifnull 53
      // 43: goto 4a
      // 46: invokestatic c9p.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: getfield c9p.z2n Lg_3;
      // 4e: areturn
      // 4f: invokestatic c9p.a (Loov;)Loov;
      // 52: athrow
      // 53: aload 0
      // 54: getfield c9p.oay Lt9d;
      // 57: aload 0
      // 58: getfield c9p.oit Lwl1;
      // 5b: bipush 17
      // 5d: invokevirtual wl1.zwc (I)I
      // 60: invokevirtual OpaquePredicate.oks (I)Li2h;
      // 63: astore 2
      // 64: iload 1
      // 65: ifne 85
      // 68: aload 2
      // 69: instanceof Entity
      // 6c: ifeq 8a
      // 6f: goto 76
      // 72: invokestatic c9p.a (Loov;)Loov;
      // 75: athrow
      // 76: aload 0
      // 77: aload 2
      // 78: checkcast Entity
      // 7b: putfield c9p.z2n Lg_3;
      // 7e: goto 85
      // 81: invokestatic c9p.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: getfield c9p.z2n Lg_3;
      // 89: areturn
      // 8a: aconst_null
      // 8b: areturn
      // 8c: aload 0
      // 8d: invokevirtual c9p.q4v ()Lg_3;
      // 90: areturn
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 1
      // 06: invokespecial s0i.jcg (I)V
      // 09: iload 1
      // 0a: bipush 16
      // 0c: iload 2
      // 0d: ifne 66
      // 10: if_icmpne 5c
      // 13: goto 1a
      // 16: invokestatic c9p.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: invokevirtual c9p.mzk ()Z
      // 1e: iload 2
      // 1f: ifne 4b
      // 22: goto 29
      // 25: invokestatic c9p.a (Loov;)Loov;
      // 28: athrow
      // 29: ifeq 7a
      // 2c: goto 33
      // 2f: invokestatic c9p.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: iload 2
      // 35: ifne 4f
      // 38: goto 3f
      // 3b: invokestatic c9p.a (Loov;)Loov;
      // 3e: athrow
      // 3f: getfield c9p.uo6 F
      // 42: fconst_1
      // 43: fcmpg
      // 44: goto 4b
      // 47: invokestatic c9p.a (Loov;)Loov;
      // 4a: athrow
      // 4b: ifge 7a
      // 4e: aload 0
      // 4f: ldc 1.9975
      // 51: nop
      // 52: ldc 1.9975
      // 54: nop
      // 55: invokevirtual c9p.yxc (FF)V
      // 58: iload 2
      // 59: ifeq 7a
      // 5c: iload 1
      // 5d: bipush 17
      // 5f: goto 66
      // 62: invokestatic c9p.a (Loov;)Loov;
      // 65: athrow
      // 66: if_icmpne 7a
      // 69: aload 0
      // 6a: bipush 0
      // 6b: putfield c9p.m0z I
      // 6e: aload 0
      // 6f: aconst_null
      // 70: putfield c9p.z2n Lg_3;
      // 73: goto 7a
      // 76: invokestatic c9p.a (Loov;)Loov;
      // 79: athrow
      // 7a: return
   }

   @Override
   public int u8h() {
      return 160;
   }

   @Override
   public String _n1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic c9p.c J
      // 03: ldc2_w 109319164815901
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual c9p.mwv ()Z
      // 10: iload 3
      // 11: ifne 37
      // 14: ifne 33
      // 17: goto 1e
      // 1a: invokestatic c9p.a (Loov;)Loov;
      // 1d: athrow
      // 1e: sipush 6893
      // 21: ldc2_w 1974531597835778838
      // 24: lload 1
      // 25: lxor
      // 26: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: nop
      // 2c: goto 5d
      // 2f: invokestatic c9p.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: invokevirtual c9p.mzk ()Z
      // 37: ifeq 4f
      // 3a: sipush 22307
      // 3d: ldc2_w 7871606827327387348
      // 40: lload 1
      // 41: lxor
      // 42: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: goto 5d
      // 4b: invokestatic c9p.a (Loov;)Loov;
      // 4e: athrow
      // 4f: sipush 1955
      // 52: ldc2_w 1751951597960996447
      // 55: lload 1
      // 56: lxor
      // 57: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: nop
      // 5d: areturn
   }

   @Override
   public String wcg() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic c9p.c J
      // 03: ldc2_w 133923853395301
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual c9p.mwv ()Z
      // 10: iload 3
      // 11: ifeq 37
      // 14: ifne 33
      // 17: goto 1e
      // 1a: invokestatic c9p.a (Loov;)Loov;
      // 1d: athrow
      // 1e: sipush 28420
      // 21: ldc2_w 8690034505669296518
      // 24: lload 1
      // 25: lxor
      // 26: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: nop
      // 2c: goto 5d
      // 2f: invokestatic c9p.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: invokevirtual c9p.mzk ()Z
      // 37: ifeq 4f
      // 3a: sipush 28732
      // 3d: ldc2_w 4619038932790927036
      // 40: lload 1
      // 41: lxor
      // 42: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: goto 5d
      // 4b: invokestatic c9p.a (Loov;)Loov;
      // 4e: athrow
      // 4f: sipush 3531
      // 52: ldc2_w 4070513872989430598
      // 55: lload 1
      // 56: lxor
      // 57: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: nop
      // 5d: areturn
   }

   @Override
   public String ix6() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic c9p.c J
      // 03: ldc2_w 77770395013931
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual c9p.mwv ()Z
      // 10: iload 3
      // 11: ifeq 37
      // 14: ifne 33
      // 17: goto 1e
      // 1a: invokestatic c9p.a (Loov;)Loov;
      // 1d: athrow
      // 1e: sipush 15969
      // 21: ldc2_w 5034071253161158307
      // 24: lload 1
      // 25: lxor
      // 26: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b: nop
      // 2c: goto 5d
      // 2f: invokestatic c9p.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: invokevirtual c9p.mzk ()Z
      // 37: ifeq 4f
      // 3a: sipush 16401
      // 3d: ldc2_w 3633751534623447256
      // 40: lload 1
      // 41: lxor
      // 42: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 47: nop
      // 48: goto 5d
      // 4b: invokestatic c9p.a (Loov;)Loov;
      // 4e: athrow
      // 4f: sipush 30620
      // 52: ldc2_w 8226330894640115539
      // 55: lload 1
      // 56: lxor
      // 57: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5c: nop
      // 5d: areturn
   }

   @Override
   public boolean _p9() {
      return false;
   }

   @Override
   public float c5y() {
      return this.ikl * 0.5F;
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifeq 3d
      // 09: getfield c9p.oay Lt9d;
      // 0c: aload 1
      // 0d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 10: invokeinterface zfz.r_y ()Le0x; 1
      // 15: invokevirtual e0x.p1r ()Lp3y;
      // 18: getstatic p3y.six Lp3y;
      // 1b: if_acmpne 3c
      // 1e: goto 25
      // 21: invokestatic c9p.a (Loov;)Loov;
      // 24: athrow
      // 25: ldc 10.0
      // 27: nop
      // 28: aload 0
      // 29: getfield c9p.oay Lt9d;
      // 2c: aload 1
      // 2d: invokevirtual OpaquePredicate.rgh (Lmew;)F
      // 30: fadd
      // 31: ldc 0.5
      // 33: nop
      // 34: fsub
      // 35: goto 41
      // 38: invokestatic c9p.a (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 0
      // 3d: aload 1
      // 3e: invokespecial s0i.ncy (Lmew;)F
      // 41: freturn
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
      // 000: getstatic c9p.c J
      // 003: ldc2_w 14775275277554
      // 006: lxor
      // 007: lstore 1
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 3
      // 00c: aload 0
      // 00d: getfield c9p.oay Lt9d;
      // 010: getfield OpaquePredicate.v0f Z
      // 013: iload 3
      // 014: ifne 419
      // 017: ifeq 415
      // 01a: goto 021
      // 01d: invokestatic c9p.a (Loov;)Loov;
      // 020: athrow
      // 021: aload 0
      // 022: aload 0
      // 023: getfield c9p.ynm F
      // 026: putfield c9p.n38 F
      // 029: aload 0
      // 02a: invokevirtual c9p.mwv ()Z
      // 02d: iload 3
      // 02e: ifne 11e
      // 031: goto 038
      // 034: invokestatic c9p.a (Loov;)Loov;
      // 037: athrow
      // 038: ifne 108
      // 03b: goto 042
      // 03e: invokestatic c9p.a (Loov;)Loov;
      // 041: athrow
      // 042: aload 0
      // 043: fconst_2
      // 044: putfield c9p.thk F
      // 047: aload 0
      // 048: iload 3
      // 049: ifne 0c0
      // 04c: goto 053
      // 04f: invokestatic c9p.a (Loov;)Loov;
      // 052: athrow
      // 053: getfield c9p.mop D
      // 056: dconst_0
      // 057: dcmpl
      // 058: ifle 0bf
      // 05b: goto 062
      // 05e: invokestatic c9p.a (Loov;)Loov;
      // 061: athrow
      // 062: aload 0
      // 063: iload 3
      // 064: ifne 0c0
      // 067: goto 06e
      // 06a: invokestatic c9p.a (Loov;)Loov;
      // 06d: athrow
      // 06e: getfield c9p.p2n Z
      // 071: ifeq 0bf
      // 074: goto 07b
      // 077: invokestatic c9p.a (Loov;)Loov;
      // 07a: athrow
      // 07b: aload 0
      // 07c: iload 3
      // 07d: ifne 0c0
      // 080: goto 087
      // 083: invokestatic c9p.a (Loov;)Loov;
      // 086: athrow
      // 087: invokevirtual c9p.o3x ()Z
      // 08a: ifne 0bf
      // 08d: goto 094
      // 090: invokestatic c9p.a (Loov;)Loov;
      // 093: athrow
      // 094: aload 0
      // 095: getfield c9p.oay Lt9d;
      // 098: aload 0
      // 099: getfield c9p.o2v D
      // 09c: aload 0
      // 09d: getfield c9p.kfp D
      // 0a0: aload 0
      // 0a1: getfield c9p.vbd D
      // 0a4: sipush 22415
      // 0a7: ldc2_w 2402434646085226646
      // 0aa: lload 1
      // 0ab: lxor
      // 0ac: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b1: nop
      // 0b2: fconst_1
      // 0b3: fconst_1
      // 0b4: bipush 0
      // 0b5: invokevirtual OpaquePredicate.wd_ (DDDLjava/lang/String;FFZ)V
      // 0b8: goto 0bf
      // 0bb: invokestatic c9p.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: aload 0
      // 0c1: getfield c9p.mop D
      // 0c4: dconst_0
      // 0c5: dcmpg
      // 0c6: iload 3
      // 0c7: ifne 0ee
      // 0ca: ifge 100
      // 0cd: goto 0d4
      // 0d0: invokestatic c9p.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: aload 0
      // 0d5: getfield c9p.oay Lt9d;
      // 0d8: new mew
      // 0db: dup
      // 0dc: aload 0
      // 0dd: invokespecial mew.<init> (Li2h;)V
      // 0e0: invokevirtual mew.eve ()Lmew;
      // 0e3: bipush 0
      // 0e4: invokevirtual OpaquePredicate.h9u (Lmew;Z)Z
      // 0e7: goto 0ee
      // 0ea: invokestatic c9p.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: iload 3
      // 0ef: ifne 0fd
      // 0f2: ifeq 100
      // 0f5: goto 0fc
      // 0f8: invokestatic c9p.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: bipush 1
      // 0fd: goto 101
      // 100: bipush 0
      // 101: putfield c9p.p2n Z
      // 104: iload 3
      // 105: ifeq 18c
      // 108: aload 0
      // 109: iload 3
      // 10a: ifne 178
      // 10d: goto 114
      // 110: invokestatic c9p.a (Loov;)Loov;
      // 113: athrow
      // 114: invokevirtual c9p.m04 ()Z
      // 117: goto 11e
      // 11a: invokestatic c9p.a (Loov;)Loov;
      // 11d: athrow
      // 11e: ifeq 170
      // 121: aload 0
      // 122: iload 3
      // 123: ifne 158
      // 126: goto 12d
      // 129: invokestatic c9p.a (Loov;)Loov;
      // 12c: athrow
      // 12d: getfield c9p.thk F
      // 130: ldc 0.5
      // 132: nop
      // 133: fcmpg
      // 134: ifge 150
      // 137: goto 13e
      // 13a: invokestatic c9p.a (Loov;)Loov;
      // 13d: athrow
      // 13e: aload 0
      // 13f: ldc 4.0
      // 141: nop
      // 142: putfield c9p.thk F
      // 145: iload 3
      // 146: ifeq 18c
      // 149: goto 150
      // 14c: invokestatic c9p.a (Loov;)Loov;
      // 14f: athrow
      // 150: aload 0
      // 151: goto 158
      // 154: invokestatic c9p.a (Loov;)Loov;
      // 157: athrow
      // 158: dup
      // 159: getfield c9p.thk F
      // 15c: ldc 0.5
      // 15e: nop
      // 15f: aload 0
      // 160: getfield c9p.thk F
      // 163: fsub
      // 164: ldc 0.1
      // 166: nop
      // 167: fmul
      // 168: fadd
      // 169: putfield c9p.thk F
      // 16c: iload 3
      // 16d: ifeq 18c
      // 170: aload 0
      // 171: goto 178
      // 174: invokestatic c9p.a (Loov;)Loov;
      // 177: athrow
      // 178: dup
      // 179: getfield c9p.thk F
      // 17c: ldc 0.125
      // 17e: nop
      // 17f: aload 0
      // 180: getfield c9p.thk F
      // 183: fsub
      // 184: ldc 0.2
      // 186: nop
      // 187: fmul
      // 188: fadd
      // 189: putfield c9p.thk F
      // 18c: aload 0
      // 18d: dup
      // 18e: getfield c9p.ynm F
      // 191: aload 0
      // 192: getfield c9p.thk F
      // 195: fadd
      // 196: putfield c9p.ynm F
      // 199: aload 0
      // 19a: aload 0
      // 19b: getfield c9p.hrr F
      // 19e: putfield c9p.ot1 F
      // 1a1: aload 0
      // 1a2: invokevirtual c9p.mwv ()Z
      // 1a5: iload 3
      // 1a6: ifne 1df
      // 1a9: ifne 1c9
      // 1ac: goto 1b3
      // 1af: invokestatic c9p.a (Loov;)Loov;
      // 1b2: athrow
      // 1b3: aload 0
      // 1b4: aload 0
      // 1b5: getfield c9p.z2d Ljava/util/Random;
      // 1b8: invokevirtual java/util/Random.nextFloat ()F
      // 1bb: putfield c9p.hrr F
      // 1be: iload 3
      // 1bf: ifeq 21a
      // 1c2: goto 1c9
      // 1c5: invokestatic c9p.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: aload 0
      // 1ca: iload 3
      // 1cb: ifne 208
      // 1ce: goto 1d5
      // 1d1: invokestatic c9p.a (Loov;)Loov;
      // 1d4: athrow
      // 1d5: invokevirtual c9p.m04 ()Z
      // 1d8: goto 1df
      // 1db: invokestatic c9p.a (Loov;)Loov;
      // 1de: athrow
      // 1df: ifeq 200
      // 1e2: aload 0
      // 1e3: dup
      // 1e4: getfield c9p.hrr F
      // 1e7: fconst_0
      // 1e8: aload 0
      // 1e9: getfield c9p.hrr F
      // 1ec: fsub
      // 1ed: ldc 0.25
      // 1ef: nop
      // 1f0: fmul
      // 1f1: fadd
      // 1f2: putfield c9p.hrr F
      // 1f5: iload 3
      // 1f6: ifeq 21a
      // 1f9: goto 200
      // 1fc: invokestatic c9p.a (Loov;)Loov;
      // 1ff: athrow
      // 200: aload 0
      // 201: goto 208
      // 204: invokestatic c9p.a (Loov;)Loov;
      // 207: athrow
      // 208: dup
      // 209: getfield c9p.hrr F
      // 20c: fconst_1
      // 20d: aload 0
      // 20e: getfield c9p.hrr F
      // 211: fsub
      // 212: ldc 0.06
      // 214: nop
      // 215: fmul
      // 216: fadd
      // 217: putfield c9p.hrr F
      // 21a: aload 0
      // 21b: invokevirtual c9p.m04 ()Z
      // 21e: iload 3
      // 21f: ifne 2d7
      // 222: ifeq 2d3
      // 225: goto 22c
      // 228: invokestatic c9p.a (Loov;)Loov;
      // 22b: athrow
      // 22c: aload 0
      // 22d: invokevirtual c9p.mwv ()Z
      // 230: iload 3
      // 231: ifne 2d7
      // 234: goto 23b
      // 237: invokestatic c9p.a (Loov;)Loov;
      // 23a: athrow
      // 23b: ifeq 2d3
      // 23e: goto 245
      // 241: invokestatic c9p.a (Loov;)Loov;
      // 244: athrow
      // 245: aload 0
      // 246: fconst_0
      // 247: invokevirtual c9p.wej (F)Lfqr;
      // 24a: astore 4
      // 24c: bipush 0
      // 24d: istore 5
      // 24f: iload 5
      // 251: bipush 2
      // 252: if_icmpge 2d3
      // 255: aload 0
      // 256: getfield c9p.oay Lt9d;
      // 259: getstatic w_0.w_h Lw_0;
      // 25c: aload 0
      // 25d: getfield c9p.o2v D
      // 260: aload 0
      // 261: getfield c9p.z2d Ljava/util/Random;
      // 264: invokevirtual java/util/Random.nextDouble ()D
      // 267: ldc2_w 0.5
      // 26a: dsub
      // 26b: aload 0
      // 26c: getfield c9p.uo6 F
      // 26f: f2d
      // 270: dmul
      // 271: dadd
      // 272: aload 4
      // 274: getfield fqr.lvi D
      // 277: ldc2_w 1.5
      // 27a: dmul
      // 27b: dsub
      // 27c: aload 0
      // 27d: getfield c9p.kfp D
      // 280: aload 0
      // 281: getfield c9p.z2d Ljava/util/Random;
      // 284: invokevirtual java/util/Random.nextDouble ()D
      // 287: aload 0
      // 288: getfield c9p.ikl F
      // 28b: f2d
      // 28c: dmul
      // 28d: dadd
      // 28e: aload 4
      // 290: getfield fqr.gn5 D
      // 293: ldc2_w 1.5
      // 296: dmul
      // 297: dsub
      // 298: aload 0
      // 299: getfield c9p.vbd D
      // 29c: aload 0
      // 29d: getfield c9p.z2d Ljava/util/Random;
      // 2a0: invokevirtual java/util/Random.nextDouble ()D
      // 2a3: ldc2_w 0.5
      // 2a6: dsub
      // 2a7: aload 0
      // 2a8: getfield c9p.uo6 F
      // 2ab: f2d
      // 2ac: dmul
      // 2ad: dadd
      // 2ae: aload 4
      // 2b0: getfield fqr.bn2 D
      // 2b3: ldc2_w 1.5
      // 2b6: dmul
      // 2b7: dsub
      // 2b8: dconst_0
      // 2b9: dconst_0
      // 2ba: dconst_0
      // 2bb: bipush 0
      // 2bc: newarray 10
      // 2be: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 2c1: iinc 5 1
      // 2c4: iload 3
      // 2c5: ifne 415
      // 2c8: iload 3
      // 2c9: ifeq 24f
      // 2cc: goto 2d3
      // 2cf: invokestatic c9p.a (Loov;)Loov;
      // 2d2: athrow
      // 2d3: aload 0
      // 2d4: invokevirtual c9p._sb ()Z
      // 2d7: iload 3
      // 2d8: ifne 419
      // 2db: ifeq 415
      // 2de: goto 2e5
      // 2e1: invokestatic c9p.a (Loov;)Loov;
      // 2e4: athrow
      // 2e5: aload 0
      // 2e6: iload 3
      // 2e7: ifne 322
      // 2ea: goto 2f1
      // 2ed: invokestatic c9p.a (Loov;)Loov;
      // 2f0: athrow
      // 2f1: getfield c9p.m0z I
      // 2f4: aload 0
      // 2f5: invokevirtual c9p.y3s ()I
      // 2f8: if_icmpge 313
      // 2fb: goto 302
      // 2fe: invokestatic c9p.a (Loov;)Loov;
      // 301: athrow
      // 302: aload 0
      // 303: dup
      // 304: getfield c9p.m0z I
      // 307: bipush 1
      // 308: iadd
      // 309: putfield c9p.m0z I
      // 30c: goto 313
      // 30f: invokestatic c9p.a (Loov;)Loov;
      // 312: athrow
      // 313: aload 0
      // 314: iload 3
      // 315: ifne 416
      // 318: invokevirtual c9p.e6m ()Lg_3;
      // 31b: goto 322
      // 31e: invokestatic c9p.a (Loov;)Loov;
      // 321: athrow
      // 322: astore 4
      // 324: aload 4
      // 326: ifnull 415
      // 329: aload 0
      // 32a: invokevirtual c9p.ph8 ()Lknw;
      // 32d: aload 4
      // 32f: ldc 90.0
      // 331: nop
      // 332: ldc 90.0
      // 334: nop
      // 335: invokevirtual knw.rz3 (Li2h;FF)V
      // 338: aload 0
      // 339: invokevirtual c9p.ph8 ()Lknw;
      // 33c: invokevirtual knw._9j ()V
      // 33f: aload 0
      // 340: fconst_0
      // 341: invokevirtual c9p.z3d (F)F
      // 344: f2d
      // 345: dstore 5
      // 347: aload 4
      // 349: getfield Entity.o2v D
      // 34c: aload 0
      // 34d: getfield c9p.o2v D
      // 350: dsub
      // 351: dstore 7
      // 353: aload 4
      // 355: getfield Entity.kfp D
      // 358: aload 4
      // 35a: getfield Entity.ikl F
      // 35d: ldc 0.5
      // 35f: nop
      // 360: fmul
      // 361: f2d
      // 362: dadd
      // 363: aload 0
      // 364: getfield c9p.kfp D
      // 367: aload 0
      // 368: invokevirtual c9p.c5y ()F
      // 36b: f2d
      // 36c: dadd
      // 36d: dsub
      // 36e: dstore 9
      // 370: aload 4
      // 372: getfield Entity.vbd D
      // 375: aload 0
      // 376: getfield c9p.vbd D
      // 379: dsub
      // 37a: dstore 11
      // 37c: dload 7
      // 37e: dload 7
      // 380: dmul
      // 381: dload 9
      // 383: dload 9
      // 385: dmul
      // 386: dadd
      // 387: dload 11
      // 389: dload 11
      // 38b: dmul
      // 38c: dadd
      // 38d: invokestatic java/lang/Math.sqrt (D)D
      // 390: dstore 13
      // 392: dload 7
      // 394: dload 13
      // 396: ddiv
      // 397: dstore 7
      // 399: dload 9
      // 39b: dload 13
      // 39d: ddiv
      // 39e: dstore 9
      // 3a0: dload 11
      // 3a2: dload 13
      // 3a4: ddiv
      // 3a5: dstore 11
      // 3a7: aload 0
      // 3a8: getfield c9p.z2d Ljava/util/Random;
      // 3ab: invokevirtual java/util/Random.nextDouble ()D
      // 3ae: dstore 15
      // 3b0: dload 15
      // 3b2: dload 13
      // 3b4: dcmpg
      // 3b5: ifge 415
      // 3b8: dload 15
      // 3ba: ldc2_w 1.8
      // 3bd: dload 5
      // 3bf: dsub
      // 3c0: aload 0
      // 3c1: getfield c9p.z2d Ljava/util/Random;
      // 3c4: invokevirtual java/util/Random.nextDouble ()D
      // 3c7: ldc2_w 1.7
      // 3ca: dload 5
      // 3cc: dsub
      // 3cd: dmul
      // 3ce: dadd
      // 3cf: dadd
      // 3d0: dstore 15
      // 3d2: aload 0
      // 3d3: getfield c9p.oay Lt9d;
      // 3d6: getstatic w_0.w_h Lw_0;
      // 3d9: aload 0
      // 3da: getfield c9p.o2v D
      // 3dd: dload 7
      // 3df: dload 15
      // 3e1: dmul
      // 3e2: dadd
      // 3e3: aload 0
      // 3e4: getfield c9p.kfp D
      // 3e7: dload 9
      // 3e9: dload 15
      // 3eb: dmul
      // 3ec: dadd
      // 3ed: aload 0
      // 3ee: invokevirtual c9p.c5y ()F
      // 3f1: f2d
      // 3f2: dadd
      // 3f3: aload 0
      // 3f4: getfield c9p.vbd D
      // 3f7: dload 11
      // 3f9: dload 15
      // 3fb: dmul
      // 3fc: dadd
      // 3fd: dconst_0
      // 3fe: dconst_0
      // 3ff: dconst_0
      // 400: bipush 0
      // 401: newarray 10
      // 403: invokevirtual OpaquePredicate.zvy (Lw_0;DDDDDD[I)V
      // 406: iload 3
      // 407: ifne 439
      // 40a: iload 3
      // 40b: ifeq 3b0
      // 40e: goto 415
      // 411: invokestatic c9p.a (Loov;)Loov;
      // 414: athrow
      // 415: aload 0
      // 416: getfield c9p.x7a Z
      // 419: iload 3
      // 41a: ifne 43d
      // 41d: ifeq 439
      // 420: goto 427
      // 423: invokestatic c9p.a (Loov;)Loov;
      // 426: athrow
      // 427: aload 0
      // 428: sipush 300
      // 42b: invokevirtual c9p.yoc (I)V
      // 42e: iload 3
      // 42f: ifeq 4a9
      // 432: goto 439
      // 435: invokestatic c9p.a (Loov;)Loov;
      // 438: athrow
      // 439: aload 0
      // 43a: getfield c9p.lfk Z
      // 43d: iload 3
      // 43e: ifne 4b8
      // 441: ifeq 4a9
      // 444: goto 44b
      // 447: invokestatic c9p.a (Loov;)Loov;
      // 44a: athrow
      // 44b: aload 0
      // 44c: dup
      // 44d: getfield c9p.mop D
      // 450: ldc2_w 0.5
      // 453: dadd
      // 454: putfield c9p.mop D
      // 457: aload 0
      // 458: dup
      // 459: getfield c9p.icv D
      // 45c: aload 0
      // 45d: getfield c9p.z2d Ljava/util/Random;
      // 460: invokevirtual java/util/Random.nextFloat ()F
      // 463: fconst_2
      // 464: fmul
      // 465: fconst_1
      // 466: fsub
      // 467: ldc 0.4
      // 469: nop
      // 46a: fmul
      // 46b: f2d
      // 46c: dadd
      // 46d: putfield c9p.icv D
      // 470: aload 0
      // 471: dup
      // 472: getfield c9p.bw4 D
      // 475: aload 0
      // 476: getfield c9p.z2d Ljava/util/Random;
      // 479: invokevirtual java/util/Random.nextFloat ()F
      // 47c: fconst_2
      // 47d: fmul
      // 47e: fconst_1
      // 47f: fsub
      // 480: ldc 0.4
      // 482: nop
      // 483: fmul
      // 484: f2d
      // 485: dadd
      // 486: putfield c9p.bw4 D
      // 489: aload 0
      // 48a: aload 0
      // 48b: getfield c9p.z2d Ljava/util/Random;
      // 48e: invokevirtual java/util/Random.nextFloat ()F
      // 491: ldc 360.0
      // 493: nop
      // 494: fmul
      // 495: putfield c9p.x5k F
      // 498: aload 0
      // 499: bipush 0
      // 49a: putfield c9p.lfk Z
      // 49d: aload 0
      // 49e: bipush 1
      // 49f: putfield c9p.u19 Z
      // 4a2: goto 4a9
      // 4a5: invokestatic c9p.a (Loov;)Loov;
      // 4a8: athrow
      // 4a9: aload 0
      // 4aa: iload 3
      // 4ab: ifne 4cb
      // 4ae: invokevirtual c9p._sb ()Z
      // 4b1: goto 4b8
      // 4b4: invokestatic c9p.a (Loov;)Loov;
      // 4b7: athrow
      // 4b8: ifeq 4ca
      // 4bb: aload 0
      // 4bc: aload 0
      // 4bd: getfield c9p.q6c F
      // 4c0: putfield c9p.x5k F
      // 4c3: goto 4ca
      // 4c6: invokestatic c9p.a (Loov;)Loov;
      // 4c9: athrow
      // 4ca: aload 0
      // 4cb: invokespecial s0i.e_a ()V
      // 4ce: return
   }

   public float si5(float var1) {
      return this.n38 + (this.ynm - this.n38) * var1;
   }

   public float sah(float var1) {
      return this.ot1 + (this.hrr - this.ot1) * var1;
   }

   public float z3d(float var1) {
      return ((float)this.m0z + var1) / (float)this.y3s();
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokespecial s0i.qar ()V
      // 008: aload 0
      // 009: invokevirtual c9p.mzk ()Z
      // 00c: iload 1
      // 00d: ifeq 01d
      // 010: ifeq 12d
      // 013: goto 01a
      // 016: invokestatic c9p.a (Loov;)Loov;
      // 019: athrow
      // 01a: sipush 1200
      // 01d: istore 2
      // 01e: sipush 1200
      // 021: istore 3
      // 022: sipush 6000
      // 025: istore 4
      // 027: bipush 2
      // 028: istore 5
      // 02a: aload 0
      // 02b: getfield c9p.g25 I
      // 02e: aload 0
      // 02f: invokevirtual c9p.jwu ()I
      // 032: iadd
      // 033: sipush 1200
      // 036: irem
      // 037: iload 1
      // 038: ifeq 11c
      // 03b: ifne 10d
      // 03e: goto 045
      // 041: invokestatic c9p.a (Loov;)Loov;
      // 044: athrow
      // 045: getstatic mcs._es Lmcs;
      // 048: astore 6
      // 04a: aload 0
      // 04b: getfield c9p.oay Lt9d;
      // 04e: ldc z96
      // 050: nop
      // 051: new c9p$1
      // 054: dup
      // 055: aload 0
      // 056: invokespecial c9p$1.<init> (Lc9p;)V
      // 059: invokevirtual OpaquePredicate.nnw (Ljava/lang/Class;Lcom/google/common/base/Predicate;)Ljava/util/List;
      // 05c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 061: astore 7
      // 063: aload 7
      // 065: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 06a: ifeq 10d
      // 06d: aload 7
      // 06f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 074: checkcast z96
      // 077: astore 8
      // 079: aload 8
      // 07b: iload 1
      // 07c: ifeq 0f6
      // 07f: aload 6
      // 081: invokevirtual z96.cab (Lmcs;)Z
      // 084: iload 1
      // 085: ifeq 11c
      // 088: goto 08f
      // 08b: invokestatic c9p.a (Loov;)Loov;
      // 08e: athrow
      // 08f: ifeq 0db
      // 092: goto 099
      // 095: invokestatic c9p.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 8
      // 09b: iload 1
      // 09c: ifeq 0f6
      // 09f: goto 0a6
      // 0a2: invokestatic c9p.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: aload 6
      // 0a8: invokevirtual z96.dhd (Lmcs;)Lsdj;
      // 0ab: invokevirtual sdj.tus ()I
      // 0ae: bipush 2
      // 0af: if_icmplt 0db
      // 0b2: goto 0b9
      // 0b5: invokestatic c9p.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 8
      // 0bb: iload 1
      // 0bc: ifeq 0f6
      // 0bf: goto 0c6
      // 0c2: invokestatic c9p.a (Loov;)Loov;
      // 0c5: athrow
      // 0c6: aload 6
      // 0c8: invokevirtual z96.dhd (Lmcs;)Lsdj;
      // 0cb: invokevirtual sdj.ltp ()I
      // 0ce: sipush 1200
      // 0d1: if_icmpge 109
      // 0d4: goto 0db
      // 0d7: invokestatic c9p.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 8
      // 0dd: getfield z96.rhh Lmlk;
      // 0e0: new net/minecraft/network/play/server/S2BPacketChangeGameState
      // 0e3: dup
      // 0e4: bipush 10
      // 0e6: fconst_0
      // 0e7: invokespecial net/minecraft/network/play/server/S2BPacketChangeGameState.<init> (IF)V
      // 0ea: invokevirtual mlk.vnf (Lmz2;)V
      // 0ed: aload 8
      // 0ef: goto 0f6
      // 0f2: invokestatic c9p.a (Loov;)Loov;
      // 0f5: athrow
      // 0f6: new sdj
      // 0f9: dup
      // 0fa: aload 6
      // 0fc: getfield mcs.zr9 I
      // 0ff: sipush 6000
      // 102: bipush 2
      // 103: invokespecial sdj.<init> (III)V
      // 106: invokevirtual z96.gmn (Lsdj;)V
      // 109: iload 1
      // 10a: ifne 063
      // 10d: aload 0
      // 10e: iload 1
      // 10f: ifeq 120
      // 112: invokevirtual c9p.qg5 ()Z
      // 115: goto 11c
      // 118: invokestatic c9p.a (Loov;)Loov;
      // 11b: athrow
      // 11c: ifne 12d
      // 11f: aload 0
      // 120: new mew
      // 123: dup
      // 124: aload 0
      // 125: invokespecial mew.<init> (Li2h;)V
      // 128: bipush 16
      // 12a: invokevirtual c9p.muf (Lmew;I)V
      // 12d: return
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
      // 05: getfield c9p.z2d Ljava/util/Random;
      // 08: bipush 3
      // 09: invokevirtual java/util/Random.nextInt (I)I
      // 0c: aload 0
      // 0d: getfield c9p.z2d Ljava/util/Random;
      // 10: iload 2
      // 11: bipush 1
      // 12: iadd
      // 13: invokevirtual java/util/Random.nextInt (I)I
      // 16: iadd
      // 17: istore 4
      // 19: iload 4
      // 1b: iload 3
      // 1c: ifeq 4d
      // 1f: ifle 43
      // 22: goto 29
      // 25: invokestatic c9p.a (Loov;)Loov;
      // 28: athrow
      // 29: aload 0
      // 2a: new erg
      // 2d: dup
      // 2e: getstatic xbr.n46 Lu7m;
      // 31: iload 4
      // 33: bipush 0
      // 34: invokespecial erg.<init> (Lu7m;II)V
      // 37: fconst_1
      // 38: invokevirtual c9p.qji (Lerg;F)Lnvf;
      // 3b: pop
      // 3c: goto 43
      // 3f: invokestatic c9p.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: getfield c9p.z2d Ljava/util/Random;
      // 47: bipush 3
      // 48: iload 2
      // 49: iadd
      // 4a: invokevirtual java/util/Random.nextInt (I)I
      // 4d: bipush 1
      // 4e: iload 3
      // 4f: ifeq 9b
      // 52: if_icmple 7e
      // 55: goto 5c
      // 58: invokestatic c9p.a (Loov;)Loov;
      // 5b: athrow
      // 5c: aload 0
      // 5d: new erg
      // 60: dup
      // 61: getstatic xbr.h_h Lu7m;
      // 64: bipush 1
      // 65: getstatic po4$i4c.umn Lpo4$i4c;
      // 68: invokevirtual po4$i4c.iho ()I
      // 6b: invokespecial erg.<init> (Lu7m;II)V
      // 6e: fconst_1
      // 6f: invokevirtual c9p.qji (Lerg;F)Lnvf;
      // 72: pop
      // 73: iload 3
      // 74: ifne b7
      // 77: goto 7e
      // 7a: invokestatic c9p.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: getfield c9p.z2d Ljava/util/Random;
      // 82: bipush 3
      // 83: iload 2
      // 84: iadd
      // 85: invokevirtual java/util/Random.nextInt (I)I
      // 88: iload 3
      // 89: ifeq b8
      // 8c: goto 93
      // 8f: invokestatic c9p.a (Loov;)Loov;
      // 92: athrow
      // 93: bipush 1
      // 94: goto 9b
      // 97: invokestatic c9p.a (Loov;)Loov;
      // 9a: athrow
      // 9b: if_icmple b7
      // 9e: aload 0
      // 9f: new erg
      // a2: dup
      // a3: getstatic xbr.fi0 Lu7m;
      // a6: bipush 1
      // a7: bipush 0
      // a8: invokespecial erg.<init> (Lu7m;II)V
      // ab: fconst_1
      // ac: invokevirtual c9p.qji (Lerg;F)Lnvf;
      // af: pop
      // b0: goto b7
      // b3: invokestatic c9p.a (Loov;)Loov;
      // b6: athrow
      // b7: iload 1
      // b8: iload 3
      // b9: ifeq dc
      // bc: ifeq f1
      // bf: goto c6
      // c2: invokestatic c9p.a (Loov;)Loov;
      // c5: athrow
      // c6: aload 0
      // c7: iload 3
      // c8: ifeq e0
      // cb: goto d2
      // ce: invokestatic c9p.a (Loov;)Loov;
      // d1: athrow
      // d2: invokevirtual c9p.mzk ()Z
      // d5: goto dc
      // d8: invokestatic c9p.a (Loov;)Loov;
      // db: athrow
      // dc: ifeq f1
      // df: aload 0
      // e0: new erg
      // e3: dup
      // e4: getstatic ox_.u7i Le0x;
      // e7: bipush 1
      // e8: bipush 1
      // e9: invokespecial erg.<init> (Le0x;II)V
      // ec: fconst_1
      // ed: invokevirtual c9p.qji (Lerg;F)Lnvf;
      // f0: pop
      // f1: return
   }

   @Override
   public void z3m() {
      erg var1 = ((_4n)zfj.h82(this.z2d, sj_.bw8())).et4(this.z2d);
      this.qji(var1, 1.0F);
   }

   @Override
   public boolean vef() {
      return true;
   }

   @Override
   public boolean m63() {
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
      // 05: getfield c9p.oay Lt9d;
      // 08: aload 0
      // 09: invokevirtual c9p.aaw ()Lnh4;
      // 0c: aload 0
      // 0d: invokevirtual OpaquePredicate.g17 (Lnh4;Li2h;)Z
      // 10: iload 1
      // 11: ifne 36
      // 14: ifeq 48
      // 17: goto 1e
      // 1a: invokestatic c9p.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield c9p.oay Lt9d;
      // 22: aload 0
      // 23: aload 0
      // 24: invokevirtual c9p.aaw ()Lnh4;
      // 27: invokevirtual OpaquePredicate.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 2a: invokeinterface java/util/List.isEmpty ()Z 1
      // 2f: goto 36
      // 32: invokestatic c9p.a (Loov;)Loov;
      // 35: athrow
      // 36: iload 1
      // 37: ifne 45
      // 3a: ifeq 48
      // 3d: goto 44
      // 40: invokestatic c9p.a (Loov;)Loov;
      // 43: athrow
      // 44: bipush 1
      // 45: goto 49
      // 48: bipush 0
      // 49: ireturn
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield c9p.z2d Ljava/util/Random;
      // 08: bipush 20
      // 0a: invokevirtual java/util/Random.nextInt (I)I
      // 0d: iload 1
      // 0e: ifeq 4a
      // 11: ifeq 3f
      // 14: goto 1b
      // 17: invokestatic c9p.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield c9p.oay Lt9d;
      // 1f: new mew
      // 22: dup
      // 23: aload 0
      // 24: invokespecial mew.<init> (Li2h;)V
      // 27: invokevirtual OpaquePredicate.m8_ (Lmew;)Z
      // 2a: iload 1
      // 2b: ifeq 4a
      // 2e: goto 35
      // 31: invokestatic c9p.a (Loov;)Loov;
      // 34: athrow
      // 35: ifne 5c
      // 38: goto 3f
      // 3b: invokestatic c9p.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 0
      // 40: invokespecial s0i.iaw ()Z
      // 43: goto 4a
      // 46: invokestatic c9p.a (Loov;)Loov;
      // 49: athrow
      // 4a: iload 1
      // 4b: ifeq 59
      // 4e: ifeq 5c
      // 51: goto 58
      // 54: invokestatic c9p.a (Loov;)Loov;
      // 57: athrow
      // 58: bipush 1
      // 59: goto 5d
      // 5c: bipush 0
      // 5d: ireturn
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
      // 00: getstatic c9p.c J
      // 03: ldc2_w 54399218759547
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: invokevirtual c9p.m04 ()Z
      // 11: iload 5
      // 13: ifeq a9
      // 16: ifne 9c
      // 19: goto 20
      // 1c: invokestatic c9p.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 1
      // 21: invokevirtual ofh.vmw ()Z
      // 24: iload 5
      // 26: ifeq a9
      // 29: goto 30
      // 2c: invokestatic c9p.a (Loov;)Loov;
      // 2f: athrow
      // 30: ifne 9c
      // 33: goto 3a
      // 36: invokestatic c9p.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 1
      // 3b: invokevirtual ofh.f8d ()Li2h;
      // 3e: instanceof Entity
      // 41: iload 5
      // 43: ifeq a9
      // 46: goto 4d
      // 49: invokestatic c9p.a (Loov;)Loov;
      // 4c: athrow
      // 4d: ifeq 9c
      // 50: goto 57
      // 53: invokestatic c9p.a (Loov;)Loov;
      // 56: athrow
      // 57: aload 1
      // 58: invokevirtual ofh.f8d ()Li2h;
      // 5b: checkcast Entity
      // 5e: astore 6
      // 60: aload 1
      // 61: invokevirtual ofh.yto ()Z
      // 64: iload 5
      // 66: ifeq a9
      // 69: ifne 9c
      // 6c: goto 73
      // 6f: invokestatic c9p.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 6
      // 75: aload 0
      // 76: invokestatic ofh.i_z (Li2h;)Lofh;
      // 79: fconst_2
      // 7a: invokevirtual Entity.m1t (Lofh;F)Z
      // 7d: pop
      // 7e: aload 6
      // 80: sipush 4519
      // 83: ldc2_w 7625271917303655729
      // 86: lload 3
      // 87: lxor
      // 88: invokedynamic f (IJ)Ljava/lang/String; bsm=c9p.e (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: nop
      // 8e: ldc 0.5
      // 90: nop
      // 91: fconst_1
      // 92: invokevirtual Entity.lhu (Ljava/lang/String;FF)V
      // 95: goto 9c
      // 98: invokestatic c9p.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 0
      // 9d: getfield c9p.wjn L_tb;
      // a0: invokevirtual _tb.x6d ()V
      // a3: aload 0
      // a4: aload 1
      // a5: fload 2
      // a6: invokespecial s0i.m1t (Lofh;F)Z
      // a9: ireturn
   }

   @Override
   public int d1r() {
      return 180;
   }

   @Override
   public void ge2(float param1, float param2) {
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
      // 05: iload 3
      // 06: ifeq c7
      // 09: invokevirtual c9p.de5 ()Z
      // 0c: ifeq bf
      // 0f: goto 16
      // 12: invokestatic c9p.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 3
      // 18: ifeq b6
      // 1b: goto 22
      // 1e: invokestatic c9p.a (Loov;)Loov;
      // 21: athrow
      // 22: invokevirtual c9p.mwv ()Z
      // 25: ifeq ae
      // 28: goto 2f
      // 2b: invokestatic c9p.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: fload 1
      // 31: fload 2
      // 32: ldc 0.1
      // 34: nop
      // 35: invokevirtual c9p.r4r (FFF)V
      // 38: aload 0
      // 39: aload 0
      // 3a: getfield c9p.icv D
      // 3d: aload 0
      // 3e: getfield c9p.mop D
      // 41: aload 0
      // 42: getfield c9p.bw4 D
      // 45: invokevirtual c9p.vjj (DDD)V
      // 48: aload 0
      // 49: dup
      // 4a: getfield c9p.icv D
      // 4d: ldc2_w 0.8999999761581421
      // 50: dmul
      // 51: putfield c9p.icv D
      // 54: aload 0
      // 55: dup
      // 56: getfield c9p.mop D
      // 59: ldc2_w 0.8999999761581421
      // 5c: dmul
      // 5d: putfield c9p.mop D
      // 60: aload 0
      // 61: dup
      // 62: getfield c9p.bw4 D
      // 65: ldc2_w 0.8999999761581421
      // 68: dmul
      // 69: putfield c9p.bw4 D
      // 6c: aload 0
      // 6d: iload 3
      // 6e: ifeq 9b
      // 71: goto 78
      // 74: invokestatic c9p.a (Loov;)Loov;
      // 77: athrow
      // 78: invokevirtual c9p.m04 ()Z
      // 7b: ifne cc
      // 7e: goto 85
      // 81: invokestatic c9p.a (Loov;)Loov;
      // 84: athrow
      // 85: aload 0
      // 86: iload 3
      // 87: ifeq 9f
      // 8a: goto 91
      // 8d: invokestatic c9p.a (Loov;)Loov;
      // 90: athrow
      // 91: invokevirtual c9p.q4v ()Lg_3;
      // 94: goto 9b
      // 97: invokestatic c9p.a (Loov;)Loov;
      // 9a: athrow
      // 9b: ifnonnull cc
      // 9e: aload 0
      // 9f: dup
      // a0: getfield c9p.mop D
      // a3: ldc2_w 0.005
      // a6: dsub
      // a7: putfield c9p.mop D
      // aa: iload 3
      // ab: ifne cc
      // ae: aload 0
      // af: goto b6
      // b2: invokestatic c9p.a (Loov;)Loov;
      // b5: athrow
      // b6: fload 1
      // b7: fload 2
      // b8: invokespecial s0i.ge2 (FF)V
      // bb: iload 3
      // bc: ifne cc
      // bf: aload 0
      // c0: goto c7
      // c3: invokestatic c9p.a (Loov;)Loov;
      // c6: athrow
      // c7: fload 1
      // c8: fload 2
      // c9: invokespecial s0i.ge2 (FF)V
      // cc: return
   }

   public static void bf5(c9p var0, int var1) {
      var0.kkf(var1);
   }

   public static _tb ggu(c9p var0) {
      return var0.wjn;
   }

   public static void leu(c9p var0, boolean var1) {
      var0.er9(var1);
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-3155169707004567946L, -4918976011714439149L, MethodHandles.lookup().lookupClass()).a(190577115957628L);
      // $VF: monitorexit
      c = var10000;
      long var0 = c ^ 1605962259176L;
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
      String var6 = "nx\u0013;«\u0000\u008bVRV\u0091I\u008eá\u0098=a§\u008b2;Pe\u000e±¿dÃu\u0007åbò0ÝÛLu0è\u0081ð\u007fÇ)êÆh\u0010N«M¡¡\u0093X:<NÌ³\b&ïR\u0010é\u0013\ti\u0016\u0098\u0010c\u0005Î\b´åx\u0007\u00970\u008c2Jó%þ«\u009e!\u0007üK\u008f4ÊÞ\u001e¥æYZ\u0018ó\u009dR×*¾ú<[CkjÜ\r¹@µt\u009bO\u001f¥ÄË³\u0093(¡\u0087\u009düÞó7síè³ÙäÁs\u009bY;B\\{\u0094(ï±Òýe\u0016Ônÿß\u0082´³¯|Ø\u0093(ºÖe\u0097\u001cÖtÿ\u0080¾ovÉ5Ï¨x,ÐJ¢Á\u0092\u0086\u001b\u0087\u0090â\u00150Ï\nÐ®ö\u00838\u0092\u008c4(L7\u0006êrØqU@t\bô,c5\u001e\bc\u0098*\u001fÉ2\u0093?ÀÙ¶¼vH¦»W\u001bðO×pÚ(\u008a\u0015®8sj\u000f?\u001dD\u001dÆèc»Ó¡|\u0090ûoU\u00887ÑËI\u000e\u0014Ø`\u0007ûÕ7Ü2\u0085uq(Æe\u0089\rèù\u0011às!\fXÀÈ¤é<²\"w\u0010üÎß¢\u0003ñü|´dÓ¹{cÝdpF^(jsà\u0002\u009bÂg´ïÜ\u0003{ý&ÚY|X:#\u0099r\u0083ø\u0001¸¿¸\u0092!ò~kVþ= Ð\u0007\u00870\n\u0099¿O\u0098ê\u0002Å:YÜâFÁ\u000eVWK\u001b\u001fè9\b=:\u0085æþoÛÞ\u0000S\u001b\u009cX=Ý##¬KÓYÖº\u001e×";
      int var8 = "nx\u0013;«\u0000\u008bVRV\u0091I\u008eá\u0098=a§\u008b2;Pe\u000e±¿dÃu\u0007åbò0ÝÛLu0è\u0081ð\u007fÇ)êÆh\u0010N«M¡¡\u0093X:<NÌ³\b&ïR\u0010é\u0013\ti\u0016\u0098\u0010c\u0005Î\b´åx\u0007\u00970\u008c2Jó%þ«\u009e!\u0007üK\u008f4ÊÞ\u001e¥æYZ\u0018ó\u009dR×*¾ú<[CkjÜ\r¹@µt\u009bO\u001f¥ÄË³\u0093(¡\u0087\u009düÞó7síè³ÙäÁs\u009bY;B\\{\u0094(ï±Òýe\u0016Ônÿß\u0082´³¯|Ø\u0093(ºÖe\u0097\u001cÖtÿ\u0080¾ovÉ5Ï¨x,ÐJ¢Á\u0092\u0086\u001b\u0087\u0090â\u00150Ï\nÐ®ö\u00838\u0092\u008c4(L7\u0006êrØqU@t\bô,c5\u001e\bc\u0098*\u001fÉ2\u0093?ÀÙ¶¼vH¦»W\u001bðO×pÚ(\u008a\u0015®8sj\u000f?\u001dD\u001dÆèc»Ó¡|\u0090ûoU\u00887ÑËI\u000e\u0014Ø`\u0007ûÕ7Ü2\u0085uq(Æe\u0089\rèù\u0011às!\fXÀÈ¤é<²\"w\u0010üÎß¢\u0003ñü|´dÓ¹{cÝdpF^(jsà\u0002\u009bÂg´ïÜ\u0003{ý&ÚY|X:#\u0099r\u0083ø\u0001¸¿¸\u0092!ò~kVþ= Ð\u0007\u00870\n\u0099¿O\u0098ê\u0002Å:YÜâFÁ\u000eVWK\u001b\u001fè9\b=:\u0085æþoÛÞ\u0000S\u001b\u009cX=Ý##¬KÓYÖº\u001e×"
         .length();
      char var5 = '0';
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
                     g = var9;
                     u = new String[13];
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

                  var6 = "]\u0003é} `\u008f\u0095¾ ¥¨Cõ\u009eAá\nÚ{Ä9\u000e\u009e\u0081¹5Yå\u0014\u001897*æF\u0097\u0006!z +]FhaµÈÝ]´\u0015sÄÁ4\u0090\u0018>U¢`Æ\u001cð|»C%ÙÛÇ:";
                  var8 = "]\u0003é} `\u008f\u0095¾ ¥¨Cõ\u009eAá\nÚ{Ä9\u000e\u009e\u0081¹5Yå\u0014\u001897*æF\u0097\u0006!z +]FhaµÈÝ]´\u0015sÄÁ4\u0090\u0018>U¢`Æ\u001cð|»C%ÙÛÇ:"
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10214;
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
            throw new RuntimeException("c9p", var10);
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
         throw new RuntimeException("c9p" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
