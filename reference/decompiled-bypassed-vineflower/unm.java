public class unm extends mcs {
   public unm(int var1, gdz var2, boolean var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean jee() {
      return true;
   }

   @Override
   public boolean gwh(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 3
      // 04: iload 1
      // 05: iload 3
      // 06: ifne 1c
      // 09: bipush 1
      // 0a: if_icmplt 1f
      // 0d: goto 14
      // 10: invokestatic unm.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: goto 1c
      // 18: invokestatic unm.a (Loov;)Loov;
      // 1b: athrow
      // 1c: goto 20
      // 1f: bipush 0
      // 20: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
