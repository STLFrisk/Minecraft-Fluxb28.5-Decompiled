import com.google.common.base.Predicate;

public class c9p$1 implements Predicate {
   public final c9p x2z;

   public c9p$1(c9p var1) {
      this.x2z = var1;
   }

   public boolean mb1(z96 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield c9p$1.x2z Lc9p;
      // 08: aload 1
      // 09: invokevirtual c9p.wxg (Li2h;)D
      // 0c: ldc2_w 2500.0
      // 0f: dcmpg
      // 10: iload 2
      // 11: ifne 2c
      // 14: ifge 3e
      // 17: goto 1e
      // 1a: invokestatic c9p$1.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 1
      // 1f: getfield z96._am Lrsh;
      // 22: invokevirtual rsh.pcm ()Z
      // 25: goto 2c
      // 28: invokestatic c9p$1.a (Loov;)Loov;
      // 2b: athrow
      // 2c: iload 2
      // 2d: ifne 3b
      // 30: ifeq 3e
      // 33: goto 3a
      // 36: invokestatic c9p$1.a (Loov;)Loov;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 3f
      // 3e: bipush 0
      // 3f: ireturn
   }

   public boolean apply(Object var1) {
      return this.mb1((z96)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
