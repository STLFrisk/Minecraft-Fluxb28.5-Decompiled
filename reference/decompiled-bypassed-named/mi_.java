public class mi_ extends ttt {
   public mi_(long var1, ttt var3) {
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
      // 001: bipush 2
      // 002: isub
      // 003: istore 1
      // 004: iload 2
      // 005: bipush 2
      // 006: isub
      // 007: istore 2
      // 008: invokestatic OpaquePredicate.c ()I
      // 00b: iload 1
      // 00c: bipush 2
      // 00d: ishr
      // 00e: istore 6
      // 010: istore 5
      // 012: iload 2
      // 013: bipush 2
      // 014: ishr
      // 015: istore 7
      // 017: iload 3
      // 018: bipush 2
      // 019: ishr
      // 01a: bipush 2
      // 01b: iadd
      // 01c: istore 8
      // 01e: iload 4
      // 020: bipush 2
      // 021: ishr
      // 022: bipush 2
      // 023: iadd
      // 024: istore 9
      // 026: aload 0
      // 027: getfield mi_.ty5 Lttt;
      // 02a: iload 6
      // 02c: iload 7
      // 02e: iload 8
      // 030: iload 9
      // 032: invokevirtual ttt.ub9 (IIII)[I
      // 035: astore 10
      // 037: iload 8
      // 039: bipush 1
      // 03a: isub
      // 03b: bipush 2
      // 03c: ishl
      // 03d: istore 11
      // 03f: iload 9
      // 041: bipush 1
      // 042: isub
      // 043: bipush 2
      // 044: ishl
      // 045: istore 12
      // 047: iload 11
      // 049: iload 12
      // 04b: imul
      // 04c: invokestatic z97.web (I)[I
      // 04f: astore 13
      // 051: bipush 0
      // 052: istore 14
      // 054: iload 14
      // 056: iload 9
      // 058: bipush 1
      // 059: isub
      // 05a: if_icmpge 3d8
      // 05d: bipush 0
      // 05e: istore 15
      // 060: aload 10
      // 062: iload 15
      // 064: bipush 0
      // 065: iadd
      // 066: iload 14
      // 068: bipush 0
      // 069: iadd
      // 06a: iload 8
      // 06c: imul
      // 06d: iadd
      // 06e: iaload
      // 06f: istore 16
      // 071: aload 10
      // 073: iload 15
      // 075: bipush 0
      // 076: iadd
      // 077: iload 14
      // 079: bipush 1
      // 07a: iadd
      // 07b: iload 8
      // 07d: imul
      // 07e: iadd
      // 07f: iaload
      // 080: iload 5
      // 082: ifne 3dc
      // 085: istore 17
      // 087: iload 15
      // 089: iload 8
      // 08b: bipush 1
      // 08c: isub
      // 08d: if_icmpge 3d0
      // 090: ldc2_w 3.6
      // 093: dstore 18
      // 095: aload 0
      // 096: iload 15
      // 098: iload 6
      // 09a: iadd
      // 09b: bipush 2
      // 09c: ishl
      // 09d: i2l
      // 09e: iload 14
      // 0a0: iload 7
      // 0a2: iadd
      // 0a3: bipush 2
      // 0a4: ishl
      // 0a5: i2l
      // 0a6: invokevirtual mi_.drx (JJ)V
      // 0a9: aload 0
      // 0aa: sipush 1024
      // 0ad: invokevirtual mi_.nbt (I)I
      // 0b0: i2d
      // 0b1: ldc2_w 1024.0
      // 0b4: ddiv
      // 0b5: ldc2_w 0.5
      // 0b8: dsub
      // 0b9: ldc2_w 3.6
      // 0bc: dmul
      // 0bd: dstore 20
      // 0bf: aload 0
      // 0c0: sipush 1024
      // 0c3: invokevirtual mi_.nbt (I)I
      // 0c6: i2d
      // 0c7: ldc2_w 1024.0
      // 0ca: ddiv
      // 0cb: ldc2_w 0.5
      // 0ce: dsub
      // 0cf: ldc2_w 3.6
      // 0d2: dmul
      // 0d3: dstore 22
      // 0d5: aload 0
      // 0d6: iload 15
      // 0d8: iload 6
      // 0da: iadd
      // 0db: bipush 1
      // 0dc: iadd
      // 0dd: bipush 2
      // 0de: ishl
      // 0df: i2l
      // 0e0: iload 14
      // 0e2: iload 7
      // 0e4: iadd
      // 0e5: bipush 2
      // 0e6: ishl
      // 0e7: i2l
      // 0e8: invokevirtual mi_.drx (JJ)V
      // 0eb: aload 0
      // 0ec: sipush 1024
      // 0ef: invokevirtual mi_.nbt (I)I
      // 0f2: i2d
      // 0f3: ldc2_w 1024.0
      // 0f6: ddiv
      // 0f7: ldc2_w 0.5
      // 0fa: dsub
      // 0fb: ldc2_w 3.6
      // 0fe: dmul
      // 0ff: ldc2_w 4.0
      // 102: dadd
      // 103: dstore 24
      // 105: aload 0
      // 106: sipush 1024
      // 109: invokevirtual mi_.nbt (I)I
      // 10c: i2d
      // 10d: ldc2_w 1024.0
      // 110: ddiv
      // 111: ldc2_w 0.5
      // 114: dsub
      // 115: ldc2_w 3.6
      // 118: dmul
      // 119: dstore 26
      // 11b: aload 0
      // 11c: iload 15
      // 11e: iload 6
      // 120: iadd
      // 121: bipush 2
      // 122: ishl
      // 123: i2l
      // 124: iload 14
      // 126: iload 7
      // 128: iadd
      // 129: bipush 1
      // 12a: iadd
      // 12b: bipush 2
      // 12c: ishl
      // 12d: i2l
      // 12e: invokevirtual mi_.drx (JJ)V
      // 131: aload 0
      // 132: sipush 1024
      // 135: invokevirtual mi_.nbt (I)I
      // 138: i2d
      // 139: ldc2_w 1024.0
      // 13c: ddiv
      // 13d: ldc2_w 0.5
      // 140: dsub
      // 141: ldc2_w 3.6
      // 144: dmul
      // 145: dstore 28
      // 147: aload 0
      // 148: sipush 1024
      // 14b: invokevirtual mi_.nbt (I)I
      // 14e: i2d
      // 14f: ldc2_w 1024.0
      // 152: ddiv
      // 153: ldc2_w 0.5
      // 156: dsub
      // 157: ldc2_w 3.6
      // 15a: dmul
      // 15b: ldc2_w 4.0
      // 15e: dadd
      // 15f: dstore 30
      // 161: aload 0
      // 162: iload 15
      // 164: iload 6
      // 166: iadd
      // 167: bipush 1
      // 168: iadd
      // 169: bipush 2
      // 16a: ishl
      // 16b: i2l
      // 16c: iload 14
      // 16e: iload 7
      // 170: iadd
      // 171: bipush 1
      // 172: iadd
      // 173: bipush 2
      // 174: ishl
      // 175: i2l
      // 176: invokevirtual mi_.drx (JJ)V
      // 179: aload 0
      // 17a: sipush 1024
      // 17d: invokevirtual mi_.nbt (I)I
      // 180: i2d
      // 181: ldc2_w 1024.0
      // 184: ddiv
      // 185: ldc2_w 0.5
      // 188: dsub
      // 189: ldc2_w 3.6
      // 18c: dmul
      // 18d: ldc2_w 4.0
      // 190: dadd
      // 191: dstore 32
      // 193: aload 0
      // 194: sipush 1024
      // 197: invokevirtual mi_.nbt (I)I
      // 19a: i2d
      // 19b: ldc2_w 1024.0
      // 19e: ddiv
      // 19f: ldc2_w 0.5
      // 1a2: dsub
      // 1a3: ldc2_w 3.6
      // 1a6: dmul
      // 1a7: ldc2_w 4.0
      // 1aa: dadd
      // 1ab: dstore 34
      // 1ad: aload 10
      // 1af: iload 15
      // 1b1: bipush 1
      // 1b2: iadd
      // 1b3: iload 14
      // 1b5: bipush 0
      // 1b6: iadd
      // 1b7: iload 8
      // 1b9: imul
      // 1ba: iadd
      // 1bb: iaload
      // 1bc: sipush 255
      // 1bf: iand
      // 1c0: istore 36
      // 1c2: aload 10
      // 1c4: iload 15
      // 1c6: bipush 1
      // 1c7: iadd
      // 1c8: iload 14
      // 1ca: bipush 1
      // 1cb: iadd
      // 1cc: iload 8
      // 1ce: imul
      // 1cf: iadd
      // 1d0: iaload
      // 1d1: sipush 255
      // 1d4: iand
      // 1d5: istore 37
      // 1d7: bipush 0
      // 1d8: iload 5
      // 1da: ifne 056
      // 1dd: istore 38
      // 1df: iload 38
      // 1e1: bipush 4
      // 1e2: if_icmpge 3c0
      // 1e5: iload 14
      // 1e7: bipush 2
      // 1e8: ishl
      // 1e9: iload 38
      // 1eb: iadd
      // 1ec: iload 11
      // 1ee: imul
      // 1ef: iload 15
      // 1f1: bipush 2
      // 1f2: ishl
      // 1f3: iadd
      // 1f4: istore 39
      // 1f6: bipush 0
      // 1f7: iload 5
      // 1f9: ifne 3c6
      // 1fc: istore 40
      // 1fe: iload 40
      // 200: bipush 4
      // 201: if_icmpge 3b8
      // 204: iload 38
      // 206: i2d
      // 207: dload 22
      // 209: dsub
      // 20a: iload 38
      // 20c: i2d
      // 20d: dload 22
      // 20f: dsub
      // 210: dmul
      // 211: iload 40
      // 213: i2d
      // 214: dload 20
      // 216: dsub
      // 217: iload 40
      // 219: i2d
      // 21a: dload 20
      // 21c: dsub
      // 21d: dmul
      // 21e: dadd
      // 21f: dstore 41
      // 221: iload 38
      // 223: i2d
      // 224: dload 26
      // 226: dsub
      // 227: iload 38
      // 229: i2d
      // 22a: dload 26
      // 22c: dsub
      // 22d: dmul
      // 22e: iload 40
      // 230: i2d
      // 231: dload 24
      // 233: dsub
      // 234: iload 40
      // 236: i2d
      // 237: dload 24
      // 239: dsub
      // 23a: dmul
      // 23b: dadd
      // 23c: dstore 43
      // 23e: iload 38
      // 240: i2d
      // 241: dload 30
      // 243: dsub
      // 244: iload 38
      // 246: i2d
      // 247: dload 30
      // 249: dsub
      // 24a: dmul
      // 24b: iload 40
      // 24d: i2d
      // 24e: dload 28
      // 250: dsub
      // 251: iload 40
      // 253: i2d
      // 254: dload 28
      // 256: dsub
      // 257: dmul
      // 258: dadd
      // 259: dstore 45
      // 25b: iload 38
      // 25d: i2d
      // 25e: dload 34
      // 260: dsub
      // 261: iload 38
      // 263: i2d
      // 264: dload 34
      // 266: dsub
      // 267: dmul
      // 268: iload 40
      // 26a: i2d
      // 26b: dload 32
      // 26d: dsub
      // 26e: iload 40
      // 270: i2d
      // 271: dload 32
      // 273: dsub
      // 274: dmul
      // 275: dadd
      // 276: dstore 47
      // 278: dload 41
      // 27a: dload 43
      // 27c: dcmpg
      // 27d: iload 5
      // 27f: ifne 1e1
      // 282: iload 5
      // 284: ifne 2e9
      // 287: ifge 2dd
      // 28a: goto 291
      // 28d: invokestatic mi_.a (Loov;)Loov;
      // 290: athrow
      // 291: dload 41
      // 293: dload 45
      // 295: dcmpg
      // 296: iload 5
      // 298: ifne 2e9
      // 29b: goto 2a2
      // 29e: invokestatic mi_.a (Loov;)Loov;
      // 2a1: athrow
      // 2a2: ifge 2dd
      // 2a5: goto 2ac
      // 2a8: invokestatic mi_.a (Loov;)Loov;
      // 2ab: athrow
      // 2ac: dload 41
      // 2ae: dload 47
      // 2b0: dcmpg
      // 2b1: iload 5
      // 2b3: ifne 2e9
      // 2b6: goto 2bd
      // 2b9: invokestatic mi_.a (Loov;)Loov;
      // 2bc: athrow
      // 2bd: ifge 2dd
      // 2c0: goto 2c7
      // 2c3: invokestatic mi_.a (Loov;)Loov;
      // 2c6: athrow
      // 2c7: aload 13
      // 2c9: iload 39
      // 2cb: iinc 39 1
      // 2ce: iload 16
      // 2d0: iastore
      // 2d1: iload 5
      // 2d3: ifeq 3b0
      // 2d6: goto 2dd
      // 2d9: invokestatic mi_.a (Loov;)Loov;
      // 2dc: athrow
      // 2dd: dload 43
      // 2df: dload 41
      // 2e1: dcmpg
      // 2e2: goto 2e9
      // 2e5: invokestatic mi_.a (Loov;)Loov;
      // 2e8: athrow
      // 2e9: iload 5
      // 2eb: ifne 350
      // 2ee: ifge 344
      // 2f1: goto 2f8
      // 2f4: invokestatic mi_.a (Loov;)Loov;
      // 2f7: athrow
      // 2f8: dload 43
      // 2fa: dload 45
      // 2fc: dcmpg
      // 2fd: iload 5
      // 2ff: ifne 350
      // 302: goto 309
      // 305: invokestatic mi_.a (Loov;)Loov;
      // 308: athrow
      // 309: ifge 344
      // 30c: goto 313
      // 30f: invokestatic mi_.a (Loov;)Loov;
      // 312: athrow
      // 313: dload 43
      // 315: dload 47
      // 317: dcmpg
      // 318: iload 5
      // 31a: ifne 350
      // 31d: goto 324
      // 320: invokestatic mi_.a (Loov;)Loov;
      // 323: athrow
      // 324: ifge 344
      // 327: goto 32e
      // 32a: invokestatic mi_.a (Loov;)Loov;
      // 32d: athrow
      // 32e: aload 13
      // 330: iload 39
      // 332: iinc 39 1
      // 335: iload 36
      // 337: iastore
      // 338: iload 5
      // 33a: ifeq 3b0
      // 33d: goto 344
      // 340: invokestatic mi_.a (Loov;)Loov;
      // 343: athrow
      // 344: dload 45
      // 346: dload 41
      // 348: dcmpg
      // 349: goto 350
      // 34c: invokestatic mi_.a (Loov;)Loov;
      // 34f: athrow
      // 350: iload 5
      // 352: ifne 36b
      // 355: ifge 39f
      // 358: goto 35f
      // 35b: invokestatic mi_.a (Loov;)Loov;
      // 35e: athrow
      // 35f: dload 45
      // 361: dload 43
      // 363: dcmpg
      // 364: goto 36b
      // 367: invokestatic mi_.a (Loov;)Loov;
      // 36a: athrow
      // 36b: iload 5
      // 36d: ifne 386
      // 370: ifge 39f
      // 373: goto 37a
      // 376: invokestatic mi_.a (Loov;)Loov;
      // 379: athrow
      // 37a: dload 45
      // 37c: dload 47
      // 37e: dcmpg
      // 37f: goto 386
      // 382: invokestatic mi_.a (Loov;)Loov;
      // 385: athrow
      // 386: ifge 39f
      // 389: aload 13
      // 38b: iload 39
      // 38d: iinc 39 1
      // 390: iload 17
      // 392: iastore
      // 393: iload 5
      // 395: ifeq 3b0
      // 398: goto 39f
      // 39b: invokestatic mi_.a (Loov;)Loov;
      // 39e: athrow
      // 39f: aload 13
      // 3a1: iload 39
      // 3a3: iinc 39 1
      // 3a6: iload 37
      // 3a8: iastore
      // 3a9: goto 3b0
      // 3ac: invokestatic mi_.a (Loov;)Loov;
      // 3af: athrow
      // 3b0: iinc 40 1
      // 3b3: iload 5
      // 3b5: ifeq 1fe
      // 3b8: iinc 38 1
      // 3bb: iload 5
      // 3bd: ifeq 1df
      // 3c0: iload 36
      // 3c2: istore 16
      // 3c4: iload 37
      // 3c6: istore 17
      // 3c8: iinc 15 1
      // 3cb: iload 5
      // 3cd: ifeq 087
      // 3d0: iinc 14 1
      // 3d3: iload 5
      // 3d5: ifeq 054
      // 3d8: iload 3
      // 3d9: iload 4
      // 3db: imul
      // 3dc: invokestatic z97.web (I)[I
      // 3df: astore 14
      // 3e1: bipush 0
      // 3e2: istore 15
      // 3e4: iload 15
      // 3e6: iload 4
      // 3e8: if_icmpge 418
      // 3eb: aload 13
      // 3ed: iload 5
      // 3ef: ifne 41a
      // 3f2: iload 15
      // 3f4: iload 2
      // 3f5: bipush 3
      // 3f6: iand
      // 3f7: iadd
      // 3f8: iload 11
      // 3fa: imul
      // 3fb: iload 1
      // 3fc: bipush 3
      // 3fd: iand
      // 3fe: iadd
      // 3ff: aload 14
      // 401: iload 15
      // 403: iload 3
      // 404: imul
      // 405: iload 3
      // 406: invokestatic java/lang/System.arraycopy (Ljava/lang/Object;ILjava/lang/Object;II)V
      // 409: iinc 15 1
      // 40c: iload 5
      // 40e: ifeq 3e4
      // 411: goto 418
      // 414: invokestatic mi_.a (Loov;)Loov;
      // 417: athrow
      // 418: aload 14
      // 41a: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
