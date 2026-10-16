public class q08$_r5 {
   public float okf;
   public float g9h;
   public gbe eoa;
   public String j24;
   public boolean rwc;
   public final q08 qq9;

   public q08$_r5(q08 var1, gbe var2, String var3) {
      this.qq9 = var1;
      this.rwc = false;
      this.eoa = var2;
      this.j24 = var3;
   }

   public void aab(float param1, float param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 5
      // 05: aload 0
      // 06: fload 1
      // 07: putfield q08$_r5.okf F
      // 0a: aload 0
      // 0b: iload 5
      // 0d: ifne 4b
      // 10: fload 2
      // 11: putfield q08$_r5.g9h F
      // 14: iload 3
      // 15: i2f
      // 16: iload 4
      // 18: i2f
      // 19: fload 1
      // 1a: fload 2
      // 1b: fload 1
      // 1c: ldc 120.0
      // 1e: nop
      // 1f: fadd
      // 20: fload 2
      // 21: ldc 16.0
      // 23: nop
      // 24: fadd
      // 25: invokestatic hhf.md3 (FFFFFF)Z
      // 28: ifeq 43
      // 2b: goto 32
      // 2e: invokestatic q08$_r5.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: bipush 1
      // 34: putfield q08$_r5.rwc Z
      // 37: iload 5
      // 39: ifeq 4f
      // 3c: goto 43
      // 3f: invokestatic q08$_r5.a (Loov;)Loov;
      // 42: athrow
      // 43: aload 0
      // 44: goto 4b
      // 47: invokestatic q08$_r5.a (Loov;)Loov;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: putfield q08$_r5.rwc Z
      // 4f: fload 1
      // 50: fload 2
      // 51: fload 1
      // 52: ldc 130.0
      // 54: nop
      // 55: fadd
      // 56: fload 2
      // 57: ldc 16.0
      // 59: nop
      // 5a: fadd
      // 5b: getstatic z7e.ret Lz7e;
      // 5e: getfield z7e.k0y I
      // 61: ldc 0.5
      // 63: nop
      // 64: invokestatic hhf.kjo (IF)I
      // 67: invokestatic hhf.hxa (FFFFI)V
      // 6a: getstatic jsr.ym1 Lcyb;
      // 6d: aload 0
      // 6e: getfield q08$_r5.j24 Ljava/lang/String;
      // 71: fload 1
      // 72: ldc 65.0
      // 74: nop
      // 75: fadd
      // 76: fload 2
      // 77: fconst_2
      // 78: fadd
      // 79: getstatic z7e.a2_ Lz7e;
      // 7c: getfield z7e.k0y I
      // 7f: aload 0
      // 80: getfield q08$_r5.rwc Z
      // 83: ifeq 8e
      // 86: fconst_1
      // 87: goto 91
      // 8a: invokestatic q08$_r5.a (Loov;)Loov;
      // 8d: athrow
      // 8e: ldc 0.8
      // 90: nop
      // 91: invokevirtual cyb.amd (Ljava/lang/String;FFIF)V
      // 94: return
   }

   public void oyj() {
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
      // 06: ifeq 1e
      // 09: getfield q08$_r5.eoa Lgbe;
      // 0c: ifnonnull 2b
      // 0f: goto 16
      // 12: invokestatic q08$_r5.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic q08$_r5.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getfield q08$_r5.qq9 Lq08;
      // 21: getfield q08.mnd Lc05;
      // 24: invokevirtual c05.s_l ()V
      // 27: iload 1
      // 28: ifne 3c
      // 2b: invokestatic c05.vz1 ()Lc05;
      // 2e: aload 0
      // 2f: getfield q08$_r5.eoa Lgbe;
      // 32: invokevirtual c05.z2i (Lgbe;)V
      // 35: goto 3c
      // 38: invokestatic q08$_r5.a (Loov;)Loov;
      // 3b: athrow
      // 3c: return
   }

   public void i8p(float var1, float var2, float var3, float var4, int var5) {
      hhf.cuu(var1 - 0.5F, var2 + 0.5F, var1, var4 - 0.5F, var5);
      hhf.cuu(var1 + 0.5F, var2 - 0.5F, var3 - 0.5F, var2, var5);
      hhf.cuu(var3, var2 + 0.5F, var3 + 0.5F, var4 - 0.5F, var5);
      hhf.cuu(var1 + 0.5F, var4, var3 - 0.5F, var4 + 0.5F, var5);
      hhf.cuu(var1, var2, var3, var4, var5);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
