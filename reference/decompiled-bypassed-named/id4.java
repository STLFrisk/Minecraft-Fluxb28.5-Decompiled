public class id4 implements Comparable {
   private final String xs2;
   private final String pxq;
   private final long hue;
   private final long gom;
   private final boolean l9y;
   private final h50$f05 lxn;
   private final boolean th0;
   private final boolean znj;

   public id4(String var1, String var2, long var3, long var5, h50$f05 var7, boolean var8, boolean var9, boolean var10) {
      this.xs2 = var1;
      this.pxq = var2;
      this.hue = var3;
      this.gom = var5;
      this.lxn = var7;
      this.l9y = var8;
      this.th0 = var9;
      this.znj = var10;
   }

   public String e88() {
      return this.xs2;
   }

   public String ic0() {
      return this.pxq;
   }

   public long yqg() {
      return this.gom;
   }

   public boolean fvv() {
      return this.l9y;
   }

   public long a7u() {
      return this.hue;
   }

   public int hvx(id4 param1) {
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
      // 05: getfield id4.hue J
      // 08: aload 1
      // 09: getfield id4.hue J
      // 0c: lcmp
      // 0d: iload 2
      // 0e: ifeq 37
      // 11: ifge 23
      // 14: goto 1b
      // 17: invokestatic id4.a (Loov;)Loov;
      // 1a: athrow
      // 1b: bipush 1
      // 1c: goto 4d
      // 1f: invokestatic id4.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: iload 2
      // 25: ifeq 43
      // 28: getfield id4.hue J
      // 2b: aload 1
      // 2c: getfield id4.hue J
      // 2f: lcmp
      // 30: goto 37
      // 33: invokestatic id4.a (Loov;)Loov;
      // 36: athrow
      // 37: ifle 42
      // 3a: bipush -1
      // 3b: goto 4d
      // 3e: invokestatic id4.a (Loov;)Loov;
      // 41: athrow
      // 42: aload 0
      // 43: getfield id4.xs2 Ljava/lang/String;
      // 46: aload 1
      // 47: getfield id4.xs2 Ljava/lang/String;
      // 4a: invokevirtual java/lang/String.compareTo (Ljava/lang/String;)I
      // 4d: ireturn
   }

   public h50$f05 fgi() {
      return this.lxn;
   }

   public boolean _go() {
      return this.th0;
   }

   public boolean jff() {
      return this.znj;
   }

   @Override
   public int compareTo(Object var1) {
      return this.hvx((id4)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
