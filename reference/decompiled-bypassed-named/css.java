public class css {
   public css(v66 var1, long var2, long var4, float var6) {
      this.fpf = var1;
      this.lq_ = this.cgl(var1, var2, var4, var6);
   }

   public float ege() {
      return this.lq_;
   }

   public float os2() {
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
      // 05: getfield css.lq_ F
      // 08: fconst_2
      // 09: fcmpg
      // 0a: iload 1
      // 0b: ifne 33
      // 0e: ifge 20
      // 11: goto 18
      // 14: invokestatic css.a (Loov;)Loov;
      // 17: athrow
      // 18: fconst_0
      // 19: goto 46
      // 1c: invokestatic css.a (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield css.lq_ F
      // 24: ldc 4.0
      // 26: nop
      // 27: iload 1
      // 28: ifne 45
      // 2b: fcmpl
      // 2c: goto 33
      // 2f: invokestatic css.a (Loov;)Loov;
      // 32: athrow
      // 33: ifle 3e
      // 36: fconst_1
      // 37: goto 46
      // 3a: invokestatic css.a (Loov;)Loov;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield css.lq_ F
      // 42: fconst_2
      // 43: fsub
      // 44: fconst_2
      // 45: fdiv
      // 46: freturn
   }

   private float cgl(v66 param1, long param2, long param4, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 7
      // 05: aload 1
      // 06: getstatic v66.na2 Lv66;
      // 09: iload 7
      // 0b: ifne 22
      // 0e: if_acmpne 1e
      // 11: goto 18
      // 14: invokestatic css.a (Loov;)Loov;
      // 17: athrow
      // 18: fconst_0
      // 19: freturn
      // 1a: invokestatic css.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: getstatic v66.csg Lv66;
      // 22: if_acmpne 2d
      // 25: bipush 1
      // 26: goto 2e
      // 29: invokestatic css.a (Loov;)Loov;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: istore 8
      // 30: ldc 0.75
      // 32: nop
      // 33: fstore 9
      // 35: lload 2
      // 36: l2f
      // 37: ldc -72000.0
      // 39: nop
      // 3a: fadd
      // 3b: ldc 1440000.0
      // 3d: nop
      // 3e: fdiv
      // 3f: fconst_0
      // 40: fconst_1
      // 41: invokestatic fe6._f3 (FFF)F
      // 44: ldc 0.25
      // 46: nop
      // 47: fmul
      // 48: fstore 10
      // 4a: fload 9
      // 4c: fload 10
      // 4e: fadd
      // 4f: fstore 9
      // 51: fconst_0
      // 52: fstore 11
      // 54: fload 11
      // 56: lload 4
      // 58: l2f
      // 59: ldc 3600000.0
      // 5b: nop
      // 5c: fdiv
      // 5d: fconst_0
      // 5e: iload 7
      // 60: ifne 7d
      // 63: fconst_1
      // 64: invokestatic fe6._f3 (FFF)F
      // 67: iload 8
      // 69: ifeq 7b
      // 6c: goto 73
      // 6f: invokestatic css.a (Loov;)Loov;
      // 72: athrow
      // 73: fconst_1
      // 74: goto 7e
      // 77: invokestatic css.a (Loov;)Loov;
      // 7a: athrow
      // 7b: ldc 0.75
      // 7d: nop
      // 7e: fmul
      // 7f: fadd
      // 80: fstore 11
      // 82: fload 11
      // 84: fload 6
      // 86: ldc 0.25
      // 88: nop
      // 89: fmul
      // 8a: fconst_0
      // 8b: fload 10
      // 8d: invokestatic fe6._f3 (FFF)F
      // 90: fadd
      // 91: fstore 11
      // 93: aload 1
      // 94: iload 7
      // 96: ifne b6
      // 99: getstatic v66.g4t Lv66;
      // 9c: if_acmpne ae
      // 9f: goto a6
      // a2: invokestatic css.a (Loov;)Loov;
      // a5: athrow
      // a6: fload 11
      // a8: ldc 0.5
      // aa: nop
      // ab: fmul
      // ac: fstore 11
      // ae: fload 9
      // b0: fload 11
      // b2: fadd
      // b3: fstore 9
      // b5: aload 1
      // b6: invokevirtual v66.dzc ()I
      // b9: i2f
      // ba: fload 9
      // bc: fmul
      // bd: freturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
