public class zim {
   public static fqr jb8(laq var0, int var1, int var2) {
      return a5l(var0, var1, var2, (fqr)null);
   }

   public static fqr ity(laq var0, int var1, int var2, fqr var3) {
      qp5 = var3.l8u(var0.o2v, var0.kfp, var0.vbd);
      return a5l(var0, var1, var2, qp5);
   }

   public static fqr sxc(laq var0, int var1, int var2, fqr var3) {
      qp5 = new fqr(var0.o2v, var0.kfp, var0.vbd)._kk(var3);
      return a5l(var0, var1, var2, qp5);
   }

   private static fqr a5l(laq param0, int param1, int param2, fqr param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual laq.mbr ()Ljava/util/Random;
      // 004: astore 5
      // 006: invokestatic t9d.b ()I
      // 009: bipush 0
      // 00a: istore 6
      // 00c: bipush 0
      // 00d: istore 7
      // 00f: bipush 0
      // 010: istore 8
      // 012: bipush 0
      // 013: istore 9
      // 015: ldc -99999.0
      // 017: nop
      // 018: fstore 10
      // 01a: istore 4
      // 01c: aload 0
      // 01d: invokevirtual laq.qg5 ()Z
      // 020: iload 4
      // 022: ifeq 089
      // 025: ifeq 081
      // 028: goto 02f
      // 02b: invokestatic zim.a (Loov;)Loov;
      // 02e: athrow
      // 02f: aload 0
      // 030: invokevirtual laq.plj ()Lmew;
      // 033: aload 0
      // 034: getfield laq.o2v D
      // 037: invokestatic fe6.jqf (D)I
      // 03a: i2d
      // 03b: aload 0
      // 03c: getfield laq.kfp D
      // 03f: invokestatic fe6.jqf (D)I
      // 042: i2d
      // 043: aload 0
      // 044: getfield laq.vbd D
      // 047: invokestatic fe6.jqf (D)I
      // 04a: i2d
      // 04b: invokevirtual mew.p4e (DDD)D
      // 04e: ldc2_w 4.0
      // 051: dadd
      // 052: dstore 12
      // 054: aload 0
      // 055: invokevirtual laq.pns ()F
      // 058: iload 1
      // 059: i2f
      // 05a: fadd
      // 05b: f2d
      // 05c: dstore 14
      // 05e: dload 12
      // 060: dload 14
      // 062: dload 14
      // 064: dmul
      // 065: dcmpg
      // 066: iload 4
      // 068: ifeq 076
      // 06b: ifge 079
      // 06e: goto 075
      // 071: invokestatic zim.a (Loov;)Loov;
      // 074: athrow
      // 075: bipush 1
      // 076: goto 07a
      // 079: bipush 0
      // 07a: istore 11
      // 07c: iload 4
      // 07e: ifne 08b
      // 081: bipush 0
      // 082: goto 089
      // 085: invokestatic zim.a (Loov;)Loov;
      // 088: athrow
      // 089: istore 11
      // 08b: bipush 0
      // 08c: istore 12
      // 08e: iload 12
      // 090: bipush 10
      // 092: if_icmpge 24e
      // 095: aload 5
      // 097: bipush 2
      // 098: iload 1
      // 099: imul
      // 09a: bipush 1
      // 09b: iadd
      // 09c: invokevirtual java/util/Random.nextInt (I)I
      // 09f: iload 1
      // 0a0: isub
      // 0a1: istore 13
      // 0a3: aload 5
      // 0a5: bipush 2
      // 0a6: iload 2
      // 0a7: imul
      // 0a8: bipush 1
      // 0a9: iadd
      // 0aa: invokevirtual java/util/Random.nextInt (I)I
      // 0ad: iload 2
      // 0ae: isub
      // 0af: istore 14
      // 0b1: aload 5
      // 0b3: bipush 2
      // 0b4: iload 1
      // 0b5: imul
      // 0b6: bipush 1
      // 0b7: iadd
      // 0b8: invokevirtual java/util/Random.nextInt (I)I
      // 0bb: iload 1
      // 0bc: isub
      // 0bd: istore 15
      // 0bf: aload 3
      // 0c0: iload 4
      // 0c2: ifeq 26a
      // 0c5: ifnull 0f8
      // 0c8: goto 0cf
      // 0cb: invokestatic zim.a (Loov;)Loov;
      // 0ce: athrow
      // 0cf: iload 13
      // 0d1: i2d
      // 0d2: aload 3
      // 0d3: getfield fqr.lvi D
      // 0d6: dmul
      // 0d7: iload 15
      // 0d9: i2d
      // 0da: aload 3
      // 0db: getfield fqr.bn2 D
      // 0de: dmul
      // 0df: dadd
      // 0e0: dconst_0
      // 0e1: dcmpl
      // 0e2: iload 4
      // 0e4: ifeq 103
      // 0e7: goto 0ee
      // 0ea: invokestatic zim.a (Loov;)Loov;
      // 0ed: athrow
      // 0ee: iflt 246
      // 0f1: goto 0f8
      // 0f4: invokestatic zim.a (Loov;)Loov;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: invokevirtual laq.qg5 ()Z
      // 0fc: goto 103
      // 0ff: invokestatic zim.a (Loov;)Loov;
      // 102: athrow
      // 103: iload 4
      // 105: ifeq 1d2
      // 108: ifeq 1b0
      // 10b: goto 112
      // 10e: invokestatic zim.a (Loov;)Loov;
      // 111: athrow
      // 112: iload 1
      // 113: bipush 1
      // 114: iload 4
      // 116: ifeq 1d1
      // 119: goto 120
      // 11c: invokestatic zim.a (Loov;)Loov;
      // 11f: athrow
      // 120: if_icmple 1b0
      // 123: goto 12a
      // 126: invokestatic zim.a (Loov;)Loov;
      // 129: athrow
      // 12a: aload 0
      // 12b: invokevirtual laq.plj ()Lmew;
      // 12e: astore 16
      // 130: aload 0
      // 131: getfield laq.o2v D
      // 134: aload 16
      // 136: invokevirtual mew.getX ()I
      // 139: i2d
      // 13a: dcmpl
      // 13b: iload 4
      // 13d: ifeq 16e
      // 140: ifle 15c
      // 143: goto 14a
      // 146: invokestatic zim.a (Loov;)Loov;
      // 149: athrow
      // 14a: iload 13
      // 14c: aload 5
      // 14e: iload 1
      // 14f: bipush 2
      // 150: idiv
      // 151: invokevirtual java/util/Random.nextInt (I)I
      // 154: isub
      // 155: istore 13
      // 157: iload 4
      // 159: ifne 170
      // 15c: iload 13
      // 15e: aload 5
      // 160: iload 1
      // 161: bipush 2
      // 162: idiv
      // 163: invokevirtual java/util/Random.nextInt (I)I
      // 166: iadd
      // 167: goto 16e
      // 16a: invokestatic zim.a (Loov;)Loov;
      // 16d: athrow
      // 16e: istore 13
      // 170: aload 0
      // 171: getfield laq.vbd D
      // 174: aload 16
      // 176: invokevirtual mew.getZ ()I
      // 179: i2d
      // 17a: dcmpl
      // 17b: iload 4
      // 17d: ifeq 1ae
      // 180: ifle 19c
      // 183: goto 18a
      // 186: invokestatic zim.a (Loov;)Loov;
      // 189: athrow
      // 18a: iload 15
      // 18c: aload 5
      // 18e: iload 1
      // 18f: bipush 2
      // 190: idiv
      // 191: invokevirtual java/util/Random.nextInt (I)I
      // 194: isub
      // 195: istore 15
      // 197: iload 4
      // 199: ifne 1b0
      // 19c: iload 15
      // 19e: aload 5
      // 1a0: iload 1
      // 1a1: bipush 2
      // 1a2: idiv
      // 1a3: invokevirtual java/util/Random.nextInt (I)I
      // 1a6: iadd
      // 1a7: goto 1ae
      // 1aa: invokestatic zim.a (Loov;)Loov;
      // 1ad: athrow
      // 1ae: istore 15
      // 1b0: iload 13
      // 1b2: aload 0
      // 1b3: getfield laq.o2v D
      // 1b6: invokestatic fe6.jqf (D)I
      // 1b9: iadd
      // 1ba: istore 13
      // 1bc: iload 14
      // 1be: aload 0
      // 1bf: getfield laq.kfp D
      // 1c2: invokestatic fe6.jqf (D)I
      // 1c5: iadd
      // 1c6: istore 14
      // 1c8: iload 15
      // 1ca: aload 0
      // 1cb: getfield laq.vbd D
      // 1ce: invokestatic fe6.jqf (D)I
      // 1d1: iadd
      // 1d2: istore 15
      // 1d4: new mew
      // 1d7: dup
      // 1d8: iload 13
      // 1da: iload 14
      // 1dc: iload 15
      // 1de: invokespecial mew.<init> (III)V
      // 1e1: astore 16
      // 1e3: iload 11
      // 1e5: iload 4
      // 1e7: ifeq 20d
      // 1ea: ifeq 210
      // 1ed: goto 1f4
      // 1f0: invokestatic zim.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: aload 0
      // 1f5: aload 16
      // 1f7: iload 4
      // 1f9: ifeq 21a
      // 1fc: goto 203
      // 1ff: invokestatic zim.a (Loov;)Loov;
      // 202: athrow
      // 203: invokevirtual laq.oon (Lmew;)Z
      // 206: goto 20d
      // 209: invokestatic zim.a (Loov;)Loov;
      // 20c: athrow
      // 20d: ifeq 246
      // 210: aload 0
      // 211: aload 16
      // 213: goto 21a
      // 216: invokestatic zim.a (Loov;)Loov;
      // 219: athrow
      // 21a: invokevirtual laq.ncy (Lmew;)F
      // 21d: fstore 17
      // 21f: iload 4
      // 221: ifeq 249
      // 224: fload 17
      // 226: fload 10
      // 228: fcmpl
      // 229: ifle 246
      // 22c: goto 233
      // 22f: invokestatic zim.a (Loov;)Loov;
      // 232: athrow
      // 233: fload 17
      // 235: fstore 10
      // 237: iload 13
      // 239: istore 7
      // 23b: iload 14
      // 23d: istore 8
      // 23f: iload 15
      // 241: istore 9
      // 243: bipush 1
      // 244: istore 6
      // 246: iinc 12 1
      // 249: iload 4
      // 24b: ifne 08e
      // 24e: iload 6
      // 250: ifeq 26b
      // 253: new fqr
      // 256: dup
      // 257: iload 7
      // 259: i2d
      // 25a: iload 8
      // 25c: i2d
      // 25d: iload 9
      // 25f: i2d
      // 260: invokespecial fqr.<init> (DDD)V
      // 263: goto 26a
      // 266: invokestatic zim.a (Loov;)Loov;
      // 269: athrow
      // 26a: areturn
      // 26b: aconst_null
      // 26c: areturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
