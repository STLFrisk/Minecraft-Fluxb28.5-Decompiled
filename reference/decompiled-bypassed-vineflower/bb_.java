public class bb_ extends zgs {
   public bb_(Float var1, Float var2) {
      super(var1, var2);
   }

   public bb_ hem(Float var1) {
      this.s6x(var1);
      return this;
   }

   public bb_ lhk(Float var1) {
      this.j2k(var1);
      return this;
   }

   public Float bdo() {
      return this.sl2().floatValue();
   }

   public Float jub() {
      return this.c3r().floatValue();
   }

   public bb_ o8s() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 0
      // 02: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 05: invokevirtual java/lang/Float.floatValue ()F
      // 08: ldc 360.0
      // 0a: nop
      // 0b: frem
      // 0c: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0f: invokevirtual bb_.hem (Ljava/lang/Float;)Lbb_;
      // 12: pop
      // 13: invokestatic t9d.c ()I
      // 16: aload 0
      // 17: aload 0
      // 18: invokevirtual bb_.jub ()Ljava/lang/Float;
      // 1b: invokevirtual java/lang/Float.floatValue ()F
      // 1e: ldc 360.0
      // 20: nop
      // 21: frem
      // 22: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 25: invokevirtual bb_.lhk (Ljava/lang/Float;)Lbb_;
      // 28: pop
      // 29: istore 1
      // 2a: aload 0
      // 2b: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 2e: invokevirtual java/lang/Float.floatValue ()F
      // 31: ldc -180.0
      // 33: nop
      // 34: fcmpg
      // 35: ifgt 5a
      // 38: aload 0
      // 39: aload 0
      // 3a: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 3d: invokevirtual java/lang/Float.floatValue ()F
      // 40: ldc 360.0
      // 42: nop
      // 43: fadd
      // 44: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 47: invokevirtual bb_.hem (Ljava/lang/Float;)Lbb_;
      // 4a: pop
      // 4b: iload 1
      // 4c: ifne 8a
      // 4f: iload 1
      // 50: ifeq 2a
      // 53: goto 5a
      // 56: invokestatic bb_.a (Loov;)Loov;
      // 59: athrow
      // 5a: aload 0
      // 5b: invokevirtual bb_.jub ()Ljava/lang/Float;
      // 5e: invokevirtual java/lang/Float.floatValue ()F
      // 61: ldc -180.0
      // 63: nop
      // 64: fcmpg
      // 65: ifgt 8a
      // 68: aload 0
      // 69: aload 0
      // 6a: invokevirtual bb_.jub ()Ljava/lang/Float;
      // 6d: invokevirtual java/lang/Float.floatValue ()F
      // 70: ldc 360.0
      // 72: nop
      // 73: fadd
      // 74: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 77: invokevirtual bb_.lhk (Ljava/lang/Float;)Lbb_;
      // 7a: pop
      // 7b: iload 1
      // 7c: ifne c1
      // 7f: iload 1
      // 80: ifeq 5a
      // 83: goto 8a
      // 86: invokestatic bb_.a (Loov;)Loov;
      // 89: athrow
      // 8a: aload 0
      // 8b: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 8e: invokevirtual java/lang/Float.floatValue ()F
      // 91: ldc 180.0
      // 93: nop
      // 94: fcmpl
      // 95: ifle c1
      // 98: aload 0
      // 99: aload 0
      // 9a: invokevirtual bb_.bdo ()Ljava/lang/Float;
      // 9d: invokevirtual java/lang/Float.floatValue ()F
      // a0: ldc 360.0
      // a2: nop
      // a3: fsub
      // a4: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // a7: invokevirtual bb_.hem (Ljava/lang/Float;)Lbb_;
      // aa: pop
      // ab: iload 1
      // ac: ifne f8
      // af: goto b6
      // b2: invokestatic bb_.a (Loov;)Loov;
      // b5: athrow
      // b6: iload 1
      // b7: ifeq 8a
      // ba: goto c1
      // bd: invokestatic bb_.a (Loov;)Loov;
      // c0: athrow
      // c1: aload 0
      // c2: invokevirtual bb_.jub ()Ljava/lang/Float;
      // c5: invokevirtual java/lang/Float.floatValue ()F
      // c8: ldc 180.0
      // ca: nop
      // cb: fcmpl
      // cc: ifle f8
      // cf: aload 0
      // d0: aload 0
      // d1: invokevirtual bb_.jub ()Ljava/lang/Float;
      // d4: invokevirtual java/lang/Float.floatValue ()F
      // d7: ldc 360.0
      // d9: nop
      // da: fsub
      // db: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // de: invokevirtual bb_.lhk (Ljava/lang/Float;)Lbb_;
      // e1: iload 1
      // e2: ifne f9
      // e5: goto ec
      // e8: invokestatic bb_.a (Loov;)Loov;
      // eb: athrow
      // ec: pop
      // ed: iload 1
      // ee: ifeq c1
      // f1: goto f8
      // f4: invokestatic bb_.a (Loov;)Loov;
      // f7: athrow
      // f8: aload 0
      // f9: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
