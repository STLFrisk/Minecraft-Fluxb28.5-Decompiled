public class b_3 extends c8g {
   public b_3(Object var1) {
      this.ptp = var1;
   }

   @Override
   public Object _gz(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial c8g._gz (Ljava/lang/Object;)Ljava/lang/Object;
      // 09: astore 3
      // 0a: aload 3
      // 0b: iload 2
      // 0c: ifeq 24
      // 0f: ifnonnull 27
      // 12: goto 19
      // 15: invokestatic b_3.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield b_3.ptp Ljava/lang/Object;
      // 1d: goto 24
      // 20: invokestatic b_3.a (Loov;)Loov;
      // 23: athrow
      // 24: goto 28
      // 27: aload 3
      // 28: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
