import com.google.common.base.Predicate;

public final class d2q$1 implements Predicate {
   public final Predicate azb;

   public d2q$1(Predicate var1) {
      this.azb = var1;
   }

   public boolean ow_(d2q param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: ifnull 2e
      // 08: aload 0
      // 09: getfield d2q$1.azb Lcom/google/common/base/Predicate;
      // 0c: aload 1
      // 0d: invokevirtual d2q.uc6 ()Lzfz;
      // 10: invokeinterface com/google/common/base/Predicate.apply (Ljava/lang/Object;)Z 2
      // 15: iload 2
      // 16: ifne 2b
      // 19: goto 20
      // 1c: invokestatic d2q$1.a (Loov;)Loov;
      // 1f: athrow
      // 20: ifeq 2e
      // 23: goto 2a
      // 26: invokestatic d2q$1.a (Loov;)Loov;
      // 29: athrow
      // 2a: bipush 1
      // 2b: goto 2f
      // 2e: bipush 0
      // 2f: ireturn
   }

   public boolean apply(Object var1) {
      return this.ow_((d2q)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
