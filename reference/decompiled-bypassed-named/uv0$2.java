import com.google.common.base.Predicate;

public final class uv0$2 implements Predicate {
   public boolean dxb(EntityLivingBase param1) {
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
      // 05: instanceof uv0
      // 08: iload 2
      // 09: ifne 21
      // 0c: ifeq 33
      // 0f: goto 16
      // 12: invokestatic uv0$2.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: invokevirtual EntityLivingBase.h5u ()Z
      // 1a: goto 21
      // 1d: invokestatic uv0$2.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifne 30
      // 25: ifne 33
      // 28: goto 2f
      // 2b: invokestatic uv0$2.a (Loov;)Loov;
      // 2e: athrow
      // 2f: bipush 1
      // 30: goto 34
      // 33: bipush 0
      // 34: ireturn
   }

   public boolean apply(Object var1) {
      return this.dxb((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
