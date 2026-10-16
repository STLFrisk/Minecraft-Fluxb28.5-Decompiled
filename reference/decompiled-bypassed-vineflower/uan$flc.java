public final class uan$flc implements Comparable {
   public double n20;
   public double n_7;
   public String guz;

   public uan$flc(String var1, double var2, double var4) {
      this.guz = var1;
      this.n20 = var2;
      this.n_7 = var4;
   }

   public int die(uan$flc param1) {
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
      // 05: getfield uan$flc.n20 D
      // 08: aload 0
      // 09: getfield uan$flc.n20 D
      // 0c: dcmpg
      // 0d: iload 2
      // 0e: ifeq 37
      // 11: ifge 23
      // 14: goto 1b
      // 17: invokestatic uan$flc.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush -1
      // 1c: goto 4d
      // 1f: invokestatic uan$flc.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 1
      // 24: iload 2
      // 25: ifeq 43
      // 28: getfield uan$flc.n20 D
      // 2b: aload 0
      // 2c: getfield uan$flc.n20 D
      // 2f: dcmpl
      // 30: goto 37
      // 33: invokestatic uan$flc.a (Loov;)Loov;
      // 36: athrow
      // 37: ifle 42
      // 3a: bipush 1
      // 3b: goto 4d
      // 3e: invokestatic uan$flc.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 1
      // 43: getfield uan$flc.guz Ljava/lang/String;
      // 46: aload 0
      // 47: getfield uan$flc.guz Ljava/lang/String;
      // 4a: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 4d: ireturn
   }

   public int iq7() {
      return (this.guz.hashCode() & 11184810) + 4473924;
   }

   @Override
   public int compareTo(Object var1) {
      return this.die((uan$flc)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
