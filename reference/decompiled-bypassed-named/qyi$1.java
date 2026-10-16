public class qyi$1 extends vrx {
   public final qyi htf;

   public qyi$1(qyi var1, rsi var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.htf = var1;
   }

   @Override
   public boolean xvl(erg param1) {
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
      // 05: aload 1
      // 06: invokespecial vrx.xvl (Lerg;)Z
      // 09: ifeq 3a
      // 0c: aload 1
      // 0d: invokevirtual erg.gn1 ()Lu7m;
      // 10: getstatic xbr.fpq Lu7m;
      // 13: if_acmpne 3a
      // 16: goto 1d
      // 19: invokestatic qyi$1.a (Loov;)Loov;
      // 1c: athrow
      // 1d: aload 0
      // 1e: invokevirtual qyi$1.hf8 ()Z
      // 21: iload 2
      // 22: ifeq 37
      // 25: goto 2c
      // 28: invokestatic qyi$1.a (Loov;)Loov;
      // 2b: athrow
      // 2c: ifne 3a
      // 2f: goto 36
      // 32: invokestatic qyi$1.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3b
      // 3a: bipush 0
      // 3b: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
