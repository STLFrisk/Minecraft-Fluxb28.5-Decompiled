public class qw9 extends ttt {
   public qw9(long var1, ttt var3) {
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
      // 01: getfield qw9.ty5 Lttt;
      // 04: iload 1
      // 05: bipush 1
      // 06: isub
      // 07: iload 2
      // 08: bipush 1
      // 09: isub
      // 0a: iload 3
      // 0b: bipush 2
      // 0c: iadd
      // 0d: iload 4
      // 0f: bipush 2
      // 10: iadd
      // 11: invokevirtual ttt.ub9 (IIII)[I
      // 14: astore 6
      // 16: invokestatic t9d.b ()I
      // 19: iload 3
      // 1a: iload 4
      // 1c: imul
      // 1d: invokestatic z97.web (I)[I
      // 20: astore 7
      // 22: istore 5
      // 24: bipush 0
      // 25: istore 8
      // 27: iload 8
      // 29: iload 4
      // 2b: if_icmpge d7
      // 2e: bipush 0
      // 2f: istore 9
      // 31: iload 9
      // 33: iload 3
      // 34: if_icmpge cf
      // 37: aload 0
      // 38: iload 9
      // 3a: iload 1
      // 3b: iadd
      // 3c: i2l
      // 3d: iload 8
      // 3f: iload 2
      // 40: iadd
      // 41: i2l
      // 42: invokevirtual qw9.drx (JJ)V
      // 45: aload 6
      // 47: iload 9
      // 49: bipush 1
      // 4a: iadd
      // 4b: iload 8
      // 4d: bipush 1
      // 4e: iadd
      // 4f: iload 3
      // 50: bipush 2
      // 51: iadd
      // 52: imul
      // 53: iadd
      // 54: iaload
      // 55: istore 10
      // 57: aload 0
      // 58: bipush 57
      // 5a: invokevirtual qw9.nbt (I)I
      // 5d: iload 5
      // 5f: ifeq 29
      // 62: iload 5
      // 64: ifeq 73
      // 67: ifne b4
      // 6a: goto 71
      // 6d: invokestatic qw9.a (Loov;)Loov;
      // 70: athrow
      // 71: iload 10
      // 73: getstatic gyu.wqh Lgyu;
      // 76: getfield gyu.mu9 I
      // 79: if_icmpne 9c
      // 7c: aload 7
      // 7e: iload 9
      // 80: iload 8
      // 82: iload 3
      // 83: imul
      // 84: iadd
      // 85: getstatic gyu.wqh Lgyu;
      // 88: getfield gyu.mu9 I
      // 8b: sipush 128
      // 8e: iadd
      // 8f: iastore
      // 90: iload 5
      // 92: ifne c7
      // 95: goto 9c
      // 98: invokestatic qw9.a (Loov;)Loov;
      // 9b: athrow
      // 9c: aload 7
      // 9e: iload 9
      // a0: iload 8
      // a2: iload 3
      // a3: imul
      // a4: iadd
      // a5: iload 10
      // a7: iastore
      // a8: iload 5
      // aa: ifne c7
      // ad: goto b4
      // b0: invokestatic qw9.a (Loov;)Loov;
      // b3: athrow
      // b4: aload 7
      // b6: iload 9
      // b8: iload 8
      // ba: iload 3
      // bb: imul
      // bc: iadd
      // bd: iload 10
      // bf: iastore
      // c0: goto c7
      // c3: invokestatic qw9.a (Loov;)Loov;
      // c6: athrow
      // c7: iinc 9 1
      // ca: iload 5
      // cc: ifne 31
      // cf: iinc 8 1
      // d2: iload 5
      // d4: ifne 27
      // d7: aload 7
      // d9: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
