public class fkf$m01 {
   public boolean rhh;
   private int y03;

   public fkf$m01(int var1) {
      this.y03 = var1;
   }

   public boolean mxf() {
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
      // 05: iload 1
      // 06: ifne 3e
      // 09: getfield fkf$m01.y03 I
      // 0c: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 0f: ifeq 3d
      // 12: goto 19
      // 15: invokestatic fkf$m01.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield fkf$m01.rhh Z
      // 1d: iload 1
      // 1e: ifne 43
      // 21: goto 28
      // 24: invokestatic fkf$m01.a (Loov;)Loov;
      // 27: athrow
      // 28: ifne 42
      // 2b: goto 32
      // 2e: invokestatic fkf$m01.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: bipush 1
      // 34: putfield fkf$m01.rhh Z
      // 37: bipush 1
      // 38: ireturn
      // 39: invokestatic fkf$m01.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: bipush 0
      // 3f: putfield fkf$m01.rhh Z
      // 42: bipush 0
      // 43: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
