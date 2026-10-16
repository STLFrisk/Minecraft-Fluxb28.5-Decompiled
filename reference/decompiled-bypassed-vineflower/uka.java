public class uka {
   public float[][] k60 = new float[6][4];
   public float[] e1v = new float[16];
   public float[] ovy = new float[16];
   public float[] mze = new float[16];
   public boolean zoh = false;

   private float hl_(float[] var1, float var2, float var3, float var4) {
      return var1[0] * var2 + var1[1] * var3 + var1[2] * var4 + var1[3];
   }

   public boolean isBoxInFrustum(double param1, double param3, double param5, double param7, double param9, double param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 13
      // 005: aload 0
      // 006: getfield uka.zoh Z
      // 009: iload 13
      // 00b: ifeq 019
      // 00e: ifeq 01a
      // 011: goto 018
      // 014: invokestatic uka.b (Loov;)Loov;
      // 017: athrow
      // 018: bipush 1
      // 019: ireturn
      // 01a: dload 1
      // 01b: d2f
      // 01c: fstore 14
      // 01e: dload 3
      // 01f: d2f
      // 020: fstore 15
      // 022: dload 5
      // 024: d2f
      // 025: fstore 16
      // 027: dload 7
      // 029: d2f
      // 02a: fstore 17
      // 02c: dload 9
      // 02e: d2f
      // 02f: fstore 18
      // 031: dload 11
      // 033: d2f
      // 034: fstore 19
      // 036: bipush 0
      // 037: istore 20
      // 039: iload 20
      // 03b: bipush 6
      // 03d: if_icmpge 1d0
      // 040: aload 0
      // 041: getfield uka.k60 [[F
      // 044: iload 20
      // 046: aaload
      // 047: astore 21
      // 049: aload 21
      // 04b: bipush 0
      // 04c: faload
      // 04d: fstore 22
      // 04f: aload 21
      // 051: bipush 1
      // 052: faload
      // 053: fstore 23
      // 055: aload 21
      // 057: bipush 2
      // 058: faload
      // 059: fstore 24
      // 05b: aload 21
      // 05d: bipush 3
      // 05e: faload
      // 05f: fstore 25
      // 061: iload 13
      // 063: ifeq 1cb
      // 066: fload 22
      // 068: fload 14
      // 06a: fmul
      // 06b: fload 23
      // 06d: fload 15
      // 06f: fmul
      // 070: fadd
      // 071: fload 24
      // 073: fload 16
      // 075: fmul
      // 076: fadd
      // 077: fload 25
      // 079: fadd
      // 07a: fconst_0
      // 07b: fcmpg
      // 07c: iload 13
      // 07e: ifeq 1d1
      // 081: goto 088
      // 084: invokestatic uka.b (Loov;)Loov;
      // 087: athrow
      // 088: ifgt 1c8
      // 08b: goto 092
      // 08e: invokestatic uka.b (Loov;)Loov;
      // 091: athrow
      // 092: fload 22
      // 094: fload 17
      // 096: fmul
      // 097: fload 23
      // 099: fload 15
      // 09b: fmul
      // 09c: fadd
      // 09d: fload 24
      // 09f: fload 16
      // 0a1: fmul
      // 0a2: fadd
      // 0a3: fload 25
      // 0a5: fadd
      // 0a6: fconst_0
      // 0a7: fcmpg
      // 0a8: iload 13
      // 0aa: ifeq 0db
      // 0ad: goto 0b4
      // 0b0: invokestatic uka.b (Loov;)Loov;
      // 0b3: athrow
      // 0b4: ifgt 1c8
      // 0b7: goto 0be
      // 0ba: invokestatic uka.b (Loov;)Loov;
      // 0bd: athrow
      // 0be: fload 22
      // 0c0: fload 14
      // 0c2: fmul
      // 0c3: fload 23
      // 0c5: fload 18
      // 0c7: fmul
      // 0c8: fadd
      // 0c9: fload 24
      // 0cb: fload 16
      // 0cd: fmul
      // 0ce: fadd
      // 0cf: fload 25
      // 0d1: fadd
      // 0d2: fconst_0
      // 0d3: fcmpg
      // 0d4: goto 0db
      // 0d7: invokestatic uka.b (Loov;)Loov;
      // 0da: athrow
      // 0db: iload 13
      // 0dd: ifeq 107
      // 0e0: ifgt 1c8
      // 0e3: goto 0ea
      // 0e6: invokestatic uka.b (Loov;)Loov;
      // 0e9: athrow
      // 0ea: fload 22
      // 0ec: fload 17
      // 0ee: fmul
      // 0ef: fload 23
      // 0f1: fload 18
      // 0f3: fmul
      // 0f4: fadd
      // 0f5: fload 24
      // 0f7: fload 16
      // 0f9: fmul
      // 0fa: fadd
      // 0fb: fload 25
      // 0fd: fadd
      // 0fe: fconst_0
      // 0ff: fcmpg
      // 100: goto 107
      // 103: invokestatic uka.b (Loov;)Loov;
      // 106: athrow
      // 107: iload 13
      // 109: ifeq 133
      // 10c: ifgt 1c8
      // 10f: goto 116
      // 112: invokestatic uka.b (Loov;)Loov;
      // 115: athrow
      // 116: fload 22
      // 118: fload 14
      // 11a: fmul
      // 11b: fload 23
      // 11d: fload 15
      // 11f: fmul
      // 120: fadd
      // 121: fload 24
      // 123: fload 19
      // 125: fmul
      // 126: fadd
      // 127: fload 25
      // 129: fadd
      // 12a: fconst_0
      // 12b: fcmpg
      // 12c: goto 133
      // 12f: invokestatic uka.b (Loov;)Loov;
      // 132: athrow
      // 133: iload 13
      // 135: ifeq 15f
      // 138: ifgt 1c8
      // 13b: goto 142
      // 13e: invokestatic uka.b (Loov;)Loov;
      // 141: athrow
      // 142: fload 22
      // 144: fload 17
      // 146: fmul
      // 147: fload 23
      // 149: fload 15
      // 14b: fmul
      // 14c: fadd
      // 14d: fload 24
      // 14f: fload 19
      // 151: fmul
      // 152: fadd
      // 153: fload 25
      // 155: fadd
      // 156: fconst_0
      // 157: fcmpg
      // 158: goto 15f
      // 15b: invokestatic uka.b (Loov;)Loov;
      // 15e: athrow
      // 15f: iload 13
      // 161: ifeq 18b
      // 164: ifgt 1c8
      // 167: goto 16e
      // 16a: invokestatic uka.b (Loov;)Loov;
      // 16d: athrow
      // 16e: fload 22
      // 170: fload 14
      // 172: fmul
      // 173: fload 23
      // 175: fload 18
      // 177: fmul
      // 178: fadd
      // 179: fload 24
      // 17b: fload 19
      // 17d: fmul
      // 17e: fadd
      // 17f: fload 25
      // 181: fadd
      // 182: fconst_0
      // 183: fcmpg
      // 184: goto 18b
      // 187: invokestatic uka.b (Loov;)Loov;
      // 18a: athrow
      // 18b: iload 13
      // 18d: ifeq 1b7
      // 190: ifgt 1c8
      // 193: goto 19a
      // 196: invokestatic uka.b (Loov;)Loov;
      // 199: athrow
      // 19a: fload 22
      // 19c: fload 17
      // 19e: fmul
      // 19f: fload 23
      // 1a1: fload 18
      // 1a3: fmul
      // 1a4: fadd
      // 1a5: fload 24
      // 1a7: fload 19
      // 1a9: fmul
      // 1aa: fadd
      // 1ab: fload 25
      // 1ad: fadd
      // 1ae: fconst_0
      // 1af: fcmpg
      // 1b0: goto 1b7
      // 1b3: invokestatic uka.b (Loov;)Loov;
      // 1b6: athrow
      // 1b7: iload 13
      // 1b9: ifeq 1c7
      // 1bc: ifgt 1c8
      // 1bf: goto 1c6
      // 1c2: invokestatic uka.b (Loov;)Loov;
      // 1c5: athrow
      // 1c6: bipush 0
      // 1c7: ireturn
      // 1c8: iinc 20 1
      // 1cb: iload 13
      // 1cd: ifne 039
      // 1d0: bipush 1
      // 1d1: ireturn
   }

   public boolean y4t(double param1, double param3, double param5, double param7, double param9, double param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 13
      // 005: aload 0
      // 006: getfield uka.zoh Z
      // 009: iload 13
      // 00b: ifeq 019
      // 00e: ifeq 01a
      // 011: goto 018
      // 014: invokestatic uka.b (Loov;)Loov;
      // 017: athrow
      // 018: bipush 1
      // 019: ireturn
      // 01a: dload 1
      // 01b: d2f
      // 01c: fstore 14
      // 01e: dload 3
      // 01f: d2f
      // 020: fstore 15
      // 022: dload 5
      // 024: d2f
      // 025: fstore 16
      // 027: dload 7
      // 029: d2f
      // 02a: fstore 17
      // 02c: dload 9
      // 02e: d2f
      // 02f: fstore 18
      // 031: dload 11
      // 033: d2f
      // 034: fstore 19
      // 036: bipush 0
      // 037: istore 20
      // 039: iload 20
      // 03b: bipush 6
      // 03d: if_icmpge 344
      // 040: aload 0
      // 041: getfield uka.k60 [[F
      // 044: iload 20
      // 046: aaload
      // 047: astore 21
      // 049: aload 21
      // 04b: bipush 0
      // 04c: faload
      // 04d: fstore 22
      // 04f: aload 21
      // 051: bipush 1
      // 052: faload
      // 053: fstore 23
      // 055: aload 21
      // 057: bipush 2
      // 058: faload
      // 059: fstore 24
      // 05b: aload 21
      // 05d: bipush 3
      // 05e: faload
      // 05f: fstore 25
      // 061: iload 20
      // 063: iload 13
      // 065: ifeq 345
      // 068: iload 13
      // 06a: ifeq 1f7
      // 06d: goto 074
      // 070: invokestatic uka.b (Loov;)Loov;
      // 073: athrow
      // 074: bipush 4
      // 075: if_icmpge 1e1
      // 078: goto 07f
      // 07b: invokestatic uka.b (Loov;)Loov;
      // 07e: athrow
      // 07f: fload 22
      // 081: fload 14
      // 083: fmul
      // 084: fload 23
      // 086: fload 15
      // 088: fmul
      // 089: fadd
      // 08a: fload 24
      // 08c: fload 16
      // 08e: fmul
      // 08f: fadd
      // 090: fload 25
      // 092: fadd
      // 093: fconst_0
      // 094: fcmpg
      // 095: iload 13
      // 097: ifeq 1e0
      // 09a: goto 0a1
      // 09d: invokestatic uka.b (Loov;)Loov;
      // 0a0: athrow
      // 0a1: ifle 1df
      // 0a4: goto 0ab
      // 0a7: invokestatic uka.b (Loov;)Loov;
      // 0aa: athrow
      // 0ab: fload 22
      // 0ad: fload 17
      // 0af: fmul
      // 0b0: fload 23
      // 0b2: fload 15
      // 0b4: fmul
      // 0b5: fadd
      // 0b6: fload 24
      // 0b8: fload 16
      // 0ba: fmul
      // 0bb: fadd
      // 0bc: fload 25
      // 0be: fadd
      // 0bf: fconst_0
      // 0c0: fcmpg
      // 0c1: iload 13
      // 0c3: ifeq 1e0
      // 0c6: goto 0cd
      // 0c9: invokestatic uka.b (Loov;)Loov;
      // 0cc: athrow
      // 0cd: ifle 1df
      // 0d0: goto 0d7
      // 0d3: invokestatic uka.b (Loov;)Loov;
      // 0d6: athrow
      // 0d7: fload 22
      // 0d9: fload 14
      // 0db: fmul
      // 0dc: fload 23
      // 0de: fload 18
      // 0e0: fmul
      // 0e1: fadd
      // 0e2: fload 24
      // 0e4: fload 16
      // 0e6: fmul
      // 0e7: fadd
      // 0e8: fload 25
      // 0ea: fadd
      // 0eb: fconst_0
      // 0ec: fcmpg
      // 0ed: iload 13
      // 0ef: ifeq 1e0
      // 0f2: goto 0f9
      // 0f5: invokestatic uka.b (Loov;)Loov;
      // 0f8: athrow
      // 0f9: ifle 1df
      // 0fc: goto 103
      // 0ff: invokestatic uka.b (Loov;)Loov;
      // 102: athrow
      // 103: fload 22
      // 105: fload 17
      // 107: fmul
      // 108: fload 23
      // 10a: fload 18
      // 10c: fmul
      // 10d: fadd
      // 10e: fload 24
      // 110: fload 16
      // 112: fmul
      // 113: fadd
      // 114: fload 25
      // 116: fadd
      // 117: fconst_0
      // 118: fcmpg
      // 119: iload 13
      // 11b: ifeq 1e0
      // 11e: goto 125
      // 121: invokestatic uka.b (Loov;)Loov;
      // 124: athrow
      // 125: ifle 1df
      // 128: goto 12f
      // 12b: invokestatic uka.b (Loov;)Loov;
      // 12e: athrow
      // 12f: fload 22
      // 131: fload 14
      // 133: fmul
      // 134: fload 23
      // 136: fload 15
      // 138: fmul
      // 139: fadd
      // 13a: fload 24
      // 13c: fload 19
      // 13e: fmul
      // 13f: fadd
      // 140: fload 25
      // 142: fadd
      // 143: fconst_0
      // 144: fcmpg
      // 145: iload 13
      // 147: ifeq 1e0
      // 14a: goto 151
      // 14d: invokestatic uka.b (Loov;)Loov;
      // 150: athrow
      // 151: ifle 1df
      // 154: goto 15b
      // 157: invokestatic uka.b (Loov;)Loov;
      // 15a: athrow
      // 15b: fload 22
      // 15d: fload 17
      // 15f: fmul
      // 160: fload 23
      // 162: fload 15
      // 164: fmul
      // 165: fadd
      // 166: fload 24
      // 168: fload 19
      // 16a: fmul
      // 16b: fadd
      // 16c: fload 25
      // 16e: fadd
      // 16f: fconst_0
      // 170: fcmpg
      // 171: iload 13
      // 173: ifeq 1e0
      // 176: goto 17d
      // 179: invokestatic uka.b (Loov;)Loov;
      // 17c: athrow
      // 17d: ifle 1df
      // 180: goto 187
      // 183: invokestatic uka.b (Loov;)Loov;
      // 186: athrow
      // 187: fload 22
      // 189: fload 14
      // 18b: fmul
      // 18c: fload 23
      // 18e: fload 18
      // 190: fmul
      // 191: fadd
      // 192: fload 24
      // 194: fload 19
      // 196: fmul
      // 197: fadd
      // 198: fload 25
      // 19a: fadd
      // 19b: fconst_0
      // 19c: fcmpg
      // 19d: iload 13
      // 19f: ifeq 1e0
      // 1a2: goto 1a9
      // 1a5: invokestatic uka.b (Loov;)Loov;
      // 1a8: athrow
      // 1a9: ifle 1df
      // 1ac: goto 1b3
      // 1af: invokestatic uka.b (Loov;)Loov;
      // 1b2: athrow
      // 1b3: fload 22
      // 1b5: fload 17
      // 1b7: fmul
      // 1b8: fload 23
      // 1ba: fload 18
      // 1bc: fmul
      // 1bd: fadd
      // 1be: fload 24
      // 1c0: fload 19
      // 1c2: fmul
      // 1c3: fadd
      // 1c4: fload 25
      // 1c6: fadd
      // 1c7: fconst_0
      // 1c8: fcmpg
      // 1c9: iload 13
      // 1cb: ifeq 1e0
      // 1ce: goto 1d5
      // 1d1: invokestatic uka.b (Loov;)Loov;
      // 1d4: athrow
      // 1d5: ifgt 33c
      // 1d8: goto 1df
      // 1db: invokestatic uka.b (Loov;)Loov;
      // 1de: athrow
      // 1df: bipush 0
      // 1e0: ireturn
      // 1e1: fload 22
      // 1e3: fload 14
      // 1e5: fmul
      // 1e6: fload 23
      // 1e8: fload 15
      // 1ea: fmul
      // 1eb: fadd
      // 1ec: fload 24
      // 1ee: fload 16
      // 1f0: fmul
      // 1f1: fadd
      // 1f2: fload 25
      // 1f4: fadd
      // 1f5: fconst_0
      // 1f6: fcmpg
      // 1f7: iload 13
      // 1f9: ifeq 223
      // 1fc: ifgt 33c
      // 1ff: goto 206
      // 202: invokestatic uka.b (Loov;)Loov;
      // 205: athrow
      // 206: fload 22
      // 208: fload 17
      // 20a: fmul
      // 20b: fload 23
      // 20d: fload 15
      // 20f: fmul
      // 210: fadd
      // 211: fload 24
      // 213: fload 16
      // 215: fmul
      // 216: fadd
      // 217: fload 25
      // 219: fadd
      // 21a: fconst_0
      // 21b: fcmpg
      // 21c: goto 223
      // 21f: invokestatic uka.b (Loov;)Loov;
      // 222: athrow
      // 223: iload 13
      // 225: ifeq 24f
      // 228: ifgt 33c
      // 22b: goto 232
      // 22e: invokestatic uka.b (Loov;)Loov;
      // 231: athrow
      // 232: fload 22
      // 234: fload 14
      // 236: fmul
      // 237: fload 23
      // 239: fload 18
      // 23b: fmul
      // 23c: fadd
      // 23d: fload 24
      // 23f: fload 16
      // 241: fmul
      // 242: fadd
      // 243: fload 25
      // 245: fadd
      // 246: fconst_0
      // 247: fcmpg
      // 248: goto 24f
      // 24b: invokestatic uka.b (Loov;)Loov;
      // 24e: athrow
      // 24f: iload 13
      // 251: ifeq 27b
      // 254: ifgt 33c
      // 257: goto 25e
      // 25a: invokestatic uka.b (Loov;)Loov;
      // 25d: athrow
      // 25e: fload 22
      // 260: fload 17
      // 262: fmul
      // 263: fload 23
      // 265: fload 18
      // 267: fmul
      // 268: fadd
      // 269: fload 24
      // 26b: fload 16
      // 26d: fmul
      // 26e: fadd
      // 26f: fload 25
      // 271: fadd
      // 272: fconst_0
      // 273: fcmpg
      // 274: goto 27b
      // 277: invokestatic uka.b (Loov;)Loov;
      // 27a: athrow
      // 27b: iload 13
      // 27d: ifeq 2a7
      // 280: ifgt 33c
      // 283: goto 28a
      // 286: invokestatic uka.b (Loov;)Loov;
      // 289: athrow
      // 28a: fload 22
      // 28c: fload 14
      // 28e: fmul
      // 28f: fload 23
      // 291: fload 15
      // 293: fmul
      // 294: fadd
      // 295: fload 24
      // 297: fload 19
      // 299: fmul
      // 29a: fadd
      // 29b: fload 25
      // 29d: fadd
      // 29e: fconst_0
      // 29f: fcmpg
      // 2a0: goto 2a7
      // 2a3: invokestatic uka.b (Loov;)Loov;
      // 2a6: athrow
      // 2a7: iload 13
      // 2a9: ifeq 2d3
      // 2ac: ifgt 33c
      // 2af: goto 2b6
      // 2b2: invokestatic uka.b (Loov;)Loov;
      // 2b5: athrow
      // 2b6: fload 22
      // 2b8: fload 17
      // 2ba: fmul
      // 2bb: fload 23
      // 2bd: fload 15
      // 2bf: fmul
      // 2c0: fadd
      // 2c1: fload 24
      // 2c3: fload 19
      // 2c5: fmul
      // 2c6: fadd
      // 2c7: fload 25
      // 2c9: fadd
      // 2ca: fconst_0
      // 2cb: fcmpg
      // 2cc: goto 2d3
      // 2cf: invokestatic uka.b (Loov;)Loov;
      // 2d2: athrow
      // 2d3: iload 13
      // 2d5: ifeq 2ff
      // 2d8: ifgt 33c
      // 2db: goto 2e2
      // 2de: invokestatic uka.b (Loov;)Loov;
      // 2e1: athrow
      // 2e2: fload 22
      // 2e4: fload 14
      // 2e6: fmul
      // 2e7: fload 23
      // 2e9: fload 18
      // 2eb: fmul
      // 2ec: fadd
      // 2ed: fload 24
      // 2ef: fload 19
      // 2f1: fmul
      // 2f2: fadd
      // 2f3: fload 25
      // 2f5: fadd
      // 2f6: fconst_0
      // 2f7: fcmpg
      // 2f8: goto 2ff
      // 2fb: invokestatic uka.b (Loov;)Loov;
      // 2fe: athrow
      // 2ff: iload 13
      // 301: ifeq 32b
      // 304: ifgt 33c
      // 307: goto 30e
      // 30a: invokestatic uka.b (Loov;)Loov;
      // 30d: athrow
      // 30e: fload 22
      // 310: fload 17
      // 312: fmul
      // 313: fload 23
      // 315: fload 18
      // 317: fmul
      // 318: fadd
      // 319: fload 24
      // 31b: fload 19
      // 31d: fmul
      // 31e: fadd
      // 31f: fload 25
      // 321: fadd
      // 322: fconst_0
      // 323: fcmpg
      // 324: goto 32b
      // 327: invokestatic uka.b (Loov;)Loov;
      // 32a: athrow
      // 32b: iload 13
      // 32d: ifeq 33b
      // 330: ifgt 33c
      // 333: goto 33a
      // 336: invokestatic uka.b (Loov;)Loov;
      // 339: athrow
      // 33a: bipush 0
      // 33b: ireturn
      // 33c: iinc 20 1
      // 33f: iload 13
      // 341: ifne 039
      // 344: bipush 1
      // 345: ireturn
   }

   private static oov b(oov var0) {
      return var0;
   }
}
