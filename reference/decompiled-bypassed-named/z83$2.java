import com.google.common.base.Predicate;

public final class z83$2 implements Predicate {
   public final String ibj;
   public final boolean ad2;

   public z83$2(String var1, boolean var2) {
      this.ibj = var1;
      this.ad2 = var2;
   }

   public boolean o03(EntityLivingBase param1) {
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
      // 05: aload 0
      // 06: getfield z83$2.ibj Ljava/lang/String;
      // 09: invokestatic y65.m1w (Li2h;Ljava/lang/String;)Z
      // 0c: iload 2
      // 0d: ifeq 26
      // 10: aload 0
      // 11: getfield z83$2.ad2 Z
      // 14: if_icmpeq 29
      // 17: goto 1e
      // 1a: invokestatic z83$2.a (Loov;)Loov;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: goto 26
      // 22: invokestatic z83$2.a (Loov;)Loov;
      // 25: athrow
      // 26: goto 2a
      // 29: bipush 0
      // 2a: ireturn
   }

   public boolean apply(Object var1) {
      return this.o03((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
