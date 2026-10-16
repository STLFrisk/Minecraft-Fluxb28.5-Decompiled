import com.google.common.base.Predicate;

public final class ju8$1 implements Predicate {
   public boolean i62(EntityLivingBase param1) {
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
      // 06: ifeq 1e
      // 09: instanceof Entity
      // 0c: ifeq 32
      // 0f: goto 16
      // 12: invokestatic ju8$1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: goto 1e
      // 1a: invokestatic ju8$1.a (Loov;)Loov;
      // 1d: athrow
      // 1e: checkcast Entity
      // 21: invokevirtual Entity.fhc ()Ln1e;
      // 24: getstatic n1e.via Ln1e;
      // 27: if_acmpeq 32
      // 2a: bipush 1
      // 2b: goto 33
      // 2e: invokestatic ju8$1.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
   }

   public boolean apply(Object var1) {
      return this.i62((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
