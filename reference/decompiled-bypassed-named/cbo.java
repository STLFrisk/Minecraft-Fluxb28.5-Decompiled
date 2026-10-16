public class cbo extends kqk {
   public cbo(OpaquePredicate var1, crp var2, mew var3, int var4) {
      super(var1, var2, var3, var4);
   }

   public int _yp(w51 param1, cbc param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 3
      // 04: aload 2
      // 05: aload 1
      // 06: invokevirtual cbc.jo2 (Lw51;)Z
      // 09: iload 3
      // 0a: ifeq 27
      // 0d: ifne 2a
      // 10: goto 17
      // 13: invokestatic cbo.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: getfield cbo.gby I
      // 1b: aload 1
      // 1c: invokevirtual w51.ordinal ()I
      // 1f: iadd
      // 20: goto 27
      // 23: invokestatic cbo.a (Loov;)Loov;
      // 26: athrow
      // 27: goto 2b
      // 2a: bipush -1
      // 2b: ireturn
   }

   @Override
   public void qv0() {
      super.qv0();
      nkx.xz4(this.gby, w51.values().length);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
