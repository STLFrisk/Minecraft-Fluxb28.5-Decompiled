import com.google.common.base.Predicate;

public class k0_$gup implements Predicate {
   private final erg eq8;

   public k0_$gup(erg var1) {
      this.eq8 = var1;
   }

   public boolean awp(EntityLivingBase param1) {
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
      // 05: invokevirtual EntityLivingBase.gzr ()Z
      // 08: iload 2
      // 09: ifeq 2b
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic k0_$gup.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic k0_$gup.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: iload 2
      // 1e: ifeq 35
      // 21: instanceof Entity
      // 24: goto 2b
      // 27: invokestatic k0_$gup.a (Loov;)Loov;
      // 2a: athrow
      // 2b: ifne 34
      // 2e: bipush 0
      // 2f: ireturn
      // 30: invokestatic k0_$gup.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 1
      // 35: checkcast Entity
      // 38: astore 3
      // 39: aload 3
      // 3a: iload 2
      // 3b: ifeq 5b
      // 3e: aload 0
      // 3f: getfield k0_$gup.eq8 Lerg;
      // 42: invokestatic yqv.vu5 (Lerg;)I
      // 45: invokevirtual Entity.rnq (I)Lerg;
      // 48: ifnull 5a
      // 4b: goto 52
      // 4e: invokestatic k0_$gup.a (Loov;)Loov;
      // 51: athrow
      // 52: bipush 0
      // 53: goto 98
      // 56: invokestatic k0_$gup.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 3
      // 5b: instanceof yqv
      // 5e: iload 2
      // 5f: ifeq 89
      // 62: ifeq 7a
      // 65: goto 6c
      // 68: invokestatic k0_$gup.a (Loov;)Loov;
      // 6b: athrow
      // 6c: aload 3
      // 6d: checkcast yqv
      // 70: invokevirtual yqv.zrj ()Z
      // 73: goto 98
      // 76: invokestatic k0_$gup.a (Loov;)Loov;
      // 79: athrow
      // 7a: aload 3
      // 7b: iload 2
      // 7c: ifeq 95
      // 7f: instanceof h67
      // 82: goto 89
      // 85: invokestatic k0_$gup.a (Loov;)Loov;
      // 88: athrow
      // 89: ifeq 94
      // 8c: bipush 1
      // 8d: goto 98
      // 90: invokestatic k0_$gup.a (Loov;)Loov;
      // 93: athrow
      // 94: aload 3
      // 95: instanceof ha9
      // 98: ireturn
   }

   public boolean apply(Object var1) {
      return this.awp((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
