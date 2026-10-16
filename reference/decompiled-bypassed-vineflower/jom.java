public class jom {
   public static jom yut() {
      return d86;
   }

   public jom(int var1) {
      this.x5m = new q3g(var1);
   }

   public void q7g() {
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
      // 05: getfield jom.x5m Lq3g;
      // 08: iload 1
      // 09: ifeq 2e
      // 0c: getfield q3g.fho Ljava/util/BitSet;
      // 0f: ifnull 2a
      // 12: goto 19
      // 15: invokestatic jom.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield jom.x5m Lq3g;
      // 1d: getfield q3g.fho Ljava/util/BitSet;
      // 20: invokestatic net/optifine/SmartAnimations.spritesRendered (Ljava/util/BitSet;)V
      // 23: goto 2a
      // 26: invokestatic jom.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 0
      // 2b: getfield jom.x5m Lq3g;
      // 2e: invokevirtual q3g.xku ()V
      // 31: aload 0
      // 32: getfield jom._a_ Laev;
      // 35: aload 0
      // 36: getfield jom.x5m Lq3g;
      // 39: invokevirtual aev.n7l (Lq3g;)V
      // 3c: return
   }

   public q3g zuq() {
      return this.x5m;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
