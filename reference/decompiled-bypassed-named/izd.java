import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public abstract class izd extends e0x {
   public static final zb_ _9x;

   public izd(p3y param1) {
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
      // 05: aload 1
      // 06: invokespecial e0x.<init> (Lp3y;)V
      // 09: aload 0
      // 0a: iload 2
      // 0b: ifne 2c
      // 0e: invokevirtual izd.t7p ()Z
      // 11: ifeq 24
      // 14: aload 0
      // 15: bipush 1
      // 16: putfield izd.s23 Z
      // 19: iload 2
      // 1a: ifeq 37
      // 1d: goto 24
      // 20: invokestatic izd.b (Loov;)Loov;
      // 23: athrow
      // 24: aload 0
      // 25: goto 2c
      // 28: invokestatic izd.b (Loov;)Loov;
      // 2b: athrow
      // 2c: fconst_0
      // 2d: fconst_0
      // 2e: fconst_0
      // 2f: fconst_1
      // 30: ldc 0.5
      // 32: nop
      // 33: fconst_1
      // 34: invokevirtual izd.xl4 (FFFFFF)V
      // 37: aload 0
      // 38: sipush 255
      // 3b: invokevirtual izd.opa (I)Le0x;
      // 3e: pop
      // 3f: return
   }

   @Override
   public boolean row() {
      return false;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: iload 3
      // 06: ifne 1e
      // 09: invokevirtual izd.t7p ()Z
      // 0c: ifeq 2b
      // 0f: goto 16
      // 12: invokestatic izd.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic izd.b (Loov;)Loov;
      // 1d: athrow
      // 1e: fconst_0
      // 1f: fconst_0
      // 20: fconst_0
      // 21: fconst_1
      // 22: fconst_1
      // 23: fconst_1
      // 24: invokevirtual izd.xl4 (FFFFFF)V
      // 27: iload 3
      // 28: ifeq 8b
      // 2b: aload 1
      // 2c: aload 2
      // 2d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 32: astore 4
      // 34: aload 4
      // 36: iload 3
      // 37: ifne 53
      // 3a: invokeinterface zfz.r_y ()Le0x; 1
      // 3f: aload 0
      // 40: if_acmpne 8b
      // 43: goto 4a
      // 46: invokestatic izd.b (Loov;)Loov;
      // 49: athrow
      // 4a: aload 4
      // 4c: goto 53
      // 4f: invokestatic izd.b (Loov;)Loov;
      // 52: athrow
      // 53: getstatic izd._9x Lzb_;
      // 56: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 5b: getstatic izd$jc0.l7i Lizd$jc0;
      // 5e: if_acmpne 78
      // 61: aload 0
      // 62: fconst_0
      // 63: ldc 0.5
      // 65: nop
      // 66: fconst_0
      // 67: fconst_1
      // 68: fconst_1
      // 69: fconst_1
      // 6a: invokevirtual izd.xl4 (FFFFFF)V
      // 6d: iload 3
      // 6e: ifeq 8b
      // 71: goto 78
      // 74: invokestatic izd.b (Loov;)Loov;
      // 77: athrow
      // 78: aload 0
      // 79: fconst_0
      // 7a: fconst_0
      // 7b: fconst_0
      // 7c: fconst_1
      // 7d: ldc 0.5
      // 7f: nop
      // 80: fconst_1
      // 81: invokevirtual izd.xl4 (FFFFFF)V
      // 84: goto 8b
      // 87: invokestatic izd.b (Loov;)Loov;
      // 8a: athrow
      // 8b: return
   }

   @Override
   public void bf6() {
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
      // 06: ifeq 33
      // 09: invokevirtual izd.t7p ()Z
      // 0c: ifeq 2b
      // 0f: goto 16
      // 12: invokestatic izd.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: fconst_0
      // 18: fconst_0
      // 19: fconst_0
      // 1a: fconst_1
      // 1b: fconst_1
      // 1c: fconst_1
      // 1d: invokevirtual izd.xl4 (FFFFFF)V
      // 20: iload 1
      // 21: ifne 3e
      // 24: goto 2b
      // 27: invokestatic izd.b (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 0
      // 2c: goto 33
      // 2f: invokestatic izd.b (Loov;)Loov;
      // 32: athrow
      // 33: fconst_0
      // 34: fconst_0
      // 35: fconst_0
      // 36: fconst_1
      // 37: ldc 0.5
      // 39: nop
      // 3a: fconst_1
      // 3b: invokevirtual izd.xl4 (FFFFFF)V
      // 3e: return
   }

   @Override
   public void c76(OpaquePredicate var1, mew var2, zfz var3, nh4 var4, List var5, EntityLivingBase var6) {
      this.c7i(var1, var2);
      super.c76(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean ko5() {
      return this.t7p();
   }

   @Override
   public zfz qk_(OpaquePredicate param1, mew param2, vt2 param3, float param4, float param5, float param6, int param7, Entity param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 9
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: fload 4
      // 0b: fload 5
      // 0d: fload 6
      // 0f: iload 7
      // 11: aload 8
      // 13: invokespecial e0x.qk_ (Lt9d;Lmew;Lvt2;FFFILg_3;)Lzfz;
      // 16: getstatic izd._9x Lzb_;
      // 19: getstatic izd$jc0.ct4 Lizd$jc0;
      // 1c: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 21: astore 10
      // 23: aload 0
      // 24: invokevirtual izd.t7p ()Z
      // 27: ifeq 33
      // 2a: aload 10
      // 2c: goto 7b
      // 2f: invokestatic izd.b (Loov;)Loov;
      // 32: athrow
      // 33: aload 3
      // 34: getstatic vt2.m3r Lvt2;
      // 37: iload 9
      // 39: ifeq 51
      // 3c: if_acmpeq 6e
      // 3f: goto 46
      // 42: invokestatic izd.b (Loov;)Loov;
      // 45: athrow
      // 46: aload 3
      // 47: getstatic vt2.rf3 Lvt2;
      // 4a: goto 51
      // 4d: invokestatic izd.b (Loov;)Loov;
      // 50: athrow
      // 51: if_acmpeq 65
      // 54: fload 5
      // 56: f2d
      // 57: ldc2_w 0.5
      // 5a: dcmpg
      // 5b: ifgt 6e
      // 5e: goto 65
      // 61: invokestatic izd.b (Loov;)Loov;
      // 64: athrow
      // 65: aload 10
      // 67: goto 7b
      // 6a: invokestatic izd.b (Loov;)Loov;
      // 6d: athrow
      // 6e: aload 10
      // 70: getstatic izd._9x Lzb_;
      // 73: getstatic izd$jc0.l7i Lizd$jc0;
      // 76: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 7b: areturn
   }

   @Override
   public int bzr(Random var1) {
      int var2 = OpaquePredicate.b();

      try {
         byte var10000 = this.t7p();
         if (var2 == 0) {
            return var10000;
         }

         if (var10000 != 0) {
            return 2;
         }
      } catch (oov var3) {
         throw b(var3);
      }

      return 1;
   }

   @Override
   public boolean gck() {
      return this.t7p();
   }

   @Override
   public boolean ron(m5n param1, mew param2, vt2 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 4
      // 005: aload 0
      // 006: invokevirtual izd.t7p ()Z
      // 009: iload 4
      // 00b: ifne 026
      // 00e: ifeq 027
      // 011: goto 018
      // 014: invokestatic izd.b (Loov;)Loov;
      // 017: athrow
      // 018: aload 0
      // 019: aload 1
      // 01a: aload 2
      // 01b: aload 3
      // 01c: invokespecial e0x.ron (Lm5n;Lmew;Lvt2;)Z
      // 01f: goto 026
      // 022: invokestatic izd.b (Loov;)Loov;
      // 025: athrow
      // 026: ireturn
      // 027: aload 3
      // 028: getstatic vt2.rf3 Lvt2;
      // 02b: iload 4
      // 02d: ifne 045
      // 030: if_acmpeq 067
      // 033: goto 03a
      // 036: invokestatic izd.b (Loov;)Loov;
      // 039: athrow
      // 03a: aload 3
      // 03b: getstatic vt2.m3r Lvt2;
      // 03e: goto 045
      // 041: invokestatic izd.b (Loov;)Loov;
      // 044: athrow
      // 045: if_acmpeq 067
      // 048: aload 0
      // 049: aload 1
      // 04a: aload 2
      // 04b: aload 3
      // 04c: invokespecial e0x.ron (Lm5n;Lmew;Lvt2;)Z
      // 04f: iload 4
      // 051: ifne 066
      // 054: goto 05b
      // 057: invokestatic izd.b (Loov;)Loov;
      // 05a: athrow
      // 05b: ifne 067
      // 05e: goto 065
      // 061: invokestatic izd.b (Loov;)Loov;
      // 064: athrow
      // 065: bipush 0
      // 066: ireturn
      // 067: aload 2
      // 068: aload 3
      // 069: invokevirtual vt2.b4b ()Lvt2;
      // 06c: invokevirtual mew.offset (Lvt2;)Lmew;
      // 06f: astore 5
      // 071: aload 1
      // 072: aload 2
      // 073: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 078: astore 6
      // 07a: aload 1
      // 07b: aload 5
      // 07d: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 082: astore 7
      // 084: aload 6
      // 086: iload 4
      // 088: ifne 0a6
      // 08b: invokeinterface zfz.r_y ()Le0x; 1
      // 090: invokestatic izd.nm_ (Le0x;)Z
      // 093: ifeq 0bc
      // 096: goto 09d
      // 099: invokestatic izd.b (Loov;)Loov;
      // 09c: athrow
      // 09d: aload 6
      // 09f: goto 0a6
      // 0a2: invokestatic izd.b (Loov;)Loov;
      // 0a5: athrow
      // 0a6: getstatic izd._9x Lzb_;
      // 0a9: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0ae: getstatic izd$jc0.l7i Lizd$jc0;
      // 0b1: if_acmpne 0bc
      // 0b4: bipush 1
      // 0b5: goto 0bd
      // 0b8: invokestatic izd.b (Loov;)Loov;
      // 0bb: athrow
      // 0bc: bipush 0
      // 0bd: istore 8
      // 0bf: aload 7
      // 0c1: iload 4
      // 0c3: ifne 0e1
      // 0c6: invokeinterface zfz.r_y ()Le0x; 1
      // 0cb: invokestatic izd.nm_ (Le0x;)Z
      // 0ce: ifeq 0f7
      // 0d1: goto 0d8
      // 0d4: invokestatic izd.b (Loov;)Loov;
      // 0d7: athrow
      // 0d8: aload 7
      // 0da: goto 0e1
      // 0dd: invokestatic izd.b (Loov;)Loov;
      // 0e0: athrow
      // 0e1: getstatic izd._9x Lzb_;
      // 0e4: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 0e9: getstatic izd$jc0.l7i Lizd$jc0;
      // 0ec: if_acmpne 0f7
      // 0ef: bipush 1
      // 0f0: goto 0f8
      // 0f3: invokestatic izd.b (Loov;)Loov;
      // 0f6: athrow
      // 0f7: bipush 0
      // 0f8: istore 9
      // 0fa: iload 9
      // 0fc: ifeq 186
      // 0ff: aload 3
      // 100: getstatic vt2.m3r Lvt2;
      // 103: iload 4
      // 105: ifne 125
      // 108: goto 10f
      // 10b: invokestatic izd.b (Loov;)Loov;
      // 10e: athrow
      // 10f: if_acmpne 121
      // 112: goto 119
      // 115: invokestatic izd.b (Loov;)Loov;
      // 118: athrow
      // 119: bipush 1
      // 11a: goto 203
      // 11d: invokestatic izd.b (Loov;)Loov;
      // 120: athrow
      // 121: aload 3
      // 122: getstatic vt2.rf3 Lvt2;
      // 125: if_acmpne 14d
      // 128: aload 0
      // 129: aload 1
      // 12a: aload 2
      // 12b: aload 3
      // 12c: invokespecial e0x.ron (Lm5n;Lmew;Lvt2;)Z
      // 12f: iload 4
      // 131: ifne 157
      // 134: goto 13b
      // 137: invokestatic izd.b (Loov;)Loov;
      // 13a: athrow
      // 13b: ifeq 14d
      // 13e: goto 145
      // 141: invokestatic izd.b (Loov;)Loov;
      // 144: athrow
      // 145: bipush 1
      // 146: goto 203
      // 149: invokestatic izd.b (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 6
      // 14f: invokeinterface zfz.r_y ()Le0x; 1
      // 154: invokestatic izd.nm_ (Le0x;)Z
      // 157: iload 4
      // 159: ifne 17f
      // 15c: ifeq 17e
      // 15f: goto 166
      // 162: invokestatic izd.b (Loov;)Loov;
      // 165: athrow
      // 166: iload 8
      // 168: iload 4
      // 16a: ifne 183
      // 16d: goto 174
      // 170: invokestatic izd.b (Loov;)Loov;
      // 173: athrow
      // 174: ifne 182
      // 177: goto 17e
      // 17a: invokestatic izd.b (Loov;)Loov;
      // 17d: athrow
      // 17e: bipush 1
      // 17f: goto 203
      // 182: bipush 0
      // 183: goto 203
      // 186: aload 3
      // 187: getstatic vt2.rf3 Lvt2;
      // 18a: iload 4
      // 18c: ifne 1a5
      // 18f: if_acmpne 1a1
      // 192: goto 199
      // 195: invokestatic izd.b (Loov;)Loov;
      // 198: athrow
      // 199: bipush 1
      // 19a: goto 203
      // 19d: invokestatic izd.b (Loov;)Loov;
      // 1a0: athrow
      // 1a1: aload 3
      // 1a2: getstatic vt2.m3r Lvt2;
      // 1a5: if_acmpne 1cd
      // 1a8: aload 0
      // 1a9: aload 1
      // 1aa: aload 2
      // 1ab: aload 3
      // 1ac: invokespecial e0x.ron (Lm5n;Lmew;Lvt2;)Z
      // 1af: iload 4
      // 1b1: ifne 1d7
      // 1b4: goto 1bb
      // 1b7: invokestatic izd.b (Loov;)Loov;
      // 1ba: athrow
      // 1bb: ifeq 1cd
      // 1be: goto 1c5
      // 1c1: invokestatic izd.b (Loov;)Loov;
      // 1c4: athrow
      // 1c5: bipush 1
      // 1c6: goto 203
      // 1c9: invokestatic izd.b (Loov;)Loov;
      // 1cc: athrow
      // 1cd: aload 6
      // 1cf: invokeinterface zfz.r_y ()Le0x; 1
      // 1d4: invokestatic izd.nm_ (Le0x;)Z
      // 1d7: iload 4
      // 1d9: ifne 1ff
      // 1dc: ifeq 1fe
      // 1df: goto 1e6
      // 1e2: invokestatic izd.b (Loov;)Loov;
      // 1e5: athrow
      // 1e6: iload 8
      // 1e8: iload 4
      // 1ea: ifne 1ff
      // 1ed: goto 1f4
      // 1f0: invokestatic izd.b (Loov;)Loov;
      // 1f3: athrow
      // 1f4: ifeq 202
      // 1f7: goto 1fe
      // 1fa: invokestatic izd.b (Loov;)Loov;
      // 1fd: athrow
      // 1fe: bipush 1
      // 1ff: goto 203
      // 202: bipush 0
      // 203: ireturn
   }

   public static boolean nm_(e0x param0) {
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
      // 05: getstatic ox_.bj8 Lizd;
      // 08: iload 1
      // 09: ifne 21
      // 0c: if_acmpeq 3d
      // 0f: goto 16
      // 12: invokestatic izd.b (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getstatic ox_.jp3 Lizd;
      // 1a: goto 21
      // 1d: invokestatic izd.b (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifne 3a
      // 25: if_acmpeq 3d
      // 28: goto 2f
      // 2b: invokestatic izd.b (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: getstatic ox_.ip2 Lizd;
      // 33: goto 3a
      // 36: invokestatic izd.b (Loov;)Loov;
      // 39: athrow
      // 3a: if_acmpne 45
      // 3d: bipush 1
      // 3e: goto 46
      // 41: invokestatic izd.b (Loov;)Loov;
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
   }

   public abstract String uud(int var1);

   @Override
   public int qu2(OpaquePredicate var1, mew var2) {
      return super.qu2(var1, var2) & 7;
   }

   public abstract boolean t7p();

   public abstract xny ptp();

   public abstract Object ulk(erg var1);

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      synchronized (c.g()){} // $VF: monitorenter 
      long var10000 = c.a(-2170877122596264035L, -5748569837339007061L, MethodHandles.lookup().lookupClass()).a(44790148537899L);
      // $VF: monitorexit
      long var4 = var10000 ^ 71291018642929L;
      Cipher var1;
      Cipher var6 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var4 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for (int var2 = 1; var2 < 8; var2++) {
         var10003[var2] = (byte)((int)(var4 << var2 * 8 >>> 56));
      }

      var6.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var3 = var1.doFinal("°XQ^,¬3g".getBytes("ISO-8859-1"));
      String var7 = b(var3).intern();
      byte var10001 = -1;
      String var0 = var7;
      _9x = zb_.pq4(var0, izd$jc0.class);
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
