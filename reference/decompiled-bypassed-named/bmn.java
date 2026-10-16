public class bmn {
   public bmn(ofh var1, int var2, float var3, float var4, String var5, float var6) {
      this._y6 = var1;
      this.d2u = var2;
      this.m33 = var4;
      this.f76 = var3;
      this.qyt = var5;
      this.j_n = var6;
   }

   public ofh o8c() {
      return this._y6;
   }

   public float e75() {
      return this.m33;
   }

   public boolean hwi() {
      return this._y6.nra() instanceof Entity;
   }

   public String s9y() {
      return this.qyt;
   }

   public ekw qn1() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: invokevirtual bmn.o8c ()Lofh;
      // 08: invokevirtual ofh.nra ()Li2h;
      // 0b: iload 1
      // 0c: ifne 28
      // 0f: ifnonnull 21
      // 12: goto 19
      // 15: invokestatic bmn.a (Loov;)Loov;
      // 18: athrow
      // 19: aconst_null
      // 1a: goto 2b
      // 1d: invokestatic bmn.a (Loov;)Loov;
      // 20: athrow
      // 21: aload 0
      // 22: invokevirtual bmn.o8c ()Lofh;
      // 25: invokevirtual ofh.nra ()Li2h;
      // 28: invokevirtual EntityLivingBase.xyw ()Lekw;
      // 2b: areturn
   }

   public float m1y() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: iload 1
      // 06: ifne 24
      // 09: getfield bmn._y6 Lofh;
      // 0c: getstatic ofh.r2b Lofh;
      // 0f: if_acmpne 23
      // 12: goto 19
      // 15: invokestatic bmn.a (Loov;)Loov;
      // 18: athrow
      // 19: ldc 3.4028235E38
      // 1b: nop
      // 1c: goto 27
      // 1f: invokestatic bmn.a (Loov;)Loov;
      // 22: athrow
      // 23: aload 0
      // 24: getfield bmn.j_n F
      // 27: freturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
