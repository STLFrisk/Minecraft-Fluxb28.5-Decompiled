public class p1g extends cjm {
   public double x13;

   public p1g(laq var1, double var2) {
      this.ot9 = var1;
      this.x13 = var2;
      this.k23(1);
   }

   @Override
   public boolean vle() {
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
      // 05: getfield p1g.ot9 Llaq;
      // 08: iload 1
      // 09: ifeq 3f
      // 0c: invokevirtual laq.myo ()Lg_3;
      // 0f: ifnonnull 3b
      // 12: goto 19
      // 15: invokestatic p1g.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getfield p1g.ot9 Llaq;
      // 1d: iload 1
      // 1e: ifeq 3f
      // 21: goto 28
      // 24: invokestatic p1g.a (Loov;)Loov;
      // 27: athrow
      // 28: invokevirtual laq.agj ()Z
      // 2b: ifne 3b
      // 2e: goto 35
      // 31: invokestatic p1g.a (Loov;)Loov;
      // 34: athrow
      // 35: bipush 0
      // 36: ireturn
      // 37: invokestatic p1g.a (Loov;)Loov;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield p1g.ot9 Llaq;
      // 3f: bipush 5
      // 40: bipush 4
      // 41: invokestatic zim.jb8 (Llaq;II)Lfqr;
      // 44: astore 2
      // 45: iload 1
      // 46: ifeq 72
      // 49: aload 2
      // 4a: ifnonnull 5a
      // 4d: goto 54
      // 50: invokestatic p1g.a (Loov;)Loov;
      // 53: athrow
      // 54: bipush 0
      // 55: ireturn
      // 56: invokestatic p1g.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: aload 2
      // 5c: getfield fqr.lvi D
      // 5f: putfield p1g._wk D
      // 62: aload 0
      // 63: aload 2
      // 64: getfield fqr.gn5 D
      // 67: putfield p1g.uz8 D
      // 6a: aload 0
      // 6b: aload 2
      // 6c: getfield fqr.bn2 D
      // 6f: putfield p1g.a8e D
      // 72: bipush 1
      // 73: ireturn
   }

   @Override
   public void mnp() {
      this.ot9.zq2().ni_(this._wk, this.uz8, this.a8e, this.x13);
   }

   @Override
   public boolean wh3() {
      int var1 = t9d.b();

      try {
         boolean var10000 = this.ot9.zq2().j07();
         if (var1 == 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
