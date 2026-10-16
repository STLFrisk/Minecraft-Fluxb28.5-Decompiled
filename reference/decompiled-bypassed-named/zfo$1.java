import com.google.common.base.Predicate;

public final class zfo$1 implements Predicate {
   public boolean qqn(EntityLivingBase param1) {
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
      // 05: instanceof zfo
      // 08: iload 2
      // 09: ifeq 24
      // 0c: ifeq 36
      // 0f: goto 16
      // 12: invokestatic zfo$1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast zfo
      // 1a: invokevirtual zfo.r8i ()Z
      // 1d: goto 24
      // 20: invokestatic zfo$1.a (Loov;)Loov;
      // 23: athrow
      // 24: iload 2
      // 25: ifeq 33
      // 28: ifeq 36
      // 2b: goto 32
      // 2e: invokestatic zfo$1.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public boolean apply(Object var1) {
      return this.qqn((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
