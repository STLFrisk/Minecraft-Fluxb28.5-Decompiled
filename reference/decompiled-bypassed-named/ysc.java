public class ysc extends l68 {
   public boolean n2q;
   public int hcj;

   public ysc(yqv var1, boolean var2) {
      super(var1);
      this.r2g = var1;
      this.n2q = var2;
   }

   @Override
   public boolean wh3() {
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
      // 05: getfield ysc.n2q Z
      // 08: iload 1
      // 09: ifeq 21
      // 0c: ifeq 4c
      // 0f: goto 16
      // 12: invokestatic ysc.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield ysc.hcj I
      // 1a: goto 21
      // 1d: invokestatic ysc.a (Loov;)Loov;
      // 20: athrow
      // 21: iload 1
      // 22: ifeq 3a
      // 25: ifle 4c
      // 28: goto 2f
      // 2b: invokestatic ysc.a (Loov;)Loov;
      // 2e: athrow
      // 2f: aload 0
      // 30: invokespecial l68.wh3 ()Z
      // 33: goto 3a
      // 36: invokestatic ysc.a (Loov;)Loov;
      // 39: athrow
      // 3a: iload 1
      // 3b: ifeq 49
      // 3e: ifeq 4c
      // 41: goto 48
      // 44: invokestatic ysc.a (Loov;)Loov;
      // 47: athrow
      // 48: bipush 1
      // 49: goto 4d
      // 4c: bipush 0
      // 4d: ireturn
   }

   @Override
   public void mnp() {
      this.hcj = 20;
      this.xiw.cl0(this.r2g.oay, this.yz3, true);
   }

   @Override
   public void zly() {
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
      // 06: ifeq 1e
      // 09: getfield ysc.n2q Z
      // 0c: ifeq 30
      // 0f: goto 16
      // 12: invokestatic ysc.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: goto 1e
      // 1a: invokestatic ysc.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getfield ysc.xiw Lw4e;
      // 21: aload 0
      // 22: getfield ysc.r2g Lyqv;
      // 25: getfield yqv.oay Lt9d;
      // 28: aload 0
      // 29: getfield ysc.yz3 Lmew;
      // 2c: bipush 0
      // 2d: invokevirtual w4e.cl0 (Lt9d;Lmew;Z)V
      // 30: return
   }

   @Override
   public void iad() {
      this.hcj--;
      super.iad();
   }

   private static oov a(oov var0) {
      return var0;
   }
}
