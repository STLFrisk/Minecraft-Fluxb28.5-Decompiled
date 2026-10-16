public class v9i$_tl extends z7z {
   public v9i$_tl(v9i var1) {
      super(var1, true, new Class[0]);
   }

   @Override
   public void sb0(laq param1, g_3 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: aload 0
      // 05: aload 1
      // 06: aload 2
      // 07: invokespecial z7z.sb0 (Llaq;Lg_3;)V
      // 0a: aload 1
      // 0b: iload 3
      // 0c: ifne 24
      // 0f: instanceof v9i
      // 12: ifeq 2b
      // 15: goto 1c
      // 18: invokestatic v9i$_tl.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: goto 24
      // 20: invokestatic v9i$_tl.a (Loov;)Loov;
      // 23: athrow
      // 24: checkcast v9i
      // 27: aload 2
      // 28: invokestatic v9i.mi9 (Lv9i;Li2h;)V
      // 2b: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
