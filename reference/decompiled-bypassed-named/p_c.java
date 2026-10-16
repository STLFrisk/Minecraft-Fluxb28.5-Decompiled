public class p_c {
   private static Minecraft vvx = Minecraft.vz1();

   public static void gvr(double[] param0, mew param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_c.vvx Lc05;
      // 003: getfield Minecraft.vg8 Ll86;
      // 006: aload 1
      // 007: invokevirtual EntityPlayerSP.csm (Lmew;)D
      // 00a: invokestatic java/lang/Math.sqrt (D)D
      // 00d: dstore 3
      // 00e: invokestatic OpaquePredicate.b ()I
      // 011: ldc2_w 0.31
      // 014: invokestatic p_c.vvc ()I
      // 017: bipush 20
      // 019: idiv
      // 01a: i2d
      // 01b: dadd
      // 01c: dstore 5
      // 01e: istore 2
      // 01f: dconst_0
      // 020: dstore 11
      // 022: dload 3
      // 023: dload 5
      // 025: iload 2
      // 026: ifeq 042
      // 029: dcmpl
      // 02a: ifle 19c
      // 02d: goto 034
      // 030: invokestatic p_c.a (Loov;)Loov;
      // 033: athrow
      // 034: dload 3
      // 035: dload 5
      // 037: ddiv
      // 038: ldc2_w 0.49999999999
      // 03b: goto 042
      // 03e: invokestatic p_c.a (Loov;)Loov;
      // 041: athrow
      // 042: dadd
      // 043: invokestatic java/lang/Math.round (D)J
      // 046: lconst_1
      // 047: lsub
      // 048: l2d
      // 049: dstore 13
      // 04b: getstatic p_c.vvx Lc05;
      // 04e: getfield Minecraft.vg8 Ll86;
      // 051: getfield EntityPlayerSP.o2v D
      // 054: dstore 7
      // 056: getstatic p_c.vvx Lc05;
      // 059: getfield Minecraft.vg8 Ll86;
      // 05c: getfield EntityPlayerSP.kfp D
      // 05f: dstore 9
      // 061: getstatic p_c.vvx Lc05;
      // 064: getfield Minecraft.vg8 Ll86;
      // 067: getfield EntityPlayerSP.vbd D
      // 06a: dstore 11
      // 06c: dconst_0
      // 06d: dstore 15
      // 06f: bipush 1
      // 070: istore 17
      // 072: iload 17
      // 074: i2d
      // 075: dload 13
      // 077: dcmpg
      // 078: ifge 178
      // 07b: aload 1
      // 07c: invokevirtual mew.getX ()I
      // 07f: i2d
      // 080: getstatic p_c.vvx Lc05;
      // 083: getfield Minecraft.vg8 Ll86;
      // 086: getfield EntityPlayerSP.o2v D
      // 089: dsub
      // 08a: dload 13
      // 08c: ddiv
      // 08d: dstore 18
      // 08f: dload 7
      // 091: dload 18
      // 093: dadd
      // 094: dstore 7
      // 096: aload 1
      // 097: invokevirtual mew.getZ ()I
      // 09a: i2d
      // 09b: getstatic p_c.vvx Lc05;
      // 09e: getfield Minecraft.vg8 Ll86;
      // 0a1: getfield EntityPlayerSP.vbd D
      // 0a4: dsub
      // 0a5: dload 13
      // 0a7: ddiv
      // 0a8: dstore 20
      // 0aa: dload 11
      // 0ac: dload 20
      // 0ae: dadd
      // 0af: dstore 11
      // 0b1: aload 1
      // 0b2: invokevirtual mew.getY ()I
      // 0b5: i2d
      // 0b6: getstatic p_c.vvx Lc05;
      // 0b9: getfield Minecraft.vg8 Ll86;
      // 0bc: getfield EntityPlayerSP.kfp D
      // 0bf: dsub
      // 0c0: dload 13
      // 0c2: ddiv
      // 0c3: dstore 22
      // 0c5: dload 9
      // 0c7: dload 22
      // 0c9: dadd
      // 0ca: dstore 9
      // 0cc: dload 15
      // 0ce: dconst_1
      // 0cf: dadd
      // 0d0: dstore 15
      // 0d2: getstatic p_c.vvx Lc05;
      // 0d5: iload 2
      // 0d6: ifeq 17b
      // 0d9: getfield Minecraft.tij Lkh3;
      // 0dc: new mew
      // 0df: dup
      // 0e0: dload 7
      // 0e2: dload 9
      // 0e4: dconst_1
      // 0e5: dsub
      // 0e6: dload 11
      // 0e8: invokespecial mew.<init> (DDD)V
      // 0eb: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 0ee: invokeinterface zfz.r_y ()Le0x; 1
      // 0f3: invokevirtual e0x.z4c ()Z
      // 0f6: iload 2
      // 0f7: ifeq 118
      // 0fa: goto 101
      // 0fd: invokestatic p_c.a (Loov;)Loov;
      // 100: athrow
      // 101: ifne 150
      // 104: goto 10b
      // 107: invokestatic p_c.a (Loov;)Loov;
      // 10a: athrow
      // 10b: dload 15
      // 10d: ldc2_w 2.0
      // 110: dcmpg
      // 111: goto 118
      // 114: invokestatic p_c.a (Loov;)Loov;
      // 117: athrow
      // 118: iload 2
      // 119: ifeq 14a
      // 11c: ifgt 132
      // 11f: goto 126
      // 122: invokestatic p_c.a (Loov;)Loov;
      // 125: athrow
      // 126: dload 9
      // 128: ldc2_w 2.0E-8
      // 12b: dadd
      // 12c: dstore 9
      // 12e: iload 2
      // 12f: ifne 150
      // 132: dload 15
      // 134: iload 2
      // 135: ifeq 14e
      // 138: goto 13f
      // 13b: invokestatic p_c.a (Loov;)Loov;
      // 13e: athrow
      // 13f: ldc2_w 4.0
      // 142: dcmpl
      // 143: goto 14a
      // 146: invokestatic p_c.a (Loov;)Loov;
      // 149: athrow
      // 14a: iflt 150
      // 14d: dconst_0
      // 14e: dstore 15
      // 150: new net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition
      // 153: dup
      // 154: dload 7
      // 156: dload 9
      // 158: dload 11
      // 15a: bipush 0
      // 15b: invokespecial net/minecraft/network/play/client/C03PacketPlayer$C04PacketPlayerPosition.<init> (DDDZ)V
      // 15e: astore 24
      // 160: getstatic p_c.vvx Lc05;
      // 163: getfield Minecraft.vg8 Ll86;
      // 166: getfield EntityPlayerSP.lq7 Lp_k;
      // 169: invokevirtual p_k._m3 ()Lhv0;
      // 16c: aload 24
      // 16e: invokevirtual hv0.r92 (Lmz2;)V
      // 171: iinc 17 1
      // 174: iload 2
      // 175: ifne 072
      // 178: getstatic p_c.vvx Lc05;
      // 17b: getfield Minecraft.vg8 Ll86;
      // 17e: aload 1
      // 17f: invokevirtual mew.getX ()I
      // 182: i2d
      // 183: ldc2_w 0.5
      // 186: dadd
      // 187: aload 1
      // 188: invokevirtual mew.getY ()I
      // 18b: i2d
      // 18c: aload 1
      // 18d: invokevirtual mew.getZ ()I
      // 190: i2d
      // 191: ldc2_w 0.5
      // 194: dadd
      // 195: invokevirtual EntityPlayerSP.m6_ (DDD)V
      // 198: iload 2
      // 199: ifne 1bb
      // 19c: getstatic p_c.vvx Lc05;
      // 19f: getfield Minecraft.vg8 Ll86;
      // 1a2: aload 1
      // 1a3: invokevirtual mew.getX ()I
      // 1a6: i2d
      // 1a7: aload 1
      // 1a8: invokevirtual mew.getY ()I
      // 1ab: i2d
      // 1ac: aload 1
      // 1ad: invokevirtual mew.getZ ()I
      // 1b0: i2d
      // 1b1: invokevirtual EntityPlayerSP.m6_ (DDD)V
      // 1b4: goto 1bb
      // 1b7: invokestatic p_c.a (Loov;)Loov;
      // 1ba: athrow
      // 1bb: return
   }

   public static double tz6() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: ldc2_w 0.2873
      // 07: dstore 1
      // 08: invokestatic Minecraft.vz1 ()Lc05;
      // 0b: getfield Minecraft.vg8 Ll86;
      // 0e: getstatic mcs.uwx Lmcs;
      // 11: invokevirtual EntityPlayerSP.cab (Lmcs;)Z
      // 14: iload 0
      // 15: ifne 38
      // 18: ifeq 46
      // 1b: goto 22
      // 1e: invokestatic p_c.a (Loov;)Loov;
      // 21: athrow
      // 22: invokestatic Minecraft.vz1 ()Lc05;
      // 25: getfield Minecraft.vg8 Ll86;
      // 28: getstatic mcs.uwx Lmcs;
      // 2b: invokevirtual EntityPlayerSP.dhd (Lmcs;)Lsdj;
      // 2e: invokevirtual sdj.tus ()I
      // 31: goto 38
      // 34: invokestatic p_c.a (Loov;)Loov;
      // 37: athrow
      // 38: istore 3
      // 39: dload 1
      // 3a: dconst_1
      // 3b: ldc2_w 0.2
      // 3e: iload 3
      // 3f: bipush 1
      // 40: iadd
      // 41: i2d
      // 42: dmul
      // 43: dadd
      // 44: dmul
      // 45: dstore 1
      // 46: dload 1
      // 47: dreturn
   }

   public static void f8j(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_c.vvx Lc05;
      // 003: getfield Minecraft.vg8 Ll86;
      // 006: getfield EntityPlayerSP.x5k F
      // 009: ldc 0.017453292
      // 00b: nop
      // 00c: fmul
      // 00d: fstore 3
      // 00e: getstatic p_c.vvx Lc05;
      // 011: getfield Minecraft.vg8 Ll86;
      // 014: getfield EntityPlayerSP.x5k F
      // 017: ldc 0.017453292
      // 019: nop
      // 01a: fmul
      // 01b: ldc 4.712389
      // 01d: nop
      // 01e: fsub
      // 01f: fstore 4
      // 021: getstatic p_c.vvx Lc05;
      // 024: getfield Minecraft.vg8 Ll86;
      // 027: getfield EntityPlayerSP.x5k F
      // 02a: ldc 0.017453292
      // 02c: nop
      // 02d: fmul
      // 02e: ldc 4.712389
      // 030: nop
      // 031: fadd
      // 032: fstore 5
      // 034: invokestatic OpaquePredicate.c ()I
      // 037: getstatic p_c.vvx Lc05;
      // 03a: getfield Minecraft.vg8 Ll86;
      // 03d: getfield EntityPlayerSP.x5k F
      // 040: ldc 0.017453292
      // 042: nop
      // 043: fmul
      // 044: ldc 0.5969026
      // 046: nop
      // 047: fadd
      // 048: fstore 6
      // 04a: getstatic p_c.vvx Lc05;
      // 04d: getfield Minecraft.vg8 Ll86;
      // 050: getfield EntityPlayerSP.x5k F
      // 053: ldc 0.017453292
      // 055: nop
      // 056: fmul
      // 057: ldc -0.5969026
      // 059: nop
      // 05a: fadd
      // 05b: fstore 7
      // 05d: getstatic p_c.vvx Lc05;
      // 060: getfield Minecraft.vg8 Ll86;
      // 063: getfield EntityPlayerSP.x5k F
      // 066: ldc 0.017453292
      // 068: nop
      // 069: fmul
      // 06a: ldc 2.3876104
      // 06c: nop
      // 06d: fsub
      // 06e: fstore 8
      // 070: istore 2
      // 071: getstatic p_c.vvx Lc05;
      // 074: getfield Minecraft.vg8 Ll86;
      // 077: getfield EntityPlayerSP.x5k F
      // 07a: ldc 0.017453292
      // 07c: nop
      // 07d: fmul
      // 07e: ldc -2.3876104
      // 080: nop
      // 081: fsub
      // 082: fstore 9
      // 084: getstatic p_c.vvx Lc05;
      // 087: getfield Minecraft.oxn Lmoh;
      // 08a: getfield moh.mn1 Lm7l;
      // 08d: getfield m7l.m7n Z
      // 090: iload 2
      // 091: ifne 1d8
      // 094: ifeq 1c5
      // 097: goto 09e
      // 09a: invokestatic p_c.a (Loov;)Loov;
      // 09d: athrow
      // 09e: getstatic p_c.vvx Lc05;
      // 0a1: getfield Minecraft.oxn Lmoh;
      // 0a4: getfield moh._70 Lm7l;
      // 0a7: getfield m7l.m7n Z
      // 0aa: iload 2
      // 0ab: ifne 135
      // 0ae: goto 0b5
      // 0b1: invokestatic p_c.a (Loov;)Loov;
      // 0b4: athrow
      // 0b5: ifeq 117
      // 0b8: goto 0bf
      // 0bb: invokestatic p_c.a (Loov;)Loov;
      // 0be: athrow
      // 0bf: getstatic p_c.vvx Lc05;
      // 0c2: getfield Minecraft.oxn Lmoh;
      // 0c5: getfield moh.asx Lm7l;
      // 0c8: getfield m7l.m7n Z
      // 0cb: iload 2
      // 0cc: ifne 135
      // 0cf: goto 0d6
      // 0d2: invokestatic p_c.a (Loov;)Loov;
      // 0d5: athrow
      // 0d6: ifne 117
      // 0d9: goto 0e0
      // 0dc: invokestatic p_c.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: getstatic p_c.vvx Lc05;
      // 0e3: getfield Minecraft.vg8 Ll86;
      // 0e6: dup
      // 0e7: getfield EntityPlayerSP.icv D
      // 0ea: fload 7
      // 0ec: invokestatic fe6.rtn (F)F
      // 0ef: f2d
      // 0f0: dload 0
      // 0f1: dmul
      // 0f2: dsub
      // 0f3: putfield EntityPlayerSP.icv D
      // 0f6: getstatic p_c.vvx Lc05;
      // 0f9: getfield Minecraft.vg8 Ll86;
      // 0fc: dup
      // 0fd: getfield EntityPlayerSP.bw4 D
      // 100: fload 7
      // 102: invokestatic fe6.ssk (F)F
      // 105: f2d
      // 106: dload 0
      // 107: dmul
      // 108: dadd
      // 109: putfield EntityPlayerSP.bw4 D
      // 10c: iload 2
      // 10d: ifeq 47f
      // 110: goto 117
      // 113: invokestatic p_c.a (Loov;)Loov;
      // 116: athrow
      // 117: getstatic p_c.vvx Lc05;
      // 11a: iload 2
      // 11b: ifne 1af
      // 11e: goto 125
      // 121: invokestatic p_c.a (Loov;)Loov;
      // 124: athrow
      // 125: getfield Minecraft.oxn Lmoh;
      // 128: getfield moh.asx Lm7l;
      // 12b: getfield m7l.m7n Z
      // 12e: goto 135
      // 131: invokestatic p_c.a (Loov;)Loov;
      // 134: athrow
      // 135: ifeq 190
      // 138: getstatic p_c.vvx Lc05;
      // 13b: iload 2
      // 13c: ifne 1af
      // 13f: goto 146
      // 142: invokestatic p_c.a (Loov;)Loov;
      // 145: athrow
      // 146: getfield Minecraft.oxn Lmoh;
      // 149: getfield moh._70 Lm7l;
      // 14c: getfield m7l.m7n Z
      // 14f: ifne 190
      // 152: goto 159
      // 155: invokestatic p_c.a (Loov;)Loov;
      // 158: athrow
      // 159: getstatic p_c.vvx Lc05;
      // 15c: getfield Minecraft.vg8 Ll86;
      // 15f: dup
      // 160: getfield EntityPlayerSP.icv D
      // 163: fload 6
      // 165: invokestatic fe6.rtn (F)F
      // 168: f2d
      // 169: dload 0
      // 16a: dmul
      // 16b: dsub
      // 16c: putfield EntityPlayerSP.icv D
      // 16f: getstatic p_c.vvx Lc05;
      // 172: getfield Minecraft.vg8 Ll86;
      // 175: dup
      // 176: getfield EntityPlayerSP.bw4 D
      // 179: fload 6
      // 17b: invokestatic fe6.ssk (F)F
      // 17e: f2d
      // 17f: dload 0
      // 180: dmul
      // 181: dadd
      // 182: putfield EntityPlayerSP.bw4 D
      // 185: iload 2
      // 186: ifeq 47f
      // 189: goto 190
      // 18c: invokestatic p_c.a (Loov;)Loov;
      // 18f: athrow
      // 190: getstatic p_c.vvx Lc05;
      // 193: getfield Minecraft.vg8 Ll86;
      // 196: dup
      // 197: getfield EntityPlayerSP.icv D
      // 19a: fload 3
      // 19b: invokestatic fe6.rtn (F)F
      // 19e: f2d
      // 19f: dload 0
      // 1a0: dmul
      // 1a1: dsub
      // 1a2: putfield EntityPlayerSP.icv D
      // 1a5: getstatic p_c.vvx Lc05;
      // 1a8: goto 1af
      // 1ab: invokestatic p_c.a (Loov;)Loov;
      // 1ae: athrow
      // 1af: getfield Minecraft.vg8 Ll86;
      // 1b2: dup
      // 1b3: getfield EntityPlayerSP.bw4 D
      // 1b6: fload 3
      // 1b7: invokestatic fe6.ssk (F)F
      // 1ba: f2d
      // 1bb: dload 0
      // 1bc: dmul
      // 1bd: dadd
      // 1be: putfield EntityPlayerSP.bw4 D
      // 1c1: iload 2
      // 1c2: ifeq 47f
      // 1c5: getstatic p_c.vvx Lc05;
      // 1c8: getfield Minecraft.oxn Lmoh;
      // 1cb: getfield moh.tup Lm7l;
      // 1ce: getfield m7l.m7n Z
      // 1d1: goto 1d8
      // 1d4: invokestatic p_c.a (Loov;)Loov;
      // 1d7: athrow
      // 1d8: iload 2
      // 1d9: ifne 320
      // 1dc: ifeq 30d
      // 1df: goto 1e6
      // 1e2: invokestatic p_c.a (Loov;)Loov;
      // 1e5: athrow
      // 1e6: getstatic p_c.vvx Lc05;
      // 1e9: getfield Minecraft.oxn Lmoh;
      // 1ec: getfield moh._70 Lm7l;
      // 1ef: getfield m7l.m7n Z
      // 1f2: iload 2
      // 1f3: ifne 27d
      // 1f6: goto 1fd
      // 1f9: invokestatic p_c.a (Loov;)Loov;
      // 1fc: athrow
      // 1fd: ifeq 25f
      // 200: goto 207
      // 203: invokestatic p_c.a (Loov;)Loov;
      // 206: athrow
      // 207: getstatic p_c.vvx Lc05;
      // 20a: getfield Minecraft.oxn Lmoh;
      // 20d: getfield moh.asx Lm7l;
      // 210: getfield m7l.m7n Z
      // 213: iload 2
      // 214: ifne 27d
      // 217: goto 21e
      // 21a: invokestatic p_c.a (Loov;)Loov;
      // 21d: athrow
      // 21e: ifne 25f
      // 221: goto 228
      // 224: invokestatic p_c.a (Loov;)Loov;
      // 227: athrow
      // 228: getstatic p_c.vvx Lc05;
      // 22b: getfield Minecraft.vg8 Ll86;
      // 22e: dup
      // 22f: getfield EntityPlayerSP.icv D
      // 232: fload 8
      // 234: invokestatic fe6.rtn (F)F
      // 237: f2d
      // 238: dload 0
      // 239: dmul
      // 23a: dsub
      // 23b: putfield EntityPlayerSP.icv D
      // 23e: getstatic p_c.vvx Lc05;
      // 241: getfield Minecraft.vg8 Ll86;
      // 244: dup
      // 245: getfield EntityPlayerSP.bw4 D
      // 248: fload 8
      // 24a: invokestatic fe6.ssk (F)F
      // 24d: f2d
      // 24e: dload 0
      // 24f: dmul
      // 250: dadd
      // 251: putfield EntityPlayerSP.bw4 D
      // 254: iload 2
      // 255: ifeq 47f
      // 258: goto 25f
      // 25b: invokestatic p_c.a (Loov;)Loov;
      // 25e: athrow
      // 25f: getstatic p_c.vvx Lc05;
      // 262: iload 2
      // 263: ifne 2f7
      // 266: goto 26d
      // 269: invokestatic p_c.a (Loov;)Loov;
      // 26c: athrow
      // 26d: getfield Minecraft.oxn Lmoh;
      // 270: getfield moh.asx Lm7l;
      // 273: getfield m7l.m7n Z
      // 276: goto 27d
      // 279: invokestatic p_c.a (Loov;)Loov;
      // 27c: athrow
      // 27d: ifeq 2d8
      // 280: getstatic p_c.vvx Lc05;
      // 283: iload 2
      // 284: ifne 2f7
      // 287: goto 28e
      // 28a: invokestatic p_c.a (Loov;)Loov;
      // 28d: athrow
      // 28e: getfield Minecraft.oxn Lmoh;
      // 291: getfield moh._70 Lm7l;
      // 294: getfield m7l.m7n Z
      // 297: ifne 2d8
      // 29a: goto 2a1
      // 29d: invokestatic p_c.a (Loov;)Loov;
      // 2a0: athrow
      // 2a1: getstatic p_c.vvx Lc05;
      // 2a4: getfield Minecraft.vg8 Ll86;
      // 2a7: dup
      // 2a8: getfield EntityPlayerSP.icv D
      // 2ab: fload 9
      // 2ad: invokestatic fe6.rtn (F)F
      // 2b0: f2d
      // 2b1: dload 0
      // 2b2: dmul
      // 2b3: dsub
      // 2b4: putfield EntityPlayerSP.icv D
      // 2b7: getstatic p_c.vvx Lc05;
      // 2ba: getfield Minecraft.vg8 Ll86;
      // 2bd: dup
      // 2be: getfield EntityPlayerSP.bw4 D
      // 2c1: fload 9
      // 2c3: invokestatic fe6.ssk (F)F
      // 2c6: f2d
      // 2c7: dload 0
      // 2c8: dmul
      // 2c9: dadd
      // 2ca: putfield EntityPlayerSP.bw4 D
      // 2cd: iload 2
      // 2ce: ifeq 47f
      // 2d1: goto 2d8
      // 2d4: invokestatic p_c.a (Loov;)Loov;
      // 2d7: athrow
      // 2d8: getstatic p_c.vvx Lc05;
      // 2db: getfield Minecraft.vg8 Ll86;
      // 2de: dup
      // 2df: getfield EntityPlayerSP.icv D
      // 2e2: fload 3
      // 2e3: invokestatic fe6.rtn (F)F
      // 2e6: f2d
      // 2e7: dload 0
      // 2e8: dmul
      // 2e9: dadd
      // 2ea: putfield EntityPlayerSP.icv D
      // 2ed: getstatic p_c.vvx Lc05;
      // 2f0: goto 2f7
      // 2f3: invokestatic p_c.a (Loov;)Loov;
      // 2f6: athrow
      // 2f7: getfield Minecraft.vg8 Ll86;
      // 2fa: dup
      // 2fb: getfield EntityPlayerSP.bw4 D
      // 2fe: fload 3
      // 2ff: invokestatic fe6.ssk (F)F
      // 302: f2d
      // 303: dload 0
      // 304: dmul
      // 305: dsub
      // 306: putfield EntityPlayerSP.bw4 D
      // 309: iload 2
      // 30a: ifeq 47f
      // 30d: getstatic p_c.vvx Lc05;
      // 310: getfield Minecraft.oxn Lmoh;
      // 313: getfield moh._70 Lm7l;
      // 316: getfield m7l.m7n Z
      // 319: goto 320
      // 31c: invokestatic p_c.a (Loov;)Loov;
      // 31f: athrow
      // 320: iload 2
      // 321: ifne 3db
      // 324: ifeq 3c8
      // 327: goto 32e
      // 32a: invokestatic p_c.a (Loov;)Loov;
      // 32d: athrow
      // 32e: getstatic p_c.vvx Lc05;
      // 331: getfield Minecraft.oxn Lmoh;
      // 334: getfield moh.asx Lm7l;
      // 337: getfield m7l.m7n Z
      // 33a: iload 2
      // 33b: ifne 3db
      // 33e: goto 345
      // 341: invokestatic p_c.a (Loov;)Loov;
      // 344: athrow
      // 345: ifne 3c8
      // 348: goto 34f
      // 34b: invokestatic p_c.a (Loov;)Loov;
      // 34e: athrow
      // 34f: getstatic p_c.vvx Lc05;
      // 352: getfield Minecraft.oxn Lmoh;
      // 355: getfield moh.mn1 Lm7l;
      // 358: getfield m7l.m7n Z
      // 35b: iload 2
      // 35c: ifne 3db
      // 35f: goto 366
      // 362: invokestatic p_c.a (Loov;)Loov;
      // 365: athrow
      // 366: ifne 3c8
      // 369: goto 370
      // 36c: invokestatic p_c.a (Loov;)Loov;
      // 36f: athrow
      // 370: getstatic p_c.vvx Lc05;
      // 373: getfield Minecraft.oxn Lmoh;
      // 376: getfield moh.tup Lm7l;
      // 379: getfield m7l.m7n Z
      // 37c: iload 2
      // 37d: ifne 3db
      // 380: goto 387
      // 383: invokestatic p_c.a (Loov;)Loov;
      // 386: athrow
      // 387: ifne 3c8
      // 38a: goto 391
      // 38d: invokestatic p_c.a (Loov;)Loov;
      // 390: athrow
      // 391: getstatic p_c.vvx Lc05;
      // 394: getfield Minecraft.vg8 Ll86;
      // 397: dup
      // 398: getfield EntityPlayerSP.icv D
      // 39b: fload 4
      // 39d: invokestatic fe6.rtn (F)F
      // 3a0: f2d
      // 3a1: dload 0
      // 3a2: dmul
      // 3a3: dadd
      // 3a4: putfield EntityPlayerSP.icv D
      // 3a7: getstatic p_c.vvx Lc05;
      // 3aa: getfield Minecraft.vg8 Ll86;
      // 3ad: dup
      // 3ae: getfield EntityPlayerSP.bw4 D
      // 3b1: fload 4
      // 3b3: invokestatic fe6.ssk (F)F
      // 3b6: f2d
      // 3b7: dload 0
      // 3b8: dmul
      // 3b9: dsub
      // 3ba: putfield EntityPlayerSP.bw4 D
      // 3bd: iload 2
      // 3be: ifeq 47f
      // 3c1: goto 3c8
      // 3c4: invokestatic p_c.a (Loov;)Loov;
      // 3c7: athrow
      // 3c8: getstatic p_c.vvx Lc05;
      // 3cb: getfield Minecraft.oxn Lmoh;
      // 3ce: getfield moh.asx Lm7l;
      // 3d1: getfield m7l.m7n Z
      // 3d4: goto 3db
      // 3d7: invokestatic p_c.a (Loov;)Loov;
      // 3da: athrow
      // 3db: iload 2
      // 3dc: ifne 3fc
      // 3df: ifeq 47f
      // 3e2: goto 3e9
      // 3e5: invokestatic p_c.a (Loov;)Loov;
      // 3e8: athrow
      // 3e9: getstatic p_c.vvx Lc05;
      // 3ec: getfield Minecraft.oxn Lmoh;
      // 3ef: getfield moh._70 Lm7l;
      // 3f2: getfield m7l.m7n Z
      // 3f5: goto 3fc
      // 3f8: invokestatic p_c.a (Loov;)Loov;
      // 3fb: athrow
      // 3fc: iload 2
      // 3fd: ifne 41d
      // 400: ifne 47f
      // 403: goto 40a
      // 406: invokestatic p_c.a (Loov;)Loov;
      // 409: athrow
      // 40a: getstatic p_c.vvx Lc05;
      // 40d: getfield Minecraft.oxn Lmoh;
      // 410: getfield moh.mn1 Lm7l;
      // 413: getfield m7l.m7n Z
      // 416: goto 41d
      // 419: invokestatic p_c.a (Loov;)Loov;
      // 41c: athrow
      // 41d: iload 2
      // 41e: ifne 449
      // 421: ifne 47f
      // 424: goto 42b
      // 427: invokestatic p_c.a (Loov;)Loov;
      // 42a: athrow
      // 42b: getstatic p_c.vvx Lc05;
      // 42e: iload 2
      // 42f: ifne 46c
      // 432: goto 439
      // 435: invokestatic p_c.a (Loov;)Loov;
      // 438: athrow
      // 439: getfield Minecraft.oxn Lmoh;
      // 43c: getfield moh.tup Lm7l;
      // 43f: getfield m7l.m7n Z
      // 442: goto 449
      // 445: invokestatic p_c.a (Loov;)Loov;
      // 448: athrow
      // 449: ifne 47f
      // 44c: getstatic p_c.vvx Lc05;
      // 44f: getfield Minecraft.vg8 Ll86;
      // 452: dup
      // 453: getfield EntityPlayerSP.icv D
      // 456: fload 5
      // 458: invokestatic fe6.rtn (F)F
      // 45b: f2d
      // 45c: dload 0
      // 45d: dmul
      // 45e: dadd
      // 45f: putfield EntityPlayerSP.icv D
      // 462: getstatic p_c.vvx Lc05;
      // 465: goto 46c
      // 468: invokestatic p_c.a (Loov;)Loov;
      // 46b: athrow
      // 46c: getfield Minecraft.vg8 Ll86;
      // 46f: dup
      // 470: getfield EntityPlayerSP.bw4 D
      // 473: fload 5
      // 475: invokestatic fe6.ssk (F)F
      // 478: f2d
      // 479: dload 0
      // 47a: dmul
      // 47b: dsub
      // 47c: putfield EntityPlayerSP.bw4 D
      // 47f: return
   }

   public static void u7g(double var0) {
      uue(var0, vvx.vg8.x5k);
   }

   public static void uue(double param0, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_c.vvx Lc05;
      // 003: getfield Minecraft.vg8 Ll86;
      // 006: getfield EntityPlayerSP.g9g Lboa;
      // 009: getfield boa._mw F
      // 00c: f2d
      // 00d: dstore 4
      // 00f: invokestatic OpaquePredicate.c ()I
      // 012: getstatic p_c.vvx Lc05;
      // 015: getfield Minecraft.vg8 Ll86;
      // 018: getfield EntityPlayerSP.g9g Lboa;
      // 01b: getfield boa.lrp F
      // 01e: f2d
      // 01f: dstore 6
      // 021: istore 3
      // 022: dload 4
      // 024: dconst_0
      // 025: dcmpl
      // 026: iload 3
      // 027: ifne 077
      // 02a: ifne 06c
      // 02d: goto 034
      // 030: invokestatic p_c.a (Loov;)Loov;
      // 033: athrow
      // 034: dload 6
      // 036: dconst_0
      // 037: dcmpl
      // 038: iload 3
      // 039: ifne 077
      // 03c: goto 043
      // 03f: invokestatic p_c.a (Loov;)Loov;
      // 042: athrow
      // 043: ifne 06c
      // 046: goto 04d
      // 049: invokestatic p_c.a (Loov;)Loov;
      // 04c: athrow
      // 04d: getstatic p_c.vvx Lc05;
      // 050: getfield Minecraft.vg8 Ll86;
      // 053: dconst_0
      // 054: putfield EntityPlayerSP.icv D
      // 057: getstatic p_c.vvx Lc05;
      // 05a: getfield Minecraft.vg8 Ll86;
      // 05d: dconst_0
      // 05e: putfield EntityPlayerSP.bw4 D
      // 061: iload 3
      // 062: ifeq 195
      // 065: goto 06c
      // 068: invokestatic p_c.a (Loov;)Loov;
      // 06b: athrow
      // 06c: dload 4
      // 06e: dconst_0
      // 06f: dcmpl
      // 070: goto 077
      // 073: invokestatic p_c.a (Loov;)Loov;
      // 076: athrow
      // 077: iload 3
      // 078: ifne 090
      // 07b: ifeq 13d
      // 07e: goto 085
      // 081: invokestatic p_c.a (Loov;)Loov;
      // 084: athrow
      // 085: dload 6
      // 087: dconst_0
      // 088: dcmpl
      // 089: goto 090
      // 08c: invokestatic p_c.a (Loov;)Loov;
      // 08f: athrow
      // 090: iload 3
      // 091: ifne 0d1
      // 094: ifle 0c6
      // 097: goto 09e
      // 09a: invokestatic p_c.a (Loov;)Loov;
      // 09d: athrow
      // 09e: fload 2
      // 09f: dload 4
      // 0a1: dconst_0
      // 0a2: dcmpl
      // 0a3: iload 3
      // 0a4: ifne 0ba
      // 0a7: goto 0ae
      // 0aa: invokestatic p_c.a (Loov;)Loov;
      // 0ad: athrow
      // 0ae: ifle 0bd
      // 0b1: goto 0b8
      // 0b4: invokestatic p_c.a (Loov;)Loov;
      // 0b7: athrow
      // 0b8: bipush -45
      // 0ba: goto 0bf
      // 0bd: bipush 45
      // 0bf: i2f
      // 0c0: fadd
      // 0c1: fstore 2
      // 0c2: iload 3
      // 0c3: ifeq 103
      // 0c6: dload 6
      // 0c8: dconst_0
      // 0c9: dcmpg
      // 0ca: goto 0d1
      // 0cd: invokestatic p_c.a (Loov;)Loov;
      // 0d0: athrow
      // 0d1: iload 3
      // 0d2: ifne 10a
      // 0d5: ifge 103
      // 0d8: goto 0df
      // 0db: invokestatic p_c.a (Loov;)Loov;
      // 0de: athrow
      // 0df: fload 2
      // 0e0: dload 4
      // 0e2: dconst_0
      // 0e3: dcmpl
      // 0e4: iload 3
      // 0e5: ifne 0fb
      // 0e8: goto 0ef
      // 0eb: invokestatic p_c.a (Loov;)Loov;
      // 0ee: athrow
      // 0ef: ifle 0fe
      // 0f2: goto 0f9
      // 0f5: invokestatic p_c.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: bipush 45
      // 0fb: goto 100
      // 0fe: bipush -45
      // 100: i2f
      // 101: fadd
      // 102: fstore 2
      // 103: dconst_0
      // 104: dstore 6
      // 106: dload 4
      // 108: dconst_0
      // 109: dcmpl
      // 10a: iload 3
      // 10b: ifne 135
      // 10e: ifle 11f
      // 111: goto 118
      // 114: invokestatic p_c.a (Loov;)Loov;
      // 117: athrow
      // 118: dconst_1
      // 119: dstore 4
      // 11b: iload 3
      // 11c: ifeq 13d
      // 11f: dload 4
      // 121: iload 3
      // 122: ifne 13b
      // 125: goto 12c
      // 128: invokestatic p_c.a (Loov;)Loov;
      // 12b: athrow
      // 12c: dconst_0
      // 12d: dcmpg
      // 12e: goto 135
      // 131: invokestatic p_c.a (Loov;)Loov;
      // 134: athrow
      // 135: ifge 13d
      // 138: ldc2_w -1.0
      // 13b: dstore 4
      // 13d: getstatic p_c.vvx Lc05;
      // 140: getfield Minecraft.vg8 Ll86;
      // 143: dload 4
      // 145: dload 0
      // 146: dmul
      // 147: fload 2
      // 148: ldc 90.0
      // 14a: nop
      // 14b: fadd
      // 14c: f2d
      // 14d: invokestatic java/lang/Math.toRadians (D)D
      // 150: invokestatic java/lang/Math.cos (D)D
      // 153: dmul
      // 154: dload 6
      // 156: dload 0
      // 157: dmul
      // 158: fload 2
      // 159: ldc 90.0
      // 15b: nop
      // 15c: fadd
      // 15d: f2d
      // 15e: invokestatic java/lang/Math.toRadians (D)D
      // 161: invokestatic java/lang/Math.sin (D)D
      // 164: dmul
      // 165: dadd
      // 166: putfield EntityPlayerSP.icv D
      // 169: getstatic p_c.vvx Lc05;
      // 16c: getfield Minecraft.vg8 Ll86;
      // 16f: dload 4
      // 171: dload 0
      // 172: dmul
      // 173: fload 2
      // 174: ldc 90.0
      // 176: nop
      // 177: fadd
      // 178: f2d
      // 179: invokestatic java/lang/Math.toRadians (D)D
      // 17c: invokestatic java/lang/Math.sin (D)D
      // 17f: dmul
      // 180: dload 6
      // 182: dload 0
      // 183: dmul
      // 184: fload 2
      // 185: ldc 90.0
      // 187: nop
      // 188: fadd
      // 189: f2d
      // 18a: invokestatic java/lang/Math.toRadians (D)D
      // 18d: invokestatic java/lang/Math.cos (D)D
      // 190: dmul
      // 191: dsub
      // 192: putfield EntityPlayerSP.bw4 D
      // 195: return
   }

   public static boolean o4j(double param0, double param2, double param4, double param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: getstatic p_c.vvx Lc05;
      // 003: getfield Minecraft.vg8 Ll86;
      // 006: getfield EntityPlayerSP.o2v D
      // 009: dload 0
      // 00a: dsub
      // 00b: dstore 9
      // 00d: getstatic p_c.vvx Lc05;
      // 010: getfield Minecraft.vg8 Ll86;
      // 013: getfield EntityPlayerSP.kfp D
      // 016: dload 2
      // 017: dsub
      // 018: dstore 11
      // 01a: getstatic p_c.vvx Lc05;
      // 01d: getfield Minecraft.vg8 Ll86;
      // 020: getfield EntityPlayerSP.vbd D
      // 023: dload 4
      // 025: dsub
      // 026: dstore 13
      // 028: invokestatic OpaquePredicate.b ()I
      // 02b: getstatic p_c.vvx Lc05;
      // 02e: getfield Minecraft.vg8 Ll86;
      // 031: dload 0
      // 032: dload 2
      // 033: dload 4
      // 035: invokevirtual EntityPlayerSP.p53 (DDD)D
      // 038: invokestatic java/lang/Math.sqrt (D)D
      // 03b: dstore 15
      // 03d: istore 8
      // 03f: dload 6
      // 041: dstore 17
      // 043: dload 15
      // 045: dload 17
      // 047: ddiv
      // 048: ldc2_w 0.49999999999
      // 04b: dadd
      // 04c: invokestatic java/lang/Math.round (D)J
      // 04f: lconst_1
      // 050: lsub
      // 051: l2d
      // 052: dstore 19
      // 054: getstatic p_c.vvx Lc05;
      // 057: getfield Minecraft.vg8 Ll86;
      // 05a: getfield EntityPlayerSP.o2v D
      // 05d: dstore 21
      // 05f: getstatic p_c.vvx Lc05;
      // 062: getfield Minecraft.vg8 Ll86;
      // 065: getfield EntityPlayerSP.kfp D
      // 068: dstore 23
      // 06a: getstatic p_c.vvx Lc05;
      // 06d: getfield Minecraft.vg8 Ll86;
      // 070: getfield EntityPlayerSP.vbd D
      // 073: dstore 25
      // 075: bipush 1
      // 076: istore 27
      // 078: iload 27
      // 07a: i2d
      // 07b: dload 19
      // 07d: dcmpg
      // 07e: ifge 12f
      // 081: dload 0
      // 082: getstatic p_c.vvx Lc05;
      // 085: getfield Minecraft.vg8 Ll86;
      // 088: getfield EntityPlayerSP.o2v D
      // 08b: dsub
      // 08c: dload 19
      // 08e: ddiv
      // 08f: dstore 28
      // 091: dload 21
      // 093: dload 28
      // 095: dadd
      // 096: dstore 21
      // 098: dload 4
      // 09a: getstatic p_c.vvx Lc05;
      // 09d: getfield Minecraft.vg8 Ll86;
      // 0a0: getfield EntityPlayerSP.vbd D
      // 0a3: dsub
      // 0a4: dload 19
      // 0a6: ddiv
      // 0a7: dstore 30
      // 0a9: dload 25
      // 0ab: dload 30
      // 0ad: dadd
      // 0ae: dstore 25
      // 0b0: dload 2
      // 0b1: getstatic p_c.vvx Lc05;
      // 0b4: getfield Minecraft.vg8 Ll86;
      // 0b7: getfield EntityPlayerSP.kfp D
      // 0ba: dsub
      // 0bb: dload 19
      // 0bd: ddiv
      // 0be: dstore 32
      // 0c0: dload 23
      // 0c2: dload 32
      // 0c4: dadd
      // 0c5: dstore 23
      // 0c7: new nh4
      // 0ca: dup
      // 0cb: dload 21
      // 0cd: ldc2_w 0.3
      // 0d0: dsub
      // 0d1: dload 23
      // 0d3: dload 25
      // 0d5: ldc2_w 0.3
      // 0d8: dsub
      // 0d9: dload 21
      // 0db: ldc2_w 0.3
      // 0de: dadd
      // 0df: dload 23
      // 0e1: ldc2_w 1.8
      // 0e4: dadd
      // 0e5: dload 25
      // 0e7: ldc2_w 0.3
      // 0ea: dadd
      // 0eb: invokespecial nh4.<init> (DDDDDD)V
      // 0ee: astore 34
      // 0f0: iload 8
      // 0f2: ifeq 12a
      // 0f5: getstatic p_c.vvx Lc05;
      // 0f8: getfield Minecraft.tij Lkh3;
      // 0fb: getstatic p_c.vvx Lc05;
      // 0fe: getfield Minecraft.vg8 Ll86;
      // 101: aload 34
      // 103: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 106: invokeinterface java/util/List.isEmpty ()Z 1
      // 10b: iload 8
      // 10d: ifeq 130
      // 110: goto 117
      // 113: invokestatic p_c.a (Loov;)Loov;
      // 116: athrow
      // 117: ifne 127
      // 11a: goto 121
      // 11d: invokestatic p_c.a (Loov;)Loov;
      // 120: athrow
      // 121: bipush 0
      // 122: ireturn
      // 123: invokestatic p_c.a (Loov;)Loov;
      // 126: athrow
      // 127: iinc 27 1
      // 12a: iload 8
      // 12c: ifne 078
      // 12f: bipush 1
      // 130: ireturn
   }

   public static boolean xec(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 2
      // 04: getstatic p_c.vvx Lc05;
      // 07: getfield Minecraft.tij Lkh3;
      // 0a: getstatic p_c.vvx Lc05;
      // 0d: getfield Minecraft.vg8 Ll86;
      // 10: getstatic p_c.vvx Lc05;
      // 13: getfield Minecraft.vg8 Ll86;
      // 16: invokevirtual EntityPlayerSP.aaw ()Lnh4;
      // 19: dconst_0
      // 1a: dload 0
      // 1b: dneg
      // 1c: dconst_0
      // 1d: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 20: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 23: invokeinterface java/util/List.isEmpty ()Z 1
      // 28: iload 2
      // 29: ifne 3d
      // 2c: ifne 3c
      // 2f: goto 36
      // 32: invokestatic p_c.a (Loov;)Loov;
      // 35: athrow
      // 36: bipush 1
      // 37: ireturn
      // 38: invokestatic p_c.a (Loov;)Loov;
      // 3b: athrow
      // 3c: bipush 0
      // 3d: ireturn
   }

   public static boolean tuy(EntityLivingBase param0, double param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 3
      // 04: getstatic p_c.vvx Lc05;
      // 07: getfield Minecraft.tij Lkh3;
      // 0a: aload 0
      // 0b: aload 0
      // 0c: invokevirtual EntityLivingBase.aaw ()Lnh4;
      // 0f: dconst_0
      // 10: dload 1
      // 11: dneg
      // 12: dconst_0
      // 13: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 16: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 19: invokeinterface java/util/List.isEmpty ()Z 1
      // 1e: iload 3
      // 1f: ifne 33
      // 22: ifne 32
      // 25: goto 2c
      // 28: invokestatic p_c.a (Loov;)Loov;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: ireturn
      // 2e: invokestatic p_c.a (Loov;)Loov;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
   }

   public static int vmu() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 0
      // 04: getstatic p_c.vvx Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: getstatic mcs.y0p Lmcs;
      // 0d: invokevirtual EntityPlayerSP.cab (Lmcs;)Z
      // 10: iload 0
      // 11: ifne 35
      // 14: ifeq 34
      // 17: goto 1e
      // 1a: invokestatic p_c.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic p_c.vvx Lc05;
      // 21: getfield Minecraft.vg8 Ll86;
      // 24: getstatic mcs.y0p Lmcs;
      // 27: invokevirtual EntityPlayerSP.dhd (Lmcs;)Lsdj;
      // 2a: invokevirtual sdj.tus ()I
      // 2d: bipush 1
      // 2e: iadd
      // 2f: ireturn
      // 30: invokestatic p_c.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
   }

   public static int vvc() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: getstatic p_c.vvx Lc05;
      // 07: getfield Minecraft.vg8 Ll86;
      // 0a: getstatic mcs.uwx Lmcs;
      // 0d: invokevirtual EntityPlayerSP.cab (Lmcs;)Z
      // 10: iload 0
      // 11: ifeq 35
      // 14: ifeq 34
      // 17: goto 1e
      // 1a: invokestatic p_c.a (Loov;)Loov;
      // 1d: athrow
      // 1e: getstatic p_c.vvx Lc05;
      // 21: getfield Minecraft.vg8 Ll86;
      // 24: getstatic mcs.uwx Lmcs;
      // 27: invokevirtual EntityPlayerSP.dhd (Lmcs;)Lsdj;
      // 2a: invokevirtual sdj.tus ()I
      // 2d: bipush 1
      // 2e: iadd
      // 2f: ireturn
      // 30: invokestatic p_c.a (Loov;)Loov;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
   }

   public static int zsg(ha9 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 1
      // 04: aload 0
      // 05: getstatic mcs.uwx Lmcs;
      // 08: invokevirtual ha9.cab (Lmcs;)Z
      // 0b: iload 1
      // 0c: ifne 2b
      // 0f: ifeq 2a
      // 12: goto 19
      // 15: invokestatic p_c.a (Loov;)Loov;
      // 18: athrow
      // 19: aload 0
      // 1a: getstatic mcs.uwx Lmcs;
      // 1d: invokevirtual ha9.dhd (Lmcs;)Lsdj;
      // 20: invokevirtual sdj.tus ()I
      // 23: bipush 1
      // 24: iadd
      // 25: ireturn
      // 26: invokestatic p_c.a (Loov;)Loov;
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
   }

   public static e0x dn6(ha9 var0, double var1) {
      return Minecraft.vz1().tij.getBlockState(new mew(var0.o2v, var0.kfp - var1, var0.vbd)).r_y();
   }

   public static e0x _x9(double var0, double var2, double var4) {
      EntityPlayerSP var6 = Minecraft.vz1().vg8;
      return Minecraft.vz1().tij.getBlockState(new mew(var6.o2v + var0, var6.kfp + var2, var6.vbd + var4)).r_y();
   }

   public static float dq3(EntityLivingBase param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 1
      // 004: getstatic p_c.vvx Lc05;
      // 007: getfield Minecraft.vg8 Ll86;
      // 00a: iload 1
      // 00b: ifne 040
      // 00e: getfield EntityPlayerSP.fcv Z
      // 011: ifeq 03f
      // 014: goto 01b
      // 017: invokestatic p_c.a (Loov;)Loov;
      // 01a: athrow
      // 01b: getstatic p_c.vvx Lc05;
      // 01e: getfield Minecraft.vg8 Ll86;
      // 021: iload 1
      // 022: ifne 040
      // 025: goto 02c
      // 028: invokestatic p_c.a (Loov;)Loov;
      // 02b: athrow
      // 02c: getfield EntityPlayerSP.lfk Z
      // 02f: ifeq 03f
      // 032: goto 039
      // 035: invokestatic p_c.a (Loov;)Loov;
      // 038: athrow
      // 039: fconst_0
      // 03a: freturn
      // 03b: invokestatic p_c.a (Loov;)Loov;
      // 03e: athrow
      // 03f: aload 0
      // 040: getfield EntityLivingBase.kfp D
      // 043: d2f
      // 044: fstore 2
      // 045: fload 2
      // 046: fconst_0
      // 047: fcmpl
      // 048: ifle 351
      // 04b: bipush 13
      // 04d: newarray 10
      // 04f: dup
      // 050: bipush 0
      // 051: bipush 53
      // 053: iastore
      // 054: dup
      // 055: bipush 1
      // 056: bipush 67
      // 058: iastore
      // 059: dup
      // 05a: bipush 2
      // 05b: bipush 108
      // 05d: iastore
      // 05e: dup
      // 05f: bipush 3
      // 060: bipush 109
      // 062: iastore
      // 063: dup
      // 064: bipush 4
      // 065: bipush 114
      // 067: iastore
      // 068: dup
      // 069: bipush 5
      // 06a: sipush 128
      // 06d: iastore
      // 06e: dup
      // 06f: bipush 6
      // 071: sipush 134
      // 074: iastore
      // 075: dup
      // 076: bipush 7
      // 078: sipush 135
      // 07b: iastore
      // 07c: dup
      // 07d: bipush 8
      // 07f: sipush 136
      // 082: iastore
      // 083: dup
      // 084: bipush 9
      // 086: sipush 156
      // 089: iastore
      // 08a: dup
      // 08b: bipush 10
      // 08d: sipush 163
      // 090: iastore
      // 091: dup
      // 092: bipush 11
      // 094: sipush 164
      // 097: iastore
      // 098: dup
      // 099: bipush 12
      // 09b: sipush 180
      // 09e: iastore
      // 09f: astore 3
      // 0a0: bipush 45
      // 0a2: newarray 10
      // 0a4: dup
      // 0a5: bipush 0
      // 0a6: bipush 6
      // 0a8: iastore
      // 0a9: dup
      // 0aa: bipush 1
      // 0ab: bipush 27
      // 0ad: iastore
      // 0ae: dup
      // 0af: bipush 2
      // 0b0: bipush 28
      // 0b2: iastore
      // 0b3: dup
      // 0b4: bipush 3
      // 0b5: bipush 30
      // 0b7: iastore
      // 0b8: dup
      // 0b9: bipush 4
      // 0ba: bipush 31
      // 0bc: iastore
      // 0bd: dup
      // 0be: bipush 5
      // 0bf: bipush 32
      // 0c1: iastore
      // 0c2: dup
      // 0c3: bipush 6
      // 0c5: bipush 37
      // 0c7: iastore
      // 0c8: dup
      // 0c9: bipush 7
      // 0cb: bipush 38
      // 0cd: iastore
      // 0ce: dup
      // 0cf: bipush 8
      // 0d1: bipush 39
      // 0d3: iastore
      // 0d4: dup
      // 0d5: bipush 9
      // 0d7: bipush 40
      // 0d9: iastore
      // 0da: dup
      // 0db: bipush 10
      // 0dd: bipush 50
      // 0df: iastore
      // 0e0: dup
      // 0e1: bipush 11
      // 0e3: bipush 51
      // 0e5: iastore
      // 0e6: dup
      // 0e7: bipush 12
      // 0e9: bipush 55
      // 0eb: iastore
      // 0ec: dup
      // 0ed: bipush 13
      // 0ef: bipush 59
      // 0f1: iastore
      // 0f2: dup
      // 0f3: bipush 14
      // 0f5: bipush 63
      // 0f7: iastore
      // 0f8: dup
      // 0f9: bipush 15
      // 0fb: bipush 65
      // 0fd: iastore
      // 0fe: dup
      // 0ff: bipush 16
      // 101: bipush 66
      // 103: iastore
      // 104: dup
      // 105: bipush 17
      // 107: bipush 68
      // 109: iastore
      // 10a: dup
      // 10b: bipush 18
      // 10d: bipush 69
      // 10f: iastore
      // 110: dup
      // 111: bipush 19
      // 113: bipush 70
      // 115: iastore
      // 116: dup
      // 117: bipush 20
      // 119: bipush 72
      // 11b: iastore
      // 11c: dup
      // 11d: bipush 21
      // 11f: bipush 75
      // 121: iastore
      // 122: dup
      // 123: bipush 22
      // 125: bipush 76
      // 127: iastore
      // 128: dup
      // 129: bipush 23
      // 12b: bipush 77
      // 12d: iastore
      // 12e: dup
      // 12f: bipush 24
      // 131: bipush 83
      // 133: iastore
      // 134: dup
      // 135: bipush 25
      // 137: bipush 92
      // 139: iastore
      // 13a: dup
      // 13b: bipush 26
      // 13d: bipush 93
      // 13f: iastore
      // 140: dup
      // 141: bipush 27
      // 143: bipush 94
      // 145: iastore
      // 146: dup
      // 147: bipush 28
      // 149: bipush 104
      // 14b: iastore
      // 14c: dup
      // 14d: bipush 29
      // 14f: bipush 105
      // 151: iastore
      // 152: dup
      // 153: bipush 30
      // 155: bipush 106
      // 157: iastore
      // 158: dup
      // 159: bipush 31
      // 15b: bipush 115
      // 15d: iastore
      // 15e: dup
      // 15f: bipush 32
      // 161: bipush 119
      // 163: iastore
      // 164: dup
      // 165: bipush 33
      // 167: sipush 131
      // 16a: iastore
      // 16b: dup
      // 16c: bipush 34
      // 16e: sipush 132
      // 171: iastore
      // 172: dup
      // 173: bipush 35
      // 175: sipush 143
      // 178: iastore
      // 179: dup
      // 17a: bipush 36
      // 17c: sipush 147
      // 17f: iastore
      // 180: dup
      // 181: bipush 37
      // 183: sipush 148
      // 186: iastore
      // 187: dup
      // 188: bipush 38
      // 18a: sipush 149
      // 18d: iastore
      // 18e: dup
      // 18f: bipush 39
      // 191: sipush 150
      // 194: iastore
      // 195: dup
      // 196: bipush 40
      // 198: sipush 157
      // 19b: iastore
      // 19c: dup
      // 19d: bipush 41
      // 19f: sipush 171
      // 1a2: iastore
      // 1a3: dup
      // 1a4: bipush 42
      // 1a6: sipush 175
      // 1a9: iastore
      // 1aa: dup
      // 1ab: bipush 43
      // 1ad: sipush 176
      // 1b0: iastore
      // 1b1: dup
      // 1b2: bipush 44
      // 1b4: sipush 177
      // 1b7: iastore
      // 1b8: astore 4
      // 1ba: getstatic p_c.vvx Lc05;
      // 1bd: getfield Minecraft.tij Lkh3;
      // 1c0: new mew
      // 1c3: dup
      // 1c4: aload 0
      // 1c5: getfield EntityLivingBase.o2v D
      // 1c8: fload 2
      // 1c9: fconst_1
      // 1ca: fsub
      // 1cb: f2d
      // 1cc: aload 0
      // 1cd: getfield EntityLivingBase.vbd D
      // 1d0: invokespecial mew.<init> (DDD)V
      // 1d3: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 1d6: invokeinterface zfz.r_y ()Le0x; 1
      // 1db: astore 5
      // 1dd: iload 1
      // 1de: ifne 34d
      // 1e1: aload 5
      // 1e3: instanceof n47
      // 1e6: ifne 349
      // 1e9: goto 1f0
      // 1ec: invokestatic p_c.a (Loov;)Loov;
      // 1ef: athrow
      // 1f0: aload 5
      // 1f2: invokestatic e0x.mxb (Le0x;)I
      // 1f5: iload 1
      // 1f6: ifne 248
      // 1f9: goto 200
      // 1fc: invokestatic p_c.a (Loov;)Loov;
      // 1ff: athrow
      // 200: bipush 44
      // 202: if_icmpeq 228
      // 205: goto 20c
      // 208: invokestatic p_c.a (Loov;)Loov;
      // 20b: athrow
      // 20c: aload 5
      // 20e: invokestatic e0x.mxb (Le0x;)I
      // 211: iload 1
      // 212: ifne 248
      // 215: goto 21c
      // 218: invokestatic p_c.a (Loov;)Loov;
      // 21b: athrow
      // 21c: bipush 126
      // 21e: if_icmpne 260
      // 221: goto 228
      // 224: invokestatic p_c.a (Loov;)Loov;
      // 227: athrow
      // 228: aload 0
      // 229: getfield EntityLivingBase.kfp D
      // 22c: fload 2
      // 22d: f2d
      // 22e: dsub
      // 22f: ldc2_w 0.5
      // 232: dsub
      // 233: iload 1
      // 234: ifne 25e
      // 237: goto 23e
      // 23a: invokestatic p_c.a (Loov;)Loov;
      // 23d: athrow
      // 23e: d2f
      // 23f: fconst_0
      // 240: fcmpg
      // 241: goto 248
      // 244: invokestatic p_c.a (Loov;)Loov;
      // 247: athrow
      // 248: ifge 253
      // 24b: fconst_0
      // 24c: goto 25f
      // 24f: invokestatic p_c.a (Loov;)Loov;
      // 252: athrow
      // 253: aload 0
      // 254: getfield EntityLivingBase.kfp D
      // 257: fload 2
      // 258: f2d
      // 259: dsub
      // 25a: ldc2_w 0.5
      // 25d: dsub
      // 25e: d2f
      // 25f: freturn
      // 260: aload 3
      // 261: dup
      // 262: astore 6
      // 264: arraylength
      // 265: istore 7
      // 267: bipush 0
      // 268: istore 8
      // 26a: iload 8
      // 26c: iload 7
      // 26e: if_icmpge 2d3
      // 271: aload 6
      // 273: iload 8
      // 275: iaload
      // 276: istore 9
      // 278: iload 1
      // 279: ifne 2cf
      // 27c: aload 5
      // 27e: invokestatic e0x.mxb (Le0x;)I
      // 281: iload 9
      // 283: iload 1
      // 284: ifne 2e2
      // 287: goto 28e
      // 28a: invokestatic p_c.a (Loov;)Loov;
      // 28d: athrow
      // 28e: if_icmpne 2cc
      // 291: goto 298
      // 294: invokestatic p_c.a (Loov;)Loov;
      // 297: athrow
      // 298: aload 0
      // 299: getfield EntityLivingBase.kfp D
      // 29c: fload 2
      // 29d: f2d
      // 29e: dsub
      // 29f: dconst_1
      // 2a0: dsub
      // 2a1: iload 1
      // 2a2: ifne 2ca
      // 2a5: goto 2ac
      // 2a8: invokestatic p_c.a (Loov;)Loov;
      // 2ab: athrow
      // 2ac: d2f
      // 2ad: fconst_0
      // 2ae: fcmpg
      // 2af: ifge 2c1
      // 2b2: goto 2b9
      // 2b5: invokestatic p_c.a (Loov;)Loov;
      // 2b8: athrow
      // 2b9: fconst_0
      // 2ba: goto 2cb
      // 2bd: invokestatic p_c.a (Loov;)Loov;
      // 2c0: athrow
      // 2c1: aload 0
      // 2c2: getfield EntityLivingBase.kfp D
      // 2c5: fload 2
      // 2c6: f2d
      // 2c7: dsub
      // 2c8: dconst_1
      // 2c9: dsub
      // 2ca: d2f
      // 2cb: freturn
      // 2cc: iinc 8 1
      // 2cf: iload 1
      // 2d0: ifeq 26a
      // 2d3: aload 4
      // 2d5: dup
      // 2d6: astore 6
      // 2d8: arraylength
      // 2d9: istore 7
      // 2db: bipush 0
      // 2dc: istore 8
      // 2de: iload 8
      // 2e0: iload 7
      // 2e2: if_icmpge 338
      // 2e5: aload 6
      // 2e7: iload 8
      // 2e9: iaload
      // 2ea: istore 9
      // 2ec: iload 1
      // 2ed: ifne 334
      // 2f0: aload 5
      // 2f2: invokestatic e0x.mxb (Le0x;)I
      // 2f5: iload 9
      // 2f7: if_icmpne 331
      // 2fa: goto 301
      // 2fd: invokestatic p_c.a (Loov;)Loov;
      // 300: athrow
      // 301: aload 0
      // 302: getfield EntityLivingBase.kfp D
      // 305: fload 2
      // 306: f2d
      // 307: dsub
      // 308: iload 1
      // 309: ifne 32f
      // 30c: goto 313
      // 30f: invokestatic p_c.a (Loov;)Loov;
      // 312: athrow
      // 313: d2f
      // 314: fconst_0
      // 315: fcmpg
      // 316: ifge 328
      // 319: goto 320
      // 31c: invokestatic p_c.a (Loov;)Loov;
      // 31f: athrow
      // 320: fconst_0
      // 321: goto 330
      // 324: invokestatic p_c.a (Loov;)Loov;
      // 327: athrow
      // 328: aload 0
      // 329: getfield EntityLivingBase.kfp D
      // 32c: fload 2
      // 32d: f2d
      // 32e: dsub
      // 32f: d2f
      // 330: freturn
      // 331: iinc 8 1
      // 334: iload 1
      // 335: ifeq 2de
      // 338: aload 0
      // 339: getfield EntityLivingBase.kfp D
      // 33c: fload 2
      // 33d: f2d
      // 33e: dsub
      // 33f: aload 5
      // 341: invokevirtual e0x.vn4 ()D
      // 344: dadd
      // 345: dconst_1
      // 346: dsub
      // 347: d2f
      // 348: freturn
      // 349: fload 2
      // 34a: fconst_1
      // 34b: fsub
      // 34c: fstore 2
      // 34d: iload 1
      // 34e: ifeq 045
      // 351: fconst_0
      // 352: freturn
   }

   public static float[] xw8(mew var0, vt2 var1) {
      double var3 = (double)var0.getX() + 0.5 - vvx.vg8.o2v + (double)var1.n67() / 2.0;
      double var5 = (double)var0.getZ() + 0.5 - vvx.vg8.vbd + (double)var1.ozy() / 2.0;
      double var7 = (double)var0.getY() + 0.5;
      int var10000 = OpaquePredicate.c();
      double var9 = vvx.vg8.kfp + (double)vvx.vg8.c5y() - var7;
      int var2 = var10000;
      double var11 = (double)fe6.dii(var3 * var3 + var5 * var5);
      float var13 = (float)(Math.atan2(var5, var3) * 180.0 / Math.PI) - 90.0F;
      float var14 = (float)(Math.atan2(var9, var11) * 180.0 / Math.PI);

      label21: {
         label20: {
            try {
               float var18;
               var10000 = (var18 = var13 - 0.0F) == 0.0F ? 0 : (var18 < 0.0F ? -1 : 1);
               if (var2 != 0) {
                  break label21;
               }

               if (var10000 >= 0) {
                  break label20;
               }
            } catch (oov var15) {
               throw a(var15);
            }

            var13 += 360.0F;
         }

         var10000 = 2;
      }

      float[] var17 = new float[var10000];
      var17[0] = var13;
      var17[1] = var14;
      return var17;
   }

   public static boolean c_8() {
      int var0 = OpaquePredicate.c();
      nh4 var1 = new nh4(vvx.vg8.o2v - 0.3, vvx.vg8.kfp + (double)vvx.vg8.c5y(), vvx.vg8.vbd + 0.3, vvx.vg8.o2v + 0.3, vvx.vg8.kfp + 2.5, vvx.vg8.vbd - 0.3);

      try {
         boolean var10000 = vvx.tij.bb4(vvx.vg8, var1).isEmpty();
         if (var0 != 0) {
            return var10000;
         }

         if (!var10000) {
            return true;
         }
      } catch (oov var2) {
         throw a(var2);
      }

      return false;
   }

   public static boolean p5t(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.c ()I
      // 003: istore 2
      // 004: new nh4
      // 007: dup
      // 008: getstatic p_c.vvx Lc05;
      // 00b: getfield Minecraft.vg8 Ll86;
      // 00e: getfield EntityPlayerSP.o2v D
      // 011: ldc2_w 0.3
      // 014: dsub
      // 015: getstatic p_c.vvx Lc05;
      // 018: getfield Minecraft.vg8 Ll86;
      // 01b: getfield EntityPlayerSP.kfp D
      // 01e: ldc2_w 2.0
      // 021: dadd
      // 022: getstatic p_c.vvx Lc05;
      // 025: getfield Minecraft.vg8 Ll86;
      // 028: getfield EntityPlayerSP.vbd D
      // 02b: ldc2_w 0.3
      // 02e: dadd
      // 02f: getstatic p_c.vvx Lc05;
      // 032: getfield Minecraft.vg8 Ll86;
      // 035: getfield EntityPlayerSP.o2v D
      // 038: ldc2_w 0.3
      // 03b: dadd
      // 03c: getstatic p_c.vvx Lc05;
      // 03f: getfield Minecraft.vg8 Ll86;
      // 042: getfield EntityPlayerSP.kfp D
      // 045: ldc2_w 3.0
      // 048: dadd
      // 049: getstatic p_c.vvx Lc05;
      // 04c: getfield Minecraft.vg8 Ll86;
      // 04f: getfield EntityPlayerSP.vbd D
      // 052: ldc2_w 0.3
      // 055: dsub
      // 056: invokespecial nh4.<init> (DDDDDD)V
      // 059: astore 3
      // 05a: getstatic p_c.vvx Lc05;
      // 05d: getfield Minecraft.tij Lkh3;
      // 060: getstatic p_c.vvx Lc05;
      // 063: getfield Minecraft.vg8 Ll86;
      // 066: aload 3
      // 067: ldc2_w 0.3
      // 06a: dload 0
      // 06b: dadd
      // 06c: dconst_0
      // 06d: dconst_0
      // 06e: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 071: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 074: invokeinterface java/util/List.isEmpty ()Z 1
      // 079: iload 2
      // 07a: ifne 0ac
      // 07d: ifne 08d
      // 080: goto 087
      // 083: invokestatic p_c.a (Loov;)Loov;
      // 086: athrow
      // 087: bipush 1
      // 088: ireturn
      // 089: invokestatic p_c.a (Loov;)Loov;
      // 08c: athrow
      // 08d: getstatic p_c.vvx Lc05;
      // 090: getfield Minecraft.tij Lkh3;
      // 093: getstatic p_c.vvx Lc05;
      // 096: getfield Minecraft.vg8 Ll86;
      // 099: aload 3
      // 09a: ldc2_w -0.3
      // 09d: dload 0
      // 09e: dsub
      // 09f: dconst_0
      // 0a0: dconst_0
      // 0a1: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 0a4: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 0a7: invokeinterface java/util/List.isEmpty ()Z 1
      // 0ac: iload 2
      // 0ad: ifne 0df
      // 0b0: ifne 0c0
      // 0b3: goto 0ba
      // 0b6: invokestatic p_c.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: bipush 1
      // 0bb: ireturn
      // 0bc: invokestatic p_c.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: getstatic p_c.vvx Lc05;
      // 0c3: getfield Minecraft.tij Lkh3;
      // 0c6: getstatic p_c.vvx Lc05;
      // 0c9: getfield Minecraft.vg8 Ll86;
      // 0cc: aload 3
      // 0cd: dconst_0
      // 0ce: dconst_0
      // 0cf: ldc2_w 0.3
      // 0d2: dload 0
      // 0d3: dadd
      // 0d4: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 0d7: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 0da: invokeinterface java/util/List.isEmpty ()Z 1
      // 0df: iload 2
      // 0e0: ifne 112
      // 0e3: ifne 0f3
      // 0e6: goto 0ed
      // 0e9: invokestatic p_c.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: bipush 1
      // 0ee: ireturn
      // 0ef: invokestatic p_c.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: getstatic p_c.vvx Lc05;
      // 0f6: getfield Minecraft.tij Lkh3;
      // 0f9: getstatic p_c.vvx Lc05;
      // 0fc: getfield Minecraft.vg8 Ll86;
      // 0ff: aload 3
      // 100: dconst_0
      // 101: dconst_0
      // 102: ldc2_w -0.3
      // 105: dload 0
      // 106: dsub
      // 107: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 10a: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 10d: invokeinterface java/util/List.isEmpty ()Z 1
      // 112: iload 2
      // 113: ifne 127
      // 116: ifne 126
      // 119: goto 120
      // 11c: invokestatic p_c.a (Loov;)Loov;
      // 11f: athrow
      // 120: bipush 1
      // 121: ireturn
      // 122: invokestatic p_c.a (Loov;)Loov;
      // 125: athrow
      // 126: bipush 0
      // 127: ireturn
   }

   public static boolean y4t(double param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic OpaquePredicate.b ()I
      // 003: istore 2
      // 004: new nh4
      // 007: dup
      // 008: getstatic p_c.vvx Lc05;
      // 00b: getfield Minecraft.vg8 Ll86;
      // 00e: getfield EntityPlayerSP.o2v D
      // 011: ldc2_w 0.3
      // 014: dsub
      // 015: getstatic p_c.vvx Lc05;
      // 018: getfield Minecraft.vg8 Ll86;
      // 01b: getfield EntityPlayerSP.kfp D
      // 01e: ldc2_w 0.5
      // 021: dadd
      // 022: getstatic p_c.vvx Lc05;
      // 025: getfield Minecraft.vg8 Ll86;
      // 028: getfield EntityPlayerSP.vbd D
      // 02b: ldc2_w 0.3
      // 02e: dadd
      // 02f: getstatic p_c.vvx Lc05;
      // 032: getfield Minecraft.vg8 Ll86;
      // 035: getfield EntityPlayerSP.o2v D
      // 038: ldc2_w 0.3
      // 03b: dadd
      // 03c: getstatic p_c.vvx Lc05;
      // 03f: getfield Minecraft.vg8 Ll86;
      // 042: getfield EntityPlayerSP.kfp D
      // 045: ldc2_w 1.9
      // 048: dadd
      // 049: getstatic p_c.vvx Lc05;
      // 04c: getfield Minecraft.vg8 Ll86;
      // 04f: getfield EntityPlayerSP.vbd D
      // 052: ldc2_w 0.3
      // 055: dsub
      // 056: invokespecial nh4.<init> (DDDDDD)V
      // 059: astore 3
      // 05a: getstatic p_c.vvx Lc05;
      // 05d: getfield Minecraft.tij Lkh3;
      // 060: getstatic p_c.vvx Lc05;
      // 063: getfield Minecraft.vg8 Ll86;
      // 066: aload 3
      // 067: ldc2_w 0.3
      // 06a: dload 0
      // 06b: dadd
      // 06c: dconst_0
      // 06d: dconst_0
      // 06e: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 071: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 074: invokeinterface java/util/List.isEmpty ()Z 1
      // 079: iload 2
      // 07a: ifeq 0ac
      // 07d: ifne 08d
      // 080: goto 087
      // 083: invokestatic p_c.a (Loov;)Loov;
      // 086: athrow
      // 087: bipush 1
      // 088: ireturn
      // 089: invokestatic p_c.a (Loov;)Loov;
      // 08c: athrow
      // 08d: getstatic p_c.vvx Lc05;
      // 090: getfield Minecraft.tij Lkh3;
      // 093: getstatic p_c.vvx Lc05;
      // 096: getfield Minecraft.vg8 Ll86;
      // 099: aload 3
      // 09a: ldc2_w -0.3
      // 09d: dload 0
      // 09e: dsub
      // 09f: dconst_0
      // 0a0: dconst_0
      // 0a1: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 0a4: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 0a7: invokeinterface java/util/List.isEmpty ()Z 1
      // 0ac: iload 2
      // 0ad: ifeq 0df
      // 0b0: ifne 0c0
      // 0b3: goto 0ba
      // 0b6: invokestatic p_c.a (Loov;)Loov;
      // 0b9: athrow
      // 0ba: bipush 1
      // 0bb: ireturn
      // 0bc: invokestatic p_c.a (Loov;)Loov;
      // 0bf: athrow
      // 0c0: getstatic p_c.vvx Lc05;
      // 0c3: getfield Minecraft.tij Lkh3;
      // 0c6: getstatic p_c.vvx Lc05;
      // 0c9: getfield Minecraft.vg8 Ll86;
      // 0cc: aload 3
      // 0cd: dconst_0
      // 0ce: dconst_0
      // 0cf: ldc2_w 0.3
      // 0d2: dload 0
      // 0d3: dadd
      // 0d4: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 0d7: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 0da: invokeinterface java/util/List.isEmpty ()Z 1
      // 0df: iload 2
      // 0e0: ifeq 112
      // 0e3: ifne 0f3
      // 0e6: goto 0ed
      // 0e9: invokestatic p_c.a (Loov;)Loov;
      // 0ec: athrow
      // 0ed: bipush 1
      // 0ee: ireturn
      // 0ef: invokestatic p_c.a (Loov;)Loov;
      // 0f2: athrow
      // 0f3: getstatic p_c.vvx Lc05;
      // 0f6: getfield Minecraft.tij Lkh3;
      // 0f9: getstatic p_c.vvx Lc05;
      // 0fc: getfield Minecraft.vg8 Ll86;
      // 0ff: aload 3
      // 100: dconst_0
      // 101: dconst_0
      // 102: ldc2_w -0.3
      // 105: dload 0
      // 106: dsub
      // 107: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 10a: invokevirtual WorldClient.bb4 (Li2h;Lnh4;)Ljava/util/List;
      // 10d: invokeinterface java/util/List.isEmpty ()Z 1
      // 112: iload 2
      // 113: ifeq 127
      // 116: ifne 126
      // 119: goto 120
      // 11c: invokestatic p_c.a (Loov;)Loov;
      // 11f: athrow
      // 120: bipush 1
      // 121: ireturn
      // 122: invokestatic p_c.a (Loov;)Loov;
      // 125: athrow
      // 126: bipush 0
      // 127: ireturn
   }

   public static boolean qt_() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.b ()I
      // 03: istore 0
      // 04: invokestatic Minecraft.vz1 ()Lc05;
      // 07: astore 1
      // 08: aload 1
      // 09: getfield Minecraft.vg8 Ll86;
      // 0c: ifnonnull 15
      // 0f: bipush 0
      // 10: ireturn
      // 11: invokestatic p_c.a (Loov;)Loov;
      // 14: athrow
      // 15: bipush 0
      // 16: istore 2
      // 17: aload 1
      // 18: getfield Minecraft.vg8 Ll86;
      // 1b: getfield EntityPlayerSP.l29 Lnh4;
      // 1e: dconst_0
      // 1f: ldc2_w -0.0
      // 22: dconst_0
      // 23: invokevirtual nh4.sy_ (DDD)Lnh4;
      // 26: getfield nh4.bx_ D
      // 29: d2i
      // 2a: istore 3
      // 2b: aload 1
      // 2c: getfield Minecraft.vg8 Ll86;
      // 2f: getfield EntityPlayerSP.l29 Lnh4;
      // 32: getfield nh4.rlc D
      // 35: invokestatic fe6.jqf (D)I
      // 38: istore 4
      // 3a: iload 4
      // 3c: aload 1
      // 3d: getfield Minecraft.vg8 Ll86;
      // 40: getfield EntityPlayerSP.l29 Lnh4;
      // 43: getfield nh4.t_2 D
      // 46: invokestatic fe6.jqf (D)I
      // 49: bipush 1
      // 4a: iadd
      // 4b: if_icmpge f4
      // 4e: aload 1
      // 4f: getfield Minecraft.vg8 Ll86;
      // 52: getfield EntityPlayerSP.l29 Lnh4;
      // 55: getfield nh4.t8n D
      // 58: invokestatic fe6.jqf (D)I
      // 5b: iload 0
      // 5c: ifeq f5
      // 5f: istore 5
      // 61: iload 5
      // 63: aload 1
      // 64: getfield Minecraft.vg8 Ll86;
      // 67: getfield EntityPlayerSP.l29 Lnh4;
      // 6a: getfield nh4.oqj D
      // 6d: invokestatic fe6.jqf (D)I
      // 70: bipush 1
      // 71: iadd
      // 72: if_icmpge ed
      // 75: aload 1
      // 76: getfield Minecraft.tij Lkh3;
      // 79: new mew
      // 7c: dup
      // 7d: iload 4
      // 7f: iload 3
      // 80: iload 5
      // 82: invokespecial mew.<init> (III)V
      // 85: invokevirtual WorldClient.getBlockState (Lmew;)Lzfz;
      // 88: invokeinterface zfz.r_y ()Le0x; 1
      // 8d: astore 6
      // 8f: iload 0
      // 90: ifeq f0
      // 93: iload 0
      // 94: ifeq e9
      // 97: goto 9e
      // 9a: invokestatic p_c.a (Loov;)Loov;
      // 9d: athrow
      // 9e: aload 6
      // a0: ifnull e6
      // a3: goto aa
      // a6: invokestatic p_c.a (Loov;)Loov;
      // a9: athrow
      // aa: aload 6
      // ac: instanceof n47
      // af: iload 0
      // b0: ifeq d0
      // b3: goto ba
      // b6: invokestatic p_c.a (Loov;)Loov;
      // b9: athrow
      // ba: ifne e6
      // bd: goto c4
      // c0: invokestatic p_c.a (Loov;)Loov;
      // c3: athrow
      // c4: aload 6
      // c6: instanceof hmv
      // c9: goto d0
      // cc: invokestatic p_c.a (Loov;)Loov;
      // cf: athrow
      // d0: iload 0
      // d1: ifeq e5
      // d4: ifne e4
      // d7: goto de
      // da: invokestatic p_c.a (Loov;)Loov;
      // dd: athrow
      // de: bipush 0
      // df: ireturn
      // e0: invokestatic p_c.a (Loov;)Loov;
      // e3: athrow
      // e4: bipush 1
      // e5: istore 2
      // e6: iinc 5 1
      // e9: iload 0
      // ea: ifne 61
      // ed: iinc 4 1
      // f0: iload 0
      // f1: ifne 3a
      // f4: iload 2
      // f5: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
