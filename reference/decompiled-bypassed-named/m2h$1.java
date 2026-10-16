public class m2h$1 implements ha_ {
   public final m2h dz5;

   public m2h$1(m2h var1) {
      this.dz5 = var1;
   }

   @Override
   public void confirmClicked(boolean param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield m2h$1.dz5 Lm2h;
      // 04: getfield m2h.bp3 Lt1s;
      // 07: aload 0
      // 08: getfield m2h$1.dz5 Lm2h;
      // 0b: invokevirtual t1s.esm (Lm2h;)Ljava/util/List;
      // 0e: astore 4
      // 10: invokestatic OpaquePredicate.b ()I
      // 13: aload 0
      // 14: getfield m2h$1.dz5 Lm2h;
      // 17: getfield m2h.ibh Lc05;
      // 1a: aload 0
      // 1b: getfield m2h$1.dz5 Lm2h;
      // 1e: getfield m2h.bp3 Lt1s;
      // 21: invokevirtual Minecraft.z2i (Lgbe;)V
      // 24: istore 3
      // 25: iload 1
      // 26: iload 3
      // 27: ifeq 46
      // 2a: ifeq 5b
      // 2d: goto 34
      // 30: invokestatic m2h$1.a (Loov;)Loov;
      // 33: athrow
      // 34: aload 4
      // 36: aload 0
      // 37: getfield m2h$1.dz5 Lm2h;
      // 3a: invokeinterface java/util/List.remove (Ljava/lang/Object;)Z 2
      // 3f: goto 46
      // 42: invokestatic m2h$1.a (Loov;)Loov;
      // 45: athrow
      // 46: pop
      // 47: aload 0
      // 48: getfield m2h$1.dz5 Lm2h;
      // 4b: getfield m2h.bp3 Lt1s;
      // 4e: invokevirtual t1s.rtt ()Ljava/util/List;
      // 51: bipush 0
      // 52: aload 0
      // 53: getfield m2h$1.dz5 Lm2h;
      // 56: invokeinterface java/util/List.add (ILjava/lang/Object;)V 3
      // 5b: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
