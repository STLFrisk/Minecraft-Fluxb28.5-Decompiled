public class nfo extends u7m {
   public nfo() {
      this.vgp = 16;
      this.qfy(uja.qqf);
   }

   @Override
   public boolean ghw(erg param1, ha9 param2, t9d param3, mew param4, vt2 param5, float param6, float param7, float param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic t9d.b ()I
      // 003: istore 9
      // 005: aload 5
      // 007: getstatic vt2.m3r Lvt2;
      // 00a: if_acmpne 013
      // 00d: bipush 0
      // 00e: ireturn
      // 00f: invokestatic nfo.a (Loov;)Loov;
      // 012: athrow
      // 013: aload 3
      // 014: aload 4
      // 016: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 019: invokeinterface zfz.r_y ()Le0x; 1
      // 01e: invokevirtual e0x.p1r ()Lp3y;
      // 021: invokevirtual p3y.gk6 ()Z
      // 024: iload 9
      // 026: ifeq 04b
      // 029: ifne 039
      // 02c: goto 033
      // 02f: invokestatic nfo.a (Loov;)Loov;
      // 032: athrow
      // 033: bipush 0
      // 034: ireturn
      // 035: invokestatic nfo.a (Loov;)Loov;
      // 038: athrow
      // 039: aload 4
      // 03b: aload 5
      // 03d: invokevirtual mew.offset (Lvt2;)Lmew;
      // 040: astore 4
      // 042: aload 2
      // 043: aload 4
      // 045: aload 5
      // 047: aload 1
      // 048: invokevirtual ha9.dzh (Lmew;Lvt2;Lerg;)Z
      // 04b: iload 9
      // 04d: ifeq 069
      // 050: ifne 060
      // 053: goto 05a
      // 056: invokestatic nfo.a (Loov;)Loov;
      // 059: athrow
      // 05a: bipush 0
      // 05b: ireturn
      // 05c: invokestatic nfo.a (Loov;)Loov;
      // 05f: athrow
      // 060: getstatic ox_.w0z Le0x;
      // 063: aload 3
      // 064: aload 4
      // 066: invokevirtual e0x.ctq (Lt9d;Lmew;)Z
      // 069: iload 9
      // 06b: ifeq 082
      // 06e: ifne 07e
      // 071: goto 078
      // 074: invokestatic nfo.a (Loov;)Loov;
      // 077: athrow
      // 078: bipush 0
      // 079: ireturn
      // 07a: invokestatic nfo.a (Loov;)Loov;
      // 07d: athrow
      // 07e: aload 3
      // 07f: getfield t9d.v0f Z
      // 082: iload 9
      // 084: ifeq 092
      // 087: ifeq 093
      // 08a: goto 091
      // 08d: invokestatic nfo.a (Loov;)Loov;
      // 090: athrow
      // 091: bipush 1
      // 092: ireturn
      // 093: aload 5
      // 095: getstatic vt2.rf3 Lvt2;
      // 098: if_acmpne 0d8
      // 09b: aload 2
      // 09c: getfield ha9.x5k F
      // 09f: ldc 180.0
      // 0a1: nop
      // 0a2: fadd
      // 0a3: ldc 16.0
      // 0a5: nop
      // 0a6: fmul
      // 0a7: ldc 360.0
      // 0a9: nop
      // 0aa: fdiv
      // 0ab: f2d
      // 0ac: ldc2_w 0.5
      // 0af: dadd
      // 0b0: invokestatic fe6.jqf (D)I
      // 0b3: bipush 15
      // 0b5: iand
      // 0b6: istore 10
      // 0b8: aload 3
      // 0b9: aload 4
      // 0bb: getstatic ox_.w0z Le0x;
      // 0be: invokevirtual e0x.l4i ()Lzfz;
      // 0c1: getstatic q7m.whz L_ku;
      // 0c4: iload 10
      // 0c6: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0c9: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0ce: bipush 3
      // 0cf: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 0d2: pop
      // 0d3: iload 9
      // 0d5: ifne 0f7
      // 0d8: aload 3
      // 0d9: aload 4
      // 0db: getstatic ox_.kng Le0x;
      // 0de: invokevirtual e0x.l4i ()Lzfz;
      // 0e1: getstatic hkm.fdx Lqx_;
      // 0e4: aload 5
      // 0e6: invokeinterface zfz.zvi (Lxny;Ljava/lang/Comparable;)Lzfz; 3
      // 0eb: bipush 3
      // 0ec: invokevirtual t9d.vct (Lmew;Lzfz;I)Z
      // 0ef: pop
      // 0f0: goto 0f7
      // 0f3: invokestatic nfo.a (Loov;)Loov;
      // 0f6: athrow
      // 0f7: aload 1
      // 0f8: dup
      // 0f9: getfield erg.qd2 I
      // 0fc: bipush 1
      // 0fd: isub
      // 0fe: putfield erg.qd2 I
      // 101: aload 3
      // 102: aload 4
      // 104: invokevirtual t9d.getTileEntity (Lmew;)Lpyk;
      // 107: astore 10
      // 109: aload 10
      // 10b: instanceof net/minecraft/tileentity/TileEntitySign
      // 10e: iload 9
      // 110: ifeq 14c
      // 113: ifeq 14b
      // 116: goto 11d
      // 119: invokestatic nfo.a (Loov;)Loov;
      // 11c: athrow
      // 11d: aload 3
      // 11e: aload 2
      // 11f: aload 4
      // 121: aload 1
      // 122: invokestatic gun.v79 (Lt9d;Lha9;Lmew;Lerg;)Z
      // 125: iload 9
      // 127: ifeq 14c
      // 12a: goto 131
      // 12d: invokestatic nfo.a (Loov;)Loov;
      // 130: athrow
      // 131: ifne 14b
      // 134: goto 13b
      // 137: invokestatic nfo.a (Loov;)Loov;
      // 13a: athrow
      // 13b: aload 2
      // 13c: aload 10
      // 13e: checkcast net/minecraft/tileentity/TileEntitySign
      // 141: invokevirtual ha9.v6x (Lnet/minecraft/tileentity/TileEntitySign;)V
      // 144: goto 14b
      // 147: invokestatic nfo.a (Loov;)Loov;
      // 14a: athrow
      // 14b: bipush 1
      // 14c: ireturn
   }

   private static oov a(oov var0) {
      return var0;
   }
}
