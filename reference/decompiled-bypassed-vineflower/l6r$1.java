import com.google.common.base.Predicate;

public class l6r$1 implements Predicate {
   public final z96 b3s;
   public final _ss f5p;
   public final l6r ion;

   public l6r$1(l6r var1, z96 var2, _ss var3) {
      this.ion = var1;
      this.b3s = var2;
      this.f5p = var3;
   }

   public boolean ccu(l7l param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield l6r$1.b3s Lz96;
      // 04: invokevirtual z96._m3 ()Ldc5;
      // 07: aload 1
      // 08: invokevirtual dc5.ktg (Ll7l;)Z
      // 0b: ifeq 25
      // 0e: aload 1
      // 0f: aload 0
      // 10: getfield l6r$1.f5p L_ss;
      // 13: if_acmpeq 25
      // 16: goto 1d
      // 19: invokestatic l6r$1.a (Loov;)Loov;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto 26
      // 21: invokestatic l6r$1.a (Loov;)Loov;
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
   }

   public boolean apply(Object var1) {
      return this.ccu((l7l)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
