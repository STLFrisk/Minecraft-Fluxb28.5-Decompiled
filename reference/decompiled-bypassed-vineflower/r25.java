public class r25 extends liu {
   public r25(hr_ var1) {
      super(var1);
      this.o2u = 0.5F;
   }

   public void f_h(pix param1, double param2, double param4, double param6, float param8, float param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic c05.vz1 ()Lc05;
      // 003: invokevirtual c05.dwz ()Lqfn;
      // 006: astore 11
      // 008: invokestatic t9d.b ()I
      // 00b: invokestatic hzu.dp2 ()V
      // 00e: dload 2
      // 00f: d2f
      // 010: dload 4
      // 012: d2f
      // 013: ldc 0.5
      // 015: nop
      // 016: fadd
      // 017: dload 6
      // 019: d2f
      // 01a: invokestatic hzu.a4k (FFF)V
      // 01d: istore 10
      // 01f: aload 1
      // 020: getfield pix.j_a I
      // 023: i2f
      // 024: fload 9
      // 026: fsub
      // 027: fconst_1
      // 028: fadd
      // 029: ldc 10.0
      // 02b: nop
      // 02c: iload 10
      // 02e: ifeq 08b
      // 031: fcmpg
      // 032: ifge 078
      // 035: goto 03c
      // 038: invokestatic r25.a (Loov;)Loov;
      // 03b: athrow
      // 03c: fconst_1
      // 03d: aload 1
      // 03e: getfield pix.j_a I
      // 041: i2f
      // 042: fload 9
      // 044: fsub
      // 045: fconst_1
      // 046: fadd
      // 047: ldc 10.0
      // 049: nop
      // 04a: fdiv
      // 04b: fsub
      // 04c: fstore 12
      // 04e: fload 12
      // 050: fconst_0
      // 051: fconst_1
      // 052: invokestatic fe6._f3 (FFF)F
      // 055: fstore 12
      // 057: fload 12
      // 059: fload 12
      // 05b: fmul
      // 05c: fstore 12
      // 05e: fload 12
      // 060: fload 12
      // 062: fmul
      // 063: fstore 12
      // 065: fconst_1
      // 066: fload 12
      // 068: ldc 0.3
      // 06a: nop
      // 06b: fmul
      // 06c: fadd
      // 06d: fstore 13
      // 06f: fload 13
      // 071: fload 13
      // 073: fload 13
      // 075: invokestatic hzu.syc (FFF)V
      // 078: fconst_1
      // 079: aload 1
      // 07a: getfield pix.j_a I
      // 07d: i2f
      // 07e: fload 9
      // 080: fsub
      // 081: fconst_1
      // 082: fadd
      // 083: ldc 100.0
      // 085: nop
      // 086: fdiv
      // 087: fsub
      // 088: ldc 0.8
      // 08a: nop
      // 08b: fmul
      // 08c: fstore 12
      // 08e: aload 0
      // 08f: aload 1
      // 090: invokevirtual r25.sat (Li2h;)Z
      // 093: pop
      // 094: ldc -0.5
      // 096: nop
      // 097: ldc -0.5
      // 099: nop
      // 09a: ldc 0.5
      // 09c: nop
      // 09d: invokestatic hzu.a4k (FFF)V
      // 0a0: aload 11
      // 0a2: getstatic ox_.od1 Le0x;
      // 0a5: invokevirtual e0x.l4i ()Lzfz;
      // 0a8: aload 1
      // 0a9: fload 9
      // 0ab: invokevirtual pix.xeu (F)F
      // 0ae: invokevirtual qfn._qd (Lzfz;F)V
      // 0b1: fconst_0
      // 0b2: fconst_0
      // 0b3: fconst_1
      // 0b4: invokestatic hzu.a4k (FFF)V
      // 0b7: iload 10
      // 0b9: ifeq 130
      // 0bc: aload 1
      // 0bd: getfield pix.j_a I
      // 0c0: bipush 5
      // 0c1: idiv
      // 0c2: bipush 2
      // 0c3: irem
      // 0c4: ifne 11f
      // 0c7: goto 0ce
      // 0ca: invokestatic r25.a (Loov;)Loov;
      // 0cd: athrow
      // 0ce: invokestatic hzu.m_1 ()V
      // 0d1: invokestatic hzu.fpt ()V
      // 0d4: invokestatic hzu.spd ()V
      // 0d7: sipush 770
      // 0da: sipush 772
      // 0dd: invokestatic hzu.ru7 (II)V
      // 0e0: fconst_1
      // 0e1: fconst_1
      // 0e2: fconst_1
      // 0e3: fload 12
      // 0e5: invokestatic hzu.wn0 (FFFF)V
      // 0e8: ldc -3.0
      // 0ea: nop
      // 0eb: ldc -3.0
      // 0ed: nop
      // 0ee: invokestatic hzu.fex (FF)V
      // 0f1: invokestatic hzu.ktr ()V
      // 0f4: aload 11
      // 0f6: getstatic ox_.od1 Le0x;
      // 0f9: invokevirtual e0x.l4i ()Lzfz;
      // 0fc: fconst_1
      // 0fd: invokevirtual qfn._qd (Lzfz;F)V
      // 100: fconst_0
      // 101: fconst_0
      // 102: invokestatic hzu.fex (FF)V
      // 105: invokestatic hzu.q6d ()V
      // 108: fconst_1
      // 109: fconst_1
      // 10a: fconst_1
      // 10b: fconst_1
      // 10c: invokestatic hzu.wn0 (FFFF)V
      // 10f: invokestatic hzu.ux6 ()V
      // 112: invokestatic hzu.s7q ()V
      // 115: invokestatic hzu.rqj ()V
      // 118: goto 11f
      // 11b: invokestatic r25.a (Loov;)Loov;
      // 11e: athrow
      // 11f: invokestatic hzu.x3w ()V
      // 122: aload 0
      // 123: aload 1
      // 124: dload 2
      // 125: dload 4
      // 127: dload 6
      // 129: fload 8
      // 12b: fload 9
      // 12d: invokespecial liu.apl (Li2h;DDDFF)V
      // 130: return
   }

   public gdz rgy(pix var1) {
      return yu2.nu_;
   }

   @Override
   public gdz dzd(i2h var1) {
      return this.rgy((pix)var1);
   }

   @Override
   public void apl(i2h var1, double var2, double var4, double var6, float var8, float var9) {
      this.f_h((pix)var1, var2, var4, var6, var8, var9);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
