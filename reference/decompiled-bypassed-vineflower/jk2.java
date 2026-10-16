public class jk2 extends ttt {
   public jk2(long var1, ttt var3) {
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
      // 005: invokestatic t9d.c ()I
      // 008: iload 2
      // 009: bipush 1
      // 00a: isub
      // 00b: istore 7
      // 00d: iload 3
      // 00e: bipush 2
      // 00f: iadd
      // 010: istore 8
      // 012: iload 4
      // 014: bipush 2
      // 015: iadd
      // 016: istore 9
      // 018: aload 0
      // 019: getfield jk2.ty5 Lttt;
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
      // 032: istore 5
      // 034: bipush 0
      // 035: istore 12
      // 037: iload 12
      // 039: iload 4
      // 03b: if_icmpge 156
      // 03e: bipush 0
      // 03f: istore 13
      // 041: iload 13
      // 043: iload 3
      // 044: if_icmpge 14e
      // 047: aload 10
      // 049: iload 13
      // 04b: bipush 1
      // 04c: iadd
      // 04d: iload 12
      // 04f: bipush 1
      // 050: iadd
      // 051: bipush 1
      // 052: isub
      // 053: iload 3
      // 054: bipush 2
      // 055: iadd
      // 056: imul
      // 057: iadd
      // 058: iaload
      // 059: istore 14
      // 05b: aload 10
      // 05d: iload 13
      // 05f: bipush 1
      // 060: iadd
      // 061: bipush 1
      // 062: iadd
      // 063: iload 12
      // 065: bipush 1
      // 066: iadd
      // 067: iload 3
      // 068: bipush 2
      // 069: iadd
      // 06a: imul
      // 06b: iadd
      // 06c: iaload
      // 06d: istore 15
      // 06f: aload 10
      // 071: iload 13
      // 073: bipush 1
      // 074: iadd
      // 075: bipush 1
      // 076: isub
      // 077: iload 12
      // 079: bipush 1
      // 07a: iadd
      // 07b: iload 3
      // 07c: bipush 2
      // 07d: iadd
      // 07e: imul
      // 07f: iadd
      // 080: iaload
      // 081: istore 16
      // 083: aload 10
      // 085: iload 13
      // 087: bipush 1
      // 088: iadd
      // 089: iload 12
      // 08b: bipush 1
      // 08c: iadd
      // 08d: bipush 1
      // 08e: iadd
      // 08f: iload 3
      // 090: bipush 2
      // 091: iadd
      // 092: imul
      // 093: iadd
      // 094: iaload
      // 095: istore 17
      // 097: aload 10
      // 099: iload 13
      // 09b: bipush 1
      // 09c: iadd
      // 09d: iload 12
      // 09f: bipush 1
      // 0a0: iadd
      // 0a1: iload 8
      // 0a3: imul
      // 0a4: iadd
      // 0a5: iaload
      // 0a6: istore 18
      // 0a8: bipush 0
      // 0a9: istore 19
      // 0ab: iload 14
      // 0ad: iload 5
      // 0af: ifne 039
      // 0b2: iload 5
      // 0b4: ifne 0c6
      // 0b7: ifne 0c4
      // 0ba: goto 0c1
      // 0bd: invokestatic jk2.a (Loov;)Loov;
      // 0c0: athrow
      // 0c1: iinc 19 1
      // 0c4: iload 15
      // 0c6: iload 5
      // 0c8: ifne 0da
      // 0cb: ifne 0d8
      // 0ce: goto 0d5
      // 0d1: invokestatic jk2.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: iinc 19 1
      // 0d8: iload 16
      // 0da: iload 5
      // 0dc: ifne 0ee
      // 0df: ifne 0ec
      // 0e2: goto 0e9
      // 0e5: invokestatic jk2.a (Loov;)Loov;
      // 0e8: athrow
      // 0e9: iinc 19 1
      // 0ec: iload 17
      // 0ee: iload 5
      // 0f0: ifne 102
      // 0f3: ifne 100
      // 0f6: goto 0fd
      // 0f9: invokestatic jk2.a (Loov;)Loov;
      // 0fc: athrow
      // 0fd: iinc 19 1
      // 100: iload 18
      // 102: iload 5
      // 104: ifne 113
      // 107: ifne 133
      // 10a: goto 111
      // 10d: invokestatic jk2.a (Loov;)Loov;
      // 110: athrow
      // 111: iload 19
      // 113: bipush 3
      // 114: if_icmple 133
      // 117: aload 11
      // 119: iload 13
      // 11b: iload 12
      // 11d: iload 3
      // 11e: imul
      // 11f: iadd
      // 120: getstatic gyu.knf Lgyu;
      // 123: getfield gyu.mu9 I
      // 126: iastore
      // 127: iload 5
      // 129: ifeq 146
      // 12c: goto 133
      // 12f: invokestatic jk2.a (Loov;)Loov;
      // 132: athrow
      // 133: aload 11
      // 135: iload 13
      // 137: iload 12
      // 139: iload 3
      // 13a: imul
      // 13b: iadd
      // 13c: iload 18
      // 13e: iastore
      // 13f: goto 146
      // 142: invokestatic jk2.a (Loov;)Loov;
      // 145: athrow
      // 146: iinc 13 1
      // 149: iload 5
      // 14b: ifeq 041
      // 14e: iinc 12 1
      // 151: iload 5
      // 153: ifeq 037
      // 156: aload 11
      // 158: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
