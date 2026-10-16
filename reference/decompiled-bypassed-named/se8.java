public class se8 extends ttt {
   public se8(long var1, ttt var3) {
      super(var1);
      this.ty5 = var3;
   }

   @Override
   public int[] ub9(int param1, int param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield se8.ty5 Lttt;
      // 04: iload 1
      // 05: iload 2
      // 06: iload 3
      // 07: iload 4
      // 09: invokevirtual ttt.ub9 (IIII)[I
      // 0c: astore 6
      // 0e: iload 3
      // 0f: iload 4
      // 11: imul
      // 12: invokestatic z97.web (I)[I
      // 15: astore 7
      // 17: invokestatic OpaquePredicate.c ()I
      // 1a: bipush 0
      // 1b: istore 8
      // 1d: istore 5
      // 1f: iload 8
      // 21: iload 4
      // 23: if_icmpge 90
      // 26: bipush 0
      // 27: istore 9
      // 29: iload 9
      // 2b: iload 3
      // 2c: if_icmpge 88
      // 2f: aload 0
      // 30: iload 9
      // 32: iload 1
      // 33: iadd
      // 34: i2l
      // 35: iload 8
      // 37: iload 2
      // 38: iadd
      // 39: i2l
      // 3a: invokevirtual se8.drx (JJ)V
      // 3d: aload 7
      // 3f: iload 5
      // 41: ifne 92
      // 44: iload 9
      // 46: iload 8
      // 48: iload 3
      // 49: imul
      // 4a: iadd
      // 4b: aload 6
      // 4d: iload 9
      // 4f: iload 8
      // 51: iload 3
      // 52: imul
      // 53: iadd
      // 54: iaload
      // 55: iload 5
      // 57: ifne 7b
      // 5a: goto 61
      // 5d: invokestatic se8.a (Loov;)Loov;
      // 60: athrow
      // 61: ifle 7e
      // 64: goto 6b
      // 67: invokestatic se8.a (Loov;)Loov;
      // 6a: athrow
      // 6b: aload 0
      // 6c: ldc 299999
      // 6e: nop
      // 6f: invokevirtual se8.nbt (I)I
      // 72: bipush 2
      // 73: iadd
      // 74: goto 7b
      // 77: invokestatic se8.a (Loov;)Loov;
      // 7a: athrow
      // 7b: goto 7f
      // 7e: bipush 0
      // 7f: iastore
      // 80: iinc 9 1
      // 83: iload 5
      // 85: ifeq 29
      // 88: iinc 8 1
      // 8b: iload 5
      // 8d: ifeq 1f
      // 90: aload 7
      // 92: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
