public class kxi$x9z extends rr0 {
   private kxi uov;
   private boolean vk9;
   public final kxi ue6;

   public kxi$x9z(kxi var1, kxi var2) {
      super(var2);
      this.ue6 = var1;
      this.vk9 = false;
      this.uov = var2;
   }

   public boolean pt9() {
      return this.k1a;
   }

   public boolean a5h() {
      return this.vk9;
   }

   public void gzd(boolean var1) {
      this.vk9 = var1;
   }

   @Override
   public void fbz() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.b ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifeq 28
      // 09: getfield kxi$x9z.k1a Z
      // 0c: ifeq 2c
      // 0f: goto 16
      // 12: invokestatic kxi$x9z.a (Loov;)Loov;
      // 15: athrow
      // 16: aload 0
      // 17: getfield kxi$x9z.uov Lkxi;
      // 1a: getstatic kxi$vxo.jat Lkxi$vxo;
      // 1d: invokevirtual kxi.l7k (Lkxi$vxo;)V
      // 20: aload 0
      // 21: goto 28
      // 24: invokestatic kxi$x9z.a (Loov;)Loov;
      // 27: athrow
      // 28: bipush 0
      // 29: putfield kxi$x9z.k1a Z
      // 2c: return
   }

   private static oov a(oov var0) {
      return var0;
   }
}
