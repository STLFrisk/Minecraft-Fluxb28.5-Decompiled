public class mmr extends ym7 {
   public mmr(hr_ var1) {
      super(var1);
   }

   public void gv8(dqh param1, float param2, zfz param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic OpaquePredicate.c ()I
      // 03: istore 4
      // 05: aload 1
      // 06: invokevirtual dqh.sb5 ()I
      // 09: istore 5
      // 0b: iload 5
      // 0d: bipush -1
      // 0e: iload 4
      // 10: ifne 81
      // 13: if_icmple 77
      // 16: goto 1d
      // 19: invokestatic mmr.a (Loov;)Loov;
      // 1c: athrow
      // 1d: iload 5
      // 1f: i2f
      // 20: fload 2
      // 21: fsub
      // 22: fconst_1
      // 23: fadd
      // 24: ldc 10.0
      // 26: nop
      // 27: fcmpg
      // 28: iload 4
      // 2a: ifne 80
      // 2d: goto 34
      // 30: invokestatic mmr.a (Loov;)Loov;
      // 33: athrow
      // 34: ifge 77
      // 37: goto 3e
      // 3a: invokestatic mmr.a (Loov;)Loov;
      // 3d: athrow
      // 3e: fconst_1
      // 3f: iload 5
      // 41: i2f
      // 42: fload 2
      // 43: fsub
      // 44: fconst_1
      // 45: fadd
      // 46: ldc 10.0
      // 48: nop
      // 49: fdiv
      // 4a: fsub
      // 4b: fstore 6
      // 4d: fload 6
      // 4f: fconst_0
      // 50: fconst_1
      // 51: invokestatic fe6._f3 (FFF)F
      // 54: fstore 6
      // 56: fload 6
      // 58: fload 6
      // 5a: fmul
      // 5b: fstore 6
      // 5d: fload 6
      // 5f: fload 6
      // 61: fmul
      // 62: fstore 6
      // 64: fconst_1
      // 65: fload 6
      // 67: ldc 0.3
      // 69: nop
      // 6a: fmul
      // 6b: fadd
      // 6c: fstore 7
      // 6e: fload 7
      // 70: fload 7
      // 72: fload 7
      // 74: invokestatic hzu.syc (FFF)V
      // 77: aload 0
      // 78: aload 1
      // 79: fload 2
      // 7a: aload 3
      // 7b: invokespecial ym7.zea (L_f3;FLzfz;)V
      // 7e: iload 5
      // 80: bipush -1
      // 81: iload 4
      // 83: ifne 9c
      // 86: if_icmple f3
      // 89: goto 90
      // 8c: invokestatic mmr.a (Loov;)Loov;
      // 8f: athrow
      // 90: iload 5
      // 92: bipush 5
      // 93: idiv
      // 94: bipush 2
      // 95: goto 9c
      // 98: invokestatic mmr.a (Loov;)Loov;
      // 9b: athrow
      // 9c: irem
      // 9d: ifne f3
      // a0: invokestatic Minecraft.vz1 ()Lc05;
      // a3: invokevirtual Minecraft.dwz ()Lqfn;
      // a6: astore 6
      // a8: invokestatic hzu.m_1 ()V
      // ab: invokestatic hzu.fpt ()V
      // ae: invokestatic hzu.spd ()V
      // b1: sipush 770
      // b4: sipush 772
      // b7: invokestatic hzu.ru7 (II)V
      // ba: fconst_1
      // bb: fconst_1
      // bc: fconst_1
      // bd: fconst_1
      // be: iload 5
      // c0: i2f
      // c1: fload 2
      // c2: fsub
      // c3: fconst_1
      // c4: fadd
      // c5: ldc 100.0
      // c7: nop
      // c8: fdiv
      // c9: fsub
      // ca: ldc 0.8
      // cc: nop
      // cd: fmul
      // ce: invokestatic hzu.wn0 (FFFF)V
      // d1: invokestatic hzu.dp2 ()V
      // d4: aload 6
      // d6: getstatic ox_.od1 Le0x;
      // d9: invokevirtual e0x.l4i ()Lzfz;
      // dc: fconst_1
      // dd: invokevirtual qfn._qd (Lzfz;F)V
      // e0: invokestatic hzu.x3w ()V
      // e3: fconst_1
      // e4: fconst_1
      // e5: fconst_1
      // e6: fconst_1
      // e7: invokestatic hzu.wn0 (FFFF)V
      // ea: invokestatic hzu.ux6 ()V
      // ed: invokestatic hzu.s7q ()V
      // f0: invokestatic hzu.rqj ()V
      // f3: return
   }

   @Override
   public void zea(_f3 var1, float var2, zfz var3) {
      this.gv8((dqh)var1, var2, var3);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
