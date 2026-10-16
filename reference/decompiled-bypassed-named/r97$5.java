public final class r97$5 implements m1p {
   private final kea l1g = new kea();

   @Override
   public erg r0k(sdf param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: iload 3
      // 06: ifeq 2e
      // 09: invokevirtual erg.j6_ ()I
      // 0c: invokestatic dgn.rri (I)Z
      // 0f: ifeq 31
      // 12: goto 19
      // 15: invokestatic r97$5.a (Loov;)Loov;
      // 18: athrow
      // 19: new r97$5$1
      // 1c: dup
      // 1d: aload 0
      // 1e: aload 2
      // 1f: invokespecial r97$5$1.<init> (Lr97$5;Lerg;)V
      // 22: aload 1
      // 23: aload 2
      // 24: invokevirtual r97$5$1.r0k (Lsdf;Lerg;)Lerg;
      // 27: goto 2e
      // 2a: invokestatic r97$5.a (Loov;)Loov;
      // 2d: athrow
      // 2e: goto 3a
      // 31: aload 0
      // 32: getfield r97$5.l1g Lkea;
      // 35: aload 1
      // 36: aload 2
      // 37: invokevirtual kea.r0k (Lsdf;Lerg;)Lerg;
      // 3a: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
