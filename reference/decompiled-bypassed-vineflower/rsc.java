public class rsc extends ttt {
   public rsc(long var1) {
      super(var1);
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
      // 00: iload 3
      // 01: iload 4
      // 03: imul
      // 04: invokestatic z97.web (I)[I
      // 07: astore 6
      // 09: invokestatic t9d.b ()I
      // 0c: bipush 0
      // 0d: istore 7
      // 0f: istore 5
      // 11: iload 7
      // 13: iload 4
      // 15: if_icmpge 74
      // 18: bipush 0
      // 19: iload 5
      // 1b: ifeq 75
      // 1e: istore 8
      // 20: iload 8
      // 22: iload 3
      // 23: if_icmpge 6c
      // 26: aload 0
      // 27: iload 1
      // 28: iload 8
      // 2a: iadd
      // 2b: i2l
      // 2c: iload 2
      // 2d: iload 7
      // 2f: iadd
      // 30: i2l
      // 31: invokevirtual rsc.drx (JJ)V
      // 34: aload 6
      // 36: iload 8
      // 38: iload 7
      // 3a: iload 3
      // 3b: imul
      // 3c: iadd
      // 3d: aload 0
      // 3e: bipush 10
      // 40: invokevirtual rsc.nbt (I)I
      // 43: iload 5
      // 45: ifeq cc
      // 48: iload 5
      // 4a: ifeq 5f
      // 4d: goto 54
      // 50: invokestatic rsc.a (Loov;)Loov;
      // 53: athrow
      // 54: ifne 62
      // 57: goto 5e
      // 5a: invokestatic rsc.a (Loov;)Loov;
      // 5d: athrow
      // 5e: bipush 1
      // 5f: goto 63
      // 62: bipush 0
      // 63: iastore
      // 64: iinc 8 1
      // 67: iload 5
      // 69: ifne 20
      // 6c: iinc 7 1
      // 6f: iload 5
      // 71: ifne 11
      // 74: iload 1
      // 75: iload 5
      // 77: ifeq 8e
      // 7a: iload 3
      // 7b: ineg
      // 7c: if_icmple cd
      // 7f: goto 86
      // 82: invokestatic rsc.a (Loov;)Loov;
      // 85: athrow
      // 86: iload 1
      // 87: goto 8e
      // 8a: invokestatic rsc.a (Loov;)Loov;
      // 8d: athrow
      // 8e: iload 5
      // 90: ifeq 9e
      // 93: ifgt cd
      // 96: goto 9d
      // 99: invokestatic rsc.a (Loov;)Loov;
      // 9c: athrow
      // 9d: iload 2
      // 9e: iload 5
      // a0: ifeq b8
      // a3: iload 4
      // a5: ineg
      // a6: if_icmple cd
      // a9: goto b0
      // ac: invokestatic rsc.a (Loov;)Loov;
      // af: athrow
      // b0: iload 2
      // b1: goto b8
      // b4: invokestatic rsc.a (Loov;)Loov;
      // b7: athrow
      // b8: ifgt cd
      // bb: aload 6
      // bd: iload 1
      // be: ineg
      // bf: iload 2
      // c0: ineg
      // c1: iload 3
      // c2: imul
      // c3: iadd
      // c4: bipush 1
      // c5: goto cc
      // c8: invokestatic rsc.a (Loov;)Loov;
      // cb: athrow
      // cc: iastore
      // cd: aload 6
      // cf: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
