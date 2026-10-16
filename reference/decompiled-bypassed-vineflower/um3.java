import java.lang.invoke.MethodHandles;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class um3 extends e0x {
   public static final qx_ go7;

   public um3() {
      super(p3y.f20);
      this.y8l(this._8_.c32().zvi(go7, vt2.rf3));
      this._p_(true);
      this.i3l(uja.qqf);
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

   private boolean isu(t9d param1, mew param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 1
      // 05: aload 2
      // 06: iload 3
      // 07: ifne 1f
      // 0a: invokestatic t9d.r3_ (Lm5n;Lmew;)Z
      // 0d: ifeq 1d
      // 10: goto 17
      // 13: invokestatic um3.b (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: ireturn
      // 19: invokestatic um3.b (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 1
      // 1e: aload 2
      // 1f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 22: invokeinterface zfz.r_y ()Le0x; 1
      // 27: astore 4
      // 29: aload 4
      // 2b: instanceof dqt
      // 2e: iload 3
      // 2f: ifne 80
      // 32: ifne 78
      // 35: goto 3c
      // 38: invokestatic um3.b (Loov;)Loov;
      // 3b: athrow
      // 3c: aload 4
      // 3e: getstatic ox_.fzi Le0x;
      // 41: iload 3
      // 42: ifne 6d
      // 45: goto 4c
      // 48: invokestatic um3.b (Loov;)Loov;
      // 4b: athrow
      // 4c: if_acmpeq 78
      // 4f: goto 56
      // 52: invokestatic um3.b (Loov;)Loov;
      // 55: athrow
      // 56: aload 4
      // 58: iload 3
      // 59: ifne 72
      // 5c: goto 63
      // 5f: invokestatic um3.b (Loov;)Loov;
      // 62: athrow
      // 63: getstatic ox_.nu3 Le0x;
      // 66: goto 6d
      // 69: invokestatic um3.b (Loov;)Loov;
      // 6c: athrow
      // 6d: if_acmpeq 78
      // 70: aload 4
      // 72: getstatic ox_.dh_ Lowm;
      // 75: if_acmpne 83
      // 78: bipush 1
      // 79: goto 80
      // 7c: invokestatic um3.b (Loov;)Loov;
      // 7f: athrow
      // 80: goto 84
      // 83: bipush 0
      // 84: ireturn
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 3
      // 04: getstatic um3.go7 Lqx_;
      // 07: invokevirtual qx_.isr ()Ljava/util/Collection;
      // 0a: invokeinterface java/util/Collection.iterator ()Ljava/util/Iterator; 1
      // 0f: astore 4
      // 11: aload 4
      // 13: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 18: ifeq 4e
      // 1b: aload 4
      // 1d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 22: checkcast vt2
      // 25: astore 5
      // 27: aload 0
      // 28: aload 1
      // 29: aload 2
      // 2a: aload 5
      // 2c: invokespecial um3.m_f (Lt9d;Lmew;Lvt2;)Z
      // 2f: iload 3
      // 30: ifeq 4f
      // 33: iload 3
      // 34: ifeq 49
      // 37: goto 3e
      // 3a: invokestatic um3.b (Loov;)Loov;
      // 3d: athrow
      // 3e: ifeq 4a
      // 41: goto 48
      // 44: invokestatic um3.b (Loov;)Loov;
      // 47: athrow
      // 48: bipush 1
      // 49: ireturn
      // 4a: iload 3
      // 4b: ifne 11
      // 4e: bipush 0
      // 4f: ireturn
   }

   private boolean m_f(t9d param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: aload 3
      // 02: invokevirtual vt2.b4b ()Lvt2;
      // 05: invokevirtual mew.offset (Lvt2;)Lmew;
      // 08: astore 5
      // 0a: invokestatic t9d.b ()I
      // 0d: aload 3
      // 0e: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 11: invokevirtual vt2$y0s.pyt ()Z
      // 14: istore 6
      // 16: istore 4
      // 18: iload 6
      // 1a: iload 4
      // 1c: ifeq 54
      // 1f: ifeq 46
      // 22: goto 29
      // 25: invokestatic um3.b (Loov;)Loov;
      // 28: athrow
      // 29: aload 1
      // 2a: aload 5
      // 2c: bipush 1
      // 2d: invokevirtual t9d.h9u (Lmew;Z)Z
      // 30: iload 4
      // 32: ifeq 81
      // 35: goto 3c
      // 38: invokestatic um3.b (Loov;)Loov;
      // 3b: athrow
      // 3c: ifne 80
      // 3f: goto 46
      // 42: invokestatic um3.b (Loov;)Loov;
      // 45: athrow
      // 46: aload 3
      // 47: getstatic vt2.rf3 Lvt2;
      // 4a: invokevirtual vt2.equals (Ljava/lang/Object;)Z
      // 4d: goto 54
      // 50: invokestatic um3.b (Loov;)Loov;
      // 53: athrow
      // 54: iload 4
      // 56: ifeq 71
      // 59: ifeq 84
      // 5c: goto 63
      // 5f: invokestatic um3.b (Loov;)Loov;
      // 62: athrow
      // 63: aload 0
      // 64: aload 1
      // 65: aload 5
      // 67: invokespecial um3.isu (Lt9d;Lmew;)Z
      // 6a: goto 71
      // 6d: invokestatic um3.b (Loov;)Loov;
      // 70: athrow
      // 71: iload 4
      // 73: ifeq 81
      // 76: ifeq 84
      // 79: goto 80
      // 7c: invokestatic um3.b (Loov;)Loov;
      // 7f: athrow
      // 80: bipush 1
      // 81: goto 85
      // 84: bipush 0
      // 85: ireturn
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 9
      // 05: aload 0
      // 06: iload 9
      // 08: ifeq 23
      // 0b: aload 1
      // 0c: aload 2
      // 0d: aload 3
      // 0e: invokespecial um3.m_f (Lt9d;Lmew;Lvt2;)Z
      // 11: ifeq 30
      // 14: goto 1b
      // 17: invokestatic um3.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: goto 23
      // 1f: invokestatic um3.b (Loov;)Loov;
      // 22: athrow
      // 23: invokevirtual um3.l4i ()Lzfz;
      // 26: getstatic um3.go7 Lqx_;
      // 29: aload 3
      // 2a: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 2f: areturn
      // 30: getstatic vt2$unz.fzl Lvt2$unz;
      // 33: invokevirtual vt2$unz.iterator ()Ljava/util/Iterator;
      // 36: astore 10
      // 38: aload 10
      // 3a: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 3f: ifeq 77
      // 42: aload 10
      // 44: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 49: checkcast vt2
      // 4c: astore 11
      // 4e: aload 1
      // 4f: aload 2
      // 50: aload 11
      // 52: invokevirtual vt2.b4b ()Lvt2;
      // 55: invokevirtual mew.offset (Lvt2;)Lmew;
      // 58: bipush 1
      // 59: invokevirtual t9d.h9u (Lmew;Z)Z
      // 5c: ifeq 72
      // 5f: aload 0
      // 60: invokevirtual um3.l4i ()Lzfz;
      // 63: getstatic um3.go7 Lqx_;
      // 66: aload 11
      // 68: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 6d: areturn
      // 6e: invokestatic um3.b (Loov;)Loov;
      // 71: athrow
      // 72: iload 9
      // 74: ifne 38
      // 77: aload 0
      // 78: invokevirtual um3.l4i ()Lzfz;
      // 7b: areturn
   }

   @Override
   public void tfc(t9d var1, mew var2, zfz var3) {
      this.c3_(var1, var2, var3);
   }

   @Override
   public void z3l(t9d var1, mew var2, zfz var3, e0x var4) {
      this._zm(var1, var2, var3);
   }

   public boolean _zm(t9d param1, mew param2, zfz param3) {
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
      // 08: aload 3
      // 09: invokevirtual um3.c3_ (Lt9d;Lmew;Lzfz;)Z
      // 0c: iload 4
      // 0e: ifne 1c
      // 11: ifne 1d
      // 14: goto 1b
      // 17: invokestatic um3.b (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 1
      // 1c: ireturn
      // 1d: aload 3
      // 1e: getstatic um3.go7 Lqx_;
      // 21: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 26: checkcast vt2
      // 29: astore 5
      // 2b: aload 5
      // 2d: invokevirtual vt2.e30 ()Lvt2$y0s;
      // 30: astore 6
      // 32: aload 5
      // 34: invokevirtual vt2.b4b ()Lvt2;
      // 37: astore 7
      // 39: bipush 0
      // 3a: istore 8
      // 3c: aload 6
      // 3e: invokevirtual vt2$y0s.pyt ()Z
      // 41: iload 4
      // 43: ifne 85
      // 46: ifeq 79
      // 49: goto 50
      // 4c: invokestatic um3.b (Loov;)Loov;
      // 4f: athrow
      // 50: aload 1
      // 51: aload 2
      // 52: aload 7
      // 54: invokevirtual mew.offset (Lvt2;)Lmew;
      // 57: bipush 1
      // 58: invokevirtual t9d.h9u (Lmew;Z)Z
      // 5b: iload 4
      // 5d: ifne 85
      // 60: goto 67
      // 63: invokestatic um3.b (Loov;)Loov;
      // 66: athrow
      // 67: ifne 79
      // 6a: goto 71
      // 6d: invokestatic um3.b (Loov;)Loov;
      // 70: athrow
      // 71: bipush 1
      // 72: istore 8
      // 74: iload 4
      // 76: ifeq b8
      // 79: aload 6
      // 7b: invokevirtual vt2$y0s.juw ()Z
      // 7e: goto 85
      // 81: invokestatic um3.b (Loov;)Loov;
      // 84: athrow
      // 85: iload 4
      // 87: ifne ba
      // 8a: ifeq b8
      // 8d: goto 94
      // 90: invokestatic um3.b (Loov;)Loov;
      // 93: athrow
      // 94: aload 0
      // 95: aload 1
      // 96: aload 2
      // 97: aload 7
      // 99: invokevirtual mew.offset (Lvt2;)Lmew;
      // 9c: invokespecial um3.isu (Lt9d;Lmew;)Z
      // 9f: iload 4
      // a1: ifne ba
      // a4: goto ab
      // a7: invokestatic um3.b (Loov;)Loov;
      // aa: athrow
      // ab: ifne b8
      // ae: goto b5
      // b1: invokestatic um3.b (Loov;)Loov;
      // b4: athrow
      // b5: bipush 1
      // b6: istore 8
      // b8: iload 8
      // ba: iload 4
      // bc: ifne de
      // bf: ifeq dd
      // c2: goto c9
      // c5: invokestatic um3.b (Loov;)Loov;
      // c8: athrow
      // c9: aload 0
      // ca: aload 1
      // cb: aload 2
      // cc: aload 3
      // cd: bipush 0
      // ce: invokevirtual um3.lf0 (Lt9d;Lmew;Lzfz;I)V
      // d1: aload 1
      // d2: aload 2
      // d3: invokevirtual t9d.i6x (Lmew;)Z
      // d6: pop
      // d7: bipush 1
      // d8: ireturn
      // d9: invokestatic um3.b (Loov;)Loov;
      // dc: athrow
      // dd: bipush 0
      // de: ireturn
   }

   public boolean c3_(t9d param1, mew param2, zfz param3) {
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
      // 06: invokeinterface zfz.r_y ()Le0x; 1
      // 0b: aload 0
      // 0c: iload 4
      // 0e: ifne 60
      // 11: if_acmpne 49
      // 14: goto 1b
      // 17: invokestatic um3.b (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: iload 4
      // 1e: ifne 5f
      // 21: goto 28
      // 24: invokestatic um3.b (Loov;)Loov;
      // 27: athrow
      // 28: aload 1
      // 29: aload 2
      // 2a: aload 3
      // 2b: getstatic um3.go7 Lqx_;
      // 2e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 33: checkcast vt2
      // 36: invokespecial um3.m_f (Lt9d;Lmew;Lvt2;)Z
      // 39: ifeq 49
      // 3c: goto 43
      // 3f: invokestatic um3.b (Loov;)Loov;
      // 42: athrow
      // 43: bipush 1
      // 44: ireturn
      // 45: invokestatic um3.b (Loov;)Loov;
      // 48: athrow
      // 49: aload 1
      // 4a: aload 2
      // 4b: iload 4
      // 4d: ifne 74
      // 50: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 53: invokeinterface zfz.r_y ()Le0x; 1
      // 58: goto 5f
      // 5b: invokestatic um3.b (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: if_acmpne 78
      // 63: aload 0
      // 64: aload 1
      // 65: aload 2
      // 66: aload 3
      // 67: bipush 0
      // 68: invokevirtual um3.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 6b: aload 1
      // 6c: aload 2
      // 6d: goto 74
      // 70: invokestatic um3.b (Loov;)Loov;
      // 73: athrow
      // 74: invokevirtual t9d.i6x (Lmew;)Z
      // 77: pop
      // 78: bipush 0
      // 79: ireturn
   }

   @Override
   public akm mns(t9d param1, mew param2, fqr param3, fqr param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: aload 2
      // 002: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 005: getstatic um3.go7 Lqx_;
      // 008: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 00d: checkcast vt2
      // 010: astore 6
      // 012: invokestatic t9d.b ()I
      // 015: ldc 0.15
      // 017: nop
      // 018: fstore 7
      // 01a: istore 5
      // 01c: aload 6
      // 01e: getstatic vt2.zk4 Lvt2;
      // 021: iload 5
      // 023: ifeq 063
      // 026: if_acmpne 057
      // 029: goto 030
      // 02c: invokestatic um3.b (Loov;)Loov;
      // 02f: athrow
      // 030: aload 0
      // 031: fconst_0
      // 032: ldc 0.2
      // 034: nop
      // 035: ldc 0.5
      // 037: nop
      // 038: fload 7
      // 03a: fsub
      // 03b: fload 7
      // 03d: fconst_2
      // 03e: fmul
      // 03f: ldc 0.8
      // 041: nop
      // 042: ldc 0.5
      // 044: nop
      // 045: fload 7
      // 047: fadd
      // 048: invokevirtual um3.xl4 (FFFFFF)V
      // 04b: iload 5
      // 04d: ifne 13a
      // 050: goto 057
      // 053: invokestatic um3.b (Loov;)Loov;
      // 056: athrow
      // 057: aload 6
      // 059: getstatic vt2.te4 Lvt2;
      // 05c: goto 063
      // 05f: invokestatic um3.b (Loov;)Loov;
      // 062: athrow
      // 063: iload 5
      // 065: ifeq 0a7
      // 068: if_acmpne 09b
      // 06b: goto 072
      // 06e: invokestatic um3.b (Loov;)Loov;
      // 071: athrow
      // 072: aload 0
      // 073: fconst_1
      // 074: fload 7
      // 076: fconst_2
      // 077: fmul
      // 078: fsub
      // 079: ldc 0.2
      // 07b: nop
      // 07c: ldc 0.5
      // 07e: nop
      // 07f: fload 7
      // 081: fsub
      // 082: fconst_1
      // 083: ldc 0.8
      // 085: nop
      // 086: ldc 0.5
      // 088: nop
      // 089: fload 7
      // 08b: fadd
      // 08c: invokevirtual um3.xl4 (FFFFFF)V
      // 08f: iload 5
      // 091: ifne 13a
      // 094: goto 09b
      // 097: invokestatic um3.b (Loov;)Loov;
      // 09a: athrow
      // 09b: aload 6
      // 09d: getstatic vt2.mxp Lvt2;
      // 0a0: goto 0a7
      // 0a3: invokestatic um3.b (Loov;)Loov;
      // 0a6: athrow
      // 0a7: iload 5
      // 0a9: ifeq 0e9
      // 0ac: if_acmpne 0dd
      // 0af: goto 0b6
      // 0b2: invokestatic um3.b (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 0
      // 0b7: ldc 0.5
      // 0b9: nop
      // 0ba: fload 7
      // 0bc: fsub
      // 0bd: ldc 0.2
      // 0bf: nop
      // 0c0: fconst_0
      // 0c1: ldc 0.5
      // 0c3: nop
      // 0c4: fload 7
      // 0c6: fadd
      // 0c7: ldc 0.8
      // 0c9: nop
      // 0ca: fload 7
      // 0cc: fconst_2
      // 0cd: fmul
      // 0ce: invokevirtual um3.xl4 (FFFFFF)V
      // 0d1: iload 5
      // 0d3: ifne 13a
      // 0d6: goto 0dd
      // 0d9: invokestatic um3.b (Loov;)Loov;
      // 0dc: athrow
      // 0dd: aload 6
      // 0df: getstatic vt2.z9q Lvt2;
      // 0e2: goto 0e9
      // 0e5: invokestatic um3.b (Loov;)Loov;
      // 0e8: athrow
      // 0e9: if_acmpne 115
      // 0ec: aload 0
      // 0ed: ldc 0.5
      // 0ef: nop
      // 0f0: fload 7
      // 0f2: fsub
      // 0f3: ldc 0.2
      // 0f5: nop
      // 0f6: fconst_1
      // 0f7: fload 7
      // 0f9: fconst_2
      // 0fa: fmul
      // 0fb: fsub
      // 0fc: ldc 0.5
      // 0fe: nop
      // 0ff: fload 7
      // 101: fadd
      // 102: ldc 0.8
      // 104: nop
      // 105: fconst_1
      // 106: invokevirtual um3.xl4 (FFFFFF)V
      // 109: iload 5
      // 10b: ifne 13a
      // 10e: goto 115
      // 111: invokestatic um3.b (Loov;)Loov;
      // 114: athrow
      // 115: ldc 0.1
      // 117: nop
      // 118: fstore 7
      // 11a: aload 0
      // 11b: ldc 0.5
      // 11d: nop
      // 11e: fload 7
      // 120: fsub
      // 121: fconst_0
      // 122: ldc 0.5
      // 124: nop
      // 125: fload 7
      // 127: fsub
      // 128: ldc 0.5
      // 12a: nop
      // 12b: fload 7
      // 12d: fadd
      // 12e: ldc 0.6
      // 130: nop
      // 131: ldc 0.5
      // 133: nop
      // 134: fload 7
      // 136: fadd
      // 137: invokevirtual um3.xl4 (FFFFFF)V
      // 13a: aload 0
      // 13b: aload 1
      // 13c: aload 2
      // 13d: aload 3
      // 13e: aload 4
      // 140: invokespecial e0x.mns (Lt9d;Lmew;Lfqr;Lfqr;)Lakm;
      // 143: areturn
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public void kyo(t9d var1, mew var2, zfz var3, Random var4) {
      vt2 var6 = (vt2)var3.dil(go7);
      double var7 = (double)var2.getX() + 0.5;
      int var10000 = t9d.b();
      double var9 = (double)var2.getY() + 0.7;
      double var11 = (double)var2.getZ() + 0.5;
      double var13 = 0.22;
      int var5 = var10000;
      double var15 = 0.27;

      label46: {
         label41: {
            try {
               if (var5 == 0) {
                  break label46;
               }

               if (!var6.e30().pyt()) {
                  break label41;
               }
            } catch (oov var20) {
               throw b(var20);
            }

            vt2 var17 = var6.b4b();

            try {
               var1.zvy(w_0.bac, var7 + var15 * (double)var17.n67(), var9 + var13, var11 + var15 * (double)var17.ozy(), 0.0, 0.0, 0.0, new int[0]);
               var1.zvy(w_0.jnp, var7 + var15 * (double)var17.n67(), var9 + var13, var11 + var15 * (double)var17.ozy(), 0.0, 0.0, 0.0, new int[0]);
               if (var5 != 0) {
                  return;
               }
            } catch (oov var19) {
               boolean var10001 = false;
               throw b(var19);
            }
         }

         try {
            var1.zvy(w_0.bac, var7, var9, var11, 0.0, 0.0, 0.0, new int[0]);
         } catch (oov var18) {
            boolean var22 = false;
            throw b(var18);
         }
      }

      var1.zvy(w_0.jnp, var7, var9, var11, 0.0, 0.0, 0.0, new int[0]);
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public zfz kig(int var1) {
      int var2 = t9d.b();
      zfz var3 = this.l4i();

      label40: {
         label39: {
            label38: {
               label37: {
                  try {
                     if (var2 == 0) {
                        break label37;
                     }

                     switch (var1) {
                        case 1:
                           break;
                        case 2:
                           break label38;
                        case 3:
                           break label39;
                        case 4:
                           break label40;
                        case 5:
                        default:
                           return var3.zvi(go7, vt2.rf3);
                     }
                  } catch (oov var4) {
                     throw b(var4);
                  }

                  var3 = var3.zvi(go7, vt2.zk4);
               }

               if (var2 != 0) {
                  return var3;
               }
            }

            var3 = var3.zvi(go7, vt2.te4);
            if (var2 != 0) {
               return var3;
            }
         }

         var3 = var3.zvi(go7, vt2.mxp);
         if (var2 != 0) {
            return var3;
         }
      }

      var3 = var3.zvi(go7, vt2.z9q);
      return var2 != 0 ? var3 : var3.zvi(go7, vt2.rf3);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   @Override
   public int hvp(zfz var1) {
      int var2 = t9d.c();
      byte var3 = 0;

      label58: {
         label50: {
            label49: {
               label48: {
                  try {
                     int var10000 = um3$2.dmm[((vt2)var1.dil(go7)).ordinal()];
                     if (var2 != 0) {
                        return var10000;
                     }

                     switch (var10000) {
                        case 1:
                           break;
                        case 2:
                           break label48;
                        case 3:
                           break label49;
                        case 4:
                           break label50;
                        case 5:
                        case 6:
                        default:
                           break label58;
                     }
                  } catch (oov var6) {
                     throw b(var6);
                  }

                  var3 |= 1;
                  if (var2 == 0) {
                     return var3;
                  }
               }

               var3 |= 2;
               if (var2 == 0) {
                  return var3;
               }
            }

            var3 |= 3;
            if (var2 == 0) {
               return var3;
            }
         }

         var3 |= 4;

         try {
            if (var2 == 0) {
               return var3;
            }
         } catch (oov var5) {
            boolean var10001 = false;
            throw b(var5);
         }
      }

      int var9;
      try {
         var9 = var3 | 5;
      } catch (oov var4) {
         boolean var8 = false;
         throw b(var4);
      }

      return var9;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{go7});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(8388442802951167885L, 2619153147980478539L, MethodHandles.lookup().lookupClass()).a(263986337552417L);
      // $VF: monitorexit
      long var4 = var10000 ^ 45421431847635L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("¿\u001e\u008aMö\u0003è®".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      go7 = qx_.q0o(var0, new um3$1());
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
}
