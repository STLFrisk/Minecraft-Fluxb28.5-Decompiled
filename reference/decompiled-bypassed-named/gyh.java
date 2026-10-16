public class gyh extends w66 {
   @Override
   public void zrj(m5n var1, EntityLivingBase var2) {
      super.zrj(var1, var2);
   }

   @Override
   public void ai9() {
      super.ai9();
   }

   @Override
   public mux wvu(EntityLivingBase var1) {
      return this.r3f(fe6.jqf(var1.aaw().rlc), fe6.jqf(var1.aaw().bx_ + 0.5), fe6.jqf(var1.aaw().t8n));
   }

   @Override
   public mux r7o(EntityLivingBase var1, double var2, double var4, double var6) {
      return this.r3f(fe6.jqf(var2 - (double)(var1.uo6 / 2.0F)), fe6.jqf(var4 + 0.5), fe6.jqf(var6 - (double)(var1.uo6 / 2.0F)));
   }

   @Override
   public int t2_(mux[] param1, EntityLivingBase param2, mux param3, mux param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 7
      // 03: invokestatic OpaquePredicate.b ()I
      // 06: invokestatic vt2.values ()[Lvt2;
      // 09: astore 8
      // 0b: aload 8
      // 0d: arraylength
      // 0e: istore 9
      // 10: istore 6
      // 12: bipush 0
      // 13: istore 10
      // 15: iload 10
      // 17: iload 9
      // 19: if_icmpge a0
      // 1c: aload 8
      // 1e: iload 10
      // 20: aaload
      // 21: astore 11
      // 23: aload 0
      // 24: aload 2
      // 25: aload 3
      // 26: getfield mux.ksp I
      // 29: aload 11
      // 2b: invokevirtual vt2.n67 ()I
      // 2e: iadd
      // 2f: aload 3
      // 30: getfield mux.ztw I
      // 33: aload 11
      // 35: invokevirtual vt2.g5t ()I
      // 38: iadd
      // 39: aload 3
      // 3a: getfield mux.gf3 I
      // 3d: aload 11
      // 3f: invokevirtual vt2.ozy ()I
      // 42: iadd
      // 43: invokespecial gyh.y43 (Li2h;III)Lmux;
      // 46: astore 12
      // 48: iload 6
      // 4a: ifeq 9b
      // 4d: aload 12
      // 4f: ifnull 98
      // 52: goto 59
      // 55: invokestatic gyh.a (Loov;)Loov;
      // 58: athrow
      // 59: aload 12
      // 5b: getfield mux.n77 Z
      // 5e: iload 6
      // 60: ifeq 85
      // 63: goto 6a
      // 66: invokestatic gyh.a (Loov;)Loov;
      // 69: athrow
      // 6a: ifne 98
      // 6d: goto 74
      // 70: invokestatic gyh.a (Loov;)Loov;
      // 73: athrow
      // 74: aload 12
      // 76: aload 4
      // 78: invokevirtual mux.l3z (Lmux;)F
      // 7b: fload 5
      // 7d: fcmpg
      // 7e: goto 85
      // 81: invokestatic gyh.a (Loov;)Loov;
      // 84: athrow
      // 85: ifge 98
      // 88: aload 1
      // 89: iload 7
      // 8b: iinc 7 1
      // 8e: aload 12
      // 90: aastore
      // 91: goto 98
      // 94: invokestatic gyh.a (Loov;)Loov;
      // 97: athrow
      // 98: iinc 10 1
      // 9b: iload 6
      // 9d: ifne 15
      // a0: iload 7
      // a2: ireturn
   }

   private mux y43(EntityLivingBase var1, int var2, int var3, int var4) {
      int var5 = this.sjx(var1, var2, var3, var4);

      try {
         if (var5 == -1) {
            return this.r3f(var2, var3, var4);
         }
      } catch (oov var6) {
         throw a(var6);
      }

      return null;
   }

   private int sjx(EntityLivingBase param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: new mew$mix
      // 03: dup
      // 04: invokespecial mew$mix.<init> ()V
      // 07: astore 6
      // 09: invokestatic OpaquePredicate.b ()I
      // 0c: iload 2
      // 0d: istore 7
      // 0f: istore 5
      // 11: iload 7
      // 13: iload 2
      // 14: aload 0
      // 15: getfield gyh.ttk I
      // 18: iadd
      // 19: if_icmpge a0
      // 1c: iload 3
      // 1d: iload 5
      // 1f: ifeq a1
      // 22: istore 8
      // 24: iload 8
      // 26: iload 3
      // 27: aload 0
      // 28: getfield gyh.yva I
      // 2b: iadd
      // 2c: if_icmpge 98
      // 2f: iload 4
      // 31: iload 5
      // 33: ifeq 13
      // 36: istore 9
      // 38: iload 9
      // 3a: iload 4
      // 3c: aload 0
      // 3d: getfield gyh.r9u I
      // 40: iadd
      // 41: if_icmpge 90
      // 44: aload 0
      // 45: getfield gyh.utp Lm5n;
      // 48: aload 6
      // 4a: iload 7
      // 4c: iload 8
      // 4e: iload 9
      // 50: invokevirtual mew$mix.bj0 (III)Lmew$mix;
      // 53: invokeinterface m5n.getBlockState (Lmew;)Lzfz; 2
      // 58: invokeinterface zfz.r_y ()Le0x; 1
      // 5d: astore 10
      // 5f: iload 5
      // 61: ifeq 93
      // 64: iload 5
      // 66: ifeq 8b
      // 69: goto 70
      // 6c: invokestatic gyh.a (Loov;)Loov;
      // 6f: athrow
      // 70: aload 10
      // 72: invokevirtual e0x.p1r ()Lp3y;
      // 75: getstatic p3y.six Lp3y;
      // 78: if_acmpeq 88
      // 7b: goto 82
      // 7e: invokestatic gyh.a (Loov;)Loov;
      // 81: athrow
      // 82: bipush 0
      // 83: ireturn
      // 84: invokestatic gyh.a (Loov;)Loov;
      // 87: athrow
      // 88: iinc 9 1
      // 8b: iload 5
      // 8d: ifne 38
      // 90: iinc 8 1
      // 93: iload 5
      // 95: ifne 24
      // 98: iinc 7 1
      // 9b: iload 5
      // 9d: ifne 11
      // a0: bipush -1
      // a1: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
