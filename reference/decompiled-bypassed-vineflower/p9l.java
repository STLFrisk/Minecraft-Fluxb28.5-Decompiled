public class p9l implements gnj {
   public void c47(fcs param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 9
      // 005: aload 1
      // 006: getfield fcs.jkn I
      // 009: ifle 217
      // 00c: invokestatic jom.yut ()Ljom;
      // 00f: astore 10
      // 011: aload 10
      // 013: invokevirtual jom.zuq ()Lq3g;
      // 016: astore 11
      // 018: invokestatic qpm.cng ()V
      // 01b: aload 1
      // 01c: getfield fcs.jkn I
      // 01f: i2f
      // 020: fload 4
      // 022: fadd
      // 023: ldc 200.0
      // 025: nop
      // 026: fdiv
      // 027: fstore 12
      // 029: fconst_0
      // 02a: fstore 13
      // 02c: fload 12
      // 02e: ldc 0.8
      // 030: nop
      // 031: iload 9
      // 033: ifeq 051
      // 036: fcmpl
      // 037: ifle 054
      // 03a: goto 041
      // 03d: invokestatic p9l.a (Loov;)Loov;
      // 040: athrow
      // 041: fload 12
      // 043: ldc 0.8
      // 045: nop
      // 046: fsub
      // 047: ldc 0.2
      // 049: nop
      // 04a: goto 051
      // 04d: invokestatic p9l.a (Loov;)Loov;
      // 050: athrow
      // 051: fdiv
      // 052: fstore 13
      // 054: new java/util/Random
      // 057: dup
      // 058: ldc2_w 432
      // 05b: invokespecial java/util/Random.<init> (J)V
      // 05e: astore 14
      // 060: invokestatic hzu.m_1 ()V
      // 063: sipush 7425
      // 066: invokestatic hzu.nn9 (I)V
      // 069: invokestatic hzu.spd ()V
      // 06c: sipush 770
      // 06f: bipush 1
      // 070: invokestatic hzu.ru7 (II)V
      // 073: invokestatic hzu.vtj ()V
      // 076: invokestatic hzu.gp4 ()V
      // 079: bipush 0
      // 07a: invokestatic hzu.jun (Z)V
      // 07d: invokestatic hzu.dp2 ()V
      // 080: fconst_0
      // 081: ldc -1.0
      // 083: nop
      // 084: ldc -2.0
      // 086: nop
      // 087: invokestatic hzu.a4k (FFF)V
      // 08a: bipush 0
      // 08b: istore 15
      // 08d: iload 15
      // 08f: i2f
      // 090: fload 12
      // 092: fload 12
      // 094: fload 12
      // 096: fmul
      // 097: fadd
      // 098: fconst_2
      // 099: fdiv
      // 09a: ldc 60.0
      // 09c: nop
      // 09d: fmul
      // 09e: fcmpg
      // 09f: ifge 1f4
      // 0a2: aload 14
      // 0a4: invokevirtual java/util/Random.nextFloat ()F
      // 0a7: ldc 360.0
      // 0a9: nop
      // 0aa: fmul
      // 0ab: fconst_1
      // 0ac: fconst_0
      // 0ad: fconst_0
      // 0ae: invokestatic hzu.a2h (FFFF)V
      // 0b1: aload 14
      // 0b3: invokevirtual java/util/Random.nextFloat ()F
      // 0b6: ldc 360.0
      // 0b8: nop
      // 0b9: fmul
      // 0ba: fconst_0
      // 0bb: fconst_1
      // 0bc: fconst_0
      // 0bd: invokestatic hzu.a2h (FFFF)V
      // 0c0: aload 14
      // 0c2: invokevirtual java/util/Random.nextFloat ()F
      // 0c5: ldc 360.0
      // 0c7: nop
      // 0c8: fmul
      // 0c9: fconst_0
      // 0ca: fconst_0
      // 0cb: fconst_1
      // 0cc: invokestatic hzu.a2h (FFFF)V
      // 0cf: aload 14
      // 0d1: invokevirtual java/util/Random.nextFloat ()F
      // 0d4: ldc 360.0
      // 0d6: nop
      // 0d7: fmul
      // 0d8: fconst_1
      // 0d9: fconst_0
      // 0da: fconst_0
      // 0db: invokestatic hzu.a2h (FFFF)V
      // 0de: aload 14
      // 0e0: invokevirtual java/util/Random.nextFloat ()F
      // 0e3: ldc 360.0
      // 0e5: nop
      // 0e6: fmul
      // 0e7: fconst_0
      // 0e8: fconst_1
      // 0e9: fconst_0
      // 0ea: invokestatic hzu.a2h (FFFF)V
      // 0ed: aload 14
      // 0ef: invokevirtual java/util/Random.nextFloat ()F
      // 0f2: ldc 360.0
      // 0f4: nop
      // 0f5: fmul
      // 0f6: fload 12
      // 0f8: ldc 90.0
      // 0fa: nop
      // 0fb: fmul
      // 0fc: fadd
      // 0fd: fconst_0
      // 0fe: fconst_0
      // 0ff: fconst_1
      // 100: invokestatic hzu.a2h (FFFF)V
      // 103: aload 14
      // 105: invokevirtual java/util/Random.nextFloat ()F
      // 108: ldc 20.0
      // 10a: nop
      // 10b: fmul
      // 10c: ldc 5.0
      // 10e: nop
      // 10f: fadd
      // 110: fload 13
      // 112: ldc 10.0
      // 114: nop
      // 115: fmul
      // 116: fadd
      // 117: fstore 16
      // 119: aload 14
      // 11b: invokevirtual java/util/Random.nextFloat ()F
      // 11e: fconst_2
      // 11f: fmul
      // 120: fconst_1
      // 121: fadd
      // 122: fload 13
      // 124: fconst_2
      // 125: fmul
      // 126: fadd
      // 127: fstore 17
      // 129: aload 11
      // 12b: bipush 6
      // 12d: getstatic gnl.gec Lbe7;
      // 130: invokevirtual q3g.ezr (ILbe7;)V
      // 133: aload 11
      // 135: dconst_0
      // 136: dconst_0
      // 137: dconst_0
      // 138: invokevirtual q3g.g5o (DDD)Lq3g;
      // 13b: sipush 255
      // 13e: sipush 255
      // 141: sipush 255
      // 144: ldc 255.0
      // 146: nop
      // 147: fconst_1
      // 148: fload 13
      // 14a: fsub
      // 14b: fmul
      // 14c: f2i
      // 14d: invokevirtual q3g.fje (IIII)Lq3g;
      // 150: invokevirtual q3g.pzw ()V
      // 153: aload 11
      // 155: ldc2_w -0.866
      // 158: fload 17
      // 15a: f2d
      // 15b: dmul
      // 15c: fload 16
      // 15e: f2d
      // 15f: ldc -0.5
      // 161: nop
      // 162: fload 17
      // 164: fmul
      // 165: f2d
      // 166: invokevirtual q3g.g5o (DDD)Lq3g;
      // 169: sipush 255
      // 16c: bipush 0
      // 16d: sipush 255
      // 170: bipush 0
      // 171: invokevirtual q3g.fje (IIII)Lq3g;
      // 174: invokevirtual q3g.pzw ()V
      // 177: aload 11
      // 179: ldc2_w 0.866
      // 17c: fload 17
      // 17e: f2d
      // 17f: dmul
      // 180: fload 16
      // 182: f2d
      // 183: ldc -0.5
      // 185: nop
      // 186: fload 17
      // 188: fmul
      // 189: f2d
      // 18a: invokevirtual q3g.g5o (DDD)Lq3g;
      // 18d: sipush 255
      // 190: bipush 0
      // 191: sipush 255
      // 194: bipush 0
      // 195: invokevirtual q3g.fje (IIII)Lq3g;
      // 198: invokevirtual q3g.pzw ()V
      // 19b: aload 11
      // 19d: dconst_0
      // 19e: fload 16
      // 1a0: f2d
      // 1a1: fconst_1
      // 1a2: fload 17
      // 1a4: fmul
      // 1a5: f2d
      // 1a6: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1a9: sipush 255
      // 1ac: bipush 0
      // 1ad: sipush 255
      // 1b0: bipush 0
      // 1b1: invokevirtual q3g.fje (IIII)Lq3g;
      // 1b4: invokevirtual q3g.pzw ()V
      // 1b7: aload 11
      // 1b9: ldc2_w -0.866
      // 1bc: fload 17
      // 1be: f2d
      // 1bf: dmul
      // 1c0: fload 16
      // 1c2: f2d
      // 1c3: ldc -0.5
      // 1c5: nop
      // 1c6: fload 17
      // 1c8: fmul
      // 1c9: f2d
      // 1ca: invokevirtual q3g.g5o (DDD)Lq3g;
      // 1cd: sipush 255
      // 1d0: bipush 0
      // 1d1: sipush 255
      // 1d4: bipush 0
      // 1d5: invokevirtual q3g.fje (IIII)Lq3g;
      // 1d8: invokevirtual q3g.pzw ()V
      // 1db: aload 10
      // 1dd: invokevirtual jom.q7g ()V
      // 1e0: iinc 15 1
      // 1e3: iload 9
      // 1e5: ifeq 214
      // 1e8: iload 9
      // 1ea: ifne 08d
      // 1ed: goto 1f4
      // 1f0: invokestatic p9l.a (Loov;)Loov;
      // 1f3: athrow
      // 1f4: invokestatic hzu.x3w ()V
      // 1f7: bipush 1
      // 1f8: invokestatic hzu.jun (Z)V
      // 1fb: invokestatic hzu.o1b ()V
      // 1fe: invokestatic hzu.ux6 ()V
      // 201: sipush 7424
      // 204: invokestatic hzu.nn9 (I)V
      // 207: fconst_1
      // 208: fconst_1
      // 209: fconst_1
      // 20a: fconst_1
      // 20b: invokestatic hzu.wn0 (FFFF)V
      // 20e: invokestatic hzu.rqj ()V
      // 211: invokestatic hzu.if9 ()V
      // 214: invokestatic qpm.ne_ ()V
      // 217: return
   }

   @Override
   public boolean shouldCombineTextures() {
      return false;
   }

   @Override
   public void doRenderLayer(g_3 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.c47((fcs)var1, var2, var3, var4, var5, var6, var7, var8);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
