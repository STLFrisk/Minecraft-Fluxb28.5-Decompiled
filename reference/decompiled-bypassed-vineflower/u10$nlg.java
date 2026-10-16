public class u10$nlg extends h2d {
   public u10$nlg(u10 var1, Class var2) {
      super(var1, var2, 1.0, true);
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
      // 00: invokestatic t9d.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getfield u10$nlg.w75 Llaq;
      // 08: fconst_1
      // 09: invokevirtual laq.xeu (F)F
      // 0c: fstore 2
      // 0d: fload 2
      // 0e: ldc 0.5
      // 10: nop
      // 11: fcmpl
      // 12: iload 1
      // 13: ifne 56
      // 16: iflt 52
      // 19: goto 20
      // 1c: invokestatic u10$nlg.b (Loov;)Loov;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield u10$nlg.w75 Llaq;
      // 24: invokevirtual laq.mbr ()Ljava/util/Random;
      // 27: bipush 100
      // 29: invokevirtual java/util/Random.nextInt (I)I
      // 2c: iload 1
      // 2d: ifne 56
      // 30: goto 37
      // 33: invokestatic u10$nlg.b (Loov;)Loov;
      // 36: athrow
      // 37: ifne 52
      // 3a: goto 41
      // 3d: invokestatic u10$nlg.b (Loov;)Loov;
      // 40: athrow
      // 41: aload 0
      // 42: getfield u10$nlg.w75 Llaq;
      // 45: aconst_null
      // 46: checkcast g_3
      // 49: invokevirtual laq.ux8 (Lg_3;)V
      // 4c: bipush 0
      // 4d: ireturn
      // 4e: invokestatic u10$nlg.b (Loov;)Loov;
      // 51: athrow
      // 52: aload 0
      // 53: invokespecial h2d.wh3 ()Z
      // 56: ireturn
   }

   @Override
   public double t5_(g_3 var1) {
      return (double)(4.0F + var1.uo6);
   }

   private static oov b(oov var0) {
      return var0;
   }
}
