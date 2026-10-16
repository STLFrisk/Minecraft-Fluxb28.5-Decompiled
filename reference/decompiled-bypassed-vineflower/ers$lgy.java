public class ers$lgy {
   public boolean lxx;
   private int fc6;
   public final ers dep;

   public ers$lgy(ers var1, int var2) {
      this.dep = var1;
      this.fc6 = var2;
   }

   public boolean z0p() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 3e
      // 09: getfield ers$lgy.fc6 I
      // 0c: invokestatic org/lwjgl/input/Mouse.isButtonDown (I)Z
      // 0f: ifeq 3d
      // 12: goto 19
      // 15: invokestatic ers$lgy.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield ers$lgy.lxx Z
      // 1d: iload 1
      // 1e: ifne 43
      // 21: goto 28
      // 24: invokestatic ers$lgy.a (Loov;)Loov;
      // 27: athrow
      // 28: ifne 42
      // 2b: goto 32
      // 2e: invokestatic ers$lgy.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 0
      // 33: bipush 1
      // 34: putfield ers$lgy.lxx Z
      // 37: bipush 1
      // 38: ireturn
      // 39: invokestatic ers$lgy.a (Loov;)Loov;
      // 3c: athrow
      // 3d: aload 0
      // 3e: bipush 0
      // 3f: putfield ers$lgy.lxx Z
      // 42: bipush 0
      // 43: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
