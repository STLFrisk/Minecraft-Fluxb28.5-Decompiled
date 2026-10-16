import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class t9d implements m5n {
   private int jpl = 63;
   public boolean mw3;
   public final List guf = Lists.newArrayList();
   public final List idd = Lists.newArrayList();
   public final List cn6 = Lists.newArrayList();
   public final List nkv = Lists.newArrayList();
   private final List kkp = Lists.newArrayList();
   private final List u0w = Lists.newArrayList();
   public final List rpk = Lists.newArrayList();
   public final List u80 = Lists.newArrayList();
   public final pni twi = new pni();
   private long _to = 16777215L;
   private int agl;
   public int jf7 = new Random().nextInt();
   public final int wuq = 1013904223;
   public float n28;
   public float wni;
   public float o2u;
   public float dqw;
   private int adf;
   public final Random fsy = new Random();
   public final upn vzz;
   public List z5f = Lists.newArrayList();
   public g6k jro;
   public final he6 ujg;
   public cog t9z;
   public boolean ka0;
   public _ie hqr;
   public bg8 sw1;
   public final uan e8t;
   private final Calendar xle = Calendar.getInstance();
   public uci t7i = new uci();
   public final boolean v0f;
   public Set auv = Sets.newHashSet();
   private int qmd = this.fsy.nextInt(12000);
   public boolean gwn = true;
   public boolean wdp = true;
   private boolean vev;
   private final w5i _m8;
   public int[] z8m = new int[32768];
   private static int a;
   private static final long c;
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);

   public t9d(he6 var1, cog var2, upn var3, uan var4, boolean var5) {
      this.ujg = var1;
      this.e8t = var4;
      this.t9z = var2;
      this.vzz = var3;
      this.v0f = var5;
      this._m8 = var3.w23();
   }

   public t9d ufh() {
      return this;
   }

   @Override
   public gyu getBiomeGenForCoords(mew var1) {
      long var2 = c ^ 76356990901813L;
      int var4 = b();

      label37: {
         try {
            if (var4 == 0) {
               return this.vzz.wvm().gwg(var1, gyu.wqh);
            }

            if (this.xjm(var1)) {
               break label37;
            }
         } catch (Throwable var10) {
            throw b(var10);
         }

         return this.vzz.wvm().gwg(var1, gyu.wqh);
      }

      tts var5 = this.pxs(var1);

      try {
         return var5.u03(var1, this.vzz.wvm());
      } catch (Throwable var9) {
         e1i var7 = e1i.cor(var9, a<"g">(1863, 7253086601029205529L ^ var2));
         wsc var8 = var7.i_r(a<"g">(7310, 2066344627537290728L ^ var2));
         var8.h1o(a<"g">(16366, 266003027913213617L ^ var2), new t9d$1(this, var1));
         throw new oov(var7);
      }
   }

   public cdp ql0() {
      return this.vzz.wvm();
   }

   public abstract g6k qya();

   public void _kk(h50 var1) {
      this.t9z.hk8(true);
   }

   public void lgm() {
      this.spu(new mew(8, 64, 8));
   }

   public e0x koz(mew var1) {
      int var2 = b();
      mew var3 = new mew(var1.getX(), this._s3(), var1.getZ());

      while (!this.isAirBlock(var3.nuv())) {
         var3 = var3.nuv();
         if (var2 == 0) {
            break;
         }
      }

      return this.getBlockState(var3).r_y();
   }

   private boolean ji8(mew param1) {
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
      // 05: invokevirtual mew.getX ()I
      // 08: ldc -30000000
      // 0a: nop
      // 0b: iload 2
      // 0c: ifne 27
      // 0f: if_icmplt ad
      // 12: goto 19
      // 15: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual mew.getZ ()I
      // 1d: ldc -30000000
      // 1f: nop
      // 20: goto 27
      // 23: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: iload 2
      // 28: ifne 43
      // 2b: if_icmplt ad
      // 2e: goto 35
      // 31: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 1
      // 36: invokevirtual mew.getX ()I
      // 39: ldc 30000000
      // 3b: nop
      // 3c: goto 43
      // 3f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: iload 2
      // 44: ifne 6a
      // 47: if_icmpge ad
      // 4a: goto 51
      // 4d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 1
      // 52: invokevirtual mew.getZ ()I
      // 55: iload 2
      // 56: ifne 78
      // 59: goto 60
      // 5c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: ldc 30000000
      // 62: nop
      // 63: goto 6a
      // 66: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: if_icmpge ad
      // 6d: aload 1
      // 6e: invokevirtual mew.getY ()I
      // 71: goto 78
      // 74: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: iload 2
      // 79: ifne 91
      // 7c: iflt ad
      // 7f: goto 86
      // 82: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: aload 1
      // 87: invokevirtual mew.getY ()I
      // 8a: goto 91
      // 8d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: iload 2
      // 92: ifne aa
      // 95: sipush 256
      // 98: if_icmpge ad
      // 9b: goto a2
      // 9e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: bipush 1
      // a3: goto aa
      // a6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a9: athrow
      // aa: goto ae
      // ad: bipush 0
      // ae: ireturn
   }

   @Override
   public boolean isAirBlock(mew var1) {
      try {
         if (this.getBlockState(var1).r_y().p1r() == p3y.cei) {
            return true;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return false;
   }

   public boolean xjm(mew var1) {
      return this.jy4(var1, true);
   }

   public boolean jy4(mew param1, boolean param2) {
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
      // 0a: invokespecial t9d.ji8 (Lmew;)Z
      // 0d: ifne 1f
      // 10: goto 17
      // 13: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: bipush 0
      // 18: goto 30
      // 1b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 1
      // 21: invokevirtual mew.getX ()I
      // 24: bipush 4
      // 25: ishr
      // 26: aload 1
      // 27: invokevirtual mew.getZ ()I
      // 2a: bipush 4
      // 2b: ishr
      // 2c: iload 2
      // 2d: invokevirtual t9d.ivw (IIZ)Z
      // 30: ireturn
   }

   public boolean hrj(mew var1, int var2) {
      return this.xzt(var1, var2, true);
   }

   public boolean xzt(mew var1, int var2, boolean var3) {
      return this.w48(var1.getX() - var2, var1.getY() - var2, var1.getZ() - var2, var1.getX() + var2, var1.getY() + var2, var1.getZ() + var2, var3);
   }

   public boolean o2i(mew var1, mew var2) {
      return this.iuy(var1, var2, true);
   }

   public boolean iuy(mew var1, mew var2, boolean var3) {
      return this.w48(var1.getX(), var1.getY(), var1.getZ(), var2.getX(), var2.getY(), var2.getZ(), var3);
   }

   public boolean zz0(yve var1) {
      return this.iam(var1, true);
   }

   public boolean iam(yve var1, boolean var2) {
      return this.w48(var1.gdj, var1._3o, var1.ob0, var1.kwp, var1.ixv, var1.nwc, var2);
   }

   private boolean w48(int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 8
      // 05: iload 5
      // 07: iload 8
      // 09: ifne 90
      // 0c: iflt 8f
      // 0f: goto 16
      // 12: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: iload 2
      // 17: iload 8
      // 19: ifne 90
      // 1c: goto 23
      // 1f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22: athrow
      // 23: sipush 256
      // 26: if_icmpge 8f
      // 29: goto 30
      // 2c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: iload 1
      // 31: bipush 4
      // 32: ishr
      // 33: istore 1
      // 34: iload 3
      // 35: bipush 4
      // 36: ishr
      // 37: istore 3
      // 38: iload 4
      // 3a: bipush 4
      // 3b: ishr
      // 3c: istore 4
      // 3e: iload 6
      // 40: bipush 4
      // 41: ishr
      // 42: istore 6
      // 44: iload 1
      // 45: istore 9
      // 47: iload 9
      // 49: iload 4
      // 4b: if_icmpgt 8d
      // 4e: iload 3
      // 4f: iload 8
      // 51: ifne 8e
      // 54: istore 10
      // 56: iload 10
      // 58: iload 6
      // 5a: if_icmpgt 85
      // 5d: aload 0
      // 5e: iload 9
      // 60: iload 10
      // 62: iload 7
      // 64: invokevirtual t9d.ivw (IIZ)Z
      // 67: iload 8
      // 69: ifne 49
      // 6c: iload 8
      // 6e: ifne 7c
      // 71: ifne 7d
      // 74: goto 7b
      // 77: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: bipush 0
      // 7c: ireturn
      // 7d: iinc 10 1
      // 80: iload 8
      // 82: ifeq 56
      // 85: iinc 9 1
      // 88: iload 8
      // 8a: ifeq 47
      // 8d: bipush 1
      // 8e: ireturn
      // 8f: bipush 0
      // 90: ireturn
   }

   public boolean ivw(int param1, int param2, boolean param3) {
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
      // 06: getfield t9d.jro Lg6k;
      // 09: iload 1
      // 0a: iload 2
      // 0b: invokeinterface g6k.pnt (II)Z 3
      // 10: iload 4
      // 12: ifne 20
      // 15: ifeq 57
      // 18: goto 1f
      // 1b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: iload 3
      // 20: iload 4
      // 22: ifne 54
      // 25: ifne 53
      // 28: goto 2f
      // 2b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: aload 0
      // 30: getfield t9d.jro Lg6k;
      // 33: iload 1
      // 34: iload 2
      // 35: invokeinterface g6k.et2 (II)Ltts; 3
      // 3a: invokevirtual tts.col ()Z
      // 3d: iload 4
      // 3f: ifne 54
      // 42: goto 49
      // 45: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: ifne 57
      // 4c: goto 53
      // 4f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: bipush 1
      // 54: goto 58
      // 57: bipush 0
      // 58: ireturn
   }

   public tts pxs(mew var1) {
      return this.o5h(var1.getX() >> 4, var1.getZ() >> 4);
   }

   public tts o5h(int var1, int var2) {
      return this.jro.et2(var1, var2);
   }

   public boolean vct(mew param1, zfz param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic t9d.c J
      // 003: ldc2_w 57788381610305
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.c ()I
      // 00c: istore 6
      // 00e: aload 0
      // 00f: aload 1
      // 010: invokespecial t9d.ji8 (Lmew;)Z
      // 013: iload 6
      // 015: ifne 038
      // 018: ifne 028
      // 01b: goto 022
      // 01e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 021: athrow
      // 022: bipush 0
      // 023: ireturn
      // 024: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: aload 0
      // 029: iload 6
      // 02b: ifne 062
      // 02e: getfield t9d.v0f Z
      // 031: goto 038
      // 034: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: ifne 061
      // 03b: aload 0
      // 03c: iload 6
      // 03e: ifne 062
      // 041: goto 048
      // 044: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: getfield t9d.t9z Lcog;
      // 04b: invokevirtual cog.z28 ()Lgxq;
      // 04e: getstatic gxq.gl_ Lgxq;
      // 051: if_acmpne 061
      // 054: goto 05b
      // 057: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: bipush 0
      // 05c: ireturn
      // 05d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: aload 0
      // 062: aload 1
      // 063: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 066: astore 7
      // 068: aload 2
      // 069: invokeinterface zfz.r_y ()Le0x; 1
      // 06e: astore 8
      // 070: aload 7
      // 072: aload 1
      // 073: aload 2
      // 074: invokevirtual tts.aki (Lmew;Lzfz;)Lzfz;
      // 077: astore 9
      // 079: aload 9
      // 07b: iload 6
      // 07d: ifne 092
      // 080: ifnonnull 090
      // 083: goto 08a
      // 086: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 089: athrow
      // 08a: bipush 0
      // 08b: ireturn
      // 08c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08f: athrow
      // 090: aload 9
      // 092: invokeinterface zfz.r_y ()Le0x; 1
      // 097: astore 10
      // 099: aload 8
      // 09b: invokevirtual e0x.uhw ()I
      // 09e: iload 6
      // 0a0: ifne 0f4
      // 0a3: aload 10
      // 0a5: invokevirtual e0x.uhw ()I
      // 0a8: if_icmpne 0d2
      // 0ab: goto 0b2
      // 0ae: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: aload 8
      // 0b4: invokevirtual e0x.ppt ()I
      // 0b7: aload 10
      // 0b9: invokevirtual e0x.ppt ()I
      // 0bc: iload 6
      // 0be: ifne 0fe
      // 0c1: goto 0c8
      // 0c4: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c7: athrow
      // 0c8: if_icmpeq 0fc
      // 0cb: goto 0d2
      // 0ce: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: getfield t9d.e8t Luan;
      // 0d6: sipush 15043
      // 0d9: ldc2_w 3436341771660287203
      // 0dc: lload 4
      // 0de: lxor
      // 0df: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0e4: nop
      // 0e5: invokevirtual uan.qek (Ljava/lang/String;)V
      // 0e8: aload 0
      // 0e9: aload 1
      // 0ea: invokevirtual t9d.so7 (Lmew;)Z
      // 0ed: goto 0f4
      // 0f0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f3: athrow
      // 0f4: pop
      // 0f5: aload 0
      // 0f6: getfield t9d.e8t Luan;
      // 0f9: invokevirtual uan.uio ()V
      // 0fc: iload 3
      // 0fd: bipush 2
      // 0fe: iand
      // 0ff: iload 6
      // 101: ifne 16c
      // 104: ifeq 168
      // 107: goto 10e
      // 10a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 10d: athrow
      // 10e: aload 0
      // 10f: getfield t9d.v0f Z
      // 112: iload 6
      // 114: ifne 14d
      // 117: goto 11e
      // 11a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11d: athrow
      // 11e: ifeq 141
      // 121: goto 128
      // 124: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: iload 3
      // 129: bipush 4
      // 12a: iand
      // 12b: iload 6
      // 12d: ifne 16c
      // 130: goto 137
      // 133: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 136: athrow
      // 137: ifne 168
      // 13a: goto 141
      // 13d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 140: athrow
      // 141: aload 7
      // 143: invokevirtual tts.sac ()Z
      // 146: goto 14d
      // 149: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: iload 6
      // 14f: ifne 16c
      // 152: ifeq 168
      // 155: goto 15c
      // 158: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: aload 0
      // 15d: aload 1
      // 15e: invokevirtual t9d.nfo (Lmew;)V
      // 161: goto 168
      // 164: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 167: athrow
      // 168: aload 0
      // 169: getfield t9d.v0f Z
      // 16c: iload 6
      // 16e: ifne 1ca
      // 171: ifne 1c9
      // 174: goto 17b
      // 177: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17a: athrow
      // 17b: iload 3
      // 17c: bipush 1
      // 17d: iand
      // 17e: iload 6
      // 180: ifne 1ca
      // 183: goto 18a
      // 186: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 189: athrow
      // 18a: ifeq 1c9
      // 18d: goto 194
      // 190: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 193: athrow
      // 194: aload 0
      // 195: aload 1
      // 196: aload 9
      // 198: invokeinterface zfz.r_y ()Le0x; 1
      // 19d: invokevirtual t9d.cdo (Lmew;Le0x;)V
      // 1a0: aload 8
      // 1a2: invokevirtual e0x.ge5 ()Z
      // 1a5: iload 6
      // 1a7: ifne 1ca
      // 1aa: goto 1b1
      // 1ad: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b0: athrow
      // 1b1: ifeq 1c9
      // 1b4: goto 1bb
      // 1b7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ba: athrow
      // 1bb: aload 0
      // 1bc: aload 1
      // 1bd: aload 8
      // 1bf: invokevirtual t9d.lw8 (Lmew;Le0x;)V
      // 1c2: goto 1c9
      // 1c5: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c8: athrow
      // 1c9: bipush 1
      // 1ca: ireturn
   }

   public boolean i6x(mew var1) {
      return this.vct(var1, ox_.ibw.l4i(), 3);
   }

   public boolean yir(mew param1, boolean param2) {
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
      // 06: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 09: astore 4
      // 0b: aload 4
      // 0d: invokeinterface zfz.r_y ()Le0x; 1
      // 12: astore 5
      // 14: iload 3
      // 15: ifne 3d
      // 18: aload 5
      // 1a: invokevirtual e0x.p1r ()Lp3y;
      // 1d: getstatic p3y.cei Lp3y;
      // 20: if_acmpne 30
      // 23: goto 2a
      // 26: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
      // 2c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 0
      // 31: sipush 2001
      // 34: aload 1
      // 35: aload 4
      // 37: invokestatic e0x.r2y (Lzfz;)I
      // 3a: invokevirtual t9d.qca (ILmew;I)V
      // 3d: iload 2
      // 3e: iload 3
      // 3f: ifne 69
      // 42: ifeq 5d
      // 45: goto 4c
      // 48: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 5
      // 4e: aload 0
      // 4f: aload 1
      // 50: aload 4
      // 52: bipush 0
      // 53: invokevirtual e0x.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 56: goto 5d
      // 59: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c: athrow
      // 5d: aload 0
      // 5e: aload 1
      // 5f: getstatic ox_.ibw Le0x;
      // 62: invokevirtual e0x.l4i ()Lzfz;
      // 65: bipush 3
      // 66: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 69: ireturn
   }

   public boolean gfy(mew var1, zfz var2) {
      return this.vct(var1, var2, 3);
   }

   public void nfo(mew var1) {
      int var2 = b();
      int var3 = 0;

      while (var3 < this.z5f.size()) {
         ((u60)this.z5f.get(var3)).vsk(var1);
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   public void cdo(mew param1, e0x param2) {
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
      // 05: iload 3
      // 06: ifeq 24
      // 09: getfield t9d.t9z Lcog;
      // 0c: invokevirtual cog.z28 ()Lgxq;
      // 0f: getstatic gxq.gl_ Lgxq;
      // 12: if_acmpeq 29
      // 15: goto 1c
      // 18: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: goto 24
      // 20: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aload 1
      // 25: aload 2
      // 26: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 29: return
   }

   public void uj0(int var1, int var2, int var3, int var4) {
      int var5 = c();

      t9d var11;
      label61: {
         label52: {
            label51: {
               try {
                  var10000 = var3;
                  if (var5 != 0) {
                     break label52;
                  }

                  if (var3 <= var4) {
                     break label51;
                  }
               } catch (oov var9) {
                  throw b(var9);
               }

               int var6 = var4;
               var4 = var3;
               var3 = var6;
            }

            try {
               var11 = this;
               if (var5 != 0) {
                  break label61;
               }

               var10000 = this.vzz.qyc();
            } catch (oov var8) {
               throw b(var8);
            }
         }

         if (var10000 == 0) {
            int var10 = var3;

            while (var10 <= var4) {
               try {
                  this.jie(qe5.sf9, new mew(var1, var10, var2));
                  var10++;
                  if (var5 != 0) {
                     return;
                  }

                  if (var5 != 0) {
                     break;
                  }
               } catch (oov var7) {
                  throw b(var7);
               }
            }
         }

         var11 = this;
      }

      var11.pa7(var1, var3, var2, var1, var4, var2);
   }

   public void bi9(mew var1, mew var2) {
      this.pa7(var1.getX(), var1.getY(), var1.getZ(), var2.getX(), var2.getY(), var2.getZ());
   }

   public void pa7(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = b();
      int var8 = 0;

      while (var8 < this.z5f.size()) {
         ((u60)this.z5f.get(var8)).cy9(var1, var2, var3, var4, var5, var6);
         var8++;
         if (var7 == 0) {
            break;
         }
      }
   }

   public void _0o(mew var1, e0x var2) {
      this.hfy(var1.y8e(), var2);
      this.hfy(var1.o_8(), var2);
      this.hfy(var1.eve(), var2);
      this.hfy(var1.nuv(), var2);
      this.hfy(var1.idu(), var2);
      this.hfy(var1.z6x(), var2);
   }

   public void uy9(mew param1, e0x param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 3
      // 06: getstatic vt2.te4 Lvt2;
      // 09: iload 4
      // 0b: ifne 2c
      // 0e: if_acmpeq 28
      // 11: goto 18
      // 14: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: invokevirtual mew.y8e ()Lmew;
      // 1d: aload 2
      // 1e: invokevirtual t9d.hfy (Lmew;Le0x;)V
      // 21: goto 28
      // 24: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 3
      // 29: getstatic vt2.zk4 Lvt2;
      // 2c: iload 4
      // 2e: ifne 4f
      // 31: if_acmpeq 4b
      // 34: goto 3b
      // 37: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: aload 0
      // 3c: aload 1
      // 3d: invokevirtual mew.o_8 ()Lmew;
      // 40: aload 2
      // 41: invokevirtual t9d.hfy (Lmew;Le0x;)V
      // 44: goto 4b
      // 47: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 3
      // 4c: getstatic vt2.m3r Lvt2;
      // 4f: iload 4
      // 51: ifne 72
      // 54: if_acmpeq 6e
      // 57: goto 5e
      // 5a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 1
      // 60: invokevirtual mew.eve ()Lmew;
      // 63: aload 2
      // 64: invokevirtual t9d.hfy (Lmew;Le0x;)V
      // 67: goto 6e
      // 6a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: aload 3
      // 6f: getstatic vt2.rf3 Lvt2;
      // 72: iload 4
      // 74: ifne 95
      // 77: if_acmpeq 91
      // 7a: goto 81
      // 7d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: aload 0
      // 82: aload 1
      // 83: invokevirtual mew.nuv ()Lmew;
      // 86: aload 2
      // 87: invokevirtual t9d.hfy (Lmew;Le0x;)V
      // 8a: goto 91
      // 8d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 90: athrow
      // 91: aload 3
      // 92: getstatic vt2.z9q Lvt2;
      // 95: iload 4
      // 97: ifne b8
      // 9a: if_acmpeq b4
      // 9d: goto a4
      // a0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3: athrow
      // a4: aload 0
      // a5: aload 1
      // a6: invokevirtual mew.idu ()Lmew;
      // a9: aload 2
      // aa: invokevirtual t9d.hfy (Lmew;Le0x;)V
      // ad: goto b4
      // b0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b3: athrow
      // b4: aload 3
      // b5: getstatic vt2.mxp Lvt2;
      // b8: if_acmpeq cb
      // bb: aload 0
      // bc: aload 1
      // bd: invokevirtual mew.z6x ()Lmew;
      // c0: aload 2
      // c1: invokevirtual t9d.hfy (Lmew;Le0x;)V
      // c4: goto cb
      // c7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ca: athrow
      // cb: return
   }

   public void hfy(mew param1, e0x param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic t9d.c J
      // 03: ldc2_w 82751166182228
      // 06: lxor
      // 07: lstore 3
      // 08: invokestatic t9d.c ()I
      // 0b: istore 5
      // 0d: aload 0
      // 0e: iload 5
      // 10: ifne 28
      // 13: getfield t9d.v0f Z
      // 16: ifne 9a
      // 19: goto 20
      // 1c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: aload 0
      // 21: goto 28
      // 24: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 2c: astore 6
      // 2e: aload 6
      // 30: invokeinterface zfz.r_y ()Le0x; 1
      // 35: aload 0
      // 36: aload 1
      // 37: aload 6
      // 39: aload 2
      // 3a: invokevirtual e0x.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // 3d: goto 9a
      // 40: astore 7
      // 42: aload 7
      // 44: sipush 9310
      // 47: ldc2_w 6046596013298806894
      // 4a: lload 3
      // 4b: lxor
      // 4c: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 51: nop
      // 52: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 55: astore 8
      // 57: aload 8
      // 59: sipush 6244
      // 5c: ldc2_w 1135642150030691433
      // 5f: lload 3
      // 60: lxor
      // 61: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 66: nop
      // 67: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 6a: astore 9
      // 6c: aload 9
      // 6e: sipush 28162
      // 71: ldc2_w 6488536220952508980
      // 74: lload 3
      // 75: lxor
      // 76: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 7b: nop
      // 7c: new t9d$2
      // 7f: dup
      // 80: aload 0
      // 81: aload 2
      // 82: invokespecial t9d$2.<init> (Lt9d;Le0x;)V
      // 85: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 88: aload 9
      // 8a: aload 1
      // 8b: aload 6
      // 8d: invokestatic wsc.uxq (Lwsc;Lmew;Lzfz;)V
      // 90: new oov
      // 93: dup
      // 94: aload 8
      // 96: invokespecial oov.<init> (Le1i;)V
      // 99: athrow
      // 9a: return
   }

   public boolean h11(mew var1, e0x var2) {
      return false;
   }

   public boolean cfv(mew var1) {
      return this.pxs(var1).om1(var1);
   }

   public boolean m8_(mew param1) {
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
      // 05: iload 2
      // 06: ifeq 37
      // 09: invokevirtual mew.getY ()I
      // 0c: aload 0
      // 0d: invokevirtual t9d._s3 ()I
      // 10: if_icmplt 24
      // 13: goto 1a
      // 16: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 0
      // 1b: aload 1
      // 1c: invokevirtual t9d.cfv (Lmew;)Z
      // 1f: ireturn
      // 20: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: new mew
      // 27: dup
      // 28: aload 1
      // 29: invokevirtual mew.getX ()I
      // 2c: aload 0
      // 2d: invokevirtual t9d._s3 ()I
      // 30: aload 1
      // 31: invokevirtual mew.getZ ()I
      // 34: invokespecial mew.<init> (III)V
      // 37: astore 3
      // 38: aload 0
      // 39: aload 3
      // 3a: invokevirtual t9d.cfv (Lmew;)Z
      // 3d: iload 2
      // 3e: ifeq 4c
      // 41: ifne 4d
      // 44: goto 4b
      // 47: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
      // 4d: aload 3
      // 4e: invokevirtual mew.eve ()Lmew;
      // 51: astore 3
      // 52: aload 3
      // 53: invokevirtual mew.getY ()I
      // 56: aload 1
      // 57: invokevirtual mew.getY ()I
      // 5a: if_icmple af
      // 5d: aload 0
      // 5e: aload 3
      // 5f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 62: invokeinterface zfz.r_y ()Le0x; 1
      // 67: astore 4
      // 69: iload 2
      // 6a: ifeq ab
      // 6d: aload 4
      // 6f: invokevirtual e0x.uhw ()I
      // 72: iload 2
      // 73: ifeq b0
      // 76: goto 7d
      // 79: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: ifle a6
      // 80: goto 87
      // 83: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: aload 4
      // 89: invokevirtual e0x.p1r ()Lp3y;
      // 8c: invokevirtual p3y.l7j ()Z
      // 8f: iload 2
      // 90: ifeq a5
      // 93: goto 9a
      // 96: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 99: athrow
      // 9a: ifne a6
      // 9d: goto a4
      // a0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a3: athrow
      // a4: bipush 0
      // a5: ireturn
      // a6: aload 3
      // a7: invokevirtual mew.eve ()Lmew;
      // aa: astore 3
      // ab: iload 2
      // ac: ifne 52
      // af: bipush 1
      // b0: ireturn
   }

   public int a2f(mew param1) {
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
      // 05: invokevirtual mew.getY ()I
      // 08: iload 2
      // 09: ifne 20
      // 0c: ifge 1c
      // 0f: goto 16
      // 12: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 1
      // 1d: invokevirtual mew.getY ()I
      // 20: iload 2
      // 21: ifne 4e
      // 24: sipush 256
      // 27: if_icmplt 44
      // 2a: goto 31
      // 2d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: new mew
      // 34: dup
      // 35: aload 1
      // 36: invokevirtual mew.getX ()I
      // 39: sipush 255
      // 3c: aload 1
      // 3d: invokevirtual mew.getZ ()I
      // 40: invokespecial mew.<init> (III)V
      // 43: astore 1
      // 44: aload 0
      // 45: aload 1
      // 46: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 49: aload 1
      // 4a: bipush 0
      // 4b: invokevirtual tts.w6m (Lmew;I)I
      // 4e: ireturn
   }

   public int rts(mew var1) {
      return this.riz(var1, true);
   }

   public int riz(mew param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 1
      // 005: invokevirtual mew.getX ()I
      // 008: iload 3
      // 009: ifeq 192
      // 00c: ldc -30000000
      // 00e: nop
      // 00f: if_icmplt 190
      // 012: goto 019
      // 015: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 1
      // 01a: invokevirtual mew.getZ ()I
      // 01d: iload 3
      // 01e: ifeq 192
      // 021: goto 028
      // 024: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 027: athrow
      // 028: ldc -30000000
      // 02a: nop
      // 02b: if_icmplt 190
      // 02e: goto 035
      // 031: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 034: athrow
      // 035: aload 1
      // 036: invokevirtual mew.getX ()I
      // 039: iload 3
      // 03a: ifeq 192
      // 03d: goto 044
      // 040: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: ldc 30000000
      // 046: nop
      // 047: if_icmpge 190
      // 04a: goto 051
      // 04d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: aload 1
      // 052: invokevirtual mew.getZ ()I
      // 055: iload 3
      // 056: ifeq 192
      // 059: goto 060
      // 05c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: ldc 30000000
      // 062: nop
      // 063: if_icmpge 190
      // 066: goto 06d
      // 069: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06c: athrow
      // 06d: iload 2
      // 06e: iload 3
      // 06f: ifeq 13b
      // 072: goto 079
      // 075: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 078: athrow
      // 079: ifeq 137
      // 07c: goto 083
      // 07f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: aload 0
      // 084: aload 1
      // 085: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 088: invokeinterface zfz.r_y ()Le0x; 1
      // 08d: invokevirtual e0x.hry ()Z
      // 090: iload 3
      // 091: ifeq 13b
      // 094: goto 09b
      // 097: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: ifeq 137
      // 09e: goto 0a5
      // 0a1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: aload 0
      // 0a6: aload 1
      // 0a7: invokevirtual mew.nuv ()Lmew;
      // 0aa: bipush 0
      // 0ab: invokevirtual t9d.riz (Lmew;Z)I
      // 0ae: istore 4
      // 0b0: aload 0
      // 0b1: aload 1
      // 0b2: invokevirtual mew.o_8 ()Lmew;
      // 0b5: bipush 0
      // 0b6: invokevirtual t9d.riz (Lmew;Z)I
      // 0b9: istore 5
      // 0bb: aload 0
      // 0bc: aload 1
      // 0bd: invokevirtual mew.y8e ()Lmew;
      // 0c0: bipush 0
      // 0c1: invokevirtual t9d.riz (Lmew;Z)I
      // 0c4: istore 6
      // 0c6: aload 0
      // 0c7: aload 1
      // 0c8: invokevirtual mew.z6x ()Lmew;
      // 0cb: bipush 0
      // 0cc: invokevirtual t9d.riz (Lmew;Z)I
      // 0cf: istore 7
      // 0d1: aload 0
      // 0d2: aload 1
      // 0d3: invokevirtual mew.idu ()Lmew;
      // 0d6: bipush 0
      // 0d7: invokevirtual t9d.riz (Lmew;Z)I
      // 0da: istore 8
      // 0dc: iload 5
      // 0de: iload 4
      // 0e0: iload 3
      // 0e1: ifeq 0f6
      // 0e4: if_icmple 0f2
      // 0e7: goto 0ee
      // 0ea: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ed: athrow
      // 0ee: iload 5
      // 0f0: istore 4
      // 0f2: iload 6
      // 0f4: iload 4
      // 0f6: iload 3
      // 0f7: ifeq 10c
      // 0fa: if_icmple 108
      // 0fd: goto 104
      // 100: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 103: athrow
      // 104: iload 6
      // 106: istore 4
      // 108: iload 7
      // 10a: iload 4
      // 10c: iload 3
      // 10d: ifeq 12d
      // 110: if_icmple 11e
      // 113: goto 11a
      // 116: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: iload 7
      // 11c: istore 4
      // 11e: iload 8
      // 120: iload 3
      // 121: ifeq 136
      // 124: iload 4
      // 126: goto 12d
      // 129: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12c: athrow
      // 12d: if_icmple 134
      // 130: iload 8
      // 132: istore 4
      // 134: iload 4
      // 136: ireturn
      // 137: aload 1
      // 138: invokevirtual mew.getY ()I
      // 13b: iload 3
      // 13c: ifeq 15e
      // 13f: ifge 14f
      // 142: goto 149
      // 145: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 148: athrow
      // 149: bipush 0
      // 14a: ireturn
      // 14b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14e: athrow
      // 14f: aload 1
      // 150: iload 3
      // 151: ifeq 17d
      // 154: invokevirtual mew.getY ()I
      // 157: goto 15e
      // 15a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15d: athrow
      // 15e: sipush 256
      // 161: if_icmplt 17e
      // 164: new mew
      // 167: dup
      // 168: aload 1
      // 169: invokevirtual mew.getX ()I
      // 16c: sipush 255
      // 16f: aload 1
      // 170: invokevirtual mew.getZ ()I
      // 173: invokespecial mew.<init> (III)V
      // 176: goto 17d
      // 179: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17c: athrow
      // 17d: astore 1
      // 17e: aload 0
      // 17f: aload 1
      // 180: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 183: astore 4
      // 185: aload 4
      // 187: aload 1
      // 188: aload 0
      // 189: getfield t9d.agl I
      // 18c: invokevirtual tts.w6m (Lmew;I)I
      // 18f: ireturn
      // 190: bipush 15
      // 192: ireturn
   }

   public mew p9y(mew param1) {
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
      // 05: invokevirtual mew.getX ()I
      // 08: ldc -30000000
      // 0a: nop
      // 0b: iload 2
      // 0c: ifne d2
      // 0f: if_icmplt c6
      // 12: goto 19
      // 15: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 1
      // 1a: invokevirtual mew.getZ ()I
      // 1d: ldc -30000000
      // 1f: nop
      // 20: iload 2
      // 21: ifne d2
      // 24: goto 2b
      // 27: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a: athrow
      // 2b: if_icmplt c6
      // 2e: goto 35
      // 31: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 1
      // 36: invokevirtual mew.getX ()I
      // 39: ldc 30000000
      // 3b: nop
      // 3c: iload 2
      // 3d: ifne d2
      // 40: goto 47
      // 43: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: if_icmpge c6
      // 4a: goto 51
      // 4d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 50: athrow
      // 51: aload 1
      // 52: invokevirtual mew.getZ ()I
      // 55: ldc 30000000
      // 57: nop
      // 58: iload 2
      // 59: ifne d2
      // 5c: goto 63
      // 5f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: if_icmpge c6
      // 66: goto 6d
      // 69: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 1
      // 6f: invokevirtual mew.getX ()I
      // 72: bipush 4
      // 73: ishr
      // 74: aload 1
      // 75: invokevirtual mew.getZ ()I
      // 78: bipush 4
      // 79: ishr
      // 7a: bipush 1
      // 7b: invokevirtual t9d.ivw (IIZ)Z
      // 7e: iload 2
      // 7f: ifne c1
      // 82: goto 89
      // 85: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: ifeq b9
      // 8c: goto 93
      // 8f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92: athrow
      // 93: aload 0
      // 94: aload 1
      // 95: invokevirtual mew.getX ()I
      // 98: bipush 4
      // 99: ishr
      // 9a: aload 1
      // 9b: invokevirtual mew.getZ ()I
      // 9e: bipush 4
      // 9f: ishr
      // a0: invokevirtual t9d.o5h (II)Ltts;
      // a3: aload 1
      // a4: invokevirtual mew.getX ()I
      // a7: bipush 15
      // a9: iand
      // aa: aload 1
      // ab: invokevirtual mew.getZ ()I
      // ae: bipush 15
      // b0: iand
      // b1: invokevirtual tts.d0r (II)I
      // b4: istore 3
      // b5: iload 2
      // b6: ifeq d4
      // b9: bipush 0
      // ba: goto c1
      // bd: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c0: athrow
      // c1: istore 3
      // c2: iload 2
      // c3: ifeq d4
      // c6: aload 0
      // c7: invokevirtual t9d._s3 ()I
      // ca: bipush 1
      // cb: goto d2
      // ce: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d1: athrow
      // d2: iadd
      // d3: istore 3
      // d4: new mew
      // d7: dup
      // d8: aload 1
      // d9: invokevirtual mew.getX ()I
      // dc: iload 3
      // dd: aload 1
      // de: invokevirtual mew.getZ ()I
      // e1: invokespecial mew.<init> (III)V
      // e4: areturn
   }

   public int mov(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: iload 1
      // 05: ldc -30000000
      // 07: nop
      // 08: iload 3
      // 09: ifeq 9e
      // 0c: if_icmplt 99
      // 0f: goto 16
      // 12: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: iload 2
      // 17: ldc -30000000
      // 19: nop
      // 1a: iload 3
      // 1b: ifeq 9e
      // 1e: goto 25
      // 21: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: if_icmplt 99
      // 28: goto 2f
      // 2b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: iload 1
      // 30: ldc 30000000
      // 32: nop
      // 33: iload 3
      // 34: ifeq 9e
      // 37: goto 3e
      // 3a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: if_icmpge 99
      // 41: goto 48
      // 44: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: iload 2
      // 49: ldc 30000000
      // 4b: nop
      // 4c: iload 3
      // 4d: ifeq 9e
      // 50: goto 57
      // 53: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: if_icmpge 99
      // 5a: goto 61
      // 5d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: aload 0
      // 62: iload 1
      // 63: bipush 4
      // 64: ishr
      // 65: iload 2
      // 66: bipush 4
      // 67: ishr
      // 68: bipush 1
      // 69: iload 3
      // 6a: ifeq 8d
      // 6d: goto 74
      // 70: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73: athrow
      // 74: invokevirtual t9d.ivw (IIZ)Z
      // 77: ifne 87
      // 7a: goto 81
      // 7d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: bipush 0
      // 82: ireturn
      // 83: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: aload 0
      // 88: iload 1
      // 89: bipush 4
      // 8a: ishr
      // 8b: iload 2
      // 8c: bipush 4
      // 8d: ishr
      // 8e: invokevirtual t9d.o5h (II)Ltts;
      // 91: astore 4
      // 93: aload 4
      // 95: invokevirtual tts.vmn ()I
      // 98: ireturn
      // 99: aload 0
      // 9a: invokevirtual t9d._s3 ()I
      // 9d: bipush 1
      // 9e: iadd
      // 9f: ireturn
   }

   public int eo7(qe5 param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 0
      // 005: getfield t9d.vzz Lupn;
      // 008: invokevirtual upn.qyc ()Z
      // 00b: iload 3
      // 00c: ifeq 031
      // 00f: ifeq 02d
      // 012: goto 019
      // 015: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 1
      // 01a: getstatic qe5.sf9 Lqe5;
      // 01d: if_acmpne 02d
      // 020: goto 027
      // 023: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: bipush 0
      // 028: ireturn
      // 029: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: aload 2
      // 02e: invokevirtual mew.getY ()I
      // 031: iload 3
      // 032: ifeq 055
      // 035: ifge 050
      // 038: goto 03f
      // 03b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: new mew
      // 042: dup
      // 043: aload 2
      // 044: invokevirtual mew.getX ()I
      // 047: bipush 0
      // 048: aload 2
      // 049: invokevirtual mew.getZ ()I
      // 04c: invokespecial mew.<init> (III)V
      // 04f: astore 2
      // 050: aload 0
      // 051: aload 2
      // 052: invokespecial t9d.ji8 (Lmew;)Z
      // 055: iload 3
      // 056: ifeq 071
      // 059: ifne 06c
      // 05c: goto 063
      // 05f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 1
      // 064: getfield qe5.de2 I
      // 067: ireturn
      // 068: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06b: athrow
      // 06c: aload 0
      // 06d: aload 2
      // 06e: invokevirtual t9d.xjm (Lmew;)Z
      // 071: iload 3
      // 072: ifeq 0a0
      // 075: ifne 088
      // 078: goto 07f
      // 07b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07e: athrow
      // 07f: aload 1
      // 080: getfield qe5.de2 I
      // 083: ireturn
      // 084: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 087: athrow
      // 088: aload 0
      // 089: aload 2
      // 08a: iload 3
      // 08b: ifeq 137
      // 08e: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 091: invokeinterface zfz.r_y ()Le0x; 1
      // 096: invokevirtual e0x.hry ()Z
      // 099: goto 0a0
      // 09c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09f: athrow
      // 0a0: ifeq 135
      // 0a3: aload 0
      // 0a4: aload 1
      // 0a5: aload 2
      // 0a6: invokevirtual mew.nuv ()Lmew;
      // 0a9: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 0ac: istore 4
      // 0ae: aload 0
      // 0af: aload 1
      // 0b0: aload 2
      // 0b1: invokevirtual mew.o_8 ()Lmew;
      // 0b4: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 0b7: istore 5
      // 0b9: aload 0
      // 0ba: aload 1
      // 0bb: aload 2
      // 0bc: invokevirtual mew.y8e ()Lmew;
      // 0bf: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 0c2: istore 6
      // 0c4: aload 0
      // 0c5: aload 1
      // 0c6: aload 2
      // 0c7: invokevirtual mew.z6x ()Lmew;
      // 0ca: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 0cd: istore 7
      // 0cf: aload 0
      // 0d0: aload 1
      // 0d1: aload 2
      // 0d2: invokevirtual mew.idu ()Lmew;
      // 0d5: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 0d8: istore 8
      // 0da: iload 5
      // 0dc: iload 4
      // 0de: iload 3
      // 0df: ifeq 0f4
      // 0e2: if_icmple 0f0
      // 0e5: goto 0ec
      // 0e8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0eb: athrow
      // 0ec: iload 5
      // 0ee: istore 4
      // 0f0: iload 6
      // 0f2: iload 4
      // 0f4: iload 3
      // 0f5: ifeq 10a
      // 0f8: if_icmple 106
      // 0fb: goto 102
      // 0fe: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: iload 6
      // 104: istore 4
      // 106: iload 7
      // 108: iload 4
      // 10a: iload 3
      // 10b: ifeq 12b
      // 10e: if_icmple 11c
      // 111: goto 118
      // 114: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 117: athrow
      // 118: iload 7
      // 11a: istore 4
      // 11c: iload 8
      // 11e: iload 3
      // 11f: ifeq 134
      // 122: iload 4
      // 124: goto 12b
      // 127: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: if_icmple 132
      // 12e: iload 8
      // 130: istore 4
      // 132: iload 4
      // 134: ireturn
      // 135: aload 0
      // 136: aload 2
      // 137: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 13a: astore 4
      // 13c: aload 4
      // 13e: aload 1
      // 13f: aload 2
      // 140: invokevirtual tts.uje (Lqe5;Lmew;)I
      // 143: ireturn
   }

   public int qkq(qe5 param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: invokevirtual mew.getY ()I
      // 08: iload 3
      // 09: ifeq 2c
      // 0c: ifge 27
      // 0f: goto 16
      // 12: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: new mew
      // 19: dup
      // 1a: aload 2
      // 1b: invokevirtual mew.getX ()I
      // 1e: bipush 0
      // 1f: aload 2
      // 20: invokevirtual mew.getZ ()I
      // 23: invokespecial mew.<init> (III)V
      // 26: astore 2
      // 27: aload 0
      // 28: aload 2
      // 29: invokespecial t9d.ji8 (Lmew;)Z
      // 2c: iload 3
      // 2d: ifeq 53
      // 30: ifne 43
      // 33: goto 3a
      // 36: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 1
      // 3b: getfield qe5.de2 I
      // 3e: ireturn
      // 3f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 42: athrow
      // 43: aload 0
      // 44: aload 2
      // 45: iload 3
      // 46: ifeq 61
      // 49: invokevirtual t9d.xjm (Lmew;)Z
      // 4c: goto 53
      // 4f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: ifne 5f
      // 56: aload 1
      // 57: getfield qe5.de2 I
      // 5a: ireturn
      // 5b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: aload 0
      // 60: aload 2
      // 61: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 64: astore 4
      // 66: aload 4
      // 68: aload 1
      // 69: aload 2
      // 6a: invokevirtual tts.uje (Lqe5;Lmew;)I
      // 6d: ireturn
   }

   public void lbt(qe5 param1, mew param2, int param3) {
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
      // 06: aload 2
      // 07: invokespecial t9d.ji8 (Lmew;)Z
      // 0a: iload 4
      // 0c: ifne 31
      // 0f: ifeq 4f
      // 12: goto 19
      // 15: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 2
      // 1b: iload 4
      // 1d: ifne 3d
      // 20: goto 27
      // 23: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: invokevirtual t9d.xjm (Lmew;)Z
      // 2a: goto 31
      // 2d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: ifeq 4f
      // 34: aload 0
      // 35: aload 2
      // 36: goto 3d
      // 39: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c: athrow
      // 3d: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 40: astore 5
      // 42: aload 5
      // 44: aload 1
      // 45: aload 2
      // 46: iload 3
      // 47: invokevirtual tts.yo9 (Lqe5;Lmew;I)V
      // 4a: aload 0
      // 4b: aload 2
      // 4c: invokevirtual t9d.dr_ (Lmew;)V
      // 4f: return
   }

   public void dr_(mew var1) {
      int var2 = b();
      int var3 = 0;

      while (var3 < this.z5f.size()) {
         ((u60)this.z5f.get(var3)).xyy(var1);
         var3++;
         if (var2 == 0) {
            break;
         }
      }
   }

   @Override
   public int getCombinedLight(mew var1, int var2) {
      int var4 = this.eo7(qe5.sf9, var1);
      int var10000 = c();
      int var5 = this.eo7(qe5.lm8, var1);
      int var3 = var10000;

      try {
         if (var3 != 0) {
            return var5 | var2;
         }

         if (var5 >= var2) {
            return var4 << 20 | var5 << 4;
         }
      } catch (oov var6) {
         throw b(var6);
      }

      return var4 << 20 | var2 << 4;
   }

   public float rgh(mew var1) {
      return this.vzz.tcr()[this.rts(var1)];
   }

   @Override
   public zfz getBlockState(mew param1) {
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
      // 05: aload 1
      // 06: iload 2
      // 07: ifne 24
      // 0a: invokespecial t9d.ji8 (Lmew;)Z
      // 0d: ifne 22
      // 10: goto 17
      // 13: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: getstatic ox_.ibw Le0x;
      // 1a: invokevirtual e0x.l4i ()Lzfz;
      // 1d: areturn
      // 1e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: aload 1
      // 24: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 27: astore 3
      // 28: aload 3
      // 29: aload 1
      // 2a: invokevirtual tts.dk4 (Lmew;)Lzfz;
      // 2d: areturn
   }

   public boolean m40() {
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
      // 05: getfield t9d.agl I
      // 08: iload 1
      // 09: ifne 1f
      // 0c: bipush 4
      // 0d: if_icmpge 22
      // 10: goto 17
      // 13: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   public akm caq(fqr var1, fqr var2) {
      return this.xjc(var1, var2, false, false, false);
   }

   public akm uqt(fqr var1, fqr var2, boolean var3) {
      return this.xjc(var1, var2, var3, false, false);
   }

   public akm xjc(fqr param1, fqr param2, boolean param3, boolean param4, boolean param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 6
      // 005: aload 1
      // 006: getfield fqr.lvi D
      // 009: invokestatic java/lang/Double.isNaN (D)Z
      // 00c: iload 6
      // 00e: ifeq 029
      // 011: ifne 634
      // 014: goto 01b
      // 017: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01a: athrow
      // 01b: aload 1
      // 01c: getfield fqr.gn5 D
      // 01f: invokestatic java/lang/Double.isNaN (D)Z
      // 022: goto 029
      // 025: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 028: athrow
      // 029: iload 6
      // 02b: ifeq 046
      // 02e: ifne 634
      // 031: goto 038
      // 034: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 037: athrow
      // 038: aload 1
      // 039: getfield fqr.bn2 D
      // 03c: invokestatic java/lang/Double.isNaN (D)Z
      // 03f: goto 046
      // 042: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 045: athrow
      // 046: iload 6
      // 048: ifeq 063
      // 04b: ifne 634
      // 04e: goto 055
      // 051: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 2
      // 056: getfield fqr.lvi D
      // 059: invokestatic java/lang/Double.isNaN (D)Z
      // 05c: goto 063
      // 05f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: iload 6
      // 065: ifeq 080
      // 068: ifne 632
      // 06b: goto 072
      // 06e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 071: athrow
      // 072: aload 2
      // 073: getfield fqr.gn5 D
      // 076: invokestatic java/lang/Double.isNaN (D)Z
      // 079: goto 080
      // 07c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07f: athrow
      // 080: iload 6
      // 082: ifeq 09d
      // 085: ifne 632
      // 088: goto 08f
      // 08b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: aload 2
      // 090: getfield fqr.bn2 D
      // 093: invokestatic java/lang/Double.isNaN (D)Z
      // 096: goto 09d
      // 099: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: iload 6
      // 09f: ifeq 0ba
      // 0a2: ifne 632
      // 0a5: goto 0ac
      // 0a8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ab: athrow
      // 0ac: aload 2
      // 0ad: getfield fqr.lvi D
      // 0b0: invokestatic fe6.jqf (D)I
      // 0b3: goto 0ba
      // 0b6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: istore 7
      // 0bc: aload 2
      // 0bd: getfield fqr.gn5 D
      // 0c0: invokestatic fe6.jqf (D)I
      // 0c3: istore 8
      // 0c5: aload 2
      // 0c6: getfield fqr.bn2 D
      // 0c9: invokestatic fe6.jqf (D)I
      // 0cc: istore 9
      // 0ce: aload 1
      // 0cf: getfield fqr.lvi D
      // 0d2: invokestatic fe6.jqf (D)I
      // 0d5: istore 10
      // 0d7: aload 1
      // 0d8: getfield fqr.gn5 D
      // 0db: invokestatic fe6.jqf (D)I
      // 0de: istore 11
      // 0e0: aload 1
      // 0e1: getfield fqr.bn2 D
      // 0e4: invokestatic fe6.jqf (D)I
      // 0e7: istore 12
      // 0e9: new mew
      // 0ec: dup
      // 0ed: iload 10
      // 0ef: iload 11
      // 0f1: iload 12
      // 0f3: invokespecial mew.<init> (III)V
      // 0f6: astore 13
      // 0f8: aload 0
      // 0f9: aload 13
      // 0fb: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0fe: astore 14
      // 100: aload 14
      // 102: invokeinterface zfz.r_y ()Le0x; 1
      // 107: astore 15
      // 109: iload 4
      // 10b: iload 6
      // 10d: ifeq 155
      // 110: ifeq 13a
      // 113: goto 11a
      // 116: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 119: athrow
      // 11a: aload 15
      // 11c: iload 6
      // 11e: ifeq 143
      // 121: goto 128
      // 124: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 127: athrow
      // 128: aload 0
      // 129: aload 13
      // 12b: aload 14
      // 12d: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 130: ifnull 178
      // 133: goto 13a
      // 136: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139: athrow
      // 13a: aload 15
      // 13c: goto 143
      // 13f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 142: athrow
      // 143: iload 6
      // 145: ifeq 15a
      // 148: aload 14
      // 14a: iload 3
      // 14b: invokevirtual e0x.qc_ (Lzfz;Z)Z
      // 14e: goto 155
      // 151: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 154: athrow
      // 155: ifeq 178
      // 158: aload 15
      // 15a: aload 0
      // 15b: aload 13
      // 15d: aload 1
      // 15e: aload 2
      // 15f: invokevirtual e0x.mns (Lt9d;Lmew;Lfqr;Lfqr;)Lakm;
      // 162: astore 16
      // 164: aload 16
      // 166: iload 6
      // 168: ifeq 177
      // 16b: ifnull 178
      // 16e: goto 175
      // 171: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 174: athrow
      // 175: aload 16
      // 177: areturn
      // 178: aconst_null
      // 179: astore 16
      // 17b: sipush 200
      // 17e: istore 17
      // 180: iload 17
      // 182: iinc 17 -1
      // 185: iflt 622
      // 188: aload 1
      // 189: getfield fqr.lvi D
      // 18c: invokestatic java/lang/Double.isNaN (D)Z
      // 18f: iload 6
      // 191: ifeq 624
      // 194: iload 6
      // 196: ifeq 1b8
      // 199: goto 1a0
      // 19c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: ifne 1e4
      // 1a3: goto 1aa
      // 1a6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a9: athrow
      // 1aa: aload 1
      // 1ab: getfield fqr.gn5 D
      // 1ae: invokestatic java/lang/Double.isNaN (D)Z
      // 1b1: goto 1b8
      // 1b4: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b7: athrow
      // 1b8: iload 6
      // 1ba: ifeq 1d5
      // 1bd: ifne 1e4
      // 1c0: goto 1c7
      // 1c3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c6: athrow
      // 1c7: aload 1
      // 1c8: getfield fqr.bn2 D
      // 1cb: invokestatic java/lang/Double.isNaN (D)Z
      // 1ce: goto 1d5
      // 1d1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d4: athrow
      // 1d5: iload 6
      // 1d7: ifeq 1ec
      // 1da: ifeq 1ea
      // 1dd: goto 1e4
      // 1e0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e3: athrow
      // 1e4: aconst_null
      // 1e5: areturn
      // 1e6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e9: athrow
      // 1ea: iload 10
      // 1ec: iload 6
      // 1ee: ifeq 249
      // 1f1: iload 7
      // 1f3: if_icmpne 248
      // 1f6: goto 1fd
      // 1f9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fc: athrow
      // 1fd: iload 11
      // 1ff: iload 6
      // 201: ifeq 249
      // 204: goto 20b
      // 207: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20a: athrow
      // 20b: iload 8
      // 20d: if_icmpne 248
      // 210: goto 217
      // 213: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 216: athrow
      // 217: iload 12
      // 219: iload 6
      // 21b: ifeq 249
      // 21e: goto 225
      // 221: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 224: athrow
      // 225: iload 9
      // 227: if_icmpne 248
      // 22a: goto 231
      // 22d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 230: athrow
      // 231: iload 5
      // 233: ifeq 246
      // 236: goto 23d
      // 239: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23c: athrow
      // 23d: aload 16
      // 23f: goto 247
      // 242: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 245: athrow
      // 246: aconst_null
      // 247: areturn
      // 248: bipush 1
      // 249: istore 18
      // 24b: bipush 1
      // 24c: istore 19
      // 24e: bipush 1
      // 24f: istore 20
      // 251: ldc2_w 999.0
      // 254: dstore 21
      // 256: ldc2_w 999.0
      // 259: dstore 23
      // 25b: ldc2_w 999.0
      // 25e: dstore 25
      // 260: iload 7
      // 262: iload 10
      // 264: iload 6
      // 266: ifeq 296
      // 269: if_icmple 27f
      // 26c: goto 273
      // 26f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 272: athrow
      // 273: iload 10
      // 275: i2d
      // 276: dconst_1
      // 277: dadd
      // 278: dstore 21
      // 27a: iload 6
      // 27c: ifne 2af
      // 27f: iload 7
      // 281: iload 6
      // 283: ifeq 2ad
      // 286: goto 28d
      // 289: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28c: athrow
      // 28d: iload 10
      // 28f: goto 296
      // 292: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 295: athrow
      // 296: if_icmpge 2a5
      // 299: iload 10
      // 29b: i2d
      // 29c: dconst_0
      // 29d: dadd
      // 29e: dstore 21
      // 2a0: iload 6
      // 2a2: ifne 2af
      // 2a5: bipush 0
      // 2a6: goto 2ad
      // 2a9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ac: athrow
      // 2ad: istore 18
      // 2af: iload 8
      // 2b1: iload 11
      // 2b3: iload 6
      // 2b5: ifeq 2e5
      // 2b8: if_icmple 2ce
      // 2bb: goto 2c2
      // 2be: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c1: athrow
      // 2c2: iload 11
      // 2c4: i2d
      // 2c5: dconst_1
      // 2c6: dadd
      // 2c7: dstore 23
      // 2c9: iload 6
      // 2cb: ifne 2fe
      // 2ce: iload 8
      // 2d0: iload 6
      // 2d2: ifeq 2fc
      // 2d5: goto 2dc
      // 2d8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2db: athrow
      // 2dc: iload 11
      // 2de: goto 2e5
      // 2e1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e4: athrow
      // 2e5: if_icmpge 2f4
      // 2e8: iload 11
      // 2ea: i2d
      // 2eb: dconst_0
      // 2ec: dadd
      // 2ed: dstore 23
      // 2ef: iload 6
      // 2f1: ifne 2fe
      // 2f4: bipush 0
      // 2f5: goto 2fc
      // 2f8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fb: athrow
      // 2fc: istore 19
      // 2fe: iload 9
      // 300: iload 12
      // 302: iload 6
      // 304: ifeq 334
      // 307: if_icmple 31d
      // 30a: goto 311
      // 30d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 310: athrow
      // 311: iload 12
      // 313: i2d
      // 314: dconst_1
      // 315: dadd
      // 316: dstore 25
      // 318: iload 6
      // 31a: ifne 34d
      // 31d: iload 9
      // 31f: iload 6
      // 321: ifeq 34b
      // 324: goto 32b
      // 327: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32a: athrow
      // 32b: iload 12
      // 32d: goto 334
      // 330: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 333: athrow
      // 334: if_icmpge 343
      // 337: iload 12
      // 339: i2d
      // 33a: dconst_0
      // 33b: dadd
      // 33c: dstore 25
      // 33e: iload 6
      // 340: ifne 34d
      // 343: bipush 0
      // 344: goto 34b
      // 347: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34a: athrow
      // 34b: istore 20
      // 34d: ldc2_w 999.0
      // 350: dstore 27
      // 352: ldc2_w 999.0
      // 355: dstore 29
      // 357: ldc2_w 999.0
      // 35a: dstore 31
      // 35c: aload 2
      // 35d: getfield fqr.lvi D
      // 360: aload 1
      // 361: getfield fqr.lvi D
      // 364: dsub
      // 365: dstore 33
      // 367: aload 2
      // 368: getfield fqr.gn5 D
      // 36b: aload 1
      // 36c: getfield fqr.gn5 D
      // 36f: dsub
      // 370: dstore 35
      // 372: aload 2
      // 373: getfield fqr.bn2 D
      // 376: aload 1
      // 377: getfield fqr.bn2 D
      // 37a: dsub
      // 37b: dstore 37
      // 37d: iload 18
      // 37f: iload 6
      // 381: ifeq 39c
      // 384: ifeq 39a
      // 387: goto 38e
      // 38a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38d: athrow
      // 38e: dload 21
      // 390: aload 1
      // 391: getfield fqr.lvi D
      // 394: dsub
      // 395: dload 33
      // 397: ddiv
      // 398: dstore 27
      // 39a: iload 19
      // 39c: iload 6
      // 39e: ifeq 3b9
      // 3a1: ifeq 3b7
      // 3a4: goto 3ab
      // 3a7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3aa: athrow
      // 3ab: dload 23
      // 3ad: aload 1
      // 3ae: getfield fqr.gn5 D
      // 3b1: dsub
      // 3b2: dload 35
      // 3b4: ddiv
      // 3b5: dstore 29
      // 3b7: iload 20
      // 3b9: iload 6
      // 3bb: ifeq 3da
      // 3be: ifeq 3d4
      // 3c1: goto 3c8
      // 3c4: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3c7: athrow
      // 3c8: dload 25
      // 3ca: aload 1
      // 3cb: getfield fqr.bn2 D
      // 3ce: dsub
      // 3cf: dload 37
      // 3d1: ddiv
      // 3d2: dstore 31
      // 3d4: dload 27
      // 3d6: ldc2_w -0.0
      // 3d9: dcmpl
      // 3da: iload 6
      // 3dc: ifeq 3f4
      // 3df: ifne 3ee
      // 3e2: goto 3e9
      // 3e5: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e8: athrow
      // 3e9: ldc2_w -1.0E-4
      // 3ec: dstore 27
      // 3ee: dload 29
      // 3f0: ldc2_w -0.0
      // 3f3: dcmpl
      // 3f4: iload 6
      // 3f6: ifeq 40e
      // 3f9: ifne 408
      // 3fc: goto 403
      // 3ff: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 402: athrow
      // 403: ldc2_w -1.0E-4
      // 406: dstore 29
      // 408: dload 31
      // 40a: ldc2_w -0.0
      // 40d: dcmpl
      // 40e: iload 6
      // 410: ifeq 427
      // 413: ifne 422
      // 416: goto 41d
      // 419: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41c: athrow
      // 41d: ldc2_w -1.0E-4
      // 420: dstore 31
      // 422: dload 27
      // 424: dload 29
      // 426: dcmpg
      // 427: iload 6
      // 429: ifeq 49d
      // 42c: ifge 491
      // 42f: goto 436
      // 432: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 435: athrow
      // 436: dload 27
      // 438: dload 31
      // 43a: dcmpg
      // 43b: iload 6
      // 43d: ifeq 49d
      // 440: goto 447
      // 443: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 446: athrow
      // 447: ifge 491
      // 44a: goto 451
      // 44d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 450: athrow
      // 451: iload 7
      // 453: iload 10
      // 455: if_icmple 469
      // 458: goto 45f
      // 45b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45e: athrow
      // 45f: getstatic vt2.te4 Lvt2;
      // 462: goto 46c
      // 465: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 468: athrow
      // 469: getstatic vt2.zk4 Lvt2;
      // 46c: astore 39
      // 46e: new fqr
      // 471: dup
      // 472: dload 21
      // 474: aload 1
      // 475: getfield fqr.gn5 D
      // 478: dload 35
      // 47a: dload 27
      // 47c: dmul
      // 47d: dadd
      // 47e: aload 1
      // 47f: getfield fqr.bn2 D
      // 482: dload 37
      // 484: dload 27
      // 486: dmul
      // 487: dadd
      // 488: invokespecial fqr.<init> (DDD)V
      // 48b: astore 1
      // 48c: iload 6
      // 48e: ifne 527
      // 491: dload 29
      // 493: dload 31
      // 495: dcmpg
      // 496: goto 49d
      // 499: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49c: athrow
      // 49d: iload 6
      // 49f: ifeq 4f5
      // 4a2: ifge 4ec
      // 4a5: goto 4ac
      // 4a8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ab: athrow
      // 4ac: iload 8
      // 4ae: iload 11
      // 4b0: if_icmple 4c4
      // 4b3: goto 4ba
      // 4b6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b9: athrow
      // 4ba: getstatic vt2.m3r Lvt2;
      // 4bd: goto 4c7
      // 4c0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c3: athrow
      // 4c4: getstatic vt2.rf3 Lvt2;
      // 4c7: astore 39
      // 4c9: new fqr
      // 4cc: dup
      // 4cd: aload 1
      // 4ce: getfield fqr.lvi D
      // 4d1: dload 33
      // 4d3: dload 29
      // 4d5: dmul
      // 4d6: dadd
      // 4d7: dload 23
      // 4d9: aload 1
      // 4da: getfield fqr.bn2 D
      // 4dd: dload 37
      // 4df: dload 29
      // 4e1: dmul
      // 4e2: dadd
      // 4e3: invokespecial fqr.<init> (DDD)V
      // 4e6: astore 1
      // 4e7: iload 6
      // 4e9: ifne 527
      // 4ec: iload 9
      // 4ee: goto 4f5
      // 4f1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f4: athrow
      // 4f5: iload 12
      // 4f7: if_icmple 504
      // 4fa: getstatic vt2.z9q Lvt2;
      // 4fd: goto 507
      // 500: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 503: athrow
      // 504: getstatic vt2.mxp Lvt2;
      // 507: astore 39
      // 509: new fqr
      // 50c: dup
      // 50d: aload 1
      // 50e: getfield fqr.lvi D
      // 511: dload 33
      // 513: dload 31
      // 515: dmul
      // 516: dadd
      // 517: aload 1
      // 518: getfield fqr.gn5 D
      // 51b: dload 35
      // 51d: dload 31
      // 51f: dmul
      // 520: dadd
      // 521: dload 25
      // 523: invokespecial fqr.<init> (DDD)V
      // 526: astore 1
      // 527: aload 1
      // 528: getfield fqr.lvi D
      // 52b: invokestatic fe6.jqf (D)I
      // 52e: aload 39
      // 530: getstatic vt2.zk4 Lvt2;
      // 533: if_acmpne 53e
      // 536: bipush 1
      // 537: goto 53f
      // 53a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53d: athrow
      // 53e: bipush 0
      // 53f: isub
      // 540: istore 10
      // 542: aload 1
      // 543: getfield fqr.gn5 D
      // 546: invokestatic fe6.jqf (D)I
      // 549: aload 39
      // 54b: getstatic vt2.rf3 Lvt2;
      // 54e: if_acmpne 559
      // 551: bipush 1
      // 552: goto 55a
      // 555: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 558: athrow
      // 559: bipush 0
      // 55a: isub
      // 55b: istore 11
      // 55d: aload 1
      // 55e: getfield fqr.bn2 D
      // 561: invokestatic fe6.jqf (D)I
      // 564: aload 39
      // 566: getstatic vt2.mxp Lvt2;
      // 569: if_acmpne 574
      // 56c: bipush 1
      // 56d: goto 575
      // 570: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 573: athrow
      // 574: bipush 0
      // 575: isub
      // 576: istore 12
      // 578: new mew
      // 57b: dup
      // 57c: iload 10
      // 57e: iload 11
      // 580: iload 12
      // 582: invokespecial mew.<init> (III)V
      // 585: astore 13
      // 587: aload 0
      // 588: aload 13
      // 58a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 58d: astore 40
      // 58f: aload 40
      // 591: invokeinterface zfz.r_y ()Le0x; 1
      // 596: astore 41
      // 598: iload 4
      // 59a: iload 6
      // 59c: ifeq 5e4
      // 59f: ifeq 5c9
      // 5a2: goto 5a9
      // 5a5: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a8: athrow
      // 5a9: aload 41
      // 5ab: iload 6
      // 5ad: ifeq 5d2
      // 5b0: goto 5b7
      // 5b3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b6: athrow
      // 5b7: aload 0
      // 5b8: aload 13
      // 5ba: aload 40
      // 5bc: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 5bf: ifnull 61d
      // 5c2: goto 5c9
      // 5c5: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c8: athrow
      // 5c9: aload 41
      // 5cb: goto 5d2
      // 5ce: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d1: athrow
      // 5d2: iload 6
      // 5d4: ifeq 5e9
      // 5d7: aload 40
      // 5d9: iload 3
      // 5da: invokevirtual e0x.qc_ (Lzfz;Z)Z
      // 5dd: goto 5e4
      // 5e0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e3: athrow
      // 5e4: ifeq 60c
      // 5e7: aload 41
      // 5e9: aload 0
      // 5ea: aload 13
      // 5ec: aload 1
      // 5ed: aload 2
      // 5ee: invokevirtual e0x.mns (Lt9d;Lmew;Lfqr;Lfqr;)Lakm;
      // 5f1: astore 42
      // 5f3: aload 42
      // 5f5: iload 6
      // 5f7: ifeq 606
      // 5fa: ifnull 607
      // 5fd: goto 604
      // 600: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 603: athrow
      // 604: aload 42
      // 606: areturn
      // 607: iload 6
      // 609: ifne 61d
      // 60c: new akm
      // 60f: dup
      // 610: getstatic akm$qs6.du5 Lakm$qs6;
      // 613: aload 1
      // 614: aload 39
      // 616: aload 13
      // 618: invokespecial akm.<init> (Lakm$qs6;Lfqr;Lvt2;Lmew;)V
      // 61b: astore 16
      // 61d: iload 6
      // 61f: ifne 180
      // 622: iload 5
      // 624: ifeq 630
      // 627: aload 16
      // 629: goto 631
      // 62c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62f: athrow
      // 630: aconst_null
      // 631: areturn
      // 632: aconst_null
      // 633: areturn
      // 634: aconst_null
      // 635: areturn
   }

   public void yfq(i2h var1, String var2, float var3, float var4) {
      int var5 = b();
      int var6 = 0;

      while (var6 < this.z5f.size()) {
         ((u60)this.z5f.get(var6)).z24(var2, var1.o2v, var1.kfp, var1.vbd, var3, var4);
         var6++;
         if (var5 == 0) {
            break;
         }
      }
   }

   public void xf4(ha9 var1, String var2, float var3, float var4) {
      int var5 = c();
      int var6 = 0;

      while (var6 < this.z5f.size()) {
         ((u60)this.z5f.get(var6)).jdq(var1, var2, var1.o2v, var1.kfp, var1.vbd, var3, var4);
         var6++;
         if (var5 != 0) {
            break;
         }
      }
   }

   public void amg(double var1, double var3, double var5, String var7, float var8, float var9) {
      int var10 = c();
      int var11 = 0;

      while (var11 < this.z5f.size()) {
         ((u60)this.z5f.get(var11)).z24(var7, var1, var3, var5, var8, var9);
         var11++;
         if (var10 != 0) {
            break;
         }
      }
   }

   public void wd_(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10) {
   }

   public void moa(mew var1, String var2) {
      int var3 = c();
      int var4 = 0;

      while (var4 < this.z5f.size()) {
         ((u60)this.z5f.get(var4)).bs4(var2, var1);
         var4++;
         if (var3 != 0) {
            break;
         }
      }
   }

   public void zvy(w_0 var1, double var2, double var4, double var6, double var8, double var10, double var12, int[] var14) {
      this.fpv(var1.ewe(), var1._gn(), var2, var4, var6, var8, var10, var12, var14);
   }

   public void h2r(w_0 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int[] var15) {
      this.fpv(var1.ewe(), var1._gn() | var2, var3, var5, var7, var9, var11, var13, var15);
   }

   private void fpv(int var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13, int[] var15) {
      int var16 = b();
      int var17 = 0;

      while (var17 < this.z5f.size()) {
         ((u60)this.z5f.get(var17)).t0e(var1, var2, var3, var5, var7, var9, var11, var13, var15);
         var17++;
         if (var16 == 0) {
            break;
         }
      }
   }

   public boolean _b8(i2h var1) {
      this.u80.add(var1);
      return true;
   }

   public boolean xzq(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield i2h.o2v D
      // 04: ldc2_w 16.0
      // 07: ddiv
      // 08: invokestatic fe6.jqf (D)I
      // 0b: istore 3
      // 0c: invokestatic t9d.b ()I
      // 0f: aload 1
      // 10: getfield i2h.vbd D
      // 13: ldc2_w 16.0
      // 16: ddiv
      // 17: invokestatic fe6.jqf (D)I
      // 1a: istore 4
      // 1c: aload 1
      // 1d: getfield i2h.dg4 Z
      // 20: istore 5
      // 22: istore 2
      // 23: aload 1
      // 24: instanceof ha9
      // 27: iload 2
      // 28: ifeq 3a
      // 2b: ifeq 38
      // 2e: goto 35
      // 31: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: bipush 1
      // 36: istore 5
      // 38: iload 5
      // 3a: iload 2
      // 3b: ifeq 6f
      // 3e: ifne 6b
      // 41: goto 48
      // 44: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 0
      // 49: iload 3
      // 4a: iload 4
      // 4c: bipush 1
      // 4d: invokevirtual t9d.ivw (IIZ)Z
      // 50: iload 2
      // 51: ifeq 6f
      // 54: goto 5b
      // 57: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5a: athrow
      // 5b: ifne 6b
      // 5e: goto 65
      // 61: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: bipush 0
      // 66: ireturn
      // 67: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6a: athrow
      // 6b: aload 1
      // 6c: instanceof ha9
      // 6f: iload 2
      // 70: ifeq af
      // 73: ifeq 93
      // 76: goto 7d
      // 79: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: aload 1
      // 7e: checkcast ha9
      // 81: astore 6
      // 83: aload 0
      // 84: getfield t9d.rpk Ljava/util/List;
      // 87: aload 6
      // 89: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 8e: pop
      // 8f: aload 0
      // 90: invokevirtual t9d.vz4 ()V
      // 93: aload 0
      // 94: iload 3
      // 95: iload 4
      // 97: invokevirtual t9d.o5h (II)Ltts;
      // 9a: aload 1
      // 9b: invokevirtual tts._3_ (Li2h;)V
      // 9e: aload 0
      // 9f: getfield t9d.guf Ljava/util/List;
      // a2: aload 1
      // a3: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a8: pop
      // a9: aload 0
      // aa: aload 1
      // ab: invokevirtual t9d.m8m (Li2h;)V
      // ae: bipush 1
      // af: ireturn
   }

   public void m8m(i2h var1) {
      int var2 = c();
      int var3 = 0;

      while (var3 < this.z5f.size()) {
         ((u60)this.z5f.get(var3)).m4f(var1);
         var3++;
         if (var2 != 0) {
            break;
         }
      }
   }

   public void cvm(i2h var1) {
      int var2 = c();
      int var3 = 0;

      while (var3 < this.z5f.size()) {
         ((u60)this.z5f.get(var3)).fbz(var1);
         var3++;
         if (var2 != 0) {
            break;
         }
      }
   }

   public void rqa(i2h param1) {
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
      // 05: getfield i2h.wgv Li2h;
      // 08: iload 2
      // 09: ifeq 2c
      // 0c: ifnull 28
      // 0f: goto 16
      // 12: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: getfield i2h.wgv Li2h;
      // 1a: aconst_null
      // 1b: checkcast i2h
      // 1e: invokevirtual i2h.nw9 (Li2h;)V
      // 21: goto 28
      // 24: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: aload 1
      // 29: getfield i2h.hzp Li2h;
      // 2c: iload 2
      // 2d: ifeq 4e
      // 30: ifnull 49
      // 33: goto 3a
      // 36: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 1
      // 3b: aconst_null
      // 3c: checkcast i2h
      // 3f: invokevirtual i2h.nw9 (Li2h;)V
      // 42: goto 49
      // 45: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: aload 1
      // 4a: invokevirtual i2h._kl ()V
      // 4d: aload 1
      // 4e: instanceof ha9
      // 51: iload 2
      // 52: ifeq 70
      // 55: ifeq 7a
      // 58: goto 5f
      // 5b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield t9d.rpk Ljava/util/List;
      // 63: aload 1
      // 64: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 69: goto 70
      // 6c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: pop
      // 71: aload 0
      // 72: invokevirtual t9d.vz4 ()V
      // 75: aload 0
      // 76: aload 1
      // 77: invokevirtual t9d.cvm (Li2h;)V
      // 7a: return
   }

   public void k1e(i2h param1) {
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
      // 05: invokevirtual i2h._kl ()V
      // 08: aload 1
      // 09: instanceof ha9
      // 0c: iload 2
      // 0d: ifeq 34
      // 10: ifeq 30
      // 13: goto 1a
      // 16: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield t9d.rpk Ljava/util/List;
      // 1e: aload 1
      // 1f: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 24: pop
      // 25: aload 0
      // 26: invokevirtual t9d.vz4 ()V
      // 29: goto 30
      // 2c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: aload 1
      // 31: getfield i2h.jw4 I
      // 34: istore 3
      // 35: aload 1
      // 36: getfield i2h.e6l I
      // 39: istore 4
      // 3b: aload 1
      // 3c: getfield i2h.qok Z
      // 3f: iload 2
      // 40: ifeq 86
      // 43: ifeq 7c
      // 46: goto 4d
      // 49: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c: athrow
      // 4d: aload 0
      // 4e: iload 3
      // 4f: iload 4
      // 51: bipush 1
      // 52: invokevirtual t9d.ivw (IIZ)Z
      // 55: iload 2
      // 56: ifeq 86
      // 59: goto 60
      // 5c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: ifeq 7c
      // 63: goto 6a
      // 66: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: aload 0
      // 6b: iload 3
      // 6c: iload 4
      // 6e: invokevirtual t9d.o5h (II)Ltts;
      // 71: aload 1
      // 72: invokevirtual tts.v13 (Li2h;)V
      // 75: goto 7c
      // 78: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 0
      // 7d: getfield t9d.guf Ljava/util/List;
      // 80: aload 1
      // 81: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 86: pop
      // 87: aload 0
      // 88: aload 1
      // 89: invokevirtual t9d.cvm (Li2h;)V
      // 8c: return
   }

   public void wox(u60 var1) {
      this.z5f.add(var1);
   }

   public void ysd(u60 var1) {
      this.z5f.remove(var1);
   }

   public List bb4(i2h param1, nh4 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 003: astore 4
      // 005: aload 2
      // 006: getfield nh4.rlc D
      // 009: invokestatic fe6.jqf (D)I
      // 00c: istore 5
      // 00e: invokestatic t9d.b ()I
      // 011: aload 2
      // 012: getfield nh4.t_2 D
      // 015: dconst_1
      // 016: dadd
      // 017: invokestatic fe6.jqf (D)I
      // 01a: istore 6
      // 01c: aload 2
      // 01d: getfield nh4.bx_ D
      // 020: invokestatic fe6.jqf (D)I
      // 023: istore 7
      // 025: istore 3
      // 026: aload 2
      // 027: getfield nh4.i2c D
      // 02a: dconst_1
      // 02b: dadd
      // 02c: invokestatic fe6.jqf (D)I
      // 02f: istore 8
      // 031: aload 2
      // 032: getfield nh4.t8n D
      // 035: invokestatic fe6.jqf (D)I
      // 038: istore 9
      // 03a: aload 2
      // 03b: getfield nh4.oqj D
      // 03e: dconst_1
      // 03f: dadd
      // 040: invokestatic fe6.jqf (D)I
      // 043: istore 10
      // 045: aload 0
      // 046: invokevirtual t9d.fve ()Lw5i;
      // 049: astore 11
      // 04b: aload 1
      // 04c: invokevirtual i2h.hh5 ()Z
      // 04f: istore 12
      // 051: aload 0
      // 052: aload 11
      // 054: aload 1
      // 055: invokevirtual t9d.cvq (Lw5i;Li2h;)Z
      // 058: istore 13
      // 05a: getstatic ox_.pu8 Le0x;
      // 05d: invokevirtual e0x.l4i ()Lzfz;
      // 060: astore 14
      // 062: new mew$mix
      // 065: dup
      // 066: invokespecial mew$mix.<init> ()V
      // 069: astore 15
      // 06b: iload 5
      // 06d: istore 16
      // 06f: iload 16
      // 071: iload 6
      // 073: if_icmpge 173
      // 076: iload 9
      // 078: istore 17
      // 07a: iload 17
      // 07c: iload 10
      // 07e: if_icmpge 16c
      // 081: aload 0
      // 082: aload 15
      // 084: iload 16
      // 086: bipush 64
      // 088: iload 17
      // 08a: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 08d: invokevirtual t9d.xjm (Lmew;)Z
      // 090: iload 3
      // 091: ifeq 071
      // 094: iload 3
      // 095: ifeq 0ad
      // 098: ifeq 165
      // 09b: goto 0a2
      // 09e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a1: athrow
      // 0a2: iload 7
      // 0a4: bipush 1
      // 0a5: isub
      // 0a6: goto 0ad
      // 0a9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ac: athrow
      // 0ad: istore 18
      // 0af: iload 18
      // 0b1: iload 8
      // 0b3: if_icmpge 165
      // 0b6: aload 15
      // 0b8: iload 16
      // 0ba: iload 18
      // 0bc: iload 17
      // 0be: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 0c1: pop
      // 0c2: iload 12
      // 0c4: iload 3
      // 0c5: ifeq 07c
      // 0c8: iload 3
      // 0c9: ifeq 106
      // 0cc: ifeq 0fd
      // 0cf: goto 0d6
      // 0d2: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: iload 13
      // 0d8: iload 3
      // 0d9: ifeq 106
      // 0dc: goto 0e3
      // 0df: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: ifeq 0fd
      // 0e6: goto 0ed
      // 0e9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: aload 1
      // 0ee: bipush 0
      // 0ef: invokevirtual i2h.jy1 (Z)V
      // 0f2: iload 3
      // 0f3: ifne 125
      // 0f6: goto 0fd
      // 0f9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fc: athrow
      // 0fd: iload 12
      // 0ff: goto 106
      // 102: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 105: athrow
      // 106: iload 3
      // 107: ifeq 116
      // 10a: ifne 125
      // 10d: goto 114
      // 110: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 113: athrow
      // 114: iload 13
      // 116: ifne 125
      // 119: aload 1
      // 11a: bipush 1
      // 11b: invokevirtual i2h.jy1 (Z)V
      // 11e: goto 125
      // 121: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 124: athrow
      // 125: aload 14
      // 127: astore 19
      // 129: aload 11
      // 12b: aload 15
      // 12d: invokevirtual w5i.hka (Lmew;)Z
      // 130: iload 3
      // 131: ifeq 140
      // 134: ifne 143
      // 137: goto 13e
      // 13a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: iload 13
      // 140: ifne 14b
      // 143: aload 0
      // 144: aload 15
      // 146: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 149: astore 19
      // 14b: aload 19
      // 14d: invokeinterface zfz.r_y ()Le0x; 1
      // 152: aload 0
      // 153: aload 15
      // 155: aload 19
      // 157: aload 2
      // 158: aload 4
      // 15a: aload 1
      // 15b: invokevirtual e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 15e: iinc 18 1
      // 161: iload 3
      // 162: ifne 0af
      // 165: iinc 17 1
      // 168: iload 3
      // 169: ifne 07a
      // 16c: iinc 16 1
      // 16f: iload 3
      // 170: ifne 06f
      // 173: ldc2_w 0.25
      // 176: dstore 16
      // 178: aload 0
      // 179: aload 1
      // 17a: aload 2
      // 17b: dload 16
      // 17d: dload 16
      // 17f: dload 16
      // 181: invokevirtual nh4.c2h (DDD)Lnh4;
      // 184: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 187: astore 18
      // 189: bipush 0
      // 18a: istore 19
      // 18c: iload 19
      // 18e: aload 18
      // 190: invokeinterface java/util/List.size ()I 1
      // 195: if_icmpge 270
      // 198: aload 1
      // 199: getfield i2h.wgv Li2h;
      // 19c: aload 18
      // 19e: iload 3
      // 19f: ifeq 1c4
      // 1a2: if_acmpeq 269
      // 1a5: goto 1ac
      // 1a8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: aload 1
      // 1ad: getfield i2h.hzp Li2h;
      // 1b0: iload 3
      // 1b1: ifeq 1da
      // 1b4: goto 1bb
      // 1b7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ba: athrow
      // 1bb: aload 18
      // 1bd: goto 1c4
      // 1c0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c3: athrow
      // 1c4: if_acmpeq 269
      // 1c7: aload 18
      // 1c9: iload 19
      // 1cb: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d0: checkcast i2h
      // 1d3: goto 1da
      // 1d6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d9: athrow
      // 1da: invokevirtual i2h.q3r ()Lnh4;
      // 1dd: astore 20
      // 1df: aload 20
      // 1e1: iload 3
      // 1e2: ifeq 23a
      // 1e5: ifnull 21b
      // 1e8: goto 1ef
      // 1eb: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ee: athrow
      // 1ef: aload 20
      // 1f1: iload 3
      // 1f2: ifeq 23a
      // 1f5: goto 1fc
      // 1f8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fb: athrow
      // 1fc: aload 2
      // 1fd: invokevirtual nh4.epq (Lnh4;)Z
      // 200: ifeq 21b
      // 203: goto 20a
      // 206: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 209: athrow
      // 20a: aload 4
      // 20c: aload 20
      // 20e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 213: pop
      // 214: goto 21b
      // 217: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21a: athrow
      // 21b: aload 1
      // 21c: aload 18
      // 21e: iload 19
      // 220: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 225: checkcast i2h
      // 228: invokevirtual i2h.tjo (Li2h;)Lnh4;
      // 22b: astore 20
      // 22d: iload 3
      // 22e: ifeq 26c
      // 231: aload 20
      // 233: goto 23a
      // 236: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 239: athrow
      // 23a: ifnull 269
      // 23d: aload 20
      // 23f: aload 2
      // 240: invokevirtual nh4.epq (Lnh4;)Z
      // 243: iload 3
      // 244: ifeq 268
      // 247: goto 24e
      // 24a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24d: athrow
      // 24e: ifeq 269
      // 251: goto 258
      // 254: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 257: athrow
      // 258: aload 4
      // 25a: aload 20
      // 25c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 261: goto 268
      // 264: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 267: athrow
      // 268: pop
      // 269: iinc 19 1
      // 26c: iload 3
      // 26d: ifne 18c
      // 270: aload 4
      // 272: areturn
   }

   public boolean cvq(w5i param1, i2h param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual w5i.rt1 ()D
      // 04: dstore 4
      // 06: invokestatic t9d.c ()I
      // 09: aload 1
      // 0a: invokevirtual w5i.jbu ()D
      // 0d: dstore 6
      // 0f: aload 1
      // 10: invokevirtual w5i.mb9 ()D
      // 13: dstore 8
      // 15: istore 3
      // 16: aload 1
      // 17: invokevirtual w5i.ah4 ()D
      // 1a: dstore 10
      // 1c: iload 3
      // 1d: ifne 5c
      // 20: aload 2
      // 21: invokevirtual i2h.hh5 ()Z
      // 24: ifeq 4a
      // 27: goto 2e
      // 2a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: dload 4
      // 30: dconst_1
      // 31: dadd
      // 32: dstore 4
      // 34: dload 6
      // 36: dconst_1
      // 37: dadd
      // 38: dstore 6
      // 3a: dload 8
      // 3c: dconst_1
      // 3d: dsub
      // 3e: dstore 8
      // 40: dload 10
      // 42: dconst_1
      // 43: dsub
      // 44: dstore 10
      // 46: iload 3
      // 47: ifeq 62
      // 4a: dload 4
      // 4c: dconst_1
      // 4d: dsub
      // 4e: dstore 4
      // 50: dload 6
      // 52: dconst_1
      // 53: dsub
      // 54: dstore 6
      // 56: dload 8
      // 58: dconst_1
      // 59: dadd
      // 5a: dstore 8
      // 5c: dload 10
      // 5e: dconst_1
      // 5f: dadd
      // 60: dstore 10
      // 62: aload 2
      // 63: getfield i2h.o2v D
      // 66: dload 4
      // 68: dcmpl
      // 69: iload 3
      // 6a: ifne 85
      // 6d: ifle cf
      // 70: goto 77
      // 73: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 76: athrow
      // 77: aload 2
      // 78: getfield i2h.o2v D
      // 7b: dload 8
      // 7d: dcmpg
      // 7e: goto 85
      // 81: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 84: athrow
      // 85: iload 3
      // 86: ifne a1
      // 89: ifge cf
      // 8c: goto 93
      // 8f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 92: athrow
      // 93: aload 2
      // 94: getfield i2h.vbd D
      // 97: dload 6
      // 99: dcmpl
      // 9a: goto a1
      // 9d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: iload 3
      // a2: ifne bd
      // a5: ifle cf
      // a8: goto af
      // ab: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ae: athrow
      // af: aload 2
      // b0: getfield i2h.vbd D
      // b3: dload 10
      // b5: dcmpg
      // b6: goto bd
      // b9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bc: athrow
      // bd: iload 3
      // be: ifne cc
      // c1: ifge cf
      // c4: goto cb
      // c7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ca: athrow
      // cb: bipush 1
      // cc: goto d0
      // cf: bipush 0
      // d0: ireturn
   }

   public List d_0(nh4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 003: astore 3
      // 004: aload 1
      // 005: getfield nh4.rlc D
      // 008: invokestatic fe6.jqf (D)I
      // 00b: istore 4
      // 00d: aload 1
      // 00e: getfield nh4.t_2 D
      // 011: dconst_1
      // 012: dadd
      // 013: invokestatic fe6.jqf (D)I
      // 016: istore 5
      // 018: invokestatic t9d.b ()I
      // 01b: aload 1
      // 01c: getfield nh4.bx_ D
      // 01f: invokestatic fe6.jqf (D)I
      // 022: istore 6
      // 024: aload 1
      // 025: getfield nh4.i2c D
      // 028: dconst_1
      // 029: dadd
      // 02a: invokestatic fe6.jqf (D)I
      // 02d: istore 7
      // 02f: aload 1
      // 030: getfield nh4.t8n D
      // 033: invokestatic fe6.jqf (D)I
      // 036: istore 8
      // 038: istore 2
      // 039: aload 1
      // 03a: getfield nh4.oqj D
      // 03d: dconst_1
      // 03e: dadd
      // 03f: invokestatic fe6.jqf (D)I
      // 042: istore 9
      // 044: new mew$mix
      // 047: dup
      // 048: invokespecial mew$mix.<init> ()V
      // 04b: astore 10
      // 04d: iload 4
      // 04f: istore 11
      // 051: iload 11
      // 053: iload 5
      // 055: if_icmpge 13c
      // 058: iload 8
      // 05a: istore 12
      // 05c: iload 12
      // 05e: iload 9
      // 060: if_icmpge 135
      // 063: aload 0
      // 064: aload 10
      // 066: iload 11
      // 068: bipush 64
      // 06a: iload 12
      // 06c: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 06f: invokevirtual t9d.xjm (Lmew;)Z
      // 072: iload 2
      // 073: ifeq 053
      // 076: iload 2
      // 077: ifeq 08f
      // 07a: ifeq 12e
      // 07d: goto 084
      // 080: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: iload 6
      // 086: bipush 1
      // 087: isub
      // 088: goto 08f
      // 08b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08e: athrow
      // 08f: istore 13
      // 091: iload 13
      // 093: iload 7
      // 095: if_icmpge 12e
      // 098: aload 10
      // 09a: iload 11
      // 09c: iload 13
      // 09e: iload 12
      // 0a0: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 0a3: pop
      // 0a4: iload 11
      // 0a6: ldc -30000000
      // 0a8: nop
      // 0a9: iload 2
      // 0aa: ifeq 060
      // 0ad: iload 2
      // 0ae: ifeq 0c7
      // 0b1: if_icmplt 10a
      // 0b4: goto 0bb
      // 0b7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: iload 11
      // 0bd: ldc 30000000
      // 0bf: nop
      // 0c0: goto 0c7
      // 0c3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: iload 2
      // 0c8: ifeq 0e1
      // 0cb: if_icmpge 10a
      // 0ce: goto 0d5
      // 0d1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d4: athrow
      // 0d5: iload 12
      // 0d7: ldc -30000000
      // 0d9: nop
      // 0da: goto 0e1
      // 0dd: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: iload 2
      // 0e2: ifeq 0fb
      // 0e5: if_icmplt 10a
      // 0e8: goto 0ef
      // 0eb: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: iload 12
      // 0f1: ldc 30000000
      // 0f3: nop
      // 0f4: goto 0fb
      // 0f7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fa: athrow
      // 0fb: if_icmpge 10a
      // 0fe: aload 0
      // 0ff: aload 10
      // 101: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 104: astore 14
      // 106: iload 2
      // 107: ifne 112
      // 10a: getstatic ox_.n6z Le0x;
      // 10d: invokevirtual e0x.l4i ()Lzfz;
      // 110: astore 14
      // 112: aload 14
      // 114: invokeinterface zfz.r_y ()Le0x; 1
      // 119: aload 0
      // 11a: aload 10
      // 11c: aload 14
      // 11e: aload 1
      // 11f: aload 3
      // 120: aconst_null
      // 121: checkcast i2h
      // 124: invokevirtual e0x.c76 (Lt9d;Lmew;Lzfz;Lnh4;Ljava/util/List;Li2h;)V
      // 127: iinc 13 1
      // 12a: iload 2
      // 12b: ifne 091
      // 12e: iinc 12 1
      // 131: iload 2
      // 132: ifne 05c
      // 135: iinc 11 1
      // 138: iload 2
      // 139: ifne 051
      // 13c: aload 3
      // 13d: areturn
   }

   public int vvh(float var1) {
      float var2 = this.icw(var1);
      float var3 = 1.0F - (fe6.ssk(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.5F);
      var3 = fe6._f3(var3, 0.0F, 1.0F);
      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0 - (double)(this.bne(var1) * 5.0F) / 16.0));
      var3 = (float)((double)var3 * (1.0 - (double)(this.fnm(var1) * 5.0F) / 16.0));
      var3 = 1.0F - var3;
      return (int)(var3 * 11.0F);
   }

   public float c66(float var1) {
      float var2 = this.icw(var1);
      float var3 = 1.0F - (fe6.ssk(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.2F);
      var3 = fe6._f3(var3, 0.0F, 1.0F);
      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0 - (double)(this.bne(var1) * 5.0F) / 16.0));
      var3 = (float)((double)var3 * (1.0 - (double)(this.fnm(var1) * 5.0F) / 16.0));
      return var3 * 0.8F + 0.2F;
   }

   public fqr ez1(i2h param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: fload 2
      // 002: invokevirtual t9d.icw (F)F
      // 005: fstore 4
      // 007: invokestatic t9d.c ()I
      // 00a: fload 4
      // 00c: ldc 3.1415927
      // 00e: nop
      // 00f: fmul
      // 010: fconst_2
      // 011: fmul
      // 012: invokestatic fe6.ssk (F)F
      // 015: fconst_2
      // 016: fmul
      // 017: ldc 0.5
      // 019: nop
      // 01a: fadd
      // 01b: fstore 5
      // 01d: istore 3
      // 01e: fload 5
      // 020: fconst_0
      // 021: fconst_1
      // 022: invokestatic fe6._f3 (FFF)F
      // 025: fstore 5
      // 027: aload 1
      // 028: getfield i2h.o2v D
      // 02b: invokestatic fe6.jqf (D)I
      // 02e: istore 6
      // 030: aload 1
      // 031: getfield i2h.kfp D
      // 034: invokestatic fe6.jqf (D)I
      // 037: istore 7
      // 039: aload 1
      // 03a: getfield i2h.vbd D
      // 03d: invokestatic fe6.jqf (D)I
      // 040: istore 8
      // 042: new mew
      // 045: dup
      // 046: iload 6
      // 048: iload 7
      // 04a: iload 8
      // 04c: invokespecial mew.<init> (III)V
      // 04f: astore 9
      // 051: aload 0
      // 052: aload 9
      // 054: invokevirtual t9d.getBiomeGenForCoords (Lmew;)Lgyu;
      // 057: astore 10
      // 059: aload 10
      // 05b: aload 9
      // 05d: invokevirtual gyu.qa6 (Lmew;)F
      // 060: fstore 11
      // 062: aload 10
      // 064: fload 11
      // 066: invokevirtual gyu.s1l (F)I
      // 069: istore 12
      // 06b: iload 12
      // 06d: bipush 16
      // 06f: ishr
      // 070: sipush 255
      // 073: iand
      // 074: i2f
      // 075: ldc 255.0
      // 077: nop
      // 078: fdiv
      // 079: fstore 13
      // 07b: iload 12
      // 07d: bipush 8
      // 07f: ishr
      // 080: sipush 255
      // 083: iand
      // 084: i2f
      // 085: ldc 255.0
      // 087: nop
      // 088: fdiv
      // 089: fstore 14
      // 08b: iload 12
      // 08d: sipush 255
      // 090: iand
      // 091: i2f
      // 092: ldc 255.0
      // 094: nop
      // 095: fdiv
      // 096: fstore 15
      // 098: fload 13
      // 09a: fload 5
      // 09c: fmul
      // 09d: fstore 13
      // 09f: fload 14
      // 0a1: fload 5
      // 0a3: fmul
      // 0a4: fstore 14
      // 0a6: fload 15
      // 0a8: fload 5
      // 0aa: fmul
      // 0ab: fstore 15
      // 0ad: aload 0
      // 0ae: fload 2
      // 0af: invokevirtual t9d.bne (F)F
      // 0b2: fstore 16
      // 0b4: fload 16
      // 0b6: iload 3
      // 0b7: ifne 11c
      // 0ba: fconst_0
      // 0bb: fcmpl
      // 0bc: ifle 117
      // 0bf: goto 0c6
      // 0c2: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: fload 13
      // 0c8: ldc 0.3
      // 0ca: nop
      // 0cb: fmul
      // 0cc: fload 14
      // 0ce: ldc 0.59
      // 0d0: nop
      // 0d1: fmul
      // 0d2: fadd
      // 0d3: fload 15
      // 0d5: ldc 0.11
      // 0d7: nop
      // 0d8: fmul
      // 0d9: fadd
      // 0da: ldc 0.6
      // 0dc: nop
      // 0dd: fmul
      // 0de: fstore 17
      // 0e0: fconst_1
      // 0e1: fload 16
      // 0e3: ldc 0.75
      // 0e5: nop
      // 0e6: fmul
      // 0e7: fsub
      // 0e8: fstore 18
      // 0ea: fload 13
      // 0ec: fload 18
      // 0ee: fmul
      // 0ef: fload 17
      // 0f1: fconst_1
      // 0f2: fload 18
      // 0f4: fsub
      // 0f5: fmul
      // 0f6: fadd
      // 0f7: fstore 13
      // 0f9: fload 14
      // 0fb: fload 18
      // 0fd: fmul
      // 0fe: fload 17
      // 100: fconst_1
      // 101: fload 18
      // 103: fsub
      // 104: fmul
      // 105: fadd
      // 106: fstore 14
      // 108: fload 15
      // 10a: fload 18
      // 10c: fmul
      // 10d: fload 17
      // 10f: fconst_1
      // 110: fload 18
      // 112: fsub
      // 113: fmul
      // 114: fadd
      // 115: fstore 15
      // 117: aload 0
      // 118: fload 2
      // 119: invokevirtual t9d.fnm (F)F
      // 11c: fstore 17
      // 11e: fload 17
      // 120: fconst_0
      // 121: fcmpl
      // 122: iload 3
      // 123: ifne 185
      // 126: ifle 181
      // 129: goto 130
      // 12c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: fload 13
      // 132: ldc 0.3
      // 134: nop
      // 135: fmul
      // 136: fload 14
      // 138: ldc 0.59
      // 13a: nop
      // 13b: fmul
      // 13c: fadd
      // 13d: fload 15
      // 13f: ldc 0.11
      // 141: nop
      // 142: fmul
      // 143: fadd
      // 144: ldc 0.2
      // 146: nop
      // 147: fmul
      // 148: fstore 18
      // 14a: fconst_1
      // 14b: fload 17
      // 14d: ldc 0.75
      // 14f: nop
      // 150: fmul
      // 151: fsub
      // 152: fstore 19
      // 154: fload 13
      // 156: fload 19
      // 158: fmul
      // 159: fload 18
      // 15b: fconst_1
      // 15c: fload 19
      // 15e: fsub
      // 15f: fmul
      // 160: fadd
      // 161: fstore 13
      // 163: fload 14
      // 165: fload 19
      // 167: fmul
      // 168: fload 18
      // 16a: fconst_1
      // 16b: fload 19
      // 16d: fsub
      // 16e: fmul
      // 16f: fadd
      // 170: fstore 14
      // 172: fload 15
      // 174: fload 19
      // 176: fmul
      // 177: fload 18
      // 179: fconst_1
      // 17a: fload 19
      // 17c: fsub
      // 17d: fmul
      // 17e: fadd
      // 17f: fstore 15
      // 181: aload 0
      // 182: getfield t9d.adf I
      // 185: iload 3
      // 186: ifne 19e
      // 189: ifle 1ee
      // 18c: goto 193
      // 18f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 192: athrow
      // 193: aload 0
      // 194: getfield t9d.adf I
      // 197: goto 19e
      // 19a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: i2f
      // 19f: fload 2
      // 1a0: fsub
      // 1a1: fstore 18
      // 1a3: fload 18
      // 1a5: fconst_1
      // 1a6: iload 3
      // 1a7: ifne 1eb
      // 1aa: fcmpl
      // 1ab: ifle 1b8
      // 1ae: goto 1b5
      // 1b1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b4: athrow
      // 1b5: fconst_1
      // 1b6: fstore 18
      // 1b8: fload 18
      // 1ba: ldc 0.45
      // 1bc: nop
      // 1bd: fmul
      // 1be: fstore 18
      // 1c0: fload 13
      // 1c2: fconst_1
      // 1c3: fload 18
      // 1c5: fsub
      // 1c6: fmul
      // 1c7: ldc 0.8
      // 1c9: nop
      // 1ca: fload 18
      // 1cc: fmul
      // 1cd: fadd
      // 1ce: fstore 13
      // 1d0: fload 14
      // 1d2: fconst_1
      // 1d3: fload 18
      // 1d5: fsub
      // 1d6: fmul
      // 1d7: ldc 0.8
      // 1d9: nop
      // 1da: fload 18
      // 1dc: fmul
      // 1dd: fadd
      // 1de: fstore 14
      // 1e0: fload 15
      // 1e2: fconst_1
      // 1e3: fload 18
      // 1e5: fsub
      // 1e6: fmul
      // 1e7: fconst_1
      // 1e8: fload 18
      // 1ea: fmul
      // 1eb: fadd
      // 1ec: fstore 15
      // 1ee: new fqr
      // 1f1: dup
      // 1f2: fload 13
      // 1f4: f2d
      // 1f5: fload 14
      // 1f7: f2d
      // 1f8: fload 15
      // 1fa: f2d
      // 1fb: invokespecial fqr.<init> (DDD)V
      // 1fe: areturn
   }

   public float icw(float var1) {
      return this.vzz.lju(this.t9z.y9w(), var1);
   }

   public int _mu() {
      return this.vzz.ml6(this.t9z.y9w());
   }

   public float w27() {
      return upn.hh9[this.vzz.ml6(this.t9z.y9w())];
   }

   public float v6p(float var1) {
      float var2 = this.icw(var1);
      return var2 * (float) Math.PI * 2.0F;
   }

   public fqr l86(float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: fload 1
      // 002: invokevirtual t9d.icw (F)F
      // 005: fstore 3
      // 006: fload 3
      // 007: ldc 3.1415927
      // 009: nop
      // 00a: fmul
      // 00b: fconst_2
      // 00c: fmul
      // 00d: invokestatic fe6.ssk (F)F
      // 010: fconst_2
      // 011: fmul
      // 012: ldc 0.5
      // 014: nop
      // 015: fadd
      // 016: fstore 4
      // 018: fload 4
      // 01a: fconst_0
      // 01b: fconst_1
      // 01c: invokestatic fe6._f3 (FFF)F
      // 01f: fstore 4
      // 021: aload 0
      // 022: getfield t9d._to J
      // 025: bipush 16
      // 027: lshr
      // 028: ldc2_w 255
      // 02b: land
      // 02c: l2f
      // 02d: ldc 255.0
      // 02f: nop
      // 030: fdiv
      // 031: fstore 5
      // 033: aload 0
      // 034: getfield t9d._to J
      // 037: bipush 8
      // 039: lshr
      // 03a: ldc2_w 255
      // 03d: land
      // 03e: l2f
      // 03f: ldc 255.0
      // 041: nop
      // 042: fdiv
      // 043: fstore 6
      // 045: invokestatic t9d.c ()I
      // 048: aload 0
      // 049: getfield t9d._to J
      // 04c: ldc2_w 255
      // 04f: land
      // 050: l2f
      // 051: ldc 255.0
      // 053: nop
      // 054: fdiv
      // 055: fstore 7
      // 057: istore 2
      // 058: aload 0
      // 059: fload 1
      // 05a: invokevirtual t9d.bne (F)F
      // 05d: fstore 8
      // 05f: fload 8
      // 061: fconst_0
      // 062: iload 2
      // 063: ifne 0ec
      // 066: fcmpl
      // 067: ifle 0c2
      // 06a: goto 071
      // 06d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: fload 5
      // 073: ldc 0.3
      // 075: nop
      // 076: fmul
      // 077: fload 6
      // 079: ldc 0.59
      // 07b: nop
      // 07c: fmul
      // 07d: fadd
      // 07e: fload 7
      // 080: ldc 0.11
      // 082: nop
      // 083: fmul
      // 084: fadd
      // 085: ldc 0.6
      // 087: nop
      // 088: fmul
      // 089: fstore 9
      // 08b: fconst_1
      // 08c: fload 8
      // 08e: ldc 0.95
      // 090: nop
      // 091: fmul
      // 092: fsub
      // 093: fstore 10
      // 095: fload 5
      // 097: fload 10
      // 099: fmul
      // 09a: fload 9
      // 09c: fconst_1
      // 09d: fload 10
      // 09f: fsub
      // 0a0: fmul
      // 0a1: fadd
      // 0a2: fstore 5
      // 0a4: fload 6
      // 0a6: fload 10
      // 0a8: fmul
      // 0a9: fload 9
      // 0ab: fconst_1
      // 0ac: fload 10
      // 0ae: fsub
      // 0af: fmul
      // 0b0: fadd
      // 0b1: fstore 6
      // 0b3: fload 7
      // 0b5: fload 10
      // 0b7: fmul
      // 0b8: fload 9
      // 0ba: fconst_1
      // 0bb: fload 10
      // 0bd: fsub
      // 0be: fmul
      // 0bf: fadd
      // 0c0: fstore 7
      // 0c2: fload 5
      // 0c4: fload 4
      // 0c6: ldc 0.9
      // 0c8: nop
      // 0c9: fmul
      // 0ca: ldc 0.1
      // 0cc: nop
      // 0cd: fadd
      // 0ce: fmul
      // 0cf: fstore 5
      // 0d1: fload 6
      // 0d3: fload 4
      // 0d5: ldc 0.9
      // 0d7: nop
      // 0d8: fmul
      // 0d9: ldc 0.1
      // 0db: nop
      // 0dc: fadd
      // 0dd: fmul
      // 0de: fstore 6
      // 0e0: fload 7
      // 0e2: fload 4
      // 0e4: ldc 0.85
      // 0e6: nop
      // 0e7: fmul
      // 0e8: ldc 0.15
      // 0ea: nop
      // 0eb: fadd
      // 0ec: fmul
      // 0ed: fstore 7
      // 0ef: aload 0
      // 0f0: fload 1
      // 0f1: invokevirtual t9d.fnm (F)F
      // 0f4: fstore 9
      // 0f6: fload 9
      // 0f8: fconst_0
      // 0f9: iload 2
      // 0fa: ifne 126
      // 0fd: fcmpl
      // 0fe: ifle 160
      // 101: goto 108
      // 104: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 107: athrow
      // 108: fload 5
      // 10a: ldc 0.3
      // 10c: nop
      // 10d: fmul
      // 10e: fload 6
      // 110: ldc 0.59
      // 112: nop
      // 113: fmul
      // 114: fadd
      // 115: fload 7
      // 117: ldc 0.11
      // 119: nop
      // 11a: fmul
      // 11b: fadd
      // 11c: ldc 0.2
      // 11e: nop
      // 11f: goto 126
      // 122: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: fmul
      // 127: fstore 10
      // 129: fconst_1
      // 12a: fload 9
      // 12c: ldc 0.95
      // 12e: nop
      // 12f: fmul
      // 130: fsub
      // 131: fstore 11
      // 133: fload 5
      // 135: fload 11
      // 137: fmul
      // 138: fload 10
      // 13a: fconst_1
      // 13b: fload 11
      // 13d: fsub
      // 13e: fmul
      // 13f: fadd
      // 140: fstore 5
      // 142: fload 6
      // 144: fload 11
      // 146: fmul
      // 147: fload 10
      // 149: fconst_1
      // 14a: fload 11
      // 14c: fsub
      // 14d: fmul
      // 14e: fadd
      // 14f: fstore 6
      // 151: fload 7
      // 153: fload 11
      // 155: fmul
      // 156: fload 10
      // 158: fconst_1
      // 159: fload 11
      // 15b: fsub
      // 15c: fmul
      // 15d: fadd
      // 15e: fstore 7
      // 160: new fqr
      // 163: dup
      // 164: fload 5
      // 166: f2d
      // 167: fload 6
      // 169: f2d
      // 16a: fload 7
      // 16c: f2d
      // 16d: invokespecial fqr.<init> (DDD)V
      // 170: areturn
   }

   public fqr cok(float var1) {
      float var2 = this.icw(var1);
      return this.vzz.mnc(var2, var1);
   }

   public mew k62(mew var1) {
      return this.pxs(var1).aa1(var1);
   }

   public mew pnv(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 05: astore 3
      // 06: invokestatic t9d.b ()I
      // 09: new mew
      // 0c: dup
      // 0d: aload 1
      // 0e: invokevirtual mew.getX ()I
      // 11: aload 3
      // 12: invokevirtual tts._u6 ()I
      // 15: bipush 16
      // 17: iadd
      // 18: aload 1
      // 19: invokevirtual mew.getZ ()I
      // 1c: invokespecial mew.<init> (III)V
      // 1f: astore 4
      // 21: istore 2
      // 22: aload 4
      // 24: invokevirtual mew.getY ()I
      // 27: iflt 71
      // 2a: aload 4
      // 2c: invokevirtual mew.eve ()Lmew;
      // 2f: iload 2
      // 30: ifeq 73
      // 33: astore 5
      // 35: aload 3
      // 36: aload 5
      // 38: invokevirtual tts.mgt (Lmew;)Le0x;
      // 3b: invokevirtual e0x.p1r ()Lp3y;
      // 3e: astore 6
      // 40: iload 2
      // 41: ifeq 6d
      // 44: aload 6
      // 46: invokevirtual p3y.c3t ()Z
      // 49: ifeq 69
      // 4c: goto 53
      // 4f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: aload 6
      // 55: getstatic p3y.hh1 Lp3y;
      // 58: if_acmpeq 69
      // 5b: goto 62
      // 5e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: goto 71
      // 65: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: aload 5
      // 6b: astore 4
      // 6d: iload 2
      // 6e: ifne 22
      // 71: aload 4
      // 73: areturn
   }

   public float qp_(float var1) {
      float var2 = this.icw(var1);
      float var3 = 1.0F - (fe6.ssk(var2 * (float) Math.PI * 2.0F) * 2.0F + 0.25F);
      var3 = fe6._f3(var3, 0.0F, 1.0F);
      return var3 * var3 * 0.5F;
   }

   public void cjk(mew var1, e0x var2, int var3) {
   }

   public void hba(mew var1, e0x var2, int var3, int var4) {
   }

   public void jf5(mew var1, e0x var2, int var3, int var4) {
   }

   public void y8h() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic t9d.c J
      // 003: ldc2_w 54018281917665
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield t9d.e8t Luan;
      // 00c: sipush 26251
      // 00f: ldc2_w 3732476433975184644
      // 012: lload 1
      // 013: lxor
      // 014: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 019: nop
      // 01a: invokevirtual uan.qek (Ljava/lang/String;)V
      // 01d: aload 0
      // 01e: getfield t9d.e8t Luan;
      // 021: sipush 11111
      // 024: ldc2_w 4887002535994409176
      // 027: lload 1
      // 028: lxor
      // 029: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 02e: nop
      // 02f: invokevirtual uan.qek (Ljava/lang/String;)V
      // 032: invokestatic t9d.b ()I
      // 035: bipush 0
      // 036: istore 4
      // 038: istore 3
      // 039: iload 4
      // 03b: aload 0
      // 03c: getfield t9d.u80 Ljava/util/List;
      // 03f: invokeinterface java/util/List.size ()I 1
      // 044: if_icmpge 11e
      // 047: aload 0
      // 048: getfield t9d.u80 Ljava/util/List;
      // 04b: iload 4
      // 04d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 052: checkcast i2h
      // 055: astore 5
      // 057: aload 5
      // 059: dup
      // 05a: getfield i2h.g25 I
      // 05d: bipush 1
      // 05e: iadd
      // 05f: putfield i2h.g25 I
      // 062: aload 5
      // 064: invokevirtual i2h.xx_ ()V
      // 067: iload 3
      // 068: ifeq 141
      // 06b: goto 0ee
      // 06e: astore 6
      // 070: aload 6
      // 072: sipush 3993
      // 075: ldc2_w 617434050615567368
      // 078: lload 1
      // 079: lxor
      // 07a: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 07f: nop
      // 080: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 083: astore 7
      // 085: aload 7
      // 087: sipush 30530
      // 08a: ldc2_w 1464371866952899806
      // 08d: lload 1
      // 08e: lxor
      // 08f: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 094: nop
      // 095: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 098: astore 8
      // 09a: aload 5
      // 09c: iload 3
      // 09d: ifeq 0df
      // 0a0: ifnonnull 0d6
      // 0a3: goto 0aa
      // 0a6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: aload 8
      // 0ac: sipush 22202
      // 0af: ldc2_w 4048536268660555060
      // 0b2: lload 1
      // 0b3: lxor
      // 0b4: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0b9: nop
      // 0ba: sipush 5112
      // 0bd: ldc2_w 3067202000651778146
      // 0c0: lload 1
      // 0c1: lxor
      // 0c2: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 0c7: nop
      // 0c8: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 0cb: iload 3
      // 0cc: ifne 0e4
      // 0cf: goto 0d6
      // 0d2: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 5
      // 0d8: goto 0df
      // 0db: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0de: athrow
      // 0df: aload 8
      // 0e1: invokevirtual i2h.gfa (Lwsc;)V
      // 0e4: new oov
      // 0e7: dup
      // 0e8: aload 7
      // 0ea: invokespecial oov.<init> (Le1i;)V
      // 0ed: athrow
      // 0ee: aload 5
      // 0f0: iload 3
      // 0f1: ifeq 116
      // 0f4: getfield i2h.ma9 Z
      // 0f7: ifeq 117
      // 0fa: goto 101
      // 0fd: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: aload 0
      // 102: getfield t9d.u80 Ljava/util/List;
      // 105: iload 4
      // 107: iinc 4 -1
      // 10a: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 10f: goto 116
      // 112: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 115: athrow
      // 116: pop
      // 117: iinc 4 1
      // 11a: iload 3
      // 11b: ifne 039
      // 11e: aload 0
      // 11f: getfield t9d.e8t Luan;
      // 122: sipush 24996
      // 125: ldc2_w 1525129753578211863
      // 128: lload 1
      // 129: lxor
      // 12a: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 12f: nop
      // 130: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 133: aload 0
      // 134: getfield t9d.guf Ljava/util/List;
      // 137: aload 0
      // 138: getfield t9d.idd Ljava/util/List;
      // 13b: invokeinterface java/util/List.removeAll (Ljava/util/Collection;)Z 2
      // 140: pop
      // 141: bipush 0
      // 142: istore 4
      // 144: iload 4
      // 146: aload 0
      // 147: getfield t9d.idd Ljava/util/List;
      // 14a: invokeinterface java/util/List.size ()I 1
      // 14f: if_icmpge 1c7
      // 152: aload 0
      // 153: getfield t9d.idd Ljava/util/List;
      // 156: iload 4
      // 158: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 15d: checkcast i2h
      // 160: astore 5
      // 162: aload 5
      // 164: getfield i2h.jw4 I
      // 167: istore 6
      // 169: aload 5
      // 16b: getfield i2h.e6l I
      // 16e: istore 7
      // 170: iload 3
      // 171: ifeq 1c3
      // 174: aload 5
      // 176: getfield i2h.qok Z
      // 179: iload 3
      // 17a: ifeq 1c8
      // 17d: goto 184
      // 180: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 183: athrow
      // 184: ifeq 1c0
      // 187: goto 18e
      // 18a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18d: athrow
      // 18e: aload 0
      // 18f: iload 6
      // 191: iload 7
      // 193: iload 3
      // 194: ifeq 1b8
      // 197: goto 19e
      // 19a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: bipush 1
      // 19f: invokevirtual t9d.ivw (IIZ)Z
      // 1a2: ifeq 1c0
      // 1a5: goto 1ac
      // 1a8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ab: athrow
      // 1ac: aload 0
      // 1ad: iload 6
      // 1af: iload 7
      // 1b1: goto 1b8
      // 1b4: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b7: athrow
      // 1b8: invokevirtual t9d.o5h (II)Ltts;
      // 1bb: aload 5
      // 1bd: invokevirtual tts.v13 (Li2h;)V
      // 1c0: iinc 4 1
      // 1c3: iload 3
      // 1c4: ifne 144
      // 1c7: bipush 0
      // 1c8: istore 4
      // 1ca: iload 4
      // 1cc: aload 0
      // 1cd: getfield t9d.idd Ljava/util/List;
      // 1d0: invokeinterface java/util/List.size ()I 1
      // 1d5: if_icmpge 1fc
      // 1d8: aload 0
      // 1d9: aload 0
      // 1da: getfield t9d.idd Ljava/util/List;
      // 1dd: iload 4
      // 1df: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1e4: checkcast i2h
      // 1e7: invokevirtual t9d.cvm (Li2h;)V
      // 1ea: iinc 4 1
      // 1ed: iload 3
      // 1ee: ifeq 21a
      // 1f1: iload 3
      // 1f2: ifne 1ca
      // 1f5: goto 1fc
      // 1f8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1fb: athrow
      // 1fc: aload 0
      // 1fd: getfield t9d.idd Ljava/util/List;
      // 200: invokeinterface java/util/List.clear ()V 1
      // 205: aload 0
      // 206: getfield t9d.e8t Luan;
      // 209: sipush 25949
      // 20c: ldc2_w 7168107677547007718
      // 20f: lload 1
      // 210: lxor
      // 211: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 216: nop
      // 217: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 21a: bipush 0
      // 21b: istore 4
      // 21d: iload 4
      // 21f: aload 0
      // 220: getfield t9d.guf Ljava/util/List;
      // 223: invokeinterface java/util/List.size ()I 1
      // 228: if_icmpge 3be
      // 22b: aload 0
      // 22c: getfield t9d.guf Ljava/util/List;
      // 22f: iload 4
      // 231: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 236: checkcast i2h
      // 239: astore 5
      // 23b: iload 3
      // 23c: ifeq 3d8
      // 23f: aload 5
      // 241: getfield i2h.hzp Li2h;
      // 244: iload 3
      // 245: ifeq 2c2
      // 248: goto 24f
      // 24b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24e: athrow
      // 24f: ifnull 2ab
      // 252: goto 259
      // 255: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 258: athrow
      // 259: aload 5
      // 25b: getfield i2h.hzp Li2h;
      // 25e: iload 3
      // 25f: ifeq 2a7
      // 262: goto 269
      // 265: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 268: athrow
      // 269: getfield i2h.ma9 Z
      // 26c: ifne 29c
      // 26f: goto 276
      // 272: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 275: athrow
      // 276: aload 5
      // 278: getfield i2h.hzp Li2h;
      // 27b: getfield i2h.wgv Li2h;
      // 27e: iload 3
      // 27f: ifeq 2a7
      // 282: goto 289
      // 285: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 288: athrow
      // 289: aload 5
      // 28b: if_acmpne 29c
      // 28e: goto 295
      // 291: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 294: athrow
      // 295: goto 3b7
      // 298: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29b: athrow
      // 29c: aload 5
      // 29e: getfield i2h.hzp Li2h;
      // 2a1: aconst_null
      // 2a2: putfield i2h.wgv Li2h;
      // 2a5: aload 5
      // 2a7: aconst_null
      // 2a8: putfield i2h.hzp Li2h;
      // 2ab: aload 0
      // 2ac: getfield t9d.e8t Luan;
      // 2af: sipush 26779
      // 2b2: ldc2_w 3608086025171043110
      // 2b5: lload 1
      // 2b6: lxor
      // 2b7: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2bc: nop
      // 2bd: invokevirtual uan.qek (Ljava/lang/String;)V
      // 2c0: aload 5
      // 2c2: getfield i2h.ma9 Z
      // 2c5: iload 3
      // 2c6: ifeq 345
      // 2c9: ifne 319
      // 2cc: goto 2d3
      // 2cf: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d2: athrow
      // 2d3: aload 0
      // 2d4: aload 5
      // 2d6: invokevirtual t9d.it6 (Li2h;)V
      // 2d9: goto 319
      // 2dc: astore 6
      // 2de: aload 6
      // 2e0: sipush 7915
      // 2e3: ldc2_w 8019854722504357247
      // 2e6: lload 1
      // 2e7: lxor
      // 2e8: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 2ed: nop
      // 2ee: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 2f1: astore 7
      // 2f3: aload 7
      // 2f5: sipush 7623
      // 2f8: ldc2_w 3485699356543514177
      // 2fb: lload 1
      // 2fc: lxor
      // 2fd: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 302: nop
      // 303: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 306: astore 8
      // 308: aload 5
      // 30a: aload 8
      // 30c: invokevirtual i2h.gfa (Lwsc;)V
      // 30f: new oov
      // 312: dup
      // 313: aload 7
      // 315: invokespecial oov.<init> (Le1i;)V
      // 318: athrow
      // 319: aload 0
      // 31a: getfield t9d.e8t Luan;
      // 31d: invokevirtual uan.uio ()V
      // 320: aload 0
      // 321: getfield t9d.e8t Luan;
      // 324: iload 3
      // 325: ifeq 3b4
      // 328: sipush 12825
      // 32b: ldc2_w 6135704697722755476
      // 32e: lload 1
      // 32f: lxor
      // 330: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 335: nop
      // 336: invokevirtual uan.qek (Ljava/lang/String;)V
      // 339: aload 5
      // 33b: getfield i2h.ma9 Z
      // 33e: goto 345
      // 341: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 344: athrow
      // 345: ifeq 3b0
      // 348: aload 5
      // 34a: getfield i2h.jw4 I
      // 34d: istore 6
      // 34f: aload 5
      // 351: getfield i2h.e6l I
      // 354: istore 7
      // 356: aload 5
      // 358: iload 3
      // 359: ifeq 3a9
      // 35c: getfield i2h.qok Z
      // 35f: ifeq 39b
      // 362: goto 369
      // 365: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 368: athrow
      // 369: aload 0
      // 36a: iload 3
      // 36b: ifeq 3ab
      // 36e: goto 375
      // 371: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 374: athrow
      // 375: iload 6
      // 377: iload 7
      // 379: bipush 1
      // 37a: invokevirtual t9d.ivw (IIZ)Z
      // 37d: ifeq 39b
      // 380: goto 387
      // 383: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 386: athrow
      // 387: aload 0
      // 388: iload 6
      // 38a: iload 7
      // 38c: invokevirtual t9d.o5h (II)Ltts;
      // 38f: aload 5
      // 391: invokevirtual tts.v13 (Li2h;)V
      // 394: goto 39b
      // 397: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39a: athrow
      // 39b: aload 0
      // 39c: getfield t9d.guf Ljava/util/List;
      // 39f: iload 4
      // 3a1: iinc 4 -1
      // 3a4: invokeinterface java/util/List.remove (I)Ljava/lang/Object; 2
      // 3a9: pop
      // 3aa: aload 0
      // 3ab: aload 5
      // 3ad: invokevirtual t9d.cvm (Li2h;)V
      // 3b0: aload 0
      // 3b1: getfield t9d.e8t Luan;
      // 3b4: invokevirtual uan.uio ()V
      // 3b7: iinc 4 1
      // 3ba: iload 3
      // 3bb: ifne 21d
      // 3be: aload 0
      // 3bf: getfield t9d.e8t Luan;
      // 3c2: sipush 18259
      // 3c5: ldc2_w 5902557884151344320
      // 3c8: lload 1
      // 3c9: lxor
      // 3ca: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 3cf: nop
      // 3d0: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 3d3: aload 0
      // 3d4: bipush 1
      // 3d5: putfield t9d.vev Z
      // 3d8: aload 0
      // 3d9: getfield t9d.nkv Ljava/util/List;
      // 3dc: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3e1: astore 4
      // 3e3: aload 4
      // 3e5: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3ea: ifeq 514
      // 3ed: aload 4
      // 3ef: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3f4: checkcast pyk
      // 3f7: astore 5
      // 3f9: aload 5
      // 3fb: invokevirtual pyk.fyn ()Z
      // 3fe: iload 3
      // 3ff: ifeq 522
      // 402: iload 3
      // 403: ifeq 4b9
      // 406: goto 40d
      // 409: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40c: athrow
      // 40d: ifne 4b4
      // 410: goto 417
      // 413: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 416: athrow
      // 417: aload 5
      // 419: invokevirtual pyk.g8i ()Z
      // 41c: iload 3
      // 41d: ifeq 4b9
      // 420: goto 427
      // 423: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 426: athrow
      // 427: ifeq 4b4
      // 42a: goto 431
      // 42d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 430: athrow
      // 431: aload 5
      // 433: invokevirtual pyk.y8_ ()Lmew;
      // 436: astore 6
      // 438: aload 0
      // 439: aload 6
      // 43b: invokevirtual t9d.xjm (Lmew;)Z
      // 43e: iload 3
      // 43f: ifeq 4b9
      // 442: ifeq 4b4
      // 445: goto 44c
      // 448: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44b: athrow
      // 44c: aload 0
      // 44d: getfield t9d._m8 Lw5i;
      // 450: aload 6
      // 452: invokevirtual w5i.hka (Lmew;)Z
      // 455: iload 3
      // 456: ifeq 4b9
      // 459: goto 460
      // 45c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45f: athrow
      // 460: ifeq 4b4
      // 463: goto 46a
      // 466: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 469: athrow
      // 46a: aload 5
      // 46c: checkcast xcy
      // 46f: invokeinterface xcy._21 ()V 1
      // 474: goto 4b4
      // 477: astore 7
      // 479: aload 7
      // 47b: sipush 27908
      // 47e: ldc2_w 6870677617287726746
      // 481: lload 1
      // 482: lxor
      // 483: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 488: nop
      // 489: invokestatic e1i.cor (Ljava/lang/Throwable;Ljava/lang/String;)Le1i;
      // 48c: astore 8
      // 48e: aload 8
      // 490: sipush 14902
      // 493: ldc2_w 6727279389706801542
      // 496: lload 1
      // 497: lxor
      // 498: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 49d: nop
      // 49e: invokevirtual e1i.i_r (Ljava/lang/String;)Lwsc;
      // 4a1: astore 9
      // 4a3: aload 5
      // 4a5: aload 9
      // 4a7: invokevirtual pyk.h3j (Lwsc;)V
      // 4aa: new oov
      // 4ad: dup
      // 4ae: aload 8
      // 4b0: invokespecial oov.<init> (Le1i;)V
      // 4b3: athrow
      // 4b4: aload 5
      // 4b6: invokevirtual pyk.fyn ()Z
      // 4b9: iload 3
      // 4ba: ifeq 4f5
      // 4bd: ifeq 510
      // 4c0: goto 4c7
      // 4c3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4c6: athrow
      // 4c7: aload 4
      // 4c9: invokeinterface java/util/Iterator.remove ()V 1
      // 4ce: aload 0
      // 4cf: getfield t9d.cn6 Ljava/util/List;
      // 4d2: aload 5
      // 4d4: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 4d9: pop
      // 4da: aload 0
      // 4db: aload 5
      // 4dd: invokevirtual pyk.y8_ ()Lmew;
      // 4e0: iload 3
      // 4e1: ifeq 505
      // 4e4: goto 4eb
      // 4e7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4ea: athrow
      // 4eb: invokevirtual t9d.xjm (Lmew;)Z
      // 4ee: goto 4f5
      // 4f1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f4: athrow
      // 4f5: ifeq 510
      // 4f8: aload 0
      // 4f9: aload 5
      // 4fb: invokevirtual pyk.y8_ ()Lmew;
      // 4fe: goto 505
      // 501: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 504: athrow
      // 505: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 508: aload 5
      // 50a: invokevirtual pyk.y8_ ()Lmew;
      // 50d: invokevirtual tts.aoo (Lmew;)V
      // 510: iload 3
      // 511: ifne 3e3
      // 514: aload 0
      // 515: bipush 0
      // 516: putfield t9d.vev Z
      // 519: aload 0
      // 51a: getfield t9d.u0w Ljava/util/List;
      // 51d: invokeinterface java/util/List.isEmpty ()Z 1
      // 522: iload 3
      // 523: ifeq 585
      // 526: ifne 55c
      // 529: goto 530
      // 52c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52f: athrow
      // 530: aload 0
      // 531: getfield t9d.nkv Ljava/util/List;
      // 534: aload 0
      // 535: getfield t9d.u0w Ljava/util/List;
      // 538: invokeinterface java/util/List.removeAll (Ljava/util/Collection;)Z 2
      // 53d: pop
      // 53e: aload 0
      // 53f: getfield t9d.cn6 Ljava/util/List;
      // 542: aload 0
      // 543: getfield t9d.u0w Ljava/util/List;
      // 546: invokeinterface java/util/List.removeAll (Ljava/util/Collection;)Z 2
      // 54b: pop
      // 54c: aload 0
      // 54d: getfield t9d.u0w Ljava/util/List;
      // 550: invokeinterface java/util/List.clear ()V 1
      // 555: goto 55c
      // 558: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 55b: athrow
      // 55c: aload 0
      // 55d: getfield t9d.e8t Luan;
      // 560: sipush 20263
      // 563: ldc2_w 4024653609130337435
      // 566: lload 1
      // 567: lxor
      // 568: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 56d: nop
      // 56e: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 571: aload 0
      // 572: iload 3
      // 573: ifeq 647
      // 576: getfield t9d.kkp Ljava/util/List;
      // 579: invokeinterface java/util/List.isEmpty ()Z 1
      // 57e: goto 585
      // 581: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 584: athrow
      // 585: ifne 63f
      // 588: bipush 0
      // 589: istore 5
      // 58b: iload 5
      // 58d: aload 0
      // 58e: getfield t9d.kkp Ljava/util/List;
      // 591: invokeinterface java/util/List.size ()I 1
      // 596: if_icmpge 636
      // 599: aload 0
      // 59a: getfield t9d.kkp Ljava/util/List;
      // 59d: iload 5
      // 59f: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 5a4: checkcast pyk
      // 5a7: astore 6
      // 5a9: iload 3
      // 5aa: ifeq 64d
      // 5ad: iload 3
      // 5ae: ifeq 632
      // 5b1: goto 5b8
      // 5b4: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b7: athrow
      // 5b8: aload 6
      // 5ba: invokevirtual pyk.fyn ()Z
      // 5bd: ifne 62f
      // 5c0: goto 5c7
      // 5c3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5c6: athrow
      // 5c7: aload 0
      // 5c8: getfield t9d.cn6 Ljava/util/List;
      // 5cb: aload 6
      // 5cd: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 5d2: iload 3
      // 5d3: ifeq 609
      // 5d6: goto 5dd
      // 5d9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5dc: athrow
      // 5dd: ifne 5f5
      // 5e0: goto 5e7
      // 5e3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e6: athrow
      // 5e7: aload 0
      // 5e8: aload 6
      // 5ea: invokevirtual t9d.qhm (Lpyk;)Z
      // 5ed: pop
      // 5ee: goto 5f5
      // 5f1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f4: athrow
      // 5f5: aload 0
      // 5f6: aload 6
      // 5f8: invokevirtual pyk.y8_ ()Lmew;
      // 5fb: iload 3
      // 5fc: ifeq 62c
      // 5ff: invokevirtual t9d.xjm (Lmew;)Z
      // 602: goto 609
      // 605: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 608: athrow
      // 609: ifeq 626
      // 60c: aload 0
      // 60d: aload 6
      // 60f: invokevirtual pyk.y8_ ()Lmew;
      // 612: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 615: aload 6
      // 617: invokevirtual pyk.y8_ ()Lmew;
      // 61a: aload 6
      // 61c: invokevirtual tts.pus (Lmew;Lpyk;)V
      // 61f: goto 626
      // 622: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 625: athrow
      // 626: aload 0
      // 627: aload 6
      // 629: invokevirtual pyk.y8_ ()Lmew;
      // 62c: invokevirtual t9d.nfo (Lmew;)V
      // 62f: iinc 5 1
      // 632: iload 3
      // 633: ifne 58b
      // 636: aload 0
      // 637: getfield t9d.kkp Ljava/util/List;
      // 63a: invokeinterface java/util/List.clear ()V 1
      // 63f: aload 0
      // 640: getfield t9d.e8t Luan;
      // 643: invokevirtual uan.uio ()V
      // 646: aload 0
      // 647: getfield t9d.e8t Luan;
      // 64a: invokevirtual uan.uio ()V
      // 64d: return
   }

   public boolean qhm(pyk param1) {
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
      // 05: getfield t9d.cn6 Ljava/util/List;
      // 08: aload 1
      // 09: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0e: istore 3
      // 0f: iload 3
      // 10: iload 2
      // 11: ifeq 4a
      // 14: ifeq 49
      // 17: goto 1e
      // 1a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d: athrow
      // 1e: aload 1
      // 1f: instanceof xcy
      // 22: iload 2
      // 23: ifeq 4a
      // 26: goto 2d
      // 29: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: ifeq 49
      // 30: goto 37
      // 33: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: getfield t9d.nkv Ljava/util/List;
      // 3b: aload 1
      // 3c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 41: pop
      // 42: goto 49
      // 45: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 48: athrow
      // 49: iload 3
      // 4a: ireturn
   }

   public void py7(Collection param1) {
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
      // 05: getfield t9d.vev Z
      // 08: iload 2
      // 09: ifeq 27
      // 0c: ifeq 2c
      // 0f: goto 16
      // 12: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 0
      // 17: getfield t9d.kkp Ljava/util/List;
      // 1a: aload 1
      // 1b: invokeinterface java/util/List.addAll (Ljava/util/Collection;)Z 2
      // 20: goto 27
      // 23: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: pop
      // 28: iload 2
      // 29: ifne 7d
      // 2c: aload 1
      // 2d: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 32: astore 3
      // 33: aload 3
      // 34: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 39: ifeq 7d
      // 3c: aload 3
      // 3d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 42: checkcast pyk
      // 45: astore 4
      // 47: aload 0
      // 48: getfield t9d.cn6 Ljava/util/List;
      // 4b: aload 4
      // 4d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 52: pop
      // 53: aload 4
      // 55: instanceof xcy
      // 58: iload 2
      // 59: ifeq 78
      // 5c: ifeq 79
      // 5f: goto 66
      // 62: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 65: athrow
      // 66: aload 0
      // 67: getfield t9d.nkv Ljava/util/List;
      // 6a: aload 4
      // 6c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 71: goto 78
      // 74: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 77: athrow
      // 78: pop
      // 79: iload 2
      // 7a: ifne 33
      // 7d: return
   }

   public void it6(i2h var1) {
      this.wu1(var1, true);
   }

   public void wu1(i2h param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic t9d.c J
      // 003: ldc2_w 52074059073084
      // 006: lxor
      // 007: lstore 3
      // 008: aload 1
      // 009: getfield i2h.o2v D
      // 00c: invokestatic fe6.jqf (D)I
      // 00f: istore 6
      // 011: invokestatic t9d.b ()I
      // 014: aload 1
      // 015: getfield i2h.vbd D
      // 018: invokestatic fe6.jqf (D)I
      // 01b: istore 7
      // 01d: istore 5
      // 01f: bipush 32
      // 021: istore 8
      // 023: iload 2
      // 024: iload 5
      // 026: ifeq 094
      // 029: ifeq 064
      // 02c: goto 033
      // 02f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: aload 0
      // 034: iload 6
      // 036: iload 8
      // 038: isub
      // 039: bipush 0
      // 03a: iload 7
      // 03c: iload 8
      // 03e: isub
      // 03f: iload 6
      // 041: iload 8
      // 043: iadd
      // 044: bipush 0
      // 045: iload 7
      // 047: iload 8
      // 049: iadd
      // 04a: bipush 1
      // 04b: invokespecial t9d.w48 (IIIIIIZ)Z
      // 04e: iload 5
      // 050: ifeq 094
      // 053: goto 05a
      // 056: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: ifeq 411
      // 05d: goto 064
      // 060: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 063: athrow
      // 064: aload 1
      // 065: aload 1
      // 066: getfield i2h.o2v D
      // 069: putfield i2h.ivp D
      // 06c: aload 1
      // 06d: aload 1
      // 06e: getfield i2h.kfp D
      // 071: putfield i2h.c54 D
      // 074: aload 1
      // 075: aload 1
      // 076: getfield i2h.vbd D
      // 079: putfield i2h.e2b D
      // 07c: aload 1
      // 07d: aload 1
      // 07e: getfield i2h.x5k F
      // 081: putfield i2h.p3h F
      // 084: aload 1
      // 085: aload 1
      // 086: getfield i2h.y2i F
      // 089: putfield i2h.j25 F
      // 08c: iload 2
      // 08d: goto 094
      // 090: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: iload 5
      // 096: ifeq 124
      // 099: ifeq 0fc
      // 09c: goto 0a3
      // 09f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a2: athrow
      // 0a3: aload 1
      // 0a4: getfield i2h.qok Z
      // 0a7: iload 5
      // 0a9: ifeq 124
      // 0ac: goto 0b3
      // 0af: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b2: athrow
      // 0b3: ifeq 0fc
      // 0b6: goto 0bd
      // 0b9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 1
      // 0be: dup
      // 0bf: getfield i2h.g25 I
      // 0c2: bipush 1
      // 0c3: iadd
      // 0c4: putfield i2h.g25 I
      // 0c7: aload 1
      // 0c8: getfield i2h.hzp Li2h;
      // 0cb: iload 5
      // 0cd: ifeq 0f9
      // 0d0: goto 0d7
      // 0d3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: ifnull 0f1
      // 0da: goto 0e1
      // 0dd: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 1
      // 0e2: invokevirtual i2h.dm3 ()V
      // 0e5: iload 5
      // 0e7: ifne 0fc
      // 0ea: goto 0f1
      // 0ed: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: aload 1
      // 0f2: goto 0f9
      // 0f5: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f8: athrow
      // 0f9: invokevirtual i2h.xx_ ()V
      // 0fc: aload 0
      // 0fd: getfield t9d.e8t Luan;
      // 100: sipush 12658
      // 103: ldc2_w 4908967549854027826
      // 106: lload 3
      // 107: lxor
      // 108: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 10d: nop
      // 10e: invokevirtual uan.qek (Ljava/lang/String;)V
      // 111: aload 1
      // 112: iload 5
      // 114: ifeq 145
      // 117: getfield i2h.o2v D
      // 11a: invokestatic java/lang/Double.isNaN (D)Z
      // 11d: goto 124
      // 120: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: ifne 144
      // 127: aload 1
      // 128: getfield i2h.o2v D
      // 12b: invokestatic java/lang/Double.isInfinite (D)Z
      // 12e: iload 5
      // 130: ifeq 15f
      // 133: goto 13a
      // 136: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 139: athrow
      // 13a: ifeq 14c
      // 13d: goto 144
      // 140: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 143: athrow
      // 144: aload 1
      // 145: aload 1
      // 146: getfield i2h.ivp D
      // 149: putfield i2h.o2v D
      // 14c: aload 1
      // 14d: iload 5
      // 14f: ifeq 180
      // 152: getfield i2h.kfp D
      // 155: invokestatic java/lang/Double.isNaN (D)Z
      // 158: goto 15f
      // 15b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15e: athrow
      // 15f: ifne 17f
      // 162: aload 1
      // 163: getfield i2h.kfp D
      // 166: invokestatic java/lang/Double.isInfinite (D)Z
      // 169: iload 5
      // 16b: ifeq 19a
      // 16e: goto 175
      // 171: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 174: athrow
      // 175: ifeq 187
      // 178: goto 17f
      // 17b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17e: athrow
      // 17f: aload 1
      // 180: aload 1
      // 181: getfield i2h.c54 D
      // 184: putfield i2h.kfp D
      // 187: aload 1
      // 188: iload 5
      // 18a: ifeq 1bb
      // 18d: getfield i2h.vbd D
      // 190: invokestatic java/lang/Double.isNaN (D)Z
      // 193: goto 19a
      // 196: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 199: athrow
      // 19a: ifne 1ba
      // 19d: aload 1
      // 19e: getfield i2h.vbd D
      // 1a1: invokestatic java/lang/Double.isInfinite (D)Z
      // 1a4: iload 5
      // 1a6: ifeq 1d6
      // 1a9: goto 1b0
      // 1ac: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1af: athrow
      // 1b0: ifeq 1c2
      // 1b3: goto 1ba
      // 1b6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b9: athrow
      // 1ba: aload 1
      // 1bb: aload 1
      // 1bc: getfield i2h.e2b D
      // 1bf: putfield i2h.vbd D
      // 1c2: aload 1
      // 1c3: iload 5
      // 1c5: ifeq 1f8
      // 1c8: getfield i2h.y2i F
      // 1cb: f2d
      // 1cc: invokestatic java/lang/Double.isNaN (D)Z
      // 1cf: goto 1d6
      // 1d2: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d5: athrow
      // 1d6: ifne 1f7
      // 1d9: aload 1
      // 1da: getfield i2h.y2i F
      // 1dd: f2d
      // 1de: invokestatic java/lang/Double.isInfinite (D)Z
      // 1e1: iload 5
      // 1e3: ifeq 213
      // 1e6: goto 1ed
      // 1e9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: ifeq 1ff
      // 1f0: goto 1f7
      // 1f3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f6: athrow
      // 1f7: aload 1
      // 1f8: aload 1
      // 1f9: getfield i2h.j25 F
      // 1fc: putfield i2h.y2i F
      // 1ff: aload 1
      // 200: iload 5
      // 202: ifeq 235
      // 205: getfield i2h.x5k F
      // 208: f2d
      // 209: invokestatic java/lang/Double.isNaN (D)Z
      // 20c: goto 213
      // 20f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 212: athrow
      // 213: ifne 234
      // 216: aload 1
      // 217: getfield i2h.x5k F
      // 21a: f2d
      // 21b: invokestatic java/lang/Double.isInfinite (D)Z
      // 21e: iload 5
      // 220: ifeq 247
      // 223: goto 22a
      // 226: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 229: athrow
      // 22a: ifeq 23c
      // 22d: goto 234
      // 230: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 233: athrow
      // 234: aload 1
      // 235: aload 1
      // 236: getfield i2h.p3h F
      // 239: putfield i2h.x5k F
      // 23c: aload 1
      // 23d: getfield i2h.o2v D
      // 240: ldc2_w 16.0
      // 243: ddiv
      // 244: invokestatic fe6.jqf (D)I
      // 247: istore 9
      // 249: aload 1
      // 24a: getfield i2h.kfp D
      // 24d: ldc2_w 16.0
      // 250: ddiv
      // 251: invokestatic fe6.jqf (D)I
      // 254: istore 10
      // 256: aload 1
      // 257: getfield i2h.vbd D
      // 25a: ldc2_w 16.0
      // 25d: ddiv
      // 25e: invokestatic fe6.jqf (D)I
      // 261: istore 11
      // 263: aload 1
      // 264: getfield i2h.qok Z
      // 267: iload 5
      // 269: ifeq 2d5
      // 26c: ifeq 2ca
      // 26f: goto 276
      // 272: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 275: athrow
      // 276: aload 1
      // 277: getfield i2h.jw4 I
      // 27a: iload 5
      // 27c: ifeq 2d5
      // 27f: goto 286
      // 282: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 285: athrow
      // 286: iload 9
      // 288: if_icmpne 2ca
      // 28b: goto 292
      // 28e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 291: athrow
      // 292: aload 1
      // 293: getfield i2h.cub I
      // 296: iload 5
      // 298: ifeq 2d5
      // 29b: goto 2a2
      // 29e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2a1: athrow
      // 2a2: iload 10
      // 2a4: if_icmpne 2ca
      // 2a7: goto 2ae
      // 2aa: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ad: athrow
      // 2ae: aload 1
      // 2af: getfield i2h.e6l I
      // 2b2: iload 5
      // 2b4: ifeq 36b
      // 2b7: goto 2be
      // 2ba: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2bd: athrow
      // 2be: iload 11
      // 2c0: if_icmpeq 363
      // 2c3: goto 2ca
      // 2c6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c9: athrow
      // 2ca: aload 1
      // 2cb: getfield i2h.qok Z
      // 2ce: goto 2d5
      // 2d1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d4: athrow
      // 2d5: iload 5
      // 2d7: ifeq 337
      // 2da: ifeq 322
      // 2dd: goto 2e4
      // 2e0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e3: athrow
      // 2e4: aload 0
      // 2e5: aload 1
      // 2e6: getfield i2h.jw4 I
      // 2e9: aload 1
      // 2ea: getfield i2h.e6l I
      // 2ed: bipush 1
      // 2ee: invokevirtual t9d.ivw (IIZ)Z
      // 2f1: iload 5
      // 2f3: ifeq 337
      // 2f6: goto 2fd
      // 2f9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2fc: athrow
      // 2fd: ifeq 322
      // 300: goto 307
      // 303: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 306: athrow
      // 307: aload 0
      // 308: aload 1
      // 309: getfield i2h.jw4 I
      // 30c: aload 1
      // 30d: getfield i2h.e6l I
      // 310: invokevirtual t9d.o5h (II)Ltts;
      // 313: aload 1
      // 314: aload 1
      // 315: getfield i2h.cub I
      // 318: invokevirtual tts.o0h (Li2h;I)V
      // 31b: goto 322
      // 31e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 321: athrow
      // 322: aload 0
      // 323: iload 9
      // 325: iload 11
      // 327: iload 5
      // 329: ifeq 34b
      // 32c: bipush 1
      // 32d: invokevirtual t9d.ivw (IIZ)Z
      // 330: goto 337
      // 333: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 336: athrow
      // 337: ifeq 357
      // 33a: aload 1
      // 33b: bipush 1
      // 33c: putfield i2h.qok Z
      // 33f: aload 0
      // 340: iload 9
      // 342: iload 11
      // 344: goto 34b
      // 347: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34a: athrow
      // 34b: invokevirtual t9d.o5h (II)Ltts;
      // 34e: aload 1
      // 34f: invokevirtual tts._3_ (Li2h;)V
      // 352: iload 5
      // 354: ifne 363
      // 357: aload 1
      // 358: bipush 0
      // 359: putfield i2h.qok Z
      // 35c: goto 363
      // 35f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 362: athrow
      // 363: aload 0
      // 364: getfield t9d.e8t Luan;
      // 367: invokevirtual uan.uio ()V
      // 36a: iload 2
      // 36b: iload 5
      // 36d: ifeq 391
      // 370: ifeq 411
      // 373: goto 37a
      // 376: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 379: athrow
      // 37a: aload 1
      // 37b: iload 5
      // 37d: ifeq 39f
      // 380: goto 387
      // 383: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 386: athrow
      // 387: getfield i2h.qok Z
      // 38a: goto 391
      // 38d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 390: athrow
      // 391: ifeq 411
      // 394: aload 1
      // 395: getfield i2h.wgv Li2h;
      // 398: goto 39f
      // 39b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39e: athrow
      // 39f: iload 5
      // 3a1: ifeq 3b9
      // 3a4: ifnull 411
      // 3a7: goto 3ae
      // 3aa: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ad: athrow
      // 3ae: aload 1
      // 3af: getfield i2h.wgv Li2h;
      // 3b2: goto 3b9
      // 3b5: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b8: athrow
      // 3b9: iload 5
      // 3bb: ifeq 40d
      // 3be: getfield i2h.ma9 Z
      // 3c1: ifne 3fd
      // 3c4: goto 3cb
      // 3c7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ca: athrow
      // 3cb: aload 1
      // 3cc: getfield i2h.wgv Li2h;
      // 3cf: getfield i2h.hzp Li2h;
      // 3d2: iload 5
      // 3d4: ifeq 40d
      // 3d7: goto 3de
      // 3da: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3dd: athrow
      // 3de: aload 1
      // 3df: if_acmpne 3fd
      // 3e2: goto 3e9
      // 3e5: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e8: athrow
      // 3e9: aload 0
      // 3ea: aload 1
      // 3eb: getfield i2h.wgv Li2h;
      // 3ee: invokevirtual t9d.it6 (Li2h;)V
      // 3f1: iload 5
      // 3f3: ifne 411
      // 3f6: goto 3fd
      // 3f9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3fc: athrow
      // 3fd: aload 1
      // 3fe: getfield i2h.wgv Li2h;
      // 401: aconst_null
      // 402: putfield i2h.hzp Li2h;
      // 405: aload 1
      // 406: goto 40d
      // 409: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40c: athrow
      // 40d: aconst_null
      // 40e: putfield i2h.wgv Li2h;
      // 411: return
   }

   public boolean z09(nh4 var1) {
      return this.g17(var1, (i2h)null);
   }

   public boolean g17(nh4 param1, i2h param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aconst_null
      // 02: checkcast i2h
      // 05: aload 1
      // 06: invokevirtual t9d.p05 (Li2h;Lnh4;)Ljava/util/List;
      // 09: astore 4
      // 0b: invokestatic t9d.c ()I
      // 0e: bipush 0
      // 0f: istore 5
      // 11: istore 3
      // 12: iload 5
      // 14: aload 4
      // 16: invokeinterface java/util/List.size ()I 1
      // 1b: if_icmpge ca
      // 1e: aload 4
      // 20: iload 5
      // 22: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 27: checkcast i2h
      // 2a: astore 6
      // 2c: iload 3
      // 2d: ifne c6
      // 30: aload 6
      // 32: getfield i2h.ma9 Z
      // 35: iload 3
      // 36: ifne cb
      // 39: goto 40
      // 3c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: ifne c3
      // 43: goto 4a
      // 46: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 6
      // 4c: iload 3
      // 4d: ifne 6d
      // 50: goto 57
      // 53: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 56: athrow
      // 57: getfield i2h.gz8 Z
      // 5a: ifeq c3
      // 5d: goto 64
      // 60: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 6
      // 66: goto 6d
      // 69: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: iload 3
      // 6e: ifne 84
      // 71: aload 2
      // 72: if_acmpeq c3
      // 75: goto 7c
      // 78: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: aload 2
      // 7d: goto 84
      // 80: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 83: athrow
      // 84: iload 3
      // 85: ifne 9d
      // 88: ifnull bd
      // 8b: goto 92
      // 8e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 91: athrow
      // 92: aload 2
      // 93: getfield i2h.hzp Li2h;
      // 96: goto 9d
      // 99: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: aload 6
      // 9f: iload 3
      // a0: ifne ba
      // a3: if_acmpeq c3
      // a6: goto ad
      // a9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ac: athrow
      // ad: aload 2
      // ae: getfield i2h.wgv Li2h;
      // b1: aload 6
      // b3: goto ba
      // b6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b9: athrow
      // ba: if_acmpeq c3
      // bd: bipush 0
      // be: ireturn
      // bf: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c2: athrow
      // c3: iinc 5 1
      // c6: iload 3
      // c7: ifeq 12
      // ca: bipush 1
      // cb: ireturn
   }

   public boolean o2j(nh4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield nh4.rlc D
      // 04: invokestatic fe6.jqf (D)I
      // 07: istore 3
      // 08: aload 1
      // 09: getfield nh4.t_2 D
      // 0c: invokestatic fe6.jqf (D)I
      // 0f: istore 4
      // 11: aload 1
      // 12: getfield nh4.bx_ D
      // 15: invokestatic fe6.jqf (D)I
      // 18: istore 5
      // 1a: aload 1
      // 1b: getfield nh4.i2c D
      // 1e: invokestatic fe6.jqf (D)I
      // 21: istore 6
      // 23: invokestatic t9d.c ()I
      // 26: aload 1
      // 27: getfield nh4.t8n D
      // 2a: invokestatic fe6.jqf (D)I
      // 2d: istore 7
      // 2f: aload 1
      // 30: getfield nh4.oqj D
      // 33: invokestatic fe6.jqf (D)I
      // 36: istore 8
      // 38: new mew$mix
      // 3b: dup
      // 3c: invokespecial mew$mix.<init> ()V
      // 3f: astore 9
      // 41: istore 2
      // 42: iload 3
      // 43: istore 10
      // 45: iload 10
      // 47: iload 4
      // 49: if_icmpgt bc
      // 4c: iload 5
      // 4e: iload 2
      // 4f: ifne bd
      // 52: istore 11
      // 54: iload 11
      // 56: iload 6
      // 58: if_icmpgt b5
      // 5b: iload 7
      // 5d: iload 2
      // 5e: ifne 47
      // 61: istore 12
      // 63: iload 12
      // 65: iload 8
      // 67: if_icmpgt ae
      // 6a: aload 0
      // 6b: aload 9
      // 6d: iload 10
      // 6f: iload 11
      // 71: iload 12
      // 73: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 76: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 79: invokeinterface zfz.r_y ()Le0x; 1
      // 7e: astore 13
      // 80: iload 2
      // 81: ifne b1
      // 84: iload 2
      // 85: ifne aa
      // 88: goto 8f
      // 8b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: aload 13
      // 91: invokevirtual e0x.p1r ()Lp3y;
      // 94: getstatic p3y.cei Lp3y;
      // 97: if_acmpeq a7
      // 9a: goto a1
      // 9d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: bipush 1
      // a2: ireturn
      // a3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: iinc 12 1
      // aa: iload 2
      // ab: ifeq 63
      // ae: iinc 11 1
      // b1: iload 2
      // b2: ifeq 54
      // b5: iinc 10 1
      // b8: iload 2
      // b9: ifeq 45
      // bc: bipush 0
      // bd: ireturn
   }

   public boolean hhd(nh4 var1) {
      int var3 = fe6.jqf(var1.rlc);
      int var4 = fe6.jqf(var1.t_2);
      int var10000 = c();
      int var5 = fe6.jqf(var1.bx_);
      int var6 = fe6.jqf(var1.i2c);
      int var7 = fe6.jqf(var1.t8n);
      int var2 = var10000;
      int var8 = fe6.jqf(var1.oqj);
      mew$mix var9 = new mew$mix();
      int var10 = var3;

      label80:
      while (true) {
         var10000 = var10;

         label76:
         while (var10000 <= var4) {
            if (var2 != 0) {
               return (boolean)var5;
            }

            int var11 = var5;

            label74:
            while (true) {
               var10000 = var11;

               label71:
               while (var10000 <= var6) {
                  var10000 = var7;
                  if (var2 != 0) {
                     continue label76;
                  }

                  int var12 = var7;

                  while (var12 <= var8) {
                     e0x var13 = this.getBlockState(var9.bj0(var10, var11, var12)).r_y();

                     label87: {
                        try {
                           if (var2 != 0) {
                              break label87;
                           }

                           var10000 = var13.p1r().l7j();
                           if (var2 != 0) {
                              continue label71;
                           }
                        } catch (oov var14) {
                           throw b(var14);
                        }

                        try {
                           if (var10000 != 0) {
                              return true;
                           }
                        } catch (oov var15) {
                           throw b(var15);
                        }

                        var12++;
                     }

                     if (var2 != 0) {
                        break;
                     }
                  }

                  var11++;
                  if (var2 == 0) {
                     continue label74;
                  }
                  break;
               }

               var10++;
               if (var2 == 0) {
                  continue label80;
               }

               return (boolean)0;
            }
         }

         return (boolean)0;
      }
   }

   public boolean g5g(nh4 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield nh4.rlc D
      // 004: invokestatic fe6.jqf (D)I
      // 007: istore 3
      // 008: aload 1
      // 009: getfield nh4.t_2 D
      // 00c: dconst_1
      // 00d: dadd
      // 00e: invokestatic fe6.jqf (D)I
      // 011: istore 4
      // 013: aload 1
      // 014: getfield nh4.bx_ D
      // 017: invokestatic fe6.jqf (D)I
      // 01a: istore 5
      // 01c: invokestatic t9d.b ()I
      // 01f: aload 1
      // 020: getfield nh4.i2c D
      // 023: dconst_1
      // 024: dadd
      // 025: invokestatic fe6.jqf (D)I
      // 028: istore 6
      // 02a: aload 1
      // 02b: getfield nh4.t8n D
      // 02e: invokestatic fe6.jqf (D)I
      // 031: istore 7
      // 033: aload 1
      // 034: getfield nh4.oqj D
      // 037: dconst_1
      // 038: dadd
      // 039: invokestatic fe6.jqf (D)I
      // 03c: istore 8
      // 03e: istore 2
      // 03f: aload 0
      // 040: iload 3
      // 041: iload 5
      // 043: iload 7
      // 045: iload 4
      // 047: iload 6
      // 049: iload 8
      // 04b: bipush 1
      // 04c: invokespecial t9d.w48 (IIIIIIZ)Z
      // 04f: iload 2
      // 050: ifeq 107
      // 053: ifeq 106
      // 056: goto 05d
      // 059: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05c: athrow
      // 05d: new mew$mix
      // 060: dup
      // 061: invokespecial mew$mix.<init> ()V
      // 064: astore 9
      // 066: iload 3
      // 067: istore 10
      // 069: iload 10
      // 06b: iload 4
      // 06d: if_icmpge 106
      // 070: iload 5
      // 072: iload 2
      // 073: ifeq 107
      // 076: istore 11
      // 078: iload 11
      // 07a: iload 6
      // 07c: if_icmpge 0ff
      // 07f: iload 7
      // 081: iload 2
      // 082: ifeq 06b
      // 085: istore 12
      // 087: iload 12
      // 089: iload 8
      // 08b: if_icmpge 0f8
      // 08e: aload 0
      // 08f: aload 9
      // 091: iload 10
      // 093: iload 11
      // 095: iload 12
      // 097: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 09a: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 09d: invokeinterface zfz.r_y ()Le0x; 1
      // 0a2: astore 13
      // 0a4: iload 2
      // 0a5: ifeq 0fb
      // 0a8: aload 13
      // 0aa: iload 2
      // 0ab: ifeq 0cb
      // 0ae: goto 0b5
      // 0b1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: getstatic ox_._0u Lwuo;
      // 0b8: if_acmpeq 0eb
      // 0bb: goto 0c2
      // 0be: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c1: athrow
      // 0c2: aload 13
      // 0c4: goto 0cb
      // 0c7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ca: athrow
      // 0cb: iload 2
      // 0cc: ifeq 0e5
      // 0cf: getstatic ox_.dr2 L_13;
      // 0d2: if_acmpeq 0eb
      // 0d5: goto 0dc
      // 0d8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0db: athrow
      // 0dc: aload 13
      // 0de: goto 0e5
      // 0e1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e4: athrow
      // 0e5: getstatic ox_.ska Les2;
      // 0e8: if_acmpne 0f1
      // 0eb: bipush 1
      // 0ec: ireturn
      // 0ed: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: iinc 12 1
      // 0f4: iload 2
      // 0f5: ifne 087
      // 0f8: iinc 11 1
      // 0fb: iload 2
      // 0fc: ifne 078
      // 0ff: iinc 10 1
      // 102: iload 2
      // 103: ifne 069
      // 106: bipush 0
      // 107: ireturn
   }

   public boolean jqj(nh4 param1, p3y param2, i2h param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield nh4.rlc D
      // 004: invokestatic fe6.jqf (D)I
      // 007: istore 5
      // 009: aload 1
      // 00a: getfield nh4.t_2 D
      // 00d: dconst_1
      // 00e: dadd
      // 00f: invokestatic fe6.jqf (D)I
      // 012: istore 6
      // 014: invokestatic t9d.c ()I
      // 017: aload 1
      // 018: getfield nh4.bx_ D
      // 01b: invokestatic fe6.jqf (D)I
      // 01e: istore 7
      // 020: istore 4
      // 022: aload 1
      // 023: getfield nh4.i2c D
      // 026: dconst_1
      // 027: dadd
      // 028: invokestatic fe6.jqf (D)I
      // 02b: istore 8
      // 02d: aload 1
      // 02e: getfield nh4.t8n D
      // 031: invokestatic fe6.jqf (D)I
      // 034: istore 9
      // 036: aload 1
      // 037: getfield nh4.oqj D
      // 03a: dconst_1
      // 03b: dadd
      // 03c: invokestatic fe6.jqf (D)I
      // 03f: istore 10
      // 041: aload 0
      // 042: iload 5
      // 044: iload 7
      // 046: iload 9
      // 048: iload 6
      // 04a: iload 8
      // 04c: iload 10
      // 04e: bipush 1
      // 04f: invokespecial t9d.w48 (IIIIIIZ)Z
      // 052: iload 4
      // 054: ifne 068
      // 057: ifne 067
      // 05a: goto 061
      // 05d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 060: athrow
      // 061: bipush 0
      // 062: ireturn
      // 063: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: bipush 0
      // 068: istore 11
      // 06a: new fqr
      // 06d: dup
      // 06e: dconst_0
      // 06f: dconst_0
      // 070: dconst_0
      // 071: invokespecial fqr.<init> (DDD)V
      // 074: astore 12
      // 076: new mew$mix
      // 079: dup
      // 07a: invokespecial mew$mix.<init> ()V
      // 07d: astore 13
      // 07f: iload 5
      // 081: istore 14
      // 083: iload 14
      // 085: iload 6
      // 087: if_icmpge 141
      // 08a: iload 7
      // 08c: iload 4
      // 08e: ifne 148
      // 091: istore 15
      // 093: iload 15
      // 095: iload 8
      // 097: if_icmpge 139
      // 09a: iload 9
      // 09c: iload 4
      // 09e: ifne 085
      // 0a1: istore 16
      // 0a3: iload 16
      // 0a5: iload 10
      // 0a7: if_icmpge 131
      // 0aa: aload 13
      // 0ac: iload 14
      // 0ae: iload 15
      // 0b0: iload 16
      // 0b2: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 0b5: pop
      // 0b6: aload 0
      // 0b7: aload 13
      // 0b9: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0bc: astore 17
      // 0be: aload 17
      // 0c0: invokeinterface zfz.r_y ()Le0x; 1
      // 0c5: astore 18
      // 0c7: iload 4
      // 0c9: ifne 134
      // 0cc: iload 4
      // 0ce: ifne 12c
      // 0d1: goto 0d8
      // 0d4: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d7: athrow
      // 0d8: aload 18
      // 0da: invokevirtual e0x.p1r ()Lp3y;
      // 0dd: aload 2
      // 0de: if_acmpne 129
      // 0e1: goto 0e8
      // 0e4: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: iload 15
      // 0ea: bipush 1
      // 0eb: iadd
      // 0ec: i2f
      // 0ed: aload 17
      // 0ef: getstatic hmv.nfg L_ku;
      // 0f2: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0f7: checkcast java/lang/Integer
      // 0fa: invokevirtual java/lang/Integer.intValue ()I
      // 0fd: invokestatic hmv.jou (I)F
      // 100: fsub
      // 101: f2d
      // 102: dstore 19
      // 104: iload 4
      // 106: ifne 12c
      // 109: iload 8
      // 10b: i2d
      // 10c: dload 19
      // 10e: dcmpl
      // 10f: iflt 129
      // 112: goto 119
      // 115: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 118: athrow
      // 119: bipush 1
      // 11a: istore 11
      // 11c: aload 18
      // 11e: aload 0
      // 11f: aload 13
      // 121: aload 3
      // 122: aload 12
      // 124: invokevirtual e0x.efx (Lt9d;Lmew;Li2h;Lfqr;)Lfqr;
      // 127: astore 12
      // 129: iinc 16 1
      // 12c: iload 4
      // 12e: ifeq 0a3
      // 131: iinc 15 1
      // 134: iload 4
      // 136: ifeq 093
      // 139: iinc 14 1
      // 13c: iload 4
      // 13e: ifeq 083
      // 141: aload 12
      // 143: invokevirtual fqr.vtb ()D
      // 146: dconst_0
      // 147: dcmpl
      // 148: iload 4
      // 14a: ifne 1b2
      // 14d: ifle 1b0
      // 150: goto 157
      // 153: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 156: athrow
      // 157: aload 3
      // 158: invokevirtual i2h.ycw ()Z
      // 15b: iload 4
      // 15d: ifne 1b2
      // 160: goto 167
      // 163: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 166: athrow
      // 167: ifeq 1b0
      // 16a: goto 171
      // 16d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: aload 12
      // 173: invokevirtual fqr.kec ()Lfqr;
      // 176: astore 12
      // 178: ldc2_w 0.014
      // 17b: dstore 14
      // 17d: aload 3
      // 17e: dup
      // 17f: getfield i2h.icv D
      // 182: aload 12
      // 184: getfield fqr.lvi D
      // 187: dload 14
      // 189: dmul
      // 18a: dadd
      // 18b: putfield i2h.icv D
      // 18e: aload 3
      // 18f: dup
      // 190: getfield i2h.mop D
      // 193: aload 12
      // 195: getfield fqr.gn5 D
      // 198: dload 14
      // 19a: dmul
      // 19b: dadd
      // 19c: putfield i2h.mop D
      // 19f: aload 3
      // 1a0: dup
      // 1a1: getfield i2h.bw4 D
      // 1a4: aload 12
      // 1a6: getfield fqr.bn2 D
      // 1a9: dload 14
      // 1ab: dmul
      // 1ac: dadd
      // 1ad: putfield i2h.bw4 D
      // 1b0: iload 11
      // 1b2: ireturn
   }

   public boolean _qv(nh4 var1, p3y var2) {
      int var4 = fe6.jqf(var1.rlc);
      int var5 = fe6.jqf(var1.t_2 + 1.0);
      int var10000 = b();
      int var6 = fe6.jqf(var1.bx_);
      int var7 = fe6.jqf(var1.i2c + 1.0);
      int var8 = fe6.jqf(var1.t8n);
      int var3 = var10000;
      int var9 = fe6.jqf(var1.oqj + 1.0);
      mew$mix var10 = new mew$mix();
      int var11 = var4;

      label51:
      while (true) {
         var10000 = var11;

         label48:
         while (var10000 < var5) {
            if (var3 == 0) {
               return (boolean)var6;
            }

            int var12 = var6;

            label45:
            while (var12 < var7) {
               var10000 = var8;
               if (var3 == 0) {
                  continue label48;
               }

               int var13 = var8;

               while (true) {
                  if (var13 < var9) {
                     try {
                        if (this.getBlockState(var10.bj0(var11, var12, var13)).r_y().p1r() == var2) {
                           return true;
                        }
                     } catch (oov var14) {
                        throw b(var14);
                     }

                     var13++;
                     if (var3 != 0) {
                        continue;
                     }
                  }

                  var12++;
                  if (var3 == 0) {
                     break label45;
                  }
                  break;
               }
            }

            var11++;
            if (var3 != 0) {
               continue label51;
            }
            break;
         }

         return (boolean)0;
      }
   }

   public boolean b8h(nh4 param1, p3y param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield nh4.rlc D
      // 004: invokestatic fe6.jqf (D)I
      // 007: istore 4
      // 009: aload 1
      // 00a: getfield nh4.t_2 D
      // 00d: dconst_1
      // 00e: dadd
      // 00f: invokestatic fe6.jqf (D)I
      // 012: istore 5
      // 014: aload 1
      // 015: getfield nh4.bx_ D
      // 018: invokestatic fe6.jqf (D)I
      // 01b: istore 6
      // 01d: invokestatic t9d.c ()I
      // 020: aload 1
      // 021: getfield nh4.i2c D
      // 024: dconst_1
      // 025: dadd
      // 026: invokestatic fe6.jqf (D)I
      // 029: istore 7
      // 02b: aload 1
      // 02c: getfield nh4.t8n D
      // 02f: invokestatic fe6.jqf (D)I
      // 032: istore 8
      // 034: aload 1
      // 035: getfield nh4.oqj D
      // 038: dconst_1
      // 039: dadd
      // 03a: invokestatic fe6.jqf (D)I
      // 03d: istore 9
      // 03f: new mew$mix
      // 042: dup
      // 043: invokespecial mew$mix.<init> ()V
      // 046: astore 10
      // 048: iload 4
      // 04a: istore 11
      // 04c: istore 3
      // 04d: iload 11
      // 04f: iload 5
      // 051: if_icmpge 111
      // 054: iload 6
      // 056: iload 3
      // 057: ifne 112
      // 05a: istore 12
      // 05c: iload 12
      // 05e: iload 7
      // 060: if_icmpge 10a
      // 063: iload 8
      // 065: iload 3
      // 066: ifne 04f
      // 069: istore 13
      // 06b: iload 13
      // 06d: iload 9
      // 06f: if_icmpge 103
      // 072: aload 0
      // 073: aload 10
      // 075: iload 11
      // 077: iload 12
      // 079: iload 13
      // 07b: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 07e: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 081: astore 14
      // 083: aload 14
      // 085: invokeinterface zfz.r_y ()Le0x; 1
      // 08a: astore 15
      // 08c: iload 3
      // 08d: ifne 106
      // 090: iload 3
      // 091: ifne 0ff
      // 094: goto 09b
      // 097: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09a: athrow
      // 09b: aload 15
      // 09d: invokevirtual e0x.p1r ()Lp3y;
      // 0a0: aload 2
      // 0a1: if_acmpne 0fc
      // 0a4: goto 0ab
      // 0a7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0aa: athrow
      // 0ab: aload 14
      // 0ad: getstatic hmv.nfg L_ku;
      // 0b0: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0b5: checkcast java/lang/Integer
      // 0b8: invokevirtual java/lang/Integer.intValue ()I
      // 0bb: istore 16
      // 0bd: iload 12
      // 0bf: bipush 1
      // 0c0: iadd
      // 0c1: i2d
      // 0c2: dstore 17
      // 0c4: iload 16
      // 0c6: iload 3
      // 0c7: ifne 0ec
      // 0ca: bipush 8
      // 0cc: if_icmpge 0e5
      // 0cf: goto 0d6
      // 0d2: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: iload 12
      // 0d8: bipush 1
      // 0d9: iadd
      // 0da: i2d
      // 0db: iload 16
      // 0dd: i2d
      // 0de: ldc2_w 8.0
      // 0e1: ddiv
      // 0e2: dsub
      // 0e3: dstore 17
      // 0e5: dload 17
      // 0e7: aload 1
      // 0e8: getfield nh4.bx_ D
      // 0eb: dcmpl
      // 0ec: iload 3
      // 0ed: ifne 0fb
      // 0f0: iflt 0fc
      // 0f3: goto 0fa
      // 0f6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: bipush 1
      // 0fb: ireturn
      // 0fc: iinc 13 1
      // 0ff: iload 3
      // 100: ifeq 06b
      // 103: iinc 12 1
      // 106: iload 3
      // 107: ifeq 05c
      // 10a: iinc 11 1
      // 10d: iload 3
      // 10e: ifeq 04d
      // 111: bipush 0
      // 112: ireturn
   }

   public vu6 s1r(i2h var1, double var2, double var4, double var6, float var8, boolean var9) {
      return this.dta(var1, var2, var4, var6, var8, false, var9);
   }

   public vu6 dta(i2h var1, double var2, double var4, double var6, float var8, boolean var9, boolean var10) {
      vu6 var11 = new vu6(this, var1, var2, var4, var6, var8, var9, var10);
      var11.zj7();
      var11.vw3(true);
      return var11;
   }

   public float ax6(fqr param1, nh4 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: dconst_1
      // 001: aload 2
      // 002: getfield nh4.t_2 D
      // 005: aload 2
      // 006: getfield nh4.rlc D
      // 009: dsub
      // 00a: ldc2_w 2.0
      // 00d: dmul
      // 00e: dconst_1
      // 00f: dadd
      // 010: ddiv
      // 011: dstore 4
      // 013: dconst_1
      // 014: aload 2
      // 015: getfield nh4.i2c D
      // 018: aload 2
      // 019: getfield nh4.bx_ D
      // 01c: dsub
      // 01d: ldc2_w 2.0
      // 020: dmul
      // 021: dconst_1
      // 022: dadd
      // 023: ddiv
      // 024: dstore 6
      // 026: dconst_1
      // 027: aload 2
      // 028: getfield nh4.oqj D
      // 02b: aload 2
      // 02c: getfield nh4.t8n D
      // 02f: dsub
      // 030: ldc2_w 2.0
      // 033: dmul
      // 034: dconst_1
      // 035: dadd
      // 036: ddiv
      // 037: dstore 8
      // 039: dconst_1
      // 03a: dconst_1
      // 03b: dload 4
      // 03d: ddiv
      // 03e: invokestatic java/lang/Math.floor (D)D
      // 041: dload 4
      // 043: dmul
      // 044: dsub
      // 045: ldc2_w 2.0
      // 048: ddiv
      // 049: dstore 10
      // 04b: invokestatic t9d.b ()I
      // 04e: dconst_1
      // 04f: dconst_1
      // 050: dload 8
      // 052: ddiv
      // 053: invokestatic java/lang/Math.floor (D)D
      // 056: dload 8
      // 058: dmul
      // 059: dsub
      // 05a: ldc2_w 2.0
      // 05d: ddiv
      // 05e: dstore 12
      // 060: istore 3
      // 061: dload 4
      // 063: dconst_0
      // 064: dcmpl
      // 065: iload 3
      // 066: ifeq 07e
      // 069: iflt 17a
      // 06c: goto 073
      // 06f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 072: athrow
      // 073: dload 6
      // 075: dconst_0
      // 076: dcmpl
      // 077: goto 07e
      // 07a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07d: athrow
      // 07e: iload 3
      // 07f: ifeq 097
      // 082: iflt 17a
      // 085: goto 08c
      // 088: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 08b: athrow
      // 08c: dload 8
      // 08e: dconst_0
      // 08f: dcmpl
      // 090: goto 097
      // 093: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: iload 3
      // 098: ifeq 0a6
      // 09b: iflt 17a
      // 09e: goto 0a5
      // 0a1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a4: athrow
      // 0a5: bipush 0
      // 0a6: istore 14
      // 0a8: bipush 0
      // 0a9: istore 15
      // 0ab: fconst_0
      // 0ac: fstore 16
      // 0ae: fload 16
      // 0b0: fconst_1
      // 0b1: fcmpg
      // 0b2: ifgt 172
      // 0b5: fconst_0
      // 0b6: iload 3
      // 0b7: ifeq 179
      // 0ba: fstore 17
      // 0bc: fload 17
      // 0be: fconst_1
      // 0bf: fcmpg
      // 0c0: ifgt 165
      // 0c3: fconst_0
      // 0c4: iload 3
      // 0c5: ifeq 16c
      // 0c8: fstore 18
      // 0ca: fload 18
      // 0cc: fconst_1
      // 0cd: fcmpg
      // 0ce: ifgt 158
      // 0d1: aload 2
      // 0d2: getfield nh4.rlc D
      // 0d5: aload 2
      // 0d6: getfield nh4.t_2 D
      // 0d9: aload 2
      // 0da: getfield nh4.rlc D
      // 0dd: dsub
      // 0de: fload 16
      // 0e0: f2d
      // 0e1: dmul
      // 0e2: dadd
      // 0e3: dstore 19
      // 0e5: aload 2
      // 0e6: getfield nh4.bx_ D
      // 0e9: aload 2
      // 0ea: getfield nh4.i2c D
      // 0ed: aload 2
      // 0ee: getfield nh4.bx_ D
      // 0f1: dsub
      // 0f2: fload 17
      // 0f4: f2d
      // 0f5: dmul
      // 0f6: dadd
      // 0f7: dstore 21
      // 0f9: aload 2
      // 0fa: getfield nh4.t8n D
      // 0fd: aload 2
      // 0fe: getfield nh4.oqj D
      // 101: aload 2
      // 102: getfield nh4.t8n D
      // 105: dsub
      // 106: fload 18
      // 108: f2d
      // 109: dmul
      // 10a: dadd
      // 10b: dstore 23
      // 10d: iload 3
      // 10e: ifeq 161
      // 111: iload 3
      // 112: ifeq 154
      // 115: goto 11c
      // 118: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11b: athrow
      // 11c: aload 0
      // 11d: new fqr
      // 120: dup
      // 121: dload 19
      // 123: dload 10
      // 125: dadd
      // 126: dload 21
      // 128: dload 23
      // 12a: dload 12
      // 12c: dadd
      // 12d: invokespecial fqr.<init> (DDD)V
      // 130: aload 1
      // 131: invokevirtual t9d.caq (Lfqr;Lfqr;)Lakm;
      // 134: ifnonnull 148
      // 137: goto 13e
      // 13a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13d: athrow
      // 13e: iinc 14 1
      // 141: goto 148
      // 144: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 147: athrow
      // 148: iinc 15 1
      // 14b: fload 18
      // 14d: f2d
      // 14e: dload 8
      // 150: dadd
      // 151: d2f
      // 152: fstore 18
      // 154: iload 3
      // 155: ifne 0ca
      // 158: fload 17
      // 15a: f2d
      // 15b: dload 6
      // 15d: dadd
      // 15e: d2f
      // 15f: fstore 17
      // 161: iload 3
      // 162: ifne 0bc
      // 165: fload 16
      // 167: f2d
      // 168: dload 4
      // 16a: dadd
      // 16b: d2f
      // 16c: fstore 16
      // 16e: iload 3
      // 16f: ifne 0ae
      // 172: iload 14
      // 174: i2f
      // 175: iload 15
      // 177: i2f
      // 178: fdiv
      // 179: freturn
      // 17a: fconst_0
      // 17b: freturn
   }

   public boolean igu(ha9 param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 4
      // 05: aload 2
      // 06: aload 3
      // 07: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0a: astore 2
      // 0b: aload 0
      // 0c: aload 2
      // 0d: iload 4
      // 0f: ifne 3a
      // 12: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 15: invokeinterface zfz.r_y ()Le0x; 1
      // 1a: getstatic ox_._0u Lwuo;
      // 1d: if_acmpne 40
      // 20: goto 27
      // 23: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: sipush 1004
      // 2c: aload 2
      // 2d: bipush 0
      // 2e: invokevirtual t9d.pbs (Lha9;ILmew;I)V
      // 31: aload 0
      // 32: aload 2
      // 33: goto 3a
      // 36: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: invokevirtual t9d.i6x (Lmew;)Z
      // 3d: pop
      // 3e: bipush 1
      // 3f: ireturn
      // 40: bipush 0
      // 41: ireturn
   }

   public String chr() {
      long var1 = c ^ 74650102242352L;
      return a<"g">(11685, 3512686990097028854L ^ var1) + this.guf.size();
   }

   public String n02() {
      return this.jro.y2l();
   }

   @Override
   public pyk getTileEntity(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 2
      // 004: aload 0
      // 005: aload 1
      // 006: invokespecial t9d.ji8 (Lmew;)Z
      // 009: ifne 012
      // 00c: aconst_null
      // 00d: areturn
      // 00e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 011: athrow
      // 012: aconst_null
      // 013: astore 3
      // 014: aload 0
      // 015: getfield t9d.vev Z
      // 018: iload 2
      // 019: ifeq 027
      // 01c: ifeq 08b
      // 01f: goto 026
      // 022: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: bipush 0
      // 027: istore 4
      // 029: iload 4
      // 02b: aload 0
      // 02c: getfield t9d.kkp Ljava/util/List;
      // 02f: invokeinterface java/util/List.size ()I 1
      // 034: if_icmpge 08b
      // 037: aload 0
      // 038: getfield t9d.kkp Ljava/util/List;
      // 03b: iload 4
      // 03d: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 042: checkcast pyk
      // 045: astore 5
      // 047: iload 2
      // 048: ifeq 088
      // 04b: aload 5
      // 04d: invokevirtual pyk.fyn ()Z
      // 050: ifne 085
      // 053: goto 05a
      // 056: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 059: athrow
      // 05a: aload 5
      // 05c: iload 2
      // 05d: ifeq 081
      // 060: goto 067
      // 063: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: invokevirtual pyk.y8_ ()Lmew;
      // 06a: aload 1
      // 06b: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 06e: ifeq 085
      // 071: goto 078
      // 074: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 077: athrow
      // 078: aload 5
      // 07a: goto 081
      // 07d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: astore 3
      // 082: goto 08b
      // 085: iinc 4 1
      // 088: goto 029
      // 08b: aload 3
      // 08c: iload 2
      // 08d: ifeq 0a8
      // 090: ifnonnull 0a7
      // 093: goto 09a
      // 096: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: aload 0
      // 09b: aload 1
      // 09c: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 09f: aload 1
      // 0a0: getstatic tts$cl0.sku Ltts$cl0;
      // 0a3: invokevirtual tts.y58 (Lmew;Ltts$cl0;)Lpyk;
      // 0a6: astore 3
      // 0a7: aload 3
      // 0a8: iload 2
      // 0a9: ifeq 130
      // 0ac: ifnonnull 12f
      // 0af: goto 0b6
      // 0b2: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b5: athrow
      // 0b6: bipush 0
      // 0b7: istore 4
      // 0b9: iload 4
      // 0bb: aload 0
      // 0bc: getfield t9d.kkp Ljava/util/List;
      // 0bf: invokeinterface java/util/List.size ()I 1
      // 0c4: if_icmpge 12f
      // 0c7: aload 0
      // 0c8: getfield t9d.kkp Ljava/util/List;
      // 0cb: iload 4
      // 0cd: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0d2: checkcast pyk
      // 0d5: astore 5
      // 0d7: iload 2
      // 0d8: ifeq 12b
      // 0db: aload 5
      // 0dd: iload 2
      // 0de: ifeq 130
      // 0e1: goto 0e8
      // 0e4: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e7: athrow
      // 0e8: invokevirtual pyk.fyn ()Z
      // 0eb: ifne 121
      // 0ee: goto 0f5
      // 0f1: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f4: athrow
      // 0f5: aload 5
      // 0f7: iload 2
      // 0f8: ifeq 11c
      // 0fb: goto 102
      // 0fe: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: invokevirtual pyk.y8_ ()Lmew;
      // 105: aload 1
      // 106: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 109: ifeq 121
      // 10c: goto 113
      // 10f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 112: athrow
      // 113: aload 5
      // 115: goto 11c
      // 118: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11b: athrow
      // 11c: astore 3
      // 11d: iload 2
      // 11e: ifne 12f
      // 121: iinc 4 1
      // 124: goto 12b
      // 127: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: iload 2
      // 12c: ifne 0b9
      // 12f: aload 3
      // 130: areturn
   }

   public void a_h(mew param1, pyk param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifeq 14
      // 09: ifnull bc
      // 0c: goto 13
      // 0f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12: athrow
      // 13: aload 2
      // 14: invokevirtual pyk.fyn ()Z
      // 17: iload 3
      // 18: ifeq 30
      // 1b: ifne bc
      // 1e: goto 25
      // 21: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: getfield t9d.vev Z
      // 29: goto 30
      // 2c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2f: athrow
      // 30: iload 3
      // 31: ifeq b1
      // 34: ifeq a5
      // 37: goto 3e
      // 3a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 2
      // 3f: aload 1
      // 40: invokevirtual pyk.xej (Lmew;)V
      // 43: aload 0
      // 44: getfield t9d.kkp Ljava/util/List;
      // 47: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 4c: astore 4
      // 4e: aload 4
      // 50: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 55: ifeq 96
      // 58: aload 4
      // 5a: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5f: checkcast pyk
      // 62: astore 5
      // 64: aload 5
      // 66: iload 3
      // 67: ifeq 88
      // 6a: invokevirtual pyk.y8_ ()Lmew;
      // 6d: aload 1
      // 6e: invokevirtual mew.equals (Ljava/lang/Object;)Z
      // 71: iload 3
      // 72: ifeq a0
      // 75: goto 7c
      // 78: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7b: athrow
      // 7c: ifeq 92
      // 7f: goto 86
      // 82: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 85: athrow
      // 86: aload 5
      // 88: invokevirtual pyk.whd ()V
      // 8b: aload 4
      // 8d: invokeinterface java/util/Iterator.remove ()V 1
      // 92: iload 3
      // 93: ifne 4e
      // 96: aload 0
      // 97: getfield t9d.kkp Ljava/util/List;
      // 9a: aload 2
      // 9b: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // a0: pop
      // a1: iload 3
      // a2: ifne bc
      // a5: aload 0
      // a6: aload 2
      // a7: invokevirtual t9d.qhm (Lpyk;)Z
      // aa: goto b1
      // ad: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: pop
      // b2: aload 0
      // b3: aload 1
      // b4: invokevirtual t9d.pxs (Lmew;)Ltts;
      // b7: aload 1
      // b8: aload 2
      // b9: invokevirtual tts.pus (Lmew;Lpyk;)V
      // bc: return
   }

   public void _jj(mew param1) {
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
      // 05: aload 1
      // 06: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifne 54
      // 0f: ifnull 4c
      // 12: goto 19
      // 15: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield t9d.vev Z
      // 1d: iload 2
      // 1e: ifne 47
      // 21: goto 28
      // 24: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: ifeq 4c
      // 2b: goto 32
      // 2e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31: athrow
      // 32: aload 3
      // 33: invokevirtual pyk.whd ()V
      // 36: aload 0
      // 37: getfield t9d.kkp Ljava/util/List;
      // 3a: aload 3
      // 3b: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 40: goto 47
      // 43: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 46: athrow
      // 47: pop
      // 48: iload 2
      // 49: ifeq 88
      // 4c: aload 3
      // 4d: goto 54
      // 50: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: ifnull 7f
      // 57: aload 0
      // 58: getfield t9d.kkp Ljava/util/List;
      // 5b: aload 3
      // 5c: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 61: pop
      // 62: aload 0
      // 63: getfield t9d.cn6 Ljava/util/List;
      // 66: aload 3
      // 67: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 6c: pop
      // 6d: aload 0
      // 6e: getfield t9d.nkv Ljava/util/List;
      // 71: aload 3
      // 72: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 77: pop
      // 78: goto 7f
      // 7b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7e: athrow
      // 7f: aload 0
      // 80: aload 1
      // 81: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 84: aload 1
      // 85: invokevirtual tts.aoo (Lmew;)V
      // 88: return
   }

   public void ejc(pyk var1) {
      this.u0w.add(var1);
   }

   public boolean zd3(mew var1) {
      zfz var3 = this.getBlockState(var1);
      int var10000 = c();
      nh4 var4 = var3.r_y().m__(this, var1, var3);
      int var2 = var10000;

      label33: {
         try {
            var7 = var4;
            if (var2 != 0) {
               break label33;
            }

            if (var4 == null) {
               return (boolean)0;
            }
         } catch (oov var6) {
            throw b(var6);
         }

         var7 = var4;
      }

      try {
         double var9;
         var10000 = (var9 = var7.liq() - 1.0) == 0.0 ? 0 : (var9 < 0.0 ? -1 : 1);
         if (var2 != 0) {
            return (boolean)var10000;
         }

         if (var10000 >= 0) {
            return (boolean)1;
         }
      } catch (oov var5) {
         throw b(var5);
      }

      return (boolean)0;
   }

   public static boolean r3_(m5n param0, mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 007: astore 3
      // 008: invokestatic t9d.b ()I
      // 00b: aload 3
      // 00c: invokeinterface zfz.r_y ()Le0x; 1
      // 011: astore 4
      // 013: istore 2
      // 014: aload 4
      // 016: invokevirtual e0x.p1r ()Lp3y;
      // 019: invokevirtual p3y.u4h ()Z
      // 01c: iload 2
      // 01d: ifeq 051
      // 020: ifeq 04c
      // 023: goto 02a
      // 026: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: aload 4
      // 02c: invokevirtual e0x.gck ()Z
      // 02f: iload 2
      // 030: ifeq 051
      // 033: goto 03a
      // 036: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 039: athrow
      // 03a: ifeq 04c
      // 03d: goto 044
      // 040: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: bipush 1
      // 045: goto 117
      // 048: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04b: athrow
      // 04c: aload 4
      // 04e: instanceof g7u
      // 051: iload 2
      // 052: ifeq 086
      // 055: ifeq 081
      // 058: goto 05f
      // 05b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05e: athrow
      // 05f: aload 3
      // 060: getstatic g7u.ru8 Lzb_;
      // 063: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 068: getstatic g7u$lrl.vvx Lg7u$lrl;
      // 06b: if_acmpne 07d
      // 06e: goto 075
      // 071: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: bipush 1
      // 076: goto 117
      // 079: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07c: athrow
      // 07d: bipush 0
      // 07e: goto 117
      // 081: aload 4
      // 083: instanceof izd
      // 086: iload 2
      // 087: ifeq 0bb
      // 08a: ifeq 0b6
      // 08d: goto 094
      // 090: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: aload 3
      // 095: getstatic izd._9x Lzb_;
      // 098: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 09d: getstatic izd$jc0.l7i Lizd$jc0;
      // 0a0: if_acmpne 0b2
      // 0a3: goto 0aa
      // 0a6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: bipush 1
      // 0ab: goto 117
      // 0ae: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b1: athrow
      // 0b2: bipush 0
      // 0b3: goto 117
      // 0b6: aload 4
      // 0b8: instanceof a4v
      // 0bb: iload 2
      // 0bc: ifeq 0d6
      // 0bf: ifeq 0d1
      // 0c2: goto 0c9
      // 0c5: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: bipush 1
      // 0ca: goto 117
      // 0cd: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: aload 4
      // 0d3: instanceof e7p
      // 0d6: iload 2
      // 0d7: ifeq 0fa
      // 0da: ifeq 116
      // 0dd: goto 0e4
      // 0e0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e3: athrow
      // 0e4: aload 3
      // 0e5: getstatic e7p.sxl L_ku;
      // 0e8: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0ed: checkcast java/lang/Integer
      // 0f0: invokevirtual java/lang/Integer.intValue ()I
      // 0f3: goto 0fa
      // 0f6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f9: athrow
      // 0fa: iload 2
      // 0fb: ifeq 113
      // 0fe: bipush 7
      // 100: if_icmpne 112
      // 103: goto 10a
      // 106: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 109: athrow
      // 10a: bipush 1
      // 10b: goto 117
      // 10e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: bipush 0
      // 113: goto 117
      // 116: bipush 0
      // 117: ireturn
   }

   public boolean h9u(mew param1, boolean param2) {
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
      // 05: iload 3
      // 06: ifne 1e
      // 09: aload 1
      // 0a: invokespecial t9d.ji8 (Lmew;)Z
      // 0d: ifne 1d
      // 10: goto 17
      // 13: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: iload 2
      // 18: ireturn
      // 19: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 0
      // 1e: getfield t9d.jro Lg6k;
      // 21: aload 1
      // 22: invokeinterface g6k.iqa (Lmew;)Ltts; 2
      // 27: astore 4
      // 29: aload 4
      // 2b: invokevirtual tts.col ()Z
      // 2e: iload 3
      // 2f: ifne 3d
      // 32: ifeq 3e
      // 35: goto 3c
      // 38: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: iload 2
      // 3d: ireturn
      // 3e: aload 0
      // 3f: aload 1
      // 40: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 43: invokeinterface zfz.r_y ()Le0x; 1
      // 48: astore 5
      // 4a: aload 5
      // 4c: invokevirtual e0x.p1r ()Lp3y;
      // 4f: invokevirtual p3y.u4h ()Z
      // 52: iload 3
      // 53: ifne 6c
      // 56: ifeq 7e
      // 59: goto 60
      // 5c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5f: athrow
      // 60: aload 5
      // 62: invokevirtual e0x.gck ()Z
      // 65: goto 6c
      // 68: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6b: athrow
      // 6c: iload 3
      // 6d: ifne 7b
      // 70: ifeq 7e
      // 73: goto 7a
      // 76: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 79: athrow
      // 7a: bipush 1
      // 7b: goto 7f
      // 7e: bipush 0
      // 7f: ireturn
   }

   public void lhz() {
      int var1 = this.vvh(1.0F);

      try {
         if (var1 != this.agl) {
            this.agl = var1;
         }
      } catch (oov var2) {
         throw b(var2);
      }
   }

   public void c5h(boolean var1, boolean var2) {
      this.gwn = var1;
      this.wdp = var2;
   }

   public void aoj() {
      this.hk_();
   }

   public void td1() {
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
      // 05: getfield t9d.t9z Lcog;
      // 08: invokevirtual cog.nys ()Z
      // 0b: iload 1
      // 0c: ifeq 37
      // 0f: ifeq 3f
      // 12: goto 19
      // 15: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 18: athrow
      // 19: aload 0
      // 1a: fconst_1
      // 1b: putfield t9d.wni F
      // 1e: aload 0
      // 1f: iload 1
      // 20: ifeq 3b
      // 23: goto 2a
      // 26: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 29: athrow
      // 2a: getfield t9d.t9z Lcog;
      // 2d: invokevirtual cog.h9q ()Z
      // 30: goto 37
      // 33: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: ifeq 3f
      // 3a: aload 0
      // 3b: fconst_1
      // 3c: putfield t9d.dqw F
      // 3f: return
   }

   public void hk_() {
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
      // 005: getfield t9d.vzz Lupn;
      // 008: invokevirtual upn.qyc ()Z
      // 00b: iload 1
      // 00c: ifne 024
      // 00f: ifne 2d0
      // 012: goto 019
      // 015: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 018: athrow
      // 019: aload 0
      // 01a: getfield t9d.v0f Z
      // 01d: goto 024
      // 020: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: iload 1
      // 025: ifne 040
      // 028: ifne 2d0
      // 02b: goto 032
      // 02e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 031: athrow
      // 032: aload 0
      // 033: getfield t9d.t9z Lcog;
      // 036: invokevirtual cog.fvu ()I
      // 039: goto 040
      // 03c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03f: athrow
      // 040: istore 2
      // 041: iload 2
      // 042: iload 1
      // 043: ifne 0ab
      // 046: ifle 0a4
      // 049: goto 050
      // 04c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04f: athrow
      // 050: iinc 2 -1
      // 053: aload 0
      // 054: getfield t9d.t9z Lcog;
      // 057: iload 2
      // 058: invokevirtual cog.rik (I)V
      // 05b: aload 0
      // 05c: getfield t9d.t9z Lcog;
      // 05f: aload 0
      // 060: getfield t9d.t9z Lcog;
      // 063: invokevirtual cog.h9q ()Z
      // 066: iload 1
      // 067: ifne 07c
      // 06a: goto 071
      // 06d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 070: athrow
      // 071: ifeq 07f
      // 074: goto 07b
      // 077: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: bipush 1
      // 07c: goto 080
      // 07f: bipush 2
      // 080: invokevirtual cog.zsa (I)V
      // 083: aload 0
      // 084: getfield t9d.t9z Lcog;
      // 087: aload 0
      // 088: getfield t9d.t9z Lcog;
      // 08b: invokevirtual cog.nys ()Z
      // 08e: iload 1
      // 08f: ifne 09d
      // 092: ifeq 0a0
      // 095: goto 09c
      // 098: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: bipush 1
      // 09d: goto 0a1
      // 0a0: bipush 2
      // 0a1: invokevirtual cog.o_f (I)V
      // 0a4: aload 0
      // 0a5: getfield t9d.t9z Lcog;
      // 0a8: invokevirtual cog.ruz ()I
      // 0ab: istore 3
      // 0ac: iload 3
      // 0ad: iload 1
      // 0ae: ifne 12a
      // 0b1: ifgt 117
      // 0b4: goto 0bb
      // 0b7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: aload 0
      // 0bc: getfield t9d.t9z Lcog;
      // 0bf: iload 1
      // 0c0: ifne 102
      // 0c3: goto 0ca
      // 0c6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: invokevirtual cog.h9q ()Z
      // 0cd: ifeq 0f7
      // 0d0: goto 0d7
      // 0d3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: getfield t9d.t9z Lcog;
      // 0db: aload 0
      // 0dc: getfield t9d.fsy Ljava/util/Random;
      // 0df: sipush 12000
      // 0e2: invokevirtual java/util/Random.nextInt (I)I
      // 0e5: sipush 3600
      // 0e8: iadd
      // 0e9: invokevirtual cog.zsa (I)V
      // 0ec: iload 1
      // 0ed: ifeq 160
      // 0f0: goto 0f7
      // 0f3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: getfield t9d.t9z Lcog;
      // 0fb: goto 102
      // 0fe: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 101: athrow
      // 102: aload 0
      // 103: getfield t9d.fsy Ljava/util/Random;
      // 106: ldc 168000
      // 108: nop
      // 109: invokevirtual java/util/Random.nextInt (I)I
      // 10c: sipush 12000
      // 10f: iadd
      // 110: invokevirtual cog.zsa (I)V
      // 113: iload 1
      // 114: ifeq 160
      // 117: iinc 3 -1
      // 11a: aload 0
      // 11b: getfield t9d.t9z Lcog;
      // 11e: iload 3
      // 11f: invokevirtual cog.zsa (I)V
      // 122: iload 3
      // 123: goto 12a
      // 126: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 129: athrow
      // 12a: iload 1
      // 12b: ifne 17a
      // 12e: ifgt 160
      // 131: goto 138
      // 134: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 137: athrow
      // 138: aload 0
      // 139: getfield t9d.t9z Lcog;
      // 13c: aload 0
      // 13d: getfield t9d.t9z Lcog;
      // 140: invokevirtual cog.h9q ()Z
      // 143: iload 1
      // 144: ifne 159
      // 147: goto 14e
      // 14a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14d: athrow
      // 14e: ifne 15c
      // 151: goto 158
      // 154: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: bipush 1
      // 159: goto 15d
      // 15c: bipush 0
      // 15d: invokevirtual cog.kcj (Z)V
      // 160: aload 0
      // 161: aload 0
      // 162: getfield t9d.dqw F
      // 165: putfield t9d.o2u F
      // 168: aload 0
      // 169: iload 1
      // 16a: ifne 19e
      // 16d: getfield t9d.t9z Lcog;
      // 170: invokevirtual cog.h9q ()Z
      // 173: goto 17a
      // 176: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 179: athrow
      // 17a: ifeq 196
      // 17d: aload 0
      // 17e: aload 0
      // 17f: getfield t9d.dqw F
      // 182: f2d
      // 183: ldc2_w 0.01
      // 186: dadd
      // 187: d2f
      // 188: putfield t9d.dqw F
      // 18b: iload 1
      // 18c: ifeq 1ab
      // 18f: goto 196
      // 192: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 195: athrow
      // 196: aload 0
      // 197: goto 19e
      // 19a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19d: athrow
      // 19e: aload 0
      // 19f: getfield t9d.dqw F
      // 1a2: f2d
      // 1a3: ldc2_w 0.01
      // 1a6: dsub
      // 1a7: d2f
      // 1a8: putfield t9d.dqw F
      // 1ab: aload 0
      // 1ac: aload 0
      // 1ad: getfield t9d.dqw F
      // 1b0: fconst_0
      // 1b1: fconst_1
      // 1b2: invokestatic fe6._f3 (FFF)F
      // 1b5: putfield t9d.dqw F
      // 1b8: aload 0
      // 1b9: getfield t9d.t9z Lcog;
      // 1bc: invokevirtual cog.yic ()I
      // 1bf: istore 4
      // 1c1: iload 4
      // 1c3: iload 1
      // 1c4: ifne 242
      // 1c7: ifgt 22d
      // 1ca: goto 1d1
      // 1cd: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1d0: athrow
      // 1d1: aload 0
      // 1d2: getfield t9d.t9z Lcog;
      // 1d5: iload 1
      // 1d6: ifne 218
      // 1d9: goto 1e0
      // 1dc: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1df: athrow
      // 1e0: invokevirtual cog.nys ()Z
      // 1e3: ifeq 20d
      // 1e6: goto 1ed
      // 1e9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: getfield t9d.t9z Lcog;
      // 1f1: aload 0
      // 1f2: getfield t9d.fsy Ljava/util/Random;
      // 1f5: sipush 12000
      // 1f8: invokevirtual java/util/Random.nextInt (I)I
      // 1fb: sipush 12000
      // 1fe: iadd
      // 1ff: invokevirtual cog.o_f (I)V
      // 202: iload 1
      // 203: ifeq 278
      // 206: goto 20d
      // 209: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20c: athrow
      // 20d: aload 0
      // 20e: getfield t9d.t9z Lcog;
      // 211: goto 218
      // 214: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 217: athrow
      // 218: aload 0
      // 219: getfield t9d.fsy Ljava/util/Random;
      // 21c: ldc 168000
      // 21e: nop
      // 21f: invokevirtual java/util/Random.nextInt (I)I
      // 222: sipush 12000
      // 225: iadd
      // 226: invokevirtual cog.o_f (I)V
      // 229: iload 1
      // 22a: ifeq 278
      // 22d: iinc 4 -1
      // 230: aload 0
      // 231: getfield t9d.t9z Lcog;
      // 234: iload 4
      // 236: invokevirtual cog.o_f (I)V
      // 239: iload 4
      // 23b: goto 242
      // 23e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 241: athrow
      // 242: iload 1
      // 243: ifne 292
      // 246: ifgt 278
      // 249: goto 250
      // 24c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24f: athrow
      // 250: aload 0
      // 251: getfield t9d.t9z Lcog;
      // 254: aload 0
      // 255: getfield t9d.t9z Lcog;
      // 258: invokevirtual cog.nys ()Z
      // 25b: iload 1
      // 25c: ifne 271
      // 25f: goto 266
      // 262: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 265: athrow
      // 266: ifne 274
      // 269: goto 270
      // 26c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26f: athrow
      // 270: bipush 1
      // 271: goto 275
      // 274: bipush 0
      // 275: invokevirtual cog.do3 (Z)V
      // 278: aload 0
      // 279: aload 0
      // 27a: getfield t9d.wni F
      // 27d: putfield t9d.n28 F
      // 280: aload 0
      // 281: iload 1
      // 282: ifne 2b6
      // 285: getfield t9d.t9z Lcog;
      // 288: invokevirtual cog.nys ()Z
      // 28b: goto 292
      // 28e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 291: athrow
      // 292: ifeq 2ae
      // 295: aload 0
      // 296: aload 0
      // 297: getfield t9d.wni F
      // 29a: f2d
      // 29b: ldc2_w 0.01
      // 29e: dadd
      // 29f: d2f
      // 2a0: putfield t9d.wni F
      // 2a3: iload 1
      // 2a4: ifeq 2c3
      // 2a7: goto 2ae
      // 2aa: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2ad: athrow
      // 2ae: aload 0
      // 2af: goto 2b6
      // 2b2: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b5: athrow
      // 2b6: aload 0
      // 2b7: getfield t9d.wni F
      // 2ba: f2d
      // 2bb: ldc2_w 0.01
      // 2be: dsub
      // 2bf: d2f
      // 2c0: putfield t9d.wni F
      // 2c3: aload 0
      // 2c4: aload 0
      // 2c5: getfield t9d.wni F
      // 2c8: fconst_0
      // 2c9: fconst_1
      // 2ca: invokestatic fe6._f3 (FFF)F
      // 2cd: putfield t9d.wni F
      // 2d0: return
   }

   public void imf() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic t9d.c J
      // 003: ldc2_w 59124212828269
      // 006: lxor
      // 007: lstore 1
      // 008: aload 0
      // 009: getfield t9d.auv Ljava/util/Set;
      // 00c: invokeinterface java/util/Set.clear ()V 1
      // 011: invokestatic t9d.b ()I
      // 014: aload 0
      // 015: getfield t9d.e8t Luan;
      // 018: sipush 30018
      // 01b: ldc2_w 2288476274568878679
      // 01e: lload 1
      // 01f: lxor
      // 020: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 025: nop
      // 026: invokevirtual uan.qek (Ljava/lang/String;)V
      // 029: istore 3
      // 02a: bipush 0
      // 02b: istore 4
      // 02d: iload 4
      // 02f: aload 0
      // 030: getfield t9d.rpk Ljava/util/List;
      // 033: invokeinterface java/util/List.size ()I 1
      // 038: if_icmpge 0c8
      // 03b: aload 0
      // 03c: getfield t9d.rpk Ljava/util/List;
      // 03f: iload 4
      // 041: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 046: checkcast ha9
      // 049: astore 5
      // 04b: aload 5
      // 04d: getfield ha9.o2v D
      // 050: ldc2_w 16.0
      // 053: ddiv
      // 054: invokestatic fe6.jqf (D)I
      // 057: istore 6
      // 059: aload 5
      // 05b: getfield ha9.vbd D
      // 05e: ldc2_w 16.0
      // 061: ddiv
      // 062: invokestatic fe6.jqf (D)I
      // 065: istore 7
      // 067: aload 0
      // 068: invokevirtual t9d._hl ()I
      // 06b: istore 8
      // 06d: iload 8
      // 06f: ineg
      // 070: iload 3
      // 071: ifeq 0d3
      // 074: istore 9
      // 076: iload 9
      // 078: iload 8
      // 07a: if_icmpgt 0c1
      // 07d: iload 8
      // 07f: ineg
      // 080: iload 3
      // 081: ifeq 02f
      // 084: istore 10
      // 086: iload 10
      // 088: iload 8
      // 08a: if_icmpgt 0ba
      // 08d: aload 0
      // 08e: getfield t9d.auv Ljava/util/Set;
      // 091: new h2f
      // 094: dup
      // 095: iload 9
      // 097: iload 6
      // 099: iadd
      // 09a: iload 10
      // 09c: iload 7
      // 09e: iadd
      // 09f: invokespecial h2f.<init> (II)V
      // 0a2: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 0a7: pop
      // 0a8: iinc 10 1
      // 0ab: iload 3
      // 0ac: ifeq 0bd
      // 0af: iload 3
      // 0b0: ifne 086
      // 0b3: goto 0ba
      // 0b6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: iinc 9 1
      // 0bd: iload 3
      // 0be: ifne 076
      // 0c1: iinc 4 1
      // 0c4: iload 3
      // 0c5: ifne 02d
      // 0c8: aload 0
      // 0c9: getfield t9d.e8t Luan;
      // 0cc: invokevirtual uan.uio ()V
      // 0cf: aload 0
      // 0d0: getfield t9d.qmd I
      // 0d3: iload 3
      // 0d4: ifeq 11b
      // 0d7: ifle 0f2
      // 0da: goto 0e1
      // 0dd: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: dup
      // 0e3: getfield t9d.qmd I
      // 0e6: bipush 1
      // 0e7: isub
      // 0e8: putfield t9d.qmd I
      // 0eb: goto 0f2
      // 0ee: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: getfield t9d.e8t Luan;
      // 0f6: sipush 21695
      // 0f9: ldc2_w 4953402895043197859
      // 0fc: lload 1
      // 0fd: lxor
      // 0fe: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 103: nop
      // 104: invokevirtual uan.qek (Ljava/lang/String;)V
      // 107: aload 0
      // 108: iload 3
      // 109: ifeq 195
      // 10c: getfield t9d.rpk Ljava/util/List;
      // 10f: invokeinterface java/util/List.isEmpty ()Z 1
      // 114: goto 11b
      // 117: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: ifne 194
      // 11e: aload 0
      // 11f: getfield t9d.fsy Ljava/util/Random;
      // 122: aload 0
      // 123: getfield t9d.rpk Ljava/util/List;
      // 126: invokeinterface java/util/List.size ()I 1
      // 12b: invokevirtual java/util/Random.nextInt (I)I
      // 12e: istore 4
      // 130: aload 0
      // 131: getfield t9d.rpk Ljava/util/List;
      // 134: iload 4
      // 136: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 13b: checkcast ha9
      // 13e: astore 5
      // 140: aload 5
      // 142: getfield ha9.o2v D
      // 145: invokestatic fe6.jqf (D)I
      // 148: aload 0
      // 149: getfield t9d.fsy Ljava/util/Random;
      // 14c: bipush 11
      // 14e: invokevirtual java/util/Random.nextInt (I)I
      // 151: iadd
      // 152: bipush 5
      // 153: isub
      // 154: istore 6
      // 156: aload 5
      // 158: getfield ha9.kfp D
      // 15b: invokestatic fe6.jqf (D)I
      // 15e: aload 0
      // 15f: getfield t9d.fsy Ljava/util/Random;
      // 162: bipush 11
      // 164: invokevirtual java/util/Random.nextInt (I)I
      // 167: iadd
      // 168: bipush 5
      // 169: isub
      // 16a: istore 7
      // 16c: aload 5
      // 16e: getfield ha9.vbd D
      // 171: invokestatic fe6.jqf (D)I
      // 174: aload 0
      // 175: getfield t9d.fsy Ljava/util/Random;
      // 178: bipush 11
      // 17a: invokevirtual java/util/Random.nextInt (I)I
      // 17d: iadd
      // 17e: bipush 5
      // 17f: isub
      // 180: istore 8
      // 182: aload 0
      // 183: new mew
      // 186: dup
      // 187: iload 6
      // 189: iload 7
      // 18b: iload 8
      // 18d: invokespecial mew.<init> (III)V
      // 190: invokevirtual t9d.so7 (Lmew;)Z
      // 193: pop
      // 194: aload 0
      // 195: getfield t9d.e8t Luan;
      // 198: invokevirtual uan.uio ()V
      // 19b: return
   }

   public abstract int _hl();

   public void ev3(int param1, int param2, tts param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic t9d.c J
      // 003: ldc2_w 46394975248233
      // 006: lxor
      // 007: lstore 4
      // 009: invokestatic t9d.b ()I
      // 00c: istore 6
      // 00e: aload 0
      // 00f: getfield t9d.e8t Luan;
      // 012: sipush 5262
      // 015: ldc2_w 3645678051577949342
      // 018: lload 4
      // 01a: lxor
      // 01b: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 020: nop
      // 021: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 024: aload 0
      // 025: iload 6
      // 027: ifeq 1ab
      // 02a: getfield t9d.qmd I
      // 02d: ifne 1aa
      // 030: goto 037
      // 033: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: aload 0
      // 038: iload 6
      // 03a: ifeq 1ab
      // 03d: goto 044
      // 040: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 043: athrow
      // 044: getfield t9d.v0f Z
      // 047: ifne 1aa
      // 04a: goto 051
      // 04d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 050: athrow
      // 051: aload 0
      // 052: aload 0
      // 053: getfield t9d.jf7 I
      // 056: bipush 3
      // 057: imul
      // 058: ldc 1013904223
      // 05a: nop
      // 05b: iadd
      // 05c: putfield t9d.jf7 I
      // 05f: aload 0
      // 060: getfield t9d.jf7 I
      // 063: bipush 2
      // 064: ishr
      // 065: istore 7
      // 067: iload 7
      // 069: bipush 15
      // 06b: iand
      // 06c: istore 8
      // 06e: iload 7
      // 070: bipush 8
      // 072: ishr
      // 073: bipush 15
      // 075: iand
      // 076: istore 9
      // 078: iload 7
      // 07a: bipush 16
      // 07c: ishr
      // 07d: sipush 255
      // 080: iand
      // 081: istore 10
      // 083: new mew
      // 086: dup
      // 087: iload 8
      // 089: iload 10
      // 08b: iload 9
      // 08d: invokespecial mew.<init> (III)V
      // 090: astore 11
      // 092: aload 3
      // 093: aload 11
      // 095: invokevirtual tts.mgt (Lmew;)Le0x;
      // 098: astore 12
      // 09a: iload 8
      // 09c: iload 1
      // 09d: iadd
      // 09e: istore 8
      // 0a0: iload 9
      // 0a2: iload 2
      // 0a3: iadd
      // 0a4: istore 9
      // 0a6: iload 6
      // 0a8: ifeq 1c4
      // 0ab: aload 12
      // 0ad: invokevirtual e0x.p1r ()Lp3y;
      // 0b0: getstatic p3y.cei Lp3y;
      // 0b3: if_acmpne 1aa
      // 0b6: goto 0bd
      // 0b9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0bc: athrow
      // 0bd: aload 0
      // 0be: iload 6
      // 0c0: ifeq 1ab
      // 0c3: goto 0ca
      // 0c6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c9: athrow
      // 0ca: aload 11
      // 0cc: invokevirtual t9d.a2f (Lmew;)I
      // 0cf: aload 0
      // 0d0: getfield t9d.fsy Ljava/util/Random;
      // 0d3: bipush 8
      // 0d5: invokevirtual java/util/Random.nextInt (I)I
      // 0d8: if_icmpgt 1aa
      // 0db: goto 0e2
      // 0de: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e1: athrow
      // 0e2: aload 0
      // 0e3: iload 6
      // 0e5: ifeq 1ab
      // 0e8: goto 0ef
      // 0eb: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ee: athrow
      // 0ef: getstatic qe5.sf9 Lqe5;
      // 0f2: aload 11
      // 0f4: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 0f7: ifgt 1aa
      // 0fa: goto 101
      // 0fd: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 100: athrow
      // 101: aload 0
      // 102: iload 8
      // 104: i2d
      // 105: ldc2_w 0.5
      // 108: dadd
      // 109: iload 10
      // 10b: i2d
      // 10c: ldc2_w 0.5
      // 10f: dadd
      // 110: iload 9
      // 112: i2d
      // 113: ldc2_w 0.5
      // 116: dadd
      // 117: ldc2_w 8.0
      // 11a: invokevirtual t9d.z3e (DDDD)Lha9;
      // 11d: astore 13
      // 11f: iload 6
      // 121: ifeq 1c4
      // 124: aload 13
      // 126: ifnull 1aa
      // 129: goto 130
      // 12c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12f: athrow
      // 130: aload 13
      // 132: iload 8
      // 134: i2d
      // 135: ldc2_w 0.5
      // 138: dadd
      // 139: iload 10
      // 13b: i2d
      // 13c: ldc2_w 0.5
      // 13f: dadd
      // 140: iload 9
      // 142: i2d
      // 143: ldc2_w 0.5
      // 146: dadd
      // 147: invokevirtual ha9.p53 (DDD)D
      // 14a: ldc2_w 4.0
      // 14d: dcmpl
      // 14e: ifle 1aa
      // 151: goto 158
      // 154: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 157: athrow
      // 158: aload 0
      // 159: iload 8
      // 15b: i2d
      // 15c: ldc2_w 0.5
      // 15f: dadd
      // 160: iload 10
      // 162: i2d
      // 163: ldc2_w 0.5
      // 166: dadd
      // 167: iload 9
      // 169: i2d
      // 16a: ldc2_w 0.5
      // 16d: dadd
      // 16e: bipush 99
      // 170: ldc2_w 3946685173510469744
      // 173: lload 4
      // 175: lxor
      // 176: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 17b: nop
      // 17c: ldc 0.7
      // 17e: nop
      // 17f: ldc 0.8
      // 181: nop
      // 182: aload 0
      // 183: getfield t9d.fsy Ljava/util/Random;
      // 186: invokevirtual java/util/Random.nextFloat ()F
      // 189: ldc 0.2
      // 18b: nop
      // 18c: fmul
      // 18d: fadd
      // 18e: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 191: aload 0
      // 192: aload 0
      // 193: getfield t9d.fsy Ljava/util/Random;
      // 196: sipush 12000
      // 199: invokevirtual java/util/Random.nextInt (I)I
      // 19c: sipush 6000
      // 19f: iadd
      // 1a0: putfield t9d.qmd I
      // 1a3: goto 1aa
      // 1a6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1a9: athrow
      // 1aa: aload 0
      // 1ab: getfield t9d.e8t Luan;
      // 1ae: sipush 27381
      // 1b1: ldc2_w 1205246747715637994
      // 1b4: lload 4
      // 1b6: lxor
      // 1b7: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1bc: nop
      // 1bd: invokevirtual uan.v2l (Ljava/lang/String;)V
      // 1c0: aload 3
      // 1c1: invokevirtual tts.i9o ()V
      // 1c4: return
   }

   public void b1d() {
      this.imf();
   }

   public void g0z(e0x var1, mew var2, Random var3) {
      this.mw3 = true;
      var1.zvy(this, var2, this.getBlockState(var2), var3);
      this.mw3 = false;
   }

   public boolean mjf(mew var1) {
      return this.vu0(var1, false);
   }

   public boolean hcn(mew var1) {
      return this.vu0(var1, true);
   }

   public boolean vu0(mew param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: invokevirtual t9d.getBiomeGenForCoords (Lmew;)Lgyu;
      // 005: astore 4
      // 007: invokestatic t9d.c ()I
      // 00a: aload 4
      // 00c: aload 1
      // 00d: invokevirtual gyu.qa6 (Lmew;)F
      // 010: fstore 5
      // 012: istore 3
      // 013: fload 5
      // 015: ldc 0.15
      // 017: nop
      // 018: fcmpl
      // 019: iload 3
      // 01a: ifne 031
      // 01d: ifle 02d
      // 020: goto 027
      // 023: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 026: athrow
      // 027: bipush 0
      // 028: ireturn
      // 029: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02c: athrow
      // 02d: aload 1
      // 02e: invokevirtual mew.getY ()I
      // 031: iload 3
      // 032: ifne 178
      // 035: iflt 177
      // 038: goto 03f
      // 03b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03e: athrow
      // 03f: aload 1
      // 040: invokevirtual mew.getY ()I
      // 043: iload 3
      // 044: ifne 178
      // 047: goto 04e
      // 04a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04d: athrow
      // 04e: sipush 256
      // 051: if_icmpge 177
      // 054: goto 05b
      // 057: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: aload 0
      // 05c: getstatic qe5.lm8 Lqe5;
      // 05f: aload 1
      // 060: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 063: iload 3
      // 064: ifne 178
      // 067: goto 06e
      // 06a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06d: athrow
      // 06e: bipush 10
      // 070: if_icmpge 177
      // 073: goto 07a
      // 076: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: aload 0
      // 07b: aload 1
      // 07c: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 07f: astore 6
      // 081: aload 6
      // 083: invokeinterface zfz.r_y ()Le0x; 1
      // 088: astore 7
      // 08a: aload 7
      // 08c: iload 3
      // 08d: ifne 0a6
      // 090: getstatic ox_.gdz Les2;
      // 093: if_acmpeq 0ac
      // 096: goto 09d
      // 099: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09c: athrow
      // 09d: aload 7
      // 09f: goto 0a6
      // 0a2: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a5: athrow
      // 0a6: getstatic ox_.whp L_13;
      // 0a9: if_acmpne 177
      // 0ac: aload 6
      // 0ae: getstatic hmv.nfg L_ku;
      // 0b1: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0b6: checkcast java/lang/Integer
      // 0b9: invokevirtual java/lang/Integer.intValue ()I
      // 0bc: iload 3
      // 0bd: ifne 178
      // 0c0: goto 0c7
      // 0c3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c6: athrow
      // 0c7: ifne 177
      // 0ca: goto 0d1
      // 0cd: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d0: athrow
      // 0d1: iload 2
      // 0d2: iload 3
      // 0d3: ifne 0f5
      // 0d6: goto 0dd
      // 0d9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0dc: athrow
      // 0dd: ifne 0ed
      // 0e0: goto 0e7
      // 0e3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: bipush 1
      // 0e8: ireturn
      // 0e9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ec: athrow
      // 0ed: aload 0
      // 0ee: aload 1
      // 0ef: invokevirtual mew.y8e ()Lmew;
      // 0f2: invokespecial t9d.vqc (Lmew;)Z
      // 0f5: iload 3
      // 0f6: ifne 112
      // 0f9: ifeq 15e
      // 0fc: goto 103
      // 0ff: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: aload 0
      // 104: aload 1
      // 105: invokevirtual mew.o_8 ()Lmew;
      // 108: invokespecial t9d.vqc (Lmew;)Z
      // 10b: goto 112
      // 10e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: iload 3
      // 113: ifne 12f
      // 116: ifeq 15e
      // 119: goto 120
      // 11c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11f: athrow
      // 120: aload 0
      // 121: aload 1
      // 122: invokevirtual mew.idu ()Lmew;
      // 125: invokespecial t9d.vqc (Lmew;)Z
      // 128: goto 12f
      // 12b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12e: athrow
      // 12f: iload 3
      // 130: ifne 14c
      // 133: ifeq 15e
      // 136: goto 13d
      // 139: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13c: athrow
      // 13d: aload 0
      // 13e: aload 1
      // 13f: invokevirtual mew.z6x ()Lmew;
      // 142: invokespecial t9d.vqc (Lmew;)Z
      // 145: goto 14c
      // 148: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14b: athrow
      // 14c: iload 3
      // 14d: ifne 15b
      // 150: ifeq 15e
      // 153: goto 15a
      // 156: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 159: athrow
      // 15a: bipush 1
      // 15b: goto 15f
      // 15e: bipush 0
      // 15f: istore 8
      // 161: iload 8
      // 163: iload 3
      // 164: ifne 178
      // 167: ifne 177
      // 16a: goto 171
      // 16d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: bipush 1
      // 172: ireturn
      // 173: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 176: athrow
      // 177: bipush 0
      // 178: ireturn
   }

   private boolean vqc(mew var1) {
      try {
         if (this.getBlockState(var1).r_y().p1r() == p3y.six) {
            return true;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return false;
   }

   public boolean l2a(mew param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual t9d.getBiomeGenForCoords (Lmew;)Lgyu;
      // 05: astore 4
      // 07: invokestatic t9d.b ()I
      // 0a: aload 4
      // 0c: aload 1
      // 0d: invokevirtual gyu.qa6 (Lmew;)F
      // 10: fstore 5
      // 12: istore 3
      // 13: fload 5
      // 15: ldc 0.15
      // 17: nop
      // 18: fcmpl
      // 19: iload 3
      // 1a: ifeq 2e
      // 1d: ifle 2d
      // 20: goto 27
      // 23: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: bipush 0
      // 28: ireturn
      // 29: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: iload 2
      // 2e: iload 3
      // 2f: ifeq 46
      // 32: ifne 42
      // 35: goto 3c
      // 38: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: bipush 1
      // 3d: ireturn
      // 3e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 1
      // 43: invokevirtual mew.getY ()I
      // 46: iload 3
      // 47: ifeq d5
      // 4a: iflt d4
      // 4d: goto 54
      // 50: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: aload 1
      // 55: invokevirtual mew.getY ()I
      // 58: iload 3
      // 59: ifeq d5
      // 5c: goto 63
      // 5f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: sipush 256
      // 66: if_icmpge d4
      // 69: goto 70
      // 6c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6f: athrow
      // 70: aload 0
      // 71: getstatic qe5.lm8 Lqe5;
      // 74: aload 1
      // 75: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 78: iload 3
      // 79: ifeq d5
      // 7c: goto 83
      // 7f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: bipush 10
      // 85: if_icmpge d4
      // 88: goto 8f
      // 8b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: aload 0
      // 90: aload 1
      // 91: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 94: invokeinterface zfz.r_y ()Le0x; 1
      // 99: astore 6
      // 9b: aload 6
      // 9d: iload 3
      // 9e: ifeq bb
      // a1: invokevirtual e0x.p1r ()Lp3y;
      // a4: getstatic p3y.cei Lp3y;
      // a7: if_acmpne d4
      // aa: goto b1
      // ad: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: getstatic ox_.dxo Le0x;
      // b4: goto bb
      // b7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ba: athrow
      // bb: aload 0
      // bc: aload 1
      // bd: invokevirtual e0x.ctq (Lt9d;Lmew;)Z
      // c0: iload 3
      // c1: ifeq d5
      // c4: ifeq d4
      // c7: goto ce
      // ca: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // cd: athrow
      // ce: bipush 1
      // cf: ireturn
      // d0: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d3: athrow
      // d4: bipush 0
      // d5: ireturn
   }

   public boolean so7(mew var1) {
      int var2 = c();
      boolean var3 = false;

      try {
         boolean var10000 = this.vzz.qyc();
         if (var2 != 0) {
            return var10000;
         }

         if (var10000) {
            return var3 | this.jie(qe5.lm8, var1);
         }
      } catch (oov var4) {
         throw b(var4);
      }

      var3 |= this.jie(qe5.sf9, var1);
      return var3 | this.jie(qe5.lm8, var1);
   }

   private int t3i(mew param1, qe5 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: aload 2
      // 005: getstatic qe5.sf9 Lqe5;
      // 008: if_acmpne 02c
      // 00b: aload 0
      // 00c: aload 1
      // 00d: iload 3
      // 00e: ifeq 02e
      // 011: goto 018
      // 014: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 017: athrow
      // 018: invokevirtual t9d.cfv (Lmew;)Z
      // 01b: ifeq 02c
      // 01e: goto 025
      // 021: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: bipush 15
      // 027: ireturn
      // 028: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02b: athrow
      // 02c: aload 0
      // 02d: aload 1
      // 02e: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 031: invokeinterface zfz.r_y ()Le0x; 1
      // 036: astore 4
      // 038: aload 2
      // 039: getstatic qe5.sf9 Lqe5;
      // 03c: if_acmpne 047
      // 03f: bipush 0
      // 040: goto 04c
      // 043: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 046: athrow
      // 047: aload 4
      // 049: invokevirtual e0x.ppt ()I
      // 04c: istore 5
      // 04e: aload 4
      // 050: invokevirtual e0x.uhw ()I
      // 053: istore 6
      // 055: iload 6
      // 057: bipush 15
      // 059: iload 3
      // 05a: ifeq 087
      // 05d: if_icmplt 084
      // 060: goto 067
      // 063: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 066: athrow
      // 067: aload 4
      // 069: invokevirtual e0x.ppt ()I
      // 06c: iload 3
      // 06d: ifeq 086
      // 070: goto 077
      // 073: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 076: athrow
      // 077: ifle 084
      // 07a: goto 081
      // 07d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 080: athrow
      // 081: bipush 1
      // 082: istore 6
      // 084: iload 6
      // 086: bipush 1
      // 087: iload 3
      // 088: ifeq 09c
      // 08b: if_icmpge 098
      // 08e: goto 095
      // 091: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 094: athrow
      // 095: bipush 1
      // 096: istore 6
      // 098: iload 6
      // 09a: bipush 15
      // 09c: iload 3
      // 09d: ifeq 0bf
      // 0a0: if_icmplt 0b0
      // 0a3: goto 0aa
      // 0a6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a9: athrow
      // 0aa: bipush 0
      // 0ab: ireturn
      // 0ac: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0af: athrow
      // 0b0: iload 5
      // 0b2: iload 3
      // 0b3: ifeq 0c4
      // 0b6: bipush 14
      // 0b8: goto 0bf
      // 0bb: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: if_icmplt 0c5
      // 0c2: iload 5
      // 0c4: ireturn
      // 0c5: invokestatic vt2.values ()[Lvt2;
      // 0c8: astore 7
      // 0ca: aload 7
      // 0cc: arraylength
      // 0cd: istore 8
      // 0cf: bipush 0
      // 0d0: istore 9
      // 0d2: iload 9
      // 0d4: iload 8
      // 0d6: if_icmpge 131
      // 0d9: aload 7
      // 0db: iload 9
      // 0dd: aaload
      // 0de: astore 10
      // 0e0: aload 1
      // 0e1: aload 10
      // 0e3: invokevirtual mew.offset (Lvt2;)Lmew;
      // 0e6: astore 11
      // 0e8: aload 0
      // 0e9: aload 2
      // 0ea: aload 11
      // 0ec: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 0ef: iload 6
      // 0f1: isub
      // 0f2: istore 12
      // 0f4: iload 12
      // 0f6: iload 3
      // 0f7: ifeq 133
      // 0fa: iload 5
      // 0fc: iload 3
      // 0fd: ifeq 124
      // 100: goto 107
      // 103: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 106: athrow
      // 107: if_icmple 115
      // 10a: goto 111
      // 10d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: iload 12
      // 113: istore 5
      // 115: iload 5
      // 117: iload 3
      // 118: ifeq 129
      // 11b: bipush 14
      // 11d: goto 124
      // 120: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 123: athrow
      // 124: if_icmplt 12a
      // 127: iload 5
      // 129: ireturn
      // 12a: iinc 9 1
      // 12d: iload 3
      // 12e: ifne 0d2
      // 131: iload 5
      // 133: ireturn
   }

   public boolean jie(qe5 param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic t9d.c J
      // 003: ldc2_w 7869970026853
      // 006: lxor
      // 007: lstore 3
      // 008: invokestatic t9d.b ()I
      // 00b: istore 5
      // 00d: aload 0
      // 00e: aload 2
      // 00f: bipush 17
      // 011: bipush 0
      // 012: invokevirtual t9d.xzt (Lmew;IZ)Z
      // 015: iload 5
      // 017: ifeq 02b
      // 01a: ifne 02a
      // 01d: goto 024
      // 020: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 023: athrow
      // 024: bipush 0
      // 025: ireturn
      // 026: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 029: athrow
      // 02a: bipush 0
      // 02b: istore 6
      // 02d: bipush 0
      // 02e: istore 7
      // 030: aload 0
      // 031: getfield t9d.e8t Luan;
      // 034: sipush 16720
      // 037: ldc2_w 3210726386915571565
      // 03a: lload 3
      // 03b: lxor
      // 03c: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 041: nop
      // 042: invokevirtual uan.qek (Ljava/lang/String;)V
      // 045: aload 0
      // 046: aload 1
      // 047: aload 2
      // 048: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 04b: istore 8
      // 04d: aload 0
      // 04e: aload 2
      // 04f: aload 1
      // 050: invokespecial t9d.t3i (Lmew;Lqe5;)I
      // 053: istore 9
      // 055: aload 2
      // 056: invokevirtual mew.getX ()I
      // 059: istore 10
      // 05b: aload 2
      // 05c: invokevirtual mew.getY ()I
      // 05f: istore 11
      // 061: aload 2
      // 062: invokevirtual mew.getZ ()I
      // 065: istore 12
      // 067: iload 9
      // 069: iload 8
      // 06b: iload 5
      // 06d: ifeq 09e
      // 070: if_icmple 093
      // 073: goto 07a
      // 076: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 079: athrow
      // 07a: aload 0
      // 07b: getfield t9d.z8m [I
      // 07e: iload 7
      // 080: iinc 7 1
      // 083: ldc 133152
      // 085: nop
      // 086: iastore
      // 087: iload 5
      // 089: ifne 26f
      // 08c: goto 093
      // 08f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 092: athrow
      // 093: iload 9
      // 095: iload 8
      // 097: goto 09e
      // 09a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09d: athrow
      // 09e: if_icmpge 26f
      // 0a1: aload 0
      // 0a2: getfield t9d.z8m [I
      // 0a5: iload 7
      // 0a7: iinc 7 1
      // 0aa: ldc 133152
      // 0ac: nop
      // 0ad: iload 8
      // 0af: bipush 18
      // 0b1: ishl
      // 0b2: ior
      // 0b3: iastore
      // 0b4: goto 0bb
      // 0b7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0ba: athrow
      // 0bb: iload 6
      // 0bd: iload 7
      // 0bf: if_icmpge 26c
      // 0c2: aload 0
      // 0c3: getfield t9d.z8m [I
      // 0c6: iload 6
      // 0c8: iinc 6 1
      // 0cb: iaload
      // 0cc: istore 13
      // 0ce: iload 13
      // 0d0: bipush 63
      // 0d2: iand
      // 0d3: bipush 32
      // 0d5: isub
      // 0d6: iload 10
      // 0d8: iadd
      // 0d9: istore 14
      // 0db: iload 13
      // 0dd: bipush 6
      // 0df: ishr
      // 0e0: bipush 63
      // 0e2: iand
      // 0e3: bipush 32
      // 0e5: isub
      // 0e6: iload 11
      // 0e8: iadd
      // 0e9: istore 15
      // 0eb: iload 13
      // 0ed: bipush 12
      // 0ef: ishr
      // 0f0: bipush 63
      // 0f2: iand
      // 0f3: bipush 32
      // 0f5: isub
      // 0f6: iload 12
      // 0f8: iadd
      // 0f9: istore 16
      // 0fb: iload 13
      // 0fd: bipush 18
      // 0ff: ishr
      // 100: bipush 15
      // 102: iand
      // 103: istore 17
      // 105: new mew
      // 108: dup
      // 109: iload 14
      // 10b: iload 15
      // 10d: iload 16
      // 10f: invokespecial mew.<init> (III)V
      // 112: astore 18
      // 114: aload 0
      // 115: aload 1
      // 116: aload 18
      // 118: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 11b: istore 19
      // 11d: iload 19
      // 11f: iload 5
      // 121: ifeq 14d
      // 124: iload 17
      // 126: iload 5
      // 128: ifeq 28f
      // 12b: goto 132
      // 12e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 131: athrow
      // 132: if_icmpne 267
      // 135: goto 13c
      // 138: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 13b: athrow
      // 13c: aload 0
      // 13d: aload 1
      // 13e: aload 18
      // 140: bipush 0
      // 141: invokevirtual t9d.lbt (Lqe5;Lmew;I)V
      // 144: iload 17
      // 146: goto 14d
      // 149: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14c: athrow
      // 14d: iload 5
      // 14f: ifeq 16b
      // 152: ifle 267
      // 155: goto 15c
      // 158: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15b: athrow
      // 15c: iload 14
      // 15e: iload 10
      // 160: isub
      // 161: invokestatic fe6.z1m (I)I
      // 164: goto 16b
      // 167: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16a: athrow
      // 16b: istore 20
      // 16d: iload 15
      // 16f: iload 11
      // 171: isub
      // 172: invokestatic fe6.z1m (I)I
      // 175: istore 21
      // 177: iload 16
      // 179: iload 12
      // 17b: isub
      // 17c: invokestatic fe6.z1m (I)I
      // 17f: istore 22
      // 181: iload 20
      // 183: iload 21
      // 185: iadd
      // 186: iload 22
      // 188: iadd
      // 189: bipush 17
      // 18b: if_icmpge 267
      // 18e: new mew$mix
      // 191: dup
      // 192: invokespecial mew$mix.<init> ()V
      // 195: astore 23
      // 197: invokestatic vt2.values ()[Lvt2;
      // 19a: astore 24
      // 19c: aload 24
      // 19e: arraylength
      // 19f: istore 25
      // 1a1: bipush 0
      // 1a2: istore 26
      // 1a4: iload 26
      // 1a6: iload 25
      // 1a8: if_icmpge 267
      // 1ab: aload 24
      // 1ad: iload 26
      // 1af: aaload
      // 1b0: astore 27
      // 1b2: iload 14
      // 1b4: aload 27
      // 1b6: invokevirtual vt2.n67 ()I
      // 1b9: iadd
      // 1ba: istore 28
      // 1bc: iload 15
      // 1be: aload 27
      // 1c0: invokevirtual vt2.g5t ()I
      // 1c3: iadd
      // 1c4: istore 29
      // 1c6: iload 16
      // 1c8: aload 27
      // 1ca: invokevirtual vt2.ozy ()I
      // 1cd: iadd
      // 1ce: istore 30
      // 1d0: aload 23
      // 1d2: iload 28
      // 1d4: iload 29
      // 1d6: iload 30
      // 1d8: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 1db: pop
      // 1dc: bipush 1
      // 1dd: aload 0
      // 1de: aload 23
      // 1e0: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 1e3: invokeinterface zfz.r_y ()Le0x; 1
      // 1e8: invokevirtual e0x.uhw ()I
      // 1eb: invokestatic java/lang/Math.max (II)I
      // 1ee: istore 31
      // 1f0: aload 0
      // 1f1: aload 1
      // 1f2: aload 23
      // 1f4: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 1f7: istore 19
      // 1f9: iload 5
      // 1fb: ifeq 262
      // 1fe: iload 19
      // 200: iload 17
      // 202: iload 31
      // 204: isub
      // 205: iload 5
      // 207: ifeq 0bf
      // 20a: goto 211
      // 20d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 210: athrow
      // 211: if_icmpne 25f
      // 214: iload 7
      // 216: aload 0
      // 217: getfield t9d.z8m [I
      // 21a: arraylength
      // 21b: if_icmpge 25f
      // 21e: goto 225
      // 221: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 224: athrow
      // 225: aload 0
      // 226: getfield t9d.z8m [I
      // 229: iload 7
      // 22b: iinc 7 1
      // 22e: iload 28
      // 230: iload 10
      // 232: isub
      // 233: bipush 32
      // 235: iadd
      // 236: iload 29
      // 238: iload 11
      // 23a: isub
      // 23b: bipush 32
      // 23d: iadd
      // 23e: bipush 6
      // 240: ishl
      // 241: ior
      // 242: iload 30
      // 244: iload 12
      // 246: isub
      // 247: bipush 32
      // 249: iadd
      // 24a: bipush 12
      // 24c: ishl
      // 24d: ior
      // 24e: iload 17
      // 250: iload 31
      // 252: isub
      // 253: bipush 18
      // 255: ishl
      // 256: ior
      // 257: iastore
      // 258: goto 25f
      // 25b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25e: athrow
      // 25f: iinc 26 1
      // 262: iload 5
      // 264: ifne 1a4
      // 267: iload 5
      // 269: ifne 0bb
      // 26c: bipush 0
      // 26d: istore 6
      // 26f: aload 0
      // 270: getfield t9d.e8t Luan;
      // 273: invokevirtual uan.uio ()V
      // 276: aload 0
      // 277: getfield t9d.e8t Luan;
      // 27a: sipush 22413
      // 27d: ldc2_w 7017581221700755871
      // 280: lload 3
      // 281: lxor
      // 282: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 287: nop
      // 288: invokevirtual uan.qek (Ljava/lang/String;)V
      // 28b: iload 6
      // 28d: iload 7
      // 28f: if_icmpge 584
      // 292: aload 0
      // 293: getfield t9d.z8m [I
      // 296: iload 6
      // 298: iinc 6 1
      // 29b: iaload
      // 29c: istore 13
      // 29e: iload 13
      // 2a0: bipush 63
      // 2a2: iand
      // 2a3: bipush 32
      // 2a5: isub
      // 2a6: iload 10
      // 2a8: iadd
      // 2a9: istore 14
      // 2ab: iload 13
      // 2ad: bipush 6
      // 2af: ishr
      // 2b0: bipush 63
      // 2b2: iand
      // 2b3: bipush 32
      // 2b5: isub
      // 2b6: iload 11
      // 2b8: iadd
      // 2b9: istore 15
      // 2bb: iload 13
      // 2bd: bipush 12
      // 2bf: ishr
      // 2c0: bipush 63
      // 2c2: iand
      // 2c3: bipush 32
      // 2c5: isub
      // 2c6: iload 12
      // 2c8: iadd
      // 2c9: istore 16
      // 2cb: new mew
      // 2ce: dup
      // 2cf: iload 14
      // 2d1: iload 15
      // 2d3: iload 16
      // 2d5: invokespecial mew.<init> (III)V
      // 2d8: astore 17
      // 2da: aload 0
      // 2db: aload 1
      // 2dc: aload 17
      // 2de: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 2e1: istore 18
      // 2e3: aload 0
      // 2e4: aload 17
      // 2e6: aload 1
      // 2e7: invokespecial t9d.t3i (Lmew;Lqe5;)I
      // 2ea: istore 19
      // 2ec: iload 19
      // 2ee: iload 5
      // 2f0: ifeq 58c
      // 2f3: iload 18
      // 2f5: iload 5
      // 2f7: ifeq 31f
      // 2fa: goto 301
      // 2fd: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 300: athrow
      // 301: if_icmpeq 57f
      // 304: goto 30b
      // 307: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30a: athrow
      // 30b: aload 0
      // 30c: aload 1
      // 30d: aload 17
      // 30f: iload 19
      // 311: invokevirtual t9d.lbt (Lqe5;Lmew;I)V
      // 314: iload 19
      // 316: iload 18
      // 318: goto 31f
      // 31b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 31e: athrow
      // 31f: iload 5
      // 321: ifeq 339
      // 324: if_icmple 57f
      // 327: goto 32e
      // 32a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32d: athrow
      // 32e: iload 14
      // 330: iload 10
      // 332: goto 339
      // 335: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 338: athrow
      // 339: isub
      // 33a: invokestatic java/lang/Math.abs (I)I
      // 33d: istore 20
      // 33f: iload 15
      // 341: iload 11
      // 343: isub
      // 344: invokestatic java/lang/Math.abs (I)I
      // 347: istore 21
      // 349: iload 16
      // 34b: iload 12
      // 34d: isub
      // 34e: invokestatic java/lang/Math.abs (I)I
      // 351: istore 22
      // 353: iload 7
      // 355: iload 5
      // 357: ifeq 374
      // 35a: aload 0
      // 35b: getfield t9d.z8m [I
      // 35e: arraylength
      // 35f: bipush 6
      // 361: isub
      // 362: if_icmpge 377
      // 365: goto 36c
      // 368: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36b: athrow
      // 36c: bipush 1
      // 36d: goto 374
      // 370: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 373: athrow
      // 374: goto 378
      // 377: bipush 0
      // 378: istore 23
      // 37a: iload 20
      // 37c: iload 21
      // 37e: iadd
      // 37f: iload 22
      // 381: iadd
      // 382: iload 5
      // 384: ifeq 39c
      // 387: bipush 17
      // 389: if_icmpge 57f
      // 38c: goto 393
      // 38f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 392: athrow
      // 393: iload 23
      // 395: goto 39c
      // 398: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39b: athrow
      // 39c: iload 5
      // 39e: ifeq 3bc
      // 3a1: ifeq 57f
      // 3a4: goto 3ab
      // 3a7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3aa: athrow
      // 3ab: aload 0
      // 3ac: aload 1
      // 3ad: aload 17
      // 3af: invokevirtual mew.y8e ()Lmew;
      // 3b2: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 3b5: goto 3bc
      // 3b8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3bb: athrow
      // 3bc: iload 19
      // 3be: iload 5
      // 3c0: ifeq 40c
      // 3c3: if_icmpge 400
      // 3c6: goto 3cd
      // 3c9: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3cc: athrow
      // 3cd: aload 0
      // 3ce: getfield t9d.z8m [I
      // 3d1: iload 7
      // 3d3: iinc 7 1
      // 3d6: iload 14
      // 3d8: bipush 1
      // 3d9: isub
      // 3da: iload 10
      // 3dc: isub
      // 3dd: bipush 32
      // 3df: iadd
      // 3e0: iload 15
      // 3e2: iload 11
      // 3e4: isub
      // 3e5: bipush 32
      // 3e7: iadd
      // 3e8: bipush 6
      // 3ea: ishl
      // 3eb: iadd
      // 3ec: iload 16
      // 3ee: iload 12
      // 3f0: isub
      // 3f1: bipush 32
      // 3f3: iadd
      // 3f4: bipush 12
      // 3f6: ishl
      // 3f7: iadd
      // 3f8: iastore
      // 3f9: goto 400
      // 3fc: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3ff: athrow
      // 400: aload 0
      // 401: aload 1
      // 402: aload 17
      // 404: invokevirtual mew.o_8 ()Lmew;
      // 407: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 40a: iload 19
      // 40c: iload 5
      // 40e: ifeq 45a
      // 411: if_icmpge 44e
      // 414: goto 41b
      // 417: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41a: athrow
      // 41b: aload 0
      // 41c: getfield t9d.z8m [I
      // 41f: iload 7
      // 421: iinc 7 1
      // 424: iload 14
      // 426: bipush 1
      // 427: iadd
      // 428: iload 10
      // 42a: isub
      // 42b: bipush 32
      // 42d: iadd
      // 42e: iload 15
      // 430: iload 11
      // 432: isub
      // 433: bipush 32
      // 435: iadd
      // 436: bipush 6
      // 438: ishl
      // 439: iadd
      // 43a: iload 16
      // 43c: iload 12
      // 43e: isub
      // 43f: bipush 32
      // 441: iadd
      // 442: bipush 12
      // 444: ishl
      // 445: iadd
      // 446: iastore
      // 447: goto 44e
      // 44a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44d: athrow
      // 44e: aload 0
      // 44f: aload 1
      // 450: aload 17
      // 452: invokevirtual mew.eve ()Lmew;
      // 455: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 458: iload 19
      // 45a: iload 5
      // 45c: ifeq 4a8
      // 45f: if_icmpge 49c
      // 462: goto 469
      // 465: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 468: athrow
      // 469: aload 0
      // 46a: getfield t9d.z8m [I
      // 46d: iload 7
      // 46f: iinc 7 1
      // 472: iload 14
      // 474: iload 10
      // 476: isub
      // 477: bipush 32
      // 479: iadd
      // 47a: iload 15
      // 47c: bipush 1
      // 47d: isub
      // 47e: iload 11
      // 480: isub
      // 481: bipush 32
      // 483: iadd
      // 484: bipush 6
      // 486: ishl
      // 487: iadd
      // 488: iload 16
      // 48a: iload 12
      // 48c: isub
      // 48d: bipush 32
      // 48f: iadd
      // 490: bipush 12
      // 492: ishl
      // 493: iadd
      // 494: iastore
      // 495: goto 49c
      // 498: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49b: athrow
      // 49c: aload 0
      // 49d: aload 1
      // 49e: aload 17
      // 4a0: invokevirtual mew.nuv ()Lmew;
      // 4a3: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 4a6: iload 19
      // 4a8: iload 5
      // 4aa: ifeq 4f6
      // 4ad: if_icmpge 4ea
      // 4b0: goto 4b7
      // 4b3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b6: athrow
      // 4b7: aload 0
      // 4b8: getfield t9d.z8m [I
      // 4bb: iload 7
      // 4bd: iinc 7 1
      // 4c0: iload 14
      // 4c2: iload 10
      // 4c4: isub
      // 4c5: bipush 32
      // 4c7: iadd
      // 4c8: iload 15
      // 4ca: bipush 1
      // 4cb: iadd
      // 4cc: iload 11
      // 4ce: isub
      // 4cf: bipush 32
      // 4d1: iadd
      // 4d2: bipush 6
      // 4d4: ishl
      // 4d5: iadd
      // 4d6: iload 16
      // 4d8: iload 12
      // 4da: isub
      // 4db: bipush 32
      // 4dd: iadd
      // 4de: bipush 12
      // 4e0: ishl
      // 4e1: iadd
      // 4e2: iastore
      // 4e3: goto 4ea
      // 4e6: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4e9: athrow
      // 4ea: aload 0
      // 4eb: aload 1
      // 4ec: aload 17
      // 4ee: invokevirtual mew.idu ()Lmew;
      // 4f1: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 4f4: iload 19
      // 4f6: iload 5
      // 4f8: ifeq 550
      // 4fb: if_icmpge 538
      // 4fe: goto 505
      // 501: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 504: athrow
      // 505: aload 0
      // 506: getfield t9d.z8m [I
      // 509: iload 7
      // 50b: iinc 7 1
      // 50e: iload 14
      // 510: iload 10
      // 512: isub
      // 513: bipush 32
      // 515: iadd
      // 516: iload 15
      // 518: iload 11
      // 51a: isub
      // 51b: bipush 32
      // 51d: iadd
      // 51e: bipush 6
      // 520: ishl
      // 521: iadd
      // 522: iload 16
      // 524: bipush 1
      // 525: isub
      // 526: iload 12
      // 528: isub
      // 529: bipush 32
      // 52b: iadd
      // 52c: bipush 12
      // 52e: ishl
      // 52f: iadd
      // 530: iastore
      // 531: goto 538
      // 534: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 537: athrow
      // 538: aload 0
      // 539: iload 5
      // 53b: ifeq 554
      // 53e: aload 1
      // 53f: aload 17
      // 541: invokevirtual mew.z6x ()Lmew;
      // 544: invokevirtual t9d.qkq (Lqe5;Lmew;)I
      // 547: iload 19
      // 549: goto 550
      // 54c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54f: athrow
      // 550: if_icmpge 57f
      // 553: aload 0
      // 554: getfield t9d.z8m [I
      // 557: iload 7
      // 559: iinc 7 1
      // 55c: iload 14
      // 55e: iload 10
      // 560: isub
      // 561: bipush 32
      // 563: iadd
      // 564: iload 15
      // 566: iload 11
      // 568: isub
      // 569: bipush 32
      // 56b: iadd
      // 56c: bipush 6
      // 56e: ishl
      // 56f: iadd
      // 570: iload 16
      // 572: bipush 1
      // 573: iadd
      // 574: iload 12
      // 576: isub
      // 577: bipush 32
      // 579: iadd
      // 57a: bipush 12
      // 57c: ishl
      // 57d: iadd
      // 57e: iastore
      // 57f: iload 5
      // 581: ifne 28b
      // 584: aload 0
      // 585: getfield t9d.e8t Luan;
      // 588: invokevirtual uan.uio ()V
      // 58b: bipush 1
      // 58c: ireturn
   }

   public boolean ud3(boolean var1) {
      return false;
   }

   public List n1l(tts var1, boolean var2) {
      return null;
   }

   public List m9p(yve var1, boolean var2) {
      return null;
   }

   public List p05(i2h var1, nh4 var2) {
      return this.sr2(var1, var2, k0_.t1f);
   }

   public List sr2(i2h var1, nh4 var2, Predicate var3) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = fe6.jqf((var2.rlc - 2.0) / 16.0);
      int var10000 = c();
      int var7 = fe6.jqf((var2.t_2 + 2.0) / 16.0);
      int var8 = fe6.jqf((var2.t8n - 2.0) / 16.0);
      int var4 = var10000;
      int var9 = fe6.jqf((var2.oqj + 2.0) / 16.0);
      int var10 = var6;

      label50:
      while (true) {
         var10000 = var10;

         label48:
         while (var10000 <= var7) {
            int var11 = var8;

            while (var11 <= var9) {
               label42: {
                  int var10001;
                  int var10002;
                  label41: {
                     try {
                        var15 = this;
                        var10001 = var10;
                        var10002 = var11;
                        if (var4 != 0) {
                           break label41;
                        }

                        var10000 = this.ivw(var10, var11, true);
                        if (var4 != 0) {
                           continue label48;
                        }
                     } catch (oov var13) {
                        throw b(var13);
                     }

                     try {
                        if (var10000 == 0) {
                           break label42;
                        }

                        var15 = this;
                        var10001 = var10;
                        var10002 = var11;
                     } catch (oov var12) {
                        throw b(var12);
                     }
                  }

                  var15.o5h(var10001, var10002).ett(var1, var2, var5, var3);
               }

               var11++;
               if (var4 != 0) {
                  break;
               }
            }

            var10++;
            if (var4 != 0) {
               return var5;
            }
            continue label50;
         }

         return var5;
      }
   }

   public List tt0(Class param1, Predicate param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 4
      // 05: invokestatic t9d.c ()I
      // 08: aload 0
      // 09: getfield t9d.guf Ljava/util/List;
      // 0c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11: astore 5
      // 13: istore 3
      // 14: aload 5
      // 16: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b: ifeq 73
      // 1e: aload 5
      // 20: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 25: checkcast i2h
      // 28: astore 6
      // 2a: aload 1
      // 2b: aload 6
      // 2d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 30: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 33: iload 3
      // 34: ifne 50
      // 37: ifeq 6f
      // 3a: goto 41
      // 3d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 2
      // 42: aload 6
      // 44: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 49: goto 50
      // 4c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: iload 3
      // 51: ifne 6e
      // 54: ifeq 6f
      // 57: goto 5e
      // 5a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 4
      // 60: aload 6
      // 62: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 67: goto 6e
      // 6a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: pop
      // 6f: iload 3
      // 70: ifeq 14
      // 73: aload 4
      // 75: areturn
   }

   public List nnw(Class param1, Predicate param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/google/common/collect/Lists.newArrayList ()Ljava/util/ArrayList;
      // 03: astore 4
      // 05: invokestatic t9d.b ()I
      // 08: aload 0
      // 09: getfield t9d.rpk Ljava/util/List;
      // 0c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 11: astore 5
      // 13: istore 3
      // 14: aload 5
      // 16: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 1b: ifeq 73
      // 1e: aload 5
      // 20: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 25: checkcast i2h
      // 28: astore 6
      // 2a: aload 1
      // 2b: aload 6
      // 2d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 30: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 33: iload 3
      // 34: ifeq 50
      // 37: ifeq 6f
      // 3a: goto 41
      // 3d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: aload 2
      // 42: aload 6
      // 44: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 49: goto 50
      // 4c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: iload 3
      // 51: ifeq 6e
      // 54: ifeq 6f
      // 57: goto 5e
      // 5a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: aload 4
      // 60: aload 6
      // 62: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 67: goto 6e
      // 6a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6d: athrow
      // 6e: pop
      // 6f: iload 3
      // 70: ifne 14
      // 73: aload 4
      // 75: areturn
   }

   public List m_z(Class var1, nh4 var2) {
      return this.vie(var1, var2, k0_.t1f);
   }

   public List vie(Class var1, nh4 var2, Predicate var3) {
      int var5 = fe6.jqf((var2.rlc - 2.0) / 16.0);
      int var10000 = b();
      int var6 = fe6.jqf((var2.t_2 + 2.0) / 16.0);
      int var4 = var10000;
      int var7 = fe6.jqf((var2.t8n - 2.0) / 16.0);
      int var8 = fe6.jqf((var2.oqj + 2.0) / 16.0);
      ArrayList var9 = Lists.newArrayList();
      int var10 = var5;

      label50:
      while (true) {
         var10000 = var10;

         label48:
         while (var10000 <= var6) {
            int var11 = var7;

            while (var11 <= var8) {
               label42: {
                  int var10001;
                  int var10002;
                  label41: {
                     try {
                        var15 = this;
                        var10001 = var10;
                        var10002 = var11;
                        if (var4 == 0) {
                           break label41;
                        }

                        var10000 = this.ivw(var10, var11, true);
                        if (var4 == 0) {
                           continue label48;
                        }
                     } catch (oov var13) {
                        throw b(var13);
                     }

                     try {
                        if (var10000 == 0) {
                           break label42;
                        }

                        var15 = this;
                        var10001 = var10;
                        var10002 = var11;
                     } catch (oov var12) {
                        throw b(var12);
                     }
                  }

                  var15.o5h(var10001, var10002).gtg(var1, var2, var9, var3);
               }

               var11++;
               if (var4 == 0) {
                  break;
               }
            }

            var10++;
            if (var4 == 0) {
               return var9;
            }
            continue label50;
         }

         return var9;
      }
   }

   public i2h xq6(Class param1, nh4 param2, i2h param3) {
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
      // 03: invokevirtual t9d.m_z (Ljava/lang/Class;Lnh4;)Ljava/util/List;
      // 06: astore 5
      // 08: aconst_null
      // 09: astore 6
      // 0b: invokestatic t9d.c ()I
      // 0e: ldc2_w 1.7976931348623157E308
      // 11: dstore 7
      // 13: istore 4
      // 15: bipush 0
      // 16: istore 9
      // 18: iload 9
      // 1a: aload 5
      // 1c: invokeinterface java/util/List.size ()I 1
      // 21: if_icmpge 90
      // 24: aload 5
      // 26: iload 9
      // 28: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 2d: checkcast i2h
      // 30: astore 10
      // 32: iload 4
      // 34: ifne 8b
      // 37: aload 10
      // 39: iload 4
      // 3b: ifne 92
      // 3e: goto 45
      // 41: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 3
      // 46: if_acmpeq 88
      // 49: goto 50
      // 4c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 53: aload 10
      // 55: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 5a: ifeq 88
      // 5d: goto 64
      // 60: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 63: athrow
      // 64: aload 3
      // 65: aload 10
      // 67: invokevirtual i2h.wxg (Li2h;)D
      // 6a: dstore 11
      // 6c: iload 4
      // 6e: ifne 8b
      // 71: dload 11
      // 73: dload 7
      // 75: dcmpg
      // 76: ifgt 88
      // 79: goto 80
      // 7c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: aload 10
      // 82: astore 6
      // 84: dload 11
      // 86: dstore 7
      // 88: iinc 9 1
      // 8b: iload 4
      // 8d: ifeq 18
      // 90: aload 6
      // 92: areturn
   }

   public i2h oks(int var1) {
      return (i2h)this.twi.ij8(var1);
   }

   public List xa0() {
      return this.guf;
   }

   public void xt0(mew param1, pyk param2) {
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
      // 07: ifeq 20
      // 0a: invokevirtual t9d.xjm (Lmew;)Z
      // 0d: ifeq 26
      // 10: goto 17
      // 13: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: aload 0
      // 18: aload 1
      // 19: goto 20
      // 1c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1f: athrow
      // 20: invokevirtual t9d.pxs (Lmew;)Ltts;
      // 23: invokevirtual tts.j0q ()V
      // 26: return
   }

   public int j_p(Class param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: invokestatic t9d.c ()I
      // 05: aload 0
      // 06: getfield t9d.guf Ljava/util/List;
      // 09: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 0e: astore 4
      // 10: istore 2
      // 11: aload 4
      // 13: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18: ifeq 7c
      // 1b: aload 4
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast i2h
      // 25: astore 5
      // 27: aload 5
      // 29: instanceof yqv
      // 2c: iload 2
      // 2d: ifne 7d
      // 30: iload 2
      // 31: ifne 72
      // 34: goto 3b
      // 37: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3a: athrow
      // 3b: ifeq 62
      // 3e: goto 45
      // 41: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: aload 5
      // 47: checkcast yqv
      // 4a: invokevirtual yqv.jx9 ()Z
      // 4d: iload 2
      // 4e: ifne 72
      // 51: goto 58
      // 54: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 57: athrow
      // 58: ifne 78
      // 5b: goto 62
      // 5e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: aload 1
      // 63: aload 5
      // 65: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 68: invokevirtual java/lang/Class.isAssignableFrom (Ljava/lang/Class;)Z
      // 6b: goto 72
      // 6e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 71: athrow
      // 72: ifeq 78
      // 75: iinc 3 1
      // 78: iload 2
      // 79: ifeq 11
      // 7c: iload 3
      // 7d: ireturn
   }

   public void iwd(Collection var1) {
      this.guf.addAll(var1);
      int var10000 = b();
      Iterator var3 = var1.iterator();
      int var2 = var10000;

      while (var3.hasNext()) {
         i2h var4 = (i2h)var3.next();
         this.m8m(var4);
         if (var2 == 0) {
            break;
         }
      }
   }

   public void q55(Collection var1) {
      this.idd.addAll(var1);
   }

   public boolean ask(e0x param1, mew param2, boolean param3, vt2 param4, i2h param5, erg param6) {
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
      // 06: aload 2
      // 07: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 0a: invokeinterface zfz.r_y ()Le0x; 1
      // 0f: astore 8
      // 11: iload 3
      // 12: ifeq 1d
      // 15: aconst_null
      // 16: goto 27
      // 19: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 0
      // 1f: aload 2
      // 20: aload 1
      // 21: invokevirtual e0x.l4i ()Lzfz;
      // 24: invokevirtual e0x.m__ (Lt9d;Lmew;Lzfz;)Lnh4;
      // 27: astore 9
      // 29: aload 9
      // 2b: ifnull 50
      // 2e: aload 0
      // 2f: aload 9
      // 31: aload 5
      // 33: invokevirtual t9d.g17 (Lnh4;Li2h;)Z
      // 36: iload 7
      // 38: ifne 4d
      // 3b: goto 42
      // 3e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: ifne 50
      // 45: goto 4c
      // 48: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: bipush 0
      // 4d: goto c5
      // 50: aload 8
      // 52: invokevirtual e0x.p1r ()Lp3y;
      // 55: iload 7
      // 57: ifne 8e
      // 5a: getstatic p3y.f20 Lp3y;
      // 5d: if_acmpne 89
      // 60: goto 67
      // 63: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: aload 1
      // 68: iload 7
      // 6a: ifne 8b
      // 6d: goto 74
      // 70: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 73: athrow
      // 74: getstatic ox_.g04 Le0x;
      // 77: if_acmpne 89
      // 7a: goto 81
      // 7d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 80: athrow
      // 81: bipush 1
      // 82: goto c5
      // 85: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: aload 8
      // 8b: invokevirtual e0x.p1r ()Lp3y;
      // 8e: invokevirtual p3y.gt9 ()Z
      // 91: iload 7
      // 93: ifne b1
      // 96: ifeq c4
      // 99: goto a0
      // 9c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9f: athrow
      // a0: aload 1
      // a1: aload 0
      // a2: aload 2
      // a3: aload 4
      // a5: aload 6
      // a7: invokevirtual e0x.hh2 (Lt9d;Lmew;Lvt2;Lerg;)Z
      // aa: goto b1
      // ad: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b0: athrow
      // b1: iload 7
      // b3: ifne c1
      // b6: ifeq c4
      // b9: goto c0
      // bc: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bf: athrow
      // c0: bipush 1
      // c1: goto c5
      // c4: bipush 0
      // c5: ireturn
   }

   public int _s3() {
      return this.jpl;
   }

   public void g5c(int var1) {
      this.jpl = var1;
   }

   @Override
   public int getStrongPower(mew var1, vt2 var2) {
      zfz var3 = this.getBlockState(var1);
      return var3.r_y().sqt(this, var1, var3, var2);
   }

   @Override
   public gxq getWorldType() {
      return this.t9z.z28();
   }

   public int w80(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: invokestatic t9d.c ()I
      // 05: iload 3
      // 06: aload 0
      // 07: aload 1
      // 08: invokevirtual mew.eve ()Lmew;
      // 0b: getstatic vt2.m3r Lvt2;
      // 0e: invokevirtual t9d.getStrongPower (Lmew;Lvt2;)I
      // 11: invokestatic java/lang/Math.max (II)I
      // 14: istore 3
      // 15: istore 2
      // 16: iload 3
      // 17: bipush 15
      // 19: iload 2
      // 1a: ifne 40
      // 1d: if_icmplt 2d
      // 20: goto 27
      // 23: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: iload 3
      // 28: ireturn
      // 29: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: iload 3
      // 2e: aload 0
      // 2f: aload 1
      // 30: invokevirtual mew.nuv ()Lmew;
      // 33: getstatic vt2.rf3 Lvt2;
      // 36: invokevirtual t9d.getStrongPower (Lmew;Lvt2;)I
      // 39: invokestatic java/lang/Math.max (II)I
      // 3c: istore 3
      // 3d: iload 3
      // 3e: bipush 15
      // 40: iload 2
      // 41: ifne 67
      // 44: if_icmplt 54
      // 47: goto 4e
      // 4a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4d: athrow
      // 4e: iload 3
      // 4f: ireturn
      // 50: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 53: athrow
      // 54: iload 3
      // 55: aload 0
      // 56: aload 1
      // 57: invokevirtual mew.idu ()Lmew;
      // 5a: getstatic vt2.z9q Lvt2;
      // 5d: invokevirtual t9d.getStrongPower (Lmew;Lvt2;)I
      // 60: invokestatic java/lang/Math.max (II)I
      // 63: istore 3
      // 64: iload 3
      // 65: bipush 15
      // 67: iload 2
      // 68: ifne 8e
      // 6b: if_icmplt 7b
      // 6e: goto 75
      // 71: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: iload 3
      // 76: ireturn
      // 77: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7a: athrow
      // 7b: iload 3
      // 7c: aload 0
      // 7d: aload 1
      // 7e: invokevirtual mew.z6x ()Lmew;
      // 81: getstatic vt2.mxp Lvt2;
      // 84: invokevirtual t9d.getStrongPower (Lmew;Lvt2;)I
      // 87: invokestatic java/lang/Math.max (II)I
      // 8a: istore 3
      // 8b: iload 3
      // 8c: bipush 15
      // 8e: iload 2
      // 8f: ifne b5
      // 92: if_icmplt a2
      // 95: goto 9c
      // 98: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9b: athrow
      // 9c: iload 3
      // 9d: ireturn
      // 9e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: iload 3
      // a3: aload 0
      // a4: aload 1
      // a5: invokevirtual mew.y8e ()Lmew;
      // a8: getstatic vt2.te4 Lvt2;
      // ab: invokevirtual t9d.getStrongPower (Lmew;Lvt2;)I
      // ae: invokestatic java/lang/Math.max (II)I
      // b1: istore 3
      // b2: iload 3
      // b3: bipush 15
      // b5: iload 2
      // b6: ifne e7
      // b9: if_icmplt c9
      // bc: goto c3
      // bf: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c2: athrow
      // c3: iload 3
      // c4: ireturn
      // c5: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c8: athrow
      // c9: iload 3
      // ca: aload 0
      // cb: aload 1
      // cc: invokevirtual mew.o_8 ()Lmew;
      // cf: getstatic vt2.zk4 Lvt2;
      // d2: invokevirtual t9d.getStrongPower (Lmew;Lvt2;)I
      // d5: invokestatic java/lang/Math.max (II)I
      // d8: istore 3
      // d9: iload 3
      // da: iload 2
      // db: ifne eb
      // de: bipush 15
      // e0: goto e7
      // e3: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e6: athrow
      // e7: if_icmplt ee
      // ea: iload 3
      // eb: goto ef
      // ee: iload 3
      // ef: ireturn
   }

   public boolean rjp(mew var1, vt2 var2) {
      int var3 = c();

      try {
         int var10000 = this.r90(var1, var2);
         if (var3 != 0) {
            return (boolean)var10000;
         }

         if (var10000 > 0) {
            return (boolean)1;
         }
      } catch (oov var4) {
         throw b(var4);
      }

      return (boolean)0;
   }

   public int r90(mew param1, vt2 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 05: astore 4
      // 07: invokestatic t9d.c ()I
      // 0a: aload 4
      // 0c: invokeinterface zfz.r_y ()Le0x; 1
      // 11: astore 5
      // 13: istore 3
      // 14: aload 5
      // 16: iload 3
      // 17: ifne 35
      // 1a: invokevirtual e0x.y0n ()Z
      // 1d: ifeq 33
      // 20: goto 27
      // 23: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: invokevirtual t9d.w80 (Lmew;)I
      // 2c: goto 3d
      // 2f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: aload 5
      // 35: aload 0
      // 36: aload 1
      // 37: aload 4
      // 39: aload 2
      // 3a: invokevirtual e0x.gpi (Lm5n;Lmew;Lzfz;Lvt2;)I
      // 3d: ireturn
   }

   public boolean gxo(mew param1) {
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
      // 05: aload 1
      // 06: invokevirtual mew.eve ()Lmew;
      // 09: getstatic vt2.m3r Lvt2;
      // 0c: invokevirtual t9d.r90 (Lmew;Lvt2;)I
      // 0f: iload 2
      // 10: ifne 30
      // 13: ifle 25
      // 16: goto 1d
      // 19: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto c7
      // 21: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: invokevirtual mew.nuv ()Lmew;
      // 2a: getstatic vt2.rf3 Lvt2;
      // 2d: invokevirtual t9d.r90 (Lmew;Lvt2;)I
      // 30: iload 2
      // 31: ifne 51
      // 34: ifle 46
      // 37: goto 3e
      // 3a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: bipush 1
      // 3f: goto c7
      // 42: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: aload 0
      // 47: aload 1
      // 48: invokevirtual mew.idu ()Lmew;
      // 4b: getstatic vt2.z9q Lvt2;
      // 4e: invokevirtual t9d.r90 (Lmew;Lvt2;)I
      // 51: iload 2
      // 52: ifne 72
      // 55: ifle 67
      // 58: goto 5f
      // 5b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: bipush 1
      // 60: goto c7
      // 63: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 66: athrow
      // 67: aload 0
      // 68: aload 1
      // 69: invokevirtual mew.z6x ()Lmew;
      // 6c: getstatic vt2.mxp Lvt2;
      // 6f: invokevirtual t9d.r90 (Lmew;Lvt2;)I
      // 72: iload 2
      // 73: ifne 93
      // 76: ifle 88
      // 79: goto 80
      // 7c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: bipush 1
      // 81: goto c7
      // 84: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: aload 0
      // 89: aload 1
      // 8a: invokevirtual mew.y8e ()Lmew;
      // 8d: getstatic vt2.te4 Lvt2;
      // 90: invokevirtual t9d.r90 (Lmew;Lvt2;)I
      // 93: iload 2
      // 94: ifne b4
      // 97: ifle a9
      // 9a: goto a1
      // 9d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: bipush 1
      // a2: goto c7
      // a5: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a8: athrow
      // a9: aload 0
      // aa: aload 1
      // ab: invokevirtual mew.o_8 ()Lmew;
      // ae: getstatic vt2.zk4 Lvt2;
      // b1: invokevirtual t9d.r90 (Lmew;Lvt2;)I
      // b4: iload 2
      // b5: ifne c3
      // b8: ifle c6
      // bb: goto c2
      // be: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c1: athrow
      // c2: bipush 1
      // c3: goto c7
      // c6: bipush 0
      // c7: ireturn
   }

   public int yi4(mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: invokestatic t9d.c ()I
      // 05: invokestatic vt2.values ()[Lvt2;
      // 08: astore 4
      // 0a: aload 4
      // 0c: arraylength
      // 0d: istore 5
      // 0f: bipush 0
      // 10: istore 6
      // 12: istore 2
      // 13: iload 6
      // 15: iload 5
      // 17: if_icmpge 6e
      // 1a: aload 4
      // 1c: iload 6
      // 1e: aaload
      // 1f: astore 7
      // 21: aload 0
      // 22: aload 1
      // 23: aload 7
      // 25: invokevirtual mew.offset (Lvt2;)Lmew;
      // 28: aload 7
      // 2a: invokevirtual t9d.r90 (Lmew;Lvt2;)I
      // 2d: istore 8
      // 2f: iload 8
      // 31: iload 2
      // 32: ifne 6f
      // 35: bipush 15
      // 37: iload 2
      // 38: ifne 61
      // 3b: goto 42
      // 3e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: if_icmplt 53
      // 45: goto 4c
      // 48: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: bipush 15
      // 4e: ireturn
      // 4f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 52: athrow
      // 53: iload 8
      // 55: iload 2
      // 56: ifne 66
      // 59: iload 3
      // 5a: goto 61
      // 5d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 60: athrow
      // 61: if_icmple 67
      // 64: iload 8
      // 66: istore 3
      // 67: iinc 6 1
      // 6a: iload 2
      // 6b: ifeq 13
      // 6e: iload 3
      // 6f: ireturn
   }

   public ha9 a_q(i2h var1, double var2) {
      return this.z3e(var1.o2v, var1.kfp, var1.vbd, var2);
   }

   public ha9 z3e(double param1, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w -1.0
      // 03: dstore 10
      // 05: invokestatic t9d.b ()I
      // 08: aconst_null
      // 09: astore 12
      // 0b: istore 9
      // 0d: bipush 0
      // 0e: istore 13
      // 10: iload 13
      // 12: aload 0
      // 13: getfield t9d.rpk Ljava/util/List;
      // 16: invokeinterface java/util/List.size ()I 1
      // 1b: if_icmpge d6
      // 1e: aload 0
      // 1f: getfield t9d.rpk Ljava/util/List;
      // 22: iload 13
      // 24: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 29: checkcast ha9
      // 2c: iload 9
      // 2e: ifeq d8
      // 31: astore 14
      // 33: iload 9
      // 35: ifeq d1
      // 38: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 3b: aload 14
      // 3d: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 42: ifeq ce
      // 45: goto 4c
      // 48: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 14
      // 4e: dload 1
      // 4f: dload 3
      // 50: dload 5
      // 52: invokevirtual ha9.p53 (DDD)D
      // 55: dstore 15
      // 57: dload 7
      // 59: dconst_0
      // 5a: dcmpg
      // 5b: iload 9
      // 5d: ifeq a1
      // 60: iflt 88
      // 63: goto 6a
      // 66: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 69: athrow
      // 6a: dload 15
      // 6c: dload 7
      // 6e: dload 7
      // 70: dmul
      // 71: dcmpg
      // 72: iload 9
      // 74: ifeq a1
      // 77: goto 7e
      // 7a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: ifge ce
      // 81: goto 88
      // 84: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 87: athrow
      // 88: dload 10
      // 8a: iload 9
      // 8c: ifeq c8
      // 8f: goto 96
      // 92: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 95: athrow
      // 96: ldc2_w -1.0
      // 99: dcmpl
      // 9a: goto a1
      // 9d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a0: athrow
      // a1: ifeq bf
      // a4: dload 15
      // a6: iload 9
      // a8: ifeq c8
      // ab: goto b2
      // ae: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1: athrow
      // b2: dload 10
      // b4: dcmpg
      // b5: ifge ce
      // b8: goto bf
      // bb: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // be: athrow
      // bf: dload 15
      // c1: goto c8
      // c4: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // c7: athrow
      // c8: dstore 10
      // ca: aload 14
      // cc: astore 12
      // ce: iinc 13 1
      // d1: iload 9
      // d3: ifne 10
      // d6: aload 12
      // d8: areturn
   }

   public boolean dig(double param1, double param3, double param5, double param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 9
      // 05: bipush 0
      // 06: istore 10
      // 08: iload 10
      // 0a: aload 0
      // 0b: getfield t9d.rpk Ljava/util/List;
      // 0e: invokeinterface java/util/List.size ()I 1
      // 13: if_icmpge 91
      // 16: aload 0
      // 17: getfield t9d.rpk Ljava/util/List;
      // 1a: iload 10
      // 1c: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 21: checkcast ha9
      // 24: astore 11
      // 26: iload 9
      // 28: ifne 8c
      // 2b: getstatic k0_.t1f Lcom/google/common/base/Predicate;
      // 2e: aload 11
      // 30: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 35: iload 9
      // 37: ifne 92
      // 3a: goto 41
      // 3d: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 40: athrow
      // 41: ifeq 89
      // 44: goto 4b
      // 47: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: aload 11
      // 4d: dload 1
      // 4e: dload 3
      // 4f: dload 5
      // 51: invokevirtual ha9.p53 (DDD)D
      // 54: dstore 12
      // 56: dload 7
      // 58: dconst_0
      // 59: dcmpg
      // 5a: iload 9
      // 5c: ifne 88
      // 5f: iflt 87
      // 62: goto 69
      // 65: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 68: athrow
      // 69: dload 12
      // 6b: dload 7
      // 6d: dload 7
      // 6f: dmul
      // 70: dcmpg
      // 71: iload 9
      // 73: ifne 88
      // 76: goto 7d
      // 79: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7c: athrow
      // 7d: ifge 89
      // 80: goto 87
      // 83: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 86: athrow
      // 87: bipush 1
      // 88: ireturn
      // 89: iinc 10 1
      // 8c: iload 9
      // 8e: ifeq 08
      // 91: bipush 0
      // 92: ireturn
   }

   public ha9 aev(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: aload 0
      // 08: getfield t9d.rpk Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge 47
      // 13: aload 0
      // 14: getfield t9d.rpk Ljava/util/List;
      // 17: iload 3
      // 18: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d: checkcast ha9
      // 20: astore 4
      // 22: iload 2
      // 23: ifne 43
      // 26: aload 1
      // 27: aload 4
      // 29: invokevirtual ha9.noc ()Ljava/lang/String;
      // 2c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2f: ifeq 40
      // 32: goto 39
      // 35: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 4
      // 3b: areturn
      // 3c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: iinc 3 1
      // 43: iload 2
      // 44: ifeq 06
      // 47: aconst_null
      // 48: areturn
   }

   public ha9 hlz(UUID param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: bipush 0
      // 05: istore 3
      // 06: iload 3
      // 07: aload 0
      // 08: getfield t9d.rpk Ljava/util/List;
      // 0b: invokeinterface java/util/List.size ()I 1
      // 10: if_icmpge 47
      // 13: aload 0
      // 14: getfield t9d.rpk Ljava/util/List;
      // 17: iload 3
      // 18: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 1d: checkcast ha9
      // 20: astore 4
      // 22: iload 2
      // 23: ifne 43
      // 26: aload 1
      // 27: aload 4
      // 29: invokevirtual ha9.b_q ()Ljava/util/UUID;
      // 2c: invokevirtual java/util/UUID.equals (Ljava/lang/Object;)Z
      // 2f: ifeq 40
      // 32: goto 39
      // 35: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 38: athrow
      // 39: aload 4
      // 3b: areturn
      // 3c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: iinc 3 1
      // 43: iload 2
      // 44: ifeq 06
      // 47: aconst_null
      // 48: areturn
   }

   public void ci8() {
   }

   public void f_u() {
      this.ujg.o17();
   }

   public void f1m(long var1) {
      this.t9z.ncq(var1);
   }

   public long x2p() {
      return this.t9z._oa();
   }

   public long p2b() {
      return this.t9z.zex();
   }

   public long bq8() {
      return this.t9z.y9w();
   }

   public void p7c(long var1) {
      this.t9z.l5d(var1);
   }

   public mew suq() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: new mew
      // 07: dup
      // 08: aload 0
      // 09: getfield t9d.t9z Lcog;
      // 0c: invokevirtual cog.c21 ()I
      // 0f: aload 0
      // 10: getfield t9d.t9z Lcog;
      // 13: invokevirtual cog._9h ()I
      // 16: aload 0
      // 17: getfield t9d.t9z Lcog;
      // 1a: invokevirtual cog.ans ()I
      // 1d: invokespecial mew.<init> (III)V
      // 20: astore 2
      // 21: aload 0
      // 22: iload 1
      // 23: ifne 3f
      // 26: invokevirtual t9d.fve ()Lw5i;
      // 29: aload 2
      // 2a: invokevirtual w5i.hka (Lmew;)Z
      // 2d: ifne 59
      // 30: goto 37
      // 33: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 36: athrow
      // 37: aload 0
      // 38: goto 3f
      // 3b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3e: athrow
      // 3f: new mew
      // 42: dup
      // 43: aload 0
      // 44: invokevirtual t9d.fve ()Lw5i;
      // 47: invokevirtual w5i.nf3 ()D
      // 4a: dconst_0
      // 4b: aload 0
      // 4c: invokevirtual t9d.fve ()Lw5i;
      // 4f: invokevirtual w5i.ad0 ()D
      // 52: invokespecial mew.<init> (DDD)V
      // 55: invokevirtual t9d.p9y (Lmew;)Lmew;
      // 58: astore 2
      // 59: aload 2
      // 5a: areturn
   }

   public void spu(mew var1) {
      this.t9z.d2x(var1);
   }

   public void t73(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getfield i2h.o2v D
      // 04: ldc2_w 16.0
      // 07: ddiv
      // 08: invokestatic fe6.jqf (D)I
      // 0b: istore 3
      // 0c: invokestatic t9d.c ()I
      // 0f: aload 1
      // 10: getfield i2h.vbd D
      // 13: ldc2_w 16.0
      // 16: ddiv
      // 17: invokestatic fe6.jqf (D)I
      // 1a: istore 4
      // 1c: istore 2
      // 1d: bipush 2
      // 1e: istore 5
      // 20: iload 3
      // 21: iload 5
      // 23: isub
      // 24: istore 6
      // 26: iload 6
      // 28: iload 3
      // 29: iload 5
      // 2b: iadd
      // 2c: if_icmpgt 66
      // 2f: iload 4
      // 31: iload 5
      // 33: isub
      // 34: iload 2
      // 35: ifne 70
      // 38: istore 7
      // 3a: iload 7
      // 3c: iload 4
      // 3e: iload 5
      // 40: iadd
      // 41: if_icmpgt 5f
      // 44: aload 0
      // 45: iload 6
      // 47: iload 7
      // 49: invokevirtual t9d.o5h (II)Ltts;
      // 4c: pop
      // 4d: iinc 7 1
      // 50: iload 2
      // 51: ifne 62
      // 54: iload 2
      // 55: ifeq 3a
      // 58: goto 5f
      // 5b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5e: athrow
      // 5f: iinc 6 1
      // 62: iload 2
      // 63: ifeq 26
      // 66: aload 0
      // 67: getfield t9d.guf Ljava/util/List;
      // 6a: aload 1
      // 6b: invokeinterface java/util/List.contains (Ljava/lang/Object;)Z 2
      // 70: iload 2
      // 71: ifne 8f
      // 74: ifne 90
      // 77: goto 7e
      // 7a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7d: athrow
      // 7e: aload 0
      // 7f: getfield t9d.guf Ljava/util/List;
      // 82: aload 1
      // 83: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 88: goto 8f
      // 8b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8e: athrow
      // 8f: pop
      // 90: return
   }

   public boolean q2p(ha9 var1, mew var2) {
      return true;
   }

   public void qyn(i2h var1, byte var2) {
   }

   public g6k sj7() {
      return this.jro;
   }

   public void dfj(mew var1, e0x var2, int var3, int var4) {
      var2.ng5(this, var1, this.getBlockState(var1), var3, var4);
   }

   public he6 b4z() {
      return this.ujg;
   }

   public cog r7d() {
      return this.t9z;
   }

   public ef9 eir() {
      return this.t9z.jwd();
   }

   public void vz4() {
   }

   public float fnm(float var1) {
      return (this.o2u + (this.dqw - this.o2u) * var1) * this.bne(var1);
   }

   public void wmg(float var1) {
      this.o2u = var1;
      this.dqw = var1;
   }

   public float bne(float var1) {
      return this.n28 + (this.wni - this.n28) * var1;
   }

   public void cbc(float var1) {
      this.n28 = var1;
      this.wni = var1;
   }

   public boolean aq0() {
      int var1 = c();

      try {
         double var3;
         int var10000 = (var3 = (double)this.fnm(1.0F) - 0.9) == 0.0 ? 0 : (var3 < 0.0 ? -1 : 1);
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

   public boolean xqu() {
      int var1 = c();

      try {
         double var3;
         int var10000 = (var3 = (double)this.bne(1.0F) - 0.2) == 0.0 ? 0 : (var3 < 0.0 ? -1 : 1);
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

   public boolean eyz(mew param1) {
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
      // 05: invokevirtual t9d.xqu ()Z
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: aload 1
      // 1e: invokevirtual t9d.cfv (Lmew;)Z
      // 21: iload 2
      // 22: ifne 48
      // 25: ifne 35
      // 28: goto 2f
      // 2b: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: bipush 0
      // 30: ireturn
      // 31: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: iload 2
      // 38: ifne 57
      // 3b: invokevirtual t9d.k62 (Lmew;)Lmew;
      // 3e: invokevirtual mew.getY ()I
      // 41: goto 48
      // 44: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: aload 1
      // 49: invokevirtual mew.getY ()I
      // 4c: if_icmple 55
      // 4f: bipush 0
      // 50: ireturn
      // 51: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 54: athrow
      // 55: aload 0
      // 56: aload 1
      // 57: invokevirtual t9d.getBiomeGenForCoords (Lmew;)Lgyu;
      // 5a: astore 3
      // 5b: aload 3
      // 5c: invokevirtual gyu.o0o ()Z
      // 5f: iload 2
      // 60: ifne 7b
      // 63: ifeq 75
      // 66: goto 6d
      // 69: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6c: athrow
      // 6d: bipush 0
      // 6e: goto 91
      // 71: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 74: athrow
      // 75: aload 0
      // 76: aload 1
      // 77: bipush 0
      // 78: invokevirtual t9d.l2a (Lmew;Z)Z
      // 7b: iload 2
      // 7c: ifne 8a
      // 7f: ifeq 8d
      // 82: goto 89
      // 85: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: bipush 0
      // 8a: goto 91
      // 8d: aload 3
      // 8e: invokevirtual gyu.ziq ()Z
      // 91: ireturn
   }

   public boolean u_f(mew var1) {
      gyu var2 = this.getBiomeGenForCoords(var1);
      return var2.dl5();
   }

   public _ie pjw() {
      return this.hqr;
   }

   public void m5k(String var1, wob var2) {
      this.hqr.vex(var1, var2);
   }

   public wob hyf(Class var1, String var2) {
      return this.hqr.ym5(var1, var2);
   }

   public int xbc(String var1) {
      return this.hqr.hv3(var1);
   }

   public void jpe(int var1, mew var2, int var3) {
      int var4 = b();
      int var5 = 0;

      while (var5 < this.z5f.size()) {
         ((u60)this.z5f.get(var5)).a60(var1, var2, var3);
         var5++;
         if (var4 == 0) {
            break;
         }
      }
   }

   public void qca(int var1, mew var2, int var3) {
      this.pbs((ha9)null, var1, var2, var3);
   }

   public void pbs(ha9 var1, int var2, mew var3, int var4) {
      long var5 = c ^ 39481774506166L;
      int var7 = b();

      try {
         int var8 = 0;

         while (var8 < this.z5f.size()) {
            try {
               ((u60)this.z5f.get(var8)).ifl(var1, var2, var3, var4);
               var8++;
               if (var7 == 0 || var7 == 0) {
                  break;
               }
            } catch (Throwable var11) {
               throw b(var11);
            }
         }
      } catch (Throwable var12) {
         e1i var9 = e1i.cor(var12, a<"g">(30823, 4842163560615436207L ^ var5));
         wsc var10 = var9.i_r(a<"g">(28052, 2744839360383601231L ^ var5));
         var10._0p(a<"g">(29974, 2245640316125434566L ^ var5), wsc.ffw(var3));
         var10._0p(a<"g">(22435, 892841295530193020L ^ var5), var1);
         var10._0p(a<"g">(27070, 6121595268662120060L ^ var5), var2);
         var10._0p(a<"g">(32126, 7885774387636296365L ^ var5), var4);
         throw new oov(var9);
      }
   }

   public int _1d() {
      return 256;
   }

   public int yqy() {
      int var1 = c();

      try {
         byte var10000 = this.vzz.qyc();
         if (var1 != 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 128;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return 256;
   }

   public Random v1h(int var1, int var2, int var3) {
      long var4 = (long)var1 * 341873128712L + (long)var2 * 132897987541L + this.r7d()._oa() + (long)var3;
      this.fsy.setSeed(var4);
      return this.fsy;
   }

   public mew vj_(String var1, mew var2) {
      return this.sj7().epl(this, var1, var2);
   }

   @Override
   public boolean extendedLevelsInChunkCache() {
      return false;
   }

   public double ss4() {
      try {
         if (zwr.l0l.g7m()) {
            return 0.0;
         }
      } catch (oov var1) {
         throw b(var1);
      }

      try {
         if (this.t9z.z28() == gxq.itf) {
            return 0.0;
         }
      } catch (oov var2) {
         throw b(var2);
      }

      return 63.0;
   }

   public wsc utr(e1i param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic t9d.c J
      // 03: ldc2_w 11698690062877
      // 06: lxor
      // 07: lstore 2
      // 08: invokestatic t9d.c ()I
      // 0b: istore 4
      // 0d: aload 1
      // 0e: sipush 27326
      // 11: ldc2_w 8697693144063522763
      // 14: lload 2
      // 15: lxor
      // 16: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 1b: nop
      // 1c: bipush 1
      // 1d: invokevirtual e1i.fiy (Ljava/lang/String;I)Lwsc;
      // 20: astore 5
      // 22: aload 5
      // 24: sipush 10876
      // 27: ldc2_w 7523190996829697850
      // 2a: lload 2
      // 2b: lxor
      // 2c: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 31: nop
      // 32: aload 0
      // 33: getfield t9d.t9z Lcog;
      // 36: iload 4
      // 38: ifne 5e
      // 3b: ifnonnull 5a
      // 3e: goto 45
      // 41: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 44: athrow
      // 45: sipush 6200
      // 48: ldc2_w 8866602072244733306
      // 4b: lload 2
      // 4c: lxor
      // 4d: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 52: nop
      // 53: goto 61
      // 56: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 59: athrow
      // 5a: aload 0
      // 5b: getfield t9d.t9z Lcog;
      // 5e: invokevirtual cog.fln ()Ljava/lang/String;
      // 61: invokevirtual wsc._0p (Ljava/lang/String;Ljava/lang/Object;)V
      // 64: aload 5
      // 66: sipush 7227
      // 69: ldc2_w 3287092195777266038
      // 6c: lload 2
      // 6d: lxor
      // 6e: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 73: nop
      // 74: new t9d$3
      // 77: dup
      // 78: aload 0
      // 79: invokespecial t9d$3.<init> (Lt9d;)V
      // 7c: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 7f: aload 5
      // 81: sipush 19803
      // 84: ldc2_w 1942744297725169702
      // 87: lload 2
      // 88: lxor
      // 89: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 8e: nop
      // 8f: new t9d$4
      // 92: dup
      // 93: aload 0
      // 94: invokespecial t9d$4.<init> (Lt9d;)V
      // 97: invokevirtual wsc.h1o (Ljava/lang/String;Ljava/util/concurrent/Callable;)V
      // 9a: aload 0
      // 9b: getfield t9d.t9z Lcog;
      // 9e: aload 5
      // a0: invokevirtual cog.e4o (Lwsc;)V
      // a3: goto bd
      // a6: astore 6
      // a8: aload 5
      // aa: sipush 3089
      // ad: ldc2_w 2026547280468136319
      // b0: lload 2
      // b1: lxor
      // b2: invokedynamic g (IJ)Ljava/lang/String; bsm=t9d.a (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // b7: nop
      // b8: aload 6
      // ba: invokevirtual wsc.a5o (Ljava/lang/String;Ljava/lang/Throwable;)V
      // bd: aload 5
      // bf: areturn
   }

   public void vn_(int var1, mew var2, int var3) {
      int var4 = b();
      int var5 = 0;

      while (var5 < this.z5f.size()) {
         u60 var6 = (u60)this.z5f.get(var5);
         var6.tag(var1, var2, var3);
         var5++;
         if (var4 == 0) {
            break;
         }
      }
   }

   public Calendar mp6() {
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
      // 06: ifeq 2e
      // 09: invokevirtual t9d.p2b ()J
      // 0c: ldc2_w 600
      // 0f: lrem
      // 10: lconst_0
      // 11: lcmp
      // 12: ifne 2d
      // 15: goto 1c
      // 18: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield t9d.xle Ljava/util/Calendar;
      // 20: invokestatic vr1.spw ()J
      // 23: invokevirtual java/util/Calendar.setTimeInMillis (J)V
      // 26: goto 2d
      // 29: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield t9d.xle Ljava/util/Calendar;
      // 31: areturn
   }

   public void w39(double var1, double var3, double var5, double var7, double var9, double var11, bdo var13) {
   }

   public uci fgp() {
      return this.t7i;
   }

   public void lw8(mew param1, e0x param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: getstatic vt2$unz.fzl Lvt2$unz;
      // 07: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 0a: astore 4
      // 0c: aload 4
      // 0e: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 13: ifeq e9
      // 16: aload 4
      // 18: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 1d: checkcast vt2
      // 20: astore 5
      // 22: aload 1
      // 23: aload 5
      // 25: invokevirtual mew.offset (Lvt2;)Lmew;
      // 28: astore 6
      // 2a: aload 0
      // 2b: aload 6
      // 2d: iload 3
      // 2e: ifne 48
      // 31: invokevirtual t9d.xjm (Lmew;)Z
      // 34: ifeq e5
      // 37: goto 3e
      // 3a: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 0
      // 3f: aload 6
      // 41: goto 48
      // 44: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 4b: astore 7
      // 4d: getstatic ox_.k2w Lt6d;
      // 50: aload 7
      // 52: invokeinterface zfz.r_y ()Le0x; 1
      // 57: invokevirtual t6d.zl0 (Le0x;)Z
      // 5a: iload 3
      // 5b: ifne 94
      // 5e: ifeq 83
      // 61: goto 68
      // 64: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: aload 7
      // 6a: invokeinterface zfz.r_y ()Le0x; 1
      // 6f: aload 0
      // 70: aload 6
      // 72: aload 7
      // 74: aload 2
      // 75: invokevirtual e0x.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // 78: iload 3
      // 79: ifeq e5
      // 7c: goto 83
      // 7f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 82: athrow
      // 83: aload 7
      // 85: invokeinterface zfz.r_y ()Le0x; 1
      // 8a: invokevirtual e0x.y0n ()Z
      // 8d: goto 94
      // 90: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 93: athrow
      // 94: iload 3
      // 95: ifne cb
      // 98: ifeq e5
      // 9b: goto a2
      // 9e: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a1: athrow
      // a2: aload 6
      // a4: aload 5
      // a6: invokevirtual mew.offset (Lvt2;)Lmew;
      // a9: astore 6
      // ab: aload 0
      // ac: aload 6
      // ae: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // b1: astore 7
      // b3: getstatic ox_.k2w Lt6d;
      // b6: iload 3
      // b7: ifne dc
      // ba: aload 7
      // bc: invokeinterface zfz.r_y ()Le0x; 1
      // c1: invokevirtual t6d.zl0 (Le0x;)Z
      // c4: goto cb
      // c7: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ca: athrow
      // cb: ifeq e5
      // ce: aload 7
      // d0: invokeinterface zfz.r_y ()Le0x; 1
      // d5: goto dc
      // d8: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // db: athrow
      // dc: aload 0
      // dd: aload 6
      // df: aload 7
      // e1: aload 2
      // e2: invokevirtual e0x.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // e5: iload 3
      // e6: ifeq 0c
      // e9: return
   }

   public css sms(mew var1) {
      long var3 = 0L;
      int var10000 = c();
      float var5 = 0.0F;
      int var2 = var10000;

      mew var10001;
      label20: {
         try {
            var7 = this;
            var10001 = var1;
            if (var2 != 0) {
               break label20;
            }

            if (!this.xjm(var1)) {
               return new css(this.rbk(), this.bq8(), var3, var5);
            }
         } catch (oov var6) {
            throw b(var6);
         }

         var5 = this.w27();
         var7 = this;
         var10001 = var1;
      }

      var3 = var7.pxs(var10001).zuf();
      return new css(this.rbk(), this.bq8(), var3, var5);
   }

   public v66 rbk() {
      return this.r7d().uah();
   }

   public int e76() {
      return this.agl;
   }

   public void kc3(int var1) {
      this.agl = var1;
   }

   public int v48() {
      return this.adf;
   }

   public void wj6(int var1) {
      this.adf = var1;
   }

   public boolean a2y() {
      return this.ka0;
   }

   public bg8 hd9() {
      return this.sw1;
   }

   public w5i fve() {
      return this._m8;
   }

   public boolean j1j(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual t9d.suq ()Lmew;
      // 04: astore 4
      // 06: invokestatic t9d.b ()I
      // 09: iload 1
      // 0a: bipush 16
      // 0c: imul
      // 0d: bipush 8
      // 0f: iadd
      // 10: aload 4
      // 12: invokevirtual mew.getX ()I
      // 15: isub
      // 16: istore 5
      // 18: iload 2
      // 19: bipush 16
      // 1b: imul
      // 1c: bipush 8
      // 1e: iadd
      // 1f: aload 4
      // 21: invokevirtual mew.getZ ()I
      // 24: isub
      // 25: istore 6
      // 27: istore 3
      // 28: sipush 128
      // 2b: istore 7
      // 2d: iload 5
      // 2f: iload 7
      // 31: ineg
      // 32: iload 3
      // 33: ifeq 4b
      // 36: if_icmplt 90
      // 39: goto 40
      // 3c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3f: athrow
      // 40: iload 5
      // 42: iload 7
      // 44: goto 4b
      // 47: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4a: athrow
      // 4b: iload 3
      // 4c: ifeq 65
      // 4f: if_icmpgt 90
      // 52: goto 59
      // 55: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 58: athrow
      // 59: iload 6
      // 5b: iload 7
      // 5d: ineg
      // 5e: goto 65
      // 61: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 64: athrow
      // 65: iload 3
      // 66: ifeq 89
      // 69: if_icmplt 90
      // 6c: goto 73
      // 6f: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 72: athrow
      // 73: iload 6
      // 75: iload 3
      // 76: ifeq 8d
      // 79: goto 80
      // 7c: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 7f: athrow
      // 80: iload 7
      // 82: goto 89
      // 85: invokestatic t9d.b (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 88: athrow
      // 89: if_icmpgt 90
      // 8c: bipush 1
      // 8d: goto 91
      // 90: bipush 0
      // 91: ireturn
   }

   public static void b(int var0) {
      a = var0;
   }

   public static int b() {
      return a;
   }

   public static int c() {
      int var0 = b();

      try {
         return var0 == 0 ? 69 : 0;
      } catch (oov var1) {
         throw b(var1);
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8350017691907940271L, 2671024132149355762L, MethodHandles.lookup().lookupClass()).a(245605364129757L);
      // $VF: monitorexit
      c = var10000;
      b(77);
      long var0 = c ^ 2255822362153L;
      Cipher var2;
      Cipher var13 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var3 = 1; var3 < 8; var3++) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[44];
      int var7 = 0;
      String var6 = "\u0006½#«q\u008b8¥_\u0014¶\fº\u008a\u001b\"Qt\u0091Â\u0091]`ÒV\u0011(*\u0007\bÐ\u0013-\u009eKsÖ\u009cM' ûÃé /+å\u0012´øzÿÑÈ\u00ad\u0000\u0007Q¥\u009a\u0013Â-WNK@\u0012|\u0010ó\u009c\u0018ÃÒË_\u0085û?Í\u001aN¡*;\u0086à·x#Ç>_\u001d½ê\u0018_g-4tÍµ V\u0096·Q\u0081»à\fE\u009dyÖ÷XÉ\u0016(\u001f\u0004ì³¼¾\u0097X \"ñ¨°8(ë¯\u000bßhFá-½© ÑOÌ¥^r½)Õfv\u00076\u0018(\u001a\u009bÔIÀ\u0010\u0091@«±\u009eÛ5\u001c\u0080\u0004e\u0098n\u0088Ô\u0096\rè\u0095 *%°uû\u009d\u0094½1\u001bG\u0096\u000e¶\u0018X\u0012üÇU\u0014`\u008e¼Aû´À¹O43rLÏ¼áý\u0092(r\u008dÌ\u0012\u001e\u0002±êIÿØGþ¥¦üádwôÕ\u008d«%åp,\b\u008f\u0090øÿYà¨\u0085]øhÕ\u0018¨\u0002Å\t\u000fW>6MÚè\u0011·ç\u00127\u009f§\u0086\u00adà<Ã\u0016(AzP{t?\u000eS»µ\u0011\u0095\n\n2ws\u0014¾râ\u0017\u0002\u0086Å®\u001f\u0014$\u001c_9%'\u0015M\u0082\u0005\u009bÄ \u0093ÙïóËª.ú\u001aMñ\u000e«^4Jtñ^!Ñèb¼£MZL3%ÿ÷(S5Yþ\nL÷\u0081S8\u001aííVjô±y}\u0098R\n=`lVPLk01\u0019¹¼\u009aü@ò\u001dÄ sS2@È\nrï\u009b\u00ad'ßµäóoóÎ/\u008c\u0095\u0093Ä®£!¬>ÙËz\u008d0ë\u008b\u009e?ïq`iü£]û\u001b\u0091M\u0094þå:\n\u008b`ãfÿ§\u0019XJÀ\u001a\u008aAà´`t\u0005|¨øªÅÞ[xù\\ Mkm\"_¼^\u0095[\u0005\u0012\"û\u007fï\u008b\u008c\u0095YHDT~ý\u0085]ø<ä´\u009eÀ\u0018\u0088Ñu\b|Ç¾\u008bã©S\u0013Æ\u0001#\n\u0095\u0015\u008fk\u009c\u008cº¦\u0018n¤õ|l\rí\u0080w\u0012\u0089\u0095ÄÛòK^Ó\r\u0005\\B1Z Û\u0084\u009c\f·\u0098\u007fOêNÁ\u0090\u0001\u0013:<@0ÞRñ\u001bRzµ\u0006\u0006|ã^Øð\u0018»«¹N»ÒÛ÷Õ-ù\u008e_\u008bX\u0085.\u001f\fP:UM\u0094\u0018Ûg¹\u0015ï\u009f²ÞÝ£»dv\u0000þ\u0007\u001dÏÞ*·\u0012;ù\u0018Ä\u008bX\tÎCjL¦\u0085\u0087ø\u001e\u0015áf\u0089\u001a>ÅØ5Gð\u0010¾yã\u0003\u0017\u0014\u0007\u009aBDk;Y\u0081C\u0001\u0010ôB\u0096Än7:Ü\u0003Ý4*\u0013X8H0Y»J\u0003ÇÉ\u001c7âTþU\u0085\u007f\u001a\u0001\u001c»\u000e\u008föÞ»\u0013\u0084Ò\u0016âKÜÝK\u001dMË\u0093D\u0018É5\u009a9·qk\u000bXì(ù(¬~@ù¦Ò> Zp`,àù<Þ\u008a×â\u0084#\u0003@\u001f°æqíT¼P\u008b2ÙxSÀr\u0010z\u008eµ*\u001eð_ §oh|Þ¹\u001aà \u008eáA{B\u0096§H\u008d!Z\u0011©#\u001a¡f¼\u0019µÒsä_\u0007\u0089ÿ¹\u001a\u0015\u0099\u0019 \u000bÿ\u0083\u009evÊ\b\u009cÏO¿\u009dö´ `Ö(\u0095Ê.\u0007©\u0093\u0094ÂP]\u008d\u000e+â0ÎË\u0014>Ó0\u0085ßcÒ\u0097BLb¥!\u0094o\u0016r>\n\u0000=\bä#\u00927¦\u0002\u0088±[zÒZ³¸\u0086um%JE\n\u009c (G\u008e\u0094Ýg4;Ë\u008dZCõÓ»\u0019XÍHF$¨Q\u008e[\u001b\u008d¬Y\\ =ZE \u0015\u0013¤ÏðL@\u0083@ïë®dÔÖg\u008aKþ\u000bùÀ8p®[\u001c\u0097¿\u0084\u0099\u0007«)¤ÁGx\u0005g,cn·-°\u0092\u0091Þ3'N\u001a¿ÎNÖä.\u009eÿú\u0006ÖYÐ>.ÿS \u0018«k¹\u000f\u008d\u0086ö1zcEhRí\u0006ª±\u0003jÒ±âou\u0010\u0019\u0080/ì\u001aÇûE\fý\u009b\\X\u0098ó\u0087 ¶×)ýS\u009dÂ\u000eÔ¦µ´ZÞ;i \u0002Vf/\u001f&\u0003è\u000b\u008fUw\u009aÏJ\u0018ßê\u0091\u0016Í\u000b%õÛÂ{\u0096ÿ£\u0094ý\u0002:¾\\Ò^`W(8_3¿ \b\u0081 >ÊÁ\u001câè»îRW\u0001\u0084þ\u0011K² %(\"W´î\u0085`\u0006tO\u0095£ Û\u0010\f\u001eY\u0003X«Ø=\u0004àà\u0004O\u0095Â\u001a\u0010 êØÝ(S\u001a\u0018\\!UØóÝÖØ\u0010\u000eÍ\u001f\u0092ì\u0082¾\u0018+\u0012\u0016\u009e\u0091\u008eÖÜ(³ÉV\"Ï¡Ë\"\u000eÜlÎ÷Ü\u0011\u001b\fÂ(8³Ù®\u0005\u0001ìI\u009d\u0093Ä\u0097{¸\u0092,\u0003\u0099\u0098\u0091X\u0010?ò£\u0005þL\u0002æ½÷\"\r7\u000f¤D0\u009a9j¯{\u0014(N_ÁI\u0085¼\u0013¹¡Þ\u0083¹(\u008a7l:1:+\u0088Q\u0017*-Á¡i\u0080W¨aÞqÑT\u009b\u000b)2}";
      int var8 = "\u0006½#«q\u008b8¥_\u0014¶\fº\u008a\u001b\"Qt\u0091Â\u0091]`ÒV\u0011(*\u0007\bÐ\u0013-\u009eKsÖ\u009cM' ûÃé /+å\u0012´øzÿÑÈ\u00ad\u0000\u0007Q¥\u009a\u0013Â-WNK@\u0012|\u0010ó\u009c\u0018ÃÒË_\u0085û?Í\u001aN¡*;\u0086à·x#Ç>_\u001d½ê\u0018_g-4tÍµ V\u0096·Q\u0081»à\fE\u009dyÖ÷XÉ\u0016(\u001f\u0004ì³¼¾\u0097X \"ñ¨°8(ë¯\u000bßhFá-½© ÑOÌ¥^r½)Õfv\u00076\u0018(\u001a\u009bÔIÀ\u0010\u0091@«±\u009eÛ5\u001c\u0080\u0004e\u0098n\u0088Ô\u0096\rè\u0095 *%°uû\u009d\u0094½1\u001bG\u0096\u000e¶\u0018X\u0012üÇU\u0014`\u008e¼Aû´À¹O43rLÏ¼áý\u0092(r\u008dÌ\u0012\u001e\u0002±êIÿØGþ¥¦üádwôÕ\u008d«%åp,\b\u008f\u0090øÿYà¨\u0085]øhÕ\u0018¨\u0002Å\t\u000fW>6MÚè\u0011·ç\u00127\u009f§\u0086\u00adà<Ã\u0016(AzP{t?\u000eS»µ\u0011\u0095\n\n2ws\u0014¾râ\u0017\u0002\u0086Å®\u001f\u0014$\u001c_9%'\u0015M\u0082\u0005\u009bÄ \u0093ÙïóËª.ú\u001aMñ\u000e«^4Jtñ^!Ñèb¼£MZL3%ÿ÷(S5Yþ\nL÷\u0081S8\u001aííVjô±y}\u0098R\n=`lVPLk01\u0019¹¼\u009aü@ò\u001dÄ sS2@È\nrï\u009b\u00ad'ßµäóoóÎ/\u008c\u0095\u0093Ä®£!¬>ÙËz\u008d0ë\u008b\u009e?ïq`iü£]û\u001b\u0091M\u0094þå:\n\u008b`ãfÿ§\u0019XJÀ\u001a\u008aAà´`t\u0005|¨øªÅÞ[xù\\ Mkm\"_¼^\u0095[\u0005\u0012\"û\u007fï\u008b\u008c\u0095YHDT~ý\u0085]ø<ä´\u009eÀ\u0018\u0088Ñu\b|Ç¾\u008bã©S\u0013Æ\u0001#\n\u0095\u0015\u008fk\u009c\u008cº¦\u0018n¤õ|l\rí\u0080w\u0012\u0089\u0095ÄÛòK^Ó\r\u0005\\B1Z Û\u0084\u009c\f·\u0098\u007fOêNÁ\u0090\u0001\u0013:<@0ÞRñ\u001bRzµ\u0006\u0006|ã^Øð\u0018»«¹N»ÒÛ÷Õ-ù\u008e_\u008bX\u0085.\u001f\fP:UM\u0094\u0018Ûg¹\u0015ï\u009f²ÞÝ£»dv\u0000þ\u0007\u001dÏÞ*·\u0012;ù\u0018Ä\u008bX\tÎCjL¦\u0085\u0087ø\u001e\u0015áf\u0089\u001a>ÅØ5Gð\u0010¾yã\u0003\u0017\u0014\u0007\u009aBDk;Y\u0081C\u0001\u0010ôB\u0096Än7:Ü\u0003Ý4*\u0013X8H0Y»J\u0003ÇÉ\u001c7âTþU\u0085\u007f\u001a\u0001\u001c»\u000e\u008föÞ»\u0013\u0084Ò\u0016âKÜÝK\u001dMË\u0093D\u0018É5\u009a9·qk\u000bXì(ù(¬~@ù¦Ò> Zp`,àù<Þ\u008a×â\u0084#\u0003@\u001f°æqíT¼P\u008b2ÙxSÀr\u0010z\u008eµ*\u001eð_ §oh|Þ¹\u001aà \u008eáA{B\u0096§H\u008d!Z\u0011©#\u001a¡f¼\u0019µÒsä_\u0007\u0089ÿ¹\u001a\u0015\u0099\u0019 \u000bÿ\u0083\u009evÊ\b\u009cÏO¿\u009dö´ `Ö(\u0095Ê.\u0007©\u0093\u0094ÂP]\u008d\u000e+â0ÎË\u0014>Ó0\u0085ßcÒ\u0097BLb¥!\u0094o\u0016r>\n\u0000=\bä#\u00927¦\u0002\u0088±[zÒZ³¸\u0086um%JE\n\u009c (G\u008e\u0094Ýg4;Ë\u008dZCõÓ»\u0019XÍHF$¨Q\u008e[\u001b\u008d¬Y\\ =ZE \u0015\u0013¤ÏðL@\u0083@ïë®dÔÖg\u008aKþ\u000bùÀ8p®[\u001c\u0097¿\u0084\u0099\u0007«)¤ÁGx\u0005g,cn·-°\u0092\u0091Þ3'N\u001a¿ÎNÖä.\u009eÿú\u0006ÖYÐ>.ÿS \u0018«k¹\u000f\u008d\u0086ö1zcEhRí\u0006ª±\u0003jÒ±âou\u0010\u0019\u0080/ì\u001aÇûE\fý\u009b\\X\u0098ó\u0087 ¶×)ýS\u009dÂ\u000eÔ¦µ´ZÞ;i \u0002Vf/\u001f&\u0003è\u000b\u008fUw\u009aÏJ\u0018ßê\u0091\u0016Í\u000b%õÛÂ{\u0096ÿ£\u0094ý\u0002:¾\\Ò^`W(8_3¿ \b\u0081 >ÊÁ\u001câè»îRW\u0001\u0084þ\u0011K² %(\"W´î\u0085`\u0006tO\u0095£ Û\u0010\f\u001eY\u0003X«Ø=\u0004àà\u0004O\u0095Â\u001a\u0010 êØÝ(S\u001a\u0018\\!UØóÝÖØ\u0010\u000eÍ\u001f\u0092ì\u0082¾\u0018+\u0012\u0016\u009e\u0091\u008eÖÜ(³ÉV\"Ï¡Ë\"\u000eÜlÎ÷Ü\u0011\u001b\fÂ(8³Ù®\u0005\u0001ìI\u009d\u0093Ä\u0097{¸\u0092,\u0003\u0099\u0098\u0091X\u0010?ò£\u0005þL\u0002æ½÷\"\r7\u000f¤D0\u009a9j¯{\u0014(N_ÁI\u0085¼\u0013¹¡Þ\u0083¹(\u008a7l:1:+\u0088Q\u0017*-Á¡i\u0080W¨aÞqÑT\u009b\u000b)2}"
         .length();
      char var5 = '(';
      int var12 = -1;

      label27:
      while (true) {
         String var14 = var6.substring(++var12, var12 + var5);
         byte var10001 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = a(var10).intern();
            switch (var10001) {
               case 0:
                  var9[var7++] = var20;
                  if ((var12 += var5) >= var8) {
                     d = var9;
                     e = new String[44];
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

                  var6 = "ï\u0084W`æZ\u0006¯\u008e&ÈRl÷\u0003\u0000\fm§\u009d\u0086\u0084O)x ÖS²\u007fú¯0hWs\u0095è$\u0095LªcÝ\u0083¿\u0010j \"'\u00879¿TpîÜ\u008do\u0085nº\u0086=\u000b·j9ó\u000bBÌ\u0002\u0007e¨\u0082ü\u001f&";
                  var8 = "ï\u0084W`æZ\u0006¯\u008e&ÈRl÷\u0003\u0000\fm§\u009d\u0086\u0084O)x ÖS²\u007fú¯0hWs\u0095è$\u0095LªcÝ\u0083¿\u0010j \"'\u00879¿TpîÜ\u008do\u0085nº\u0086=\u000b·j9ó\u000bBÌ\u0002\u0007e¨\u0082ü\u001f&"
                     .length();
                  var5 = ' ';
                  var12 = -1;
            }

            var14 = var6.substring(++var12, var12 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable b(Throwable var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18954;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().getId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("t9d", var10);
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
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, var0, var3, var1), var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("t9d" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
