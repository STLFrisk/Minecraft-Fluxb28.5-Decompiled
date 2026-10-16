public class kxi$m6s extends bww {
   private kxi aoe;

   public kxi$m6s(kxi var1) {
      super(var1);
      this.aoe = var1;
   }

   @Override
   public void nju() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 45
      // 09: getfield kxi$m6s.aoe Lkxi;
      // 0c: getfield kxi.lfk Z
      // 0f: ifeq 44
      // 12: goto 19
      // 15: invokestatic kxi$m6s.b (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: iload 1
      // 1b: ifeq 45
      // 1e: goto 25
      // 21: invokestatic kxi$m6s.b (Loov;)Loov;
      // 24: athrow
      // 25: getfield kxi$m6s.aoe Lkxi;
      // 28: invokevirtual kxi.lm5 ()Z
      // 2b: ifne 44
      // 2e: goto 35
      // 31: invokestatic kxi$m6s.b (Loov;)Loov;
      // 34: athrow
      // 35: aload 0
      // 36: getfield kxi$m6s.aoe Lkxi;
      // 39: dconst_0
      // 3a: invokevirtual kxi.uf3 (D)V
      // 3d: goto 44
      // 40: invokestatic kxi$m6s.b (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: invokespecial bww.nju ()V
      // 48: return
   }

   private static oov b(oov var0) {
      return var0;
   }
}
