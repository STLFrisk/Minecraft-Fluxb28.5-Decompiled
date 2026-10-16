import com.google.common.base.Predicate;

public final class z83$7 implements Predicate {
   public final String txs;
   public final boolean nuv;

   public z83$7(String var1, boolean var2) {
      this.txs = var1;
      this.nuv = var2;
   }

   public boolean rrh(EntityLivingBase param1) {
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
      // 05: invokevirtual EntityLivingBase.noc ()Ljava/lang/String;
      // 08: aload 0
      // 09: getfield z83$7.txs Ljava/lang/String;
      // 0c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0f: iload 2
      // 10: ifne 29
      // 13: aload 0
      // 14: getfield z83$7.nuv Z
      // 17: if_icmpeq 2c
      // 1a: goto 21
      // 1d: invokestatic z83$7.a (Loov;)Loov;
      // 20: athrow
      // 21: bipush 1
      // 22: goto 29
      // 25: invokestatic z83$7.a (Loov;)Loov;
      // 28: athrow
      // 29: goto 2d
      // 2c: bipush 0
      // 2d: ireturn
   }

   public boolean apply(Object var1) {
      return this.rrh((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
