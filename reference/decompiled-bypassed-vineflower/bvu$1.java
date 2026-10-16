public final class bvu$1 extends kea {
   private final kea zrk = new kea();

   @Override
   public erg lno(sdf param1, erg param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokeinterface sdf.lcq ()I 1
      // 006: invokestatic okn.dwc (I)Lvt2;
      // 009: astore 4
      // 00b: invokestatic t9d.c ()I
      // 00e: aload 1
      // 00f: invokeinterface sdf.acz ()Lt9d; 1
      // 014: astore 5
      // 016: aload 1
      // 017: invokeinterface sdf.tai ()D 1
      // 01c: aload 4
      // 01e: invokevirtual vt2.n67 ()I
      // 021: i2d
      // 022: ldc2_w 1.125
      // 025: dmul
      // 026: dadd
      // 027: dstore 6
      // 029: aload 1
      // 02a: invokeinterface sdf.q_1 ()D 1
      // 02f: invokestatic java/lang/Math.floor (D)D
      // 032: aload 4
      // 034: invokevirtual vt2.g5t ()I
      // 037: i2d
      // 038: dadd
      // 039: dstore 8
      // 03b: aload 1
      // 03c: invokeinterface sdf.wgy ()D 1
      // 041: aload 4
      // 043: invokevirtual vt2.ozy ()I
      // 046: i2d
      // 047: ldc2_w 1.125
      // 04a: dmul
      // 04b: dadd
      // 04c: dstore 10
      // 04e: aload 1
      // 04f: invokeinterface sdf.taq ()Lmew; 1
      // 054: aload 4
      // 056: invokevirtual mew.offset (Lvt2;)Lmew;
      // 059: astore 12
      // 05b: aload 5
      // 05d: aload 12
      // 05f: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 062: astore 13
      // 064: istore 3
      // 065: aload 13
      // 067: iload 3
      // 068: ifne 086
      // 06b: invokeinterface zfz.r_y ()Le0x; 1
      // 070: instanceof y0y
      // 073: ifeq 09e
      // 076: goto 07d
      // 079: invokestatic bvu$1.a (Loov;)Loov;
      // 07c: athrow
      // 07d: aload 13
      // 07f: goto 086
      // 082: invokestatic bvu$1.a (Loov;)Loov;
      // 085: athrow
      // 086: aload 13
      // 088: invokeinterface zfz.r_y ()Le0x; 1
      // 08d: checkcast y0y
      // 090: invokevirtual y0y.fvr ()Lxny;
      // 093: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 098: checkcast y0y$_zr
      // 09b: goto 0a1
      // 09e: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 0a1: astore 14
      // 0a3: aload 13
      // 0a5: iload 3
      // 0a6: ifne 0e0
      // 0a9: invokestatic y0y.al_ (Lzfz;)Z
      // 0ac: ifeq 0d7
      // 0af: goto 0b6
      // 0b2: invokestatic bvu$1.a (Loov;)Loov;
      // 0b5: athrow
      // 0b6: aload 14
      // 0b8: invokevirtual y0y$_zr.t1s ()Z
      // 0bb: ifeq 0ce
      // 0be: goto 0c5
      // 0c1: invokestatic bvu$1.a (Loov;)Loov;
      // 0c4: athrow
      // 0c5: ldc2_w 0.6
      // 0c8: dstore 15
      // 0ca: iload 3
      // 0cb: ifeq 198
      // 0ce: ldc2_w 0.1
      // 0d1: dstore 15
      // 0d3: iload 3
      // 0d4: ifeq 198
      // 0d7: aload 13
      // 0d9: goto 0e0
      // 0dc: invokestatic bvu$1.a (Loov;)Loov;
      // 0df: athrow
      // 0e0: iload 3
      // 0e1: ifne 10a
      // 0e4: invokeinterface zfz.r_y ()Le0x; 1
      // 0e9: invokevirtual e0x.p1r ()Lp3y;
      // 0ec: getstatic p3y.cei Lp3y;
      // 0ef: if_acmpne 11b
      // 0f2: goto 0f9
      // 0f5: invokestatic bvu$1.a (Loov;)Loov;
      // 0f8: athrow
      // 0f9: aload 5
      // 0fb: aload 12
      // 0fd: invokevirtual mew.eve ()Lmew;
      // 100: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 103: goto 10a
      // 106: invokestatic bvu$1.a (Loov;)Loov;
      // 109: athrow
      // 10a: iload 3
      // 10b: ifne 133
      // 10e: invokestatic y0y.al_ (Lzfz;)Z
      // 111: ifne 129
      // 114: goto 11b
      // 117: invokestatic bvu$1.a (Loov;)Loov;
      // 11a: athrow
      // 11b: aload 0
      // 11c: getfield bvu$1.zrk Lkea;
      // 11f: aload 1
      // 120: aload 2
      // 121: invokevirtual kea.r0k (Lsdf;Lerg;)Lerg;
      // 124: areturn
      // 125: invokestatic bvu$1.a (Loov;)Loov;
      // 128: athrow
      // 129: aload 5
      // 12b: aload 12
      // 12d: invokevirtual mew.eve ()Lmew;
      // 130: invokevirtual t9d.getBlockState (Lmew;)Lzfz;
      // 133: astore 17
      // 135: aload 17
      // 137: iload 3
      // 138: ifne 156
      // 13b: invokeinterface zfz.r_y ()Le0x; 1
      // 140: instanceof y0y
      // 143: ifeq 16e
      // 146: goto 14d
      // 149: invokestatic bvu$1.a (Loov;)Loov;
      // 14c: athrow
      // 14d: aload 17
      // 14f: goto 156
      // 152: invokestatic bvu$1.a (Loov;)Loov;
      // 155: athrow
      // 156: aload 17
      // 158: invokeinterface zfz.r_y ()Le0x; 1
      // 15d: checkcast y0y
      // 160: invokevirtual y0y.fvr ()Lxny;
      // 163: invokeinterface zfz.dil (Lxny;)Ljava/lang/Comparable; 2
      // 168: checkcast y0y$_zr
      // 16b: goto 171
      // 16e: getstatic y0y$_zr.ipg Ly0y$_zr;
      // 171: astore 18
      // 173: aload 4
      // 175: getstatic vt2.m3r Lvt2;
      // 178: if_acmpeq 193
      // 17b: aload 18
      // 17d: invokevirtual y0y$_zr.t1s ()Z
      // 180: ifeq 193
      // 183: goto 18a
      // 186: invokestatic bvu$1.a (Loov;)Loov;
      // 189: athrow
      // 18a: ldc2_w -0.4
      // 18d: dstore 15
      // 18f: iload 3
      // 190: ifeq 198
      // 193: ldc2_w -0.9
      // 196: dstore 15
      // 198: aload 5
      // 19a: dload 6
      // 19c: dload 8
      // 19e: dload 15
      // 1a0: dadd
      // 1a1: dload 10
      // 1a3: aload 2
      // 1a4: invokevirtual erg.gn1 ()Lu7m;
      // 1a7: checkcast bvu
      // 1aa: invokestatic bvu.l02 (Lbvu;)L_f3$c3d;
      // 1ad: invokestatic _f3._cl (Lt9d;DDDL_f3$c3d;)L_f3;
      // 1b0: astore 17
      // 1b2: aload 2
      // 1b3: invokevirtual erg.x4w ()Z
      // 1b6: iload 3
      // 1b7: ifne 1db
      // 1ba: ifeq 1d4
      // 1bd: goto 1c4
      // 1c0: invokestatic bvu$1.a (Loov;)Loov;
      // 1c3: athrow
      // 1c4: aload 17
      // 1c6: aload 2
      // 1c7: invokevirtual erg.zow ()Ljava/lang/String;
      // 1ca: invokevirtual _f3.x84 (Ljava/lang/String;)V
      // 1cd: goto 1d4
      // 1d0: invokestatic bvu$1.a (Loov;)Loov;
      // 1d3: athrow
      // 1d4: aload 5
      // 1d6: aload 17
      // 1d8: invokevirtual t9d.xzq (Li2h;)Z
      // 1db: pop
      // 1dc: aload 2
      // 1dd: bipush 1
      // 1de: invokevirtual erg.amj (I)Lerg;
      // 1e1: pop
      // 1e2: aload 2
      // 1e3: areturn
   }

   @Override
   public void d_l(sdf var1) {
      var1.acz().qca(1000, var1.taq(), 0);
   }

   private static oov a(oov var0) {
      return var0;
   }
}
