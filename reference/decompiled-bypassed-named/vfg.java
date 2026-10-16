public class vfg {
   public static void vik(int[] var0) {
      lsv = var0;
   }

   public static int vkm(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 2
      // 01: dload 0
      // 02: dmul
      // 03: dstore 2
      // 04: invokestatic OpaquePredicate.b ()I
      // 07: dconst_1
      // 08: dload 0
      // 09: dsub
      // 0a: ldc2_w 255.0
      // 0d: dmul
      // 0e: d2i
      // 0f: istore 5
      // 11: istore 4
      // 13: dconst_1
      // 14: dload 2
      // 15: dsub
      // 16: ldc2_w 255.0
      // 19: dmul
      // 1a: d2i
      // 1b: istore 6
      // 1d: iload 6
      // 1f: bipush 8
      // 21: ishl
      // 22: iload 5
      // 24: ior
      // 25: istore 7
      // 27: iload 7
      // 29: iload 4
      // 2b: ifeq 46
      // 2e: getstatic vfg.lsv [I
      // 31: arraylength
      // 32: if_icmple 49
      // 35: goto 3c
      // 38: invokestatic vfg.a (Loov;)Loov;
      // 3b: athrow
      // 3c: ldc -65281
      // 3e: nop
      // 3f: goto 46
      // 42: invokestatic vfg.a (Loov;)Loov;
      // 45: athrow
      // 46: goto 4f
      // 49: getstatic vfg.lsv [I
      // 4c: iload 7
      // 4e: iaload
      // 4f: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
