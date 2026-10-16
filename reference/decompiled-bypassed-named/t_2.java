public class t_2 {
   public t_2(mux[] var1) {
      this.aj1 = var1;
      this.f_c = var1.length;
   }

   public void kf1() {
      this.r7e++;
   }

   public boolean gdm() {
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
      // 05: getfield t_2.r7e I
      // 08: iload 1
      // 09: ifeq 22
      // 0c: aload 0
      // 0d: getfield t_2.f_c I
      // 10: if_icmplt 25
      // 13: goto 1a
      // 16: invokestatic t_2.a (Loov;)Loov;
      // 19: athrow
      // 1a: bipush 1
      // 1b: goto 22
      // 1e: invokestatic t_2.a (Loov;)Loov;
      // 21: athrow
      // 22: goto 26
      // 25: bipush 0
      // 26: ireturn
   }

   public mux kng() {
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
      // 06: ifeq 1e
      // 09: getfield t_2.f_c I
      // 0c: ifle 2b
      // 0f: goto 16
      // 12: invokestatic t_2.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic t_2.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getfield t_2.aj1 [Lmux;
      // 21: aload 0
      // 22: getfield t_2.f_c I
      // 25: bipush 1
      // 26: isub
      // 27: aaload
      // 28: goto 2c
      // 2b: aconst_null
      // 2c: areturn
   }

   public mux q6_(int var1) {
      return this.aj1[var1];
   }

   public int ov7() {
      return this.f_c;
   }

   public void de4(int var1) {
      this.f_c = var1;
   }

   public int x03() {
      return this.r7e;
   }

   public void lkx(int var1) {
      this.r7e = var1;
   }

   public fqr _qy(EntityLivingBase var1, int var2) {
      double var3 = (double)this.aj1[var2].ksp + (double)((int)(var1.uo6 + 1.0F)) * 0.5;
      double var5 = (double)this.aj1[var2].ztw;
      double var7 = (double)this.aj1[var2].gf3 + (double)((int)(var1.uo6 + 1.0F)) * 0.5;
      return new fqr(var3, var5, var7);
   }

   public fqr qq_(EntityLivingBase var1) {
      return this._qy(var1, this.r7e);
   }

   public boolean a05(t_2 param1) {
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
      // 0f: invokestatic t_2.a (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic t_2.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 1
      // 1a: getfield t_2.aj1 [Lmux;
      // 1d: arraylength
      // 1e: iload 2
      // 1f: ifeq 38
      // 22: aload 0
      // 23: getfield t_2.aj1 [Lmux;
      // 26: arraylength
      // 27: if_icmpeq 37
      // 2a: goto 31
      // 2d: invokestatic t_2.a (Loov;)Loov;
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // 33: invokestatic t_2.a (Loov;)Loov;
      // 36: athrow
      // 37: bipush 0
      // 38: istore 3
      // 39: iload 3
      // 3a: aload 0
      // 3b: getfield t_2.aj1 [Lmux;
      // 3e: arraylength
      // 3f: if_icmpge cb
      // 42: aload 0
      // 43: getfield t_2.aj1 [Lmux;
      // 46: iload 3
      // 47: aaload
      // 48: getfield mux.ksp I
      // 4b: iload 2
      // 4c: ifeq cc
      // 4f: iload 2
      // 50: ifeq c3
      // 53: goto 5a
      // 56: invokestatic t_2.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 1
      // 5b: getfield t_2.aj1 [Lmux;
      // 5e: iload 3
      // 5f: aaload
      // 60: getfield mux.ksp I
      // 63: if_icmpne bb
      // 66: goto 6d
      // 69: invokestatic t_2.a (Loov;)Loov;
      // 6c: athrow
      // 6d: aload 0
      // 6e: getfield t_2.aj1 [Lmux;
      // 71: iload 3
      // 72: aaload
      // 73: getfield mux.ztw I
      // 76: iload 2
      // 77: ifeq c3
      // 7a: goto 81
      // 7d: invokestatic t_2.a (Loov;)Loov;
      // 80: athrow
      // 81: aload 1
      // 82: getfield t_2.aj1 [Lmux;
      // 85: iload 3
      // 86: aaload
      // 87: getfield mux.ztw I
      // 8a: if_icmpne bb
      // 8d: goto 94
      // 90: invokestatic t_2.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 0
      // 95: getfield t_2.aj1 [Lmux;
      // 98: iload 3
      // 99: aaload
      // 9a: getfield mux.gf3 I
      // 9d: iload 2
      // 9e: ifeq c3
      // a1: goto a8
      // a4: invokestatic t_2.a (Loov;)Loov;
      // a7: athrow
      // a8: aload 1
      // a9: getfield t_2.aj1 [Lmux;
      // ac: iload 3
      // ad: aaload
      // ae: getfield mux.gf3 I
      // b1: if_icmpeq c4
      // b4: goto bb
      // b7: invokestatic t_2.a (Loov;)Loov;
      // ba: athrow
      // bb: bipush 0
      // bc: goto c3
      // bf: invokestatic t_2.a (Loov;)Loov;
      // c2: athrow
      // c3: ireturn
      // c4: iinc 3 1
      // c7: iload 2
      // c8: ifne 39
      // cb: bipush 1
      // cc: ireturn
   }

   public boolean gt8(fqr param1) {
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
      // 05: invokevirtual t_2.kng ()Lmux;
      // 08: astore 3
      // 09: aload 3
      // 0a: iload 2
      // 0b: ifne 21
      // 0e: ifnonnull 20
      // 11: goto 18
      // 14: invokestatic t_2.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 0
      // 19: goto 5a
      // 1c: invokestatic t_2.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 3
      // 21: getfield mux.ksp I
      // 24: aload 1
      // 25: getfield fqr.lvi D
      // 28: d2i
      // 29: iload 2
      // 2a: ifne 52
      // 2d: if_icmpne 59
      // 30: goto 37
      // 33: invokestatic t_2.a (Loov;)Loov;
      // 36: athrow
      // 37: aload 3
      // 38: getfield mux.gf3 I
      // 3b: iload 2
      // 3c: ifne 56
      // 3f: goto 46
      // 42: invokestatic t_2.a (Loov;)Loov;
      // 45: athrow
      // 46: aload 1
      // 47: getfield fqr.bn2 D
      // 4a: d2i
      // 4b: goto 52
      // 4e: invokestatic t_2.a (Loov;)Loov;
      // 51: athrow
      // 52: if_icmpne 59
      // 55: bipush 1
      // 56: goto 5a
      // 59: bipush 0
      // 5a: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
