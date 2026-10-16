public class tw2 extends goq implements fl3 {
   public tw2(String var1, ekw var2, int var3) {
      super(var2, var3);
      this.txo = var1;
   }

   @Override
   public int czu(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: aload 0
      // 05: getfield tw2.a7b Ljava/util/Map;
      // 08: iload 1
      // 09: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 11: iload 2
      // 12: ifeq 39
      // 15: ifeq 3c
      // 18: goto 1f
      // 1b: invokestatic tw2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield tw2.a7b Ljava/util/Map;
      // 23: iload 1
      // 24: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 27: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 2c: checkcast java/lang/Integer
      // 2f: invokevirtual java/lang/Integer.intValue ()I
      // 32: goto 39
      // 35: invokestatic tw2.a (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
      // 38: athrow
      // 39: goto 3d
      // 3c: bipush 0
      // 3d: ireturn
   }

   @Override
   public void r8i(int var1, int var2) {
      this.a7b.put(var1, var2);
   }

   @Override
   public int xa3() {
      return this.a7b.size();
   }

   @Override
   public boolean plq() {
      return false;
   }

   @Override
   public void w8c(axk var1) {
   }

   @Override
   public axk q2q() {
      return axk.sar;
   }

   @Override
   public String q4l() {
      return this.txo;
   }

   @Override
   public _jc b_f(jnq var1, ha9 var2) {
      throw new UnsupportedOperationException();
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
      return var0;
   }
}
