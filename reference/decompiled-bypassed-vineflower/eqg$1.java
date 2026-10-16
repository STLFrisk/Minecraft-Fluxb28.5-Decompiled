import java.util.Iterator;

public class eqg$1 implements Iterable {
   public final Class t_a;
   public final eqg vec;

   public eqg$1(eqg var1, Class var2) {
      this.vec = var1;
      this.t_a = var2;
   }

   @Override
   public Iterator iterator() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield eqg$1.vec Leqg;
      // 08: invokestatic eqg.dd1 (Leqg;)Ljava/util/Map;
      // 0b: aload 0
      // 0c: getfield eqg$1.vec Leqg;
      // 0f: aload 0
      // 10: getfield eqg$1.t_a Ljava/lang/Class;
      // 13: invokevirtual eqg.aun (Ljava/lang/Class;)Ljava/lang/Class;
      // 16: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 1b: checkcast java/util/List
      // 1e: astore 2
      // 1f: aload 2
      // 20: iload 1
      // 21: ifeq 37
      // 24: ifnonnull 36
      // 27: goto 2e
      // 2a: invokestatic eqg$1.a (Loov;)Loov;
      // 2d: athrow
      // 2e: invokestatic com/google/common/collect/Iterators.emptyIterator ()Lcom/google/common/collect/UnmodifiableIterator;
      // 31: areturn
      // 32: invokestatic eqg$1.a (Loov;)Loov;
      // 35: athrow
      // 36: aload 2
      // 37: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 3c: astore 3
      // 3d: aload 3
      // 3e: aload 0
      // 3f: getfield eqg$1.t_a Ljava/lang/Class;
      // 42: invokestatic com/google/common/collect/Iterators.filter (Ljava/util/Iterator;Ljava/lang/Class;)Lcom/google/common/collect/UnmodifiableIterator;
      // 45: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
