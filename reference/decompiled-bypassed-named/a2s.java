public class a2s extends e0x {
   public a2s() {
      super(p3y.fdu);
      this.i3l(uja.qqf);
   }

   @Override
   public boolean cl2(OpaquePredicate param1, mew param2, zfz param3, ha9 param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 9
      // 05: aload 1
      // 06: getfield OpaquePredicate.v0f Z
      // 09: iload 9
      // 0b: ifeq 35
      // 0e: ifeq 1e
      // 11: goto 18
      // 14: invokestatic a2s.a (Loov;)Loov;
      // 17: athrow
      // 18: bipush 1
      // 19: ireturn
      // 1a: invokestatic a2s.a (Loov;)Loov;
      // 1d: athrow
      // 1e: aload 4
      // 20: new a2s$g9w
      // 23: dup
      // 24: aload 1
      // 25: aload 2
      // 26: invokespecial a2s$g9w.<init> (Lt9d;Lmew;)V
      // 29: invokevirtual ha9.xz_ (L_83;)V
      // 2c: aload 4
      // 2e: getstatic l9p.jf0 L_ss;
      // 31: invokevirtual ha9.aex (L_ss;)V
      // 34: bipush 1
      // 35: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
