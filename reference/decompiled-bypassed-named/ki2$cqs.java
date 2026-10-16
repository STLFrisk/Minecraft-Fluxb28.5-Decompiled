public class ki2$cqs implements a6_ {
   @Override
   public flo r1r(int param1, OpaquePredicate param2, double param3, double param5, double param7, double param9, double param11, double param13, int[] param15) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 16
      // 05: aload 15
      // 07: arraylength
      // 08: iload 16
      // 0a: ifeq 23
      // 0d: bipush 1
      // 0e: if_icmple 26
      // 11: goto 18
      // 14: invokestatic ki2$cqs.a (Loov;)Loov;
      // 17: athrow
      // 18: aload 15
      // 1a: bipush 1
      // 1b: iaload
      // 1c: goto 23
      // 1f: invokestatic ki2$cqs.a (Loov;)Loov;
      // 22: athrow
      // 23: goto 27
      // 26: bipush 0
      // 27: istore 17
      // 29: new ki2
      // 2c: dup
      // 2d: aload 2
      // 2e: dload 3
      // 2f: dload 5
      // 31: dload 7
      // 33: dload 9
      // 35: dload 11
      // 37: dload 13
      // 39: aload 15
      // 3b: bipush 0
      // 3c: iaload
      // 3d: invokestatic u7m.ltr (I)Lu7m;
      // 40: iload 17
      // 42: invokespecial ki2.<init> (Lt9d;DDDDDDLu7m;I)V
      // 45: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
