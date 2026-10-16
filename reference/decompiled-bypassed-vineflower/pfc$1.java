import com.google.common.base.Predicate;

public final class pfc$1 implements Predicate {
   public boolean n2c(zfz param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: aload 1
      // 05: iload 2
      // 06: ifne 14
      // 09: ifnull 45
      // 0c: goto 13
      // 0f: invokestatic pfc$1.a (Loov;)Loov;
      // 12: athrow
      // 13: aload 1
      // 14: invokeinterface zfz.r_y ()Le0x; 1
      // 19: getstatic ox_.jzx Le0x;
      // 1c: iload 2
      // 1d: ifne 3a
      // 20: if_acmpeq 3d
      // 23: goto 2a
      // 26: invokestatic pfc$1.a (Loov;)Loov;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokeinterface zfz.r_y ()Le0x; 1
      // 30: getstatic ox_.pj4 Le0x;
      // 33: goto 3a
      // 36: invokestatic pfc$1.a (Loov;)Loov;
      // 39: athrow
      // 3a: if_acmpne 45
      // 3d: bipush 1
      // 3e: goto 46
      // 41: invokestatic pfc$1.a (Loov;)Loov;
      // 44: athrow
      // 45: bipush 0
      // 46: ireturn
   }

   public boolean apply(Object var1) {
      return this.n2c((zfz)var1);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
