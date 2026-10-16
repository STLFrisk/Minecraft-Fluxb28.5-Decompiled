import java.util.Iterator;

public class hdl$i7d implements Iterable {
   private final Class z4v;
   private final Iterable[] fbc;

   private hdl$i7d(Class var1, Iterable[] var2) {
      this.z4v = var1;
      this.fbc = var2;
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield hdl$i7d.fbc [Ljava/lang/Iterable;
      // 08: iload 1
      // 09: ifne 29
      // 0c: arraylength
      // 0d: ifgt 34
      // 10: goto 17
      // 13: invokestatic hdl$i7d.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield hdl$i7d.z4v Ljava/lang/Class;
      // 1b: bipush 0
      // 1c: invokestatic hdl.w5z (Ljava/lang/Class;I)[Ljava/lang/Object;
      // 1f: checkcast [Ljava/lang/Object;
      // 22: goto 29
      // 25: invokestatic hdl$i7d.a (Loov;)Loov;
      // 28: athrow
      // 29: invokestatic java/util/Collections.singletonList (Ljava/lang/Object;)Ljava/util/List;
      // 2c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 31: goto 44
      // 34: new hdl$i7d$d63
      // 37: dup
      // 38: aload 0
      // 39: getfield hdl$i7d.z4v Ljava/lang/Class;
      // 3c: aload 0
      // 3d: getfield hdl$i7d.fbc [Ljava/lang/Iterable;
      // 40: aconst_null
      // 41: invokespecial hdl$i7d$d63.<init> (Ljava/lang/Class;[Ljava/lang/Iterable;Lhdl$1;)V
      // 44: areturn
   }

   public hdl$i7d(Class var1, Iterable[] var2, hdl$1 var3) {
      this(var1, var2);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
