public class olc extends ttt {
   public olc(long var1, ttt var3) {
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
      // 019: getfield olc.ty5 Lttt;
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
      // 03b: if_icmpge 358
      // 03e: bipush 0
      // 03f: istore 13
      // 041: iload 13
      // 043: iload 3
      // 044: if_icmpge 350
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
      // 0a7: invokevirtual olc.drx (JJ)V
      // 0aa: iload 18
      // 0ac: iload 5
      // 0ae: ifeq 039
      // 0b1: iload 5
      // 0b3: ifeq 122
      // 0b6: ifne 120
      // 0b9: goto 0c0
      // 0bc: invokestatic olc.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: iload 14
      // 0c2: iload 5
      // 0c4: ifeq 211
      // 0c7: goto 0ce
      // 0ca: invokestatic olc.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: ifne 209
      // 0d1: goto 0d8
      // 0d4: invokestatic olc.a (Loov;)Loov;
      // 0d7: athrow
      // 0d8: iload 15
      // 0da: iload 5
      // 0dc: ifeq 211
      // 0df: goto 0e6
      // 0e2: invokestatic olc.a (Loov;)Loov;
      // 0e5: athrow
      // 0e6: ifne 209
      // 0e9: goto 0f0
      // 0ec: invokestatic olc.a (Loov;)Loov;
      // 0ef: athrow
      // 0f0: iload 16
      // 0f2: iload 5
      // 0f4: ifeq 211
      // 0f7: goto 0fe
      // 0fa: invokestatic olc.a (Loov;)Loov;
      // 0fd: athrow
      // 0fe: ifne 209
      // 101: goto 108
      // 104: invokestatic olc.a (Loov;)Loov;
      // 107: athrow
      // 108: iload 17
      // 10a: iload 5
      // 10c: ifeq 211
      // 10f: goto 116
      // 112: invokestatic olc.a (Loov;)Loov;
      // 115: athrow
      // 116: ifne 209
      // 119: goto 120
      // 11c: invokestatic olc.a (Loov;)Loov;
      // 11f: athrow
      // 120: iload 18
      // 122: iload 5
      // 124: ifeq 133
      // 127: ifle 1f1
      // 12a: goto 131
      // 12d: invokestatic olc.a (Loov;)Loov;
      // 130: athrow
      // 131: iload 14
      // 133: iload 5
      // 135: ifeq 196
      // 138: ifeq 18a
      // 13b: goto 142
      // 13e: invokestatic olc.a (Loov;)Loov;
      // 141: athrow
      // 142: iload 15
      // 144: iload 5
      // 146: ifeq 196
      // 149: goto 150
      // 14c: invokestatic olc.a (Loov;)Loov;
      // 14f: athrow
      // 150: ifeq 18a
      // 153: goto 15a
      // 156: invokestatic olc.a (Loov;)Loov;
      // 159: athrow
      // 15a: iload 16
      // 15c: iload 5
      // 15e: ifeq 196
      // 161: goto 168
      // 164: invokestatic olc.a (Loov;)Loov;
      // 167: athrow
      // 168: ifeq 18a
      // 16b: goto 172
      // 16e: invokestatic olc.a (Loov;)Loov;
      // 171: athrow
      // 172: iload 17
      // 174: iload 5
      // 176: ifeq 196
      // 179: goto 180
      // 17c: invokestatic olc.a (Loov;)Loov;
      // 17f: athrow
      // 180: ifne 1f1
      // 183: goto 18a
      // 186: invokestatic olc.a (Loov;)Loov;
      // 189: athrow
      // 18a: aload 0
      // 18b: bipush 5
      // 18c: invokevirtual olc.nbt (I)I
      // 18f: goto 196
      // 192: invokestatic olc.a (Loov;)Loov;
      // 195: athrow
      // 196: iload 5
      // 198: ifeq 1a7
      // 19b: ifne 1d9
      // 19e: goto 1a5
      // 1a1: invokestatic olc.a (Loov;)Loov;
      // 1a4: athrow
      // 1a5: iload 18
      // 1a7: bipush 4
      // 1a8: if_icmpne 1c2
      // 1ab: aload 11
      // 1ad: iload 13
      // 1af: iload 12
      // 1b1: iload 3
      // 1b2: imul
      // 1b3: iadd
      // 1b4: bipush 4
      // 1b5: iastore
      // 1b6: iload 5
      // 1b8: ifne 348
      // 1bb: goto 1c2
      // 1be: invokestatic olc.a (Loov;)Loov;
      // 1c1: athrow
      // 1c2: aload 11
      // 1c4: iload 13
      // 1c6: iload 12
      // 1c8: iload 3
      // 1c9: imul
      // 1ca: iadd
      // 1cb: bipush 0
      // 1cc: iastore
      // 1cd: iload 5
      // 1cf: ifne 348
      // 1d2: goto 1d9
      // 1d5: invokestatic olc.a (Loov;)Loov;
      // 1d8: athrow
      // 1d9: aload 11
      // 1db: iload 13
      // 1dd: iload 12
      // 1df: iload 3
      // 1e0: imul
      // 1e1: iadd
      // 1e2: iload 18
      // 1e4: iastore
      // 1e5: iload 5
      // 1e7: ifne 348
      // 1ea: goto 1f1
      // 1ed: invokestatic olc.a (Loov;)Loov;
      // 1f0: athrow
      // 1f1: aload 11
      // 1f3: iload 13
      // 1f5: iload 12
      // 1f7: iload 3
      // 1f8: imul
      // 1f9: iadd
      // 1fa: iload 18
      // 1fc: iastore
      // 1fd: iload 5
      // 1ff: ifne 348
      // 202: goto 209
      // 205: invokestatic olc.a (Loov;)Loov;
      // 208: athrow
      // 209: bipush 1
      // 20a: goto 211
      // 20d: invokestatic olc.a (Loov;)Loov;
      // 210: athrow
      // 211: istore 19
      // 213: bipush 1
      // 214: istore 20
      // 216: iload 14
      // 218: iload 5
      // 21a: ifeq 24c
      // 21d: ifeq 24a
      // 220: goto 227
      // 223: invokestatic olc.a (Loov;)Loov;
      // 226: athrow
      // 227: aload 0
      // 228: iload 19
      // 22a: iinc 19 1
      // 22d: invokevirtual olc.nbt (I)I
      // 230: iload 5
      // 232: ifeq 24c
      // 235: goto 23c
      // 238: invokestatic olc.a (Loov;)Loov;
      // 23b: athrow
      // 23c: ifne 24a
      // 23f: goto 246
      // 242: invokestatic olc.a (Loov;)Loov;
      // 245: athrow
      // 246: iload 14
      // 248: istore 20
      // 24a: iload 15
      // 24c: iload 5
      // 24e: ifeq 280
      // 251: ifeq 27e
      // 254: goto 25b
      // 257: invokestatic olc.a (Loov;)Loov;
      // 25a: athrow
      // 25b: aload 0
      // 25c: iload 19
      // 25e: iinc 19 1
      // 261: invokevirtual olc.nbt (I)I
      // 264: iload 5
      // 266: ifeq 280
      // 269: goto 270
      // 26c: invokestatic olc.a (Loov;)Loov;
      // 26f: athrow
      // 270: ifne 27e
      // 273: goto 27a
      // 276: invokestatic olc.a (Loov;)Loov;
      // 279: athrow
      // 27a: iload 15
      // 27c: istore 20
      // 27e: iload 16
      // 280: iload 5
      // 282: ifeq 2b4
      // 285: ifeq 2b2
      // 288: goto 28f
      // 28b: invokestatic olc.a (Loov;)Loov;
      // 28e: athrow
      // 28f: aload 0
      // 290: iload 19
      // 292: iinc 19 1
      // 295: invokevirtual olc.nbt (I)I
      // 298: iload 5
      // 29a: ifeq 2b4
      // 29d: goto 2a4
      // 2a0: invokestatic olc.a (Loov;)Loov;
      // 2a3: athrow
      // 2a4: ifne 2b2
      // 2a7: goto 2ae
      // 2aa: invokestatic olc.a (Loov;)Loov;
      // 2ad: athrow
      // 2ae: iload 16
      // 2b0: istore 20
      // 2b2: iload 17
      // 2b4: iload 5
      // 2b6: ifeq 2eb
      // 2b9: ifeq 2e6
      // 2bc: goto 2c3
      // 2bf: invokestatic olc.a (Loov;)Loov;
      // 2c2: athrow
      // 2c3: aload 0
      // 2c4: iload 19
      // 2c6: iinc 19 1
      // 2c9: invokevirtual olc.nbt (I)I
      // 2cc: iload 5
      // 2ce: ifeq 2eb
      // 2d1: goto 2d8
      // 2d4: invokestatic olc.a (Loov;)Loov;
      // 2d7: athrow
      // 2d8: ifne 2e6
      // 2db: goto 2e2
      // 2de: invokestatic olc.a (Loov;)Loov;
      // 2e1: athrow
      // 2e2: iload 17
      // 2e4: istore 20
      // 2e6: aload 0
      // 2e7: bipush 3
      // 2e8: invokevirtual olc.nbt (I)I
      // 2eb: iload 5
      // 2ed: ifeq 31b
      // 2f0: ifne 312
      // 2f3: goto 2fa
      // 2f6: invokestatic olc.a (Loov;)Loov;
      // 2f9: athrow
      // 2fa: aload 11
      // 2fc: iload 13
      // 2fe: iload 12
      // 300: iload 3
      // 301: imul
      // 302: iadd
      // 303: iload 20
      // 305: iastore
      // 306: iload 5
      // 308: ifne 348
      // 30b: goto 312
      // 30e: invokestatic olc.a (Loov;)Loov;
      // 311: athrow
      // 312: iload 20
      // 314: goto 31b
      // 317: invokestatic olc.a (Loov;)Loov;
      // 31a: athrow
      // 31b: bipush 4
      // 31c: if_icmpne 336
      // 31f: aload 11
      // 321: iload 13
      // 323: iload 12
      // 325: iload 3
      // 326: imul
      // 327: iadd
      // 328: bipush 4
      // 329: iastore
      // 32a: iload 5
      // 32c: ifne 348
      // 32f: goto 336
      // 332: invokestatic olc.a (Loov;)Loov;
      // 335: athrow
      // 336: aload 11
      // 338: iload 13
      // 33a: iload 12
      // 33c: iload 3
      // 33d: imul
      // 33e: iadd
      // 33f: bipush 0
      // 340: iastore
      // 341: goto 348
      // 344: invokestatic olc.a (Loov;)Loov;
      // 347: athrow
      // 348: iinc 13 1
      // 34b: iload 5
      // 34d: ifne 041
      // 350: iinc 12 1
      // 353: iload 5
      // 355: ifne 037
      // 358: aload 11
      // 35a: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
