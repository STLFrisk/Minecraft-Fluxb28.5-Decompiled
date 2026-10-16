public class je4$b3l extends vrx {
   public final je4 s5v;

   public je4$b3l(je4 var1, rsi var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.s5v = var1;
   }

   @Override
   public boolean xvl(erg param1) {
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
      // 06: ifeq 1c
      // 09: ifnonnull 1b
      // 0c: goto 13
      // 0f: invokestatic je4$b3l.a (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 82
      // 17: invokestatic je4$b3l.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual erg.gn1 ()Lu7m;
      // 1f: getstatic xbr.cu7 Lu7m;
      // 22: iload 2
      // 23: ifeq 3e
      // 26: if_acmpeq 79
      // 29: goto 30
      // 2c: invokestatic je4$b3l.a (Loov;)Loov;
      // 2f: athrow
      // 30: aload 1
      // 31: invokevirtual erg.gn1 ()Lu7m;
      // 34: getstatic xbr.exg Lu7m;
      // 37: goto 3e
      // 3a: invokestatic je4$b3l.a (Loov;)Loov;
      // 3d: athrow
      // 3e: iload 2
      // 3f: ifeq 5a
      // 42: if_acmpeq 79
      // 45: goto 4c
      // 48: invokestatic je4$b3l.a (Loov;)Loov;
      // 4b: athrow
      // 4c: aload 1
      // 4d: invokevirtual erg.gn1 ()Lu7m;
      // 50: getstatic xbr.jtr Lu7m;
      // 53: goto 5a
      // 56: invokestatic je4$b3l.a (Loov;)Loov;
      // 59: athrow
      // 5a: iload 2
      // 5b: ifeq 76
      // 5e: if_acmpeq 79
      // 61: goto 68
      // 64: invokestatic je4$b3l.a (Loov;)Loov;
      // 67: athrow
      // 68: aload 1
      // 69: invokevirtual erg.gn1 ()Lu7m;
      // 6c: getstatic xbr.icz Lu7m;
      // 6f: goto 76
      // 72: invokestatic je4$b3l.a (Loov;)Loov;
      // 75: athrow
      // 76: if_acmpne 81
      // 79: bipush 1
      // 7a: goto 82
      // 7d: invokestatic je4$b3l.a (Loov;)Loov;
      // 80: athrow
      // 81: bipush 0
      // 82: ireturn
   }

   @Override
   public int c1r() {
      return 1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
