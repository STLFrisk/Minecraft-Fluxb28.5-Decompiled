import com.google.common.base.Predicate;

public class gse$1 implements Predicate {
   public final gse l4j;

   public gse$1(gse var1) {
      this.l4j = var1;
   }

   public boolean eia(EntityLivingBase param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: instanceof EntityZombie
      // 08: iload 2
      // 09: ifeq 30
      // 0c: ifne 2f
      // 0f: goto 16
      // 12: invokestatic gse$1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: instanceof kxi
      // 1a: iload 2
      // 1b: ifeq 30
      // 1e: goto 25
      // 21: invokestatic gse$1.a (Loov;)Loov;
      // 24: athrow
      // 25: ifeq 33
      // 28: goto 2f
      // 2b: invokestatic gse$1.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public boolean apply(Object var1) {
      return this.eia((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
