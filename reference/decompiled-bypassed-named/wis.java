public class wis {
   public final float wd3;
   public final float q1o;
   public final float lgy;

   public wis(float var1, float var2, float var3) {
      this.wd3 = var1;
      this.q1o = var2;
      this.lgy = var3;
   }

   public wis(qhg var1) {
      this.wd3 = var1.ofd(0);
      this.q1o = var1.ofd(1);
      this.lgy = var1.ofd(2);
   }

   public qhg x4n() {
      qhg var1 = new qhg();
      var1.w2j(new n8i(this.wd3));
      var1.w2j(new n8i(this.q1o));
      var1.w2j(new n8i(this.lgy));
      return var1;
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
      // 04: aload 1
      // 05: iload 2
      // 06: ifeq 1d
      // 09: instanceof wis
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic wis.a (Loov;)Loov;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic wis.a (Loov;)Loov;
      // 1b: athrow
      // 1c: aload 1
      // 1d: checkcast wis
      // 20: astore 3
      // 21: aload 0
      // 22: getfield wis.wd3 F
      // 25: aload 3
      // 26: getfield wis.wd3 F
      // 29: fcmpl
      // 2a: iload 2
      // 2b: ifeq 48
      // 2e: ifne 78
      // 31: goto 38
      // 34: invokestatic wis.a (Loov;)Loov;
      // 37: athrow
      // 38: aload 0
      // 39: getfield wis.q1o F
      // 3c: aload 3
      // 3d: getfield wis.q1o F
      // 40: fcmpl
      // 41: goto 48
      // 44: invokestatic wis.a (Loov;)Loov;
      // 47: athrow
      // 48: iload 2
      // 49: ifeq 66
      // 4c: ifne 78
      // 4f: goto 56
      // 52: invokestatic wis.a (Loov;)Loov;
      // 55: athrow
      // 56: aload 0
      // 57: getfield wis.lgy F
      // 5a: aload 3
      // 5b: getfield wis.lgy F
      // 5e: fcmpl
      // 5f: goto 66
      // 62: invokestatic wis.a (Loov;)Loov;
      // 65: athrow
      // 66: iload 2
      // 67: ifeq 75
      // 6a: ifne 78
      // 6d: goto 74
      // 70: invokestatic wis.a (Loov;)Loov;
      // 73: athrow
      // 74: bipush 1
      // 75: goto 79
      // 78: bipush 0
      // 79: ireturn
   }

   public float ins() {
      return this.wd3;
   }

   public float t9l() {
      return this.q1o;
   }

   public float pic() {
      return this.lgy;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
