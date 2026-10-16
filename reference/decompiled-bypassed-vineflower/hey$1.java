import com.google.common.base.Predicate;

public final class hey$1 implements Predicate {
   public boolean xqi(y0y$_zr param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic y0y$_zr.miv Ly0y$_zr;
      // 08: iload 2
      // 09: ifeq 21
      // 0c: if_acmpeq 5e
      // 0f: goto 16
      // 12: invokestatic hey$1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getstatic y0y$_zr.iy8 Ly0y$_zr;
      // 1a: goto 21
      // 1d: invokestatic hey$1.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 3a
      // 25: if_acmpeq 5e
      // 28: goto 2f
      // 2b: invokestatic hey$1.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: getstatic y0y$_zr.cgq Ly0y$_zr;
      // 33: goto 3a
      // 36: invokestatic hey$1.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 2
      // 3b: ifeq 53
      // 3e: if_acmpeq 5e
      // 41: goto 48
      // 44: invokestatic hey$1.a (Loov;)Loov;
      // 47: athrow
      // 48: aload 1
      // 49: getstatic y0y$_zr.fm2 Ly0y$_zr;
      // 4c: goto 53
      // 4f: invokestatic hey$1.a (Loov;)Loov;
      // 52: athrow
      // 53: if_acmpeq 5e
      // 56: bipush 1
      // 57: goto 5f
      // 5a: invokestatic hey$1.a (Loov;)Loov;
      // 5d: athrow
      // 5e: bipush 0
      // 5f: ireturn
   }

   public boolean apply(Object var1) {
      return this.xqi((y0y$_zr)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
