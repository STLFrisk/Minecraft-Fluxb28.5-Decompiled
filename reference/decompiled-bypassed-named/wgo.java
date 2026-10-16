import com.google.common.base.Objects;

public class wgo implements Comparable {
   public static final wgo mm3 = new wgo(0, 0, 0);
   private final int ei4;
   private final int yt3;
   private final int ahe;

   public wgo(int var1, int var2, int var3) {
      this.ei4 = var1;
      this.yt3 = var2;
      this.ahe = var3;
   }

   public wgo(double var1, double var3, double var5) {
      this(fe6.jqf(var1), fe6.jqf(var3), fe6.jqf(var5));
   }

   @Override
   public boolean equals(Object param1) {
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
      // 05: iload 2
      // 06: ifeq 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic wgo.c (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic wgo.c (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifeq 33
      // 1f: instanceof wgo
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic wgo.c (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic wgo.c (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast wgo
      // 36: astore 3
      // 37: aload 0
      // 38: invokevirtual wgo.getX ()I
      // 3b: aload 3
      // 3c: invokevirtual wgo.getX ()I
      // 3f: iload 2
      // 40: ifeq 5d
      // 43: if_icmpeq 55
      // 46: goto 4d
      // 49: invokestatic wgo.c (Loov;)Loov;
      // 4c: athrow
      // 4d: bipush 0
      // 4e: goto 8e
      // 51: invokestatic wgo.c (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: invokevirtual wgo.getY ()I
      // 59: aload 3
      // 5a: invokevirtual wgo.getY ()I
      // 5d: iload 2
      // 5e: ifeq 86
      // 61: if_icmpeq 73
      // 64: goto 6b
      // 67: invokestatic wgo.c (Loov;)Loov;
      // 6a: athrow
      // 6b: bipush 0
      // 6c: goto 8e
      // 6f: invokestatic wgo.c (Loov;)Loov;
      // 72: athrow
      // 73: aload 0
      // 74: invokevirtual wgo.getZ ()I
      // 77: iload 2
      // 78: ifeq 8a
      // 7b: aload 3
      // 7c: invokevirtual wgo.getZ ()I
      // 7f: goto 86
      // 82: invokestatic wgo.c (Loov;)Loov;
      // 85: athrow
      // 86: if_icmpne 8d
      // 89: bipush 1
      // 8a: goto 8e
      // 8d: bipush 0
      // 8e: ireturn
   }

   @Override
   public int hashCode() {
      return (this.getY() + this.getZ() * 31) * 31 + this.getX();
   }

   public int axh(wgo param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: invokevirtual wgo.getY ()I
      // 08: aload 1
      // 09: invokevirtual wgo.getY ()I
      // 0c: iload 2
      // 0d: ifne 5b
      // 10: if_icmpne 53
      // 13: goto 1a
      // 16: invokestatic wgo.c (Loov;)Loov;
      // 19: athrow
      // 1a: aload 0
      // 1b: invokevirtual wgo.getZ ()I
      // 1e: aload 1
      // 1f: invokevirtual wgo.getZ ()I
      // 22: iload 2
      // 23: ifne 4f
      // 26: goto 2d
      // 29: invokestatic wgo.c (Loov;)Loov;
      // 2c: athrow
      // 2d: if_icmpne 47
      // 30: goto 37
      // 33: invokestatic wgo.c (Loov;)Loov;
      // 36: athrow
      // 37: aload 0
      // 38: invokevirtual wgo.getX ()I
      // 3b: aload 1
      // 3c: invokevirtual wgo.getX ()I
      // 3f: isub
      // 40: goto 5c
      // 43: invokestatic wgo.c (Loov;)Loov;
      // 46: athrow
      // 47: aload 0
      // 48: invokevirtual wgo.getZ ()I
      // 4b: aload 1
      // 4c: invokevirtual wgo.getZ ()I
      // 4f: isub
      // 50: goto 5c
      // 53: aload 0
      // 54: invokevirtual wgo.getY ()I
      // 57: aload 1
      // 58: invokevirtual wgo.getY ()I
      // 5b: isub
      // 5c: ireturn
   }

   public int getX() {
      return this.ei4;
   }

   public int getY() {
      return this.yt3;
   }

   public int getZ() {
      return this.ahe;
   }

   public wgo ufc(wgo var1) {
      return new wgo(
         this.getY() * var1.getZ() - this.getZ() * var1.getY(),
         this.getZ() * var1.getX() - this.getX() * var1.getZ(),
         this.getX() * var1.getY() - this.getY() * var1.getX()
      );
   }

   public double p4e(double var1, double var3, double var5) {
      double var7 = (double)this.getX() - var1;
      double var9 = (double)this.getY() - var3;
      double var11 = (double)this.getZ() - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double yib(double var1, double var3, double var5) {
      double var7 = (double)this.getX() + 0.5 - var1;
      double var9 = (double)this.getY() + 0.5 - var3;
      double var11 = (double)this.getZ() + 0.5 - var5;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public double t0u(wgo var1) {
      return this.p4e((double)var1.getX(), (double)var1.getY(), (double)var1.getZ());
   }

   @Override
   public String toString() {
      return Objects.toStringHelper(this).add("x", this.getX()).add("y", this.getY()).add("z", this.getZ()).toString();
   }

   @Override
   public int compareTo(Object var1) {
      return this.axh((wgo)var1);
   }

   private static oov c(oov var0) {
      return var0;
   }
}
