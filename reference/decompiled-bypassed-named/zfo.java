import com.google.common.base.Predicate;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class zfo extends j37 implements wrt {
   private static final Predicate yjg;
   private static final w9p mex;
   private static final String[] wk9;
   private static final String[] v_s;
   private static final int[] t0m;
   private static final String[] nc3;
   private static final String[] ih0;
   private static final String[] qvc;
   private static final String[] zsg;
   private int t9r;
   private int dnp;
   private int bml;
   public int rf6;
   public int hy8;
   public boolean wbp;
   private _d3 p5h;
   private boolean unr;
   public int q7q;
   public float q0m;
   private boolean avu;
   private float ndn;
   private float h6u;
   private float lxm;
   private float m7x;
   private float fs9;
   private float nv_;
   private int w38;
   private String h0r;
   private String[] cbf = new String[3];
   private boolean g10 = false;
   private static final long c;
   private static final String[] h;
   private static final String[] y;
   private static final Map z = new HashMap(13);

   public zfo(OpaquePredicate var1) {
      super(var1);
      this.yxc(1.4F, 1.6F);
      this.cuj = false;
      this.kkd(false);
      ((zvv)this.zq2()).uuq(true);
      this.r1d.tn8(0, new dnq(this));
      this.r1d.tn8(1, new p1g(this, 1.2));
      this.r1d.tn8(1, new npm(this, 1.2));
      this.r1d.tn8(2, new rg_(this, 1.0));
      this.r1d.tn8(4, new bun(this, 1.0));
      this.r1d.tn8(6, new _tb(this, 0.7));
      this.r1d.tn8(7, new bdq(this, ha9.class, 6.0F));
      this.r1d.tn8(8, new ov6(this));
      this.sug();
   }

   @Override
   public void tbj() {
      super.tbj();
      this.oit.kp2(16, 0);
      this.oit.kp2(19, (byte)0);
      this.oit.kp2(20, 0);
      this.oit.kp2(21, String.valueOf(""));
      this.oit.kp2(22, 0);
   }

   public void teb(int var1) {
      this.oit.c66(19, (byte)var1);
      this.ocw();
   }

   public int zz6() {
      return this.oit.miz(19);
   }

   public void wa1(int var1) {
      this.oit.c66(20, var1);
      this.ocw();
   }

   public int sep() {
      return this.oit.zwc(20);
   }

   @Override
   public String noc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic zfo.c J
      // 03: ldc2_w 95103220192426
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokevirtual zfo.qrh ()Z
      // 10: iload 3
      // 11: ifne 2b
      // 14: ifeq 27
      // 17: goto 1e
      // 1a: invokestatic zfo.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: invokevirtual zfo.hei ()Ljava/lang/String;
      // 22: areturn
      // 23: invokestatic zfo.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: invokevirtual zfo.zz6 ()I
      // 2b: istore 4
      // 2d: iload 4
      // 2f: tableswitch 33 0 4 33 55 73 91 109
      // 50: sipush 6950
      // 53: ldc2_w 750915789678179973
      // 56: lload 1
      // 57: lxor
      // 58: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5d: nop
      // 5e: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 61: areturn
      // 62: invokestatic zfo.a (Loov;)Loov;
      // 65: athrow
      // 66: sipush 18698
      // 69: ldc2_w 2068460724317594810
      // 6c: lload 1
      // 6d: lxor
      // 6e: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: nop
      // 74: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 77: areturn
      // 78: sipush 14524
      // 7b: ldc2_w 5700553159211275608
      // 7e: lload 1
      // 7f: lxor
      // 80: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 85: nop
      // 86: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 89: areturn
      // 8a: sipush 3720
      // 8d: ldc2_w 4187216085219435313
      // 90: lload 1
      // 91: lxor
      // 92: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 97: nop
      // 98: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // 9b: areturn
      // 9c: sipush 16776
      // 9f: ldc2_w 8165441506596334649
      // a2: lload 1
      // a3: lxor
      // a4: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a9: nop
      // aa: invokestatic orr.zgh (Ljava/lang/String;)Ljava/lang/String;
      // ad: areturn
   }

   private boolean uob(int var1) {
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

   private void kq3(int param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: getfield zfo.oit Lwl1;
      // 08: bipush 16
      // 0a: invokevirtual wl1.zwc (I)I
      // 0d: istore 4
      // 0f: iload 3
      // 10: ifne 35
      // 13: iload 2
      // 14: ifeq 39
      // 17: goto 1e
      // 1a: invokestatic zfo.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: getfield zfo.oit Lwl1;
      // 22: bipush 16
      // 24: iload 4
      // 26: iload 1
      // 27: ior
      // 28: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 2b: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 2e: goto 35
      // 31: invokestatic zfo.a (Loov;)Loov;
      // 34: athrow
      // 35: iload 3
      // 36: ifeq 52
      // 39: aload 0
      // 3a: getfield zfo.oit Lwl1;
      // 3d: bipush 16
      // 3f: iload 4
      // 41: iload 1
      // 42: bipush -1
      // 43: ixor
      // 44: iand
      // 45: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 48: invokevirtual wl1.c66 (ILjava/lang/Object;)V
      // 4b: goto 52
      // 4e: invokestatic zfo.a (Loov;)Loov;
      // 51: athrow
      // 52: return
   }

   public boolean qn2() {
      int var1 = OpaquePredicate.b();

      try {
         boolean var10000 = this.ejl();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public boolean ccx() {
      return this.uob(2);
   }

   public boolean kac() {
      return this.qn2();
   }

   public String ujd() {
      return this.oit.bsd(21);
   }

   public void anv(String var1) {
      this.oit.c66(21, var1);
   }

   public float ag5() {
      return 0.5F;
   }

   @Override
   public void c_k(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: ifeq 1b
      // 08: aload 0
      // 09: aload 0
      // 0a: invokevirtual zfo.ag5 ()F
      // 0d: invokevirtual zfo.pcv (F)V
      // 10: iload 2
      // 11: ifne 27
      // 14: goto 1b
      // 17: invokestatic zfo.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: fconst_1
      // 1d: invokevirtual zfo.pcv (F)V
      // 20: goto 27
      // 23: invokestatic zfo.a (Loov;)Loov;
      // 26: athrow
      // 27: return
   }

   public boolean fhd() {
      return this.wbp;
   }

   public void pmu(boolean var1) {
      this.kq3(2, var1);
   }

   public void gd2(boolean var1) {
      this.wbp = var1;
   }

   @Override
   public boolean _rn() {
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
      // 05: invokevirtual zfo.aty ()Z
      // 08: iload 1
      // 09: ifne 21
      // 0c: ifne 33
      // 0f: goto 16
      // 12: invokestatic zfo.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial j37._rn ()Z
      // 1a: goto 21
      // 1d: invokestatic zfo.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 30
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic zfo.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   @Override
   public void um3(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: fload 1
      // 05: ldc 6.0
      // 07: nop
      // 08: fcmpl
      // 09: iload 2
      // 0a: ifne 2d
      // 0d: ifle 35
      // 10: goto 17
      // 13: invokestatic zfo.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: iload 2
      // 19: ifne 31
      // 1c: goto 23
      // 1f: invokestatic zfo.a (Loov;)Loov;
      // 22: athrow
      // 23: invokevirtual zfo.cf4 ()Z
      // 26: goto 2d
      // 29: invokestatic zfo.a (Loov;)Loov;
      // 2c: athrow
      // 2d: ifeq 35
      // 30: aload 0
      // 31: bipush 0
      // 32: invokevirtual zfo.w2i (Z)V
      // 35: return
   }

   public boolean dlx() {
      return this.uob(8);
   }

   public int xid() {
      return this.oit.zwc(22);
   }

   private int dri(erg param1) {
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
      // 05: iload 2
      // 06: ifeq 1a
      // 09: ifnonnull 19
      // 0c: goto 13
      // 0f: invokestatic zfo.a (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic zfo.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual erg.gn1 ()Lu7m;
      // 1d: astore 3
      // 1e: aload 3
      // 1f: getstatic xbr.mhm Lu7m;
      // 22: iload 2
      // 23: ifeq 3c
      // 26: if_acmpne 38
      // 29: goto 30
      // 2c: invokestatic zfo.a (Loov;)Loov;
      // 2f: athrow
      // 30: bipush 1
      // 31: goto 62
      // 34: invokestatic zfo.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 3
      // 39: getstatic xbr.fps Lu7m;
      // 3c: iload 2
      // 3d: ifeq 56
      // 40: if_acmpne 52
      // 43: goto 4a
      // 46: invokestatic zfo.a (Loov;)Loov;
      // 49: athrow
      // 4a: bipush 2
      // 4b: goto 62
      // 4e: invokestatic zfo.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 3
      // 53: getstatic xbr.krl Lu7m;
      // 56: if_acmpne 61
      // 59: bipush 3
      // 5a: goto 62
      // 5d: invokestatic zfo.a (Loov;)Loov;
      // 60: athrow
      // 61: bipush 0
      // 62: ireturn
   }

   public boolean cf4() {
      return this.uob(32);
   }

   public boolean mum() {
      return this.uob(64);
   }

   public boolean r8i() {
      return this.uob(16);
   }

   public boolean sha() {
      return this.unr;
   }

   public void sfu(erg var1) {
      this.oit.c66(22, this.dri(var1));
      this.ocw();
   }

   public void vy4(boolean var1) {
      this.kq3(16, var1);
   }

   public void kkd(boolean var1) {
      this.kq3(8, var1);
   }

   public void wj5(boolean var1) {
      this.unr = var1;
   }

   public void uvk(boolean var1) {
      this.kq3(4, var1);
   }

   public int djz() {
      return this.q7q;
   }

   public void h22(int var1) {
      this.q7q = var1;
   }

   public int tpx(int var1) {
      int var2 = fe6.faa(this.djz() + var1, 0, this.dpa());
      this.h22(var2);
      return var2;
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
      // 04: aload 1
      // 05: invokevirtual ofh.nra ()Li2h;
      // 08: astore 4
      // 0a: aload 0
      // 0b: iload 3
      // 0c: ifeq 43
      // 0f: getfield zfo.wgv Li2h;
      // 12: ifnull 42
      // 15: goto 1c
      // 18: invokestatic zfo.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: iload 3
      // 1e: ifeq 43
      // 21: goto 28
      // 24: invokestatic zfo.a (Loov;)Loov;
      // 27: athrow
      // 28: getfield zfo.wgv Li2h;
      // 2b: aload 4
      // 2d: invokevirtual EntityLivingBase.equals (Ljava/lang/Object;)Z
      // 30: ifeq 42
      // 33: goto 3a
      // 36: invokestatic zfo.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 0
      // 3b: goto 48
      // 3e: invokestatic zfo.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: aload 1
      // 44: fload 2
      // 45: invokespecial j37.m1t (Lofh;F)Z
      // 48: ireturn
   }

   @Override
   public int y5z() {
      return t0m[this.xid()];
   }

   @Override
   public boolean tfh() {
      try {
         if (this.wgv == null) {
            return true;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return false;
   }

   public boolean aqx() {
      int var1 = fe6.jqf(this.o2v);
      int var2 = fe6.jqf(this.vbd);
      this.oay.getBiomeGenForCoords(new mew(var1, 0, var2));
      return true;
   }

   public void iju() {
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
      // 05: getfield zfo.oay Lt9d;
      // 08: getfield OpaquePredicate.v0f Z
      // 0b: iload 1
      // 0c: ifne 2f
      // 0f: ifne 4a
      // 12: goto 19
      // 15: invokestatic zfo.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifne 46
      // 1e: goto 25
      // 21: invokestatic zfo.a (Loov;)Loov;
      // 24: athrow
      // 25: invokevirtual zfo.dlx ()Z
      // 28: goto 2f
      // 2b: invokestatic zfo.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifeq 4a
      // 32: aload 0
      // 33: getstatic ox_.cug Lhrd;
      // 36: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 39: bipush 1
      // 3a: invokevirtual zfo.e70 (Lu7m;I)Lnvf;
      // 3d: pop
      // 3e: aload 0
      // 3f: goto 46
      // 42: invokestatic zfo.a (Loov;)Loov;
      // 45: athrow
      // 46: bipush 0
      // 47: invokevirtual zfo.kkd (Z)V
      // 4a: return
   }

   private void w_f() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic zfo.c J
      // 03: ldc2_w 2653702545054
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.c ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokespecial zfo.__g ()V
      // 10: aload 0
      // 11: iload 3
      // 12: ifne 2a
      // 15: invokevirtual zfo.o3x ()Z
      // 18: ifne 55
      // 1b: goto 22
      // 1e: invokestatic zfo.a (Loov;)Loov;
      // 21: athrow
      // 22: aload 0
      // 23: goto 2a
      // 26: invokestatic zfo.a (Loov;)Loov;
      // 29: athrow
      // 2a: getfield zfo.oay Lt9d;
      // 2d: aload 0
      // 2e: sipush 11646
      // 31: ldc2_w 6638589109855914734
      // 34: lload 1
      // 35: lxor
      // 36: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3b: nop
      // 3c: fconst_1
      // 3d: fconst_1
      // 3e: aload 0
      // 3f: getfield zfo.z2d Ljava/util/Random;
      // 42: invokevirtual java/util/Random.nextFloat ()F
      // 45: aload 0
      // 46: getfield zfo.z2d Ljava/util/Random;
      // 49: invokevirtual java/util/Random.nextFloat ()F
      // 4c: fsub
      // 4d: ldc 0.2
      // 4f: nop
      // 50: fmul
      // 51: fadd
      // 52: invokevirtual OpaquePredicate.yfq (Li2h;Ljava/lang/String;FF)V
      // 55: return
   }

   @Override
   public void ibc(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zfo.c J
      // 003: ldc2_w 104637166855181
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: fload 1
      // 00e: fconst_1
      // 00f: fcmpl
      // 010: iload 5
      // 012: ifne 04a
      // 015: ifle 03c
      // 018: goto 01f
      // 01b: invokestatic zfo.a (Loov;)Loov;
      // 01e: athrow
      // 01f: aload 0
      // 020: sipush 7599
      // 023: ldc2_w 3837001394977882310
      // 026: lload 3
      // 027: lxor
      // 028: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02d: nop
      // 02e: ldc 0.4
      // 030: nop
      // 031: fconst_1
      // 032: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 035: goto 03c
      // 038: invokestatic zfo.a (Loov;)Loov;
      // 03b: athrow
      // 03c: fload 1
      // 03d: ldc 0.5
      // 03f: nop
      // 040: fmul
      // 041: ldc 3.0
      // 043: nop
      // 044: fsub
      // 045: fload 2
      // 046: fmul
      // 047: invokestatic fe6.v1i (F)I
      // 04a: istore 6
      // 04c: iload 6
      // 04e: iload 5
      // 050: ifne 06e
      // 053: ifle 101
      // 056: goto 05d
      // 059: invokestatic zfo.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: getstatic ofh.m8d Lofh;
      // 061: iload 6
      // 063: i2f
      // 064: invokevirtual zfo.m1t (Lofh;F)Z
      // 067: goto 06e
      // 06a: invokestatic zfo.a (Loov;)Loov;
      // 06d: athrow
      // 06e: pop
      // 06f: aload 0
      // 070: iload 5
      // 072: ifne 098
      // 075: getfield zfo.wgv Li2h;
      // 078: ifnull 097
      // 07b: goto 082
      // 07e: invokestatic zfo.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: getfield zfo.wgv Li2h;
      // 086: getstatic ofh.m8d Lofh;
      // 089: iload 6
      // 08b: i2f
      // 08c: invokevirtual EntityLivingBase.m1t (Lofh;F)Z
      // 08f: pop
      // 090: goto 097
      // 093: invokestatic zfo.a (Loov;)Loov;
      // 096: athrow
      // 097: aload 0
      // 098: getfield zfo.oay Lt9d;
      // 09b: new mew
      // 09e: dup
      // 09f: aload 0
      // 0a0: getfield zfo.o2v D
      // 0a3: aload 0
      // 0a4: getfield zfo.kfp D
      // 0a7: ldc2_w 0.2
      // 0aa: dsub
      // 0ab: aload 0
      // 0ac: getfield zfo.p3h F
      // 0af: f2d
      // 0b0: dsub
      // 0b1: aload 0
      // 0b2: getfield zfo.vbd D
      // 0b5: invokespecial mew.<init> (DDD)V
      // 0b8: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0bb: invokeinterface zfz.r_y ()Le0x; 1
      // 0c0: astore 7
      // 0c2: aload 7
      // 0c4: invokevirtual e0x.p1r ()Lp3y;
      // 0c7: getstatic p3y.cei Lp3y;
      // 0ca: if_acmpeq 101
      // 0cd: aload 0
      // 0ce: invokevirtual zfo.o3x ()Z
      // 0d1: ifne 101
      // 0d4: goto 0db
      // 0d7: invokestatic zfo.a (Loov;)Loov;
      // 0da: athrow
      // 0db: aload 7
      // 0dd: getfield e0x.zu6 Le0x$zvv;
      // 0e0: astore 8
      // 0e2: aload 0
      // 0e3: getfield zfo.oay Lt9d;
      // 0e6: aload 0
      // 0e7: aload 8
      // 0e9: invokevirtual e0x$zvv.i3r ()Ljava/lang/String;
      // 0ec: aload 8
      // 0ee: invokevirtual e0x$zvv.dnt ()F
      // 0f1: ldc 0.5
      // 0f3: nop
      // 0f4: fmul
      // 0f5: aload 8
      // 0f7: invokevirtual e0x$zvv.kjj ()F
      // 0fa: ldc 0.75
      // 0fc: nop
      // 0fd: fmul
      // 0fe: invokevirtual OpaquePredicate.yfq (Li2h;Ljava/lang/String;FF)V
      // 101: return
   }

   private int f5x() {
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
      // 05: invokevirtual zfo.zz6 ()I
      // 08: istore 2
      // 09: aload 0
      // 0a: invokevirtual zfo.dlx ()Z
      // 0d: iload 1
      // 0e: ifne 4a
      // 11: ifeq 49
      // 14: goto 1b
      // 17: invokestatic zfo.a (Loov;)Loov;
      // 1a: athrow
      // 1b: iload 2
      // 1c: bipush 1
      // 1d: iload 1
      // 1e: ifne 46
      // 21: goto 28
      // 24: invokestatic zfo.a (Loov;)Loov;
      // 27: athrow
      // 28: if_icmpeq 4d
      // 2b: goto 32
      // 2e: invokestatic zfo.a (Loov;)Loov;
      // 31: athrow
      // 32: iload 2
      // 33: iload 1
      // 34: ifne 4a
      // 37: goto 3e
      // 3a: invokestatic zfo.a (Loov;)Loov;
      // 3d: athrow
      // 3e: bipush 2
      // 3f: goto 46
      // 42: invokestatic zfo.a (Loov;)Loov;
      // 45: athrow
      // 46: if_icmpeq 4d
      // 49: bipush 2
      // 4a: goto 4f
      // 4d: bipush 17
      // 4f: ireturn
   }

   private void sug() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic zfo.c J
      // 03: ldc2_w 100252272944734
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: getfield zfo.p5h L_d3;
      // 0c: astore 4
      // 0e: invokestatic OpaquePredicate.c ()I
      // 11: aload 0
      // 12: new _d3
      // 15: dup
      // 16: sipush 4756
      // 19: ldc2_w 7753566692534357452
      // 1c: lload 1
      // 1d: lxor
      // 1e: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 23: nop
      // 24: aload 0
      // 25: invokespecial zfo.f5x ()I
      // 28: invokespecial _d3.<init> (Ljava/lang/String;I)V
      // 2b: putfield zfo.p5h L_d3;
      // 2e: istore 3
      // 2f: aload 0
      // 30: getfield zfo.p5h L_d3;
      // 33: aload 0
      // 34: invokevirtual zfo.noc ()Ljava/lang/String;
      // 37: invokevirtual _d3.ck1 (Ljava/lang/String;)V
      // 3a: aload 4
      // 3c: iload 3
      // 3d: ifne af
      // 40: ifnull ab
      // 43: goto 4a
      // 46: invokestatic zfo.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 4
      // 4c: aload 0
      // 4d: invokevirtual _d3.oax (Lwrt;)V
      // 50: aload 4
      // 52: invokevirtual _d3.opt ()I
      // 55: aload 0
      // 56: getfield zfo.p5h L_d3;
      // 59: invokevirtual _d3.opt ()I
      // 5c: invokestatic java/lang/Math.min (II)I
      // 5f: istore 5
      // 61: bipush 0
      // 62: istore 6
      // 64: iload 6
      // 66: iload 5
      // 68: if_icmpge ab
      // 6b: aload 4
      // 6d: iload 6
      // 6f: invokevirtual _d3.ibn (I)Lerg;
      // 72: astore 7
      // 74: iload 3
      // 75: ifne b7
      // 78: iload 3
      // 79: ifne a7
      // 7c: goto 83
      // 7f: invokestatic zfo.a (Loov;)Loov;
      // 82: athrow
      // 83: aload 7
      // 85: ifnull a4
      // 88: goto 8f
      // 8b: invokestatic zfo.a (Loov;)Loov;
      // 8e: athrow
      // 8f: aload 0
      // 90: getfield zfo.p5h L_d3;
      // 93: iload 6
      // 95: aload 7
      // 97: invokevirtual erg.yaq ()Lerg;
      // 9a: invokevirtual _d3.cxl (ILerg;)V
      // 9d: goto a4
      // a0: invokestatic zfo.a (Loov;)Loov;
      // a3: athrow
      // a4: iinc 6 1
      // a7: iload 3
      // a8: ifeq 64
      // ab: aload 0
      // ac: getfield zfo.p5h L_d3;
      // af: aload 0
      // b0: invokevirtual _d3.y55 (Lwrt;)V
      // b3: aload 0
      // b4: invokespecial zfo._yh ()V
      // b7: return
   }

   private void _yh() {
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
      // 06: ifne 21
      // 09: getfield zfo.oay Lt9d;
      // 0c: getfield OpaquePredicate.v0f Z
      // 0f: ifne 5d
      // 12: goto 19
      // 15: invokestatic zfo.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: goto 21
      // 1d: invokestatic zfo.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield zfo.p5h L_d3;
      // 25: bipush 0
      // 26: invokevirtual _d3.ibn (I)Lerg;
      // 29: ifnull 34
      // 2c: bipush 1
      // 2d: goto 35
      // 30: invokestatic zfo.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: invokevirtual zfo.uvk (Z)V
      // 38: aload 0
      // 39: iload 1
      // 3a: ifne 52
      // 3d: invokevirtual zfo.sp4 ()Z
      // 40: ifeq 5d
      // 43: goto 4a
      // 46: invokestatic zfo.a (Loov;)Loov;
      // 49: athrow
      // 4a: aload 0
      // 4b: goto 52
      // 4e: invokestatic zfo.a (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: getfield zfo.p5h L_d3;
      // 56: bipush 1
      // 57: invokevirtual _d3.ibn (I)Lerg;
      // 5a: invokevirtual zfo.sfu (Lerg;)V
      // 5d: return
   }

   @Override
   public void zsl(goq param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zfo.c J
      // 003: ldc2_w 96053523988204
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: invokevirtual zfo.xid ()I
      // 00c: istore 5
      // 00e: invokestatic OpaquePredicate.c ()I
      // 011: aload 0
      // 012: invokevirtual zfo.cbz ()Z
      // 015: istore 6
      // 017: aload 0
      // 018: invokespecial zfo._yh ()V
      // 01b: istore 4
      // 01d: aload 0
      // 01e: getfield zfo.g25 I
      // 021: iload 4
      // 023: ifne 03b
      // 026: bipush 20
      // 028: if_icmple 102
      // 02b: goto 032
      // 02e: invokestatic zfo.a (Loov;)Loov;
      // 031: athrow
      // 032: iload 5
      // 034: goto 03b
      // 037: invokestatic zfo.a (Loov;)Loov;
      // 03a: athrow
      // 03b: iload 4
      // 03d: ifne 091
      // 040: ifne 088
      // 043: goto 04a
      // 046: invokestatic zfo.a (Loov;)Loov;
      // 049: athrow
      // 04a: iload 5
      // 04c: aload 0
      // 04d: invokevirtual zfo.xid ()I
      // 050: iload 4
      // 052: ifne 0a1
      // 055: goto 05c
      // 058: invokestatic zfo.a (Loov;)Loov;
      // 05b: athrow
      // 05c: if_icmpeq 088
      // 05f: goto 066
      // 062: invokestatic zfo.a (Loov;)Loov;
      // 065: athrow
      // 066: aload 0
      // 067: sipush 6230
      // 06a: ldc2_w 5832628512637935597
      // 06d: lload 2
      // 06e: lxor
      // 06f: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 074: nop
      // 075: ldc 0.5
      // 077: nop
      // 078: fconst_1
      // 079: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 07c: iload 4
      // 07e: ifeq 0c1
      // 081: goto 088
      // 084: invokestatic zfo.a (Loov;)Loov;
      // 087: athrow
      // 088: iload 5
      // 08a: goto 091
      // 08d: invokestatic zfo.a (Loov;)Loov;
      // 090: athrow
      // 091: iload 4
      // 093: ifne 0c3
      // 096: aload 0
      // 097: invokevirtual zfo.xid ()I
      // 09a: goto 0a1
      // 09d: invokestatic zfo.a (Loov;)Loov;
      // 0a0: athrow
      // 0a1: if_icmpeq 0c1
      // 0a4: aload 0
      // 0a5: sipush 8310
      // 0a8: ldc2_w 4554710600115873686
      // 0ab: lload 2
      // 0ac: lxor
      // 0ad: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b2: nop
      // 0b3: ldc 0.5
      // 0b5: nop
      // 0b6: fconst_1
      // 0b7: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 0ba: goto 0c1
      // 0bd: invokestatic zfo.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: iload 6
      // 0c3: iload 4
      // 0c5: ifne 0e9
      // 0c8: ifne 102
      // 0cb: goto 0d2
      // 0ce: invokestatic zfo.a (Loov;)Loov;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: iload 4
      // 0d5: ifne 0ed
      // 0d8: goto 0df
      // 0db: invokestatic zfo.a (Loov;)Loov;
      // 0de: athrow
      // 0df: invokevirtual zfo.cbz ()Z
      // 0e2: goto 0e9
      // 0e5: invokestatic zfo.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: ifeq 102
      // 0ec: aload 0
      // 0ed: sipush 26981
      // 0f0: ldc2_w 3859679303768288968
      // 0f3: lload 2
      // 0f4: lxor
      // 0f5: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0fa: nop
      // 0fb: ldc 0.5
      // 0fd: nop
      // 0fe: fconst_1
      // 0ff: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 102: return
   }

   @Override
   public boolean iaw() {
      this.aqx();
      return super.iaw();
   }

   public zfo l9a(EntityLivingBase var1, double var2) {
      double var5 = Double.MAX_VALUE;
      int var10000 = OpaquePredicate.c();
      EntityLivingBase var7 = null;
      Iterator var8 = this.oay.sr2(var1, var1.aaw().z9h(var2, var2, var2), yjg).iterator();
      int var4 = var10000;

      while (true) {
         if (var8.hasNext()) {
            EntityLivingBase var9 = (EntityLivingBase)var8.next();
            var13 = var9;
            if (var4 != 0) {
               break;
            }

            double var10 = var9.p53(var1.o2v, var1.kfp, var1.vbd);

            label30: {
               label29: {
                  try {
                     var14 = var10;
                     if (var4 != 0) {
                        break label29;
                     }

                     if (!(var10 < var5)) {
                        break label30;
                     }
                  } catch (oov var12) {
                     throw a(var12);
                  }

                  var7 = var9;
                  var14 = var10;
               }

               var5 = var14;
            }

            if (var4 == 0) {
               continue;
            }
         }

         var13 = var7;
         break;
      }

      return (zfo)var13;
   }

   public double ena() {
      return this.dgt(mex).nz5();
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
      // 00: getstatic zfo.c J
      // 03: ldc2_w 105847627515125
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: invokespecial zfo.__g ()V
      // 0c: invokestatic OpaquePredicate.b ()I
      // 0f: aload 0
      // 10: invokevirtual zfo.zz6 ()I
      // 13: istore 4
      // 15: istore 3
      // 16: iload 4
      // 18: bipush 3
      // 19: iload 3
      // 1a: ifeq 3f
      // 1d: if_icmpne 3c
      // 20: goto 27
      // 23: invokestatic zfo.a (Loov;)Loov;
      // 26: athrow
      // 27: sipush 26487
      // 2a: ldc2_w 8257786590090009339
      // 2d: lload 1
      // 2e: lxor
      // 2f: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 34: nop
      // 35: goto a3
      // 38: invokestatic zfo.a (Loov;)Loov;
      // 3b: athrow
      // 3c: iload 4
      // 3e: bipush 4
      // 3f: iload 3
      // 40: ifeq 65
      // 43: if_icmpne 62
      // 46: goto 4d
      // 49: invokestatic zfo.a (Loov;)Loov;
      // 4c: athrow
      // 4d: sipush 23147
      // 50: ldc2_w 1173112500247472084
      // 53: lload 1
      // 54: lxor
      // 55: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 5a: nop
      // 5b: goto a3
      // 5e: invokestatic zfo.a (Loov;)Loov;
      // 61: athrow
      // 62: iload 4
      // 64: bipush 1
      // 65: iload 3
      // 66: ifeq 7d
      // 69: if_icmpeq 95
      // 6c: goto 73
      // 6f: invokestatic zfo.a (Loov;)Loov;
      // 72: athrow
      // 73: iload 4
      // 75: bipush 2
      // 76: goto 7d
      // 79: invokestatic zfo.a (Loov;)Loov;
      // 7c: athrow
      // 7d: if_icmpeq 95
      // 80: sipush 24866
      // 83: ldc2_w 7703657729168481500
      // 86: lload 1
      // 87: lxor
      // 88: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8d: nop
      // 8e: goto a3
      // 91: invokestatic zfo.a (Loov;)Loov;
      // 94: athrow
      // 95: sipush 18245
      // 98: ldc2_w 2754613640769223333
      // 9b: lload 1
      // 9c: lxor
      // 9d: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // a2: nop
      // a3: areturn
   }

   @Override
   public u7m q4n() {
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
      // 05: getfield zfo.z2d Ljava/util/Random;
      // 08: bipush 4
      // 09: invokevirtual java/util/Random.nextInt (I)I
      // 0c: iload 1
      // 0d: ifeq 1b
      // 10: ifne 1e
      // 13: goto 1a
      // 16: invokestatic zfo.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: goto 1f
      // 1e: bipush 0
      // 1f: istore 2
      // 20: aload 0
      // 21: invokevirtual zfo.zz6 ()I
      // 24: istore 3
      // 25: iload 3
      // 26: bipush 4
      // 27: iload 1
      // 28: ifeq 4c
      // 2b: if_icmpne 3f
      // 2e: goto 35
      // 31: invokestatic zfo.a (Loov;)Loov;
      // 34: athrow
      // 35: getstatic xbr.pl_ Lu7m;
      // 38: goto 64
      // 3b: invokestatic zfo.a (Loov;)Loov;
      // 3e: athrow
      // 3f: iload 3
      // 40: iload 1
      // 41: ifeq 50
      // 44: bipush 3
      // 45: goto 4c
      // 48: invokestatic zfo.a (Loov;)Loov;
      // 4b: athrow
      // 4c: if_icmpne 61
      // 4f: iload 2
      // 50: ifeq 5b
      // 53: aconst_null
      // 54: goto 64
      // 57: invokestatic zfo.a (Loov;)Loov;
      // 5a: athrow
      // 5b: getstatic xbr.ii5 Lu7m;
      // 5e: goto 64
      // 61: getstatic xbr.i8v Lu7m;
      // 64: areturn
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
      // 00: getstatic zfo.c J
      // 03: ldc2_w 104669784093371
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokespecial zfo.__g ()V
      // 10: aload 0
      // 11: getfield zfo.z2d Ljava/util/Random;
      // 14: bipush 3
      // 15: invokevirtual java/util/Random.nextInt (I)I
      // 18: iload 3
      // 19: ifeq 35
      // 1c: ifne 31
      // 1f: goto 26
      // 22: invokestatic zfo.a (Loov;)Loov;
      // 25: athrow
      // 26: aload 0
      // 27: invokespecial zfo.fkj ()V
      // 2a: goto 31
      // 2d: invokestatic zfo.a (Loov;)Loov;
      // 30: athrow
      // 31: aload 0
      // 32: invokevirtual zfo.zz6 ()I
      // 35: istore 4
      // 37: iload 4
      // 39: bipush 3
      // 3a: iload 3
      // 3b: ifeq 60
      // 3e: if_icmpne 5d
      // 41: goto 48
      // 44: invokestatic zfo.a (Loov;)Loov;
      // 47: athrow
      // 48: sipush 28970
      // 4b: ldc2_w 5001084670769380053
      // 4e: lload 1
      // 4f: lxor
      // 50: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 55: nop
      // 56: goto c4
      // 59: invokestatic zfo.a (Loov;)Loov;
      // 5c: athrow
      // 5d: iload 4
      // 5f: bipush 4
      // 60: iload 3
      // 61: ifeq 86
      // 64: if_icmpne 83
      // 67: goto 6e
      // 6a: invokestatic zfo.a (Loov;)Loov;
      // 6d: athrow
      // 6e: sipush 26250
      // 71: ldc2_w 3412148913256508726
      // 74: lload 1
      // 75: lxor
      // 76: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: nop
      // 7c: goto c4
      // 7f: invokestatic zfo.a (Loov;)Loov;
      // 82: athrow
      // 83: iload 4
      // 85: bipush 1
      // 86: iload 3
      // 87: ifeq 9e
      // 8a: if_icmpeq b6
      // 8d: goto 94
      // 90: invokestatic zfo.a (Loov;)Loov;
      // 93: athrow
      // 94: iload 4
      // 96: bipush 2
      // 97: goto 9e
      // 9a: invokestatic zfo.a (Loov;)Loov;
      // 9d: athrow
      // 9e: if_icmpeq b6
      // a1: sipush 23770
      // a4: ldc2_w 5885068200634390324
      // a7: lload 1
      // a8: lxor
      // a9: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // ae: nop
      // af: goto c4
      // b2: invokestatic zfo.a (Loov;)Loov;
      // b5: athrow
      // b6: sipush 14469
      // b9: ldc2_w 5056359067433137009
      // bc: lload 1
      // bd: lxor
      // be: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c3: nop
      // c4: areturn
   }

   public boolean cbz() {
      return this.uob(4);
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
      // 00: getstatic zfo.c J
      // 03: ldc2_w 76498182979011
      // 06: lxor
      // 07: lstore 1
      // 08: invokestatic OpaquePredicate.b ()I
      // 0b: istore 3
      // 0c: aload 0
      // 0d: invokespecial zfo.__g ()V
      // 10: aload 0
      // 11: getfield zfo.z2d Ljava/util/Random;
      // 14: bipush 10
      // 16: invokevirtual java/util/Random.nextInt (I)I
      // 19: iload 3
      // 1a: ifeq 4f
      // 1d: ifne 4b
      // 20: goto 27
      // 23: invokestatic zfo.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 0
      // 28: invokevirtual zfo.a81 ()Z
      // 2b: iload 3
      // 2c: ifeq 4f
      // 2f: goto 36
      // 32: invokestatic zfo.a (Loov;)Loov;
      // 35: athrow
      // 36: ifne 4b
      // 39: goto 40
      // 3c: invokestatic zfo.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: invokespecial zfo.fkj ()V
      // 44: goto 4b
      // 47: invokestatic zfo.a (Loov;)Loov;
      // 4a: athrow
      // 4b: aload 0
      // 4c: invokevirtual zfo.zz6 ()I
      // 4f: istore 4
      // 51: iload 4
      // 53: bipush 3
      // 54: iload 3
      // 55: ifeq 7a
      // 58: if_icmpne 77
      // 5b: goto 62
      // 5e: invokestatic zfo.a (Loov;)Loov;
      // 61: athrow
      // 62: sipush 15888
      // 65: ldc2_w 5059734542913665665
      // 68: lload 1
      // 69: lxor
      // 6a: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 6f: nop
      // 70: goto de
      // 73: invokestatic zfo.a (Loov;)Loov;
      // 76: athrow
      // 77: iload 4
      // 79: bipush 4
      // 7a: iload 3
      // 7b: ifeq a0
      // 7e: if_icmpne 9d
      // 81: goto 88
      // 84: invokestatic zfo.a (Loov;)Loov;
      // 87: athrow
      // 88: sipush 22278
      // 8b: ldc2_w 7095429145660625851
      // 8e: lload 1
      // 8f: lxor
      // 90: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 95: nop
      // 96: goto de
      // 99: invokestatic zfo.a (Loov;)Loov;
      // 9c: athrow
      // 9d: iload 4
      // 9f: bipush 1
      // a0: iload 3
      // a1: ifeq b8
      // a4: if_icmpeq d0
      // a7: goto ae
      // aa: invokestatic zfo.a (Loov;)Loov;
      // ad: athrow
      // ae: iload 4
      // b0: bipush 2
      // b1: goto b8
      // b4: invokestatic zfo.a (Loov;)Loov;
      // b7: athrow
      // b8: if_icmpeq d0
      // bb: sipush 25947
      // be: ldc2_w 432723347580232137
      // c1: lload 1
      // c2: lxor
      // c3: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // c8: nop
      // c9: goto de
      // cc: invokestatic zfo.a (Loov;)Loov;
      // cf: athrow
      // d0: sipush 20617
      // d3: ldc2_w 4929973050712953910
      // d6: lload 1
      // d7: lxor
      // d8: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // dd: nop
      // de: areturn
   }

   public String kco() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic zfo.c J
      // 03: ldc2_w 123796108877316
      // 06: lxor
      // 07: lstore 1
      // 08: aload 0
      // 09: invokespecial zfo.__g ()V
      // 0c: invokestatic OpaquePredicate.c ()I
      // 0f: aload 0
      // 10: invokespecial zfo.fkj ()V
      // 13: aload 0
      // 14: invokevirtual zfo.zz6 ()I
      // 17: istore 4
      // 19: istore 3
      // 1a: iload 4
      // 1c: bipush 3
      // 1d: iload 3
      // 1e: ifne 35
      // 21: if_icmpeq 8e
      // 24: goto 2b
      // 27: invokestatic zfo.a (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 4
      // 2d: bipush 4
      // 2e: goto 35
      // 31: invokestatic zfo.a (Loov;)Loov;
      // 34: athrow
      // 35: iload 3
      // 36: ifne 4d
      // 39: if_icmpeq 8e
      // 3c: goto 43
      // 3f: invokestatic zfo.a (Loov;)Loov;
      // 42: athrow
      // 43: iload 4
      // 45: bipush 1
      // 46: goto 4d
      // 49: invokestatic zfo.a (Loov;)Loov;
      // 4c: athrow
      // 4d: iload 3
      // 4e: ifne 65
      // 51: if_icmpeq 7d
      // 54: goto 5b
      // 57: invokestatic zfo.a (Loov;)Loov;
      // 5a: athrow
      // 5b: iload 4
      // 5d: bipush 2
      // 5e: goto 65
      // 61: invokestatic zfo.a (Loov;)Loov;
      // 64: athrow
      // 65: if_icmpeq 7d
      // 68: sipush 13072
      // 6b: ldc2_w 4529564164111520774
      // 6e: lload 1
      // 6f: lxor
      // 70: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 75: nop
      // 76: goto 8f
      // 79: invokestatic zfo.a (Loov;)Loov;
      // 7c: athrow
      // 7d: sipush 23296
      // 80: ldc2_w 4595420693460270167
      // 83: lload 1
      // 84: lxor
      // 85: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8a: nop
      // 8b: goto 8f
      // 8e: aconst_null
      // 8f: areturn
   }

   @Override
   public void cmh(mew param1, e0x param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zfo.c J
      // 003: ldc2_w 22257368915385
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 2
      // 00e: getfield e0x.zu6 Le0x$zvv;
      // 011: astore 6
      // 013: aload 0
      // 014: getfield zfo.oay Lt9d;
      // 017: aload 1
      // 018: invokevirtual mew.nuv ()Lmew;
      // 01b: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 01e: invokeinterface zfz.r_y ()Le0x; 1
      // 023: iload 5
      // 025: ifne 03e
      // 028: getstatic ox_.dxo Le0x;
      // 02b: if_acmpne 03d
      // 02e: goto 035
      // 031: invokestatic zfo.a (Loov;)Loov;
      // 034: athrow
      // 035: getstatic ox_.dxo Le0x;
      // 038: getfield e0x.zu6 Le0x$zvv;
      // 03b: astore 6
      // 03d: aload 2
      // 03e: invokevirtual e0x.p1r ()Lp3y;
      // 041: invokevirtual p3y.l7j ()Z
      // 044: iload 5
      // 046: ifne 05e
      // 049: ifne 1f8
      // 04c: goto 053
      // 04f: invokestatic zfo.a (Loov;)Loov;
      // 052: athrow
      // 053: aload 0
      // 054: invokevirtual zfo.zz6 ()I
      // 057: goto 05e
      // 05a: invokestatic zfo.a (Loov;)Loov;
      // 05d: athrow
      // 05e: istore 7
      // 060: aload 0
      // 061: getfield zfo.wgv Li2h;
      // 064: ifnull 196
      // 067: iload 7
      // 069: bipush 1
      // 06a: iload 5
      // 06c: ifne 08a
      // 06f: goto 076
      // 072: invokestatic zfo.a (Loov;)Loov;
      // 075: athrow
      // 076: if_icmpeq 196
      // 079: goto 080
      // 07c: invokestatic zfo.a (Loov;)Loov;
      // 07f: athrow
      // 080: iload 7
      // 082: bipush 2
      // 083: goto 08a
      // 086: invokestatic zfo.a (Loov;)Loov;
      // 089: athrow
      // 08a: iload 5
      // 08c: ifne 0af
      // 08f: if_icmpeq 196
      // 092: goto 099
      // 095: invokestatic zfo.a (Loov;)Loov;
      // 098: athrow
      // 099: aload 0
      // 09a: dup
      // 09b: getfield zfo.w38 I
      // 09e: bipush 1
      // 09f: iadd
      // 0a0: putfield zfo.w38 I
      // 0a3: aload 0
      // 0a4: getfield zfo.w38 I
      // 0a7: bipush 5
      // 0a8: goto 0af
      // 0ab: invokestatic zfo.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: iload 5
      // 0b1: ifne 16e
      // 0b4: if_icmple 156
      // 0b7: goto 0be
      // 0ba: invokestatic zfo.a (Loov;)Loov;
      // 0bd: athrow
      // 0be: aload 0
      // 0bf: getfield zfo.w38 I
      // 0c2: bipush 3
      // 0c3: irem
      // 0c4: iload 5
      // 0c6: ifne 16d
      // 0c9: goto 0d0
      // 0cc: invokestatic zfo.a (Loov;)Loov;
      // 0cf: athrow
      // 0d0: ifne 156
      // 0d3: goto 0da
      // 0d6: invokestatic zfo.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: aload 0
      // 0db: sipush 5478
      // 0de: ldc2_w 818640762370863508
      // 0e1: lload 3
      // 0e2: lxor
      // 0e3: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e8: nop
      // 0e9: aload 6
      // 0eb: invokevirtual e0x$zvv.dnt ()F
      // 0ee: ldc 0.15
      // 0f0: nop
      // 0f1: fmul
      // 0f2: aload 6
      // 0f4: invokevirtual e0x$zvv.kjj ()F
      // 0f7: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 0fa: iload 7
      // 0fc: iload 5
      // 0fe: ifne 12e
      // 101: goto 108
      // 104: invokestatic zfo.a (Loov;)Loov;
      // 107: athrow
      // 108: ifne 1f8
      // 10b: goto 112
      // 10e: invokestatic zfo.a (Loov;)Loov;
      // 111: athrow
      // 112: aload 0
      // 113: iload 5
      // 115: ifne 132
      // 118: goto 11f
      // 11b: invokestatic zfo.a (Loov;)Loov;
      // 11e: athrow
      // 11f: getfield zfo.z2d Ljava/util/Random;
      // 122: bipush 10
      // 124: invokevirtual java/util/Random.nextInt (I)I
      // 127: goto 12e
      // 12a: invokestatic zfo.a (Loov;)Loov;
      // 12d: athrow
      // 12e: ifne 1f8
      // 131: aload 0
      // 132: sipush 15739
      // 135: ldc2_w 2644487495583046046
      // 138: lload 3
      // 139: lxor
      // 13a: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 13f: nop
      // 140: aload 6
      // 142: invokevirtual e0x$zvv.dnt ()F
      // 145: ldc 0.6
      // 147: nop
      // 148: fmul
      // 149: aload 6
      // 14b: invokevirtual e0x$zvv.kjj ()F
      // 14e: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 151: iload 5
      // 153: ifeq 1f8
      // 156: aload 0
      // 157: iload 5
      // 159: ifne 172
      // 15c: goto 163
      // 15f: invokestatic zfo.a (Loov;)Loov;
      // 162: athrow
      // 163: getfield zfo.w38 I
      // 166: goto 16d
      // 169: invokestatic zfo.a (Loov;)Loov;
      // 16c: athrow
      // 16d: bipush 5
      // 16e: if_icmpgt 1f8
      // 171: aload 0
      // 172: sipush 25815
      // 175: ldc2_w 4659667750795657278
      // 178: lload 3
      // 179: lxor
      // 17a: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17f: nop
      // 180: aload 6
      // 182: invokevirtual e0x$zvv.dnt ()F
      // 185: ldc 0.15
      // 187: nop
      // 188: fmul
      // 189: aload 6
      // 18b: invokevirtual e0x$zvv.kjj ()F
      // 18e: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 191: iload 5
      // 193: ifeq 1f8
      // 196: aload 6
      // 198: getstatic e0x.l18 Le0x$zvv;
      // 19b: if_acmpne 1d1
      // 19e: goto 1a5
      // 1a1: invokestatic zfo.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: aload 0
      // 1a6: sipush 3634
      // 1a9: ldc2_w 7814134892898659043
      // 1ac: lload 3
      // 1ad: lxor
      // 1ae: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b3: nop
      // 1b4: aload 6
      // 1b6: invokevirtual e0x$zvv.dnt ()F
      // 1b9: ldc 0.15
      // 1bb: nop
      // 1bc: fmul
      // 1bd: aload 6
      // 1bf: invokevirtual e0x$zvv.kjj ()F
      // 1c2: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 1c5: iload 5
      // 1c7: ifeq 1f8
      // 1ca: goto 1d1
      // 1cd: invokestatic zfo.a (Loov;)Loov;
      // 1d0: athrow
      // 1d1: aload 0
      // 1d2: sipush 16141
      // 1d5: ldc2_w 1938314696851495868
      // 1d8: lload 3
      // 1d9: lxor
      // 1da: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1df: nop
      // 1e0: aload 6
      // 1e2: invokevirtual e0x$zvv.dnt ()F
      // 1e5: ldc 0.15
      // 1e7: nop
      // 1e8: fmul
      // 1e9: aload 6
      // 1eb: invokevirtual e0x$zvv.kjj ()F
      // 1ee: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 1f1: goto 1f8
      // 1f4: invokestatic zfo.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: return
   }

   @Override
   public void nyy() {
      super.nyy();
      this.s_a().ylc(mex);
      this.dgt(m6d.t9k).zf7(53.0);
      this.dgt(m6d.w7i).zf7(0.225F);
   }

   @Override
   public int inu() {
      return 6;
   }

   public int dpa() {
      return 100;
   }

   @Override
   public float o23() {
      return 0.8F;
   }

   @Override
   public int u8h() {
      return 400;
   }

   public boolean m2v() {
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
      // 05: invokevirtual zfo.zz6 ()I
      // 08: iload 1
      // 09: ifne 30
      // 0c: ifeq 2f
      // 0f: goto 16
      // 12: invokestatic zfo.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual zfo.xid ()I
      // 1a: iload 1
      // 1b: ifne 30
      // 1e: goto 25
      // 21: invokestatic zfo.a (Loov;)Loov;
      // 24: athrow
      // 25: ifle 33
      // 28: goto 2f
      // 2b: invokestatic zfo.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   private void ocw() {
      this.h0r = null;
   }

   public boolean nja() {
      return this.g10;
   }

   private void zuw() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic zfo.c J
      // 003: ldc2_w 18575996720151
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: sipush 3925
      // 00c: ldc2_w 8689140596299260499
      // 00f: lload 1
      // 010: lxor
      // 011: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 016: nop
      // 017: putfield zfo.h0r Ljava/lang/String;
      // 01a: invokestatic OpaquePredicate.c ()I
      // 01d: aload 0
      // 01e: getfield zfo.cbf [Ljava/lang/String;
      // 021: bipush 0
      // 022: aconst_null
      // 023: aastore
      // 024: aload 0
      // 025: getfield zfo.cbf [Ljava/lang/String;
      // 028: bipush 1
      // 029: aconst_null
      // 02a: aastore
      // 02b: aload 0
      // 02c: getfield zfo.cbf [Ljava/lang/String;
      // 02f: bipush 2
      // 030: aconst_null
      // 031: aastore
      // 032: istore 3
      // 033: aload 0
      // 034: invokevirtual zfo.zz6 ()I
      // 037: istore 4
      // 039: aload 0
      // 03a: invokevirtual zfo.sep ()I
      // 03d: istore 5
      // 03f: iload 3
      // 040: ifne 106
      // 043: iload 4
      // 045: ifne 0f6
      // 048: goto 04f
      // 04b: invokestatic zfo.a (Loov;)Loov;
      // 04e: athrow
      // 04f: iload 5
      // 051: sipush 255
      // 054: iand
      // 055: istore 6
      // 057: iload 5
      // 059: ldc 65280
      // 05b: nop
      // 05c: iand
      // 05d: bipush 8
      // 05f: ishr
      // 060: istore 7
      // 062: iload 6
      // 064: getstatic zfo.nc3 [Ljava/lang/String;
      // 067: arraylength
      // 068: iload 3
      // 069: ifne 0bb
      // 06c: if_icmplt 080
      // 06f: goto 076
      // 072: invokestatic zfo.a (Loov;)Loov;
      // 075: athrow
      // 076: aload 0
      // 077: bipush 0
      // 078: putfield zfo.g10 Z
      // 07b: return
      // 07c: invokestatic zfo.a (Loov;)Loov;
      // 07f: athrow
      // 080: aload 0
      // 081: getfield zfo.cbf [Ljava/lang/String;
      // 084: bipush 0
      // 085: getstatic zfo.nc3 [Ljava/lang/String;
      // 088: iload 6
      // 08a: aaload
      // 08b: aastore
      // 08c: aload 0
      // 08d: new java/lang/StringBuilder
      // 090: dup
      // 091: invokespecial java/lang/StringBuilder.<init> ()V
      // 094: aload 0
      // 095: getfield zfo.h0r Ljava/lang/String;
      // 098: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09b: getstatic zfo.ih0 [Ljava/lang/String;
      // 09e: iload 6
      // 0a0: aaload
      // 0a1: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a7: putfield zfo.h0r Ljava/lang/String;
      // 0aa: iload 3
      // 0ab: ifne 0f2
      // 0ae: iload 7
      // 0b0: getstatic zfo.qvc [Ljava/lang/String;
      // 0b3: arraylength
      // 0b4: goto 0bb
      // 0b7: invokestatic zfo.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: if_icmplt 0c8
      // 0be: aload 0
      // 0bf: bipush 0
      // 0c0: putfield zfo.g10 Z
      // 0c3: return
      // 0c4: invokestatic zfo.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: aload 0
      // 0c9: getfield zfo.cbf [Ljava/lang/String;
      // 0cc: bipush 1
      // 0cd: getstatic zfo.qvc [Ljava/lang/String;
      // 0d0: iload 7
      // 0d2: aaload
      // 0d3: aastore
      // 0d4: aload 0
      // 0d5: new java/lang/StringBuilder
      // 0d8: dup
      // 0d9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0dc: aload 0
      // 0dd: getfield zfo.h0r Ljava/lang/String;
      // 0e0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0e3: getstatic zfo.zsg [Ljava/lang/String;
      // 0e6: iload 7
      // 0e8: aaload
      // 0e9: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 0ec: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0ef: putfield zfo.h0r Ljava/lang/String;
      // 0f2: iload 3
      // 0f3: ifeq 12c
      // 0f6: aload 0
      // 0f7: getfield zfo.cbf [Ljava/lang/String;
      // 0fa: bipush 0
      // 0fb: ldc ""
      // 0fd: nop
      // 0fe: aastore
      // 0ff: goto 106
      // 102: invokestatic zfo.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: new java/lang/StringBuilder
      // 10a: dup
      // 10b: invokespecial java/lang/StringBuilder.<init> ()V
      // 10e: aload 0
      // 10f: getfield zfo.h0r Ljava/lang/String;
      // 112: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 115: ldc "_"
      // 117: nop
      // 118: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 11b: iload 4
      // 11d: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 120: ldc "_"
      // 122: nop
      // 123: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 126: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 129: putfield zfo.h0r Ljava/lang/String;
      // 12c: aload 0
      // 12d: invokevirtual zfo.xid ()I
      // 130: istore 6
      // 132: iload 3
      // 133: ifne 187
      // 136: iload 6
      // 138: getstatic zfo.wk9 [Ljava/lang/String;
      // 13b: arraylength
      // 13c: if_icmplt 156
      // 13f: goto 146
      // 142: invokestatic zfo.a (Loov;)Loov;
      // 145: athrow
      // 146: aload 0
      // 147: bipush 0
      // 148: putfield zfo.g10 Z
      // 14b: iload 3
      // 14c: ifeq 18c
      // 14f: goto 156
      // 152: invokestatic zfo.a (Loov;)Loov;
      // 155: athrow
      // 156: aload 0
      // 157: getfield zfo.cbf [Ljava/lang/String;
      // 15a: bipush 2
      // 15b: getstatic zfo.wk9 [Ljava/lang/String;
      // 15e: iload 6
      // 160: aaload
      // 161: aastore
      // 162: aload 0
      // 163: new java/lang/StringBuilder
      // 166: dup
      // 167: invokespecial java/lang/StringBuilder.<init> ()V
      // 16a: aload 0
      // 16b: getfield zfo.h0r Ljava/lang/String;
      // 16e: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 171: getstatic zfo.v_s [Ljava/lang/String;
      // 174: iload 6
      // 176: aaload
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 17a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17d: putfield zfo.h0r Ljava/lang/String;
      // 180: goto 187
      // 183: invokestatic zfo.a (Loov;)Loov;
      // 186: athrow
      // 187: aload 0
      // 188: bipush 1
      // 189: putfield zfo.g10 Z
      // 18c: return
   }

   public String vg9() {
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
      // 05: getfield zfo.h0r Ljava/lang/String;
      // 08: iload 1
      // 09: ifne 25
      // 0c: ifnonnull 21
      // 0f: goto 16
      // 12: invokestatic zfo.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial zfo.zuw ()V
      // 1a: goto 21
      // 1d: invokestatic zfo.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield zfo.h0r Ljava/lang/String;
      // 25: areturn
   }

   public String[] aln() {
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
      // 06: ifne 22
      // 09: getfield zfo.h0r Ljava/lang/String;
      // 0c: ifnonnull 21
      // 0f: goto 16
      // 12: invokestatic zfo.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokespecial zfo.zuw ()V
      // 1a: goto 21
      // 1d: invokestatic zfo.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield zfo.cbf [Ljava/lang/String;
      // 25: areturn
   }

   public void aag(ha9 param1) {
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
      // 05: iload 2
      // 06: ifne 2f
      // 09: getfield zfo.oay Lt9d;
      // 0c: getfield OpaquePredicate.v0f Z
      // 0f: ifne 80
      // 12: goto 19
      // 15: invokestatic zfo.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 2
      // 1b: ifne 54
      // 1e: goto 25
      // 21: invokestatic zfo.a (Loov;)Loov;
      // 24: athrow
      // 25: getfield zfo.wgv Li2h;
      // 28: goto 2f
      // 2b: invokestatic zfo.a (Loov;)Loov;
      // 2e: athrow
      // 2f: ifnull 4c
      // 32: aload 0
      // 33: iload 2
      // 34: ifne 54
      // 37: goto 3e
      // 3a: invokestatic zfo.a (Loov;)Loov;
      // 3d: athrow
      // 3e: getfield zfo.wgv Li2h;
      // 41: aload 1
      // 42: if_acmpne 80
      // 45: goto 4c
      // 48: invokestatic zfo.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 0
      // 4d: goto 54
      // 50: invokestatic zfo.a (Loov;)Loov;
      // 53: athrow
      // 54: iload 2
      // 55: ifne 6d
      // 58: invokevirtual zfo.ccx ()Z
      // 5b: ifeq 80
      // 5e: goto 65
      // 61: invokestatic zfo.a (Loov;)Loov;
      // 64: athrow
      // 65: aload 0
      // 66: goto 6d
      // 69: invokestatic zfo.a (Loov;)Loov;
      // 6c: athrow
      // 6d: getfield zfo.p5h L_d3;
      // 70: aload 0
      // 71: invokevirtual zfo.noc ()Ljava/lang/String;
      // 74: invokevirtual _d3.ck1 (Ljava/lang/String;)V
      // 77: aload 1
      // 78: aload 0
      // 79: aload 0
      // 7a: getfield zfo.p5h L_d3;
      // 7d: invokevirtual ha9.b_m (Lzfo;Lrsi;)V
      // 80: return
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
      // 000: getstatic zfo.c J
      // 003: ldc2_w 138346334540612
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
      // 01d: ifnull 03c
      // 020: goto 027
      // 023: invokestatic zfo.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 5
      // 029: invokevirtual erg.gn1 ()Lu7m;
      // 02c: getstatic xbr.pb_ Lu7m;
      // 02f: if_acmpne 03c
      // 032: aload 0
      // 033: aload 1
      // 034: invokespecial j37.hp6 (Lha9;)Z
      // 037: ireturn
      // 038: invokestatic zfo.a (Loov;)Loov;
      // 03b: athrow
      // 03c: aload 0
      // 03d: invokevirtual zfo.ccx ()Z
      // 040: iload 4
      // 042: ifeq 073
      // 045: ifne 06f
      // 048: goto 04f
      // 04b: invokestatic zfo.a (Loov;)Loov;
      // 04e: athrow
      // 04f: aload 0
      // 050: invokevirtual zfo.aty ()Z
      // 053: iload 4
      // 055: ifeq 073
      // 058: goto 05f
      // 05b: invokestatic zfo.a (Loov;)Loov;
      // 05e: athrow
      // 05f: ifeq 06f
      // 062: goto 069
      // 065: invokestatic zfo.a (Loov;)Loov;
      // 068: athrow
      // 069: bipush 0
      // 06a: ireturn
      // 06b: invokestatic zfo.a (Loov;)Loov;
      // 06e: athrow
      // 06f: aload 0
      // 070: invokevirtual zfo.ccx ()Z
      // 073: iload 4
      // 075: ifeq 0d1
      // 078: ifeq 0c1
      // 07b: goto 082
      // 07e: invokestatic zfo.a (Loov;)Loov;
      // 081: athrow
      // 082: aload 0
      // 083: invokevirtual zfo.qn2 ()Z
      // 086: iload 4
      // 088: ifeq 0d1
      // 08b: goto 092
      // 08e: invokestatic zfo.a (Loov;)Loov;
      // 091: athrow
      // 092: ifeq 0c1
      // 095: goto 09c
      // 098: invokestatic zfo.a (Loov;)Loov;
      // 09b: athrow
      // 09c: aload 1
      // 09d: invokevirtual ha9.hzv ()Z
      // 0a0: iload 4
      // 0a2: ifeq 0d1
      // 0a5: goto 0ac
      // 0a8: invokestatic zfo.a (Loov;)Loov;
      // 0ab: athrow
      // 0ac: ifeq 0c1
      // 0af: goto 0b6
      // 0b2: invokestatic zfo.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: aload 1
      // 0b8: invokevirtual zfo.aag (Lha9;)V
      // 0bb: bipush 1
      // 0bc: ireturn
      // 0bd: invokestatic zfo.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: iload 4
      // 0c4: ifeq 0eb
      // 0c7: invokevirtual zfo.kac ()Z
      // 0ca: goto 0d1
      // 0cd: invokestatic zfo.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: ifeq 0f4
      // 0d4: aload 0
      // 0d5: iload 4
      // 0d7: ifeq 0ef
      // 0da: goto 0e1
      // 0dd: invokestatic zfo.a (Loov;)Loov;
      // 0e0: athrow
      // 0e1: getfield zfo.wgv Li2h;
      // 0e4: goto 0eb
      // 0e7: invokestatic zfo.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: ifnull 0f4
      // 0ee: aload 0
      // 0ef: aload 1
      // 0f0: invokespecial j37.hp6 (Lha9;)Z
      // 0f3: ireturn
      // 0f4: aload 5
      // 0f6: ifnull 5f4
      // 0f9: bipush 0
      // 0fa: istore 6
      // 0fc: aload 0
      // 0fd: invokevirtual zfo.sp4 ()Z
      // 100: iload 4
      // 102: ifeq 1aa
      // 105: ifeq 1a8
      // 108: goto 10f
      // 10b: invokestatic zfo.a (Loov;)Loov;
      // 10e: athrow
      // 10f: bipush -1
      // 110: istore 7
      // 112: aload 5
      // 114: invokevirtual erg.gn1 ()Lu7m;
      // 117: getstatic xbr.mhm Lu7m;
      // 11a: iload 4
      // 11c: ifeq 140
      // 11f: if_acmpne 131
      // 122: goto 129
      // 125: invokestatic zfo.a (Loov;)Loov;
      // 128: athrow
      // 129: bipush 1
      // 12a: istore 7
      // 12c: iload 4
      // 12e: ifne 16c
      // 131: aload 5
      // 133: invokevirtual erg.gn1 ()Lu7m;
      // 136: getstatic xbr.fps Lu7m;
      // 139: goto 140
      // 13c: invokestatic zfo.a (Loov;)Loov;
      // 13f: athrow
      // 140: iload 4
      // 142: ifeq 166
      // 145: if_acmpne 157
      // 148: goto 14f
      // 14b: invokestatic zfo.a (Loov;)Loov;
      // 14e: athrow
      // 14f: bipush 2
      // 150: istore 7
      // 152: iload 4
      // 154: ifne 16c
      // 157: aload 5
      // 159: invokevirtual erg.gn1 ()Lu7m;
      // 15c: getstatic xbr.krl Lu7m;
      // 15f: goto 166
      // 162: invokestatic zfo.a (Loov;)Loov;
      // 165: athrow
      // 166: if_acmpne 16c
      // 169: bipush 3
      // 16a: istore 7
      // 16c: iload 7
      // 16e: iload 4
      // 170: ifeq 1aa
      // 173: iflt 1a8
      // 176: goto 17d
      // 179: invokestatic zfo.a (Loov;)Loov;
      // 17c: athrow
      // 17d: aload 0
      // 17e: invokevirtual zfo.ccx ()Z
      // 181: iload 4
      // 183: ifeq 1a7
      // 186: goto 18d
      // 189: invokestatic zfo.a (Loov;)Loov;
      // 18c: athrow
      // 18d: ifne 1a1
      // 190: goto 197
      // 193: invokestatic zfo.a (Loov;)Loov;
      // 196: athrow
      // 197: aload 0
      // 198: invokevirtual zfo.u2h ()V
      // 19b: bipush 1
      // 19c: ireturn
      // 19d: invokestatic zfo.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: aload 1
      // 1a3: invokevirtual zfo.aag (Lha9;)V
      // 1a6: bipush 1
      // 1a7: ireturn
      // 1a8: iload 6
      // 1aa: iload 4
      // 1ac: ifeq 438
      // 1af: ifne 434
      // 1b2: goto 1b9
      // 1b5: invokestatic zfo.a (Loov;)Loov;
      // 1b8: athrow
      // 1b9: aload 0
      // 1ba: invokevirtual zfo.aty ()Z
      // 1bd: iload 4
      // 1bf: ifeq 438
      // 1c2: goto 1c9
      // 1c5: invokestatic zfo.a (Loov;)Loov;
      // 1c8: athrow
      // 1c9: ifne 434
      // 1cc: goto 1d3
      // 1cf: invokestatic zfo.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: fconst_0
      // 1d4: fstore 7
      // 1d6: bipush 0
      // 1d7: istore 8
      // 1d9: bipush 0
      // 1da: istore 9
      // 1dc: aload 5
      // 1de: invokevirtual erg.gn1 ()Lu7m;
      // 1e1: getstatic xbr.iqq Lu7m;
      // 1e4: iload 4
      // 1e6: ifeq 21d
      // 1e9: if_acmpne 202
      // 1ec: goto 1f3
      // 1ef: invokestatic zfo.a (Loov;)Loov;
      // 1f2: athrow
      // 1f3: fconst_2
      // 1f4: fstore 7
      // 1f6: bipush 20
      // 1f8: istore 8
      // 1fa: bipush 3
      // 1fb: istore 9
      // 1fd: iload 4
      // 1ff: ifne 347
      // 202: aload 5
      // 204: invokevirtual erg.gn1 ()Lu7m;
      // 207: iload 4
      // 209: ifeq 23b
      // 20c: goto 213
      // 20f: invokestatic zfo.a (Loov;)Loov;
      // 212: athrow
      // 213: getstatic xbr.bwp Lu7m;
      // 216: goto 21d
      // 219: invokestatic zfo.a (Loov;)Loov;
      // 21c: athrow
      // 21d: if_acmpne 22f
      // 220: fconst_1
      // 221: fstore 7
      // 223: bipush 30
      // 225: istore 8
      // 227: bipush 3
      // 228: istore 9
      // 22a: iload 4
      // 22c: ifne 347
      // 22f: aload 5
      // 231: invokevirtual erg.gn1 ()Lu7m;
      // 234: goto 23b
      // 237: invokestatic zfo.a (Loov;)Loov;
      // 23a: athrow
      // 23b: iload 4
      // 23d: ifeq 26b
      // 240: invokestatic e0x.p69 (Lu7m;)Le0x;
      // 243: getstatic ox_.cap Le0x;
      // 246: if_acmpne 25f
      // 249: goto 250
      // 24c: invokestatic zfo.a (Loov;)Loov;
      // 24f: athrow
      // 250: ldc 20.0
      // 252: nop
      // 253: fstore 7
      // 255: sipush 180
      // 258: istore 8
      // 25a: iload 4
      // 25c: ifne 347
      // 25f: aload 5
      // 261: invokevirtual erg.gn1 ()Lu7m;
      // 264: goto 26b
      // 267: invokestatic zfo.a (Loov;)Loov;
      // 26a: athrow
      // 26b: getstatic xbr.lym Lu7m;
      // 26e: iload 4
      // 270: ifeq 29d
      // 273: if_acmpne 28e
      // 276: goto 27d
      // 279: invokestatic zfo.a (Loov;)Loov;
      // 27c: athrow
      // 27d: ldc 3.0
      // 27f: nop
      // 280: fstore 7
      // 282: bipush 60
      // 284: istore 8
      // 286: bipush 3
      // 287: istore 9
      // 289: iload 4
      // 28b: ifne 347
      // 28e: aload 5
      // 290: invokevirtual erg.gn1 ()Lu7m;
      // 293: getstatic xbr.jph Lu7m;
      // 296: goto 29d
      // 299: invokestatic zfo.a (Loov;)Loov;
      // 29c: athrow
      // 29d: iload 4
      // 29f: ifeq 301
      // 2a2: if_acmpne 2f2
      // 2a5: goto 2ac
      // 2a8: invokestatic zfo.a (Loov;)Loov;
      // 2ab: athrow
      // 2ac: ldc 4.0
      // 2ae: nop
      // 2af: fstore 7
      // 2b1: bipush 60
      // 2b3: istore 8
      // 2b5: bipush 5
      // 2b6: istore 9
      // 2b8: aload 0
      // 2b9: invokevirtual zfo.ccx ()Z
      // 2bc: iload 4
      // 2be: ifeq 350
      // 2c1: ifeq 347
      // 2c4: goto 2cb
      // 2c7: invokestatic zfo.a (Loov;)Loov;
      // 2ca: athrow
      // 2cb: aload 0
      // 2cc: invokevirtual zfo.ktm ()I
      // 2cf: iload 4
      // 2d1: ifeq 350
      // 2d4: goto 2db
      // 2d7: invokestatic zfo.a (Loov;)Loov;
      // 2da: athrow
      // 2db: ifne 347
      // 2de: goto 2e5
      // 2e1: invokestatic zfo.a (Loov;)Loov;
      // 2e4: athrow
      // 2e5: bipush 1
      // 2e6: istore 6
      // 2e8: aload 0
      // 2e9: aload 1
      // 2ea: invokevirtual zfo.ukj (Lha9;)V
      // 2ed: iload 4
      // 2ef: ifne 347
      // 2f2: aload 5
      // 2f4: invokevirtual erg.gn1 ()Lu7m;
      // 2f7: getstatic xbr.yyh Lu7m;
      // 2fa: goto 301
      // 2fd: invokestatic zfo.a (Loov;)Loov;
      // 300: athrow
      // 301: if_acmpne 347
      // 304: ldc 10.0
      // 306: nop
      // 307: fstore 7
      // 309: sipush 240
      // 30c: istore 8
      // 30e: bipush 10
      // 310: istore 9
      // 312: aload 0
      // 313: invokevirtual zfo.ccx ()Z
      // 316: iload 4
      // 318: ifeq 350
      // 31b: ifeq 347
      // 31e: goto 325
      // 321: invokestatic zfo.a (Loov;)Loov;
      // 324: athrow
      // 325: aload 0
      // 326: invokevirtual zfo.ktm ()I
      // 329: iload 4
      // 32b: ifeq 350
      // 32e: goto 335
      // 331: invokestatic zfo.a (Loov;)Loov;
      // 334: athrow
      // 335: ifne 347
      // 338: goto 33f
      // 33b: invokestatic zfo.a (Loov;)Loov;
      // 33e: athrow
      // 33f: bipush 1
      // 340: istore 6
      // 342: aload 0
      // 343: aload 1
      // 344: invokevirtual zfo.ukj (Lha9;)V
      // 347: aload 0
      // 348: invokevirtual zfo.i55 ()F
      // 34b: aload 0
      // 34c: invokevirtual zfo.axb ()F
      // 34f: fcmpg
      // 350: iload 4
      // 352: ifeq 386
      // 355: ifge 382
      // 358: goto 35f
      // 35b: invokestatic zfo.a (Loov;)Loov;
      // 35e: athrow
      // 35f: fload 7
      // 361: fconst_0
      // 362: fcmpl
      // 363: iload 4
      // 365: ifeq 386
      // 368: goto 36f
      // 36b: invokestatic zfo.a (Loov;)Loov;
      // 36e: athrow
      // 36f: ifle 382
      // 372: goto 379
      // 375: invokestatic zfo.a (Loov;)Loov;
      // 378: athrow
      // 379: aload 0
      // 37a: fload 7
      // 37c: invokevirtual zfo.rwd (F)V
      // 37f: bipush 1
      // 380: istore 6
      // 382: aload 0
      // 383: invokevirtual zfo.qn2 ()Z
      // 386: iload 4
      // 388: ifeq 3b8
      // 38b: ifne 3b6
      // 38e: goto 395
      // 391: invokestatic zfo.a (Loov;)Loov;
      // 394: athrow
      // 395: iload 8
      // 397: iload 4
      // 399: ifeq 3b8
      // 39c: goto 3a3
      // 39f: invokestatic zfo.a (Loov;)Loov;
      // 3a2: athrow
      // 3a3: ifle 3b6
      // 3a6: goto 3ad
      // 3a9: invokestatic zfo.a (Loov;)Loov;
      // 3ac: athrow
      // 3ad: aload 0
      // 3ae: iload 8
      // 3b0: invokevirtual zfo.z23 (I)V
      // 3b3: bipush 1
      // 3b4: istore 6
      // 3b6: iload 9
      // 3b8: iload 4
      // 3ba: ifeq 41a
      // 3bd: ifle 418
      // 3c0: goto 3c7
      // 3c3: invokestatic zfo.a (Loov;)Loov;
      // 3c6: athrow
      // 3c7: iload 6
      // 3c9: iload 4
      // 3cb: ifeq 3fb
      // 3ce: goto 3d5
      // 3d1: invokestatic zfo.a (Loov;)Loov;
      // 3d4: athrow
      // 3d5: ifne 3f9
      // 3d8: goto 3df
      // 3db: invokestatic zfo.a (Loov;)Loov;
      // 3de: athrow
      // 3df: aload 0
      // 3e0: invokevirtual zfo.ccx ()Z
      // 3e3: iload 4
      // 3e5: ifeq 41a
      // 3e8: goto 3ef
      // 3eb: invokestatic zfo.a (Loov;)Loov;
      // 3ee: athrow
      // 3ef: ifne 418
      // 3f2: goto 3f9
      // 3f5: invokestatic zfo.a (Loov;)Loov;
      // 3f8: athrow
      // 3f9: iload 9
      // 3fb: iload 4
      // 3fd: ifeq 41a
      // 400: aload 0
      // 401: invokevirtual zfo.dpa ()I
      // 404: if_icmpge 418
      // 407: goto 40e
      // 40a: invokestatic zfo.a (Loov;)Loov;
      // 40d: athrow
      // 40e: bipush 1
      // 40f: istore 6
      // 411: aload 0
      // 412: iload 9
      // 414: invokevirtual zfo.tpx (I)I
      // 417: pop
      // 418: iload 6
      // 41a: iload 4
      // 41c: ifeq 438
      // 41f: ifeq 434
      // 422: goto 429
      // 425: invokestatic zfo.a (Loov;)Loov;
      // 428: athrow
      // 429: aload 0
      // 42a: invokespecial zfo.w_f ()V
      // 42d: goto 434
      // 430: invokestatic zfo.a (Loov;)Loov;
      // 433: athrow
      // 434: aload 0
      // 435: invokevirtual zfo.ccx ()Z
      // 438: iload 4
      // 43a: ifeq 49b
      // 43d: ifne 499
      // 440: goto 447
      // 443: invokestatic zfo.a (Loov;)Loov;
      // 446: athrow
      // 447: iload 6
      // 449: iload 4
      // 44b: ifeq 49b
      // 44e: goto 455
      // 451: invokestatic zfo.a (Loov;)Loov;
      // 454: athrow
      // 455: ifne 499
      // 458: goto 45f
      // 45b: invokestatic zfo.a (Loov;)Loov;
      // 45e: athrow
      // 45f: aload 5
      // 461: iload 4
      // 463: ifeq 479
      // 466: goto 46d
      // 469: invokestatic zfo.a (Loov;)Loov;
      // 46c: athrow
      // 46d: ifnull 493
      // 470: goto 477
      // 473: invokestatic zfo.a (Loov;)Loov;
      // 476: athrow
      // 477: aload 5
      // 479: aload 1
      // 47a: aload 0
      // 47b: invokevirtual erg.fxo (Lha9;Lg_3;)Z
      // 47e: iload 4
      // 480: ifeq 498
      // 483: ifeq 493
      // 486: goto 48d
      // 489: invokestatic zfo.a (Loov;)Loov;
      // 48c: athrow
      // 48d: bipush 1
      // 48e: ireturn
      // 48f: invokestatic zfo.a (Loov;)Loov;
      // 492: athrow
      // 493: aload 0
      // 494: invokevirtual zfo.u2h ()V
      // 497: bipush 1
      // 498: ireturn
      // 499: iload 6
      // 49b: iload 4
      // 49d: ifeq 529
      // 4a0: ifne 527
      // 4a3: goto 4aa
      // 4a6: invokestatic zfo.a (Loov;)Loov;
      // 4a9: athrow
      // 4aa: aload 0
      // 4ab: invokevirtual zfo.jz_ ()Z
      // 4ae: iload 4
      // 4b0: ifeq 529
      // 4b3: goto 4ba
      // 4b6: invokestatic zfo.a (Loov;)Loov;
      // 4b9: athrow
      // 4ba: ifeq 527
      // 4bd: goto 4c4
      // 4c0: invokestatic zfo.a (Loov;)Loov;
      // 4c3: athrow
      // 4c4: aload 0
      // 4c5: invokevirtual zfo.dlx ()Z
      // 4c8: iload 4
      // 4ca: ifeq 529
      // 4cd: goto 4d4
      // 4d0: invokestatic zfo.a (Loov;)Loov;
      // 4d3: athrow
      // 4d4: ifne 527
      // 4d7: goto 4de
      // 4da: invokestatic zfo.a (Loov;)Loov;
      // 4dd: athrow
      // 4de: aload 5
      // 4e0: invokevirtual erg.gn1 ()Lu7m;
      // 4e3: getstatic ox_.cug Lhrd;
      // 4e6: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 4e9: if_acmpne 527
      // 4ec: goto 4f3
      // 4ef: invokestatic zfo.a (Loov;)Loov;
      // 4f2: athrow
      // 4f3: aload 0
      // 4f4: bipush 1
      // 4f5: invokevirtual zfo.kkd (Z)V
      // 4f8: aload 0
      // 4f9: sipush 902
      // 4fc: ldc2_w 2567941727252261319
      // 4ff: lload 2
      // 500: lxor
      // 501: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 506: nop
      // 507: fconst_1
      // 508: aload 0
      // 509: getfield zfo.z2d Ljava/util/Random;
      // 50c: invokevirtual java/util/Random.nextFloat ()F
      // 50f: aload 0
      // 510: getfield zfo.z2d Ljava/util/Random;
      // 513: invokevirtual java/util/Random.nextFloat ()F
      // 516: fsub
      // 517: ldc 0.2
      // 519: nop
      // 51a: fmul
      // 51b: fconst_1
      // 51c: fadd
      // 51d: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 520: bipush 1
      // 521: istore 6
      // 523: aload 0
      // 524: invokespecial zfo.sug ()V
      // 527: iload 6
      // 529: iload 4
      // 52b: ifeq 58b
      // 52e: ifne 589
      // 531: goto 538
      // 534: invokestatic zfo.a (Loov;)Loov;
      // 537: athrow
      // 538: aload 0
      // 539: invokevirtual zfo.kac ()Z
      // 53c: iload 4
      // 53e: ifeq 58b
      // 541: goto 548
      // 544: invokestatic zfo.a (Loov;)Loov;
      // 547: athrow
      // 548: ifeq 589
      // 54b: goto 552
      // 54e: invokestatic zfo.a (Loov;)Loov;
      // 551: athrow
      // 552: aload 0
      // 553: invokevirtual zfo.cbz ()Z
      // 556: iload 4
      // 558: ifeq 58b
      // 55b: goto 562
      // 55e: invokestatic zfo.a (Loov;)Loov;
      // 561: athrow
      // 562: ifne 589
      // 565: goto 56c
      // 568: invokestatic zfo.a (Loov;)Loov;
      // 56b: athrow
      // 56c: aload 5
      // 56e: invokevirtual erg.gn1 ()Lu7m;
      // 571: getstatic xbr.fpq Lu7m;
      // 574: if_acmpne 589
      // 577: goto 57e
      // 57a: invokestatic zfo.a (Loov;)Loov;
      // 57d: athrow
      // 57e: aload 0
      // 57f: aload 1
      // 580: invokevirtual zfo.aag (Lha9;)V
      // 583: bipush 1
      // 584: ireturn
      // 585: invokestatic zfo.a (Loov;)Loov;
      // 588: athrow
      // 589: iload 6
      // 58b: iload 4
      // 58d: ifeq 5f8
      // 590: ifeq 5f4
      // 593: goto 59a
      // 596: invokestatic zfo.a (Loov;)Loov;
      // 599: athrow
      // 59a: aload 1
      // 59b: getfield ha9.lls Lpj2;
      // 59e: getfield pj2.g40 Z
      // 5a1: iload 4
      // 5a3: ifeq 5f3
      // 5a6: goto 5ad
      // 5a9: invokestatic zfo.a (Loov;)Loov;
      // 5ac: athrow
      // 5ad: ifne 5f2
      // 5b0: goto 5b7
      // 5b3: invokestatic zfo.a (Loov;)Loov;
      // 5b6: athrow
      // 5b7: aload 5
      // 5b9: dup
      // 5ba: getfield erg.qd2 I
      // 5bd: bipush 1
      // 5be: isub
      // 5bf: dup_x1
      // 5c0: putfield erg.qd2 I
      // 5c3: iload 4
      // 5c5: ifeq 5f3
      // 5c8: goto 5cf
      // 5cb: invokestatic zfo.a (Loov;)Loov;
      // 5ce: athrow
      // 5cf: ifne 5f2
      // 5d2: goto 5d9
      // 5d5: invokestatic zfo.a (Loov;)Loov;
      // 5d8: athrow
      // 5d9: aload 1
      // 5da: getfield ha9.up_ Ljnq;
      // 5dd: aload 1
      // 5de: getfield ha9.up_ Ljnq;
      // 5e1: getfield jnq.nb5 I
      // 5e4: aconst_null
      // 5e5: checkcast erg
      // 5e8: invokevirtual jnq.cxl (ILerg;)V
      // 5eb: goto 5f2
      // 5ee: invokestatic zfo.a (Loov;)Loov;
      // 5f1: athrow
      // 5f2: bipush 1
      // 5f3: ireturn
      // 5f4: aload 0
      // 5f5: invokevirtual zfo.kac ()Z
      // 5f8: iload 4
      // 5fa: ifeq 661
      // 5fd: ifeq 65c
      // 600: goto 607
      // 603: invokestatic zfo.a (Loov;)Loov;
      // 606: athrow
      // 607: aload 0
      // 608: iload 4
      // 60a: ifeq 65d
      // 60d: goto 614
      // 610: invokestatic zfo.a (Loov;)Loov;
      // 613: athrow
      // 614: getfield zfo.wgv Li2h;
      // 617: ifnonnull 65c
      // 61a: goto 621
      // 61d: invokestatic zfo.a (Loov;)Loov;
      // 620: athrow
      // 621: aload 5
      // 623: iload 4
      // 625: ifeq 63b
      // 628: goto 62f
      // 62b: invokestatic zfo.a (Loov;)Loov;
      // 62e: athrow
      // 62f: ifnull 655
      // 632: goto 639
      // 635: invokestatic zfo.a (Loov;)Loov;
      // 638: athrow
      // 639: aload 5
      // 63b: aload 1
      // 63c: aload 0
      // 63d: invokevirtual erg.fxo (Lha9;Lg_3;)Z
      // 640: iload 4
      // 642: ifeq 65b
      // 645: ifeq 655
      // 648: goto 64f
      // 64b: invokestatic zfo.a (Loov;)Loov;
      // 64e: athrow
      // 64f: bipush 1
      // 650: ireturn
      // 651: invokestatic zfo.a (Loov;)Loov;
      // 654: athrow
      // 655: aload 0
      // 656: aload 1
      // 657: invokespecial zfo.vaz (Lha9;)V
      // 65a: bipush 1
      // 65b: ireturn
      // 65c: aload 0
      // 65d: aload 1
      // 65e: invokespecial j37.hp6 (Lha9;)Z
      // 661: ireturn
   }

   private void vaz(ha9 param1) {
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
      // 05: aload 0
      // 06: getfield zfo.x5k F
      // 09: putfield ha9.x5k F
      // 0c: aload 1
      // 0d: aload 0
      // 0e: iload 2
      // 0f: ifne 3c
      // 12: getfield zfo.y2i F
      // 15: putfield ha9.y2i F
      // 18: aload 0
      // 19: bipush 0
      // 1a: invokevirtual zfo.w2i (Z)V
      // 1d: aload 0
      // 1e: bipush 0
      // 1f: invokevirtual zfo.d5c (Z)V
      // 22: aload 0
      // 23: getfield zfo.oay Lt9d;
      // 26: getfield OpaquePredicate.v0f Z
      // 29: ifne 3f
      // 2c: goto 33
      // 2f: invokestatic zfo.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 1
      // 34: aload 0
      // 35: goto 3c
      // 38: invokestatic zfo.a (Loov;)Loov;
      // 3b: athrow
      // 3c: invokevirtual ha9.nw9 (Li2h;)V
      // 3f: return
   }

   public boolean sp4() {
      int var1 = OpaquePredicate.b();

      try {
         int var10000 = this.zz6();
         if (var1 == 0) {
            return (boolean)var10000;
         }

         if (var10000 == 0) {
            return (boolean)1;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return (boolean)0;
   }

   public boolean jz_() {
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
      // 05: invokevirtual zfo.zz6 ()I
      // 08: istore 2
      // 09: iload 2
      // 0a: iload 1
      // 0b: ifne 38
      // 0e: bipush 2
      // 0f: if_icmpeq 30
      // 12: goto 19
      // 15: invokestatic zfo.a (Loov;)Loov;
      // 18: athrow
      // 19: iload 2
      // 1a: iload 1
      // 1b: ifne 38
      // 1e: goto 25
      // 21: invokestatic zfo.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 1
      // 26: if_icmpne 3b
      // 29: goto 30
      // 2c: invokestatic zfo.a (Loov;)Loov;
      // 2f: athrow
      // 30: bipush 1
      // 31: goto 38
      // 34: invokestatic zfo.a (Loov;)Loov;
      // 37: athrow
      // 38: goto 3c
      // 3b: bipush 0
      // 3c: ireturn
   }

   @Override
   public boolean a81() {
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
      // 06: ifeq 38
      // 09: getfield zfo.wgv Li2h;
      // 0c: ifnull 37
      // 0f: goto 16
      // 12: invokestatic zfo.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual zfo.cbz ()Z
      // 1a: iload 1
      // 1b: ifeq 3b
      // 1e: goto 25
      // 21: invokestatic zfo.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq 37
      // 28: goto 2f
      // 2b: invokestatic zfo.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 67
      // 33: invokestatic zfo.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: invokevirtual zfo.cf4 ()Z
      // 3b: iload 1
      // 3c: ifeq 63
      // 3f: ifne 62
      // 42: goto 49
      // 45: invokestatic zfo.a (Loov;)Loov;
      // 48: athrow
      // 49: aload 0
      // 4a: invokevirtual zfo.mum ()Z
      // 4d: iload 1
      // 4e: ifeq 63
      // 51: goto 58
      // 54: invokestatic zfo.a (Loov;)Loov;
      // 57: athrow
      // 58: ifeq 66
      // 5b: goto 62
      // 5e: invokestatic zfo.a (Loov;)Loov;
      // 61: athrow
      // 62: bipush 1
      // 63: goto 67
      // 66: bipush 0
      // 67: ireturn
   }

   public boolean aty() {
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
      // 05: invokevirtual zfo.zz6 ()I
      // 08: istore 2
      // 09: iload 2
      // 0a: iload 1
      // 0b: ifne 38
      // 0e: bipush 3
      // 0f: if_icmpeq 30
      // 12: goto 19
      // 15: invokestatic zfo.a (Loov;)Loov;
      // 18: athrow
      // 19: iload 2
      // 1a: iload 1
      // 1b: ifne 38
      // 1e: goto 25
      // 21: invokestatic zfo.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 4
      // 26: if_icmpne 3b
      // 29: goto 30
      // 2c: invokestatic zfo.a (Loov;)Loov;
      // 2f: athrow
      // 30: bipush 1
      // 31: goto 38
      // 34: invokestatic zfo.a (Loov;)Loov;
      // 37: athrow
      // 38: goto 3c
      // 3b: bipush 0
      // 3c: ireturn
   }

   public boolean ey5() {
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
      // 05: invokevirtual zfo.aty ()Z
      // 08: iload 1
      // 09: ifeq 38
      // 0c: ifne 30
      // 0f: goto 16
      // 12: invokestatic zfo.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: invokevirtual zfo.zz6 ()I
      // 1a: iload 1
      // 1b: ifeq 38
      // 1e: goto 25
      // 21: invokestatic zfo.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 2
      // 26: if_icmpne 3b
      // 29: goto 30
      // 2c: invokestatic zfo.a (Loov;)Loov;
      // 2f: athrow
      // 30: bipush 1
      // 31: goto 38
      // 34: invokestatic zfo.a (Loov;)Loov;
      // 37: athrow
      // 38: goto 3c
      // 3b: bipush 0
      // 3c: ireturn
   }

   @Override
   public boolean _cv(erg var1) {
      return false;
   }

   private void s10() {
      this.rf6 = 1;
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
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial j37.owu (Lofh;)V
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifeq 26
      // 0e: getfield zfo.oay Lt9d;
      // 11: getfield OpaquePredicate.v0f Z
      // 14: ifne 29
      // 17: goto 1e
      // 1a: invokestatic zfo.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic zfo.a (Loov;)Loov;
      // 25: athrow
      // 26: invokevirtual zfo.bp6 ()V
      // 29: return
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
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 1
      // 004: aload 0
      // 005: getfield zfo.z2d Ljava/util/Random;
      // 008: sipush 200
      // 00b: invokevirtual java/util/Random.nextInt (I)I
      // 00e: iload 1
      // 00f: ifeq 032
      // 012: ifne 027
      // 015: goto 01c
      // 018: invokestatic zfo.a (Loov;)Loov;
      // 01b: athrow
      // 01c: aload 0
      // 01d: invokespecial zfo.s10 ()V
      // 020: goto 027
      // 023: invokestatic zfo.a (Loov;)Loov;
      // 026: athrow
      // 027: aload 0
      // 028: invokespecial j37.e_a ()V
      // 02b: aload 0
      // 02c: getfield zfo.oay Lt9d;
      // 02f: getfield OpaquePredicate.v0f Z
      // 032: iload 1
      // 033: ifeq 051
      // 036: ifne 1eb
      // 039: goto 040
      // 03c: invokestatic zfo.a (Loov;)Loov;
      // 03f: athrow
      // 040: aload 0
      // 041: getfield zfo.z2d Ljava/util/Random;
      // 044: sipush 900
      // 047: invokevirtual java/util/Random.nextInt (I)I
      // 04a: goto 051
      // 04d: invokestatic zfo.a (Loov;)Loov;
      // 050: athrow
      // 051: iload 1
      // 052: ifeq 088
      // 055: ifne 084
      // 058: goto 05f
      // 05b: invokestatic zfo.a (Loov;)Loov;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield zfo.qur I
      // 063: iload 1
      // 064: ifeq 088
      // 067: goto 06e
      // 06a: invokestatic zfo.a (Loov;)Loov;
      // 06d: athrow
      // 06e: ifne 084
      // 071: goto 078
      // 074: invokestatic zfo.a (Loov;)Loov;
      // 077: athrow
      // 078: aload 0
      // 079: fconst_1
      // 07a: invokevirtual zfo.rwd (F)V
      // 07d: goto 084
      // 080: invokestatic zfo.a (Loov;)Loov;
      // 083: athrow
      // 084: aload 0
      // 085: invokevirtual zfo.cf4 ()Z
      // 088: iload 1
      // 089: ifeq 120
      // 08c: ifne 11c
      // 08f: goto 096
      // 092: invokestatic zfo.a (Loov;)Loov;
      // 095: athrow
      // 096: aload 0
      // 097: iload 1
      // 098: ifeq 11d
      // 09b: goto 0a2
      // 09e: invokestatic zfo.a (Loov;)Loov;
      // 0a1: athrow
      // 0a2: getfield zfo.wgv Li2h;
      // 0a5: ifnonnull 11c
      // 0a8: goto 0af
      // 0ab: invokestatic zfo.a (Loov;)Loov;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield zfo.z2d Ljava/util/Random;
      // 0b3: sipush 300
      // 0b6: invokevirtual java/util/Random.nextInt (I)I
      // 0b9: iload 1
      // 0ba: ifeq 120
      // 0bd: goto 0c4
      // 0c0: invokestatic zfo.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: ifne 11c
      // 0c7: goto 0ce
      // 0ca: invokestatic zfo.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: iload 1
      // 0d0: ifeq 11d
      // 0d3: goto 0da
      // 0d6: invokestatic zfo.a (Loov;)Loov;
      // 0d9: athrow
      // 0da: getfield zfo.oay Lt9d;
      // 0dd: new mew
      // 0e0: dup
      // 0e1: aload 0
      // 0e2: getfield zfo.o2v D
      // 0e5: invokestatic fe6.jqf (D)I
      // 0e8: aload 0
      // 0e9: getfield zfo.kfp D
      // 0ec: invokestatic fe6.jqf (D)I
      // 0ef: bipush 1
      // 0f0: isub
      // 0f1: aload 0
      // 0f2: getfield zfo.vbd D
      // 0f5: invokestatic fe6.jqf (D)I
      // 0f8: invokespecial mew.<init> (III)V
      // 0fb: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 0fe: invokeinterface zfz.r_y ()Le0x; 1
      // 103: getstatic ox_.l11 Lx82;
      // 106: if_acmpne 11c
      // 109: goto 110
      // 10c: invokestatic zfo.a (Loov;)Loov;
      // 10f: athrow
      // 110: aload 0
      // 111: bipush 1
      // 112: invokevirtual zfo.w2i (Z)V
      // 115: goto 11c
      // 118: invokestatic zfo.a (Loov;)Loov;
      // 11b: athrow
      // 11c: aload 0
      // 11d: invokevirtual zfo.cf4 ()Z
      // 120: iload 1
      // 121: ifeq 165
      // 124: ifeq 161
      // 127: goto 12e
      // 12a: invokestatic zfo.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 0
      // 12f: dup
      // 130: getfield zfo.t9r I
      // 133: bipush 1
      // 134: iadd
      // 135: dup_x1
      // 136: putfield zfo.t9r I
      // 139: iload 1
      // 13a: ifeq 165
      // 13d: goto 144
      // 140: invokestatic zfo.a (Loov;)Loov;
      // 143: athrow
      // 144: bipush 50
      // 146: if_icmple 161
      // 149: goto 150
      // 14c: invokestatic zfo.a (Loov;)Loov;
      // 14f: athrow
      // 150: aload 0
      // 151: bipush 0
      // 152: putfield zfo.t9r I
      // 155: aload 0
      // 156: bipush 0
      // 157: invokevirtual zfo.w2i (Z)V
      // 15a: goto 161
      // 15d: invokestatic zfo.a (Loov;)Loov;
      // 160: athrow
      // 161: aload 0
      // 162: invokevirtual zfo.r8i ()Z
      // 165: iload 1
      // 166: ifeq 17e
      // 169: ifeq 1eb
      // 16c: goto 173
      // 16f: invokestatic zfo.a (Loov;)Loov;
      // 172: athrow
      // 173: aload 0
      // 174: invokevirtual zfo.qn2 ()Z
      // 177: goto 17e
      // 17a: invokestatic zfo.a (Loov;)Loov;
      // 17d: athrow
      // 17e: iload 1
      // 17f: ifeq 1a2
      // 182: ifne 1eb
      // 185: goto 18c
      // 188: invokestatic zfo.a (Loov;)Loov;
      // 18b: athrow
      // 18c: aload 0
      // 18d: iload 1
      // 18e: ifeq 1b4
      // 191: goto 198
      // 194: invokestatic zfo.a (Loov;)Loov;
      // 197: athrow
      // 198: invokevirtual zfo.cf4 ()Z
      // 19b: goto 1a2
      // 19e: invokestatic zfo.a (Loov;)Loov;
      // 1a1: athrow
      // 1a2: ifne 1eb
      // 1a5: aload 0
      // 1a6: aload 0
      // 1a7: ldc2_w 16.0
      // 1aa: invokevirtual zfo.l9a (Li2h;D)Lzfo;
      // 1ad: goto 1b4
      // 1b0: invokestatic zfo.a (Loov;)Loov;
      // 1b3: athrow
      // 1b4: astore 2
      // 1b5: aload 2
      // 1b6: iload 1
      // 1b7: ifeq 1c5
      // 1ba: ifnull 1eb
      // 1bd: goto 1c4
      // 1c0: invokestatic zfo.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 0
      // 1c5: iload 1
      // 1c6: ifeq 1e3
      // 1c9: aload 2
      // 1ca: invokevirtual zfo.wxg (Li2h;)D
      // 1cd: ldc2_w 4.0
      // 1d0: dcmpl
      // 1d1: ifle 1eb
      // 1d4: goto 1db
      // 1d7: invokestatic zfo.a (Loov;)Loov;
      // 1da: athrow
      // 1db: aload 0
      // 1dc: goto 1e3
      // 1df: invokestatic zfo.a (Loov;)Loov;
      // 1e2: athrow
      // 1e3: getfield zfo.f35 Lp8a;
      // 1e6: aload 2
      // 1e7: invokevirtual p8a.n4j (Li2h;)Lt_2;
      // 1ea: pop
      // 1eb: return
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: aload 0
      // 005: invokespecial j37.xx_ ()V
      // 008: aload 0
      // 009: getfield zfo.oay Lt9d;
      // 00c: getfield OpaquePredicate.v0f Z
      // 00f: iload 1
      // 010: ifne 04f
      // 013: ifeq 04b
      // 016: goto 01d
      // 019: invokestatic zfo.a (Loov;)Loov;
      // 01c: athrow
      // 01d: aload 0
      // 01e: getfield zfo.oit Lwl1;
      // 021: invokevirtual wl1.jmu ()Z
      // 024: iload 1
      // 025: ifne 04f
      // 028: goto 02f
      // 02b: invokestatic zfo.a (Loov;)Loov;
      // 02e: athrow
      // 02f: ifeq 04b
      // 032: goto 039
      // 035: invokestatic zfo.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield zfo.oit Lwl1;
      // 03d: invokevirtual wl1.l0n ()V
      // 040: aload 0
      // 041: invokespecial zfo.ocw ()V
      // 044: goto 04b
      // 047: invokestatic zfo.a (Loov;)Loov;
      // 04a: athrow
      // 04b: aload 0
      // 04c: getfield zfo.dnp I
      // 04f: iload 1
      // 050: ifne 09a
      // 053: ifle 093
      // 056: goto 05d
      // 059: invokestatic zfo.a (Loov;)Loov;
      // 05c: athrow
      // 05d: aload 0
      // 05e: dup
      // 05f: getfield zfo.dnp I
      // 062: bipush 1
      // 063: iadd
      // 064: dup_x1
      // 065: putfield zfo.dnp I
      // 068: iload 1
      // 069: ifne 09a
      // 06c: goto 073
      // 06f: invokestatic zfo.a (Loov;)Loov;
      // 072: athrow
      // 073: bipush 30
      // 075: if_icmple 093
      // 078: goto 07f
      // 07b: invokestatic zfo.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 0
      // 080: bipush 0
      // 081: putfield zfo.dnp I
      // 084: aload 0
      // 085: sipush 128
      // 088: bipush 0
      // 089: invokespecial zfo.kq3 (IZ)V
      // 08c: goto 093
      // 08f: invokestatic zfo.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 0
      // 094: getfield zfo.oay Lt9d;
      // 097: getfield OpaquePredicate.v0f Z
      // 09a: iload 1
      // 09b: ifne 0f8
      // 09e: ifne 0f4
      // 0a1: goto 0a8
      // 0a4: invokestatic zfo.a (Loov;)Loov;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: getfield zfo.bml I
      // 0ac: iload 1
      // 0ad: ifne 0f8
      // 0b0: goto 0b7
      // 0b3: invokestatic zfo.a (Loov;)Loov;
      // 0b6: athrow
      // 0b7: ifle 0f4
      // 0ba: goto 0c1
      // 0bd: invokestatic zfo.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: aload 0
      // 0c2: dup
      // 0c3: getfield zfo.bml I
      // 0c6: bipush 1
      // 0c7: iadd
      // 0c8: dup_x1
      // 0c9: putfield zfo.bml I
      // 0cc: iload 1
      // 0cd: ifne 0f8
      // 0d0: goto 0d7
      // 0d3: invokestatic zfo.a (Loov;)Loov;
      // 0d6: athrow
      // 0d7: bipush 20
      // 0d9: if_icmple 0f4
      // 0dc: goto 0e3
      // 0df: invokestatic zfo.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: aload 0
      // 0e4: bipush 0
      // 0e5: putfield zfo.bml I
      // 0e8: aload 0
      // 0e9: bipush 0
      // 0ea: invokevirtual zfo.d5c (Z)V
      // 0ed: goto 0f4
      // 0f0: invokestatic zfo.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: aload 0
      // 0f5: getfield zfo.rf6 I
      // 0f8: iload 1
      // 0f9: ifne 138
      // 0fc: ifle 134
      // 0ff: goto 106
      // 102: invokestatic zfo.a (Loov;)Loov;
      // 105: athrow
      // 106: aload 0
      // 107: dup
      // 108: getfield zfo.rf6 I
      // 10b: bipush 1
      // 10c: iadd
      // 10d: dup_x1
      // 10e: putfield zfo.rf6 I
      // 111: iload 1
      // 112: ifne 138
      // 115: goto 11c
      // 118: invokestatic zfo.a (Loov;)Loov;
      // 11b: athrow
      // 11c: bipush 8
      // 11e: if_icmple 134
      // 121: goto 128
      // 124: invokestatic zfo.a (Loov;)Loov;
      // 127: athrow
      // 128: aload 0
      // 129: bipush 0
      // 12a: putfield zfo.rf6 I
      // 12d: goto 134
      // 130: invokestatic zfo.a (Loov;)Loov;
      // 133: athrow
      // 134: aload 0
      // 135: getfield zfo.hy8 I
      // 138: iload 1
      // 139: ifne 184
      // 13c: ifle 178
      // 13f: goto 146
      // 142: invokestatic zfo.a (Loov;)Loov;
      // 145: athrow
      // 146: aload 0
      // 147: dup
      // 148: getfield zfo.hy8 I
      // 14b: bipush 1
      // 14c: iadd
      // 14d: putfield zfo.hy8 I
      // 150: aload 0
      // 151: getfield zfo.hy8 I
      // 154: iload 1
      // 155: ifne 184
      // 158: goto 15f
      // 15b: invokestatic zfo.a (Loov;)Loov;
      // 15e: athrow
      // 15f: sipush 300
      // 162: if_icmple 178
      // 165: goto 16c
      // 168: invokestatic zfo.a (Loov;)Loov;
      // 16b: athrow
      // 16c: aload 0
      // 16d: bipush 0
      // 16e: putfield zfo.hy8 I
      // 171: goto 178
      // 174: invokestatic zfo.a (Loov;)Loov;
      // 177: athrow
      // 178: aload 0
      // 179: aload 0
      // 17a: getfield zfo.ndn F
      // 17d: putfield zfo.h6u F
      // 180: aload 0
      // 181: invokevirtual zfo.cf4 ()Z
      // 184: iload 1
      // 185: ifne 1f8
      // 188: ifeq 1d4
      // 18b: goto 192
      // 18e: invokestatic zfo.a (Loov;)Loov;
      // 191: athrow
      // 192: aload 0
      // 193: dup
      // 194: getfield zfo.ndn F
      // 197: fconst_1
      // 198: aload 0
      // 199: getfield zfo.ndn F
      // 19c: fsub
      // 19d: ldc 0.4
      // 19f: nop
      // 1a0: fmul
      // 1a1: ldc 0.05
      // 1a3: nop
      // 1a4: fadd
      // 1a5: fadd
      // 1a6: putfield zfo.ndn F
      // 1a9: aload 0
      // 1aa: getfield zfo.ndn F
      // 1ad: fconst_1
      // 1ae: fcmpl
      // 1af: iload 1
      // 1b0: ifne 21e
      // 1b3: goto 1ba
      // 1b6: invokestatic zfo.a (Loov;)Loov;
      // 1b9: athrow
      // 1ba: ifle 212
      // 1bd: goto 1c4
      // 1c0: invokestatic zfo.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 0
      // 1c5: fconst_1
      // 1c6: putfield zfo.ndn F
      // 1c9: iload 1
      // 1ca: ifeq 212
      // 1cd: goto 1d4
      // 1d0: invokestatic zfo.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: aload 0
      // 1d5: dup
      // 1d6: getfield zfo.ndn F
      // 1d9: fconst_0
      // 1da: aload 0
      // 1db: getfield zfo.ndn F
      // 1de: fsub
      // 1df: ldc 0.4
      // 1e1: nop
      // 1e2: fmul
      // 1e3: ldc 0.05
      // 1e5: nop
      // 1e6: fsub
      // 1e7: fadd
      // 1e8: putfield zfo.ndn F
      // 1eb: aload 0
      // 1ec: getfield zfo.ndn F
      // 1ef: fconst_0
      // 1f0: fcmpg
      // 1f1: goto 1f8
      // 1f4: invokestatic zfo.a (Loov;)Loov;
      // 1f7: athrow
      // 1f8: iload 1
      // 1f9: ifne 21e
      // 1fc: ifge 212
      // 1ff: goto 206
      // 202: invokestatic zfo.a (Loov;)Loov;
      // 205: athrow
      // 206: aload 0
      // 207: fconst_0
      // 208: putfield zfo.ndn F
      // 20b: goto 212
      // 20e: invokestatic zfo.a (Loov;)Loov;
      // 211: athrow
      // 212: aload 0
      // 213: aload 0
      // 214: getfield zfo.lxm F
      // 217: putfield zfo.m7x F
      // 21a: aload 0
      // 21b: invokevirtual zfo.mum ()Z
      // 21e: iload 1
      // 21f: ifne 2b2
      // 222: ifeq 278
      // 225: goto 22c
      // 228: invokestatic zfo.a (Loov;)Loov;
      // 22b: athrow
      // 22c: aload 0
      // 22d: aload 0
      // 22e: fconst_0
      // 22f: dup_x1
      // 230: putfield zfo.ndn F
      // 233: putfield zfo.h6u F
      // 236: aload 0
      // 237: dup
      // 238: getfield zfo.lxm F
      // 23b: fconst_1
      // 23c: aload 0
      // 23d: getfield zfo.lxm F
      // 240: fsub
      // 241: ldc 0.4
      // 243: nop
      // 244: fmul
      // 245: ldc 0.05
      // 247: nop
      // 248: fadd
      // 249: fadd
      // 24a: putfield zfo.lxm F
      // 24d: aload 0
      // 24e: getfield zfo.lxm F
      // 251: fconst_1
      // 252: fcmpl
      // 253: iload 1
      // 254: ifne 2db
      // 257: goto 25e
      // 25a: invokestatic zfo.a (Loov;)Loov;
      // 25d: athrow
      // 25e: ifle 2cc
      // 261: goto 268
      // 264: invokestatic zfo.a (Loov;)Loov;
      // 267: athrow
      // 268: aload 0
      // 269: fconst_1
      // 26a: putfield zfo.lxm F
      // 26d: iload 1
      // 26e: ifeq 2cc
      // 271: goto 278
      // 274: invokestatic zfo.a (Loov;)Loov;
      // 277: athrow
      // 278: aload 0
      // 279: bipush 0
      // 27a: putfield zfo.avu Z
      // 27d: aload 0
      // 27e: dup
      // 27f: getfield zfo.lxm F
      // 282: ldc 0.8
      // 284: nop
      // 285: aload 0
      // 286: getfield zfo.lxm F
      // 289: fmul
      // 28a: aload 0
      // 28b: getfield zfo.lxm F
      // 28e: fmul
      // 28f: aload 0
      // 290: getfield zfo.lxm F
      // 293: fmul
      // 294: aload 0
      // 295: getfield zfo.lxm F
      // 298: fsub
      // 299: ldc 0.6
      // 29b: nop
      // 29c: fmul
      // 29d: ldc 0.05
      // 29f: nop
      // 2a0: fsub
      // 2a1: fadd
      // 2a2: putfield zfo.lxm F
      // 2a5: aload 0
      // 2a6: getfield zfo.lxm F
      // 2a9: fconst_0
      // 2aa: fcmpg
      // 2ab: goto 2b2
      // 2ae: invokestatic zfo.a (Loov;)Loov;
      // 2b1: athrow
      // 2b2: iload 1
      // 2b3: ifne 2db
      // 2b6: ifge 2cc
      // 2b9: goto 2c0
      // 2bc: invokestatic zfo.a (Loov;)Loov;
      // 2bf: athrow
      // 2c0: aload 0
      // 2c1: fconst_0
      // 2c2: putfield zfo.lxm F
      // 2c5: goto 2cc
      // 2c8: invokestatic zfo.a (Loov;)Loov;
      // 2cb: athrow
      // 2cc: aload 0
      // 2cd: aload 0
      // 2ce: getfield zfo.fs9 F
      // 2d1: putfield zfo.nv_ F
      // 2d4: aload 0
      // 2d5: sipush 128
      // 2d8: invokespecial zfo.uob (I)Z
      // 2db: iload 1
      // 2dc: ifne 35a
      // 2df: ifeq 32b
      // 2e2: goto 2e9
      // 2e5: invokestatic zfo.a (Loov;)Loov;
      // 2e8: athrow
      // 2e9: aload 0
      // 2ea: dup
      // 2eb: getfield zfo.fs9 F
      // 2ee: fconst_1
      // 2ef: aload 0
      // 2f0: getfield zfo.fs9 F
      // 2f3: fsub
      // 2f4: ldc 0.7
      // 2f6: nop
      // 2f7: fmul
      // 2f8: ldc 0.05
      // 2fa: nop
      // 2fb: fadd
      // 2fc: fadd
      // 2fd: putfield zfo.fs9 F
      // 300: aload 0
      // 301: iload 1
      // 302: ifne 323
      // 305: goto 30c
      // 308: invokestatic zfo.a (Loov;)Loov;
      // 30b: athrow
      // 30c: getfield zfo.fs9 F
      // 30f: fconst_1
      // 310: fcmpl
      // 311: ifle 362
      // 314: goto 31b
      // 317: invokestatic zfo.a (Loov;)Loov;
      // 31a: athrow
      // 31b: aload 0
      // 31c: goto 323
      // 31f: invokestatic zfo.a (Loov;)Loov;
      // 322: athrow
      // 323: fconst_1
      // 324: putfield zfo.fs9 F
      // 327: iload 1
      // 328: ifeq 362
      // 32b: aload 0
      // 32c: dup
      // 32d: getfield zfo.fs9 F
      // 330: fconst_0
      // 331: aload 0
      // 332: getfield zfo.fs9 F
      // 335: fsub
      // 336: ldc 0.7
      // 338: nop
      // 339: fmul
      // 33a: ldc 0.05
      // 33c: nop
      // 33d: fsub
      // 33e: fadd
      // 33f: putfield zfo.fs9 F
      // 342: aload 0
      // 343: iload 1
      // 344: ifne 35e
      // 347: goto 34e
      // 34a: invokestatic zfo.a (Loov;)Loov;
      // 34d: athrow
      // 34e: getfield zfo.fs9 F
      // 351: fconst_0
      // 352: fcmpg
      // 353: goto 35a
      // 356: invokestatic zfo.a (Loov;)Loov;
      // 359: athrow
      // 35a: ifge 362
      // 35d: aload 0
      // 35e: fconst_0
      // 35f: putfield zfo.fs9 F
      // 362: return
   }

   private void __g() {
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
      // 06: ifne 26
      // 09: getfield zfo.oay Lt9d;
      // 0c: getfield OpaquePredicate.v0f Z
      // 0f: ifne 2d
      // 12: goto 19
      // 15: invokestatic zfo.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: bipush 1
      // 1b: putfield zfo.dnp I
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic zfo.a (Loov;)Loov;
      // 25: athrow
      // 26: sipush 128
      // 29: bipush 1
      // 2a: invokespecial zfo.kq3 (IZ)V
      // 2d: return
   }

   private boolean x0b() {
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
      // 05: getfield zfo.wgv Li2h;
      // 08: iload 1
      // 09: ifne 2c
      // 0c: ifnonnull ae
      // 0f: goto 16
      // 12: invokestatic zfo.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: iload 1
      // 18: ifne 30
      // 1b: goto 22
      // 1e: invokestatic zfo.a (Loov;)Loov;
      // 21: athrow
      // 22: getfield zfo.hzp Li2h;
      // 25: goto 2c
      // 28: invokestatic zfo.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifnonnull ae
      // 2f: aload 0
      // 30: invokevirtual zfo.ccx ()Z
      // 33: iload 1
      // 34: ifne 4c
      // 37: ifeq ae
      // 3a: goto 41
      // 3d: invokestatic zfo.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: invokevirtual zfo.qn2 ()Z
      // 45: goto 4c
      // 48: invokestatic zfo.a (Loov;)Loov;
      // 4b: athrow
      // 4c: iload 1
      // 4d: ifne 65
      // 50: ifeq ae
      // 53: goto 5a
      // 56: invokestatic zfo.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: invokevirtual zfo.ey5 ()Z
      // 5e: goto 65
      // 61: invokestatic zfo.a (Loov;)Loov;
      // 64: athrow
      // 65: iload 1
      // 66: ifne 83
      // 69: ifne ae
      // 6c: goto 73
      // 6f: invokestatic zfo.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 0
      // 74: invokevirtual zfo.i55 ()F
      // 77: aload 0
      // 78: invokevirtual zfo.axb ()F
      // 7b: fcmpl
      // 7c: goto 83
      // 7f: invokestatic zfo.a (Loov;)Loov;
      // 82: athrow
      // 83: iload 1
      // 84: ifne 9c
      // 87: iflt ae
      // 8a: goto 91
      // 8d: invokestatic zfo.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: invokevirtual zfo.j34 ()Z
      // 95: goto 9c
      // 98: invokestatic zfo.a (Loov;)Loov;
      // 9b: athrow
      // 9c: iload 1
      // 9d: ifne ab
      // a0: ifeq ae
      // a3: goto aa
      // a6: invokestatic zfo.a (Loov;)Loov;
      // a9: athrow
      // aa: bipush 1
      // ab: goto af
      // ae: bipush 0
      // af: ireturn
   }

   @Override
   public void _a5(boolean var1) {
      this.kq3(32, var1);
   }

   public void w2i(boolean var1) {
      this._a5(var1);
   }

   public void d5c(boolean var1) {
      try {
         if (var1) {
            this.w2i(false);
         }
      } catch (oov var2) {
         throw a(var2);
      }

      this.kq3(64, var1);
   }

   private void fkj() {
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
      // 06: ifne 26
      // 09: getfield zfo.oay Lt9d;
      // 0c: getfield OpaquePredicate.v0f Z
      // 0f: ifne 2a
      // 12: goto 19
      // 15: invokestatic zfo.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: bipush 1
      // 1b: putfield zfo.bml I
      // 1e: aload 0
      // 1f: goto 26
      // 22: invokestatic zfo.a (Loov;)Loov;
      // 25: athrow
      // 26: bipush 1
      // 27: invokevirtual zfo.d5c (Z)V
      // 2a: return
   }

   public void u2h() {
      this.fkj();
      String var1 = this.kco();

      try {
         if (var1 != null) {
            this.lhu(var1, this.o23(), this.b33());
         }
      } catch (oov var2) {
         throw a(var2);
      }
   }

   public void bp6() {
      this.ppg(this, this.p5h);
      this.iju();
   }

   private void ppg(EntityLivingBase param1, _d3 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 2
      // 05: ifnull 5e
      // 08: aload 0
      // 09: getfield zfo.oay Lt9d;
      // 0c: getfield OpaquePredicate.v0f Z
      // 0f: iload 3
      // 10: ifne 25
      // 13: goto 1a
      // 16: invokestatic zfo.a (Loov;)Loov;
      // 19: athrow
      // 1a: ifne 5e
      // 1d: goto 24
      // 20: invokestatic zfo.a (Loov;)Loov;
      // 23: athrow
      // 24: bipush 0
      // 25: istore 4
      // 27: iload 4
      // 29: aload 2
      // 2a: invokevirtual _d3.opt ()I
      // 2d: if_icmpge 5e
      // 30: aload 2
      // 31: iload 4
      // 33: invokevirtual _d3.ibn (I)Lerg;
      // 36: astore 5
      // 38: iload 3
      // 39: ifne 5a
      // 3c: aload 5
      // 3e: ifnull 57
      // 41: goto 48
      // 44: invokestatic zfo.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: aload 5
      // 4b: fconst_0
      // 4c: invokevirtual zfo.qji (Lerg;F)Lnvf;
      // 4f: pop
      // 50: goto 57
      // 53: invokestatic zfo.a (Loov;)Loov;
      // 56: athrow
      // 57: iinc 4 1
      // 5a: iload 3
      // 5b: ifeq 27
      // 5e: return
   }

   public boolean aek(ha9 var1) {
      this.anv(var1.b_q().toString());
      this.pmu(true);
      return true;
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
      // 000: getstatic zfo.c J
      // 003: ldc2_w 87238548308449
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: iload 5
      // 010: ifne 333
      // 013: getfield zfo.wgv Li2h;
      // 016: ifnull 31d
      // 019: goto 020
      // 01c: invokestatic zfo.a (Loov;)Loov;
      // 01f: athrow
      // 020: aload 0
      // 021: iload 5
      // 023: ifne 333
      // 026: goto 02d
      // 029: invokestatic zfo.a (Loov;)Loov;
      // 02c: athrow
      // 02d: getfield zfo.wgv Li2h;
      // 030: instanceof Entity
      // 033: ifeq 31d
      // 036: goto 03d
      // 039: invokestatic zfo.a (Loov;)Loov;
      // 03c: athrow
      // 03d: aload 0
      // 03e: iload 5
      // 040: ifne 333
      // 043: goto 04a
      // 046: invokestatic zfo.a (Loov;)Loov;
      // 049: athrow
      // 04a: invokevirtual zfo.cbz ()Z
      // 04d: ifeq 31d
      // 050: goto 057
      // 053: invokestatic zfo.a (Loov;)Loov;
      // 056: athrow
      // 057: aload 0
      // 058: aload 0
      // 059: aload 0
      // 05a: getfield zfo.wgv Li2h;
      // 05d: getfield EntityLivingBase.x5k F
      // 060: dup_x1
      // 061: putfield zfo.x5k F
      // 064: putfield zfo.p3h F
      // 067: aload 0
      // 068: aload 0
      // 069: getfield zfo.wgv Li2h;
      // 06c: getfield EntityLivingBase.y2i F
      // 06f: ldc 0.5
      // 071: nop
      // 072: fmul
      // 073: putfield zfo.y2i F
      // 076: aload 0
      // 077: aload 0
      // 078: getfield zfo.x5k F
      // 07b: aload 0
      // 07c: getfield zfo.y2i F
      // 07f: invokevirtual zfo.iym (FF)V
      // 082: aload 0
      // 083: aload 0
      // 084: aload 0
      // 085: getfield zfo.x5k F
      // 088: dup_x1
      // 089: putfield zfo.ksw F
      // 08c: putfield zfo.q6c F
      // 08f: aload 0
      // 090: getfield zfo.wgv Li2h;
      // 093: checkcast Entity
      // 096: getfield Entity.z66 F
      // 099: ldc 0.5
      // 09b: nop
      // 09c: fmul
      // 09d: fstore 1
      // 09e: aload 0
      // 09f: getfield zfo.wgv Li2h;
      // 0a2: checkcast Entity
      // 0a5: getfield Entity.ooc F
      // 0a8: fstore 2
      // 0a9: fload 2
      // 0aa: fconst_0
      // 0ab: fcmpg
      // 0ac: iload 5
      // 0ae: ifne 0ca
      // 0b1: ifgt 0c6
      // 0b4: goto 0bb
      // 0b7: invokestatic zfo.a (Loov;)Loov;
      // 0ba: athrow
      // 0bb: fload 2
      // 0bc: ldc 0.25
      // 0be: nop
      // 0bf: fmul
      // 0c0: fstore 2
      // 0c1: aload 0
      // 0c2: bipush 0
      // 0c3: putfield zfo.w38 I
      // 0c6: aload 0
      // 0c7: getfield zfo.lfk Z
      // 0ca: iload 5
      // 0cc: ifne 133
      // 0cf: ifeq 12d
      // 0d2: goto 0d9
      // 0d5: invokestatic zfo.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: aload 0
      // 0da: getfield zfo.q0m F
      // 0dd: fconst_0
      // 0de: fcmpl
      // 0df: iload 5
      // 0e1: ifne 133
      // 0e4: goto 0eb
      // 0e7: invokestatic zfo.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: ifne 12d
      // 0ee: goto 0f5
      // 0f1: invokestatic zfo.a (Loov;)Loov;
      // 0f4: athrow
      // 0f5: aload 0
      // 0f6: invokevirtual zfo.mum ()Z
      // 0f9: iload 5
      // 0fb: ifne 133
      // 0fe: goto 105
      // 101: invokestatic zfo.a (Loov;)Loov;
      // 104: athrow
      // 105: ifeq 12d
      // 108: goto 10f
      // 10b: invokestatic zfo.a (Loov;)Loov;
      // 10e: athrow
      // 10f: aload 0
      // 110: getfield zfo.avu Z
      // 113: iload 5
      // 115: ifne 133
      // 118: goto 11f
      // 11b: invokestatic zfo.a (Loov;)Loov;
      // 11e: athrow
      // 11f: ifne 12d
      // 122: goto 129
      // 125: invokestatic zfo.a (Loov;)Loov;
      // 128: athrow
      // 129: fconst_0
      // 12a: fstore 1
      // 12b: fconst_0
      // 12c: fstore 2
      // 12d: aload 0
      // 12e: getfield zfo.q0m F
      // 131: fconst_0
      // 132: fcmpl
      // 133: iload 5
      // 135: ifne 25e
      // 138: ifle 246
      // 13b: goto 142
      // 13e: invokestatic zfo.a (Loov;)Loov;
      // 141: athrow
      // 142: aload 0
      // 143: invokevirtual zfo.fhd ()Z
      // 146: iload 5
      // 148: ifne 25e
      // 14b: goto 152
      // 14e: invokestatic zfo.a (Loov;)Loov;
      // 151: athrow
      // 152: ifne 246
      // 155: goto 15c
      // 158: invokestatic zfo.a (Loov;)Loov;
      // 15b: athrow
      // 15c: aload 0
      // 15d: getfield zfo.lfk Z
      // 160: iload 5
      // 162: ifne 25e
      // 165: goto 16c
      // 168: invokestatic zfo.a (Loov;)Loov;
      // 16b: athrow
      // 16c: ifeq 246
      // 16f: goto 176
      // 172: invokestatic zfo.a (Loov;)Loov;
      // 175: athrow
      // 176: aload 0
      // 177: aload 0
      // 178: invokevirtual zfo.ena ()D
      // 17b: aload 0
      // 17c: getfield zfo.q0m F
      // 17f: f2d
      // 180: dmul
      // 181: putfield zfo.mop D
      // 184: aload 0
      // 185: getstatic mcs.y0p Lmcs;
      // 188: invokevirtual zfo.cab (Lmcs;)Z
      // 18b: iload 5
      // 18d: ifne 1dc
      // 190: goto 197
      // 193: invokestatic zfo.a (Loov;)Loov;
      // 196: athrow
      // 197: ifeq 1c3
      // 19a: goto 1a1
      // 19d: invokestatic zfo.a (Loov;)Loov;
      // 1a0: athrow
      // 1a1: aload 0
      // 1a2: dup
      // 1a3: getfield zfo.mop D
      // 1a6: aload 0
      // 1a7: getstatic mcs.y0p Lmcs;
      // 1aa: invokevirtual zfo.dhd (Lmcs;)Lsdj;
      // 1ad: invokevirtual sdj.tus ()I
      // 1b0: bipush 1
      // 1b1: iadd
      // 1b2: i2f
      // 1b3: ldc 0.1
      // 1b5: nop
      // 1b6: fmul
      // 1b7: f2d
      // 1b8: dadd
      // 1b9: putfield zfo.mop D
      // 1bc: goto 1c3
      // 1bf: invokestatic zfo.a (Loov;)Loov;
      // 1c2: athrow
      // 1c3: aload 0
      // 1c4: bipush 1
      // 1c5: invokevirtual zfo.gd2 (Z)V
      // 1c8: aload 0
      // 1c9: iload 5
      // 1cb: ifne 242
      // 1ce: bipush 1
      // 1cf: putfield zfo.u19 Z
      // 1d2: fload 2
      // 1d3: fconst_0
      // 1d4: fcmpl
      // 1d5: goto 1dc
      // 1d8: invokestatic zfo.a (Loov;)Loov;
      // 1db: athrow
      // 1dc: ifle 241
      // 1df: aload 0
      // 1e0: getfield zfo.x5k F
      // 1e3: ldc 3.1415927
      // 1e5: nop
      // 1e6: fmul
      // 1e7: ldc 180.0
      // 1e9: nop
      // 1ea: fdiv
      // 1eb: invokestatic fe6.rtn (F)F
      // 1ee: fstore 6
      // 1f0: aload 0
      // 1f1: getfield zfo.x5k F
      // 1f4: ldc 3.1415927
      // 1f6: nop
      // 1f7: fmul
      // 1f8: ldc 180.0
      // 1fa: nop
      // 1fb: fdiv
      // 1fc: invokestatic fe6.ssk (F)F
      // 1ff: fstore 7
      // 201: aload 0
      // 202: dup
      // 203: getfield zfo.icv D
      // 206: ldc -0.4
      // 208: nop
      // 209: fload 6
      // 20b: fmul
      // 20c: aload 0
      // 20d: getfield zfo.q0m F
      // 210: fmul
      // 211: f2d
      // 212: dadd
      // 213: putfield zfo.icv D
      // 216: aload 0
      // 217: dup
      // 218: getfield zfo.bw4 D
      // 21b: ldc 0.4
      // 21d: nop
      // 21e: fload 7
      // 220: fmul
      // 221: aload 0
      // 222: getfield zfo.q0m F
      // 225: fmul
      // 226: f2d
      // 227: dadd
      // 228: putfield zfo.bw4 D
      // 22b: aload 0
      // 22c: sipush 5188
      // 22f: ldc2_w 7148261176449346767
      // 232: lload 3
      // 233: lxor
      // 234: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 239: nop
      // 23a: ldc 0.4
      // 23c: nop
      // 23d: fconst_1
      // 23e: invokevirtual zfo.lhu (Ljava/lang/String;FF)V
      // 241: aload 0
      // 242: fconst_0
      // 243: putfield zfo.q0m F
      // 246: aload 0
      // 247: fconst_1
      // 248: putfield zfo.nr7 F
      // 24b: aload 0
      // 24c: aload 0
      // 24d: invokevirtual zfo.ldh ()F
      // 250: ldc 0.1
      // 252: nop
      // 253: fmul
      // 254: putfield zfo._ge F
      // 257: aload 0
      // 258: getfield zfo.oay Lt9d;
      // 25b: getfield OpaquePredicate.v0f Z
      // 25e: iload 5
      // 260: ifne 29b
      // 263: ifne 28b
      // 266: goto 26d
      // 269: invokestatic zfo.a (Loov;)Loov;
      // 26c: athrow
      // 26d: aload 0
      // 26e: aload 0
      // 26f: getstatic m6d.w7i Lw9p;
      // 272: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 275: invokeinterface _4o.nz5 ()D 1
      // 27a: d2f
      // 27b: invokevirtual zfo.nak (F)V
      // 27e: aload 0
      // 27f: fload 1
      // 280: fload 2
      // 281: invokespecial j37.ge2 (FF)V
      // 284: goto 28b
      // 287: invokestatic zfo.a (Loov;)Loov;
      // 28a: athrow
      // 28b: aload 0
      // 28c: iload 5
      // 28e: ifne 2b8
      // 291: getfield zfo.lfk Z
      // 294: goto 29b
      // 297: invokestatic zfo.a (Loov;)Loov;
      // 29a: athrow
      // 29b: ifeq 2af
      // 29e: aload 0
      // 29f: fconst_0
      // 2a0: putfield zfo.q0m F
      // 2a3: aload 0
      // 2a4: bipush 0
      // 2a5: invokevirtual zfo.gd2 (Z)V
      // 2a8: goto 2af
      // 2ab: invokestatic zfo.a (Loov;)Loov;
      // 2ae: athrow
      // 2af: aload 0
      // 2b0: aload 0
      // 2b1: getfield zfo.zzf F
      // 2b4: putfield zfo.p1w F
      // 2b7: aload 0
      // 2b8: getfield zfo.o2v D
      // 2bb: aload 0
      // 2bc: getfield zfo.bc1 D
      // 2bf: dsub
      // 2c0: dstore 6
      // 2c2: aload 0
      // 2c3: getfield zfo.vbd D
      // 2c6: aload 0
      // 2c7: getfield zfo.a4d D
      // 2ca: dsub
      // 2cb: dstore 8
      // 2cd: dload 6
      // 2cf: dload 6
      // 2d1: dmul
      // 2d2: dload 8
      // 2d4: dload 8
      // 2d6: dmul
      // 2d7: dadd
      // 2d8: invokestatic fe6.dii (D)F
      // 2db: ldc 4.0
      // 2dd: nop
      // 2de: fmul
      // 2df: fstore 10
      // 2e1: iload 5
      // 2e3: ifne 318
      // 2e6: fload 10
      // 2e8: fconst_1
      // 2e9: fcmpl
      // 2ea: ifle 2f7
      // 2ed: goto 2f4
      // 2f0: invokestatic zfo.a (Loov;)Loov;
      // 2f3: athrow
      // 2f4: fconst_1
      // 2f5: fstore 10
      // 2f7: aload 0
      // 2f8: dup
      // 2f9: getfield zfo.zzf F
      // 2fc: fload 10
      // 2fe: aload 0
      // 2ff: getfield zfo.zzf F
      // 302: fsub
      // 303: ldc 0.4
      // 305: nop
      // 306: fmul
      // 307: fadd
      // 308: putfield zfo.zzf F
      // 30b: aload 0
      // 30c: dup
      // 30d: getfield zfo.pcb F
      // 310: aload 0
      // 311: getfield zfo.zzf F
      // 314: fadd
      // 315: putfield zfo.pcb F
      // 318: iload 5
      // 31a: ifeq 338
      // 31d: aload 0
      // 31e: ldc 0.5
      // 320: nop
      // 321: putfield zfo.nr7 F
      // 324: aload 0
      // 325: ldc 0.02
      // 327: nop
      // 328: putfield zfo._ge F
      // 32b: aload 0
      // 32c: goto 333
      // 32f: invokestatic zfo.a (Loov;)Loov;
      // 332: athrow
      // 333: fload 1
      // 334: fload 2
      // 335: invokespecial j37.ge2 (FF)V
      // 338: return
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
      // 000: getstatic zfo.c J
      // 003: ldc2_w 75511052273589
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial j37.srs (Lbdo;)V
      // 00d: aload 1
      // 00e: sipush 6536
      // 011: ldc2_w 2755546434839177035
      // 014: lload 2
      // 015: lxor
      // 016: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01b: nop
      // 01c: aload 0
      // 01d: invokevirtual zfo.cf4 ()Z
      // 020: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 023: aload 1
      // 024: sipush 18270
      // 027: ldc2_w 5830133670832748980
      // 02a: lload 2
      // 02b: lxor
      // 02c: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 031: nop
      // 032: aload 0
      // 033: invokevirtual zfo.dlx ()Z
      // 036: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 039: invokestatic OpaquePredicate.c ()I
      // 03c: aload 1
      // 03d: sipush 2187
      // 040: ldc2_w 407110031047292517
      // 043: lload 2
      // 044: lxor
      // 045: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04a: nop
      // 04b: aload 0
      // 04c: invokevirtual zfo.sha ()Z
      // 04f: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 052: istore 4
      // 054: aload 1
      // 055: sipush 28910
      // 058: ldc2_w 5168059371453451865
      // 05b: lload 2
      // 05c: lxor
      // 05d: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 062: nop
      // 063: aload 0
      // 064: invokevirtual zfo.r8i ()Z
      // 067: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 06a: aload 1
      // 06b: sipush 14713
      // 06e: ldc2_w 2196595019529897940
      // 071: lload 2
      // 072: lxor
      // 073: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 078: nop
      // 079: aload 0
      // 07a: invokevirtual zfo.zz6 ()I
      // 07d: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 080: aload 1
      // 081: sipush 1788
      // 084: ldc2_w 6684134353061705747
      // 087: lload 2
      // 088: lxor
      // 089: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08e: nop
      // 08f: aload 0
      // 090: invokevirtual zfo.sep ()I
      // 093: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 096: aload 1
      // 097: sipush 30217
      // 09a: ldc2_w 6005907444600047784
      // 09d: lload 2
      // 09e: lxor
      // 09f: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a4: nop
      // 0a5: aload 0
      // 0a6: invokevirtual zfo.djz ()I
      // 0a9: invokevirtual bdo.iin (Ljava/lang/String;I)V
      // 0ac: aload 1
      // 0ad: sipush 17114
      // 0b0: ldc2_w 6407804596715830311
      // 0b3: lload 2
      // 0b4: lxor
      // 0b5: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0ba: nop
      // 0bb: aload 0
      // 0bc: invokevirtual zfo.ccx ()Z
      // 0bf: invokevirtual bdo.zyu (Ljava/lang/String;Z)V
      // 0c2: aload 1
      // 0c3: sipush 20906
      // 0c6: ldc2_w 2287544527727439691
      // 0c9: lload 2
      // 0ca: lxor
      // 0cb: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d0: nop
      // 0d1: aload 0
      // 0d2: invokevirtual zfo.ujd ()Ljava/lang/String;
      // 0d5: invokevirtual bdo.rjq (Ljava/lang/String;Ljava/lang/String;)V
      // 0d8: aload 0
      // 0d9: iload 4
      // 0db: ifne 176
      // 0de: invokevirtual zfo.dlx ()Z
      // 0e1: ifeq 175
      // 0e4: goto 0eb
      // 0e7: invokestatic zfo.a (Loov;)Loov;
      // 0ea: athrow
      // 0eb: new qhg
      // 0ee: dup
      // 0ef: invokespecial qhg.<init> ()V
      // 0f2: astore 5
      // 0f4: bipush 2
      // 0f5: istore 6
      // 0f7: iload 6
      // 0f9: aload 0
      // 0fa: getfield zfo.p5h L_d3;
      // 0fd: invokevirtual _d3.opt ()I
      // 100: if_icmpge 161
      // 103: aload 0
      // 104: getfield zfo.p5h L_d3;
      // 107: iload 6
      // 109: invokevirtual _d3.ibn (I)Lerg;
      // 10c: astore 7
      // 10e: iload 4
      // 110: ifne 15c
      // 113: aload 7
      // 115: iload 4
      // 117: ifne 17d
      // 11a: goto 121
      // 11d: invokestatic zfo.a (Loov;)Loov;
      // 120: athrow
      // 121: ifnull 159
      // 124: goto 12b
      // 127: invokestatic zfo.a (Loov;)Loov;
      // 12a: athrow
      // 12b: new bdo
      // 12e: dup
      // 12f: invokespecial bdo.<init> ()V
      // 132: astore 8
      // 134: aload 8
      // 136: sipush 2712
      // 139: ldc2_w 3697055825239929934
      // 13c: lload 2
      // 13d: lxor
      // 13e: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 143: nop
      // 144: iload 6
      // 146: i2b
      // 147: invokevirtual bdo.atr (Ljava/lang/String;B)V
      // 14a: aload 7
      // 14c: aload 8
      // 14e: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 151: pop
      // 152: aload 5
      // 154: aload 8
      // 156: invokevirtual qhg.w2j (Lgdw;)V
      // 159: iinc 6 1
      // 15c: iload 4
      // 15e: ifeq 0f7
      // 161: aload 1
      // 162: sipush 32441
      // 165: ldc2_w 7553335603682574443
      // 168: lload 2
      // 169: lxor
      // 16a: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 16f: nop
      // 170: aload 5
      // 172: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 175: aload 0
      // 176: getfield zfo.p5h L_d3;
      // 179: bipush 1
      // 17a: invokevirtual _d3.ibn (I)Lerg;
      // 17d: iload 4
      // 17f: ifne 1bf
      // 182: ifnull 1b7
      // 185: goto 18c
      // 188: invokestatic zfo.a (Loov;)Loov;
      // 18b: athrow
      // 18c: aload 1
      // 18d: sipush 28893
      // 190: ldc2_w 6009273217697091073
      // 193: lload 2
      // 194: lxor
      // 195: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 19a: nop
      // 19b: aload 0
      // 19c: getfield zfo.p5h L_d3;
      // 19f: bipush 1
      // 1a0: invokevirtual _d3.ibn (I)Lerg;
      // 1a3: new bdo
      // 1a6: dup
      // 1a7: invokespecial bdo.<init> ()V
      // 1aa: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 1ad: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 1b0: goto 1b7
      // 1b3: invokestatic zfo.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: getfield zfo.p5h L_d3;
      // 1bb: bipush 0
      // 1bc: invokevirtual _d3.ibn (I)Lerg;
      // 1bf: ifnull 1ed
      // 1c2: aload 1
      // 1c3: sipush 3212
      // 1c6: ldc2_w 5278671812451463734
      // 1c9: lload 2
      // 1ca: lxor
      // 1cb: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d0: nop
      // 1d1: aload 0
      // 1d2: getfield zfo.p5h L_d3;
      // 1d5: bipush 0
      // 1d6: invokevirtual _d3.ibn (I)Lerg;
      // 1d9: new bdo
      // 1dc: dup
      // 1dd: invokespecial bdo.<init> ()V
      // 1e0: invokevirtual erg.zy4 (Lbdo;)Lbdo;
      // 1e3: invokevirtual bdo.rzm (Ljava/lang/String;Lgdw;)V
      // 1e6: goto 1ed
      // 1e9: invokestatic zfo.a (Loov;)Loov;
      // 1ec: athrow
      // 1ed: return
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
      // 000: getstatic zfo.c J
      // 003: ldc2_w 54988670626590
      // 006: lxor
      // 007: lstore 2
      // 008: aload 0
      // 009: aload 1
      // 00a: invokespecial j37.cjb (Lbdo;)V
      // 00d: invokestatic OpaquePredicate.c ()I
      // 010: aload 0
      // 011: aload 1
      // 012: sipush 4493
      // 015: ldc2_w 2173827642870662026
      // 018: lload 2
      // 019: lxor
      // 01a: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 01f: nop
      // 020: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 023: invokevirtual zfo.w2i (Z)V
      // 026: aload 0
      // 027: aload 1
      // 028: sipush 810
      // 02b: ldc2_w 660843614966026565
      // 02e: lload 2
      // 02f: lxor
      // 030: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 035: nop
      // 036: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 039: invokevirtual zfo.vy4 (Z)V
      // 03c: istore 4
      // 03e: aload 0
      // 03f: aload 1
      // 040: sipush 17211
      // 043: ldc2_w 6145293842257989969
      // 046: lload 2
      // 047: lxor
      // 048: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 04d: nop
      // 04e: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 051: invokevirtual zfo.kkd (Z)V
      // 054: aload 0
      // 055: aload 1
      // 056: sipush 16140
      // 059: ldc2_w 8508481774901013782
      // 05c: lload 2
      // 05d: lxor
      // 05e: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 063: nop
      // 064: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 067: invokevirtual zfo.wj5 (Z)V
      // 06a: aload 0
      // 06b: aload 1
      // 06c: sipush 24465
      // 06f: ldc2_w 9103939655304596878
      // 072: lload 2
      // 073: lxor
      // 074: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 079: nop
      // 07a: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 07d: invokevirtual zfo.teb (I)V
      // 080: aload 0
      // 081: aload 1
      // 082: sipush 24277
      // 085: ldc2_w 1240865867694197936
      // 088: lload 2
      // 089: lxor
      // 08a: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 08f: nop
      // 090: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 093: invokevirtual zfo.wa1 (I)V
      // 096: aload 0
      // 097: aload 1
      // 098: sipush 29828
      // 09b: ldc2_w 1109840012099184343
      // 09e: lload 2
      // 09f: lxor
      // 0a0: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0a5: nop
      // 0a6: invokevirtual bdo.uz7 (Ljava/lang/String;)I
      // 0a9: invokevirtual zfo.h22 (I)V
      // 0ac: aload 0
      // 0ad: aload 1
      // 0ae: sipush 17332
      // 0b1: ldc2_w 171276465993503223
      // 0b4: lload 2
      // 0b5: lxor
      // 0b6: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0bb: nop
      // 0bc: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 0bf: invokevirtual zfo.pmu (Z)V
      // 0c2: ldc ""
      // 0c4: nop
      // 0c5: astore 5
      // 0c7: aload 1
      // 0c8: sipush 6948
      // 0cb: ldc2_w 9026620372457064794
      // 0ce: lload 2
      // 0cf: lxor
      // 0d0: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0d5: nop
      // 0d6: iload 4
      // 0d8: ifne 119
      // 0db: bipush 8
      // 0dd: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 0e0: ifeq 103
      // 0e3: goto 0ea
      // 0e6: invokestatic zfo.a (Loov;)Loov;
      // 0e9: athrow
      // 0ea: aload 1
      // 0eb: sipush 6948
      // 0ee: ldc2_w 9026620372457064794
      // 0f1: lload 2
      // 0f2: lxor
      // 0f3: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0f8: nop
      // 0f9: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 0fc: astore 5
      // 0fe: iload 4
      // 100: ifeq 125
      // 103: aload 1
      // 104: sipush 6887
      // 107: ldc2_w 5755336460416977036
      // 10a: lload 2
      // 10b: lxor
      // 10c: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 111: nop
      // 112: goto 119
      // 115: invokestatic zfo.a (Loov;)Loov;
      // 118: athrow
      // 119: invokevirtual bdo.u14 (Ljava/lang/String;)Ljava/lang/String;
      // 11c: astore 6
      // 11e: aload 6
      // 120: invokestatic is3.mb9 (Ljava/lang/String;)Ljava/lang/String;
      // 123: astore 5
      // 125: aload 5
      // 127: invokevirtual java/lang/String.length ()I
      // 12a: ifle 13a
      // 12d: aload 0
      // 12e: aload 5
      // 130: invokevirtual zfo.anv (Ljava/lang/String;)V
      // 133: goto 13a
      // 136: invokestatic zfo.a (Loov;)Loov;
      // 139: athrow
      // 13a: aload 0
      // 13b: invokevirtual zfo.s_a ()Losd;
      // 13e: sipush 14620
      // 141: ldc2_w 1722330726518893420
      // 144: lload 2
      // 145: lxor
      // 146: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 14b: nop
      // 14c: invokevirtual osd.srq (Ljava/lang/String;)L_4o;
      // 14f: astore 6
      // 151: aload 6
      // 153: iload 4
      // 155: ifne 170
      // 158: ifnull 180
      // 15b: goto 162
      // 15e: invokestatic zfo.a (Loov;)Loov;
      // 161: athrow
      // 162: aload 0
      // 163: getstatic m6d.w7i Lw9p;
      // 166: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 169: goto 170
      // 16c: invokestatic zfo.a (Loov;)Loov;
      // 16f: athrow
      // 170: aload 6
      // 172: invokeinterface _4o.zdx ()D 1
      // 177: ldc2_w 0.25
      // 17a: dmul
      // 17b: invokeinterface _4o.zf7 (D)V 3
      // 180: aload 0
      // 181: invokevirtual zfo.dlx ()Z
      // 184: iload 4
      // 186: ifne 23e
      // 189: ifeq 22a
      // 18c: goto 193
      // 18f: invokestatic zfo.a (Loov;)Loov;
      // 192: athrow
      // 193: aload 1
      // 194: sipush 14008
      // 197: ldc2_w 6618808017303053539
      // 19a: lload 2
      // 19b: lxor
      // 19c: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1a1: nop
      // 1a2: bipush 10
      // 1a4: invokevirtual bdo.bzb (Ljava/lang/String;I)Lqhg;
      // 1a7: astore 7
      // 1a9: aload 0
      // 1aa: invokespecial zfo.sug ()V
      // 1ad: bipush 0
      // 1ae: istore 8
      // 1b0: iload 8
      // 1b2: aload 7
      // 1b4: invokevirtual qhg.vek ()I
      // 1b7: if_icmpge 22a
      // 1ba: aload 7
      // 1bc: iload 8
      // 1be: invokevirtual qhg.kd6 (I)Lbdo;
      // 1c1: astore 9
      // 1c3: aload 9
      // 1c5: sipush 9587
      // 1c8: ldc2_w 7780027202804856577
      // 1cb: lload 2
      // 1cc: lxor
      // 1cd: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1d2: nop
      // 1d3: invokevirtual bdo.r_t (Ljava/lang/String;)B
      // 1d6: sipush 255
      // 1d9: iand
      // 1da: istore 10
      // 1dc: iload 4
      // 1de: ifne 225
      // 1e1: iload 10
      // 1e3: iload 4
      // 1e5: ifne 23e
      // 1e8: goto 1ef
      // 1eb: invokestatic zfo.a (Loov;)Loov;
      // 1ee: athrow
      // 1ef: bipush 2
      // 1f0: if_icmplt 222
      // 1f3: goto 1fa
      // 1f6: invokestatic zfo.a (Loov;)Loov;
      // 1f9: athrow
      // 1fa: iload 10
      // 1fc: aload 0
      // 1fd: getfield zfo.p5h L_d3;
      // 200: invokevirtual _d3.opt ()I
      // 203: if_icmpge 222
      // 206: goto 20d
      // 209: invokestatic zfo.a (Loov;)Loov;
      // 20c: athrow
      // 20d: aload 0
      // 20e: getfield zfo.p5h L_d3;
      // 211: iload 10
      // 213: aload 9
      // 215: invokestatic erg.qog (Lbdo;)Lerg;
      // 218: invokevirtual _d3.cxl (ILerg;)V
      // 21b: goto 222
      // 21e: invokestatic zfo.a (Loov;)Loov;
      // 221: athrow
      // 222: iinc 8 1
      // 225: iload 4
      // 227: ifeq 1b0
      // 22a: aload 1
      // 22b: sipush 28302
      // 22e: ldc2_w 777535318381755536
      // 231: lload 2
      // 232: lxor
      // 233: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 238: nop
      // 239: bipush 10
      // 23b: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 23e: iload 4
      // 240: ifne 2b8
      // 243: ifeq 2a4
      // 246: goto 24d
      // 249: invokestatic zfo.a (Loov;)Loov;
      // 24c: athrow
      // 24d: aload 1
      // 24e: sipush 28302
      // 251: ldc2_w 777535318381755536
      // 254: lload 2
      // 255: lxor
      // 256: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 25b: nop
      // 25c: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 25f: iload 4
      // 261: ifne 2a5
      // 264: goto 26b
      // 267: invokestatic zfo.a (Loov;)Loov;
      // 26a: athrow
      // 26b: invokestatic erg.qog (Lbdo;)Lerg;
      // 26e: astore 7
      // 270: aload 7
      // 272: ifnull 2a4
      // 275: aload 7
      // 277: invokevirtual erg.gn1 ()Lu7m;
      // 27a: invokestatic zfo._as (Lu7m;)Z
      // 27d: iload 4
      // 27f: ifne 2b8
      // 282: goto 289
      // 285: invokestatic zfo.a (Loov;)Loov;
      // 288: athrow
      // 289: ifeq 2a4
      // 28c: goto 293
      // 28f: invokestatic zfo.a (Loov;)Loov;
      // 292: athrow
      // 293: aload 0
      // 294: getfield zfo.p5h L_d3;
      // 297: bipush 1
      // 298: aload 7
      // 29a: invokevirtual _d3.cxl (ILerg;)V
      // 29d: goto 2a4
      // 2a0: invokestatic zfo.a (Loov;)Loov;
      // 2a3: athrow
      // 2a4: aload 1
      // 2a5: sipush 31376
      // 2a8: ldc2_w 7081103701636737251
      // 2ab: lload 2
      // 2ac: lxor
      // 2ad: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2b2: nop
      // 2b3: bipush 10
      // 2b5: invokevirtual bdo.inh (Ljava/lang/String;I)Z
      // 2b8: iload 4
      // 2ba: ifne 329
      // 2bd: ifeq 310
      // 2c0: goto 2c7
      // 2c3: invokestatic zfo.a (Loov;)Loov;
      // 2c6: athrow
      // 2c7: aload 1
      // 2c8: sipush 31376
      // 2cb: ldc2_w 7081103701636737251
      // 2ce: lload 2
      // 2cf: lxor
      // 2d0: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2d5: nop
      // 2d6: invokevirtual bdo.b__ (Ljava/lang/String;)Lbdo;
      // 2d9: invokestatic erg.qog (Lbdo;)Lerg;
      // 2dc: astore 7
      // 2de: aload 7
      // 2e0: iload 4
      // 2e2: ifne 2f1
      // 2e5: ifnull 30b
      // 2e8: goto 2ef
      // 2eb: invokestatic zfo.a (Loov;)Loov;
      // 2ee: athrow
      // 2ef: aload 7
      // 2f1: invokevirtual erg.gn1 ()Lu7m;
      // 2f4: getstatic xbr.fpq Lu7m;
      // 2f7: if_acmpne 30b
      // 2fa: aload 0
      // 2fb: getfield zfo.p5h L_d3;
      // 2fe: bipush 0
      // 2ff: aload 7
      // 301: invokevirtual _d3.cxl (ILerg;)V
      // 304: goto 30b
      // 307: invokestatic zfo.a (Loov;)Loov;
      // 30a: athrow
      // 30b: iload 4
      // 30d: ifeq 345
      // 310: aload 1
      // 311: sipush 10264
      // 314: ldc2_w 4978515369399597637
      // 317: lload 2
      // 318: lxor
      // 319: invokedynamic r (IJ)Ljava/lang/String; bsm=zfo.f (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31e: nop
      // 31f: invokevirtual bdo.dvl (Ljava/lang/String;)Z
      // 322: goto 329
      // 325: invokestatic zfo.a (Loov;)Loov;
      // 328: athrow
      // 329: ifeq 345
      // 32c: aload 0
      // 32d: getfield zfo.p5h L_d3;
      // 330: bipush 0
      // 331: new erg
      // 334: dup
      // 335: getstatic xbr.fpq Lu7m;
      // 338: invokespecial erg.<init> (Lu7m;)V
      // 33b: invokevirtual _d3.cxl (ILerg;)V
      // 33e: goto 345
      // 341: invokestatic zfo.a (Loov;)Loov;
      // 344: athrow
      // 345: aload 0
      // 346: invokespecial zfo._yh ()V
      // 349: return
   }

   @Override
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
      // 06: ifne 1b
      // 09: aload 0
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic zfo.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 0
      // 15: ireturn
      // 16: invokestatic zfo.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifne 37
      // 1f: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 22: aload 0
      // 23: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 26: if_acmpeq 36
      // 29: goto 30
      // 2c: invokestatic zfo.a (Loov;)Loov;
      // 2f: athrow
      // 30: bipush 0
      // 31: ireturn
      // 32: invokestatic zfo.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 1
      // 37: checkcast zfo
      // 3a: astore 3
      // 3b: aload 0
      // 3c: invokespecial zfo.x0b ()Z
      // 3f: iload 2
      // 40: ifne e9
      // 43: ifeq e8
      // 46: goto 4d
      // 49: invokestatic zfo.a (Loov;)Loov;
      // 4c: athrow
      // 4d: aload 3
      // 4e: invokespecial zfo.x0b ()Z
      // 51: iload 2
      // 52: ifne e9
      // 55: goto 5c
      // 58: invokestatic zfo.a (Loov;)Loov;
      // 5b: athrow
      // 5c: ifeq e8
      // 5f: goto 66
      // 62: invokestatic zfo.a (Loov;)Loov;
      // 65: athrow
      // 66: aload 0
      // 67: invokevirtual zfo.zz6 ()I
      // 6a: istore 4
      // 6c: aload 3
      // 6d: invokevirtual zfo.zz6 ()I
      // 70: istore 5
      // 72: iload 4
      // 74: iload 2
      // 75: ifne e3
      // 78: iload 5
      // 7a: if_icmpeq e2
      // 7d: goto 84
      // 80: invokestatic zfo.a (Loov;)Loov;
      // 83: athrow
      // 84: iload 4
      // 86: iload 2
      // 87: ifne bc
      // 8a: goto 91
      // 8d: invokestatic zfo.a (Loov;)Loov;
      // 90: athrow
      // 91: ifne b3
      // 94: goto 9b
      // 97: invokestatic zfo.a (Loov;)Loov;
      // 9a: athrow
      // 9b: iload 5
      // 9d: iload 2
      // 9e: ifne e3
      // a1: goto a8
      // a4: invokestatic zfo.a (Loov;)Loov;
      // a7: athrow
      // a8: bipush 1
      // a9: if_icmpeq e2
      // ac: goto b3
      // af: invokestatic zfo.a (Loov;)Loov;
      // b2: athrow
      // b3: iload 4
      // b5: goto bc
      // b8: invokestatic zfo.a (Loov;)Loov;
      // bb: athrow
      // bc: iload 2
      // bd: ifne d4
      // c0: bipush 1
      // c1: if_icmpne e6
      // c4: goto cb
      // c7: invokestatic zfo.a (Loov;)Loov;
      // ca: athrow
      // cb: iload 5
      // cd: goto d4
      // d0: invokestatic zfo.a (Loov;)Loov;
      // d3: athrow
      // d4: iload 2
      // d5: ifne e3
      // d8: ifne e6
      // db: goto e2
      // de: invokestatic zfo.a (Loov;)Loov;
      // e1: athrow
      // e2: bipush 1
      // e3: goto e7
      // e6: bipush 0
      // e7: ireturn
      // e8: bipush 0
      // e9: ireturn
   }

   @Override
   public dms kv0(dms param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: checkcast zfo
      // 004: astore 3
      // 005: invokestatic OpaquePredicate.b ()I
      // 008: new zfo
      // 00b: dup
      // 00c: aload 0
      // 00d: getfield zfo.oay Lt9d;
      // 010: invokespecial zfo.<init> (Lt9d;)V
      // 013: astore 4
      // 015: aload 0
      // 016: invokevirtual zfo.zz6 ()I
      // 019: istore 5
      // 01b: istore 2
      // 01c: aload 3
      // 01d: invokevirtual zfo.zz6 ()I
      // 020: istore 6
      // 022: bipush 0
      // 023: istore 7
      // 025: iload 5
      // 027: iload 2
      // 028: ifeq 048
      // 02b: iload 6
      // 02d: if_icmpne 03f
      // 030: goto 037
      // 033: invokestatic zfo.a (Loov;)Loov;
      // 036: athrow
      // 037: iload 5
      // 039: istore 7
      // 03b: iload 2
      // 03c: ifne 0a0
      // 03f: iload 5
      // 041: goto 048
      // 044: invokestatic zfo.a (Loov;)Loov;
      // 047: athrow
      // 048: iload 2
      // 049: ifeq 077
      // 04c: ifne 06e
      // 04f: goto 056
      // 052: invokestatic zfo.a (Loov;)Loov;
      // 055: athrow
      // 056: iload 6
      // 058: iload 2
      // 059: ifeq 09e
      // 05c: goto 063
      // 05f: invokestatic zfo.a (Loov;)Loov;
      // 062: athrow
      // 063: bipush 1
      // 064: if_icmpeq 09d
      // 067: goto 06e
      // 06a: invokestatic zfo.a (Loov;)Loov;
      // 06d: athrow
      // 06e: iload 5
      // 070: goto 077
      // 073: invokestatic zfo.a (Loov;)Loov;
      // 076: athrow
      // 077: iload 2
      // 078: ifeq 0a2
      // 07b: bipush 1
      // 07c: if_icmpne 0a0
      // 07f: goto 086
      // 082: invokestatic zfo.a (Loov;)Loov;
      // 085: athrow
      // 086: iload 6
      // 088: iload 2
      // 089: ifeq 0a2
      // 08c: goto 093
      // 08f: invokestatic zfo.a (Loov;)Loov;
      // 092: athrow
      // 093: ifne 0a0
      // 096: goto 09d
      // 099: invokestatic zfo.a (Loov;)Loov;
      // 09c: athrow
      // 09d: bipush 2
      // 09e: istore 7
      // 0a0: iload 7
      // 0a2: iload 2
      // 0a3: ifeq 0c0
      // 0a6: ifne 191
      // 0a9: goto 0b0
      // 0ac: invokestatic zfo.a (Loov;)Loov;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: getfield zfo.z2d Ljava/util/Random;
      // 0b4: bipush 9
      // 0b6: invokevirtual java/util/Random.nextInt (I)I
      // 0b9: goto 0c0
      // 0bc: invokestatic zfo.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: istore 8
      // 0c2: iload 8
      // 0c4: bipush 4
      // 0c5: iload 2
      // 0c6: ifeq 0f7
      // 0c9: if_icmpge 0e1
      // 0cc: goto 0d3
      // 0cf: invokestatic zfo.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: invokevirtual zfo.sep ()I
      // 0d7: sipush 255
      // 0da: iand
      // 0db: istore 9
      // 0dd: iload 2
      // 0de: ifne 11a
      // 0e1: iload 8
      // 0e3: iload 2
      // 0e4: ifeq 118
      // 0e7: goto 0ee
      // 0ea: invokestatic zfo.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: bipush 8
      // 0f0: goto 0f7
      // 0f3: invokestatic zfo.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: if_icmpge 108
      // 0fa: aload 3
      // 0fb: invokevirtual zfo.sep ()I
      // 0fe: sipush 255
      // 101: iand
      // 102: istore 9
      // 104: iload 2
      // 105: ifne 11a
      // 108: aload 0
      // 109: getfield zfo.z2d Ljava/util/Random;
      // 10c: bipush 7
      // 10e: invokevirtual java/util/Random.nextInt (I)I
      // 111: goto 118
      // 114: invokestatic zfo.a (Loov;)Loov;
      // 117: athrow
      // 118: istore 9
      // 11a: aload 0
      // 11b: getfield zfo.z2d Ljava/util/Random;
      // 11e: bipush 5
      // 11f: invokevirtual java/util/Random.nextInt (I)I
      // 122: istore 10
      // 124: iload 10
      // 126: bipush 2
      // 127: iload 2
      // 128: ifeq 150
      // 12b: if_icmpge 146
      // 12e: goto 135
      // 131: invokestatic zfo.a (Loov;)Loov;
      // 134: athrow
      // 135: iload 9
      // 137: aload 0
      // 138: invokevirtual zfo.sep ()I
      // 13b: ldc 65280
      // 13d: nop
      // 13e: iand
      // 13f: ior
      // 140: istore 9
      // 142: iload 2
      // 143: ifne 18a
      // 146: iload 10
      // 148: bipush 4
      // 149: goto 150
      // 14c: invokestatic zfo.a (Loov;)Loov;
      // 14f: athrow
      // 150: iload 2
      // 151: ifeq 187
      // 154: if_icmpge 16f
      // 157: goto 15e
      // 15a: invokestatic zfo.a (Loov;)Loov;
      // 15d: athrow
      // 15e: iload 9
      // 160: aload 3
      // 161: invokevirtual zfo.sep ()I
      // 164: ldc 65280
      // 166: nop
      // 167: iand
      // 168: ior
      // 169: istore 9
      // 16b: iload 2
      // 16c: ifne 18a
      // 16f: iload 9
      // 171: aload 0
      // 172: getfield zfo.z2d Ljava/util/Random;
      // 175: bipush 5
      // 176: invokevirtual java/util/Random.nextInt (I)I
      // 179: bipush 8
      // 17b: ishl
      // 17c: ldc 65280
      // 17e: nop
      // 17f: iand
      // 180: goto 187
      // 183: invokestatic zfo.a (Loov;)Loov;
      // 186: athrow
      // 187: ior
      // 188: istore 9
      // 18a: aload 4
      // 18c: iload 9
      // 18e: invokevirtual zfo.wa1 (I)V
      // 191: aload 4
      // 193: iload 7
      // 195: invokevirtual zfo.teb (I)V
      // 198: aload 0
      // 199: getstatic m6d.t9k Lw9p;
      // 19c: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 19f: invokeinterface _4o.zdx ()D 1
      // 1a4: aload 1
      // 1a5: getstatic m6d.t9k Lw9p;
      // 1a8: invokevirtual dms.dgt (Lw9p;)L_4o;
      // 1ab: invokeinterface _4o.zdx ()D 1
      // 1b0: dadd
      // 1b1: aload 0
      // 1b2: invokespecial zfo._4k ()F
      // 1b5: f2d
      // 1b6: dadd
      // 1b7: dstore 8
      // 1b9: aload 4
      // 1bb: getstatic m6d.t9k Lw9p;
      // 1be: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 1c1: dload 8
      // 1c3: ldc2_w 3.0
      // 1c6: ddiv
      // 1c7: invokeinterface _4o.zf7 (D)V 3
      // 1cc: aload 0
      // 1cd: getstatic zfo.mex Lw9p;
      // 1d0: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 1d3: invokeinterface _4o.zdx ()D 1
      // 1d8: aload 1
      // 1d9: getstatic zfo.mex Lw9p;
      // 1dc: invokevirtual dms.dgt (Lw9p;)L_4o;
      // 1df: invokeinterface _4o.zdx ()D 1
      // 1e4: dadd
      // 1e5: aload 0
      // 1e6: invokespecial zfo._hm ()D
      // 1e9: dadd
      // 1ea: dstore 10
      // 1ec: aload 4
      // 1ee: getstatic zfo.mex Lw9p;
      // 1f1: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 1f4: dload 10
      // 1f6: ldc2_w 3.0
      // 1f9: ddiv
      // 1fa: invokeinterface _4o.zf7 (D)V 3
      // 1ff: aload 0
      // 200: getstatic m6d.w7i Lw9p;
      // 203: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 206: invokeinterface _4o.zdx ()D 1
      // 20b: aload 1
      // 20c: getstatic m6d.w7i Lw9p;
      // 20f: invokevirtual dms.dgt (Lw9p;)L_4o;
      // 212: invokeinterface _4o.zdx ()D 1
      // 217: dadd
      // 218: aload 0
      // 219: invokespecial zfo.v10 ()D
      // 21c: dadd
      // 21d: dstore 12
      // 21f: aload 4
      // 221: getstatic m6d.w7i Lw9p;
      // 224: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 227: dload 12
      // 229: ldc2_w 3.0
      // 22c: ddiv
      // 22d: invokeinterface _4o.zf7 (D)V 3
      // 232: aload 4
      // 234: areturn
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
      // 000: aload 0
      // 001: aload 1
      // 002: aload 2
      // 003: invokespecial j37.hx8 (Lcss;Lps6;)Lps6;
      // 006: astore 2
      // 007: bipush 0
      // 008: istore 4
      // 00a: invokestatic OpaquePredicate.c ()I
      // 00d: bipush 0
      // 00e: istore 5
      // 010: istore 3
      // 011: aload 2
      // 012: instanceof zfo$m33
      // 015: iload 3
      // 016: ifne 059
      // 019: ifeq 049
      // 01c: goto 023
      // 01f: invokestatic zfo.a (Loov;)Loov;
      // 022: athrow
      // 023: aload 2
      // 024: checkcast zfo$m33
      // 027: getfield zfo$m33.t_o I
      // 02a: istore 4
      // 02c: aload 2
      // 02d: checkcast zfo$m33
      // 030: getfield zfo$m33.psr I
      // 033: sipush 255
      // 036: iand
      // 037: aload 0
      // 038: getfield zfo.z2d Ljava/util/Random;
      // 03b: bipush 5
      // 03c: invokevirtual java/util/Random.nextInt (I)I
      // 03f: bipush 8
      // 041: ishl
      // 042: ior
      // 043: istore 5
      // 045: iload 3
      // 046: ifeq 0a3
      // 049: aload 0
      // 04a: getfield zfo.z2d Ljava/util/Random;
      // 04d: bipush 10
      // 04f: invokevirtual java/util/Random.nextInt (I)I
      // 052: goto 059
      // 055: invokestatic zfo.a (Loov;)Loov;
      // 058: athrow
      // 059: iload 3
      // 05a: ifne 07e
      // 05d: ifne 06e
      // 060: goto 067
      // 063: invokestatic zfo.a (Loov;)Loov;
      // 066: athrow
      // 067: bipush 1
      // 068: istore 4
      // 06a: iload 3
      // 06b: ifeq 097
      // 06e: aload 0
      // 06f: getfield zfo.z2d Ljava/util/Random;
      // 072: bipush 7
      // 074: invokevirtual java/util/Random.nextInt (I)I
      // 077: goto 07e
      // 07a: invokestatic zfo.a (Loov;)Loov;
      // 07d: athrow
      // 07e: istore 6
      // 080: aload 0
      // 081: getfield zfo.z2d Ljava/util/Random;
      // 084: bipush 5
      // 085: invokevirtual java/util/Random.nextInt (I)I
      // 088: istore 7
      // 08a: bipush 0
      // 08b: istore 4
      // 08d: iload 6
      // 08f: iload 7
      // 091: bipush 8
      // 093: ishl
      // 094: ior
      // 095: istore 5
      // 097: new zfo$m33
      // 09a: dup
      // 09b: iload 4
      // 09d: iload 5
      // 09f: invokespecial zfo$m33.<init> (II)V
      // 0a2: astore 2
      // 0a3: aload 0
      // 0a4: iload 4
      // 0a6: invokevirtual zfo.teb (I)V
      // 0a9: aload 0
      // 0aa: iload 5
      // 0ac: invokevirtual zfo.wa1 (I)V
      // 0af: aload 0
      // 0b0: getfield zfo.z2d Ljava/util/Random;
      // 0b3: bipush 5
      // 0b4: invokevirtual java/util/Random.nextInt (I)I
      // 0b7: iload 3
      // 0b8: ifne 0d5
      // 0bb: ifne 0d3
      // 0be: goto 0c5
      // 0c1: invokestatic zfo.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: aload 0
      // 0c6: sipush -24000
      // 0c9: invokevirtual zfo.mr2 (I)V
      // 0cc: goto 0d3
      // 0cf: invokestatic zfo.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: iload 4
      // 0d5: bipush 4
      // 0d6: iload 3
      // 0d7: ifne 0f9
      // 0da: if_icmpeq 159
      // 0dd: goto 0e4
      // 0e0: invokestatic zfo.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: iload 4
      // 0e6: iload 3
      // 0e7: ifne 121
      // 0ea: goto 0f1
      // 0ed: invokestatic zfo.a (Loov;)Loov;
      // 0f0: athrow
      // 0f1: bipush 3
      // 0f2: goto 0f9
      // 0f5: invokestatic zfo.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: if_icmpeq 159
      // 0fc: aload 0
      // 0fd: getstatic m6d.t9k Lw9p;
      // 100: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 103: aload 0
      // 104: invokespecial zfo._4k ()F
      // 107: f2d
      // 108: invokeinterface _4o.zf7 (D)V 3
      // 10d: iload 3
      // 10e: ifne 155
      // 111: goto 118
      // 114: invokestatic zfo.a (Loov;)Loov;
      // 117: athrow
      // 118: iload 4
      // 11a: goto 121
      // 11d: invokestatic zfo.a (Loov;)Loov;
      // 120: athrow
      // 121: ifne 13f
      // 124: aload 0
      // 125: getstatic m6d.w7i Lw9p;
      // 128: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 12b: aload 0
      // 12c: invokespecial zfo.v10 ()D
      // 12f: invokeinterface _4o.zf7 (D)V 3
      // 134: iload 3
      // 135: ifeq 17e
      // 138: goto 13f
      // 13b: invokestatic zfo.a (Loov;)Loov;
      // 13e: athrow
      // 13f: aload 0
      // 140: getstatic m6d.w7i Lw9p;
      // 143: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 146: ldc2_w 0.17499999701976776
      // 149: invokeinterface _4o.zf7 (D)V 3
      // 14e: goto 155
      // 151: invokestatic zfo.a (Loov;)Loov;
      // 154: athrow
      // 155: iload 3
      // 156: ifeq 17e
      // 159: aload 0
      // 15a: getstatic m6d.t9k Lw9p;
      // 15d: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 160: ldc2_w 15.0
      // 163: invokeinterface _4o.zf7 (D)V 3
      // 168: aload 0
      // 169: getstatic m6d.w7i Lw9p;
      // 16c: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 16f: ldc2_w 0.20000000298023224
      // 172: invokeinterface _4o.zf7 (D)V 3
      // 177: goto 17e
      // 17a: invokestatic zfo.a (Loov;)Loov;
      // 17d: athrow
      // 17e: iload 4
      // 180: bipush 2
      // 181: iload 3
      // 182: ifne 199
      // 185: if_icmpeq 1b7
      // 188: goto 18f
      // 18b: invokestatic zfo.a (Loov;)Loov;
      // 18e: athrow
      // 18f: iload 4
      // 191: bipush 1
      // 192: goto 199
      // 195: invokestatic zfo.a (Loov;)Loov;
      // 198: athrow
      // 199: if_icmpeq 1b7
      // 19c: aload 0
      // 19d: getstatic zfo.mex Lw9p;
      // 1a0: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 1a3: aload 0
      // 1a4: invokespecial zfo._hm ()D
      // 1a7: invokeinterface _4o.zf7 (D)V 3
      // 1ac: iload 3
      // 1ad: ifeq 1cd
      // 1b0: goto 1b7
      // 1b3: invokestatic zfo.a (Loov;)Loov;
      // 1b6: athrow
      // 1b7: aload 0
      // 1b8: getstatic zfo.mex Lw9p;
      // 1bb: invokevirtual zfo.dgt (Lw9p;)L_4o;
      // 1be: ldc2_w 0.5
      // 1c1: invokeinterface _4o.zf7 (D)V 3
      // 1c6: goto 1cd
      // 1c9: invokestatic zfo.a (Loov;)Loov;
      // 1cc: athrow
      // 1cd: aload 0
      // 1ce: aload 0
      // 1cf: invokevirtual zfo.axb ()F
      // 1d2: invokevirtual zfo.uh3 (F)V
      // 1d5: aload 2
      // 1d6: areturn
   }

   public float cyr(float var1) {
      return this.h6u + (this.ndn - this.h6u) * var1;
   }

   public float avw(float var1) {
      return this.m7x + (this.lxm - this.m7x) * var1;
   }

   public float h5y(float var1) {
      return this.nv_ + (this.fs9 - this.nv_) * var1;
   }

   public void kei(int param1) {
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
      // 05: invokevirtual zfo.cbz ()Z
      // 08: iload 2
      // 09: ifne 17
      // 0c: ifeq 6a
      // 0f: goto 16
      // 12: invokestatic zfo.a (Loov;)Loov;
      // 15: athrow
      // 16: iload 1
      // 17: iload 2
      // 18: ifne 26
      // 1b: ifge 2b
      // 1e: goto 25
      // 21: invokestatic zfo.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 0
      // 26: istore 1
      // 27: iload 2
      // 28: ifeq 3b
      // 2b: aload 0
      // 2c: bipush 1
      // 2d: putfield zfo.avu Z
      // 30: aload 0
      // 31: invokespecial zfo.fkj ()V
      // 34: goto 3b
      // 37: invokestatic zfo.a (Loov;)Loov;
      // 3a: athrow
      // 3b: iload 1
      // 3c: bipush 90
      // 3e: if_icmplt 51
      // 41: aload 0
      // 42: fconst_1
      // 43: putfield zfo.q0m F
      // 46: iload 2
      // 47: ifeq 6a
      // 4a: goto 51
      // 4d: invokestatic zfo.a (Loov;)Loov;
      // 50: athrow
      // 51: aload 0
      // 52: ldc 0.4
      // 54: nop
      // 55: ldc 0.4
      // 57: nop
      // 58: iload 1
      // 59: i2f
      // 5a: fmul
      // 5b: ldc 90.0
      // 5d: nop
      // 5e: fdiv
      // 5f: fadd
      // 60: putfield zfo.q0m F
      // 63: goto 6a
      // 66: invokestatic zfo.a (Loov;)Loov;
      // 69: athrow
      // 6a: return
   }

   public void bw8(boolean var1) {
      int var2 = OpaquePredicate.b();

      w_0 var10000;
      label27: {
         try {
            if (var1) {
               var10000 = w_0.mwm;
               break label27;
            }
         } catch (oov var11) {
            throw a(var11);
         }

         var10000 = w_0.bac;
      }

      w_0 var3 = var10000;
      int var4 = 0;

      while (var4 < 7) {
         double var5 = this.z2d.nextGaussian() * 0.02;
         double var7 = this.z2d.nextGaussian() * 0.02;
         double var9 = this.z2d.nextGaussian() * 0.02;
         this.oay
            .zvy(
               var3,
               this.o2v + (double)(this.z2d.nextFloat() * this.uo6 * 2.0F) - (double)this.uo6,
               this.kfp + 0.5 + (double)(this.z2d.nextFloat() * this.ikl),
               this.vbd + (double)(this.z2d.nextFloat() * this.uo6 * 2.0F) - (double)this.uo6,
               var5,
               var7,
               var9,
               new int[0]
            );
         var4++;
         if (var2 == 0) {
            break;
         }
      }
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
      // 05: bipush 7
      // 07: iload 2
      // 08: ifne 2f
      // 0b: if_icmpne 25
      // 0e: goto 15
      // 11: invokestatic zfo.a (Loov;)Loov;
      // 14: athrow
      // 15: aload 0
      // 16: bipush 1
      // 17: invokevirtual zfo.bw8 (Z)V
      // 1a: iload 2
      // 1b: ifeq 4e
      // 1e: goto 25
      // 21: invokestatic zfo.a (Loov;)Loov;
      // 24: athrow
      // 25: iload 1
      // 26: bipush 6
      // 28: goto 2f
      // 2b: invokestatic zfo.a (Loov;)Loov;
      // 2e: athrow
      // 2f: if_icmpne 42
      // 32: aload 0
      // 33: bipush 0
      // 34: invokevirtual zfo.bw8 (Z)V
      // 37: iload 2
      // 38: ifeq 4e
      // 3b: goto 42
      // 3e: invokestatic zfo.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: iload 1
      // 44: invokespecial j37.ptf (B)V
      // 47: goto 4e
      // 4a: invokestatic zfo.a (Loov;)Loov;
      // 4d: athrow
      // 4e: return
   }

   @Override
   public void dsu() {
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
      // 05: invokespecial j37.dsu ()V
      // 08: aload 0
      // 09: getfield zfo.m7x F
      // 0c: fconst_0
      // 0d: iload 1
      // 0e: ifne 2e
      // 11: fcmpl
      // 12: ifle b1
      // 15: goto 1c
      // 18: invokestatic zfo.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield zfo.ksw F
      // 20: ldc 3.1415927
      // 22: nop
      // 23: fmul
      // 24: ldc 180.0
      // 26: nop
      // 27: goto 2e
      // 2a: invokestatic zfo.a (Loov;)Loov;
      // 2d: athrow
      // 2e: fdiv
      // 2f: invokestatic fe6.rtn (F)F
      // 32: fstore 2
      // 33: aload 0
      // 34: getfield zfo.ksw F
      // 37: ldc 3.1415927
      // 39: nop
      // 3a: fmul
      // 3b: ldc 180.0
      // 3d: nop
      // 3e: fdiv
      // 3f: invokestatic fe6.ssk (F)F
      // 42: fstore 3
      // 43: ldc 0.7
      // 45: nop
      // 46: aload 0
      // 47: getfield zfo.m7x F
      // 4a: fmul
      // 4b: fstore 4
      // 4d: ldc 0.15
      // 4f: nop
      // 50: aload 0
      // 51: getfield zfo.m7x F
      // 54: fmul
      // 55: fstore 5
      // 57: aload 0
      // 58: getfield zfo.wgv Li2h;
      // 5b: aload 0
      // 5c: getfield zfo.o2v D
      // 5f: fload 4
      // 61: fload 2
      // 62: fmul
      // 63: f2d
      // 64: dadd
      // 65: aload 0
      // 66: getfield zfo.kfp D
      // 69: aload 0
      // 6a: invokevirtual zfo.yyb ()D
      // 6d: dadd
      // 6e: aload 0
      // 6f: getfield zfo.wgv Li2h;
      // 72: invokevirtual EntityLivingBase.g4y ()D
      // 75: dadd
      // 76: fload 5
      // 78: f2d
      // 79: dadd
      // 7a: aload 0
      // 7b: getfield zfo.vbd D
      // 7e: fload 4
      // 80: fload 3
      // 81: fmul
      // 82: f2d
      // 83: dsub
      // 84: invokevirtual EntityLivingBase.m6_ (DDD)V
      // 87: aload 0
      // 88: getfield zfo.wgv Li2h;
      // 8b: iload 1
      // 8c: ifne a7
      // 8f: instanceof Entity
      // 92: ifeq b1
      // 95: goto 9c
      // 98: invokestatic zfo.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 0
      // 9d: getfield zfo.wgv Li2h;
      // a0: goto a7
      // a3: invokestatic zfo.a (Loov;)Loov;
      // a6: athrow
      // a7: checkcast Entity
      // aa: aload 0
      // ab: getfield zfo.ksw F
      // ae: putfield Entity.ksw F
      // b1: return
   }

   private float _4k() {
      return 15.0F + (float)this.z2d.nextInt(8) + (float)this.z2d.nextInt(9);
   }

   private double _hm() {
      return 0.4F + this.z2d.nextDouble() * 0.2 + this.z2d.nextDouble() * 0.2 + this.z2d.nextDouble() * 0.2;
   }

   private double v10() {
      return (0.45F + this.z2d.nextDouble() * 0.3 + this.z2d.nextDouble() * 0.3 + this.z2d.nextDouble() * 0.3) * 0.25;
   }

   public static boolean _as(u7m param0) {
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
      // 05: getstatic xbr.mhm Lu7m;
      // 08: iload 1
      // 09: ifne 21
      // 0c: if_acmpeq 3d
      // 0f: goto 16
      // 12: invokestatic zfo.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic xbr.fps Lu7m;
      // 1a: goto 21
      // 1d: invokestatic zfo.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 3a
      // 25: if_acmpeq 3d
      // 28: goto 2f
      // 2b: invokestatic zfo.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getstatic xbr.krl Lu7m;
      // 33: goto 3a
      // 36: invokestatic zfo.a (Loov;)Loov;
      // 39: athrow
      // 3a: if_acmpne 45
      // 3d: bipush 1
      // 3e: goto 46
      // 41: invokestatic zfo.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
   }

   @Override
   public boolean z2m() {
      return false;
   }

   @Override
   public float c5y() {
      return this.ikl;
   }

   @Override
   public boolean ltx(int param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 3
      // 004: iload 1
      // 005: sipush 499
      // 008: iload 3
      // 009: ifeq 0b8
      // 00c: if_icmpne 0b4
      // 00f: goto 016
      // 012: invokestatic zfo.a (Loov;)Loov;
      // 015: athrow
      // 016: aload 0
      // 017: invokevirtual zfo.jz_ ()Z
      // 01a: iload 3
      // 01b: ifeq 0b9
      // 01e: goto 025
      // 021: invokestatic zfo.a (Loov;)Loov;
      // 024: athrow
      // 025: ifeq 0b4
      // 028: goto 02f
      // 02b: invokestatic zfo.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 2
      // 030: iload 3
      // 031: ifeq 071
      // 034: goto 03b
      // 037: invokestatic zfo.a (Loov;)Loov;
      // 03a: athrow
      // 03b: ifnonnull 070
      // 03e: goto 045
      // 041: invokestatic zfo.a (Loov;)Loov;
      // 044: athrow
      // 045: aload 0
      // 046: invokevirtual zfo.dlx ()Z
      // 049: iload 3
      // 04a: ifeq 06f
      // 04d: goto 054
      // 050: invokestatic zfo.a (Loov;)Loov;
      // 053: athrow
      // 054: ifeq 070
      // 057: goto 05e
      // 05a: invokestatic zfo.a (Loov;)Loov;
      // 05d: athrow
      // 05e: aload 0
      // 05f: bipush 0
      // 060: invokevirtual zfo.kkd (Z)V
      // 063: aload 0
      // 064: invokespecial zfo.sug ()V
      // 067: bipush 1
      // 068: goto 06f
      // 06b: invokestatic zfo.a (Loov;)Loov;
      // 06e: athrow
      // 06f: ireturn
      // 070: aload 2
      // 071: iload 3
      // 072: ifeq 080
      // 075: ifnull 0b4
      // 078: goto 07f
      // 07b: invokestatic zfo.a (Loov;)Loov;
      // 07e: athrow
      // 07f: aload 2
      // 080: invokevirtual erg.gn1 ()Lu7m;
      // 083: getstatic ox_.cug Lhrd;
      // 086: invokestatic u7m.gfm (Le0x;)Lu7m;
      // 089: if_acmpne 0b4
      // 08c: aload 0
      // 08d: invokevirtual zfo.dlx ()Z
      // 090: iload 3
      // 091: ifeq 0b9
      // 094: goto 09b
      // 097: invokestatic zfo.a (Loov;)Loov;
      // 09a: athrow
      // 09b: ifne 0b4
      // 09e: goto 0a5
      // 0a1: invokestatic zfo.a (Loov;)Loov;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: bipush 1
      // 0a7: invokevirtual zfo.kkd (Z)V
      // 0aa: aload 0
      // 0ab: invokespecial zfo.sug ()V
      // 0ae: bipush 1
      // 0af: ireturn
      // 0b0: invokestatic zfo.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: iload 1
      // 0b5: sipush 400
      // 0b8: isub
      // 0b9: istore 4
      // 0bb: iload 4
      // 0bd: iload 3
      // 0be: ifeq 1b3
      // 0c1: iflt 1ac
      // 0c4: goto 0cb
      // 0c7: invokestatic zfo.a (Loov;)Loov;
      // 0ca: athrow
      // 0cb: iload 4
      // 0cd: bipush 2
      // 0ce: iload 3
      // 0cf: ifeq 1b2
      // 0d2: goto 0d9
      // 0d5: invokestatic zfo.a (Loov;)Loov;
      // 0d8: athrow
      // 0d9: if_icmpge 1ac
      // 0dc: goto 0e3
      // 0df: invokestatic zfo.a (Loov;)Loov;
      // 0e2: athrow
      // 0e3: iload 4
      // 0e5: aload 0
      // 0e6: getfield zfo.p5h L_d3;
      // 0e9: invokevirtual _d3.opt ()I
      // 0ec: iload 3
      // 0ed: ifeq 1b2
      // 0f0: goto 0f7
      // 0f3: invokestatic zfo.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: if_icmpge 1ac
      // 0fa: goto 101
      // 0fd: invokestatic zfo.a (Loov;)Loov;
      // 100: athrow
      // 101: iload 4
      // 103: iload 3
      // 104: ifeq 140
      // 107: goto 10e
      // 10a: invokestatic zfo.a (Loov;)Loov;
      // 10d: athrow
      // 10e: ifne 13e
      // 111: goto 118
      // 114: invokestatic zfo.a (Loov;)Loov;
      // 117: athrow
      // 118: aload 2
      // 119: iload 3
      // 11a: ifeq 12f
      // 11d: goto 124
      // 120: invokestatic zfo.a (Loov;)Loov;
      // 123: athrow
      // 124: ifnull 13e
      // 127: goto 12e
      // 12a: invokestatic zfo.a (Loov;)Loov;
      // 12d: athrow
      // 12e: aload 2
      // 12f: invokevirtual erg.gn1 ()Lu7m;
      // 132: getstatic xbr.fpq Lu7m;
      // 135: if_acmpeq 13e
      // 138: bipush 0
      // 139: ireturn
      // 13a: invokestatic zfo.a (Loov;)Loov;
      // 13d: athrow
      // 13e: iload 4
      // 140: iload 3
      // 141: ifeq 1a9
      // 144: bipush 1
      // 145: if_icmpne 193
      // 148: goto 14f
      // 14b: invokestatic zfo.a (Loov;)Loov;
      // 14e: athrow
      // 14f: aload 2
      // 150: iload 3
      // 151: ifeq 166
      // 154: goto 15b
      // 157: invokestatic zfo.a (Loov;)Loov;
      // 15a: athrow
      // 15b: ifnull 17a
      // 15e: goto 165
      // 161: invokestatic zfo.a (Loov;)Loov;
      // 164: athrow
      // 165: aload 2
      // 166: invokevirtual erg.gn1 ()Lu7m;
      // 169: invokestatic zfo._as (Lu7m;)Z
      // 16c: iload 3
      // 16d: ifeq 1ab
      // 170: ifeq 1aa
      // 173: goto 17a
      // 176: invokestatic zfo.a (Loov;)Loov;
      // 179: athrow
      // 17a: aload 0
      // 17b: invokevirtual zfo.sp4 ()Z
      // 17e: iload 3
      // 17f: ifeq 1ab
      // 182: goto 189
      // 185: invokestatic zfo.a (Loov;)Loov;
      // 188: athrow
      // 189: ifeq 1aa
      // 18c: goto 193
      // 18f: invokestatic zfo.a (Loov;)Loov;
      // 192: athrow
      // 193: aload 0
      // 194: getfield zfo.p5h L_d3;
      // 197: iload 4
      // 199: aload 2
      // 19a: invokevirtual _d3.cxl (ILerg;)V
      // 19d: aload 0
      // 19e: invokespecial zfo._yh ()V
      // 1a1: bipush 1
      // 1a2: goto 1a9
      // 1a5: invokestatic zfo.a (Loov;)Loov;
      // 1a8: athrow
      // 1a9: ireturn
      // 1aa: bipush 0
      // 1ab: ireturn
      // 1ac: iload 1
      // 1ad: sipush 500
      // 1b0: isub
      // 1b1: bipush 2
      // 1b2: iadd
      // 1b3: istore 5
      // 1b5: iload 5
      // 1b7: iload 3
      // 1b8: ifeq 1f5
      // 1bb: bipush 2
      // 1bc: if_icmplt 1f4
      // 1bf: goto 1c6
      // 1c2: invokestatic zfo.a (Loov;)Loov;
      // 1c5: athrow
      // 1c6: iload 5
      // 1c8: iload 3
      // 1c9: ifeq 1f5
      // 1cc: goto 1d3
      // 1cf: invokestatic zfo.a (Loov;)Loov;
      // 1d2: athrow
      // 1d3: aload 0
      // 1d4: getfield zfo.p5h L_d3;
      // 1d7: invokevirtual _d3.opt ()I
      // 1da: if_icmpge 1f4
      // 1dd: goto 1e4
      // 1e0: invokestatic zfo.a (Loov;)Loov;
      // 1e3: athrow
      // 1e4: aload 0
      // 1e5: getfield zfo.p5h L_d3;
      // 1e8: iload 5
      // 1ea: aload 2
      // 1eb: invokevirtual _d3.cxl (ILerg;)V
      // 1ee: bipush 1
      // 1ef: ireturn
      // 1f0: invokestatic zfo.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: bipush 0
      // 1f5: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(1844821491460089241L, -8184756585138354292L, MethodHandles.lookup().lookupClass()).a(222552141470278L);
      // $VF: monitorexit
      c = var10000;
      long var9 = c ^ 61254566380076L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[92];
      int var5 = 0;
      String var4 = "»\u00918ök\u0016cñ\u000b*yïG¥ñ\u0088\u0010º\u0091\u0093Ý\u009e4jÿðâ<L=Á/\u009fH®Û\u001d<DÔ>ôY\u001c\u0095¾=ë:µ¾\nåë7\u0007\u0098÷\u0086b\u0014üx0ñ\u0010$E\u0013ìª]ù@q\u0011Ý\n-\u0084Q\u0093u\u0084ÏùÞ'o\u0011\u0019|\u001d\u0019rÕi¹¥Üí\u0098NÐ\u000f¦(\u00adøDÑÖH\u0085,j\u0083\u0002IÛ¶ºR\u0010(\u008aXÃæ³\u0081x9\u009fÔ3T\u00adÙ+¬O¤h\\S\u001f\u0010|®\b~ÒK]\u0080\u0005·\u0003À{?\u0093\u0017\u0010\u001e\u0090\u00ad\u0011Ä\u007f8£÷Eí\u008eÝ¬V\u000f(\u000bw\u0090£\u00873¡Å°¤§0\u0089î¥7ô£\u0012×Bß\u0006»E\\*\u0093\u008fÍE\u0015µ7,\u009eÇÊØÁ\u0010¹\u0000ým\u000bÊ å/\n\rÇºdæÕ8°g\u0013\u0018V5/¿qC¬1_²Ò¬\u0010<â_ö/å}Ì\u0099Ö³½°\u0087åóÆòW_ª¨Ý\u0005ZÝF\u0002\u009c`¡¯n\u00ad\u0018¡þ¥g(´ðë\u0094\u0090¸i\u0082\u008a©GÜ\u008e\u0004¸£nD4ÑÎ\u000b×¨Ñ³\u0087~c\u0096\u0003M\u001d¥Z¢\u009bQ©\u0003\u0010\u008b\u000eÝ\u009dù$\u001b^\u0086>Ü¥\u008aï\u0018ÐH\u0088\\\u0002Ý<ëú\u0017Ê2¼yÑK= \u0012\u0086f\u0093\u0095³\u008dé\u009cÂ]\u0085xö\u008fÿý\u0099\u007fI5 Ø\u001e2x8(\u001b\u008cÓ\u0092M#\u0013ÆÇ2\u0097îNM0\u009dÑóx ¢4\u0084\u0013± øø(¿\u0096\u0081æjüçÙ¸/õO.ä\u000fÍ\u0011ðM+\u009câ*,ÙÅÄ+m¸ÄMÈcuæ\nJ<±0ç\u001c\u0093í7Öó\u0007Ó&\u009f\u0003¶Ø\u008f¨$\u0093\u0004m!T\u009e;\u008d\u008d\u0004âHÅòº\u008f\u0012\u0019k\u001dJMùR\u0001\u0003¿tÐsº\u0010q09â\\Òµ=R²\u001bDoð¾\u001f\u0010ÊÈKèÍ]\u009cßk\\9CîÈûV(ôÇÚ½¬\u0019ì¸'¬\u0080+\u0017%ï\u0015a\u0006\u000bu²I\u0097\u009f\u00023 X\u0086Åußb$ìÐÔz\u008aQ(*\u0011ã\u0005ÀÆ$dã|ëZªð³5ëmF-½\u000eÏ4¢\u0097çO+\u0097\u001ds\u0092)Ã®K\u0005¼Ù\u0018\buX@\t¯\u0097@#5\u008fu\"\u0087È×1àõßê§wÓ \u0098µ#1\u008a¾ët\u0015\u0080§\u001bÛRqé\u0018Ú©(ýX'á?Ö6[I\u0087\u0006½\u0010´\u0090W\u0018Ú\nàá\u0014L\u001esK\u001f£\u001c\u0018\u008e\u0091\u00ad\u001e*ä\u001cm\u0012\u001eÓc\u0016Z¬\u008b\u0083Æ*\u0003õ/Äk ÂqÔgY×¿±Ãâ¯\u0080Ó¥\u0080\u0012Áûzç~ö\u00adz\u008f¾Û<8\r\u008bò G\u009aÇåJ¦Â\u008c\u008bÓGºcðÑ\u0097\"·\"hCþÈWa·Üìè\u007f\u001bË\u0010ØØ)óMBy\u000b\u009d¨µ\u0015\"ùø\u0084 ñ\u0014\u0012?÷o\u009a\u008d\u0090\u0080Ûy\u0014-zû¥ø\u001fk\u000f.ëÚXµ2n\u001f³Ó\u0013\u0010Ì%\u0095\u0011\u0000#ð\u0088eìÄË\u0091\u0001üS`\u0086\u0085máTw\u0003|\u0000ù¶é<}-\u0097ý§\u0092\u00991rA\u0084FD\u007fÇú\u0085u¿ÚÄË@\u008a°\u0019¹\u0016\u001a\u000bi\\²&\u0080&N4á1\bì\u008a\u009cA.]\u0099Ü\u008a~r\u009eHÕ!\u001f\u0004h¥?5BÆ2Â\u001f\fY/9\u0086Âê#eè\u007f-æ\u0087¥§Py\"Û¦: ³\u0006L\u0004\u0089*yÖ@QÙ>y-\u00049\u001c\u001b\"\u0080õ\u0081J í\u0098\u0089:\u0000ä\u0016/\u0081tÊyÞÂË\u0082\u0001\u001f\u0086öÀD\u007fÿ\u0004\u008aò\u009dpøÊTWþ«\u0003ËJµ»\f8¬'«\u0099aÄ\u0001ù\u0018\u0012\u0010\u001a\u009b\u001b¼È®Kï\b×/ñTÎ2]HçÚì¤3(D6¨zÈK½\u0001F\u009dAy\u000b×\u0098$PÚ¶oã\u008dö=©)}\u001c$Å\u009euûp\u0092û¶4±b\u0010û\u0093\u0082Tæ\"WbßQ¢ßé&\u009fº\u0010\u0010\u0094\u0083q2\u0096ÌJì\u0017.É\u0011ðÞ¥\u0010ÿM0÷³Ê¨\u0082\u0098ÍãÒ÷ÇÇ]\u0018\u008b@¥#\u0010®£TÆ¦\u0001A:@!\u001a4\u0018'\u0013\u00882\u0011y\u0010K54Ìm\u0003U´¬Òu~\u001d`\u0095%`¦Ix\u009e º\u0017z-\u0000\"îÐÓ7\u0014\u0085\u0004P¼ø\u009fÒÏ\u001eä\u0002¤\u0092ó>=P[\u000fÑÍX\u000f¦\u0016xÕf5O(k¥\u009a\u0098.\"ë]Àd¦\u0013y\u001c\u0087\u001d]Ä¾\u009cÎºW@0Sü2\u0019\n ¼\u0088\u0005\u0004G\u0003®ö0Ä³å\u0010#=lAÆ\u0010^\n\u0092\u001f·QÇÏ+h÷0Wðþr P\u0097.\u0004ÉnÜ\u008f\u0017Es\b\u0002c.;Ø\u0097à\u0097QeûF_Ú:\u001cvÃòöX´(KíÊ\u001eÇ\u009cc\u001fÃ:\u0090s\u0004·<¯p\u008dµÅ\u0093Êí\u0013\få¶Z¥v\u000eÉ\u0016C·ö´ë,\u008bö+\u009f2B\u0093¨r¹R1ËÔ¡ï\u0004)\u000f\nÄ\u0081Ø\u0007F\u0099\u0090}\u0019Ýë\u008bnEÓÌ,²k\u009f×à\u0086<à\u008a_ \u001eÑOÝ\u0081î\u009fX}\u0015\u009fÖ´\u0098\u008cÀ\u009a)]\r\u001cJ\u0092¦\u0016+\u0000;\u0092±Q\u0013(K\u001e±£ôÞÿÅtæ\u00955\u0099¡oï\\ZÖOp^\u0088©\u001dI\u0014¶ó\u009c¬Ý¯\u000f\nÕãÛØ\u0084\u0018§È\u0091D[*\u0015\u0013Ã´áL\r¬\u009a£ê[½\u000bQoj#\u0018Y¨!#÷íB\u008cZº¯W¯\u0084Ñ\u0081{É\u0084\u0095¹8ha\u0010å\u0018Ü`Ä£\u001dIvH[ÂÍ°p^\u0010`\u0082\nìÒ\u0013\u0093é\u009c\u008aº\u008dAH¥p\u0010¾¯\u0019õ6\u008ag\u009d«ú\u009bÙù®c°\u0018\u0098\u000f\u0001ÿ\u0081\u0012\u0095\t#ÄD\"¢¢\u0013Ë w\u0093aî\u0093¡J@ìµ\u000b/v½¾aè}uÞHP\u0083´®ûº\u0091©û>Jª°B±¯ýûû}\u001d;\u0002XÛáS`:ìf6³9É~üß?Ñ\u0006ÆþLUM\u0095ï\u0007QÅ\u0010âºÖ®\\åíñ_\u0096°${á\u001fã@B68\u0017Æøô\u0004M>\u0095Á\u009eH\u001f)\u0096r¸¶\u0081´Ý\u0011\u0089z2»\u001bÍóÁ¯àm8ÊTÊ\u0013\u0096\rÜÊy´.7íÐ\u0092ÙöË«y§ué°Ó?óÂ\u0010\u009d]*2\u0085¦\u009fiÖë£ÁyÆÉ\u0080 ø%üçúÒ\u008fó\u009d\u0093Rl´ìp¸ÎÑ\fÄ\u0018Åó¾\u0091¡ñÆJÌ®\u0001\u0010\u0004\u009fèî¨³ú;wDª\u001cR²FL )<\u0091F\u0080\u0019T\u009bfP\u001bNæç¶\u001dr6\u0091g\u000eÇô,}^<\u0089»~¸á\u0010qä\u001bÞh\u000b ?³Ä\u0013a»¾3`Xq¬6Á\u0083\u008f\u0097yÍYd\u009a¿É§\u000b\u000fA³\u0093;\u0092È¿¶\t\u0095Ï\u009e\u001f\u00064\u0001ýzÁîÏí\u0089\fÿ!aÇm5}\u009d\u0092¥1 »\u001e± \u0084\u0014\u0082\u00adë·N²Áºº=\t-7±_7l\u0006\u0001$G\u0091V#&\u00000|\u001f\u0010ù\u0017»U\u0095®Õ½Þ{AY\u0098Ï~iXâ\u008cà\u0002X@÷\u008fÿ)²Q\u0016»zS~¦\u0004ìÇ\u008d\u0011ùä!Äôªý\u001e\u0007Ì³\u0000¸oê\u008fòmt»R ìF\u0018àå¿Û\u009e&=íÚoÜ!t-MÑùK\u0096§¤él»-ðGZËv \u0089\u0013Ûe]\u0002\"I\u0080(ÑYogV@3+\u0004O\u0003÷Eg@7Æ6Ens¹GJk|¥J\u0094Ï\u0082oW5àò(íM\u0091(\u001fH\u0081d\fL\u0000þ\u0010àË~7wÔ\u0004ÎÉ#\u0011>ò\u0011*\u0085édu\u000fÆ`Z?å/ÇÓnÇñ\u0010Ì]#>ÆzïÎ\u001a\u00adIÂ¥\u0019Ëë(öÉø©hü%\u0090|\u00812û\u000b\u0018îUsôõ:Fù9¤\u009aÛþûBC°I.\u0095ß(%'H¹`¶@Z6$|¾2(\u0013Î3{7-ðÓ\u0017+i\u0003c\u0081}è»YÚ>\u0011)Ùñ>±a¢)3ÌúÏ\u0006\u0007\u009d\u0017tà_CsÌ\u0087£ªSÂ>ï|\u007f]«²ª\u009aô\u00977\u009d\u0085«»ÞÝÔ:ð\u001f2·Yõ\f\u0095\u008aëÙ\u0014[\u009a\u0081\u0012éét\u0010§Ëõ3Ö\u009f\u001e×\u0096\u0094ÁF´Âú®@\u0011\u0093i\u009ftâå\r\u0081\u0095)i1Ë¦~«\u008e/ô\u0098U%\u0093¬»Ê\u0017-\u0013;\tÆ\u00810(Áæ2ñ»\u0094G.5µî:q}-wá¾z¿6\u008b;oä\u009a6¶\u0018)´¢µÍw\u008c¨Bµ\u008d¡B¢YµYû¼9Û\u007fÌA\u0010P®'áz£\u001dcN.ëÑÝ+ãf\u0018¿\f\u0019¢\u0001¥|!}0N\u0091½Ø+\f@5õ¶ù+u\b(7b@m¸ô-I:4¢R¼ß\u008aí@üû\u001f¤}Ì\u0007\u001el\b\u001b\u0004Ì¤8\"öíä\u0092\u009a\"½\u0018Þ8\u0082O\rT\u009c\u0096\u009f\u0094\u0003\\Ä7¢»\u008f\u000b\fh\u0005ü\u0001+ \u0091ó\u0010ºÿ-NçNSV`°\u0083Ú\u0092®\u0016\tüØ³_Ó¯\u0080£Â\u009d\u000eXÏH/æ\u0019ü\u0096ë¯IV+c\u0081\u009bÅ4\u0099c,\u0013ÔóÌ\u0095\u001eðs(Ê\u0012¨\u001b¤\u0082ßäµHÿ£\u0003i\u0090\u008fo¡A\u0001qëîn\u001a¥m£¬¾co\u0097´\u001d(\r¸!¾sñG!  *\u008bp4\u0085Çiü\u0019;P\u0005\u0092\u0087¯f\t\u009dÂ\u0080ç\u009eãPQ%sg(\ti\t 7TZáë\u0000\u0002Í0N[Øó\u0085\u0015k\u0011b±3J\u0087õ\u0011_Ò£e'J4þ(è \u0094Z§\u000ez9\u0013\u009bS\u0085_¼[\u001b¶ãÉ,\u0081ï\u0093\u0080«lÔu\u000b&\b\u0012t\u009az\u001d'\u0087#Ì\u0010.\u0085\u009d}ëMëìz\u0092\u0089¡\\=3]\u0018Qî\u0084Ù>\u0013\u008bì\f$3æ÷eìÎ9[\u009d\u0084e2 \b\u00184ì±uÈó¥Ú}Ê\u0080MDøñ\b\u0090jÂéGmc¦\u0018ý\u00164\tcê«^f$±ðò\u0094\u0007[ëö\u0019}ÊN)Â \u008fz(D\u0087J\u0007k^âeE\u0087\u0098q\r\u0006¢h×ý\u0015|N\u009fò\twÖ`í$(Ú£\u000bn.Íªü@+Kâ\u000e8\t\u0004ÈFý\u0093u.¦tÊð\u0099BmÚÖ@¾n_éÔ/\u0087ù@\u001a¿Ã)NW/\u0000CZ\u0015\u0088yÂ\u0082gÍæ²\u0088BÁb\u007fÒÖÊO>Â\u009c\u0098Û©õ4f\u0000\u0004\u000b\u0084ßå9Ûlà\u0007¡E7.\u0087ì|\u0099i!Ûf{§£°\u0010º\u0095¨Ý\u0091J£j \t\u0002%\u001d\u001d¡#\u0010ê\u0004\u0007ÛÍæêß\r\u0092\u0085hìP&¿\u0010L\u000f5Å7×/Óª¦²ÀéN\u009dª\u0010²¯\u0018Wf\u009b¹ç\u0085\u0000ÿ\u0099\u0016+\u0081\b(\u001e\u0089\u0097dRÀáÜ\u0010\tßÏ\u00144m\u009b\u00141B¡x¼:{R\u009a\u0001\u0016MíZ¢\u0002û\u008a\u0080_\b_?(\n;\u0087ÝjÖÊ\u0087V¹,paJ²w-Uøpë¸\u0091â\u008aý1\u001c\u0002nã\u0097&ø\u0013\u000fR\u0002´E8üö£Emw\u009eé\u0083â\u0097^ób×¡\u0093ó\u001aÝ\u0096ªé\rT\u008f_¥Âá8\u008cO\u0086Ý7À¯ç0Éâ¸X\u001b\u009e&º7ê\u0095/P{2\u0017";
      int var6 = "»\u00918ök\u0016cñ\u000b*yïG¥ñ\u0088\u0010º\u0091\u0093Ý\u009e4jÿðâ<L=Á/\u009fH®Û\u001d<DÔ>ôY\u001c\u0095¾=ë:µ¾\nåë7\u0007\u0098÷\u0086b\u0014üx0ñ\u0010$E\u0013ìª]ù@q\u0011Ý\n-\u0084Q\u0093u\u0084ÏùÞ'o\u0011\u0019|\u001d\u0019rÕi¹¥Üí\u0098NÐ\u000f¦(\u00adøDÑÖH\u0085,j\u0083\u0002IÛ¶ºR\u0010(\u008aXÃæ³\u0081x9\u009fÔ3T\u00adÙ+¬O¤h\\S\u001f\u0010|®\b~ÒK]\u0080\u0005·\u0003À{?\u0093\u0017\u0010\u001e\u0090\u00ad\u0011Ä\u007f8£÷Eí\u008eÝ¬V\u000f(\u000bw\u0090£\u00873¡Å°¤§0\u0089î¥7ô£\u0012×Bß\u0006»E\\*\u0093\u008fÍE\u0015µ7,\u009eÇÊØÁ\u0010¹\u0000ým\u000bÊ å/\n\rÇºdæÕ8°g\u0013\u0018V5/¿qC¬1_²Ò¬\u0010<â_ö/å}Ì\u0099Ö³½°\u0087åóÆòW_ª¨Ý\u0005ZÝF\u0002\u009c`¡¯n\u00ad\u0018¡þ¥g(´ðë\u0094\u0090¸i\u0082\u008a©GÜ\u008e\u0004¸£nD4ÑÎ\u000b×¨Ñ³\u0087~c\u0096\u0003M\u001d¥Z¢\u009bQ©\u0003\u0010\u008b\u000eÝ\u009dù$\u001b^\u0086>Ü¥\u008aï\u0018ÐH\u0088\\\u0002Ý<ëú\u0017Ê2¼yÑK= \u0012\u0086f\u0093\u0095³\u008dé\u009cÂ]\u0085xö\u008fÿý\u0099\u007fI5 Ø\u001e2x8(\u001b\u008cÓ\u0092M#\u0013ÆÇ2\u0097îNM0\u009dÑóx ¢4\u0084\u0013± øø(¿\u0096\u0081æjüçÙ¸/õO.ä\u000fÍ\u0011ðM+\u009câ*,ÙÅÄ+m¸ÄMÈcuæ\nJ<±0ç\u001c\u0093í7Öó\u0007Ó&\u009f\u0003¶Ø\u008f¨$\u0093\u0004m!T\u009e;\u008d\u008d\u0004âHÅòº\u008f\u0012\u0019k\u001dJMùR\u0001\u0003¿tÐsº\u0010q09â\\Òµ=R²\u001bDoð¾\u001f\u0010ÊÈKèÍ]\u009cßk\\9CîÈûV(ôÇÚ½¬\u0019ì¸'¬\u0080+\u0017%ï\u0015a\u0006\u000bu²I\u0097\u009f\u00023 X\u0086Åußb$ìÐÔz\u008aQ(*\u0011ã\u0005ÀÆ$dã|ëZªð³5ëmF-½\u000eÏ4¢\u0097çO+\u0097\u001ds\u0092)Ã®K\u0005¼Ù\u0018\buX@\t¯\u0097@#5\u008fu\"\u0087È×1àõßê§wÓ \u0098µ#1\u008a¾ët\u0015\u0080§\u001bÛRqé\u0018Ú©(ýX'á?Ö6[I\u0087\u0006½\u0010´\u0090W\u0018Ú\nàá\u0014L\u001esK\u001f£\u001c\u0018\u008e\u0091\u00ad\u001e*ä\u001cm\u0012\u001eÓc\u0016Z¬\u008b\u0083Æ*\u0003õ/Äk ÂqÔgY×¿±Ãâ¯\u0080Ó¥\u0080\u0012Áûzç~ö\u00adz\u008f¾Û<8\r\u008bò G\u009aÇåJ¦Â\u008c\u008bÓGºcðÑ\u0097\"·\"hCþÈWa·Üìè\u007f\u001bË\u0010ØØ)óMBy\u000b\u009d¨µ\u0015\"ùø\u0084 ñ\u0014\u0012?÷o\u009a\u008d\u0090\u0080Ûy\u0014-zû¥ø\u001fk\u000f.ëÚXµ2n\u001f³Ó\u0013\u0010Ì%\u0095\u0011\u0000#ð\u0088eìÄË\u0091\u0001üS`\u0086\u0085máTw\u0003|\u0000ù¶é<}-\u0097ý§\u0092\u00991rA\u0084FD\u007fÇú\u0085u¿ÚÄË@\u008a°\u0019¹\u0016\u001a\u000bi\\²&\u0080&N4á1\bì\u008a\u009cA.]\u0099Ü\u008a~r\u009eHÕ!\u001f\u0004h¥?5BÆ2Â\u001f\fY/9\u0086Âê#eè\u007f-æ\u0087¥§Py\"Û¦: ³\u0006L\u0004\u0089*yÖ@QÙ>y-\u00049\u001c\u001b\"\u0080õ\u0081J í\u0098\u0089:\u0000ä\u0016/\u0081tÊyÞÂË\u0082\u0001\u001f\u0086öÀD\u007fÿ\u0004\u008aò\u009dpøÊTWþ«\u0003ËJµ»\f8¬'«\u0099aÄ\u0001ù\u0018\u0012\u0010\u001a\u009b\u001b¼È®Kï\b×/ñTÎ2]HçÚì¤3(D6¨zÈK½\u0001F\u009dAy\u000b×\u0098$PÚ¶oã\u008dö=©)}\u001c$Å\u009euûp\u0092û¶4±b\u0010û\u0093\u0082Tæ\"WbßQ¢ßé&\u009fº\u0010\u0010\u0094\u0083q2\u0096ÌJì\u0017.É\u0011ðÞ¥\u0010ÿM0÷³Ê¨\u0082\u0098ÍãÒ÷ÇÇ]\u0018\u008b@¥#\u0010®£TÆ¦\u0001A:@!\u001a4\u0018'\u0013\u00882\u0011y\u0010K54Ìm\u0003U´¬Òu~\u001d`\u0095%`¦Ix\u009e º\u0017z-\u0000\"îÐÓ7\u0014\u0085\u0004P¼ø\u009fÒÏ\u001eä\u0002¤\u0092ó>=P[\u000fÑÍX\u000f¦\u0016xÕf5O(k¥\u009a\u0098.\"ë]Àd¦\u0013y\u001c\u0087\u001d]Ä¾\u009cÎºW@0Sü2\u0019\n ¼\u0088\u0005\u0004G\u0003®ö0Ä³å\u0010#=lAÆ\u0010^\n\u0092\u001f·QÇÏ+h÷0Wðþr P\u0097.\u0004ÉnÜ\u008f\u0017Es\b\u0002c.;Ø\u0097à\u0097QeûF_Ú:\u001cvÃòöX´(KíÊ\u001eÇ\u009cc\u001fÃ:\u0090s\u0004·<¯p\u008dµÅ\u0093Êí\u0013\få¶Z¥v\u000eÉ\u0016C·ö´ë,\u008bö+\u009f2B\u0093¨r¹R1ËÔ¡ï\u0004)\u000f\nÄ\u0081Ø\u0007F\u0099\u0090}\u0019Ýë\u008bnEÓÌ,²k\u009f×à\u0086<à\u008a_ \u001eÑOÝ\u0081î\u009fX}\u0015\u009fÖ´\u0098\u008cÀ\u009a)]\r\u001cJ\u0092¦\u0016+\u0000;\u0092±Q\u0013(K\u001e±£ôÞÿÅtæ\u00955\u0099¡oï\\ZÖOp^\u0088©\u001dI\u0014¶ó\u009c¬Ý¯\u000f\nÕãÛØ\u0084\u0018§È\u0091D[*\u0015\u0013Ã´áL\r¬\u009a£ê[½\u000bQoj#\u0018Y¨!#÷íB\u008cZº¯W¯\u0084Ñ\u0081{É\u0084\u0095¹8ha\u0010å\u0018Ü`Ä£\u001dIvH[ÂÍ°p^\u0010`\u0082\nìÒ\u0013\u0093é\u009c\u008aº\u008dAH¥p\u0010¾¯\u0019õ6\u008ag\u009d«ú\u009bÙù®c°\u0018\u0098\u000f\u0001ÿ\u0081\u0012\u0095\t#ÄD\"¢¢\u0013Ë w\u0093aî\u0093¡J@ìµ\u000b/v½¾aè}uÞHP\u0083´®ûº\u0091©û>Jª°B±¯ýûû}\u001d;\u0002XÛáS`:ìf6³9É~üß?Ñ\u0006ÆþLUM\u0095ï\u0007QÅ\u0010âºÖ®\\åíñ_\u0096°${á\u001fã@B68\u0017Æøô\u0004M>\u0095Á\u009eH\u001f)\u0096r¸¶\u0081´Ý\u0011\u0089z2»\u001bÍóÁ¯àm8ÊTÊ\u0013\u0096\rÜÊy´.7íÐ\u0092ÙöË«y§ué°Ó?óÂ\u0010\u009d]*2\u0085¦\u009fiÖë£ÁyÆÉ\u0080 ø%üçúÒ\u008fó\u009d\u0093Rl´ìp¸ÎÑ\fÄ\u0018Åó¾\u0091¡ñÆJÌ®\u0001\u0010\u0004\u009fèî¨³ú;wDª\u001cR²FL )<\u0091F\u0080\u0019T\u009bfP\u001bNæç¶\u001dr6\u0091g\u000eÇô,}^<\u0089»~¸á\u0010qä\u001bÞh\u000b ?³Ä\u0013a»¾3`Xq¬6Á\u0083\u008f\u0097yÍYd\u009a¿É§\u000b\u000fA³\u0093;\u0092È¿¶\t\u0095Ï\u009e\u001f\u00064\u0001ýzÁîÏí\u0089\fÿ!aÇm5}\u009d\u0092¥1 »\u001e± \u0084\u0014\u0082\u00adë·N²Áºº=\t-7±_7l\u0006\u0001$G\u0091V#&\u00000|\u001f\u0010ù\u0017»U\u0095®Õ½Þ{AY\u0098Ï~iXâ\u008cà\u0002X@÷\u008fÿ)²Q\u0016»zS~¦\u0004ìÇ\u008d\u0011ùä!Äôªý\u001e\u0007Ì³\u0000¸oê\u008fòmt»R ìF\u0018àå¿Û\u009e&=íÚoÜ!t-MÑùK\u0096§¤él»-ðGZËv \u0089\u0013Ûe]\u0002\"I\u0080(ÑYogV@3+\u0004O\u0003÷Eg@7Æ6Ens¹GJk|¥J\u0094Ï\u0082oW5àò(íM\u0091(\u001fH\u0081d\fL\u0000þ\u0010àË~7wÔ\u0004ÎÉ#\u0011>ò\u0011*\u0085édu\u000fÆ`Z?å/ÇÓnÇñ\u0010Ì]#>ÆzïÎ\u001a\u00adIÂ¥\u0019Ëë(öÉø©hü%\u0090|\u00812û\u000b\u0018îUsôõ:Fù9¤\u009aÛþûBC°I.\u0095ß(%'H¹`¶@Z6$|¾2(\u0013Î3{7-ðÓ\u0017+i\u0003c\u0081}è»YÚ>\u0011)Ùñ>±a¢)3ÌúÏ\u0006\u0007\u009d\u0017tà_CsÌ\u0087£ªSÂ>ï|\u007f]«²ª\u009aô\u00977\u009d\u0085«»ÞÝÔ:ð\u001f2·Yõ\f\u0095\u008aëÙ\u0014[\u009a\u0081\u0012éét\u0010§Ëõ3Ö\u009f\u001e×\u0096\u0094ÁF´Âú®@\u0011\u0093i\u009ftâå\r\u0081\u0095)i1Ë¦~«\u008e/ô\u0098U%\u0093¬»Ê\u0017-\u0013;\tÆ\u00810(Áæ2ñ»\u0094G.5µî:q}-wá¾z¿6\u008b;oä\u009a6¶\u0018)´¢µÍw\u008c¨Bµ\u008d¡B¢YµYû¼9Û\u007fÌA\u0010P®'áz£\u001dcN.ëÑÝ+ãf\u0018¿\f\u0019¢\u0001¥|!}0N\u0091½Ø+\f@5õ¶ù+u\b(7b@m¸ô-I:4¢R¼ß\u008aí@üû\u001f¤}Ì\u0007\u001el\b\u001b\u0004Ì¤8\"öíä\u0092\u009a\"½\u0018Þ8\u0082O\rT\u009c\u0096\u009f\u0094\u0003\\Ä7¢»\u008f\u000b\fh\u0005ü\u0001+ \u0091ó\u0010ºÿ-NçNSV`°\u0083Ú\u0092®\u0016\tüØ³_Ó¯\u0080£Â\u009d\u000eXÏH/æ\u0019ü\u0096ë¯IV+c\u0081\u009bÅ4\u0099c,\u0013ÔóÌ\u0095\u001eðs(Ê\u0012¨\u001b¤\u0082ßäµHÿ£\u0003i\u0090\u008fo¡A\u0001qëîn\u001a¥m£¬¾co\u0097´\u001d(\r¸!¾sñG!  *\u008bp4\u0085Çiü\u0019;P\u0005\u0092\u0087¯f\t\u009dÂ\u0080ç\u009eãPQ%sg(\ti\t 7TZáë\u0000\u0002Í0N[Øó\u0085\u0015k\u0011b±3J\u0087õ\u0011_Ò£e'J4þ(è \u0094Z§\u000ez9\u0013\u009bS\u0085_¼[\u001b¶ãÉ,\u0081ï\u0093\u0080«lÔu\u000b&\b\u0012t\u009az\u001d'\u0087#Ì\u0010.\u0085\u009d}ëMëìz\u0092\u0089¡\\=3]\u0018Qî\u0084Ù>\u0013\u008bì\f$3æ÷eìÎ9[\u009d\u0084e2 \b\u00184ì±uÈó¥Ú}Ê\u0080MDøñ\b\u0090jÂéGmc¦\u0018ý\u00164\tcê«^f$±ðò\u0094\u0007[ëö\u0019}ÊN)Â \u008fz(D\u0087J\u0007k^âeE\u0087\u0098q\r\u0006¢h×ý\u0015|N\u009fò\twÖ`í$(Ú£\u000bn.Íªü@+Kâ\u000e8\t\u0004ÈFý\u0093u.¦tÊð\u0099BmÚÖ@¾n_éÔ/\u0087ù@\u001a¿Ã)NW/\u0000CZ\u0015\u0088yÂ\u0082gÍæ²\u0088BÁb\u007fÒÖÊO>Â\u009c\u0098Û©õ4f\u0000\u0004\u000b\u0084ßå9Ûlà\u0007¡E7.\u0087ì|\u0099i!Ûf{§£°\u0010º\u0095¨Ý\u0091J£j \t\u0002%\u001d\u001d¡#\u0010ê\u0004\u0007ÛÍæêß\r\u0092\u0085hìP&¿\u0010L\u000f5Å7×/Óª¦²ÀéN\u009dª\u0010²¯\u0018Wf\u009b¹ç\u0085\u0000ÿ\u0099\u0016+\u0081\b(\u001e\u0089\u0097dRÀáÜ\u0010\tßÏ\u00144m\u009b\u00141B¡x¼:{R\u009a\u0001\u0016MíZ¢\u0002û\u008a\u0080_\b_?(\n;\u0087ÝjÖÊ\u0087V¹,paJ²w-Uøpë¸\u0091â\u008aý1\u001c\u0002nã\u0097&ø\u0013\u000fR\u0002´E8üö£Emw\u009eé\u0083â\u0097^ób×¡\u0093ó\u001aÝ\u0096ªé\rT\u008f_¥Âá8\u008cO\u0086Ý7À¯ç0Éâ¸X\u001b\u009e&º7ê\u0095/P{2\u0017"
         .length();
      char var3 = 16;
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = g(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var12 += var3) >= var6) {
                     h = var7;
                     y = new String[92];
                     yjg = new zfo$1();
                     mex = new oik((w9p)null, f<"r">(13713, 6137678900204097238L ^ var9), 0.7, 0.0, 2.0)
                        .c3y(f<"r">(25176, 3445143820403284345L ^ var9))
                        .g6f(true);
                     wk9 = new String[]{
                        null, f<"r">(2289, 3252207315343831975L ^ var9), f<"r">(12847, 8811053327979006310L ^ var9), f<"r">(7242, 519474748083988254L ^ var9)
                     };
                     v_s = new String[]{
                        "", f<"r">(29400, 3590328778059418018L ^ var9), f<"r">(25194, 4631046812335151441L ^ var9), f<"r">(23303, 7673465720173404221L ^ var9)
                     };
                     t0m = new int[]{0, 5, 7, 11};
                     nc3 = new String[]{
                        f<"r">(10283, 899679344389182231L ^ var9),
                        f<"r">(22291, 2260601281070902332L ^ var9),
                        f<"r">(18675, 748500966921417685L ^ var9),
                        f<"r">(26898, 6336470338443153996L ^ var9),
                        f<"r">(27144, 3009968075257024852L ^ var9),
                        f<"r">(22365, 3624642131184987185L ^ var9),
                        f<"r">(9398, 117878488001273796L ^ var9)
                     };
                     ih0 = new String[]{
                        f<"r">(7840, 8079540370219492845L ^ var9),
                        f<"r">(31659, 5126427498105503988L ^ var9),
                        f<"r">(13644, 8648775246935936550L ^ var9),
                        f<"r">(7333, 4524748049708148710L ^ var9),
                        f<"r">(16572, 4158857881464617943L ^ var9),
                        f<"r">(18473, 3023891489780511602L ^ var9),
                        f<"r">(25015, 7127140513558239972L ^ var9)
                     };
                     qvc = new String[]{
                        null,
                        f<"r">(14997, 7704908858464059888L ^ var9),
                        f<"r">(17205, 2909967355634858084L ^ var9),
                        f<"r">(18614, 792032521083335619L ^ var9),
                        f<"r">(17339, 8969724622492809457L ^ var9)
                     };
                     zsg = new String[]{
                        "",
                        f<"r">(8501, 5007392302919342683L ^ var9),
                        f<"r">(9910, 3545320467799596482L ^ var9),
                        f<"r">(13740, 8967567954270703330L ^ var9),
                        f<"r">(23377, 2606037439916777521L ^ var9)
                     };
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

                  var4 = "ÕûÃ\u008c\u0099U×Ý\u0015\u009b\u0003>\u001ap\u0096£ Þh\")O7 m\u0096ÎÞspB5\u0003ý÷ßb\u0010â\u009a'Ùáµ|\u0094 n\u009d";
                  var6 = "ÕûÃ\u008c\u0099U×Ý\u0015\u009b\u0003>\u001ap\u0096£ Þh\")O7 m\u0096ÎÞspB5\u0003ý÷ßb\u0010â\u009a'Ùáµ|\u0094 n\u009d".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17051;
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
            throw new RuntimeException("zfo", var10);
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
         throw new RuntimeException("zfo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
