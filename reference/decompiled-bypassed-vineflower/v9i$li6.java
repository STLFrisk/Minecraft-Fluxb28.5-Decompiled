public class v9i$li6 extends s24 {
   public v9i$li6(v9i var1) {
      super(var1, ha9.class, true);
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
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield v9i$li6.pf7 Llaq;
      // 08: checkcast v9i
      // 0b: invokevirtual v9i.pdc ()Z
      // 0e: iload 1
      // 0f: ifeq 27
      // 12: ifeq 39
      // 15: goto 1c
      // 18: invokestatic v9i$li6.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokespecial s24.vle ()Z
      // 20: goto 27
      // 23: invokestatic v9i$li6.a (Loov;)Loov;
      // 26: athrow
      // 27: iload 1
      // 28: ifeq 36
      // 2b: ifeq 39
      // 2e: goto 35
      // 31: invokestatic v9i$li6.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3a
      // 39: bipush 0
      // 3a: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
