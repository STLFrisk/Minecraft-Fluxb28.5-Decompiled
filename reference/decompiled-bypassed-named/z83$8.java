import com.google.common.base.Predicate;

public final class z83$8 implements Predicate {
   public final mew ow_;
   public final int wsh;
   public final int w3a;
   public final int n_g;
   public final int t37;

   public z83$8(mew var1, int var2, int var3, int var4, int var5) {
      this.ow_ = var1;
      this.wsh = var2;
      this.w3a = var3;
      this.n_g = var4;
      this.t37 = var5;
   }

   public boolean k7d(EntityLivingBase param1) {
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
      // 05: aload 0
      // 06: getfield z83$8.ow_ Lmew;
      // 09: invokevirtual EntityLivingBase.x4g (Lmew;)D
      // 0c: d2i
      // 0d: istore 3
      // 0e: aload 0
      // 0f: getfield z83$8.wsh I
      // 12: iload 2
      // 13: ifne 45
      // 16: iflt 3a
      // 19: goto 20
      // 1c: invokestatic z83$8.a (Loov;)Loov;
      // 1f: athrow
      // 20: iload 3
      // 21: iload 2
      // 22: ifne 45
      // 25: goto 2c
      // 28: invokestatic z83$8.a (Loov;)Loov;
      // 2b: athrow
      // 2c: aload 0
      // 2d: getfield z83$8.w3a I
      // 30: if_icmplt 78
      // 33: goto 3a
      // 36: invokestatic z83$8.a (Loov;)Loov;
      // 39: athrow
      // 3a: aload 0
      // 3b: getfield z83$8.n_g I
      // 3e: goto 45
      // 41: invokestatic z83$8.a (Loov;)Loov;
      // 44: athrow
      // 45: iload 2
      // 46: ifne 75
      // 49: iflt 6d
      // 4c: goto 53
      // 4f: invokestatic z83$8.a (Loov;)Loov;
      // 52: athrow
      // 53: iload 3
      // 54: iload 2
      // 55: ifne 75
      // 58: goto 5f
      // 5b: invokestatic z83$8.a (Loov;)Loov;
      // 5e: athrow
      // 5f: aload 0
      // 60: getfield z83$8.t37 I
      // 63: if_icmpgt 78
      // 66: goto 6d
      // 69: invokestatic z83$8.a (Loov;)Loov;
      // 6c: athrow
      // 6d: bipush 1
      // 6e: goto 75
      // 71: invokestatic z83$8.a (Loov;)Loov;
      // 74: athrow
      // 75: goto 79
      // 78: bipush 0
      // 79: ireturn
   }

   public boolean apply(Object var1) {
      return this.k7d((EntityLivingBase)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
