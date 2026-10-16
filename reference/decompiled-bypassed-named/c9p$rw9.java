import com.google.common.base.Predicate;

public class c9p$rw9 implements Predicate {
   private c9p lxt;

   public c9p$rw9(c9p var1) {
      this.lxt = var1;
   }

   public boolean bfk(Entity param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: instanceof ha9
      // 08: iload 2
      // 09: ifne 42
      // 0c: ifne 2f
      // 0f: goto 16
      // 12: invokestatic c9p$rw9.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: instanceof EntityMob
      // 1a: iload 2
      // 1b: ifne 42
      // 1e: goto 25
      // 21: invokestatic c9p$rw9.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq 54
      // 28: goto 2f
      // 2b: invokestatic c9p$rw9.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: aload 0
      // 31: getfield c9p$rw9.lxt Lc9p;
      // 34: invokevirtual Entity.wxg (Li2h;)D
      // 37: ldc2_w 9.0
      // 3a: dcmpl
      // 3b: goto 42
      // 3e: invokestatic c9p$rw9.a (Loov;)Loov;
      // 41: athrow
      // 42: iload 2
      // 43: ifne 51
      // 46: ifle 54
      // 49: goto 50
      // 4c: invokestatic c9p$rw9.a (Loov;)Loov;
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 55
      // 54: bipush 0
      // 55: ireturn
   }

   public boolean apply(Object var1) {
      return this.bfk((Entity)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
