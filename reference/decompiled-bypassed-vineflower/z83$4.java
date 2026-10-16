import com.google.common.base.Predicate;

public final class z83$4 implements Predicate {
   public final int yhy;

   public z83$4(int var1) {
      this.yhy = var1;
   }

   public boolean pl_(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 1d
      // 09: instanceof z96
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic z83$4.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic z83$4.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast z96
      // 20: astore 3
      // 21: aload 3
      // 22: getfield z96._am Lrsh;
      // 25: invokevirtual rsh.tmw ()Lh50$f05;
      // 28: invokevirtual h50$f05.xzh ()I
      // 2b: iload 2
      // 2c: ifeq 45
      // 2f: aload 0
      // 30: getfield z83$4.yhy I
      // 33: if_icmpne 48
      // 36: goto 3d
      // 39: invokestatic z83$4.a (Loov;)Loov;
      // 3c: athrow
      // 3d: bipush 1
      // 3e: goto 45
      // 41: invokestatic z83$4.a (Loov;)Loov;
      // 44: athrow
      // 45: goto 49
      // 48: bipush 0
      // 49: ireturn
   }

   public boolean apply(Object var1) {
      return this.pl_((i2h)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
