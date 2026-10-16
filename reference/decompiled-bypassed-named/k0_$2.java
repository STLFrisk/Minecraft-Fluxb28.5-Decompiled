import com.google.common.base.Predicate;

public final class k0_$2 implements Predicate {
   public boolean uq2(EntityLivingBase param1) {
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
      // 05: iload 2
      // 06: ifeq 21
      // 09: invokevirtual EntityLivingBase.gzr ()Z
      // 0c: ifeq 45
      // 0f: goto 16
      // 12: invokestatic k0_$2.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 1
      // 17: getfield EntityLivingBase.wgv Li2h;
      // 1a: goto 21
      // 1d: invokestatic k0_$2.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 2
      // 22: ifeq 3a
      // 25: ifnonnull 45
      // 28: goto 2f
      // 2b: invokestatic k0_$2.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 1
      // 30: getfield EntityLivingBase.hzp Li2h;
      // 33: goto 3a
      // 36: invokestatic k0_$2.a (Loov;)Loov;
      // 39: athrow
      // 3a: ifnonnull 45
      // 3d: bipush 1
      // 3e: goto 46
      // 41: invokestatic k0_$2.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
   }

   public boolean apply(Object var1) {
      return this.uq2((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
