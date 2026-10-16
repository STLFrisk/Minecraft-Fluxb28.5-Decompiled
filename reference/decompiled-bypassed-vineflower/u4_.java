import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class u4_ extends e0x {
   public static final qx_ dju;
   public static final zb_ x38;
   public static final h76 t3h;

   public u4_() {
      super(p3y.f41);
      this.y8l(this._8_.c32().zvi(dju, vt2.z9q).zvi(x38, u4_$vxa.ek6).zvi(t3h, false));
      this.t4k(nsz);
      this.q6h(0.5F);
   }

   @Override
   public void f51(t9d param1, mew param2, zfz param3, ha9 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 4
      // 07: getfield ha9.lls Lpj2;
      // 0a: getfield pj2.g40 Z
      // 0d: ifeq 78
      // 10: aload 3
      // 11: getstatic u4_.dju Lqx_;
      // 14: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 19: checkcast vt2
      // 1c: astore 6
      // 1e: iload 5
      // 20: ifne 81
      // 23: aload 6
      // 25: ifnull 78
      // 28: goto 2f
      // 2b: invokestatic u4_.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 2
      // 30: aload 6
      // 32: invokevirtual vt2.b4b ()Lvt2;
      // 35: invokevirtual mew.offset (Lvt2;)Lmew;
      // 38: astore 7
      // 3a: aload 1
      // 3b: aload 7
      // 3d: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 40: invokeinterface zfz.r_y ()Le0x; 1
      // 45: astore 8
      // 47: aload 8
      // 49: getstatic ox_.nc0 Laog;
      // 4c: iload 5
      // 4e: ifne 67
      // 51: if_acmpeq 6a
      // 54: goto 5b
      // 57: invokestatic u4_.a (Loov;)Loov;
      // 5a: athrow
      // 5b: aload 8
      // 5d: getstatic ox_.wdk Laog;
      // 60: goto 67
      // 63: invokestatic u4_.a (Loov;)Loov;
      // 66: athrow
      // 67: if_acmpne 78
      // 6a: aload 1
      // 6b: aload 7
      // 6d: invokevirtual t9d.i6x (Lmew;)Z
      // 70: pop
      // 71: goto 78
      // 74: invokestatic u4_.a (Loov;)Loov;
      // 77: athrow
      // 78: aload 0
      // 79: aload 1
      // 7a: aload 2
      // 7b: aload 3
      // 7c: aload 4
      // 7e: invokespecial e0x.f51 (Lt9d;Lmew;Lzfz;Lha9;)V
      // 81: return
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
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: aload 3
      // 04: invokespecial e0x.b8f (Lt9d;Lmew;Lzfz;)V
      // 07: invokestatic t9d.b ()I
      // 0a: aload 3
      // 0b: getstatic u4_.dju Lqx_;
      // 0e: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 13: checkcast vt2
      // 16: invokevirtual vt2.b4b ()Lvt2;
      // 19: astore 5
      // 1b: istore 4
      // 1d: aload 2
      // 1e: aload 5
      // 20: invokevirtual mew.offset (Lvt2;)Lmew;
      // 23: astore 2
      // 24: aload 1
      // 25: aload 2
      // 26: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 29: astore 6
      // 2b: aload 6
      // 2d: iload 4
      // 2f: ifeq 6d
      // 32: invokeinterface zfz.r_y ()Le0x; 1
      // 37: getstatic ox_.nc0 Laog;
      // 3a: if_acmpeq 64
      // 3d: goto 44
      // 40: invokestatic u4_.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 6
      // 46: iload 4
      // 48: ifeq 6d
      // 4b: goto 52
      // 4e: invokestatic u4_.a (Loov;)Loov;
      // 51: athrow
      // 52: invokeinterface zfz.r_y ()Le0x; 1
      // 57: getstatic ox_.wdk Laog;
      // 5a: if_acmpne a6
      // 5d: goto 64
      // 60: invokestatic u4_.a (Loov;)Loov;
      // 63: athrow
      // 64: aload 6
      // 66: goto 6d
      // 69: invokestatic u4_.a (Loov;)Loov;
      // 6c: athrow
      // 6d: getstatic aog.cv2 Lh76;
      // 70: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 75: checkcast java/lang/Boolean
      // 78: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 7b: iload 4
      // 7d: ifeq a5
      // 80: ifeq a6
      // 83: goto 8a
      // 86: invokestatic u4_.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 6
      // 8c: invokeinterface zfz.r_y ()Le0x; 1
      // 91: aload 1
      // 92: aload 2
      // 93: aload 6
      // 95: bipush 0
      // 96: invokevirtual e0x.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 99: aload 1
      // 9a: aload 2
      // 9b: invokevirtual t9d.i6x (Lmew;)Z
      // 9e: goto a5
      // a1: invokestatic u4_.a (Loov;)Loov;
      // a4: athrow
      // a5: pop
      // a6: return
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
   public boolean ctq(t9d var1, mew var2) {
      return false;
   }

   @Override
   public boolean d9o(t9d var1, mew var2, vt2 var3) {
      return false;
   }

   @Override
   public int bzr(Random var1) {
      return 0;
   }

   @Override
   public void c76(t9d var1, mew var2, zfz var3, nh4 var4, List var5, i2h var6) {
      this.cnv(var3);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.grk(var3);
      super.c76(var1, var2, var3, var4, var5, var6);
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
   }

   private void grk(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc 0.25
      // 002: nop
      // 003: fstore 3
      // 004: invokestatic t9d.c ()I
      // 007: ldc 0.375
      // 009: nop
      // 00a: fstore 4
      // 00c: ldc 0.625
      // 00e: nop
      // 00f: fstore 5
      // 011: istore 2
      // 012: ldc 0.25
      // 014: nop
      // 015: fstore 6
      // 017: ldc 0.75
      // 019: nop
      // 01a: fstore 7
      // 01c: iload 2
      // 01d: ifne 077
      // 020: getstatic u4_$1.qj5 [I
      // 023: aload 1
      // 024: getstatic u4_.dju Lqx_;
      // 027: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 02c: checkcast vt2
      // 02f: invokevirtual vt2.ordinal ()I
      // 032: iaload
      // 033: tableswitch 223 1 6 41 72 103 134 165 196
      // 058: invokestatic u4_.a (Loov;)Loov;
      // 05b: athrow
      // 05c: aload 0
      // 05d: ldc 0.375
      // 05f: nop
      // 060: ldc 0.25
      // 062: nop
      // 063: ldc 0.375
      // 065: nop
      // 066: ldc 0.625
      // 068: nop
      // 069: fconst_1
      // 06a: ldc 0.625
      // 06c: nop
      // 06d: invokevirtual u4_.xl4 (FFFFFF)V
      // 070: goto 077
      // 073: invokestatic u4_.a (Loov;)Loov;
      // 076: athrow
      // 077: iload 2
      // 078: ifeq 112
      // 07b: aload 0
      // 07c: ldc 0.375
      // 07e: nop
      // 07f: fconst_0
      // 080: ldc 0.375
      // 082: nop
      // 083: ldc 0.625
      // 085: nop
      // 086: ldc 0.75
      // 088: nop
      // 089: ldc 0.625
      // 08b: nop
      // 08c: invokevirtual u4_.xl4 (FFFFFF)V
      // 08f: iload 2
      // 090: ifeq 112
      // 093: goto 09a
      // 096: invokestatic u4_.a (Loov;)Loov;
      // 099: athrow
      // 09a: aload 0
      // 09b: ldc 0.25
      // 09d: nop
      // 09e: ldc 0.375
      // 0a0: nop
      // 0a1: ldc 0.25
      // 0a3: nop
      // 0a4: ldc 0.75
      // 0a6: nop
      // 0a7: ldc 0.625
      // 0a9: nop
      // 0aa: fconst_1
      // 0ab: invokevirtual u4_.xl4 (FFFFFF)V
      // 0ae: iload 2
      // 0af: ifeq 112
      // 0b2: goto 0b9
      // 0b5: invokestatic u4_.a (Loov;)Loov;
      // 0b8: athrow
      // 0b9: aload 0
      // 0ba: ldc 0.25
      // 0bc: nop
      // 0bd: ldc 0.375
      // 0bf: nop
      // 0c0: fconst_0
      // 0c1: ldc 0.75
      // 0c3: nop
      // 0c4: ldc 0.625
      // 0c6: nop
      // 0c7: ldc 0.75
      // 0c9: nop
      // 0ca: invokevirtual u4_.xl4 (FFFFFF)V
      // 0cd: iload 2
      // 0ce: ifeq 112
      // 0d1: goto 0d8
      // 0d4: invokestatic u4_.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: ldc 0.375
      // 0db: nop
      // 0dc: ldc 0.25
      // 0de: nop
      // 0df: ldc 0.25
      // 0e1: nop
      // 0e2: ldc 0.625
      // 0e4: nop
      // 0e5: ldc 0.75
      // 0e7: nop
      // 0e8: fconst_1
      // 0e9: invokevirtual u4_.xl4 (FFFFFF)V
      // 0ec: iload 2
      // 0ed: ifeq 112
      // 0f0: goto 0f7
      // 0f3: invokestatic u4_.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: fconst_0
      // 0f9: ldc 0.375
      // 0fb: nop
      // 0fc: ldc 0.25
      // 0fe: nop
      // 0ff: ldc 0.75
      // 101: nop
      // 102: ldc 0.625
      // 104: nop
      // 105: ldc 0.75
      // 107: nop
      // 108: invokevirtual u4_.xl4 (FFFFFF)V
      // 10b: goto 112
      // 10e: invokestatic u4_.a (Loov;)Loov;
      // 111: athrow
      // 112: return
   }

   @Override
   public void c7i(m5n var1, mew var2) {
      this.cnv(var1.getBlockState(var2));
   }

   public void cnv(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc 0.25
      // 02: nop
      // 03: fstore 3
      // 04: invokestatic t9d.b ()I
      // 07: aload 1
      // 08: getstatic u4_.dju Lqx_;
      // 0b: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 10: checkcast vt2
      // 13: astore 4
      // 15: istore 2
      // 16: aload 4
      // 18: ifnull d6
      // 1b: getstatic u4_$1.qj5 [I
      // 1e: aload 4
      // 20: invokevirtual vt2.ordinal ()I
      // 23: iaload
      // 24: tableswitch 178 1 6 44 67 90 113 136 159
      // 4c: invokestatic u4_.a (Loov;)Loov;
      // 4f: athrow
      // 50: aload 0
      // 51: fconst_0
      // 52: fconst_0
      // 53: fconst_0
      // 54: fconst_1
      // 55: ldc 0.25
      // 57: nop
      // 58: fconst_1
      // 59: invokevirtual u4_.xl4 (FFFFFF)V
      // 5c: iload 2
      // 5d: ifne d6
      // 60: goto 67
      // 63: invokestatic u4_.a (Loov;)Loov;
      // 66: athrow
      // 67: aload 0
      // 68: fconst_0
      // 69: ldc 0.75
      // 6b: nop
      // 6c: fconst_0
      // 6d: fconst_1
      // 6e: fconst_1
      // 6f: fconst_1
      // 70: invokevirtual u4_.xl4 (FFFFFF)V
      // 73: iload 2
      // 74: ifne d6
      // 77: goto 7e
      // 7a: invokestatic u4_.a (Loov;)Loov;
      // 7d: athrow
      // 7e: aload 0
      // 7f: fconst_0
      // 80: fconst_0
      // 81: fconst_0
      // 82: fconst_1
      // 83: fconst_1
      // 84: ldc 0.25
      // 86: nop
      // 87: invokevirtual u4_.xl4 (FFFFFF)V
      // 8a: iload 2
      // 8b: ifne d6
      // 8e: goto 95
      // 91: invokestatic u4_.a (Loov;)Loov;
      // 94: athrow
      // 95: aload 0
      // 96: fconst_0
      // 97: fconst_0
      // 98: ldc 0.75
      // 9a: nop
      // 9b: fconst_1
      // 9c: fconst_1
      // 9d: fconst_1
      // 9e: invokevirtual u4_.xl4 (FFFFFF)V
      // a1: iload 2
      // a2: ifne d6
      // a5: goto ac
      // a8: invokestatic u4_.a (Loov;)Loov;
      // ab: athrow
      // ac: aload 0
      // ad: fconst_0
      // ae: fconst_0
      // af: fconst_0
      // b0: ldc 0.25
      // b2: nop
      // b3: fconst_1
      // b4: fconst_1
      // b5: invokevirtual u4_.xl4 (FFFFFF)V
      // b8: iload 2
      // b9: ifne d6
      // bc: goto c3
      // bf: invokestatic u4_.a (Loov;)Loov;
      // c2: athrow
      // c3: aload 0
      // c4: ldc 0.75
      // c6: nop
      // c7: fconst_0
      // c8: fconst_0
      // c9: fconst_1
      // ca: fconst_1
      // cb: fconst_1
      // cc: invokevirtual u4_.xl4 (FFFFFF)V
      // cf: goto d6
      // d2: invokestatic u4_.a (Loov;)Loov;
      // d5: athrow
      // d6: return
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
      // 00: aload 3
      // 01: getstatic u4_.dju Lqx_;
      // 04: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 09: checkcast vt2
      // 0c: astore 6
      // 0e: invokestatic t9d.b ()I
      // 11: aload 2
      // 12: aload 6
      // 14: invokevirtual vt2.b4b ()Lvt2;
      // 17: invokevirtual mew.offset (Lvt2;)Lmew;
      // 1a: astore 7
      // 1c: istore 5
      // 1e: aload 1
      // 1f: aload 7
      // 21: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 24: astore 8
      // 26: aload 8
      // 28: invokeinterface zfz.r_y ()Le0x; 1
      // 2d: iload 5
      // 2f: ifeq 7f
      // 32: getstatic ox_.nc0 Laog;
      // 35: if_acmpeq 71
      // 38: goto 3f
      // 3b: invokestatic u4_.a (Loov;)Loov;
      // 3e: athrow
      // 3f: aload 8
      // 41: invokeinterface zfz.r_y ()Le0x; 1
      // 46: iload 5
      // 48: ifeq 7f
      // 4b: goto 52
      // 4e: invokestatic u4_.a (Loov;)Loov;
      // 51: athrow
      // 52: getstatic ox_.wdk Laog;
      // 55: if_acmpeq 71
      // 58: goto 5f
      // 5b: invokestatic u4_.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 1
      // 60: aload 2
      // 61: invokevirtual t9d.i6x (Lmew;)Z
      // 64: pop
      // 65: iload 5
      // 67: ifne 89
      // 6a: goto 71
      // 6d: invokestatic u4_.a (Loov;)Loov;
      // 70: athrow
      // 71: aload 8
      // 73: invokeinterface zfz.r_y ()Le0x; 1
      // 78: goto 7f
      // 7b: invokestatic u4_.a (Loov;)Loov;
      // 7e: athrow
      // 7f: aload 1
      // 80: aload 7
      // 82: aload 8
      // 84: aload 4
      // 86: invokevirtual e0x.z3l (Lt9d;Lmew;Lzfz;Le0x;)V
      // 89: return
   }

   @Override
   public boolean ron(m5n var1, mew var2, vt2 var3) {
      return true;
   }

   public static vt2 r8f(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: bipush 7
      // 07: iand
      // 08: istore 2
      // 09: iload 2
      // 0a: iload 1
      // 0b: ifeq 22
      // 0e: bipush 5
      // 0f: if_icmple 21
      // 12: goto 19
      // 15: invokestatic u4_.a (Loov;)Loov;
      // 18: athrow
      // 19: aconst_null
      // 1a: goto 25
      // 1d: invokestatic u4_.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: invokestatic vt2.jw6 (I)Lvt2;
      // 25: areturn
   }

   @Override
   public u7m su9(t9d var1, mew var2) {
      try {
         if (var1.getBlockState(var2).dil(x38) == u4_$vxa.voo) {
            return u7m.gfm(ox_.wdk);
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return u7m.gfm(ox_.nc0);
   }

   @Override
   public zfz kig(int var1) {
      zfz var10000;
      zb_ var10001;
      try {
         var10000 = this.l4i().zvi(dju, r8f(var1));
         var10001 = x38;
         if ((var1 & 8) > 0) {
            return var10000.zvi(x38, u4_$vxa.voo);
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return var10000.zvi(var10001, u4_$vxa.ek6);
   }

   @Override
   public int hvp(zfz var1) {
      int var2 = t9d.c();
      int var3 = 0;
      int var10000 = var3 | ((vt2)var1.dil(dju)).c3s();
      if (var2 == 0) {
         var3 = var10000;
         if (var1.dil(x38) == u4_$vxa.voo) {
            var3 |= 8;
         }

         var10000 = var3;
      }

      return var10000;
   }

   @Override
   public g92 oz5() {
      return new g92(this, new xny[]{dju, x38, t3h});
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(3965745665640349875L, 716268048428249125L, MethodHandles.lookup().lookupClass()).a(257317558191601L);
      // $VF: monitorexit
      long var10 = var10000 ^ 115867301533422L;
      Cipher var1;
      Cipher var13 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var10 << var2 * 8 >>> 56));
      }

      var13.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var8 = new String[3];
      int var6 = 0;
      String var5 = "ÁýP´´CX\u0080\bÌ\u0004Ú ÓOnõ\bOG\u008cúþúA\u0098";
      int var7 = "ÁýP´´CX\u0080\bÌ\u0004Ú ÓOnõ\bOG\u008cúþúA\u0098".length();
      char var4 = '\b';
      int var3 = -1;

      while (true) {
         byte[] var9 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
         String var15 = b(var9).intern();
         byte var10001 = -1;
         var8[var6++] = var15;
         if ((var3 += var4) >= var7) {
            dju = qx_.jap(var8[2]);
            x38 = zb_.pq4(var8[1], u4_$vxa.class);
            t3h = h76.d_1(var8[0]);
            return;
         }

         var4 = var5.charAt(var3);
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
}
