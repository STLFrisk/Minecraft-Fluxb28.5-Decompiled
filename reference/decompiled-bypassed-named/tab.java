public class tab {
   public final byte[] m6b;

   public tab(byte[] var1, int var2) {
      this.m6b = var1;
      this.zfe = var2;
      this.gis = var2 + 4;
   }

   public int pus(int param1, int param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: aload 0
      // 02: getfield tab.gis I
      // 05: ishl
      // 06: iload 3
      // 07: aload 0
      // 08: getfield tab.zfe I
      // 0b: ishl
      // 0c: ior
      // 0d: iload 2
      // 0e: ior
      // 0f: istore 5
      // 11: invokestatic OpaquePredicate.c ()I
      // 14: iload 5
      // 16: bipush 1
      // 17: ishr
      // 18: istore 6
      // 1a: istore 4
      // 1c: iload 5
      // 1e: bipush 1
      // 1f: iand
      // 20: istore 7
      // 22: iload 7
      // 24: iload 4
      // 26: ifne 4d
      // 29: ifne 44
      // 2c: goto 33
      // 2f: invokestatic tab.a (Loov;)Loov;
      // 32: athrow
      // 33: aload 0
      // 34: getfield tab.m6b [B
      // 37: iload 6
      // 39: baload
      // 3a: bipush 15
      // 3c: iand
      // 3d: goto 50
      // 40: invokestatic tab.a (Loov;)Loov;
      // 43: athrow
      // 44: aload 0
      // 45: getfield tab.m6b [B
      // 48: iload 6
      // 4a: baload
      // 4b: bipush 4
      // 4c: ishr
      // 4d: bipush 15
      // 4f: iand
      // 50: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
