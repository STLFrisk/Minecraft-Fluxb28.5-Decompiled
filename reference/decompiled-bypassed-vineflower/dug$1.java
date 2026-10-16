import com.google.common.base.Predicate;

public class dug$1 implements Predicate {
   public final dug y_l;

   public dug$1(dug var1) {
      this.y_l = var1;
   }

   public boolean h60(g_3 param1) {
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
      // 05: iload 2
      // 06: ifeq 14
      // 09: ifnull 49
      // 0c: goto 13
      // 0f: invokestatic dug$1.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 1
      // 14: invokevirtual g_3.gzr ()Z
      // 17: iload 2
      // 18: ifeq 37
      // 1b: ifeq 49
      // 1e: goto 25
      // 21: invokestatic dug$1.a (Loov;)Loov;
      // 24: athrow
      // 25: aload 0
      // 26: getfield dug$1.y_l Ldug;
      // 29: aload 1
      // 2a: invokevirtual g_3.d3d ()Lmew;
      // 2d: invokevirtual dug.cfv (Lmew;)Z
      // 30: goto 37
      // 33: invokestatic dug$1.a (Loov;)Loov;
      // 36: athrow
      // 37: iload 2
      // 38: ifeq 46
      // 3b: ifeq 49
      // 3e: goto 45
      // 41: invokestatic dug$1.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 1
      // 46: goto 4a
      // 49: bipush 0
      // 4a: ireturn
   }

   public boolean apply(Object var1) {
      return this.h60((g_3)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
