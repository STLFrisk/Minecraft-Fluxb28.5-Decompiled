import com.google.common.base.Predicate;

public final class k0_$4 implements Predicate {
   public boolean ork(EntityLivingBase param1) {
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
      // 09: ifne 33
      // 0c: ifeq 32
      // 0f: goto 16
      // 12: invokestatic k0_$4.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: checkcast ha9
      // 1a: invokevirtual ha9.myu ()Z
      // 1d: iload 2
      // 1e: ifne 33
      // 21: goto 28
      // 24: invokestatic k0_$4.a (Loov;)Loov;
      // 27: athrow
      // 28: ifne 36
      // 2b: goto 32
      // 2e: invokestatic k0_$4.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 1
      // 33: goto 37
      // 36: bipush 0
      // 37: ireturn
   }

   public boolean apply(Object var1) {
      return this.ork((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
