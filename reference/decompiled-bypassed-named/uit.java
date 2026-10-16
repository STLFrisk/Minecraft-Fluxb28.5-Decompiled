public class uit extends ttt {
   public uit(long var1, ttt var3) {
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
      // 00a: iload 3
      // 00b: bipush 2
      // 00c: iadd
      // 00d: istore 8
      // 00f: invokestatic OpaquePredicate.b ()I
      // 012: iload 4
      // 014: bipush 2
      // 015: iadd
      // 016: istore 9
      // 018: aload 0
      // 019: getfield uit.ty5 Lttt;
      // 01c: iload 6
      // 01e: iload 7
      // 020: iload 8
      // 022: iload 9
      // 024: invokevirtual ttt.ub9 (IIII)[I
      // 027: astore 10
      // 029: iload 3
      // 02a: iload 4
      // 02c: imul
      // 02d: invokestatic z97.web (I)[I
      // 030: astore 11
      // 032: bipush 0
      // 033: istore 12
      // 035: istore 5
      // 037: iload 12
      // 039: iload 4
      // 03b: if_icmpge 161
      // 03e: bipush 0
      // 03f: istore 13
      // 041: iload 13
      // 043: iload 3
      // 044: if_icmpge 159
      // 047: aload 10
      // 049: iload 13
      // 04b: bipush 0
      // 04c: iadd
      // 04d: iload 12
      // 04f: bipush 1
      // 050: iadd
      // 051: iload 8
      // 053: imul
      // 054: iadd
      // 055: iaload
      // 056: istore 14
      // 058: aload 10
      // 05a: iload 13
      // 05c: bipush 2
      // 05d: iadd
      // 05e: iload 12
      // 060: bipush 1
      // 061: iadd
      // 062: iload 8
      // 064: imul
      // 065: iadd
      // 066: iaload
      // 067: istore 15
      // 069: aload 10
      // 06b: iload 13
      // 06d: bipush 1
      // 06e: iadd
      // 06f: iload 12
      // 071: bipush 0
      // 072: iadd
      // 073: iload 8
      // 075: imul
      // 076: iadd
      // 077: iaload
      // 078: istore 16
      // 07a: aload 10
      // 07c: iload 13
      // 07e: bipush 1
      // 07f: iadd
      // 080: iload 12
      // 082: bipush 2
      // 083: iadd
      // 084: iload 8
      // 086: imul
      // 087: iadd
      // 088: iaload
      // 089: istore 17
      // 08b: aload 10
      // 08d: iload 13
      // 08f: bipush 1
      // 090: iadd
      // 091: iload 12
      // 093: bipush 1
      // 094: iadd
      // 095: iload 8
      // 097: imul
      // 098: iadd
      // 099: iaload
      // 09a: istore 18
      // 09c: iload 14
      // 09e: iload 15
      // 0a0: iload 5
      // 0a2: ifeq 03b
      // 0a5: iload 5
      // 0a7: ifeq 11b
      // 0aa: if_icmpne 110
      // 0ad: goto 0b4
      // 0b0: invokestatic uit.a (Loov;)Loov;
      // 0b3: athrow
      // 0b4: iload 16
      // 0b6: iload 17
      // 0b8: iload 5
      // 0ba: ifeq 11b
      // 0bd: goto 0c4
      // 0c0: invokestatic uit.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: if_icmpne 110
      // 0c7: goto 0ce
      // 0ca: invokestatic uit.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: aload 0
      // 0cf: iload 13
      // 0d1: iload 1
      // 0d2: iadd
      // 0d3: i2l
      // 0d4: iload 12
      // 0d6: iload 2
      // 0d7: iadd
      // 0d8: i2l
      // 0d9: invokevirtual uit.drx (JJ)V
      // 0dc: aload 0
      // 0dd: bipush 2
      // 0de: invokevirtual uit.nbt (I)I
      // 0e1: iload 5
      // 0e3: ifeq 109
      // 0e6: goto 0ed
      // 0e9: invokestatic uit.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: ifne 100
      // 0f0: goto 0f7
      // 0f3: invokestatic uit.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: iload 14
      // 0f9: istore 18
      // 0fb: iload 5
      // 0fd: ifne 145
      // 100: iload 16
      // 102: goto 109
      // 105: invokestatic uit.a (Loov;)Loov;
      // 108: athrow
      // 109: istore 18
      // 10b: iload 5
      // 10d: ifne 145
      // 110: iload 14
      // 112: iload 15
      // 114: goto 11b
      // 117: invokestatic uit.a (Loov;)Loov;
      // 11a: athrow
      // 11b: iload 5
      // 11d: ifeq 13e
      // 120: if_icmpne 12e
      // 123: goto 12a
      // 126: invokestatic uit.a (Loov;)Loov;
      // 129: athrow
      // 12a: iload 14
      // 12c: istore 18
      // 12e: iload 16
      // 130: iload 5
      // 132: ifeq 143
      // 135: iload 17
      // 137: goto 13e
      // 13a: invokestatic uit.a (Loov;)Loov;
      // 13d: athrow
      // 13e: if_icmpne 145
      // 141: iload 16
      // 143: istore 18
      // 145: aload 11
      // 147: iload 13
      // 149: iload 12
      // 14b: iload 3
      // 14c: imul
      // 14d: iadd
      // 14e: iload 18
      // 150: iastore
      // 151: iinc 13 1
      // 154: iload 5
      // 156: ifne 041
      // 159: iinc 12 1
      // 15c: iload 5
      // 15e: ifne 037
      // 161: aload 11
      // 163: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
