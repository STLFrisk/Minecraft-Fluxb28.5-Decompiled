public class rww extends ttt {
   public rww(long var1, ttt var3) {
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
      // 005: invokestatic t9d.b ()I
      // 008: iload 2
      // 009: bipush 1
      // 00a: isub
      // 00b: istore 7
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
      // 01b: getfield rww.ty5 Lttt;
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
      // 03b: if_icmpge 102
      // 03e: bipush 0
      // 03f: istore 13
      // 041: iload 13
      // 043: iload 3
      // 044: if_icmpge 0fa
      // 047: aload 10
      // 049: iload 13
      // 04b: bipush 1
      // 04c: iadd
      // 04d: iload 12
      // 04f: bipush 1
      // 050: iadd
      // 051: iload 8
      // 053: imul
      // 054: iadd
      // 055: iaload
      // 056: istore 14
      // 058: aload 0
      // 059: iload 13
      // 05b: iload 1
      // 05c: iadd
      // 05d: i2l
      // 05e: iload 12
      // 060: iload 2
      // 061: iadd
      // 062: i2l
      // 063: invokevirtual rww.drx (JJ)V
      // 066: iload 14
      // 068: iload 5
      // 06a: ifeq 039
      // 06d: iload 5
      // 06f: ifeq 0a0
      // 072: ifne 093
      // 075: goto 07c
      // 078: invokestatic rww.a (Loov;)Loov;
      // 07b: athrow
      // 07c: aload 11
      // 07e: iload 13
      // 080: iload 12
      // 082: iload 3
      // 083: imul
      // 084: iadd
      // 085: bipush 0
      // 086: iastore
      // 087: iload 5
      // 089: ifne 0f2
      // 08c: goto 093
      // 08f: invokestatic rww.a (Loov;)Loov;
      // 092: athrow
      // 093: aload 0
      // 094: bipush 6
      // 096: invokevirtual rww.nbt (I)I
      // 099: goto 0a0
      // 09c: invokestatic rww.a (Loov;)Loov;
      // 09f: athrow
      // 0a0: istore 15
      // 0a2: iload 15
      // 0a4: iload 5
      // 0a6: ifeq 0c4
      // 0a9: ifne 0bb
      // 0ac: goto 0b3
      // 0af: invokestatic rww.a (Loov;)Loov;
      // 0b2: athrow
      // 0b3: bipush 4
      // 0b4: istore 15
      // 0b6: iload 5
      // 0b8: ifne 0e6
      // 0bb: iload 15
      // 0bd: goto 0c4
      // 0c0: invokestatic rww.a (Loov;)Loov;
      // 0c3: athrow
      // 0c4: iload 5
      // 0c6: ifeq 0e4
      // 0c9: bipush 1
      // 0ca: if_icmpgt 0dc
      // 0cd: goto 0d4
      // 0d0: invokestatic rww.a (Loov;)Loov;
      // 0d3: athrow
      // 0d4: bipush 3
      // 0d5: istore 15
      // 0d7: iload 5
      // 0d9: ifne 0e6
      // 0dc: bipush 1
      // 0dd: goto 0e4
      // 0e0: invokestatic rww.a (Loov;)Loov;
      // 0e3: athrow
      // 0e4: istore 15
      // 0e6: aload 11
      // 0e8: iload 13
      // 0ea: iload 12
      // 0ec: iload 3
      // 0ed: imul
      // 0ee: iadd
      // 0ef: iload 15
      // 0f1: iastore
      // 0f2: iinc 13 1
      // 0f5: iload 5
      // 0f7: ifne 041
      // 0fa: iinc 12 1
      // 0fd: iload 5
      // 0ff: ifne 037
      // 102: aload 11
      // 104: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
