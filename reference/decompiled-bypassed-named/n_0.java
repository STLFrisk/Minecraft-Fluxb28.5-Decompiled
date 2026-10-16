import java.util.Collection;

public abstract class n_0 {
   public boolean msm(n_0 param1) {
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
      // 0f: invokestatic n_0.a (Loov;)Loov;
      // 12: athrow
      // 13: bipush 0
      // 14: goto 29
      // 17: invokestatic n_0.a (Loov;)Loov;
      // 1a: athrow
      // 1b: aload 0
      // 1c: aload 1
      // 1d: if_acmpne 28
      // 20: bipush 1
      // 21: goto 29
      // 24: invokestatic n_0.a (Loov;)Loov;
      // 27: athrow
      // 28: bipush 0
      // 29: ireturn
   }

   public abstract String fm9();

   public abstract String s1c(String var1);

   public abstract boolean g33();

   public abstract boolean w7v();

   public abstract n_0$ajs xge();

   public abstract Collection vsw();

   public abstract n_0$ajs aej();

   private static oov a(oov var0) {
      return var0;
   }
}
