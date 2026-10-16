public class sf8$jrb {
   private final sf8$hj6 g5s;
   private int z7s;
   private int _3o;
   private final int y6g;

   public sf8$jrb(sf8$hj6 var1, int var2, int var3) {
      this.g5s = var1;
      this.z7s = var2;
      this._3o = var2;
      this.y6g = var3;
   }

   public void akb(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 2
      // 04: iload 1
      // 05: aload 0
      // 06: getfield sf8$jrb.z7s I
      // 09: iload 2
      // 0a: ifeq 33
      // 0d: if_icmpge 27
      // 10: goto 17
      // 13: invokestatic sf8$jrb.a (Loov;)Loov;
      // 16: athrow
      // 17: aload 0
      // 18: iload 1
      // 19: putfield sf8$jrb.z7s I
      // 1c: iload 2
      // 1d: ifne 42
      // 20: goto 27
      // 23: invokestatic sf8$jrb.a (Loov;)Loov;
      // 26: athrow
      // 27: iload 1
      // 28: aload 0
      // 29: getfield sf8$jrb._3o I
      // 2c: goto 33
      // 2f: invokestatic sf8$jrb.a (Loov;)Loov;
      // 32: athrow
      // 33: if_icmple 42
      // 36: aload 0
      // 37: iload 1
      // 38: putfield sf8$jrb._3o I
      // 3b: goto 42
      // 3e: invokestatic sf8$jrb.a (Loov;)Loov;
      // 41: athrow
      // 42: return
   }

   public sf8$hj6 kf1() {
      return this.g5s;
   }

   public int vzk() {
      return this.z7s;
   }

   public int dxx() {
      return this._3o;
   }

   public int oz8() {
      return this.y6g;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
