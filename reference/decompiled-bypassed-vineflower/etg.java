public class etg extends liu {
   public etg(hr_ var1) {
      super(var1);
   }

   public void r02(_6b param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic jom.yut ()Ljom;
      // 003: astore 11
      // 005: invokestatic t9d.b ()I
      // 008: aload 11
      // 00a: invokevirtual jom.zuq ()Lq3g;
      // 00d: astore 12
      // 00f: istore 10
      // 011: invokestatic hzu.m_1 ()V
      // 014: invokestatic hzu.fpt ()V
      // 017: invokestatic hzu.spd ()V
      // 01a: sipush 770
      // 01d: bipush 1
      // 01e: invokestatic hzu.ru7 (II)V
      // 021: bipush 8
      // 023: newarray 7
      // 025: astore 13
      // 027: bipush 8
      // 029: newarray 7
      // 02b: astore 14
      // 02d: dconst_0
      // 02e: dstore 15
      // 030: dconst_0
      // 031: dstore 17
      // 033: new java/util/Random
      // 036: dup
      // 037: aload 1
      // 038: getfield _6b._ud J
      // 03b: invokespecial java/util/Random.<init> (J)V
      // 03e: astore 19
      // 040: bipush 7
      // 042: istore 20
      // 044: iload 20
      // 046: iflt 089
      // 049: aload 13
      // 04b: iload 20
      // 04d: dload 15
      // 04f: dastore
      // 050: aload 14
      // 052: iload 20
      // 054: dload 17
      // 056: dastore
      // 057: dload 15
      // 059: aload 19
      // 05b: bipush 11
      // 05d: invokevirtual java/util/Random.nextInt (I)I
      // 060: bipush 5
      // 061: isub
      // 062: i2d
      // 063: dadd
      // 064: dstore 15
      // 066: dload 17
      // 068: aload 19
      // 06a: bipush 11
      // 06c: invokevirtual java/util/Random.nextInt (I)I
      // 06f: bipush 5
      // 070: isub
      // 071: i2d
      // 072: dadd
      // 073: dstore 17
      // 075: iinc 20 -1
      // 078: iload 10
      // 07a: ifeq 08c
      // 07d: iload 10
      // 07f: ifne 044
      // 082: goto 089
      // 085: invokestatic etg.a (Loov;)Loov;
      // 088: athrow
      // 089: bipush 0
      // 08a: istore 20
      // 08c: iload 20
      // 08e: bipush 4
      // 08f: if_icmpge 34d
      // 092: new java/util/Random
      // 095: dup
      // 096: aload 1
      // 097: getfield _6b._ud J
      // 09a: invokespecial java/util/Random.<init> (J)V
      // 09d: astore 21
      // 09f: iload 10
      // 0a1: ifeq 356
      // 0a4: bipush 0
      // 0a5: istore 22
      // 0a7: iload 22
      // 0a9: bipush 3
      // 0aa: if_icmpge 345
      // 0ad: bipush 7
      // 0af: istore 23
      // 0b1: bipush 0
      // 0b2: istore 24
      // 0b4: iload 22
      // 0b6: iload 10
      // 0b8: ifeq 08e
      // 0bb: iload 10
      // 0bd: ifeq 0d3
      // 0c0: ifle 0d1
      // 0c3: goto 0ca
      // 0c6: invokestatic etg.a (Loov;)Loov;
      // 0c9: athrow
      // 0ca: bipush 7
      // 0cc: iload 22
      // 0ce: isub
      // 0cf: istore 23
      // 0d1: iload 22
      // 0d3: iload 10
      // 0d5: ifeq 0ed
      // 0d8: ifle 0ef
      // 0db: goto 0e2
      // 0de: invokestatic etg.a (Loov;)Loov;
      // 0e1: athrow
      // 0e2: iload 23
      // 0e4: bipush 2
      // 0e5: isub
      // 0e6: goto 0ed
      // 0e9: invokestatic etg.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: istore 24
      // 0ef: aload 13
      // 0f1: iload 23
      // 0f3: daload
      // 0f4: dload 15
      // 0f6: dsub
      // 0f7: dstore 25
      // 0f9: aload 14
      // 0fb: iload 23
      // 0fd: daload
      // 0fe: dload 17
      // 100: dsub
      // 101: dstore 27
      // 103: iload 23
      // 105: istore 29
      // 107: iload 29
      // 109: iload 24
      // 10b: if_icmplt 33d
      // 10e: dload 25
      // 110: dstore 30
      // 112: dload 27
      // 114: dstore 32
      // 116: iload 10
      // 118: ifeq 15f
      // 11b: iload 22
      // 11d: iload 10
      // 11f: ifeq 0a9
      // 122: goto 129
      // 125: invokestatic etg.a (Loov;)Loov;
      // 128: athrow
      // 129: ifne 14f
      // 12c: dload 25
      // 12e: aload 21
      // 130: bipush 11
      // 132: invokevirtual java/util/Random.nextInt (I)I
      // 135: bipush 5
      // 136: isub
      // 137: i2d
      // 138: dadd
      // 139: dstore 25
      // 13b: dload 27
      // 13d: aload 21
      // 13f: bipush 11
      // 141: invokevirtual java/util/Random.nextInt (I)I
      // 144: bipush 5
      // 145: isub
      // 146: i2d
      // 147: dadd
      // 148: dstore 27
      // 14a: iload 10
      // 14c: ifne 16f
      // 14f: dload 25
      // 151: aload 21
      // 153: bipush 31
      // 155: invokevirtual java/util/Random.nextInt (I)I
      // 158: bipush 15
      // 15a: isub
      // 15b: i2d
      // 15c: dadd
      // 15d: dstore 25
      // 15f: dload 27
      // 161: aload 21
      // 163: bipush 31
      // 165: invokevirtual java/util/Random.nextInt (I)I
      // 168: bipush 15
      // 16a: isub
      // 16b: i2d
      // 16c: dadd
      // 16d: dstore 27
      // 16f: aload 12
      // 171: bipush 5
      // 172: getstatic gnl.gec Lbe7;
      // 175: invokevirtual q3g.ezr (ILbe7;)V
      // 178: ldc 0.5
      // 17a: nop
      // 17b: fstore 34
      // 17d: ldc 0.45
      // 17f: nop
      // 180: fstore 35
      // 182: ldc 0.45
      // 184: nop
      // 185: fstore 36
      // 187: ldc 0.5
      // 189: nop
      // 18a: fstore 37
      // 18c: ldc2_w 0.1
      // 18f: iload 20
      // 191: i2d
      // 192: ldc2_w 0.2
      // 195: dmul
      // 196: dadd
      // 197: dstore 38
      // 199: iload 22
      // 19b: ifne 1ac
      // 19e: dload 38
      // 1a0: iload 29
      // 1a2: i2d
      // 1a3: ldc2_w 0.1
      // 1a6: dmul
      // 1a7: dconst_1
      // 1a8: dadd
      // 1a9: dmul
      // 1aa: dstore 38
      // 1ac: ldc2_w 0.1
      // 1af: iload 20
      // 1b1: i2d
      // 1b2: ldc2_w 0.2
      // 1b5: dmul
      // 1b6: dadd
      // 1b7: dstore 40
      // 1b9: iload 22
      // 1bb: iload 10
      // 1bd: ifeq 1db
      // 1c0: ifne 1da
      // 1c3: goto 1ca
      // 1c6: invokestatic etg.a (Loov;)Loov;
      // 1c9: athrow
      // 1ca: dload 40
      // 1cc: iload 29
      // 1ce: bipush 1
      // 1cf: isub
      // 1d0: i2d
      // 1d1: ldc2_w 0.1
      // 1d4: dmul
      // 1d5: dconst_1
      // 1d6: dadd
      // 1d7: dmul
      // 1d8: dstore 40
      // 1da: bipush 0
      // 1db: istore 42
      // 1dd: iload 42
      // 1df: bipush 5
      // 1e0: if_icmpge 330
      // 1e3: dload 2
      // 1e4: ldc2_w 0.5
      // 1e7: dadd
      // 1e8: dload 38
      // 1ea: dsub
      // 1eb: dstore 43
      // 1ed: dload 6
      // 1ef: ldc2_w 0.5
      // 1f2: dadd
      // 1f3: dload 38
      // 1f5: dsub
      // 1f6: dstore 45
      // 1f8: iload 42
      // 1fa: bipush 1
      // 1fb: iload 10
      // 1fd: ifeq 10b
      // 200: iload 10
      // 202: ifeq 219
      // 205: if_icmpeq 228
      // 208: goto 20f
      // 20b: invokestatic etg.a (Loov;)Loov;
      // 20e: athrow
      // 20f: iload 42
      // 211: bipush 2
      // 212: goto 219
      // 215: invokestatic etg.a (Loov;)Loov;
      // 218: athrow
      // 219: iload 10
      // 21b: ifeq 236
      // 21e: if_icmpne 233
      // 221: goto 228
      // 224: invokestatic etg.a (Loov;)Loov;
      // 227: athrow
      // 228: dload 43
      // 22a: dload 38
      // 22c: ldc2_w 2.0
      // 22f: dmul
      // 230: dadd
      // 231: dstore 43
      // 233: iload 42
      // 235: bipush 2
      // 236: iload 10
      // 238: ifeq 24f
      // 23b: if_icmpeq 252
      // 23e: goto 245
      // 241: invokestatic etg.a (Loov;)Loov;
      // 244: athrow
      // 245: iload 42
      // 247: bipush 3
      // 248: goto 24f
      // 24b: invokestatic etg.a (Loov;)Loov;
      // 24e: athrow
      // 24f: if_icmpne 25d
      // 252: dload 45
      // 254: dload 38
      // 256: ldc2_w 2.0
      // 259: dmul
      // 25a: dadd
      // 25b: dstore 45
      // 25d: dload 2
      // 25e: ldc2_w 0.5
      // 261: dadd
      // 262: dload 40
      // 264: dsub
      // 265: dstore 47
      // 267: dload 6
      // 269: ldc2_w 0.5
      // 26c: dadd
      // 26d: dload 40
      // 26f: dsub
      // 270: dstore 49
      // 272: iload 42
      // 274: bipush 1
      // 275: iload 10
      // 277: ifeq 28e
      // 27a: if_icmpeq 29d
      // 27d: goto 284
      // 280: invokestatic etg.a (Loov;)Loov;
      // 283: athrow
      // 284: iload 42
      // 286: bipush 2
      // 287: goto 28e
      // 28a: invokestatic etg.a (Loov;)Loov;
      // 28d: athrow
      // 28e: iload 10
      // 290: ifeq 2ab
      // 293: if_icmpne 2a8
      // 296: goto 29d
      // 299: invokestatic etg.a (Loov;)Loov;
      // 29c: athrow
      // 29d: dload 47
      // 29f: dload 40
      // 2a1: ldc2_w 2.0
      // 2a4: dmul
      // 2a5: dadd
      // 2a6: dstore 47
      // 2a8: iload 42
      // 2aa: bipush 2
      // 2ab: iload 10
      // 2ad: ifeq 2c4
      // 2b0: if_icmpeq 2c7
      // 2b3: goto 2ba
      // 2b6: invokestatic etg.a (Loov;)Loov;
      // 2b9: athrow
      // 2ba: iload 42
      // 2bc: bipush 3
      // 2bd: goto 2c4
      // 2c0: invokestatic etg.a (Loov;)Loov;
      // 2c3: athrow
      // 2c4: if_icmpne 2d2
      // 2c7: dload 49
      // 2c9: dload 40
      // 2cb: ldc2_w 2.0
      // 2ce: dmul
      // 2cf: dadd
      // 2d0: dstore 49
      // 2d2: aload 12
      // 2d4: dload 47
      // 2d6: dload 25
      // 2d8: dadd
      // 2d9: dload 4
      // 2db: iload 29
      // 2dd: bipush 16
      // 2df: imul
      // 2e0: i2d
      // 2e1: dadd
      // 2e2: dload 49
      // 2e4: dload 27
      // 2e6: dadd
      // 2e7: invokevirtual q3g.g5o (DDD)Lq3g;
      // 2ea: ldc 0.45
      // 2ec: nop
      // 2ed: ldc 0.45
      // 2ef: nop
      // 2f0: ldc 0.5
      // 2f2: nop
      // 2f3: ldc 0.3
      // 2f5: nop
      // 2f6: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 2f9: invokevirtual q3g.pzw ()V
      // 2fc: aload 12
      // 2fe: dload 43
      // 300: dload 30
      // 302: dadd
      // 303: dload 4
      // 305: iload 29
      // 307: bipush 1
      // 308: iadd
      // 309: bipush 16
      // 30b: imul
      // 30c: i2d
      // 30d: dadd
      // 30e: dload 45
      // 310: dload 32
      // 312: dadd
      // 313: invokevirtual q3g.g5o (DDD)Lq3g;
      // 316: ldc 0.45
      // 318: nop
      // 319: ldc 0.45
      // 31b: nop
      // 31c: ldc 0.5
      // 31e: nop
      // 31f: ldc 0.3
      // 321: nop
      // 322: invokevirtual q3g.gs4 (FFFF)Lq3g;
      // 325: invokevirtual q3g.pzw ()V
      // 328: iinc 42 1
      // 32b: iload 10
      // 32d: ifne 1dd
      // 330: aload 11
      // 332: invokevirtual jom.q7g ()V
      // 335: iinc 29 -1
      // 338: iload 10
      // 33a: ifne 107
      // 33d: iinc 22 1
      // 340: iload 10
      // 342: ifne 0a7
      // 345: iinc 20 1
      // 348: iload 10
      // 34a: ifne 08c
      // 34d: invokestatic hzu.ux6 ()V
      // 350: invokestatic hzu.s7q ()V
      // 353: invokestatic hzu.rqj ()V
      // 356: return
   }

   public gdz _s6(_6b var1) {
      return null;
   }

   @Override
   public gdz dzd(i2h var1) {
      return this._s6((_6b)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.r02((_6b)var1, var2, var4, var6, var8, var9);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
