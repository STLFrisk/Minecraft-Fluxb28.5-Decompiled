public class v58 implements lv1 {
   public v58(yu2 var1) {
      this.u27 = var1;
      this.q67 = new yig(this);
   }

   @Override
   public void onResourceManagerReload(y99 var1) {
      xrf var2 = new xrf(var1, this.u27, this.q67);
      this.b__ = var2.obk();
      this.tv9 = (dbw)this.b__._gz(xrf.k_k);
      this.q67.oyu();
   }

   public dbw a92(zlz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 26
      // 09: ifnonnull 1c
      // 0c: goto 13
      // 0f: invokestatic v58.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 0
      // 14: getfield v58.tv9 Ldbw;
      // 17: areturn
      // 18: invokestatic v58.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield v58.b__ La83;
      // 20: aload 1
      // 21: invokeinterface a83._gz (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 26: checkcast dbw
      // 29: astore 3
      // 2a: aload 3
      // 2b: iload 2
      // 2c: ifne 44
      // 2f: ifnonnull 47
      // 32: goto 39
      // 35: invokestatic v58.a (Loov;)Loov;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield v58.tv9 Ldbw;
      // 3d: goto 44
      // 40: invokestatic v58.a (Loov;)Loov;
      // 43: athrow
      // 44: goto 48
      // 47: aload 3
      // 48: areturn
   }

   public dbw ohw() {
      return this.tv9;
   }

   public yu2 j1e() {
      return this.u27;
   }

   public yig um8() {
      return this.q67;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
