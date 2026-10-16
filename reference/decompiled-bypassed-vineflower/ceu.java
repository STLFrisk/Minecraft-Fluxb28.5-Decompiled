public class ceu extends ttt {
   public ceu(long var1, ttt var3) {
      super(var1);
      super.ty5 = var3;
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
      // 000: iload 1
      // 001: bipush 1
      // 002: isub
      // 003: istore 6
      // 005: iload 2
      // 006: bipush 1
      // 007: isub
      // 008: istore 7
      // 00a: invokestatic t9d.b ()I
      // 00d: iload 3
      // 00e: bipush 2
      // 00f: iadd
      // 010: istore 8
      // 012: iload 4
      // 014: bipush 2
      // 015: iadd
      // 016: istore 9
      // 018: istore 5
      // 01a: aload 0
      // 01b: getfield ceu.ty5 Lttt;
      // 01e: iload 6
      // 020: iload 7
      // 022: iload 8
      // 024: iload 9
      // 026: invokevirtual ttt.ub9 (IIII)[I
      // 029: astore 10
      // 02b: iload 3
      // 02c: iload 4
      // 02e: imul
      // 02f: invokestatic z97.web (I)[I
      // 032: astore 11
      // 034: bipush 0
      // 035: istore 12
      // 037: iload 12
      // 039: iload 4
      // 03b: if_icmpge 148
      // 03e: bipush 0
      // 03f: istore 13
      // 041: iload 13
      // 043: iload 3
      // 044: if_icmpge 140
      // 047: aload 0
      // 048: aload 10
      // 04a: iload 13
      // 04c: bipush 0
      // 04d: iadd
      // 04e: iload 12
      // 050: bipush 1
      // 051: iadd
      // 052: iload 8
      // 054: imul
      // 055: iadd
      // 056: iaload
      // 057: invokespecial ceu.j20 (I)I
      // 05a: istore 14
      // 05c: aload 0
      // 05d: aload 10
      // 05f: iload 13
      // 061: bipush 2
      // 062: iadd
      // 063: iload 12
      // 065: bipush 1
      // 066: iadd
      // 067: iload 8
      // 069: imul
      // 06a: iadd
      // 06b: iaload
      // 06c: invokespecial ceu.j20 (I)I
      // 06f: istore 15
      // 071: aload 0
      // 072: aload 10
      // 074: iload 13
      // 076: bipush 1
      // 077: iadd
      // 078: iload 12
      // 07a: bipush 0
      // 07b: iadd
      // 07c: iload 8
      // 07e: imul
      // 07f: iadd
      // 080: iaload
      // 081: invokespecial ceu.j20 (I)I
      // 084: istore 16
      // 086: aload 0
      // 087: aload 10
      // 089: iload 13
      // 08b: bipush 1
      // 08c: iadd
      // 08d: iload 12
      // 08f: bipush 2
      // 090: iadd
      // 091: iload 8
      // 093: imul
      // 094: iadd
      // 095: iaload
      // 096: invokespecial ceu.j20 (I)I
      // 099: istore 17
      // 09b: aload 0
      // 09c: aload 10
      // 09e: iload 13
      // 0a0: bipush 1
      // 0a1: iadd
      // 0a2: iload 12
      // 0a4: bipush 1
      // 0a5: iadd
      // 0a6: iload 8
      // 0a8: imul
      // 0a9: iadd
      // 0aa: iaload
      // 0ab: invokespecial ceu.j20 (I)I
      // 0ae: istore 18
      // 0b0: iload 18
      // 0b2: iload 14
      // 0b4: iload 5
      // 0b6: ifeq 03b
      // 0b9: iload 5
      // 0bb: ifeq 0d3
      // 0be: if_icmpne 121
      // 0c1: goto 0c8
      // 0c4: invokestatic ceu.a (Loov;)Loov;
      // 0c7: athrow
      // 0c8: iload 18
      // 0ca: iload 16
      // 0cc: goto 0d3
      // 0cf: invokestatic ceu.a (Loov;)Loov;
      // 0d2: athrow
      // 0d3: iload 5
      // 0d5: ifeq 0ed
      // 0d8: if_icmpne 121
      // 0db: goto 0e2
      // 0de: invokestatic ceu.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: iload 18
      // 0e4: iload 15
      // 0e6: goto 0ed
      // 0e9: invokestatic ceu.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: iload 5
      // 0ef: ifeq 107
      // 0f2: if_icmpne 121
      // 0f5: goto 0fc
      // 0f8: invokestatic ceu.a (Loov;)Loov;
      // 0fb: athrow
      // 0fc: iload 18
      // 0fe: iload 17
      // 100: goto 107
      // 103: invokestatic ceu.a (Loov;)Loov;
      // 106: athrow
      // 107: if_icmpne 121
      // 10a: aload 11
      // 10c: iload 13
      // 10e: iload 12
      // 110: iload 3
      // 111: imul
      // 112: iadd
      // 113: bipush -1
      // 114: iastore
      // 115: iload 5
      // 117: ifne 138
      // 11a: goto 121
      // 11d: invokestatic ceu.a (Loov;)Loov;
      // 120: athrow
      // 121: aload 11
      // 123: iload 13
      // 125: iload 12
      // 127: iload 3
      // 128: imul
      // 129: iadd
      // 12a: getstatic gyu.sgl Lgyu;
      // 12d: getfield gyu.mu9 I
      // 130: iastore
      // 131: goto 138
      // 134: invokestatic ceu.a (Loov;)Loov;
      // 137: athrow
      // 138: iinc 13 1
      // 13b: iload 5
      // 13d: ifne 041
      // 140: iinc 12 1
      // 143: iload 5
      // 145: ifne 037
      // 148: aload 11
      // 14a: areturn
   }

   private int j20(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic t9d.c ()I
      // 03: istore 2
      // 04: iload 1
      // 05: bipush 2
      // 06: iload 2
      // 07: ifne 1f
      // 0a: if_icmplt 23
      // 0d: goto 14
      // 10: invokestatic ceu.a (Loov;)Loov;
      // 13: athrow
      // 14: bipush 2
      // 15: iload 1
      // 16: bipush 1
      // 17: iand
      // 18: goto 1f
      // 1b: invokestatic ceu.a (Loov;)Loov;
      // 1e: athrow
      // 1f: iadd
      // 20: goto 24
      // 23: iload 1
      // 24: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
