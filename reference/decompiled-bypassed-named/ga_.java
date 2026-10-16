public class ga_ extends bdq {
   public ga_(ysf var1) {
      super(var1, ha9.class, 8.0F);
      this._fu = var1;
   }

   @Override
   public boolean vle() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield ga_._fu Lysf;
      // 08: invokevirtual ysf.qc9 ()Z
      // 0b: iload 1
      // 0c: ifne 2b
      // 0f: ifeq 2a
      // 12: goto 19
      // 15: invokestatic ga_.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 0
      // 1b: getfield ga_._fu Lysf;
      // 1e: invokevirtual ysf.rbk ()Lha9;
      // 21: putfield ga_.rtl Li2h;
      // 24: bipush 1
      // 25: ireturn
      // 26: invokestatic ga_.b (Loov;)Loov;
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
