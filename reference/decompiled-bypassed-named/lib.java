public class lib {
   public lib(byte var1, byte var2, byte var3, byte var4) {
      this.lwz = var1;
      this.z4b = var2;
      this.c_c = var3;
      this.dnz = var4;
   }

   public lib(lib var1) {
      this.lwz = var1.lwz;
      this.z4b = var1.z4b;
      this.c_c = var1.c_c;
      this.dnz = var1.dnz;
   }

   public byte c0r() {
      return this.lwz;
   }

   public byte fr4() {
      return this.z4b;
   }

   public byte rxw() {
      return this.c_c;
   }

   public byte txm() {
      return this.dnz;
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
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: aload 0
      // 05: iload 2
      // 06: ifne 1b
      // 09: aload 1
      // 0a: if_acmpne 1a
      // 0d: goto 14
      // 10: invokestatic lib.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 1
      // 15: ireturn
      // 16: invokestatic lib.a (Loov;)Loov;
      // 19: athrow
      // 1a: aload 1
      // 1b: iload 2
      // 1c: ifne 33
      // 1f: instanceof lib
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic lib.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
      // 2e: invokestatic lib.a (Loov;)Loov;
      // 31: athrow
      // 32: aload 1
      // 33: checkcast lib
      // 36: astore 3
      // 37: aload 0
      // 38: getfield lib.lwz B
      // 3b: aload 3
      // 3c: getfield lib.lwz B
      // 3f: iload 2
      // 40: ifne 5d
      // 43: if_icmpeq 55
      // 46: goto 4d
      // 49: invokestatic lib.a (Loov;)Loov;
      // 4c: athrow
      // 4d: bipush 0
      // 4e: goto ac
      // 51: invokestatic lib.a (Loov;)Loov;
      // 54: athrow
      // 55: aload 0
      // 56: getfield lib.dnz B
      // 59: aload 3
      // 5a: getfield lib.dnz B
      // 5d: iload 2
      // 5e: ifne 7b
      // 61: if_icmpeq 73
      // 64: goto 6b
      // 67: invokestatic lib.a (Loov;)Loov;
      // 6a: athrow
      // 6b: bipush 0
      // 6c: goto ac
      // 6f: invokestatic lib.a (Loov;)Loov;
      // 72: athrow
      // 73: aload 0
      // 74: getfield lib.z4b B
      // 77: aload 3
      // 78: getfield lib.z4b B
      // 7b: iload 2
      // 7c: ifne a4
      // 7f: if_icmpeq 91
      // 82: goto 89
      // 85: invokestatic lib.a (Loov;)Loov;
      // 88: athrow
      // 89: bipush 0
      // 8a: goto ac
      // 8d: invokestatic lib.a (Loov;)Loov;
      // 90: athrow
      // 91: aload 0
      // 92: getfield lib.c_c B
      // 95: iload 2
      // 96: ifne a8
      // 99: aload 3
      // 9a: getfield lib.c_c B
      // 9d: goto a4
      // a0: invokestatic lib.a (Loov;)Loov;
      // a3: athrow
      // a4: if_icmpne ab
      // a7: bipush 1
      // a8: goto ac
      // ab: bipush 0
      // ac: ireturn
   }

   @Override
   public int hashCode() {
      int var1 = this.lwz;
      var1 = 31 * var1 + this.z4b;
      var1 = 31 * var1 + this.c_c;
      return 31 * var1 + this.dnz;
   }

   private static oov a(oov var0) {
      return var0;
   }
}
