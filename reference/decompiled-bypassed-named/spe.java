public class spe {
   public spe(int var1) {
      this(var1, -1);
   }

   public spe(int var1, int var2) {
      this.fb1 = var1;
      this.hea = var2;
   }

   public boolean x1t() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield spe.hea I
      // 08: iload 1
      // 09: ifeq 1f
      // 0c: bipush -1
      // 0d: if_icmpne 22
      // 10: goto 17
      // 13: invokestatic spe.a (Loov;)Loov;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 1f
      // 1b: invokestatic spe.a (Loov;)Loov;
      // 1e: athrow
      // 1f: goto 23
      // 22: bipush 0
      // 23: ireturn
   }

   public int kko() {
      return this.hea;
   }

   public int o28() {
      return this.fb1;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
