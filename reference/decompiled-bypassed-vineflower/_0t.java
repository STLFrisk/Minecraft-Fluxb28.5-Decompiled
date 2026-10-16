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

public class _0t extends e0x {
   public static final zb_ b1t;
   public static final h76 cle;
   private static final long b;
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);

   public _0t() {
      super(p3y.f20);
      this.y8l(this._8_.c32().zvi(b1t, _0t$fty.d5e).zvi(cle, false));
      this.i3l(uja.yj_);
   }

   @Override
   public nh4 m__(t9d var1, mew var2, zfz var3) {
      return null;
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
      return g1d(var1, var2, var3.b4b());
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
      // 27: invokestatic _0t.g1d (Lt9d;Lmew;Lvt2;)Z
      // 2a: iload 3
      // 2b: ifeq 4d
      // 2e: goto 35
      // 31: invokestatic _0t.a (Loov;)Loov;
      // 34: athrow
      // 35: ifeq 45
      // 38: goto 3f
      // 3b: invokestatic _0t.a (Loov;)Loov;
      // 3e: athrow
      // 3f: bipush 1
      // 40: ireturn
      // 41: invokestatic _0t.a (Loov;)Loov;
      // 44: athrow
      // 45: iinc 6 1
      // 48: iload 3
      // 49: ifne 11
      // 4c: bipush 0
      // 4d: ireturn
   }

   public static boolean g1d(t9d var0, mew var1, vt2 var2) {
      return wzi.bnn(var0, var1, var2);
   }

   @Override
   public zfz qk_(t9d param1, mew param2, vt2 param3, float param4, float param5, float param6, int param7, g_3 param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 9
      // 05: aload 0
      // 06: invokevirtual _0t.l4i ()Lzfz;
      // 09: getstatic _0t.cle Lh76;
      // 0c: bipush 0
      // 0d: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 10: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 15: astore 10
      // 17: aload 1
      // 18: aload 2
      // 19: aload 3
      // 1a: invokevirtual vt2.b4b ()Lvt2;
      // 1d: invokestatic _0t.g1d (Lt9d;Lmew;Lvt2;)Z
      // 20: ifeq 3b
      // 23: aload 10
      // 25: getstatic _0t.b1t Lzb_;
      // 28: aload 3
      // 29: aload 8
      // 2b: invokevirtual g_3.u0f ()Lvt2;
      // 2e: invokestatic _0t$fty._h_ (Lvt2;Lvt2;)L_0t$fty;
      // 31: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 36: areturn
      // 37: invokestatic _0t.a (Loov;)Loov;
      // 3a: athrow
      // 3b: getstatic vt2$unz.fzl Lvt2$unz;
      // 3e: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 41: astore 11
      // 43: aload 11
      // 45: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4a: ifeq 9d
      // 4d: aload 11
      // 4f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 54: checkcast vt2
      // 57: astore 12
      // 59: iload 9
      // 5b: ifne c2
      // 5e: aload 12
      // 60: aload 3
      // 61: if_acmpeq 98
      // 64: goto 6b
      // 67: invokestatic _0t.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 1
      // 6c: aload 2
      // 6d: aload 12
      // 6f: invokevirtual vt2.b4b ()Lvt2;
      // 72: invokestatic _0t.g1d (Lt9d;Lmew;Lvt2;)Z
      // 75: ifeq 98
      // 78: goto 7f
      // 7b: invokestatic _0t.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 10
      // 81: getstatic _0t.b1t Lzb_;
      // 84: aload 12
      // 86: aload 8
      // 88: invokevirtual g_3.u0f ()Lvt2;
      // 8b: invokestatic _0t$fty._h_ (Lvt2;Lvt2;)L_0t$fty;
      // 8e: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 93: areturn
      // 94: invokestatic _0t.a (Loov;)Loov;
      // 97: athrow
      // 98: iload 9
      // 9a: ifeq 43
      // 9d: aload 1
      // 9e: aload 2
      // 9f: invokevirtual mew.eve ()Lmew;
      // a2: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // a5: ifeq c2
      // a8: aload 10
      // aa: getstatic _0t.b1t Lzb_;
      // ad: getstatic vt2.rf3 Lvt2;
      // b0: aload 8
      // b2: invokevirtual g_3.u0f ()Lvt2;
      // b5: invokestatic _0t$fty._h_ (Lvt2;Lvt2;)L_0t$fty;
      // b8: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // bd: areturn
      // be: invokestatic _0t.a (Loov;)Loov;
      // c1: athrow
      // c2: aload 10
      // c4: areturn
   }

   public static int o2_(vt2 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: getstatic _0t$1.m52 [I
      // 07: aload 0
      // 08: invokevirtual vt2.ordinal ()I
      // 0b: iaload
      // 0c: iload 1
      // 0d: ifeq 4d
      // 10: tableswitch 60 1 6 44 50 52 54 56 58
      // 38: invokestatic _0t.a (Loov;)Loov;
      // 3b: athrow
      // 3c: bipush 0
      // 3d: ireturn
      // 3e: invokestatic _0t.a (Loov;)Loov;
      // 41: athrow
      // 42: bipush 5
      // 43: ireturn
      // 44: bipush 4
      // 45: ireturn
      // 46: bipush 3
      // 47: ireturn
      // 48: bipush 2
      // 49: ireturn
      // 4a: bipush 1
      // 4b: ireturn
      // 4c: bipush -1
      // 4d: ireturn
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
      // 09: invokespecial _0t.ogk (Lt9d;Lmew;Lzfz;)Z
      // 0c: iload 5
      // 0e: ifeq 39
      // 11: ifeq 5d
      // 14: goto 1b
      // 17: invokestatic _0t.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: aload 2
      // 1d: aload 3
      // 1e: getstatic _0t.b1t Lzb_;
      // 21: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 26: checkcast _0t$fty
      // 29: invokevirtual _0t$fty.pt5 ()Lvt2;
      // 2c: invokevirtual vt2.b4b ()Lvt2;
      // 2f: invokestatic _0t.g1d (Lt9d;Lmew;Lvt2;)Z
      // 32: goto 39
      // 35: invokestatic _0t.a (Loov;)Loov;
      // 38: athrow
      // 39: iload 5
      // 3b: ifeq 5c
      // 3e: ifne 5d
      // 41: goto 48
      // 44: invokestatic _0t.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 0
      // 49: aload 1
      // 4a: aload 2
      // 4b: aload 3
      // 4c: bipush 0
      // 4d: invokevirtual _0t.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 50: aload 1
      // 51: aload 2
      // 52: invokevirtual t9d.i6x (Lmew;)Z
      // 55: goto 5c
      // 58: invokestatic _0t.a (Loov;)Loov;
      // 5b: athrow
      // 5c: pop
      // 5d: return
   }

   private boolean ogk(t9d param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: invokevirtual _0t.ctq (Lt9d;Lmew;)Z
      // 0b: iload 4
      // 0d: ifeq 2f
      // 10: ifeq 20
      // 13: goto 1a
      // 16: invokestatic _0t.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: ireturn
      // 1c: invokestatic _0t.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: aload 2
      // 23: aload 3
      // 24: bipush 0
      // 25: invokevirtual _0t.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 28: aload 1
      // 29: aload 2
      // 2a: invokevirtual t9d.i6x (Lmew;)Z
      // 2d: pop
      // 2e: bipush 0
      // 2f: ireturn
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
      // 000: invokestatic t9d.b ()I
      // 003: istore 3
      // 004: ldc 0.1875
      // 006: nop
      // 007: fstore 4
      // 009: iload 3
      // 00a: ifeq 07a
      // 00d: getstatic _0t$1.j53 [I
      // 010: aload 1
      // 011: aload 2
      // 012: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 017: getstatic _0t.b1t Lzb_;
      // 01a: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 01f: checkcast _0t$fty
      // 022: invokevirtual _0t$fty.ordinal ()I
      // 025: iaload
      // 026: tableswitch 284 1 8 50 88 128 166 206 206 247 247
      // 054: invokestatic _0t.a (Loov;)Loov;
      // 057: athrow
      // 058: aload 0
      // 059: fconst_0
      // 05a: ldc 0.2
      // 05c: nop
      // 05d: ldc 0.5
      // 05f: nop
      // 060: fload 4
      // 062: fsub
      // 063: fload 4
      // 065: fconst_2
      // 066: fmul
      // 067: ldc 0.8
      // 069: nop
      // 06a: ldc 0.5
      // 06c: nop
      // 06d: fload 4
      // 06f: fadd
      // 070: invokevirtual _0t.xl4 (FFFFFF)V
      // 073: goto 07a
      // 076: invokestatic _0t.a (Loov;)Loov;
      // 079: athrow
      // 07a: iload 3
      // 07b: ifne 142
      // 07e: aload 0
      // 07f: fconst_1
      // 080: fload 4
      // 082: fconst_2
      // 083: fmul
      // 084: fsub
      // 085: ldc 0.2
      // 087: nop
      // 088: ldc 0.5
      // 08a: nop
      // 08b: fload 4
      // 08d: fsub
      // 08e: fconst_1
      // 08f: ldc 0.8
      // 091: nop
      // 092: ldc 0.5
      // 094: nop
      // 095: fload 4
      // 097: fadd
      // 098: invokevirtual _0t.xl4 (FFFFFF)V
      // 09b: iload 3
      // 09c: ifne 142
      // 09f: goto 0a6
      // 0a2: invokestatic _0t.a (Loov;)Loov;
      // 0a5: athrow
      // 0a6: aload 0
      // 0a7: ldc 0.5
      // 0a9: nop
      // 0aa: fload 4
      // 0ac: fsub
      // 0ad: ldc 0.2
      // 0af: nop
      // 0b0: fconst_0
      // 0b1: ldc 0.5
      // 0b3: nop
      // 0b4: fload 4
      // 0b6: fadd
      // 0b7: ldc 0.8
      // 0b9: nop
      // 0ba: fload 4
      // 0bc: fconst_2
      // 0bd: fmul
      // 0be: invokevirtual _0t.xl4 (FFFFFF)V
      // 0c1: iload 3
      // 0c2: ifne 142
      // 0c5: goto 0cc
      // 0c8: invokestatic _0t.a (Loov;)Loov;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: ldc 0.5
      // 0cf: nop
      // 0d0: fload 4
      // 0d2: fsub
      // 0d3: ldc 0.2
      // 0d5: nop
      // 0d6: fconst_1
      // 0d7: fload 4
      // 0d9: fconst_2
      // 0da: fmul
      // 0db: fsub
      // 0dc: ldc 0.5
      // 0de: nop
      // 0df: fload 4
      // 0e1: fadd
      // 0e2: ldc 0.8
      // 0e4: nop
      // 0e5: fconst_1
      // 0e6: invokevirtual _0t.xl4 (FFFFFF)V
      // 0e9: iload 3
      // 0ea: ifne 142
      // 0ed: goto 0f4
      // 0f0: invokestatic _0t.a (Loov;)Loov;
      // 0f3: athrow
      // 0f4: ldc 0.25
      // 0f6: nop
      // 0f7: fstore 4
      // 0f9: aload 0
      // 0fa: ldc 0.5
      // 0fc: nop
      // 0fd: fload 4
      // 0ff: fsub
      // 100: fconst_0
      // 101: ldc 0.5
      // 103: nop
      // 104: fload 4
      // 106: fsub
      // 107: ldc 0.5
      // 109: nop
      // 10a: fload 4
      // 10c: fadd
      // 10d: ldc 0.6
      // 10f: nop
      // 110: ldc 0.5
      // 112: nop
      // 113: fload 4
      // 115: fadd
      // 116: invokevirtual _0t.xl4 (FFFFFF)V
      // 119: iload 3
      // 11a: ifne 142
      // 11d: ldc 0.25
      // 11f: nop
      // 120: fstore 4
      // 122: aload 0
      // 123: ldc 0.5
      // 125: nop
      // 126: fload 4
      // 128: fsub
      // 129: ldc 0.4
      // 12b: nop
      // 12c: ldc 0.5
      // 12e: nop
      // 12f: fload 4
      // 131: fsub
      // 132: ldc 0.5
      // 134: nop
      // 135: fload 4
      // 137: fadd
      // 138: fconst_1
      // 139: ldc 0.5
      // 13b: nop
      // 13c: fload 4
      // 13e: fadd
      // 13f: invokevirtual _0t.xl4 (FFFFFF)V
      // 142: return
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
      // 00: getstatic _0t.b J
      // 03: ldc2_w 134317534028180
      // 06: lxor
      // 07: lstore 9
      // 09: invokestatic t9d.b ()I
      // 0c: istore 11
      // 0e: aload 1
      // 0f: getfield t9d.v0f Z
      // 12: iload 11
      // 14: ifeq 38
      // 17: ifeq 27
      // 1a: goto 21
      // 1d: invokestatic _0t.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 1
      // 22: ireturn
      // 23: invokestatic _0t.a (Loov;)Loov;
      // 26: athrow
      // 27: aload 3
      // 28: getstatic _0t.cle Lh76;
      // 2b: invokeinterface zfz.dm4 (Lxny;)Lzfz; 2
      // 30: astore 3
      // 31: aload 1
      // 32: aload 2
      // 33: aload 3
      // 34: bipush 3
      // 35: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 38: pop
      // 39: aload 1
      // 3a: aload 2
      // 3b: invokevirtual mew.getX ()I
      // 3e: i2d
      // 3f: ldc2_w 0.5
      // 42: dadd
      // 43: aload 2
      // 44: invokevirtual mew.getY ()I
      // 47: i2d
      // 48: ldc2_w 0.5
      // 4b: dadd
      // 4c: aload 2
      // 4d: invokevirtual mew.getZ ()I
      // 50: i2d
      // 51: ldc2_w 0.5
      // 54: dadd
      // 55: sipush 4427
      // 58: ldc2_w 1579456739202117474
      // 5b: lload 9
      // 5d: lxor
      // 5e: invokedynamic d (IJ)Ljava/lang/String; bsm=_0t.b (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[  ]
      // 63: nop
      // 64: ldc 0.3
      // 66: nop
      // 67: aload 3
      // 68: getstatic _0t.cle Lh76;
      // 6b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 70: checkcast java/lang/Boolean
      // 73: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 76: ifeq 83
      // 79: ldc 0.6
      // 7b: nop
      // 7c: goto 86
      // 7f: invokestatic _0t.a (Loov;)Loov;
      // 82: athrow
      // 83: ldc 0.5
      // 85: nop
      // 86: invokevirtual t9d.amg (DDDLjava/lang/String;FF)V
      // 89: aload 1
      // 8a: aload 2
      // 8b: aload 0
      // 8c: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 8f: aload 3
      // 90: getstatic _0t.b1t Lzb_;
      // 93: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 98: checkcast _0t$fty
      // 9b: invokevirtual _0t$fty.pt5 ()Lvt2;
      // 9e: astore 12
      // a0: aload 1
      // a1: aload 2
      // a2: aload 12
      // a4: invokevirtual vt2.b4b ()Lvt2;
      // a7: invokevirtual mew.offset (Lvt2;)Lmew;
      // aa: aload 0
      // ab: invokevirtual t9d._0o (Lmew;Le0x;)V
      // ae: bipush 1
      // af: ireturn
   }

   @Override
   public void b8f(t9d param1, mew param2, zfz param3) {
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
      // 06: getstatic _0t.cle Lh76;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Boolean
      // 11: iload 4
      // 13: ifne 39
      // 16: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19: ifeq 4f
      // 1c: goto 23
      // 1f: invokestatic _0t.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: aload 2
      // 25: aload 0
      // 26: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 29: aload 3
      // 2a: getstatic _0t.b1t Lzb_;
      // 2d: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 32: goto 39
      // 35: invokestatic _0t.a (Loov;)Loov;
      // 38: athrow
      // 39: checkcast _0t$fty
      // 3c: invokevirtual _0t$fty.pt5 ()Lvt2;
      // 3f: astore 5
      // 41: aload 1
      // 42: aload 2
      // 43: aload 5
      // 45: invokevirtual vt2.b4b ()Lvt2;
      // 48: invokevirtual mew.offset (Lvt2;)Lmew;
      // 4b: aload 0
      // 4c: invokevirtual t9d._0o (Lmew;Le0x;)V
      // 4f: aload 0
      // 50: aload 1
      // 51: aload 2
      // 52: aload 3
      // 53: invokespecial e0x.b8f (Lt9d;Lmew;Lzfz;)V
      // 56: return
   }

   @Override
   public int gpi(m5n var1, mew var2, zfz var3, vt2 var4) {
      int var5 = t9d.b();

      try {
         byte var10000 = (Boolean)var3.dil(cle);
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
      // 06: getstatic _0t.cle Lh76;
      // 09: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e: checkcast java/lang/Boolean
      // 11: iload 5
      // 13: ifne 34
      // 16: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 19: ifne 2b
      // 1c: goto 23
      // 1f: invokestatic _0t.a (Loov;)Loov;
      // 22: athrow
      // 23: bipush 0
      // 24: goto 49
      // 27: invokestatic _0t.a (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 3
      // 2c: getstatic _0t.b1t Lzb_;
      // 2f: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 34: checkcast _0t$fty
      // 37: invokevirtual _0t$fty.pt5 ()Lvt2;
      // 3a: aload 4
      // 3c: if_acmpne 48
      // 3f: bipush 15
      // 41: goto 49
      // 44: invokestatic _0t.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
   }

   @Override
   public boolean scl() {
      return true;
   }

   @Override
   public zfz kig(int var1) {
      int var2 = t9d.b();

      zfz var10000;
      h76 var10001;
      try {
         var10000 = this.l4i().zvi(b1t, _0t$fty.v1t(var1 & 7));
         var10001 = cle;
         int var10002 = var1 & 8;
         if (var2 == 0) {
            return var10000.zvi(cle, Boolean.valueOf((boolean)var10002));
         }

         if (var10002 > 0) {
            return var10000.zvi(cle, true);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return var10000.zvi(var10001, false);
   }

   @Override
   public int hvp(zfz var1) {
      int var3 = 0;
      int var10000 = t9d.b();
      var3 |= ((_0t$fty)var1.dil(b1t)).yg6();
      int var2 = var10000;

      try {
         byte var6 = (Boolean)var1.dil(cle);
         if (var2 == 0) {
            return var6;
         }

         if (var6 == 0) {
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
      return new g92(this, new xny[]{b1t, cle});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3655551642961472064L, 4463243177752196135L, MethodHandles.lookup().lookupClass()).a(235221438173312L);
      // $VF: monitorexit
      b = var10000;
      long var9 = b ^ 47307582599478L;
      Cipher var0;
      Cipher var12 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "Ò-ë\u0002ì\u009a3iÜ\u008d\u00ad¤ÊOÏñ\u0010Ã\u008aÏ'$\u0093E\u0012\u0014Õu\u009d=\u0005²e\u0018NY\u0016fóv\u0093Ó±)T6\u0095\n´#Ê£Ì|\u0011\u0002à\u0092";
      int var6 = "Ò-ë\u0002ì\u009a3iÜ\u008d\u00ad¤ÊOÏñ\u0010Ã\u008aÏ'$\u0093E\u0012\u0014Õu\u009d=\u0005²e\u0018NY\u0016fóv\u0093Ó±)T6\u0095\n´#Ê£Ì|\u0011\u0002à\u0092"
         .length();
      char var3 = 16;
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            d = var7;
            h = new String[3];
            b1t = zb_.pq4(b<"d">(11399, 8373880738566980110L ^ var9), _0t$fty.class);
            cle = h76.d_1(b<"d">(11388, 8366193037901710068L ^ var9));
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5790;
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
            throw new RuntimeException("_0t", var10);
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
         throw new RuntimeException("_0t" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
