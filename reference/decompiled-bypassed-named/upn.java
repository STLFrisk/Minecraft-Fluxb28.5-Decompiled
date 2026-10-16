public abstract class upn {
   public static final float[] hh9 = new float[]{1.0F, 0.75F, 0.5F, 0.25F, 0.0F, 0.25F, 0.5F, 0.75F};
   public OpaquePredicate d3t;
   public cdp _c8;
   public boolean v9x;
   public boolean thh;
   public final float[] gdh = new float[16];
   public int o5k;

   public final void d9i(OpaquePredicate var1) {
      this.d3t = var1;
      this.uxf = var1.r7d().z28();
      this.cut = var1.r7d().g9p();
      this.kyv();
      this.d9r();
   }

   public void d9r() {
      float var2 = 0.0F;
      int var10000 = OpaquePredicate.c();
      int var3 = 0;
      int var1 = var10000;

      while (var3 <= 15) {
         float var4 = 1.0F - (float)var3 / 15.0F;
         this.gdh[var3] = (1.0F - var4) / (var4 * 3.0F + 1.0F) * (1.0F - var2) + var2;
         var3++;
         if (var1 != 0) {
            break;
         }
      }
   }

   public void kyv() {
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
      // 05: getfield upn.d3t Lt9d;
      // 08: invokevirtual OpaquePredicate.r7d ()Lcog;
      // 0b: invokevirtual cog.z28 ()Lgxq;
      // 0e: astore 2
      // 0f: aload 2
      // 10: getstatic gxq.itf Lgxq;
      // 13: iload 1
      // 14: ifeq 56
      // 17: if_acmpne 4b
      // 1a: goto 21
      // 1d: invokestatic upn.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield upn.d3t Lt9d;
      // 25: invokevirtual OpaquePredicate.r7d ()Lcog;
      // 28: invokevirtual cog.g9p ()Ljava/lang/String;
      // 2b: invokestatic pss.ggu (Ljava/lang/String;)Lpss;
      // 2e: astore 3
      // 2f: aload 0
      // 30: new h06
      // 33: dup
      // 34: aload 3
      // 35: invokevirtual pss.q4n ()I
      // 38: getstatic gyu.bt0 Lgyu;
      // 3b: invokestatic gyu.vm1 (ILgyu;)Lgyu;
      // 3e: ldc 0.5
      // 40: nop
      // 41: invokespecial h06.<init> (Lgyu;F)V
      // 44: putfield upn._c8 Lcdp;
      // 47: iload 1
      // 48: ifne 89
      // 4b: aload 2
      // 4c: getstatic gxq.gl_ Lgxq;
      // 4f: goto 56
      // 52: invokestatic upn.a (Loov;)Loov;
      // 55: athrow
      // 56: if_acmpne 73
      // 59: aload 0
      // 5a: new h06
      // 5d: dup
      // 5e: getstatic gyu.wqh Lgyu;
      // 61: fconst_0
      // 62: invokespecial h06.<init> (Lgyu;F)V
      // 65: putfield upn._c8 Lcdp;
      // 68: iload 1
      // 69: ifne 89
      // 6c: goto 73
      // 6f: invokestatic upn.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 0
      // 74: new cdp
      // 77: dup
      // 78: aload 0
      // 79: getfield upn.d3t Lt9d;
      // 7c: invokespecial cdp.<init> (Lt9d;)V
      // 7f: putfield upn._c8 Lcdp;
      // 82: goto 89
      // 85: invokestatic upn.a (Loov;)Loov;
      // 88: athrow
      // 89: return
   }

   public g6k ska() {
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
      // 05: getfield upn.uxf Lgxq;
      // 08: getstatic gxq.itf Lgxq;
      // 0b: iload 1
      // 0c: ifne 47
      // 0f: if_acmpne 40
      // 12: goto 19
      // 15: invokestatic upn.a (Loov;)Loov;
      // 18: athrow
      // 19: new z8h
      // 1c: dup
      // 1d: aload 0
      // 1e: getfield upn.d3t Lt9d;
      // 21: aload 0
      // 22: getfield upn.d3t Lt9d;
      // 25: invokevirtual OpaquePredicate.x2p ()J
      // 28: aload 0
      // 29: getfield upn.d3t Lt9d;
      // 2c: invokevirtual OpaquePredicate.r7d ()Lcog;
      // 2f: invokevirtual cog.gk1 ()Z
      // 32: aload 0
      // 33: getfield upn.cut Ljava/lang/String;
      // 36: invokespecial z8h.<init> (Lt9d;JZLjava/lang/String;)V
      // 39: goto b8
      // 3c: invokestatic upn.a (Loov;)Loov;
      // 3f: athrow
      // 40: aload 0
      // 41: getfield upn.uxf Lgxq;
      // 44: getstatic gxq.gl_ Lgxq;
      // 47: iload 1
      // 48: ifne 6e
      // 4b: if_acmpne 67
      // 4e: goto 55
      // 51: invokestatic upn.a (Loov;)Loov;
      // 54: athrow
      // 55: new wem
      // 58: dup
      // 59: aload 0
      // 5a: getfield upn.d3t Lt9d;
      // 5d: invokespecial wem.<init> (Lt9d;)V
      // 60: goto b8
      // 63: invokestatic upn.a (Loov;)Loov;
      // 66: athrow
      // 67: aload 0
      // 68: getfield upn.uxf Lgxq;
      // 6b: getstatic gxq.jhx Lgxq;
      // 6e: if_acmpne 98
      // 71: new eiu
      // 74: dup
      // 75: aload 0
      // 76: getfield upn.d3t Lt9d;
      // 79: aload 0
      // 7a: getfield upn.d3t Lt9d;
      // 7d: invokevirtual OpaquePredicate.x2p ()J
      // 80: aload 0
      // 81: getfield upn.d3t Lt9d;
      // 84: invokevirtual OpaquePredicate.r7d ()Lcog;
      // 87: invokevirtual cog.gk1 ()Z
      // 8a: aload 0
      // 8b: getfield upn.cut Ljava/lang/String;
      // 8e: invokespecial eiu.<init> (Lt9d;JZLjava/lang/String;)V
      // 91: goto b8
      // 94: invokestatic upn.a (Loov;)Loov;
      // 97: athrow
      // 98: new eiu
      // 9b: dup
      // 9c: aload 0
      // 9d: getfield upn.d3t Lt9d;
      // a0: aload 0
      // a1: getfield upn.d3t Lt9d;
      // a4: invokevirtual OpaquePredicate.x2p ()J
      // a7: aload 0
      // a8: getfield upn.d3t Lt9d;
      // ab: invokevirtual OpaquePredicate.r7d ()Lcog;
      // ae: invokevirtual cog.gk1 ()Z
      // b1: aload 0
      // b2: getfield upn.cut Ljava/lang/String;
      // b5: invokespecial eiu.<init> (Lt9d;JZLjava/lang/String;)V
      // b8: areturn
   }

   public boolean au7(int var1, int var2) {
      try {
         if (this.d3t.koz(new mew(var1, 0, var2)) == ox_.l11) {
            return true;
         }
      } catch (oov var3) {
         throw a(var3);
      }

      return false;
   }

   public float lju(long var1, float var3) {
      int var5 = (int)(var1 % 24000L);
      int var10000 = OpaquePredicate.b();
      float var6 = ((float)var5 + var3) / 24000.0F - 0.25F;
      int var4 = var10000;

      label34: {
         label33: {
            try {
               float var12;
               var10000 = (var12 = var6 - 0.0F) == 0.0F ? 0 : (var12 < 0.0F ? -1 : 1);
               if (var4 == 0) {
                  break label34;
               }

               if (var10000 >= 0) {
                  break label33;
               }
            } catch (oov var8) {
               throw a(var8);
            }

            var6++;
         }

         try {
            if (var4 == 0) {
               return var6 + 1.0F;
            }

            float var13;
            var10000 = (var13 = var6 - 1.0F) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
         } catch (oov var7) {
            throw a(var7);
         }
      }

      if (var10000 > 0) {
         var6--;
      }

      var6 = 1.0F - (float)((Math.cos((double)var6 * Math.PI) + 1.0) / 2.0);
      return var6 + (var6 - var6) / 3.0F;
   }

   public int ml6(long var1) {
      return (int)(var1 / 24000L % 8L + 8L) % 8;
   }

   public boolean cws() {
      return true;
   }

   public float[] sjt(float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc 0.4
      // 02: nop
      // 03: fstore 4
      // 05: invokestatic OpaquePredicate.c ()I
      // 08: fload 1
      // 09: ldc 3.1415927
      // 0b: nop
      // 0c: fmul
      // 0d: fconst_2
      // 0e: fmul
      // 0f: invokestatic fe6.ssk (F)F
      // 12: fconst_0
      // 13: fsub
      // 14: fstore 5
      // 16: ldc -0.0
      // 18: nop
      // 19: fstore 6
      // 1b: istore 3
      // 1c: fload 5
      // 1e: fload 6
      // 20: fload 4
      // 22: fsub
      // 23: fcmpl
      // 24: iload 3
      // 25: ifne 4c
      // 28: iflt c3
      // 2b: goto 32
      // 2e: invokestatic upn.a (Loov;)Loov;
      // 31: athrow
      // 32: fload 5
      // 34: fload 6
      // 36: fload 4
      // 38: fadd
      // 39: iload 3
      // 3a: ifne 65
      // 3d: goto 44
      // 40: invokestatic upn.a (Loov;)Loov;
      // 43: athrow
      // 44: fcmpg
      // 45: goto 4c
      // 48: invokestatic upn.a (Loov;)Loov;
      // 4b: athrow
      // 4c: ifgt c3
      // 4f: fload 5
      // 51: fload 6
      // 53: fsub
      // 54: fload 4
      // 56: fdiv
      // 57: ldc 0.5
      // 59: nop
      // 5a: fmul
      // 5b: ldc 0.5
      // 5d: nop
      // 5e: goto 65
      // 61: invokestatic upn.a (Loov;)Loov;
      // 64: athrow
      // 65: fadd
      // 66: fstore 7
      // 68: fconst_1
      // 69: fconst_1
      // 6a: fload 7
      // 6c: ldc 3.1415927
      // 6e: nop
      // 6f: fmul
      // 70: invokestatic fe6.rtn (F)F
      // 73: fsub
      // 74: ldc 0.99
      // 76: nop
      // 77: fmul
      // 78: fsub
      // 79: fstore 8
      // 7b: fload 8
      // 7d: fload 8
      // 7f: fmul
      // 80: fstore 8
      // 82: aload 0
      // 83: getfield upn.vi7 [F
      // 86: bipush 0
      // 87: fload 7
      // 89: ldc 0.3
      // 8b: nop
      // 8c: fmul
      // 8d: ldc 0.7
      // 8f: nop
      // 90: fadd
      // 91: fastore
      // 92: aload 0
      // 93: getfield upn.vi7 [F
      // 96: bipush 1
      // 97: fload 7
      // 99: fload 7
      // 9b: fmul
      // 9c: ldc 0.7
      // 9e: nop
      // 9f: fmul
      // a0: ldc 0.2
      // a2: nop
      // a3: fadd
      // a4: fastore
      // a5: aload 0
      // a6: getfield upn.vi7 [F
      // a9: bipush 2
      // aa: fload 7
      // ac: fload 7
      // ae: fmul
      // af: fconst_0
      // b0: fmul
      // b1: ldc 0.2
      // b3: nop
      // b4: fadd
      // b5: fastore
      // b6: aload 0
      // b7: getfield upn.vi7 [F
      // ba: bipush 3
      // bb: fload 8
      // bd: fastore
      // be: aload 0
      // bf: getfield upn.vi7 [F
      // c2: areturn
      // c3: aconst_null
      // c4: areturn
   }

   public fqr mnc(float var1, float var2) {
      float var3 = fe6.ssk(var1 * (float) Math.PI * 2.0F) * 2.0F + 0.5F;
      var3 = fe6._f3(var3, 0.0F, 1.0F);
      float var4 = 0.7529412F;
      float var5 = 0.84705883F;
      float var6 = 1.0F;
      var4 *= var3 * 0.94F + 0.06F;
      var5 *= var3 * 0.94F + 0.06F;
      var6 *= var3 * 0.91F + 0.09F;
      return new fqr((double)var4, (double)var5, (double)var6);
   }

   public boolean vm6() {
      return true;
   }

   public static upn mkz(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: iload 0
      // 05: iload 1
      // 06: ifeq 23
      // 09: bipush -1
      // 0a: if_icmpne 22
      // 0d: goto 14
      // 10: invokestatic upn.a (Loov;)Loov;
      // 13: athrow
      // 14: new oi2
      // 17: dup
      // 18: invokespecial oi2.<init> ()V
      // 1b: goto 53
      // 1e: invokestatic upn.a (Loov;)Loov;
      // 21: athrow
      // 22: iload 0
      // 23: iload 1
      // 24: ifeq 40
      // 27: ifne 3f
      // 2a: goto 31
      // 2d: invokestatic upn.a (Loov;)Loov;
      // 30: athrow
      // 31: new ure
      // 34: dup
      // 35: invokespecial ure.<init> ()V
      // 38: goto 53
      // 3b: invokestatic upn.a (Loov;)Loov;
      // 3e: athrow
      // 3f: iload 0
      // 40: bipush 1
      // 41: if_icmpne 52
      // 44: new aqg
      // 47: dup
      // 48: invokespecial aqg.<init> ()V
      // 4b: goto 53
      // 4e: invokestatic upn.a (Loov;)Loov;
      // 51: athrow
      // 52: aconst_null
      // 53: areturn
   }

   public float x66() {
      return 128.0F;
   }

   public boolean t8l() {
      return true;
   }

   public mew iw9() {
      return null;
   }

   public int z9e() {
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
      // 09: getfield upn.uxf Lgxq;
      // 0c: getstatic gxq.itf Lgxq;
      // 0f: if_acmpne 21
      // 12: goto 19
      // 15: invokestatic upn.a (Loov;)Loov;
      // 18: athrow
      // 19: bipush 4
      // 1a: goto 2a
      // 1d: invokestatic upn.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: getfield upn.d3t Lt9d;
      // 25: invokevirtual OpaquePredicate._s3 ()I
      // 28: bipush 1
      // 29: iadd
      // 2a: ireturn
   }

   public double ndc() {
      try {
         if (this.uxf == gxq.itf) {
            return 1.0;
         }
      } catch (oov var1) {
         throw a(var1);
      }

      return 0.03125;
   }

   public boolean c2o(int var1, int var2) {
      return false;
   }

   public abstract String gby();

   public abstract String org();

   public cdp wvm() {
      return this._c8;
   }

   public boolean yz2() {
      return this.v9x;
   }

   public boolean qyc() {
      return this.thh;
   }

   public float[] tcr() {
      return this.gdh;
   }

   public int gs_() {
      return this.o5k;
   }

   public w5i w23() {
      return new w5i();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
