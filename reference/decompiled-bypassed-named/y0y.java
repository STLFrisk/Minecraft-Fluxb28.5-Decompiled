public abstract class y0y extends e0x {
   public final boolean dqe;

   public static boolean slf(OpaquePredicate var0, mew var1) {
      return al_(var0.getBlockState(var1));
   }

   public static boolean al_(zfz param0) {
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
      // 05: invokeinterface zfz.r_y ()Le0x; 1
      // 0a: astore 2
      // 0b: aload 2
      // 0c: getstatic ox_.r_v Le0x;
      // 0f: iload 1
      // 10: ifne 28
      // 13: if_acmpeq 5d
      // 16: goto 1d
      // 19: invokestatic y0y.b (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 2
      // 1e: getstatic ox_.ujf Le0x;
      // 21: goto 28
      // 24: invokestatic y0y.b (Loov;)Loov;
      // 27: athrow
      // 28: iload 1
      // 29: ifne 41
      // 2c: if_acmpeq 5d
      // 2f: goto 36
      // 32: invokestatic y0y.b (Loov;)Loov;
      // 35: athrow
      // 36: aload 2
      // 37: getstatic ox_.eri Le0x;
      // 3a: goto 41
      // 3d: invokestatic y0y.b (Loov;)Loov;
      // 40: athrow
      // 41: iload 1
      // 42: ifne 5a
      // 45: if_acmpeq 5d
      // 48: goto 4f
      // 4b: invokestatic y0y.b (Loov;)Loov;
      // 4e: athrow
      // 4f: aload 2
      // 50: getstatic ox_.c0r Le0x;
      // 53: goto 5a
      // 56: invokestatic y0y.b (Loov;)Loov;
      // 59: athrow
      // 5a: if_acmpne 65
      // 5d: bipush 1
      // 5e: goto 66
      // 61: invokestatic y0y.b (Loov;)Loov;
      // 64: athrow
      // 65: bipush 0
      // 66: ireturn
   }

   public y0y(boolean var1) {
      super(p3y.f20);
      this.dqe = var1;
      this.xl4(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
      this.i3l(uja.qes);
   }

   @Override
   public nh4 m__(OpaquePredicate var1, mew var2, zfz var3) {
      return null;
   }

   @Override
   public boolean ko5() {
      return false;
   }

   @Override
   public akm mns(OpaquePredicate var1, mew var2, fqr var3, fqr var4) {
      this.c7i(var1, var2);
      return super.mns(var1, var2, var3, var4);
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
      // 04: aload 1
      // 05: aload 2
      // 06: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 0b: astore 4
      // 0d: aload 4
      // 0f: iload 3
      // 10: ifne 2c
      // 13: invokeinterface zfz.r_y ()Le0x; 1
      // 18: aload 0
      // 19: if_acmpne 3b
      // 1c: goto 23
      // 1f: invokestatic y0y.b (Loov;)Loov;
      // 22: athrow
      // 23: aload 4
      // 25: goto 2c
      // 28: invokestatic y0y.b (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: invokevirtual y0y.fvr ()Lxny;
      // 30: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 35: checkcast y0y$_zr
      // 38: goto 3c
      // 3b: aconst_null
      // 3c: astore 5
      // 3e: aload 5
      // 40: iload 3
      // 41: ifne 50
      // 44: ifnull 6d
      // 47: goto 4e
      // 4a: invokestatic y0y.b (Loov;)Loov;
      // 4d: athrow
      // 4e: aload 5
      // 50: invokevirtual y0y$_zr.t1s ()Z
      // 53: ifeq 6d
      // 56: aload 0
      // 57: fconst_0
      // 58: fconst_0
      // 59: fconst_0
      // 5a: fconst_1
      // 5b: ldc 0.625
      // 5d: nop
      // 5e: fconst_1
      // 5f: invokevirtual y0y.xl4 (FFFFFF)V
      // 62: iload 3
      // 63: ifeq 80
      // 66: goto 6d
      // 69: invokestatic y0y.b (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: fconst_0
      // 6f: fconst_0
      // 70: fconst_0
      // 71: fconst_1
      // 72: ldc 0.125
      // 74: nop
      // 75: fconst_1
      // 76: invokevirtual y0y.xl4 (FFFFFF)V
      // 79: goto 80
      // 7c: invokestatic y0y.b (Loov;)Loov;
      // 7f: athrow
      // 80: return
   }

   @Override
   public boolean gck() {
      return false;
   }

   @Override
   public boolean ctq(OpaquePredicate var1, mew var2) {
      return OpaquePredicate.r3_(var1, var2.eve());
   }

   @Override
   public void tfc(OpaquePredicate var1, mew var2, zfz var3) {
      int var4 = OpaquePredicate.c();

      y0y var7;
      label40: {
         label41: {
            try {
               var10000 = var1.v0f;
               if (var4 != 0) {
                  break label41;
               }

               if (var1.v0f) {
                  return;
               }
            } catch (oov var6) {
               throw b(var6);
            }

            var3 = this.yt7(var1, var2, var3, true);

            try {
               var7 = this;
               if (var4 != 0) {
                  break label40;
               }

               var10000 = this.dqe;
            } catch (oov var5) {
               throw b(var5);
            }
         }

         if (!var10000) {
            return;
         }

         var7 = this;
      }

      var7.z3l(var1, var2, var3, this);
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
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 5
      // 005: aload 1
      // 006: getfield OpaquePredicate.v0f Z
      // 009: ifne 15f
      // 00c: aload 3
      // 00d: aload 0
      // 00e: invokevirtual y0y.fvr ()Lxny;
      // 011: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 016: checkcast y0y$_zr
      // 019: astore 6
      // 01b: bipush 0
      // 01c: istore 7
      // 01e: aload 1
      // 01f: aload 2
      // 020: invokevirtual mew.eve ()Lmew;
      // 023: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 026: iload 5
      // 028: ifne 036
      // 02b: ifne 038
      // 02e: goto 035
      // 031: invokestatic y0y.b (Loov;)Loov;
      // 034: athrow
      // 035: bipush 1
      // 036: istore 7
      // 038: aload 6
      // 03a: getstatic y0y$_zr.gt1 Ly0y$_zr;
      // 03d: iload 5
      // 03f: ifne 07e
      // 042: if_acmpne 072
      // 045: goto 04c
      // 048: invokestatic y0y.b (Loov;)Loov;
      // 04b: athrow
      // 04c: aload 1
      // 04d: aload 2
      // 04e: invokevirtual mew.o_8 ()Lmew;
      // 051: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 054: iload 5
      // 056: ifne 06b
      // 059: goto 060
      // 05c: invokestatic y0y.b (Loov;)Loov;
      // 05f: athrow
      // 060: ifne 072
      // 063: goto 06a
      // 066: invokestatic y0y.b (Loov;)Loov;
      // 069: athrow
      // 06a: bipush 1
      // 06b: istore 7
      // 06d: iload 5
      // 06f: ifeq 124
      // 072: aload 6
      // 074: getstatic y0y$_zr.xew Ly0y$_zr;
      // 077: goto 07e
      // 07a: invokestatic y0y.b (Loov;)Loov;
      // 07d: athrow
      // 07e: iload 5
      // 080: ifne 0bf
      // 083: if_acmpne 0b3
      // 086: goto 08d
      // 089: invokestatic y0y.b (Loov;)Loov;
      // 08c: athrow
      // 08d: aload 1
      // 08e: aload 2
      // 08f: invokevirtual mew.y8e ()Lmew;
      // 092: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 095: iload 5
      // 097: ifne 0ac
      // 09a: goto 0a1
      // 09d: invokestatic y0y.b (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ifne 0b3
      // 0a4: goto 0ab
      // 0a7: invokestatic y0y.b (Loov;)Loov;
      // 0aa: athrow
      // 0ab: bipush 1
      // 0ac: istore 7
      // 0ae: iload 5
      // 0b0: ifeq 124
      // 0b3: aload 6
      // 0b5: getstatic y0y$_zr.f3v Ly0y$_zr;
      // 0b8: goto 0bf
      // 0bb: invokestatic y0y.b (Loov;)Loov;
      // 0be: athrow
      // 0bf: iload 5
      // 0c1: ifne 100
      // 0c4: if_acmpne 0f4
      // 0c7: goto 0ce
      // 0ca: invokestatic y0y.b (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 1
      // 0cf: aload 2
      // 0d0: invokevirtual mew.idu ()Lmew;
      // 0d3: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 0d6: iload 5
      // 0d8: ifne 0ed
      // 0db: goto 0e2
      // 0de: invokestatic y0y.b (Loov;)Loov;
      // 0e1: athrow
      // 0e2: ifne 0f4
      // 0e5: goto 0ec
      // 0e8: invokestatic y0y.b (Loov;)Loov;
      // 0eb: athrow
      // 0ec: bipush 1
      // 0ed: istore 7
      // 0ef: iload 5
      // 0f1: ifeq 124
      // 0f4: aload 6
      // 0f6: getstatic y0y$_zr.gh0 Ly0y$_zr;
      // 0f9: goto 100
      // 0fc: invokestatic y0y.b (Loov;)Loov;
      // 0ff: athrow
      // 100: if_acmpne 124
      // 103: aload 1
      // 104: aload 2
      // 105: invokevirtual mew.z6x ()Lmew;
      // 108: invokestatic OpaquePredicate.r3_ (Lm5n;Lmew;)Z
      // 10b: iload 5
      // 10d: ifne 126
      // 110: goto 117
      // 113: invokestatic y0y.b (Loov;)Loov;
      // 116: athrow
      // 117: ifne 124
      // 11a: goto 121
      // 11d: invokestatic y0y.b (Loov;)Loov;
      // 120: athrow
      // 121: bipush 1
      // 122: istore 7
      // 124: iload 7
      // 126: iload 5
      // 128: ifne 149
      // 12b: ifeq 14f
      // 12e: goto 135
      // 131: invokestatic y0y.b (Loov;)Loov;
      // 134: athrow
      // 135: aload 0
      // 136: aload 1
      // 137: aload 2
      // 138: aload 3
      // 139: bipush 0
      // 13a: invokevirtual y0y.lf0 (Lt9d;Lmew;Lzfz;I)V
      // 13d: aload 1
      // 13e: aload 2
      // 13f: invokevirtual OpaquePredicate.i6x (Lmew;)Z
      // 142: goto 149
      // 145: invokestatic y0y.b (Loov;)Loov;
      // 148: athrow
      // 149: pop
      // 14a: iload 5
      // 14c: ifeq 15f
      // 14f: aload 0
      // 150: aload 1
      // 151: aload 2
      // 152: aload 3
      // 153: aload 4
      // 155: invokevirtual y0y.bkl (Lt9d;Lmew;Lzfz;Le0x;)V
      // 158: goto 15f
      // 15b: invokestatic y0y.b (Loov;)Loov;
      // 15e: athrow
      // 15f: return
   }

   public void bkl(OpaquePredicate var1, mew var2, zfz var3, e0x var4) {
   }

   public zfz yt7(OpaquePredicate var1, mew var2, zfz var3, boolean var4) {
      try {
         if (var1.v0f) {
            return var3;
         }
      } catch (oov var5) {
         throw b(var5);
      }

      return new y0y$wa9(this, var1, var2, var3).dlk(var1.gxo(var2), var4).t9g();
   }

   @Override
   public int quv() {
      return 0;
   }

   @Override
   public w51 w3x() {
      return w51.gx9;
   }

   @Override
   public void b8f(OpaquePredicate param1, mew param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 4
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: invokespecial e0x.b8f (Lt9d;Lmew;Lzfz;)V
      // 0c: aload 3
      // 0d: aload 0
      // 0e: invokevirtual y0y.fvr ()Lxny;
      // 11: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 16: checkcast y0y$_zr
      // 19: invokevirtual y0y$_zr.t1s ()Z
      // 1c: iload 4
      // 1e: ifeq 3f
      // 21: ifeq 3b
      // 24: goto 2b
      // 27: invokestatic y0y.b (Loov;)Loov;
      // 2a: athrow
      // 2b: aload 1
      // 2c: aload 2
      // 2d: invokevirtual mew.nuv ()Lmew;
      // 30: aload 0
      // 31: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 34: goto 3b
      // 37: invokestatic y0y.b (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield y0y.dqe Z
      // 3f: ifeq 58
      // 42: aload 1
      // 43: aload 2
      // 44: aload 0
      // 45: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 48: aload 1
      // 49: aload 2
      // 4a: invokevirtual mew.eve ()Lmew;
      // 4d: aload 0
      // 4e: invokevirtual OpaquePredicate._0o (Lmew;Le0x;)V
      // 51: goto 58
      // 54: invokestatic y0y.b (Loov;)Loov;
      // 57: athrow
      // 58: return
   }

   public abstract xny fvr();

   private static oov b(oov var0) {
      return var0;
   }
}
