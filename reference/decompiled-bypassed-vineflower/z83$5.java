import com.google.common.base.Predicate;

public final class z83$5 implements Predicate {
   public final String vj1;
   public final boolean or_;

   public z83$5(String var1, boolean var2) {
      this.vj1 = var1;
      this.or_ = var2;
   }

   public boolean qae(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 1d
      // 09: instanceof g_3
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic z83$5.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic z83$5.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast g_3
      // 20: astore 3
      // 21: aload 3
      // 22: invokevirtual g_3.ued ()Ln_0;
      // 25: astore 4
      // 27: aload 4
      // 29: iload 2
      // 2a: ifne 43
      // 2d: ifnonnull 41
      // 30: goto 37
      // 33: invokestatic z83$5.a (Loov;)Loov;
      // 36: athrow
      // 37: ldc ""
      // 39: nop
      // 3a: goto 46
      // 3d: invokestatic z83$5.a (Loov;)Loov;
      // 40: athrow
      // 41: aload 4
      // 43: invokevirtual n_0.fm9 ()Ljava/lang/String;
      // 46: astore 5
      // 48: aload 5
      // 4a: aload 0
      // 4b: getfield z83$5.vj1 Ljava/lang/String;
      // 4e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 51: iload 2
      // 52: ifne 6b
      // 55: aload 0
      // 56: getfield z83$5.or_ Z
      // 59: if_icmpeq 6e
      // 5c: goto 63
      // 5f: invokestatic z83$5.a (Loov;)Loov;
      // 62: athrow
      // 63: bipush 1
      // 64: goto 6b
      // 67: invokestatic z83$5.a (Loov;)Loov;
      // 6a: athrow
      // 6b: goto 6f
      // 6e: bipush 0
      // 6f: ireturn
   }

   public boolean apply(Object var1) {
      return this.qae((i2h)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
