public class pid extends ttt {
   public pid(long var1, ttt var3) {
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
      // 012: istore 5
      // 014: iload 4
      // 016: bipush 2
      // 017: iadd
      // 018: istore 9
      // 01a: aload 0
      // 01b: getfield pid.ty5 Lttt;
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
      // 03b: if_icmpge 153
      // 03e: bipush 0
      // 03f: istore 13
      // 041: iload 13
      // 043: iload 3
      // 044: if_icmpge 14b
      // 047: aload 10
      // 049: iload 13
      // 04b: bipush 0
      // 04c: iadd
      // 04d: iload 12
      // 04f: bipush 0
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
      // 060: bipush 0
      // 061: iadd
      // 062: iload 8
      // 064: imul
      // 065: iadd
      // 066: iaload
      // 067: istore 15
      // 069: aload 10
      // 06b: iload 13
      // 06d: bipush 0
      // 06e: iadd
      // 06f: iload 12
      // 071: bipush 2
      // 072: iadd
      // 073: iload 8
      // 075: imul
      // 076: iadd
      // 077: iaload
      // 078: istore 16
      // 07a: aload 10
      // 07c: iload 13
      // 07e: bipush 2
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
      // 09c: aload 0
      // 09d: iload 13
      // 09f: iload 1
      // 0a0: iadd
      // 0a1: i2l
      // 0a2: iload 12
      // 0a4: iload 2
      // 0a5: iadd
      // 0a6: i2l
      // 0a7: invokevirtual pid.drx (JJ)V
      // 0aa: iload 18
      // 0ac: iload 5
      // 0ae: ifeq 039
      // 0b1: iload 5
      // 0b3: ifeq 0c2
      // 0b6: ifne 130
      // 0b9: goto 0c0
      // 0bc: invokestatic pid.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: iload 14
      // 0c2: iload 5
      // 0c4: ifeq 0d3
      // 0c7: ifne 130
      // 0ca: goto 0d1
      // 0cd: invokestatic pid.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iload 15
      // 0d3: iload 5
      // 0d5: ifeq 0e4
      // 0d8: ifne 130
      // 0db: goto 0e2
      // 0de: invokestatic pid.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: iload 16
      // 0e4: iload 5
      // 0e6: ifeq 0f5
      // 0e9: ifne 130
      // 0ec: goto 0f3
      // 0ef: invokestatic pid.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: iload 17
      // 0f5: iload 5
      // 0f7: ifeq 111
      // 0fa: ifne 130
      // 0fd: goto 104
      // 100: invokestatic pid.a (Loov;)Loov;
      // 103: athrow
      // 104: aload 0
      // 105: bipush 100
      // 107: invokevirtual pid.nbt (I)I
      // 10a: goto 111
      // 10d: invokestatic pid.a (Loov;)Loov;
      // 110: athrow
      // 111: ifne 130
      // 114: aload 11
      // 116: iload 13
      // 118: iload 12
      // 11a: iload 3
      // 11b: imul
      // 11c: iadd
      // 11d: getstatic gyu._2p Lgyu;
      // 120: getfield gyu.mu9 I
      // 123: iastore
      // 124: iload 5
      // 126: ifne 143
      // 129: goto 130
      // 12c: invokestatic pid.a (Loov;)Loov;
      // 12f: athrow
      // 130: aload 11
      // 132: iload 13
      // 134: iload 12
      // 136: iload 3
      // 137: imul
      // 138: iadd
      // 139: iload 18
      // 13b: iastore
      // 13c: goto 143
      // 13f: invokestatic pid.a (Loov;)Loov;
      // 142: athrow
      // 143: iinc 13 1
      // 146: iload 5
      // 148: ifne 041
      // 14b: iinc 12 1
      // 14e: iload 5
      // 150: ifne 037
      // 153: aload 11
      // 155: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
