public class c0c extends ttt {
   public c0c(long var1, ttt var3) {
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
      // 005: invokestatic OpaquePredicate.b ()I
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
      // 018: istore 5
      // 01a: aload 0
      // 01b: getfield c0c.ty5 Lttt;
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
      // 03b: if_icmpge 154
      // 03e: bipush 0
      // 03f: istore 13
      // 041: iload 13
      // 043: iload 3
      // 044: if_icmpge 14c
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
      // 0a8: aload 11
      // 0aa: iload 13
      // 0ac: iload 12
      // 0ae: iload 3
      // 0af: imul
      // 0b0: iadd
      // 0b1: iload 18
      // 0b3: iastore
      // 0b4: aload 0
      // 0b5: iload 13
      // 0b7: iload 1
      // 0b8: iadd
      // 0b9: i2l
      // 0ba: iload 12
      // 0bc: iload 2
      // 0bd: iadd
      // 0be: i2l
      // 0bf: invokevirtual c0c.drx (JJ)V
      // 0c2: iload 5
      // 0c4: ifeq 147
      // 0c7: iload 18
      // 0c9: iload 5
      // 0cb: ifeq 039
      // 0ce: goto 0d5
      // 0d1: invokestatic c0c.a (Loov;)Loov;
      // 0d4: athrow
      // 0d5: ifne 144
      // 0d8: iload 14
      // 0da: iload 5
      // 0dc: ifeq 0f2
      // 0df: goto 0e6
      // 0e2: invokestatic c0c.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: ifne 144
      // 0e9: goto 0f0
      // 0ec: invokestatic c0c.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: iload 15
      // 0f2: iload 5
      // 0f4: ifeq 103
      // 0f7: ifne 144
      // 0fa: goto 101
      // 0fd: invokestatic c0c.a (Loov;)Loov;
      // 100: athrow
      // 101: iload 16
      // 103: iload 5
      // 105: ifeq 114
      // 108: ifne 144
      // 10b: goto 112
      // 10e: invokestatic c0c.a (Loov;)Loov;
      // 111: athrow
      // 112: iload 17
      // 114: iload 5
      // 116: ifeq 12f
      // 119: ifne 144
      // 11c: goto 123
      // 11f: invokestatic c0c.a (Loov;)Loov;
      // 122: athrow
      // 123: aload 0
      // 124: bipush 2
      // 125: invokevirtual c0c.nbt (I)I
      // 128: goto 12f
      // 12b: invokestatic c0c.a (Loov;)Loov;
      // 12e: athrow
      // 12f: ifne 144
      // 132: aload 11
      // 134: iload 13
      // 136: iload 12
      // 138: iload 3
      // 139: imul
      // 13a: iadd
      // 13b: bipush 1
      // 13c: iastore
      // 13d: goto 144
      // 140: invokestatic c0c.a (Loov;)Loov;
      // 143: athrow
      // 144: iinc 13 1
      // 147: iload 5
      // 149: ifne 041
      // 14c: iinc 12 1
      // 14f: iload 5
      // 151: ifne 037
      // 154: aload 11
      // 156: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
