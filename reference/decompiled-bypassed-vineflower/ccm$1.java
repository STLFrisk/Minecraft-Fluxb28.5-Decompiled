import com.google.common.base.Predicate;

public class ccm$1 implements Predicate {
   public final ccm l01;

   public ccm$1(ccm var1) {
      this.l01 = var1;
   }

   public boolean joq(i2h param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 2
      // 04: aload 1
      // 05: invokevirtual i2h.gzr ()Z
      // 08: iload 2
      // 09: ifeq 2b
      // 0c: ifeq 3d
      // 0f: goto 16
      // 12: invokestatic ccm$1.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ccm$1.l01 Lccm;
      // 1a: getfield ccm.m8z Llaq;
      // 1d: invokevirtual laq.dov ()Ld6l;
      // 20: aload 1
      // 21: invokevirtual d6l.ik5 (Li2h;)Z
      // 24: goto 2b
      // 27: invokestatic ccm$1.a (Loov;)Loov;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ifeq 3a
      // 2f: ifeq 3d
      // 32: goto 39
      // 35: invokestatic ccm$1.a (Loov;)Loov;
      // 38: athrow
      // 39: bipush 1
      // 3a: goto 3e
      // 3d: bipush 0
      // 3e: ireturn
   }

   public boolean apply(Object var1) {
      return this.joq((i2h)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
