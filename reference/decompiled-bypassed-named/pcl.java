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

public class pcl extends e0x {
   public static final h76 hln;
   public static final h76 qme;
   public static final h76 t6u;
   public static final h76 leq;
   public static final h76 m4e;
   public static final h76[] dy6;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public pcl() {
      super(p3y.wui);
      this.y8l(this._8_.c32().zvi(hln, false).zvi(qme, false).zvi(t6u, false).zvi(leq, false).zvi(m4e, false));
      this._p_(true);
      this.i3l(uja.qqf);
   }

   @Override
   public zfz w1b(zfz var1, m5n var2, mew var3) {
      return var1.zvi(hln, var2.getBlockState(var3.nuv()).r_y().lj1());
   }

   @Override
   public void bf6() {
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
   public boolean ujd(OpaquePredicate var1, mew var2) {
      return true;
   }

   @Override
   public void c7i(m5n param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 0.0625
      // 002: nop
      // 003: fstore 4
      // 005: invokestatic OpaquePredicate.c ()I
      // 008: fconst_1
      // 009: fstore 5
      // 00b: istore 3
      // 00c: fconst_1
      // 00d: fstore 6
      // 00f: fconst_1
      // 010: fstore 7
      // 012: fconst_0
      // 013: fstore 8
      // 015: fconst_0
      // 016: fstore 9
      // 018: fconst_0
      // 019: fstore 10
      // 01b: bipush 0
      // 01c: istore 11
      // 01e: aload 1
      // 01f: aload 2
      // 020: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 025: getstatic pcl.m4e Lh76;
      // 028: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 02d: checkcast java/lang/Boolean
      // 030: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 033: iload 3
      // 034: ifne 072
      // 037: ifeq 05d
      // 03a: goto 041
      // 03d: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 040: athrow
      // 041: fload 8
      // 043: ldc 0.0625
      // 045: nop
      // 046: invokestatic java/lang/Math.max (FF)F
      // 049: fstore 8
      // 04b: fconst_0
      // 04c: fstore 5
      // 04e: fconst_0
      // 04f: fstore 6
      // 051: fconst_1
      // 052: fstore 9
      // 054: fconst_0
      // 055: fstore 7
      // 057: fconst_1
      // 058: fstore 10
      // 05a: bipush 1
      // 05b: istore 11
      // 05d: aload 1
      // 05e: aload 2
      // 05f: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 064: getstatic pcl.t6u Lh76;
      // 067: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 06c: checkcast java/lang/Boolean
      // 06f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 072: iload 3
      // 073: ifne 0b1
      // 076: ifeq 09c
      // 079: goto 080
      // 07c: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 07f: athrow
      // 080: fload 5
      // 082: ldc 0.9375
      // 084: nop
      // 085: invokestatic java/lang/Math.min (FF)F
      // 088: fstore 5
      // 08a: fconst_1
      // 08b: fstore 8
      // 08d: fconst_0
      // 08e: fstore 6
      // 090: fconst_1
      // 091: fstore 9
      // 093: fconst_0
      // 094: fstore 7
      // 096: fconst_1
      // 097: fstore 10
      // 099: bipush 1
      // 09a: istore 11
      // 09c: aload 1
      // 09d: aload 2
      // 09e: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0a3: getstatic pcl.qme Lh76;
      // 0a6: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0ab: checkcast java/lang/Boolean
      // 0ae: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b1: iload 3
      // 0b2: ifne 0f0
      // 0b5: ifeq 0db
      // 0b8: goto 0bf
      // 0bb: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0be: athrow
      // 0bf: fload 10
      // 0c1: ldc 0.0625
      // 0c3: nop
      // 0c4: invokestatic java/lang/Math.max (FF)F
      // 0c7: fstore 10
      // 0c9: fconst_0
      // 0ca: fstore 7
      // 0cc: fconst_0
      // 0cd: fstore 5
      // 0cf: fconst_1
      // 0d0: fstore 8
      // 0d2: fconst_0
      // 0d3: fstore 6
      // 0d5: fconst_1
      // 0d6: fstore 9
      // 0d8: bipush 1
      // 0d9: istore 11
      // 0db: aload 1
      // 0dc: aload 2
      // 0dd: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0e2: getstatic pcl.leq Lh76;
      // 0e5: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0ea: checkcast java/lang/Boolean
      // 0ed: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0f0: iload 3
      // 0f1: ifne 11c
      // 0f4: ifeq 11a
      // 0f7: goto 0fe
      // 0fa: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fd: athrow
      // 0fe: fload 7
      // 100: ldc 0.9375
      // 102: nop
      // 103: invokestatic java/lang/Math.min (FF)F
      // 106: fstore 7
      // 108: fconst_1
      // 109: fstore 10
      // 10b: fconst_0
      // 10c: fstore 5
      // 10e: fconst_1
      // 10f: fstore 8
      // 111: fconst_0
      // 112: fstore 6
      // 114: fconst_1
      // 115: fstore 9
      // 117: bipush 1
      // 118: istore 11
      // 11a: iload 11
      // 11c: iload 3
      // 11d: ifne 14f
      // 120: ifne 16b
      // 123: goto 12a
      // 126: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 129: athrow
      // 12a: aload 0
      // 12b: iload 3
      // 12c: ifne 16c
      // 12f: goto 136
      // 132: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 135: athrow
      // 136: aload 1
      // 137: aload 2
      // 138: invokevirtual mew.nuv ()Lmew;
      // 13b: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 140: invokeinterface zfz.r_y ()Le0x; 1
      // 145: invokespecial pcl.o2n (Le0x;)Z
      // 148: goto 14f
      // 14b: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 14e: athrow
      // 14f: ifeq 16b
      // 152: fload 6
      // 154: ldc 0.9375
      // 156: nop
      // 157: invokestatic java/lang/Math.min (FF)F
      // 15a: fstore 6
      // 15c: fconst_1
      // 15d: fstore 9
      // 15f: fconst_0
      // 160: fstore 5
      // 162: fconst_1
      // 163: fstore 8
      // 165: fconst_0
      // 166: fstore 7
      // 168: fconst_1
      // 169: fstore 10
      // 16b: aload 0
      // 16c: fload 5
      // 16e: fload 6
      // 170: fload 7
      // 172: fload 8
      // 174: fload 9
      // 176: fload 10
      // 178: invokevirtual pcl.xl4 (FFFFFF)V
      // 17b: return
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public boolean d9o(OpaquePredicate param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: getstatic pcl$1.nry [I
      // 08: aload 3
      // 09: invokevirtual vt2.ordinal ()I
      // 0c: iaload
      // 0d: iload 4
      // 0f: ifne 65
      // 12: tableswitch 82 1 5 38 60 60 60 60
      // 34: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 37: athrow
      // 38: aload 0
      // 39: aload 1
      // 3a: aload 2
      // 3b: invokevirtual mew.nuv ()Lmew;
      // 3e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 41: invokeinterface zfz.r_y ()Le0x; 1
      // 46: invokespecial pcl.o2n (Le0x;)Z
      // 49: ireturn
      // 4a: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: aload 0
      // 4f: aload 1
      // 50: aload 2
      // 51: aload 3
      // 52: invokevirtual vt2.b4b ()Lvt2;
      // 55: invokevirtual mew.offset (Lvt2;)Lmew;
      // 58: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 5b: invokeinterface zfz.r_y ()Le0x; 1
      // 60: invokespecial pcl.o2n (Le0x;)Z
      // 63: ireturn
      // 64: bipush 0
      // 65: ireturn
   }

   private boolean o2n(e0x param1) {
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
      // 05: invokevirtual e0x.gck ()Z
      // 08: iload 2
      // 09: ifeq 24
      // 0c: ifeq 36
      // 0f: goto 16
      // 12: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15: athrow
      // 16: aload 1
      // 17: getfield e0x.kgd Lp3y;
      // 1a: invokevirtual p3y.c3t ()Z
      // 1d: goto 24
      // 20: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: iload 2
      // 25: ifeq 33
      // 28: ifeq 36
      // 2b: goto 32
      // 2e: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   private boolean dcn(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 3
      // 001: astore 5
      // 003: invokestatic OpaquePredicate.c ()I
      // 006: getstatic vt2$unz.fzl Lvt2$unz;
      // 009: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 00c: astore 6
      // 00e: istore 4
      // 010: aload 6
      // 012: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 017: ifeq 0d2
      // 01a: aload 6
      // 01c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 021: checkcast vt2
      // 024: astore 7
      // 026: aload 7
      // 028: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 02b: astore 8
      // 02d: aload 3
      // 02e: aload 8
      // 030: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 035: checkcast java/lang/Boolean
      // 038: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 03b: iload 4
      // 03d: ifne 0e2
      // 040: iload 4
      // 042: ifne 070
      // 045: goto 04c
      // 048: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 04b: athrow
      // 04c: ifeq 0cd
      // 04f: goto 056
      // 052: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 055: athrow
      // 056: aload 0
      // 057: aload 1
      // 058: aload 2
      // 059: aload 7
      // 05b: invokevirtual mew.offset (Lvt2;)Lmew;
      // 05e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 061: invokeinterface zfz.r_y ()Le0x; 1
      // 066: invokespecial pcl.o2n (Le0x;)Z
      // 069: goto 070
      // 06c: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 06f: athrow
      // 070: ifne 0cd
      // 073: aload 1
      // 074: aload 2
      // 075: invokevirtual mew.nuv ()Lmew;
      // 078: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 07b: astore 9
      // 07d: aload 9
      // 07f: iload 4
      // 081: ifne 0cc
      // 084: invokeinterface zfz.r_y ()Le0x; 1
      // 089: aload 0
      // 08a: if_acmpne 0b9
      // 08d: goto 094
      // 090: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 093: athrow
      // 094: aload 9
      // 096: aload 8
      // 098: iload 4
      // 09a: ifne 0c3
      // 09d: goto 0a4
      // 0a0: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a3: athrow
      // 0a4: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0a9: checkcast java/lang/Boolean
      // 0ac: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0af: ifne 0cd
      // 0b2: goto 0b9
      // 0b5: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0b8: athrow
      // 0b9: aload 3
      // 0ba: aload 8
      // 0bc: goto 0c3
      // 0bf: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0c2: athrow
      // 0c3: bipush 0
      // 0c4: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 0c7: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0cc: astore 3
      // 0cd: iload 4
      // 0cf: ifeq 010
      // 0d2: aload 3
      // 0d3: iload 4
      // 0d5: ifne 0ed
      // 0d8: invokestatic pcl.dt6 (Lzfz;)I
      // 0db: goto 0e2
      // 0de: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0e1: athrow
      // 0e2: ifne 0eb
      // 0e5: bipush 0
      // 0e6: ireturn
      // 0e7: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ea: athrow
      // 0eb: aload 5
      // 0ed: aload 3
      // 0ee: if_acmpeq 100
      // 0f1: aload 1
      // 0f2: aload 2
      // 0f3: aload 3
      // 0f4: bipush 2
      // 0f5: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 0f8: pop
      // 0f9: goto 100
      // 0fc: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ff: athrow
      // 100: bipush 1
      // 101: ireturn
   }

   @Override
   public int ldy() {
      return h7z.c6v();
   }

   @Override
   public int ieb(zfz var1) {
      return h7z.c6v();
   }

   @Override
   public int j24(m5n var1, mew var2, int var3) {
      return var1.getBiomeGenForCoords(var2).i9_(var2);
   }

   @Override
   public void z3l(OpaquePredicate param1, mew param2, zfz param3, e0x param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 5
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 5
      // 0b: ifeq 26
      // 0e: ifne 4a
      // 11: goto 18
      // 14: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: aload 3
      // 1c: invokespecial pcl.dcn (Lt9d;Lmew;Lzfz;)Z
      // 1f: goto 26
      // 22: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: iload 5
      // 28: ifeq 49
      // 2b: ifne 4a
      // 2e: goto 35
      // 31: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: aload 2
      // 38: aload 3
      // 39: bipush 0
      // 3a: invokevirtual pcl.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 3d: aload 1
      // 3e: aload 2
      // 3f: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 42: goto 49
      // 45: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 48: athrow
      // 49: pop
      // 4a: return
   }

   @Override
   public void zvy(OpaquePredicate param1, mew param2, zfz param3, Random param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 5
      // 005: aload 1
      // 006: getfield OpaquePredicate.v0f Z
      // 009: iload 5
      // 00b: ifne 027
      // 00e: ifne 7e4
      // 011: goto 018
      // 014: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 017: athrow
      // 018: aload 1
      // 019: getfield OpaquePredicate.fsy Ljava/util/Random;
      // 01c: bipush 4
      // 01d: invokevirtual java/util/Random.nextInt (I)I
      // 020: goto 027
      // 023: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 026: athrow
      // 027: iload 5
      // 029: ifne 037
      // 02c: ifne 7e4
      // 02f: goto 036
      // 032: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 035: athrow
      // 036: bipush 4
      // 037: istore 6
      // 039: bipush 5
      // 03a: istore 7
      // 03c: bipush 0
      // 03d: istore 8
      // 03f: iload 6
      // 041: ineg
      // 042: istore 9
      // 044: iload 9
      // 046: iload 6
      // 048: if_icmpgt 0be
      // 04b: iload 6
      // 04d: ineg
      // 04e: istore 10
      // 050: iload 10
      // 052: iload 6
      // 054: if_icmpgt 0b6
      // 057: bipush -1
      // 058: iload 5
      // 05a: ifne 046
      // 05d: istore 11
      // 05f: iload 11
      // 061: bipush 1
      // 062: if_icmpgt 0ae
      // 065: aload 1
      // 066: aload 2
      // 067: iload 9
      // 069: iload 11
      // 06b: iload 10
      // 06d: invokevirtual mew.ec4 (III)Lmew;
      // 070: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 073: invokeinterface zfz.r_y ()Le0x; 1
      // 078: aload 0
      // 079: if_acmpne 09f
      // 07c: iinc 7 -1
      // 07f: iload 5
      // 081: ifne 0a9
      // 084: goto 08b
      // 087: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 08a: athrow
      // 08b: iload 7
      // 08d: ifgt 09f
      // 090: goto 097
      // 093: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 096: athrow
      // 097: bipush 1
      // 098: istore 8
      // 09a: iload 5
      // 09c: ifeq 0be
      // 09f: iinc 11 1
      // 0a2: goto 0a9
      // 0a5: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0a8: athrow
      // 0a9: iload 5
      // 0ab: ifeq 05f
      // 0ae: iinc 10 1
      // 0b1: iload 5
      // 0b3: ifeq 050
      // 0b6: iinc 9 1
      // 0b9: iload 5
      // 0bb: ifeq 044
      // 0be: aload 4
      // 0c0: invokestatic vt2.aa3 (Ljava/util/Random;)Lvt2;
      // 0c3: astore 9
      // 0c5: aload 2
      // 0c6: invokevirtual mew.nuv ()Lmew;
      // 0c9: astore 10
      // 0cb: aload 9
      // 0cd: iload 5
      // 0cf: ifne 24a
      // 0d2: getstatic vt2.rf3 Lvt2;
      // 0d5: if_acmpne 241
      // 0d8: goto 0df
      // 0db: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0de: athrow
      // 0df: aload 2
      // 0e0: invokevirtual mew.getY ()I
      // 0e3: iload 5
      // 0e5: ifne 250
      // 0e8: goto 0ef
      // 0eb: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ee: athrow
      // 0ef: sipush 255
      // 0f2: if_icmpge 241
      // 0f5: goto 0fc
      // 0f8: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0fb: athrow
      // 0fc: aload 1
      // 0fd: aload 10
      // 0ff: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 102: iload 5
      // 104: ifne 250
      // 107: goto 10e
      // 10a: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 10d: athrow
      // 10e: ifeq 241
      // 111: goto 118
      // 114: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 117: athrow
      // 118: iload 8
      // 11a: ifne 7e4
      // 11d: goto 124
      // 120: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 123: athrow
      // 124: aload 3
      // 125: astore 11
      // 127: getstatic vt2$unz.fzl Lvt2$unz;
      // 12a: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 12d: astore 12
      // 12f: aload 12
      // 131: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 136: ifeq 19a
      // 139: aload 12
      // 13b: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 140: checkcast vt2
      // 143: astore 13
      // 145: aload 4
      // 147: invokevirtual java/util/Random.nextBoolean ()Z
      // 14a: iload 5
      // 14c: ifne 1aa
      // 14f: iload 5
      // 151: ifne 180
      // 154: goto 15b
      // 157: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15a: athrow
      // 15b: ifne 183
      // 15e: goto 165
      // 161: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 164: athrow
      // 165: aload 0
      // 166: aload 1
      // 167: aload 10
      // 169: aload 13
      // 16b: invokevirtual mew.offset (Lvt2;)Lmew;
      // 16e: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 171: invokeinterface zfz.r_y ()Le0x; 1
      // 176: invokespecial pcl.o2n (Le0x;)Z
      // 179: goto 180
      // 17c: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17f: athrow
      // 180: ifne 195
      // 183: aload 11
      // 185: aload 13
      // 187: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 18a: bipush 0
      // 18b: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 18e: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 193: astore 11
      // 195: iload 5
      // 197: ifeq 12f
      // 19a: aload 11
      // 19c: getstatic pcl.qme Lh76;
      // 19f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1a4: checkcast java/lang/Boolean
      // 1a7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1aa: iload 5
      // 1ac: ifne 23b
      // 1af: ifne 22b
      // 1b2: goto 1b9
      // 1b5: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b8: athrow
      // 1b9: aload 11
      // 1bb: getstatic pcl.t6u Lh76;
      // 1be: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1c3: checkcast java/lang/Boolean
      // 1c6: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1c9: iload 5
      // 1cb: ifne 23b
      // 1ce: goto 1d5
      // 1d1: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1d4: athrow
      // 1d5: ifne 22b
      // 1d8: goto 1df
      // 1db: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1de: athrow
      // 1df: aload 11
      // 1e1: getstatic pcl.leq Lh76;
      // 1e4: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 1e9: checkcast java/lang/Boolean
      // 1ec: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1ef: iload 5
      // 1f1: ifne 23b
      // 1f4: goto 1fb
      // 1f7: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1fa: athrow
      // 1fb: ifne 22b
      // 1fe: goto 205
      // 201: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 204: athrow
      // 205: aload 11
      // 207: getstatic pcl.m4e Lh76;
      // 20a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 20f: checkcast java/lang/Boolean
      // 212: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 215: iload 5
      // 217: ifne 23b
      // 21a: goto 221
      // 21d: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 220: athrow
      // 221: ifeq 23c
      // 224: goto 22b
      // 227: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22a: athrow
      // 22b: aload 1
      // 22c: aload 10
      // 22e: aload 11
      // 230: bipush 2
      // 231: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 234: goto 23b
      // 237: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23a: athrow
      // 23b: pop
      // 23c: iload 5
      // 23e: ifeq 7e4
      // 241: aload 9
      // 243: goto 24a
      // 246: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 249: athrow
      // 24a: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 24d: invokevirtual vt2$y0s.pyt ()Z
      // 250: iload 5
      // 252: ifne 581
      // 255: ifeq 56a
      // 258: goto 25f
      // 25b: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25e: athrow
      // 25f: aload 3
      // 260: aload 9
      // 262: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 265: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 26a: checkcast java/lang/Boolean
      // 26d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 270: iload 5
      // 272: ifne 581
      // 275: goto 27c
      // 278: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 27b: athrow
      // 27c: ifne 56a
      // 27f: goto 286
      // 282: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 285: athrow
      // 286: iload 8
      // 288: ifne 7e4
      // 28b: goto 292
      // 28e: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 291: athrow
      // 292: aload 2
      // 293: aload 9
      // 295: invokevirtual mew.offset (Lvt2;)Lmew;
      // 298: astore 11
      // 29a: aload 1
      // 29b: aload 11
      // 29d: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 2a0: invokeinterface zfz.r_y ()Le0x; 1
      // 2a5: astore 12
      // 2a7: aload 12
      // 2a9: getfield e0x.kgd Lp3y;
      // 2ac: iload 5
      // 2ae: ifne 51b
      // 2b1: getstatic p3y.cei Lp3y;
      // 2b4: if_acmpne 50f
      // 2b7: goto 2be
      // 2ba: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2bd: athrow
      // 2be: aload 9
      // 2c0: invokevirtual vt2.drv ()Lvt2;
      // 2c3: astore 13
      // 2c5: aload 9
      // 2c7: invokevirtual vt2.tgw ()Lvt2;
      // 2ca: astore 14
      // 2cc: aload 3
      // 2cd: aload 13
      // 2cf: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 2d2: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2d7: checkcast java/lang/Boolean
      // 2da: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2dd: istore 15
      // 2df: aload 3
      // 2e0: aload 14
      // 2e2: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 2e5: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2ea: checkcast java/lang/Boolean
      // 2ed: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 2f0: istore 16
      // 2f2: aload 11
      // 2f4: aload 13
      // 2f6: invokevirtual mew.offset (Lvt2;)Lmew;
      // 2f9: astore 17
      // 2fb: aload 11
      // 2fd: aload 14
      // 2ff: invokevirtual mew.offset (Lvt2;)Lmew;
      // 302: astore 18
      // 304: iload 15
      // 306: iload 5
      // 308: ifne 369
      // 30b: ifeq 360
      // 30e: goto 315
      // 311: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 314: athrow
      // 315: aload 0
      // 316: aload 1
      // 317: aload 17
      // 319: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 31c: invokeinterface zfz.r_y ()Le0x; 1
      // 321: invokespecial pcl.o2n (Le0x;)Z
      // 324: iload 5
      // 326: ifne 369
      // 329: goto 330
      // 32c: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32f: athrow
      // 330: ifeq 360
      // 333: goto 33a
      // 336: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 339: athrow
      // 33a: aload 1
      // 33b: aload 11
      // 33d: aload 0
      // 33e: invokevirtual pcl.l4i ()Lzfz;
      // 341: aload 13
      // 343: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 346: bipush 1
      // 347: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 34a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 34f: bipush 2
      // 350: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 353: pop
      // 354: iload 5
      // 356: ifeq 50a
      // 359: goto 360
      // 35c: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35f: athrow
      // 360: iload 16
      // 362: goto 369
      // 365: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 368: athrow
      // 369: iload 5
      // 36b: ifne 3cc
      // 36e: ifeq 3c3
      // 371: goto 378
      // 374: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 377: athrow
      // 378: aload 0
      // 379: aload 1
      // 37a: aload 18
      // 37c: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 37f: invokeinterface zfz.r_y ()Le0x; 1
      // 384: invokespecial pcl.o2n (Le0x;)Z
      // 387: iload 5
      // 389: ifne 3cc
      // 38c: goto 393
      // 38f: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 392: athrow
      // 393: ifeq 3c3
      // 396: goto 39d
      // 399: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 39c: athrow
      // 39d: aload 1
      // 39e: aload 11
      // 3a0: aload 0
      // 3a1: invokevirtual pcl.l4i ()Lzfz;
      // 3a4: aload 14
      // 3a6: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 3a9: bipush 1
      // 3aa: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 3ad: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 3b2: bipush 2
      // 3b3: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 3b6: pop
      // 3b7: iload 5
      // 3b9: ifeq 50a
      // 3bc: goto 3c3
      // 3bf: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c2: athrow
      // 3c3: iload 15
      // 3c5: goto 3cc
      // 3c8: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3cb: athrow
      // 3cc: iload 5
      // 3ce: ifne 452
      // 3d1: ifeq 449
      // 3d4: goto 3db
      // 3d7: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3da: athrow
      // 3db: aload 1
      // 3dc: aload 17
      // 3de: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 3e1: iload 5
      // 3e3: ifne 452
      // 3e6: goto 3ed
      // 3e9: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3ec: athrow
      // 3ed: ifeq 449
      // 3f0: goto 3f7
      // 3f3: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f6: athrow
      // 3f7: aload 0
      // 3f8: aload 1
      // 3f9: aload 2
      // 3fa: aload 13
      // 3fc: invokevirtual mew.offset (Lvt2;)Lmew;
      // 3ff: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 402: invokeinterface zfz.r_y ()Le0x; 1
      // 407: invokespecial pcl.o2n (Le0x;)Z
      // 40a: iload 5
      // 40c: ifne 452
      // 40f: goto 416
      // 412: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 415: athrow
      // 416: ifeq 449
      // 419: goto 420
      // 41c: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41f: athrow
      // 420: aload 1
      // 421: aload 17
      // 423: aload 0
      // 424: invokevirtual pcl.l4i ()Lzfz;
      // 427: aload 9
      // 429: invokevirtual vt2.b4b ()Lvt2;
      // 42c: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 42f: bipush 1
      // 430: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 433: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 438: bipush 2
      // 439: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 43c: pop
      // 43d: iload 5
      // 43f: ifeq 50a
      // 442: goto 449
      // 445: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 448: athrow
      // 449: iload 16
      // 44b: goto 452
      // 44e: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 451: athrow
      // 452: iload 5
      // 454: ifne 4e8
      // 457: ifeq 4cf
      // 45a: goto 461
      // 45d: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 460: athrow
      // 461: aload 1
      // 462: aload 18
      // 464: invokevirtual OpaquePredicate.isAirBlock (Lmew;)Z
      // 467: iload 5
      // 469: ifne 4e8
      // 46c: goto 473
      // 46f: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 472: athrow
      // 473: ifeq 4cf
      // 476: goto 47d
      // 479: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 47c: athrow
      // 47d: aload 0
      // 47e: aload 1
      // 47f: aload 2
      // 480: aload 14
      // 482: invokevirtual mew.offset (Lvt2;)Lmew;
      // 485: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 488: invokeinterface zfz.r_y ()Le0x; 1
      // 48d: invokespecial pcl.o2n (Le0x;)Z
      // 490: iload 5
      // 492: ifne 4e8
      // 495: goto 49c
      // 498: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 49b: athrow
      // 49c: ifeq 4cf
      // 49f: goto 4a6
      // 4a2: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4a5: athrow
      // 4a6: aload 1
      // 4a7: aload 18
      // 4a9: aload 0
      // 4aa: invokevirtual pcl.l4i ()Lzfz;
      // 4ad: aload 9
      // 4af: invokevirtual vt2.b4b ()Lvt2;
      // 4b2: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 4b5: bipush 1
      // 4b6: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 4b9: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 4be: bipush 2
      // 4bf: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 4c2: pop
      // 4c3: iload 5
      // 4c5: ifeq 50a
      // 4c8: goto 4cf
      // 4cb: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4ce: athrow
      // 4cf: aload 0
      // 4d0: aload 1
      // 4d1: aload 11
      // 4d3: invokevirtual mew.nuv ()Lmew;
      // 4d6: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 4d9: invokeinterface zfz.r_y ()Le0x; 1
      // 4de: invokespecial pcl.o2n (Le0x;)Z
      // 4e1: goto 4e8
      // 4e4: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4e7: athrow
      // 4e8: iload 5
      // 4ea: ifne 509
      // 4ed: ifeq 50a
      // 4f0: goto 4f7
      // 4f3: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4f6: athrow
      // 4f7: aload 1
      // 4f8: aload 11
      // 4fa: aload 0
      // 4fb: invokevirtual pcl.l4i ()Lzfz;
      // 4fe: bipush 2
      // 4ff: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 502: goto 509
      // 505: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 508: athrow
      // 509: pop
      // 50a: iload 5
      // 50c: ifeq 565
      // 50f: aload 12
      // 511: getfield e0x.kgd Lp3y;
      // 514: goto 51b
      // 517: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 51a: athrow
      // 51b: invokevirtual p3y.u4h ()Z
      // 51e: iload 5
      // 520: ifne 539
      // 523: ifeq 565
      // 526: goto 52d
      // 529: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 52c: athrow
      // 52d: aload 12
      // 52f: invokevirtual e0x.gck ()Z
      // 532: goto 539
      // 535: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 538: athrow
      // 539: iload 5
      // 53b: ifne 564
      // 53e: ifeq 565
      // 541: goto 548
      // 544: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 547: athrow
      // 548: aload 1
      // 549: aload 2
      // 54a: aload 3
      // 54b: aload 9
      // 54d: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 550: bipush 1
      // 551: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 554: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 559: bipush 2
      // 55a: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 55d: goto 564
      // 560: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 563: athrow
      // 564: pop
      // 565: iload 5
      // 567: ifeq 7e4
      // 56a: aload 2
      // 56b: iload 5
      // 56d: ifne 590
      // 570: goto 577
      // 573: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 576: athrow
      // 577: invokevirtual mew.getY ()I
      // 57a: goto 581
      // 57d: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 580: athrow
      // 581: bipush 1
      // 582: if_icmple 7e4
      // 585: aload 2
      // 586: invokevirtual mew.eve ()Lmew;
      // 589: goto 590
      // 58c: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 58f: athrow
      // 590: astore 11
      // 592: aload 1
      // 593: aload 11
      // 595: invokevirtual OpaquePredicate.getBlockState (Lmew;)Lzfz;
      // 598: astore 12
      // 59a: aload 12
      // 59c: invokeinterface zfz.r_y ()Le0x; 1
      // 5a1: astore 13
      // 5a3: aload 13
      // 5a5: iload 5
      // 5a7: ifne 6b6
      // 5aa: getfield e0x.kgd Lp3y;
      // 5ad: getstatic p3y.cei Lp3y;
      // 5b0: if_acmpne 6ad
      // 5b3: goto 5ba
      // 5b6: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5b9: athrow
      // 5ba: aload 3
      // 5bb: astore 14
      // 5bd: getstatic vt2$unz.fzl Lvt2$unz;
      // 5c0: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 5c3: astore 15
      // 5c5: aload 15
      // 5c7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 5cc: ifeq 606
      // 5cf: aload 15
      // 5d1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 5d6: checkcast vt2
      // 5d9: astore 16
      // 5db: aload 4
      // 5dd: invokevirtual java/util/Random.nextBoolean ()Z
      // 5e0: iload 5
      // 5e2: ifne 616
      // 5e5: ifeq 601
      // 5e8: goto 5ef
      // 5eb: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 5ee: athrow
      // 5ef: aload 14
      // 5f1: aload 16
      // 5f3: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 5f6: bipush 0
      // 5f7: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 5fa: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 5ff: astore 14
      // 601: iload 5
      // 603: ifeq 5c5
      // 606: aload 14
      // 608: getstatic pcl.qme Lh76;
      // 60b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 610: checkcast java/lang/Boolean
      // 613: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 616: iload 5
      // 618: ifne 6a7
      // 61b: ifne 697
      // 61e: goto 625
      // 621: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 624: athrow
      // 625: aload 14
      // 627: getstatic pcl.t6u Lh76;
      // 62a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 62f: checkcast java/lang/Boolean
      // 632: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 635: iload 5
      // 637: ifne 6a7
      // 63a: goto 641
      // 63d: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 640: athrow
      // 641: ifne 697
      // 644: goto 64b
      // 647: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 64a: athrow
      // 64b: aload 14
      // 64d: getstatic pcl.leq Lh76;
      // 650: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 655: checkcast java/lang/Boolean
      // 658: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 65b: iload 5
      // 65d: ifne 6a7
      // 660: goto 667
      // 663: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 666: athrow
      // 667: ifne 697
      // 66a: goto 671
      // 66d: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 670: athrow
      // 671: aload 14
      // 673: getstatic pcl.m4e Lh76;
      // 676: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 67b: checkcast java/lang/Boolean
      // 67e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 681: iload 5
      // 683: ifne 6a7
      // 686: goto 68d
      // 689: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 68c: athrow
      // 68d: ifeq 6a8
      // 690: goto 697
      // 693: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 696: athrow
      // 697: aload 1
      // 698: aload 11
      // 69a: aload 14
      // 69c: bipush 2
      // 69d: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 6a0: goto 6a7
      // 6a3: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6a6: athrow
      // 6a7: pop
      // 6a8: iload 5
      // 6aa: ifeq 7e4
      // 6ad: aload 13
      // 6af: goto 6b6
      // 6b2: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6b5: athrow
      // 6b6: aload 0
      // 6b7: if_acmpne 7e4
      // 6ba: aload 12
      // 6bc: astore 14
      // 6be: getstatic vt2$unz.fzl Lvt2$unz;
      // 6c1: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 6c4: astore 15
      // 6c6: aload 15
      // 6c8: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 6cd: ifeq 742
      // 6d0: aload 15
      // 6d2: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 6d7: checkcast vt2
      // 6da: astore 16
      // 6dc: aload 16
      // 6de: invokestatic pcl.y_8 (Lvt2;)Lh76;
      // 6e1: astore 17
      // 6e3: aload 4
      // 6e5: invokevirtual java/util/Random.nextBoolean ()Z
      // 6e8: iload 5
      // 6ea: ifne 752
      // 6ed: iload 5
      // 6ef: ifne 724
      // 6f2: goto 6f9
      // 6f5: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 6f8: athrow
      // 6f9: ifeq 73d
      // 6fc: goto 703
      // 6ff: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 702: athrow
      // 703: aload 3
      // 704: aload 17
      // 706: iload 5
      // 708: ifne 732
      // 70b: goto 712
      // 70e: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 711: athrow
      // 712: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 717: checkcast java/lang/Boolean
      // 71a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 71d: goto 724
      // 720: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 723: athrow
      // 724: ifeq 73d
      // 727: aload 14
      // 729: aload 17
      // 72b: goto 732
      // 72e: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 731: athrow
      // 732: bipush 1
      // 733: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 736: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 73b: astore 14
      // 73d: iload 5
      // 73f: ifeq 6c6
      // 742: aload 14
      // 744: getstatic pcl.qme Lh76;
      // 747: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 74c: checkcast java/lang/Boolean
      // 74f: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 752: iload 5
      // 754: ifne 7e3
      // 757: ifne 7d3
      // 75a: goto 761
      // 75d: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 760: athrow
      // 761: aload 14
      // 763: getstatic pcl.t6u Lh76;
      // 766: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 76b: checkcast java/lang/Boolean
      // 76e: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 771: iload 5
      // 773: ifne 7e3
      // 776: goto 77d
      // 779: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 77c: athrow
      // 77d: ifne 7d3
      // 780: goto 787
      // 783: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 786: athrow
      // 787: aload 14
      // 789: getstatic pcl.leq Lh76;
      // 78c: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 791: checkcast java/lang/Boolean
      // 794: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 797: iload 5
      // 799: ifne 7e3
      // 79c: goto 7a3
      // 79f: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7a2: athrow
      // 7a3: ifne 7d3
      // 7a6: goto 7ad
      // 7a9: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7ac: athrow
      // 7ad: aload 14
      // 7af: getstatic pcl.m4e Lh76;
      // 7b2: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 7b7: checkcast java/lang/Boolean
      // 7ba: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7bd: iload 5
      // 7bf: ifne 7e3
      // 7c2: goto 7c9
      // 7c5: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7c8: athrow
      // 7c9: ifeq 7e4
      // 7cc: goto 7d3
      // 7cf: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7d2: athrow
      // 7d3: aload 1
      // 7d4: aload 11
      // 7d6: aload 14
      // 7d8: bipush 2
      // 7d9: invokevirtual OpaquePredicate.vct (Lmew;Lzfz;I)Z
      // 7dc: goto 7e3
      // 7df: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 7e2: athrow
      // 7e3: pop
      // 7e4: return
   }

   @Override
   public zfz qk_(OpaquePredicate var1, mew var2, vt2 var3, float var4, float var5, float var6, int var7, Entity var8) {
      zfz var9 = this.l4i().zvi(hln, false).zvi(qme, false).zvi(t6u, false).zvi(leq, false).zvi(m4e, false);

      try {
         if (var3.e30().pyt()) {
            return var9.zvi(y_8(var3.b4b()), true);
         }
      } catch (IllegalArgumentException var10) {
         throw a(var10);
      }

      return var9;
   }

   @Override
   public u7m j39(zfz var1, Random var2, int var3) {
      return null;
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   @Override
   public void i4u(OpaquePredicate param1, ha9 param2, mew param3, zfz param4, pyk param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 6
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: ifne 6f
      // 0c: aload 2
      // 0d: invokevirtual ha9.b5z ()Lerg;
      // 10: iload 6
      // 12: ifeq 3d
      // 15: goto 1c
      // 18: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1b: athrow
      // 1c: ifnull 6f
      // 1f: goto 26
      // 22: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 25: athrow
      // 26: aload 2
      // 27: iload 6
      // 29: ifeq 4e
      // 2c: goto 33
      // 2f: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 32: athrow
      // 33: invokevirtual ha9.b5z ()Lerg;
      // 36: goto 3d
      // 39: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3c: athrow
      // 3d: invokevirtual erg.gn1 ()Lu7m;
      // 40: getstatic xbr.qsl Lguw;
      // 43: if_acmpne 6f
      // 46: aload 2
      // 47: goto 4e
      // 4a: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4d: athrow
      // 4e: getstatic l9p.hf_ [L_ss;
      // 51: aload 0
      // 52: invokestatic e0x.mxb (Le0x;)I
      // 55: aaload
      // 56: invokevirtual ha9.aex (L_ss;)V
      // 59: aload 1
      // 5a: aload 3
      // 5b: new erg
      // 5e: dup
      // 5f: getstatic ox_.s25 Le0x;
      // 62: bipush 1
      // 63: bipush 0
      // 64: invokespecial erg.<init> (Le0x;II)V
      // 67: invokestatic pcl.ymu (Lt9d;Lmew;Lerg;)V
      // 6a: iload 6
      // 6c: ifne 81
      // 6f: aload 0
      // 70: aload 1
      // 71: aload 2
      // 72: aload 3
      // 73: aload 4
      // 75: aload 5
      // 77: invokespecial e0x.i4u (Lt9d;Lha9;Lmew;Lzfz;Lpyk;)V
      // 7a: goto 81
      // 7d: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 80: athrow
      // 81: return
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public zfz kig(int var1) {
      int var2 = OpaquePredicate.c();

      zfz var10000;
      h76 var10001;
      int var10002;
      label73: {
         label72: {
            try {
               var10000 = this.l4i();
               var10001 = leq;
               var10002 = var1 & 1;
               if (var2 != 0) {
                  break label73;
               }

               if (var10002 > 0) {
                  break label72;
               }
            } catch (IllegalArgumentException var6) {
               throw a(var6);
            }

            var10002 = 0;
            break label73;
         }

         var10002 = 1;
      }

      label64: {
         label63: {
            try {
               var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
               var10001 = m4e;
               var10002 = var1 & 2;
               if (var2 != 0) {
                  break label64;
               }

               if (var10002 > 0) {
                  break label63;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }

            var10002 = 0;
            break label64;
         }

         var10002 = 1;
      }

      label55: {
         label54: {
            try {
               var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
               var10001 = qme;
               var10002 = var1 & 4;
               if (var2 != 0) {
                  break label55;
               }

               if (var10002 > 0) {
                  break label54;
               }
            } catch (IllegalArgumentException var4) {
               throw a(var4);
            }

            var10002 = 0;
            break label55;
         }

         var10002 = 1;
      }

      try {
         var10000 = var10000.zvi(var10001, Boolean.valueOf((boolean)var10002));
         var10001 = t6u;
         var10002 = var1 & 8;
         if (var2 != 0) {
            return var10000.zvi(t6u, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(t6u, true);
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = OpaquePredicate.c();
      byte var3 = 0;

      byte var10000;
      label69: {
         label68: {
            try {
               var10000 = (Boolean)var1.dil(leq);
               if (var2 != 0) {
                  break label69;
               }

               if (var10000 == 0) {
                  break label68;
               }
            } catch (IllegalArgumentException var7) {
               throw a(var7);
            }

            var3 |= 1;
         }

         var10000 = (Boolean)var1.dil(m4e);
      }

      label60: {
         label59: {
            try {
               if (var2 != 0) {
                  break label60;
               }

               if (var10000 == 0) {
                  break label59;
               }
            } catch (IllegalArgumentException var6) {
               throw a(var6);
            }

            var3 |= 2;
         }

         var10000 = (Boolean)var1.dil(qme);
      }

      label51: {
         label50: {
            try {
               if (var2 != 0) {
                  break label51;
               }

               if (var10000 == 0) {
                  break label50;
               }
            } catch (IllegalArgumentException var5) {
               throw a(var5);
            }

            var3 |= 4;
         }

         var10000 = (Boolean)var1.dil(t6u);
      }

      try {
         if (var2 != 0) {
            return var10000;
         }

         if (var10000 == 0) {
            return var3;
         }
      } catch (IllegalArgumentException var4) {
         throw a(var4);
      }

      var3 |= 8;
      return var3;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{hln, qme, t6u, leq, m4e});
   }

   public static h76 y_8(vt2 var0) {
      long var1 = b ^ 27315381089132L;

      try {
         switch (pcl$1.nry[var0.ordinal()]) {
            case 1:
               return hln;
            case 2:
               return qme;
            case 3:
               return leq;
            case 4:
               return t6u;
            case 5:
               return m4e;
         }
      } catch (IllegalArgumentException var3) {
         throw a(var3);
      }

      throw new IllegalArgumentException(var0 + b<"q">(876, 7856329998057016452L ^ var1));
   }

   public static int dt6(zfz param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: invokestatic OpaquePredicate.c ()I
      // 05: getstatic pcl.dy6 [Lh76;
      // 08: astore 3
      // 09: istore 1
      // 0a: aload 3
      // 0b: arraylength
      // 0c: istore 4
      // 0e: bipush 0
      // 0f: istore 5
      // 11: iload 5
      // 13: iload 4
      // 15: if_icmpge 4f
      // 18: aload 3
      // 19: iload 5
      // 1b: aaload
      // 1c: astore 6
      // 1e: iload 1
      // 1f: ifne 4b
      // 22: aload 0
      // 23: aload 6
      // 25: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 2a: checkcast java/lang/Boolean
      // 2d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 30: iload 1
      // 31: ifne 50
      // 34: goto 3b
      // 37: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a: athrow
      // 3b: ifeq 48
      // 3e: goto 45
      // 41: invokestatic pcl.a (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 44: athrow
      // 45: iinc 2 1
      // 48: iinc 5 1
      // 4b: iload 1
      // 4c: ifeq 11
      // 4f: iload 2
      // 50: ireturn
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-4358291947050511859L, 6818645411951744007L, MethodHandles.lookup().lookupClass()).a(243833764665911L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 36899844106607L;
      Cipher var0;
      Cipher var13 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = "å`\u0001 ¸\u0085\u0017Ó©«rÝ\u009c\u000e\u008cÂ\u0010ó\u0085êJ\u001a¹âV\u001f\rÊ¿BJêH(+\u009c|n\u001aîÄ\f9Ð!ú\u001dµ\bÅ(hß\u0019ÃÜG\u000b(\u00ad¹ä?a\u00167ÓÔ\u0011«ær9\u0081\u0010Jò×®b\u0096\u0018\u0015×C\u0012bÙ*\u001a³";
      int var6 = "å`\u0001 ¸\u0085\u0017Ó©«rÝ\u009c\u000e\u008cÂ\u0010ó\u0085êJ\u001a¹âV\u001f\rÊ¿BJêH(+\u009c|n\u001aîÄ\f9Ð!ú\u001dµ\bÅ(hß\u0019ÃÜG\u000b(\u00ad¹ä?a\u00167ÓÔ\u0011«ær9\u0081\u0010Jò×®b\u0096\u0018\u0015×C\u0012bÙ*\u001a³"
         .length();
      char var3 = 16;
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
                     h = new String[6];
                     hln = h76.d_1(b<"q">(13496, 8221486499752026448L ^ var9));
                     qme = h76.d_1(b<"q">(10026, 3557888672303690432L ^ var9));
                     t6u = h76.d_1(b<"q">(6154, 6509746158397787622L ^ var9));
                     leq = h76.d_1(b<"q">(26263, 4928030858092540794L ^ var9));
                     m4e = h76.d_1(b<"q">(10153, 3434894818336977472L ^ var9));
                     dy6 = new h76[]{hln, qme, leq, m4e, t6u};
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

                  var4 = "\u0096øB6¯º·Zä\n\u0018Ú\u0083§d`\u0010ÿ\u0002ýÔ\u0010º\u0004H¨´Å\u0019°Jö;";
                  var6 = "\u0096øB6¯º·Zä\n\u0018Ú\u0083§d`\u0010ÿ\u0002ýÔ\u0010º\u0004H¨´Å\u0019°Jö;".length();
                  var3 = 16;
                  var12 = -1;
            }

            var14 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static IllegalArgumentException a(IllegalArgumentException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26295;
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
            throw new RuntimeException("pcl", var10);
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
         throw new RuntimeException("pcl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
