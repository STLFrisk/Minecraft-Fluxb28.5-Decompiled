import java.util.List;

public class gp3$nnc {
   private final String jl_;
   private final List fww;

   public gp3$nnc(String var1, List var2) {
      this.jl_ = var1;
      this.fww = var2;
   }

   public List fd7() {
      return this.fww;
   }

   @Override
   public boolean equals(Object param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic gp3$nnc.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic gp3$nnc.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifne 33
      // 1f: instanceof gp3$nnc
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic gp3$nnc.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic gp3$nnc.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast gp3$nnc
      // 36: astore 3
      // 37: aload 0
      // 38: iload 2
      // 39: ifne 59
      // 3c: getfield gp3$nnc.jl_ Ljava/lang/String;
      // 3f: aload 3
      // 40: getfield gp3$nnc.jl_ Ljava/lang/String;
      // 43: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 46: ifne 58
      // 49: goto 50
      // 4c: invokestatic gp3$nnc.a (Loov;)Loov;
      // 4f: athrow
      // 50: bipush 0
      // 51: goto 65
      // 54: invokestatic gp3$nnc.a (Loov;)Loov;
      // 57: athrow
      // 58: aload 0
      // 59: getfield gp3$nnc.fww Ljava/util/List;
      // 5c: aload 3
      // 5d: getfield gp3$nnc.fww Ljava/util/List;
      // 60: invokeinterface java/util/List.equals (Ljava/lang/Object;)Z 2
      // 65: ireturn
   }

   @Override
   public int hashCode() {
      int var1 = this.jl_.hashCode();
      return 31 * var1 + this.fww.hashCode();
   }

   public static String npp(gp3$nnc var0) {
      return var0.jl_;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
