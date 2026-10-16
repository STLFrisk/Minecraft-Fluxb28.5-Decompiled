import com.google.common.base.Predicate;

public final class k0_$3 implements Predicate {
   public boolean wj1(i2h param1) {
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
      // 05: instanceof rsi
      // 08: iload 2
      // 09: ifeq 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic k0_$3.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual i2h.gzr ()Z
      // 1a: goto 21
      // 1d: invokestatic k0_$3.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 30
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic k0_$3.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public boolean apply(Object var1) {
      return this.wj1((i2h)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
